// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.*;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResult, Api, Scope

public abstract class GoogleApiClient
{
	public static final class Builder
	{

		private static Api.zze zza(Api.zza zza1, Object obj, Context context, Looper looper, zzg zzg1, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
		{
			return zza1.zza(context, looper, zzg1, obj, connectioncallbacks, onconnectionfailedlistener);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload_1         
		//    5    6:aload           5
		//    6    8:aload           6
		//    7   10:invokevirtual   #145 <Method Api$zze Api$zza.zza(Context, Looper, zzg, Object, GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener)>
		//    8   13:areturn         
		}

		private Builder zza(zzaav zzaav1, int i, OnConnectionFailedListener onconnectionfailedlistener)
		{
			boolean flag;
			if(i >= 0)
		//*   0    0:iload_2         
		//*   1    1:iflt            31
				flag = true;
		//    2    4:iconst_1        
		//    3    5:istore          4
			else
		//*   4    7:iload           4
		//*   5    9:ldc1            #151 <String "clientId must be non-negative">
		//*   6   11:invokestatic    #154 <Method void zzac.zzb(boolean, Object)>
		//*   7   14:aload_0         
		//*   8   15:iload_2         
		//*   9   16:putfield        #68  <Field int zzaxV>
		//*  10   19:aload_0         
		//*  11   20:aload_3         
		//*  12   21:putfield        #156 <Field GoogleApiClient$OnConnectionFailedListener zzaxW>
		//*  13   24:aload_0         
		//*  14   25:aload_1         
		//*  15   26:putfield        #158 <Field zzaav zzaxU>
		//*  16   29:aload_0         
		//*  17   30:areturn         
				flag = false;
		//   18   31:iconst_0        
		//   19   32:istore          4
			zzac.zzb(flag, "clientId must be non-negative");
			zzaxV = i;
			zzaxW = onconnectionfailedlistener;
			zzaxU = zzaav1;
			return this;
		//*  20   34:goto            7
		}

		private transient void zza(Api api, Api.ApiOptions apioptions, int i, Scope ascope[])
		{
			boolean flag1 = true;
		//    0    0:iconst_1        
		//    1    1:istore          7
			boolean flag = false;
		//    2    3:iconst_0        
		//    3    4:istore          5
			int j;
			if(i != 1)
		//*   4    6:iload_3         
		//*   5    7:iconst_1        
		//*   6    8:icmpne          59
		//*   7   11:new             #54  <Class HashSet>
		//*   8   14:dup             
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #165 <Method Api$zzd Api.zzuF()>
		//*  11   19:aload_2         
		//*  12   20:invokevirtual   #171 <Method java.util.List Api$zzd.zzp(Object)>
		//*  13   23:invokespecial   #174 <Method void HashSet(java.util.Collection)>
		//*  14   26:astore_2        
		//*  15   27:aload           4
		//*  16   29:arraylength     
		//*  17   30:istore          6
		//*  18   32:iload           5
		//*  19   34:istore_3        
		//*  20   35:iload_3         
		//*  21   36:iload           6
		//*  22   38:icmpge          104
		//*  23   41:aload_2         
		//*  24   42:aload           4
		//*  25   44:iload_3         
		//*  26   45:aaload          
		//*  27   46:invokeinterface #177 <Method boolean Set.add(Object)>
		//*  28   51:pop             
		//*  29   52:iload_3         
		//*  30   53:iconst_1        
		//*  31   54:iadd            
		//*  32   55:istore_3        
		//*  33   56:goto            35
				if(i == 2)
		//*  34   59:iload_3         
		//*  35   60:iconst_2        
		//*  36   61:icmpne          70
					flag1 = false;
		//   37   64:iconst_0        
		//   38   65:istore          7
				else
		//*  39   67:goto            11
					throw new IllegalArgumentException((new StringBuilder(90)).append("Invalid resolution mode: '").append(i).append("', use a constant from GoogleApiClient.ResolutionMode").toString());
		//   40   70:new             #179 <Class IllegalArgumentException>
		//   41   73:dup             
		//   42   74:new             #181 <Class StringBuilder>
		//   43   77:dup             
		//   44   78:bipush          90
		//   45   80:invokespecial   #184 <Method void StringBuilder(int)>
		//   46   83:ldc1            #186 <String "Invalid resolution mode: '">
		//   47   85:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
		//   48   88:iload_3         
		//   49   89:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
		//   50   92:ldc1            #195 <String "', use a constant from GoogleApiClient.ResolutionMode">
		//   51   94:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
		//   52   97:invokevirtual   #198 <Method String StringBuilder.toString()>
		//   53  100:invokespecial   #201 <Method void IllegalArgumentException(String)>
		//   54  103:athrow          
			apioptions = ((Api.ApiOptions) (new HashSet(((java.util.Collection) (api.zzuF().zzp(((Object) (apioptions))))))));
			j = ascope.length;
			for(i = ((int) (flag)); i < j; i++)
				((Set) (apioptions)).add(((Object) (ascope[i])));

			zzaxS.put(((Object) (api)), ((Object) (new com.google.android.gms.common.internal.zzg.zza(((Set) (apioptions)), flag1))));
		//   55  104:aload_0         
		//   56  105:getfield        #64  <Field Map zzaxS>
		//   57  108:aload_1         
		//   58  109:new             #203 <Class com.google.android.gms.common.internal.zzg$zza>
		//   59  112:dup             
		//   60  113:aload_2         
		//   61  114:iload           7
		//   62  116:invokespecial   #206 <Method void com.google.android.gms.common.internal.zzg$zza(Set, boolean)>
		//   63  119:invokeinterface #211 <Method Object Map.put(Object, Object)>
		//   64  124:pop             
		//   65  125:return          
		}

		private void zzf(GoogleApiClient googleapiclient)
		{
			zzzt.zza(zzaxU).zza(zzaxV, googleapiclient, zzaxW);
		//    0    0:aload_0         
		//    1    1:getfield        #158 <Field zzaav zzaxU>
		//    2    4:invokestatic    #219 <Method zzzt zzzt.zza(zzaav)>
		//    3    7:aload_0         
		//    4    8:getfield        #68  <Field int zzaxV>
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #156 <Field GoogleApiClient$OnConnectionFailedListener zzaxW>
		//    8   16:invokevirtual   #222 <Method void zzzt.zza(int, GoogleApiClient, GoogleApiClient$OnConnectionFailedListener)>
		//    9   19:return          
		}

		private GoogleApiClient zzuQ()
		{
			zzg zzg1 = zzuP();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #228 <Method zzg zzuP()>
		//    2    4:astore          7
			Object obj = null;
		//    3    6:aconst_null     
		//    4    7:astore_3        
			Map map = zzg1.zzxg();
		//    5    8:aload           7
		//    6   10:invokevirtual   #234 <Method Map zzg.zzxg()>
		//    7   13:astore          8
			ArrayMap arraymap = new ArrayMap();
		//    8   15:new             #61  <Class ArrayMap>
		//    9   18:dup             
		//   10   19:invokespecial   #62  <Method void ArrayMap()>
		//   11   22:astore          9
			ArrayMap arraymap1 = new ArrayMap();
		//   12   24:new             #61  <Class ArrayMap>
		//   13   27:dup             
		//   14   28:invokespecial   #62  <Method void ArrayMap()>
		//   15   31:astore          10
			ArrayList arraylist = new ArrayList();
		//   16   33:new             #85  <Class ArrayList>
		//   17   36:dup             
		//   18   37:invokespecial   #86  <Method void ArrayList()>
		//   19   40:astore          11
			Iterator iterator = zzaxT.keySet().iterator();
		//   20   42:aload_0         
		//   21   43:getfield        #66  <Field Map zzaxT>
		//   22   46:invokeinterface #238 <Method Set Map.keySet()>
		//   23   51:invokeinterface #242 <Method Iterator Set.iterator()>
		//   24   56:astore          12
			Object obj1 = null;
		//   25   58:aconst_null     
		//   26   59:astore          4
			while(iterator.hasNext()) 
		//*  27   61:aload           12
		//*  28   63:invokeinterface #248 <Method boolean Iterator.hasNext()>
		//*  29   68:ifeq            324
			{
				Api api = (Api)iterator.next();
		//   30   71:aload           12
		//   31   73:invokeinterface #252 <Method Object Iterator.next()>
		//   32   78:checkcast       #161 <Class Api>
		//   33   81:astore          6
				Object obj2 = zzaxT.get(((Object) (api)));
		//   34   83:aload_0         
		//   35   84:getfield        #66  <Field Map zzaxT>
		//   36   87:aload           6
		//   37   89:invokeinterface #256 <Method Object Map.get(Object)>
		//   38   94:astore          5
				int i = 0;
		//   39   96:iconst_0        
		//   40   97:istore_1        
				zzzy zzzy1;
				Api.zza zza1;
				if(map.get(((Object) (api))) != null)
		//*  41   98:aload           8
		//*  42  100:aload           6
		//*  43  102:invokeinterface #256 <Method Object Map.get(Object)>
		//*  44  107:ifnull          130
					if(((com.google.android.gms.common.internal.zzg.zza)map.get(((Object) (api)))).zzaEf)
		//*  45  110:aload           8
		//*  46  112:aload           6
		//*  47  114:invokeinterface #256 <Method Object Map.get(Object)>
		//*  48  119:checkcast       #203 <Class com.google.android.gms.common.internal.zzg$zza>
		//*  49  122:getfield        #259 <Field boolean com.google.android.gms.common.internal.zzg$zza.zzaEf>
		//*  50  125:ifeq            310
						i = 1;
		//   51  128:iconst_1        
		//   52  129:istore_1        
					else
		//*  53  130:aload           9
		//*  54  132:aload           6
		//*  55  134:iload_1         
		//*  56  135:invokestatic    #265 <Method Integer Integer.valueOf(int)>
		//*  57  138:invokeinterface #211 <Method Object Map.put(Object, Object)>
		//*  58  143:pop             
		//*  59  144:new             #267 <Class zzzy>
		//*  60  147:dup             
		//*  61  148:aload           6
		//*  62  150:iload_1         
		//*  63  151:invokespecial   #270 <Method void zzzy(Api, int)>
		//*  64  154:astore          13
		//*  65  156:aload           11
		//*  66  158:aload           13
		//*  67  160:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
		//*  68  163:pop             
		//*  69  164:aload           6
		//*  70  166:invokevirtual   #274 <Method Api$zza Api.zzuG()>
		//*  71  169:astore          14
		//*  72  171:aload           14
		//*  73  173:invokevirtual   #278 <Method int Api$zza.getPriority()>
		//*  74  176:iconst_1        
		//*  75  177:icmpne          530
		//*  76  180:aload           6
		//*  77  182:astore          4
		//*  78  184:aload           14
		//*  79  186:aload           5
		//*  80  188:aload_0         
		//*  81  189:getfield        #94  <Field Context mContext>
		//*  82  192:aload_0         
		//*  83  193:getfield        #102 <Field Looper zzrx>
		//*  84  196:aload           7
		//*  85  198:aload           13
		//*  86  200:aload           13
		//*  87  202:invokestatic    #280 <Method Api$zze zza(Api$zza, Object, Context, Looper, zzg, GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener)>
		//*  88  205:astore          5
		//*  89  207:aload           10
		//*  90  209:aload           6
		//*  91  211:invokevirtual   #284 <Method Api$zzc Api.zzuH()>
		//*  92  214:aload           5
		//*  93  216:invokeinterface #211 <Method Object Map.put(Object, Object)>
		//*  94  221:pop             
		//*  95  222:aload           5
		//*  96  224:invokeinterface #289 <Method boolean Api$zze.zzqS()>
		//*  97  229:ifeq            315
		//*  98  232:aload           6
		//*  99  234:astore          5
		//* 100  236:aload_3         
		//* 101  237:ifnull          318
		//* 102  240:aload           6
		//* 103  242:invokevirtual   #290 <Method String Api.getName()>
		//* 104  245:invokestatic    #295 <Method String String.valueOf(Object)>
		//* 105  248:astore          4
		//* 106  250:aload_3         
		//* 107  251:invokevirtual   #290 <Method String Api.getName()>
		//* 108  254:invokestatic    #295 <Method String String.valueOf(Object)>
		//* 109  257:astore_3        
		//* 110  258:new             #297 <Class IllegalStateException>
		//* 111  261:dup             
		//* 112  262:new             #181 <Class StringBuilder>
		//* 113  265:dup             
		//* 114  266:aload           4
		//* 115  268:invokestatic    #295 <Method String String.valueOf(Object)>
		//* 116  271:invokevirtual   #300 <Method int String.length()>
		//* 117  274:bipush          21
		//* 118  276:iadd            
		//* 119  277:aload_3         
		//* 120  278:invokestatic    #295 <Method String String.valueOf(Object)>
		//* 121  281:invokevirtual   #300 <Method int String.length()>
		//* 122  284:iadd            
		//* 123  285:invokespecial   #184 <Method void StringBuilder(int)>
		//* 124  288:aload           4
		//* 125  290:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
		//* 126  293:ldc2            #302 <String " cannot be used with ">
		//* 127  296:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
		//* 128  299:aload_3         
		//* 129  300:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
		//* 130  303:invokevirtual   #198 <Method String StringBuilder.toString()>
		//* 131  306:invokespecial   #303 <Method void IllegalStateException(String)>
		//* 132  309:athrow          
						i = 2;
		//  133  310:iconst_2        
		//  134  311:istore_1        
				((Map) (arraymap)).put(((Object) (api)), ((Object) (Integer.valueOf(i))));
				zzzy1 = new zzzy(api, i);
				arraylist.add(((Object) (zzzy1)));
				zza1 = api.zzuG();
				if(zza1.getPriority() == 1)
					obj1 = ((Object) (api));
				obj2 = ((Object) (zza(zza1, obj2, mContext, zzrx, zzg1, ((ConnectionCallbacks) (zzzy1)), ((OnConnectionFailedListener) (zzzy1)))));
				((Map) (arraymap1)).put(((Object) (api.zzuH())), obj2);
				if(((Api.zze) (obj2)).zzqS())
				{
					obj2 = ((Object) (api));
					if(obj != null)
					{
						obj1 = ((Object) (String.valueOf(((Object) (api.getName())))));
						obj = ((Object) (String.valueOf(((Object) (((Api) (obj)).getName())))));
						throw new IllegalStateException((new StringBuilder(String.valueOf(obj1).length() + 21 + String.valueOf(obj).length())).append(((String) (obj1))).append(" cannot be used with ").append(((String) (obj))).toString());
					}
				} else
		//* 135  312:goto            130
				{
					obj2 = obj;
		//  136  315:aload_3         
		//  137  316:astore          5
				}
				obj = obj2;
		//  138  318:aload           5
		//  139  320:astore_3        
			}
		//* 140  321:goto            61
			if(obj != null)
		//* 141  324:aload_3         
		//* 142  325:ifnull          460
			{
				if(obj1 != null)
		//* 143  328:aload           4
		//* 144  330:ifnull          403
				{
					obj = ((Object) (String.valueOf(((Object) (((Api) (obj)).getName())))));
		//  145  333:aload_3         
		//  146  334:invokevirtual   #290 <Method String Api.getName()>
		//  147  337:invokestatic    #295 <Method String String.valueOf(Object)>
		//  148  340:astore_3        
					obj1 = ((Object) (String.valueOf(((Object) (((Api) (obj1)).getName())))));
		//  149  341:aload           4
		//  150  343:invokevirtual   #290 <Method String Api.getName()>
		//  151  346:invokestatic    #295 <Method String String.valueOf(Object)>
		//  152  349:astore          4
					throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 21 + String.valueOf(obj1).length())).append(((String) (obj))).append(" cannot be used with ").append(((String) (obj1))).toString());
		//  153  351:new             #297 <Class IllegalStateException>
		//  154  354:dup             
		//  155  355:new             #181 <Class StringBuilder>
		//  156  358:dup             
		//  157  359:aload_3         
		//  158  360:invokestatic    #295 <Method String String.valueOf(Object)>
		//  159  363:invokevirtual   #300 <Method int String.length()>
		//  160  366:bipush          21
		//  161  368:iadd            
		//  162  369:aload           4
		//  163  371:invokestatic    #295 <Method String String.valueOf(Object)>
		//  164  374:invokevirtual   #300 <Method int String.length()>
		//  165  377:iadd            
		//  166  378:invokespecial   #184 <Method void StringBuilder(int)>
		//  167  381:aload_3         
		//  168  382:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
		//  169  385:ldc2            #302 <String " cannot be used with ">
		//  170  388:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
		//  171  391:aload           4
		//  172  393:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
		//  173  396:invokevirtual   #198 <Method String StringBuilder.toString()>
		//  174  399:invokespecial   #303 <Method void IllegalStateException(String)>
		//  175  402:athrow          
				}
				int j;
				boolean flag;
				if(zzagg == null)
		//* 176  403:aload_0         
		//* 177  404:getfield        #305 <Field Account zzagg>
		//* 178  407:ifnonnull       525
					flag = true;
		//  179  410:iconst_1        
		//  180  411:istore_2        
				else
		//* 181  412:iload_2         
		//* 182  413:ldc2            #307 <String "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead">
		//* 183  416:iconst_1        
		//* 184  417:anewarray       Object[]
		//* 185  420:dup             
		//* 186  421:iconst_0        
		//* 187  422:aload_3         
		//* 188  423:invokevirtual   #290 <Method String Api.getName()>
		//* 189  426:aastore         
		//* 190  427:invokestatic    #310 <Method void zzac.zza(boolean, String, Object[])>
		//* 191  430:aload_0         
		//* 192  431:getfield        #57  <Field Set zzaxN>
		//* 193  434:aload_0         
		//* 194  435:getfield        #59  <Field Set zzaxO>
		//* 195  438:invokeinterface #313 <Method boolean Set.equals(Object)>
		//* 196  443:ldc2            #315 <String "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.">
		//* 197  446:iconst_1        
		//* 198  447:anewarray       Object[]
		//* 199  450:dup             
		//* 200  451:iconst_0        
		//* 201  452:aload_3         
		//* 202  453:invokevirtual   #290 <Method String Api.getName()>
		//* 203  456:aastore         
		//* 204  457:invokestatic    #310 <Method void zzac.zza(boolean, String, Object[])>
		//* 205  460:aload           10
		//* 206  462:invokeinterface #319 <Method java.util.Collection Map.values()>
		//* 207  467:iconst_1        
		//* 208  468:invokestatic    #324 <Method int zzaal.zza(Iterable, boolean)>
		//* 209  471:istore_1        
		//* 210  472:new             #321 <Class zzaal>
		//* 211  475:dup             
		//* 212  476:aload_0         
		//* 213  477:getfield        #94  <Field Context mContext>
		//* 214  480:new             #326 <Class ReentrantLock>
		//* 215  483:dup             
		//* 216  484:invokespecial   #327 <Method void ReentrantLock()>
		//* 217  487:aload_0         
		//* 218  488:getfield        #102 <Field Looper zzrx>
		//* 219  491:aload           7
		//* 220  493:aload_0         
		//* 221  494:getfield        #76  <Field GoogleApiAvailability zzaxX>
		//* 222  497:aload_0         
		//* 223  498:getfield        #83  <Field Api$zza zzaxY>
		//* 224  501:aload           9
		//* 225  503:aload_0         
		//* 226  504:getfield        #88  <Field ArrayList zzaxZ>
		//* 227  507:aload_0         
		//* 228  508:getfield        #90  <Field ArrayList zzaya>
		//* 229  511:aload           10
		//* 230  513:aload_0         
		//* 231  514:getfield        #68  <Field int zzaxV>
		//* 232  517:iload_1         
		//* 233  518:aload           11
		//* 234  520:iconst_0        
		//* 235  521:invokespecial   #330 <Method void zzaal(Context, java.util.concurrent.locks.Lock, Looper, zzg, GoogleApiAvailability, Api$zza, Map, java.util.List, java.util.List, Map, int, int, ArrayList, boolean)>
		//* 236  524:areturn         
					flag = false;
		//  237  525:iconst_0        
		//  238  526:istore_2        
				zzac.zza(flag, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] {
					((Api) (obj)).getName()
				});
				zzac.zza(zzaxN.equals(((Object) (zzaxO))), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] {
					((Api) (obj)).getName()
				});
			}
			j = zzaal.zza(((Iterable) (((Map) (arraymap1)).values())), true);
			return ((GoogleApiClient) (new zzaal(mContext, ((java.util.concurrent.locks.Lock) (new ReentrantLock())), zzrx, zzg1, zzaxX, zzaxY, ((Map) (arraymap)), ((java.util.List) (zzaxZ)), ((java.util.List) (zzaya)), ((Map) (arraymap1)), zzaxV, j, arraylist, false)));
		//* 239  527:goto            412
		//* 240  530:goto            184
		}

		public Builder addApi(Api api)
		{
			zzac.zzb(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #334 <String "Api must not be null">
		//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    3    7:pop             
			zzaxT.put(((Object) (api)), ((Object) (null)));
		//    4    8:aload_0         
		//    5    9:getfield        #66  <Field Map zzaxT>
		//    6   12:aload_1         
		//    7   13:aconst_null     
		//    8   14:invokeinterface #211 <Method Object Map.put(Object, Object)>
		//    9   19:pop             
			api = ((Api) (api.zzuF().zzp(((Object) (null)))));
		//   10   20:aload_1         
		//   11   21:invokevirtual   #165 <Method Api$zzd Api.zzuF()>
		//   12   24:aconst_null     
		//   13   25:invokevirtual   #171 <Method java.util.List Api$zzd.zzp(Object)>
		//   14   28:astore_1        
			zzaxO.addAll(((java.util.Collection) (api)));
		//   15   29:aload_0         
		//   16   30:getfield        #59  <Field Set zzaxO>
		//   17   33:aload_1         
		//   18   34:invokeinterface #338 <Method boolean Set.addAll(java.util.Collection)>
		//   19   39:pop             
			zzaxN.addAll(((java.util.Collection) (api)));
		//   20   40:aload_0         
		//   21   41:getfield        #57  <Field Set zzaxN>
		//   22   44:aload_1         
		//   23   45:invokeinterface #338 <Method boolean Set.addAll(java.util.Collection)>
		//   24   50:pop             
			return this;
		//   25   51:aload_0         
		//   26   52:areturn         
		}

		public Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
		{
			zzac.zzb(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #334 <String "Api must not be null">
		//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    3    7:pop             
			zzac.zzb(((Object) (hasoptions)), "Null options are not permitted for this Api");
		//    4    8:aload_2         
		//    5    9:ldc2            #342 <String "Null options are not permitted for this Api">
		//    6   12:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    7   15:pop             
			zzaxT.put(((Object) (api)), ((Object) (hasoptions)));
		//    8   16:aload_0         
		//    9   17:getfield        #66  <Field Map zzaxT>
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:invokeinterface #211 <Method Object Map.put(Object, Object)>
		//   13   27:pop             
			api = ((Api) (api.zzuF().zzp(((Object) (hasoptions)))));
		//   14   28:aload_1         
		//   15   29:invokevirtual   #165 <Method Api$zzd Api.zzuF()>
		//   16   32:aload_2         
		//   17   33:invokevirtual   #171 <Method java.util.List Api$zzd.zzp(Object)>
		//   18   36:astore_1        
			zzaxO.addAll(((java.util.Collection) (api)));
		//   19   37:aload_0         
		//   20   38:getfield        #59  <Field Set zzaxO>
		//   21   41:aload_1         
		//   22   42:invokeinterface #338 <Method boolean Set.addAll(java.util.Collection)>
		//   23   47:pop             
			zzaxN.addAll(((java.util.Collection) (api)));
		//   24   48:aload_0         
		//   25   49:getfield        #57  <Field Set zzaxN>
		//   26   52:aload_1         
		//   27   53:invokeinterface #338 <Method boolean Set.addAll(java.util.Collection)>
		//   28   58:pop             
			return this;
		//   29   59:aload_0         
		//   30   60:areturn         
		}

		public transient Builder addApiIfAvailable(Api api, Api.ApiOptions.HasOptions hasoptions, Scope ascope[])
		{
			zzac.zzb(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #334 <String "Api must not be null">
		//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    3    7:pop             
			zzac.zzb(((Object) (hasoptions)), "Null options are not permitted for this Api");
		//    4    8:aload_2         
		//    5    9:ldc2            #342 <String "Null options are not permitted for this Api">
		//    6   12:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    7   15:pop             
			zzaxT.put(((Object) (api)), ((Object) (hasoptions)));
		//    8   16:aload_0         
		//    9   17:getfield        #66  <Field Map zzaxT>
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:invokeinterface #211 <Method Object Map.put(Object, Object)>
		//   13   27:pop             
			zza(api, ((Api.ApiOptions) (hasoptions)), 1, ascope);
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:aload_2         
		//   17   31:iconst_1        
		//   18   32:aload_3         
		//   19   33:invokespecial   #347 <Method void zza(Api, Api$ApiOptions, int, Scope[])>
			return this;
		//   20   36:aload_0         
		//   21   37:areturn         
		}

		public transient Builder addApiIfAvailable(Api api, Scope ascope[])
		{
			zzac.zzb(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #334 <String "Api must not be null">
		//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    3    7:pop             
			zzaxT.put(((Object) (api)), ((Object) (null)));
		//    4    8:aload_0         
		//    5    9:getfield        #66  <Field Map zzaxT>
		//    6   12:aload_1         
		//    7   13:aconst_null     
		//    8   14:invokeinterface #211 <Method Object Map.put(Object, Object)>
		//    9   19:pop             
			zza(api, ((Api.ApiOptions) (null)), 1, ascope);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:aconst_null     
		//   13   23:iconst_1        
		//   14   24:aload_2         
		//   15   25:invokespecial   #347 <Method void zza(Api, Api$ApiOptions, int, Scope[])>
			return this;
		//   16   28:aload_0         
		//   17   29:areturn         
		}

		public Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
		{
			zzac.zzb(((Object) (connectioncallbacks)), "Listener must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #354 <String "Listener must not be null">
		//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    3    7:pop             
			zzaxZ.add(((Object) (connectioncallbacks)));
		//    4    8:aload_0         
		//    5    9:getfield        #88  <Field ArrayList zzaxZ>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
		//    8   16:pop             
			return this;
		//    9   17:aload_0         
		//   10   18:areturn         
		}

		public Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
		{
			zzac.zzb(((Object) (onconnectionfailedlistener)), "Listener must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #354 <String "Listener must not be null">
		//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    3    7:pop             
			zzaya.add(((Object) (onconnectionfailedlistener)));
		//    4    8:aload_0         
		//    5    9:getfield        #90  <Field ArrayList zzaya>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
		//    8   16:pop             
			return this;
		//    9   17:aload_0         
		//   10   18:areturn         
		}

		public Builder addScope(Scope scope)
		{
			zzac.zzb(((Object) (scope)), "Scope must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #360 <String "Scope must not be null">
		//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    3    7:pop             
			zzaxN.add(((Object) (scope)));
		//    4    8:aload_0         
		//    5    9:getfield        #57  <Field Set zzaxN>
		//    6   12:aload_1         
		//    7   13:invokeinterface #177 <Method boolean Set.add(Object)>
		//    8   18:pop             
			return this;
		//    9   19:aload_0         
		//   10   20:areturn         
		}

		public GoogleApiClient build()
		{
			boolean flag;
			GoogleApiClient googleapiclient;
			if(!zzaxT.isEmpty())
		//*   0    0:aload_0         
		//*   1    1:getfield        #66  <Field Map zzaxT>
		//*   2    4:invokeinterface #364 <Method boolean Map.isEmpty()>
		//*   3    9:ifne            58
				flag = true;
		//    4   12:iconst_1        
		//    5   13:istore_1        
			else
		//*   6   14:iload_1         
		//*   7   15:ldc2            #366 <String "must call addApi() to add at least one API">
		//*   8   18:invokestatic    #154 <Method void zzac.zzb(boolean, Object)>
		//*   9   21:aload_0         
		//*  10   22:invokespecial   #368 <Method GoogleApiClient zzuQ()>
		//*  11   25:astore_3        
		//*  12   26:invokestatic    #371 <Method Set GoogleApiClient.zzuO()>
		//*  13   29:astore_2        
		//*  14   30:aload_2         
		//*  15   31:monitorenter    
		//*  16   32:invokestatic    #371 <Method Set GoogleApiClient.zzuO()>
		//*  17   35:aload_3         
		//*  18   36:invokeinterface #177 <Method boolean Set.add(Object)>
		//*  19   41:pop             
		//*  20   42:aload_2         
		//*  21   43:monitorexit     
		//*  22   44:aload_0         
		//*  23   45:getfield        #68  <Field int zzaxV>
		//*  24   48:iflt            56
		//*  25   51:aload_0         
		//*  26   52:aload_3         
		//*  27   53:invokespecial   #373 <Method void zzf(GoogleApiClient)>
		//*  28   56:aload_3         
		//*  29   57:areturn         
				flag = false;
		//   30   58:iconst_0        
		//   31   59:istore_1        
			zzac.zzb(flag, "must call addApi() to add at least one API");
			googleapiclient = zzuQ();
			synchronized(GoogleApiClient.zzuO())
			{
				GoogleApiClient.zzuO().add(((Object) (googleapiclient)));
			}
			if(zzaxV >= 0)
				zzf(googleapiclient);
			return googleapiclient;
		//*  32   60:goto            14
			exception;
		//   33   63:astore_3        
			set;
		//   34   64:aload_2         
			JVM INSTR monitorexit ;
		//   35   65:monitorexit     
			throw exception;
		//   36   66:aload_3         
		//   37   67:athrow          
		}

		public Builder enableAutoManage(FragmentActivity fragmentactivity, int i, OnConnectionFailedListener onconnectionfailedlistener)
		{
			return zza(new zzaav(((android.app.Activity) (fragmentactivity))), i, onconnectionfailedlistener);
		//    0    0:aload_0         
		//    1    1:new             #377 <Class zzaav>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #380 <Method void zzaav(android.app.Activity)>
		//    5    9:iload_2         
		//    6   10:aload_3         
		//    7   11:invokespecial   #382 <Method GoogleApiClient$Builder zza(zzaav, int, GoogleApiClient$OnConnectionFailedListener)>
		//    8   14:areturn         
		}

		public Builder enableAutoManage(FragmentActivity fragmentactivity, OnConnectionFailedListener onconnectionfailedlistener)
		{
			return enableAutoManage(fragmentactivity, 0, onconnectionfailedlistener);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:aload_2         
		//    4    4:invokevirtual   #385 <Method GoogleApiClient$Builder enableAutoManage(FragmentActivity, int, GoogleApiClient$OnConnectionFailedListener)>
		//    5    7:areturn         
		}

		public Builder setAccountName(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
				s = null;
		//    2    4:aconst_null     
		//    3    5:astore_1        
			else
		//*   4    6:aload_0         
		//*   5    7:aload_1         
		//*   6    8:putfield        #305 <Field Account zzagg>
		//*   7   11:aload_0         
		//*   8   12:areturn         
				s = ((String) (new Account(s, "com.google")));
		//    9   13:new             #389 <Class Account>
		//   10   16:dup             
		//   11   17:aload_1         
		//   12   18:ldc2            #391 <String "com.google">
		//   13   21:invokespecial   #394 <Method void Account(String, String)>
		//   14   24:astore_1        
			zzagg = ((Account) (s));
			return this;
		//*  15   25:goto            6
		}

		public Builder setGravityForPopups(int i)
		{
			zzaxP = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #398 <Field int zzaxP>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setHandler(Handler handler)
		{
			zzac.zzb(((Object) (handler)), "Handler must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #402 <String "Handler must not be null">
		//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    3    7:pop             
			zzrx = handler.getLooper();
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #407 <Method Looper Handler.getLooper()>
		//    7   13:putfield        #102 <Field Looper zzrx>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setViewForPopups(View view)
		{
			zzac.zzb(((Object) (view)), "View must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #411 <String "View must not be null">
		//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    3    7:pop             
			zzaxQ = view;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #413 <Field View zzaxQ>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		public Builder useDefaultAccount()
		{
			return setAccountName("<<default account>>");
		//    0    0:aload_0         
		//    1    1:ldc2            #417 <String "<<default account>>">
		//    2    4:invokevirtual   #419 <Method GoogleApiClient$Builder setAccountName(String)>
		//    3    7:areturn         
		}

		public zzg zzuP()
		{
			zzaxo zzaxo1 = zzaxo.zzbCg;
		//    0    0:getstatic       #425 <Field zzaxo zzaxo.zzbCg>
		//    1    3:astore_1        
			if(zzaxT.containsKey(((Object) (zzaxm.API))))
		//*   2    4:aload_0         
		//*   3    5:getfield        #66  <Field Map zzaxT>
		//*   4    8:getstatic       #429 <Field Api zzaxm.API>
		//*   5   11:invokeinterface #432 <Method boolean Map.containsKey(Object)>
		//*   6   16:ifeq            35
				zzaxo1 = (zzaxo)zzaxT.get(((Object) (zzaxm.API)));
		//    7   19:aload_0         
		//    8   20:getfield        #66  <Field Map zzaxT>
		//    9   23:getstatic       #429 <Field Api zzaxm.API>
		//   10   26:invokeinterface #256 <Method Object Map.get(Object)>
		//   11   31:checkcast       #421 <Class zzaxo>
		//   12   34:astore_1        
			return new zzg(zzagg, zzaxN, zzaxS, zzaxP, zzaxQ, zzahp, zzaxR, zzaxo1);
		//   13   35:new             #230 <Class zzg>
		//   14   38:dup             
		//   15   39:aload_0         
		//   16   40:getfield        #305 <Field Account zzagg>
		//   17   43:aload_0         
		//   18   44:getfield        #57  <Field Set zzaxN>
		//   19   47:aload_0         
		//   20   48:getfield        #64  <Field Map zzaxS>
		//   21   51:aload_0         
		//   22   52:getfield        #398 <Field int zzaxP>
		//   23   55:aload_0         
		//   24   56:getfield        #413 <Field View zzaxQ>
		//   25   59:aload_0         
		//   26   60:getfield        #108 <Field String zzahp>
		//   27   63:aload_0         
		//   28   64:getfield        #119 <Field String zzaxR>
		//   29   67:aload_1         
		//   30   68:invokespecial   #435 <Method void zzg(Account, Set, Map, int, View, String, String, zzaxo)>
		//   31   71:areturn         
		}

		private final Context mContext;
		private Account zzagg;
		private String zzahp;
		private final Set zzaxN;
		private final Set zzaxO;
		private int zzaxP;
		private View zzaxQ;
		private String zzaxR;
		private final Map zzaxS;
		private final Map zzaxT;
		private zzaav zzaxU;
		private int zzaxV;
		private OnConnectionFailedListener zzaxW;
		private GoogleApiAvailability zzaxX;
		private Api.zza zzaxY;
		private final ArrayList zzaxZ;
		private final ArrayList zzaya;
		private boolean zzayb;
		private Looper zzrx;

		public Builder(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #52  <Method void Object()>
			zzaxN = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #54  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #55  <Method void HashSet()>
		//    6   12:putfield        #57  <Field Set zzaxN>
			zzaxO = ((Set) (new HashSet()));
		//    7   15:aload_0         
		//    8   16:new             #54  <Class HashSet>
		//    9   19:dup             
		//   10   20:invokespecial   #55  <Method void HashSet()>
		//   11   23:putfield        #59  <Field Set zzaxO>
			zzaxS = ((Map) (new ArrayMap()));
		//   12   26:aload_0         
		//   13   27:new             #61  <Class ArrayMap>
		//   14   30:dup             
		//   15   31:invokespecial   #62  <Method void ArrayMap()>
		//   16   34:putfield        #64  <Field Map zzaxS>
			zzaxT = ((Map) (new ArrayMap()));
		//   17   37:aload_0         
		//   18   38:new             #61  <Class ArrayMap>
		//   19   41:dup             
		//   20   42:invokespecial   #62  <Method void ArrayMap()>
		//   21   45:putfield        #66  <Field Map zzaxT>
			zzaxV = -1;
		//   22   48:aload_0         
		//   23   49:iconst_m1       
		//   24   50:putfield        #68  <Field int zzaxV>
			zzaxX = GoogleApiAvailability.getInstance();
		//   25   53:aload_0         
		//   26   54:invokestatic    #74  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
		//   27   57:putfield        #76  <Field GoogleApiAvailability zzaxX>
			zzaxY = zzaxm.zzahd;
		//   28   60:aload_0         
		//   29   61:getstatic       #81  <Field Api$zza zzaxm.zzahd>
		//   30   64:putfield        #83  <Field Api$zza zzaxY>
			zzaxZ = new ArrayList();
		//   31   67:aload_0         
		//   32   68:new             #85  <Class ArrayList>
		//   33   71:dup             
		//   34   72:invokespecial   #86  <Method void ArrayList()>
		//   35   75:putfield        #88  <Field ArrayList zzaxZ>
			zzaya = new ArrayList();
		//   36   78:aload_0         
		//   37   79:new             #85  <Class ArrayList>
		//   38   82:dup             
		//   39   83:invokespecial   #86  <Method void ArrayList()>
		//   40   86:putfield        #90  <Field ArrayList zzaya>
			zzayb = false;
		//   41   89:aload_0         
		//   42   90:iconst_0        
		//   43   91:putfield        #92  <Field boolean zzayb>
			mContext = context;
		//   44   94:aload_0         
		//   45   95:aload_1         
		//   46   96:putfield        #94  <Field Context mContext>
			zzrx = context.getMainLooper();
		//   47   99:aload_0         
		//   48  100:aload_1         
		//   49  101:invokevirtual   #100 <Method Looper Context.getMainLooper()>
		//   50  104:putfield        #102 <Field Looper zzrx>
			zzahp = context.getPackageName();
		//   51  107:aload_0         
		//   52  108:aload_1         
		//   53  109:invokevirtual   #106 <Method String Context.getPackageName()>
		//   54  112:putfield        #108 <Field String zzahp>
			zzaxR = ((Object) (context)).getClass().getName();
		//   55  115:aload_0         
		//   56  116:aload_1         
		//   57  117:invokevirtual   #112 <Method Class Object.getClass()>
		//   58  120:invokevirtual   #117 <Method String Class.getName()>
		//   59  123:putfield        #119 <Field String zzaxR>
		//   60  126:return          
		}

		public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
		{
			this(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #124 <Method void GoogleApiClient$Builder(Context)>
			zzac.zzb(((Object) (connectioncallbacks)), "Must provide a connected listener");
		//    3    5:aload_2         
		//    4    6:ldc1            #126 <String "Must provide a connected listener">
		//    5    8:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//    6   11:pop             
			zzaxZ.add(((Object) (connectioncallbacks)));
		//    7   12:aload_0         
		//    8   13:getfield        #88  <Field ArrayList zzaxZ>
		//    9   16:aload_2         
		//   10   17:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
		//   11   20:pop             
			zzac.zzb(((Object) (onconnectionfailedlistener)), "Must provide a connection failed listener");
		//   12   21:aload_3         
		//   13   22:ldc1            #138 <String "Must provide a connection failed listener">
		//   14   24:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
		//   15   27:pop             
			zzaya.add(((Object) (onconnectionfailedlistener)));
		//   16   28:aload_0         
		//   17   29:getfield        #90  <Field ArrayList zzaya>
		//   18   32:aload_3         
		//   19   33:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
		//   20   36:pop             
		//   21   37:return          
		}
	}

	public static interface ConnectionCallbacks
	{

		public abstract void onConnected(Bundle bundle);

		public abstract void onConnectionSuspended(int i);

		public static final int CAUSE_NETWORK_LOST = 2;
		public static final int CAUSE_SERVICE_DISCONNECTED = 1;
	}

	public static interface OnConnectionFailedListener
	{

		public abstract void onConnectionFailed(ConnectionResult connectionresult);
	}


	public GoogleApiClient()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	public static void dumpAll(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		Set set = zzaxM;
	//    0    0:getstatic       #36  <Field Set zzaxM>
	//    1    3:astore          5
		set;
	//    2    5:aload           5
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		String s1;
		Iterator iterator;
		s1 = String.valueOf(((Object) (s))).concat("  ");
	//    4    8:aload_0         
	//    5    9:invokestatic    #46  <Method String String.valueOf(Object)>
	//    6   12:ldc1            #48  <String "  ">
	//    7   14:invokevirtual   #52  <Method String String.concat(String)>
	//    8   17:astore          6
		iterator = zzaxM.iterator();
	//    9   19:getstatic       #36  <Field Set zzaxM>
	//   10   22:invokeinterface #58  <Method Iterator Set.iterator()>
	//   11   27:astore          7
		int i = 0;
	//   12   29:iconst_0        
	//   13   30:istore          4
_L2:
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   14   32:aload           7
	//   15   34:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   16   39:ifeq            88
		GoogleApiClient googleapiclient = (GoogleApiClient)iterator.next();
	//   17   42:aload           7
	//   18   44:invokeinterface #68  <Method Object Iterator.next()>
	//   19   49:checkcast       #2   <Class GoogleApiClient>
	//   20   52:astore          8
		printwriter.append(((CharSequence) (s))).append("GoogleApiClient#").println(i);
	//   21   54:aload_2         
	//   22   55:aload_0         
	//   23   56:invokevirtual   #74  <Method PrintWriter PrintWriter.append(CharSequence)>
	//   24   59:ldc1            #76  <String "GoogleApiClient#">
	//   25   61:invokevirtual   #74  <Method PrintWriter PrintWriter.append(CharSequence)>
	//   26   64:iload           4
	//   27   66:invokevirtual   #80  <Method void PrintWriter.println(int)>
		googleapiclient.dump(s1, filedescriptor, printwriter, as);
	//   28   69:aload           8
	//   29   71:aload           6
	//   30   73:aload_1         
	//   31   74:aload_2         
	//   32   75:aload_3         
	//   33   76:invokevirtual   #83  <Method void dump(String, FileDescriptor, PrintWriter, String[])>
		i++;
	//   34   79:iload           4
	//   35   81:iconst_1        
	//   36   82:iadd            
	//   37   83:istore          4
		if(true) goto _L2; else goto _L1
	//   38   85:goto            32
_L1:
		set;
	//   39   88:aload           5
		JVM INSTR monitorexit ;
	//   40   90:monitorexit     
		return;
	//   41   91:return          
		s;
	//   42   92:astore_0        
		set;
	//   43   93:aload           5
		JVM INSTR monitorexit ;
	//   44   95:monitorexit     
		throw s;
	//   45   96:aload_0         
	//   46   97:athrow          
	}

	public static Set zzuM()
	{
		Set set1;
		synchronized(zzaxM)
	//*   0    0:getstatic       #36  <Field Set zzaxM>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			set1 = zzaxM;
	//    4    6:getstatic       #36  <Field Set zzaxM>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return set1;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		set;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	static Set zzuO()
	{
		return zzaxM;
	//    0    0:getstatic       #36  <Field Set zzaxM>
	//    1    3:areturn         
	}

	public abstract ConnectionResult blockingConnect();

	public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

	public abstract PendingResult clearDefaultAccountAndReconnect();

	public abstract void connect();

	public void connect(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract void disconnect();

	public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

	public abstract ConnectionResult getConnectionResult(Api api);

	public Context getContext()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public Looper getLooper()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract boolean hasConnectedApi(Api api);

	public abstract boolean isConnected();

	public abstract boolean isConnecting();

	public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectioncallbacks);

	public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onconnectionfailedlistener);

	public abstract void reconnect();

	public abstract void registerConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

	public abstract void registerConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

	public abstract void stopAutoManage(FragmentActivity fragmentactivity);

	public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

	public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

	public Api.zze zza(Api.zzc zzc)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public com.google.android.gms.internal.zzzv.zza zza(com.google.android.gms.internal.zzzv.zza zza1)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void zza(zzabp zzabp)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean zza(Api api)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean zza(zzabi zzabi)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public com.google.android.gms.internal.zzzv.zza zzb(com.google.android.gms.internal.zzzv.zza zza1)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void zzb(zzabp zzabp)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public zzaaz zzr(Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void zzuN()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #97  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public static final int SIGN_IN_MODE_OPTIONAL = 2;
	public static final int SIGN_IN_MODE_REQUIRED = 1;
	private static final Set zzaxM = Collections.newSetFromMap(((Map) (new WeakHashMap())));

	static 
	{
	//    0    0:new             #25  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void WeakHashMap()>
	//    3    7:invokestatic    #34  <Method Set Collections.newSetFromMap(Map)>
	//    4   10:putstatic       #36  <Field Set zzaxM>
	//*   5   13:return          
	}
}
