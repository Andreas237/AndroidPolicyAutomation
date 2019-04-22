// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.holder;

import android.view.View;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawAdapterListener;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.AbstractWithdrawRow;

public abstract class AbstractWithdrawViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	public AbstractWithdrawViewHolder(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.support.v7.widget.RecyclerView.LayoutParams(-1, -2))));
	//    3    5:aload_1         
	//    4    6:new             #11  <Class android.support.v7.widget.RecyclerView$LayoutParams>
	//    5    9:dup             
	//    6   10:iconst_m1       
	//    7   11:bipush          -2
	//    8   13:invokespecial   #14  <Method void android.support.v7.widget.RecyclerView$LayoutParams(int, int)>
	//    9   16:invokevirtual   #20  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   10   19:return          
	}

	public abstract void bind(AbstractWithdrawRow abstractwithdrawrow, WithdrawAdapterListener withdrawadapterlistener);
}
