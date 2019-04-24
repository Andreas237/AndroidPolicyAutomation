// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;


// Referenced classes of package com.itextpdf.text.io:
//			TempFileCache

public class TempFileCache$ObjectPosition
{

	int length;
	long offset;
	final TempFileCache this$0;

	TempFileCache$ObjectPosition(long l, int i)
	{
		this$0 = TempFileCache.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TempFileCache this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		offset = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #22  <Field long offset>
		length = i;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #24  <Field int length>
	//   11   20:return          
	}
}
