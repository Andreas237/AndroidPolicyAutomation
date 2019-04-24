// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.signin.SignIn;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.internal.BaseSignInCallbacks;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzcb, zzca, zzbz

public final class zzby extends BaseSignInCallbacks
	implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

	public zzby(Context context, Handler handler, ClientSettings clientsettings)
	{
		this(context, handler, clientsettings, zzlv);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:getstatic       #34  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzlv>
	//    5    7:invokespecial   #42  <Method void zzby(Context, Handler, ClientSettings, com.google.android.gms.common.api.Api$AbstractClientBuilder)>
	//    6   10:return          
	}

	public zzby(Context context, Handler handler, ClientSettings clientsettings, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void BaseSignInCallbacks()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field Context mContext>
		mHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #50  <Field Handler mHandler>
		zzgf = (ClientSettings)Preconditions.checkNotNull(((Object) (clientsettings)), "ClientSettings must not be null");
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:ldc1            #52  <String "ClientSettings must not be null">
	//   11   18:invokestatic    #58  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   12   21:checkcast       #60  <Class ClientSettings>
	//   13   24:putfield        #62  <Field ClientSettings zzgf>
		mScopes = clientsettings.getRequiredScopes();
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:invokevirtual   #66  <Method Set ClientSettings.getRequiredScopes()>
	//   17   32:putfield        #68  <Field Set mScopes>
		zzby = abstractclientbuilder;
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:putfield        #70  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzby>
	//   21   41:return          
	}

	static zzcb zza(zzby zzby1)
	{
		return zzby1.zzlw;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field zzcb zzlw>
	//    2    4:areturn         
	}

	static void zza(zzby zzby1, SignInResponse signinresponse)
	{
		zzby1.zzb(signinresponse);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #81  <Method void zzb(SignInResponse)>
	//    3    5:return          
	}

	private final void zzb(SignInResponse signinresponse)
	{
		ConnectionResult connectionresult;
		ConnectionResult connectionresult1;
		connectionresult1 = signinresponse.getConnectionResult();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method ConnectionResult SignInResponse.getConnectionResult()>
	//    2    4:astore_3        
		connectionresult = connectionresult1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(!connectionresult1.isSuccess()) goto _L2; else goto _L1
	//    5    7:aload_3         
	//    6    8:invokevirtual   #93  <Method boolean ConnectionResult.isSuccess()>
	//    7   11:ifeq            84
_L1:
		signinresponse = ((SignInResponse) (signinresponse.getResolveAccountResponse()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #97  <Method ResolveAccountResponse SignInResponse.getResolveAccountResponse()>
	//   10   18:astore_1        
		connectionresult = ((ResolveAccountResponse) (signinresponse)).getConnectionResult();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #100 <Method ConnectionResult ResolveAccountResponse.getConnectionResult()>
	//   13   23:astore_2        
		if(connectionresult.isSuccess()) goto _L4; else goto _L3
	//   14   24:aload_2         
	//   15   25:invokevirtual   #93  <Method boolean ConnectionResult.isSuccess()>
	//   16   28:ifne            104
_L3:
		signinresponse = ((SignInResponse) (String.valueOf(((Object) (connectionresult)))));
	//   17   31:aload_2         
	//   18   32:invokestatic    #106 <Method String String.valueOf(Object)>
	//   19   35:astore_1        
		StringBuilder stringbuilder = new StringBuilder(48 + String.valueOf(((Object) (signinresponse))).length());
	//   20   36:new             #108 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:bipush          48
	//   23   42:aload_1         
	//   24   43:invokestatic    #106 <Method String String.valueOf(Object)>
	//   25   46:invokevirtual   #112 <Method int String.length()>
	//   26   49:iadd            
	//   27   50:invokespecial   #115 <Method void StringBuilder(int)>
	//   28   53:astore_3        
		stringbuilder.append("Sign-in succeeded with resolve account failure: ");
	//   29   54:aload_3         
	//   30   55:ldc1            #117 <String "Sign-in succeeded with resolve account failure: ">
	//   31   57:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
		stringbuilder.append(((String) (signinresponse)));
	//   33   61:aload_3         
	//   34   62:aload_1         
	//   35   63:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
		Log.wtf("SignInCoordinator", stringbuilder.toString(), ((Throwable) (new Exception())));
	//   37   67:ldc1            #123 <String "SignInCoordinator">
	//   38   69:aload_3         
	//   39   70:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   40   73:new             #129 <Class Exception>
	//   41   76:dup             
	//   42   77:invokespecial   #130 <Method void Exception()>
	//   43   80:invokestatic    #136 <Method int Log.wtf(String, String, Throwable)>
	//   44   83:pop             
_L2:
		zzlw.zzg(connectionresult);
	//   45   84:aload_0         
	//   46   85:getfield        #76  <Field zzcb zzlw>
	//   47   88:aload_2         
	//   48   89:invokeinterface #142 <Method void zzcb.zzg(ConnectionResult)>
_L6:
		zzhn.disconnect();
	//   49   94:aload_0         
	//   50   95:getfield        #144 <Field SignInClient zzhn>
	//   51   98:invokeinterface #149 <Method void SignInClient.disconnect()>
		return;
	//   52  103:return          
_L4:
		zzlw.zza(((ResolveAccountResponse) (signinresponse)).getAccountAccessor(), mScopes);
	//   53  104:aload_0         
	//   54  105:getfield        #76  <Field zzcb zzlw>
	//   55  108:aload_1         
	//   56  109:invokevirtual   #153 <Method com.google.android.gms.common.internal.IAccountAccessor ResolveAccountResponse.getAccountAccessor()>
	//   57  112:aload_0         
	//   58  113:getfield        #68  <Field Set mScopes>
	//   59  116:invokeinterface #156 <Method void zzcb.zza(com.google.android.gms.common.internal.IAccountAccessor, Set)>
		if(true) goto _L6; else goto _L5
	//   60  121:goto            94
_L5:
	}

	public final void onConnected(Bundle bundle)
	{
		zzhn.signIn(((com.google.android.gms.signin.internal.ISignInCallbacks) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field SignInClient zzhn>
	//    2    4:aload_0         
	//    3    5:invokeinterface #163 <Method void SignInClient.signIn(com.google.android.gms.signin.internal.ISignInCallbacks)>
	//    4   10:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzlw.zzg(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field zzcb zzlw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #142 <Method void zzcb.zzg(ConnectionResult)>
	//    4   10:return          
	}

	public final void onConnectionSuspended(int i)
	{
		zzhn.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field SignInClient zzhn>
	//    2    4:invokeinterface #149 <Method void SignInClient.disconnect()>
	//    3    9:return          
	}

	public final void onSignInComplete(SignInResponse signinresponse)
	{
		mHandler.post(((Runnable) (new zzca(this, signinresponse))));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Handler mHandler>
	//    2    4:new             #169 <Class zzca>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #171 <Method void zzca(zzby, SignInResponse)>
	//    7   13:invokevirtual   #177 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public final void zza(zzcb zzcb1)
	{
		if(zzhn != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field SignInClient zzhn>
	//*   2    4:ifnull          16
			zzhn.disconnect();
	//    3    7:aload_0         
	//    4    8:getfield        #144 <Field SignInClient zzhn>
	//    5   11:invokeinterface #149 <Method void SignInClient.disconnect()>
		zzgf.setClientSessionId(Integer.valueOf(System.identityHashCode(((Object) (this)))));
	//    6   16:aload_0         
	//    7   17:getfield        #62  <Field ClientSettings zzgf>
	//    8   20:aload_0         
	//    9   21:invokestatic    #184 <Method int System.identityHashCode(Object)>
	//   10   24:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   11   27:invokevirtual   #193 <Method void ClientSettings.setClientSessionId(Integer)>
		zzhn = (SignInClient)zzby.buildClient(mContext, mHandler.getLooper(), zzgf, ((Object) (zzgf.getSignInOptions())), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (this)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
	//   12   30:aload_0         
	//   13   31:aload_0         
	//   14   32:getfield        #70  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzby>
	//   15   35:aload_0         
	//   16   36:getfield        #48  <Field Context mContext>
	//   17   39:aload_0         
	//   18   40:getfield        #50  <Field Handler mHandler>
	//   19   43:invokevirtual   #197 <Method android.os.Looper Handler.getLooper()>
	//   20   46:aload_0         
	//   21   47:getfield        #62  <Field ClientSettings zzgf>
	//   22   50:aload_0         
	//   23   51:getfield        #62  <Field ClientSettings zzgf>
	//   24   54:invokevirtual   #201 <Method com.google.android.gms.signin.SignInOptions ClientSettings.getSignInOptions()>
	//   25   57:aload_0         
	//   26   58:aload_0         
	//   27   59:invokevirtual   #207 <Method com.google.android.gms.common.api.Api$Client com.google.android.gms.common.api.Api$AbstractClientBuilder.buildClient(Context, android.os.Looper, ClientSettings, Object, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   28   62:checkcast       #146 <Class SignInClient>
	//   29   65:putfield        #144 <Field SignInClient zzhn>
		zzlw = zzcb1;
	//   30   68:aload_0         
	//   31   69:aload_1         
	//   32   70:putfield        #76  <Field zzcb zzlw>
		if(mScopes != null && !mScopes.isEmpty())
	//*  33   73:aload_0         
	//*  34   74:getfield        #68  <Field Set mScopes>
	//*  35   77:ifnull          105
	//*  36   80:aload_0         
	//*  37   81:getfield        #68  <Field Set mScopes>
	//*  38   84:invokeinterface #212 <Method boolean Set.isEmpty()>
	//*  39   89:ifeq            95
	//*  40   92:goto            105
		{
			zzhn.connect();
	//   41   95:aload_0         
	//   42   96:getfield        #144 <Field SignInClient zzhn>
	//   43   99:invokeinterface #215 <Method void SignInClient.connect()>
			return;
	//   44  104:return          
		} else
		{
			mHandler.post(((Runnable) (new zzbz(this))));
	//   45  105:aload_0         
	//   46  106:getfield        #50  <Field Handler mHandler>
	//   47  109:new             #217 <Class zzbz>
	//   48  112:dup             
	//   49  113:aload_0         
	//   50  114:invokespecial   #220 <Method void zzbz(zzby)>
	//   51  117:invokevirtual   #177 <Method boolean Handler.post(Runnable)>
	//   52  120:pop             
			return;
	//   53  121:return          
		}
	}

	public final SignInClient zzbt()
	{
		return zzhn;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field SignInClient zzhn>
	//    2    4:areturn         
	}

	public final void zzbz()
	{
		if(zzhn != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field SignInClient zzhn>
	//*   2    4:ifnull          16
			zzhn.disconnect();
	//    3    7:aload_0         
	//    4    8:getfield        #144 <Field SignInClient zzhn>
	//    5   11:invokeinterface #149 <Method void SignInClient.disconnect()>
	//    6   16:return          
	}

	private static com.google.android.gms.common.api.Api.AbstractClientBuilder zzlv;
	private final Context mContext;
	private final Handler mHandler;
	private Set mScopes;
	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zzby;
	private ClientSettings zzgf;
	private SignInClient zzhn;
	private zzcb zzlw;

	static 
	{
		zzlv = SignIn.CLIENT_BUILDER;
	//    0    0:getstatic       #32  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder SignIn.CLIENT_BUILDER>
	//    1    3:putstatic       #34  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzlv>
	//*   2    6:return          
	}
}
