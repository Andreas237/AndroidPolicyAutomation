// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;


// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TiffWriter

public static class TiffWriter$FieldImage extends TiffWriter.FieldBase
{

	public TiffWriter$FieldImage(byte abyte0[])
	{
		super(273, 4, 1);
	//    0    0:aload_0         
	//    1    1:sipush          273
	//    2    4:iconst_4        
	//    3    5:iconst_1        
	//    4    6:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
		data = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #16  <Field byte[] data>
	//    8   14:return          
	}
}
