// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.*;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//			zzaxr, zzaxm, zzaxo, zzayb, 
//			zzaxn

public class zzabj extends zzaxr
	implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{
	public static interface zza
	{

		public abstract void zzb(zzr zzr, Set set);

		public abstract void zzi(ConnectionResult connectionresult);
	}


	public zzabj(Context context, Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void zzaxr()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field Context mContext>
		mHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field Handler mHandler>
		context = ((Context) (zzl.zzaa(mContext).zzrd()));
	//    8   14:aload_0         
	//    9   15:getfield        #49  <Field Context mContext>
	//   10   18:invokestatic    #57  <Method zzl zzl.zzaa(Context)>
	//   11   21:invokevirtual   #61  <Method GoogleSignInOptions zzl.zzrd()>
	//   12   24:astore_1        
		if(context == null)
	//*  13   25:aload_1         
	//*  14   26:ifnonnull       79
			context = ((Context) (new HashSet()));
	//   15   29:new             #63  <Class HashSet>
	//   16   32:dup             
	//   17   33:invokespecial   #64  <Method void HashSet()>
	//   18   36:astore_1        
		else
	//*  19   37:aload_0         
	//*  20   38:aload_1         
	//*  21   39:putfield        #66  <Field Set zzajm>
	//*  22   42:aload_0         
	//*  23   43:new             #68  <Class zzg>
	//*  24   46:dup             
	//*  25   47:aconst_null     
	//*  26   48:aload_0         
	//*  27   49:getfield        #66  <Field Set zzajm>
	//*  28   52:aconst_null     
	//*  29   53:iconst_0        
	//*  30   54:aconst_null     
	//*  31   55:aconst_null     
	//*  32   56:aconst_null     
	//*  33   57:getstatic       #74  <Field zzaxo zzaxo.zzbCg>
	//*  34   60:invokespecial   #77  <Method void zzg(android.accounts.Account, Set, java.util.Map, int, android.view.View, String, String, zzaxo)>
	//*  35   63:putfield        #79  <Field zzg zzazs>
	//*  36   66:aload_0         
	//*  37   67:getstatic       #41  <Field com.google.android.gms.common.api.Api$zza zzaBH>
	//*  38   70:putfield        #81  <Field com.google.android.gms.common.api.Api$zza zzaxu>
	//*  39   73:aload_0         
	//*  40   74:iconst_1        
	//*  41   75:putfield        #83  <Field boolean zzaBI>
	//*  42   78:return          
			context = ((Context) (new HashSet(((java.util.Collection) (((GoogleSignInOptions) (context)).zzqJ())))));
	//   43   79:new             #63  <Class HashSet>
	//   44   82:dup             
	//   45   83:aload_1         
	//   46   84:invokevirtual   #89  <Method java.util.ArrayList GoogleSignInOptions.zzqJ()>
	//   47   87:invokespecial   #92  <Method void HashSet(java.util.Collection)>
	//   48   90:astore_1        
		zzajm = ((Set) (context));
		zzazs = new zzg(((android.accounts.Account) (null)), zzajm, ((java.util.Map) (null)), 0, ((android.view.View) (null)), ((String) (null)), ((String) (null)), zzaxo.zzbCg);
		zzaxu = zzaBH;
		zzaBI = true;
	//*  49   91:goto            37
	}

	public zzabj(Context context, Handler handler, zzg zzg1, com.google.android.gms.common.api.Api.zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void zzaxr()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field Context mContext>
		mHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field Handler mHandler>
		zzazs = zzg1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #79  <Field zzg zzazs>
		zzajm = zzg1.zzxe();
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:invokevirtual   #98  <Method Set zzg.zzxe()>
	//   14   24:putfield        #66  <Field Set zzajm>
		zzaxu = zza1;
	//   15   27:aload_0         
	//   16   28:aload           4
	//   17   30:putfield        #81  <Field com.google.android.gms.common.api.Api$zza zzaxu>
		zzaBI = false;
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:putfield        #83  <Field boolean zzaBI>
	//   21   38:return          
	}

	static void zza(zzabj zzabj1, zzayb zzayb1)
	{
		zzabj1.zzc(zzayb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #105 <Method void zzc(zzayb)>
	//    3    5:return          
	}

	private void zzc(zzayb zzayb1)
	{
		Object obj = ((Object) (zzayb1.zzxA()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method ConnectionResult zzayb.zzxA()>
	//    2    4:astore_2        
		if(((ConnectionResult) (obj)).isSuccess())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #117 <Method boolean ConnectionResult.isSuccess()>
	//*   5    9:ifeq            123
		{
			obj = ((Object) (zzayb1.zzOp()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #121 <Method zzaf zzayb.zzOp()>
	//    8   16:astore_2        
			zzayb1 = ((zzayb) (((zzaf) (obj)).zzxA()));
	//    9   17:aload_2         
	//   10   18:invokevirtual   #124 <Method ConnectionResult zzaf.zzxA()>
	//   11   21:astore_1        
			if(!((ConnectionResult) (zzayb1)).isSuccess())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #117 <Method boolean ConnectionResult.isSuccess()>
	//*  14   26:ifne            96
			{
				obj = ((Object) (String.valueOf(((Object) (zzayb1)))));
	//   15   29:aload_1         
	//   16   30:invokestatic    #130 <Method String String.valueOf(Object)>
	//   17   33:astore_2        
				Log.wtf("SignInCoordinator", (new StringBuilder(String.valueOf(obj).length() + 48)).append("Sign-in succeeded with resolve account failure: ").append(((String) (obj))).toString(), ((Throwable) (new Exception())));
	//   18   34:ldc1            #132 <String "SignInCoordinator">
	//   19   36:new             #134 <Class StringBuilder>
	//   20   39:dup             
	//   21   40:aload_2         
	//   22   41:invokestatic    #130 <Method String String.valueOf(Object)>
	//   23   44:invokevirtual   #138 <Method int String.length()>
	//   24   47:bipush          48
	//   25   49:iadd            
	//   26   50:invokespecial   #141 <Method void StringBuilder(int)>
	//   27   53:ldc1            #143 <String "Sign-in succeeded with resolve account failure: ">
	//   28   55:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:aload_2         
	//   30   59:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   31   62:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   32   65:new             #153 <Class Exception>
	//   33   68:dup             
	//   34   69:invokespecial   #154 <Method void Exception()>
	//   35   72:invokestatic    #160 <Method int Log.wtf(String, String, Throwable)>
	//   36   75:pop             
				zzaBJ.zzi(((ConnectionResult) (zzayb1)));
	//   37   76:aload_0         
	//   38   77:getfield        #162 <Field zzabj$zza zzaBJ>
	//   39   80:aload_1         
	//   40   81:invokeinterface #166 <Method void zzabj$zza.zzi(ConnectionResult)>
				zzazS.disconnect();
	//   41   86:aload_0         
	//   42   87:getfield        #168 <Field zzaxn zzazS>
	//   43   90:invokeinterface #173 <Method void zzaxn.disconnect()>
				return;
	//   44   95:return          
			}
			zzaBJ.zzb(((zzaf) (obj)).zzxz(), zzajm);
	//   45   96:aload_0         
	//   46   97:getfield        #162 <Field zzabj$zza zzaBJ>
	//   47  100:aload_2         
	//   48  101:invokevirtual   #177 <Method zzr zzaf.zzxz()>
	//   49  104:aload_0         
	//   50  105:getfield        #66  <Field Set zzajm>
	//   51  108:invokeinterface #181 <Method void zzabj$zza.zzb(zzr, Set)>
		} else
	//*  52  113:aload_0         
	//*  53  114:getfield        #168 <Field zzaxn zzazS>
	//*  54  117:invokeinterface #173 <Method void zzaxn.disconnect()>
	//*  55  122:return          
		{
			zzaBJ.zzi(((ConnectionResult) (obj)));
	//   56  123:aload_0         
	//   57  124:getfield        #162 <Field zzabj$zza zzaBJ>
	//   58  127:aload_2         
	//   59  128:invokeinterface #166 <Method void zzabj$zza.zzi(ConnectionResult)>
		}
		zzazS.disconnect();
	//*  60  133:goto            113
	}

	public void onConnected(Bundle bundle)
	{
		zzazS.zza(((zzaxu) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field zzaxn zzazS>
	//    2    4:aload_0         
	//    3    5:invokeinterface #187 <Method void zzaxn.zza(zzaxu)>
	//    4   10:return          
	}

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzaBJ.zzi(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field zzabj$zza zzaBJ>
	//    2    4:aload_1         
	//    3    5:invokeinterface #166 <Method void zzabj$zza.zzi(ConnectionResult)>
	//    4   10:return          
	}

	public void onConnectionSuspended(int i)
	{
		zzazS.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field zzaxn zzazS>
	//    2    4:invokeinterface #173 <Method void zzaxn.disconnect()>
	//    3    9:return          
	}

	public void zza(zza zza1)
	{
		if(zzazS != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field zzaxn zzazS>
	//*   2    4:ifnull          16
			zzazS.disconnect();
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field zzaxn zzazS>
	//    5   11:invokeinterface #173 <Method void zzaxn.disconnect()>
		if(zzaBI)
	//*   6   16:aload_0         
	//*   7   17:getfield        #83  <Field boolean zzaBI>
	//*   8   20:ifeq            75
		{
			Object obj = ((Object) (zzl.zzaa(mContext).zzrd()));
	//    9   23:aload_0         
	//   10   24:getfield        #49  <Field Context mContext>
	//   11   27:invokestatic    #57  <Method zzl zzl.zzaa(Context)>
	//   12   30:invokevirtual   #61  <Method GoogleSignInOptions zzl.zzrd()>
	//   13   33:astore_2        
			if(obj == null)
	//*  14   34:aload_2         
	//*  15   35:ifnonnull       128
				obj = ((Object) (new HashSet()));
	//   16   38:new             #63  <Class HashSet>
	//   17   41:dup             
	//   18   42:invokespecial   #64  <Method void HashSet()>
	//   19   45:astore_2        
			else
	//*  20   46:aload_0         
	//*  21   47:aload_2         
	//*  22   48:putfield        #66  <Field Set zzajm>
	//*  23   51:aload_0         
	//*  24   52:new             #68  <Class zzg>
	//*  25   55:dup             
	//*  26   56:aconst_null     
	//*  27   57:aload_0         
	//*  28   58:getfield        #66  <Field Set zzajm>
	//*  29   61:aconst_null     
	//*  30   62:iconst_0        
	//*  31   63:aconst_null     
	//*  32   64:aconst_null     
	//*  33   65:aconst_null     
	//*  34   66:getstatic       #74  <Field zzaxo zzaxo.zzbCg>
	//*  35   69:invokespecial   #77  <Method void zzg(android.accounts.Account, Set, java.util.Map, int, android.view.View, String, String, zzaxo)>
	//*  36   72:putfield        #79  <Field zzg zzazs>
	//*  37   75:aload_0         
	//*  38   76:aload_0         
	//*  39   77:getfield        #81  <Field com.google.android.gms.common.api.Api$zza zzaxu>
	//*  40   80:aload_0         
	//*  41   81:getfield        #49  <Field Context mContext>
	//*  42   84:aload_0         
	//*  43   85:getfield        #51  <Field Handler mHandler>
	//*  44   88:invokevirtual   #198 <Method android.os.Looper Handler.getLooper()>
	//*  45   91:aload_0         
	//*  46   92:getfield        #79  <Field zzg zzazs>
	//*  47   95:aload_0         
	//*  48   96:getfield        #79  <Field zzg zzazs>
	//*  49   99:invokevirtual   #202 <Method zzaxo zzg.zzxk()>
	//*  50  102:aload_0         
	//*  51  103:aload_0         
	//*  52  104:invokevirtual   #207 <Method com.google.android.gms.common.api.Api$zze com.google.android.gms.common.api.Api$zza.zza(Context, android.os.Looper, zzg, Object, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//*  53  107:checkcast       #170 <Class zzaxn>
	//*  54  110:putfield        #168 <Field zzaxn zzazS>
	//*  55  113:aload_0         
	//*  56  114:aload_1         
	//*  57  115:putfield        #162 <Field zzabj$zza zzaBJ>
	//*  58  118:aload_0         
	//*  59  119:getfield        #168 <Field zzaxn zzazS>
	//*  60  122:invokeinterface #210 <Method void zzaxn.connect()>
	//*  61  127:return          
				obj = ((Object) (new HashSet(((java.util.Collection) (((GoogleSignInOptions) (obj)).zzqJ())))));
	//   62  128:new             #63  <Class HashSet>
	//   63  131:dup             
	//   64  132:aload_2         
	//   65  133:invokevirtual   #89  <Method java.util.ArrayList GoogleSignInOptions.zzqJ()>
	//   66  136:invokespecial   #92  <Method void HashSet(java.util.Collection)>
	//   67  139:astore_2        
			zzajm = ((Set) (obj));
			zzazs = new zzg(((android.accounts.Account) (null)), zzajm, ((java.util.Map) (null)), 0, ((android.view.View) (null)), ((String) (null)), ((String) (null)), zzaxo.zzbCg);
		}
		zzazS = (zzaxn)zzaxu.zza(mContext, mHandler.getLooper(), zzazs, ((Object) (zzazs.zzxk())), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (this)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
		zzaBJ = zza1;
		zzazS.connect();
	//*  68  140:goto            46
	}

	public void zzb(zzayb zzayb1)
	{
		mHandler.post(new Runnable(zzayb1) {

			public void run()
			{
				zzabj.zza(zzaBK, zzaAi);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field zzabj zzaBK>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field zzayb zzaAi>
			//    4    8:invokestatic    #29  <Method void zzabj.zza(zzabj, zzayb)>
			//    5   11:return          
			}

			final zzayb zzaAi;
			final zzabj zzaBK;

			
			{
				zzaBK = zzabj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzabj zzaBK>
				zzaAi = zzayb1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field zzayb zzaAi>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Handler mHandler>
	//    2    4:new             #10  <Class zzabj$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #213 <Method void zzabj$1(zzabj, zzayb)>
	//    7   13:invokevirtual   #217 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void zzwr()
	{
		zzazS.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field zzaxn zzazS>
	//    2    4:invokeinterface #173 <Method void zzaxn.disconnect()>
	//    3    9:return          
	}

	private static com.google.android.gms.common.api.Api.zza zzaBH;
	private final Context mContext;
	private final Handler mHandler;
	private final boolean zzaBI;
	private zza zzaBJ;
	private Set zzajm;
	private final com.google.android.gms.common.api.Api.zza zzaxu;
	private zzaxn zzazS;
	private zzg zzazs;

	static 
	{
		zzaBH = zzaxm.zzahd;
	//    0    0:getstatic       #39  <Field com.google.android.gms.common.api.Api$zza zzaxm.zzahd>
	//    1    3:putstatic       #41  <Field com.google.android.gms.common.api.Api$zza zzaBH>
	//*   2    6:return          
	}
}
