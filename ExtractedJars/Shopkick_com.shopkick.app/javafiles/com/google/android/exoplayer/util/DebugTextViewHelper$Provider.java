// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import com.google.android.exoplayer.CodecCounters;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.upstream.BandwidthMeter;

// Referenced classes of package com.google.android.exoplayer.util:
//			DebugTextViewHelper

public static interface DebugTextViewHelper$Provider
{

	public abstract BandwidthMeter getBandwidthMeter();

	public abstract CodecCounters getCodecCounters();

	public abstract long getCurrentPosition();

	public abstract Format getFormat();
}
