// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			RemoteInput, RemoteInputCompatJellybean

static class RemoteInput$ImplJellybean
	implements RemoteInput.Impl
{

	public void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
	{
		RemoteInputCompatJellybean.addDataResultToIntent(remoteinput, intent, map);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #23  <Method void RemoteInputCompatJellybean.addDataResultToIntent(RemoteInput, Intent, Map)>
	//    4    6:return          
	}

	public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		RemoteInputCompatJellybean.addResultsToIntent(((teInput []) (aremoteinput)), intent, bundle);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #30  <Method void RemoteInputCompatJellybean.addResultsToIntent(RemoteInputCompatBase$RemoteInput[], Intent, Bundle)>
	//    4    6:return          
	}

	public Map getDataResultsFromIntent(Intent intent, String s)
	{
		return RemoteInputCompatJellybean.getDataResultsFromIntent(intent, s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #34  <Method Map RemoteInputCompatJellybean.getDataResultsFromIntent(Intent, String)>
	//    3    5:areturn         
	}

	public Bundle getResultsFromIntent(Intent intent)
	{
		return RemoteInputCompatJellybean.getResultsFromIntent(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #39  <Method Bundle RemoteInputCompatJellybean.getResultsFromIntent(Intent)>
	//    2    4:areturn         
	}

	RemoteInput$ImplJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
