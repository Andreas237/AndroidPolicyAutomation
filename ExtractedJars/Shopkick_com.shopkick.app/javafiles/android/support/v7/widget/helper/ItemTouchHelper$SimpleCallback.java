// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

public static abstract class ItemTouchHelper$SimpleCallback extends ItemTouchHelper.Callback
{

	public int getDragDirs(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		return mDefaultDragDirs;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int mDefaultDragDirs>
	//    2    4:ireturn         
	}

	public int getMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		return makeMovementFlags(getDragDirs(recyclerview, viewholder), getSwipeDirs(recyclerview, viewholder));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #27  <Method int getDragDirs(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #30  <Method int getSwipeDirs(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//    8   12:invokestatic    #34  <Method int makeMovementFlags(int, int)>
	//    9   15:ireturn         
	}

	public int getSwipeDirs(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		return mDefaultSwipeDirs;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int mDefaultSwipeDirs>
	//    2    4:ireturn         
	}

	public void setDefaultDragDirs(int i)
	{
		mDefaultDragDirs = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int mDefaultDragDirs>
	//    3    5:return          
	}

	public void setDefaultSwipeDirs(int i)
	{
		mDefaultSwipeDirs = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int mDefaultSwipeDirs>
	//    3    5:return          
	}

	private int mDefaultDragDirs;
	private int mDefaultSwipeDirs;

	public ItemTouchHelper$SimpleCallback(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ItemTouchHelper$Callback()>
		mDefaultSwipeDirs = j;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #17  <Field int mDefaultSwipeDirs>
		mDefaultDragDirs = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #19  <Field int mDefaultDragDirs>
	//    8   14:return          
	}
}
