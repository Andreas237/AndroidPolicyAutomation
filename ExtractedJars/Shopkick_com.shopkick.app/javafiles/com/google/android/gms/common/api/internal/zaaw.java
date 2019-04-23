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
import com.google.android.gms.common.internal.service.zac;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabt, ListenerHolders, zaax, zabb, 
//			zacp, zaba, zabs, zax, 
//			zas, zabe, StatusPendingResult, zaay, 
//			zaaz, BasePendingResult, LifecycleActivity, zaj, 
//			zabq, zabc, SignInConnectionListener, ListenerHolder, 
//			zacm

public final class zaaw extends GoogleApiClient
	implements zabt
{

	public zaaw(Context context, Lock lock, Looper looper, ClientSettings clientsettings, GoogleApiAvailability googleapiavailability, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, Map map, 
			List list, List list1, Map map1, int i, int j, ArrayList arraylist, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void GoogleApiClient()>
		zags = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #67  <Field zabs zags>
	//    5    9:aload_0         
	//    6   10:new             #69  <Class LinkedList>
	//    7   13:dup             
	//    8   14:invokespecial   #70  <Method void LinkedList()>
	//    9   17:putfield        #72  <Field Queue zafb>
		long l;
		if(ClientLibraryUtils.isPackageSide())
	//*  10   20:invokestatic    #78  <Method boolean ClientLibraryUtils.isPackageSide()>
	//*  11   23:ifeq            34
			l = 10000L;
	//   12   26:ldc2w           #79  <Long 10000L>
	//   13   29:lstore          15
		else
	//*  14   31:goto            39
			l = 0x1d4c0L;
	//   15   34:ldc2w           #81  <Long 0x1d4c0L>
	//   16   37:lstore          15
		zagu = l;
	//   17   39:aload_0         
	//   18   40:lload           15
	//   19   42:putfield        #84  <Field long zagu>
		zagv = 5000L;
	//   20   45:aload_0         
	//   21   46:ldc2w           #85  <Long 5000L>
	//   22   49:putfield        #88  <Field long zagv>
		zagz = ((Set) (new HashSet()));
	//   23   52:aload_0         
	//   24   53:new             #90  <Class HashSet>
	//   25   56:dup             
	//   26   57:invokespecial   #91  <Method void HashSet()>
	//   27   60:putfield        #93  <Field Set zagz>
	//   28   63:aload_0         
	//   29   64:new             #95  <Class ListenerHolders>
	//   30   67:dup             
	//   31   68:invokespecial   #96  <Method void ListenerHolders()>
	//   32   71:putfield        #98  <Field ListenerHolders zaha>
		zahc = null;
	//   33   74:aload_0         
	//   34   75:aconst_null     
	//   35   76:putfield        #100 <Field Integer zahc>
		zahd = null;
	//   36   79:aload_0         
	//   37   80:aconst_null     
	//   38   81:putfield        #102 <Field Set zahd>
	//   39   84:aload_0         
	//   40   85:new             #104 <Class zaax>
	//   41   88:dup             
	//   42   89:aload_0         
	//   43   90:invokespecial   #107 <Method void zaax(zaaw)>
	//   44   93:putfield        #109 <Field com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState zahf>
		mContext = context;
	//   45   96:aload_0         
	//   46   97:aload_1         
	//   47   98:putfield        #111 <Field Context mContext>
		zaen = lock;
	//   48  101:aload_0         
	//   49  102:aload_2         
	//   50  103:putfield        #113 <Field Lock zaen>
		zacg = false;
	//   51  106:aload_0         
	//   52  107:iconst_0        
	//   53  108:putfield        #115 <Field boolean zacg>
		zagr = new GmsClientEventManager(looper, zahf);
	//   54  111:aload_0         
	//   55  112:new             #117 <Class GmsClientEventManager>
	//   56  115:dup             
	//   57  116:aload_3         
	//   58  117:aload_0         
	//   59  118:getfield        #109 <Field com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState zahf>
	//   60  121:invokespecial   #120 <Method void GmsClientEventManager(Looper, com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState)>
	//   61  124:putfield        #122 <Field GmsClientEventManager zagr>
		zabj = looper;
	//   62  127:aload_0         
	//   63  128:aload_3         
	//   64  129:putfield        #124 <Field Looper zabj>
		zagw = new zabb(this, looper);
	//   65  132:aload_0         
	//   66  133:new             #126 <Class zabb>
	//   67  136:dup             
	//   68  137:aload_0         
	//   69  138:aload_3         
	//   70  139:invokespecial   #129 <Method void zabb(zaaw, Looper)>
	//   71  142:putfield        #131 <Field zabb zagw>
		zacc = googleapiavailability;
	//   72  145:aload_0         
	//   73  146:aload           5
	//   74  148:putfield        #133 <Field GoogleApiAvailability zacc>
		zaca = i;
	//   75  151:aload_0         
	//   76  152:iload           11
	//   77  154:putfield        #135 <Field int zaca>
		if(zaca >= 0)
	//*  78  157:aload_0         
	//*  79  158:getfield        #135 <Field int zaca>
	//*  80  161:iflt            176
			zahc = Integer.valueOf(j);
	//   81  164:aload_0         
	//   82  165:iload           12
	//   83  167:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//   84  170:putfield        #100 <Field Integer zahc>
	//*  85  173:goto            176
		zaev = map;
	//   86  176:aload_0         
	//   87  177:aload           7
	//   88  179:putfield        #143 <Field Map zaev>
		zagy = map1;
	//   89  182:aload_0         
	//   90  183:aload           10
	//   91  185:putfield        #145 <Field Map zagy>
		zahb = arraylist;
	//   92  188:aload_0         
	//   93  189:aload           13
	//   94  191:putfield        #147 <Field ArrayList zahb>
		zahe = new zacp(zagy);
	//   95  194:aload_0         
	//   96  195:new             #149 <Class zacp>
	//   97  198:dup             
	//   98  199:aload_0         
	//   99  200:getfield        #145 <Field Map zagy>
	//  100  203:invokespecial   #152 <Method void zacp(Map)>
	//  101  206:putfield        #154 <Field zacp zahe>
		for(context = ((Context) (list.iterator())); ((Iterator) (context)).hasNext(); zagr.registerConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (lock))))
	//* 102  209:aload           8
	//* 103  211:invokeinterface #160 <Method Iterator List.iterator()>
	//* 104  216:astore_1        
	//* 105  217:aload_1         
	//* 106  218:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//* 107  223:ifeq            247
			lock = ((Lock) ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (context)).next()));
	//  108  226:aload_1         
	//  109  227:invokeinterface #169 <Method Object Iterator.next()>
	//  110  232:checkcast       #171 <Class com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks>
	//  111  235:astore_2        

	//  112  236:aload_0         
	//  113  237:getfield        #122 <Field GmsClientEventManager zagr>
	//  114  240:aload_2         
	//  115  241:invokevirtual   #175 <Method void GmsClientEventManager.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//* 116  244:goto            217
		for(context = ((Context) (list1.iterator())); ((Iterator) (context)).hasNext(); zagr.registerConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (lock))))
	//* 117  247:aload           9
	//* 118  249:invokeinterface #160 <Method Iterator List.iterator()>
	//* 119  254:astore_1        
	//* 120  255:aload_1         
	//* 121  256:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//* 122  261:ifeq            285
			lock = ((Lock) ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)((Iterator) (context)).next()));
	//  123  264:aload_1         
	//  124  265:invokeinterface #169 <Method Object Iterator.next()>
	//  125  270:checkcast       #177 <Class com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener>
	//  126  273:astore_2        

	//  127  274:aload_0         
	//  128  275:getfield        #122 <Field GmsClientEventManager zagr>
	//  129  278:aload_2         
	//  130  279:invokevirtual   #181 <Method void GmsClientEventManager.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//* 131  282:goto            255
		zaes = clientsettings;
	//  132  285:aload_0         
	//  133  286:aload           4
	//  134  288:putfield        #183 <Field ClientSettings zaes>
		zacd = abstractclientbuilder;
	//  135  291:aload_0         
	//  136  292:aload           6
	//  137  294:putfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  138  297:return          
	}

	private final void resume()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		if(zagt)
	//*   3    9:aload_0         
	//*   4   10:getfield        #196 <Field boolean zagt>
	//*   5   13:ifeq            20
			zaau();
	//    6   16:aload_0         
	//    7   17:invokespecial   #199 <Method void zaau()>
		zaen.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #113 <Field Lock zaen>
	//   10   24:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zaen.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #113 <Field Lock zaen>
	//   15   35:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	public static int zaa(Iterable iterable, boolean flag)
	{
		iterable = ((Iterable) (iterable.iterator()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #207 <Method Iterator Iterable.iterator()>
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
	//    8   12:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//    9   17:ifeq            68
			com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)((Iterator) (iterable)).next();
	//   10   20:aload_0         
	//   11   21:invokeinterface #169 <Method Object Iterator.next()>
	//   12   26:checkcast       #209 <Class com.google.android.gms.common.api.Api$Client>
	//   13   29:astore          5
			boolean flag3 = flag2;
	//   14   31:iload_3         
	//   15   32:istore          4
			if(client.requiresSignIn())
	//*  16   34:aload           5
	//*  17   36:invokeinterface #212 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  18   41:ifeq            47
				flag3 = true;
	//   19   44:iconst_1        
	//   20   45:istore          4
			flag2 = flag3;
	//   21   47:iload           4
	//   22   49:istore_3        
			if(client.providesSignIn())
	//*  23   50:aload           5
	//*  24   52:invokeinterface #215 <Method boolean com.google.android.gms.common.api.Api$Client.providesSignIn()>
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

	private final void zaa(GoogleApiClient googleapiclient, StatusPendingResult statuspendingresult, boolean flag)
	{
		Common.zaph.zaa(googleapiclient).setResultCallback(((com.google.android.gms.common.api.ResultCallback) (new zaba(this, statuspendingresult, flag, googleapiclient))));
	//    0    0:getstatic       #223 <Field zac Common.zaph>
	//    1    3:aload_1         
	//    2    4:invokeinterface #228 <Method PendingResult zac.zaa(GoogleApiClient)>
	//    3    9:new             #230 <Class zaba>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:aload_1         
	//    9   17:invokespecial   #233 <Method void zaba(zaaw, StatusPendingResult, boolean, GoogleApiClient)>
	//   10   20:invokevirtual   #239 <Method void PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback)>
	//   11   23:return          
	}

	static void zaa(zaaw zaaw1)
	{
		zaaw1.resume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #241 <Method void resume()>
	//    2    4:return          
	}

	static void zaa(zaaw zaaw1, GoogleApiClient googleapiclient, StatusPendingResult statuspendingresult, boolean flag)
	{
		zaaw1.zaa(googleapiclient, statuspendingresult, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #244 <Method void zaa(GoogleApiClient, StatusPendingResult, boolean)>
	//    5    7:return          
	}

	private final void zaau()
	{
		zagr.enableCallbacks();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:invokevirtual   #250 <Method void GmsClientEventManager.enableCallbacks()>
		zags.connect();
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field zabs zags>
	//    5   11:invokeinterface #255 <Method void zabs.connect()>
	//    6   16:return          
	}

	private final void zaav()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		if(zaaw())
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #260 <Method boolean zaaw()>
	//*   5   13:ifeq            20
			zaau();
	//    6   16:aload_0         
	//    7   17:invokespecial   #199 <Method void zaau()>
		zaen.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #113 <Field Lock zaen>
	//   10   24:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zaen.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #113 <Field Lock zaen>
	//   15   35:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	static void zab(zaaw zaaw1)
	{
		zaaw1.zaav();
	//    0    0:aload_0         
	//    1    1:invokespecial   #263 <Method void zaav()>
	//    2    4:return          
	}

	static Context zac(zaaw zaaw1)
	{
		return zaaw1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Context mContext>
	//    2    4:areturn         
	}

	private final void zae(int i)
	{
label0:
		{
			Object obj = ((Object) (zahc));
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Integer zahc>
	//    2    4:astore          4
			if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       22
				zahc = Integer.valueOf(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//    8   16:putfield        #100 <Field Integer zahc>
			else
	//*   9   19:goto            31
			if(((Integer) (obj)).intValue() != i)
				break label0;
	//   10   22:aload           4
	//   11   24:invokevirtual   #271 <Method int Integer.intValue()>
	//   12   27:iload_1         
	//   13   28:icmpne          401
			if(zags != null)
	//*  14   31:aload_0         
	//*  15   32:getfield        #67  <Field zabs zags>
	//*  16   35:ifnull          39
				return;
	//   17   38:return          
			obj = ((Object) (zagy.values().iterator()));
	//   18   39:aload_0         
	//   19   40:getfield        #145 <Field Map zagy>
	//   20   43:invokeinterface #277 <Method Collection Map.values()>
	//   21   48:invokeinterface #280 <Method Iterator Collection.iterator()>
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
	//   28   61:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//   29   66:ifeq            114
				com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)((Iterator) (obj)).next();
	//   30   69:aload           4
	//   31   71:invokeinterface #169 <Method Object Iterator.next()>
	//   32   76:checkcast       #209 <Class com.google.android.gms.common.api.Api$Client>
	//   33   79:astore          5
				boolean flag1 = flag;
	//   34   81:iload_2         
	//   35   82:istore_3        
				if(client.requiresSignIn())
	//*  36   83:aload           5
	//*  37   85:invokeinterface #212 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  38   90:ifeq            95
					flag1 = true;
	//   39   93:iconst_1        
	//   40   94:istore_3        
				flag = flag1;
	//   41   95:iload_3         
	//   42   96:istore_2        
				if(client.providesSignIn())
	//*  43   97:aload           5
	//*  44   99:invokeinterface #215 <Method boolean com.google.android.gms.common.api.Api$Client.providesSignIn()>
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
			switch(zahc.intValue())
	//*  51  114:aload_0         
	//*  52  115:getfield        #100 <Field Integer zahc>
	//*  53  118:invokevirtual   #271 <Method int Integer.intValue()>
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
					if(zacg)
	//*  58  155:aload_0         
	//*  59  156:getfield        #115 <Field boolean zacg>
	//*  60  159:ifeq            212
					{
						zags = ((zabs) (new zax(mContext, zaen, zabj, ((GoogleApiAvailabilityLight) (zacc)), zagy, zaes, zaev, zacd, zahb, this, true)));
	//   61  162:aload_0         
	//   62  163:new             #282 <Class zax>
	//   63  166:dup             
	//   64  167:aload_0         
	//   65  168:getfield        #111 <Field Context mContext>
	//   66  171:aload_0         
	//   67  172:getfield        #113 <Field Lock zaen>
	//   68  175:aload_0         
	//   69  176:getfield        #124 <Field Looper zabj>
	//   70  179:aload_0         
	//   71  180:getfield        #133 <Field GoogleApiAvailability zacc>
	//   72  183:aload_0         
	//   73  184:getfield        #145 <Field Map zagy>
	//   74  187:aload_0         
	//   75  188:getfield        #183 <Field ClientSettings zaes>
	//   76  191:aload_0         
	//   77  192:getfield        #143 <Field Map zaev>
	//   78  195:aload_0         
	//   79  196:getfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//   80  199:aload_0         
	//   81  200:getfield        #147 <Field ArrayList zahb>
	//   82  203:aload_0         
	//   83  204:iconst_1        
	//   84  205:invokespecial   #285 <Method void zax(Context, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zaaw, boolean)>
	//   85  208:putfield        #67  <Field zabs zags>
						return;
	//   86  211:return          
					} else
					{
						zags = ((zabs) (zas.zaa(mContext, this, zaen, zabj, ((GoogleApiAvailabilityLight) (zacc)), zagy, zaes, zaev, zacd, zahb)));
	//   87  212:aload_0         
	//   88  213:aload_0         
	//   89  214:getfield        #111 <Field Context mContext>
	//   90  217:aload_0         
	//   91  218:aload_0         
	//   92  219:getfield        #113 <Field Lock zaen>
	//   93  222:aload_0         
	//   94  223:getfield        #124 <Field Looper zabj>
	//   95  226:aload_0         
	//   96  227:getfield        #133 <Field GoogleApiAvailability zacc>
	//   97  230:aload_0         
	//   98  231:getfield        #145 <Field Map zagy>
	//   99  234:aload_0         
	//  100  235:getfield        #183 <Field ClientSettings zaes>
	//  101  238:aload_0         
	//  102  239:getfield        #143 <Field Map zaev>
	//  103  242:aload_0         
	//  104  243:getfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  105  246:aload_0         
	//  106  247:getfield        #147 <Field ArrayList zahb>
	//  107  250:invokestatic    #290 <Method zas zas.zaa(Context, zaaw, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList)>
	//  108  253:putfield        #67  <Field zabs zags>
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
	//  115  268:new             #292 <Class IllegalStateException>
	//  116  271:dup             
	//  117  272:ldc2            #294 <String "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//  118  275:invokespecial   #297 <Method void IllegalStateException(String)>
	//  119  278:athrow          
				} else
				{
					throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
	//  120  279:new             #292 <Class IllegalStateException>
	//  121  282:dup             
	//  122  283:ldc2            #299 <String "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.">
	//  123  286:invokespecial   #297 <Method void IllegalStateException(String)>
	//  124  289:athrow          
				}
				break;
			}
			if(zacg && i == 0)
	//* 125  290:aload_0         
	//* 126  291:getfield        #115 <Field boolean zacg>
	//* 127  294:ifeq            351
	//* 128  297:iload_1         
	//* 129  298:ifne            351
			{
				zags = ((zabs) (new zax(mContext, zaen, zabj, ((GoogleApiAvailabilityLight) (zacc)), zagy, zaes, zaev, zacd, zahb, this, false)));
	//  130  301:aload_0         
	//  131  302:new             #282 <Class zax>
	//  132  305:dup             
	//  133  306:aload_0         
	//  134  307:getfield        #111 <Field Context mContext>
	//  135  310:aload_0         
	//  136  311:getfield        #113 <Field Lock zaen>
	//  137  314:aload_0         
	//  138  315:getfield        #124 <Field Looper zabj>
	//  139  318:aload_0         
	//  140  319:getfield        #133 <Field GoogleApiAvailability zacc>
	//  141  322:aload_0         
	//  142  323:getfield        #145 <Field Map zagy>
	//  143  326:aload_0         
	//  144  327:getfield        #183 <Field ClientSettings zaes>
	//  145  330:aload_0         
	//  146  331:getfield        #143 <Field Map zaev>
	//  147  334:aload_0         
	//  148  335:getfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  149  338:aload_0         
	//  150  339:getfield        #147 <Field ArrayList zahb>
	//  151  342:aload_0         
	//  152  343:iconst_0        
	//  153  344:invokespecial   #285 <Method void zax(Context, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zaaw, boolean)>
	//  154  347:putfield        #67  <Field zabs zags>
				return;
	//  155  350:return          
			} else
			{
				zags = ((zabs) (new zabe(mContext, this, zaen, zabj, ((GoogleApiAvailabilityLight) (zacc)), zagy, zaes, zaev, zacd, zahb, ((zabt) (this)))));
	//  156  351:aload_0         
	//  157  352:new             #301 <Class zabe>
	//  158  355:dup             
	//  159  356:aload_0         
	//  160  357:getfield        #111 <Field Context mContext>
	//  161  360:aload_0         
	//  162  361:aload_0         
	//  163  362:getfield        #113 <Field Lock zaen>
	//  164  365:aload_0         
	//  165  366:getfield        #124 <Field Looper zabj>
	//  166  369:aload_0         
	//  167  370:getfield        #133 <Field GoogleApiAvailability zacc>
	//  168  373:aload_0         
	//  169  374:getfield        #145 <Field Map zagy>
	//  170  377:aload_0         
	//  171  378:getfield        #183 <Field ClientSettings zaes>
	//  172  381:aload_0         
	//  173  382:getfield        #143 <Field Map zaev>
	//  174  385:aload_0         
	//  175  386:getfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  176  389:aload_0         
	//  177  390:getfield        #147 <Field ArrayList zahb>
	//  178  393:aload_0         
	//  179  394:invokespecial   #304 <Method void zabe(Context, zaaw, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zabt)>
	//  180  397:putfield        #67  <Field zabs zags>
				return;
	//  181  400:return          
			}
		}
		String s = zaf(i);
	//  182  401:iload_1         
	//  183  402:invokestatic    #308 <Method String zaf(int)>
	//  184  405:astore          4
		String s1 = zaf(zahc.intValue());
	//  185  407:aload_0         
	//  186  408:getfield        #100 <Field Integer zahc>
	//  187  411:invokevirtual   #271 <Method int Integer.intValue()>
	//  188  414:invokestatic    #308 <Method String zaf(int)>
	//  189  417:astore          5
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 51 + String.valueOf(((Object) (s1))).length());
	//  190  419:new             #310 <Class StringBuilder>
	//  191  422:dup             
	//  192  423:aload           4
	//  193  425:invokestatic    #315 <Method String String.valueOf(Object)>
	//  194  428:invokevirtual   #318 <Method int String.length()>
	//  195  431:bipush          51
	//  196  433:iadd            
	//  197  434:aload           5
	//  198  436:invokestatic    #315 <Method String String.valueOf(Object)>
	//  199  439:invokevirtual   #318 <Method int String.length()>
	//  200  442:iadd            
	//  201  443:invokespecial   #320 <Method void StringBuilder(int)>
	//  202  446:astore          6
		stringbuilder.append("Cannot use sign-in mode: ");
	//  203  448:aload           6
	//  204  450:ldc2            #322 <String "Cannot use sign-in mode: ">
	//  205  453:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//  206  456:pop             
		stringbuilder.append(s);
	//  207  457:aload           6
	//  208  459:aload           4
	//  209  461:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//  210  464:pop             
		stringbuilder.append(". Mode was already set to ");
	//  211  465:aload           6
	//  212  467:ldc2            #328 <String ". Mode was already set to ">
	//  213  470:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//  214  473:pop             
		stringbuilder.append(s1);
	//  215  474:aload           6
	//  216  476:aload           5
	//  217  478:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//  218  481:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//  219  482:new             #292 <Class IllegalStateException>
	//  220  485:dup             
	//  221  486:aload           6
	//  222  488:invokevirtual   #332 <Method String StringBuilder.toString()>
	//  223  491:invokespecial   #297 <Method void IllegalStateException(String)>
	//  224  494:athrow          
	}

	private static String zaf(int i)
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
	//    2   28:ldc2            #334 <String "UNKNOWN">
	//    3   31:areturn         

		case 3: // '\003'
			return "SIGN_IN_MODE_NONE";
	//    4   32:ldc2            #336 <String "SIGN_IN_MODE_NONE">
	//    5   35:areturn         

		case 2: // '\002'
			return "SIGN_IN_MODE_OPTIONAL";
	//    6   36:ldc2            #338 <String "SIGN_IN_MODE_OPTIONAL">
	//    7   39:areturn         

		case 1: // '\001'
			return "SIGN_IN_MODE_REQUIRED";
	//    8   40:ldc2            #340 <String "SIGN_IN_MODE_REQUIRED">
	//    9   43:areturn         
		}
	}

	public final ConnectionResult blockingConnect()
	{
		boolean flag2;
		Looper looper = Looper.myLooper();
	//    0    0:invokestatic    #348 <Method Looper Looper.myLooper()>
	//    1    3:astore_3        
		Looper looper1 = Looper.getMainLooper();
	//    2    4:invokestatic    #351 <Method Looper Looper.getMainLooper()>
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
	//   15   25:ldc2            #353 <String "blockingConnect must not be called on the UI thread">
	//   16   28:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		zaen.lock();
	//   17   31:aload_0         
	//   18   32:getfield        #113 <Field Lock zaen>
	//   19   35:invokeinterface #194 <Method void Lock.lock()>
		if(zaca < 0)
			break MISSING_BLOCK_LABEL_69;
	//   20   40:aload_0         
	//   21   41:getfield        #135 <Field int zaca>
	//   22   44:iflt            69
		boolean flag1;
		ConnectionResult connectionresult;
		Exception exception;
		if(zahc != null)
	//*  23   47:aload_0         
	//*  24   48:getfield        #100 <Field Integer zahc>
	//*  25   51:ifnull          172
			flag1 = flag2;
	//   26   54:iload_2         
	//   27   55:istore_1        
		else
	//*  28   56:goto            59
	//*  29   59:iload_1         
	//*  30   60:ldc2            #361 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//*  31   63:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
	//*  32   66:goto            110
	//*  33   69:aload_0         
	//*  34   70:getfield        #100 <Field Integer zahc>
	//*  35   73:ifnonnull       99
	//*  36   76:aload_0         
	//*  37   77:aload_0         
	//*  38   78:getfield        #145 <Field Map zagy>
	//*  39   81:invokeinterface #277 <Method Collection Map.values()>
	//*  40   86:iconst_0        
	//*  41   87:invokestatic    #363 <Method int zaa(Iterable, boolean)>
	//*  42   90:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//*  43   93:putfield        #100 <Field Integer zahc>
	//*  44   96:goto            110
	//*  45   99:aload_0         
	//*  46  100:getfield        #100 <Field Integer zahc>
	//*  47  103:invokevirtual   #271 <Method int Integer.intValue()>
	//*  48  106:iconst_2        
	//*  49  107:icmpeq          149
	//*  50  110:aload_0         
	//*  51  111:aload_0         
	//*  52  112:getfield        #100 <Field Integer zahc>
	//*  53  115:invokevirtual   #271 <Method int Integer.intValue()>
	//*  54  118:invokespecial   #365 <Method void zae(int)>
	//*  55  121:aload_0         
	//*  56  122:getfield        #122 <Field GmsClientEventManager zagr>
	//*  57  125:invokevirtual   #250 <Method void GmsClientEventManager.enableCallbacks()>
	//*  58  128:aload_0         
	//*  59  129:getfield        #67  <Field zabs zags>
	//*  60  132:invokeinterface #367 <Method ConnectionResult zabs.blockingConnect()>
	//*  61  137:astore_3        
	//*  62  138:aload_0         
	//*  63  139:getfield        #113 <Field Lock zaen>
	//*  64  142:invokeinterface #202 <Method void Lock.unlock()>
	//*  65  147:aload_3         
	//*  66  148:areturn         
	//*  67  149:new             #292 <Class IllegalStateException>
	//*  68  152:dup             
	//*  69  153:ldc2            #369 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//*  70  156:invokespecial   #297 <Method void IllegalStateException(String)>
	//*  71  159:athrow          
	//*  72  160:astore_3        
	//*  73  161:aload_0         
	//*  74  162:getfield        #113 <Field Lock zaen>
	//*  75  165:invokeinterface #202 <Method void Lock.unlock()>
	//*  76  170:aload_3         
	//*  77  171:athrow          
			flag1 = false;
	//   78  172:iconst_0        
	//   79  173:istore_1        
		Preconditions.checkState(flag1, "Sign-in mode should have been set explicitly by auto-manage.");
		break MISSING_BLOCK_LABEL_110;
		if(zahc == null)
		{
			zahc = Integer.valueOf(zaa(((Iterable) (zagy.values())), false));
			break MISSING_BLOCK_LABEL_110;
		}
		if(zahc.intValue() == 2)
			break MISSING_BLOCK_LABEL_149;
		zae(zahc.intValue());
		zagr.enableCallbacks();
		connectionresult = zags.blockingConnect();
		zaen.unlock();
		return connectionresult;
		throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
		exception;
		zaen.unlock();
		throw exception;
	//*  80  174:goto            59
	}

	public final ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		boolean flag;
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #348 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #351 <Method Looper Looper.getMainLooper()>
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
	//    9   20:ldc2            #353 <String "blockingConnect must not be called on the UI thread">
	//   10   23:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		Preconditions.checkNotNull(((Object) (timeunit)), "TimeUnit must not be null");
	//   11   26:aload_3         
	//   12   27:ldc2            #373 <String "TimeUnit must not be null">
	//   13   30:invokestatic    #377 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   14   33:pop             
		zaen.lock();
	//   15   34:aload_0         
	//   16   35:getfield        #113 <Field Lock zaen>
	//   17   38:invokeinterface #194 <Method void Lock.lock()>
		if(zahc == null)
	//*  18   43:aload_0         
	//*  19   44:getfield        #100 <Field Integer zahc>
	//*  20   47:ifnonnull       73
		{
			zahc = Integer.valueOf(zaa(((Iterable) (zagy.values())), false));
	//   21   50:aload_0         
	//   22   51:aload_0         
	//   23   52:getfield        #145 <Field Map zagy>
	//   24   55:invokeinterface #277 <Method Collection Map.values()>
	//   25   60:iconst_0        
	//   26   61:invokestatic    #363 <Method int zaa(Iterable, boolean)>
	//   27   64:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//   28   67:putfield        #100 <Field Integer zahc>
			break MISSING_BLOCK_LABEL_84;
	//   29   70:goto            84
		}
		if(zahc.intValue() == 2)
			break MISSING_BLOCK_LABEL_125;
	//   30   73:aload_0         
	//   31   74:getfield        #100 <Field Integer zahc>
	//   32   77:invokevirtual   #271 <Method int Integer.intValue()>
	//   33   80:iconst_2        
	//   34   81:icmpeq          125
		zae(zahc.intValue());
	//   35   84:aload_0         
	//   36   85:aload_0         
	//   37   86:getfield        #100 <Field Integer zahc>
	//   38   89:invokevirtual   #271 <Method int Integer.intValue()>
	//   39   92:invokespecial   #365 <Method void zae(int)>
		zagr.enableCallbacks();
	//   40   95:aload_0         
	//   41   96:getfield        #122 <Field GmsClientEventManager zagr>
	//   42   99:invokevirtual   #250 <Method void GmsClientEventManager.enableCallbacks()>
		timeunit = ((TimeUnit) (zags.blockingConnect(l, timeunit)));
	//   43  102:aload_0         
	//   44  103:getfield        #67  <Field zabs zags>
	//   45  106:lload_1         
	//   46  107:aload_3         
	//   47  108:invokeinterface #379 <Method ConnectionResult zabs.blockingConnect(long, TimeUnit)>
	//   48  113:astore_3        
		zaen.unlock();
	//   49  114:aload_0         
	//   50  115:getfield        #113 <Field Lock zaen>
	//   51  118:invokeinterface #202 <Method void Lock.unlock()>
		return ((ConnectionResult) (timeunit));
	//   52  123:aload_3         
	//   53  124:areturn         
		throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   54  125:new             #292 <Class IllegalStateException>
	//   55  128:dup             
	//   56  129:ldc2            #369 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   57  132:invokespecial   #297 <Method void IllegalStateException(String)>
	//   58  135:athrow          
		timeunit;
	//   59  136:astore_3        
		zaen.unlock();
	//   60  137:aload_0         
	//   61  138:getfield        #113 <Field Lock zaen>
	//   62  141:invokeinterface #202 <Method void Lock.unlock()>
		throw timeunit;
	//   63  146:aload_3         
	//   64  147:athrow          
	}

	public final PendingResult clearDefaultAccountAndReconnect()
	{
		Preconditions.checkState(((GoogleApiClient)this).isConnected(), "GoogleApiClient is not connected yet.");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #385 <Method boolean GoogleApiClient.isConnected()>
	//    2    4:ldc2            #387 <String "GoogleApiClient is not connected yet.">
	//    3    7:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		boolean flag;
		if(zahc.intValue() != 2)
	//*   4   10:aload_0         
	//*   5   11:getfield        #100 <Field Integer zahc>
	//*   6   14:invokevirtual   #271 <Method int Integer.intValue()>
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
	//   15   29:ldc2            #389 <String "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API">
	//   16   32:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		StatusPendingResult statuspendingresult = new StatusPendingResult(((GoogleApiClient) (this)));
	//   17   35:new             #391 <Class StatusPendingResult>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #394 <Method void StatusPendingResult(GoogleApiClient)>
	//   21   43:astore_2        
		if(zagy.containsKey(((Object) (Common.CLIENT_KEY))))
	//*  22   44:aload_0         
	//*  23   45:getfield        #145 <Field Map zagy>
	//*  24   48:getstatic       #398 <Field com.google.android.gms.common.api.Api$ClientKey Common.CLIENT_KEY>
	//*  25   51:invokeinterface #402 <Method boolean Map.containsKey(Object)>
	//*  26   56:ifeq            68
		{
			zaa(((GoogleApiClient) (this)), statuspendingresult, false);
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:iconst_0        
	//   31   63:invokespecial   #244 <Method void zaa(GoogleApiClient, StatusPendingResult, boolean)>
			return ((PendingResult) (statuspendingresult));
	//   32   66:aload_2         
	//   33   67:areturn         
		} else
		{
			AtomicReference atomicreference = new AtomicReference();
	//   34   68:new             #404 <Class AtomicReference>
	//   35   71:dup             
	//   36   72:invokespecial   #405 <Method void AtomicReference()>
	//   37   75:astore_3        
			Object obj = ((Object) (new zaay(this, atomicreference, statuspendingresult)));
	//   38   76:new             #407 <Class zaay>
	//   39   79:dup             
	//   40   80:aload_0         
	//   41   81:aload_3         
	//   42   82:aload_2         
	//   43   83:invokespecial   #410 <Method void zaay(zaaw, AtomicReference, StatusPendingResult)>
	//   44   86:astore          4
			zaaz zaaz1 = new zaaz(this, statuspendingresult);
	//   45   88:new             #412 <Class zaaz>
	//   46   91:dup             
	//   47   92:aload_0         
	//   48   93:aload_2         
	//   49   94:invokespecial   #415 <Method void zaaz(zaaw, StatusPendingResult)>
	//   50   97:astore          5
			obj = ((Object) ((new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext)).addApi(Common.API).addConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (zaaz1))).setHandler(((android.os.Handler) (zagw))).build()));
	//   51   99:new             #417 <Class com.google.android.gms.common.api.GoogleApiClient$Builder>
	//   52  102:dup             
	//   53  103:aload_0         
	//   54  104:getfield        #111 <Field Context mContext>
	//   55  107:invokespecial   #420 <Method void com.google.android.gms.common.api.GoogleApiClient$Builder(Context)>
	//   56  110:getstatic       #424 <Field Api Common.API>
	//   57  113:invokevirtual   #428 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addApi(Api)>
	//   58  116:aload           4
	//   59  118:invokevirtual   #432 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//   60  121:aload           5
	//   61  123:invokevirtual   #436 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   62  126:aload_0         
	//   63  127:getfield        #131 <Field zabb zagw>
	//   64  130:invokevirtual   #440 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.setHandler(android.os.Handler)>
	//   65  133:invokevirtual   #444 <Method GoogleApiClient com.google.android.gms.common.api.GoogleApiClient$Builder.build()>
	//   66  136:astore          4
			atomicreference.set(obj);
	//   67  138:aload_3         
	//   68  139:aload           4
	//   69  141:invokevirtual   #448 <Method void AtomicReference.set(Object)>
			((GoogleApiClient) (obj)).connect();
	//   70  144:aload           4
	//   71  146:invokevirtual   #449 <Method void GoogleApiClient.connect()>
			return ((PendingResult) (statuspendingresult));
	//   72  149:aload_2         
	//   73  150:areturn         
		}
	}

	public final void connect()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		int i = zaca;
	//    3    9:aload_0         
	//    4   10:getfield        #135 <Field int zaca>
	//    5   13:istore_1        
		boolean flag;
		flag = false;
	//    6   14:iconst_0        
	//    7   15:istore_2        
		if(i < 0)
			break MISSING_BLOCK_LABEL_39;
	//    8   16:iload_1         
	//    9   17:iflt            39
		if(zahc != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #100 <Field Integer zahc>
	//*  12   24:ifnull          29
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_2        
		Preconditions.checkState(flag, "Sign-in mode should have been set explicitly by auto-manage.");
	//   15   29:iload_2         
	//   16   30:ldc2            #361 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//   17   33:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		break MISSING_BLOCK_LABEL_80;
	//   18   36:goto            80
		if(zahc == null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #100 <Field Integer zahc>
	//*  21   43:ifnonnull       69
		{
			zahc = Integer.valueOf(zaa(((Iterable) (zagy.values())), false));
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #145 <Field Map zagy>
	//   25   51:invokeinterface #277 <Method Collection Map.values()>
	//   26   56:iconst_0        
	//   27   57:invokestatic    #363 <Method int zaa(Iterable, boolean)>
	//   28   60:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//   29   63:putfield        #100 <Field Integer zahc>
			break MISSING_BLOCK_LABEL_80;
	//   30   66:goto            80
		}
		if(zahc.intValue() == 2)
			break MISSING_BLOCK_LABEL_101;
	//   31   69:aload_0         
	//   32   70:getfield        #100 <Field Integer zahc>
	//   33   73:invokevirtual   #271 <Method int Integer.intValue()>
	//   34   76:iconst_2        
	//   35   77:icmpeq          101
		((GoogleApiClient)this).connect(zahc.intValue());
	//   36   80:aload_0         
	//   37   81:aload_0         
	//   38   82:getfield        #100 <Field Integer zahc>
	//   39   85:invokevirtual   #271 <Method int Integer.intValue()>
	//   40   88:invokevirtual   #452 <Method void GoogleApiClient.connect(int)>
		zaen.unlock();
	//   41   91:aload_0         
	//   42   92:getfield        #113 <Field Lock zaen>
	//   43   95:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   44  100:return          
		throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   45  101:new             #292 <Class IllegalStateException>
	//   46  104:dup             
	//   47  105:ldc2            #454 <String "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   48  108:invokespecial   #297 <Method void IllegalStateException(String)>
	//   49  111:athrow          
		Exception exception;
		exception;
	//   50  112:astore_3        
		zaen.unlock();
	//   51  113:aload_0         
	//   52  114:getfield        #113 <Field Lock zaen>
	//   53  117:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   54  122:aload_3         
	//   55  123:athrow          
	}

	public final void connect(int i)
	{
		boolean flag;
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
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
	//   23   37:new             #310 <Class StringBuilder>
	//   24   40:dup             
	//   25   41:bipush          33
	//   26   43:invokespecial   #320 <Method void StringBuilder(int)>
	//   27   46:astore          4
		stringbuilder.append("Illegal sign-in mode: ");
	//   28   48:aload           4
	//   29   50:ldc2            #456 <String "Illegal sign-in mode: ">
	//   30   53:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   31   56:pop             
		stringbuilder.append(i);
	//   32   57:aload           4
	//   33   59:iload_1         
	//   34   60:invokevirtual   #459 <Method StringBuilder StringBuilder.append(int)>
	//   35   63:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   36   64:iload_2         
	//   37   65:aload           4
	//   38   67:invokevirtual   #332 <Method String StringBuilder.toString()>
	//   39   70:invokestatic    #462 <Method void Preconditions.checkArgument(boolean, Object)>
		zae(i);
	//   40   73:aload_0         
	//   41   74:iload_1         
	//   42   75:invokespecial   #365 <Method void zae(int)>
		zaau();
	//   43   78:aload_0         
	//   44   79:invokespecial   #199 <Method void zaau()>
		zaen.unlock();
	//   45   82:aload_0         
	//   46   83:getfield        #113 <Field Lock zaen>
	//   47   86:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   48   91:return          
		Exception exception;
		exception;
	//   49   92:astore          4
		zaen.unlock();
	//   50   94:aload_0         
	//   51   95:getfield        #113 <Field Lock zaen>
	//   52   98:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   53  103:aload           4
	//   54  105:athrow          
	}

	public final void disconnect()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		zahe.release();
	//    3    9:aload_0         
	//    4   10:getfield        #154 <Field zacp zahe>
	//    5   13:invokevirtual   #466 <Method void zacp.release()>
		if(zags != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #67  <Field zabs zags>
	//*   8   20:ifnull          32
			zags.disconnect();
	//    9   23:aload_0         
	//   10   24:getfield        #67  <Field zabs zags>
	//   11   27:invokeinterface #468 <Method void zabs.disconnect()>
		zaha.release();
	//   12   32:aload_0         
	//   13   33:getfield        #98  <Field ListenerHolders zaha>
	//   14   36:invokevirtual   #469 <Method void ListenerHolders.release()>
		BaseImplementation.ApiMethodImpl apimethodimpl;
		for(Iterator iterator = zafb.iterator(); iterator.hasNext(); ((PendingResult) (apimethodimpl)).cancel())
	//*  15   39:aload_0         
	//*  16   40:getfield        #72  <Field Queue zafb>
	//*  17   43:invokeinterface #472 <Method Iterator Queue.iterator()>
	//*  18   48:astore_1        
	//*  19   49:aload_1         
	//*  20   50:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//*  21   55:ifeq            80
		{
			apimethodimpl = (BaseImplementation.ApiMethodImpl)iterator.next();
	//   22   58:aload_1         
	//   23   59:invokeinterface #169 <Method Object Iterator.next()>
	//   24   64:checkcast       #474 <Class BaseImplementation$ApiMethodImpl>
	//   25   67:astore_2        
			((BasePendingResult) (apimethodimpl)).zaa(((zacs) (null)));
	//   26   68:aload_2         
	//   27   69:aconst_null     
	//   28   70:invokevirtual   #479 <Method void BasePendingResult.zaa(zacs)>
		}

	//   29   73:aload_2         
	//   30   74:invokevirtual   #482 <Method void PendingResult.cancel()>
	//*  31   77:goto            49
		zabs zabs1;
		zafb.clear();
	//   32   80:aload_0         
	//   33   81:getfield        #72  <Field Queue zafb>
	//   34   84:invokeinterface #485 <Method void Queue.clear()>
		zabs1 = zags;
	//   35   89:aload_0         
	//   36   90:getfield        #67  <Field zabs zags>
	//   37   93:astore_1        
		if(zabs1 == null)
	//*  38   94:aload_1         
	//*  39   95:ifnonnull       108
		{
			zaen.unlock();
	//   40   98:aload_0         
	//   41   99:getfield        #113 <Field Lock zaen>
	//   42  102:invokeinterface #202 <Method void Lock.unlock()>
			return;
	//   43  107:return          
		}
		zaaw();
	//   44  108:aload_0         
	//   45  109:invokevirtual   #260 <Method boolean zaaw()>
	//   46  112:pop             
		zagr.disableCallbacks();
	//   47  113:aload_0         
	//   48  114:getfield        #122 <Field GmsClientEventManager zagr>
	//   49  117:invokevirtual   #488 <Method void GmsClientEventManager.disableCallbacks()>
		zaen.unlock();
	//   50  120:aload_0         
	//   51  121:getfield        #113 <Field Lock zaen>
	//   52  124:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   53  129:return          
		Exception exception;
		exception;
	//   54  130:astore_1        
		zaen.unlock();
	//   55  131:aload_0         
	//   56  132:getfield        #113 <Field Lock zaen>
	//   57  135:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   58  140:aload_1         
	//   59  141:athrow          
	}

	public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.append(((CharSequence) (s))).append("mContext=").println(((Object) (mContext)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #495 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    3    5:ldc2            #497 <String "mContext=">
	//    4    8:invokevirtual   #495 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    5   11:aload_0         
	//    6   12:getfield        #111 <Field Context mContext>
	//    7   15:invokevirtual   #500 <Method void PrintWriter.println(Object)>
		printwriter.append(((CharSequence) (s))).append("mResuming=").print(zagt);
	//    8   18:aload_3         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #495 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   11   23:ldc2            #502 <String "mResuming=">
	//   12   26:invokevirtual   #495 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   13   29:aload_0         
	//   14   30:getfield        #196 <Field boolean zagt>
	//   15   33:invokevirtual   #506 <Method void PrintWriter.print(boolean)>
		printwriter.append(" mWorkQueue.size()=").print(zafb.size());
	//   16   36:aload_3         
	//   17   37:ldc2            #508 <String " mWorkQueue.size()=">
	//   18   40:invokevirtual   #495 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   19   43:aload_0         
	//   20   44:getfield        #72  <Field Queue zafb>
	//   21   47:invokeinterface #511 <Method int Queue.size()>
	//   22   52:invokevirtual   #513 <Method void PrintWriter.print(int)>
		Object obj = ((Object) (zahe));
	//   23   55:aload_0         
	//   24   56:getfield        #154 <Field zacp zahe>
	//   25   59:astore          5
		printwriter.append(" mUnconsumedApiCalls.size()=").println(((zacp) (obj)).zaky.size());
	//   26   61:aload_3         
	//   27   62:ldc2            #515 <String " mUnconsumedApiCalls.size()=">
	//   28   65:invokevirtual   #495 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   29   68:aload           5
	//   30   70:getfield        #518 <Field Set zacp.zaky>
	//   31   73:invokeinterface #521 <Method int Set.size()>
	//   32   78:invokevirtual   #523 <Method void PrintWriter.println(int)>
		obj = ((Object) (zags));
	//   33   81:aload_0         
	//   34   82:getfield        #67  <Field zabs zags>
	//   35   85:astore          5
		if(obj != null)
	//*  36   87:aload           5
	//*  37   89:ifnull          104
			((zabs) (obj)).dump(s, filedescriptor, printwriter, as);
	//   38   92:aload           5
	//   39   94:aload_1         
	//   40   95:aload_2         
	//   41   96:aload_3         
	//   42   97:aload           4
	//   43   99:invokeinterface #525 <Method void zabs.dump(String, FileDescriptor, PrintWriter, String[])>
	//   44  104:return          
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		boolean flag;
		if(apimethodimpl.getClientKey() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #531 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
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
	//    9   15:ldc2            #533 <String "This task can not be enqueued (it's probably a Batch or malformed)">
	//   10   18:invokestatic    #462 <Method void Preconditions.checkArgument(boolean, Object)>
		flag = zagy.containsKey(((Object) (apimethodimpl.getClientKey())));
	//   11   21:aload_0         
	//   12   22:getfield        #145 <Field Map zagy>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #531 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   15   29:invokeinterface #402 <Method boolean Map.containsKey(Object)>
	//   16   34:istore_2        
		String s;
		if(apimethodimpl.getApi() != null)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #537 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//*  19   39:ifnull          53
			s = apimethodimpl.getApi().getName();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #537 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//   22   46:invokevirtual   #542 <Method String Api.getName()>
	//   23   49:astore_3        
		else
	//*  24   50:goto            57
			s = "the API";
	//   25   53:ldc2            #544 <String "the API">
	//   26   56:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 65);
	//   27   57:new             #310 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:aload_3         
	//   30   62:invokestatic    #315 <Method String String.valueOf(Object)>
	//   31   65:invokevirtual   #318 <Method int String.length()>
	//   32   68:bipush          65
	//   33   70:iadd            
	//   34   71:invokespecial   #320 <Method void StringBuilder(int)>
	//   35   74:astore          4
		stringbuilder.append("GoogleApiClient is not configured to use ");
	//   36   76:aload           4
	//   37   78:ldc2            #546 <String "GoogleApiClient is not configured to use ">
	//   38   81:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   39   84:pop             
		stringbuilder.append(s);
	//   40   85:aload           4
	//   41   87:aload_3         
	//   42   88:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
		stringbuilder.append(" required for this call.");
	//   44   92:aload           4
	//   45   94:ldc2            #548 <String " required for this call.">
	//   46   97:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   47  100:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   48  101:iload_2         
	//   49  102:aload           4
	//   50  104:invokevirtual   #332 <Method String StringBuilder.toString()>
	//   51  107:invokestatic    #462 <Method void Preconditions.checkArgument(boolean, Object)>
		zaen.lock();
	//   52  110:aload_0         
	//   53  111:getfield        #113 <Field Lock zaen>
	//   54  114:invokeinterface #194 <Method void Lock.lock()>
		if(zags != null)
			break MISSING_BLOCK_LABEL_148;
	//   55  119:aload_0         
	//   56  120:getfield        #67  <Field zabs zags>
	//   57  123:ifnonnull       148
		zafb.add(((Object) (apimethodimpl)));
	//   58  126:aload_0         
	//   59  127:getfield        #72  <Field Queue zafb>
	//   60  130:aload_1         
	//   61  131:invokeinterface #551 <Method boolean Queue.add(Object)>
	//   62  136:pop             
		zaen.unlock();
	//   63  137:aload_0         
	//   64  138:getfield        #113 <Field Lock zaen>
	//   65  141:invokeinterface #202 <Method void Lock.unlock()>
		return apimethodimpl;
	//   66  146:aload_1         
	//   67  147:areturn         
		apimethodimpl = zags.enqueue(apimethodimpl);
	//   68  148:aload_0         
	//   69  149:getfield        #67  <Field zabs zags>
	//   70  152:aload_1         
	//   71  153:invokeinterface #553 <Method BaseImplementation$ApiMethodImpl zabs.enqueue(BaseImplementation$ApiMethodImpl)>
	//   72  158:astore_1        
		zaen.unlock();
	//   73  159:aload_0         
	//   74  160:getfield        #113 <Field Lock zaen>
	//   75  163:invokeinterface #202 <Method void Lock.unlock()>
		return apimethodimpl;
	//   76  168:aload_1         
	//   77  169:areturn         
		apimethodimpl;
	//   78  170:astore_1        
		zaen.unlock();
	//   79  171:aload_0         
	//   80  172:getfield        #113 <Field Lock zaen>
	//   81  175:invokeinterface #202 <Method void Lock.unlock()>
		throw apimethodimpl;
	//   82  180:aload_1         
	//   83  181:athrow          
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		boolean flag;
		if(apimethodimpl.getClientKey() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #531 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
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
	//    9   15:ldc2            #557 <String "This task can not be executed (it's probably a Batch or malformed)">
	//   10   18:invokestatic    #462 <Method void Preconditions.checkArgument(boolean, Object)>
		flag = zagy.containsKey(((Object) (apimethodimpl.getClientKey())));
	//   11   21:aload_0         
	//   12   22:getfield        #145 <Field Map zagy>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #531 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   15   29:invokeinterface #402 <Method boolean Map.containsKey(Object)>
	//   16   34:istore_2        
		String s;
		if(apimethodimpl.getApi() != null)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #537 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//*  19   39:ifnull          53
			s = apimethodimpl.getApi().getName();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #537 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//   22   46:invokevirtual   #542 <Method String Api.getName()>
	//   23   49:astore_3        
		else
	//*  24   50:goto            57
			s = "the API";
	//   25   53:ldc2            #544 <String "the API">
	//   26   56:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 65);
	//   27   57:new             #310 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:aload_3         
	//   30   62:invokestatic    #315 <Method String String.valueOf(Object)>
	//   31   65:invokevirtual   #318 <Method int String.length()>
	//   32   68:bipush          65
	//   33   70:iadd            
	//   34   71:invokespecial   #320 <Method void StringBuilder(int)>
	//   35   74:astore          4
		stringbuilder.append("GoogleApiClient is not configured to use ");
	//   36   76:aload           4
	//   37   78:ldc2            #546 <String "GoogleApiClient is not configured to use ">
	//   38   81:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   39   84:pop             
		stringbuilder.append(s);
	//   40   85:aload           4
	//   41   87:aload_3         
	//   42   88:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
		stringbuilder.append(" required for this call.");
	//   44   92:aload           4
	//   45   94:ldc2            #548 <String " required for this call.">
	//   46   97:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   47  100:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   48  101:iload_2         
	//   49  102:aload           4
	//   50  104:invokevirtual   #332 <Method String StringBuilder.toString()>
	//   51  107:invokestatic    #462 <Method void Preconditions.checkArgument(boolean, Object)>
		zaen.lock();
	//   52  110:aload_0         
	//   53  111:getfield        #113 <Field Lock zaen>
	//   54  114:invokeinterface #194 <Method void Lock.lock()>
		if(zags == null)
			break MISSING_BLOCK_LABEL_220;
	//   55  119:aload_0         
	//   56  120:getfield        #67  <Field zabs zags>
	//   57  123:ifnull          220
		if(!zagt)
			break MISSING_BLOCK_LABEL_198;
	//   58  126:aload_0         
	//   59  127:getfield        #196 <Field boolean zagt>
	//   60  130:ifeq            198
		zafb.add(((Object) (apimethodimpl)));
	//   61  133:aload_0         
	//   62  134:getfield        #72  <Field Queue zafb>
	//   63  137:aload_1         
	//   64  138:invokeinterface #551 <Method boolean Queue.add(Object)>
	//   65  143:pop             
		BaseImplementation.ApiMethodImpl apimethodimpl1;
		for(; !zafb.isEmpty(); apimethodimpl1.setFailedResult(Status.RESULT_INTERNAL_ERROR))
	//*  66  144:aload_0         
	//*  67  145:getfield        #72  <Field Queue zafb>
	//*  68  148:invokeinterface #560 <Method boolean Queue.isEmpty()>
	//*  69  153:ifne            187
		{
			apimethodimpl1 = (BaseImplementation.ApiMethodImpl)zafb.remove();
	//   70  156:aload_0         
	//   71  157:getfield        #72  <Field Queue zafb>
	//   72  160:invokeinterface #563 <Method Object Queue.remove()>
	//   73  165:checkcast       #474 <Class BaseImplementation$ApiMethodImpl>
	//   74  168:astore_3        
			zahe.zab(((BasePendingResult) (apimethodimpl1)));
	//   75  169:aload_0         
	//   76  170:getfield        #154 <Field zacp zahe>
	//   77  173:aload_3         
	//   78  174:invokevirtual   #566 <Method void zacp.zab(BasePendingResult)>
		}

	//   79  177:aload_3         
	//   80  178:getstatic       #572 <Field Status Status.RESULT_INTERNAL_ERROR>
	//   81  181:invokevirtual   #576 <Method void BaseImplementation$ApiMethodImpl.setFailedResult(Status)>
	//*  82  184:goto            144
		zaen.unlock();
	//   83  187:aload_0         
	//   84  188:getfield        #113 <Field Lock zaen>
	//   85  191:invokeinterface #202 <Method void Lock.unlock()>
		return apimethodimpl;
	//   86  196:aload_1         
	//   87  197:areturn         
		apimethodimpl = zags.execute(apimethodimpl);
	//   88  198:aload_0         
	//   89  199:getfield        #67  <Field zabs zags>
	//   90  202:aload_1         
	//   91  203:invokeinterface #578 <Method BaseImplementation$ApiMethodImpl zabs.execute(BaseImplementation$ApiMethodImpl)>
	//   92  208:astore_1        
		zaen.unlock();
	//   93  209:aload_0         
	//   94  210:getfield        #113 <Field Lock zaen>
	//   95  213:invokeinterface #202 <Method void Lock.unlock()>
		return apimethodimpl;
	//   96  218:aload_1         
	//   97  219:areturn         
		throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//   98  220:new             #292 <Class IllegalStateException>
	//   99  223:dup             
	//  100  224:ldc2            #387 <String "GoogleApiClient is not connected yet.">
	//  101  227:invokespecial   #297 <Method void IllegalStateException(String)>
	//  102  230:athrow          
		apimethodimpl;
	//  103  231:astore_1        
		zaen.unlock();
	//  104  232:aload_0         
	//  105  233:getfield        #113 <Field Lock zaen>
	//  106  236:invokeinterface #202 <Method void Lock.unlock()>
		throw apimethodimpl;
	//  107  241:aload_1         
	//  108  242:athrow          
	}

	public final com.google.android.gms.common.api.Api.Client getClient(com.google.android.gms.common.api.Api.AnyClientKey anyclientkey)
	{
		anyclientkey = ((com.google.android.gms.common.api.Api.AnyClientKey) ((com.google.android.gms.common.api.Api.Client)zagy.get(((Object) (anyclientkey)))));
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Map zagy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #585 <Method Object Map.get(Object)>
	//    4   10:checkcast       #209 <Class com.google.android.gms.common.api.Api$Client>
	//    5   13:astore_1        
		Preconditions.checkNotNull(((Object) (anyclientkey)), "Appropriate Api was not requested.");
	//    6   14:aload_1         
	//    7   15:ldc2            #587 <String "Appropriate Api was not requested.">
	//    8   18:invokestatic    #377 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   21:pop             
		return ((com.google.android.gms.common.api.Api.Client) (anyclientkey));
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	public final ConnectionResult getConnectionResult(Api api)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		if(((GoogleApiClient)this).isConnected() || zagt)
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #385 <Method boolean GoogleApiClient.isConnected()>
	//*   5   13:ifne            37
	//*   6   16:aload_0         
	//*   7   17:getfield        #196 <Field boolean zagt>
	//*   8   20:ifeq            26
			break MISSING_BLOCK_LABEL_37;
	//    9   23:goto            37
		throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
	//   10   26:new             #292 <Class IllegalStateException>
	//   11   29:dup             
	//   12   30:ldc2            #592 <String "Cannot invoke getConnectionResult unless GoogleApiClient is connected">
	//   13   33:invokespecial   #297 <Method void IllegalStateException(String)>
	//   14   36:athrow          
		ConnectionResult connectionresult;
		if(!zagy.containsKey(((Object) (api.getClientKey()))))
			break MISSING_BLOCK_LABEL_161;
	//   15   37:aload_0         
	//   16   38:getfield        #145 <Field Map zagy>
	//   17   41:aload_1         
	//   18   42:invokevirtual   #593 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   19   45:invokeinterface #402 <Method boolean Map.containsKey(Object)>
	//   20   50:ifeq            161
		connectionresult = zags.getConnectionResult(api);
	//   21   53:aload_0         
	//   22   54:getfield        #67  <Field zabs zags>
	//   23   57:aload_1         
	//   24   58:invokeinterface #595 <Method ConnectionResult zabs.getConnectionResult(Api)>
	//   25   63:astore_2        
		if(connectionresult != null)
			break MISSING_BLOCK_LABEL_150;
	//   26   64:aload_2         
	//   27   65:ifnonnull       150
		if(!zagt)
			break MISSING_BLOCK_LABEL_90;
	//   28   68:aload_0         
	//   29   69:getfield        #196 <Field boolean zagt>
	//   30   72:ifeq            90
		api = ((Api) (ConnectionResult.RESULT_SUCCESS));
	//   31   75:getstatic       #601 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   32   78:astore_1        
		zaen.unlock();
	//   33   79:aload_0         
	//   34   80:getfield        #113 <Field Lock zaen>
	//   35   83:invokeinterface #202 <Method void Lock.unlock()>
		return ((ConnectionResult) (api));
	//   36   88:aload_1         
	//   37   89:areturn         
		Log.w("GoogleApiClientImpl", zaay());
	//   38   90:ldc2            #603 <String "GoogleApiClientImpl">
	//   39   93:aload_0         
	//   40   94:invokevirtual   #606 <Method String zaay()>
	//   41   97:invokestatic    #612 <Method int Log.w(String, String)>
	//   42  100:pop             
		Log.wtf("GoogleApiClientImpl", String.valueOf(((Object) (api.getName()))).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), ((Throwable) (new Exception())));
	//   43  101:ldc2            #603 <String "GoogleApiClientImpl">
	//   44  104:aload_1         
	//   45  105:invokevirtual   #542 <Method String Api.getName()>
	//   46  108:invokestatic    #315 <Method String String.valueOf(Object)>
	//   47  111:ldc2            #614 <String " requested in getConnectionResult is not connected but is not present in the failed  connections map">
	//   48  114:invokevirtual   #618 <Method String String.concat(String)>
	//   49  117:new             #620 <Class Exception>
	//   50  120:dup             
	//   51  121:invokespecial   #621 <Method void Exception()>
	//   52  124:invokestatic    #625 <Method int Log.wtf(String, String, Throwable)>
	//   53  127:pop             
		api = ((Api) (new ConnectionResult(8, ((android.app.PendingIntent) (null)))));
	//   54  128:new             #597 <Class ConnectionResult>
	//   55  131:dup             
	//   56  132:bipush          8
	//   57  134:aconst_null     
	//   58  135:invokespecial   #628 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   59  138:astore_1        
		zaen.unlock();
	//   60  139:aload_0         
	//   61  140:getfield        #113 <Field Lock zaen>
	//   62  143:invokeinterface #202 <Method void Lock.unlock()>
		return ((ConnectionResult) (api));
	//   63  148:aload_1         
	//   64  149:areturn         
		zaen.unlock();
	//   65  150:aload_0         
	//   66  151:getfield        #113 <Field Lock zaen>
	//   67  154:invokeinterface #202 <Method void Lock.unlock()>
		return connectionresult;
	//   68  159:aload_2         
	//   69  160:areturn         
		throw new IllegalArgumentException(String.valueOf(((Object) (api.getName()))).concat(" was never registered with GoogleApiClient"));
	//   70  161:new             #630 <Class IllegalArgumentException>
	//   71  164:dup             
	//   72  165:aload_1         
	//   73  166:invokevirtual   #542 <Method String Api.getName()>
	//   74  169:invokestatic    #315 <Method String String.valueOf(Object)>
	//   75  172:ldc2            #632 <String " was never registered with GoogleApiClient">
	//   76  175:invokevirtual   #618 <Method String String.concat(String)>
	//   77  178:invokespecial   #633 <Method void IllegalArgumentException(String)>
	//   78  181:athrow          
		api;
	//   79  182:astore_1        
		zaen.unlock();
	//   80  183:aload_0         
	//   81  184:getfield        #113 <Field Lock zaen>
	//   82  187:invokeinterface #202 <Method void Lock.unlock()>
		throw api;
	//   83  192:aload_1         
	//   84  193:athrow          
	}

	public final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Context mContext>
	//    2    4:areturn         
	}

	public final Looper getLooper()
	{
		return zabj;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Looper zabj>
	//    2    4:areturn         
	}

	public final boolean hasApi(Api api)
	{
		return zagy.containsKey(((Object) (api.getClientKey())));
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Map zagy>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #593 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    4    8:invokeinterface #402 <Method boolean Map.containsKey(Object)>
	//    5   13:ireturn         
	}

	public final boolean hasConnectedApi(Api api)
	{
		if(!((GoogleApiClient)this).isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #385 <Method boolean GoogleApiClient.isConnected()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		api = ((Api) ((com.google.android.gms.common.api.Api.Client)zagy.get(((Object) (api.getClientKey())))));
	//    5    9:aload_0         
	//    6   10:getfield        #145 <Field Map zagy>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #593 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    9   17:invokeinterface #585 <Method Object Map.get(Object)>
	//   10   22:checkcast       #209 <Class com.google.android.gms.common.api.Api$Client>
	//   11   25:astore_1        
		return api != null && ((com.google.android.gms.common.api.Api.Client) (api)).isConnected();
	//   12   26:aload_1         
	//   13   27:ifnull          41
	//   14   30:aload_1         
	//   15   31:invokeinterface #642 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//   16   36:ifeq            41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	public final boolean isConnected()
	{
		zabs zabs1 = zags;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zabs zags>
	//    2    4:astore_1        
		return zabs1 != null && zabs1.isConnected();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #643 <Method boolean zabs.isConnected()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public final boolean isConnecting()
	{
		zabs zabs1 = zags;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zabs zags>
	//    2    4:astore_1        
		return zabs1 != null && zabs1.isConnecting();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #646 <Method boolean zabs.isConnecting()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		return zagr.isConnectionCallbacksRegistered(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #650 <Method boolean GmsClientEventManager.isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:ireturn         
	}

	public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return zagr.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #654 <Method boolean GmsClientEventManager.isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:ireturn         
	}

	public final boolean maybeSignIn(SignInConnectionListener signinconnectionlistener)
	{
		zabs zabs1 = zags;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zabs zags>
	//    2    4:astore_2        
		return zabs1 != null && zabs1.maybeSignIn(signinconnectionlistener);
	//    3    5:aload_2         
	//    4    6:ifnull          21
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #658 <Method boolean zabs.maybeSignIn(SignInConnectionListener)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public final void maybeSignOut()
	{
		zabs zabs1 = zags;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zabs zags>
	//    2    4:astore_1        
		if(zabs1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			zabs1.maybeSignOut();
	//    5    9:aload_1         
	//    6   10:invokeinterface #661 <Method void zabs.maybeSignOut()>
	//    7   15:return          
	}

	public final void reconnect()
	{
		((GoogleApiClient)this).disconnect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #663 <Method void GoogleApiClient.disconnect()>
		((GoogleApiClient)this).connect();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #449 <Method void GoogleApiClient.connect()>
	//    4    8:return          
	}

	public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zagr.registerConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #175 <Method void GmsClientEventManager.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zagr.registerConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #181 <Method void GmsClientEventManager.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public final ListenerHolder registerListener(Object obj)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		obj = ((Object) (zaha.zaa(obj, zabj, "NO_TYPE")));
	//    3    9:aload_0         
	//    4   10:getfield        #98  <Field ListenerHolders zaha>
	//    5   13:aload_1         
	//    6   14:aload_0         
	//    7   15:getfield        #124 <Field Looper zabj>
	//    8   18:ldc2            #667 <String "NO_TYPE">
	//    9   21:invokevirtual   #670 <Method ListenerHolder ListenerHolders.zaa(Object, Looper, String)>
	//   10   24:astore_1        
		zaen.unlock();
	//   11   25:aload_0         
	//   12   26:getfield        #113 <Field Lock zaen>
	//   13   29:invokeinterface #202 <Method void Lock.unlock()>
		return ((ListenerHolder) (obj));
	//   14   34:aload_1         
	//   15   35:areturn         
		obj;
	//   16   36:astore_1        
		zaen.unlock();
	//   17   37:aload_0         
	//   18   38:getfield        #113 <Field Lock zaen>
	//   19   41:invokeinterface #202 <Method void Lock.unlock()>
		throw obj;
	//   20   46:aload_1         
	//   21   47:athrow          
	}

	public final void stopAutoManage(FragmentActivity fragmentactivity)
	{
		fragmentactivity = ((FragmentActivity) (new LifecycleActivity(((android.app.Activity) (fragmentactivity)))));
	//    0    0:new             #675 <Class LifecycleActivity>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #678 <Method void LifecycleActivity(android.app.Activity)>
	//    4    8:astore_1        
		if(zaca >= 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #135 <Field int zaca>
	//*   7   13:iflt            28
		{
			zaj.zaa(((LifecycleActivity) (fragmentactivity))).zaa(zaca);
	//    8   16:aload_1         
	//    9   17:invokestatic    #683 <Method zaj zaj.zaa(LifecycleActivity)>
	//   10   20:aload_0         
	//   11   21:getfield        #135 <Field int zaca>
	//   12   24:invokevirtual   #685 <Method void zaj.zaa(int)>
			return;
	//   13   27:return          
		} else
		{
			throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
	//   14   28:new             #292 <Class IllegalStateException>
	//   15   31:dup             
	//   16   32:ldc2            #687 <String "Called stopAutoManage but automatic lifecycle management is not enabled.">
	//   17   35:invokespecial   #297 <Method void IllegalStateException(String)>
	//   18   38:athrow          
		}
	}

	public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zagr.unregisterConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #690 <Method void GmsClientEventManager.unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zagr.unregisterConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #693 <Method void GmsClientEventManager.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public final void zaa(zacm zacm)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		if(zahd == null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #102 <Field Set zahd>
	//*   5   13:ifnonnull       27
			zahd = ((Set) (new HashSet()));
	//    6   16:aload_0         
	//    7   17:new             #90  <Class HashSet>
	//    8   20:dup             
	//    9   21:invokespecial   #91  <Method void HashSet()>
	//   10   24:putfield        #102 <Field Set zahd>
		zahd.add(((Object) (zacm)));
	//   11   27:aload_0         
	//   12   28:getfield        #102 <Field Set zahd>
	//   13   31:aload_1         
	//   14   32:invokeinterface #695 <Method boolean Set.add(Object)>
	//   15   37:pop             
		zaen.unlock();
	//   16   38:aload_0         
	//   17   39:getfield        #113 <Field Lock zaen>
	//   18   42:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   19   47:return          
		zacm;
	//   20   48:astore_1        
		zaen.unlock();
	//   21   49:aload_0         
	//   22   50:getfield        #113 <Field Lock zaen>
	//   23   53:invokeinterface #202 <Method void Lock.unlock()>
		throw zacm;
	//   24   58:aload_1         
	//   25   59:athrow          
	}

	final boolean zaaw()
	{
		if(!zagt)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field boolean zagt>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		zagt = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #196 <Field boolean zagt>
		zagw.removeMessages(2);
	//    8   14:aload_0         
	//    9   15:getfield        #131 <Field zabb zagw>
	//   10   18:iconst_2        
	//   11   19:invokevirtual   #698 <Method void zabb.removeMessages(int)>
		zagw.removeMessages(1);
	//   12   22:aload_0         
	//   13   23:getfield        #131 <Field zabb zagw>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #698 <Method void zabb.removeMessages(int)>
		zabq zabq1 = zagx;
	//   16   30:aload_0         
	//   17   31:getfield        #700 <Field zabq zagx>
	//   18   34:astore_1        
		if(zabq1 != null)
	//*  19   35:aload_1         
	//*  20   36:ifnull          48
		{
			zabq1.unregister();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #705 <Method void zabq.unregister()>
			zagx = null;
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:putfield        #700 <Field zabq zagx>
		}
		return true;
	//   26   48:iconst_1        
	//   27   49:ireturn         
	}

	final boolean zaax()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		Set set = zahd;
	//    3    9:aload_0         
	//    4   10:getfield        #102 <Field Set zahd>
	//    5   13:astore_2        
		if(set == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       29
		{
			zaen.unlock();
	//    8   18:aload_0         
	//    9   19:getfield        #113 <Field Lock zaen>
	//   10   22:invokeinterface #202 <Method void Lock.unlock()>
			return false;
	//   11   27:iconst_0        
	//   12   28:ireturn         
		}
		boolean flag = zahd.isEmpty();
	//   13   29:aload_0         
	//   14   30:getfield        #102 <Field Set zahd>
	//   15   33:invokeinterface #707 <Method boolean Set.isEmpty()>
	//   16   38:istore_1        
		zaen.unlock();
	//   17   39:aload_0         
	//   18   40:getfield        #113 <Field Lock zaen>
	//   19   43:invokeinterface #202 <Method void Lock.unlock()>
		return flag ^ true;
	//   20   48:iload_1         
	//   21   49:iconst_1        
	//   22   50:ixor            
	//   23   51:ireturn         
		Exception exception;
		exception;
	//   24   52:astore_2        
		zaen.unlock();
	//   25   53:aload_0         
	//   26   54:getfield        #113 <Field Lock zaen>
	//   27   57:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   28   62:aload_2         
	//   29   63:athrow          
	}

	final String zaay()
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #709 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #710 <Method void StringWriter()>
	//    3    7:astore_1        
		((GoogleApiClient)this).dump("", ((FileDescriptor) (null)), new PrintWriter(((java.io.Writer) (stringwriter))), ((String []) (null)));
	//    4    8:aload_0         
	//    5    9:ldc2            #712 <String "">
	//    6   12:aconst_null     
	//    7   13:new             #492 <Class PrintWriter>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #715 <Method void PrintWriter(java.io.Writer)>
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #716 <Method void GoogleApiClient.dump(String, FileDescriptor, PrintWriter, String[])>
		return stringwriter.toString();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #717 <Method String StringWriter.toString()>
	//   15   29:areturn         
	}

	public final void zab(int i, boolean flag)
	{
		if(i == 1 && !flag && !zagt)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          98
	//*   3    5:iload_2         
	//*   4    6:ifne            98
	//*   5    9:aload_0         
	//*   6   10:getfield        #196 <Field boolean zagt>
	//*   7   13:ifne            98
		{
			zagt = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #196 <Field boolean zagt>
			if(zagx == null && !ClientLibraryUtils.isPackageSide())
	//*  11   21:aload_0         
	//*  12   22:getfield        #700 <Field zabq zagx>
	//*  13   25:ifnonnull       60
	//*  14   28:invokestatic    #78  <Method boolean ClientLibraryUtils.isPackageSide()>
	//*  15   31:ifne            60
				zagx = zacc.zaa(mContext.getApplicationContext(), ((zabr) (new zabc(this))));
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #133 <Field GoogleApiAvailability zacc>
	//   19   39:aload_0         
	//   20   40:getfield        #111 <Field Context mContext>
	//   21   43:invokevirtual   #723 <Method Context Context.getApplicationContext()>
	//   22   46:new             #725 <Class zabc>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:invokespecial   #726 <Method void zabc(zaaw)>
	//   26   54:invokevirtual   #731 <Method zabq GoogleApiAvailability.zaa(Context, zabr)>
	//   27   57:putfield        #700 <Field zabq zagx>
			zabb zabb1 = zagw;
	//   28   60:aload_0         
	//   29   61:getfield        #131 <Field zabb zagw>
	//   30   64:astore_3        
			zabb1.sendMessageDelayed(zabb1.obtainMessage(1), zagu);
	//   31   65:aload_3         
	//   32   66:aload_3         
	//   33   67:iconst_1        
	//   34   68:invokevirtual   #735 <Method android.os.Message zabb.obtainMessage(int)>
	//   35   71:aload_0         
	//   36   72:getfield        #84  <Field long zagu>
	//   37   75:invokevirtual   #739 <Method boolean zabb.sendMessageDelayed(android.os.Message, long)>
	//   38   78:pop             
			zabb1 = zagw;
	//   39   79:aload_0         
	//   40   80:getfield        #131 <Field zabb zagw>
	//   41   83:astore_3        
			zabb1.sendMessageDelayed(zabb1.obtainMessage(2), zagv);
	//   42   84:aload_3         
	//   43   85:aload_3         
	//   44   86:iconst_2        
	//   45   87:invokevirtual   #735 <Method android.os.Message zabb.obtainMessage(int)>
	//   46   90:aload_0         
	//   47   91:getfield        #88  <Field long zagv>
	//   48   94:invokevirtual   #739 <Method boolean zabb.sendMessageDelayed(android.os.Message, long)>
	//   49   97:pop             
		}
		zahe.zabx();
	//   50   98:aload_0         
	//   51   99:getfield        #154 <Field zacp zahe>
	//   52  102:invokevirtual   #742 <Method void zacp.zabx()>
		zagr.onUnintentionalDisconnection(i);
	//   53  105:aload_0         
	//   54  106:getfield        #122 <Field GmsClientEventManager zagr>
	//   55  109:iload_1         
	//   56  110:invokevirtual   #745 <Method void GmsClientEventManager.onUnintentionalDisconnection(int)>
		zagr.disableCallbacks();
	//   57  113:aload_0         
	//   58  114:getfield        #122 <Field GmsClientEventManager zagr>
	//   59  117:invokevirtual   #488 <Method void GmsClientEventManager.disableCallbacks()>
		if(i == 2)
	//*  60  120:iload_1         
	//*  61  121:iconst_2        
	//*  62  122:icmpne          129
			zaau();
	//   63  125:aload_0         
	//   64  126:invokespecial   #199 <Method void zaau()>
	//   65  129:return          
	}

	public final void zab(Bundle bundle)
	{
		for(; !zafb.isEmpty(); ((GoogleApiClient)this).execute((BaseImplementation.ApiMethodImpl)zafb.remove()));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Queue zafb>
	//    2    4:invokeinterface #560 <Method boolean Queue.isEmpty()>
	//    3    9:ifne            32
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #72  <Field Queue zafb>
	//    7   17:invokeinterface #563 <Method Object Queue.remove()>
	//    8   22:checkcast       #474 <Class BaseImplementation$ApiMethodImpl>
	//    9   25:invokevirtual   #747 <Method BaseImplementation$ApiMethodImpl GoogleApiClient.execute(BaseImplementation$ApiMethodImpl)>
	//   10   28:pop             
	//*  11   29:goto            0
		zagr.onConnectionSuccess(bundle);
	//   12   32:aload_0         
	//   13   33:getfield        #122 <Field GmsClientEventManager zagr>
	//   14   36:aload_1         
	//   15   37:invokevirtual   #750 <Method void GmsClientEventManager.onConnectionSuccess(Bundle)>
	//   16   40:return          
	}

	public final void zab(zacm zacm)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		if(zahd == null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #102 <Field Set zahd>
	//*   5   13:ifnonnull       36
		{
			Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", ((Throwable) (new Exception())));
	//    6   16:ldc2            #603 <String "GoogleApiClientImpl">
	//    7   19:ldc2            #752 <String "Attempted to remove pending transform when no transforms are registered.">
	//    8   22:new             #620 <Class Exception>
	//    9   25:dup             
	//   10   26:invokespecial   #621 <Method void Exception()>
	//   11   29:invokestatic    #625 <Method int Log.wtf(String, String, Throwable)>
	//   12   32:pop             
			break MISSING_BLOCK_LABEL_85;
	//   13   33:goto            85
		}
		if(!zahd.remove(((Object) (zacm))))
	//*  14   36:aload_0         
	//*  15   37:getfield        #102 <Field Set zahd>
	//*  16   40:aload_1         
	//*  17   41:invokeinterface #754 <Method boolean Set.remove(Object)>
	//*  18   46:ifne            69
		{
			Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", ((Throwable) (new Exception())));
	//   19   49:ldc2            #603 <String "GoogleApiClientImpl">
	//   20   52:ldc2            #756 <String "Failed to remove pending transform - this may lead to memory leaks!">
	//   21   55:new             #620 <Class Exception>
	//   22   58:dup             
	//   23   59:invokespecial   #621 <Method void Exception()>
	//   24   62:invokestatic    #625 <Method int Log.wtf(String, String, Throwable)>
	//   25   65:pop             
			break MISSING_BLOCK_LABEL_85;
	//   26   66:goto            85
		}
		if(!zaax())
	//*  27   69:aload_0         
	//*  28   70:invokevirtual   #758 <Method boolean zaax()>
	//*  29   73:ifne            85
			zags.zaw();
	//   30   76:aload_0         
	//   31   77:getfield        #67  <Field zabs zags>
	//   32   80:invokeinterface #761 <Method void zabs.zaw()>
		zaen.unlock();
	//   33   85:aload_0         
	//   34   86:getfield        #113 <Field Lock zaen>
	//   35   89:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   36   94:return          
		zacm;
	//   37   95:astore_1        
		zaen.unlock();
	//   38   96:aload_0         
	//   39   97:getfield        #113 <Field Lock zaen>
	//   40  100:invokeinterface #202 <Method void Lock.unlock()>
		throw zacm;
	//   41  105:aload_1         
	//   42  106:athrow          
	}

	public final void zac(ConnectionResult connectionresult)
	{
		if(!((GoogleApiAvailabilityLight) (zacc)).isPlayServicesPossiblyUpdating(mContext, connectionresult.getErrorCode()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field GoogleApiAvailability zacc>
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field Context mContext>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #765 <Method int ConnectionResult.getErrorCode()>
	//*   6   12:invokevirtual   #771 <Method boolean GoogleApiAvailabilityLight.isPlayServicesPossiblyUpdating(Context, int)>
	//*   7   15:ifne            23
			zaaw();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #260 <Method boolean zaaw()>
	//   10   22:pop             
		if(!zagt)
	//*  11   23:aload_0         
	//*  12   24:getfield        #196 <Field boolean zagt>
	//*  13   27:ifne            45
		{
			zagr.onConnectionFailure(connectionresult);
	//   14   30:aload_0         
	//   15   31:getfield        #122 <Field GmsClientEventManager zagr>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #774 <Method void GmsClientEventManager.onConnectionFailure(ConnectionResult)>
			zagr.disableCallbacks();
	//   18   38:aload_0         
	//   19   39:getfield        #122 <Field GmsClientEventManager zagr>
	//   20   42:invokevirtual   #488 <Method void GmsClientEventManager.disableCallbacks()>
		}
	//   21   45:return          
	}

	private final Context mContext;
	private final Looper zabj;
	private final int zaca;
	private final GoogleApiAvailability zacc;
	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zacd;
	private boolean zacg;
	private final Lock zaen;
	private final ClientSettings zaes;
	private final Map zaev;
	final Queue zafb = new LinkedList();
	private final GmsClientEventManager zagr;
	private zabs zags;
	private volatile boolean zagt;
	private long zagu;
	private long zagv;
	private final zabb zagw;
	private zabq zagx;
	final Map zagy;
	Set zagz;
	private final ListenerHolders zaha = new ListenerHolders();
	private final ArrayList zahb;
	private Integer zahc;
	Set zahd;
	final zacp zahe;
	private final com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState zahf = new zaax(this);
}
