// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.*;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.ArraySet;
import android.util.Log;
import com.google.android.gms.common.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzae, zzh, BackgroundDetector, zzbh, 
//			zzbu, zzb, zzj, zzg, 
//			zze, zzbv, zzd, zzf, 
//			zzad, RegisterListenerMethod, UnregisterListenerMethod, TaskApiCall, 
//			StatusExceptionMapper, zzq, zzaa, zzk, 
//			zzby, zzbi, zzbj, zzbk, 
//			zzbl, zzcb, zzbn

public class GoogleApiManager
	implements android.os.Handler.Callback
{
	public final class zza
		implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, zzq
	{

		static void zza(zza zza1, zzb zzb1)
		{
			zza1.zza(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #139 <Method void zza(GoogleApiManager$zzb)>
		//    3    5:return          
		}

		private final void zza(zzb zzb1)
		{
			if(!zzki.contains(((Object) (zzb1))))
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

		static boolean zza(zza zza1, boolean flag)
		{
			return zza1.zzb(false);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:invokespecial   #160 <Method boolean zzb(boolean)>
		//    3    5:ireturn         
		}

		static void zzb(zza zza1, zzb zzb1)
		{
			zza1.zzb(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #162 <Method void zzb(GoogleApiManager$zzb)>
		//    3    5:return          
		}

		private final void zzb(zzb zzb1)
		{
			if(zzki.remove(((Object) (zzb1))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #73  <Field List zzki>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #165 <Method boolean List.remove(Object)>
		//*   4   10:ifeq            205
			{
				GoogleApiManager.zza(zzjy).removeMessages(15, ((Object) (zzb1)));
		//    5   13:aload_0         
		//    6   14:getfield        #50  <Field GoogleApiManager zzjy>
		//    7   17:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
		//    8   20:bipush          15
		//    9   22:aload_1         
		//   10   23:invokevirtual   #169 <Method void Handler.removeMessages(int, Object)>
				GoogleApiManager.zza(zzjy).removeMessages(16, ((Object) (zzb1)));
		//   11   26:aload_0         
		//   12   27:getfield        #50  <Field GoogleApiManager zzjy>
		//   13   30:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
		//   14   33:bipush          16
		//   15   35:aload_1         
		//   16   36:invokevirtual   #169 <Method void Handler.removeMessages(int, Object)>
				zzb1 = ((zzb) (zzb.zzd(zzb1)));
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
					com.google.android.gms.common.api.internal.zzb zzb2 = (com.google.android.gms.common.api.internal.zzb)iterator.next();
		//   34   83:aload           5
		//   35   85:invokeinterface #196 <Method Object Iterator.next()>
		//   36   90:checkcast       #198 <Class zzb>
		//   37   93:astore          6
					if(zzb2 instanceof zzf)
		//*  38   95:aload           6
		//*  39   97:instanceof      #200 <Class zzf>
		//*  40  100:ifeq            73
					{
						Feature afeature[] = ((zzf)zzb2).getRequiredFeatures();
		//   41  103:aload           6
		//   42  105:checkcast       #200 <Class zzf>
		//   43  108:invokevirtual   #204 <Method Feature[] zzf.getRequiredFeatures()>
		//   44  111:astore          7
						if(afeature != null && ArrayUtils.contains(((Object []) (afeature)), ((Object) (zzb1))))
		//*  45  113:aload           7
		//*  46  115:ifnull          73
		//*  47  118:aload           7
		//*  48  120:aload_1         
		//*  49  121:invokestatic    #209 <Method boolean ArrayUtils.contains(Object[], Object)>
		//*  50  124:ifeq            73
							arraylist.add(((Object) (zzb2)));
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
					obj = ((Object) ((com.google.android.gms.common.api.internal.zzb)obj));
		//   75  170:aload           5
		//   76  172:checkcast       #198 <Class zzb>
		//   77  175:astore          5
					zzjz.remove(obj);
		//   78  177:aload_0         
		//   79  178:getfield        #58  <Field Queue zzjz>
		//   80  181:aload           5
		//   81  183:invokeinterface #218 <Method boolean Queue.remove(Object)>
		//   82  188:pop             
					((com.google.android.gms.common.api.internal.zzb) (obj)).zza(((RuntimeException) (new UnsupportedApiCallException(((Feature) (zzb1))))));
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

		private final boolean zzb(com.google.android.gms.common.api.internal.zzb zzb1)
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
						zzki.remove(((Object) (new zzb(zzhc, feature, ((zzbh) (null))))));
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
							zzb1 = ((com.google.android.gms.common.api.internal.zzb) (new zzb(zzhc, feature, ((zzbh) (null)))));
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
								zzb1 = ((com.google.android.gms.common.api.internal.zzb) ((zzb)zzki.get(k)));
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
							zzb1 = ((com.google.android.gms.common.api.internal.zzb) (new ConnectionResult(2, ((PendingIntent) (null)))));
		//  185  388:new             #297 <Class ConnectionResult>
		//  186  391:dup             
		//  187  392:iconst_2        
		//  188  393:aconst_null     
		//  189  394:invokespecial   #300 <Method void ConnectionResult(int, PendingIntent)>
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
							((com.google.android.gms.common.api.internal.zzb) (zzf1)).zza(((RuntimeException) (new UnsupportedApiCallException(feature))));
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
				obj = ((Object) ((com.google.android.gms.common.api.internal.zzb)obj));
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
				if(zzb(((com.google.android.gms.common.api.internal.zzb) (obj))))
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

		static void zzc(zza zza1)
		{
			zza1.zzbj();
		//    0    0:aload_0         
		//    1    1:invokespecial   #393 <Method void zzbj()>
		//    2    4:return          
		}

		private final void zzc(com.google.android.gms.common.api.internal.zzb zzb1)
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
			catch(com.google.android.gms.common.api.internal.zzb zzb1)
			{
				onConnectionSuspended(1);
			}
			zzka.disconnect();
		//*  17   33:astore_1        
		//*  18   34:goto            18
		}

		static void zzd(zza zza1)
		{
			zza1.zzbk();
		//    0    0:aload_0         
		//    1    1:invokespecial   #401 <Method void zzbk()>
		//    2    4:return          
		}

		static com.google.android.gms.common.api.Api.Client zze(zza zza1)
		{
			return zza1.zzka;
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
		//   18   46:invokestatic    #126 <Method Context GoogleApiManager.zzb(GoogleApiManager)>
		//   19   49:aload_0         
		//   20   50:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zzka>
		//   21   53:invokevirtual   #448 <Method int GoogleApiAvailabilityCache.getClientAvailability(Context, com.google.android.gms.common.api.Api$Client)>
		//   22   56:istore_1        
				if(i != 0)
		//*  23   57:iload_1         
		//*  24   58:ifeq            75
				{
					onConnectionFailed(new ConnectionResult(i, ((PendingIntent) (null))));
		//   25   61:aload_0         
		//   26   62:new             #297 <Class ConnectionResult>
		//   27   65:dup             
		//   28   66:iload_1         
		//   29   67:aconst_null     
		//   30   68:invokespecial   #300 <Method void ConnectionResult(int, PendingIntent)>
		//   31   71:invokevirtual   #451 <Method void onConnectionFailed(ConnectionResult)>
					return;
		//   32   74:return          
				}
				zzc zzc1 = ((zzc) (zzjy)). new zzc(zzka, zzhc);
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
					zzkg.zza(((zzcb) (zzc1)));
		//   47  107:aload_0         
		//   48  108:getfield        #131 <Field zzby zzkg>
		//   49  111:aload_2         
		//   50  112:invokevirtual   #461 <Method void zzby.zza(zzcb)>
				zzka.connect(((com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) (zzc1)));
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

		public final void zza(com.google.android.gms.common.api.internal.zzb zzb1)
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
			zzb1 = ((com.google.android.gms.common.api.internal.zzb) (zzkj));
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
		//*  11   25:invokestatic    #551 <Method GoogleApiAvailability GoogleApiManager.zzh(GoogleApiManager)>
		//*  12   28:aload_0         
		//*  13   29:getfield        #50  <Field GoogleApiManager zzjy>
		//*  14   32:invokestatic    #126 <Method Context GoogleApiManager.zzb(GoogleApiManager)>
		//*  15   35:invokevirtual   #557 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context)>
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
			ListenerHolder.ListenerKey alistenerkey[] = (ListenerHolder.ListenerKey[])zzke.keySet().toArray(((Object []) (new ListenerHolder.ListenerKey[zzke.size()])));
		//   10   24:aload_0         
		//   11   25:getfield        #68  <Field Map zzke>
		//   12   28:invokeinterface #573 <Method Set Map.keySet()>
		//   13   33:aload_0         
		//   14   34:getfield        #68  <Field Map zzke>
		//   15   37:invokeinterface #314 <Method int Map.size()>
		//   16   42:anewarray       ListenerHolder.ListenerKey[]
		//   17   45:invokeinterface #579 <Method Object[] Set.toArray(Object[])>
		//   18   50:checkcast       #581 <Class ListenerHolder$ListenerKey[]>
		//   19   53:astore_3        
			int j = alistenerkey.length;
		//   20   54:aload_3         
		//   21   55:arraylength     
		//   22   56:istore_2        
			for(int i = 0; i < j; i++)
		//*  23   57:iconst_0        
		//*  24   58:istore_1        
		//*  25   59:iload_1         
		//*  26   60:iload_2         
		//*  27   61:icmpge          92
				zza(((com.google.android.gms.common.api.internal.zzb) (new zzg(alistenerkey[i], new TaskCompletionSource()))));
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
				zzka.onUserSignOut(((com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks) (new zzbl(this))));
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
			for(Iterator iterator = zzjz.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.internal.zzb)iterator.next()).zza(status));
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

		public zza(GoogleApi googleapi)
		{
			zzjy = GoogleApiManager.this;
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
			zzka = googleapi.zza(GoogleApiManager.zza(GoogleApiManager.this).getLooper(), this);
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
				zzkg = googleapi.zza(GoogleApiManager.zzb(GoogleApiManager.this), GoogleApiManager.zza(GoogleApiManager.this));
		//   68  144:aload_0         
		//   69  145:aload_2         
		//   70  146:aload_1         
		//   71  147:invokestatic    #126 <Method Context GoogleApiManager.zzb(GoogleApiManager)>
		//   72  150:aload_1         
		//   73  151:invokestatic    #78  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
		//   74  154:invokevirtual   #129 <Method zzby GoogleApi.zza(Context, Handler)>
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

	private static final class zzb
	{

		static zzh zzc(zzb zzb1)
		{
			return zzb1.zzkn;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzh zzkn>
		//    2    4:areturn         
		}

		static Feature zzd(zzb zzb1)
		{
			return zzb1.zzdr;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Feature zzdr>
		//    2    4:areturn         
		}

		public final boolean equals(Object obj)
		{
			if(obj != null && (obj instanceof zzb))
		//*   0    0:aload_1         
		//*   1    1:ifnull          46
		//*   2    4:aload_1         
		//*   3    5:instanceof      #2   <Class GoogleApiManager$zzb>
		//*   4    8:ifeq            46
			{
				obj = ((Object) ((zzb)obj));
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class GoogleApiManager$zzb>
		//    7   15:astore_1        
				if(Objects.equal(((Object) (zzkn)), ((Object) (((zzb) (obj)).zzkn))) && Objects.equal(((Object) (zzdr)), ((Object) (((zzb) (obj)).zzdr))))
		//*   8   16:aload_0         
		//*   9   17:getfield        #19  <Field zzh zzkn>
		//*  10   20:aload_1         
		//*  11   21:getfield        #19  <Field zzh zzkn>
		//*  12   24:invokestatic    #39  <Method boolean Objects.equal(Object, Object)>
		//*  13   27:ifeq            46
		//*  14   30:aload_0         
		//*  15   31:getfield        #21  <Field Feature zzdr>
		//*  16   34:aload_1         
		//*  17   35:getfield        #21  <Field Feature zzdr>
		//*  18   38:invokestatic    #39  <Method boolean Objects.equal(Object, Object)>
		//*  19   41:ifeq            46
					return true;
		//   20   44:iconst_1        
		//   21   45:ireturn         
			}
			return false;
		//   22   46:iconst_0        
		//   23   47:ireturn         
		}

		public final int hashCode()
		{
			return Objects.hashCode(new Object[] {
				zzkn, zzdr
			});
		//    0    0:iconst_2        
		//    1    1:anewarray       Object[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:getfield        #19  <Field zzh zzkn>
		//    6   10:aastore         
		//    7   11:dup             
		//    8   12:iconst_1        
		//    9   13:aload_0         
		//   10   14:getfield        #21  <Field Feature zzdr>
		//   11   17:aastore         
		//   12   18:invokestatic    #44  <Method int Objects.hashCode(Object[])>
		//   13   21:ireturn         
		}

		public final String toString()
		{
			return Objects.toStringHelper(((Object) (this))).add("key", ((Object) (zzkn))).add("feature", ((Object) (zzdr))).toString();
		//    0    0:aload_0         
		//    1    1:invokestatic    #50  <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
		//    2    4:ldc1            #52  <String "key">
		//    3    6:aload_0         
		//    4    7:getfield        #19  <Field zzh zzkn>
		//    5   10:invokevirtual   #58  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//    6   13:ldc1            #60  <String "feature">
		//    7   15:aload_0         
		//    8   16:getfield        #21  <Field Feature zzdr>
		//    9   19:invokevirtual   #58  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   10   22:invokevirtual   #62  <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
		//   11   25:areturn         
		}

		private final Feature zzdr;
		private final zzh zzkn;

		private zzb(zzh zzh1, Feature feature)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzkn = zzh1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field zzh zzkn>
			zzdr = feature;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field Feature zzdr>
		//    8   14:return          
		}

		zzb(zzh zzh1, Feature feature, zzbh zzbh1)
		{
			this(zzh1, feature);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void GoogleApiManager$zzb(zzh, Feature)>
		//    4    6:return          
		}
	}

	private final class zzc
		implements zzcb, com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
	{

		static com.google.android.gms.common.api.Api.Client zza(zzc zzc1)
		{
			return zzc1.zzka;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field com.google.android.gms.common.api.Api$Client zzka>
		//    2    4:areturn         
		}

		static boolean zza(zzc zzc1, boolean flag)
		{
			zzc1.zzkq = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #38  <Field boolean zzkq>
			return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
		}

		static void zzb(zzc zzc1)
		{
			zzc1.zzbu();
		//    0    0:aload_0         
		//    1    1:invokespecial   #53  <Method void zzbu()>
		//    2    4:return          
		}

		private final void zzbu()
		{
			if(zzkq)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field boolean zzkq>
		//*   2    4:ifeq            30
			{
				IAccountAccessor iaccountaccessor = zzko;
		//    3    7:aload_0         
		//    4    8:getfield        #34  <Field IAccountAccessor zzko>
		//    5   11:astore_1        
				if(iaccountaccessor != null)
		//*   6   12:aload_1         
		//*   7   13:ifnull          30
					zzka.getRemoteService(iaccountaccessor, zzkp);
		//    8   16:aload_0         
		//    9   17:getfield        #40  <Field com.google.android.gms.common.api.Api$Client zzka>
		//   10   20:aload_1         
		//   11   21:aload_0         
		//   12   22:getfield        #36  <Field Set zzkp>
		//   13   25:invokeinterface #60  <Method void com.google.android.gms.common.api.Api$Client.getRemoteService(IAccountAccessor, Set)>
			}
		//   14   30:return          
		}

		static zzh zzc(zzc zzc1)
		{
			return zzc1.zzhc;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field zzh zzhc>
		//    2    4:areturn         
		}

		public final void onReportServiceBinding(ConnectionResult connectionresult)
		{
			GoogleApiManager.zza(zzjy).post(((Runnable) (new zzbn(this, connectionresult))));
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field GoogleApiManager zzjy>
		//    2    4:invokestatic    #68  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
		//    3    7:new             #70  <Class zzbn>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #73  <Method void zzbn(GoogleApiManager$zzc, ConnectionResult)>
		//    8   16:invokevirtual   #79  <Method boolean Handler.post(Runnable)>
		//    9   19:pop             
		//   10   20:return          
		}

		public final void zza(IAccountAccessor iaccountaccessor, Set set)
		{
			if(iaccountaccessor != null && set != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          26
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       11
		//*   4    8:goto            26
			{
				zzko = iaccountaccessor;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #34  <Field IAccountAccessor zzko>
				zzkp = set;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #36  <Field Set zzkp>
				zzbu();
		//   11   21:aload_0         
		//   12   22:invokespecial   #53  <Method void zzbu()>
				return;
		//   13   25:return          
			} else
			{
				Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", ((Throwable) (new Exception())));
		//   14   26:ldc1            #82  <String "GoogleApiManager">
		//   15   28:ldc1            #84  <String "Received null response from onSignInSuccess">
		//   16   30:new             #86  <Class Exception>
		//   17   33:dup             
		//   18   34:invokespecial   #87  <Method void Exception()>
		//   19   37:invokestatic    #93  <Method int Log.wtf(String, String, Throwable)>
		//   20   40:pop             
				zzg(new ConnectionResult(4));
		//   21   41:aload_0         
		//   22   42:new             #95  <Class ConnectionResult>
		//   23   45:dup             
		//   24   46:iconst_4        
		//   25   47:invokespecial   #98  <Method void ConnectionResult(int)>
		//   26   50:invokevirtual   #101 <Method void zzg(ConnectionResult)>
				return;
		//   27   53:return          
			}
		}

		public final void zzg(ConnectionResult connectionresult)
		{
			((zza)GoogleApiManager.zzj(zzjy).get(((Object) (zzhc)))).zzg(connectionresult);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field GoogleApiManager zzjy>
		//    2    4:invokestatic    #106 <Method Map GoogleApiManager.zzj(GoogleApiManager)>
		//    3    7:aload_0         
		//    4    8:getfield        #42  <Field zzh zzhc>
		//    5   11:invokeinterface #112 <Method Object Map.get(Object)>
		//    6   16:checkcast       #114 <Class GoogleApiManager$zza>
		//    7   19:aload_1         
		//    8   20:invokevirtual   #115 <Method void GoogleApiManager$zza.zzg(ConnectionResult)>
		//    9   23:return          
		}

		private final zzh zzhc;
		final GoogleApiManager zzjy;
		private final com.google.android.gms.common.api.Api.Client zzka;
		private IAccountAccessor zzko;
		private Set zzkp;
		private boolean zzkq;

		public zzc(com.google.android.gms.common.api.Api.Client client, zzh zzh1)
		{
			zzjy = GoogleApiManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field GoogleApiManager zzjy>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #32  <Method void Object()>
			zzko = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #34  <Field IAccountAccessor zzko>
			zzkp = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #36  <Field Set zzkp>
			zzkq = false;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #38  <Field boolean zzkq>
			zzka = client;
		//   14   24:aload_0         
		//   15   25:aload_2         
		//   16   26:putfield        #40  <Field com.google.android.gms.common.api.Api$Client zzka>
			zzhc = zzh1;
		//   17   29:aload_0         
		//   18   30:aload_3         
		//   19   31:putfield        #42  <Field zzh zzhc>
		//   20   34:return          
		}
	}


	private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleapiavailability)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
		zzjl = 5000L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #72  <Long 5000L>
	//    4    8:putfield        #75  <Field long zzjl>
		zzjm = 0x1d4c0L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #76  <Long 0x1d4c0L>
	//    7   15:putfield        #79  <Field long zzjm>
		zzjn = 10000L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #80  <Long 10000L>
	//   10   22:putfield        #83  <Field long zzjn>
	//   11   25:aload_0         
	//   12   26:new             #85  <Class AtomicInteger>
	//   13   29:dup             
	//   14   30:iconst_1        
	//   15   31:invokespecial   #88  <Method void AtomicInteger(int)>
	//   16   34:putfield        #90  <Field AtomicInteger zzjs>
	//   17   37:aload_0         
	//   18   38:new             #85  <Class AtomicInteger>
	//   19   41:dup             
	//   20   42:iconst_0        
	//   21   43:invokespecial   #88  <Method void AtomicInteger(int)>
	//   22   46:putfield        #92  <Field AtomicInteger zzjt>
	//   23   49:aload_0         
	//   24   50:new             #94  <Class ConcurrentHashMap>
	//   25   53:dup             
	//   26   54:iconst_5        
	//   27   55:ldc1            #95  <Float 0.75F>
	//   28   57:iconst_1        
	//   29   58:invokespecial   #98  <Method void ConcurrentHashMap(int, float, int)>
	//   30   61:putfield        #100 <Field Map zzju>
		zzjv = null;
	//   31   64:aload_0         
	//   32   65:aconst_null     
	//   33   66:putfield        #102 <Field zzad zzjv>
	//   34   69:aload_0         
	//   35   70:new             #104 <Class ArraySet>
	//   36   73:dup             
	//   37   74:invokespecial   #105 <Method void ArraySet()>
	//   38   77:putfield        #107 <Field Set zzjw>
	//   39   80:aload_0         
	//   40   81:new             #104 <Class ArraySet>
	//   41   84:dup             
	//   42   85:invokespecial   #105 <Method void ArraySet()>
	//   43   88:putfield        #109 <Field Set zzjx>
		zzjp = context;
	//   44   91:aload_0         
	//   45   92:aload_1         
	//   46   93:putfield        #111 <Field Context zzjp>
		handler = new Handler(looper, ((android.os.Handler.Callback) (this)));
	//   47   96:aload_0         
	//   48   97:new             #113 <Class Handler>
	//   49  100:dup             
	//   50  101:aload_2         
	//   51  102:aload_0         
	//   52  103:invokespecial   #116 <Method void Handler(Looper, android.os.Handler$Callback)>
	//   53  106:putfield        #118 <Field Handler handler>
		zzjq = googleapiavailability;
	//   54  109:aload_0         
	//   55  110:aload_3         
	//   56  111:putfield        #120 <Field GoogleApiAvailability zzjq>
		zzjr = new GoogleApiAvailabilityCache(((GoogleApiAvailabilityLight) (googleapiavailability)));
	//   57  114:aload_0         
	//   58  115:new             #122 <Class GoogleApiAvailabilityCache>
	//   59  118:dup             
	//   60  119:aload_3         
	//   61  120:invokespecial   #125 <Method void GoogleApiAvailabilityCache(GoogleApiAvailabilityLight)>
	//   62  123:putfield        #127 <Field GoogleApiAvailabilityCache zzjr>
		context = ((Context) (handler));
	//   63  126:aload_0         
	//   64  127:getfield        #118 <Field Handler handler>
	//   65  130:astore_1        
		((Handler) (context)).sendMessage(((Handler) (context)).obtainMessage(6));
	//   66  131:aload_1         
	//   67  132:aload_1         
	//   68  133:bipush          6
	//   69  135:invokevirtual   #131 <Method Message Handler.obtainMessage(int)>
	//   70  138:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//   71  141:pop             
	//   72  142:return          
	}

	public static void reportSignOut()
	{
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(zzjo != null)
	//*   4    6:getstatic       #139 <Field GoogleApiManager zzjo>
	//*   5    9:ifnull          41
			{
				GoogleApiManager googleapimanager = zzjo;
	//    6   12:getstatic       #139 <Field GoogleApiManager zzjo>
	//    7   15:astore_1        
				googleapimanager.zzjt.incrementAndGet();
	//    8   16:aload_1         
	//    9   17:getfield        #92  <Field AtomicInteger zzjt>
	//   10   20:invokevirtual   #143 <Method int AtomicInteger.incrementAndGet()>
	//   11   23:pop             
				googleapimanager.handler.sendMessageAtFrontOfQueue(googleapimanager.handler.obtainMessage(10));
	//   12   24:aload_1         
	//   13   25:getfield        #118 <Field Handler handler>
	//   14   28:aload_1         
	//   15   29:getfield        #118 <Field Handler handler>
	//   16   32:bipush          10
	//   17   34:invokevirtual   #131 <Method Message Handler.obtainMessage(int)>
	//   18   37:invokevirtual   #146 <Method boolean Handler.sendMessageAtFrontOfQueue(Message)>
	//   19   40:pop             
			}
		}
	//   20   41:aload_0         
	//   21   42:monitorexit     
		return;
	//   22   43:return          
		exception;
	//   23   44:astore_1        
		obj;
	//   24   45:aload_0         
		JVM INSTR monitorexit ;
	//   25   46:monitorexit     
		throw exception;
	//   26   47:aload_1         
	//   27   48:athrow          
	}

	static Handler zza(GoogleApiManager googleapimanager)
	{
		return googleapimanager.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler handler>
	//    2    4:areturn         
	}

	static Context zzb(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zzjp;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Context zzjp>
	//    2    4:areturn         
	}

	public static GoogleApiManager zzb(Context context)
	{
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(zzjo == null)
	//*   4    6:getstatic       #139 <Field GoogleApiManager zzjo>
	//*   5    9:ifnonnull       51
			{
				Object obj1 = ((Object) (new HandlerThread("GoogleApiHandler", 9)));
	//    6   12:new             #151 <Class HandlerThread>
	//    7   15:dup             
	//    8   16:ldc1            #153 <String "GoogleApiHandler">
	//    9   18:bipush          9
	//   10   20:invokespecial   #156 <Method void HandlerThread(String, int)>
	//   11   23:astore_2        
				((HandlerThread) (obj1)).start();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #159 <Method void HandlerThread.start()>
				obj1 = ((Object) (((HandlerThread) (obj1)).getLooper()));
	//   14   28:aload_2         
	//   15   29:invokevirtual   #163 <Method Looper HandlerThread.getLooper()>
	//   16   32:astore_2        
				zzjo = new GoogleApiManager(context.getApplicationContext(), ((Looper) (obj1)), GoogleApiAvailability.getInstance());
	//   17   33:new             #2   <Class GoogleApiManager>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokevirtual   #169 <Method Context Context.getApplicationContext()>
	//   21   41:aload_2         
	//   22   42:invokestatic    #175 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   23   45:invokespecial   #177 <Method void GoogleApiManager(Context, Looper, GoogleApiAvailability)>
	//   24   48:putstatic       #139 <Field GoogleApiManager zzjo>
			}
			context = ((Context) (zzjo));
	//   25   51:getstatic       #139 <Field GoogleApiManager zzjo>
	//   26   54:astore_0        
		}
	//   27   55:aload_1         
	//   28   56:monitorexit     
		return ((GoogleApiManager) (context));
	//   29   57:aload_0         
	//   30   58:areturn         
		context;
	//   31   59:astore_0        
		obj;
	//   32   60:aload_1         
		JVM INSTR monitorexit ;
	//   33   61:monitorexit     
		throw context;
	//   34   62:aload_0         
	//   35   63:athrow          
	}

	private final void zzb(GoogleApi googleapi)
	{
		zzh zzh1 = googleapi.zzm();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #185 <Method zzh GoogleApi.zzm()>
	//    2    4:astore          4
		zza zza2 = (zza)zzju.get(((Object) (zzh1)));
	//    3    6:aload_0         
	//    4    7:getfield        #100 <Field Map zzju>
	//    5   10:aload           4
	//    6   12:invokeinterface #191 <Method Object Map.get(Object)>
	//    7   17:checkcast       #8   <Class GoogleApiManager$zza>
	//    8   20:astore_3        
		zza zza1 = zza2;
	//    9   21:aload_3         
	//   10   22:astore_2        
		if(zza2 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       50
		{
			zza1 = new zza(googleapi);
	//   13   27:new             #8   <Class GoogleApiManager$zza>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #194 <Method void GoogleApiManager$zza(GoogleApiManager, GoogleApi)>
	//   18   36:astore_2        
			zzju.put(((Object) (zzh1)), ((Object) (zza1)));
	//   19   37:aload_0         
	//   20   38:getfield        #100 <Field Map zzju>
	//   21   41:aload           4
	//   22   43:aload_2         
	//   23   44:invokeinterface #198 <Method Object Map.put(Object, Object)>
	//   24   49:pop             
		}
		if(zza1.requiresSignIn())
	//*  25   50:aload_2         
	//*  26   51:invokevirtual   #202 <Method boolean GoogleApiManager$zza.requiresSignIn()>
	//*  27   54:ifeq            69
			zzjx.add(((Object) (zzh1)));
	//   28   57:aload_0         
	//   29   58:getfield        #109 <Field Set zzjx>
	//   30   61:aload           4
	//   31   63:invokeinterface #208 <Method boolean Set.add(Object)>
	//   32   68:pop             
		zza1.connect();
	//   33   69:aload_2         
	//   34   70:invokevirtual   #211 <Method void GoogleApiManager$zza.connect()>
	//   35   73:return          
	}

	public static GoogleApiManager zzbf()
	{
		GoogleApiManager googleapimanager;
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			Preconditions.checkNotNull(((Object) (zzjo)), "Must guarantee manager is non-null before using getInstance");
	//    4    6:getstatic       #139 <Field GoogleApiManager zzjo>
	//    5    9:ldc1            #217 <String "Must guarantee manager is non-null before using getInstance">
	//    6   11:invokestatic    #222 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   14:pop             
			googleapimanager = zzjo;
	//    8   15:getstatic       #139 <Field GoogleApiManager zzjo>
	//    9   18:astore_1        
		}
	//   10   19:aload_0         
	//   11   20:monitorexit     
		return googleapimanager;
	//   12   21:aload_1         
	//   13   22:areturn         
		exception;
	//   14   23:astore_1        
		obj;
	//   15   24:aload_0         
		JVM INSTR monitorexit ;
	//   16   25:monitorexit     
		throw exception;
	//   17   26:aload_1         
	//   18   27:athrow          
	}

	static Object zzbh()
	{
		return lock;
	//    0    0:getstatic       #69  <Field Object lock>
	//    1    3:areturn         
	}

	static Status zzbi()
	{
		return zzjk;
	//    0    0:getstatic       #65  <Field Status zzjk>
	//    1    3:areturn         
	}

	static long zzc(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zzjl;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field long zzjl>
	//    2    4:lreturn         
	}

	static long zzd(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zzjm;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field long zzjm>
	//    2    4:lreturn         
	}

	static GoogleApiAvailabilityCache zze(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zzjr;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field GoogleApiAvailabilityCache zzjr>
	//    2    4:areturn         
	}

	static zzad zzf(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zzjv;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field zzad zzjv>
	//    2    4:areturn         
	}

	static Set zzg(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zzjw;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Set zzjw>
	//    2    4:areturn         
	}

	static GoogleApiAvailability zzh(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zzjq;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field GoogleApiAvailability zzjq>
	//    2    4:areturn         
	}

	static long zzi(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zzjn;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field long zzjn>
	//    2    4:lreturn         
	}

	static Map zzj(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zzju;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Map zzju>
	//    2    4:areturn         
	}

	public boolean handleMessage(Message message)
	{
		int i;
		long l;
		i = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #246 <Field int Message.what>
	//    2    4:istore_2        
		l = 0x493e0L;
	//    3    5:ldc2w           #247 <Long 0x493e0L>
	//    4    8:lstore_3        
		i;
	//    5    9:iload_2         
		JVM INSTR tableswitch 1 16: default 88
	//	               1 1087
	//	               2 945
	//	               3 897
	//	               4 778
	//	               5 554
	//	               6 489
	//	               7 476
	//	               8 778
	//	               9 439
	//	               10 378
	//	               11 341
	//	               12 303
	//	               13 778
	//	               14 221
	//	               15 175
	//	               16 129;
	//    6   10:tableswitch     1 16: default 88
	//	               1 1087
	//	               2 945
	//	               3 897
	//	               4 778
	//	               5 554
	//	               6 489
	//	               7 476
	//	               8 778
	//	               9 439
	//	               10 378
	//	               11 341
	//	               12 303
	//	               13 778
	//	               14 221
	//	               15 175
	//	               16 129
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L5 _L9 _L10 _L11 _L12 _L5 _L13 _L14 _L15
_L1:
		i = message.what;
	//    7   88:aload_1         
	//    8   89:getfield        #246 <Field int Message.what>
	//    9   92:istore_2        
		message = ((Message) (new StringBuilder(31)));
	//   10   93:new             #250 <Class StringBuilder>
	//   11   96:dup             
	//   12   97:bipush          31
	//   13   99:invokespecial   #251 <Method void StringBuilder(int)>
	//   14  102:astore_1        
		((StringBuilder) (message)).append("Unknown message id: ");
	//   15  103:aload_1         
	//   16  104:ldc1            #253 <String "Unknown message id: ">
	//   17  106:invokevirtual   #257 <Method StringBuilder StringBuilder.append(String)>
	//   18  109:pop             
		((StringBuilder) (message)).append(i);
	//   19  110:aload_1         
	//   20  111:iload_2         
	//   21  112:invokevirtual   #260 <Method StringBuilder StringBuilder.append(int)>
	//   22  115:pop             
		Log.w("GoogleApiManager", ((StringBuilder) (message)).toString());
	//   23  116:ldc2            #262 <String "GoogleApiManager">
	//   24  119:aload_1         
	//   25  120:invokevirtual   #266 <Method String StringBuilder.toString()>
	//   26  123:invokestatic    #272 <Method int Log.w(String, String)>
	//   27  126:pop             
		return false;
	//   28  127:iconst_0        
	//   29  128:ireturn         
_L15:
		message = ((Message) ((zzb)message.obj));
	//   30  129:aload_1         
	//   31  130:getfield        #275 <Field Object Message.obj>
	//   32  133:checkcast       #11  <Class GoogleApiManager$zzb>
	//   33  136:astore_1        
		if(zzju.containsKey(((Object) (zzb.zzc(((zzb) (message)))))))
	//*  34  137:aload_0         
	//*  35  138:getfield        #100 <Field Map zzju>
	//*  36  141:aload_1         
	//*  37  142:invokestatic    #278 <Method zzh GoogleApiManager$zzb.zzc(GoogleApiManager$zzb)>
	//*  38  145:invokeinterface #281 <Method boolean Map.containsKey(Object)>
	//*  39  150:ifeq            1181
		{
			zza.zzb((zza)zzju.get(((Object) (zzb.zzc(((zzb) (message)))))), ((zzb) (message)));
	//   40  153:aload_0         
	//   41  154:getfield        #100 <Field Map zzju>
	//   42  157:aload_1         
	//   43  158:invokestatic    #278 <Method zzh GoogleApiManager$zzb.zzc(GoogleApiManager$zzb)>
	//   44  161:invokeinterface #191 <Method Object Map.get(Object)>
	//   45  166:checkcast       #8   <Class GoogleApiManager$zza>
	//   46  169:aload_1         
	//   47  170:invokestatic    #284 <Method void GoogleApiManager$zza.zzb(GoogleApiManager$zza, GoogleApiManager$zzb)>
			return true;
	//   48  173:iconst_1        
	//   49  174:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L14:
		message = ((Message) ((zzb)message.obj));
	//   50  175:aload_1         
	//   51  176:getfield        #275 <Field Object Message.obj>
	//   52  179:checkcast       #11  <Class GoogleApiManager$zzb>
	//   53  182:astore_1        
		if(zzju.containsKey(((Object) (zzb.zzc(((zzb) (message)))))))
	//*  54  183:aload_0         
	//*  55  184:getfield        #100 <Field Map zzju>
	//*  56  187:aload_1         
	//*  57  188:invokestatic    #278 <Method zzh GoogleApiManager$zzb.zzc(GoogleApiManager$zzb)>
	//*  58  191:invokeinterface #281 <Method boolean Map.containsKey(Object)>
	//*  59  196:ifeq            1181
		{
			zza.zza((zza)zzju.get(((Object) (zzb.zzc(((zzb) (message)))))), ((zzb) (message)));
	//   60  199:aload_0         
	//   61  200:getfield        #100 <Field Map zzju>
	//   62  203:aload_1         
	//   63  204:invokestatic    #278 <Method zzh GoogleApiManager$zzb.zzc(GoogleApiManager$zzb)>
	//   64  207:invokeinterface #191 <Method Object Map.get(Object)>
	//   65  212:checkcast       #8   <Class GoogleApiManager$zza>
	//   66  215:aload_1         
	//   67  216:invokestatic    #286 <Method void GoogleApiManager$zza.zza(GoogleApiManager$zza, GoogleApiManager$zzb)>
			return true;
	//   68  219:iconst_1        
	//   69  220:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L13:
		message = ((Message) ((zzae)message.obj));
	//   70  221:aload_1         
	//   71  222:getfield        #275 <Field Object Message.obj>
	//   72  225:checkcast       #288 <Class zzae>
	//   73  228:astore_1        
		Object obj = ((Object) (((zzae) (message)).zzm()));
	//   74  229:aload_1         
	//   75  230:invokevirtual   #289 <Method zzh zzae.zzm()>
	//   76  233:astore          6
		if(!zzju.containsKey(obj))
	//*  77  235:aload_0         
	//*  78  236:getfield        #100 <Field Map zzju>
	//*  79  239:aload           6
	//*  80  241:invokeinterface #281 <Method boolean Map.containsKey(Object)>
	//*  81  246:ifne            263
		{
			obj = ((Object) (((zzae) (message)).zzao()));
	//   82  249:aload_1         
	//   83  250:invokevirtual   #293 <Method TaskCompletionSource zzae.zzao()>
	//   84  253:astore          6
			message = ((Message) (Boolean.valueOf(false)));
	//   85  255:iconst_0        
	//   86  256:invokestatic    #299 <Method Boolean Boolean.valueOf(boolean)>
	//   87  259:astore_1        
		} else
	//*  88  260:goto            295
		{
			boolean flag = zza.zza((zza)zzju.get(obj), false);
	//   89  263:aload_0         
	//   90  264:getfield        #100 <Field Map zzju>
	//   91  267:aload           6
	//   92  269:invokeinterface #191 <Method Object Map.get(Object)>
	//   93  274:checkcast       #8   <Class GoogleApiManager$zza>
	//   94  277:iconst_0        
	//   95  278:invokestatic    #302 <Method boolean GoogleApiManager$zza.zza(GoogleApiManager$zza, boolean)>
	//   96  281:istore          5
			obj = ((Object) (((zzae) (message)).zzao()));
	//   97  283:aload_1         
	//   98  284:invokevirtual   #293 <Method TaskCompletionSource zzae.zzao()>
	//   99  287:astore          6
			message = ((Message) (Boolean.valueOf(flag)));
	//  100  289:iload           5
	//  101  291:invokestatic    #299 <Method Boolean Boolean.valueOf(boolean)>
	//  102  294:astore_1        
		}
		((TaskCompletionSource) (obj)).setResult(((Object) (message)));
	//  103  295:aload           6
	//  104  297:aload_1         
	//  105  298:invokevirtual   #308 <Method void TaskCompletionSource.setResult(Object)>
		return true;
	//  106  301:iconst_1        
	//  107  302:ireturn         
_L12:
		if(zzju.containsKey(message.obj))
	//* 108  303:aload_0         
	//* 109  304:getfield        #100 <Field Map zzju>
	//* 110  307:aload_1         
	//* 111  308:getfield        #275 <Field Object Message.obj>
	//* 112  311:invokeinterface #281 <Method boolean Map.containsKey(Object)>
	//* 113  316:ifeq            1181
		{
			((zza)zzju.get(message.obj)).zzbs();
	//  114  319:aload_0         
	//  115  320:getfield        #100 <Field Map zzju>
	//  116  323:aload_1         
	//  117  324:getfield        #275 <Field Object Message.obj>
	//  118  327:invokeinterface #191 <Method Object Map.get(Object)>
	//  119  332:checkcast       #8   <Class GoogleApiManager$zza>
	//  120  335:invokevirtual   #311 <Method boolean GoogleApiManager$zza.zzbs()>
	//  121  338:pop             
			return true;
	//  122  339:iconst_1        
	//  123  340:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L11:
		if(zzju.containsKey(message.obj))
	//* 124  341:aload_0         
	//* 125  342:getfield        #100 <Field Map zzju>
	//* 126  345:aload_1         
	//* 127  346:getfield        #275 <Field Object Message.obj>
	//* 128  349:invokeinterface #281 <Method boolean Map.containsKey(Object)>
	//* 129  354:ifeq            1181
		{
			((zza)zzju.get(message.obj)).zzay();
	//  130  357:aload_0         
	//  131  358:getfield        #100 <Field Map zzju>
	//  132  361:aload_1         
	//  133  362:getfield        #275 <Field Object Message.obj>
	//  134  365:invokeinterface #191 <Method Object Map.get(Object)>
	//  135  370:checkcast       #8   <Class GoogleApiManager$zza>
	//  136  373:invokevirtual   #314 <Method void GoogleApiManager$zza.zzay()>
			return true;
	//  137  376:iconst_1        
	//  138  377:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L10:
		zzh zzh1;
		for(message = ((Message) (zzjx.iterator())); ((Iterator) (message)).hasNext(); ((zza)zzju.remove(((Object) (zzh1)))).zzbm())
	//* 139  378:aload_0         
	//* 140  379:getfield        #109 <Field Set zzjx>
	//* 141  382:invokeinterface #318 <Method Iterator Set.iterator()>
	//* 142  387:astore_1        
	//* 143  388:aload_1         
	//* 144  389:invokeinterface #323 <Method boolean Iterator.hasNext()>
	//* 145  394:ifeq            428
			zzh1 = (zzh)((Iterator) (message)).next();
	//  146  397:aload_1         
	//  147  398:invokeinterface #326 <Method Object Iterator.next()>
	//  148  403:checkcast       #328 <Class zzh>
	//  149  406:astore          6

	//  150  408:aload_0         
	//  151  409:getfield        #100 <Field Map zzju>
	//  152  412:aload           6
	//  153  414:invokeinterface #331 <Method Object Map.remove(Object)>
	//  154  419:checkcast       #8   <Class GoogleApiManager$zza>
	//  155  422:invokevirtual   #334 <Method void GoogleApiManager$zza.zzbm()>
	//* 156  425:goto            388
		zzjx.clear();
	//  157  428:aload_0         
	//  158  429:getfield        #109 <Field Set zzjx>
	//  159  432:invokeinterface #337 <Method void Set.clear()>
		return true;
	//  160  437:iconst_1        
	//  161  438:ireturn         
_L9:
		if(zzju.containsKey(message.obj))
	//* 162  439:aload_0         
	//* 163  440:getfield        #100 <Field Map zzju>
	//* 164  443:aload_1         
	//* 165  444:getfield        #275 <Field Object Message.obj>
	//* 166  447:invokeinterface #281 <Method boolean Map.containsKey(Object)>
	//* 167  452:ifeq            1181
		{
			((zza)zzju.get(message.obj)).resume();
	//  168  455:aload_0         
	//  169  456:getfield        #100 <Field Map zzju>
	//  170  459:aload_1         
	//  171  460:getfield        #275 <Field Object Message.obj>
	//  172  463:invokeinterface #191 <Method Object Map.get(Object)>
	//  173  468:checkcast       #8   <Class GoogleApiManager$zza>
	//  174  471:invokevirtual   #340 <Method void GoogleApiManager$zza.resume()>
			return true;
	//  175  474:iconst_1        
	//  176  475:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L8:
		zzb((GoogleApi)message.obj);
	//  177  476:aload_0         
	//  178  477:aload_1         
	//  179  478:getfield        #275 <Field Object Message.obj>
	//  180  481:checkcast       #181 <Class GoogleApi>
	//  181  484:invokespecial   #342 <Method void zzb(GoogleApi)>
		return true;
	//  182  487:iconst_1        
	//  183  488:ireturn         
_L7:
		if(!PlatformVersion.isAtLeastIceCreamSandwich() || !(zzjp.getApplicationContext() instanceof Application))
			break; /* Loop/switch isn't completed */
	//  184  489:invokestatic    #347 <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//  185  492:ifeq            1181
	//  186  495:aload_0         
	//  187  496:getfield        #111 <Field Context zzjp>
	//  188  499:invokevirtual   #169 <Method Context Context.getApplicationContext()>
	//  189  502:instanceof      #349 <Class Application>
	//  190  505:ifeq            1181
		BackgroundDetector.initialize((Application)zzjp.getApplicationContext());
	//  191  508:aload_0         
	//  192  509:getfield        #111 <Field Context zzjp>
	//  193  512:invokevirtual   #169 <Method Context Context.getApplicationContext()>
	//  194  515:checkcast       #349 <Class Application>
	//  195  518:invokestatic    #355 <Method void BackgroundDetector.initialize(Application)>
		BackgroundDetector.getInstance().addListener(((BackgroundDetector.BackgroundStateChangeListener) (new zzbh(this))));
	//  196  521:invokestatic    #358 <Method BackgroundDetector BackgroundDetector.getInstance()>
	//  197  524:new             #360 <Class zzbh>
	//  198  527:dup             
	//  199  528:aload_0         
	//  200  529:invokespecial   #363 <Method void zzbh(GoogleApiManager)>
	//  201  532:invokevirtual   #367 <Method void BackgroundDetector.addListener(BackgroundDetector$BackgroundStateChangeListener)>
		if(!BackgroundDetector.getInstance().readCurrentStateIfPossible(true))
	//* 202  535:invokestatic    #358 <Method BackgroundDetector BackgroundDetector.getInstance()>
	//* 203  538:iconst_1        
	//* 204  539:invokevirtual   #371 <Method boolean BackgroundDetector.readCurrentStateIfPossible(boolean)>
	//* 205  542:ifne            1181
		{
			zzjn = 0x493e0L;
	//  206  545:aload_0         
	//  207  546:ldc2w           #247 <Long 0x493e0L>
	//  208  549:putfield        #83  <Field long zzjn>
			return true;
	//  209  552:iconst_1        
	//  210  553:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L6:
		Object obj1;
		Iterator iterator1;
		i = message.arg1;
	//  211  554:aload_1         
	//  212  555:getfield        #374 <Field int Message.arg1>
	//  213  558:istore_2        
		obj1 = ((Object) ((ConnectionResult)message.obj));
	//  214  559:aload_1         
	//  215  560:getfield        #275 <Field Object Message.obj>
	//  216  563:checkcast       #376 <Class ConnectionResult>
	//  217  566:astore          6
		iterator1 = zzju.values().iterator();
	//  218  568:aload_0         
	//  219  569:getfield        #100 <Field Map zzju>
	//  220  572:invokeinterface #380 <Method Collection Map.values()>
	//  221  577:invokeinterface #383 <Method Iterator Collection.iterator()>
	//  222  582:astore          7
_L19:
		if(!iterator1.hasNext()) goto _L17; else goto _L16
	//  223  584:aload           7
	//  224  586:invokeinterface #323 <Method boolean Iterator.hasNext()>
	//  225  591:ifeq            616
_L16:
		message = ((Message) ((zza)iterator1.next()));
	//  226  594:aload           7
	//  227  596:invokeinterface #326 <Method Object Iterator.next()>
	//  228  601:checkcast       #8   <Class GoogleApiManager$zza>
	//  229  604:astore_1        
		if(((zza) (message)).getInstanceId() != i) goto _L19; else goto _L18
	//  230  605:aload_1         
	//  231  606:invokevirtual   #386 <Method int GoogleApiManager$zza.getInstanceId()>
	//  232  609:iload_2         
	//  233  610:icmpne          584
	//* 234  613:goto            618
_L17:
		message = null;
	//  235  616:aconst_null     
	//  236  617:astore_1        
_L18:
		if(message != null)
	//* 237  618:aload_1         
	//* 238  619:ifnull          726
		{
			String s = ((GoogleApiAvailabilityLight) (zzjq)).getErrorString(((ConnectionResult) (obj1)).getErrorCode());
	//  239  622:aload_0         
	//  240  623:getfield        #120 <Field GoogleApiAvailability zzjq>
	//  241  626:aload           6
	//  242  628:invokevirtual   #389 <Method int ConnectionResult.getErrorCode()>
	//  243  631:invokevirtual   #395 <Method String GoogleApiAvailabilityLight.getErrorString(int)>
	//  244  634:astore          7
			obj1 = ((Object) (((ConnectionResult) (obj1)).getErrorMessage()));
	//  245  636:aload           6
	//  246  638:invokevirtual   #398 <Method String ConnectionResult.getErrorMessage()>
	//  247  641:astore          6
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 69 + String.valueOf(obj1).length());
	//  248  643:new             #250 <Class StringBuilder>
	//  249  646:dup             
	//  250  647:aload           7
	//  251  649:invokestatic    #403 <Method String String.valueOf(Object)>
	//  252  652:invokevirtual   #406 <Method int String.length()>
	//  253  655:bipush          69
	//  254  657:iadd            
	//  255  658:aload           6
	//  256  660:invokestatic    #403 <Method String String.valueOf(Object)>
	//  257  663:invokevirtual   #406 <Method int String.length()>
	//  258  666:iadd            
	//  259  667:invokespecial   #251 <Method void StringBuilder(int)>
	//  260  670:astore          8
			stringbuilder.append("Error resolution was canceled by the user, original error message: ");
	//  261  672:aload           8
	//  262  674:ldc2            #408 <String "Error resolution was canceled by the user, original error message: ">
	//  263  677:invokevirtual   #257 <Method StringBuilder StringBuilder.append(String)>
	//  264  680:pop             
			stringbuilder.append(s);
	//  265  681:aload           8
	//  266  683:aload           7
	//  267  685:invokevirtual   #257 <Method StringBuilder StringBuilder.append(String)>
	//  268  688:pop             
			stringbuilder.append(": ");
	//  269  689:aload           8
	//  270  691:ldc2            #410 <String ": ">
	//  271  694:invokevirtual   #257 <Method StringBuilder StringBuilder.append(String)>
	//  272  697:pop             
			stringbuilder.append(((String) (obj1)));
	//  273  698:aload           8
	//  274  700:aload           6
	//  275  702:invokevirtual   #257 <Method StringBuilder StringBuilder.append(String)>
	//  276  705:pop             
			((zza) (message)).zzc(new Status(17, stringbuilder.toString()));
	//  277  706:aload_1         
	//  278  707:new             #53  <Class Status>
	//  279  710:dup             
	//  280  711:bipush          17
	//  281  713:aload           8
	//  282  715:invokevirtual   #266 <Method String StringBuilder.toString()>
	//  283  718:invokespecial   #59  <Method void Status(int, String)>
	//  284  721:invokevirtual   #413 <Method void GoogleApiManager$zza.zzc(Status)>
			return true;
	//  285  724:iconst_1        
	//  286  725:ireturn         
		} else
		{
			message = ((Message) (new StringBuilder(76)));
	//  287  726:new             #250 <Class StringBuilder>
	//  288  729:dup             
	//  289  730:bipush          76
	//  290  732:invokespecial   #251 <Method void StringBuilder(int)>
	//  291  735:astore_1        
			((StringBuilder) (message)).append("Could not find API instance ");
	//  292  736:aload_1         
	//  293  737:ldc2            #415 <String "Could not find API instance ">
	//  294  740:invokevirtual   #257 <Method StringBuilder StringBuilder.append(String)>
	//  295  743:pop             
			((StringBuilder) (message)).append(i);
	//  296  744:aload_1         
	//  297  745:iload_2         
	//  298  746:invokevirtual   #260 <Method StringBuilder StringBuilder.append(int)>
	//  299  749:pop             
			((StringBuilder) (message)).append(" while trying to fail enqueued calls.");
	//  300  750:aload_1         
	//  301  751:ldc2            #417 <String " while trying to fail enqueued calls.">
	//  302  754:invokevirtual   #257 <Method StringBuilder StringBuilder.append(String)>
	//  303  757:pop             
			Log.wtf("GoogleApiManager", ((StringBuilder) (message)).toString(), ((Throwable) (new Exception())));
	//  304  758:ldc2            #262 <String "GoogleApiManager">
	//  305  761:aload_1         
	//  306  762:invokevirtual   #266 <Method String StringBuilder.toString()>
	//  307  765:new             #419 <Class Exception>
	//  308  768:dup             
	//  309  769:invokespecial   #420 <Method void Exception()>
	//  310  772:invokestatic    #424 <Method int Log.wtf(String, String, Throwable)>
	//  311  775:pop             
			return true;
	//  312  776:iconst_1        
	//  313  777:ireturn         
		}
_L5:
		zzbu zzbu1 = (zzbu)message.obj;
	//  314  778:aload_1         
	//  315  779:getfield        #275 <Field Object Message.obj>
	//  316  782:checkcast       #426 <Class zzbu>
	//  317  785:astore          7
		zza zza1 = (zza)zzju.get(((Object) (zzbu1.zzlr.zzm())));
	//  318  787:aload_0         
	//  319  788:getfield        #100 <Field Map zzju>
	//  320  791:aload           7
	//  321  793:getfield        #430 <Field GoogleApi zzbu.zzlr>
	//  322  796:invokevirtual   #185 <Method zzh GoogleApi.zzm()>
	//  323  799:invokeinterface #191 <Method Object Map.get(Object)>
	//  324  804:checkcast       #8   <Class GoogleApiManager$zza>
	//  325  807:astore          6
		message = ((Message) (zza1));
	//  326  809:aload           6
	//  327  811:astore_1        
		if(zza1 == null)
	//* 328  812:aload           6
	//* 329  814:ifnonnull       847
		{
			zzb(zzbu1.zzlr);
	//  330  817:aload_0         
	//  331  818:aload           7
	//  332  820:getfield        #430 <Field GoogleApi zzbu.zzlr>
	//  333  823:invokespecial   #342 <Method void zzb(GoogleApi)>
			message = ((Message) ((zza)zzju.get(((Object) (zzbu1.zzlr.zzm())))));
	//  334  826:aload_0         
	//  335  827:getfield        #100 <Field Map zzju>
	//  336  830:aload           7
	//  337  832:getfield        #430 <Field GoogleApi zzbu.zzlr>
	//  338  835:invokevirtual   #185 <Method zzh GoogleApi.zzm()>
	//  339  838:invokeinterface #191 <Method Object Map.get(Object)>
	//  340  843:checkcast       #8   <Class GoogleApiManager$zza>
	//  341  846:astore_1        
		}
		if(((zza) (message)).requiresSignIn() && zzjt.get() != zzbu1.zzlq)
	//* 342  847:aload_1         
	//* 343  848:invokevirtual   #202 <Method boolean GoogleApiManager$zza.requiresSignIn()>
	//* 344  851:ifeq            886
	//* 345  854:aload_0         
	//* 346  855:getfield        #92  <Field AtomicInteger zzjt>
	//* 347  858:invokevirtual   #432 <Method int AtomicInteger.get()>
	//* 348  861:aload           7
	//* 349  863:getfield        #435 <Field int zzbu.zzlq>
	//* 350  866:icmpeq          886
		{
			zzbu1.zzlp.zza(zzjj);
	//  351  869:aload           7
	//  352  871:getfield        #439 <Field zzb zzbu.zzlp>
	//  353  874:getstatic       #61  <Field Status zzjj>
	//  354  877:invokevirtual   #443 <Method void zzb.zza(Status)>
			((zza) (message)).zzbm();
	//  355  880:aload_1         
	//  356  881:invokevirtual   #334 <Method void GoogleApiManager$zza.zzbm()>
			return true;
	//  357  884:iconst_1        
	//  358  885:ireturn         
		} else
		{
			((zza) (message)).zza(zzbu1.zzlp);
	//  359  886:aload_1         
	//  360  887:aload           7
	//  361  889:getfield        #439 <Field zzb zzbu.zzlp>
	//  362  892:invokevirtual   #446 <Method void GoogleApiManager$zza.zza(zzb)>
			return true;
	//  363  895:iconst_1        
	//  364  896:ireturn         
		}
_L4:
		zza zza2;
		for(message = ((Message) (zzju.values().iterator())); ((Iterator) (message)).hasNext(); zza2.connect())
	//* 365  897:aload_0         
	//* 366  898:getfield        #100 <Field Map zzju>
	//* 367  901:invokeinterface #380 <Method Collection Map.values()>
	//* 368  906:invokeinterface #383 <Method Iterator Collection.iterator()>
	//* 369  911:astore_1        
	//* 370  912:aload_1         
	//* 371  913:invokeinterface #323 <Method boolean Iterator.hasNext()>
	//* 372  918:ifeq            1181
		{
			zza2 = (zza)((Iterator) (message)).next();
	//  373  921:aload_1         
	//  374  922:invokeinterface #326 <Method Object Iterator.next()>
	//  375  927:checkcast       #8   <Class GoogleApiManager$zza>
	//  376  930:astore          6
			zza2.zzbo();
	//  377  932:aload           6
	//  378  934:invokevirtual   #449 <Method void GoogleApiManager$zza.zzbo()>
		}

	//  379  937:aload           6
	//  380  939:invokevirtual   #211 <Method void GoogleApiManager$zza.connect()>
		break; /* Loop/switch isn't completed */
	//  381  942:goto            912
_L3:
		message = ((Message) ((zzj)message.obj));
	//  382  945:aload_1         
	//  383  946:getfield        #275 <Field Object Message.obj>
	//  384  949:checkcast       #451 <Class zzj>
	//  385  952:astore_1        
		Iterator iterator = ((zzj) (message)).zzs().iterator();
	//  386  953:aload_1         
	//  387  954:invokevirtual   #455 <Method Set zzj.zzs()>
	//  388  957:invokeinterface #318 <Method Iterator Set.iterator()>
	//  389  962:astore          6
		do
		{
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
	//  390  964:aload           6
	//  391  966:invokeinterface #323 <Method boolean Iterator.hasNext()>
	//  392  971:ifeq            1181
			zzh zzh3 = (zzh)iterator.next();
	//  393  974:aload           6
	//  394  976:invokeinterface #326 <Method Object Iterator.next()>
	//  395  981:checkcast       #328 <Class zzh>
	//  396  984:astore          7
			zza zza3 = (zza)zzju.get(((Object) (zzh3)));
	//  397  986:aload_0         
	//  398  987:getfield        #100 <Field Map zzju>
	//  399  990:aload           7
	//  400  992:invokeinterface #191 <Method Object Map.get(Object)>
	//  401  997:checkcast       #8   <Class GoogleApiManager$zza>
	//  402 1000:astore          8
			if(zza3 == null)
	//* 403 1002:aload           8
	//* 404 1004:ifnonnull       1025
			{
				((zzj) (message)).zza(zzh3, new ConnectionResult(13), ((String) (null)));
	//  405 1007:aload_1         
	//  406 1008:aload           7
	//  407 1010:new             #376 <Class ConnectionResult>
	//  408 1013:dup             
	//  409 1014:bipush          13
	//  410 1016:invokespecial   #456 <Method void ConnectionResult(int)>
	//  411 1019:aconst_null     
	//  412 1020:invokevirtual   #459 <Method void zzj.zza(zzh, ConnectionResult, String)>
				return true;
	//  413 1023:iconst_1        
	//  414 1024:ireturn         
			}
			if(zza3.isConnected())
	//* 415 1025:aload           8
	//* 416 1027:invokevirtual   #462 <Method boolean GoogleApiManager$zza.isConnected()>
	//* 417 1030:ifeq            1055
				((zzj) (message)).zza(zzh3, ConnectionResult.RESULT_SUCCESS, zza3.zzae().getEndpointPackageName());
	//  418 1033:aload_1         
	//  419 1034:aload           7
	//  420 1036:getstatic       #466 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//  421 1039:aload           8
	//  422 1041:invokevirtual   #470 <Method com.google.android.gms.common.api.Api$Client GoogleApiManager$zza.zzae()>
	//  423 1044:invokeinterface #475 <Method String com.google.android.gms.common.api.Api$Client.getEndpointPackageName()>
	//  424 1049:invokevirtual   #459 <Method void zzj.zza(zzh, ConnectionResult, String)>
			else
	//* 425 1052:goto            964
			if(zza3.zzbp() != null)
	//* 426 1055:aload           8
	//* 427 1057:invokevirtual   #479 <Method ConnectionResult GoogleApiManager$zza.zzbp()>
	//* 428 1060:ifnull          1078
				((zzj) (message)).zza(zzh3, zza3.zzbp(), ((String) (null)));
	//  429 1063:aload_1         
	//  430 1064:aload           7
	//  431 1066:aload           8
	//  432 1068:invokevirtual   #479 <Method ConnectionResult GoogleApiManager$zza.zzbp()>
	//  433 1071:aconst_null     
	//  434 1072:invokevirtual   #459 <Method void zzj.zza(zzh, ConnectionResult, String)>
			else
	//* 435 1075:goto            964
				zza3.zza(((zzj) (message)));
	//  436 1078:aload           8
	//  437 1080:aload_1         
	//  438 1081:invokevirtual   #482 <Method void GoogleApiManager$zza.zza(zzj)>
		} while(true);
	//  439 1084:goto            964
_L2:
		if(((Boolean)message.obj).booleanValue())
	//* 440 1087:aload_1         
	//* 441 1088:getfield        #275 <Field Object Message.obj>
	//* 442 1091:checkcast       #295 <Class Boolean>
	//* 443 1094:invokevirtual   #485 <Method boolean Boolean.booleanValue()>
	//* 444 1097:ifeq            1104
			l = 10000L;
	//  445 1100:ldc2w           #80  <Long 10000L>
	//  446 1103:lstore_3        
		zzjn = l;
	//  447 1104:aload_0         
	//  448 1105:lload_3         
	//  449 1106:putfield        #83  <Field long zzjn>
		handler.removeMessages(12);
	//  450 1109:aload_0         
	//  451 1110:getfield        #118 <Field Handler handler>
	//  452 1113:bipush          12
	//  453 1115:invokevirtual   #488 <Method void Handler.removeMessages(int)>
		zzh zzh2;
		Handler handler1;
		for(message = ((Message) (zzju.keySet().iterator())); ((Iterator) (message)).hasNext(); handler1.sendMessageDelayed(handler1.obtainMessage(12, ((Object) (zzh2))), zzjn))
	//* 454 1118:aload_0         
	//* 455 1119:getfield        #100 <Field Map zzju>
	//* 456 1122:invokeinterface #491 <Method Set Map.keySet()>
	//* 457 1127:invokeinterface #318 <Method Iterator Set.iterator()>
	//* 458 1132:astore_1        
	//* 459 1133:aload_1         
	//* 460 1134:invokeinterface #323 <Method boolean Iterator.hasNext()>
	//* 461 1139:ifeq            1181
		{
			zzh2 = (zzh)((Iterator) (message)).next();
	//  462 1142:aload_1         
	//  463 1143:invokeinterface #326 <Method Object Iterator.next()>
	//  464 1148:checkcast       #328 <Class zzh>
	//  465 1151:astore          6
			handler1 = handler;
	//  466 1153:aload_0         
	//  467 1154:getfield        #118 <Field Handler handler>
	//  468 1157:astore          7
		}

	//  469 1159:aload           7
	//  470 1161:aload           7
	//  471 1163:bipush          12
	//  472 1165:aload           6
	//  473 1167:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//  474 1170:aload_0         
	//  475 1171:getfield        #83  <Field long zzjn>
	//  476 1174:invokevirtual   #498 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//  477 1177:pop             
	//* 478 1178:goto            1133
		return true;
	//  479 1181:iconst_1        
	//  480 1182:ireturn         
	}

	final void maybeSignOut()
	{
		zzjt.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field AtomicInteger zzjt>
	//    2    4:invokevirtual   #143 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		Handler handler1 = handler;
	//    4    8:aload_0         
	//    5    9:getfield        #118 <Field Handler handler>
	//    6   12:astore_1        
		handler1.sendMessage(handler1.obtainMessage(10));
	//    7   13:aload_1         
	//    8   14:aload_1         
	//    9   15:bipush          10
	//   10   17:invokevirtual   #131 <Method Message Handler.obtainMessage(int)>
	//   11   20:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//   12   23:pop             
	//   13   24:return          
	}

	final PendingIntent zza(zzh zzh1, int i)
	{
		zzh1 = ((zzh) ((zza)zzju.get(((Object) (zzh1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Map zzju>
	//    2    4:aload_1         
	//    3    5:invokeinterface #191 <Method Object Map.get(Object)>
	//    4   10:checkcast       #8   <Class GoogleApiManager$zza>
	//    5   13:astore_1        
		if(zzh1 == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		zzh1 = ((zzh) (((zza) (zzh1)).zzbt()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #504 <Method SignInClient GoogleApiManager$zza.zzbt()>
	//   12   24:astore_1        
		if(zzh1 == null)
	//*  13   25:aload_1         
	//*  14   26:ifnonnull       31
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
		else
			return PendingIntent.getActivity(zzjp, i, ((SignInClient) (zzh1)).getSignInIntent(), 0x8000000);
	//   17   31:aload_0         
	//   18   32:getfield        #111 <Field Context zzjp>
	//   19   35:iload_2         
	//   20   36:aload_1         
	//   21   37:invokeinterface #510 <Method android.content.Intent SignInClient.getSignInIntent()>
	//   22   42:ldc2            #511 <Int 0x8000000>
	//   23   45:invokestatic    #517 <Method PendingIntent PendingIntent.getActivity(Context, int, android.content.Intent, int)>
	//   24   48:areturn         
	}

	public final Task zza(GoogleApi googleapi, ListenerHolder.ListenerKey listenerkey)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #304 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #521 <Method void TaskCompletionSource()>
	//    3    7:astore_3        
		listenerkey = ((ListenerHolder.ListenerKey) (new zzg(listenerkey, taskcompletionsource)));
	//    4    8:new             #523 <Class zzg>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokespecial   #526 <Method void zzg(ListenerHolder$ListenerKey, TaskCompletionSource)>
	//    9   17:astore_2        
		Handler handler1 = handler;
	//   10   18:aload_0         
	//   11   19:getfield        #118 <Field Handler handler>
	//   12   22:astore          4
		handler1.sendMessage(handler1.obtainMessage(13, ((Object) (new zzbu(((com.google.android.gms.common.api.internal.zzb) (listenerkey)), zzjt.get(), googleapi)))));
	//   13   24:aload           4
	//   14   26:aload           4
	//   15   28:bipush          13
	//   16   30:new             #426 <Class zzbu>
	//   17   33:dup             
	//   18   34:aload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #92  <Field AtomicInteger zzjt>
	//   21   39:invokevirtual   #432 <Method int AtomicInteger.get()>
	//   22   42:aload_1         
	//   23   43:invokespecial   #529 <Method void zzbu(zzb, int, GoogleApi)>
	//   24   46:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   25   49:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//   26   52:pop             
		return taskcompletionsource.getTask();
	//   27   53:aload_3         
	//   28   54:invokevirtual   #533 <Method Task TaskCompletionSource.getTask()>
	//   29   57:areturn         
	}

	public final Task zza(GoogleApi googleapi, RegisterListenerMethod registerlistenermethod, UnregisterListenerMethod unregisterlistenermethod)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #304 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #521 <Method void TaskCompletionSource()>
	//    3    7:astore          4
		registerlistenermethod = ((RegisterListenerMethod) (new zze(new zzbv(registerlistenermethod, unregisterlistenermethod), taskcompletionsource)));
	//    4    9:new             #538 <Class zze>
	//    5   12:dup             
	//    6   13:new             #540 <Class zzbv>
	//    7   16:dup             
	//    8   17:aload_2         
	//    9   18:aload_3         
	//   10   19:invokespecial   #543 <Method void zzbv(RegisterListenerMethod, UnregisterListenerMethod)>
	//   11   22:aload           4
	//   12   24:invokespecial   #546 <Method void zze(zzbv, TaskCompletionSource)>
	//   13   27:astore_2        
		unregisterlistenermethod = ((UnregisterListenerMethod) (handler));
	//   14   28:aload_0         
	//   15   29:getfield        #118 <Field Handler handler>
	//   16   32:astore_3        
		((Handler) (unregisterlistenermethod)).sendMessage(((Handler) (unregisterlistenermethod)).obtainMessage(8, ((Object) (new zzbu(((com.google.android.gms.common.api.internal.zzb) (registerlistenermethod)), zzjt.get(), googleapi)))));
	//   17   33:aload_3         
	//   18   34:aload_3         
	//   19   35:bipush          8
	//   20   37:new             #426 <Class zzbu>
	//   21   40:dup             
	//   22   41:aload_2         
	//   23   42:aload_0         
	//   24   43:getfield        #92  <Field AtomicInteger zzjt>
	//   25   46:invokevirtual   #432 <Method int AtomicInteger.get()>
	//   26   49:aload_1         
	//   27   50:invokespecial   #529 <Method void zzbu(zzb, int, GoogleApi)>
	//   28   53:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   29   56:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//   30   59:pop             
		return taskcompletionsource.getTask();
	//   31   60:aload           4
	//   32   62:invokevirtual   #533 <Method Task TaskCompletionSource.getTask()>
	//   33   65:areturn         
	}

	public final Task zza(Iterable iterable)
	{
		iterable = ((Iterable) (new zzj(iterable)));
	//    0    0:new             #451 <Class zzj>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #551 <Method void zzj(Iterable)>
	//    4    8:astore_1        
		Handler handler1 = handler;
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field Handler handler>
	//    7   13:astore_2        
		handler1.sendMessage(handler1.obtainMessage(2, ((Object) (iterable))));
	//    8   14:aload_2         
	//    9   15:aload_2         
	//   10   16:iconst_2        
	//   11   17:aload_1         
	//   12   18:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   13   21:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//   14   24:pop             
		return ((zzj) (iterable)).getTask();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #552 <Method Task zzj.getTask()>
	//   17   29:areturn         
	}

	public final void zza(ConnectionResult connectionresult, int i)
	{
		if(!zzc(connectionresult, i))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:invokevirtual   #557 <Method boolean zzc(ConnectionResult, int)>
	//*   4    6:ifne            27
		{
			Handler handler1 = handler;
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field Handler handler>
	//    7   13:astore_3        
			handler1.sendMessage(handler1.obtainMessage(5, i, 0, ((Object) (connectionresult))));
	//    8   14:aload_3         
	//    9   15:aload_3         
	//   10   16:iconst_5        
	//   11   17:iload_2         
	//   12   18:iconst_0        
	//   13   19:aload_1         
	//   14   20:invokevirtual   #560 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   15   23:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//   16   26:pop             
		}
	//   17   27:return          
	}

	public final void zza(GoogleApi googleapi)
	{
		Handler handler1 = handler;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler handler>
	//    2    4:astore_2        
		handler1.sendMessage(handler1.obtainMessage(7, ((Object) (googleapi))));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:bipush          7
	//    6    9:aload_1         
	//    7   10:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//    8   13:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//    9   16:pop             
	//   10   17:return          
	}

	public final void zza(GoogleApi googleapi, int i, BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		apimethodimpl = ((BaseImplementation.ApiMethodImpl) (new zzd(i, apimethodimpl)));
	//    0    0:new             #563 <Class zzd>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #566 <Method void zzd(int, BaseImplementation$ApiMethodImpl)>
	//    5    9:astore_3        
		Handler handler1 = handler;
	//    6   10:aload_0         
	//    7   11:getfield        #118 <Field Handler handler>
	//    8   14:astore          4
		handler1.sendMessage(handler1.obtainMessage(4, ((Object) (new zzbu(((com.google.android.gms.common.api.internal.zzb) (apimethodimpl)), zzjt.get(), googleapi)))));
	//    9   16:aload           4
	//   10   18:aload           4
	//   11   20:iconst_4        
	//   12   21:new             #426 <Class zzbu>
	//   13   24:dup             
	//   14   25:aload_3         
	//   15   26:aload_0         
	//   16   27:getfield        #92  <Field AtomicInteger zzjt>
	//   17   30:invokevirtual   #432 <Method int AtomicInteger.get()>
	//   18   33:aload_1         
	//   19   34:invokespecial   #529 <Method void zzbu(zzb, int, GoogleApi)>
	//   20   37:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   21   40:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//   22   43:pop             
	//   23   44:return          
	}

	public final void zza(GoogleApi googleapi, int i, TaskApiCall taskapicall, TaskCompletionSource taskcompletionsource, StatusExceptionMapper statusexceptionmapper)
	{
		taskapicall = ((TaskApiCall) (new zzf(i, taskapicall, taskcompletionsource, statusexceptionmapper)));
	//    0    0:new             #570 <Class zzf>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:invokespecial   #573 <Method void zzf(int, TaskApiCall, TaskCompletionSource, StatusExceptionMapper)>
	//    7   13:astore_3        
		taskcompletionsource = ((TaskCompletionSource) (handler));
	//    8   14:aload_0         
	//    9   15:getfield        #118 <Field Handler handler>
	//   10   18:astore          4
		((Handler) (taskcompletionsource)).sendMessage(((Handler) (taskcompletionsource)).obtainMessage(4, ((Object) (new zzbu(((com.google.android.gms.common.api.internal.zzb) (taskapicall)), zzjt.get(), googleapi)))));
	//   11   20:aload           4
	//   12   22:aload           4
	//   13   24:iconst_4        
	//   14   25:new             #426 <Class zzbu>
	//   15   28:dup             
	//   16   29:aload_3         
	//   17   30:aload_0         
	//   18   31:getfield        #92  <Field AtomicInteger zzjt>
	//   19   34:invokevirtual   #432 <Method int AtomicInteger.get()>
	//   20   37:aload_1         
	//   21   38:invokespecial   #529 <Method void zzbu(zzb, int, GoogleApi)>
	//   22   41:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   23   44:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//   24   47:pop             
	//   25   48:return          
	}

	public final void zza(zzad zzad1)
	{
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(zzjv != zzad1)
	//*   4    6:aload_0         
	//*   5    7:getfield        #102 <Field zzad zzjv>
	//*   6   10:aload_1         
	//*   7   11:if_acmpeq       28
			{
				zzjv = zzad1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #102 <Field zzad zzjv>
				zzjw.clear();
	//   11   19:aload_0         
	//   12   20:getfield        #107 <Field Set zzjw>
	//   13   23:invokeinterface #337 <Method void Set.clear()>
			}
			zzjw.addAll(((Collection) (zzad1.zzam())));
	//   14   28:aload_0         
	//   15   29:getfield        #107 <Field Set zzjw>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #581 <Method ArraySet zzad.zzam()>
	//   18   36:invokeinterface #585 <Method boolean Set.addAll(Collection)>
	//   19   41:pop             
		}
	//   20   42:aload_2         
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		zzad1;
	//   23   45:astore_1        
		obj;
	//   24   46:aload_2         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		throw zzad1;
	//   26   48:aload_1         
	//   27   49:athrow          
	}

	final void zzb(zzad zzad1)
	{
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(zzjv == zzad1)
	//*   4    6:aload_0         
	//*   5    7:getfield        #102 <Field zzad zzjv>
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       28
			{
				zzjv = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #102 <Field zzad zzjv>
				zzjw.clear();
	//   11   19:aload_0         
	//   12   20:getfield        #107 <Field Set zzjw>
	//   13   23:invokeinterface #337 <Method void Set.clear()>
			}
		}
	//   14   28:aload_2         
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		zzad1;
	//   17   31:astore_1        
		obj;
	//   18   32:aload_2         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw zzad1;
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	public final int zzbg()
	{
		return zzjs.getAndIncrement();
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field AtomicInteger zzjs>
	//    2    4:invokevirtual   #589 <Method int AtomicInteger.getAndIncrement()>
	//    3    7:ireturn         
	}

	public final Task zzc(GoogleApi googleapi)
	{
		googleapi = ((GoogleApi) (new zzae(googleapi.zzm())));
	//    0    0:new             #288 <Class zzae>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #185 <Method zzh GoogleApi.zzm()>
	//    4    8:invokespecial   #593 <Method void zzae(zzh)>
	//    5   11:astore_1        
		Handler handler1 = handler;
	//    6   12:aload_0         
	//    7   13:getfield        #118 <Field Handler handler>
	//    8   16:astore_2        
		handler1.sendMessage(handler1.obtainMessage(14, ((Object) (googleapi))));
	//    9   17:aload_2         
	//   10   18:aload_2         
	//   11   19:bipush          14
	//   12   21:aload_1         
	//   13   22:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   14   25:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//   15   28:pop             
		return ((zzae) (googleapi)).zzao().getTask();
	//   16   29:aload_1         
	//   17   30:invokevirtual   #293 <Method TaskCompletionSource zzae.zzao()>
	//   18   33:invokevirtual   #533 <Method Task TaskCompletionSource.getTask()>
	//   19   36:areturn         
	}

	final boolean zzc(ConnectionResult connectionresult, int i)
	{
		return zzjq.showWrappedErrorNotification(zzjp, connectionresult, i);
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field GoogleApiAvailability zzjq>
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field Context zzjp>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #598 <Method boolean GoogleApiAvailability.showWrappedErrorNotification(Context, ConnectionResult, int)>
	//    7   13:ireturn         
	}

	public final void zzr()
	{
		Handler handler1 = handler;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler handler>
	//    2    4:astore_1        
		handler1.sendMessage(handler1.obtainMessage(3));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:iconst_3        
	//    6    8:invokevirtual   #131 <Method Message Handler.obtainMessage(int)>
	//    7   11:invokevirtual   #135 <Method boolean Handler.sendMessage(Message)>
	//    8   14:pop             
	//    9   15:return          
	}

	private static final Object lock = new Object();
	public static final Status zzjj = new Status(4, "Sign-out occurred while this API call was in progress.");
	private static final Status zzjk = new Status(4, "The user must be signed in to make this API call.");
	private static GoogleApiManager zzjo;
	private final Handler handler;
	private long zzjl;
	private long zzjm;
	private long zzjn;
	private final Context zzjp;
	private final GoogleApiAvailability zzjq;
	private final GoogleApiAvailabilityCache zzjr;
	private final AtomicInteger zzjs = new AtomicInteger(1);
	private final AtomicInteger zzjt = new AtomicInteger(0);
	private final Map zzju = new ConcurrentHashMap(5, 0.75F, 1);
	private zzad zzjv;
	private final Set zzjw = new ArraySet();
	private final Set zzjx = new ArraySet();

	static 
	{
	//    0    0:new             #53  <Class Status>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:ldc1            #55  <String "Sign-out occurred while this API call was in progress.">
	//    4    7:invokespecial   #59  <Method void Status(int, String)>
	//    5   10:putstatic       #61  <Field Status zzjj>
	//    6   13:new             #53  <Class Status>
	//    7   16:dup             
	//    8   17:iconst_4        
	//    9   18:ldc1            #63  <String "The user must be signed in to make this API call.">
	//   10   20:invokespecial   #59  <Method void Status(int, String)>
	//   11   23:putstatic       #65  <Field Status zzjk>
	//   12   26:new             #4   <Class Object>
	//   13   29:dup             
	//   14   30:invokespecial   #67  <Method void Object()>
	//   15   33:putstatic       #69  <Field Object lock>
	//*  16   36:return          
	}
}
