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
	//    5    7:invokespecial   #42  <Method void zace(Context, Handler, ClientSettings, com.google.android.gms.common.api.Api$AbstractClientBuilder)>
	//    6   10:return          
	}

	public zace(Context context, Handler handler, ClientSettings clientsettings, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void zac()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field Context mContext>
		mHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #50  <Field Handler mHandler>
		zaes = (ClientSettings)Preconditions.checkNotNull(((Object) (clientsettings)), "ClientSettings must not be null");
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:ldc1            #52  <String "ClientSettings must not be null">
	//   11   18:invokestatic    #58  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   12   21:checkcast       #60  <Class ClientSettings>
	//   13   24:putfield        #62  <Field ClientSettings zaes>
		mScopes = clientsettings.getRequiredScopes();
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:invokevirtual   #66  <Method Set ClientSettings.getRequiredScopes()>
	//   17   32:putfield        #68  <Field Set mScopes>
		zaau = abstractclientbuilder;
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:putfield        #70  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zaau>
	//   21   41:return          
	}

	static zach zaa(zace zace1)
	{
		return zace1.zaki;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field zach zaki>
	//    2    4:areturn         
	}

	static void zaa(zace zace1, zaj zaj1)
	{
		zace1.zac(zaj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #81  <Method void zac(zaj)>
	//    3    5:return          
	}

	private final void zac(zaj zaj1)
	{
		Object obj = ((Object) (zaj1.getConnectionResult()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method ConnectionResult zaj.getConnectionResult()>
	//    2    4:astore_2        
		if(((ConnectionResult) (obj)).isSuccess())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #93  <Method boolean ConnectionResult.isSuccess()>
	//*   5    9:ifeq            122
		{
			obj = ((Object) (zaj1.zacw()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #97  <Method ResolveAccountResponse zaj.zacw()>
	//    8   16:astore_2        
			zaj1 = ((zaj) (((ResolveAccountResponse) (obj)).getConnectionResult()));
	//    9   17:aload_2         
	//   10   18:invokevirtual   #100 <Method ConnectionResult ResolveAccountResponse.getConnectionResult()>
	//   11   21:astore_1        
			if(!((ConnectionResult) (zaj1)).isSuccess())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #93  <Method boolean ConnectionResult.isSuccess()>
	//*  14   26:ifne            102
			{
				obj = ((Object) (String.valueOf(((Object) (zaj1)))));
	//   15   29:aload_1         
	//   16   30:invokestatic    #106 <Method String String.valueOf(Object)>
	//   17   33:astore_2        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 48);
	//   18   34:new             #108 <Class StringBuilder>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:invokestatic    #106 <Method String String.valueOf(Object)>
	//   22   42:invokevirtual   #112 <Method int String.length()>
	//   23   45:bipush          48
	//   24   47:iadd            
	//   25   48:invokespecial   #115 <Method void StringBuilder(int)>
	//   26   51:astore_3        
				stringbuilder.append("Sign-in succeeded with resolve account failure: ");
	//   27   52:aload_3         
	//   28   53:ldc1            #117 <String "Sign-in succeeded with resolve account failure: ">
	//   29   55:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
				stringbuilder.append(((String) (obj)));
	//   31   59:aload_3         
	//   32   60:aload_2         
	//   33   61:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
				Log.wtf("SignInCoordinator", stringbuilder.toString(), ((Throwable) (new Exception())));
	//   35   65:ldc1            #123 <String "SignInCoordinator">
	//   36   67:aload_3         
	//   37   68:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   38   71:new             #129 <Class Exception>
	//   39   74:dup             
	//   40   75:invokespecial   #130 <Method void Exception()>
	//   41   78:invokestatic    #136 <Method int Log.wtf(String, String, Throwable)>
	//   42   81:pop             
				zaki.zag(((ConnectionResult) (zaj1)));
	//   43   82:aload_0         
	//   44   83:getfield        #76  <Field zach zaki>
	//   45   86:aload_1         
	//   46   87:invokeinterface #142 <Method void zach.zag(ConnectionResult)>
				zaga.disconnect();
	//   47   92:aload_0         
	//   48   93:getfield        #144 <Field zad zaga>
	//   49   96:invokeinterface #149 <Method void zad.disconnect()>
				return;
	//   50  101:return          
			}
			zaki.zaa(((ResolveAccountResponse) (obj)).getAccountAccessor(), mScopes);
	//   51  102:aload_0         
	//   52  103:getfield        #76  <Field zach zaki>
	//   53  106:aload_2         
	//   54  107:invokevirtual   #153 <Method com.google.android.gms.common.internal.IAccountAccessor ResolveAccountResponse.getAccountAccessor()>
	//   55  110:aload_0         
	//   56  111:getfield        #68  <Field Set mScopes>
	//   57  114:invokeinterface #156 <Method void com.google.android.gms.common.api.internal.zach.zaa(com.google.android.gms.common.internal.IAccountAccessor, Set)>
		} else
	//*  58  119:goto            132
		{
			zaki.zag(((ConnectionResult) (obj)));
	//   59  122:aload_0         
	//   60  123:getfield        #76  <Field zach zaki>
	//   61  126:aload_2         
	//   62  127:invokeinterface #142 <Method void zach.zag(ConnectionResult)>
		}
		zaga.disconnect();
	//   63  132:aload_0         
	//   64  133:getfield        #144 <Field zad zaga>
	//   65  136:invokeinterface #149 <Method void zad.disconnect()>
	//   66  141:return          
	}

	public final void onConnected(Bundle bundle)
	{
		zaga.zaa(((com.google.android.gms.signin.internal.zad) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field zad zaga>
	//    2    4:aload_0         
	//    3    5:invokeinterface #162 <Method void zad.zaa(com.google.android.gms.signin.internal.zad)>
	//    4   10:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		zaki.zag(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field zach zaki>
	//    2    4:aload_1         
	//    3    5:invokeinterface #142 <Method void zach.zag(ConnectionResult)>
	//    4   10:return          
	}

	public final void onConnectionSuspended(int i)
	{
		zaga.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field zad zaga>
	//    2    4:invokeinterface #149 <Method void zad.disconnect()>
	//    3    9:return          
	}

	public final void zaa(zach zach1)
	{
		Object obj = ((Object) (zaga));
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field zad zaga>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			((zad) (obj)).disconnect();
	//    5    9:aload_2         
	//    6   10:invokeinterface #149 <Method void zad.disconnect()>
		zaes.setClientSessionId(Integer.valueOf(System.identityHashCode(((Object) (this)))));
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field ClientSettings zaes>
	//    9   19:aload_0         
	//   10   20:invokestatic    #171 <Method int System.identityHashCode(Object)>
	//   11   23:invokestatic    #176 <Method Integer Integer.valueOf(int)>
	//   12   26:invokevirtual   #180 <Method void ClientSettings.setClientSessionId(Integer)>
		obj = ((Object) (zaau));
	//   13   29:aload_0         
	//   14   30:getfield        #70  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zaau>
	//   15   33:astore_2        
		Context context = mContext;
	//   16   34:aload_0         
	//   17   35:getfield        #48  <Field Context mContext>
	//   18   38:astore_3        
		android.os.Looper looper = mHandler.getLooper();
	//   19   39:aload_0         
	//   20   40:getfield        #50  <Field Handler mHandler>
	//   21   43:invokevirtual   #186 <Method android.os.Looper Handler.getLooper()>
	//   22   46:astore          4
		ClientSettings clientsettings = zaes;
	//   23   48:aload_0         
	//   24   49:getfield        #62  <Field ClientSettings zaes>
	//   25   52:astore          5
		zaga = (zad)((com.google.android.gms.common.api.Api.AbstractClientBuilder) (obj)).buildClient(context, looper, clientsettings, ((Object) (clientsettings.getSignInOptions())), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (this)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
	//   26   54:aload_0         
	//   27   55:aload_2         
	//   28   56:aload_3         
	//   29   57:aload           4
	//   30   59:aload           5
	//   31   61:aload           5
	//   32   63:invokevirtual   #190 <Method com.google.android.gms.signin.SignInOptions ClientSettings.getSignInOptions()>
	//   33   66:aload_0         
	//   34   67:aload_0         
	//   35   68:invokevirtual   #196 <Method com.google.android.gms.common.api.Api$Client com.google.android.gms.common.api.Api$AbstractClientBuilder.buildClient(Context, android.os.Looper, ClientSettings, Object, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   36   71:checkcast       #146 <Class zad>
	//   37   74:putfield        #144 <Field zad zaga>
		zaki = zach1;
	//   38   77:aload_0         
	//   39   78:aload_1         
	//   40   79:putfield        #76  <Field zach zaki>
		zach1 = ((zach) (mScopes));
	//   41   82:aload_0         
	//   42   83:getfield        #68  <Field Set mScopes>
	//   43   86:astore_1        
		if(zach1 != null && !((Set) (zach1)).isEmpty())
	//*  44   87:aload_1         
	//*  45   88:ifnull          113
	//*  46   91:aload_1         
	//*  47   92:invokeinterface #201 <Method boolean Set.isEmpty()>
	//*  48   97:ifeq            103
	//*  49  100:goto            113
		{
			zaga.connect();
	//   50  103:aload_0         
	//   51  104:getfield        #144 <Field zad zaga>
	//   52  107:invokeinterface #204 <Method void zad.connect()>
			return;
	//   53  112:return          
		} else
		{
			mHandler.post(((Runnable) (new zacf(this))));
	//   54  113:aload_0         
	//   55  114:getfield        #50  <Field Handler mHandler>
	//   56  117:new             #206 <Class zacf>
	//   57  120:dup             
	//   58  121:aload_0         
	//   59  122:invokespecial   #209 <Method void zacf(zace)>
	//   60  125:invokevirtual   #213 <Method boolean Handler.post(Runnable)>
	//   61  128:pop             
			return;
	//   62  129:return          
		}
	}

	public final void zab(zaj zaj1)
	{
		mHandler.post(((Runnable) (new zacg(this, zaj1))));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Handler mHandler>
	//    2    4:new             #217 <Class zacg>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #219 <Method void zacg(zace, zaj)>
	//    7   13:invokevirtual   #213 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public final zad zabq()
	{
		return zaga;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field zad zaga>
	//    2    4:areturn         
	}

	public final void zabs()
	{
		zad zad1 = zaga;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field zad zaga>
	//    2    4:astore_1        
		if(zad1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			zad1.disconnect();
	//    5    9:aload_1         
	//    6   10:invokeinterface #149 <Method void zad.disconnect()>
	//    7   15:return          
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
