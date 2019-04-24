// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.signin.zad;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaau, zaak, zaam, zaao, 
//			zabe, zaap

final class zaan extends zaau
{

	public zaan(zaak zaak1, Map map)
	{
		zagi = zaak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zaak zagi>
		super(zaak1, ((zaal) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #16  <Method void zaau(zaak, zaal)>
		zagk = map;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #18  <Field Map zagk>
	//   10   16:return          
	}

	public final void zaan()
	{
		int i;
		Object obj;
label0:
		{
			obj = ((Object) (new GoogleApiAvailabilityCache(zaak.zab(zagi))));
	//    0    0:new             #25  <Class GoogleApiAvailabilityCache>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field zaak zagi>
	//    4    8:invokestatic    #31  <Method com.google.android.gms.common.GoogleApiAvailabilityLight zaak.zab(zaak)>
	//    5   11:invokespecial   #34  <Method void GoogleApiAvailabilityCache(com.google.android.gms.common.GoogleApiAvailabilityLight)>
	//    6   14:astore          6
			ArrayList arraylist = new ArrayList();
	//    7   16:new             #36  <Class ArrayList>
	//    8   19:dup             
	//    9   20:invokespecial   #38  <Method void ArrayList()>
	//   10   23:astore          7
			ArrayList arraylist1 = new ArrayList();
	//   11   25:new             #36  <Class ArrayList>
	//   12   28:dup             
	//   13   29:invokespecial   #38  <Method void ArrayList()>
	//   14   32:astore          8
			for(Iterator iterator1 = zagk.keySet().iterator(); iterator1.hasNext();)
	//*  15   34:aload_0         
	//*  16   35:getfield        #18  <Field Map zagk>
	//*  17   38:invokeinterface #44  <Method Set Map.keySet()>
	//*  18   43:invokeinterface #50  <Method Iterator Set.iterator()>
	//*  19   48:astore          9
	//*  20   50:aload           9
	//*  21   52:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//*  22   57:ifeq            128
			{
				com.google.android.gms.common.api.Api.Client client1 = (com.google.android.gms.common.api.Api.Client)iterator1.next();
	//   23   60:aload           9
	//   24   62:invokeinterface #60  <Method Object Iterator.next()>
	//   25   67:checkcast       #62  <Class com.google.android.gms.common.api.Api$Client>
	//   26   70:astore          10
				if(client1.requiresGooglePlayServices() && !zaam.zaa((zaam)zagk.get(((Object) (client1)))))
	//*  27   72:aload           10
	//*  28   74:invokeinterface #65  <Method boolean com.google.android.gms.common.api.Api$Client.requiresGooglePlayServices()>
	//*  29   79:ifeq            115
	//*  30   82:aload_0         
	//*  31   83:getfield        #18  <Field Map zagk>
	//*  32   86:aload           10
	//*  33   88:invokeinterface #69  <Method Object Map.get(Object)>
	//*  34   93:checkcast       #71  <Class zaam>
	//*  35   96:invokestatic    #75  <Method boolean zaam.zaa(zaam)>
	//*  36   99:ifne            115
					((List) (arraylist)).add(((Object) (client1)));
	//   37  102:aload           7
	//   38  104:aload           10
	//   39  106:invokeinterface #81  <Method boolean List.add(Object)>
	//   40  111:pop             
				else
	//*  41  112:goto            50
					((List) (arraylist1)).add(((Object) (client1)));
	//   42  115:aload           8
	//   43  117:aload           10
	//   44  119:invokeinterface #81  <Method boolean List.add(Object)>
	//   45  124:pop             
			}

	//*  46  125:goto            50
			i = -1;
	//   47  128:iconst_m1       
	//   48  129:istore_1        
			boolean flag = ((List) (arraylist)).isEmpty();
	//   49  130:aload           7
	//   50  132:invokeinterface #84  <Method boolean List.isEmpty()>
	//   51  137:istore          5
			int k = 0;
	//   52  139:iconst_0        
	//   53  140:istore_3        
			int j = 0;
	//   54  141:iconst_0        
	//   55  142:istore_2        
			if(flag)
	//*  56  143:iload           5
	//*  57  145:ifeq            213
			{
				arraylist = (ArrayList)arraylist1;
	//   58  148:aload           8
	//   59  150:checkcast       #36  <Class ArrayList>
	//   60  153:astore          7
				int l = arraylist.size();
	//   61  155:aload           7
	//   62  157:invokevirtual   #88  <Method int ArrayList.size()>
	//   63  160:istore          4
				do
				{
					if(j >= l)
						break label0;
	//   64  162:iload_2         
	//   65  163:iload           4
	//   66  165:icmpge          277
					Object obj1 = arraylist.get(j);
	//   67  168:aload           7
	//   68  170:iload_2         
	//   69  171:invokevirtual   #91  <Method Object ArrayList.get(int)>
	//   70  174:astore          8
					j++;
	//   71  176:iload_2         
	//   72  177:iconst_1        
	//   73  178:iadd            
	//   74  179:istore_2        
					obj1 = ((Object) ((com.google.android.gms.common.api.Api.Client)obj1));
	//   75  180:aload           8
	//   76  182:checkcast       #62  <Class com.google.android.gms.common.api.Api$Client>
	//   77  185:astore          8
					k = ((GoogleApiAvailabilityCache) (obj)).getClientAvailability(zaak.zaa(zagi), ((com.google.android.gms.common.api.Api.Client) (obj1)));
	//   78  187:aload           6
	//   79  189:aload_0         
	//   80  190:getfield        #13  <Field zaak zagi>
	//   81  193:invokestatic    #94  <Method android.content.Context zaak.zaa(zaak)>
	//   82  196:aload           8
	//   83  198:invokevirtual   #98  <Method int GoogleApiAvailabilityCache.getClientAvailability(android.content.Context, com.google.android.gms.common.api.Api$Client)>
	//   84  201:istore_3        
					i = k;
	//   85  202:iload_3         
	//   86  203:istore_1        
				} while(k != 0);
	//   87  204:iload_3         
	//   88  205:ifne            162
				i = k;
	//   89  208:iload_3         
	//   90  209:istore_1        
				break label0;
	//   91  210:goto            277
			}
			arraylist = (ArrayList)arraylist;
	//   92  213:aload           7
	//   93  215:checkcast       #36  <Class ArrayList>
	//   94  218:astore          7
			int i1 = arraylist.size();
	//   95  220:aload           7
	//   96  222:invokevirtual   #88  <Method int ArrayList.size()>
	//   97  225:istore          4
			j = k;
	//   98  227:iload_3         
	//   99  228:istore_2        
			do
			{
				if(j >= i1)
					break label0;
	//  100  229:iload_2         
	//  101  230:iload           4
	//  102  232:icmpge          277
				Object obj2 = arraylist.get(j);
	//  103  235:aload           7
	//  104  237:iload_2         
	//  105  238:invokevirtual   #91  <Method Object ArrayList.get(int)>
	//  106  241:astore          8
				j++;
	//  107  243:iload_2         
	//  108  244:iconst_1        
	//  109  245:iadd            
	//  110  246:istore_2        
				obj2 = ((Object) ((com.google.android.gms.common.api.Api.Client)obj2));
	//  111  247:aload           8
	//  112  249:checkcast       #62  <Class com.google.android.gms.common.api.Api$Client>
	//  113  252:astore          8
				k = ((GoogleApiAvailabilityCache) (obj)).getClientAvailability(zaak.zaa(zagi), ((com.google.android.gms.common.api.Api.Client) (obj2)));
	//  114  254:aload           6
	//  115  256:aload_0         
	//  116  257:getfield        #13  <Field zaak zagi>
	//  117  260:invokestatic    #94  <Method android.content.Context zaak.zaa(zaak)>
	//  118  263:aload           8
	//  119  265:invokevirtual   #98  <Method int GoogleApiAvailabilityCache.getClientAvailability(android.content.Context, com.google.android.gms.common.api.Api$Client)>
	//  120  268:istore_3        
				i = k;
	//  121  269:iload_3         
	//  122  270:istore_1        
			} while(k == 0);
	//  123  271:iload_3         
	//  124  272:ifeq            229
			i = k;
	//  125  275:iload_3         
	//  126  276:istore_1        
		}
		if(i != 0)
	//* 127  277:iload_1         
	//* 128  278:ifeq            317
		{
			obj = ((Object) (new ConnectionResult(i, ((android.app.PendingIntent) (null)))));
	//  129  281:new             #100 <Class ConnectionResult>
	//  130  284:dup             
	//  131  285:iload_1         
	//  132  286:aconst_null     
	//  133  287:invokespecial   #103 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//  134  290:astore          6
			com.google.android.gms.common.api.internal.zaak.zad(zagi).zaa(((zabf) (new zaao(this, ((zabd) (zagi)), ((ConnectionResult) (obj))))));
	//  135  292:aload_0         
	//  136  293:getfield        #13  <Field zaak zagi>
	//  137  296:invokestatic    #107 <Method zabe com.google.android.gms.common.api.internal.zaak.zad(zaak)>
	//  138  299:new             #109 <Class zaao>
	//  139  302:dup             
	//  140  303:aload_0         
	//  141  304:aload_0         
	//  142  305:getfield        #13  <Field zaak zagi>
	//  143  308:aload           6
	//  144  310:invokespecial   #112 <Method void zaao(zaan, zabd, ConnectionResult)>
	//  145  313:invokevirtual   #117 <Method void zabe.zaa(zabf)>
			return;
	//  146  316:return          
		}
		if(zaak.zae(zagi))
	//* 147  317:aload_0         
	//* 148  318:getfield        #13  <Field zaak zagi>
	//* 149  321:invokestatic    #121 <Method boolean zaak.zae(zaak)>
	//* 150  324:ifeq            339
			zaak.zaf(zagi).connect();
	//  151  327:aload_0         
	//  152  328:getfield        #13  <Field zaak zagi>
	//  153  331:invokestatic    #125 <Method zad zaak.zaf(zaak)>
	//  154  334:invokeinterface #130 <Method void zad.connect()>
		for(Iterator iterator = zagk.keySet().iterator(); iterator.hasNext();)
	//* 155  339:aload_0         
	//* 156  340:getfield        #18  <Field Map zagk>
	//* 157  343:invokeinterface #44  <Method Set Map.keySet()>
	//* 158  348:invokeinterface #50  <Method Iterator Set.iterator()>
	//* 159  353:astore          7
	//* 160  355:aload           7
	//* 161  357:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//* 162  362:ifeq            459
		{
			com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)iterator.next();
	//  163  365:aload           7
	//  164  367:invokeinterface #60  <Method Object Iterator.next()>
	//  165  372:checkcast       #62  <Class com.google.android.gms.common.api.Api$Client>
	//  166  375:astore          8
			com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks = (com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks)zagk.get(((Object) (client)));
	//  167  377:aload_0         
	//  168  378:getfield        #18  <Field Map zagk>
	//  169  381:aload           8
	//  170  383:invokeinterface #69  <Method Object Map.get(Object)>
	//  171  388:checkcast       #132 <Class com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks>
	//  172  391:astore          9
			if(client.requiresGooglePlayServices() && ((GoogleApiAvailabilityCache) (obj)).getClientAvailability(zaak.zaa(zagi), client) != 0)
	//* 173  393:aload           8
	//* 174  395:invokeinterface #65  <Method boolean com.google.android.gms.common.api.Api$Client.requiresGooglePlayServices()>
	//* 175  400:ifeq            447
	//* 176  403:aload           6
	//* 177  405:aload_0         
	//* 178  406:getfield        #13  <Field zaak zagi>
	//* 179  409:invokestatic    #94  <Method android.content.Context zaak.zaa(zaak)>
	//* 180  412:aload           8
	//* 181  414:invokevirtual   #98  <Method int GoogleApiAvailabilityCache.getClientAvailability(android.content.Context, com.google.android.gms.common.api.Api$Client)>
	//* 182  417:ifeq            447
				com.google.android.gms.common.api.internal.zaak.zad(zagi).zaa(((zabf) (new zaap(this, ((zabd) (zagi)), connectionprogressreportcallbacks))));
	//  183  420:aload_0         
	//  184  421:getfield        #13  <Field zaak zagi>
	//  185  424:invokestatic    #107 <Method zabe com.google.android.gms.common.api.internal.zaak.zad(zaak)>
	//  186  427:new             #134 <Class zaap>
	//  187  430:dup             
	//  188  431:aload_0         
	//  189  432:aload_0         
	//  190  433:getfield        #13  <Field zaak zagi>
	//  191  436:aload           9
	//  192  438:invokespecial   #137 <Method void zaap(zaan, zabd, com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks)>
	//  193  441:invokevirtual   #117 <Method void zabe.zaa(zabf)>
			else
	//* 194  444:goto            355
				client.connect(connectionprogressreportcallbacks);
	//  195  447:aload           8
	//  196  449:aload           9
	//  197  451:invokeinterface #140 <Method void com.google.android.gms.common.api.Api$Client.connect(com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks)>
		}

	//* 198  456:goto            355
	//  199  459:return          
	}

	final zaak zagi;
	private final Map zagk;
}
