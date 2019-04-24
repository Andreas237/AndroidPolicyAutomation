// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.dvb;


// Referenced classes of package com.google.android.exoplayer2.text.dvb:
//			DvbParser

private static final class DvbParser$DisplayDefinition
{

	public final int height;
	public final int horizontalPositionMaximum;
	public final int horizontalPositionMinimum;
	public final int verticalPositionMaximum;
	public final int verticalPositionMinimum;
	public final int width;

	public DvbParser$DisplayDefinition(int i, int j, int k, int l, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		width = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int width>
		height = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int height>
		horizontalPositionMinimum = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int horizontalPositionMinimum>
		horizontalPositionMaximum = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #27  <Field int horizontalPositionMaximum>
		verticalPositionMinimum = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #29  <Field int verticalPositionMinimum>
		verticalPositionMaximum = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #31  <Field int verticalPositionMaximum>
	//   20   37:return          
	}
}
