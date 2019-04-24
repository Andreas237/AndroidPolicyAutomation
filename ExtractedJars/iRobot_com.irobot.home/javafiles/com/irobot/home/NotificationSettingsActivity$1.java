// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AccountViewState;

// Referenced classes of package com.irobot.home:
//			NotificationSettingsActivity

static class NotificationSettingsActivity$1
{

	static final int a[];

	static 
	{
		a = new int[AccountViewState.values().length];
	//    0    0:invokestatic    #18  <Method AccountViewState[] AccountViewState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[AccountViewState.ShowLoadingSpinner.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field AccountViewState AccountViewState.ShowLoadingSpinner>
	//    6   15:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field AccountViewState AccountViewState.ShowNotificationEmailSetting>
	//*  11   26:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field AccountViewState AccountViewState.ShowNotificationSettingsErrorDialog>
	//*  16   37:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] a>
	//*  20   45:getstatic       #37  <Field AccountViewState AccountViewState.ShowNotificationSettingsFailure>
	//*  21   48:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] a>
	//*  25   56:getstatic       #40  <Field AccountViewState AccountViewState.ShowNotificationSettingsUpdate>
	//*  26   59:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   30   65:astore_0        
		try
		{
			a[AccountViewState.ShowNotificationEmailSetting.ordinal()] = 2;
		}
	//*  31   66:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   32   69:astore_0        
		try
		{
			a[AccountViewState.ShowNotificationSettingsErrorDialog.ordinal()] = 3;
		}
	//*  33   70:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   34   73:astore_0        
		try
		{
			a[AccountViewState.ShowNotificationSettingsFailure.ordinal()] = 4;
		}
	//*  35   74:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   36   77:astore_0        
		try
		{
			a[AccountViewState.ShowNotificationSettingsUpdate.ordinal()] = 5;
		}
	//*  37   78:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   81:astore_0        
	//*  39   82:return          
	}
}
