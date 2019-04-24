// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import java.util.Map;
import org.c.f.a.k;
import org.json.JSONObject;

public interface AxedaApiRestClient
{

	public abstract String getHeader(String s);

	public abstract k getRestTemplate();

	public abstract String getRootUrl();

	public abstract void setHeader(String s, String s1);

	public abstract void setRootUrl(String s);

	public abstract Map setStatus(String s, String s1, JSONObject jsonobject);
}
