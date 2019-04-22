// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.*;
import android.util.Log;

// Referenced classes of package com.bumptech.glide.manager:
//			DefaultConnectivityMonitor

class DefaultConnectivityMonitor$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		boolean flag = isConnected;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//    2    4:getfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
	//    3    7:istore_3        
		intent = ((Intent) (DefaultConnectivityMonitor.this));
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//    6   12:astore_2        
		intent.isConnected = ((DefaultConnectivityMonitor) (intent)).isConnected(context);
	//    7   13:aload_2         
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #26  <Method boolean DefaultConnectivityMonitor.isConnected(Context)>
	//   11   19:putfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
		if(flag != isConnected)
	//*  12   22:iload_3         
	//*  13   23:aload_0         
	//*  14   24:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//*  15   27:getfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
	//*  16   30:icmpeq          98
		{
			if(Log.isLoggable("ConnectivityMonitor", 3))
	//*  17   33:ldc1            #28  <String "ConnectivityMonitor">
	//*  18   35:iconst_3        
	//*  19   36:invokestatic    #34  <Method boolean Log.isLoggable(String, int)>
	//*  20   39:ifeq            79
			{
				context = ((Context) (new StringBuilder()));
	//   21   42:new             #36  <Class StringBuilder>
	//   22   45:dup             
	//   23   46:invokespecial   #37  <Method void StringBuilder()>
	//   24   49:astore_1        
				((StringBuilder) (context)).append("connectivity changed, isConnected: ");
	//   25   50:aload_1         
	//   26   51:ldc1            #39  <String "connectivity changed, isConnected: ">
	//   27   53:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
				((StringBuilder) (context)).append(isConnected);
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//   32   62:getfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
	//   33   65:invokevirtual   #46  <Method StringBuilder StringBuilder.append(boolean)>
	//   34   68:pop             
				Log.d("ConnectivityMonitor", ((StringBuilder) (context)).toString());
	//   35   69:ldc1            #28  <String "ConnectivityMonitor">
	//   36   71:aload_1         
	//   37   72:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   38   75:invokestatic    #54  <Method int Log.d(String, String)>
	//   39   78:pop             
			}
			listener.onConnectivityChanged(isConnected);
	//   40   79:aload_0         
	//   41   80:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//   42   83:getfield        #58  <Field ConnectivityMonitor$ConnectivityListener DefaultConnectivityMonitor.listener>
	//   43   86:aload_0         
	//   44   87:getfield        #12  <Field DefaultConnectivityMonitor this$0>
	//   45   90:getfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
	//   46   93:invokeinterface #64  <Method void ConnectivityMonitor$ConnectivityListener.onConnectivityChanged(boolean)>
		}
	//   47   98:return          
	}

	final DefaultConnectivityMonitor this$0;

	DefaultConnectivityMonitor$1()
	{
		this$0 = DefaultConnectivityMonitor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field DefaultConnectivityMonitor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
