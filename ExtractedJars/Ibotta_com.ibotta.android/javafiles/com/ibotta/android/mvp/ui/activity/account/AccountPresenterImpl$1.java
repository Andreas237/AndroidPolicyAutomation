// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;


// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountPresenterImpl, AccountMenu

static class AccountPresenterImpl$1
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
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.BONUSES.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//    5   12:getstatic       #24  <Field AccountMenu AccountMenu.BONUSES>
	//    6   15:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*  10   23:getstatic       #31  <Field AccountMenu AccountMenu.PAYMENT_HISTORY>
	//*  11   26:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*  15   34:getstatic       #34  <Field AccountMenu AccountMenu.INVITE_FRIENDS>
	//*  16   37:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*  20   45:getstatic       #37  <Field AccountMenu AccountMenu.TEAMWORK>
	//*  21   48:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*  25   56:getstatic       #40  <Field AccountMenu AccountMenu.MY_EARNINGS>
	//*  26   59:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*  30   67:getstatic       #43  <Field AccountMenu AccountMenu.MY_FAVORITES>
	//*  31   70:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*  35   79:getstatic       #46  <Field AccountMenu AccountMenu.SETTINGS>
	//*  36   82:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*  40   91:getstatic       #49  <Field AccountMenu AccountMenu.HELP>
	//*  41   94:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*  45  103:getstatic       #52  <Field AccountMenu AccountMenu.HOW_TO>
	//*  46  106:invokevirtual   #28  <Method int AccountMenu.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   50  113:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.PAYMENT_HISTORY.ordinal()] = 2;
		}
	//*  51  114:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   52  117:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.INVITE_FRIENDS.ordinal()] = 3;
		}
	//*  53  118:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   54  121:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.TEAMWORK.ordinal()] = 4;
		}
	//*  55  122:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   56  125:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.MY_EARNINGS.ordinal()] = 5;
		}
	//*  57  126:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   58  129:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.MY_FAVORITES.ordinal()] = 6;
		}
	//*  59  130:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   60  133:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.SETTINGS.ordinal()] = 7;
		}
	//*  61  134:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   62  137:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.HELP.ordinal()] = 8;
		}
	//*  63  138:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   64  141:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.HOW_TO.ordinal()] = 9;
		}
	//*  65  142:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   66  145:astore_0        
	//*  67  146:return          
	}
}
