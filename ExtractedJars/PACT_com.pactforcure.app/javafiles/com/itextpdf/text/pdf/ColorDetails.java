// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			ICachedColorSpace, PdfName, PdfIndirectReference, PdfWriter, 
//			PdfObject

class ColorDetails
{

	ColorDetails(PdfName pdfname, PdfIndirectReference pdfindirectreference, ICachedColorSpace icachedcolorspace)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		colorSpaceName = pdfname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field PdfName colorSpaceName>
		indirectReference = pdfindirectreference;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field PdfIndirectReference indirectReference>
		colorSpace = icachedcolorspace;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field ICachedColorSpace colorSpace>
	//   11   19:return          
	}

	PdfName getColorSpaceName()
	{
		return colorSpaceName;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PdfName colorSpaceName>
	//    2    4:areturn         
	}

	public PdfIndirectReference getIndirectReference()
	{
		return indirectReference;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PdfIndirectReference indirectReference>
	//    2    4:areturn         
	}

	public PdfObject getPdfObject(PdfWriter pdfwriter)
	{
		return colorSpace.getPdfObject(pdfwriter);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ICachedColorSpace colorSpace>
	//    2    4:aload_1         
	//    3    5:invokeinterface #32  <Method PdfObject ICachedColorSpace.getPdfObject(PdfWriter)>
	//    4   10:areturn         
	}

	ICachedColorSpace colorSpace;
	PdfName colorSpaceName;
	PdfIndirectReference indirectReference;
}
