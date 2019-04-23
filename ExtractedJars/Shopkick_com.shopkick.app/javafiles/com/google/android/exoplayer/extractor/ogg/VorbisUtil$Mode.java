// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;


// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			VorbisUtil

public static final class VorbisUtil$Mode
{

	public final boolean blockFlag;
	public final int mapping;
	public final int transformType;
	public final int windowType;

	public VorbisUtil$Mode(boolean flag, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		blockFlag = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field boolean blockFlag>
		windowType = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int windowType>
		transformType = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int transformType>
		mapping = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field int mapping>
	//   14   25:return          
	}
}
