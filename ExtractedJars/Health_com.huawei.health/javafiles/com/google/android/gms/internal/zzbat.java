// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.*;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.internal.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzbai, zzbaj, zzbaq, zzbau, 
//			zzbaw, zzbap

public class zzbat extends zzl
	implements zzbai
{

	public zzbat(Context context, Looper looper, boolean flag, zzg zzg1, Bundle bundle, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 44, zzg1, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          44
	//    4    5:aload           4
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:invokespecial   #20  <Method void zzl(Context, Looper, int, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		zzbEs = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field boolean zzbEs>
		zzaAL = zzg1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #24  <Field zzg zzaAL>
		zzbEh = bundle;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #26  <Field Bundle zzbEh>
		zzaFD = zzg1.zzxS();
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:invokevirtual   #32  <Method Integer zzg.zzxS()>
	//   20   37:putfield        #34  <Field Integer zzaFD>
	//   21   40:return          
	}

	public zzbat(Context context, Looper looper, boolean flag, zzg zzg1, zzbaj zzbaj1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		this(context, looper, flag, zzg1, zza(zzg1), connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           4
	//    6    8:invokestatic    #40  <Method Bundle zza(zzg)>
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:invokespecial   #42  <Method void zzbat(Context, Looper, boolean, zzg, Bundle, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   10   18:return          
	}

	private zzad zzPS()
	{
		Account account = zzaAL.zzxB();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzg zzaAL>
	//    2    4:invokevirtual   #48  <Method Account zzg.zzxB()>
	//    3    7:astore_2        
		com.google.android.gms.auth.api.signin.GoogleSignInAccount googlesigninaccount = null;
	//    4    8:aconst_null     
	//    5    9:astore_1        
		if("<<default account>>".equals(((Object) (account.name))))
	//*   6   10:ldc1            #50  <String "<<default account>>">
	//*   7   12:aload_2         
	//*   8   13:getfield        #56  <Field String Account.name>
	//*   9   16:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  10   19:ifeq            33
			googlesigninaccount = zzn.zzas(getContext()).zzrB();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #66  <Method Context getContext()>
	//   13   26:invokestatic    #72  <Method zzn zzn.zzas(Context)>
	//   14   29:invokevirtual   #76  <Method com.google.android.gms.auth.api.signin.GoogleSignInAccount zzn.zzrB()>
	//   15   32:astore_1        
		return new zzad(account, zzaFD.intValue(), googlesigninaccount);
	//   16   33:new             #78  <Class zzad>
	//   17   36:dup             
	//   18   37:aload_2         
	//   19   38:aload_0         
	//   20   39:getfield        #34  <Field Integer zzaFD>
	//   21   42:invokevirtual   #84  <Method int Integer.intValue()>
	//   22   45:aload_1         
	//   23   46:invokespecial   #87  <Method void zzad(Account, int, com.google.android.gms.auth.api.signin.GoogleSignInAccount)>
	//   24   49:areturn         
	}

	public static Bundle zza(zzg zzg1)
	{
		zzbaj zzbaj1 = zzg1.zzxR();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method zzbaj zzg.zzxR()>
	//    2    4:astore_1        
		Integer integer = zzg1.zzxS();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #32  <Method Integer zzg.zzxS()>
	//    5    9:astore_2        
		Bundle bundle = new Bundle();
	//    6   10:new             #93  <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #96  <Method void Bundle()>
	//    9   17:astore_3        
		bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", ((android.os.Parcelable) (zzg1.getAccount())));
	//   10   18:aload_3         
	//   11   19:ldc1            #98  <String "com.google.android.gms.signin.internal.clientRequestedAccount">
	//   12   21:aload_0         
	//   13   22:invokevirtual   #101 <Method Account zzg.getAccount()>
	//   14   25:invokevirtual   #105 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(integer != null)
	//*  15   28:aload_2         
	//*  16   29:ifnull          42
			bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
	//   17   32:aload_3         
	//   18   33:ldc1            #107 <String "com.google.android.gms.common.internal.ClientSettings.sessionId">
	//   19   35:aload_2         
	//   20   36:invokevirtual   #84  <Method int Integer.intValue()>
	//   21   39:invokevirtual   #111 <Method void Bundle.putInt(String, int)>
		if(zzbaj1 != null)
	//*  22   42:aload_1         
	//*  23   43:ifnull          153
		{
			bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zzbaj1.zzPK());
	//   24   46:aload_3         
	//   25   47:ldc1            #113 <String "com.google.android.gms.signin.internal.offlineAccessRequested">
	//   26   49:aload_1         
	//   27   50:invokevirtual   #119 <Method boolean zzbaj.zzPK()>
	//   28   53:invokevirtual   #123 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zzbaj1.isIdTokenRequested());
	//   29   56:aload_3         
	//   30   57:ldc1            #125 <String "com.google.android.gms.signin.internal.idTokenRequested">
	//   31   59:aload_1         
	//   32   60:invokevirtual   #128 <Method boolean zzbaj.isIdTokenRequested()>
	//   33   63:invokevirtual   #123 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putString("com.google.android.gms.signin.internal.serverClientId", zzbaj1.getServerClientId());
	//   34   66:aload_3         
	//   35   67:ldc1            #130 <String "com.google.android.gms.signin.internal.serverClientId">
	//   36   69:aload_1         
	//   37   70:invokevirtual   #134 <Method String zzbaj.getServerClientId()>
	//   38   73:invokevirtual   #138 <Method void Bundle.putString(String, String)>
			bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
	//   39   76:aload_3         
	//   40   77:ldc1            #140 <String "com.google.android.gms.signin.internal.usePromptModeForAuthCode">
	//   41   79:iconst_1        
	//   42   80:invokevirtual   #123 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", zzbaj1.zzrl());
	//   43   83:aload_3         
	//   44   84:ldc1            #142 <String "com.google.android.gms.signin.internal.forceCodeForRefreshToken">
	//   45   86:aload_1         
	//   46   87:invokevirtual   #145 <Method boolean zzbaj.zzrl()>
	//   47   90:invokevirtual   #123 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putString("com.google.android.gms.signin.internal.hostedDomain", zzbaj1.zzrm());
	//   48   93:aload_3         
	//   49   94:ldc1            #147 <String "com.google.android.gms.signin.internal.hostedDomain">
	//   50   96:aload_1         
	//   51   97:invokevirtual   #150 <Method String zzbaj.zzrm()>
	//   52  100:invokevirtual   #138 <Method void Bundle.putString(String, String)>
			bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", zzbaj1.zzPL());
	//   53  103:aload_3         
	//   54  104:ldc1            #152 <String "com.google.android.gms.signin.internal.waitForAccessTokenRefresh">
	//   55  106:aload_1         
	//   56  107:invokevirtual   #155 <Method boolean zzbaj.zzPL()>
	//   57  110:invokevirtual   #123 <Method void Bundle.putBoolean(String, boolean)>
			if(zzbaj1.zzPM() != null)
	//*  58  113:aload_1         
	//*  59  114:invokevirtual   #159 <Method Long zzbaj.zzPM()>
	//*  60  117:ifnull          133
				bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", zzbaj1.zzPM().longValue());
	//   61  120:aload_3         
	//   62  121:ldc1            #161 <String "com.google.android.gms.signin.internal.authApiSignInModuleVersion">
	//   63  123:aload_1         
	//   64  124:invokevirtual   #159 <Method Long zzbaj.zzPM()>
	//   65  127:invokevirtual   #167 <Method long Long.longValue()>
	//   66  130:invokevirtual   #171 <Method void Bundle.putLong(String, long)>
			if(zzbaj1.zzPN() != null)
	//*  67  133:aload_1         
	//*  68  134:invokevirtual   #174 <Method Long zzbaj.zzPN()>
	//*  69  137:ifnull          153
				bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", zzbaj1.zzPN().longValue());
	//   70  140:aload_3         
	//   71  141:ldc1            #176 <String "com.google.android.gms.signin.internal.realClientLibraryVersion">
	//   72  143:aload_1         
	//   73  144:invokevirtual   #174 <Method Long zzbaj.zzPN()>
	//   74  147:invokevirtual   #167 <Method long Long.longValue()>
	//   75  150:invokevirtual   #171 <Method void Bundle.putLong(String, long)>
		}
		return bundle;
	//   76  153:aload_3         
	//   77  154:areturn         
	}

	public void connect()
	{
		zza(((com.google.android.gms.common.internal.zzf.zzf) (new com.google.android.gms.common.internal.zzf.zzi(((com.google.android.gms.common.internal.zzf) (this))))));
	//    0    0:aload_0         
	//    1    1:new             #179 <Class com.google.android.gms.common.internal.zzf$zzi>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #182 <Method void com.google.android.gms.common.internal.zzf$zzi(com.google.android.gms.common.internal.zzf)>
	//    5    9:invokevirtual   #185 <Method void zza(com.google.android.gms.common.internal.zzf$zzf)>
	//    6   12:return          
	}

	public void zzPJ()
	{
		RemoteException remoteexception;
		try
		{
			((zzbaq)zzxD()).zznv(zzaFD.intValue());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #192 <Method IInterface zzxD()>
	//    2    4:checkcast       #194 <Class zzbaq>
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field Integer zzaFD>
	//    5   11:invokevirtual   #84  <Method int Integer.intValue()>
	//    6   14:invokeinterface #198 <Method void zzbaq.zznv(int)>
			return;
	//    7   19:return          
		}
	//*   8   20:ldc1            #200 <String "SignInClientImpl">
	//*   9   22:ldc1            #202 <String "Remote service probably died when clearAccountFromSessionStore is called">
	//*  10   24:invokestatic    #208 <Method int Log.w(String, String)>
	//*  11   27:pop             
	//*  12   28:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
		}
	//*  13   29:astore_1        
	//*  14   30:goto            20
	}

	public void zza(zzr zzr, boolean flag)
	{
		try
		{
			((zzbaq)zzxD()).zza(zzr, zzaFD.intValue(), flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #192 <Method IInterface zzxD()>
	//    2    4:checkcast       #194 <Class zzbaq>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field Integer zzaFD>
	//    6   12:invokevirtual   #84  <Method int Integer.intValue()>
	//    7   15:iload_2         
	//    8   16:invokeinterface #212 <Method void zzbaq.zza(zzr, int, boolean)>
			return;
	//    9   21:return          
		}
	//*  10   22:ldc1            #200 <String "SignInClientImpl">
	//*  11   24:ldc1            #214 <String "Remote service probably died when saveDefaultAccount is called">
	//*  12   26:invokestatic    #208 <Method int Log.w(String, String)>
	//*  13   29:pop             
	//*  14   30:return          
		// Misplaced declaration of an exception variable
		catch(zzr zzr)
		{
			Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
		}
	//*  15   31:astore_1        
	//*  16   32:goto            22
	}

	public void zza(zzbap zzbap1)
	{
		zzac.zzb(((Object) (zzbap1)), "Expecting a valid ISignInCallbacks");
	//    0    0:aload_1         
	//    1    1:ldc1            #217 <String "Expecting a valid ISignInCallbacks">
	//    2    3:invokestatic    #223 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		try
		{
			zzad zzad1 = zzPS();
	//    4    7:aload_0         
	//    5    8:invokespecial   #225 <Method zzad zzPS()>
	//    6   11:astore_2        
			((zzbaq)zzxD()).zza(new zzbau(zzad1), zzbap1);
	//    7   12:aload_0         
	//    8   13:invokevirtual   #192 <Method IInterface zzxD()>
	//    9   16:checkcast       #194 <Class zzbaq>
	//   10   19:new             #227 <Class zzbau>
	//   11   22:dup             
	//   12   23:aload_2         
	//   13   24:invokespecial   #230 <Method void zzbau(zzad)>
	//   14   27:aload_1         
	//   15   28:invokeinterface #233 <Method void zzbaq.zza(zzbau, zzbap)>
			return;
	//   16   33:return          
		}
		catch(RemoteException remoteexception)
	//*  17   34:astore_2        
		{
			Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
	//   18   35:ldc1            #200 <String "SignInClientImpl">
	//   19   37:ldc1            #235 <String "Remote service probably died when signIn is called">
	//   20   39:invokestatic    #208 <Method int Log.w(String, String)>
	//   21   42:pop             
			try
			{
				zzbap1.zzb(new zzbaw(8));
	//   22   43:aload_1         
	//   23   44:new             #237 <Class zzbaw>
	//   24   47:dup             
	//   25   48:bipush          8
	//   26   50:invokespecial   #239 <Method void zzbaw(int)>
	//   27   53:invokeinterface #244 <Method void zzbap.zzb(zzbaw)>
				return;
	//   28   58:return          
			}
	//*  29   59:ldc1            #200 <String "SignInClientImpl">
	//*  30   61:ldc1            #246 <String "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.">
	//*  31   63:aload_2         
	//*  32   64:invokestatic    #250 <Method int Log.wtf(String, String, Throwable)>
	//*  33   67:pop             
	//*  34   68:return          
			// Misplaced declaration of an exception variable
			catch(zzbap zzbap1)
			{
				Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", ((Throwable) (remoteexception)));
			}
			return;
		}
	//*  35   69:astore_1        
	//*  36   70:goto            59
	}

	public String zzeA()
	{
		return "com.google.android.gms.signin.internal.ISignInService";
	//    0    0:ldc1            #253 <String "com.google.android.gms.signin.internal.ISignInService">
	//    1    2:areturn         
	}

	public String zzez()
	{
		return "com.google.android.gms.signin.service.START";
	//    0    0:ldc2            #256 <String "com.google.android.gms.signin.service.START">
	//    1    3:areturn         
	}

	protected zzbaq zzfg(IBinder ibinder)
	{
		return zzbaq.zza.zzff(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #263 <Method zzbaq zzbaq$zza.zzff(IBinder)>
	//    2    4:areturn         
	}

	public IInterface zzh(IBinder ibinder)
	{
		return ((IInterface) (zzfg(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #267 <Method zzbaq zzfg(IBinder)>
	//    3    5:areturn         
	}

	public Bundle zzqL()
	{
		String s = zzaAL.zzxO();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzg zzaAL>
	//    2    4:invokevirtual   #272 <Method String zzg.zzxO()>
	//    3    7:astore_1        
		if(!getContext().getPackageName().equals(((Object) (s))))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #66  <Method Context getContext()>
	//*   6   12:invokevirtual   #277 <Method String Context.getPackageName()>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*   9   19:ifne            39
			zzbEh.putString("com.google.android.gms.signin.internal.realClientPackageName", zzaAL.zzxO());
	//   10   22:aload_0         
	//   11   23:getfield        #26  <Field Bundle zzbEh>
	//   12   26:ldc2            #279 <String "com.google.android.gms.signin.internal.realClientPackageName">
	//   13   29:aload_0         
	//   14   30:getfield        #24  <Field zzg zzaAL>
	//   15   33:invokevirtual   #272 <Method String zzg.zzxO()>
	//   16   36:invokevirtual   #138 <Method void Bundle.putString(String, String)>
		return zzbEh;
	//   17   39:aload_0         
	//   18   40:getfield        #26  <Field Bundle zzbEh>
	//   19   43:areturn         
	}

	public boolean zzrd()
	{
		return zzbEs;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean zzbEs>
	//    2    4:ireturn         
	}

	private final zzg zzaAL;
	private Integer zzaFD;
	private final Bundle zzbEh;
	private final boolean zzbEs;
}
