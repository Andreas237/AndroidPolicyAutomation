// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			FragmentedMp4Extractor, TrackFragment, Track, DefaultSampleValues

private static final class FragmentedMp4Extractor$TrackBundle
{

	public void init(Track track1, DefaultSampleValues defaultsamplevalues)
	{
		track = (Track)Assertions.checkNotNull(((Object) (track1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
	//    3    5:checkcast       #40  <Class Track>
	//    4    8:putfield        #42  <Field Track track>
		defaultSampleValues = (DefaultSampleValues)Assertions.checkNotNull(((Object) (defaultsamplevalues)));
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
	//    8   16:checkcast       #44  <Class DefaultSampleValues>
	//    9   19:putfield        #46  <Field DefaultSampleValues defaultSampleValues>
		output.format(track1.mediaFormat);
	//   10   22:aload_0         
	//   11   23:getfield        #29  <Field TrackOutput output>
	//   12   26:aload_1         
	//   13   27:getfield        #50  <Field com.google.android.exoplayer.MediaFormat Track.mediaFormat>
	//   14   30:invokeinterface #56  <Method void TrackOutput.format(com.google.android.exoplayer.MediaFormat)>
		reset();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #59  <Method void reset()>
	//   17   39:return          
	}

	public void reset()
	{
		fragment.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field TrackFragment fragment>
	//    2    4:invokevirtual   #60  <Method void TrackFragment.reset()>
		currentSampleIndex = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #62  <Field int currentSampleIndex>
	//    6   12:return          
	}

	public int currentSampleIndex;
	public DefaultSampleValues defaultSampleValues;
	public final TrackFragment fragment = new TrackFragment();
	public final TrackOutput output;
	public Track track;

	public FragmentedMp4Extractor$TrackBundle(TrackOutput trackoutput)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class TrackFragment>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void TrackFragment()>
	//    6   12:putfield        #27  <Field TrackFragment fragment>
		output = trackoutput;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #29  <Field TrackOutput output>
	//   10   20:return          
	}
}
