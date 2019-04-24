// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.analytics:
//			ExceptionReporter, GoogleAnalytics, zzp, zzk

public class Tracker extends zzau
{
	final class zza extends zzau
		implements GoogleAnalytics.zza
	{

		private final void zzai()
		{
			if(zzto < 0L && !zztm)
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field long zzto>
		//*   2    4:lconst_0        
		//*   3    5:lcmp            
		//*   4    6:ifge            34
		//*   5    9:aload_0         
		//*   6   10:getfield        #35  <Field boolean zztm>
		//*   7   13:ifeq            19
		//*   8   16:goto            34
			{
				((zzat)this).zzcb().zzb(((GoogleAnalytics.zza) (Tracker.zza(zztl))));
		//    9   19:aload_0         
		//   10   20:invokevirtual   #41  <Method GoogleAnalytics zzat.zzcb()>
		//   11   23:aload_0         
		//   12   24:getfield        #23  <Field Tracker zztl>
		//   13   27:invokestatic    #44  <Method Tracker$zza Tracker.zza(Tracker)>
		//   14   30:invokevirtual   #50  <Method void GoogleAnalytics.zzb(GoogleAnalytics$zza)>
				return;
		//   15   33:return          
			} else
			{
				((zzat)this).zzcb().zza(((GoogleAnalytics.zza) (Tracker.zza(zztl))));
		//   16   34:aload_0         
		//   17   35:invokevirtual   #41  <Method GoogleAnalytics zzat.zzcb()>
		//   18   38:aload_0         
		//   19   39:getfield        #23  <Field Tracker zztl>
		//   20   42:invokestatic    #44  <Method Tracker$zza Tracker.zza(Tracker)>
		//   21   45:invokevirtual   #52  <Method void GoogleAnalytics.zza(GoogleAnalytics$zza)>
				return;
		//   22   48:return          
			}
		}

		public final void enableAutoActivityTracking(boolean flag)
		{
			zztm = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #35  <Field boolean zztm>
			zzai();
		//    3    5:aload_0         
		//    4    6:invokespecial   #56  <Method void zzai()>
		//    5    9:return          
		}

		public final void setSessionTimeout(long l)
		{
			zzto = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #30  <Field long zzto>
			zzai();
		//    3    5:aload_0         
		//    4    6:invokespecial   #56  <Method void zzai()>
		//    5    9:return          
		}

		protected final void zzag()
		{
		//    0    0:return          
		}

		public final boolean zzah()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			boolean flag;
			flag = zztp;
		//    2    2:aload_0         
		//    3    3:getfield        #63  <Field boolean zztp>
		//    4    6:istore_1        
			zztp = false;
		//    5    7:aload_0         
		//    6    8:iconst_0        
		//    7    9:putfield        #63  <Field boolean zztp>
			this;
		//    8   12:aload_0         
			JVM INSTR monitorexit ;
		//    9   13:monitorexit     
			return flag;
		//   10   14:iload_1         
		//   11   15:ireturn         
			Exception exception;
			exception;
		//   12   16:astore_2        
		//*  13   17:aload_0         
			throw exception;
		//   14   18:monitorexit     
		//   15   19:aload_2         
		//   16   20:athrow          
		}

		public final void zzc(Activity activity)
		{
			if(zztn == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #67  <Field int zztn>
		//*   2    4:ifne            51
			{
				boolean flag;
				if(((zzat)this).zzbx().elapsedRealtime() >= zztq + Math.max(1000L, zzto))
		//*   3    7:aload_0         
		//*   4    8:invokevirtual   #71  <Method Clock zzat.zzbx()>
		//*   5   11:invokeinterface #77  <Method long Clock.elapsedRealtime()>
		//*   6   16:aload_0         
		//*   7   17:getfield        #79  <Field long zztq>
		//*   8   20:ldc2w           #80  <Long 1000L>
		//*   9   23:aload_0         
		//*  10   24:getfield        #30  <Field long zzto>
		//*  11   27:invokestatic    #87  <Method long Math.max(long, long)>
		//*  12   30:ladd            
		//*  13   31:lcmp            
		//*  14   32:iflt            40
					flag = true;
		//   15   35:iconst_1        
		//   16   36:istore_2        
				else
		//*  17   37:goto            42
					flag = false;
		//   18   40:iconst_0        
		//   19   41:istore_2        
				if(flag)
		//*  20   42:iload_2         
		//*  21   43:ifeq            51
					zztp = true;
		//   22   46:aload_0         
		//   23   47:iconst_1        
		//   24   48:putfield        #63  <Field boolean zztp>
			}
			zztn = zztn + 1;
		//   25   51:aload_0         
		//   26   52:aload_0         
		//   27   53:getfield        #67  <Field int zztn>
		//   28   56:iconst_1        
		//   29   57:iadd            
		//   30   58:putfield        #67  <Field int zztn>
			if(zztm)
		//*  31   61:aload_0         
		//*  32   62:getfield        #35  <Field boolean zztm>
		//*  33   65:ifeq            268
			{
				Object obj = ((Object) (activity.getIntent()));
		//   34   68:aload_1         
		//   35   69:invokevirtual   #93  <Method Intent Activity.getIntent()>
		//   36   72:astore_3        
				if(obj != null)
		//*  37   73:aload_3         
		//*  38   74:ifnull          88
					zztl.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
		//   39   77:aload_0         
		//   40   78:getfield        #23  <Field Tracker zztl>
		//   41   81:aload_3         
		//   42   82:invokevirtual   #99  <Method Uri Intent.getData()>
		//   43   85:invokevirtual   #103 <Method void Tracker.setCampaignParamsOnNextHit(Uri)>
				HashMap hashmap = new HashMap();
		//   44   88:new             #105 <Class HashMap>
		//   45   91:dup             
		//   46   92:invokespecial   #107 <Method void HashMap()>
		//   47   95:astore          5
				((Map) (hashmap)).put("&t", "screenview");
		//   48   97:aload           5
		//   49   99:ldc1            #109 <String "&t">
		//   50  101:ldc1            #111 <String "screenview">
		//   51  103:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//   52  108:pop             
				Tracker tracker = zztl;
		//   53  109:aload_0         
		//   54  110:getfield        #23  <Field Tracker zztl>
		//   55  113:astore          6
				if(Tracker.zzk(zztl) != null)
		//*  56  115:aload_0         
		//*  57  116:getfield        #23  <Field Tracker zztl>
		//*  58  119:invokestatic    #121 <Method zzdf Tracker.zzk(Tracker)>
		//*  59  122:ifnull          169
				{
					Object obj2 = ((Object) (Tracker.zzk(zztl)));
		//   60  125:aload_0         
		//   61  126:getfield        #23  <Field Tracker zztl>
		//   62  129:invokestatic    #121 <Method zzdf Tracker.zzk(Tracker)>
		//   63  132:astore          4
					obj = ((Object) (((Object) (activity)).getClass().getCanonicalName()));
		//   64  134:aload_1         
		//   65  135:invokevirtual   #127 <Method Class Object.getClass()>
		//   66  138:invokevirtual   #133 <Method String Class.getCanonicalName()>
		//   67  141:astore_3        
					obj2 = ((Object) ((String)((zzdf) (obj2)).zzaco.get(obj)));
		//   68  142:aload           4
		//   69  144:getfield        #139 <Field Map zzdf.zzaco>
		//   70  147:aload_3         
		//   71  148:invokeinterface #143 <Method Object Map.get(Object)>
		//   72  153:checkcast       #145 <Class String>
		//   73  156:astore          4
					if(obj2 != null)
		//*  74  158:aload           4
		//*  75  160:ifnull          177
						obj = obj2;
		//   76  163:aload           4
		//   77  165:astore_3        
				} else
		//*  78  166:goto            177
				{
					obj = ((Object) (((Object) (activity)).getClass().getCanonicalName()));
		//   79  169:aload_1         
		//   80  170:invokevirtual   #127 <Method Class Object.getClass()>
		//   81  173:invokevirtual   #133 <Method String Class.getCanonicalName()>
		//   82  176:astore_3        
				}
				tracker.set("&cd", ((String) (obj)));
		//   83  177:aload           6
		//   84  179:ldc1            #147 <String "&cd">
		//   85  181:aload_3         
		//   86  182:invokevirtual   #151 <Method void Tracker.set(String, String)>
				if(TextUtils.isEmpty((CharSequence)((Map) (hashmap)).get("&dr")))
		//*  87  185:aload           5
		//*  88  187:ldc1            #153 <String "&dr">
		//*  89  189:invokeinterface #143 <Method Object Map.get(Object)>
		//*  90  194:checkcast       #155 <Class CharSequence>
		//*  91  197:invokestatic    #161 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  92  200:ifeq            259
				{
					Preconditions.checkNotNull(((Object) (activity)));
		//   93  203:aload_1         
		//   94  204:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object)>
		//   95  207:pop             
					Object obj1 = ((Object) (activity.getIntent()));
		//   96  208:aload_1         
		//   97  209:invokevirtual   #93  <Method Intent Activity.getIntent()>
		//   98  212:astore_3        
					activity = null;
		//   99  213:aconst_null     
		//  100  214:astore_1        
					if(obj1 != null)
		//* 101  215:aload_3         
		//* 102  216:ifnonnull       222
		//* 103  219:goto            241
					{
						obj1 = ((Object) (((Intent) (obj1)).getStringExtra("android.intent.extra.REFERRER_NAME")));
		//  104  222:aload_3         
		//  105  223:ldc1            #168 <String "android.intent.extra.REFERRER_NAME">
		//  106  225:invokevirtual   #172 <Method String Intent.getStringExtra(String)>
		//  107  228:astore_3        
						if(!TextUtils.isEmpty(((CharSequence) (obj1))))
		//* 108  229:aload_3         
		//* 109  230:invokestatic    #161 <Method boolean TextUtils.isEmpty(CharSequence)>
		//* 110  233:ifeq            239
		//* 111  236:goto            241
							activity = ((Activity) (obj1));
		//  112  239:aload_3         
		//  113  240:astore_1        
					}
					if(!TextUtils.isEmpty(((CharSequence) (activity))))
		//* 114  241:aload_1         
		//* 115  242:invokestatic    #161 <Method boolean TextUtils.isEmpty(CharSequence)>
		//* 116  245:ifne            259
						((Map) (hashmap)).put("&dr", ((Object) (activity)));
		//  117  248:aload           5
		//  118  250:ldc1            #153 <String "&dr">
		//  119  252:aload_1         
		//  120  253:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  121  258:pop             
				}
				zztl.send(((Map) (hashmap)));
		//  122  259:aload_0         
		//  123  260:getfield        #23  <Field Tracker zztl>
		//  124  263:aload           5
		//  125  265:invokevirtual   #176 <Method void Tracker.send(Map)>
			}
		//  126  268:return          
		}

		public final void zzd(Activity activity)
		{
			zztn = zztn - 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #67  <Field int zztn>
		//    3    5:iconst_1        
		//    4    6:isub            
		//    5    7:putfield        #67  <Field int zztn>
			zztn = Math.max(0, zztn);
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:aload_0         
		//    9   13:getfield        #67  <Field int zztn>
		//   10   16:invokestatic    #180 <Method int Math.max(int, int)>
		//   11   19:putfield        #67  <Field int zztn>
			if(zztn == 0)
		//*  12   22:aload_0         
		//*  13   23:getfield        #67  <Field int zztn>
		//*  14   26:ifne            42
				zztq = ((zzat)this).zzbx().elapsedRealtime();
		//   15   29:aload_0         
		//   16   30:aload_0         
		//   17   31:invokevirtual   #71  <Method Clock zzat.zzbx()>
		//   18   34:invokeinterface #77  <Method long Clock.elapsedRealtime()>
		//   19   39:putfield        #79  <Field long zztq>
		//   20   42:return          
		}

		private final Tracker zztl;
		private boolean zztm;
		private int zztn;
		private long zzto;
		private boolean zztp;
		private long zztq;

		protected zza(zzaw zzaw)
		{
			zztl = Tracker.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field Tracker zztl>
			super(zzaw);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #26  <Method void zzau(zzaw)>
			zzto = -1L;
		//    6   10:aload_0         
		//    7   11:ldc2w           #27  <Long -1L>
		//    8   14:putfield        #30  <Field long zzto>
		//    9   17:return          
		}
	}


	Tracker(zzaw zzaw, String s, zzcn zzcn1)
	{
		super(zzaw);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void zzau(zzaw)>
	//    3    5:aload_0         
	//    4    6:new             #29  <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #32  <Method void HashMap()>
	//    7   13:putfield        #34  <Field Map zzsy>
	//    8   16:aload_0         
	//    9   17:new             #29  <Class HashMap>
	//   10   20:dup             
	//   11   21:invokespecial   #32  <Method void HashMap()>
	//   12   24:putfield        #36  <Field Map zzsz>
		if(s != null)
	//*  13   27:aload_2         
	//*  14   28:ifnull          44
			zzsy.put("&tid", ((Object) (s)));
	//   15   31:aload_0         
	//   16   32:getfield        #34  <Field Map zzsy>
	//   17   35:ldc1            #38  <String "&tid">
	//   18   37:aload_2         
	//   19   38:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   20   43:pop             
		zzsy.put("useSecure", "1");
	//   21   44:aload_0         
	//   22   45:getfield        #34  <Field Map zzsy>
	//   23   48:ldc1            #46  <String "useSecure">
	//   24   50:ldc1            #48  <String "1">
	//   25   52:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   26   57:pop             
		zzsy.put("&a", ((Object) (Integer.toString((new Random()).nextInt(0x7fffffff) + 1))));
	//   27   58:aload_0         
	//   28   59:getfield        #34  <Field Map zzsy>
	//   29   62:ldc1            #50  <String "&a">
	//   30   64:new             #52  <Class Random>
	//   31   67:dup             
	//   32   68:invokespecial   #53  <Method void Random()>
	//   33   71:ldc1            #54  <Int 0x7fffffff>
	//   34   73:invokevirtual   #58  <Method int Random.nextInt(int)>
	//   35   76:iconst_1        
	//   36   77:iadd            
	//   37   78:invokestatic    #64  <Method String Integer.toString(int)>
	//   38   81:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   39   86:pop             
	//   40   87:aload_0         
	//   41   88:new             #66  <Class zzcn>
	//   42   91:dup             
	//   43   92:ldc1            #68  <String "tracking">
	//   44   94:aload_0         
	//   45   95:invokevirtual   #74  <Method Clock zzat.zzbx()>
	//   46   98:invokespecial   #77  <Method void zzcn(String, Clock)>
	//   47  101:putfield        #79  <Field zzcn zzta>
		zztb = new zza(zzaw);
	//   48  104:aload_0         
	//   49  105:new             #6   <Class Tracker$zza>
	//   50  108:dup             
	//   51  109:aload_0         
	//   52  110:aload_1         
	//   53  111:invokespecial   #82  <Method void Tracker$zza(Tracker, zzaw)>
	//   54  114:putfield        #84  <Field Tracker$zza zztb>
	//   55  117:return          
	}

	static zza zza(Tracker tracker)
	{
		return tracker.zztb;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Tracker$zza zztb>
	//    2    4:areturn         
	}

	private static String zza(java.util.Map.Entry entry)
	{
		String s = (String)entry.getKey();
	//    0    0:aload_0         
	//    1    1:invokeinterface #93  <Method Object java.util.Map$Entry.getKey()>
	//    2    6:checkcast       #95  <Class String>
	//    3    9:astore_2        
		boolean flag;
		if(s.startsWith("&") && s.length() >= 2)
	//*   4   10:aload_2         
	//*   5   11:ldc1            #97  <String "&">
	//*   6   13:invokevirtual   #101 <Method boolean String.startsWith(String)>
	//*   7   16:ifeq            35
	//*   8   19:aload_2         
	//*   9   20:invokevirtual   #105 <Method int String.length()>
	//*  10   23:iconst_2        
	//*  11   24:icmpge          30
	//*  12   27:goto            35
			flag = true;
	//   13   30:iconst_1        
	//   14   31:istore_1        
		else
	//*  15   32:goto            37
			flag = false;
	//   16   35:iconst_0        
	//   17   36:istore_1        
		if(!flag)
	//*  18   37:iload_1         
	//*  19   38:ifne            43
			return null;
	//   20   41:aconst_null     
	//   21   42:areturn         
		else
			return ((String)entry.getKey()).substring(1);
	//   22   43:aload_0         
	//   23   44:invokeinterface #93  <Method Object java.util.Map$Entry.getKey()>
	//   24   49:checkcast       #95  <Class String>
	//   25   52:iconst_1        
	//   26   53:invokevirtual   #108 <Method String String.substring(int)>
	//   27   56:areturn         
	}

	private static void zza(Map map, Map map1)
	{
		Preconditions.checkNotNull(((Object) (map1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #117 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		if(map == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		map = ((Map) (map.entrySet().iterator()));
	//    6   10:aload_0         
	//    7   11:invokeinterface #121 <Method Set Map.entrySet()>
	//    8   16:invokeinterface #127 <Method Iterator Set.iterator()>
	//    9   21:astore_0        
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//   10   22:aload_0         
	//   11   23:invokeinterface #133 <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            70
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   13   31:aload_0         
	//   14   32:invokeinterface #136 <Method Object Iterator.next()>
	//   15   37:checkcast       #89  <Class java.util.Map$Entry>
	//   16   40:astore_2        
			String s = zza(entry);
	//   17   41:aload_2         
	//   18   42:invokestatic    #138 <Method String zza(java.util.Map$Entry)>
	//   19   45:astore_3        
			if(s != null)
	//*  20   46:aload_3         
	//*  21   47:ifnull          22
				map1.put(((Object) (s)), ((Object) ((String)entry.getValue())));
	//   22   50:aload_1         
	//   23   51:aload_3         
	//   24   52:aload_2         
	//   25   53:invokeinterface #141 <Method Object java.util.Map$Entry.getValue()>
	//   26   58:checkcast       #95  <Class String>
	//   27   61:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   28   66:pop             
		} while(true);
	//   29   67:goto            22
	//   30   70:return          
	}

	static zzak zzb(Tracker tracker)
	{
		return ((zzat) (tracker)).zzch();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #148 <Method zzak zzat.zzch()>
	//    2    4:areturn         
	}

	static zzbh zzc(Tracker tracker)
	{
		return ((zzat) (tracker)).zzci();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method zzbh zzat.zzci()>
	//    2    4:areturn         
	}

	static zzcb zzd(Tracker tracker)
	{
		return ((zzat) (tracker)).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method zzcb zzat.zzcj()>
	//    2    4:areturn         
	}

	static zzcb zze(Tracker tracker)
	{
		return ((zzat) (tracker)).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method zzcb zzat.zzcj()>
	//    2    4:areturn         
	}

	static zzcn zzf(Tracker tracker)
	{
		return tracker.zzta;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field zzcn zzta>
	//    2    4:areturn         
	}

	static zzcp zzg(Tracker tracker)
	{
		return ((zzat) (tracker)).zzby();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method zzcp zzat.zzby()>
	//    2    4:areturn         
	}

	static zzcp zzh(Tracker tracker)
	{
		return ((zzat) (tracker)).zzby();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method zzcp zzat.zzby()>
	//    2    4:areturn         
	}

	static zzal zzi(Tracker tracker)
	{
		return ((zzat) (tracker)).zzcc();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #176 <Method zzal zzat.zzcc()>
	//    2    4:areturn         
	}

	static zzal zzj(Tracker tracker)
	{
		return ((zzat) (tracker)).zzcc();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #176 <Method zzal zzat.zzcc()>
	//    2    4:areturn         
	}

	static zzdf zzk(Tracker tracker)
	{
		return tracker.zztd;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field zzdf zztd>
	//    2    4:areturn         
	}

	public void enableAdvertisingIdCollection(boolean flag)
	{
		zzsx = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #185 <Field boolean zzsx>
	//    3    5:return          
	}

	public void enableAutoActivityTracking(boolean flag)
	{
		zztb.enableAutoActivityTracking(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Tracker$zza zztb>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #188 <Method void Tracker$zza.enableAutoActivityTracking(boolean)>
	//    4    8:return          
	}

	public void enableExceptionReporting(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1;
		Object obj;
		Exception exception;
		if(zztc != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #191 <Field ExceptionReporter zztc>
	//*   4    6:ifnull          89
			flag1 = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            14
	//*   8   14:iload_2         
	//*   9   15:iload_1         
	//*  10   16:icmpne          22
	//*  11   19:aload_0         
	//*  12   20:monitorexit     
	//*  13   21:return          
	//*  14   22:iload_1         
	//*  15   23:ifeq            65
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #195 <Method android.content.Context zzat.getContext()>
	//*  18   30:astore_3        
	//*  19   31:aload_0         
	//*  20   32:new             #197 <Class ExceptionReporter>
	//*  21   35:dup             
	//*  22   36:aload_0         
	//*  23   37:invokestatic    #203 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//*  24   40:aload_3         
	//*  25   41:invokespecial   #206 <Method void ExceptionReporter(Tracker, Thread$UncaughtExceptionHandler, android.content.Context)>
	//*  26   44:putfield        #191 <Field ExceptionReporter zztc>
	//*  27   47:aload_0         
	//*  28   48:getfield        #191 <Field ExceptionReporter zztc>
	//*  29   51:invokestatic    #210 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
	//*  30   54:ldc1            #212 <String "Uncaught exceptions will be reported to Google Analytics">
	//*  31   56:astore_3        
	//*  32   57:aload_0         
	//*  33   58:aload_3         
	//*  34   59:invokevirtual   #216 <Method void zzat.zzq(String)>
	//*  35   62:goto            81
	//*  36   65:aload_0         
	//*  37   66:getfield        #191 <Field ExceptionReporter zztc>
	//*  38   69:invokevirtual   #219 <Method Thread$UncaughtExceptionHandler ExceptionReporter.zzp()>
	//*  39   72:invokestatic    #210 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
	//*  40   75:ldc1            #221 <String "Uncaught exceptions will not be reported to Google Analytics">
	//*  41   77:astore_3        
	//*  42   78:goto            57
	//*  43   81:aload_0         
	//*  44   82:monitorexit     
	//*  45   83:return          
	//*  46   84:astore_3        
	//*  47   85:aload_0         
	//*  48   86:monitorexit     
	//*  49   87:aload_3         
	//*  50   88:athrow          
			flag1 = false;
	//   51   89:iconst_0        
	//   52   90:istore_2        
		if(flag1 != flag)
			break MISSING_BLOCK_LABEL_22;
		this;
		JVM INSTR monitorexit ;
		return;
		if(!flag) goto _L2; else goto _L1
_L1:
		obj = ((Object) (((zzat)this).getContext()));
		zztc = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), ((android.content.Context) (obj)));
		Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (zztc)));
		obj = "Uncaught exceptions will be reported to Google Analytics";
_L4:
		((zzat)this).zzq(((String) (obj)));
		break; /* Loop/switch isn't completed */
_L2:
		Thread.setDefaultUncaughtExceptionHandler(zztc.zzp());
		obj = "Uncaught exceptions will not be reported to Google Analytics";
		if(true) goto _L4; else goto _L3
_L3:
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		this;
		JVM INSTR monitorexit ;
		throw exception;
	//*  53   91:goto            14
	}

	public String get(String s)
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #226 <Method void zzau.zzcl()>
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #232 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    8:ifeq            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		if(zzsy.containsKey(((Object) (s))))
	//*   7   13:aload_0         
	//*   8   14:getfield        #34  <Field Map zzsy>
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #236 <Method boolean Map.containsKey(Object)>
	//*  11   23:ifeq            40
			return (String)zzsy.get(((Object) (s)));
	//   12   26:aload_0         
	//   13   27:getfield        #34  <Field Map zzsy>
	//   14   30:aload_1         
	//   15   31:invokeinterface #238 <Method Object Map.get(Object)>
	//   16   36:checkcast       #95  <Class String>
	//   17   39:areturn         
		if(s.equals("&ul"))
	//*  18   40:aload_1         
	//*  19   41:ldc1            #240 <String "&ul">
	//*  20   43:invokevirtual   #243 <Method boolean String.equals(Object)>
	//*  21   46:ifeq            56
			return zzdg.zza(Locale.getDefault());
	//   22   49:invokestatic    #249 <Method Locale Locale.getDefault()>
	//   23   52:invokestatic    #254 <Method String zzdg.zza(Locale)>
	//   24   55:areturn         
		if(s.equals("&cid"))
	//*  25   56:aload_1         
	//*  26   57:ldc2            #256 <String "&cid">
	//*  27   60:invokevirtual   #243 <Method boolean String.equals(Object)>
	//*  28   63:ifeq            74
			return ((zzat)this).zzcg().zzdr();
	//   29   66:aload_0         
	//   30   67:invokevirtual   #260 <Method zzbo zzat.zzcg()>
	//   31   70:invokevirtual   #266 <Method String zzbo.zzdr()>
	//   32   73:areturn         
		if(s.equals("&sr"))
	//*  33   74:aload_1         
	//*  34   75:ldc2            #268 <String "&sr">
	//*  35   78:invokevirtual   #243 <Method boolean String.equals(Object)>
	//*  36   81:ifeq            92
			return ((zzat)this).zzcj().zzel();
	//   37   84:aload_0         
	//   38   85:invokevirtual   #160 <Method zzcb zzat.zzcj()>
	//   39   88:invokevirtual   #273 <Method String zzcb.zzel()>
	//   40   91:areturn         
		if(s.equals("&aid"))
	//*  41   92:aload_1         
	//*  42   93:ldc2            #275 <String "&aid">
	//*  43   96:invokevirtual   #243 <Method boolean String.equals(Object)>
	//*  44   99:ifeq            113
			return ((zzat)this).zzci().zzdf().zzal();
	//   45  102:aload_0         
	//   46  103:invokevirtual   #154 <Method zzbh zzat.zzci()>
	//   47  106:invokevirtual   #281 <Method zzx zzbh.zzdf()>
	//   48  109:invokevirtual   #286 <Method String zzx.zzal()>
	//   49  112:areturn         
		if(s.equals("&an"))
	//*  50  113:aload_1         
	//*  51  114:ldc2            #288 <String "&an">
	//*  52  117:invokevirtual   #243 <Method boolean String.equals(Object)>
	//*  53  120:ifeq            134
			return ((zzat)this).zzci().zzdf().zzaj();
	//   54  123:aload_0         
	//   55  124:invokevirtual   #154 <Method zzbh zzat.zzci()>
	//   56  127:invokevirtual   #281 <Method zzx zzbh.zzdf()>
	//   57  130:invokevirtual   #291 <Method String zzx.zzaj()>
	//   58  133:areturn         
		if(s.equals("&av"))
	//*  59  134:aload_1         
	//*  60  135:ldc2            #293 <String "&av">
	//*  61  138:invokevirtual   #243 <Method boolean String.equals(Object)>
	//*  62  141:ifeq            155
			return ((zzat)this).zzci().zzdf().zzak();
	//   63  144:aload_0         
	//   64  145:invokevirtual   #154 <Method zzbh zzat.zzci()>
	//   65  148:invokevirtual   #281 <Method zzx zzbh.zzdf()>
	//   66  151:invokevirtual   #296 <Method String zzx.zzak()>
	//   67  154:areturn         
		if(s.equals("&aiid"))
	//*  68  155:aload_1         
	//*  69  156:ldc2            #298 <String "&aiid">
	//*  70  159:invokevirtual   #243 <Method boolean String.equals(Object)>
	//*  71  162:ifeq            176
			return ((zzat)this).zzci().zzdf().zzam();
	//   72  165:aload_0         
	//   73  166:invokevirtual   #154 <Method zzbh zzat.zzci()>
	//   74  169:invokevirtual   #281 <Method zzx zzbh.zzdf()>
	//   75  172:invokevirtual   #301 <Method String zzx.zzam()>
	//   76  175:areturn         
		else
			return null;
	//   77  176:aconst_null     
	//   78  177:areturn         
	}

	public void send(Map map)
	{
		long l;
		boolean flag;
		boolean flag1;
		HashMap hashmap;
		String s;
		l = ((zzat)this).zzbx().currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method Clock zzat.zzbx()>
	//    2    4:invokeinterface #309 <Method long Clock.currentTimeMillis()>
	//    3    9:lstore          4
		if(((zzat)this).zzcb().getAppOptOut())
	//*   4   11:aload_0         
	//*   5   12:invokevirtual   #313 <Method GoogleAnalytics zzat.zzcb()>
	//*   6   15:invokevirtual   #318 <Method boolean GoogleAnalytics.getAppOptOut()>
	//*   7   18:ifeq            29
		{
			((zzat)this).zzr("AppOptOut is set to true. Not sending Google Analytics hit");
	//    8   21:aload_0         
	//    9   22:ldc2            #320 <String "AppOptOut is set to true. Not sending Google Analytics hit">
	//   10   25:invokevirtual   #323 <Method void zzat.zzr(String)>
			return;
	//   11   28:return          
		}
		flag = ((zzat)this).zzcb().isDryRunEnabled();
	//   12   29:aload_0         
	//   13   30:invokevirtual   #313 <Method GoogleAnalytics zzat.zzcb()>
	//   14   33:invokevirtual   #326 <Method boolean GoogleAnalytics.isDryRunEnabled()>
	//   15   36:istore          6
		hashmap = new HashMap();
	//   16   38:new             #29  <Class HashMap>
	//   17   41:dup             
	//   18   42:invokespecial   #32  <Method void HashMap()>
	//   19   45:astore          9
		zza(zzsy, ((Map) (hashmap)));
	//   20   47:aload_0         
	//   21   48:getfield        #34  <Field Map zzsy>
	//   22   51:aload           9
	//   23   53:invokestatic    #328 <Method void zza(Map, Map)>
		zza(map, ((Map) (hashmap)));
	//   24   56:aload_1         
	//   25   57:aload           9
	//   26   59:invokestatic    #328 <Method void zza(Map, Map)>
		flag1 = zzdg.zzb((String)zzsy.get("useSecure"), true);
	//   27   62:aload_0         
	//   28   63:getfield        #34  <Field Map zzsy>
	//   29   66:ldc1            #46  <String "useSecure">
	//   30   68:invokeinterface #238 <Method Object Map.get(Object)>
	//   31   73:checkcast       #95  <Class String>
	//   32   76:iconst_1        
	//   33   77:invokestatic    #331 <Method boolean zzdg.zzb(String, boolean)>
	//   34   80:istore          7
		map = zzsz;
	//   35   82:aload_0         
	//   36   83:getfield        #36  <Field Map zzsz>
	//   37   86:astore_1        
		Preconditions.checkNotNull(((Object) (hashmap)));
	//   38   87:aload           9
	//   39   89:invokestatic    #117 <Method Object Preconditions.checkNotNull(Object)>
	//   40   92:pop             
		if(map != null)
	//*  41   93:aload_1         
	//*  42   94:ifnull          176
		{
			map = ((Map) (map.entrySet().iterator()));
	//   43   97:aload_1         
	//   44   98:invokeinterface #121 <Method Set Map.entrySet()>
	//   45  103:invokeinterface #127 <Method Iterator Set.iterator()>
	//   46  108:astore_1        
			do
			{
				if(!((Iterator) (map)).hasNext())
					break;
	//   47  109:aload_1         
	//   48  110:invokeinterface #133 <Method boolean Iterator.hasNext()>
	//   49  115:ifeq            176
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   50  118:aload_1         
	//   51  119:invokeinterface #136 <Method Object Iterator.next()>
	//   52  124:checkcast       #89  <Class java.util.Map$Entry>
	//   53  127:astore          10
				String s1 = zza(entry);
	//   54  129:aload           10
	//   55  131:invokestatic    #138 <Method String zza(java.util.Map$Entry)>
	//   56  134:astore          11
				if(s1 != null && !((Map) (hashmap)).containsKey(((Object) (s1))))
	//*  57  136:aload           11
	//*  58  138:ifnull          109
	//*  59  141:aload           9
	//*  60  143:aload           11
	//*  61  145:invokeinterface #236 <Method boolean Map.containsKey(Object)>
	//*  62  150:ifne            109
					((Map) (hashmap)).put(((Object) (s1)), ((Object) ((String)entry.getValue())));
	//   63  153:aload           9
	//   64  155:aload           11
	//   65  157:aload           10
	//   66  159:invokeinterface #141 <Method Object java.util.Map$Entry.getValue()>
	//   67  164:checkcast       #95  <Class String>
	//   68  167:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   69  172:pop             
			} while(true);
	//   70  173:goto            109
		}
		zzsz.clear();
	//   71  176:aload_0         
	//   72  177:getfield        #36  <Field Map zzsz>
	//   73  180:invokeinterface #334 <Method void Map.clear()>
		map = ((Map) ((String)((Map) (hashmap)).get("t")));
	//   74  185:aload           9
	//   75  187:ldc2            #336 <String "t">
	//   76  190:invokeinterface #238 <Method Object Map.get(Object)>
	//   77  195:checkcast       #95  <Class String>
	//   78  198:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (map))))
	//*  79  199:aload_1         
	//*  80  200:invokestatic    #232 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  81  203:ifeq            219
		{
			((zzat)this).zzby().zza(((Map) (hashmap)), "Missing hit type parameter");
	//   82  206:aload_0         
	//   83  207:invokevirtual   #169 <Method zzcp zzat.zzby()>
	//   84  210:aload           9
	//   85  212:ldc2            #338 <String "Missing hit type parameter">
	//   86  215:invokevirtual   #343 <Method void zzcp.zza(Map, String)>
			return;
	//   87  218:return          
		}
		s = (String)((Map) (hashmap)).get("tid");
	//   88  219:aload           9
	//   89  221:ldc2            #345 <String "tid">
	//   90  224:invokeinterface #238 <Method Object Map.get(Object)>
	//   91  229:checkcast       #95  <Class String>
	//   92  232:astore          10
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  93  234:aload           10
	//*  94  236:invokestatic    #232 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  95  239:ifeq            255
		{
			((zzat)this).zzby().zza(((Map) (hashmap)), "Missing tracking id parameter");
	//   96  242:aload_0         
	//   97  243:invokevirtual   #169 <Method zzcp zzat.zzby()>
	//   98  246:aload           9
	//   99  248:ldc2            #347 <String "Missing tracking id parameter">
	//  100  251:invokevirtual   #343 <Method void zzcp.zza(Map, String)>
			return;
	//  101  254:return          
		}
		boolean flag2 = zzsx;
	//  102  255:aload_0         
	//  103  256:getfield        #185 <Field boolean zzsx>
	//  104  259:istore          8
		this;
	//  105  261:aload_0         
		JVM INSTR monitorenter ;
	//  106  262:monitorenter    
		int j;
		if(!"screenview".equalsIgnoreCase(((String) (map))) && !"pageview".equalsIgnoreCase(((String) (map))) && !"appview".equalsIgnoreCase(((String) (map))) && !TextUtils.isEmpty(((CharSequence) (map))))
			break MISSING_BLOCK_LABEL_346;
	//  107  263:ldc2            #349 <String "screenview">
	//  108  266:aload_1         
	//  109  267:invokevirtual   #352 <Method boolean String.equalsIgnoreCase(String)>
	//  110  270:ifne            300
	//  111  273:ldc2            #354 <String "pageview">
	//  112  276:aload_1         
	//  113  277:invokevirtual   #352 <Method boolean String.equalsIgnoreCase(String)>
	//  114  280:ifne            300
	//  115  283:ldc2            #356 <String "appview">
	//  116  286:aload_1         
	//  117  287:invokevirtual   #352 <Method boolean String.equalsIgnoreCase(String)>
	//  118  290:ifne            300
	//  119  293:aload_1         
	//  120  294:invokestatic    #232 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  121  297:ifeq            346
		j = Integer.parseInt((String)zzsy.get("&a")) + 1;
	//  122  300:aload_0         
	//  123  301:getfield        #34  <Field Map zzsy>
	//  124  304:ldc1            #50  <String "&a">
	//  125  306:invokeinterface #238 <Method Object Map.get(Object)>
	//  126  311:checkcast       #95  <Class String>
	//  127  314:invokestatic    #360 <Method int Integer.parseInt(String)>
	//  128  317:iconst_1        
	//  129  318:iadd            
	//  130  319:istore_3        
		int i;
		i = j;
	//  131  320:iload_3         
	//  132  321:istore_2        
		if(j >= 0x7fffffff)
	//* 133  322:iload_3         
	//* 134  323:ldc1            #54  <Int 0x7fffffff>
	//* 135  325:icmplt          330
			i = 1;
	//  136  328:iconst_1        
	//  137  329:istore_2        
		zzsy.put("&a", ((Object) (Integer.toString(i))));
	//  138  330:aload_0         
	//  139  331:getfield        #34  <Field Map zzsy>
	//  140  334:ldc1            #50  <String "&a">
	//  141  336:iload_2         
	//  142  337:invokestatic    #64  <Method String Integer.toString(int)>
	//  143  340:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//  144  345:pop             
		this;
	//  145  346:aload_0         
		JVM INSTR monitorexit ;
	//  146  347:monitorexit     
		((zzat)this).zzca().zza(((Runnable) (new zzp(this, ((Map) (hashmap)), flag2, ((String) (map)), l, flag, flag1, s))));
	//  147  348:aload_0         
	//  148  349:invokevirtual   #364 <Method zzk zzat.zzca()>
	//  149  352:new             #366 <Class zzp>
	//  150  355:dup             
	//  151  356:aload_0         
	//  152  357:aload           9
	//  153  359:iload           8
	//  154  361:aload_1         
	//  155  362:lload           4
	//  156  364:iload           6
	//  157  366:iload           7
	//  158  368:aload           10
	//  159  370:invokespecial   #369 <Method void zzp(Tracker, Map, boolean, String, long, boolean, boolean, String)>
	//  160  373:invokevirtual   #374 <Method void zzk.zza(Runnable)>
		return;
	//  161  376:return          
		map;
	//  162  377:astore_1        
		this;
	//  163  378:aload_0         
		JVM INSTR monitorexit ;
	//  164  379:monitorexit     
		throw map;
	//  165  380:aload_1         
	//  166  381:athrow          
	}

	public void set(String s, String s1)
	{
		Preconditions.checkNotNull(((Object) (s)), "Key should be non-null");
	//    0    0:aload_1         
	//    1    1:ldc2            #379 <String "Key should be non-null">
	//    2    4:invokestatic    #381 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    7:pop             
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   4    8:aload_1         
	//*   5    9:invokestatic    #232 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   12:ifeq            16
		{
			return;
	//    7   15:return          
		} else
		{
			zzsy.put(((Object) (s)), ((Object) (s1)));
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field Map zzsy>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   13   27:pop             
			return;
	//   14   28:return          
		}
	}

	public void setAnonymizeIp(boolean flag)
	{
		set("&aip", zzdg.zzc(flag));
	//    0    0:aload_0         
	//    1    1:ldc2            #384 <String "&aip">
	//    2    4:iload_1         
	//    3    5:invokestatic    #387 <Method String zzdg.zzc(boolean)>
	//    4    8:invokevirtual   #389 <Method void set(String, String)>
	//    5   11:return          
	}

	public void setAppId(String s)
	{
		set("&aid", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #275 <String "&aid">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setAppInstallerId(String s)
	{
		set("&aiid", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #298 <String "&aiid">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setAppName(String s)
	{
		set("&an", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #288 <String "&an">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setAppVersion(String s)
	{
		set("&av", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #293 <String "&av">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setCampaignParamsOnNextHit(Uri uri)
	{
		if(uri != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          327
		{
			if(uri.isOpaque())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #400 <Method boolean Uri.isOpaque()>
	//*   4    8:ifeq            12
				return;
	//    5   11:return          
			uri = ((Uri) (uri.getQueryParameter("referrer")));
	//    6   12:aload_1         
	//    7   13:ldc2            #402 <String "referrer">
	//    8   16:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//    9   19:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (uri))))
	//*  10   20:aload_1         
	//*  11   21:invokestatic    #232 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   24:ifeq            28
				return;
	//   13   27:return          
			uri = ((Uri) (String.valueOf(((Object) (uri)))));
	//   14   28:aload_1         
	//   15   29:invokestatic    #409 <Method String String.valueOf(Object)>
	//   16   32:astore_1        
			if(((String) (uri)).length() != 0)
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #105 <Method int String.length()>
	//*  19   37:ifeq            51
				uri = ((Uri) ("http://hostname/?".concat(((String) (uri)))));
	//   20   40:ldc2            #411 <String "http://hostname/?">
	//   21   43:aload_1         
	//   22   44:invokevirtual   #414 <Method String String.concat(String)>
	//   23   47:astore_1        
			else
	//*  24   48:goto            62
				uri = ((Uri) (new String("http://hostname/?")));
	//   25   51:new             #95  <Class String>
	//   26   54:dup             
	//   27   55:ldc2            #411 <String "http://hostname/?">
	//   28   58:invokespecial   #416 <Method void String(String)>
	//   29   61:astore_1        
			uri = Uri.parse(((String) (uri)));
	//   30   62:aload_1         
	//   31   63:invokestatic    #420 <Method Uri Uri.parse(String)>
	//   32   66:astore_1        
			String s = uri.getQueryParameter("utm_id");
	//   33   67:aload_1         
	//   34   68:ldc2            #422 <String "utm_id">
	//   35   71:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//   36   74:astore_2        
			if(s != null)
	//*  37   75:aload_2         
	//*  38   76:ifnull          93
				zzsz.put("&ci", ((Object) (s)));
	//   39   79:aload_0         
	//   40   80:getfield        #36  <Field Map zzsz>
	//   41   83:ldc2            #424 <String "&ci">
	//   42   86:aload_2         
	//   43   87:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   44   92:pop             
			s = uri.getQueryParameter("anid");
	//   45   93:aload_1         
	//   46   94:ldc2            #426 <String "anid">
	//   47   97:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//   48  100:astore_2        
			if(s != null)
	//*  49  101:aload_2         
	//*  50  102:ifnull          119
				zzsz.put("&anid", ((Object) (s)));
	//   51  105:aload_0         
	//   52  106:getfield        #36  <Field Map zzsz>
	//   53  109:ldc2            #428 <String "&anid">
	//   54  112:aload_2         
	//   55  113:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   56  118:pop             
			s = uri.getQueryParameter("utm_campaign");
	//   57  119:aload_1         
	//   58  120:ldc2            #430 <String "utm_campaign">
	//   59  123:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//   60  126:astore_2        
			if(s != null)
	//*  61  127:aload_2         
	//*  62  128:ifnull          145
				zzsz.put("&cn", ((Object) (s)));
	//   63  131:aload_0         
	//   64  132:getfield        #36  <Field Map zzsz>
	//   65  135:ldc2            #432 <String "&cn">
	//   66  138:aload_2         
	//   67  139:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   68  144:pop             
			s = uri.getQueryParameter("utm_content");
	//   69  145:aload_1         
	//   70  146:ldc2            #434 <String "utm_content">
	//   71  149:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//   72  152:astore_2        
			if(s != null)
	//*  73  153:aload_2         
	//*  74  154:ifnull          171
				zzsz.put("&cc", ((Object) (s)));
	//   75  157:aload_0         
	//   76  158:getfield        #36  <Field Map zzsz>
	//   77  161:ldc2            #436 <String "&cc">
	//   78  164:aload_2         
	//   79  165:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   80  170:pop             
			s = uri.getQueryParameter("utm_medium");
	//   81  171:aload_1         
	//   82  172:ldc2            #438 <String "utm_medium">
	//   83  175:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//   84  178:astore_2        
			if(s != null)
	//*  85  179:aload_2         
	//*  86  180:ifnull          197
				zzsz.put("&cm", ((Object) (s)));
	//   87  183:aload_0         
	//   88  184:getfield        #36  <Field Map zzsz>
	//   89  187:ldc2            #440 <String "&cm">
	//   90  190:aload_2         
	//   91  191:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   92  196:pop             
			s = uri.getQueryParameter("utm_source");
	//   93  197:aload_1         
	//   94  198:ldc2            #442 <String "utm_source">
	//   95  201:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//   96  204:astore_2        
			if(s != null)
	//*  97  205:aload_2         
	//*  98  206:ifnull          223
				zzsz.put("&cs", ((Object) (s)));
	//   99  209:aload_0         
	//  100  210:getfield        #36  <Field Map zzsz>
	//  101  213:ldc2            #444 <String "&cs">
	//  102  216:aload_2         
	//  103  217:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//  104  222:pop             
			s = uri.getQueryParameter("utm_term");
	//  105  223:aload_1         
	//  106  224:ldc2            #446 <String "utm_term">
	//  107  227:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//  108  230:astore_2        
			if(s != null)
	//* 109  231:aload_2         
	//* 110  232:ifnull          249
				zzsz.put("&ck", ((Object) (s)));
	//  111  235:aload_0         
	//  112  236:getfield        #36  <Field Map zzsz>
	//  113  239:ldc2            #448 <String "&ck">
	//  114  242:aload_2         
	//  115  243:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//  116  248:pop             
			s = uri.getQueryParameter("dclid");
	//  117  249:aload_1         
	//  118  250:ldc2            #450 <String "dclid">
	//  119  253:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//  120  256:astore_2        
			if(s != null)
	//* 121  257:aload_2         
	//* 122  258:ifnull          275
				zzsz.put("&dclid", ((Object) (s)));
	//  123  261:aload_0         
	//  124  262:getfield        #36  <Field Map zzsz>
	//  125  265:ldc2            #452 <String "&dclid">
	//  126  268:aload_2         
	//  127  269:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//  128  274:pop             
			s = uri.getQueryParameter("gclid");
	//  129  275:aload_1         
	//  130  276:ldc2            #454 <String "gclid">
	//  131  279:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//  132  282:astore_2        
			if(s != null)
	//* 133  283:aload_2         
	//* 134  284:ifnull          301
				zzsz.put("&gclid", ((Object) (s)));
	//  135  287:aload_0         
	//  136  288:getfield        #36  <Field Map zzsz>
	//  137  291:ldc2            #456 <String "&gclid">
	//  138  294:aload_2         
	//  139  295:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//  140  300:pop             
			uri = ((Uri) (uri.getQueryParameter("aclid")));
	//  141  301:aload_1         
	//  142  302:ldc2            #458 <String "aclid">
	//  143  305:invokevirtual   #405 <Method String Uri.getQueryParameter(String)>
	//  144  308:astore_1        
			if(uri != null)
	//* 145  309:aload_1         
	//* 146  310:ifnull          327
				zzsz.put("&aclid", ((Object) (uri)));
	//  147  313:aload_0         
	//  148  314:getfield        #36  <Field Map zzsz>
	//  149  317:ldc2            #460 <String "&aclid">
	//  150  320:aload_1         
	//  151  321:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//  152  326:pop             
		}
	//  153  327:return          
	}

	public void setClientId(String s)
	{
		set("&cid", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #256 <String "&cid">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setEncoding(String s)
	{
		set("&de", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #464 <String "&de">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setHostname(String s)
	{
		set("&dh", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #467 <String "&dh">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setLanguage(String s)
	{
		set("&ul", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #240 <String "&ul">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #389 <Method void set(String, String)>
	//    4    7:return          
	}

	public void setLocation(String s)
	{
		set("&dl", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #471 <String "&dl">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setPage(String s)
	{
		set("&dp", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #474 <String "&dp">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setReferrer(String s)
	{
		set("&dr", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #477 <String "&dr">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setSampleRate(double d)
	{
		set("&sf", Double.toString(d));
	//    0    0:aload_0         
	//    1    1:ldc2            #481 <String "&sf">
	//    2    4:dload_1         
	//    3    5:invokestatic    #486 <Method String Double.toString(double)>
	//    4    8:invokevirtual   #389 <Method void set(String, String)>
	//    5   11:return          
	}

	public void setScreenColors(String s)
	{
		set("&sd", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #489 <String "&sd">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setScreenName(String s)
	{
		set("&cd", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #492 <String "&cd">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setScreenResolution(int i, int j)
	{
		if(i < 0 && j < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            16
	//*   2    4:iload_2         
	//*   3    5:ifge            16
		{
			((zzat)this).zzt("Invalid width or height. The values should be non-negative.");
	//    4    8:aload_0         
	//    5    9:ldc2            #496 <String "Invalid width or height. The values should be non-negative.">
	//    6   12:invokevirtual   #499 <Method void zzat.zzt(String)>
			return;
	//    7   15:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(23);
	//    8   16:new             #501 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:bipush          23
	//   11   22:invokespecial   #504 <Method void StringBuilder(int)>
	//   12   25:astore_3        
			stringbuilder.append(i);
	//   13   26:aload_3         
	//   14   27:iload_1         
	//   15   28:invokevirtual   #508 <Method StringBuilder StringBuilder.append(int)>
	//   16   31:pop             
			stringbuilder.append("x");
	//   17   32:aload_3         
	//   18   33:ldc2            #510 <String "x">
	//   19   36:invokevirtual   #513 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			stringbuilder.append(j);
	//   21   40:aload_3         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #508 <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
			set("&sr", stringbuilder.toString());
	//   25   46:aload_0         
	//   26   47:ldc2            #268 <String "&sr">
	//   27   50:aload_3         
	//   28   51:invokevirtual   #515 <Method String StringBuilder.toString()>
	//   29   54:invokevirtual   #389 <Method void set(String, String)>
			return;
	//   30   57:return          
		}
	}

	public void setSessionTimeout(long l)
	{
		zztb.setSessionTimeout(l * 1000L);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Tracker$zza zztb>
	//    2    4:lload_1         
	//    3    5:ldc2w           #518 <Long 1000L>
	//    4    8:lmul            
	//    5    9:invokevirtual   #521 <Method void Tracker$zza.setSessionTimeout(long)>
	//    6   12:return          
	}

	public void setTitle(String s)
	{
		set("&dt", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #524 <String "&dt">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	public void setUseSecure(boolean flag)
	{
		set("useSecure", zzdg.zzc(flag));
	//    0    0:aload_0         
	//    1    1:ldc1            #46  <String "useSecure">
	//    2    3:iload_1         
	//    3    4:invokestatic    #387 <Method String zzdg.zzc(boolean)>
	//    4    7:invokevirtual   #389 <Method void set(String, String)>
	//    5   10:return          
	}

	public void setViewportSize(String s)
	{
		set("&vp", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #528 <String "&vp">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method void set(String, String)>
	//    4    8:return          
	}

	final void zza(zzdf zzdf1)
	{
		((zzat)this).zzq("Loading Tracker config values");
	//    0    0:aload_0         
	//    1    1:ldc2            #531 <String "Loading Tracker config values">
	//    2    4:invokevirtual   #216 <Method void zzat.zzq(String)>
		zztd = zzdf1;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #181 <Field zzdf zztd>
		zzdf1 = ((zzdf) (zztd.zzaci));
	//    6   12:aload_0         
	//    7   13:getfield        #181 <Field zzdf zztd>
	//    8   16:getfield        #537 <Field String zzdf.zzaci>
	//    9   19:astore_1        
		boolean flag4 = false;
	//   10   20:iconst_0        
	//   11   21:istore          4
		boolean flag;
		if(zzdf1 != null)
	//*  12   23:aload_1         
	//*  13   24:ifnull          32
			flag = true;
	//   14   27:iconst_1        
	//   15   28:istore_2        
		else
	//*  16   29:goto            34
			flag = false;
	//   17   32:iconst_0        
	//   18   33:istore_2        
		if(flag)
	//*  19   34:iload_2         
	//*  20   35:ifeq            61
		{
			zzdf1 = ((zzdf) (zztd.zzaci));
	//   21   38:aload_0         
	//   22   39:getfield        #181 <Field zzdf zztd>
	//   23   42:getfield        #537 <Field String zzdf.zzaci>
	//   24   45:astore_1        
			set("&tid", ((String) (zzdf1)));
	//   25   46:aload_0         
	//   26   47:ldc1            #38  <String "&tid">
	//   27   49:aload_1         
	//   28   50:invokevirtual   #389 <Method void set(String, String)>
			((zzat)this).zza("trackingId loaded", ((Object) (zzdf1)));
	//   29   53:aload_0         
	//   30   54:ldc2            #539 <String "trackingId loaded">
	//   31   57:aload_1         
	//   32   58:invokevirtual   #542 <Method void zzat.zza(String, Object)>
		}
		if(zztd.zzacj >= 0.0D)
	//*  33   61:aload_0         
	//*  34   62:getfield        #181 <Field zzdf zztd>
	//*  35   65:getfield        #546 <Field double zzdf.zzacj>
	//*  36   68:dconst_0        
	//*  37   69:dcmpl           
	//*  38   70:iflt            78
			flag = true;
	//   39   73:iconst_1        
	//   40   74:istore_2        
		else
	//*  41   75:goto            80
			flag = false;
	//   42   78:iconst_0        
	//   43   79:istore_2        
		if(flag)
	//*  44   80:iload_2         
	//*  45   81:ifeq            111
		{
			zzdf1 = ((zzdf) (Double.toString(zztd.zzacj)));
	//   46   84:aload_0         
	//   47   85:getfield        #181 <Field zzdf zztd>
	//   48   88:getfield        #546 <Field double zzdf.zzacj>
	//   49   91:invokestatic    #486 <Method String Double.toString(double)>
	//   50   94:astore_1        
			set("&sf", ((String) (zzdf1)));
	//   51   95:aload_0         
	//   52   96:ldc2            #481 <String "&sf">
	//   53   99:aload_1         
	//   54  100:invokevirtual   #389 <Method void set(String, String)>
			((zzat)this).zza("Sample frequency loaded", ((Object) (zzdf1)));
	//   55  103:aload_0         
	//   56  104:ldc2            #548 <String "Sample frequency loaded">
	//   57  107:aload_1         
	//   58  108:invokevirtual   #542 <Method void zzat.zza(String, Object)>
		}
		if(zztd.zzack >= 0)
	//*  59  111:aload_0         
	//*  60  112:getfield        #181 <Field zzdf zztd>
	//*  61  115:getfield        #552 <Field int zzdf.zzack>
	//*  62  118:iflt            126
			flag = true;
	//   63  121:iconst_1        
	//   64  122:istore_2        
		else
	//*  65  123:goto            128
			flag = false;
	//   66  126:iconst_0        
	//   67  127:istore_2        
		if(flag)
	//*  68  128:iload_2         
	//*  69  129:ifeq            157
		{
			int i = zztd.zzack;
	//   70  132:aload_0         
	//   71  133:getfield        #181 <Field zzdf zztd>
	//   72  136:getfield        #552 <Field int zzdf.zzack>
	//   73  139:istore_2        
			setSessionTimeout(i);
	//   74  140:aload_0         
	//   75  141:iload_2         
	//   76  142:i2l             
	//   77  143:invokevirtual   #553 <Method void setSessionTimeout(long)>
			((zzat)this).zza("Session timeout loaded", ((Object) (Integer.valueOf(i))));
	//   78  146:aload_0         
	//   79  147:ldc2            #555 <String "Session timeout loaded">
	//   80  150:iload_2         
	//   81  151:invokestatic    #558 <Method Integer Integer.valueOf(int)>
	//   82  154:invokevirtual   #542 <Method void zzat.zza(String, Object)>
		}
		if(zztd.zzacl != -1)
	//*  83  157:aload_0         
	//*  84  158:getfield        #181 <Field zzdf zztd>
	//*  85  161:getfield        #561 <Field int zzdf.zzacl>
	//*  86  164:iconst_m1       
	//*  87  165:icmpeq          202
		{
			boolean flag1;
			if(zztd.zzacl == 1)
	//*  88  168:aload_0         
	//*  89  169:getfield        #181 <Field zzdf zztd>
	//*  90  172:getfield        #561 <Field int zzdf.zzacl>
	//*  91  175:iconst_1        
	//*  92  176:icmpne          184
				flag1 = true;
	//   93  179:iconst_1        
	//   94  180:istore_3        
			else
	//*  95  181:goto            186
				flag1 = false;
	//   96  184:iconst_0        
	//   97  185:istore_3        
			enableAutoActivityTracking(flag1);
	//   98  186:aload_0         
	//   99  187:iload_3         
	//  100  188:invokevirtual   #562 <Method void enableAutoActivityTracking(boolean)>
			((zzat)this).zza("Auto activity tracking loaded", ((Object) (Boolean.valueOf(flag1))));
	//  101  191:aload_0         
	//  102  192:ldc2            #564 <String "Auto activity tracking loaded">
	//  103  195:iload_3         
	//  104  196:invokestatic    #569 <Method Boolean Boolean.valueOf(boolean)>
	//  105  199:invokevirtual   #542 <Method void zzat.zza(String, Object)>
		}
		if(zztd.zzacm != -1)
	//* 106  202:aload_0         
	//* 107  203:getfield        #181 <Field zzdf zztd>
	//* 108  206:getfield        #572 <Field int zzdf.zzacm>
	//* 109  209:iconst_m1       
	//* 110  210:icmpeq          255
		{
			boolean flag2;
			if(zztd.zzacm == 1)
	//* 111  213:aload_0         
	//* 112  214:getfield        #181 <Field zzdf zztd>
	//* 113  217:getfield        #572 <Field int zzdf.zzacm>
	//* 114  220:iconst_1        
	//* 115  221:icmpne          229
				flag2 = true;
	//  116  224:iconst_1        
	//  117  225:istore_3        
			else
	//* 118  226:goto            231
				flag2 = false;
	//  119  229:iconst_0        
	//  120  230:istore_3        
			if(flag2)
	//* 121  231:iload_3         
	//* 122  232:ifeq            244
				set("&aip", "1");
	//  123  235:aload_0         
	//  124  236:ldc2            #384 <String "&aip">
	//  125  239:ldc1            #48  <String "1">
	//  126  241:invokevirtual   #389 <Method void set(String, String)>
			((zzat)this).zza("Anonymize ip loaded", ((Object) (Boolean.valueOf(flag2))));
	//  127  244:aload_0         
	//  128  245:ldc2            #574 <String "Anonymize ip loaded">
	//  129  248:iload_3         
	//  130  249:invokestatic    #569 <Method Boolean Boolean.valueOf(boolean)>
	//  131  252:invokevirtual   #542 <Method void zzat.zza(String, Object)>
		}
		boolean flag3 = flag4;
	//  132  255:iload           4
	//  133  257:istore_3        
		if(zztd.zzacn == 1)
	//* 134  258:aload_0         
	//* 135  259:getfield        #181 <Field zzdf zztd>
	//* 136  262:getfield        #577 <Field int zzdf.zzacn>
	//* 137  265:iconst_1        
	//* 138  266:icmpne          271
			flag3 = true;
	//  139  269:iconst_1        
	//  140  270:istore_3        
		enableExceptionReporting(flag3);
	//  141  271:aload_0         
	//  142  272:iload_3         
	//  143  273:invokevirtual   #579 <Method void enableExceptionReporting(boolean)>
	//  144  276:return          
	}

	protected final void zzag()
	{
		((zzau) (zztb)).zzq();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Tracker$zza zztb>
	//    2    4:invokevirtual   #582 <Method void zzau.zzq()>
		String s = ((zzat)this).zzce().zzaj();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #586 <Method zzdh zzat.zzce()>
	//    5   11:invokevirtual   #589 <Method String zzdh.zzaj()>
	//    6   14:astore_1        
		if(s != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          27
			set("&an", s);
	//    9   19:aload_0         
	//   10   20:ldc2            #288 <String "&an">
	//   11   23:aload_1         
	//   12   24:invokevirtual   #389 <Method void set(String, String)>
		s = ((zzat)this).zzce().zzak();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #586 <Method zzdh zzat.zzce()>
	//   15   31:invokevirtual   #590 <Method String zzdh.zzak()>
	//   16   34:astore_1        
		if(s != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          47
			set("&av", s);
	//   19   39:aload_0         
	//   20   40:ldc2            #293 <String "&av">
	//   21   43:aload_1         
	//   22   44:invokevirtual   #389 <Method void set(String, String)>
	//   23   47:return          
	}

	private boolean zzsx;
	private final Map zzsy = new HashMap();
	private final Map zzsz = new HashMap();
	private final zzcn zzta = new zzcn("tracking", ((zzat)this).zzbx());
	private final zza zztb;
	private ExceptionReporter zztc;
	private zzdf zztd;
}
