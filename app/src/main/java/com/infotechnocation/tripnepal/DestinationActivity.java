package com.infotechnocation.tripnepal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.infotechnocation.tripnepal.entity.Destination;
import com.infotechnocation.tripnepal.entity.Heritage;
import com.infotechnocation.tripnepal.fragments.DestinationFragment;
import com.infotechnocation.tripnepal.fragments.HeritageFragment;
import com.infotechnocation.tripnepal.fragments.MapsFragment;
import com.infotechnocation.tripnepal.fragments.destinationMaps.BudhanilkanthaMapFragment;
import com.infotechnocation.tripnepal.fragments.destinationMaps.GorkhaDurbarMapFragment;
import com.infotechnocation.tripnepal.fragments.destinationMaps.KopanMonasteryMapFragment;
import com.infotechnocation.tripnepal.fragments.destinationMaps.PhewaLakeMapFragment;
import com.infotechnocation.tripnepal.fragments.destinationMaps.PoonHillMapFragment;
import com.infotechnocation.tripnepal.fragments.destinationMaps.SarangkotMapFragment;
import com.infotechnocation.tripnepal.fragments.destinationMaps.WorldPeaceStupaMapFragment;
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

public class DestinationActivity extends AppCompatActivity implements PassObjects{

    ImageView imageDisplay;
    TextView titleDisplay;
    TextView descDisplay;
    Button mapDisplay;

    public static int YES;

    private Destination mDestination;
    private Heritage mHeritage;
    private int position;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //mDestination = (Destination) getIntent().getExtras().getSerializable("destination");
        //mHeritage = (Heritage)getIntent().getExtras().getSerializable("heritage");
        position = getIntent().getExtras().getInt("thisposition");

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
                setTitle("Poon Hill");
                imageDisplay.setImageResource(R.drawable.poon_hill);
                titleDisplay.setText("Poon Hill");
                descDisplay.setText("Ghorepani Poon Hill Trekking, also popularly known as Annapurna Sunrise Trekking, or Annapurna Panorama Trekking, is one of the most popular and relatively easy treks that meander through the beautiful ethnic villages of Annapurna Region. Invigorating through some rhododendron forests, Poon Hill Trekking in Nepal will let you feel the Himalayan Panorama while providing you the opportunities to get close to the local Culture. However, Poon Hill Trek is obviously best known for the views from Poon Hill. Being popularly known as the Photographer's Paradise, you can capture some of the best snaps of impressive Annapurna and Dhaulagiri ranges. Poon Hill offers you the striking panorama of huge Himalayas including Annapurna South, Annapurna I, Annapurna II, III, and IV, Dhaulagiri, Lamjung Himal, Gangapurna, and Manaslu ranges among few others. The phenomenal sunrise from Poon Hill is just unmissable. A provocative glimpse of high mountains surrounding you can mesmerize anyone who's the part of this awesome trek.\n" +
                        "In addition to that, Poon Hill Trekking will also let you witness terraced slopes, warm villages, beautiful paddy fields, and wonderful culture and lifestyle of ethnic people like Gurungs, and Magars. Ghorepani and Ghandruk are two of the largest Gurung settlements in the Annapurna Region. There's a unique please of trekking in Annapurna foothillsalong with the charming settlements of ethnic communities of Nepal.\n");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new PoonHillMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 1:
                imageDisplay.setImageResource(R.drawable.sarangkot);
                titleDisplay.setText("Sarangkot");
                descDisplay.setText("Sarangkot is a village just above Pokhara, known as a one-night destination as most people just stop in to see the stunning sunrise over the Annapurna range and leave. Though that is where guides lead people astray as many show up here expecting just to come for one day and want to stay longer. Aside from chilling out and taking in amazing views of both the mountains and Phewa Lake on the other side, Sarangkot offers a nice glimpse into the peaceful, slow village life and more. Sarangkot is a village that is both close and far away. Convenient and rustic. It’s a nice hour or two hike from Pokhara Lakeside or a short drive, but it feels like it’s a world away with the quietude of nature and the peaceful vibe of the village. It used to be the first stop on the classic Annapurna circuit, but since a road was built a few years back linking Pokhara to a point closer to the park, the tourist numbers have dropped. The village retains its charm as there are a few guest houses but not too many, and the ones that are there blend into the landscape pretty well.\n" +
                        "\n" +
                        "The panoramic view of the Annapurna range from Sarangkot is one of the most easily accessible views of massive mountains (8,000m+) in the world. Sarangkot is billed in the guidebooks as a place to visit for a night and see the sunrise. Though the sunrise is spectacular (if you’re lucky enough to have a clear morning) it’s easy to stay more than a night.  Hospitable, amiable and cheerful, the people of Sarangkot make travellers feel at home. Stick around a bit and take part in their daily life: try carrying bales of hay on your back Nepali-style, carry some rocks for home building or do some gardening. The road linking it to adjacent villages doesn’t see many vehicles and is relatively flat, making it a fine road to go for a run or easy walk. Add to that the view, which is on the Pokhara valley side, makes for a nice change from the mountain view.\n" +
                        "With its gift of elevation, Sarangkot cranks the beauty up a notch. Viewed from above, the lake is an even more spectacular sight, the view of the mountains is perhaps the best view of that range from any other point since it provides an unobstructed panorama, and you have a full view of Pokhara Valley and surrounding mountains. The beauty of this place is like a tranquilizer that can transform stress to peace. And if you stick around awhile it’s easy to absorb the cheerful contentedness that the villagers readily display in their warm smiles.\n");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new SarangkotMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 2:
                imageDisplay.setImageResource(R.drawable.kopan_monastery);
                titleDisplay.setText("Kopan Monastery");
                descDisplay.setText("Kopan Monastery is a Tibetan Buddhist monastery near Boudhanath, on the outskirts of Kathmandu, Nepal. It is a member of the Foundation for the Preservation of the Mahayana Tradition (FPMT), an international network of Gelugpa dharma centers, and once served as its headquarters.\n" +
                        "The monastery was established by the FPMT's founders, Lamas Thubten Yeshe and Thubten Zopa Rinpoche, who bought the property from Nepal's royal astrologer in 1969. Its name comes from the name of the hill on which it was built.\n" +
                        "Kopan has become especially famous for teaching Buddhism to visiting Western foreigners. The first of what would become annual month-long (November–December) meditation courses was held in 1971. These courses generally combine traditional Lam Rim teachings with informal discussion, several periods of guided meditation, and a vegetarian diet.\n" +
                        "Kopan now encompasses two separate institutions: the monastery, atop Kopan Hill, and the nearby Khachoe Chakyil Ling Nunnery (known as the Kopan Nunnery). The nunnery was established in 1979 by Lama Yeshe to provide spiritual and practical education modeled on that received by the monks. In 2009 the nunnery began raising money to expand its housing and education capacity, which has grown from 4 to 400 in less than 35 years, using such sites as GoFundMe.\n" +
                        "\n" +
                        "Kopan Monastery has also recently become a popular recreational destination for Kathmandu residents and tourists. On Saturdays it regularly receives hundreds of visitors. The monastery is not open to the public on other days of the week.\n");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new KopanMonasteryMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 3:
                imageDisplay.setImageResource(R.drawable.phewa_lake);
                titleDisplay.setText("Phewa Lake");
                descDisplay.setText("Phewa Lake, Phewa Tal or Fewa Lake is a freshwater lake in Nepal located in the south of the Pokhara Valley that includes Pokhara city; parts of Sarangkot and Kaskikot. The lake is stream-fed but a dam regulates the water reserve, therefore, the lake is classified as semi-natural freshwater lake. It is the second largest lake in Nepal, the largest in Gandaki Zone followed by Begnas Lake. Phewa lake is located at an altitude of 742 m (2,434 ft) and covers an area of about 5.23 km2(2.0 sq mi). It has an average depth of about 8.6 m (28 ft) and a maximum depth of 24 m (79 ft). Maximum water capacity of the lake is approximately 43,000,000 cubic metres (35,000 acre•ft). The Annapurna range on the north is only about 28 km (linear distance) away from the lake. The lake is also famous for the reflection of mount Machhapuchhre and other mountain peaks of the Annapurna and Dhaulagiri ranges on its surface. The Taal Barahi Temple is situated on an island in the lake. \n" +
                        "Phewa lake and water sports is the main tourist attraction of Pokhara city and the north shore of the lake has developed into a tourist district, commonly called Lake-Side, with hotels, restaurants and bars catering to the tourists. The water from Phewa lake's outlet is used to generate electricity. The Phewa Power House is located about 1.5 km (0.93 mi) from the southern part of the Phewa lake. A part of the lake is also used as commercial caged fisheries.\n");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new PhewaLakeMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 4:
                imageDisplay.setImageResource(R.drawable.world_peace_stupa);
                titleDisplay.setText("World Peace Stupa");
                descDisplay.setText("Pokhara Shanti Stupa is a Buddhist pagoda-style monument on a hilltop in Ananda hill of the former Pumdi Bhumdi Village Development Committee, in the district of Kaski, Nepal[1] (now a part of the city of Pokhara).\n" +
                        "Shanti Stupa in Pokhara was built by Nipponzan-Myōhōji monk Morioka Sonin with local supporters under the guidance of Nichidatsu Fujii, a Buddhist monk and the founder of Nipponzan-Myōhōji. Shanti is a Sanskrit word meaning peace, also widely used in Nepali and Hindi language, and Shanti Stupa means Peace Pagoda. Shanti Stupa is the shrine build as symbol of peace. The spot situated at the height of 1100 meters on the Ananda Hill was chosen by Nichidatsu Fujii and he laid the foundation stone as well with the relics of Buddha on the hilltop on 12 September 1973.Nepal has two of the eighty peace pagodas in the world: Shanti Stupa in Lumbini, the birthplace of Buddha and Shanti Stupa in Pokhara. Shanti Stupa in Pokhara has also become a tourist attraction. It provides a panoramic view of the Annapurna range, Pokhara city and the Fewa Lake.\n" +
                        "Shanti Stupa in Pokhara is the first World Peace Pagoda in Nepal and seventy-first pagoda built by Nipponzan-Myōhōji in the world. The pagoda is 115 feet tall and 344 feet in diameter. The white pagoda has two tiers for tourist and religious people to circumambulate. Second tier displays the four statues of Buddha presented as a souvenirs from different countries: ‘Dharmacakra Mudra’ from Japan, ‘Bodh Gaya’ from Sri Lanka, ‘Kushinagar’ from Thailand and 'Lumbini’ from Nepal. Each statues represents the important events related to Buddha and named according to the place where it took place. Dharmachakra is placed below gajur (pinnacle) which signifies wheel of life, dharma and Buddha’s teaching. Top of the golden gajur holds the crystal stone from Sri Lanka which symbolizes intellect and grace. Dhamma hall with Buddha statue is located nearby the peace pagoda where Buddhist rituals take place daily and big ceremonies pujas are performed on the important dates according to Lunar calendar, such as on full moon day.\n");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new WorldPeaceStupaMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 5:
                imageDisplay.setImageResource(R.drawable.budhanilkantha);
                titleDisplay.setText("Budhanilkantha");
                descDisplay.setText("Budhanilkantha Temple, located in Budhanilkantha, Nepal,(literal: \"Old Blue Throat\") is a Hindu open air temple dedicated to Lord Vishnu. Budhanilkantha Temple is situated below the Shivapuri Hill at the northern end of the kathmandu valley  and can be identified by a large reclining statue of Lord Vishnu. The temple's main statue of Budhanilkantha is considered the largest stone carving in Nepal. Budhanilkantha temple, also known as the Narayanthan Temple, is situated in kathmandu. Though the temple is named Budhanilkantha, its name does not come from the Buddha; Budhanilkantha stands instead for “Old Blue Throat”. The statue symbolizes Lord Vishnu, who is regarded as one of the 'Trimurtis', along with Brahma and Shiva. ");
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new BudhanilkanthaMapFragment()).addToBackStack(null).commit();
                    }
                });
                break;

            case 6:
                imageDisplay.setImageResource(R.drawable.gorkhadurbar);
                titleDisplay.setText("Gorkha Durbar");
                descDisplay.setText(("As the birthplace of Prithvi Narayan Shah, the Durbar has huge significance for Nepalis. The great Shah was born here around 1723, when Gorkha was a minor feudal kingdom. Upon gaining the throne, Prithvi Narayan worked his way around the Kathmandu Valley, subduing rival kingdoms and creating an empire that extended far into India and Tibet. The Durbar is an important religious site, so leather shoes and belts etc should be removed. Most pilgrims enter through the western gate, emerging on an open terrace in front of the exquisite Kalika Temple, a psychedelic 17th-century fantasy of peacocks, demons and serpents, carved into every available inch of timber. Only Brahmin priests and the king can enter the temple, but non-Hindus are permitted to observe from the terrace."));
                mapDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getSupportFragmentManager();
                        fm.beginTransaction().replace(R.id.display_map, new GorkhaDurbarMapFragment()).addToBackStack(null).commit();
                    }
                });

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
        YES = 0;
        return true;
    }



}