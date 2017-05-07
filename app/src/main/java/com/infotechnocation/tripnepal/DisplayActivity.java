package com.infotechnocation.tripnepal;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.infotechnocation.tripnepal.entity.Destination;
import com.infotechnocation.tripnepal.entity.Heritage;
import com.infotechnocation.tripnepal.fragments.heritageMaps.BhaktapurDSMapFragment;
import com.infotechnocation.tripnepal.fragments.heritageMaps.BoudhanathMapFragment;
import com.infotechnocation.tripnepal.fragments.heritageMaps.ChanguNarayanMapFragment;
import com.infotechnocation.tripnepal.fragments.heritageMaps.ChitwanNPMapFragment;
import com.infotechnocation.tripnepal.fragments.heritageMaps.KathmanduDBMapFragment;
import com.infotechnocation.tripnepal.fragments.heritageMaps.LumbiniMapFragment;
import com.infotechnocation.tripnepal.fragments.heritageMaps.PashupatinathMapFragment;
import com.infotechnocation.tripnepal.fragments.heritageMaps.PatanDBMapFragment;
import com.infotechnocation.tripnepal.fragments.heritageMaps.SagarmathaNPMapFragment;
import com.infotechnocation.tripnepal.fragments.heritageMaps.SwayambhunathMapFragment;
import com.infotechnocation.tripnepal.interfaces.PassObjects;

/**
 * Created by Prajin Bajracharya on 2/6/2017.
 */

public class DisplayActivity extends AppCompatActivity implements PassObjects{

    ImageView imageDisplay;
    TextView titleDisplay;
    TextView descDisplay;
    Button mapDisplay;

    private Destination mDestination;
    private Heritage mHeritage;
    private int position;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //mDestination = (Destination) getIntent().getExtras().getSerializable("destination");
        //mHeritage = (Heritage)getIntent().getExtras().getSerializable("heritage");
        position = getIntent().getExtras().getInt("position");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageDisplay = (ImageView)findViewById(R.id.display_img);
        titleDisplay = (TextView)findViewById(R.id.display_txt);
        descDisplay = (TextView)findViewById(R.id.display_descp);
        mapDisplay = (Button)findViewById(R.id.view_in_map);

        //mapDisplay.setOnClickListener(this);

        //titleDisplay.setText(mDestination.getTitleDest());
        //descDisplay.setText(mDestination.getDescDest());

        switch (position){
            case 0:
                setTitle("Boudhanath");
                imageDisplay.setImageResource(R.drawable.boudhanath);
                titleDisplay.setText("Boudhanath");
                descDisplay.setText("Boudhanath Stupa (or Bodnath Stupa) is the largest stupa in Nepal and the holiest Tibetan Buddhist temple outside Tibet. It is the center of Tibetan culture in Kathmandu and rich in Buddhist symbolism. The stupa is located in the town of Boudha, on the eastern outskirts of Kathmandu.");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new BoudhanathMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 1:
                imageDisplay.setImageResource(R.drawable.patandurbarsquare);
                titleDisplay.setText("Patan DurbarSquare");
                descDisplay.setText("Patan Durbar Square is situated at the centre of the city of Lalitpur in Nepal. It is one of the three Durbar Squares in the Kathmandu Valley, all of which are UNESCO World Heritage Sites. One of its attraction is the ancient royal palace where the Malla Kings of Lalitpur resided.The Durbar Square is a marvel of Newa architecture. The Square floor is tiled with red bricks. There are many temples and idols in the area. The main temples are aligned opposite of the western face of the palace. The entrance of the temples faces east, towards the palace. There is also a bell situated in the alignment beside the main temples. The Square also holds old Newari residential houses. There are various other temples and structures in and around Patan Durbar Square built by the Newa People. Bodnath Stupa looks like a giant mandala, or diagram of the Buddhist cosmos. And as in all Tibetan mandalas, four of the Dhyani Buddhas mark the cardinal points, with the fifth, Vairocana, enshrined in the center (in the white hemisphere of the stupa). The five Buddhas also personify the five elements (earth, water, fire, air and ether), which are represented in the stupa's architecture.");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new PatanDBMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 2:
                imageDisplay.setImageResource(R.drawable.swayambhu);
                titleDisplay.setText("Swayambhunath");
                descDisplay.setText("Swayambhu is an ancient religious architecture atop a hill in the Kathmandu Valley, west of Kathmandu city. The Tibetan name for the site means 'Sublime Trees' (Wylie: Phags.pa Shing.kun), for the many varieties of trees found on the hill. However, Shing.kun may be a corruption of the local Nepal Bhasa name for the complex, Singgu, meaning 'self-sprung'. For the Buddhist Newars in whose mythological history and origin myth as well as day-to-day religious practice, Swayambhu occupies a central position, it is probably the most sacred among Buddhist pilgrimage sites. For Tibetans and followers of Tibetan Buddhism, it is second only to Boudha.");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new SwayambhunathMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 3:
                imageDisplay.setImageResource(R.drawable.bhaktapurdurbarsquare);
                titleDisplay.setText("Bhaktapur Durbar Square");
                descDisplay.setText("Bhaktapur literally translates to Place of devotees. Also known as Bhadgaon or Khwopa ), it is an ancient Newar city in the east corner of the Kathmandu Valley, Nepal, about 8 miles (13 km) from the capital city, Kathmandu. It is located in Bhaktapur District in the Bagmati Zone. Bhaktapur was the largest of the three Newar  kingdoms of the Kathmandu Valley, and was the capital of Nepal during the great 'Malla Kingdom' until the second half of the 15th century.");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new BhaktapurDSMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 4:
                imageDisplay.setImageResource(R.drawable.ktmdurbar);
                titleDisplay.setText("Kathmandu Durbar Square");
                descDisplay.setText("The Kathmandu Durbar Square held the palaces of the Malla and Shah kings who ruled over the city. Along with these palaces, the square surrounds quadrangles, revealing courtyards and temples. It is known as Hanuman Dhoka Durbar Square, a name derived from a statue of Hanuman, the monkey devotee of Lord Ram, at the entrance of the palace.");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new KathmanduDBMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 5:
                imageDisplay.setImageResource(R.drawable.pashupatinath);
                titleDisplay.setText("Pashupatinath");
                descDisplay.setText("Hindu temple of god Shiva one of the important god of Hindus dedicated to Pashupatinath is located on the banks of the Bagmati River. Though Nepal is an officially secular state, its population is predominantly Hindu, and Lord Shree Pashupatinath is revered as a national deity. The Pashupatinath Temple, located at the bank of the river Bagmati, is considered the most sacred place in Nepal. The mythology hold that Lord Pashupatinath started living in Nepal in the form of a deer, when he saw the Kathmandu Valley and was overwhelmed by its beauty.");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new PashupatinathMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 6:
                imageDisplay.setImageResource(R.drawable.changu_narayan);
                titleDisplay.setText("Changu Narayan");
                descDisplay.setText("The ancient Hindu temple of Changu Narayan is located on a high hilltop that is also known as Changu or Dolagiri. The temple was surrounded by forest with champak tree and a small village, known as Changu Village. The temple is located in Changunarayan VDC of Bhaktapur District, Nepal. This hill is about 8 miles or 22 km east of Kathmandu and a few miles north of Bhaktapur. The Manahara River flows beside the hill. This shrine is dedicated to Lord Visnu and held in especial reverence by the Hindu people. This temple is considered as the oldest temple in the history of Nepal. It is an interesting place to be in.");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new ChanguNarayanMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 7:
                imageDisplay.setImageResource(R.drawable.lumbini);
                titleDisplay.setText("Lumbini");
                descDisplay.setText("The present-day Lumbini historic site is 4.8 km (3 mi) in length and 1.6 km (1.0 mi) in width. The holy site of Lumbini is bordered by a large monastic zone in which only monasteries can be built, no shops, hotels or restaurants. It is separated into an eastern and western monastic zone, the eastern having the Theravadin monasteries, the western having Mahayana and Vajrayana monasteries.");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new LumbiniMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 8:
                imageDisplay.setImageResource(R.drawable.chitwannationalpark);
                titleDisplay.setText("Chitwan National Park");
                descDisplay.setText("Chitwan National Park is the first National Park of Nepal. It was established in 1973 and granted the status of a World Heritage Site in 1984. It covers an area of 932 km2 (360 sq mi) and is located in the subtropical Inner Terai lowlands of south-central Nepal in the districts of Nawalparasi, Parsa, Chitwan and Makwanpur. In altitude it ranges from about 100 m (330 ft) in the river valleys to 815 m (2,674 ft) in the Churia Hills.\n" +
                        "Chitwan National Park is one of Nepal’s most popular tourist destinations. In 1989 more than 31,000 people visited the park, and ten years later already more than 77,000.\n" +
                        "There are two main entrances to visit the Chitwan National Park: the tourist town of Sauraha in the east and the tranquil Tharu settlement of Meghauli Village in the west.\n" +
                        "Sauraha is a well-known spot for package tourists and offers a choice of hundreds of hotels, lodges, restaurants and agencies. Meghauli has recently opened up as a tourist destination with the creation of the Tharu Homestay Program to promote the village tourism in the area, offering a more authentic and intimate jungle experience. It now has also a couple of budget guest houses and seven jungle lodges to cater to all budgets.\n" +
                        "Both destinations can be reached from Narayangarh in less than two hours.");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new ChitwanNPMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 9:
                imageDisplay.setImageResource(R.drawable.sagarmathanationalpark);
                titleDisplay.setText("Sagarmatha National Park");
                descDisplay.setText("The Sagarmatha National Park is a protected area in the Himalayas of eastern Nepal that is dominated by Mount Everest. It encompasses an area of 1,148 km2 (443 sq mi) in the Solukhumbu District and ranges in elevation from 2,845 to 8,848 m (9,334 to 29,029 ft) to at the summit of Mount Everest. In the north, it shares the international border with the Qomolangma National Nature Preserve of Tibet and extends to the Dudh Kosi river in the south. Adjacent to the east is the Makalu Barun National Park. The Sagarmatha National Park was established in 1976. In 1979, it became the country's first national park that was inscribed as a Natural World Heritage Site.\n" +
                        "Sagarmāthā is a Nepali word derived from सगर् sagar meaning \"sky\" and माथा māthā meaning \"head\".\n" +
                        "The protected area has been identified as an Important Bird Area by BirdLife International and is included in the Sacred Himalayan Landscape.\n");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new SagarmathaNPMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            default:
        }
    }

    @Override
    public void passToDisplay(Destination mDestination) {
        this.mDestination = mDestination;
    }


    public void setDestination(Destination mDestination){
        this.mDestination = mDestination;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

}
