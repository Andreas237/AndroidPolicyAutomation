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
		//*   1    1:ifnull          172
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
		//    8   12:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//    9   15:invokeinterface #141 <Method Feature[] com.google.android.gms.common.api.Api$Client.getAvailableFeatures()>
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
				ArrayMap arraymap = new ArrayMap(afeature1.length);
		//   20   39:new             #145 <Class ArrayMap>
		//   21   42:dup             
		//   22   43:aload           5
		//   23   45:arraylength     
		//   24   46:invokespecial   #148 <Method void ArrayMap(int)>
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
					((Map) (arraymap)).put(((Object) (feature1.getName())), ((Object) (Long.valueOf(feature1.getVersion()))));
		//   38   70:aload           6
		//   39   72:aload           7
		//   40   74:invokevirtual   #152 <Method String Feature.getName()>
		//   41   77:aload           7
		//   42   79:invokevirtual   #156 <Method long Feature.getVersion()>
		//   43   82:invokestatic    #162 <Method Long Long.valueOf(long)>
		//   44   85:invokeinterface #168 <Method Object Map.put(Object, Object)>
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
					if(((Map) (arraymap)).containsKey(((Object) (feature.getName()))))
		//*  63  115:aload           6
		//*  64  117:aload           5
		//*  65  119:invokevirtual   #152 <Method String Feature.getName()>
		//*  66  122:invokeinterface #172 <Method boolean Map.containsKey(Object)>
		//*  67  127:ifeq            167
					{
						if(((Long)((Map) (arraymap)).get(((Object) (feature.getName())))).longValue() < feature.getVersion())
		//*  68  130:aload           6
		//*  69  132:aload           5
		//*  70  134:invokevirtual   #152 <Method String Feature.getName()>
		//*  71  137:invokeinterface #176 <Method Object Map.get(Object)>
		//*  72  142:checkcast       #158 <Class Long>
		//*  73  145:invokevirtual   #179 <Method long Long.longValue()>
		//*  74  148:aload           5
		//*  75  150:invokevirtual   #156 <Method long Feature.getVersion()>
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

				return null;
		//   87  170:aconst_null     
		//   88  171:areturn         
			} else
			{
				return null;
		//   89  172:aconst_null     
		//   90  173:areturn         
			}
		}

		static void zaa(zaa zaa1, zab zab1)
		{
			zaa1.zaa(zab1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #184 <Method void zaa(GoogleApiManager$zab)>
		//    3    5:return          
		}

		private final void zaa(zab zab1)
		{
			if(!zaiv.contains(((Object) (zab1))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #73  <Field List zaiv>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #189 <Method boolean List.contains(Object)>
		//*   4   10:ifne            14
				return;
		//    5   13:return          
			if(!zaiu)
		//*   6   14:aload_0         
		//*   7   15:getfield        #191 <Field boolean zaiu>
		//*   8   18:ifne            42
			{
				if(!zain.isConnected())
		//*   9   21:aload_0         
		//*  10   22:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  11   25:invokeinterface #194 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*  12   30:ifne            38
				{
					connect();
		//   13   33:aload_0         
		//   14   34:invokevirtual   #197 <Method void connect()>
					return;
		//   15   37:return          
				}
				zabi();
		//   16   38:aload_0         
		//   17   39:invokespecial   #200 <Method void zabi()>
			}
		//   18   42:return          
		}

		static boolean zaa(zaa zaa1, boolean flag)
		{
			return zaa1.zac(false);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:invokespecial   #205 <Method boolean zac(boolean)>
		//    3    5:ireturn         
		}

		static void zab(zaa zaa1, zab zab1)
		{
			zaa1.zab(zab1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #207 <Method void zab(GoogleApiManager$zab)>
		//    3    5:return          
		}

		private final void zab(zab zab1)
		{
			if(zaiv.remove(((Object) (zab1))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #73  <Field List zaiv>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #210 <Method boolean List.remove(Object)>
		//*   4   10:ifeq            206
			{
				GoogleApiManager.zaa(zail).removeMessages(15, ((Object) (zab1)));
		//    5   13:aload_0         
		//    6   14:getfield        #50  <Field GoogleApiManager zail>
		//    7   17:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    8   20:bipush          15
		//    9   22:aload_1         
		//   10   23:invokevirtual   #214 <Method void Handler.removeMessages(int, Object)>
				GoogleApiManager.zaa(zail).removeMessages(16, ((Object) (zab1)));
		//   11   26:aload_0         
		//   12   27:getfield        #50  <Field GoogleApiManager zail>
		//   13   30:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   14   33:bipush          16
		//   15   35:aload_1         
		//   16   36:invokevirtual   #214 <Method void Handler.removeMessages(int, Object)>
				zab1 = ((zab) (com.google.android.gms.common.api.internal.zab.zad(zab1)));
		//   17   39:aload_1         
		//   18   40:invokestatic    #220 <Method Feature com.google.android.gms.common.api.internal.GoogleApiManager$zab.zad(GoogleApiManager$zab)>
		//   19   43:astore_1        
				ArrayList arraylist = new ArrayList(zaim.size());
		//   20   44:new             #70  <Class ArrayList>
		//   21   47:dup             
		//   22   48:aload_0         
		//   23   49:getfield        #58  <Field Queue zaim>
		//   24   52:invokeinterface #225 <Method int Queue.size()>
		//   25   57:invokespecial   #226 <Method void ArrayList(int)>
		//   26   60:astore          4
				Iterator iterator = zaim.iterator();
		//   27   62:aload_0         
		//   28   63:getfield        #58  <Field Queue zaim>
		//   29   66:invokeinterface #230 <Method Iterator Queue.iterator()>
		//   30   71:astore          5
				do
				{
					if(!iterator.hasNext())
						break;
		//   31   73:aload           5
		//   32   75:invokeinterface #235 <Method boolean Iterator.hasNext()>
		//   33   80:ifeq            139
					com.google.android.gms.common.api.internal.zab zab2 = (com.google.android.gms.common.api.internal.zab)iterator.next();
		//   34   83:aload           5
		//   35   85:invokeinterface #239 <Method Object Iterator.next()>
		//   36   90:checkcast       #241 <Class zab>
		//   37   93:astore          6
					if(zab2 instanceof com.google.android.gms.common.api.internal.zac)
		//*  38   95:aload           6
		//*  39   97:instanceof      #243 <Class zac>
		//*  40  100:ifeq            73
					{
						Feature afeature[] = ((com.google.android.gms.common.api.internal.zac)zab2).zab(this);
		//   41  103:aload           6
		//   42  105:checkcast       #243 <Class zac>
		//   43  108:aload_0         
		//   44  109:invokevirtual   #246 <Method Feature[] zac.zab(GoogleApiManager$zaa)>
		//   45  112:astore          7
						if(afeature != null && ArrayUtils.contains(((Object []) (afeature)), ((Object) (zab1))))
		//*  46  114:aload           7
		//*  47  116:ifnull          73
		//*  48  119:aload           7
		//*  49  121:aload_1         
		//*  50  122:invokestatic    #251 <Method boolean ArrayUtils.contains(Object[], Object)>
		//*  51  125:ifeq            73
							arraylist.add(((Object) (zab2)));
		//   52  128:aload           4
		//   53  130:aload           6
		//   54  132:invokevirtual   #254 <Method boolean ArrayList.add(Object)>
		//   55  135:pop             
					}
				} while(true);
		//   56  136:goto            73
				arraylist = (ArrayList)arraylist;
		//   57  139:aload           4
		//   58  141:checkcast       #70  <Class ArrayList>
		//   59  144:astore          4
				int j = arraylist.size();
		//   60  146:aload           4
		//   61  148:invokevirtual   #255 <Method int ArrayList.size()>
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
		//   70  162:invokevirtual   #258 <Method Object ArrayList.get(int)>
		//   71  165:astore          5
					i++;
		//   72  167:iload_2         
		//   73  168:iconst_1        
		//   74  169:iadd            
		//   75  170:istore_2        
					obj = ((Object) ((com.google.android.gms.common.api.internal.zab)obj));
		//   76  171:aload           5
		//   77  173:checkcast       #241 <Class zab>
		//   78  176:astore          5
					zaim.remove(obj);
		//   79  178:aload_0         
		//   80  179:getfield        #58  <Field Queue zaim>
		//   81  182:aload           5
		//   82  184:invokeinterface #259 <Method boolean Queue.remove(Object)>
		//   83  189:pop             
					((com.google.android.gms.common.api.internal.zab) (obj)).zaa(((RuntimeException) (new UnsupportedApiCallException(((Feature) (zab1))))));
		//   84  190:aload           5
		//   85  192:new             #261 <Class UnsupportedApiCallException>
		//   86  195:dup             
		//   87  196:aload_1         
		//   88  197:invokespecial   #264 <Method void UnsupportedApiCallException(Feature)>
		//   89  200:invokevirtual   #267 <Method void zab.zaa(RuntimeException)>
				}

			}
		//*  90  203:goto            154
		//   91  206:return          
		}

		private final boolean zab(com.google.android.gms.common.api.internal.zab zab1)
		{
			if(!(zab1 instanceof com.google.android.gms.common.api.internal.zac))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #243 <Class zac>
		//*   2    4:ifne            14
			{
				zac(zab1);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #271 <Method void zac(zab)>
				return true;
		//    6   12:iconst_1        
		//    7   13:ireturn         
			}
			com.google.android.gms.common.api.internal.zac zac1 = (com.google.android.gms.common.api.internal.zac)zab1;
		//    8   14:aload_1         
		//    9   15:checkcast       #243 <Class zac>
		//   10   18:astore_3        
			Feature feature = zaa(zac1.zab(this));
		//   11   19:aload_0         
		//   12   20:aload_3         
		//   13   21:aload_0         
		//   14   22:invokevirtual   #246 <Method Feature[] zac.zab(GoogleApiManager$zaa)>
		//   15   25:invokespecial   #273 <Method Feature zaa(Feature[])>
		//   16   28:astore          4
			if(feature == null)
		//*  17   30:aload           4
		//*  18   32:ifnonnull       42
			{
				zac(zab1);
		//   19   35:aload_0         
		//   20   36:aload_1         
		//   21   37:invokespecial   #271 <Method void zac(zab)>
				return true;
		//   22   40:iconst_1        
		//   23   41:ireturn         
			}
			if(zac1.zac(this))
		//*  24   42:aload_3         
		//*  25   43:aload_0         
		//*  26   44:invokevirtual   #276 <Method boolean zac.zac(GoogleApiManager$zaa)>
		//*  27   47:ifeq            248
			{
				zab1 = ((com.google.android.gms.common.api.internal.zab) (new zab(zafp, feature, ((zabi) (null)))));
		//   28   50:new             #216 <Class GoogleApiManager$zab>
		//   29   53:dup             
		//   30   54:aload_0         
		//   31   55:getfield        #105 <Field zai zafp>
		//   32   58:aload           4
		//   33   60:aconst_null     
		//   34   61:invokespecial   #279 <Method void GoogleApiManager$zab(zai, Feature, zabi)>
		//   35   64:astore_1        
				int i = zaiv.indexOf(((Object) (zab1)));
		//   36   65:aload_0         
		//   37   66:getfield        #73  <Field List zaiv>
		//   38   69:aload_1         
		//   39   70:invokeinterface #283 <Method int List.indexOf(Object)>
		//   40   75:istore_2        
				if(i >= 0)
		//*  41   76:iload_2         
		//*  42   77:iflt            141
				{
					zab1 = ((com.google.android.gms.common.api.internal.zab) ((zab)zaiv.get(i)));
		//   43   80:aload_0         
		//   44   81:getfield        #73  <Field List zaiv>
		//   45   84:iload_2         
		//   46   85:invokeinterface #284 <Method Object List.get(int)>
		//   47   90:checkcast       #216 <Class GoogleApiManager$zab>
		//   48   93:astore_1        
					GoogleApiManager.zaa(zail).removeMessages(15, ((Object) (zab1)));
		//   49   94:aload_0         
		//   50   95:getfield        #50  <Field GoogleApiManager zail>
		//   51   98:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   52  101:bipush          15
		//   53  103:aload_1         
		//   54  104:invokevirtual   #214 <Method void Handler.removeMessages(int, Object)>
					GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 15, ((Object) (zab1))), GoogleApiManager.zac(zail));
		//   55  107:aload_0         
		//   56  108:getfield        #50  <Field GoogleApiManager zail>
		//   57  111:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   58  114:aload_0         
		//   59  115:getfield        #50  <Field GoogleApiManager zail>
		//   60  118:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   61  121:bipush          15
		//   62  123:aload_1         
		//   63  124:invokestatic    #290 <Method Message Message.obtain(Handler, int, Object)>
		//   64  127:aload_0         
		//   65  128:getfield        #50  <Field GoogleApiManager zail>
		//   66  131:invokestatic    #293 <Method long GoogleApiManager.zac(GoogleApiManager)>
		//   67  134:invokevirtual   #297 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   68  137:pop             
				} else
		//*  69  138:goto            261
				{
					zaiv.add(((Object) (zab1)));
		//   70  141:aload_0         
		//   71  142:getfield        #73  <Field List zaiv>
		//   72  145:aload_1         
		//   73  146:invokeinterface #298 <Method boolean List.add(Object)>
		//   74  151:pop             
					GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 15, ((Object) (zab1))), GoogleApiManager.zac(zail));
		//   75  152:aload_0         
		//   76  153:getfield        #50  <Field GoogleApiManager zail>
		//   77  156:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   78  159:aload_0         
		//   79  160:getfield        #50  <Field GoogleApiManager zail>
		//   80  163:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   81  166:bipush          15
		//   82  168:aload_1         
		//   83  169:invokestatic    #290 <Method Message Message.obtain(Handler, int, Object)>
		//   84  172:aload_0         
		//   85  173:getfield        #50  <Field GoogleApiManager zail>
		//   86  176:invokestatic    #293 <Method long GoogleApiManager.zac(GoogleApiManager)>
		//   87  179:invokevirtual   #297 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   88  182:pop             
					GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 16, ((Object) (zab1))), com.google.android.gms.common.api.internal.GoogleApiManager.zad(zail));
		//   89  183:aload_0         
		//   90  184:getfield        #50  <Field GoogleApiManager zail>
		//   91  187:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   92  190:aload_0         
		//   93  191:getfield        #50  <Field GoogleApiManager zail>
		//   94  194:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   95  197:bipush          16
		//   96  199:aload_1         
		//   97  200:invokestatic    #290 <Method Message Message.obtain(Handler, int, Object)>
		//   98  203:aload_0         
		//   99  204:getfield        #50  <Field GoogleApiManager zail>
		//  100  207:invokestatic    #300 <Method long com.google.android.gms.common.api.internal.GoogleApiManager.zad(GoogleApiManager)>
		//  101  210:invokevirtual   #297 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//  102  213:pop             
					zab1 = ((com.google.android.gms.common.api.internal.zab) (new ConnectionResult(2, ((PendingIntent) (null)))));
		//  103  214:new             #302 <Class ConnectionResult>
		//  104  217:dup             
		//  105  218:iconst_2        
		//  106  219:aconst_null     
		//  107  220:invokespecial   #305 <Method void ConnectionResult(int, PendingIntent)>
		//  108  223:astore_1        
					if(!zah(((ConnectionResult) (zab1))))
		//* 109  224:aload_0         
		//* 110  225:aload_1         
		//* 111  226:invokespecial   #309 <Method boolean zah(ConnectionResult)>
		//* 112  229:ifne            261
						zail.zac(((ConnectionResult) (zab1)), zais);
		//  113  232:aload_0         
		//  114  233:getfield        #50  <Field GoogleApiManager zail>
		//  115  236:aload_1         
		//  116  237:aload_0         
		//  117  238:getfield        #116 <Field int zais>
		//  118  241:invokevirtual   #312 <Method boolean GoogleApiManager.zac(ConnectionResult, int)>
		//  119  244:pop             
				}
			} else
		//* 120  245:goto            261
			{
				((com.google.android.gms.common.api.internal.zab) (zac1)).zaa(((RuntimeException) (new UnsupportedApiCallException(feature))));
		//  121  248:aload_3         
		//  122  249:new             #261 <Class UnsupportedApiCallException>
		//  123  252:dup             
		//  124  253:aload           4
		//  125  255:invokespecial   #264 <Method void UnsupportedApiCallException(Feature)>
		//  126  258:invokevirtual   #267 <Method void zab.zaa(RuntimeException)>
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
		//    1    1:invokevirtual   #320 <Method void zabl()>
			zai(ConnectionResult.RESULT_SUCCESS);
		//    2    4:aload_0         
		//    3    5:getstatic       #323 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
		//    4    8:invokespecial   #327 <Method void zai(ConnectionResult)>
			zabn();
		//    5   11:aload_0         
		//    6   12:invokespecial   #330 <Method void zabn()>
			iterator = zair.values().iterator();
		//    7   15:aload_0         
		//    8   16:getfield        #68  <Field Map zair>
		//    9   19:invokeinterface #334 <Method Collection Map.values()>
		//   10   24:invokeinterface #337 <Method Iterator Collection.iterator()>
		//   11   29:astore_1        
_L2:
			zabw zabw1;
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
		//   12   30:aload_1         
		//   13   31:invokeinterface #235 <Method boolean Iterator.hasNext()>
		//   14   36:ifeq            116
			zabw1 = (zabw)iterator.next();
		//   15   39:aload_1         
		//   16   40:invokeinterface #239 <Method Object Iterator.next()>
		//   17   45:checkcast       #339 <Class zabw>
		//   18   48:astore_2        
			if(zaa(zabw1.zajw.getRequiredFeatures()) != null)
		//*  19   49:aload_0         
		//*  20   50:aload_2         
		//*  21   51:getfield        #343 <Field RegisterListenerMethod zabw.zajw>
		//*  22   54:invokevirtual   #348 <Method Feature[] RegisterListenerMethod.getRequiredFeatures()>
		//*  23   57:invokespecial   #273 <Method Feature zaa(Feature[])>
		//*  24   60:ifnull          72
			{
				iterator.remove();
		//   25   63:aload_1         
		//   26   64:invokeinterface #350 <Method void Iterator.remove()>
				continue; /* Loop/switch isn't completed */
		//   27   69:goto            30
			}
			zabw1.zajw.registerListener(zaio, new TaskCompletionSource());
		//   28   72:aload_2         
		//   29   73:getfield        #343 <Field RegisterListenerMethod zabw.zajw>
		//   30   76:aload_0         
		//   31   77:getfield        #99  <Field com.google.android.gms.common.api.Api$AnyClient zaio>
		//   32   80:new             #352 <Class TaskCompletionSource>
		//   33   83:dup             
		//   34   84:invokespecial   #353 <Method void TaskCompletionSource()>
		//   35   87:invokevirtual   #357 <Method void RegisterListenerMethod.registerListener(com.google.android.gms.common.api.Api$AnyClient, TaskCompletionSource)>
			continue; /* Loop/switch isn't completed */
		//   36   90:goto            30
_L5:
			iterator.remove();
		//   37   93:aload_1         
		//   38   94:invokeinterface #350 <Method void Iterator.remove()>
			if(true) goto _L2; else goto _L1
		//   39   99:goto            30
_L4:
			onConnectionSuspended(1);
		//   40  102:aload_0         
		//   41  103:iconst_1        
		//   42  104:invokevirtual   #360 <Method void onConnectionSuspended(int)>
			zain.disconnect();
		//   43  107:aload_0         
		//   44  108:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   45  111:invokeinterface #363 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
_L1:
			zabi();
		//   46  116:aload_0         
		//   47  117:invokespecial   #200 <Method void zabi()>
			zabo();
		//   48  120:aload_0         
		//   49  121:invokespecial   #366 <Method void zabo()>
			return;
		//   50  124:return          
			DeadObjectException deadobjectexception;
			deadobjectexception;
		//   51  125:astore_1        
			if(true) goto _L4; else goto _L3
		//   52  126:goto            102
_L3:
			RemoteException remoteexception;
			remoteexception;
		//   53  129:astore_2        
			  goto _L5
		//*  54  130:goto            93
		}

		private final void zabh()
		{
			zabl();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #320 <Method void zabl()>
			zaiu = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #191 <Field boolean zaiu>
			zaip.zaai();
		//    5    9:aload_0         
		//    6   10:getfield        #110 <Field zaab zaip>
		//    7   13:invokevirtual   #370 <Method void zaab.zaai()>
			GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 9, ((Object) (zafp))), GoogleApiManager.zac(zail));
		//    8   16:aload_0         
		//    9   17:getfield        #50  <Field GoogleApiManager zail>
		//   10   20:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   11   23:aload_0         
		//   12   24:getfield        #50  <Field GoogleApiManager zail>
		//   13   27:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   14   30:bipush          9
		//   15   32:aload_0         
		//   16   33:getfield        #105 <Field zai zafp>
		//   17   36:invokestatic    #290 <Method Message Message.obtain(Handler, int, Object)>
		//   18   39:aload_0         
		//   19   40:getfield        #50  <Field GoogleApiManager zail>
		//   20   43:invokestatic    #293 <Method long GoogleApiManager.zac(GoogleApiManager)>
		//   21   46:invokevirtual   #297 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   22   49:pop             
			GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 11, ((Object) (zafp))), com.google.android.gms.common.api.internal.GoogleApiManager.zad(zail));
		//   23   50:aload_0         
		//   24   51:getfield        #50  <Field GoogleApiManager zail>
		//   25   54:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   26   57:aload_0         
		//   27   58:getfield        #50  <Field GoogleApiManager zail>
		//   28   61:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   29   64:bipush          11
		//   30   66:aload_0         
		//   31   67:getfield        #105 <Field zai zafp>
		//   32   70:invokestatic    #290 <Method Message Message.obtain(Handler, int, Object)>
		//   33   73:aload_0         
		//   34   74:getfield        #50  <Field GoogleApiManager zail>
		//   35   77:invokestatic    #300 <Method long com.google.android.gms.common.api.internal.GoogleApiManager.zad(GoogleApiManager)>
		//   36   80:invokevirtual   #297 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   37   83:pop             
			GoogleApiManager.zae(zail).flush();
		//   38   84:aload_0         
		//   39   85:getfield        #50  <Field GoogleApiManager zail>
		//   40   88:invokestatic    #374 <Method GoogleApiAvailabilityCache GoogleApiManager.zae(GoogleApiManager)>
		//   41   91:invokevirtual   #379 <Method void GoogleApiAvailabilityCache.flush()>
		//   42   94:return          
		}

		private final void zabi()
		{
			ArrayList arraylist = (ArrayList)new ArrayList(((Collection) (zaim)));
		//    0    0:new             #70  <Class ArrayList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #58  <Field Queue zaim>
		//    4    8:invokespecial   #382 <Method void ArrayList(Collection)>
		//    5   11:checkcast       #70  <Class ArrayList>
		//    6   14:astore          4
			int k = arraylist.size();
		//    7   16:aload           4
		//    8   18:invokevirtual   #255 <Method int ArrayList.size()>
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
		//   17   32:invokevirtual   #258 <Method Object ArrayList.get(int)>
		//   18   35:astore          5
				int j = i + 1;
		//   19   37:iload_1         
		//   20   38:iconst_1        
		//   21   39:iadd            
		//   22   40:istore_2        
				obj = ((Object) ((com.google.android.gms.common.api.internal.zab)obj));
		//   23   41:aload           5
		//   24   43:checkcast       #241 <Class zab>
		//   25   46:astore          5
				if(!zain.isConnected())
					break;
		//   26   48:aload_0         
		//   27   49:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   28   52:invokeinterface #194 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//   29   57:ifeq            88
				i = j;
		//   30   60:iload_2         
		//   31   61:istore_1        
				if(zab(((com.google.android.gms.common.api.internal.zab) (obj))))
		//*  32   62:aload_0         
		//*  33   63:aload           5
		//*  34   65:invokespecial   #384 <Method boolean zab(zab)>
		//*  35   68:ifeq            24
				{
					zaim.remove(obj);
		//   36   71:aload_0         
		//   37   72:getfield        #58  <Field Queue zaim>
		//   38   75:aload           5
		//   39   77:invokeinterface #259 <Method boolean Queue.remove(Object)>
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
		//*   1    1:getfield        #191 <Field boolean zaiu>
		//*   2    4:ifeq            44
			{
				GoogleApiManager.zaa(zail).removeMessages(11, ((Object) (zafp)));
		//    3    7:aload_0         
		//    4    8:getfield        #50  <Field GoogleApiManager zail>
		//    5   11:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    6   14:bipush          11
		//    7   16:aload_0         
		//    8   17:getfield        #105 <Field zai zafp>
		//    9   20:invokevirtual   #214 <Method void Handler.removeMessages(int, Object)>
				GoogleApiManager.zaa(zail).removeMessages(9, ((Object) (zafp)));
		//   10   23:aload_0         
		//   11   24:getfield        #50  <Field GoogleApiManager zail>
		//   12   27:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   13   30:bipush          9
		//   14   32:aload_0         
		//   15   33:getfield        #105 <Field zai zafp>
		//   16   36:invokevirtual   #214 <Method void Handler.removeMessages(int, Object)>
				zaiu = false;
		//   17   39:aload_0         
		//   18   40:iconst_0        
		//   19   41:putfield        #191 <Field boolean zaiu>
			}
		//   20   44:return          
		}

		private final void zabo()
		{
			GoogleApiManager.zaa(zail).removeMessages(12, ((Object) (zafp)));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:bipush          12
		//    4    9:aload_0         
		//    5   10:getfield        #105 <Field zai zafp>
		//    6   13:invokevirtual   #214 <Method void Handler.removeMessages(int, Object)>
			GoogleApiManager.zaa(zail).sendMessageDelayed(GoogleApiManager.zaa(zail).obtainMessage(12, ((Object) (zafp))), GoogleApiManager.zai(zail));
		//    7   16:aload_0         
		//    8   17:getfield        #50  <Field GoogleApiManager zail>
		//    9   20:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   10   23:aload_0         
		//   11   24:getfield        #50  <Field GoogleApiManager zail>
		//   12   27:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   13   30:bipush          12
		//   14   32:aload_0         
		//   15   33:getfield        #105 <Field zai zafp>
		//   16   36:invokevirtual   #388 <Method Message Handler.obtainMessage(int, Object)>
		//   17   39:aload_0         
		//   18   40:getfield        #50  <Field GoogleApiManager zail>
		//   19   43:invokestatic    #390 <Method long GoogleApiManager.zai(GoogleApiManager)>
		//   20   46:invokevirtual   #297 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   21   49:pop             
		//   22   50:return          
		}

		private final void zac(com.google.android.gms.common.api.internal.zab zab1)
		{
			zab1.zaa(zaip, requiresSignIn());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #110 <Field zaab zaip>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #391 <Method boolean requiresSignIn()>
		//    5    9:invokevirtual   #394 <Method void zab.zaa(zaab, boolean)>
			try
			{
				zab1.zaa(this);
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:invokevirtual   #397 <Method void zab.zaa(GoogleApiManager$zaa)>
				return;
		//    9   17:return          
			}
		//*  10   18:aload_0         
		//*  11   19:iconst_1        
		//*  12   20:invokevirtual   #360 <Method void onConnectionSuspended(int)>
		//*  13   23:aload_0         
		//*  14   24:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  15   27:invokeinterface #363 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
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
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			if(zain.isConnected() && zair.size() == 0)
		//*   4   10:aload_0         
		//*   5   11:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//*   6   14:invokeinterface #194 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*   7   19:ifeq            65
		//*   8   22:aload_0         
		//*   9   23:getfield        #68  <Field Map zair>
		//*  10   26:invokeinterface #404 <Method int Map.size()>
		//*  11   31:ifne            65
			{
				if(zaip.zaag())
		//*  12   34:aload_0         
		//*  13   35:getfield        #110 <Field zaab zaip>
		//*  14   38:invokevirtual   #407 <Method boolean zaab.zaag()>
		//*  15   41:ifeq            54
				{
					if(flag)
		//*  16   44:iload_1         
		//*  17   45:ifeq            52
						zabo();
		//   18   48:aload_0         
		//   19   49:invokespecial   #366 <Method void zabo()>
					return false;
		//   20   52:iconst_0        
		//   21   53:ireturn         
				} else
				{
					zain.disconnect();
		//   22   54:aload_0         
		//   23   55:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   24   58:invokeinterface #363 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
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
		//    1    1:invokespecial   #409 <Method void zabg()>
		//    2    4:return          
		}

		static void zaf(zaa zaa1)
		{
			zaa1.zabh();
		//    0    0:aload_0         
		//    1    1:invokespecial   #412 <Method void zabh()>
		//    2    4:return          
		}

		static com.google.android.gms.common.api.Api.Client zag(zaa zaa1)
		{
			return zaa1.zain;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//    2    4:areturn         
		}

		private final boolean zah(ConnectionResult connectionresult)
		{
			Object obj = GoogleApiManager.zabe();
		//    0    0:invokestatic    #418 <Method Object GoogleApiManager.zabe()>
		//    1    3:astore_2        
			obj;
		//    2    4:aload_2         
			JVM INSTR monitorenter ;
		//    3    5:monitorenter    
			if(GoogleApiManager.zaf(zail) == null || !GoogleApiManager.zag(zail).contains(((Object) (zafp))))
				break MISSING_BLOCK_LABEL_54;
		//    4    6:aload_0         
		//    5    7:getfield        #50  <Field GoogleApiManager zail>
		//    6   10:invokestatic    #421 <Method zaae GoogleApiManager.zaf(GoogleApiManager)>
		//    7   13:ifnull          54
		//    8   16:aload_0         
		//    9   17:getfield        #50  <Field GoogleApiManager zail>
		//   10   20:invokestatic    #424 <Method Set GoogleApiManager.zag(GoogleApiManager)>
		//   11   23:aload_0         
		//   12   24:getfield        #105 <Field zai zafp>
		//   13   27:invokeinterface #427 <Method boolean Set.contains(Object)>
		//   14   32:ifeq            54
			((com.google.android.gms.common.api.internal.zal) (GoogleApiManager.zaf(zail))).zab(connectionresult, zais);
		//   15   35:aload_0         
		//   16   36:getfield        #50  <Field GoogleApiManager zail>
		//   17   39:invokestatic    #421 <Method zaae GoogleApiManager.zaf(GoogleApiManager)>
		//   18   42:aload_1         
		//   19   43:aload_0         
		//   20   44:getfield        #116 <Field int zais>
		//   21   47:invokevirtual   #432 <Method void zal.zab(ConnectionResult, int)>
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
		//*   1    1:getfield        #63  <Field Set zaiq>
		//*   2    4:invokeinterface #433 <Method Iterator Set.iterator()>
		//*   3    9:astore_3        
		//*   4   10:aload_3         
		//*   5   11:invokeinterface #235 <Method boolean Iterator.hasNext()>
		//*   6   16:ifeq            66
			{
				zak1 = (zak)iterator.next();
		//    7   19:aload_3         
		//    8   20:invokeinterface #239 <Method Object Iterator.next()>
		//    9   25:checkcast       #435 <Class zak>
		//   10   28:astore          4
				s = null;
		//   11   30:aconst_null     
		//   12   31:astore_2        
				if(Objects.equal(((Object) (connectionresult)), ((Object) (ConnectionResult.RESULT_SUCCESS))))
		//*  13   32:aload_1         
		//*  14   33:getstatic       #323 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
		//*  15   36:invokestatic    #441 <Method boolean Objects.equal(Object, Object)>
		//*  16   39:ifeq            52
					s = zain.getEndpointPackageName();
		//   17   42:aload_0         
		//   18   43:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   19   46:invokeinterface #444 <Method String com.google.android.gms.common.api.Api$Client.getEndpointPackageName()>
		//   20   51:astore_2        
			}

		//   21   52:aload           4
		//   22   54:aload_0         
		//   23   55:getfield        #105 <Field zai zafp>
		//   24   58:aload_1         
		//   25   59:aload_2         
		//   26   60:invokevirtual   #447 <Method void zak.zaa(zai, ConnectionResult, String)>
		//*  27   63:goto            10
			zaiq.clear();
		//   28   66:aload_0         
		//   29   67:getfield        #63  <Field Set zaiq>
		//   30   70:invokeinterface #450 <Method void Set.clear()>
		//   31   75:return          
		}

		public final void connect()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			if(!zain.isConnected())
		//*   4   10:aload_0         
		//*   5   11:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//*   6   14:invokeinterface #194 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*   7   19:ifne            126
			{
				if(zain.isConnecting())
		//*   8   22:aload_0         
		//*   9   23:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  10   26:invokeinterface #453 <Method boolean com.google.android.gms.common.api.Api$Client.isConnecting()>
		//*  11   31:ifeq            35
					return;
		//   12   34:return          
				int i = GoogleApiManager.zae(zail).getClientAvailability(GoogleApiManager.zab(zail), zain);
		//   13   35:aload_0         
		//   14   36:getfield        #50  <Field GoogleApiManager zail>
		//   15   39:invokestatic    #374 <Method GoogleApiAvailabilityCache GoogleApiManager.zae(GoogleApiManager)>
		//   16   42:aload_0         
		//   17   43:getfield        #50  <Field GoogleApiManager zail>
		//   18   46:invokestatic    #126 <Method Context GoogleApiManager.zab(GoogleApiManager)>
		//   19   49:aload_0         
		//   20   50:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   21   53:invokevirtual   #457 <Method int GoogleApiAvailabilityCache.getClientAvailability(Context, com.google.android.gms.common.api.Api$Client)>
		//   22   56:istore_1        
				if(i != 0)
		//*  23   57:iload_1         
		//*  24   58:ifeq            75
				{
					onConnectionFailed(new ConnectionResult(i, ((PendingIntent) (null))));
		//   25   61:aload_0         
		//   26   62:new             #302 <Class ConnectionResult>
		//   27   65:dup             
		//   28   66:iload_1         
		//   29   67:aconst_null     
		//   30   68:invokespecial   #305 <Method void ConnectionResult(int, PendingIntent)>
		//   31   71:invokevirtual   #460 <Method void onConnectionFailed(ConnectionResult)>
					return;
		//   32   74:return          
				}
				zac zac1 = ((zac) (zail)). new zac(zain, zafp);
		//   33   75:new             #462 <Class GoogleApiManager$zac>
		//   34   78:dup             
		//   35   79:aload_0         
		//   36   80:getfield        #50  <Field GoogleApiManager zail>
		//   37   83:aload_0         
		//   38   84:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   39   87:aload_0         
		//   40   88:getfield        #105 <Field zai zafp>
		//   41   91:invokespecial   #465 <Method void GoogleApiManager$zac(GoogleApiManager, com.google.android.gms.common.api.Api$Client, zai)>
		//   42   94:astore_2        
				if(zain.requiresSignIn())
		//*  43   95:aload_0         
		//*  44   96:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  45   99:invokeinterface #122 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
		//*  46  104:ifeq            115
					zait.zaa(((zach) (zac1)));
		//   47  107:aload_0         
		//   48  108:getfield        #131 <Field zace zait>
		//   49  111:aload_2         
		//   50  112:invokevirtual   #470 <Method void zace.zaa(zach)>
				zain.connect(((com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) (zac1)));
		//   51  115:aload_0         
		//   52  116:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   53  119:aload_2         
		//   54  120:invokeinterface #473 <Method void com.google.android.gms.common.api.Api$Client.connect(com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks)>
				return;
		//   55  125:return          
			} else
			{
				return;
		//   56  126:return          
			}
		}

		public final int getInstanceId()
		{
			return zais;
		//    0    0:aload_0         
		//    1    1:getfield        #116 <Field int zais>
		//    2    4:ireturn         
		}

		final boolean isConnected()
		{
			return zain.isConnected();
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//    2    4:invokeinterface #194 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//    3    9:ireturn         
		}

		public final void onConnected(Bundle bundle)
		{
			if(Looper.myLooper() == GoogleApiManager.zaa(zail).getLooper())
		//*   0    0:invokestatic    #480 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #50  <Field GoogleApiManager zail>
		//*   3    7:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//*   4   10:invokevirtual   #84  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       21
			{
				zabg();
		//    6   16:aload_0         
		//    7   17:invokespecial   #409 <Method void zabg()>
				return;
		//    8   20:return          
			} else
			{
				GoogleApiManager.zaa(zail).post(((Runnable) (new zabj(this))));
		//    9   21:aload_0         
		//   10   22:getfield        #50  <Field GoogleApiManager zail>
		//   11   25:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   12   28:new             #482 <Class zabj>
		//   13   31:dup             
		//   14   32:aload_0         
		//   15   33:invokespecial   #484 <Method void zabj(GoogleApiManager$zaa)>
		//   16   36:invokevirtual   #488 <Method boolean Handler.post(Runnable)>
		//   17   39:pop             
				return;
		//   18   40:return          
			}
		}

		public final void onConnectionFailed(ConnectionResult connectionresult)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			zace zace1 = zait;
		//    4   10:aload_0         
		//    5   11:getfield        #131 <Field zace zait>
		//    6   14:astore_2        
			if(zace1 != null)
		//*   7   15:aload_2         
		//*   8   16:ifnull          23
				zace1.zabs();
		//    9   19:aload_2         
		//   10   20:invokevirtual   #491 <Method void zace.zabs()>
			zabl();
		//   11   23:aload_0         
		//   12   24:invokevirtual   #320 <Method void zabl()>
			GoogleApiManager.zae(zail).flush();
		//   13   27:aload_0         
		//   14   28:getfield        #50  <Field GoogleApiManager zail>
		//   15   31:invokestatic    #374 <Method GoogleApiAvailabilityCache GoogleApiManager.zae(GoogleApiManager)>
		//   16   34:invokevirtual   #379 <Method void GoogleApiAvailabilityCache.flush()>
			zai(connectionresult);
		//   17   37:aload_0         
		//   18   38:aload_1         
		//   19   39:invokespecial   #327 <Method void zai(ConnectionResult)>
			if(connectionresult.getErrorCode() == 4)
		//*  20   42:aload_1         
		//*  21   43:invokevirtual   #494 <Method int ConnectionResult.getErrorCode()>
		//*  22   46:iconst_4        
		//*  23   47:icmpne          58
			{
				zac(GoogleApiManager.zabf());
		//   24   50:aload_0         
		//   25   51:invokestatic    #498 <Method Status GoogleApiManager.zabf()>
		//   26   54:invokevirtual   #501 <Method void zac(Status)>
				return;
		//   27   57:return          
			}
			if(zaim.isEmpty())
		//*  28   58:aload_0         
		//*  29   59:getfield        #58  <Field Queue zaim>
		//*  30   62:invokeinterface #504 <Method boolean Queue.isEmpty()>
		//*  31   67:ifeq            76
			{
				zaiw = connectionresult;
		//   32   70:aload_0         
		//   33   71:aload_1         
		//   34   72:putfield        #75  <Field ConnectionResult zaiw>
				return;
		//   35   75:return          
			}
			if(zah(connectionresult))
		//*  36   76:aload_0         
		//*  37   77:aload_1         
		//*  38   78:invokespecial   #309 <Method boolean zah(ConnectionResult)>
		//*  39   81:ifeq            85
				return;
		//   40   84:return          
			if(!zail.zac(connectionresult, zais))
		//*  41   85:aload_0         
		//*  42   86:getfield        #50  <Field GoogleApiManager zail>
		//*  43   89:aload_1         
		//*  44   90:aload_0         
		//*  45   91:getfield        #116 <Field int zais>
		//*  46   94:invokevirtual   #312 <Method boolean GoogleApiManager.zac(ConnectionResult, int)>
		//*  47   97:ifne            221
			{
				if(connectionresult.getErrorCode() == 18)
		//*  48  100:aload_1         
		//*  49  101:invokevirtual   #494 <Method int ConnectionResult.getErrorCode()>
		//*  50  104:bipush          18
		//*  51  106:icmpne          114
					zaiu = true;
		//   52  109:aload_0         
		//   53  110:iconst_1        
		//   54  111:putfield        #191 <Field boolean zaiu>
				if(zaiu)
		//*  55  114:aload_0         
		//*  56  115:getfield        #191 <Field boolean zaiu>
		//*  57  118:ifeq            156
				{
					GoogleApiManager.zaa(zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(zail), 9, ((Object) (zafp))), GoogleApiManager.zac(zail));
		//   58  121:aload_0         
		//   59  122:getfield        #50  <Field GoogleApiManager zail>
		//   60  125:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   61  128:aload_0         
		//   62  129:getfield        #50  <Field GoogleApiManager zail>
		//   63  132:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   64  135:bipush          9
		//   65  137:aload_0         
		//   66  138:getfield        #105 <Field zai zafp>
		//   67  141:invokestatic    #290 <Method Message Message.obtain(Handler, int, Object)>
		//   68  144:aload_0         
		//   69  145:getfield        #50  <Field GoogleApiManager zail>
		//   70  148:invokestatic    #293 <Method long GoogleApiManager.zac(GoogleApiManager)>
		//   71  151:invokevirtual   #297 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   72  154:pop             
					return;
		//   73  155:return          
				}
				connectionresult = ((ConnectionResult) (zafp.zan()));
		//   74  156:aload_0         
		//   75  157:getfield        #105 <Field zai zafp>
		//   76  160:invokevirtual   #509 <Method String zai.zan()>
		//   77  163:astore_1        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (connectionresult))).length() + 38);
		//   78  164:new             #511 <Class StringBuilder>
		//   79  167:dup             
		//   80  168:aload_1         
		//   81  169:invokestatic    #516 <Method String String.valueOf(Object)>
		//   82  172:invokevirtual   #519 <Method int String.length()>
		//   83  175:bipush          38
		//   84  177:iadd            
		//   85  178:invokespecial   #520 <Method void StringBuilder(int)>
		//   86  181:astore_2        
				stringbuilder.append("API: ");
		//   87  182:aload_2         
		//   88  183:ldc2            #522 <String "API: ">
		//   89  186:invokevirtual   #526 <Method StringBuilder StringBuilder.append(String)>
		//   90  189:pop             
				stringbuilder.append(((String) (connectionresult)));
		//   91  190:aload_2         
		//   92  191:aload_1         
		//   93  192:invokevirtual   #526 <Method StringBuilder StringBuilder.append(String)>
		//   94  195:pop             
				stringbuilder.append(" is not available on this device.");
		//   95  196:aload_2         
		//   96  197:ldc2            #528 <String " is not available on this device.">
		//   97  200:invokevirtual   #526 <Method StringBuilder StringBuilder.append(String)>
		//   98  203:pop             
				zac(new Status(17, stringbuilder.toString()));
		//   99  204:aload_0         
		//  100  205:new             #530 <Class Status>
		//  101  208:dup             
		//  102  209:bipush          17
		//  103  211:aload_2         
		//  104  212:invokevirtual   #533 <Method String StringBuilder.toString()>
		//  105  215:invokespecial   #536 <Method void Status(int, String)>
		//  106  218:invokevirtual   #501 <Method void zac(Status)>
			}
		//  107  221:return          
		}

		public final void onConnectionSuspended(int i)
		{
			if(Looper.myLooper() == GoogleApiManager.zaa(zail).getLooper())
		//*   0    0:invokestatic    #480 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #50  <Field GoogleApiManager zail>
		//*   3    7:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//*   4   10:invokevirtual   #84  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       21
			{
				zabh();
		//    6   16:aload_0         
		//    7   17:invokespecial   #412 <Method void zabh()>
				return;
		//    8   20:return          
			} else
			{
				GoogleApiManager.zaa(zail).post(((Runnable) (new zabk(this))));
		//    9   21:aload_0         
		//   10   22:getfield        #50  <Field GoogleApiManager zail>
		//   11   25:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   12   28:new             #538 <Class zabk>
		//   13   31:dup             
		//   14   32:aload_0         
		//   15   33:invokespecial   #539 <Method void zabk(GoogleApiManager$zaa)>
		//   16   36:invokevirtual   #488 <Method boolean Handler.post(Runnable)>
		//   17   39:pop             
				return;
		//   18   40:return          
			}
		}

		public final boolean requiresSignIn()
		{
			return zain.requiresSignIn();
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//    2    4:invokeinterface #122 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
		//    3    9:ireturn         
		}

		public final void resume()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			if(zaiu)
		//*   4   10:aload_0         
		//*   5   11:getfield        #191 <Field boolean zaiu>
		//*   6   14:ifeq            21
				connect();
		//    7   17:aload_0         
		//    8   18:invokevirtual   #197 <Method void connect()>
		//    9   21:return          
		}

		public final void zaa(ConnectionResult connectionresult, Api api, boolean flag)
		{
			if(Looper.myLooper() == GoogleApiManager.zaa(zail).getLooper())
		//*   0    0:invokestatic    #480 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #50  <Field GoogleApiManager zail>
		//*   3    7:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//*   4   10:invokevirtual   #84  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       22
			{
				onConnectionFailed(connectionresult);
		//    6   16:aload_0         
		//    7   17:aload_1         
		//    8   18:invokevirtual   #460 <Method void onConnectionFailed(ConnectionResult)>
				return;
		//    9   21:return          
			} else
			{
				GoogleApiManager.zaa(zail).post(((Runnable) (new zabl(this, connectionresult))));
		//   10   22:aload_0         
		//   11   23:getfield        #50  <Field GoogleApiManager zail>
		//   12   26:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   13   29:new             #543 <Class zabl>
		//   14   32:dup             
		//   15   33:aload_0         
		//   16   34:aload_1         
		//   17   35:invokespecial   #546 <Method void zabl(GoogleApiManager$zaa, ConnectionResult)>
		//   18   38:invokevirtual   #488 <Method boolean Handler.post(Runnable)>
		//   19   41:pop             
				return;
		//   20   42:return          
			}
		}

		public final void zaa(com.google.android.gms.common.api.internal.zab zab1)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			if(zain.isConnected())
		//*   4   10:aload_0         
		//*   5   11:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//*   6   14:invokeinterface #194 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*   7   19:ifeq            47
				if(zab(zab1))
		//*   8   22:aload_0         
		//*   9   23:aload_1         
		//*  10   24:invokespecial   #384 <Method boolean zab(zab)>
		//*  11   27:ifeq            35
				{
					zabo();
		//   12   30:aload_0         
		//   13   31:invokespecial   #366 <Method void zabo()>
					return;
		//   14   34:return          
				} else
				{
					zaim.add(((Object) (zab1)));
		//   15   35:aload_0         
		//   16   36:getfield        #58  <Field Queue zaim>
		//   17   39:aload_1         
		//   18   40:invokeinterface #548 <Method boolean Queue.add(Object)>
		//   19   45:pop             
					return;
		//   20   46:return          
				}
			zaim.add(((Object) (zab1)));
		//   21   47:aload_0         
		//   22   48:getfield        #58  <Field Queue zaim>
		//   23   51:aload_1         
		//   24   52:invokeinterface #548 <Method boolean Queue.add(Object)>
		//   25   57:pop             
			zab1 = ((com.google.android.gms.common.api.internal.zab) (zaiw));
		//   26   58:aload_0         
		//   27   59:getfield        #75  <Field ConnectionResult zaiw>
		//   28   62:astore_1        
			if(zab1 != null && ((ConnectionResult) (zab1)).hasResolution())
		//*  29   63:aload_1         
		//*  30   64:ifnull          83
		//*  31   67:aload_1         
		//*  32   68:invokevirtual   #551 <Method boolean ConnectionResult.hasResolution()>
		//*  33   71:ifeq            83
			{
				onConnectionFailed(zaiw);
		//   34   74:aload_0         
		//   35   75:aload_0         
		//   36   76:getfield        #75  <Field ConnectionResult zaiw>
		//   37   79:invokevirtual   #460 <Method void onConnectionFailed(ConnectionResult)>
				return;
		//   38   82:return          
			} else
			{
				connect();
		//   39   83:aload_0         
		//   40   84:invokevirtual   #197 <Method void connect()>
				return;
		//   41   87:return          
			}
		}

		public final void zaa(zak zak1)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			zaiq.add(((Object) (zak1)));
		//    4   10:aload_0         
		//    5   11:getfield        #63  <Field Set zaiq>
		//    6   14:aload_1         
		//    7   15:invokeinterface #553 <Method boolean Set.add(Object)>
		//    8   20:pop             
		//    9   21:return          
		}

		public final com.google.android.gms.common.api.Api.Client zaab()
		{
			return zain;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//    2    4:areturn         
		}

		public final void zaav()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			if(zaiu)
		//*   4   10:aload_0         
		//*   5   11:getfield        #191 <Field boolean zaiu>
		//*   6   14:ifeq            86
			{
				zabn();
		//    7   17:aload_0         
		//    8   18:invokespecial   #330 <Method void zabn()>
				Status status;
				if(GoogleApiManager.zah(zail).isGooglePlayServicesAvailable(GoogleApiManager.zab(zail)) == 18)
		//*   9   21:aload_0         
		//*  10   22:getfield        #50  <Field GoogleApiManager zail>
		//*  11   25:invokestatic    #559 <Method GoogleApiAvailability GoogleApiManager.zah(GoogleApiManager)>
		//*  12   28:aload_0         
		//*  13   29:getfield        #50  <Field GoogleApiManager zail>
		//*  14   32:invokestatic    #126 <Method Context GoogleApiManager.zab(GoogleApiManager)>
		//*  15   35:invokevirtual   #565 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
		//*  16   38:bipush          18
		//*  17   40:icmpne          59
					status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
		//   18   43:new             #530 <Class Status>
		//   19   46:dup             
		//   20   47:bipush          8
		//   21   49:ldc2            #567 <String "Connection timed out while waiting for Google Play services update to complete.">
		//   22   52:invokespecial   #536 <Method void Status(int, String)>
		//   23   55:astore_1        
				else
		//*  24   56:goto            72
					status = new Status(8, "API failed to connect while resuming due to an unknown error.");
		//   25   59:new             #530 <Class Status>
		//   26   62:dup             
		//   27   63:bipush          8
		//   28   65:ldc2            #569 <String "API failed to connect while resuming due to an unknown error.">
		//   29   68:invokespecial   #536 <Method void Status(int, String)>
		//   30   71:astore_1        
				zac(status);
		//   31   72:aload_0         
		//   32   73:aload_1         
		//   33   74:invokevirtual   #501 <Method void zac(Status)>
				zain.disconnect();
		//   34   77:aload_0         
		//   35   78:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   36   81:invokeinterface #363 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
			}
		//   37   86:return          
		}

		public final void zabj()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			zac(GoogleApiManager.zahw);
		//    4   10:aload_0         
		//    5   11:getstatic       #574 <Field Status GoogleApiManager.zahw>
		//    6   14:invokevirtual   #501 <Method void zac(Status)>
			zaip.zaah();
		//    7   17:aload_0         
		//    8   18:getfield        #110 <Field zaab zaip>
		//    9   21:invokevirtual   #577 <Method void zaab.zaah()>
			ListenerHolder.ListenerKey alistenerkey[] = (ListenerHolder.ListenerKey[])zair.keySet().toArray(((Object []) (new ListenerHolder.ListenerKey[zair.size()])));
		//   10   24:aload_0         
		//   11   25:getfield        #68  <Field Map zair>
		//   12   28:invokeinterface #581 <Method Set Map.keySet()>
		//   13   33:aload_0         
		//   14   34:getfield        #68  <Field Map zair>
		//   15   37:invokeinterface #404 <Method int Map.size()>
		//   16   42:anewarray       ListenerHolder.ListenerKey[]
		//   17   45:invokeinterface #587 <Method Object[] Set.toArray(Object[])>
		//   18   50:checkcast       #589 <Class ListenerHolder$ListenerKey[]>
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
		//   29   65:new             #591 <Class zah>
		//   30   68:dup             
		//   31   69:aload_3         
		//   32   70:iload_1         
		//   33   71:aaload          
		//   34   72:new             #352 <Class TaskCompletionSource>
		//   35   75:dup             
		//   36   76:invokespecial   #353 <Method void TaskCompletionSource()>
		//   37   79:invokespecial   #594 <Method void zah(ListenerHolder$ListenerKey, TaskCompletionSource)>
		//   38   82:invokevirtual   #596 <Method void zaa(zab)>

		//   39   85:iload_1         
		//   40   86:iconst_1        
		//   41   87:iadd            
		//   42   88:istore_1        
		//*  43   89:goto            59
			zai(new ConnectionResult(4));
		//   44   92:aload_0         
		//   45   93:new             #302 <Class ConnectionResult>
		//   46   96:dup             
		//   47   97:iconst_4        
		//   48   98:invokespecial   #597 <Method void ConnectionResult(int)>
		//   49  101:invokespecial   #327 <Method void zai(ConnectionResult)>
			if(zain.isConnected())
		//*  50  104:aload_0         
		//*  51  105:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  52  108:invokeinterface #194 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
		//*  53  113:ifeq            133
				zain.onUserSignOut(((com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks) (new zabm(this))));
		//   54  116:aload_0         
		//   55  117:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   56  120:new             #599 <Class zabm>
		//   57  123:dup             
		//   58  124:aload_0         
		//   59  125:invokespecial   #600 <Method void zabm(GoogleApiManager$zaa)>
		//   60  128:invokeinterface #604 <Method void com.google.android.gms.common.api.Api$Client.onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks)>
		//   61  133:return          
		}

		public final Map zabk()
		{
			return zair;
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field Map zair>
		//    2    4:areturn         
		}

		public final void zabl()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			zaiw = null;
		//    4   10:aload_0         
		//    5   11:aconst_null     
		//    6   12:putfield        #75  <Field ConnectionResult zaiw>
		//    7   15:return          
		}

		public final ConnectionResult zabm()
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			return zaiw;
		//    4   10:aload_0         
		//    5   11:getfield        #75  <Field ConnectionResult zaiw>
		//    6   14:areturn         
		}

		public final boolean zabp()
		{
			return zac(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokespecial   #205 <Method boolean zac(boolean)>
		//    3    5:ireturn         
		}

		final zad zabq()
		{
			zace zace1 = zait;
		//    0    0:aload_0         
		//    1    1:getfield        #131 <Field zace zait>
		//    2    4:astore_1        
			if(zace1 == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return zace1.zabq();
		//    7   11:aload_1         
		//    8   12:invokevirtual   #614 <Method zad zace.zabq()>
		//    9   15:areturn         
		}

		public final void zac(Status status)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			for(Iterator iterator = zaim.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.internal.zab)iterator.next()).zaa(status));
		//    4   10:aload_0         
		//    5   11:getfield        #58  <Field Queue zaim>
		//    6   14:invokeinterface #230 <Method Iterator Queue.iterator()>
		//    7   19:astore_2        
		//    8   20:aload_2         
		//    9   21:invokeinterface #235 <Method boolean Iterator.hasNext()>
		//   10   26:ifeq            45
		//   11   29:aload_2         
		//   12   30:invokeinterface #239 <Method Object Iterator.next()>
		//   13   35:checkcast       #241 <Class zab>
		//   14   38:aload_1         
		//   15   39:invokevirtual   #616 <Method void zab.zaa(Status)>
		//*  16   42:goto            20
			zaim.clear();
		//   17   45:aload_0         
		//   18   46:getfield        #58  <Field Queue zaim>
		//   19   49:invokeinterface #617 <Method void Queue.clear()>
		//   20   54:return          
		}

		public final void zag(ConnectionResult connectionresult)
		{
			Preconditions.checkHandlerThread(GoogleApiManager.zaa(zail));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:invokestatic    #403 <Method void Preconditions.checkHandlerThread(Handler)>
			zain.disconnect();
		//    4   10:aload_0         
		//    5   11:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//    6   14:invokeinterface #363 <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
			onConnectionFailed(connectionresult);
		//    7   19:aload_0         
		//    8   20:aload_1         
		//    9   21:invokevirtual   #460 <Method void onConnectionFailed(ConnectionResult)>
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
		//    2    2:putfield        #50  <Field GoogleApiManager zail>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #53  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #55  <Class LinkedList>
		//    7   13:dup             
		//    8   14:invokespecial   #56  <Method void LinkedList()>
		//    9   17:putfield        #58  <Field Queue zaim>
		//   10   20:aload_0         
		//   11   21:new             #60  <Class HashSet>
		//   12   24:dup             
		//   13   25:invokespecial   #61  <Method void HashSet()>
		//   14   28:putfield        #63  <Field Set zaiq>
		//   15   31:aload_0         
		//   16   32:new             #65  <Class HashMap>
		//   17   35:dup             
		//   18   36:invokespecial   #66  <Method void HashMap()>
		//   19   39:putfield        #68  <Field Map zair>
		//   20   42:aload_0         
		//   21   43:new             #70  <Class ArrayList>
		//   22   46:dup             
		//   23   47:invokespecial   #71  <Method void ArrayList()>
		//   24   50:putfield        #73  <Field List zaiv>
			zaiw = null;
		//   25   53:aload_0         
		//   26   54:aconst_null     
		//   27   55:putfield        #75  <Field ConnectionResult zaiw>
			zain = googleapi.zaa(GoogleApiManager.zaa(GoogleApiManager.this).getLooper(), this);
		//   28   58:aload_0         
		//   29   59:aload_2         
		//   30   60:aload_1         
		//   31   61:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   32   64:invokevirtual   #84  <Method Looper Handler.getLooper()>
		//   33   67:aload_0         
		//   34   68:invokevirtual   #89  <Method com.google.android.gms.common.api.Api$Client GoogleApi.zaa(Looper, GoogleApiManager$zaa)>
		//   35   71:putfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
			com.google.android.gms.common.api.Api.Client client = zain;
		//   36   74:aload_0         
		//   37   75:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//   38   78:astore_3        
			if(client instanceof SimpleClientAdapter)
		//*  39   79:aload_3         
		//*  40   80:instanceof      #93  <Class SimpleClientAdapter>
		//*  41   83:ifeq            100
				zaio = ((com.google.android.gms.common.api.Api.AnyClient) (((SimpleClientAdapter)client).getClient()));
		//   42   86:aload_0         
		//   43   87:aload_3         
		//   44   88:checkcast       #93  <Class SimpleClientAdapter>
		//   45   91:invokevirtual   #97  <Method com.google.android.gms.common.api.Api$SimpleClient SimpleClientAdapter.getClient()>
		//   46   94:putfield        #99  <Field com.google.android.gms.common.api.Api$AnyClient zaio>
			else
		//*  47   97:goto            105
				zaio = ((com.google.android.gms.common.api.Api.AnyClient) (client));
		//   48  100:aload_0         
		//   49  101:aload_3         
		//   50  102:putfield        #99  <Field com.google.android.gms.common.api.Api$AnyClient zaio>
			zafp = googleapi.zak();
		//   51  105:aload_0         
		//   52  106:aload_2         
		//   53  107:invokevirtual   #103 <Method zai GoogleApi.zak()>
		//   54  110:putfield        #105 <Field zai zafp>
		//   55  113:aload_0         
		//   56  114:new             #107 <Class zaab>
		//   57  117:dup             
		//   58  118:invokespecial   #108 <Method void zaab()>
		//   59  121:putfield        #110 <Field zaab zaip>
			zais = googleapi.getInstanceId();
		//   60  124:aload_0         
		//   61  125:aload_2         
		//   62  126:invokevirtual   #114 <Method int GoogleApi.getInstanceId()>
		//   63  129:putfield        #116 <Field int zais>
			if(zain.requiresSignIn())
		//*  64  132:aload_0         
		//*  65  133:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
		//*  66  136:invokeinterface #122 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
		//*  67  141:ifeq            161
			{
				zait = googleapi.zaa(GoogleApiManager.zab(GoogleApiManager.this), GoogleApiManager.zaa(GoogleApiManager.this));
		//   68  144:aload_0         
		//   69  145:aload_2         
		//   70  146:aload_1         
		//   71  147:invokestatic    #126 <Method Context GoogleApiManager.zab(GoogleApiManager)>
		//   72  150:aload_1         
		//   73  151:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//   74  154:invokevirtual   #129 <Method zace GoogleApi.zaa(Context, Handler)>
		//   75  157:putfield        #131 <Field zace zait>
				return;
		//   76  160:return          
			} else
			{
				zait = null;
		//   77  161:aload_0         
		//   78  162:aconst_null     
		//   79  163:putfield        #131 <Field zace zait>
				return;
		//   80  166:return          
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
		//*   1    1:ifnull          48
		//*   2    4:aload_1         
		//*   3    5:instanceof      #2   <Class GoogleApiManager$zab>
		//*   4    8:ifeq            48
			{
				obj = ((Object) ((zab)obj));
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class GoogleApiManager$zab>
		//    7   15:astore_1        
				return Objects.equal(((Object) (zaja)), ((Object) (((zab) (obj)).zaja))) && Objects.equal(((Object) (zajb)), ((Object) (((zab) (obj)).zajb)));
		//    8   16:aload_0         
		//    9   17:getfield        #19  <Field zai zaja>
		//   10   20:aload_1         
		//   11   21:getfield        #19  <Field zai zaja>
		//   12   24:invokestatic    #39  <Method boolean Objects.equal(Object, Object)>
		//   13   27:ifeq            46
		//   14   30:aload_0         
		//   15   31:getfield        #21  <Field Feature zajb>
		//   16   34:aload_1         
		//   17   35:getfield        #21  <Field Feature zajb>
		//   18   38:invokestatic    #39  <Method boolean Objects.equal(Object, Object)>
		//   19   41:ifeq            46
		//   20   44:iconst_1        
		//   21   45:ireturn         
		//   22   46:iconst_0        
		//   23   47:ireturn         
			} else
			{
				return false;
		//   24   48:iconst_0        
		//   25   49:ireturn         
			}
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
			if(zaje)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field boolean zaje>
		//*   2    4:ifeq            30
			{
				IAccountAccessor iaccountaccessor = zajc;
		//    3    7:aload_0         
		//    4    8:getfield        #34  <Field IAccountAccessor zajc>
		//    5   11:astore_1        
				if(iaccountaccessor != null)
		//*   6   12:aload_1         
		//*   7   13:ifnull          30
					zain.getRemoteService(iaccountaccessor, zajd);
		//    8   16:aload_0         
		//    9   17:getfield        #40  <Field com.google.android.gms.common.api.Api$Client zain>
		//   10   20:aload_1         
		//   11   21:aload_0         
		//   12   22:getfield        #36  <Field Set zajd>
		//   13   25:invokeinterface #60  <Method void com.google.android.gms.common.api.Api$Client.getRemoteService(IAccountAccessor, Set)>
			}
		//   14   30:return          
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
		//    2    4:invokestatic    #68  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
		//    3    7:new             #70  <Class zabo>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #73  <Method void zabo(GoogleApiManager$zac, ConnectionResult)>
		//    8   16:invokevirtual   #79  <Method boolean Handler.post(Runnable)>
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
		//   14   26:ldc1            #82  <String "GoogleApiManager">
		//   15   28:ldc1            #84  <String "Received null response from onSignInSuccess">
		//   16   30:new             #86  <Class Exception>
		//   17   33:dup             
		//   18   34:invokespecial   #87  <Method void Exception()>
		//   19   37:invokestatic    #93  <Method int Log.wtf(String, String, Throwable)>
		//   20   40:pop             
				zag(new ConnectionResult(4));
		//   21   41:aload_0         
		//   22   42:new             #95  <Class ConnectionResult>
		//   23   45:dup             
		//   24   46:iconst_4        
		//   25   47:invokespecial   #98  <Method void ConnectionResult(int)>
		//   26   50:invokevirtual   #101 <Method void zag(ConnectionResult)>
				return;
		//   27   53:return          
			}
		}

		public final void zag(ConnectionResult connectionresult)
		{
			((zaa)GoogleApiManager.zaj(zail).get(((Object) (zafp)))).zag(connectionresult);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field GoogleApiManager zail>
		//    2    4:invokestatic    #106 <Method Map GoogleApiManager.zaj(GoogleApiManager)>
		//    3    7:aload_0         
		//    4    8:getfield        #42  <Field zai zafp>
		//    5   11:invokeinterface #112 <Method Object Map.get(Object)>
		//    6   16:checkcast       #114 <Class GoogleApiManager$zaa>
		//    7   19:aload_1         
		//    8   20:invokevirtual   #115 <Method void GoogleApiManager$zaa.zag(ConnectionResult)>
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
	//   35   70:new             #104 <Class ArraySet>
	//   36   73:dup             
	//   37   74:invokespecial   #105 <Method void ArraySet()>
	//   38   77:putfield        #107 <Field Set zaij>
	//   39   80:aload_0         
	//   40   81:new             #104 <Class ArraySet>
	//   41   84:dup             
	//   42   85:invokespecial   #105 <Method void ArraySet()>
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
		context = ((Context) (handler));
	//   63  126:aload_0         
	//   64  127:getfield        #118 <Field Handler handler>
	//   65  130:astore_1        
		((Handler) (context)).sendMessage(((Handler) (context)).obtainMessage(6));
	//   66  131:aload_1         
	//   67  132:aload_1         
	//   68  133:bipush          6
	//   69  135:invokevirtual   #133 <Method Message Handler.obtainMessage(int)>
	//   70  138:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
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
	//    1    1:invokevirtual   #187 <Method zai GoogleApi.zak()>
	//    2    4:astore          4
		zaa zaa2 = (zaa)zaih.get(((Object) (zai1)));
	//    3    6:aload_0         
	//    4    7:getfield        #100 <Field Map zaih>
	//    5   10:aload           4
	//    6   12:invokeinterface #193 <Method Object Map.get(Object)>
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
	//   17   33:invokespecial   #196 <Method void GoogleApiManager$zaa(GoogleApiManager, GoogleApi)>
	//   18   36:astore_2        
			zaih.put(((Object) (zai1)), ((Object) (zaa1)));
	//   19   37:aload_0         
	//   20   38:getfield        #100 <Field Map zaih>
	//   21   41:aload           4
	//   22   43:aload_2         
	//   23   44:invokeinterface #200 <Method Object Map.put(Object, Object)>
	//   24   49:pop             
		}
		if(zaa1.requiresSignIn())
	//*  25   50:aload_2         
	//*  26   51:invokevirtual   #204 <Method boolean GoogleApiManager$zaa.requiresSignIn()>
	//*  27   54:ifeq            69
			zaik.add(((Object) (zai1)));
	//   28   57:aload_0         
	//   29   58:getfield        #109 <Field Set zaik>
	//   30   61:aload           4
	//   31   63:invokeinterface #210 <Method boolean Set.add(Object)>
	//   32   68:pop             
		zaa1.connect();
	//   33   69:aload_2         
	//   34   70:invokevirtual   #213 <Method void GoogleApiManager$zaa.connect()>
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
	//    5    9:ldc1            #219 <String "Must guarantee manager is non-null before using getInstance">
	//    6   11:invokestatic    #224 <Method Object Preconditions.checkNotNull(Object, Object)>
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
	//    1    1:getfield        #248 <Field int Message.what>
	//    2    4:istore_2        
		l = 0x493e0L;
	//    3    5:ldc2w           #249 <Long 0x493e0L>
	//    4    8:lstore_3        
		i;
	//    5    9:iload_2         
		JVM INSTR tableswitch 1 16: default 88
	//	               1 1085
	//	               2 938
	//	               3 890
	//	               4 771
	//	               5 547
	//	               6 482
	//	               7 469
	//	               8 771
	//	               9 432
	//	               10 371
	//	               11 334
	//	               12 296
	//	               13 771
	//	               14 221
	//	               15 175
	//	               16 129;
	//    6   10:tableswitch     1 16: default 88
	//	               1 1085
	//	               2 938
	//	               3 890
	//	               4 771
	//	               5 547
	//	               6 482
	//	               7 469
	//	               8 771
	//	               9 432
	//	               10 371
	//	               11 334
	//	               12 296
	//	               13 771
	//	               14 221
	//	               15 175
	//	               16 129
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L5 _L9 _L10 _L11 _L12 _L5 _L13 _L14 _L15
_L1:
		i = message.what;
	//    7   88:aload_1         
	//    8   89:getfield        #248 <Field int Message.what>
	//    9   92:istore_2        
		message = ((Message) (new StringBuilder(31)));
	//   10   93:new             #252 <Class StringBuilder>
	//   11   96:dup             
	//   12   97:bipush          31
	//   13   99:invokespecial   #253 <Method void StringBuilder(int)>
	//   14  102:astore_1        
		((StringBuilder) (message)).append("Unknown message id: ");
	//   15  103:aload_1         
	//   16  104:ldc1            #255 <String "Unknown message id: ">
	//   17  106:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   18  109:pop             
		((StringBuilder) (message)).append(i);
	//   19  110:aload_1         
	//   20  111:iload_2         
	//   21  112:invokevirtual   #262 <Method StringBuilder StringBuilder.append(int)>
	//   22  115:pop             
		Log.w("GoogleApiManager", ((StringBuilder) (message)).toString());
	//   23  116:ldc2            #264 <String "GoogleApiManager">
	//   24  119:aload_1         
	//   25  120:invokevirtual   #268 <Method String StringBuilder.toString()>
	//   26  123:invokestatic    #274 <Method int Log.w(String, String)>
	//   27  126:pop             
		return false;
	//   28  127:iconst_0        
	//   29  128:ireturn         
_L15:
		message = ((Message) ((zab)message.obj));
	//   30  129:aload_1         
	//   31  130:getfield        #277 <Field Object Message.obj>
	//   32  133:checkcast       #11  <Class GoogleApiManager$zab>
	//   33  136:astore_1        
		if(zaih.containsKey(((Object) (zab.zac(((zab) (message)))))))
	//*  34  137:aload_0         
	//*  35  138:getfield        #100 <Field Map zaih>
	//*  36  141:aload_1         
	//*  37  142:invokestatic    #280 <Method zai GoogleApiManager$zab.zac(GoogleApiManager$zab)>
	//*  38  145:invokeinterface #283 <Method boolean Map.containsKey(Object)>
	//*  39  150:ifeq            1179
		{
			zaa.zab((zaa)zaih.get(((Object) (zab.zac(((zab) (message)))))), ((zab) (message)));
	//   40  153:aload_0         
	//   41  154:getfield        #100 <Field Map zaih>
	//   42  157:aload_1         
	//   43  158:invokestatic    #280 <Method zai GoogleApiManager$zab.zac(GoogleApiManager$zab)>
	//   44  161:invokeinterface #193 <Method Object Map.get(Object)>
	//   45  166:checkcast       #8   <Class GoogleApiManager$zaa>
	//   46  169:aload_1         
	//   47  170:invokestatic    #286 <Method void GoogleApiManager$zaa.zab(GoogleApiManager$zaa, GoogleApiManager$zab)>
			return true;
	//   48  173:iconst_1        
	//   49  174:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L14:
		message = ((Message) ((zab)message.obj));
	//   50  175:aload_1         
	//   51  176:getfield        #277 <Field Object Message.obj>
	//   52  179:checkcast       #11  <Class GoogleApiManager$zab>
	//   53  182:astore_1        
		if(zaih.containsKey(((Object) (zab.zac(((zab) (message)))))))
	//*  54  183:aload_0         
	//*  55  184:getfield        #100 <Field Map zaih>
	//*  56  187:aload_1         
	//*  57  188:invokestatic    #280 <Method zai GoogleApiManager$zab.zac(GoogleApiManager$zab)>
	//*  58  191:invokeinterface #283 <Method boolean Map.containsKey(Object)>
	//*  59  196:ifeq            1179
		{
			zaa.zaa((zaa)zaih.get(((Object) (zab.zac(((zab) (message)))))), ((zab) (message)));
	//   60  199:aload_0         
	//   61  200:getfield        #100 <Field Map zaih>
	//   62  203:aload_1         
	//   63  204:invokestatic    #280 <Method zai GoogleApiManager$zab.zac(GoogleApiManager$zab)>
	//   64  207:invokeinterface #193 <Method Object Map.get(Object)>
	//   65  212:checkcast       #8   <Class GoogleApiManager$zaa>
	//   66  215:aload_1         
	//   67  216:invokestatic    #288 <Method void GoogleApiManager$zaa.zaa(GoogleApiManager$zaa, GoogleApiManager$zab)>
			return true;
	//   68  219:iconst_1        
	//   69  220:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L13:
		message = ((Message) ((zaaf)message.obj));
	//   70  221:aload_1         
	//   71  222:getfield        #277 <Field Object Message.obj>
	//   72  225:checkcast       #290 <Class zaaf>
	//   73  228:astore_1        
		zai zai1 = ((zaaf) (message)).zak();
	//   74  229:aload_1         
	//   75  230:invokevirtual   #291 <Method zai zaaf.zak()>
	//   76  233:astore          6
		if(!zaih.containsKey(((Object) (zai1))))
	//*  77  235:aload_0         
	//*  78  236:getfield        #100 <Field Map zaih>
	//*  79  239:aload           6
	//*  80  241:invokeinterface #283 <Method boolean Map.containsKey(Object)>
	//*  81  246:ifne            262
		{
			((zaaf) (message)).zaal().setResult(((Object) (Boolean.valueOf(false))));
	//   82  249:aload_1         
	//   83  250:invokevirtual   #295 <Method TaskCompletionSource zaaf.zaal()>
	//   84  253:iconst_0        
	//   85  254:invokestatic    #301 <Method Boolean Boolean.valueOf(boolean)>
	//   86  257:invokevirtual   #307 <Method void TaskCompletionSource.setResult(Object)>
			return true;
	//   87  260:iconst_1        
	//   88  261:ireturn         
		} else
		{
			boolean flag = zaa.zaa((zaa)zaih.get(((Object) (zai1))), false);
	//   89  262:aload_0         
	//   90  263:getfield        #100 <Field Map zaih>
	//   91  266:aload           6
	//   92  268:invokeinterface #193 <Method Object Map.get(Object)>
	//   93  273:checkcast       #8   <Class GoogleApiManager$zaa>
	//   94  276:iconst_0        
	//   95  277:invokestatic    #310 <Method boolean GoogleApiManager$zaa.zaa(GoogleApiManager$zaa, boolean)>
	//   96  280:istore          5
			((zaaf) (message)).zaal().setResult(((Object) (Boolean.valueOf(flag))));
	//   97  282:aload_1         
	//   98  283:invokevirtual   #295 <Method TaskCompletionSource zaaf.zaal()>
	//   99  286:iload           5
	//  100  288:invokestatic    #301 <Method Boolean Boolean.valueOf(boolean)>
	//  101  291:invokevirtual   #307 <Method void TaskCompletionSource.setResult(Object)>
			return true;
	//  102  294:iconst_1        
	//  103  295:ireturn         
		}
_L12:
		if(zaih.containsKey(message.obj))
	//* 104  296:aload_0         
	//* 105  297:getfield        #100 <Field Map zaih>
	//* 106  300:aload_1         
	//* 107  301:getfield        #277 <Field Object Message.obj>
	//* 108  304:invokeinterface #283 <Method boolean Map.containsKey(Object)>
	//* 109  309:ifeq            1179
		{
			((zaa)zaih.get(message.obj)).zabp();
	//  110  312:aload_0         
	//  111  313:getfield        #100 <Field Map zaih>
	//  112  316:aload_1         
	//  113  317:getfield        #277 <Field Object Message.obj>
	//  114  320:invokeinterface #193 <Method Object Map.get(Object)>
	//  115  325:checkcast       #8   <Class GoogleApiManager$zaa>
	//  116  328:invokevirtual   #313 <Method boolean GoogleApiManager$zaa.zabp()>
	//  117  331:pop             
			return true;
	//  118  332:iconst_1        
	//  119  333:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L11:
		if(zaih.containsKey(message.obj))
	//* 120  334:aload_0         
	//* 121  335:getfield        #100 <Field Map zaih>
	//* 122  338:aload_1         
	//* 123  339:getfield        #277 <Field Object Message.obj>
	//* 124  342:invokeinterface #283 <Method boolean Map.containsKey(Object)>
	//* 125  347:ifeq            1179
		{
			((zaa)zaih.get(message.obj)).zaav();
	//  126  350:aload_0         
	//  127  351:getfield        #100 <Field Map zaih>
	//  128  354:aload_1         
	//  129  355:getfield        #277 <Field Object Message.obj>
	//  130  358:invokeinterface #193 <Method Object Map.get(Object)>
	//  131  363:checkcast       #8   <Class GoogleApiManager$zaa>
	//  132  366:invokevirtual   #316 <Method void GoogleApiManager$zaa.zaav()>
			return true;
	//  133  369:iconst_1        
	//  134  370:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L10:
		zai zai2;
		for(message = ((Message) (zaik.iterator())); ((Iterator) (message)).hasNext(); ((zaa)zaih.remove(((Object) (zai2)))).zabj())
	//* 135  371:aload_0         
	//* 136  372:getfield        #109 <Field Set zaik>
	//* 137  375:invokeinterface #320 <Method Iterator Set.iterator()>
	//* 138  380:astore_1        
	//* 139  381:aload_1         
	//* 140  382:invokeinterface #325 <Method boolean Iterator.hasNext()>
	//* 141  387:ifeq            421
			zai2 = (zai)((Iterator) (message)).next();
	//  142  390:aload_1         
	//  143  391:invokeinterface #328 <Method Object Iterator.next()>
	//  144  396:checkcast       #330 <Class zai>
	//  145  399:astore          6

	//  146  401:aload_0         
	//  147  402:getfield        #100 <Field Map zaih>
	//  148  405:aload           6
	//  149  407:invokeinterface #333 <Method Object Map.remove(Object)>
	//  150  412:checkcast       #8   <Class GoogleApiManager$zaa>
	//  151  415:invokevirtual   #336 <Method void GoogleApiManager$zaa.zabj()>
	//* 152  418:goto            381
		zaik.clear();
	//  153  421:aload_0         
	//  154  422:getfield        #109 <Field Set zaik>
	//  155  425:invokeinterface #339 <Method void Set.clear()>
		return true;
	//  156  430:iconst_1        
	//  157  431:ireturn         
_L9:
		if(zaih.containsKey(message.obj))
	//* 158  432:aload_0         
	//* 159  433:getfield        #100 <Field Map zaih>
	//* 160  436:aload_1         
	//* 161  437:getfield        #277 <Field Object Message.obj>
	//* 162  440:invokeinterface #283 <Method boolean Map.containsKey(Object)>
	//* 163  445:ifeq            1179
		{
			((zaa)zaih.get(message.obj)).resume();
	//  164  448:aload_0         
	//  165  449:getfield        #100 <Field Map zaih>
	//  166  452:aload_1         
	//  167  453:getfield        #277 <Field Object Message.obj>
	//  168  456:invokeinterface #193 <Method Object Map.get(Object)>
	//  169  461:checkcast       #8   <Class GoogleApiManager$zaa>
	//  170  464:invokevirtual   #342 <Method void GoogleApiManager$zaa.resume()>
			return true;
	//  171  467:iconst_1        
	//  172  468:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L8:
		zab((GoogleApi)message.obj);
	//  173  469:aload_0         
	//  174  470:aload_1         
	//  175  471:getfield        #277 <Field Object Message.obj>
	//  176  474:checkcast       #183 <Class GoogleApi>
	//  177  477:invokespecial   #344 <Method void zab(GoogleApi)>
		return true;
	//  178  480:iconst_1        
	//  179  481:ireturn         
_L7:
		if(!PlatformVersion.isAtLeastIceCreamSandwich() || !(zaic.getApplicationContext() instanceof Application))
			break; /* Loop/switch isn't completed */
	//  180  482:invokestatic    #349 <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//  181  485:ifeq            1179
	//  182  488:aload_0         
	//  183  489:getfield        #111 <Field Context zaic>
	//  184  492:invokevirtual   #171 <Method Context Context.getApplicationContext()>
	//  185  495:instanceof      #351 <Class Application>
	//  186  498:ifeq            1179
		BackgroundDetector.initialize((Application)zaic.getApplicationContext());
	//  187  501:aload_0         
	//  188  502:getfield        #111 <Field Context zaic>
	//  189  505:invokevirtual   #171 <Method Context Context.getApplicationContext()>
	//  190  508:checkcast       #351 <Class Application>
	//  191  511:invokestatic    #357 <Method void BackgroundDetector.initialize(Application)>
		BackgroundDetector.getInstance().addListener(((BackgroundDetector.BackgroundStateChangeListener) (new zabi(this))));
	//  192  514:invokestatic    #360 <Method BackgroundDetector BackgroundDetector.getInstance()>
	//  193  517:new             #362 <Class zabi>
	//  194  520:dup             
	//  195  521:aload_0         
	//  196  522:invokespecial   #365 <Method void zabi(GoogleApiManager)>
	//  197  525:invokevirtual   #369 <Method void BackgroundDetector.addListener(BackgroundDetector$BackgroundStateChangeListener)>
		if(!BackgroundDetector.getInstance().readCurrentStateIfPossible(true))
	//* 198  528:invokestatic    #360 <Method BackgroundDetector BackgroundDetector.getInstance()>
	//* 199  531:iconst_1        
	//* 200  532:invokevirtual   #373 <Method boolean BackgroundDetector.readCurrentStateIfPossible(boolean)>
	//* 201  535:ifne            1179
		{
			zaia = 0x493e0L;
	//  202  538:aload_0         
	//  203  539:ldc2w           #249 <Long 0x493e0L>
	//  204  542:putfield        #83  <Field long zaia>
			return true;
	//  205  545:iconst_1        
	//  206  546:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L6:
		Object obj;
		Iterator iterator1;
		i = message.arg1;
	//  207  547:aload_1         
	//  208  548:getfield        #376 <Field int Message.arg1>
	//  209  551:istore_2        
		obj = ((Object) ((ConnectionResult)message.obj));
	//  210  552:aload_1         
	//  211  553:getfield        #277 <Field Object Message.obj>
	//  212  556:checkcast       #378 <Class ConnectionResult>
	//  213  559:astore          6
		iterator1 = zaih.values().iterator();
	//  214  561:aload_0         
	//  215  562:getfield        #100 <Field Map zaih>
	//  216  565:invokeinterface #382 <Method Collection Map.values()>
	//  217  570:invokeinterface #385 <Method Iterator Collection.iterator()>
	//  218  575:astore          7
_L19:
		if(!iterator1.hasNext()) goto _L17; else goto _L16
	//  219  577:aload           7
	//  220  579:invokeinterface #325 <Method boolean Iterator.hasNext()>
	//  221  584:ifeq            609
_L16:
		message = ((Message) ((zaa)iterator1.next()));
	//  222  587:aload           7
	//  223  589:invokeinterface #328 <Method Object Iterator.next()>
	//  224  594:checkcast       #8   <Class GoogleApiManager$zaa>
	//  225  597:astore_1        
		if(((zaa) (message)).getInstanceId() != i) goto _L19; else goto _L18
	//  226  598:aload_1         
	//  227  599:invokevirtual   #388 <Method int GoogleApiManager$zaa.getInstanceId()>
	//  228  602:iload_2         
	//  229  603:icmpne          577
	//* 230  606:goto            611
_L17:
		message = null;
	//  231  609:aconst_null     
	//  232  610:astore_1        
_L18:
		if(message != null)
	//* 233  611:aload_1         
	//* 234  612:ifnull          719
		{
			String s = zaid.getErrorString(((ConnectionResult) (obj)).getErrorCode());
	//  235  615:aload_0         
	//  236  616:getfield        #120 <Field GoogleApiAvailability zaid>
	//  237  619:aload           6
	//  238  621:invokevirtual   #391 <Method int ConnectionResult.getErrorCode()>
	//  239  624:invokevirtual   #395 <Method String GoogleApiAvailability.getErrorString(int)>
	//  240  627:astore          7
			obj = ((Object) (((ConnectionResult) (obj)).getErrorMessage()));
	//  241  629:aload           6
	//  242  631:invokevirtual   #398 <Method String ConnectionResult.getErrorMessage()>
	//  243  634:astore          6
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 69 + String.valueOf(obj).length());
	//  244  636:new             #252 <Class StringBuilder>
	//  245  639:dup             
	//  246  640:aload           7
	//  247  642:invokestatic    #403 <Method String String.valueOf(Object)>
	//  248  645:invokevirtual   #406 <Method int String.length()>
	//  249  648:bipush          69
	//  250  650:iadd            
	//  251  651:aload           6
	//  252  653:invokestatic    #403 <Method String String.valueOf(Object)>
	//  253  656:invokevirtual   #406 <Method int String.length()>
	//  254  659:iadd            
	//  255  660:invokespecial   #253 <Method void StringBuilder(int)>
	//  256  663:astore          8
			stringbuilder.append("Error resolution was canceled by the user, original error message: ");
	//  257  665:aload           8
	//  258  667:ldc2            #408 <String "Error resolution was canceled by the user, original error message: ">
	//  259  670:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  260  673:pop             
			stringbuilder.append(s);
	//  261  674:aload           8
	//  262  676:aload           7
	//  263  678:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  264  681:pop             
			stringbuilder.append(": ");
	//  265  682:aload           8
	//  266  684:ldc2            #410 <String ": ">
	//  267  687:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  268  690:pop             
			stringbuilder.append(((String) (obj)));
	//  269  691:aload           8
	//  270  693:aload           6
	//  271  695:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  272  698:pop             
			((zaa) (message)).zac(new Status(17, stringbuilder.toString()));
	//  273  699:aload_1         
	//  274  700:new             #53  <Class Status>
	//  275  703:dup             
	//  276  704:bipush          17
	//  277  706:aload           8
	//  278  708:invokevirtual   #268 <Method String StringBuilder.toString()>
	//  279  711:invokespecial   #59  <Method void Status(int, String)>
	//  280  714:invokevirtual   #413 <Method void GoogleApiManager$zaa.zac(Status)>
			return true;
	//  281  717:iconst_1        
	//  282  718:ireturn         
		} else
		{
			message = ((Message) (new StringBuilder(76)));
	//  283  719:new             #252 <Class StringBuilder>
	//  284  722:dup             
	//  285  723:bipush          76
	//  286  725:invokespecial   #253 <Method void StringBuilder(int)>
	//  287  728:astore_1        
			((StringBuilder) (message)).append("Could not find API instance ");
	//  288  729:aload_1         
	//  289  730:ldc2            #415 <String "Could not find API instance ">
	//  290  733:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  291  736:pop             
			((StringBuilder) (message)).append(i);
	//  292  737:aload_1         
	//  293  738:iload_2         
	//  294  739:invokevirtual   #262 <Method StringBuilder StringBuilder.append(int)>
	//  295  742:pop             
			((StringBuilder) (message)).append(" while trying to fail enqueued calls.");
	//  296  743:aload_1         
	//  297  744:ldc2            #417 <String " while trying to fail enqueued calls.">
	//  298  747:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  299  750:pop             
			Log.wtf("GoogleApiManager", ((StringBuilder) (message)).toString(), ((Throwable) (new Exception())));
	//  300  751:ldc2            #264 <String "GoogleApiManager">
	//  301  754:aload_1         
	//  302  755:invokevirtual   #268 <Method String StringBuilder.toString()>
	//  303  758:new             #419 <Class Exception>
	//  304  761:dup             
	//  305  762:invokespecial   #420 <Method void Exception()>
	//  306  765:invokestatic    #424 <Method int Log.wtf(String, String, Throwable)>
	//  307  768:pop             
			return true;
	//  308  769:iconst_1        
	//  309  770:ireturn         
		}
_L5:
		zabv zabv1 = (zabv)message.obj;
	//  310  771:aload_1         
	//  311  772:getfield        #277 <Field Object Message.obj>
	//  312  775:checkcast       #426 <Class zabv>
	//  313  778:astore          7
		zaa zaa1 = (zaa)zaih.get(((Object) (zabv1.zajs.zak())));
	//  314  780:aload_0         
	//  315  781:getfield        #100 <Field Map zaih>
	//  316  784:aload           7
	//  317  786:getfield        #430 <Field GoogleApi zabv.zajs>
	//  318  789:invokevirtual   #187 <Method zai GoogleApi.zak()>
	//  319  792:invokeinterface #193 <Method Object Map.get(Object)>
	//  320  797:checkcast       #8   <Class GoogleApiManager$zaa>
	//  321  800:astore          6
		message = ((Message) (zaa1));
	//  322  802:aload           6
	//  323  804:astore_1        
		if(zaa1 == null)
	//* 324  805:aload           6
	//* 325  807:ifnonnull       840
		{
			zab(zabv1.zajs);
	//  326  810:aload_0         
	//  327  811:aload           7
	//  328  813:getfield        #430 <Field GoogleApi zabv.zajs>
	//  329  816:invokespecial   #344 <Method void zab(GoogleApi)>
			message = ((Message) ((zaa)zaih.get(((Object) (zabv1.zajs.zak())))));
	//  330  819:aload_0         
	//  331  820:getfield        #100 <Field Map zaih>
	//  332  823:aload           7
	//  333  825:getfield        #430 <Field GoogleApi zabv.zajs>
	//  334  828:invokevirtual   #187 <Method zai GoogleApi.zak()>
	//  335  831:invokeinterface #193 <Method Object Map.get(Object)>
	//  336  836:checkcast       #8   <Class GoogleApiManager$zaa>
	//  337  839:astore_1        
		}
		if(((zaa) (message)).requiresSignIn() && zaig.get() != zabv1.zajr)
	//* 338  840:aload_1         
	//* 339  841:invokevirtual   #204 <Method boolean GoogleApiManager$zaa.requiresSignIn()>
	//* 340  844:ifeq            879
	//* 341  847:aload_0         
	//* 342  848:getfield        #92  <Field AtomicInteger zaig>
	//* 343  851:invokevirtual   #432 <Method int AtomicInteger.get()>
	//* 344  854:aload           7
	//* 345  856:getfield        #435 <Field int zabv.zajr>
	//* 346  859:icmpeq          879
		{
			zabv1.zajq.zaa(zahw);
	//  347  862:aload           7
	//  348  864:getfield        #439 <Field zab zabv.zajq>
	//  349  867:getstatic       #61  <Field Status zahw>
	//  350  870:invokevirtual   #443 <Method void zab.zaa(Status)>
			((zaa) (message)).zabj();
	//  351  873:aload_1         
	//  352  874:invokevirtual   #336 <Method void GoogleApiManager$zaa.zabj()>
			return true;
	//  353  877:iconst_1        
	//  354  878:ireturn         
		} else
		{
			((zaa) (message)).zaa(zabv1.zajq);
	//  355  879:aload_1         
	//  356  880:aload           7
	//  357  882:getfield        #439 <Field zab zabv.zajq>
	//  358  885:invokevirtual   #446 <Method void GoogleApiManager$zaa.zaa(zab)>
			return true;
	//  359  888:iconst_1        
	//  360  889:ireturn         
		}
_L4:
		zaa zaa2;
		for(message = ((Message) (zaih.values().iterator())); ((Iterator) (message)).hasNext(); zaa2.connect())
	//* 361  890:aload_0         
	//* 362  891:getfield        #100 <Field Map zaih>
	//* 363  894:invokeinterface #382 <Method Collection Map.values()>
	//* 364  899:invokeinterface #385 <Method Iterator Collection.iterator()>
	//* 365  904:astore_1        
	//* 366  905:aload_1         
	//* 367  906:invokeinterface #325 <Method boolean Iterator.hasNext()>
	//* 368  911:ifeq            1179
		{
			zaa2 = (zaa)((Iterator) (message)).next();
	//  369  914:aload_1         
	//  370  915:invokeinterface #328 <Method Object Iterator.next()>
	//  371  920:checkcast       #8   <Class GoogleApiManager$zaa>
	//  372  923:astore          6
			zaa2.zabl();
	//  373  925:aload           6
	//  374  927:invokevirtual   #449 <Method void GoogleApiManager$zaa.zabl()>
		}

	//  375  930:aload           6
	//  376  932:invokevirtual   #213 <Method void GoogleApiManager$zaa.connect()>
		break; /* Loop/switch isn't completed */
	//  377  935:goto            905
_L3:
		message = ((Message) ((zak)message.obj));
	//  378  938:aload_1         
	//  379  939:getfield        #277 <Field Object Message.obj>
	//  380  942:checkcast       #451 <Class zak>
	//  381  945:astore_1        
		Iterator iterator = ((zak) (message)).zap().iterator();
	//  382  946:aload_1         
	//  383  947:invokevirtual   #455 <Method Set zak.zap()>
	//  384  950:invokeinterface #320 <Method Iterator Set.iterator()>
	//  385  955:astore          6
		do
		{
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
	//  386  957:aload           6
	//  387  959:invokeinterface #325 <Method boolean Iterator.hasNext()>
	//  388  964:ifeq            1179
			zai zai4 = (zai)iterator.next();
	//  389  967:aload           6
	//  390  969:invokeinterface #328 <Method Object Iterator.next()>
	//  391  974:checkcast       #330 <Class zai>
	//  392  977:astore          7
			zaa zaa3 = (zaa)zaih.get(((Object) (zai4)));
	//  393  979:aload_0         
	//  394  980:getfield        #100 <Field Map zaih>
	//  395  983:aload           7
	//  396  985:invokeinterface #193 <Method Object Map.get(Object)>
	//  397  990:checkcast       #8   <Class GoogleApiManager$zaa>
	//  398  993:astore          8
			if(zaa3 == null)
	//* 399  995:aload           8
	//* 400  997:ifnonnull       1018
			{
				((zak) (message)).zaa(zai4, new ConnectionResult(13), ((String) (null)));
	//  401 1000:aload_1         
	//  402 1001:aload           7
	//  403 1003:new             #378 <Class ConnectionResult>
	//  404 1006:dup             
	//  405 1007:bipush          13
	//  406 1009:invokespecial   #456 <Method void ConnectionResult(int)>
	//  407 1012:aconst_null     
	//  408 1013:invokevirtual   #459 <Method void zak.zaa(zai, ConnectionResult, String)>
				return true;
	//  409 1016:iconst_1        
	//  410 1017:ireturn         
			}
			if(zaa3.isConnected())
	//* 411 1018:aload           8
	//* 412 1020:invokevirtual   #462 <Method boolean GoogleApiManager$zaa.isConnected()>
	//* 413 1023:ifeq            1048
				((zak) (message)).zaa(zai4, ConnectionResult.RESULT_SUCCESS, zaa3.zaab().getEndpointPackageName());
	//  414 1026:aload_1         
	//  415 1027:aload           7
	//  416 1029:getstatic       #466 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//  417 1032:aload           8
	//  418 1034:invokevirtual   #470 <Method com.google.android.gms.common.api.Api$Client GoogleApiManager$zaa.zaab()>
	//  419 1037:invokeinterface #475 <Method String com.google.android.gms.common.api.Api$Client.getEndpointPackageName()>
	//  420 1042:invokevirtual   #459 <Method void zak.zaa(zai, ConnectionResult, String)>
			else
	//* 421 1045:goto            957
			if(zaa3.zabm() != null)
	//* 422 1048:aload           8
	//* 423 1050:invokevirtual   #479 <Method ConnectionResult GoogleApiManager$zaa.zabm()>
	//* 424 1053:ifnull          1071
			{
				((zak) (message)).zaa(zai4, zaa3.zabm(), ((String) (null)));
	//  425 1056:aload_1         
	//  426 1057:aload           7
	//  427 1059:aload           8
	//  428 1061:invokevirtual   #479 <Method ConnectionResult GoogleApiManager$zaa.zabm()>
	//  429 1064:aconst_null     
	//  430 1065:invokevirtual   #459 <Method void zak.zaa(zai, ConnectionResult, String)>
			} else
	//* 431 1068:goto            957
			{
				zaa3.zaa(((zak) (message)));
	//  432 1071:aload           8
	//  433 1073:aload_1         
	//  434 1074:invokevirtual   #482 <Method void GoogleApiManager$zaa.zaa(zak)>
				zaa3.connect();
	//  435 1077:aload           8
	//  436 1079:invokevirtual   #213 <Method void GoogleApiManager$zaa.connect()>
			}
		} while(true);
	//  437 1082:goto            957
_L2:
		if(((Boolean)message.obj).booleanValue())
	//* 438 1085:aload_1         
	//* 439 1086:getfield        #277 <Field Object Message.obj>
	//* 440 1089:checkcast       #297 <Class Boolean>
	//* 441 1092:invokevirtual   #485 <Method boolean Boolean.booleanValue()>
	//* 442 1095:ifeq            1102
			l = 10000L;
	//  443 1098:ldc2w           #80  <Long 10000L>
	//  444 1101:lstore_3        
		zaia = l;
	//  445 1102:aload_0         
	//  446 1103:lload_3         
	//  447 1104:putfield        #83  <Field long zaia>
		handler.removeMessages(12);
	//  448 1107:aload_0         
	//  449 1108:getfield        #118 <Field Handler handler>
	//  450 1111:bipush          12
	//  451 1113:invokevirtual   #488 <Method void Handler.removeMessages(int)>
		zai zai3;
		Handler handler1;
		for(message = ((Message) (zaih.keySet().iterator())); ((Iterator) (message)).hasNext(); handler1.sendMessageDelayed(handler1.obtainMessage(12, ((Object) (zai3))), zaia))
	//* 452 1116:aload_0         
	//* 453 1117:getfield        #100 <Field Map zaih>
	//* 454 1120:invokeinterface #491 <Method Set Map.keySet()>
	//* 455 1125:invokeinterface #320 <Method Iterator Set.iterator()>
	//* 456 1130:astore_1        
	//* 457 1131:aload_1         
	//* 458 1132:invokeinterface #325 <Method boolean Iterator.hasNext()>
	//* 459 1137:ifeq            1179
		{
			zai3 = (zai)((Iterator) (message)).next();
	//  460 1140:aload_1         
	//  461 1141:invokeinterface #328 <Method Object Iterator.next()>
	//  462 1146:checkcast       #330 <Class zai>
	//  463 1149:astore          6
			handler1 = handler;
	//  464 1151:aload_0         
	//  465 1152:getfield        #118 <Field Handler handler>
	//  466 1155:astore          7
		}

	//  467 1157:aload           7
	//  468 1159:aload           7
	//  469 1161:bipush          12
	//  470 1163:aload           6
	//  471 1165:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//  472 1168:aload_0         
	//  473 1169:getfield        #83  <Field long zaia>
	//  474 1172:invokevirtual   #498 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//  475 1175:pop             
	//* 476 1176:goto            1131
		return true;
	//  477 1179:iconst_1        
	//  478 1180:ireturn         
	}

	final void maybeSignOut()
	{
		zaig.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field AtomicInteger zaig>
	//    2    4:invokevirtual   #145 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		Handler handler1 = handler;
	//    4    8:aload_0         
	//    5    9:getfield        #118 <Field Handler handler>
	//    6   12:astore_1        
		handler1.sendMessage(handler1.obtainMessage(10));
	//    7   13:aload_1         
	//    8   14:aload_1         
	//    9   15:bipush          10
	//   10   17:invokevirtual   #133 <Method Message Handler.obtainMessage(int)>
	//   11   20:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   12   23:pop             
	//   13   24:return          
	}

	final PendingIntent zaa(zai zai1, int i)
	{
		zai1 = ((zai) ((zaa)zaih.get(((Object) (zai1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Map zaih>
	//    2    4:aload_1         
	//    3    5:invokeinterface #193 <Method Object Map.get(Object)>
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
	//   11   21:invokevirtual   #504 <Method zad GoogleApiManager$zaa.zabq()>
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
	//   21   37:invokeinterface #510 <Method android.content.Intent zad.getSignInIntent()>
	//   22   42:ldc2            #511 <Int 0x8000000>
	//   23   45:invokestatic    #517 <Method PendingIntent PendingIntent.getActivity(Context, int, android.content.Intent, int)>
	//   24   48:areturn         
	}

	public final Task zaa(GoogleApi googleapi, ListenerHolder.ListenerKey listenerkey)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #303 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #521 <Method void TaskCompletionSource()>
	//    3    7:astore_3        
		listenerkey = ((ListenerHolder.ListenerKey) (new zah(listenerkey, taskcompletionsource)));
	//    4    8:new             #523 <Class zah>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokespecial   #526 <Method void zah(ListenerHolder$ListenerKey, TaskCompletionSource)>
	//    9   17:astore_2        
		Handler handler1 = handler;
	//   10   18:aload_0         
	//   11   19:getfield        #118 <Field Handler handler>
	//   12   22:astore          4
		handler1.sendMessage(handler1.obtainMessage(13, ((Object) (new zabv(((com.google.android.gms.common.api.internal.zab) (listenerkey)), zaig.get(), googleapi)))));
	//   13   24:aload           4
	//   14   26:aload           4
	//   15   28:bipush          13
	//   16   30:new             #426 <Class zabv>
	//   17   33:dup             
	//   18   34:aload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #92  <Field AtomicInteger zaig>
	//   21   39:invokevirtual   #432 <Method int AtomicInteger.get()>
	//   22   42:aload_1         
	//   23   43:invokespecial   #529 <Method void zabv(zab, int, GoogleApi)>
	//   24   46:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   25   49:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   26   52:pop             
		return taskcompletionsource.getTask();
	//   27   53:aload_3         
	//   28   54:invokevirtual   #533 <Method Task TaskCompletionSource.getTask()>
	//   29   57:areturn         
	}

	public final Task zaa(GoogleApi googleapi, RegisterListenerMethod registerlistenermethod, UnregisterListenerMethod unregisterlistenermethod)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #303 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #521 <Method void TaskCompletionSource()>
	//    3    7:astore          4
		registerlistenermethod = ((RegisterListenerMethod) (new zaf(new zabw(registerlistenermethod, unregisterlistenermethod), taskcompletionsource)));
	//    4    9:new             #538 <Class zaf>
	//    5   12:dup             
	//    6   13:new             #540 <Class zabw>
	//    7   16:dup             
	//    8   17:aload_2         
	//    9   18:aload_3         
	//   10   19:invokespecial   #543 <Method void zabw(RegisterListenerMethod, UnregisterListenerMethod)>
	//   11   22:aload           4
	//   12   24:invokespecial   #546 <Method void zaf(zabw, TaskCompletionSource)>
	//   13   27:astore_2        
		unregisterlistenermethod = ((UnregisterListenerMethod) (handler));
	//   14   28:aload_0         
	//   15   29:getfield        #118 <Field Handler handler>
	//   16   32:astore_3        
		((Handler) (unregisterlistenermethod)).sendMessage(((Handler) (unregisterlistenermethod)).obtainMessage(8, ((Object) (new zabv(((com.google.android.gms.common.api.internal.zab) (registerlistenermethod)), zaig.get(), googleapi)))));
	//   17   33:aload_3         
	//   18   34:aload_3         
	//   19   35:bipush          8
	//   20   37:new             #426 <Class zabv>
	//   21   40:dup             
	//   22   41:aload_2         
	//   23   42:aload_0         
	//   24   43:getfield        #92  <Field AtomicInteger zaig>
	//   25   46:invokevirtual   #432 <Method int AtomicInteger.get()>
	//   26   49:aload_1         
	//   27   50:invokespecial   #529 <Method void zabv(zab, int, GoogleApi)>
	//   28   53:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   29   56:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   30   59:pop             
		return taskcompletionsource.getTask();
	//   31   60:aload           4
	//   32   62:invokevirtual   #533 <Method Task TaskCompletionSource.getTask()>
	//   33   65:areturn         
	}

	public final Task zaa(Iterable iterable)
	{
		iterable = ((Iterable) (new zak(iterable)));
	//    0    0:new             #451 <Class zak>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #551 <Method void zak(Iterable)>
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
	//   13   21:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   14   24:pop             
		return ((zak) (iterable)).getTask();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #552 <Method Task zak.getTask()>
	//   17   29:areturn         
	}

	public final void zaa(ConnectionResult connectionresult, int i)
	{
		if(!zac(connectionresult, i))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:invokevirtual   #557 <Method boolean zac(ConnectionResult, int)>
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
	//   15   23:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   16   26:pop             
		}
	//   17   27:return          
	}

	public final void zaa(GoogleApi googleapi)
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
	//    8   13:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//    9   16:pop             
	//   10   17:return          
	}

	public final void zaa(GoogleApi googleapi, int i, BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		apimethodimpl = ((BaseImplementation.ApiMethodImpl) (new zae(i, apimethodimpl)));
	//    0    0:new             #563 <Class zae>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #566 <Method void zae(int, BaseImplementation$ApiMethodImpl)>
	//    5    9:astore_3        
		Handler handler1 = handler;
	//    6   10:aload_0         
	//    7   11:getfield        #118 <Field Handler handler>
	//    8   14:astore          4
		handler1.sendMessage(handler1.obtainMessage(4, ((Object) (new zabv(((com.google.android.gms.common.api.internal.zab) (apimethodimpl)), zaig.get(), googleapi)))));
	//    9   16:aload           4
	//   10   18:aload           4
	//   11   20:iconst_4        
	//   12   21:new             #426 <Class zabv>
	//   13   24:dup             
	//   14   25:aload_3         
	//   15   26:aload_0         
	//   16   27:getfield        #92  <Field AtomicInteger zaig>
	//   17   30:invokevirtual   #432 <Method int AtomicInteger.get()>
	//   18   33:aload_1         
	//   19   34:invokespecial   #529 <Method void zabv(zab, int, GoogleApi)>
	//   20   37:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   21   40:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   22   43:pop             
	//   23   44:return          
	}

	public final void zaa(GoogleApi googleapi, int i, TaskApiCall taskapicall, TaskCompletionSource taskcompletionsource, StatusExceptionMapper statusexceptionmapper)
	{
		taskapicall = ((TaskApiCall) (new zag(i, taskapicall, taskcompletionsource, statusexceptionmapper)));
	//    0    0:new             #570 <Class zag>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:invokespecial   #573 <Method void zag(int, TaskApiCall, TaskCompletionSource, StatusExceptionMapper)>
	//    7   13:astore_3        
		taskcompletionsource = ((TaskCompletionSource) (handler));
	//    8   14:aload_0         
	//    9   15:getfield        #118 <Field Handler handler>
	//   10   18:astore          4
		((Handler) (taskcompletionsource)).sendMessage(((Handler) (taskcompletionsource)).obtainMessage(4, ((Object) (new zabv(((com.google.android.gms.common.api.internal.zab) (taskapicall)), zaig.get(), googleapi)))));
	//   11   20:aload           4
	//   12   22:aload           4
	//   13   24:iconst_4        
	//   14   25:new             #426 <Class zabv>
	//   15   28:dup             
	//   16   29:aload_3         
	//   17   30:aload_0         
	//   18   31:getfield        #92  <Field AtomicInteger zaig>
	//   19   34:invokevirtual   #432 <Method int AtomicInteger.get()>
	//   20   37:aload_1         
	//   21   38:invokespecial   #529 <Method void zabv(zab, int, GoogleApi)>
	//   22   41:invokevirtual   #494 <Method Message Handler.obtainMessage(int, Object)>
	//   23   44:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   24   47:pop             
	//   25   48:return          
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
	//   13   23:invokeinterface #339 <Method void Set.clear()>
			}
			zaij.addAll(((Collection) (zaae1.zaaj())));
	//   14   28:aload_0         
	//   15   29:getfield        #107 <Field Set zaij>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #581 <Method ArraySet zaae.zaaj()>
	//   18   36:invokeinterface #585 <Method boolean Set.addAll(Collection)>
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
	//   13   23:invokeinterface #339 <Method void Set.clear()>
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
	//    2    4:invokevirtual   #589 <Method int AtomicInteger.getAndIncrement()>
	//    3    7:ireturn         
	}

	public final Task zac(GoogleApi googleapi)
	{
		googleapi = ((GoogleApi) (new zaaf(googleapi.zak())));
	//    0    0:new             #290 <Class zaaf>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #187 <Method zai GoogleApi.zak()>
	//    4    8:invokespecial   #593 <Method void zaaf(zai)>
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
	//   14   25:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//   15   28:pop             
		return ((zaaf) (googleapi)).zaal().getTask();
	//   16   29:aload_1         
	//   17   30:invokevirtual   #295 <Method TaskCompletionSource zaaf.zaal()>
	//   18   33:invokevirtual   #533 <Method Task TaskCompletionSource.getTask()>
	//   19   36:areturn         
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
	//    6   10:invokevirtual   #597 <Method boolean GoogleApiAvailability.zaa(Context, ConnectionResult, int)>
	//    7   13:ireturn         
	}

	public final void zao()
	{
		Handler handler1 = handler;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler handler>
	//    2    4:astore_1        
		handler1.sendMessage(handler1.obtainMessage(3));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:iconst_3        
	//    6    8:invokevirtual   #133 <Method Message Handler.obtainMessage(int)>
	//    7   11:invokevirtual   #137 <Method boolean Handler.sendMessage(Message)>
	//    8   14:pop             
	//    9   15:return          
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
	private final Set zaij = new ArraySet();
	private final Set zaik = new ArraySet();

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
