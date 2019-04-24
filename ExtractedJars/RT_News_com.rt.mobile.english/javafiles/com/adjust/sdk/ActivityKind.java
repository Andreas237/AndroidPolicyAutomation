// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;


public final class ActivityKind extends Enum
{

	private ActivityKind(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #48  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ActivityKind fromString(String s)
	{
		if("session".equals(((Object) (s))))
	//*   0    0:ldc1            #53  <String "session">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            13
			return SESSION;
	//    4    9:getstatic       #29  <Field ActivityKind SESSION>
	//    5   12:areturn         
		if("event".equals(((Object) (s))))
	//*   6   13:ldc1            #61  <String "event">
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*   9   19:ifeq            26
			return EVENT;
	//   10   22:getstatic       #32  <Field ActivityKind EVENT>
	//   11   25:areturn         
		if("click".equals(((Object) (s))))
	//*  12   26:ldc1            #63  <String "click">
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  15   32:ifeq            39
			return CLICK;
	//   16   35:getstatic       #35  <Field ActivityKind CLICK>
	//   17   38:areturn         
		if("attribution".equals(((Object) (s))))
	//*  18   39:ldc1            #65  <String "attribution">
	//*  19   41:aload_0         
	//*  20   42:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  21   45:ifeq            52
			return ATTRIBUTION;
	//   22   48:getstatic       #38  <Field ActivityKind ATTRIBUTION>
	//   23   51:areturn         
		else
			return UNKNOWN;
	//   24   52:getstatic       #26  <Field ActivityKind UNKNOWN>
	//   25   55:areturn         
	}

	public static ActivityKind valueOf(String s)
	{
		return (ActivityKind)Enum.valueOf(com/adjust/sdk/ActivityKind, s);
	//    0    0:ldc1            #2   <Class ActivityKind>
	//    1    2:aload_0         
	//    2    3:invokestatic    #69  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ActivityKind>
	//    4    9:areturn         
	}

	public static ActivityKind[] values()
	{
		return (ActivityKind[])((ActivityKind []) ($VALUES)).clone();
	//    0    0:getstatic       #46  <Field ActivityKind[] $VALUES>
	//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.adjust.sdk.ActivityKind_3B_.clone()>
	//    2    6:checkcast       #72  <Class ActivityKind[]>
	//    3    9:areturn         
	}

	public String toString()
	{
		static class _cls1
		{

			static final int $SwitchMap$com$adjust$sdk$ActivityKind[];

			static 
			{
				$SwitchMap$com$adjust$sdk$ActivityKind = new int[ActivityKind.values().length];
			//    0    0:invokestatic    #16  <Method ActivityKind[] ActivityKind.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
				try
				{
					$SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.SESSION.ordinal()] = 1;
			//    4    9:getstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
			//    5   12:getstatic       #22  <Field ActivityKind ActivityKind.SESSION>
			//    6   15:invokevirtual   #26  <Method int ActivityKind.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
			//*  10   23:getstatic       #29  <Field ActivityKind ActivityKind.EVENT>
			//*  11   26:invokevirtual   #26  <Method int ActivityKind.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
			//*  15   34:getstatic       #32  <Field ActivityKind ActivityKind.CLICK>
			//*  16   37:invokevirtual   #26  <Method int ActivityKind.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
			//*  20   45:getstatic       #35  <Field ActivityKind ActivityKind.ATTRIBUTION>
			//*  21   48:invokevirtual   #26  <Method int ActivityKind.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.EVENT.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.CLICK.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.ATTRIBUTION.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1..SwitchMap.com.adjust.sdk.ActivityKind[ordinal()])
	//*   0    0:getstatic       #82  <Field int[] ActivityKind$1.$SwitchMap$com$adjust$sdk$ActivityKind>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #86  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 4: default 40
	//	               1 52
	//	               2 49
	//	               3 46
	//	               4 43
		default:
			return "unknown";
	//    5   40:ldc1            #88  <String "unknown">
	//    6   42:areturn         

		case 4: // '\004'
			return "attribution";
	//    7   43:ldc1            #65  <String "attribution">
	//    8   45:areturn         

		case 3: // '\003'
			return "click";
	//    9   46:ldc1            #63  <String "click">
	//   10   48:areturn         

		case 2: // '\002'
			return "event";
	//   11   49:ldc1            #61  <String "event">
	//   12   51:areturn         

		case 1: // '\001'
			return "session";
	//   13   52:ldc1            #53  <String "session">
	//   14   54:areturn         
		}
	}

	private static final ActivityKind $VALUES[];
	public static final ActivityKind ATTRIBUTION;
	public static final ActivityKind CLICK;
	public static final ActivityKind EVENT;
	public static final ActivityKind REATTRIBUTION;
	public static final ActivityKind REVENUE;
	public static final ActivityKind SESSION;
	public static final ActivityKind UNKNOWN;

	static 
	{
		UNKNOWN = new ActivityKind("UNKNOWN", 0);
	//    0    0:new             #2   <Class ActivityKind>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void ActivityKind(String, int)>
	//    5   10:putstatic       #26  <Field ActivityKind UNKNOWN>
		SESSION = new ActivityKind("SESSION", 1);
	//    6   13:new             #2   <Class ActivityKind>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "SESSION">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void ActivityKind(String, int)>
	//   11   23:putstatic       #29  <Field ActivityKind SESSION>
		EVENT = new ActivityKind("EVENT", 2);
	//   12   26:new             #2   <Class ActivityKind>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "EVENT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void ActivityKind(String, int)>
	//   17   36:putstatic       #32  <Field ActivityKind EVENT>
		CLICK = new ActivityKind("CLICK", 3);
	//   18   39:new             #2   <Class ActivityKind>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "CLICK">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void ActivityKind(String, int)>
	//   23   49:putstatic       #35  <Field ActivityKind CLICK>
		ATTRIBUTION = new ActivityKind("ATTRIBUTION", 4);
	//   24   52:new             #2   <Class ActivityKind>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "ATTRIBUTION">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void ActivityKind(String, int)>
	//   29   62:putstatic       #38  <Field ActivityKind ATTRIBUTION>
		REVENUE = new ActivityKind("REVENUE", 5);
	//   30   65:new             #2   <Class ActivityKind>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "REVENUE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void ActivityKind(String, int)>
	//   35   75:putstatic       #41  <Field ActivityKind REVENUE>
		REATTRIBUTION = new ActivityKind("REATTRIBUTION", 6);
	//   36   78:new             #2   <Class ActivityKind>
	//   37   81:dup             
	//   38   82:ldc1            #42  <String "REATTRIBUTION">
	//   39   84:bipush          6
	//   40   86:invokespecial   #24  <Method void ActivityKind(String, int)>
	//   41   89:putstatic       #44  <Field ActivityKind REATTRIBUTION>
		$VALUES = (new ActivityKind[] {
			UNKNOWN, SESSION, EVENT, CLICK, ATTRIBUTION, REVENUE, REATTRIBUTION
		});
	//   42   92:bipush          7
	//   43   94:anewarray       ActivityKind[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #26  <Field ActivityKind UNKNOWN>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #29  <Field ActivityKind SESSION>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #32  <Field ActivityKind EVENT>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #35  <Field ActivityKind CLICK>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #38  <Field ActivityKind ATTRIBUTION>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #41  <Field ActivityKind REVENUE>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #44  <Field ActivityKind REATTRIBUTION>
	//   71  139:aastore         
	//   72  140:putstatic       #46  <Field ActivityKind[] $VALUES>
	//*  73  143:return          
	}
}
