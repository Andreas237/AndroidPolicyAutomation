// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.zza;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//			WakeLockEvent, LoggingConstants

public class WakeLockTracker
{

	public WakeLockTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static WakeLockTracker getInstance()
	{
		return zzgb;
	//    0    0:getstatic       #19  <Field WakeLockTracker zzgb>
	//    1    3:areturn         
	}

	public void registerAcquireEvent(Context context, Intent intent, String s, String s1, String s2, int i, String s3)
	{
		s3 = ((String) (Arrays.asList(((Object []) (new String[] {
			s3
		})))));
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload           7
	//    5    8:aastore         
	//    6    9:invokestatic    #36  <Method List Arrays.asList(Object[])>
	//    7   12:astore          7
		registerEvent(context, intent.getStringExtra("WAKE_LOCK_KEY"), 7, s, s1, s2, i, ((List) (s3)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:ldc1            #38  <String "WAKE_LOCK_KEY">
	//   12   19:invokevirtual   #44  <Method String Intent.getStringExtra(String)>
	//   13   22:bipush          7
	//   14   24:aload_3         
	//   15   25:aload           4
	//   16   27:aload           5
	//   17   29:iload           6
	//   18   31:aload           7
	//   19   33:invokevirtual   #48  <Method void registerEvent(Context, String, int, String, String, String, int, List)>
	//   20   36:return          
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
	//   10   15:invokevirtual   #51  <Method void registerEvent(Context, String, int, String, String, String, int, List, long)>
	//   11   18:return          
	}

	public void registerEvent(Context context, String s, int i, String s1, String s2, String s3, int j, 
			List list, long l)
	{
		Object obj = ((Object) (list));
	//    0    0:aload           8
	//    1    2:astore          16
		if(zzgc == null)
	//*   2    4:getstatic       #57  <Field Boolean zzgc>
	//*   3    7:ifnonnull       17
			zzgc = Boolean.valueOf(false);
	//    4   10:iconst_0        
	//    5   11:invokestatic    #63  <Method Boolean Boolean.valueOf(boolean)>
	//    6   14:putstatic       #57  <Field Boolean zzgc>
		if(!zzgc.booleanValue())
	//*   7   17:getstatic       #57  <Field Boolean zzgc>
	//*   8   20:invokevirtual   #67  <Method boolean Boolean.booleanValue()>
	//*   9   23:ifne            27
			return;
	//   10   26:return          
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  11   27:aload_2         
	//*  12   28:invokestatic    #73  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   31:ifeq            74
		{
			context = ((Context) (String.valueOf(((Object) (s)))));
	//   14   34:aload_2         
	//   15   35:invokestatic    #76  <Method String String.valueOf(Object)>
	//   16   38:astore_1        
			if(((String) (context)).length() != 0)
	//*  17   39:aload_1         
	//*  18   40:invokevirtual   #80  <Method int String.length()>
	//*  19   43:ifeq            56
				context = ((Context) ("missing wakeLock key. ".concat(((String) (context)))));
	//   20   46:ldc1            #82  <String "missing wakeLock key. ">
	//   21   48:aload_1         
	//   22   49:invokevirtual   #85  <Method String String.concat(String)>
	//   23   52:astore_1        
			else
	//*  24   53:goto            66
				context = ((Context) (new String("missing wakeLock key. ")));
	//   25   56:new             #30  <Class String>
	//   26   59:dup             
	//   27   60:ldc1            #82  <String "missing wakeLock key. ">
	//   28   62:invokespecial   #88  <Method void String(String)>
	//   29   65:astore_1        
			Log.e("WakeLockTracker", ((String) (context)));
	//   30   66:ldc1            #90  <String "WakeLockTracker">
	//   31   68:aload_1         
	//   32   69:invokestatic    #96  <Method int Log.e(String, String)>
	//   33   72:pop             
			return;
	//   34   73:return          
		}
		if(7 == i || 8 == i || 10 == i || 11 == i)
	//*  35   74:bipush          7
	//*  36   76:iload_3         
	//*  37   77:icmpeq          98
	//*  38   80:bipush          8
	//*  39   82:iload_3         
	//*  40   83:icmpeq          98
	//*  41   86:bipush          10
	//*  42   88:iload_3         
	//*  43   89:icmpeq          98
	//*  44   92:bipush          11
	//*  45   94:iload_3         
	//*  46   95:icmpne          249
		{
			long l1 = System.currentTimeMillis();
	//   47   98:invokestatic    #102 <Method long System.currentTimeMillis()>
	//   48  101:lstore          12
			if(obj != null && list.size() == 1)
	//*  49  103:aload           16
	//*  50  105:ifnull          145
	//*  51  108:aload           8
	//*  52  110:invokeinterface #107 <Method int List.size()>
	//*  53  115:iconst_1        
	//*  54  116:icmpne          145
			{
				list = ((List) (obj));
	//   55  119:aload           16
	//   56  121:astore          8
				if("com.google.android.gms".equals(((List) (obj)).get(0)))
	//*  57  123:ldc1            #109 <String "com.google.android.gms">
	//*  58  125:aload           16
	//*  59  127:iconst_0        
	//*  60  128:invokeinterface #113 <Method Object List.get(int)>
	//*  61  133:invokevirtual   #117 <Method boolean String.equals(Object)>
	//*  62  136:ifeq            142
					list = null;
	//   63  139:aconst_null     
	//   64  140:astore          8
			} else
	//*  65  142:goto            149
			{
				list = ((List) (obj));
	//   66  145:aload           16
	//   67  147:astore          8
			}
			long l2 = SystemClock.elapsedRealtime();
	//   68  149:invokestatic    #122 <Method long SystemClock.elapsedRealtime()>
	//   69  152:lstore          14
			int k = zza.zzg(context);
	//   70  154:aload_1         
	//   71  155:invokestatic    #128 <Method int zza.zzg(Context)>
	//   72  158:istore          11
			obj = ((Object) (context.getPackageName()));
	//   73  160:aload_1         
	//   74  161:invokevirtual   #134 <Method String Context.getPackageName()>
	//   75  164:astore          16
			if("com.google.android.gms".equals(obj))
	//*  76  166:ldc1            #109 <String "com.google.android.gms">
	//*  77  168:aload           16
	//*  78  170:invokevirtual   #117 <Method boolean String.equals(Object)>
	//*  79  173:ifeq            182
				obj = null;
	//   80  176:aconst_null     
	//   81  177:astore          16
	//*  82  179:goto            182
			s = ((String) (new WakeLockEvent(l1, i, s1, j, list, s, l2, k, s2, ((String) (obj)), zza.zzh(context), l, s3)));
	//   83  182:new             #136 <Class WakeLockEvent>
	//   84  185:dup             
	//   85  186:lload           12
	//   86  188:iload_3         
	//   87  189:aload           4
	//   88  191:iload           7
	//   89  193:aload           8
	//   90  195:aload_2         
	//   91  196:lload           14
	//   92  198:iload           11
	//   93  200:aload           5
	//   94  202:aload           16
	//   95  204:aload_1         
	//   96  205:invokestatic    #140 <Method float zza.zzh(Context)>
	//   97  208:lload           9
	//   98  210:aload           6
	//   99  212:invokespecial   #143 <Method void WakeLockEvent(long, int, String, int, List, String, long, int, String, String, float, long, String)>
	//  100  215:astore_2        
			try
			{
				context.startService((new Intent()).setComponent(LoggingConstants.zzfg).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", ((android.os.Parcelable) (s))));
	//  101  216:aload_1         
	//  102  217:new             #40  <Class Intent>
	//  103  220:dup             
	//  104  221:invokespecial   #144 <Method void Intent()>
	//  105  224:getstatic       #150 <Field android.content.ComponentName LoggingConstants.zzfg>
	//  106  227:invokevirtual   #154 <Method Intent Intent.setComponent(android.content.ComponentName)>
	//  107  230:ldc1            #156 <String "com.google.android.gms.common.stats.EXTRA_LOG_EVENT">
	//  108  232:aload_2         
	//  109  233:invokevirtual   #160 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//  110  236:invokevirtual   #164 <Method android.content.ComponentName Context.startService(Intent)>
	//  111  239:pop             
				return;
	//  112  240:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 113  241:astore_1        
			{
				Log.wtf("WakeLockTracker", ((Throwable) (context)));
	//  114  242:ldc1            #90  <String "WakeLockTracker">
	//  115  244:aload_1         
	//  116  245:invokestatic    #168 <Method int Log.wtf(String, Throwable)>
	//  117  248:pop             
			}
		}
	//  118  249:return          
	}

	public void registerReleaseEvent(Context context, Intent intent)
	{
		registerEvent(context, intent.getStringExtra("WAKE_LOCK_KEY"), 8, ((String) (null)), ((String) (null)), ((String) (null)), 0, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #38  <String "WAKE_LOCK_KEY">
	//    4    5:invokevirtual   #44  <Method String Intent.getStringExtra(String)>
	//    5    8:bipush          8
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:iconst_0        
	//   10   14:aconst_null     
	//   11   15:invokevirtual   #48  <Method void registerEvent(Context, String, int, String, String, String, int, List)>
	//   12   18:return          
	}

	private static WakeLockTracker zzgb = new WakeLockTracker();
	private static Boolean zzgc;
	private static boolean zzgd = false;

	static 
	{
	//    0    0:new             #2   <Class WakeLockTracker>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void WakeLockTracker()>
	//    3    7:putstatic       #19  <Field WakeLockTracker zzgb>
	//    4   10:iconst_0        
	//    5   11:putstatic       #21  <Field boolean zzgd>
	//*   6   14:return          
	}
}
