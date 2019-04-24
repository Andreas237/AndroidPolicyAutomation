// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfIndirectReference;
import com.itextpdf.text.pdf.PdfStream;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			PdfContentStreamProcessor

public interface XObjectDoHandler
{

	public abstract void handleXObject(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfStream pdfstream, PdfIndirectReference pdfindirectreference);
}
