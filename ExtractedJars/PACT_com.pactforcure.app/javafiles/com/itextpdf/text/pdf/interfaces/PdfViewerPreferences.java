// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.interfaces;

import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;

public interface PdfViewerPreferences
{

	public abstract void addViewerPreference(PdfName pdfname, PdfObject pdfobject);

	public abstract void setViewerPreferences(int i);
}
