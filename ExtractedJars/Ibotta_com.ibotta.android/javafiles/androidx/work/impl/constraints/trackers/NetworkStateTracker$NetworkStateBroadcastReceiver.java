// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.content.*;
import androidx.work.Logger;

// Referenced classes of package androidx.work.impl.constraints.trackers:
//			NetworkStateTracker

private class NetworkStateTracker$NetworkStateBroadcastReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(intent != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          49
		{
			if(intent.getAction() == null)
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #25  <Method String Intent.getAction()>
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			if(intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #25  <Method String Intent.getAction()>
	//*   8   16:ldc1            #27  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//*   9   18:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  10   21:ifeq            48
			{
				Logger.debug("NetworkStateTracker", "Network broadcast received", new Throwable[0]);
	//   11   24:ldc1            #35  <String "NetworkStateTracker">
	//   12   26:ldc1            #37  <String "Network broadcast received">
	//   13   28:iconst_0        
	//   14   29:anewarray       Throwable[]
	//   15   32:invokestatic    #45  <Method void Logger.debug(String, String, Throwable[])>
				context = ((Context) (NetworkStateTracker.this));
	//   16   35:aload_0         
	//   17   36:getfield        #13  <Field NetworkStateTracker this$0>
	//   18   39:astore_1        
				((NetworkStateTracker) (context)).setState(((Object) (((NetworkStateTracker) (context)).getActiveNetworkState())));
	//   19   40:aload_1         
	//   20   41:aload_1         
	//   21   42:invokevirtual   #49  <Method androidx.work.impl.constraints.NetworkState NetworkStateTracker.getActiveNetworkState()>
	//   22   45:invokevirtual   #53  <Method void NetworkStateTracker.setState(Object)>
			}
			return;
	//   23   48:return          
		} else
		{
			return;
	//   24   49:return          
		}
	}

	final NetworkStateTracker this$0;

	NetworkStateTracker$NetworkStateBroadcastReceiver()
	{
		this$0 = NetworkStateTracker.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field NetworkStateTracker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
