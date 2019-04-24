// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			ShealthPlatformBinderFactory

class ShealthPlatformBinderFactory$1
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		if(ShealthPlatformBinderFactory.access$200(ShealthPlatformBinderFactory.this) == ShealthPlatformBinderFactory.access$600() || ShealthPlatformBinderFactory.access$200(ShealthPlatformBinderFactory.this) == ShealthPlatformBinderFactory.access$300())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
	//*   2    4:invokestatic    #24  <Method int ShealthPlatformBinderFactory.access$200(ShealthPlatformBinderFactory)>
	//*   3    7:invokestatic    #28  <Method int ShealthPlatformBinderFactory.access$600()>
	//*   4   10:icmpeq          26
	//*   5   13:aload_0         
	//*   6   14:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
	//*   7   17:invokestatic    #24  <Method int ShealthPlatformBinderFactory.access$200(ShealthPlatformBinderFactory)>
	//*   8   20:invokestatic    #31  <Method int ShealthPlatformBinderFactory.access$300()>
	//*   9   23:icmpne          69
		{
			Log.i(ShealthPlatformBinderFactory.access$000(), "Service Connected");
	//   10   26:invokestatic    #35  <Method String ShealthPlatformBinderFactory.access$000()>
	//   11   29:ldc1            #37  <String "Service Connected">
	//   12   31:invokestatic    #43  <Method int Log.i(String, String)>
	//   13   34:pop             
			ShealthPlatformBinderFactory.access$502(ShealthPlatformBinderFactory.this, _PlatformSensorService.Stub.asInterface(ibinder));
	//   14   35:aload_0         
	//   15   36:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
	//   16   39:aload_2         
	//   17   40:invokestatic    #49  <Method _PlatformSensorService _PlatformSensorService$Stub.asInterface(IBinder)>
	//   18   43:invokestatic    #53  <Method _PlatformSensorService ShealthPlatformBinderFactory.access$502(ShealthPlatformBinderFactory, _PlatformSensorService)>
	//   19   46:pop             
			ShealthPlatformBinderFactory.access$202(ShealthPlatformBinderFactory.this, ShealthPlatformBinderFactory.access$700());
	//   20   47:aload_0         
	//   21   48:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
	//   22   51:invokestatic    #56  <Method int ShealthPlatformBinderFactory.access$700()>
	//   23   54:invokestatic    #60  <Method int ShealthPlatformBinderFactory.access$202(ShealthPlatformBinderFactory, int)>
	//   24   57:pop             
			ShealthPlatformBinderFactory.access$100(ShealthPlatformBinderFactory.this, true, 0);
	//   25   58:aload_0         
	//   26   59:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
	//   27   62:iconst_1        
	//   28   63:iconst_0        
	//   29   64:invokestatic    #64  <Method boolean ShealthPlatformBinderFactory.access$100(ShealthPlatformBinderFactory, boolean, int)>
	//   30   67:pop             
			return;
	//   31   68:return          
		} else
		{
			Log.e(ShealthPlatformBinderFactory.access$000(), (new StringBuilder()).append("Incorrect state found : ").append(ShealthPlatformBinderFactory.access$200(ShealthPlatformBinderFactory.this)).toString());
	//   32   69:invokestatic    #35  <Method String ShealthPlatformBinderFactory.access$000()>
	//   33   72:new             #66  <Class StringBuilder>
	//   34   75:dup             
	//   35   76:invokespecial   #67  <Method void StringBuilder()>
	//   36   79:ldc1            #69  <String "Incorrect state found : ">
	//   37   81:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   38   84:aload_0         
	//   39   85:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
	//   40   88:invokestatic    #24  <Method int ShealthPlatformBinderFactory.access$200(ShealthPlatformBinderFactory)>
	//   41   91:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//   42   94:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   43   97:invokestatic    #82  <Method int Log.e(String, String)>
	//   44  100:pop             
			return;
	//   45  101:return          
		}
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		Log.i(ShealthPlatformBinderFactory.access$000(), (new StringBuilder()).append("Service disconnected").append(((Object) (componentname))).toString());
	//    0    0:invokestatic    #35  <Method String ShealthPlatformBinderFactory.access$000()>
	//    1    3:new             #66  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #67  <Method void StringBuilder()>
	//    4   10:ldc1            #86  <String "Service disconnected">
	//    5   12:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #89  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:invokevirtual   #79  <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #43  <Method int Log.i(String, String)>
	//   10   25:pop             
		ShealthPlatformBinderFactory.access$100(ShealthPlatformBinderFactory.this, false, 0);
	//   11   26:aload_0         
	//   12   27:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
	//   13   30:iconst_0        
	//   14   31:iconst_0        
	//   15   32:invokestatic    #64  <Method boolean ShealthPlatformBinderFactory.access$100(ShealthPlatformBinderFactory, boolean, int)>
	//   16   35:pop             
		ShealthPlatformBinderFactory.access$202(ShealthPlatformBinderFactory.this, ShealthPlatformBinderFactory.access$300());
	//   17   36:aload_0         
	//   18   37:getfield        #14  <Field ShealthPlatformBinderFactory this$0>
	//   19   40:invokestatic    #31  <Method int ShealthPlatformBinderFactory.access$300()>
	//   20   43:invokestatic    #60  <Method int ShealthPlatformBinderFactory.access$202(ShealthPlatformBinderFactory, int)>
	//   21   46:pop             
		ShealthPlatformBinderFactory.access$502(ShealthPlatformBinderFactory.access$400(), ((_PlatformSensorService) (null)));
	//   22   47:invokestatic    #93  <Method ShealthPlatformBinderFactory ShealthPlatformBinderFactory.access$400()>
	//   23   50:aconst_null     
	//   24   51:invokestatic    #53  <Method _PlatformSensorService ShealthPlatformBinderFactory.access$502(ShealthPlatformBinderFactory, _PlatformSensorService)>
	//   25   54:pop             
	//   26   55:return          
	}

	final ShealthPlatformBinderFactory this$0;

	ShealthPlatformBinderFactory$1()
	{
		this$0 = ShealthPlatformBinderFactory.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ShealthPlatformBinderFactory this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
