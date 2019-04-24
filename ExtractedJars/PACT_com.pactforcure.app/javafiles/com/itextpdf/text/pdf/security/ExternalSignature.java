// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.GeneralSecurityException;

public interface ExternalSignature
{

	public abstract String getEncryptionAlgorithm();

	public abstract String getHashAlgorithm();

	public abstract byte[] sign(byte abyte0[])
		throws GeneralSecurityException;
}
