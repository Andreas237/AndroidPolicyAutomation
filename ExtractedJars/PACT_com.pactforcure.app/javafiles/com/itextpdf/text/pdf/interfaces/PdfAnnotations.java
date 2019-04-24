// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.interfaces;

import com.itextpdf.text.pdf.*;

public interface PdfAnnotations
{

	public abstract void addAnnotation(PdfAnnotation pdfannotation);

	public abstract void addCalculationOrder(PdfFormField pdfformfield);

	public abstract PdfAcroForm getAcroForm();

	public abstract void setSigFlags(int i);
}
