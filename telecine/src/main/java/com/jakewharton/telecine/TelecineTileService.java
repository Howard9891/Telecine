package com.jakewharton.telecine;

import android.content.Intent;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

public final class TelecineTileService extends TileService {
  @Override public void onClick() {
    startActivity(new Intent(this, TelecineShortcutLaunchActivity.class));
  }

  @Override public void onStartListening() {
    Tile tile = getQsTile();
    tile.setState(Tile.STATE_ACTIVE);
    tile.updateTile();
  }
}
