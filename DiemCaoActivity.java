package tdc.edu.vn.ailatrieuphu_n7_project.activity;

import android.app.ListActivity;
import android.os.Bundle;

import tdc.edu.vn.ailatrieuphu_n7_project.App;
import tdc.edu.vn.ailatrieuphu_n7_project.R;
import tdc.edu.vn.ailatrieuphu_n7_project.adapter.DiemCaoAdapter;
import tdc.edu.vn.ailatrieuphu_n7_project.manager.DatabaseManager;

public class DiemCaoActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_diemcao);

        DatabaseManager databaseManager = new DatabaseManager(App.getContext());
        getListView().setAdapter(new DiemCaoAdapter(databaseManager.getHighScore()));
    }

    @Override
    protected void onPause() {
        super.onPause();
        App.getMusicPlayer().pauseBgMusic();
    }

    @Override
    protected void onResume() {
        super.onResume();
        App.getMusicPlayer().resumeBgMusic();

    }

}
