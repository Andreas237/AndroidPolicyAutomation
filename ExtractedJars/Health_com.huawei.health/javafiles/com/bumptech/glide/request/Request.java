// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;


public interface Request
{

	public abstract void begin();

	public abstract void clear();

	public abstract boolean isCancelled();

	public abstract boolean isComplete();

	public abstract boolean isEquivalentTo(Request request);

	public abstract boolean isFailed();

	public abstract boolean isPaused();

	public abstract boolean isResourceSet();

	public abstract boolean isRunning();

	public abstract void pause();

	public abstract void recycle();
}
