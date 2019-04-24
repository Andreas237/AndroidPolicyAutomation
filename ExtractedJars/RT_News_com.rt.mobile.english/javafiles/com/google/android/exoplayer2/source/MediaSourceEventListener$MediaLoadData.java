// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener

public static final class MediaSourceEventListener$MediaLoadData
{

	public final int dataType;
	public final long mediaEndTimeMs;
	public final long mediaStartTimeMs;
	public final Format trackFormat;
	public final Object trackSelectionData;
	public final int trackSelectionReason;
	public final int trackType;

	public MediaSourceEventListener$MediaLoadData(int i, int j, Format format, int k, Object obj, long l, 
			long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		dataType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int dataType>
		trackType = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #28  <Field int trackType>
		trackFormat = format;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field Format trackFormat>
		trackSelectionReason = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #32  <Field int trackSelectionReason>
		trackSelectionData = obj;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #34  <Field Object trackSelectionData>
		mediaStartTimeMs = l;
	//   17   31:aload_0         
	//   18   32:lload           6
	//   19   34:putfield        #36  <Field long mediaStartTimeMs>
		mediaEndTimeMs = l1;
	//   20   37:aload_0         
	//   21   38:lload           8
	//   22   40:putfield        #38  <Field long mediaEndTimeMs>
	//   23   43:return          
	}
}
