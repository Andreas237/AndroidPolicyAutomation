// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName

class PdfResources extends PdfDictionary
{

	PdfResources()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void PdfDictionary()>
	//    2    4:return          
	}

	void add(PdfName pdfname, PdfDictionary pdfdictionary)
	{
		if(pdfdictionary.size() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #15  <Method int PdfDictionary.size()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		PdfDictionary pdfdictionary1 = getAsDict(pdfname);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #19  <Method PdfDictionary getAsDict(PdfName)>
	//    7   13:astore_3        
		if(pdfdictionary1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       25
		{
			put(pdfname, ((PdfObject) (pdfdictionary)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #23  <Method void put(PdfName, PdfObject)>
			return;
	//   14   24:return          
		} else
		{
			pdfdictionary1.putAll(pdfdictionary);
	//   15   25:aload_3         
	//   16   26:aload_2         
	//   17   27:invokevirtual   #27  <Method void PdfDictionary.putAll(PdfDictionary)>
			return;
	//   18   30:return          
		}
	}
}
