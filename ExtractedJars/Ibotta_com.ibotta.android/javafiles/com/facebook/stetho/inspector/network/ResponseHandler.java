// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.io.IOException;

public interface ResponseHandler
{

	public abstract void onEOF();

	public abstract void onError(IOException ioexception);

	public abstract void onRead(int i);

	public abstract void onReadDecoded(int i);
}
