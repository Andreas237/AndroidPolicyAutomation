// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;


// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawPresenterImpl

static class WithdrawPresenterImpl$1
{

	static final int $SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type[];

	static 
	{
		$SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type = new int[com.ibotta.api.model.customer.CustomerAccount.Type.values().length];
	//    0    0:invokestatic    #18  <Method com.ibotta.api.model.customer.CustomerAccount$Type[] com.ibotta.api.model.customer.CustomerAccount$Type.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type>
		try
		{
			$SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type[com.ibotta.api.model.customer.CustomerAccount.Type.PAYPAL.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type>
	//    5   12:getstatic       #24  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.PAYPAL>
	//    6   15:invokevirtual   #28  <Method int com.ibotta.api.model.customer.CustomerAccount$Type.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type>
	//*  10   23:getstatic       #31  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.VENMO>
	//*  11   26:invokevirtual   #28  <Method int com.ibotta.api.model.customer.CustomerAccount$Type.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			$SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type[com.ibotta.api.model.customer.CustomerAccount.Type.VENMO.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
