// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfArray, PdfNumber, PdfDashPattern

public class PdfBorderArray extends PdfArray
{

	public PdfBorderArray(float f, float f1, float f2)
	{
		this(f, f1, f2, ((PdfDashPattern) (null)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #9   <Method void PdfBorderArray(float, float, float, PdfDashPattern)>
	//    6    8:return          
	}

	public PdfBorderArray(float f, float f1, float f2, PdfDashPattern pdfdashpattern)
	{
		super(((PdfObject) (new PdfNumber(f))));
	//    0    0:aload_0         
	//    1    1:new             #12  <Class PdfNumber>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:invokespecial   #15  <Method void PdfNumber(float)>
	//    5    9:invokespecial   #18  <Method void PdfArray(PdfObject)>
		add(((PdfObject) (new PdfNumber(f1))));
	//    6   12:aload_0         
	//    7   13:new             #12  <Class PdfNumber>
	//    8   16:dup             
	//    9   17:fload_2         
	//   10   18:invokespecial   #15  <Method void PdfNumber(float)>
	//   11   21:invokevirtual   #22  <Method boolean add(PdfObject)>
	//   12   24:pop             
		add(((PdfObject) (new PdfNumber(f2))));
	//   13   25:aload_0         
	//   14   26:new             #12  <Class PdfNumber>
	//   15   29:dup             
	//   16   30:fload_3         
	//   17   31:invokespecial   #15  <Method void PdfNumber(float)>
	//   18   34:invokevirtual   #22  <Method boolean add(PdfObject)>
	//   19   37:pop             
		if(pdfdashpattern != null)
	//*  20   38:aload           4
	//*  21   40:ifnull          50
			add(((PdfObject) (pdfdashpattern)));
	//   22   43:aload_0         
	//   23   44:aload           4
	//   24   46:invokevirtual   #22  <Method boolean add(PdfObject)>
	//   25   49:pop             
	//   26   50:return          
	}
}
