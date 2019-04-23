// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Referenced classes of package com.crashlytics.android.core:
//			DefaultAppMeasurementEventListenerRegistrar

class DefaultAppMeasurementEventListenerRegistrar$1
	implements InvocationHandler
{

	public Object invoke(Object obj, Method method, Object aobj[])
		throws Throwable
	{
		if(aobj.length == 4)
	//*   0    0:aload_3         
	//*   1    1:arraylength     
	//*   2    2:iconst_4        
	//*   3    3:icmpne          54
		{
			obj = ((Object) ((String)aobj[0]));
	//    4    6:aload_3         
	//    5    7:iconst_0        
	//    6    8:aaload          
	//    7    9:checkcast       #27  <Class String>
	//    8   12:astore_1        
			method = ((Method) ((String)aobj[1]));
	//    9   13:aload_3         
	//   10   14:iconst_1        
	//   11   15:aaload          
	//   12   16:checkcast       #27  <Class String>
	//   13   19:astore_2        
			aobj = ((Object []) ((Bundle)aobj[2]));
	//   14   20:aload_3         
	//   15   21:iconst_2        
	//   16   22:aaload          
	//   17   23:checkcast       #29  <Class Bundle>
	//   18   26:astore_3        
			if(obj != null && !((String) (obj)).equals("crash"))
	//*  19   27:aload_1         
	//*  20   28:ifnull          52
	//*  21   31:aload_1         
	//*  22   32:ldc1            #31  <String "crash">
	//*  23   34:invokevirtual   #35  <Method boolean String.equals(Object)>
	//*  24   37:ifne            52
				DefaultAppMeasurementEventListenerRegistrar.access$100(DefaultAppMeasurementEventListenerRegistrar.access$000(DefaultAppMeasurementEventListenerRegistrar.this), ((String) (method)), ((Bundle) (aobj)));
	//   25   40:aload_0         
	//   26   41:getfield        #17  <Field DefaultAppMeasurementEventListenerRegistrar this$0>
	//   27   44:invokestatic    #39  <Method CrashlyticsCore DefaultAppMeasurementEventListenerRegistrar.access$000(DefaultAppMeasurementEventListenerRegistrar)>
	//   28   47:aload_2         
	//   29   48:aload_3         
	//   30   49:invokestatic    #43  <Method void DefaultAppMeasurementEventListenerRegistrar.access$100(CrashlyticsCore, String, Bundle)>
			return ((Object) (null));
	//   31   52:aconst_null     
	//   32   53:areturn         
		} else
		{
			throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
	//   33   54:new             #45  <Class RuntimeException>
	//   34   57:dup             
	//   35   58:ldc1            #47  <String "Unexpected AppMeasurement.OnEventListener signature">
	//   36   60:invokespecial   #50  <Method void RuntimeException(String)>
	//   37   63:athrow          
		}
	}

	final DefaultAppMeasurementEventListenerRegistrar this$0;

	DefaultAppMeasurementEventListenerRegistrar$1()
	{
		this$0 = DefaultAppMeasurementEventListenerRegistrar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DefaultAppMeasurementEventListenerRegistrar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
