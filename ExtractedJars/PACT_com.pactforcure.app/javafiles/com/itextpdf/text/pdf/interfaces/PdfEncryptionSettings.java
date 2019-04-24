// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.interfaces;

import com.itextpdf.text.DocumentException;
import java.security.cert.Certificate;

public interface PdfEncryptionSettings
{

	public abstract void setEncryption(byte abyte0[], byte abyte1[], int i, int j)
		throws DocumentException;

	public abstract void setEncryption(Certificate acertificate[], int ai[], int i)
		throws DocumentException;
}
