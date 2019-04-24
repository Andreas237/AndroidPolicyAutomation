// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;

public interface TrackSelection
{
	public static interface Factory
	{

		public transient abstract TrackSelection createTrackSelection(TrackGroup trackgroup, int ai[]);
	}


	public abstract boolean blacklist(int i, long l);

	public abstract void disable();

	public abstract void enable();

	public abstract int evaluateQueueSize(long l, List list);

	public abstract Format getFormat(int i);

	public abstract int getIndexInTrackGroup(int i);

	public abstract Format getSelectedFormat();

	public abstract int getSelectedIndex();

	public abstract int getSelectedIndexInTrackGroup();

	public abstract Object getSelectionData();

	public abstract int getSelectionReason();

	public abstract TrackGroup getTrackGroup();

	public abstract int indexOf(int i);

	public abstract int indexOf(Format format);

	public abstract int length();

	public abstract void onPlaybackSpeed(float f);

	public abstract void updateSelectedTrack(long l, long l1, long l2);
}
