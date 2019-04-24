// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.trace;

import java.util.List;

public interface TraceListener
{

	public abstract void onFinished(int i, List list, int j, int k);

	public abstract void onRequestFailed(int i, String s);

	public abstract void onTraceProcessing(int i, int j, List list);
}
