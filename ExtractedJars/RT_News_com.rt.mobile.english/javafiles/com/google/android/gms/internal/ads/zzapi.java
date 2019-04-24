// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.*;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapf, zzapw, zzaph, zznk, 
//			zzkb, zzni, zznx, zzapy, 
//			zzapg, zzaoe, zzapj, zzakk, 
//			zzapm, zzapz, zzapk, zzapl, 
//			zzakb, zzapv

public final class zzapi extends FrameLayout
	implements zzapf
{

	public zzapi(Context context, zzapw zzapw1, int i, boolean flag, zznx zznx1, zzapv zzapv)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void FrameLayout(Context)>
		zzcxm = zzapw1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #42  <Field zzapw zzcxm>
		zzcxo = zznx1;
	//    6   10:aload_0         
	//    7   11:aload           5
	//    8   13:putfield        #44  <Field zznx zzcxo>
		zzcxn = new FrameLayout(context);
	//    9   16:aload_0         
	//   10   17:new             #4   <Class FrameLayout>
	//   11   20:dup             
	//   12   21:aload_1         
	//   13   22:invokespecial   #40  <Method void FrameLayout(Context)>
	//   14   25:putfield        #46  <Field FrameLayout zzcxn>
		addView(((android.view.View) (zzcxn)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   15   28:aload_0         
	//   16   29:aload_0         
	//   17   30:getfield        #46  <Field FrameLayout zzcxn>
	//   18   33:new             #48  <Class android.widget.FrameLayout$LayoutParams>
	//   19   36:dup             
	//   20   37:iconst_m1       
	//   21   38:iconst_m1       
	//   22   39:invokespecial   #51  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   23   42:invokevirtual   #55  <Method void addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		Asserts.checkNotNull(((Object) (zzapw1.zzbi())));
	//   24   45:aload_2         
	//   25   46:invokeinterface #61  <Method zzw zzapw.zzbi()>
	//   26   51:invokestatic    #67  <Method void Asserts.checkNotNull(Object)>
		zzcxr = zzapw1.zzbi().zzwz.zza(context, zzapw1, i, flag, zznx1, zzapv);
	//   27   54:aload_0         
	//   28   55:aload_2         
	//   29   56:invokeinterface #61  <Method zzw zzapw.zzbi()>
	//   30   61:getfield        #73  <Field zzaph zzw.zzwz>
	//   31   64:aload_1         
	//   32   65:aload_2         
	//   33   66:iload_3         
	//   34   67:iload           4
	//   35   69:aload           5
	//   36   71:aload           6
	//   37   73:invokevirtual   #79  <Method zzapg zzaph.zza(Context, zzapw, int, boolean, zznx, zzapv)>
	//   38   76:putfield        #81  <Field zzapg zzcxr>
		if(zzcxr != null)
	//*  39   79:aload_0         
	//*  40   80:getfield        #81  <Field zzapg zzcxr>
	//*  41   83:ifnull          132
		{
			zzcxn.addView(((android.view.View) (zzcxr)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1, 17))));
	//   42   86:aload_0         
	//   43   87:getfield        #46  <Field FrameLayout zzcxn>
	//   44   90:aload_0         
	//   45   91:getfield        #81  <Field zzapg zzcxr>
	//   46   94:new             #48  <Class android.widget.FrameLayout$LayoutParams>
	//   47   97:dup             
	//   48   98:iconst_m1       
	//   49   99:iconst_m1       
	//   50  100:bipush          17
	//   51  102:invokespecial   #84  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//   52  105:invokevirtual   #85  <Method void FrameLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			zzapw1 = ((zzapw) (zznk.zzavg));
	//   53  108:getstatic       #91  <Field zzna zznk.zzavg>
	//   54  111:astore_2        
			if(((Boolean)zzkb.zzik().zzd(((zzna) (zzapw1)))).booleanValue())
	//*  55  112:invokestatic    #97  <Method zzni zzkb.zzik()>
	//*  56  115:aload_2         
	//*  57  116:invokevirtual   #103 <Method Object zzni.zzd(zzna)>
	//*  58  119:checkcast       #105 <Class Boolean>
	//*  59  122:invokevirtual   #109 <Method boolean Boolean.booleanValue()>
	//*  60  125:ifeq            132
				zztd();
	//   61  128:aload_0         
	//   62  129:invokevirtual   #113 <Method void zztd()>
		}
		zzcya = new ImageView(context);
	//   63  132:aload_0         
	//   64  133:new             #115 <Class ImageView>
	//   65  136:dup             
	//   66  137:aload_1         
	//   67  138:invokespecial   #116 <Method void ImageView(Context)>
	//   68  141:putfield        #118 <Field ImageView zzcya>
		context = ((Context) (zznk.zzavk));
	//   69  144:getstatic       #121 <Field zzna zznk.zzavk>
	//   70  147:astore_1        
		zzcxq = ((Long)zzkb.zzik().zzd(((zzna) (context)))).longValue();
	//   71  148:aload_0         
	//   72  149:invokestatic    #97  <Method zzni zzkb.zzik()>
	//   73  152:aload_1         
	//   74  153:invokevirtual   #103 <Method Object zzni.zzd(zzna)>
	//   75  156:checkcast       #123 <Class Long>
	//   76  159:invokevirtual   #127 <Method long Long.longValue()>
	//   77  162:putfield        #129 <Field long zzcxq>
		context = ((Context) (zznk.zzavi));
	//   78  165:getstatic       #132 <Field zzna zznk.zzavi>
	//   79  168:astore_1        
		zzcxv = ((Boolean)zzkb.zzik().zzd(((zzna) (context)))).booleanValue();
	//   80  169:aload_0         
	//   81  170:invokestatic    #97  <Method zzni zzkb.zzik()>
	//   82  173:aload_1         
	//   83  174:invokevirtual   #103 <Method Object zzni.zzd(zzna)>
	//   84  177:checkcast       #105 <Class Boolean>
	//   85  180:invokevirtual   #109 <Method boolean Boolean.booleanValue()>
	//   86  183:putfield        #134 <Field boolean zzcxv>
		if(zzcxo != null)
	//*  87  186:aload_0         
	//*  88  187:getfield        #44  <Field zznx zzcxo>
	//*  89  190:ifnull          221
		{
			zzapw1 = ((zzapw) (zzcxo));
	//   90  193:aload_0         
	//   91  194:getfield        #44  <Field zznx zzcxo>
	//   92  197:astore_2        
			if(zzcxv)
	//*  93  198:aload_0         
	//*  94  199:getfield        #134 <Field boolean zzcxv>
	//*  95  202:ifeq            211
				context = "1";
	//   96  205:ldc1            #136 <String "1">
	//   97  207:astore_1        
			else
	//*  98  208:goto            214
				context = "0";
	//   99  211:ldc1            #138 <String "0">
	//  100  213:astore_1        
			((zznx) (zzapw1)).zze("spinner_used", ((String) (context)));
	//  101  214:aload_2         
	//  102  215:ldc1            #140 <String "spinner_used">
	//  103  217:aload_1         
	//  104  218:invokevirtual   #146 <Method void zznx.zze(String, String)>
		}
	//  105  221:aload_0         
	//  106  222:new             #148 <Class zzapy>
	//  107  225:dup             
	//  108  226:aload_0         
	//  109  227:invokespecial   #151 <Method void zzapy(zzapi)>
	//  110  230:putfield        #153 <Field zzapy zzcxp>
		if(zzcxr != null)
	//* 111  233:aload_0         
	//* 112  234:getfield        #81  <Field zzapg zzcxr>
	//* 113  237:ifnull          248
			zzcxr.zza(((zzapf) (this)));
	//  114  240:aload_0         
	//  115  241:getfield        #81  <Field zzapg zzcxr>
	//  116  244:aload_0         
	//  117  245:invokevirtual   #158 <Method void zzapg.zza(zzapf)>
		if(zzcxr == null)
	//* 118  248:aload_0         
	//* 119  249:getfield        #81  <Field zzapg zzcxr>
	//* 120  252:ifnonnull       263
			zzg("AdVideoUnderlay Error", "Allocating player failed.");
	//  121  255:aload_0         
	//  122  256:ldc1            #160 <String "AdVideoUnderlay Error">
	//  123  258:ldc1            #162 <String "Allocating player failed.">
	//  124  260:invokevirtual   #165 <Method void zzg(String, String)>
	//  125  263:return          
	}

	static void zza(zzapi zzapi1, String s, String as[])
	{
		zzapi1.zza(s, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #170 <Method void zza(String, String[])>
	//    4    6:return          
	}

	public static void zza(zzapw zzapw1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #173 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #175 <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put("event", "no_video_view");
	//    4    8:aload_1         
	//    5    9:ldc1            #177 <String "event">
	//    6   11:ldc1            #179 <String "no_video_view">
	//    7   13:invokevirtual   #183 <Method Object HashMap.put(Object, Object)>
	//    8   16:pop             
		zzapw1.zza("onVideoEvent", ((Map) (hashmap)));
	//    9   17:aload_0         
	//   10   18:ldc1            #185 <String "onVideoEvent">
	//   11   20:aload_1         
	//   12   21:invokeinterface #188 <Method void zzapw.zza(String, Map)>
	//   13   26:return          
	}

	public static void zza(zzapw zzapw1, String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #173 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #175 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("event", "decoderProps");
	//    4    8:aload_2         
	//    5    9:ldc1            #177 <String "event">
	//    6   11:ldc1            #191 <String "decoderProps">
	//    7   13:invokeinterface #194 <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("error", ((Object) (s)));
	//    9   19:aload_2         
	//   10   20:ldc1            #196 <String "error">
	//   11   22:aload_1         
	//   12   23:invokeinterface #194 <Method Object Map.put(Object, Object)>
	//   13   28:pop             
		zzapw1.zza("onVideoEvent", ((Map) (hashmap)));
	//   14   29:aload_0         
	//   15   30:ldc1            #185 <String "onVideoEvent">
	//   16   32:aload_2         
	//   17   33:invokeinterface #188 <Method void zzapw.zza(String, Map)>
	//   18   38:return          
	}

	public static void zza(zzapw zzapw1, Map map)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #173 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #175 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("event", "decoderProps");
	//    4    8:aload_2         
	//    5    9:ldc1            #177 <String "event">
	//    6   11:ldc1            #191 <String "decoderProps">
	//    7   13:invokeinterface #194 <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("mimeTypes", ((Object) (map)));
	//    9   19:aload_2         
	//   10   20:ldc1            #199 <String "mimeTypes">
	//   11   22:aload_1         
	//   12   23:invokeinterface #194 <Method Object Map.put(Object, Object)>
	//   13   28:pop             
		zzapw1.zza("onVideoEvent", ((Map) (hashmap)));
	//   14   29:aload_0         
	//   15   30:ldc1            #185 <String "onVideoEvent">
	//   16   32:aload_2         
	//   17   33:invokeinterface #188 <Method void zzapw.zza(String, Map)>
	//   18   38:return          
	}

	private final transient void zza(String s, String as[])
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #173 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #175 <Method void HashMap()>
	//    3    7:astore          6
		hashmap.put("event", ((Object) (s)));
	//    4    9:aload           6
	//    5   11:ldc1            #177 <String "event">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #183 <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
		int i = 0;
	//    9   18:iconst_0        
	//   10   19:istore_3        
		int j = as.length;
	//   11   20:aload_2         
	//   12   21:arraylength     
	//   13   22:istore          4
		s = null;
	//   14   24:aconst_null     
	//   15   25:astore_1        
		for(; i < j; i++)
	//*  16   26:iload_3         
	//*  17   27:iload           4
	//*  18   29:icmpge          65
		{
			String s1 = as[i];
	//   19   32:aload_2         
	//   20   33:iload_3         
	//   21   34:aaload          
	//   22   35:astore          5
			if(s == null)
	//*  23   37:aload_1         
	//*  24   38:ifnonnull       47
			{
				s = s1;
	//   25   41:aload           5
	//   26   43:astore_1        
			} else
	//*  27   44:goto            58
			{
				hashmap.put(((Object) (s)), ((Object) (s1)));
	//   28   47:aload           6
	//   29   49:aload_1         
	//   30   50:aload           5
	//   31   52:invokevirtual   #183 <Method Object HashMap.put(Object, Object)>
	//   32   55:pop             
				s = null;
	//   33   56:aconst_null     
	//   34   57:astore_1        
			}
		}

	//   35   58:iload_3         
	//   36   59:iconst_1        
	//   37   60:iadd            
	//   38   61:istore_3        
	//*  39   62:goto            26
		zzcxm.zza("onVideoEvent", ((Map) (hashmap)));
	//   40   65:aload_0         
	//   41   66:getfield        #42  <Field zzapw zzcxm>
	//   42   69:ldc1            #185 <String "onVideoEvent">
	//   43   71:aload           6
	//   44   73:invokeinterface #188 <Method void zzapw.zza(String, Map)>
	//   45   78:return          
	}

	private final boolean zztf()
	{
		return zzcya.getParent() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field ImageView zzcya>
	//    2    4:invokevirtual   #206 <Method android.view.ViewParent ImageView.getParent()>
	//    3    7:ifnull          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private final void zztg()
	{
		if(zzcxm.zzto() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field zzapw zzcxm>
	//*   2    4:invokeinterface #211 <Method Activity zzapw.zzto()>
	//*   3    9:ifnonnull       13
			return;
	//    4   12:return          
		if(zzcxt && !zzcxu)
	//*   5   13:aload_0         
	//*   6   14:getfield        #213 <Field boolean zzcxt>
	//*   7   17:ifeq            50
	//*   8   20:aload_0         
	//*   9   21:getfield        #215 <Field boolean zzcxu>
	//*  10   24:ifne            50
		{
			zzcxm.zzto().getWindow().clearFlags(128);
	//   11   27:aload_0         
	//   12   28:getfield        #42  <Field zzapw zzcxm>
	//   13   31:invokeinterface #211 <Method Activity zzapw.zzto()>
	//   14   36:invokevirtual   #221 <Method Window Activity.getWindow()>
	//   15   39:sipush          128
	//   16   42:invokevirtual   #227 <Method void Window.clearFlags(int)>
			zzcxt = false;
	//   17   45:aload_0         
	//   18   46:iconst_0        
	//   19   47:putfield        #213 <Field boolean zzcxt>
		}
	//   20   50:return          
	}

	public final void destroy()
	{
		zzcxp.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field zzapy zzcxp>
	//    2    4:invokevirtual   #231 <Method void zzapy.pause()>
		if(zzcxr != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field zzapg zzcxr>
	//*   5   11:ifnull          21
			zzcxr.stop();
	//    6   14:aload_0         
	//    7   15:getfield        #81  <Field zzapg zzcxr>
	//    8   18:invokevirtual   #234 <Method void zzapg.stop()>
		zztg();
	//    9   21:aload_0         
	//   10   22:invokespecial   #236 <Method void zztg()>
	//   11   25:return          
	}

	public final void finalize()
		throws Throwable
	{
		zzcxp.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field zzapy zzcxp>
	//    2    4:invokevirtual   #231 <Method void zzapy.pause()>
		if(zzcxr != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field zzapg zzcxr>
	//*   5   11:ifnull          38
		{
			zzapg zzapg1 = zzcxr;
	//    6   14:aload_0         
	//    7   15:getfield        #81  <Field zzapg zzcxr>
	//    8   18:astore_1        
			Executor executor = zzaoe.zzcvy;
	//    9   19:getstatic       #245 <Field Executor zzaoe.zzcvy>
	//   10   22:astore_2        
			((Object) (zzapg1)).getClass();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #251 <Method Class Object.getClass()>
	//   13   27:pop             
			executor.execute(zzapj.zza(zzapg1));
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokestatic    #256 <Method Runnable zzapj.zza(zzapg)>
	//   17   33:invokeinterface #262 <Method void Executor.execute(Runnable)>
		}
		((Object)this).finalize();
	//   18   38:aload_0         
	//   19   39:invokespecial   #264 <Method void Object.finalize()>
		return;
	//   20   42:return          
		Exception exception;
		exception;
	//   21   43:astore_1        
		((Object)this).finalize();
	//   22   44:aload_0         
	//   23   45:invokespecial   #264 <Method void Object.finalize()>
		throw exception;
	//   24   48:aload_1         
	//   25   49:athrow          
	}

	public final void onPaused()
	{
		zza("pause", new String[0]);
	//    0    0:aload_0         
	//    1    1:ldc2            #267 <String "pause">
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #170 <Method void zza(String, String[])>
		zztg();
	//    5   11:aload_0         
	//    6   12:invokespecial   #236 <Method void zztg()>
		zzcxs = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #271 <Field boolean zzcxs>
	//   10   20:return          
	}

	public final void onWindowVisibilityChanged(int i)
	{
		boolean flag;
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            16
		{
			zzcxp.resume();
	//    2    4:aload_0         
	//    3    5:getfield        #153 <Field zzapy zzcxp>
	//    4    8:invokevirtual   #275 <Method void zzapy.resume()>
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		} else
	//*   7   13:goto            33
		{
			zzcxp.pause();
	//    8   16:aload_0         
	//    9   17:getfield        #153 <Field zzapy zzcxp>
	//   10   20:invokevirtual   #231 <Method void zzapy.pause()>
			zzcxx = zzcxw;
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #277 <Field long zzcxw>
	//   14   28:putfield        #279 <Field long zzcxx>
			flag = false;
	//   15   31:iconst_0        
	//   16   32:istore_2        
		}
		zzakk.zzcrm.post(((Runnable) (new zzapm(this, flag))));
	//   17   33:getstatic       #285 <Field Handler zzakk.zzcrm>
	//   18   36:new             #287 <Class zzapm>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:iload_2         
	//   22   42:invokespecial   #290 <Method void zzapm(zzapi, boolean)>
	//   23   45:invokevirtual   #296 <Method boolean Handler.post(Runnable)>
	//   24   48:pop             
	//   25   49:return          
	}

	public final void pause()
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			zzcxr.pause();
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field zzapg zzcxr>
	//    6   12:invokevirtual   #297 <Method void zzapg.pause()>
			return;
	//    7   15:return          
		}
	}

	public final void play()
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			zzcxr.play();
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field zzapg zzcxr>
	//    6   12:invokevirtual   #300 <Method void zzapg.play()>
			return;
	//    7   15:return          
		}
	}

	public final void seekTo(int i)
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			zzcxr.seekTo(i);
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field zzapg zzcxr>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #303 <Method void zzapg.seekTo(int)>
			return;
	//    8   16:return          
		}
	}

	public final void setVolume(float f)
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			zzapg zzapg1 = zzcxr;
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field zzapg zzcxr>
	//    6   12:astore_2        
			zzapg1.zzcxl.setVolume(f);
	//    7   13:aload_2         
	//    8   14:getfield        #309 <Field zzapz zzapg.zzcxl>
	//    9   17:fload_1         
	//   10   18:invokevirtual   #313 <Method void zzapz.setVolume(float)>
			zzapg1.zzst();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #316 <Method void zzapg.zzst()>
			return;
	//   13   25:return          
		}
	}

	public final void zza(float f, float f1)
	{
		if(zzcxr != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnull          16
			zzcxr.zza(f, f1);
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field zzapg zzcxr>
	//    5   11:fload_1         
	//    6   12:fload_2         
	//    7   13:invokevirtual   #319 <Method void zzapg.zza(float, float)>
	//    8   16:return          
	}

	public final void zzd(int i, int j, int k, int l)
	{
		if(k != 0)
	//*   0    0:iload_3         
	//*   1    1:ifeq            44
		{
			if(l == 0)
	//*   2    4:iload           4
	//*   3    6:ifne            10
				return;
	//    4    9:return          
			android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k, l);
	//    5   10:new             #48  <Class android.widget.FrameLayout$LayoutParams>
	//    6   13:dup             
	//    7   14:iload_3         
	//    8   15:iload           4
	//    9   17:invokespecial   #51  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   10   20:astore          5
			layoutparams.setMargins(i, j, 0, 0);
	//   11   22:aload           5
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:iconst_0        
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #323 <Method void android.widget.FrameLayout$LayoutParams.setMargins(int, int, int, int)>
			zzcxn.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   17   31:aload_0         
	//   18   32:getfield        #46  <Field FrameLayout zzcxn>
	//   19   35:aload           5
	//   20   37:invokevirtual   #327 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			requestLayout();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #330 <Method void requestLayout()>
		}
	//   23   44:return          
	}

	public final void zzdn(String s)
	{
		zzcxy = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #334 <Field String zzcxy>
	//    3    5:return          
	}

	public final void zzf(int i, int j)
	{
		if(zzcxv)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field boolean zzcxv>
	//*   2    4:ifeq            101
		{
			zzna zzna = zznk.zzavj;
	//    3    7:getstatic       #338 <Field zzna zznk.zzavj>
	//    4   10:astore_3        
			i = Math.max(i / ((Integer)zzkb.zzik().zzd(zzna)).intValue(), 1);
	//    5   11:iload_1         
	//    6   12:invokestatic    #97  <Method zzni zzkb.zzik()>
	//    7   15:aload_3         
	//    8   16:invokevirtual   #103 <Method Object zzni.zzd(zzna)>
	//    9   19:checkcast       #340 <Class Integer>
	//   10   22:invokevirtual   #344 <Method int Integer.intValue()>
	//   11   25:idiv            
	//   12   26:iconst_1        
	//   13   27:invokestatic    #350 <Method int Math.max(int, int)>
	//   14   30:istore_1        
			zzna = zznk.zzavj;
	//   15   31:getstatic       #338 <Field zzna zznk.zzavj>
	//   16   34:astore_3        
			j = Math.max(j / ((Integer)zzkb.zzik().zzd(zzna)).intValue(), 1);
	//   17   35:iload_2         
	//   18   36:invokestatic    #97  <Method zzni zzkb.zzik()>
	//   19   39:aload_3         
	//   20   40:invokevirtual   #103 <Method Object zzni.zzd(zzna)>
	//   21   43:checkcast       #340 <Class Integer>
	//   22   46:invokevirtual   #344 <Method int Integer.intValue()>
	//   23   49:idiv            
	//   24   50:iconst_1        
	//   25   51:invokestatic    #350 <Method int Math.max(int, int)>
	//   26   54:istore_2        
			if(zzcxz == null || zzcxz.getWidth() != i || zzcxz.getHeight() != j)
	//*  27   55:aload_0         
	//*  28   56:getfield        #352 <Field Bitmap zzcxz>
	//*  29   59:ifnull          84
	//*  30   62:aload_0         
	//*  31   63:getfield        #352 <Field Bitmap zzcxz>
	//*  32   66:invokevirtual   #357 <Method int Bitmap.getWidth()>
	//*  33   69:iload_1         
	//*  34   70:icmpne          84
	//*  35   73:aload_0         
	//*  36   74:getfield        #352 <Field Bitmap zzcxz>
	//*  37   77:invokevirtual   #360 <Method int Bitmap.getHeight()>
	//*  38   80:iload_2         
	//*  39   81:icmpeq          101
			{
				zzcxz = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//   40   84:aload_0         
	//   41   85:iload_1         
	//   42   86:iload_2         
	//   43   87:getstatic       #366 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   44   90:invokestatic    #370 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   45   93:putfield        #352 <Field Bitmap zzcxz>
				zzcyb = false;
	//   46   96:aload_0         
	//   47   97:iconst_0        
	//   48   98:putfield        #372 <Field boolean zzcyb>
			}
		}
	//   49  101:return          
	}

	public final void zzf(MotionEvent motionevent)
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			zzcxr.dispatchTouchEvent(motionevent);
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field zzapg zzcxr>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #380 <Method boolean zzapg.dispatchTouchEvent(MotionEvent)>
	//    8   16:pop             
			return;
	//    9   17:return          
		}
	}

	public final void zzg(String s, String s1)
	{
		zza("error", new String[] {
			"what", s, "extra", s1
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #196 <String "error">
	//    2    3:iconst_4        
	//    3    4:anewarray       String[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc2            #383 <String "what">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_1         
	//   11   16:aastore         
	//   12   17:dup             
	//   13   18:iconst_2        
	//   14   19:ldc2            #385 <String "extra">
	//   15   22:aastore         
	//   16   23:dup             
	//   17   24:iconst_3        
	//   18   25:aload_2         
	//   19   26:aastore         
	//   20   27:invokespecial   #170 <Method void zza(String, String[])>
	//   21   30:return          
	}

	public final void zzsu()
	{
		zzcxp.resume();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field zzapy zzcxp>
	//    2    4:invokevirtual   #275 <Method void zzapy.resume()>
		zzakk.zzcrm.post(((Runnable) (new zzapk(this))));
	//    3    7:getstatic       #285 <Field Handler zzakk.zzcrm>
	//    4   10:new             #389 <Class zzapk>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #390 <Method void zzapk(zzapi)>
	//    8   18:invokevirtual   #296 <Method boolean Handler.post(Runnable)>
	//    9   21:pop             
	//   10   22:return          
	}

	public final void zzsv()
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(zzcxx == 0L)
	//*   4    8:aload_0         
	//*   5    9:getfield        #279 <Field long zzcxx>
	//*   6   12:lconst_0        
	//*   7   13:lcmp            
	//*   8   14:ifne            91
			zza("canplaythrough", new String[] {
				"duration", String.valueOf((float)zzcxr.getDuration() / 1000F), "videoWidth", String.valueOf(zzcxr.getVideoWidth()), "videoHeight", String.valueOf(zzcxr.getVideoHeight())
			});
	//    9   17:aload_0         
	//   10   18:ldc2            #393 <String "canplaythrough">
	//   11   21:bipush          6
	//   12   23:anewarray       String[]
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:ldc2            #395 <String "duration">
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_1        
	//   19   34:aload_0         
	//   20   35:getfield        #81  <Field zzapg zzcxr>
	//   21   38:invokevirtual   #398 <Method int zzapg.getDuration()>
	//   22   41:i2f             
	//   23   42:ldc2            #399 <Float 1000F>
	//   24   45:fdiv            
	//   25   46:invokestatic    #403 <Method String String.valueOf(float)>
	//   26   49:aastore         
	//   27   50:dup             
	//   28   51:iconst_2        
	//   29   52:ldc2            #405 <String "videoWidth">
	//   30   55:aastore         
	//   31   56:dup             
	//   32   57:iconst_3        
	//   33   58:aload_0         
	//   34   59:getfield        #81  <Field zzapg zzcxr>
	//   35   62:invokevirtual   #408 <Method int zzapg.getVideoWidth()>
	//   36   65:invokestatic    #411 <Method String String.valueOf(int)>
	//   37   68:aastore         
	//   38   69:dup             
	//   39   70:iconst_4        
	//   40   71:ldc2            #413 <String "videoHeight">
	//   41   74:aastore         
	//   42   75:dup             
	//   43   76:iconst_5        
	//   44   77:aload_0         
	//   45   78:getfield        #81  <Field zzapg zzcxr>
	//   46   81:invokevirtual   #416 <Method int zzapg.getVideoHeight()>
	//   47   84:invokestatic    #411 <Method String String.valueOf(int)>
	//   48   87:aastore         
	//   49   88:invokespecial   #170 <Method void zza(String, String[])>
	//   50   91:return          
	}

	public final void zzsw()
	{
		if(zzcxm.zzto() != null && !zzcxt)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field zzapw zzcxm>
	//*   2    4:invokeinterface #211 <Method Activity zzapw.zzto()>
	//*   3    9:ifnull          86
	//*   4   12:aload_0         
	//*   5   13:getfield        #213 <Field boolean zzcxt>
	//*   6   16:ifne            86
		{
			boolean flag;
			if((zzcxm.zzto().getWindow().getAttributes().flags & 0x80) != 0)
	//*   7   19:aload_0         
	//*   8   20:getfield        #42  <Field zzapw zzcxm>
	//*   9   23:invokeinterface #211 <Method Activity zzapw.zzto()>
	//*  10   28:invokevirtual   #221 <Method Window Activity.getWindow()>
	//*  11   31:invokevirtual   #421 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//*  12   34:getfield        #427 <Field int android.view.WindowManager$LayoutParams.flags>
	//*  13   37:sipush          128
	//*  14   40:iand            
	//*  15   41:ifeq            49
				flag = true;
	//   16   44:iconst_1        
	//   17   45:istore_1        
			else
	//*  18   46:goto            51
				flag = false;
	//   19   49:iconst_0        
	//   20   50:istore_1        
			zzcxu = flag;
	//   21   51:aload_0         
	//   22   52:iload_1         
	//   23   53:putfield        #215 <Field boolean zzcxu>
			if(!zzcxu)
	//*  24   56:aload_0         
	//*  25   57:getfield        #215 <Field boolean zzcxu>
	//*  26   60:ifne            86
			{
				zzcxm.zzto().getWindow().addFlags(128);
	//   27   63:aload_0         
	//   28   64:getfield        #42  <Field zzapw zzcxm>
	//   29   67:invokeinterface #211 <Method Activity zzapw.zzto()>
	//   30   72:invokevirtual   #221 <Method Window Activity.getWindow()>
	//   31   75:sipush          128
	//   32   78:invokevirtual   #430 <Method void Window.addFlags(int)>
				zzcxt = true;
	//   33   81:aload_0         
	//   34   82:iconst_1        
	//   35   83:putfield        #213 <Field boolean zzcxt>
			}
		}
		zzcxs = true;
	//   36   86:aload_0         
	//   37   87:iconst_1        
	//   38   88:putfield        #271 <Field boolean zzcxs>
	//   39   91:return          
	}

	public final void zzsx()
	{
		zza("ended", new String[0]);
	//    0    0:aload_0         
	//    1    1:ldc2            #433 <String "ended">
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #170 <Method void zza(String, String[])>
		zztg();
	//    5   11:aload_0         
	//    6   12:invokespecial   #236 <Method void zztg()>
	//    7   15:return          
	}

	public final void zzsy()
	{
		if(zzcyb && zzcxz != null && !zztf())
	//*   0    0:aload_0         
	//*   1    1:getfield        #372 <Field boolean zzcyb>
	//*   2    4:ifeq            70
	//*   3    7:aload_0         
	//*   4    8:getfield        #352 <Field Bitmap zzcxz>
	//*   5   11:ifnull          70
	//*   6   14:aload_0         
	//*   7   15:invokespecial   #436 <Method boolean zztf()>
	//*   8   18:ifne            70
		{
			zzcya.setImageBitmap(zzcxz);
	//    9   21:aload_0         
	//   10   22:getfield        #118 <Field ImageView zzcya>
	//   11   25:aload_0         
	//   12   26:getfield        #352 <Field Bitmap zzcxz>
	//   13   29:invokevirtual   #440 <Method void ImageView.setImageBitmap(Bitmap)>
			zzcya.invalidate();
	//   14   32:aload_0         
	//   15   33:getfield        #118 <Field ImageView zzcya>
	//   16   36:invokevirtual   #443 <Method void ImageView.invalidate()>
			zzcxn.addView(((android.view.View) (zzcya)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   17   39:aload_0         
	//   18   40:getfield        #46  <Field FrameLayout zzcxn>
	//   19   43:aload_0         
	//   20   44:getfield        #118 <Field ImageView zzcya>
	//   21   47:new             #48  <Class android.widget.FrameLayout$LayoutParams>
	//   22   50:dup             
	//   23   51:iconst_m1       
	//   24   52:iconst_m1       
	//   25   53:invokespecial   #51  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   26   56:invokevirtual   #85  <Method void FrameLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			zzcxn.bringChildToFront(((android.view.View) (zzcya)));
	//   27   59:aload_0         
	//   28   60:getfield        #46  <Field FrameLayout zzcxn>
	//   29   63:aload_0         
	//   30   64:getfield        #118 <Field ImageView zzcya>
	//   31   67:invokevirtual   #447 <Method void FrameLayout.bringChildToFront(android.view.View)>
		}
		zzcxp.pause();
	//   32   70:aload_0         
	//   33   71:getfield        #153 <Field zzapy zzcxp>
	//   34   74:invokevirtual   #231 <Method void zzapy.pause()>
		zzcxx = zzcxw;
	//   35   77:aload_0         
	//   36   78:aload_0         
	//   37   79:getfield        #277 <Field long zzcxw>
	//   38   82:putfield        #279 <Field long zzcxx>
		zzakk.zzcrm.post(((Runnable) (new zzapl(this))));
	//   39   85:getstatic       #285 <Field Handler zzakk.zzcrm>
	//   40   88:new             #449 <Class zzapl>
	//   41   91:dup             
	//   42   92:aload_0         
	//   43   93:invokespecial   #450 <Method void zzapl(zzapi)>
	//   44   96:invokevirtual   #296 <Method boolean Handler.post(Runnable)>
	//   45   99:pop             
	//   46  100:return          
	}

	public final void zzsz()
	{
		if(zzcxs && zztf())
	//*   0    0:aload_0         
	//*   1    1:getfield        #271 <Field boolean zzcxs>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #436 <Method boolean zztf()>
	//*   5   11:ifeq            25
			zzcxn.removeView(((android.view.View) (zzcya)));
	//    6   14:aload_0         
	//    7   15:getfield        #46  <Field FrameLayout zzcxn>
	//    8   18:aload_0         
	//    9   19:getfield        #118 <Field ImageView zzcya>
	//   10   22:invokevirtual   #454 <Method void FrameLayout.removeView(android.view.View)>
		if(zzcxz != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #352 <Field Bitmap zzcxz>
	//*  13   29:ifnull          162
		{
			long l = zzbv.zzer().elapsedRealtime();
	//   14   32:invokestatic    #460 <Method Clock zzbv.zzer()>
	//   15   35:invokeinterface #465 <Method long Clock.elapsedRealtime()>
	//   16   40:lstore_1        
			if(zzcxr.getBitmap(zzcxz) != null)
	//*  17   41:aload_0         
	//*  18   42:getfield        #81  <Field zzapg zzcxr>
	//*  19   45:aload_0         
	//*  20   46:getfield        #352 <Field Bitmap zzcxz>
	//*  21   49:invokevirtual   #469 <Method Bitmap zzapg.getBitmap(Bitmap)>
	//*  22   52:ifnull          60
				zzcyb = true;
	//   23   55:aload_0         
	//   24   56:iconst_1        
	//   25   57:putfield        #372 <Field boolean zzcyb>
			l = zzbv.zzer().elapsedRealtime() - l;
	//   26   60:invokestatic    #460 <Method Clock zzbv.zzer()>
	//   27   63:invokeinterface #465 <Method long Clock.elapsedRealtime()>
	//   28   68:lload_1         
	//   29   69:lsub            
	//   30   70:lstore_1        
			if(zzakb.zzqp())
	//*  31   71:invokestatic    #474 <Method boolean zzakb.zzqp()>
	//*  32   74:ifeq            116
			{
				StringBuilder stringbuilder = new StringBuilder(46);
	//   33   77:new             #476 <Class StringBuilder>
	//   34   80:dup             
	//   35   81:bipush          46
	//   36   83:invokespecial   #478 <Method void StringBuilder(int)>
	//   37   86:astore_3        
				stringbuilder.append("Spinner frame grab took ");
	//   38   87:aload_3         
	//   39   88:ldc2            #480 <String "Spinner frame grab took ">
	//   40   91:invokevirtual   #484 <Method StringBuilder StringBuilder.append(String)>
	//   41   94:pop             
				stringbuilder.append(l);
	//   42   95:aload_3         
	//   43   96:lload_1         
	//   44   97:invokevirtual   #487 <Method StringBuilder StringBuilder.append(long)>
	//   45  100:pop             
				stringbuilder.append("ms");
	//   46  101:aload_3         
	//   47  102:ldc2            #489 <String "ms">
	//   48  105:invokevirtual   #484 <Method StringBuilder StringBuilder.append(String)>
	//   49  108:pop             
				zzakb.v(stringbuilder.toString());
	//   50  109:aload_3         
	//   51  110:invokevirtual   #493 <Method String StringBuilder.toString()>
	//   52  113:invokestatic    #496 <Method void zzakb.v(String)>
			}
			if(l > zzcxq)
	//*  53  116:lload_1         
	//*  54  117:aload_0         
	//*  55  118:getfield        #129 <Field long zzcxq>
	//*  56  121:lcmp            
	//*  57  122:ifle            162
			{
				zzakb.zzdk("Spinner frame grab crossed jank threshold! Suspending spinner.");
	//   58  125:ldc2            #498 <String "Spinner frame grab crossed jank threshold! Suspending spinner.">
	//   59  128:invokestatic    #501 <Method void zzakb.zzdk(String)>
				zzcxv = false;
	//   60  131:aload_0         
	//   61  132:iconst_0        
	//   62  133:putfield        #134 <Field boolean zzcxv>
				zzcxz = null;
	//   63  136:aload_0         
	//   64  137:aconst_null     
	//   65  138:putfield        #352 <Field Bitmap zzcxz>
				if(zzcxo != null)
	//*  66  141:aload_0         
	//*  67  142:getfield        #44  <Field zznx zzcxo>
	//*  68  145:ifnull          162
					zzcxo.zze("spinner_jank", Long.toString(l));
	//   69  148:aload_0         
	//   70  149:getfield        #44  <Field zznx zzcxo>
	//   71  152:ldc2            #503 <String "spinner_jank">
	//   72  155:lload_1         
	//   73  156:invokestatic    #506 <Method String Long.toString(long)>
	//   74  159:invokevirtual   #146 <Method void zznx.zze(String, String)>
			}
		}
	//   75  162:return          
	}

	public final void zzta()
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(!TextUtils.isEmpty(((CharSequence) (zzcxy))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #334 <Field String zzcxy>
	//*   6   12:invokestatic    #513 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   15:ifne            30
		{
			zzcxr.setVideoPath(zzcxy);
	//    8   18:aload_0         
	//    9   19:getfield        #81  <Field zzapg zzcxr>
	//   10   22:aload_0         
	//   11   23:getfield        #334 <Field String zzcxy>
	//   12   26:invokevirtual   #516 <Method void zzapg.setVideoPath(String)>
			return;
	//   13   29:return          
		} else
		{
			zza("no_src", new String[0]);
	//   14   30:aload_0         
	//   15   31:ldc2            #518 <String "no_src">
	//   16   34:iconst_0        
	//   17   35:anewarray       String[]
	//   18   38:invokespecial   #170 <Method void zza(String, String[])>
			return;
	//   19   41:return          
		}
	}

	public final void zztb()
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			zzapg zzapg1 = zzcxr;
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field zzapg zzcxr>
	//    6   12:astore_1        
			zzapg1.zzcxl.setMuted(true);
	//    7   13:aload_1         
	//    8   14:getfield        #309 <Field zzapz zzapg.zzcxl>
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #523 <Method void zzapz.setMuted(boolean)>
			zzapg1.zzst();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #316 <Method void zzapg.zzst()>
			return;
	//   13   25:return          
		}
	}

	public final void zztc()
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			zzapg zzapg1 = zzcxr;
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field zzapg zzcxr>
	//    6   12:astore_1        
			zzapg1.zzcxl.setMuted(false);
	//    7   13:aload_1         
	//    8   14:getfield        #309 <Field zzapz zzapg.zzcxl>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #523 <Method void zzapz.setMuted(boolean)>
			zzapg1.zzst();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #316 <Method void zzapg.zzst()>
			return;
	//   13   25:return          
		}
	}

	public final void zztd()
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		TextView textview = new TextView(zzcxr.getContext());
	//    4    8:new             #526 <Class TextView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #81  <Field zzapg zzcxr>
	//    8   16:invokevirtual   #530 <Method Context zzapg.getContext()>
	//    9   19:invokespecial   #531 <Method void TextView(Context)>
	//   10   22:astore_2        
		String s = String.valueOf(((Object) (zzcxr.zzsp())));
	//   11   23:aload_0         
	//   12   24:getfield        #81  <Field zzapg zzcxr>
	//   13   27:invokevirtual   #534 <Method String zzapg.zzsp()>
	//   14   30:invokestatic    #537 <Method String String.valueOf(Object)>
	//   15   33:astore_1        
		if(s.length() != 0)
	//*  16   34:aload_1         
	//*  17   35:invokevirtual   #540 <Method int String.length()>
	//*  18   38:ifeq            52
			s = "AdMob - ".concat(s);
	//   19   41:ldc2            #542 <String "AdMob - ">
	//   20   44:aload_1         
	//   21   45:invokevirtual   #546 <Method String String.concat(String)>
	//   22   48:astore_1        
		else
	//*  23   49:goto            63
			s = new String("AdMob - ");
	//   24   52:new             #269 <Class String>
	//   25   55:dup             
	//   26   56:ldc2            #542 <String "AdMob - ">
	//   27   59:invokespecial   #548 <Method void String(String)>
	//   28   62:astore_1        
		textview.setText(((CharSequence) (s)));
	//   29   63:aload_2         
	//   30   64:aload_1         
	//   31   65:invokevirtual   #552 <Method void TextView.setText(CharSequence)>
		textview.setTextColor(0xffff0000);
	//   32   68:aload_2         
	//   33   69:ldc2            #553 <Int 0xffff0000>
	//   34   72:invokevirtual   #556 <Method void TextView.setTextColor(int)>
		textview.setBackgroundColor(-256);
	//   35   75:aload_2         
	//   36   76:sipush          -256
	//   37   79:invokevirtual   #559 <Method void TextView.setBackgroundColor(int)>
		zzcxn.addView(((android.view.View) (textview)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2, 17))));
	//   38   82:aload_0         
	//   39   83:getfield        #46  <Field FrameLayout zzcxn>
	//   40   86:aload_2         
	//   41   87:new             #48  <Class android.widget.FrameLayout$LayoutParams>
	//   42   90:dup             
	//   43   91:bipush          -2
	//   44   93:bipush          -2
	//   45   95:bipush          17
	//   46   97:invokespecial   #84  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//   47  100:invokevirtual   #85  <Method void FrameLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		zzcxn.bringChildToFront(((android.view.View) (textview)));
	//   48  103:aload_0         
	//   49  104:getfield        #46  <Field FrameLayout zzcxn>
	//   50  107:aload_2         
	//   51  108:invokevirtual   #447 <Method void FrameLayout.bringChildToFront(android.view.View)>
	//   52  111:return          
	}

	final void zzte()
	{
		if(zzcxr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field zzapg zzcxr>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		long l = zzcxr.getCurrentPosition();
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field zzapg zzcxr>
	//    6   12:invokevirtual   #563 <Method int zzapg.getCurrentPosition()>
	//    7   15:i2l             
	//    8   16:lstore_1        
		if(zzcxw != l && l > 0L)
	//*   9   17:aload_0         
	//*  10   18:getfield        #277 <Field long zzcxw>
	//*  11   21:lload_1         
	//*  12   22:lcmp            
	//*  13   23:ifeq            66
	//*  14   26:lload_1         
	//*  15   27:lconst_0        
	//*  16   28:lcmp            
	//*  17   29:ifle            66
		{
			zza("timeupdate", new String[] {
				"time", String.valueOf((float)l / 1000F)
			});
	//   18   32:aload_0         
	//   19   33:ldc2            #565 <String "timeupdate">
	//   20   36:iconst_2        
	//   21   37:anewarray       String[]
	//   22   40:dup             
	//   23   41:iconst_0        
	//   24   42:ldc2            #567 <String "time">
	//   25   45:aastore         
	//   26   46:dup             
	//   27   47:iconst_1        
	//   28   48:lload_1         
	//   29   49:l2f             
	//   30   50:ldc2            #399 <Float 1000F>
	//   31   53:fdiv            
	//   32   54:invokestatic    #403 <Method String String.valueOf(float)>
	//   33   57:aastore         
	//   34   58:invokespecial   #170 <Method void zza(String, String[])>
			zzcxw = l;
	//   35   61:aload_0         
	//   36   62:lload_1         
	//   37   63:putfield        #277 <Field long zzcxw>
		}
	//   38   66:return          
	}

	private final zzapw zzcxm;
	private final FrameLayout zzcxn;
	private final zznx zzcxo;
	private final zzapy zzcxp = new zzapy(this);
	private final long zzcxq;
	private zzapg zzcxr;
	private boolean zzcxs;
	private boolean zzcxt;
	private boolean zzcxu;
	private boolean zzcxv;
	private long zzcxw;
	private long zzcxx;
	private String zzcxy;
	private Bitmap zzcxz;
	private ImageView zzcya;
	private boolean zzcyb;
}
