// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;

import com.itextpdf.xmp.XMPException;
import com.itextpdf.xmp.XMPMeta;

public class PdfProperties
{

	public PdfProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static void setKeywords(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.setProperty("http://ns.adobe.com/pdf/1.3/", "Keywords", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "http://ns.adobe.com/pdf/1.3/">
	//    2    3:ldc1            #8   <String "Keywords">
	//    3    5:aload_1         
	//    4    6:invokeinterface #34  <Method void XMPMeta.setProperty(String, String, Object)>
	//    5   11:return          
	}

	public static void setProducer(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.setProperty("http://ns.adobe.com/pdf/1.3/", "Producer", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "http://ns.adobe.com/pdf/1.3/">
	//    2    3:ldc1            #14  <String "Producer">
	//    3    5:aload_1         
	//    4    6:invokeinterface #34  <Method void XMPMeta.setProperty(String, String, Object)>
	//    5   11:return          
	}

	public static void setVersion(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.setProperty("http://ns.adobe.com/pdf/1.3/", "PDFVersion", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "http://ns.adobe.com/pdf/1.3/">
	//    2    3:ldc1            #17  <String "PDFVersion">
	//    3    5:aload_1         
	//    4    6:invokeinterface #34  <Method void XMPMeta.setProperty(String, String, Object)>
	//    5   11:return          
	}

	public static final String KEYWORDS = "Keywords";
	public static final String PART = "part";
	public static final String PRODUCER = "Producer";
	public static final String VERSION = "PDFVersion";
}
