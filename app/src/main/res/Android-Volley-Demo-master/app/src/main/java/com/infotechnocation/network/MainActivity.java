package com.infotechnocation.network;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.GsonBuilder;
import com.infotechnocation.network.entity.ContactInfo;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Button btnConnect;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConnect = (Button)findViewById(R.id.btnConnect);

        btnConnect.setOnClickListener(onClickListener);



    }

    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(isNetworkConnected()){
                connectWebService();
            }else{
                Toast.makeText(MainActivity.this, "No internet connection", Toast.LENGTH_SHORT).show();
            }

        }
    };

    public void connectWebService(){
        JSONObject jObj = new JSONObject();
        try {
            jObj.put("username","krish@gmail.com");
            jObj.put("pasword","wert");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest jOR = new JsonObjectRequest(Request.Method.POST, "http://jsonstub.com/login", jObj, onSuccess, onError){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {

                HashMap<String,String> map=new HashMap<>();
                map.put("Content-Type","application/json");
                map.put("JsonStub-User-Key","6af70958-2fa2-478b-8087-1230ece70bac");
                map.put("JsonStub-Project-Key","4e812bb8-0352-493d-92bc-84360e29cfcf");
                return map;
            }
        };

        Volley.newRequestQueue(this).add(jOR);

        pd = new ProgressDialog(this);
        pd.setMessage("connecting.....");
        pd.show();
    }

    private Response.Listener<JSONObject> onSuccess = new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {
            Log.e("test",response.toString());


            if(pd!= null){
                pd.dismiss();
            }

            //ContactInfo mContactInfo = new GsonBuilder().create().fromJson(response.toString(), ContactInfo.class);

            Toast.makeText(MainActivity.this,"test successful " + response.toString(),Toast.LENGTH_SHORT).show();
        }
    };

    private  Response.ErrorListener onError = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Log.e("error", "error");
            Toast.makeText(MainActivity.this,"test error ",Toast.LENGTH_SHORT).show();

            if(pd!= null){
                pd.dismiss();
            }
        }
    };

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

    }

