// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.chunk.Format;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingChunkSource

private static final class SmoothStreamingChunkSource$ExposedTrack
{

	public boolean isAdaptive()
	{
		return adaptiveFormats != null;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Format[] adaptiveFormats>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private final Format adaptiveFormats[];
	private final int adaptiveMaxHeight;
	private final int adaptiveMaxWidth;
	private final int elementIndex;
	private final Format fixedFormat;
	public final MediaFormat trackFormat;


/*
	static int access$000(SmoothStreamingChunkSource$ExposedTrack smoothstreamingchunksource$exposedtrack)
	{
		return smoothstreamingchunksource$exposedtrack.elementIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int elementIndex>
	//    2    4:ireturn         
	}

*/


/*
	static Format[] access$100(SmoothStreamingChunkSource$ExposedTrack smoothstreamingchunksource$exposedtrack)
	{
		return smoothstreamingchunksource$exposedtrack.adaptiveFormats;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Format[] adaptiveFormats>
	//    2    4:areturn         
	}

*/


/*
	static Format access$200(SmoothStreamingChunkSource$ExposedTrack smoothstreamingchunksource$exposedtrack)
	{
		return smoothstreamingchunksource$exposedtrack.fixedFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Format fixedFormat>
	//    2    4:areturn         
	}

*/


/*
	static int access$300(SmoothStreamingChunkSource$ExposedTrack smoothstreamingchunksource$exposedtrack)
	{
		return smoothstreamingchunksource$exposedtrack.adaptiveMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int adaptiveMaxWidth>
	//    2    4:ireturn         
	}

*/


/*
	static int access$400(SmoothStreamingChunkSource$ExposedTrack smoothstreamingchunksource$exposedtrack)
	{
		return smoothstreamingchunksource$exposedtrack.adaptiveMaxHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int adaptiveMaxHeight>
	//    2    4:ireturn         
	}

*/

	public SmoothStreamingChunkSource$ExposedTrack(MediaFormat mediaformat, int i, Format format)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		trackFormat = mediaformat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field MediaFormat trackFormat>
		elementIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int elementIndex>
		fixedFormat = format;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field Format fixedFormat>
		adaptiveFormats = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #30  <Field Format[] adaptiveFormats>
		adaptiveMaxWidth = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #32  <Field int adaptiveMaxWidth>
		adaptiveMaxHeight = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #34  <Field int adaptiveMaxHeight>
	//   20   34:return          
	}

	public SmoothStreamingChunkSource$ExposedTrack(MediaFormat mediaformat, int i, Format aformat[], int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		trackFormat = mediaformat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field MediaFormat trackFormat>
		elementIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int elementIndex>
		adaptiveFormats = aformat;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field Format[] adaptiveFormats>
		adaptiveMaxWidth = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #32  <Field int adaptiveMaxWidth>
		adaptiveMaxHeight = k;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #34  <Field int adaptiveMaxHeight>
		fixedFormat = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #28  <Field Format fixedFormat>
	//   20   36:return          
	}
}
