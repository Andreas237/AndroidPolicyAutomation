// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;


// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			Id3Decoder

private static final class Id3Decoder$Id3Header
{

	private final int framesSize;
	private final boolean isUnsynchronized;
	private final int majorVersion;


/*
	static int access$000(Id3Decoder$Id3Header id3decoder$id3header)
	{
		return id3decoder$id3header.majorVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int majorVersion>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(Id3Decoder$Id3Header id3decoder$id3header)
	{
		return id3decoder$id3header.framesSize;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int framesSize>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$200(Id3Decoder$Id3Header id3decoder$id3header)
	{
		return id3decoder$id3header.isUnsynchronized;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field boolean isUnsynchronized>
	//    2    4:ireturn         
	}

*/

	public Id3Decoder$Id3Header(int i, boolean flag, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		majorVersion = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int majorVersion>
		isUnsynchronized = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field boolean isUnsynchronized>
		framesSize = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int framesSize>
	//   11   19:return          
	}
}
