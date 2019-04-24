// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.iid;

import android.content.*;
import android.util.Log;

// Referenced classes of package com.google.android.gms.iid:
//			InstanceIDListenerService

class InstanceIDListenerService$2 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(Log.isLoggable("InstanceID", 3))
	//*   0    0:ldc1            #20  <String "InstanceID">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #26  <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            59
		{
			intent.getStringExtra("registration_id");
	//    4    9:aload_2         
	//    5   10:ldc1            #28  <String "registration_id">
	//    6   12:invokevirtual   #34  <Method String Intent.getStringExtra(String)>
	//    7   15:pop             
			context = ((Context) (String.valueOf(((Object) (intent.getExtras())))));
	//    8   16:aload_2         
	//    9   17:invokevirtual   #38  <Method android.os.Bundle Intent.getExtras()>
	//   10   20:invokestatic    #44  <Method String String.valueOf(Object)>
	//   11   23:astore_1        
			Log.d("InstanceID", (new StringBuilder(String.valueOf(((Object) (context))).length() + 46)).append("Received GSF callback using dynamic receiver: ").append(((String) (context))).toString());
	//   12   24:ldc1            #20  <String "InstanceID">
	//   13   26:new             #46  <Class StringBuilder>
	//   14   29:dup             
	//   15   30:aload_1         
	//   16   31:invokestatic    #44  <Method String String.valueOf(Object)>
	//   17   34:invokevirtual   #50  <Method int String.length()>
	//   18   37:bipush          46
	//   19   39:iadd            
	//   20   40:invokespecial   #53  <Method void StringBuilder(int)>
	//   21   43:ldc1            #55  <String "Received GSF callback using dynamic receiver: ">
	//   22   45:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:aload_1         
	//   24   49:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   26   55:invokestatic    #67  <Method int Log.d(String, String)>
	//   27   58:pop             
		}
		zzbhn.zzn(intent);
	//   28   59:aload_0         
	//   29   60:getfield        #12  <Field InstanceIDListenerService zzbhn>
	//   30   63:aload_2         
	//   31   64:invokevirtual   #71  <Method void InstanceIDListenerService.zzn(Intent)>
		zzbhn.stop();
	//   32   67:aload_0         
	//   33   68:getfield        #12  <Field InstanceIDListenerService zzbhn>
	//   34   71:invokevirtual   #74  <Method void InstanceIDListenerService.stop()>
	//   35   74:return          
	}

	final InstanceIDListenerService zzbhn;

	InstanceIDListenerService$2(InstanceIDListenerService instanceidlistenerservice)
	{
		zzbhn = instanceidlistenerservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field InstanceIDListenerService zzbhn>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
