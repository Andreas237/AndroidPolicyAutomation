// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import org.w3c.dom.Document;

public interface XmlLocator
{

	public abstract Document getDocument();

	public abstract String getEncoding();

	public abstract void setDocument(Document document)
		throws IOException, DocumentException;
}
