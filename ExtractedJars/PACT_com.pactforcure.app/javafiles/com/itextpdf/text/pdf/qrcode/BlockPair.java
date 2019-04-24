// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			ByteArray

final class BlockPair
{

	BlockPair(ByteArray bytearray, ByteArray bytearray1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		dataBytes = bytearray;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field ByteArray dataBytes>
		errorCorrectionBytes = bytearray1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field ByteArray errorCorrectionBytes>
	//    8   14:return          
	}

	public ByteArray getDataBytes()
	{
		return dataBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ByteArray dataBytes>
	//    2    4:areturn         
	}

	public ByteArray getErrorCorrectionBytes()
	{
		return errorCorrectionBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ByteArray errorCorrectionBytes>
	//    2    4:areturn         
	}

	private final ByteArray dataBytes;
	private final ByteArray errorCorrectionBytes;
}
