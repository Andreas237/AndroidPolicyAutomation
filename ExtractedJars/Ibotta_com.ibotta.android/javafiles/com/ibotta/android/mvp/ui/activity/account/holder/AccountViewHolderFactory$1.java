// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.holder;

import com.ibotta.android.mvp.ui.activity.account.AccountRowType;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.holder:
//			AccountViewHolderFactory

static class AccountViewHolderFactory$1
{

	static final int $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType[];

	static 
	{
		$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType = new int[AccountRowType.values().length];
	//    0    0:invokestatic    #18  <Method AccountRowType[] AccountRowType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType>
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType[AccountRowType.PROFILE.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType>
	//    5   12:getstatic       #24  <Field AccountRowType AccountRowType.PROFILE>
	//    6   15:invokevirtual   #28  <Method int AccountRowType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType>
	//*  10   23:getstatic       #31  <Field AccountRowType AccountRowType.MENU>
	//*  11   26:invokevirtual   #28  <Method int AccountRowType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType[AccountRowType.MENU.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
