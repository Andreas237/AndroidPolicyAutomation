// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.os.Message;

public interface HandlerWrapper
{

	public abstract Looper getLooper();

	public abstract Message obtainMessage(int i);

	public abstract Message obtainMessage(int i, int j, int k);

	public abstract Message obtainMessage(int i, int j, int k, Object obj);

	public abstract Message obtainMessage(int i, Object obj);

	public abstract boolean post(Runnable runnable);

	public abstract boolean postDelayed(Runnable runnable, long l);

	public abstract void removeCallbacksAndMessages(Object obj);

	public abstract void removeMessages(int i);

	public abstract boolean sendEmptyMessage(int i);

	public abstract boolean sendEmptyMessageAtTime(int i, long l);
}
