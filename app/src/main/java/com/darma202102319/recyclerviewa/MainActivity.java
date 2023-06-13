package com.darma202102319.recyclerviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Albania");
        nm.setDekripsi("Albania adalah sebuah negara yang terletak di wilayah Balkan, di bagian tenggara Eropa. Negara ini berbatasan dengan Montenegro di sebelah utara, Kosovo di sebelah timur laut, Makedonia Utara di sebelah timur, dan Yunani di sebelah selatan. Di sebelah barat, Albania memiliki garis pantai yang panjang di Laut Adriatik.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Albania-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Hungary");
        nm.setDekripsi("Hungary adalah sebuah negara yang terletak di Eropa Tengah. Negara ini berbatasan dengan Austria di sebelah barat, Slovakia di sebelah utara, Ukraina di sebelah timur laut, Romania di sebelah timur, Serbia di sebelah selatan, dan Kroasia di sebelah barat daya. Ibu kota Hungary adalah Budapest, yang juga merupakan kota terbesar dan paling terkenal di negara ini.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Hungary-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Slovenia");
        nm.setDekripsi("Slovenia adalah sebuah negara kecil yang terletak di Eropa Tengah. Negara ini berbatasan dengan Italia di sebelah barat, Austria di sebelah utara, Hungaria di sebelah timur, dan Kroasia di sebelah selatan. Slovenia memiliki garis pantai yang pendek di Laut Adriatik, membentang sepanjang sekitar 46 kilometer.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Slovenia-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Belgium");
        nm.setDekripsi("Belgia adalah sebuah negara yang terletak di Eropa Barat. Negara ini berbatasan dengan Prancis di sebelah barat, Belanda di sebelah utara, Jerman di sebelah timur, dan Luksemburg di sebelah tenggara. Belgia juga memiliki akses ke Laut Utara di sebelah barat lautnya. Ibu kota Belgia adalah Brussels.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Belgium-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Canada");
        nm.setDekripsi("Kanada adalah negara terbesar di Amerika Utara dan terletak di sebelah utara Amerika Serikat. Dengan luas wilayah sekitar 9,98 juta kilometer persegi, Kanada memiliki keanekaragaman lanskap yang luar biasa. Negara ini berbatasan dengan Samudra Atlantik di sebelah timur, Samudra Pasifik di sebelah barat, dan Samudra Arktik di sebelah utara.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Canada-Flag-icon.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);
    }
}