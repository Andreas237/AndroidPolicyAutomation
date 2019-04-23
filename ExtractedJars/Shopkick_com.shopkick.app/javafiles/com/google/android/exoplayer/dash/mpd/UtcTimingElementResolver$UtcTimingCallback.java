// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			UtcTimingElementResolver, UtcTimingElement

public static interface UtcTimingElementResolver$UtcTimingCallback
{

	public abstract void onTimestampError(UtcTimingElement utctimingelement, IOException ioexception);

	public abstract void onTimestampResolved(UtcTimingElement utctimingelement, long l);
}
