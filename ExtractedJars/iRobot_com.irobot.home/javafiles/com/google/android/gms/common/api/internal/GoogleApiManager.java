// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.*;
import android.support.v4.f.a;
import android.support.v4.f.b;
import android.util.Log;
import com.google.android.gms.common.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaaf, zai, BackgroundDetector, zabi, 
//			zabv, zab, zak, zah, 
//			zaf, zabw, zae, zag, 
//			zaae, RegisterListenerMethod, UnregisterListenerMethod, TaskApiCall, 
//			StatusExceptionMapper, zar, zaab, zac, 
//			zal, zace, zabj, zabk, 
//			zabl, zabm, zach, zabo

public class GoogleApiManager
	implements android.os.Handler.Callback
{
	public final class zaa
		implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, zar
	{

		private final Feature zaa(Feature afeature[])
		{
			if(afeature != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          170
			{
				if(afeature.length == 0)
		//*   2    4:aload_1         
		//*   3    5:arraylength     
		//*   4    6:ifne            11
					return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
				Feature afeature2[] = zain.getAvailableFeatures();
		//    7   11:aload_0         
		//    8   12:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//    9   15:invokeinterface #138 <Method Feature[] com.google.android.gms.common.api.Api$Client.getAvailableFeatures()>
		//   10   20:astore          6
				boolean flag = false;
		//   11   22:iconst_0        
		//   12   23:istore_3        
				Feature afeature1[] = afeature2;
		//   13   24:aload           6
		//   14   26:astore          5
				if(afeature2 == null)
		//*  15   28:aload           6
		//*  16   30:ifnonnull       39
					afeature1 = new Feature[0];
		//   17   33:iconst_0        
		//   18   34:anewarray       Feature[]
		//   19   37:astore          5
				a a1 = new a(afeature1.length);
		//   20   39:new             #142 <Class a>
		//   21   42:dup             
		//   22   43:aload           5
		//   23   45:arraylength     
		//   24   46:invokespecial   #145 <Method void a(int)>
		//   25   49:astore          6
				int k = afeature1.length;
		//   26   51:aload           5
		//   27   53:arraylength     
		//   28   54:istore          4
				for(int i = 0; i < k; i++)
		//*  29   56:iconst_0        
		//*  30   57:istore_2        
		//*  31   58:iload_2         
		//*  32   59:iload           4
		//*  33   61:icmpge          98
				{
					Feature feature1 = afeature1[i];
		//   34   64:aload           5
		//   35   66:iload_2         
		//   36   67:aaload          
		//   37   68:astore          7
					((Map) (a1)).put(((Object) (feature1.getName())), ((Object) (Long.valueOf(feature1.getVersion()))));
		//   38   70:aload           6
		//   39   72:aload           7
		//   40   74:invokevirtual   #149 <Method String Feature.getName()>
		//   41   77:aload           7
		//   42   79:invokevirtual   #153 <Method long Feature.getVersion()>
		//   43   82:invokestatic    #159 <Method Long Long.valueOf(long)>
		//   44   85:invokeinterface #165 <Method Object Map.put(Object, Object)>
		//   45   90:pop             
				}

		//   46   91:iload_2         
		//   47   92:iconst_1        
		//   48   93:iadd            
		//   49   94:istore_2        
		//*  50   95:goto            58
				k = afeature.length;
		//   51   98:aload_1         
		//   52   99:arraylength     
		//   53  100:istore          4
				for(int j = ((int) (flag)); j < k;)
		//*  54  102:iload_3         
		//*  55  103:istore_2        
		//*  56  104:iload_2         
		//*  57  105:iload           4
		//*  58  107:icmpge          170
				{
					Feature feature = afeature[j];
		//   59  110:aload_1         
		//   60  111:iload_2         
		//   61  112:aaload          
		//   62  113:astore          5
					if(((Map) (a1)).containsKey(((Object) (feature.getName()))))
		//*  63  115:aload           6
		//*  64  117:aload           5
		//*  65  119:invokevirtual   #149 <Method String Feature.getName()>
		//*  66  122:invokeinterface #169 <Method boolean Map.containsKey(Object)>
		//*  67  127:ifeq            167
					{
						if(((Long)((Map) (a1)).get(((Object) (feature.getName())))).longValue() < feature.getVersion())
		//*  68  130:aload           6
		//*  69  132:aload           5
		//*  70  134:invokevirtual   #149 <Method String Feature.getName()>
		//*  71  137:invokeinterface #173 <Method Object Map.get(Object)>
		//*  72  142:checkcast       #155 <Class Long>
		//*  73  145:invokevirtual   #176 <Method long Long.longValue()>
		//*  74  148:aload           5
		//*  75  150:invokevirtual   #153 <Method long Feature.getVersion()>
		//*  76  153:lcmp            
		//*  77  154:ifge            160
							return feature;
		//   78  157:aload           5
		//   79  159:areturn         
						j++;
		//   80  160:iload_2         
		//   81  161:iconst_1        
		//   82  162:iadd            
		//   83  163:istore_2        
					} else
		//*  84  164:goto            104
					{
						return feature;
		//   85  167:aload           5
		//   86  169:areturn         
					}
				}

			}
			return null;
		//   87  170:aconst_null     
		//   88  171:areturn         
		}

		static void zaa(zaa zaa1, zab zab1)
		{
			zaa1.zaa(zab1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #180 <Method void zaa(GoogleApiManager$zab)>
		//    3    5:return          
		}

		private final void zaa(zab zab1)
		{
			if(!zaiv.contains(((Object) (zab1))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field List zaiv>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #185 <Method boolean List.contains(Object)>
		//*   4   10:ifne            14
				return;
		//    5   13:return          
			if(!zaiu)
		//*   6   14:aload_0         
		//*   7   15:getfield        #187 <Field boolean zaiu>
		//*   8   18:ifne            42
			{
				if(!zain.isConnected())
		//*   9   21:aload_0         
		//*  10   22:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  11   25:invokeinterface #190 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*  12   30:ifne            38
				{
					connect();
		//   13   33:aload_0         
		//   14   34:invokevirtual   #193 <Method void connect()>
					return;
		//   15   37:return          
				}
				zabi();
		//   16   38:aload_0         
		//   17   39:invokespecial   #196 <Method void zabi()>
			}
		//   18   42:return          
		}

		static boolean zaa(zaa zaa1, boolean flag)
		{
			return zaa1.zac(false);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:invokespecial   #201 <Method boolean zac(boolean)>
		//    3    5:ireturn         
		}

		static void zab(zaa zaa1, zab zab1)
		{
			zaa1.zab(zab1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #203 <Method void zab(GoogleApiManager$zab)>
		//    3    5:return          
		}

		private final void zab(zab zab1)
		{
			if(zaiv.remove(((Object) (zab1))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field List zaiv>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #206 <Method boolean List.remove(Object)>
		//*   4   10:ifeq            206
			{
				GoogleApiManager.zaa(zail).removeMessages(15, ((Object) (zab1)));
		//    5   13:aload_0         
		//    6   14:getfield        #49  <Field GoogleApiManager zail>
		//    7   17:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    8   20:bipush          15
		//    9   22:aload_1         
		//   10   23:invokevirtual   #210 <Method void Handler.removeMessages(int, Object)>
				GoogleApiManager.zaa(zail).removeMessages(16, ((Object) (zab1)));
		//   11   26:aload_0         
		//   12   27:getfield        #49  <Field GoogleApiManager zail>
		//   13   30:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   14   33:bipush          16
		//   15   35:aload_1         
		//   16   36:invokevirtual   #210 <Method void Handler.removeMessages(int, Object)>
				zab1 = ((zab) (com.google.android.gms.common.api.internal.zab.zad(zab1)));
		//   17   39:aload_1         
		//   18   40:invokestatic    #216 <Method Feature com.google.android.gms.common.api.internal.GoogleApiManager$zab.zad(GoogleApiManager$zab)>
		//   19   43:astore_1        
				ArrayList arraylist = new ArrayList(zaim.size());
		//   20   44:new             #69  <Class ArrayList>
		//   21   47:dup             
		//   22   48:aload_0         
		//   23   49:getfield        #57  <Field Queue zaim>
		//   24   52:invokeinterface #221 <Method int Queue.size()>
		//   25   57:invokespecial   #222 <Method void ArrayList(int)>
		//   26   60:astore          4
				Iterator iterator = zaim.iterator();
		//   27   62:aload_0         
		//   28   63:getfield        #57  <Field Queue zaim>
		//   29   66:invokeinterface #226 <Method Iterator Queue.iterator()>
		//   30   71:astore          5
				do
				{
					if(!iterator.hasNext())
						break;
		//   31   73:aload           5
		//   32   75:invokeinterface #231 <Method boolean Iterator.hasNext()>
		//   33   80:ifeq            139
					com.google.android.gms.common.api.internal.zab zab2 = (com.google.android.gms.common.api.internal.zab)iterator.next();
		//   34   83:aload           5
		//   35   85:invokeinterface #235 <Method Object Iterator.next()>
		//   36   90:checkcast       #237 <Class zab>
		//   37   93:astore          6
					if(zab2 instanceof com.google.android.gms.common.api.internal.zac)
		//*  38   95:aload           6
		//*  39   97:instanceof      #239 <Class zac>
		//*  40  100:ifeq            73
					{
						Feature afeature[] = ((com.google.android.gms.common.api.internal.zac)zab2).zab(this);
		//   41  103:aload           6
		//   42  105:checkcast       #239 <Class zac>
		//   43  108:aload_0         
		//   44  109:invokevirtual   #242 <Method Feature[] zac.zab(GoogleApiManager$zaa)>
		//   45  112:astore          7
						if(afeature != null && ArrayUtils.contains(((Object []) (afeature)), ((Object) (zab1))))
		//*  46  114:aload           7
		//*  47  116:ifnull          73
		//*  48  119:aload           7
		//*  49  121:aload_1         
		//*  50  122:invokestatic    #247 <Method boolean ArrayUtils.contains(Object[], Object)>
		//*  51  125:ifeq            73
							arraylist.add(((Object) (zab2)));
		//   52  128:aload           4
		//   53  130:aload           6
		//   54  132:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
		//   55  135:pop             
					}
				} while(true);
		//   56  136:goto            73
				arraylist = (ArrayList)arraylist;
		//   57  139:aload           4
		//   58  141:checkcast       #69  <Class ArrayList>
		//   59  144:astore          4
				int j = arraylist.size();
		//   60  146:aload           4
		//   61  148:invokevirtual   #251 <Method int ArrayList.size()>
		//   62  151:istore_3        
				for(int i = 0; i < j;)
		//*  63  152:iconst_0        
		//*  64  153:istore_2        
		//*  65  154:iload_2         
		//*  66  155:iload_3         
		//*  67  156:icmpge          206
				{
					Object obj = arraylist.get(i);
		//   68  159:aload           4
		//   69  161:iload_2         
		//   70  162:invokevirtual   #254 <Method Object ArrayList.get(int)>
		//   71  165:astore          5
					i++;
		//   72  167:iload_2         
		//   73  168:iconst_1        
		//   74  169:iadd            
		//   75  170:istore_2        
					obj = ((Object) ((com.google.android.gms.common.api.internal.zab)obj));
		//   76  171:aload           5
		//   77  173:checkcast       #237 <Class zab>
		//   78  176:astore          5
					zaim.remove(obj);
		//   79  178:aload_0         
		//   80  179:getfield        #57  <Field Queue zaim>
		//   81  182:aload           5
		//   82  184:invokeinterface #255 <Method boolean Queue.remove(Object)>
		//   83  189:pop             
					((com.google.android.gms.common.api.internal.zab) (obj)).zaa(((RuntimeException) (new UnsupportedApiCallException(((Feature) (zab1))))));
		//   84  190:aload           5
		//   85  192:new             #257 <Class UnsupportedApiCallException>
		//   86  195:dup             
		//   87  196:aload_1         
		//   88  197:invokespecial   #260 <Method void UnsupportedApiCallException(Feature)>
		//   89  200:invokevirtual   #263 <Method void zab.zaa(RuntimeException)>
				}

			}
		//*  90  203:goto            154
		//   91  206:return          
		}

		private final boolean zab(com.google.android.gms.common.api.internal.zab zab1)
		{
			if(!(zab1 instanceof com.google.android.gms.common.api.internal.zac))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #239 <Class zac>
		//*   2    4:ifne            14
			{
				zac(zab1);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #267 <Method void zac(zab)>
				return true;
		//    6   12:iconst_1        
		//    7   13:ireturn         
			}
			com.google.android.gms.common.api.internal.zac zac1 = (com.google.android.gms.common.api.internal.zac)zab1;
		//    8   14:aload_1         
		//    9   15:checkcast       #239 <Class zac>
		//   10   18:astore_3        
			Feature feature = zaa(zac1.zab(this));
		//   11   19:aload_0         
		//   12   20:aload_3         
		//   13   21:aload_0         
		//   14   22:invokevirtual   #242 <Method Feature[] zac.zab(GoogleApiManager$zaa)>
		//   15   25:invokespecial   #269 <Method Feature zaa(Feature[])>
		//   16   28:astore          4
			if(feature == null)
		//*  17   30:aload           4
		//*  18   32:ifnonnull       42
			{
				zac(zab1);
		//   19   35:aload_0         
		//   20   36:aload_1         
		//   21   37:invokespecial   #267 <Method void zac(zab)>
				return true;
		//   22   40:iconst_1        
		//   23   41:ireturn         
			}
			if(zac1.zac(this))
		//*  24   42:aload_3         
		//*  25   43:aload_0         
		//*  26   44:invokevirtual   #272 <Method boolean zac.zac(GoogleApiManager$zaa)>
		//*  27   47:ifeq            248
			{
				zab1 = ((com.google.android.gms.common.api.internal.zab) (new zab(zafp, feature, ((zabi) (null)))));
		//   28   50:new             #212 <Class GoogleApiManager$zab>
		//   29   53:dup             
		//   30   54:aload_0         
		//   31   55:getfield        #104 <Field zai zafp>
		//   32   58:aload           4
		//   33   60:aconst_null     
		//   34   61:invokespecial   #275 <Method void GoogleApiManager$zab(zai, Feature, zabi)>
		//   35   64:astore_1        
				int i = zaiv.indexOf(((Object) (zab1)));
		//   36   65:aload_0         
		//   37   66:getfield        #72  <Field List zaiv>
		//   38   69:aload_1         
		//   39   70:invokeinterface #279 <Method int List.indexOf(Object)>
		//   40   75:istore_2        
				if(i >= 0)
		//*  41   76:iload_2         
		//*  42   77:iflt            141
				{
					zab1 = ((com.google.android.gms.common.api.internal.zab) ((zab)zaiv.get(i)));
		//   43   80:aload_0         
		//   44   81:getfield        #72  <Field List zaiv>
		//   45   84:iload_2         
		//   46   85:invokeinterface #280 <Method Object List.get(int)>
		//   47   90:checkcast       #212 <Class GoogleApiManager$zab>
		//   48   93:astore_1        
					GoogleApiManager.zaa(zail).removeMessages(15, ((Object) (zab1)));
		//   49   94:aload_0         
		//   50   95:getfield        #49  <Field GoogleApiManager zail>
		//   51   98:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   52  101:bipush          15
		//   53  103:aload_1         
		//   54  104:invokevirtual   #210 <Method void Handler.removeMessages(int, Object)>
					GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 15, ((Object) (zab1))), GoogleApiManager.zac(zail));
		//   55  107:aload_0         
		//   56  108:getfield        #49  <Field GoogleApiManager zail>
		//   57  111:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   58  114:aload_0         
		//   59  115:getfield        #49  <Field GoogleApiManager zail>
		//   60  118:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   61  121:bipush          15
		//   62  123:aload_1         
		//   63  124:invokestatic    #286 <Method Message Message.obtain(Handler, int, Object)>
		//   64  127:aload_0         
		//   65  128:getfield        #49  <Field GoogleApiManager zail>
		//   66  131:invokestatic    #289 <Method long GoogleApiManager.zac(GoogleApiManager)>
		//   67  134:invokevirtual   #293 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   68  137:pop             
				} else
		//*  69  138:goto            261
				{
					zaiv.add(((Object) (zab1)));
		//   70  141:aload_0         
		//   71  142:getfield        #72  <Field List zaiv>
		//   72  145:aload_1         
		//   73  146:invokeinterface #294 <Method boolean List.add(Object)>
		//   74  151:pop             
					GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 15, ((Object) (zab1))), GoogleApiManager.zac(zail));
		//   75  152:aload_0         
		//   76  153:getfield        #49  <Field GoogleApiManager zail>
		//   77  156:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   78  159:aload_0         
		//   79  160:getfield        #49  <Field GoogleApiManager zail>
		//   80  163:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   81  166:bipush          15
		//   82  168:aload_1         
		//   83  169:invokestatic    #286 <Method Message Message.obtain(Handler, int, Object)>
		//   84  172:aload_0         
		//   85  173:getfield        #49  <Field GoogleApiManager zail>
		//   86  176:invokestatic    #289 <Method long GoogleApiManager.zac(GoogleApiManager)>
		//   87  179:invokevirtual   #293 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   88  182:pop             
					GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 16, ((Object) (zab1))), com.google.android.gms.common.api.internal.GoogleApiManager.zad(zail));
		//   89  183:aload_0         
		//   90  184:getfield        #49  <Field GoogleApiManager zail>
		//   91  187:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   92  190:aload_0         
		//   93  191:getfield        #49  <Field GoogleApiManager zail>
		//   94  194:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   95  197:bipush          16
		//   96  199:aload_1         
		//   97  200:invokestatic    #286 <Method Message Message.obtain(Handler, int, Object)>
		//   98  203:aload_0         
		//   99  204:getfield        #49  <Field GoogleApiManager zail>
		//  100  207:invokestatic    #296 <Method long com.google.android.gms.common.api.internal.GoogleApiManager.zad(GoogleApiManager)>
		//  101  210:invokevirtual   #293 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//  102  213:pop             
					zab1 = ((com.google.android.gms.common.api.internal.zab) (new ConnectionResult(2, ((PendingIntent) (null)))));
		//  103  214:new             #298 <Class ConnectionResult>
		//  104  217:dup             
		//  105  218:iconst_2        
		//  106  219:aconst_null     
		//  107  220:invokespecial   #301 <Method void ConnectionResult(int, PendingIntent)>
		//  108  223:astore_1        
					if(!zah(((ConnectionResult) (zab1))))
		//* 109  224:aload_0         
		//* 110  225:aload_1         
		//* 111  226:invokespecial   #305 <Method boolean zah(ConnectionResult)>
		//* 112  229:ifne            261
						zail.zac(((ConnectionResult) (zab1)), zais);
		//  113  232:aload_0         
		//  114  233:getfield        #49  <Field GoogleApiManager zail>
		//  115  236:aload_1         
		//  116  237:aload_0         
		//  117  238:getfield        #115 <Field int zais>
		//  118  241:invokevirtual   #308 <Method boolean GoogleApiManager.zac(ConnectionResult, int)>
		//  119  244:pop             
				}
			} else
		//* 120  245:goto            261
			{
				((com.google.android.gms.common.api.internal.zab) (zac1)).zaa(((RuntimeException) (new UnsupportedApiCallException(feature))));
		//  121  248:aload_3         
		//  122  249:new             #257 <Class UnsupportedApiCallException>
		//  123  252:dup             
		//  124  253:aload           4
		//  125  255:invokespecial   #260 <Method void UnsupportedApiCallException(Feature)>
		//  126  258:invokevirtual   #263 <Method void zab.zaa(RuntimeException)>
			}
			return false;
		//  127  261:iconst_0        
		//  128  262:ireturn         
		}

		private final void zabg()
		{
			Iterator iterator;
			zabl();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #316 <Method void zabl()>
			zai(ConnectionResult.RESULT_SUCCESS);
		//    2    4:aload_0         
		//    3    5:getstatic       #319 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
		//    4    8:invokespecial   #323 <Method void zai(ConnectionResult)>
			zabn();
		//    5   11:aload_0         
		//    6   12:invokespecial   #326 <Method void zabn()>
			iterator = zair.values().iterator();
		//    7   15:aload_0         
		//    8   16:getfield        #67  <Field Map zair>
		//    9   19:invokeinterface #330 <Method Collection Map.values()>
		//   10   24:invokeinterface #333 <Method Iterator Collection.iterator()>
		//   11   29:astore_1        
_L5:
			if(!iterator.hasNext()) goto _L2; else goto _L1
		//   12   30:aload_1         
		//   13   31:invokeinterface #231 <Method boolean Iterator.hasNext()>
		//   14   36:ifeq            107
_L1:
			zabw zabw1 = (zabw)iterator.next();
		//   15   39:aload_1         
		//   16   40:invokeinterface #235 <Method Object Iterator.next()>
		//   17   45:checkcast       #335 <Class zabw>
		//   18   48:astore_2        
			if(zaa(zabw1.zajw.getRequiredFeatures()) == null) goto _L4; else goto _L3
		//   19   49:aload_0         
		//   20   50:aload_2         
		//   21   51:getfield        #339 <Field RegisterListenerMethod zabw.zajw>
		//   22   54:invokevirtual   #344 <Method Feature[] RegisterListenerMethod.getRequiredFeatures()>
		//   23   57:invokespecial   #269 <Method Feature zaa(Feature[])>
		//   24   60:ifnull          72
_L3:
			iterator.remove();
		//   25   63:aload_1         
		//   26   64:invokeinterface #346 <Method void Iterator.remove()>
			  goto _L5
		//*  27   69:goto            30
_L4:
			zabw1.zajw.registerListener(zaio, new TaskCompletionSource());
		//   28   72:aload_2         
		//   29   73:getfield        #339 <Field RegisterListenerMethod zabw.zajw>
		//   30   76:aload_0         
		//   31   77:getfield        #98  <Field com.google.android.gms.common.api.Api$AnyClient zaio>
		//   32   80:new             #348 <Class TaskCompletionSource>
		//   33   83:dup             
		//   34   84:invokespecial   #349 <Method void TaskCompletionSource()>
		//   35   87:invokevirtual   #353 <Method void RegisterListenerMethod.registerListener(com.google.android.gms.common.api.Api$AnyClient, TaskCompletionSource)>
			  goto _L5
		//*  36   90:goto            30
_L7:
			onConnectionSuspended(1);
		//   37   93:aload_0         
		//   38   94:iconst_1        
		//   39   95:invokevirtual   #356 <Method void onConnectionSuspended(int)>
			zain.disconnect();
		//   40   98:aload_0         
		//   41   99:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   42  102:invokeinterface #359 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
_L2:
			zabi();
		//   43  107:aload_0         
		//   44  108:invokespecial   #196 <Method void zabi()>
			zabo();
		//   45  111:aload_0         
		//   46  112:invokespecial   #362 <Method void zabo()>
			return;
		//   47  115:return          
			DeadObjectException deadobjectexception;
			deadobjectexception;
		//   48  116:astore_1        
			if(true) goto _L7; else goto _L6
		//   49  117:goto            93
_L6:
			RemoteException remoteexception;
			remoteexception;
		//   50  120:astore_2        
			  goto _L3
		//*  51  121:goto            63
		}

		private final void zabh()
		{
			zabl();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #316 <Method void zabl()>
			zaiu = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #187 <Field boolean zaiu>
			zaip.zaai();
		//    5    9:aload_0         
		//    6   10:getfield        #109 <Field zaab zaip>
		//    7   13:invokevirtual   #366 <Method void zaab.zaai()>
			GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 9, ((Object) (zafp))), GoogleApiManager.zac(zail));
		//    8   16:aload_0         
		//    9   17:getfield        #49  <Field GoogleApiManager zail>
		//   10   20:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   11   23:aload_0         
		//   12   24:getfield        #49  <Field GoogleApiManager zail>
		//   13   27:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   14   30:bipush          9
		//   15   32:aload_0         
		//   16   33:getfield        #104 <Field zai zafp>
		//   17   36:invokestatic    #286 <Method Message Message.obtain(Handler, int, Object)>
		//   18   39:aload_0         
		//   19   40:getfield        #49  <Field GoogleApiManager zail>
		//   20   43:invokestatic    #289 <Method long GoogleApiManager.zac(GoogleApiManager)>
		//   21   46:invokevirtual   #293 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   22   49:pop             
			GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 11, ((Object) (zafp))), com.google.android.gms.common.api.internal.GoogleApiManager.zad(zail));
		//   23   50:aload_0         
		//   24   51:getfield        #49  <Field GoogleApiManager zail>
		//   25   54:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   26   57:aload_0         
		//   27   58:getfield        #49  <Field GoogleApiManager zail>
		//   28   61:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   29   64:bipush          11
		//   30   66:aload_0         
		//   31   67:getfield        #104 <Field zai zafp>
		//   32   70:invokestatic    #286 <Method Message Message.obtain(Handler, int, Object)>
		//   33   73:aload_0         
		//   34   74:getfield        #49  <Field GoogleApiManager zail>
		//   35   77:invokestatic    #296 <Method long com.google.android.gms.common.api.internal.GoogleApiManager.zad(GoogleApiManager)>
		//   36   80:invokevirtual   #293 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   37   83:pop             
			GoogleApiManager.zae(zail).flush();
		//   38   84:aload_0         
		//   39   85:getfield        #49  <Field GoogleApiManager zail>
		//   40   88:invokestatic    #370 <Method GoogleApiAvailabilityCache GoogleApiManager.zae(GoogleApiManager)>
		//   41   91:invokevirtual   #375 <Method void GoogleApiAvailabilityCache.flush()>
		//   42   94:return          
		}

		private final void zabi()
		{
			ArrayList arraylist = (ArrayList)new ArrayList(((Collection) (zaim)));
		//    0    0:new             #69  <Class ArrayList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #57  <Field Queue zaim>
		//    4    8:invokespecial   #378 <Method void ArrayList(Collection)>
		//    5   11:checkcast       #69  <Class ArrayList>
		//    6   14:astore          4
			int k = arraylist.size();
		//    7   16:aload           4
		//    8   18:invokevirtual   #251 <Method int ArrayList.size()>
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
		//   17   32:invokevirtual   #254 <Method Object ArrayList.get(int)>
		//   18   35:astore          5
				int j = i + 1;
		//   19   37:iload_1         
		//   20   38:iconst_1        
		//   21   39:iadd            
		//   22   40:istore_2        
				obj = ((Object) ((com.google.android.gms.common.api.internal.zab)obj));
		//   23   41:aload           5
		//   24   43:checkcast       #237 <Class zab>
		//   25   46:astore          5
				if(!zain.isConnected())
					break;
		//   26   48:aload_0         
		//   27   49:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   28   52:invokeinterface #190 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//   29   57:ifeq            88
				i = j;
		//   30   60:iload_2         
		//   31   61:istore_1        
				if(zab(((com.google.android.gms.common.api.internal.zab) (obj))))
		//*  32   62:aload_0         
		//*  33   63:aload           5
		//*  34   65:invokespecial   #380 <Method boolean zab(zab)>
		//*  35   68:ifeq            24
				{
					zaim.remove(obj);
		//   36   71:aload_0         
		//   37   72:getfield        #57  <Field Queue zaim>
		//   38   75:aload           5
		//   39   77:invokeinterface #255 <Method boolean Queue.remove(Object)>
		//   40   82:pop             
					i = j;
		//   41   83:iload_2         
		//   42   84:istore_1        
				}
			} while(true);
		//   43   85:goto            24
		//   44   88:return          
		}

		private final void zabn()
		{
			if(zaiu)
		//*   0    0:aload_0         
		//*   1    1:getfield        #187 <Field boolean zaiu>
		//*   2    4:ifeq            44
			{
				GoogleApiManager.zaa(zail).removeMessages(11, ((Object) (zafp)));
		//    3    7:aload_0         
		//    4    8:getfield        #49  <Field GoogleApiManager zail>
		//    5   11:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    6   14:bipush          11
		//    7   16:aload_0         
		//    8   17:getfield        #104 <Field zai zafp>
		//    9   20:invokevirtual   #210 <Method void Handler.removeMessages(int, Object)>
				GoogleApiManager.zaa(zail).removeMessages(9, ((Object) (zafp)));
		//   10   23:aload_0         
		//   11   24:getfield        #49  <Field GoogleApiManager zail>
		//   12   27:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   13   30:bipush          9
		//   14   32:aload_0         
		//   15   33:getfield        #104 <Field zai zafp>
		//   16   36:invokevirtual   #210 <Method void Handler.removeMessages(int, Object)>
				zaiu = false;
		//   17   39:aload_0         
		//   18   40:iconst_0        
		//   19   41:putfield        #187 <Field boolean zaiu>
			}
		//   20   44:return          
		}

		private final void zabo()
		{
			GoogleApiManager.zaa(zail).removeMessages(12, ((Object) (zafp)));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:bipush          12
		//    4    9:aload_0         
		//    5   10:getfield        #104 <Field zai zafp>
		//    6   13:invokevirtual   #210 <Method void Handler.removeMessages(int, Object)>
			GoogleApiManager.zaa(zail).sendMessageDelayed(GoogleApiManager.zaa(zail).obtainMessage(12, ((Object) (zafp))), GoogleApiManager.zai(zail));
		//    7   16:aload_0         
		//    8   17:getfield        #49  <Field GoogleApiManager zail>
		//    9   20:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   10   23:aload_0         
		//   11   24:getfield        #49  <Field GoogleApiManager zail>
		//   12   27:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   13   30:bipush          12
		//   14   32:aload_0         
		//   15   33:getfield        #104 <Field zai zafp>
		//   16   36:invokevirtual   #384 <Method Message Handler.obtainMessage(int, Object)>
		//   17   39:aload_0         
		//   18   40:getfield        #49  <Field GoogleApiManager zail>
		//   19   43:invokestatic    #386 <Method long GoogleApiManager.zai(GoogleApiManager)>
		//   20   46:invokevirtual   #293 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   21   49:pop             
		//   22   50:return          
		}

		private final void zac(com.google.android.gms.common.api.internal.zab zab1)
		{
			zab1.zaa(zaip, requiresSignIn());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #109 <Field zaab zaip>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #387 <Method boolean requiresSignIn()>
		//    5    9:invokevirtual   #390 <Method void zab.zaa(zaab, boolean)>
			try
			{
				zab1.zaa(this);
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:invokevirtual   #393 <Method void zab.zaa(GoogleApiManager$zaa)>
				return;
		//    9   17:return          
			}
		//*  10   18:aload_0         
		//*  11   19:iconst_1        
		//*  12   20:invokevirtual   #356 <Method void onConnectionSuspended(int)>
		//*  13   23:aload_0         
		//*  14   24:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  15   27:invokeinterface #359 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
		//*  16   32:return          
			// Misplaced declaration of an exception variable
			catch(com.google.android.gms.common.api.internal.zab zab1)
			{
				onConnectionSuspended(1);
			}
			zain.disconnect();
		//*  17   33:astore_1        
		//*  18   34:goto            18
		}

		private final boolean zac(boolean flag)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			if(zain.isConnected() && zair.size() == 0)
		//*   4   10:aload_0         
		//*   5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*   6   14:invokeinterface #190 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*   7   19:ifeq            65
		//*   8   22:aload_0         
		//*   9   23:getfield        #67  <Field Map zair>
		//*  10   26:invokeinterface #400 <Method int Map.size()>
		//*  11   31:ifne            65
			{
				if(zaip.zaag())
		//*  12   34:aload_0         
		//*  13   35:getfield        #109 <Field zaab zaip>
		//*  14   38:invokevirtual   #403 <Method boolean zaab.zaag()>
		//*  15   41:ifeq            54
				{
					if(flag)
		//*  16   44:iload_1         
		//*  17   45:ifeq            52
						zabo();
		//   18   48:aload_0         
		//   19   49:invokespecial   #362 <Method void zabo()>
					return false;
		//   20   52:iconst_0        
		//   21   53:ireturn         
				} else
				{
					zain.disconnect();
		//   22   54:aload_0         
		//   23   55:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   24   58:invokeinterface #359 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
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

		static void zae(zaa zaa1)
		{
			zaa1.zabg();
		//    0    0:aload_0         
		//    1    1:invokespecial   #405 <Method void zabg()>
		//    2    4:return          
		}

		static void zaf(zaa zaa1)
		{
			zaa1.zabh();
		//    0    0:aload_0         
		//    1    1:invokespecial   #408 <Method void zabh()>
		//    2    4:return          
		}

		static com.google.android.gms.common.api.Api.Client zag(zaa zaa1)
		{
			return zaa1.zain;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//    2    4:areturn         
		}

		private final boolean zah(ConnectionResult connectionresult)
		{
			Object obj = GoogleApiManager.zabe();
		//    0    0:invokestatic    #413 <Method Object GoogleApiManager.zabe()>
		//    1    3:astore_2        
			obj;
		//    2    4:aload_2         
			JVM INSTR monitorenter ;
		//    3    5:monitorenter    
			if(GoogleApiManager.zaf(zail) == null || !GoogleApiManager.zag(zail).contains(((Object) (zafp))))
				break MISSING_BLOCK_LABEL_54;
		//    4    6:aload_0         
		//    5    7:getfield        #49  <Field GoogleApiManager zail>
		//    6   10:invokestatic    #416 <Method zaae GoogleApiManager.zaf(GoogleApiManager)>
		//    7   13:ifnull          54
		//    8   16:aload_0         
		//    9   17:getfield        #49  <Field GoogleApiManager zail>
		//   10   20:invokestatic    #419 <Method Set GoogleApiManager.zag(GoogleApiManager)>
		//   11   23:aload_0         
		//   12   24:getfield        #104 <Field zai zafp>
		//   13   27:invokeinterface #422 <Method boolean Set.contains(Object)>
		//   14   32:ifeq            54
			((com.google.android.gms.common.api.internal.zal) (GoogleApiManager.zaf(zail))).zab(connectionresult, zais);
		//   15   35:aload_0         
		//   16   36:getfield        #49  <Field GoogleApiManager zail>
		//   17   39:invokestatic    #416 <Method zaae GoogleApiManager.zaf(GoogleApiManager)>
		//   18   42:aload_1         
		//   19   43:aload_0         
		//   20   44:getfield        #115 <Field int zais>
		//   21   47:invokevirtual   #427 <Method void zal.zab(ConnectionResult, int)>
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

		private final void zai(ConnectionResult connectionresult)
		{
			String s;
			zak zak1;
			for(Iterator iterator = zaiq.iterator(); iterator.hasNext(); zak1.zaa(zafp, connectionresult, s))
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field Set zaiq>
		//*   2    4:invokeinterface #428 <Method Iterator Set.iterator()>
		//*   3    9:astore_3        
		//*   4   10:aload_3         
		//*   5   11:invokeinterface #231 <Method boolean Iterator.hasNext()>
		//*   6   16:ifeq            66
			{
				zak1 = (zak)iterator.next();
		//    7   19:aload_3         
		//    8   20:invokeinterface #235 <Method Object Iterator.next()>
		//    9   25:checkcast       #430 <Class zak>
		//   10   28:astore          4
				s = null;
		//   11   30:aconst_null     
		//   12   31:astore_2        
				if(Objects.equal(((Object) (connectionresult)), ((Object) (ConnectionResult.RESULT_SUCCESS))))
		//*  13   32:aload_1         
		//*  14   33:getstatic       #319 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
		//*  15   36:invokestatic    #436 <Method boolean Objects.equal(Object, Object)>
		//*  16   39:ifeq            52
					s = zain.getEndpointPackageName();
		//   17   42:aload_0         
		//   18   43:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   19   46:invokeinterface #439 <Method String com.google.android.gms.common.api.Api$Client.getEndpointPackageName()>
		//   20   51:astore_2        
			}

		//   21   52:aload           4
		//   22   54:aload_0         
		//   23   55:getfield        #104 <Field zai zafp>
		//   24   58:aload_1         
		//   25   59:aload_2         
		//   26   60:invokevirtual   #442 <Method void zak.zaa(zai, ConnectionResult, String)>
		//*  27   63:goto            10
			zaiq.clear();
		//   28   66:aload_0         
		//   29   67:getfield        #62  <Field Set zaiq>
		//   30   70:invokeinterface #445 <Method void Set.clear()>
		//   31   75:return          
		}

		public final void connect()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			if(!zain.isConnected())
		//*   4   10:aload_0         
		//*   5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*   6   14:invokeinterface #190 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*   7   19:ifne            125
			{
				if(zain.isConnecting())
		//*   8   22:aload_0         
		//*   9   23:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  10   26:invokeinterface #448 <Method boolean com.google.android.gms.common.api.Api$Client.isConnecting()>
		//*  11   31:ifeq            35
					return;
		//   12   34:return          
				int i = GoogleApiManager.zae(zail).getClientAvailability(GoogleApiManager.zab(zail), zain);
		//   13   35:aload_0         
		//   14   36:getfield        #49  <Field GoogleApiManager zail>
		//   15   39:invokestatic    #370 <Method GoogleApiAvailabilityCache GoogleApiManager.zae(GoogleApiManager)>
		//   16   42:aload_0         
		//   17   43:getfield        #49  <Field GoogleApiManager zail>
		//   18   46:invokestatic    #125 <Method Context GoogleApiManager.zab(GoogleApiManager)>
		//   19   49:aload_0         
		//   20   50:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   21   53:invokevirtual   #452 <Method int GoogleApiAvailabilityCache.getClientAvailability(Context, com.google.android.gms.common.api.Api$Client)>
		//   22   56:istore_1        
				if(i != 0)
		//*  23   57:iload_1         
		//*  24   58:ifeq            75
				{
					onConnectionFailed(new ConnectionResult(i, ((PendingIntent) (null))));
		//   25   61:aload_0         
		//   26   62:new             #298 <Class ConnectionResult>
		//   27   65:dup             
		//   28   66:iload_1         
		//   29   67:aconst_null     
		//   30   68:invokespecial   #301 <Method void ConnectionResult(int, PendingIntent)>
		//   31   71:invokevirtual   #455 <Method void onConnectionFailed(ConnectionResult)>
					return;
		//   32   74:return          
				}
				zac zac1 = ((zac) (zail)). new zac(zain, zafp);
		//   33   75:new             #457 <Class GoogleApiManager$zac>
		//   34   78:dup             
		//   35   79:aload_0         
		//   36   80:getfield        #49  <Field GoogleApiManager zail>
		//   37   83:aload_0         
		//   38   84:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   39   87:aload_0         
		//   40   88:getfield        #104 <Field zai zafp>
		//   41   91:invokespecial   #460 <Method void GoogleApiManager$zac(GoogleApiManager, com.google.android.gms.common.api.Api$Client, zai)>
		//   42   94:astore_2        
				if(zain.requiresSignIn())
		//*  43   95:aload_0         
		//*  44   96:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  45   99:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
		//*  46  104:ifeq            115
					zait.zaa(((zach) (zac1)));
		//   47  107:aload_0         
		//   48  108:getfield        #130 <Field zace zait>
		//   49  111:aload_2         
		//   50  112:invokevirtual   #465 <Method void zace.zaa(zach)>
				zain.connect(((com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) (zac1)));
		//   51  115:aload_0         
		//   52  116:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   53  119:aload_2         
		//   54  120:invokeinterface #468 <Method void com.google.android.gms.common.api.Api$Client.connect(com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks)>
			}
		//   55  125:return          
		}

		public final int getInstanceId()
		{
			return zais;
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field int zais>
		//    2    4:ireturn         
		}

		final boolean isConnected()
		{
			return zain.isConnected();
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//    2    4:invokeinterface #190 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//    3    9:ireturn         
		}

		public final void onConnected(Bundle bundle)
		{
			if(Looper.myLooper() == GoogleApiManager.zaa(zail).getLooper())
		//*   0    0:invokestatic    #475 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #49  <Field GoogleApiManager zail>
		//*   3    7:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//*   4   10:invokevirtual   #83  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       21
			{
				zabg();
		//    6   16:aload_0         
		//    7   17:invokespecial   #405 <Method void zabg()>
				return;
		//    8   20:return          
			} else
			{
				GoogleApiManager.zaa(zail).post(((Runnable) (new zabj(this))));
		//    9   21:aload_0         
		//   10   22:getfield        #49  <Field GoogleApiManager zail>
		//   11   25:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   12   28:new             #477 <Class zabj>
		//   13   31:dup             
		//   14   32:aload_0         
		//   15   33:invokespecial   #479 <Method void zabj(GoogleApiManager$zaa)>
		//   16   36:invokevirtual   #483 <Method boolean Handler.post(Runnable)>
		//   17   39:pop             
				return;
		//   18   40:return          
			}
		}

		public final void onConnectionFailed(ConnectionResult connectionresult)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			if(zait != null)
		//*   4   10:aload_0         
		//*   5   11:getfield        #130 <Field zace zait>
		//*   6   14:ifnull          24
				zait.zabs();
		//    7   17:aload_0         
		//    8   18:getfield        #130 <Field zace zait>
		//    9   21:invokevirtual   #486 <Method void zace.zabs()>
			zabl();
		//   10   24:aload_0         
		//   11   25:invokevirtual   #316 <Method void zabl()>
			GoogleApiManager.zae(zail).flush();
		//   12   28:aload_0         
		//   13   29:getfield        #49  <Field GoogleApiManager zail>
		//   14   32:invokestatic    #370 <Method GoogleApiAvailabilityCache GoogleApiManager.zae(GoogleApiManager)>
		//   15   35:invokevirtual   #375 <Method void GoogleApiAvailabilityCache.flush()>
			zai(connectionresult);
		//   16   38:aload_0         
		//   17   39:aload_1         
		//   18   40:invokespecial   #323 <Method void zai(ConnectionResult)>
			if(connectionresult.getErrorCode() == 4)
		//*  19   43:aload_1         
		//*  20   44:invokevirtual   #489 <Method int ConnectionResult.getErrorCode()>
		//*  21   47:iconst_4        
		//*  22   48:icmpne          59
			{
				zac(GoogleApiManager.zabf());
		//   23   51:aload_0         
		//   24   52:invokestatic    #493 <Method Status GoogleApiManager.zabf()>
		//   25   55:invokevirtual   #496 <Method void zac(Status)>
				return;
		//   26   58:return          
			}
			if(zaim.isEmpty())
		//*  27   59:aload_0         
		//*  28   60:getfield        #57  <Field Queue zaim>
		//*  29   63:invokeinterface #499 <Method boolean Queue.isEmpty()>
		//*  30   68:ifeq            77
			{
				zaiw = connectionresult;
		//   31   71:aload_0         
		//   32   72:aload_1         
		//   33   73:putfield        #74  <Field ConnectionResult zaiw>
				return;
		//   34   76:return          
			}
			if(zah(connectionresult))
		//*  35   77:aload_0         
		//*  36   78:aload_1         
		//*  37   79:invokespecial   #305 <Method boolean zah(ConnectionResult)>
		//*  38   82:ifeq            86
				return;
		//   39   85:return          
			if(!zail.zac(connectionresult, zais))
		//*  40   86:aload_0         
		//*  41   87:getfield        #49  <Field GoogleApiManager zail>
		//*  42   90:aload_1         
		//*  43   91:aload_0         
		//*  44   92:getfield        #115 <Field int zais>
		//*  45   95:invokevirtual   #308 <Method boolean GoogleApiManager.zac(ConnectionResult, int)>
		//*  46   98:ifne            222
			{
				if(connectionresult.getErrorCode() == 18)
		//*  47  101:aload_1         
		//*  48  102:invokevirtual   #489 <Method int ConnectionResult.getErrorCode()>
		//*  49  105:bipush          18
		//*  50  107:icmpne          115
					zaiu = true;
		//   51  110:aload_0         
		//   52  111:iconst_1        
		//   53  112:putfield        #187 <Field boolean zaiu>
				if(zaiu)
		//*  54  115:aload_0         
		//*  55  116:getfield        #187 <Field boolean zaiu>
		//*  56  119:ifeq            157
				{
					GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 9, ((Object) (zafp))), GoogleApiManager.zac(zail));
		//   57  122:aload_0         
		//   58  123:getfield        #49  <Field GoogleApiManager zail>
		//   59  126:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   60  129:aload_0         
		//   61  130:getfield        #49  <Field GoogleApiManager zail>
		//   62  133:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   63  136:bipush          9
		//   64  138:aload_0         
		//   65  139:getfield        #104 <Field zai zafp>
		//   66  142:invokestatic    #286 <Method Message Message.obtain(Handler, int, Object)>
		//   67  145:aload_0         
		//   68  146:getfield        #49  <Field GoogleApiManager zail>
		//   69  149:invokestatic    #289 <Method long GoogleApiManager.zac(GoogleApiManager)>
		//   70  152:invokevirtual   #293 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   71  155:pop             
					return;
		//   72  156:return          
				}
				connectionresult = ((ConnectionResult) (zafp.zan()));
		//   73  157:aload_0         
		//   74  158:getfield        #104 <Field zai zafp>
		//   75  161:invokevirtual   #504 <Method String zai.zan()>
		//   76  164:astore_1        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (connectionresult))).length() + 38);
		//   77  165:new             #506 <Class StringBuilder>
		//   78  168:dup             
		//   79  169:aload_1         
		//   80  170:invokestatic    #511 <Method String String.valueOf(Object)>
		//   81  173:invokevirtual   #514 <Method int String.length()>
		//   82  176:bipush          38
		//   83  178:iadd            
		//   84  179:invokespecial   #515 <Method void StringBuilder(int)>
		//   85  182:astore_2        
				stringbuilder.append("API: ");
		//   86  183:aload_2         
		//   87  184:ldc2            #517 <String "API: ">
		//   88  187:invokevirtual   #521 <Method StringBuilder StringBuilder.append(String)>
		//   89  190:pop             
				stringbuilder.append(((String) (connectionresult)));
		//   90  191:aload_2         
		//   91  192:aload_1         
		//   92  193:invokevirtual   #521 <Method StringBuilder StringBuilder.append(String)>
		//   93  196:pop             
				stringbuilder.append(" is not available on this device.");
		//   94  197:aload_2         
		//   95  198:ldc2            #523 <String " is not available on this device.">
		//   96  201:invokevirtual   #521 <Method StringBuilder StringBuilder.append(String)>
		//   97  204:pop             
				zac(new Status(17, stringbuilder.toString()));
		//   98  205:aload_0         
		//   99  206:new             #525 <Class Status>
		//  100  209:dup             
		//  101  210:bipush          17
		//  102  212:aload_2         
		//  103  213:invokevirtual   #528 <Method String StringBuilder.toString()>
		//  104  216:invokespecial   #531 <Method void Status(int, String)>
		//  105  219:invokevirtual   #496 <Method void zac(Status)>
			}
		//  106  222:return          
		}

		public final void onConnectionSuspended(int i)
		{
			if(Looper.myLooper() == GoogleApiManager.zaa(zail).getLooper())
		//*   0    0:invokestatic    #475 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #49  <Field GoogleApiManager zail>
		//*   3    7:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//*   4   10:invokevirtual   #83  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       21
			{
				zabh();
		//    6   16:aload_0         
		//    7   17:invokespecial   #408 <Method void zabh()>
				return;
		//    8   20:return          
			} else
			{
				GoogleApiManager.zaa(zail).post(((Runnable) (new zabk(this))));
		//    9   21:aload_0         
		//   10   22:getfield        #49  <Field GoogleApiManager zail>
		//   11   25:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   12   28:new             #533 <Class zabk>
		//   13   31:dup             
		//   14   32:aload_0         
		//   15   33:invokespecial   #534 <Method void zabk(GoogleApiManager$zaa)>
		//   16   36:invokevirtual   #483 <Method boolean Handler.post(Runnable)>
		//   17   39:pop             
				return;
		//   18   40:return          
			}
		}

		public final boolean requiresSignIn()
		{
			return zain.requiresSignIn();
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//    2    4:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
		//    3    9:ireturn         
		}

		public final void resume()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			if(zaiu)
		//*   4   10:aload_0         
		//*   5   11:getfield        #187 <Field boolean zaiu>
		//*   6   14:ifeq            21
				connect();
		//    7   17:aload_0         
		//    8   18:invokevirtual   #193 <Method void connect()>
		//    9   21:return          
		}

		public final void zaa(ConnectionResult connectionresult, Api api, boolean flag)
		{
			if(Looper.myLooper() == GoogleApiManager.zaa(zail).getLooper())
		//*   0    0:invokestatic    #475 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #49  <Field GoogleApiManager zail>
		//*   3    7:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//*   4   10:invokevirtual   #83  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       22
			{
				onConnectionFailed(connectionresult);
		//    6   16:aload_0         
		//    7   17:aload_1         
		//    8   18:invokevirtual   #455 <Method void onConnectionFailed(ConnectionResult)>
				return;
		//    9   21:return          
			} else
			{
				GoogleApiManager.zaa(zail).post(((Runnable) (new zabl(this, connectionresult))));
		//   10   22:aload_0         
		//   11   23:getfield        #49  <Field GoogleApiManager zail>
		//   12   26:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   13   29:new             #538 <Class zabl>
		//   14   32:dup             
		//   15   33:aload_0         
		//   16   34:aload_1         
		//   17   35:invokespecial   #541 <Method void zabl(GoogleApiManager$zaa, ConnectionResult)>
		//   18   38:invokevirtual   #483 <Method boolean Handler.post(Runnable)>
		//   19   41:pop             
				return;
		//   20   42:return          
			}
		}

		public final void zaa(com.google.android.gms.common.api.internal.zab zab1)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			if(zain.isConnected())
		//*   4   10:aload_0         
		//*   5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*   6   14:invokeinterface #190 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*   7   19:ifeq            47
				if(zab(zab1))
		//*   8   22:aload_0         
		//*   9   23:aload_1         
		//*  10   24:invokespecial   #380 <Method boolean zab(zab)>
		//*  11   27:ifeq            35
				{
					zabo();
		//   12   30:aload_0         
		//   13   31:invokespecial   #362 <Method void zabo()>
					return;
		//   14   34:return          
				} else
				{
					zaim.add(((Object) (zab1)));
		//   15   35:aload_0         
		//   16   36:getfield        #57  <Field Queue zaim>
		//   17   39:aload_1         
		//   18   40:invokeinterface #543 <Method boolean Queue.add(Object)>
		//   19   45:pop             
					return;
		//   20   46:return          
				}
			zaim.add(((Object) (zab1)));
		//   21   47:aload_0         
		//   22   48:getfield        #57  <Field Queue zaim>
		//   23   51:aload_1         
		//   24   52:invokeinterface #543 <Method boolean Queue.add(Object)>
		//   25   57:pop             
			if(zaiw != null && zaiw.hasResolution())
		//*  26   58:aload_0         
		//*  27   59:getfield        #74  <Field ConnectionResult zaiw>
		//*  28   62:ifnull          84
		//*  29   65:aload_0         
		//*  30   66:getfield        #74  <Field ConnectionResult zaiw>
		//*  31   69:invokevirtual   #546 <Method boolean ConnectionResult.hasResolution()>
		//*  32   72:ifeq            84
			{
				onConnectionFailed(zaiw);
		//   33   75:aload_0         
		//   34   76:aload_0         
		//   35   77:getfield        #74  <Field ConnectionResult zaiw>
		//   36   80:invokevirtual   #455 <Method void onConnectionFailed(ConnectionResult)>
				return;
		//   37   83:return          
			} else
			{
				connect();
		//   38   84:aload_0         
		//   39   85:invokevirtual   #193 <Method void connect()>
				return;
		//   40   88:return          
			}
		}

		public final void zaa(zak zak1)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			zaiq.add(((Object) (zak1)));
		//    4   10:aload_0         
		//    5   11:getfield        #62  <Field Set zaiq>
		//    6   14:aload_1         
		//    7   15:invokeinterface #548 <Method boolean Set.add(Object)>
		//    8   20:pop             
		//    9   21:return          
		}

		public final com.google.android.gms.common.api.Api.Client zaab()
		{
			return zain;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//    2    4:areturn         
		}

		public final void zaav()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			if(zaiu)
		//*   4   10:aload_0         
		//*   5   11:getfield        #187 <Field boolean zaiu>
		//*   6   14:ifeq            86
			{
				zabn();
		//    7   17:aload_0         
		//    8   18:invokespecial   #326 <Method void zabn()>
				Status status;
				if(GoogleApiManager.zah(zail).isGooglePlayServicesAvailable(GoogleApiManager.zab(zail)) == 18)
		//*   9   21:aload_0         
		//*  10   22:getfield        #49  <Field GoogleApiManager zail>
		//*  11   25:invokestatic    #554 <Method GoogleApiAvailability GoogleApiManager.zah(GoogleApiManager)>
		//*  12   28:aload_0         
		//*  13   29:getfield        #49  <Field GoogleApiManager zail>
		//*  14   32:invokestatic    #125 <Method Context GoogleApiManager.zab(GoogleApiManager)>
		//*  15   35:invokevirtual   #560 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
		//*  16   38:bipush          18
		//*  17   40:icmpne          59
					status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
		//   18   43:new             #525 <Class Status>
		//   19   46:dup             
		//   20   47:bipush          8
		//   21   49:ldc2            #562 <String "Connection timed out while waiting for Google Play services update to complete.">
		//   22   52:invokespecial   #531 <Method void Status(int, String)>
		//   23   55:astore_1        
				else
		//*  24   56:goto            72
					status = new Status(8, "API failed to connect while resuming due to an unknown error.");
		//   25   59:new             #525 <Class Status>
		//   26   62:dup             
		//   27   63:bipush          8
		//   28   65:ldc2            #564 <String "API failed to connect while resuming due to an unknown error.">
		//   29   68:invokespecial   #531 <Method void Status(int, String)>
		//   30   71:astore_1        
				zac(status);
		//   31   72:aload_0         
		//   32   73:aload_1         
		//   33   74:invokevirtual   #496 <Method void zac(Status)>
				zain.disconnect();
		//   34   77:aload_0         
		//   35   78:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   36   81:invokeinterface #359 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
			}
		//   37   86:return          
		}

		public final void zabj()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			zac(GoogleApiManager.zahw);
		//    4   10:aload_0         
		//    5   11:getstatic       #569 <Field Status GoogleApiManager.zahw>
		//    6   14:invokevirtual   #496 <Method void zac(Status)>
			zaip.zaah();
		//    7   17:aload_0         
		//    8   18:getfield        #109 <Field zaab zaip>
		//    9   21:invokevirtual   #572 <Method void zaab.zaah()>
			ListenerHolder.ListenerKey alistenerkey[] = (ListenerHolder.ListenerKey[])zair.keySet().toArray(((Object []) (new ListenerHolder.ListenerKey[zair.size()])));
		//   10   24:aload_0         
		//   11   25:getfield        #67  <Field Map zair>
		//   12   28:invokeinterface #576 <Method Set Map.keySet()>
		//   13   33:aload_0         
		//   14   34:getfield        #67  <Field Map zair>
		//   15   37:invokeinterface #400 <Method int Map.size()>
		//   16   42:anewarray       ListenerHolder.ListenerKey[]
		//   17   45:invokeinterface #582 <Method Object[] Set.toArray(Object[])>
		//   18   50:checkcast       #584 <Class ListenerHolder$ListenerKey[]>
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
				zaa(((com.google.android.gms.common.api.internal.zab) (new zah(alistenerkey[i], new TaskCompletionSource()))));
		//   28   64:aload_0         
		//   29   65:new             #586 <Class zah>
		//   30   68:dup             
		//   31   69:aload_3         
		//   32   70:iload_1         
		//   33   71:aaload          
		//   34   72:new             #348 <Class TaskCompletionSource>
		//   35   75:dup             
		//   36   76:invokespecial   #349 <Method void TaskCompletionSource()>
		//   37   79:invokespecial   #589 <Method void zah(ListenerHolder$ListenerKey, TaskCompletionSource)>
		//   38   82:invokevirtual   #591 <Method void zaa(zab)>

		//   39   85:iload_1         
		//   40   86:iconst_1        
		//   41   87:iadd            
		//   42   88:istore_1        
		//*  43   89:goto            59
			zai(new ConnectionResult(4));
		//   44   92:aload_0         
		//   45   93:new             #298 <Class ConnectionResult>
		//   46   96:dup             
		//   47   97:iconst_4        
		//   48   98:invokespecial   #592 <Method void ConnectionResult(int)>
		//   49  101:invokespecial   #323 <Method void zai(ConnectionResult)>
			if(zain.isConnected())
		//*  50  104:aload_0         
		//*  51  105:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  52  108:invokeinterface #190 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*  53  113:ifeq            133
				zain.onUserSignOut(((com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks) (new zabm(this))));
		//   54  116:aload_0         
		//   55  117:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   56  120:new             #594 <Class zabm>
		//   57  123:dup             
		//   58  124:aload_0         
		//   59  125:invokespecial   #595 <Method void zabm(GoogleApiManager$zaa)>
		//   60  128:invokeinterface #599 <Method void com.google.android.gms.common.api.Api$Client.onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks)>
		//   61  133:return          
		}

		public final Map zabk()
		{
			return zair;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field Map zair>
		//    2    4:areturn         
		}

		public final void zabl()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			zaiw = null;
		//    4   10:aload_0         
		//    5   11:aconst_null     
		//    6   12:putfield        #74  <Field ConnectionResult zaiw>
		//    7   15:return          
		}

		public final ConnectionResult zabm()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			return zaiw;
		//    4   10:aload_0         
		//    5   11:getfield        #74  <Field ConnectionResult zaiw>
		//    6   14:areturn         
		}

		public final boolean zabp()
		{
			return zac(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokespecial   #201 <Method boolean zac(boolean)>
		//    3    5:ireturn         
		}

		final zad zabq()
		{
			if(zait == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #130 <Field zace zait>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return zait.zabq();
		//    5    9:aload_0         
		//    6   10:getfield        #130 <Field zace zait>
		//    7   13:invokevirtual   #609 <Method zad zace.zabq()>
		//    8   16:areturn         
		}

		public final void zac(Status status)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			for(Iterator iterator = zaim.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.internal.zab)iterator.next()).zaa(status));
		//    4   10:aload_0         
		//    5   11:getfield        #57  <Field Queue zaim>
		//    6   14:invokeinterface #226 <Method Iterator Queue.iterator()>
		//    7   19:astore_2        
		//    8   20:aload_2         
		//    9   21:invokeinterface #231 <Method boolean Iterator.hasNext()>
		//   10   26:ifeq            45
		//   11   29:aload_2         
		//   12   30:invokeinterface #235 <Method Object Iterator.next()>
		//   13   35:checkcast       #237 <Class zab>
		//   14   38:aload_1         
		//   15   39:invokevirtual   #611 <Method void zab.zaa(Status)>
		//*  16   42:goto            20
			zaim.clear();
		//   17   45:aload_0         
		//   18   46:getfield        #57  <Field Queue zaim>
		//   19   49:invokeinterface #612 <Method void Queue.clear()>
		//   20   54:return          
		}

		public final void zag(ConnectionResult connectionresult)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #399 <Method void Preconditions.checkHandlerThread(Handler)>
			zain.disconnect();
		//    4   10:aload_0         
		//    5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//    6   14:invokeinterface #359 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
			onConnectionFailed(connectionresult);
		//    7   19:aload_0         
		//    8   20:aload_1         
		//    9   21:invokevirtual   #455 <Method void onConnectionFailed(ConnectionResult)>
		//   10   24:return          
		}

		private final zai zafp;
		final GoogleApiManager zail;
		private final Queue zaim = new LinkedList();
		private final com.google.android.gms.common.api.Api.Client zain;
		private final com.google.android.gms.common.api.Api.AnyClient zaio;
		private final zaab zaip = new zaab();
		private final Set zaiq = new HashSet();
		private final Map zair = new HashMap();
		private final int zais;
		private final zace zait;
		private boolean zaiu;
		private final List zaiv = new ArrayList();
		private ConnectionResult zaiw;

		public zaa(GoogleApi googleapi)
		{
			zail = GoogleApiManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field GoogleApiManager zail>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #52  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #54  <Class LinkedList>
		//    7   13:dup             
		//    8   14:invokespecial   #55  <Method void LinkedList()>
		//    9   17:putfield        #57  <Field Queue zaim>
		//   10   20:aload_0         
		//   11   21:new             #59  <Class HashSet>
		//   12   24:dup             
		//   13   25:invokespecial   #60  <Method void HashSet()>
		//   14   28:putfield        #62  <Field Set zaiq>
		//   15   31:aload_0         
		//   16   32:new             #64  <Class HashMap>
		//   17   35:dup             
		//   18   36:invokespecial   #65  <Method void HashMap()>
		//   19   39:putfield        #67  <Field Map zair>
		//   20   42:aload_0         
		//   21   43:new             #69  <Class ArrayList>
		//   22   46:dup             
		//   23   47:invokespecial   #70  <Method void ArrayList()>
		//   24   50:putfield        #72  <Field List zaiv>
			zaiw = null;
		//   25   53:aload_0         
		//   26   54:aconst_null     
		//   27   55:putfield        #74  <Field ConnectionResult zaiw>
			zain = googleapi.zaa(GoogleApiManager.zaa(GoogleApiManager.this).getLooper(), this);
		//   28   58:aload_0         
		//   29   59:aload_2         
		//   30   60:aload_1         
		//   31   61:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   32   64:invokevirtual   #83  <Method Looper Handler.getLooper()>
		//   33   67:aload_0         
		//   34   68:invokevirtual   #88  <Method com.google.android.gms.common.api.Api$Client GoogleApi.zaa(Looper, GoogleApiManager$zaa)>
		//   35   71:putfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
			Object obj;
			if(zain instanceof SimpleClientAdapter)
		//*  36   74:aload_0         
		//*  37   75:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  38   78:instanceof      #92  <Class SimpleClientAdapter>
		//*  39   81:ifeq            103
				obj = ((Object) (((SimpleClientAdapter)zain).getClient()));
		//   40   84:aload_0         
		//   41   85:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   42   88:checkcast       #92  <Class SimpleClientAdapter>
		//   43   91:invokevirtual   #96  <Method com.google.android.gms.common.api.Api$SimpleClient SimpleClientAdapter.getClient()>
		//   44   94:astore_3        
			else
		//*  45   95:aload_0         
		//*  46   96:aload_3         
		//*  47   97:putfield        #98  <Field com.google.android.gms.common.api.Api$AnyClient zaio>
		//*  48  100:goto            111
				obj = ((Object) (zain));
		//   49  103:aload_0         
		//   50  104:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//   51  107:astore_3        
			zaio = ((com.google.android.gms.common.api.Api.AnyClient) (obj));
		//*  52  108:goto            95
			zafp = googleapi.zak();
		//   53  111:aload_0         
		//   54  112:aload_2         
		//   55  113:invokevirtual   #102 <Method zai GoogleApi.zak()>
		//   56  116:putfield        #104 <Field zai zafp>
		//   57  119:aload_0         
		//   58  120:new             #106 <Class zaab>
		//   59  123:dup             
		//   60  124:invokespecial   #107 <Method void zaab()>
		//   61  127:putfield        #109 <Field zaab zaip>
			zais = googleapi.getInstanceId();
		//   62  130:aload_0         
		//   63  131:aload_2         
		//   64  132:invokevirtual   #113 <Method int GoogleApi.getInstanceId()>
		//   65  135:putfield        #115 <Field int zais>
			if(zain.requiresSignIn())
		//*  66  138:aload_0         
		//*  67  139:getfield        #90  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  68  142:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
		//*  69  147:ifeq            167
			{
				zait = googleapi.zaa(GoogleApiManager.zab(GoogleApiManager.this), GoogleApiManager.zaa(GoogleApiManager.this));
		//   70  150:aload_0         
		//   71  151:aload_2         
		//   72  152:aload_1         
		//   73  153:invokestatic    #125 <Method Context GoogleApiManager.zab(GoogleApiManager)>
		//   74  156:aload_1         
		//   75  157:invokestatic    #77  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   76  160:invokevirtual   #128 <Method zace GoogleApi.zaa(Context, Handler)>
		//   77  163:putfield        #130 <Field zace zait>
				return;
		//   78  166:return          
			} else
			{
				zait = null;
		//   79  167:aload_0         
		//   80  168:aconst_null     
		//   81  169:putfield        #130 <Field zace zait>
				return;
		//   82  172:return          
			}
		}
	}

	private static final class zab
	{

		static zai zac(zab zab1)
		{
			return zab1.zaja;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zai zaja>
		//    2    4:areturn         
		}

		static Feature zad(zab zab1)
		{
			return zab1.zajb;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Feature zajb>
		//    2    4:areturn         
		}

		public final boolean equals(Object obj)
		{
			if(obj != null && (obj instanceof zab))
		//*   0    0:aload_1         
		//*   1    1:ifnull          46
		//*   2    4:aload_1         
		//*   3    5:instanceof      #2   <Class GoogleApiManager$zab>
		//*   4    8:ifeq            46
			{
				obj = ((Object) ((zab)obj));
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class GoogleApiManager$zab>
		//    7   15:astore_1        
				if(Objects.equal(((Object) (zaja)), ((Object) (((zab) (obj)).zaja))) && Objects.equal(((Object) (zajb)), ((Object) (((zab) (obj)).zajb))))
		//*   8   16:aload_0         
		//*   9   17:getfield        #19  <Field zai zaja>
		//*  10   20:aload_1         
		//*  11   21:getfield        #19  <Field zai zaja>
		//*  12   24:invokestatic    #39  <Method boolean Objects.equal(Object, Object)>
		//*  13   27:ifeq            46
		//*  14   30:aload_0         
		//*  15   31:getfield        #21  <Field Feature zajb>
		//*  16   34:aload_1         
		//*  17   35:getfield        #21  <Field Feature zajb>
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
				zaja, zajb
			});
		//    0    0:iconst_2        
		//    1    1:anewarray       Object[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:getfield        #19  <Field zai zaja>
		//    6   10:aastore         
		//    7   11:dup             
		//    8   12:iconst_1        
		//    9   13:aload_0         
		//   10   14:getfield        #21  <Field Feature zajb>
		//   11   17:aastore         
		//   12   18:invokestatic    #44  <Method int Objects.hashCode(Object[])>
		//   13   21:ireturn         
		}

		public final String toString()
		{
			return Objects.toStringHelper(((Object) (this))).add("key", ((Object) (zaja))).add("feature", ((Object) (zajb))).toString();
		//    0    0:aload_0         
		//    1    1:invokestatic    #50  <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
		//    2    4:ldc1            #52  <String "key">
		//    3    6:aload_0         
		//    4    7:getfield        #19  <Field zai zaja>
		//    5   10:invokevirtual   #58  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//    6   13:ldc1            #60  <String "feature">
		//    7   15:aload_0         
		//    8   16:getfield        #21  <Field Feature zajb>
		//    9   19:invokevirtual   #58  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   10   22:invokevirtual   #62  <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
		//   11   25:areturn         
		}

		private final zai zaja;
		private final Feature zajb;

		private zab(zai zai1, Feature feature)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zaja = zai1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field zai zaja>
			zajb = feature;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field Feature zajb>
		//    8   14:return          
		}

		zab(zai zai1, Feature feature, zabi zabi1)
		{
			this(zai1, feature);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void GoogleApiManager$zab(zai, Feature)>
		//    4    6:return          
		}
	}

	private final class zac
		implements zach, com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
	{

		static com.google.android.gms.common.api.Api.Client zaa(zac zac1)
		{
			return zac1.zain;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field com.google.android.gms.common.api.Api$Client zain>
		//    2    4:areturn         
		}

		static boolean zaa(zac zac1, boolean flag)
		{
			zac1.zaje = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #38  <Field boolean zaje>
			return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
		}

		static void zab(zac zac1)
		{
			zac1.zabr();
		//    0    0:aload_0         
		//    1    1:invokespecial   #53  <Method void zabr()>
		//    2    4:return          
		}

		private final void zabr()
		{
			if(zaje && zajc != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field boolean zaje>
		//*   2    4:ifeq            31
		//*   3    7:aload_0         
		//*   4    8:getfield        #34  <Field IAccountAccessor zajc>
		//*   5   11:ifnull          31
				zain.getRemoteService(zajc, zajd);
		//    6   14:aload_0         
		//    7   15:getfield        #40  <Field com.google.android.gms.common.api.Api$Client zain>
		//    8   18:aload_0         
		//    9   19:getfield        #34  <Field IAccountAccessor zajc>
		//   10   22:aload_0         
		//   11   23:getfield        #36  <Field Set zajd>
		//   12   26:invokeinterface #59  <Method void com.google.android.gms.common.api.Api$Client.getRemoteService(IAccountAccessor, Set)>
		//   13   31:return          
		}

		static zai zac(zac zac1)
		{
			return zac1.zafp;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field zai zafp>
		//    2    4:areturn         
		}

		public final void onReportServiceBinding(ConnectionResult connectionresult)
		{
			GoogleApiManager.zaa(zail).post(((Runnable) (new zabo(this, connectionresult))));
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #65  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:new             #67  <Class zabo>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #70  <Method void zabo(GoogleApiManager$zac, ConnectionResult)>
		//    8   16:invokevirtual   #76  <Method boolean Handler.post(Runnable)>
		//    9   19:pop             
		//   10   20:return          
		}

		public final void zaa(IAccountAccessor iaccountaccessor, Set set)
		{
			if(iaccountaccessor != null && set != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          26
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       11
		//*   4    8:goto            26
			{
				zajc = iaccountaccessor;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #34  <Field IAccountAccessor zajc>
				zajd = set;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #36  <Field Set zajd>
				zabr();
		//   11   21:aload_0         
		//   12   22:invokespecial   #53  <Method void zabr()>
				return;
		//   13   25:return          
			} else
			{
				Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", ((Throwable) (new Exception())));
		//   14   26:ldc1            #78  <String "GoogleApiManager">
		//   15   28:ldc1            #80  <String "Received null response from onSignInSuccess">
		//   16   30:new             #82  <Class Exception>
		//   17   33:dup             
		//   18   34:invokespecial   #83  <Method void Exception()>
		//   19   37:invokestatic    #89  <Method int Log.wtf(String, String, Throwable)>
		//   20   40:pop             
				zag(new ConnectionResult(4));
		//   21   41:aload_0         
		//   22   42:new             #91  <Class ConnectionResult>
		//   23   45:dup             
		//   24   46:iconst_4        
		//   25   47:invokespecial   #94  <Method void ConnectionResult(int)>
		//   26   50:invokevirtual   #97  <Method void zag(ConnectionResult)>
				return;
		//   27   53:return          
			}
		}

		public final void zag(ConnectionResult connectionresult)
		{
			((zaa)GoogleApiManager.zaj(zail).get(((Object) (zafp)))).zag(connectionresult);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #102 <Method Map GoogleApiManager.zaj(GoogleApiManager)>
		//    3    7:aload_0         
		//    4    8:getfield        #42  <Field zai zafp>
		//    5   11:invokeinterface #108 <Method Object Map.get(Object)>
		//    6   16:checkcast       #110 <Class GoogleApiManager$zaa>
		//    7   19:aload_1         
		//    8   20:invokevirtual   #111 <Method void GoogleApiManager$zaa.zag(ConnectionResult)>
		//    9   23:return          
		}

		private final zai zafp;
		final GoogleApiManager zail;
		private final com.google.android.gms.common.api.Api.Client zain;
		private IAccountAccessor zajc;
		private Set zajd;
		private boolean zaje;

		public zac(com.google.android.gms.common.api.Api.Client client, zai zai1)
		{
			zail = GoogleApiManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field GoogleApiManager zail>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #32  <Method void Object()>
			zajc = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #34  <Field IAccountAccessor zajc>
			zajd = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #36  <Field Set zajd>
			zaje = false;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #38  <Field boolean zaje>
			zain = client;
		//   14   24:aload_0         
		//   15   25:aload_2         
		//   16   26:putfield        #40  <Field com.google.android.gms.common.api.Api$Client zain>
			zafp = zai1;
		//   17   29:aload_0         
		//   18   30:aload_3         
		//   19   31:putfield        #42  <Field zai zafp>
		//   20   34:return          
		}
	}


	private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleapiavailability)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
		zahy = 5000L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #72  <Long 5000L>
	//    4    8:putfield        #75  <Field long zahy>
		zahz = 0x1d4c0L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #76  <Long 0x1d4c0L>
	//    7   15:putfield        #79  <Field long zahz>
		zaia = 10000L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #80  <Long 10000L>
	//   10   22:putfield        #83  <Field long zaia>
	//   11   25:aload_0         
	//   12   26:new             #85  <Class AtomicInteger>
	//   13   29:dup             
	//   14   30:iconst_1        
	//   15   31:invokespecial   #88  <Method void AtomicInteger(int)>
	//   16   34:putfield        #90  <Field AtomicInteger zaif>
	//   17   37:aload_0         
	//   18   38:new             #85  <Class AtomicInteger>
	//   19   41:dup             
	//   20   42:iconst_0        
	//   21   43:invokespecial   #88  <Method void AtomicInteger(int)>
	//   22   46:putfield        #92  <Field AtomicInteger zaig>
	//   23   49:aload_0         
	//   24   50:new             #94  <Class ConcurrentHashMap>
	//   25   53:dup             
	//   26   54:iconst_5        
	//   27   55:ldc1            #95  <Float 0.75F>
	//   28   57:iconst_1        
	//   29   58:invokespecial   #98  <Method void ConcurrentHashMap(int, float, int)>
	//   30   61:putfield        #100 <Field Map zaih>
		zaii = null;
	//   31   64:aload_0         
	//   32   65:aconst_null     
	//   33   66:putfield        #102 <Field zaae zaii>
	//   34   69:aload_0         
	//   35   70:new             #104 <Class b>
	//   36   73:dup             
	//   37   74:invokespecial   #105 <Method void b()>
	//   38   77:putfield        #107 <Field Set zaij>
	//   39   80:aload_0         
	//   40   81:new             #104 <Class b>
	//   41   84:dup             
	//   42   85:invokespecial   #105 <Method void b()>
	//   43   88:putfield        #109 <Field Set zaik>
		zaic = context;
	//   44   91:aload_0         
	//   45   92:aload_1         
	//   46   93:putfield        #111 <Field Context zaic>
		handler = ((Handler) (new zal(looper, ((android.os.Handler.Callback) (this)))));
	//   47   96:aload_0         
	//   48   97:new             #113 <Class zal>
	//   49  100:dup             
	//   50  101:aload_2         
	//   51  102:aload_0         
	//   52  103:invokespecial   #116 <Method void zal(Looper, android.os.Handler$Callback)>
	//   53  106:putfield        #118 <Field Handler handler>
		zaid = googleapiavailability;
	//   54  109:aload_0         
	//   55  110:aload_3         
	//   56  111:putfield        #120 <Field GoogleApiAvailability zaid>
		zaie = new GoogleApiAvailabilityCache(((com.google.android.gms.common.GoogleApiAvailabilityLight) (googleapiavailability)));
	//   57  114:aload_0         
	//   58  115:new             #122 <Class GoogleApiAvailabilityCache>
	//   59  118:dup             
	//   60  119:aload_3         
	//   61  120:invokespecial   #125 <Method void GoogleApiAvailabilityCache(com.google.android.gms.common.GoogleApiAvailabilityLight)>
	//   62  123:putfield        #127 <Field GoogleApiAvailabilityCache zaie>
		handler.sendMessage(handler.obtainMessage(6));
	//   63  126:aload_0         
	//   64  127:getfield        #118 <Field Handler handler>
	//   65  130:aload_0         
	//   66  131:getfield        #118 <Field Handler handler>
	//   67  134:bipush          6
	//   68  136:invokevirtual   #133 <Method Message Handler.obtainMessage(int)>
	//   69  139:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   70  142:pop             
	//   71  143:return          
	}

	public static void reportSignOut()
	{
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(zaib != null)
	//*   4    6:getstatic       #141 <Field GoogleApiManager zaib>
	//*   5    9:ifnull          41
			{
				GoogleApiManager googleapimanager = zaib;
	//    6   12:getstatic       #141 <Field GoogleApiManager zaib>
	//    7   15:astore_1        
				googleapimanager.zaig.incrementAndGet();
	//    8   16:aload_1         
	//    9   17:getfield        #92  <Field AtomicInteger zaig>
	//   10   20:invokevirtual   #145 <Method int AtomicInteger.incrementAndGet()>
	//   11   23:pop             
				googleapimanager.handler.sendMessageAtFrontOfQueue(googleapimanager.handler.obtainMessage(10));
	//   12   24:aload_1         
	//   13   25:getfield        #118 <Field Handler handler>
	//   14   28:aload_1         
	//   15   29:getfield        #118 <Field Handler handler>
	//   16   32:bipush          10
	//   17   34:invokevirtual   #133 <Method Message Handler.obtainMessage(int)>
	//   18   37:invokevirtual   #148 <Method boolean Handler.sendMessageAtFrontOfQueue(Message)>
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

	static Handler zaa(GoogleApiManager googleapimanager)
	{
		return googleapimanager.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler handler>
	//    2    4:areturn         
	}

	static Context zab(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zaic;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Context zaic>
	//    2    4:areturn         
	}

	public static GoogleApiManager zab(Context context)
	{
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(zaib == null)
	//*   4    6:getstatic       #141 <Field GoogleApiManager zaib>
	//*   5    9:ifnonnull       51
			{
				Object obj1 = ((Object) (new HandlerThread("GoogleApiHandler", 9)));
	//    6   12:new             #153 <Class HandlerThread>
	//    7   15:dup             
	//    8   16:ldc1            #155 <String "GoogleApiHandler">
	//    9   18:bipush          9
	//   10   20:invokespecial   #158 <Method void HandlerThread(String, int)>
	//   11   23:astore_2        
				((HandlerThread) (obj1)).start();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #161 <Method void HandlerThread.start()>
				obj1 = ((Object) (((HandlerThread) (obj1)).getLooper()));
	//   14   28:aload_2         
	//   15   29:invokevirtual   #165 <Method Looper HandlerThread.getLooper()>
	//   16   32:astore_2        
				zaib = new GoogleApiManager(context.getApplicationContext(), ((Looper) (obj1)), GoogleApiAvailability.getInstance());
	//   17   33:new             #2   <Class GoogleApiManager>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokevirtual   #171 <Method Context Context.getApplicationContext()>
	//   21   41:aload_2         
	//   22   42:invokestatic    #177 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   23   45:invokespecial   #179 <Method void GoogleApiManager(Context, Looper, GoogleApiAvailability)>
	//   24   48:putstatic       #141 <Field GoogleApiManager zaib>
			}
			context = ((Context) (zaib));
	//   25   51:getstatic       #141 <Field GoogleApiManager zaib>
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

	private final void zab(GoogleApi googleapi)
	{
		zai zai1 = googleapi.zak();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #186 <Method zai GoogleApi.zak()>
	//    2    4:astore          4
		zaa zaa2 = (zaa)zaih.get(((Object) (zai1)));
	//    3    6:aload_0         
	//    4    7:getfield        #100 <Field Map zaih>
	//    5   10:aload           4
	//    6   12:invokeinterface #192 <Method Object Map.get(Object)>
	//    7   17:checkcast       #8   <Class GoogleApiManager$zaa>
	//    8   20:astore_3        
		zaa zaa1 = zaa2;
	//    9   21:aload_3         
	//   10   22:astore_2        
		if(zaa2 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       50
		{
			zaa1 = new zaa(googleapi);
	//   13   27:new             #8   <Class GoogleApiManager$zaa>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #195 <Method void GoogleApiManager$zaa(GoogleApiManager, GoogleApi)>
	//   18   36:astore_2        
			zaih.put(((Object) (zai1)), ((Object) (zaa1)));
	//   19   37:aload_0         
	//   20   38:getfield        #100 <Field Map zaih>
	//   21   41:aload           4
	//   22   43:aload_2         
	//   23   44:invokeinterface #199 <Method Object Map.put(Object, Object)>
	//   24   49:pop             
		}
		if(zaa1.requiresSignIn())
	//*  25   50:aload_2         
	//*  26   51:invokevirtual   #203 <Method boolean GoogleApiManager$zaa.requiresSignIn()>
	//*  27   54:ifeq            69
			zaik.add(((Object) (zai1)));
	//   28   57:aload_0         
	//   29   58:getfield        #109 <Field Set zaik>
	//   30   61:aload           4
	//   31   63:invokeinterface #209 <Method boolean Set.add(Object)>
	//   32   68:pop             
		zaa1.connect();
	//   33   69:aload_2         
	//   34   70:invokevirtual   #212 <Method void GoogleApiManager$zaa.connect()>
	//   35   73:return          
	}

	public static GoogleApiManager zabc()
	{
		GoogleApiManager googleapimanager;
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			Preconditions.checkNotNull(((Object) (zaib)), "Must guarantee manager is non-null before using getInstance");
	//    4    6:getstatic       #141 <Field GoogleApiManager zaib>
	//    5    9:ldc1            #218 <String "Must guarantee manager is non-null before using getInstance">
	//    6   11:invokestatic    #223 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   14:pop             
			googleapimanager = zaib;
	//    8   15:getstatic       #141 <Field GoogleApiManager zaib>
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

	static Object zabe()
	{
		return lock;
	//    0    0:getstatic       #69  <Field Object lock>
	//    1    3:areturn         
	}

	static Status zabf()
	{
		return zahx;
	//    0    0:getstatic       #65  <Field Status zahx>
	//    1    3:areturn         
	}

	static long zac(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zahy;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field long zahy>
	//    2    4:lreturn         
	}

	static long zad(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zahz;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field long zahz>
	//    2    4:lreturn         
	}

	static GoogleApiAvailabilityCache zae(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zaie;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field GoogleApiAvailabilityCache zaie>
	//    2    4:areturn         
	}

	static zaae zaf(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zaii;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field zaae zaii>
	//    2    4:areturn         
	}

	static Set zag(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zaij;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Set zaij>
	//    2    4:areturn         
	}

	static GoogleApiAvailability zah(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zaid;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field GoogleApiAvailability zaid>
	//    2    4:areturn         
	}

	static long zai(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zaia;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field long zaia>
	//    2    4:lreturn         
	}

	static Map zaj(GoogleApiManager googleapimanager)
	{
		return googleapimanager.zaih;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Map zaih>
	//    2    4:areturn         
	}

	public boolean handleMessage(Message message)
	{
		int i;
		long l;
		i = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #247 <Field int Message.what>
	//    2    4:istore_2        
		l = 0x493e0L;
	//    3    5:ldc2w           #248 <Long 0x493e0L>
	//    4    8:lstore_3        
		i;
	//    5    9:iload_2         
		JVM INSTR tableswitch 1 16: default 88
	//	               1 1092
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
	//	               1 1092
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
	//    8   89:getfield        #247 <Field int Message.what>
	//    9   92:istore_2        
		message = ((Message) (new StringBuilder(31)));
	//   10   93:new             #251 <Class StringBuilder>
	//   11   96:dup             
	//   12   97:bipush          31
	//   13   99:invokespecial   #252 <Method void StringBuilder(int)>
	//   14  102:astore_1        
		((StringBuilder) (message)).append("Unknown message id: ");
	//   15  103:aload_1         
	//   16  104:ldc1            #254 <String "Unknown message id: ">
	//   17  106:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//   18  109:pop             
		((StringBuilder) (message)).append(i);
	//   19  110:aload_1         
	//   20  111:iload_2         
	//   21  112:invokevirtual   #261 <Method StringBuilder StringBuilder.append(int)>
	//   22  115:pop             
		Log.w("GoogleApiManager", ((StringBuilder) (message)).toString());
	//   23  116:ldc2            #263 <String "GoogleApiManager">
	//   24  119:aload_1         
	//   25  120:invokevirtual   #267 <Method String StringBuilder.toString()>
	//   26  123:invokestatic    #273 <Method int Log.w(String, String)>
	//   27  126:pop             
		return false;
	//   28  127:iconst_0        
	//   29  128:ireturn         
_L15:
		message = ((Message) ((zab)message.obj));
	//   30  129:aload_1         
	//   31  130:getfield        #276 <Field Object Message.obj>
	//   32  133:checkcast       #11  <Class GoogleApiManager$zab>
	//   33  136:astore_1        
		if(zaih.containsKey(((Object) (zab.zac(((zab) (message)))))))
	//*  34  137:aload_0         
	//*  35  138:getfield        #100 <Field Map zaih>
	//*  36  141:aload_1         
	//*  37  142:invokestatic    #279 <Method zai GoogleApiManager$zab.zac(GoogleApiManager$zab)>
	//*  38  145:invokeinterface #282 <Method boolean Map.containsKey(Object)>
	//*  39  150:ifeq            1184
		{
			zaa.zab((zaa)zaih.get(((Object) (zab.zac(((zab) (message)))))), ((zab) (message)));
	//   40  153:aload_0         
	//   41  154:getfield        #100 <Field Map zaih>
	//   42  157:aload_1         
	//   43  158:invokestatic    #279 <Method zai GoogleApiManager$zab.zac(GoogleApiManager$zab)>
	//   44  161:invokeinterface #192 <Method Object Map.get(Object)>
	//   45  166:checkcast       #8   <Class GoogleApiManager$zaa>
	//   46  169:aload_1         
	//   47  170:invokestatic    #285 <Method void GoogleApiManager$zaa.zab(GoogleApiManager$zaa, GoogleApiManager$zab)>
			return true;
	//   48  173:iconst_1        
	//   49  174:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L14:
		message = ((Message) ((zab)message.obj));
	//   50  175:aload_1         
	//   51  176:getfield        #276 <Field Object Message.obj>
	//   52  179:checkcast       #11  <Class GoogleApiManager$zab>
	//   53  182:astore_1        
		if(zaih.containsKey(((Object) (zab.zac(((zab) (message)))))))
	//*  54  183:aload_0         
	//*  55  184:getfield        #100 <Field Map zaih>
	//*  56  187:aload_1         
	//*  57  188:invokestatic    #279 <Method zai GoogleApiManager$zab.zac(GoogleApiManager$zab)>
	//*  58  191:invokeinterface #282 <Method boolean Map.containsKey(Object)>
	//*  59  196:ifeq            1184
		{
			zaa.zaa((zaa)zaih.get(((Object) (zab.zac(((zab) (message)))))), ((zab) (message)));
	//   60  199:aload_0         
	//   61  200:getfield        #100 <Field Map zaih>
	//   62  203:aload_1         
	//   63  204:invokestatic    #279 <Method zai GoogleApiManager$zab.zac(GoogleApiManager$zab)>
	//   64  207:invokeinterface #192 <Method Object Map.get(Object)>
	//   65  212:checkcast       #8   <Class GoogleApiManager$zaa>
	//   66  215:aload_1         
	//   67  216:invokestatic    #287 <Method void GoogleApiManager$zaa.zaa(GoogleApiManager$zaa, GoogleApiManager$zab)>
			return true;
	//   68  219:iconst_1        
	//   69  220:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L13:
		message = ((Message) ((zaaf)message.obj));
	//   70  221:aload_1         
	//   71  222:getfield        #276 <Field Object Message.obj>
	//   72  225:checkcast       #289 <Class zaaf>
	//   73  228:astore_1        
		Object obj = ((Object) (((zaaf) (message)).zak()));
	//   74  229:aload_1         
	//   75  230:invokevirtual   #290 <Method zai zaaf.zak()>
	//   76  233:astore          6
		if(!zaih.containsKey(obj))
	//*  77  235:aload_0         
	//*  78  236:getfield        #100 <Field Map zaih>
	//*  79  239:aload           6
	//*  80  241:invokeinterface #282 <Method boolean Map.containsKey(Object)>
	//*  81  246:ifne            268
		{
			obj = ((Object) (((zaaf) (message)).zaal()));
	//   82  249:aload_1         
	//   83  250:invokevirtual   #294 <Method TaskCompletionSource zaaf.zaal()>
	//   84  253:astore          6
			message = ((Message) (Boolean.valueOf(false)));
	//   85  255:iconst_0        
	//   86  256:invokestatic    #300 <Method Boolean Boolean.valueOf(boolean)>
	//   87  259:astore_1        
		} else
	//*  88  260:aload           6
	//*  89  262:aload_1         
	//*  90  263:invokevirtual   #306 <Method void TaskCompletionSource.setResult(Object)>
	//*  91  266:iconst_1        
	//*  92  267:ireturn         
		{
			boolean flag = zaa.zaa((zaa)zaih.get(obj), false);
	//   93  268:aload_0         
	//   94  269:getfield        #100 <Field Map zaih>
	//   95  272:aload           6
	//   96  274:invokeinterface #192 <Method Object Map.get(Object)>
	//   97  279:checkcast       #8   <Class GoogleApiManager$zaa>
	//   98  282:iconst_0        
	//   99  283:invokestatic    #309 <Method boolean GoogleApiManager$zaa.zaa(GoogleApiManager$zaa, boolean)>
	//  100  286:istore          5
			obj = ((Object) (((zaaf) (message)).zaal()));
	//  101  288:aload_1         
	//  102  289:invokevirtual   #294 <Method TaskCompletionSource zaaf.zaal()>
	//  103  292:astore          6
			message = ((Message) (Boolean.valueOf(flag)));
	//  104  294:iload           5
	//  105  296:invokestatic    #300 <Method Boolean Boolean.valueOf(boolean)>
	//  106  299:astore_1        
		}
		((TaskCompletionSource) (obj)).setResult(((Object) (message)));
		return true;
	//* 107  300:goto            260
_L12:
		if(zaih.containsKey(message.obj))
	//* 108  303:aload_0         
	//* 109  304:getfield        #100 <Field Map zaih>
	//* 110  307:aload_1         
	//* 111  308:getfield        #276 <Field Object Message.obj>
	//* 112  311:invokeinterface #282 <Method boolean Map.containsKey(Object)>
	//* 113  316:ifeq            1184
		{
			((zaa)zaih.get(message.obj)).zabp();
	//  114  319:aload_0         
	//  115  320:getfield        #100 <Field Map zaih>
	//  116  323:aload_1         
	//  117  324:getfield        #276 <Field Object Message.obj>
	//  118  327:invokeinterface #192 <Method Object Map.get(Object)>
	//  119  332:checkcast       #8   <Class GoogleApiManager$zaa>
	//  120  335:invokevirtual   #312 <Method boolean GoogleApiManager$zaa.zabp()>
	//  121  338:pop             
			return true;
	//  122  339:iconst_1        
	//  123  340:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L11:
		if(zaih.containsKey(message.obj))
	//* 124  341:aload_0         
	//* 125  342:getfield        #100 <Field Map zaih>
	//* 126  345:aload_1         
	//* 127  346:getfield        #276 <Field Object Message.obj>
	//* 128  349:invokeinterface #282 <Method boolean Map.containsKey(Object)>
	//* 129  354:ifeq            1184
		{
			((zaa)zaih.get(message.obj)).zaav();
	//  130  357:aload_0         
	//  131  358:getfield        #100 <Field Map zaih>
	//  132  361:aload_1         
	//  133  362:getfield        #276 <Field Object Message.obj>
	//  134  365:invokeinterface #192 <Method Object Map.get(Object)>
	//  135  370:checkcast       #8   <Class GoogleApiManager$zaa>
	//  136  373:invokevirtual   #315 <Method void GoogleApiManager$zaa.zaav()>
			return true;
	//  137  376:iconst_1        
	//  138  377:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L10:
		zai zai1;
		for(message = ((Message) (zaik.iterator())); ((Iterator) (message)).hasNext(); ((zaa)zaih.remove(((Object) (zai1)))).zabj())
	//* 139  378:aload_0         
	//* 140  379:getfield        #109 <Field Set zaik>
	//* 141  382:invokeinterface #319 <Method Iterator Set.iterator()>
	//* 142  387:astore_1        
	//* 143  388:aload_1         
	//* 144  389:invokeinterface #324 <Method boolean Iterator.hasNext()>
	//* 145  394:ifeq            428
			zai1 = (zai)((Iterator) (message)).next();
	//  146  397:aload_1         
	//  147  398:invokeinterface #327 <Method Object Iterator.next()>
	//  148  403:checkcast       #329 <Class zai>
	//  149  406:astore          6

	//  150  408:aload_0         
	//  151  409:getfield        #100 <Field Map zaih>
	//  152  412:aload           6
	//  153  414:invokeinterface #332 <Method Object Map.remove(Object)>
	//  154  419:checkcast       #8   <Class GoogleApiManager$zaa>
	//  155  422:invokevirtual   #335 <Method void GoogleApiManager$zaa.zabj()>
	//* 156  425:goto            388
		zaik.clear();
	//  157  428:aload_0         
	//  158  429:getfield        #109 <Field Set zaik>
	//  159  432:invokeinterface #338 <Method void Set.clear()>
		return true;
	//  160  437:iconst_1        
	//  161  438:ireturn         
_L9:
		if(zaih.containsKey(message.obj))
	//* 162  439:aload_0         
	//* 163  440:getfield        #100 <Field Map zaih>
	//* 164  443:aload_1         
	//* 165  444:getfield        #276 <Field Object Message.obj>
	//* 166  447:invokeinterface #282 <Method boolean Map.containsKey(Object)>
	//* 167  452:ifeq            1184
		{
			((zaa)zaih.get(message.obj)).resume();
	//  168  455:aload_0         
	//  169  456:getfield        #100 <Field Map zaih>
	//  170  459:aload_1         
	//  171  460:getfield        #276 <Field Object Message.obj>
	//  172  463:invokeinterface #192 <Method Object Map.get(Object)>
	//  173  468:checkcast       #8   <Class GoogleApiManager$zaa>
	//  174  471:invokevirtual   #341 <Method void GoogleApiManager$zaa.resume()>
			return true;
	//  175  474:iconst_1        
	//  176  475:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L8:
		zab((GoogleApi)message.obj);
	//  177  476:aload_0         
	//  178  477:aload_1         
	//  179  478:getfield        #276 <Field Object Message.obj>
	//  180  481:checkcast       #182 <Class GoogleApi>
	//  181  484:invokespecial   #343 <Method void zab(GoogleApi)>
		return true;
	//  182  487:iconst_1        
	//  183  488:ireturn         
_L7:
		if(!PlatformVersion.isAtLeastIceCreamSandwich() || !(zaic.getApplicationContext() instanceof Application))
			break; /* Loop/switch isn't completed */
	//  184  489:invokestatic    #348 <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//  185  492:ifeq            1184
	//  186  495:aload_0         
	//  187  496:getfield        #111 <Field Context zaic>
	//  188  499:invokevirtual   #171 <Method Context Context.getApplicationContext()>
	//  189  502:instanceof      #350 <Class Application>
	//  190  505:ifeq            1184
		BackgroundDetector.initialize((Application)zaic.getApplicationContext());
	//  191  508:aload_0         
	//  192  509:getfield        #111 <Field Context zaic>
	//  193  512:invokevirtual   #171 <Method Context Context.getApplicationContext()>
	//  194  515:checkcast       #350 <Class Application>
	//  195  518:invokestatic    #356 <Method void BackgroundDetector.initialize(Application)>
		BackgroundDetector.getInstance().addListener(((BackgroundDetector.BackgroundStateChangeListener) (new zabi(this))));
	//  196  521:invokestatic    #359 <Method BackgroundDetector BackgroundDetector.getInstance()>
	//  197  524:new             #361 <Class zabi>
	//  198  527:dup             
	//  199  528:aload_0         
	//  200  529:invokespecial   #364 <Method void zabi(GoogleApiManager)>
	//  201  532:invokevirtual   #368 <Method void BackgroundDetector.addListener(BackgroundDetector$BackgroundStateChangeListener)>
		if(!BackgroundDetector.getInstance().readCurrentStateIfPossible(true))
	//* 202  535:invokestatic    #359 <Method BackgroundDetector BackgroundDetector.getInstance()>
	//* 203  538:iconst_1        
	//* 204  539:invokevirtual   #372 <Method boolean BackgroundDetector.readCurrentStateIfPossible(boolean)>
	//* 205  542:ifne            1184
		{
			zaia = 0x493e0L;
	//  206  545:aload_0         
	//  207  546:ldc2w           #248 <Long 0x493e0L>
	//  208  549:putfield        #83  <Field long zaia>
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
	//  212  555:getfield        #375 <Field int Message.arg1>
	//  213  558:istore_2        
		obj1 = ((Object) ((ConnectionResult)message.obj));
	//  214  559:aload_1         
	//  215  560:getfield        #276 <Field Object Message.obj>
	//  216  563:checkcast       #377 <Class ConnectionResult>
	//  217  566:astore          6
		iterator1 = zaih.values().iterator();
	//  218  568:aload_0         
	//  219  569:getfield        #100 <Field Map zaih>
	//  220  572:invokeinterface #381 <Method Collection Map.values()>
	//  221  577:invokeinterface #384 <Method Iterator Collection.iterator()>
	//  222  582:astore          7
_L19:
		if(!iterator1.hasNext()) goto _L17; else goto _L16
	//  223  584:aload           7
	//  224  586:invokeinterface #324 <Method boolean Iterator.hasNext()>
	//  225  591:ifeq            616
_L16:
		message = ((Message) ((zaa)iterator1.next()));
	//  226  594:aload           7
	//  227  596:invokeinterface #327 <Method Object Iterator.next()>
	//  228  601:checkcast       #8   <Class GoogleApiManager$zaa>
	//  229  604:astore_1        
		if(((zaa) (message)).getInstanceId() != i) goto _L19; else goto _L18
	//  230  605:aload_1         
	//  231  606:invokevirtual   #387 <Method int GoogleApiManager$zaa.getInstanceId()>
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
			String s = zaid.getErrorString(((ConnectionResult) (obj1)).getErrorCode());
	//  239  622:aload_0         
	//  240  623:getfield        #120 <Field GoogleApiAvailability zaid>
	//  241  626:aload           6
	//  242  628:invokevirtual   #390 <Method int ConnectionResult.getErrorCode()>
	//  243  631:invokevirtual   #394 <Method String GoogleApiAvailability.getErrorString(int)>
	//  244  634:astore          7
			obj1 = ((Object) (((ConnectionResult) (obj1)).getErrorMessage()));
	//  245  636:aload           6
	//  246  638:invokevirtual   #397 <Method String ConnectionResult.getErrorMessage()>
	//  247  641:astore          6
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 69 + String.valueOf(obj1).length());
	//  248  643:new             #251 <Class StringBuilder>
	//  249  646:dup             
	//  250  647:aload           7
	//  251  649:invokestatic    #402 <Method String String.valueOf(Object)>
	//  252  652:invokevirtual   #405 <Method int String.length()>
	//  253  655:bipush          69
	//  254  657:iadd            
	//  255  658:aload           6
	//  256  660:invokestatic    #402 <Method String String.valueOf(Object)>
	//  257  663:invokevirtual   #405 <Method int String.length()>
	//  258  666:iadd            
	//  259  667:invokespecial   #252 <Method void StringBuilder(int)>
	//  260  670:astore          8
			stringbuilder.append("Error resolution was canceled by the user, original error message: ");
	//  261  672:aload           8
	//  262  674:ldc2            #407 <String "Error resolution was canceled by the user, original error message: ">
	//  263  677:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//  264  680:pop             
			stringbuilder.append(s);
	//  265  681:aload           8
	//  266  683:aload           7
	//  267  685:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//  268  688:pop             
			stringbuilder.append(": ");
	//  269  689:aload           8
	//  270  691:ldc2            #409 <String ": ">
	//  271  694:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//  272  697:pop             
			stringbuilder.append(((String) (obj1)));
	//  273  698:aload           8
	//  274  700:aload           6
	//  275  702:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//  276  705:pop             
			((zaa) (message)).zac(new Status(17, stringbuilder.toString()));
	//  277  706:aload_1         
	//  278  707:new             #53  <Class Status>
	//  279  710:dup             
	//  280  711:bipush          17
	//  281  713:aload           8
	//  282  715:invokevirtual   #267 <Method String StringBuilder.toString()>
	//  283  718:invokespecial   #59  <Method void Status(int, String)>
	//  284  721:invokevirtual   #412 <Method void GoogleApiManager$zaa.zac(Status)>
			return true;
	//  285  724:iconst_1        
	//  286  725:ireturn         
		} else
		{
			message = ((Message) (new StringBuilder(76)));
	//  287  726:new             #251 <Class StringBuilder>
	//  288  729:dup             
	//  289  730:bipush          76
	//  290  732:invokespecial   #252 <Method void StringBuilder(int)>
	//  291  735:astore_1        
			((StringBuilder) (message)).append("Could not find API instance ");
	//  292  736:aload_1         
	//  293  737:ldc2            #414 <String "Could not find API instance ">
	//  294  740:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//  295  743:pop             
			((StringBuilder) (message)).append(i);
	//  296  744:aload_1         
	//  297  745:iload_2         
	//  298  746:invokevirtual   #261 <Method StringBuilder StringBuilder.append(int)>
	//  299  749:pop             
			((StringBuilder) (message)).append(" while trying to fail enqueued calls.");
	//  300  750:aload_1         
	//  301  751:ldc2            #416 <String " while trying to fail enqueued calls.">
	//  302  754:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//  303  757:pop             
			Log.wtf("GoogleApiManager", ((StringBuilder) (message)).toString(), ((Throwable) (new Exception())));
	//  304  758:ldc2            #263 <String "GoogleApiManager">
	//  305  761:aload_1         
	//  306  762:invokevirtual   #267 <Method String StringBuilder.toString()>
	//  307  765:new             #418 <Class Exception>
	//  308  768:dup             
	//  309  769:invokespecial   #419 <Method void Exception()>
	//  310  772:invokestatic    #423 <Method int Log.wtf(String, String, Throwable)>
	//  311  775:pop             
			return true;
	//  312  776:iconst_1        
	//  313  777:ireturn         
		}
_L5:
		zabv zabv1 = (zabv)message.obj;
	//  314  778:aload_1         
	//  315  779:getfield        #276 <Field Object Message.obj>
	//  316  782:checkcast       #425 <Class zabv>
	//  317  785:astore          7
		zaa zaa1 = (zaa)zaih.get(((Object) (zabv1.zajs.zak())));
	//  318  787:aload_0         
	//  319  788:getfield        #100 <Field Map zaih>
	//  320  791:aload           7
	//  321  793:getfield        #429 <Field GoogleApi zabv.zajs>
	//  322  796:invokevirtual   #186 <Method zai GoogleApi.zak()>
	//  323  799:invokeinterface #192 <Method Object Map.get(Object)>
	//  324  804:checkcast       #8   <Class GoogleApiManager$zaa>
	//  325  807:astore          6
		message = ((Message) (zaa1));
	//  326  809:aload           6
	//  327  811:astore_1        
		if(zaa1 == null)
	//* 328  812:aload           6
	//* 329  814:ifnonnull       847
		{
			zab(zabv1.zajs);
	//  330  817:aload_0         
	//  331  818:aload           7
	//  332  820:getfield        #429 <Field GoogleApi zabv.zajs>
	//  333  823:invokespecial   #343 <Method void zab(GoogleApi)>
			message = ((Message) ((zaa)zaih.get(((Object) (zabv1.zajs.zak())))));
	//  334  826:aload_0         
	//  335  827:getfield        #100 <Field Map zaih>
	//  336  830:aload           7
	//  337  832:getfield        #429 <Field GoogleApi zabv.zajs>
	//  338  835:invokevirtual   #186 <Method zai GoogleApi.zak()>
	//  339  838:invokeinterface #192 <Method Object Map.get(Object)>
	//  340  843:checkcast       #8   <Class GoogleApiManager$zaa>
	//  341  846:astore_1        
		}
		if(((zaa) (message)).requiresSignIn() && zaig.get() != zabv1.zajr)
	//* 342  847:aload_1         
	//* 343  848:invokevirtual   #203 <Method boolean GoogleApiManager$zaa.requiresSignIn()>
	//* 344  851:ifeq            886
	//* 345  854:aload_0         
	//* 346  855:getfield        #92  <Field AtomicInteger zaig>
	//* 347  858:invokevirtual   #431 <Method int AtomicInteger.get()>
	//* 348  861:aload           7
	//* 349  863:getfield        #434 <Field int zabv.zajr>
	//* 350  866:icmpeq          886
		{
			zabv1.zajq.zaa(zahw);
	//  351  869:aload           7
	//  352  871:getfield        #438 <Field zab zabv.zajq>
	//  353  874:getstatic       #61  <Field Status zahw>
	//  354  877:invokevirtual   #442 <Method void zab.zaa(Status)>
			((zaa) (message)).zabj();
	//  355  880:aload_1         
	//  356  881:invokevirtual   #335 <Method void GoogleApiManager$zaa.zabj()>
			return true;
	//  357  884:iconst_1        
	//  358  885:ireturn         
		} else
		{
			((zaa) (message)).zaa(zabv1.zajq);
	//  359  886:aload_1         
	//  360  887:aload           7
	//  361  889:getfield        #438 <Field zab zabv.zajq>
	//  362  892:invokevirtual   #445 <Method void GoogleApiManager$zaa.zaa(zab)>
			return true;
	//  363  895:iconst_1        
	//  364  896:ireturn         
		}
_L4:
		zaa zaa2;
		for(message = ((Message) (zaih.values().iterator())); ((Iterator) (message)).hasNext(); zaa2.connect())
	//* 365  897:aload_0         
	//* 366  898:getfield        #100 <Field Map zaih>
	//* 367  901:invokeinterface #381 <Method Collection Map.values()>
	//* 368  906:invokeinterface #384 <Method Iterator Collection.iterator()>
	//* 369  911:astore_1        
	//* 370  912:aload_1         
	//* 371  913:invokeinterface #324 <Method boolean Iterator.hasNext()>
	//* 372  918:ifeq            1184
		{
			zaa2 = (zaa)((Iterator) (message)).next();
	//  373  921:aload_1         
	//  374  922:invokeinterface #327 <Method Object Iterator.next()>
	//  375  927:checkcast       #8   <Class GoogleApiManager$zaa>
	//  376  930:astore          6
			zaa2.zabl();
	//  377  932:aload           6
	//  378  934:invokevirtual   #448 <Method void GoogleApiManager$zaa.zabl()>
		}

	//  379  937:aload           6
	//  380  939:invokevirtual   #212 <Method void GoogleApiManager$zaa.connect()>
		break; /* Loop/switch isn't completed */
	//  381  942:goto            912
_L3:
		message = ((Message) ((zak)message.obj));
	//  382  945:aload_1         
	//  383  946:getfield        #276 <Field Object Message.obj>
	//  384  949:checkcast       #450 <Class zak>
	//  385  952:astore_1        
		Iterator iterator = ((zak) (message)).zap().iterator();
	//  386  953:aload_1         
	//  387  954:invokevirtual   #454 <Method Set zak.zap()>
	//  388  957:invokeinterface #319 <Method Iterator Set.iterator()>
	//  389  962:astore          6
		do
		{
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
	//  390  964:aload           6
	//  391  966:invokeinterface #324 <Method boolean Iterator.hasNext()>
	//  392  971:ifeq            1184
			zai zai3 = (zai)iterator.next();
	//  393  974:aload           6
	//  394  976:invokeinterface #327 <Method Object Iterator.next()>
	//  395  981:checkcast       #329 <Class zai>
	//  396  984:astore          7
			zaa zaa3 = (zaa)zaih.get(((Object) (zai3)));
	//  397  986:aload_0         
	//  398  987:getfield        #100 <Field Map zaih>
	//  399  990:aload           7
	//  400  992:invokeinterface #192 <Method Object Map.get(Object)>
	//  401  997:checkcast       #8   <Class GoogleApiManager$zaa>
	//  402 1000:astore          8
			if(zaa3 == null)
	//* 403 1002:aload           8
	//* 404 1004:ifnonnull       1025
			{
				((zak) (message)).zaa(zai3, new ConnectionResult(13), ((String) (null)));
	//  405 1007:aload_1         
	//  406 1008:aload           7
	//  407 1010:new             #377 <Class ConnectionResult>
	//  408 1013:dup             
	//  409 1014:bipush          13
	//  410 1016:invokespecial   #455 <Method void ConnectionResult(int)>
	//  411 1019:aconst_null     
	//  412 1020:invokevirtual   #458 <Method void zak.zaa(zai, ConnectionResult, String)>
				return true;
	//  413 1023:iconst_1        
	//  414 1024:ireturn         
			}
			if(zaa3.isConnected())
	//* 415 1025:aload           8
	//* 416 1027:invokevirtual   #461 <Method boolean GoogleApiManager$zaa.isConnected()>
	//* 417 1030:ifeq            1055
				((zak) (message)).zaa(zai3, ConnectionResult.RESULT_SUCCESS, zaa3.zaab().getEndpointPackageName());
	//  418 1033:aload_1         
	//  419 1034:aload           7
	//  420 1036:getstatic       #465 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//  421 1039:aload           8
	//  422 1041:invokevirtual   #469 <Method com.google.android.gms.common.api.Api$Client GoogleApiManager$zaa.zaab()>
	//  423 1044:invokeinterface #474 <Method String com.google.android.gms.common.api.Api$Client.getEndpointPackageName()>
	//  424 1049:invokevirtual   #458 <Method void zak.zaa(zai, ConnectionResult, String)>
			else
	//* 425 1052:goto            964
			if(zaa3.zabm() != null)
	//* 426 1055:aload           8
	//* 427 1057:invokevirtual   #478 <Method ConnectionResult GoogleApiManager$zaa.zabm()>
	//* 428 1060:ifnull          1078
			{
				((zak) (message)).zaa(zai3, zaa3.zabm(), ((String) (null)));
	//  429 1063:aload_1         
	//  430 1064:aload           7
	//  431 1066:aload           8
	//  432 1068:invokevirtual   #478 <Method ConnectionResult GoogleApiManager$zaa.zabm()>
	//  433 1071:aconst_null     
	//  434 1072:invokevirtual   #458 <Method void zak.zaa(zai, ConnectionResult, String)>
			} else
	//* 435 1075:goto            964
			{
				zaa3.zaa(((zak) (message)));
	//  436 1078:aload           8
	//  437 1080:aload_1         
	//  438 1081:invokevirtual   #481 <Method void GoogleApiManager$zaa.zaa(zak)>
				zaa3.connect();
	//  439 1084:aload           8
	//  440 1086:invokevirtual   #212 <Method void GoogleApiManager$zaa.connect()>
			}
		} while(true);
	//  441 1089:goto            964
_L2:
		if(((Boolean)message.obj).booleanValue())
	//* 442 1092:aload_1         
	//* 443 1093:getfield        #276 <Field Object Message.obj>
	//* 444 1096:checkcast       #296 <Class Boolean>
	//* 445 1099:invokevirtual   #484 <Method boolean Boolean.booleanValue()>
	//* 446 1102:ifeq            1109
			l = 10000L;
	//  447 1105:ldc2w           #80  <Long 10000L>
	//  448 1108:lstore_3        
		zaia = l;
	//  449 1109:aload_0         
	//  450 1110:lload_3         
	//  451 1111:putfield        #83  <Field long zaia>
		handler.removeMessages(12);
	//  452 1114:aload_0         
	//  453 1115:getfield        #118 <Field Handler handler>
	//  454 1118:bipush          12
	//  455 1120:invokevirtual   #487 <Method void Handler.removeMessages(int)>
		zai zai2;
		for(message = ((Message) (zaih.keySet().iterator())); ((Iterator) (message)).hasNext(); handler.sendMessageDelayed(handler.obtainMessage(12, ((Object) (zai2))), zaia))
	//* 456 1123:aload_0         
	//* 457 1124:getfield        #100 <Field Map zaih>
	//* 458 1127:invokeinterface #490 <Method Set Map.keySet()>
	//* 459 1132:invokeinterface #319 <Method Iterator Set.iterator()>
	//* 460 1137:astore_1        
	//* 461 1138:aload_1         
	//* 462 1139:invokeinterface #324 <Method boolean Iterator.hasNext()>
	//* 463 1144:ifeq            1184
			zai2 = (zai)((Iterator) (message)).next();
	//  464 1147:aload_1         
	//  465 1148:invokeinterface #327 <Method Object Iterator.next()>
	//  466 1153:checkcast       #329 <Class zai>
	//  467 1156:astore          6

	//  468 1158:aload_0         
	//  469 1159:getfield        #118 <Field Handler handler>
	//  470 1162:aload_0         
	//  471 1163:getfield        #118 <Field Handler handler>
	//  472 1166:bipush          12
	//  473 1168:aload           6
	//  474 1170:invokevirtual   #493 <Method Message Handler.obtainMessage(int, Object)>
	//  475 1173:aload_0         
	//  476 1174:getfield        #83  <Field long zaia>
	//  477 1177:invokevirtual   #497 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//  478 1180:pop             
	//* 479 1181:goto            1138
		return true;
	//  480 1184:iconst_1        
	//  481 1185:ireturn         
	}

	final void maybeSignOut()
	{
		zaig.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field AtomicInteger zaig>
	//    2    4:invokevirtual   #145 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		handler.sendMessage(handler.obtainMessage(10));
	//    4    8:aload_0         
	//    5    9:getfield        #118 <Field Handler handler>
	//    6   12:aload_0         
	//    7   13:getfield        #118 <Field Handler handler>
	//    8   16:bipush          10
	//    9   18:invokevirtual   #133 <Method Message Handler.obtainMessage(int)>
	//   10   21:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   11   24:pop             
	//   12   25:return          
	}

	final PendingIntent zaa(zai zai1, int i)
	{
		zai1 = ((zai) ((zaa)zaih.get(((Object) (zai1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Map zaih>
	//    2    4:aload_1         
	//    3    5:invokeinterface #192 <Method Object Map.get(Object)>
	//    4   10:checkcast       #8   <Class GoogleApiManager$zaa>
	//    5   13:astore_1        
		if(zai1 == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		zai1 = ((zai) (((zaa) (zai1)).zabq()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #503 <Method zad GoogleApiManager$zaa.zabq()>
	//   12   24:astore_1        
		if(zai1 == null)
	//*  13   25:aload_1         
	//*  14   26:ifnonnull       31
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
		else
			return PendingIntent.getActivity(zaic, i, ((zad) (zai1)).getSignInIntent(), 0x8000000);
	//   17   31:aload_0         
	//   18   32:getfield        #111 <Field Context zaic>
	//   19   35:iload_2         
	//   20   36:aload_1         
	//   21   37:invokeinterface #509 <Method android.content.Intent zad.getSignInIntent()>
	//   22   42:ldc2            #510 <Int 0x8000000>
	//   23   45:invokestatic    #516 <Method PendingIntent PendingIntent.getActivity(Context, int, android.content.Intent, int)>
	//   24   48:areturn         
	}

	public final Task zaa(GoogleApi googleapi, ListenerHolder.ListenerKey listenerkey)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #302 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #519 <Method void TaskCompletionSource()>
	//    3    7:astore_3        
		listenerkey = ((ListenerHolder.ListenerKey) (new zah(listenerkey, taskcompletionsource)));
	//    4    8:new             #521 <Class zah>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokespecial   #524 <Method void zah(ListenerHolder$ListenerKey, TaskCompletionSource)>
	//    9   17:astore_2        
		handler.sendMessage(handler.obtainMessage(13, ((Object) (new zabv(((com.google.android.gms.common.api.internal.zab) (listenerkey)), zaig.get(), googleapi)))));
	//   10   18:aload_0         
	//   11   19:getfield        #118 <Field Handler handler>
	//   12   22:aload_0         
	//   13   23:getfield        #118 <Field Handler handler>
	//   14   26:bipush          13
	//   15   28:new             #425 <Class zabv>
	//   16   31:dup             
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #92  <Field AtomicInteger zaig>
	//   20   37:invokevirtual   #431 <Method int AtomicInteger.get()>
	//   21   40:aload_1         
	//   22   41:invokespecial   #527 <Method void zabv(zab, int, GoogleApi)>
	//   23   44:invokevirtual   #493 <Method Message Handler.obtainMessage(int, Object)>
	//   24   47:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   25   50:pop             
		return taskcompletionsource.getTask();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #531 <Method Task TaskCompletionSource.getTask()>
	//   28   55:areturn         
	}

	public final Task zaa(GoogleApi googleapi, RegisterListenerMethod registerlistenermethod, UnregisterListenerMethod unregisterlistenermethod)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #302 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #519 <Method void TaskCompletionSource()>
	//    3    7:astore          4
		registerlistenermethod = ((RegisterListenerMethod) (new zaf(new zabw(registerlistenermethod, unregisterlistenermethod), taskcompletionsource)));
	//    4    9:new             #535 <Class zaf>
	//    5   12:dup             
	//    6   13:new             #537 <Class zabw>
	//    7   16:dup             
	//    8   17:aload_2         
	//    9   18:aload_3         
	//   10   19:invokespecial   #540 <Method void zabw(RegisterListenerMethod, UnregisterListenerMethod)>
	//   11   22:aload           4
	//   12   24:invokespecial   #543 <Method void zaf(zabw, TaskCompletionSource)>
	//   13   27:astore_2        
		handler.sendMessage(handler.obtainMessage(8, ((Object) (new zabv(((com.google.android.gms.common.api.internal.zab) (registerlistenermethod)), zaig.get(), googleapi)))));
	//   14   28:aload_0         
	//   15   29:getfield        #118 <Field Handler handler>
	//   16   32:aload_0         
	//   17   33:getfield        #118 <Field Handler handler>
	//   18   36:bipush          8
	//   19   38:new             #425 <Class zabv>
	//   20   41:dup             
	//   21   42:aload_2         
	//   22   43:aload_0         
	//   23   44:getfield        #92  <Field AtomicInteger zaig>
	//   24   47:invokevirtual   #431 <Method int AtomicInteger.get()>
	//   25   50:aload_1         
	//   26   51:invokespecial   #527 <Method void zabv(zab, int, GoogleApi)>
	//   27   54:invokevirtual   #493 <Method Message Handler.obtainMessage(int, Object)>
	//   28   57:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   29   60:pop             
		return taskcompletionsource.getTask();
	//   30   61:aload           4
	//   31   63:invokevirtual   #531 <Method Task TaskCompletionSource.getTask()>
	//   32   66:areturn         
	}

	public final Task zaa(Iterable iterable)
	{
		iterable = ((Iterable) (new zak(iterable)));
	//    0    0:new             #450 <Class zak>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #548 <Method void zak(Iterable)>
	//    4    8:astore_1        
		handler.sendMessage(handler.obtainMessage(2, ((Object) (iterable))));
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field Handler handler>
	//    7   13:aload_0         
	//    8   14:getfield        #118 <Field Handler handler>
	//    9   17:iconst_2        
	//   10   18:aload_1         
	//   11   19:invokevirtual   #493 <Method Message Handler.obtainMessage(int, Object)>
	//   12   22:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   13   25:pop             
		return ((zak) (iterable)).getTask();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #549 <Method Task zak.getTask()>
	//   16   30:areturn         
	}

	public final void zaa(ConnectionResult connectionresult, int i)
	{
		if(!zac(connectionresult, i))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:invokevirtual   #554 <Method boolean zac(ConnectionResult, int)>
	//*   4    6:ifne            28
			handler.sendMessage(handler.obtainMessage(5, i, 0, ((Object) (connectionresult))));
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field Handler handler>
	//    7   13:aload_0         
	//    8   14:getfield        #118 <Field Handler handler>
	//    9   17:iconst_5        
	//   10   18:iload_2         
	//   11   19:iconst_0        
	//   12   20:aload_1         
	//   13   21:invokevirtual   #557 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   14   24:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   15   27:pop             
	//   16   28:return          
	}

	public final void zaa(GoogleApi googleapi)
	{
		handler.sendMessage(handler.obtainMessage(7, ((Object) (googleapi))));
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field Handler handler>
	//    4    8:bipush          7
	//    5   10:aload_1         
	//    6   11:invokevirtual   #493 <Method Message Handler.obtainMessage(int, Object)>
	//    7   14:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//    8   17:pop             
	//    9   18:return          
	}

	public final void zaa(GoogleApi googleapi, int i, BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		apimethodimpl = ((BaseImplementation.ApiMethodImpl) (new zae(i, apimethodimpl)));
	//    0    0:new             #560 <Class zae>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #563 <Method void zae(int, BaseImplementation$ApiMethodImpl)>
	//    5    9:astore_3        
		handler.sendMessage(handler.obtainMessage(4, ((Object) (new zabv(((com.google.android.gms.common.api.internal.zab) (apimethodimpl)), zaig.get(), googleapi)))));
	//    6   10:aload_0         
	//    7   11:getfield        #118 <Field Handler handler>
	//    8   14:aload_0         
	//    9   15:getfield        #118 <Field Handler handler>
	//   10   18:iconst_4        
	//   11   19:new             #425 <Class zabv>
	//   12   22:dup             
	//   13   23:aload_3         
	//   14   24:aload_0         
	//   15   25:getfield        #92  <Field AtomicInteger zaig>
	//   16   28:invokevirtual   #431 <Method int AtomicInteger.get()>
	//   17   31:aload_1         
	//   18   32:invokespecial   #527 <Method void zabv(zab, int, GoogleApi)>
	//   19   35:invokevirtual   #493 <Method Message Handler.obtainMessage(int, Object)>
	//   20   38:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   21   41:pop             
	//   22   42:return          
	}

	public final void zaa(GoogleApi googleapi, int i, TaskApiCall taskapicall, TaskCompletionSource taskcompletionsource, StatusExceptionMapper statusexceptionmapper)
	{
		taskapicall = ((TaskApiCall) (new zag(i, taskapicall, taskcompletionsource, statusexceptionmapper)));
	//    0    0:new             #567 <Class zag>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:invokespecial   #570 <Method void zag(int, TaskApiCall, TaskCompletionSource, StatusExceptionMapper)>
	//    7   13:astore_3        
		handler.sendMessage(handler.obtainMessage(4, ((Object) (new zabv(((com.google.android.gms.common.api.internal.zab) (taskapicall)), zaig.get(), googleapi)))));
	//    8   14:aload_0         
	//    9   15:getfield        #118 <Field Handler handler>
	//   10   18:aload_0         
	//   11   19:getfield        #118 <Field Handler handler>
	//   12   22:iconst_4        
	//   13   23:new             #425 <Class zabv>
	//   14   26:dup             
	//   15   27:aload_3         
	//   16   28:aload_0         
	//   17   29:getfield        #92  <Field AtomicInteger zaig>
	//   18   32:invokevirtual   #431 <Method int AtomicInteger.get()>
	//   19   35:aload_1         
	//   20   36:invokespecial   #527 <Method void zabv(zab, int, GoogleApi)>
	//   21   39:invokevirtual   #493 <Method Message Handler.obtainMessage(int, Object)>
	//   22   42:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   23   45:pop             
	//   24   46:return          
	}

	public final void zaa(zaae zaae1)
	{
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(zaii != zaae1)
	//*   4    6:aload_0         
	//*   5    7:getfield        #102 <Field zaae zaii>
	//*   6   10:aload_1         
	//*   7   11:if_acmpeq       28
			{
				zaii = zaae1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #102 <Field zaae zaii>
				zaij.clear();
	//   11   19:aload_0         
	//   12   20:getfield        #107 <Field Set zaij>
	//   13   23:invokeinterface #338 <Method void Set.clear()>
			}
			zaij.addAll(((Collection) (zaae1.zaaj())));
	//   14   28:aload_0         
	//   15   29:getfield        #107 <Field Set zaij>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #578 <Method b zaae.zaaj()>
	//   18   36:invokeinterface #582 <Method boolean Set.addAll(Collection)>
	//   19   41:pop             
		}
	//   20   42:aload_2         
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		zaae1;
	//   23   45:astore_1        
		obj;
	//   24   46:aload_2         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		throw zaae1;
	//   26   48:aload_1         
	//   27   49:athrow          
	}

	final void zab(zaae zaae1)
	{
		synchronized(lock)
	//*   0    0:getstatic       #69  <Field Object lock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(zaii == zaae1)
	//*   4    6:aload_0         
	//*   5    7:getfield        #102 <Field zaae zaii>
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       28
			{
				zaii = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #102 <Field zaae zaii>
				zaij.clear();
	//   11   19:aload_0         
	//   12   20:getfield        #107 <Field Set zaij>
	//   13   23:invokeinterface #338 <Method void Set.clear()>
			}
		}
	//   14   28:aload_2         
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		zaae1;
	//   17   31:astore_1        
		obj;
	//   18   32:aload_2         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw zaae1;
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	public final int zabd()
	{
		return zaif.getAndIncrement();
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field AtomicInteger zaif>
	//    2    4:invokevirtual   #586 <Method int AtomicInteger.getAndIncrement()>
	//    3    7:ireturn         
	}

	public final Task zac(GoogleApi googleapi)
	{
		googleapi = ((GoogleApi) (new zaaf(googleapi.zak())));
	//    0    0:new             #289 <Class zaaf>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #186 <Method zai GoogleApi.zak()>
	//    4    8:invokespecial   #590 <Method void zaaf(zai)>
	//    5   11:astore_1        
		handler.sendMessage(handler.obtainMessage(14, ((Object) (googleapi))));
	//    6   12:aload_0         
	//    7   13:getfield        #118 <Field Handler handler>
	//    8   16:aload_0         
	//    9   17:getfield        #118 <Field Handler handler>
	//   10   20:bipush          14
	//   11   22:aload_1         
	//   12   23:invokevirtual   #493 <Method Message Handler.obtainMessage(int, Object)>
	//   13   26:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   14   29:pop             
		return ((zaaf) (googleapi)).zaal().getTask();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #294 <Method TaskCompletionSource zaaf.zaal()>
	//   17   34:invokevirtual   #531 <Method Task TaskCompletionSource.getTask()>
	//   18   37:areturn         
	}

	final boolean zac(ConnectionResult connectionresult, int i)
	{
		return zaid.zaa(zaic, connectionresult, i);
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field GoogleApiAvailability zaid>
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field Context zaic>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #594 <Method boolean GoogleApiAvailability.zaa(Context, ConnectionResult, int)>
	//    7   13:ireturn         
	}

	public final void zao()
	{
		handler.sendMessage(handler.obtainMessage(3));
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field Handler handler>
	//    4    8:iconst_3        
	//    5    9:invokevirtual   #133 <Method Message Handler.obtainMessage(int)>
	//    6   12:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final Object lock = new Object();
	public static final Status zahw = new Status(4, "Sign-out occurred while this API call was in progress.");
	private static final Status zahx = new Status(4, "The user must be signed in to make this API call.");
	private static GoogleApiManager zaib;
	private final Handler handler;
	private long zahy;
	private long zahz;
	private long zaia;
	private final Context zaic;
	private final GoogleApiAvailability zaid;
	private final GoogleApiAvailabilityCache zaie;
	private final AtomicInteger zaif = new AtomicInteger(1);
	private final AtomicInteger zaig = new AtomicInteger(0);
	private final Map zaih = new ConcurrentHashMap(5, 0.75F, 1);
	private zaae zaii;
	private final Set zaij = new b();
	private final Set zaik = new b();

	static 
	{
	//    0    0:new             #53  <Class Status>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:ldc1            #55  <String "Sign-out occurred while this API call was in progress.">
	//    4    7:invokespecial   #59  <Method void Status(int, String)>
	//    5   10:putstatic       #61  <Field Status zahw>
	//    6   13:new             #53  <Class Status>
	//    7   16:dup             
	//    8   17:iconst_4        
	//    9   18:ldc1            #63  <String "The user must be signed in to make this API call.">
	//   10   20:invokespecial   #59  <Method void Status(int, String)>
	//   11   23:putstatic       #65  <Field Status zahx>
	//   12   26:new             #4   <Class Object>
	//   13   29:dup             
	//   14   30:invokespecial   #67  <Method void Object()>
	//   15   33:putstatic       #69  <Field Object lock>
	//*  16   36:return          
	}
}
