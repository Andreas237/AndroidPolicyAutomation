// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.*;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//			Tracker, GoogleAnalytics

final class Tracker$zza extends zzau
	implements ics.zza
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
			((zzat)this).zzcb().zzb(((ics.zza) (Tracker.zza(zztl))));
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
			((zzat)this).zzcb().zza(((ics.zza) (Tracker.zza(zztl))));
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
	//   42   82:invokevirtual   #99  <Method android.net.Uri Intent.getData()>
	//   43   85:invokevirtual   #103 <Method void Tracker.setCampaignParamsOnNextHit(android.net.Uri)>
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

	protected Tracker$zza(Tracker tracker, zzaw zzaw)
	{
		zztl = tracker;
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
