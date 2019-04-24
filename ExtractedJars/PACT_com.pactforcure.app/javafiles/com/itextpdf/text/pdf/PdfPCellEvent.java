// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Rectangle;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPCell, PdfContentByte

public interface PdfPCellEvent
{

	public abstract void cellLayout(PdfPCell pdfpcell, Rectangle rectangle, PdfContentByte apdfcontentbyte[]);
}
