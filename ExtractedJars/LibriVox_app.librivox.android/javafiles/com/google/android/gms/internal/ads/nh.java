// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.gmsg.ag;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ni, xg, afn, ahb, 
//			bwk, zv, agv, ne, 
//			ng, bzl, wx, zzbbi

public final class nh extends ni
	implements ag
{

	public nh(afn afn1, Context context, bzl bzl1)
	{
		super(afn1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void ni(afn)>
		g = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #34  <Field int g>
		h = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #36  <Field int h>
		j = -1;
	//    9   15:aload_0         
	//   10   16:iconst_m1       
	//   11   17:putfield        #38  <Field int j>
		k = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #40  <Field int k>
		l = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #42  <Field int l>
		m = -1;
	//   18   30:aload_0         
	//   19   31:iconst_m1       
	//   20   32:putfield        #44  <Field int m>
		a = afn1;
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:putfield        #46  <Field afn a>
		b = context;
	//   24   40:aload_0         
	//   25   41:aload_2         
	//   26   42:putfield        #48  <Field Context b>
		d = bzl1;
	//   27   45:aload_0         
	//   28   46:aload_3         
	//   29   47:putfield        #50  <Field bzl d>
		c = (WindowManager)context.getSystemService("window");
	//   30   50:aload_0         
	//   31   51:aload_2         
	//   32   52:ldc1            #52  <String "window">
	//   33   54:invokevirtual   #58  <Method Object Context.getSystemService(String)>
	//   34   57:checkcast       #60  <Class WindowManager>
	//   35   60:putfield        #62  <Field WindowManager c>
	//   36   63:return          
	}

	public final void a(int i1, int j1)
	{
		boolean flag = b instanceof Activity;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Context b>
	//    2    4:instanceof      #66  <Class Activity>
	//    3    7:istore          4
		int k1 = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		if(flag)
	//*   6   11:iload           4
	//*   7   13:ifeq            32
			k1 = aw.e().c((Activity)b)[0];
	//    8   16:invokestatic    #71  <Method xg aw.e()>
	//    9   19:aload_0         
	//   10   20:getfield        #48  <Field Context b>
	//   11   23:checkcast       #66  <Class Activity>
	//   12   26:invokevirtual   #76  <Method int[] xg.c(Activity)>
	//   13   29:iconst_0        
	//   14   30:iaload          
	//   15   31:istore_3        
		if(a.u() == null || !a.u().e())
	//*  16   32:aload_0         
	//*  17   33:getfield        #46  <Field afn a>
	//*  18   36:invokeinterface #82  <Method ahb afn.u()>
	//*  19   41:ifnull          59
	//*  20   44:aload_0         
	//*  21   45:getfield        #46  <Field afn a>
	//*  22   48:invokeinterface #82  <Method ahb afn.u()>
	//*  23   53:invokevirtual   #87  <Method boolean ahb.e()>
	//*  24   56:ifne            107
		{
			bwk.a();
	//   25   59:invokestatic    #92  <Method zv bwk.a()>
	//   26   62:pop             
			l = zv.b(b, a.getWidth());
	//   27   63:aload_0         
	//   28   64:aload_0         
	//   29   65:getfield        #48  <Field Context b>
	//   30   68:aload_0         
	//   31   69:getfield        #46  <Field afn a>
	//   32   72:invokeinterface #96  <Method int afn.getWidth()>
	//   33   77:invokestatic    #101 <Method int zv.b(Context, int)>
	//   34   80:putfield        #42  <Field int l>
			bwk.a();
	//   35   83:invokestatic    #92  <Method zv bwk.a()>
	//   36   86:pop             
			m = zv.b(b, a.getHeight());
	//   37   87:aload_0         
	//   38   88:aload_0         
	//   39   89:getfield        #48  <Field Context b>
	//   40   92:aload_0         
	//   41   93:getfield        #46  <Field afn a>
	//   42   96:invokeinterface #104 <Method int afn.getHeight()>
	//   43  101:invokestatic    #101 <Method int zv.b(Context, int)>
	//   44  104:putfield        #44  <Field int m>
		}
		((ni)this).b(i1, j1 - k1, l, m);
	//   45  107:aload_0         
	//   46  108:iload_1         
	//   47  109:iload_2         
	//   48  110:iload_3         
	//   49  111:isub            
	//   50  112:aload_0         
	//   51  113:getfield        #42  <Field int l>
	//   52  116:aload_0         
	//   53  117:getfield        #44  <Field int m>
	//   54  120:invokevirtual   #107 <Method void ni.b(int, int, int, int)>
		a.w().a(i1, j1);
	//   55  123:aload_0         
	//   56  124:getfield        #46  <Field afn a>
	//   57  127:invokeinterface #111 <Method agv afn.w()>
	//   58  132:iload_1         
	//   59  133:iload_2         
	//   60  134:invokeinterface #115 <Method void agv.a(int, int)>
	//   61  139:return          
	}

	public final void zza(Object obj, Map map)
	{
		e = new DisplayMetrics();
	//    0    0:aload_0         
	//    1    1:new             #119 <Class DisplayMetrics>
	//    2    4:dup             
	//    3    5:invokespecial   #122 <Method void DisplayMetrics()>
	//    4    8:putfield        #124 <Field DisplayMetrics e>
		obj = ((Object) (c.getDefaultDisplay()));
	//    5   11:aload_0         
	//    6   12:getfield        #62  <Field WindowManager c>
	//    7   15:invokeinterface #128 <Method Display WindowManager.getDefaultDisplay()>
	//    8   20:astore_1        
		((Display) (obj)).getMetrics(e);
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:getfield        #124 <Field DisplayMetrics e>
	//   12   26:invokevirtual   #134 <Method void Display.getMetrics(DisplayMetrics)>
		f = e.density;
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #124 <Field DisplayMetrics e>
	//   16   34:getfield        #137 <Field float DisplayMetrics.density>
	//   17   37:putfield        #139 <Field float f>
		i = ((Display) (obj)).getRotation();
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #142 <Method int Display.getRotation()>
	//   21   45:putfield        #144 <Field int i>
		bwk.a();
	//   22   48:invokestatic    #92  <Method zv bwk.a()>
	//   23   51:pop             
		obj = ((Object) (e));
	//   24   52:aload_0         
	//   25   53:getfield        #124 <Field DisplayMetrics e>
	//   26   56:astore_1        
		g = zv.b(((DisplayMetrics) (obj)), ((DisplayMetrics) (obj)).widthPixels);
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:aload_1         
	//   30   60:getfield        #147 <Field int DisplayMetrics.widthPixels>
	//   31   63:invokestatic    #150 <Method int zv.b(DisplayMetrics, int)>
	//   32   66:putfield        #34  <Field int g>
		bwk.a();
	//   33   69:invokestatic    #92  <Method zv bwk.a()>
	//   34   72:pop             
		obj = ((Object) (e));
	//   35   73:aload_0         
	//   36   74:getfield        #124 <Field DisplayMetrics e>
	//   37   77:astore_1        
		h = zv.b(((DisplayMetrics) (obj)), ((DisplayMetrics) (obj)).heightPixels);
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:aload_1         
	//   41   81:getfield        #153 <Field int DisplayMetrics.heightPixels>
	//   42   84:invokestatic    #150 <Method int zv.b(DisplayMetrics, int)>
	//   43   87:putfield        #36  <Field int h>
		obj = ((Object) (a.d()));
	//   44   90:aload_0         
	//   45   91:getfield        #46  <Field afn a>
	//   46   94:invokeinterface #156 <Method Activity afn.d()>
	//   47   99:astore_1        
		if(obj != null && ((Activity) (obj)).getWindow() != null)
	//*  48  100:aload_1         
	//*  49  101:ifnull          162
	//*  50  104:aload_1         
	//*  51  105:invokevirtual   #160 <Method android.view.Window Activity.getWindow()>
	//*  52  108:ifnonnull       114
	//*  53  111:goto            162
		{
			aw.e();
	//   54  114:invokestatic    #71  <Method xg aw.e()>
	//   55  117:pop             
			obj = ((Object) (xg.a(((Activity) (obj)))));
	//   56  118:aload_1         
	//   57  119:invokestatic    #162 <Method int[] xg.a(Activity)>
	//   58  122:astore_1        
			bwk.a();
	//   59  123:invokestatic    #92  <Method zv bwk.a()>
	//   60  126:pop             
			j = zv.b(e, obj[0]);
	//   61  127:aload_0         
	//   62  128:aload_0         
	//   63  129:getfield        #124 <Field DisplayMetrics e>
	//   64  132:aload_1         
	//   65  133:iconst_0        
	//   66  134:iaload          
	//   67  135:invokestatic    #150 <Method int zv.b(DisplayMetrics, int)>
	//   68  138:putfield        #38  <Field int j>
			bwk.a();
	//   69  141:invokestatic    #92  <Method zv bwk.a()>
	//   70  144:pop             
			k = zv.b(e, obj[1]);
	//   71  145:aload_0         
	//   72  146:aload_0         
	//   73  147:getfield        #124 <Field DisplayMetrics e>
	//   74  150:aload_1         
	//   75  151:iconst_1        
	//   76  152:iaload          
	//   77  153:invokestatic    #150 <Method int zv.b(DisplayMetrics, int)>
	//   78  156:putfield        #40  <Field int k>
		} else
	//*  79  159:goto            178
		{
			j = g;
	//   80  162:aload_0         
	//   81  163:aload_0         
	//   82  164:getfield        #34  <Field int g>
	//   83  167:putfield        #38  <Field int j>
			k = h;
	//   84  170:aload_0         
	//   85  171:aload_0         
	//   86  172:getfield        #36  <Field int h>
	//   87  175:putfield        #40  <Field int k>
		}
		if(a.u().e())
	//*  88  178:aload_0         
	//*  89  179:getfield        #46  <Field afn a>
	//*  90  182:invokeinterface #82  <Method ahb afn.u()>
	//*  91  187:invokevirtual   #87  <Method boolean ahb.e()>
	//*  92  190:ifeq            212
		{
			l = g;
	//   93  193:aload_0         
	//   94  194:aload_0         
	//   95  195:getfield        #34  <Field int g>
	//   96  198:putfield        #42  <Field int l>
			m = h;
	//   97  201:aload_0         
	//   98  202:aload_0         
	//   99  203:getfield        #36  <Field int h>
	//  100  206:putfield        #44  <Field int m>
		} else
	//* 101  209:goto            223
		{
			a.measure(0, 0);
	//  102  212:aload_0         
	//  103  213:getfield        #46  <Field afn a>
	//  104  216:iconst_0        
	//  105  217:iconst_0        
	//  106  218:invokeinterface #165 <Method void afn.measure(int, int)>
		}
		((ni)this).a(g, h, j, k, f, i);
	//  107  223:aload_0         
	//  108  224:aload_0         
	//  109  225:getfield        #34  <Field int g>
	//  110  228:aload_0         
	//  111  229:getfield        #36  <Field int h>
	//  112  232:aload_0         
	//  113  233:getfield        #38  <Field int j>
	//  114  236:aload_0         
	//  115  237:getfield        #40  <Field int k>
	//  116  240:aload_0         
	//  117  241:getfield        #139 <Field float f>
	//  118  244:aload_0         
	//  119  245:getfield        #144 <Field int i>
	//  120  248:invokevirtual   #168 <Method void ni.a(int, int, int, int, float, int)>
		obj = ((Object) (new ne((new ng()).b(d.a()).a(d.b()).c(d.d()).d(d.c()).e(true), ((nf) (null)))));
	//  121  251:new             #170 <Class ne>
	//  122  254:dup             
	//  123  255:new             #172 <Class ng>
	//  124  258:dup             
	//  125  259:invokespecial   #173 <Method void ng()>
	//  126  262:aload_0         
	//  127  263:getfield        #50  <Field bzl d>
	//  128  266:invokevirtual   #177 <Method boolean bzl.a()>
	//  129  269:invokevirtual   #180 <Method ng ng.b(boolean)>
	//  130  272:aload_0         
	//  131  273:getfield        #50  <Field bzl d>
	//  132  276:invokevirtual   #182 <Method boolean bzl.b()>
	//  133  279:invokevirtual   #184 <Method ng ng.a(boolean)>
	//  134  282:aload_0         
	//  135  283:getfield        #50  <Field bzl d>
	//  136  286:invokevirtual   #186 <Method boolean bzl.d()>
	//  137  289:invokevirtual   #188 <Method ng ng.c(boolean)>
	//  138  292:aload_0         
	//  139  293:getfield        #50  <Field bzl d>
	//  140  296:invokevirtual   #190 <Method boolean bzl.c()>
	//  141  299:invokevirtual   #192 <Method ng ng.d(boolean)>
	//  142  302:iconst_1        
	//  143  303:invokevirtual   #194 <Method ng ng.e(boolean)>
	//  144  306:aconst_null     
	//  145  307:invokespecial   #197 <Method void ne(ng, nf)>
	//  146  310:astore_1        
		a.a("onDeviceFeaturesReceived", ((ne) (obj)).a());
	//  147  311:aload_0         
	//  148  312:getfield        #46  <Field afn a>
	//  149  315:ldc1            #199 <String "onDeviceFeaturesReceived">
	//  150  317:aload_1         
	//  151  318:invokevirtual   #202 <Method org.json.JSONObject ne.a()>
	//  152  321:invokeinterface #205 <Method void afn.a(String, org.json.JSONObject)>
		obj = ((Object) (new int[2]));
	//  153  326:iconst_2        
	//  154  327:newarray        int[]
	//  155  329:astore_1        
		a.getLocationOnScreen(((int []) (obj)));
	//  156  330:aload_0         
	//  157  331:getfield        #46  <Field afn a>
	//  158  334:aload_1         
	//  159  335:invokeinterface #209 <Method void afn.getLocationOnScreen(int[])>
		bwk.a();
	//  160  340:invokestatic    #92  <Method zv bwk.a()>
	//  161  343:pop             
		int i1 = zv.b(b, obj[0]);
	//  162  344:aload_0         
	//  163  345:getfield        #48  <Field Context b>
	//  164  348:aload_1         
	//  165  349:iconst_0        
	//  166  350:iaload          
	//  167  351:invokestatic    #101 <Method int zv.b(Context, int)>
	//  168  354:istore_3        
		bwk.a();
	//  169  355:invokestatic    #92  <Method zv bwk.a()>
	//  170  358:pop             
		a(i1, zv.b(b, obj[1]));
	//  171  359:aload_0         
	//  172  360:iload_3         
	//  173  361:aload_0         
	//  174  362:getfield        #48  <Field Context b>
	//  175  365:aload_1         
	//  176  366:iconst_1        
	//  177  367:iaload          
	//  178  368:invokestatic    #101 <Method int zv.b(Context, int)>
	//  179  371:invokevirtual   #210 <Method void a(int, int)>
		if(wx.a(2))
	//* 180  374:iconst_2        
	//* 181  375:invokestatic    #215 <Method boolean wx.a(int)>
	//* 182  378:ifeq            386
			wx.d("Dispatching Ready Event.");
	//  183  381:ldc1            #217 <String "Dispatching Ready Event.">
	//  184  383:invokestatic    #220 <Method void wx.d(String)>
		((ni)this).b(a.k().a);
	//  185  386:aload_0         
	//  186  387:aload_0         
	//  187  388:getfield        #46  <Field afn a>
	//  188  391:invokeinterface #223 <Method zzbbi afn.k()>
	//  189  396:getfield        #228 <Field String zzbbi.a>
	//  190  399:invokevirtual   #230 <Method void ni.b(String)>
	//  191  402:return          
	}

	private final afn a;
	private final Context b;
	private final WindowManager c;
	private final bzl d;
	private DisplayMetrics e;
	private float f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int l;
	private int m;
}
