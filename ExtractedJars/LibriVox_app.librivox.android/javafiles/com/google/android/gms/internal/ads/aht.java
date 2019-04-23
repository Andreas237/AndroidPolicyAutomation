// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.c.a;
import java.util.List;
import java.util.Map;

public interface aht
	extends IInterface
{

	public abstract int a(String s);

	public abstract String a();

	public abstract List a(String s, String s1);

	public abstract Map a(String s, String s1, boolean flag);

	public abstract void a(Bundle bundle);

	public abstract void a(a a1, String s, String s1);

	public abstract void a(String s, String s1, Bundle bundle);

	public abstract void a(String s, String s1, a a1);

	public abstract Bundle b(Bundle bundle);

	public abstract String b();

	public abstract void b(String s);

	public abstract void b(String s, String s1, Bundle bundle);

	public abstract long c();

	public abstract void c(Bundle bundle);

	public abstract void c(String s);

	public abstract String d();

	public abstract String e();

	public abstract String f();
}
