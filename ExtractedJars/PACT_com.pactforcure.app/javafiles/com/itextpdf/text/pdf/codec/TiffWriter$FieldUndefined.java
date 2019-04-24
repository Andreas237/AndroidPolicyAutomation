// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;


// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TiffWriter

public static class TiffWriter$FieldUndefined extends TiffWriter.FieldBase
{

	public TiffWriter$FieldUndefined(int i, byte abyte0[])
	{
		super(i, 7, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          7
	//    3    4:aload_2         
	//    4    5:arraylength     
	//    5    6:invokespecial   #12  <Method void TiffWriter$FieldBase(int, int, int)>
		data = abyte0;
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:putfield        #16  <Field byte[] data>
	//    9   14:return          
	}
}
