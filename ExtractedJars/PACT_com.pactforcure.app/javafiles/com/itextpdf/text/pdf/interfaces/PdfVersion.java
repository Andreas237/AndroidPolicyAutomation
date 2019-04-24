// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.interfaces;

import com.itextpdf.text.pdf.PdfDeveloperExtension;
import com.itextpdf.text.pdf.PdfName;

public interface PdfVersion
{

	public abstract void addDeveloperExtension(PdfDeveloperExtension pdfdeveloperextension);

	public abstract void setAtLeastPdfVersion(char c);

	public abstract void setPdfVersion(char c);

	public abstract void setPdfVersion(PdfName pdfname);
}
