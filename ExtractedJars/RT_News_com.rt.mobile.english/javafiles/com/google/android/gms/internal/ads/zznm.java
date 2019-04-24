// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzakk, 
//			zzagc, zzaga, zzajm

public final class zznm
{

	public zznm(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mContext = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field Context mContext>
		zzaej = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field String zzaej>
		mContext = context;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #22  <Field Context mContext>
		zzaej = s;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #24  <Field String zzaej>
		s = ((String) (zznk.zzawi));
	//   14   24:getstatic       #30  <Field zzna zznk.zzawi>
	//   15   27:astore_2        
		zzbfx = (String)zzkb.zzik().zzd(((zzna) (s)));
	//   16   28:aload_0         
	//   17   29:invokestatic    #36  <Method zzni zzkb.zzik()>
	//   18   32:aload_2         
	//   19   33:invokevirtual   #42  <Method Object zzni.zzd(zzna)>
	//   20   36:checkcast       #44  <Class String>
	//   21   39:putfield        #46  <Field String zzbfx>
		zzbfy = ((Map) (new LinkedHashMap()));
	//   22   42:aload_0         
	//   23   43:new             #48  <Class LinkedHashMap>
	//   24   46:dup             
	//   25   47:invokespecial   #49  <Method void LinkedHashMap()>
	//   26   50:putfield        #51  <Field Map zzbfy>
		zzbfy.put("s", "gmob_sdk");
	//   27   53:aload_0         
	//   28   54:getfield        #51  <Field Map zzbfy>
	//   29   57:ldc1            #53  <String "s">
	//   30   59:ldc1            #55  <String "gmob_sdk">
	//   31   61:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   32   66:pop             
		zzbfy.put("v", "3");
	//   33   67:aload_0         
	//   34   68:getfield        #51  <Field Map zzbfy>
	//   35   71:ldc1            #63  <String "v">
	//   36   73:ldc1            #65  <String "3">
	//   37   75:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   38   80:pop             
		zzbfy.put("os", ((Object) (android.os.Build.VERSION.RELEASE)));
	//   39   81:aload_0         
	//   40   82:getfield        #51  <Field Map zzbfy>
	//   41   85:ldc1            #67  <String "os">
	//   42   87:getstatic       #72  <Field String android.os.Build$VERSION.RELEASE>
	//   43   90:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   44   95:pop             
		zzbfy.put("sdk", ((Object) (android.os.Build.VERSION.SDK)));
	//   45   96:aload_0         
	//   46   97:getfield        #51  <Field Map zzbfy>
	//   47  100:ldc1            #74  <String "sdk">
	//   48  102:getstatic       #77  <Field String android.os.Build$VERSION.SDK>
	//   49  105:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   50  110:pop             
		s = ((String) (zzbfy));
	//   51  111:aload_0         
	//   52  112:getfield        #51  <Field Map zzbfy>
	//   53  115:astore_2        
		zzbv.zzek();
	//   54  116:invokestatic    #83  <Method zzakk zzbv.zzek()>
	//   55  119:pop             
		((Map) (s)).put("device", ((Object) (zzakk.zzri())));
	//   56  120:aload_2         
	//   57  121:ldc1            #85  <String "device">
	//   58  123:invokestatic    #91  <Method String zzakk.zzri()>
	//   59  126:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   60  131:pop             
		Map map = zzbfy;
	//   61  132:aload_0         
	//   62  133:getfield        #51  <Field Map zzbfy>
	//   63  136:astore_3        
		if(context.getApplicationContext() != null)
	//*  64  137:aload_1         
	//*  65  138:invokevirtual   #97  <Method Context Context.getApplicationContext()>
	//*  66  141:ifnull          155
			s = context.getApplicationContext().getPackageName();
	//   67  144:aload_1         
	//   68  145:invokevirtual   #97  <Method Context Context.getApplicationContext()>
	//   69  148:invokevirtual   #100 <Method String Context.getPackageName()>
	//   70  151:astore_2        
		else
	//*  71  152:goto            160
			s = context.getPackageName();
	//   72  155:aload_1         
	//   73  156:invokevirtual   #100 <Method String Context.getPackageName()>
	//   74  159:astore_2        
		map.put("app", ((Object) (s)));
	//   75  160:aload_3         
	//   76  161:ldc1            #102 <String "app">
	//   77  163:aload_2         
	//   78  164:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   79  169:pop             
		s = ((String) (zzbfy));
	//   80  170:aload_0         
	//   81  171:getfield        #51  <Field Map zzbfy>
	//   82  174:astore_2        
		zzbv.zzek();
	//   83  175:invokestatic    #83  <Method zzakk zzbv.zzek()>
	//   84  178:pop             
		if(zzakk.zzav(context))
	//*  85  179:aload_1         
	//*  86  180:invokestatic    #106 <Method boolean zzakk.zzav(Context)>
	//*  87  183:ifeq            192
			context = "1";
	//   88  186:ldc1            #108 <String "1">
	//   89  188:astore_1        
		else
	//*  90  189:goto            195
			context = "0";
	//   91  192:ldc1            #110 <String "0">
	//   92  194:astore_1        
		((Map) (s)).put("is_lite_sdk", ((Object) (context)));
	//   93  195:aload_2         
	//   94  196:ldc1            #112 <String "is_lite_sdk">
	//   95  198:aload_1         
	//   96  199:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   97  204:pop             
		context = ((Context) (zzbv.zzev().zzq(mContext)));
	//   98  205:invokestatic    #116 <Method zzagc zzbv.zzev()>
	//   99  208:aload_0         
	//  100  209:getfield        #22  <Field Context mContext>
	//  101  212:invokevirtual   #122 <Method Future zzagc.zzq(Context)>
	//  102  215:astore_1        
		try
		{
			((Future) (context)).get();
	//  103  216:aload_1         
	//  104  217:invokeinterface #128 <Method Object Future.get()>
	//  105  222:pop             
			zzbfy.put("network_coarse", ((Object) (Integer.toString(((zzaga)((Future) (context)).get()).zzcjx))));
	//  106  223:aload_0         
	//  107  224:getfield        #51  <Field Map zzbfy>
	//  108  227:ldc1            #130 <String "network_coarse">
	//  109  229:aload_1         
	//  110  230:invokeinterface #128 <Method Object Future.get()>
	//  111  235:checkcast       #132 <Class zzaga>
	//  112  238:getfield        #136 <Field int zzaga.zzcjx>
	//  113  241:invokestatic    #142 <Method String Integer.toString(int)>
	//  114  244:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//  115  249:pop             
			zzbfy.put("network_fine", ((Object) (Integer.toString(((zzaga)((Future) (context)).get()).zzcjy))));
	//  116  250:aload_0         
	//  117  251:getfield        #51  <Field Map zzbfy>
	//  118  254:ldc1            #144 <String "network_fine">
	//  119  256:aload_1         
	//  120  257:invokeinterface #128 <Method Object Future.get()>
	//  121  262:checkcast       #132 <Class zzaga>
	//  122  265:getfield        #147 <Field int zzaga.zzcjy>
	//  123  268:invokestatic    #142 <Method String Integer.toString(int)>
	//  124  271:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//  125  276:pop             
			return;
	//  126  277:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 127  278:astore_1        
		{
			zzbv.zzeo().zza(((Throwable) (context)), "CsiConfiguration.CsiConfiguration");
	//  128  279:invokestatic    #151 <Method zzajm zzbv.zzeo()>
	//  129  282:aload_1         
	//  130  283:ldc1            #153 <String "CsiConfiguration.CsiConfiguration">
	//  131  285:invokevirtual   #159 <Method void zzajm.zza(Throwable, String)>
		}
	//  132  288:return          
	}

	final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context mContext>
	//    2    4:areturn         
	}

	final String zzfw()
	{
		return zzaej;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String zzaej>
	//    2    4:areturn         
	}

	final String zzjd()
	{
		return zzbfx;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String zzbfx>
	//    2    4:areturn         
	}

	final Map zzje()
	{
		return zzbfy;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Map zzbfy>
	//    2    4:areturn         
	}

	private Context mContext;
	private String zzaej;
	private String zzbfx;
	private Map zzbfy;
}
