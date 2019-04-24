// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PRAcroForm, PdfName, PdfDictionary, PdfObject, 
//			PRIndirectReference

public static class PRAcroForm$FieldInformation
{

	public PdfDictionary getInfo()
	{
		return info;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field PdfDictionary info>
	//    2    4:areturn         
	}

	public String getName()
	{
		return fieldName;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String fieldName>
	//    2    4:areturn         
	}

	public PRIndirectReference getRef()
	{
		return ref;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PRIndirectReference ref>
	//    2    4:areturn         
	}

	public String getWidgetName()
	{
		PdfObject pdfobject = info.get(PdfName.NM);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field PdfDictionary info>
	//    2    4:getstatic       #38  <Field PdfName PdfName.NM>
	//    3    7:invokevirtual   #44  <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:astore_1        
		if(pdfobject != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          20
			return pdfobject.toString();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #49  <Method String PdfObject.toString()>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	String fieldName;
	PdfDictionary info;
	PRIndirectReference ref;

	PRAcroForm$FieldInformation(String s, PdfDictionary pdfdictionary, PRIndirectReference prindirectreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		fieldName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String fieldName>
		info = pdfdictionary;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field PdfDictionary info>
		ref = prindirectreference;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field PRIndirectReference ref>
	//   11   19:return          
	}
}
