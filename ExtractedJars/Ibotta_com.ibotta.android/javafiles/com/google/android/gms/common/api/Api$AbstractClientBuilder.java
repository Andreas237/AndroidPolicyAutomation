// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;

// Referenced classes of package com.google.android.gms.common.api:
//			Api

public static abstract class Api$AbstractClientBuilder extends Api.BaseClientBuilder
{

	public abstract Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, Callbacks callbacks, onFailedListener onfailedlistener);

	public Api$AbstractClientBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Api$BaseClientBuilder()>
	//    2    4:return          
	}
}
