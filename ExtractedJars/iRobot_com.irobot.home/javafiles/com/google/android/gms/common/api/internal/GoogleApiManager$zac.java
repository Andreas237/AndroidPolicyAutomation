// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zach, GoogleApiManager, zabo, zai

private final class GoogleApiManager$zac
	implements zach, com.google.android.gms.common.internal.ionProgressReportCallbacks
{

	static com.google.android.gms.common.api.Api.Client zaa(GoogleApiManager$zac googleapimanager$zac)
	{
		return googleapimanager$zac.zain;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field com.google.android.gms.common.api.Api$Client zain>
	//    2    4:areturn         
	}

	static boolean zaa(GoogleApiManager$zac googleapimanager$zac, boolean flag)
	{
		googleapimanager$zac.zaje = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #38  <Field boolean zaje>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	static void zab(GoogleApiManager$zac googleapimanager$zac)
	{
		googleapimanager$zac.zabr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void zabr()>
	//    2    4:return          
	}

	private final void zabr()
	{
		if(zaje && zajc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean zaje>
	//*   2    4:ifeq            31
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field IAccountAccessor zajc>
	//*   5   11:ifnull          31
			zain.getRemoteService(zajc, zajd);
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field com.google.android.gms.common.api.Api$Client zain>
	//    8   18:aload_0         
	//    9   19:getfield        #34  <Field IAccountAccessor zajc>
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field Set zajd>
	//   12   26:invokeinterface #59  <Method void com.google.android.gms.common.api.Api$Client.getRemoteService(IAccountAccessor, Set)>
	//   13   31:return          
	}

	static zai zac(GoogleApiManager$zac googleapimanager$zac)
	{
		return googleapimanager$zac.zafp;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field zai zafp>
	//    2    4:areturn         
	}

	public final void onReportServiceBinding(ConnectionResult connectionresult)
	{
		GoogleApiManager.zaa(zail).post(((Runnable) (new zabo(this, connectionresult))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field GoogleApiManager zail>
	//    2    4:invokestatic    #65  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
	//    3    7:new             #67  <Class zabo>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #70  <Method void zabo(GoogleApiManager$zac, ConnectionResult)>
	//    8   16:invokevirtual   #76  <Method boolean Handler.post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public final void zaa(IAccountAccessor iaccountaccessor, Set set)
	{
		if(iaccountaccessor != null && set != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            26
		{
			zajc = iaccountaccessor;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #34  <Field IAccountAccessor zajc>
			zajd = set;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #36  <Field Set zajd>
			zabr();
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method void zabr()>
			return;
	//   13   25:return          
		} else
		{
			Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", ((Throwable) (new Exception())));
	//   14   26:ldc1            #78  <String "GoogleApiManager">
	//   15   28:ldc1            #80  <String "Received null response from onSignInSuccess">
	//   16   30:new             #82  <Class Exception>
	//   17   33:dup             
	//   18   34:invokespecial   #83  <Method void Exception()>
	//   19   37:invokestatic    #89  <Method int Log.wtf(String, String, Throwable)>
	//   20   40:pop             
			zag(new ConnectionResult(4));
	//   21   41:aload_0         
	//   22   42:new             #91  <Class ConnectionResult>
	//   23   45:dup             
	//   24   46:iconst_4        
	//   25   47:invokespecial   #94  <Method void ConnectionResult(int)>
	//   26   50:invokevirtual   #97  <Method void zag(ConnectionResult)>
			return;
	//   27   53:return          
		}
	}

	public final void zag(ConnectionResult connectionresult)
	{
		((GoogleApiManager$zaa)GoogleApiManager.zaj(zail).get(((Object) (zafp)))).zag(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field GoogleApiManager zail>
	//    2    4:invokestatic    #102 <Method Map GoogleApiManager.zaj(GoogleApiManager)>
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field zai zafp>
	//    5   11:invokeinterface #108 <Method Object Map.get(Object)>
	//    6   16:checkcast       #110 <Class GoogleApiManager$zaa>
	//    7   19:aload_1         
	//    8   20:invokevirtual   #111 <Method void GoogleApiManager$zaa.zag(ConnectionResult)>
	//    9   23:return          
	}

	private final zai zafp;
	final GoogleApiManager zail;
	private final com.google.android.gms.common.api.Api.Client zain;
	private IAccountAccessor zajc;
	private Set zajd;
	private boolean zaje;

	public GoogleApiManager$zac(GoogleApiManager googleapimanager, com.google.android.gms.common.api.Api.Client client, zai zai)
	{
		zail = googleapimanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field GoogleApiManager zail>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #32  <Method void Object()>
		zajc = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #34  <Field IAccountAccessor zajc>
		zajd = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #36  <Field Set zajd>
		zaje = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #38  <Field boolean zaje>
		zain = client;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #40  <Field com.google.android.gms.common.api.Api$Client zain>
		zafp = zai;
	//   17   29:aload_0         
	//   18   30:aload_3         
	//   19   31:putfield        #42  <Field zai zafp>
	//   20   34:return          
	}
}
