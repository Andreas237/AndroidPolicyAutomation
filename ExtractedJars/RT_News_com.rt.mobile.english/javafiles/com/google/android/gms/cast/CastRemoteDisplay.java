// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.content.Context;
import android.view.Display;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.flags.Flag;
import com.google.android.gms.internal.cast.*;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.cast:
//			zzo, CastRemoteDisplayClient, CastRemoteDisplayApi, CastDevice

public final class CastRemoteDisplay
{
	public static final class CastRemoteDisplayOptions
		implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
	{

		final CastDevice zzai;
		final CastRemoteDisplaySessionCallbacks zzba;
		final int zzbb;

		private CastRemoteDisplayOptions(Builder builder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			zzai = builder.zzai;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #26  <Field CastDevice CastRemoteDisplay$CastRemoteDisplayOptions$Builder.zzai>
		//    5    9:putfield        #27  <Field CastDevice zzai>
			zzba = builder.zzbc;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #30  <Field CastRemoteDisplay$CastRemoteDisplaySessionCallbacks CastRemoteDisplay$CastRemoteDisplayOptions$Builder.zzbc>
		//    9   17:putfield        #32  <Field CastRemoteDisplay$CastRemoteDisplaySessionCallbacks zzba>
			zzbb = builder.zzbb;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #34  <Field int CastRemoteDisplay$CastRemoteDisplayOptions$Builder.zzbb>
		//   13   25:putfield        #35  <Field int zzbb>
		//   14   28:return          
		}

		CastRemoteDisplayOptions(Builder builder, zzo zzo1)
		{
			this(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void CastRemoteDisplay$CastRemoteDisplayOptions(CastRemoteDisplay$CastRemoteDisplayOptions$Builder)>
		//    3    5:return          
		}
	}

	public static final class CastRemoteDisplayOptions.Builder
	{

		public final CastRemoteDisplayOptions build()
		{
			return new CastRemoteDisplayOptions(this, ((zzo) (null)));
		//    0    0:new             #6   <Class CastRemoteDisplay$CastRemoteDisplayOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #42  <Method void CastRemoteDisplay$CastRemoteDisplayOptions(CastRemoteDisplay$CastRemoteDisplayOptions$Builder, zzo)>
		//    5    9:areturn         
		}

		public final CastRemoteDisplayOptions.Builder setConfigPreset(int i)
		{
			zzbb = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #36  <Field int zzbb>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		CastDevice zzai;
		int zzbb;
		CastRemoteDisplaySessionCallbacks zzbc;

		public CastRemoteDisplayOptions.Builder(CastDevice castdevice, CastRemoteDisplaySessionCallbacks castremotedisplaysessioncallbacks)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			Preconditions.checkNotNull(((Object) (castdevice)), "CastDevice parameter cannot be null");
		//    2    4:aload_1         
		//    3    5:ldc1            #24  <String "CastDevice parameter cannot be null">
		//    4    7:invokestatic    #30  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    5   10:pop             
			zzai = castdevice;
		//    6   11:aload_0         
		//    7   12:aload_1         
		//    8   13:putfield        #32  <Field CastDevice zzai>
			zzbc = castremotedisplaysessioncallbacks;
		//    9   16:aload_0         
		//   10   17:aload_2         
		//   11   18:putfield        #34  <Field CastRemoteDisplay$CastRemoteDisplaySessionCallbacks zzbc>
			zzbb = 2;
		//   12   21:aload_0         
		//   13   22:iconst_2        
		//   14   23:putfield        #36  <Field int zzbb>
		//   15   26:return          
		}
	}

	public static interface CastRemoteDisplaySessionCallbacks
	{

		public abstract void onRemoteDisplayEnded(Status status);
	}

	public static interface CastRemoteDisplaySessionResult
		extends Result
	{

		public abstract Display getPresentationDisplay();
	}

	public static interface Configuration
		extends Annotation
	{
	}


	private CastRemoteDisplay()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
	//    2    4:return          
	}

	public static CastRemoteDisplayClient getClient(Context context)
	{
		return new CastRemoteDisplayClient(context);
	//    0    0:new             #77  <Class CastRemoteDisplayClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #80  <Method void CastRemoteDisplayClient(Context)>
	//    4    8:areturn         
	}

	public static final boolean isRemoteDisplaySdkSupported(Context context)
	{
		zzcx.initialize(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #88  <Method void zzcx.initialize(Context)>
		return ((Boolean)zzcx.zzwc.get()).booleanValue();
	//    2    4:getstatic       #92  <Field Flag zzcx.zzwc>
	//    3    7:invokevirtual   #98  <Method Object Flag.get()>
	//    4   10:checkcast       #100 <Class Boolean>
	//    5   13:invokevirtual   #104 <Method boolean Boolean.booleanValue()>
	//    6   16:ireturn         
	}

	public static final Api API;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	public static final int CONFIGURATION_INTERACTIVE_NONREALTIME = 2;
	public static final int CONFIGURATION_INTERACTIVE_REALTIME = 1;
	public static final int CONFIGURATION_NONINTERACTIVE = 3;
	public static final CastRemoteDisplayApi CastRemoteDisplayApi;
	public static final String EXTRA_INT_SESSION_ENDED_STATUS_CODE = "extra_int_session_ended_status_code";

	static 
	{
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zzo()));
	//    0    0:new             #43  <Class zzo>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void zzo()>
	//    3    7:putstatic       #48  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("CastRemoteDisplay.API", CLIENT_BUILDER, zzdf.zzwe);
	//    4   10:new             #50  <Class Api>
	//    5   13:dup             
	//    6   14:ldc1            #52  <String "CastRemoteDisplay.API">
	//    7   16:getstatic       #48  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//    8   19:getstatic       #58  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwe>
	//    9   22:invokespecial   #61  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   10   25:putstatic       #63  <Field Api API>
		CastRemoteDisplayApi = ((CastRemoteDisplayApi) (new zzdq(API)));
	//   11   28:new             #65  <Class zzdq>
	//   12   31:dup             
	//   13   32:getstatic       #63  <Field Api API>
	//   14   35:invokespecial   #68  <Method void zzdq(Api)>
	//   15   38:putstatic       #70  <Field CastRemoteDisplayApi CastRemoteDisplayApi>
	//*  16   41:return          
	}
}
