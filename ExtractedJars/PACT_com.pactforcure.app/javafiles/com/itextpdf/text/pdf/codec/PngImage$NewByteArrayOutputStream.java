// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import java.io.ByteArrayOutputStream;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			PngImage

static class PngImage$NewByteArrayOutputStream extends ByteArrayOutputStream
{

	public byte[] getBuf()
	{
		return buf;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field byte[] buf>
	//    2    4:areturn         
	}

	PngImage$NewByteArrayOutputStream()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ByteArrayOutputStream()>
	//    2    4:return          
	}
}
