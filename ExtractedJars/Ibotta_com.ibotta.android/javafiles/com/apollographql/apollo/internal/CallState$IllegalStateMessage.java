// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;


// Referenced classes of package com.apollographql.apollo.internal:
//			CallState

static class CallState$IllegalStateMessage
{

	static CallState$IllegalStateMessage forCurrentState(CallState callstate)
	{
		return new CallState$IllegalStateMessage(callstate);
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

	private CallState$IllegalStateMessage(CallState callstate)
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
