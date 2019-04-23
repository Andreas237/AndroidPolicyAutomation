// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;
import java.io.IOException;

public interface DashTrackSelector
{
	public static interface Output
	{

		public abstract void adaptiveTrack(MediaPresentationDescription mediapresentationdescription, int i, int j, int ai[]);

		public abstract void fixedTrack(MediaPresentationDescription mediapresentationdescription, int i, int j, int k);
	}


	public abstract void selectTracks(MediaPresentationDescription mediapresentationdescription, int i, Output output)
		throws IOException;
}
