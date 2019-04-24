// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			PdfSignatureAppDictionary

public class PdfSignatureBuildProperties extends PdfDictionary
{

	public PdfSignatureBuildProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void PdfDictionary()>
	//    2    4:return          
	}

	private PdfSignatureAppDictionary getPdfSignatureAppProperty()
	{
		PdfSignatureAppDictionary pdfsignatureappdictionary1 = (PdfSignatureAppDictionary)getAsDict(PdfName.APP);
	//    0    0:aload_0         
	//    1    1:getstatic       #17  <Field PdfName PdfName.APP>
	//    2    4:invokevirtual   #21  <Method PdfDictionary getAsDict(PdfName)>
	//    3    7:checkcast       #23  <Class PdfSignatureAppDictionary>
	//    4   10:astore_2        
		PdfSignatureAppDictionary pdfsignatureappdictionary = pdfsignatureappdictionary1;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(pdfsignatureappdictionary1 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       33
		{
			pdfsignatureappdictionary = new PdfSignatureAppDictionary();
	//    9   17:new             #23  <Class PdfSignatureAppDictionary>
	//   10   20:dup             
	//   11   21:invokespecial   #24  <Method void PdfSignatureAppDictionary()>
	//   12   24:astore_1        
			put(PdfName.APP, ((com.itextpdf.text.pdf.PdfObject) (pdfsignatureappdictionary)));
	//   13   25:aload_0         
	//   14   26:getstatic       #17  <Field PdfName PdfName.APP>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #28  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		}
		return pdfsignatureappdictionary;
	//   17   33:aload_1         
	//   18   34:areturn         
	}

	public void setSignatureCreator(String s)
	{
		getPdfSignatureAppProperty().setSignatureCreator(s);
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method PdfSignatureAppDictionary getPdfSignatureAppProperty()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void PdfSignatureAppDictionary.setSignatureCreator(String)>
	//    4    8:return          
	}
}
