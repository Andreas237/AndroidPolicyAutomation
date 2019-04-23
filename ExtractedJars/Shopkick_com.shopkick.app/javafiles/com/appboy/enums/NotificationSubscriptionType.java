// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;

import com.appboy.models.IPutIntoJson;

public final class NotificationSubscriptionType extends Enum
	implements IPutIntoJson
{

	private NotificationSubscriptionType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static NotificationSubscriptionType valueOf(String s)
	{
		return (NotificationSubscriptionType)Enum.valueOf(com/appboy/enums/NotificationSubscriptionType, s);
	//    0    0:ldc1            #2   <Class NotificationSubscriptionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class NotificationSubscriptionType>
	//    4    9:areturn         
	}

	public static NotificationSubscriptionType[] values()
	{
		return (NotificationSubscriptionType[])((NotificationSubscriptionType []) (a)).clone();
	//    0    0:getstatic       #32  <Field NotificationSubscriptionType[] a>
	//    1    3:invokevirtual   #47  <Method Object _5B_Lcom.appboy.enums.NotificationSubscriptionType_3B_.clone()>
	//    2    6:checkcast       #43  <Class NotificationSubscriptionType[]>
	//    3    9:areturn         
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method String forJsonPut()>
	//    2    4:areturn         
	}

	public String forJsonPut()
	{
		static class _cls1
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

		switch(_cls1.a[ordinal()])
	//*   0    0:getstatic       #54  <Field int[] NotificationSubscriptionType$1.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #58  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 44
	//	               2 41
	//	               3 38
		default:
			return null;
	//    5   36:aconst_null     
	//    6   37:areturn         

		case 3: // '\003'
			return "opted_in";
	//    7   38:ldc1            #60  <String "opted_in">
	//    8   40:areturn         

		case 2: // '\002'
			return "subscribed";
	//    9   41:ldc1            #62  <String "subscribed">
	//   10   43:areturn         

		case 1: // '\001'
			return "unsubscribed";
	//   11   44:ldc1            #64  <String "unsubscribed">
	//   12   46:areturn         
		}
	}

	public static final NotificationSubscriptionType OPTED_IN;
	public static final NotificationSubscriptionType SUBSCRIBED;
	public static final NotificationSubscriptionType UNSUBSCRIBED;
	private static final NotificationSubscriptionType a[];

	static 
	{
		OPTED_IN = new NotificationSubscriptionType("OPTED_IN", 0);
	//    0    0:new             #2   <Class NotificationSubscriptionType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "OPTED_IN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void NotificationSubscriptionType(String, int)>
	//    5   10:putstatic       #24  <Field NotificationSubscriptionType OPTED_IN>
		SUBSCRIBED = new NotificationSubscriptionType("SUBSCRIBED", 1);
	//    6   13:new             #2   <Class NotificationSubscriptionType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "SUBSCRIBED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void NotificationSubscriptionType(String, int)>
	//   11   23:putstatic       #27  <Field NotificationSubscriptionType SUBSCRIBED>
		UNSUBSCRIBED = new NotificationSubscriptionType("UNSUBSCRIBED", 2);
	//   12   26:new             #2   <Class NotificationSubscriptionType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "UNSUBSCRIBED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void NotificationSubscriptionType(String, int)>
	//   17   36:putstatic       #30  <Field NotificationSubscriptionType UNSUBSCRIBED>
		a = (new NotificationSubscriptionType[] {
			OPTED_IN, SUBSCRIBED, UNSUBSCRIBED
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       NotificationSubscriptionType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #24  <Field NotificationSubscriptionType OPTED_IN>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #27  <Field NotificationSubscriptionType SUBSCRIBED>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #30  <Field NotificationSubscriptionType UNSUBSCRIBED>
	//   31   60:aastore         
	//   32   61:putstatic       #32  <Field NotificationSubscriptionType[] a>
	//*  33   64:return          
	}
}
