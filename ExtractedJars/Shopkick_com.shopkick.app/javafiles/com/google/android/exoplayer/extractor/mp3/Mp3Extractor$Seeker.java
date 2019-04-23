// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp3;

import com.google.android.exoplayer.extractor.SeekMap;

// Referenced classes of package com.google.android.exoplayer.extractor.mp3:
//			Mp3Extractor

static interface Mp3Extractor$Seeker
	extends SeekMap
{

	public abstract long getDurationUs();

	public abstract long getTimeUs(long l);
}
