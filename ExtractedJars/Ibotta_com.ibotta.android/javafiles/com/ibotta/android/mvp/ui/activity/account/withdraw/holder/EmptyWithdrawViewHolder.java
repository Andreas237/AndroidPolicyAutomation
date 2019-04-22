// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.holder;

import android.content.Context;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawAdapterListener;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.AbstractWithdrawRow;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.EmptyWithdrawRow;
import com.ibotta.android.views.empty.*;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.holder:
//			AbstractWithdrawViewHolder

public class EmptyWithdrawViewHolder extends AbstractWithdrawViewHolder
	implements EmptyViewEvents
{

	public EmptyWithdrawViewHolder(EmptyView emptyview)
	{
		super(((android.view.View) (emptyview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void AbstractWithdrawViewHolder(android.view.View)>
		evEmpty = emptyview;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #18  <Field EmptyView evEmpty>
	//    6   10:return          
	}

	public volatile void bind(AbstractWithdrawRow abstractwithdrawrow, WithdrawAdapterListener withdrawadapterlistener)
	{
		bind((EmptyWithdrawRow)abstractwithdrawrow, withdrawadapterlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class EmptyWithdrawRow>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #26  <Method void bind(EmptyWithdrawRow, WithdrawAdapterListener)>
	//    5    9:return          
	}

	public void bind(EmptyWithdrawRow emptywithdrawrow, WithdrawAdapterListener withdrawadapterlistener)
	{
		listener = withdrawadapterlistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #28  <Field WithdrawAdapterListener listener>
		evEmpty.bindViewEvents(((EmptyViewEvents) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field EmptyView evEmpty>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #34  <Method void EmptyView.bindViewEvents(EmptyViewEvents)>
		withdrawadapterlistener = ((WithdrawAdapterListener) (evEmpty));
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field EmptyView evEmpty>
	//    9   17:astore_2        
		((EmptyView) (withdrawadapterlistener)).updateViewState(new EmptyViewState(0x7f080290, ((EmptyView) (withdrawadapterlistener)).getContext().getString(0x7f11067f), emptywithdrawrow.getInviteFriendsCta()));
	//   10   18:aload_2         
	//   11   19:new             #36  <Class EmptyViewState>
	//   12   22:dup             
	//   13   23:ldc1            #37  <Int 0x7f080290>
	//   14   25:aload_2         
	//   15   26:invokevirtual   #41  <Method Context EmptyView.getContext()>
	//   16   29:ldc1            #42  <Int 0x7f11067f>
	//   17   31:invokevirtual   #48  <Method String Context.getString(int)>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #52  <Method String EmptyWithdrawRow.getInviteFriendsCta()>
	//   20   38:invokespecial   #55  <Method void EmptyViewState(int, String, String)>
	//   21   41:invokevirtual   #59  <Method void EmptyView.updateViewState(EmptyViewState)>
	//   22   44:return          
	}

	public void onActionButtonClick()
	{
		WithdrawAdapterListener withdrawadapterlistener = listener;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field WithdrawAdapterListener listener>
	//    2    4:astore_1        
		if(withdrawadapterlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			withdrawadapterlistener.onInviteFriendsClicked();
	//    5    9:aload_1         
	//    6   10:invokeinterface #66  <Method void WithdrawAdapterListener.onInviteFriendsClicked()>
	//    7   15:return          
	}

	public void onEmptyViewClicked()
	{
		com.ibotta.android.views.empty.EmptyViewEvents._2D_CC.$default$onEmptyViewClicked(((EmptyViewEvents) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #73  <Method void com.ibotta.android.views.empty.EmptyViewEvents$_2D_CC.$default$onEmptyViewClicked(EmptyViewEvents)>
	//    2    4:return          
	}

	public void onListViewTouched()
	{
		com.ibotta.android.views.list.IbottaListViewEvents._2D_CC.$default$onListViewTouched(((com.ibotta.android.views.list.IbottaListViewEvents) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #81  <Method void com.ibotta.android.views.list.IbottaListViewEvents$_2D_CC.$default$onListViewTouched(com.ibotta.android.views.list.IbottaListViewEvents)>
	//    2    4:return          
	}

	private final EmptyView evEmpty;
	private WithdrawAdapterListener listener;
}
