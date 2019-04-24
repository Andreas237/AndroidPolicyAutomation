// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.*;
import com.mixpanel.android.a.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.mixpanel.android.b:
//			n, k

private static class n$c
	implements Callable
{

	private void a(n$d n$d1)
	{
		View view = n$d1.b;
	//    0    0:aload_1         
	//    1    1:getfield        #61  <Field View n$d.b>
	//    2    4:astore          11
		Object obj;
		obj = ((Object) (((Class) (android/view/View)).getDeclaredMethod("createSnapshot", new Class[] {
			android/graphics/Bitmap$Config, Integer.TYPE, Boolean.TYPE
		})));
	//    3    6:ldc1            #63  <Class View>
	//    4    8:ldc1            #65  <String "createSnapshot">
	//    5   10:iconst_3        
	//    6   11:anewarray       Class[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #69  <Class android.graphics.Bitmap$Config>
	//   10   18:aastore         
	//   11   19:dup             
	//   12   20:iconst_1        
	//   13   21:getstatic       #75  <Field Class Integer.TYPE>
	//   14   24:aastore         
	//   15   25:dup             
	//   16   26:iconst_2        
	//   17   27:getstatic       #78  <Field Class Boolean.TYPE>
	//   18   30:aastore         
	//   19   31:invokevirtual   #82  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   20   34:astore          8
		((Method) (obj)).setAccessible(true);
	//   21   36:aload           8
	//   22   38:iconst_1        
	//   23   39:invokevirtual   #88  <Method void Method.setAccessible(boolean)>
		obj = ((Object) ((Bitmap)((Method) (obj)).invoke(((Object) (view)), new Object[] {
			android.graphics.ap.Config.RGB_565, Integer.valueOf(-1), Boolean.valueOf(false)
		})));
	//   24   42:aload           8
	//   25   44:aload           11
	//   26   46:iconst_3        
	//   27   47:anewarray       Object[]
	//   28   50:dup             
	//   29   51:iconst_0        
	//   30   52:getstatic       #92  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   31   55:aastore         
	//   32   56:dup             
	//   33   57:iconst_1        
	//   34   58:iconst_m1       
	//   35   59:invokestatic    #96  <Method Integer Integer.valueOf(int)>
	//   36   62:aastore         
	//   37   63:dup             
	//   38   64:iconst_2        
	//   39   65:iconst_0        
	//   40   66:invokestatic    #99  <Method Boolean Boolean.valueOf(boolean)>
	//   41   69:aastore         
	//   42   70:invokevirtual   #103 <Method Object Method.invoke(Object, Object[])>
	//   43   73:checkcast       #105 <Class Bitmap>
	//   44   76:astore          8
		break MISSING_BLOCK_LABEL_145;
	//   45   78:goto            145
		obj;
	//   46   81:astore          8
		Object obj1;
		obj1 = "createSnapshot didn't return a bitmap?";
	//   47   83:ldc1            #107 <String "createSnapshot didn't return a bitmap?">
	//   48   85:astore          9
		break MISSING_BLOCK_LABEL_105;
	//   49   87:goto            105
		obj;
	//   50   90:astore          8
		obj1 = "Can't access createSnapshot, using drawCache";
	//   51   92:ldc1            #109 <String "Can't access createSnapshot, using drawCache">
	//   52   94:astore          9
		break MISSING_BLOCK_LABEL_105;
	//   53   96:goto            105
		obj;
	//   54   99:astore          8
		obj1 = "Exception when calling createSnapshot";
	//   55  101:ldc1            #111 <String "Exception when calling createSnapshot">
	//   56  103:astore          9
		f.e("MixpanelAPI.Snapshot", ((String) (obj1)), ((Throwable) (obj)));
	//   57  105:ldc1            #113 <String "MixpanelAPI.Snapshot">
	//   58  107:aload           9
	//   59  109:aload           8
	//   60  111:invokestatic    #118 <Method void f.e(String, String, Throwable)>
		break MISSING_BLOCK_LABEL_142;
	//   61  114:goto            142
		obj;
	//   62  117:astore          8
		f.b("MixpanelAPI.Snapshot", "Can't call createSnapshot with arguments", ((Throwable) (obj)));
	//   63  119:ldc1            #113 <String "MixpanelAPI.Snapshot">
	//   64  121:ldc1            #120 <String "Can't call createSnapshot with arguments">
	//   65  123:aload           8
	//   66  125:invokestatic    #122 <Method void f.b(String, String, Throwable)>
		break MISSING_BLOCK_LABEL_142;
	//   67  128:goto            142
		obj;
	//   68  131:astore          8
		f.a("MixpanelAPI.Snapshot", "Can't call createSnapshot, will use drawCache", ((Throwable) (obj)));
	//   69  133:ldc1            #113 <String "MixpanelAPI.Snapshot">
	//   70  135:ldc1            #124 <String "Can't call createSnapshot, will use drawCache">
	//   71  137:aload           8
	//   72  139:invokestatic    #126 <Method void f.a(String, String, Throwable)>
		obj = null;
	//   73  142:aconst_null     
	//   74  143:astore          8
		if(obj != null)
			break MISSING_BLOCK_LABEL_244;
	//   75  145:aload           8
	//   76  147:ifnonnull       244
		obj1 = ((Object) (Boolean.valueOf(view.isDrawingCacheEnabled())));
	//   77  150:aload           11
	//   78  152:invokevirtual   #130 <Method boolean View.isDrawingCacheEnabled()>
	//   79  155:invokestatic    #99  <Method Boolean Boolean.valueOf(boolean)>
	//   80  158:astore          9
		Bitmap bitmap;
		view.setDrawingCacheEnabled(true);
	//   81  160:aload           11
	//   82  162:iconst_1        
	//   83  163:invokevirtual   #133 <Method void View.setDrawingCacheEnabled(boolean)>
		view.buildDrawingCache(true);
	//   84  166:aload           11
	//   85  168:iconst_1        
	//   86  169:invokevirtual   #136 <Method void View.buildDrawingCache(boolean)>
		bitmap = view.getDrawingCache();
	//   87  172:aload           11
	//   88  174:invokevirtual   #140 <Method Bitmap View.getDrawingCache()>
	//   89  177:astore          10
		obj = ((Object) (bitmap));
	//   90  179:aload           10
	//   91  181:astore          8
		break MISSING_BLOCK_LABEL_247;
	//   92  183:goto            247
		RuntimeException runtimeexception;
		runtimeexception;
	//   93  186:astore          10
		break MISSING_BLOCK_LABEL_196;
	//   94  188:goto            196
		runtimeexception;
	//   95  191:astore          10
		obj1 = null;
	//   96  193:aconst_null     
	//   97  194:astore          9
		StringBuilder stringbuilder = new StringBuilder();
	//   98  196:new             #142 <Class StringBuilder>
	//   99  199:dup             
	//  100  200:invokespecial   #143 <Method void StringBuilder()>
	//  101  203:astore          12
		stringbuilder.append("Can't take a bitmap snapshot of view ");
	//  102  205:aload           12
	//  103  207:ldc1            #145 <String "Can't take a bitmap snapshot of view ">
	//  104  209:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  105  212:pop             
		stringbuilder.append(((Object) (view)));
	//  106  213:aload           12
	//  107  215:aload           11
	//  108  217:invokevirtual   #152 <Method StringBuilder StringBuilder.append(Object)>
	//  109  220:pop             
		stringbuilder.append(", skipping for now.");
	//  110  221:aload           12
	//  111  223:ldc1            #154 <String ", skipping for now.">
	//  112  225:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  113  228:pop             
		f.a("MixpanelAPI.Snapshot", stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//  114  229:ldc1            #113 <String "MixpanelAPI.Snapshot">
	//  115  231:aload           12
	//  116  233:invokevirtual   #158 <Method String StringBuilder.toString()>
	//  117  236:aload           10
	//  118  238:invokestatic    #126 <Method void f.a(String, String, Throwable)>
		break MISSING_BLOCK_LABEL_247;
	//  119  241:goto            247
		obj1 = null;
	//  120  244:aconst_null     
	//  121  245:astore          9
		float f1 = 1.0F;
	//  122  247:fconst_1        
	//  123  248:fstore_2        
		float f2 = f1;
	//  124  249:fload_2         
	//  125  250:fstore_3        
		if(obj != null)
	//* 126  251:aload           8
	//* 127  253:ifnull          367
		{
			int i = ((Bitmap) (obj)).getDensity();
	//  128  256:aload           8
	//  129  258:invokevirtual   #162 <Method int Bitmap.getDensity()>
	//  130  261:istore          4
			if(i != 0)
	//* 131  263:iload           4
	//* 132  265:ifeq            275
				f1 = 160F / (float)i;
	//  133  268:ldc1            #163 <Float 160F>
	//  134  270:iload           4
	//  135  272:i2f             
	//  136  273:fdiv            
	//  137  274:fstore_2        
			i = ((Bitmap) (obj)).getWidth();
	//  138  275:aload           8
	//  139  277:invokevirtual   #166 <Method int Bitmap.getWidth()>
	//  140  280:istore          4
			int j = ((Bitmap) (obj)).getHeight();
	//  141  282:aload           8
	//  142  284:invokevirtual   #169 <Method int Bitmap.getHeight()>
	//  143  287:istore          5
			int l = (int)((double)((float)((Bitmap) (obj)).getWidth() * f1) + 0.5D);
	//  144  289:aload           8
	//  145  291:invokevirtual   #166 <Method int Bitmap.getWidth()>
	//  146  294:i2f             
	//  147  295:fload_2         
	//  148  296:fmul            
	//  149  297:f2d             
	//  150  298:ldc2w           #170 <Double 0.5D>
	//  151  301:dadd            
	//  152  302:d2i             
	//  153  303:istore          6
			int i1 = (int)((double)((float)((Bitmap) (obj)).getHeight() * f1) + 0.5D);
	//  154  305:aload           8
	//  155  307:invokevirtual   #169 <Method int Bitmap.getHeight()>
	//  156  310:i2f             
	//  157  311:fload_2         
	//  158  312:fmul            
	//  159  313:f2d             
	//  160  314:ldc2w           #170 <Double 0.5D>
	//  161  317:dadd            
	//  162  318:d2i             
	//  163  319:istore          7
			f2 = f1;
	//  164  321:fload_2         
	//  165  322:fstore_3        
			if(i > 0)
	//* 166  323:iload           4
	//* 167  325:ifle            367
			{
				f2 = f1;
	//  168  328:fload_2         
	//  169  329:fstore_3        
				if(j > 0)
	//* 170  330:iload           5
	//* 171  332:ifle            367
				{
					f2 = f1;
	//  172  335:fload_2         
	//  173  336:fstore_3        
					if(l > 0)
	//* 174  337:iload           6
	//* 175  339:ifle            367
					{
						f2 = f1;
	//  176  342:fload_2         
	//  177  343:fstore_3        
						if(i1 > 0)
	//* 178  344:iload           7
	//* 179  346:ifle            367
						{
							d.a(l, i1, 160, ((Bitmap) (obj)));
	//  180  349:aload_0         
	//  181  350:getfield        #42  <Field n$a d>
	//  182  353:iload           6
	//  183  355:iload           7
	//  184  357:sipush          160
	//  185  360:aload           8
	//  186  362:invokevirtual   #174 <Method void n$a.a(int, int, int, Bitmap)>
							f2 = f1;
	//  187  365:fload_2         
	//  188  366:fstore_3        
						}
					}
				}
			}
		}
		if(obj1 != null && !((Boolean) (obj1)).booleanValue())
	//* 189  367:aload           9
	//* 190  369:ifnull          386
	//* 191  372:aload           9
	//* 192  374:invokevirtual   #177 <Method boolean Boolean.booleanValue()>
	//* 193  377:ifne            386
			view.setDrawingCacheEnabled(false);
	//  194  380:aload           11
	//  195  382:iconst_0        
	//  196  383:invokevirtual   #133 <Method void View.setDrawingCacheEnabled(boolean)>
		n$d1.d = f2;
	//  197  386:aload_1         
	//  198  387:fload_3         
	//  199  388:putfield        #180 <Field float n$d.d>
		n$d1.c = d;
	//  200  391:aload_1         
	//  201  392:aload_0         
	//  202  393:getfield        #42  <Field n$a d>
	//  203  396:putfield        #182 <Field n$a n$d.c>
		return;
	//  204  399:return          
	}

	public List a()
	{
		b.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List b>
	//    2    4:invokeinterface #188 <Method void List.clear()>
		Object obj;
		for(Iterator iterator = a.a().iterator(); iterator.hasNext(); b.add(obj))
	//*   3    9:aload_0         
	//*   4   10:getfield        #190 <Field k a>
	//*   5   13:invokevirtual   #195 <Method Set k.a()>
	//*   6   16:invokeinterface #201 <Method Iterator Set.iterator()>
	//*   7   21:astore_3        
	//*   8   22:aload_3         
	//*   9   23:invokeinterface #206 <Method boolean Iterator.hasNext()>
	//*  10   28:ifeq            110
		{
			obj = ((Object) ((Activity)iterator.next()));
	//   11   31:aload_3         
	//   12   32:invokeinterface #210 <Method Object Iterator.next()>
	//   13   37:checkcast       #212 <Class Activity>
	//   14   40:astore          4
			String s = obj.getClass().getCanonicalName();
	//   15   42:aload           4
	//   16   44:invokevirtual   #216 <Method Class Object.getClass()>
	//   17   47:invokevirtual   #219 <Method String Class.getCanonicalName()>
	//   18   50:astore          5
			View view = ((Activity) (obj)).getWindow().getDecorView().getRootView();
	//   19   52:aload           4
	//   20   54:invokevirtual   #223 <Method Window Activity.getWindow()>
	//   21   57:invokevirtual   #229 <Method View Window.getDecorView()>
	//   22   60:invokevirtual   #232 <Method View View.getRootView()>
	//   23   63:astore          6
			((Activity) (obj)).getWindowManager().getDefaultDisplay().getMetrics(c);
	//   24   65:aload           4
	//   25   67:invokevirtual   #236 <Method WindowManager Activity.getWindowManager()>
	//   26   70:invokeinterface #242 <Method Display WindowManager.getDefaultDisplay()>
	//   27   75:aload_0         
	//   28   76:getfield        #32  <Field DisplayMetrics c>
	//   29   79:invokevirtual   #248 <Method void Display.getMetrics(DisplayMetrics)>
			obj = ((Object) (new n$d(s, view)));
	//   30   82:new             #58  <Class n$d>
	//   31   85:dup             
	//   32   86:aload           5
	//   33   88:aload           6
	//   34   90:invokespecial   #251 <Method void n$d(String, View)>
	//   35   93:astore          4
		}

	//   36   95:aload_0         
	//   37   96:getfield        #37  <Field List b>
	//   38   99:aload           4
	//   39  101:invokeinterface #255 <Method boolean List.add(Object)>
	//   40  106:pop             
	//*  41  107:goto            22
		int j = b.size();
	//   42  110:aload_0         
	//   43  111:getfield        #37  <Field List b>
	//   44  114:invokeinterface #258 <Method int List.size()>
	//   45  119:istore_2        
		for(int i = 0; i < j; i++)
	//*  46  120:iconst_0        
	//*  47  121:istore_1        
	//*  48  122:iload_1         
	//*  49  123:iload_2         
	//*  50  124:icmpge          151
			a((n$d)b.get(i));
	//   51  127:aload_0         
	//   52  128:aload_0         
	//   53  129:getfield        #37  <Field List b>
	//   54  132:iload_1         
	//   55  133:invokeinterface #262 <Method Object List.get(int)>
	//   56  138:checkcast       #58  <Class n$d>
	//   57  141:invokespecial   #264 <Method void a(n$d)>

	//   58  144:iload_1         
	//   59  145:iconst_1        
	//   60  146:iadd            
	//   61  147:istore_1        
	//*  62  148:goto            122
		return b;
	//   63  151:aload_0         
	//   64  152:getfield        #37  <Field List b>
	//   65  155:areturn         
	}

	public void a(k k1)
	{
		a = k1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #190 <Field k a>
	//    3    5:return          
	}

	public Object call()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method List a()>
	//    2    4:areturn         
	}

	private k a;
	private final List b = new ArrayList();
	private final DisplayMetrics c = new DisplayMetrics();
	private final n$a d = new n$a();
	private final int e = 160;

	public n$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:sipush          160
	//    4    8:putfield        #27  <Field int e>
	//    5   11:aload_0         
	//    6   12:new             #29  <Class DisplayMetrics>
	//    7   15:dup             
	//    8   16:invokespecial   #30  <Method void DisplayMetrics()>
	//    9   19:putfield        #32  <Field DisplayMetrics c>
	//   10   22:aload_0         
	//   11   23:new             #34  <Class ArrayList>
	//   12   26:dup             
	//   13   27:invokespecial   #35  <Method void ArrayList()>
	//   14   30:putfield        #37  <Field List b>
	//   15   33:aload_0         
	//   16   34:new             #39  <Class n$a>
	//   17   37:dup             
	//   18   38:invokespecial   #40  <Method void n$a()>
	//   19   41:putfield        #42  <Field n$a d>
	//   20   44:return          
	}
}
