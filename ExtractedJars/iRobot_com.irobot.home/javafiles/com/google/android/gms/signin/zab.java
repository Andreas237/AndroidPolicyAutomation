// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInClientImpl;

// Referenced classes of package com.google.android.gms.signin:
//			SignInOptions

final class zab extends com.google.android.gms.common.api.Api.AbstractClientBuilder
{

	zab()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void com.google.android.gms.common.api.Api$AbstractClientBuilder()>
	//    2    4:return          
	}

	public final com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		SignInOptions signinoptions = (SignInOptions)obj;
	//    0    0:aload           4
	//    1    2:checkcast       #14  <Class SignInOptions>
	//    2    5:astore          7
		obj = ((Object) (signinoptions));
	//    3    7:aload           7
	//    4    9:astore          4
		if(signinoptions == null)
	//*   5   11:aload           7
	//*   6   13:ifnonnull       21
			obj = ((Object) (SignInOptions.DEFAULT));
	//    7   16:getstatic       #18  <Field SignInOptions SignInOptions.DEFAULT>
	//    8   19:astore          4
		return ((com.google.android.gms.common.api.Api.Client) (new SignInClientImpl(context, looper, true, clientsettings, ((SignInOptions) (obj)), connectioncallbacks, onconnectionfailedlistener)));
	//    9   21:new             #20  <Class SignInClientImpl>
	//   10   24:dup             
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:iconst_1        
	//   14   28:aload_3         
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:aload           6
	//   18   35:invokespecial   #23  <Method void SignInClientImpl(Context, Looper, boolean, ClientSettings, SignInOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   19   38:areturn         
	}
}
