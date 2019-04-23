// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.Logger;

// Referenced classes of package androidx.work.impl.constraints.trackers:
//			NetworkStateTracker

private class NetworkStateTracker$NetworkStateCallback extends android.net.ConnectivityManager.NetworkCallback
{

	public void onCapabilitiesChanged(Network network, NetworkCapabilities networkcapabilities)
	{
		Logger.get().debug(NetworkStateTracker.TAG, String.format("Network capabilities changed: %s", new Object[] {
			networkcapabilities
		}), new Throwable[0]);
	//    0    0:invokestatic    #28  <Method Logger Logger.get()>
	//    1    3:getstatic       #32  <Field String NetworkStateTracker.TAG>
	//    2    6:ldc1            #34  <String "Network capabilities changed: %s">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_2         
	//    8   15:aastore         
	//    9   16:invokestatic    #42  <Method String String.format(String, Object[])>
	//   10   19:iconst_0        
	//   11   20:anewarray       Throwable[]
	//   12   23:invokevirtual   #48  <Method void Logger.debug(String, String, Throwable[])>
		network = ((Network) (NetworkStateTracker.this));
	//   13   26:aload_0         
	//   14   27:getfield        #16  <Field NetworkStateTracker this$0>
	//   15   30:astore_1        
		((NetworkStateTracker) (network)).setState(((Object) (((NetworkStateTracker) (network)).getActiveNetworkState())));
	//   16   31:aload_1         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #52  <Method androidx.work.impl.constraints.NetworkState NetworkStateTracker.getActiveNetworkState()>
	//   19   36:invokevirtual   #56  <Method void NetworkStateTracker.setState(Object)>
	//   20   39:return          
	}

	public void onLost(Network network)
	{
		Logger.get().debug(NetworkStateTracker.TAG, "Network connection lost", new Throwable[0]);
	//    0    0:invokestatic    #28  <Method Logger Logger.get()>
	//    1    3:getstatic       #32  <Field String NetworkStateTracker.TAG>
	//    2    6:ldc1            #60  <String "Network connection lost">
	//    3    8:iconst_0        
	//    4    9:anewarray       Throwable[]
	//    5   12:invokevirtual   #48  <Method void Logger.debug(String, String, Throwable[])>
		network = ((Network) (NetworkStateTracker.this));
	//    6   15:aload_0         
	//    7   16:getfield        #16  <Field NetworkStateTracker this$0>
	//    8   19:astore_1        
		((NetworkStateTracker) (network)).setState(((Object) (((NetworkStateTracker) (network)).getActiveNetworkState())));
	//    9   20:aload_1         
	//   10   21:aload_1         
	//   11   22:invokevirtual   #52  <Method androidx.work.impl.constraints.NetworkState NetworkStateTracker.getActiveNetworkState()>
	//   12   25:invokevirtual   #56  <Method void NetworkStateTracker.setState(Object)>
	//   13   28:return          
	}

	final NetworkStateTracker this$0;

	NetworkStateTracker$NetworkStateCallback()
	{
		this$0 = NetworkStateTracker.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field NetworkStateTracker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void android.net.ConnectivityManager$NetworkCallback()>
	//    5    9:return          
	}
}
