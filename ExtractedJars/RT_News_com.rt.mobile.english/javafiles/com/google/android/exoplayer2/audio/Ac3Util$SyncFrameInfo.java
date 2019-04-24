// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			Ac3Util

public static final class Ac3Util$SyncFrameInfo
{
	public static interface StreamType
		extends Annotation
	{
	}


	public static final int STREAM_TYPE_TYPE0 = 0;
	public static final int STREAM_TYPE_TYPE1 = 1;
	public static final int STREAM_TYPE_TYPE2 = 2;
	public static final int STREAM_TYPE_UNDEFINED = -1;
	public final int channelCount;
	public final int frameSize;
	public final String mimeType;
	public final int sampleCount;
	public final int sampleRate;
	public final int streamType;

	private Ac3Util$SyncFrameInfo(String s, int i, int j, int k, int l, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mimeType = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field String mimeType>
		streamType = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #35  <Field int streamType>
		channelCount = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #37  <Field int channelCount>
		sampleRate = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #39  <Field int sampleRate>
		frameSize = l;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #41  <Field int frameSize>
		sampleCount = i1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #43  <Field int sampleCount>
	//   20   37:return          
	}

	Ac3Util$SyncFrameInfo(String s, int i, int j, int k, int l, int i1, Ac3Util._cls1 _pcls1)
	{
		this(s, i, j, k, l, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #47  <Method void Ac3Util$SyncFrameInfo(String, int, int, int, int, int)>
	//    8   13:return          
	}
}
