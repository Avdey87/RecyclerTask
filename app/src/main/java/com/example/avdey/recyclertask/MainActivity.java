package com.example.avdey.recyclertask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.avdey.recyclertask.mock.AdapterMocks;
import com.example.avdey.recyclertask.mock.ImageMock;
import com.example.avdey.recyclertask.mock.Mock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, RecyclerFragment.newInstance())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Mock mock = new Mock("Number",87);
        switch (item.getItemId()) {
            case R.id.add_number:
                RecyclerFragment.addNumber(mock);
                getSupportFragmentManager().findFragmentByTag("Test");
                Toast.makeText(this, "Add Number", Toast.LENGTH_LONG).show();
                break;
            case R.id.add_image:

                Toast.makeText(this, "Add image", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
