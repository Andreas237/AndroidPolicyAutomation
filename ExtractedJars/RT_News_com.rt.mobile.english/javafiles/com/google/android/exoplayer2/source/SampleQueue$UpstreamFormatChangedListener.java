// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SampleQueue

public static interface SampleQueue$UpstreamFormatChangedListener
{

	public abstract void onUpstreamFormatChanged(Format format);
}
