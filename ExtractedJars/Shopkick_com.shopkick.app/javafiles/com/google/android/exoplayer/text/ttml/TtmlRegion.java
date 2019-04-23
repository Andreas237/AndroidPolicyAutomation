// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.ttml;


final class TtmlRegion
{

	public TtmlRegion()
	{
		this(1.401298E-45F, 1.401298E-45F, 0x80000000, 1.401298E-45F);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Float 1.401298E-45F>
	//    2    3:ldc1            #13  <Float 1.401298E-45F>
	//    3    5:ldc1            #14  <Int 0x80000000>
	//    4    7:ldc1            #13  <Float 1.401298E-45F>
	//    5    9:invokespecial   #17  <Method void TtmlRegion(float, float, int, float)>
	//    6   12:return          
	}

	public TtmlRegion(float f, float f1, int i, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		position = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #22  <Field float position>
		line = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #24  <Field float line>
		lineType = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int lineType>
		width = f2;
	//   11   19:aload_0         
	//   12   20:fload           4
	//   13   22:putfield        #28  <Field float width>
	//   14   25:return          
	}

	public final float line;
	public final int lineType;
	public final float position;
	public final float width;
}
