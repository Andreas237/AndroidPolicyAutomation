// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfContentByte, PdfStamperImp, PdfWriter, PageResources, 
//			PdfAnnotation, PdfAction

public class StampContent extends PdfContentByte
{

	StampContent(PdfStamperImp pdfstamperimp, PdfStamperImp.PageStamp pagestamp)
	{
		super(((PdfWriter) (pdfstamperimp)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void PdfContentByte(PdfWriter)>
		ps = pagestamp;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field PdfStamperImp$PageStamp ps>
		pageResources = pagestamp.pageResources;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:getfield        #19  <Field PageResources PdfStamperImp$PageStamp.pageResources>
	//    9   15:putfield        #20  <Field PageResources pageResources>
	//   10   18:return          
	}

	void addAnnotation(PdfAnnotation pdfannotation)
	{
		((PdfStamperImp)writer).addAnnotation(pdfannotation, ps.pageN);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field PdfWriter writer>
	//    2    4:checkcast       #29  <Class PdfStamperImp>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field PdfStamperImp$PageStamp ps>
	//    6   12:getfield        #33  <Field PdfDictionary PdfStamperImp$PageStamp.pageN>
	//    7   15:invokevirtual   #36  <Method void PdfStamperImp.addAnnotation(PdfAnnotation, PdfDictionary)>
	//    8   18:return          
	}

	public PdfContentByte getDuplicate()
	{
		return ((PdfContentByte) (new StampContent((PdfStamperImp)writer, ps)));
	//    0    0:new             #2   <Class StampContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field PdfWriter writer>
	//    4    8:checkcast       #29  <Class PdfStamperImp>
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field PdfStamperImp$PageStamp ps>
	//    7   15:invokespecial   #40  <Method void StampContent(PdfStamperImp, PdfStamperImp$PageStamp)>
	//    8   18:areturn         
	}

	PageResources getPageResources()
	{
		return pageResources;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PageResources pageResources>
	//    2    4:areturn         
	}

	public void setAction(PdfAction pdfaction, float f, float f1, float f2, float f3)
	{
		((PdfStamperImp)writer).addAnnotation(writer.createAnnotation(f, f1, f2, f3, pdfaction, ((PdfName) (null))), ps.pageN);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field PdfWriter writer>
	//    2    4:checkcast       #29  <Class PdfStamperImp>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field PdfWriter writer>
	//    5   11:fload_2         
	//    6   12:fload_3         
	//    7   13:fload           4
	//    8   15:fload           5
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #50  <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//   12   22:aload_0         
	//   13   23:getfield        #15  <Field PdfStamperImp$PageStamp ps>
	//   14   26:getfield        #33  <Field PdfDictionary PdfStamperImp$PageStamp.pageN>
	//   15   29:invokevirtual   #36  <Method void PdfStamperImp.addAnnotation(PdfAnnotation, PdfDictionary)>
	//   16   32:return          
	}

	PageResources pageResources;
	PdfStamperImp.PageStamp ps;
}
