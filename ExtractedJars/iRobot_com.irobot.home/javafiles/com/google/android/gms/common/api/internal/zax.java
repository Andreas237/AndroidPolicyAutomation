// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import android.support.v4.f.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import com.google.android.gms.tasks.Task;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabs, zaq, zaw, GoogleApiManager, 
//			zaaw, zaz, zaaa, BasePendingResult, 
//			zacp, SignInConnectionListener

public final class zax
	implements zabs
{

	public zax(Context context, Lock lock, Looper looper, GoogleApiAvailabilityLight googleapiavailabilitylight, Map map, ClientSettings clientsettings, Map map1, 
			com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, ArrayList arraylist, zaaw zaaw1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #50  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #51  <Method void HashMap()>
	//    6   12:putfield        #53  <Field Map zaet>
	//    7   15:aload_0         
	//    8   16:new             #50  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #51  <Method void HashMap()>
	//   11   23:putfield        #55  <Field Map zaeu>
	//   12   26:aload_0         
	//   13   27:new             #57  <Class LinkedList>
	//   14   30:dup             
	//   15   31:invokespecial   #58  <Method void LinkedList()>
	//   16   34:putfield        #60  <Field Queue zafb>
		zaen = lock;
	//   17   37:aload_0         
	//   18   38:aload_2         
	//   19   39:putfield        #62  <Field Lock zaen>
		zabj = looper;
	//   20   42:aload_0         
	//   21   43:aload_3         
	//   22   44:putfield        #64  <Field Looper zabj>
		zaey = lock.newCondition();
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:invokeinterface #70  <Method Condition Lock.newCondition()>
	//   26   54:putfield        #72  <Field Condition zaey>
		zaex = googleapiavailabilitylight;
	//   27   57:aload_0         
	//   28   58:aload           4
	//   29   60:putfield        #74  <Field GoogleApiAvailabilityLight zaex>
		zaew = zaaw1;
	//   30   63:aload_0         
	//   31   64:aload           10
	//   32   66:putfield        #76  <Field zaaw zaew>
		zaev = map1;
	//   33   69:aload_0         
	//   34   70:aload           7
	//   35   72:putfield        #78  <Field Map zaev>
		zaes = clientsettings;
	//   36   75:aload_0         
	//   37   76:aload           6
	//   38   78:putfield        #80  <Field ClientSettings zaes>
		zaez = flag;
	//   39   81:aload_0         
	//   40   82:iload           11
	//   41   84:putfield        #82  <Field boolean zaez>
		lock = ((Lock) (new HashMap()));
	//   42   87:new             #50  <Class HashMap>
	//   43   90:dup             
	//   44   91:invokespecial   #51  <Method void HashMap()>
	//   45   94:astore_2        
		for(googleapiavailabilitylight = ((GoogleApiAvailabilityLight) (map1.keySet().iterator())); ((Iterator) (googleapiavailabilitylight)).hasNext(); ((Map) (lock)).put(((Object) (((Api) (map1)).getClientKey())), ((Object) (map1))))
	//*  46   95:aload           7
	//*  47   97:invokeinterface #88  <Method Set Map.keySet()>
	//*  48  102:invokeinterface #94  <Method Iterator Set.iterator()>
	//*  49  107:astore          4
	//*  50  109:aload           4
	//*  51  111:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  52  116:ifeq            148
			map1 = ((Map) ((Api)((Iterator) (googleapiavailabilitylight)).next()));
	//   53  119:aload           4
	//   54  121:invokeinterface #104 <Method Object Iterator.next()>
	//   55  126:checkcast       #106 <Class Api>
	//   56  129:astore          7

	//   57  131:aload_2         
	//   58  132:aload           7
	//   59  134:invokevirtual   #110 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   60  137:aload           7
	//   61  139:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//   62  144:pop             
	//*  63  145:goto            109
		googleapiavailabilitylight = ((GoogleApiAvailabilityLight) (new HashMap()));
	//   64  148:new             #50  <Class HashMap>
	//   65  151:dup             
	//   66  152:invokespecial   #51  <Method void HashMap()>
	//   67  155:astore          4
		map1 = ((Map) ((ArrayList)arraylist));
	//   68  157:aload           9
	//   69  159:checkcast       #116 <Class ArrayList>
	//   70  162:astore          7
		int j = ((ArrayList) (map1)).size();
	//   71  164:aload           7
	//   72  166:invokevirtual   #120 <Method int ArrayList.size()>
	//   73  169:istore          13
		for(int i = 0; i < j;)
	//*  74  171:iconst_0        
	//*  75  172:istore          12
	//*  76  174:iload           12
	//*  77  176:iload           13
	//*  78  178:icmpge          221
		{
			arraylist = ((ArrayList) (((ArrayList) (map1)).get(i)));
	//   79  181:aload           7
	//   80  183:iload           12
	//   81  185:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   82  188:astore          9
			i++;
	//   83  190:iload           12
	//   84  192:iconst_1        
	//   85  193:iadd            
	//   86  194:istore          12
			arraylist = ((ArrayList) ((zaq)arraylist));
	//   87  196:aload           9
	//   88  198:checkcast       #126 <Class zaq>
	//   89  201:astore          9
			((Map) (googleapiavailabilitylight)).put(((Object) (((zaq) (arraylist)).mApi)), ((Object) (arraylist)));
	//   90  203:aload           4
	//   91  205:aload           9
	//   92  207:getfield        #130 <Field Api zaq.mApi>
	//   93  210:aload           9
	//   94  212:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//   95  217:pop             
		}

	//*  96  218:goto            174
		map = ((Map) (map.entrySet().iterator()));
	//   97  221:aload           5
	//   98  223:invokeinterface #133 <Method Set Map.entrySet()>
	//   99  228:invokeinterface #94  <Method Iterator Set.iterator()>
	//  100  233:astore          5
		boolean flag3 = false;
	//  101  235:iconst_0        
	//  102  236:istore          14
		boolean flag2 = true;
	//  103  238:iconst_1        
	//  104  239:istore          13
		boolean flag1;
		boolean flag5;
		for(flag1 = false; ((Iterator) (map)).hasNext(); flag1 = flag5)
	//* 105  241:iconst_0        
	//* 106  242:istore          12
	//* 107  244:aload           5
	//* 108  246:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//* 109  251:ifeq            461
		{
			map1 = ((Map) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//  110  254:aload           5
	//  111  256:invokeinterface #104 <Method Object Iterator.next()>
	//  112  261:checkcast       #135 <Class java.util.Map$Entry>
	//  113  264:astore          7
			zaaw1 = ((zaaw) ((Api)((Map) (lock)).get(((java.util.Map.Entry) (map1)).getKey())));
	//  114  266:aload_2         
	//  115  267:aload           7
	//  116  269:invokeinterface #138 <Method Object java.util.Map$Entry.getKey()>
	//  117  274:invokeinterface #141 <Method Object Map.get(Object)>
	//  118  279:checkcast       #106 <Class Api>
	//  119  282:astore          10
			arraylist = ((ArrayList) ((com.google.android.gms.common.api.Api.Client)((java.util.Map.Entry) (map1)).getValue()));
	//  120  284:aload           7
	//  121  286:invokeinterface #144 <Method Object java.util.Map$Entry.getValue()>
	//  122  291:checkcast       #146 <Class com.google.android.gms.common.api.Api$Client>
	//  123  294:astore          9
			if(((com.google.android.gms.common.api.Api.Client) (arraylist)).requiresGooglePlayServices())
	//* 124  296:aload           9
	//* 125  298:invokeinterface #149 <Method boolean com.google.android.gms.common.api.Api$Client.requiresGooglePlayServices()>
	//* 126  303:ifeq            342
			{
				if(!((Boolean)zaev.get(((Object) (zaaw1)))).booleanValue())
	//* 127  306:aload_0         
	//* 128  307:getfield        #78  <Field Map zaev>
	//* 129  310:aload           10
	//* 130  312:invokeinterface #141 <Method Object Map.get(Object)>
	//* 131  317:checkcast       #151 <Class Boolean>
	//* 132  320:invokevirtual   #154 <Method boolean Boolean.booleanValue()>
	//* 133  323:ifne            332
					flag3 = true;
	//  134  326:iconst_1        
	//  135  327:istore          14
				else
	//* 136  329:goto            336
					flag3 = flag1;
	//  137  332:iload           12
	//  138  334:istore          14
				flag1 = true;
	//  139  336:iconst_1        
	//  140  337:istore          12
			} else
	//* 141  339:goto            361
			{
				flag2 = flag3;
	//  142  342:iload           14
	//  143  344:istore          13
				flag3 = flag1;
	//  144  346:iload           12
	//  145  348:istore          14
				boolean flag4 = false;
	//  146  350:iconst_0        
	//  147  351:istore          15
				flag1 = flag2;
	//  148  353:iload           13
	//  149  355:istore          12
				flag2 = flag4;
	//  150  357:iload           15
	//  151  359:istore          13
			}
			zaaw1 = ((zaaw) (new zaw(context, ((Api) (zaaw1)), looper, ((com.google.android.gms.common.api.Api.Client) (arraylist)), (zaq)((Map) (googleapiavailabilitylight)).get(((Object) (zaaw1))), clientsettings, abstractclientbuilder)));
	//  152  361:new             #156 <Class zaw>
	//  153  364:dup             
	//  154  365:aload_1         
	//  155  366:aload           10
	//  156  368:aload_3         
	//  157  369:aload           9
	//  158  371:aload           4
	//  159  373:aload           10
	//  160  375:invokeinterface #141 <Method Object Map.get(Object)>
	//  161  380:checkcast       #126 <Class zaq>
	//  162  383:aload           6
	//  163  385:aload           8
	//  164  387:invokespecial   #159 <Method void zaw(Context, Api, Looper, com.google.android.gms.common.api.Api$Client, zaq, ClientSettings, com.google.android.gms.common.api.Api$AbstractClientBuilder)>
	//  165  390:astore          10
			zaet.put(((Object) ((com.google.android.gms.common.api.Api.AnyClientKey)((java.util.Map.Entry) (map1)).getKey())), ((Object) (zaaw1)));
	//  166  392:aload_0         
	//  167  393:getfield        #53  <Field Map zaet>
	//  168  396:aload           7
	//  169  398:invokeinterface #138 <Method Object java.util.Map$Entry.getKey()>
	//  170  403:checkcast       #161 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//  171  406:aload           10
	//  172  408:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//  173  413:pop             
			if(((com.google.android.gms.common.api.Api.Client) (arraylist)).requiresSignIn())
	//* 174  414:aload           9
	//* 175  416:invokeinterface #164 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//* 176  421:ifeq            446
				zaeu.put(((Object) ((com.google.android.gms.common.api.Api.AnyClientKey)((java.util.Map.Entry) (map1)).getKey())), ((Object) (zaaw1)));
	//  177  424:aload_0         
	//  178  425:getfield        #55  <Field Map zaeu>
	//  179  428:aload           7
	//  180  430:invokeinterface #138 <Method Object java.util.Map$Entry.getKey()>
	//  181  435:checkcast       #161 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//  182  438:aload           10
	//  183  440:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//  184  445:pop             
			flag5 = flag3;
	//  185  446:iload           14
	//  186  448:istore          15
			flag3 = flag1;
	//  187  450:iload           12
	//  188  452:istore          14
		}

	//  189  454:iload           15
	//  190  456:istore          12
	//* 191  458:goto            244
		if(flag3 && !flag2 && !flag1)
	//* 192  461:iload           14
	//* 193  463:ifeq            482
	//* 194  466:iload           13
	//* 195  468:ifne            482
	//* 196  471:iload           12
	//* 197  473:ifne            482
			flag = true;
	//  198  476:iconst_1        
	//  199  477:istore          11
		else
	//* 200  479:goto            485
			flag = false;
	//  201  482:iconst_0        
	//  202  483:istore          11
		zafa = flag;
	//  203  485:aload_0         
	//  204  486:iload           11
	//  205  488:putfield        #166 <Field boolean zafa>
	//  206  491:aload_0         
	//  207  492:invokestatic    #172 <Method GoogleApiManager GoogleApiManager.zabc()>
	//  208  495:putfield        #174 <Field GoogleApiManager zabm>
	//  209  498:return          
	}

	private final ConnectionResult zaa(com.google.android.gms.common.api.Api.AnyClientKey anyclientkey)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #182 <Method void Lock.lock()>
		anyclientkey = ((com.google.android.gms.common.api.Api.AnyClientKey) ((zaw)zaet.get(((Object) (anyclientkey)))));
	//    3    9:aload_0         
	//    4   10:getfield        #53  <Field Map zaet>
	//    5   13:aload_1         
	//    6   14:invokeinterface #141 <Method Object Map.get(Object)>
	//    7   19:checkcast       #156 <Class zaw>
	//    8   22:astore_1        
		if(zafd == null || anyclientkey == null)
			break MISSING_BLOCK_LABEL_62;
	//    9   23:aload_0         
	//   10   24:getfield        #184 <Field Map zafd>
	//   11   27:ifnull          62
	//   12   30:aload_1         
	//   13   31:ifnull          62
		anyclientkey = ((com.google.android.gms.common.api.Api.AnyClientKey) ((ConnectionResult)zafd.get(((Object) (((GoogleApi) (anyclientkey)).zak())))));
	//   14   34:aload_0         
	//   15   35:getfield        #184 <Field Map zafd>
	//   16   38:aload_1         
	//   17   39:invokevirtual   #190 <Method zai GoogleApi.zak()>
	//   18   42:invokeinterface #141 <Method Object Map.get(Object)>
	//   19   47:checkcast       #192 <Class ConnectionResult>
	//   20   50:astore_1        
		zaen.unlock();
	//   21   51:aload_0         
	//   22   52:getfield        #62  <Field Lock zaen>
	//   23   55:invokeinterface #195 <Method void Lock.unlock()>
		return ((ConnectionResult) (anyclientkey));
	//   24   60:aload_1         
	//   25   61:areturn         
		zaen.unlock();
	//   26   62:aload_0         
	//   27   63:getfield        #62  <Field Lock zaen>
	//   28   66:invokeinterface #195 <Method void Lock.unlock()>
		return null;
	//   29   71:aconst_null     
	//   30   72:areturn         
		anyclientkey;
	//   31   73:astore_1        
		zaen.unlock();
	//   32   74:aload_0         
	//   33   75:getfield        #62  <Field Lock zaen>
	//   34   78:invokeinterface #195 <Method void Lock.unlock()>
		throw anyclientkey;
	//   35   83:aload_1         
	//   36   84:athrow          
	}

	static ConnectionResult zaa(zax zax1, ConnectionResult connectionresult)
	{
		zax1.zafg = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #199 <Field ConnectionResult zafg>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Map zaa(zax zax1, Map map)
	{
		zax1.zafd = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #184 <Field Map zafd>
		return map;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Lock zaa(zax zax1)
	{
		return zax1.zaen;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:areturn         
	}

	private final boolean zaa(zaw zaw1, ConnectionResult connectionresult)
	{
		return !connectionresult.isSuccess() && !connectionresult.hasResolution() && ((Boolean)zaev.get(((Object) (((GoogleApi) (zaw1)).getApi())))).booleanValue() && zaw1.zaab().requiresGooglePlayServices() && zaex.isUserResolvableError(connectionresult.getErrorCode());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #205 <Method boolean ConnectionResult.isSuccess()>
	//    2    4:ifne            64
	//    3    7:aload_2         
	//    4    8:invokevirtual   #208 <Method boolean ConnectionResult.hasResolution()>
	//    5   11:ifne            64
	//    6   14:aload_0         
	//    7   15:getfield        #78  <Field Map zaev>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #212 <Method Api GoogleApi.getApi()>
	//   10   22:invokeinterface #141 <Method Object Map.get(Object)>
	//   11   27:checkcast       #151 <Class Boolean>
	//   12   30:invokevirtual   #154 <Method boolean Boolean.booleanValue()>
	//   13   33:ifeq            64
	//   14   36:aload_1         
	//   15   37:invokevirtual   #216 <Method com.google.android.gms.common.api.Api$Client zaw.zaab()>
	//   16   40:invokeinterface #149 <Method boolean com.google.android.gms.common.api.Api$Client.requiresGooglePlayServices()>
	//   17   45:ifeq            64
	//   18   48:aload_0         
	//   19   49:getfield        #74  <Field GoogleApiAvailabilityLight zaex>
	//   20   52:aload_2         
	//   21   53:invokevirtual   #219 <Method int ConnectionResult.getErrorCode()>
	//   22   56:invokevirtual   #225 <Method boolean GoogleApiAvailabilityLight.isUserResolvableError(int)>
	//   23   59:ifeq            64
	//   24   62:iconst_1        
	//   25   63:ireturn         
	//   26   64:iconst_0        
	//   27   65:ireturn         
	}

	static boolean zaa(zax zax1, zaw zaw1, ConnectionResult connectionresult)
	{
		return zax1.zaa(zaw1, connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #229 <Method boolean zaa(zaw, ConnectionResult)>
	//    4    6:ireturn         
	}

	static boolean zaa(zax zax1, boolean flag)
	{
		zax1.zafc = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #232 <Field boolean zafc>
		return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
	}

	private final boolean zaac()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #182 <Method void Lock.lock()>
		if(zafc && zaez) goto _L2; else goto _L1
	//    3    9:aload_0         
	//    4   10:getfield        #232 <Field boolean zafc>
	//    5   13:ifeq            77
	//    6   16:aload_0         
	//    7   17:getfield        #82  <Field boolean zaez>
	//    8   20:ifne            26
	//*   9   23:goto            77
_L2:
		Iterator iterator = zaeu.keySet().iterator();
	//   10   26:aload_0         
	//   11   27:getfield        #55  <Field Map zaeu>
	//   12   30:invokeinterface #88  <Method Set Map.keySet()>
	//   13   35:invokeinterface #94  <Method Iterator Set.iterator()>
	//   14   40:astore_2        
_L3:
		ConnectionResult connectionresult;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_88;
	//   15   41:aload_2         
	//   16   42:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//   17   47:ifeq            88
		connectionresult = zaa((com.google.android.gms.common.api.Api.AnyClientKey)iterator.next());
	//   18   50:aload_0         
	//   19   51:aload_2         
	//   20   52:invokeinterface #104 <Method Object Iterator.next()>
	//   21   57:checkcast       #161 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//   22   60:invokespecial   #235 <Method ConnectionResult zaa(com.google.android.gms.common.api.Api$AnyClientKey)>
	//   23   63:astore_3        
		if(connectionresult == null)
			break; /* Loop/switch isn't completed */
	//   24   64:aload_3         
	//   25   65:ifnull          77
		boolean flag = connectionresult.isSuccess();
	//   26   68:aload_3         
	//   27   69:invokevirtual   #205 <Method boolean ConnectionResult.isSuccess()>
	//   28   72:istore_1        
		if(flag) goto _L3; else goto _L1
	//   29   73:iload_1         
	//   30   74:ifne            41
_L1:
		zaen.unlock();
	//   31   77:aload_0         
	//   32   78:getfield        #62  <Field Lock zaen>
	//   33   81:invokeinterface #195 <Method void Lock.unlock()>
		return false;
	//   34   86:iconst_0        
	//   35   87:ireturn         
		zaen.unlock();
	//   36   88:aload_0         
	//   37   89:getfield        #62  <Field Lock zaen>
	//   38   92:invokeinterface #195 <Method void Lock.unlock()>
		return true;
	//   39   97:iconst_1        
	//   40   98:ireturn         
		Exception exception;
		exception;
	//   41   99:astore_2        
		zaen.unlock();
	//   42  100:aload_0         
	//   43  101:getfield        #62  <Field Lock zaen>
	//   44  104:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   45  109:aload_2         
	//   46  110:athrow          
	}

	private final void zaad()
	{
		if(zaes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field ClientSettings zaes>
	//*   2    4:ifnonnull       18
		{
			zaew.zagz = Collections.emptySet();
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field zaaw zaew>
	//    5   11:invokestatic    #241 <Method Set Collections.emptySet()>
	//    6   14:putfield        #247 <Field Set zaaw.zagz>
			return;
	//    7   17:return          
		}
		HashSet hashset = new HashSet(((Collection) (zaes.getRequiredScopes())));
	//    8   18:new             #249 <Class HashSet>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #80  <Field ClientSettings zaes>
	//   12   26:invokevirtual   #254 <Method Set ClientSettings.getRequiredScopes()>
	//   13   29:invokespecial   #257 <Method void HashSet(Collection)>
	//   14   32:astore_1        
		Map map = zaes.getOptionalApiSettings();
	//   15   33:aload_0         
	//   16   34:getfield        #80  <Field ClientSettings zaes>
	//   17   37:invokevirtual   #261 <Method Map ClientSettings.getOptionalApiSettings()>
	//   18   40:astore_2        
		Iterator iterator = map.keySet().iterator();
	//   19   41:aload_2         
	//   20   42:invokeinterface #88  <Method Set Map.keySet()>
	//   21   47:invokeinterface #94  <Method Iterator Set.iterator()>
	//   22   52:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   53:aload_3         
	//   24   54:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//   25   59:ifeq            118
			Api api = (Api)iterator.next();
	//   26   62:aload_3         
	//   27   63:invokeinterface #104 <Method Object Iterator.next()>
	//   28   68:checkcast       #106 <Class Api>
	//   29   71:astore          4
			ConnectionResult connectionresult = getConnectionResult(api);
	//   30   73:aload_0         
	//   31   74:aload           4
	//   32   76:invokevirtual   #265 <Method ConnectionResult getConnectionResult(Api)>
	//   33   79:astore          5
			if(connectionresult != null && connectionresult.isSuccess())
	//*  34   81:aload           5
	//*  35   83:ifnull          53
	//*  36   86:aload           5
	//*  37   88:invokevirtual   #205 <Method boolean ConnectionResult.isSuccess()>
	//*  38   91:ifeq            53
				((Set) (hashset)).addAll(((Collection) (((com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings)map.get(((Object) (api)))).mScopes)));
	//   39   94:aload_1         
	//   40   95:aload_2         
	//   41   96:aload           4
	//   42   98:invokeinterface #141 <Method Object Map.get(Object)>
	//   43  103:checkcast       #267 <Class com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings>
	//   44  106:getfield        #270 <Field Set com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings.mScopes>
	//   45  109:invokeinterface #274 <Method boolean Set.addAll(Collection)>
	//   46  114:pop             
		} while(true);
	//   47  115:goto            53
		zaew.zagz = ((Set) (hashset));
	//   48  118:aload_0         
	//   49  119:getfield        #76  <Field zaaw zaew>
	//   50  122:aload_1         
	//   51  123:putfield        #247 <Field Set zaaw.zagz>
	//   52  126:return          
	}

	private final void zaae()
	{
		for(; !zafb.isEmpty(); execute((BaseImplementation.ApiMethodImpl)zafb.remove()));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Queue zafb>
	//    2    4:invokeinterface #281 <Method boolean Queue.isEmpty()>
	//    3    9:ifne            32
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #60  <Field Queue zafb>
	//    7   17:invokeinterface #284 <Method Object Queue.remove()>
	//    8   22:checkcast       #286 <Class BaseImplementation$ApiMethodImpl>
	//    9   25:invokevirtual   #290 <Method BaseImplementation$ApiMethodImpl execute(BaseImplementation$ApiMethodImpl)>
	//   10   28:pop             
	//*  11   29:goto            0
		zaew.zab(((android.os.Bundle) (null)));
	//   12   32:aload_0         
	//   13   33:getfield        #76  <Field zaaw zaew>
	//   14   36:aconst_null     
	//   15   37:invokevirtual   #294 <Method void zaaw.zab(android.os.Bundle)>
	//   16   40:return          
	}

	private final ConnectionResult zaaf()
	{
		Iterator iterator = zaet.values().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Map zaet>
	//    2    4:invokeinterface #300 <Method Collection Map.values()>
	//    3    9:invokeinterface #303 <Method Iterator Collection.iterator()>
	//    4   14:astore          7
		ConnectionResult connectionresult = null;
	//    5   16:aconst_null     
	//    6   17:astore          4
		ConnectionResult connectionresult1 = null;
	//    7   19:aconst_null     
	//    8   20:astore          5
		int j = 0;
	//    9   22:iconst_0        
	//   10   23:istore_2        
		int i = 0;
	//   11   24:iconst_0        
	//   12   25:istore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   13   26:aload           7
	//   14   28:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//   15   33:ifeq            201
			Object obj = ((Object) ((zaw)iterator.next()));
	//   16   36:aload           7
	//   17   38:invokeinterface #104 <Method Object Iterator.next()>
	//   18   43:checkcast       #156 <Class zaw>
	//   19   46:astore          6
			Api api = ((GoogleApi) (obj)).getApi();
	//   20   48:aload           6
	//   21   50:invokevirtual   #212 <Method Api GoogleApi.getApi()>
	//   22   53:astore          8
			obj = ((Object) (((GoogleApi) (obj)).zak()));
	//   23   55:aload           6
	//   24   57:invokevirtual   #190 <Method zai GoogleApi.zak()>
	//   25   60:astore          6
			obj = ((Object) ((ConnectionResult)zafd.get(obj)));
	//   26   62:aload_0         
	//   27   63:getfield        #184 <Field Map zafd>
	//   28   66:aload           6
	//   29   68:invokeinterface #141 <Method Object Map.get(Object)>
	//   30   73:checkcast       #192 <Class ConnectionResult>
	//   31   76:astore          6
			if(!((ConnectionResult) (obj)).isSuccess() && (!((Boolean)zaev.get(((Object) (api)))).booleanValue() || ((ConnectionResult) (obj)).hasResolution() || zaex.isUserResolvableError(((ConnectionResult) (obj)).getErrorCode())))
	//*  32   78:aload           6
	//*  33   80:invokevirtual   #205 <Method boolean ConnectionResult.isSuccess()>
	//*  34   83:ifne            26
	//*  35   86:aload_0         
	//*  36   87:getfield        #78  <Field Map zaev>
	//*  37   90:aload           8
	//*  38   92:invokeinterface #141 <Method Object Map.get(Object)>
	//*  39   97:checkcast       #151 <Class Boolean>
	//*  40  100:invokevirtual   #154 <Method boolean Boolean.booleanValue()>
	//*  41  103:ifeq            129
	//*  42  106:aload           6
	//*  43  108:invokevirtual   #208 <Method boolean ConnectionResult.hasResolution()>
	//*  44  111:ifne            129
	//*  45  114:aload_0         
	//*  46  115:getfield        #74  <Field GoogleApiAvailabilityLight zaex>
	//*  47  118:aload           6
	//*  48  120:invokevirtual   #219 <Method int ConnectionResult.getErrorCode()>
	//*  49  123:invokevirtual   #225 <Method boolean GoogleApiAvailabilityLight.isUserResolvableError(int)>
	//*  50  126:ifeq            26
				if(((ConnectionResult) (obj)).getErrorCode() == 4 && zaez)
	//*  51  129:aload           6
	//*  52  131:invokevirtual   #219 <Method int ConnectionResult.getErrorCode()>
	//*  53  134:iconst_4        
	//*  54  135:icmpne          173
	//*  55  138:aload_0         
	//*  56  139:getfield        #82  <Field boolean zaez>
	//*  57  142:ifeq            173
				{
					int k = api.zah().getPriority();
	//   58  145:aload           8
	//   59  147:invokevirtual   #307 <Method com.google.android.gms.common.api.Api$BaseClientBuilder Api.zah()>
	//   60  150:invokevirtual   #312 <Method int com.google.android.gms.common.api.Api$BaseClientBuilder.getPriority()>
	//   61  153:istore_3        
					if(connectionresult1 == null || i > k)
	//*  62  154:aload           5
	//*  63  156:ifnull          164
	//*  64  159:iload_1         
	//*  65  160:iload_3         
	//*  66  161:icmple          26
					{
						connectionresult1 = ((ConnectionResult) (obj));
	//   67  164:aload           6
	//   68  166:astore          5
						i = k;
	//   69  168:iload_3         
	//   70  169:istore_1        
					}
				} else
	//*  71  170:goto            26
				{
					int l = api.zah().getPriority();
	//   72  173:aload           8
	//   73  175:invokevirtual   #307 <Method com.google.android.gms.common.api.Api$BaseClientBuilder Api.zah()>
	//   74  178:invokevirtual   #312 <Method int com.google.android.gms.common.api.Api$BaseClientBuilder.getPriority()>
	//   75  181:istore_3        
					if(connectionresult == null || j > l)
	//*  76  182:aload           4
	//*  77  184:ifnull          192
	//*  78  187:iload_2         
	//*  79  188:iload_3         
	//*  80  189:icmple          26
					{
						connectionresult = ((ConnectionResult) (obj));
	//   81  192:aload           6
	//   82  194:astore          4
						j = l;
	//   83  196:iload_3         
	//   84  197:istore_2        
					}
				}
		} while(true);
	//   85  198:goto            26
		if(connectionresult != null && connectionresult1 != null && j > i)
	//*  86  201:aload           4
	//*  87  203:ifnull          219
	//*  88  206:aload           5
	//*  89  208:ifnull          219
	//*  90  211:iload_2         
	//*  91  212:iload_1         
	//*  92  213:icmple          219
			return connectionresult1;
	//   93  216:aload           5
	//   94  218:areturn         
		else
			return connectionresult;
	//   95  219:aload           4
	//   96  221:areturn         
	}

	static Map zab(zax zax1, Map map)
	{
		zax1.zafe = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #314 <Field Map zafe>
		return map;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private final boolean zab(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		com.google.android.gms.common.api.Api.AnyClientKey anyclientkey = apimethodimpl.getClientKey();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #316 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//    2    4:astore_2        
		ConnectionResult connectionresult = zaa(anyclientkey);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #235 <Method ConnectionResult zaa(com.google.android.gms.common.api.Api$AnyClientKey)>
	//    6   10:astore_3        
		if(connectionresult != null && connectionresult.getErrorCode() == 4)
	//*   7   11:aload_3         
	//*   8   12:ifnull          68
	//*   9   15:aload_3         
	//*  10   16:invokevirtual   #219 <Method int ConnectionResult.getErrorCode()>
	//*  11   19:iconst_4        
	//*  12   20:icmpne          68
		{
			apimethodimpl.setFailedResult(new Status(4, ((String) (null)), zabm.zaa(((GoogleApi) ((zaw)zaet.get(((Object) (anyclientkey))))).zak(), System.identityHashCode(((Object) (zaew))))));
	//   13   23:aload_1         
	//   14   24:new             #318 <Class Status>
	//   15   27:dup             
	//   16   28:iconst_4        
	//   17   29:aconst_null     
	//   18   30:aload_0         
	//   19   31:getfield        #174 <Field GoogleApiManager zabm>
	//   20   34:aload_0         
	//   21   35:getfield        #53  <Field Map zaet>
	//   22   38:aload_2         
	//   23   39:invokeinterface #141 <Method Object Map.get(Object)>
	//   24   44:checkcast       #156 <Class zaw>
	//   25   47:invokevirtual   #190 <Method zai GoogleApi.zak()>
	//   26   50:aload_0         
	//   27   51:getfield        #76  <Field zaaw zaew>
	//   28   54:invokestatic    #324 <Method int System.identityHashCode(Object)>
	//   29   57:invokevirtual   #327 <Method android.app.PendingIntent GoogleApiManager.zaa(zai, int)>
	//   30   60:invokespecial   #330 <Method void Status(int, String, android.app.PendingIntent)>
	//   31   63:invokevirtual   #334 <Method void BaseImplementation$ApiMethodImpl.setFailedResult(Status)>
			return true;
	//   32   66:iconst_1        
	//   33   67:ireturn         
		} else
		{
			return false;
	//   34   68:iconst_0        
	//   35   69:ireturn         
		}
	}

	static boolean zab(zax zax1)
	{
		return zax1.zafc;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field boolean zafc>
	//    2    4:ireturn         
	}

	static Map zac(zax zax1)
	{
		return zax1.zaet;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Map zaet>
	//    2    4:areturn         
	}

	static Map zad(zax zax1)
	{
		return zax1.zafd;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Map zafd>
	//    2    4:areturn         
	}

	static boolean zae(zax zax1)
	{
		return zax1.zafa;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field boolean zafa>
	//    2    4:ireturn         
	}

	static ConnectionResult zaf(zax zax1)
	{
		return zax1.zaaf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #344 <Method ConnectionResult zaaf()>
	//    2    4:areturn         
	}

	static Map zag(zax zax1)
	{
		return zax1.zafe;
	//    0    0:aload_0         
	//    1    1:getfield        #314 <Field Map zafe>
	//    2    4:areturn         
	}

	static ConnectionResult zah(zax zax1)
	{
		return zax1.zafg;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field ConnectionResult zafg>
	//    2    4:areturn         
	}

	static void zai(zax zax1)
	{
		zax1.zaad();
	//    0    0:aload_0         
	//    1    1:invokespecial   #349 <Method void zaad()>
	//    2    4:return          
	}

	static void zaj(zax zax1)
	{
		zax1.zaae();
	//    0    0:aload_0         
	//    1    1:invokespecial   #352 <Method void zaae()>
	//    2    4:return          
	}

	static zaaw zak(zax zax1)
	{
		return zax1.zaew;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field zaaw zaew>
	//    2    4:areturn         
	}

	static Condition zal(zax zax1)
	{
		return zax1.zaey;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Condition zaey>
	//    2    4:areturn         
	}

	static Map zam(zax zax1)
	{
		return zax1.zaeu;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Map zaeu>
	//    2    4:areturn         
	}

	public final ConnectionResult blockingConnect()
	{
		InterruptedException interruptedexception;
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #362 <Method void connect()>
		do
		{
			if(!isConnecting())
				break;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #365 <Method boolean isConnecting()>
	//    4    8:ifeq            40
			try
			{
				zaey.await();
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field Condition zaey>
	//    7   15:invokeinterface #370 <Method void Condition.await()>
			}
	//*   8   20:goto            4
	//*   9   23:invokestatic    #376 <Method Thread Thread.currentThread()>
	//*  10   26:invokevirtual   #379 <Method void Thread.interrupt()>
	//*  11   29:new             #192 <Class ConnectionResult>
	//*  12   32:dup             
	//*  13   33:bipush          15
	//*  14   35:aconst_null     
	//*  15   36:invokespecial   #382 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  16   39:areturn         
	//*  17   40:aload_0         
	//*  18   41:invokevirtual   #385 <Method boolean isConnected()>
	//*  19   44:ifeq            51
	//*  20   47:getstatic       #388 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//*  21   50:areturn         
	//*  22   51:aload_0         
	//*  23   52:getfield        #199 <Field ConnectionResult zafg>
	//*  24   55:ifnull          63
	//*  25   58:aload_0         
	//*  26   59:getfield        #199 <Field ConnectionResult zafg>
	//*  27   62:areturn         
	//*  28   63:new             #192 <Class ConnectionResult>
	//*  29   66:dup             
	//*  30   67:bipush          13
	//*  31   69:aconst_null     
	//*  32   70:invokespecial   #382 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  33   73:areturn         
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
				return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
			}
		} while(true);
		if(isConnected())
			return ConnectionResult.RESULT_SUCCESS;
		if(zafg != null)
			return zafg;
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//*  34   74:astore_1        
	//*  35   75:goto            23
	}

	public final ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #362 <Method void connect()>
		l = timeunit.toNanos(l);
	//    2    4:aload_3         
	//    3    5:lload_1         
	//    4    6:invokevirtual   #395 <Method long TimeUnit.toNanos(long)>
	//    5    9:lstore_1        
_L2:
		if(!isConnecting())
			break; /* Loop/switch isn't completed */
	//    6   10:aload_0         
	//    7   11:invokevirtual   #365 <Method boolean isConnecting()>
	//    8   14:ifeq            69
		if(l > 0L)
			break MISSING_BLOCK_LABEL_38;
	//    9   17:lload_1         
	//   10   18:lconst_0        
	//   11   19:lcmp            
	//   12   20:ifgt            38
		disconnect();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #398 <Method void disconnect()>
		return new ConnectionResult(14, ((android.app.PendingIntent) (null)));
	//   15   27:new             #192 <Class ConnectionResult>
	//   16   30:dup             
	//   17   31:bipush          14
	//   18   33:aconst_null     
	//   19   34:invokespecial   #382 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   20   37:areturn         
		l = zaey.awaitNanos(l);
	//   21   38:aload_0         
	//   22   39:getfield        #72  <Field Condition zaey>
	//   23   42:lload_1         
	//   24   43:invokeinterface #401 <Method long Condition.awaitNanos(long)>
	//   25   48:lstore_1        
		if(true) goto _L2; else goto _L1
	//   26   49:goto            10
_L4:
		Thread.currentThread().interrupt();
	//   27   52:invokestatic    #376 <Method Thread Thread.currentThread()>
	//   28   55:invokevirtual   #379 <Method void Thread.interrupt()>
		return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
	//   29   58:new             #192 <Class ConnectionResult>
	//   30   61:dup             
	//   31   62:bipush          15
	//   32   64:aconst_null     
	//   33   65:invokespecial   #382 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   34   68:areturn         
_L1:
		if(isConnected())
	//*  35   69:aload_0         
	//*  36   70:invokevirtual   #385 <Method boolean isConnected()>
	//*  37   73:ifeq            80
			return ConnectionResult.RESULT_SUCCESS;
	//   38   76:getstatic       #388 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   39   79:areturn         
		if(zafg != null)
	//*  40   80:aload_0         
	//*  41   81:getfield        #199 <Field ConnectionResult zafg>
	//*  42   84:ifnull          92
			return zafg;
	//   43   87:aload_0         
	//   44   88:getfield        #199 <Field ConnectionResult zafg>
	//   45   91:areturn         
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//   46   92:new             #192 <Class ConnectionResult>
	//   47   95:dup             
	//   48   96:bipush          13
	//   49   98:aconst_null     
	//   50   99:invokespecial   #382 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   51  102:areturn         
		timeunit;
	//   52  103:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  53  104:goto            52
	}

	public final void connect()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #182 <Method void Lock.lock()>
		boolean flag = zafc;
	//    3    9:aload_0         
	//    4   10:getfield        #232 <Field boolean zafc>
	//    5   13:istore_1        
		if(!flag) goto _L2; else goto _L1
	//    6   14:iload_1         
	//    7   15:ifeq            28
_L1:
		zaen.unlock();
	//    8   18:aload_0         
	//    9   19:getfield        #62  <Field Lock zaen>
	//   10   22:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   11   27:return          
_L2:
		zafc = true;
	//   12   28:aload_0         
	//   13   29:iconst_1        
	//   14   30:putfield        #232 <Field boolean zafc>
		zafd = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #184 <Field Map zafd>
		zafe = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #314 <Field Map zafe>
		zaff = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #403 <Field zaaa zaff>
		zafg = null;
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:putfield        #199 <Field ConnectionResult zafg>
		zabm.zao();
	//   27   53:aload_0         
	//   28   54:getfield        #174 <Field GoogleApiManager zabm>
	//   29   57:invokevirtual   #406 <Method void GoogleApiManager.zao()>
		zabm.zaa(((Iterable) (zaet.values()))).addOnCompleteListener(((java.util.concurrent.Executor) (new HandlerExecutor(zabj))), ((com.google.android.gms.tasks.OnCompleteListener) (new zaz(this, ((zay) (null))))));
	//   30   60:aload_0         
	//   31   61:getfield        #174 <Field GoogleApiManager zabm>
	//   32   64:aload_0         
	//   33   65:getfield        #53  <Field Map zaet>
	//   34   68:invokeinterface #300 <Method Collection Map.values()>
	//   35   73:invokevirtual   #409 <Method Task GoogleApiManager.zaa(Iterable)>
	//   36   76:new             #411 <Class HandlerExecutor>
	//   37   79:dup             
	//   38   80:aload_0         
	//   39   81:getfield        #64  <Field Looper zabj>
	//   40   84:invokespecial   #414 <Method void HandlerExecutor(Looper)>
	//   41   87:new             #416 <Class zaz>
	//   42   90:dup             
	//   43   91:aload_0         
	//   44   92:aconst_null     
	//   45   93:invokespecial   #419 <Method void zaz(zax, zay)>
	//   46   96:invokevirtual   #425 <Method Task Task.addOnCompleteListener(java.util.concurrent.Executor, com.google.android.gms.tasks.OnCompleteListener)>
	//   47   99:pop             
		if(true) goto _L1; else goto _L3
	//   48  100:goto            18
_L3:
		Exception exception;
		exception;
	//   49  103:astore_2        
		zaen.unlock();
	//   50  104:aload_0         
	//   51  105:getfield        #62  <Field Lock zaen>
	//   52  108:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   53  113:aload_2         
	//   54  114:athrow          
	}

	public final void disconnect()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #182 <Method void Lock.lock()>
		zafc = false;
	//    3    9:aload_0         
	//    4   10:iconst_0        
	//    5   11:putfield        #232 <Field boolean zafc>
		zafd = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #184 <Field Map zafd>
		zafe = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #314 <Field Map zafe>
		if(zaff != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #403 <Field zaaa zaff>
	//*  14   28:ifnull          43
		{
			zaff.cancel();
	//   15   31:aload_0         
	//   16   32:getfield        #403 <Field zaaa zaff>
	//   17   35:invokevirtual   #430 <Method void zaaa.cancel()>
			zaff = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #403 <Field zaaa zaff>
		}
		zafg = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #199 <Field ConnectionResult zafg>
		BaseImplementation.ApiMethodImpl apimethodimpl;
		for(; !zafb.isEmpty(); ((PendingResult) (apimethodimpl)).cancel())
	//*  24   48:aload_0         
	//*  25   49:getfield        #60  <Field Queue zafb>
	//*  26   52:invokeinterface #281 <Method boolean Queue.isEmpty()>
	//*  27   57:ifne            85
		{
			apimethodimpl = (BaseImplementation.ApiMethodImpl)zafb.remove();
	//   28   60:aload_0         
	//   29   61:getfield        #60  <Field Queue zafb>
	//   30   64:invokeinterface #284 <Method Object Queue.remove()>
	//   31   69:checkcast       #286 <Class BaseImplementation$ApiMethodImpl>
	//   32   72:astore_1        
			((BasePendingResult) (apimethodimpl)).zaa(((zacs) (null)));
	//   33   73:aload_1         
	//   34   74:aconst_null     
	//   35   75:invokevirtual   #435 <Method void BasePendingResult.zaa(zacs)>
		}

	//   36   78:aload_1         
	//   37   79:invokevirtual   #438 <Method void PendingResult.cancel()>
	//*  38   82:goto            48
		zaey.signalAll();
	//   39   85:aload_0         
	//   40   86:getfield        #72  <Field Condition zaey>
	//   41   89:invokeinterface #441 <Method void Condition.signalAll()>
		zaen.unlock();
	//   42   94:aload_0         
	//   43   95:getfield        #62  <Field Lock zaen>
	//   44   98:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   45  103:return          
		Exception exception;
		exception;
	//   46  104:astore_1        
		zaen.unlock();
	//   47  105:aload_0         
	//   48  106:getfield        #62  <Field Lock zaen>
	//   49  109:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   50  114:aload_1         
	//   51  115:athrow          
	}

	public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		if(zaez && zab(apimethodimpl))
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field boolean zaez>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #446 <Method boolean zab(BaseImplementation$ApiMethodImpl)>
	//*   6   12:ifeq            17
			return apimethodimpl;
	//    7   15:aload_1         
	//    8   16:areturn         
		if(!isConnected())
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #385 <Method boolean isConnected()>
	//*  11   21:ifne            37
		{
			zafb.add(((Object) (apimethodimpl)));
	//   12   24:aload_0         
	//   13   25:getfield        #60  <Field Queue zafb>
	//   14   28:aload_1         
	//   15   29:invokeinterface #450 <Method boolean Queue.add(Object)>
	//   16   34:pop             
			return apimethodimpl;
	//   17   35:aload_1         
	//   18   36:areturn         
		} else
		{
			zaew.zahe.zab(((BasePendingResult) (apimethodimpl)));
	//   19   37:aload_0         
	//   20   38:getfield        #76  <Field zaaw zaew>
	//   21   41:getfield        #454 <Field zacp zaaw.zahe>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #459 <Method void zacp.zab(BasePendingResult)>
			return ((GoogleApi) ((zaw)zaet.get(((Object) (apimethodimpl.getClientKey()))))).doRead(apimethodimpl);
	//   24   48:aload_0         
	//   25   49:getfield        #53  <Field Map zaet>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #316 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   28   56:invokeinterface #141 <Method Object Map.get(Object)>
	//   29   61:checkcast       #156 <Class zaw>
	//   30   64:aload_1         
	//   31   65:invokevirtual   #462 <Method BaseImplementation$ApiMethodImpl GoogleApi.doRead(BaseImplementation$ApiMethodImpl)>
	//   32   68:areturn         
		}
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		com.google.android.gms.common.api.Api.AnyClientKey anyclientkey = apimethodimpl.getClientKey();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #316 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//    2    4:astore_2        
		if(zaez && zab(apimethodimpl))
	//*   3    5:aload_0         
	//*   4    6:getfield        #82  <Field boolean zaez>
	//*   5    9:ifeq            22
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:invokespecial   #446 <Method boolean zab(BaseImplementation$ApiMethodImpl)>
	//*   9   17:ifeq            22
		{
			return apimethodimpl;
	//   10   20:aload_1         
	//   11   21:areturn         
		} else
		{
			zaew.zahe.zab(((BasePendingResult) (apimethodimpl)));
	//   12   22:aload_0         
	//   13   23:getfield        #76  <Field zaaw zaew>
	//   14   26:getfield        #454 <Field zacp zaaw.zahe>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #459 <Method void zacp.zab(BasePendingResult)>
			return ((GoogleApi) ((zaw)zaet.get(((Object) (anyclientkey))))).doWrite(apimethodimpl);
	//   17   33:aload_0         
	//   18   34:getfield        #53  <Field Map zaet>
	//   19   37:aload_2         
	//   20   38:invokeinterface #141 <Method Object Map.get(Object)>
	//   21   43:checkcast       #156 <Class zaw>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #466 <Method BaseImplementation$ApiMethodImpl GoogleApi.doWrite(BaseImplementation$ApiMethodImpl)>
	//   24   50:areturn         
		}
	}

	public final ConnectionResult getConnectionResult(Api api)
	{
		return zaa(api.getClientKey());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    3    5:invokespecial   #235 <Method ConnectionResult zaa(com.google.android.gms.common.api.Api$AnyClientKey)>
	//    4    8:areturn         
	}

	public final boolean isConnected()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #182 <Method void Lock.lock()>
		ConnectionResult connectionresult;
		if(zafd == null)
			break MISSING_BLOCK_LABEL_30;
	//    3    9:aload_0         
	//    4   10:getfield        #184 <Field Map zafd>
	//    5   13:ifnull          30
		connectionresult = zafg;
	//    6   16:aload_0         
	//    7   17:getfield        #199 <Field ConnectionResult zafg>
	//    8   20:astore_2        
		boolean flag;
		if(connectionresult == null)
	//*   9   21:aload_2         
	//*  10   22:ifnonnull       30
		{
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
			break MISSING_BLOCK_LABEL_32;
	//   13   27:goto            32
		}
		flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		zaen.unlock();
	//   16   32:aload_0         
	//   17   33:getfield        #62  <Field Lock zaen>
	//   18   36:invokeinterface #195 <Method void Lock.unlock()>
		return flag;
	//   19   41:iload_1         
	//   20   42:ireturn         
		Exception exception;
		exception;
	//   21   43:astore_2        
		zaen.unlock();
	//   22   44:aload_0         
	//   23   45:getfield        #62  <Field Lock zaen>
	//   24   48:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   25   53:aload_2         
	//   26   54:athrow          
	}

	public final boolean isConnecting()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #182 <Method void Lock.lock()>
		boolean flag;
		if(zafd != null)
			break MISSING_BLOCK_LABEL_30;
	//    3    9:aload_0         
	//    4   10:getfield        #184 <Field Map zafd>
	//    5   13:ifnonnull       30
		flag = zafc;
	//    6   16:aload_0         
	//    7   17:getfield        #232 <Field boolean zafc>
	//    8   20:istore_1        
		if(flag)
	//*   9   21:iload_1         
	//*  10   22:ifeq            30
		{
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
			break MISSING_BLOCK_LABEL_32;
	//   13   27:goto            32
		}
		flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		zaen.unlock();
	//   16   32:aload_0         
	//   17   33:getfield        #62  <Field Lock zaen>
	//   18   36:invokeinterface #195 <Method void Lock.unlock()>
		return flag;
	//   19   41:iload_1         
	//   20   42:ireturn         
		Exception exception;
		exception;
	//   21   43:astore_2        
		zaen.unlock();
	//   22   44:aload_0         
	//   23   45:getfield        #62  <Field Lock zaen>
	//   24   48:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   25   53:aload_2         
	//   26   54:athrow          
	}

	public final boolean maybeSignIn(SignInConnectionListener signinconnectionlistener)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #182 <Method void Lock.lock()>
		if(!zafc || zaac())
			break MISSING_BLOCK_LABEL_89;
	//    3    9:aload_0         
	//    4   10:getfield        #232 <Field boolean zafc>
	//    5   13:ifeq            89
	//    6   16:aload_0         
	//    7   17:invokespecial   #472 <Method boolean zaac()>
	//    8   20:ifne            89
		zabm.zao();
	//    9   23:aload_0         
	//   10   24:getfield        #174 <Field GoogleApiManager zabm>
	//   11   27:invokevirtual   #406 <Method void GoogleApiManager.zao()>
		zaff = new zaaa(this, signinconnectionlistener);
	//   12   30:aload_0         
	//   13   31:new             #427 <Class zaaa>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:invokespecial   #475 <Method void zaaa(zax, SignInConnectionListener)>
	//   18   40:putfield        #403 <Field zaaa zaff>
		zabm.zaa(((Iterable) (zaeu.values()))).addOnCompleteListener(((java.util.concurrent.Executor) (new HandlerExecutor(zabj))), ((com.google.android.gms.tasks.OnCompleteListener) (zaff)));
	//   19   43:aload_0         
	//   20   44:getfield        #174 <Field GoogleApiManager zabm>
	//   21   47:aload_0         
	//   22   48:getfield        #55  <Field Map zaeu>
	//   23   51:invokeinterface #300 <Method Collection Map.values()>
	//   24   56:invokevirtual   #409 <Method Task GoogleApiManager.zaa(Iterable)>
	//   25   59:new             #411 <Class HandlerExecutor>
	//   26   62:dup             
	//   27   63:aload_0         
	//   28   64:getfield        #64  <Field Looper zabj>
	//   29   67:invokespecial   #414 <Method void HandlerExecutor(Looper)>
	//   30   70:aload_0         
	//   31   71:getfield        #403 <Field zaaa zaff>
	//   32   74:invokevirtual   #425 <Method Task Task.addOnCompleteListener(java.util.concurrent.Executor, com.google.android.gms.tasks.OnCompleteListener)>
	//   33   77:pop             
		zaen.unlock();
	//   34   78:aload_0         
	//   35   79:getfield        #62  <Field Lock zaen>
	//   36   82:invokeinterface #195 <Method void Lock.unlock()>
		return true;
	//   37   87:iconst_1        
	//   38   88:ireturn         
		zaen.unlock();
	//   39   89:aload_0         
	//   40   90:getfield        #62  <Field Lock zaen>
	//   41   93:invokeinterface #195 <Method void Lock.unlock()>
		return false;
	//   42   98:iconst_0        
	//   43   99:ireturn         
		signinconnectionlistener;
	//   44  100:astore_1        
		zaen.unlock();
	//   45  101:aload_0         
	//   46  102:getfield        #62  <Field Lock zaen>
	//   47  105:invokeinterface #195 <Method void Lock.unlock()>
		throw signinconnectionlistener;
	//   48  110:aload_1         
	//   49  111:athrow          
	}

	public final void maybeSignOut()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #182 <Method void Lock.lock()>
		zabm.maybeSignOut();
	//    3    9:aload_0         
	//    4   10:getfield        #174 <Field GoogleApiManager zabm>
	//    5   13:invokevirtual   #478 <Method void GoogleApiManager.maybeSignOut()>
		if(zaff != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #403 <Field zaaa zaff>
	//*   8   20:ifnull          35
		{
			zaff.cancel();
	//    9   23:aload_0         
	//   10   24:getfield        #403 <Field zaaa zaff>
	//   11   27:invokevirtual   #430 <Method void zaaa.cancel()>
			zaff = null;
	//   12   30:aload_0         
	//   13   31:aconst_null     
	//   14   32:putfield        #403 <Field zaaa zaff>
		}
		if(zafe == null)
	//*  15   35:aload_0         
	//*  16   36:getfield        #314 <Field Map zafe>
	//*  17   39:ifnonnull       62
			zafe = ((Map) (new a(zaeu.size())));
	//   18   42:aload_0         
	//   19   43:new             #480 <Class a>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:getfield        #55  <Field Map zaeu>
	//   23   51:invokeinterface #481 <Method int Map.size()>
	//   24   56:invokespecial   #484 <Method void a(int)>
	//   25   59:putfield        #314 <Field Map zafe>
		ConnectionResult connectionresult = new ConnectionResult(4);
	//   26   62:new             #192 <Class ConnectionResult>
	//   27   65:dup             
	//   28   66:iconst_4        
	//   29   67:invokespecial   #485 <Method void ConnectionResult(int)>
	//   30   70:astore_1        
		zaw zaw1;
		for(Iterator iterator = zaeu.values().iterator(); iterator.hasNext(); zafe.put(((Object) (((GoogleApi) (zaw1)).zak())), ((Object) (connectionresult))))
	//*  31   71:aload_0         
	//*  32   72:getfield        #55  <Field Map zaeu>
	//*  33   75:invokeinterface #300 <Method Collection Map.values()>
	//*  34   80:invokeinterface #303 <Method Iterator Collection.iterator()>
	//*  35   85:astore_2        
	//*  36   86:aload_2         
	//*  37   87:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  38   92:ifeq            123
			zaw1 = (zaw)iterator.next();
	//   39   95:aload_2         
	//   40   96:invokeinterface #104 <Method Object Iterator.next()>
	//   41  101:checkcast       #156 <Class zaw>
	//   42  104:astore_3        

	//   43  105:aload_0         
	//   44  106:getfield        #314 <Field Map zafe>
	//   45  109:aload_3         
	//   46  110:invokevirtual   #190 <Method zai GoogleApi.zak()>
	//   47  113:aload_1         
	//   48  114:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//   49  119:pop             
	//*  50  120:goto            86
		if(zafd != null)
	//*  51  123:aload_0         
	//*  52  124:getfield        #184 <Field Map zafd>
	//*  53  127:ifnull          143
			zafd.putAll(zafe);
	//   54  130:aload_0         
	//   55  131:getfield        #184 <Field Map zafd>
	//   56  134:aload_0         
	//   57  135:getfield        #314 <Field Map zafe>
	//   58  138:invokeinterface #489 <Method void Map.putAll(Map)>
		zaen.unlock();
	//   59  143:aload_0         
	//   60  144:getfield        #62  <Field Lock zaen>
	//   61  147:invokeinterface #195 <Method void Lock.unlock()>
		return;
	//   62  152:return          
		Exception exception;
		exception;
	//   63  153:astore_1        
		zaen.unlock();
	//   64  154:aload_0         
	//   65  155:getfield        #62  <Field Lock zaen>
	//   66  158:invokeinterface #195 <Method void Lock.unlock()>
		throw exception;
	//   67  163:aload_1         
	//   68  164:athrow          
	}

	public final void zaw()
	{
	//    0    0:return          
	}

	private final Looper zabj;
	private final GoogleApiManager zabm = GoogleApiManager.zabc();
	private final Lock zaen;
	private final ClientSettings zaes;
	private final Map zaet = new HashMap();
	private final Map zaeu = new HashMap();
	private final Map zaev;
	private final zaaw zaew;
	private final GoogleApiAvailabilityLight zaex;
	private final Condition zaey;
	private final boolean zaez;
	private final boolean zafa;
	private final Queue zafb = new LinkedList();
	private boolean zafc;
	private Map zafd;
	private Map zafe;
	private zaaa zaff;
	private ConnectionResult zafg;
}
