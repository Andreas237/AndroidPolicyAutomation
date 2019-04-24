// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			Version

public static final class Version$ECB
{

	public int getCount()
	{
		return count;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int count>
	//    2    4:ireturn         
	}

	public int getDataCodewords()
	{
		return dataCodewords;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int dataCodewords>
	//    2    4:ireturn         
	}

	private final int count;
	private final int dataCodewords;

	Version$ECB(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		count = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int count>
		dataCodewords = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int dataCodewords>
	//    8   14:return          
	}
}
