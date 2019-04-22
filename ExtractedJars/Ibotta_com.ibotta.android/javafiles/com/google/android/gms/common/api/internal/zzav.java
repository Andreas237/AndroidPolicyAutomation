// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.service.CommonApi;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbq, ListenerHolders, zzaw, zzba, 
//			zzck, zzaz, zzbp, zzw, 
//			zzr, zzbd, StatusPendingResult, zzax, 
//			zzay, BasePendingResult, LifecycleActivity, zzi, 
//			GooglePlayServicesUpdatedReceiver, zzbb, SignInConnectionListener, ListenerHolder, 
//			zzch

public final class zzav extends GoogleApiClient
	implements zzbq
{

	public zzav(Context context, Lock lock, Looper looper, ClientSettings clientsettings, GoogleApiAvailability googleapiavailability, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, Map map, 
			List list, List list1, Map map1, int i, int j, ArrayList arraylist, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void GoogleApiClient()>
		zzif = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #67  <Field zzbp zzif>
	//    5    9:aload_0         
	//    6   10:new             #69  <Class LinkedList>
	//    7   13:dup             
	//    8   14:invokespecial   #70  <Method void LinkedList()>
	//    9   17:putfield        #72  <Field Queue zzgo>
		zzih = 0x1d4c0L;
	//   10   20:aload_0         
	//   11   21:ldc2w           #73  <Long 0x1d4c0L>
	//   12   24:putfield        #76  <Field long zzih>
		zzii = 5000L;
	//   13   27:aload_0         
	//   14   28:ldc2w           #77  <Long 5000L>
	//   15   31:putfield        #80  <Field long zzii>
		zzim = ((Set) (new HashSet()));
	//   16   34:aload_0         
	//   17   35:new             #82  <Class HashSet>
	//   18   38:dup             
	//   19   39:invokespecial   #83  <Method void HashSet()>
	//   20   42:putfield        #85  <Field Set zzim>
	//   21   45:aload_0         
	//   22   46:new             #87  <Class ListenerHolders>
	//   23   49:dup             
	//   24   50:invokespecial   #88  <Method void ListenerHolders()>
	//   25   53:putfield        #90  <Field ListenerHolders zzin>
		zzip = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #92  <Field Integer zzip>
		zziq = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #94  <Field Set zziq>
	//   32   66:aload_0         
	//   33   67:new             #96  <Class zzaw>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:invokespecial   #99  <Method void zzaw(zzav)>
	//   37   75:putfield        #101 <Field com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState zzis>
		mContext = context;
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:putfield        #103 <Field Context mContext>
		zzga = lock;
	//   41   83:aload_0         
	//   42   84:aload_2         
	//   43   85:putfield        #105 <Field Lock zzga>
		zzdk = false;
	//   44   88:aload_0         
	//   45   89:iconst_0        
	//   46   90:putfield        #107 <Field boolean zzdk>
		zzie = new GmsClientEventManager(looper, zzis);
	//   47   93:aload_0         
	//   48   94:new             #109 <Class GmsClientEventManager>
	//   49   97:dup             
	//   50   98:aload_3         
	//   51   99:aload_0         
	//   52  100:getfield        #101 <Field com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState zzis>
	//   53  103:invokespecial   #112 <Method void GmsClientEventManager(Looper, com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState)>
	//   54  106:putfield        #114 <Field GmsClientEventManager zzie>
		zzcn = looper;
	//   55  109:aload_0         
	//   56  110:aload_3         
	//   57  111:putfield        #116 <Field Looper zzcn>
		zzij = new zzba(this, looper);
	//   58  114:aload_0         
	//   59  115:new             #118 <Class zzba>
	//   60  118:dup             
	//   61  119:aload_0         
	//   62  120:aload_3         
	//   63  121:invokespecial   #121 <Method void zzba(zzav, Looper)>
	//   64  124:putfield        #123 <Field zzba zzij>
		zzdg = googleapiavailability;
	//   65  127:aload_0         
	//   66  128:aload           5
	//   67  130:putfield        #125 <Field GoogleApiAvailability zzdg>
		zzde = i;
	//   68  133:aload_0         
	//   69  134:iload           11
	//   70  136:putfield        #127 <Field int zzde>
		if(zzde >= 0)
	//*  71  139:aload_0         
	//*  72  140:getfield        #127 <Field int zzde>
	//*  73  143:iflt            155
			zzip = Integer.valueOf(j);
	//   74  146:aload_0         
	//   75  147:iload           12
	//   76  149:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   77  152:putfield        #92  <Field Integer zzip>
		zzgi = map;
	//   78  155:aload_0         
	//   79  156:aload           7
	//   80  158:putfield        #135 <Field Map zzgi>
		zzil = map1;
	//   81  161:aload_0         
	//   82  162:aload           10
	//   83  164:putfield        #137 <Field Map zzil>
		zzio = arraylist;
	//   84  167:aload_0         
	//   85  168:aload           13
	//   86  170:putfield        #139 <Field ArrayList zzio>
		zzir = new zzck(zzil);
	//   87  173:aload_0         
	//   88  174:new             #141 <Class zzck>
	//   89  177:dup             
	//   90  178:aload_0         
	//   91  179:getfield        #137 <Field Map zzil>
	//   92  182:invokespecial   #144 <Method void zzck(Map)>
	//   93  185:putfield        #146 <Field zzck zzir>
		for(context = ((Context) (list.iterator())); ((Iterator) (context)).hasNext(); zzie.registerConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (lock))))
	//*  94  188:aload           8
	//*  95  190:invokeinterface #152 <Method Iterator List.iterator()>
	//*  96  195:astore_1        
	//*  97  196:aload_1         
	//*  98  197:invokeinterface #158 <Method boolean Iterator.hasNext()>
	//*  99  202:ifeq            226
			lock = ((Lock) ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (context)).next()));
	//  100  205:aload_1         
	//  101  206:invokeinterface #162 <Method Object Iterator.next()>
	//  102  211:checkcast       #164 <Class com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks>
	//  103  214:astore_2        

	//  104  215:aload_0         
	//  105  216:getfield        #114 <Field GmsClientEventManager zzie>
	//  106  219:aload_2         
	//  107  220:invokevirtual   #168 <Method void GmsClientEventManager.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//* 108  223:goto            196
		for(context = ((Context) (list1.iterator())); ((Iterator) (context)).hasNext(); zzie.registerConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (lock))))
	//* 109  226:aload           9
	//* 110  228:invokeinterface #152 <Method Iterator List.iterator()>
	//* 111  233:astore_1        
	//* 112  234:aload_1         
	//* 113  235:invokeinterface #158 <Method boolean Iterator.hasNext()>
	//* 114  240:ifeq            264
			lock = ((Lock) ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)((Iterator) (context)).next()));
	//  115  243:aload_1         
	//  116  244:invokeinterface #162 <Method Object Iterator.next()>
	//  117  249:checkcast       #170 <Class com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener>
	//  118  252:astore_2        

	//  119  253:aload_0         
	//  120  254:getfield        #114 <Field GmsClientEventManager zzie>
	//  121  257:aload_2         
	//  122  258:invokevirtual   #174 <Method void GmsClientEventManager.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//* 123  261:goto            234
		zzgf = clientsettings;
	//  124  264:aload_0         
	//  125  265:aload           4
	//  126  267:putfield        #176 <Field ClientSettings zzgf>
		zzdh = abstractclientbuilder;
	//  127  270:aload_0         
	//  128  271:aload           6
	//  129  273:putfield        #178 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
	//  130  276:return          
	}

	private final void resume()
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		if(zzig)
	//*   3    9:aload_0         
	//*   4   10:getfield        #189 <Field boolean zzig>
	//*   5   13:ifeq            20
			zzax();
	//    6   16:aload_0         
	//    7   17:invokespecial   #192 <Method void zzax()>
		zzga.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #105 <Field Lock zzga>
	//   10   24:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zzga.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #105 <Field Lock zzga>
	//   15   35:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	public static int zza(Iterable iterable, boolean flag)
	{
		iterable = ((Iterable) (iterable.iterator()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #200 <Method Iterator Iterable.iterator()>
	//    2    6:astore_0        
		boolean flag2 = false;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		do
		{
			if(!((Iterator) (iterable)).hasNext())
				break;
	//    7   11:aload_0         
	//    8   12:invokeinterface #158 <Method boolean Iterator.hasNext()>
	//    9   17:ifeq            68
			com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)((Iterator) (iterable)).next();
	//   10   20:aload_0         
	//   11   21:invokeinterface #162 <Method Object Iterator.next()>
	//   12   26:checkcast       #202 <Class com.google.android.gms.common.api.Api$Client>
	//   13   29:astore          5
			boolean flag3 = flag2;
	//   14   31:iload_3         
	//   15   32:istore          4
			if(client.requiresSignIn())
	//*  16   34:aload           5
	//*  17   36:invokeinterface #205 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  18   41:ifeq            47
				flag3 = true;
	//   19   44:iconst_1        
	//   20   45:istore          4
			flag2 = flag3;
	//   21   47:iload           4
	//   22   49:istore_3        
			if(client.providesSignIn())
	//*  23   50:aload           5
	//*  24   52:invokeinterface #208 <Method boolean com.google.android.gms.common.api.Api$Client.providesSignIn()>
	//*  25   57:ifeq            11
			{
				flag1 = true;
	//   26   60:iconst_1        
	//   27   61:istore_2        
				flag2 = flag3;
	//   28   62:iload           4
	//   29   64:istore_3        
			}
		} while(true);
	//   30   65:goto            11
		if(flag2)
	//*  31   68:iload_3         
	//*  32   69:ifeq            84
			return !flag1 || !flag ? 1 : 2;
	//   33   72:iload_2         
	//   34   73:ifeq            82
	//   35   76:iload_1         
	//   36   77:ifeq            82
	//   37   80:iconst_2        
	//   38   81:ireturn         
	//   39   82:iconst_1        
	//   40   83:ireturn         
		else
			return 3;
	//   41   84:iconst_3        
	//   42   85:ireturn         
	}

	private final void zza(GoogleApiClient googleapiclient, StatusPendingResult statuspendingresult, boolean flag)
	{
		Common.CommonApi.clearDefaultAccount(googleapiclient).setResultCallback(((com.google.android.gms.common.api.ResultCallback) (new zzaz(this, statuspendingresult, flag, googleapiclient))));
	//    0    0:getstatic       #216 <Field CommonApi Common.CommonApi>
	//    1    3:aload_1         
	//    2    4:invokeinterface #222 <Method PendingResult CommonApi.clearDefaultAccount(GoogleApiClient)>
	//    3    9:new             #224 <Class zzaz>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:aload_1         
	//    9   17:invokespecial   #227 <Method void zzaz(zzav, StatusPendingResult, boolean, GoogleApiClient)>
	//   10   20:invokevirtual   #233 <Method void PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback)>
	//   11   23:return          
	}

	static void zza(zzav zzav1)
	{
		zzav1.resume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #235 <Method void resume()>
	//    2    4:return          
	}

	static void zza(zzav zzav1, GoogleApiClient googleapiclient, StatusPendingResult statuspendingresult, boolean flag)
	{
		zzav1.zza(googleapiclient, statuspendingresult, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #238 <Method void zza(GoogleApiClient, StatusPendingResult, boolean)>
	//    5    7:return          
	}

	private final void zzax()
	{
		zzie.enableCallbacks();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field GmsClientEventManager zzie>
	//    2    4:invokevirtual   #244 <Method void GmsClientEventManager.enableCallbacks()>
		zzif.connect();
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field zzbp zzif>
	//    5   11:invokeinterface #249 <Method void zzbp.connect()>
	//    6   16:return          
	}

	private final void zzay()
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		if(zzaz())
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #254 <Method boolean zzaz()>
	//*   5   13:ifeq            20
			zzax();
	//    6   16:aload_0         
	//    7   17:invokespecial   #192 <Method void zzax()>
		zzga.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #105 <Field Lock zzga>
	//   10   24:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zzga.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #105 <Field Lock zzga>
	//   15   35:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	static void zzb(zzav zzav1)
	{
		zzav1.zzay();
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method void zzay()>
	//    2    4:return          
	}

	static Context zzc(zzav zzav1)
	{
		return zzav1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Context mContext>
	//    2    4:areturn         
	}

	private final void zzg(int i)
	{
label0:
		{
			Object obj = ((Object) (zzip));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Integer zzip>
	//    2    4:astore          4
			if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       22
				zzip = Integer.valueOf(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//    8   16:putfield        #92  <Field Integer zzip>
			else
	//*   9   19:goto            31
			if(((Integer) (obj)).intValue() != i)
				break label0;
	//   10   22:aload           4
	//   11   24:invokevirtual   #265 <Method int Integer.intValue()>
	//   12   27:iload_1         
	//   13   28:icmpne          401
			if(zzif != null)
	//*  14   31:aload_0         
	//*  15   32:getfield        #67  <Field zzbp zzif>
	//*  16   35:ifnull          39
				return;
	//   17   38:return          
			obj = ((Object) (zzil.values().iterator()));
	//   18   39:aload_0         
	//   19   40:getfield        #137 <Field Map zzil>
	//   20   43:invokeinterface #271 <Method Collection Map.values()>
	//   21   48:invokeinterface #274 <Method Iterator Collection.iterator()>
	//   22   53:astore          4
			boolean flag = false;
	//   23   55:iconst_0        
	//   24   56:istore_2        
			i = 0;
	//   25   57:iconst_0        
	//   26   58:istore_1        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   27   59:aload           4
	//   28   61:invokeinterface #158 <Method boolean Iterator.hasNext()>
	//   29   66:ifeq            114
				com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)((Iterator) (obj)).next();
	//   30   69:aload           4
	//   31   71:invokeinterface #162 <Method Object Iterator.next()>
	//   32   76:checkcast       #202 <Class com.google.android.gms.common.api.Api$Client>
	//   33   79:astore          5
				boolean flag1 = flag;
	//   34   81:iload_2         
	//   35   82:istore_3        
				if(client.requiresSignIn())
	//*  36   83:aload           5
	//*  37   85:invokeinterface #205 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  38   90:ifeq            95
					flag1 = true;
	//   39   93:iconst_1        
	//   40   94:istore_3        
				flag = flag1;
	//   41   95:iload_3         
	//   42   96:istore_2        
				if(client.providesSignIn())
	//*  43   97:aload           5
	//*  44   99:invokeinterface #208 <Method boolean com.google.android.gms.common.api.Api$Client.providesSignIn()>
	//*  45  104:ifeq            59
				{
					i = 1;
	//   46  107:iconst_1        
	//   47  108:istore_1        
					flag = flag1;
	//   48  109:iload_3         
	//   49  110:istore_2        
				}
			} while(true);
	//   50  111:goto            59
			switch(zzip.intValue())
	//*  51  114:aload_0         
	//*  52  115:getfield        #92  <Field Integer zzip>
	//*  53  118:invokevirtual   #265 <Method int Integer.intValue()>
			{
	//*  54  121:tableswitch     1 3: default 148
	//	               1 257
	//	               2 151
	//	               3 290
	//*  55  148:goto            290
			case 2: // '\002'
				if(flag)
	//*  56  151:iload_2         
	//*  57  152:ifeq            290
					if(zzdk)
	//*  58  155:aload_0         
	//*  59  156:getfield        #107 <Field boolean zzdk>
	//*  60  159:ifeq            212
					{
						zzif = ((zzbp) (new zzw(mContext, zzga, zzcn, ((GoogleApiAvailabilityLight) (zzdg)), zzil, zzgf, zzgi, zzdh, zzio, this, true)));
	//   61  162:aload_0         
	//   62  163:new             #276 <Class zzw>
	//   63  166:dup             
	//   64  167:aload_0         
	//   65  168:getfield        #103 <Field Context mContext>
	//   66  171:aload_0         
	//   67  172:getfield        #105 <Field Lock zzga>
	//   68  175:aload_0         
	//   69  176:getfield        #116 <Field Looper zzcn>
	//   70  179:aload_0         
	//   71  180:getfield        #125 <Field GoogleApiAvailability zzdg>
	//   72  183:aload_0         
	//   73  184:getfield        #137 <Field Map zzil>
	//   74  187:aload_0         
	//   75  188:getfield        #176 <Field ClientSettings zzgf>
	//   76  191:aload_0         
	//   77  192:getfield        #135 <Field Map zzgi>
	//   78  195:aload_0         
	//   79  196:getfield        #178 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
	//   80  199:aload_0         
	//   81  200:getfield        #139 <Field ArrayList zzio>
	//   82  203:aload_0         
	//   83  204:iconst_1        
	//   84  205:invokespecial   #279 <Method void zzw(Context, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zzav, boolean)>
	//   85  208:putfield        #67  <Field zzbp zzif>
						return;
	//   86  211:return          
					} else
					{
						zzif = ((zzbp) (zzr.zza(mContext, this, zzga, zzcn, ((GoogleApiAvailabilityLight) (zzdg)), zzil, zzgf, zzgi, zzdh, zzio)));
	//   87  212:aload_0         
	//   88  213:aload_0         
	//   89  214:getfield        #103 <Field Context mContext>
	//   90  217:aload_0         
	//   91  218:aload_0         
	//   92  219:getfield        #105 <Field Lock zzga>
	//   93  222:aload_0         
	//   94  223:getfield        #116 <Field Looper zzcn>
	//   95  226:aload_0         
	//   96  227:getfield        #125 <Field GoogleApiAvailability zzdg>
	//   97  230:aload_0         
	//   98  231:getfield        #137 <Field Map zzil>
	//   99  234:aload_0         
	//  100  235:getfield        #176 <Field ClientSettings zzgf>
	//  101  238:aload_0         
	//  102  239:getfield        #135 <Field Map zzgi>
	//  103  242:aload_0         
	//  104  243:getfield        #178 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
	//  105  246:aload_0         
	//  106  247:getfield        #139 <Field ArrayList zzio>
	//  107  250:invokestatic    #284 <Method zzr zzr.zza(Context, zzav, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList)>
	//  108  253:putfield        #67  <Field zzbp zzif>
						return;
	//  109  256:return          
					}
				break;

			case 1: // '\001'
				if(flag)
	//* 110  257:iload_2         
	//* 111  258:ifeq            279
				{
					if(i != 0)
	//* 112  261:iload_1         
	//* 113  262:ifne            268
	//* 114  265:goto            290
						throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//  115  268:new             #286 <Class IllegalStateException>
	//  116  271:dup             
	//  117  272:ldc2            #288 <String "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//  118  275:invokespecial   #291 <Method void IllegalStateException(String)>
	//  119  278:athrow          
				} else
				{
					throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
	//  120  279:new             #286 <Class IllegalStateException>
	//  121  282:dup             
	//  122  283:ldc2            #293 <String "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.">
	//  123  286:invokespecial   #291 <Method void IllegalStateException(String)>
	//  124  289:athrow          
				}
				break;
			}
			if(zzdk && i == 0)
	//* 125  290:aload_0         
	//* 126  291:getfield        #107 <Field boolean zzdk>
	//* 127  294:ifeq            351
	//* 128  297:iload_1         
	//* 129  298:ifne            351
			{
				zzif = ((zzbp) (new zzw(mContext, zzga, zzcn, ((GoogleApiAvailabilityLight) (zzdg)), zzil, zzgf, zzgi, zzdh, zzio, this, false)));
	//  130  301:aload_0         
	//  131  302:new             #276 <Class zzw>
	//  132  305:dup             
	//  133  306:aload_0         
	//  134  307:getfield        #103 <Field Context mContext>
	//  135  310:aload_0         
	//  136  311:getfield        #105 <Field Lock zzga>
	//  137  314:aload_0         
	//  138  315:getfield        #116 <Field Looper zzcn>
	//  139  318:aload_0         
	//  140  319:getfield        #125 <Field GoogleApiAvailability zzdg>
	//  141  322:aload_0         
	//  142  323:getfield        #137 <Field Map zzil>
	//  143  326:aload_0         
	//  144  327:getfield        #176 <Field ClientSettings zzgf>
	//  145  330:aload_0         
	//  146  331:getfield        #135 <Field Map zzgi>
	//  147  334:aload_0         
	//  148  335:getfield        #178 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
	//  149  338:aload_0         
	//  150  339:getfield        #139 <Field ArrayList zzio>
	//  151  342:aload_0         
	//  152  343:iconst_0        
	//  153  344:invokespecial   #279 <Method void zzw(Context, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zzav, boolean)>
	//  154  347:putfield        #67  <Field zzbp zzif>
				return;
	//  155  350:return          
			} else
			{
				zzif = ((zzbp) (new zzbd(mContext, this, zzga, zzcn, ((GoogleApiAvailabilityLight) (zzdg)), zzil, zzgf, zzgi, zzdh, zzio, ((zzbq) (this)))));
	//  156  351:aload_0         
	//  157  352:new             #295 <Class zzbd>
	//  158  355:dup             
	//  159  356:aload_0         
	//  160  357:getfield        #103 <Field Context mContext>
	//  161  360:aload_0         
	//  162  361:aload_0         
	//  163  362:getfield        #105 <Field Lock zzga>
	//  164  365:aload_0         
	//  165  366:getfield        #116 <Field Looper zzcn>
	//  166  369:aload_0         
	//  167  370:getfield        #125 <Field GoogleApiAvailability zzdg>
	//  168  373:aload_0         
	//  169  374:getfield        #137 <Field Map zzil>
	//  170  377:aload_0         
	//  171  378:getfield        #176 <Field ClientSettings zzgf>
	//  172  381:aload_0         
	//  173  382:getfield        #135 <Field Map zzgi>
	//  174  385:aload_0         
	//  175  386:getfield        #178 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
	//  176  389:aload_0         
	//  177  390:getfield        #139 <Field ArrayList zzio>
	//  178  393:aload_0         
	//  179  394:invokespecial   #298 <Method void zzbd(Context, zzav, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zzbq)>
	//  180  397:putfield        #67  <Field zzbp zzif>
				return;
	//  181  400:return          
			}
		}
		String s = zzh(i);
	//  182  401:iload_1         
	//  183  402:invokestatic    #302 <Method String zzh(int)>
	//  184  405:astore          4
		String s1 = zzh(zzip.intValue());
	//  185  407:aload_0         
	//  186  408:getfield        #92  <Field Integer zzip>
	//  187  411:invokevirtual   #265 <Method int Integer.intValue()>
	//  188  414:invokestatic    #302 <Method String zzh(int)>
	//  189  417:astore          5
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 51 + String.valueOf(((Object) (s1))).length());
	//  190  419:new             #304 <Class StringBuilder>
	//  191  422:dup             
	//  192  423:aload           4
	//  193  425:invokestatic    #309 <Method String String.valueOf(Object)>
	//  194  428:invokevirtual   #312 <Method int String.length()>
	//  195  431:bipush          51
	//  196  433:iadd            
	//  197  434:aload           5
	//  198  436:invokestatic    #309 <Method String String.valueOf(Object)>
	//  199  439:invokevirtual   #312 <Method int String.length()>
	//  200  442:iadd            
	//  201  443:invokespecial   #314 <Method void StringBuilder(int)>
	//  202  446:astore          6
		stringbuilder.append("Cannot use sign-in mode: ");
	//  203  448:aload           6
	//  204  450:ldc2            #316 <String "Cannot use sign-in mode: ">
	//  205  453:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//  206  456:pop             
		stringbuilder.append(s);
	//  207  457:aload           6
	//  208  459:aload           4
	//  209  461:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//  210  464:pop             
		stringbuilder.append(". Mode was already set to ");
	//  211  465:aload           6
	//  212  467:ldc2            #322 <String ". Mode was already set to ">
	//  213  470:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//  214  473:pop             
		stringbuilder.append(s1);
	//  215  474:aload           6
	//  216  476:aload           5
	//  217  478:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//  218  481:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//  219  482:new             #286 <Class IllegalStateException>
	//  220  485:dup             
	//  221  486:aload           6
	//  222  488:invokevirtual   #326 <Method String StringBuilder.toString()>
	//  223  491:invokespecial   #291 <Method void IllegalStateException(String)>
	//  224  494:athrow          
	}

	private static String zzh(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 40
	//	               2 36
	//	               3 32
		default:
			return "UNKNOWN";
	//    2   28:ldc2            #328 <String "UNKNOWN">
	//    3   31:areturn         

		case 3: // '\003'
			return "SIGN_IN_MODE_NONE";
	//    4   32:ldc2            #330 <String "SIGN_IN_MODE_NONE">
	//    5   35:areturn         

		case 2: // '\002'
			return "SIGN_IN_MODE_OPTIONAL";
	//    6   36:ldc2            #332 <String "SIGN_IN_MODE_OPTIONAL">
	//    7   39:areturn         

		case 1: // '\001'
			return "SIGN_IN_MODE_REQUIRED";
	//    8   40:ldc2            #334 <String "SIGN_IN_MODE_REQUIRED">
	//    9   43:areturn         
		}
	}

	public final ConnectionResult blockingConnect()
	{
		boolean flag2;
		Looper looper = Looper.myLooper();
	//    0    0:invokestatic    #342 <Method Looper Looper.myLooper()>
	//    1    3:astore_3        
		Looper looper1 = Looper.getMainLooper();
	//    2    4:invokestatic    #345 <Method Looper Looper.getMainLooper()>
	//    3    7:astore          4
		flag2 = true;
	//    4    9:iconst_1        
	//    5   10:istore_2        
		boolean flag;
		if(looper != looper1)
	//*   6   11:aload_3         
	//*   7   12:aload           4
	//*   8   14:if_acmpeq       22
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		Preconditions.checkState(flag, "blockingConnect must not be called on the UI thread");
	//   14   24:iload_1         
	//   15   25:ldc2            #347 <String "blockingConnect must not be called on the UI thread">
	//   16   28:invokestatic    #353 <Method void Preconditions.checkState(boolean, Object)>
		zzga.lock();
	//   17   31:aload_0         
	//   18   32:getfield        #105 <Field Lock zzga>
	//   19   35:invokeinterface #187 <Method void Lock.lock()>
		if(zzde < 0)
			break MISSING_BLOCK_LABEL_69;
	//   20   40:aload_0         
	//   21   41:getfield        #127 <Field int zzde>
	//   22   44:iflt            69
		boolean flag1;
		ConnectionResult connectionresult;
		Exception exception;
		if(zzip != null)
	//*  23   47:aload_0         
	//*  24   48:getfield        #92  <Field Integer zzip>
	//*  25   51:ifnull          172
			flag1 = flag2;
	//   26   54:iload_2         
	//   27   55:istore_1        
		else
	//*  28   56:goto            59
	//*  29   59:iload_1         
	//*  30   60:ldc2            #355 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//*  31   63:invokestatic    #353 <Method void Preconditions.checkState(boolean, Object)>
	//*  32   66:goto            110
	//*  33   69:aload_0         
	//*  34   70:getfield        #92  <Field Integer zzip>
	//*  35   73:ifnonnull       99
	//*  36   76:aload_0         
	//*  37   77:aload_0         
	//*  38   78:getfield        #137 <Field Map zzil>
	//*  39   81:invokeinterface #271 <Method Collection Map.values()>
	//*  40   86:iconst_0        
	//*  41   87:invokestatic    #357 <Method int zza(Iterable, boolean)>
	//*  42   90:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//*  43   93:putfield        #92  <Field Integer zzip>
	//*  44   96:goto            110
	//*  45   99:aload_0         
	//*  46  100:getfield        #92  <Field Integer zzip>
	//*  47  103:invokevirtual   #265 <Method int Integer.intValue()>
	//*  48  106:iconst_2        
	//*  49  107:icmpeq          149
	//*  50  110:aload_0         
	//*  51  111:aload_0         
	//*  52  112:getfield        #92  <Field Integer zzip>
	//*  53  115:invokevirtual   #265 <Method int Integer.intValue()>
	//*  54  118:invokespecial   #359 <Method void zzg(int)>
	//*  55  121:aload_0         
	//*  56  122:getfield        #114 <Field GmsClientEventManager zzie>
	//*  57  125:invokevirtual   #244 <Method void GmsClientEventManager.enableCallbacks()>
	//*  58  128:aload_0         
	//*  59  129:getfield        #67  <Field zzbp zzif>
	//*  60  132:invokeinterface #361 <Method ConnectionResult zzbp.blockingConnect()>
	//*  61  137:astore_3        
	//*  62  138:aload_0         
	//*  63  139:getfield        #105 <Field Lock zzga>
	//*  64  142:invokeinterface #195 <Method void Lock.unlock()>
	//*  65  147:aload_3         
	//*  66  148:areturn         
	//*  67  149:new             #286 <Class IllegalStateException>
	//*  68  152:dup             
	//*  69  153:ldc2            #363 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//*  70  156:invokespecial   #291 <Method void IllegalStateException(String)>
	//*  71  159:athrow          
	//*  72  160:astore_3        
	//*  73  161:aload_0         
	//*  74  162:getfield        #105 <Field Lock zzga>
	//*  75  165:invokeinterface #195 <Method void Lock.unlock()>
	//*  76  170:aload_3         
	//*  77  171:athrow          
			flag1 = false;
	//   78  172:iconst_0        
	//   79  173:istore_1        
		Preconditions.checkState(flag1, "Sign-in mode should have been set explicitly by auto-manage.");
		break MISSING_BLOCK_LABEL_110;
		if(zzip == null)
		{
			zzip = Integer.valueOf(zza(((Iterable) (zzil.values())), false));
			break MISSING_BLOCK_LABEL_110;
		}
		if(zzip.intValue() == 2)
			break MISSING_BLOCK_LABEL_149;
		zzg(zzip.intValue());
		zzie.enableCallbacks();
		connectionresult = zzif.blockingConnect();
		zzga.unlock();
		return connectionresult;
		throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
		exception;
		zzga.unlock();
		throw exception;
	//*  80  174:goto            59
	}

	public final ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		boolean flag;
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #342 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #345 <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       15
			flag = true;
	//    3    9:iconst_1        
	//    4   10:istore          4
		else
	//*   5   12:goto            18
			flag = false;
	//    6   15:iconst_0        
	//    7   16:istore          4
		Preconditions.checkState(flag, "blockingConnect must not be called on the UI thread");
	//    8   18:iload           4
	//    9   20:ldc2            #347 <String "blockingConnect must not be called on the UI thread">
	//   10   23:invokestatic    #353 <Method void Preconditions.checkState(boolean, Object)>
		Preconditions.checkNotNull(((Object) (timeunit)), "TimeUnit must not be null");
	//   11   26:aload_3         
	//   12   27:ldc2            #367 <String "TimeUnit must not be null">
	//   13   30:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   14   33:pop             
		zzga.lock();
	//   15   34:aload_0         
	//   16   35:getfield        #105 <Field Lock zzga>
	//   17   38:invokeinterface #187 <Method void Lock.lock()>
		if(zzip == null)
	//*  18   43:aload_0         
	//*  19   44:getfield        #92  <Field Integer zzip>
	//*  20   47:ifnonnull       73
		{
			zzip = Integer.valueOf(zza(((Iterable) (zzil.values())), false));
	//   21   50:aload_0         
	//   22   51:aload_0         
	//   23   52:getfield        #137 <Field Map zzil>
	//   24   55:invokeinterface #271 <Method Collection Map.values()>
	//   25   60:iconst_0        
	//   26   61:invokestatic    #357 <Method int zza(Iterable, boolean)>
	//   27   64:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   28   67:putfield        #92  <Field Integer zzip>
			break MISSING_BLOCK_LABEL_84;
	//   29   70:goto            84
		}
		if(zzip.intValue() == 2)
			break MISSING_BLOCK_LABEL_125;
	//   30   73:aload_0         
	//   31   74:getfield        #92  <Field Integer zzip>
	//   32   77:invokevirtual   #265 <Method int Integer.intValue()>
	//   33   80:iconst_2        
	//   34   81:icmpeq          125
		zzg(zzip.intValue());
	//   35   84:aload_0         
	//   36   85:aload_0         
	//   37   86:getfield        #92  <Field Integer zzip>
	//   38   89:invokevirtual   #265 <Method int Integer.intValue()>
	//   39   92:invokespecial   #359 <Method void zzg(int)>
		zzie.enableCallbacks();
	//   40   95:aload_0         
	//   41   96:getfield        #114 <Field GmsClientEventManager zzie>
	//   42   99:invokevirtual   #244 <Method void GmsClientEventManager.enableCallbacks()>
		timeunit = ((TimeUnit) (zzif.blockingConnect(l, timeunit)));
	//   43  102:aload_0         
	//   44  103:getfield        #67  <Field zzbp zzif>
	//   45  106:lload_1         
	//   46  107:aload_3         
	//   47  108:invokeinterface #373 <Method ConnectionResult zzbp.blockingConnect(long, TimeUnit)>
	//   48  113:astore_3        
		zzga.unlock();
	//   49  114:aload_0         
	//   50  115:getfield        #105 <Field Lock zzga>
	//   51  118:invokeinterface #195 <Method void Lock.unlock()>
		return ((ConnectionResult) (timeunit));
	//   52  123:aload_3         
	//   53  124:areturn         
		throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   54  125:new             #286 <Class IllegalStateException>
	//   55  128:dup             
	//   56  129:ldc2            #363 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   57  132:invokespecial   #291 <Method void IllegalStateException(String)>
	//   58  135:athrow          
		timeunit;
	//   59  136:astore_3        
		zzga.unlock();
	//   60  137:aload_0         
	//   61  138:getfield        #105 <Field Lock zzga>
	//   62  141:invokeinterface #195 <Method void Lock.unlock()>
		throw timeunit;
	//   63  146:aload_3         
	//   64  147:athrow          
	}

	public final PendingResult clearDefaultAccountAndReconnect()
	{
		Preconditions.checkState(((GoogleApiClient)this).isConnected(), "GoogleApiClient is not connected yet.");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #379 <Method boolean GoogleApiClient.isConnected()>
	//    2    4:ldc2            #381 <String "GoogleApiClient is not connected yet.">
	//    3    7:invokestatic    #353 <Method void Preconditions.checkState(boolean, Object)>
		boolean flag;
		if(zzip.intValue() != 2)
	//*   4   10:aload_0         
	//*   5   11:getfield        #92  <Field Integer zzip>
	//*   6   14:invokevirtual   #265 <Method int Integer.intValue()>
	//*   7   17:iconst_2        
	//*   8   18:icmpeq          26
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		else
	//*  11   23:goto            28
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		Preconditions.checkState(flag, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
	//   14   28:iload_1         
	//   15   29:ldc2            #383 <String "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API">
	//   16   32:invokestatic    #353 <Method void Preconditions.checkState(boolean, Object)>
		StatusPendingResult statuspendingresult = new StatusPendingResult(((GoogleApiClient) (this)));
	//   17   35:new             #385 <Class StatusPendingResult>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #388 <Method void StatusPendingResult(GoogleApiClient)>
	//   21   43:astore_2        
		if(zzil.containsKey(((Object) (Common.CLIENT_KEY))))
	//*  22   44:aload_0         
	//*  23   45:getfield        #137 <Field Map zzil>
	//*  24   48:getstatic       #392 <Field com.google.android.gms.common.api.Api$ClientKey Common.CLIENT_KEY>
	//*  25   51:invokeinterface #396 <Method boolean Map.containsKey(Object)>
	//*  26   56:ifeq            68
		{
			zza(((GoogleApiClient) (this)), statuspendingresult, false);
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:iconst_0        
	//   31   63:invokespecial   #238 <Method void zza(GoogleApiClient, StatusPendingResult, boolean)>
			return ((PendingResult) (statuspendingresult));
	//   32   66:aload_2         
	//   33   67:areturn         
		} else
		{
			AtomicReference atomicreference = new AtomicReference();
	//   34   68:new             #398 <Class AtomicReference>
	//   35   71:dup             
	//   36   72:invokespecial   #399 <Method void AtomicReference()>
	//   37   75:astore_3        
			Object obj = ((Object) (new zzax(this, atomicreference, statuspendingresult)));
	//   38   76:new             #401 <Class zzax>
	//   39   79:dup             
	//   40   80:aload_0         
	//   41   81:aload_3         
	//   42   82:aload_2         
	//   43   83:invokespecial   #404 <Method void zzax(zzav, AtomicReference, StatusPendingResult)>
	//   44   86:astore          4
			zzay zzay1 = new zzay(this, statuspendingresult);
	//   45   88:new             #406 <Class zzay>
	//   46   91:dup             
	//   47   92:aload_0         
	//   48   93:aload_2         
	//   49   94:invokespecial   #409 <Method void zzay(zzav, StatusPendingResult)>
	//   50   97:astore          5
			obj = ((Object) ((new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext)).addApi(Common.API).addConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (zzay1))).setHandler(((android.os.Handler) (zzij))).build()));
	//   51   99:new             #411 <Class com.google.android.gms.common.api.GoogleApiClient$Builder>
	//   52  102:dup             
	//   53  103:aload_0         
	//   54  104:getfield        #103 <Field Context mContext>
	//   55  107:invokespecial   #414 <Method void com.google.android.gms.common.api.GoogleApiClient$Builder(Context)>
	//   56  110:getstatic       #418 <Field Api Common.API>
	//   57  113:invokevirtual   #422 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addApi(Api)>
	//   58  116:aload           4
	//   59  118:invokevirtual   #426 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//   60  121:aload           5
	//   61  123:invokevirtual   #430 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   62  126:aload_0         
	//   63  127:getfield        #123 <Field zzba zzij>
	//   64  130:invokevirtual   #434 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.setHandler(android.os.Handler)>
	//   65  133:invokevirtual   #438 <Method GoogleApiClient com.google.android.gms.common.api.GoogleApiClient$Builder.build()>
	//   66  136:astore          4
			atomicreference.set(obj);
	//   67  138:aload_3         
	//   68  139:aload           4
	//   69  141:invokevirtual   #442 <Method void AtomicReference.set(Object)>
			((GoogleApiClient) (obj)).connect();
	//   70  144:aload           4
	//   71  146:invokevirtual   #443 <Method void GoogleApiClient.connect()>
			return ((PendingResult) (statuspendingresult));
	//   72  149:aload_2         
	//   73  150:areturn         
		}
	}

	public final void connect()
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		int i = zzde;
	//    3    9:aload_0         
	//    4   10:getfield        #127 <Field int zzde>
	//    5   13:istore_1        
		boolean flag;
		flag = false;
	//    6   14:iconst_0        
	//    7   15:istore_2        
		if(i < 0)
			break MISSING_BLOCK_LABEL_39;
	//    8   16:iload_1         
	//    9   17:iflt            39
		if(zzip != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #92  <Field Integer zzip>
	//*  12   24:ifnull          29
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_2        
		Preconditions.checkState(flag, "Sign-in mode should have been set explicitly by auto-manage.");
	//   15   29:iload_2         
	//   16   30:ldc2            #355 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//   17   33:invokestatic    #353 <Method void Preconditions.checkState(boolean, Object)>
		break MISSING_BLOCK_LABEL_80;
	//   18   36:goto            80
		if(zzip == null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #92  <Field Integer zzip>
	//*  21   43:ifnonnull       69
		{
			zzip = Integer.valueOf(zza(((Iterable) (zzil.values())), false));
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #137 <Field Map zzil>
	//   25   51:invokeinterface #271 <Method Collection Map.values()>
	//   26   56:iconst_0        
	//   27   57:invokestatic    #357 <Method int zza(Iterable, boolean)>
	//   28   60:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   29   63:putfield        #92  <Field Integer zzip>
			break MISSING_BLOCK_LABEL_80;
	//   30   66:goto            80
		}
		if(zzip.intValue() == 2)
			break MISSING_BLOCK_LABEL_101;
	//   31   69:aload_0         
	//   32   70:getfield        #92  <Field Integer zzip>
	//   33   73:invokevirtual   #265 <Method int Integer.intValue()>
	//   34   76:iconst_2        
	//   35   77:icmpeq          101
		((GoogleApiClient)this).connect(zzip.intValue());
	//   36   80:aload_0         
	//   37   81:aload_0         
	//   38   82:getfield        #92  <Field Integer zzip>
	//   39   85:invokevirtual   #265 <Method int Integer.intValue()>
	//   40   88:invokevirtual   #446 <Method void GoogleApiClient.connect(int)>
		zzga.unlock();
	//   41   91:aload_0         
	//   42   92:getfield        #105 <Field Lock zzga>
	//   43   95:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   44  100:return          
		throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   45  101:new             #286 <Class IllegalStateException>
	//   46  104:dup             
	//   47  105:ldc2            #448 <String "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   48  108:invokespecial   #291 <Method void IllegalStateException(String)>
	//   49  111:athrow          
		Exception exception;
		exception;
	//   50  112:astore_3        
		zzga.unlock();
	//   51  113:aload_0         
	//   52  114:getfield        #105 <Field Lock zzga>
	//   53  117:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   54  122:aload_3         
	//   55  123:athrow          
	}

	public final void connect(int i)
	{
		boolean flag;
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		boolean flag1 = true;
	//    3    9:iconst_1        
	//    4   10:istore_3        
		flag = flag1;
	//    5   11:iload_3         
	//    6   12:istore_2        
		if(i != 3)
	//*   7   13:iload_1         
	//*   8   14:iconst_3        
	//*   9   15:icmpeq          37
		{
			flag = flag1;
	//   10   18:iload_3         
	//   11   19:istore_2        
			if(i != 1)
	//*  12   20:iload_1         
	//*  13   21:iconst_1        
	//*  14   22:icmpeq          37
				if(i == 2)
	//*  15   25:iload_1         
	//*  16   26:iconst_2        
	//*  17   27:icmpne          35
					flag = flag1;
	//   18   30:iload_3         
	//   19   31:istore_2        
				else
	//*  20   32:goto            37
					flag = false;
	//   21   35:iconst_0        
	//   22   36:istore_2        
		}
		StringBuilder stringbuilder = new StringBuilder(33);
	//   23   37:new             #304 <Class StringBuilder>
	//   24   40:dup             
	//   25   41:bipush          33
	//   26   43:invokespecial   #314 <Method void StringBuilder(int)>
	//   27   46:astore          4
		stringbuilder.append("Illegal sign-in mode: ");
	//   28   48:aload           4
	//   29   50:ldc2            #450 <String "Illegal sign-in mode: ">
	//   30   53:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//   31   56:pop             
		stringbuilder.append(i);
	//   32   57:aload           4
	//   33   59:iload_1         
	//   34   60:invokevirtual   #453 <Method StringBuilder StringBuilder.append(int)>
	//   35   63:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   36   64:iload_2         
	//   37   65:aload           4
	//   38   67:invokevirtual   #326 <Method String StringBuilder.toString()>
	//   39   70:invokestatic    #456 <Method void Preconditions.checkArgument(boolean, Object)>
		zzg(i);
	//   40   73:aload_0         
	//   41   74:iload_1         
	//   42   75:invokespecial   #359 <Method void zzg(int)>
		zzax();
	//   43   78:aload_0         
	//   44   79:invokespecial   #192 <Method void zzax()>
		zzga.unlock();
	//   45   82:aload_0         
	//   46   83:getfield        #105 <Field Lock zzga>
	//   47   86:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   48   91:return          
		Exception exception;
		exception;
	//   49   92:astore          4
		zzga.unlock();
	//   50   94:aload_0         
	//   51   95:getfield        #105 <Field Lock zzga>
	//   52   98:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   53  103:aload           4
	//   54  105:athrow          
	}

	public final void disconnect()
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		zzir.release();
	//    3    9:aload_0         
	//    4   10:getfield        #146 <Field zzck zzir>
	//    5   13:invokevirtual   #460 <Method void zzck.release()>
		if(zzif != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #67  <Field zzbp zzif>
	//*   8   20:ifnull          32
			zzif.disconnect();
	//    9   23:aload_0         
	//   10   24:getfield        #67  <Field zzbp zzif>
	//   11   27:invokeinterface #462 <Method void zzbp.disconnect()>
		zzin.release();
	//   12   32:aload_0         
	//   13   33:getfield        #90  <Field ListenerHolders zzin>
	//   14   36:invokevirtual   #463 <Method void ListenerHolders.release()>
		BaseImplementation.ApiMethodImpl apimethodimpl;
		for(Iterator iterator = zzgo.iterator(); iterator.hasNext(); ((PendingResult) (apimethodimpl)).cancel())
	//*  15   39:aload_0         
	//*  16   40:getfield        #72  <Field Queue zzgo>
	//*  17   43:invokeinterface #466 <Method Iterator Queue.iterator()>
	//*  18   48:astore_1        
	//*  19   49:aload_1         
	//*  20   50:invokeinterface #158 <Method boolean Iterator.hasNext()>
	//*  21   55:ifeq            80
		{
			apimethodimpl = (BaseImplementation.ApiMethodImpl)iterator.next();
	//   22   58:aload_1         
	//   23   59:invokeinterface #162 <Method Object Iterator.next()>
	//   24   64:checkcast       #468 <Class BaseImplementation$ApiMethodImpl>
	//   25   67:astore_2        
			((BasePendingResult) (apimethodimpl)).zza(((zzcn) (null)));
	//   26   68:aload_2         
	//   27   69:aconst_null     
	//   28   70:invokevirtual   #473 <Method void BasePendingResult.zza(zzcn)>
		}

	//   29   73:aload_2         
	//   30   74:invokevirtual   #476 <Method void PendingResult.cancel()>
	//*  31   77:goto            49
		zzbp zzbp1;
		zzgo.clear();
	//   32   80:aload_0         
	//   33   81:getfield        #72  <Field Queue zzgo>
	//   34   84:invokeinterface #479 <Method void Queue.clear()>
		zzbp1 = zzif;
	//   35   89:aload_0         
	//   36   90:getfield        #67  <Field zzbp zzif>
	//   37   93:astore_1        
		if(zzbp1 != null) goto _L2; else goto _L1
	//   38   94:aload_1         
	//   39   95:ifnonnull       108
_L1:
		zzga.unlock();
	//   40   98:aload_0         
	//   41   99:getfield        #105 <Field Lock zzga>
	//   42  102:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   43  107:return          
_L2:
		zzaz();
	//   44  108:aload_0         
	//   45  109:invokevirtual   #254 <Method boolean zzaz()>
	//   46  112:pop             
		zzie.disableCallbacks();
	//   47  113:aload_0         
	//   48  114:getfield        #114 <Field GmsClientEventManager zzie>
	//   49  117:invokevirtual   #482 <Method void GmsClientEventManager.disableCallbacks()>
		if(true) goto _L1; else goto _L3
	//   50  120:goto            98
_L3:
		Exception exception;
		exception;
	//   51  123:astore_1        
		zzga.unlock();
	//   52  124:aload_0         
	//   53  125:getfield        #105 <Field Lock zzga>
	//   54  128:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   55  133:aload_1         
	//   56  134:athrow          
	}

	public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.append(((CharSequence) (s))).append("mContext=").println(((Object) (mContext)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #489 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    3    5:ldc2            #491 <String "mContext=">
	//    4    8:invokevirtual   #489 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    5   11:aload_0         
	//    6   12:getfield        #103 <Field Context mContext>
	//    7   15:invokevirtual   #494 <Method void PrintWriter.println(Object)>
		printwriter.append(((CharSequence) (s))).append("mResuming=").print(zzig);
	//    8   18:aload_3         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #489 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   11   23:ldc2            #496 <String "mResuming=">
	//   12   26:invokevirtual   #489 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   13   29:aload_0         
	//   14   30:getfield        #189 <Field boolean zzig>
	//   15   33:invokevirtual   #500 <Method void PrintWriter.print(boolean)>
		printwriter.append(" mWorkQueue.size()=").print(zzgo.size());
	//   16   36:aload_3         
	//   17   37:ldc2            #502 <String " mWorkQueue.size()=">
	//   18   40:invokevirtual   #489 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   19   43:aload_0         
	//   20   44:getfield        #72  <Field Queue zzgo>
	//   21   47:invokeinterface #505 <Method int Queue.size()>
	//   22   52:invokevirtual   #507 <Method void PrintWriter.print(int)>
		Object obj = ((Object) (zzir));
	//   23   55:aload_0         
	//   24   56:getfield        #146 <Field zzck zzir>
	//   25   59:astore          5
		printwriter.append(" mUnconsumedApiCalls.size()=").println(((zzck) (obj)).zzmo.size());
	//   26   61:aload_3         
	//   27   62:ldc2            #509 <String " mUnconsumedApiCalls.size()=">
	//   28   65:invokevirtual   #489 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   29   68:aload           5
	//   30   70:getfield        #512 <Field Set zzck.zzmo>
	//   31   73:invokeinterface #515 <Method int Set.size()>
	//   32   78:invokevirtual   #517 <Method void PrintWriter.println(int)>
		obj = ((Object) (zzif));
	//   33   81:aload_0         
	//   34   82:getfield        #67  <Field zzbp zzif>
	//   35   85:astore          5
		if(obj != null)
	//*  36   87:aload           5
	//*  37   89:ifnull          104
			((zzbp) (obj)).dump(s, filedescriptor, printwriter, as);
	//   38   92:aload           5
	//   39   94:aload_1         
	//   40   95:aload_2         
	//   41   96:aload_3         
	//   42   97:aload           4
	//   43   99:invokeinterface #519 <Method void zzbp.dump(String, FileDescriptor, PrintWriter, String[])>
	//   44  104:return          
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		boolean flag;
		if(apimethodimpl.getClientKey() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #525 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Preconditions.checkArgument(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
	//    8   14:iload_2         
	//    9   15:ldc2            #527 <String "This task can not be enqueued (it's probably a Batch or malformed)">
	//   10   18:invokestatic    #456 <Method void Preconditions.checkArgument(boolean, Object)>
		flag = zzil.containsKey(((Object) (apimethodimpl.getClientKey())));
	//   11   21:aload_0         
	//   12   22:getfield        #137 <Field Map zzil>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #525 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   15   29:invokeinterface #396 <Method boolean Map.containsKey(Object)>
	//   16   34:istore_2        
		String s;
		if(apimethodimpl.getApi() != null)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #531 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//*  19   39:ifnull          53
			s = apimethodimpl.getApi().getName();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #531 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//   22   46:invokevirtual   #536 <Method String Api.getName()>
	//   23   49:astore_3        
		else
	//*  24   50:goto            57
			s = "the API";
	//   25   53:ldc2            #538 <String "the API">
	//   26   56:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 65);
	//   27   57:new             #304 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:aload_3         
	//   30   62:invokestatic    #309 <Method String String.valueOf(Object)>
	//   31   65:invokevirtual   #312 <Method int String.length()>
	//   32   68:bipush          65
	//   33   70:iadd            
	//   34   71:invokespecial   #314 <Method void StringBuilder(int)>
	//   35   74:astore          4
		stringbuilder.append("GoogleApiClient is not configured to use ");
	//   36   76:aload           4
	//   37   78:ldc2            #540 <String "GoogleApiClient is not configured to use ">
	//   38   81:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//   39   84:pop             
		stringbuilder.append(s);
	//   40   85:aload           4
	//   41   87:aload_3         
	//   42   88:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
		stringbuilder.append(" required for this call.");
	//   44   92:aload           4
	//   45   94:ldc2            #542 <String " required for this call.">
	//   46   97:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//   47  100:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   48  101:iload_2         
	//   49  102:aload           4
	//   50  104:invokevirtual   #326 <Method String StringBuilder.toString()>
	//   51  107:invokestatic    #456 <Method void Preconditions.checkArgument(boolean, Object)>
		zzga.lock();
	//   52  110:aload_0         
	//   53  111:getfield        #105 <Field Lock zzga>
	//   54  114:invokeinterface #187 <Method void Lock.lock()>
		if(zzif != null) goto _L2; else goto _L1
	//   55  119:aload_0         
	//   56  120:getfield        #67  <Field zzbp zzif>
	//   57  123:ifnonnull       148
_L1:
		zzgo.add(((Object) (apimethodimpl)));
	//   58  126:aload_0         
	//   59  127:getfield        #72  <Field Queue zzgo>
	//   60  130:aload_1         
	//   61  131:invokeinterface #545 <Method boolean Queue.add(Object)>
	//   62  136:pop             
_L4:
		zzga.unlock();
	//   63  137:aload_0         
	//   64  138:getfield        #105 <Field Lock zzga>
	//   65  141:invokeinterface #195 <Method void Lock.unlock()>
		return apimethodimpl;
	//   66  146:aload_1         
	//   67  147:areturn         
_L2:
		apimethodimpl = zzif.enqueue(apimethodimpl);
	//   68  148:aload_0         
	//   69  149:getfield        #67  <Field zzbp zzif>
	//   70  152:aload_1         
	//   71  153:invokeinterface #547 <Method BaseImplementation$ApiMethodImpl zzbp.enqueue(BaseImplementation$ApiMethodImpl)>
	//   72  158:astore_1        
		if(true) goto _L4; else goto _L3
	//   73  159:goto            137
_L3:
		apimethodimpl;
	//   74  162:astore_1        
		zzga.unlock();
	//   75  163:aload_0         
	//   76  164:getfield        #105 <Field Lock zzga>
	//   77  167:invokeinterface #195 <Method void Lock.unlock()>
		throw apimethodimpl;
	//   78  172:aload_1         
	//   79  173:athrow          
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		boolean flag;
		if(apimethodimpl.getClientKey() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #525 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Preconditions.checkArgument(flag, "This task can not be executed (it's probably a Batch or malformed)");
	//    8   14:iload_2         
	//    9   15:ldc2            #551 <String "This task can not be executed (it's probably a Batch or malformed)">
	//   10   18:invokestatic    #456 <Method void Preconditions.checkArgument(boolean, Object)>
		flag = zzil.containsKey(((Object) (apimethodimpl.getClientKey())));
	//   11   21:aload_0         
	//   12   22:getfield        #137 <Field Map zzil>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #525 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   15   29:invokeinterface #396 <Method boolean Map.containsKey(Object)>
	//   16   34:istore_2        
		String s;
		if(apimethodimpl.getApi() != null)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #531 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//*  19   39:ifnull          53
			s = apimethodimpl.getApi().getName();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #531 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//   22   46:invokevirtual   #536 <Method String Api.getName()>
	//   23   49:astore_3        
		else
	//*  24   50:goto            57
			s = "the API";
	//   25   53:ldc2            #538 <String "the API">
	//   26   56:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 65);
	//   27   57:new             #304 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:aload_3         
	//   30   62:invokestatic    #309 <Method String String.valueOf(Object)>
	//   31   65:invokevirtual   #312 <Method int String.length()>
	//   32   68:bipush          65
	//   33   70:iadd            
	//   34   71:invokespecial   #314 <Method void StringBuilder(int)>
	//   35   74:astore          4
		stringbuilder.append("GoogleApiClient is not configured to use ");
	//   36   76:aload           4
	//   37   78:ldc2            #540 <String "GoogleApiClient is not configured to use ">
	//   38   81:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//   39   84:pop             
		stringbuilder.append(s);
	//   40   85:aload           4
	//   41   87:aload_3         
	//   42   88:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
		stringbuilder.append(" required for this call.");
	//   44   92:aload           4
	//   45   94:ldc2            #542 <String " required for this call.">
	//   46   97:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//   47  100:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   48  101:iload_2         
	//   49  102:aload           4
	//   50  104:invokevirtual   #326 <Method String StringBuilder.toString()>
	//   51  107:invokestatic    #456 <Method void Preconditions.checkArgument(boolean, Object)>
		zzga.lock();
	//   52  110:aload_0         
	//   53  111:getfield        #105 <Field Lock zzga>
	//   54  114:invokeinterface #187 <Method void Lock.lock()>
		if(zzif == null)
			break MISSING_BLOCK_LABEL_214;
	//   55  119:aload_0         
	//   56  120:getfield        #67  <Field zzbp zzif>
	//   57  123:ifnull          214
		if(!zzig)
			break MISSING_BLOCK_LABEL_200;
	//   58  126:aload_0         
	//   59  127:getfield        #189 <Field boolean zzig>
	//   60  130:ifeq            200
		zzgo.add(((Object) (apimethodimpl)));
	//   61  133:aload_0         
	//   62  134:getfield        #72  <Field Queue zzgo>
	//   63  137:aload_1         
	//   64  138:invokeinterface #545 <Method boolean Queue.add(Object)>
	//   65  143:pop             
_L2:
		BaseImplementation.ApiMethodImpl apimethodimpl1 = apimethodimpl;
	//   66  144:aload_1         
	//   67  145:astore_3        
		if(zzgo.isEmpty())
			break; /* Loop/switch isn't completed */
	//   68  146:aload_0         
	//   69  147:getfield        #72  <Field Queue zzgo>
	//   70  150:invokeinterface #554 <Method boolean Queue.isEmpty()>
	//   71  155:ifne            189
		apimethodimpl1 = (BaseImplementation.ApiMethodImpl)zzgo.remove();
	//   72  158:aload_0         
	//   73  159:getfield        #72  <Field Queue zzgo>
	//   74  162:invokeinterface #557 <Method Object Queue.remove()>
	//   75  167:checkcast       #468 <Class BaseImplementation$ApiMethodImpl>
	//   76  170:astore_3        
		zzir.zzb(((BasePendingResult) (apimethodimpl1)));
	//   77  171:aload_0         
	//   78  172:getfield        #146 <Field zzck zzir>
	//   79  175:aload_3         
	//   80  176:invokevirtual   #560 <Method void zzck.zzb(BasePendingResult)>
		apimethodimpl1.setFailedResult(Status.RESULT_INTERNAL_ERROR);
	//   81  179:aload_3         
	//   82  180:getstatic       #566 <Field Status Status.RESULT_INTERNAL_ERROR>
	//   83  183:invokevirtual   #570 <Method void BaseImplementation$ApiMethodImpl.setFailedResult(Status)>
		if(true) goto _L2; else goto _L1
	//   84  186:goto            144
_L1:
		zzga.unlock();
	//   85  189:aload_0         
	//   86  190:getfield        #105 <Field Lock zzga>
	//   87  193:invokeinterface #195 <Method void Lock.unlock()>
		return apimethodimpl1;
	//   88  198:aload_3         
	//   89  199:areturn         
		apimethodimpl1 = zzif.execute(apimethodimpl);
	//   90  200:aload_0         
	//   91  201:getfield        #67  <Field zzbp zzif>
	//   92  204:aload_1         
	//   93  205:invokeinterface #572 <Method BaseImplementation$ApiMethodImpl zzbp.execute(BaseImplementation$ApiMethodImpl)>
	//   94  210:astore_3        
		  goto _L1
	//*  95  211:goto            189
		throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//   96  214:new             #286 <Class IllegalStateException>
	//   97  217:dup             
	//   98  218:ldc2            #381 <String "GoogleApiClient is not connected yet.">
	//   99  221:invokespecial   #291 <Method void IllegalStateException(String)>
	//  100  224:athrow          
		apimethodimpl;
	//  101  225:astore_1        
		zzga.unlock();
	//  102  226:aload_0         
	//  103  227:getfield        #105 <Field Lock zzga>
	//  104  230:invokeinterface #195 <Method void Lock.unlock()>
		throw apimethodimpl;
	//  105  235:aload_1         
	//  106  236:athrow          
	}

	public final com.google.android.gms.common.api.Api.Client getClient(com.google.android.gms.common.api.Api.AnyClientKey anyclientkey)
	{
		anyclientkey = ((com.google.android.gms.common.api.Api.AnyClientKey) ((com.google.android.gms.common.api.Api.Client)zzil.get(((Object) (anyclientkey)))));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Map zzil>
	//    2    4:aload_1         
	//    3    5:invokeinterface #579 <Method Object Map.get(Object)>
	//    4   10:checkcast       #202 <Class com.google.android.gms.common.api.Api$Client>
	//    5   13:astore_1        
		Preconditions.checkNotNull(((Object) (anyclientkey)), "Appropriate Api was not requested.");
	//    6   14:aload_1         
	//    7   15:ldc2            #581 <String "Appropriate Api was not requested.">
	//    8   18:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   21:pop             
		return ((com.google.android.gms.common.api.Api.Client) (anyclientkey));
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	public final ConnectionResult getConnectionResult(Api api)
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		if(((GoogleApiClient)this).isConnected() || zzig)
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #379 <Method boolean GoogleApiClient.isConnected()>
	//*   5   13:ifne            37
	//*   6   16:aload_0         
	//*   7   17:getfield        #189 <Field boolean zzig>
	//*   8   20:ifeq            26
			break MISSING_BLOCK_LABEL_37;
	//    9   23:goto            37
		throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
	//   10   26:new             #286 <Class IllegalStateException>
	//   11   29:dup             
	//   12   30:ldc2            #586 <String "Cannot invoke getConnectionResult unless GoogleApiClient is connected">
	//   13   33:invokespecial   #291 <Method void IllegalStateException(String)>
	//   14   36:athrow          
		ConnectionResult connectionresult;
		if(!zzil.containsKey(((Object) (api.getClientKey()))))
			break MISSING_BLOCK_LABEL_153;
	//   15   37:aload_0         
	//   16   38:getfield        #137 <Field Map zzil>
	//   17   41:aload_1         
	//   18   42:invokevirtual   #587 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   19   45:invokeinterface #396 <Method boolean Map.containsKey(Object)>
	//   20   50:ifeq            153
		connectionresult = zzif.getConnectionResult(api);
	//   21   53:aload_0         
	//   22   54:getfield        #67  <Field zzbp zzif>
	//   23   57:aload_1         
	//   24   58:invokeinterface #589 <Method ConnectionResult zzbp.getConnectionResult(Api)>
	//   25   63:astore_2        
		if(connectionresult != null) goto _L2; else goto _L1
	//   26   64:aload_2         
	//   27   65:ifnonnull       142
_L1:
		if(!zzig) goto _L4; else goto _L3
	//   28   68:aload_0         
	//   29   69:getfield        #189 <Field boolean zzig>
	//   30   72:ifeq            90
_L3:
		api = ((Api) (ConnectionResult.RESULT_SUCCESS));
	//   31   75:getstatic       #595 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   32   78:astore_1        
_L5:
		zzga.unlock();
	//   33   79:aload_0         
	//   34   80:getfield        #105 <Field Lock zzga>
	//   35   83:invokeinterface #195 <Method void Lock.unlock()>
		return ((ConnectionResult) (api));
	//   36   88:aload_1         
	//   37   89:areturn         
_L4:
		Log.w("GoogleApiClientImpl", zzbb());
	//   38   90:ldc2            #597 <String "GoogleApiClientImpl">
	//   39   93:aload_0         
	//   40   94:invokevirtual   #600 <Method String zzbb()>
	//   41   97:invokestatic    #606 <Method int Log.w(String, String)>
	//   42  100:pop             
		Log.wtf("GoogleApiClientImpl", String.valueOf(((Object) (api.getName()))).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), ((Throwable) (new Exception())));
	//   43  101:ldc2            #597 <String "GoogleApiClientImpl">
	//   44  104:aload_1         
	//   45  105:invokevirtual   #536 <Method String Api.getName()>
	//   46  108:invokestatic    #309 <Method String String.valueOf(Object)>
	//   47  111:ldc2            #608 <String " requested in getConnectionResult is not connected but is not present in the failed  connections map">
	//   48  114:invokevirtual   #612 <Method String String.concat(String)>
	//   49  117:new             #614 <Class Exception>
	//   50  120:dup             
	//   51  121:invokespecial   #615 <Method void Exception()>
	//   52  124:invokestatic    #619 <Method int Log.wtf(String, String, Throwable)>
	//   53  127:pop             
		api = ((Api) (new ConnectionResult(8, ((android.app.PendingIntent) (null)))));
	//   54  128:new             #591 <Class ConnectionResult>
	//   55  131:dup             
	//   56  132:bipush          8
	//   57  134:aconst_null     
	//   58  135:invokespecial   #622 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   59  138:astore_1        
		if(true) goto _L5; else goto _L2
	//   60  139:goto            79
_L2:
		zzga.unlock();
	//   61  142:aload_0         
	//   62  143:getfield        #105 <Field Lock zzga>
	//   63  146:invokeinterface #195 <Method void Lock.unlock()>
		return connectionresult;
	//   64  151:aload_2         
	//   65  152:areturn         
		throw new IllegalArgumentException(String.valueOf(((Object) (api.getName()))).concat(" was never registered with GoogleApiClient"));
	//   66  153:new             #624 <Class IllegalArgumentException>
	//   67  156:dup             
	//   68  157:aload_1         
	//   69  158:invokevirtual   #536 <Method String Api.getName()>
	//   70  161:invokestatic    #309 <Method String String.valueOf(Object)>
	//   71  164:ldc2            #626 <String " was never registered with GoogleApiClient">
	//   72  167:invokevirtual   #612 <Method String String.concat(String)>
	//   73  170:invokespecial   #627 <Method void IllegalArgumentException(String)>
	//   74  173:athrow          
		api;
	//   75  174:astore_1        
		zzga.unlock();
	//   76  175:aload_0         
	//   77  176:getfield        #105 <Field Lock zzga>
	//   78  179:invokeinterface #195 <Method void Lock.unlock()>
		throw api;
	//   79  184:aload_1         
	//   80  185:athrow          
	}

	public final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Context mContext>
	//    2    4:areturn         
	}

	public final Looper getLooper()
	{
		return zzcn;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Looper zzcn>
	//    2    4:areturn         
	}

	public final boolean hasApi(Api api)
	{
		return zzil.containsKey(((Object) (api.getClientKey())));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Map zzil>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #587 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    4    8:invokeinterface #396 <Method boolean Map.containsKey(Object)>
	//    5   13:ireturn         
	}

	public final boolean hasConnectedApi(Api api)
	{
		if(!((GoogleApiClient)this).isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #379 <Method boolean GoogleApiClient.isConnected()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		api = ((Api) ((com.google.android.gms.common.api.Api.Client)zzil.get(((Object) (api.getClientKey())))));
	//    5    9:aload_0         
	//    6   10:getfield        #137 <Field Map zzil>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #587 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    9   17:invokeinterface #579 <Method Object Map.get(Object)>
	//   10   22:checkcast       #202 <Class com.google.android.gms.common.api.Api$Client>
	//   11   25:astore_1        
		return api != null && ((com.google.android.gms.common.api.Api.Client) (api)).isConnected();
	//   12   26:aload_1         
	//   13   27:ifnull          41
	//   14   30:aload_1         
	//   15   31:invokeinterface #636 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//   16   36:ifeq            41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	public final boolean isConnected()
	{
		zzbp zzbp1 = zzif;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zzbp zzif>
	//    2    4:astore_1        
		return zzbp1 != null && zzbp1.isConnected();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #637 <Method boolean zzbp.isConnected()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public final boolean isConnecting()
	{
		zzbp zzbp1 = zzif;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zzbp zzif>
	//    2    4:astore_1        
		return zzbp1 != null && zzbp1.isConnecting();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #640 <Method boolean zzbp.isConnecting()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		return zzie.isConnectionCallbacksRegistered(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #644 <Method boolean GmsClientEventManager.isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:ireturn         
	}

	public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return zzie.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #648 <Method boolean GmsClientEventManager.isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:ireturn         
	}

	public final boolean maybeSignIn(SignInConnectionListener signinconnectionlistener)
	{
		zzbp zzbp1 = zzif;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zzbp zzif>
	//    2    4:astore_2        
		return zzbp1 != null && zzbp1.maybeSignIn(signinconnectionlistener);
	//    3    5:aload_2         
	//    4    6:ifnull          21
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #652 <Method boolean zzbp.maybeSignIn(SignInConnectionListener)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public final void maybeSignOut()
	{
		zzbp zzbp1 = zzif;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zzbp zzif>
	//    2    4:astore_1        
		if(zzbp1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			zzbp1.maybeSignOut();
	//    5    9:aload_1         
	//    6   10:invokeinterface #655 <Method void zzbp.maybeSignOut()>
	//    7   15:return          
	}

	public final void reconnect()
	{
		((GoogleApiClient)this).disconnect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #657 <Method void GoogleApiClient.disconnect()>
		((GoogleApiClient)this).connect();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #443 <Method void GoogleApiClient.connect()>
	//    4    8:return          
	}

	public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zzie.registerConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #168 <Method void GmsClientEventManager.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzie.registerConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #174 <Method void GmsClientEventManager.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public final ListenerHolder registerListener(Object obj)
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		obj = ((Object) (zzin.zza(obj, zzcn, "NO_TYPE")));
	//    3    9:aload_0         
	//    4   10:getfield        #90  <Field ListenerHolders zzin>
	//    5   13:aload_1         
	//    6   14:aload_0         
	//    7   15:getfield        #116 <Field Looper zzcn>
	//    8   18:ldc2            #661 <String "NO_TYPE">
	//    9   21:invokevirtual   #664 <Method ListenerHolder ListenerHolders.zza(Object, Looper, String)>
	//   10   24:astore_1        
		zzga.unlock();
	//   11   25:aload_0         
	//   12   26:getfield        #105 <Field Lock zzga>
	//   13   29:invokeinterface #195 <Method void Lock.unlock()>
		return ((ListenerHolder) (obj));
	//   14   34:aload_1         
	//   15   35:areturn         
		obj;
	//   16   36:astore_1        
		zzga.unlock();
	//   17   37:aload_0         
	//   18   38:getfield        #105 <Field Lock zzga>
	//   19   41:invokeinterface #195 <Method void Lock.unlock()>
		throw obj;
	//   20   46:aload_1         
	//   21   47:athrow          
	}

	public final void stopAutoManage(FragmentActivity fragmentactivity)
	{
		fragmentactivity = ((FragmentActivity) (new LifecycleActivity(((android.app.Activity) (fragmentactivity)))));
	//    0    0:new             #669 <Class LifecycleActivity>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #672 <Method void LifecycleActivity(android.app.Activity)>
	//    4    8:astore_1        
		if(zzde >= 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #127 <Field int zzde>
	//*   7   13:iflt            28
		{
			zzi.zza(((LifecycleActivity) (fragmentactivity))).zzc(zzde);
	//    8   16:aload_1         
	//    9   17:invokestatic    #677 <Method zzi zzi.zza(LifecycleActivity)>
	//   10   20:aload_0         
	//   11   21:getfield        #127 <Field int zzde>
	//   12   24:invokevirtual   #679 <Method void zzi.zzc(int)>
			return;
	//   13   27:return          
		} else
		{
			throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
	//   14   28:new             #286 <Class IllegalStateException>
	//   15   31:dup             
	//   16   32:ldc2            #681 <String "Called stopAutoManage but automatic lifecycle management is not enabled.">
	//   17   35:invokespecial   #291 <Method void IllegalStateException(String)>
	//   18   38:athrow          
		}
	}

	public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zzie.unregisterConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #684 <Method void GmsClientEventManager.unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzie.unregisterConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #687 <Method void GmsClientEventManager.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public final void zza(zzch zzch)
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		if(zziq == null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #94  <Field Set zziq>
	//*   5   13:ifnonnull       27
			zziq = ((Set) (new HashSet()));
	//    6   16:aload_0         
	//    7   17:new             #82  <Class HashSet>
	//    8   20:dup             
	//    9   21:invokespecial   #83  <Method void HashSet()>
	//   10   24:putfield        #94  <Field Set zziq>
		zziq.add(((Object) (zzch)));
	//   11   27:aload_0         
	//   12   28:getfield        #94  <Field Set zziq>
	//   13   31:aload_1         
	//   14   32:invokeinterface #689 <Method boolean Set.add(Object)>
	//   15   37:pop             
		zzga.unlock();
	//   16   38:aload_0         
	//   17   39:getfield        #105 <Field Lock zzga>
	//   18   42:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   19   47:return          
		zzch;
	//   20   48:astore_1        
		zzga.unlock();
	//   21   49:aload_0         
	//   22   50:getfield        #105 <Field Lock zzga>
	//   23   53:invokeinterface #195 <Method void Lock.unlock()>
		throw zzch;
	//   24   58:aload_1         
	//   25   59:athrow          
	}

	final boolean zzaz()
	{
		if(!zzig)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field boolean zzig>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		zzig = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #189 <Field boolean zzig>
		zzij.removeMessages(2);
	//    8   14:aload_0         
	//    9   15:getfield        #123 <Field zzba zzij>
	//   10   18:iconst_2        
	//   11   19:invokevirtual   #692 <Method void zzba.removeMessages(int)>
		zzij.removeMessages(1);
	//   12   22:aload_0         
	//   13   23:getfield        #123 <Field zzba zzij>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #692 <Method void zzba.removeMessages(int)>
		GooglePlayServicesUpdatedReceiver googleplayservicesupdatedreceiver = zzik;
	//   16   30:aload_0         
	//   17   31:getfield        #694 <Field GooglePlayServicesUpdatedReceiver zzik>
	//   18   34:astore_1        
		if(googleplayservicesupdatedreceiver != null)
	//*  19   35:aload_1         
	//*  20   36:ifnull          48
		{
			googleplayservicesupdatedreceiver.unregister();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #699 <Method void GooglePlayServicesUpdatedReceiver.unregister()>
			zzik = null;
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:putfield        #694 <Field GooglePlayServicesUpdatedReceiver zzik>
		}
		return true;
	//   26   48:iconst_1        
	//   27   49:ireturn         
	}

	public final void zzb(int i, boolean flag)
	{
		if(i == 1 && !flag && !zzig)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          92
	//*   3    5:iload_2         
	//*   4    6:ifne            92
	//*   5    9:aload_0         
	//*   6   10:getfield        #189 <Field boolean zzig>
	//*   7   13:ifne            92
		{
			zzig = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #189 <Field boolean zzig>
			if(zzik == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #694 <Field GooglePlayServicesUpdatedReceiver zzik>
	//*  13   25:ifnonnull       54
				zzik = zzdg.registerCallbackOnUpdate(mContext.getApplicationContext(), ((GooglePlayServicesUpdatedReceiver.Callback) (new zzbb(this))));
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #125 <Field GoogleApiAvailability zzdg>
	//   17   33:aload_0         
	//   18   34:getfield        #103 <Field Context mContext>
	//   19   37:invokevirtual   #705 <Method Context Context.getApplicationContext()>
	//   20   40:new             #707 <Class zzbb>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:invokespecial   #708 <Method void zzbb(zzav)>
	//   24   48:invokevirtual   #714 <Method GooglePlayServicesUpdatedReceiver GoogleApiAvailability.registerCallbackOnUpdate(Context, GooglePlayServicesUpdatedReceiver$Callback)>
	//   25   51:putfield        #694 <Field GooglePlayServicesUpdatedReceiver zzik>
			zzba zzba1 = zzij;
	//   26   54:aload_0         
	//   27   55:getfield        #123 <Field zzba zzij>
	//   28   58:astore_3        
			zzba1.sendMessageDelayed(zzba1.obtainMessage(1), zzih);
	//   29   59:aload_3         
	//   30   60:aload_3         
	//   31   61:iconst_1        
	//   32   62:invokevirtual   #718 <Method android.os.Message zzba.obtainMessage(int)>
	//   33   65:aload_0         
	//   34   66:getfield        #76  <Field long zzih>
	//   35   69:invokevirtual   #722 <Method boolean zzba.sendMessageDelayed(android.os.Message, long)>
	//   36   72:pop             
			zzba1 = zzij;
	//   37   73:aload_0         
	//   38   74:getfield        #123 <Field zzba zzij>
	//   39   77:astore_3        
			zzba1.sendMessageDelayed(zzba1.obtainMessage(2), zzii);
	//   40   78:aload_3         
	//   41   79:aload_3         
	//   42   80:iconst_2        
	//   43   81:invokevirtual   #718 <Method android.os.Message zzba.obtainMessage(int)>
	//   44   84:aload_0         
	//   45   85:getfield        #80  <Field long zzii>
	//   46   88:invokevirtual   #722 <Method boolean zzba.sendMessageDelayed(android.os.Message, long)>
	//   47   91:pop             
		}
		zzir.zzce();
	//   48   92:aload_0         
	//   49   93:getfield        #146 <Field zzck zzir>
	//   50   96:invokevirtual   #725 <Method void zzck.zzce()>
		zzie.onUnintentionalDisconnection(i);
	//   51   99:aload_0         
	//   52  100:getfield        #114 <Field GmsClientEventManager zzie>
	//   53  103:iload_1         
	//   54  104:invokevirtual   #728 <Method void GmsClientEventManager.onUnintentionalDisconnection(int)>
		zzie.disableCallbacks();
	//   55  107:aload_0         
	//   56  108:getfield        #114 <Field GmsClientEventManager zzie>
	//   57  111:invokevirtual   #482 <Method void GmsClientEventManager.disableCallbacks()>
		if(i == 2)
	//*  58  114:iload_1         
	//*  59  115:iconst_2        
	//*  60  116:icmpne          123
			zzax();
	//   61  119:aload_0         
	//   62  120:invokespecial   #192 <Method void zzax()>
	//   63  123:return          
	}

	public final void zzb(Bundle bundle)
	{
		for(; !zzgo.isEmpty(); ((GoogleApiClient)this).execute((BaseImplementation.ApiMethodImpl)zzgo.remove()));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Queue zzgo>
	//    2    4:invokeinterface #554 <Method boolean Queue.isEmpty()>
	//    3    9:ifne            32
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #72  <Field Queue zzgo>
	//    7   17:invokeinterface #557 <Method Object Queue.remove()>
	//    8   22:checkcast       #468 <Class BaseImplementation$ApiMethodImpl>
	//    9   25:invokevirtual   #730 <Method BaseImplementation$ApiMethodImpl GoogleApiClient.execute(BaseImplementation$ApiMethodImpl)>
	//   10   28:pop             
	//*  11   29:goto            0
		zzie.onConnectionSuccess(bundle);
	//   12   32:aload_0         
	//   13   33:getfield        #114 <Field GmsClientEventManager zzie>
	//   14   36:aload_1         
	//   15   37:invokevirtual   #733 <Method void GmsClientEventManager.onConnectionSuccess(Bundle)>
	//   16   40:return          
	}

	public final void zzb(zzch zzch)
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		if(zziq != null) goto _L2; else goto _L1
	//    3    9:aload_0         
	//    4   10:getfield        #94  <Field Set zziq>
	//    5   13:ifnonnull       40
_L1:
		zzch = "Attempted to remove pending transform when no transforms are registered.";
	//    6   16:ldc2            #735 <String "Attempted to remove pending transform when no transforms are registered.">
	//    7   19:astore_1        
		Exception exception = new Exception();
	//    8   20:new             #614 <Class Exception>
	//    9   23:dup             
	//   10   24:invokespecial   #615 <Method void Exception()>
	//   11   27:astore_2        
_L3:
		Log.wtf("GoogleApiClientImpl", ((String) (zzch)), ((Throwable) (exception)));
	//   12   28:ldc2            #597 <String "GoogleApiClientImpl">
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:invokestatic    #619 <Method int Log.wtf(String, String, Throwable)>
	//   16   36:pop             
		break MISSING_BLOCK_LABEL_84;
	//   17   37:goto            84
_L2:
		if(zziq.remove(((Object) (zzch))))
			break MISSING_BLOCK_LABEL_68;
	//   18   40:aload_0         
	//   19   41:getfield        #94  <Field Set zziq>
	//   20   44:aload_1         
	//   21   45:invokeinterface #737 <Method boolean Set.remove(Object)>
	//   22   50:ifne            68
		zzch = "Failed to remove pending transform - this may lead to memory leaks!";
	//   23   53:ldc2            #739 <String "Failed to remove pending transform - this may lead to memory leaks!">
	//   24   56:astore_1        
		exception = new Exception();
	//   25   57:new             #614 <Class Exception>
	//   26   60:dup             
	//   27   61:invokespecial   #615 <Method void Exception()>
	//   28   64:astore_2        
		  goto _L3
	//*  29   65:goto            28
		if(!zzba())
	//*  30   68:aload_0         
	//*  31   69:invokevirtual   #742 <Method boolean zzba()>
	//*  32   72:ifne            84
			zzif.zzz();
	//   33   75:aload_0         
	//   34   76:getfield        #67  <Field zzbp zzif>
	//   35   79:invokeinterface #745 <Method void zzbp.zzz()>
		zzga.unlock();
	//   36   84:aload_0         
	//   37   85:getfield        #105 <Field Lock zzga>
	//   38   88:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   39   93:return          
		zzch;
	//   40   94:astore_1        
		zzga.unlock();
	//   41   95:aload_0         
	//   42   96:getfield        #105 <Field Lock zzga>
	//   43   99:invokeinterface #195 <Method void Lock.unlock()>
		throw zzch;
	//   44  104:aload_1         
	//   45  105:athrow          
	}

	final boolean zzba()
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Lock zzga>
	//    2    4:invokeinterface #187 <Method void Lock.lock()>
		Set set = zziq;
	//    3    9:aload_0         
	//    4   10:getfield        #94  <Field Set zziq>
	//    5   13:astore_2        
		if(set == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       29
		{
			zzga.unlock();
	//    8   18:aload_0         
	//    9   19:getfield        #105 <Field Lock zzga>
	//   10   22:invokeinterface #195 <Method void Lock.unlock()>
			return false;
	//   11   27:iconst_0        
	//   12   28:ireturn         
		}
		boolean flag = zziq.isEmpty();
	//   13   29:aload_0         
	//   14   30:getfield        #94  <Field Set zziq>
	//   15   33:invokeinterface #746 <Method boolean Set.isEmpty()>
	//   16   38:istore_1        
		zzga.unlock();
	//   17   39:aload_0         
	//   18   40:getfield        #105 <Field Lock zzga>
	//   19   43:invokeinterface #195 <Method void Lock.unlock()>
		return flag ^ true;
	//   20   48:iload_1         
	//   21   49:iconst_1        
	//   22   50:ixor            
	//   23   51:ireturn         
		Exception exception;
		exception;
	//   24   52:astore_2        
		zzga.unlock();
	//   25   53:aload_0         
	//   26   54:getfield        #105 <Field Lock zzga>
	//   27   57:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   28   62:aload_2         
	//   29   63:athrow          
	}

	final String zzbb()
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #748 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #749 <Method void StringWriter()>
	//    3    7:astore_1        
		((GoogleApiClient)this).dump("", ((FileDescriptor) (null)), new PrintWriter(((java.io.Writer) (stringwriter))), ((String []) (null)));
	//    4    8:aload_0         
	//    5    9:ldc2            #751 <String "">
	//    6   12:aconst_null     
	//    7   13:new             #486 <Class PrintWriter>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #754 <Method void PrintWriter(java.io.Writer)>
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #755 <Method void GoogleApiClient.dump(String, FileDescriptor, PrintWriter, String[])>
		return stringwriter.toString();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #756 <Method String StringWriter.toString()>
	//   15   29:areturn         
	}

	public final void zzc(ConnectionResult connectionresult)
	{
		if(!((GoogleApiAvailabilityLight) (zzdg)).isPlayServicesPossiblyUpdating(mContext, connectionresult.getErrorCode()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field GoogleApiAvailability zzdg>
	//*   2    4:aload_0         
	//*   3    5:getfield        #103 <Field Context mContext>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #760 <Method int ConnectionResult.getErrorCode()>
	//*   6   12:invokevirtual   #766 <Method boolean GoogleApiAvailabilityLight.isPlayServicesPossiblyUpdating(Context, int)>
	//*   7   15:ifne            23
			zzaz();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #254 <Method boolean zzaz()>
	//   10   22:pop             
		if(!zzig)
	//*  11   23:aload_0         
	//*  12   24:getfield        #189 <Field boolean zzig>
	//*  13   27:ifne            45
		{
			zzie.onConnectionFailure(connectionresult);
	//   14   30:aload_0         
	//   15   31:getfield        #114 <Field GmsClientEventManager zzie>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #769 <Method void GmsClientEventManager.onConnectionFailure(ConnectionResult)>
			zzie.disableCallbacks();
	//   18   38:aload_0         
	//   19   39:getfield        #114 <Field GmsClientEventManager zzie>
	//   20   42:invokevirtual   #482 <Method void GmsClientEventManager.disableCallbacks()>
		}
	//   21   45:return          
	}

	private final Context mContext;
	private final Looper zzcn;
	private final int zzde;
	private final GoogleApiAvailability zzdg;
	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zzdh;
	private boolean zzdk;
	private final Lock zzga;
	private final ClientSettings zzgf;
	private final Map zzgi;
	final Queue zzgo = new LinkedList();
	private final GmsClientEventManager zzie;
	private zzbp zzif;
	private volatile boolean zzig;
	private long zzih;
	private long zzii;
	private final zzba zzij;
	private GooglePlayServicesUpdatedReceiver zzik;
	final Map zzil;
	Set zzim;
	private final ListenerHolders zzin = new ListenerHolders();
	private final ArrayList zzio;
	private Integer zzip;
	Set zziq;
	final zzck zzir;
	private final com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState zzis = new zzaw(this);
}
