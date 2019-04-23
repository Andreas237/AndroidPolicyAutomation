// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;


// Referenced classes of package com.appboy.enums:
//			NotificationSubscriptionType

static class NotificationSubscriptionType$1
{

	static final int a[];

	static 
	{
		a = new int[NotificationSubscriptionType.values().length];
	//    0    0:invokestatic    #16  <Method NotificationSubscriptionType[] NotificationSubscriptionType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] a>
		try
		{
			a[NotificationSubscriptionType.UNSUBSCRIBED.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] a>
	//    5   12:getstatic       #22  <Field NotificationSubscriptionType NotificationSubscriptionType.UNSUBSCRIBED>
	//    6   15:invokevirtual   #26  <Method int NotificationSubscriptionType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] a>
	//*  10   23:getstatic       #29  <Field NotificationSubscriptionType NotificationSubscriptionType.SUBSCRIBED>
	//*  11   26:invokevirtual   #26  <Method int NotificationSubscriptionType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] a>
	//*  15   34:getstatic       #32  <Field NotificationSubscriptionType NotificationSubscriptionType.OPTED_IN>
	//*  16   37:invokevirtual   #26  <Method int NotificationSubscriptionType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			a[NotificationSubscriptionType.SUBSCRIBED.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			a[NotificationSubscriptionType.OPTED_IN.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
