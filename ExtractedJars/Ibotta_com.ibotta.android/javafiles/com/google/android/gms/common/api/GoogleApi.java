// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zzad;
import com.google.android.gms.common.api.internal.zzbo;
import com.google.android.gms.common.api.internal.zzby;
import com.google.android.gms.common.api.internal.zzh;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.common.api:
//			Api, GoogleApiClient, zzb

public class GoogleApi
{
	public static class Settings
	{

		public static final Settings DEFAULT_SETTINGS = (new Builder()).build();
		public final StatusExceptionMapper zzcr;
		public final Looper zzcs;

		static 
		{
		//    0    0:new             #9   <Class GoogleApi$Settings$Builder>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void GoogleApi$Settings$Builder()>
		//    3    7:invokevirtual   #26  <Method GoogleApi$Settings GoogleApi$Settings$Builder.build()>
		//    4   10:putstatic       #28  <Field GoogleApi$Settings DEFAULT_SETTINGS>
		//*   5   13:return          
		}

		private Settings(StatusExceptionMapper statusexceptionmapper, Account account, Looper looper)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			zzcr = statusexceptionmapper;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field StatusExceptionMapper zzcr>
			zzcs = looper;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #35  <Field Looper zzcs>
		//    8   14:return          
		}

		Settings(StatusExceptionMapper statusexceptionmapper, Account account, Looper looper, zzb zzb)
		{
			this(statusexceptionmapper, ((Account) (null)), looper);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:aload_3         
		//    4    4:invokespecial   #39  <Method void GoogleApi$Settings(StatusExceptionMapper, Account, Looper)>
		//    5    7:return          
		}
	}

	public static class Settings.Builder
	{

		public Settings build()
		{
			if(zzcp == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field StatusExceptionMapper zzcp>
		//*   2    4:ifnonnull       18
				zzcp = ((StatusExceptionMapper) (new ApiExceptionMapper()));
		//    3    7:aload_0         
		//    4    8:new             #27  <Class ApiExceptionMapper>
		//    5   11:dup             
		//    6   12:invokespecial   #28  <Method void ApiExceptionMapper()>
		//    7   15:putfield        #25  <Field StatusExceptionMapper zzcp>
			if(zzcn == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #30  <Field Looper zzcn>
		//*  10   22:ifnonnull       32
				zzcn = Looper.getMainLooper();
		//   11   25:aload_0         
		//   12   26:invokestatic    #36  <Method Looper Looper.getMainLooper()>
		//   13   29:putfield        #30  <Field Looper zzcn>
			return new Settings(zzcp, ((Account) (null)), zzcn, ((zzb) (null)));
		//   14   32:new             #6   <Class GoogleApi$Settings>
		//   15   35:dup             
		//   16   36:aload_0         
		//   17   37:getfield        #25  <Field StatusExceptionMapper zzcp>
		//   18   40:aconst_null     
		//   19   41:aload_0         
		//   20   42:getfield        #30  <Field Looper zzcn>
		//   21   45:aconst_null     
		//   22   46:invokespecial   #39  <Method void GoogleApi$Settings(StatusExceptionMapper, Account, Looper, zzb)>
		//   23   49:areturn         
		}

		public Settings.Builder setLooper(Looper looper)
		{
			Preconditions.checkNotNull(((Object) (looper)), "Looper must not be null.");
		//    0    0:aload_1         
		//    1    1:ldc1            #43  <String "Looper must not be null.">
		//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zzcn = looper;
		//    4    7:aload_0         
		//    5    8:aload_1         
		//    6    9:putfield        #30  <Field Looper zzcn>
			return this;
		//    7   12:aload_0         
		//    8   13:areturn         
		}

		public Settings.Builder setMapper(StatusExceptionMapper statusexceptionmapper)
		{
			Preconditions.checkNotNull(((Object) (statusexceptionmapper)), "StatusExceptionMapper must not be null.");
		//    0    0:aload_1         
		//    1    1:ldc1            #53  <String "StatusExceptionMapper must not be null.">
		//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zzcp = statusexceptionmapper;
		//    4    7:aload_0         
		//    5    8:aload_1         
		//    6    9:putfield        #25  <Field StatusExceptionMapper zzcp>
			return this;
		//    7   12:aload_0         
		//    8   13:areturn         
		}

		private Looper zzcn;
		private StatusExceptionMapper zzcp;

		public Settings.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	public GoogleApi(Activity activity, Api api, Api.ApiOptions apioptions, Settings settings)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		Preconditions.checkNotNull(((Object) (activity)), "Null activity is not permitted.");
	//    2    4:aload_1         
	//    3    5:ldc1            #42  <String "Null activity is not permitted.">
	//    4    7:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		Preconditions.checkNotNull(((Object) (api)), "Api must not be null.");
	//    6   11:aload_2         
	//    7   12:ldc1            #50  <String "Api must not be null.">
	//    8   14:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   17:pop             
		Preconditions.checkNotNull(((Object) (settings)), "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
	//   10   18:aload           4
	//   11   20:ldc1            #52  <String "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.">
	//   12   22:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   13   25:pop             
		mContext = activity.getApplicationContext();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #58  <Method Context Activity.getApplicationContext()>
	//   17   31:putfield        #60  <Field Context mContext>
		mApi = api;
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #62  <Field Api mApi>
		zzcl = apioptions;
	//   21   39:aload_0         
	//   22   40:aload_3         
	//   23   41:putfield        #64  <Field Api$ApiOptions zzcl>
		zzcn = settings.zzcs;
	//   24   44:aload_0         
	//   25   45:aload           4
	//   26   47:getfield        #67  <Field Looper GoogleApi$Settings.zzcs>
	//   27   50:putfield        #69  <Field Looper zzcn>
		zzcm = zzh.zza(mApi, zzcl);
	//   28   53:aload_0         
	//   29   54:aload_0         
	//   30   55:getfield        #62  <Field Api mApi>
	//   31   58:aload_0         
	//   32   59:getfield        #64  <Field Api$ApiOptions zzcl>
	//   33   62:invokestatic    #75  <Method zzh zzh.zza(Api, Api$ApiOptions)>
	//   34   65:putfield        #77  <Field zzh zzcm>
		zzco = ((GoogleApiClient) (new zzbo(this)));
	//   35   68:aload_0         
	//   36   69:new             #79  <Class zzbo>
	//   37   72:dup             
	//   38   73:aload_0         
	//   39   74:invokespecial   #82  <Method void zzbo(GoogleApi)>
	//   40   77:putfield        #84  <Field GoogleApiClient zzco>
		zzcq = GoogleApiManager.zzb(mContext);
	//   41   80:aload_0         
	//   42   81:aload_0         
	//   43   82:getfield        #60  <Field Context mContext>
	//   44   85:invokestatic    #90  <Method GoogleApiManager GoogleApiManager.zzb(Context)>
	//   45   88:putfield        #92  <Field GoogleApiManager zzcq>
		mId = zzcq.zzbg();
	//   46   91:aload_0         
	//   47   92:aload_0         
	//   48   93:getfield        #92  <Field GoogleApiManager zzcq>
	//   49   96:invokevirtual   #96  <Method int GoogleApiManager.zzbg()>
	//   50   99:putfield        #98  <Field int mId>
		zzcp = settings.zzcr;
	//   51  102:aload_0         
	//   52  103:aload           4
	//   53  105:getfield        #101 <Field StatusExceptionMapper GoogleApi$Settings.zzcr>
	//   54  108:putfield        #103 <Field StatusExceptionMapper zzcp>
		zzad.zza(activity, zzcq, zzcm);
	//   55  111:aload_1         
	//   56  112:aload_0         
	//   57  113:getfield        #92  <Field GoogleApiManager zzcq>
	//   58  116:aload_0         
	//   59  117:getfield        #77  <Field zzh zzcm>
	//   60  120:invokestatic    #108 <Method void zzad.zza(Activity, GoogleApiManager, zzh)>
		zzcq.zza(this);
	//   61  123:aload_0         
	//   62  124:getfield        #92  <Field GoogleApiManager zzcq>
	//   63  127:aload_0         
	//   64  128:invokevirtual   #110 <Method void GoogleApiManager.zza(GoogleApi)>
	//   65  131:return          
	}

	public GoogleApi(Activity activity, Api api, Api.ApiOptions apioptions, StatusExceptionMapper statusexceptionmapper)
	{
		this(activity, api, apioptions, (new Settings.Builder()).setMapper(statusexceptionmapper).setLooper(activity.getMainLooper()).build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #10  <Class GoogleApi$Settings$Builder>
	//    5    7:dup             
	//    6    8:invokespecial   #118 <Method void GoogleApi$Settings$Builder()>
	//    7   11:aload           4
	//    8   13:invokevirtual   #122 <Method GoogleApi$Settings$Builder GoogleApi$Settings$Builder.setMapper(StatusExceptionMapper)>
	//    9   16:aload_1         
	//   10   17:invokevirtual   #126 <Method Looper Activity.getMainLooper()>
	//   11   20:invokevirtual   #130 <Method GoogleApi$Settings$Builder GoogleApi$Settings$Builder.setLooper(Looper)>
	//   12   23:invokevirtual   #134 <Method GoogleApi$Settings GoogleApi$Settings$Builder.build()>
	//   13   26:invokespecial   #136 <Method void GoogleApi(Activity, Api, Api$ApiOptions, GoogleApi$Settings)>
	//   14   29:return          
	}

	protected GoogleApi(Context context, Api api, Looper looper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		Preconditions.checkNotNull(((Object) (context)), "Null context is not permitted.");
	//    2    4:aload_1         
	//    3    5:ldc1            #141 <String "Null context is not permitted.">
	//    4    7:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		Preconditions.checkNotNull(((Object) (api)), "Api must not be null.");
	//    6   11:aload_2         
	//    7   12:ldc1            #50  <String "Api must not be null.">
	//    8   14:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   17:pop             
		Preconditions.checkNotNull(((Object) (looper)), "Looper must not be null.");
	//   10   18:aload_3         
	//   11   19:ldc1            #143 <String "Looper must not be null.">
	//   12   21:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   13   24:pop             
		mContext = context.getApplicationContext();
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokevirtual   #146 <Method Context Context.getApplicationContext()>
	//   17   30:putfield        #60  <Field Context mContext>
		mApi = api;
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:putfield        #62  <Field Api mApi>
		zzcl = null;
	//   21   38:aload_0         
	//   22   39:aconst_null     
	//   23   40:putfield        #64  <Field Api$ApiOptions zzcl>
		zzcn = looper;
	//   24   43:aload_0         
	//   25   44:aload_3         
	//   26   45:putfield        #69  <Field Looper zzcn>
		zzcm = zzh.zza(api);
	//   27   48:aload_0         
	//   28   49:aload_2         
	//   29   50:invokestatic    #149 <Method zzh zzh.zza(Api)>
	//   30   53:putfield        #77  <Field zzh zzcm>
		zzco = ((GoogleApiClient) (new zzbo(this)));
	//   31   56:aload_0         
	//   32   57:new             #79  <Class zzbo>
	//   33   60:dup             
	//   34   61:aload_0         
	//   35   62:invokespecial   #82  <Method void zzbo(GoogleApi)>
	//   36   65:putfield        #84  <Field GoogleApiClient zzco>
		zzcq = GoogleApiManager.zzb(mContext);
	//   37   68:aload_0         
	//   38   69:aload_0         
	//   39   70:getfield        #60  <Field Context mContext>
	//   40   73:invokestatic    #90  <Method GoogleApiManager GoogleApiManager.zzb(Context)>
	//   41   76:putfield        #92  <Field GoogleApiManager zzcq>
		mId = zzcq.zzbg();
	//   42   79:aload_0         
	//   43   80:aload_0         
	//   44   81:getfield        #92  <Field GoogleApiManager zzcq>
	//   45   84:invokevirtual   #96  <Method int GoogleApiManager.zzbg()>
	//   46   87:putfield        #98  <Field int mId>
		zzcp = ((StatusExceptionMapper) (new ApiExceptionMapper()));
	//   47   90:aload_0         
	//   48   91:new             #151 <Class ApiExceptionMapper>
	//   49   94:dup             
	//   50   95:invokespecial   #152 <Method void ApiExceptionMapper()>
	//   51   98:putfield        #103 <Field StatusExceptionMapper zzcp>
	//   52  101:return          
	}

	public GoogleApi(Context context, Api api, Api.ApiOptions apioptions, Looper looper, StatusExceptionMapper statusexceptionmapper)
	{
		this(context, api, apioptions, (new Settings.Builder()).setLooper(looper).setMapper(statusexceptionmapper).build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #10  <Class GoogleApi$Settings$Builder>
	//    5    7:dup             
	//    6    8:invokespecial   #118 <Method void GoogleApi$Settings$Builder()>
	//    7   11:aload           4
	//    8   13:invokevirtual   #130 <Method GoogleApi$Settings$Builder GoogleApi$Settings$Builder.setLooper(Looper)>
	//    9   16:aload           5
	//   10   18:invokevirtual   #122 <Method GoogleApi$Settings$Builder GoogleApi$Settings$Builder.setMapper(StatusExceptionMapper)>
	//   11   21:invokevirtual   #134 <Method GoogleApi$Settings GoogleApi$Settings$Builder.build()>
	//   12   24:invokespecial   #157 <Method void GoogleApi(Context, Api, Api$ApiOptions, GoogleApi$Settings)>
	//   13   27:return          
	}

	public GoogleApi(Context context, Api api, Api.ApiOptions apioptions, Settings settings)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		Preconditions.checkNotNull(((Object) (context)), "Null context is not permitted.");
	//    2    4:aload_1         
	//    3    5:ldc1            #141 <String "Null context is not permitted.">
	//    4    7:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		Preconditions.checkNotNull(((Object) (api)), "Api must not be null.");
	//    6   11:aload_2         
	//    7   12:ldc1            #50  <String "Api must not be null.">
	//    8   14:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   17:pop             
		Preconditions.checkNotNull(((Object) (settings)), "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
	//   10   18:aload           4
	//   11   20:ldc1            #52  <String "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.">
	//   12   22:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   13   25:pop             
		mContext = context.getApplicationContext();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #146 <Method Context Context.getApplicationContext()>
	//   17   31:putfield        #60  <Field Context mContext>
		mApi = api;
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #62  <Field Api mApi>
		zzcl = apioptions;
	//   21   39:aload_0         
	//   22   40:aload_3         
	//   23   41:putfield        #64  <Field Api$ApiOptions zzcl>
		zzcn = settings.zzcs;
	//   24   44:aload_0         
	//   25   45:aload           4
	//   26   47:getfield        #67  <Field Looper GoogleApi$Settings.zzcs>
	//   27   50:putfield        #69  <Field Looper zzcn>
		zzcm = zzh.zza(mApi, zzcl);
	//   28   53:aload_0         
	//   29   54:aload_0         
	//   30   55:getfield        #62  <Field Api mApi>
	//   31   58:aload_0         
	//   32   59:getfield        #64  <Field Api$ApiOptions zzcl>
	//   33   62:invokestatic    #75  <Method zzh zzh.zza(Api, Api$ApiOptions)>
	//   34   65:putfield        #77  <Field zzh zzcm>
		zzco = ((GoogleApiClient) (new zzbo(this)));
	//   35   68:aload_0         
	//   36   69:new             #79  <Class zzbo>
	//   37   72:dup             
	//   38   73:aload_0         
	//   39   74:invokespecial   #82  <Method void zzbo(GoogleApi)>
	//   40   77:putfield        #84  <Field GoogleApiClient zzco>
		zzcq = GoogleApiManager.zzb(mContext);
	//   41   80:aload_0         
	//   42   81:aload_0         
	//   43   82:getfield        #60  <Field Context mContext>
	//   44   85:invokestatic    #90  <Method GoogleApiManager GoogleApiManager.zzb(Context)>
	//   45   88:putfield        #92  <Field GoogleApiManager zzcq>
		mId = zzcq.zzbg();
	//   46   91:aload_0         
	//   47   92:aload_0         
	//   48   93:getfield        #92  <Field GoogleApiManager zzcq>
	//   49   96:invokevirtual   #96  <Method int GoogleApiManager.zzbg()>
	//   50   99:putfield        #98  <Field int mId>
		zzcp = settings.zzcr;
	//   51  102:aload_0         
	//   52  103:aload           4
	//   53  105:getfield        #101 <Field StatusExceptionMapper GoogleApi$Settings.zzcr>
	//   54  108:putfield        #103 <Field StatusExceptionMapper zzcp>
		zzcq.zza(this);
	//   55  111:aload_0         
	//   56  112:getfield        #92  <Field GoogleApiManager zzcq>
	//   57  115:aload_0         
	//   58  116:invokevirtual   #110 <Method void GoogleApiManager.zza(GoogleApi)>
	//   59  119:return          
	}

	public GoogleApi(Context context, Api api, Api.ApiOptions apioptions, StatusExceptionMapper statusexceptionmapper)
	{
		this(context, api, apioptions, (new Settings.Builder()).setMapper(statusexceptionmapper).build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #10  <Class GoogleApi$Settings$Builder>
	//    5    7:dup             
	//    6    8:invokespecial   #118 <Method void GoogleApi$Settings$Builder()>
	//    7   11:aload           4
	//    8   13:invokevirtual   #122 <Method GoogleApi$Settings$Builder GoogleApi$Settings$Builder.setMapper(StatusExceptionMapper)>
	//    9   16:invokevirtual   #134 <Method GoogleApi$Settings GoogleApi$Settings$Builder.build()>
	//   10   19:invokespecial   #157 <Method void GoogleApi(Context, Api, Api$ApiOptions, GoogleApi$Settings)>
	//   11   22:return          
	}

	private final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zza(int i, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		((BasePendingResult) (apimethodimpl)).zzx();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #167 <Method void BasePendingResult.zzx()>
		zzcq.zza(this, i, apimethodimpl);
	//    2    4:aload_0         
	//    3    5:getfield        #92  <Field GoogleApiManager zzcq>
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #170 <Method void GoogleApiManager.zza(GoogleApi, int, com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
		return apimethodimpl;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	private final Task zza(int i, TaskApiCall taskapicall)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #174 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #175 <Method void TaskCompletionSource()>
	//    3    7:astore_3        
		zzcq.zza(this, i, taskapicall, taskcompletionsource, zzcp);
	//    4    8:aload_0         
	//    5    9:getfield        #92  <Field GoogleApiManager zzcq>
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #103 <Field StatusExceptionMapper zzcp>
	//   12   20:invokevirtual   #178 <Method void GoogleApiManager.zza(GoogleApi, int, TaskApiCall, TaskCompletionSource, StatusExceptionMapper)>
		return taskcompletionsource.getTask();
	//   13   23:aload_3         
	//   14   24:invokevirtual   #182 <Method Task TaskCompletionSource.getTask()>
	//   15   27:areturn         
	}

	public GoogleApiClient asGoogleApiClient()
	{
		return zzco;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field GoogleApiClient zzco>
	//    2    4:areturn         
	}

	protected com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder()
	{
		Object obj;
		com.google.android.gms.common.internal.ClientSettings.Builder builder;
label0:
		{
			builder = new com.google.android.gms.common.internal.ClientSettings.Builder();
	//    0    0:new             #189 <Class com.google.android.gms.common.internal.ClientSettings$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #190 <Method void com.google.android.gms.common.internal.ClientSettings$Builder()>
	//    3    7:astore_2        
			obj = ((Object) (zzcl));
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field Api$ApiOptions zzcl>
	//    6   12:astore_1        
			if(obj instanceof Api.ApiOptions.HasGoogleSignInAccountOptions)
	//*   7   13:aload_1         
	//*   8   14:instanceof      #192 <Class Api$ApiOptions$HasGoogleSignInAccountOptions>
	//*   9   17:ifeq            42
			{
				obj = ((Object) (((Api.ApiOptions.HasGoogleSignInAccountOptions)obj).getGoogleSignInAccount()));
	//   10   20:aload_1         
	//   11   21:checkcast       #192 <Class Api$ApiOptions$HasGoogleSignInAccountOptions>
	//   12   24:invokeinterface #196 <Method GoogleSignInAccount Api$ApiOptions$HasGoogleSignInAccountOptions.getGoogleSignInAccount()>
	//   13   29:astore_1        
				if(obj != null)
	//*  14   30:aload_1         
	//*  15   31:ifnull          42
				{
					obj = ((Object) (((GoogleSignInAccount) (obj)).getAccount()));
	//   16   34:aload_1         
	//   17   35:invokevirtual   #202 <Method Account GoogleSignInAccount.getAccount()>
	//   18   38:astore_1        
					break label0;
	//   19   39:goto            69
				}
			}
			obj = ((Object) (zzcl));
	//   20   42:aload_0         
	//   21   43:getfield        #64  <Field Api$ApiOptions zzcl>
	//   22   46:astore_1        
			if(obj instanceof Api.ApiOptions.HasAccountOptions)
	//*  23   47:aload_1         
	//*  24   48:instanceof      #204 <Class Api$ApiOptions$HasAccountOptions>
	//*  25   51:ifeq            67
				obj = ((Object) (((Api.ApiOptions.HasAccountOptions)obj).getAccount()));
	//   26   54:aload_1         
	//   27   55:checkcast       #204 <Class Api$ApiOptions$HasAccountOptions>
	//   28   58:invokeinterface #205 <Method Account Api$ApiOptions$HasAccountOptions.getAccount()>
	//   29   63:astore_1        
			else
	//*  30   64:goto            69
				obj = null;
	//   31   67:aconst_null     
	//   32   68:astore_1        
		}
label1:
		{
			builder = builder.setAccount(((Account) (obj)));
	//   33   69:aload_2         
	//   34   70:aload_1         
	//   35   71:invokevirtual   #209 <Method com.google.android.gms.common.internal.ClientSettings$Builder com.google.android.gms.common.internal.ClientSettings$Builder.setAccount(Account)>
	//   36   74:astore_2        
			obj = ((Object) (zzcl));
	//   37   75:aload_0         
	//   38   76:getfield        #64  <Field Api$ApiOptions zzcl>
	//   39   79:astore_1        
			if(obj instanceof Api.ApiOptions.HasGoogleSignInAccountOptions)
	//*  40   80:aload_1         
	//*  41   81:instanceof      #192 <Class Api$ApiOptions$HasGoogleSignInAccountOptions>
	//*  42   84:ifeq            109
			{
				obj = ((Object) (((Api.ApiOptions.HasGoogleSignInAccountOptions)obj).getGoogleSignInAccount()));
	//   43   87:aload_1         
	//   44   88:checkcast       #192 <Class Api$ApiOptions$HasGoogleSignInAccountOptions>
	//   45   91:invokeinterface #196 <Method GoogleSignInAccount Api$ApiOptions$HasGoogleSignInAccountOptions.getGoogleSignInAccount()>
	//   46   96:astore_1        
				if(obj != null)
	//*  47   97:aload_1         
	//*  48   98:ifnull          109
				{
					obj = ((Object) (((GoogleSignInAccount) (obj)).getRequestedScopes()));
	//   49  101:aload_1         
	//   50  102:invokevirtual   #213 <Method java.util.Set GoogleSignInAccount.getRequestedScopes()>
	//   51  105:astore_1        
					break label1;
	//   52  106:goto            113
				}
			}
			obj = ((Object) (Collections.emptySet()));
	//   53  109:invokestatic    #218 <Method java.util.Set Collections.emptySet()>
	//   54  112:astore_1        
		}
		return builder.addAllRequiredScopes(((java.util.Collection) (obj))).setRealClientClassName(((Object) (mContext)).getClass().getName()).setRealClientPackageName(mContext.getPackageName());
	//   55  113:aload_2         
	//   56  114:aload_1         
	//   57  115:invokevirtual   #222 <Method com.google.android.gms.common.internal.ClientSettings$Builder com.google.android.gms.common.internal.ClientSettings$Builder.addAllRequiredScopes(java.util.Collection)>
	//   58  118:aload_0         
	//   59  119:getfield        #60  <Field Context mContext>
	//   60  122:invokevirtual   #226 <Method Class Object.getClass()>
	//   61  125:invokevirtual   #232 <Method String Class.getName()>
	//   62  128:invokevirtual   #236 <Method com.google.android.gms.common.internal.ClientSettings$Builder com.google.android.gms.common.internal.ClientSettings$Builder.setRealClientClassName(String)>
	//   63  131:aload_0         
	//   64  132:getfield        #60  <Field Context mContext>
	//   65  135:invokevirtual   #239 <Method String Context.getPackageName()>
	//   66  138:invokevirtual   #242 <Method com.google.android.gms.common.internal.ClientSettings$Builder com.google.android.gms.common.internal.ClientSettings$Builder.setRealClientPackageName(String)>
	//   67  141:areturn         
	}

	protected Task disconnectService()
	{
		return zzcq.zzc(this);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field GoogleApiManager zzcq>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #247 <Method Task GoogleApiManager.zzc(GoogleApi)>
	//    4    8:areturn         
	}

	public com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl doBestEffortWrite(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		return zza(2, apimethodimpl);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_1         
	//    3    3:invokespecial   #252 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zza(int, com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    4    6:areturn         
	}

	public Task doBestEffortWrite(TaskApiCall taskapicall)
	{
		return zza(2, taskapicall);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_1         
	//    3    3:invokespecial   #256 <Method Task zza(int, TaskApiCall)>
	//    4    6:areturn         
	}

	public com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl doRead(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		return zza(0, apimethodimpl);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokespecial   #252 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zza(int, com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    4    6:areturn         
	}

	public Task doRead(TaskApiCall taskapicall)
	{
		return zza(0, taskapicall);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokespecial   #256 <Method Task zza(int, TaskApiCall)>
	//    4    6:areturn         
	}

	public Task doRegisterEventListener(RegisterListenerMethod registerlistenermethod, UnregisterListenerMethod unregisterlistenermethod)
	{
		Preconditions.checkNotNull(((Object) (registerlistenermethod)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #263 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (unregisterlistenermethod)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #263 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		Preconditions.checkNotNull(((Object) (registerlistenermethod.getListenerKey())), "Listener has already been released.");
	//    6   10:aload_1         
	//    7   11:invokevirtual   #269 <Method com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey RegisterListenerMethod.getListenerKey()>
	//    8   14:ldc2            #271 <String "Listener has already been released.">
	//    9   17:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   10   20:pop             
		Preconditions.checkNotNull(((Object) (unregisterlistenermethod.getListenerKey())), "Listener has already been released.");
	//   11   21:aload_2         
	//   12   22:invokevirtual   #274 <Method com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey UnregisterListenerMethod.getListenerKey()>
	//   13   25:ldc2            #271 <String "Listener has already been released.">
	//   14   28:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   15   31:pop             
		Preconditions.checkArgument(registerlistenermethod.getListenerKey().equals(((Object) (unregisterlistenermethod.getListenerKey()))), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
	//   16   32:aload_1         
	//   17   33:invokevirtual   #269 <Method com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey RegisterListenerMethod.getListenerKey()>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #274 <Method com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey UnregisterListenerMethod.getListenerKey()>
	//   20   40:invokevirtual   #280 <Method boolean com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey.equals(Object)>
	//   21   43:ldc2            #282 <String "Listener registration and unregistration methods must be constructed with the same ListenerHolder.">
	//   22   46:invokestatic    #286 <Method void Preconditions.checkArgument(boolean, Object)>
		return zzcq.zza(this, registerlistenermethod, unregisterlistenermethod);
	//   23   49:aload_0         
	//   24   50:getfield        #92  <Field GoogleApiManager zzcq>
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokevirtual   #289 <Method Task GoogleApiManager.zza(GoogleApi, RegisterListenerMethod, UnregisterListenerMethod)>
	//   29   59:areturn         
	}

	public Task doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerkey)
	{
		Preconditions.checkNotNull(((Object) (listenerkey)), "Listener key cannot be null.");
	//    0    0:aload_1         
	//    1    1:ldc2            #294 <String "Listener key cannot be null.">
	//    2    4:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    7:pop             
		return zzcq.zza(this, listenerkey);
	//    4    8:aload_0         
	//    5    9:getfield        #92  <Field GoogleApiManager zzcq>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #297 <Method Task GoogleApiManager.zza(GoogleApi, com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey)>
	//    9   17:areturn         
	}

	public com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl doWrite(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		return zza(1, apimethodimpl);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #252 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zza(int, com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    4    6:areturn         
	}

	public Task doWrite(TaskApiCall taskapicall)
	{
		return zza(1, taskapicall);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #256 <Method Task zza(int, TaskApiCall)>
	//    4    6:areturn         
	}

	public final Api getApi()
	{
		return mApi;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Api mApi>
	//    2    4:areturn         
	}

	public Api.ApiOptions getApiOptions()
	{
		return zzcl;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Api$ApiOptions zzcl>
	//    2    4:areturn         
	}

	public Context getApplicationContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Context mContext>
	//    2    4:areturn         
	}

	public final int getInstanceId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field int mId>
	//    2    4:ireturn         
	}

	public Looper getLooper()
	{
		return zzcn;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Looper zzcn>
	//    2    4:areturn         
	}

	public ListenerHolder registerListener(Object obj, String s)
	{
		return ListenerHolders.createListenerHolder(obj, zzcn, s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #69  <Field Looper zzcn>
	//    3    5:aload_2         
	//    4    6:invokestatic    #315 <Method ListenerHolder ListenerHolders.createListenerHolder(Object, Looper, String)>
	//    5    9:areturn         
	}

	public Api.Client zza(Looper looper, com.google.android.gms.common.api.internal.GoogleApiManager.zza zza1)
	{
		com.google.android.gms.common.internal.ClientSettings clientsettings = createClientSettingsBuilder().build();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #320 <Method com.google.android.gms.common.internal.ClientSettings$Builder createClientSettingsBuilder()>
	//    2    4:invokevirtual   #323 <Method com.google.android.gms.common.internal.ClientSettings com.google.android.gms.common.internal.ClientSettings$Builder.build()>
	//    3    7:astore_3        
		return mApi.zzk().buildClient(mContext, looper, clientsettings, ((Object) (zzcl)), ((GoogleApiClient.ConnectionCallbacks) (zza1)), ((GoogleApiClient.OnConnectionFailedListener) (zza1)));
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field Api mApi>
	//    6   12:invokevirtual   #329 <Method Api$AbstractClientBuilder Api.zzk()>
	//    7   15:aload_0         
	//    8   16:getfield        #60  <Field Context mContext>
	//    9   19:aload_1         
	//   10   20:aload_3         
	//   11   21:aload_0         
	//   12   22:getfield        #64  <Field Api$ApiOptions zzcl>
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #335 <Method Api$Client Api$AbstractClientBuilder.buildClient(Context, Looper, com.google.android.gms.common.internal.ClientSettings, Object, GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener)>
	//   16   30:areturn         
	}

	public zzby zza(Context context, Handler handler)
	{
		return new zzby(context, handler, createClientSettingsBuilder().build());
	//    0    0:new             #339 <Class zzby>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #320 <Method com.google.android.gms.common.internal.ClientSettings$Builder createClientSettingsBuilder()>
	//    6   10:invokevirtual   #323 <Method com.google.android.gms.common.internal.ClientSettings com.google.android.gms.common.internal.ClientSettings$Builder.build()>
	//    7   13:invokespecial   #342 <Method void zzby(Context, Handler, com.google.android.gms.common.internal.ClientSettings)>
	//    8   16:areturn         
	}

	public final zzh zzm()
	{
		return zzcm;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field zzh zzcm>
	//    2    4:areturn         
	}

	private final Api mApi;
	private final Context mContext;
	private final int mId;
	private final Api.ApiOptions zzcl;
	private final zzh zzcm;
	private final Looper zzcn;
	private final GoogleApiClient zzco;
	private final StatusExceptionMapper zzcp;
	protected final GoogleApiManager zzcq;
}
