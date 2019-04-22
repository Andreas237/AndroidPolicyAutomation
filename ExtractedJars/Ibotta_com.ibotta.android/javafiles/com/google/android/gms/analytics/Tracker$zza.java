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

final class Tracker$zza extends zzar
	implements ics.zza
{

	private final void zzae()
	{
		if(zztd < 0L && !zztb)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field long zztd>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifge            34
	//*   5    9:aload_0         
	//*   6   10:getfield        #35  <Field boolean zztb>
	//*   7   13:ifeq            19
	//*   8   16:goto            34
		{
			((zzaq)this).zzbx().zzb(((ics.zza) (Tracker.zza(zzta))));
	//    9   19:aload_0         
	//   10   20:invokevirtual   #41  <Method GoogleAnalytics zzaq.zzbx()>
	//   11   23:aload_0         
	//   12   24:getfield        #23  <Field Tracker zzta>
	//   13   27:invokestatic    #44  <Method Tracker$zza Tracker.zza(Tracker)>
	//   14   30:invokevirtual   #50  <Method void GoogleAnalytics.zzb(GoogleAnalytics$zza)>
			return;
	//   15   33:return          
		} else
		{
			((zzaq)this).zzbx().zza(((ics.zza) (Tracker.zza(zzta))));
	//   16   34:aload_0         
	//   17   35:invokevirtual   #41  <Method GoogleAnalytics zzaq.zzbx()>
	//   18   38:aload_0         
	//   19   39:getfield        #23  <Field Tracker zzta>
	//   20   42:invokestatic    #44  <Method Tracker$zza Tracker.zza(Tracker)>
	//   21   45:invokevirtual   #52  <Method void GoogleAnalytics.zza(GoogleAnalytics$zza)>
			return;
	//   22   48:return          
		}
	}

	public final void enableAutoActivityTracking(boolean flag)
	{
		zztb = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean zztb>
		zzae();
	//    3    5:aload_0         
	//    4    6:invokespecial   #56  <Method void zzae()>
	//    5    9:return          
	}

	public final void setSessionTimeout(long l)
	{
		zztd = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #30  <Field long zztd>
		zzae();
	//    3    5:aload_0         
	//    4    6:invokespecial   #56  <Method void zzae()>
	//    5    9:return          
	}

	protected final void zzac()
	{
	//    0    0:return          
	}

	public final boolean zzad()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		flag = zzte;
	//    2    2:aload_0         
	//    3    3:getfield        #63  <Field boolean zzte>
	//    4    6:istore_1        
		zzte = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #63  <Field boolean zzte>
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
		if(zztc == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field int zztc>
	//*   2    4:ifne            51
		{
			boolean flag;
			if(((zzaq)this).zzbt().elapsedRealtime() >= zztf + Math.max(1000L, zztd))
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #71  <Method Clock zzaq.zzbt()>
	//*   5   11:invokeinterface #77  <Method long Clock.elapsedRealtime()>
	//*   6   16:aload_0         
	//*   7   17:getfield        #79  <Field long zztf>
	//*   8   20:ldc2w           #80  <Long 1000L>
	//*   9   23:aload_0         
	//*  10   24:getfield        #30  <Field long zztd>
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
				zzte = true;
	//   22   46:aload_0         
	//   23   47:iconst_1        
	//   24   48:putfield        #63  <Field boolean zzte>
		}
		zztc = zztc + 1;
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #67  <Field int zztc>
	//   28   56:iconst_1        
	//   29   57:iadd            
	//   30   58:putfield        #67  <Field int zztc>
		if(zztb)
	//*  31   61:aload_0         
	//*  32   62:getfield        #35  <Field boolean zztb>
	//*  33   65:ifeq            266
		{
			Object obj = ((Object) (activity.getIntent()));
	//   34   68:aload_1         
	//   35   69:invokevirtual   #93  <Method Intent Activity.getIntent()>
	//   36   72:astore_3        
			if(obj != null)
	//*  37   73:aload_3         
	//*  38   74:ifnull          88
				zzta.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
	//   39   77:aload_0         
	//   40   78:getfield        #23  <Field Tracker zzta>
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
			Tracker tracker = zzta;
	//   53  109:aload_0         
	//   54  110:getfield        #23  <Field Tracker zzta>
	//   55  113:astore          6
			if(Tracker.zzk(tracker) != null)
	//*  56  115:aload           6
	//*  57  117:invokestatic    #121 <Method zzdc Tracker.zzk(Tracker)>
	//*  58  120:ifnull          167
			{
				Object obj2 = ((Object) (Tracker.zzk(zzta)));
	//   59  123:aload_0         
	//   60  124:getfield        #23  <Field Tracker zzta>
	//   61  127:invokestatic    #121 <Method zzdc Tracker.zzk(Tracker)>
	//   62  130:astore          4
				obj = ((Object) (((Object) (activity)).getClass().getCanonicalName()));
	//   63  132:aload_1         
	//   64  133:invokevirtual   #127 <Method Class Object.getClass()>
	//   65  136:invokevirtual   #133 <Method String Class.getCanonicalName()>
	//   66  139:astore_3        
				obj2 = ((Object) ((String)((zzdc) (obj2)).zzacc.get(obj)));
	//   67  140:aload           4
	//   68  142:getfield        #139 <Field Map zzdc.zzacc>
	//   69  145:aload_3         
	//   70  146:invokeinterface #143 <Method Object Map.get(Object)>
	//   71  151:checkcast       #145 <Class String>
	//   72  154:astore          4
				if(obj2 != null)
	//*  73  156:aload           4
	//*  74  158:ifnull          175
					obj = obj2;
	//   75  161:aload           4
	//   76  163:astore_3        
			} else
	//*  77  164:goto            175
			{
				obj = ((Object) (((Object) (activity)).getClass().getCanonicalName()));
	//   78  167:aload_1         
	//   79  168:invokevirtual   #127 <Method Class Object.getClass()>
	//   80  171:invokevirtual   #133 <Method String Class.getCanonicalName()>
	//   81  174:astore_3        
			}
			tracker.set("&cd", ((String) (obj)));
	//   82  175:aload           6
	//   83  177:ldc1            #147 <String "&cd">
	//   84  179:aload_3         
	//   85  180:invokevirtual   #151 <Method void Tracker.set(String, String)>
			if(TextUtils.isEmpty((CharSequence)((Map) (hashmap)).get("&dr")))
	//*  86  183:aload           5
	//*  87  185:ldc1            #153 <String "&dr">
	//*  88  187:invokeinterface #143 <Method Object Map.get(Object)>
	//*  89  192:checkcast       #155 <Class CharSequence>
	//*  90  195:invokestatic    #161 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  91  198:ifeq            257
			{
				Preconditions.checkNotNull(((Object) (activity)));
	//   92  201:aload_1         
	//   93  202:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object)>
	//   94  205:pop             
				Object obj1 = ((Object) (activity.getIntent()));
	//   95  206:aload_1         
	//   96  207:invokevirtual   #93  <Method Intent Activity.getIntent()>
	//   97  210:astore_3        
				activity = null;
	//   98  211:aconst_null     
	//   99  212:astore_1        
				if(obj1 != null)
	//* 100  213:aload_3         
	//* 101  214:ifnonnull       220
	//* 102  217:goto            239
				{
					obj1 = ((Object) (((Intent) (obj1)).getStringExtra("android.intent.extra.REFERRER_NAME")));
	//  103  220:aload_3         
	//  104  221:ldc1            #168 <String "android.intent.extra.REFERRER_NAME">
	//  105  223:invokevirtual   #172 <Method String Intent.getStringExtra(String)>
	//  106  226:astore_3        
					if(!TextUtils.isEmpty(((CharSequence) (obj1))))
	//* 107  227:aload_3         
	//* 108  228:invokestatic    #161 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 109  231:ifeq            237
	//* 110  234:goto            239
						activity = ((Activity) (obj1));
	//  111  237:aload_3         
	//  112  238:astore_1        
				}
				if(!TextUtils.isEmpty(((CharSequence) (activity))))
	//* 113  239:aload_1         
	//* 114  240:invokestatic    #161 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 115  243:ifne            257
					((Map) (hashmap)).put("&dr", ((Object) (activity)));
	//  116  246:aload           5
	//  117  248:ldc1            #153 <String "&dr">
	//  118  250:aload_1         
	//  119  251:invokeinterface #117 <Method Object Map.put(Object, Object)>
	//  120  256:pop             
			}
			zzta.send(((Map) (hashmap)));
	//  121  257:aload_0         
	//  122  258:getfield        #23  <Field Tracker zzta>
	//  123  261:aload           5
	//  124  263:invokevirtual   #176 <Method void Tracker.send(Map)>
		}
	//  125  266:return          
	}

	public final void zzd(Activity activity)
	{
		zztc = zztc - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field int zztc>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #67  <Field int zztc>
		zztc = Math.max(0, zztc);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:getfield        #67  <Field int zztc>
	//   10   16:invokestatic    #180 <Method int Math.max(int, int)>
	//   11   19:putfield        #67  <Field int zztc>
		if(zztc == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #67  <Field int zztc>
	//*  14   26:ifne            42
			zztf = ((zzaq)this).zzbt().elapsedRealtime();
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #71  <Method Clock zzaq.zzbt()>
	//   18   34:invokeinterface #77  <Method long Clock.elapsedRealtime()>
	//   19   39:putfield        #79  <Field long zztf>
	//   20   42:return          
	}

	private final Tracker zzta;
	private boolean zztb;
	private int zztc;
	private long zztd;
	private boolean zzte;
	private long zztf;

	protected Tracker$zza(Tracker tracker, zzat zzat)
	{
		zzta = tracker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Tracker zzta>
		super(zzat);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #26  <Method void zzar(zzat)>
		zztd = -1L;
	//    6   10:aload_0         
	//    7   11:ldc2w           #27  <Long -1L>
	//    8   14:putfield        #30  <Field long zztd>
	//    9   17:return          
	}
}
