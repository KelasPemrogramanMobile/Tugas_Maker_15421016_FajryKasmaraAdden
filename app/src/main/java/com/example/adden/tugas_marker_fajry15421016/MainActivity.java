package com.example.adden.tugas_marker_fajry15421016;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

import static com.example.adden.tugas_marker_fajry15421016.R.id.maps;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MapView map =(MapView) findViewById(R.id.maps);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);
        GeoPoint startPoint = new GeoPoint(-5.397755,105.204377);
        IMapController mapController = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint);

        Marker startMarker =new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().getDrawable(R.drawable.rumah));
        startMarker.setTitle("Rumah Ku");

        startPoint = new GeoPoint(-5.3790266, 105.2515494);
        mapController = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint);

        startMarker = new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().getDrawable(R.drawable.icon));
        startMarker.setTitle("Universitas Bandar Lampung");

        startPoint = new GeoPoint(-5.3751038,105.2455838);
        mapController = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint);

        startMarker = new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().getDrawable(R.drawable.icon));
        startMarker.setTitle("Pascasarjana Universitas Bandar Lampung");

        startPoint = new GeoPoint(-5.372657, 105.240457);
        mapController = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint);

        startMarker = new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().getDrawable(R.drawable.icon));
        startMarker.setTitle("Museum Lampung");

        startPoint = new GeoPoint(-5.382382, 105.259201);
        mapController = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint);

        startMarker = new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().getDrawable(R.drawable.icon));
        startMarker.setTitle("Mall Bumi Kedaton");

    }
}