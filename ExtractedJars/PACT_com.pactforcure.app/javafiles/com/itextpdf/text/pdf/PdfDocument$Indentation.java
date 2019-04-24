// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDocument

public static class PdfDocument$Indentation
{

	float imageIndentLeft;
	float imageIndentRight;
	float indentBottom;
	float indentLeft;
	float indentRight;
	float indentTop;
	float listIndentLeft;
	float sectionIndentLeft;
	float sectionIndentRight;

	public PdfDocument$Indentation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		indentLeft = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #23  <Field float indentLeft>
		sectionIndentLeft = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #25  <Field float sectionIndentLeft>
		listIndentLeft = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #27  <Field float listIndentLeft>
		imageIndentLeft = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #29  <Field float imageIndentLeft>
		indentRight = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #31  <Field float indentRight>
		sectionIndentRight = 0.0F;
	//   17   29:aload_0         
	//   18   30:fconst_0        
	//   19   31:putfield        #33  <Field float sectionIndentRight>
		imageIndentRight = 0.0F;
	//   20   34:aload_0         
	//   21   35:fconst_0        
	//   22   36:putfield        #35  <Field float imageIndentRight>
		indentTop = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #37  <Field float indentTop>
		indentBottom = 0.0F;
	//   26   44:aload_0         
	//   27   45:fconst_0        
	//   28   46:putfield        #39  <Field float indentBottom>
	//   29   49:return          
	}
}
