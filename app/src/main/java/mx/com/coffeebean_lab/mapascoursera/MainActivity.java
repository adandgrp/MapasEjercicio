package mx.com.coffeebean_lab.mapascoursera;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void gopark(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("latitud", "19.497937937800916");
        i.putExtra("longitud", "-99.20899447088618");
        startActivity(i);
    }

    public void gomall(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("latitud", "19.50290480056134");
        i.putExtra("longitud", "-99.20303480175176");
        startActivity(i);
    }
    public void gosubway(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("latitud", "19.505574680340366");
        i.putExtra("longitud", "-99.20076028850713");
        startActivity(i);
    }
    public void gotown(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("latitud", "19.480694547892874");
        i.putExtra("longitud", "-99.18629781749883");
        startActivity(i);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
