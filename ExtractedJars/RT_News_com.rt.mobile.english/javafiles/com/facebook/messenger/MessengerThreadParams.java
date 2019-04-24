// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.messenger;

import java.util.List;

public class MessengerThreadParams
{
	public static final class Origin extends Enum
	{

		public static Origin valueOf(String s)
		{
			return (Origin)Enum.valueOf(com/facebook/messenger/MessengerThreadParams$Origin, s);
		//    0    0:ldc1            #2   <Class MessengerThreadParams$Origin>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class MessengerThreadParams$Origin>
		//    4    9:areturn         
		}

		public static Origin[] values()
		{
			return (Origin[])((Origin []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field MessengerThreadParams$Origin[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.messenger.MessengerThreadParams$Origin_3B_.clone()>
		//    2    6:checkcast       #42  <Class MessengerThreadParams$Origin[]>
		//    3    9:areturn         
		}

		private static final Origin $VALUES[];
		public static final Origin COMPOSE_FLOW;
		public static final Origin REPLY_FLOW;
		public static final Origin UNKNOWN;

		static 
		{
			REPLY_FLOW = new Origin("REPLY_FLOW", 0);
		//    0    0:new             #2   <Class MessengerThreadParams$Origin>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "REPLY_FLOW">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void MessengerThreadParams$Origin(String, int)>
		//    5   10:putstatic       #23  <Field MessengerThreadParams$Origin REPLY_FLOW>
			COMPOSE_FLOW = new Origin("COMPOSE_FLOW", 1);
		//    6   13:new             #2   <Class MessengerThreadParams$Origin>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "COMPOSE_FLOW">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void MessengerThreadParams$Origin(String, int)>
		//   11   23:putstatic       #26  <Field MessengerThreadParams$Origin COMPOSE_FLOW>
			UNKNOWN = new Origin("UNKNOWN", 2);
		//   12   26:new             #2   <Class MessengerThreadParams$Origin>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "UNKNOWN">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void MessengerThreadParams$Origin(String, int)>
		//   17   36:putstatic       #29  <Field MessengerThreadParams$Origin UNKNOWN>
			$VALUES = (new Origin[] {
				REPLY_FLOW, COMPOSE_FLOW, UNKNOWN
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Origin[]
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

		private Origin(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public MessengerThreadParams(Origin origin1, String s, String s1, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		threadToken = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #22  <Field String threadToken>
		metadata = s1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #24  <Field String metadata>
		participants = list;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #26  <Field List participants>
		origin = origin1;
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:putfield        #28  <Field MessengerThreadParams$Origin origin>
	//   14   25:return          
	}

	public final String metadata;
	public final Origin origin;
	public final List participants;
	public final String threadToken;
}
