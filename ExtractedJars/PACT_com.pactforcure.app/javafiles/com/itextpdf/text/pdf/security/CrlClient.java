// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.cert.X509Certificate;
import java.util.Collection;

public interface CrlClient
{

	public abstract Collection getEncoded(X509Certificate x509certificate, String s);
}
