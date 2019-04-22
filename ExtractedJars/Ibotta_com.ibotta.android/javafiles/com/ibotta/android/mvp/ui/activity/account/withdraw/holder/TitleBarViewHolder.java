// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.holder;

import android.content.res.Resources;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawAdapterListener;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.AbstractWithdrawRow;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.TitleBarRow;
import com.ibotta.android.views.base.title.TitleBarView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.holder:
//			AbstractWithdrawViewHolder

public class TitleBarViewHolder extends AbstractWithdrawViewHolder
{

	public TitleBarViewHolder(TitleBarView titlebarview)
	{
		super(((android.view.View) (titlebarview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void AbstractWithdrawViewHolder(android.view.View)>
		tbvTitleBar = titlebarview;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #14  <Field TitleBarView tbvTitleBar>
	//    6   10:return          
	}

	public volatile void bind(AbstractWithdrawRow abstractwithdrawrow, WithdrawAdapterListener withdrawadapterlistener)
	{
		bind((TitleBarRow)abstractwithdrawrow, withdrawadapterlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #19  <Class TitleBarRow>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #22  <Method void bind(TitleBarRow, WithdrawAdapterListener)>
	//    5    9:return          
	}

	public void bind(TitleBarRow titlebarrow, WithdrawAdapterListener withdrawadapterlistener)
	{
		tbvTitleBar.updateViewState(titlebarrow.getTitleBarViewState());
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field TitleBarView tbvTitleBar>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method com.ibotta.android.views.base.title.TitleBarViewState TitleBarRow.getTitleBarViewState()>
	//    4    8:invokevirtual   #32  <Method void TitleBarView.updateViewState(com.ibotta.android.views.base.title.TitleBarViewState)>
		withdrawadapterlistener = ((WithdrawAdapterListener) (tbvTitleBar.getResources()));
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field TitleBarView tbvTitleBar>
	//    7   15:invokevirtual   #36  <Method Resources TitleBarView.getResources()>
	//    8   18:astore_2        
		android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)tbvTitleBar.getLayoutParams();
	//    9   19:aload_0         
	//   10   20:getfield        #14  <Field TitleBarView tbvTitleBar>
	//   11   23:invokevirtual   #40  <Method android.view.ViewGroup$LayoutParams TitleBarView.getLayoutParams()>
	//   12   26:checkcast       #42  <Class android.support.v7.widget.RecyclerView$LayoutParams>
	//   13   29:astore_3        
		layoutparams.topMargin = ((Resources) (withdrawadapterlistener)).getDimensionPixelSize(0x7f070165);
	//   14   30:aload_3         
	//   15   31:aload_2         
	//   16   32:ldc1            #43  <Int 0x7f070165>
	//   17   34:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//   18   37:putfield        #53  <Field int android.support.v7.widget.RecyclerView$LayoutParams.topMargin>
		layoutparams.leftMargin = ((Resources) (withdrawadapterlistener)).getDimensionPixelSize(0x7f070165);
	//   19   40:aload_3         
	//   20   41:aload_2         
	//   21   42:ldc1            #43  <Int 0x7f070165>
	//   22   44:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//   23   47:putfield        #56  <Field int android.support.v7.widget.RecyclerView$LayoutParams.leftMargin>
		layoutparams.bottomMargin = ((Resources) (withdrawadapterlistener)).getDimensionPixelSize(0x7f070165);
	//   24   50:aload_3         
	//   25   51:aload_2         
	//   26   52:ldc1            #43  <Int 0x7f070165>
	//   27   54:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//   28   57:putfield        #59  <Field int android.support.v7.widget.RecyclerView$LayoutParams.bottomMargin>
		if(titlebarrow.showExtraMarginTop())
	//*  29   60:aload_1         
	//*  30   61:invokevirtual   #63  <Method boolean TitleBarRow.showExtraMarginTop()>
	//*  31   64:ifeq            77
			layoutparams.topMargin = ((Resources) (withdrawadapterlistener)).getDimensionPixelSize(0x7f0701a2);
	//   32   67:aload_3         
	//   33   68:aload_2         
	//   34   69:ldc1            #64  <Int 0x7f0701a2>
	//   35   71:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//   36   74:putfield        #53  <Field int android.support.v7.widget.RecyclerView$LayoutParams.topMargin>
		tbvTitleBar.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   37   77:aload_0         
	//   38   78:getfield        #14  <Field TitleBarView tbvTitleBar>
	//   39   81:aload_3         
	//   40   82:invokevirtual   #68  <Method void TitleBarView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   41   85:return          
	}

	private final TitleBarView tbvTitleBar;
}
