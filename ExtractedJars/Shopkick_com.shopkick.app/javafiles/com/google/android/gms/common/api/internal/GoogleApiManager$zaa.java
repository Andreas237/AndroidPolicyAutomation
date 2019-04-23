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
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zar, GoogleApiManager, zaab, zab, 
//			zac, zabw, RegisterListenerMethod, zal, 
//			zak, zace, zabj, zai, 
//			zabk, zabl, zah, zabm

public final class GoogleApiManager$zaa
	implements com.google.android.gms.common.api.ctionCallbacks, com.google.android.gms.common.api.nectionFailedListener, zar
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

	static void zaa(GoogleApiManager$zaa googleapimanager$zaa, GoogleApiManager$zab googleapimanager$zab)
	{
		googleapimanager$zaa.zaa(googleapimanager$zab);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #184 <Method void zaa(GoogleApiManager$zab)>
	//    3    5:return          
	}

	private final void zaa(GoogleApiManager$zab googleapimanager$zab)
	{
		if(!zaiv.contains(((Object) (googleapimanager$zab))))
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

	static boolean zaa(GoogleApiManager$zaa googleapimanager$zaa, boolean flag)
	{
		return googleapimanager$zaa.zac(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #205 <Method boolean zac(boolean)>
	//    3    5:ireturn         
	}

	static void zab(GoogleApiManager$zaa googleapimanager$zaa, GoogleApiManager$zab googleapimanager$zab)
	{
		googleapimanager$zaa.zab(googleapimanager$zab);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method void zab(GoogleApiManager$zab)>
	//    3    5:return          
	}

	private final void zab(GoogleApiManager$zab googleapimanager$zab)
	{
		if(zaiv.remove(((Object) (googleapimanager$zab))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field List zaiv>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #210 <Method boolean List.remove(Object)>
	//*   4   10:ifeq            206
		{
			GoogleApiManager.zaa(zail).removeMessages(15, ((Object) (googleapimanager$zab)));
	//    5   13:aload_0         
	//    6   14:getfield        #50  <Field GoogleApiManager zail>
	//    7   17:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
	//    8   20:bipush          15
	//    9   22:aload_1         
	//   10   23:invokevirtual   #214 <Method void Handler.removeMessages(int, Object)>
			GoogleApiManager.zaa(zail).removeMessages(16, ((Object) (googleapimanager$zab)));
	//   11   26:aload_0         
	//   12   27:getfield        #50  <Field GoogleApiManager zail>
	//   13   30:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
	//   14   33:bipush          16
	//   15   35:aload_1         
	//   16   36:invokevirtual   #214 <Method void Handler.removeMessages(int, Object)>
			googleapimanager$zab = ((GoogleApiManager$zab) (com.google.android.gms.common.api.internal.GoogleApiManager$zab.zad(googleapimanager$zab)));
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
				zab zab1 = (zab)iterator.next();
	//   34   83:aload           5
	//   35   85:invokeinterface #239 <Method Object Iterator.next()>
	//   36   90:checkcast       #241 <Class zab>
	//   37   93:astore          6
				if(zab1 instanceof zac)
	//*  38   95:aload           6
	//*  39   97:instanceof      #243 <Class zac>
	//*  40  100:ifeq            73
				{
					Feature afeature[] = ((zac)zab1).zab(this);
	//   41  103:aload           6
	//   42  105:checkcast       #243 <Class zac>
	//   43  108:aload_0         
	//   44  109:invokevirtual   #246 <Method Feature[] zac.zab(GoogleApiManager$zaa)>
	//   45  112:astore          7
					if(afeature != null && ArrayUtils.contains(((Object []) (afeature)), ((Object) (googleapimanager$zab))))
	//*  46  114:aload           7
	//*  47  116:ifnull          73
	//*  48  119:aload           7
	//*  49  121:aload_1         
	//*  50  122:invokestatic    #251 <Method boolean ArrayUtils.contains(Object[], Object)>
	//*  51  125:ifeq            73
						arraylist.add(((Object) (zab1)));
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
				obj = ((Object) ((zab)obj));
	//   76  171:aload           5
	//   77  173:checkcast       #241 <Class zab>
	//   78  176:astore          5
				zaim.remove(obj);
	//   79  178:aload_0         
	//   80  179:getfield        #58  <Field Queue zaim>
	//   81  182:aload           5
	//   82  184:invokeinterface #259 <Method boolean Queue.remove(Object)>
	//   83  189:pop             
				((zab) (obj)).zaa(((RuntimeException) (new UnsupportedApiCallException(((Feature) (googleapimanager$zab))))));
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

	private final boolean zab(zab zab1)
	{
		if(!(zab1 instanceof zac))
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
		zac zac1 = (zac)zab1;
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
			zab1 = ((zab) (new GoogleApiManager$zab(zafp, feature, ((zabi) (null)))));
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
				zab1 = ((zab) ((GoogleApiManager$zab)zaiv.get(i)));
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
				zab1 = ((zab) (new ConnectionResult(2, ((android.app.PendingIntent) (null)))));
	//  103  214:new             #302 <Class ConnectionResult>
	//  104  217:dup             
	//  105  218:iconst_2        
	//  106  219:aconst_null     
	//  107  220:invokespecial   #305 <Method void ConnectionResult(int, android.app.PendingIntent)>
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
			((zab) (zac1)).zaa(((RuntimeException) (new UnsupportedApiCallException(feature))));
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
			obj = ((Object) ((zab)obj));
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
			if(zab(((zab) (obj))))
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

	private final void zac(zab zab1)
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
		catch(zab zab1)
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

	static void zae(GoogleApiManager$zaa googleapimanager$zaa)
	{
		googleapimanager$zaa.zabg();
	//    0    0:aload_0         
	//    1    1:invokespecial   #409 <Method void zabg()>
	//    2    4:return          
	}

	static void zaf(GoogleApiManager$zaa googleapimanager$zaa)
	{
		googleapimanager$zaa.zabh();
	//    0    0:aload_0         
	//    1    1:invokespecial   #412 <Method void zabh()>
	//    2    4:return          
	}

	static com.google.android.gms.common.api.Api.Client zag(GoogleApiManager$zaa googleapimanager$zaa)
	{
		return googleapimanager$zaa.zain;
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
		((zal) (GoogleApiManager.zaf(zail))).zab(connectionresult, zais);
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
	//   18   46:invokestatic    #126 <Method android.content.Context GoogleApiManager.zab(GoogleApiManager)>
	//   19   49:aload_0         
	//   20   50:getfield        #91  <Field com.google.android.gms.common.api.Api$Client zain>
	//   21   53:invokevirtual   #457 <Method int GoogleApiAvailabilityCache.getClientAvailability(android.content.Context, com.google.android.gms.common.api.Api$Client)>
	//   22   56:istore_1        
			if(i != 0)
	//*  23   57:iload_1         
	//*  24   58:ifeq            75
			{
				onConnectionFailed(new ConnectionResult(i, ((android.app.PendingIntent) (null))));
	//   25   61:aload_0         
	//   26   62:new             #302 <Class ConnectionResult>
	//   27   65:dup             
	//   28   66:iload_1         
	//   29   67:aconst_null     
	//   30   68:invokespecial   #305 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   31   71:invokevirtual   #460 <Method void onConnectionFailed(ConnectionResult)>
				return;
	//   32   74:return          
			}
			GoogleApiManager$zac googleapimanager$zac = new GoogleApiManager$zac(zail, zain, zafp);
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
				zait.zaa(((zach) (googleapimanager$zac)));
	//   47  107:aload_0         
	//   48  108:getfield        #131 <Field zace zait>
	//   49  111:aload_2         
	//   50  112:invokevirtual   #470 <Method void zace.zaa(zach)>
			zain.connect(((com.google.android.gms.common.internal.ionProgressReportCallbacks) (googleapimanager$zac)));
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

	public final void zaa(zab zab1)
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
		zab1 = ((zab) (zaiw));
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
	//*  14   32:invokestatic    #126 <Method android.content.Context GoogleApiManager.zab(GoogleApiManager)>
	//*  15   35:invokevirtual   #565 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
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
		erKey aerkey[] = (erKey[])zair.keySet().toArray(((Object []) (new erKey[zair.size()])));
	//   10   24:aload_0         
	//   11   25:getfield        #68  <Field Map zair>
	//   12   28:invokeinterface #581 <Method Set Map.keySet()>
	//   13   33:aload_0         
	//   14   34:getfield        #68  <Field Map zair>
	//   15   37:invokeinterface #404 <Method int Map.size()>
	//   16   42:anewarray       erKey[]
	//   17   45:invokeinterface #587 <Method Object[] Set.toArray(Object[])>
	//   18   50:checkcast       #589 <Class ListenerHolder$ListenerKey[]>
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
			zaa(((zab) (new zah(aerkey[i], new TaskCompletionSource()))));
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
			zain.onUserSignOut(((com.google.android.gms.common.internal.Callbacks) (new zabm(this))));
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
		for(Iterator iterator = zaim.iterator(); iterator.hasNext(); ((zab)iterator.next()).zaa(status));
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

	public GoogleApiManager$zaa(GoogleApiManager googleapimanager, GoogleApi googleapi)
	{
		zail = googleapimanager;
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
		zain = googleapi.zaa(GoogleApiManager.zaa(googleapimanager).getLooper(), this);
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
			zait = googleapi.zaa(GoogleApiManager.zab(googleapimanager), GoogleApiManager.zaa(googleapimanager));
	//   68  144:aload_0         
	//   69  145:aload_2         
	//   70  146:aload_1         
	//   71  147:invokestatic    #126 <Method android.content.Context GoogleApiManager.zab(GoogleApiManager)>
	//   72  150:aload_1         
	//   73  151:invokestatic    #78  <Method Handler GoogleApiManager.zaa(GoogleApiManager)>
	//   74  154:invokevirtual   #129 <Method zace GoogleApi.zaa(android.content.Context, Handler)>
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
