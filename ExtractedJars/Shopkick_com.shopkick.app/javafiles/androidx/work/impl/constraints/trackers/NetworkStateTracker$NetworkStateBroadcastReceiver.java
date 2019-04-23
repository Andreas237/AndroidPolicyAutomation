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
	//*   1    1:ifnull          53
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
	//*  10   21:ifeq            52
			{
				Logger.get().debug(NetworkStateTracker.TAG, "Network broadcast received", new Throwable[0]);
	//   11   24:invokestatic    #39  <Method Logger Logger.get()>
	//   12   27:getstatic       #43  <Field String NetworkStateTracker.TAG>
	//   13   30:ldc1            #45  <String "Network broadcast received">
	//   14   32:iconst_0        
	//   15   33:anewarray       Throwable[]
	//   16   36:invokevirtual   #51  <Method void Logger.debug(String, String, Throwable[])>
				context = ((Context) (NetworkStateTracker.this));
	//   17   39:aload_0         
	//   18   40:getfield        #13  <Field NetworkStateTracker this$0>
	//   19   43:astore_1        
				((NetworkStateTracker) (context)).setState(((Object) (((NetworkStateTracker) (context)).getActiveNetworkState())));
	//   20   44:aload_1         
	//   21   45:aload_1         
	//   22   46:invokevirtual   #55  <Method androidx.work.impl.constraints.NetworkState NetworkStateTracker.getActiveNetworkState()>
	//   23   49:invokevirtual   #59  <Method void NetworkStateTracker.setState(Object)>
			}
			return;
	//   24   52:return          
		} else
		{
			return;
	//   25   53:return          
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
