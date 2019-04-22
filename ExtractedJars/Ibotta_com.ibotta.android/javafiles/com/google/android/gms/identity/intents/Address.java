// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.identity.intents;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.identity.intents:
//			zza, zzb, UserAddressRequest

public final class Address
{
	public static final class AddressOptions
		implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
	{

		public final int theme;

		public AddressOptions()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			theme = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #17  <Field int theme>
		//    5    9:return          
		}

		public AddressOptions(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			theme = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #17  <Field int theme>
		//    5    9:return          
		}
	}

	private static abstract class zza extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
	{

		public Result createFailedResult(Status status)
		{
			return ((Result) (status));
		//    0    0:aload_1         
		//    1    1:areturn         
		}

		public zza(GoogleApiClient googleapiclient)
		{
			super(Address.API, googleapiclient);
		//    0    0:aload_0         
		//    1    1:getstatic       #14  <Field Api Address.API>
		//    2    4:aload_1         
		//    3    5:invokespecial   #17  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl(Api, GoogleApiClient)>
		//    4    8:return          
		}
	}


	public Address()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public static void requestUserAddress(GoogleApiClient googleapiclient, UserAddressRequest useraddressrequest, int i)
	{
		googleapiclient.enqueue(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzb(googleapiclient, useraddressrequest, i))));
	//    0    0:aload_0         
	//    1    1:new             #48  <Class zzb>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #50  <Method void zzb(GoogleApiClient, UserAddressRequest, int)>
	//    7   11:invokevirtual   #56  <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.enqueue(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    8   14:pop             
	//    9   15:return          
	}

	public static final Api API;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	private static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;

	static 
	{
		CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #23  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #28  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new com.google.android.gms.identity.intents.zza()));
	//    4   10:new             #30  <Class zza>
	//    5   13:dup             
	//    6   14:invokespecial   #31  <Method void zza()>
	//    7   17:putstatic       #33  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("Address.API", CLIENT_BUILDER, CLIENT_KEY);
	//    8   20:new             #35  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #37  <String "Address.API">
	//   11   26:getstatic       #33  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//   12   29:getstatic       #28  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
	//   13   32:invokespecial   #40  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #42  <Field Api API>
	//*  15   38:return          
	}
}
