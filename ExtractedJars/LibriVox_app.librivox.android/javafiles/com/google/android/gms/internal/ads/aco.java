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
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.bs;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			acl, add, acn, p, 
//			bwk, m, ad, adg, 
//			acm, xg, acr, acs, 
//			abj, acp, wx, adh, 
//			acq, act, adc

public final class aco extends FrameLayout
	implements acl
{

	public aco(Context context, add add1, int i1, boolean flag, ad ad1, adc adc)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method void FrameLayout(Context)>
		a = add1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #41  <Field add a>
		c = ad1;
	//    6   10:aload_0         
	//    7   11:aload           5
	//    8   13:putfield        #43  <Field ad c>
		b = new FrameLayout(context);
	//    9   16:aload_0         
	//   10   17:new             #4   <Class FrameLayout>
	//   11   20:dup             
	//   12   21:aload_1         
	//   13   22:invokespecial   #39  <Method void FrameLayout(Context)>
	//   14   25:putfield        #45  <Field FrameLayout b>
		addView(((android.view.View) (b)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   15   28:aload_0         
	//   16   29:aload_0         
	//   17   30:getfield        #45  <Field FrameLayout b>
	//   18   33:new             #47  <Class android.widget.FrameLayout$LayoutParams>
	//   19   36:dup             
	//   20   37:iconst_m1       
	//   21   38:iconst_m1       
	//   22   39:invokespecial   #50  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   23   42:invokevirtual   #54  <Method void addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		am.a(((Object) (add1.e())));
	//   24   45:aload_2         
	//   25   46:invokeinterface #59  <Method bs com.google.android.gms.internal.ads.add.e()>
	//   26   51:invokestatic    #64  <Method Object am.a(Object)>
	//   27   54:pop             
		f = add1.e().b.a(context, add1, i1, flag, ad1, adc);
	//   28   55:aload_0         
	//   29   56:aload_2         
	//   30   57:invokeinterface #59  <Method bs com.google.android.gms.internal.ads.add.e()>
	//   31   62:getfield        #69  <Field acn bs.b>
	//   32   65:aload_1         
	//   33   66:aload_2         
	//   34   67:iload_3         
	//   35   68:iload           4
	//   36   70:aload           5
	//   37   72:aload           6
	//   38   74:invokevirtual   #74  <Method acm acn.a(Context, add, int, boolean, ad, adc)>
	//   39   77:putfield        #76  <Field acm f>
		add1 = ((add) (f));
	//   40   80:aload_0         
	//   41   81:getfield        #76  <Field acm f>
	//   42   84:astore_2        
		if(add1 != null)
	//*  43   85:aload_2         
	//*  44   86:ifnull          132
		{
			b.addView(((android.view.View) (add1)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1, 17))));
	//   45   89:aload_0         
	//   46   90:getfield        #45  <Field FrameLayout b>
	//   47   93:aload_2         
	//   48   94:new             #47  <Class android.widget.FrameLayout$LayoutParams>
	//   49   97:dup             
	//   50   98:iconst_m1       
	//   51   99:iconst_m1       
	//   52  100:bipush          17
	//   53  102:invokespecial   #79  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//   54  105:invokevirtual   #80  <Method void FrameLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			add1 = ((add) (p.w));
	//   55  108:getstatic       #86  <Field com.google.android.gms.internal.ads.e p.w>
	//   56  111:astore_2        
			if(((Boolean)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (add1)))).booleanValue())
	//*  57  112:invokestatic    #91  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  58  115:aload_2         
	//*  59  116:invokevirtual   #96  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  60  119:checkcast       #98  <Class Boolean>
	//*  61  122:invokevirtual   #102 <Method boolean Boolean.booleanValue()>
	//*  62  125:ifeq            132
				m();
	//   63  128:aload_0         
	//   64  129:invokevirtual   #105 <Method void m()>
		}
		o = new ImageView(context);
	//   65  132:aload_0         
	//   66  133:new             #107 <Class ImageView>
	//   67  136:dup             
	//   68  137:aload_1         
	//   69  138:invokespecial   #108 <Method void ImageView(Context)>
	//   70  141:putfield        #110 <Field ImageView o>
		context = ((Context) (p.A));
	//   71  144:getstatic       #113 <Field com.google.android.gms.internal.ads.e p.A>
	//   72  147:astore_1        
		e = ((Long)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (context)))).longValue();
	//   73  148:aload_0         
	//   74  149:invokestatic    #91  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   75  152:aload_1         
	//   76  153:invokevirtual   #96  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   77  156:checkcast       #115 <Class Long>
	//   78  159:invokevirtual   #119 <Method long Long.longValue()>
	//   79  162:putfield        #121 <Field long e>
		context = ((Context) (p.y));
	//   80  165:getstatic       #124 <Field com.google.android.gms.internal.ads.e p.y>
	//   81  168:astore_1        
		j = ((Boolean)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (context)))).booleanValue();
	//   82  169:aload_0         
	//   83  170:invokestatic    #91  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   84  173:aload_1         
	//   85  174:invokevirtual   #96  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   86  177:checkcast       #98  <Class Boolean>
	//   87  180:invokevirtual   #102 <Method boolean Boolean.booleanValue()>
	//   88  183:putfield        #126 <Field boolean j>
		add1 = ((add) (c));
	//   89  186:aload_0         
	//   90  187:getfield        #43  <Field ad c>
	//   91  190:astore_2        
		if(add1 != null)
	//*  92  191:aload_2         
	//*  93  192:ifnull          218
		{
			if(j)
	//*  94  195:aload_0         
	//*  95  196:getfield        #126 <Field boolean j>
	//*  96  199:ifeq            208
				context = "1";
	//   97  202:ldc1            #128 <String "1">
	//   98  204:astore_1        
			else
	//*  99  205:goto            211
				context = "0";
	//  100  208:ldc1            #130 <String "0">
	//  101  210:astore_1        
			((ad) (add1)).a("spinner_used", ((String) (context)));
	//  102  211:aload_2         
	//  103  212:ldc1            #132 <String "spinner_used">
	//  104  214:aload_1         
	//  105  215:invokevirtual   #137 <Method void ad.a(String, String)>
		}
	//  106  218:aload_0         
	//  107  219:new             #139 <Class adg>
	//  108  222:dup             
	//  109  223:aload_0         
	//  110  224:invokespecial   #142 <Method void adg(aco)>
	//  111  227:putfield        #144 <Field adg d>
		context = ((Context) (f));
	//  112  230:aload_0         
	//  113  231:getfield        #76  <Field acm f>
	//  114  234:astore_1        
		if(context != null)
	//* 115  235:aload_1         
	//* 116  236:ifnull          244
			((acm) (context)).a(((acl) (this)));
	//  117  239:aload_1         
	//  118  240:aload_0         
	//  119  241:invokevirtual   #149 <Method void acm.a(acl)>
		if(f == null)
	//* 120  244:aload_0         
	//* 121  245:getfield        #76  <Field acm f>
	//* 122  248:ifnonnull       259
			a("AdVideoUnderlay Error", "Allocating player failed.");
	//  123  251:aload_0         
	//  124  252:ldc1            #151 <String "AdVideoUnderlay Error">
	//  125  254:ldc1            #153 <String "Allocating player failed.">
	//  126  256:invokevirtual   #154 <Method void a(String, String)>
	//  127  259:return          
	}

	static void a(aco aco1, String s, String as[])
	{
		aco1.a(s, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #159 <Method void a(String, String[])>
	//    4    6:return          
	}

	public static void a(add add1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #162 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put("event", "no_video_view");
	//    4    8:aload_1         
	//    5    9:ldc1            #166 <String "event">
	//    6   11:ldc1            #168 <String "no_video_view">
	//    7   13:invokevirtual   #172 <Method Object HashMap.put(Object, Object)>
	//    8   16:pop             
		add1.a("onVideoEvent", ((Map) (hashmap)));
	//    9   17:aload_0         
	//   10   18:ldc1            #174 <String "onVideoEvent">
	//   11   20:aload_1         
	//   12   21:invokeinterface #177 <Method void add.a(String, Map)>
	//   13   26:return          
	}

	public static void a(add add1, String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #162 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("event", "decoderProps");
	//    4    8:aload_2         
	//    5    9:ldc1            #166 <String "event">
	//    6   11:ldc1            #180 <String "decoderProps">
	//    7   13:invokeinterface #183 <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("error", ((Object) (s)));
	//    9   19:aload_2         
	//   10   20:ldc1            #185 <String "error">
	//   11   22:aload_1         
	//   12   23:invokeinterface #183 <Method Object Map.put(Object, Object)>
	//   13   28:pop             
		add1.a("onVideoEvent", ((Map) (hashmap)));
	//   14   29:aload_0         
	//   15   30:ldc1            #174 <String "onVideoEvent">
	//   16   32:aload_2         
	//   17   33:invokeinterface #177 <Method void add.a(String, Map)>
	//   18   38:return          
	}

	public static void a(add add1, Map map)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #162 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("event", "decoderProps");
	//    4    8:aload_2         
	//    5    9:ldc1            #166 <String "event">
	//    6   11:ldc1            #180 <String "decoderProps">
	//    7   13:invokeinterface #183 <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("mimeTypes", ((Object) (map)));
	//    9   19:aload_2         
	//   10   20:ldc1            #188 <String "mimeTypes">
	//   11   22:aload_1         
	//   12   23:invokeinterface #183 <Method Object Map.put(Object, Object)>
	//   13   28:pop             
		add1.a("onVideoEvent", ((Map) (hashmap)));
	//   14   29:aload_0         
	//   15   30:ldc1            #174 <String "onVideoEvent">
	//   16   32:aload_2         
	//   17   33:invokeinterface #177 <Method void add.a(String, Map)>
	//   18   38:return          
	}

	private final transient void a(String s, String as[])
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #162 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void HashMap()>
	//    3    7:astore          6
		hashmap.put("event", ((Object) (s)));
	//    4    9:aload           6
	//    5   11:ldc1            #166 <String "event">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #172 <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
		int j1 = as.length;
	//    9   18:aload_2         
	//   10   19:arraylength     
	//   11   20:istore          4
		int i1 = 0;
	//   12   22:iconst_0        
	//   13   23:istore_3        
		s = null;
	//   14   24:aconst_null     
	//   15   25:astore_1        
		for(; i1 < j1; i1++)
	//*  16   26:iload_3         
	//*  17   27:iload           4
	//*  18   29:icmpge          65
		{
			String s1 = as[i1];
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
	//   31   52:invokevirtual   #172 <Method Object HashMap.put(Object, Object)>
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
		a.a("onVideoEvent", ((Map) (hashmap)));
	//   40   65:aload_0         
	//   41   66:getfield        #41  <Field add a>
	//   42   69:ldc1            #174 <String "onVideoEvent">
	//   43   71:aload           6
	//   44   73:invokeinterface #177 <Method void add.a(String, Map)>
	//   45   78:return          
	}

	private final boolean p()
	{
		return o.getParent() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ImageView o>
	//    2    4:invokevirtual   #192 <Method android.view.ViewParent ImageView.getParent()>
	//    3    7:ifnull          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private final void q()
	{
		if(a.d() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field add a>
	//*   2    4:invokeinterface #196 <Method Activity add.d()>
	//*   3    9:ifnonnull       13
			return;
	//    4   12:return          
		if(h && !i)
	//*   5   13:aload_0         
	//*   6   14:getfield        #198 <Field boolean h>
	//*   7   17:ifeq            50
	//*   8   20:aload_0         
	//*   9   21:getfield        #200 <Field boolean i>
	//*  10   24:ifne            50
		{
			a.d().getWindow().clearFlags(128);
	//   11   27:aload_0         
	//   12   28:getfield        #41  <Field add a>
	//   13   31:invokeinterface #196 <Method Activity add.d()>
	//   14   36:invokevirtual   #206 <Method Window Activity.getWindow()>
	//   15   39:sipush          128
	//   16   42:invokevirtual   #212 <Method void Window.clearFlags(int)>
			h = false;
	//   17   45:aload_0         
	//   18   46:iconst_0        
	//   19   47:putfield        #198 <Field boolean h>
		}
	//   20   50:return          
	}

	public final void a()
	{
		d.b();
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field adg d>
	//    2    4:invokevirtual   #214 <Method void adg.b()>
		xg.a.post(((Runnable) (new acr(this))));
	//    3    7:getstatic       #219 <Field Handler xg.a>
	//    4   10:new             #221 <Class acr>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #222 <Method void acr(aco)>
	//    8   18:invokevirtual   #228 <Method boolean Handler.post(Runnable)>
	//    9   21:pop             
	//   10   22:return          
	}

	public final void a(float f1, float f2)
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_3        
		if(acm1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			acm1.a(f1, f2);
	//    5    9:aload_3         
	//    6   10:fload_1         
	//    7   11:fload_2         
	//    8   12:invokevirtual   #231 <Method void acm.a(float, float)>
	//    9   15:return          
	}

	public final void a(int i1)
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_2        
		if(acm1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			acm1.a(i1);
	//    6   10:aload_2         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #233 <Method void acm.a(int)>
			return;
	//    9   15:return          
		}
	}

	public final void a(int i1, int j1)
	{
		if(j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field boolean j>
	//*   2    4:ifeq            100
		{
			Object obj = ((Object) (p.z));
	//    3    7:getstatic       #236 <Field com.google.android.gms.internal.ads.e p.z>
	//    4   10:astore_3        
			i1 = Math.max(i1 / ((Integer)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj)))).intValue(), 1);
	//    5   11:iload_1         
	//    6   12:invokestatic    #91  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//    7   15:aload_3         
	//    8   16:invokevirtual   #96  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//    9   19:checkcast       #238 <Class Integer>
	//   10   22:invokevirtual   #242 <Method int Integer.intValue()>
	//   11   25:idiv            
	//   12   26:iconst_1        
	//   13   27:invokestatic    #248 <Method int Math.max(int, int)>
	//   14   30:istore_1        
			obj = ((Object) (p.z));
	//   15   31:getstatic       #236 <Field com.google.android.gms.internal.ads.e p.z>
	//   16   34:astore_3        
			j1 = Math.max(j1 / ((Integer)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj)))).intValue(), 1);
	//   17   35:iload_2         
	//   18   36:invokestatic    #91  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   19   39:aload_3         
	//   20   40:invokevirtual   #96  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   21   43:checkcast       #238 <Class Integer>
	//   22   46:invokevirtual   #242 <Method int Integer.intValue()>
	//   23   49:idiv            
	//   24   50:iconst_1        
	//   25   51:invokestatic    #248 <Method int Math.max(int, int)>
	//   26   54:istore_2        
			obj = ((Object) (n));
	//   27   55:aload_0         
	//   28   56:getfield        #250 <Field Bitmap n>
	//   29   59:astore_3        
			if(obj == null || ((Bitmap) (obj)).getWidth() != i1 || n.getHeight() != j1)
	//*  30   60:aload_3         
	//*  31   61:ifnull          83
	//*  32   64:aload_3         
	//*  33   65:invokevirtual   #255 <Method int Bitmap.getWidth()>
	//*  34   68:iload_1         
	//*  35   69:icmpne          83
	//*  36   72:aload_0         
	//*  37   73:getfield        #250 <Field Bitmap n>
	//*  38   76:invokevirtual   #258 <Method int Bitmap.getHeight()>
	//*  39   79:iload_2         
	//*  40   80:icmpeq          100
			{
				n = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
	//   41   83:aload_0         
	//   42   84:iload_1         
	//   43   85:iload_2         
	//   44   86:getstatic       #264 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   45   89:invokestatic    #268 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   46   92:putfield        #250 <Field Bitmap n>
				p = false;
	//   47   95:aload_0         
	//   48   96:iconst_0        
	//   49   97:putfield        #270 <Field boolean p>
			}
		}
	//   50  100:return          
	}

	public final void a(int i1, int j1, int k1, int l1)
	{
		if(k1 != 0)
	//*   0    0:iload_3         
	//*   1    1:ifeq            45
		{
			if(l1 == 0)
	//*   2    4:iload           4
	//*   3    6:ifne            10
			{
				return;
	//    4    9:return          
			} else
			{
				android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k1, l1);
	//    5   10:new             #47  <Class android.widget.FrameLayout$LayoutParams>
	//    6   13:dup             
	//    7   14:iload_3         
	//    8   15:iload           4
	//    9   17:invokespecial   #50  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   10   20:astore          5
				layoutparams.setMargins(i1, j1, 0, 0);
	//   11   22:aload           5
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:iconst_0        
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #274 <Method void android.widget.FrameLayout$LayoutParams.setMargins(int, int, int, int)>
				b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   17   31:aload_0         
	//   18   32:getfield        #45  <Field FrameLayout b>
	//   19   35:aload           5
	//   20   37:invokevirtual   #278 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				requestLayout();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #281 <Method void requestLayout()>
				return;
	//   23   44:return          
			}
		} else
		{
			return;
	//   24   45:return          
		}
	}

	public final void a(MotionEvent motionevent)
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_2        
		if(acm1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			acm1.dispatchTouchEvent(motionevent);
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #289 <Method boolean acm.dispatchTouchEvent(MotionEvent)>
	//    9   15:pop             
			return;
	//   10   16:return          
		}
	}

	public final void a(String s)
	{
		m = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #293 <Field String m>
	//    3    5:return          
	}

	public final void a(String s, String s1)
	{
		a("error", new String[] {
			"what", s, "extra", s1
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #185 <String "error">
	//    2    3:iconst_4        
	//    3    4:anewarray       String[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc2            #297 <String "what">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_1         
	//   11   16:aastore         
	//   12   17:dup             
	//   13   18:iconst_2        
	//   14   19:ldc2            #299 <String "extra">
	//   15   22:aastore         
	//   16   23:dup             
	//   17   24:iconst_3        
	//   18   25:aload_2         
	//   19   26:aastore         
	//   20   27:invokespecial   #159 <Method void a(String, String[])>
	//   21   30:return          
	}

	final void a(boolean flag)
	{
		a("windowFocusChanged", new String[] {
			"hasWindowFocus", String.valueOf(flag)
		});
	//    0    0:aload_0         
	//    1    1:ldc2            #302 <String "windowFocusChanged">
	//    2    4:iconst_2        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc2            #304 <String "hasWindowFocus">
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:iload_1         
	//   11   17:invokestatic    #308 <Method String String.valueOf(boolean)>
	//   12   20:aastore         
	//   13   21:invokespecial   #159 <Method void a(String, String[])>
	//   14   24:return          
	}

	public final void b()
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_1        
		if(acm1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		if(l == 0L)
	//*   6   10:aload_0         
	//*   7   11:getfield        #310 <Field long l>
	//*   8   14:lconst_0        
	//*   9   15:lcmp            
	//*  10   16:ifne            90
			a("canplaythrough", new String[] {
				"duration", String.valueOf((float)acm1.getDuration() / 1000F), "videoWidth", String.valueOf(f.getVideoWidth()), "videoHeight", String.valueOf(f.getVideoHeight())
			});
	//   11   19:aload_0         
	//   12   20:ldc2            #312 <String "canplaythrough">
	//   13   23:bipush          6
	//   14   25:anewarray       String[]
	//   15   28:dup             
	//   16   29:iconst_0        
	//   17   30:ldc2            #314 <String "duration">
	//   18   33:aastore         
	//   19   34:dup             
	//   20   35:iconst_1        
	//   21   36:aload_1         
	//   22   37:invokevirtual   #317 <Method int acm.getDuration()>
	//   23   40:i2f             
	//   24   41:ldc2            #318 <Float 1000F>
	//   25   44:fdiv            
	//   26   45:invokestatic    #321 <Method String String.valueOf(float)>
	//   27   48:aastore         
	//   28   49:dup             
	//   29   50:iconst_2        
	//   30   51:ldc2            #323 <String "videoWidth">
	//   31   54:aastore         
	//   32   55:dup             
	//   33   56:iconst_3        
	//   34   57:aload_0         
	//   35   58:getfield        #76  <Field acm f>
	//   36   61:invokevirtual   #326 <Method int acm.getVideoWidth()>
	//   37   64:invokestatic    #329 <Method String String.valueOf(int)>
	//   38   67:aastore         
	//   39   68:dup             
	//   40   69:iconst_4        
	//   41   70:ldc2            #331 <String "videoHeight">
	//   42   73:aastore         
	//   43   74:dup             
	//   44   75:iconst_5        
	//   45   76:aload_0         
	//   46   77:getfield        #76  <Field acm f>
	//   47   80:invokevirtual   #334 <Method int acm.getVideoHeight()>
	//   48   83:invokestatic    #329 <Method String String.valueOf(int)>
	//   49   86:aastore         
	//   50   87:invokespecial   #159 <Method void a(String, String[])>
	//   51   90:return          
	}

	public final void b(int i1)
	{
		f.c(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #336 <Method void acm.c(int)>
	//    4    8:return          
	}

	public final void c()
	{
		if(a.d() != null && !h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field add a>
	//*   2    4:invokeinterface #196 <Method Activity add.d()>
	//*   3    9:ifnull          86
	//*   4   12:aload_0         
	//*   5   13:getfield        #198 <Field boolean h>
	//*   6   16:ifne            86
		{
			boolean flag;
			if((a.d().getWindow().getAttributes().flags & 0x80) != 0)
	//*   7   19:aload_0         
	//*   8   20:getfield        #41  <Field add a>
	//*   9   23:invokeinterface #196 <Method Activity add.d()>
	//*  10   28:invokevirtual   #206 <Method Window Activity.getWindow()>
	//*  11   31:invokevirtual   #340 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//*  12   34:getfield        #346 <Field int android.view.WindowManager$LayoutParams.flags>
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
			i = flag;
	//   21   51:aload_0         
	//   22   52:iload_1         
	//   23   53:putfield        #200 <Field boolean i>
			if(!i)
	//*  24   56:aload_0         
	//*  25   57:getfield        #200 <Field boolean i>
	//*  26   60:ifne            86
			{
				a.d().getWindow().addFlags(128);
	//   27   63:aload_0         
	//   28   64:getfield        #41  <Field add a>
	//   29   67:invokeinterface #196 <Method Activity add.d()>
	//   30   72:invokevirtual   #206 <Method Window Activity.getWindow()>
	//   31   75:sipush          128
	//   32   78:invokevirtual   #349 <Method void Window.addFlags(int)>
				h = true;
	//   33   81:aload_0         
	//   34   82:iconst_1        
	//   35   83:putfield        #198 <Field boolean h>
			}
		}
		g = true;
	//   36   86:aload_0         
	//   37   87:iconst_1        
	//   38   88:putfield        #351 <Field boolean g>
	//   39   91:return          
	}

	public final void c(int i1)
	{
		f.d(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #353 <Method void acm.d(int)>
	//    4    8:return          
	}

	public final void d()
	{
		a("pause", new String[0]);
	//    0    0:aload_0         
	//    1    1:ldc2            #355 <String "pause">
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #159 <Method void a(String, String[])>
		q();
	//    5   11:aload_0         
	//    6   12:invokespecial   #357 <Method void q()>
		g = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #351 <Field boolean g>
	//   10   20:return          
	}

	public final void d(int i1)
	{
		f.e(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #359 <Method void com.google.android.gms.internal.ads.acm.e(int)>
	//    4    8:return          
	}

	public final void e()
	{
		a("ended", new String[0]);
	//    0    0:aload_0         
	//    1    1:ldc2            #361 <String "ended">
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #159 <Method void a(String, String[])>
		q();
	//    5   11:aload_0         
	//    6   12:invokespecial   #357 <Method void q()>
	//    7   15:return          
	}

	public final void e(int i1)
	{
		f.f(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #363 <Method void acm.f(int)>
	//    4    8:return          
	}

	public final void f()
	{
		if(p && n != null && !p())
	//*   0    0:aload_0         
	//*   1    1:getfield        #270 <Field boolean p>
	//*   2    4:ifeq            70
	//*   3    7:aload_0         
	//*   4    8:getfield        #250 <Field Bitmap n>
	//*   5   11:ifnull          70
	//*   6   14:aload_0         
	//*   7   15:invokespecial   #365 <Method boolean p()>
	//*   8   18:ifne            70
		{
			o.setImageBitmap(n);
	//    9   21:aload_0         
	//   10   22:getfield        #110 <Field ImageView o>
	//   11   25:aload_0         
	//   12   26:getfield        #250 <Field Bitmap n>
	//   13   29:invokevirtual   #369 <Method void ImageView.setImageBitmap(Bitmap)>
			o.invalidate();
	//   14   32:aload_0         
	//   15   33:getfield        #110 <Field ImageView o>
	//   16   36:invokevirtual   #372 <Method void ImageView.invalidate()>
			b.addView(((android.view.View) (o)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   17   39:aload_0         
	//   18   40:getfield        #45  <Field FrameLayout b>
	//   19   43:aload_0         
	//   20   44:getfield        #110 <Field ImageView o>
	//   21   47:new             #47  <Class android.widget.FrameLayout$LayoutParams>
	//   22   50:dup             
	//   23   51:iconst_m1       
	//   24   52:iconst_m1       
	//   25   53:invokespecial   #50  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   26   56:invokevirtual   #80  <Method void FrameLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			b.bringChildToFront(((android.view.View) (o)));
	//   27   59:aload_0         
	//   28   60:getfield        #45  <Field FrameLayout b>
	//   29   63:aload_0         
	//   30   64:getfield        #110 <Field ImageView o>
	//   31   67:invokevirtual   #376 <Method void FrameLayout.bringChildToFront(android.view.View)>
		}
		d.a();
	//   32   70:aload_0         
	//   33   71:getfield        #144 <Field adg d>
	//   34   74:invokevirtual   #378 <Method void adg.a()>
		l = k;
	//   35   77:aload_0         
	//   36   78:aload_0         
	//   37   79:getfield        #380 <Field long k>
	//   38   82:putfield        #310 <Field long l>
		xg.a.post(((Runnable) (new acs(this))));
	//   39   85:getstatic       #219 <Field Handler xg.a>
	//   40   88:new             #382 <Class acs>
	//   41   91:dup             
	//   42   92:aload_0         
	//   43   93:invokespecial   #383 <Method void acs(aco)>
	//   44   96:invokevirtual   #228 <Method boolean Handler.post(Runnable)>
	//   45   99:pop             
	//   46  100:return          
	}

	public final void finalize()
	{
		d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field adg d>
	//    2    4:invokevirtual   #378 <Method void adg.a()>
		if(f != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field acm f>
	//*   5   11:ifnull          38
		{
			acm acm1 = f;
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field acm f>
	//    8   18:astore_1        
			Executor executor = abj.a;
	//    9   19:getstatic       #389 <Field Executor abj.a>
	//   10   22:astore_2        
			((Object) (acm1)).getClass();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #395 <Method Class Object.getClass()>
	//   13   27:pop             
			executor.execute(acp.a(acm1));
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokestatic    #400 <Method Runnable acp.a(acm)>
	//   17   33:invokeinterface #406 <Method void Executor.execute(Runnable)>
		}
		((Object)this).finalize();
	//   18   38:aload_0         
	//   19   39:invokespecial   #408 <Method void Object.finalize()>
		return;
	//   20   42:return          
		Exception exception;
		exception;
	//   21   43:astore_1        
		((Object)this).finalize();
	//   22   44:aload_0         
	//   23   45:invokespecial   #408 <Method void Object.finalize()>
		throw exception;
	//   24   48:aload_1         
	//   25   49:athrow          
	}

	public final void g()
	{
		if(g && p())
	//*   0    0:aload_0         
	//*   1    1:getfield        #351 <Field boolean g>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #365 <Method boolean p()>
	//*   5   11:ifeq            25
			b.removeView(((android.view.View) (o)));
	//    6   14:aload_0         
	//    7   15:getfield        #45  <Field FrameLayout b>
	//    8   18:aload_0         
	//    9   19:getfield        #110 <Field ImageView o>
	//   10   22:invokevirtual   #411 <Method void FrameLayout.removeView(android.view.View)>
		if(n != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #250 <Field Bitmap n>
	//*  13   29:ifnull          161
		{
			long l1 = aw.l().b();
	//   14   32:invokestatic    #416 <Method e aw.l()>
	//   15   35:invokeinterface #420 <Method long e.b()>
	//   16   40:lstore_1        
			if(f.getBitmap(n) != null)
	//*  17   41:aload_0         
	//*  18   42:getfield        #76  <Field acm f>
	//*  19   45:aload_0         
	//*  20   46:getfield        #250 <Field Bitmap n>
	//*  21   49:invokevirtual   #424 <Method Bitmap acm.getBitmap(Bitmap)>
	//*  22   52:ifnull          60
				p = true;
	//   23   55:aload_0         
	//   24   56:iconst_1        
	//   25   57:putfield        #270 <Field boolean p>
			l1 = aw.l().b() - l1;
	//   26   60:invokestatic    #416 <Method e aw.l()>
	//   27   63:invokeinterface #420 <Method long e.b()>
	//   28   68:lload_1         
	//   29   69:lsub            
	//   30   70:lstore_1        
			if(wx.a())
	//*  31   71:invokestatic    #428 <Method boolean wx.a()>
	//*  32   74:ifeq            116
			{
				StringBuilder stringbuilder = new StringBuilder(46);
	//   33   77:new             #430 <Class StringBuilder>
	//   34   80:dup             
	//   35   81:bipush          46
	//   36   83:invokespecial   #432 <Method void StringBuilder(int)>
	//   37   86:astore_3        
				stringbuilder.append("Spinner frame grab took ");
	//   38   87:aload_3         
	//   39   88:ldc2            #434 <String "Spinner frame grab took ">
	//   40   91:invokevirtual   #438 <Method StringBuilder StringBuilder.append(String)>
	//   41   94:pop             
				stringbuilder.append(l1);
	//   42   95:aload_3         
	//   43   96:lload_1         
	//   44   97:invokevirtual   #441 <Method StringBuilder StringBuilder.append(long)>
	//   45  100:pop             
				stringbuilder.append("ms");
	//   46  101:aload_3         
	//   47  102:ldc2            #443 <String "ms">
	//   48  105:invokevirtual   #438 <Method StringBuilder StringBuilder.append(String)>
	//   49  108:pop             
				wx.a(stringbuilder.toString());
	//   50  109:aload_3         
	//   51  110:invokevirtual   #447 <Method String StringBuilder.toString()>
	//   52  113:invokestatic    #449 <Method void wx.a(String)>
			}
			if(l1 > e)
	//*  53  116:lload_1         
	//*  54  117:aload_0         
	//*  55  118:getfield        #121 <Field long e>
	//*  56  121:lcmp            
	//*  57  122:ifle            161
			{
				com.google.android.gms.internal.ads.wx.e("Spinner frame grab crossed jank threshold! Suspending spinner.");
	//   58  125:ldc2            #451 <String "Spinner frame grab crossed jank threshold! Suspending spinner.">
	//   59  128:invokestatic    #453 <Method void com.google.android.gms.internal.ads.wx.e(String)>
				j = false;
	//   60  131:aload_0         
	//   61  132:iconst_0        
	//   62  133:putfield        #126 <Field boolean j>
				n = null;
	//   63  136:aload_0         
	//   64  137:aconst_null     
	//   65  138:putfield        #250 <Field Bitmap n>
				ad ad1 = c;
	//   66  141:aload_0         
	//   67  142:getfield        #43  <Field ad c>
	//   68  145:astore_3        
				if(ad1 != null)
	//*  69  146:aload_3         
	//*  70  147:ifnull          161
					ad1.a("spinner_jank", Long.toString(l1));
	//   71  150:aload_3         
	//   72  151:ldc2            #455 <String "spinner_jank">
	//   73  154:lload_1         
	//   74  155:invokestatic    #458 <Method String Long.toString(long)>
	//   75  158:invokevirtual   #137 <Method void ad.a(String, String)>
			}
		}
	//   76  161:return          
	}

	public final void h()
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field acm f>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(!TextUtils.isEmpty(((CharSequence) (m))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #293 <Field String m>
	//*   6   12:invokestatic    #464 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   15:ifne            30
		{
			f.setVideoPath(m);
	//    8   18:aload_0         
	//    9   19:getfield        #76  <Field acm f>
	//   10   22:aload_0         
	//   11   23:getfield        #293 <Field String m>
	//   12   26:invokevirtual   #467 <Method void acm.setVideoPath(String)>
			return;
	//   13   29:return          
		} else
		{
			a("no_src", new String[0]);
	//   14   30:aload_0         
	//   15   31:ldc2            #469 <String "no_src">
	//   16   34:iconst_0        
	//   17   35:anewarray       String[]
	//   18   38:invokespecial   #159 <Method void a(String, String[])>
			return;
	//   19   41:return          
		}
	}

	public final void i()
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_1        
		if(acm1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			acm1.d();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #471 <Method void acm.d()>
			return;
	//    8   14:return          
		}
	}

	public final void j()
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_1        
		if(acm1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			acm1.c();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #473 <Method void acm.c()>
			return;
	//    8   14:return          
		}
	}

	public final void k()
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_1        
		if(acm1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			acm1.b.a(true);
	//    6   10:aload_1         
	//    7   11:getfield        #476 <Field adh acm.b>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #480 <Method void adh.a(boolean)>
			acm1.e();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #482 <Method void com.google.android.gms.internal.ads.acm.e()>
			return;
	//   12   22:return          
		}
	}

	public final void l()
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_1        
		if(acm1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			acm1.b.a(false);
	//    6   10:aload_1         
	//    7   11:getfield        #476 <Field adh acm.b>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #480 <Method void adh.a(boolean)>
			acm1.e();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #482 <Method void com.google.android.gms.internal.ads.acm.e()>
			return;
	//   12   22:return          
		}
	}

	public final void m()
	{
		Object obj = ((Object) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		TextView textview = new TextView(((acm) (obj)).getContext());
	//    6   10:new             #484 <Class TextView>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokevirtual   #488 <Method Context acm.getContext()>
	//   10   18:invokespecial   #489 <Method void TextView(Context)>
	//   11   21:astore_2        
		obj = ((Object) (String.valueOf(((Object) (f.a())))));
	//   12   22:aload_0         
	//   13   23:getfield        #76  <Field acm f>
	//   14   26:invokevirtual   #491 <Method String acm.a()>
	//   15   29:invokestatic    #494 <Method String String.valueOf(Object)>
	//   16   32:astore_1        
		if(((String) (obj)).length() != 0)
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #497 <Method int String.length()>
	//*  19   37:ifeq            51
			obj = ((Object) ("AdMob - ".concat(((String) (obj)))));
	//   20   40:ldc2            #499 <String "AdMob - ">
	//   21   43:aload_1         
	//   22   44:invokevirtual   #503 <Method String String.concat(String)>
	//   23   47:astore_1        
		else
	//*  24   48:goto            62
			obj = ((Object) (new String("AdMob - ")));
	//   25   51:new             #295 <Class String>
	//   26   54:dup             
	//   27   55:ldc2            #499 <String "AdMob - ">
	//   28   58:invokespecial   #505 <Method void String(String)>
	//   29   61:astore_1        
		textview.setText(((CharSequence) (obj)));
	//   30   62:aload_2         
	//   31   63:aload_1         
	//   32   64:invokevirtual   #509 <Method void TextView.setText(CharSequence)>
		textview.setTextColor(0xffff0000);
	//   33   67:aload_2         
	//   34   68:ldc2            #510 <Int 0xffff0000>
	//   35   71:invokevirtual   #513 <Method void TextView.setTextColor(int)>
		textview.setBackgroundColor(-256);
	//   36   74:aload_2         
	//   37   75:sipush          -256
	//   38   78:invokevirtual   #516 <Method void TextView.setBackgroundColor(int)>
		b.addView(((android.view.View) (textview)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2, 17))));
	//   39   81:aload_0         
	//   40   82:getfield        #45  <Field FrameLayout b>
	//   41   85:aload_2         
	//   42   86:new             #47  <Class android.widget.FrameLayout$LayoutParams>
	//   43   89:dup             
	//   44   90:bipush          -2
	//   45   92:bipush          -2
	//   46   94:bipush          17
	//   47   96:invokespecial   #79  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//   48   99:invokevirtual   #80  <Method void FrameLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		b.bringChildToFront(((android.view.View) (textview)));
	//   49  102:aload_0         
	//   50  103:getfield        #45  <Field FrameLayout b>
	//   51  106:aload_2         
	//   52  107:invokevirtual   #376 <Method void FrameLayout.bringChildToFront(android.view.View)>
	//   53  110:return          
	}

	public final void n()
	{
		d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field adg d>
	//    2    4:invokevirtual   #378 <Method void adg.a()>
		acm acm1 = f;
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field acm f>
	//    5   11:astore_1        
		if(acm1 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          20
			acm1.b();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #517 <Method void acm.b()>
		q();
	//   10   20:aload_0         
	//   11   21:invokespecial   #357 <Method void q()>
	//   12   24:return          
	}

	final void o()
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_3        
		if(acm1 == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		long l1 = acm1.getCurrentPosition();
	//    6   10:aload_3         
	//    7   11:invokevirtual   #520 <Method int acm.getCurrentPosition()>
	//    8   14:i2l             
	//    9   15:lstore_1        
		if(k != l1 && l1 > 0L)
	//*  10   16:aload_0         
	//*  11   17:getfield        #380 <Field long k>
	//*  12   20:lload_1         
	//*  13   21:lcmp            
	//*  14   22:ifeq            65
	//*  15   25:lload_1         
	//*  16   26:lconst_0        
	//*  17   27:lcmp            
	//*  18   28:ifle            65
		{
			a("timeupdate", new String[] {
				"time", String.valueOf((float)l1 / 1000F)
			});
	//   19   31:aload_0         
	//   20   32:ldc2            #522 <String "timeupdate">
	//   21   35:iconst_2        
	//   22   36:anewarray       String[]
	//   23   39:dup             
	//   24   40:iconst_0        
	//   25   41:ldc2            #524 <String "time">
	//   26   44:aastore         
	//   27   45:dup             
	//   28   46:iconst_1        
	//   29   47:lload_1         
	//   30   48:l2f             
	//   31   49:ldc2            #318 <Float 1000F>
	//   32   52:fdiv            
	//   33   53:invokestatic    #321 <Method String String.valueOf(float)>
	//   34   56:aastore         
	//   35   57:invokespecial   #159 <Method void a(String, String[])>
			k = l1;
	//   36   60:aload_0         
	//   37   61:lload_1         
	//   38   62:putfield        #380 <Field long k>
		}
	//   39   65:return          
	}

	public final void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #527 <Method void FrameLayout.onWindowFocusChanged(boolean)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            19
		{
			d.b();
	//    5    9:aload_0         
	//    6   10:getfield        #144 <Field adg d>
	//    7   13:invokevirtual   #214 <Method void adg.b()>
		} else
	//*   8   16:goto            34
		{
			d.a();
	//    9   19:aload_0         
	//   10   20:getfield        #144 <Field adg d>
	//   11   23:invokevirtual   #378 <Method void adg.a()>
			l = k;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #380 <Field long k>
	//   15   31:putfield        #310 <Field long l>
		}
		xg.a.post(((Runnable) (new acq(this, flag))));
	//   16   34:getstatic       #219 <Field Handler xg.a>
	//   17   37:new             #529 <Class acq>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:iload_1         
	//   21   43:invokespecial   #532 <Method void acq(aco, boolean)>
	//   22   46:invokevirtual   #228 <Method boolean Handler.post(Runnable)>
	//   23   49:pop             
	//   24   50:return          
	}

	public final void onWindowVisibilityChanged(int i1)
	{
		super.onWindowVisibilityChanged(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #535 <Method void FrameLayout.onWindowVisibilityChanged(int)>
		boolean flag;
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            21
		{
			d.b();
	//    5    9:aload_0         
	//    6   10:getfield        #144 <Field adg d>
	//    7   13:invokevirtual   #214 <Method void adg.b()>
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
		} else
	//*  10   18:goto            38
		{
			d.a();
	//   11   21:aload_0         
	//   12   22:getfield        #144 <Field adg d>
	//   13   25:invokevirtual   #378 <Method void adg.a()>
			l = k;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #380 <Field long k>
	//   17   33:putfield        #310 <Field long l>
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_2        
		}
		xg.a.post(((Runnable) (new act(this, flag))));
	//   20   38:getstatic       #219 <Field Handler xg.a>
	//   21   41:new             #537 <Class act>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:iload_2         
	//   25   47:invokespecial   #538 <Method void act(aco, boolean)>
	//   26   50:invokevirtual   #228 <Method boolean Handler.post(Runnable)>
	//   27   53:pop             
	//   28   54:return          
	}

	public final void setVolume(float f1)
	{
		acm acm1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field acm f>
	//    2    4:astore_2        
		if(acm1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			acm1.b.a(f1);
	//    6   10:aload_2         
	//    7   11:getfield        #476 <Field adh acm.b>
	//    8   14:fload_1         
	//    9   15:invokevirtual   #542 <Method void adh.a(float)>
			acm1.e();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #482 <Method void com.google.android.gms.internal.ads.acm.e()>
			return;
	//   12   22:return          
		}
	}

	private final add a;
	private final FrameLayout b;
	private final ad c;
	private final adg d = new adg(this);
	private final long e;
	private acm f;
	private boolean g;
	private boolean h;
	private boolean i;
	private boolean j;
	private long k;
	private long l;
	private String m;
	private Bitmap n;
	private ImageView o;
	private boolean p;
}
