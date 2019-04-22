// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.*;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzq, GoogleApiManager, zzaa, zzb, 
//			zzf, zzbv, RegisterListenerMethod, zzk, 
//			zzj, zzby, zzbi, zzh, 
//			zzbj, zzbk, zzg, zzbl

public final class GoogleApiManager$zza
	implements com.google.android.gms.common.api.ctionCallbacks, com.google.android.gms.common.api.nectionFailedListener, zzq
{

	static void zza(GoogleApiManager$zza googleapimanager$zza, GoogleApiManager$zzb googleapimanager$zzb)
	{
		googleapimanager$zza.zza(googleapimanager$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #139 <Method void zza(GoogleApiManager$zzb)>
	//    3    5:return          
	}

	private final void zza(GoogleApiManager$zzb googleapimanager$zzb)
	{
		if(!zzki.contains(((Object) (googleapimanager$zzb))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field List zzki>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #145 <Method boolean List.contains(Object)>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		if(!zzkh)
	//*   6   14:aload_0         
	//*   7   15:getfield        #147 <Field boolean zzkh>
	//*   8   18:ifne            42
		{
			if(!zzka.isConnected())
	//*   9   21:aload_0         
	//*  10   22:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//*  11   25:invokeinterface #150 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//*  12   30:ifne            38
			{
				connect();
	//   13   33:aload_0         
	//   14   34:invokevirtual   #153 <Method void connect()>
				return;
	//   15   37:return          
			}
			zzbl();
	//   16   38:aload_0         
	//   17   39:invokespecial   #156 <Method void zzbl()>
		}
	//   18   42:return          
	}

	static boolean zza(GoogleApiManager$zza googleapimanager$zza, boolean flag)
	{
		return googleapimanager$zza.zzb(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #160 <Method boolean zzb(boolean)>
	//    3    5:ireturn         
	}

	static void zzb(GoogleApiManager$zza googleapimanager$zza, GoogleApiManager$zzb googleapimanager$zzb)
	{
		googleapimanager$zza.zzb(googleapimanager$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #162 <Method void zzb(GoogleApiManager$zzb)>
	//    3    5:return          
	}

	private final void zzb(GoogleApiManager$zzb googleapimanager$zzb)
	{
		if(zzki.remove(((Object) (googleapimanager$zzb))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field List zzki>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #165 <Method boolean List.remove(Object)>
	//*   4   10:ifeq            205
		{
			GoogleApiManager.zza(zzjy).removeMessages(15, ((Object) (googleapimanager$zzb)));
	//    5   13:aload_0         
	//    6   14:getfield        #50  <Field GoogleApiManager zzjy>
	//    7   17:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    8   20:bipush          15
	//    9   22:aload_1         
	//   10   23:invokevirtual   #169 <Method void Handler.removeMessages(int, Object)>
			GoogleApiManager.zza(zzjy).removeMessages(16, ((Object) (googleapimanager$zzb)));
	//   11   26:aload_0         
	//   12   27:getfield        #50  <Field GoogleApiManager zzjy>
	//   13   30:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   14   33:bipush          16
	//   15   35:aload_1         
	//   16   36:invokevirtual   #169 <Method void Handler.removeMessages(int, Object)>
			googleapimanager$zzb = ((GoogleApiManager$zzb) (GoogleApiManager$zzb.zzd(googleapimanager$zzb)));
	//   17   39:aload_1         
	//   18   40:invokestatic    #175 <Method Feature GoogleApiManager$zzb.zzd(GoogleApiManager$zzb)>
	//   19   43:astore_1        
			ArrayList arraylist = new ArrayList(zzjz.size());
	//   20   44:new             #70  <Class ArrayList>
	//   21   47:dup             
	//   22   48:aload_0         
	//   23   49:getfield        #58  <Field Queue zzjz>
	//   24   52:invokeinterface #180 <Method int Queue.size()>
	//   25   57:invokespecial   #183 <Method void ArrayList(int)>
	//   26   60:astore          4
			Iterator iterator = zzjz.iterator();
	//   27   62:aload_0         
	//   28   63:getfield        #58  <Field Queue zzjz>
	//   29   66:invokeinterface #187 <Method Iterator Queue.iterator()>
	//   30   71:astore          5
			do
			{
				if(!iterator.hasNext())
					break;
	//   31   73:aload           5
	//   32   75:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//   33   80:ifeq            138
				zzb zzb1 = (zzb)iterator.next();
	//   34   83:aload           5
	//   35   85:invokeinterface #196 <Method Object Iterator.next()>
	//   36   90:checkcast       #198 <Class zzb>
	//   37   93:astore          6
				if(zzb1 instanceof zzf)
	//*  38   95:aload           6
	//*  39   97:instanceof      #200 <Class zzf>
	//*  40  100:ifeq            73
				{
					Feature afeature[] = ((zzf)zzb1).getRequiredFeatures();
	//   41  103:aload           6
	//   42  105:checkcast       #200 <Class zzf>
	//   43  108:invokevirtual   #204 <Method Feature[] zzf.getRequiredFeatures()>
	//   44  111:astore          7
					if(afeature != null && ArrayUtils.contains(((Object []) (afeature)), ((Object) (googleapimanager$zzb))))
	//*  45  113:aload           7
	//*  46  115:ifnull          73
	//*  47  118:aload           7
	//*  48  120:aload_1         
	//*  49  121:invokestatic    #209 <Method boolean ArrayUtils.contains(Object[], Object)>
	//*  50  124:ifeq            73
						arraylist.add(((Object) (zzb1)));
	//   51  127:aload           4
	//   52  129:aload           6
	//   53  131:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
	//   54  134:pop             
				}
			} while(true);
	//   55  135:goto            73
			arraylist = (ArrayList)arraylist;
	//   56  138:aload           4
	//   57  140:checkcast       #70  <Class ArrayList>
	//   58  143:astore          4
			int j = arraylist.size();
	//   59  145:aload           4
	//   60  147:invokevirtual   #213 <Method int ArrayList.size()>
	//   61  150:istore_3        
			for(int i = 0; i < j;)
	//*  62  151:iconst_0        
	//*  63  152:istore_2        
	//*  64  153:iload_2         
	//*  65  154:iload_3         
	//*  66  155:icmpge          205
			{
				Object obj = arraylist.get(i);
	//   67  158:aload           4
	//   68  160:iload_2         
	//   69  161:invokevirtual   #217 <Method Object ArrayList.get(int)>
	//   70  164:astore          5
				i++;
	//   71  166:iload_2         
	//   72  167:iconst_1        
	//   73  168:iadd            
	//   74  169:istore_2        
				obj = ((Object) ((zzb)obj));
	//   75  170:aload           5
	//   76  172:checkcast       #198 <Class zzb>
	//   77  175:astore          5
				zzjz.remove(obj);
	//   78  177:aload_0         
	//   79  178:getfield        #58  <Field Queue zzjz>
	//   80  181:aload           5
	//   81  183:invokeinterface #218 <Method boolean Queue.remove(Object)>
	//   82  188:pop             
				((zzb) (obj)).zza(((RuntimeException) (new UnsupportedApiCallException(((Feature) (googleapimanager$zzb))))));
	//   83  189:aload           5
	//   84  191:new             #220 <Class UnsupportedApiCallException>
	//   85  194:dup             
	//   86  195:aload_1         
	//   87  196:invokespecial   #223 <Method void UnsupportedApiCallException(Feature)>
	//   88  199:invokevirtual   #226 <Method void zzb.zza(RuntimeException)>
			}

		}
	//*  89  202:goto            153
	//   90  205:return          
	}

	private final boolean zzb(zzb zzb1)
	{
		if(!(zzb1 instanceof zzf))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #200 <Class zzf>
	//*   2    4:ifne            14
		{
			zzc(zzb1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #231 <Method void zzc(zzb)>
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		}
		zzf zzf1 = (zzf)zzb1;
	//    8   14:aload_1         
	//    9   15:checkcast       #200 <Class zzf>
	//   10   18:astore          6
		Feature afeature2[] = zzf1.getRequiredFeatures();
	//   11   20:aload           6
	//   12   22:invokevirtual   #204 <Method Feature[] zzf.getRequiredFeatures()>
	//   13   25:astore          7
		if(afeature2 != null && afeature2.length != 0)
	//*  14   27:aload           7
	//*  15   29:ifnull          444
	//*  16   32:aload           7
	//*  17   34:arraylength     
	//*  18   35:ifne            41
	//*  19   38:goto            444
		{
			Feature afeature1[] = zzka.getAvailableFeatures();
	//   20   41:aload_0         
	//   21   42:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   22   45:invokeinterface #234 <Method Feature[] com.google.android.gms.common.api.Api$Client.getAvailableFeatures()>
	//   23   50:astore          5
			Feature afeature[] = afeature1;
	//   24   52:aload           5
	//   25   54:astore          4
			if(afeature1 == null)
	//*  26   56:aload           5
	//*  27   58:ifnonnull       67
				afeature = new Feature[0];
	//   28   61:iconst_0        
	//   29   62:anewarray       Feature[]
	//   30   65:astore          4
			ArrayMap arraymap = new ArrayMap(afeature.length);
	//   31   67:new             #238 <Class ArrayMap>
	//   32   70:dup             
	//   33   71:aload           4
	//   34   73:arraylength     
	//   35   74:invokespecial   #239 <Method void ArrayMap(int)>
	//   36   77:astore          5
			int l = afeature.length;
	//   37   79:aload           4
	//   38   81:arraylength     
	//   39   82:istore_3        
			for(int i = 0; i < l; i++)
	//*  40   83:iconst_0        
	//*  41   84:istore_2        
	//*  42   85:iload_2         
	//*  43   86:iload_3         
	//*  44   87:icmpge          124
			{
				Feature feature1 = afeature[i];
	//   45   90:aload           4
	//   46   92:iload_2         
	//   47   93:aaload          
	//   48   94:astore          8
				((Map) (arraymap)).put(((Object) (feature1.getName())), ((Object) (Long.valueOf(feature1.getVersion()))));
	//   49   96:aload           5
	//   50   98:aload           8
	//   51  100:invokevirtual   #243 <Method String Feature.getName()>
	//   52  103:aload           8
	//   53  105:invokevirtual   #247 <Method long Feature.getVersion()>
	//   54  108:invokestatic    #253 <Method Long Long.valueOf(long)>
	//   55  111:invokeinterface #259 <Method Object Map.put(Object, Object)>
	//   56  116:pop             
			}

	//   57  117:iload_2         
	//   58  118:iconst_1        
	//   59  119:iadd            
	//   60  120:istore_2        
	//*  61  121:goto            85
			l = afeature2.length;
	//   62  124:aload           7
	//   63  126:arraylength     
	//   64  127:istore_3        
			for(int j = 0; j < l;)
	//*  65  128:iconst_0        
	//*  66  129:istore_2        
	//*  67  130:iload_2         
	//*  68  131:iload_3         
	//*  69  132:icmpge          437
			{
				Feature feature = afeature2[j];
	//   70  135:aload           7
	//   71  137:iload_2         
	//   72  138:aaload          
	//   73  139:astore          4
				if(((Map) (arraymap)).containsKey(((Object) (feature.getName()))) && ((Long)((Map) (arraymap)).get(((Object) (feature.getName())))).longValue() >= feature.getVersion())
	//*  74  141:aload           5
	//*  75  143:aload           4
	//*  76  145:invokevirtual   #243 <Method String Feature.getName()>
	//*  77  148:invokeinterface #262 <Method boolean Map.containsKey(Object)>
	//*  78  153:ifeq            217
	//*  79  156:aload           5
	//*  80  158:aload           4
	//*  81  160:invokevirtual   #243 <Method String Feature.getName()>
	//*  82  163:invokeinterface #265 <Method Object Map.get(Object)>
	//*  83  168:checkcast       #249 <Class Long>
	//*  84  171:invokevirtual   #268 <Method long Long.longValue()>
	//*  85  174:aload           4
	//*  86  176:invokevirtual   #247 <Method long Feature.getVersion()>
	//*  87  179:lcmp            
	//*  88  180:ifge            186
	//*  89  183:goto            217
				{
					zzki.remove(((Object) (new GoogleApiManager$zzb(zzhc, feature, ((zzbh) (null))))));
	//   90  186:aload_0         
	//   91  187:getfield        #73  <Field List zzki>
	//   92  190:new             #171 <Class GoogleApiManager$zzb>
	//   93  193:dup             
	//   94  194:aload_0         
	//   95  195:getfield        #105 <Field zzh zzhc>
	//   96  198:aload           4
	//   97  200:aconst_null     
	//   98  201:invokespecial   #271 <Method void GoogleApiManager$zzb(zzh, Feature, zzbh)>
	//   99  204:invokeinterface #165 <Method boolean List.remove(Object)>
	//  100  209:pop             
					j++;
	//  101  210:iload_2         
	//  102  211:iconst_1        
	//  103  212:iadd            
	//  104  213:istore_2        
				} else
	//* 105  214:goto            130
				{
					if(zzf1.shouldAutoResolveMissingFeatures())
	//* 106  217:aload           6
	//* 107  219:invokevirtual   #274 <Method boolean zzf.shouldAutoResolveMissingFeatures()>
	//* 108  222:ifeq            421
					{
						zzb1 = ((zzb) (new GoogleApiManager$zzb(zzhc, feature, ((zzbh) (null)))));
	//  109  225:new             #171 <Class GoogleApiManager$zzb>
	//  110  228:dup             
	//  111  229:aload_0         
	//  112  230:getfield        #105 <Field zzh zzhc>
	//  113  233:aload           4
	//  114  235:aconst_null     
	//  115  236:invokespecial   #271 <Method void GoogleApiManager$zzb(zzh, Feature, zzbh)>
	//  116  239:astore_1        
						int k = zzki.indexOf(((Object) (zzb1)));
	//  117  240:aload_0         
	//  118  241:getfield        #73  <Field List zzki>
	//  119  244:aload_1         
	//  120  245:invokeinterface #278 <Method int List.indexOf(Object)>
	//  121  250:istore_2        
						if(k >= 0)
	//* 122  251:iload_2         
	//* 123  252:iflt            315
						{
							zzb1 = ((zzb) ((GoogleApiManager$zzb)zzki.get(k)));
	//  124  255:aload_0         
	//  125  256:getfield        #73  <Field List zzki>
	//  126  259:iload_2         
	//  127  260:invokeinterface #279 <Method Object List.get(int)>
	//  128  265:checkcast       #171 <Class GoogleApiManager$zzb>
	//  129  268:astore_1        
							GoogleApiManager.zza(zzjy).removeMessages(15, ((Object) (zzb1)));
	//  130  269:aload_0         
	//  131  270:getfield        #50  <Field GoogleApiManager zzjy>
	//  132  273:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//  133  276:bipush          15
	//  134  278:aload_1         
	//  135  279:invokevirtual   #169 <Method void Handler.removeMessages(int, Object)>
							GoogleApiManager.zza(zzjy).sendMessageDelayed(Message.obtain(GoogleApiManager.zza(zzjy), 15, ((Object) (zzb1))), GoogleApiManager.zzc(zzjy));
	//  136  282:aload_0         
	//  137  283:getfield        #50  <Field GoogleApiManager zzjy>
	//  138  286:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//  139  289:aload_0         
	//  140  290:getfield        #50  <Field GoogleApiManager zzjy>
	//  141  293:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//  142  296:bipush          15
	//  143  298:aload_1         
	//  144  299:invokestatic    #285 <Method Message Message.obtain(Handler, int, Object)>
	//  145  302:aload_0         
	//  146  303:getfield        #50  <Field GoogleApiManager zzjy>
	//  147  306:invokestatic    #288 <Method long GoogleApiManager.zzc(GoogleApiManager)>
	//  148  309:invokevirtual   #292 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//  149  312:pop             
							return false;
	//  150  313:iconst_0        
	//  151  314:ireturn         
						}
						zzki.add(((Object) (zzb1)));
	//  152  315:aload_0         
	//  153  316:getfield        #73  <Field List zzki>
	//  154  319:aload_1         
	//  155  320:invokeinterface #293 <Method boolean List.add(Object)>
	//  156  325:pop             
						GoogleApiManager.zza(zzjy).sendMessageDelayed(Message.obtain(GoogleApiManager.zza(zzjy), 15, ((Object) (zzb1))), GoogleApiManager.zzc(zzjy));
	//  157  326:aload_0         
	//  158  327:getfield        #50  <Field GoogleApiManager zzjy>
	//  159  330:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//  160  333:aload_0         
	//  161  334:getfield        #50  <Field GoogleApiManager zzjy>
	//  162  337:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//  163  340:bipush          15
	//  164  342:aload_1         
	//  165  343:invokestatic    #285 <Method Message Message.obtain(Handler, int, Object)>
	//  166  346:aload_0         
	//  167  347:getfield        #50  <Field GoogleApiManager zzjy>
	//  168  350:invokestatic    #288 <Method long GoogleApiManager.zzc(GoogleApiManager)>
	//  169  353:invokevirtual   #292 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//  170  356:pop             
						GoogleApiManager.zza(zzjy).sendMessageDelayed(Message.obtain(GoogleApiManager.zza(zzjy), 16, ((Object) (zzb1))), GoogleApiManager.zzd(zzjy));
	//  171  357:aload_0         
	//  172  358:getfield        #50  <Field GoogleApiManager zzjy>
	//  173  361:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//  174  364:aload_0         
	//  175  365:getfield        #50  <Field GoogleApiManager zzjy>
	//  176  368:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//  177  371:bipush          16
	//  178  373:aload_1         
	//  179  374:invokestatic    #285 <Method Message Message.obtain(Handler, int, Object)>
	//  180  377:aload_0         
	//  181  378:getfield        #50  <Field GoogleApiManager zzjy>
	//  182  381:invokestatic    #295 <Method long GoogleApiManager.zzd(GoogleApiManager)>
	//  183  384:invokevirtual   #292 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//  184  387:pop             
						zzb1 = ((zzb) (new ConnectionResult(2, ((android.app.PendingIntent) (null)))));
	//  185  388:new             #297 <Class ConnectionResult>
	//  186  391:dup             
	//  187  392:iconst_2        
	//  188  393:aconst_null     
	//  189  394:invokespecial   #300 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//  190  397:astore_1        
						if(!zzh(((ConnectionResult) (zzb1))))
	//* 191  398:aload_0         
	//* 192  399:aload_1         
	//* 193  400:invokespecial   #304 <Method boolean zzh(ConnectionResult)>
	//* 194  403:ifne            435
						{
							zzjy.zzc(((ConnectionResult) (zzb1)), zzkf);
	//  195  406:aload_0         
	//  196  407:getfield        #50  <Field GoogleApiManager zzjy>
	//  197  410:aload_1         
	//  198  411:aload_0         
	//  199  412:getfield        #116 <Field int zzkf>
	//  200  415:invokevirtual   #307 <Method boolean GoogleApiManager.zzc(ConnectionResult, int)>
	//  201  418:pop             
							return false;
	//  202  419:iconst_0        
	//  203  420:ireturn         
						}
					} else
					{
						((zzb) (zzf1)).zza(((RuntimeException) (new UnsupportedApiCallException(feature))));
	//  204  421:aload           6
	//  205  423:new             #220 <Class UnsupportedApiCallException>
	//  206  426:dup             
	//  207  427:aload           4
	//  208  429:invokespecial   #223 <Method void UnsupportedApiCallException(Feature)>
	//  209  432:invokevirtual   #226 <Method void zzb.zza(RuntimeException)>
					}
					return false;
	//  210  435:iconst_0        
	//  211  436:ireturn         
				}
			}

			zzc(zzb1);
	//  212  437:aload_0         
	//  213  438:aload_1         
	//  214  439:invokespecial   #231 <Method void zzc(zzb)>
			return true;
	//  215  442:iconst_1        
	//  216  443:ireturn         
		} else
		{
			zzc(zzb1);
	//  217  444:aload_0         
	//  218  445:aload_1         
	//  219  446:invokespecial   #231 <Method void zzc(zzb)>
			return true;
	//  220  449:iconst_1        
	//  221  450:ireturn         
		}
	}

	private final boolean zzb(boolean flag)
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		if(zzka.isConnected() && zzke.size() == 0)
	//*   4   10:aload_0         
	//*   5   11:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//*   6   14:invokeinterface #150 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//*   7   19:ifeq            65
	//*   8   22:aload_0         
	//*   9   23:getfield        #68  <Field Map zzke>
	//*  10   26:invokeinterface #314 <Method int Map.size()>
	//*  11   31:ifne            65
		{
			if(zzkc.zzaj())
	//*  12   34:aload_0         
	//*  13   35:getfield        #110 <Field zzaa zzkc>
	//*  14   38:invokevirtual   #317 <Method boolean zzaa.zzaj()>
	//*  15   41:ifeq            54
			{
				if(flag)
	//*  16   44:iload_1         
	//*  17   45:ifeq            52
					zzbr();
	//   18   48:aload_0         
	//   19   49:invokespecial   #320 <Method void zzbr()>
				return false;
	//   20   52:iconst_0        
	//   21   53:ireturn         
			} else
			{
				zzka.disconnect();
	//   22   54:aload_0         
	//   23   55:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   24   58:invokeinterface #323 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
				return true;
	//   25   63:iconst_1        
	//   26   64:ireturn         
			}
		} else
		{
			return false;
	//   27   65:iconst_0        
	//   28   66:ireturn         
		}
	}

	private final void zzbj()
	{
		Iterator iterator;
		zzbo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #331 <Method void zzbo()>
		zzi(ConnectionResult.RESULT_SUCCESS);
	//    2    4:aload_0         
	//    3    5:getstatic       #334 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//    4    8:invokespecial   #338 <Method void zzi(ConnectionResult)>
		zzbq();
	//    5   11:aload_0         
	//    6   12:invokespecial   #341 <Method void zzbq()>
		iterator = zzke.values().iterator();
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field Map zzke>
	//    9   19:invokeinterface #345 <Method Collection Map.values()>
	//   10   24:invokeinterface #348 <Method Iterator Collection.iterator()>
	//   11   29:astore_1        
_L6:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   12   30:aload_1         
	//   13   31:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//   14   36:ifeq            87
_L1:
		zzbv zzbv1 = (zzbv)iterator.next();
	//   15   39:aload_1         
	//   16   40:invokeinterface #196 <Method Object Iterator.next()>
	//   17   45:checkcast       #350 <Class zzbv>
	//   18   48:astore_2        
		zzbv1.zzlt.registerListener(zzkb, new TaskCompletionSource());
	//   19   49:aload_2         
	//   20   50:getfield        #354 <Field RegisterListenerMethod zzbv.zzlt>
	//   21   53:aload_0         
	//   22   54:getfield        #99  <Field com.google.android.gms.common.api.Api$AnyClient zzkb>
	//   23   57:new             #356 <Class TaskCompletionSource>
	//   24   60:dup             
	//   25   61:invokespecial   #357 <Method void TaskCompletionSource()>
	//   26   64:invokevirtual   #363 <Method void RegisterListenerMethod.registerListener(com.google.android.gms.common.api.Api$AnyClient, TaskCompletionSource)>
		continue; /* Loop/switch isn't completed */
	//   27   67:goto            30
	//*  28   70:goto            30
_L4:
		onConnectionSuspended(1);
	//   29   73:aload_0         
	//   30   74:iconst_1        
	//   31   75:invokevirtual   #366 <Method void onConnectionSuspended(int)>
		zzka.disconnect();
	//   32   78:aload_0         
	//   33   79:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   34   82:invokeinterface #323 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
_L2:
		zzbl();
	//   35   87:aload_0         
	//   36   88:invokespecial   #156 <Method void zzbl()>
		zzbr();
	//   37   91:aload_0         
	//   38   92:invokespecial   #320 <Method void zzbr()>
		return;
	//   39   95:return          
		DeadObjectException deadobjectexception;
		deadobjectexception;
	//   40   96:astore_1        
		if(true) goto _L4; else goto _L3
	//   41   97:goto            73
_L3:
		RemoteException remoteexception;
		remoteexception;
	//   42  100:astore_2        
		if(true) goto _L6; else goto _L5
_L5:
	//*  43  101:goto            70
	}

	private final void zzbk()
	{
		zzbo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #331 <Method void zzbo()>
		zzkh = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #147 <Field boolean zzkh>
		zzkc.zzal();
	//    5    9:aload_0         
	//    6   10:getfield        #110 <Field zzaa zzkc>
	//    7   13:invokevirtual   #370 <Method void zzaa.zzal()>
		GoogleApiManager.zza(zzjy).sendMessageDelayed(Message.obtain(GoogleApiManager.zza(zzjy), 9, ((Object) (zzhc))), GoogleApiManager.zzc(zzjy));
	//    8   16:aload_0         
	//    9   17:getfield        #50  <Field GoogleApiManager zzjy>
	//   10   20:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   11   23:aload_0         
	//   12   24:getfield        #50  <Field GoogleApiManager zzjy>
	//   13   27:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   14   30:bipush          9
	//   15   32:aload_0         
	//   16   33:getfield        #105 <Field zzh zzhc>
	//   17   36:invokestatic    #285 <Method Message Message.obtain(Handler, int, Object)>
	//   18   39:aload_0         
	//   19   40:getfield        #50  <Field GoogleApiManager zzjy>
	//   20   43:invokestatic    #288 <Method long GoogleApiManager.zzc(GoogleApiManager)>
	//   21   46:invokevirtual   #292 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   22   49:pop             
		GoogleApiManager.zza(zzjy).sendMessageDelayed(Message.obtain(GoogleApiManager.zza(zzjy), 11, ((Object) (zzhc))), GoogleApiManager.zzd(zzjy));
	//   23   50:aload_0         
	//   24   51:getfield        #50  <Field GoogleApiManager zzjy>
	//   25   54:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   26   57:aload_0         
	//   27   58:getfield        #50  <Field GoogleApiManager zzjy>
	//   28   61:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   29   64:bipush          11
	//   30   66:aload_0         
	//   31   67:getfield        #105 <Field zzh zzhc>
	//   32   70:invokestatic    #285 <Method Message Message.obtain(Handler, int, Object)>
	//   33   73:aload_0         
	//   34   74:getfield        #50  <Field GoogleApiManager zzjy>
	//   35   77:invokestatic    #295 <Method long GoogleApiManager.zzd(GoogleApiManager)>
	//   36   80:invokevirtual   #292 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   37   83:pop             
		GoogleApiManager.zze(zzjy).flush();
	//   38   84:aload_0         
	//   39   85:getfield        #50  <Field GoogleApiManager zzjy>
	//   40   88:invokestatic    #374 <Method GoogleApiAvailabilityCache GoogleApiManager.zze(GoogleApiManager)>
	//   41   91:invokevirtual   #379 <Method void GoogleApiAvailabilityCache.flush()>
	//   42   94:return          
	}

	private final void zzbl()
	{
		ArrayList arraylist = (ArrayList)new ArrayList(((Collection) (zzjz)));
	//    0    0:new             #70  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #58  <Field Queue zzjz>
	//    4    8:invokespecial   #382 <Method void ArrayList(Collection)>
	//    5   11:checkcast       #70  <Class ArrayList>
	//    6   14:astore          4
		int k = arraylist.size();
	//    7   16:aload           4
	//    8   18:invokevirtual   #213 <Method int ArrayList.size()>
	//    9   21:istore_3        
		int i = 0;
	//   10   22:iconst_0        
	//   11   23:istore_1        
		do
		{
			if(i >= k)
				break;
	//   12   24:iload_1         
	//   13   25:iload_3         
	//   14   26:icmpge          88
			Object obj = arraylist.get(i);
	//   15   29:aload           4
	//   16   31:iload_1         
	//   17   32:invokevirtual   #217 <Method Object ArrayList.get(int)>
	//   18   35:astore          5
			int j = i + 1;
	//   19   37:iload_1         
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:istore_2        
			obj = ((Object) ((zzb)obj));
	//   23   41:aload           5
	//   24   43:checkcast       #198 <Class zzb>
	//   25   46:astore          5
			if(!zzka.isConnected())
				break;
	//   26   48:aload_0         
	//   27   49:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   28   52:invokeinterface #150 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//   29   57:ifeq            88
			i = j;
	//   30   60:iload_2         
	//   31   61:istore_1        
			if(zzb(((zzb) (obj))))
	//*  32   62:aload_0         
	//*  33   63:aload           5
	//*  34   65:invokespecial   #384 <Method boolean zzb(zzb)>
	//*  35   68:ifeq            24
			{
				zzjz.remove(obj);
	//   36   71:aload_0         
	//   37   72:getfield        #58  <Field Queue zzjz>
	//   38   75:aload           5
	//   39   77:invokeinterface #218 <Method boolean Queue.remove(Object)>
	//   40   82:pop             
				i = j;
	//   41   83:iload_2         
	//   42   84:istore_1        
			}
		} while(true);
	//   43   85:goto            24
	//   44   88:return          
	}

	private final void zzbq()
	{
		if(zzkh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field boolean zzkh>
	//*   2    4:ifeq            44
		{
			GoogleApiManager.zza(zzjy).removeMessages(11, ((Object) (zzhc)));
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field GoogleApiManager zzjy>
	//    5   11:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    6   14:bipush          11
	//    7   16:aload_0         
	//    8   17:getfield        #105 <Field zzh zzhc>
	//    9   20:invokevirtual   #169 <Method void Handler.removeMessages(int, Object)>
			GoogleApiManager.zza(zzjy).removeMessages(9, ((Object) (zzhc)));
	//   10   23:aload_0         
	//   11   24:getfield        #50  <Field GoogleApiManager zzjy>
	//   12   27:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   13   30:bipush          9
	//   14   32:aload_0         
	//   15   33:getfield        #105 <Field zzh zzhc>
	//   16   36:invokevirtual   #169 <Method void Handler.removeMessages(int, Object)>
			zzkh = false;
	//   17   39:aload_0         
	//   18   40:iconst_0        
	//   19   41:putfield        #147 <Field boolean zzkh>
		}
	//   20   44:return          
	}

	private final void zzbr()
	{
		GoogleApiManager.zza(zzjy).removeMessages(12, ((Object) (zzhc)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:bipush          12
	//    4    9:aload_0         
	//    5   10:getfield        #105 <Field zzh zzhc>
	//    6   13:invokevirtual   #169 <Method void Handler.removeMessages(int, Object)>
		GoogleApiManager.zza(zzjy).sendMessageDelayed(GoogleApiManager.zza(zzjy).obtainMessage(12, ((Object) (zzhc))), GoogleApiManager.zzi(zzjy));
	//    7   16:aload_0         
	//    8   17:getfield        #50  <Field GoogleApiManager zzjy>
	//    9   20:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   10   23:aload_0         
	//   11   24:getfield        #50  <Field GoogleApiManager zzjy>
	//   12   27:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   13   30:bipush          12
	//   14   32:aload_0         
	//   15   33:getfield        #105 <Field zzh zzhc>
	//   16   36:invokevirtual   #388 <Method Message Handler.obtainMessage(int, Object)>
	//   17   39:aload_0         
	//   18   40:getfield        #50  <Field GoogleApiManager zzjy>
	//   19   43:invokestatic    #390 <Method long GoogleApiManager.zzi(GoogleApiManager)>
	//   20   46:invokevirtual   #292 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   21   49:pop             
	//   22   50:return          
	}

	static void zzc(GoogleApiManager$zza googleapimanager$zza)
	{
		googleapimanager$zza.zzbj();
	//    0    0:aload_0         
	//    1    1:invokespecial   #393 <Method void zzbj()>
	//    2    4:return          
	}

	private final void zzc(zzb zzb1)
	{
		zzb1.zza(zzkc, requiresSignIn());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #110 <Field zzaa zzkc>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #394 <Method boolean requiresSignIn()>
	//    5    9:invokevirtual   #397 <Method void zzb.zza(zzaa, boolean)>
		try
		{
			zzb1.zza(this);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #399 <Method void zzb.zza(GoogleApiManager$zza)>
			return;
	//    9   17:return          
		}
	//*  10   18:aload_0         
	//*  11   19:iconst_1        
	//*  12   20:invokevirtual   #366 <Method void onConnectionSuspended(int)>
	//*  13   23:aload_0         
	//*  14   24:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//*  15   27:invokeinterface #323 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
	//*  16   32:return          
		// Misplaced declaration of an exception variable
		catch(zzb zzb1)
		{
			onConnectionSuspended(1);
		}
		zzka.disconnect();
	//*  17   33:astore_1        
	//*  18   34:goto            18
	}

	static void zzd(GoogleApiManager$zza googleapimanager$zza)
	{
		googleapimanager$zza.zzbk();
	//    0    0:aload_0         
	//    1    1:invokespecial   #401 <Method void zzbk()>
	//    2    4:return          
	}

	static com.google.android.gms.common.api.Api.Client zze(GoogleApiManager$zza googleapimanager$zza)
	{
		return googleapimanager$zza.zzka;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//    2    4:areturn         
	}

	private final boolean zzh(ConnectionResult connectionresult)
	{
		Object obj = GoogleApiManager.zzbh();
	//    0    0:invokestatic    #406 <Method Object GoogleApiManager.zzbh()>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(GoogleApiManager.zzf(zzjy) == null || !GoogleApiManager.zzg(zzjy).contains(((Object) (zzhc))))
			break MISSING_BLOCK_LABEL_54;
	//    4    6:aload_0         
	//    5    7:getfield        #50  <Field GoogleApiManager zzjy>
	//    6   10:invokestatic    #410 <Method zzad GoogleApiManager.zzf(GoogleApiManager)>
	//    7   13:ifnull          54
	//    8   16:aload_0         
	//    9   17:getfield        #50  <Field GoogleApiManager zzjy>
	//   10   20:invokestatic    #414 <Method Set GoogleApiManager.zzg(GoogleApiManager)>
	//   11   23:aload_0         
	//   12   24:getfield        #105 <Field zzh zzhc>
	//   13   27:invokeinterface #417 <Method boolean Set.contains(Object)>
	//   14   32:ifeq            54
		((zzk) (GoogleApiManager.zzf(zzjy))).zzb(connectionresult, zzkf);
	//   15   35:aload_0         
	//   16   36:getfield        #50  <Field GoogleApiManager zzjy>
	//   17   39:invokestatic    #410 <Method zzad GoogleApiManager.zzf(GoogleApiManager)>
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:getfield        #116 <Field int zzkf>
	//   21   47:invokevirtual   #422 <Method void zzk.zzb(ConnectionResult, int)>
	//*  22   50:aload_2         
	//*  23   51:monitorexit     
		return true;
	//   24   52:iconst_1        
	//   25   53:ireturn         
		obj;
	//   26   54:aload_2         
		JVM INSTR monitorexit ;
	//   27   55:monitorexit     
		return false;
	//   28   56:iconst_0        
	//   29   57:ireturn         
		connectionresult;
	//   30   58:astore_1        
		obj;
	//   31   59:aload_2         
		JVM INSTR monitorexit ;
	//   32   60:monitorexit     
		throw connectionresult;
	//   33   61:aload_1         
	//   34   62:athrow          
	}

	private final void zzi(ConnectionResult connectionresult)
	{
		String s;
		zzj zzj1;
		for(Iterator iterator = zzkd.iterator(); iterator.hasNext(); zzj1.zza(zzhc, connectionresult, s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field Set zzkd>
	//*   2    4:invokeinterface #424 <Method Iterator Set.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            66
		{
			zzj1 = (zzj)iterator.next();
	//    7   19:aload_3         
	//    8   20:invokeinterface #196 <Method Object Iterator.next()>
	//    9   25:checkcast       #426 <Class zzj>
	//   10   28:astore          4
			s = null;
	//   11   30:aconst_null     
	//   12   31:astore_2        
			if(Objects.equal(((Object) (connectionresult)), ((Object) (ConnectionResult.RESULT_SUCCESS))))
	//*  13   32:aload_1         
	//*  14   33:getstatic       #334 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//*  15   36:invokestatic    #432 <Method boolean Objects.equal(Object, Object)>
	//*  16   39:ifeq            52
				s = zzka.getEndpointPackageName();
	//   17   42:aload_0         
	//   18   43:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   19   46:invokeinterface #435 <Method String com.google.android.gms.common.api.Api$Client.getEndpointPackageName()>
	//   20   51:astore_2        
		}

	//   21   52:aload           4
	//   22   54:aload_0         
	//   23   55:getfield        #105 <Field zzh zzhc>
	//   24   58:aload_1         
	//   25   59:aload_2         
	//   26   60:invokevirtual   #438 <Method void zzj.zza(zzh, ConnectionResult, String)>
	//*  27   63:goto            10
		zzkd.clear();
	//   28   66:aload_0         
	//   29   67:getfield        #63  <Field Set zzkd>
	//   30   70:invokeinterface #441 <Method void Set.clear()>
	//   31   75:return          
	}

	public final void connect()
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		if(!zzka.isConnected())
	//*   4   10:aload_0         
	//*   5   11:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//*   6   14:invokeinterface #150 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//*   7   19:ifne            125
		{
			if(zzka.isConnecting())
	//*   8   22:aload_0         
	//*   9   23:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//*  10   26:invokeinterface #444 <Method boolean com.google.android.gms.common.api.Api$Client.isConnecting()>
	//*  11   31:ifeq            35
				return;
	//   12   34:return          
			int i = GoogleApiManager.zze(zzjy).getClientAvailability(GoogleApiManager.zzb(zzjy), zzka);
	//   13   35:aload_0         
	//   14   36:getfield        #50  <Field GoogleApiManager zzjy>
	//   15   39:invokestatic    #374 <Method GoogleApiAvailabilityCache GoogleApiManager.zze(GoogleApiManager)>
	//   16   42:aload_0         
	//   17   43:getfield        #50  <Field GoogleApiManager zzjy>
	//   18   46:invokestatic    #126 <Method android.content.Context GoogleApiManager.zzb(GoogleApiManager)>
	//   19   49:aload_0         
	//   20   50:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   21   53:invokevirtual   #448 <Method int GoogleApiAvailabilityCache.getClientAvailability(android.content.Context, com.google.android.gms.common.api.Api$Client)>
	//   22   56:istore_1        
			if(i != 0)
	//*  23   57:iload_1         
	//*  24   58:ifeq            75
			{
				onConnectionFailed(new ConnectionResult(i, ((android.app.PendingIntent) (null))));
	//   25   61:aload_0         
	//   26   62:new             #297 <Class ConnectionResult>
	//   27   65:dup             
	//   28   66:iload_1         
	//   29   67:aconst_null     
	//   30   68:invokespecial   #300 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   31   71:invokevirtual   #451 <Method void onConnectionFailed(ConnectionResult)>
				return;
	//   32   74:return          
			}
			GoogleApiManager$zzc googleapimanager$zzc = new GoogleApiManager$zzc(zzjy, zzka, zzhc);
	//   33   75:new             #453 <Class GoogleApiManager$zzc>
	//   34   78:dup             
	//   35   79:aload_0         
	//   36   80:getfield        #50  <Field GoogleApiManager zzjy>
	//   37   83:aload_0         
	//   38   84:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   39   87:aload_0         
	//   40   88:getfield        #105 <Field zzh zzhc>
	//   41   91:invokespecial   #456 <Method void GoogleApiManager$zzc(GoogleApiManager, com.google.android.gms.common.api.Api$Client, zzh)>
	//   42   94:astore_2        
			if(zzka.requiresSignIn())
	//*  43   95:aload_0         
	//*  44   96:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//*  45   99:invokeinterface #122 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  46  104:ifeq            115
				zzkg.zza(((zzcb) (googleapimanager$zzc)));
	//   47  107:aload_0         
	//   48  108:getfield        #131 <Field zzby zzkg>
	//   49  111:aload_2         
	//   50  112:invokevirtual   #461 <Method void zzby.zza(zzcb)>
			zzka.connect(((com.google.android.gms.common.internal.ionProgressReportCallbacks) (googleapimanager$zzc)));
	//   51  115:aload_0         
	//   52  116:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   53  119:aload_2         
	//   54  120:invokeinterface #464 <Method void com.google.android.gms.common.api.Api$Client.connect(com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks)>
		}
	//   55  125:return          
	}

	public final int getInstanceId()
	{
		return zzkf;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int zzkf>
	//    2    4:ireturn         
	}

	final boolean isConnected()
	{
		return zzka.isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//    2    4:invokeinterface #150 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//    3    9:ireturn         
	}

	public final void onConnected(Bundle bundle)
	{
		if(Looper.myLooper() == GoogleApiManager.zza(zzjy).getLooper())
	//*   0    0:invokestatic    #472 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #50  <Field GoogleApiManager zzjy>
	//*   3    7:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//*   4   10:invokevirtual   #84  <Method Looper Handler.getLooper()>
	//*   5   13:if_acmpne       21
		{
			zzbj();
	//    6   16:aload_0         
	//    7   17:invokespecial   #393 <Method void zzbj()>
			return;
	//    8   20:return          
		} else
		{
			GoogleApiManager.zza(zzjy).post(((Runnable) (new zzbi(this))));
	//    9   21:aload_0         
	//   10   22:getfield        #50  <Field GoogleApiManager zzjy>
	//   11   25:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   12   28:new             #474 <Class zzbi>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:invokespecial   #476 <Method void zzbi(GoogleApiManager$zza)>
	//   16   36:invokevirtual   #480 <Method boolean Handler.post(Runnable)>
	//   17   39:pop             
			return;
	//   18   40:return          
		}
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		zzby zzby1 = zzkg;
	//    4   10:aload_0         
	//    5   11:getfield        #131 <Field zzby zzkg>
	//    6   14:astore_2        
		if(zzby1 != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          23
			zzby1.zzbz();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #483 <Method void zzby.zzbz()>
		zzbo();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #331 <Method void zzbo()>
		GoogleApiManager.zze(zzjy).flush();
	//   13   27:aload_0         
	//   14   28:getfield        #50  <Field GoogleApiManager zzjy>
	//   15   31:invokestatic    #374 <Method GoogleApiAvailabilityCache GoogleApiManager.zze(GoogleApiManager)>
	//   16   34:invokevirtual   #379 <Method void GoogleApiAvailabilityCache.flush()>
		zzi(connectionresult);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokespecial   #338 <Method void zzi(ConnectionResult)>
		if(connectionresult.getErrorCode() == 4)
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #486 <Method int ConnectionResult.getErrorCode()>
	//*  22   46:iconst_4        
	//*  23   47:icmpne          58
		{
			zzc(GoogleApiManager.zzbi());
	//   24   50:aload_0         
	//   25   51:invokestatic    #490 <Method Status GoogleApiManager.zzbi()>
	//   26   54:invokevirtual   #493 <Method void zzc(Status)>
			return;
	//   27   57:return          
		}
		if(zzjz.isEmpty())
	//*  28   58:aload_0         
	//*  29   59:getfield        #58  <Field Queue zzjz>
	//*  30   62:invokeinterface #496 <Method boolean Queue.isEmpty()>
	//*  31   67:ifeq            76
		{
			zzkj = connectionresult;
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:putfield        #75  <Field ConnectionResult zzkj>
			return;
	//   35   75:return          
		}
		if(zzh(connectionresult))
	//*  36   76:aload_0         
	//*  37   77:aload_1         
	//*  38   78:invokespecial   #304 <Method boolean zzh(ConnectionResult)>
	//*  39   81:ifeq            85
			return;
	//   40   84:return          
		if(!zzjy.zzc(connectionresult, zzkf))
	//*  41   85:aload_0         
	//*  42   86:getfield        #50  <Field GoogleApiManager zzjy>
	//*  43   89:aload_1         
	//*  44   90:aload_0         
	//*  45   91:getfield        #116 <Field int zzkf>
	//*  46   94:invokevirtual   #307 <Method boolean GoogleApiManager.zzc(ConnectionResult, int)>
	//*  47   97:ifne            221
		{
			if(connectionresult.getErrorCode() == 18)
	//*  48  100:aload_1         
	//*  49  101:invokevirtual   #486 <Method int ConnectionResult.getErrorCode()>
	//*  50  104:bipush          18
	//*  51  106:icmpne          114
				zzkh = true;
	//   52  109:aload_0         
	//   53  110:iconst_1        
	//   54  111:putfield        #147 <Field boolean zzkh>
			if(zzkh)
	//*  55  114:aload_0         
	//*  56  115:getfield        #147 <Field boolean zzkh>
	//*  57  118:ifeq            156
			{
				GoogleApiManager.zza(zzjy).sendMessageDelayed(Message.obtain(GoogleApiManager.zza(zzjy), 9, ((Object) (zzhc))), GoogleApiManager.zzc(zzjy));
	//   58  121:aload_0         
	//   59  122:getfield        #50  <Field GoogleApiManager zzjy>
	//   60  125:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   61  128:aload_0         
	//   62  129:getfield        #50  <Field GoogleApiManager zzjy>
	//   63  132:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   64  135:bipush          9
	//   65  137:aload_0         
	//   66  138:getfield        #105 <Field zzh zzhc>
	//   67  141:invokestatic    #285 <Method Message Message.obtain(Handler, int, Object)>
	//   68  144:aload_0         
	//   69  145:getfield        #50  <Field GoogleApiManager zzjy>
	//   70  148:invokestatic    #288 <Method long GoogleApiManager.zzc(GoogleApiManager)>
	//   71  151:invokevirtual   #292 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   72  154:pop             
				return;
	//   73  155:return          
			}
			connectionresult = ((ConnectionResult) (zzhc.zzq()));
	//   74  156:aload_0         
	//   75  157:getfield        #105 <Field zzh zzhc>
	//   76  160:invokevirtual   #501 <Method String zzh.zzq()>
	//   77  163:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (connectionresult))).length() + 38);
	//   78  164:new             #503 <Class StringBuilder>
	//   79  167:dup             
	//   80  168:aload_1         
	//   81  169:invokestatic    #508 <Method String String.valueOf(Object)>
	//   82  172:invokevirtual   #511 <Method int String.length()>
	//   83  175:bipush          38
	//   84  177:iadd            
	//   85  178:invokespecial   #512 <Method void StringBuilder(int)>
	//   86  181:astore_2        
			stringbuilder.append("API: ");
	//   87  182:aload_2         
	//   88  183:ldc2            #514 <String "API: ">
	//   89  186:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   90  189:pop             
			stringbuilder.append(((String) (connectionresult)));
	//   91  190:aload_2         
	//   92  191:aload_1         
	//   93  192:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   94  195:pop             
			stringbuilder.append(" is not available on this device.");
	//   95  196:aload_2         
	//   96  197:ldc2            #520 <String " is not available on this device.">
	//   97  200:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   98  203:pop             
			zzc(new Status(17, stringbuilder.toString()));
	//   99  204:aload_0         
	//  100  205:new             #522 <Class Status>
	//  101  208:dup             
	//  102  209:bipush          17
	//  103  211:aload_2         
	//  104  212:invokevirtual   #525 <Method String StringBuilder.toString()>
	//  105  215:invokespecial   #528 <Method void Status(int, String)>
	//  106  218:invokevirtual   #493 <Method void zzc(Status)>
		}
	//  107  221:return          
	}

	public final void onConnectionSuspended(int i)
	{
		if(Looper.myLooper() == GoogleApiManager.zza(zzjy).getLooper())
	//*   0    0:invokestatic    #472 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #50  <Field GoogleApiManager zzjy>
	//*   3    7:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//*   4   10:invokevirtual   #84  <Method Looper Handler.getLooper()>
	//*   5   13:if_acmpne       21
		{
			zzbk();
	//    6   16:aload_0         
	//    7   17:invokespecial   #401 <Method void zzbk()>
			return;
	//    8   20:return          
		} else
		{
			GoogleApiManager.zza(zzjy).post(((Runnable) (new zzbj(this))));
	//    9   21:aload_0         
	//   10   22:getfield        #50  <Field GoogleApiManager zzjy>
	//   11   25:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   12   28:new             #530 <Class zzbj>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:invokespecial   #531 <Method void zzbj(GoogleApiManager$zza)>
	//   16   36:invokevirtual   #480 <Method boolean Handler.post(Runnable)>
	//   17   39:pop             
			return;
	//   18   40:return          
		}
	}

	public final boolean requiresSignIn()
	{
		return zzka.requiresSignIn();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//    2    4:invokeinterface #122 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//    3    9:ireturn         
	}

	public final void resume()
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		if(zzkh)
	//*   4   10:aload_0         
	//*   5   11:getfield        #147 <Field boolean zzkh>
	//*   6   14:ifeq            21
			connect();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #153 <Method void connect()>
	//    9   21:return          
	}

	public final void zza(ConnectionResult connectionresult, Api api, boolean flag)
	{
		if(Looper.myLooper() == GoogleApiManager.zza(zzjy).getLooper())
	//*   0    0:invokestatic    #472 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #50  <Field GoogleApiManager zzjy>
	//*   3    7:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//*   4   10:invokevirtual   #84  <Method Looper Handler.getLooper()>
	//*   5   13:if_acmpne       22
		{
			onConnectionFailed(connectionresult);
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokevirtual   #451 <Method void onConnectionFailed(ConnectionResult)>
			return;
	//    9   21:return          
		} else
		{
			GoogleApiManager.zza(zzjy).post(((Runnable) (new zzbk(this, connectionresult))));
	//   10   22:aload_0         
	//   11   23:getfield        #50  <Field GoogleApiManager zzjy>
	//   12   26:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   13   29:new             #535 <Class zzbk>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #538 <Method void zzbk(GoogleApiManager$zza, ConnectionResult)>
	//   18   38:invokevirtual   #480 <Method boolean Handler.post(Runnable)>
	//   19   41:pop             
			return;
	//   20   42:return          
		}
	}

	public final void zza(zzb zzb1)
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		if(zzka.isConnected())
	//*   4   10:aload_0         
	//*   5   11:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//*   6   14:invokeinterface #150 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//*   7   19:ifeq            47
			if(zzb(zzb1))
	//*   8   22:aload_0         
	//*   9   23:aload_1         
	//*  10   24:invokespecial   #384 <Method boolean zzb(zzb)>
	//*  11   27:ifeq            35
			{
				zzbr();
	//   12   30:aload_0         
	//   13   31:invokespecial   #320 <Method void zzbr()>
				return;
	//   14   34:return          
			} else
			{
				zzjz.add(((Object) (zzb1)));
	//   15   35:aload_0         
	//   16   36:getfield        #58  <Field Queue zzjz>
	//   17   39:aload_1         
	//   18   40:invokeinterface #540 <Method boolean Queue.add(Object)>
	//   19   45:pop             
				return;
	//   20   46:return          
			}
		zzjz.add(((Object) (zzb1)));
	//   21   47:aload_0         
	//   22   48:getfield        #58  <Field Queue zzjz>
	//   23   51:aload_1         
	//   24   52:invokeinterface #540 <Method boolean Queue.add(Object)>
	//   25   57:pop             
		zzb1 = ((zzb) (zzkj));
	//   26   58:aload_0         
	//   27   59:getfield        #75  <Field ConnectionResult zzkj>
	//   28   62:astore_1        
		if(zzb1 != null && ((ConnectionResult) (zzb1)).hasResolution())
	//*  29   63:aload_1         
	//*  30   64:ifnull          83
	//*  31   67:aload_1         
	//*  32   68:invokevirtual   #543 <Method boolean ConnectionResult.hasResolution()>
	//*  33   71:ifeq            83
		{
			onConnectionFailed(zzkj);
	//   34   74:aload_0         
	//   35   75:aload_0         
	//   36   76:getfield        #75  <Field ConnectionResult zzkj>
	//   37   79:invokevirtual   #451 <Method void onConnectionFailed(ConnectionResult)>
			return;
	//   38   82:return          
		} else
		{
			connect();
	//   39   83:aload_0         
	//   40   84:invokevirtual   #153 <Method void connect()>
			return;
	//   41   87:return          
		}
	}

	public final void zza(zzj zzj1)
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		zzkd.add(((Object) (zzj1)));
	//    4   10:aload_0         
	//    5   11:getfield        #63  <Field Set zzkd>
	//    6   14:aload_1         
	//    7   15:invokeinterface #545 <Method boolean Set.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final com.google.android.gms.common.api.Api.Client zzae()
	{
		return zzka;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//    2    4:areturn         
	}

	public final void zzay()
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		if(zzkh)
	//*   4   10:aload_0         
	//*   5   11:getfield        #147 <Field boolean zzkh>
	//*   6   14:ifeq            86
		{
			zzbq();
	//    7   17:aload_0         
	//    8   18:invokespecial   #341 <Method void zzbq()>
			Status status;
			if(((GoogleApiAvailabilityLight) (GoogleApiManager.zzh(zzjy))).isGooglePlayServicesAvailable(GoogleApiManager.zzb(zzjy)) == 18)
	//*   9   21:aload_0         
	//*  10   22:getfield        #50  <Field GoogleApiManager zzjy>
	//*  11   25:invokestatic    #551 <Method com.google.android.gms.common.GoogleApiAvailability GoogleApiManager.zzh(GoogleApiManager)>
	//*  12   28:aload_0         
	//*  13   29:getfield        #50  <Field GoogleApiManager zzjy>
	//*  14   32:invokestatic    #126 <Method android.content.Context GoogleApiManager.zzb(GoogleApiManager)>
	//*  15   35:invokevirtual   #557 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(android.content.Context)>
	//*  16   38:bipush          18
	//*  17   40:icmpne          59
				status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
	//   18   43:new             #522 <Class Status>
	//   19   46:dup             
	//   20   47:bipush          8
	//   21   49:ldc2            #559 <String "Connection timed out while waiting for Google Play services update to complete.">
	//   22   52:invokespecial   #528 <Method void Status(int, String)>
	//   23   55:astore_1        
			else
	//*  24   56:goto            72
				status = new Status(8, "API failed to connect while resuming due to an unknown error.");
	//   25   59:new             #522 <Class Status>
	//   26   62:dup             
	//   27   63:bipush          8
	//   28   65:ldc2            #561 <String "API failed to connect while resuming due to an unknown error.">
	//   29   68:invokespecial   #528 <Method void Status(int, String)>
	//   30   71:astore_1        
			zzc(status);
	//   31   72:aload_0         
	//   32   73:aload_1         
	//   33   74:invokevirtual   #493 <Method void zzc(Status)>
			zzka.disconnect();
	//   34   77:aload_0         
	//   35   78:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   36   81:invokeinterface #323 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
		}
	//   37   86:return          
	}

	public final void zzbm()
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		zzc(GoogleApiManager.zzjj);
	//    4   10:aload_0         
	//    5   11:getstatic       #566 <Field Status GoogleApiManager.zzjj>
	//    6   14:invokevirtual   #493 <Method void zzc(Status)>
		zzkc.zzak();
	//    7   17:aload_0         
	//    8   18:getfield        #110 <Field zzaa zzkc>
	//    9   21:invokevirtual   #569 <Method void zzaa.zzak()>
		erKey aerkey[] = (erKey[])zzke.keySet().toArray(((Object []) (new erKey[zzke.size()])));
	//   10   24:aload_0         
	//   11   25:getfield        #68  <Field Map zzke>
	//   12   28:invokeinterface #573 <Method Set Map.keySet()>
	//   13   33:aload_0         
	//   14   34:getfield        #68  <Field Map zzke>
	//   15   37:invokeinterface #314 <Method int Map.size()>
	//   16   42:anewarray       erKey[]
	//   17   45:invokeinterface #579 <Method Object[] Set.toArray(Object[])>
	//   18   50:checkcast       #581 <Class ListenerHolder$ListenerKey[]>
	//   19   53:astore_3        
		int j = aerkey.length;
	//   20   54:aload_3         
	//   21   55:arraylength     
	//   22   56:istore_2        
		for(int i = 0; i < j; i++)
	//*  23   57:iconst_0        
	//*  24   58:istore_1        
	//*  25   59:iload_1         
	//*  26   60:iload_2         
	//*  27   61:icmpge          92
			zza(((zzb) (new zzg(aerkey[i], new TaskCompletionSource()))));
	//   28   64:aload_0         
	//   29   65:new             #583 <Class zzg>
	//   30   68:dup             
	//   31   69:aload_3         
	//   32   70:iload_1         
	//   33   71:aaload          
	//   34   72:new             #356 <Class TaskCompletionSource>
	//   35   75:dup             
	//   36   76:invokespecial   #357 <Method void TaskCompletionSource()>
	//   37   79:invokespecial   #586 <Method void zzg(ListenerHolder$ListenerKey, TaskCompletionSource)>
	//   38   82:invokevirtual   #588 <Method void zza(zzb)>

	//   39   85:iload_1         
	//   40   86:iconst_1        
	//   41   87:iadd            
	//   42   88:istore_1        
	//*  43   89:goto            59
		zzi(new ConnectionResult(4));
	//   44   92:aload_0         
	//   45   93:new             #297 <Class ConnectionResult>
	//   46   96:dup             
	//   47   97:iconst_4        
	//   48   98:invokespecial   #589 <Method void ConnectionResult(int)>
	//   49  101:invokespecial   #338 <Method void zzi(ConnectionResult)>
		if(zzka.isConnected())
	//*  50  104:aload_0         
	//*  51  105:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//*  52  108:invokeinterface #150 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//*  53  113:ifeq            133
			zzka.onUserSignOut(((com.google.android.gms.common.internal.Callbacks) (new zzbl(this))));
	//   54  116:aload_0         
	//   55  117:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   56  120:new             #591 <Class zzbl>
	//   57  123:dup             
	//   58  124:aload_0         
	//   59  125:invokespecial   #592 <Method void zzbl(GoogleApiManager$zza)>
	//   60  128:invokeinterface #596 <Method void com.google.android.gms.common.api.Api$Client.onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks)>
	//   61  133:return          
	}

	public final Map zzbn()
	{
		return zzke;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Map zzke>
	//    2    4:areturn         
	}

	public final void zzbo()
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		zzkj = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #75  <Field ConnectionResult zzkj>
	//    7   15:return          
	}

	public final ConnectionResult zzbp()
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		return zzkj;
	//    4   10:aload_0         
	//    5   11:getfield        #75  <Field ConnectionResult zzkj>
	//    6   14:areturn         
	}

	public final boolean zzbs()
	{
		return zzb(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #160 <Method boolean zzb(boolean)>
	//    3    5:ireturn         
	}

	final SignInClient zzbt()
	{
		zzby zzby1 = zzkg;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field zzby zzkg>
	//    2    4:astore_1        
		if(zzby1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return zzby1.zzbt();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #606 <Method SignInClient zzby.zzbt()>
	//    9   15:areturn         
	}

	public final void zzc(Status status)
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		for(Iterator iterator = zzjz.iterator(); iterator.hasNext(); ((zzb)iterator.next()).zza(status));
	//    4   10:aload_0         
	//    5   11:getfield        #58  <Field Queue zzjz>
	//    6   14:invokeinterface #187 <Method Iterator Queue.iterator()>
	//    7   19:astore_2        
	//    8   20:aload_2         
	//    9   21:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            45
	//   11   29:aload_2         
	//   12   30:invokeinterface #196 <Method Object Iterator.next()>
	//   13   35:checkcast       #198 <Class zzb>
	//   14   38:aload_1         
	//   15   39:invokevirtual   #608 <Method void zzb.zza(Status)>
	//*  16   42:goto            20
		zzjz.clear();
	//   17   45:aload_0         
	//   18   46:getfield        #58  <Field Queue zzjz>
	//   19   49:invokeinterface #609 <Method void Queue.clear()>
	//   20   54:return          
	}

	public final void zzg(ConnectionResult connectionresult)
	{
		Preconditions.checkHandlerThread(GoogleApiManager.zza(zzjy));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:invokestatic    #313 <Method void Preconditions.checkHandlerThread(Handler)>
		zzka.disconnect();
	//    4   10:aload_0         
	//    5   11:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//    6   14:invokeinterface #323 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
		onConnectionFailed(connectionresult);
	//    7   19:aload_0         
	//    8   20:aload_1         
	//    9   21:invokevirtual   #451 <Method void onConnectionFailed(ConnectionResult)>
	//   10   24:return          
	}

	private final zzh zzhc;
	final GoogleApiManager zzjy;
	private final Queue zzjz = new LinkedList();
	private final com.google.android.gms.common.api.Api.Client zzka;
	private final com.google.android.gms.common.api.Api.AnyClient zzkb;
	private final zzaa zzkc = new zzaa();
	private final Set zzkd = new HashSet();
	private final Map zzke = new HashMap();
	private final int zzkf;
	private final zzby zzkg;
	private boolean zzkh;
	private final List zzki = new ArrayList();
	private ConnectionResult zzkj;

	public GoogleApiManager$zza(GoogleApiManager googleapimanager, GoogleApi googleapi)
	{
		zzjy = googleapimanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field GoogleApiManager zzjy>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #53  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #55  <Class LinkedList>
	//    7   13:dup             
	//    8   14:invokespecial   #56  <Method void LinkedList()>
	//    9   17:putfield        #58  <Field Queue zzjz>
	//   10   20:aload_0         
	//   11   21:new             #60  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #61  <Method void HashSet()>
	//   14   28:putfield        #63  <Field Set zzkd>
	//   15   31:aload_0         
	//   16   32:new             #65  <Class HashMap>
	//   17   35:dup             
	//   18   36:invokespecial   #66  <Method void HashMap()>
	//   19   39:putfield        #68  <Field Map zzke>
	//   20   42:aload_0         
	//   21   43:new             #70  <Class ArrayList>
	//   22   46:dup             
	//   23   47:invokespecial   #71  <Method void ArrayList()>
	//   24   50:putfield        #73  <Field List zzki>
		zzkj = null;
	//   25   53:aload_0         
	//   26   54:aconst_null     
	//   27   55:putfield        #75  <Field ConnectionResult zzkj>
		zzka = googleapi.zza(GoogleApiManager.zza(googleapimanager).getLooper(), this);
	//   28   58:aload_0         
	//   29   59:aload_2         
	//   30   60:aload_1         
	//   31   61:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   32   64:invokevirtual   #84  <Method Looper Handler.getLooper()>
	//   33   67:aload_0         
	//   34   68:invokevirtual   #89  <Method com.google.android.gms.common.api.Api$Client GoogleApi.zza(Looper, GoogleApiManager$zza)>
	//   35   71:putfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
		com.google.android.gms.common.api.Api.Client client = zzka;
	//   36   74:aload_0         
	//   37   75:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//   38   78:astore          4
		Object obj = ((Object) (client));
	//   39   80:aload           4
	//   40   82:astore_3        
		if(client instanceof SimpleClientAdapter)
	//*  41   83:aload           4
	//*  42   85:instanceof      #93  <Class SimpleClientAdapter>
	//*  43   88:ifeq            100
			obj = ((Object) (((SimpleClientAdapter)client).getClient()));
	//   44   91:aload           4
	//   45   93:checkcast       #93  <Class SimpleClientAdapter>
	//   46   96:invokevirtual   #97  <Method com.google.android.gms.common.api.Api$SimpleClient SimpleClientAdapter.getClient()>
	//   47   99:astore_3        
		zzkb = ((com.google.android.gms.common.api.Api.AnyClient) (obj));
	//   48  100:aload_0         
	//   49  101:aload_3         
	//   50  102:putfield        #99  <Field com.google.android.gms.common.api.Api$AnyClient zzkb>
		zzhc = googleapi.zzm();
	//   51  105:aload_0         
	//   52  106:aload_2         
	//   53  107:invokevirtual   #103 <Method zzh GoogleApi.zzm()>
	//   54  110:putfield        #105 <Field zzh zzhc>
	//   55  113:aload_0         
	//   56  114:new             #107 <Class zzaa>
	//   57  117:dup             
	//   58  118:invokespecial   #108 <Method void zzaa()>
	//   59  121:putfield        #110 <Field zzaa zzkc>
		zzkf = googleapi.getInstanceId();
	//   60  124:aload_0         
	//   61  125:aload_2         
	//   62  126:invokevirtual   #114 <Method int GoogleApi.getInstanceId()>
	//   63  129:putfield        #116 <Field int zzkf>
		if(zzka.requiresSignIn())
	//*  64  132:aload_0         
	//*  65  133:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
	//*  66  136:invokeinterface #122 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  67  141:ifeq            161
		{
			zzkg = googleapi.zza(GoogleApiManager.zzb(googleapimanager), GoogleApiManager.zza(googleapimanager));
	//   68  144:aload_0         
	//   69  145:aload_2         
	//   70  146:aload_1         
	//   71  147:invokestatic    #126 <Method android.content.Context GoogleApiManager.zzb(GoogleApiManager)>
	//   72  150:aload_1         
	//   73  151:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//   74  154:invokevirtual   #129 <Method zzby GoogleApi.zza(android.content.Context, Handler)>
	//   75  157:putfield        #131 <Field zzby zzkg>
			return;
	//   76  160:return          
		} else
		{
			zzkg = null;
	//   77  161:aload_0         
	//   78  162:aconst_null     
	//   79  163:putfield        #131 <Field zzby zzkg>
			return;
	//   80  166:return          
		}
	}
}
