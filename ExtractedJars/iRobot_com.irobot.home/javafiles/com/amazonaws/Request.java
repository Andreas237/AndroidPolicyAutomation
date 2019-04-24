// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;

public interface Request
{

	public abstract Map a();

	public abstract void a(int i);

	public abstract void a(HttpMethodName httpmethodname);

	public abstract void a(InputStream inputstream);

	public abstract void a(String s);

	public abstract void a(String s, String s1);

	public abstract void a(URI uri);

	public abstract String b();

	public abstract void b(String s, String s1);

	public abstract Map c();

	public abstract HttpMethodName d();

	public abstract URI e();

	public abstract InputStream f();

	public abstract int g();
}
