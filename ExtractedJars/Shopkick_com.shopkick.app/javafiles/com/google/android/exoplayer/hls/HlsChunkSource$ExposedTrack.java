// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;


// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsChunkSource, Variant

private static final class HlsChunkSource$ExposedTrack
{

	private final int adaptiveMaxHeight;
	private final int adaptiveMaxWidth;
	private final int defaultVariantIndex;
	private final Variant variants[];


/*
	static Variant[] access$000(HlsChunkSource$ExposedTrack hlschunksource$exposedtrack)
	{
		return hlschunksource$exposedtrack.variants;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Variant[] variants>
	//    2    4:areturn         
	}

*/


/*
	static int access$100(HlsChunkSource$ExposedTrack hlschunksource$exposedtrack)
	{
		return hlschunksource$exposedtrack.defaultVariantIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int defaultVariantIndex>
	//    2    4:ireturn         
	}

*/


/*
	static int access$200(HlsChunkSource$ExposedTrack hlschunksource$exposedtrack)
	{
		return hlschunksource$exposedtrack.adaptiveMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int adaptiveMaxWidth>
	//    2    4:ireturn         
	}

*/


/*
	static int access$300(HlsChunkSource$ExposedTrack hlschunksource$exposedtrack)
	{
		return hlschunksource$exposedtrack.adaptiveMaxHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int adaptiveMaxHeight>
	//    2    4:ireturn         
	}

*/

	public HlsChunkSource$ExposedTrack(Variant variant)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		variants = (new Variant[] {
			variant
		});
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:anewarray       Variant[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:aastore         
	//    9   13:putfield        #22  <Field Variant[] variants>
		defaultVariantIndex = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #24  <Field int defaultVariantIndex>
		adaptiveMaxWidth = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #26  <Field int adaptiveMaxWidth>
		adaptiveMaxHeight = -1;
	//   16   26:aload_0         
	//   17   27:iconst_m1       
	//   18   28:putfield        #28  <Field int adaptiveMaxHeight>
	//   19   31:return          
	}

	public HlsChunkSource$ExposedTrack(Variant avariant[], int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		variants = avariant;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Variant[] variants>
		defaultVariantIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int defaultVariantIndex>
		adaptiveMaxWidth = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int adaptiveMaxWidth>
		adaptiveMaxHeight = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #28  <Field int adaptiveMaxHeight>
	//   14   25:return          
	}
}
