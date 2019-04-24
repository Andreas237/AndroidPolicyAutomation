// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.interfaces;


// Referenced classes of package com.itextpdf.text.pdf.interfaces:
//			PdfIsoConformance

public interface PdfXConformance
	extends PdfIsoConformance
{

	public abstract int getPDFXConformance();

	public abstract boolean isPdfX();

	public abstract void setPDFXConformance(int i);
}
