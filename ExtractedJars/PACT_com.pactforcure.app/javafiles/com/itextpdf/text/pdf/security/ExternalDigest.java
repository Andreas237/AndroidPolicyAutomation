// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

public interface ExternalDigest
{

	public abstract MessageDigest getMessageDigest(String s)
		throws GeneralSecurityException;
}
