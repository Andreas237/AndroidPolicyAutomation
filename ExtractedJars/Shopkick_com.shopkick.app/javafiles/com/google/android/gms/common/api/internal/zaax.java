// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaaw

final class zaax
	implements com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState
{

	zaax(zaaw zaaw)
	{
		zahg = zaaw;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zaaw zahg>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final Bundle getConnectionHint()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean isConnected()
	{
		return ((GoogleApiClient) (zahg)).isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zaaw zahg>
	//    2    4:invokevirtual   #24  <Method boolean GoogleApiClient.isConnected()>
	//    3    7:ireturn         
	}

	private final zaaw zahg;
}
