// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfContentByte, PdfCopy, PageResources, PdfWriter

public static class PdfCopy$StampContent extends PdfContentByte
{

	public PdfContentByte getDuplicate()
	{
		return ((PdfContentByte) (new PdfCopy$StampContent(writer, pageResources)));
	//    0    0:new             #2   <Class PdfCopy$StampContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field PdfWriter writer>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field PageResources pageResources>
	//    6   12:invokespecial   #25  <Method void PdfCopy$StampContent(PdfWriter, PageResources)>
	//    7   15:areturn         
	}

	PageResources getPageResources()
	{
		return pageResources;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field PageResources pageResources>
	//    2    4:areturn         
	}

	PageResources pageResources;

	PdfCopy$StampContent(PdfWriter pdfwriter, PageResources pageresources)
	{
		super(pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void PdfContentByte(PdfWriter)>
		pageResources = pageresources;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field PageResources pageResources>
	//    6   10:return          
	}
}
