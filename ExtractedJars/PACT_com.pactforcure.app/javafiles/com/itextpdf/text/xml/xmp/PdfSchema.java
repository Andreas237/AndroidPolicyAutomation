// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;

import com.itextpdf.text.Version;

// Referenced classes of package com.itextpdf.text.xml.xmp:
//			XmpSchema

public class PdfSchema extends XmpSchema
{

	public PdfSchema()
	{
		super("xmlns:pdf=\"http://ns.adobe.com/pdf/1.3/\"");
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "xmlns:pdf=\"http://ns.adobe.com/pdf/1.3/\"">
	//    2    3:invokespecial   #32  <Method void XmpSchema(String)>
		addProducer(Version.getInstance().getVersion());
	//    3    6:aload_0         
	//    4    7:invokestatic    #38  <Method Version Version.getInstance()>
	//    5   10:invokevirtual   #42  <Method String Version.getVersion()>
	//    6   13:invokevirtual   #45  <Method void addProducer(String)>
	//    7   16:return          
	}

	public void addKeywords(String s)
	{
		setProperty("pdf:Keywords", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "pdf:Keywords">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #51  <Method Object setProperty(String, String)>
	//    4    7:pop             
	//    5    8:return          
	}

	public void addProducer(String s)
	{
		setProperty("pdf:Producer", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <String "pdf:Producer">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #51  <Method Object setProperty(String, String)>
	//    4    7:pop             
	//    5    8:return          
	}

	public void addVersion(String s)
	{
		setProperty("pdf:PDFVersion", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "pdf:PDFVersion">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #51  <Method Object setProperty(String, String)>
	//    4    7:pop             
	//    5    8:return          
	}

	public static final String DEFAULT_XPATH_ID = "pdf";
	public static final String DEFAULT_XPATH_URI = "http://ns.adobe.com/pdf/1.3/";
	public static final String KEYWORDS = "pdf:Keywords";
	public static final String PRODUCER = "pdf:Producer";
	public static final String VERSION = "pdf:PDFVersion";
	private static final long serialVersionUID = 0x66cc6587L;
}
