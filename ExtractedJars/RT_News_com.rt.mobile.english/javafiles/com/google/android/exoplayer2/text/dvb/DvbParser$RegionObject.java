// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.dvb;


// Referenced classes of package com.google.android.exoplayer2.text.dvb:
//			DvbParser

private static final class DvbParser$RegionObject
{

	public final int backgroundPixelCode;
	public final int foregroundPixelCode;
	public final int horizontalPosition;
	public final int provider;
	public final int type;
	public final int verticalPosition;

	public DvbParser$RegionObject(int i, int j, int k, int l, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int type>
		provider = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int provider>
		horizontalPosition = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int horizontalPosition>
		verticalPosition = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #27  <Field int verticalPosition>
		foregroundPixelCode = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #29  <Field int foregroundPixelCode>
		backgroundPixelCode = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #31  <Field int backgroundPixelCode>
	//   20   37:return          
	}
}
