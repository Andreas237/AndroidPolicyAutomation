// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPTableBody, PdfName

public class PdfPTableFooter extends PdfPTableBody
{

	public PdfPTableFooter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void PdfPTableBody()>
		role = PdfName.TFOOT;
	//    2    4:aload_0         
	//    3    5:getstatic       #15  <Field PdfName PdfName.TFOOT>
	//    4    8:putfield        #17  <Field PdfName role>
	//    5   11:return          
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PdfName role>
	//    2    4:areturn         
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PdfName role>
	//    3    5:return          
	}

	protected PdfName role;
}
