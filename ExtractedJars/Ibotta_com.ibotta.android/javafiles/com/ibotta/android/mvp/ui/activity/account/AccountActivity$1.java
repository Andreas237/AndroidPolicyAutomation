// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;


// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountActivity, AccountMenu

static class AccountActivity$1
{

	static final int $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[];

	static 
	{
		$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu = new int[AccountMenu.values().length];
	//    0    0:invokestatic    #18  <Method AccountMenu[] AccountMenu.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.INVITE_FRIENDS.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//    5   12:getstatic       #24  <Field AccountMenu AccountMenu.INVITE_FRIENDS>
	//    6   15:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
	//    9   20:return          
		}
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   21:astore_0        
	//*  11   22:return          
	}
}
