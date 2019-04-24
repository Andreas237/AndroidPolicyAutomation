// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.startapp.android.publish.ads.banner.Banner;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.d;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.banner.banner3d:
//			Banner3D

public class Banner3DSize
{
	public static final class Size extends Enum
	{

		public static Size valueOf(String s)
		{
			return (Size)Enum.valueOf(com/startapp/android/publish/ads/banner/banner3d/Banner3DSize$Size, s);
		//    0    0:ldc1            #2   <Class Banner3DSize$Size>
		//    1    2:aload_0         
		//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Banner3DSize$Size>
		//    4    9:areturn         
		}

		public static Size[] values()
		{
			return (Size[])((Size []) ($VALUES)).clone();
		//    0    0:getstatic       #50  <Field Banner3DSize$Size[] $VALUES>
		//    1    3:invokevirtual   #70  <Method Object _5B_Lcom.startapp.android.publish.ads.banner.banner3d.Banner3DSize$Size_3B_.clone()>
		//    2    6:checkcast       #66  <Class Banner3DSize$Size[]>
		//    3    9:areturn         
		}

		public d getSize()
		{
			return size;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field d size>
		//    2    4:areturn         
		}

		private static final Size $VALUES[];
		public static final Size LARGE;
		public static final Size MEDIUM;
		public static final Size SMALL;
		public static final Size XLARGE;
		public static final Size XSMALL;
		public static final Size XXSMALL;
		private d size;

		static 
		{
			XXSMALL = new Size("XXSMALL", 0, new d(280, 50));
		//    0    0:new             #2   <Class Banner3DSize$Size>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "XXSMALL">
		//    3    6:iconst_0        
		//    4    7:new             #24  <Class d>
		//    5   10:dup             
		//    6   11:sipush          280
		//    7   14:bipush          50
		//    8   16:invokespecial   #28  <Method void d(int, int)>
		//    9   19:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
		//   10   22:putstatic       #33  <Field Banner3DSize$Size XXSMALL>
			XSMALL = new Size("XSMALL", 1, new d(300, 50));
		//   11   25:new             #2   <Class Banner3DSize$Size>
		//   12   28:dup             
		//   13   29:ldc1            #34  <String "XSMALL">
		//   14   31:iconst_1        
		//   15   32:new             #24  <Class d>
		//   16   35:dup             
		//   17   36:sipush          300
		//   18   39:bipush          50
		//   19   41:invokespecial   #28  <Method void d(int, int)>
		//   20   44:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
		//   21   47:putstatic       #36  <Field Banner3DSize$Size XSMALL>
			SMALL = new Size("SMALL", 2, new d(320, 50));
		//   22   50:new             #2   <Class Banner3DSize$Size>
		//   23   53:dup             
		//   24   54:ldc1            #37  <String "SMALL">
		//   25   56:iconst_2        
		//   26   57:new             #24  <Class d>
		//   27   60:dup             
		//   28   61:sipush          320
		//   29   64:bipush          50
		//   30   66:invokespecial   #28  <Method void d(int, int)>
		//   31   69:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
		//   32   72:putstatic       #39  <Field Banner3DSize$Size SMALL>
			MEDIUM = new Size("MEDIUM", 3, new d(468, 60));
		//   33   75:new             #2   <Class Banner3DSize$Size>
		//   34   78:dup             
		//   35   79:ldc1            #40  <String "MEDIUM">
		//   36   81:iconst_3        
		//   37   82:new             #24  <Class d>
		//   38   85:dup             
		//   39   86:sipush          468
		//   40   89:bipush          60
		//   41   91:invokespecial   #28  <Method void d(int, int)>
		//   42   94:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
		//   43   97:putstatic       #42  <Field Banner3DSize$Size MEDIUM>
			LARGE = new Size("LARGE", 4, new d(728, 90));
		//   44  100:new             #2   <Class Banner3DSize$Size>
		//   45  103:dup             
		//   46  104:ldc1            #43  <String "LARGE">
		//   47  106:iconst_4        
		//   48  107:new             #24  <Class d>
		//   49  110:dup             
		//   50  111:sipush          728
		//   51  114:bipush          90
		//   52  116:invokespecial   #28  <Method void d(int, int)>
		//   53  119:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
		//   54  122:putstatic       #45  <Field Banner3DSize$Size LARGE>
			XLARGE = new Size("XLARGE", 5, new d(1024, 90));
		//   55  125:new             #2   <Class Banner3DSize$Size>
		//   56  128:dup             
		//   57  129:ldc1            #46  <String "XLARGE">
		//   58  131:iconst_5        
		//   59  132:new             #24  <Class d>
		//   60  135:dup             
		//   61  136:sipush          1024
		//   62  139:bipush          90
		//   63  141:invokespecial   #28  <Method void d(int, int)>
		//   64  144:invokespecial   #31  <Method void Banner3DSize$Size(String, int, d)>
		//   65  147:putstatic       #48  <Field Banner3DSize$Size XLARGE>
			$VALUES = (new Size[] {
				XXSMALL, XSMALL, SMALL, MEDIUM, LARGE, XLARGE
			});
		//   66  150:bipush          6
		//   67  152:anewarray       Size[]
		//   68  155:dup             
		//   69  156:iconst_0        
		//   70  157:getstatic       #33  <Field Banner3DSize$Size XXSMALL>
		//   71  160:aastore         
		//   72  161:dup             
		//   73  162:iconst_1        
		//   74  163:getstatic       #36  <Field Banner3DSize$Size XSMALL>
		//   75  166:aastore         
		//   76  167:dup             
		//   77  168:iconst_2        
		//   78  169:getstatic       #39  <Field Banner3DSize$Size SMALL>
		//   79  172:aastore         
		//   80  173:dup             
		//   81  174:iconst_3        
		//   82  175:getstatic       #42  <Field Banner3DSize$Size MEDIUM>
		//   83  178:aastore         
		//   84  179:dup             
		//   85  180:iconst_4        
		//   86  181:getstatic       #45  <Field Banner3DSize$Size LARGE>
		//   87  184:aastore         
		//   88  185:dup             
		//   89  186:iconst_5        
		//   90  187:getstatic       #48  <Field Banner3DSize$Size XLARGE>
		//   91  190:aastore         
		//   92  191:putstatic       #50  <Field Banner3DSize$Size[] $VALUES>
		//*  93  194:return          
		}

		private Size(String s, int i, d d1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #54  <Method void Enum(String, int)>
			size = d1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #56  <Field d size>
		//    7   11:return          
		}
	}


	private static d a(Context context, ViewParent viewparent, BannerOptions banneroptions, Banner3D banner3d)
	{
		boolean flag1;
		Point point;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		point = new Point();
	//    2    3:new             #13  <Class Point>
	//    3    6:dup             
	//    4    7:invokespecial   #17  <Method void Point()>
	//    5   10:astore          6
		point.x = banneroptions.d();
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokevirtual   #23  <Method int BannerOptions.d()>
	//    9   18:putfield        #27  <Field int Point.x>
		point.y = banneroptions.e();
	//   10   21:aload           6
	//   11   23:aload_2         
	//   12   24:invokevirtual   #30  <Method int BannerOptions.e()>
	//   13   27:putfield        #33  <Field int Point.y>
		g.a("Banner3DSize", 3, "=============== set Application Size ===========");
	//   14   30:ldc1            #35  <String "Banner3DSize">
	//   15   32:iconst_3        
	//   16   33:ldc1            #37  <String "=============== set Application Size ===========">
	//   17   35:invokestatic    #42  <Method void g.a(String, int, String)>
		if(banner3d.getLayoutParams() != null && banner3d.getLayoutParams().width > 0)
	//*  18   38:aload_3         
	//*  19   39:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams Banner3D.getLayoutParams()>
	//*  20   42:ifnull          73
	//*  21   45:aload_3         
	//*  22   46:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams Banner3D.getLayoutParams()>
	//*  23   49:getfield        #53  <Field int android.view.ViewGroup$LayoutParams.width>
	//*  24   52:ifle            73
			point.x = h.b(context, banner3d.getLayoutParams().width + 1);
	//   25   55:aload           6
	//   26   57:aload_0         
	//   27   58:aload_3         
	//   28   59:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams Banner3D.getLayoutParams()>
	//   29   62:getfield        #53  <Field int android.view.ViewGroup$LayoutParams.width>
	//   30   65:iconst_1        
	//   31   66:iadd            
	//   32   67:invokestatic    #59  <Method int h.b(Context, int)>
	//   33   70:putfield        #27  <Field int Point.x>
		if(banner3d.getLayoutParams() != null && banner3d.getLayoutParams().height > 0)
	//*  34   73:aload_3         
	//*  35   74:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams Banner3D.getLayoutParams()>
	//*  36   77:ifnull          108
	//*  37   80:aload_3         
	//*  38   81:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams Banner3D.getLayoutParams()>
	//*  39   84:getfield        #62  <Field int android.view.ViewGroup$LayoutParams.height>
	//*  40   87:ifle            108
			point.y = h.b(context, banner3d.getLayoutParams().height + 1);
	//   41   90:aload           6
	//   42   92:aload_0         
	//   43   93:aload_3         
	//   44   94:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams Banner3D.getLayoutParams()>
	//   45   97:getfield        #62  <Field int android.view.ViewGroup$LayoutParams.height>
	//   46  100:iconst_1        
	//   47  101:iadd            
	//   48  102:invokestatic    #59  <Method int h.b(Context, int)>
	//   49  105:putfield        #33  <Field int Point.y>
		if(banner3d.getLayoutParams() != null && banner3d.getLayoutParams().width > 0 && banner3d.getLayoutParams().height > 0) goto _L2; else goto _L1
	//   50  108:aload_3         
	//   51  109:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams Banner3D.getLayoutParams()>
	//   52  112:ifnull          135
	//   53  115:aload_3         
	//   54  116:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams Banner3D.getLayoutParams()>
	//   55  119:getfield        #53  <Field int android.view.ViewGroup$LayoutParams.width>
	//   56  122:ifle            135
	//   57  125:aload_3         
	//   58  126:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams Banner3D.getLayoutParams()>
	//   59  129:getfield        #62  <Field int android.view.ViewGroup$LayoutParams.height>
	//   60  132:ifgt            282
_L1:
		if(!(context instanceof Activity)) goto _L4; else goto _L3
	//   61  135:aload_0         
	//   62  136:instanceof      #64  <Class Activity>
	//   63  139:ifeq            393
_L3:
		g.a("Banner3DSize", 3, "Context is Activity");
	//   64  142:ldc1            #35  <String "Banner3DSize">
	//   65  144:iconst_3        
	//   66  145:ldc1            #66  <String "Context is Activity">
	//   67  147:invokestatic    #42  <Method void g.a(String, int, String)>
		banneroptions = ((BannerOptions) (((Activity)context).getWindow().getDecorView()));
	//   68  150:aload_0         
	//   69  151:checkcast       #64  <Class Activity>
	//   70  154:invokevirtual   #70  <Method Window Activity.getWindow()>
	//   71  157:invokevirtual   #76  <Method View Window.getDecorView()>
	//   72  160:astore_2        
		viewparent = ((ViewParent) ((View)viewparent));
	//   73  161:aload_1         
	//   74  162:checkcast       #78  <Class View>
	//   75  165:astore_1        
		if(viewparent instanceof Banner)
	//*  76  166:aload_1         
	//*  77  167:instanceof      #80  <Class Banner>
	//*  78  170:ifeq            450
		{
			g.a("Banner3DSize", 3, "Parent is instance of Wrapper Banner");
	//   79  173:ldc1            #35  <String "Banner3DSize">
	//   80  175:iconst_3        
	//   81  176:ldc1            #82  <String "Parent is instance of Wrapper Banner">
	//   82  178:invokestatic    #42  <Method void g.a(String, int, String)>
			viewparent = ((ViewParent) ((View)(View)((View) (viewparent)).getParent()));
	//   83  181:aload_1         
	//   84  182:invokevirtual   #86  <Method ViewParent View.getParent()>
	//   85  185:checkcast       #78  <Class View>
	//   86  188:checkcast       #78  <Class View>
	//   87  191:astore_1        
		}
		  goto _L5
	//*  88  192:goto            450
_L9:
		if(viewparent == null)
			break MISSING_BLOCK_LABEL_271;
	//   89  195:aload_1         
	//   90  196:ifnull          271
		if(((View) (viewparent)).getMeasuredWidth() > 0 && ((View) (viewparent)).getMeasuredHeight() > 0)
			break MISSING_BLOCK_LABEL_271;
	//   91  199:aload_1         
	//   92  200:invokevirtual   #89  <Method int View.getMeasuredWidth()>
	//   93  203:ifle            213
	//   94  206:aload_1         
	//   95  207:invokevirtual   #92  <Method int View.getMeasuredHeight()>
	//   96  210:ifgt            271
		if(((View) (viewparent)).getMeasuredWidth() <= 0 || flag1)
			break MISSING_BLOCK_LABEL_235;
	//   97  213:aload_1         
	//   98  214:invokevirtual   #89  <Method int View.getMeasuredWidth()>
	//   99  217:ifle            447
	//  100  220:iload           5
	//  101  222:ifne            447
		b(context, point, ((View) (viewparent)));
	//  102  225:aload_0         
	//  103  226:aload           6
	//  104  228:aload_1         
	//  105  229:invokestatic    #95  <Method void b(Context, Point, View)>
		flag1 = true;
	//  106  232:iconst_1        
	//  107  233:istore          5
		boolean flag;
		if(((View) (viewparent)).getMeasuredHeight() <= 0 || flag)
			break MISSING_BLOCK_LABEL_257;
	//  108  235:aload_1         
	//  109  236:invokevirtual   #92  <Method int View.getMeasuredHeight()>
	//  110  239:ifle            444
	//  111  242:iload           4
	//  112  244:ifne            444
		a(context, point, ((View) (viewparent)));
	//  113  247:aload_0         
	//  114  248:aload           6
	//  115  250:aload_1         
	//  116  251:invokestatic    #97  <Method void a(Context, Point, View)>
		flag = true;
	//  117  254:iconst_1        
	//  118  255:istore          4
		viewparent = ((ViewParent) ((View)(View)((View) (viewparent)).getParent()));
	//  119  257:aload_1         
	//  120  258:invokevirtual   #86  <Method ViewParent View.getParent()>
	//  121  261:checkcast       #78  <Class View>
	//  122  264:checkcast       #78  <Class View>
	//  123  267:astore_1        
		continue; /* Loop/switch isn't completed */
	//  124  268:goto            195
		if(viewparent != null) goto _L7; else goto _L6
	//  125  271:aload_1         
	//  126  272:ifnonnull       347
_L6:
		try
		{
			c(context, point, ((View) (banneroptions)));
	//  127  275:aload_0         
	//  128  276:aload           6
	//  129  278:aload_2         
	//  130  279:invokestatic    #100 <Method void c(Context, Point, View)>
		}
	//* 131  282:ldc1            #35  <String "Banner3DSize">
	//* 132  284:iconst_3        
	//* 133  285:new             #102 <Class StringBuilder>
	//* 134  288:dup             
	//* 135  289:invokespecial   #103 <Method void StringBuilder()>
	//* 136  292:ldc1            #105 <String "============ exit Application Size [">
	//* 137  294:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//* 138  297:aload           6
	//* 139  299:getfield        #27  <Field int Point.x>
	//* 140  302:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//* 141  305:ldc1            #114 <String ",">
	//* 142  307:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//* 143  310:aload           6
	//* 144  312:getfield        #33  <Field int Point.y>
	//* 145  315:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//* 146  318:ldc1            #116 <String "] =========">
	//* 147  320:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//* 148  323:invokevirtual   #120 <Method String StringBuilder.toString()>
	//* 149  326:invokestatic    #42  <Method void g.a(String, int, String)>
	//* 150  329:new             #122 <Class d>
	//* 151  332:dup             
	//* 152  333:aload           6
	//* 153  335:getfield        #27  <Field int Point.x>
	//* 154  338:aload           6
	//* 155  340:getfield        #33  <Field int Point.y>
	//* 156  343:invokespecial   #125 <Method void d(int, int)>
	//* 157  346:areturn         
	//* 158  347:iload           5
	//* 159  349:ifne            359
	//* 160  352:aload_0         
	//* 161  353:aload           6
	//* 162  355:aload_1         
	//* 163  356:invokestatic    #95  <Method void b(Context, Point, View)>
	//* 164  359:iload           4
	//* 165  361:ifne            282
	//* 166  364:aload_0         
	//* 167  365:aload           6
	//* 168  367:aload_1         
	//* 169  368:invokestatic    #97  <Method void a(Context, Point, View)>
	//* 170  371:goto            282
		// Misplaced declaration of an exception variable
		catch(ViewParent viewparent)
	//* 171  374:astore_1        
		{
			c(context, point, ((View) (banneroptions)));
	//  172  375:aload_0         
	//  173  376:aload           6
	//  174  378:aload_2         
	//  175  379:invokestatic    #100 <Method void c(Context, Point, View)>
			g.a("Banner3DSize", 3, "Exception occoured");
	//  176  382:ldc1            #35  <String "Banner3DSize">
	//  177  384:iconst_3        
	//  178  385:ldc1            #127 <String "Exception occoured">
	//  179  387:invokestatic    #42  <Method void g.a(String, int, String)>
		}
_L2:
		g.a("Banner3DSize", 3, (new StringBuilder()).append("============ exit Application Size [").append(point.x).append(",").append(point.y).append("] =========").toString());
		return new d(point.x, point.y);
_L7:
		if(flag1)
			break MISSING_BLOCK_LABEL_359;
		b(context, point, ((View) (viewparent)));
		if(flag)
			continue; /* Loop/switch isn't completed */
		a(context, point, ((View) (viewparent)));
		continue; /* Loop/switch isn't completed */
	//* 180  390:goto            282
_L4:
		g.a("Banner3DSize", 3, "Context not Activity, get max win size");
	//  181  393:ldc1            #35  <String "Banner3DSize">
	//  182  395:iconst_3        
	//  183  396:ldc1            #129 <String "Context not Activity, get max win size">
	//  184  398:invokestatic    #42  <Method void g.a(String, int, String)>
		viewparent = ((ViewParent) ((WindowManager)context.getSystemService("window")));
	//  185  401:aload_0         
	//  186  402:ldc1            #131 <String "window">
	//  187  404:invokevirtual   #137 <Method Object Context.getSystemService(String)>
	//  188  407:checkcast       #139 <Class WindowManager>
	//  189  410:astore_1        
		if(viewparent != null)
	//* 190  411:aload_1         
	//* 191  412:ifnull          282
			try
			{
				h.a(context, ((WindowManager) (viewparent)), point);
	//  192  415:aload_0         
	//  193  416:aload_1         
	//  194  417:aload           6
	//  195  419:invokestatic    #142 <Method void h.a(Context, WindowManager, Point)>
			}
	//* 196  422:goto            282
			// Misplaced declaration of an exception variable
			catch(ViewParent viewparent)
	//* 197  425:astore_1        
			{
				f.a(context, com.startapp.android.publish.adsCommon.e.d.b, "Banner3DSize.getApplicationSize - system service failed", ((Exception) (viewparent)).getMessage(), "");
	//  198  426:aload_0         
	//  199  427:getstatic       #147 <Field com.startapp.android.publish.adsCommon.e.d com.startapp.android.publish.adsCommon.e.d.b>
	//  200  430:ldc1            #149 <String "Banner3DSize.getApplicationSize - system service failed">
	//  201  432:aload_1         
	//  202  433:invokevirtual   #152 <Method String Exception.getMessage()>
	//  203  436:ldc1            #154 <String "">
	//  204  438:invokestatic    #159 <Method void f.a(Context, com.startapp.android.publish.adsCommon.e.d, String, String, String)>
			}
		if(true) goto _L2; else goto _L5
	//  205  441:goto            282
	//* 206  444:goto            257
	//* 207  447:goto            235
_L5:
		flag = false;
	//  208  450:iconst_0        
	//  209  451:istore          4
		if(true) goto _L9; else goto _L8
	//  210  453:goto            195
_L8:
	}

	private static void a(Context context, Point point, View view)
	{
		point.y = h.b(context, view.getMeasuredHeight() - view.getPaddingBottom() - view.getPaddingTop());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #92  <Method int View.getMeasuredHeight()>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #163 <Method int View.getPaddingBottom()>
	//    6   10:isub            
	//    7   11:aload_2         
	//    8   12:invokevirtual   #166 <Method int View.getPaddingTop()>
	//    9   15:isub            
	//   10   16:invokestatic    #59  <Method int h.b(Context, int)>
	//   11   19:putfield        #33  <Field int Point.y>
	//   12   22:return          
	}

	public static boolean a(Context context, ViewParent viewparent, BannerOptions banneroptions, Banner3D banner3d, d d1)
	{
		g.a("Banner3DSize", 3, "============== Optimize Size ==========");
	//    0    0:ldc1            #35  <String "Banner3DSize">
	//    1    2:iconst_3        
	//    2    3:ldc1            #169 <String "============== Optimize Size ==========">
	//    3    5:invokestatic    #42  <Method void g.a(String, int, String)>
		context = ((Context) (a(context, viewparent, banneroptions, banner3d)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #171 <Method d a(Context, ViewParent, BannerOptions, Banner3D)>
	//    9   15:astore_0        
		d1.a(((d) (context)).a(), ((d) (context)).b());
	//   10   16:aload           4
	//   11   18:aload_0         
	//   12   19:invokevirtual   #173 <Method int d.a()>
	//   13   22:aload_0         
	//   14   23:invokevirtual   #175 <Method int d.b()>
	//   15   26:invokevirtual   #177 <Method void d.a(int, int)>
		viewparent = ((ViewParent) (Size.values()));
	//   16   29:invokestatic    #181 <Method Banner3DSize$Size[] Banner3DSize$Size.values()>
	//   17   32:astore_1        
		int j = viewparent.length;
	//   18   33:aload_1         
	//   19   34:arraylength     
	//   20   35:istore          6
		int i = 0;
	//   21   37:iconst_0        
	//   22   38:istore          5
		boolean flag;
		boolean flag1;
		for(flag = false; i < j; flag = flag1)
	//*  23   40:iconst_0        
	//*  24   41:istore          7
	//*  25   43:iload           5
	//*  26   45:iload           6
	//*  27   47:icmpge          176
		{
			banner3d = ((Banner3D) (viewparent[i]));
	//   28   50:aload_1         
	//   29   51:iload           5
	//   30   53:aaload          
	//   31   54:astore_3        
			flag1 = flag;
	//   32   55:iload           7
	//   33   57:istore          8
			if(((Size) (banner3d)).getSize().a() <= ((d) (context)).a())
	//*  34   59:aload_3         
	//*  35   60:invokevirtual   #185 <Method d Banner3DSize$Size.getSize()>
	//*  36   63:invokevirtual   #173 <Method int d.a()>
	//*  37   66:aload_0         
	//*  38   67:invokevirtual   #173 <Method int d.a()>
	//*  39   70:icmpgt          163
			{
				flag1 = flag;
	//   40   73:iload           7
	//   41   75:istore          8
				if(((Size) (banner3d)).getSize().b() <= ((d) (context)).b())
	//*  42   77:aload_3         
	//*  43   78:invokevirtual   #185 <Method d Banner3DSize$Size.getSize()>
	//*  44   81:invokevirtual   #175 <Method int d.b()>
	//*  45   84:aload_0         
	//*  46   85:invokevirtual   #175 <Method int d.b()>
	//*  47   88:icmpgt          163
				{
					g.a("Banner3DSize", 3, (new StringBuilder()).append("BannerSize [").append(((Size) (banner3d)).getSize().a()).append(",").append(((Size) (banner3d)).getSize().b()).append("]").toString());
	//   48   91:ldc1            #35  <String "Banner3DSize">
	//   49   93:iconst_3        
	//   50   94:new             #102 <Class StringBuilder>
	//   51   97:dup             
	//   52   98:invokespecial   #103 <Method void StringBuilder()>
	//   53  101:ldc1            #187 <String "BannerSize [">
	//   54  103:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   55  106:aload_3         
	//   56  107:invokevirtual   #185 <Method d Banner3DSize$Size.getSize()>
	//   57  110:invokevirtual   #173 <Method int d.a()>
	//   58  113:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   59  116:ldc1            #114 <String ",">
	//   60  118:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   61  121:aload_3         
	//   62  122:invokevirtual   #185 <Method d Banner3DSize$Size.getSize()>
	//   63  125:invokevirtual   #175 <Method int d.b()>
	//   64  128:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   65  131:ldc1            #189 <String "]">
	//   66  133:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   67  136:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   68  139:invokestatic    #42  <Method void g.a(String, int, String)>
					banneroptions.a(((Size) (banner3d)).getSize().a(), ((Size) (banner3d)).getSize().b());
	//   69  142:aload_2         
	//   70  143:aload_3         
	//   71  144:invokevirtual   #185 <Method d Banner3DSize$Size.getSize()>
	//   72  147:invokevirtual   #173 <Method int d.a()>
	//   73  150:aload_3         
	//   74  151:invokevirtual   #185 <Method d Banner3DSize$Size.getSize()>
	//   75  154:invokevirtual   #175 <Method int d.b()>
	//   76  157:invokevirtual   #190 <Method void BannerOptions.a(int, int)>
					flag1 = true;
	//   77  160:iconst_1        
	//   78  161:istore          8
				}
			}
			i++;
	//   79  163:iload           5
	//   80  165:iconst_1        
	//   81  166:iadd            
	//   82  167:istore          5
		}

	//   83  169:iload           8
	//   84  171:istore          7
	//*  85  173:goto            43
		if(!flag)
	//*  86  176:iload           7
	//*  87  178:ifne            187
			banneroptions.a(0, 0);
	//   88  181:aload_2         
	//   89  182:iconst_0        
	//   90  183:iconst_0        
	//   91  184:invokevirtual   #190 <Method void BannerOptions.a(int, int)>
		g.a("Banner3DSize", 3, (new StringBuilder()).append("============== Optimize Size [").append(flag).append("] ==========").toString());
	//   92  187:ldc1            #35  <String "Banner3DSize">
	//   93  189:iconst_3        
	//   94  190:new             #102 <Class StringBuilder>
	//   95  193:dup             
	//   96  194:invokespecial   #103 <Method void StringBuilder()>
	//   97  197:ldc1            #192 <String "============== Optimize Size [">
	//   98  199:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   99  202:iload           7
	//  100  204:invokevirtual   #195 <Method StringBuilder StringBuilder.append(boolean)>
	//  101  207:ldc1            #197 <String "] ==========">
	//  102  209:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  103  212:invokevirtual   #120 <Method String StringBuilder.toString()>
	//  104  215:invokestatic    #42  <Method void g.a(String, int, String)>
		return flag;
	//  105  218:iload           7
	//  106  220:ireturn         
	}

	private static void b(Context context, Point point, View view)
	{
		point.x = h.b(context, view.getMeasuredWidth() - view.getPaddingLeft() - view.getPaddingRight());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #89  <Method int View.getMeasuredWidth()>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #200 <Method int View.getPaddingLeft()>
	//    6   10:isub            
	//    7   11:aload_2         
	//    8   12:invokevirtual   #203 <Method int View.getPaddingRight()>
	//    9   15:isub            
	//   10   16:invokestatic    #59  <Method int h.b(Context, int)>
	//   11   19:putfield        #27  <Field int Point.x>
	//   12   22:return          
	}

	private static void c(Context context, Point point, View view)
	{
		point.x = h.b(context, view.getMeasuredWidth());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #89  <Method int View.getMeasuredWidth()>
	//    4    6:invokestatic    #59  <Method int h.b(Context, int)>
	//    5    9:putfield        #27  <Field int Point.x>
		point.y = h.b(context, view.getMeasuredHeight());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #92  <Method int View.getMeasuredHeight()>
	//   10   18:invokestatic    #59  <Method int h.b(Context, int)>
	//   11   21:putfield        #33  <Field int Point.y>
	//   12   24:return          
	}
}
