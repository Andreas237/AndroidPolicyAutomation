// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfWriter, PdfDictionary, PdfNumber

public class PdfDeveloperExtension
{

	public PdfDeveloperExtension(PdfName pdfname, PdfName pdfname1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		prefix = pdfname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field PdfName prefix>
		baseversion = pdfname1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #45  <Field PdfName baseversion>
		extensionLevel = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #47  <Field int extensionLevel>
	//   11   19:return          
	}

	public PdfName getBaseversion()
	{
		return baseversion;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field PdfName baseversion>
	//    2    4:areturn         
	}

	public PdfDictionary getDeveloperExtensions()
	{
		PdfDictionary pdfdictionary = new PdfDictionary();
	//    0    0:new             #53  <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void PdfDictionary()>
	//    3    7:astore_1        
		pdfdictionary.put(PdfName.BASEVERSION, ((PdfObject) (baseversion)));
	//    4    8:aload_1         
	//    5    9:getstatic       #57  <Field PdfName PdfName.BASEVERSION>
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field PdfName baseversion>
	//    8   16:invokevirtual   #61  <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.EXTENSIONLEVEL, ((PdfObject) (new PdfNumber(extensionLevel))));
	//    9   19:aload_1         
	//   10   20:getstatic       #64  <Field PdfName PdfName.EXTENSIONLEVEL>
	//   11   23:new             #66  <Class PdfNumber>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #47  <Field int extensionLevel>
	//   15   31:invokespecial   #69  <Method void PdfNumber(int)>
	//   16   34:invokevirtual   #61  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfdictionary;
	//   17   37:aload_1         
	//   18   38:areturn         
	}

	public int getExtensionLevel()
	{
		return extensionLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int extensionLevel>
	//    2    4:ireturn         
	}

	public PdfName getPrefix()
	{
		return prefix;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field PdfName prefix>
	//    2    4:areturn         
	}

	public static final PdfDeveloperExtension ADOBE_1_7_EXTENSIONLEVEL3;
	public static final PdfDeveloperExtension ESIC_1_7_EXTENSIONLEVEL2;
	public static final PdfDeveloperExtension ESIC_1_7_EXTENSIONLEVEL5;
	protected PdfName baseversion;
	protected int extensionLevel;
	protected PdfName prefix;

	static 
	{
		ADOBE_1_7_EXTENSIONLEVEL3 = new PdfDeveloperExtension(PdfName.ADBE, PdfWriter.PDF_VERSION_1_7, 3);
	//    0    0:new             #2   <Class PdfDeveloperExtension>
	//    1    3:dup             
	//    2    4:getstatic       #20  <Field PdfName PdfName.ADBE>
	//    3    7:getstatic       #25  <Field PdfName PdfWriter.PDF_VERSION_1_7>
	//    4   10:iconst_3        
	//    5   11:invokespecial   #29  <Method void PdfDeveloperExtension(PdfName, PdfName, int)>
	//    6   14:putstatic       #31  <Field PdfDeveloperExtension ADOBE_1_7_EXTENSIONLEVEL3>
		ESIC_1_7_EXTENSIONLEVEL2 = new PdfDeveloperExtension(PdfName.ESIC, PdfWriter.PDF_VERSION_1_7, 2);
	//    7   17:new             #2   <Class PdfDeveloperExtension>
	//    8   20:dup             
	//    9   21:getstatic       #34  <Field PdfName PdfName.ESIC>
	//   10   24:getstatic       #25  <Field PdfName PdfWriter.PDF_VERSION_1_7>
	//   11   27:iconst_2        
	//   12   28:invokespecial   #29  <Method void PdfDeveloperExtension(PdfName, PdfName, int)>
	//   13   31:putstatic       #36  <Field PdfDeveloperExtension ESIC_1_7_EXTENSIONLEVEL2>
		ESIC_1_7_EXTENSIONLEVEL5 = new PdfDeveloperExtension(PdfName.ESIC, PdfWriter.PDF_VERSION_1_7, 5);
	//   14   34:new             #2   <Class PdfDeveloperExtension>
	//   15   37:dup             
	//   16   38:getstatic       #34  <Field PdfName PdfName.ESIC>
	//   17   41:getstatic       #25  <Field PdfName PdfWriter.PDF_VERSION_1_7>
	//   18   44:iconst_5        
	//   19   45:invokespecial   #29  <Method void PdfDeveloperExtension(PdfName, PdfName, int)>
	//   20   48:putstatic       #38  <Field PdfDeveloperExtension ESIC_1_7_EXTENSIONLEVEL5>
	//*  21   51:return          
	}
}
