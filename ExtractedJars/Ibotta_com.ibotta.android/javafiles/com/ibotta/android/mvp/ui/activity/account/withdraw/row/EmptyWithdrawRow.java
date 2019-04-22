// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.row;


// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.row:
//			AbstractWithdrawRow, WithdrawRowType

public class EmptyWithdrawRow extends AbstractWithdrawRow
{

	public EmptyWithdrawRow(String s)
	{
		super(WithdrawRowType.EMPTY);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field WithdrawRowType WithdrawRowType.EMPTY>
	//    2    4:invokespecial   #17  <Method void AbstractWithdrawRow(WithdrawRowType)>
		inviteFriendsCta = s;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #19  <Field String inviteFriendsCta>
	//    6   12:return          
	}

	public String getInviteFriendsCta()
	{
		return inviteFriendsCta;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String inviteFriendsCta>
	//    2    4:areturn         
	}

	private final String inviteFriendsCta;
}
