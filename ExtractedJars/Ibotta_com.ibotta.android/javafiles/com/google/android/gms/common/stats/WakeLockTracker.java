// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.content.*;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.DeviceStateUtils;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//			WakeLockEvent, LoggingConstants, StatsUtils

public class WakeLockTracker
{

	public WakeLockTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static WakeLockTracker getInstance()
	{
		return zzyz;
	//    0    0:getstatic       #18  <Field WakeLockTracker zzyz>
	//    1    3:areturn         
	}

	public void registerAcquireEvent(Context context, Intent intent, String s, String s1, String s2, int i, String s3)
	{
		registerAcquireEvent(context, intent, s, s1, s2, i, Arrays.asList(((Object []) (new String[] {
			s3
		}))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:iconst_1        
	//    8   11:anewarray       String[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:aload           7
	//   12   18:aastore         
	//   13   19:invokestatic    #34  <Method List Arrays.asList(Object[])>
	//   14   22:invokevirtual   #37  <Method void registerAcquireEvent(Context, Intent, String, String, String, int, List)>
	//   15   25:return          
	}

	public void registerAcquireEvent(Context context, Intent intent, String s, String s1, String s2, int i, List list)
	{
		registerEvent(context, intent.getStringExtra("WAKE_LOCK_KEY"), 7, s, s1, s2, i, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #39  <String "WAKE_LOCK_KEY">
	//    4    5:invokevirtual   #45  <Method String Intent.getStringExtra(String)>
	//    5    8:bipush          7
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:iload           6
	//   10   17:aload           7
	//   11   19:invokevirtual   #49  <Method void registerEvent(Context, String, int, String, String, String, int, List)>
	//   12   22:return          
	}

	public void registerEvent(Context context, String s, int i, String s1, String s2, String s3, int j, 
			List list)
	{
		registerEvent(context, s, i, s1, s2, s3, j, list, 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:aload           8
	//    9   14:lconst_0        
	//   10   15:invokevirtual   #54  <Method void registerEvent(Context, String, int, String, String, String, int, List, long)>
	//   11   18:return          
	}

	public void registerEvent(Context context, String s, int i, String s1, String s2, String s3, int j, 
			List list, long l)
	{
		List list2 = list;
	//    0    0:aload           8
	//    1    2:astore          17
		if(zzza == null)
	//*   2    4:getstatic       #59  <Field Boolean zzza>
	//*   3    7:ifnonnull       17
			zzza = Boolean.valueOf(false);
	//    4   10:iconst_0        
	//    5   11:invokestatic    #65  <Method Boolean Boolean.valueOf(boolean)>
	//    6   14:putstatic       #59  <Field Boolean zzza>
		if(!zzza.booleanValue())
	//*   7   17:getstatic       #59  <Field Boolean zzza>
	//*   8   20:invokevirtual   #69  <Method boolean Boolean.booleanValue()>
	//*   9   23:ifne            27
			return;
	//   10   26:return          
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  11   27:aload_2         
	//*  12   28:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   31:ifeq            74
		{
			context = ((Context) (String.valueOf(((Object) (s)))));
	//   14   34:aload_2         
	//   15   35:invokestatic    #78  <Method String String.valueOf(Object)>
	//   16   38:astore_1        
			if(((String) (context)).length() != 0)
	//*  17   39:aload_1         
	//*  18   40:invokevirtual   #82  <Method int String.length()>
	//*  19   43:ifeq            56
				context = ((Context) ("missing wakeLock key. ".concat(((String) (context)))));
	//   20   46:ldc1            #84  <String "missing wakeLock key. ">
	//   21   48:aload_1         
	//   22   49:invokevirtual   #87  <Method String String.concat(String)>
	//   23   52:astore_1        
			else
	//*  24   53:goto            66
				context = ((Context) (new String("missing wakeLock key. ")));
	//   25   56:new             #28  <Class String>
	//   26   59:dup             
	//   27   60:ldc1            #84  <String "missing wakeLock key. ">
	//   28   62:invokespecial   #90  <Method void String(String)>
	//   29   65:astore_1        
			Log.e("WakeLockTracker", ((String) (context)));
	//   30   66:ldc1            #92  <String "WakeLockTracker">
	//   31   68:aload_1         
	//   32   69:invokestatic    #98  <Method int Log.e(String, String)>
	//   33   72:pop             
			return;
	//   34   73:return          
		}
		long l1 = System.currentTimeMillis();
	//   35   74:invokestatic    #104 <Method long System.currentTimeMillis()>
	//   36   77:lstore          12
		if(7 == i || 8 == i || 10 == i || 11 == i)
	//*  37   79:bipush          7
	//*  38   81:iload_3         
	//*  39   82:icmpeq          103
	//*  40   85:bipush          8
	//*  41   87:iload_3         
	//*  42   88:icmpeq          103
	//*  43   91:bipush          10
	//*  44   93:iload_3         
	//*  45   94:icmpeq          103
	//*  46   97:bipush          11
	//*  47   99:iload_3         
	//*  48  100:icmpne          250
		{
			List list1 = list2;
	//   49  103:aload           17
	//   50  105:astore          16
			if(list2 != null)
	//*  51  107:aload           17
	//*  52  109:ifnull          150
			{
				list1 = list2;
	//   53  112:aload           17
	//   54  114:astore          16
				if(list.size() == 1)
	//*  55  116:aload           8
	//*  56  118:invokeinterface #109 <Method int List.size()>
	//*  57  123:iconst_1        
	//*  58  124:icmpne          150
				{
					list1 = list2;
	//   59  127:aload           17
	//   60  129:astore          16
					if("com.google.android.gms".equals(list2.get(0)))
	//*  61  131:ldc1            #111 <String "com.google.android.gms">
	//*  62  133:aload           17
	//*  63  135:iconst_0        
	//*  64  136:invokeinterface #115 <Method Object List.get(int)>
	//*  65  141:invokevirtual   #119 <Method boolean String.equals(Object)>
	//*  66  144:ifeq            150
						list1 = null;
	//   67  147:aconst_null     
	//   68  148:astore          16
				}
			}
			long l2 = SystemClock.elapsedRealtime();
	//   69  150:invokestatic    #124 <Method long SystemClock.elapsedRealtime()>
	//   70  153:lstore          14
			int k = DeviceStateUtils.getDeviceState(context);
	//   71  155:aload_1         
	//   72  156:invokestatic    #130 <Method int DeviceStateUtils.getDeviceState(Context)>
	//   73  159:istore          11
			list = ((List) (context.getPackageName()));
	//   74  161:aload_1         
	//   75  162:invokevirtual   #136 <Method String Context.getPackageName()>
	//   76  165:astore          8
			if("com.google.android.gms".equals(((Object) (list))))
	//*  77  167:ldc1            #111 <String "com.google.android.gms">
	//*  78  169:aload           8
	//*  79  171:invokevirtual   #119 <Method boolean String.equals(Object)>
	//*  80  174:ifeq            183
				list = null;
	//   81  177:aconst_null     
	//   82  178:astore          8
	//*  83  180:goto            183
			s = ((String) (new WakeLockEvent(l1, i, s1, j, list1, s, l2, k, s2, ((String) (list)), DeviceStateUtils.getPowerPercentage(context), l, s3)));
	//   84  183:new             #138 <Class WakeLockEvent>
	//   85  186:dup             
	//   86  187:lload           12
	//   87  189:iload_3         
	//   88  190:aload           4
	//   89  192:iload           7
	//   90  194:aload           16
	//   91  196:aload_2         
	//   92  197:lload           14
	//   93  199:iload           11
	//   94  201:aload           5
	//   95  203:aload           8
	//   96  205:aload_1         
	//   97  206:invokestatic    #142 <Method float DeviceStateUtils.getPowerPercentage(Context)>
	//   98  209:lload           9
	//   99  211:aload           6
	//  100  213:invokespecial   #145 <Method void WakeLockEvent(long, int, String, int, List, String, long, int, String, String, float, long, String)>
	//  101  216:astore_2        
			try
			{
				context.startService((new Intent()).setComponent(LoggingConstants.STATS_SERVICE_COMPONENT_NAME).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", ((android.os.Parcelable) (s))));
	//  102  217:aload_1         
	//  103  218:new             #41  <Class Intent>
	//  104  221:dup             
	//  105  222:invokespecial   #146 <Method void Intent()>
	//  106  225:getstatic       #152 <Field android.content.ComponentName LoggingConstants.STATS_SERVICE_COMPONENT_NAME>
	//  107  228:invokevirtual   #156 <Method Intent Intent.setComponent(android.content.ComponentName)>
	//  108  231:ldc1            #158 <String "com.google.android.gms.common.stats.EXTRA_LOG_EVENT">
	//  109  233:aload_2         
	//  110  234:invokevirtual   #162 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//  111  237:invokevirtual   #166 <Method android.content.ComponentName Context.startService(Intent)>
	//  112  240:pop             
				return;
	//  113  241:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 114  242:astore_1        
			{
				Log.wtf("WakeLockTracker", ((Throwable) (context)));
	//  115  243:ldc1            #92  <String "WakeLockTracker">
	//  116  245:aload_1         
	//  117  246:invokestatic    #170 <Method int Log.wtf(String, Throwable)>
	//  118  249:pop             
			}
		}
	//  119  250:return          
	}

	public void registerReleaseEvent(Context context, Intent intent)
	{
		registerEvent(context, intent.getStringExtra("WAKE_LOCK_KEY"), 8, ((String) (null)), ((String) (null)), ((String) (null)), 0, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #39  <String "WAKE_LOCK_KEY">
	//    4    5:invokevirtual   #45  <Method String Intent.getStringExtra(String)>
	//    5    8:bipush          8
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:iconst_0        
	//   10   14:aconst_null     
	//   11   15:invokevirtual   #49  <Method void registerEvent(Context, String, int, String, String, String, int, List)>
	//   12   18:return          
	}

	public void registerSyncEnd(Context context, AbstractThreadedSyncAdapter abstractthreadedsyncadapter, String s, String s1, boolean flag)
	{
		registerEvent(context, StatsUtils.getEventKey(abstractthreadedsyncadapter, s), 11, s, s1, ((String) (null)), 0, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #181 <Method String StatsUtils.getEventKey(AbstractThreadedSyncAdapter, String)>
	//    5    7:bipush          11
	//    6    9:aload_3         
	//    7   10:aload           4
	//    8   12:aconst_null     
	//    9   13:iconst_0        
	//   10   14:aconst_null     
	//   11   15:invokevirtual   #49  <Method void registerEvent(Context, String, int, String, String, String, int, List)>
	//   12   18:return          
	}

	public void registerSyncStart(Context context, AbstractThreadedSyncAdapter abstractthreadedsyncadapter, String s, String s1)
	{
		registerEvent(context, StatsUtils.getEventKey(abstractthreadedsyncadapter, s), 10, s, s1, ((String) (null)), 0, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #181 <Method String StatsUtils.getEventKey(AbstractThreadedSyncAdapter, String)>
	//    5    7:bipush          10
	//    6    9:aload_3         
	//    7   10:aload           4
	//    8   12:aconst_null     
	//    9   13:iconst_0        
	//   10   14:aconst_null     
	//   11   15:invokevirtual   #49  <Method void registerEvent(Context, String, int, String, String, String, int, List)>
	//   12   18:return          
	}

	private static boolean zzyh = false;
	private static WakeLockTracker zzyz = new WakeLockTracker();
	private static Boolean zzza;

	static 
	{
	//    0    0:new             #2   <Class WakeLockTracker>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void WakeLockTracker()>
	//    3    7:putstatic       #18  <Field WakeLockTracker zzyz>
	//    4   10:iconst_0        
	//    5   11:putstatic       #20  <Field boolean zzyh>
	//*   6   14:return          
	}
}
