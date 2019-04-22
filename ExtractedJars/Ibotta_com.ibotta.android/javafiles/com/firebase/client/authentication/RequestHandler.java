// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import java.io.IOException;
import java.util.Map;

interface RequestHandler
{

	public abstract void onError(IOException ioexception);

	public abstract void onResult(Map map);
}
