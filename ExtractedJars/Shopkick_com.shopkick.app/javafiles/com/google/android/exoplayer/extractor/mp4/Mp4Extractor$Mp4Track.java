// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.extractor.TrackOutput;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			Mp4Extractor, TrackSampleTable, Track

private static final class Mp4Extractor$Mp4Track
{

	public int sampleIndex;
	public final TrackSampleTable sampleTable;
	public final Track track;
	public final TrackOutput trackOutput;

	public Mp4Extractor$Mp4Track(Track track1, TrackSampleTable tracksampletable, TrackOutput trackoutput)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		track = track1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Track track>
		sampleTable = tracksampletable;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field TrackSampleTable sampleTable>
		trackOutput = trackoutput;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field TrackOutput trackOutput>
	//   11   19:return          
	}
}
