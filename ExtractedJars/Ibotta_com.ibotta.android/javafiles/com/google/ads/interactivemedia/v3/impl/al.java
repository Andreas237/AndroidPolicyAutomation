// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.player.AdProgressProvider;
import com.google.ads.interactivemedia.v3.impl.data.b;
import com.google.ads.interactivemedia.v3.impl.data.l;

public interface al
	extends com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener, AdProgressProvider
{

	public abstract void a();

	public abstract void a(b b1);

	public abstract boolean a(aa.c c1, l l);

	public abstract void b();

	public abstract boolean b(aa.c c1, l l);

	public abstract void c();

	public abstract void d();

	public abstract void e();

	public abstract boolean f();
}
