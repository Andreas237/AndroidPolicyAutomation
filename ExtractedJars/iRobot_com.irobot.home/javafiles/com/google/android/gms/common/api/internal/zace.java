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
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zach, zacf, zacg

public final class zace extends zac
	implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

	public zace(Context context, Handler handler, ClientSettings clientsettings)
	{
		this(context, handler, clientsettings, zakh);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:getstatic       #34  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zakh>
	//    5    7:invokespecial   #40  <Method void zace(Context, Handler, ClientSettings, com.google.android.gms.common.api.Api$AbstractClientBuilder)>
	//    6   10:return          
	}

	public zace(Context context, Handler handler, ClientSettings clientsettings, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void zac()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field Context mContext>
		mHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #46  <Field Handler mHandler>
		zaes = (ClientSettings)Preconditions.checkNotNull(((Object) (clientsettings)), "ClientSettings must not be null");
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:ldc1            #48  <String "ClientSettings must not be null">
	//   11   18:invokestatic    #54  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   12   21:checkcast       #56  <Class ClientSettings>
	//   13   24:putfield        #58  <Field ClientSettings zaes>
		mScopes = clientsettings.getRequiredScopes();
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:invokevirtual   #62  <Method Set ClientSettings.getRequiredScopes()>
	//   17   32:putfield        #64  <Field Set mScopes>
		zaau = abstractclientbuilder;
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:putfield        #66  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zaau>
	//   21   41:return          
	}

	static zach zaa(zace zace1)
	{
		return zace1.zaki;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field zach zaki>
	//    2    4:areturn         
	}

	static void zaa(zace zace1, zaj zaj1)
	{
		zace1.zac(zaj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #77  <Method void zac(zaj)>
	//    3    5:return          
	}

	private final void zac(zaj zaj1)
	{
		ConnectionResult connectionresult;
		ConnectionResult connectionresult1;
		connectionresult1 = zaj1.getConnectionResult();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #83  <Method ConnectionResult zaj.getConnectionResult()>
	//    2    4:astore_3        
		connectionresult = connectionresult1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(!connectionresult1.isSuccess()) goto _L2; else goto _L1
	//    5    7:aload_3         
	//    6    8:invokevirtual   #89  <Method boolean ConnectionResult.isSuccess()>
	//    7   11:ifeq            84
_L1:
		zaj1 = ((zaj) (zaj1.zacw()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #93  <Method ResolveAccountResponse zaj.zacw()>
	//   10   18:astore_1        
		connectionresult = ((ResolveAccountResponse) (zaj1)).getConnectionResult();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #96  <Method ConnectionResult ResolveAccountResponse.getConnectionResult()>
	//   13   23:astore_2        
		if(connectionresult.isSuccess()) goto _L4; else goto _L3
	//   14   24:aload_2         
	//   15   25:invokevirtual   #89  <Method boolean ConnectionResult.isSuccess()>
	//   16   28:ifne            104
_L3:
		zaj1 = ((zaj) (String.valueOf(((Object) (connectionresult)))));
	//   17   31:aload_2         
	//   18   32:invokestatic    #102 <Method String String.valueOf(Object)>
	//   19   35:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (zaj1))).length() + 48);
	//   20   36:new             #104 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:aload_1         
	//   23   41:invokestatic    #102 <Method String String.valueOf(Object)>
	//   24   44:invokevirtual   #108 <Method int String.length()>
	//   25   47:bipush          48
	//   26   49:iadd            
	//   27   50:invokespecial   #111 <Method void StringBuilder(int)>
	//   28   53:astore_3        
		stringbuilder.append("Sign-in succeeded with resolve account failure: ");
	//   29   54:aload_3         
	//   30   55:ldc1            #113 <String "Sign-in succeeded with resolve account failure: ">
	//   31   57:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
		stringbuilder.append(((String) (zaj1)));
	//   33   61:aload_3         
	//   34   62:aload_1         
	//   35   63:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
		Log.wtf("SignInCoordinator", stringbuilder.toString(), ((Throwable) (new Exception())));
	//   37   67:ldc1            #119 <String "SignInCoordinator">
	//   38   69:aload_3         
	//   39   70:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   40   73:new             #125 <Class Exception>
	//   41   76:dup             
	//   42   77:invokespecial   #126 <Method void Exception()>
	//   43   80:invokestatic    #132 <Method int Log.wtf(String, String, Throwable)>
	//   44   83:pop             
_L2:
		zaki.zag(connectionresult);
	//   45   84:aload_0         
	//   46   85:getfield        #72  <Field zach zaki>
	//   47   88:aload_2         
	//   48   89:invokeinterface #138 <Method void zach.zag(ConnectionResult)>
_L6:
		zaga.disconnect();
	//   49   94:aload_0         
	//   50   95:getfield        #140 <Field zad zaga>
	//   51   98:invokeinterface #145 <Method void zad.disconnect()>
		return;
	//   52  103:return          
_L4:
		zaki.zaa(((ResolveAccountResponse) (zaj1)).getAccountAccessor(), mScopes);
	//   53  104:aload_0         
	//   54  105:getfield        #72  <Field zach zaki>
	//   55  108:aload_1         
	//   56  109:invokevirtual   #149 <Method com.google.android.gms.common.internal.IAccountAccessor ResolveAccountResponse.getAccountAccessor()>
	//   57  112:aload_0         
	//   58  113:getfield        #64  <Field Set mScopes>
	//   59  116:invokeinterface #152 <Method void com.google.android.gms.common.api.internal.zach.zaa(com.google.android.gms.common.internal.IAccountAccessor, Set)>
		if(true) goto _L6; else goto _L5
	//   60  121:goto            94
_L5:
	}

	public final void onConnected(Bundle bundle)
	{
		zaga.zaa(((com.google.android.gms.signin.internal.zad) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field zad zaga>
	//    2    4:aload_0         
	//    3    5:invokeinterface #157 <Method void zad.zaa(com.google.android.gms.signin.internal.zad)>
	//    4   10:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		zaki.zag(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field zach zaki>
	//    2    4:aload_1         
	//    3    5:invokeinterface #138 <Method void zach.zag(ConnectionResult)>
	//    4   10:return          
	}

	public final void onConnectionSuspended(int i)
	{
		zaga.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field zad zaga>
	//    2    4:invokeinterface #145 <Method void zad.disconnect()>
	//    3    9:return          
	}

	public final void zaa(zach zach1)
	{
		if(zaga != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field zad zaga>
	//*   2    4:ifnull          16
			zaga.disconnect();
	//    3    7:aload_0         
	//    4    8:getfield        #140 <Field zad zaga>
	//    5   11:invokeinterface #145 <Method void zad.disconnect()>
		zaes.setClientSessionId(Integer.valueOf(System.identityHashCode(((Object) (this)))));
	//    6   16:aload_0         
	//    7   17:getfield        #58  <Field ClientSettings zaes>
	//    8   20:aload_0         
	//    9   21:invokestatic    #166 <Method int System.identityHashCode(Object)>
	//   10   24:invokestatic    #171 <Method Integer Integer.valueOf(int)>
	//   11   27:invokevirtual   #175 <Method void ClientSettings.setClientSessionId(Integer)>
		zaga = (zad)zaau.buildClient(mContext, mHandler.getLooper(), zaes, ((Object) (zaes.getSignInOptions())), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (this)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
	//   12   30:aload_0         
	//   13   31:aload_0         
	//   14   32:getfield        #66  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zaau>
	//   15   35:aload_0         
	//   16   36:getfield        #44  <Field Context mContext>
	//   17   39:aload_0         
	//   18   40:getfield        #46  <Field Handler mHandler>
	//   19   43:invokevirtual   #181 <Method android.os.Looper Handler.getLooper()>
	//   20   46:aload_0         
	//   21   47:getfield        #58  <Field ClientSettings zaes>
	//   22   50:aload_0         
	//   23   51:getfield        #58  <Field ClientSettings zaes>
	//   24   54:invokevirtual   #185 <Method com.google.android.gms.signin.SignInOptions ClientSettings.getSignInOptions()>
	//   25   57:aload_0         
	//   26   58:aload_0         
	//   27   59:invokevirtual   #191 <Method com.google.android.gms.common.api.Api$Client com.google.android.gms.common.api.Api$AbstractClientBuilder.buildClient(Context, android.os.Looper, ClientSettings, Object, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   28   62:checkcast       #142 <Class zad>
	//   29   65:putfield        #140 <Field zad zaga>
		zaki = zach1;
	//   30   68:aload_0         
	//   31   69:aload_1         
	//   32   70:putfield        #72  <Field zach zaki>
		if(mScopes != null && !mScopes.isEmpty())
	//*  33   73:aload_0         
	//*  34   74:getfield        #64  <Field Set mScopes>
	//*  35   77:ifnull          105
	//*  36   80:aload_0         
	//*  37   81:getfield        #64  <Field Set mScopes>
	//*  38   84:invokeinterface #196 <Method boolean Set.isEmpty()>
	//*  39   89:ifeq            95
	//*  40   92:goto            105
		{
			zaga.connect();
	//   41   95:aload_0         
	//   42   96:getfield        #140 <Field zad zaga>
	//   43   99:invokeinterface #199 <Method void zad.connect()>
			return;
	//   44  104:return          
		} else
		{
			mHandler.post(((Runnable) (new zacf(this))));
	//   45  105:aload_0         
	//   46  106:getfield        #46  <Field Handler mHandler>
	//   47  109:new             #201 <Class zacf>
	//   48  112:dup             
	//   49  113:aload_0         
	//   50  114:invokespecial   #204 <Method void zacf(zace)>
	//   51  117:invokevirtual   #208 <Method boolean Handler.post(Runnable)>
	//   52  120:pop             
			return;
	//   53  121:return          
		}
	}

	public final void zab(zaj zaj1)
	{
		mHandler.post(((Runnable) (new zacg(this, zaj1))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Handler mHandler>
	//    2    4:new             #211 <Class zacg>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #213 <Method void zacg(zace, zaj)>
	//    7   13:invokevirtual   #208 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public final zad zabq()
	{
		return zaga;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field zad zaga>
	//    2    4:areturn         
	}

	public final void zabs()
	{
		if(zaga != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field zad zaga>
	//*   2    4:ifnull          16
			zaga.disconnect();
	//    3    7:aload_0         
	//    4    8:getfield        #140 <Field zad zaga>
	//    5   11:invokeinterface #145 <Method void zad.disconnect()>
	//    6   16:return          
	}

	private static com.google.android.gms.common.api.Api.AbstractClientBuilder zakh;
	private final Context mContext;
	private final Handler mHandler;
	private Set mScopes;
	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zaau;
	private ClientSettings zaes;
	private zad zaga;
	private zach zaki;

	static 
	{
		zakh = zaa.zapg;
	//    0    0:getstatic       #32  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zaa.zapg>
	//    1    3:putstatic       #34  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zakh>
	//*   2    6:return          
	}
}
