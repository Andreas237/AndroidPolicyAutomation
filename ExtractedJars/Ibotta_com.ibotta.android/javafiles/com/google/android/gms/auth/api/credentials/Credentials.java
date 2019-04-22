// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			CredentialsClient, CredentialsOptions

public class Credentials
{

	public Credentials()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static CredentialsClient getClient(Activity activity)
	{
		return new CredentialsClient(activity, ((com.google.android.gms.auth.api.Auth.AuthCredentialsOptions) (CredentialsOptions.DEFAULT)));
	//    0    0:new             #14  <Class CredentialsClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #20  <Field CredentialsOptions CredentialsOptions.DEFAULT>
	//    4    8:invokespecial   #23  <Method void CredentialsClient(Activity, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions)>
	//    5   11:areturn         
	}

	public static CredentialsClient getClient(Activity activity, CredentialsOptions credentialsoptions)
	{
		return new CredentialsClient(activity, ((com.google.android.gms.auth.api.Auth.AuthCredentialsOptions) (credentialsoptions)));
	//    0    0:new             #14  <Class CredentialsClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #23  <Method void CredentialsClient(Activity, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions)>
	//    5    9:areturn         
	}

	public static CredentialsClient getClient(Context context)
	{
		return new CredentialsClient(context, ((com.google.android.gms.auth.api.Auth.AuthCredentialsOptions) (CredentialsOptions.DEFAULT)));
	//    0    0:new             #14  <Class CredentialsClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #20  <Field CredentialsOptions CredentialsOptions.DEFAULT>
	//    4    8:invokespecial   #29  <Method void CredentialsClient(Context, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions)>
	//    5   11:areturn         
	}

	public static CredentialsClient getClient(Context context, CredentialsOptions credentialsoptions)
	{
		return new CredentialsClient(context, ((com.google.android.gms.auth.api.Auth.AuthCredentialsOptions) (credentialsoptions)));
	//    0    0:new             #14  <Class CredentialsClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #29  <Method void CredentialsClient(Context, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions)>
	//    5    9:areturn         
	}
}
