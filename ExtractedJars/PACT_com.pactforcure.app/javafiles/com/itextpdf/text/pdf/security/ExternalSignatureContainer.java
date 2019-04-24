// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.pdf.PdfDictionary;
import java.io.InputStream;
import java.security.GeneralSecurityException;

public interface ExternalSignatureContainer
{

	public abstract void modifySigningDictionary(PdfDictionary pdfdictionary);

	public abstract byte[] sign(InputStream inputstream)
		throws GeneralSecurityException;
}
