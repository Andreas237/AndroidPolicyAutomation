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
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zad;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabd, zabe, zaaw, zabh, 
//			zaaq, zaal, zabt, zaam, 
//			zaat, zaan

public final class zaak
	implements zabd
{

	public zaak(zabe zabe1, ClientSettings clientsettings, Map map, GoogleApiAvailabilityLight googleapiavailabilitylight, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, Lock lock, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		zafw = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #53  <Field int zafw>
	//    5    9:aload_0         
	//    6   10:new             #55  <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #56  <Method void Bundle()>
	//    9   17:putfield        #58  <Field Bundle zafy>
	//   10   20:aload_0         
	//   11   21:new             #60  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #61  <Method void HashSet()>
	//   14   28:putfield        #63  <Field Set zafz>
		zagh = new ArrayList();
	//   15   31:aload_0         
	//   16   32:new             #65  <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #66  <Method void ArrayList()>
	//   19   39:putfield        #68  <Field ArrayList zagh>
		zafs = zabe1;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:putfield        #70  <Field zabe zafs>
		zaes = clientsettings;
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:putfield        #72  <Field ClientSettings zaes>
		zaev = map;
	//   26   52:aload_0         
	//   27   53:aload_3         
	//   28   54:putfield        #74  <Field Map zaev>
		zaex = googleapiavailabilitylight;
	//   29   57:aload_0         
	//   30   58:aload           4
	//   31   60:putfield        #76  <Field GoogleApiAvailabilityLight zaex>
		zacd = abstractclientbuilder;
	//   32   63:aload_0         
	//   33   64:aload           5
	//   34   66:putfield        #78  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
		zaen = lock;
	//   35   69:aload_0         
	//   36   70:aload           6
	//   37   72:putfield        #80  <Field Lock zaen>
		mContext = context;
	//   38   75:aload_0         
	//   39   76:aload           7
	//   40   78:putfield        #82  <Field Context mContext>
	//   41   81:return          
	}

	static Context zaa(zaak zaak1)
	{
		return zaak1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Context mContext>
	//    2    4:areturn         
	}

	static void zaa(zaak zaak1, ConnectionResult connectionresult)
	{
		zaak1.zae(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void zae(ConnectionResult)>
	//    3    5:return          
	}

	static void zaa(zaak zaak1, ConnectionResult connectionresult, Api api, boolean flag)
	{
		zaak1.zab(connectionresult, api, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #97  <Method void zab(ConnectionResult, Api, boolean)>
	//    5    7:return          
	}

	static void zaa(zaak zaak1, zaj zaj1)
	{
		zaak1.zaa(zaj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void zaa(zaj)>
	//    3    5:return          
	}

	private final void zaa(zaj zaj1)
	{
		if(!zac(0))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokespecial   #108 <Method boolean zac(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		Object obj = ((Object) (zaj1.getConnectionResult()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #114 <Method ConnectionResult zaj.getConnectionResult()>
	//    7   13:astore_2        
		if(((ConnectionResult) (obj)).isSuccess())
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #120 <Method boolean ConnectionResult.isSuccess()>
	//*  10   18:ifeq            131
		{
			obj = ((Object) (zaj1.zacw()));
	//   11   21:aload_1         
	//   12   22:invokevirtual   #124 <Method ResolveAccountResponse zaj.zacw()>
	//   13   25:astore_2        
			zaj1 = ((zaj) (((ResolveAccountResponse) (obj)).getConnectionResult()));
	//   14   26:aload_2         
	//   15   27:invokevirtual   #127 <Method ConnectionResult ResolveAccountResponse.getConnectionResult()>
	//   16   30:astore_1        
			if(!((ConnectionResult) (zaj1)).isSuccess())
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #120 <Method boolean ConnectionResult.isSuccess()>
	//*  19   35:ifne            97
			{
				obj = ((Object) (String.valueOf(((Object) (zaj1)))));
	//   20   38:aload_1         
	//   21   39:invokestatic    #133 <Method String String.valueOf(Object)>
	//   22   42:astore_2        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 48);
	//   23   43:new             #135 <Class StringBuilder>
	//   24   46:dup             
	//   25   47:aload_2         
	//   26   48:invokestatic    #133 <Method String String.valueOf(Object)>
	//   27   51:invokevirtual   #139 <Method int String.length()>
	//   28   54:bipush          48
	//   29   56:iadd            
	//   30   57:invokespecial   #142 <Method void StringBuilder(int)>
	//   31   60:astore_3        
				stringbuilder.append("Sign-in succeeded with resolve account failure: ");
	//   32   61:aload_3         
	//   33   62:ldc1            #144 <String "Sign-in succeeded with resolve account failure: ">
	//   34   64:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
				stringbuilder.append(((String) (obj)));
	//   36   68:aload_3         
	//   37   69:aload_2         
	//   38   70:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   39   73:pop             
				Log.wtf("GoogleApiClientConnecting", stringbuilder.toString(), ((Throwable) (new Exception())));
	//   40   74:ldc1            #150 <String "GoogleApiClientConnecting">
	//   41   76:aload_3         
	//   42   77:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   43   80:new             #156 <Class Exception>
	//   44   83:dup             
	//   45   84:invokespecial   #157 <Method void Exception()>
	//   46   87:invokestatic    #163 <Method int Log.wtf(String, String, Throwable)>
	//   47   90:pop             
				zae(((ConnectionResult) (zaj1)));
	//   48   91:aload_0         
	//   49   92:aload_1         
	//   50   93:invokespecial   #92  <Method void zae(ConnectionResult)>
				return;
	//   51   96:return          
			} else
			{
				zagd = true;
	//   52   97:aload_0         
	//   53   98:iconst_1        
	//   54   99:putfield        #165 <Field boolean zagd>
				zage = ((ResolveAccountResponse) (obj)).getAccountAccessor();
	//   55  102:aload_0         
	//   56  103:aload_2         
	//   57  104:invokevirtual   #169 <Method IAccountAccessor ResolveAccountResponse.getAccountAccessor()>
	//   58  107:putfield        #171 <Field IAccountAccessor zage>
				zagf = ((ResolveAccountResponse) (obj)).getSaveDefaultAccount();
	//   59  110:aload_0         
	//   60  111:aload_2         
	//   61  112:invokevirtual   #174 <Method boolean ResolveAccountResponse.getSaveDefaultAccount()>
	//   62  115:putfield        #176 <Field boolean zagf>
				zagg = ((ResolveAccountResponse) (obj)).isFromCrossClientAuth();
	//   63  118:aload_0         
	//   64  119:aload_2         
	//   65  120:invokevirtual   #179 <Method boolean ResolveAccountResponse.isFromCrossClientAuth()>
	//   66  123:putfield        #181 <Field boolean zagg>
				zaap();
	//   67  126:aload_0         
	//   68  127:invokespecial   #184 <Method void zaap()>
				return;
	//   69  130:return          
			}
		}
		if(zad(((ConnectionResult) (obj))))
	//*  70  131:aload_0         
	//*  71  132:aload_2         
	//*  72  133:invokespecial   #188 <Method boolean zad(ConnectionResult)>
	//*  73  136:ifeq            148
		{
			zaar();
	//   74  139:aload_0         
	//   75  140:invokespecial   #191 <Method void zaar()>
			zaap();
	//   76  143:aload_0         
	//   77  144:invokespecial   #184 <Method void zaap()>
			return;
	//   78  147:return          
		} else
		{
			zae(((ConnectionResult) (obj)));
	//   79  148:aload_0         
	//   80  149:aload_2         
	//   81  150:invokespecial   #92  <Method void zae(ConnectionResult)>
			return;
	//   82  153:return          
		}
	}

	static boolean zaa(zaak zaak1, int i)
	{
		return zaak1.zac(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #108 <Method boolean zac(int)>
	//    3    5:ireturn         
	}

	private final boolean zaao()
	{
		zafx = zafx - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #196 <Field int zafx>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #196 <Field int zafx>
		int i = zafx;
	//    6   10:aload_0         
	//    7   11:getfield        #196 <Field int zafx>
	//    8   14:istore_1        
		if(i > 0)
	//*   9   15:iload_1         
	//*  10   16:ifle            21
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		if(i < 0)
	//*  13   21:iload_1         
	//*  14   22:ifge            72
		{
			Log.w("GoogleApiClientConnecting", zafs.zaed.zaay());
	//   15   25:ldc1            #150 <String "GoogleApiClientConnecting">
	//   16   27:aload_0         
	//   17   28:getfield        #70  <Field zabe zafs>
	//   18   31:getfield        #202 <Field zaaw zabe.zaed>
	//   19   34:invokevirtual   #207 <Method String zaaw.zaay()>
	//   20   37:invokestatic    #211 <Method int Log.w(String, String)>
	//   21   40:pop             
			Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", ((Throwable) (new Exception())));
	//   22   41:ldc1            #150 <String "GoogleApiClientConnecting">
	//   23   43:ldc1            #213 <String "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.">
	//   24   45:new             #156 <Class Exception>
	//   25   48:dup             
	//   26   49:invokespecial   #157 <Method void Exception()>
	//   27   52:invokestatic    #163 <Method int Log.wtf(String, String, Throwable)>
	//   28   55:pop             
			zae(new ConnectionResult(8, ((android.app.PendingIntent) (null))));
	//   29   56:aload_0         
	//   30   57:new             #116 <Class ConnectionResult>
	//   31   60:dup             
	//   32   61:bipush          8
	//   33   63:aconst_null     
	//   34   64:invokespecial   #216 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   35   67:invokespecial   #92  <Method void zae(ConnectionResult)>
			return false;
	//   36   70:iconst_0        
	//   37   71:ireturn         
		}
		ConnectionResult connectionresult = zafg;
	//   38   72:aload_0         
	//   39   73:getfield        #218 <Field ConnectionResult zafg>
	//   40   76:astore_2        
		if(connectionresult != null)
	//*  41   77:aload_2         
	//*  42   78:ifnull          99
		{
			zafs.zahr = zafv;
	//   43   81:aload_0         
	//   44   82:getfield        #70  <Field zabe zafs>
	//   45   85:aload_0         
	//   46   86:getfield        #220 <Field int zafv>
	//   47   89:putfield        #223 <Field int zabe.zahr>
			zae(connectionresult);
	//   48   92:aload_0         
	//   49   93:aload_2         
	//   50   94:invokespecial   #92  <Method void zae(ConnectionResult)>
			return false;
	//   51   97:iconst_0        
	//   52   98:ireturn         
		} else
		{
			return true;
	//   53   99:iconst_1        
	//   54  100:ireturn         
		}
	}

	private final void zaap()
	{
		if(zafx != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field int zafx>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!zagc || zagd)
	//*   4    8:aload_0         
	//*   5    9:getfield        #225 <Field boolean zagc>
	//*   6   12:ifeq            22
	//*   7   15:aload_0         
	//*   8   16:getfield        #165 <Field boolean zagd>
	//*   9   19:ifeq            174
		{
			ArrayList arraylist = new ArrayList();
	//   10   22:new             #65  <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #66  <Method void ArrayList()>
	//   13   29:astore_1        
			zafw = 1;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #53  <Field int zafw>
			zafx = zafs.zagy.size();
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #70  <Field zabe zafs>
	//   20   40:getfield        #228 <Field Map zabe.zagy>
	//   21   43:invokeinterface #233 <Method int Map.size()>
	//   22   48:putfield        #196 <Field int zafx>
			Iterator iterator = zafs.zagy.keySet().iterator();
	//   23   51:aload_0         
	//   24   52:getfield        #70  <Field zabe zafs>
	//   25   55:getfield        #228 <Field Map zabe.zagy>
	//   26   58:invokeinterface #237 <Method Set Map.keySet()>
	//   27   63:invokeinterface #243 <Method Iterator Set.iterator()>
	//   28   68:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   29   69:aload_2         
	//   30   70:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//   31   75:ifeq            142
				com.google.android.gms.common.api.Api.AnyClientKey anyclientkey = (com.google.android.gms.common.api.Api.AnyClientKey)iterator.next();
	//   32   78:aload_2         
	//   33   79:invokeinterface #252 <Method Object Iterator.next()>
	//   34   84:checkcast       #254 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   35   87:astore_3        
				if(zafs.zaho.containsKey(((Object) (anyclientkey))))
	//*  36   88:aload_0         
	//*  37   89:getfield        #70  <Field zabe zafs>
	//*  38   92:getfield        #257 <Field Map zabe.zaho>
	//*  39   95:aload_3         
	//*  40   96:invokeinterface #261 <Method boolean Map.containsKey(Object)>
	//*  41  101:ifeq            118
				{
					if(zaao())
	//*  42  104:aload_0         
	//*  43  105:invokespecial   #263 <Method boolean zaao()>
	//*  44  108:ifeq            69
						zaaq();
	//   45  111:aload_0         
	//   46  112:invokespecial   #266 <Method void zaaq()>
				} else
	//*  47  115:goto            69
				{
					arraylist.add(((Object) ((com.google.android.gms.common.api.Api.Client)zafs.zagy.get(((Object) (anyclientkey))))));
	//   48  118:aload_1         
	//   49  119:aload_0         
	//   50  120:getfield        #70  <Field zabe zafs>
	//   51  123:getfield        #228 <Field Map zabe.zagy>
	//   52  126:aload_3         
	//   53  127:invokeinterface #270 <Method Object Map.get(Object)>
	//   54  132:checkcast       #272 <Class com.google.android.gms.common.api.Api$Client>
	//   55  135:invokevirtual   #275 <Method boolean ArrayList.add(Object)>
	//   56  138:pop             
				}
			} while(true);
	//   57  139:goto            69
			if(!arraylist.isEmpty())
	//*  58  142:aload_1         
	//*  59  143:invokevirtual   #278 <Method boolean ArrayList.isEmpty()>
	//*  60  146:ifne            174
				zagh.add(((Object) (zabh.zabb().submit(((Runnable) (new zaaq(this, arraylist)))))));
	//   61  149:aload_0         
	//   62  150:getfield        #68  <Field ArrayList zagh>
	//   63  153:invokestatic    #284 <Method ExecutorService zabh.zabb()>
	//   64  156:new             #286 <Class zaaq>
	//   65  159:dup             
	//   66  160:aload_0         
	//   67  161:aload_1         
	//   68  162:invokespecial   #289 <Method void zaaq(zaak, ArrayList)>
	//   69  165:invokeinterface #295 <Method Future ExecutorService.submit(Runnable)>
	//   70  170:invokevirtual   #275 <Method boolean ArrayList.add(Object)>
	//   71  173:pop             
		}
	//   72  174:return          
	}

	private final void zaaq()
	{
		zafs.zaba();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zabe zafs>
	//    2    4:invokevirtual   #298 <Method void zabe.zaba()>
		zabh.zabb().execute(((Runnable) (new zaal(this))));
	//    3    7:invokestatic    #284 <Method ExecutorService zabh.zabb()>
	//    4   10:new             #300 <Class zaal>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #303 <Method void zaal(zaak)>
	//    8   18:invokeinterface #307 <Method void ExecutorService.execute(Runnable)>
		Object obj = ((Object) (zaga));
	//    9   23:aload_0         
	//   10   24:getfield        #309 <Field zad zaga>
	//   11   27:astore_1        
		if(obj != null)
	//*  12   28:aload_1         
	//*  13   29:ifnull          58
		{
			if(zagf)
	//*  14   32:aload_0         
	//*  15   33:getfield        #176 <Field boolean zagf>
	//*  16   36:ifeq            53
				((zad) (obj)).zaa(zage, zagg);
	//   17   39:aload_1         
	//   18   40:aload_0         
	//   19   41:getfield        #171 <Field IAccountAccessor zage>
	//   20   44:aload_0         
	//   21   45:getfield        #181 <Field boolean zagg>
	//   22   48:invokeinterface #314 <Method void zad.zaa(IAccountAccessor, boolean)>
			zab(false);
	//   23   53:aload_0         
	//   24   54:iconst_0        
	//   25   55:invokespecial   #317 <Method void zab(boolean)>
		}
		com.google.android.gms.common.api.Api.AnyClientKey anyclientkey;
		for(obj = ((Object) (zafs.zaho.keySet().iterator())); ((Iterator) (obj)).hasNext(); ((com.google.android.gms.common.api.Api.Client)zafs.zagy.get(((Object) (anyclientkey)))).disconnect())
	//*  26   58:aload_0         
	//*  27   59:getfield        #70  <Field zabe zafs>
	//*  28   62:getfield        #257 <Field Map zabe.zaho>
	//*  29   65:invokeinterface #237 <Method Set Map.keySet()>
	//*  30   70:invokeinterface #243 <Method Iterator Set.iterator()>
	//*  31   75:astore_1        
	//*  32   76:aload_1         
	//*  33   77:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//*  34   82:ifeq            119
			anyclientkey = (com.google.android.gms.common.api.Api.AnyClientKey)((Iterator) (obj)).next();
	//   35   85:aload_1         
	//   36   86:invokeinterface #252 <Method Object Iterator.next()>
	//   37   91:checkcast       #254 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   38   94:astore_2        

	//   39   95:aload_0         
	//   40   96:getfield        #70  <Field zabe zafs>
	//   41   99:getfield        #228 <Field Map zabe.zagy>
	//   42  102:aload_2         
	//   43  103:invokeinterface #270 <Method Object Map.get(Object)>
	//   44  108:checkcast       #272 <Class com.google.android.gms.common.api.Api$Client>
	//   45  111:invokeinterface #320 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
	//*  46  116:goto            76
		if(zafy.isEmpty())
	//*  47  119:aload_0         
	//*  48  120:getfield        #58  <Field Bundle zafy>
	//*  49  123:invokevirtual   #321 <Method boolean Bundle.isEmpty()>
	//*  50  126:ifeq            134
			obj = null;
	//   51  129:aconst_null     
	//   52  130:astore_1        
		else
	//*  53  131:goto            139
			obj = ((Object) (zafy));
	//   54  134:aload_0         
	//   55  135:getfield        #58  <Field Bundle zafy>
	//   56  138:astore_1        
		zafs.zahs.zab(((Bundle) (obj)));
	//   57  139:aload_0         
	//   58  140:getfield        #70  <Field zabe zafs>
	//   59  143:getfield        #325 <Field zabt zabe.zahs>
	//   60  146:aload_1         
	//   61  147:invokeinterface #330 <Method void zabt.zab(Bundle)>
	//   62  152:return          
	}

	private final void zaar()
	{
		zagc = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #225 <Field boolean zagc>
		zafs.zaed.zagz = Collections.emptySet();
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field zabe zafs>
	//    5    9:getfield        #202 <Field zaaw zabe.zaed>
	//    6   12:invokestatic    #335 <Method Set Collections.emptySet()>
	//    7   15:putfield        #338 <Field Set zaaw.zagz>
		Iterator iterator = zafz.iterator();
	//    8   18:aload_0         
	//    9   19:getfield        #63  <Field Set zafz>
	//   10   22:invokeinterface #243 <Method Iterator Set.iterator()>
	//   11   27:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   28:aload_1         
	//   13   29:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            90
			com.google.android.gms.common.api.Api.AnyClientKey anyclientkey = (com.google.android.gms.common.api.Api.AnyClientKey)iterator.next();
	//   15   37:aload_1         
	//   16   38:invokeinterface #252 <Method Object Iterator.next()>
	//   17   43:checkcast       #254 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   18   46:astore_2        
			if(!zafs.zaho.containsKey(((Object) (anyclientkey))))
	//*  19   47:aload_0         
	//*  20   48:getfield        #70  <Field zabe zafs>
	//*  21   51:getfield        #257 <Field Map zabe.zaho>
	//*  22   54:aload_2         
	//*  23   55:invokeinterface #261 <Method boolean Map.containsKey(Object)>
	//*  24   60:ifne            28
				zafs.zaho.put(((Object) (anyclientkey)), ((Object) (new ConnectionResult(17, ((android.app.PendingIntent) (null))))));
	//   25   63:aload_0         
	//   26   64:getfield        #70  <Field zabe zafs>
	//   27   67:getfield        #257 <Field Map zabe.zaho>
	//   28   70:aload_2         
	//   29   71:new             #116 <Class ConnectionResult>
	//   30   74:dup             
	//   31   75:bipush          17
	//   32   77:aconst_null     
	//   33   78:invokespecial   #216 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   34   81:invokeinterface #342 <Method Object Map.put(Object, Object)>
	//   35   86:pop             
		} while(true);
	//   36   87:goto            28
	//   37   90:return          
	}

	private final void zaas()
	{
		ArrayList arraylist = (ArrayList)zagh;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ArrayList zagh>
	//    2    4:checkcast       #65  <Class ArrayList>
	//    3    7:astore_3        
		int j = arraylist.size();
	//    4    8:aload_3         
	//    5    9:invokevirtual   #344 <Method int ArrayList.size()>
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
	//   14   22:invokevirtual   #347 <Method Object ArrayList.get(int)>
	//   15   25:astore          4
			i++;
	//   16   27:iload_1         
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:istore_1        
			((Future)obj).cancel(true);
	//   20   31:aload           4
	//   21   33:checkcast       #349 <Class Future>
	//   22   36:iconst_1        
	//   23   37:invokeinterface #353 <Method boolean Future.cancel(boolean)>
	//   24   42:pop             
		}

	//*  25   43:goto            15
		zagh.clear();
	//   26   46:aload_0         
	//   27   47:getfield        #68  <Field ArrayList zagh>
	//   28   50:invokevirtual   #356 <Method void ArrayList.clear()>
	//   29   53:return          
	}

	private final Set zaat()
	{
		Object obj = ((Object) (zaes));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ClientSettings zaes>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return Collections.emptySet();
	//    5    9:invokestatic    #335 <Method Set Collections.emptySet()>
	//    6   12:areturn         
		obj = ((Object) (new HashSet(((java.util.Collection) (((ClientSettings) (obj)).getRequiredScopes())))));
	//    7   13:new             #60  <Class HashSet>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #362 <Method Set ClientSettings.getRequiredScopes()>
	//   11   21:invokespecial   #365 <Method void HashSet(java.util.Collection)>
	//   12   24:astore_1        
		Map map = zaes.getOptionalApiSettings();
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field ClientSettings zaes>
	//   15   29:invokevirtual   #369 <Method Map ClientSettings.getOptionalApiSettings()>
	//   16   32:astore_2        
		Iterator iterator = map.keySet().iterator();
	//   17   33:aload_2         
	//   18   34:invokeinterface #237 <Method Set Map.keySet()>
	//   19   39:invokeinterface #243 <Method Iterator Set.iterator()>
	//   20   44:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   21   45:aload_3         
	//   22   46:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//   23   51:ifeq            109
			Api api = (Api)iterator.next();
	//   24   54:aload_3         
	//   25   55:invokeinterface #252 <Method Object Iterator.next()>
	//   26   60:checkcast       #371 <Class Api>
	//   27   63:astore          4
			if(!zafs.zaho.containsKey(((Object) (api.getClientKey()))))
	//*  28   65:aload_0         
	//*  29   66:getfield        #70  <Field zabe zafs>
	//*  30   69:getfield        #257 <Field Map zabe.zaho>
	//*  31   72:aload           4
	//*  32   74:invokevirtual   #375 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//*  33   77:invokeinterface #261 <Method boolean Map.containsKey(Object)>
	//*  34   82:ifne            45
				((Set) (obj)).addAll(((java.util.Collection) (((com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings)map.get(((Object) (api)))).mScopes)));
	//   35   85:aload_1         
	//   36   86:aload_2         
	//   37   87:aload           4
	//   38   89:invokeinterface #270 <Method Object Map.get(Object)>
	//   39   94:checkcast       #377 <Class com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings>
	//   40   97:getfield        #380 <Field Set com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings.mScopes>
	//   41  100:invokeinterface #384 <Method boolean Set.addAll(java.util.Collection)>
	//   42  105:pop             
		} while(true);
	//   43  106:goto            45
		return ((Set) (obj));
	//   44  109:aload_1         
	//   45  110:areturn         
	}

	static GoogleApiAvailabilityLight zab(zaak zaak1)
	{
		return zaak1.zaex;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field GoogleApiAvailabilityLight zaex>
	//    2    4:areturn         
	}

	private final void zab(ConnectionResult connectionresult, Api api, boolean flag)
	{
		boolean flag2;
		int i;
label0:
		{
			i = api.zah().getPriority();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #390 <Method com.google.android.gms.common.api.Api$BaseClientBuilder Api.zah()>
	//    2    4:invokevirtual   #395 <Method int com.google.android.gms.common.api.Api$BaseClientBuilder.getPriority()>
	//    3    7:istore          7
			boolean flag3 = false;
	//    4    9:iconst_0        
	//    5   10:istore          6
			if(flag)
	//*   6   12:iload_3         
	//*   7   13:ifeq            61
			{
				boolean flag1;
				if(connectionresult.hasResolution())
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #398 <Method boolean ConnectionResult.hasResolution()>
	//*  10   20:ifeq            29
					flag1 = true;
	//   11   23:iconst_1        
	//   12   24:istore          4
				else
	//*  13   26:goto            52
				if(zaex.getErrorResolutionIntent(connectionresult.getErrorCode()) != null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #76  <Field GoogleApiAvailabilityLight zaex>
	//*  16   33:aload_1         
	//*  17   34:invokevirtual   #401 <Method int ConnectionResult.getErrorCode()>
	//*  18   37:invokevirtual   #407 <Method android.content.Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(int)>
	//*  19   40:ifnull          49
					flag1 = true;
	//   20   43:iconst_1        
	//   21   44:istore          4
				else
	//*  22   46:goto            52
					flag1 = false;
	//   23   49:iconst_0        
	//   24   50:istore          4
				flag2 = flag3;
	//   25   52:iload           6
	//   26   54:istore          5
				if(!flag1)
					break label0;
	//   27   56:iload           4
	//   28   58:ifeq            84
			}
			if(zafg != null)
	//*  29   61:aload_0         
	//*  30   62:getfield        #218 <Field ConnectionResult zafg>
	//*  31   65:ifnull          81
			{
				flag2 = flag3;
	//   32   68:iload           6
	//   33   70:istore          5
				if(i >= zafv)
					break label0;
	//   34   72:iload           7
	//   35   74:aload_0         
	//   36   75:getfield        #220 <Field int zafv>
	//   37   78:icmpge          84
			}
			flag2 = true;
	//   38   81:iconst_1        
	//   39   82:istore          5
		}
		if(flag2)
	//*  40   84:iload           5
	//*  41   86:ifeq            100
		{
			zafg = connectionresult;
	//   42   89:aload_0         
	//   43   90:aload_1         
	//   44   91:putfield        #218 <Field ConnectionResult zafg>
			zafv = i;
	//   45   94:aload_0         
	//   46   95:iload           7
	//   47   97:putfield        #220 <Field int zafv>
		}
		zafs.zaho.put(((Object) (api.getClientKey())), ((Object) (connectionresult)));
	//   48  100:aload_0         
	//   49  101:getfield        #70  <Field zabe zafs>
	//   50  104:getfield        #257 <Field Map zabe.zaho>
	//   51  107:aload_2         
	//   52  108:invokevirtual   #375 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   53  111:aload_1         
	//   54  112:invokeinterface #342 <Method Object Map.put(Object, Object)>
	//   55  117:pop             
	//   56  118:return          
	}

	private final void zab(boolean flag)
	{
		zad zad1 = zaga;
	//    0    0:aload_0         
	//    1    1:getfield        #309 <Field zad zaga>
	//    2    4:astore_2        
		if(zad1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          45
		{
			if(zad1.isConnected() && flag)
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #411 <Method boolean zad.isConnected()>
	//*   7   15:ifeq            31
	//*   8   18:iload_1         
	//*   9   19:ifeq            31
				zaga.zacv();
	//   10   22:aload_0         
	//   11   23:getfield        #309 <Field zad zaga>
	//   12   26:invokeinterface #414 <Method void zad.zacv()>
			zaga.disconnect();
	//   13   31:aload_0         
	//   14   32:getfield        #309 <Field zad zaga>
	//   15   35:invokeinterface #415 <Method void zad.disconnect()>
			zage = null;
	//   16   40:aload_0         
	//   17   41:aconst_null     
	//   18   42:putfield        #171 <Field IAccountAccessor zage>
		}
	//   19   45:return          
	}

	static boolean zab(zaak zaak1, ConnectionResult connectionresult)
	{
		return zaak1.zad(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #188 <Method boolean zad(ConnectionResult)>
	//    3    5:ireturn         
	}

	static Lock zac(zaak zaak1)
	{
		return zaak1.zaen;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Lock zaen>
	//    2    4:areturn         
	}

	private final boolean zac(int i)
	{
		if(zafw != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field int zafw>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          223
		{
			Log.w("GoogleApiClientConnecting", zafs.zaed.zaay());
	//    4    8:ldc1            #150 <String "GoogleApiClientConnecting">
	//    5   10:aload_0         
	//    6   11:getfield        #70  <Field zabe zafs>
	//    7   14:getfield        #202 <Field zaaw zabe.zaed>
	//    8   17:invokevirtual   #207 <Method String zaaw.zaay()>
	//    9   20:invokestatic    #211 <Method int Log.w(String, String)>
	//   10   23:pop             
			Object obj = ((Object) (String.valueOf(((Object) (this)))));
	//   11   24:aload_0         
	//   12   25:invokestatic    #133 <Method String String.valueOf(Object)>
	//   13   28:astore_3        
			Object obj1 = ((Object) (new StringBuilder(String.valueOf(obj).length() + 23)));
	//   14   29:new             #135 <Class StringBuilder>
	//   15   32:dup             
	//   16   33:aload_3         
	//   17   34:invokestatic    #133 <Method String String.valueOf(Object)>
	//   18   37:invokevirtual   #139 <Method int String.length()>
	//   19   40:bipush          23
	//   20   42:iadd            
	//   21   43:invokespecial   #142 <Method void StringBuilder(int)>
	//   22   46:astore          4
			((StringBuilder) (obj1)).append("Unexpected callback in ");
	//   23   48:aload           4
	//   24   50:ldc2            #419 <String "Unexpected callback in ">
	//   25   53:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
			((StringBuilder) (obj1)).append(((String) (obj)));
	//   27   57:aload           4
	//   28   59:aload_3         
	//   29   60:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
			Log.w("GoogleApiClientConnecting", ((StringBuilder) (obj1)).toString());
	//   31   64:ldc1            #150 <String "GoogleApiClientConnecting">
	//   32   66:aload           4
	//   33   68:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   34   71:invokestatic    #211 <Method int Log.w(String, String)>
	//   35   74:pop             
			int j = zafx;
	//   36   75:aload_0         
	//   37   76:getfield        #196 <Field int zafx>
	//   38   79:istore_2        
			obj = ((Object) (new StringBuilder(33)));
	//   39   80:new             #135 <Class StringBuilder>
	//   40   83:dup             
	//   41   84:bipush          33
	//   42   86:invokespecial   #142 <Method void StringBuilder(int)>
	//   43   89:astore_3        
			((StringBuilder) (obj)).append("mRemainingConnections=");
	//   44   90:aload_3         
	//   45   91:ldc2            #421 <String "mRemainingConnections=">
	//   46   94:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   47   97:pop             
			((StringBuilder) (obj)).append(j);
	//   48   98:aload_3         
	//   49   99:iload_2         
	//   50  100:invokevirtual   #424 <Method StringBuilder StringBuilder.append(int)>
	//   51  103:pop             
			Log.w("GoogleApiClientConnecting", ((StringBuilder) (obj)).toString());
	//   52  104:ldc1            #150 <String "GoogleApiClientConnecting">
	//   53  106:aload_3         
	//   54  107:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   55  110:invokestatic    #211 <Method int Log.w(String, String)>
	//   56  113:pop             
			obj = ((Object) (zad(zafw)));
	//   57  114:aload_0         
	//   58  115:getfield        #53  <Field int zafw>
	//   59  118:invokestatic    #427 <Method String zad(int)>
	//   60  121:astore_3        
			obj1 = ((Object) (zad(i)));
	//   61  122:iload_1         
	//   62  123:invokestatic    #427 <Method String zad(int)>
	//   63  126:astore          4
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 70 + String.valueOf(obj1).length());
	//   64  128:new             #135 <Class StringBuilder>
	//   65  131:dup             
	//   66  132:aload_3         
	//   67  133:invokestatic    #133 <Method String String.valueOf(Object)>
	//   68  136:invokevirtual   #139 <Method int String.length()>
	//   69  139:bipush          70
	//   70  141:iadd            
	//   71  142:aload           4
	//   72  144:invokestatic    #133 <Method String String.valueOf(Object)>
	//   73  147:invokevirtual   #139 <Method int String.length()>
	//   74  150:iadd            
	//   75  151:invokespecial   #142 <Method void StringBuilder(int)>
	//   76  154:astore          5
			stringbuilder.append("GoogleApiClient connecting is in step ");
	//   77  156:aload           5
	//   78  158:ldc2            #429 <String "GoogleApiClient connecting is in step ">
	//   79  161:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
			stringbuilder.append(((String) (obj)));
	//   81  165:aload           5
	//   82  167:aload_3         
	//   83  168:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   84  171:pop             
			stringbuilder.append(" but received callback for step ");
	//   85  172:aload           5
	//   86  174:ldc2            #431 <String " but received callback for step ">
	//   87  177:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   88  180:pop             
			stringbuilder.append(((String) (obj1)));
	//   89  181:aload           5
	//   90  183:aload           4
	//   91  185:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   92  188:pop             
			Log.wtf("GoogleApiClientConnecting", stringbuilder.toString(), ((Throwable) (new Exception())));
	//   93  189:ldc1            #150 <String "GoogleApiClientConnecting">
	//   94  191:aload           5
	//   95  193:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   96  196:new             #156 <Class Exception>
	//   97  199:dup             
	//   98  200:invokespecial   #157 <Method void Exception()>
	//   99  203:invokestatic    #163 <Method int Log.wtf(String, String, Throwable)>
	//  100  206:pop             
			zae(new ConnectionResult(8, ((android.app.PendingIntent) (null))));
	//  101  207:aload_0         
	//  102  208:new             #116 <Class ConnectionResult>
	//  103  211:dup             
	//  104  212:bipush          8
	//  105  214:aconst_null     
	//  106  215:invokespecial   #216 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//  107  218:invokespecial   #92  <Method void zae(ConnectionResult)>
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

	static zabe zad(zaak zaak1)
	{
		return zaak1.zafs;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zabe zafs>
	//    2    4:areturn         
	}

	private static String zad(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 32
	//	               1 28
		default:
			return "UNKNOWN";
	//    2   24:ldc2            #434 <String "UNKNOWN">
	//    3   27:areturn         

		case 1: // '\001'
			return "STEP_GETTING_REMOTE_SERVICE";
	//    4   28:ldc2            #436 <String "STEP_GETTING_REMOTE_SERVICE">
	//    5   31:areturn         

		case 0: // '\0'
			return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
	//    6   32:ldc2            #438 <String "STEP_SERVICE_BINDINGS_AND_SIGN_IN">
	//    7   35:areturn         
		}
	}

	private final boolean zad(ConnectionResult connectionresult)
	{
		return zagb && !connectionresult.hasResolution();
	//    0    0:aload_0         
	//    1    1:getfield        #440 <Field boolean zagb>
	//    2    4:ifeq            16
	//    3    7:aload_1         
	//    4    8:invokevirtual   #398 <Method boolean ConnectionResult.hasResolution()>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private final void zae(ConnectionResult connectionresult)
	{
		zaas();
	//    0    0:aload_0         
	//    1    1:invokespecial   #442 <Method void zaas()>
		zab(connectionresult.hasResolution() ^ true);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #398 <Method boolean ConnectionResult.hasResolution()>
	//    5    9:iconst_1        
	//    6   10:ixor            
	//    7   11:invokespecial   #317 <Method void zab(boolean)>
		zafs.zaf(connectionresult);
	//    8   14:aload_0         
	//    9   15:getfield        #70  <Field zabe zafs>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #445 <Method void zabe.zaf(ConnectionResult)>
		zafs.zahs.zac(connectionresult);
	//   12   22:aload_0         
	//   13   23:getfield        #70  <Field zabe zafs>
	//   14   26:getfield        #325 <Field zabt zabe.zahs>
	//   15   29:aload_1         
	//   16   30:invokeinterface #447 <Method void zabt.zac(ConnectionResult)>
	//   17   35:return          
	}

	static boolean zae(zaak zaak1)
	{
		return zaak1.zagc;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field boolean zagc>
	//    2    4:ireturn         
	}

	static zad zaf(zaak zaak1)
	{
		return zaak1.zaga;
	//    0    0:aload_0         
	//    1    1:getfield        #309 <Field zad zaga>
	//    2    4:areturn         
	}

	static Set zag(zaak zaak1)
	{
		return zaak1.zaat();
	//    0    0:aload_0         
	//    1    1:invokespecial   #453 <Method Set zaat()>
	//    2    4:areturn         
	}

	static IAccountAccessor zah(zaak zaak1)
	{
		return zaak1.zage;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field IAccountAccessor zage>
	//    2    4:areturn         
	}

	static void zai(zaak zaak1)
	{
		zaak1.zaar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #191 <Method void zaar()>
	//    2    4:return          
	}

	static void zaj(zaak zaak1)
	{
		zaak1.zaap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #184 <Method void zaap()>
	//    2    4:return          
	}

	static boolean zak(zaak zaak1)
	{
		return zaak1.zaao();
	//    0    0:aload_0         
	//    1    1:invokespecial   #263 <Method boolean zaao()>
	//    2    4:ireturn         
	}

	public final void begin()
	{
		zafs.zaho.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zabe zafs>
	//    2    4:getfield        #257 <Field Map zabe.zaho>
	//    3    7:invokeinterface #459 <Method void Map.clear()>
		zagc = false;
	//    4   12:aload_0         
	//    5   13:iconst_0        
	//    6   14:putfield        #225 <Field boolean zagc>
		zafg = null;
	//    7   17:aload_0         
	//    8   18:aconst_null     
	//    9   19:putfield        #218 <Field ConnectionResult zafg>
		zafw = 0;
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #53  <Field int zafw>
		zagb = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #440 <Field boolean zagb>
		zagd = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #165 <Field boolean zagd>
		zagf = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #176 <Field boolean zagf>
		HashMap hashmap = new HashMap();
	//   22   42:new             #461 <Class HashMap>
	//   23   45:dup             
	//   24   46:invokespecial   #462 <Method void HashMap()>
	//   25   49:astore          4
		Iterator iterator = zaev.keySet().iterator();
	//   26   51:aload_0         
	//   27   52:getfield        #74  <Field Map zaev>
	//   28   55:invokeinterface #237 <Method Set Map.keySet()>
	//   29   60:invokeinterface #243 <Method Iterator Set.iterator()>
	//   30   65:astore          5
		boolean flag = false;
	//   31   67:iconst_0        
	//   32   68:istore_1        
		boolean flag2;
		Api api;
		com.google.android.gms.common.api.Api.Client client;
		for(; iterator.hasNext(); ((Map) (hashmap)).put(((Object) (client)), ((Object) (new zaam(this, api, flag2)))))
	//*  33   69:aload           5
	//*  34   71:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//*  35   76:ifeq            220
		{
			api = (Api)iterator.next();
	//   36   79:aload           5
	//   37   81:invokeinterface #252 <Method Object Iterator.next()>
	//   38   86:checkcast       #371 <Class Api>
	//   39   89:astore          6
			client = (com.google.android.gms.common.api.Api.Client)zafs.zagy.get(((Object) (api.getClientKey())));
	//   40   91:aload_0         
	//   41   92:getfield        #70  <Field zabe zafs>
	//   42   95:getfield        #228 <Field Map zabe.zagy>
	//   43   98:aload           6
	//   44  100:invokevirtual   #375 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   45  103:invokeinterface #270 <Method Object Map.get(Object)>
	//   46  108:checkcast       #272 <Class com.google.android.gms.common.api.Api$Client>
	//   47  111:astore          7
			boolean flag1;
			if(api.zah().getPriority() == 1)
	//*  48  113:aload           6
	//*  49  115:invokevirtual   #390 <Method com.google.android.gms.common.api.Api$BaseClientBuilder Api.zah()>
	//*  50  118:invokevirtual   #395 <Method int com.google.android.gms.common.api.Api$BaseClientBuilder.getPriority()>
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
			flag2 = ((Boolean)zaev.get(((Object) (api)))).booleanValue();
	//   62  136:aload_0         
	//   63  137:getfield        #74  <Field Map zaev>
	//   64  140:aload           6
	//   65  142:invokeinterface #270 <Method Object Map.get(Object)>
	//   66  147:checkcast       #464 <Class Boolean>
	//   67  150:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//   68  153:istore_3        
			if(!client.requiresSignIn())
				continue;
	//   69  154:aload           7
	//   70  156:invokeinterface #470 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//   71  161:ifeq            196
			zagc = true;
	//   72  164:aload_0         
	//   73  165:iconst_1        
	//   74  166:putfield        #225 <Field boolean zagc>
			if(flag2)
	//*  75  169:iload_3         
	//*  76  170:ifeq            191
				zafz.add(((Object) (api.getClientKey())));
	//   77  173:aload_0         
	//   78  174:getfield        #63  <Field Set zafz>
	//   79  177:aload           6
	//   80  179:invokevirtual   #375 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   81  182:invokeinterface #471 <Method boolean Set.add(Object)>
	//   82  187:pop             
			else
	//*  83  188:goto            196
				zagb = false;
	//   84  191:aload_0         
	//   85  192:iconst_0        
	//   86  193:putfield        #440 <Field boolean zagb>
		}

	//   87  196:aload           4
	//   88  198:aload           7
	//   89  200:new             #473 <Class zaam>
	//   90  203:dup             
	//   91  204:aload_0         
	//   92  205:aload           6
	//   93  207:iload_3         
	//   94  208:invokespecial   #476 <Method void zaam(zaak, Api, boolean)>
	//   95  211:invokeinterface #342 <Method Object Map.put(Object, Object)>
	//   96  216:pop             
	//*  97  217:goto            69
		if(flag)
	//*  98  220:iload_1         
	//*  99  221:ifeq            229
			zagc = false;
	//  100  224:aload_0         
	//  101  225:iconst_0        
	//  102  226:putfield        #225 <Field boolean zagc>
		if(zagc)
	//* 103  229:aload_0         
	//* 104  230:getfield        #225 <Field boolean zagc>
	//* 105  233:ifeq            324
		{
			zaes.setClientSessionId(Integer.valueOf(System.identityHashCode(((Object) (zafs.zaed)))));
	//  106  236:aload_0         
	//  107  237:getfield        #72  <Field ClientSettings zaes>
	//  108  240:aload_0         
	//  109  241:getfield        #70  <Field zabe zafs>
	//  110  244:getfield        #202 <Field zaaw zabe.zaed>
	//  111  247:invokestatic    #482 <Method int System.identityHashCode(Object)>
	//  112  250:invokestatic    #487 <Method Integer Integer.valueOf(int)>
	//  113  253:invokevirtual   #491 <Method void ClientSettings.setClientSessionId(Integer)>
			zaat zaat1 = new zaat(this, ((zaal) (null)));
	//  114  256:new             #493 <Class zaat>
	//  115  259:dup             
	//  116  260:aload_0         
	//  117  261:aconst_null     
	//  118  262:invokespecial   #496 <Method void zaat(zaak, zaal)>
	//  119  265:astore          5
			com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder = zacd;
	//  120  267:aload_0         
	//  121  268:getfield        #78  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  122  271:astore          6
			Context context = mContext;
	//  123  273:aload_0         
	//  124  274:getfield        #82  <Field Context mContext>
	//  125  277:astore          7
			android.os.Looper looper = ((GoogleApiClient) (zafs.zaed)).getLooper();
	//  126  279:aload_0         
	//  127  280:getfield        #70  <Field zabe zafs>
	//  128  283:getfield        #202 <Field zaaw zabe.zaed>
	//  129  286:invokevirtual   #502 <Method android.os.Looper GoogleApiClient.getLooper()>
	//  130  289:astore          8
			ClientSettings clientsettings = zaes;
	//  131  291:aload_0         
	//  132  292:getfield        #72  <Field ClientSettings zaes>
	//  133  295:astore          9
			zaga = (zad)abstractclientbuilder.buildClient(context, looper, clientsettings, ((Object) (clientsettings.getSignInOptions())), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (zaat1)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (zaat1)));
	//  134  297:aload_0         
	//  135  298:aload           6
	//  136  300:aload           7
	//  137  302:aload           8
	//  138  304:aload           9
	//  139  306:aload           9
	//  140  308:invokevirtual   #506 <Method com.google.android.gms.signin.SignInOptions ClientSettings.getSignInOptions()>
	//  141  311:aload           5
	//  142  313:aload           5
	//  143  315:invokevirtual   #512 <Method com.google.android.gms.common.api.Api$Client com.google.android.gms.common.api.Api$AbstractClientBuilder.buildClient(Context, android.os.Looper, ClientSettings, Object, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//  144  318:checkcast       #311 <Class zad>
	//  145  321:putfield        #309 <Field zad zaga>
		}
		zafx = zafs.zagy.size();
	//  146  324:aload_0         
	//  147  325:aload_0         
	//  148  326:getfield        #70  <Field zabe zafs>
	//  149  329:getfield        #228 <Field Map zabe.zagy>
	//  150  332:invokeinterface #233 <Method int Map.size()>
	//  151  337:putfield        #196 <Field int zafx>
		zagh.add(((Object) (zabh.zabb().submit(((Runnable) (new zaan(this, ((Map) (hashmap)))))))));
	//  152  340:aload_0         
	//  153  341:getfield        #68  <Field ArrayList zagh>
	//  154  344:invokestatic    #284 <Method ExecutorService zabh.zabb()>
	//  155  347:new             #514 <Class zaan>
	//  156  350:dup             
	//  157  351:aload_0         
	//  158  352:aload           4
	//  159  354:invokespecial   #517 <Method void zaan(zaak, Map)>
	//  160  357:invokeinterface #295 <Method Future ExecutorService.submit(Runnable)>
	//  161  362:invokevirtual   #275 <Method boolean ArrayList.add(Object)>
	//  162  365:pop             
	//  163  366:return          
	}

	public final void connect()
	{
	//    0    0:return          
	}

	public final boolean disconnect()
	{
		zaas();
	//    0    0:aload_0         
	//    1    1:invokespecial   #442 <Method void zaas()>
		zab(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #317 <Method void zab(boolean)>
		zafs.zaf(((ConnectionResult) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field zabe zafs>
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #445 <Method void zabe.zaf(ConnectionResult)>
		return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		zafs.zaed.zafb.add(((Object) (apimethodimpl)));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zabe zafs>
	//    2    4:getfield        #202 <Field zaaw zabe.zaed>
	//    3    7:getfield        #524 <Field Queue zaaw.zafb>
	//    4   10:aload_1         
	//    5   11:invokeinterface #527 <Method boolean Queue.add(Object)>
	//    6   16:pop             
		return apimethodimpl;
	//    7   17:aload_1         
	//    8   18:areturn         
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//    0    0:new             #530 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #532 <String "GoogleApiClient is not connected yet.">
	//    3    7:invokespecial   #535 <Method void IllegalStateException(String)>
	//    4   10:athrow          
	}

	public final void onConnected(Bundle bundle)
	{
		if(!zac(1))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:invokespecial   #108 <Method boolean zac(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		if(bundle != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			zafy.putAll(bundle);
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field Bundle zafy>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #540 <Method void Bundle.putAll(Bundle)>
		if(zaao())
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #263 <Method boolean zaao()>
	//*  13   25:ifeq            32
			zaaq();
	//   14   28:aload_0         
	//   15   29:invokespecial   #266 <Method void zaaq()>
	//   16   32:return          
	}

	public final void onConnectionSuspended(int i)
	{
		zae(new ConnectionResult(8, ((android.app.PendingIntent) (null))));
	//    0    0:aload_0         
	//    1    1:new             #116 <Class ConnectionResult>
	//    2    4:dup             
	//    3    5:bipush          8
	//    4    7:aconst_null     
	//    5    8:invokespecial   #216 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//    6   11:invokespecial   #92  <Method void zae(ConnectionResult)>
	//    7   14:return          
	}

	public final void zaa(ConnectionResult connectionresult, Api api, boolean flag)
	{
		if(!zac(1))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:invokespecial   #108 <Method boolean zac(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		zab(connectionresult, api, flag);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:invokespecial   #97  <Method void zab(ConnectionResult, Api, boolean)>
		if(zaao())
	//*  10   16:aload_0         
	//*  11   17:invokespecial   #263 <Method boolean zaao()>
	//*  12   20:ifeq            27
			zaaq();
	//   13   23:aload_0         
	//   14   24:invokespecial   #266 <Method void zaaq()>
	//   15   27:return          
	}

	private final Context mContext;
	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zacd;
	private final Lock zaen;
	private final ClientSettings zaes;
	private final Map zaev;
	private final GoogleApiAvailabilityLight zaex;
	private ConnectionResult zafg;
	private final zabe zafs;
	private int zafv;
	private int zafw;
	private int zafx;
	private final Bundle zafy = new Bundle();
	private final Set zafz = new HashSet();
	private zad zaga;
	private boolean zagb;
	private boolean zagc;
	private boolean zagd;
	private IAccountAccessor zage;
	private boolean zagf;
	private boolean zagg;
	private ArrayList zagh;
}
