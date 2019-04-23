// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.TimeRange;

// Referenced classes of package com.google.android.exoplayer.dash:
//			DashChunkSource

public static interface DashChunkSource$EventListener
{

	public abstract void onAvailableRangeChanged(int i, TimeRange timerange);
}
