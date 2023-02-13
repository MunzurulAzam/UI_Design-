package munzurul.azam.ui_design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.white));


        ViewPager viewPager = findViewById(R.id.view_pager);
        List<OnboardingScreen> onboardingScreens = new ArrayList<>();
        onboardingScreens.add(new OnboardingScreen(R.layout.wellcome));
        onboardingScreens.add(new OnboardingScreen(R.layout.get_fast_delivery));
        onboardingScreens.add(new OnboardingScreen(R.layout.bestquality));

        OnboardingAdapter adapter = new OnboardingAdapter(this, onboardingScreens);

        viewPager.setAdapter(adapter);
//        Intent intent = new Intent(this, HomePage.class);
//        startActivity(intent);
    }

    public void skip (View view){

        startActivity(new Intent(this,HomePage.class) );
    }
}