// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;


// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

static final class RealSubscriptionManager$State extends Enum
{

	public static RealSubscriptionManager$State valueOf(String s)
	{
		return (RealSubscriptionManager$State)Enum.valueOf(com/apollographql/apollo/internal/subscription/RealSubscriptionManager$State, s);
	//    0    0:ldc1            #2   <Class RealSubscriptionManager$State>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RealSubscriptionManager$State>
	//    4    9:areturn         
	}

	public static RealSubscriptionManager$State[] values()
	{
		return (RealSubscriptionManager$State[])((RealSubscriptionManager$State []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field RealSubscriptionManager$State[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.apollographql.apollo.internal.subscription.RealSubscriptionManager$State_3B_.clone()>
	//    2    6:checkcast       #46  <Class RealSubscriptionManager$State[]>
	//    3    9:areturn         
	}

	private static final RealSubscriptionManager$State $VALUES[];
	public static final RealSubscriptionManager$State ACTIVE;
	public static final RealSubscriptionManager$State CONNECTED;
	public static final RealSubscriptionManager$State CONNECTING;
	public static final RealSubscriptionManager$State DISCONNECTED;

	static 
	{
		DISCONNECTED = new RealSubscriptionManager$State("DISCONNECTED", 0);
	//    0    0:new             #2   <Class RealSubscriptionManager$State>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "DISCONNECTED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void RealSubscriptionManager$State(String, int)>
	//    5   10:putstatic       #24  <Field RealSubscriptionManager$State DISCONNECTED>
		CONNECTING = new RealSubscriptionManager$State("CONNECTING", 1);
	//    6   13:new             #2   <Class RealSubscriptionManager$State>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "CONNECTING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void RealSubscriptionManager$State(String, int)>
	//   11   23:putstatic       #27  <Field RealSubscriptionManager$State CONNECTING>
		CONNECTED = new RealSubscriptionManager$State("CONNECTED", 2);
	//   12   26:new             #2   <Class RealSubscriptionManager$State>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "CONNECTED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void RealSubscriptionManager$State(String, int)>
	//   17   36:putstatic       #30  <Field RealSubscriptionManager$State CONNECTED>
		ACTIVE = new RealSubscriptionManager$State("ACTIVE", 3);
	//   18   39:new             #2   <Class RealSubscriptionManager$State>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "ACTIVE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void RealSubscriptionManager$State(String, int)>
	//   23   49:putstatic       #33  <Field RealSubscriptionManager$State ACTIVE>
		$VALUES = (new RealSubscriptionManager$State[] {
			DISCONNECTED, CONNECTING, CONNECTED, ACTIVE
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       RealSubscriptionManager$State[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field RealSubscriptionManager$State DISCONNECTED>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field RealSubscriptionManager$State CONNECTING>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field RealSubscriptionManager$State CONNECTED>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field RealSubscriptionManager$State ACTIVE>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field RealSubscriptionManager$State[] $VALUES>
	//*  43   83:return          
	}

	private RealSubscriptionManager$State(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
