// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import java.util.Comparator;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsChunkSource, Variant

class HlsChunkSource$2
	implements Comparator
{

	public int compare(Variant variant, Variant variant1)
	{
		return formatComparator.compare(((Object) (variant.format)), ((Object) (variant1.format)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Comparator formatComparator>
	//    2    4:aload_1         
	//    3    5:getfield        #38  <Field com.google.android.exoplayer.chunk.Format Variant.format>
	//    4    8:aload_2         
	//    5    9:getfield        #38  <Field com.google.android.exoplayer.chunk.Format Variant.format>
	//    6   12:invokeinterface #41  <Method int Comparator.compare(Object, Object)>
	//    7   17:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Variant)obj, (Variant)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #34  <Class Variant>
	//    3    5:aload_2         
	//    4    6:checkcast       #34  <Class Variant>
	//    5    9:invokevirtual   #43  <Method int compare(Variant, Variant)>
	//    6   12:ireturn         
	}

	private final Comparator formatComparator = new com.google.android.exoplayer.chunk.BandwidthComparator();
	final HlsChunkSource this$0;

	HlsChunkSource$2()
	{
		this$0 = HlsChunkSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field HlsChunkSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #26  <Class com.google.android.exoplayer.chunk.Format$DecreasingBandwidthComparator>
	//    7   13:dup             
	//    8   14:invokespecial   #27  <Method void com.google.android.exoplayer.chunk.Format$DecreasingBandwidthComparator()>
	//    9   17:putfield        #29  <Field Comparator formatComparator>
	//   10   20:return          
	}
}
