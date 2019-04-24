// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


public interface ExtraEncoding
{

	public abstract String byteToChar(byte abyte0[], String s);

	public abstract byte[] charToByte(char c, String s);

	public abstract byte[] charToByte(String s, String s1);
}
