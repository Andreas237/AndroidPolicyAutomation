// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.apollographql.apollo.api:
//			Operation, InputFieldMarshaller, InputFieldWriter

public static class Operation$Variables
{

	public InputFieldMarshaller marshaller()
	{
		return new InputFieldMarshaller() {

			public void marshal(InputFieldWriter inputfieldwriter)
			{
			//    0    0:return          
			}

			final Operation.Variables this$0;

			
			{
				this$0 = Operation.Variables.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Operation$Variables this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #9   <Class Operation$Variables$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void Operation$Variables$1(Operation$Variables)>
	//    4    8:areturn         
	}

	public Map valueMap()
	{
		return Collections.emptyMap();
	//    0    0:invokestatic    #28  <Method Map Collections.emptyMap()>
	//    1    3:areturn         
	}

	protected Operation$Variables()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
