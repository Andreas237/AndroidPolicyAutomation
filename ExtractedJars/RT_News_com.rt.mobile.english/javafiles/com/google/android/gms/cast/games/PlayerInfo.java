// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.games;

import org.json.JSONObject;

public interface PlayerInfo
{

	public abstract JSONObject getPlayerData();

	public abstract String getPlayerId();

	public abstract int getPlayerState();

	public abstract boolean isConnected();

	public abstract boolean isControllable();
}
