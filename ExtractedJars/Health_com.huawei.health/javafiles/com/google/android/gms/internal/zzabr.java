// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.*;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//			zzbam, zzbah, zzbaw, zzbai, 
//			zzbaj

public class zzabr extends zzbam
	implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{
	public static interface zza
	{

		public abstract void zzb(zzr zzr, Set set);

		public abstract void zzi(ConnectionResult connectionresult);
	}


	public zzabr(Context context, Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void zzbam()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field Context mContext>
		mHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field Handler mHandler>
		zzayH = zzaDg;
	//    8   14:aload_0         
	//    9   15:getstatic       #41  <Field com.google.android.gms.common.api.Api$zza zzaDg>
	//   10   18:putfield        #53  <Field com.google.android.gms.common.api.Api$zza zzayH>
		zzaDh = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #55  <Field boolean zzaDh>
	//   14   26:return          
	}

	public zzabr(Context context, Handler handler, zzg zzg1, com.google.android.gms.common.api.Api.zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void zzbam()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field Context mContext>
		mHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field Handler mHandler>
		zzaAL = zzg1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #59  <Field zzg zzaAL>
		zzakq = zzg1.zzxL();
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:invokevirtual   #65  <Method Set zzg.zzxL()>
	//   14   24:putfield        #67  <Field Set zzakq>
		zzayH = zza1;
	//   15   27:aload_0         
	//   16   28:aload           4
	//   17   30:putfield        #53  <Field com.google.android.gms.common.api.Api$zza zzayH>
		zzaDh = false;
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:putfield        #55  <Field boolean zzaDh>
	//   21   38:return          
	}

	static void zza(zzabr zzabr1, zzbaw zzbaw1)
	{
		zzabr1.zzc(zzbaw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method void zzc(zzbaw)>
	//    3    5:return          
	}

	private void zzc(zzbaw zzbaw1)
	{
		Object obj = ((Object) (zzbaw1.zzyh()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #80  <Method ConnectionResult zzbaw.zzyh()>
	//    2    4:astore_2        
		if(((ConnectionResult) (obj)).isSuccess())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #86  <Method boolean ConnectionResult.isSuccess()>
	//*   5    9:ifeq            116
		{
			obj = ((Object) (zzbaw1.zzPU()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #90  <Method zzaf zzbaw.zzPU()>
	//    8   16:astore_2        
			zzbaw1 = ((zzbaw) (((zzaf) (obj)).zzyh()));
	//    9   17:aload_2         
	//   10   18:invokevirtual   #93  <Method ConnectionResult zzaf.zzyh()>
	//   11   21:astore_1        
			if(!((ConnectionResult) (zzbaw1)).isSuccess())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #86  <Method boolean ConnectionResult.isSuccess()>
	//*  14   26:ifne            96
			{
				obj = ((Object) (String.valueOf(((Object) (zzbaw1)))));
	//   15   29:aload_1         
	//   16   30:invokestatic    #99  <Method String String.valueOf(Object)>
	//   17   33:astore_2        
				Log.wtf("SignInCoordinator", (new StringBuilder(String.valueOf(obj).length() + 48)).append("Sign-in succeeded with resolve account failure: ").append(((String) (obj))).toString(), ((Throwable) (new Exception())));
	//   18   34:ldc1            #101 <String "SignInCoordinator">
	//   19   36:new             #103 <Class StringBuilder>
	//   20   39:dup             
	//   21   40:aload_2         
	//   22   41:invokestatic    #99  <Method String String.valueOf(Object)>
	//   23   44:invokevirtual   #107 <Method int String.length()>
	//   24   47:bipush          48
	//   25   49:iadd            
	//   26   50:invokespecial   #110 <Method void StringBuilder(int)>
	//   27   53:ldc1            #112 <String "Sign-in succeeded with resolve account failure: ">
	//   28   55:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:aload_2         
	//   30   59:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   31   62:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   32   65:new             #122 <Class Exception>
	//   33   68:dup             
	//   34   69:invokespecial   #123 <Method void Exception()>
	//   35   72:invokestatic    #129 <Method int Log.wtf(String, String, Throwable)>
	//   36   75:pop             
				zzaDi.zzi(((ConnectionResult) (zzbaw1)));
	//   37   76:aload_0         
	//   38   77:getfield        #131 <Field zzabr$zza zzaDi>
	//   39   80:aload_1         
	//   40   81:invokeinterface #135 <Method void zzabr$zza.zzi(ConnectionResult)>
				zzaBs.disconnect();
	//   41   86:aload_0         
	//   42   87:getfield        #137 <Field zzbai zzaBs>
	//   43   90:invokeinterface #142 <Method void zzbai.disconnect()>
				return;
	//   44   95:return          
			}
			zzaDi.zzb(((zzaf) (obj)).zzyg(), zzakq);
	//   45   96:aload_0         
	//   46   97:getfield        #131 <Field zzabr$zza zzaDi>
	//   47  100:aload_2         
	//   48  101:invokevirtual   #146 <Method zzr zzaf.zzyg()>
	//   49  104:aload_0         
	//   50  105:getfield        #67  <Field Set zzakq>
	//   51  108:invokeinterface #150 <Method void zzabr$zza.zzb(zzr, Set)>
		} else
	//*  52  113:goto            126
		{
			zzaDi.zzi(((ConnectionResult) (obj)));
	//   53  116:aload_0         
	//   54  117:getfield        #131 <Field zzabr$zza zzaDi>
	//   55  120:aload_2         
	//   56  121:invokeinterface #135 <Method void zzabr$zza.zzi(ConnectionResult)>
		}
		zzaBs.disconnect();
	//   57  126:aload_0         
	//   58  127:getfield        #137 <Field zzbai zzaBs>
	//   59  130:invokeinterface #142 <Method void zzbai.disconnect()>
	//   60  135:return          
	}

	public void onConnected(Bundle bundle)
	{
		zzaBs.zza(((zzbap) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field zzbai zzaBs>
	//    2    4:aload_0         
	//    3    5:invokeinterface #156 <Method void zzbai.zza(zzbap)>
	//    4   10:return          
	}

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzaDi.zzi(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field zzabr$zza zzaDi>
	//    2    4:aload_1         
	//    3    5:invokeinterface #135 <Method void zzabr$zza.zzi(ConnectionResult)>
	//    4   10:return          
	}

	public void onConnectionSuspended(int i)
	{
		zzaBs.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field zzbai zzaBs>
	//    2    4:invokeinterface #142 <Method void zzbai.disconnect()>
	//    3    9:return          
	}

	public void zza(zza zza1)
	{
		if(zzaBs != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field zzbai zzaBs>
	//*   2    4:ifnull          16
			zzaBs.disconnect();
	//    3    7:aload_0         
	//    4    8:getfield        #137 <Field zzbai zzaBs>
	//    5   11:invokeinterface #142 <Method void zzbai.disconnect()>
		if(zzaDh)
	//*   6   16:aload_0         
	//*   7   17:getfield        #55  <Field boolean zzaDh>
	//*   8   20:ifeq            90
		{
			Object obj = ((Object) (zzn.zzas(mContext).zzrC()));
	//    9   23:aload_0         
	//   10   24:getfield        #49  <Field Context mContext>
	//   11   27:invokestatic    #167 <Method zzn zzn.zzas(Context)>
	//   12   30:invokevirtual   #171 <Method GoogleSignInOptions zzn.zzrC()>
	//   13   33:astore_2        
			if(obj == null)
	//*  14   34:aload_2         
	//*  15   35:ifnonnull       49
				obj = ((Object) (new HashSet()));
	//   16   38:new             #173 <Class HashSet>
	//   17   41:dup             
	//   18   42:invokespecial   #174 <Method void HashSet()>
	//   19   45:astore_2        
			else
	//*  20   46:goto            61
				obj = ((Object) (new HashSet(((java.util.Collection) (((GoogleSignInOptions) (obj)).zzrj())))));
	//   21   49:new             #173 <Class HashSet>
	//   22   52:dup             
	//   23   53:aload_2         
	//   24   54:invokevirtual   #180 <Method java.util.ArrayList GoogleSignInOptions.zzrj()>
	//   25   57:invokespecial   #183 <Method void HashSet(java.util.Collection)>
	//   26   60:astore_2        
			zzakq = ((Set) (obj));
	//   27   61:aload_0         
	//   28   62:aload_2         
	//   29   63:putfield        #67  <Field Set zzakq>
			zzaAL = new zzg(((android.accounts.Account) (null)), zzakq, ((java.util.Map) (null)), 0, ((android.view.View) (null)), ((String) (null)), ((String) (null)), zzbaj.zzbEi);
	//   30   66:aload_0         
	//   31   67:new             #61  <Class zzg>
	//   32   70:dup             
	//   33   71:aconst_null     
	//   34   72:aload_0         
	//   35   73:getfield        #67  <Field Set zzakq>
	//   36   76:aconst_null     
	//   37   77:iconst_0        
	//   38   78:aconst_null     
	//   39   79:aconst_null     
	//   40   80:aconst_null     
	//   41   81:getstatic       #189 <Field zzbaj zzbaj.zzbEi>
	//   42   84:invokespecial   #192 <Method void zzg(android.accounts.Account, Set, java.util.Map, int, android.view.View, String, String, zzbaj)>
	//   43   87:putfield        #59  <Field zzg zzaAL>
		}
		zzaBs = (zzbai)zzayH.zza(mContext, mHandler.getLooper(), zzaAL, ((Object) (zzaAL.zzxR())), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (this)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
	//   44   90:aload_0         
	//   45   91:aload_0         
	//   46   92:getfield        #53  <Field com.google.android.gms.common.api.Api$zza zzayH>
	//   47   95:aload_0         
	//   48   96:getfield        #49  <Field Context mContext>
	//   49   99:aload_0         
	//   50  100:getfield        #51  <Field Handler mHandler>
	//   51  103:invokevirtual   #198 <Method android.os.Looper Handler.getLooper()>
	//   52  106:aload_0         
	//   53  107:getfield        #59  <Field zzg zzaAL>
	//   54  110:aload_0         
	//   55  111:getfield        #59  <Field zzg zzaAL>
	//   56  114:invokevirtual   #202 <Method zzbaj zzg.zzxR()>
	//   57  117:aload_0         
	//   58  118:aload_0         
	//   59  119:invokevirtual   #207 <Method com.google.android.gms.common.api.Api$zze com.google.android.gms.common.api.Api$zza.zza(Context, android.os.Looper, zzg, Object, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   60  122:checkcast       #139 <Class zzbai>
	//   61  125:putfield        #137 <Field zzbai zzaBs>
		zzaDi = zza1;
	//   62  128:aload_0         
	//   63  129:aload_1         
	//   64  130:putfield        #131 <Field zzabr$zza zzaDi>
		zzaBs.connect();
	//   65  133:aload_0         
	//   66  134:getfield        #137 <Field zzbai zzaBs>
	//   67  137:invokeinterface #210 <Method void zzbai.connect()>
	//   68  142:return          
	}

	public void zzb(zzbaw zzbaw1)
	{
		mHandler.post(new Runnable(zzbaw1) {

			public void run()
			{
				zzabr.zza(zzaDj, zzaBI);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field zzabr zzaDj>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field zzbaw zzaBI>
			//    4    8:invokestatic    #29  <Method void zzabr.zza(zzabr, zzbaw)>
			//    5   11:return          
			}

			final zzbaw zzaBI;
			final zzabr zzaDj;

			
			{
				zzaDj = zzabr.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzabr zzaDj>
				zzaBI = zzbaw1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field zzbaw zzaBI>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Handler mHandler>
	//    2    4:new             #10  <Class zzabr$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #213 <Method void zzabr$1(zzabr, zzbaw)>
	//    7   13:invokevirtual   #217 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public zzbai zzwO()
	{
		return zzaBs;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field zzbai zzaBs>
	//    2    4:areturn         
	}

	public void zzwY()
	{
		zzaBs.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field zzbai zzaBs>
	//    2    4:invokeinterface #142 <Method void zzbai.disconnect()>
	//    3    9:return          
	}

	private static com.google.android.gms.common.api.Api.zza zzaDg;
	private final Context mContext;
	private final Handler mHandler;
	private zzg zzaAL;
	private zzbai zzaBs;
	private final boolean zzaDh;
	private zza zzaDi;
	private Set zzakq;
	private final com.google.android.gms.common.api.Api.zza zzayH;

	static 
	{
		zzaDg = zzbah.zzaie;
	//    0    0:getstatic       #39  <Field com.google.android.gms.common.api.Api$zza zzbah.zzaie>
	//    1    3:putstatic       #41  <Field com.google.android.gms.common.api.Api$zza zzaDg>
	//*   2    6:return          
	}
}
