// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzals, zznk, zzkb, zzni, 
//			zzakb, zzapg, zzalp, zzalr, 
//			zzang, zzakk, zznq, zznx, 
//			zznv

public final class zzapx
{

	public zzapx(Context context, zzang zzang1, String s, zznx zznx1, zznv zznv)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #43  <Class zzals>
	//    4    8:dup             
	//    5    9:invokespecial   #44  <Method void zzals()>
	//    6   12:ldc1            #46  <String "min_1">
	//    7   14:ldc2w           #47  <Double 4.9406564584124654E-324D>
	//    8   17:dconst_1        
	//    9   18:invokevirtual   #52  <Method zzals zzals.zza(String, double, double)>
	//   10   21:ldc1            #54  <String "1_5">
	//   11   23:dconst_1        
	//   12   24:ldc2w           #55  <Double 5D>
	//   13   27:invokevirtual   #52  <Method zzals zzals.zza(String, double, double)>
	//   14   30:ldc1            #58  <String "5_10">
	//   15   32:ldc2w           #55  <Double 5D>
	//   16   35:ldc2w           #59  <Double 10D>
	//   17   38:invokevirtual   #52  <Method zzals zzals.zza(String, double, double)>
	//   18   41:ldc1            #62  <String "10_20">
	//   19   43:ldc2w           #59  <Double 10D>
	//   20   46:ldc2w           #63  <Double 20D>
	//   21   49:invokevirtual   #52  <Method zzals zzals.zza(String, double, double)>
	//   22   52:ldc1            #66  <String "20_30">
	//   23   54:ldc2w           #63  <Double 20D>
	//   24   57:ldc2w           #67  <Double 30D>
	//   25   60:invokevirtual   #52  <Method zzals zzals.zza(String, double, double)>
	//   26   63:ldc1            #70  <String "30_max">
	//   27   65:ldc2w           #67  <Double 30D>
	//   28   68:ldc2w           #71  <Double 1.7976931348623157E+308D>
	//   29   71:invokevirtual   #52  <Method zzals zzals.zza(String, double, double)>
	//   30   74:invokevirtual   #76  <Method zzalp zzals.zzrz()>
	//   31   77:putfield        #78  <Field zzalp zzdae>
		int i = 0;
	//   32   80:iconst_0        
	//   33   81:istore          6
		zzdah = false;
	//   34   83:aload_0         
	//   35   84:iconst_0        
	//   36   85:putfield        #80  <Field boolean zzdah>
		zzdai = false;
	//   37   88:aload_0         
	//   38   89:iconst_0        
	//   39   90:putfield        #82  <Field boolean zzdai>
		zzdaj = false;
	//   40   93:aload_0         
	//   41   94:iconst_0        
	//   42   95:putfield        #84  <Field boolean zzdaj>
		zzdak = false;
	//   43   98:aload_0         
	//   44   99:iconst_0        
	//   45  100:putfield        #86  <Field boolean zzdak>
		zzdao = -1L;
	//   46  103:aload_0         
	//   47  104:ldc2w           #87  <Long -1L>
	//   48  107:putfield        #90  <Field long zzdao>
		mContext = context;
	//   49  110:aload_0         
	//   50  111:aload_1         
	//   51  112:putfield        #92  <Field Context mContext>
		zzzw = zzang1;
	//   52  115:aload_0         
	//   53  116:aload_2         
	//   54  117:putfield        #94  <Field zzang zzzw>
		zzchp = s;
	//   55  120:aload_0         
	//   56  121:aload_3         
	//   57  122:putfield        #96  <Field String zzchp>
		zzcxo = zznx1;
	//   58  125:aload_0         
	//   59  126:aload           4
	//   60  128:putfield        #98  <Field zznx zzcxo>
		zzdad = zznv;
	//   61  131:aload_0         
	//   62  132:aload           5
	//   63  134:putfield        #100 <Field zznv zzdad>
		context = ((Context) (zznk.zzave));
	//   64  137:getstatic       #106 <Field zzna zznk.zzave>
	//   65  140:astore_1        
		context = ((Context) ((String)zzkb.zzik().zzd(((zzna) (context)))));
	//   66  141:invokestatic    #112 <Method zzni zzkb.zzik()>
	//   67  144:aload_1         
	//   68  145:invokevirtual   #118 <Method Object zzni.zzd(zzna)>
	//   69  148:checkcast       #120 <Class String>
	//   70  151:astore_1        
		if(context == null)
	//*  71  152:aload_1         
	//*  72  153:ifnonnull       172
		{
			zzdag = new String[0];
	//   73  156:aload_0         
	//   74  157:iconst_0        
	//   75  158:anewarray       String[]
	//   76  161:putfield        #122 <Field String[] zzdag>
			zzdaf = new long[0];
	//   77  164:aload_0         
	//   78  165:iconst_0        
	//   79  166:newarray        long[]
	//   80  168:putfield        #124 <Field long[] zzdaf>
			return;
	//   81  171:return          
		}
		context = ((Context) (TextUtils.split(((String) (context)), ",")));
	//   82  172:aload_1         
	//   83  173:ldc1            #126 <String ",">
	//   84  175:invokestatic    #132 <Method String[] TextUtils.split(String, String)>
	//   85  178:astore_1        
		zzdag = new String[context.length];
	//   86  179:aload_0         
	//   87  180:aload_1         
	//   88  181:arraylength     
	//   89  182:anewarray       String[]
	//   90  185:putfield        #122 <Field String[] zzdag>
		zzdaf = new long[context.length];
	//   91  188:aload_0         
	//   92  189:aload_1         
	//   93  190:arraylength     
	//   94  191:newarray        long[]
	//   95  193:putfield        #124 <Field long[] zzdaf>
		for(; i < context.length; i++)
	//*  96  196:iload           6
	//*  97  198:aload_1         
	//*  98  199:arraylength     
	//*  99  200:icmpge          246
		{
			try
			{
				zzdaf[i] = Long.parseLong(((String) (context[i])));
	//  100  203:aload_0         
	//  101  204:getfield        #124 <Field long[] zzdaf>
	//  102  207:iload           6
	//  103  209:aload_1         
	//  104  210:iload           6
	//  105  212:aaload          
	//  106  213:invokestatic    #138 <Method long Long.parseLong(String)>
	//  107  216:lastore         
				continue;
	//  108  217:goto            237
			}
			// Misplaced declaration of an exception variable
			catch(zzang zzang1)
	//* 109  220:astore_2        
			{
				zzakb.zzc("Unable to parse frame hash target time number.", ((Throwable) (zzang1)));
	//  110  221:ldc1            #140 <String "Unable to parse frame hash target time number.">
	//  111  223:aload_2         
	//  112  224:invokestatic    #146 <Method void zzakb.zzc(String, Throwable)>
			}
			zzdaf[i] = -1L;
	//  113  227:aload_0         
	//  114  228:getfield        #124 <Field long[] zzdaf>
	//  115  231:iload           6
	//  116  233:ldc2w           #87  <Long -1L>
	//  117  236:lastore         
		}

	//  118  237:iload           6
	//  119  239:iconst_1        
	//  120  240:iadd            
	//  121  241:istore          6
	//* 122  243:goto            196
	//  123  246:return          
	}

	public final void onStop()
	{
		zzna zzna = zznk.zzavd;
	//    0    0:getstatic       #152 <Field zzna zznk.zzavd>
	//    1    3:astore_2        
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() && !zzdam)
	//*   2    4:invokestatic    #112 <Method zzni zzkb.zzik()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #118 <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #154 <Class Boolean>
	//*   6   14:invokevirtual   #158 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            333
	//*   8   20:aload_0         
	//*   9   21:getfield        #160 <Field boolean zzdam>
	//*  10   24:ifne            333
		{
			Bundle bundle = new Bundle();
	//   11   27:new             #162 <Class Bundle>
	//   12   30:dup             
	//   13   31:invokespecial   #163 <Method void Bundle()>
	//   14   34:astore_3        
			bundle.putString("type", "native-player-metrics");
	//   15   35:aload_3         
	//   16   36:ldc1            #165 <String "type">
	//   17   38:ldc1            #167 <String "native-player-metrics">
	//   18   40:invokevirtual   #171 <Method void Bundle.putString(String, String)>
			bundle.putString("request", zzchp);
	//   19   43:aload_3         
	//   20   44:ldc1            #173 <String "request">
	//   21   46:aload_0         
	//   22   47:getfield        #96  <Field String zzchp>
	//   23   50:invokevirtual   #171 <Method void Bundle.putString(String, String)>
			bundle.putString("player", zzdal.zzsp());
	//   24   53:aload_3         
	//   25   54:ldc1            #175 <String "player">
	//   26   56:aload_0         
	//   27   57:getfield        #177 <Field zzapg zzdal>
	//   28   60:invokevirtual   #183 <Method String zzapg.zzsp()>
	//   29   63:invokevirtual   #171 <Method void Bundle.putString(String, String)>
			String s;
			zzalr zzalr1;
			for(Iterator iterator = zzdae.zzry().iterator(); iterator.hasNext(); bundle.putString(s, Double.toString(zzalr1.zzctb)))
	//*  30   66:aload_0         
	//*  31   67:getfield        #78  <Field zzalp zzdae>
	//*  32   70:invokevirtual   #189 <Method List zzalp.zzry()>
	//*  33   73:invokeinterface #195 <Method Iterator List.iterator()>
	//*  34   78:astore          4
	//*  35   80:aload           4
	//*  36   82:invokeinterface #200 <Method boolean Iterator.hasNext()>
	//*  37   87:ifeq            217
			{
				zzalr1 = (zzalr)iterator.next();
	//   38   90:aload           4
	//   39   92:invokeinterface #204 <Method Object Iterator.next()>
	//   40   97:checkcast       #206 <Class zzalr>
	//   41  100:astore          5
				s = String.valueOf("fps_c_");
	//   42  102:ldc1            #208 <String "fps_c_">
	//   43  104:invokestatic    #212 <Method String String.valueOf(Object)>
	//   44  107:astore_2        
				String s3 = String.valueOf(((Object) (zzalr1.name)));
	//   45  108:aload           5
	//   46  110:getfield        #215 <Field String zzalr.name>
	//   47  113:invokestatic    #212 <Method String String.valueOf(Object)>
	//   48  116:astore          6
				if(s3.length() != 0)
	//*  49  118:aload           6
	//*  50  120:invokevirtual   #219 <Method int String.length()>
	//*  51  123:ifeq            136
					s = s.concat(s3);
	//   52  126:aload_2         
	//   53  127:aload           6
	//   54  129:invokevirtual   #223 <Method String String.concat(String)>
	//   55  132:astore_2        
				else
	//*  56  133:goto            145
					s = new String(s);
	//   57  136:new             #120 <Class String>
	//   58  139:dup             
	//   59  140:aload_2         
	//   60  141:invokespecial   #226 <Method void String(String)>
	//   61  144:astore_2        
				bundle.putString(s, Integer.toString(zzalr1.count));
	//   62  145:aload_3         
	//   63  146:aload_2         
	//   64  147:aload           5
	//   65  149:getfield        #230 <Field int zzalr.count>
	//   66  152:invokestatic    #236 <Method String Integer.toString(int)>
	//   67  155:invokevirtual   #171 <Method void Bundle.putString(String, String)>
				s = String.valueOf("fps_p_");
	//   68  158:ldc1            #238 <String "fps_p_">
	//   69  160:invokestatic    #212 <Method String String.valueOf(Object)>
	//   70  163:astore_2        
				s3 = String.valueOf(((Object) (zzalr1.name)));
	//   71  164:aload           5
	//   72  166:getfield        #215 <Field String zzalr.name>
	//   73  169:invokestatic    #212 <Method String String.valueOf(Object)>
	//   74  172:astore          6
				if(s3.length() != 0)
	//*  75  174:aload           6
	//*  76  176:invokevirtual   #219 <Method int String.length()>
	//*  77  179:ifeq            192
					s = s.concat(s3);
	//   78  182:aload_2         
	//   79  183:aload           6
	//   80  185:invokevirtual   #223 <Method String String.concat(String)>
	//   81  188:astore_2        
				else
	//*  82  189:goto            201
					s = new String(s);
	//   83  192:new             #120 <Class String>
	//   84  195:dup             
	//   85  196:aload_2         
	//   86  197:invokespecial   #226 <Method void String(String)>
	//   87  200:astore_2        
			}

	//   88  201:aload_3         
	//   89  202:aload_2         
	//   90  203:aload           5
	//   91  205:getfield        #242 <Field double zzalr.zzctb>
	//   92  208:invokestatic    #247 <Method String Double.toString(double)>
	//   93  211:invokevirtual   #171 <Method void Bundle.putString(String, String)>
	//*  94  214:goto            80
			for(int i = 0; i < zzdaf.length; i++)
	//*  95  217:iconst_0        
	//*  96  218:istore_1        
	//*  97  219:iload_1         
	//*  98  220:aload_0         
	//*  99  221:getfield        #124 <Field long[] zzdaf>
	//* 100  224:arraylength     
	//* 101  225:icmpge          306
			{
				String s1 = zzdag[i];
	//  102  228:aload_0         
	//  103  229:getfield        #122 <Field String[] zzdag>
	//  104  232:iload_1         
	//  105  233:aaload          
	//  106  234:astore_2        
				if(s1 != null)
	//* 107  235:aload_2         
	//* 108  236:ifnull          299
				{
					String s2 = String.valueOf(((Object) (Long.valueOf(zzdaf[i]))));
	//  109  239:aload_0         
	//  110  240:getfield        #124 <Field long[] zzdaf>
	//  111  243:iload_1         
	//  112  244:laload          
	//  113  245:invokestatic    #250 <Method Long Long.valueOf(long)>
	//  114  248:invokestatic    #212 <Method String String.valueOf(Object)>
	//  115  251:astore          4
					StringBuilder stringbuilder = new StringBuilder(3 + String.valueOf(((Object) (s2))).length());
	//  116  253:new             #252 <Class StringBuilder>
	//  117  256:dup             
	//  118  257:iconst_3        
	//  119  258:aload           4
	//  120  260:invokestatic    #212 <Method String String.valueOf(Object)>
	//  121  263:invokevirtual   #219 <Method int String.length()>
	//  122  266:iadd            
	//  123  267:invokespecial   #255 <Method void StringBuilder(int)>
	//  124  270:astore          5
					stringbuilder.append("fh_");
	//  125  272:aload           5
	//  126  274:ldc2            #257 <String "fh_">
	//  127  277:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//  128  280:pop             
					stringbuilder.append(s2);
	//  129  281:aload           5
	//  130  283:aload           4
	//  131  285:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//  132  288:pop             
					bundle.putString(stringbuilder.toString(), s1);
	//  133  289:aload_3         
	//  134  290:aload           5
	//  135  292:invokevirtual   #263 <Method String StringBuilder.toString()>
	//  136  295:aload_2         
	//  137  296:invokevirtual   #171 <Method void Bundle.putString(String, String)>
				}
			}

	//  138  299:iload_1         
	//  139  300:iconst_1        
	//  140  301:iadd            
	//  141  302:istore_1        
	//* 142  303:goto            219
			zzbv.zzek().zza(mContext, zzzw.zzcw, "gmob-apps", bundle, true);
	//  143  306:invokestatic    #269 <Method zzakk zzbv.zzek()>
	//  144  309:aload_0         
	//  145  310:getfield        #92  <Field Context mContext>
	//  146  313:aload_0         
	//  147  314:getfield        #94  <Field zzang zzzw>
	//  148  317:getfield        #274 <Field String zzang.zzcw>
	//  149  320:ldc2            #276 <String "gmob-apps">
	//  150  323:aload_3         
	//  151  324:iconst_1        
	//  152  325:invokevirtual   #281 <Method void zzakk.zza(Context, String, String, Bundle, boolean)>
			zzdam = true;
	//  153  328:aload_0         
	//  154  329:iconst_1        
	//  155  330:putfield        #160 <Field boolean zzdam>
		}
	//  156  333:return          
	}

	public final void zzb(zzapg zzapg1)
	{
		zznq.zza(zzcxo, zzdad, new String[] {
			"vpc2"
		});
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field zznx zzcxo>
	//    2    4:aload_0         
	//    3    5:getfield        #100 <Field zznv zzdad>
	//    4    8:iconst_1        
	//    5    9:anewarray       String[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:ldc2            #285 <String "vpc2">
	//    9   17:aastore         
	//   10   18:invokestatic    #290 <Method boolean zznq.zza(zznx, zznv, String[])>
	//   11   21:pop             
		zzdah = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #80  <Field boolean zzdah>
		if(zzcxo != null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #98  <Field zznx zzcxo>
	//*  17   31:ifnull          48
			zzcxo.zze("vpn", zzapg1.zzsp());
	//   18   34:aload_0         
	//   19   35:getfield        #98  <Field zznx zzcxo>
	//   20   38:ldc2            #292 <String "vpn">
	//   21   41:aload_1         
	//   22   42:invokevirtual   #183 <Method String zzapg.zzsp()>
	//   23   45:invokevirtual   #297 <Method void zznx.zze(String, String)>
		zzdal = zzapg1;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:putfield        #177 <Field zzapg zzdal>
	//   27   53:return          
	}

	public final void zzc(zzapg zzapg1)
	{
		if(zzdaj && !zzdak)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field boolean zzdaj>
	//*   2    4:ifeq            60
	//*   3    7:aload_0         
	//*   4    8:getfield        #86  <Field boolean zzdak>
	//*   5   11:ifne            60
		{
			if(zzakb.zzqp() && !zzdak)
	//*   6   14:invokestatic    #300 <Method boolean zzakb.zzqp()>
	//*   7   17:ifeq            33
	//*   8   20:aload_0         
	//*   9   21:getfield        #86  <Field boolean zzdak>
	//*  10   24:ifne            33
				zzakb.v("VideoMetricsMixin first frame");
	//   11   27:ldc2            #302 <String "VideoMetricsMixin first frame">
	//   12   30:invokestatic    #305 <Method void zzakb.v(String)>
			zznq.zza(zzcxo, zzdad, new String[] {
				"vff2"
			});
	//   13   33:aload_0         
	//   14   34:getfield        #98  <Field zznx zzcxo>
	//   15   37:aload_0         
	//   16   38:getfield        #100 <Field zznv zzdad>
	//   17   41:iconst_1        
	//   18   42:anewarray       String[]
	//   19   45:dup             
	//   20   46:iconst_0        
	//   21   47:ldc2            #307 <String "vff2">
	//   22   50:aastore         
	//   23   51:invokestatic    #290 <Method boolean zznq.zza(zznx, zznv, String[])>
	//   24   54:pop             
			zzdak = true;
	//   25   55:aload_0         
	//   26   56:iconst_1        
	//   27   57:putfield        #86  <Field boolean zzdak>
		}
		long l1 = zzbv.zzer().nanoTime();
	//   28   60:invokestatic    #311 <Method Clock zzbv.zzer()>
	//   29   63:invokeinterface #317 <Method long Clock.nanoTime()>
	//   30   68:lstore          8
		if(zzcxs && zzdan && zzdao != -1L)
	//*  31   70:aload_0         
	//*  32   71:getfield        #319 <Field boolean zzcxs>
	//*  33   74:ifeq            121
	//*  34   77:aload_0         
	//*  35   78:getfield        #321 <Field boolean zzdan>
	//*  36   81:ifeq            121
	//*  37   84:aload_0         
	//*  38   85:getfield        #90  <Field long zzdao>
	//*  39   88:ldc2w           #87  <Long -1L>
	//*  40   91:lcmp            
	//*  41   92:ifeq            121
		{
			double d = (double)TimeUnit.SECONDS.toNanos(1L) / (double)(l1 - zzdao);
	//   42   95:getstatic       #327 <Field TimeUnit TimeUnit.SECONDS>
	//   43   98:lconst_1        
	//   44   99:invokevirtual   #331 <Method long TimeUnit.toNanos(long)>
	//   45  102:l2d             
	//   46  103:lload           8
	//   47  105:aload_0         
	//   48  106:getfield        #90  <Field long zzdao>
	//   49  109:lsub            
	//   50  110:l2d             
	//   51  111:ddiv            
	//   52  112:dstore_2        
			zzdae.zza(d);
	//   53  113:aload_0         
	//   54  114:getfield        #78  <Field zzalp zzdae>
	//   55  117:dload_2         
	//   56  118:invokevirtual   #334 <Method void zzalp.zza(double)>
		}
		zzdan = zzcxs;
	//   57  121:aload_0         
	//   58  122:aload_0         
	//   59  123:getfield        #319 <Field boolean zzcxs>
	//   60  126:putfield        #321 <Field boolean zzdan>
		zzdao = l1;
	//   61  129:aload_0         
	//   62  130:lload           8
	//   63  132:putfield        #90  <Field long zzdao>
		zzna zzna = zznk.zzavf;
	//   64  135:getstatic       #337 <Field zzna zznk.zzavf>
	//   65  138:astore          14
		l1 = ((Long)zzkb.zzik().zzd(zzna)).longValue();
	//   66  140:invokestatic    #112 <Method zzni zzkb.zzik()>
	//   67  143:aload           14
	//   68  145:invokevirtual   #118 <Method Object zzni.zzd(zzna)>
	//   69  148:checkcast       #134 <Class Long>
	//   70  151:invokevirtual   #340 <Method long Long.longValue()>
	//   71  154:lstore          8
		long l3 = zzapg1.getCurrentPosition();
	//   72  156:aload_1         
	//   73  157:invokevirtual   #343 <Method int zzapg.getCurrentPosition()>
	//   74  160:i2l             
	//   75  161:lstore          10
		for(int i = 0; i < zzdag.length; i++)
	//*  76  163:iconst_0        
	//*  77  164:istore          4
	//*  78  166:iload           4
	//*  79  168:aload_0         
	//*  80  169:getfield        #122 <Field String[] zzdag>
	//*  81  172:arraylength     
	//*  82  173:icmpge          362
			if(zzdag[i] == null && l1 > Math.abs(l3 - zzdaf[i]))
	//*  83  176:aload_0         
	//*  84  177:getfield        #122 <Field String[] zzdag>
	//*  85  180:iload           4
	//*  86  182:aaload          
	//*  87  183:ifnonnull       353
	//*  88  186:lload           8
	//*  89  188:lload           10
	//*  90  190:aload_0         
	//*  91  191:getfield        #124 <Field long[] zzdaf>
	//*  92  194:iload           4
	//*  93  196:laload          
	//*  94  197:lsub            
	//*  95  198:invokestatic    #348 <Method long Math.abs(long)>
	//*  96  201:lcmp            
	//*  97  202:ifle            353
			{
				String as[] = zzdag;
	//   98  205:aload_0         
	//   99  206:getfield        #122 <Field String[] zzdag>
	//  100  209:astore          14
				zzapg1 = ((zzapg) (((TextureView) (zzapg1)).getBitmap(8, 8)));
	//  101  211:aload_1         
	//  102  212:bipush          8
	//  103  214:bipush          8
	//  104  216:invokevirtual   #354 <Method Bitmap TextureView.getBitmap(int, int)>
	//  105  219:astore_1        
				long l2 = 63L;
	//  106  220:ldc2w           #355 <Long 63L>
	//  107  223:lstore          8
				long l4 = 0L;
	//  108  225:lconst_0        
	//  109  226:lstore          10
				for(int j = 0; j < 8; j++)
	//* 110  228:iconst_0        
	//* 111  229:istore          5
	//* 112  231:iload           5
	//* 113  233:bipush          8
	//* 114  235:icmpge          329
				{
					for(int k = 0; k < 8;)
	//* 115  238:iconst_0        
	//* 116  239:istore          6
	//* 117  241:iload           6
	//* 118  243:bipush          8
	//* 119  245:icmpge          320
					{
						int l = ((Bitmap) (zzapg1)).getPixel(k, j);
	//  120  248:aload_1         
	//  121  249:iload           6
	//  122  251:iload           5
	//  123  253:invokevirtual   #362 <Method int Bitmap.getPixel(int, int)>
	//  124  256:istore          7
						long l5;
						if(Color.blue(l) + Color.red(l) + Color.green(l) > 128)
	//* 125  258:iload           7
	//* 126  260:invokestatic    #368 <Method int Color.blue(int)>
	//* 127  263:iload           7
	//* 128  265:invokestatic    #371 <Method int Color.red(int)>
	//* 129  268:iadd            
	//* 130  269:iload           7
	//* 131  271:invokestatic    #374 <Method int Color.green(int)>
	//* 132  274:iadd            
	//* 133  275:sipush          128
	//* 134  278:icmple          287
							l5 = 1L;
	//  135  281:lconst_1        
	//  136  282:lstore          12
						else
	//* 137  284:goto            290
							l5 = 0L;
	//  138  287:lconst_0        
	//  139  288:lstore          12
						l = (int)l2;
	//  140  290:lload           8
	//  141  292:l2i             
	//  142  293:istore          7
						k++;
	//  143  295:iload           6
	//  144  297:iconst_1        
	//  145  298:iadd            
	//  146  299:istore          6
						l2--;
	//  147  301:lload           8
	//  148  303:lconst_1        
	//  149  304:lsub            
	//  150  305:lstore          8
						l4 |= l5 << l;
	//  151  307:lload           10
	//  152  309:lload           12
	//  153  311:iload           7
	//  154  313:lshl            
	//  155  314:lor             
	//  156  315:lstore          10
					}

				}

	//  157  317:goto            241
	//  158  320:iload           5
	//  159  322:iconst_1        
	//  160  323:iadd            
	//  161  324:istore          5
	//* 162  326:goto            231
				as[i] = String.format("%016X", new Object[] {
					Long.valueOf(l4)
				});
	//  163  329:aload           14
	//  164  331:iload           4
	//  165  333:ldc2            #376 <String "%016X">
	//  166  336:iconst_1        
	//  167  337:anewarray       Object[]
	//  168  340:dup             
	//  169  341:iconst_0        
	//  170  342:lload           10
	//  171  344:invokestatic    #250 <Method Long Long.valueOf(long)>
	//  172  347:aastore         
	//  173  348:invokestatic    #380 <Method String String.format(String, Object[])>
	//  174  351:aastore         
				return;
	//  175  352:return          
			}

	//  176  353:iload           4
	//  177  355:iconst_1        
	//  178  356:iadd            
	//  179  357:istore          4
	//* 180  359:goto            166
	//  181  362:return          
	}

	public final void zzsv()
	{
		if(zzdah)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field boolean zzdah>
	//*   2    4:ifeq            42
		{
			if(zzdai)
	//*   3    7:aload_0         
	//*   4    8:getfield        #82  <Field boolean zzdai>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			zznq.zza(zzcxo, zzdad, new String[] {
				"vfr2"
			});
	//    7   15:aload_0         
	//    8   16:getfield        #98  <Field zznx zzcxo>
	//    9   19:aload_0         
	//   10   20:getfield        #100 <Field zznv zzdad>
	//   11   23:iconst_1        
	//   12   24:anewarray       String[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:ldc2            #383 <String "vfr2">
	//   16   32:aastore         
	//   17   33:invokestatic    #290 <Method boolean zznq.zza(zznx, zznv, String[])>
	//   18   36:pop             
			zzdai = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #82  <Field boolean zzdai>
		}
	//   22   42:return          
	}

	public final void zztt()
	{
		zzcxs = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #319 <Field boolean zzcxs>
		if(zzdai && !zzdaj)
	//*   3    5:aload_0         
	//*   4    6:getfield        #82  <Field boolean zzdai>
	//*   5    9:ifeq            46
	//*   6   12:aload_0         
	//*   7   13:getfield        #84  <Field boolean zzdaj>
	//*   8   16:ifne            46
		{
			zznq.zza(zzcxo, zzdad, new String[] {
				"vfp2"
			});
	//    9   19:aload_0         
	//   10   20:getfield        #98  <Field zznx zzcxo>
	//   11   23:aload_0         
	//   12   24:getfield        #100 <Field zznv zzdad>
	//   13   27:iconst_1        
	//   14   28:anewarray       String[]
	//   15   31:dup             
	//   16   32:iconst_0        
	//   17   33:ldc2            #386 <String "vfp2">
	//   18   36:aastore         
	//   19   37:invokestatic    #290 <Method boolean zznq.zza(zznx, zznv, String[])>
	//   20   40:pop             
			zzdaj = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #84  <Field boolean zzdaj>
		}
	//   24   46:return          
	}

	public final void zztu()
	{
		zzcxs = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #319 <Field boolean zzcxs>
	//    3    5:return          
	}

	private final Context mContext;
	private final String zzchp;
	private final zznx zzcxo;
	private boolean zzcxs;
	private final zznv zzdad;
	private final zzalp zzdae = (new zzals()).zza("min_1", 4.9406564584124654E-324D, 1.0D).zza("1_5", 1.0D, 5D).zza("5_10", 5D, 10D).zza("10_20", 10D, 20D).zza("20_30", 20D, 30D).zza("30_max", 30D, 1.7976931348623157E+308D).zzrz();
	private final long zzdaf[];
	private final String zzdag[];
	private boolean zzdah;
	private boolean zzdai;
	private boolean zzdaj;
	private boolean zzdak;
	private zzapg zzdal;
	private boolean zzdam;
	private boolean zzdan;
	private long zzdao;
	private final zzang zzzw;
}
