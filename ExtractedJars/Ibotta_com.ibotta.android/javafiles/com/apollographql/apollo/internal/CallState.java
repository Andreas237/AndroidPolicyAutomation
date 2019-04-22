// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;


final class CallState extends Enum
{
	static class IllegalStateMessage
	{

		static IllegalStateMessage forCurrentState(CallState callstate)
		{
			return new IllegalStateMessage(callstate);
		//    0    0:new             #2   <Class CallState$IllegalStateMessage>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #21  <Method void CallState$IllegalStateMessage(CallState)>
		//    4    8:areturn         
		}

		transient String expected(CallState acallstate[])
		{
			Object obj = ((Object) (new StringBuilder()));
		//    0    0:new             #25  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void StringBuilder()>
		//    3    7:astore          4
			((StringBuilder) (obj)).append("Expected: ");
		//    4    9:aload           4
		//    5   11:ldc1            #28  <String "Expected: ">
		//    6   13:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			((StringBuilder) (obj)).append(callState.name());
		//    8   17:aload           4
		//    9   19:aload_0         
		//   10   20:getfield        #16  <Field CallState callState>
		//   11   23:invokevirtual   #36  <Method String CallState.name()>
		//   12   26:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
		//   13   29:pop             
			((StringBuilder) (obj)).append(", but found [");
		//   14   30:aload           4
		//   15   32:ldc1            #38  <String ", but found [">
		//   16   34:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
		//   17   37:pop             
			StringBuilder stringbuilder = new StringBuilder(((StringBuilder) (obj)).toString());
		//   18   38:new             #25  <Class StringBuilder>
		//   19   41:dup             
		//   20   42:aload           4
		//   21   44:invokevirtual   #41  <Method String StringBuilder.toString()>
		//   22   47:invokespecial   #44  <Method void StringBuilder(String)>
		//   23   50:astore          5
			obj = "";
		//   24   52:ldc1            #46  <String "">
		//   25   54:astore          4
			int j = acallstate.length;
		//   26   56:aload_1         
		//   27   57:arraylength     
		//   28   58:istore_3        
			for(int i = 0; i < j; i++)
		//*  29   59:iconst_0        
		//*  30   60:istore_2        
		//*  31   61:iload_2         
		//*  32   62:iload_3         
		//*  33   63:icmpge          101
			{
				CallState callstate = acallstate[i];
		//   34   66:aload_1         
		//   35   67:iload_2         
		//   36   68:aaload          
		//   37   69:astore          6
				stringbuilder.append(((String) (obj)));
		//   38   71:aload           5
		//   39   73:aload           4
		//   40   75:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
		//   41   78:pop             
				stringbuilder.append(callstate.name());
		//   42   79:aload           5
		//   43   81:aload           6
		//   44   83:invokevirtual   #36  <Method String CallState.name()>
		//   45   86:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
		//   46   89:pop             
				obj = ", ";
		//   47   90:ldc1            #48  <String ", ">
		//   48   92:astore          4
			}

		//   49   94:iload_2         
		//   50   95:iconst_1        
		//   51   96:iadd            
		//   52   97:istore_2        
		//*  53   98:goto            61
			stringbuilder.append("]");
		//   54  101:aload           5
		//   55  103:ldc1            #50  <String "]">
		//   56  105:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
		//   57  108:pop             
			return stringbuilder.toString();
		//   58  109:aload           5
		//   59  111:invokevirtual   #41  <Method String StringBuilder.toString()>
		//   60  114:areturn         
		}

		private final CallState callState;

		private IllegalStateMessage(CallState callstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			callState = callstate;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field CallState callState>
		//    5    9:return          
		}
	}


	private CallState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static CallState valueOf(String s)
	{
		return (CallState)Enum.valueOf(com/apollographql/apollo/internal/CallState, s);
	//    0    0:ldc1            #2   <Class CallState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CallState>
	//    4    9:areturn         
	}

	public static CallState[] values()
	{
		return (CallState[])((CallState []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field CallState[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.apollographql.apollo.internal.CallState_3B_.clone()>
	//    2    6:checkcast       #46  <Class CallState[]>
	//    3    9:areturn         
	}

	private static final CallState $VALUES[];
	public static final CallState ACTIVE;
	public static final CallState CANCELED;
	public static final CallState IDLE;
	public static final CallState TERMINATED;

	static 
	{
		IDLE = new CallState("IDLE", 0);
	//    0    0:new             #2   <Class CallState>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "IDLE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void CallState(String, int)>
	//    5   10:putstatic       #24  <Field CallState IDLE>
		ACTIVE = new CallState("ACTIVE", 1);
	//    6   13:new             #2   <Class CallState>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "ACTIVE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void CallState(String, int)>
	//   11   23:putstatic       #27  <Field CallState ACTIVE>
		TERMINATED = new CallState("TERMINATED", 2);
	//   12   26:new             #2   <Class CallState>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "TERMINATED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void CallState(String, int)>
	//   17   36:putstatic       #30  <Field CallState TERMINATED>
		CANCELED = new CallState("CANCELED", 3);
	//   18   39:new             #2   <Class CallState>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "CANCELED">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void CallState(String, int)>
	//   23   49:putstatic       #33  <Field CallState CANCELED>
		$VALUES = (new CallState[] {
			IDLE, ACTIVE, TERMINATED, CANCELED
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       CallState[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field CallState IDLE>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field CallState ACTIVE>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field CallState TERMINATED>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field CallState CANCELED>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field CallState[] $VALUES>
	//*  43   83:return          
	}
}
