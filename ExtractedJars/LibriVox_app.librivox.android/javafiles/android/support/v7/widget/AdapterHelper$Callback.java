// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


interface AdapterHelper$Callback
{

	public abstract  findViewHolder(int i);

	public abstract void markViewHoldersUpdated(int i, int j, Object obj);

	public abstract void offsetPositionsForAdd(int i, int j);

	public abstract void offsetPositionsForMove(int i, int j);

	public abstract void offsetPositionsForRemovingInvisible(int i, int j);

	public abstract void offsetPositionsForRemovingLaidOutOrNewView(int i, int j);

	public abstract void onDispatchFirstPass(AdapterHelper$UpdateOp adapterhelper$updateop);

	public abstract void onDispatchSecondPass(AdapterHelper$UpdateOp adapterhelper$updateop);
}
