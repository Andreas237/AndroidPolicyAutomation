// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.row;

import com.ibotta.android.views.base.title.TitleBarViewState;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.row:
//			AbstractWithdrawRow, WithdrawRowType

public class TitleBarRow extends AbstractWithdrawRow
{

	public TitleBarRow(TitleBarViewState titlebarviewstate, boolean flag)
	{
		this(titlebarviewstate, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #14  <Method void TitleBarRow(TitleBarViewState, boolean, boolean)>
	//    5    7:return          
	}

	public TitleBarRow(TitleBarViewState titlebarviewstate, boolean flag, boolean flag1)
	{
		super(WithdrawRowType.TITLE);
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field WithdrawRowType WithdrawRowType.TITLE>
	//    2    4:invokespecial   #24  <Method void AbstractWithdrawRow(WithdrawRowType)>
		titleBarViewState = titlebarviewstate;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #26  <Field TitleBarViewState titleBarViewState>
		belowMinimumBalance = flag;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:putfield        #28  <Field boolean belowMinimumBalance>
		showExtraMarginTop = flag1;
	//    9   17:aload_0         
	//   10   18:iload_3         
	//   11   19:putfield        #30  <Field boolean showExtraMarginTop>
	//   12   22:return          
	}

	public TitleBarViewState getTitleBarViewState()
	{
		return titleBarViewState;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field TitleBarViewState titleBarViewState>
	//    2    4:areturn         
	}

	public boolean isBelowMinimumBalance()
	{
		return belowMinimumBalance;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean belowMinimumBalance>
	//    2    4:ireturn         
	}

	public boolean showExtraMarginTop()
	{
		return showExtraMarginTop;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean showExtraMarginTop>
	//    2    4:ireturn         
	}

	private final boolean belowMinimumBalance;
	private final boolean showExtraMarginTop;
	private final TitleBarViewState titleBarViewState;
}
