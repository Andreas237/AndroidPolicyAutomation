// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.installreferrer.api;

import android.os.RemoteException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.android.installreferrer.api:
//			ReferrerDetails

public abstract class InstallReferrerClient
{
	public static interface InstallReferrerResponse
		extends Annotation
	{
	}


	public InstallReferrerClient()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract void endConnection();

	public abstract ReferrerDetails getInstallReferrer()
		throws RemoteException;
}
