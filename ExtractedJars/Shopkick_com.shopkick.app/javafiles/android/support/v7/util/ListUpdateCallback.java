// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


public interface ListUpdateCallback
{

	public abstract void onChanged(int i, int j, Object obj);

	public abstract void onInserted(int i, int j);

	public abstract void onMoved(int i, int j);

	public abstract void onRemoved(int i, int j);
}
