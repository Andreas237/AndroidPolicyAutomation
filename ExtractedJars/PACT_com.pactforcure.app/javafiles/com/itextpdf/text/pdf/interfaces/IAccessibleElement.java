// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.interfaces;

import com.itextpdf.text.AccessibleElementId;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import java.util.HashMap;

public interface IAccessibleElement
{

	public abstract PdfObject getAccessibleAttribute(PdfName pdfname);

	public abstract HashMap getAccessibleAttributes();

	public abstract AccessibleElementId getId();

	public abstract PdfName getRole();

	public abstract boolean isInline();

	public abstract void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject);

	public abstract void setId(AccessibleElementId accessibleelementid);

	public abstract void setRole(PdfName pdfname);
}
