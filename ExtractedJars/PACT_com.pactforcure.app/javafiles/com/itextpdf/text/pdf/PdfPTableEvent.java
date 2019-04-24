// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPTable, PdfContentByte

public interface PdfPTableEvent
{

	public abstract void tableLayout(PdfPTable pdfptable, float af[][], float af1[], int i, int j, PdfContentByte apdfcontentbyte[]);
}
