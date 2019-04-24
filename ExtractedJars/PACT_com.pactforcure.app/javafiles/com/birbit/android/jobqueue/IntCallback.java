// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;


public interface IntCallback
{
	public static interface MessageWithCallback
	{

		public abstract void setCallback(IntCallback intcallback);
	}


	public abstract void onResult(int i);
}
