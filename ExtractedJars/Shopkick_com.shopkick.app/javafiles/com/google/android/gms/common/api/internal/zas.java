// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.*;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zal;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabs, zabe, zau, zav, 
//			zaq, zaaw, SignInConnectionListener, zat

final class zas
	implements zabs
{

	private zas(Context context, zaaw zaaw1, Lock lock, Looper looper, GoogleApiAvailabilityLight googleapiavailabilitylight, Map map, Map map1, 
			ClientSettings clientsettings, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, com.google.android.gms.common.api.Api.Client client, ArrayList arraylist, ArrayList arraylist1, Map map2, Map map3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #44  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void WeakHashMap()>
	//    6   12:invokestatic    #51  <Method Set Collections.newSetFromMap(Map)>
	//    7   15:putfield        #53  <Field Set zaeh>
		zaek = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #55  <Field ConnectionResult zaek>
		zael = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #57  <Field ConnectionResult zael>
		zaem = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #59  <Field boolean zaem>
		zaeo = 0;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #61  <Field int zaeo>
		mContext = context;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:putfield        #63  <Field Context mContext>
		zaed = zaaw1;
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:putfield        #65  <Field zaaw zaed>
		zaen = lock;
	//   26   48:aload_0         
	//   27   49:aload_3         
	//   28   50:putfield        #67  <Field Lock zaen>
		zabj = looper;
	//   29   53:aload_0         
	//   30   54:aload           4
	//   31   56:putfield        #69  <Field Looper zabj>
		zaei = client;
	//   32   59:aload_0         
	//   33   60:aload           10
	//   34   62:putfield        #71  <Field com.google.android.gms.common.api.Api$Client zaei>
		zaee = new zabe(context, zaed, lock, looper, googleapiavailabilitylight, map1, ((ClientSettings) (null)), map3, ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (null)), arraylist1, ((zabt) (new zau(this, ((zat) (null))))));
	//   35   65:aload_0         
	//   36   66:new             #73  <Class zabe>
	//   37   69:dup             
	//   38   70:aload_1         
	//   39   71:aload_0         
	//   40   72:getfield        #65  <Field zaaw zaed>
	//   41   75:aload_3         
	//   42   76:aload           4
	//   43   78:aload           5
	//   44   80:aload           7
	//   45   82:aconst_null     
	//   46   83:aload           14
	//   47   85:aconst_null     
	//   48   86:aload           12
	//   49   88:new             #75  <Class zau>
	//   50   91:dup             
	//   51   92:aload_0         
	//   52   93:aconst_null     
	//   53   94:invokespecial   #78  <Method void zau(zas, zat)>
	//   54   97:invokespecial   #81  <Method void zabe(Context, zaaw, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zabt)>
	//   55  100:putfield        #83  <Field zabe zaee>
		zaef = new zabe(context, zaed, lock, looper, googleapiavailabilitylight, map, clientsettings, map2, abstractclientbuilder, arraylist, ((zabt) (new zav(this, ((zat) (null))))));
	//   56  103:aload_0         
	//   57  104:new             #73  <Class zabe>
	//   58  107:dup             
	//   59  108:aload_1         
	//   60  109:aload_0         
	//   61  110:getfield        #65  <Field zaaw zaed>
	//   62  113:aload_3         
	//   63  114:aload           4
	//   64  116:aload           5
	//   65  118:aload           6
	//   66  120:aload           8
	//   67  122:aload           13
	//   68  124:aload           9
	//   69  126:aload           11
	//   70  128:new             #85  <Class zav>
	//   71  131:dup             
	//   72  132:aload_0         
	//   73  133:aconst_null     
	//   74  134:invokespecial   #86  <Method void zav(zas, zat)>
	//   75  137:invokespecial   #81  <Method void zabe(Context, zaaw, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zabt)>
	//   76  140:putfield        #88  <Field zabe zaef>
		context = ((Context) (new ArrayMap()));
	//   77  143:new             #90  <Class ArrayMap>
	//   78  146:dup             
	//   79  147:invokespecial   #91  <Method void ArrayMap()>
	//   80  150:astore_1        
		for(zaaw1 = ((zaaw) (map1.keySet().iterator())); ((Iterator) (zaaw1)).hasNext(); ((ArrayMap) (context)).put(((Object) ((com.google.android.gms.common.api.Api.AnyClientKey)((Iterator) (zaaw1)).next())), ((Object) (zaee))));
	//   81  151:aload           7
	//   82  153:invokeinterface #97  <Method Set Map.keySet()>
	//   83  158:invokeinterface #103 <Method Iterator Set.iterator()>
	//   84  163:astore_2        
	//   85  164:aload_2         
	//   86  165:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//   87  170:ifeq            194
	//   88  173:aload_1         
	//   89  174:aload_2         
	//   90  175:invokeinterface #113 <Method Object Iterator.next()>
	//   91  180:checkcast       #115 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   92  183:aload_0         
	//   93  184:getfield        #83  <Field zabe zaee>
	//   94  187:invokevirtual   #119 <Method Object ArrayMap.put(Object, Object)>
	//   95  190:pop             
	//*  96  191:goto            164
		for(zaaw1 = ((zaaw) (map.keySet().iterator())); ((Iterator) (zaaw1)).hasNext(); ((ArrayMap) (context)).put(((Object) ((com.google.android.gms.common.api.Api.AnyClientKey)((Iterator) (zaaw1)).next())), ((Object) (zaef))));
	//   97  194:aload           6
	//   98  196:invokeinterface #97  <Method Set Map.keySet()>
	//   99  201:invokeinterface #103 <Method Iterator Set.iterator()>
	//  100  206:astore_2        
	//  101  207:aload_2         
	//  102  208:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//  103  213:ifeq            237
	//  104  216:aload_1         
	//  105  217:aload_2         
	//  106  218:invokeinterface #113 <Method Object Iterator.next()>
	//  107  223:checkcast       #115 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//  108  226:aload_0         
	//  109  227:getfield        #88  <Field zabe zaef>
	//  110  230:invokevirtual   #119 <Method Object ArrayMap.put(Object, Object)>
	//  111  233:pop             
	//* 112  234:goto            207
		zaeg = Collections.unmodifiableMap(((Map) (context)));
	//  113  237:aload_0         
	//  114  238:aload_1         
	//  115  239:invokestatic    #123 <Method Map Collections.unmodifiableMap(Map)>
	//  116  242:putfield        #125 <Field Map zaeg>
	//  117  245:return          
	}

	static ConnectionResult zaa(zas zas1, ConnectionResult connectionresult)
	{
		zas1.zaek = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field ConnectionResult zaek>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public static zas zaa(Context context, zaaw zaaw1, Lock lock, Looper looper, GoogleApiAvailabilityLight googleapiavailabilitylight, Map map, ClientSettings clientsettings, Map map1, 
			com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, ArrayList arraylist)
	{
		ArrayMap arraymap1 = new ArrayMap();
	//    0    0:new             #90  <Class ArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void ArrayMap()>
	//    3    7:astore          13
		ArrayMap arraymap2 = new ArrayMap();
	//    4    9:new             #90  <Class ArrayMap>
	//    5   12:dup             
	//    6   13:invokespecial   #91  <Method void ArrayMap()>
	//    7   16:astore          14
		Object obj = ((Object) (map.entrySet().iterator()));
	//    8   18:aload           5
	//    9   20:invokeinterface #134 <Method Set Map.entrySet()>
	//   10   25:invokeinterface #103 <Method Iterator Set.iterator()>
	//   11   30:astore          15
		map = null;
	//   12   32:aconst_null     
	//   13   33:astore          5
		while(((Iterator) (obj)).hasNext()) 
	//*  14   35:aload           15
	//*  15   37:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//*  16   42:ifeq            139
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   17   45:aload           15
	//   18   47:invokeinterface #113 <Method Object Iterator.next()>
	//   19   52:checkcast       #136 <Class java.util.Map$Entry>
	//   20   55:astore          16
			com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)entry.getValue();
	//   21   57:aload           16
	//   22   59:invokeinterface #139 <Method Object java.util.Map$Entry.getValue()>
	//   23   64:checkcast       #141 <Class com.google.android.gms.common.api.Api$Client>
	//   24   67:astore          12
			if(client.providesSignIn())
	//*  25   69:aload           12
	//*  26   71:invokeinterface #144 <Method boolean com.google.android.gms.common.api.Api$Client.providesSignIn()>
	//*  27   76:ifeq            83
				map = ((Map) (client));
	//   28   79:aload           12
	//   29   81:astore          5
			if(client.requiresSignIn())
	//*  30   83:aload           12
	//*  31   85:invokeinterface #147 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  32   90:ifeq            116
				((Map) (arraymap1)).put(((Object) ((com.google.android.gms.common.api.Api.AnyClientKey)entry.getKey())), ((Object) (client)));
	//   33   93:aload           13
	//   34   95:aload           16
	//   35   97:invokeinterface #150 <Method Object java.util.Map$Entry.getKey()>
	//   36  102:checkcast       #115 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   37  105:aload           12
	//   38  107:invokeinterface #151 <Method Object Map.put(Object, Object)>
	//   39  112:pop             
			else
	//*  40  113:goto            35
				((Map) (arraymap2)).put(((Object) ((com.google.android.gms.common.api.Api.AnyClientKey)entry.getKey())), ((Object) (client)));
	//   41  116:aload           14
	//   42  118:aload           16
	//   43  120:invokeinterface #150 <Method Object java.util.Map$Entry.getKey()>
	//   44  125:checkcast       #115 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   45  128:aload           12
	//   46  130:invokeinterface #151 <Method Object Map.put(Object, Object)>
	//   47  135:pop             
		}
	//*  48  136:goto            35
		Preconditions.checkState(((Map) (arraymap1)).isEmpty() ^ true, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
	//   49  139:aload           13
	//   50  141:invokeinterface #154 <Method boolean Map.isEmpty()>
	//   51  146:iconst_1        
	//   52  147:ixor            
	//   53  148:ldc1            #156 <String "CompositeGoogleApiClient should not be used without any APIs that require sign-in.">
	//   54  150:invokestatic    #162 <Method void Preconditions.checkState(boolean, Object)>
		ArrayMap arraymap = new ArrayMap();
	//   55  153:new             #90  <Class ArrayMap>
	//   56  156:dup             
	//   57  157:invokespecial   #91  <Method void ArrayMap()>
	//   58  160:astore          12
		obj = ((Object) (new ArrayMap()));
	//   59  162:new             #90  <Class ArrayMap>
	//   60  165:dup             
	//   61  166:invokespecial   #91  <Method void ArrayMap()>
	//   62  169:astore          15
		for(Iterator iterator = map1.keySet().iterator(); iterator.hasNext();)
	//*  63  171:aload           7
	//*  64  173:invokeinterface #97  <Method Set Map.keySet()>
	//*  65  178:invokeinterface #103 <Method Iterator Set.iterator()>
	//*  66  183:astore          16
	//*  67  185:aload           16
	//*  68  187:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//*  69  192:ifeq            298
		{
			Api api = (Api)iterator.next();
	//   70  195:aload           16
	//   71  197:invokeinterface #113 <Method Object Iterator.next()>
	//   72  202:checkcast       #164 <Class Api>
	//   73  205:astore          17
			com.google.android.gms.common.api.Api.AnyClientKey anyclientkey = api.getClientKey();
	//   74  207:aload           17
	//   75  209:invokevirtual   #168 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   76  212:astore          18
			if(((Map) (arraymap1)).containsKey(((Object) (anyclientkey))))
	//*  77  214:aload           13
	//*  78  216:aload           18
	//*  79  218:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//*  80  223:ifeq            251
				((Map) (arraymap)).put(((Object) (api)), ((Object) ((Boolean)map1.get(((Object) (api))))));
	//   81  226:aload           12
	//   82  228:aload           17
	//   83  230:aload           7
	//   84  232:aload           17
	//   85  234:invokeinterface #176 <Method Object Map.get(Object)>
	//   86  239:checkcast       #178 <Class Boolean>
	//   87  242:invokeinterface #151 <Method Object Map.put(Object, Object)>
	//   88  247:pop             
			else
	//*  89  248:goto            185
			if(((Map) (arraymap2)).containsKey(((Object) (anyclientkey))))
	//*  90  251:aload           14
	//*  91  253:aload           18
	//*  92  255:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//*  93  260:ifeq            288
				((Map) (obj)).put(((Object) (api)), ((Object) ((Boolean)map1.get(((Object) (api))))));
	//   94  263:aload           15
	//   95  265:aload           17
	//   96  267:aload           7
	//   97  269:aload           17
	//   98  271:invokeinterface #176 <Method Object Map.get(Object)>
	//   99  276:checkcast       #178 <Class Boolean>
	//  100  279:invokeinterface #151 <Method Object Map.put(Object, Object)>
	//  101  284:pop             
			else
	//* 102  285:goto            185
				throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
	//  103  288:new             #180 <Class IllegalStateException>
	//  104  291:dup             
	//  105  292:ldc1            #182 <String "Each API in the isOptionalMap must have a corresponding client in the clients map.">
	//  106  294:invokespecial   #185 <Method void IllegalStateException(String)>
	//  107  297:athrow          
		}

		map1 = ((Map) (new ArrayList()));
	//  108  298:new             #187 <Class ArrayList>
	//  109  301:dup             
	//  110  302:invokespecial   #188 <Method void ArrayList()>
	//  111  305:astore          7
		ArrayList arraylist1 = new ArrayList();
	//  112  307:new             #187 <Class ArrayList>
	//  113  310:dup             
	//  114  311:invokespecial   #188 <Method void ArrayList()>
	//  115  314:astore          16
		arraylist = (ArrayList)arraylist;
	//  116  316:aload           9
	//  117  318:checkcast       #187 <Class ArrayList>
	//  118  321:astore          9
		int j = arraylist.size();
	//  119  323:aload           9
	//  120  325:invokevirtual   #192 <Method int ArrayList.size()>
	//  121  328:istore          11
		for(int i = 0; i < j;)
	//* 122  330:iconst_0        
	//* 123  331:istore          10
	//* 124  333:iload           10
	//* 125  335:iload           11
	//* 126  337:icmpge          424
		{
			Object obj1 = arraylist.get(i);
	//  127  340:aload           9
	//  128  342:iload           10
	//  129  344:invokevirtual   #195 <Method Object ArrayList.get(int)>
	//  130  347:astore          17
			i++;
	//  131  349:iload           10
	//  132  351:iconst_1        
	//  133  352:iadd            
	//  134  353:istore          10
			obj1 = ((Object) ((zaq)obj1));
	//  135  355:aload           17
	//  136  357:checkcast       #197 <Class zaq>
	//  137  360:astore          17
			if(((Map) (arraymap)).containsKey(((Object) (((zaq) (obj1)).mApi))))
	//* 138  362:aload           12
	//* 139  364:aload           17
	//* 140  366:getfield        #201 <Field Api zaq.mApi>
	//* 141  369:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//* 142  374:ifeq            388
				((ArrayList) (map1)).add(obj1);
	//  143  377:aload           7
	//  144  379:aload           17
	//  145  381:invokevirtual   #204 <Method boolean ArrayList.add(Object)>
	//  146  384:pop             
			else
	//* 147  385:goto            333
			if(((Map) (obj)).containsKey(((Object) (((zaq) (obj1)).mApi))))
	//* 148  388:aload           15
	//* 149  390:aload           17
	//* 150  392:getfield        #201 <Field Api zaq.mApi>
	//* 151  395:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//* 152  400:ifeq            414
				arraylist1.add(obj1);
	//  153  403:aload           16
	//  154  405:aload           17
	//  155  407:invokevirtual   #204 <Method boolean ArrayList.add(Object)>
	//  156  410:pop             
			else
	//* 157  411:goto            333
				throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
	//  158  414:new             #180 <Class IllegalStateException>
	//  159  417:dup             
	//  160  418:ldc1            #206 <String "Each ClientCallbacks must have a corresponding API in the isOptionalMap">
	//  161  420:invokespecial   #185 <Method void IllegalStateException(String)>
	//  162  423:athrow          
		}

		return new zas(context, zaaw1, lock, looper, googleapiavailabilitylight, ((Map) (arraymap1)), ((Map) (arraymap2)), clientsettings, abstractclientbuilder, ((com.google.android.gms.common.api.Api.Client) (map)), ((ArrayList) (map1)), arraylist1, ((Map) (arraymap)), ((Map) (obj)));
	//  163  424:new             #2   <Class zas>
	//  164  427:dup             
	//  165  428:aload_0         
	//  166  429:aload_1         
	//  167  430:aload_2         
	//  168  431:aload_3         
	//  169  432:aload           4
	//  170  434:aload           13
	//  171  436:aload           14
	//  172  438:aload           6
	//  173  440:aload           8
	//  174  442:aload           5
	//  175  444:aload           7
	//  176  446:aload           16
	//  177  448:aload           12
	//  178  450:aload           15
	//  179  452:invokespecial   #208 <Method void zas(Context, zaaw, Lock, Looper, GoogleApiAvailabilityLight, Map, Map, ClientSettings, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$Client, ArrayList, ArrayList, Map, Map)>
	//  180  455:areturn         
	}

	static Lock zaa(zas zas1)
	{
		return zas1.zaen;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zaen>
	//    2    4:areturn         
	}

	private final void zaa(int i, boolean flag)
	{
		zaed.zab(i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field zaaw zaed>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #216 <Method void zaaw.zab(int, boolean)>
		zael = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #57  <Field ConnectionResult zael>
		zaek = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #55  <Field ConnectionResult zaek>
	//   11   19:return          
	}

	private final void zaa(Bundle bundle)
	{
		Bundle bundle1 = zaej;
	//    0    0:aload_0         
	//    1    1:getfield        #220 <Field Bundle zaej>
	//    2    4:astore_2        
		if(bundle1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
		{
			zaej = bundle;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #220 <Field Bundle zaej>
			return;
	//    8   14:return          
		}
		if(bundle != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          24
			bundle1.putAll(bundle);
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #225 <Method void Bundle.putAll(Bundle)>
	//   14   24:return          
	}

	private final void zaa(ConnectionResult connectionresult)
	{
		switch(zaeo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int zaeo>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 54
	//	               2 46
		default:
			Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", ((Throwable) (new Exception())));
	//    3   28:ldc1            #228 <String "CompositeGAC">
	//    4   30:ldc1            #230 <String "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor">
	//    5   32:new             #232 <Class Exception>
	//    6   35:dup             
	//    7   36:invokespecial   #233 <Method void Exception()>
	//    8   39:invokestatic    #239 <Method int Log.wtf(String, String, Throwable)>
	//    9   42:pop             
			break;

	//*  10   43:goto            58
		case 2: // '\002'
			zaed.zac(connectionresult);
	//   11   46:aload_0         
	//   12   47:getfield        #65  <Field zaaw zaed>
	//   13   50:aload_1         
	//   14   51:invokevirtual   #242 <Method void zaaw.zac(ConnectionResult)>
			// fall through

		case 1: // '\001'
			zay();
	//   15   54:aload_0         
	//   16   55:invokespecial   #245 <Method void zay()>
			break;
		}
		zaeo = 0;
	//   17   58:aload_0         
	//   18   59:iconst_0        
	//   19   60:putfield        #61  <Field int zaeo>
	//   20   63:return          
	}

	static void zaa(zas zas1, int i, boolean flag)
	{
		zas1.zaa(i, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #248 <Method void zaa(int, boolean)>
	//    4    6:return          
	}

	static void zaa(zas zas1, Bundle bundle)
	{
		zas1.zaa(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #251 <Method void zaa(Bundle)>
	//    3    5:return          
	}

	private final boolean zaa(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		apimethodimpl = ((BaseImplementation.ApiMethodImpl) (apimethodimpl.getClientKey()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #255 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//    2    4:astore_1        
		Preconditions.checkArgument(zaeg.containsKey(((Object) (apimethodimpl))), "GoogleApiClient is not configured to use the API required for this call.");
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field Map zaeg>
	//    5    9:aload_1         
	//    6   10:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//    7   15:ldc2            #257 <String "GoogleApiClient is not configured to use the API required for this call.">
	//    8   18:invokestatic    #260 <Method void Preconditions.checkArgument(boolean, Object)>
		return ((Object) ((zabe)zaeg.get(((Object) (apimethodimpl))))).equals(((Object) (zaef)));
	//    9   21:aload_0         
	//   10   22:getfield        #125 <Field Map zaeg>
	//   11   25:aload_1         
	//   12   26:invokeinterface #176 <Method Object Map.get(Object)>
	//   13   31:checkcast       #73  <Class zabe>
	//   14   34:aload_0         
	//   15   35:getfield        #88  <Field zabe zaef>
	//   16   38:invokevirtual   #263 <Method boolean Object.equals(Object)>
	//   17   41:ireturn         
	}

	static boolean zaa(zas zas1, boolean flag)
	{
		zas1.zaem = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean zaem>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private final PendingIntent zaaa()
	{
		if(zaei == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field com.google.android.gms.common.api.Api$Client zaei>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return PendingIntent.getActivity(mContext, System.identityHashCode(((Object) (zaed))), zaei.getSignInIntent(), 0x8000000);
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field Context mContext>
	//    7   13:aload_0         
	//    8   14:getfield        #65  <Field zaaw zaed>
	//    9   17:invokestatic    #274 <Method int System.identityHashCode(Object)>
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field com.google.android.gms.common.api.Api$Client zaei>
	//   12   24:invokeinterface #278 <Method android.content.Intent com.google.android.gms.common.api.Api$Client.getSignInIntent()>
	//   13   29:ldc2            #279 <Int 0x8000000>
	//   14   32:invokestatic    #285 <Method PendingIntent PendingIntent.getActivity(Context, int, android.content.Intent, int)>
	//   15   35:areturn         
	}

	static ConnectionResult zab(zas zas1, ConnectionResult connectionresult)
	{
		zas1.zael = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field ConnectionResult zael>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void zab(zas zas1)
	{
		zas1.zax();
	//    0    0:aload_0         
	//    1    1:invokespecial   #289 <Method void zax()>
	//    2    4:return          
	}

	private static boolean zab(ConnectionResult connectionresult)
	{
		return connectionresult != null && connectionresult.isSuccess();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokevirtual   #295 <Method boolean ConnectionResult.isSuccess()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	static boolean zac(zas zas1)
	{
		return zas1.zaem;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean zaem>
	//    2    4:ireturn         
	}

	static ConnectionResult zad(zas zas1)
	{
		return zas1.zael;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ConnectionResult zael>
	//    2    4:areturn         
	}

	static zabe zae(zas zas1)
	{
		return zas1.zaef;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field zabe zaef>
	//    2    4:areturn         
	}

	static zabe zaf(zas zas1)
	{
		return zas1.zaee;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field zabe zaee>
	//    2    4:areturn         
	}

	private final void zax()
	{
		if(zab(zaek))
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field ConnectionResult zaek>
	//*   2    4:invokestatic    #303 <Method boolean zab(ConnectionResult)>
	//*   3    7:ifeq            132
		{
			if(!zab(zael) && !zaz())
	//*   4   10:aload_0         
	//*   5   11:getfield        #57  <Field ConnectionResult zael>
	//*   6   14:invokestatic    #303 <Method boolean zab(ConnectionResult)>
	//*   7   17:ifne            65
	//*   8   20:aload_0         
	//*   9   21:invokespecial   #306 <Method boolean zaz()>
	//*  10   24:ifeq            30
	//*  11   27:goto            65
			{
				ConnectionResult connectionresult = zael;
	//   12   30:aload_0         
	//   13   31:getfield        #57  <Field ConnectionResult zael>
	//   14   34:astore_1        
				if(connectionresult != null)
	//*  15   35:aload_1         
	//*  16   36:ifnull          208
					if(zaeo == 1)
	//*  17   39:aload_0         
	//*  18   40:getfield        #61  <Field int zaeo>
	//*  19   43:iconst_1        
	//*  20   44:icmpne          52
					{
						zay();
	//   21   47:aload_0         
	//   22   48:invokespecial   #245 <Method void zay()>
						return;
	//   23   51:return          
					} else
					{
						zaa(connectionresult);
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:invokespecial   #308 <Method void zaa(ConnectionResult)>
						zaee.disconnect();
	//   27   57:aload_0         
	//   28   58:getfield        #83  <Field zabe zaee>
	//   29   61:invokevirtual   #311 <Method void zabe.disconnect()>
						return;
	//   30   64:return          
					}
			} else
			{
				switch(zaeo)
	//*  31   65:aload_0         
	//*  32   66:getfield        #61  <Field int zaeo>
				{
	//*  33   69:tableswitch     1 2: default 92
	//	               1 122
	//	               2 111
				default:
					Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", ((Throwable) (new AssertionError())));
	//   34   92:ldc1            #228 <String "CompositeGAC">
	//   35   94:ldc2            #313 <String "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor">
	//   36   97:new             #315 <Class AssertionError>
	//   37  100:dup             
	//   38  101:invokespecial   #316 <Method void AssertionError()>
	//   39  104:invokestatic    #239 <Method int Log.wtf(String, String, Throwable)>
	//   40  107:pop             
					break;

	//*  41  108:goto            126
				case 2: // '\002'
					zaed.zab(zaej);
	//   42  111:aload_0         
	//   43  112:getfield        #65  <Field zaaw zaed>
	//   44  115:aload_0         
	//   45  116:getfield        #220 <Field Bundle zaej>
	//   46  119:invokevirtual   #318 <Method void zaaw.zab(Bundle)>
					// fall through

				case 1: // '\001'
					zay();
	//   47  122:aload_0         
	//   48  123:invokespecial   #245 <Method void zay()>
					break;
				}
				zaeo = 0;
	//   49  126:aload_0         
	//   50  127:iconst_0        
	//   51  128:putfield        #61  <Field int zaeo>
				return;
	//   52  131:return          
			}
		} else
		{
			if(zaek != null && zab(zael))
	//*  53  132:aload_0         
	//*  54  133:getfield        #55  <Field ConnectionResult zaek>
	//*  55  136:ifnull          165
	//*  56  139:aload_0         
	//*  57  140:getfield        #57  <Field ConnectionResult zael>
	//*  58  143:invokestatic    #303 <Method boolean zab(ConnectionResult)>
	//*  59  146:ifeq            165
			{
				zaef.disconnect();
	//   60  149:aload_0         
	//   61  150:getfield        #88  <Field zabe zaef>
	//   62  153:invokevirtual   #311 <Method void zabe.disconnect()>
				zaa(zaek);
	//   63  156:aload_0         
	//   64  157:aload_0         
	//   65  158:getfield        #55  <Field ConnectionResult zaek>
	//   66  161:invokespecial   #308 <Method void zaa(ConnectionResult)>
				return;
	//   67  164:return          
			}
			ConnectionResult connectionresult1 = zaek;
	//   68  165:aload_0         
	//   69  166:getfield        #55  <Field ConnectionResult zaek>
	//   70  169:astore_1        
			if(connectionresult1 != null && zael != null)
	//*  71  170:aload_1         
	//*  72  171:ifnull          208
	//*  73  174:aload_0         
	//*  74  175:getfield        #57  <Field ConnectionResult zael>
	//*  75  178:ifnull          208
			{
				if(zaef.zahr < zaee.zahr)
	//*  76  181:aload_0         
	//*  77  182:getfield        #88  <Field zabe zaef>
	//*  78  185:getfield        #321 <Field int zabe.zahr>
	//*  79  188:aload_0         
	//*  80  189:getfield        #83  <Field zabe zaee>
	//*  81  192:getfield        #321 <Field int zabe.zahr>
	//*  82  195:icmpge          203
					connectionresult1 = zael;
	//   83  198:aload_0         
	//   84  199:getfield        #57  <Field ConnectionResult zael>
	//   85  202:astore_1        
				zaa(connectionresult1);
	//   86  203:aload_0         
	//   87  204:aload_1         
	//   88  205:invokespecial   #308 <Method void zaa(ConnectionResult)>
			}
		}
	//   89  208:return          
	}

	private final void zay()
	{
		for(Iterator iterator = zaeh.iterator(); iterator.hasNext(); ((SignInConnectionListener)iterator.next()).onComplete());
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Set zaeh>
	//    2    4:invokeinterface #103 <Method Iterator Set.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #113 <Method Object Iterator.next()>
	//    9   25:checkcast       #323 <Class SignInConnectionListener>
	//   10   28:invokeinterface #326 <Method void SignInConnectionListener.onComplete()>
	//*  11   33:goto            10
		zaeh.clear();
	//   12   36:aload_0         
	//   13   37:getfield        #53  <Field Set zaeh>
	//   14   40:invokeinterface #329 <Method void Set.clear()>
	//   15   45:return          
	}

	private final boolean zaz()
	{
		ConnectionResult connectionresult = zael;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ConnectionResult zael>
	//    2    4:astore_1        
		return connectionresult != null && connectionresult.getErrorCode() == 4;
	//    3    5:aload_1         
	//    4    6:ifnull          19
	//    5    9:aload_1         
	//    6   10:invokevirtual   #332 <Method int ConnectionResult.getErrorCode()>
	//    7   13:iconst_4        
	//    8   14:icmpne          19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public final ConnectionResult blockingConnect()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #336 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #337 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #336 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #337 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final void connect()
	{
		zaeo = 2;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:putfield        #61  <Field int zaeo>
		zaem = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #59  <Field boolean zaem>
		zael = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #57  <Field ConnectionResult zael>
		zaek = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #55  <Field ConnectionResult zaek>
		zaee.connect();
	//   12   20:aload_0         
	//   13   21:getfield        #83  <Field zabe zaee>
	//   14   24:invokevirtual   #343 <Method void zabe.connect()>
		zaef.connect();
	//   15   27:aload_0         
	//   16   28:getfield        #88  <Field zabe zaef>
	//   17   31:invokevirtual   #343 <Method void zabe.connect()>
	//   18   34:return          
	}

	public final void disconnect()
	{
		zael = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #57  <Field ConnectionResult zael>
		zaek = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #55  <Field ConnectionResult zaek>
		zaeo = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #61  <Field int zaeo>
		zaee.disconnect();
	//    9   15:aload_0         
	//   10   16:getfield        #83  <Field zabe zaee>
	//   11   19:invokevirtual   #311 <Method void zabe.disconnect()>
		zaef.disconnect();
	//   12   22:aload_0         
	//   13   23:getfield        #88  <Field zabe zaef>
	//   14   26:invokevirtual   #311 <Method void zabe.disconnect()>
		zay();
	//   15   29:aload_0         
	//   16   30:invokespecial   #245 <Method void zay()>
	//   17   33:return          
	}

	public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.append(((CharSequence) (s))).append("authClient").println(":");
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #351 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    3    5:ldc2            #353 <String "authClient">
	//    4    8:invokevirtual   #351 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    5   11:ldc2            #355 <String ":">
	//    6   14:invokevirtual   #358 <Method void PrintWriter.println(String)>
		zaef.dump(String.valueOf(((Object) (s))).concat("  "), filedescriptor, printwriter, as);
	//    7   17:aload_0         
	//    8   18:getfield        #88  <Field zabe zaef>
	//    9   21:aload_1         
	//   10   22:invokestatic    #364 <Method String String.valueOf(Object)>
	//   11   25:ldc2            #366 <String "  ">
	//   12   28:invokevirtual   #370 <Method String String.concat(String)>
	//   13   31:aload_2         
	//   14   32:aload_3         
	//   15   33:aload           4
	//   16   35:invokevirtual   #372 <Method void zabe.dump(String, FileDescriptor, PrintWriter, String[])>
		printwriter.append(((CharSequence) (s))).append("anonClient").println(":");
	//   17   38:aload_3         
	//   18   39:aload_1         
	//   19   40:invokevirtual   #351 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   20   43:ldc2            #374 <String "anonClient">
	//   21   46:invokevirtual   #351 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   22   49:ldc2            #355 <String ":">
	//   23   52:invokevirtual   #358 <Method void PrintWriter.println(String)>
		zaee.dump(String.valueOf(((Object) (s))).concat("  "), filedescriptor, printwriter, as);
	//   24   55:aload_0         
	//   25   56:getfield        #83  <Field zabe zaee>
	//   26   59:aload_1         
	//   27   60:invokestatic    #364 <Method String String.valueOf(Object)>
	//   28   63:ldc2            #366 <String "  ">
	//   29   66:invokevirtual   #370 <Method String String.concat(String)>
	//   30   69:aload_2         
	//   31   70:aload_3         
	//   32   71:aload           4
	//   33   73:invokevirtual   #372 <Method void zabe.dump(String, FileDescriptor, PrintWriter, String[])>
	//   34   76:return          
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		if(zaa(apimethodimpl))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #378 <Method boolean zaa(BaseImplementation$ApiMethodImpl)>
	//*   3    5:ifeq            43
		{
			if(zaz())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #306 <Method boolean zaz()>
	//*   6   12:ifeq            34
			{
				apimethodimpl.setFailedResult(new Status(4, ((String) (null)), zaaa()));
	//    7   15:aload_1         
	//    8   16:new             #380 <Class Status>
	//    9   19:dup             
	//   10   20:iconst_4        
	//   11   21:aconst_null     
	//   12   22:aload_0         
	//   13   23:invokespecial   #382 <Method PendingIntent zaaa()>
	//   14   26:invokespecial   #385 <Method void Status(int, String, PendingIntent)>
	//   15   29:invokevirtual   #389 <Method void BaseImplementation$ApiMethodImpl.setFailedResult(Status)>
				return apimethodimpl;
	//   16   32:aload_1         
	//   17   33:areturn         
			} else
			{
				return zaef.enqueue(apimethodimpl);
	//   18   34:aload_0         
	//   19   35:getfield        #88  <Field zabe zaef>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #391 <Method BaseImplementation$ApiMethodImpl zabe.enqueue(BaseImplementation$ApiMethodImpl)>
	//   22   42:areturn         
			}
		} else
		{
			return zaee.enqueue(apimethodimpl);
	//   23   43:aload_0         
	//   24   44:getfield        #83  <Field zabe zaee>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #391 <Method BaseImplementation$ApiMethodImpl zabe.enqueue(BaseImplementation$ApiMethodImpl)>
	//   27   51:areturn         
		}
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		if(zaa(apimethodimpl))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #378 <Method boolean zaa(BaseImplementation$ApiMethodImpl)>
	//*   3    5:ifeq            43
		{
			if(zaz())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #306 <Method boolean zaz()>
	//*   6   12:ifeq            34
			{
				apimethodimpl.setFailedResult(new Status(4, ((String) (null)), zaaa()));
	//    7   15:aload_1         
	//    8   16:new             #380 <Class Status>
	//    9   19:dup             
	//   10   20:iconst_4        
	//   11   21:aconst_null     
	//   12   22:aload_0         
	//   13   23:invokespecial   #382 <Method PendingIntent zaaa()>
	//   14   26:invokespecial   #385 <Method void Status(int, String, PendingIntent)>
	//   15   29:invokevirtual   #389 <Method void BaseImplementation$ApiMethodImpl.setFailedResult(Status)>
				return apimethodimpl;
	//   16   32:aload_1         
	//   17   33:areturn         
			} else
			{
				return zaef.execute(apimethodimpl);
	//   18   34:aload_0         
	//   19   35:getfield        #88  <Field zabe zaef>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #395 <Method BaseImplementation$ApiMethodImpl zabe.execute(BaseImplementation$ApiMethodImpl)>
	//   22   42:areturn         
			}
		} else
		{
			return zaee.execute(apimethodimpl);
	//   23   43:aload_0         
	//   24   44:getfield        #83  <Field zabe zaee>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #395 <Method BaseImplementation$ApiMethodImpl zabe.execute(BaseImplementation$ApiMethodImpl)>
	//   27   51:areturn         
		}
	}

	public final ConnectionResult getConnectionResult(Api api)
	{
		if(((Object) ((zabe)zaeg.get(((Object) (api.getClientKey()))))).equals(((Object) (zaef))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field Map zaeg>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #168 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//*   4    8:invokeinterface #176 <Method Object Map.get(Object)>
	//*   5   13:checkcast       #73  <Class zabe>
	//*   6   16:aload_0         
	//*   7   17:getfield        #88  <Field zabe zaef>
	//*   8   20:invokevirtual   #263 <Method boolean Object.equals(Object)>
	//*   9   23:ifeq            55
		{
			if(zaz())
	//*  10   26:aload_0         
	//*  11   27:invokespecial   #306 <Method boolean zaz()>
	//*  12   30:ifeq            46
				return new ConnectionResult(4, zaaa());
	//   13   33:new             #292 <Class ConnectionResult>
	//   14   36:dup             
	//   15   37:iconst_4        
	//   16   38:aload_0         
	//   17   39:invokespecial   #382 <Method PendingIntent zaaa()>
	//   18   42:invokespecial   #401 <Method void ConnectionResult(int, PendingIntent)>
	//   19   45:areturn         
			else
				return zaef.getConnectionResult(api);
	//   20   46:aload_0         
	//   21   47:getfield        #88  <Field zabe zaef>
	//   22   50:aload_1         
	//   23   51:invokevirtual   #403 <Method ConnectionResult zabe.getConnectionResult(Api)>
	//   24   54:areturn         
		} else
		{
			return zaee.getConnectionResult(api);
	//   25   55:aload_0         
	//   26   56:getfield        #83  <Field zabe zaee>
	//   27   59:aload_1         
	//   28   60:invokevirtual   #403 <Method ConnectionResult zabe.getConnectionResult(Api)>
	//   29   63:areturn         
		}
	}

	public final boolean isConnected()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zaen>
	//    2    4:invokeinterface #410 <Method void Lock.lock()>
		boolean flag = zaee.isConnected();
	//    3    9:aload_0         
	//    4   10:getfield        #83  <Field zabe zaee>
	//    5   13:invokevirtual   #412 <Method boolean zabe.isConnected()>
	//    6   16:istore_2        
		boolean flag1;
		flag1 = true;
	//    7   17:iconst_1        
	//    8   18:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_59;
	//    9   19:iload_2         
	//   10   20:ifeq            59
		flag = flag1;
	//   11   23:iload_3         
	//   12   24:istore_2        
		if(zaef.isConnected())
			break MISSING_BLOCK_LABEL_61;
	//   13   25:aload_0         
	//   14   26:getfield        #88  <Field zabe zaef>
	//   15   29:invokevirtual   #412 <Method boolean zabe.isConnected()>
	//   16   32:ifne            61
		flag = flag1;
	//   17   35:iload_3         
	//   18   36:istore_2        
		int i;
		if(zaz())
			break MISSING_BLOCK_LABEL_61;
	//   19   37:aload_0         
	//   20   38:invokespecial   #306 <Method boolean zaz()>
	//   21   41:ifne            61
		i = zaeo;
	//   22   44:aload_0         
	//   23   45:getfield        #61  <Field int zaeo>
	//   24   48:istore_1        
		if(i == 1)
	//*  25   49:iload_1         
	//*  26   50:iconst_1        
	//*  27   51:icmpne          59
		{
			flag = flag1;
	//   28   54:iload_3         
	//   29   55:istore_2        
			break MISSING_BLOCK_LABEL_61;
	//   30   56:goto            61
		}
		flag = false;
	//   31   59:iconst_0        
	//   32   60:istore_2        
		zaen.unlock();
	//   33   61:aload_0         
	//   34   62:getfield        #67  <Field Lock zaen>
	//   35   65:invokeinterface #415 <Method void Lock.unlock()>
		return flag;
	//   36   70:iload_2         
	//   37   71:ireturn         
		Exception exception;
		exception;
	//   38   72:astore          4
		zaen.unlock();
	//   39   74:aload_0         
	//   40   75:getfield        #67  <Field Lock zaen>
	//   41   78:invokeinterface #415 <Method void Lock.unlock()>
		throw exception;
	//   42   83:aload           4
	//   43   85:athrow          
	}

	public final boolean isConnecting()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zaen>
	//    2    4:invokeinterface #410 <Method void Lock.lock()>
		int i = zaeo;
	//    3    9:aload_0         
	//    4   10:getfield        #61  <Field int zaeo>
	//    5   13:istore_1        
		boolean flag;
		if(i == 2)
	//*   6   14:iload_1         
	//*   7   15:iconst_2        
	//*   8   16:icmpne          24
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            26
			flag = false;
	//   12   24:iconst_0        
	//   13   25:istore_2        
		zaen.unlock();
	//   14   26:aload_0         
	//   15   27:getfield        #67  <Field Lock zaen>
	//   16   30:invokeinterface #415 <Method void Lock.unlock()>
		return flag;
	//   17   35:iload_2         
	//   18   36:ireturn         
		Exception exception;
		exception;
	//   19   37:astore_3        
		zaen.unlock();
	//   20   38:aload_0         
	//   21   39:getfield        #67  <Field Lock zaen>
	//   22   42:invokeinterface #415 <Method void Lock.unlock()>
		throw exception;
	//   23   47:aload_3         
	//   24   48:athrow          
	}

	public final boolean maybeSignIn(SignInConnectionListener signinconnectionlistener)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zaen>
	//    2    4:invokeinterface #410 <Method void Lock.lock()>
		if(!isConnecting() && !isConnected() || zaef.isConnected())
			break MISSING_BLOCK_LABEL_79;
	//    3    9:aload_0         
	//    4   10:invokevirtual   #420 <Method boolean isConnecting()>
	//    5   13:ifne            23
	//    6   16:aload_0         
	//    7   17:invokevirtual   #421 <Method boolean isConnected()>
	//    8   20:ifeq            79
	//    9   23:aload_0         
	//   10   24:getfield        #88  <Field zabe zaef>
	//   11   27:invokevirtual   #412 <Method boolean zabe.isConnected()>
	//   12   30:ifne            79
		zaeh.add(((Object) (signinconnectionlistener)));
	//   13   33:aload_0         
	//   14   34:getfield        #53  <Field Set zaeh>
	//   15   37:aload_1         
	//   16   38:invokeinterface #422 <Method boolean Set.add(Object)>
	//   17   43:pop             
		if(zaeo == 0)
	//*  18   44:aload_0         
	//*  19   45:getfield        #61  <Field int zaeo>
	//*  20   48:ifne            56
			zaeo = 1;
	//   21   51:aload_0         
	//   22   52:iconst_1        
	//   23   53:putfield        #61  <Field int zaeo>
		zael = null;
	//   24   56:aload_0         
	//   25   57:aconst_null     
	//   26   58:putfield        #57  <Field ConnectionResult zael>
		zaef.connect();
	//   27   61:aload_0         
	//   28   62:getfield        #88  <Field zabe zaef>
	//   29   65:invokevirtual   #343 <Method void zabe.connect()>
		zaen.unlock();
	//   30   68:aload_0         
	//   31   69:getfield        #67  <Field Lock zaen>
	//   32   72:invokeinterface #415 <Method void Lock.unlock()>
		return true;
	//   33   77:iconst_1        
	//   34   78:ireturn         
		zaen.unlock();
	//   35   79:aload_0         
	//   36   80:getfield        #67  <Field Lock zaen>
	//   37   83:invokeinterface #415 <Method void Lock.unlock()>
		return false;
	//   38   88:iconst_0        
	//   39   89:ireturn         
		signinconnectionlistener;
	//   40   90:astore_1        
		zaen.unlock();
	//   41   91:aload_0         
	//   42   92:getfield        #67  <Field Lock zaen>
	//   43   95:invokeinterface #415 <Method void Lock.unlock()>
		throw signinconnectionlistener;
	//   44  100:aload_1         
	//   45  101:athrow          
	}

	public final void maybeSignOut()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zaen>
	//    2    4:invokeinterface #410 <Method void Lock.lock()>
		boolean flag;
		flag = isConnecting();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #420 <Method boolean isConnecting()>
	//    5   13:istore_1        
		zaef.disconnect();
	//    6   14:aload_0         
	//    7   15:getfield        #88  <Field zabe zaef>
	//    8   18:invokevirtual   #311 <Method void zabe.disconnect()>
		zael = new ConnectionResult(4);
	//    9   21:aload_0         
	//   10   22:new             #292 <Class ConnectionResult>
	//   11   25:dup             
	//   12   26:iconst_4        
	//   13   27:invokespecial   #426 <Method void ConnectionResult(int)>
	//   14   30:putfield        #57  <Field ConnectionResult zael>
		if(!flag)
			break MISSING_BLOCK_LABEL_63;
	//   15   33:iload_1         
	//   16   34:ifeq            63
		((Handler) (new zal(zabj))).post(((Runnable) (new zat(this))));
	//   17   37:new             #428 <Class zal>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:getfield        #69  <Field Looper zabj>
	//   21   45:invokespecial   #431 <Method void zal(Looper)>
	//   22   48:new             #433 <Class zat>
	//   23   51:dup             
	//   24   52:aload_0         
	//   25   53:invokespecial   #435 <Method void zat(zas)>
	//   26   56:invokevirtual   #441 <Method boolean Handler.post(Runnable)>
	//   27   59:pop             
		break MISSING_BLOCK_LABEL_67;
	//   28   60:goto            67
		zay();
	//   29   63:aload_0         
	//   30   64:invokespecial   #245 <Method void zay()>
		zaen.unlock();
	//   31   67:aload_0         
	//   32   68:getfield        #67  <Field Lock zaen>
	//   33   71:invokeinterface #415 <Method void Lock.unlock()>
		return;
	//   34   76:return          
		Exception exception;
		exception;
	//   35   77:astore_2        
		zaen.unlock();
	//   36   78:aload_0         
	//   37   79:getfield        #67  <Field Lock zaen>
	//   38   82:invokeinterface #415 <Method void Lock.unlock()>
		throw exception;
	//   39   87:aload_2         
	//   40   88:athrow          
	}

	public final void zaw()
	{
		zaee.zaw();
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field zabe zaee>
	//    2    4:invokevirtual   #444 <Method void zabe.zaw()>
		zaef.zaw();
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field zabe zaef>
	//    5   11:invokevirtual   #444 <Method void zabe.zaw()>
	//    6   14:return          
	}

	private final Context mContext;
	private final Looper zabj;
	private final zaaw zaed;
	private final zabe zaee;
	private final zabe zaef;
	private final Map zaeg;
	private final Set zaeh = Collections.newSetFromMap(((Map) (new WeakHashMap())));
	private final com.google.android.gms.common.api.Api.Client zaei;
	private Bundle zaej;
	private ConnectionResult zaek;
	private ConnectionResult zael;
	private boolean zaem;
	private final Lock zaen;
	private int zaeo;
}
