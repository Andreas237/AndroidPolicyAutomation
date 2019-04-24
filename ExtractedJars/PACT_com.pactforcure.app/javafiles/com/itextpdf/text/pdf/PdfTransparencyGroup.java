// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfBoolean

public class PdfTransparencyGroup extends PdfDictionary
{

	public PdfTransparencyGroup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void PdfDictionary()>
		put(PdfName.S, ((PdfObject) (PdfName.TRANSPARENCY)));
	//    2    4:aload_0         
	//    3    5:getstatic       #14  <Field PdfName PdfName.S>
	//    4    8:getstatic       #17  <Field PdfName PdfName.TRANSPARENCY>
	//    5   11:invokevirtual   #21  <Method void put(PdfName, PdfObject)>
	//    6   14:return          
	}

	public void setIsolated(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
		{
			put(PdfName.I, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//    2    4:aload_0         
	//    3    5:getstatic       #27  <Field PdfName PdfName.I>
	//    4    8:getstatic       #33  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//    5   11:invokevirtual   #21  <Method void put(PdfName, PdfObject)>
			return;
	//    6   14:return          
		} else
		{
			remove(PdfName.I);
	//    7   15:aload_0         
	//    8   16:getstatic       #27  <Field PdfName PdfName.I>
	//    9   19:invokevirtual   #37  <Method void remove(PdfName)>
			return;
	//   10   22:return          
		}
	}

	public void setKnockout(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
		{
			put(PdfName.K, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//    2    4:aload_0         
	//    3    5:getstatic       #41  <Field PdfName PdfName.K>
	//    4    8:getstatic       #33  <Field PdfBoolean PdfBoolean.PDFTRUE>
	//    5   11:invokevirtual   #21  <Method void put(PdfName, PdfObject)>
			return;
	//    6   14:return          
		} else
		{
			remove(PdfName.K);
	//    7   15:aload_0         
	//    8   16:getstatic       #41  <Field PdfName PdfName.K>
	//    9   19:invokevirtual   #37  <Method void remove(PdfName)>
			return;
	//   10   22:return          
		}
	}
}
