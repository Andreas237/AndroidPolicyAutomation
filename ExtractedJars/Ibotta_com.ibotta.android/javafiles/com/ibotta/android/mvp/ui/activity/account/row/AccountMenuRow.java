// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.row;

import com.ibotta.android.mvp.ui.activity.account.AccountMenu;
import com.ibotta.android.mvp.ui.activity.account.AccountRowType;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.row:
//			AbstractAccountRow

public class AccountMenuRow extends AbstractAccountRow
{

	public AccountMenuRow()
	{
		super(AccountRowType.MENU);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field AccountRowType AccountRowType.MENU>
	//    2    4:invokespecial   #19  <Method void AbstractAccountRow(AccountRowType)>
	//    3    7:return          
	}

	public AccountMenu getAccountMenu()
	{
		return accountMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AccountMenu accountMenu>
	//    2    4:areturn         
	}

	public String getExtra()
	{
		return extra;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String extra>
	//    2    4:areturn         
	}

	public void setAccountMenu(AccountMenu accountmenu)
	{
		accountMenu = accountmenu;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field AccountMenu accountMenu>
	//    3    5:return          
	}

	public void setExtra(String s)
	{
		extra = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String extra>
	//    3    5:return          
	}

	private AccountMenu accountMenu;
	private String extra;
}
