// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.a.h;
import android.support.design.c;
import android.support.design.d.a;
import android.support.design.e;
import android.support.design.internal.u;
import android.support.design.internal.v;
import android.support.design.k;
import android.support.design.l;
import android.support.design.stateful.ExtendableSavedState;
import android.support.v4.g.w;
import android.support.v4.view.ab;
import android.support.v4.view.ac;
import android.support.v4.widget.ak;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

// Referenced classes of package android.support.design.widget:
//			cl, aw, at, bg, 
//			av, au, bd

public class FloatingActionButton extends cl
	implements a, ab, ak
{

	public FloatingActionButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, c.floatingActionButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #43  <Field int c.floatingActionButtonStyle>
	//    4    6:invokespecial   #46  <Method void FloatingActionButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public FloatingActionButton(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #48  <Method void cl(Context, AttributeSet, int)>
		b = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #50  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #53  <Method void Rect()>
	//    9   15:putfield        #55  <Field Rect b>
		m = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #50  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #53  <Method void Rect()>
	//   14   26:putfield        #57  <Field Rect m>
		TypedArray typedarray = u.a(context, attributeset, l.FloatingActionButton, i1, k.Widget_Design_FloatingActionButton, new int[0]);
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:getstatic       #63  <Field int[] l.FloatingActionButton>
	//   18   34:iload_3         
	//   19   35:getstatic       #68  <Field int k.Widget_Design_FloatingActionButton>
	//   20   38:iconst_0        
	//   21   39:newarray        int[]
	//   22   41:invokestatic    #73  <Method TypedArray u.a(Context, AttributeSet, int[], int, int, int[])>
	//   23   44:astore          7
		c = android.support.design.e.a.a(context, typedarray, l.FloatingActionButton_backgroundTint);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:aload           7
	//   27   50:getstatic       #76  <Field int l.FloatingActionButton_backgroundTint>
	//   28   53:invokestatic    #81  <Method ColorStateList android.support.design.e.a.a(Context, TypedArray, int)>
	//   29   56:putfield        #83  <Field ColorStateList c>
		d = v.a(typedarray.getInt(l.FloatingActionButton_backgroundTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//   30   59:aload_0         
	//   31   60:aload           7
	//   32   62:getstatic       #86  <Field int l.FloatingActionButton_backgroundTintMode>
	//   33   65:iconst_m1       
	//   34   66:invokevirtual   #92  <Method int TypedArray.getInt(int, int)>
	//   35   69:aconst_null     
	//   36   70:invokestatic    #97  <Method android.graphics.PorterDuff$Mode v.a(int, android.graphics.PorterDuff$Mode)>
	//   37   73:putfield        #99  <Field android.graphics.PorterDuff$Mode d>
		h = android.support.design.e.a.a(context, typedarray, l.FloatingActionButton_rippleColor);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:aload           7
	//   41   80:getstatic       #102 <Field int l.FloatingActionButton_rippleColor>
	//   42   83:invokestatic    #81  <Method ColorStateList android.support.design.e.a.a(Context, TypedArray, int)>
	//   43   86:putfield        #104 <Field ColorStateList h>
		i = typedarray.getInt(l.FloatingActionButton_fabSize, -1);
	//   44   89:aload_0         
	//   45   90:aload           7
	//   46   92:getstatic       #107 <Field int l.FloatingActionButton_fabSize>
	//   47   95:iconst_m1       
	//   48   96:invokevirtual   #92  <Method int TypedArray.getInt(int, int)>
	//   49   99:putfield        #109 <Field int i>
		j = typedarray.getDimensionPixelSize(l.FloatingActionButton_fabCustomSize, 0);
	//   50  102:aload_0         
	//   51  103:aload           7
	//   52  105:getstatic       #112 <Field int l.FloatingActionButton_fabCustomSize>
	//   53  108:iconst_0        
	//   54  109:invokevirtual   #115 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   55  112:putfield        #117 <Field int j>
		g = typedarray.getDimensionPixelSize(l.FloatingActionButton_borderWidth, 0);
	//   56  115:aload_0         
	//   57  116:aload           7
	//   58  118:getstatic       #120 <Field int l.FloatingActionButton_borderWidth>
	//   59  121:iconst_0        
	//   60  122:invokevirtual   #115 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   61  125:putfield        #122 <Field int g>
		float f1 = typedarray.getDimension(l.FloatingActionButton_elevation, 0.0F);
	//   62  128:aload           7
	//   63  130:getstatic       #125 <Field int l.FloatingActionButton_elevation>
	//   64  133:fconst_0        
	//   65  134:invokevirtual   #129 <Method float TypedArray.getDimension(int, float)>
	//   66  137:fstore          4
		float f2 = typedarray.getDimension(l.FloatingActionButton_hoveredFocusedTranslationZ, 0.0F);
	//   67  139:aload           7
	//   68  141:getstatic       #132 <Field int l.FloatingActionButton_hoveredFocusedTranslationZ>
	//   69  144:fconst_0        
	//   70  145:invokevirtual   #129 <Method float TypedArray.getDimension(int, float)>
	//   71  148:fstore          5
		float f3 = typedarray.getDimension(l.FloatingActionButton_pressedTranslationZ, 0.0F);
	//   72  150:aload           7
	//   73  152:getstatic       #135 <Field int l.FloatingActionButton_pressedTranslationZ>
	//   74  155:fconst_0        
	//   75  156:invokevirtual   #129 <Method float TypedArray.getDimension(int, float)>
	//   76  159:fstore          6
		a = typedarray.getBoolean(l.FloatingActionButton_useCompatPadding, false);
	//   77  161:aload_0         
	//   78  162:aload           7
	//   79  164:getstatic       #138 <Field int l.FloatingActionButton_useCompatPadding>
	//   80  167:iconst_0        
	//   81  168:invokevirtual   #142 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   82  171:putfield        #144 <Field boolean a>
		l = typedarray.getDimensionPixelSize(l.FloatingActionButton_maxImageSize, 0);
	//   83  174:aload_0         
	//   84  175:aload           7
	//   85  177:getstatic       #147 <Field int l.FloatingActionButton_maxImageSize>
	//   86  180:iconst_0        
	//   87  181:invokevirtual   #115 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   88  184:putfield        #149 <Field int l>
		h h1 = android.support.design.a.h.a(context, typedarray, l.FloatingActionButton_showMotionSpec);
	//   89  187:aload_1         
	//   90  188:aload           7
	//   91  190:getstatic       #152 <Field int l.FloatingActionButton_showMotionSpec>
	//   92  193:invokestatic    #157 <Method h h.a(Context, TypedArray, int)>
	//   93  196:astore          8
		context = ((Context) (android.support.design.a.h.a(context, typedarray, l.FloatingActionButton_hideMotionSpec)));
	//   94  198:aload_1         
	//   95  199:aload           7
	//   96  201:getstatic       #160 <Field int l.FloatingActionButton_hideMotionSpec>
	//   97  204:invokestatic    #157 <Method h h.a(Context, TypedArray, int)>
	//   98  207:astore_1        
		typedarray.recycle();
	//   99  208:aload           7
	//  100  210:invokevirtual   #163 <Method void TypedArray.recycle()>
		n = new AppCompatImageHelper(((android.widget.ImageView) (this)));
	//  101  213:aload_0         
	//  102  214:new             #165 <Class AppCompatImageHelper>
	//  103  217:dup             
	//  104  218:aload_0         
	//  105  219:invokespecial   #168 <Method void AppCompatImageHelper(android.widget.ImageView)>
	//  106  222:putfield        #170 <Field AppCompatImageHelper n>
		n.loadFromAttributes(attributeset, i1);
	//  107  225:aload_0         
	//  108  226:getfield        #170 <Field AppCompatImageHelper n>
	//  109  229:aload_2         
	//  110  230:iload_3         
	//  111  231:invokevirtual   #174 <Method void AppCompatImageHelper.loadFromAttributes(AttributeSet, int)>
		o = new android.support.design.d.c(((android.support.design.d.b) (this)));
	//  112  234:aload_0         
	//  113  235:new             #176 <Class android.support.design.d.c>
	//  114  238:dup             
	//  115  239:aload_0         
	//  116  240:invokespecial   #179 <Method void android.support.design.d.c(android.support.design.d.b)>
	//  117  243:putfield        #181 <Field android.support.design.d.c o>
		getImpl().a(c, d, h, g);
	//  118  246:aload_0         
	//  119  247:invokespecial   #185 <Method aw getImpl()>
	//  120  250:aload_0         
	//  121  251:getfield        #83  <Field ColorStateList c>
	//  122  254:aload_0         
	//  123  255:getfield        #99  <Field android.graphics.PorterDuff$Mode d>
	//  124  258:aload_0         
	//  125  259:getfield        #104 <Field ColorStateList h>
	//  126  262:aload_0         
	//  127  263:getfield        #122 <Field int g>
	//  128  266:invokevirtual   #190 <Method void android.support.design.widget.aw.a(ColorStateList, android.graphics.PorterDuff$Mode, ColorStateList, int)>
		getImpl().a(f1);
	//  129  269:aload_0         
	//  130  270:invokespecial   #185 <Method aw getImpl()>
	//  131  273:fload           4
	//  132  275:invokevirtual   #193 <Method void android.support.design.widget.aw.a(float)>
		getImpl().b(f2);
	//  133  278:aload_0         
	//  134  279:invokespecial   #185 <Method aw getImpl()>
	//  135  282:fload           5
	//  136  284:invokevirtual   #195 <Method void aw.b(float)>
		getImpl().c(f3);
	//  137  287:aload_0         
	//  138  288:invokespecial   #185 <Method aw getImpl()>
	//  139  291:fload           6
	//  140  293:invokevirtual   #197 <Method void android.support.design.widget.aw.c(float)>
		getImpl().a(l);
	//  141  296:aload_0         
	//  142  297:invokespecial   #185 <Method aw getImpl()>
	//  143  300:aload_0         
	//  144  301:getfield        #149 <Field int l>
	//  145  304:invokevirtual   #200 <Method void android.support.design.widget.aw.a(int)>
		getImpl().a(h1);
	//  146  307:aload_0         
	//  147  308:invokespecial   #185 <Method aw getImpl()>
	//  148  311:aload           8
	//  149  313:invokevirtual   #203 <Method void android.support.design.widget.aw.a(h)>
		getImpl().b(((h) (context)));
	//  150  316:aload_0         
	//  151  317:invokespecial   #185 <Method aw getImpl()>
	//  152  320:aload_1         
	//  153  321:invokevirtual   #205 <Method void aw.b(h)>
		setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//  154  324:aload_0         
	//  155  325:getstatic       #211 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//  156  328:invokevirtual   #215 <Method void setScaleType(android.widget.ImageView$ScaleType)>
	//  157  331:return          
	}

	private int a(int i1)
	{
		int j1 = j;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int j>
	//    2    4:istore_2        
		if(j1 != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            11
			return j1;
	//    5    9:iload_2         
	//    6   10:ireturn         
		Resources resources = getResources();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #220 <Method Resources getResources()>
	//    9   15:astore_3        
		if(i1 != -1)
	//*  10   16:iload_1         
	//*  11   17:iconst_m1       
	//*  12   18:icmpeq          42
			if(i1 != 1)
	//*  13   21:iload_1         
	//*  14   22:iconst_1        
	//*  15   23:icmpeq          34
				return resources.getDimensionPixelSize(e.design_fab_size_normal);
	//   16   26:aload_3         
	//   17   27:getstatic       #225 <Field int e.design_fab_size_normal>
	//   18   30:invokevirtual   #229 <Method int Resources.getDimensionPixelSize(int)>
	//   19   33:ireturn         
			else
				return resources.getDimensionPixelSize(e.design_fab_size_mini);
	//   20   34:aload_3         
	//   21   35:getstatic       #232 <Field int e.design_fab_size_mini>
	//   22   38:invokevirtual   #229 <Method int Resources.getDimensionPixelSize(int)>
	//   23   41:ireturn         
		if(Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470)
	//*  24   42:aload_3         
	//*  25   43:invokevirtual   #236 <Method Configuration Resources.getConfiguration()>
	//*  26   46:getfield        #241 <Field int Configuration.screenWidthDp>
	//*  27   49:aload_3         
	//*  28   50:invokevirtual   #236 <Method Configuration Resources.getConfiguration()>
	//*  29   53:getfield        #244 <Field int Configuration.screenHeightDp>
	//*  30   56:invokestatic    #249 <Method int Math.max(int, int)>
	//*  31   59:sipush          470
	//*  32   62:icmpge          71
			return a(1);
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:invokespecial   #251 <Method int a(int)>
	//   36   70:ireturn         
		else
			return a(0);
	//   37   71:aload_0         
	//   38   72:iconst_0        
	//   39   73:invokespecial   #251 <Method int a(int)>
	//   40   76:ireturn         
	}

	private static int a(int i1, int j1)
	{
		int k1 = android.view.View.MeasureSpec.getMode(j1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #256 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
		j1 = android.view.View.MeasureSpec.getSize(j1);
	//    3    5:iload_1         
	//    4    6:invokestatic    #259 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_1        
		if(k1 != 0x80000000)
	//*   6   10:iload_2         
	//*   7   11:ldc2            #260 <Int 0x80000000>
	//*   8   14:icmpeq          38
		{
			if(k1 != 0)
	//*   9   17:iload_2         
	//*  10   18:ifeq            44
				if(k1 == 0x40000000)
	//*  11   21:iload_2         
	//*  12   22:ldc2            #261 <Int 0x40000000>
	//*  13   25:icmpne          30
					return j1;
	//   14   28:iload_1         
	//   15   29:ireturn         
				else
					throw new IllegalArgumentException();
	//   16   30:new             #263 <Class IllegalArgumentException>
	//   17   33:dup             
	//   18   34:invokespecial   #264 <Method void IllegalArgumentException()>
	//   19   37:athrow          
		} else
		{
			i1 = Math.min(i1, j1);
	//   20   38:iload_0         
	//   21   39:iload_1         
	//   22   40:invokestatic    #267 <Method int Math.min(int, int)>
	//   23   43:istore_0        
		}
		return i1;
	//   24   44:iload_0         
	//   25   45:ireturn         
	}

	static int a(FloatingActionButton floatingactionbutton)
	{
		return floatingactionbutton.k;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field int k>
	//    2    4:ireturn         
	}

	private bd a(au au)
	{
		if(au == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((bd) (new at(this, au)));
	//    4    6:new             #273 <Class at>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #276 <Method void at(FloatingActionButton, au)>
	//    9   15:areturn         
	}

	static void a(FloatingActionButton floatingactionbutton, Drawable drawable)
	{
		((cl) (floatingactionbutton)).cl.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #281 <Method void cl.setBackgroundDrawable(Drawable)>
	//    3    5:return          
	}

	private void c()
	{
		Drawable drawable = getDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method Drawable getDrawable()>
	//    2    4:astore          4
		if(drawable == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		Object obj = ((Object) (e));
	//    6   12:aload_0         
	//    7   13:getfield        #287 <Field ColorStateList e>
	//    8   16:astore_2        
		if(obj == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       27
		{
			android.support.v4.graphics.drawable.a.f(drawable);
	//   11   21:aload           4
	//   12   23:invokestatic    #291 <Method void android.support.v4.graphics.drawable.a.f(Drawable)>
			return;
	//   13   26:return          
		}
		int i1 = ((ColorStateList) (obj)).getColorForState(getDrawableState(), 0);
	//   14   27:aload_2         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #295 <Method int[] getDrawableState()>
	//   17   32:iconst_0        
	//   18   33:invokevirtual   #301 <Method int ColorStateList.getColorForState(int[], int)>
	//   19   36:istore_1        
		android.graphics.PorterDuff.Mode mode = f;
	//   20   37:aload_0         
	//   21   38:getfield        #303 <Field android.graphics.PorterDuff$Mode f>
	//   22   41:astore_3        
		obj = ((Object) (mode));
	//   23   42:aload_3         
	//   24   43:astore_2        
		if(mode == null)
	//*  25   44:aload_3         
	//*  26   45:ifnonnull       52
			obj = ((Object) (android.graphics.PorterDuff.Mode.SRC_IN));
	//   27   48:getstatic       #308 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   28   51:astore_2        
		drawable.mutate().setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(i1, ((android.graphics.PorterDuff.Mode) (obj))))));
	//   29   52:aload           4
	//   30   54:invokevirtual   #313 <Method Drawable Drawable.mutate()>
	//   31   57:iload_1         
	//   32   58:aload_2         
	//   33   59:invokestatic    #319 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   34   62:invokevirtual   #323 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//   35   65:return          
	}

	private void c(Rect rect)
	{
		rect.left = rect.left + b.left;
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:getfield        #327 <Field int Rect.left>
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field Rect b>
	//    5    9:getfield        #327 <Field int Rect.left>
	//    6   12:iadd            
	//    7   13:putfield        #327 <Field int Rect.left>
		rect.top = rect.top + b.top;
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #330 <Field int Rect.top>
	//   11   21:aload_0         
	//   12   22:getfield        #55  <Field Rect b>
	//   13   25:getfield        #330 <Field int Rect.top>
	//   14   28:iadd            
	//   15   29:putfield        #330 <Field int Rect.top>
		rect.right = rect.right - b.right;
	//   16   32:aload_1         
	//   17   33:aload_1         
	//   18   34:getfield        #333 <Field int Rect.right>
	//   19   37:aload_0         
	//   20   38:getfield        #55  <Field Rect b>
	//   21   41:getfield        #333 <Field int Rect.right>
	//   22   44:isub            
	//   23   45:putfield        #333 <Field int Rect.right>
		rect.bottom = rect.bottom - b.bottom;
	//   24   48:aload_1         
	//   25   49:aload_1         
	//   26   50:getfield        #336 <Field int Rect.bottom>
	//   27   53:aload_0         
	//   28   54:getfield        #55  <Field Rect b>
	//   29   57:getfield        #336 <Field int Rect.bottom>
	//   30   60:isub            
	//   31   61:putfield        #336 <Field int Rect.bottom>
	//   32   64:return          
	}

	private aw d()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #341 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          25
			return ((aw) (new bg(((cl) (this)), ((br) (new av(this))))));
	//    3    8:new             #343 <Class bg>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:new             #345 <Class av>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #348 <Method void av(FloatingActionButton)>
	//   10   21:invokespecial   #351 <Method void bg(cl, br)>
	//   11   24:areturn         
		else
			return new aw(((cl) (this)), ((br) (new av(this))));
	//   12   25:new             #187 <Class aw>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:new             #345 <Class av>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:invokespecial   #348 <Method void av(FloatingActionButton)>
	//   19   38:invokespecial   #352 <Method void aw(cl, br)>
	//   20   41:areturn         
	}

	private aw getImpl()
	{
		if(p == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #354 <Field aw p>
	//*   2    4:ifnonnull       15
			p = d();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #356 <Method aw d()>
	//    6   12:putfield        #354 <Field aw p>
		return p;
	//    7   15:aload_0         
	//    8   16:getfield        #354 <Field aw p>
	//    9   19:areturn         
	}

	public void a(android.animation.Animator.AnimatorListener animatorlistener)
	{
		getImpl().a(animatorlistener);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #359 <Method void android.support.design.widget.aw.a(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	void a(au au, boolean flag)
	{
		getImpl().b(a(au), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #362 <Method bd a(au)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #365 <Method void aw.b(bd, boolean)>
	//    7   13:return          
	}

	public boolean a()
	{
		return o.a();
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field android.support.design.d.c o>
	//    2    4:invokevirtual   #368 <Method boolean android.support.design.d.c.a()>
	//    3    7:ireturn         
	}

	public boolean a(Rect rect)
	{
		if(ac.x(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #376 <Method boolean ac.x(android.view.View)>
	//*   2    4:ifeq            28
		{
			rect.set(0, 0, getWidth(), getHeight());
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #380 <Method int getWidth()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #383 <Method int getHeight()>
	//   10   18:invokevirtual   #387 <Method void Rect.set(int, int, int, int)>
			c(rect);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #389 <Method void c(Rect)>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		} else
		{
			return false;
	//   16   28:iconst_0        
	//   17   29:ireturn         
		}
	}

	public void b(android.animation.Animator.AnimatorListener animatorlistener)
	{
		getImpl().b(animatorlistener);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #392 <Method void aw.b(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	public void b(Rect rect)
	{
		rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:invokevirtual   #395 <Method int getMeasuredWidth()>
	//    5    7:aload_0         
	//    6    8:invokevirtual   #398 <Method int getMeasuredHeight()>
	//    7   11:invokevirtual   #387 <Method void Rect.set(int, int, int, int)>
		c(rect);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #389 <Method void c(Rect)>
	//   11   19:return          
	}

	void b(au au, boolean flag)
	{
		getImpl().a(a(au), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #362 <Method bd a(au)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #400 <Method void android.support.design.widget.aw.a(bd, boolean)>
	//    7   13:return          
	}

	public boolean b()
	{
		return getImpl().r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:invokevirtual   #403 <Method boolean aw.r()>
	//    3    7:ireturn         
	}

	public void c(android.animation.Animator.AnimatorListener animatorlistener)
	{
		getImpl().c(animatorlistener);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #405 <Method void android.support.design.widget.aw.c(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	public void d(android.animation.Animator.AnimatorListener animatorlistener)
	{
		getImpl().d(animatorlistener);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #407 <Method void aw.d(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #410 <Method void cl.drawableStateChanged()>
		getImpl().a(getDrawableState());
	//    2    4:aload_0         
	//    3    5:invokespecial   #185 <Method aw getImpl()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #295 <Method int[] getDrawableState()>
	//    6   12:invokevirtual   #413 <Method void android.support.design.widget.aw.a(int[])>
	//    7   15:return          
	}

	public ColorStateList getBackgroundTintList()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ColorStateList c>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getBackgroundTintMode()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field android.graphics.PorterDuff$Mode d>
	//    2    4:areturn         
	}

	public float getCompatElevation()
	{
		return getImpl().a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:invokevirtual   #421 <Method float android.support.design.widget.aw.a()>
	//    3    7:freturn         
	}

	public float getCompatHoveredFocusedTranslationZ()
	{
		return getImpl().b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:invokevirtual   #424 <Method float aw.b()>
	//    3    7:freturn         
	}

	public float getCompatPressedTranslationZ()
	{
		return getImpl().c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:invokevirtual   #427 <Method float android.support.design.widget.aw.c()>
	//    3    7:freturn         
	}

	public Drawable getContentBackground()
	{
		return getImpl().h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:invokevirtual   #430 <Method Drawable android.support.design.widget.aw.h()>
	//    3    7:areturn         
	}

	public int getCustomSize()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int j>
	//    2    4:ireturn         
	}

	public int getExpandedComponentIdHint()
	{
		return o.c();
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field android.support.design.d.c o>
	//    2    4:invokevirtual   #434 <Method int android.support.design.d.c.c()>
	//    3    7:ireturn         
	}

	public h getHideMotionSpec()
	{
		return getImpl().f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:invokevirtual   #438 <Method h aw.f()>
	//    3    7:areturn         
	}

	public int getRippleColor()
	{
		ColorStateList colorstatelist = h;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ColorStateList h>
	//    2    4:astore_1        
		if(colorstatelist != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return colorstatelist.getDefaultColor();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #442 <Method int ColorStateList.getDefaultColor()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public ColorStateList getRippleColorStateList()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ColorStateList h>
	//    2    4:areturn         
	}

	public h getShowMotionSpec()
	{
		return getImpl().e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:invokevirtual   #446 <Method h android.support.design.widget.aw.e()>
	//    3    7:areturn         
	}

	public int getSize()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int i>
	//    2    4:ireturn         
	}

	int getSizeDimension()
	{
		return a(i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #109 <Field int i>
	//    3    5:invokespecial   #251 <Method int a(int)>
	//    4    8:ireturn         
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		return getBackgroundTintList();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method ColorStateList getBackgroundTintList()>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		return getBackgroundTintMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #453 <Method android.graphics.PorterDuff$Mode getBackgroundTintMode()>
	//    2    4:areturn         
	}

	public ColorStateList getSupportImageTintList()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field ColorStateList e>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportImageTintMode()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field android.graphics.PorterDuff$Mode f>
	//    2    4:areturn         
	}

	public boolean getUseCompatPadding()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field boolean a>
	//    2    4:ireturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #459 <Method void cl.jumpDrawablesToCurrentState()>
		getImpl().g();
	//    2    4:aload_0         
	//    3    5:invokespecial   #185 <Method aw getImpl()>
	//    4    8:invokevirtual   #461 <Method void aw.g()>
	//    5   11:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #464 <Method void cl.onAttachedToWindow()>
		getImpl().k();
	//    2    4:aload_0         
	//    3    5:invokespecial   #185 <Method aw getImpl()>
	//    4    8:invokevirtual   #466 <Method void android.support.design.widget.aw.k()>
	//    5   11:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #469 <Method void cl.onDetachedFromWindow()>
		getImpl().l();
	//    2    4:aload_0         
	//    3    5:invokespecial   #185 <Method aw getImpl()>
	//    4    8:invokevirtual   #471 <Method void android.support.design.widget.aw.l()>
	//    5   11:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		int k1 = getSizeDimension();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #475 <Method int getSizeDimension()>
	//    2    4:istore_3        
		k = (k1 - l) / 2;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #149 <Field int l>
	//    7   11:isub            
	//    8   12:iconst_2        
	//    9   13:idiv            
	//   10   14:putfield        #270 <Field int k>
		getImpl().j();
	//   11   17:aload_0         
	//   12   18:invokespecial   #185 <Method aw getImpl()>
	//   13   21:invokevirtual   #477 <Method void aw.j()>
		i1 = Math.min(a(k1, i1), a(k1, j1));
	//   14   24:iload_3         
	//   15   25:iload_1         
	//   16   26:invokestatic    #479 <Method int a(int, int)>
	//   17   29:iload_3         
	//   18   30:iload_2         
	//   19   31:invokestatic    #479 <Method int a(int, int)>
	//   20   34:invokestatic    #267 <Method int Math.min(int, int)>
	//   21   37:istore_1        
		setMeasuredDimension(b.left + i1 + b.right, i1 + b.top + b.bottom);
	//   22   38:aload_0         
	//   23   39:aload_0         
	//   24   40:getfield        #55  <Field Rect b>
	//   25   43:getfield        #327 <Field int Rect.left>
	//   26   46:iload_1         
	//   27   47:iadd            
	//   28   48:aload_0         
	//   29   49:getfield        #55  <Field Rect b>
	//   30   52:getfield        #333 <Field int Rect.right>
	//   31   55:iadd            
	//   32   56:iload_1         
	//   33   57:aload_0         
	//   34   58:getfield        #55  <Field Rect b>
	//   35   61:getfield        #330 <Field int Rect.top>
	//   36   64:iadd            
	//   37   65:aload_0         
	//   38   66:getfield        #55  <Field Rect b>
	//   39   69:getfield        #336 <Field int Rect.bottom>
	//   40   72:iadd            
	//   41   73:invokevirtual   #482 <Method void setMeasuredDimension(int, int)>
	//   42   76:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof ExtendableSavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #486 <Class ExtendableSavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #488 <Method void cl.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((ExtendableSavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #486 <Class ExtendableSavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((ExtendableSavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #492 <Method Parcelable ExtendableSavedState.getSuperState()>
	//   13   23:invokespecial   #488 <Method void cl.onRestoreInstanceState(Parcelable)>
			o.a((Bundle)((ExtendableSavedState) (parcelable)).a.get("expandableWidgetHelper"));
	//   14   26:aload_0         
	//   15   27:getfield        #181 <Field android.support.design.d.c o>
	//   16   30:aload_1         
	//   17   31:getfield        #495 <Field w ExtendableSavedState.a>
	//   18   34:ldc2            #497 <String "expandableWidgetHelper">
	//   19   37:invokevirtual   #503 <Method Object w.get(Object)>
	//   20   40:checkcast       #505 <Class Bundle>
	//   21   43:invokevirtual   #508 <Method void android.support.design.d.c.a(Bundle)>
			return;
	//   22   46:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		ExtendableSavedState extendablesavedstate = new ExtendableSavedState(super.onSaveInstanceState());
	//    0    0:new             #486 <Class ExtendableSavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #511 <Method Parcelable cl.onSaveInstanceState()>
	//    4    8:invokespecial   #513 <Method void ExtendableSavedState(Parcelable)>
	//    5   11:astore_1        
		extendablesavedstate.a.put("expandableWidgetHelper", ((Object) (o.b())));
	//    6   12:aload_1         
	//    7   13:getfield        #495 <Field w ExtendableSavedState.a>
	//    8   16:ldc2            #497 <String "expandableWidgetHelper">
	//    9   19:aload_0         
	//   10   20:getfield        #181 <Field android.support.design.d.c o>
	//   11   23:invokevirtual   #516 <Method Bundle android.support.design.d.c.b()>
	//   12   26:invokevirtual   #520 <Method Object w.put(Object, Object)>
	//   13   29:pop             
		return ((Parcelable) (extendablesavedstate));
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0 && a(m) && !m.contains((int)motionevent.getX(), (int)motionevent.getY()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #527 <Method int MotionEvent.getAction()>
	//*   2    4:ifne            40
	//*   3    7:aload_0         
	//*   4    8:aload_0         
	//*   5    9:getfield        #57  <Field Rect m>
	//*   6   12:invokevirtual   #529 <Method boolean a(Rect)>
	//*   7   15:ifeq            40
	//*   8   18:aload_0         
	//*   9   19:getfield        #57  <Field Rect m>
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #532 <Method float MotionEvent.getX()>
	//*  12   26:f2i             
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #535 <Method float MotionEvent.getY()>
	//*  15   31:f2i             
	//*  16   32:invokevirtual   #539 <Method boolean Rect.contains(int, int)>
	//*  17   35:ifne            40
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokespecial   #541 <Method boolean cl.onTouchEvent(MotionEvent)>
	//   23   45:ireturn         
	}

	public void setBackgroundColor(int i1)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc2            #543 <String "FloatingActionButton">
	//    1    3:ldc2            #545 <String "Setting a custom background is not supported.">
	//    2    6:invokestatic    #550 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc2            #543 <String "FloatingActionButton">
	//    1    3:ldc2            #545 <String "Setting a custom background is not supported.">
	//    2    6:invokestatic    #550 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void setBackgroundResource(int i1)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc2            #543 <String "FloatingActionButton">
	//    1    3:ldc2            #545 <String "Setting a custom background is not supported.">
	//    2    6:invokestatic    #550 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void setBackgroundTintList(ColorStateList colorstatelist)
	{
		if(c != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field ColorStateList c>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			c = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #83  <Field ColorStateList c>
			getImpl().a(colorstatelist);
	//    7   13:aload_0         
	//    8   14:invokespecial   #185 <Method aw getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #555 <Method void android.support.design.widget.aw.a(ColorStateList)>
		}
	//   11   21:return          
	}

	public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(d != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field android.graphics.PorterDuff$Mode d>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			d = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #99  <Field android.graphics.PorterDuff$Mode d>
			getImpl().a(mode);
	//    7   13:aload_0         
	//    8   14:invokespecial   #185 <Method aw getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #559 <Method void android.support.design.widget.aw.a(android.graphics.PorterDuff$Mode)>
		}
	//   11   21:return          
	}

	public void setCompatElevation(float f1)
	{
		getImpl().a(f1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #193 <Method void android.support.design.widget.aw.a(float)>
	//    4    8:return          
	}

	public void setCompatElevationResource(int i1)
	{
		setCompatElevation(getResources().getDimension(i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #220 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #564 <Method float Resources.getDimension(int)>
	//    5    9:invokevirtual   #566 <Method void setCompatElevation(float)>
	//    6   12:return          
	}

	public void setCompatHoveredFocusedTranslationZ(float f1)
	{
		getImpl().b(f1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #195 <Method void aw.b(float)>
	//    4    8:return          
	}

	public void setCompatHoveredFocusedTranslationZResource(int i1)
	{
		setCompatHoveredFocusedTranslationZ(getResources().getDimension(i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #220 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #564 <Method float Resources.getDimension(int)>
	//    5    9:invokevirtual   #570 <Method void setCompatHoveredFocusedTranslationZ(float)>
	//    6   12:return          
	}

	public void setCompatPressedTranslationZ(float f1)
	{
		getImpl().c(f1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #197 <Method void android.support.design.widget.aw.c(float)>
	//    4    8:return          
	}

	public void setCompatPressedTranslationZResource(int i1)
	{
		setCompatPressedTranslationZ(getResources().getDimension(i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #220 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #564 <Method float Resources.getDimension(int)>
	//    5    9:invokevirtual   #574 <Method void setCompatPressedTranslationZ(float)>
	//    6   12:return          
	}

	public void setCustomSize(int i1)
	{
		if(i1 >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			j = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #117 <Field int j>
			return;
	//    5    9:return          
		} else
		{
			throw new IllegalArgumentException("Custom size must be non-negative");
	//    6   10:new             #263 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc2            #577 <String "Custom size must be non-negative">
	//    9   17:invokespecial   #580 <Method void IllegalArgumentException(String)>
	//   10   20:athrow          
		}
	}

	public void setExpandedComponentIdHint(int i1)
	{
		o.a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field android.support.design.d.c o>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #582 <Method void android.support.design.d.c.a(int)>
	//    4    8:return          
	}

	public void setHideMotionSpec(h h1)
	{
		getImpl().b(h1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #205 <Method void aw.b(h)>
	//    4    8:return          
	}

	public void setHideMotionSpecResource(int i1)
	{
		setHideMotionSpec(android.support.design.a.h.a(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #588 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #591 <Method h h.a(Context, int)>
	//    5    9:invokevirtual   #593 <Method void setHideMotionSpec(h)>
	//    6   12:return          
	}

	public void setImageDrawable(Drawable drawable)
	{
		super.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #596 <Method void cl.setImageDrawable(Drawable)>
		getImpl().d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #185 <Method aw getImpl()>
	//    5    9:invokevirtual   #598 <Method void aw.d()>
	//    6   12:return          
	}

	public void setImageResource(int i1)
	{
		n.setImageResource(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field AppCompatImageHelper n>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #601 <Method void AppCompatImageHelper.setImageResource(int)>
	//    4    8:return          
	}

	public void setRippleColor(int i1)
	{
		setRippleColor(ColorStateList.valueOf(i1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #606 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #608 <Method void setRippleColor(ColorStateList)>
	//    4    8:return          
	}

	public void setRippleColor(ColorStateList colorstatelist)
	{
		if(h != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field ColorStateList h>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       24
		{
			h = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #104 <Field ColorStateList h>
			getImpl().b(h);
	//    7   13:aload_0         
	//    8   14:invokespecial   #185 <Method aw getImpl()>
	//    9   17:aload_0         
	//   10   18:getfield        #104 <Field ColorStateList h>
	//   11   21:invokevirtual   #610 <Method void aw.b(ColorStateList)>
		}
	//   12   24:return          
	}

	public void setShowMotionSpec(h h1)
	{
		getImpl().a(h1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method aw getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #203 <Method void android.support.design.widget.aw.a(h)>
	//    4    8:return          
	}

	public void setShowMotionSpecResource(int i1)
	{
		setShowMotionSpec(android.support.design.a.h.a(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #588 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #591 <Method h h.a(Context, int)>
	//    5    9:invokevirtual   #614 <Method void setShowMotionSpec(h)>
	//    6   12:return          
	}

	public void setSize(int i1)
	{
		j = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #117 <Field int j>
		if(i1 != i)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #109 <Field int i>
	//*   6   10:icmpeq          22
		{
			i = i1;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #109 <Field int i>
			requestLayout();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #618 <Method void requestLayout()>
		}
	//   12   22:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		setBackgroundTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #621 <Method void setBackgroundTintList(ColorStateList)>
	//    3    5:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		setBackgroundTintMode(mode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #624 <Method void setBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    3    5:return          
	}

	public void setSupportImageTintList(ColorStateList colorstatelist)
	{
		if(e != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #287 <Field ColorStateList e>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			e = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #287 <Field ColorStateList e>
			c();
	//    7   13:aload_0         
	//    8   14:invokespecial   #627 <Method void c()>
		}
	//    9   17:return          
	}

	public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(f != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #303 <Field android.graphics.PorterDuff$Mode f>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			f = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #303 <Field android.graphics.PorterDuff$Mode f>
			c();
	//    7   13:aload_0         
	//    8   14:invokespecial   #627 <Method void c()>
		}
	//    9   17:return          
	}

	public void setUseCompatPadding(boolean flag)
	{
		if(a != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field boolean a>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          20
		{
			a = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #144 <Field boolean a>
			getImpl().i();
	//    7   13:aload_0         
	//    8   14:invokespecial   #185 <Method aw getImpl()>
	//    9   17:invokevirtual   #632 <Method void aw.i()>
		}
	//   10   20:return          
	}

	boolean a;
	final Rect b;
	private ColorStateList c;
	private android.graphics.PorterDuff.Mode d;
	private ColorStateList e;
	private android.graphics.PorterDuff.Mode f;
	private int g;
	private ColorStateList h;
	private int i;
	private int j;
	private int k;
	private int l;
	private final Rect m;
	private final AppCompatImageHelper n;
	private final android.support.design.d.c o;
	private aw p;
}
