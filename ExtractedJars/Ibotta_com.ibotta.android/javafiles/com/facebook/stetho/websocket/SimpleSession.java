// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;


public interface SimpleSession
{

	public abstract void close(int i, String s);

	public abstract boolean isOpen();

	public abstract void sendBinary(byte abyte0[]);

	public abstract void sendText(String s);
}
