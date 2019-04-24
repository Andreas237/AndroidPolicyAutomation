// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;


// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TiffWriter

public static class TiffWriter$FieldByte extends TiffWriter$FieldBase
{

	public TiffWriter$FieldByte(int i, byte abyte0[])
	{
		super(i, 1, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
		data = abyte0;
	//    6    8:aload_0         
	//    7    9:aload_2         
	//    8   10:putfield        #16  <Field byte[] data>
	//    9   13:return          
	}
}
