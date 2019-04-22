// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.runtime;

import com.facebook.stetho.inspector.console.RuntimeRepl;

// Referenced classes of package com.facebook.stetho.inspector.runtime:
//			RhinoDetectingRuntimeReplFactory

class RhinoDetectingRuntimeReplFactory$1
	implements RuntimeRepl
{

	public Object evaluate(String s)
		throws Exception
	{
		if(RhinoDetectingRuntimeReplFactory.access$000(RhinoDetectingRuntimeReplFactory.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field RhinoDetectingRuntimeReplFactory this$0>
	//*   2    4:invokestatic    #29  <Method RuntimeException RhinoDetectingRuntimeReplFactory.access$000(RhinoDetectingRuntimeReplFactory)>
	//*   3    7:ifnull          45
		{
			s = ((String) (new StringBuilder()));
	//    4   10:new             #31  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #32  <Method void StringBuilder()>
	//    7   17:astore_1        
			((StringBuilder) (s)).append("stetho-js-rhino threw: ");
	//    8   18:aload_1         
	//    9   19:ldc1            #34  <String "stetho-js-rhino threw: ">
	//   10   21:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			((StringBuilder) (s)).append(RhinoDetectingRuntimeReplFactory.access$000(RhinoDetectingRuntimeReplFactory.this).toString());
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:getfield        #17  <Field RhinoDetectingRuntimeReplFactory this$0>
	//   15   30:invokestatic    #29  <Method RuntimeException RhinoDetectingRuntimeReplFactory.access$000(RhinoDetectingRuntimeReplFactory)>
	//   16   33:invokevirtual   #44  <Method String RuntimeException.toString()>
	//   17   36:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
			return ((Object) (((StringBuilder) (s)).toString()));
	//   19   40:aload_1         
	//   20   41:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   21   44:areturn         
		} else
		{
			return ((Object) ("Not supported without stetho-js-rhino dependency"));
	//   22   45:ldc1            #47  <String "Not supported without stetho-js-rhino dependency">
	//   23   47:areturn         
		}
	}

	final RhinoDetectingRuntimeReplFactory this$0;

	RhinoDetectingRuntimeReplFactory$1()
	{
		this$0 = RhinoDetectingRuntimeReplFactory.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RhinoDetectingRuntimeReplFactory this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
