// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


interface ViewInfoStore$ProcessCallback
{

	public abstract void processAppeared(RecyclerView.ViewHolder viewholder, HolderInfo holderinfo, HolderInfo holderinfo1);

	public abstract void processDisappeared(RecyclerView.ViewHolder viewholder, HolderInfo holderinfo, HolderInfo holderinfo1);

	public abstract void processPersistent(RecyclerView.ViewHolder viewholder, HolderInfo holderinfo, HolderInfo holderinfo1);

	public abstract void unused(RecyclerView.ViewHolder viewholder);
}
