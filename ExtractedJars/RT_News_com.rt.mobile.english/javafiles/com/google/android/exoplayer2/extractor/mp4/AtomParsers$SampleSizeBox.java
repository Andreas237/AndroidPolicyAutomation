// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;


// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			AtomParsers

private static interface AtomParsers$SampleSizeBox
{

	public abstract int getSampleCount();

	public abstract boolean isFixedSampleSize();

	public abstract int readNextSampleSize();
}
