// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SingleSampleMediaSource

public static interface SingleSampleMediaSource$EventListener
{

	public abstract void onLoadError(int i, IOException ioexception);
}
