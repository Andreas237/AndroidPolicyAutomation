// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.chunk.Format;

// Referenced classes of package com.google.android.exoplayer.dash:
//			DashChunkSource

protected static final class DashChunkSource$ExposedTrack
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

	private final int adaptationSetIndex;
	private final Format adaptiveFormats[];
	public final int adaptiveMaxHeight;
	public final int adaptiveMaxWidth;
	private final Format fixedFormat;
	public final MediaFormat trackFormat;


/*
	static Format[] access$000(DashChunkSource$ExposedTrack dashchunksource$exposedtrack)
	{
		return dashchunksource$exposedtrack.adaptiveFormats;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Format[] adaptiveFormats>
	//    2    4:areturn         
	}

*/


/*
	static Format access$100(DashChunkSource$ExposedTrack dashchunksource$exposedtrack)
	{
		return dashchunksource$exposedtrack.fixedFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Format fixedFormat>
	//    2    4:areturn         
	}

*/


/*
	static int access$500(DashChunkSource$ExposedTrack dashchunksource$exposedtrack)
	{
		return dashchunksource$exposedtrack.adaptationSetIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int adaptationSetIndex>
	//    2    4:ireturn         
	}

*/

	public DashChunkSource$ExposedTrack(MediaFormat mediaformat, int i, Format format)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		trackFormat = mediaformat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field MediaFormat trackFormat>
		adaptationSetIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int adaptationSetIndex>
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

	public DashChunkSource$ExposedTrack(MediaFormat mediaformat, int i, Format aformat[], int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		trackFormat = mediaformat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field MediaFormat trackFormat>
		adaptationSetIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int adaptationSetIndex>
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
