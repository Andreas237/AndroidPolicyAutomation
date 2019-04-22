// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Runtime

class Runtime$1
	implements RuntimeReplFactory
{

	public RuntimeRepl newInstance()
	{
		return new RuntimeRepl() {

			public Object evaluate(String s)
				throws Throwable
			{
				return ((Object) ("Not supported with legacy Runtime module"));
			//    0    0:ldc1            #27  <String "Not supported with legacy Runtime module">
			//    1    2:areturn         
			}

			final Runtime._cls1 this$1;

			
			{
				this$1 = Runtime._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Runtime$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #13  <Class Runtime$1$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void Runtime$1$1(Runtime$1)>
	//    4    8:areturn         
	}

	Runtime$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
