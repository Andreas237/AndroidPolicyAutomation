// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.b.b;
import android.support.b.c;
import android.support.b.d;
import android.support.v4.g.p;
import android.support.v4.g.s;
import android.support.v4.g.u;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.ac;
import android.support.v4.view.bb;
import android.support.v4.view.l;
import android.support.v4.view.w;
import android.support.v4.view.x;
import android.support.v4.view.y;
import android.support.v4.widget.ap;
import android.support.v4.widget.k;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.design.widget:
//			ap, al, aj, am, 
//			ah, ai, ak, an

public class CoordinatorLayout extends ViewGroup
	implements w
{

	public CoordinatorLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, b.coordinatorLayoutStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #101 <Field int b.coordinatorLayoutStyle>
	//    4    6:invokespecial   #104 <Method void CoordinatorLayout(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public CoordinatorLayout(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #105 <Method void ViewGroup(Context, AttributeSet, int)>
		g = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #107 <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #108 <Method void ArrayList()>
	//    9   15:putfield        #110 <Field List g>
		h = new k();
	//   10   18:aload_0         
	//   11   19:new             #112 <Class k>
	//   12   22:dup             
	//   13   23:invokespecial   #113 <Method void k()>
	//   14   26:putfield        #115 <Field k h>
		i = ((List) (new ArrayList()));
	//   15   29:aload_0         
	//   16   30:new             #107 <Class ArrayList>
	//   17   33:dup             
	//   18   34:invokespecial   #108 <Method void ArrayList()>
	//   19   37:putfield        #117 <Field List i>
		j = ((List) (new ArrayList()));
	//   20   40:aload_0         
	//   21   41:new             #107 <Class ArrayList>
	//   22   44:dup             
	//   23   45:invokespecial   #108 <Method void ArrayList()>
	//   24   48:putfield        #119 <Field List j>
		k = new int[2];
	//   25   51:aload_0         
	//   26   52:iconst_2        
	//   27   53:newarray        int[]
	//   28   55:putfield        #121 <Field int[] k>
		x = new x(((ViewGroup) (this)));
	//   29   58:aload_0         
	//   30   59:new             #123 <Class x>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:invokespecial   #126 <Method void x(ViewGroup)>
	//   34   67:putfield        #128 <Field x x>
		boolean flag = false;
	//   35   70:iconst_0        
	//   36   71:istore          5
		if(i1 == 0)
	//*  37   73:iload_3         
	//*  38   74:ifne            93
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, d.CoordinatorLayout, 0, c.Widget_Support_CoordinatorLayout)));
	//   39   77:aload_1         
	//   40   78:aload_2         
	//   41   79:getstatic       #133 <Field int[] d.CoordinatorLayout>
	//   42   82:iconst_0        
	//   43   83:getstatic       #138 <Field int c.Widget_Support_CoordinatorLayout>
	//   44   86:invokevirtual   #142 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   45   89:astore_2        
		else
	//*  46   90:goto            104
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, d.CoordinatorLayout, i1, 0)));
	//   47   93:aload_1         
	//   48   94:aload_2         
	//   49   95:getstatic       #133 <Field int[] d.CoordinatorLayout>
	//   50   98:iload_3         
	//   51   99:iconst_0        
	//   52  100:invokevirtual   #142 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   53  103:astore_2        
		i1 = ((TypedArray) (attributeset)).getResourceId(d.CoordinatorLayout_keylines, 0);
	//   54  104:aload_2         
	//   55  105:getstatic       #145 <Field int d.CoordinatorLayout_keylines>
	//   56  108:iconst_0        
	//   57  109:invokevirtual   #151 <Method int TypedArray.getResourceId(int, int)>
	//   58  112:istore_3        
		if(i1 != 0)
	//*  59  113:iload_3         
	//*  60  114:ifeq            179
		{
			context = ((Context) (context.getResources()));
	//   61  117:aload_1         
	//   62  118:invokevirtual   #155 <Method Resources Context.getResources()>
	//   63  121:astore_1        
			o = ((Resources) (context)).getIntArray(i1);
	//   64  122:aload_0         
	//   65  123:aload_1         
	//   66  124:iload_3         
	//   67  125:invokevirtual   #161 <Method int[] Resources.getIntArray(int)>
	//   68  128:putfield        #163 <Field int[] o>
			float f1 = ((Resources) (context)).getDisplayMetrics().density;
	//   69  131:aload_1         
	//   70  132:invokevirtual   #167 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   71  135:getfield        #173 <Field float DisplayMetrics.density>
	//   72  138:fstore          4
			int j1 = o.length;
	//   73  140:aload_0         
	//   74  141:getfield        #163 <Field int[] o>
	//   75  144:arraylength     
	//   76  145:istore          6
			for(i1 = ((int) (flag)); i1 < j1; i1++)
	//*  77  147:iload           5
	//*  78  149:istore_3        
	//*  79  150:iload_3         
	//*  80  151:iload           6
	//*  81  153:icmpge          179
			{
				context = ((Context) (o));
	//   82  156:aload_0         
	//   83  157:getfield        #163 <Field int[] o>
	//   84  160:astore_1        
				context[i1] = (int)((float)context[i1] * f1);
	//   85  161:aload_1         
	//   86  162:iload_3         
	//   87  163:aload_1         
	//   88  164:iload_3         
	//   89  165:iaload          
	//   90  166:i2f             
	//   91  167:fload           4
	//   92  169:fmul            
	//   93  170:f2i             
	//   94  171:iastore         
			}

	//   95  172:iload_3         
	//   96  173:iconst_1        
	//   97  174:iadd            
	//   98  175:istore_3        
		}
	//*  99  176:goto            150
		v = ((TypedArray) (attributeset)).getDrawable(d.CoordinatorLayout_statusBarBackground);
	//  100  179:aload_0         
	//  101  180:aload_2         
	//  102  181:getstatic       #176 <Field int d.CoordinatorLayout_statusBarBackground>
	//  103  184:invokevirtual   #180 <Method Drawable TypedArray.getDrawable(int)>
	//  104  187:putfield        #182 <Field Drawable v>
		((TypedArray) (attributeset)).recycle();
	//  105  190:aload_2         
	//  106  191:invokevirtual   #185 <Method void TypedArray.recycle()>
		g();
	//  107  194:aload_0         
	//  108  195:invokespecial   #187 <Method void g()>
		super.setOnHierarchyChangeListener(((android.view.ViewGroup.OnHierarchyChangeListener) (new al(this))));
	//  109  198:aload_0         
	//  110  199:new             #189 <Class al>
	//  111  202:dup             
	//  112  203:aload_0         
	//  113  204:invokespecial   #192 <Method void al(CoordinatorLayout)>
	//  114  207:invokespecial   #196 <Method void ViewGroup.setOnHierarchyChangeListener(android.view.ViewGroup$OnHierarchyChangeListener)>
	//  115  210:return          
	}

	private static int a(int i1, int j1, int k1)
	{
		if(i1 < j1)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpge          7
			return j1;
	//    3    5:iload_1         
	//    4    6:ireturn         
		if(i1 > k1)
	//*   5    7:iload_0         
	//*   6    8:iload_2         
	//*   7    9:icmple          14
			return k1;
	//    8   12:iload_2         
	//    9   13:ireturn         
		else
			return i1;
	//   10   14:iload_0         
	//   11   15:ireturn         
	}

	static aj a(Context context, AttributeSet attributeset, String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Object obj;
		if(s1.startsWith("."))
	//*   5    9:aload_2         
	//*   6   10:ldc1            #208 <String ".">
	//*   7   12:invokevirtual   #214 <Method boolean String.startsWith(String)>
	//*   8   15:ifeq            49
		{
			obj = ((Object) (new StringBuilder()));
	//    9   18:new             #216 <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #217 <Method void StringBuilder()>
	//   12   25:astore_3        
			((StringBuilder) (obj)).append(context.getPackageName());
	//   13   26:aload_3         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #220 <Method String Context.getPackageName()>
	//   16   31:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			((StringBuilder) (obj)).append(s1);
	//   18   35:aload_3         
	//   19   36:aload_2         
	//   20   37:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   22   41:aload_3         
	//   23   42:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   24   45:astore_3        
		} else
	//*  25   46:goto            108
		if(s1.indexOf('.') >= 0)
	//*  26   49:aload_2         
	//*  27   50:bipush          46
	//*  28   52:invokevirtual   #231 <Method int String.indexOf(int)>
	//*  29   55:iflt            63
		{
			obj = ((Object) (s1));
	//   30   58:aload_2         
	//   31   59:astore_3        
		} else
	//*  32   60:goto            108
		{
			obj = ((Object) (s1));
	//   33   63:aload_2         
	//   34   64:astore_3        
			if(!TextUtils.isEmpty(((CharSequence) (a))))
	//*  35   65:getstatic       #63  <Field String a>
	//*  36   68:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   71:ifne            108
			{
				obj = ((Object) (new StringBuilder()));
	//   38   74:new             #216 <Class StringBuilder>
	//   39   77:dup             
	//   40   78:invokespecial   #217 <Method void StringBuilder()>
	//   41   81:astore_3        
				((StringBuilder) (obj)).append(a);
	//   42   82:aload_3         
	//   43   83:getstatic       #63  <Field String a>
	//   44   86:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   45   89:pop             
				((StringBuilder) (obj)).append('.');
	//   46   90:aload_3         
	//   47   91:bipush          46
	//   48   93:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
	//   49   96:pop             
				((StringBuilder) (obj)).append(s1);
	//   50   97:aload_3         
	//   51   98:aload_2         
	//   52   99:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   53  102:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   54  103:aload_3         
	//   55  104:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   56  107:astore_3        
			}
		}
		Object obj1;
		Constructor constructor;
		try
		{
			obj1 = ((Object) ((Map)c.get()));
	//   57  108:getstatic       #87  <Field ThreadLocal c>
	//   58  111:invokevirtual   #238 <Method Object ThreadLocal.get()>
	//   59  114:checkcast       #240 <Class Map>
	//   60  117:astore          4
		}
	//*  61  119:aload           4
	//*  62  121:astore_2        
	//*  63  122:aload           4
	//*  64  124:ifnonnull       142
	//*  65  127:new             #242 <Class HashMap>
	//*  66  130:dup             
	//*  67  131:invokespecial   #243 <Method void HashMap()>
	//*  68  134:astore_2        
	//*  69  135:getstatic       #87  <Field ThreadLocal c>
	//*  70  138:aload_2         
	//*  71  139:invokevirtual   #247 <Method void ThreadLocal.set(Object)>
	//*  72  142:aload_2         
	//*  73  143:aload_3         
	//*  74  144:invokeinterface #250 <Method Object Map.get(Object)>
	//*  75  149:checkcast       #252 <Class Constructor>
	//*  76  152:astore          5
	//*  77  154:aload           5
	//*  78  156:astore          4
	//*  79  158:aload           5
	//*  80  160:ifnonnull       195
	//*  81  163:aload_0         
	//*  82  164:invokevirtual   #256 <Method ClassLoader Context.getClassLoader()>
	//*  83  167:aload_3         
	//*  84  168:invokevirtual   #262 <Method Class ClassLoader.loadClass(String)>
	//*  85  171:getstatic       #82  <Field Class[] b>
	//*  86  174:invokevirtual   #266 <Method Constructor Class.getConstructor(Class[])>
	//*  87  177:astore          4
	//*  88  179:aload           4
	//*  89  181:iconst_1        
	//*  90  182:invokevirtual   #270 <Method void Constructor.setAccessible(boolean)>
	//*  91  185:aload_2         
	//*  92  186:aload_3         
	//*  93  187:aload           4
	//*  94  189:invokeinterface #274 <Method Object Map.put(Object, Object)>
	//*  95  194:pop             
	//*  96  195:aload           4
	//*  97  197:iconst_2        
	//*  98  198:anewarray       Object[]
	//*  99  201:dup             
	//* 100  202:iconst_0        
	//* 101  203:aload_0         
	//* 102  204:aastore         
	//* 103  205:dup             
	//* 104  206:iconst_1        
	//* 105  207:aload_1         
	//* 106  208:aastore         
	//* 107  209:invokevirtual   #280 <Method Object Constructor.newInstance(Object[])>
	//* 108  212:checkcast       #282 <Class aj>
	//* 109  215:astore_0        
	//* 110  216:aload_0         
	//* 111  217:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 112  218:astore_0        
		{
			attributeset = ((AttributeSet) (new StringBuilder()));
	//  113  219:new             #216 <Class StringBuilder>
	//  114  222:dup             
	//  115  223:invokespecial   #217 <Method void StringBuilder()>
	//  116  226:astore_1        
			((StringBuilder) (attributeset)).append("Could not inflate Behavior subclass ");
	//  117  227:aload_1         
	//  118  228:ldc2            #284 <String "Could not inflate Behavior subclass ">
	//  119  231:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  120  234:pop             
			((StringBuilder) (attributeset)).append(((String) (obj)));
	//  121  235:aload_1         
	//  122  236:aload_3         
	//  123  237:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//  124  240:pop             
			throw new RuntimeException(((StringBuilder) (attributeset)).toString(), ((Throwable) (context)));
	//  125  241:new             #286 <Class RuntimeException>
	//  126  244:dup             
	//  127  245:aload_1         
	//  128  246:invokevirtual   #227 <Method String StringBuilder.toString()>
	//  129  249:aload_0         
	//  130  250:invokespecial   #289 <Method void RuntimeException(String, Throwable)>
	//  131  253:athrow          
		}
		s1 = ((String) (obj1));
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_142;
		s1 = ((String) (new HashMap()));
		c.set(((Object) (s1)));
		constructor = (Constructor)((Map) (s1)).get(obj);
		obj1 = ((Object) (constructor));
		if(constructor != null)
			break MISSING_BLOCK_LABEL_195;
		obj1 = ((Object) (context.getClassLoader().loadClass(((String) (obj))).getConstructor(b)));
		((Constructor) (obj1)).setAccessible(true);
		((Map) (s1)).put(obj, obj1);
		context = ((Context) ((aj)((Constructor) (obj1)).newInstance(new Object[] {
			context, attributeset
		})));
		return ((aj) (context));
	}

	private static void a(Rect rect)
	{
		rect.setEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void Rect.setEmpty()>
		f.a(((Object) (rect)));
	//    2    4:getstatic       #94  <Field s f>
	//    3    7:aload_0         
	//    4    8:invokeinterface #300 <Method boolean s.a(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	private void a(am am1, Rect rect, int i1, int j1)
	{
		int l1 = getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #305 <Method int getWidth()>
	//    2    4:istore          6
		int k1 = getHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #308 <Method int getHeight()>
	//    5   10:istore          5
		l1 = Math.max(getPaddingLeft() + am1.leftMargin, Math.min(rect.left, l1 - getPaddingRight() - i1 - am1.rightMargin));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #311 <Method int getPaddingLeft()>
	//    8   16:aload_1         
	//    9   17:getfield        #316 <Field int am.leftMargin>
	//   10   20:iadd            
	//   11   21:aload_2         
	//   12   22:getfield        #319 <Field int Rect.left>
	//   13   25:iload           6
	//   14   27:aload_0         
	//   15   28:invokevirtual   #322 <Method int getPaddingRight()>
	//   16   31:isub            
	//   17   32:iload_3         
	//   18   33:isub            
	//   19   34:aload_1         
	//   20   35:getfield        #325 <Field int am.rightMargin>
	//   21   38:isub            
	//   22   39:invokestatic    #330 <Method int Math.min(int, int)>
	//   23   42:invokestatic    #333 <Method int Math.max(int, int)>
	//   24   45:istore          6
		k1 = Math.max(getPaddingTop() + am1.topMargin, Math.min(rect.top, k1 - getPaddingBottom() - j1 - am1.bottomMargin));
	//   25   47:aload_0         
	//   26   48:invokevirtual   #336 <Method int getPaddingTop()>
	//   27   51:aload_1         
	//   28   52:getfield        #339 <Field int am.topMargin>
	//   29   55:iadd            
	//   30   56:aload_2         
	//   31   57:getfield        #342 <Field int Rect.top>
	//   32   60:iload           5
	//   33   62:aload_0         
	//   34   63:invokevirtual   #345 <Method int getPaddingBottom()>
	//   35   66:isub            
	//   36   67:iload           4
	//   37   69:isub            
	//   38   70:aload_1         
	//   39   71:getfield        #348 <Field int am.bottomMargin>
	//   40   74:isub            
	//   41   75:invokestatic    #330 <Method int Math.min(int, int)>
	//   42   78:invokestatic    #333 <Method int Math.max(int, int)>
	//   43   81:istore          5
		rect.set(l1, k1, i1 + l1, j1 + k1);
	//   44   83:aload_2         
	//   45   84:iload           6
	//   46   86:iload           5
	//   47   88:iload_3         
	//   48   89:iload           6
	//   49   91:iadd            
	//   50   92:iload           4
	//   51   94:iload           5
	//   52   96:iadd            
	//   53   97:invokevirtual   #351 <Method void Rect.set(int, int, int, int)>
	//   54  100:return          
	}

	private void a(View view, int i1, Rect rect, Rect rect1, am am1, int j1, int k1)
	{
		int l1 = android.support.v4.view.l.a(e(am1.c), i1);
	//    0    0:aload           5
	//    1    2:getfield        #354 <Field int android.support.design.widget.am.c>
	//    2    5:invokestatic    #356 <Method int e(int)>
	//    3    8:iload_2         
	//    4    9:invokestatic    #360 <Method int l.a(int, int)>
	//    5   12:istore          8
		i1 = android.support.v4.view.l.a(c(am1.d), i1);
	//    6   14:aload           5
	//    7   16:getfield        #362 <Field int android.support.design.widget.am.d>
	//    8   19:invokestatic    #364 <Method int c(int)>
	//    9   22:iload_2         
	//   10   23:invokestatic    #360 <Method int l.a(int, int)>
	//   11   26:istore_2        
		int k2 = l1 & 7;
	//   12   27:iload           8
	//   13   29:bipush          7
	//   14   31:iand            
	//   15   32:istore          11
		int j2 = l1 & 0x70;
	//   16   34:iload           8
	//   17   36:bipush          112
	//   18   38:iand            
	//   19   39:istore          10
		int i2 = i1 & 7;
	//   20   41:iload_2         
	//   21   42:bipush          7
	//   22   44:iand            
	//   23   45:istore          9
		l1 = i1 & 0x70;
	//   24   47:iload_2         
	//   25   48:bipush          112
	//   26   50:iand            
	//   27   51:istore          8
		if(i2 != 1)
	//*  28   53:iload           9
	//*  29   55:iconst_1        
	//*  30   56:icmpeq          81
		{
			if(i2 != 5)
	//*  31   59:iload           9
	//*  32   61:iconst_5        
	//*  33   62:icmpeq          73
				i1 = rect.left;
	//   34   65:aload_3         
	//   35   66:getfield        #319 <Field int Rect.left>
	//   36   69:istore_2        
			else
	//*  37   70:goto            93
				i1 = rect.right;
	//   38   73:aload_3         
	//   39   74:getfield        #367 <Field int Rect.right>
	//   40   77:istore_2        
		} else
	//*  41   78:goto            93
		{
			i1 = rect.left + rect.width() / 2;
	//   42   81:aload_3         
	//   43   82:getfield        #319 <Field int Rect.left>
	//   44   85:aload_3         
	//   45   86:invokevirtual   #370 <Method int Rect.width()>
	//   46   89:iconst_2        
	//   47   90:idiv            
	//   48   91:iadd            
	//   49   92:istore_2        
		}
		if(l1 != 16)
	//*  50   93:iload           8
	//*  51   95:bipush          16
	//*  52   97:icmpeq          125
		{
			if(l1 != 80)
	//*  53  100:iload           8
	//*  54  102:bipush          80
	//*  55  104:icmpeq          116
				l1 = rect.top;
	//   56  107:aload_3         
	//   57  108:getfield        #342 <Field int Rect.top>
	//   58  111:istore          8
			else
	//*  59  113:goto            138
				l1 = rect.bottom;
	//   60  116:aload_3         
	//   61  117:getfield        #373 <Field int Rect.bottom>
	//   62  120:istore          8
		} else
	//*  63  122:goto            138
		{
			l1 = rect.top + rect.height() / 2;
	//   64  125:aload_3         
	//   65  126:getfield        #342 <Field int Rect.top>
	//   66  129:aload_3         
	//   67  130:invokevirtual   #376 <Method int Rect.height()>
	//   68  133:iconst_2        
	//   69  134:idiv            
	//   70  135:iadd            
	//   71  136:istore          8
		}
		if(k2 != 1)
	//*  72  138:iload           11
	//*  73  140:iconst_1        
	//*  74  141:icmpeq          162
		{
			i2 = i1;
	//   75  144:iload_2         
	//   76  145:istore          9
			if(k2 != 5)
	//*  77  147:iload           11
	//*  78  149:iconst_5        
	//*  79  150:icmpeq          170
				i2 = i1 - j1;
	//   80  153:iload_2         
	//   81  154:iload           6
	//   82  156:isub            
	//   83  157:istore          9
		} else
	//*  84  159:goto            170
		{
			i2 = i1 - j1 / 2;
	//   85  162:iload_2         
	//   86  163:iload           6
	//   87  165:iconst_2        
	//   88  166:idiv            
	//   89  167:isub            
	//   90  168:istore          9
		}
		if(j2 != 16)
	//*  91  170:iload           10
	//*  92  172:bipush          16
	//*  93  174:icmpeq          196
		{
			i1 = l1;
	//   94  177:iload           8
	//   95  179:istore_2        
			if(j2 != 80)
	//*  96  180:iload           10
	//*  97  182:bipush          80
	//*  98  184:icmpeq          204
				i1 = l1 - k1;
	//   99  187:iload           8
	//  100  189:iload           7
	//  101  191:isub            
	//  102  192:istore_2        
		} else
	//* 103  193:goto            204
		{
			i1 = l1 - k1 / 2;
	//  104  196:iload           8
	//  105  198:iload           7
	//  106  200:iconst_2        
	//  107  201:idiv            
	//  108  202:isub            
	//  109  203:istore_2        
		}
		rect1.set(i2, i1, j1 + i2, k1 + i1);
	//  110  204:aload           4
	//  111  206:iload           9
	//  112  208:iload_2         
	//  113  209:iload           6
	//  114  211:iload           9
	//  115  213:iadd            
	//  116  214:iload           7
	//  117  216:iload_2         
	//  118  217:iadd            
	//  119  218:invokevirtual   #351 <Method void Rect.set(int, int, int, int)>
	//  120  221:return          
	}

	private void a(View view, Rect rect, int i1)
	{
label0:
		{
			int l1;
			Rect rect1;
			am am1;
label1:
			{
				if(!ac.x(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #382 <Method boolean ac.x(View)>
	//*   2    4:ifne            8
					return;
	//    3    7:return          
				if(view.getWidth() <= 0)
					break label0;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #385 <Method int View.getWidth()>
	//    6   12:ifle            453
				if(view.getHeight() <= 0)
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #386 <Method int View.getHeight()>
	//*   9   19:ifgt            23
					return;
	//   10   22:return          
				am1 = (am)view.getLayoutParams();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   27:checkcast       #313 <Class am>
	//   14   30:astore          9
				aj aj1 = am1.b();
	//   15   32:aload           9
	//   16   34:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   17   37:astore          10
				rect1 = e();
	//   18   39:invokestatic    #396 <Method Rect e()>
	//   19   42:astore          7
				Rect rect2 = e();
	//   20   44:invokestatic    #396 <Method Rect e()>
	//   21   47:astore          8
				rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   22   49:aload           8
	//   23   51:aload_1         
	//   24   52:invokevirtual   #399 <Method int View.getLeft()>
	//   25   55:aload_1         
	//   26   56:invokevirtual   #402 <Method int View.getTop()>
	//   27   59:aload_1         
	//   28   60:invokevirtual   #405 <Method int View.getRight()>
	//   29   63:aload_1         
	//   30   64:invokevirtual   #408 <Method int View.getBottom()>
	//   31   67:invokevirtual   #351 <Method void Rect.set(int, int, int, int)>
				if(aj1 != null && aj1.a(this, view, rect1))
	//*  32   70:aload           10
	//*  33   72:ifnull          156
	//*  34   75:aload           10
	//*  35   77:aload_0         
	//*  36   78:aload_1         
	//*  37   79:aload           7
	//*  38   81:invokevirtual   #411 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, Rect)>
	//*  39   84:ifeq            156
				{
					if(!rect2.contains(rect1))
	//*  40   87:aload           8
	//*  41   89:aload           7
	//*  42   91:invokevirtual   #415 <Method boolean Rect.contains(Rect)>
	//*  43   94:ifeq            100
	//*  44   97:goto            163
					{
						view = ((View) (new StringBuilder()));
	//   45  100:new             #216 <Class StringBuilder>
	//   46  103:dup             
	//   47  104:invokespecial   #217 <Method void StringBuilder()>
	//   48  107:astore_1        
						((StringBuilder) (view)).append("Rect should be within the child's bounds. Rect:");
	//   49  108:aload_1         
	//   50  109:ldc2            #417 <String "Rect should be within the child's bounds. Rect:">
	//   51  112:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   52  115:pop             
						((StringBuilder) (view)).append(rect1.toShortString());
	//   53  116:aload_1         
	//   54  117:aload           7
	//   55  119:invokevirtual   #420 <Method String Rect.toShortString()>
	//   56  122:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   57  125:pop             
						((StringBuilder) (view)).append(" | Bounds:");
	//   58  126:aload_1         
	//   59  127:ldc2            #422 <String " | Bounds:">
	//   60  130:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   61  133:pop             
						((StringBuilder) (view)).append(rect2.toShortString());
	//   62  134:aload_1         
	//   63  135:aload           8
	//   64  137:invokevirtual   #420 <Method String Rect.toShortString()>
	//   65  140:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   66  143:pop             
						throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   67  144:new             #424 <Class IllegalArgumentException>
	//   68  147:dup             
	//   69  148:aload_1         
	//   70  149:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   71  152:invokespecial   #427 <Method void IllegalArgumentException(String)>
	//   72  155:athrow          
					}
				} else
				{
					rect1.set(rect2);
	//   73  156:aload           7
	//   74  158:aload           8
	//   75  160:invokevirtual   #429 <Method void Rect.set(Rect)>
				}
				a(rect2);
	//   76  163:aload           8
	//   77  165:invokestatic    #431 <Method void a(Rect)>
				if(rect1.isEmpty())
	//*  78  168:aload           7
	//*  79  170:invokevirtual   #434 <Method boolean Rect.isEmpty()>
	//*  80  173:ifeq            182
				{
					a(rect1);
	//   81  176:aload           7
	//   82  178:invokestatic    #431 <Method void a(Rect)>
					return;
	//   83  181:return          
				}
				l1 = android.support.v4.view.l.a(am1.h, i1);
	//   84  182:aload           9
	//   85  184:getfield        #436 <Field int am.h>
	//   86  187:iload_3         
	//   87  188:invokestatic    #360 <Method int l.a(int, int)>
	//   88  191:istore          5
				if((l1 & 0x30) == 48)
	//*  89  193:iload           5
	//*  90  195:bipush          48
	//*  91  197:iand            
	//*  92  198:bipush          48
	//*  93  200:icmpne          245
				{
					i1 = rect1.top - am1.topMargin - am1.j;
	//   94  203:aload           7
	//   95  205:getfield        #342 <Field int Rect.top>
	//   96  208:aload           9
	//   97  210:getfield        #339 <Field int am.topMargin>
	//   98  213:isub            
	//   99  214:aload           9
	//  100  216:getfield        #438 <Field int am.j>
	//  101  219:isub            
	//  102  220:istore_3        
					if(i1 < rect.top)
	//* 103  221:iload_3         
	//* 104  222:aload_2         
	//* 105  223:getfield        #342 <Field int Rect.top>
	//* 106  226:icmpge          245
					{
						f(view, rect.top - i1);
	//  107  229:aload_0         
	//  108  230:aload_1         
	//  109  231:aload_2         
	//  110  232:getfield        #342 <Field int Rect.top>
	//  111  235:iload_3         
	//  112  236:isub            
	//  113  237:invokespecial   #441 <Method void f(View, int)>
						i1 = 1;
	//  114  240:iconst_1        
	//  115  241:istore_3        
						break label1;
	//  116  242:goto            247
					}
				}
				i1 = 0;
	//  117  245:iconst_0        
	//  118  246:istore_3        
			}
label2:
			{
				int j1 = i1;
	//  119  247:iload_3         
	//  120  248:istore          4
				if((l1 & 0x50) == 80)
	//* 121  250:iload           5
	//* 122  252:bipush          80
	//* 123  254:iand            
	//* 124  255:bipush          80
	//* 125  257:icmpne          311
				{
					int j2 = (getHeight() - rect1.bottom - am1.bottomMargin) + am1.j;
	//  126  260:aload_0         
	//  127  261:invokevirtual   #308 <Method int getHeight()>
	//  128  264:aload           7
	//  129  266:getfield        #373 <Field int Rect.bottom>
	//  130  269:isub            
	//  131  270:aload           9
	//  132  272:getfield        #348 <Field int am.bottomMargin>
	//  133  275:isub            
	//  134  276:aload           9
	//  135  278:getfield        #438 <Field int am.j>
	//  136  281:iadd            
	//  137  282:istore          6
					j1 = i1;
	//  138  284:iload_3         
	//  139  285:istore          4
					if(j2 < rect.bottom)
	//* 140  287:iload           6
	//* 141  289:aload_2         
	//* 142  290:getfield        #373 <Field int Rect.bottom>
	//* 143  293:icmpge          311
					{
						f(view, j2 - rect.bottom);
	//  144  296:aload_0         
	//  145  297:aload_1         
	//  146  298:iload           6
	//  147  300:aload_2         
	//  148  301:getfield        #373 <Field int Rect.bottom>
	//  149  304:isub            
	//  150  305:invokespecial   #441 <Method void f(View, int)>
						j1 = 1;
	//  151  308:iconst_1        
	//  152  309:istore          4
					}
				}
				if(j1 == 0)
	//* 153  311:iload           4
	//* 154  313:ifne            322
					f(view, 0);
	//  155  316:aload_0         
	//  156  317:aload_1         
	//  157  318:iconst_0        
	//  158  319:invokespecial   #441 <Method void f(View, int)>
				if((l1 & 3) == 3)
	//* 159  322:iload           5
	//* 160  324:iconst_3        
	//* 161  325:iand            
	//* 162  326:iconst_3        
	//* 163  327:icmpne          372
				{
					i1 = rect1.left - am1.leftMargin - am1.i;
	//  164  330:aload           7
	//  165  332:getfield        #319 <Field int Rect.left>
	//  166  335:aload           9
	//  167  337:getfield        #316 <Field int am.leftMargin>
	//  168  340:isub            
	//  169  341:aload           9
	//  170  343:getfield        #443 <Field int am.i>
	//  171  346:isub            
	//  172  347:istore_3        
					if(i1 < rect.left)
	//* 173  348:iload_3         
	//* 174  349:aload_2         
	//* 175  350:getfield        #319 <Field int Rect.left>
	//* 176  353:icmpge          372
					{
						e(view, rect.left - i1);
	//  177  356:aload_0         
	//  178  357:aload_1         
	//  179  358:aload_2         
	//  180  359:getfield        #319 <Field int Rect.left>
	//  181  362:iload_3         
	//  182  363:isub            
	//  183  364:invokespecial   #445 <Method void e(View, int)>
						i1 = 1;
	//  184  367:iconst_1        
	//  185  368:istore_3        
						break label2;
	//  186  369:goto            374
					}
				}
				i1 = 0;
	//  187  372:iconst_0        
	//  188  373:istore_3        
			}
			int k1 = i1;
	//  189  374:iload_3         
	//  190  375:istore          4
			if((l1 & 5) == 5)
	//* 191  377:iload           5
	//* 192  379:iconst_5        
	//* 193  380:iand            
	//* 194  381:iconst_5        
	//* 195  382:icmpne          436
			{
				int i2 = (getWidth() - rect1.right - am1.rightMargin) + am1.i;
	//  196  385:aload_0         
	//  197  386:invokevirtual   #305 <Method int getWidth()>
	//  198  389:aload           7
	//  199  391:getfield        #367 <Field int Rect.right>
	//  200  394:isub            
	//  201  395:aload           9
	//  202  397:getfield        #325 <Field int am.rightMargin>
	//  203  400:isub            
	//  204  401:aload           9
	//  205  403:getfield        #443 <Field int am.i>
	//  206  406:iadd            
	//  207  407:istore          5
				k1 = i1;
	//  208  409:iload_3         
	//  209  410:istore          4
				if(i2 < rect.right)
	//* 210  412:iload           5
	//* 211  414:aload_2         
	//* 212  415:getfield        #367 <Field int Rect.right>
	//* 213  418:icmpge          436
				{
					e(view, i2 - rect.right);
	//  214  421:aload_0         
	//  215  422:aload_1         
	//  216  423:iload           5
	//  217  425:aload_2         
	//  218  426:getfield        #367 <Field int Rect.right>
	//  219  429:isub            
	//  220  430:invokespecial   #445 <Method void e(View, int)>
					k1 = 1;
	//  221  433:iconst_1        
	//  222  434:istore          4
				}
			}
			if(k1 == 0)
	//* 223  436:iload           4
	//* 224  438:ifne            447
				e(view, 0);
	//  225  441:aload_0         
	//  226  442:aload_1         
	//  227  443:iconst_0        
	//  228  444:invokespecial   #445 <Method void e(View, int)>
			a(rect1);
	//  229  447:aload           7
	//  230  449:invokestatic    #431 <Method void a(Rect)>
			return;
	//  231  452:return          
		}
	//  232  453:return          
	}

	private void a(View view, View view1, int i1)
	{
		Rect rect;
		Rect rect1;
		rect = e();
	//    0    0:invokestatic    #396 <Method Rect e()>
	//    1    3:astore          4
		rect1 = e();
	//    2    5:invokestatic    #396 <Method Rect e()>
	//    3    8:astore          5
		a(view1, rect);
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:aload           4
	//    7   14:invokevirtual   #449 <Method void a(View, Rect)>
		a(view, i1, rect, rect1);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:iload_3         
	//   11   20:aload           4
	//   12   22:aload           5
	//   13   24:invokevirtual   #452 <Method void a(View, int, Rect, Rect)>
		view.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
	//   14   27:aload_1         
	//   15   28:aload           5
	//   16   30:getfield        #319 <Field int Rect.left>
	//   17   33:aload           5
	//   18   35:getfield        #342 <Field int Rect.top>
	//   19   38:aload           5
	//   20   40:getfield        #367 <Field int Rect.right>
	//   21   43:aload           5
	//   22   45:getfield        #373 <Field int Rect.bottom>
	//   23   48:invokevirtual   #455 <Method void View.layout(int, int, int, int)>
		a(rect);
	//   24   51:aload           4
	//   25   53:invokestatic    #431 <Method void a(Rect)>
		a(rect1);
	//   26   56:aload           5
	//   27   58:invokestatic    #431 <Method void a(Rect)>
		return;
	//   28   61:return          
		view;
	//   29   62:astore_1        
		a(rect);
	//   30   63:aload           4
	//   31   65:invokestatic    #431 <Method void a(Rect)>
		a(rect1);
	//   32   68:aload           5
	//   33   70:invokestatic    #431 <Method void a(Rect)>
		throw view;
	//   34   73:aload_1         
	//   35   74:athrow          
	}

	private void a(List list)
	{
		list.clear();
	//    0    0:aload_1         
	//    1    1:invokeinterface #461 <Method void List.clear()>
		boolean flag = isChildrenDrawingOrderEnabled();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #464 <Method boolean isChildrenDrawingOrderEnabled()>
	//    4   10:istore          5
		int k1 = getChildCount();
	//    5   12:aload_0         
	//    6   13:invokevirtual   #467 <Method int getChildCount()>
	//    7   16:istore          4
		for(int i1 = k1 - 1; i1 >= 0; i1--)
	//*   8   18:iload           4
	//*   9   20:iconst_1        
	//*  10   21:isub            
	//*  11   22:istore_2        
	//*  12   23:iload_2         
	//*  13   24:iflt            64
		{
			int j1;
			if(flag)
	//*  14   27:iload           5
	//*  15   29:ifeq            43
				j1 = getChildDrawingOrder(k1, i1);
	//   16   32:aload_0         
	//   17   33:iload           4
	//   18   35:iload_2         
	//   19   36:invokevirtual   #470 <Method int getChildDrawingOrder(int, int)>
	//   20   39:istore_3        
			else
	//*  21   40:goto            45
				j1 = i1;
	//   22   43:iload_2         
	//   23   44:istore_3        
			list.add(((Object) (getChildAt(j1))));
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:invokevirtual   #474 <Method View getChildAt(int)>
	//   28   51:invokeinterface #477 <Method boolean List.add(Object)>
	//   29   56:pop             
		}

	//   30   57:iload_2         
	//   31   58:iconst_1        
	//   32   59:isub            
	//   33   60:istore_2        
	//*  34   61:goto            23
		Comparator comparator = d;
	//   35   64:getstatic       #76  <Field Comparator d>
	//   36   67:astore          6
		if(comparator != null)
	//*  37   69:aload           6
	//*  38   71:ifnull          80
			Collections.sort(list, comparator);
	//   39   74:aload_1         
	//   40   75:aload           6
	//   41   77:invokestatic    #483 <Method void Collections.sort(List, Comparator)>
	//   42   80:return          
	}

	private void a(boolean flag)
	{
		int k1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method int getChildCount()>
	//    2    4:istore_3        
		for(int i1 = 0; i1 < k1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          96
		{
			View view = getChildAt(i1);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #474 <Method View getChildAt(int)>
	//   11   17:astore          6
			aj aj1 = ((am)view.getLayoutParams()).b();
	//   12   19:aload           6
	//   13   21:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   14   24:checkcast       #313 <Class am>
	//   15   27:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   16   30:astore          7
			if(aj1 == null)
				continue;
	//   17   32:aload           7
	//   18   34:ifnull          89
			long l1 = SystemClock.uptimeMillis();
	//   19   37:invokestatic    #489 <Method long SystemClock.uptimeMillis()>
	//   20   40:lstore          4
			MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
	//   21   42:lload           4
	//   22   44:lload           4
	//   23   46:iconst_3        
	//   24   47:fconst_0        
	//   25   48:fconst_0        
	//   26   49:iconst_0        
	//   27   50:invokestatic    #495 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   28   53:astore          8
			if(flag)
	//*  29   55:iload_1         
	//*  30   56:ifeq            73
				aj1.b(this, view, motionevent);
	//   31   59:aload           7
	//   32   61:aload_0         
	//   33   62:aload           6
	//   34   64:aload           8
	//   35   66:invokevirtual   #498 <Method boolean android.support.design.widget.aj.b(CoordinatorLayout, View, MotionEvent)>
	//   36   69:pop             
			else
	//*  37   70:goto            84
				aj1.a(this, view, motionevent);
	//   38   73:aload           7
	//   39   75:aload_0         
	//   40   76:aload           6
	//   41   78:aload           8
	//   42   80:invokevirtual   #500 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, MotionEvent)>
	//   43   83:pop             
			motionevent.recycle();
	//   44   84:aload           8
	//   45   86:invokevirtual   #501 <Method void MotionEvent.recycle()>
		}

	//   46   89:iload_2         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_2        
	//*  50   93:goto            7
		for(int j1 = 0; j1 < k1; j1++)
	//*  51   96:iconst_0        
	//*  52   97:istore_2        
	//*  53   98:iload_2         
	//*  54   99:iload_3         
	//*  55  100:icmpge          124
			((am)getChildAt(j1).getLayoutParams()).f();
	//   56  103:aload_0         
	//   57  104:iload_2         
	//   58  105:invokevirtual   #474 <Method View getChildAt(int)>
	//   59  108:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   60  111:checkcast       #313 <Class am>
	//   61  114:invokevirtual   #503 <Method void am.f()>

	//   62  117:iload_2         
	//   63  118:iconst_1        
	//   64  119:iadd            
	//   65  120:istore_2        
	//*  66  121:goto            98
		p = null;
	//   67  124:aload_0         
	//   68  125:aconst_null     
	//   69  126:putfield        #505 <Field View p>
		m = false;
	//   70  129:aload_0         
	//   71  130:iconst_0        
	//   72  131:putfield        #507 <Field boolean m>
	//   73  134:return          
	}

	private boolean a(MotionEvent motionevent, int i1)
	{
		int k1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #511 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          6
		List list = i;
	//    3    6:aload_0         
	//    4    7:getfield        #117 <Field List i>
	//    5   10:astore          15
		a(list);
	//    6   12:aload_0         
	//    7   13:aload           15
	//    8   15:invokespecial   #513 <Method void a(List)>
		int l1 = list.size();
	//    9   18:aload           15
	//   10   20:invokeinterface #516 <Method int List.size()>
	//   11   25:istore          7
		Object obj = null;
	//   12   27:aconst_null     
	//   13   28:astore          13
		int j1 = 0;
	//   14   30:iconst_0        
	//   15   31:istore          4
		boolean flag2 = false;
	//   16   33:iconst_0        
	//   17   34:istore          8
		boolean flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_3        
		boolean flag3;
		do
		{
			flag3 = flag2;
	//   20   38:iload           8
	//   21   40:istore          9
			if(j1 >= l1)
				break;
	//   22   42:iload           4
	//   23   44:iload           7
	//   24   46:icmpge          387
			View view = (View)list.get(j1);
	//   25   49:aload           15
	//   26   51:iload           4
	//   27   53:invokeinterface #519 <Method Object List.get(int)>
	//   28   58:checkcast       #384 <Class View>
	//   29   61:astore          16
			Object obj1 = ((Object) ((am)view.getLayoutParams()));
	//   30   63:aload           16
	//   31   65:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   32   68:checkcast       #313 <Class am>
	//   33   71:astore          14
			aj aj1 = ((am) (obj1)).b();
	//   34   73:aload           14
	//   35   75:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   36   78:astore          17
			boolean flag1;
			boolean flag4;
			if((flag2 || flag) && k1 != 0)
	//*  37   80:iload           8
	//*  38   82:ifne            89
	//*  39   85:iload_3         
	//*  40   86:ifeq            212
	//*  41   89:iload           6
	//*  42   91:ifeq            212
			{
				flag4 = flag2;
	//   43   94:iload           8
	//   44   96:istore          10
				flag1 = flag;
	//   45   98:iload_3         
	//   46   99:istore          5
				obj1 = obj;
	//   47  101:aload           13
	//   48  103:astore          14
				if(aj1 != null)
	//*  49  105:aload           17
	//*  50  107:ifnull          367
				{
					obj1 = obj;
	//   51  110:aload           13
	//   52  112:astore          14
					if(obj == null)
	//*  53  114:aload           13
	//*  54  116:ifnonnull       137
					{
						long l2 = SystemClock.uptimeMillis();
	//   55  119:invokestatic    #489 <Method long SystemClock.uptimeMillis()>
	//   56  122:lstore          11
						obj1 = ((Object) (MotionEvent.obtain(l2, l2, 3, 0.0F, 0.0F, 0)));
	//   57  124:lload           11
	//   58  126:lload           11
	//   59  128:iconst_3        
	//   60  129:fconst_0        
	//   61  130:fconst_0        
	//   62  131:iconst_0        
	//   63  132:invokestatic    #495 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   64  135:astore          14
					}
					switch(i1)
	//*  65  137:iload_2         
					{
	//*  66  138:tableswitch     0 1: default 160
	//	               0 191
	//	               1 170
					default:
						flag4 = flag2;
	//   67  160:iload           8
	//   68  162:istore          10
						flag1 = flag;
	//   69  164:iload_3         
	//   70  165:istore          5
						break;

	//*  71  167:goto            367
					case 1: // '\001'
						aj1.a(this, view, ((MotionEvent) (obj1)));
	//   72  170:aload           17
	//   73  172:aload_0         
	//   74  173:aload           16
	//   75  175:aload           14
	//   76  177:invokevirtual   #500 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, MotionEvent)>
	//   77  180:pop             
						flag4 = flag2;
	//   78  181:iload           8
	//   79  183:istore          10
						flag1 = flag;
	//   80  185:iload_3         
	//   81  186:istore          5
						break;

	//*  82  188:goto            367
					case 0: // '\0'
						aj1.b(this, view, ((MotionEvent) (obj1)));
	//   83  191:aload           17
	//   84  193:aload_0         
	//   85  194:aload           16
	//   86  196:aload           14
	//   87  198:invokevirtual   #498 <Method boolean android.support.design.widget.aj.b(CoordinatorLayout, View, MotionEvent)>
	//   88  201:pop             
						flag4 = flag2;
	//   89  202:iload           8
	//   90  204:istore          10
						flag1 = flag;
	//   91  206:iload_3         
	//   92  207:istore          5
						break;
					}
				}
			} else
	//*  93  209:goto            367
			{
				flag3 = flag2;
	//   94  212:iload           8
	//   95  214:istore          9
				if(!flag2)
	//*  96  216:iload           8
	//*  97  218:ifne            299
				{
					flag3 = flag2;
	//   98  221:iload           8
	//   99  223:istore          9
					if(aj1 != null)
	//* 100  225:aload           17
	//* 101  227:ifnull          299
					{
						switch(i1)
	//* 102  230:iload_2         
						{
	//* 103  231:tableswitch     0 1: default 252
	//	               0 269
	//	               1 255
	//* 104  252:goto            280
						case 1: // '\001'
							flag2 = aj1.a(this, view, motionevent);
	//  105  255:aload           17
	//  106  257:aload_0         
	//  107  258:aload           16
	//  108  260:aload_1         
	//  109  261:invokevirtual   #500 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, MotionEvent)>
	//  110  264:istore          8
							break;

	//* 111  266:goto            280
						case 0: // '\0'
							flag2 = aj1.b(this, view, motionevent);
	//  112  269:aload           17
	//  113  271:aload_0         
	//  114  272:aload           16
	//  115  274:aload_1         
	//  116  275:invokevirtual   #498 <Method boolean android.support.design.widget.aj.b(CoordinatorLayout, View, MotionEvent)>
	//  117  278:istore          8
							break;
						}
						flag3 = flag2;
	//  118  280:iload           8
	//  119  282:istore          9
						if(flag2)
	//* 120  284:iload           8
	//* 121  286:ifeq            299
						{
							p = view;
	//  122  289:aload_0         
	//  123  290:aload           16
	//  124  292:putfield        #505 <Field View p>
							flag3 = flag2;
	//  125  295:iload           8
	//  126  297:istore          9
						}
					}
				}
				flag4 = ((am) (obj1)).e();
	//  127  299:aload           14
	//  128  301:invokevirtual   #521 <Method boolean am.e()>
	//  129  304:istore          10
				flag2 = ((am) (obj1)).a(this, view);
	//  130  306:aload           14
	//  131  308:aload_0         
	//  132  309:aload           16
	//  133  311:invokevirtual   #524 <Method boolean android.support.design.widget.am.a(CoordinatorLayout, View)>
	//  134  314:istore          8
				if(flag2 && !flag4)
	//* 135  316:iload           8
	//* 136  318:ifeq            331
	//* 137  321:iload           10
	//* 138  323:ifne            331
					flag = true;
	//  139  326:iconst_1        
	//  140  327:istore_3        
				else
	//* 141  328:goto            333
					flag = false;
	//  142  331:iconst_0        
	//  143  332:istore_3        
				flag4 = flag3;
	//  144  333:iload           9
	//  145  335:istore          10
				flag1 = flag;
	//  146  337:iload_3         
	//  147  338:istore          5
				obj1 = obj;
	//  148  340:aload           13
	//  149  342:astore          14
				if(flag2)
	//* 150  344:iload           8
	//* 151  346:ifeq            367
				{
					flag4 = flag3;
	//  152  349:iload           9
	//  153  351:istore          10
					flag1 = flag;
	//  154  353:iload_3         
	//  155  354:istore          5
					obj1 = obj;
	//  156  356:aload           13
	//  157  358:astore          14
					if(!flag)
	//* 158  360:iload_3         
	//* 159  361:ifne            367
						break;
	//  160  364:goto            387
				}
			}
			j1++;
	//  161  367:iload           4
	//  162  369:iconst_1        
	//  163  370:iadd            
	//  164  371:istore          4
			flag2 = flag4;
	//  165  373:iload           10
	//  166  375:istore          8
			flag = flag1;
	//  167  377:iload           5
	//  168  379:istore_3        
			obj = obj1;
	//  169  380:aload           14
	//  170  382:astore          13
		} while(true);
	//  171  384:goto            38
		list.clear();
	//  172  387:aload           15
	//  173  389:invokeinterface #461 <Method void List.clear()>
		return flag3;
	//  174  394:iload           9
	//  175  396:ireturn         
	}

	private int b(int i1)
	{
		Object obj = ((Object) (o));
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field int[] o>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       58
		{
			obj = ((Object) (new StringBuilder()));
	//    5    9:new             #216 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #217 <Method void StringBuilder()>
	//    8   16:astore_2        
			((StringBuilder) (obj)).append("No keylines defined for ");
	//    9   17:aload_2         
	//   10   18:ldc2            #526 <String "No keylines defined for ">
	//   11   21:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			((StringBuilder) (obj)).append(((Object) (this)));
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #529 <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
			((StringBuilder) (obj)).append(" - attempted index lookup ");
	//   17   31:aload_2         
	//   18   32:ldc2            #531 <String " - attempted index lookup ">
	//   19   35:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			((StringBuilder) (obj)).append(i1);
	//   21   39:aload_2         
	//   22   40:iload_1         
	//   23   41:invokevirtual   #534 <Method StringBuilder StringBuilder.append(int)>
	//   24   44:pop             
			Log.e("CoordinatorLayout", ((StringBuilder) (obj)).toString());
	//   25   45:ldc2            #535 <String "CoordinatorLayout">
	//   26   48:aload_2         
	//   27   49:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #540 <Method int Log.e(String, String)>
	//   29   55:pop             
			return 0;
	//   30   56:iconst_0        
	//   31   57:ireturn         
		}
		if(i1 >= 0 && i1 < obj.length)
	//*  32   58:iload_1         
	//*  33   59:iflt            75
	//*  34   62:iload_1         
	//*  35   63:aload_2         
	//*  36   64:arraylength     
	//*  37   65:icmplt          71
	//*  38   68:goto            75
		{
			return obj[i1];
	//   39   71:aload_2         
	//   40   72:iload_1         
	//   41   73:iaload          
	//   42   74:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   43   75:new             #216 <Class StringBuilder>
	//   44   78:dup             
	//   45   79:invokespecial   #217 <Method void StringBuilder()>
	//   46   82:astore_2        
			stringbuilder.append("Keyline index ");
	//   47   83:aload_2         
	//   48   84:ldc2            #542 <String "Keyline index ">
	//   49   87:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   50   90:pop             
			stringbuilder.append(i1);
	//   51   91:aload_2         
	//   52   92:iload_1         
	//   53   93:invokevirtual   #534 <Method StringBuilder StringBuilder.append(int)>
	//   54   96:pop             
			stringbuilder.append(" out of range for ");
	//   55   97:aload_2         
	//   56   98:ldc2            #544 <String " out of range for ">
	//   57  101:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   58  104:pop             
			stringbuilder.append(((Object) (this)));
	//   59  105:aload_2         
	//   60  106:aload_0         
	//   61  107:invokevirtual   #529 <Method StringBuilder StringBuilder.append(Object)>
	//   62  110:pop             
			Log.e("CoordinatorLayout", stringbuilder.toString());
	//   63  111:ldc2            #535 <String "CoordinatorLayout">
	//   64  114:aload_2         
	//   65  115:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   66  118:invokestatic    #540 <Method int Log.e(String, String)>
	//   67  121:pop             
			return 0;
	//   68  122:iconst_0        
	//   69  123:ireturn         
		}
	}

	private bb b(bb bb1)
	{
		if(bb1.e())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #548 <Method boolean bb.e()>
	//*   2    4:ifeq            9
			return bb1;
	//    3    7:aload_1         
	//    4    8:areturn         
		int i1 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		int j1 = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #467 <Method int getChildCount()>
	//    9   15:istore_3        
		bb bb2;
		for(bb2 = bb1; i1 < j1; bb2 = bb1)
	//*  10   16:aload_1         
	//*  11   17:astore          4
	//*  12   19:iload_2         
	//*  13   20:iload_3         
	//*  14   21:icmpge          99
		{
			View view = getChildAt(i1);
	//   15   24:aload_0         
	//   16   25:iload_2         
	//   17   26:invokevirtual   #474 <Method View getChildAt(int)>
	//   18   29:astore          5
			bb1 = bb2;
	//   19   31:aload           4
	//   20   33:astore_1        
			if(ac.q(view))
	//*  21   34:aload           5
	//*  22   36:invokestatic    #550 <Method boolean ac.q(View)>
	//*  23   39:ifeq            89
			{
				aj aj1 = ((am)view.getLayoutParams()).b();
	//   24   42:aload           5
	//   25   44:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   47:checkcast       #313 <Class am>
	//   27   50:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   28   53:astore          6
				bb1 = bb2;
	//   29   55:aload           4
	//   30   57:astore_1        
				if(aj1 != null)
	//*  31   58:aload           6
	//*  32   60:ifnull          89
				{
					bb2 = aj1.a(this, view, bb2);
	//   33   63:aload           6
	//   34   65:aload_0         
	//   35   66:aload           5
	//   36   68:aload           4
	//   37   70:invokevirtual   #553 <Method bb android.support.design.widget.aj.a(CoordinatorLayout, View, bb)>
	//   38   73:astore          4
					bb1 = bb2;
	//   39   75:aload           4
	//   40   77:astore_1        
					if(bb2.e())
	//*  41   78:aload           4
	//*  42   80:invokevirtual   #548 <Method boolean bb.e()>
	//*  43   83:ifeq            89
						return bb2;
	//   44   86:aload           4
	//   45   88:areturn         
				}
			}
			i1++;
	//   46   89:iload_2         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_2        
		}

	//   50   93:aload_1         
	//   51   94:astore          4
	//*  52   96:goto            19
		return bb2;
	//   53   99:aload           4
	//   54  101:areturn         
	}

	private void b(View view, int i1, int j1)
	{
		am am1 = (am)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:astore          11
		int k1 = android.support.v4.view.l.a(d(am1.c), j1);
	//    4    9:aload           11
	//    5   11:getfield        #354 <Field int android.support.design.widget.am.c>
	//    6   14:invokestatic    #556 <Method int d(int)>
	//    7   17:iload_3         
	//    8   18:invokestatic    #360 <Method int l.a(int, int)>
	//    9   21:istore          4
		int i3 = k1 & 7;
	//   10   23:iload           4
	//   11   25:bipush          7
	//   12   27:iand            
	//   13   28:istore          10
		int l2 = k1 & 0x70;
	//   14   30:iload           4
	//   15   32:bipush          112
	//   16   34:iand            
	//   17   35:istore          9
		int k2 = getWidth();
	//   18   37:aload_0         
	//   19   38:invokevirtual   #305 <Method int getWidth()>
	//   20   41:istore          8
		int j2 = getHeight();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #308 <Method int getHeight()>
	//   23   47:istore          7
		int l1 = view.getMeasuredWidth();
	//   24   49:aload_1         
	//   25   50:invokevirtual   #559 <Method int View.getMeasuredWidth()>
	//   26   53:istore          5
		int i2 = view.getMeasuredHeight();
	//   27   55:aload_1         
	//   28   56:invokevirtual   #562 <Method int View.getMeasuredHeight()>
	//   29   59:istore          6
		k1 = i1;
	//   30   61:iload_2         
	//   31   62:istore          4
		if(j1 == 1)
	//*  32   64:iload_3         
	//*  33   65:iconst_1        
	//*  34   66:icmpne          75
			k1 = k2 - i1;
	//   35   69:iload           8
	//   36   71:iload_2         
	//   37   72:isub            
	//   38   73:istore          4
		i1 = b(k1) - l1;
	//   39   75:aload_0         
	//   40   76:iload           4
	//   41   78:invokespecial   #564 <Method int b(int)>
	//   42   81:iload           5
	//   43   83:isub            
	//   44   84:istore_2        
		j1 = 0;
	//   45   85:iconst_0        
	//   46   86:istore_3        
		if(i3 != 1)
	//*  47   87:iload           10
	//*  48   89:iconst_1        
	//*  49   90:icmpeq          110
		{
			if(i3 == 5)
	//*  50   93:iload           10
	//*  51   95:iconst_5        
	//*  52   96:icmpeq          102
	//*  53   99:goto            117
				i1 += l1;
	//   54  102:iload_2         
	//   55  103:iload           5
	//   56  105:iadd            
	//   57  106:istore_2        
		} else
	//*  58  107:goto            117
		{
			i1 += l1 / 2;
	//   59  110:iload_2         
	//   60  111:iload           5
	//   61  113:iconst_2        
	//   62  114:idiv            
	//   63  115:iadd            
	//   64  116:istore_2        
		}
		if(l2 != 16)
	//*  65  117:iload           9
	//*  66  119:bipush          16
	//*  67  121:icmpeq          142
		{
			if(l2 == 80)
	//*  68  124:iload           9
	//*  69  126:bipush          80
	//*  70  128:icmpeq          134
	//*  71  131:goto            149
				j1 = i2 + 0;
	//   72  134:iload           6
	//   73  136:iconst_0        
	//   74  137:iadd            
	//   75  138:istore_3        
		} else
	//*  76  139:goto            149
		{
			j1 = 0 + i2 / 2;
	//   77  142:iconst_0        
	//   78  143:iload           6
	//   79  145:iconst_2        
	//   80  146:idiv            
	//   81  147:iadd            
	//   82  148:istore_3        
		}
		i1 = Math.max(getPaddingLeft() + am1.leftMargin, Math.min(i1, k2 - getPaddingRight() - l1 - am1.rightMargin));
	//   83  149:aload_0         
	//   84  150:invokevirtual   #311 <Method int getPaddingLeft()>
	//   85  153:aload           11
	//   86  155:getfield        #316 <Field int am.leftMargin>
	//   87  158:iadd            
	//   88  159:iload_2         
	//   89  160:iload           8
	//   90  162:aload_0         
	//   91  163:invokevirtual   #322 <Method int getPaddingRight()>
	//   92  166:isub            
	//   93  167:iload           5
	//   94  169:isub            
	//   95  170:aload           11
	//   96  172:getfield        #325 <Field int am.rightMargin>
	//   97  175:isub            
	//   98  176:invokestatic    #330 <Method int Math.min(int, int)>
	//   99  179:invokestatic    #333 <Method int Math.max(int, int)>
	//  100  182:istore_2        
		j1 = Math.max(getPaddingTop() + am1.topMargin, Math.min(j1, j2 - getPaddingBottom() - i2 - am1.bottomMargin));
	//  101  183:aload_0         
	//  102  184:invokevirtual   #336 <Method int getPaddingTop()>
	//  103  187:aload           11
	//  104  189:getfield        #339 <Field int am.topMargin>
	//  105  192:iadd            
	//  106  193:iload_3         
	//  107  194:iload           7
	//  108  196:aload_0         
	//  109  197:invokevirtual   #345 <Method int getPaddingBottom()>
	//  110  200:isub            
	//  111  201:iload           6
	//  112  203:isub            
	//  113  204:aload           11
	//  114  206:getfield        #348 <Field int am.bottomMargin>
	//  115  209:isub            
	//  116  210:invokestatic    #330 <Method int Math.min(int, int)>
	//  117  213:invokestatic    #333 <Method int Math.max(int, int)>
	//  118  216:istore_3        
		view.layout(i1, j1, l1 + i1, i2 + j1);
	//  119  217:aload_1         
	//  120  218:iload_2         
	//  121  219:iload_3         
	//  122  220:iload           5
	//  123  222:iload_2         
	//  124  223:iadd            
	//  125  224:iload           6
	//  126  226:iload_3         
	//  127  227:iadd            
	//  128  228:invokevirtual   #455 <Method void View.layout(int, int, int, int)>
	//  129  231:return          
	}

	private static int c(int i1)
	{
		int j1 = i1;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if((i1 & 7) == 0)
	//*   2    2:iload_0         
	//*   3    3:bipush          7
	//*   4    5:iand            
	//*   5    6:ifne            15
			j1 = i1 | 0x800003;
	//    6    9:iload_0         
	//    7   10:ldc2            #565 <Int 0x800003>
	//    8   13:ior             
	//    9   14:istore_1        
		i1 = j1;
	//   10   15:iload_1         
	//   11   16:istore_0        
		if((j1 & 0x70) == 0)
	//*  12   17:iload_1         
	//*  13   18:bipush          112
	//*  14   20:iand            
	//*  15   21:ifne            29
			i1 = j1 | 0x30;
	//   16   24:iload_1         
	//   17   25:bipush          48
	//   18   27:ior             
	//   19   28:istore_0        
		return i1;
	//   20   29:iload_0         
	//   21   30:ireturn         
	}

	private static int d(int i1)
	{
		int j1 = i1;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i1 == 0)
	//*   2    2:iload_0         
	//*   3    3:ifne            10
			j1 = 0x800035;
	//    4    6:ldc2            #566 <Int 0x800035>
	//    5    9:istore_1        
		return j1;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	private void d(View view, int i1)
	{
		am am1 = (am)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:astore_3        
		Rect rect = e();
	//    4    8:invokestatic    #396 <Method Rect e()>
	//    5   11:astore          4
		rect.set(getPaddingLeft() + am1.leftMargin, getPaddingTop() + am1.topMargin, getWidth() - getPaddingRight() - am1.rightMargin, getHeight() - getPaddingBottom() - am1.bottomMargin);
	//    6   13:aload           4
	//    7   15:aload_0         
	//    8   16:invokevirtual   #311 <Method int getPaddingLeft()>
	//    9   19:aload_3         
	//   10   20:getfield        #316 <Field int am.leftMargin>
	//   11   23:iadd            
	//   12   24:aload_0         
	//   13   25:invokevirtual   #336 <Method int getPaddingTop()>
	//   14   28:aload_3         
	//   15   29:getfield        #339 <Field int am.topMargin>
	//   16   32:iadd            
	//   17   33:aload_0         
	//   18   34:invokevirtual   #305 <Method int getWidth()>
	//   19   37:aload_0         
	//   20   38:invokevirtual   #322 <Method int getPaddingRight()>
	//   21   41:isub            
	//   22   42:aload_3         
	//   23   43:getfield        #325 <Field int am.rightMargin>
	//   24   46:isub            
	//   25   47:aload_0         
	//   26   48:invokevirtual   #308 <Method int getHeight()>
	//   27   51:aload_0         
	//   28   52:invokevirtual   #345 <Method int getPaddingBottom()>
	//   29   55:isub            
	//   30   56:aload_3         
	//   31   57:getfield        #348 <Field int am.bottomMargin>
	//   32   60:isub            
	//   33   61:invokevirtual   #351 <Method void Rect.set(int, int, int, int)>
		if(t != null && ac.q(((View) (this))) && !ac.q(view))
	//*  34   64:aload_0         
	//*  35   65:getfield        #568 <Field bb t>
	//*  36   68:ifnull          157
	//*  37   71:aload_0         
	//*  38   72:invokestatic    #550 <Method boolean ac.q(View)>
	//*  39   75:ifeq            157
	//*  40   78:aload_1         
	//*  41   79:invokestatic    #550 <Method boolean ac.q(View)>
	//*  42   82:ifne            157
		{
			rect.left = rect.left + t.a();
	//   43   85:aload           4
	//   44   87:aload           4
	//   45   89:getfield        #319 <Field int Rect.left>
	//   46   92:aload_0         
	//   47   93:getfield        #568 <Field bb t>
	//   48   96:invokevirtual   #570 <Method int bb.a()>
	//   49   99:iadd            
	//   50  100:putfield        #319 <Field int Rect.left>
			rect.top = rect.top + t.b();
	//   51  103:aload           4
	//   52  105:aload           4
	//   53  107:getfield        #342 <Field int Rect.top>
	//   54  110:aload_0         
	//   55  111:getfield        #568 <Field bb t>
	//   56  114:invokevirtual   #572 <Method int bb.b()>
	//   57  117:iadd            
	//   58  118:putfield        #342 <Field int Rect.top>
			rect.right = rect.right - t.c();
	//   59  121:aload           4
	//   60  123:aload           4
	//   61  125:getfield        #367 <Field int Rect.right>
	//   62  128:aload_0         
	//   63  129:getfield        #568 <Field bb t>
	//   64  132:invokevirtual   #574 <Method int bb.c()>
	//   65  135:isub            
	//   66  136:putfield        #367 <Field int Rect.right>
			rect.bottom = rect.bottom - t.d();
	//   67  139:aload           4
	//   68  141:aload           4
	//   69  143:getfield        #373 <Field int Rect.bottom>
	//   70  146:aload_0         
	//   71  147:getfield        #568 <Field bb t>
	//   72  150:invokevirtual   #576 <Method int bb.d()>
	//   73  153:isub            
	//   74  154:putfield        #373 <Field int Rect.bottom>
		}
		Rect rect1 = e();
	//   75  157:invokestatic    #396 <Method Rect e()>
	//   76  160:astore          5
		android.support.v4.view.l.a(c(am1.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect1, i1);
	//   77  162:aload_3         
	//   78  163:getfield        #354 <Field int android.support.design.widget.am.c>
	//   79  166:invokestatic    #364 <Method int c(int)>
	//   80  169:aload_1         
	//   81  170:invokevirtual   #559 <Method int View.getMeasuredWidth()>
	//   82  173:aload_1         
	//   83  174:invokevirtual   #562 <Method int View.getMeasuredHeight()>
	//   84  177:aload           4
	//   85  179:aload           5
	//   86  181:iload_2         
	//   87  182:invokestatic    #579 <Method void l.a(int, int, int, Rect, Rect, int)>
		view.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
	//   88  185:aload_1         
	//   89  186:aload           5
	//   90  188:getfield        #319 <Field int Rect.left>
	//   91  191:aload           5
	//   92  193:getfield        #342 <Field int Rect.top>
	//   93  196:aload           5
	//   94  198:getfield        #367 <Field int Rect.right>
	//   95  201:aload           5
	//   96  203:getfield        #373 <Field int Rect.bottom>
	//   97  206:invokevirtual   #455 <Method void View.layout(int, int, int, int)>
		a(rect);
	//   98  209:aload           4
	//   99  211:invokestatic    #431 <Method void a(Rect)>
		a(rect1);
	//  100  214:aload           5
	//  101  216:invokestatic    #431 <Method void a(Rect)>
	//  102  219:return          
	}

	private static int e(int i1)
	{
		int j1 = i1;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i1 == 0)
	//*   2    2:iload_0         
	//*   3    3:ifne            9
			j1 = 17;
	//    4    6:bipush          17
	//    5    8:istore_1        
		return j1;
	//    6    9:iload_1         
	//    7   10:ireturn         
	}

	private static Rect e()
	{
		Rect rect1 = (Rect)f.a();
	//    0    0:getstatic       #94  <Field s f>
	//    1    3:invokeinterface #581 <Method Object s.a()>
	//    2    8:checkcast       #292 <Class Rect>
	//    3   11:astore_1        
		Rect rect = rect1;
	//    4   12:aload_1         
	//    5   13:astore_0        
		if(rect1 == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       26
			rect = new Rect();
	//    8   18:new             #292 <Class Rect>
	//    9   21:dup             
	//   10   22:invokespecial   #582 <Method void Rect()>
	//   11   25:astore_0        
		return rect;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	private void e(View view, int i1)
	{
		am am1 = (am)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:astore_3        
		if(am1.i != i1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #443 <Field int am.i>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			ac.f(view, i1 - am1.i);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #443 <Field int am.i>
	//   12   22:isub            
	//   13   23:invokestatic    #583 <Method void ac.f(View, int)>
			am1.i = i1;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #443 <Field int am.i>
		}
	//   17   31:return          
	}

	private boolean e(View view)
	{
		return h.e(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field k h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #585 <Method boolean k.e(Object)>
	//    4    8:ireturn         
	}

	private void f()
	{
		g.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field List g>
	//    2    4:invokeinterface #461 <Method void List.clear()>
		h.a();
	//    3    9:aload_0         
	//    4   10:getfield        #115 <Field k h>
	//    5   13:invokevirtual   #587 <Method void k.a()>
		int k1 = getChildCount();
	//    6   16:aload_0         
	//    7   17:invokevirtual   #467 <Method int getChildCount()>
	//    8   20:istore_3        
		for(int i1 = 0; i1 < k1; i1++)
	//*   9   21:iconst_0        
	//*  10   22:istore_1        
	//*  11   23:iload_1         
	//*  12   24:iload_3         
	//*  13   25:icmpge          142
		{
			View view = getChildAt(i1);
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:invokevirtual   #474 <Method View getChildAt(int)>
	//   17   33:astore          4
			am am1 = a(view);
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:invokevirtual   #590 <Method am a(View)>
	//   21   41:astore          5
			am1.b(this, view);
	//   22   43:aload           5
	//   23   45:aload_0         
	//   24   46:aload           4
	//   25   48:invokevirtual   #593 <Method View android.support.design.widget.am.b(CoordinatorLayout, View)>
	//   26   51:pop             
			h.a(((Object) (view)));
	//   27   52:aload_0         
	//   28   53:getfield        #115 <Field k h>
	//   29   56:aload           4
	//   30   58:invokevirtual   #595 <Method void k.a(Object)>
			for(int j1 = 0; j1 < k1; j1++)
	//*  31   61:iconst_0        
	//*  32   62:istore_2        
	//*  33   63:iload_2         
	//*  34   64:iload_3         
	//*  35   65:icmpge          135
			{
				if(j1 == i1)
	//*  36   68:iload_2         
	//*  37   69:iload_1         
	//*  38   70:icmpne          76
					continue;
	//   39   73:goto            128
				View view1 = getChildAt(j1);
	//   40   76:aload_0         
	//   41   77:iload_2         
	//   42   78:invokevirtual   #474 <Method View getChildAt(int)>
	//   43   81:astore          6
				if(!am1.a(this, view, view1))
					continue;
	//   44   83:aload           5
	//   45   85:aload_0         
	//   46   86:aload           4
	//   47   88:aload           6
	//   48   90:invokevirtual   #598 <Method boolean android.support.design.widget.am.a(CoordinatorLayout, View, View)>
	//   49   93:ifeq            128
				if(!h.b(((Object) (view1))))
	//*  50   96:aload_0         
	//*  51   97:getfield        #115 <Field k h>
	//*  52  100:aload           6
	//*  53  102:invokevirtual   #600 <Method boolean k.b(Object)>
	//*  54  105:ifne            117
					h.a(((Object) (view1)));
	//   55  108:aload_0         
	//   56  109:getfield        #115 <Field k h>
	//   57  112:aload           6
	//   58  114:invokevirtual   #595 <Method void k.a(Object)>
				h.a(((Object) (view1)), ((Object) (view)));
	//   59  117:aload_0         
	//   60  118:getfield        #115 <Field k h>
	//   61  121:aload           6
	//   62  123:aload           4
	//   63  125:invokevirtual   #603 <Method void k.a(Object, Object)>
			}

	//   64  128:iload_2         
	//   65  129:iconst_1        
	//   66  130:iadd            
	//   67  131:istore_2        
		}

	//   68  132:goto            63
	//   69  135:iload_1         
	//   70  136:iconst_1        
	//   71  137:iadd            
	//   72  138:istore_1        
	//*  73  139:goto            23
		g.addAll(((java.util.Collection) (h.b())));
	//   74  142:aload_0         
	//   75  143:getfield        #110 <Field List g>
	//   76  146:aload_0         
	//   77  147:getfield        #115 <Field k h>
	//   78  150:invokevirtual   #606 <Method ArrayList k.b()>
	//   79  153:invokeinterface #610 <Method boolean List.addAll(java.util.Collection)>
	//   80  158:pop             
		Collections.reverse(g);
	//   81  159:aload_0         
	//   82  160:getfield        #110 <Field List g>
	//   83  163:invokestatic    #613 <Method void Collections.reverse(List)>
	//   84  166:return          
	}

	private void f(View view, int i1)
	{
		am am1 = (am)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:astore_3        
		if(am1.j != i1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #438 <Field int am.j>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			ac.e(view, i1 - am1.j);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #438 <Field int am.j>
	//   12   22:isub            
	//   13   23:invokestatic    #614 <Method void ac.e(View, int)>
			am1.j = i1;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #438 <Field int am.j>
		}
	//   17   31:return          
	}

	private void g()
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		if(ac.q(((View) (this))))
	//*   4    9:aload_0         
	//*   5   10:invokestatic    #550 <Method boolean ac.q(View)>
	//*   6   13:ifeq            51
		{
			if(w == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #616 <Field y w>
	//*   9   20:ifnonnull       35
				w = ((y) (new ah(this)));
	//   10   23:aload_0         
	//   11   24:new             #618 <Class ah>
	//   12   27:dup             
	//   13   28:aload_0         
	//   14   29:invokespecial   #619 <Method void ah(CoordinatorLayout)>
	//   15   32:putfield        #616 <Field y w>
			ac.a(((View) (this)), w);
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getfield        #616 <Field y w>
	//   19   40:invokestatic    #622 <Method void ac.a(View, y)>
			setSystemUiVisibility(1280);
	//   20   43:aload_0         
	//   21   44:sipush          1280
	//   22   47:invokevirtual   #625 <Method void setSystemUiVisibility(int)>
			return;
	//   23   50:return          
		} else
		{
			ac.a(((View) (this)), ((y) (null)));
	//   24   51:aload_0         
	//   25   52:aconst_null     
	//   26   53:invokestatic    #622 <Method void ac.a(View, y)>
			return;
	//   27   56:return          
		}
	}

	public am a(AttributeSet attributeset)
	{
		return new am(getContext(), attributeset);
	//    0    0:new             #313 <Class am>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #630 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #632 <Method void am(Context, AttributeSet)>
	//    6   12:areturn         
	}

	am a(View view)
	{
		am am1 = (am)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:astore          4
		if(!am1.b)
	//*   4    9:aload           4
	//*   5   11:getfield        #634 <Field boolean android.support.design.widget.am.b>
	//*   6   14:ifne            201
		{
			if(view instanceof ai)
	//*   7   17:aload_1         
	//*   8   18:instanceof      #636 <Class ai>
	//*   9   21:ifeq            63
			{
				view = ((View) (((ai)view).getBehavior()));
	//   10   24:aload_1         
	//   11   25:checkcast       #636 <Class ai>
	//   12   28:invokeinterface #639 <Method aj ai.getBehavior()>
	//   13   33:astore_1        
				if(view == null)
	//*  14   34:aload_1         
	//*  15   35:ifnonnull       48
					Log.e("CoordinatorLayout", "Attached behavior class is null");
	//   16   38:ldc2            #535 <String "CoordinatorLayout">
	//   17   41:ldc2            #641 <String "Attached behavior class is null">
	//   18   44:invokestatic    #540 <Method int Log.e(String, String)>
	//   19   47:pop             
				am1.a(((aj) (view)));
	//   20   48:aload           4
	//   21   50:aload_1         
	//   22   51:invokevirtual   #644 <Method void android.support.design.widget.am.a(aj)>
				am1.b = true;
	//   23   54:aload           4
	//   24   56:iconst_1        
	//   25   57:putfield        #634 <Field boolean android.support.design.widget.am.b>
				return am1;
	//   26   60:aload           4
	//   27   62:areturn         
			}
			Class class1 = ((Object) (view)).getClass();
	//   28   63:aload_1         
	//   29   64:invokevirtual   #648 <Method Class Object.getClass()>
	//   30   67:astore_2        
			view = null;
	//   31   68:aconst_null     
	//   32   69:astore_1        
			do
			{
				if(class1 == null)
					break;
	//   33   70:aload_2         
	//   34   71:ifnull          101
				ak ak1 = (ak)class1.getAnnotation(android/support/design/widget/ak);
	//   35   74:aload_2         
	//   36   75:ldc2            #650 <Class ak>
	//   37   78:invokevirtual   #654 <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//   38   81:checkcast       #650 <Class ak>
	//   39   84:astore_3        
				view = ((View) (ak1));
	//   40   85:aload_3         
	//   41   86:astore_1        
				if(ak1 != null)
					break;
	//   42   87:aload_3         
	//   43   88:ifnonnull       101
				class1 = class1.getSuperclass();
	//   44   91:aload_2         
	//   45   92:invokevirtual   #657 <Method Class Class.getSuperclass()>
	//   46   95:astore_2        
				view = ((View) (ak1));
	//   47   96:aload_3         
	//   48   97:astore_1        
			} while(true);
	//   49   98:goto            70
			if(view != null)
	//*  50  101:aload_1         
	//*  51  102:ifnull          195
				try
				{
					am1.a((aj)((ak) (view)).a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
	//   52  105:aload           4
	//   53  107:aload_1         
	//   54  108:invokeinterface #659 <Method Class android.support.design.widget.ak.a()>
	//   55  113:iconst_0        
	//   56  114:anewarray       Class[]
	//   57  117:invokevirtual   #662 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   58  120:iconst_0        
	//   59  121:anewarray       Object[]
	//   60  124:invokevirtual   #280 <Method Object Constructor.newInstance(Object[])>
	//   61  127:checkcast       #282 <Class aj>
	//   62  130:invokevirtual   #644 <Method void android.support.design.widget.am.a(aj)>
				}
	//*  63  133:goto            195
				catch(Exception exception)
	//*  64  136:astore_2        
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   65  137:new             #216 <Class StringBuilder>
	//   66  140:dup             
	//   67  141:invokespecial   #217 <Method void StringBuilder()>
	//   68  144:astore_3        
					stringbuilder.append("Default behavior class ");
	//   69  145:aload_3         
	//   70  146:ldc2            #664 <String "Default behavior class ">
	//   71  149:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   72  152:pop             
					stringbuilder.append(((ak) (view)).a().getName());
	//   73  153:aload_3         
	//   74  154:aload_1         
	//   75  155:invokeinterface #659 <Method Class android.support.design.widget.ak.a()>
	//   76  160:invokevirtual   #665 <Method String Class.getName()>
	//   77  163:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   78  166:pop             
					stringbuilder.append(" could not be instantiated. Did you forget");
	//   79  167:aload_3         
	//   80  168:ldc2            #667 <String " could not be instantiated. Did you forget">
	//   81  171:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   82  174:pop             
					stringbuilder.append(" a default constructor?");
	//   83  175:aload_3         
	//   84  176:ldc2            #669 <String " a default constructor?">
	//   85  179:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   86  182:pop             
					Log.e("CoordinatorLayout", stringbuilder.toString(), ((Throwable) (exception)));
	//   87  183:ldc2            #535 <String "CoordinatorLayout">
	//   88  186:aload_3         
	//   89  187:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   90  190:aload_2         
	//   91  191:invokestatic    #672 <Method int Log.e(String, String, Throwable)>
	//   92  194:pop             
				}
			am1.b = true;
	//   93  195:aload           4
	//   94  197:iconst_1        
	//   95  198:putfield        #634 <Field boolean android.support.design.widget.am.b>
		}
		return am1;
	//   96  201:aload           4
	//   97  203:areturn         
	}

	protected am a(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof am)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #313 <Class am>
	//*   2    4:ifeq            19
			return new am((am)layoutparams);
	//    3    7:new             #313 <Class am>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #313 <Class am>
	//    7   15:invokespecial   #676 <Method void am(am)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #678 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new am((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   12   26:new             #313 <Class am>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #678 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #681 <Method void am(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new am(layoutparams);
	//   18   38:new             #313 <Class am>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #684 <Method void am(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	final bb a(bb bb1)
	{
		bb bb2 = bb1;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!android.support.v4.g.p.a(((Object) (t)), ((Object) (bb1))))
	//*   2    3:aload_0         
	//*   3    4:getfield        #568 <Field bb t>
	//*   4    7:aload_1         
	//*   5    8:invokestatic    #689 <Method boolean p.a(Object, Object)>
	//*   6   11:ifne            81
		{
			t = bb1;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #568 <Field bb t>
			boolean flag1 = true;
	//   10   19:iconst_1        
	//   11   20:istore_3        
			boolean flag;
			if(bb1 != null && bb1.b() > 0)
	//*  12   21:aload_1         
	//*  13   22:ifnull          37
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #572 <Method int bb.b()>
	//*  16   29:ifle            37
				flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_2        
			else
	//*  19   34:goto            39
				flag = false;
	//   20   37:iconst_0        
	//   21   38:istore_2        
			u = flag;
	//   22   39:aload_0         
	//   23   40:iload_2         
	//   24   41:putfield        #691 <Field boolean u>
			if(!u && getBackground() == null)
	//*  25   44:aload_0         
	//*  26   45:getfield        #691 <Field boolean u>
	//*  27   48:ifne            63
	//*  28   51:aload_0         
	//*  29   52:invokevirtual   #695 <Method Drawable getBackground()>
	//*  30   55:ifnonnull       63
				flag = flag1;
	//   31   58:iload_3         
	//   32   59:istore_2        
			else
	//*  33   60:goto            65
				flag = false;
	//   34   63:iconst_0        
	//   35   64:istore_2        
			setWillNotDraw(flag);
	//   36   65:aload_0         
	//   37   66:iload_2         
	//   38   67:invokevirtual   #698 <Method void setWillNotDraw(boolean)>
			bb2 = b(bb1);
	//   39   70:aload_0         
	//   40   71:aload_1         
	//   41   72:invokespecial   #700 <Method bb b(bb)>
	//   42   75:astore          4
			requestLayout();
	//   43   77:aload_0         
	//   44   78:invokevirtual   #703 <Method void requestLayout()>
		}
		return bb2;
	//   45   81:aload           4
	//   46   83:areturn         
	}

	void a()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method int getChildCount()>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		int i1 = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//    7   10:iload           4
	//    8   12:istore_3        
			if(i1 >= j1)
				break;
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:icmpge          42
			if(e(getChildAt(i1)))
	//*  12   18:aload_0         
	//*  13   19:aload_0         
	//*  14   20:iload_1         
	//*  15   21:invokevirtual   #474 <Method View getChildAt(int)>
	//*  16   24:invokespecial   #705 <Method boolean e(View)>
	//*  17   27:ifeq            35
			{
				flag = true;
	//   18   30:iconst_1        
	//   19   31:istore_3        
				break;
	//   20   32:goto            42
			}
			i1++;
	//   21   35:iload_1         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_1        
		} while(true);
	//   25   39:goto            10
		if(flag != s)
	//*  26   42:iload_3         
	//*  27   43:aload_0         
	//*  28   44:getfield        #707 <Field boolean s>
	//*  29   47:icmpeq          63
		{
			if(flag)
	//*  30   50:iload_3         
	//*  31   51:ifeq            59
			{
				b();
	//   32   54:aload_0         
	//   33   55:invokevirtual   #709 <Method void b()>
				return;
	//   34   58:return          
			}
			c();
	//   35   59:aload_0         
	//   36   60:invokevirtual   #711 <Method void c()>
		}
	//   37   63:return          
	}

	final void a(int i1)
	{
		int j2 = ac.f(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #714 <Method int ac.f(View)>
	//    2    4:istore          4
		int k2 = g.size();
	//    3    6:aload_0         
	//    4    7:getfield        #110 <Field List g>
	//    5   10:invokeinterface #516 <Method int List.size()>
	//    6   15:istore          5
		Rect rect = e();
	//    7   17:invokestatic    #396 <Method Rect e()>
	//    8   20:astore          8
		Rect rect1 = e();
	//    9   22:invokestatic    #396 <Method Rect e()>
	//   10   25:astore          9
		Rect rect2 = e();
	//   11   27:invokestatic    #396 <Method Rect e()>
	//   12   30:astore          10
		for(int j1 = 0; j1 < k2; j1++)
	//*  13   32:iconst_0        
	//*  14   33:istore_2        
	//*  15   34:iload_2         
	//*  16   35:iload           5
	//*  17   37:icmpge          493
		{
			View view = (View)g.get(j1);
	//   18   40:aload_0         
	//   19   41:getfield        #110 <Field List g>
	//   20   44:iload_2         
	//   21   45:invokeinterface #519 <Method Object List.get(int)>
	//   22   50:checkcast       #384 <Class View>
	//   23   53:astore          11
			am am1 = (am)view.getLayoutParams();
	//   24   55:aload           11
	//   25   57:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   60:checkcast       #313 <Class am>
	//   27   63:astore          12
			if(i1 == 0 && view.getVisibility() == 8)
	//*  28   65:iload_1         
	//*  29   66:ifne            82
	//*  30   69:aload           11
	//*  31   71:invokevirtual   #717 <Method int View.getVisibility()>
	//*  32   74:bipush          8
	//*  33   76:icmpne          82
				continue;
	//   34   79:goto            486
			for(int k1 = 0; k1 < j1; k1++)
	//*  35   82:iconst_0        
	//*  36   83:istore_3        
	//*  37   84:iload_3         
	//*  38   85:iload_2         
	//*  39   86:icmpge          129
			{
				View view2 = (View)g.get(k1);
	//   40   89:aload_0         
	//   41   90:getfield        #110 <Field List g>
	//   42   93:iload_3         
	//   43   94:invokeinterface #519 <Method Object List.get(int)>
	//   44   99:checkcast       #384 <Class View>
	//   45  102:astore          13
				if(am1.l == view2)
	//*  46  104:aload           12
	//*  47  106:getfield        #719 <Field View android.support.design.widget.am.l>
	//*  48  109:aload           13
	//*  49  111:if_acmpne       122
					b(view, j2);
	//   50  114:aload_0         
	//   51  115:aload           11
	//   52  117:iload           4
	//   53  119:invokevirtual   #721 <Method void b(View, int)>
			}

	//   54  122:iload_3         
	//   55  123:iconst_1        
	//   56  124:iadd            
	//   57  125:istore_3        
	//*  58  126:goto            84
			a(view, true, rect1);
	//   59  129:aload_0         
	//   60  130:aload           11
	//   61  132:iconst_1        
	//   62  133:aload           9
	//   63  135:invokevirtual   #724 <Method void a(View, boolean, Rect)>
			if(am1.g != 0 && !rect1.isEmpty())
	//*  64  138:aload           12
	//*  65  140:getfield        #726 <Field int am.g>
	//*  66  143:ifeq            294
	//*  67  146:aload           9
	//*  68  148:invokevirtual   #434 <Method boolean Rect.isEmpty()>
	//*  69  151:ifne            294
			{
				int l1 = android.support.v4.view.l.a(am1.g, j2);
	//   70  154:aload           12
	//   71  156:getfield        #726 <Field int am.g>
	//   72  159:iload           4
	//   73  161:invokestatic    #360 <Method int l.a(int, int)>
	//   74  164:istore_3        
				int l2 = l1 & 0x70;
	//   75  165:iload_3         
	//   76  166:bipush          112
	//   77  168:iand            
	//   78  169:istore          6
				if(l2 != 48)
	//*  79  171:iload           6
	//*  80  173:bipush          48
	//*  81  175:icmpeq          214
				{
					if(l2 == 80)
	//*  82  178:iload           6
	//*  83  180:bipush          80
	//*  84  182:icmpeq          188
	//*  85  185:goto            232
						rect.bottom = Math.max(rect.bottom, getHeight() - rect1.top);
	//   86  188:aload           8
	//   87  190:aload           8
	//   88  192:getfield        #373 <Field int Rect.bottom>
	//   89  195:aload_0         
	//   90  196:invokevirtual   #308 <Method int getHeight()>
	//   91  199:aload           9
	//   92  201:getfield        #342 <Field int Rect.top>
	//   93  204:isub            
	//   94  205:invokestatic    #333 <Method int Math.max(int, int)>
	//   95  208:putfield        #373 <Field int Rect.bottom>
				} else
	//*  96  211:goto            232
				{
					rect.top = Math.max(rect.top, rect1.bottom);
	//   97  214:aload           8
	//   98  216:aload           8
	//   99  218:getfield        #342 <Field int Rect.top>
	//  100  221:aload           9
	//  101  223:getfield        #373 <Field int Rect.bottom>
	//  102  226:invokestatic    #333 <Method int Math.max(int, int)>
	//  103  229:putfield        #342 <Field int Rect.top>
				}
				l1 &= 7;
	//  104  232:iload_3         
	//  105  233:bipush          7
	//  106  235:iand            
	//  107  236:istore_3        
				if(l1 != 3)
	//* 108  237:iload_3         
	//* 109  238:iconst_3        
	//* 110  239:icmpeq          276
				{
					if(l1 == 5)
	//* 111  242:iload_3         
	//* 112  243:iconst_5        
	//* 113  244:icmpeq          250
	//* 114  247:goto            294
						rect.right = Math.max(rect.right, getWidth() - rect1.left);
	//  115  250:aload           8
	//  116  252:aload           8
	//  117  254:getfield        #367 <Field int Rect.right>
	//  118  257:aload_0         
	//  119  258:invokevirtual   #305 <Method int getWidth()>
	//  120  261:aload           9
	//  121  263:getfield        #319 <Field int Rect.left>
	//  122  266:isub            
	//  123  267:invokestatic    #333 <Method int Math.max(int, int)>
	//  124  270:putfield        #367 <Field int Rect.right>
				} else
	//* 125  273:goto            294
				{
					rect.left = Math.max(rect.left, rect1.right);
	//  126  276:aload           8
	//  127  278:aload           8
	//  128  280:getfield        #319 <Field int Rect.left>
	//  129  283:aload           9
	//  130  285:getfield        #367 <Field int Rect.right>
	//  131  288:invokestatic    #333 <Method int Math.max(int, int)>
	//  132  291:putfield        #319 <Field int Rect.left>
				}
			}
			if(am1.h != 0 && view.getVisibility() == 0)
	//* 133  294:aload           12
	//* 134  296:getfield        #436 <Field int am.h>
	//* 135  299:ifeq            320
	//* 136  302:aload           11
	//* 137  304:invokevirtual   #717 <Method int View.getVisibility()>
	//* 138  307:ifne            320
				a(view, rect, j2);
	//  139  310:aload_0         
	//  140  311:aload           11
	//  141  313:aload           8
	//  142  315:iload           4
	//  143  317:invokespecial   #728 <Method void a(View, Rect, int)>
			if(i1 != 2)
	//* 144  320:iload_1         
	//* 145  321:iconst_2        
	//* 146  322:icmpeq          354
			{
				c(view, rect2);
	//  147  325:aload_0         
	//  148  326:aload           11
	//  149  328:aload           10
	//  150  330:invokevirtual   #730 <Method void c(View, Rect)>
				if(rect2.equals(((Object) (rect1))))
	//* 151  333:aload           10
	//* 152  335:aload           9
	//* 153  337:invokevirtual   #733 <Method boolean Rect.equals(Object)>
	//* 154  340:ifeq            346
					continue;
	//  155  343:goto            486
				b(view, rect1);
	//  156  346:aload_0         
	//  157  347:aload           11
	//  158  349:aload           9
	//  159  351:invokevirtual   #735 <Method void b(View, Rect)>
			}
			for(int i2 = j1 + 1; i2 < k2; i2++)
	//* 160  354:iload_2         
	//* 161  355:iconst_1        
	//* 162  356:iadd            
	//* 163  357:istore_3        
	//* 164  358:iload_3         
	//* 165  359:iload           5
	//* 166  361:icmpge          486
			{
				View view1 = (View)g.get(i2);
	//  167  364:aload_0         
	//  168  365:getfield        #110 <Field List g>
	//  169  368:iload_3         
	//  170  369:invokeinterface #519 <Method Object List.get(int)>
	//  171  374:checkcast       #384 <Class View>
	//  172  377:astore          12
				am am2 = (am)view1.getLayoutParams();
	//  173  379:aload           12
	//  174  381:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  175  384:checkcast       #313 <Class am>
	//  176  387:astore          13
				aj aj1 = am2.b();
	//  177  389:aload           13
	//  178  391:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//  179  394:astore          14
				if(aj1 == null || !aj1.a(this, view1, view))
					continue;
	//  180  396:aload           14
	//  181  398:ifnull          479
	//  182  401:aload           14
	//  183  403:aload_0         
	//  184  404:aload           12
	//  185  406:aload           11
	//  186  408:invokevirtual   #736 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, View)>
	//  187  411:ifeq            479
				if(i1 == 0 && am2.g())
	//* 188  414:iload_1         
	//* 189  415:ifne            434
	//* 190  418:aload           13
	//* 191  420:invokevirtual   #738 <Method boolean am.g()>
	//* 192  423:ifeq            434
				{
					am2.h();
	//  193  426:aload           13
	//  194  428:invokevirtual   #740 <Method void am.h()>
					continue;
	//  195  431:goto            479
				}
				boolean flag;
				if(i1 != 2)
	//* 196  434:iload_1         
	//* 197  435:iconst_2        
	//* 198  436:icmpeq          454
				{
					flag = aj1.b(this, view1, view);
	//  199  439:aload           14
	//  200  441:aload_0         
	//  201  442:aload           12
	//  202  444:aload           11
	//  203  446:invokevirtual   #742 <Method boolean android.support.design.widget.aj.b(CoordinatorLayout, View, View)>
	//  204  449:istore          7
				} else
	//* 205  451:goto            467
				{
					aj1.c(this, view1, view);
	//  206  454:aload           14
	//  207  456:aload_0         
	//  208  457:aload           12
	//  209  459:aload           11
	//  210  461:invokevirtual   #745 <Method void android.support.design.widget.aj.c(CoordinatorLayout, View, View)>
					flag = true;
	//  211  464:iconst_1        
	//  212  465:istore          7
				}
				if(i1 == 1)
	//* 213  467:iload_1         
	//* 214  468:iconst_1        
	//* 215  469:icmpne          479
					am2.a(flag);
	//  216  472:aload           13
	//  217  474:iload           7
	//  218  476:invokevirtual   #747 <Method void android.support.design.widget.am.a(boolean)>
			}

	//  219  479:iload_3         
	//  220  480:iconst_1        
	//  221  481:iadd            
	//  222  482:istore_3        
		}

	//  223  483:goto            358
	//  224  486:iload_2         
	//  225  487:iconst_1        
	//  226  488:iadd            
	//  227  489:istore_2        
	//* 228  490:goto            34
		a(rect);
	//  229  493:aload           8
	//  230  495:invokestatic    #431 <Method void a(Rect)>
		a(rect1);
	//  231  498:aload           9
	//  232  500:invokestatic    #431 <Method void a(Rect)>
		a(rect2);
	//  233  503:aload           10
	//  234  505:invokestatic    #431 <Method void a(Rect)>
	//  235  508:return          
	}

	public void a(View view, int i1)
	{
		am am1 = (am)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:astore_3        
		if(!am1.d())
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #749 <Method boolean android.support.design.widget.am.d()>
	//*   6   12:ifne            58
		{
			if(am1.k != null)
	//*   7   15:aload_3         
	//*   8   16:getfield        #751 <Field View android.support.design.widget.am.k>
	//*   9   19:ifnull          33
			{
				a(view, am1.k, i1);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_3         
	//   13   25:getfield        #751 <Field View android.support.design.widget.am.k>
	//   14   28:iload_2         
	//   15   29:invokespecial   #753 <Method void a(View, View, int)>
				return;
	//   16   32:return          
			}
			if(am1.e >= 0)
	//*  17   33:aload_3         
	//*  18   34:getfield        #755 <Field int am.e>
	//*  19   37:iflt            51
			{
				b(view, am1.e, i1);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_3         
	//   23   43:getfield        #755 <Field int am.e>
	//   24   46:iload_2         
	//   25   47:invokespecial   #757 <Method void b(View, int, int)>
				return;
	//   26   50:return          
			} else
			{
				d(view, i1);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:iload_2         
	//   30   54:invokespecial   #759 <Method void d(View, int)>
				return;
	//   31   57:return          
			}
		} else
		{
			throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
	//   32   58:new             #761 <Class IllegalStateException>
	//   33   61:dup             
	//   34   62:ldc2            #763 <String "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.">
	//   35   65:invokespecial   #764 <Method void IllegalStateException(String)>
	//   36   68:athrow          
		}
	}

	public void a(View view, int i1, int j1, int k1, int l1)
	{
		measureChildWithMargins(view, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokevirtual   #768 <Method void measureChildWithMargins(View, int, int, int, int)>
	//    7   11:return          
	}

	public void a(View view, int i1, int j1, int k1, int l1, int i2)
	{
		int k2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method int getChildCount()>
	//    2    4:istore          9
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          8
		for(int j2 = 0; j2 < k2; j2++)
	//*   5    9:iconst_0        
	//*   6   10:istore          7
	//*   7   12:iload           7
	//*   8   14:iload           9
	//*   9   16:icmpge          104
		{
			View view1 = getChildAt(j2);
	//   10   19:aload_0         
	//   11   20:iload           7
	//   12   22:invokevirtual   #474 <Method View getChildAt(int)>
	//   13   25:astore          10
			if(view1.getVisibility() == 8)
	//*  14   27:aload           10
	//*  15   29:invokevirtual   #717 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          40
				continue;
	//   18   37:goto            95
			Object obj = ((Object) ((am)view1.getLayoutParams()));
	//   19   40:aload           10
	//   20   42:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   45:checkcast       #313 <Class am>
	//   22   48:astore          11
			if(!((am) (obj)).b(i2))
	//*  23   50:aload           11
	//*  24   52:iload           6
	//*  25   54:invokevirtual   #772 <Method boolean android.support.design.widget.am.b(int)>
	//*  26   57:ifne            63
				continue;
	//   27   60:goto            95
			obj = ((Object) (((am) (obj)).b()));
	//   28   63:aload           11
	//   29   65:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   30   68:astore          11
			if(obj != null)
	//*  31   70:aload           11
	//*  32   72:ifnull          95
			{
				((aj) (obj)).a(this, view1, view, i1, j1, k1, l1, i2);
	//   33   75:aload           11
	//   34   77:aload_0         
	//   35   78:aload           10
	//   36   80:aload_1         
	//   37   81:iload_2         
	//   38   82:iload_3         
	//   39   83:iload           4
	//   40   85:iload           5
	//   41   87:iload           6
	//   42   89:invokevirtual   #775 <Method void android.support.design.widget.aj.a(CoordinatorLayout, View, View, int, int, int, int, int)>
				flag = true;
	//   43   92:iconst_1        
	//   44   93:istore          8
			}
		}

	//   45   95:iload           7
	//   46   97:iconst_1        
	//   47   98:iadd            
	//   48   99:istore          7
	//*  49  101:goto            12
		if(flag)
	//*  50  104:iload           8
	//*  51  106:ifeq            114
			a(1);
	//   52  109:aload_0         
	//   53  110:iconst_1        
	//   54  111:invokevirtual   #777 <Method void a(int)>
	//   55  114:return          
	}

	public void a(View view, int i1, int j1, int ai1[], int k1)
	{
		int i3 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method int getChildCount()>
	//    2    4:istore          12
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          11
		int j2 = 0;
	//    5    9:iconst_0        
	//    6   10:istore          8
		int k2 = 0;
	//    7   12:iconst_0        
	//    8   13:istore          9
		int l1;
		int i2;
		for(i2 = 0; j2 < i3; i2 = l1)
	//*   9   15:iconst_0        
	//*  10   16:istore          7
	//*  11   18:iload           8
	//*  12   20:iload           12
	//*  13   22:icmpge          230
		{
			View view1 = getChildAt(j2);
	//   14   25:aload_0         
	//   15   26:iload           8
	//   16   28:invokevirtual   #474 <Method View getChildAt(int)>
	//   17   31:astore          13
			int l2;
			if(view1.getVisibility() == 8)
	//*  18   33:aload           13
	//*  19   35:invokevirtual   #717 <Method int View.getVisibility()>
	//*  20   38:bipush          8
	//*  21   40:icmpne          54
			{
				l2 = k2;
	//   22   43:iload           9
	//   23   45:istore          10
				l1 = i2;
	//   24   47:iload           7
	//   25   49:istore          6
			} else
	//*  26   51:goto            213
			{
				Object obj = ((Object) ((am)view1.getLayoutParams()));
	//   27   54:aload           13
	//   28   56:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   59:checkcast       #313 <Class am>
	//   30   62:astore          14
				if(!((am) (obj)).b(k1))
	//*  31   64:aload           14
	//*  32   66:iload           5
	//*  33   68:invokevirtual   #772 <Method boolean android.support.design.widget.am.b(int)>
	//*  34   71:ifne            85
				{
					l2 = k2;
	//   35   74:iload           9
	//   36   76:istore          10
					l1 = i2;
	//   37   78:iload           7
	//   38   80:istore          6
				} else
	//*  39   82:goto            213
				{
					obj = ((Object) (((am) (obj)).b()));
	//   40   85:aload           14
	//   41   87:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   42   90:astore          14
					l2 = k2;
	//   43   92:iload           9
	//   44   94:istore          10
					l1 = i2;
	//   45   96:iload           7
	//   46   98:istore          6
					if(obj != null)
	//*  47  100:aload           14
	//*  48  102:ifnull          213
					{
						int ai2[] = k;
	//   49  105:aload_0         
	//   50  106:getfield        #121 <Field int[] k>
	//   51  109:astore          15
						ai2[1] = 0;
	//   52  111:aload           15
	//   53  113:iconst_1        
	//   54  114:iconst_0        
	//   55  115:iastore         
						ai2[0] = 0;
	//   56  116:aload           15
	//   57  118:iconst_0        
	//   58  119:iconst_0        
	//   59  120:iastore         
						((aj) (obj)).a(this, view1, view, i1, j1, ai2, k1);
	//   60  121:aload           14
	//   61  123:aload_0         
	//   62  124:aload           13
	//   63  126:aload_1         
	//   64  127:iload_2         
	//   65  128:iload_3         
	//   66  129:aload           15
	//   67  131:iload           5
	//   68  133:invokevirtual   #781 <Method void android.support.design.widget.aj.a(CoordinatorLayout, View, View, int, int, int[], int)>
						if(i1 > 0)
	//*  69  136:iload_2         
	//*  70  137:ifle            156
							l1 = Math.max(k2, k[0]);
	//   71  140:iload           9
	//   72  142:aload_0         
	//   73  143:getfield        #121 <Field int[] k>
	//   74  146:iconst_0        
	//   75  147:iaload          
	//   76  148:invokestatic    #333 <Method int Math.max(int, int)>
	//   77  151:istore          6
						else
	//*  78  153:goto            169
							l1 = Math.min(k2, k[0]);
	//   79  156:iload           9
	//   80  158:aload_0         
	//   81  159:getfield        #121 <Field int[] k>
	//   82  162:iconst_0        
	//   83  163:iaload          
	//   84  164:invokestatic    #330 <Method int Math.min(int, int)>
	//   85  167:istore          6
						if(j1 > 0)
	//*  86  169:iload_3         
	//*  87  170:ifle            189
							i2 = Math.max(i2, k[1]);
	//   88  173:iload           7
	//   89  175:aload_0         
	//   90  176:getfield        #121 <Field int[] k>
	//   91  179:iconst_1        
	//   92  180:iaload          
	//   93  181:invokestatic    #333 <Method int Math.max(int, int)>
	//   94  184:istore          7
						else
	//*  95  186:goto            202
							i2 = Math.min(i2, k[1]);
	//   96  189:iload           7
	//   97  191:aload_0         
	//   98  192:getfield        #121 <Field int[] k>
	//   99  195:iconst_1        
	//  100  196:iaload          
	//  101  197:invokestatic    #330 <Method int Math.min(int, int)>
	//  102  200:istore          7
						l2 = l1;
	//  103  202:iload           6
	//  104  204:istore          10
						l1 = i2;
	//  105  206:iload           7
	//  106  208:istore          6
						flag = true;
	//  107  210:iconst_1        
	//  108  211:istore          11
					}
				}
			}
			j2++;
	//  109  213:iload           8
	//  110  215:iconst_1        
	//  111  216:iadd            
	//  112  217:istore          8
			k2 = l2;
	//  113  219:iload           10
	//  114  221:istore          9
		}

	//  115  223:iload           6
	//  116  225:istore          7
	//* 117  227:goto            18
		ai1[0] = k2;
	//  118  230:aload           4
	//  119  232:iconst_0        
	//  120  233:iload           9
	//  121  235:iastore         
		ai1[1] = i2;
	//  122  236:aload           4
	//  123  238:iconst_1        
	//  124  239:iload           7
	//  125  241:iastore         
		if(flag)
	//* 126  242:iload           11
	//* 127  244:ifeq            252
			a(1);
	//  128  247:aload_0         
	//  129  248:iconst_1        
	//  130  249:invokevirtual   #777 <Method void a(int)>
	//  131  252:return          
	}

	void a(View view, int i1, Rect rect, Rect rect1)
	{
		am am1 = (am)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:astore          7
		int j1 = view.getMeasuredWidth();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #559 <Method int View.getMeasuredWidth()>
	//    6   13:istore          5
		int k1 = view.getMeasuredHeight();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #562 <Method int View.getMeasuredHeight()>
	//    9   19:istore          6
		a(view, i1, rect, rect1, am1, j1, k1);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:aload_3         
	//   14   25:aload           4
	//   15   27:aload           7
	//   16   29:iload           5
	//   17   31:iload           6
	//   18   33:invokespecial   #783 <Method void a(View, int, Rect, Rect, am, int, int)>
		a(am1, rect1, j1, k1);
	//   19   36:aload_0         
	//   20   37:aload           7
	//   21   39:aload           4
	//   22   41:iload           5
	//   23   43:iload           6
	//   24   45:invokespecial   #785 <Method void a(am, Rect, int, int)>
	//   25   48:return          
	}

	void a(View view, Rect rect)
	{
		ap.b(((ViewGroup) (this)), view, rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #790 <Method void ap.b(ViewGroup, View, Rect)>
	//    4    6:return          
	}

	void a(View view, boolean flag, Rect rect)
	{
		if(!view.isLayoutRequested() && view.getVisibility() != 8)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #793 <Method boolean View.isLayoutRequested()>
	//*   2    4:ifne            51
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #717 <Method int View.getVisibility()>
	//*   5   11:bipush          8
	//*   6   13:icmpne          19
	//*   7   16:goto            51
		{
			if(flag)
	//*   8   19:iload_2         
	//*   9   20:ifeq            30
			{
				a(view, rect);
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:aload_3         
	//   13   26:invokevirtual   #449 <Method void a(View, Rect)>
				return;
	//   14   29:return          
			} else
			{
				rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   15   30:aload_3         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #399 <Method int View.getLeft()>
	//   18   35:aload_1         
	//   19   36:invokevirtual   #402 <Method int View.getTop()>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #405 <Method int View.getRight()>
	//   22   43:aload_1         
	//   23   44:invokevirtual   #408 <Method int View.getBottom()>
	//   24   47:invokevirtual   #351 <Method void Rect.set(int, int, int, int)>
				return;
	//   25   50:return          
			}
		} else
		{
			rect.setEmpty();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #295 <Method void Rect.setEmpty()>
			return;
	//   28   55:return          
		}
	}

	public boolean a(View view, int i1, int j1)
	{
		Rect rect;
		rect = e();
	//    0    0:invokestatic    #396 <Method Rect e()>
	//    1    3:astore          5
		a(view, rect);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload           5
	//    5    9:invokevirtual   #449 <Method void a(View, Rect)>
		boolean flag = rect.contains(i1, j1);
	//    6   12:aload           5
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #797 <Method boolean Rect.contains(int, int)>
	//   10   19:istore          4
		a(rect);
	//   11   21:aload           5
	//   12   23:invokestatic    #431 <Method void a(Rect)>
		return flag;
	//   13   26:iload           4
	//   14   28:ireturn         
		view;
	//   15   29:astore_1        
		a(rect);
	//   16   30:aload           5
	//   17   32:invokestatic    #431 <Method void a(Rect)>
		throw view;
	//   18   35:aload_1         
	//   19   36:athrow          
	}

	public boolean a(View view, View view1, int i1, int j1)
	{
		int l1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method int getChildCount()>
	//    2    4:istore          6
		int k1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          7
		for(; k1 < l1; k1++)
	//*   7   12:iload           5
	//*   8   14:iload           6
	//*   9   16:icmpge          113
		{
			View view2 = getChildAt(k1);
	//   10   19:aload_0         
	//   11   20:iload           5
	//   12   22:invokevirtual   #474 <Method View getChildAt(int)>
	//   13   25:astore          9
			if(view2.getVisibility() == 8)
	//*  14   27:aload           9
	//*  15   29:invokevirtual   #717 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          40
				continue;
	//   18   37:goto            104
			am am1 = (am)view2.getLayoutParams();
	//   19   40:aload           9
	//   20   42:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   45:checkcast       #313 <Class am>
	//   22   48:astore          10
			aj aj1 = am1.b();
	//   23   50:aload           10
	//   24   52:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   25   55:astore          11
			if(aj1 != null)
	//*  26   57:aload           11
	//*  27   59:ifnull          96
			{
				boolean flag1 = aj1.a(this, view2, view, view1, i1, j1);
	//   28   62:aload           11
	//   29   64:aload_0         
	//   30   65:aload           9
	//   31   67:aload_1         
	//   32   68:aload_2         
	//   33   69:iload_3         
	//   34   70:iload           4
	//   35   72:invokevirtual   #801 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, View, View, int, int)>
	//   36   75:istore          8
				am1.a(j1, flag1);
	//   37   77:aload           10
	//   38   79:iload           4
	//   39   81:iload           8
	//   40   83:invokevirtual   #804 <Method void android.support.design.widget.am.a(int, boolean)>
				flag |= flag1;
	//   41   86:iload           7
	//   42   88:iload           8
	//   43   90:ior             
	//   44   91:istore          7
			} else
	//*  45   93:goto            104
			{
				am1.a(j1, false);
	//   46   96:aload           10
	//   47   98:iload           4
	//   48  100:iconst_0        
	//   49  101:invokevirtual   #804 <Method void android.support.design.widget.am.a(int, boolean)>
			}
		}

	//   50  104:iload           5
	//   51  106:iconst_1        
	//   52  107:iadd            
	//   53  108:istore          5
	//*  54  110:goto            12
		return flag;
	//   55  113:iload           7
	//   56  115:ireturn         
	}

	void b()
	{
		if(n)
	//*   0    0:aload_0         
	//*   1    1:getfield        #806 <Field boolean n>
	//*   2    4:ifeq            37
		{
			if(r == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #808 <Field an r>
	//*   5   11:ifnonnull       26
				r = new an(this);
	//    6   14:aload_0         
	//    7   15:new             #810 <Class an>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #811 <Method void an(CoordinatorLayout)>
	//   11   23:putfield        #808 <Field an r>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (r)));
	//   12   26:aload_0         
	//   13   27:invokevirtual   #815 <Method ViewTreeObserver getViewTreeObserver()>
	//   14   30:aload_0         
	//   15   31:getfield        #808 <Field an r>
	//   16   34:invokevirtual   #821 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		s = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #707 <Field boolean s>
	//   20   42:return          
	}

	public void b(View view)
	{
		List list = h.c(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field k h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #825 <Method List k.c(Object)>
	//    4    8:astore_3        
		if(list != null && !list.isEmpty())
	//*   5    9:aload_3         
	//*   6   10:ifnull          81
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #826 <Method boolean List.isEmpty()>
	//*   9   19:ifne            81
		{
			for(int i1 = 0; i1 < list.size(); i1++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:aload_3         
	//*  14   26:invokeinterface #516 <Method int List.size()>
	//*  15   31:icmpge          81
			{
				View view1 = (View)list.get(i1);
	//   16   34:aload_3         
	//   17   35:iload_2         
	//   18   36:invokeinterface #519 <Method Object List.get(int)>
	//   19   41:checkcast       #384 <Class View>
	//   20   44:astore          4
				aj aj1 = ((am)view1.getLayoutParams()).b();
	//   21   46:aload           4
	//   22   48:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   51:checkcast       #313 <Class am>
	//   24   54:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   25   57:astore          5
				if(aj1 != null)
	//*  26   59:aload           5
	//*  27   61:ifnull          74
					aj1.b(this, view1, view);
	//   28   64:aload           5
	//   29   66:aload_0         
	//   30   67:aload           4
	//   31   69:aload_1         
	//   32   70:invokevirtual   #742 <Method boolean android.support.design.widget.aj.b(CoordinatorLayout, View, View)>
	//   33   73:pop             
			}

	//   34   74:iload_2         
	//   35   75:iconst_1        
	//   36   76:iadd            
	//   37   77:istore_2        
		}
	//*  38   78:goto            24
	//   39   81:return          
	}

	void b(View view, int i1)
	{
label0:
		{
			int k1;
			int l1;
			am am1;
			Rect rect;
			Rect rect1;
			Rect rect2;
label1:
			{
				am1 = (am)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:astore          6
				if(am1.k == null)
					break label0;
	//    4    9:aload           6
	//    5   11:getfield        #751 <Field View android.support.design.widget.am.k>
	//    6   14:ifnull          212
				rect = e();
	//    7   17:invokestatic    #396 <Method Rect e()>
	//    8   20:astore          7
				rect1 = e();
	//    9   22:invokestatic    #396 <Method Rect e()>
	//   10   25:astore          8
				rect2 = e();
	//   11   27:invokestatic    #396 <Method Rect e()>
	//   12   30:astore          9
				a(am1.k, rect);
	//   13   32:aload_0         
	//   14   33:aload           6
	//   15   35:getfield        #751 <Field View android.support.design.widget.am.k>
	//   16   38:aload           7
	//   17   40:invokevirtual   #449 <Method void a(View, Rect)>
				boolean flag = false;
	//   18   43:iconst_0        
	//   19   44:istore_3        
				a(view, false, rect1);
	//   20   45:aload_0         
	//   21   46:aload_1         
	//   22   47:iconst_0        
	//   23   48:aload           8
	//   24   50:invokevirtual   #724 <Method void a(View, boolean, Rect)>
				k1 = view.getMeasuredWidth();
	//   25   53:aload_1         
	//   26   54:invokevirtual   #559 <Method int View.getMeasuredWidth()>
	//   27   57:istore          4
				l1 = view.getMeasuredHeight();
	//   28   59:aload_1         
	//   29   60:invokevirtual   #562 <Method int View.getMeasuredHeight()>
	//   30   63:istore          5
				a(view, i1, rect, rect2, am1, k1, l1);
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:iload_2         
	//   34   68:aload           7
	//   35   70:aload           9
	//   36   72:aload           6
	//   37   74:iload           4
	//   38   76:iload           5
	//   39   78:invokespecial   #783 <Method void a(View, int, Rect, Rect, am, int, int)>
				if(rect2.left == rect1.left)
	//*  40   81:aload           9
	//*  41   83:getfield        #319 <Field int Rect.left>
	//*  42   86:aload           8
	//*  43   88:getfield        #319 <Field int Rect.left>
	//*  44   91:icmpne          109
				{
					i1 = ((int) (flag));
	//   45   94:iload_3         
	//   46   95:istore_2        
					if(rect2.top == rect1.top)
						break label1;
	//   47   96:aload           9
	//   48   98:getfield        #342 <Field int Rect.top>
	//   49  101:aload           8
	//   50  103:getfield        #342 <Field int Rect.top>
	//   51  106:icmpeq          111
				}
				i1 = 1;
	//   52  109:iconst_1        
	//   53  110:istore_2        
			}
			a(am1, rect2, k1, l1);
	//   54  111:aload_0         
	//   55  112:aload           6
	//   56  114:aload           9
	//   57  116:iload           4
	//   58  118:iload           5
	//   59  120:invokespecial   #785 <Method void a(am, Rect, int, int)>
			int j1 = rect2.left - rect1.left;
	//   60  123:aload           9
	//   61  125:getfield        #319 <Field int Rect.left>
	//   62  128:aload           8
	//   63  130:getfield        #319 <Field int Rect.left>
	//   64  133:isub            
	//   65  134:istore_3        
			k1 = rect2.top - rect1.top;
	//   66  135:aload           9
	//   67  137:getfield        #342 <Field int Rect.top>
	//   68  140:aload           8
	//   69  142:getfield        #342 <Field int Rect.top>
	//   70  145:isub            
	//   71  146:istore          4
			if(j1 != 0)
	//*  72  148:iload_3         
	//*  73  149:ifeq            157
				ac.f(view, j1);
	//   74  152:aload_1         
	//   75  153:iload_3         
	//   76  154:invokestatic    #583 <Method void ac.f(View, int)>
			if(k1 != 0)
	//*  77  157:iload           4
	//*  78  159:ifeq            168
				ac.e(view, k1);
	//   79  162:aload_1         
	//   80  163:iload           4
	//   81  165:invokestatic    #614 <Method void ac.e(View, int)>
			if(i1 != 0)
	//*  82  168:iload_2         
	//*  83  169:ifeq            197
			{
				aj aj1 = am1.b();
	//   84  172:aload           6
	//   85  174:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   86  177:astore          10
				if(aj1 != null)
	//*  87  179:aload           10
	//*  88  181:ifnull          197
					aj1.b(this, view, am1.k);
	//   89  184:aload           10
	//   90  186:aload_0         
	//   91  187:aload_1         
	//   92  188:aload           6
	//   93  190:getfield        #751 <Field View android.support.design.widget.am.k>
	//   94  193:invokevirtual   #742 <Method boolean android.support.design.widget.aj.b(CoordinatorLayout, View, View)>
	//   95  196:pop             
			}
			a(rect);
	//   96  197:aload           7
	//   97  199:invokestatic    #431 <Method void a(Rect)>
			a(rect1);
	//   98  202:aload           8
	//   99  204:invokestatic    #431 <Method void a(Rect)>
			a(rect2);
	//  100  207:aload           9
	//  101  209:invokestatic    #431 <Method void a(Rect)>
		}
	//  102  212:return          
	}

	void b(View view, Rect rect)
	{
		((am)view.getLayoutParams()).a(rect);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #827 <Method void android.support.design.widget.am.a(Rect)>
	//    5   11:return          
	}

	public void b(View view, View view1, int i1, int j1)
	{
		x.a(view, view1, i1, j1);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field x x>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #830 <Method void x.a(View, View, int, int)>
		q = view1;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #832 <Field View q>
		int l1 = getChildCount();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #467 <Method int getChildCount()>
	//   12   21:istore          6
		for(int k1 = 0; k1 < l1; k1++)
	//*  13   23:iconst_0        
	//*  14   24:istore          5
	//*  15   26:iload           5
	//*  16   28:iload           6
	//*  17   30:icmpge          98
		{
			View view2 = getChildAt(k1);
	//   18   33:aload_0         
	//   19   34:iload           5
	//   20   36:invokevirtual   #474 <Method View getChildAt(int)>
	//   21   39:astore          7
			Object obj = ((Object) ((am)view2.getLayoutParams()));
	//   22   41:aload           7
	//   23   43:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   46:checkcast       #313 <Class am>
	//   25   49:astore          8
			if(!((am) (obj)).b(j1))
	//*  26   51:aload           8
	//*  27   53:iload           4
	//*  28   55:invokevirtual   #772 <Method boolean android.support.design.widget.am.b(int)>
	//*  29   58:ifne            64
				continue;
	//   30   61:goto            89
			obj = ((Object) (((am) (obj)).b()));
	//   31   64:aload           8
	//   32   66:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   33   69:astore          8
			if(obj != null)
	//*  34   71:aload           8
	//*  35   73:ifnull          89
				((aj) (obj)).b(this, view2, view, view1, i1, j1);
	//   36   76:aload           8
	//   37   78:aload_0         
	//   38   79:aload           7
	//   39   81:aload_1         
	//   40   82:aload_2         
	//   41   83:iload_3         
	//   42   84:iload           4
	//   43   86:invokevirtual   #835 <Method void android.support.design.widget.aj.b(CoordinatorLayout, View, View, View, int, int)>
		}

	//   44   89:iload           5
	//   45   91:iconst_1        
	//   46   92:iadd            
	//   47   93:istore          5
	//*  48   95:goto            26
	//   49   98:return          
	}

	public List c(View view)
	{
		view = ((View) (h.d(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field k h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #838 <Method List k.d(Object)>
	//    4    8:astore_1        
		j.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #119 <Field List j>
	//    7   13:invokeinterface #461 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			j.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #119 <Field List j>
	//   12   26:aload_1         
	//   13   27:invokeinterface #610 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return j;
	//   15   33:aload_0         
	//   16   34:getfield        #119 <Field List j>
	//   17   37:areturn         
	}

	void c()
	{
		if(n && r != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #806 <Field boolean n>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #808 <Field an r>
	//*   5   11:ifnull          25
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (r)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #815 <Method ViewTreeObserver getViewTreeObserver()>
	//    8   18:aload_0         
	//    9   19:getfield        #808 <Field an r>
	//   10   22:invokevirtual   #841 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		s = false;
	//   11   25:aload_0         
	//   12   26:iconst_0        
	//   13   27:putfield        #707 <Field boolean s>
	//   14   30:return          
	}

	public void c(View view, int i1)
	{
		x.a(view, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field x x>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #843 <Method void x.a(View, int)>
		int k1 = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #467 <Method int getChildCount()>
	//    7   13:istore          4
		for(int j1 = 0; j1 < k1; j1++)
	//*   8   15:iconst_0        
	//*   9   16:istore_3        
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:icmpge          92
		{
			View view1 = getChildAt(j1);
	//   13   23:aload_0         
	//   14   24:iload_3         
	//   15   25:invokevirtual   #474 <Method View getChildAt(int)>
	//   16   28:astore          5
			am am1 = (am)view1.getLayoutParams();
	//   17   30:aload           5
	//   18   32:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   35:checkcast       #313 <Class am>
	//   20   38:astore          6
			if(!am1.b(i1))
	//*  21   40:aload           6
	//*  22   42:iload_2         
	//*  23   43:invokevirtual   #772 <Method boolean android.support.design.widget.am.b(int)>
	//*  24   46:ifne            52
				continue;
	//   25   49:goto            85
			aj aj1 = am1.b();
	//   26   52:aload           6
	//   27   54:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   28   57:astore          7
			if(aj1 != null)
	//*  29   59:aload           7
	//*  30   61:ifnull          74
				aj1.a(this, view1, view, i1);
	//   31   64:aload           7
	//   32   66:aload_0         
	//   33   67:aload           5
	//   34   69:aload_1         
	//   35   70:iload_2         
	//   36   71:invokevirtual   #846 <Method void android.support.design.widget.aj.a(CoordinatorLayout, View, View, int)>
			am1.a(i1);
	//   37   74:aload           6
	//   38   76:iload_2         
	//   39   77:invokevirtual   #847 <Method void android.support.design.widget.am.a(int)>
			am1.h();
	//   40   80:aload           6
	//   41   82:invokevirtual   #740 <Method void am.h()>
		}

	//   42   85:iload_3         
	//   43   86:iconst_1        
	//   44   87:iadd            
	//   45   88:istore_3        
	//*  46   89:goto            17
		q = null;
	//   47   92:aload_0         
	//   48   93:aconst_null     
	//   49   94:putfield        #832 <Field View q>
	//   50   97:return          
	}

	void c(View view, Rect rect)
	{
		rect.set(((am)view.getLayoutParams()).c());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    3    5:checkcast       #313 <Class am>
	//    4    8:invokevirtual   #849 <Method Rect android.support.design.widget.am.c()>
	//    5   11:invokevirtual   #429 <Method void Rect.set(Rect)>
	//    6   14:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof am) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #313 <Class am>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #853 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	protected am d()
	{
		return new am(-2, -2);
	//    0    0:new             #313 <Class am>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #857 <Method void am(int, int)>
	//    5   11:areturn         
	}

	public List d(View view)
	{
		view = ((View) (h.c(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field k h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #825 <Method List k.c(Object)>
	//    4    8:astore_1        
		j.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #119 <Field List j>
	//    7   13:invokeinterface #461 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			j.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #119 <Field List j>
	//   12   26:aload_1         
	//   13   27:invokeinterface #610 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return j;
	//   15   33:aload_0         
	//   16   34:getfield        #119 <Field List j>
	//   17   37:areturn         
	}

	protected boolean drawChild(Canvas canvas, View view, long l1)
	{
		am am1 = (am)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:astore          7
		if(am1.a != null)
	//*   4    9:aload           7
	//*   5   11:getfield        #862 <Field aj android.support.design.widget.am.a>
	//*   6   14:ifnull          179
		{
			float f1 = am1.a.d(this, view);
	//    7   17:aload           7
	//    8   19:getfield        #862 <Field aj android.support.design.widget.am.a>
	//    9   22:aload_0         
	//   10   23:aload_2         
	//   11   24:invokevirtual   #865 <Method float android.support.design.widget.aj.d(CoordinatorLayout, View)>
	//   12   27:fstore          5
			if(f1 > 0.0F)
	//*  13   29:fload           5
	//*  14   31:fconst_0        
	//*  15   32:fcmpl           
	//*  16   33:ifle            179
			{
				if(l == null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #867 <Field Paint l>
	//*  19   40:ifnonnull       54
					l = new Paint();
	//   20   43:aload_0         
	//   21   44:new             #869 <Class Paint>
	//   22   47:dup             
	//   23   48:invokespecial   #870 <Method void Paint()>
	//   24   51:putfield        #867 <Field Paint l>
				l.setColor(am1.a.c(this, view));
	//   25   54:aload_0         
	//   26   55:getfield        #867 <Field Paint l>
	//   27   58:aload           7
	//   28   60:getfield        #862 <Field aj android.support.design.widget.am.a>
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:invokevirtual   #873 <Method int android.support.design.widget.aj.c(CoordinatorLayout, View)>
	//   32   68:invokevirtual   #876 <Method void Paint.setColor(int)>
				l.setAlpha(a(Math.round(f1 * 255F), 0, 255));
	//   33   71:aload_0         
	//   34   72:getfield        #867 <Field Paint l>
	//   35   75:fload           5
	//   36   77:ldc2            #877 <Float 255F>
	//   37   80:fmul            
	//   38   81:invokestatic    #881 <Method int Math.round(float)>
	//   39   84:iconst_0        
	//   40   85:sipush          255
	//   41   88:invokestatic    #883 <Method int a(int, int, int)>
	//   42   91:invokevirtual   #886 <Method void Paint.setAlpha(int)>
				int i1 = canvas.save();
	//   43   94:aload_1         
	//   44   95:invokevirtual   #891 <Method int Canvas.save()>
	//   45   98:istore          6
				if(view.isOpaque())
	//*  46  100:aload_2         
	//*  47  101:invokevirtual   #894 <Method boolean View.isOpaque()>
	//*  48  104:ifeq            135
					canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), android.graphics.Region.Op.DIFFERENCE);
	//   49  107:aload_1         
	//   50  108:aload_2         
	//   51  109:invokevirtual   #399 <Method int View.getLeft()>
	//   52  112:i2f             
	//   53  113:aload_2         
	//   54  114:invokevirtual   #402 <Method int View.getTop()>
	//   55  117:i2f             
	//   56  118:aload_2         
	//   57  119:invokevirtual   #405 <Method int View.getRight()>
	//   58  122:i2f             
	//   59  123:aload_2         
	//   60  124:invokevirtual   #408 <Method int View.getBottom()>
	//   61  127:i2f             
	//   62  128:getstatic       #900 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   63  131:invokevirtual   #904 <Method boolean Canvas.clipRect(float, float, float, float, android.graphics.Region$Op)>
	//   64  134:pop             
				canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), l);
	//   65  135:aload_1         
	//   66  136:aload_0         
	//   67  137:invokevirtual   #311 <Method int getPaddingLeft()>
	//   68  140:i2f             
	//   69  141:aload_0         
	//   70  142:invokevirtual   #336 <Method int getPaddingTop()>
	//   71  145:i2f             
	//   72  146:aload_0         
	//   73  147:invokevirtual   #305 <Method int getWidth()>
	//   74  150:aload_0         
	//   75  151:invokevirtual   #322 <Method int getPaddingRight()>
	//   76  154:isub            
	//   77  155:i2f             
	//   78  156:aload_0         
	//   79  157:invokevirtual   #308 <Method int getHeight()>
	//   80  160:aload_0         
	//   81  161:invokevirtual   #345 <Method int getPaddingBottom()>
	//   82  164:isub            
	//   83  165:i2f             
	//   84  166:aload_0         
	//   85  167:getfield        #867 <Field Paint l>
	//   86  170:invokevirtual   #908 <Method void Canvas.drawRect(float, float, float, float, Paint)>
				canvas.restoreToCount(i1);
	//   87  173:aload_1         
	//   88  174:iload           6
	//   89  176:invokevirtual   #911 <Method void Canvas.restoreToCount(int)>
			}
		}
		return super.drawChild(canvas, view, l1);
	//   90  179:aload_0         
	//   91  180:aload_1         
	//   92  181:aload_2         
	//   93  182:lload_3         
	//   94  183:invokespecial   #913 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   95  186:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #916 <Method void ViewGroup.drawableStateChanged()>
		int ai1[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #920 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		Drawable drawable = v;
	//    5    9:aload_0         
	//    6   10:getfield        #182 <Field Drawable v>
	//    7   13:astore          4
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(drawable != null)
	//*  12   19:aload           4
	//*  13   21:ifnull          43
		{
			flag = flag1;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if(drawable.isStateful())
	//*  16   26:aload           4
	//*  17   28:invokevirtual   #925 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai1);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #929 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		if(flag)
	//*  25   43:iload_1         
	//*  26   44:ifeq            51
			invalidate();
	//   27   47:aload_0         
	//   28   48:invokevirtual   #932 <Method void invalidate()>
	//   29   51:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (d()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #935 <Method am d()>
	//    2    4:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #939 <Method am a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #942 <Method am a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	final List getDependencySortedChildren()
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #945 <Method void f()>
		return Collections.unmodifiableList(g);
	//    2    4:aload_0         
	//    3    5:getfield        #110 <Field List g>
	//    4    8:invokestatic    #949 <Method List Collections.unmodifiableList(List)>
	//    5   11:areturn         
	}

	public final bb getLastWindowInsets()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #568 <Field bb t>
	//    2    4:areturn         
	}

	public int getNestedScrollAxes()
	{
		return x.a();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field x x>
	//    2    4:invokevirtual   #953 <Method int x.a()>
	//    3    7:ireturn         
	}

	public Drawable getStatusBarBackground()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field Drawable v>
	//    2    4:areturn         
	}

	protected int getSuggestedMinimumHeight()
	{
		return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method int ViewGroup.getSuggestedMinimumHeight()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #336 <Method int getPaddingTop()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #345 <Method int getPaddingBottom()>
	//    6   12:iadd            
	//    7   13:invokestatic    #333 <Method int Math.max(int, int)>
	//    8   16:ireturn         
	}

	protected int getSuggestedMinimumWidth()
	{
		return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
	//    0    0:aload_0         
	//    1    1:invokespecial   #960 <Method int ViewGroup.getSuggestedMinimumWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #311 <Method int getPaddingLeft()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #322 <Method int getPaddingRight()>
	//    6   12:iadd            
	//    7   13:invokestatic    #333 <Method int Math.max(int, int)>
	//    8   16:ireturn         
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #963 <Method void ViewGroup.onAttachedToWindow()>
		a(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #964 <Method void a(boolean)>
		if(s)
	//*   5    9:aload_0         
	//*   6   10:getfield        #707 <Field boolean s>
	//*   7   13:ifeq            46
		{
			if(r == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #808 <Field an r>
	//*  10   20:ifnonnull       35
				r = new an(this);
	//   11   23:aload_0         
	//   12   24:new             #810 <Class an>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #811 <Method void an(CoordinatorLayout)>
	//   16   32:putfield        #808 <Field an r>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (r)));
	//   17   35:aload_0         
	//   18   36:invokevirtual   #815 <Method ViewTreeObserver getViewTreeObserver()>
	//   19   39:aload_0         
	//   20   40:getfield        #808 <Field an r>
	//   21   43:invokevirtual   #821 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		if(t == null && ac.q(((View) (this))))
	//*  22   46:aload_0         
	//*  23   47:getfield        #568 <Field bb t>
	//*  24   50:ifnonnull       64
	//*  25   53:aload_0         
	//*  26   54:invokestatic    #550 <Method boolean ac.q(View)>
	//*  27   57:ifeq            64
			ac.p(((View) (this)));
	//   28   60:aload_0         
	//   29   61:invokestatic    #966 <Method void ac.p(View)>
		n = true;
	//   30   64:aload_0         
	//   31   65:iconst_1        
	//   32   66:putfield        #806 <Field boolean n>
	//   33   69:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #969 <Method void ViewGroup.onDetachedFromWindow()>
		a(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #964 <Method void a(boolean)>
		if(s && r != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #707 <Field boolean s>
	//*   7   13:ifeq            34
	//*   8   16:aload_0         
	//*   9   17:getfield        #808 <Field an r>
	//*  10   20:ifnull          34
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (r)));
	//   11   23:aload_0         
	//   12   24:invokevirtual   #815 <Method ViewTreeObserver getViewTreeObserver()>
	//   13   27:aload_0         
	//   14   28:getfield        #808 <Field an r>
	//   15   31:invokevirtual   #841 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		View view = q;
	//   16   34:aload_0         
	//   17   35:getfield        #832 <Field View q>
	//   18   38:astore_1        
		if(view != null)
	//*  19   39:aload_1         
	//*  20   40:ifnull          48
			onStopNestedScroll(view);
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:invokevirtual   #972 <Method void onStopNestedScroll(View)>
		n = false;
	//   24   48:aload_0         
	//   25   49:iconst_0        
	//   26   50:putfield        #806 <Field boolean n>
	//   27   53:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #976 <Method void ViewGroup.onDraw(Canvas)>
		if(u && v != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #691 <Field boolean u>
	//*   5    9:ifeq            64
	//*   6   12:aload_0         
	//*   7   13:getfield        #182 <Field Drawable v>
	//*   8   16:ifnull          64
		{
			bb bb1 = t;
	//    9   19:aload_0         
	//   10   20:getfield        #568 <Field bb t>
	//   11   23:astore_3        
			int i1;
			if(bb1 != null)
	//*  12   24:aload_3         
	//*  13   25:ifnull          36
				i1 = bb1.b();
	//   14   28:aload_3         
	//   15   29:invokevirtual   #572 <Method int bb.b()>
	//   16   32:istore_2        
			else
	//*  17   33:goto            38
				i1 = 0;
	//   18   36:iconst_0        
	//   19   37:istore_2        
			if(i1 > 0)
	//*  20   38:iload_2         
	//*  21   39:ifle            64
			{
				v.setBounds(0, 0, getWidth(), i1);
	//   22   42:aload_0         
	//   23   43:getfield        #182 <Field Drawable v>
	//   24   46:iconst_0        
	//   25   47:iconst_0        
	//   26   48:aload_0         
	//   27   49:invokevirtual   #305 <Method int getWidth()>
	//   28   52:iload_2         
	//   29   53:invokevirtual   #979 <Method void Drawable.setBounds(int, int, int, int)>
				v.draw(canvas);
	//   30   56:aload_0         
	//   31   57:getfield        #182 <Field Drawable v>
	//   32   60:aload_1         
	//   33   61:invokevirtual   #982 <Method void Drawable.draw(Canvas)>
			}
		}
	//   34   64:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #511 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i1 == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            14
			a(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokespecial   #964 <Method void a(boolean)>
		boolean flag = a(motionevent, 0);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:invokespecial   #986 <Method boolean a(MotionEvent, int)>
	//   12   20:istore_3        
		if(i1 == 1 || i1 == 3)
	//*  13   21:iload_2         
	//*  14   22:iconst_1        
	//*  15   23:icmpeq          31
	//*  16   26:iload_2         
	//*  17   27:iconst_3        
	//*  18   28:icmpne          36
			a(true);
	//   19   31:aload_0         
	//   20   32:iconst_1        
	//   21   33:invokespecial   #964 <Method void a(boolean)>
		return flag;
	//   22   36:iload_3         
	//   23   37:ireturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		j1 = ac.f(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #714 <Method int ac.f(View)>
	//    2    4:istore_3        
		k1 = g.size();
	//    3    5:aload_0         
	//    4    6:getfield        #110 <Field List g>
	//    5    9:invokeinterface #516 <Method int List.size()>
	//    6   14:istore          4
		for(i1 = 0; i1 < k1; i1++)
	//*   7   16:iconst_0        
	//*   8   17:istore_2        
	//*   9   18:iload_2         
	//*  10   19:iload           4
	//*  11   21:icmpge          96
		{
			View view = (View)g.get(i1);
	//   12   24:aload_0         
	//   13   25:getfield        #110 <Field List g>
	//   14   28:iload_2         
	//   15   29:invokeinterface #519 <Method Object List.get(int)>
	//   16   34:checkcast       #384 <Class View>
	//   17   37:astore          6
			if(view.getVisibility() == 8)
	//*  18   39:aload           6
	//*  19   41:invokevirtual   #717 <Method int View.getVisibility()>
	//*  20   44:bipush          8
	//*  21   46:icmpne          52
				continue;
	//   22   49:goto            89
			aj aj1 = ((am)view.getLayoutParams()).b();
	//   23   52:aload           6
	//   24   54:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   57:checkcast       #313 <Class am>
	//   26   60:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   27   63:astore          7
			if(aj1 == null || !aj1.a(this, view, j1))
	//*  28   65:aload           7
	//*  29   67:ifnull          82
	//*  30   70:aload           7
	//*  31   72:aload_0         
	//*  32   73:aload           6
	//*  33   75:iload_3         
	//*  34   76:invokevirtual   #991 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, int)>
	//*  35   79:ifne            89
				a(view, j1);
	//   36   82:aload_0         
	//   37   83:aload           6
	//   38   85:iload_3         
	//   39   86:invokevirtual   #992 <Method void a(View, int)>
		}

	//   40   89:iload_2         
	//   41   90:iconst_1        
	//   42   91:iadd            
	//   43   92:istore_2        
	//*  44   93:goto            18
	//   45   96:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #945 <Method void f()>
		a();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #994 <Method void a()>
		int l3 = getPaddingLeft();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #311 <Method int getPaddingLeft()>
	//    6   12:istore          13
		int i4 = getPaddingTop();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #336 <Method int getPaddingTop()>
	//    9   18:istore          14
		int j4 = getPaddingRight();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #322 <Method int getPaddingRight()>
	//   12   24:istore          15
		int k4 = getPaddingBottom();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #345 <Method int getPaddingBottom()>
	//   15   30:istore          16
		int l4 = ac.f(((View) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #714 <Method int ac.f(View)>
	//   18   36:istore          17
		boolean flag;
		if(l4 == 1)
	//*  19   38:iload           17
	//*  20   40:iconst_1        
	//*  21   41:icmpne          50
			flag = true;
	//   22   44:iconst_1        
	//   23   45:istore          5
		else
	//*  24   47:goto            53
			flag = false;
	//   25   50:iconst_0        
	//   26   51:istore          5
		int i5 = android.view.View.MeasureSpec.getMode(i1);
	//   27   53:iload_1         
	//   28   54:invokestatic    #999 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   29   57:istore          18
		int j5 = android.view.View.MeasureSpec.getSize(i1);
	//   30   59:iload_1         
	//   31   60:invokestatic    #1002 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   32   63:istore          19
		int k5 = android.view.View.MeasureSpec.getMode(j1);
	//   33   65:iload_2         
	//   34   66:invokestatic    #999 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   35   69:istore          20
		int l5 = android.view.View.MeasureSpec.getSize(j1);
	//   36   71:iload_2         
	//   37   72:invokestatic    #1002 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   38   75:istore          21
		int l2 = getSuggestedMinimumWidth();
	//   39   77:aload_0         
	//   40   78:invokevirtual   #1003 <Method int getSuggestedMinimumWidth()>
	//   41   81:istore          10
		int l1 = getSuggestedMinimumHeight();
	//   42   83:aload_0         
	//   43   84:invokevirtual   #1004 <Method int getSuggestedMinimumHeight()>
	//   44   87:istore          4
		boolean flag1;
		if(t != null && ac.q(((View) (this))))
	//*  45   89:aload_0         
	//*  46   90:getfield        #568 <Field bb t>
	//*  47   93:ifnull          109
	//*  48   96:aload_0         
	//*  49   97:invokestatic    #550 <Method boolean ac.q(View)>
	//*  50  100:ifeq            109
			flag1 = true;
	//   51  103:iconst_1        
	//   52  104:istore          6
		else
	//*  53  106:goto            112
			flag1 = false;
	//   54  109:iconst_0        
	//   55  110:istore          6
		int i2 = g.size();
	//   56  112:aload_0         
	//   57  113:getfield        #110 <Field List g>
	//   58  116:invokeinterface #516 <Method int List.size()>
	//   59  121:istore          7
		int k2 = 0;
	//   60  123:iconst_0        
	//   61  124:istore          9
		for(int j2 = 0; j2 < i2; j2++)
	//*  62  126:iconst_0        
	//*  63  127:istore          8
	//*  64  129:iload           8
	//*  65  131:iload           7
	//*  66  133:icmpge          509
		{
			int k1;
			am am1;
			View view;
label0:
			{
				view = (View)g.get(j2);
	//   67  136:aload_0         
	//   68  137:getfield        #110 <Field List g>
	//   69  140:iload           8
	//   70  142:invokeinterface #519 <Method Object List.get(int)>
	//   71  147:checkcast       #384 <Class View>
	//   72  150:astore          25
				if(view.getVisibility() == 8)
	//*  73  152:aload           25
	//*  74  154:invokevirtual   #717 <Method int View.getVisibility()>
	//*  75  157:bipush          8
	//*  76  159:icmpne          165
					continue;
	//   77  162:goto            500
				am1 = (am)view.getLayoutParams();
	//   78  165:aload           25
	//   79  167:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   80  170:checkcast       #313 <Class am>
	//   81  173:astore          24
				if(am1.e >= 0 && i5 != 0)
	//*  82  175:aload           24
	//*  83  177:getfield        #755 <Field int am.e>
	//*  84  180:iflt            290
	//*  85  183:iload           18
	//*  86  185:ifeq            290
				{
					k1 = b(am1.e);
	//   87  188:aload_0         
	//   88  189:aload           24
	//   89  191:getfield        #755 <Field int am.e>
	//   90  194:invokespecial   #564 <Method int b(int)>
	//   91  197:istore_3        
					int i3 = android.support.v4.view.l.a(d(am1.c), l4) & 7;
	//   92  198:aload           24
	//   93  200:getfield        #354 <Field int android.support.design.widget.am.c>
	//   94  203:invokestatic    #556 <Method int d(int)>
	//   95  206:iload           17
	//   96  208:invokestatic    #360 <Method int l.a(int, int)>
	//   97  211:bipush          7
	//   98  213:iand            
	//   99  214:istore          11
					if(i3 == 3 && !flag || i3 == 5 && flag)
	//* 100  216:iload           11
	//* 101  218:iconst_3        
	//* 102  219:icmpne          227
	//* 103  222:iload           5
	//* 104  224:ifeq            238
	//* 105  227:iload           11
	//* 106  229:iconst_5        
	//* 107  230:icmpne          253
	//* 108  233:iload           5
	//* 109  235:ifeq            253
					{
						k1 = Math.max(0, j5 - j4 - k1);
	//  110  238:iconst_0        
	//  111  239:iload           19
	//  112  241:iload           15
	//  113  243:isub            
	//  114  244:iload_3         
	//  115  245:isub            
	//  116  246:invokestatic    #333 <Method int Math.max(int, int)>
	//  117  249:istore_3        
						break label0;
	//  118  250:goto            292
					}
					if(i3 == 5 && !flag || i3 == 3 && flag)
	//* 119  253:iload           11
	//* 120  255:iconst_5        
	//* 121  256:icmpne          264
	//* 122  259:iload           5
	//* 123  261:ifeq            275
	//* 124  264:iload           11
	//* 125  266:iconst_3        
	//* 126  267:icmpne          287
	//* 127  270:iload           5
	//* 128  272:ifeq            287
					{
						k1 = Math.max(0, k1 - l3);
	//  129  275:iconst_0        
	//  130  276:iload_3         
	//  131  277:iload           13
	//  132  279:isub            
	//  133  280:invokestatic    #333 <Method int Math.max(int, int)>
	//  134  283:istore_3        
						break label0;
	//  135  284:goto            292
					}
				}
	//* 136  287:goto            290
				k1 = 0;
	//  137  290:iconst_0        
	//  138  291:istore_3        
			}
			int k3 = l1;
	//  139  292:iload           4
	//  140  294:istore          12
			int j3;
			if(flag1 && !ac.q(view))
	//* 141  296:iload           6
	//* 142  298:ifeq            378
	//* 143  301:aload           25
	//* 144  303:invokestatic    #550 <Method boolean ac.q(View)>
	//* 145  306:ifne            378
			{
				l1 = t.a();
	//  146  309:aload_0         
	//  147  310:getfield        #568 <Field bb t>
	//  148  313:invokevirtual   #570 <Method int bb.a()>
	//  149  316:istore          4
				int j6 = t.c();
	//  150  318:aload_0         
	//  151  319:getfield        #568 <Field bb t>
	//  152  322:invokevirtual   #574 <Method int bb.c()>
	//  153  325:istore          23
				j3 = t.b();
	//  154  327:aload_0         
	//  155  328:getfield        #568 <Field bb t>
	//  156  331:invokevirtual   #572 <Method int bb.b()>
	//  157  334:istore          11
				int i6 = t.d();
	//  158  336:aload_0         
	//  159  337:getfield        #568 <Field bb t>
	//  160  340:invokevirtual   #576 <Method int bb.d()>
	//  161  343:istore          22
				l1 = android.view.View.MeasureSpec.makeMeasureSpec(j5 - (l1 + j6), i5);
	//  162  345:iload           19
	//  163  347:iload           4
	//  164  349:iload           23
	//  165  351:iadd            
	//  166  352:isub            
	//  167  353:iload           18
	//  168  355:invokestatic    #1007 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  169  358:istore          4
				j3 = android.view.View.MeasureSpec.makeMeasureSpec(l5 - (j3 + i6), k5);
	//  170  360:iload           21
	//  171  362:iload           11
	//  172  364:iload           22
	//  173  366:iadd            
	//  174  367:isub            
	//  175  368:iload           20
	//  176  370:invokestatic    #1007 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  177  373:istore          11
			} else
	//* 178  375:goto            384
			{
				l1 = i1;
	//  179  378:iload_1         
	//  180  379:istore          4
				j3 = j1;
	//  181  381:iload_2         
	//  182  382:istore          11
			}
			aj aj1 = am1.b();
	//  183  384:aload           24
	//  184  386:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//  185  389:astore          26
			if(aj1 == null || !aj1.a(this, view, l1, k1, j3, 0))
	//* 186  391:aload           26
	//* 187  393:ifnull          416
	//* 188  396:aload           26
	//* 189  398:aload_0         
	//* 190  399:aload           25
	//* 191  401:iload           4
	//* 192  403:iload_3         
	//* 193  404:iload           11
	//* 194  406:iconst_0        
	//* 195  407:invokevirtual   #1010 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, int, int, int, int)>
	//* 196  410:ifne            428
	//* 197  413:goto            416
				a(view, l1, k1, j3, 0);
	//  198  416:aload_0         
	//  199  417:aload           25
	//  200  419:iload           4
	//  201  421:iload_3         
	//  202  422:iload           11
	//  203  424:iconst_0        
	//  204  425:invokevirtual   #1012 <Method void a(View, int, int, int, int)>
			l2 = Math.max(l2, l3 + j4 + view.getMeasuredWidth() + am1.leftMargin + am1.rightMargin);
	//  205  428:iload           10
	//  206  430:iload           13
	//  207  432:iload           15
	//  208  434:iadd            
	//  209  435:aload           25
	//  210  437:invokevirtual   #559 <Method int View.getMeasuredWidth()>
	//  211  440:iadd            
	//  212  441:aload           24
	//  213  443:getfield        #316 <Field int am.leftMargin>
	//  214  446:iadd            
	//  215  447:aload           24
	//  216  449:getfield        #325 <Field int am.rightMargin>
	//  217  452:iadd            
	//  218  453:invokestatic    #333 <Method int Math.max(int, int)>
	//  219  456:istore          10
			l1 = Math.max(k3, i4 + k4 + view.getMeasuredHeight() + am1.topMargin + am1.bottomMargin);
	//  220  458:iload           12
	//  221  460:iload           14
	//  222  462:iload           16
	//  223  464:iadd            
	//  224  465:aload           25
	//  225  467:invokevirtual   #562 <Method int View.getMeasuredHeight()>
	//  226  470:iadd            
	//  227  471:aload           24
	//  228  473:getfield        #339 <Field int am.topMargin>
	//  229  476:iadd            
	//  230  477:aload           24
	//  231  479:getfield        #348 <Field int am.bottomMargin>
	//  232  482:iadd            
	//  233  483:invokestatic    #333 <Method int Math.max(int, int)>
	//  234  486:istore          4
			k2 = View.combineMeasuredStates(k2, view.getMeasuredState());
	//  235  488:iload           9
	//  236  490:aload           25
	//  237  492:invokevirtual   #1015 <Method int View.getMeasuredState()>
	//  238  495:invokestatic    #1018 <Method int View.combineMeasuredStates(int, int)>
	//  239  498:istore          9
		}

	//  240  500:iload           8
	//  241  502:iconst_1        
	//  242  503:iadd            
	//  243  504:istore          8
	//* 244  506:goto            129
		setMeasuredDimension(View.resolveSizeAndState(l2, i1, 0xff000000 & k2), View.resolveSizeAndState(l1, j1, k2 << 16));
	//  245  509:aload_0         
	//  246  510:iload           10
	//  247  512:iload_1         
	//  248  513:ldc2            #1019 <Int 0xff000000>
	//  249  516:iload           9
	//  250  518:iand            
	//  251  519:invokestatic    #1022 <Method int View.resolveSizeAndState(int, int, int)>
	//  252  522:iload           4
	//  253  524:iload_2         
	//  254  525:iload           9
	//  255  527:bipush          16
	//  256  529:ishl            
	//  257  530:invokestatic    #1022 <Method int View.resolveSizeAndState(int, int, int)>
	//  258  533:invokevirtual   #1025 <Method void setMeasuredDimension(int, int)>
	//  259  536:return          
	}

	public boolean onNestedFling(View view, float f1, float f2, boolean flag)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method int getChildCount()>
	//    2    4:istore          6
		int i1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag1;
		boolean flag2;
		for(flag1 = false; i1 < j1; flag1 = flag2)
	//*   5    9:iconst_0        
	//*   6   10:istore          7
	//*   7   12:iload           5
	//*   8   14:iload           6
	//*   9   16:icmpge          117
		{
			View view1 = getChildAt(i1);
	//   10   19:aload_0         
	//   11   20:iload           5
	//   12   22:invokevirtual   #474 <Method View getChildAt(int)>
	//   13   25:astore          9
			if(view1.getVisibility() == 8)
	//*  14   27:aload           9
	//*  15   29:invokevirtual   #717 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          44
			{
				flag2 = flag1;
	//   18   37:iload           7
	//   19   39:istore          8
			} else
	//*  20   41:goto            104
			{
				Object obj = ((Object) ((am)view1.getLayoutParams()));
	//   21   44:aload           9
	//   22   46:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   49:checkcast       #313 <Class am>
	//   24   52:astore          10
				if(!((am) (obj)).b(0))
	//*  25   54:aload           10
	//*  26   56:iconst_0        
	//*  27   57:invokevirtual   #772 <Method boolean android.support.design.widget.am.b(int)>
	//*  28   60:ifne            70
				{
					flag2 = flag1;
	//   29   63:iload           7
	//   30   65:istore          8
				} else
	//*  31   67:goto            104
				{
					obj = ((Object) (((am) (obj)).b()));
	//   32   70:aload           10
	//   33   72:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   34   75:astore          10
					flag2 = flag1;
	//   35   77:iload           7
	//   36   79:istore          8
					if(obj != null)
	//*  37   81:aload           10
	//*  38   83:ifnull          104
						flag2 = flag1 | ((aj) (obj)).a(this, view1, view, f1, f2, flag);
	//   39   86:iload           7
	//   40   88:aload           10
	//   41   90:aload_0         
	//   42   91:aload           9
	//   43   93:aload_1         
	//   44   94:fload_2         
	//   45   95:fload_3         
	//   46   96:iload           4
	//   47   98:invokevirtual   #1030 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, View, float, float, boolean)>
	//   48  101:ior             
	//   49  102:istore          8
				}
			}
			i1++;
	//   50  104:iload           5
	//   51  106:iconst_1        
	//   52  107:iadd            
	//   53  108:istore          5
		}

	//   54  110:iload           8
	//   55  112:istore          7
	//*  56  114:goto            12
		if(flag1)
	//*  57  117:iload           7
	//*  58  119:ifeq            127
			a(1);
	//   59  122:aload_0         
	//   60  123:iconst_1        
	//   61  124:invokevirtual   #777 <Method void a(int)>
		return flag1;
	//   62  127:iload           7
	//   63  129:ireturn         
	}

	public boolean onNestedPreFling(View view, float f1, float f2)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method int getChildCount()>
	//    2    4:istore          5
		int i1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		boolean flag;
		boolean flag1;
		for(flag = false; i1 < j1; flag = flag1)
	//*   5    9:iconst_0        
	//*   6   10:istore          6
	//*   7   12:iload           4
	//*   8   14:iload           5
	//*   9   16:icmpge          115
		{
			View view1 = getChildAt(i1);
	//   10   19:aload_0         
	//   11   20:iload           4
	//   12   22:invokevirtual   #474 <Method View getChildAt(int)>
	//   13   25:astore          8
			if(view1.getVisibility() == 8)
	//*  14   27:aload           8
	//*  15   29:invokevirtual   #717 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          44
			{
				flag1 = flag;
	//   18   37:iload           6
	//   19   39:istore          7
			} else
	//*  20   41:goto            102
			{
				Object obj = ((Object) ((am)view1.getLayoutParams()));
	//   21   44:aload           8
	//   22   46:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   49:checkcast       #313 <Class am>
	//   24   52:astore          9
				if(!((am) (obj)).b(0))
	//*  25   54:aload           9
	//*  26   56:iconst_0        
	//*  27   57:invokevirtual   #772 <Method boolean android.support.design.widget.am.b(int)>
	//*  28   60:ifne            70
				{
					flag1 = flag;
	//   29   63:iload           6
	//   30   65:istore          7
				} else
	//*  31   67:goto            102
				{
					obj = ((Object) (((am) (obj)).b()));
	//   32   70:aload           9
	//   33   72:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   34   75:astore          9
					flag1 = flag;
	//   35   77:iload           6
	//   36   79:istore          7
					if(obj != null)
	//*  37   81:aload           9
	//*  38   83:ifnull          102
						flag1 = flag | ((aj) (obj)).a(this, view1, view, f1, f2);
	//   39   86:iload           6
	//   40   88:aload           9
	//   41   90:aload_0         
	//   42   91:aload           8
	//   43   93:aload_1         
	//   44   94:fload_2         
	//   45   95:fload_3         
	//   46   96:invokevirtual   #1035 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, View, float, float)>
	//   47   99:ior             
	//   48  100:istore          7
				}
			}
			i1++;
	//   49  102:iload           4
	//   50  104:iconst_1        
	//   51  105:iadd            
	//   52  106:istore          4
		}

	//   53  108:iload           7
	//   54  110:istore          6
	//*  55  112:goto            12
		return flag;
	//   56  115:iload           6
	//   57  117:ireturn         
	}

	public void onNestedPreScroll(View view, int i1, int j1, int ai1[])
	{
		a(view, i1, j1, ai1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #1039 <Method void a(View, int, int, int[], int)>
	//    7   10:return          
	}

	public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
	{
		a(view, i1, j1, k1, l1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #1042 <Method void a(View, int, int, int, int, int)>
	//    8   12:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i1)
	{
		b(view, view1, i1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #1045 <Method void b(View, View, int, int)>
	//    6    8:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #1049 <Class CoordinatorLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1051 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #1049 <Class CoordinatorLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1055 <Method Parcelable CoordinatorLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #1051 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		parcelable = ((Parcelable) (((SavedState) (parcelable)).a));
	//   14   26:aload_1         
	//   15   27:getfield        #1058 <Field SparseArray android.support.design.widget.CoordinatorLayout$SavedState.a>
	//   16   30:astore_1        
		int i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_2        
		for(int j1 = getChildCount(); i1 < j1; i1++)
	//*  19   33:aload_0         
	//*  20   34:invokevirtual   #467 <Method int getChildCount()>
	//*  21   37:istore_3        
	//*  22   38:iload_2         
	//*  23   39:iload_3         
	//*  24   40:icmpge          112
		{
			View view = getChildAt(i1);
	//   25   43:aload_0         
	//   26   44:iload_2         
	//   27   45:invokevirtual   #474 <Method View getChildAt(int)>
	//   28   48:astore          5
			int k1 = view.getId();
	//   29   50:aload           5
	//   30   52:invokevirtual   #1061 <Method int View.getId()>
	//   31   55:istore          4
			aj aj1 = a(view).b();
	//   32   57:aload_0         
	//   33   58:aload           5
	//   34   60:invokevirtual   #590 <Method am a(View)>
	//   35   63:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   36   66:astore          6
			if(k1 == -1 || aj1 == null)
				continue;
	//   37   68:iload           4
	//   38   70:iconst_m1       
	//   39   71:icmpeq          105
	//   40   74:aload           6
	//   41   76:ifnull          105
			Parcelable parcelable1 = (Parcelable)((SparseArray) (parcelable)).get(k1);
	//   42   79:aload_1         
	//   43   80:iload           4
	//   44   82:invokevirtual   #1064 <Method Object SparseArray.get(int)>
	//   45   85:checkcast       #1066 <Class Parcelable>
	//   46   88:astore          7
			if(parcelable1 != null)
	//*  47   90:aload           7
	//*  48   92:ifnull          105
				aj1.a(this, view, parcelable1);
	//   49   95:aload           6
	//   50   97:aload_0         
	//   51   98:aload           5
	//   52  100:aload           7
	//   53  102:invokevirtual   #1069 <Method void android.support.design.widget.aj.a(CoordinatorLayout, View, Parcelable)>
		}

	//   54  105:iload_2         
	//   55  106:iconst_1        
	//   56  107:iadd            
	//   57  108:istore_2        
	//*  58  109:goto            38
	//   59  112:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #1049 <Class CoordinatorLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1072 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1074 <Method void CoordinatorLayout$SavedState(Parcelable)>
	//    5   11:astore          4
		SparseArray sparsearray = new SparseArray();
	//    6   13:new             #1063 <Class SparseArray>
	//    7   16:dup             
	//    8   17:invokespecial   #1075 <Method void SparseArray()>
	//    9   20:astore          5
		int j1 = getChildCount();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #467 <Method int getChildCount()>
	//   12   26:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:iload_2         
	//*  17   31:icmpge          100
		{
			Object obj = ((Object) (getChildAt(i1)));
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:invokevirtual   #474 <Method View getChildAt(int)>
	//   21   39:astore          6
			int k1 = ((View) (obj)).getId();
	//   22   41:aload           6
	//   23   43:invokevirtual   #1061 <Method int View.getId()>
	//   24   46:istore_3        
			aj aj1 = ((am)((View) (obj)).getLayoutParams()).b();
	//   25   47:aload           6
	//   26   49:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   52:checkcast       #313 <Class am>
	//   28   55:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   29   58:astore          7
			if(k1 == -1 || aj1 == null)
				continue;
	//   30   60:iload_3         
	//   31   61:iconst_m1       
	//   32   62:icmpeq          93
	//   33   65:aload           7
	//   34   67:ifnull          93
			obj = ((Object) (aj1.b(this, ((View) (obj)))));
	//   35   70:aload           7
	//   36   72:aload_0         
	//   37   73:aload           6
	//   38   75:invokevirtual   #1078 <Method Parcelable android.support.design.widget.aj.b(CoordinatorLayout, View)>
	//   39   78:astore          6
			if(obj != null)
	//*  40   80:aload           6
	//*  41   82:ifnull          93
				sparsearray.append(k1, obj);
	//   42   85:aload           5
	//   43   87:iload_3         
	//   44   88:aload           6
	//   45   90:invokevirtual   #1081 <Method void SparseArray.append(int, Object)>
		}

	//   46   93:iload_1         
	//   47   94:iconst_1        
	//   48   95:iadd            
	//   49   96:istore_1        
	//*  50   97:goto            29
		savedstate.a = sparsearray;
	//   51  100:aload           4
	//   52  102:aload           5
	//   53  104:putfield        #1058 <Field SparseArray android.support.design.widget.CoordinatorLayout$SavedState.a>
		return ((Parcelable) (savedstate));
	//   54  107:aload           4
	//   55  109:areturn         
	}

	public boolean onStartNestedScroll(View view, View view1, int i1)
	{
		return a(view, view1, i1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #1085 <Method boolean a(View, View, int, int)>
	//    6    8:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		c(view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #1087 <Method void c(View, int)>
	//    4    6:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i1;
		boolean flag;
		boolean flag1;
label0:
		{
			i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #511 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
			if(p == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #505 <Field View p>
	//*   5    9:ifnonnull       33
			{
				flag1 = a(motionevent, 1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:invokespecial   #986 <Method boolean a(MotionEvent, int)>
	//   10   18:istore          4
				if(!flag1)
	//*  11   20:iload           4
	//*  12   22:ifeq            28
	//*  13   25:goto            36
				{
					flag = false;
	//   14   28:iconst_0        
	//   15   29:istore_3        
					break label0;
	//   16   30:goto            73
				}
			} else
			{
				flag1 = false;
	//   17   33:iconst_0        
	//   18   34:istore          4
			}
			aj aj1 = ((am)p.getLayoutParams()).b();
	//   19   36:aload_0         
	//   20   37:getfield        #505 <Field View p>
	//   21   40:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   43:checkcast       #313 <Class am>
	//   23   46:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//   24   49:astore          8
			if(aj1 != null)
	//*  25   51:aload           8
	//*  26   53:ifnull          71
				flag = aj1.a(this, p, motionevent);
	//   27   56:aload           8
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:getfield        #505 <Field View p>
	//   31   63:aload_1         
	//   32   64:invokevirtual   #500 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, MotionEvent)>
	//   33   67:istore_3        
			else
	//*  34   68:goto            73
				flag = false;
	//   35   71:iconst_0        
	//   36   72:istore_3        
		}
		View view = p;
	//   37   73:aload_0         
	//   38   74:getfield        #505 <Field View p>
	//   39   77:astore          9
		Object obj = null;
	//   40   79:aconst_null     
	//   41   80:astore          8
		boolean flag2;
		if(view == null)
	//*  42   82:aload           9
	//*  43   84:ifnonnull       102
		{
			flag2 = flag | super.onTouchEvent(motionevent);
	//   44   87:iload_3         
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokespecial   #1090 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   48   93:ior             
	//   49   94:istore          5
			motionevent = ((MotionEvent) (obj));
	//   50   96:aload           8
	//   51   98:astore_1        
		} else
	//*  52   99:goto            139
		{
			flag2 = flag;
	//   53  102:iload_3         
	//   54  103:istore          5
			motionevent = ((MotionEvent) (obj));
	//   55  105:aload           8
	//   56  107:astore_1        
			if(flag1)
	//*  57  108:iload           4
	//*  58  110:ifeq            139
			{
				long l1 = SystemClock.uptimeMillis();
	//   59  113:invokestatic    #489 <Method long SystemClock.uptimeMillis()>
	//   60  116:lstore          6
				motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
	//   61  118:lload           6
	//   62  120:lload           6
	//   63  122:iconst_3        
	//   64  123:fconst_0        
	//   65  124:fconst_0        
	//   66  125:iconst_0        
	//   67  126:invokestatic    #495 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   68  129:astore_1        
				super.onTouchEvent(motionevent);
	//   69  130:aload_0         
	//   70  131:aload_1         
	//   71  132:invokespecial   #1090 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   72  135:pop             
				flag2 = flag;
	//   73  136:iload_3         
	//   74  137:istore          5
			}
		}
		if(motionevent != null)
	//*  75  139:aload_1         
	//*  76  140:ifnull          147
			motionevent.recycle();
	//   77  143:aload_1         
	//   78  144:invokevirtual   #501 <Method void MotionEvent.recycle()>
		if(i1 == 1 || i1 == 3)
	//*  79  147:iload_2         
	//*  80  148:iconst_1        
	//*  81  149:icmpeq          157
	//*  82  152:iload_2         
	//*  83  153:iconst_3        
	//*  84  154:icmpne          162
			a(false);
	//   85  157:aload_0         
	//   86  158:iconst_0        
	//   87  159:invokespecial   #964 <Method void a(boolean)>
		return flag2;
	//   88  162:iload           5
	//   89  164:ireturn         
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		aj aj1 = ((am)view.getLayoutParams()).b();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #313 <Class am>
	//    3    7:invokevirtual   #393 <Method aj android.support.design.widget.am.b()>
	//    4   10:astore          4
		if(aj1 != null && aj1.a(this, view, rect, flag))
	//*   5   12:aload           4
	//*   6   14:ifnull          31
	//*   7   17:aload           4
	//*   8   19:aload_0         
	//*   9   20:aload_1         
	//*  10   21:aload_2         
	//*  11   22:iload_3         
	//*  12   23:invokevirtual   #1095 <Method boolean android.support.design.widget.aj.a(CoordinatorLayout, View, Rect, boolean)>
	//*  13   26:ifeq            31
			return true;
	//   14   29:iconst_1        
	//   15   30:ireturn         
		else
			return super.requestChildRectangleOnScreen(view, rect, flag);
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:iload_3         
	//   20   35:invokespecial   #1097 <Method boolean ViewGroup.requestChildRectangleOnScreen(View, Rect, boolean)>
	//   21   38:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1100 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		if(flag && !m)
	//*   3    5:iload_1         
	//*   4    6:ifeq            26
	//*   5    9:aload_0         
	//*   6   10:getfield        #507 <Field boolean m>
	//*   7   13:ifne            26
		{
			a(false);
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokespecial   #964 <Method void a(boolean)>
			m = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #507 <Field boolean m>
		}
	//   14   26:return          
	}

	public void setFitsSystemWindows(boolean flag)
	{
		super.setFitsSystemWindows(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1103 <Method void ViewGroup.setFitsSystemWindows(boolean)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #187 <Method void g()>
	//    5    9:return          
	}

	public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener)
	{
		e = onhierarchychangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1105 <Field android.view.ViewGroup$OnHierarchyChangeListener e>
	//    3    5:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		Drawable drawable2 = v;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field Drawable v>
	//    2    4:astore          4
		if(drawable2 != drawable)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       117
		{
			Drawable drawable1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_3        
			if(drawable2 != null)
	//*   8   14:aload           4
	//*   9   16:ifnull          25
				drawable2.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   10   19:aload           4
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #1111 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          34
				drawable1 = drawable.mutate();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #1114 <Method Drawable Drawable.mutate()>
	//   17   33:astore_3        
			v = drawable1;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:putfield        #182 <Field Drawable v>
			drawable = v;
	//   21   39:aload_0         
	//   22   40:getfield        #182 <Field Drawable v>
	//   23   43:astore_1        
			if(drawable != null)
	//*  24   44:aload_1         
	//*  25   45:ifnull          113
			{
				if(drawable.isStateful())
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #925 <Method boolean Drawable.isStateful()>
	//*  28   52:ifeq            67
					v.setState(getDrawableState());
	//   29   55:aload_0         
	//   30   56:getfield        #182 <Field Drawable v>
	//   31   59:aload_0         
	//   32   60:invokevirtual   #920 <Method int[] getDrawableState()>
	//   33   63:invokevirtual   #929 <Method boolean Drawable.setState(int[])>
	//   34   66:pop             
				android.support.v4.graphics.drawable.a.b(v, ac.f(((View) (this))));
	//   35   67:aload_0         
	//   36   68:getfield        #182 <Field Drawable v>
	//   37   71:aload_0         
	//   38   72:invokestatic    #714 <Method int ac.f(View)>
	//   39   75:invokestatic    #1119 <Method boolean a.b(Drawable, int)>
	//   40   78:pop             
				drawable = v;
	//   41   79:aload_0         
	//   42   80:getfield        #182 <Field Drawable v>
	//   43   83:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  44   84:aload_0         
	//*  45   85:invokevirtual   #1120 <Method int getVisibility()>
	//*  46   88:ifne            96
					flag = true;
	//   47   91:iconst_1        
	//   48   92:istore_2        
				else
	//*  49   93:goto            98
					flag = false;
	//   50   96:iconst_0        
	//   51   97:istore_2        
				drawable.setVisible(flag, false);
	//   52   98:aload_1         
	//   53   99:iload_2         
	//   54  100:iconst_0        
	//   55  101:invokevirtual   #1124 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   56  104:pop             
				v.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   57  105:aload_0         
	//   58  106:getfield        #182 <Field Drawable v>
	//   59  109:aload_0         
	//   60  110:invokevirtual   #1111 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			}
			ac.d(((View) (this)));
	//   61  113:aload_0         
	//   62  114:invokestatic    #1126 <Method void ac.d(View)>
		}
	//   63  117:return          
	}

	public void setStatusBarBackgroundColor(int i1)
	{
		setStatusBarBackground(((Drawable) (new ColorDrawable(i1))));
	//    0    0:aload_0         
	//    1    1:new             #1129 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #1130 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #1132 <Method void setStatusBarBackground(Drawable)>
	//    6   12:return          
	}

	public void setStatusBarBackgroundResource(int i1)
	{
		Drawable drawable;
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = android.support.v4.a.c.a(getContext(), i1);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #630 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1138 <Method Drawable android.support.v4.a.c.a(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setStatusBarBackground(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1132 <Method void setStatusBarBackground(Drawable)>
	//   13   23:return          
	}

	public void setVisibility(int i1)
	{
		super.setVisibility(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1141 <Method void ViewGroup.setVisibility(int)>
		boolean flag;
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		Drawable drawable = v;
	//   10   16:aload_0         
	//   11   17:getfield        #182 <Field Drawable v>
	//   12   20:astore_3        
		if(drawable != null && drawable.isVisible() != flag)
	//*  13   21:aload_3         
	//*  14   22:ifnull          43
	//*  15   25:aload_3         
	//*  16   26:invokevirtual   #1144 <Method boolean Drawable.isVisible()>
	//*  17   29:iload_2         
	//*  18   30:icmpeq          43
			v.setVisible(flag, false);
	//   19   33:aload_0         
	//   20   34:getfield        #182 <Field Drawable v>
	//   21   37:iload_2         
	//   22   38:iconst_0        
	//   23   39:invokevirtual   #1124 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   24   42:pop             
	//   25   43:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == v;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1148 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #182 <Field Drawable v>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	static final String a;
	static final Class b[] = {
		android/content/Context, android/util/AttributeSet
	};
	static final ThreadLocal c = new ThreadLocal();
	static final Comparator d;
	private static final s f = new u(12);
	android.view.ViewGroup.OnHierarchyChangeListener e;
	private final List g;
	private final k h;
	private final List i;
	private final List j;
	private final int k[];
	private Paint l;
	private boolean m;
	private boolean n;
	private int o[];
	private View p;
	private View q;
	private an r;
	private boolean s;
	private bb t;
	private boolean u;
	private Drawable v;
	private y w;
	private final x x;

	static 
	{
		Object obj = ((Object) (((Class) (android/support/design/widget/CoordinatorLayout)).getPackage()));
	//    0    0:ldc1            #2   <Class CoordinatorLayout>
	//    1    2:invokevirtual   #55  <Method Package Class.getPackage()>
	//    2    5:astore_0        
		if(obj != null)
	//*   3    6:aload_0         
	//*   4    7:ifnull          18
			obj = ((Object) (((Package) (obj)).getName()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #61  <Method String Package.getName()>
	//    7   14:astore_0        
		else
	//*   8   15:goto            20
			obj = null;
	//    9   18:aconst_null     
	//   10   19:astore_0        
		a = ((String) (obj));
	//   11   20:aload_0         
	//   12   21:putstatic       #63  <Field String a>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  13   24:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   27:bipush          21
	//*  15   29:icmplt          45
			d = ((Comparator) (new android.support.design.widget.ap()));
	//   16   32:new             #71  <Class android.support.design.widget.ap>
	//   17   35:dup             
	//   18   36:invokespecial   #74  <Method void android.support.design.widget.ap()>
	//   19   39:putstatic       #76  <Field Comparator d>
		else
	//*  20   42:goto            49
			d = null;
	//   21   45:aconst_null     
	//   22   46:putstatic       #76  <Field Comparator d>
	//   23   49:iconst_2        
	//   24   50:anewarray       Class[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:ldc1            #78  <Class Context>
	//   28   57:aastore         
	//   29   58:dup             
	//   30   59:iconst_1        
	//   31   60:ldc1            #80  <Class AttributeSet>
	//   32   62:aastore         
	//   33   63:putstatic       #82  <Field Class[] b>
	//   34   66:new             #84  <Class ThreadLocal>
	//   35   69:dup             
	//   36   70:invokespecial   #85  <Method void ThreadLocal()>
	//   37   73:putstatic       #87  <Field ThreadLocal c>
	//   38   76:new             #89  <Class u>
	//   39   79:dup             
	//   40   80:bipush          12
	//   41   82:invokespecial   #92  <Method void u(int)>
	//   42   85:putstatic       #94  <Field s f>
	//*  43   88:return          
	}

	private class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #53  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			SparseArray sparsearray = a;
		//    4    6:aload_0         
		//    5    7:getfield        #42  <Field SparseArray a>
		//    6   10:astore          5
			int k1 = 0;
		//    7   12:iconst_0        
		//    8   13:istore          4
			int j1;
			if(sparsearray != null)
		//*   9   15:aload           5
		//*  10   17:ifnull          29
				j1 = sparsearray.size();
		//   11   20:aload           5
		//   12   22:invokevirtual   #56  <Method int SparseArray.size()>
		//   13   25:istore_3        
			else
		//*  14   26:goto            31
				j1 = 0;
		//   15   29:iconst_0        
		//   16   30:istore_3        
			parcel.writeInt(j1);
		//   17   31:aload_1         
		//   18   32:iload_3         
		//   19   33:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			int ai1[] = new int[j1];
		//   20   36:iload_3         
		//   21   37:newarray        int[]
		//   22   39:astore          5
			Parcelable aparcelable[] = new Parcelable[j1];
		//   23   41:iload_3         
		//   24   42:anewarray       Parcelable[]
		//   25   45:astore          6
			for(; k1 < j1; k1++)
		//*  26   47:iload           4
		//*  27   49:iload_3         
		//*  28   50:icmpge          93
			{
				ai1[k1] = a.keyAt(k1);
		//   29   53:aload           5
		//   30   55:iload           4
		//   31   57:aload_0         
		//   32   58:getfield        #42  <Field SparseArray a>
		//   33   61:iload           4
		//   34   63:invokevirtual   #65  <Method int SparseArray.keyAt(int)>
		//   35   66:iastore         
				aparcelable[k1] = (Parcelable)a.valueAt(k1);
		//   36   67:aload           6
		//   37   69:iload           4
		//   38   71:aload_0         
		//   39   72:getfield        #42  <Field SparseArray a>
		//   40   75:iload           4
		//   41   77:invokevirtual   #69  <Method Object SparseArray.valueAt(int)>
		//   42   80:checkcast       #61  <Class Parcelable>
		//   43   83:aastore         
			}

		//   44   84:iload           4
		//   45   86:iconst_1        
		//   46   87:iadd            
		//   47   88:istore          4
		//*  48   90:goto            47
			parcel.writeIntArray(ai1);
		//   49   93:aload_1         
		//   50   94:aload           5
		//   51   96:invokevirtual   #72  <Method void Parcel.writeIntArray(int[])>
			parcel.writeParcelableArray(aparcelable, i1);
		//   52   99:aload_1         
		//   53  100:aload           6
		//   54  102:iload_2         
		//   55  103:invokevirtual   #76  <Method void Parcel.writeParcelableArray(Parcelable[], int)>
		//   56  106:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new ao();
		SparseArray a;

		static 
		{
		//    0    0:new             #12  <Class ao>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void ao()>
		//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
			int j1 = parcel.readInt();
		//    4    6:aload_1         
		//    5    7:invokevirtual   #27  <Method int Parcel.readInt()>
		//    6   10:istore          4
			int ai1[] = new int[j1];
		//    7   12:iload           4
		//    8   14:newarray        int[]
		//    9   16:astore          5
			parcel.readIntArray(ai1);
		//   10   18:aload_1         
		//   11   19:aload           5
		//   12   21:invokevirtual   #31  <Method void Parcel.readIntArray(int[])>
			parcel = ((Parcel) (parcel.readParcelableArray(classloader)));
		//   13   24:aload_1         
		//   14   25:aload_2         
		//   15   26:invokevirtual   #35  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
		//   16   29:astore_1        
			a = new SparseArray(j1);
		//   17   30:aload_0         
		//   18   31:new             #37  <Class SparseArray>
		//   19   34:dup             
		//   20   35:iload           4
		//   21   37:invokespecial   #40  <Method void SparseArray(int)>
		//   22   40:putfield        #42  <Field SparseArray a>
			for(int i1 = 0; i1 < j1; i1++)
		//*  23   43:iconst_0        
		//*  24   44:istore_3        
		//*  25   45:iload_3         
		//*  26   46:iload           4
		//*  27   48:icmpge          72
				a.append(ai1[i1], ((Object) (parcel[i1])));
		//   28   51:aload_0         
		//   29   52:getfield        #42  <Field SparseArray a>
		//   30   55:aload           5
		//   31   57:iload_3         
		//   32   58:iaload          
		//   33   59:aload_1         
		//   34   60:iload_3         
		//   35   61:aaload          
		//   36   62:invokevirtual   #46  <Method void SparseArray.append(int, Object)>

		//   37   65:iload_3         
		//   38   66:iconst_1        
		//   39   67:iadd            
		//   40   68:istore_3        
		//*  41   69:goto            45
		//   42   72:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #49  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

}
