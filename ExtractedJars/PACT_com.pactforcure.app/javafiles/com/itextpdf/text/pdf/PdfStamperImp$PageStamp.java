// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStamperImp, PageResources, PdfName, PdfDictionary, 
//			StampContent, PdfReader

static class PdfStamperImp$PageStamp
{

	StampContent over;
	PdfDictionary pageN;
	PageResources pageResources;
	int replacePoint;
	StampContent under;

	PdfStamperImp$PageStamp(PdfStamperImp pdfstamperimp, PdfReader pdfreader, PdfDictionary pdfdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		replacePoint = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #23  <Field int replacePoint>
		pageN = pdfdictionary;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #25  <Field PdfDictionary pageN>
		pageResources = new PageResources();
	//    8   14:aload_0         
	//    9   15:new             #27  <Class PageResources>
	//   10   18:dup             
	//   11   19:invokespecial   #28  <Method void PageResources()>
	//   12   22:putfield        #30  <Field PageResources pageResources>
		pdfreader = ((PdfReader) (pdfdictionary.getAsDict(PdfName.RESOURCES)));
	//   13   25:aload_3         
	//   14   26:getstatic       #36  <Field PdfName PdfName.RESOURCES>
	//   15   29:invokevirtual   #42  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   16   32:astore_2        
		pageResources.setOriginalResources(((PdfDictionary) (pdfreader)), pdfstamperimp.namePtr);
	//   17   33:aload_0         
	//   18   34:getfield        #30  <Field PageResources pageResources>
	//   19   37:aload_2         
	//   20   38:aload_1         
	//   21   39:getfield        #46  <Field int[] PdfStamperImp.namePtr>
	//   22   42:invokevirtual   #50  <Method void PageResources.setOriginalResources(PdfDictionary, int[])>
	//   23   45:return          
	}
}
