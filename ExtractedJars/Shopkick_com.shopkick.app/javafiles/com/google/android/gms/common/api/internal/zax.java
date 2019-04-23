// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
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
		flag = true;
	//  101  235:iconst_1        
	//  102  236:istore          11
		boolean flag2 = true;
	//  103  238:iconst_1        
	//  104  239:istore          13
		boolean flag3 = false;
	//  105  241:iconst_0        
	//  106  242:istore          14
		boolean flag1 = false;
	//  107  244:iconst_0        
	//  108  245:istore          12
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//  109  247:aload           5
	//  110  249:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//  111  254:ifeq            436
			map1 = ((Map) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//  112  257:aload           5
	//  113  259:invokeinterface #104 <Method Object Iterator.next()>
	//  114  264:checkcast       #135 <Class java.util.Map$Entry>
	//  115  267:astore          7
			zaaw1 = ((zaaw) ((Api)((Map) (lock)).get(((java.util.Map.Entry) (map1)).getKey())));
	//  116  269:aload_2         
	//  117  270:aload           7
	//  118  272:invokeinterface #138 <Method Object java.util.Map$Entry.getKey()>
	//  119  277:invokeinterface #141 <Method Object Map.get(Object)>
	//  120  282:checkcast       #106 <Class Api>
	//  121  285:astore          10
			arraylist = ((ArrayList) ((com.google.android.gms.common.api.Api.Client)((java.util.Map.Entry) (map1)).getValue()));
	//  122  287:aload           7
	//  123  289:invokeinterface #144 <Method Object java.util.Map$Entry.getValue()>
	//  124  294:checkcast       #146 <Class com.google.android.gms.common.api.Api$Client>
	//  125  297:astore          9
			if(((com.google.android.gms.common.api.Api.Client) (arraylist)).requiresGooglePlayServices())
	//* 126  299:aload           9
	//* 127  301:invokeinterface #149 <Method boolean com.google.android.gms.common.api.Api$Client.requiresGooglePlayServices()>
	//* 128  306:ifeq            345
			{
				if(!((Boolean)zaev.get(((Object) (zaaw1)))).booleanValue())
	//* 129  309:aload_0         
	//* 130  310:getfield        #78  <Field Map zaev>
	//* 131  313:aload           10
	//* 132  315:invokeinterface #141 <Method Object Map.get(Object)>
	//* 133  320:checkcast       #151 <Class Boolean>
	//* 134  323:invokevirtual   #154 <Method boolean Boolean.booleanValue()>
	//* 135  326:ifne            339
				{
					flag1 = true;
	//  136  329:iconst_1        
	//  137  330:istore          12
					flag3 = flag1;
	//  138  332:iload           12
	//  139  334:istore          14
				} else
	//* 140  336:goto            348
				{
					flag3 = true;
	//  141  339:iconst_1        
	//  142  340:istore          14
				}
			} else
	//* 143  342:goto            348
			{
				flag2 = false;
	//  144  345:iconst_0        
	//  145  346:istore          13
			}
			zaaw1 = ((zaaw) (new zaw(context, ((Api) (zaaw1)), looper, ((com.google.android.gms.common.api.Api.Client) (arraylist)), (zaq)((Map) (googleapiavailabilitylight)).get(((Object) (zaaw1))), clientsettings, abstractclientbuilder)));
	//  146  348:new             #156 <Class zaw>
	//  147  351:dup             
	//  148  352:aload_1         
	//  149  353:aload           10
	//  150  355:aload_3         
	//  151  356:aload           9
	//  152  358:aload           4
	//  153  360:aload           10
	//  154  362:invokeinterface #141 <Method Object Map.get(Object)>
	//  155  367:checkcast       #126 <Class zaq>
	//  156  370:aload           6
	//  157  372:aload           8
	//  158  374:invokespecial   #159 <Method void zaw(Context, Api, Looper, com.google.android.gms.common.api.Api$Client, zaq, ClientSettings, com.google.android.gms.common.api.Api$AbstractClientBuilder)>
	//  159  377:astore          10
			zaet.put(((Object) ((com.google.android.gms.common.api.Api.AnyClientKey)((java.util.Map.Entry) (map1)).getKey())), ((Object) (zaaw1)));
	//  160  379:aload_0         
	//  161  380:getfield        #53  <Field Map zaet>
	//  162  383:aload           7
	//  163  385:invokeinterface #138 <Method Object java.util.Map$Entry.getKey()>
	//  164  390:checkcast       #161 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//  165  393:aload           10
	//  166  395:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//  167  400:pop             
			if(((com.google.android.gms.common.api.Api.Client) (arraylist)).requiresSignIn())
	//* 168  401:aload           9
	//* 169  403:invokeinterface #164 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//* 170  408:ifeq            433
				zaeu.put(((Object) ((com.google.android.gms.common.api.Api.AnyClientKey)((java.util.Map.Entry) (map1)).getKey())), ((Object) (zaaw1)));
	//  171  411:aload_0         
	//  172  412:getfield        #55  <Field Map zaeu>
	//  173  415:aload           7
	//  174  417:invokeinterface #138 <Method Object java.util.Map$Entry.getKey()>
	//  175  422:checkcast       #161 <Class com.google.android.gms.common.api.Api$AnyClientKey>
	//  176  425:aload           10
	//  177  427:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//  178  432:pop             
		} while(true);
	//  179  433:goto            247
		if(!flag3 || flag2 || flag1)
	//* 180  436:iload           14
	//* 181  438:ifeq            454
	//* 182  441:iload           13
	//* 183  443:ifne            454
	//* 184  446:iload           12
	//* 185  448:ifne            454
	//* 186  451:goto            457
			flag = false;
	//  187  454:iconst_0        
	//  188  455:istore          11
		zafa = flag;
	//  189  457:aload_0         
	//  190  458:iload           11
	//  191  460:putfield        #166 <Field boolean zafa>
	//  192  463:aload_0         
	//  193  464:invokestatic    #172 <Method GoogleApiManager GoogleApiManager.zabc()>
	//  194  467:putfield        #174 <Field GoogleApiManager zabm>
	//  195  470:return          
	}

	private final ConnectionResult zaa(com.google.android.gms.common.api.Api.AnyClientKey anyclientkey)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #184 <Method void Lock.lock()>
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
	//   10   24:getfield        #186 <Field Map zafd>
	//   11   27:ifnull          62
	//   12   30:aload_1         
	//   13   31:ifnull          62
		anyclientkey = ((com.google.android.gms.common.api.Api.AnyClientKey) ((ConnectionResult)zafd.get(((Object) (((GoogleApi) (anyclientkey)).zak())))));
	//   14   34:aload_0         
	//   15   35:getfield        #186 <Field Map zafd>
	//   16   38:aload_1         
	//   17   39:invokevirtual   #192 <Method zai GoogleApi.zak()>
	//   18   42:invokeinterface #141 <Method Object Map.get(Object)>
	//   19   47:checkcast       #194 <Class ConnectionResult>
	//   20   50:astore_1        
		zaen.unlock();
	//   21   51:aload_0         
	//   22   52:getfield        #62  <Field Lock zaen>
	//   23   55:invokeinterface #197 <Method void Lock.unlock()>
		return ((ConnectionResult) (anyclientkey));
	//   24   60:aload_1         
	//   25   61:areturn         
		zaen.unlock();
	//   26   62:aload_0         
	//   27   63:getfield        #62  <Field Lock zaen>
	//   28   66:invokeinterface #197 <Method void Lock.unlock()>
		return null;
	//   29   71:aconst_null     
	//   30   72:areturn         
		anyclientkey;
	//   31   73:astore_1        
		zaen.unlock();
	//   32   74:aload_0         
	//   33   75:getfield        #62  <Field Lock zaen>
	//   34   78:invokeinterface #197 <Method void Lock.unlock()>
		throw anyclientkey;
	//   35   83:aload_1         
	//   36   84:athrow          
	}

	static ConnectionResult zaa(zax zax1, ConnectionResult connectionresult)
	{
		zax1.zafg = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #203 <Field ConnectionResult zafg>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Map zaa(zax zax1, Map map)
	{
		zax1.zafd = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #186 <Field Map zafd>
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
	//    1    1:invokevirtual   #209 <Method boolean ConnectionResult.isSuccess()>
	//    2    4:ifne            64
	//    3    7:aload_2         
	//    4    8:invokevirtual   #212 <Method boolean ConnectionResult.hasResolution()>
	//    5   11:ifne            64
	//    6   14:aload_0         
	//    7   15:getfield        #78  <Field Map zaev>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #216 <Method Api GoogleApi.getApi()>
	//   10   22:invokeinterface #141 <Method Object Map.get(Object)>
	//   11   27:checkcast       #151 <Class Boolean>
	//   12   30:invokevirtual   #154 <Method boolean Boolean.booleanValue()>
	//   13   33:ifeq            64
	//   14   36:aload_1         
	//   15   37:invokevirtual   #220 <Method com.google.android.gms.common.api.Api$Client zaw.zaab()>
	//   16   40:invokeinterface #149 <Method boolean com.google.android.gms.common.api.Api$Client.requiresGooglePlayServices()>
	//   17   45:ifeq            64
	//   18   48:aload_0         
	//   19   49:getfield        #74  <Field GoogleApiAvailabilityLight zaex>
	//   20   52:aload_2         
	//   21   53:invokevirtual   #223 <Method int ConnectionResult.getErrorCode()>
	//   22   56:invokevirtual   #229 <Method boolean GoogleApiAvailabilityLight.isUserResolvableError(int)>
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
	//    3    3:invokespecial   #233 <Method boolean zaa(zaw, ConnectionResult)>
	//    4    6:ireturn         
	}

	static boolean zaa(zax zax1, boolean flag)
	{
		zax1.zafc = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #236 <Field boolean zafc>
		return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
	}

	private final boolean zaac()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #184 <Method void Lock.lock()>
		if(!zafc || !zaez)
	//*   3    9:aload_0         
	//*   4   10:getfield        #236 <Field boolean zafc>
	//*   5   13:ifeq            99
	//*   6   16:aload_0         
	//*   7   17:getfield        #82  <Field boolean zaez>
	//*   8   20:ifne            26
			break MISSING_BLOCK_LABEL_99;
	//    9   23:goto            99
		Iterator iterator = zaeu.keySet().iterator();
	//   10   26:aload_0         
	//   11   27:getfield        #55  <Field Map zaeu>
	//   12   30:invokeinterface #88  <Method Set Map.keySet()>
	//   13   35:invokeinterface #94  <Method Iterator Set.iterator()>
	//   14   40:astore_2        
_L2:
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
	//   22   60:invokespecial   #239 <Method ConnectionResult zaa(com.google.android.gms.common.api.Api$AnyClientKey)>
	//   23   63:astore_3        
		if(connectionresult == null)
			break; /* Loop/switch isn't completed */
	//   24   64:aload_3         
	//   25   65:ifnull          77
		boolean flag = connectionresult.isSuccess();
	//   26   68:aload_3         
	//   27   69:invokevirtual   #209 <Method boolean ConnectionResult.isSuccess()>
	//   28   72:istore_1        
		if(flag) goto _L2; else goto _L1
	//   29   73:iload_1         
	//   30   74:ifne            41
_L1:
		zaen.unlock();
	//   31   77:aload_0         
	//   32   78:getfield        #62  <Field Lock zaen>
	//   33   81:invokeinterface #197 <Method void Lock.unlock()>
		return false;
	//   34   86:iconst_0        
	//   35   87:ireturn         
		zaen.unlock();
	//   36   88:aload_0         
	//   37   89:getfield        #62  <Field Lock zaen>
	//   38   92:invokeinterface #197 <Method void Lock.unlock()>
		return true;
	//   39   97:iconst_1        
	//   40   98:ireturn         
		zaen.unlock();
	//   41   99:aload_0         
	//   42  100:getfield        #62  <Field Lock zaen>
	//   43  103:invokeinterface #197 <Method void Lock.unlock()>
		return false;
	//   44  108:iconst_0        
	//   45  109:ireturn         
		Exception exception;
		exception;
	//   46  110:astore_2        
		zaen.unlock();
	//   47  111:aload_0         
	//   48  112:getfield        #62  <Field Lock zaen>
	//   49  115:invokeinterface #197 <Method void Lock.unlock()>
		throw exception;
	//   50  120:aload_2         
	//   51  121:athrow          
	}

	private final void zaad()
	{
		Object obj = ((Object) (zaes));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ClientSettings zaes>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       20
		{
			zaew.zagz = Collections.emptySet();
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field zaaw zaew>
	//    7   13:invokestatic    #245 <Method Set Collections.emptySet()>
	//    8   16:putfield        #251 <Field Set zaaw.zagz>
			return;
	//    9   19:return          
		}
		obj = ((Object) (new HashSet(((Collection) (((ClientSettings) (obj)).getRequiredScopes())))));
	//   10   20:new             #253 <Class HashSet>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokevirtual   #258 <Method Set ClientSettings.getRequiredScopes()>
	//   14   28:invokespecial   #261 <Method void HashSet(Collection)>
	//   15   31:astore_1        
		Map map = zaes.getOptionalApiSettings();
	//   16   32:aload_0         
	//   17   33:getfield        #80  <Field ClientSettings zaes>
	//   18   36:invokevirtual   #265 <Method Map ClientSettings.getOptionalApiSettings()>
	//   19   39:astore_2        
		Iterator iterator = map.keySet().iterator();
	//   20   40:aload_2         
	//   21   41:invokeinterface #88  <Method Set Map.keySet()>
	//   22   46:invokeinterface #94  <Method Iterator Set.iterator()>
	//   23   51:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   24   52:aload_3         
	//   25   53:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//   26   58:ifeq            117
			Api api = (Api)iterator.next();
	//   27   61:aload_3         
	//   28   62:invokeinterface #104 <Method Object Iterator.next()>
	//   29   67:checkcast       #106 <Class Api>
	//   30   70:astore          4
			ConnectionResult connectionresult = getConnectionResult(api);
	//   31   72:aload_0         
	//   32   73:aload           4
	//   33   75:invokevirtual   #269 <Method ConnectionResult getConnectionResult(Api)>
	//   34   78:astore          5
			if(connectionresult != null && connectionresult.isSuccess())
	//*  35   80:aload           5
	//*  36   82:ifnull          52
	//*  37   85:aload           5
	//*  38   87:invokevirtual   #209 <Method boolean ConnectionResult.isSuccess()>
	//*  39   90:ifeq            52
				((Set) (obj)).addAll(((Collection) (((com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings)map.get(((Object) (api)))).mScopes)));
	//   40   93:aload_1         
	//   41   94:aload_2         
	//   42   95:aload           4
	//   43   97:invokeinterface #141 <Method Object Map.get(Object)>
	//   44  102:checkcast       #271 <Class com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings>
	//   45  105:getfield        #274 <Field Set com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings.mScopes>
	//   46  108:invokeinterface #278 <Method boolean Set.addAll(Collection)>
	//   47  113:pop             
		} while(true);
	//   48  114:goto            52
		zaew.zagz = ((Set) (obj));
	//   49  117:aload_0         
	//   50  118:getfield        #76  <Field zaaw zaew>
	//   51  121:aload_1         
	//   52  122:putfield        #251 <Field Set zaaw.zagz>
	//   53  125:return          
	}

	private final void zaae()
	{
		for(; !zafb.isEmpty(); execute((BaseImplementation.ApiMethodImpl)zafb.remove()));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Queue zafb>
	//    2    4:invokeinterface #284 <Method boolean Queue.isEmpty()>
	//    3    9:ifne            32
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #60  <Field Queue zafb>
	//    7   17:invokeinterface #287 <Method Object Queue.remove()>
	//    8   22:checkcast       #289 <Class BaseImplementation$ApiMethodImpl>
	//    9   25:invokevirtual   #293 <Method BaseImplementation$ApiMethodImpl execute(BaseImplementation$ApiMethodImpl)>
	//   10   28:pop             
	//*  11   29:goto            0
		zaew.zab(((android.os.Bundle) (null)));
	//   12   32:aload_0         
	//   13   33:getfield        #76  <Field zaaw zaew>
	//   14   36:aconst_null     
	//   15   37:invokevirtual   #297 <Method void zaaw.zab(android.os.Bundle)>
	//   16   40:return          
	}

	private final ConnectionResult zaaf()
	{
		Iterator iterator = zaet.values().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Map zaet>
	//    2    4:invokeinterface #303 <Method Collection Map.values()>
	//    3    9:invokeinterface #306 <Method Iterator Collection.iterator()>
	//    4   14:astore          7
		ConnectionResult connectionresult = null;
	//    5   16:aconst_null     
	//    6   17:astore          4
		int j = 0;
	//    7   19:iconst_0        
	//    8   20:istore_2        
		int i = j;
	//    9   21:iload_2         
	//   10   22:istore_1        
		ConnectionResult connectionresult1 = null;
	//   11   23:aconst_null     
	//   12   24:astore          5
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
	//   21   50:invokevirtual   #216 <Method Api GoogleApi.getApi()>
	//   22   53:astore          8
			obj = ((Object) (((GoogleApi) (obj)).zak()));
	//   23   55:aload           6
	//   24   57:invokevirtual   #192 <Method zai GoogleApi.zak()>
	//   25   60:astore          6
			obj = ((Object) ((ConnectionResult)zafd.get(obj)));
	//   26   62:aload_0         
	//   27   63:getfield        #186 <Field Map zafd>
	//   28   66:aload           6
	//   29   68:invokeinterface #141 <Method Object Map.get(Object)>
	//   30   73:checkcast       #194 <Class ConnectionResult>
	//   31   76:astore          6
			if(!((ConnectionResult) (obj)).isSuccess() && (!((Boolean)zaev.get(((Object) (api)))).booleanValue() || ((ConnectionResult) (obj)).hasResolution() || zaex.isUserResolvableError(((ConnectionResult) (obj)).getErrorCode())))
	//*  32   78:aload           6
	//*  33   80:invokevirtual   #209 <Method boolean ConnectionResult.isSuccess()>
	//*  34   83:ifne            26
	//*  35   86:aload_0         
	//*  36   87:getfield        #78  <Field Map zaev>
	//*  37   90:aload           8
	//*  38   92:invokeinterface #141 <Method Object Map.get(Object)>
	//*  39   97:checkcast       #151 <Class Boolean>
	//*  40  100:invokevirtual   #154 <Method boolean Boolean.booleanValue()>
	//*  41  103:ifeq            129
	//*  42  106:aload           6
	//*  43  108:invokevirtual   #212 <Method boolean ConnectionResult.hasResolution()>
	//*  44  111:ifne            129
	//*  45  114:aload_0         
	//*  46  115:getfield        #74  <Field GoogleApiAvailabilityLight zaex>
	//*  47  118:aload           6
	//*  48  120:invokevirtual   #223 <Method int ConnectionResult.getErrorCode()>
	//*  49  123:invokevirtual   #229 <Method boolean GoogleApiAvailabilityLight.isUserResolvableError(int)>
	//*  50  126:ifeq            26
				if(((ConnectionResult) (obj)).getErrorCode() == 4 && zaez)
	//*  51  129:aload           6
	//*  52  131:invokevirtual   #223 <Method int ConnectionResult.getErrorCode()>
	//*  53  134:iconst_4        
	//*  54  135:icmpne          173
	//*  55  138:aload_0         
	//*  56  139:getfield        #82  <Field boolean zaez>
	//*  57  142:ifeq            173
				{
					int k = api.zah().getPriority();
	//   58  145:aload           8
	//   59  147:invokevirtual   #310 <Method com.google.android.gms.common.api.Api$BaseClientBuilder Api.zah()>
	//   60  150:invokevirtual   #315 <Method int com.google.android.gms.common.api.Api$BaseClientBuilder.getPriority()>
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
	//   73  175:invokevirtual   #310 <Method com.google.android.gms.common.api.Api$BaseClientBuilder Api.zah()>
	//   74  178:invokevirtual   #315 <Method int com.google.android.gms.common.api.Api$BaseClientBuilder.getPriority()>
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
	//    2    2:putfield        #317 <Field Map zafe>
		return map;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private final boolean zab(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		com.google.android.gms.common.api.Api.AnyClientKey anyclientkey = apimethodimpl.getClientKey();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #319 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//    2    4:astore_2        
		ConnectionResult connectionresult = zaa(anyclientkey);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #239 <Method ConnectionResult zaa(com.google.android.gms.common.api.Api$AnyClientKey)>
	//    6   10:astore_3        
		if(connectionresult != null && connectionresult.getErrorCode() == 4)
	//*   7   11:aload_3         
	//*   8   12:ifnull          68
	//*   9   15:aload_3         
	//*  10   16:invokevirtual   #223 <Method int ConnectionResult.getErrorCode()>
	//*  11   19:iconst_4        
	//*  12   20:icmpne          68
		{
			apimethodimpl.setFailedResult(new Status(4, ((String) (null)), zabm.zaa(((GoogleApi) ((zaw)zaet.get(((Object) (anyclientkey))))).zak(), System.identityHashCode(((Object) (zaew))))));
	//   13   23:aload_1         
	//   14   24:new             #321 <Class Status>
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
	//   25   47:invokevirtual   #192 <Method zai GoogleApi.zak()>
	//   26   50:aload_0         
	//   27   51:getfield        #76  <Field zaaw zaew>
	//   28   54:invokestatic    #327 <Method int System.identityHashCode(Object)>
	//   29   57:invokevirtual   #330 <Method android.app.PendingIntent GoogleApiManager.zaa(zai, int)>
	//   30   60:invokespecial   #333 <Method void Status(int, String, android.app.PendingIntent)>
	//   31   63:invokevirtual   #337 <Method void BaseImplementation$ApiMethodImpl.setFailedResult(Status)>
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
	//    1    1:getfield        #236 <Field boolean zafc>
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
	//    1    1:getfield        #186 <Field Map zafd>
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
	//    1    1:invokespecial   #347 <Method ConnectionResult zaaf()>
	//    2    4:areturn         
	}

	static Map zag(zax zax1)
	{
		return zax1.zafe;
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field Map zafe>
	//    2    4:areturn         
	}

	static ConnectionResult zah(zax zax1)
	{
		return zax1.zafg;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field ConnectionResult zafg>
	//    2    4:areturn         
	}

	static void zai(zax zax1)
	{
		zax1.zaad();
	//    0    0:aload_0         
	//    1    1:invokespecial   #352 <Method void zaad()>
	//    2    4:return          
	}

	static void zaj(zax zax1)
	{
		zax1.zaae();
	//    0    0:aload_0         
	//    1    1:invokespecial   #355 <Method void zaae()>
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
	//    1    1:invokevirtual   #365 <Method void connect()>
		do
		{
			if(!isConnecting())
				break;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #368 <Method boolean isConnecting()>
	//    4    8:ifeq            40
			try
			{
				zaey.await();
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field Condition zaey>
	//    7   15:invokeinterface #373 <Method void Condition.await()>
			}
	//*   8   20:goto            4
	//*   9   23:invokestatic    #379 <Method Thread Thread.currentThread()>
	//*  10   26:invokevirtual   #382 <Method void Thread.interrupt()>
	//*  11   29:new             #194 <Class ConnectionResult>
	//*  12   32:dup             
	//*  13   33:bipush          15
	//*  14   35:aconst_null     
	//*  15   36:invokespecial   #385 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  16   39:areturn         
	//*  17   40:aload_0         
	//*  18   41:invokevirtual   #388 <Method boolean isConnected()>
	//*  19   44:ifeq            51
	//*  20   47:getstatic       #391 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//*  21   50:areturn         
	//*  22   51:aload_0         
	//*  23   52:getfield        #203 <Field ConnectionResult zafg>
	//*  24   55:astore_1        
	//*  25   56:aload_1         
	//*  26   57:ifnull          62
	//*  27   60:aload_1         
	//*  28   61:areturn         
	//*  29   62:new             #194 <Class ConnectionResult>
	//*  30   65:dup             
	//*  31   66:bipush          13
	//*  32   68:aconst_null     
	//*  33   69:invokespecial   #385 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  34   72:areturn         
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
				return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
			}
		} while(true);
		if(isConnected())
			return ConnectionResult.RESULT_SUCCESS;
		ConnectionResult connectionresult = zafg;
		if(connectionresult != null)
			return connectionresult;
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//*  35   73:astore_1        
	//*  36   74:goto            23
	}

	public final ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #365 <Method void connect()>
		l = timeunit.toNanos(l);
	//    2    4:aload_3         
	//    3    5:lload_1         
	//    4    6:invokevirtual   #398 <Method long TimeUnit.toNanos(long)>
	//    5    9:lstore_1        
_L2:
		if(!isConnecting())
			break; /* Loop/switch isn't completed */
	//    6   10:aload_0         
	//    7   11:invokevirtual   #368 <Method boolean isConnecting()>
	//    8   14:ifeq            69
		if(l > 0L)
			break MISSING_BLOCK_LABEL_38;
	//    9   17:lload_1         
	//   10   18:lconst_0        
	//   11   19:lcmp            
	//   12   20:ifgt            38
		disconnect();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #401 <Method void disconnect()>
		return new ConnectionResult(14, ((android.app.PendingIntent) (null)));
	//   15   27:new             #194 <Class ConnectionResult>
	//   16   30:dup             
	//   17   31:bipush          14
	//   18   33:aconst_null     
	//   19   34:invokespecial   #385 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   20   37:areturn         
		l = zaey.awaitNanos(l);
	//   21   38:aload_0         
	//   22   39:getfield        #72  <Field Condition zaey>
	//   23   42:lload_1         
	//   24   43:invokeinterface #404 <Method long Condition.awaitNanos(long)>
	//   25   48:lstore_1        
		if(true) goto _L2; else goto _L1
	//   26   49:goto            10
_L4:
		Thread.currentThread().interrupt();
	//   27   52:invokestatic    #379 <Method Thread Thread.currentThread()>
	//   28   55:invokevirtual   #382 <Method void Thread.interrupt()>
		return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
	//   29   58:new             #194 <Class ConnectionResult>
	//   30   61:dup             
	//   31   62:bipush          15
	//   32   64:aconst_null     
	//   33   65:invokespecial   #385 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   34   68:areturn         
_L1:
		if(isConnected())
	//*  35   69:aload_0         
	//*  36   70:invokevirtual   #388 <Method boolean isConnected()>
	//*  37   73:ifeq            80
			return ConnectionResult.RESULT_SUCCESS;
	//   38   76:getstatic       #391 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   39   79:areturn         
		timeunit = ((TimeUnit) (zafg));
	//   40   80:aload_0         
	//   41   81:getfield        #203 <Field ConnectionResult zafg>
	//   42   84:astore_3        
		if(timeunit != null)
	//*  43   85:aload_3         
	//*  44   86:ifnull          91
			return ((ConnectionResult) (timeunit));
	//   45   89:aload_3         
	//   46   90:areturn         
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//   47   91:new             #194 <Class ConnectionResult>
	//   48   94:dup             
	//   49   95:bipush          13
	//   50   97:aconst_null     
	//   51   98:invokespecial   #385 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   52  101:areturn         
		timeunit;
	//   53  102:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  54  103:goto            52
	}

	public final void connect()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #184 <Method void Lock.lock()>
		boolean flag = zafc;
	//    3    9:aload_0         
	//    4   10:getfield        #236 <Field boolean zafc>
	//    5   13:istore_1        
		if(flag)
	//*   6   14:iload_1         
	//*   7   15:ifeq            28
		{
			zaen.unlock();
	//    8   18:aload_0         
	//    9   19:getfield        #62  <Field Lock zaen>
	//   10   22:invokeinterface #197 <Method void Lock.unlock()>
			return;
	//   11   27:return          
		}
		zafc = true;
	//   12   28:aload_0         
	//   13   29:iconst_1        
	//   14   30:putfield        #236 <Field boolean zafc>
		zafd = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #186 <Field Map zafd>
		zafe = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #317 <Field Map zafe>
		zaff = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #406 <Field zaaa zaff>
		zafg = null;
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:putfield        #203 <Field ConnectionResult zafg>
		zabm.zao();
	//   27   53:aload_0         
	//   28   54:getfield        #174 <Field GoogleApiManager zabm>
	//   29   57:invokevirtual   #409 <Method void GoogleApiManager.zao()>
		zabm.zaa(((Iterable) (zaet.values()))).addOnCompleteListener(((java.util.concurrent.Executor) (new HandlerExecutor(zabj))), ((com.google.android.gms.tasks.OnCompleteListener) (new zaz(this, ((zay) (null))))));
	//   30   60:aload_0         
	//   31   61:getfield        #174 <Field GoogleApiManager zabm>
	//   32   64:aload_0         
	//   33   65:getfield        #53  <Field Map zaet>
	//   34   68:invokeinterface #303 <Method Collection Map.values()>
	//   35   73:invokevirtual   #412 <Method Task GoogleApiManager.zaa(Iterable)>
	//   36   76:new             #414 <Class HandlerExecutor>
	//   37   79:dup             
	//   38   80:aload_0         
	//   39   81:getfield        #64  <Field Looper zabj>
	//   40   84:invokespecial   #417 <Method void HandlerExecutor(Looper)>
	//   41   87:new             #419 <Class zaz>
	//   42   90:dup             
	//   43   91:aload_0         
	//   44   92:aconst_null     
	//   45   93:invokespecial   #422 <Method void zaz(zax, zay)>
	//   46   96:invokevirtual   #428 <Method Task Task.addOnCompleteListener(java.util.concurrent.Executor, com.google.android.gms.tasks.OnCompleteListener)>
	//   47   99:pop             
		zaen.unlock();
	//   48  100:aload_0         
	//   49  101:getfield        #62  <Field Lock zaen>
	//   50  104:invokeinterface #197 <Method void Lock.unlock()>
		return;
	//   51  109:return          
		Exception exception;
		exception;
	//   52  110:astore_2        
		zaen.unlock();
	//   53  111:aload_0         
	//   54  112:getfield        #62  <Field Lock zaen>
	//   55  115:invokeinterface #197 <Method void Lock.unlock()>
		throw exception;
	//   56  120:aload_2         
	//   57  121:athrow          
	}

	public final void disconnect()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #184 <Method void Lock.lock()>
		zafc = false;
	//    3    9:aload_0         
	//    4   10:iconst_0        
	//    5   11:putfield        #236 <Field boolean zafc>
		zafd = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #186 <Field Map zafd>
		zafe = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #317 <Field Map zafe>
		if(zaff != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #406 <Field zaaa zaff>
	//*  14   28:ifnull          43
		{
			zaff.cancel();
	//   15   31:aload_0         
	//   16   32:getfield        #406 <Field zaaa zaff>
	//   17   35:invokevirtual   #433 <Method void zaaa.cancel()>
			zaff = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #406 <Field zaaa zaff>
		}
		zafg = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #203 <Field ConnectionResult zafg>
		BaseImplementation.ApiMethodImpl apimethodimpl;
		for(; !zafb.isEmpty(); ((PendingResult) (apimethodimpl)).cancel())
	//*  24   48:aload_0         
	//*  25   49:getfield        #60  <Field Queue zafb>
	//*  26   52:invokeinterface #284 <Method boolean Queue.isEmpty()>
	//*  27   57:ifne            85
		{
			apimethodimpl = (BaseImplementation.ApiMethodImpl)zafb.remove();
	//   28   60:aload_0         
	//   29   61:getfield        #60  <Field Queue zafb>
	//   30   64:invokeinterface #287 <Method Object Queue.remove()>
	//   31   69:checkcast       #289 <Class BaseImplementation$ApiMethodImpl>
	//   32   72:astore_1        
			((BasePendingResult) (apimethodimpl)).zaa(((zacs) (null)));
	//   33   73:aload_1         
	//   34   74:aconst_null     
	//   35   75:invokevirtual   #438 <Method void BasePendingResult.zaa(zacs)>
		}

	//   36   78:aload_1         
	//   37   79:invokevirtual   #441 <Method void PendingResult.cancel()>
	//*  38   82:goto            48
		zaey.signalAll();
	//   39   85:aload_0         
	//   40   86:getfield        #72  <Field Condition zaey>
	//   41   89:invokeinterface #444 <Method void Condition.signalAll()>
		zaen.unlock();
	//   42   94:aload_0         
	//   43   95:getfield        #62  <Field Lock zaen>
	//   44   98:invokeinterface #197 <Method void Lock.unlock()>
		return;
	//   45  103:return          
		Exception exception;
		exception;
	//   46  104:astore_1        
		zaen.unlock();
	//   47  105:aload_0         
	//   48  106:getfield        #62  <Field Lock zaen>
	//   49  109:invokeinterface #197 <Method void Lock.unlock()>
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
	//*   5    9:invokespecial   #449 <Method boolean zab(BaseImplementation$ApiMethodImpl)>
	//*   6   12:ifeq            17
			return apimethodimpl;
	//    7   15:aload_1         
	//    8   16:areturn         
		if(!isConnected())
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #388 <Method boolean isConnected()>
	//*  11   21:ifne            37
		{
			zafb.add(((Object) (apimethodimpl)));
	//   12   24:aload_0         
	//   13   25:getfield        #60  <Field Queue zafb>
	//   14   28:aload_1         
	//   15   29:invokeinterface #453 <Method boolean Queue.add(Object)>
	//   16   34:pop             
			return apimethodimpl;
	//   17   35:aload_1         
	//   18   36:areturn         
		} else
		{
			zaew.zahe.zab(((BasePendingResult) (apimethodimpl)));
	//   19   37:aload_0         
	//   20   38:getfield        #76  <Field zaaw zaew>
	//   21   41:getfield        #457 <Field zacp zaaw.zahe>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #462 <Method void zacp.zab(BasePendingResult)>
			return ((GoogleApi) ((zaw)zaet.get(((Object) (apimethodimpl.getClientKey()))))).doRead(apimethodimpl);
	//   24   48:aload_0         
	//   25   49:getfield        #53  <Field Map zaet>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #319 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   28   56:invokeinterface #141 <Method Object Map.get(Object)>
	//   29   61:checkcast       #156 <Class zaw>
	//   30   64:aload_1         
	//   31   65:invokevirtual   #465 <Method BaseImplementation$ApiMethodImpl GoogleApi.doRead(BaseImplementation$ApiMethodImpl)>
	//   32   68:areturn         
		}
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		com.google.android.gms.common.api.Api.AnyClientKey anyclientkey = apimethodimpl.getClientKey();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #319 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//    2    4:astore_2        
		if(zaez && zab(apimethodimpl))
	//*   3    5:aload_0         
	//*   4    6:getfield        #82  <Field boolean zaez>
	//*   5    9:ifeq            22
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:invokespecial   #449 <Method boolean zab(BaseImplementation$ApiMethodImpl)>
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
	//   14   26:getfield        #457 <Field zacp zaaw.zahe>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #462 <Method void zacp.zab(BasePendingResult)>
			return ((GoogleApi) ((zaw)zaet.get(((Object) (anyclientkey))))).doWrite(apimethodimpl);
	//   17   33:aload_0         
	//   18   34:getfield        #53  <Field Map zaet>
	//   19   37:aload_2         
	//   20   38:invokeinterface #141 <Method Object Map.get(Object)>
	//   21   43:checkcast       #156 <Class zaw>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #469 <Method BaseImplementation$ApiMethodImpl GoogleApi.doWrite(BaseImplementation$ApiMethodImpl)>
	//   24   50:areturn         
		}
	}

	public final ConnectionResult getConnectionResult(Api api)
	{
		return zaa(api.getClientKey());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    3    5:invokespecial   #239 <Method ConnectionResult zaa(com.google.android.gms.common.api.Api$AnyClientKey)>
	//    4    8:areturn         
	}

	public final boolean isConnected()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #184 <Method void Lock.lock()>
		ConnectionResult connectionresult;
		if(zafd == null)
			break MISSING_BLOCK_LABEL_30;
	//    3    9:aload_0         
	//    4   10:getfield        #186 <Field Map zafd>
	//    5   13:ifnull          30
		connectionresult = zafg;
	//    6   16:aload_0         
	//    7   17:getfield        #203 <Field ConnectionResult zafg>
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
	//   18   36:invokeinterface #197 <Method void Lock.unlock()>
		return flag;
	//   19   41:iload_1         
	//   20   42:ireturn         
		Exception exception;
		exception;
	//   21   43:astore_2        
		zaen.unlock();
	//   22   44:aload_0         
	//   23   45:getfield        #62  <Field Lock zaen>
	//   24   48:invokeinterface #197 <Method void Lock.unlock()>
		throw exception;
	//   25   53:aload_2         
	//   26   54:athrow          
	}

	public final boolean isConnecting()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #184 <Method void Lock.lock()>
		boolean flag;
		if(zafd != null)
			break MISSING_BLOCK_LABEL_30;
	//    3    9:aload_0         
	//    4   10:getfield        #186 <Field Map zafd>
	//    5   13:ifnonnull       30
		flag = zafc;
	//    6   16:aload_0         
	//    7   17:getfield        #236 <Field boolean zafc>
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
	//   18   36:invokeinterface #197 <Method void Lock.unlock()>
		return flag;
	//   19   41:iload_1         
	//   20   42:ireturn         
		Exception exception;
		exception;
	//   21   43:astore_2        
		zaen.unlock();
	//   22   44:aload_0         
	//   23   45:getfield        #62  <Field Lock zaen>
	//   24   48:invokeinterface #197 <Method void Lock.unlock()>
		throw exception;
	//   25   53:aload_2         
	//   26   54:athrow          
	}

	public final boolean maybeSignIn(SignInConnectionListener signinconnectionlistener)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #184 <Method void Lock.lock()>
		if(!zafc || zaac())
			break MISSING_BLOCK_LABEL_89;
	//    3    9:aload_0         
	//    4   10:getfield        #236 <Field boolean zafc>
	//    5   13:ifeq            89
	//    6   16:aload_0         
	//    7   17:invokespecial   #475 <Method boolean zaac()>
	//    8   20:ifne            89
		zabm.zao();
	//    9   23:aload_0         
	//   10   24:getfield        #174 <Field GoogleApiManager zabm>
	//   11   27:invokevirtual   #409 <Method void GoogleApiManager.zao()>
		zaff = new zaaa(this, signinconnectionlistener);
	//   12   30:aload_0         
	//   13   31:new             #430 <Class zaaa>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:invokespecial   #478 <Method void zaaa(zax, SignInConnectionListener)>
	//   18   40:putfield        #406 <Field zaaa zaff>
		zabm.zaa(((Iterable) (zaeu.values()))).addOnCompleteListener(((java.util.concurrent.Executor) (new HandlerExecutor(zabj))), ((com.google.android.gms.tasks.OnCompleteListener) (zaff)));
	//   19   43:aload_0         
	//   20   44:getfield        #174 <Field GoogleApiManager zabm>
	//   21   47:aload_0         
	//   22   48:getfield        #55  <Field Map zaeu>
	//   23   51:invokeinterface #303 <Method Collection Map.values()>
	//   24   56:invokevirtual   #412 <Method Task GoogleApiManager.zaa(Iterable)>
	//   25   59:new             #414 <Class HandlerExecutor>
	//   26   62:dup             
	//   27   63:aload_0         
	//   28   64:getfield        #64  <Field Looper zabj>
	//   29   67:invokespecial   #417 <Method void HandlerExecutor(Looper)>
	//   30   70:aload_0         
	//   31   71:getfield        #406 <Field zaaa zaff>
	//   32   74:invokevirtual   #428 <Method Task Task.addOnCompleteListener(java.util.concurrent.Executor, com.google.android.gms.tasks.OnCompleteListener)>
	//   33   77:pop             
		zaen.unlock();
	//   34   78:aload_0         
	//   35   79:getfield        #62  <Field Lock zaen>
	//   36   82:invokeinterface #197 <Method void Lock.unlock()>
		return true;
	//   37   87:iconst_1        
	//   38   88:ireturn         
		zaen.unlock();
	//   39   89:aload_0         
	//   40   90:getfield        #62  <Field Lock zaen>
	//   41   93:invokeinterface #197 <Method void Lock.unlock()>
		return false;
	//   42   98:iconst_0        
	//   43   99:ireturn         
		signinconnectionlistener;
	//   44  100:astore_1        
		zaen.unlock();
	//   45  101:aload_0         
	//   46  102:getfield        #62  <Field Lock zaen>
	//   47  105:invokeinterface #197 <Method void Lock.unlock()>
		throw signinconnectionlistener;
	//   48  110:aload_1         
	//   49  111:athrow          
	}

	public final void maybeSignOut()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zaen>
	//    2    4:invokeinterface #184 <Method void Lock.lock()>
		zabm.maybeSignOut();
	//    3    9:aload_0         
	//    4   10:getfield        #174 <Field GoogleApiManager zabm>
	//    5   13:invokevirtual   #481 <Method void GoogleApiManager.maybeSignOut()>
		if(zaff != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #406 <Field zaaa zaff>
	//*   8   20:ifnull          35
		{
			zaff.cancel();
	//    9   23:aload_0         
	//   10   24:getfield        #406 <Field zaaa zaff>
	//   11   27:invokevirtual   #433 <Method void zaaa.cancel()>
			zaff = null;
	//   12   30:aload_0         
	//   13   31:aconst_null     
	//   14   32:putfield        #406 <Field zaaa zaff>
		}
		if(zafe == null)
	//*  15   35:aload_0         
	//*  16   36:getfield        #317 <Field Map zafe>
	//*  17   39:ifnonnull       62
			zafe = ((Map) (new ArrayMap(zaeu.size())));
	//   18   42:aload_0         
	//   19   43:new             #483 <Class ArrayMap>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:getfield        #55  <Field Map zaeu>
	//   23   51:invokeinterface #484 <Method int Map.size()>
	//   24   56:invokespecial   #487 <Method void ArrayMap(int)>
	//   25   59:putfield        #317 <Field Map zafe>
		ConnectionResult connectionresult = new ConnectionResult(4);
	//   26   62:new             #194 <Class ConnectionResult>
	//   27   65:dup             
	//   28   66:iconst_4        
	//   29   67:invokespecial   #488 <Method void ConnectionResult(int)>
	//   30   70:astore_1        
		zaw zaw1;
		for(Iterator iterator = zaeu.values().iterator(); iterator.hasNext(); zafe.put(((Object) (((GoogleApi) (zaw1)).zak())), ((Object) (connectionresult))))
	//*  31   71:aload_0         
	//*  32   72:getfield        #55  <Field Map zaeu>
	//*  33   75:invokeinterface #303 <Method Collection Map.values()>
	//*  34   80:invokeinterface #306 <Method Iterator Collection.iterator()>
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
	//   44  106:getfield        #317 <Field Map zafe>
	//   45  109:aload_3         
	//   46  110:invokevirtual   #192 <Method zai GoogleApi.zak()>
	//   47  113:aload_1         
	//   48  114:invokeinterface #114 <Method Object Map.put(Object, Object)>
	//   49  119:pop             
	//*  50  120:goto            86
		if(zafd != null)
	//*  51  123:aload_0         
	//*  52  124:getfield        #186 <Field Map zafd>
	//*  53  127:ifnull          143
			zafd.putAll(zafe);
	//   54  130:aload_0         
	//   55  131:getfield        #186 <Field Map zafd>
	//   56  134:aload_0         
	//   57  135:getfield        #317 <Field Map zafe>
	//   58  138:invokeinterface #492 <Method void Map.putAll(Map)>
		zaen.unlock();
	//   59  143:aload_0         
	//   60  144:getfield        #62  <Field Lock zaen>
	//   61  147:invokeinterface #197 <Method void Lock.unlock()>
		return;
	//   62  152:return          
		Exception exception;
		exception;
	//   63  153:astore_1        
		zaen.unlock();
	//   64  154:aload_0         
	//   65  155:getfield        #62  <Field Lock zaen>
	//   66  158:invokeinterface #197 <Method void Lock.unlock()>
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
