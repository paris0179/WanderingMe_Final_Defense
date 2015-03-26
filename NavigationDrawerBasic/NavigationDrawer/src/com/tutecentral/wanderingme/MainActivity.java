package com.tutecentral.wanderingme;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.tutecentral.navigationdrawer.R;

public class MainActivity extends Activity {

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;

	private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	CustomDrawerAdapter adapter;
    ActionBar ab;

	List<DrawerItem> dataList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		// Initializing
		dataList = new ArrayList<DrawerItem>();
		mTitle = mDrawerTitle = getTitle();
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.left_drawer);

		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);

		// Add Drawer Item to dataList
		dataList.add(new DrawerItem("Home", R.drawable.house));
		dataList.add(new DrawerItem("Profile", R.drawable.myprofile));
		dataList.add(new DrawerItem("My Photos", R.drawable.photos));
		dataList.add(new DrawerItem("My Friends", R.drawable.societies));
		dataList.add(new DrawerItem("My Events", R.drawable.events));
		dataList.add(new DrawerItem("My Places", R.drawable.places));
		//dataList.add(new DrawerItem("My Trophies", R.drawable.trophies));
		dataList.add(new DrawerItem("Camera", R.drawable.camera));
	    //dataList.add(new DrawerItem("What's Hot?", R.drawable.hot));
		dataList.add(new DrawerItem("About", R.drawable.about));
		dataList.add(new DrawerItem("Settings", R.drawable.settings));
        dataList.add(new DrawerItem("Logout",R.drawable.logout));

		adapter = new CustomDrawerAdapter(this, R.layout.custom_drawer_item,
				dataList);

		mDrawerList.setAdapter(adapter);

		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {

            //callbacks - function within a a function
			public void onDrawerClosed(View view) {
				getActionBar().setTitle(mTitle);
				invalidateOptionsMenu(); // creates call to
											// onPrepareOptionsMenu()
			}

			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle(mDrawerTitle);
				invalidateOptionsMenu(); // creates call to
											// onPrepareOptionsMenu()
			}
		};

		mDrawerLayout.setDrawerListener(mDrawerToggle);

		if (savedInstanceState == null) {
			SelectItem(0);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    //@Override
    //public boolean onPrepareOptionsMenu(){}

	public void SelectItem(int possition) {

		Fragment fragment = null;
		Bundle args = new Bundle();
		switch (possition) {
		case 0:
			fragment = new FragmentOne();
			break;
		case 1: //profile//
			fragment = new FragmentTwo();
			args.putString(FragmentTwo.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentTwo.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		case 2: //my photos//
			fragment = new FragmentThree();
			args.putString(FragmentThree.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentThree.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		case 3: //my friends before my events//
			fragment = new FragmentFour();

			break;
		case 4: //my events//
			fragment = new FragmentFive();
			args.putString(FragmentTwo.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentTwo.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		case 5: //my places//
			fragment = new FragmentSix();
			args.putString(FragmentThree.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentThree.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		//case 6: //my trophies//
			////fragment = new FragmentSeven();

			//break;
		case 6: //my camera//
            open();
			fragment = new FragmentEight();
			args.putString(FragmentTwo.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentTwo.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		////case 8: //what's hot?//
			//fragment = new FragmentNine();
			//args.putString(FragmentThree.ITEM_NAME, dataList.get(possition)
			        ////.getItemName());
			//args.putInt(FragmentThree.IMAGE_RESOURCE_ID, dataList.get(possition)
					//.getImgResID());
			//break;
		case 7: //About//
			fragment = new FragmentTen();

			break;
		case 8://Settings//
			fragment = new FragmentEleven();
			args.putString(FragmentTwo.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentTwo.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		case 9: //logout//
			fragment = new FragmentTwelve();
			args.putString(FragmentThree.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentThree.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		//case 12: //logout//
			//fragment = new FragmentThirteen();
			//args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
					//.getItemName());
			//args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
					//.getImgResID());
			//break;
		default:
			break;
		}

		fragment.setArguments(args);
		FragmentManager frgManager = getFragmentManager();
		frgManager.beginTransaction().replace(R.id.content_frame, fragment)
				.commit();

		mDrawerList.setItemChecked(possition, true);
		setTitle(dataList.get(possition).getItemName());
		mDrawerLayout.closeDrawer(mDrawerList);

	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getActionBar().setTitle(mTitle);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggles
		mDrawerToggle.onConfigurationChanged(newConfig);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// The action bar home/up action should open or close the drawer.
		// ActionBarDrawerToggle will take care of this.
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}

		return false;
	}

	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			SelectItem(position);

		}
	}

    public void open(){
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);
    }

    public void openMap(){
        String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 0, 0);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }


    public void editProfile(View v){
        setContentView(R.layout.editprofile);
        ab = getActionBar();
        ab.hide();
    }

    public void updateProf(View v){
        Intent I = new Intent(this,MainActivity.class);
        startActivity(I);

    }


    public void openPhoto1(View v){
        setContentView(R.layout.photo1);
        ab = getActionBar();
        ab.hide();

    }


    public void openPhoto2(View v){
        setContentView(R.layout.photo2);
        ab = getActionBar();
        ab.hide();

    }
    public void openPhoto3(View v){
        setContentView(R.layout.photo3);
        ab = getActionBar();
        ab.hide();

    }

    public void backtoPhotos(View v){
        Intent I = new Intent(this,MainActivity.class);
        startActivity(I);

    }

    public void openEvent(View v){
        Intent I = new Intent(this,MainActivity.class);
        startActivity(I);

    }

    public void openSupport(View v){
        setContentView(R.layout.support);
        ab = getActionBar();
        ab.hide();

    }


    public void openHelp(View v){
        setContentView(R.layout.helpcenter);
        ab = getActionBar();
        ab.hide();

    }

    public void openTerms(View v){
        setContentView(R.layout.terms);
        ab = getActionBar();
        ab.hide();

    }

    public void openReport(View v){
        setContentView(R.layout.report);
        ab = getActionBar();
        ab.hide();

    }

    public void openAbout(View v){
        setContentView(R.layout.about);
        ab = getActionBar();
        ab.hide();

    }

    public void CreateEvent(View v){
        setContentView(R.layout.events_list);
        ab = getActionBar();
        ab.show();
    }



}
