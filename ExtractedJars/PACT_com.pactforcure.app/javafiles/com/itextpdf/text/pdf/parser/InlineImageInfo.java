// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfDictionary;

public class InlineImageInfo
{

	public InlineImageInfo(byte abyte0[], PdfDictionary pdfdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		samples = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field byte[] samples>
		imageDictionary = pdfdictionary;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field PdfDictionary imageDictionary>
	//    8   14:return          
	}

	public PdfDictionary getImageDictionary()
	{
		return imageDictionary;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PdfDictionary imageDictionary>
	//    2    4:areturn         
	}

	public byte[] getSamples()
	{
		return samples;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field byte[] samples>
	//    2    4:areturn         
	}

	private final PdfDictionary imageDictionary;
	private final byte samples[];
}
