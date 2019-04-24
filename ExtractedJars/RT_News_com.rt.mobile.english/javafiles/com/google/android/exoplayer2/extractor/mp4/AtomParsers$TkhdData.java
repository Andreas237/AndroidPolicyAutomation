// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;


// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			AtomParsers

private static final class AtomParsers$TkhdData
{

	private final long duration;
	private final int id;
	private final int rotationDegrees;


/*
	static long access$000(AtomParsers$TkhdData atomparsers$tkhddata)
	{
		return atomparsers$tkhddata.duration;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field long duration>
	//    2    4:lreturn         
	}

*/


/*
	static int access$100(AtomParsers$TkhdData atomparsers$tkhddata)
	{
		return atomparsers$tkhddata.id;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int id>
	//    2    4:ireturn         
	}

*/


/*
	static int access$200(AtomParsers$TkhdData atomparsers$tkhddata)
	{
		return atomparsers$tkhddata.rotationDegrees;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int rotationDegrees>
	//    2    4:ireturn         
	}

*/

	public AtomParsers$TkhdData(int i, long l, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int id>
		duration = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #21  <Field long duration>
		rotationDegrees = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #23  <Field int rotationDegrees>
	//   11   20:return          
	}
}
