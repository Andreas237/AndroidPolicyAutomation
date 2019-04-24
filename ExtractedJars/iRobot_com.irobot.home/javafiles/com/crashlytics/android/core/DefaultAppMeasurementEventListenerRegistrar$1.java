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
	{
		if(aobj.length != 4)
	//*   0    0:aload_3         
	//*   1    1:arraylength     
	//*   2    2:iconst_4        
	//*   3    3:icmpeq          16
			throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
	//    4    6:new             #25  <Class RuntimeException>
	//    5    9:dup             
	//    6   10:ldc1            #27  <String "Unexpected AppMeasurement.OnEventListener signature">
	//    7   12:invokespecial   #30  <Method void RuntimeException(String)>
	//    8   15:athrow          
		obj = ((Object) ((String)aobj[0]));
	//    9   16:aload_3         
	//   10   17:iconst_0        
	//   11   18:aaload          
	//   12   19:checkcast       #32  <Class String>
	//   13   22:astore_1        
		method = ((Method) ((String)aobj[1]));
	//   14   23:aload_3         
	//   15   24:iconst_1        
	//   16   25:aaload          
	//   17   26:checkcast       #32  <Class String>
	//   18   29:astore_2        
		aobj = ((Object []) ((Bundle)aobj[2]));
	//   19   30:aload_3         
	//   20   31:iconst_2        
	//   21   32:aaload          
	//   22   33:checkcast       #34  <Class Bundle>
	//   23   36:astore_3        
		if(obj != null && !((String) (obj)).equals("crash"))
	//*  24   37:aload_1         
	//*  25   38:ifnull          62
	//*  26   41:aload_1         
	//*  27   42:ldc1            #36  <String "crash">
	//*  28   44:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  29   47:ifne            62
			DefaultAppMeasurementEventListenerRegistrar.access$100(DefaultAppMeasurementEventListenerRegistrar.access$000(DefaultAppMeasurementEventListenerRegistrar.this), ((String) (method)), ((Bundle) (aobj)));
	//   30   50:aload_0         
	//   31   51:getfield        #17  <Field DefaultAppMeasurementEventListenerRegistrar this$0>
	//   32   54:invokestatic    #44  <Method CrashlyticsCore DefaultAppMeasurementEventListenerRegistrar.access$000(DefaultAppMeasurementEventListenerRegistrar)>
	//   33   57:aload_2         
	//   34   58:aload_3         
	//   35   59:invokestatic    #48  <Method void DefaultAppMeasurementEventListenerRegistrar.access$100(CrashlyticsCore, String, Bundle)>
		return ((Object) (null));
	//   36   62:aconst_null     
	//   37   63:areturn         
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
