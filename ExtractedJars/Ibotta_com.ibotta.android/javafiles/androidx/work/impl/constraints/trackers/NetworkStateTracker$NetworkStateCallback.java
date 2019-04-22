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
		Logger.debug("NetworkStateTracker", String.format("Network capabilities changed: %s", new Object[] {
			networkcapabilities
		}), new Throwable[0]);
	//    0    0:ldc1            #24  <String "NetworkStateTracker">
	//    1    2:ldc1            #26  <String "Network capabilities changed: %s">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_2         
	//    7   11:aastore         
	//    8   12:invokestatic    #34  <Method String String.format(String, Object[])>
	//    9   15:iconst_0        
	//   10   16:anewarray       Throwable[]
	//   11   19:invokestatic    #42  <Method void Logger.debug(String, String, Throwable[])>
		network = ((Network) (NetworkStateTracker.this));
	//   12   22:aload_0         
	//   13   23:getfield        #16  <Field NetworkStateTracker this$0>
	//   14   26:astore_1        
		((NetworkStateTracker) (network)).setState(((Object) (((NetworkStateTracker) (network)).getActiveNetworkState())));
	//   15   27:aload_1         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #46  <Method androidx.work.impl.constraints.NetworkState NetworkStateTracker.getActiveNetworkState()>
	//   18   32:invokevirtual   #50  <Method void NetworkStateTracker.setState(Object)>
	//   19   35:return          
	}

	public void onLost(Network network)
	{
		Logger.debug("NetworkStateTracker", "Network connection lost", new Throwable[0]);
	//    0    0:ldc1            #24  <String "NetworkStateTracker">
	//    1    2:ldc1            #54  <String "Network connection lost">
	//    2    4:iconst_0        
	//    3    5:anewarray       Throwable[]
	//    4    8:invokestatic    #42  <Method void Logger.debug(String, String, Throwable[])>
		network = ((Network) (NetworkStateTracker.this));
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field NetworkStateTracker this$0>
	//    7   15:astore_1        
		((NetworkStateTracker) (network)).setState(((Object) (((NetworkStateTracker) (network)).getActiveNetworkState())));
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #46  <Method androidx.work.impl.constraints.NetworkState NetworkStateTracker.getActiveNetworkState()>
	//   11   21:invokevirtual   #50  <Method void NetworkStateTracker.setState(Object)>
	//   12   24:return          
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
