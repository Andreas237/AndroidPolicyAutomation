// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.scheduler;

import android.net.Network;

// Referenced classes of package com.google.android.exoplayer2.scheduler:
//			RequirementsWatcher

private final class RequirementsWatcher$CapabilityValidatedCallback extends android.net.ConnectivityManager.NetworkCallback
{

	public void onAvailable(Network network)
	{
		super.onAvailable(network);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void android.net.ConnectivityManager$NetworkCallback.onAvailable(Network)>
		network = ((Network) (new StringBuilder()));
	//    3    5:new             #29  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void StringBuilder()>
	//    6   12:astore_1        
		((StringBuilder) (network)).append(((Object) (RequirementsWatcher.this)));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #16  <Field RequirementsWatcher this$0>
	//   10   18:invokevirtual   #34  <Method StringBuilder StringBuilder.append(Object)>
	//   11   21:pop             
		((StringBuilder) (network)).append(" NetworkCallback.onAvailable");
	//   12   22:aload_1         
	//   13   23:ldc1            #36  <String " NetworkCallback.onAvailable">
	//   14   25:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		RequirementsWatcher.access$200(((StringBuilder) (network)).toString());
	//   16   29:aload_1         
	//   17   30:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #47  <Method void RequirementsWatcher.access$200(String)>
		RequirementsWatcher.access$300(RequirementsWatcher.this, false);
	//   19   36:aload_0         
	//   20   37:getfield        #16  <Field RequirementsWatcher this$0>
	//   21   40:iconst_0        
	//   22   41:invokestatic    #51  <Method void RequirementsWatcher.access$300(RequirementsWatcher, boolean)>
	//   23   44:return          
	}

	public void onLost(Network network)
	{
		super.onLost(network);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void android.net.ConnectivityManager$NetworkCallback.onLost(Network)>
		network = ((Network) (new StringBuilder()));
	//    3    5:new             #29  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void StringBuilder()>
	//    6   12:astore_1        
		((StringBuilder) (network)).append(((Object) (RequirementsWatcher.this)));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #16  <Field RequirementsWatcher this$0>
	//   10   18:invokevirtual   #34  <Method StringBuilder StringBuilder.append(Object)>
	//   11   21:pop             
		((StringBuilder) (network)).append(" NetworkCallback.onLost");
	//   12   22:aload_1         
	//   13   23:ldc1            #56  <String " NetworkCallback.onLost">
	//   14   25:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		RequirementsWatcher.access$200(((StringBuilder) (network)).toString());
	//   16   29:aload_1         
	//   17   30:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #47  <Method void RequirementsWatcher.access$200(String)>
		RequirementsWatcher.access$300(RequirementsWatcher.this, false);
	//   19   36:aload_0         
	//   20   37:getfield        #16  <Field RequirementsWatcher this$0>
	//   21   40:iconst_0        
	//   22   41:invokestatic    #51  <Method void RequirementsWatcher.access$300(RequirementsWatcher, boolean)>
	//   23   44:return          
	}

	final RequirementsWatcher this$0;

	private RequirementsWatcher$CapabilityValidatedCallback()
	{
		this$0 = RequirementsWatcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field RequirementsWatcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void android.net.ConnectivityManager$NetworkCallback()>
	//    5    9:return          
	}

	RequirementsWatcher$CapabilityValidatedCallback(RequirementsWatcher._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void RequirementsWatcher$CapabilityValidatedCallback(RequirementsWatcher)>
	//    3    5:return          
	}
}
