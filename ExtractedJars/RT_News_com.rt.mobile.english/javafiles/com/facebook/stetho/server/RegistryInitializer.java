// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import org.apache.http.protocol.HttpRequestHandlerRegistry;

public interface RegistryInitializer
{

	public abstract HttpRequestHandlerRegistry getRegistry();
}
