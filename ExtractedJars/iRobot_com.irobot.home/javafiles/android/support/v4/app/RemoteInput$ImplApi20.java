// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			RemoteInput, RemoteInputCompatApi20

static class RemoteInput$ImplApi20
	implements RemoteInput.Impl
{

	public void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
	{
		RemoteInputCompatApi20.addDataResultToIntent(((RemoteInput) (remoteinput)), intent, map);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #21  <Method void RemoteInputCompatApi20.addDataResultToIntent(RemoteInputCompatBase$RemoteInput, Intent, Map)>
	//    4    6:return          
	}

	public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		RemoteInputCompatApi20.addResultsToIntent(((RemoteInput []) (aremoteinput)), intent, bundle);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #28  <Method void RemoteInputCompatApi20.addResultsToIntent(RemoteInputCompatBase$RemoteInput[], Intent, Bundle)>
	//    4    6:return          
	}

	public Map getDataResultsFromIntent(Intent intent, String s)
	{
		return RemoteInputCompatApi20.getDataResultsFromIntent(intent, s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #32  <Method Map RemoteInputCompatApi20.getDataResultsFromIntent(Intent, String)>
	//    3    5:areturn         
	}

	public Bundle getResultsFromIntent(Intent intent)
	{
		return RemoteInputCompatApi20.getResultsFromIntent(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #37  <Method Bundle RemoteInputCompatApi20.getResultsFromIntent(Intent)>
	//    2    4:areturn         
	}

	RemoteInput$ImplApi20()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
