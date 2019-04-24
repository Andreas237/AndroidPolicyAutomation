// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.messenger;


// Referenced classes of package com.facebook.messenger:
//			MessengerThreadParams

public static final class MessengerThreadParams$Origin extends Enum
{

	public static MessengerThreadParams$Origin valueOf(String s)
	{
		return (MessengerThreadParams$Origin)Enum.valueOf(com/facebook/messenger/MessengerThreadParams$Origin, s);
	//    0    0:ldc1            #2   <Class MessengerThreadParams$Origin>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MessengerThreadParams$Origin>
	//    4    9:areturn         
	}

	public static MessengerThreadParams$Origin[] values()
	{
		return (MessengerThreadParams$Origin[])((MessengerThreadParams$Origin []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field MessengerThreadParams$Origin[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.messenger.MessengerThreadParams$Origin_3B_.clone()>
	//    2    6:checkcast       #42  <Class MessengerThreadParams$Origin[]>
	//    3    9:areturn         
	}

	private static final MessengerThreadParams$Origin $VALUES[];
	public static final MessengerThreadParams$Origin COMPOSE_FLOW;
	public static final MessengerThreadParams$Origin REPLY_FLOW;
	public static final MessengerThreadParams$Origin UNKNOWN;

	static 
	{
		REPLY_FLOW = new MessengerThreadParams$Origin("REPLY_FLOW", 0);
	//    0    0:new             #2   <Class MessengerThreadParams$Origin>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "REPLY_FLOW">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void MessengerThreadParams$Origin(String, int)>
	//    5   10:putstatic       #23  <Field MessengerThreadParams$Origin REPLY_FLOW>
		COMPOSE_FLOW = new MessengerThreadParams$Origin("COMPOSE_FLOW", 1);
	//    6   13:new             #2   <Class MessengerThreadParams$Origin>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "COMPOSE_FLOW">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void MessengerThreadParams$Origin(String, int)>
	//   11   23:putstatic       #26  <Field MessengerThreadParams$Origin COMPOSE_FLOW>
		UNKNOWN = new MessengerThreadParams$Origin("UNKNOWN", 2);
	//   12   26:new             #2   <Class MessengerThreadParams$Origin>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "UNKNOWN">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void MessengerThreadParams$Origin(String, int)>
	//   17   36:putstatic       #29  <Field MessengerThreadParams$Origin UNKNOWN>
		$VALUES = (new MessengerThreadParams$Origin[] {
			REPLY_FLOW, COMPOSE_FLOW, UNKNOWN
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       MessengerThreadParams$Origin[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field MessengerThreadParams$Origin REPLY_FLOW>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field MessengerThreadParams$Origin COMPOSE_FLOW>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field MessengerThreadParams$Origin UNKNOWN>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field MessengerThreadParams$Origin[] $VALUES>
	//*  33   64:return          
	}

	private MessengerThreadParams$Origin(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
