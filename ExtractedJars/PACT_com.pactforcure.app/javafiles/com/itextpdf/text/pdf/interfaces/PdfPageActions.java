// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.interfaces;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;

public interface PdfPageActions
{

	public abstract void setDuration(int i);

	public abstract void setPageAction(PdfName pdfname, PdfAction pdfaction)
		throws DocumentException;

	public abstract void setTransition(PdfTransition pdftransition);
}
