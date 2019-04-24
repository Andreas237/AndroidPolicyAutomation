// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.support.v4.view.s;
import android.support.v7.c.a.b;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			av, y, bd

public class SwitchCompat extends CompoundButton
{

	public SwitchCompat(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #80  <Method void SwitchCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwitchCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.switchStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #85  <Field int android.support.v7.a.a$a.switchStyle>
	//    4    6:invokespecial   #88  <Method void SwitchCompat(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SwitchCompat(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #89  <Method void CompoundButton(Context, AttributeSet, int)>
		d = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #91  <Field ColorStateList d>
		e = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #93  <Field android.graphics.PorterDuff$Mode e>
		f = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #95  <Field boolean f>
		g = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #97  <Field boolean g>
		i = null;
	//   17   27:aload_0         
	//   18   28:aconst_null     
	//   19   29:putfield        #99  <Field ColorStateList i>
		j = null;
	//   20   32:aload_0         
	//   21   33:aconst_null     
	//   22   34:putfield        #101 <Field android.graphics.PorterDuff$Mode j>
		k = false;
	//   23   37:aload_0         
	//   24   38:iconst_0        
	//   25   39:putfield        #103 <Field boolean k>
		l = false;
	//   26   42:aload_0         
	//   27   43:iconst_0        
	//   28   44:putfield        #105 <Field boolean l>
		x = VelocityTracker.obtain();
	//   29   47:aload_0         
	//   30   48:invokestatic    #111 <Method VelocityTracker VelocityTracker.obtain()>
	//   31   51:putfield        #113 <Field VelocityTracker x>
		M = new Rect();
	//   32   54:aload_0         
	//   33   55:new             #115 <Class Rect>
	//   34   58:dup             
	//   35   59:invokespecial   #117 <Method void Rect()>
	//   36   62:putfield        #119 <Field Rect M>
		H = new TextPaint(1);
	//   37   65:aload_0         
	//   38   66:new             #121 <Class TextPaint>
	//   39   69:dup             
	//   40   70:iconst_1        
	//   41   71:invokespecial   #124 <Method void TextPaint(int)>
	//   42   74:putfield        #126 <Field TextPaint H>
		Object obj = ((Object) (getResources()));
	//   43   77:aload_0         
	//   44   78:invokevirtual   #130 <Method Resources getResources()>
	//   45   81:astore          4
		H.density = ((Resources) (obj)).getDisplayMetrics().density;
	//   46   83:aload_0         
	//   47   84:getfield        #126 <Field TextPaint H>
	//   48   87:aload           4
	//   49   89:invokevirtual   #136 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   50   92:getfield        #141 <Field float DisplayMetrics.density>
	//   51   95:putfield        #142 <Field float TextPaint.density>
		attributeset = ((AttributeSet) (android.support.v7.widget.av.a(context, attributeset, android.support.v7.a.a.j.SwitchCompat, i1, 0)));
	//   52   98:aload_1         
	//   53   99:aload_2         
	//   54  100:getstatic       #147 <Field int[] android.support.v7.a.a$j.SwitchCompat>
	//   55  103:iload_3         
	//   56  104:iconst_0        
	//   57  105:invokestatic    #152 <Method av android.support.v7.widget.av.a(Context, AttributeSet, int[], int, int)>
	//   58  108:astore_2        
		c = ((av) (attributeset)).a(android.support.v7.a.a.j.SwitchCompat_android_thumb);
	//   59  109:aload_0         
	//   60  110:aload_2         
	//   61  111:getstatic       #155 <Field int android.support.v7.a.a$j.SwitchCompat_android_thumb>
	//   62  114:invokevirtual   #158 <Method Drawable android.support.v7.widget.av.a(int)>
	//   63  117:putfield        #160 <Field Drawable c>
		if(c != null)
	//*  64  120:aload_0         
	//*  65  121:getfield        #160 <Field Drawable c>
	//*  66  124:ifnull          135
			c.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   67  127:aload_0         
	//   68  128:getfield        #160 <Field Drawable c>
	//   69  131:aload_0         
	//   70  132:invokevirtual   #166 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		h = ((av) (attributeset)).a(android.support.v7.a.a.j.SwitchCompat_track);
	//   71  135:aload_0         
	//   72  136:aload_2         
	//   73  137:getstatic       #169 <Field int android.support.v7.a.a$j.SwitchCompat_track>
	//   74  140:invokevirtual   #158 <Method Drawable android.support.v7.widget.av.a(int)>
	//   75  143:putfield        #171 <Field Drawable h>
		if(h != null)
	//*  76  146:aload_0         
	//*  77  147:getfield        #171 <Field Drawable h>
	//*  78  150:ifnull          161
			h.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   79  153:aload_0         
	//   80  154:getfield        #171 <Field Drawable h>
	//   81  157:aload_0         
	//   82  158:invokevirtual   #166 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		q = ((av) (attributeset)).c(android.support.v7.a.a.j.SwitchCompat_android_textOn);
	//   83  161:aload_0         
	//   84  162:aload_2         
	//   85  163:getstatic       #174 <Field int android.support.v7.a.a$j.SwitchCompat_android_textOn>
	//   86  166:invokevirtual   #177 <Method CharSequence av.c(int)>
	//   87  169:putfield        #179 <Field CharSequence q>
		r = ((av) (attributeset)).c(android.support.v7.a.a.j.SwitchCompat_android_textOff);
	//   88  172:aload_0         
	//   89  173:aload_2         
	//   90  174:getstatic       #182 <Field int android.support.v7.a.a$j.SwitchCompat_android_textOff>
	//   91  177:invokevirtual   #177 <Method CharSequence av.c(int)>
	//   92  180:putfield        #184 <Field CharSequence r>
		s = ((av) (attributeset)).a(android.support.v7.a.a.j.SwitchCompat_showText, true);
	//   93  183:aload_0         
	//   94  184:aload_2         
	//   95  185:getstatic       #187 <Field int android.support.v7.a.a$j.SwitchCompat_showText>
	//   96  188:iconst_1        
	//   97  189:invokevirtual   #190 <Method boolean android.support.v7.widget.av.a(int, boolean)>
	//   98  192:putfield        #192 <Field boolean s>
		m = ((av) (attributeset)).e(android.support.v7.a.a.j.SwitchCompat_thumbTextPadding, 0);
	//   99  195:aload_0         
	//  100  196:aload_2         
	//  101  197:getstatic       #195 <Field int android.support.v7.a.a$j.SwitchCompat_thumbTextPadding>
	//  102  200:iconst_0        
	//  103  201:invokevirtual   #198 <Method int av.e(int, int)>
	//  104  204:putfield        #200 <Field int m>
		n = ((av) (attributeset)).e(android.support.v7.a.a.j.SwitchCompat_switchMinWidth, 0);
	//  105  207:aload_0         
	//  106  208:aload_2         
	//  107  209:getstatic       #203 <Field int android.support.v7.a.a$j.SwitchCompat_switchMinWidth>
	//  108  212:iconst_0        
	//  109  213:invokevirtual   #198 <Method int av.e(int, int)>
	//  110  216:putfield        #205 <Field int n>
		o = ((av) (attributeset)).e(android.support.v7.a.a.j.SwitchCompat_switchPadding, 0);
	//  111  219:aload_0         
	//  112  220:aload_2         
	//  113  221:getstatic       #208 <Field int android.support.v7.a.a$j.SwitchCompat_switchPadding>
	//  114  224:iconst_0        
	//  115  225:invokevirtual   #198 <Method int av.e(int, int)>
	//  116  228:putfield        #210 <Field int o>
		p = ((av) (attributeset)).a(android.support.v7.a.a.j.SwitchCompat_splitTrack, false);
	//  117  231:aload_0         
	//  118  232:aload_2         
	//  119  233:getstatic       #213 <Field int android.support.v7.a.a$j.SwitchCompat_splitTrack>
	//  120  236:iconst_0        
	//  121  237:invokevirtual   #190 <Method boolean android.support.v7.widget.av.a(int, boolean)>
	//  122  240:putfield        #215 <Field boolean p>
		obj = ((Object) (((av) (attributeset)).e(android.support.v7.a.a.j.SwitchCompat_thumbTint)));
	//  123  243:aload_2         
	//  124  244:getstatic       #218 <Field int android.support.v7.a.a$j.SwitchCompat_thumbTint>
	//  125  247:invokevirtual   #221 <Method ColorStateList av.e(int)>
	//  126  250:astore          4
		if(obj != null)
	//* 127  252:aload           4
	//* 128  254:ifnull          268
		{
			d = ((ColorStateList) (obj));
	//  129  257:aload_0         
	//  130  258:aload           4
	//  131  260:putfield        #91  <Field ColorStateList d>
			f = true;
	//  132  263:aload_0         
	//  133  264:iconst_1        
	//  134  265:putfield        #95  <Field boolean f>
		}
		obj = ((Object) (android.support.v7.widget.y.a(((av) (attributeset)).a(android.support.v7.a.a.j.SwitchCompat_thumbTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  135  268:aload_2         
	//  136  269:getstatic       #224 <Field int android.support.v7.a.a$j.SwitchCompat_thumbTintMode>
	//  137  272:iconst_m1       
	//  138  273:invokevirtual   #226 <Method int android.support.v7.widget.av.a(int, int)>
	//  139  276:aconst_null     
	//  140  277:invokestatic    #231 <Method android.graphics.PorterDuff$Mode android.support.v7.widget.y.a(int, android.graphics.PorterDuff$Mode)>
	//  141  280:astore          4
		if(e != obj)
	//* 142  282:aload_0         
	//* 143  283:getfield        #93  <Field android.graphics.PorterDuff$Mode e>
	//* 144  286:aload           4
	//* 145  288:if_acmpeq       302
		{
			e = ((android.graphics.PorterDuff.Mode) (obj));
	//  146  291:aload_0         
	//  147  292:aload           4
	//  148  294:putfield        #93  <Field android.graphics.PorterDuff$Mode e>
			g = true;
	//  149  297:aload_0         
	//  150  298:iconst_1        
	//  151  299:putfield        #97  <Field boolean g>
		}
		if(f || g)
	//* 152  302:aload_0         
	//* 153  303:getfield        #95  <Field boolean f>
	//* 154  306:ifne            316
	//* 155  309:aload_0         
	//* 156  310:getfield        #97  <Field boolean g>
	//* 157  313:ifeq            320
			b();
	//  158  316:aload_0         
	//  159  317:invokespecial   #233 <Method void b()>
		obj = ((Object) (((av) (attributeset)).e(android.support.v7.a.a.j.SwitchCompat_trackTint)));
	//  160  320:aload_2         
	//  161  321:getstatic       #236 <Field int android.support.v7.a.a$j.SwitchCompat_trackTint>
	//  162  324:invokevirtual   #221 <Method ColorStateList av.e(int)>
	//  163  327:astore          4
		if(obj != null)
	//* 164  329:aload           4
	//* 165  331:ifnull          345
		{
			i = ((ColorStateList) (obj));
	//  166  334:aload_0         
	//  167  335:aload           4
	//  168  337:putfield        #99  <Field ColorStateList i>
			k = true;
	//  169  340:aload_0         
	//  170  341:iconst_1        
	//  171  342:putfield        #103 <Field boolean k>
		}
		obj = ((Object) (android.support.v7.widget.y.a(((av) (attributeset)).a(android.support.v7.a.a.j.SwitchCompat_trackTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  172  345:aload_2         
	//  173  346:getstatic       #239 <Field int android.support.v7.a.a$j.SwitchCompat_trackTintMode>
	//  174  349:iconst_m1       
	//  175  350:invokevirtual   #226 <Method int android.support.v7.widget.av.a(int, int)>
	//  176  353:aconst_null     
	//  177  354:invokestatic    #231 <Method android.graphics.PorterDuff$Mode android.support.v7.widget.y.a(int, android.graphics.PorterDuff$Mode)>
	//  178  357:astore          4
		if(j != obj)
	//* 179  359:aload_0         
	//* 180  360:getfield        #101 <Field android.graphics.PorterDuff$Mode j>
	//* 181  363:aload           4
	//* 182  365:if_acmpeq       379
		{
			j = ((android.graphics.PorterDuff.Mode) (obj));
	//  183  368:aload_0         
	//  184  369:aload           4
	//  185  371:putfield        #101 <Field android.graphics.PorterDuff$Mode j>
			l = true;
	//  186  374:aload_0         
	//  187  375:iconst_1        
	//  188  376:putfield        #105 <Field boolean l>
		}
		if(k || l)
	//* 189  379:aload_0         
	//* 190  380:getfield        #103 <Field boolean k>
	//* 191  383:ifne            393
	//* 192  386:aload_0         
	//* 193  387:getfield        #105 <Field boolean l>
	//* 194  390:ifeq            397
			a();
	//  195  393:aload_0         
	//  196  394:invokespecial   #241 <Method void a()>
		i1 = ((av) (attributeset)).g(android.support.v7.a.a.j.SwitchCompat_switchTextAppearance, 0);
	//  197  397:aload_2         
	//  198  398:getstatic       #244 <Field int android.support.v7.a.a$j.SwitchCompat_switchTextAppearance>
	//  199  401:iconst_0        
	//  200  402:invokevirtual   #246 <Method int av.g(int, int)>
	//  201  405:istore_3        
		if(i1 != 0)
	//* 202  406:iload_3         
	//* 203  407:ifeq            416
			a(context, i1);
	//  204  410:aload_0         
	//  205  411:aload_1         
	//  206  412:iload_3         
	//  207  413:invokevirtual   #249 <Method void a(Context, int)>
		((av) (attributeset)).a();
	//  208  416:aload_2         
	//  209  417:invokevirtual   #250 <Method void android.support.v7.widget.av.a()>
		context = ((Context) (ViewConfiguration.get(context)));
	//  210  420:aload_1         
	//  211  421:invokestatic    #256 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//  212  424:astore_1        
		u = ((ViewConfiguration) (context)).getScaledTouchSlop();
	//  213  425:aload_0         
	//  214  426:aload_1         
	//  215  427:invokevirtual   #260 <Method int ViewConfiguration.getScaledTouchSlop()>
	//  216  430:putfield        #262 <Field int u>
		y = ((ViewConfiguration) (context)).getScaledMinimumFlingVelocity();
	//  217  433:aload_0         
	//  218  434:aload_1         
	//  219  435:invokevirtual   #265 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//  220  438:putfield        #267 <Field int y>
		refreshDrawableState();
	//  221  441:aload_0         
	//  222  442:invokevirtual   #270 <Method void refreshDrawableState()>
		setChecked(isChecked());
	//  223  445:aload_0         
	//  224  446:aload_0         
	//  225  447:invokevirtual   #274 <Method boolean isChecked()>
	//  226  450:invokevirtual   #278 <Method void setChecked(boolean)>
	//  227  453:return          
	}

	private static float a(float f1, float f2, float f3)
	{
		if(f1 < f2)
	//*   0    0:fload_0         
	//*   1    1:fload_1         
	//*   2    2:fcmpg           
	//*   3    3:ifge            8
			return f2;
	//    4    6:fload_1         
	//    5    7:freturn         
		f2 = f1;
	//    6    8:fload_0         
	//    7    9:fstore_1        
		if(f1 > f3)
	//*   8   10:fload_0         
	//*   9   11:fload_2         
	//*  10   12:fcmpl           
	//*  11   13:ifle            18
			f2 = f3;
	//   12   16:fload_2         
	//   13   17:fstore_1        
		return f2;
	//   14   18:fload_1         
	//   15   19:freturn         
	}

	static float a(SwitchCompat switchcompat)
	{
		return switchcompat.z;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field float z>
	//    2    4:freturn         
	}

	private Layout a(CharSequence charsequence)
	{
		CharSequence charsequence1 = charsequence;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(L != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #285 <Field TransformationMethod L>
	//*   4    6:ifnull          21
			charsequence1 = L.getTransformation(charsequence, ((android.view.View) (this)));
	//    5    9:aload_0         
	//    6   10:getfield        #285 <Field TransformationMethod L>
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokeinterface #291 <Method CharSequence TransformationMethod.getTransformation(CharSequence, android.view.View)>
	//   10   20:astore_3        
		charsequence = ((CharSequence) (H));
	//   11   21:aload_0         
	//   12   22:getfield        #126 <Field TextPaint H>
	//   13   25:astore_1        
		int i1;
		if(charsequence1 != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          47
			i1 = (int)Math.ceil(Layout.getDesiredWidth(charsequence1, H));
	//   16   30:aload_3         
	//   17   31:aload_0         
	//   18   32:getfield        #126 <Field TextPaint H>
	//   19   35:invokestatic    #297 <Method float Layout.getDesiredWidth(CharSequence, TextPaint)>
	//   20   38:f2d             
	//   21   39:invokestatic    #303 <Method double Math.ceil(double)>
	//   22   42:d2i             
	//   23   43:istore_2        
		else
	//*  24   44:goto            49
			i1 = 0;
	//   25   47:iconst_0        
	//   26   48:istore_2        
		return ((Layout) (new StaticLayout(charsequence1, ((TextPaint) (charsequence)), i1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true)));
	//   27   49:new             #305 <Class StaticLayout>
	//   28   52:dup             
	//   29   53:aload_3         
	//   30   54:aload_1         
	//   31   55:iload_2         
	//   32   56:getstatic       #311 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//   33   59:fconst_1        
	//   34   60:fconst_0        
	//   35   61:iconst_1        
	//   36   62:invokespecial   #314 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//   37   65:areturn         
	}

	private void a()
	{
		if(h != null && (k || l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field Drawable h>
	//*   2    4:ifnull          90
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field boolean k>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #105 <Field boolean l>
	//*   8   18:ifeq            90
		{
			h = h.mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #171 <Field Drawable h>
	//   12   26:invokevirtual   #318 <Method Drawable Drawable.mutate()>
	//   13   29:putfield        #171 <Field Drawable h>
			if(k)
	//*  14   32:aload_0         
	//*  15   33:getfield        #103 <Field boolean k>
	//*  16   36:ifeq            50
				android.support.v4.a.a.a.a(h, i);
	//   17   39:aload_0         
	//   18   40:getfield        #171 <Field Drawable h>
	//   19   43:aload_0         
	//   20   44:getfield        #99  <Field ColorStateList i>
	//   21   47:invokestatic    #323 <Method void a.a(Drawable, ColorStateList)>
			if(l)
	//*  22   50:aload_0         
	//*  23   51:getfield        #105 <Field boolean l>
	//*  24   54:ifeq            68
				android.support.v4.a.a.a.a(h, j);
	//   25   57:aload_0         
	//   26   58:getfield        #171 <Field Drawable h>
	//   27   61:aload_0         
	//   28   62:getfield        #101 <Field android.graphics.PorterDuff$Mode j>
	//   29   65:invokestatic    #326 <Method void a.a(Drawable, android.graphics.PorterDuff$Mode)>
			if(h.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #171 <Field Drawable h>
	//*  32   72:invokevirtual   #329 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				h.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #171 <Field Drawable h>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #333 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #337 <Method boolean Drawable.setState(int[])>
	//   39   89:pop             
		}
	//   40   90:return          
	}

	private void a(int i1, int j1)
	{
		Typeface typeface;
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 47
	//	               2 40
	//	               3 33
		default:
			typeface = null;
	//    2   28:aconst_null     
	//    3   29:astore_3        
			break;

	//*   4   30:goto            51
		case 3: // '\003'
			typeface = Typeface.MONOSPACE;
	//    5   33:getstatic       #344 <Field Typeface Typeface.MONOSPACE>
	//    6   36:astore_3        
			break;

	//*   7   37:goto            51
		case 2: // '\002'
			typeface = Typeface.SERIF;
	//    8   40:getstatic       #347 <Field Typeface Typeface.SERIF>
	//    9   43:astore_3        
			break;

	//*  10   44:goto            51
		case 1: // '\001'
			typeface = Typeface.SANS_SERIF;
	//   11   47:getstatic       #350 <Field Typeface Typeface.SANS_SERIF>
	//   12   50:astore_3        
			break;
		}
		a(typeface, j1);
	//   13   51:aload_0         
	//   14   52:aload_3         
	//   15   53:iload_2         
	//   16   54:invokevirtual   #353 <Method void a(Typeface, int)>
	//   17   57:return          
	}

	private void a(MotionEvent motionevent)
	{
		motionevent = MotionEvent.obtain(motionevent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #359 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    2    4:astore_1        
		motionevent.setAction(3);
	//    3    5:aload_1         
	//    4    6:iconst_3        
	//    5    7:invokevirtual   #362 <Method void MotionEvent.setAction(int)>
		super.onTouchEvent(motionevent);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #366 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//    9   15:pop             
		motionevent.recycle();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #369 <Method void MotionEvent.recycle()>
	//   12   20:return          
	}

	private void a(boolean flag)
	{
		float f1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			f1 = 1.0F;
	//    2    4:fconst_1        
	//    3    5:fstore_2        
		else
	//*   4    6:goto            11
			f1 = 0.0F;
	//    5    9:fconst_0        
	//    6   10:fstore_2        
		a = ObjectAnimator.ofFloat(((Object) (this)), b, new float[] {
			f1
		});
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getstatic       #72  <Field Property b>
	//   10   16:iconst_1        
	//   11   17:newarray        float[]
	//   12   19:dup             
	//   13   20:iconst_0        
	//   14   21:fload_2         
	//   15   22:fastore         
	//   16   23:invokestatic    #375 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   17   26:putfield        #377 <Field ObjectAnimator a>
		a.setDuration(250L);
	//   18   29:aload_0         
	//   19   30:getfield        #377 <Field ObjectAnimator a>
	//   20   33:ldc2w           #378 <Long 250L>
	//   21   36:invokevirtual   #383 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   22   39:pop             
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  23   40:getstatic       #388 <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   43:bipush          18
	//*  25   45:icmplt          56
			a.setAutoCancel(true);
	//   26   48:aload_0         
	//   27   49:getfield        #377 <Field ObjectAnimator a>
	//   28   52:iconst_1        
	//   29   53:invokevirtual   #391 <Method void ObjectAnimator.setAutoCancel(boolean)>
		a.start();
	//   30   56:aload_0         
	//   31   57:getfield        #377 <Field ObjectAnimator a>
	//   32   60:invokevirtual   #394 <Method void ObjectAnimator.start()>
	//   33   63:return          
	}

	private boolean a(float f1, float f2)
	{
		Drawable drawable = c;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field Drawable c>
	//    2    4:astore          14
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          13
		if(drawable == null)
	//*   5    9:aload           14
	//*   6   11:ifnonnull       16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		int k1 = getThumbOffset();
	//    9   16:aload_0         
	//   10   17:invokespecial   #398 <Method int getThumbOffset()>
	//   11   20:istore          5
		c.getPadding(M);
	//   12   22:aload_0         
	//   13   23:getfield        #160 <Field Drawable c>
	//   14   26:aload_0         
	//   15   27:getfield        #119 <Field Rect M>
	//   16   30:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   17   33:pop             
		int i1 = E;
	//   18   34:aload_0         
	//   19   35:getfield        #404 <Field int E>
	//   20   38:istore_3        
		int j1 = u;
	//   21   39:aload_0         
	//   22   40:getfield        #262 <Field int u>
	//   23   43:istore          4
		k1 = (D + k1) - u;
	//   24   45:aload_0         
	//   25   46:getfield        #406 <Field int D>
	//   26   49:iload           5
	//   27   51:iadd            
	//   28   52:aload_0         
	//   29   53:getfield        #262 <Field int u>
	//   30   56:isub            
	//   31   57:istore          5
		int l1 = C;
	//   32   59:aload_0         
	//   33   60:getfield        #408 <Field int C>
	//   34   63:istore          6
		int i2 = M.left;
	//   35   65:aload_0         
	//   36   66:getfield        #119 <Field Rect M>
	//   37   69:getfield        #411 <Field int Rect.left>
	//   38   72:istore          7
		int j2 = M.right;
	//   39   74:aload_0         
	//   40   75:getfield        #119 <Field Rect M>
	//   41   78:getfield        #414 <Field int Rect.right>
	//   42   81:istore          8
		int k2 = u;
	//   43   83:aload_0         
	//   44   84:getfield        #262 <Field int u>
	//   45   87:istore          9
		int l2 = G;
	//   46   89:aload_0         
	//   47   90:getfield        #416 <Field int G>
	//   48   93:istore          10
		int i3 = u;
	//   49   95:aload_0         
	//   50   96:getfield        #262 <Field int u>
	//   51   99:istore          11
		boolean flag = flag1;
	//   52  101:iload           13
	//   53  103:istore          12
		if(f1 > (float)k1)
	//*  54  105:fload_1         
	//*  55  106:iload           5
	//*  56  108:i2f             
	//*  57  109:fcmpl           
	//*  58  110:ifle            169
		{
			flag = flag1;
	//   59  113:iload           13
	//   60  115:istore          12
			if(f1 < (float)(l1 + k1 + i2 + j2 + k2))
	//*  61  117:fload_1         
	//*  62  118:iload           6
	//*  63  120:iload           5
	//*  64  122:iadd            
	//*  65  123:iload           7
	//*  66  125:iadd            
	//*  67  126:iload           8
	//*  68  128:iadd            
	//*  69  129:iload           9
	//*  70  131:iadd            
	//*  71  132:i2f             
	//*  72  133:fcmpg           
	//*  73  134:ifge            169
			{
				flag = flag1;
	//   74  137:iload           13
	//   75  139:istore          12
				if(f2 > (float)(i1 - j1))
	//*  76  141:fload_2         
	//*  77  142:iload_3         
	//*  78  143:iload           4
	//*  79  145:isub            
	//*  80  146:i2f             
	//*  81  147:fcmpl           
	//*  82  148:ifle            169
				{
					flag = flag1;
	//   83  151:iload           13
	//   84  153:istore          12
					if(f2 < (float)(l2 + i3))
	//*  85  155:fload_2         
	//*  86  156:iload           10
	//*  87  158:iload           11
	//*  88  160:iadd            
	//*  89  161:i2f             
	//*  90  162:fcmpg           
	//*  91  163:ifge            169
						flag = true;
	//   92  166:iconst_1        
	//   93  167:istore          12
				}
			}
		}
		return flag;
	//   94  169:iload           12
	//   95  171:ireturn         
	}

	private void b()
	{
		if(c != null && (f || g))
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field Drawable c>
	//*   2    4:ifnull          90
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field boolean f>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #97  <Field boolean g>
	//*   8   18:ifeq            90
		{
			c = c.mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #160 <Field Drawable c>
	//   12   26:invokevirtual   #318 <Method Drawable Drawable.mutate()>
	//   13   29:putfield        #160 <Field Drawable c>
			if(f)
	//*  14   32:aload_0         
	//*  15   33:getfield        #95  <Field boolean f>
	//*  16   36:ifeq            50
				android.support.v4.a.a.a.a(c, d);
	//   17   39:aload_0         
	//   18   40:getfield        #160 <Field Drawable c>
	//   19   43:aload_0         
	//   20   44:getfield        #91  <Field ColorStateList d>
	//   21   47:invokestatic    #323 <Method void a.a(Drawable, ColorStateList)>
			if(g)
	//*  22   50:aload_0         
	//*  23   51:getfield        #97  <Field boolean g>
	//*  24   54:ifeq            68
				android.support.v4.a.a.a.a(c, e);
	//   25   57:aload_0         
	//   26   58:getfield        #160 <Field Drawable c>
	//   27   61:aload_0         
	//   28   62:getfield        #93  <Field android.graphics.PorterDuff$Mode e>
	//   29   65:invokestatic    #326 <Method void a.a(Drawable, android.graphics.PorterDuff$Mode)>
			if(c.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #160 <Field Drawable c>
	//*  32   72:invokevirtual   #329 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				c.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #160 <Field Drawable c>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #333 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #337 <Method boolean Drawable.setState(int[])>
	//   39   89:pop             
		}
	//   40   90:return          
	}

	private void b(MotionEvent motionevent)
	{
		t = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #418 <Field int t>
		int i1 = motionevent.getAction();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #421 <Method int MotionEvent.getAction()>
	//    5    9:istore_3        
		boolean flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore          4
		boolean flag;
		if(i1 == 1 && isEnabled())
	//*   8   13:iload_3         
	//*   9   14:iconst_1        
	//*  10   15:icmpne          30
	//*  11   18:aload_0         
	//*  12   19:invokevirtual   #424 <Method boolean isEnabled()>
	//*  13   22:ifeq            30
			flag = true;
	//   14   25:iconst_1        
	//   15   26:istore_3        
		else
	//*  16   27:goto            32
			flag = false;
	//   17   30:iconst_0        
	//   18   31:istore_3        
		boolean flag2 = isChecked();
	//   19   32:aload_0         
	//   20   33:invokevirtual   #274 <Method boolean isChecked()>
	//   21   36:istore          5
		if(flag)
	//*  22   38:iload_3         
	//*  23   39:ifeq            113
		{
			x.computeCurrentVelocity(1000);
	//   24   42:aload_0         
	//   25   43:getfield        #113 <Field VelocityTracker x>
	//   26   46:sipush          1000
	//   27   49:invokevirtual   #427 <Method void VelocityTracker.computeCurrentVelocity(int)>
			float f1 = x.getXVelocity();
	//   28   52:aload_0         
	//   29   53:getfield        #113 <Field VelocityTracker x>
	//   30   56:invokevirtual   #431 <Method float VelocityTracker.getXVelocity()>
	//   31   59:fstore_2        
			if(Math.abs(f1) > (float)y)
	//*  32   60:fload_2         
	//*  33   61:invokestatic    #435 <Method float Math.abs(float)>
	//*  34   64:aload_0         
	//*  35   65:getfield        #267 <Field int y>
	//*  36   68:i2f             
	//*  37   69:fcmpl           
	//*  38   70:ifle            104
			{
				if(android.support.v7.widget.bd.a(((android.view.View) (this))) ? f1 >= 0.0F : f1 <= 0.0F)
	//*  39   73:aload_0         
	//*  40   74:invokestatic    #440 <Method boolean android.support.v7.widget.bd.a(android.view.View)>
	//*  41   77:ifeq            95
	//*  42   80:fload_2         
	//*  43   81:fconst_0        
	//*  44   82:fcmpg           
	//*  45   83:ifge            89
	//*  46   86:goto            101
					flag1 = false;
	//   47   89:iconst_0        
	//   48   90:istore          4
	//   49   92:goto            101
	//   50   95:fload_2         
	//   51   96:fconst_0        
	//   52   97:fcmpl           
	//   53   98:ifle            89
			} else
	//*  54  101:goto            117
			{
				flag1 = getTargetCheckedState();
	//   55  104:aload_0         
	//   56  105:invokespecial   #443 <Method boolean getTargetCheckedState()>
	//   57  108:istore          4
			}
		} else
	//*  58  110:goto            117
		{
			flag1 = flag2;
	//   59  113:iload           5
	//   60  115:istore          4
		}
		if(flag1 != flag2)
	//*  61  117:iload           4
	//*  62  119:iload           5
	//*  63  121:icmpeq          129
			playSoundEffect(0);
	//   64  124:aload_0         
	//   65  125:iconst_0        
	//   66  126:invokevirtual   #446 <Method void playSoundEffect(int)>
		setChecked(flag1);
	//   67  129:aload_0         
	//   68  130:iload           4
	//   69  132:invokevirtual   #278 <Method void setChecked(boolean)>
		a(motionevent);
	//   70  135:aload_0         
	//   71  136:aload_1         
	//   72  137:invokespecial   #448 <Method void a(MotionEvent)>
	//   73  140:return          
	}

	private void c()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #377 <Field ObjectAnimator a>
	//*   2    4:ifnull          14
			a.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #377 <Field ObjectAnimator a>
	//    5   11:invokevirtual   #451 <Method void ObjectAnimator.cancel()>
	//    6   14:return          
	}

	private boolean getTargetCheckedState()
	{
		return z > 0.5F;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field float z>
	//    2    4:ldc2            #452 <Float 0.5F>
	//    3    7:fcmpl           
	//    4    8:ifle            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private int getThumbOffset()
	{
		float f1;
		if(android.support.v7.widget.bd.a(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #440 <Method boolean android.support.v7.widget.bd.a(android.view.View)>
	//*   2    4:ifeq            17
			f1 = 1.0F - z;
	//    3    7:fconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #282 <Field float z>
	//    6   12:fsub            
	//    7   13:fstore_1        
		else
	//*   8   14:goto            22
			f1 = z;
	//    9   17:aload_0         
	//   10   18:getfield        #282 <Field float z>
	//   11   21:fstore_1        
		return (int)(f1 * (float)getThumbScrollRange() + 0.5F);
	//   12   22:fload_1         
	//   13   23:aload_0         
	//   14   24:invokespecial   #455 <Method int getThumbScrollRange()>
	//   15   27:i2f             
	//   16   28:fmul            
	//   17   29:ldc2            #452 <Float 0.5F>
	//   18   32:fadd            
	//   19   33:f2i             
	//   20   34:ireturn         
	}

	private int getThumbScrollRange()
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field Drawable h>
	//*   2    4:ifnull          73
		{
			Rect rect1 = M;
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field Rect M>
	//    5   11:astore_2        
			h.getPadding(rect1);
	//    6   12:aload_0         
	//    7   13:getfield        #171 <Field Drawable h>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   10   20:pop             
			Rect rect;
			if(c != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #160 <Field Drawable c>
	//*  13   25:ifnull          39
				rect = android.support.v7.widget.y.a(c);
	//   14   28:aload_0         
	//   15   29:getfield        #160 <Field Drawable c>
	//   16   32:invokestatic    #458 <Method Rect android.support.v7.widget.y.a(Drawable)>
	//   17   35:astore_1        
			else
	//*  18   36:goto            43
				rect = android.support.v7.widget.y.a;
	//   19   39:getstatic       #460 <Field Rect android.support.v7.widget.y.a>
	//   20   42:astore_1        
			return A - C - rect1.left - rect1.right - rect.left - rect.right;
	//   21   43:aload_0         
	//   22   44:getfield        #462 <Field int A>
	//   23   47:aload_0         
	//   24   48:getfield        #408 <Field int C>
	//   25   51:isub            
	//   26   52:aload_2         
	//   27   53:getfield        #411 <Field int Rect.left>
	//   28   56:isub            
	//   29   57:aload_2         
	//   30   58:getfield        #414 <Field int Rect.right>
	//   31   61:isub            
	//   32   62:aload_1         
	//   33   63:getfield        #411 <Field int Rect.left>
	//   34   66:isub            
	//   35   67:aload_1         
	//   36   68:getfield        #414 <Field int Rect.right>
	//   37   71:isub            
	//   38   72:ireturn         
		} else
		{
			return 0;
	//   39   73:iconst_0        
	//   40   74:ireturn         
		}
	}

	public void a(Context context, int i1)
	{
		av av1 = android.support.v7.widget.av.a(context, i1, android.support.v7.a.a.j.TextAppearance);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #465 <Field int[] android.support.v7.a.a$j.TextAppearance>
	//    3    5:invokestatic    #468 <Method av android.support.v7.widget.av.a(Context, int, int[])>
	//    4    8:astore          4
		context = ((Context) (av1.e(android.support.v7.a.a.j.TextAppearance_android_textColor)));
	//    5   10:aload           4
	//    6   12:getstatic       #471 <Field int android.support.v7.a.a$j.TextAppearance_android_textColor>
	//    7   15:invokevirtual   #221 <Method ColorStateList av.e(int)>
	//    8   18:astore_1        
		if(context == null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          31
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:putfield        #473 <Field ColorStateList I>
	//*  14   28:goto            39
			context = ((Context) (getTextColors()));
	//   15   31:aload_0         
	//   16   32:invokevirtual   #477 <Method ColorStateList getTextColors()>
	//   17   35:astore_1        
		I = ((ColorStateList) (context));
	//*  18   36:goto            23
		i1 = av1.e(android.support.v7.a.a.j.TextAppearance_android_textSize, 0);
	//   19   39:aload           4
	//   20   41:getstatic       #480 <Field int android.support.v7.a.a$j.TextAppearance_android_textSize>
	//   21   44:iconst_0        
	//   22   45:invokevirtual   #198 <Method int av.e(int, int)>
	//   23   48:istore_2        
		if(i1 != 0)
	//*  24   49:iload_2         
	//*  25   50:ifeq            80
		{
			float f1 = i1;
	//   26   53:iload_2         
	//   27   54:i2f             
	//   28   55:fstore_3        
			if(f1 != H.getTextSize())
	//*  29   56:fload_3         
	//*  30   57:aload_0         
	//*  31   58:getfield        #126 <Field TextPaint H>
	//*  32   61:invokevirtual   #483 <Method float TextPaint.getTextSize()>
	//*  33   64:fcmpl           
	//*  34   65:ifeq            80
			{
				H.setTextSize(f1);
	//   35   68:aload_0         
	//   36   69:getfield        #126 <Field TextPaint H>
	//   37   72:fload_3         
	//   38   73:invokevirtual   #487 <Method void TextPaint.setTextSize(float)>
				requestLayout();
	//   39   76:aload_0         
	//   40   77:invokevirtual   #490 <Method void requestLayout()>
			}
		}
		a(av1.a(android.support.v7.a.a.j.TextAppearance_android_typeface, -1), av1.a(android.support.v7.a.a.j.TextAppearance_android_textStyle, -1));
	//   41   80:aload_0         
	//   42   81:aload           4
	//   43   83:getstatic       #493 <Field int android.support.v7.a.a$j.TextAppearance_android_typeface>
	//   44   86:iconst_m1       
	//   45   87:invokevirtual   #226 <Method int android.support.v7.widget.av.a(int, int)>
	//   46   90:aload           4
	//   47   92:getstatic       #496 <Field int android.support.v7.a.a$j.TextAppearance_android_textStyle>
	//   48   95:iconst_m1       
	//   49   96:invokevirtual   #226 <Method int android.support.v7.widget.av.a(int, int)>
	//   50   99:invokespecial   #498 <Method void a(int, int)>
		if(av1.a(android.support.v7.a.a.j.TextAppearance_textAllCaps, false))
	//*  51  102:aload           4
	//*  52  104:getstatic       #501 <Field int android.support.v7.a.a$j.TextAppearance_textAllCaps>
	//*  53  107:iconst_0        
	//*  54  108:invokevirtual   #190 <Method boolean android.support.v7.widget.av.a(int, boolean)>
	//*  55  111:ifeq            134
			context = ((Context) (new android.support.v7.f.a(getContext())));
	//   56  114:new             #503 <Class android.support.v7.f.a>
	//   57  117:dup             
	//   58  118:aload_0         
	//   59  119:invokevirtual   #507 <Method Context getContext()>
	//   60  122:invokespecial   #509 <Method void android.support.v7.f.a(Context)>
	//   61  125:astore_1        
		else
	//*  62  126:aload_0         
	//*  63  127:aload_1         
	//*  64  128:putfield        #285 <Field TransformationMethod L>
	//*  65  131:goto            139
			context = null;
	//   66  134:aconst_null     
	//   67  135:astore_1        
		L = ((TransformationMethod) (context));
	//*  68  136:goto            126
		av1.a();
	//   69  139:aload           4
	//   70  141:invokevirtual   #250 <Method void android.support.v7.widget.av.a()>
	//   71  144:return          
	}

	public void a(Typeface typeface, int i1)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore          5
		if(i1 > 0)
	//*   4    5:iload_2         
	//*   5    6:ifle            94
		{
			if(typeface == null)
	//*   6    9:aload_1         
	//*   7   10:ifnonnull       21
				typeface = Typeface.defaultFromStyle(i1);
	//    8   13:iload_2         
	//    9   14:invokestatic    #513 <Method Typeface Typeface.defaultFromStyle(int)>
	//   10   17:astore_1        
			else
	//*  11   18:goto            27
				typeface = Typeface.create(typeface, i1);
	//   12   21:aload_1         
	//   13   22:iload_2         
	//   14   23:invokestatic    #517 <Method Typeface Typeface.create(Typeface, int)>
	//   15   26:astore_1        
			setSwitchTypeface(typeface);
	//   16   27:aload_0         
	//   17   28:aload_1         
	//   18   29:invokevirtual   #521 <Method void setSwitchTypeface(Typeface)>
			int j1;
			if(typeface != null)
	//*  19   32:aload_1         
	//*  20   33:ifnull          45
				j1 = typeface.getStyle();
	//   21   36:aload_1         
	//   22   37:invokevirtual   #524 <Method int Typeface.getStyle()>
	//   23   40:istore          4
			else
	//*  24   42:goto            48
				j1 = 0;
	//   25   45:iconst_0        
	//   26   46:istore          4
			i1 = j1 & i1;
	//   27   48:iload           4
	//   28   50:iload_2         
	//   29   51:iand            
	//   30   52:istore_2        
			typeface = ((Typeface) (H));
	//   31   53:aload_0         
	//   32   54:getfield        #126 <Field TextPaint H>
	//   33   57:astore_1        
			if((i1 & 1) != 0)
	//*  34   58:iload_2         
	//*  35   59:iconst_1        
	//*  36   60:iand            
	//*  37   61:ifeq            67
				flag = true;
	//   38   64:iconst_1        
	//   39   65:istore          5
			((TextPaint) (typeface)).setFakeBoldText(flag);
	//   40   67:aload_1         
	//   41   68:iload           5
	//   42   70:invokevirtual   #527 <Method void TextPaint.setFakeBoldText(boolean)>
			typeface = ((Typeface) (H));
	//   43   73:aload_0         
	//   44   74:getfield        #126 <Field TextPaint H>
	//   45   77:astore_1        
			if((i1 & 2) != 0)
	//*  46   78:iload_2         
	//*  47   79:iconst_2        
	//*  48   80:iand            
	//*  49   81:ifeq            88
				f1 = -0.25F;
	//   50   84:ldc2            #528 <Float -0.25F>
	//   51   87:fstore_3        
			((TextPaint) (typeface)).setTextSkewX(f1);
	//   52   88:aload_1         
	//   53   89:fload_3         
	//   54   90:invokevirtual   #531 <Method void TextPaint.setTextSkewX(float)>
			return;
	//   55   93:return          
		} else
		{
			H.setFakeBoldText(false);
	//   56   94:aload_0         
	//   57   95:getfield        #126 <Field TextPaint H>
	//   58   98:iconst_0        
	//   59   99:invokevirtual   #527 <Method void TextPaint.setFakeBoldText(boolean)>
			H.setTextSkewX(0.0F);
	//   60  102:aload_0         
	//   61  103:getfield        #126 <Field TextPaint H>
	//   62  106:fconst_0        
	//   63  107:invokevirtual   #531 <Method void TextPaint.setTextSkewX(float)>
			setSwitchTypeface(typeface);
	//   64  110:aload_0         
	//   65  111:aload_1         
	//   66  112:invokevirtual   #521 <Method void setSwitchTypeface(Typeface)>
			return;
	//   67  115:return          
		}
	}

	public void draw(Canvas canvas)
	{
		int i1;
		int l2;
		int i3;
		Rect rect1;
label0:
		{
			int j1;
			int l1;
			int k2;
			int j3;
label1:
			{
				rect1 = M;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Rect M>
	//    2    4:astore          12
				int i2 = D;
	//    3    6:aload_0         
	//    4    7:getfield        #406 <Field int D>
	//    5   10:istore          5
				l2 = E;
	//    6   12:aload_0         
	//    7   13:getfield        #404 <Field int E>
	//    8   16:istore          8
				int j2 = F;
	//    9   18:aload_0         
	//   10   19:getfield        #535 <Field int F>
	//   11   22:istore          6
				i3 = G;
	//   12   24:aload_0         
	//   13   25:getfield        #416 <Field int G>
	//   14   28:istore          9
				j1 = getThumbOffset() + i2;
	//   15   30:aload_0         
	//   16   31:invokespecial   #398 <Method int getThumbOffset()>
	//   17   34:iload           5
	//   18   36:iadd            
	//   19   37:istore_3        
				Rect rect;
				if(c != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #160 <Field Drawable c>
	//*  22   42:ifnull          57
					rect = android.support.v7.widget.y.a(c);
	//   23   45:aload_0         
	//   24   46:getfield        #160 <Field Drawable c>
	//   25   49:invokestatic    #458 <Method Rect android.support.v7.widget.y.a(Drawable)>
	//   26   52:astore          11
				else
	//*  27   54:goto            62
					rect = android.support.v7.widget.y.a;
	//   28   57:getstatic       #460 <Field Rect android.support.v7.widget.y.a>
	//   29   60:astore          11
				i1 = j1;
	//   30   62:iload_3         
	//   31   63:istore_2        
				if(h == null)
					break label0;
	//   32   64:aload_0         
	//   33   65:getfield        #171 <Field Drawable h>
	//   34   68:ifnull          271
				h.getPadding(rect1);
	//   35   71:aload_0         
	//   36   72:getfield        #171 <Field Drawable h>
	//   37   75:aload           12
	//   38   77:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   39   80:pop             
				j3 = j1 + rect1.left;
	//   40   81:iload_3         
	//   41   82:aload           12
	//   42   84:getfield        #411 <Field int Rect.left>
	//   43   87:iadd            
	//   44   88:istore          10
				if(rect != null)
	//*  45   90:aload           11
	//*  46   92:ifnull          235
				{
					i1 = i2;
	//   47   95:iload           5
	//   48   97:istore_2        
					if(rect.left > rect1.left)
	//*  49   98:aload           11
	//*  50  100:getfield        #411 <Field int Rect.left>
	//*  51  103:aload           12
	//*  52  105:getfield        #411 <Field int Rect.left>
	//*  53  108:icmple          126
						i1 = i2 + (rect.left - rect1.left);
	//   54  111:iload           5
	//   55  113:aload           11
	//   56  115:getfield        #411 <Field int Rect.left>
	//   57  118:aload           12
	//   58  120:getfield        #411 <Field int Rect.left>
	//   59  123:isub            
	//   60  124:iadd            
	//   61  125:istore_2        
					if(rect.top > rect1.top)
	//*  62  126:aload           11
	//*  63  128:getfield        #538 <Field int Rect.top>
	//*  64  131:aload           12
	//*  65  133:getfield        #538 <Field int Rect.top>
	//*  66  136:icmple          157
						j1 = (rect.top - rect1.top) + l2;
	//   67  139:aload           11
	//   68  141:getfield        #538 <Field int Rect.top>
	//   69  144:aload           12
	//   70  146:getfield        #538 <Field int Rect.top>
	//   71  149:isub            
	//   72  150:iload           8
	//   73  152:iadd            
	//   74  153:istore_3        
					else
	//*  75  154:goto            160
						j1 = l2;
	//   76  157:iload           8
	//   77  159:istore_3        
					l1 = j2;
	//   78  160:iload           6
	//   79  162:istore          4
					if(rect.right > rect1.right)
	//*  80  164:aload           11
	//*  81  166:getfield        #414 <Field int Rect.right>
	//*  82  169:aload           12
	//*  83  171:getfield        #414 <Field int Rect.right>
	//*  84  174:icmple          193
						l1 = j2 - (rect.right - rect1.right);
	//   85  177:iload           6
	//   86  179:aload           11
	//   87  181:getfield        #414 <Field int Rect.right>
	//   88  184:aload           12
	//   89  186:getfield        #414 <Field int Rect.right>
	//   90  189:isub            
	//   91  190:isub            
	//   92  191:istore          4
					i2 = i1;
	//   93  193:iload_2         
	//   94  194:istore          5
					j2 = l1;
	//   95  196:iload           4
	//   96  198:istore          6
					k2 = j1;
	//   97  200:iload_3         
	//   98  201:istore          7
					if(rect.bottom > rect1.bottom)
	//*  99  203:aload           11
	//* 100  205:getfield        #541 <Field int Rect.bottom>
	//* 101  208:aload           12
	//* 102  210:getfield        #541 <Field int Rect.bottom>
	//* 103  213:icmple          239
					{
						k2 = i3 - (rect.bottom - rect1.bottom);
	//  104  216:iload           9
	//  105  218:aload           11
	//  106  220:getfield        #541 <Field int Rect.bottom>
	//  107  223:aload           12
	//  108  225:getfield        #541 <Field int Rect.bottom>
	//  109  228:isub            
	//  110  229:isub            
	//  111  230:istore          7
						break label1;
	//  112  232:goto            255
					}
				} else
				{
					k2 = l2;
	//  113  235:iload           8
	//  114  237:istore          7
				}
				i1 = i3;
	//  115  239:iload           9
	//  116  241:istore_2        
				j1 = k2;
	//  117  242:iload           7
	//  118  244:istore_3        
				k2 = i1;
	//  119  245:iload_2         
	//  120  246:istore          7
				l1 = j2;
	//  121  248:iload           6
	//  122  250:istore          4
				i1 = i2;
	//  123  252:iload           5
	//  124  254:istore_2        
			}
			h.setBounds(i1, j1, l1, k2);
	//  125  255:aload_0         
	//  126  256:getfield        #171 <Field Drawable h>
	//  127  259:iload_2         
	//  128  260:iload_3         
	//  129  261:iload           4
	//  130  263:iload           7
	//  131  265:invokevirtual   #545 <Method void Drawable.setBounds(int, int, int, int)>
			i1 = j3;
	//  132  268:iload           10
	//  133  270:istore_2        
		}
		if(c != null)
	//* 134  271:aload_0         
	//* 135  272:getfield        #160 <Field Drawable c>
	//* 136  275:ifnull          344
		{
			c.getPadding(rect1);
	//  137  278:aload_0         
	//  138  279:getfield        #160 <Field Drawable c>
	//  139  282:aload           12
	//  140  284:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//  141  287:pop             
			int k1 = i1 - rect1.left;
	//  142  288:iload_2         
	//  143  289:aload           12
	//  144  291:getfield        #411 <Field int Rect.left>
	//  145  294:isub            
	//  146  295:istore_3        
			i1 = i1 + C + rect1.right;
	//  147  296:iload_2         
	//  148  297:aload_0         
	//  149  298:getfield        #408 <Field int C>
	//  150  301:iadd            
	//  151  302:aload           12
	//  152  304:getfield        #414 <Field int Rect.right>
	//  153  307:iadd            
	//  154  308:istore_2        
			c.setBounds(k1, l2, i1, i3);
	//  155  309:aload_0         
	//  156  310:getfield        #160 <Field Drawable c>
	//  157  313:iload_3         
	//  158  314:iload           8
	//  159  316:iload_2         
	//  160  317:iload           9
	//  161  319:invokevirtual   #545 <Method void Drawable.setBounds(int, int, int, int)>
			Drawable drawable = getBackground();
	//  162  322:aload_0         
	//  163  323:invokevirtual   #548 <Method Drawable getBackground()>
	//  164  326:astore          11
			if(drawable != null)
	//* 165  328:aload           11
	//* 166  330:ifnull          344
				android.support.v4.a.a.a.a(drawable, k1, l2, i1, i3);
	//  167  333:aload           11
	//  168  335:iload_3         
	//  169  336:iload           8
	//  170  338:iload_2         
	//  171  339:iload           9
	//  172  341:invokestatic    #551 <Method void a.a(Drawable, int, int, int, int)>
		}
		super.draw(canvas);
	//  173  344:aload_0         
	//  174  345:aload_1         
	//  175  346:invokespecial   #553 <Method void CompoundButton.draw(Canvas)>
	//  176  349:return          
	}

	public void drawableHotspotChanged(float f1, float f2)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #388 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			super.drawableHotspotChanged(f1, f2);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:invokespecial   #557 <Method void CompoundButton.drawableHotspotChanged(float, float)>
		if(c != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #160 <Field Drawable c>
	//*   9   18:ifnull          30
			android.support.v4.a.a.a.a(c, f1, f2);
	//   10   21:aload_0         
	//   11   22:getfield        #160 <Field Drawable c>
	//   12   25:fload_1         
	//   13   26:fload_2         
	//   14   27:invokestatic    #560 <Method void a.a(Drawable, float, float)>
		if(h != null)
	//*  15   30:aload_0         
	//*  16   31:getfield        #171 <Field Drawable h>
	//*  17   34:ifnull          46
			android.support.v4.a.a.a.a(h, f1, f2);
	//   18   37:aload_0         
	//   19   38:getfield        #171 <Field Drawable h>
	//   20   41:fload_1         
	//   21   42:fload_2         
	//   22   43:invokestatic    #560 <Method void a.a(Drawable, float, float)>
	//   23   46:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #563 <Method void CompoundButton.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #333 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		Drawable drawable = c;
	//    5    9:aload_0         
	//    6   10:getfield        #160 <Field Drawable c>
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
	//*  17   28:invokevirtual   #329 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #337 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		drawable = h;
	//   25   43:aload_0         
	//   26   44:getfield        #171 <Field Drawable h>
	//   27   47:astore          4
		flag1 = flag;
	//   28   49:iload_1         
	//   29   50:istore_2        
		if(drawable != null)
	//*  30   51:aload           4
	//*  31   53:ifnull          75
		{
			flag1 = flag;
	//   32   56:iload_1         
	//   33   57:istore_2        
			if(drawable.isStateful())
	//*  34   58:aload           4
	//*  35   60:invokevirtual   #329 <Method boolean Drawable.isStateful()>
	//*  36   63:ifeq            75
				flag1 = flag | drawable.setState(ai);
	//   37   66:iload_1         
	//   38   67:aload           4
	//   39   69:aload_3         
	//   40   70:invokevirtual   #337 <Method boolean Drawable.setState(int[])>
	//   41   73:ior             
	//   42   74:istore_2        
		}
		if(flag1)
	//*  43   75:iload_2         
	//*  44   76:ifeq            83
			invalidate();
	//   45   79:aload_0         
	//   46   80:invokevirtual   #566 <Method void invalidate()>
	//   47   83:return          
	}

	public int getCompoundPaddingLeft()
	{
		if(!android.support.v7.widget.bd.a(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #440 <Method boolean android.support.v7.widget.bd.a(android.view.View)>
	//*   2    4:ifne            12
			return super.getCompoundPaddingLeft();
	//    3    7:aload_0         
	//    4    8:invokespecial   #569 <Method int CompoundButton.getCompoundPaddingLeft()>
	//    5   11:ireturn         
		int j1 = super.getCompoundPaddingLeft() + A;
	//    6   12:aload_0         
	//    7   13:invokespecial   #569 <Method int CompoundButton.getCompoundPaddingLeft()>
	//    8   16:aload_0         
	//    9   17:getfield        #462 <Field int A>
	//   10   20:iadd            
	//   11   21:istore_2        
		int i1 = j1;
	//   12   22:iload_2         
	//   13   23:istore_1        
		if(!TextUtils.isEmpty(getText()))
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #573 <Method CharSequence getText()>
	//*  16   28:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   31:ifne            41
			i1 = j1 + o;
	//   18   34:iload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #210 <Field int o>
	//   21   39:iadd            
	//   22   40:istore_1        
		return i1;
	//   23   41:iload_1         
	//   24   42:ireturn         
	}

	public int getCompoundPaddingRight()
	{
		if(android.support.v7.widget.bd.a(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #440 <Method boolean android.support.v7.widget.bd.a(android.view.View)>
	//*   2    4:ifeq            12
			return super.getCompoundPaddingRight();
	//    3    7:aload_0         
	//    4    8:invokespecial   #582 <Method int CompoundButton.getCompoundPaddingRight()>
	//    5   11:ireturn         
		int j1 = super.getCompoundPaddingRight() + A;
	//    6   12:aload_0         
	//    7   13:invokespecial   #582 <Method int CompoundButton.getCompoundPaddingRight()>
	//    8   16:aload_0         
	//    9   17:getfield        #462 <Field int A>
	//   10   20:iadd            
	//   11   21:istore_2        
		int i1 = j1;
	//   12   22:iload_2         
	//   13   23:istore_1        
		if(!TextUtils.isEmpty(getText()))
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #573 <Method CharSequence getText()>
	//*  16   28:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   31:ifne            41
			i1 = j1 + o;
	//   18   34:iload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #210 <Field int o>
	//   21   39:iadd            
	//   22   40:istore_1        
		return i1;
	//   23   41:iload_1         
	//   24   42:ireturn         
	}

	public boolean getShowText()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field boolean s>
	//    2    4:ireturn         
	}

	public boolean getSplitTrack()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field boolean p>
	//    2    4:ireturn         
	}

	public int getSwitchMinWidth()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field int n>
	//    2    4:ireturn         
	}

	public int getSwitchPadding()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field int o>
	//    2    4:ireturn         
	}

	public CharSequence getTextOff()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field CharSequence r>
	//    2    4:areturn         
	}

	public CharSequence getTextOn()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field CharSequence q>
	//    2    4:areturn         
	}

	public Drawable getThumbDrawable()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field Drawable c>
	//    2    4:areturn         
	}

	public int getThumbTextPadding()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field int m>
	//    2    4:ireturn         
	}

	public ColorStateList getThumbTintList()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ColorStateList d>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getThumbTintMode()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field android.graphics.PorterDuff$Mode e>
	//    2    4:areturn         
	}

	public Drawable getTrackDrawable()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field Drawable h>
	//    2    4:areturn         
	}

	public ColorStateList getTrackTintList()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field ColorStateList i>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getTrackTintMode()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field android.graphics.PorterDuff$Mode j>
	//    2    4:areturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #388 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          69
		{
			super.jumpDrawablesToCurrentState();
	//    3    8:aload_0         
	//    4    9:invokespecial   #599 <Method void CompoundButton.jumpDrawablesToCurrentState()>
			if(c != null)
	//*   5   12:aload_0         
	//*   6   13:getfield        #160 <Field Drawable c>
	//*   7   16:ifnull          26
				c.jumpToCurrentState();
	//    8   19:aload_0         
	//    9   20:getfield        #160 <Field Drawable c>
	//   10   23:invokevirtual   #602 <Method void Drawable.jumpToCurrentState()>
			if(h != null)
	//*  11   26:aload_0         
	//*  12   27:getfield        #171 <Field Drawable h>
	//*  13   30:ifnull          40
				h.jumpToCurrentState();
	//   14   33:aload_0         
	//   15   34:getfield        #171 <Field Drawable h>
	//   16   37:invokevirtual   #602 <Method void Drawable.jumpToCurrentState()>
			if(a != null && a.isStarted())
	//*  17   40:aload_0         
	//*  18   41:getfield        #377 <Field ObjectAnimator a>
	//*  19   44:ifnull          69
	//*  20   47:aload_0         
	//*  21   48:getfield        #377 <Field ObjectAnimator a>
	//*  22   51:invokevirtual   #605 <Method boolean ObjectAnimator.isStarted()>
	//*  23   54:ifeq            69
			{
				a.end();
	//   24   57:aload_0         
	//   25   58:getfield        #377 <Field ObjectAnimator a>
	//   26   61:invokevirtual   #608 <Method void ObjectAnimator.end()>
				a = null;
	//   27   64:aload_0         
	//   28   65:aconst_null     
	//   29   66:putfield        #377 <Field ObjectAnimator a>
			}
		}
	//   30   69:return          
	}

	protected int[] onCreateDrawableState(int i1)
	{
		int ai[] = super.onCreateDrawableState(i1 + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #612 <Method int[] CompoundButton.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(isChecked())
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #274 <Method boolean isChecked()>
	//*   8   12:ifeq            23
			mergeDrawableStates(ai, N);
	//    9   15:aload_2         
	//   10   16:getstatic       #75  <Field int[] N>
	//   11   19:invokestatic    #616 <Method int[] mergeDrawableStates(int[], int[])>
	//   12   22:pop             
		return ai;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #619 <Method void CompoundButton.onDraw(Canvas)>
		Object obj = ((Object) (M));
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field Rect M>
	//    5    9:astore          9
		Drawable drawable = h;
	//    6   11:aload_0         
	//    7   12:getfield        #171 <Field Drawable h>
	//    8   15:astore          11
		if(drawable != null)
	//*   9   17:aload           11
	//*  10   19:ifnull          33
			drawable.getPadding(((Rect) (obj)));
	//   11   22:aload           11
	//   12   24:aload           9
	//   13   26:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   14   29:pop             
		else
	//*  15   30:goto            38
			((Rect) (obj)).setEmpty();
	//   16   33:aload           9
	//   17   35:invokevirtual   #622 <Method void Rect.setEmpty()>
		int l1 = E;
	//   18   38:aload_0         
	//   19   39:getfield        #404 <Field int E>
	//   20   42:istore          4
		int i2 = G;
	//   21   44:aload_0         
	//   22   45:getfield        #416 <Field int G>
	//   23   48:istore          5
		int j2 = ((Rect) (obj)).top;
	//   24   50:aload           9
	//   25   52:getfield        #538 <Field int Rect.top>
	//   26   55:istore          6
		int k2 = ((Rect) (obj)).bottom;
	//   27   57:aload           9
	//   28   59:getfield        #541 <Field int Rect.bottom>
	//   29   62:istore          7
		Object obj1 = ((Object) (c));
	//   30   64:aload_0         
	//   31   65:getfield        #160 <Field Drawable c>
	//   32   68:astore          10
		if(drawable != null)
	//*  33   70:aload           11
	//*  34   72:ifnull          168
			if(p && obj1 != null)
	//*  35   75:aload_0         
	//*  36   76:getfield        #215 <Field boolean p>
	//*  37   79:ifeq            162
	//*  38   82:aload           10
	//*  39   84:ifnull          162
			{
				Rect rect = android.support.v7.widget.y.a(((Drawable) (obj1)));
	//   40   87:aload           10
	//   41   89:invokestatic    #458 <Method Rect android.support.v7.widget.y.a(Drawable)>
	//   42   92:astore          12
				((Drawable) (obj1)).copyBounds(((Rect) (obj)));
	//   43   94:aload           10
	//   44   96:aload           9
	//   45   98:invokevirtual   #626 <Method void Drawable.copyBounds(Rect)>
				obj.left = ((Rect) (obj)).left + rect.left;
	//   46  101:aload           9
	//   47  103:aload           9
	//   48  105:getfield        #411 <Field int Rect.left>
	//   49  108:aload           12
	//   50  110:getfield        #411 <Field int Rect.left>
	//   51  113:iadd            
	//   52  114:putfield        #411 <Field int Rect.left>
				obj.right = ((Rect) (obj)).right - rect.right;
	//   53  117:aload           9
	//   54  119:aload           9
	//   55  121:getfield        #414 <Field int Rect.right>
	//   56  124:aload           12
	//   57  126:getfield        #414 <Field int Rect.right>
	//   58  129:isub            
	//   59  130:putfield        #414 <Field int Rect.right>
				int i1 = canvas.save();
	//   60  133:aload_1         
	//   61  134:invokevirtual   #631 <Method int Canvas.save()>
	//   62  137:istore_2        
				canvas.clipRect(((Rect) (obj)), android.graphics.Region.Op.DIFFERENCE);
	//   63  138:aload_1         
	//   64  139:aload           9
	//   65  141:getstatic       #637 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   66  144:invokevirtual   #641 <Method boolean Canvas.clipRect(Rect, android.graphics.Region$Op)>
	//   67  147:pop             
				drawable.draw(canvas);
	//   68  148:aload           11
	//   69  150:aload_1         
	//   70  151:invokevirtual   #642 <Method void Drawable.draw(Canvas)>
				canvas.restoreToCount(i1);
	//   71  154:aload_1         
	//   72  155:iload_2         
	//   73  156:invokevirtual   #645 <Method void Canvas.restoreToCount(int)>
			} else
	//*  74  159:goto            168
			{
				drawable.draw(canvas);
	//   75  162:aload           11
	//   76  164:aload_1         
	//   77  165:invokevirtual   #642 <Method void Drawable.draw(Canvas)>
			}
		int k1 = canvas.save();
	//   78  168:aload_1         
	//   79  169:invokevirtual   #631 <Method int Canvas.save()>
	//   80  172:istore_3        
		if(obj1 != null)
	//*  81  173:aload           10
	//*  82  175:ifnull          184
			((Drawable) (obj1)).draw(canvas);
	//   83  178:aload           10
	//   84  180:aload_1         
	//   85  181:invokevirtual   #642 <Method void Drawable.draw(Canvas)>
		if(getTargetCheckedState())
	//*  86  184:aload_0         
	//*  87  185:invokespecial   #443 <Method boolean getTargetCheckedState()>
	//*  88  188:ifeq            200
			obj = ((Object) (J));
	//   89  191:aload_0         
	//   90  192:getfield        #647 <Field Layout J>
	//   91  195:astore          9
		else
	//*  92  197:goto            206
			obj = ((Object) (K));
	//   93  200:aload_0         
	//   94  201:getfield        #649 <Field Layout K>
	//   95  204:astore          9
		if(obj != null)
	//*  96  206:aload           9
	//*  97  208:ifnull          340
		{
			int ai[] = getDrawableState();
	//   98  211:aload_0         
	//   99  212:invokevirtual   #333 <Method int[] getDrawableState()>
	//  100  215:astore          11
			if(I != null)
	//* 101  217:aload_0         
	//* 102  218:getfield        #473 <Field ColorStateList I>
	//* 103  221:ifnull          241
				H.setColor(I.getColorForState(ai, 0));
	//  104  224:aload_0         
	//  105  225:getfield        #126 <Field TextPaint H>
	//  106  228:aload_0         
	//  107  229:getfield        #473 <Field ColorStateList I>
	//  108  232:aload           11
	//  109  234:iconst_0        
	//  110  235:invokevirtual   #655 <Method int ColorStateList.getColorForState(int[], int)>
	//  111  238:invokevirtual   #658 <Method void TextPaint.setColor(int)>
			H.drawableState = ai;
	//  112  241:aload_0         
	//  113  242:getfield        #126 <Field TextPaint H>
	//  114  245:aload           11
	//  115  247:putfield        #661 <Field int[] TextPaint.drawableState>
			int j1;
			if(obj1 != null)
	//* 116  250:aload           10
	//* 117  252:ifnull          277
			{
				obj1 = ((Object) (((Drawable) (obj1)).getBounds()));
	//  118  255:aload           10
	//  119  257:invokevirtual   #665 <Method Rect Drawable.getBounds()>
	//  120  260:astore          10
				j1 = ((Rect) (obj1)).left + ((Rect) (obj1)).right;
	//  121  262:aload           10
	//  122  264:getfield        #411 <Field int Rect.left>
	//  123  267:aload           10
	//  124  269:getfield        #414 <Field int Rect.right>
	//  125  272:iadd            
	//  126  273:istore_2        
			} else
	//* 127  274:goto            282
			{
				j1 = getWidth();
	//  128  277:aload_0         
	//  129  278:invokevirtual   #668 <Method int getWidth()>
	//  130  281:istore_2        
			}
			j1 /= 2;
	//  131  282:iload_2         
	//  132  283:iconst_2        
	//  133  284:idiv            
	//  134  285:istore_2        
			int l2 = ((Layout) (obj)).getWidth() / 2;
	//  135  286:aload           9
	//  136  288:invokevirtual   #669 <Method int Layout.getWidth()>
	//  137  291:iconst_2        
	//  138  292:idiv            
	//  139  293:istore          8
			l1 = (l1 + j2 + (i2 - k2)) / 2;
	//  140  295:iload           4
	//  141  297:iload           6
	//  142  299:iadd            
	//  143  300:iload           5
	//  144  302:iload           7
	//  145  304:isub            
	//  146  305:iadd            
	//  147  306:iconst_2        
	//  148  307:idiv            
	//  149  308:istore          4
			i2 = ((Layout) (obj)).getHeight() / 2;
	//  150  310:aload           9
	//  151  312:invokevirtual   #672 <Method int Layout.getHeight()>
	//  152  315:iconst_2        
	//  153  316:idiv            
	//  154  317:istore          5
			canvas.translate(j1 - l2, l1 - i2);
	//  155  319:aload_1         
	//  156  320:iload_2         
	//  157  321:iload           8
	//  158  323:isub            
	//  159  324:i2f             
	//  160  325:iload           4
	//  161  327:iload           5
	//  162  329:isub            
	//  163  330:i2f             
	//  164  331:invokevirtual   #675 <Method void Canvas.translate(float, float)>
			((Layout) (obj)).draw(canvas);
	//  165  334:aload           9
	//  166  336:aload_1         
	//  167  337:invokevirtual   #676 <Method void Layout.draw(Canvas)>
		}
		canvas.restoreToCount(k1);
	//  168  340:aload_1         
	//  169  341:iload_3         
	//  170  342:invokevirtual   #645 <Method void Canvas.restoreToCount(int)>
	//  171  345:return          
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #680 <Method void CompoundButton.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName("android.widget.Switch");
	//    3    5:aload_1         
	//    4    6:ldc2            #682 <String "android.widget.Switch">
	//    5    9:invokevirtual   #688 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    6   12:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #388 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          102
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #692 <Method void CompoundButton.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName("android.widget.Switch");
	//    6   13:aload_1         
	//    7   14:ldc2            #682 <String "android.widget.Switch">
	//    8   17:invokevirtual   #695 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
			CharSequence charsequence;
			if(isChecked())
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #274 <Method boolean isChecked()>
	//*  11   24:ifeq            35
				charsequence = q;
	//   12   27:aload_0         
	//   13   28:getfield        #179 <Field CharSequence q>
	//   14   31:astore_2        
			else
	//*  15   32:goto            40
				charsequence = r;
	//   16   35:aload_0         
	//   17   36:getfield        #184 <Field CharSequence r>
	//   18   39:astore_2        
			if(!TextUtils.isEmpty(charsequence))
	//*  19   40:aload_2         
	//*  20   41:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   44:ifne            102
			{
				CharSequence charsequence1 = accessibilitynodeinfo.getText();
	//   22   47:aload_1         
	//   23   48:invokevirtual   #696 <Method CharSequence AccessibilityNodeInfo.getText()>
	//   24   51:astore_3        
				if(TextUtils.isEmpty(charsequence1))
	//*  25   52:aload_3         
	//*  26   53:invokestatic    #579 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   56:ifeq            65
				{
					accessibilitynodeinfo.setText(charsequence);
	//   28   59:aload_1         
	//   29   60:aload_2         
	//   30   61:invokevirtual   #699 <Method void AccessibilityNodeInfo.setText(CharSequence)>
					return;
	//   31   64:return          
				}
				StringBuilder stringbuilder = new StringBuilder();
	//   32   65:new             #701 <Class StringBuilder>
	//   33   68:dup             
	//   34   69:invokespecial   #702 <Method void StringBuilder()>
	//   35   72:astore          4
				stringbuilder.append(charsequence1);
	//   36   74:aload           4
	//   37   76:aload_3         
	//   38   77:invokevirtual   #706 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   39   80:pop             
				stringbuilder.append(' ');
	//   40   81:aload           4
	//   41   83:bipush          32
	//   42   85:invokevirtual   #709 <Method StringBuilder StringBuilder.append(char)>
	//   43   88:pop             
				stringbuilder.append(charsequence);
	//   44   89:aload           4
	//   45   91:aload_2         
	//   46   92:invokevirtual   #706 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   47   95:pop             
				accessibilitynodeinfo.setText(((CharSequence) (stringbuilder)));
	//   48   96:aload_1         
	//   49   97:aload           4
	//   50   99:invokevirtual   #699 <Method void AccessibilityNodeInfo.setText(CharSequence)>
			}
		}
	//   51  102:return          
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		super.onLayout(flag, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #713 <Method void CompoundButton.onLayout(boolean, int, int, int, int)>
		Drawable drawable = c;
	//    7   11:aload_0         
	//    8   12:getfield        #160 <Field Drawable c>
	//    9   15:astore          6
		j1 = 0;
	//   10   17:iconst_0        
	//   11   18:istore_3        
		if(drawable != null)
	//*  12   19:aload           6
	//*  13   21:ifnull          99
		{
			Rect rect = M;
	//   14   24:aload_0         
	//   15   25:getfield        #119 <Field Rect M>
	//   16   28:astore          6
			if(h != null)
	//*  17   30:aload_0         
	//*  18   31:getfield        #171 <Field Drawable h>
	//*  19   34:ifnull          50
				h.getPadding(rect);
	//   20   37:aload_0         
	//   21   38:getfield        #171 <Field Drawable h>
	//   22   41:aload           6
	//   23   43:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   24   46:pop             
			else
	//*  25   47:goto            55
				rect.setEmpty();
	//   26   50:aload           6
	//   27   52:invokevirtual   #622 <Method void Rect.setEmpty()>
			Rect rect1 = android.support.v7.widget.y.a(c);
	//   28   55:aload_0         
	//   29   56:getfield        #160 <Field Drawable c>
	//   30   59:invokestatic    #458 <Method Rect android.support.v7.widget.y.a(Drawable)>
	//   31   62:astore          7
			j1 = Math.max(0, rect1.left - rect.left);
	//   32   64:iconst_0        
	//   33   65:aload           7
	//   34   67:getfield        #411 <Field int Rect.left>
	//   35   70:aload           6
	//   36   72:getfield        #411 <Field int Rect.left>
	//   37   75:isub            
	//   38   76:invokestatic    #716 <Method int Math.max(int, int)>
	//   39   79:istore_3        
			i1 = Math.max(0, rect1.right - rect.right);
	//   40   80:iconst_0        
	//   41   81:aload           7
	//   42   83:getfield        #414 <Field int Rect.right>
	//   43   86:aload           6
	//   44   88:getfield        #414 <Field int Rect.right>
	//   45   91:isub            
	//   46   92:invokestatic    #716 <Method int Math.max(int, int)>
	//   47   95:istore_2        
		} else
	//*  48   96:goto            101
		{
			i1 = 0;
	//   49   99:iconst_0        
	//   50  100:istore_2        
		}
		if(android.support.v7.widget.bd.a(((android.view.View) (this))))
	//*  51  101:aload_0         
	//*  52  102:invokestatic    #440 <Method boolean android.support.v7.widget.bd.a(android.view.View)>
	//*  53  105:ifeq            137
		{
			k1 = getPaddingLeft() + j1;
	//   54  108:aload_0         
	//   55  109:invokevirtual   #719 <Method int getPaddingLeft()>
	//   56  112:iload_3         
	//   57  113:iadd            
	//   58  114:istore          4
			i1 = (A + k1) - j1 - i1;
	//   59  116:aload_0         
	//   60  117:getfield        #462 <Field int A>
	//   61  120:iload           4
	//   62  122:iadd            
	//   63  123:iload_3         
	//   64  124:isub            
	//   65  125:iload_2         
	//   66  126:isub            
	//   67  127:istore_2        
			j1 = k1;
	//   68  128:iload           4
	//   69  130:istore_3        
			k1 = i1;
	//   70  131:iload_2         
	//   71  132:istore          4
		} else
	//*  72  134:goto            162
		{
			k1 = getWidth() - getPaddingRight() - i1;
	//   73  137:aload_0         
	//   74  138:invokevirtual   #668 <Method int getWidth()>
	//   75  141:aload_0         
	//   76  142:invokevirtual   #722 <Method int getPaddingRight()>
	//   77  145:isub            
	//   78  146:iload_2         
	//   79  147:isub            
	//   80  148:istore          4
			j1 = (k1 - A) + j1 + i1;
	//   81  150:iload           4
	//   82  152:aload_0         
	//   83  153:getfield        #462 <Field int A>
	//   84  156:isub            
	//   85  157:iload_3         
	//   86  158:iadd            
	//   87  159:iload_2         
	//   88  160:iadd            
	//   89  161:istore_3        
		}
		i1 = getGravity() & 0x70;
	//   90  162:aload_0         
	//   91  163:invokevirtual   #725 <Method int getGravity()>
	//   92  166:bipush          112
	//   93  168:iand            
	//   94  169:istore_2        
		if(i1 == 16) goto _L2; else goto _L1
	//   95  170:iload_2         
	//   96  171:bipush          16
	//   97  173:icmpeq          220
_L1:
		if(i1 == 80) goto _L4; else goto _L3
	//   98  176:iload_2         
	//   99  177:bipush          80
	//  100  179:icmpeq          198
_L3:
		i1 = getPaddingTop();
	//  101  182:aload_0         
	//  102  183:invokevirtual   #728 <Method int getPaddingTop()>
	//  103  186:istore_2        
_L6:
		l1 = B + i1;
	//  104  187:aload_0         
	//  105  188:getfield        #730 <Field int B>
	//  106  191:iload_2         
	//  107  192:iadd            
	//  108  193:istore          5
		break; /* Loop/switch isn't completed */
	//  109  195:goto            247
_L4:
		l1 = getHeight() - getPaddingBottom();
	//  110  198:aload_0         
	//  111  199:invokevirtual   #731 <Method int getHeight()>
	//  112  202:aload_0         
	//  113  203:invokevirtual   #734 <Method int getPaddingBottom()>
	//  114  206:isub            
	//  115  207:istore          5
		i1 = l1 - B;
	//  116  209:iload           5
	//  117  211:aload_0         
	//  118  212:getfield        #730 <Field int B>
	//  119  215:isub            
	//  120  216:istore_2        
		break; /* Loop/switch isn't completed */
	//  121  217:goto            247
_L2:
		i1 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - B / 2;
	//  122  220:aload_0         
	//  123  221:invokevirtual   #728 <Method int getPaddingTop()>
	//  124  224:aload_0         
	//  125  225:invokevirtual   #731 <Method int getHeight()>
	//  126  228:iadd            
	//  127  229:aload_0         
	//  128  230:invokevirtual   #734 <Method int getPaddingBottom()>
	//  129  233:isub            
	//  130  234:iconst_2        
	//  131  235:idiv            
	//  132  236:aload_0         
	//  133  237:getfield        #730 <Field int B>
	//  134  240:iconst_2        
	//  135  241:idiv            
	//  136  242:isub            
	//  137  243:istore_2        
		if(true) goto _L6; else goto _L5
	//  138  244:goto            187
_L5:
		D = j1;
	//  139  247:aload_0         
	//  140  248:iload_3         
	//  141  249:putfield        #406 <Field int D>
		E = i1;
	//  142  252:aload_0         
	//  143  253:iload_2         
	//  144  254:putfield        #404 <Field int E>
		G = l1;
	//  145  257:aload_0         
	//  146  258:iload           5
	//  147  260:putfield        #416 <Field int G>
		F = k1;
	//  148  263:aload_0         
	//  149  264:iload           4
	//  150  266:putfield        #535 <Field int F>
		return;
	//  151  269:return          
	}

	public void onMeasure(int i1, int j1)
	{
		if(s)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field boolean s>
	//*   2    4:ifeq            45
		{
			if(J == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #647 <Field Layout J>
	//*   5   11:ifnonnull       26
				J = a(q);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #179 <Field CharSequence q>
	//   10   20:invokespecial   #737 <Method Layout a(CharSequence)>
	//   11   23:putfield        #647 <Field Layout J>
			if(K == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #649 <Field Layout K>
	//*  14   30:ifnonnull       45
				K = a(r);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #184 <Field CharSequence r>
	//   19   39:invokespecial   #737 <Method Layout a(CharSequence)>
	//   20   42:putfield        #649 <Field Layout K>
		}
		Rect rect = M;
	//   21   45:aload_0         
	//   22   46:getfield        #119 <Field Rect M>
	//   23   49:astore          9
		Drawable drawable = c;
	//   24   51:aload_0         
	//   25   52:getfield        #160 <Field Drawable c>
	//   26   55:astore          10
		int j2 = 0;
	//   27   57:iconst_0        
	//   28   58:istore          6
		int k1;
		int l1;
		if(drawable != null)
	//*  29   60:aload           10
	//*  30   62:ifnull          107
		{
			c.getPadding(rect);
	//   31   65:aload_0         
	//   32   66:getfield        #160 <Field Drawable c>
	//   33   69:aload           9
	//   34   71:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   35   74:pop             
			l1 = c.getIntrinsicWidth() - rect.left - rect.right;
	//   36   75:aload_0         
	//   37   76:getfield        #160 <Field Drawable c>
	//   38   79:invokevirtual   #740 <Method int Drawable.getIntrinsicWidth()>
	//   39   82:aload           9
	//   40   84:getfield        #411 <Field int Rect.left>
	//   41   87:isub            
	//   42   88:aload           9
	//   43   90:getfield        #414 <Field int Rect.right>
	//   44   93:isub            
	//   45   94:istore          4
			k1 = c.getIntrinsicHeight();
	//   46   96:aload_0         
	//   47   97:getfield        #160 <Field Drawable c>
	//   48  100:invokevirtual   #743 <Method int Drawable.getIntrinsicHeight()>
	//   49  103:istore_3        
		} else
	//*  50  104:goto            112
		{
			l1 = 0;
	//   51  107:iconst_0        
	//   52  108:istore          4
			k1 = 0;
	//   53  110:iconst_0        
	//   54  111:istore_3        
		}
		int i2;
		if(s)
	//*  55  112:aload_0         
	//*  56  113:getfield        #192 <Field boolean s>
	//*  57  116:ifeq            148
			i2 = Math.max(J.getWidth(), K.getWidth()) + m * 2;
	//   58  119:aload_0         
	//   59  120:getfield        #647 <Field Layout J>
	//   60  123:invokevirtual   #669 <Method int Layout.getWidth()>
	//   61  126:aload_0         
	//   62  127:getfield        #649 <Field Layout K>
	//   63  130:invokevirtual   #669 <Method int Layout.getWidth()>
	//   64  133:invokestatic    #716 <Method int Math.max(int, int)>
	//   65  136:aload_0         
	//   66  137:getfield        #200 <Field int m>
	//   67  140:iconst_2        
	//   68  141:imul            
	//   69  142:iadd            
	//   70  143:istore          5
		else
	//*  71  145:goto            151
			i2 = 0;
	//   72  148:iconst_0        
	//   73  149:istore          5
		C = Math.max(i2, l1);
	//   74  151:aload_0         
	//   75  152:iload           5
	//   76  154:iload           4
	//   77  156:invokestatic    #716 <Method int Math.max(int, int)>
	//   78  159:putfield        #408 <Field int C>
		if(h != null)
	//*  79  162:aload_0         
	//*  80  163:getfield        #171 <Field Drawable h>
	//*  81  166:ifnull          191
		{
			h.getPadding(rect);
	//   82  169:aload_0         
	//   83  170:getfield        #171 <Field Drawable h>
	//   84  173:aload           9
	//   85  175:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   86  178:pop             
			l1 = h.getIntrinsicHeight();
	//   87  179:aload_0         
	//   88  180:getfield        #171 <Field Drawable h>
	//   89  183:invokevirtual   #743 <Method int Drawable.getIntrinsicHeight()>
	//   90  186:istore          4
		} else
	//*  91  188:goto            200
		{
			rect.setEmpty();
	//   92  191:aload           9
	//   93  193:invokevirtual   #622 <Method void Rect.setEmpty()>
			l1 = j2;
	//   94  196:iload           6
	//   95  198:istore          4
		}
		int l2 = rect.left;
	//   96  200:aload           9
	//   97  202:getfield        #411 <Field int Rect.left>
	//   98  205:istore          8
		int k2 = rect.right;
	//   99  207:aload           9
	//  100  209:getfield        #414 <Field int Rect.right>
	//  101  212:istore          7
		j2 = k2;
	//  102  214:iload           7
	//  103  216:istore          6
		i2 = l2;
	//  104  218:iload           8
	//  105  220:istore          5
		if(c != null)
	//* 106  222:aload_0         
	//* 107  223:getfield        #160 <Field Drawable c>
	//* 108  226:ifnull          262
		{
			Rect rect1 = android.support.v7.widget.y.a(c);
	//  109  229:aload_0         
	//  110  230:getfield        #160 <Field Drawable c>
	//  111  233:invokestatic    #458 <Method Rect android.support.v7.widget.y.a(Drawable)>
	//  112  236:astore          9
			i2 = Math.max(l2, rect1.left);
	//  113  238:iload           8
	//  114  240:aload           9
	//  115  242:getfield        #411 <Field int Rect.left>
	//  116  245:invokestatic    #716 <Method int Math.max(int, int)>
	//  117  248:istore          5
			j2 = Math.max(k2, rect1.right);
	//  118  250:iload           7
	//  119  252:aload           9
	//  120  254:getfield        #414 <Field int Rect.right>
	//  121  257:invokestatic    #716 <Method int Math.max(int, int)>
	//  122  260:istore          6
		}
		i2 = Math.max(n, C * 2 + i2 + j2);
	//  123  262:aload_0         
	//  124  263:getfield        #205 <Field int n>
	//  125  266:aload_0         
	//  126  267:getfield        #408 <Field int C>
	//  127  270:iconst_2        
	//  128  271:imul            
	//  129  272:iload           5
	//  130  274:iadd            
	//  131  275:iload           6
	//  132  277:iadd            
	//  133  278:invokestatic    #716 <Method int Math.max(int, int)>
	//  134  281:istore          5
		k1 = Math.max(l1, k1);
	//  135  283:iload           4
	//  136  285:iload_3         
	//  137  286:invokestatic    #716 <Method int Math.max(int, int)>
	//  138  289:istore_3        
		A = i2;
	//  139  290:aload_0         
	//  140  291:iload           5
	//  141  293:putfield        #462 <Field int A>
		B = k1;
	//  142  296:aload_0         
	//  143  297:iload_3         
	//  144  298:putfield        #730 <Field int B>
		super.onMeasure(i1, j1);
	//  145  301:aload_0         
	//  146  302:iload_1         
	//  147  303:iload_2         
	//  148  304:invokespecial   #745 <Method void CompoundButton.onMeasure(int, int)>
		if(getMeasuredHeight() < k1)
	//* 149  307:aload_0         
	//* 150  308:invokevirtual   #748 <Method int getMeasuredHeight()>
	//* 151  311:iload_3         
	//* 152  312:icmpge          324
			setMeasuredDimension(getMeasuredWidthAndState(), k1);
	//  153  315:aload_0         
	//  154  316:aload_0         
	//  155  317:invokevirtual   #751 <Method int getMeasuredWidthAndState()>
	//  156  320:iload_3         
	//  157  321:invokevirtual   #754 <Method void setMeasuredDimension(int, int)>
	//  158  324:return          
	}

	public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onPopulateAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #757 <Method void CompoundButton.onPopulateAccessibilityEvent(AccessibilityEvent)>
		CharSequence charsequence;
		if(isChecked())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #274 <Method boolean isChecked()>
	//*   5    9:ifeq            20
			charsequence = q;
	//    6   12:aload_0         
	//    7   13:getfield        #179 <Field CharSequence q>
	//    8   16:astore_2        
		else
	//*   9   17:goto            25
			charsequence = r;
	//   10   20:aload_0         
	//   11   21:getfield        #184 <Field CharSequence r>
	//   12   24:astore_2        
		if(charsequence != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          40
			accessibilityevent.getText().add(((Object) (charsequence)));
	//   15   29:aload_1         
	//   16   30:invokevirtual   #760 <Method List AccessibilityEvent.getText()>
	//   17   33:aload_2         
	//   18   34:invokeinterface #766 <Method boolean List.add(Object)>
	//   19   39:pop             
	//   20   40:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		x.addMovement(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field VelocityTracker x>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #769 <Method void VelocityTracker.addMovement(MotionEvent)>
		switch(motionevent.getActionMasked())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #772 <Method int MotionEvent.getActionMasked()>
		{
		default:
			break;

	//*   6   12:tableswitch     0 3: default 44
	//	               0 283
	//	               1 247
	//	               2 47
	//	               3 247
	//*   7   44:goto            324
		case 2: // '\002'
			switch(t)
	//*   8   47:aload_0         
	//*   9   48:getfield        #418 <Field int t>
			{
	//*  10   51:tableswitch     0 2: default 76
	//	               0 324
	//	               1 174
	//	               2 79
	//*  11   76:goto            324
			case 2: // '\002'
				float f7 = motionevent.getX();
	//   12   79:aload_1         
	//   13   80:invokevirtual   #775 <Method float MotionEvent.getX()>
	//   14   83:fstore          4
				int i1 = getThumbScrollRange();
	//   15   85:aload_0         
	//   16   86:invokespecial   #455 <Method int getThumbScrollRange()>
	//   17   89:istore          5
				float f1 = f7 - v;
	//   18   91:fload           4
	//   19   93:aload_0         
	//   20   94:getfield        #777 <Field float v>
	//   21   97:fsub            
	//   22   98:fstore_2        
				if(i1 != 0)
	//*  23   99:iload           5
	//*  24  101:ifeq            113
					f1 /= i1;
	//   25  104:fload_2         
	//   26  105:iload           5
	//   27  107:i2f             
	//   28  108:fdiv            
	//   29  109:fstore_2        
				else
	//*  30  110:goto            128
				if(f1 > 0.0F)
	//*  31  113:fload_2         
	//*  32  114:fconst_0        
	//*  33  115:fcmpl           
	//*  34  116:ifle            124
					f1 = 1.0F;
	//   35  119:fconst_1        
	//   36  120:fstore_2        
				else
	//*  37  121:goto            128
					f1 = -1F;
	//   38  124:ldc2            #778 <Float -1F>
	//   39  127:fstore_2        
				float f4 = f1;
	//   40  128:fload_2         
	//   41  129:fstore_3        
				if(android.support.v7.widget.bd.a(((android.view.View) (this))))
	//*  42  130:aload_0         
	//*  43  131:invokestatic    #440 <Method boolean android.support.v7.widget.bd.a(android.view.View)>
	//*  44  134:ifeq            140
					f4 = -f1;
	//   45  137:fload_2         
	//   46  138:fneg            
	//   47  139:fstore_3        
				f1 = a(z + f4, 0.0F, 1.0F);
	//   48  140:aload_0         
	//   49  141:getfield        #282 <Field float z>
	//   50  144:fload_3         
	//   51  145:fadd            
	//   52  146:fconst_0        
	//   53  147:fconst_1        
	//   54  148:invokestatic    #780 <Method float a(float, float, float)>
	//   55  151:fstore_2        
				if(f1 != z)
	//*  56  152:fload_2         
	//*  57  153:aload_0         
	//*  58  154:getfield        #282 <Field float z>
	//*  59  157:fcmpl           
	//*  60  158:ifeq            172
				{
					v = f7;
	//   61  161:aload_0         
	//   62  162:fload           4
	//   63  164:putfield        #777 <Field float v>
					setThumbPosition(f1);
	//   64  167:aload_0         
	//   65  168:fload_2         
	//   66  169:invokevirtual   #783 <Method void setThumbPosition(float)>
				}
				return true;
	//   67  172:iconst_1        
	//   68  173:ireturn         

			case 1: // '\001'
				float f2 = motionevent.getX();
	//   69  174:aload_1         
	//   70  175:invokevirtual   #775 <Method float MotionEvent.getX()>
	//   71  178:fstore_2        
				float f5 = motionevent.getY();
	//   72  179:aload_1         
	//   73  180:invokevirtual   #786 <Method float MotionEvent.getY()>
	//   74  183:fstore_3        
				if(Math.abs(f2 - v) > (float)u || Math.abs(f5 - w) > (float)u)
	//*  75  184:fload_2         
	//*  76  185:aload_0         
	//*  77  186:getfield        #777 <Field float v>
	//*  78  189:fsub            
	//*  79  190:invokestatic    #435 <Method float Math.abs(float)>
	//*  80  193:aload_0         
	//*  81  194:getfield        #262 <Field int u>
	//*  82  197:i2f             
	//*  83  198:fcmpl           
	//*  84  199:ifgt            220
	//*  85  202:fload_3         
	//*  86  203:aload_0         
	//*  87  204:getfield        #788 <Field float w>
	//*  88  207:fsub            
	//*  89  208:invokestatic    #435 <Method float Math.abs(float)>
	//*  90  211:aload_0         
	//*  91  212:getfield        #262 <Field int u>
	//*  92  215:i2f             
	//*  93  216:fcmpl           
	//*  94  217:ifle            324
				{
					t = 2;
	//   95  220:aload_0         
	//   96  221:iconst_2        
	//   97  222:putfield        #418 <Field int t>
					getParent().requestDisallowInterceptTouchEvent(true);
	//   98  225:aload_0         
	//   99  226:invokevirtual   #792 <Method ViewParent getParent()>
	//  100  229:iconst_1        
	//  101  230:invokeinterface #797 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
					v = f2;
	//  102  235:aload_0         
	//  103  236:fload_2         
	//  104  237:putfield        #777 <Field float v>
					w = f5;
	//  105  240:aload_0         
	//  106  241:fload_3         
	//  107  242:putfield        #788 <Field float w>
					return true;
	//  108  245:iconst_1        
	//  109  246:ireturn         
				}
				break;
			}
			break;

		case 1: // '\001'
		case 3: // '\003'
			if(t == 2)
	//* 110  247:aload_0         
	//* 111  248:getfield        #418 <Field int t>
	//* 112  251:iconst_2        
	//* 113  252:icmpne          268
			{
				b(motionevent);
	//  114  255:aload_0         
	//  115  256:aload_1         
	//  116  257:invokespecial   #799 <Method void b(MotionEvent)>
				super.onTouchEvent(motionevent);
	//  117  260:aload_0         
	//  118  261:aload_1         
	//  119  262:invokespecial   #366 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//  120  265:pop             
				return true;
	//  121  266:iconst_1        
	//  122  267:ireturn         
			}
			t = 0;
	//  123  268:aload_0         
	//  124  269:iconst_0        
	//  125  270:putfield        #418 <Field int t>
			x.clear();
	//  126  273:aload_0         
	//  127  274:getfield        #113 <Field VelocityTracker x>
	//  128  277:invokevirtual   #802 <Method void VelocityTracker.clear()>
			break;
	//  129  280:goto            324

		case 0: // '\0'
			float f3 = motionevent.getX();
	//  130  283:aload_1         
	//  131  284:invokevirtual   #775 <Method float MotionEvent.getX()>
	//  132  287:fstore_2        
			float f6 = motionevent.getY();
	//  133  288:aload_1         
	//  134  289:invokevirtual   #786 <Method float MotionEvent.getY()>
	//  135  292:fstore_3        
			if(isEnabled() && a(f3, f6))
	//* 136  293:aload_0         
	//* 137  294:invokevirtual   #424 <Method boolean isEnabled()>
	//* 138  297:ifeq            324
	//* 139  300:aload_0         
	//* 140  301:fload_2         
	//* 141  302:fload_3         
	//* 142  303:invokespecial   #804 <Method boolean a(float, float)>
	//* 143  306:ifeq            324
			{
				t = 1;
	//  144  309:aload_0         
	//  145  310:iconst_1        
	//  146  311:putfield        #418 <Field int t>
				v = f3;
	//  147  314:aload_0         
	//  148  315:fload_2         
	//  149  316:putfield        #777 <Field float v>
				w = f6;
	//  150  319:aload_0         
	//  151  320:fload_3         
	//  152  321:putfield        #788 <Field float w>
			}
			break;
		}
		return super.onTouchEvent(motionevent);
	//  153  324:aload_0         
	//  154  325:aload_1         
	//  155  326:invokespecial   #366 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//  156  329:ireturn         
	}

	public void setChecked(boolean flag)
	{
		super.setChecked(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #805 <Method void CompoundButton.setChecked(boolean)>
		flag = isChecked();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #274 <Method boolean isChecked()>
	//    5    9:istore_1        
		if(getWindowToken() != null && android.support.v4.view.s.x(((android.view.View) (this))))
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #809 <Method android.os.IBinder getWindowToken()>
	//*   8   14:ifnull          30
	//*   9   17:aload_0         
	//*  10   18:invokestatic    #813 <Method boolean s.x(android.view.View)>
	//*  11   21:ifeq            30
		{
			a(flag);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #815 <Method void a(boolean)>
			return;
	//   15   29:return          
		}
		c();
	//   16   30:aload_0         
	//   17   31:invokespecial   #817 <Method void c()>
		float f1;
		if(flag)
	//*  18   34:iload_1         
	//*  19   35:ifeq            43
			f1 = 1.0F;
	//   20   38:fconst_1        
	//   21   39:fstore_2        
		else
	//*  22   40:goto            45
			f1 = 0.0F;
	//   23   43:fconst_0        
	//   24   44:fstore_2        
		setThumbPosition(f1);
	//   25   45:aload_0         
	//   26   46:fload_2         
	//   27   47:invokevirtual   #783 <Method void setThumbPosition(float)>
	//   28   50:return          
	}

	public void setShowText(boolean flag)
	{
		if(s != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field boolean s>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			s = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #192 <Field boolean s>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #490 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setSplitTrack(boolean flag)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #215 <Field boolean p>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #566 <Method void invalidate()>
	//    5    9:return          
	}

	public void setSwitchMinWidth(int i1)
	{
		n = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #205 <Field int n>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #490 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setSwitchPadding(int i1)
	{
		o = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #210 <Field int o>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #490 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setSwitchTypeface(Typeface typeface)
	{
		if(H.getTypeface() != null && !H.getTypeface().equals(((Object) (typeface))) || H.getTypeface() == null && typeface != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field TextPaint H>
	//*   2    4:invokevirtual   #825 <Method Typeface TextPaint.getTypeface()>
	//*   3    7:ifnull          24
	//*   4   10:aload_0         
	//*   5   11:getfield        #126 <Field TextPaint H>
	//*   6   14:invokevirtual   #825 <Method Typeface TextPaint.getTypeface()>
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #828 <Method boolean Typeface.equals(Object)>
	//*   9   21:ifeq            38
	//*  10   24:aload_0         
	//*  11   25:getfield        #126 <Field TextPaint H>
	//*  12   28:invokevirtual   #825 <Method Typeface TextPaint.getTypeface()>
	//*  13   31:ifnonnull       55
	//*  14   34:aload_1         
	//*  15   35:ifnull          55
		{
			H.setTypeface(typeface);
	//   16   38:aload_0         
	//   17   39:getfield        #126 <Field TextPaint H>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #832 <Method Typeface TextPaint.setTypeface(Typeface)>
	//   20   46:pop             
			requestLayout();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #490 <Method void requestLayout()>
			invalidate();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #566 <Method void invalidate()>
		}
	//   25   55:return          
	}

	public void setTextOff(CharSequence charsequence)
	{
		r = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #184 <Field CharSequence r>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #490 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTextOn(CharSequence charsequence)
	{
		q = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field CharSequence q>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #490 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setThumbDrawable(Drawable drawable)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field Drawable c>
	//*   2    4:ifnull          15
			c.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #160 <Field Drawable c>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #166 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		c = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #160 <Field Drawable c>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #166 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #490 <Method void requestLayout()>
	//   17   33:return          
	}

	void setThumbPosition(float f1)
	{
		z = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #282 <Field float z>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #566 <Method void invalidate()>
	//    5    9:return          
	}

	public void setThumbResource(int i1)
	{
		setThumbDrawable(android.support.v7.c.a.b.b(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #507 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #842 <Method Drawable b.b(Context, int)>
	//    5    9:invokevirtual   #844 <Method void setThumbDrawable(Drawable)>
	//    6   12:return          
	}

	public void setThumbTextPadding(int i1)
	{
		m = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #200 <Field int m>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #490 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setThumbTintList(ColorStateList colorstatelist)
	{
		d = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field ColorStateList d>
		f = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #95  <Field boolean f>
		b();
	//    6   10:aload_0         
	//    7   11:invokespecial   #233 <Method void b()>
	//    8   14:return          
	}

	public void setThumbTintMode(android.graphics.PorterDuff.Mode mode)
	{
		e = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field android.graphics.PorterDuff$Mode e>
		g = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #97  <Field boolean g>
		b();
	//    6   10:aload_0         
	//    7   11:invokespecial   #233 <Method void b()>
	//    8   14:return          
	}

	public void setTrackDrawable(Drawable drawable)
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field Drawable h>
	//*   2    4:ifnull          15
			h.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #171 <Field Drawable h>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #166 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		h = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #171 <Field Drawable h>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #166 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #490 <Method void requestLayout()>
	//   17   33:return          
	}

	public void setTrackResource(int i1)
	{
		setTrackDrawable(android.support.v7.c.a.b.b(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #507 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #842 <Method Drawable b.b(Context, int)>
	//    5    9:invokevirtual   #853 <Method void setTrackDrawable(Drawable)>
	//    6   12:return          
	}

	public void setTrackTintList(ColorStateList colorstatelist)
	{
		i = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field ColorStateList i>
		k = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #103 <Field boolean k>
		a();
	//    6   10:aload_0         
	//    7   11:invokespecial   #241 <Method void a()>
	//    8   14:return          
	}

	public void setTrackTintMode(android.graphics.PorterDuff.Mode mode)
	{
		j = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field android.graphics.PorterDuff$Mode j>
		l = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #105 <Field boolean l>
		a();
	//    6   10:aload_0         
	//    7   11:invokespecial   #241 <Method void a()>
	//    8   14:return          
	}

	public void toggle()
	{
		setChecked(isChecked() ^ true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #274 <Method boolean isChecked()>
	//    3    5:iconst_1        
	//    4    6:ixor            
	//    5    7:invokevirtual   #278 <Method void setChecked(boolean)>
	//    6   10:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == c || drawable == h;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #860 <Method boolean CompoundButton.verifyDrawable(Drawable)>
	//    3    5:ifne            29
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #160 <Field Drawable c>
	//    7   13:if_acmpeq       29
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #171 <Field Drawable h>
	//   11   21:if_acmpne       27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
	}

	private static final int N[] = {
		0x10100a0
	};
	private static final Property b = new Property(java/lang/Float, "thumbPos") {

		public Float a(SwitchCompat switchcompat)
		{
			return Float.valueOf(android.support.v7.widget.SwitchCompat.a(switchcompat));
		//    0    0:aload_1         
		//    1    1:invokestatic    #17  <Method float android.support.v7.widget.SwitchCompat.a(SwitchCompat)>
		//    2    4:invokestatic    #23  <Method Float Float.valueOf(float)>
		//    3    7:areturn         
		}

		public void a(SwitchCompat switchcompat, Float float1)
		{
			switchcompat.setThumbPosition(float1.floatValue());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #28  <Method float Float.floatValue()>
		//    3    5:invokevirtual   #32  <Method void SwitchCompat.setThumbPosition(float)>
		//    4    8:return          
		}

		public Object get(Object obj)
		{
			return ((Object) (a((SwitchCompat)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class SwitchCompat>
		//    3    5:invokevirtual   #36  <Method Float a(SwitchCompat)>
		//    4    8:areturn         
		}

		public void set(Object obj, Object obj1)
		{
			a((SwitchCompat)obj, (Float)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class SwitchCompat>
		//    3    5:aload_2         
		//    4    6:checkcast       #19  <Class Float>
		//    5    9:invokevirtual   #40  <Method void a(SwitchCompat, Float)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private int A;
	private int B;
	private int C;
	private int D;
	private int E;
	private int F;
	private int G;
	private final TextPaint H;
	private ColorStateList I;
	private Layout J;
	private Layout K;
	private TransformationMethod L;
	private final Rect M;
	ObjectAnimator a;
	private Drawable c;
	private ColorStateList d;
	private android.graphics.PorterDuff.Mode e;
	private boolean f;
	private boolean g;
	private Drawable h;
	private ColorStateList i;
	private android.graphics.PorterDuff.Mode j;
	private boolean k;
	private boolean l;
	private int m;
	private int n;
	private int o;
	private boolean p;
	private CharSequence q;
	private CharSequence r;
	private boolean s;
	private int t;
	private int u;
	private float v;
	private float w;
	private VelocityTracker x;
	private int y;
	private float z;

	static 
	{
	//    0    0:new             #6   <Class SwitchCompat$1>
	//    1    3:dup             
	//    2    4:ldc1            #64  <Class Float>
	//    3    6:ldc1            #66  <String "thumbPos">
	//    4    8:invokespecial   #70  <Method void SwitchCompat$1(Class, String)>
	//    5   11:putstatic       #72  <Field Property b>
	//    6   14:iconst_1        
	//    7   15:newarray        int[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:ldc1            #73  <Int 0x10100a0>
	//   11   21:iastore         
	//   12   22:putstatic       #75  <Field int[] N>
	//*  13   25:return          
	}
}
