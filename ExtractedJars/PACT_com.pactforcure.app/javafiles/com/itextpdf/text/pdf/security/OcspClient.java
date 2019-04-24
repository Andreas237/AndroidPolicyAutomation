// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.cert.X509Certificate;

public interface OcspClient
{

	public abstract byte[] getEncoded(X509Certificate x509certificate, X509Certificate x509certificate1, String s);
}
