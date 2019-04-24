// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.ttml;


// Referenced classes of package com.google.android.exoplayer2.text.ttml:
//			TtmlDecoder

private static final class TtmlDecoder$CellResolution
{

	final int columns;
	final int rows;

	TtmlDecoder$CellResolution(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		columns = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int columns>
		rows = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int rows>
	//    8   14:return          
	}
}
