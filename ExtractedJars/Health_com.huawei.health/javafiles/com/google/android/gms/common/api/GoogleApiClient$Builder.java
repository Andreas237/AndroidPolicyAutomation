// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//			GoogleApiClient, Api, Scope

public static final class GoogleApiClient$Builder
{

	private static Api.zze zza(Api.zza zza1, Object obj, Context context, Looper looper, zzg zzg1, onCallbacks oncallbacks, tionFailedListener tionfailedlistener)
	{
		return zza1.zza(context, looper, zzg1, obj, oncallbacks, tionfailedlistener);
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

	private GoogleApiClient$Builder zza(zzabd zzabd1, int i, tionFailedListener tionfailedlistener)
	{
		boolean flag;
		if(i >= 0)
	//*   0    0:iload_2         
	//*   1    1:iflt            10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		zzac.zzb(flag, "clientId must be non-negative");
	//    7   13:iload           4
	//    8   15:ldc1            #151 <String "clientId must be non-negative">
	//    9   17:invokestatic    #154 <Method void zzac.zzb(boolean, Object)>
		zzazl = i;
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:putfield        #68  <Field int zzazl>
		zzazm = tionfailedlistener;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #156 <Field GoogleApiClient$OnConnectionFailedListener zzazm>
		zzazk = zzabd1;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #158 <Field zzabd zzazk>
		return this;
	//   19   35:aload_0         
	//   20   36:areturn         
	}

	private transient void zza(Api api, Api.ApiOptions apioptions, Scope ascope[])
	{
		apioptions = ((Api.ApiOptions) (new HashSet(((java.util.Collection) (api.zzve().zzp(((Object) (apioptions))))))));
	//    0    0:new             #54  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #165 <Method Api$zzd Api.zzve()>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #171 <Method java.util.List Api$zzd.zzp(Object)>
	//    6   12:invokespecial   #174 <Method void HashSet(java.util.Collection)>
	//    7   15:astore_2        
		int j = ascope.length;
	//    8   16:aload_3         
	//    9   17:arraylength     
	//   10   18:istore          5
		for(int i = 0; i < j; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore          4
	//*  13   23:iload           4
	//*  14   25:iload           5
	//*  15   27:icmpge          50
			((Set) (apioptions)).add(((Object) (ascope[i])));
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:iload           4
	//   19   34:aaload          
	//   20   35:invokeinterface #177 <Method boolean Set.add(Object)>
	//   21   40:pop             

	//   22   41:iload           4
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore          4
	//*  26   47:goto            23
		zzazi.put(((Object) (api)), ((Object) (new com.google.android.gms.common.internal.zzg.zza(((Set) (apioptions))))));
	//   27   50:aload_0         
	//   28   51:getfield        #64  <Field Map zzazi>
	//   29   54:aload_1         
	//   30   55:new             #179 <Class com.google.android.gms.common.internal.zzg$zza>
	//   31   58:dup             
	//   32   59:aload_2         
	//   33   60:invokespecial   #182 <Method void com.google.android.gms.common.internal.zzg$zza(Set)>
	//   34   63:invokeinterface #187 <Method Object Map.put(Object, Object)>
	//   35   68:pop             
	//   36   69:return          
	}

	private void zzf(GoogleApiClient googleapiclient)
	{
		zzaaa.zza(zzazk).zza(zzazl, googleapiclient, zzazm);
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field zzabd zzazk>
	//    2    4:invokestatic    #195 <Method zzaaa zzaaa.zza(zzabd)>
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field int zzazl>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #156 <Field GoogleApiClient$OnConnectionFailedListener zzazm>
	//    8   16:invokevirtual   #198 <Method void zzaaa.zza(int, GoogleApiClient, GoogleApiClient$OnConnectionFailedListener)>
	//    9   19:return          
	}

	private GoogleApiClient zzvq()
	{
		zzg zzg1 = zzvp();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method zzg zzvp()>
	//    2    4:astore          6
		Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		Map map = zzg1.zzxN();
	//    7   10:aload           6
	//    8   12:invokevirtual   #210 <Method Map zzg.zzxN()>
	//    9   15:astore          7
		ArrayMap arraymap = new ArrayMap();
	//   10   17:new             #61  <Class ArrayMap>
	//   11   20:dup             
	//   12   21:invokespecial   #62  <Method void ArrayMap()>
	//   13   24:astore          8
		ArrayMap arraymap1 = new ArrayMap();
	//   14   26:new             #61  <Class ArrayMap>
	//   15   29:dup             
	//   16   30:invokespecial   #62  <Method void ArrayMap()>
	//   17   33:astore          9
		ArrayList arraylist = new ArrayList();
	//   18   35:new             #85  <Class ArrayList>
	//   19   38:dup             
	//   20   39:invokespecial   #86  <Method void ArrayList()>
	//   21   42:astore          10
		Object obj1;
		for(Iterator iterator = zzazj.keySet().iterator(); iterator.hasNext(); obj = obj1)
	//*  22   44:aload_0         
	//*  23   45:getfield        #66  <Field Map zzazj>
	//*  24   48:invokeinterface #214 <Method Set Map.keySet()>
	//*  25   53:invokeinterface #218 <Method Iterator Set.iterator()>
	//*  26   58:astore          11
	//*  27   60:aload           11
	//*  28   62:invokeinterface #224 <Method boolean Iterator.hasNext()>
	//*  29   67:ifeq            313
		{
			Api api = (Api)iterator.next();
	//   30   70:aload           11
	//   31   72:invokeinterface #228 <Method Object Iterator.next()>
	//   32   77:checkcast       #161 <Class Api>
	//   33   80:astore          5
			obj1 = zzazj.get(((Object) (api)));
	//   34   82:aload_0         
	//   35   83:getfield        #66  <Field Map zzazj>
	//   36   86:aload           5
	//   37   88:invokeinterface #232 <Method Object Map.get(Object)>
	//   38   93:astore          4
			boolean flag;
			if(map.get(((Object) (api))) != null)
	//*  39   95:aload           7
	//*  40   97:aload           5
	//*  41   99:invokeinterface #232 <Method Object Map.get(Object)>
	//*  42  104:ifnull          112
				flag = true;
	//   43  107:iconst_1        
	//   44  108:istore_2        
			else
	//*  45  109:goto            114
				flag = false;
	//   46  112:iconst_0        
	//   47  113:istore_2        
			((Map) (arraymap)).put(((Object) (api)), ((Object) (Boolean.valueOf(flag))));
	//   48  114:aload           8
	//   49  116:aload           5
	//   50  118:iload_2         
	//   51  119:invokestatic    #238 <Method Boolean Boolean.valueOf(boolean)>
	//   52  122:invokeinterface #187 <Method Object Map.put(Object, Object)>
	//   53  127:pop             
			Object obj2 = ((Object) (new zzaag(api, flag)));
	//   54  128:new             #240 <Class zzaag>
	//   55  131:dup             
	//   56  132:aload           5
	//   57  134:iload_2         
	//   58  135:invokespecial   #243 <Method void zzaag(Api, boolean)>
	//   59  138:astore          13
			arraylist.add(obj2);
	//   60  140:aload           10
	//   61  142:aload           13
	//   62  144:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//   63  147:pop             
			Api.zza zza1 = api.zzvf();
	//   64  148:aload           5
	//   65  150:invokevirtual   #247 <Method Api$zza Api.zzvf()>
	//   66  153:astore          12
			obj2 = ((Object) (zza(zza1, obj1, mContext, zzrs, zzg1, ((onCallbacks) (obj2)), ((tionFailedListener) (obj2)))));
	//   67  155:aload           12
	//   68  157:aload           4
	//   69  159:aload_0         
	//   70  160:getfield        #94  <Field Context mContext>
	//   71  163:aload_0         
	//   72  164:getfield        #102 <Field Looper zzrs>
	//   73  167:aload           6
	//   74  169:aload           13
	//   75  171:aload           13
	//   76  173:invokestatic    #249 <Method Api$zze zza(Api$zza, Object, Context, Looper, zzg, GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener)>
	//   77  176:astore          13
			((Map) (arraymap1)).put(((Object) (api.zzvg())), obj2);
	//   78  178:aload           9
	//   79  180:aload           5
	//   80  182:invokevirtual   #253 <Method Api$zzc Api.zzvg()>
	//   81  185:aload           13
	//   82  187:invokeinterface #187 <Method Object Map.put(Object, Object)>
	//   83  192:pop             
			if(((Api.zzd) (zza1)).getPriority() == 1)
	//*  84  193:aload           12
	//*  85  195:invokevirtual   #257 <Method int Api$zzd.getPriority()>
	//*  86  198:iconst_1        
	//*  87  199:icmpne          214
				if(obj1 != null)
	//*  88  202:aload           4
	//*  89  204:ifnull          212
					i = 1;
	//   90  207:iconst_1        
	//   91  208:istore_1        
				else
	//*  92  209:goto            214
					i = 0;
	//   93  212:iconst_0        
	//   94  213:istore_1        
			obj1 = obj;
	//   95  214:aload_3         
	//   96  215:astore          4
			if(!((Api.zze) (obj2)).zzrr())
				continue;
	//   97  217:aload           13
	//   98  219:invokeinterface #262 <Method boolean Api$zze.zzrr()>
	//   99  224:ifeq            307
			if(obj != null)
	//* 100  227:aload_3         
	//* 101  228:ifnull          303
			{
				obj1 = ((Object) (String.valueOf(((Object) (api.getName())))));
	//  102  231:aload           5
	//  103  233:invokevirtual   #263 <Method String Api.getName()>
	//  104  236:invokestatic    #268 <Method String String.valueOf(Object)>
	//  105  239:astore          4
				obj = ((Object) (String.valueOf(((Object) (((Api) (obj)).getName())))));
	//  106  241:aload_3         
	//  107  242:invokevirtual   #263 <Method String Api.getName()>
	//  108  245:invokestatic    #268 <Method String String.valueOf(Object)>
	//  109  248:astore_3        
				i = String.valueOf(obj1).length();
	//  110  249:aload           4
	//  111  251:invokestatic    #268 <Method String String.valueOf(Object)>
	//  112  254:invokevirtual   #271 <Method int String.length()>
	//  113  257:istore_1        
				throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + (i + 21))).append(((String) (obj1))).append(" cannot be used with ").append(((String) (obj))).toString());
	//  114  258:new             #273 <Class IllegalStateException>
	//  115  261:dup             
	//  116  262:new             #275 <Class StringBuilder>
	//  117  265:dup             
	//  118  266:aload_3         
	//  119  267:invokestatic    #268 <Method String String.valueOf(Object)>
	//  120  270:invokevirtual   #271 <Method int String.length()>
	//  121  273:iload_1         
	//  122  274:bipush          21
	//  123  276:iadd            
	//  124  277:iadd            
	//  125  278:invokespecial   #278 <Method void StringBuilder(int)>
	//  126  281:aload           4
	//  127  283:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  128  286:ldc2            #284 <String " cannot be used with ">
	//  129  289:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  130  292:aload_3         
	//  131  293:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  132  296:invokevirtual   #287 <Method String StringBuilder.toString()>
	//  133  299:invokespecial   #290 <Method void IllegalStateException(String)>
	//  134  302:athrow          
			}
			obj1 = ((Object) (api));
	//  135  303:aload           5
	//  136  305:astore          4
		}

	//  137  307:aload           4
	//  138  309:astore_3        
	//* 139  310:goto            60
		if(obj != null)
	//* 140  313:aload_3         
	//* 141  314:ifnull          435
		{
			if(i != 0)
	//* 142  317:iload_1         
	//* 143  318:ifeq            373
			{
				obj = ((Object) (String.valueOf(((Object) (((Api) (obj)).getName())))));
	//  144  321:aload_3         
	//  145  322:invokevirtual   #263 <Method String Api.getName()>
	//  146  325:invokestatic    #268 <Method String String.valueOf(Object)>
	//  147  328:astore_3        
				throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 82)).append("With using ").append(((String) (obj))).append(", GamesOptions can only be specified within GoogleSignInOptions.Builder").toString());
	//  148  329:new             #273 <Class IllegalStateException>
	//  149  332:dup             
	//  150  333:new             #275 <Class StringBuilder>
	//  151  336:dup             
	//  152  337:aload_3         
	//  153  338:invokestatic    #268 <Method String String.valueOf(Object)>
	//  154  341:invokevirtual   #271 <Method int String.length()>
	//  155  344:bipush          82
	//  156  346:iadd            
	//  157  347:invokespecial   #278 <Method void StringBuilder(int)>
	//  158  350:ldc2            #292 <String "With using ">
	//  159  353:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  160  356:aload_3         
	//  161  357:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  162  360:ldc2            #294 <String ", GamesOptions can only be specified within GoogleSignInOptions.Builder">
	//  163  363:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  164  366:invokevirtual   #287 <Method String StringBuilder.toString()>
	//  165  369:invokespecial   #290 <Method void IllegalStateException(String)>
	//  166  372:athrow          
			}
			boolean flag1;
			if(zzahh == null)
	//* 167  373:aload_0         
	//* 168  374:getfield        #296 <Field Account zzahh>
	//* 169  377:ifnonnull       385
				flag1 = true;
	//  170  380:iconst_1        
	//  171  381:istore_2        
			else
	//* 172  382:goto            387
				flag1 = false;
	//  173  385:iconst_0        
	//  174  386:istore_2        
			zzac.zza(flag1, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] {
				((Api) (obj)).getName()
			});
	//  175  387:iload_2         
	//  176  388:ldc2            #298 <String "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead">
	//  177  391:iconst_1        
	//  178  392:anewarray       Object[]
	//  179  395:dup             
	//  180  396:iconst_0        
	//  181  397:aload_3         
	//  182  398:invokevirtual   #263 <Method String Api.getName()>
	//  183  401:aastore         
	//  184  402:invokestatic    #301 <Method void zzac.zza(boolean, String, Object[])>
			zzac.zza(zzazd.equals(((Object) (zzaze))), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] {
				((Api) (obj)).getName()
			});
	//  185  405:aload_0         
	//  186  406:getfield        #57  <Field Set zzazd>
	//  187  409:aload_0         
	//  188  410:getfield        #59  <Field Set zzaze>
	//  189  413:invokeinterface #304 <Method boolean Set.equals(Object)>
	//  190  418:ldc2            #306 <String "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.">
	//  191  421:iconst_1        
	//  192  422:anewarray       Object[]
	//  193  425:dup             
	//  194  426:iconst_0        
	//  195  427:aload_3         
	//  196  428:invokevirtual   #263 <Method String Api.getName()>
	//  197  431:aastore         
	//  198  432:invokestatic    #301 <Method void zzac.zza(boolean, String, Object[])>
		}
		i = zzaat.zza(((Iterable) (((Map) (arraymap1)).values())), true);
	//  199  435:aload           9
	//  200  437:invokeinterface #310 <Method java.util.Collection Map.values()>
	//  201  442:iconst_1        
	//  202  443:invokestatic    #315 <Method int zzaat.zza(Iterable, boolean)>
	//  203  446:istore_1        
		return ((GoogleApiClient) (new zzaat(mContext, ((java.util.concurrent.locks.Lock) (new ReentrantLock())), zzrs, zzg1, zzazn, zzazo, ((Map) (arraymap)), ((java.util.List) (zzazp)), ((java.util.List) (zzazq)), ((Map) (arraymap1)), zzazl, i, arraylist, false)));
	//  204  447:new             #312 <Class zzaat>
	//  205  450:dup             
	//  206  451:aload_0         
	//  207  452:getfield        #94  <Field Context mContext>
	//  208  455:new             #317 <Class ReentrantLock>
	//  209  458:dup             
	//  210  459:invokespecial   #318 <Method void ReentrantLock()>
	//  211  462:aload_0         
	//  212  463:getfield        #102 <Field Looper zzrs>
	//  213  466:aload           6
	//  214  468:aload_0         
	//  215  469:getfield        #76  <Field GoogleApiAvailability zzazn>
	//  216  472:aload_0         
	//  217  473:getfield        #83  <Field Api$zza zzazo>
	//  218  476:aload           8
	//  219  478:aload_0         
	//  220  479:getfield        #88  <Field ArrayList zzazp>
	//  221  482:aload_0         
	//  222  483:getfield        #90  <Field ArrayList zzazq>
	//  223  486:aload           9
	//  224  488:aload_0         
	//  225  489:getfield        #68  <Field int zzazl>
	//  226  492:iload_1         
	//  227  493:aload           10
	//  228  495:iconst_0        
	//  229  496:invokespecial   #321 <Method void zzaat(Context, java.util.concurrent.locks.Lock, Looper, zzg, GoogleApiAvailability, Api$zza, Map, java.util.List, java.util.List, Map, int, int, ArrayList, boolean)>
	//  230  499:areturn         
	}

	public GoogleApiClient$Builder addApi(Api api)
	{
		zzac.zzb(((Object) (api)), "Api must not be null");
	//    0    0:aload_1         
	//    1    1:ldc2            #325 <String "Api must not be null">
	//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    3    7:pop             
		zzazj.put(((Object) (api)), ((Object) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #66  <Field Map zzazj>
	//    6   12:aload_1         
	//    7   13:aconst_null     
	//    8   14:invokeinterface #187 <Method Object Map.put(Object, Object)>
	//    9   19:pop             
		api = ((Api) (api.zzve().zzp(((Object) (null)))));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #165 <Method Api$zzd Api.zzve()>
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #171 <Method java.util.List Api$zzd.zzp(Object)>
	//   14   28:astore_1        
		zzaze.addAll(((java.util.Collection) (api)));
	//   15   29:aload_0         
	//   16   30:getfield        #59  <Field Set zzaze>
	//   17   33:aload_1         
	//   18   34:invokeinterface #329 <Method boolean Set.addAll(java.util.Collection)>
	//   19   39:pop             
		zzazd.addAll(((java.util.Collection) (api)));
	//   20   40:aload_0         
	//   21   41:getfield        #57  <Field Set zzazd>
	//   22   44:aload_1         
	//   23   45:invokeinterface #329 <Method boolean Set.addAll(java.util.Collection)>
	//   24   50:pop             
		return this;
	//   25   51:aload_0         
	//   26   52:areturn         
	}

	public GoogleApiClient$Builder addApi(Api api, s s)
	{
		zzac.zzb(((Object) (api)), "Api must not be null");
	//    0    0:aload_1         
	//    1    1:ldc2            #325 <String "Api must not be null">
	//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    3    7:pop             
		zzac.zzb(((Object) (s)), "Null options are not permitted for this Api");
	//    4    8:aload_2         
	//    5    9:ldc2            #333 <String "Null options are not permitted for this Api">
	//    6   12:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    7   15:pop             
		zzazj.put(((Object) (api)), ((Object) (s)));
	//    8   16:aload_0         
	//    9   17:getfield        #66  <Field Map zzazj>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokeinterface #187 <Method Object Map.put(Object, Object)>
	//   13   27:pop             
		api = ((Api) (api.zzve().zzp(((Object) (s)))));
	//   14   28:aload_1         
	//   15   29:invokevirtual   #165 <Method Api$zzd Api.zzve()>
	//   16   32:aload_2         
	//   17   33:invokevirtual   #171 <Method java.util.List Api$zzd.zzp(Object)>
	//   18   36:astore_1        
		zzaze.addAll(((java.util.Collection) (api)));
	//   19   37:aload_0         
	//   20   38:getfield        #59  <Field Set zzaze>
	//   21   41:aload_1         
	//   22   42:invokeinterface #329 <Method boolean Set.addAll(java.util.Collection)>
	//   23   47:pop             
		zzazd.addAll(((java.util.Collection) (api)));
	//   24   48:aload_0         
	//   25   49:getfield        #57  <Field Set zzazd>
	//   26   52:aload_1         
	//   27   53:invokeinterface #329 <Method boolean Set.addAll(java.util.Collection)>
	//   28   58:pop             
		return this;
	//   29   59:aload_0         
	//   30   60:areturn         
	}

	public transient GoogleApiClient$Builder addApiIfAvailable(Api api, s s, Scope ascope[])
	{
		zzac.zzb(((Object) (api)), "Api must not be null");
	//    0    0:aload_1         
	//    1    1:ldc2            #325 <String "Api must not be null">
	//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    3    7:pop             
		zzac.zzb(((Object) (s)), "Null options are not permitted for this Api");
	//    4    8:aload_2         
	//    5    9:ldc2            #333 <String "Null options are not permitted for this Api">
	//    6   12:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    7   15:pop             
		zzazj.put(((Object) (api)), ((Object) (s)));
	//    8   16:aload_0         
	//    9   17:getfield        #66  <Field Map zzazj>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokeinterface #187 <Method Object Map.put(Object, Object)>
	//   13   27:pop             
		zza(api, ((Api.ApiOptions) (s)), ascope);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokespecial   #338 <Method void zza(Api, Api$ApiOptions, Scope[])>
		return this;
	//   19   35:aload_0         
	//   20   36:areturn         
	}

	public transient GoogleApiClient$Builder addApiIfAvailable(Api api, Scope ascope[])
	{
		zzac.zzb(((Object) (api)), "Api must not be null");
	//    0    0:aload_1         
	//    1    1:ldc2            #325 <String "Api must not be null">
	//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    3    7:pop             
		zzazj.put(((Object) (api)), ((Object) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #66  <Field Map zzazj>
	//    6   12:aload_1         
	//    7   13:aconst_null     
	//    8   14:invokeinterface #187 <Method Object Map.put(Object, Object)>
	//    9   19:pop             
		zza(api, ((Api.ApiOptions) (null)), ascope);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aconst_null     
	//   13   23:aload_2         
	//   14   24:invokespecial   #338 <Method void zza(Api, Api$ApiOptions, Scope[])>
		return this;
	//   15   27:aload_0         
	//   16   28:areturn         
	}

	public GoogleApiClient$Builder addConnectionCallbacks(onCallbacks oncallbacks)
	{
		zzac.zzb(((Object) (oncallbacks)), "Listener must not be null");
	//    0    0:aload_1         
	//    1    1:ldc2            #345 <String "Listener must not be null">
	//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    3    7:pop             
		zzazp.add(((Object) (oncallbacks)));
	//    4    8:aload_0         
	//    5    9:getfield        #88  <Field ArrayList zzazp>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//    8   16:pop             
		return this;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public GoogleApiClient$Builder addOnConnectionFailedListener(tionFailedListener tionfailedlistener)
	{
		zzac.zzb(((Object) (tionfailedlistener)), "Listener must not be null");
	//    0    0:aload_1         
	//    1    1:ldc2            #345 <String "Listener must not be null">
	//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    3    7:pop             
		zzazq.add(((Object) (tionfailedlistener)));
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field ArrayList zzazq>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//    8   16:pop             
		return this;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public GoogleApiClient$Builder addScope(Scope scope)
	{
		zzac.zzb(((Object) (scope)), "Scope must not be null");
	//    0    0:aload_1         
	//    1    1:ldc2            #351 <String "Scope must not be null">
	//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    3    7:pop             
		zzazd.add(((Object) (scope)));
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field Set zzazd>
	//    6   12:aload_1         
	//    7   13:invokeinterface #177 <Method boolean Set.add(Object)>
	//    8   18:pop             
		return this;
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	public GoogleApiClient build()
	{
		Object obj;
		boolean flag;
		if(!zzazj.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Map zzazj>
	//*   2    4:invokeinterface #355 <Method boolean Map.isEmpty()>
	//*   3    9:ifne            17
			flag = true;
	//    4   12:iconst_1        
	//    5   13:istore_1        
		else
	//*   6   14:goto            19
			flag = false;
	//    7   17:iconst_0        
	//    8   18:istore_1        
		zzac.zzb(flag, "must call addApi() to add at least one API");
	//    9   19:iload_1         
	//   10   20:ldc2            #357 <String "must call addApi() to add at least one API">
	//   11   23:invokestatic    #154 <Method void zzac.zzb(boolean, Object)>
		obj = ((Object) (zzvq()));
	//   12   26:aload_0         
	//   13   27:invokespecial   #359 <Method GoogleApiClient zzvq()>
	//   14   30:astore_3        
		Set set = GoogleApiClient.zzvo();
	//   15   31:invokestatic    #362 <Method Set GoogleApiClient.zzvo()>
	//   16   34:astore_2        
		set;
	//   17   35:aload_2         
		JVM INSTR monitorenter ;
	//   18   36:monitorenter    
		GoogleApiClient.zzvo().add(obj);
	//   19   37:invokestatic    #362 <Method Set GoogleApiClient.zzvo()>
	//   20   40:aload_3         
	//   21   41:invokeinterface #177 <Method boolean Set.add(Object)>
	//   22   46:pop             
		set;
	//   23   47:aload_2         
		JVM INSTR monitorexit ;
	//   24   48:monitorexit     
		  goto _L1
	//*  25   49:goto            57
		obj;
	//   26   52:astore_3        
	//*  27   53:aload_2         
		throw obj;
	//   28   54:monitorexit     
	//   29   55:aload_3         
	//   30   56:athrow          
_L1:
		if(zzazl >= 0)
	//*  31   57:aload_0         
	//*  32   58:getfield        #68  <Field int zzazl>
	//*  33   61:iflt            69
			zzf(((GoogleApiClient) (obj)));
	//   34   64:aload_0         
	//   35   65:aload_3         
	//   36   66:invokespecial   #364 <Method void zzf(GoogleApiClient)>
		return ((GoogleApiClient) (obj));
	//   37   69:aload_3         
	//   38   70:areturn         
	}

	public GoogleApiClient$Builder enableAutoManage(FragmentActivity fragmentactivity, int i, tionFailedListener tionfailedlistener)
	{
		return zza(new zzabd(((android.app.Activity) (fragmentactivity))), i, tionfailedlistener);
	//    0    0:aload_0         
	//    1    1:new             #368 <Class zzabd>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #371 <Method void zzabd(android.app.Activity)>
	//    5    9:iload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #373 <Method GoogleApiClient$Builder zza(zzabd, int, GoogleApiClient$OnConnectionFailedListener)>
	//    8   14:areturn         
	}

	public GoogleApiClient$Builder enableAutoManage(FragmentActivity fragmentactivity, tionFailedListener tionfailedlistener)
	{
		return enableAutoManage(fragmentactivity, 0, tionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_2         
	//    4    4:invokevirtual   #376 <Method GoogleApiClient$Builder enableAutoManage(FragmentActivity, int, GoogleApiClient$OnConnectionFailedListener)>
	//    5    7:areturn         
	}

	public GoogleApiClient$Builder setAccountName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            21
			s = ((String) (new Account(s, "com.google")));
	//    5    9:new             #380 <Class Account>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:ldc2            #382 <String "com.google">
	//    9   17:invokespecial   #385 <Method void Account(String, String)>
	//   10   20:astore_1        
		zzahh = ((Account) (s));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #296 <Field Account zzahh>
		return this;
	//   14   26:aload_0         
	//   15   27:areturn         
	}

	public GoogleApiClient$Builder setGravityForPopups(int i)
	{
		zzazf = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #389 <Field int zzazf>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GoogleApiClient$Builder setHandler(Handler handler)
	{
		zzac.zzb(((Object) (handler)), "Handler must not be null");
	//    0    0:aload_1         
	//    1    1:ldc2            #393 <String "Handler must not be null">
	//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    3    7:pop             
		zzrs = handler.getLooper();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #398 <Method Looper Handler.getLooper()>
	//    7   13:putfield        #102 <Field Looper zzrs>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public GoogleApiClient$Builder setViewForPopups(View view)
	{
		zzac.zzb(((Object) (view)), "View must not be null");
	//    0    0:aload_1         
	//    1    1:ldc2            #402 <String "View must not be null">
	//    2    4:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    3    7:pop             
		zzazg = view;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #404 <Field View zzazg>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public GoogleApiClient$Builder useDefaultAccount()
	{
		return setAccountName("<<default account>>");
	//    0    0:aload_0         
	//    1    1:ldc2            #408 <String "<<default account>>">
	//    2    4:invokevirtual   #410 <Method GoogleApiClient$Builder setAccountName(String)>
	//    3    7:areturn         
	}

	public GoogleApiClient$Builder zze(Account account)
	{
		zzahh = account;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #296 <Field Account zzahh>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public zzg zzvp()
	{
		zzbaj zzbaj1 = zzbaj.zzbEi;
	//    0    0:getstatic       #418 <Field zzbaj zzbaj.zzbEi>
	//    1    3:astore_1        
		if(zzazj.containsKey(((Object) (zzbah.API))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #66  <Field Map zzazj>
	//*   4    8:getstatic       #422 <Field Api zzbah.API>
	//*   5   11:invokeinterface #425 <Method boolean Map.containsKey(Object)>
	//*   6   16:ifeq            35
			zzbaj1 = (zzbaj)zzazj.get(((Object) (zzbah.API)));
	//    7   19:aload_0         
	//    8   20:getfield        #66  <Field Map zzazj>
	//    9   23:getstatic       #422 <Field Api zzbah.API>
	//   10   26:invokeinterface #232 <Method Object Map.get(Object)>
	//   11   31:checkcast       #414 <Class zzbaj>
	//   12   34:astore_1        
		return new zzg(zzahh, zzazd, zzazi, zzazf, zzazg, zzaiq, zzazh, zzbaj1);
	//   13   35:new             #206 <Class zzg>
	//   14   38:dup             
	//   15   39:aload_0         
	//   16   40:getfield        #296 <Field Account zzahh>
	//   17   43:aload_0         
	//   18   44:getfield        #57  <Field Set zzazd>
	//   19   47:aload_0         
	//   20   48:getfield        #64  <Field Map zzazi>
	//   21   51:aload_0         
	//   22   52:getfield        #389 <Field int zzazf>
	//   23   55:aload_0         
	//   24   56:getfield        #404 <Field View zzazg>
	//   25   59:aload_0         
	//   26   60:getfield        #108 <Field String zzaiq>
	//   27   63:aload_0         
	//   28   64:getfield        #119 <Field String zzazh>
	//   29   67:aload_1         
	//   30   68:invokespecial   #428 <Method void zzg(Account, Set, Map, int, View, String, String, zzbaj)>
	//   31   71:areturn         
	}

	private final Context mContext;
	private Account zzahh;
	private String zzaiq;
	private final Set zzazd;
	private final Set zzaze;
	private int zzazf;
	private View zzazg;
	private String zzazh;
	private final Map zzazi;
	private final Map zzazj;
	private zzabd zzazk;
	private int zzazl;
	private tionFailedListener zzazm;
	private GoogleApiAvailability zzazn;
	private Api.zza zzazo;
	private final ArrayList zzazp;
	private final ArrayList zzazq;
	private boolean zzazr;
	private Looper zzrs;

	public GoogleApiClient$Builder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		zzazd = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #54  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #55  <Method void HashSet()>
	//    6   12:putfield        #57  <Field Set zzazd>
		zzaze = ((Set) (new HashSet()));
	//    7   15:aload_0         
	//    8   16:new             #54  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #55  <Method void HashSet()>
	//   11   23:putfield        #59  <Field Set zzaze>
		zzazi = ((Map) (new ArrayMap()));
	//   12   26:aload_0         
	//   13   27:new             #61  <Class ArrayMap>
	//   14   30:dup             
	//   15   31:invokespecial   #62  <Method void ArrayMap()>
	//   16   34:putfield        #64  <Field Map zzazi>
		zzazj = ((Map) (new ArrayMap()));
	//   17   37:aload_0         
	//   18   38:new             #61  <Class ArrayMap>
	//   19   41:dup             
	//   20   42:invokespecial   #62  <Method void ArrayMap()>
	//   21   45:putfield        #66  <Field Map zzazj>
		zzazl = -1;
	//   22   48:aload_0         
	//   23   49:iconst_m1       
	//   24   50:putfield        #68  <Field int zzazl>
		zzazn = GoogleApiAvailability.getInstance();
	//   25   53:aload_0         
	//   26   54:invokestatic    #74  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   27   57:putfield        #76  <Field GoogleApiAvailability zzazn>
		zzazo = zzbah.zzaie;
	//   28   60:aload_0         
	//   29   61:getstatic       #81  <Field Api$zza zzbah.zzaie>
	//   30   64:putfield        #83  <Field Api$zza zzazo>
		zzazp = new ArrayList();
	//   31   67:aload_0         
	//   32   68:new             #85  <Class ArrayList>
	//   33   71:dup             
	//   34   72:invokespecial   #86  <Method void ArrayList()>
	//   35   75:putfield        #88  <Field ArrayList zzazp>
		zzazq = new ArrayList();
	//   36   78:aload_0         
	//   37   79:new             #85  <Class ArrayList>
	//   38   82:dup             
	//   39   83:invokespecial   #86  <Method void ArrayList()>
	//   40   86:putfield        #90  <Field ArrayList zzazq>
		zzazr = false;
	//   41   89:aload_0         
	//   42   90:iconst_0        
	//   43   91:putfield        #92  <Field boolean zzazr>
		mContext = context;
	//   44   94:aload_0         
	//   45   95:aload_1         
	//   46   96:putfield        #94  <Field Context mContext>
		zzrs = context.getMainLooper();
	//   47   99:aload_0         
	//   48  100:aload_1         
	//   49  101:invokevirtual   #100 <Method Looper Context.getMainLooper()>
	//   50  104:putfield        #102 <Field Looper zzrs>
		zzaiq = context.getPackageName();
	//   51  107:aload_0         
	//   52  108:aload_1         
	//   53  109:invokevirtual   #106 <Method String Context.getPackageName()>
	//   54  112:putfield        #108 <Field String zzaiq>
		zzazh = ((Object) (context)).getClass().getName();
	//   55  115:aload_0         
	//   56  116:aload_1         
	//   57  117:invokevirtual   #112 <Method Class Object.getClass()>
	//   58  120:invokevirtual   #117 <Method String Class.getName()>
	//   59  123:putfield        #119 <Field String zzazh>
	//   60  126:return          
	}

	public GoogleApiClient$Builder(Context context, onCallbacks oncallbacks, tionFailedListener tionfailedlistener)
	{
		this(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #124 <Method void GoogleApiClient$Builder(Context)>
		zzac.zzb(((Object) (oncallbacks)), "Must provide a connected listener");
	//    3    5:aload_2         
	//    4    6:ldc1            #126 <String "Must provide a connected listener">
	//    5    8:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//    6   11:pop             
		zzazp.add(((Object) (oncallbacks)));
	//    7   12:aload_0         
	//    8   13:getfield        #88  <Field ArrayList zzazp>
	//    9   16:aload_2         
	//   10   17:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//   11   20:pop             
		zzac.zzb(((Object) (tionfailedlistener)), "Must provide a connection failed listener");
	//   12   21:aload_3         
	//   13   22:ldc1            #138 <String "Must provide a connection failed listener">
	//   14   24:invokestatic    #132 <Method Object zzac.zzb(Object, Object)>
	//   15   27:pop             
		zzazq.add(((Object) (tionfailedlistener)));
	//   16   28:aload_0         
	//   17   29:getfield        #90  <Field ArrayList zzazq>
	//   18   32:aload_3         
	//   19   33:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//   20   36:pop             
	//   21   37:return          
	}
}
