// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			GoogleApiManager

final class zabo
	implements Runnable
{

	zabo(GoogleApiManager.zac zac, ConnectionResult connectionresult)
	{
		zajf = zac;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field GoogleApiManager$zac zajf>
		zaiy = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field ConnectionResult zaiy>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		SecurityException securityexception;
		if(zaiy.isSuccess())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ConnectionResult zaiy>
	//*   2    4:invokevirtual   #29  <Method boolean ConnectionResult.isSuccess()>
	//*   3    7:ifeq            97
		{
			GoogleApiManager.zac.zaa(zajf, true);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field GoogleApiManager$zac zajf>
	//    6   14:iconst_1        
	//    7   15:invokestatic    #35  <Method boolean GoogleApiManager$zac.zaa(GoogleApiManager$zac, boolean)>
	//    8   18:pop             
			if(GoogleApiManager.zac.zaa(zajf).requiresSignIn())
	//*   9   19:aload_0         
	//*  10   20:getfield        #14  <Field GoogleApiManager$zac zajf>
	//*  11   23:invokestatic    #38  <Method com.google.android.gms.common.api.Api$Client GoogleApiManager$zac.zaa(GoogleApiManager$zac)>
	//*  12   26:invokeinterface #43  <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  13   31:ifeq            42
			{
				GoogleApiManager.zac.zab(zajf);
	//   14   34:aload_0         
	//   15   35:getfield        #14  <Field GoogleApiManager$zac zajf>
	//   16   38:invokestatic    #47  <Method void GoogleApiManager$zac.zab(GoogleApiManager$zac)>
				return;
	//   17   41:return          
			}
			try
			{
				GoogleApiManager.zac.zaa(zajf).getRemoteService(((com.google.android.gms.common.internal.IAccountAccessor) (null)), Collections.emptySet());
	//   18   42:aload_0         
	//   19   43:getfield        #14  <Field GoogleApiManager$zac zajf>
	//   20   46:invokestatic    #38  <Method com.google.android.gms.common.api.Api$Client GoogleApiManager$zac.zaa(GoogleApiManager$zac)>
	//   21   49:aconst_null     
	//   22   50:invokestatic    #53  <Method java.util.Set Collections.emptySet()>
	//   23   53:invokeinterface #57  <Method void com.google.android.gms.common.api.Api$Client.getRemoteService(com.google.android.gms.common.internal.IAccountAccessor, java.util.Set)>
				return;
	//   24   58:return          
			}
	//*  25   59:aload_0         
	//*  26   60:getfield        #14  <Field GoogleApiManager$zac zajf>
	//*  27   63:getfield        #61  <Field GoogleApiManager GoogleApiManager$zac.zail>
	//*  28   66:invokestatic    #67  <Method Map GoogleApiManager.zaj(GoogleApiManager)>
	//*  29   69:aload_0         
	//*  30   70:getfield        #14  <Field GoogleApiManager$zac zajf>
	//*  31   73:invokestatic    #71  <Method zai GoogleApiManager$zac.zac(GoogleApiManager$zac)>
	//*  32   76:invokeinterface #77  <Method Object Map.get(Object)>
	//*  33   81:checkcast       #79  <Class GoogleApiManager$zaa>
	//*  34   84:new             #25  <Class ConnectionResult>
	//*  35   87:dup             
	//*  36   88:bipush          10
	//*  37   90:invokespecial   #82  <Method void ConnectionResult(int)>
	//*  38   93:invokevirtual   #86  <Method void GoogleApiManager$zaa.onConnectionFailed(ConnectionResult)>
	//*  39   96:return          
	//*  40   97:aload_0         
	//*  41   98:getfield        #14  <Field GoogleApiManager$zac zajf>
	//*  42  101:getfield        #61  <Field GoogleApiManager GoogleApiManager$zac.zail>
	//*  43  104:invokestatic    #67  <Method Map GoogleApiManager.zaj(GoogleApiManager)>
	//*  44  107:aload_0         
	//*  45  108:getfield        #14  <Field GoogleApiManager$zac zajf>
	//*  46  111:invokestatic    #71  <Method zai GoogleApiManager$zac.zac(GoogleApiManager$zac)>
	//*  47  114:invokeinterface #77  <Method Object Map.get(Object)>
	//*  48  119:checkcast       #79  <Class GoogleApiManager$zaa>
	//*  49  122:aload_0         
	//*  50  123:getfield        #16  <Field ConnectionResult zaiy>
	//*  51  126:invokevirtual   #86  <Method void GoogleApiManager$zaa.onConnectionFailed(ConnectionResult)>
	//*  52  129:return          
			// Misplaced declaration of an exception variable
			catch(SecurityException securityexception)
			{
				((GoogleApiManager.zaa)GoogleApiManager.zaj(zajf.zail).get(((Object) (GoogleApiManager.zac.zac(zajf))))).onConnectionFailed(new ConnectionResult(10));
			}
			return;
		} else
		{
			((GoogleApiManager.zaa)GoogleApiManager.zaj(zajf.zail).get(((Object) (GoogleApiManager.zac.zac(zajf))))).onConnectionFailed(zaiy);
			return;
		}
	//*  53  130:astore_1        
	//*  54  131:goto            59
	}

	private final ConnectionResult zaiy;
	private final GoogleApiManager.zac zajf;
}
