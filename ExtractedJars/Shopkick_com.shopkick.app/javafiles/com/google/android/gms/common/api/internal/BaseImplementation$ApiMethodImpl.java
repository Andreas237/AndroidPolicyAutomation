// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult, BaseImplementation

public static abstract class BaseImplementation$ApiMethodImpl extends BasePendingResult
	implements BaseImplementation.ResultHolder
{

	private void setFailedResult(RemoteException remoteexception)
	{
		setFailedResult(new Status(8, remoteexception.getLocalizedMessage(), ((android.app.PendingIntent) (null))));
	//    0    0:aload_0         
	//    1    1:new             #68  <Class Status>
	//    2    4:dup             
	//    3    5:bipush          8
	//    4    7:aload_1         
	//    5    8:invokevirtual   #74  <Method String RemoteException.getLocalizedMessage()>
	//    6   11:aconst_null     
	//    7   12:invokespecial   #77  <Method void Status(int, String, android.app.PendingIntent)>
	//    8   15:invokevirtual   #80  <Method void setFailedResult(Status)>
	//    9   18:return          
	}

	protected abstract void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException;

	public final Api getApi()
	{
		return mApi;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Api mApi>
	//    2    4:areturn         
	}

	public final com.google.android.gms.common.api.Api.AnyClientKey getClientKey()
	{
		return mClientKey;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field com.google.android.gms.common.api.Api$AnyClientKey mClientKey>
	//    2    4:areturn         
	}

	protected void onSetFailedResult(Result result)
	{
	//    0    0:return          
	}

	public final void run(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws DeadObjectException
	{
		Object obj = ((Object) (anyclient));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(anyclient instanceof SimpleClientAdapter)
	//*   2    2:aload_1         
	//*   3    3:instanceof      #94  <Class SimpleClientAdapter>
	//*   4    6:ifeq            17
			obj = ((Object) (((SimpleClientAdapter)anyclient).getClient()));
	//    5    9:aload_1         
	//    6   10:checkcast       #94  <Class SimpleClientAdapter>
	//    7   13:invokevirtual   #98  <Method com.google.android.gms.common.api.Api$SimpleClient SimpleClientAdapter.getClient()>
	//    8   16:astore_2        
		try
		{
			doExecute(((com.google.android.gms.common.api.Api.AnyClient) (obj)));
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #100 <Method void doExecute(com.google.android.gms.common.api.Api$AnyClient)>
			return;
	//   12   22:return          
		}
	//*  13   23:astore_1        
	//*  14   24:aload_0         
	//*  15   25:aload_1         
	//*  16   26:invokespecial   #102 <Method void setFailedResult(RemoteException)>
	//*  17   29:return          
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.common.api.Api.AnyClient anyclient)
	//*  18   30:astore_1        
		{
			setFailedResult(((RemoteException) (anyclient)));
	//   19   31:aload_0         
	//   20   32:aload_1         
	//   21   33:invokespecial   #102 <Method void setFailedResult(RemoteException)>
		}
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.common.api.Api.AnyClient anyclient)
		{
			setFailedResult(((RemoteException) (anyclient)));
			return;
		}
		throw anyclient;
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	public final void setFailedResult(Status status)
	{
		Preconditions.checkArgument(status.isSuccess() ^ true, "Failed result must not be success");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method boolean Status.isSuccess()>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ldc1            #110 <String "Failed result must not be success">
	//    5    8:invokestatic    #114 <Method void Preconditions.checkArgument(boolean, Object)>
		status = ((Status) (((BasePendingResult)this).createFailedResult(status)));
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokevirtual   #118 <Method Result BasePendingResult.createFailedResult(Status)>
	//    9   16:astore_1        
		((BasePendingResult)this).setResult(((Result) (status)));
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokevirtual   #121 <Method void BasePendingResult.setResult(Result)>
		onSetFailedResult(((Result) (status)));
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:invokevirtual   #123 <Method void onSetFailedResult(Result)>
	//   16   27:return          
	}

	public volatile void setResult(Object obj)
	{
		super.setResult((Result)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #126 <Class Result>
	//    3    5:invokespecial   #121 <Method void BasePendingResult.setResult(Result)>
	//    4    8:return          
	}

	private final Api mApi;
	private final com.google.android.gms.common.api.Api.AnyClientKey mClientKey;

	protected BaseImplementation$ApiMethodImpl(com.google.android.gms.common.api.Api.AnyClientKey anyclientkey, GoogleApiClient googleapiclient)
	{
		super((GoogleApiClient)Preconditions.checkNotNull(((Object) (googleapiclient)), "GoogleApiClient must not be null"));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc1            #23  <String "GoogleApiClient must not be null">
	//    3    4:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    7:checkcast       #31  <Class GoogleApiClient>
	//    5   10:invokespecial   #34  <Method void BasePendingResult(GoogleApiClient)>
		mClientKey = (com.google.android.gms.common.api.Api.AnyClientKey)Preconditions.checkNotNull(((Object) (anyclientkey)));
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokestatic    #37  <Method Object Preconditions.checkNotNull(Object)>
	//    9   18:checkcast       #39  <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   10   21:putfield        #41  <Field com.google.android.gms.common.api.Api$AnyClientKey mClientKey>
		mApi = null;
	//   11   24:aload_0         
	//   12   25:aconst_null     
	//   13   26:putfield        #43  <Field Api mApi>
	//   14   29:return          
	}

	protected BaseImplementation$ApiMethodImpl(Api api, GoogleApiClient googleapiclient)
	{
		super((GoogleApiClient)Preconditions.checkNotNull(((Object) (googleapiclient)), "GoogleApiClient must not be null"));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc1            #23  <String "GoogleApiClient must not be null">
	//    3    4:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    7:checkcast       #31  <Class GoogleApiClient>
	//    5   10:invokespecial   #34  <Method void BasePendingResult(GoogleApiClient)>
		Preconditions.checkNotNull(((Object) (api)), "Api must not be null");
	//    6   13:aload_1         
	//    7   14:ldc1            #52  <String "Api must not be null">
	//    8   16:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   19:pop             
		mClientKey = api.getClientKey();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #58  <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   13   25:putfield        #41  <Field com.google.android.gms.common.api.Api$AnyClientKey mClientKey>
		mApi = api;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #43  <Field Api mApi>
	//   17   33:return          
	}

	protected BaseImplementation$ApiMethodImpl( )
	{
		super();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void BasePendingResult(BasePendingResult$CallbackHandler)>
		mClientKey = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #41  <Field com.google.android.gms.common.api.Api$AnyClientKey mClientKey>
		mApi = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #43  <Field Api mApi>
	//    9   15:return          
	}
}
