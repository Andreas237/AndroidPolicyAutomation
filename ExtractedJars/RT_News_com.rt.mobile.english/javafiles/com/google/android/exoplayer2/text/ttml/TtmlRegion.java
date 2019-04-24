// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.ttml;


final class TtmlRegion
{

	public TtmlRegion(String s)
	{
		this(s, 1.401298E-45F, 1.401298E-45F, 0x80000000, 0x80000000, 1.401298E-45F, 0x80000000, 1.401298E-45F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #18  <Float 1.401298E-45F>
	//    3    4:ldc1            #18  <Float 1.401298E-45F>
	//    4    6:ldc1            #19  <Int 0x80000000>
	//    5    8:ldc1            #19  <Int 0x80000000>
	//    6   10:ldc1            #18  <Float 1.401298E-45F>
	//    7   12:ldc1            #19  <Int 0x80000000>
	//    8   14:ldc1            #18  <Float 1.401298E-45F>
	//    9   16:invokespecial   #22  <Method void TtmlRegion(String, float, float, int, int, float, int, float)>
	//   10   19:return          
	}

	public TtmlRegion(String s, float f, float f1, int i, int j, float f2, int k, 
			float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field String id>
		position = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #30  <Field float position>
		line = f1;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #32  <Field float line>
		lineType = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #34  <Field int lineType>
		lineAnchor = j;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #36  <Field int lineAnchor>
		width = f2;
	//   17   31:aload_0         
	//   18   32:fload           6
	//   19   34:putfield        #38  <Field float width>
		textSizeType = k;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #40  <Field int textSizeType>
		textSize = f3;
	//   23   43:aload_0         
	//   24   44:fload           8
	//   25   46:putfield        #42  <Field float textSize>
	//   26   49:return          
	}

	public final String id;
	public final float line;
	public final int lineAnchor;
	public final int lineType;
	public final float position;
	public final float textSize;
	public final int textSizeType;
	public final float width;
}
