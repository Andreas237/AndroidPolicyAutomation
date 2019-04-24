// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.PdfName;

// Referenced classes of package com.itextpdf.text:
//			ListBody, ListItem

public class ListLabel extends ListBody
{

	protected ListLabel(ListItem listitem)
	{
		super(listitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ListBody(ListItem)>
		role = PdfName.LBL;
	//    3    5:aload_0         
	//    4    6:getstatic       #17  <Field PdfName PdfName.LBL>
	//    5    9:putfield        #19  <Field PdfName role>
		indentation = 0.0F;
	//    6   12:aload_0         
	//    7   13:fconst_0        
	//    8   14:putfield        #21  <Field float indentation>
	//    9   17:return          
	}

	public float getIndentation()
	{
		return indentation;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float indentation>
	//    2    4:freturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PdfName role>
	//    2    4:areturn         
	}

	public boolean getTagLabelContent()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isInline()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void setIndentation(float f)
	{
		indentation = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #21  <Field float indentation>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PdfName role>
	//    3    5:return          
	}

	public void setTagLabelContent(boolean flag)
	{
	//    0    0:return          
	}

	protected float indentation;
	protected PdfName role;
}
