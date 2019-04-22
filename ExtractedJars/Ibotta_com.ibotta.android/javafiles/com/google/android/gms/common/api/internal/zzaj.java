// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbc, zzbd, zzav, zzbg, 
//			zzap, zzak, zzbq, zzal, 
//			zzas, zzam

public final class zzaj
	implements zzbc
{

	public zzaj(zzbd zzbd1, ClientSettings clientsettings, Map map, GoogleApiAvailabilityLight googleapiavailabilitylight, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, Lock lock, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		zzhj = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #53  <Field int zzhj>
	//    5    9:aload_0         
	//    6   10:new             #55  <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #56  <Method void Bundle()>
	//    9   17:putfield        #58  <Field Bundle zzhl>
	//   10   20:aload_0         
	//   11   21:new             #60  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #61  <Method void HashSet()>
	//   14   28:putfield        #63  <Field Set zzhm>
		zzhu = new ArrayList();
	//   15   31:aload_0         
	//   16   32:new             #65  <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #66  <Method void ArrayList()>
	//   19   39:putfield        #68  <Field ArrayList zzhu>
		zzhf = zzbd1;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:putfield        #70  <Field zzbd zzhf>
		zzgf = clientsettings;
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:putfield        #72  <Field ClientSettings zzgf>
		zzgi = map;
	//   26   52:aload_0         
	//   27   53:aload_3         
	//   28   54:putfield        #74  <Field Map zzgi>
		zzgk = googleapiavailabilitylight;
	//   29   57:aload_0         
	//   30   58:aload           4
	//   31   60:putfield        #76  <Field GoogleApiAvailabilityLight zzgk>
		zzdh = abstractclientbuilder;
	//   32   63:aload_0         
	//   33   64:aload           5
	//   34   66:putfield        #78  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
		zzga = lock;
	//   35   69:aload_0         
	//   36   70:aload           6
	//   37   72:putfield        #80  <Field Lock zzga>
		mContext = context;
	//   38   75:aload_0         
	//   39   76:aload           7
	//   40   78:putfield        #82  <Field Context mContext>
	//   41   81:return          
	}

	static Context zza(zzaj zzaj1)
	{
		return zzaj1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Context mContext>
	//    2    4:areturn         
	}

	static void zza(zzaj zzaj1, ConnectionResult connectionresult)
	{
		zzaj1.zze(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void zze(ConnectionResult)>
	//    3    5:return          
	}

	static void zza(zzaj zzaj1, ConnectionResult connectionresult, Api api, boolean flag)
	{
		zzaj1.zzb(connectionresult, api, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #97  <Method void zzb(ConnectionResult, Api, boolean)>
	//    5    7:return          
	}

	static void zza(zzaj zzaj1, SignInResponse signinresponse)
	{
		zzaj1.zza(signinresponse);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void zza(SignInResponse)>
	//    3    5:return          
	}

	private final void zza(SignInResponse signinresponse)
	{
		if(!zze(0))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokespecial   #107 <Method boolean zze(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		Object obj = ((Object) (signinresponse.getConnectionResult()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #113 <Method ConnectionResult SignInResponse.getConnectionResult()>
	//    7   13:astore_2        
		if(((ConnectionResult) (obj)).isSuccess())
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #119 <Method boolean ConnectionResult.isSuccess()>
	//*  10   18:ifeq            131
		{
			obj = ((Object) (signinresponse.getResolveAccountResponse()));
	//   11   21:aload_1         
	//   12   22:invokevirtual   #123 <Method ResolveAccountResponse SignInResponse.getResolveAccountResponse()>
	//   13   25:astore_2        
			signinresponse = ((SignInResponse) (((ResolveAccountResponse) (obj)).getConnectionResult()));
	//   14   26:aload_2         
	//   15   27:invokevirtual   #126 <Method ConnectionResult ResolveAccountResponse.getConnectionResult()>
	//   16   30:astore_1        
			if(!((ConnectionResult) (signinresponse)).isSuccess())
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #119 <Method boolean ConnectionResult.isSuccess()>
	//*  19   35:ifne            97
			{
				obj = ((Object) (String.valueOf(((Object) (signinresponse)))));
	//   20   38:aload_1         
	//   21   39:invokestatic    #132 <Method String String.valueOf(Object)>
	//   22   42:astore_2        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 48);
	//   23   43:new             #134 <Class StringBuilder>
	//   24   46:dup             
	//   25   47:aload_2         
	//   26   48:invokestatic    #132 <Method String String.valueOf(Object)>
	//   27   51:invokevirtual   #138 <Method int String.length()>
	//   28   54:bipush          48
	//   29   56:iadd            
	//   30   57:invokespecial   #141 <Method void StringBuilder(int)>
	//   31   60:astore_3        
				stringbuilder.append("Sign-in succeeded with resolve account failure: ");
	//   32   61:aload_3         
	//   33   62:ldc1            #143 <String "Sign-in succeeded with resolve account failure: ">
	//   34   64:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
				stringbuilder.append(((String) (obj)));
	//   36   68:aload_3         
	//   37   69:aload_2         
	//   38   70:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   39   73:pop             
				Log.wtf("GoogleApiClientConnecting", stringbuilder.toString(), ((Throwable) (new Exception())));
	//   40   74:ldc1            #149 <String "GoogleApiClientConnecting">
	//   41   76:aload_3         
	//   42   77:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   43   80:new             #155 <Class Exception>
	//   44   83:dup             
	//   45   84:invokespecial   #156 <Method void Exception()>
	//   46   87:invokestatic    #162 <Method int Log.wtf(String, String, Throwable)>
	//   47   90:pop             
				zze(((ConnectionResult) (signinresponse)));
	//   48   91:aload_0         
	//   49   92:aload_1         
	//   50   93:invokespecial   #92  <Method void zze(ConnectionResult)>
				return;
	//   51   96:return          
			} else
			{
				zzhq = true;
	//   52   97:aload_0         
	//   53   98:iconst_1        
	//   54   99:putfield        #164 <Field boolean zzhq>
				zzhr = ((ResolveAccountResponse) (obj)).getAccountAccessor();
	//   55  102:aload_0         
	//   56  103:aload_2         
	//   57  104:invokevirtual   #168 <Method IAccountAccessor ResolveAccountResponse.getAccountAccessor()>
	//   58  107:putfield        #170 <Field IAccountAccessor zzhr>
				zzhs = ((ResolveAccountResponse) (obj)).getSaveDefaultAccount();
	//   59  110:aload_0         
	//   60  111:aload_2         
	//   61  112:invokevirtual   #173 <Method boolean ResolveAccountResponse.getSaveDefaultAccount()>
	//   62  115:putfield        #175 <Field boolean zzhs>
				zzht = ((ResolveAccountResponse) (obj)).isFromCrossClientAuth();
	//   63  118:aload_0         
	//   64  119:aload_2         
	//   65  120:invokevirtual   #178 <Method boolean ResolveAccountResponse.isFromCrossClientAuth()>
	//   66  123:putfield        #180 <Field boolean zzht>
				zzas();
	//   67  126:aload_0         
	//   68  127:invokespecial   #183 <Method void zzas()>
				return;
	//   69  130:return          
			}
		}
		if(zzd(((ConnectionResult) (obj))))
	//*  70  131:aload_0         
	//*  71  132:aload_2         
	//*  72  133:invokespecial   #187 <Method boolean zzd(ConnectionResult)>
	//*  73  136:ifeq            148
		{
			zzau();
	//   74  139:aload_0         
	//   75  140:invokespecial   #190 <Method void zzau()>
			zzas();
	//   76  143:aload_0         
	//   77  144:invokespecial   #183 <Method void zzas()>
			return;
	//   78  147:return          
		} else
		{
			zze(((ConnectionResult) (obj)));
	//   79  148:aload_0         
	//   80  149:aload_2         
	//   81  150:invokespecial   #92  <Method void zze(ConnectionResult)>
			return;
	//   82  153:return          
		}
	}

	private final void zza(boolean flag)
	{
		SignInClient signinclient = zzhn;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field SignInClient zzhn>
	//    2    4:astore_2        
		if(signinclient != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          45
		{
			if(signinclient.isConnected() && flag)
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #199 <Method boolean SignInClient.isConnected()>
	//*   7   15:ifeq            31
	//*   8   18:iload_1         
	//*   9   19:ifeq            31
				zzhn.clearAccountFromSessionStore();
	//   10   22:aload_0         
	//   11   23:getfield        #194 <Field SignInClient zzhn>
	//   12   26:invokeinterface #202 <Method void SignInClient.clearAccountFromSessionStore()>
			zzhn.disconnect();
	//   13   31:aload_0         
	//   14   32:getfield        #194 <Field SignInClient zzhn>
	//   15   35:invokeinterface #205 <Method void SignInClient.disconnect()>
			zzhr = null;
	//   16   40:aload_0         
	//   17   41:aconst_null     
	//   18   42:putfield        #170 <Field IAccountAccessor zzhr>
		}
	//   19   45:return          
	}

	static boolean zza(zzaj zzaj1, int i)
	{
		return zzaj1.zze(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #107 <Method boolean zze(int)>
	//    3    5:ireturn         
	}

	private final boolean zzar()
	{
		zzhk = zzhk - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #209 <Field int zzhk>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #209 <Field int zzhk>
		int i = zzhk;
	//    6   10:aload_0         
	//    7   11:getfield        #209 <Field int zzhk>
	//    8   14:istore_1        
		if(i > 0)
	//*   9   15:iload_1         
	//*  10   16:ifle            21
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		ConnectionResult connectionresult;
		if(i < 0)
	//*  13   21:iload_1         
	//*  14   22:ifge            74
		{
			Log.w("GoogleApiClientConnecting", zzhf.zzfq.zzbb());
	//   15   25:ldc1            #149 <String "GoogleApiClientConnecting">
	//   16   27:aload_0         
	//   17   28:getfield        #70  <Field zzbd zzhf>
	//   18   31:getfield        #215 <Field zzav zzbd.zzfq>
	//   19   34:invokevirtual   #220 <Method String zzav.zzbb()>
	//   20   37:invokestatic    #224 <Method int Log.w(String, String)>
	//   21   40:pop             
			Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", ((Throwable) (new Exception())));
	//   22   41:ldc1            #149 <String "GoogleApiClientConnecting">
	//   23   43:ldc1            #226 <String "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.">
	//   24   45:new             #155 <Class Exception>
	//   25   48:dup             
	//   26   49:invokespecial   #156 <Method void Exception()>
	//   27   52:invokestatic    #162 <Method int Log.wtf(String, String, Throwable)>
	//   28   55:pop             
			connectionresult = new ConnectionResult(8, ((android.app.PendingIntent) (null)));
	//   29   56:new             #115 <Class ConnectionResult>
	//   30   59:dup             
	//   31   60:bipush          8
	//   32   62:aconst_null     
	//   33   63:invokespecial   #229 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   34   66:astore_2        
		} else
	//*  35   67:aload_0         
	//*  36   68:aload_2         
	//*  37   69:invokespecial   #92  <Method void zze(ConnectionResult)>
	//*  38   72:iconst_0        
	//*  39   73:ireturn         
		{
			connectionresult = zzgt;
	//   40   74:aload_0         
	//   41   75:getfield        #231 <Field ConnectionResult zzgt>
	//   42   78:astore_2        
			if(connectionresult != null)
	//*  43   79:aload_2         
	//*  44   80:ifnull          97
				zzhf.zzje = zzhi;
	//   45   83:aload_0         
	//   46   84:getfield        #70  <Field zzbd zzhf>
	//   47   87:aload_0         
	//   48   88:getfield        #233 <Field int zzhi>
	//   49   91:putfield        #236 <Field int zzbd.zzje>
			else
	//*  50   94:goto            67
				return true;
	//   51   97:iconst_1        
	//   52   98:ireturn         
		}
		zze(connectionresult);
		return false;
	}

	private final void zzas()
	{
		if(zzhk != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field int zzhk>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!zzhp || zzhq)
	//*   4    8:aload_0         
	//*   5    9:getfield        #238 <Field boolean zzhp>
	//*   6   12:ifeq            22
	//*   7   15:aload_0         
	//*   8   16:getfield        #164 <Field boolean zzhq>
	//*   9   19:ifeq            174
		{
			ArrayList arraylist = new ArrayList();
	//   10   22:new             #65  <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #66  <Method void ArrayList()>
	//   13   29:astore_1        
			zzhj = 1;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #53  <Field int zzhj>
			zzhk = zzhf.zzil.size();
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #70  <Field zzbd zzhf>
	//   20   40:getfield        #241 <Field Map zzbd.zzil>
	//   21   43:invokeinterface #246 <Method int Map.size()>
	//   22   48:putfield        #209 <Field int zzhk>
			Iterator iterator = zzhf.zzil.keySet().iterator();
	//   23   51:aload_0         
	//   24   52:getfield        #70  <Field zzbd zzhf>
	//   25   55:getfield        #241 <Field Map zzbd.zzil>
	//   26   58:invokeinterface #250 <Method Set Map.keySet()>
	//   27   63:invokeinterface #256 <Method Iterator Set.iterator()>
	//   28   68:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   29   69:aload_2         
	//   30   70:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   31   75:ifeq            142
				com.google.android.gms.common.api.Api.AnyClientKey anyclientkey = (com.google.android.gms.common.api.Api.AnyClientKey)iterator.next();
	//   32   78:aload_2         
	//   33   79:invokeinterface #265 <Method Object Iterator.next()>
	//   34   84:checkcast       #267 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   35   87:astore_3        
				if(zzhf.zzjb.containsKey(((Object) (anyclientkey))))
	//*  36   88:aload_0         
	//*  37   89:getfield        #70  <Field zzbd zzhf>
	//*  38   92:getfield        #270 <Field Map zzbd.zzjb>
	//*  39   95:aload_3         
	//*  40   96:invokeinterface #274 <Method boolean Map.containsKey(Object)>
	//*  41  101:ifeq            118
				{
					if(zzar())
	//*  42  104:aload_0         
	//*  43  105:invokespecial   #276 <Method boolean zzar()>
	//*  44  108:ifeq            69
						zzat();
	//   45  111:aload_0         
	//   46  112:invokespecial   #279 <Method void zzat()>
				} else
	//*  47  115:goto            69
				{
					arraylist.add(((Object) ((com.google.android.gms.common.api.Api.Client)zzhf.zzil.get(((Object) (anyclientkey))))));
	//   48  118:aload_1         
	//   49  119:aload_0         
	//   50  120:getfield        #70  <Field zzbd zzhf>
	//   51  123:getfield        #241 <Field Map zzbd.zzil>
	//   52  126:aload_3         
	//   53  127:invokeinterface #283 <Method Object Map.get(Object)>
	//   54  132:checkcast       #285 <Class com.google.android.gms.common.api.Api$Client>
	//   55  135:invokevirtual   #288 <Method boolean ArrayList.add(Object)>
	//   56  138:pop             
				}
			} while(true);
	//   57  139:goto            69
			if(!arraylist.isEmpty())
	//*  58  142:aload_1         
	//*  59  143:invokevirtual   #291 <Method boolean ArrayList.isEmpty()>
	//*  60  146:ifne            174
				zzhu.add(((Object) (zzbg.zzbe().submit(((Runnable) (new zzap(this, arraylist)))))));
	//   61  149:aload_0         
	//   62  150:getfield        #68  <Field ArrayList zzhu>
	//   63  153:invokestatic    #297 <Method ExecutorService zzbg.zzbe()>
	//   64  156:new             #299 <Class zzap>
	//   65  159:dup             
	//   66  160:aload_0         
	//   67  161:aload_1         
	//   68  162:invokespecial   #302 <Method void zzap(zzaj, ArrayList)>
	//   69  165:invokeinterface #308 <Method Future ExecutorService.submit(Runnable)>
	//   70  170:invokevirtual   #288 <Method boolean ArrayList.add(Object)>
	//   71  173:pop             
		}
	//   72  174:return          
	}

	private final void zzat()
	{
		zzhf.zzbd();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zzbd zzhf>
	//    2    4:invokevirtual   #311 <Method void zzbd.zzbd()>
		zzbg.zzbe().execute(((Runnable) (new zzak(this))));
	//    3    7:invokestatic    #297 <Method ExecutorService zzbg.zzbe()>
	//    4   10:new             #313 <Class zzak>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #316 <Method void zzak(zzaj)>
	//    8   18:invokeinterface #320 <Method void ExecutorService.execute(Runnable)>
		Object obj = ((Object) (zzhn));
	//    9   23:aload_0         
	//   10   24:getfield        #194 <Field SignInClient zzhn>
	//   11   27:astore_1        
		if(obj != null)
	//*  12   28:aload_1         
	//*  13   29:ifnull          58
		{
			if(zzhs)
	//*  14   32:aload_0         
	//*  15   33:getfield        #175 <Field boolean zzhs>
	//*  16   36:ifeq            53
				((SignInClient) (obj)).saveDefaultAccount(zzhr, zzht);
	//   17   39:aload_1         
	//   18   40:aload_0         
	//   19   41:getfield        #170 <Field IAccountAccessor zzhr>
	//   20   44:aload_0         
	//   21   45:getfield        #180 <Field boolean zzht>
	//   22   48:invokeinterface #324 <Method void SignInClient.saveDefaultAccount(IAccountAccessor, boolean)>
			zza(false);
	//   23   53:aload_0         
	//   24   54:iconst_0        
	//   25   55:invokespecial   #326 <Method void zza(boolean)>
		}
		com.google.android.gms.common.api.Api.AnyClientKey anyclientkey;
		for(obj = ((Object) (zzhf.zzjb.keySet().iterator())); ((Iterator) (obj)).hasNext(); ((com.google.android.gms.common.api.Api.Client)zzhf.zzil.get(((Object) (anyclientkey)))).disconnect())
	//*  26   58:aload_0         
	//*  27   59:getfield        #70  <Field zzbd zzhf>
	//*  28   62:getfield        #270 <Field Map zzbd.zzjb>
	//*  29   65:invokeinterface #250 <Method Set Map.keySet()>
	//*  30   70:invokeinterface #256 <Method Iterator Set.iterator()>
	//*  31   75:astore_1        
	//*  32   76:aload_1         
	//*  33   77:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*  34   82:ifeq            119
			anyclientkey = (com.google.android.gms.common.api.Api.AnyClientKey)((Iterator) (obj)).next();
	//   35   85:aload_1         
	//   36   86:invokeinterface #265 <Method Object Iterator.next()>
	//   37   91:checkcast       #267 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   38   94:astore_2        

	//   39   95:aload_0         
	//   40   96:getfield        #70  <Field zzbd zzhf>
	//   41   99:getfield        #241 <Field Map zzbd.zzil>
	//   42  102:aload_2         
	//   43  103:invokeinterface #283 <Method Object Map.get(Object)>
	//   44  108:checkcast       #285 <Class com.google.android.gms.common.api.Api$Client>
	//   45  111:invokeinterface #327 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
	//*  46  116:goto            76
		if(zzhl.isEmpty())
	//*  47  119:aload_0         
	//*  48  120:getfield        #58  <Field Bundle zzhl>
	//*  49  123:invokevirtual   #328 <Method boolean Bundle.isEmpty()>
	//*  50  126:ifeq            134
			obj = null;
	//   51  129:aconst_null     
	//   52  130:astore_1        
		else
	//*  53  131:goto            139
			obj = ((Object) (zzhl));
	//   54  134:aload_0         
	//   55  135:getfield        #58  <Field Bundle zzhl>
	//   56  138:astore_1        
		zzhf.zzjf.zzb(((Bundle) (obj)));
	//   57  139:aload_0         
	//   58  140:getfield        #70  <Field zzbd zzhf>
	//   59  143:getfield        #332 <Field zzbq zzbd.zzjf>
	//   60  146:aload_1         
	//   61  147:invokeinterface #337 <Method void zzbq.zzb(Bundle)>
	//   62  152:return          
	}

	private final void zzau()
	{
		zzhp = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #238 <Field boolean zzhp>
		zzhf.zzfq.zzim = Collections.emptySet();
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field zzbd zzhf>
	//    5    9:getfield        #215 <Field zzav zzbd.zzfq>
	//    6   12:invokestatic    #342 <Method Set Collections.emptySet()>
	//    7   15:putfield        #345 <Field Set zzav.zzim>
		Iterator iterator = zzhm.iterator();
	//    8   18:aload_0         
	//    9   19:getfield        #63  <Field Set zzhm>
	//   10   22:invokeinterface #256 <Method Iterator Set.iterator()>
	//   11   27:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   28:aload_1         
	//   13   29:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            90
			com.google.android.gms.common.api.Api.AnyClientKey anyclientkey = (com.google.android.gms.common.api.Api.AnyClientKey)iterator.next();
	//   15   37:aload_1         
	//   16   38:invokeinterface #265 <Method Object Iterator.next()>
	//   17   43:checkcast       #267 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   18   46:astore_2        
			if(!zzhf.zzjb.containsKey(((Object) (anyclientkey))))
	//*  19   47:aload_0         
	//*  20   48:getfield        #70  <Field zzbd zzhf>
	//*  21   51:getfield        #270 <Field Map zzbd.zzjb>
	//*  22   54:aload_2         
	//*  23   55:invokeinterface #274 <Method boolean Map.containsKey(Object)>
	//*  24   60:ifne            28
				zzhf.zzjb.put(((Object) (anyclientkey)), ((Object) (new ConnectionResult(17, ((android.app.PendingIntent) (null))))));
	//   25   63:aload_0         
	//   26   64:getfield        #70  <Field zzbd zzhf>
	//   27   67:getfield        #270 <Field Map zzbd.zzjb>
	//   28   70:aload_2         
	//   29   71:new             #115 <Class ConnectionResult>
	//   30   74:dup             
	//   31   75:bipush          17
	//   32   77:aconst_null     
	//   33   78:invokespecial   #229 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   34   81:invokeinterface #349 <Method Object Map.put(Object, Object)>
	//   35   86:pop             
		} while(true);
	//   36   87:goto            28
	//   37   90:return          
	}

	private final void zzav()
	{
		ArrayList arraylist = (ArrayList)zzhu;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ArrayList zzhu>
	//    2    4:checkcast       #65  <Class ArrayList>
	//    3    7:astore_3        
		int j = arraylist.size();
	//    4    8:aload_3         
	//    5    9:invokevirtual   #351 <Method int ArrayList.size()>
	//    6   12:istore_2        
		for(int i = 0; i < j;)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:icmpge          46
		{
			Object obj = arraylist.get(i);
	//   12   20:aload_3         
	//   13   21:iload_1         
	//   14   22:invokevirtual   #354 <Method Object ArrayList.get(int)>
	//   15   25:astore          4
			i++;
	//   16   27:iload_1         
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:istore_1        
			((Future)obj).cancel(true);
	//   20   31:aload           4
	//   21   33:checkcast       #356 <Class Future>
	//   22   36:iconst_1        
	//   23   37:invokeinterface #360 <Method boolean Future.cancel(boolean)>
	//   24   42:pop             
		}

	//*  25   43:goto            15
		zzhu.clear();
	//   26   46:aload_0         
	//   27   47:getfield        #68  <Field ArrayList zzhu>
	//   28   50:invokevirtual   #363 <Method void ArrayList.clear()>
	//   29   53:return          
	}

	private final Set zzaw()
	{
		Object obj = ((Object) (zzgf));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ClientSettings zzgf>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return Collections.emptySet();
	//    5    9:invokestatic    #342 <Method Set Collections.emptySet()>
	//    6   12:areturn         
		obj = ((Object) (new HashSet(((java.util.Collection) (((ClientSettings) (obj)).getRequiredScopes())))));
	//    7   13:new             #60  <Class HashSet>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #369 <Method Set ClientSettings.getRequiredScopes()>
	//   11   21:invokespecial   #372 <Method void HashSet(java.util.Collection)>
	//   12   24:astore_1        
		Map map = zzgf.getOptionalApiSettings();
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field ClientSettings zzgf>
	//   15   29:invokevirtual   #376 <Method Map ClientSettings.getOptionalApiSettings()>
	//   16   32:astore_2        
		Iterator iterator = map.keySet().iterator();
	//   17   33:aload_2         
	//   18   34:invokeinterface #250 <Method Set Map.keySet()>
	//   19   39:invokeinterface #256 <Method Iterator Set.iterator()>
	//   20   44:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   21   45:aload_3         
	//   22   46:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   23   51:ifeq            109
			Api api = (Api)iterator.next();
	//   24   54:aload_3         
	//   25   55:invokeinterface #265 <Method Object Iterator.next()>
	//   26   60:checkcast       #378 <Class Api>
	//   27   63:astore          4
			if(!zzhf.zzjb.containsKey(((Object) (api.getClientKey()))))
	//*  28   65:aload_0         
	//*  29   66:getfield        #70  <Field zzbd zzhf>
	//*  30   69:getfield        #270 <Field Map zzbd.zzjb>
	//*  31   72:aload           4
	//*  32   74:invokevirtual   #382 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//*  33   77:invokeinterface #274 <Method boolean Map.containsKey(Object)>
	//*  34   82:ifne            45
				((Set) (obj)).addAll(((java.util.Collection) (((com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings)map.get(((Object) (api)))).mScopes)));
	//   35   85:aload_1         
	//   36   86:aload_2         
	//   37   87:aload           4
	//   38   89:invokeinterface #283 <Method Object Map.get(Object)>
	//   39   94:checkcast       #384 <Class com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings>
	//   40   97:getfield        #387 <Field Set com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings.mScopes>
	//   41  100:invokeinterface #391 <Method boolean Set.addAll(java.util.Collection)>
	//   42  105:pop             
		} while(true);
	//   43  106:goto            45
		return ((Set) (obj));
	//   44  109:aload_1         
	//   45  110:areturn         
	}

	static GoogleApiAvailabilityLight zzb(zzaj zzaj1)
	{
		return zzaj1.zzgk;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field GoogleApiAvailabilityLight zzgk>
	//    2    4:areturn         
	}

	private final void zzb(ConnectionResult connectionresult, Api api, boolean flag)
	{
		boolean flag2;
		int i;
label0:
		{
			i = api.zzj().getPriority();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #397 <Method com.google.android.gms.common.api.Api$BaseClientBuilder Api.zzj()>
	//    2    4:invokevirtual   #402 <Method int com.google.android.gms.common.api.Api$BaseClientBuilder.getPriority()>
	//    3    7:istore          7
			boolean flag3 = false;
	//    4    9:iconst_0        
	//    5   10:istore          6
			if(flag)
	//*   6   12:iload_3         
	//*   7   13:ifeq            58
			{
				boolean flag1;
				if(connectionresult.hasResolution() || zzgk.getErrorResolutionIntent(connectionresult.getErrorCode()) != null)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #405 <Method boolean ConnectionResult.hasResolution()>
	//*  10   20:ifeq            29
					flag1 = true;
	//   11   23:iconst_1        
	//   12   24:istore          4
				else
	//*  13   26:goto            49
	//*  14   29:aload_0         
	//*  15   30:getfield        #76  <Field GoogleApiAvailabilityLight zzgk>
	//*  16   33:aload_1         
	//*  17   34:invokevirtual   #408 <Method int ConnectionResult.getErrorCode()>
	//*  18   37:invokevirtual   #414 <Method android.content.Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(int)>
	//*  19   40:ifnull          46
	//*  20   43:goto            23
					flag1 = false;
	//   21   46:iconst_0        
	//   22   47:istore          4
				flag2 = flag3;
	//   23   49:iload           6
	//   24   51:istore          5
				if(!flag1)
					break label0;
	//   25   53:iload           4
	//   26   55:ifeq            81
			}
			if(zzgt != null)
	//*  27   58:aload_0         
	//*  28   59:getfield        #231 <Field ConnectionResult zzgt>
	//*  29   62:ifnull          78
			{
				flag2 = flag3;
	//   30   65:iload           6
	//   31   67:istore          5
				if(i >= zzhi)
					break label0;
	//   32   69:iload           7
	//   33   71:aload_0         
	//   34   72:getfield        #233 <Field int zzhi>
	//   35   75:icmpge          81
			}
			flag2 = true;
	//   36   78:iconst_1        
	//   37   79:istore          5
		}
		if(flag2)
	//*  38   81:iload           5
	//*  39   83:ifeq            97
		{
			zzgt = connectionresult;
	//   40   86:aload_0         
	//   41   87:aload_1         
	//   42   88:putfield        #231 <Field ConnectionResult zzgt>
			zzhi = i;
	//   43   91:aload_0         
	//   44   92:iload           7
	//   45   94:putfield        #233 <Field int zzhi>
		}
		zzhf.zzjb.put(((Object) (api.getClientKey())), ((Object) (connectionresult)));
	//   46   97:aload_0         
	//   47   98:getfield        #70  <Field zzbd zzhf>
	//   48  101:getfield        #270 <Field Map zzbd.zzjb>
	//   49  104:aload_2         
	//   50  105:invokevirtual   #382 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   51  108:aload_1         
	//   52  109:invokeinterface #349 <Method Object Map.put(Object, Object)>
	//   53  114:pop             
	//   54  115:return          
	}

	static boolean zzb(zzaj zzaj1, ConnectionResult connectionresult)
	{
		return zzaj1.zzd(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #187 <Method boolean zzd(ConnectionResult)>
	//    3    5:ireturn         
	}

	static Lock zzc(zzaj zzaj1)
	{
		return zzaj1.zzga;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Lock zzga>
	//    2    4:areturn         
	}

	static zzbd zzd(zzaj zzaj1)
	{
		return zzaj1.zzhf;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zzbd zzhf>
	//    2    4:areturn         
	}

	private final boolean zzd(ConnectionResult connectionresult)
	{
		return zzho && !connectionresult.hasResolution();
	//    0    0:aload_0         
	//    1    1:getfield        #421 <Field boolean zzho>
	//    2    4:ifeq            16
	//    3    7:aload_1         
	//    4    8:invokevirtual   #405 <Method boolean ConnectionResult.hasResolution()>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private final void zze(ConnectionResult connectionresult)
	{
		zzav();
	//    0    0:aload_0         
	//    1    1:invokespecial   #423 <Method void zzav()>
		zza(connectionresult.hasResolution() ^ true);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #405 <Method boolean ConnectionResult.hasResolution()>
	//    5    9:iconst_1        
	//    6   10:ixor            
	//    7   11:invokespecial   #326 <Method void zza(boolean)>
		zzhf.zzf(connectionresult);
	//    8   14:aload_0         
	//    9   15:getfield        #70  <Field zzbd zzhf>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #426 <Method void zzbd.zzf(ConnectionResult)>
		zzhf.zzjf.zzc(connectionresult);
	//   12   22:aload_0         
	//   13   23:getfield        #70  <Field zzbd zzhf>
	//   14   26:getfield        #332 <Field zzbq zzbd.zzjf>
	//   15   29:aload_1         
	//   16   30:invokeinterface #428 <Method void zzbq.zzc(ConnectionResult)>
	//   17   35:return          
	}

	private final boolean zze(int i)
	{
		if(zzhj != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field int zzhj>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          223
		{
			Log.w("GoogleApiClientConnecting", zzhf.zzfq.zzbb());
	//    4    8:ldc1            #149 <String "GoogleApiClientConnecting">
	//    5   10:aload_0         
	//    6   11:getfield        #70  <Field zzbd zzhf>
	//    7   14:getfield        #215 <Field zzav zzbd.zzfq>
	//    8   17:invokevirtual   #220 <Method String zzav.zzbb()>
	//    9   20:invokestatic    #224 <Method int Log.w(String, String)>
	//   10   23:pop             
			Object obj = ((Object) (String.valueOf(((Object) (this)))));
	//   11   24:aload_0         
	//   12   25:invokestatic    #132 <Method String String.valueOf(Object)>
	//   13   28:astore_3        
			Object obj1 = ((Object) (new StringBuilder(String.valueOf(obj).length() + 23)));
	//   14   29:new             #134 <Class StringBuilder>
	//   15   32:dup             
	//   16   33:aload_3         
	//   17   34:invokestatic    #132 <Method String String.valueOf(Object)>
	//   18   37:invokevirtual   #138 <Method int String.length()>
	//   19   40:bipush          23
	//   20   42:iadd            
	//   21   43:invokespecial   #141 <Method void StringBuilder(int)>
	//   22   46:astore          4
			((StringBuilder) (obj1)).append("Unexpected callback in ");
	//   23   48:aload           4
	//   24   50:ldc2            #430 <String "Unexpected callback in ">
	//   25   53:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
			((StringBuilder) (obj1)).append(((String) (obj)));
	//   27   57:aload           4
	//   28   59:aload_3         
	//   29   60:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
			Log.w("GoogleApiClientConnecting", ((StringBuilder) (obj1)).toString());
	//   31   64:ldc1            #149 <String "GoogleApiClientConnecting">
	//   32   66:aload           4
	//   33   68:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   34   71:invokestatic    #224 <Method int Log.w(String, String)>
	//   35   74:pop             
			int j = zzhk;
	//   36   75:aload_0         
	//   37   76:getfield        #209 <Field int zzhk>
	//   38   79:istore_2        
			obj = ((Object) (new StringBuilder(33)));
	//   39   80:new             #134 <Class StringBuilder>
	//   40   83:dup             
	//   41   84:bipush          33
	//   42   86:invokespecial   #141 <Method void StringBuilder(int)>
	//   43   89:astore_3        
			((StringBuilder) (obj)).append("mRemainingConnections=");
	//   44   90:aload_3         
	//   45   91:ldc2            #432 <String "mRemainingConnections=">
	//   46   94:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   47   97:pop             
			((StringBuilder) (obj)).append(j);
	//   48   98:aload_3         
	//   49   99:iload_2         
	//   50  100:invokevirtual   #435 <Method StringBuilder StringBuilder.append(int)>
	//   51  103:pop             
			Log.w("GoogleApiClientConnecting", ((StringBuilder) (obj)).toString());
	//   52  104:ldc1            #149 <String "GoogleApiClientConnecting">
	//   53  106:aload_3         
	//   54  107:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   55  110:invokestatic    #224 <Method int Log.w(String, String)>
	//   56  113:pop             
			obj = ((Object) (zzf(zzhj)));
	//   57  114:aload_0         
	//   58  115:getfield        #53  <Field int zzhj>
	//   59  118:invokestatic    #438 <Method String zzf(int)>
	//   60  121:astore_3        
			obj1 = ((Object) (zzf(i)));
	//   61  122:iload_1         
	//   62  123:invokestatic    #438 <Method String zzf(int)>
	//   63  126:astore          4
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 70 + String.valueOf(obj1).length());
	//   64  128:new             #134 <Class StringBuilder>
	//   65  131:dup             
	//   66  132:aload_3         
	//   67  133:invokestatic    #132 <Method String String.valueOf(Object)>
	//   68  136:invokevirtual   #138 <Method int String.length()>
	//   69  139:bipush          70
	//   70  141:iadd            
	//   71  142:aload           4
	//   72  144:invokestatic    #132 <Method String String.valueOf(Object)>
	//   73  147:invokevirtual   #138 <Method int String.length()>
	//   74  150:iadd            
	//   75  151:invokespecial   #141 <Method void StringBuilder(int)>
	//   76  154:astore          5
			stringbuilder.append("GoogleApiClient connecting is in step ");
	//   77  156:aload           5
	//   78  158:ldc2            #440 <String "GoogleApiClient connecting is in step ">
	//   79  161:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
			stringbuilder.append(((String) (obj)));
	//   81  165:aload           5
	//   82  167:aload_3         
	//   83  168:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   84  171:pop             
			stringbuilder.append(" but received callback for step ");
	//   85  172:aload           5
	//   86  174:ldc2            #442 <String " but received callback for step ">
	//   87  177:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   88  180:pop             
			stringbuilder.append(((String) (obj1)));
	//   89  181:aload           5
	//   90  183:aload           4
	//   91  185:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   92  188:pop             
			Log.wtf("GoogleApiClientConnecting", stringbuilder.toString(), ((Throwable) (new Exception())));
	//   93  189:ldc1            #149 <String "GoogleApiClientConnecting">
	//   94  191:aload           5
	//   95  193:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   96  196:new             #155 <Class Exception>
	//   97  199:dup             
	//   98  200:invokespecial   #156 <Method void Exception()>
	//   99  203:invokestatic    #162 <Method int Log.wtf(String, String, Throwable)>
	//  100  206:pop             
			zze(new ConnectionResult(8, ((android.app.PendingIntent) (null))));
	//  101  207:aload_0         
	//  102  208:new             #115 <Class ConnectionResult>
	//  103  211:dup             
	//  104  212:bipush          8
	//  105  214:aconst_null     
	//  106  215:invokespecial   #229 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//  107  218:invokespecial   #92  <Method void zze(ConnectionResult)>
			return false;
	//  108  221:iconst_0        
	//  109  222:ireturn         
		} else
		{
			return true;
	//  110  223:iconst_1        
	//  111  224:ireturn         
		}
	}

	static boolean zze(zzaj zzaj1)
	{
		return zzaj1.zzhp;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field boolean zzhp>
	//    2    4:ireturn         
	}

	static SignInClient zzf(zzaj zzaj1)
	{
		return zzaj1.zzhn;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field SignInClient zzhn>
	//    2    4:areturn         
	}

	private static String zzf(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 32
	//	               1 28
		default:
			return "UNKNOWN";
	//    2   24:ldc2            #446 <String "UNKNOWN">
	//    3   27:areturn         

		case 1: // '\001'
			return "STEP_GETTING_REMOTE_SERVICE";
	//    4   28:ldc2            #448 <String "STEP_GETTING_REMOTE_SERVICE">
	//    5   31:areturn         

		case 0: // '\0'
			return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
	//    6   32:ldc2            #450 <String "STEP_SERVICE_BINDINGS_AND_SIGN_IN">
	//    7   35:areturn         
		}
	}

	static Set zzg(zzaj zzaj1)
	{
		return zzaj1.zzaw();
	//    0    0:aload_0         
	//    1    1:invokespecial   #454 <Method Set zzaw()>
	//    2    4:areturn         
	}

	static IAccountAccessor zzh(zzaj zzaj1)
	{
		return zzaj1.zzhr;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field IAccountAccessor zzhr>
	//    2    4:areturn         
	}

	static void zzi(zzaj zzaj1)
	{
		zzaj1.zzau();
	//    0    0:aload_0         
	//    1    1:invokespecial   #190 <Method void zzau()>
	//    2    4:return          
	}

	static void zzj(zzaj zzaj1)
	{
		zzaj1.zzas();
	//    0    0:aload_0         
	//    1    1:invokespecial   #183 <Method void zzas()>
	//    2    4:return          
	}

	static boolean zzk(zzaj zzaj1)
	{
		return zzaj1.zzar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #276 <Method boolean zzar()>
	//    2    4:ireturn         
	}

	public final void begin()
	{
		zzhf.zzjb.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zzbd zzhf>
	//    2    4:getfield        #270 <Field Map zzbd.zzjb>
	//    3    7:invokeinterface #460 <Method void Map.clear()>
		zzhp = false;
	//    4   12:aload_0         
	//    5   13:iconst_0        
	//    6   14:putfield        #238 <Field boolean zzhp>
		zzgt = null;
	//    7   17:aload_0         
	//    8   18:aconst_null     
	//    9   19:putfield        #231 <Field ConnectionResult zzgt>
		zzhj = 0;
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #53  <Field int zzhj>
		zzho = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #421 <Field boolean zzho>
		zzhq = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #164 <Field boolean zzhq>
		zzhs = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #175 <Field boolean zzhs>
		HashMap hashmap = new HashMap();
	//   22   42:new             #462 <Class HashMap>
	//   23   45:dup             
	//   24   46:invokespecial   #463 <Method void HashMap()>
	//   25   49:astore          4
		Iterator iterator = zzgi.keySet().iterator();
	//   26   51:aload_0         
	//   27   52:getfield        #74  <Field Map zzgi>
	//   28   55:invokeinterface #250 <Method Set Map.keySet()>
	//   29   60:invokeinterface #256 <Method Iterator Set.iterator()>
	//   30   65:astore          5
		boolean flag = false;
	//   31   67:iconst_0        
	//   32   68:istore_1        
		boolean flag2;
		Api api;
		com.google.android.gms.common.api.Api.Client client;
		for(; iterator.hasNext(); ((Map) (hashmap)).put(((Object) (client)), ((Object) (new zzal(this, api, flag2)))))
	//*  33   69:aload           5
	//*  34   71:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*  35   76:ifeq            220
		{
			api = (Api)iterator.next();
	//   36   79:aload           5
	//   37   81:invokeinterface #265 <Method Object Iterator.next()>
	//   38   86:checkcast       #378 <Class Api>
	//   39   89:astore          6
			client = (com.google.android.gms.common.api.Api.Client)zzhf.zzil.get(((Object) (api.getClientKey())));
	//   40   91:aload_0         
	//   41   92:getfield        #70  <Field zzbd zzhf>
	//   42   95:getfield        #241 <Field Map zzbd.zzil>
	//   43   98:aload           6
	//   44  100:invokevirtual   #382 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   45  103:invokeinterface #283 <Method Object Map.get(Object)>
	//   46  108:checkcast       #285 <Class com.google.android.gms.common.api.Api$Client>
	//   47  111:astore          7
			boolean flag1;
			if(api.zzj().getPriority() == 1)
	//*  48  113:aload           6
	//*  49  115:invokevirtual   #397 <Method com.google.android.gms.common.api.Api$BaseClientBuilder Api.zzj()>
	//*  50  118:invokevirtual   #402 <Method int com.google.android.gms.common.api.Api$BaseClientBuilder.getPriority()>
	//*  51  121:iconst_1        
	//*  52  122:icmpne          130
				flag1 = true;
	//   53  125:iconst_1        
	//   54  126:istore_2        
			else
	//*  55  127:goto            132
				flag1 = false;
	//   56  130:iconst_0        
	//   57  131:istore_2        
			flag |= flag1;
	//   58  132:iload_1         
	//   59  133:iload_2         
	//   60  134:ior             
	//   61  135:istore_1        
			flag2 = ((Boolean)zzgi.get(((Object) (api)))).booleanValue();
	//   62  136:aload_0         
	//   63  137:getfield        #74  <Field Map zzgi>
	//   64  140:aload           6
	//   65  142:invokeinterface #283 <Method Object Map.get(Object)>
	//   66  147:checkcast       #465 <Class Boolean>
	//   67  150:invokevirtual   #468 <Method boolean Boolean.booleanValue()>
	//   68  153:istore_3        
			if(!client.requiresSignIn())
				continue;
	//   69  154:aload           7
	//   70  156:invokeinterface #471 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//   71  161:ifeq            196
			zzhp = true;
	//   72  164:aload_0         
	//   73  165:iconst_1        
	//   74  166:putfield        #238 <Field boolean zzhp>
			if(flag2)
	//*  75  169:iload_3         
	//*  76  170:ifeq            191
				zzhm.add(((Object) (api.getClientKey())));
	//   77  173:aload_0         
	//   78  174:getfield        #63  <Field Set zzhm>
	//   79  177:aload           6
	//   80  179:invokevirtual   #382 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   81  182:invokeinterface #472 <Method boolean Set.add(Object)>
	//   82  187:pop             
			else
	//*  83  188:goto            196
				zzho = false;
	//   84  191:aload_0         
	//   85  192:iconst_0        
	//   86  193:putfield        #421 <Field boolean zzho>
		}

	//   87  196:aload           4
	//   88  198:aload           7
	//   89  200:new             #474 <Class zzal>
	//   90  203:dup             
	//   91  204:aload_0         
	//   92  205:aload           6
	//   93  207:iload_3         
	//   94  208:invokespecial   #477 <Method void zzal(zzaj, Api, boolean)>
	//   95  211:invokeinterface #349 <Method Object Map.put(Object, Object)>
	//   96  216:pop             
	//*  97  217:goto            69
		if(flag)
	//*  98  220:iload_1         
	//*  99  221:ifeq            229
			zzhp = false;
	//  100  224:aload_0         
	//  101  225:iconst_0        
	//  102  226:putfield        #238 <Field boolean zzhp>
		if(zzhp)
	//* 103  229:aload_0         
	//* 104  230:getfield        #238 <Field boolean zzhp>
	//* 105  233:ifeq            324
		{
			zzgf.setClientSessionId(Integer.valueOf(System.identityHashCode(((Object) (zzhf.zzfq)))));
	//  106  236:aload_0         
	//  107  237:getfield        #72  <Field ClientSettings zzgf>
	//  108  240:aload_0         
	//  109  241:getfield        #70  <Field zzbd zzhf>
	//  110  244:getfield        #215 <Field zzav zzbd.zzfq>
	//  111  247:invokestatic    #483 <Method int System.identityHashCode(Object)>
	//  112  250:invokestatic    #488 <Method Integer Integer.valueOf(int)>
	//  113  253:invokevirtual   #492 <Method void ClientSettings.setClientSessionId(Integer)>
			zzas zzas1 = new zzas(this, ((zzak) (null)));
	//  114  256:new             #494 <Class zzas>
	//  115  259:dup             
	//  116  260:aload_0         
	//  117  261:aconst_null     
	//  118  262:invokespecial   #497 <Method void zzas(zzaj, zzak)>
	//  119  265:astore          5
			com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder = zzdh;
	//  120  267:aload_0         
	//  121  268:getfield        #78  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
	//  122  271:astore          6
			Context context = mContext;
	//  123  273:aload_0         
	//  124  274:getfield        #82  <Field Context mContext>
	//  125  277:astore          7
			android.os.Looper looper = ((GoogleApiClient) (zzhf.zzfq)).getLooper();
	//  126  279:aload_0         
	//  127  280:getfield        #70  <Field zzbd zzhf>
	//  128  283:getfield        #215 <Field zzav zzbd.zzfq>
	//  129  286:invokevirtual   #503 <Method android.os.Looper GoogleApiClient.getLooper()>
	//  130  289:astore          8
			ClientSettings clientsettings = zzgf;
	//  131  291:aload_0         
	//  132  292:getfield        #72  <Field ClientSettings zzgf>
	//  133  295:astore          9
			zzhn = (SignInClient)abstractclientbuilder.buildClient(context, looper, clientsettings, ((Object) (clientsettings.getSignInOptions())), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (zzas1)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (zzas1)));
	//  134  297:aload_0         
	//  135  298:aload           6
	//  136  300:aload           7
	//  137  302:aload           8
	//  138  304:aload           9
	//  139  306:aload           9
	//  140  308:invokevirtual   #507 <Method com.google.android.gms.signin.SignInOptions ClientSettings.getSignInOptions()>
	//  141  311:aload           5
	//  142  313:aload           5
	//  143  315:invokevirtual   #513 <Method com.google.android.gms.common.api.Api$Client com.google.android.gms.common.api.Api$AbstractClientBuilder.buildClient(Context, android.os.Looper, ClientSettings, Object, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//  144  318:checkcast       #196 <Class SignInClient>
	//  145  321:putfield        #194 <Field SignInClient zzhn>
		}
		zzhk = zzhf.zzil.size();
	//  146  324:aload_0         
	//  147  325:aload_0         
	//  148  326:getfield        #70  <Field zzbd zzhf>
	//  149  329:getfield        #241 <Field Map zzbd.zzil>
	//  150  332:invokeinterface #246 <Method int Map.size()>
	//  151  337:putfield        #209 <Field int zzhk>
		zzhu.add(((Object) (zzbg.zzbe().submit(((Runnable) (new zzam(this, ((Map) (hashmap)))))))));
	//  152  340:aload_0         
	//  153  341:getfield        #68  <Field ArrayList zzhu>
	//  154  344:invokestatic    #297 <Method ExecutorService zzbg.zzbe()>
	//  155  347:new             #515 <Class zzam>
	//  156  350:dup             
	//  157  351:aload_0         
	//  158  352:aload           4
	//  159  354:invokespecial   #518 <Method void zzam(zzaj, Map)>
	//  160  357:invokeinterface #308 <Method Future ExecutorService.submit(Runnable)>
	//  161  362:invokevirtual   #288 <Method boolean ArrayList.add(Object)>
	//  162  365:pop             
	//  163  366:return          
	}

	public final void connect()
	{
	//    0    0:return          
	}

	public final boolean disconnect()
	{
		zzav();
	//    0    0:aload_0         
	//    1    1:invokespecial   #423 <Method void zzav()>
		zza(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #326 <Method void zza(boolean)>
		zzhf.zzf(((ConnectionResult) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field zzbd zzhf>
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #426 <Method void zzbd.zzf(ConnectionResult)>
		return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		zzhf.zzfq.zzgo.add(((Object) (apimethodimpl)));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zzbd zzhf>
	//    2    4:getfield        #215 <Field zzav zzbd.zzfq>
	//    3    7:getfield        #525 <Field Queue zzav.zzgo>
	//    4   10:aload_1         
	//    5   11:invokeinterface #528 <Method boolean Queue.add(Object)>
	//    6   16:pop             
		return apimethodimpl;
	//    7   17:aload_1         
	//    8   18:areturn         
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//    0    0:new             #531 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #533 <String "GoogleApiClient is not connected yet.">
	//    3    7:invokespecial   #536 <Method void IllegalStateException(String)>
	//    4   10:athrow          
	}

	public final void onConnected(Bundle bundle)
	{
		if(!zze(1))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:invokespecial   #107 <Method boolean zze(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		if(bundle != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			zzhl.putAll(bundle);
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field Bundle zzhl>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #541 <Method void Bundle.putAll(Bundle)>
		if(zzar())
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #276 <Method boolean zzar()>
	//*  13   25:ifeq            32
			zzat();
	//   14   28:aload_0         
	//   15   29:invokespecial   #279 <Method void zzat()>
	//   16   32:return          
	}

	public final void onConnectionSuspended(int i)
	{
		zze(new ConnectionResult(8, ((android.app.PendingIntent) (null))));
	//    0    0:aload_0         
	//    1    1:new             #115 <Class ConnectionResult>
	//    2    4:dup             
	//    3    5:bipush          8
	//    4    7:aconst_null     
	//    5    8:invokespecial   #229 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//    6   11:invokespecial   #92  <Method void zze(ConnectionResult)>
	//    7   14:return          
	}

	public final void zza(ConnectionResult connectionresult, Api api, boolean flag)
	{
		if(!zze(1))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:invokespecial   #107 <Method boolean zze(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		zzb(connectionresult, api, flag);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:invokespecial   #97  <Method void zzb(ConnectionResult, Api, boolean)>
		if(zzar())
	//*  10   16:aload_0         
	//*  11   17:invokespecial   #276 <Method boolean zzar()>
	//*  12   20:ifeq            27
			zzat();
	//   13   23:aload_0         
	//   14   24:invokespecial   #279 <Method void zzat()>
	//   15   27:return          
	}

	private final Context mContext;
	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zzdh;
	private final Lock zzga;
	private final ClientSettings zzgf;
	private final Map zzgi;
	private final GoogleApiAvailabilityLight zzgk;
	private ConnectionResult zzgt;
	private final zzbd zzhf;
	private int zzhi;
	private int zzhj;
	private int zzhk;
	private final Bundle zzhl = new Bundle();
	private final Set zzhm = new HashSet();
	private SignInClient zzhn;
	private boolean zzho;
	private boolean zzhp;
	private boolean zzhq;
	private IAccountAccessor zzhr;
	private boolean zzhs;
	private boolean zzht;
	private ArrayList zzhu;
}
