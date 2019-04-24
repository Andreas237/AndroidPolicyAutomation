// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfWriter, PdfObject

public interface ICachedColorSpace
{

	public abstract boolean equals(Object obj);

	public abstract PdfObject getPdfObject(PdfWriter pdfwriter);

	public abstract int hashCode();
}
