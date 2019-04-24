// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.collection;

import com.itextpdf.text.pdf.*;

public class PdfTargetDictionary extends PdfDictionary
{

	public PdfTargetDictionary(PdfTargetDictionary pdftargetdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void PdfDictionary()>
		put(PdfName.R, ((com.itextpdf.text.pdf.PdfObject) (PdfName.P)));
	//    2    4:aload_0         
	//    3    5:getstatic       #15  <Field PdfName PdfName.R>
	//    4    8:getstatic       #18  <Field PdfName PdfName.P>
	//    5   11:invokevirtual   #22  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		if(pdftargetdictionary != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          23
			setAdditionalPath(pdftargetdictionary);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #25  <Method void setAdditionalPath(PdfTargetDictionary)>
	//   11   23:return          
	}

	public PdfTargetDictionary(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void PdfDictionary()>
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            19
		{
			put(PdfName.R, ((com.itextpdf.text.pdf.PdfObject) (PdfName.C)));
	//    4    8:aload_0         
	//    5    9:getstatic       #15  <Field PdfName PdfName.R>
	//    6   12:getstatic       #30  <Field PdfName PdfName.C>
	//    7   15:invokevirtual   #22  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			return;
	//    8   18:return          
		} else
		{
			put(PdfName.R, ((com.itextpdf.text.pdf.PdfObject) (PdfName.P)));
	//    9   19:aload_0         
	//   10   20:getstatic       #15  <Field PdfName PdfName.R>
	//   11   23:getstatic       #18  <Field PdfName PdfName.P>
	//   12   26:invokevirtual   #22  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			return;
	//   13   29:return          
		}
	}

	public void setAdditionalPath(PdfTargetDictionary pdftargetdictionary)
	{
		put(PdfName.T, ((com.itextpdf.text.pdf.PdfObject) (pdftargetdictionary)));
	//    0    0:aload_0         
	//    1    1:getstatic       #33  <Field PdfName PdfName.T>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    4    8:return          
	}

	public void setEmbeddedFileName(String s)
	{
		put(PdfName.N, ((com.itextpdf.text.pdf.PdfObject) (new PdfString(s, ((String) (null))))));
	//    0    0:aload_0         
	//    1    1:getstatic       #38  <Field PdfName PdfName.N>
	//    2    4:new             #40  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #43  <Method void PdfString(String, String)>
	//    7   13:invokevirtual   #22  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    8   16:return          
	}

	public void setFileAttachmentIndex(int i)
	{
		put(PdfName.A, ((com.itextpdf.text.pdf.PdfObject) (new PdfNumber(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #48  <Field PdfName PdfName.A>
	//    2    4:new             #50  <Class PdfNumber>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #52  <Method void PdfNumber(int)>
	//    6   12:invokevirtual   #22  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    7   15:return          
	}

	public void setFileAttachmentName(String s)
	{
		put(PdfName.A, ((com.itextpdf.text.pdf.PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #48  <Field PdfName PdfName.A>
	//    2    4:new             #40  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #55  <String "UnicodeBig">
	//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #22  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    8   17:return          
	}

	public void setFileAttachmentPage(int i)
	{
		put(PdfName.P, ((com.itextpdf.text.pdf.PdfObject) (new PdfNumber(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #18  <Field PdfName PdfName.P>
	//    2    4:new             #50  <Class PdfNumber>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #52  <Method void PdfNumber(int)>
	//    6   12:invokevirtual   #22  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    7   15:return          
	}

	public void setFileAttachmentPagename(String s)
	{
		put(PdfName.P, ((com.itextpdf.text.pdf.PdfObject) (new PdfString(s, ((String) (null))))));
	//    0    0:aload_0         
	//    1    1:getstatic       #18  <Field PdfName PdfName.P>
	//    2    4:new             #40  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #43  <Method void PdfString(String, String)>
	//    7   13:invokevirtual   #22  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    8   16:return          
	}
}
