// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.support.design.d;
import android.support.design.g;
import android.support.design.i;
import android.support.design.internal.v;
import android.support.design.j;
import android.support.design.k;
import android.support.v4.a.c;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.ac;
import android.support.v4.widget.ah;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.DrawableUtils;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//			bl, ag, aq, ar, 
//			as, CheckableImageButton, ce, cc, 
//			cg, cd, cf

public class TextInputLayout extends LinearLayout
{

	private void a(RectF rectf)
	{
		rectf.left = rectf.left - (float)q;
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:getfield        #81  <Field float RectF.left>
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field int q>
	//    5    9:i2f             
	//    6   10:fsub            
	//    7   11:putfield        #81  <Field float RectF.left>
		rectf.top = rectf.top - (float)q;
	//    8   14:aload_1         
	//    9   15:aload_1         
	//   10   16:getfield        #86  <Field float RectF.top>
	//   11   19:aload_0         
	//   12   20:getfield        #83  <Field int q>
	//   13   23:i2f             
	//   14   24:fsub            
	//   15   25:putfield        #86  <Field float RectF.top>
		rectf.right = rectf.right + (float)q;
	//   16   28:aload_1         
	//   17   29:aload_1         
	//   18   30:getfield        #89  <Field float RectF.right>
	//   19   33:aload_0         
	//   20   34:getfield        #83  <Field int q>
	//   21   37:i2f             
	//   22   38:fadd            
	//   23   39:putfield        #89  <Field float RectF.right>
		rectf.bottom = rectf.bottom + (float)q;
	//   24   42:aload_1         
	//   25   43:aload_1         
	//   26   44:getfield        #92  <Field float RectF.bottom>
	//   27   47:aload_0         
	//   28   48:getfield        #83  <Field int q>
	//   29   51:i2f             
	//   30   52:fadd            
	//   31   53:putfield        #92  <Field float RectF.bottom>
	//   32   56:return          
	}

	private static void a(ViewGroup viewgroup, boolean flag)
	{
		int j1 = viewgroup.getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method int ViewGroup.getChildCount()>
	//    2    4:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          49
		{
			View view = viewgroup.getChildAt(i1);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #104 <Method View ViewGroup.getChildAt(int)>
	//   11   17:astore          4
			view.setEnabled(flag);
	//   12   19:aload           4
	//   13   21:iload_1         
	//   14   22:invokevirtual   #110 <Method void View.setEnabled(boolean)>
			if(view instanceof ViewGroup)
	//*  15   25:aload           4
	//*  16   27:instanceof      #96  <Class ViewGroup>
	//*  17   30:ifeq            42
				a((ViewGroup)view, flag);
	//   18   33:aload           4
	//   19   35:checkcast       #96  <Class ViewGroup>
	//   20   38:iload_1         
	//   21   39:invokestatic    #112 <Method void a(ViewGroup, boolean)>
		}

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            7
	//   27   49:return          
	}

	private void a(boolean flag, boolean flag1)
	{
		boolean flag2;
		boolean flag3;
		boolean flag5;
label0:
		{
			boolean flag4 = isEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method boolean isEnabled()>
	//    2    4:istore          5
			Object obj = ((Object) (a));
	//    3    6:aload_0         
	//    4    7:getfield        #119 <Field EditText a>
	//    5   10:astore          7
			flag3 = true;
	//    6   12:iconst_1        
	//    7   13:istore          4
			if(obj != null && !TextUtils.isEmpty(((CharSequence) (((EditText) (obj)).getText()))))
	//*   8   15:aload           7
	//*   9   17:ifnull          36
	//*  10   20:aload           7
	//*  11   22:invokevirtual   #125 <Method Editable EditText.getText()>
	//*  12   25:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   28:ifne            36
				flag2 = true;
	//   14   31:iconst_1        
	//   15   32:istore_3        
			else
	//*  16   33:goto            38
				flag2 = false;
	//   17   36:iconst_0        
	//   18   37:istore_3        
			obj = ((Object) (a));
	//   19   38:aload_0         
	//   20   39:getfield        #119 <Field EditText a>
	//   21   42:astore          7
			if(obj == null || !((EditText) (obj)).hasFocus())
	//*  22   44:aload           7
	//*  23   46:ifnull          60
	//*  24   49:aload           7
	//*  25   51:invokevirtual   #134 <Method boolean EditText.hasFocus()>
	//*  26   54:ifeq            60
	//*  27   57:goto            63
				flag3 = false;
	//   28   60:iconst_0        
	//   29   61:istore          4
			flag5 = f.g();
	//   30   63:aload_0         
	//   31   64:getfield        #136 <Field bl f>
	//   32   67:invokevirtual   #140 <Method boolean android.support.design.widget.bl.g()>
	//   33   70:istore          6
			obj = ((Object) (R));
	//   34   72:aload_0         
	//   35   73:getfield        #142 <Field ColorStateList R>
	//   36   76:astore          7
			if(obj != null)
	//*  37   78:aload           7
	//*  38   80:ifnull          103
			{
				c.a(((ColorStateList) (obj)));
	//   39   83:aload_0         
	//   40   84:getfield        #144 <Field ag c>
	//   41   87:aload           7
	//   42   89:invokevirtual   #149 <Method void android.support.design.widget.ag.a(ColorStateList)>
				c.b(R);
	//   43   92:aload_0         
	//   44   93:getfield        #144 <Field ag c>
	//   45   96:aload_0         
	//   46   97:getfield        #142 <Field ColorStateList R>
	//   47  100:invokevirtual   #151 <Method void ag.b(ColorStateList)>
			}
			if(!flag4)
	//*  48  103:iload           5
	//*  49  105:ifne            139
			{
				c.a(ColorStateList.valueOf(W));
	//   50  108:aload_0         
	//   51  109:getfield        #144 <Field ag c>
	//   52  112:aload_0         
	//   53  113:getfield        #153 <Field int W>
	//   54  116:invokestatic    #159 <Method ColorStateList ColorStateList.valueOf(int)>
	//   55  119:invokevirtual   #149 <Method void android.support.design.widget.ag.a(ColorStateList)>
				c.b(ColorStateList.valueOf(W));
	//   56  122:aload_0         
	//   57  123:getfield        #144 <Field ag c>
	//   58  126:aload_0         
	//   59  127:getfield        #153 <Field int W>
	//   60  130:invokestatic    #159 <Method ColorStateList ColorStateList.valueOf(int)>
	//   61  133:invokevirtual   #151 <Method void ag.b(ColorStateList)>
				break label0;
	//   62  136:goto            219
			}
			if(flag5)
	//*  63  139:iload           6
	//*  64  141:ifeq            161
			{
				c.a(f.k());
	//   65  144:aload_0         
	//   66  145:getfield        #144 <Field ag c>
	//   67  148:aload_0         
	//   68  149:getfield        #136 <Field bl f>
	//   69  152:invokevirtual   #162 <Method ColorStateList android.support.design.widget.bl.k()>
	//   70  155:invokevirtual   #149 <Method void android.support.design.widget.ag.a(ColorStateList)>
				break label0;
	//   71  158:goto            219
			}
			if(h)
	//*  72  161:aload_0         
	//*  73  162:getfield        #164 <Field boolean h>
	//*  74  165:ifeq            194
			{
				TextView textview = i;
	//   75  168:aload_0         
	//   76  169:getfield        #166 <Field TextView i>
	//   77  172:astore          7
				if(textview != null)
	//*  78  174:aload           7
	//*  79  176:ifnull          194
				{
					c.a(textview.getTextColors());
	//   80  179:aload_0         
	//   81  180:getfield        #144 <Field ag c>
	//   82  183:aload           7
	//   83  185:invokevirtual   #171 <Method ColorStateList TextView.getTextColors()>
	//   84  188:invokevirtual   #149 <Method void android.support.design.widget.ag.a(ColorStateList)>
					break label0;
	//   85  191:goto            219
				}
			}
			if(flag3)
	//*  86  194:iload           4
	//*  87  196:ifeq            219
			{
				ColorStateList colorstatelist = S;
	//   88  199:aload_0         
	//   89  200:getfield        #173 <Field ColorStateList S>
	//   90  203:astore          7
				if(colorstatelist != null)
	//*  91  205:aload           7
	//*  92  207:ifnull          219
					c.a(colorstatelist);
	//   93  210:aload_0         
	//   94  211:getfield        #144 <Field ag c>
	//   95  214:aload           7
	//   96  216:invokevirtual   #149 <Method void android.support.design.widget.ag.a(ColorStateList)>
			}
		}
		if(!flag2 && (!isEnabled() || !flag3 && !flag5))
	//*  97  219:iload_3         
	//*  98  220:ifne            260
	//*  99  223:aload_0         
	//* 100  224:invokevirtual   #117 <Method boolean isEnabled()>
	//* 101  227:ifeq            243
	//* 102  230:iload           4
	//* 103  232:ifne            260
	//* 104  235:iload           6
	//* 105  237:ifeq            243
	//* 106  240:goto            260
		{
			if(flag1 || !aa)
	//* 107  243:iload_2         
	//* 108  244:ifne            254
	//* 109  247:aload_0         
	//* 110  248:getfield        #175 <Field boolean aa>
	//* 111  251:ifne            276
			{
				d(flag);
	//  112  254:aload_0         
	//  113  255:iload_1         
	//  114  256:invokespecial   #177 <Method void d(boolean)>
				return;
	//  115  259:return          
			}
		} else
		if(flag1 || aa)
	//* 116  260:iload_2         
	//* 117  261:ifne            271
	//* 118  264:aload_0         
	//* 119  265:getfield        #175 <Field boolean aa>
	//* 120  268:ifeq            276
			c(flag);
	//  121  271:aload_0         
	//  122  272:iload_1         
	//  123  273:invokespecial   #179 <Method void c(boolean)>
	//  124  276:return          
	}

	static boolean a(TextInputLayout textinputlayout)
	{
		return textinputlayout.af;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field boolean af>
	//    2    4:ireturn         
	}

	private void c(boolean flag)
	{
		ValueAnimator valueanimator = ac;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field ValueAnimator ac>
	//    2    4:astore_2        
		if(valueanimator != null && valueanimator.isRunning())
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #189 <Method boolean ValueAnimator.isRunning()>
	//*   7   13:ifeq            23
			ac.cancel();
	//    8   16:aload_0         
	//    9   17:getfield        #184 <Field ValueAnimator ac>
	//   10   20:invokevirtual   #193 <Method void ValueAnimator.cancel()>
		if(flag && ab)
	//*  11   23:iload_1         
	//*  12   24:ifeq            42
	//*  13   27:aload_0         
	//*  14   28:getfield        #195 <Field boolean ab>
	//*  15   31:ifeq            42
			a(1.0F);
	//   16   34:aload_0         
	//   17   35:fconst_1        
	//   18   36:invokevirtual   #198 <Method void a(float)>
		else
	//*  19   39:goto            50
			c.b(1.0F);
	//   20   42:aload_0         
	//   21   43:getfield        #144 <Field ag c>
	//   22   46:fconst_1        
	//   23   47:invokevirtual   #200 <Method void ag.b(float)>
		aa = false;
	//   24   50:aload_0         
	//   25   51:iconst_0        
	//   26   52:putfield        #175 <Field boolean aa>
		if(t())
	//*  27   55:aload_0         
	//*  28   56:invokespecial   #202 <Method boolean t()>
	//*  29   59:ifeq            66
			u();
	//   30   62:aload_0         
	//   31   63:invokespecial   #204 <Method void u()>
	//   32   66:return          
	}

	private void d(boolean flag)
	{
		ValueAnimator valueanimator = ac;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field ValueAnimator ac>
	//    2    4:astore_2        
		if(valueanimator != null && valueanimator.isRunning())
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #189 <Method boolean ValueAnimator.isRunning()>
	//*   7   13:ifeq            23
			ac.cancel();
	//    8   16:aload_0         
	//    9   17:getfield        #184 <Field ValueAnimator ac>
	//   10   20:invokevirtual   #193 <Method void ValueAnimator.cancel()>
		if(flag && ab)
	//*  11   23:iload_1         
	//*  12   24:ifeq            42
	//*  13   27:aload_0         
	//*  14   28:getfield        #195 <Field boolean ab>
	//*  15   31:ifeq            42
			a(0.0F);
	//   16   34:aload_0         
	//   17   35:fconst_0        
	//   18   36:invokevirtual   #198 <Method void a(float)>
		else
	//*  19   39:goto            50
			c.b(0.0F);
	//   20   42:aload_0         
	//   21   43:getfield        #144 <Field ag c>
	//   22   46:fconst_0        
	//   23   47:invokevirtual   #200 <Method void ag.b(float)>
		if(t() && ((aq)o).a())
	//*  24   50:aload_0         
	//*  25   51:invokespecial   #202 <Method boolean t()>
	//*  26   54:ifeq            74
	//*  27   57:aload_0         
	//*  28   58:getfield        #206 <Field GradientDrawable o>
	//*  29   61:checkcast       #208 <Class aq>
	//*  30   64:invokevirtual   #210 <Method boolean android.support.design.widget.aq.a()>
	//*  31   67:ifeq            74
			v();
	//   32   70:aload_0         
	//   33   71:invokespecial   #212 <Method void v()>
		aa = true;
	//   34   74:aload_0         
	//   35   75:iconst_1        
	//   36   76:putfield        #175 <Field boolean aa>
	//   37   79:return          
	}

	private void e()
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method void f()>
		if(r != 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #216 <Field int r>
	//*   4    8:ifeq            15
			g();
	//    5   11:aload_0         
	//    6   12:invokespecial   #218 <Method void g()>
		h();
	//    7   15:aload_0         
	//    8   16:invokespecial   #220 <Method void h()>
	//    9   19:return          
	}

	private void f()
	{
		int i1 = r;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field int r>
	//    2    4:istore_1        
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            15
		{
			o = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #206 <Field GradientDrawable o>
			return;
	//    8   14:return          
		}
		if(i1 == 2 && l && !(o instanceof aq))
	//*   9   15:iload_1         
	//*  10   16:iconst_2        
	//*  11   17:icmpne          49
	//*  12   20:aload_0         
	//*  13   21:getfield        #222 <Field boolean l>
	//*  14   24:ifeq            49
	//*  15   27:aload_0         
	//*  16   28:getfield        #206 <Field GradientDrawable o>
	//*  17   31:instanceof      #208 <Class aq>
	//*  18   34:ifne            49
		{
			o = ((GradientDrawable) (new aq()));
	//   19   37:aload_0         
	//   20   38:new             #208 <Class aq>
	//   21   41:dup             
	//   22   42:invokespecial   #225 <Method void aq()>
	//   23   45:putfield        #206 <Field GradientDrawable o>
			return;
	//   24   48:return          
		}
		if(!(o instanceof GradientDrawable))
	//*  25   49:aload_0         
	//*  26   50:getfield        #206 <Field GradientDrawable o>
	//*  27   53:instanceof      #227 <Class GradientDrawable>
	//*  28   56:ifne            70
			o = new GradientDrawable();
	//   29   59:aload_0         
	//   30   60:new             #227 <Class GradientDrawable>
	//   31   63:dup             
	//   32   64:invokespecial   #228 <Method void GradientDrawable()>
	//   33   67:putfield        #206 <Field GradientDrawable o>
	//   34   70:return          
	}

	private void g()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)d.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field FrameLayout d>
	//    2    4:invokevirtual   #236 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//    3    7:checkcast       #238 <Class android.widget.LinearLayout$LayoutParams>
	//    4   10:astore_2        
		int i1 = j();
	//    5   11:aload_0         
	//    6   12:invokespecial   #240 <Method int j()>
	//    7   15:istore_1        
		if(i1 != layoutparams.topMargin)
	//*   8   16:iload_1         
	//*   9   17:aload_2         
	//*  10   18:getfield        #243 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//*  11   21:icmpeq          36
		{
			layoutparams.topMargin = i1;
	//   12   24:aload_2         
	//   13   25:iload_1         
	//   14   26:putfield        #243 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
			d.requestLayout();
	//   15   29:aload_0         
	//   16   30:getfield        #230 <Field FrameLayout d>
	//   17   33:invokevirtual   #246 <Method void FrameLayout.requestLayout()>
		}
	//   18   36:return          
	}

	private Drawable getBoxBackground()
	{
		int i1 = r;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field int r>
	//    2    4:istore_1        
		if(i1 != 1 && i1 != 2)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          26
	//*   6   10:iload_1         
	//*   7   11:iconst_2        
	//*   8   12:icmpne          18
	//*   9   15:goto            26
			throw new IllegalStateException();
	//   10   18:new             #250 <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:invokespecial   #251 <Method void IllegalStateException()>
	//   13   25:athrow          
		else
			return ((Drawable) (o));
	//   14   26:aload_0         
	//   15   27:getfield        #206 <Field GradientDrawable o>
	//   16   30:areturn         
	}

	private float[] getCornerRadiiAsArray()
	{
		if(!android.support.design.internal.v.a(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #258 <Method boolean v.a(View)>
	//*   2    4:ifne            69
		{
			float f1 = t;
	//    3    7:aload_0         
	//    4    8:getfield        #260 <Field float t>
	//    5   11:fstore_1        
			float f3 = u;
	//    6   12:aload_0         
	//    7   13:getfield        #262 <Field float u>
	//    8   16:fstore_2        
			float f5 = v;
	//    9   17:aload_0         
	//   10   18:getfield        #264 <Field float v>
	//   11   21:fstore_3        
			float f7 = w;
	//   12   22:aload_0         
	//   13   23:getfield        #266 <Field float w>
	//   14   26:fstore          4
			return (new float[] {
				f1, f1, f3, f3, f5, f5, f7, f7
			});
	//   15   28:bipush          8
	//   16   30:newarray        float[]
	//   17   32:dup             
	//   18   33:iconst_0        
	//   19   34:fload_1         
	//   20   35:fastore         
	//   21   36:dup             
	//   22   37:iconst_1        
	//   23   38:fload_1         
	//   24   39:fastore         
	//   25   40:dup             
	//   26   41:iconst_2        
	//   27   42:fload_2         
	//   28   43:fastore         
	//   29   44:dup             
	//   30   45:iconst_3        
	//   31   46:fload_2         
	//   32   47:fastore         
	//   33   48:dup             
	//   34   49:iconst_4        
	//   35   50:fload_3         
	//   36   51:fastore         
	//   37   52:dup             
	//   38   53:iconst_5        
	//   39   54:fload_3         
	//   40   55:fastore         
	//   41   56:dup             
	//   42   57:bipush          6
	//   43   59:fload           4
	//   44   61:fastore         
	//   45   62:dup             
	//   46   63:bipush          7
	//   47   65:fload           4
	//   48   67:fastore         
	//   49   68:areturn         
		} else
		{
			float f2 = u;
	//   50   69:aload_0         
	//   51   70:getfield        #262 <Field float u>
	//   52   73:fstore_1        
			float f4 = t;
	//   53   74:aload_0         
	//   54   75:getfield        #260 <Field float t>
	//   55   78:fstore_2        
			float f6 = w;
	//   56   79:aload_0         
	//   57   80:getfield        #266 <Field float w>
	//   58   83:fstore_3        
			float f8 = v;
	//   59   84:aload_0         
	//   60   85:getfield        #264 <Field float v>
	//   61   88:fstore          4
			return (new float[] {
				f2, f2, f4, f4, f6, f6, f8, f8
			});
	//   62   90:bipush          8
	//   63   92:newarray        float[]
	//   64   94:dup             
	//   65   95:iconst_0        
	//   66   96:fload_1         
	//   67   97:fastore         
	//   68   98:dup             
	//   69   99:iconst_1        
	//   70  100:fload_1         
	//   71  101:fastore         
	//   72  102:dup             
	//   73  103:iconst_2        
	//   74  104:fload_2         
	//   75  105:fastore         
	//   76  106:dup             
	//   77  107:iconst_3        
	//   78  108:fload_2         
	//   79  109:fastore         
	//   80  110:dup             
	//   81  111:iconst_4        
	//   82  112:fload_3         
	//   83  113:fastore         
	//   84  114:dup             
	//   85  115:iconst_5        
	//   86  116:fload_3         
	//   87  117:fastore         
	//   88  118:dup             
	//   89  119:bipush          6
	//   90  121:fload           4
	//   91  123:fastore         
	//   92  124:dup             
	//   93  125:bipush          7
	//   94  127:fload           4
	//   95  129:fastore         
	//   96  130:areturn         
		}
	}

	private void h()
	{
		if(r != 0 && o != null && a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #216 <Field int r>
	//*   2    4:ifeq            143
	//*   3    7:aload_0         
	//*   4    8:getfield        #206 <Field GradientDrawable o>
	//*   5   11:ifnull          143
	//*   6   14:aload_0         
	//*   7   15:getfield        #119 <Field EditText a>
	//*   8   18:ifnull          143
		{
			if(getRight() == 0)
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #269 <Method int getRight()>
	//*  11   25:ifne            29
				return;
	//   12   28:return          
			int l2 = a.getLeft();
	//   13   29:aload_0         
	//   14   30:getfield        #119 <Field EditText a>
	//   15   33:invokevirtual   #272 <Method int EditText.getLeft()>
	//   16   36:istore          8
			int k2 = i();
	//   17   38:aload_0         
	//   18   39:invokespecial   #274 <Method int i()>
	//   19   42:istore          7
			int j2 = a.getRight();
	//   20   44:aload_0         
	//   21   45:getfield        #119 <Field EditText a>
	//   22   48:invokevirtual   #275 <Method int EditText.getRight()>
	//   23   51:istore          6
			int i2 = a.getBottom() + p;
	//   24   53:aload_0         
	//   25   54:getfield        #119 <Field EditText a>
	//   26   57:invokevirtual   #278 <Method int EditText.getBottom()>
	//   27   60:aload_0         
	//   28   61:getfield        #280 <Field int p>
	//   29   64:iadd            
	//   30   65:istore          5
			int l1 = l2;
	//   31   67:iload           8
	//   32   69:istore          4
			int k1 = k2;
	//   33   71:iload           7
	//   34   73:istore_3        
			int j1 = j2;
	//   35   74:iload           6
	//   36   76:istore_2        
			int i1 = i2;
	//   37   77:iload           5
	//   38   79:istore_1        
			if(r == 2)
	//*  39   80:aload_0         
	//*  40   81:getfield        #216 <Field int r>
	//*  41   84:iconst_2        
	//*  42   85:icmpne          122
			{
				i1 = z;
	//   43   88:aload_0         
	//   44   89:getfield        #282 <Field int z>
	//   45   92:istore_1        
				l1 = l2 + i1 / 2;
	//   46   93:iload           8
	//   47   95:iload_1         
	//   48   96:iconst_2        
	//   49   97:idiv            
	//   50   98:iadd            
	//   51   99:istore          4
				k1 = k2 - i1 / 2;
	//   52  101:iload           7
	//   53  103:iload_1         
	//   54  104:iconst_2        
	//   55  105:idiv            
	//   56  106:isub            
	//   57  107:istore_3        
				j1 = j2 - i1 / 2;
	//   58  108:iload           6
	//   59  110:iload_1         
	//   60  111:iconst_2        
	//   61  112:idiv            
	//   62  113:isub            
	//   63  114:istore_2        
				i1 = i2 + i1 / 2;
	//   64  115:iload           5
	//   65  117:iload_1         
	//   66  118:iconst_2        
	//   67  119:idiv            
	//   68  120:iadd            
	//   69  121:istore_1        
			}
			o.setBounds(l1, k1, j1, i1);
	//   70  122:aload_0         
	//   71  123:getfield        #206 <Field GradientDrawable o>
	//   72  126:iload           4
	//   73  128:iload_3         
	//   74  129:iload_2         
	//   75  130:iload_1         
	//   76  131:invokevirtual   #286 <Method void GradientDrawable.setBounds(int, int, int, int)>
			n();
	//   77  134:aload_0         
	//   78  135:invokespecial   #288 <Method void n()>
			l();
	//   79  138:aload_0         
	//   80  139:invokespecial   #290 <Method void l()>
			return;
	//   81  142:return          
		} else
		{
			return;
	//   82  143:return          
		}
	}

	private int i()
	{
		EditText edittext = a;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field EditText a>
	//    2    4:astore_1        
		if(edittext == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		switch(r)
	//*   7   11:aload_0         
	//*   8   12:getfield        #216 <Field int r>
		{
	//*   9   15:tableswitch     1 2: default 36
	//	               1 48
	//	               2 38
		default:
			return 0;
	//   10   36:iconst_0        
	//   11   37:ireturn         

		case 2: // '\002'
			return edittext.getTop() + j();
	//   12   38:aload_1         
	//   13   39:invokevirtual   #293 <Method int EditText.getTop()>
	//   14   42:aload_0         
	//   15   43:invokespecial   #240 <Method int j()>
	//   16   46:iadd            
	//   17   47:ireturn         

		case 1: // '\001'
			return edittext.getTop();
	//   18   48:aload_1         
	//   19   49:invokevirtual   #293 <Method int EditText.getTop()>
	//   20   52:ireturn         
		}
	}

	private int j()
	{
		if(!l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #222 <Field boolean l>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		switch(r)
	//*   5    9:aload_0         
	//*   6   10:getfield        #216 <Field int r>
		{
	//*   7   13:tableswitch     0 2: default 40
	//	               0 53
	//	               1 53
	//	               2 42
		default:
			return 0;
	//    8   40:iconst_0        
	//    9   41:ireturn         

		case 2: // '\002'
			return (int)(c.b() / 2.0F);
	//   10   42:aload_0         
	//   11   43:getfield        #144 <Field ag c>
	//   12   46:invokevirtual   #296 <Method float ag.b()>
	//   13   49:fconst_2        
	//   14   50:fdiv            
	//   15   51:f2i             
	//   16   52:ireturn         

		case 0: // '\0'
		case 1: // '\001'
			return (int)c.b();
	//   17   53:aload_0         
	//   18   54:getfield        #144 <Field ag c>
	//   19   57:invokevirtual   #296 <Method float ag.b()>
	//   20   60:f2i             
	//   21   61:ireturn         
		}
	}

	private int k()
	{
		switch(r)
	//*   0    0:aload_0         
	//*   1    1:getfield        #216 <Field int r>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 49
	//	               2 33
		default:
			return getPaddingTop();
	//    3   28:aload_0         
	//    4   29:invokevirtual   #299 <Method int getPaddingTop()>
	//    5   32:ireturn         

		case 2: // '\002'
			return getBoxBackground().getBounds().top - j();
	//    6   33:aload_0         
	//    7   34:invokespecial   #301 <Method Drawable getBoxBackground()>
	//    8   37:invokevirtual   #307 <Method Rect Drawable.getBounds()>
	//    9   40:getfield        #311 <Field int Rect.top>
	//   10   43:aload_0         
	//   11   44:invokespecial   #240 <Method int j()>
	//   12   47:isub            
	//   13   48:ireturn         

		case 1: // '\001'
			return getBoxBackground().getBounds().top + s;
	//   14   49:aload_0         
	//   15   50:invokespecial   #301 <Method Drawable getBoxBackground()>
	//   16   53:invokevirtual   #307 <Method Rect Drawable.getBounds()>
	//   17   56:getfield        #311 <Field int Rect.top>
	//   18   59:aload_0         
	//   19   60:getfield        #313 <Field int s>
	//   20   63:iadd            
	//   21   64:ireturn         
		}
	}

	private void l()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field EditText a>
	//    2    4:astore          5
		if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		Object obj1 = ((Object) (((EditText) (obj)).getBackground()));
	//    6   12:aload           5
	//    7   14:invokevirtual   #316 <Method Drawable EditText.getBackground()>
	//    8   17:astore          6
		if(obj1 == null)
	//*   9   19:aload           6
	//*  10   21:ifnonnull       25
			return;
	//   11   24:return          
		obj = obj1;
	//   12   25:aload           6
	//   13   27:astore          5
		if(DrawableUtils.canSafelyMutateDrawable(((Drawable) (obj1))))
	//*  14   29:aload           6
	//*  15   31:invokestatic    #322 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  16   34:ifeq            44
			obj = ((Object) (((Drawable) (obj1)).mutate()));
	//   17   37:aload           6
	//   18   39:invokevirtual   #325 <Method Drawable Drawable.mutate()>
	//   19   42:astore          5
		obj1 = ((Object) (new Rect()));
	//   20   44:new             #309 <Class Rect>
	//   21   47:dup             
	//   22   48:invokespecial   #326 <Method void Rect()>
	//   23   51:astore          6
		ar.b(((ViewGroup) (this)), ((View) (a)), ((Rect) (obj1)));
	//   24   53:aload_0         
	//   25   54:aload_0         
	//   26   55:getfield        #119 <Field EditText a>
	//   27   58:aload           6
	//   28   60:invokestatic    #331 <Method void ar.b(ViewGroup, View, Rect)>
		obj1 = ((Object) (((Drawable) (obj)).getBounds()));
	//   29   63:aload           5
	//   30   65:invokevirtual   #307 <Method Rect Drawable.getBounds()>
	//   31   68:astore          6
		if(((Rect) (obj1)).left != ((Rect) (obj1)).right)
	//*  32   70:aload           6
	//*  33   72:getfield        #333 <Field int Rect.left>
	//*  34   75:aload           6
	//*  35   77:getfield        #335 <Field int Rect.right>
	//*  36   80:icmpeq          151
		{
			Rect rect = new Rect();
	//   37   83:new             #309 <Class Rect>
	//   38   86:dup             
	//   39   87:invokespecial   #326 <Method void Rect()>
	//   40   90:astore          7
			((Drawable) (obj)).getPadding(rect);
	//   41   92:aload           5
	//   42   94:aload           7
	//   43   96:invokevirtual   #339 <Method boolean Drawable.getPadding(Rect)>
	//   44   99:pop             
			int i1 = ((Rect) (obj1)).left;
	//   45  100:aload           6
	//   46  102:getfield        #333 <Field int Rect.left>
	//   47  105:istore_1        
			int j1 = rect.left;
	//   48  106:aload           7
	//   49  108:getfield        #333 <Field int Rect.left>
	//   50  111:istore_2        
			int k1 = ((Rect) (obj1)).right;
	//   51  112:aload           6
	//   52  114:getfield        #335 <Field int Rect.right>
	//   53  117:istore_3        
			int l1 = rect.right;
	//   54  118:aload           7
	//   55  120:getfield        #335 <Field int Rect.right>
	//   56  123:istore          4
			((Drawable) (obj)).setBounds(i1 - j1, ((Rect) (obj1)).top, k1 + l1 * 2, a.getBottom());
	//   57  125:aload           5
	//   58  127:iload_1         
	//   59  128:iload_2         
	//   60  129:isub            
	//   61  130:aload           6
	//   62  132:getfield        #311 <Field int Rect.top>
	//   63  135:iload_3         
	//   64  136:iload           4
	//   65  138:iconst_2        
	//   66  139:imul            
	//   67  140:iadd            
	//   68  141:aload_0         
	//   69  142:getfield        #119 <Field EditText a>
	//   70  145:invokevirtual   #278 <Method int EditText.getBottom()>
	//   71  148:invokevirtual   #340 <Method void Drawable.setBounds(int, int, int, int)>
		}
	//   72  151:return          
	}

	private void m()
	{
		switch(r)
	//*   0    0:aload_0         
	//*   1    1:getfield        #216 <Field int r>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 59
	//	               2 29
		default:
			return;
	//    3   28:return          

		case 2: // '\002'
			if(V == 0)
	//*   4   29:aload_0         
	//*   5   30:getfield        #342 <Field int V>
	//*   6   33:ifne            64
			{
				V = S.getColorForState(getDrawableState(), S.getDefaultColor());
	//    7   36:aload_0         
	//    8   37:aload_0         
	//    9   38:getfield        #173 <Field ColorStateList S>
	//   10   41:aload_0         
	//   11   42:invokevirtual   #346 <Method int[] getDrawableState()>
	//   12   45:aload_0         
	//   13   46:getfield        #173 <Field ColorStateList S>
	//   14   49:invokevirtual   #349 <Method int ColorStateList.getDefaultColor()>
	//   15   52:invokevirtual   #353 <Method int ColorStateList.getColorForState(int[], int)>
	//   16   55:putfield        #342 <Field int V>
				return;
	//   17   58:return          
			}
			break;

		case 1: // '\001'
			x = 0;
	//   18   59:aload_0         
	//   19   60:iconst_0        
	//   20   61:putfield        #355 <Field int x>
			break;
		}
	//   21   64:return          
	}

	private void n()
	{
		if(o == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #206 <Field GradientDrawable o>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		m();
	//    4    8:aload_0         
	//    5    9:invokespecial   #357 <Method void m()>
		EditText edittext = a;
	//    6   12:aload_0         
	//    7   13:getfield        #119 <Field EditText a>
	//    8   16:astore_3        
		if(edittext != null && r == 2)
	//*   9   17:aload_3         
	//*  10   18:ifnull          55
	//*  11   21:aload_0         
	//*  12   22:getfield        #216 <Field int r>
	//*  13   25:iconst_2        
	//*  14   26:icmpne          55
		{
			if(edittext.getBackground() != null)
	//*  15   29:aload_3         
	//*  16   30:invokevirtual   #316 <Method Drawable EditText.getBackground()>
	//*  17   33:ifnull          47
				C = a.getBackground();
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #119 <Field EditText a>
	//   21   41:invokevirtual   #316 <Method Drawable EditText.getBackground()>
	//   22   44:putfield        #359 <Field Drawable C>
			android.support.v4.view.ac.a(((View) (a)), ((Drawable) (null)));
	//   23   47:aload_0         
	//   24   48:getfield        #119 <Field EditText a>
	//   25   51:aconst_null     
	//   26   52:invokestatic    #364 <Method void ac.a(View, Drawable)>
		}
		edittext = a;
	//   27   55:aload_0         
	//   28   56:getfield        #119 <Field EditText a>
	//   29   59:astore_3        
		if(edittext != null && r == 1)
	//*  30   60:aload_3         
	//*  31   61:ifnull          89
	//*  32   64:aload_0         
	//*  33   65:getfield        #216 <Field int r>
	//*  34   68:iconst_1        
	//*  35   69:icmpne          89
		{
			Drawable drawable = C;
	//   36   72:aload_0         
	//   37   73:getfield        #359 <Field Drawable C>
	//   38   76:astore          4
			if(drawable != null)
	//*  39   78:aload           4
	//*  40   80:ifnull          89
				android.support.v4.view.ac.a(((View) (edittext)), drawable);
	//   41   83:aload_3         
	//   42   84:aload           4
	//   43   86:invokestatic    #364 <Method void ac.a(View, Drawable)>
		}
		int i1 = x;
	//   44   89:aload_0         
	//   45   90:getfield        #355 <Field int x>
	//   46   93:istore_1        
		if(i1 > -1)
	//*  47   94:iload_1         
	//*  48   95:iconst_m1       
	//*  49   96:icmple          117
		{
			int j1 = A;
	//   50   99:aload_0         
	//   51  100:getfield        #366 <Field int A>
	//   52  103:istore_2        
			if(j1 != 0)
	//*  53  104:iload_2         
	//*  54  105:ifeq            117
				o.setStroke(i1, j1);
	//   55  108:aload_0         
	//   56  109:getfield        #206 <Field GradientDrawable o>
	//   57  112:iload_1         
	//   58  113:iload_2         
	//   59  114:invokevirtual   #370 <Method void GradientDrawable.setStroke(int, int)>
		}
		o.setCornerRadii(getCornerRadiiAsArray());
	//   60  117:aload_0         
	//   61  118:getfield        #206 <Field GradientDrawable o>
	//   62  121:aload_0         
	//   63  122:invokespecial   #372 <Method float[] getCornerRadiiAsArray()>
	//   64  125:invokevirtual   #376 <Method void GradientDrawable.setCornerRadii(float[])>
		o.setColor(B);
	//   65  128:aload_0         
	//   66  129:getfield        #206 <Field GradientDrawable o>
	//   67  132:aload_0         
	//   68  133:getfield        #378 <Field int B>
	//   69  136:invokevirtual   #382 <Method void GradientDrawable.setColor(int)>
		invalidate();
	//   70  139:aload_0         
	//   71  140:invokevirtual   #385 <Method void invalidate()>
	//   72  143:return          
	}

	private void o()
	{
		int i1 = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #390 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		if(i1 != 21 && i1 != 22)
	//*   2    4:iload_1         
	//*   3    5:bipush          21
	//*   4    7:icmpeq          17
	//*   5   10:iload_1         
	//*   6   11:bipush          22
	//*   7   13:icmpeq          17
			return;
	//    8   16:return          
		Drawable drawable = a.getBackground();
	//    9   17:aload_0         
	//   10   18:getfield        #119 <Field EditText a>
	//   11   21:invokevirtual   #316 <Method Drawable EditText.getBackground()>
	//   12   24:astore_2        
		if(drawable == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       30
			return;
	//   15   29:return          
		if(!ad)
	//*  16   30:aload_0         
	//*  17   31:getfield        #392 <Field boolean ad>
	//*  18   34:ifne            91
		{
			Drawable drawable1 = drawable.getConstantState().newDrawable();
	//   19   37:aload_2         
	//   20   38:invokevirtual   #396 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   21   41:invokevirtual   #401 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   22   44:astore_3        
			if(drawable instanceof DrawableContainer)
	//*  23   45:aload_2         
	//*  24   46:instanceof      #403 <Class DrawableContainer>
	//*  25   49:ifeq            67
				ad = android.support.design.widget.as.a((DrawableContainer)drawable, drawable1.getConstantState());
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:checkcast       #403 <Class DrawableContainer>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #396 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   31   61:invokestatic    #408 <Method boolean android.support.design.widget.as.a(DrawableContainer, android.graphics.drawable.Drawable$ConstantState)>
	//   32   64:putfield        #392 <Field boolean ad>
			if(!ad)
	//*  33   67:aload_0         
	//*  34   68:getfield        #392 <Field boolean ad>
	//*  35   71:ifne            91
			{
				android.support.v4.view.ac.a(((View) (a)), drawable1);
	//   36   74:aload_0         
	//   37   75:getfield        #119 <Field EditText a>
	//   38   78:aload_3         
	//   39   79:invokestatic    #364 <Method void ac.a(View, Drawable)>
				ad = true;
	//   40   82:aload_0         
	//   41   83:iconst_1        
	//   42   84:putfield        #392 <Field boolean ad>
				e();
	//   43   87:aload_0         
	//   44   88:invokespecial   #410 <Method void e()>
			}
		}
	//   45   91:return          
	}

	private void p()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field EditText a>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(r())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #412 <Method boolean r()>
	//*   6   12:ifeq            260
		{
			if(J == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #414 <Field CheckableImageButton J>
	//*   9   19:ifnonnull       95
			{
				J = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(i.design_text_input_password_icon, ((ViewGroup) (d)), false);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #418 <Method Context getContext()>
	//   13   27:invokestatic    #424 <Method LayoutInflater LayoutInflater.from(Context)>
	//   14   30:getstatic       #429 <Field int i.design_text_input_password_icon>
	//   15   33:aload_0         
	//   16   34:getfield        #230 <Field FrameLayout d>
	//   17   37:iconst_0        
	//   18   38:invokevirtual   #433 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   19   41:checkcast       #435 <Class CheckableImageButton>
	//   20   44:putfield        #414 <Field CheckableImageButton J>
				J.setImageDrawable(H);
	//   21   47:aload_0         
	//   22   48:getfield        #414 <Field CheckableImageButton J>
	//   23   51:aload_0         
	//   24   52:getfield        #437 <Field Drawable H>
	//   25   55:invokevirtual   #441 <Method void CheckableImageButton.setImageDrawable(Drawable)>
				J.setContentDescription(I);
	//   26   58:aload_0         
	//   27   59:getfield        #414 <Field CheckableImageButton J>
	//   28   62:aload_0         
	//   29   63:getfield        #443 <Field CharSequence I>
	//   30   66:invokevirtual   #447 <Method void CheckableImageButton.setContentDescription(CharSequence)>
				d.addView(((View) (J)));
	//   31   69:aload_0         
	//   32   70:getfield        #230 <Field FrameLayout d>
	//   33   73:aload_0         
	//   34   74:getfield        #414 <Field CheckableImageButton J>
	//   35   77:invokevirtual   #451 <Method void FrameLayout.addView(View)>
				J.setOnClickListener(((android.view.View.OnClickListener) (new ce(this))));
	//   36   80:aload_0         
	//   37   81:getfield        #414 <Field CheckableImageButton J>
	//   38   84:new             #453 <Class ce>
	//   39   87:dup             
	//   40   88:aload_0         
	//   41   89:invokespecial   #456 <Method void ce(TextInputLayout)>
	//   42   92:invokevirtual   #460 <Method void CheckableImageButton.setOnClickListener(android.view.View$OnClickListener)>
			}
			EditText edittext = a;
	//   43   95:aload_0         
	//   44   96:getfield        #119 <Field EditText a>
	//   45   99:astore_1        
			if(edittext != null && android.support.v4.view.ac.k(((View) (edittext))) <= 0)
	//*  46  100:aload_1         
	//*  47  101:ifnull          125
	//*  48  104:aload_1         
	//*  49  105:invokestatic    #463 <Method int ac.k(View)>
	//*  50  108:ifgt            125
				a.setMinimumHeight(android.support.v4.view.ac.k(((View) (J))));
	//   51  111:aload_0         
	//   52  112:getfield        #119 <Field EditText a>
	//   53  115:aload_0         
	//   54  116:getfield        #414 <Field CheckableImageButton J>
	//   55  119:invokestatic    #463 <Method int ac.k(View)>
	//   56  122:invokevirtual   #466 <Method void EditText.setMinimumHeight(int)>
			J.setVisibility(0);
	//   57  125:aload_0         
	//   58  126:getfield        #414 <Field CheckableImageButton J>
	//   59  129:iconst_0        
	//   60  130:invokevirtual   #469 <Method void CheckableImageButton.setVisibility(int)>
			J.setChecked(K);
	//   61  133:aload_0         
	//   62  134:getfield        #414 <Field CheckableImageButton J>
	//   63  137:aload_0         
	//   64  138:getfield        #471 <Field boolean K>
	//   65  141:invokevirtual   #474 <Method void CheckableImageButton.setChecked(boolean)>
			if(L == null)
	//*  66  144:aload_0         
	//*  67  145:getfield        #476 <Field Drawable L>
	//*  68  148:ifnonnull       162
				L = ((Drawable) (new ColorDrawable()));
	//   69  151:aload_0         
	//   70  152:new             #478 <Class ColorDrawable>
	//   71  155:dup             
	//   72  156:invokespecial   #479 <Method void ColorDrawable()>
	//   73  159:putfield        #476 <Field Drawable L>
			L.setBounds(0, 0, J.getMeasuredWidth(), 1);
	//   74  162:aload_0         
	//   75  163:getfield        #476 <Field Drawable L>
	//   76  166:iconst_0        
	//   77  167:iconst_0        
	//   78  168:aload_0         
	//   79  169:getfield        #414 <Field CheckableImageButton J>
	//   80  172:invokevirtual   #482 <Method int CheckableImageButton.getMeasuredWidth()>
	//   81  175:iconst_1        
	//   82  176:invokevirtual   #340 <Method void Drawable.setBounds(int, int, int, int)>
			Drawable adrawable[] = ah.a(((TextView) (a)));
	//   83  179:aload_0         
	//   84  180:getfield        #119 <Field EditText a>
	//   85  183:invokestatic    #487 <Method Drawable[] ah.a(TextView)>
	//   86  186:astore_1        
			if(adrawable[2] != L)
	//*  87  187:aload_1         
	//*  88  188:iconst_2        
	//*  89  189:aaload          
	//*  90  190:aload_0         
	//*  91  191:getfield        #476 <Field Drawable L>
	//*  92  194:if_acmpeq       204
				M = adrawable[2];
	//   93  197:aload_0         
	//   94  198:aload_1         
	//   95  199:iconst_2        
	//   96  200:aaload          
	//   97  201:putfield        #489 <Field Drawable M>
			ah.a(((TextView) (a)), adrawable[0], adrawable[1], L, adrawable[3]);
	//   98  204:aload_0         
	//   99  205:getfield        #119 <Field EditText a>
	//  100  208:aload_1         
	//  101  209:iconst_0        
	//  102  210:aaload          
	//  103  211:aload_1         
	//  104  212:iconst_1        
	//  105  213:aaload          
	//  106  214:aload_0         
	//  107  215:getfield        #476 <Field Drawable L>
	//  108  218:aload_1         
	//  109  219:iconst_3        
	//  110  220:aaload          
	//  111  221:invokestatic    #492 <Method void ah.a(TextView, Drawable, Drawable, Drawable, Drawable)>
			J.setPadding(a.getPaddingLeft(), a.getPaddingTop(), a.getPaddingRight(), a.getPaddingBottom());
	//  112  224:aload_0         
	//  113  225:getfield        #414 <Field CheckableImageButton J>
	//  114  228:aload_0         
	//  115  229:getfield        #119 <Field EditText a>
	//  116  232:invokevirtual   #495 <Method int EditText.getPaddingLeft()>
	//  117  235:aload_0         
	//  118  236:getfield        #119 <Field EditText a>
	//  119  239:invokevirtual   #496 <Method int EditText.getPaddingTop()>
	//  120  242:aload_0         
	//  121  243:getfield        #119 <Field EditText a>
	//  122  246:invokevirtual   #499 <Method int EditText.getPaddingRight()>
	//  123  249:aload_0         
	//  124  250:getfield        #119 <Field EditText a>
	//  125  253:invokevirtual   #502 <Method int EditText.getPaddingBottom()>
	//  126  256:invokevirtual   #505 <Method void CheckableImageButton.setPadding(int, int, int, int)>
			return;
	//  127  259:return          
		}
		CheckableImageButton checkableimagebutton = J;
	//  128  260:aload_0         
	//  129  261:getfield        #414 <Field CheckableImageButton J>
	//  130  264:astore_1        
		if(checkableimagebutton != null && checkableimagebutton.getVisibility() == 0)
	//* 131  265:aload_1         
	//* 132  266:ifnull          285
	//* 133  269:aload_1         
	//* 134  270:invokevirtual   #508 <Method int CheckableImageButton.getVisibility()>
	//* 135  273:ifne            285
			J.setVisibility(8);
	//  136  276:aload_0         
	//  137  277:getfield        #414 <Field CheckableImageButton J>
	//  138  280:bipush          8
	//  139  282:invokevirtual   #469 <Method void CheckableImageButton.setVisibility(int)>
		if(L != null)
	//* 140  285:aload_0         
	//* 141  286:getfield        #476 <Field Drawable L>
	//* 142  289:ifnull          335
		{
			Drawable adrawable1[] = ah.a(((TextView) (a)));
	//  143  292:aload_0         
	//  144  293:getfield        #119 <Field EditText a>
	//  145  296:invokestatic    #487 <Method Drawable[] ah.a(TextView)>
	//  146  299:astore_1        
			if(adrawable1[2] == L)
	//* 147  300:aload_1         
	//* 148  301:iconst_2        
	//* 149  302:aaload          
	//* 150  303:aload_0         
	//* 151  304:getfield        #476 <Field Drawable L>
	//* 152  307:if_acmpne       335
			{
				ah.a(((TextView) (a)), adrawable1[0], adrawable1[1], M, adrawable1[3]);
	//  153  310:aload_0         
	//  154  311:getfield        #119 <Field EditText a>
	//  155  314:aload_1         
	//  156  315:iconst_0        
	//  157  316:aaload          
	//  158  317:aload_1         
	//  159  318:iconst_1        
	//  160  319:aaload          
	//  161  320:aload_0         
	//  162  321:getfield        #489 <Field Drawable M>
	//  163  324:aload_1         
	//  164  325:iconst_3        
	//  165  326:aaload          
	//  166  327:invokestatic    #492 <Method void ah.a(TextView, Drawable, Drawable, Drawable, Drawable)>
				L = null;
	//  167  330:aload_0         
	//  168  331:aconst_null     
	//  169  332:putfield        #476 <Field Drawable L>
			}
		}
	//  170  335:return          
	}

	private boolean q()
	{
		EditText edittext = a;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field EditText a>
	//    2    4:astore_1        
		return edittext != null && (edittext.getTransformationMethod() instanceof PasswordTransformationMethod);
	//    3    5:aload_1         
	//    4    6:ifnull          21
	//    5    9:aload_1         
	//    6   10:invokevirtual   #512 <Method android.text.method.TransformationMethod EditText.getTransformationMethod()>
	//    7   13:instanceof      #514 <Class PasswordTransformationMethod>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private boolean r()
	{
		return G && (q() || K);
	//    0    0:aload_0         
	//    1    1:getfield        #516 <Field boolean G>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:invokespecial   #518 <Method boolean q()>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:getfield        #471 <Field boolean K>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void s()
	{
		if(H != null && (O || Q))
	//*   0    0:aload_0         
	//*   1    1:getfield        #437 <Field Drawable H>
	//*   2    4:ifnull          103
	//*   3    7:aload_0         
	//*   4    8:getfield        #520 <Field boolean O>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #522 <Field boolean Q>
	//*   8   18:ifeq            103
		{
			H = android.support.v4.graphics.drawable.a.g(H).mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #437 <Field Drawable H>
	//   12   26:invokestatic    #527 <Method Drawable a.g(Drawable)>
	//   13   29:invokevirtual   #325 <Method Drawable Drawable.mutate()>
	//   14   32:putfield        #437 <Field Drawable H>
			if(O)
	//*  15   35:aload_0         
	//*  16   36:getfield        #520 <Field boolean O>
	//*  17   39:ifeq            53
				android.support.v4.graphics.drawable.a.a(H, N);
	//   18   42:aload_0         
	//   19   43:getfield        #437 <Field Drawable H>
	//   20   46:aload_0         
	//   21   47:getfield        #529 <Field ColorStateList N>
	//   22   50:invokestatic    #532 <Method void a.a(Drawable, ColorStateList)>
			if(Q)
	//*  23   53:aload_0         
	//*  24   54:getfield        #522 <Field boolean Q>
	//*  25   57:ifeq            71
				android.support.v4.graphics.drawable.a.a(H, P);
	//   26   60:aload_0         
	//   27   61:getfield        #437 <Field Drawable H>
	//   28   64:aload_0         
	//   29   65:getfield        #534 <Field android.graphics.PorterDuff$Mode P>
	//   30   68:invokestatic    #537 <Method void a.a(Drawable, android.graphics.PorterDuff$Mode)>
			Object obj = ((Object) (J));
	//   31   71:aload_0         
	//   32   72:getfield        #414 <Field CheckableImageButton J>
	//   33   75:astore_1        
			if(obj != null)
	//*  34   76:aload_1         
	//*  35   77:ifnull          103
			{
				obj = ((Object) (((CheckableImageButton) (obj)).getDrawable()));
	//   36   80:aload_1         
	//   37   81:invokevirtual   #540 <Method Drawable CheckableImageButton.getDrawable()>
	//   38   84:astore_1        
				Drawable drawable = H;
	//   39   85:aload_0         
	//   40   86:getfield        #437 <Field Drawable H>
	//   41   89:astore_2        
				if(obj != drawable)
	//*  42   90:aload_1         
	//*  43   91:aload_2         
	//*  44   92:if_acmpeq       103
					J.setImageDrawable(drawable);
	//   45   95:aload_0         
	//   46   96:getfield        #414 <Field CheckableImageButton J>
	//   47   99:aload_2         
	//   48  100:invokevirtual   #441 <Method void CheckableImageButton.setImageDrawable(Drawable)>
			}
		}
	//   49  103:return          
	}

	private void setEditText(EditText edittext)
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field EditText a>
	//*   2    4:ifnonnull       233
		{
			if(!(edittext instanceof cc))
	//*   3    7:aload_1         
	//*   4    8:instanceof      #544 <Class cc>
	//*   5   11:ifne            24
				Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
	//    6   14:ldc2            #546 <String "TextInputLayout">
	//    7   17:ldc2            #548 <String "EditText added is not a TextInputEditText. Please switch to using that class instead.">
	//    8   20:invokestatic    #553 <Method int Log.i(String, String)>
	//    9   23:pop             
			a = edittext;
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:putfield        #119 <Field EditText a>
			e();
	//   13   29:aload_0         
	//   14   30:invokespecial   #410 <Method void e()>
			setTextInputAccessibilityDelegate(new cg(this));
	//   15   33:aload_0         
	//   16   34:new             #555 <Class cg>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #556 <Method void cg(TextInputLayout)>
	//   20   42:invokevirtual   #560 <Method void setTextInputAccessibilityDelegate(cg)>
			if(!q())
	//*  21   45:aload_0         
	//*  22   46:invokespecial   #518 <Method boolean q()>
	//*  23   49:ifne            66
				c.a(a.getTypeface());
	//   24   52:aload_0         
	//   25   53:getfield        #144 <Field ag c>
	//   26   56:aload_0         
	//   27   57:getfield        #119 <Field EditText a>
	//   28   60:invokevirtual   #564 <Method Typeface EditText.getTypeface()>
	//   29   63:invokevirtual   #567 <Method void android.support.design.widget.ag.a(Typeface)>
			c.a(a.getTextSize());
	//   30   66:aload_0         
	//   31   67:getfield        #144 <Field ag c>
	//   32   70:aload_0         
	//   33   71:getfield        #119 <Field EditText a>
	//   34   74:invokevirtual   #570 <Method float EditText.getTextSize()>
	//   35   77:invokevirtual   #571 <Method void android.support.design.widget.ag.a(float)>
			int i1 = a.getGravity();
	//   36   80:aload_0         
	//   37   81:getfield        #119 <Field EditText a>
	//   38   84:invokevirtual   #574 <Method int EditText.getGravity()>
	//   39   87:istore_2        
			c.b(i1 & 0xffffff8f | 0x30);
	//   40   88:aload_0         
	//   41   89:getfield        #144 <Field ag c>
	//   42   92:iload_2         
	//   43   93:bipush          -113
	//   44   95:iand            
	//   45   96:bipush          48
	//   46   98:ior             
	//   47   99:invokevirtual   #576 <Method void ag.b(int)>
			c.a(i1);
	//   48  102:aload_0         
	//   49  103:getfield        #144 <Field ag c>
	//   50  106:iload_2         
	//   51  107:invokevirtual   #578 <Method void android.support.design.widget.ag.a(int)>
			a.addTextChangedListener(((android.text.TextWatcher) (new cd(this))));
	//   52  110:aload_0         
	//   53  111:getfield        #119 <Field EditText a>
	//   54  114:new             #580 <Class cd>
	//   55  117:dup             
	//   56  118:aload_0         
	//   57  119:invokespecial   #581 <Method void cd(TextInputLayout)>
	//   58  122:invokevirtual   #585 <Method void EditText.addTextChangedListener(android.text.TextWatcher)>
			if(R == null)
	//*  59  125:aload_0         
	//*  60  126:getfield        #142 <Field ColorStateList R>
	//*  61  129:ifnonnull       143
				R = a.getHintTextColors();
	//   62  132:aload_0         
	//   63  133:aload_0         
	//   64  134:getfield        #119 <Field EditText a>
	//   65  137:invokevirtual   #588 <Method ColorStateList EditText.getHintTextColors()>
	//   66  140:putfield        #142 <Field ColorStateList R>
			if(l)
	//*  67  143:aload_0         
	//*  68  144:getfield        #222 <Field boolean l>
	//*  69  147:ifeq            192
			{
				if(TextUtils.isEmpty(m))
	//*  70  150:aload_0         
	//*  71  151:getfield        #590 <Field CharSequence m>
	//*  72  154:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  73  157:ifeq            187
				{
					e = a.getHint();
	//   74  160:aload_0         
	//   75  161:aload_0         
	//   76  162:getfield        #119 <Field EditText a>
	//   77  165:invokevirtual   #594 <Method CharSequence EditText.getHint()>
	//   78  168:putfield        #596 <Field CharSequence e>
					setHint(e);
	//   79  171:aload_0         
	//   80  172:aload_0         
	//   81  173:getfield        #596 <Field CharSequence e>
	//   82  176:invokevirtual   #599 <Method void setHint(CharSequence)>
					a.setHint(((CharSequence) (null)));
	//   83  179:aload_0         
	//   84  180:getfield        #119 <Field EditText a>
	//   85  183:aconst_null     
	//   86  184:invokevirtual   #600 <Method void EditText.setHint(CharSequence)>
				}
				n = true;
	//   87  187:aload_0         
	//   88  188:iconst_1        
	//   89  189:putfield        #602 <Field boolean n>
			}
			if(i != null)
	//*  90  192:aload_0         
	//*  91  193:getfield        #166 <Field TextView i>
	//*  92  196:ifnull          215
				a(a.getText().length());
	//   93  199:aload_0         
	//   94  200:aload_0         
	//   95  201:getfield        #119 <Field EditText a>
	//   96  204:invokevirtual   #125 <Method Editable EditText.getText()>
	//   97  207:invokeinterface #607 <Method int Editable.length()>
	//   98  212:invokevirtual   #608 <Method void a(int)>
			f.d();
	//   99  215:aload_0         
	//  100  216:getfield        #136 <Field bl f>
	//  101  219:invokevirtual   #610 <Method void android.support.design.widget.bl.d()>
			p();
	//  102  222:aload_0         
	//  103  223:invokespecial   #612 <Method void p()>
			a(false, true);
	//  104  226:aload_0         
	//  105  227:iconst_0        
	//  106  228:iconst_1        
	//  107  229:invokespecial   #614 <Method void a(boolean, boolean)>
			return;
	//  108  232:return          
		} else
		{
			throw new IllegalArgumentException("We already have an EditText, can only have one");
	//  109  233:new             #616 <Class IllegalArgumentException>
	//  110  236:dup             
	//  111  237:ldc2            #618 <String "We already have an EditText, can only have one">
	//  112  240:invokespecial   #621 <Method void IllegalArgumentException(String)>
	//  113  243:athrow          
		}
	}

	private void setHintInternal(CharSequence charsequence)
	{
		if(!TextUtils.equals(charsequence, m))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #590 <Field CharSequence m>
	//*   3    5:invokestatic    #626 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*   4    8:ifne            35
		{
			m = charsequence;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #590 <Field CharSequence m>
			c.a(charsequence);
	//    8   16:aload_0         
	//    9   17:getfield        #144 <Field ag c>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #628 <Method void android.support.design.widget.ag.a(CharSequence)>
			if(!aa)
	//*  12   24:aload_0         
	//*  13   25:getfield        #175 <Field boolean aa>
	//*  14   28:ifne            35
				u();
	//   15   31:aload_0         
	//   16   32:invokespecial   #204 <Method void u()>
		}
	//   17   35:return          
	}

	private boolean t()
	{
		return l && !TextUtils.isEmpty(m) && (o instanceof aq);
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field boolean l>
	//    2    4:ifeq            29
	//    3    7:aload_0         
	//    4    8:getfield        #590 <Field CharSequence m>
	//    5   11:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    6   14:ifne            29
	//    7   17:aload_0         
	//    8   18:getfield        #206 <Field GradientDrawable o>
	//    9   21:instanceof      #208 <Class aq>
	//   10   24:ifeq            29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	private void u()
	{
		if(!t())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #202 <Method boolean t()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			RectF rectf = E;
	//    4    8:aload_0         
	//    5    9:getfield        #630 <Field RectF E>
	//    6   12:astore_1        
			c.a(rectf);
	//    7   13:aload_0         
	//    8   14:getfield        #144 <Field ag c>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #632 <Method void android.support.design.widget.ag.a(RectF)>
			a(rectf);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #633 <Method void a(RectF)>
			((aq)o).a(rectf);
	//   14   26:aload_0         
	//   15   27:getfield        #206 <Field GradientDrawable o>
	//   16   30:checkcast       #208 <Class aq>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #634 <Method void android.support.design.widget.aq.a(RectF)>
			return;
	//   19   37:return          
		}
	}

	private void v()
	{
		if(t())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #202 <Method boolean t()>
	//*   2    4:ifeq            17
			((aq)o).b();
	//    3    7:aload_0         
	//    4    8:getfield        #206 <Field GradientDrawable o>
	//    5   11:checkcast       #208 <Class aq>
	//    6   14:invokevirtual   #636 <Method void aq.b()>
	//    7   17:return          
	}

	void a(float f1)
	{
		if(c.e() == f1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field ag c>
	//*   2    4:invokevirtual   #638 <Method float ag.e()>
	//*   3    7:fload_1         
	//*   4    8:fcmpl           
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(ac == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #184 <Field ValueAnimator ac>
	//*   9   17:ifnonnull       67
		{
			ac = new ValueAnimator();
	//   10   20:aload_0         
	//   11   21:new             #186 <Class ValueAnimator>
	//   12   24:dup             
	//   13   25:invokespecial   #639 <Method void ValueAnimator()>
	//   14   28:putfield        #184 <Field ValueAnimator ac>
			ac.setInterpolator(android.support.design.a.a.b);
	//   15   31:aload_0         
	//   16   32:getfield        #184 <Field ValueAnimator ac>
	//   17   35:getstatic       #644 <Field android.animation.TimeInterpolator android.support.design.a.a.b>
	//   18   38:invokevirtual   #648 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			ac.setDuration(167L);
	//   19   41:aload_0         
	//   20   42:getfield        #184 <Field ValueAnimator ac>
	//   21   45:ldc2w           #649 <Long 167L>
	//   22   48:invokevirtual   #654 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   23   51:pop             
			ac.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (new cf(this))));
	//   24   52:aload_0         
	//   25   53:getfield        #184 <Field ValueAnimator ac>
	//   26   56:new             #656 <Class cf>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:invokespecial   #657 <Method void cf(TextInputLayout)>
	//   30   64:invokevirtual   #661 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
		ac.setFloatValues(new float[] {
			c.e(), f1
		});
	//   31   67:aload_0         
	//   32   68:getfield        #184 <Field ValueAnimator ac>
	//   33   71:iconst_2        
	//   34   72:newarray        float[]
	//   35   74:dup             
	//   36   75:iconst_0        
	//   37   76:aload_0         
	//   38   77:getfield        #144 <Field ag c>
	//   39   80:invokevirtual   #638 <Method float ag.e()>
	//   40   83:fastore         
	//   41   84:dup             
	//   42   85:iconst_1        
	//   43   86:fload_1         
	//   44   87:fastore         
	//   45   88:invokevirtual   #664 <Method void ValueAnimator.setFloatValues(float[])>
		ac.start();
	//   46   91:aload_0         
	//   47   92:getfield        #184 <Field ValueAnimator ac>
	//   48   95:invokevirtual   #667 <Method void ValueAnimator.start()>
	//   49   98:return          
	}

	void a(int i1)
	{
		boolean flag1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field boolean h>
	//    2    4:istore          4
		if(g == -1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #669 <Field int g>
	//*   5   10:iconst_m1       
	//*   6   11:icmpne          41
		{
			i.setText(((CharSequence) (String.valueOf(i1))));
	//    7   14:aload_0         
	//    8   15:getfield        #166 <Field TextView i>
	//    9   18:iload_1         
	//   10   19:invokestatic    #674 <Method String String.valueOf(int)>
	//   11   22:invokevirtual   #677 <Method void TextView.setText(CharSequence)>
			i.setContentDescription(((CharSequence) (null)));
	//   12   25:aload_0         
	//   13   26:getfield        #166 <Field TextView i>
	//   14   29:aconst_null     
	//   15   30:invokevirtual   #678 <Method void TextView.setContentDescription(CharSequence)>
			h = false;
	//   16   33:aload_0         
	//   17   34:iconst_0        
	//   18   35:putfield        #164 <Field boolean h>
		} else
	//*  19   38:goto            212
		{
			if(android.support.v4.view.ac.g(((View) (i))) == 1)
	//*  20   41:aload_0         
	//*  21   42:getfield        #166 <Field TextView i>
	//*  22   45:invokestatic    #680 <Method int ac.g(View)>
	//*  23   48:iconst_1        
	//*  24   49:icmpne          60
				android.support.v4.view.ac.c(((View) (i)), 0);
	//   25   52:aload_0         
	//   26   53:getfield        #166 <Field TextView i>
	//   27   56:iconst_0        
	//   28   57:invokestatic    #683 <Method void ac.c(View, int)>
			boolean flag;
			if(i1 > g)
	//*  29   60:iload_1         
	//*  30   61:aload_0         
	//*  31   62:getfield        #669 <Field int g>
	//*  32   65:icmple          73
				flag = true;
	//   33   68:iconst_1        
	//   34   69:istore_3        
			else
	//*  35   70:goto            75
				flag = false;
	//   36   73:iconst_0        
	//   37   74:istore_3        
			h = flag;
	//   38   75:aload_0         
	//   39   76:iload_3         
	//   40   77:putfield        #164 <Field boolean h>
			flag = h;
	//   41   80:aload_0         
	//   42   81:getfield        #164 <Field boolean h>
	//   43   84:istore_3        
			if(flag1 != flag)
	//*  44   85:iload           4
	//*  45   87:iload_3         
	//*  46   88:icmpeq          136
			{
				TextView textview = i;
	//   47   91:aload_0         
	//   48   92:getfield        #166 <Field TextView i>
	//   49   95:astore          5
				int j1;
				if(flag)
	//*  50   97:iload_3         
	//*  51   98:ifeq            109
					j1 = j;
	//   52  101:aload_0         
	//   53  102:getfield        #685 <Field int j>
	//   54  105:istore_2        
				else
	//*  55  106:goto            114
					j1 = k;
	//   56  109:aload_0         
	//   57  110:getfield        #687 <Field int k>
	//   58  113:istore_2        
				a(textview, j1);
	//   59  114:aload_0         
	//   60  115:aload           5
	//   61  117:iload_2         
	//   62  118:invokevirtual   #690 <Method void a(TextView, int)>
				if(h)
	//*  63  121:aload_0         
	//*  64  122:getfield        #164 <Field boolean h>
	//*  65  125:ifeq            136
					android.support.v4.view.ac.c(((View) (i)), 1);
	//   66  128:aload_0         
	//   67  129:getfield        #166 <Field TextView i>
	//   68  132:iconst_1        
	//   69  133:invokestatic    #683 <Method void ac.c(View, int)>
			}
			i.setText(((CharSequence) (getContext().getString(j.character_counter_pattern, new Object[] {
				Integer.valueOf(i1), Integer.valueOf(g)
			}))));
	//   70  136:aload_0         
	//   71  137:getfield        #166 <Field TextView i>
	//   72  140:aload_0         
	//   73  141:invokevirtual   #418 <Method Context getContext()>
	//   74  144:getstatic       #695 <Field int j.character_counter_pattern>
	//   75  147:iconst_2        
	//   76  148:anewarray       Object[]
	//   77  151:dup             
	//   78  152:iconst_0        
	//   79  153:iload_1         
	//   80  154:invokestatic    #702 <Method Integer Integer.valueOf(int)>
	//   81  157:aastore         
	//   82  158:dup             
	//   83  159:iconst_1        
	//   84  160:aload_0         
	//   85  161:getfield        #669 <Field int g>
	//   86  164:invokestatic    #702 <Method Integer Integer.valueOf(int)>
	//   87  167:aastore         
	//   88  168:invokevirtual   #708 <Method String Context.getString(int, Object[])>
	//   89  171:invokevirtual   #677 <Method void TextView.setText(CharSequence)>
			i.setContentDescription(((CharSequence) (getContext().getString(j.character_counter_content_description, new Object[] {
				Integer.valueOf(i1), Integer.valueOf(g)
			}))));
	//   90  174:aload_0         
	//   91  175:getfield        #166 <Field TextView i>
	//   92  178:aload_0         
	//   93  179:invokevirtual   #418 <Method Context getContext()>
	//   94  182:getstatic       #711 <Field int j.character_counter_content_description>
	//   95  185:iconst_2        
	//   96  186:anewarray       Object[]
	//   97  189:dup             
	//   98  190:iconst_0        
	//   99  191:iload_1         
	//  100  192:invokestatic    #702 <Method Integer Integer.valueOf(int)>
	//  101  195:aastore         
	//  102  196:dup             
	//  103  197:iconst_1        
	//  104  198:aload_0         
	//  105  199:getfield        #669 <Field int g>
	//  106  202:invokestatic    #702 <Method Integer Integer.valueOf(int)>
	//  107  205:aastore         
	//  108  206:invokevirtual   #708 <Method String Context.getString(int, Object[])>
	//  109  209:invokevirtual   #678 <Method void TextView.setContentDescription(CharSequence)>
		}
		if(a != null && flag1 != h)
	//* 110  212:aload_0         
	//* 111  213:getfield        #119 <Field EditText a>
	//* 112  216:ifnull          241
	//* 113  219:iload           4
	//* 114  221:aload_0         
	//* 115  222:getfield        #164 <Field boolean h>
	//* 116  225:icmpeq          241
		{
			a(false);
	//  117  228:aload_0         
	//  118  229:iconst_0        
	//  119  230:invokevirtual   #713 <Method void a(boolean)>
			d();
	//  120  233:aload_0         
	//  121  234:invokevirtual   #714 <Method void d()>
			c();
	//  122  237:aload_0         
	//  123  238:invokevirtual   #716 <Method void c()>
		}
	//  124  241:return          
	}

	void a(TextView textview, int i1)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		ah.a(textview, i1);
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #719 <Method void ah.a(TextView, int)>
		if(android.os.Build.VERSION.SDK_INT < 23)
			break MISSING_BLOCK_LABEL_35;
	//    5    7:getstatic       #390 <Field int android.os.Build$VERSION.SDK_INT>
	//    6   10:bipush          23
	//    7   12:icmplt          35
		i1 = textview.getTextColors().getDefaultColor();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #171 <Method ColorStateList TextView.getTextColors()>
	//   10   19:invokevirtual   #349 <Method int ColorStateList.getDefaultColor()>
	//   11   22:istore_2        
		if(i1 == -65281)
	//*  12   23:iload_2         
	//*  13   24:ldc2            #720 <Int -65281>
	//*  14   27:icmpne          35
		{
			i1 = ((int) (flag));
	//   15   30:iload_3         
	//   16   31:istore_2        
			break MISSING_BLOCK_LABEL_37;
	//   17   32:goto            37
		}
		i1 = 0;
	//   18   35:iconst_0        
	//   19   36:istore_2        
_L2:
		if(i1 != 0)
	//*  20   37:iload_2         
	//*  21   38:ifeq            62
		{
			ah.a(textview, k.TextAppearance_AppCompat_Caption);
	//   22   41:aload_1         
	//   23   42:getstatic       #725 <Field int k.TextAppearance_AppCompat_Caption>
	//   24   45:invokestatic    #719 <Method void ah.a(TextView, int)>
			textview.setTextColor(android.support.v4.a.c.c(getContext(), d.design_error));
	//   25   48:aload_1         
	//   26   49:aload_0         
	//   27   50:invokevirtual   #418 <Method Context getContext()>
	//   28   53:getstatic       #730 <Field int d.design_error>
	//   29   56:invokestatic    #735 <Method int c.c(Context, int)>
	//   30   59:invokevirtual   #738 <Method void TextView.setTextColor(int)>
		}
		return;
	//   31   62:return          
		Exception exception;
		exception;
	//   32   63:astore          4
		i1 = ((int) (flag));
	//   33   65:iload_3         
	//   34   66:istore_2        
		if(true) goto _L2; else goto _L1
	//   35   67:goto            37
_L1:
	}

	void a(boolean flag)
	{
		a(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #614 <Method void a(boolean, boolean)>
	//    4    6:return          
	}

	boolean a()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #602 <Field boolean n>
	//    2    4:ireturn         
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(view instanceof EditText)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #121 <Class EditText>
	//*   2    4:ifeq            64
		{
			android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams);
	//    3    7:new             #741 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_3         
	//    6   12:invokespecial   #744 <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    7   15:astore          4
			layoutparams1.gravity = layoutparams1.gravity & 0xffffff8f | 0x10;
	//    8   17:aload           4
	//    9   19:aload           4
	//   10   21:getfield        #747 <Field int android.widget.FrameLayout$LayoutParams.gravity>
	//   11   24:bipush          -113
	//   12   26:iand            
	//   13   27:bipush          16
	//   14   29:ior             
	//   15   30:putfield        #747 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			d.addView(view, ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   16   33:aload_0         
	//   17   34:getfield        #230 <Field FrameLayout d>
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokevirtual   #750 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			d.setLayoutParams(layoutparams);
	//   21   43:aload_0         
	//   22   44:getfield        #230 <Field FrameLayout d>
	//   23   47:aload_3         
	//   24   48:invokevirtual   #753 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			g();
	//   25   51:aload_0         
	//   26   52:invokespecial   #218 <Method void g()>
			setEditText((EditText)view);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:checkcast       #121 <Class EditText>
	//   30   60:invokespecial   #755 <Method void setEditText(EditText)>
			return;
	//   31   63:return          
		} else
		{
			super.addView(view, i1, layoutparams);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:iload_2         
	//   35   67:aload_3         
	//   36   68:invokespecial   #757 <Method void LinearLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   37   71:return          
		}
	}

	public void b(boolean flag)
	{
		if(G)
	//*   0    0:aload_0         
	//*   1    1:getfield        #516 <Field boolean G>
	//*   2    4:ifeq            83
		{
			int i1 = a.getSelectionEnd();
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field EditText a>
	//    5   11:invokevirtual   #760 <Method int EditText.getSelectionEnd()>
	//    6   14:istore_2        
			if(q())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #518 <Method boolean q()>
	//*   9   19:ifeq            38
			{
				a.setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #119 <Field EditText a>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #764 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				K = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #471 <Field boolean K>
			} else
	//*  17   35:goto            53
			{
				a.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   18   38:aload_0         
	//   19   39:getfield        #119 <Field EditText a>
	//   20   42:invokestatic    #768 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   21   45:invokevirtual   #764 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				K = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #471 <Field boolean K>
			}
			J.setChecked(K);
	//   25   53:aload_0         
	//   26   54:getfield        #414 <Field CheckableImageButton J>
	//   27   57:aload_0         
	//   28   58:getfield        #471 <Field boolean K>
	//   29   61:invokevirtual   #474 <Method void CheckableImageButton.setChecked(boolean)>
			if(flag)
	//*  30   64:iload_1         
	//*  31   65:ifeq            75
				J.jumpDrawablesToCurrentState();
	//   32   68:aload_0         
	//   33   69:getfield        #414 <Field CheckableImageButton J>
	//   34   72:invokevirtual   #771 <Method void CheckableImageButton.jumpDrawablesToCurrentState()>
			a.setSelection(i1);
	//   35   75:aload_0         
	//   36   76:getfield        #119 <Field EditText a>
	//   37   79:iload_2         
	//   38   80:invokevirtual   #774 <Method void EditText.setSelection(int)>
		}
	//   39   83:return          
	}

	public boolean b()
	{
		return f.f();
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:invokevirtual   #776 <Method boolean bl.f()>
	//    3    7:ireturn         
	}

	void c()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field EditText a>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		Drawable drawable = ((EditText) (obj)).getBackground();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #316 <Method Drawable EditText.getBackground()>
	//    8   14:astore_2        
		if(drawable == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       20
			return;
	//   11   19:return          
		o();
	//   12   20:aload_0         
	//   13   21:invokespecial   #778 <Method void o()>
		obj = ((Object) (drawable));
	//   14   24:aload_2         
	//   15   25:astore_1        
		if(DrawableUtils.canSafelyMutateDrawable(drawable))
	//*  16   26:aload_2         
	//*  17   27:invokestatic    #322 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  18   30:ifeq            38
			obj = ((Object) (drawable.mutate()));
	//   19   33:aload_2         
	//   20   34:invokevirtual   #325 <Method Drawable Drawable.mutate()>
	//   21   37:astore_1        
		if(f.g())
	//*  22   38:aload_0         
	//*  23   39:getfield        #136 <Field bl f>
	//*  24   42:invokevirtual   #140 <Method boolean android.support.design.widget.bl.g()>
	//*  25   45:ifeq            66
		{
			((Drawable) (obj)).setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(f.j(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   26   48:aload_1         
	//   27   49:aload_0         
	//   28   50:getfield        #136 <Field bl f>
	//   29   53:invokevirtual   #779 <Method int android.support.design.widget.bl.j()>
	//   30   56:getstatic       #784 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   31   59:invokestatic    #790 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   32   62:invokevirtual   #794 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			return;
	//   33   65:return          
		}
		if(h)
	//*  34   66:aload_0         
	//*  35   67:getfield        #164 <Field boolean h>
	//*  36   70:ifeq            97
		{
			TextView textview = i;
	//   37   73:aload_0         
	//   38   74:getfield        #166 <Field TextView i>
	//   39   77:astore_2        
			if(textview != null)
	//*  40   78:aload_2         
	//*  41   79:ifnull          97
			{
				((Drawable) (obj)).setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(textview.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokevirtual   #797 <Method int TextView.getCurrentTextColor()>
	//   45   87:getstatic       #784 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   46   90:invokestatic    #790 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   47   93:invokevirtual   #794 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
				return;
	//   48   96:return          
			}
		}
		android.support.v4.graphics.drawable.a.f(((Drawable) (obj)));
	//   49   97:aload_1         
	//   50   98:invokestatic    #799 <Method void a.f(Drawable)>
		a.refreshDrawableState();
	//   51  101:aload_0         
	//   52  102:getfield        #119 <Field EditText a>
	//   53  105:invokevirtual   #802 <Method void EditText.refreshDrawableState()>
	//   54  108:return          
	}

	void d()
	{
label0:
		{
label1:
			{
				boolean flag;
				boolean flag1;
label2:
				{
					if(o == null)
						break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field GradientDrawable o>
	//    2    4:ifnull          215
					if(r == 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #216 <Field int r>
	//*   5   11:ifne            15
						return;
	//    6   14:return          
					EditText edittext = a;
	//    7   15:aload_0         
	//    8   16:getfield        #119 <Field EditText a>
	//    9   19:astore_3        
					flag1 = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
					if(edittext != null && edittext.hasFocus())
	//*  12   22:aload_3         
	//*  13   23:ifnull          38
	//*  14   26:aload_3         
	//*  15   27:invokevirtual   #134 <Method boolean EditText.hasFocus()>
	//*  16   30:ifeq            38
						flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_1        
					else
	//*  19   35:goto            40
						flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_1        
					edittext = a;
	//   22   40:aload_0         
	//   23   41:getfield        #119 <Field EditText a>
	//   24   44:astore_3        
					if(edittext == null || !edittext.isHovered())
	//*  25   45:aload_3         
	//*  26   46:ifnull          59
	//*  27   49:aload_3         
	//*  28   50:invokevirtual   #805 <Method boolean EditText.isHovered()>
	//*  29   53:ifeq            59
	//*  30   56:goto            61
						flag1 = false;
	//   31   59:iconst_0        
	//   32   60:istore_2        
					if(r != 2)
						break label1;
	//   33   61:aload_0         
	//   34   62:getfield        #216 <Field int r>
	//   35   65:iconst_2        
	//   36   66:icmpne          214
					if(!isEnabled())
	//*  37   69:aload_0         
	//*  38   70:invokevirtual   #117 <Method boolean isEnabled()>
	//*  39   73:ifne            87
					{
						A = W;
	//   40   76:aload_0         
	//   41   77:aload_0         
	//   42   78:getfield        #153 <Field int W>
	//   43   81:putfield        #366 <Field int A>
						break label2;
	//   44   84:goto            176
					}
					if(f.g())
	//*  45   87:aload_0         
	//*  46   88:getfield        #136 <Field bl f>
	//*  47   91:invokevirtual   #140 <Method boolean android.support.design.widget.bl.g()>
	//*  48   94:ifeq            111
					{
						A = f.j();
	//   49   97:aload_0         
	//   50   98:aload_0         
	//   51   99:getfield        #136 <Field bl f>
	//   52  102:invokevirtual   #779 <Method int android.support.design.widget.bl.j()>
	//   53  105:putfield        #366 <Field int A>
						break label2;
	//   54  108:goto            176
					}
					if(h)
	//*  55  111:aload_0         
	//*  56  112:getfield        #164 <Field boolean h>
	//*  57  115:ifeq            138
					{
						TextView textview = i;
	//   58  118:aload_0         
	//   59  119:getfield        #166 <Field TextView i>
	//   60  122:astore_3        
						if(textview != null)
	//*  61  123:aload_3         
	//*  62  124:ifnull          138
						{
							A = textview.getCurrentTextColor();
	//   63  127:aload_0         
	//   64  128:aload_3         
	//   65  129:invokevirtual   #797 <Method int TextView.getCurrentTextColor()>
	//   66  132:putfield        #366 <Field int A>
							break label2;
	//   67  135:goto            176
						}
					}
					if(flag)
	//*  68  138:iload_1         
	//*  69  139:ifeq            153
						A = V;
	//   70  142:aload_0         
	//   71  143:aload_0         
	//   72  144:getfield        #342 <Field int V>
	//   73  147:putfield        #366 <Field int A>
					else
	//*  74  150:goto            176
					if(flag1)
	//*  75  153:iload_2         
	//*  76  154:ifeq            168
						A = U;
	//   77  157:aload_0         
	//   78  158:aload_0         
	//   79  159:getfield        #807 <Field int U>
	//   80  162:putfield        #366 <Field int A>
					else
	//*  81  165:goto            176
						A = T;
	//   82  168:aload_0         
	//   83  169:aload_0         
	//   84  170:getfield        #809 <Field int T>
	//   85  173:putfield        #366 <Field int A>
				}
				if((flag1 || flag) && isEnabled())
	//*  86  176:iload_2         
	//*  87  177:ifne            184
	//*  88  180:iload_1         
	//*  89  181:ifeq            202
	//*  90  184:aload_0         
	//*  91  185:invokevirtual   #117 <Method boolean isEnabled()>
	//*  92  188:ifeq            202
					x = z;
	//   93  191:aload_0         
	//   94  192:aload_0         
	//   95  193:getfield        #282 <Field int z>
	//   96  196:putfield        #355 <Field int x>
				else
	//*  97  199:goto            210
					x = y;
	//   98  202:aload_0         
	//   99  203:aload_0         
	//  100  204:getfield        #811 <Field int y>
	//  101  207:putfield        #355 <Field int x>
				n();
	//  102  210:aload_0         
	//  103  211:invokespecial   #288 <Method void n()>
			}
			return;
	//  104  214:return          
		}
	//  105  215:return          
	}

	public void dispatchProvideAutofillStructure(ViewStructure viewstructure, int i1)
	{
		boolean flag;
		Object obj;
		if(e == null)
			break MISSING_BLOCK_LABEL_87;
	//    0    0:aload_0         
	//    1    1:getfield        #596 <Field CharSequence e>
	//    2    4:ifnull          87
		obj = ((Object) (a));
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field EditText a>
	//    5   11:astore          4
		if(obj == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       21
			break MISSING_BLOCK_LABEL_87;
	//    8   18:goto            87
		flag = n;
	//    9   21:aload_0         
	//   10   22:getfield        #602 <Field boolean n>
	//   11   25:istore_3        
		n = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #602 <Field boolean n>
		obj = ((Object) (((EditText) (obj)).getHint()));
	//   15   31:aload           4
	//   16   33:invokevirtual   #594 <Method CharSequence EditText.getHint()>
	//   17   36:astore          4
		a.setHint(e);
	//   18   38:aload_0         
	//   19   39:getfield        #119 <Field EditText a>
	//   20   42:aload_0         
	//   21   43:getfield        #596 <Field CharSequence e>
	//   22   46:invokevirtual   #600 <Method void EditText.setHint(CharSequence)>
		super.dispatchProvideAutofillStructure(viewstructure, i1);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:iload_2         
	//   26   52:invokespecial   #815 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
		a.setHint(((CharSequence) (obj)));
	//   27   55:aload_0         
	//   28   56:getfield        #119 <Field EditText a>
	//   29   59:aload           4
	//   30   61:invokevirtual   #600 <Method void EditText.setHint(CharSequence)>
		n = flag;
	//   31   64:aload_0         
	//   32   65:iload_3         
	//   33   66:putfield        #602 <Field boolean n>
		return;
	//   34   69:return          
		viewstructure;
	//   35   70:astore_1        
		a.setHint(((CharSequence) (obj)));
	//   36   71:aload_0         
	//   37   72:getfield        #119 <Field EditText a>
	//   38   75:aload           4
	//   39   77:invokevirtual   #600 <Method void EditText.setHint(CharSequence)>
		n = flag;
	//   40   80:aload_0         
	//   41   81:iload_3         
	//   42   82:putfield        #602 <Field boolean n>
		throw viewstructure;
	//   43   85:aload_1         
	//   44   86:athrow          
		super.dispatchProvideAutofillStructure(viewstructure, i1);
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:iload_2         
	//   48   90:invokespecial   #815 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
		return;
	//   49   93:return          
	}

	protected void dispatchRestoreInstanceState(SparseArray sparsearray)
	{
		af = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #182 <Field boolean af>
		super.dispatchRestoreInstanceState(sparsearray);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #819 <Method void LinearLayout.dispatchRestoreInstanceState(SparseArray)>
		af = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #182 <Field boolean af>
	//    9   15:return          
	}

	public void draw(Canvas canvas)
	{
		GradientDrawable gradientdrawable = o;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field GradientDrawable o>
	//    2    4:astore_2        
		if(gradientdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			gradientdrawable.draw(canvas);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #823 <Method void GradientDrawable.draw(Canvas)>
		super.draw(canvas);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #824 <Method void LinearLayout.draw(Canvas)>
		if(l)
	//*  11   19:aload_0         
	//*  12   20:getfield        #222 <Field boolean l>
	//*  13   23:ifeq            34
			c.a(canvas);
	//   14   26:aload_0         
	//   15   27:getfield        #144 <Field ag c>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #826 <Method void android.support.design.widget.ag.a(Canvas)>
	//   18   34:return          
	}

	protected void drawableStateChanged()
	{
		if(ae)
	//*   0    0:aload_0         
	//*   1    1:getfield        #829 <Field boolean ae>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		boolean flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		ae = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #829 <Field boolean ae>
		super.drawableStateChanged();
	//    9   15:aload_0         
	//   10   16:invokespecial   #831 <Method void LinearLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #346 <Method int[] getDrawableState()>
	//   13   23:astore_3        
		if(!android.support.v4.view.ac.x(((View) (this))) || !isEnabled())
	//*  14   24:aload_0         
	//*  15   25:invokestatic    #833 <Method boolean ac.x(View)>
	//*  16   28:ifeq            41
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #117 <Method boolean isEnabled()>
	//*  19   35:ifeq            41
	//*  20   38:goto            43
			flag1 = false;
	//   21   41:iconst_0        
	//   22   42:istore_2        
		a(flag1);
	//   23   43:aload_0         
	//   24   44:iload_2         
	//   25   45:invokevirtual   #713 <Method void a(boolean)>
		c();
	//   26   48:aload_0         
	//   27   49:invokevirtual   #716 <Method void c()>
		h();
	//   28   52:aload_0         
	//   29   53:invokespecial   #220 <Method void h()>
		d();
	//   30   56:aload_0         
	//   31   57:invokevirtual   #714 <Method void d()>
		ag ag1 = c;
	//   32   60:aload_0         
	//   33   61:getfield        #144 <Field ag c>
	//   34   64:astore          4
		boolean flag;
		if(ag1 != null)
	//*  35   66:aload           4
	//*  36   68:ifnull          83
			flag = ag1.a(ai) | false;
	//   37   71:aload           4
	//   38   73:aload_3         
	//   39   74:invokevirtual   #836 <Method boolean android.support.design.widget.ag.a(int[])>
	//   40   77:iconst_0        
	//   41   78:ior             
	//   42   79:istore_1        
		else
	//*  43   80:goto            85
			flag = false;
	//   44   83:iconst_0        
	//   45   84:istore_1        
		if(flag)
	//*  46   85:iload_1         
	//*  47   86:ifeq            93
			invalidate();
	//   48   89:aload_0         
	//   49   90:invokevirtual   #385 <Method void invalidate()>
		ae = false;
	//   50   93:aload_0         
	//   51   94:iconst_0        
	//   52   95:putfield        #829 <Field boolean ae>
	//   53   98:return          
	}

	public int getBoxBackgroundColor()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #378 <Field int B>
	//    2    4:ireturn         
	}

	public float getBoxCornerRadiusBottomEnd()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field float v>
	//    2    4:freturn         
	}

	public float getBoxCornerRadiusBottomStart()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field float w>
	//    2    4:freturn         
	}

	public float getBoxCornerRadiusTopEnd()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field float u>
	//    2    4:freturn         
	}

	public float getBoxCornerRadiusTopStart()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field float t>
	//    2    4:freturn         
	}

	public int getBoxStrokeColor()
	{
		return V;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field int V>
	//    2    4:ireturn         
	}

	public int getCounterMaxLength()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #669 <Field int g>
	//    2    4:ireturn         
	}

	CharSequence getCounterOverflowDescription()
	{
		if(b && h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #846 <Field boolean b>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #164 <Field boolean h>
	//*   5   11:ifeq            28
		{
			TextView textview = i;
	//    6   14:aload_0         
	//    7   15:getfield        #166 <Field TextView i>
	//    8   18:astore_1        
			if(textview != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          28
				return textview.getContentDescription();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #849 <Method CharSequence TextView.getContentDescription()>
	//   13   27:areturn         
		}
		return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	public ColorStateList getDefaultHintTextColor()
	{
		return R;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field ColorStateList R>
	//    2    4:areturn         
	}

	public EditText getEditText()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field EditText a>
	//    2    4:areturn         
	}

	public CharSequence getError()
	{
		if(f.e())
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field bl f>
	//*   2    4:invokevirtual   #855 <Method boolean bl.e()>
	//*   3    7:ifeq            18
			return f.h();
	//    4   10:aload_0         
	//    5   11:getfield        #136 <Field bl f>
	//    6   14:invokevirtual   #857 <Method CharSequence bl.h()>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public int getErrorCurrentTextColors()
	{
		return f.j();
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:invokevirtual   #779 <Method int android.support.design.widget.bl.j()>
	//    3    7:ireturn         
	}

	final int getErrorTextCurrentColor()
	{
		return f.j();
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:invokevirtual   #779 <Method int android.support.design.widget.bl.j()>
	//    3    7:ireturn         
	}

	public CharSequence getHelperText()
	{
		if(f.f())
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field bl f>
	//*   2    4:invokevirtual   #776 <Method boolean bl.f()>
	//*   3    7:ifeq            18
			return f.i();
	//    4   10:aload_0         
	//    5   11:getfield        #136 <Field bl f>
	//    6   14:invokevirtual   #862 <Method CharSequence android.support.design.widget.bl.i()>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public int getHelperTextCurrentTextColor()
	{
		return f.l();
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:invokevirtual   #865 <Method int bl.l()>
	//    3    7:ireturn         
	}

	public CharSequence getHint()
	{
		if(l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #222 <Field boolean l>
	//*   2    4:ifeq            12
			return m;
	//    3    7:aload_0         
	//    4    8:getfield        #590 <Field CharSequence m>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	final float getHintCollapsedTextHeight()
	{
		return c.b();
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field ag c>
	//    2    4:invokevirtual   #296 <Method float ag.b()>
	//    3    7:freturn         
	}

	final int getHintCurrentCollapsedTextColor()
	{
		return c.f();
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field ag c>
	//    2    4:invokevirtual   #869 <Method int ag.f()>
	//    3    7:ireturn         
	}

	public CharSequence getPasswordVisibilityToggleContentDescription()
	{
		return I;
	//    0    0:aload_0         
	//    1    1:getfield        #443 <Field CharSequence I>
	//    2    4:areturn         
	}

	public Drawable getPasswordVisibilityToggleDrawable()
	{
		return H;
	//    0    0:aload_0         
	//    1    1:getfield        #437 <Field Drawable H>
	//    2    4:areturn         
	}

	public Typeface getTypeface()
	{
		return F;
	//    0    0:aload_0         
	//    1    1:getfield        #873 <Field Typeface F>
	//    2    4:areturn         
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
	//    6    8:invokespecial   #877 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		if(o != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #206 <Field GradientDrawable o>
	//*   9   15:ifnull          22
			h();
	//   10   18:aload_0         
	//   11   19:invokespecial   #220 <Method void h()>
		if(l)
	//*  12   22:aload_0         
	//*  13   23:getfield        #222 <Field boolean l>
	//*  14   26:ifeq            171
		{
			EditText edittext = a;
	//   15   29:aload_0         
	//   16   30:getfield        #119 <Field EditText a>
	//   17   33:astore          7
			if(edittext != null)
	//*  18   35:aload           7
	//*  19   37:ifnull          171
			{
				Rect rect = D;
	//   20   40:aload_0         
	//   21   41:getfield        #879 <Field Rect D>
	//   22   44:astore          8
				ar.b(((ViewGroup) (this)), ((View) (edittext)), rect);
	//   23   46:aload_0         
	//   24   47:aload           7
	//   25   49:aload           8
	//   26   51:invokestatic    #331 <Method void ar.b(ViewGroup, View, Rect)>
				i1 = rect.left + a.getCompoundPaddingLeft();
	//   27   54:aload           8
	//   28   56:getfield        #333 <Field int Rect.left>
	//   29   59:aload_0         
	//   30   60:getfield        #119 <Field EditText a>
	//   31   63:invokevirtual   #882 <Method int EditText.getCompoundPaddingLeft()>
	//   32   66:iadd            
	//   33   67:istore_2        
				k1 = rect.right - a.getCompoundPaddingRight();
	//   34   68:aload           8
	//   35   70:getfield        #335 <Field int Rect.right>
	//   36   73:aload_0         
	//   37   74:getfield        #119 <Field EditText a>
	//   38   77:invokevirtual   #885 <Method int EditText.getCompoundPaddingRight()>
	//   39   80:isub            
	//   40   81:istore          4
				int i2 = k();
	//   41   83:aload_0         
	//   42   84:invokespecial   #887 <Method int k()>
	//   43   87:istore          6
				c.a(i1, rect.top + a.getCompoundPaddingTop(), k1, rect.bottom - a.getCompoundPaddingBottom());
	//   44   89:aload_0         
	//   45   90:getfield        #144 <Field ag c>
	//   46   93:iload_2         
	//   47   94:aload           8
	//   48   96:getfield        #311 <Field int Rect.top>
	//   49   99:aload_0         
	//   50  100:getfield        #119 <Field EditText a>
	//   51  103:invokevirtual   #890 <Method int EditText.getCompoundPaddingTop()>
	//   52  106:iadd            
	//   53  107:iload           4
	//   54  109:aload           8
	//   55  111:getfield        #892 <Field int Rect.bottom>
	//   56  114:aload_0         
	//   57  115:getfield        #119 <Field EditText a>
	//   58  118:invokevirtual   #895 <Method int EditText.getCompoundPaddingBottom()>
	//   59  121:isub            
	//   60  122:invokevirtual   #897 <Method void android.support.design.widget.ag.a(int, int, int, int)>
				c.b(i1, i2, k1, l1 - j1 - getPaddingBottom());
	//   61  125:aload_0         
	//   62  126:getfield        #144 <Field ag c>
	//   63  129:iload_2         
	//   64  130:iload           6
	//   65  132:iload           4
	//   66  134:iload           5
	//   67  136:iload_3         
	//   68  137:isub            
	//   69  138:aload_0         
	//   70  139:invokevirtual   #898 <Method int getPaddingBottom()>
	//   71  142:isub            
	//   72  143:invokevirtual   #900 <Method void ag.b(int, int, int, int)>
				c.g();
	//   73  146:aload_0         
	//   74  147:getfield        #144 <Field ag c>
	//   75  150:invokevirtual   #901 <Method void android.support.design.widget.ag.g()>
				if(t() && !aa)
	//*  76  153:aload_0         
	//*  77  154:invokespecial   #202 <Method boolean t()>
	//*  78  157:ifeq            171
	//*  79  160:aload_0         
	//*  80  161:getfield        #175 <Field boolean aa>
	//*  81  164:ifne            171
					u();
	//   82  167:aload_0         
	//   83  168:invokespecial   #204 <Method void u()>
			}
		}
	//   84  171:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #612 <Method void p()>
		super.onMeasure(i1, j1);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #904 <Method void LinearLayout.onMeasure(int, int)>
	//    6   10:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #908 <Class TextInputLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #910 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #908 <Class TextInputLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #914 <Method Parcelable TextInputLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #910 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
		setError(((SavedState) (parcelable)).a);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #916 <Field CharSequence android.support.design.widget.TextInputLayout$SavedState.a>
	//   17   31:invokevirtual   #919 <Method void setError(CharSequence)>
		if(((SavedState) (parcelable)).b)
	//*  18   34:aload_1         
	//*  19   35:getfield        #920 <Field boolean TextInputLayout$SavedState.b>
	//*  20   38:ifeq            46
			b(true);
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:invokevirtual   #922 <Method void b(boolean)>
		requestLayout();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #923 <Method void requestLayout()>
	//   26   50:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #908 <Class TextInputLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #926 <Method Parcelable LinearLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #928 <Method void TextInputLayout$SavedState(Parcelable)>
	//    5   11:astore_1        
		if(f.g())
	//*   6   12:aload_0         
	//*   7   13:getfield        #136 <Field bl f>
	//*   8   16:invokevirtual   #140 <Method boolean android.support.design.widget.bl.g()>
	//*   9   19:ifeq            30
			savedstate.a = getError();
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #930 <Method CharSequence getError()>
	//   13   27:putfield        #916 <Field CharSequence android.support.design.widget.TextInputLayout$SavedState.a>
		savedstate.b = K;
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #471 <Field boolean K>
	//   17   35:putfield        #920 <Field boolean TextInputLayout$SavedState.b>
		return ((Parcelable) (savedstate));
	//   18   38:aload_1         
	//   19   39:areturn         
	}

	public void setBoxBackgroundColor(int i1)
	{
		if(B != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #378 <Field int B>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			B = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #378 <Field int B>
			n();
	//    7   13:aload_0         
	//    8   14:invokespecial   #288 <Method void n()>
		}
	//    9   17:return          
	}

	public void setBoxBackgroundColorResource(int i1)
	{
		setBoxBackgroundColor(android.support.v4.a.c.c(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #418 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #735 <Method int c.c(Context, int)>
	//    5    9:invokevirtual   #934 <Method void setBoxBackgroundColor(int)>
	//    6   12:return          
	}

	public void setBoxBackgroundMode(int i1)
	{
		if(i1 == r)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #216 <Field int r>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			r = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #216 <Field int r>
			e();
	//    8   14:aload_0         
	//    9   15:invokespecial   #410 <Method void e()>
			return;
	//   10   18:return          
		}
	}

	public void setBoxStrokeColor(int i1)
	{
		if(V != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #342 <Field int V>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			V = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #342 <Field int V>
			d();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #714 <Method void d()>
		}
	//    9   17:return          
	}

	public void setCounterEnabled(boolean flag)
	{
		if(b != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #846 <Field boolean b>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          141
		{
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            119
			{
				i = ((TextView) (new AppCompatTextView(getContext())));
	//    6   12:aload_0         
	//    7   13:new             #939 <Class AppCompatTextView>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #418 <Method Context getContext()>
	//   11   21:invokespecial   #942 <Method void AppCompatTextView(Context)>
	//   12   24:putfield        #166 <Field TextView i>
				i.setId(g.textinput_counter);
	//   13   27:aload_0         
	//   14   28:getfield        #166 <Field TextView i>
	//   15   31:getstatic       #947 <Field int g.textinput_counter>
	//   16   34:invokevirtual   #950 <Method void TextView.setId(int)>
				Object obj = ((Object) (F));
	//   17   37:aload_0         
	//   18   38:getfield        #873 <Field Typeface F>
	//   19   41:astore_2        
				if(obj != null)
	//*  20   42:aload_2         
	//*  21   43:ifnull          54
					i.setTypeface(((Typeface) (obj)));
	//   22   46:aload_0         
	//   23   47:getfield        #166 <Field TextView i>
	//   24   50:aload_2         
	//   25   51:invokevirtual   #953 <Method void TextView.setTypeface(Typeface)>
				i.setMaxLines(1);
	//   26   54:aload_0         
	//   27   55:getfield        #166 <Field TextView i>
	//   28   58:iconst_1        
	//   29   59:invokevirtual   #956 <Method void TextView.setMaxLines(int)>
				a(i, k);
	//   30   62:aload_0         
	//   31   63:aload_0         
	//   32   64:getfield        #166 <Field TextView i>
	//   33   67:aload_0         
	//   34   68:getfield        #687 <Field int k>
	//   35   71:invokevirtual   #690 <Method void a(TextView, int)>
				f.a(i, 2);
	//   36   74:aload_0         
	//   37   75:getfield        #136 <Field bl f>
	//   38   78:aload_0         
	//   39   79:getfield        #166 <Field TextView i>
	//   40   82:iconst_2        
	//   41   83:invokevirtual   #957 <Method void android.support.design.widget.bl.a(TextView, int)>
				obj = ((Object) (a));
	//   42   86:aload_0         
	//   43   87:getfield        #119 <Field EditText a>
	//   44   90:astore_2        
				if(obj == null)
	//*  45   91:aload_2         
	//*  46   92:ifnonnull       103
					a(0);
	//   47   95:aload_0         
	//   48   96:iconst_0        
	//   49   97:invokevirtual   #608 <Method void a(int)>
				else
	//*  50  100:goto            136
					a(((EditText) (obj)).getText().length());
	//   51  103:aload_0         
	//   52  104:aload_2         
	//   53  105:invokevirtual   #125 <Method Editable EditText.getText()>
	//   54  108:invokeinterface #607 <Method int Editable.length()>
	//   55  113:invokevirtual   #608 <Method void a(int)>
			} else
	//*  56  116:goto            136
			{
				f.b(i, 2);
	//   57  119:aload_0         
	//   58  120:getfield        #136 <Field bl f>
	//   59  123:aload_0         
	//   60  124:getfield        #166 <Field TextView i>
	//   61  127:iconst_2        
	//   62  128:invokevirtual   #959 <Method void bl.b(TextView, int)>
				i = null;
	//   63  131:aload_0         
	//   64  132:aconst_null     
	//   65  133:putfield        #166 <Field TextView i>
			}
			b = flag;
	//   66  136:aload_0         
	//   67  137:iload_1         
	//   68  138:putfield        #846 <Field boolean b>
		}
	//   69  141:return          
	}

	public void setCounterMaxLength(int i1)
	{
		if(g != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #669 <Field int g>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          61
		{
			if(i1 > 0)
	//*   4    8:iload_1         
	//*   5    9:ifle            20
				g = i1;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #669 <Field int g>
			else
	//*   9   17:goto            25
				g = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #669 <Field int g>
			if(b)
	//*  13   25:aload_0         
	//*  14   26:getfield        #846 <Field boolean b>
	//*  15   29:ifeq            61
			{
				EditText edittext = a;
	//   16   32:aload_0         
	//   17   33:getfield        #119 <Field EditText a>
	//   18   36:astore_2        
				if(edittext == null)
	//*  19   37:aload_2         
	//*  20   38:ifnonnull       46
					i1 = 0;
	//   21   41:iconst_0        
	//   22   42:istore_1        
				else
	//*  23   43:goto            56
					i1 = edittext.getText().length();
	//   24   46:aload_2         
	//   25   47:invokevirtual   #125 <Method Editable EditText.getText()>
	//   26   50:invokeinterface #607 <Method int Editable.length()>
	//   27   55:istore_1        
				a(i1);
	//   28   56:aload_0         
	//   29   57:iload_1         
	//   30   58:invokevirtual   #608 <Method void a(int)>
			}
		}
	//   31   61:return          
	}

	public void setDefaultHintTextColor(ColorStateList colorstatelist)
	{
		R = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field ColorStateList R>
		S = colorstatelist;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #173 <Field ColorStateList S>
		if(a != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #119 <Field EditText a>
	//*   8   14:ifnull          22
			a(false);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #713 <Method void a(boolean)>
	//   12   22:return          
	}

	public void setEnabled(boolean flag)
	{
		a(((ViewGroup) (this)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #112 <Method void a(ViewGroup, boolean)>
		super.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #962 <Method void LinearLayout.setEnabled(boolean)>
	//    6   10:return          
	}

	public void setError(CharSequence charsequence)
	{
		if(!f.e())
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field bl f>
	//*   2    4:invokevirtual   #855 <Method boolean bl.e()>
	//*   3    7:ifne            23
		{
			if(TextUtils.isEmpty(charsequence))
	//*   4   10:aload_1         
	//*   5   11:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   14:ifeq            18
				return;
	//    7   17:return          
			setErrorEnabled(true);
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #965 <Method void setErrorEnabled(boolean)>
		}
		if(!TextUtils.isEmpty(charsequence))
	//*  11   23:aload_1         
	//*  12   24:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   27:ifne            39
		{
			f.b(charsequence);
	//   14   30:aload_0         
	//   15   31:getfield        #136 <Field bl f>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #967 <Method void bl.b(CharSequence)>
			return;
	//   18   38:return          
		} else
		{
			f.b();
	//   19   39:aload_0         
	//   20   40:getfield        #136 <Field bl f>
	//   21   43:invokevirtual   #968 <Method void bl.b()>
			return;
	//   22   46:return          
		}
	}

	public void setErrorEnabled(boolean flag)
	{
		f.a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #969 <Method void android.support.design.widget.bl.a(boolean)>
	//    4    8:return          
	}

	public void setErrorTextAppearance(int i1)
	{
		f.b(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #971 <Method void bl.b(int)>
	//    4    8:return          
	}

	public void setErrorTextColor(ColorStateList colorstatelist)
	{
		f.a(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #973 <Method void android.support.design.widget.bl.a(ColorStateList)>
	//    4    8:return          
	}

	public void setHelperText(CharSequence charsequence)
	{
		if(TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            20
		{
			if(b())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #976 <Method boolean b()>
	//*   5   11:ifeq            40
			{
				setHelperTextEnabled(false);
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #979 <Method void setHelperTextEnabled(boolean)>
				return;
	//    9   19:return          
			}
		} else
		{
			if(!b())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #976 <Method boolean b()>
	//*  12   24:ifne            32
				setHelperTextEnabled(true);
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #979 <Method void setHelperTextEnabled(boolean)>
			f.a(charsequence);
	//   16   32:aload_0         
	//   17   33:getfield        #136 <Field bl f>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #980 <Method void android.support.design.widget.bl.a(CharSequence)>
		}
	//   20   40:return          
	}

	public void setHelperTextColor(ColorStateList colorstatelist)
	{
		f.b(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #982 <Method void bl.b(ColorStateList)>
	//    4    8:return          
	}

	public void setHelperTextEnabled(boolean flag)
	{
		f.b(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #983 <Method void bl.b(boolean)>
	//    4    8:return          
	}

	public void setHelperTextTextAppearance(int i1)
	{
		f.c(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field bl f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #986 <Method void android.support.design.widget.bl.c(int)>
	//    4    8:return          
	}

	public void setHint(CharSequence charsequence)
	{
		if(l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #222 <Field boolean l>
	//*   2    4:ifeq            19
		{
			setHintInternal(charsequence);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #988 <Method void setHintInternal(CharSequence)>
			sendAccessibilityEvent(2048);
	//    6   12:aload_0         
	//    7   13:sipush          2048
	//    8   16:invokevirtual   #991 <Method void sendAccessibilityEvent(int)>
		}
	//    9   19:return          
	}

	public void setHintAnimationEnabled(boolean flag)
	{
		ab = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #195 <Field boolean ab>
	//    3    5:return          
	}

	public void setHintEnabled(boolean flag)
	{
		if(flag != l)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #222 <Field boolean l>
	//*   3    5:icmpeq          121
		{
			l = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #222 <Field boolean l>
			if(!l)
	//*   7   13:aload_0         
	//*   8   14:getfield        #222 <Field boolean l>
	//*   9   17:ifne            67
			{
				n = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #602 <Field boolean n>
				if(!TextUtils.isEmpty(m) && TextUtils.isEmpty(a.getHint()))
	//*  13   25:aload_0         
	//*  14   26:getfield        #590 <Field CharSequence m>
	//*  15   29:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   32:ifne            59
	//*  17   35:aload_0         
	//*  18   36:getfield        #119 <Field EditText a>
	//*  19   39:invokevirtual   #594 <Method CharSequence EditText.getHint()>
	//*  20   42:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   45:ifeq            59
					a.setHint(m);
	//   22   48:aload_0         
	//   23   49:getfield        #119 <Field EditText a>
	//   24   52:aload_0         
	//   25   53:getfield        #590 <Field CharSequence m>
	//   26   56:invokevirtual   #600 <Method void EditText.setHint(CharSequence)>
				setHintInternal(((CharSequence) (null)));
	//   27   59:aload_0         
	//   28   60:aconst_null     
	//   29   61:invokespecial   #988 <Method void setHintInternal(CharSequence)>
			} else
	//*  30   64:goto            110
			{
				CharSequence charsequence = a.getHint();
	//   31   67:aload_0         
	//   32   68:getfield        #119 <Field EditText a>
	//   33   71:invokevirtual   #594 <Method CharSequence EditText.getHint()>
	//   34   74:astore_2        
				if(!TextUtils.isEmpty(charsequence))
	//*  35   75:aload_2         
	//*  36   76:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   79:ifne            105
				{
					if(TextUtils.isEmpty(m))
	//*  38   82:aload_0         
	//*  39   83:getfield        #590 <Field CharSequence m>
	//*  40   86:invokestatic    #131 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   89:ifeq            97
						setHint(charsequence);
	//   42   92:aload_0         
	//   43   93:aload_2         
	//   44   94:invokevirtual   #599 <Method void setHint(CharSequence)>
					a.setHint(((CharSequence) (null)));
	//   45   97:aload_0         
	//   46   98:getfield        #119 <Field EditText a>
	//   47  101:aconst_null     
	//   48  102:invokevirtual   #600 <Method void EditText.setHint(CharSequence)>
				}
				n = true;
	//   49  105:aload_0         
	//   50  106:iconst_1        
	//   51  107:putfield        #602 <Field boolean n>
			}
			if(a != null)
	//*  52  110:aload_0         
	//*  53  111:getfield        #119 <Field EditText a>
	//*  54  114:ifnull          121
				g();
	//   55  117:aload_0         
	//   56  118:invokespecial   #218 <Method void g()>
		}
	//   57  121:return          
	}

	public void setHintTextAppearance(int i1)
	{
		c.c(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field ag c>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #995 <Method void android.support.design.widget.ag.c(int)>
		S = c.h();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #144 <Field ag c>
	//    7   13:invokevirtual   #997 <Method ColorStateList ag.h()>
	//    8   16:putfield        #173 <Field ColorStateList S>
		if(a != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #119 <Field EditText a>
	//*  11   23:ifnull          35
		{
			a(false);
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #713 <Method void a(boolean)>
			g();
	//   15   31:aload_0         
	//   16   32:invokespecial   #218 <Method void g()>
		}
	//   17   35:return          
	}

	public void setPasswordVisibilityToggleContentDescription(int i1)
	{
		CharSequence charsequence;
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			charsequence = getResources().getText(i1);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1002 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1007 <Method CharSequence Resources.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			charsequence = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleContentDescription(charsequence);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1009 <Method void setPasswordVisibilityToggleContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleContentDescription(CharSequence charsequence)
	{
		I = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #443 <Field CharSequence I>
		CheckableImageButton checkableimagebutton = J;
	//    3    5:aload_0         
	//    4    6:getfield        #414 <Field CheckableImageButton J>
	//    5    9:astore_2        
		if(checkableimagebutton != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			checkableimagebutton.setContentDescription(charsequence);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #447 <Method void CheckableImageButton.setContentDescription(CharSequence)>
	//   11   19:return          
	}

	public void setPasswordVisibilityToggleDrawable(int i1)
	{
		Drawable drawable;
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i1);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #418 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1015 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleDrawable(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1017 <Method void setPasswordVisibilityToggleDrawable(Drawable)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleDrawable(Drawable drawable)
	{
		H = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #437 <Field Drawable H>
		CheckableImageButton checkableimagebutton = J;
	//    3    5:aload_0         
	//    4    6:getfield        #414 <Field CheckableImageButton J>
	//    5    9:astore_2        
		if(checkableimagebutton != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			checkableimagebutton.setImageDrawable(drawable);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #441 <Method void CheckableImageButton.setImageDrawable(Drawable)>
	//   11   19:return          
	}

	public void setPasswordVisibilityToggleEnabled(boolean flag)
	{
		if(G != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #516 <Field boolean G>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          49
		{
			G = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #516 <Field boolean G>
			if(!flag && K)
	//*   7   13:iload_1         
	//*   8   14:ifne            40
	//*   9   17:aload_0         
	//*  10   18:getfield        #471 <Field boolean K>
	//*  11   21:ifeq            40
			{
				EditText edittext = a;
	//   12   24:aload_0         
	//   13   25:getfield        #119 <Field EditText a>
	//   14   28:astore_2        
				if(edittext != null)
	//*  15   29:aload_2         
	//*  16   30:ifnull          40
					edittext.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   17   33:aload_2         
	//   18   34:invokestatic    #768 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   19   37:invokevirtual   #764 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
			}
			K = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #471 <Field boolean K>
			p();
	//   23   45:aload_0         
	//   24   46:invokespecial   #612 <Method void p()>
		}
	//   25   49:return          
	}

	public void setPasswordVisibilityToggleTintList(ColorStateList colorstatelist)
	{
		N = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #529 <Field ColorStateList N>
		O = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #520 <Field boolean O>
		s();
	//    6   10:aload_0         
	//    7   11:invokespecial   #1021 <Method void s()>
	//    8   14:return          
	}

	public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode)
	{
		P = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #534 <Field android.graphics.PorterDuff$Mode P>
		Q = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #522 <Field boolean Q>
		s();
	//    6   10:aload_0         
	//    7   11:invokespecial   #1021 <Method void s()>
	//    8   14:return          
	}

	public void setTextInputAccessibilityDelegate(cg cg1)
	{
		EditText edittext = a;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field EditText a>
	//    2    4:astore_2        
		if(edittext != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			android.support.v4.view.ac.a(((View) (edittext)), ((android.support.v4.view.b) (cg1)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #1026 <Method void ac.a(View, android.support.v4.view.b)>
	//    8   14:return          
	}

	public void setTypeface(Typeface typeface)
	{
		if(typeface != F)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #873 <Field Typeface F>
	//*   3    5:if_acmpeq       43
		{
			F = typeface;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #873 <Field Typeface F>
			c.a(typeface);
	//    7   13:aload_0         
	//    8   14:getfield        #144 <Field ag c>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #567 <Method void android.support.design.widget.ag.a(Typeface)>
			f.a(typeface);
	//   11   21:aload_0         
	//   12   22:getfield        #136 <Field bl f>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #1027 <Method void android.support.design.widget.bl.a(Typeface)>
			TextView textview = i;
	//   15   29:aload_0         
	//   16   30:getfield        #166 <Field TextView i>
	//   17   33:astore_2        
			if(textview != null)
	//*  18   34:aload_2         
	//*  19   35:ifnull          43
				textview.setTypeface(typeface);
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #953 <Method void TextView.setTypeface(Typeface)>
		}
	//   23   43:return          
	}

	private int A;
	private int B;
	private Drawable C;
	private final Rect D;
	private final RectF E;
	private Typeface F;
	private boolean G;
	private Drawable H;
	private CharSequence I;
	private CheckableImageButton J;
	private boolean K;
	private Drawable L;
	private Drawable M;
	private ColorStateList N;
	private boolean O;
	private android.graphics.PorterDuff.Mode P;
	private boolean Q;
	private ColorStateList R;
	private ColorStateList S;
	private final int T;
	private final int U;
	private int V;
	private final int W;
	EditText a;
	private boolean aa;
	private boolean ab;
	private ValueAnimator ac;
	private boolean ad;
	private boolean ae;
	private boolean af;
	boolean b;
	final ag c;
	private final FrameLayout d;
	private CharSequence e;
	private final bl f;
	private int g;
	private boolean h;
	private TextView i;
	private final int j;
	private final int k;
	private boolean l;
	private CharSequence m;
	private boolean n;
	private GradientDrawable o;
	private final int p;
	private final int q;
	private int r;
	private final int s;
	private float t;
	private float u;
	private float v;
	private float w;
	private int x;
	private final int y;
	private final int z;

	private class SavedState extends AbsSavedState
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #53  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #54  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("TextInputLayout.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #56  <String "TextInputLayout.SavedState{">
		//    6   11:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #66  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #72  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" error=");
		//   14   27:aload_1         
		//   15   28:ldc1            #74  <String " error=">
		//   16   30:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(((Object) (a)));
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #38  <Field CharSequence a>
		//   21   39:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #79  <String "}">
		//   25   46:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #85  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #87  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #92  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new ch();
		CharSequence a;
		boolean b;

		static 
		{
		//    0    0:new             #14  <Class ch>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void ch()>
		//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
		//    4    6:aload_0         
		//    5    7:getstatic       #28  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//    6   10:aload_1         
		//    7   11:invokeinterface #34  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    8   16:checkcast       #36  <Class CharSequence>
		//    9   19:putfield        #38  <Field CharSequence a>
			int i1 = parcel.readInt();
		//   10   22:aload_1         
		//   11   23:invokevirtual   #44  <Method int Parcel.readInt()>
		//   12   26:istore_3        
			boolean flag = true;
		//   13   27:iconst_1        
		//   14   28:istore          4
			if(i1 != 1)
		//*  15   30:iload_3         
		//*  16   31:iconst_1        
		//*  17   32:icmpne          38
		//*  18   35:goto            41
				flag = false;
		//   19   38:iconst_0        
		//   20   39:istore          4
			b = flag;
		//   21   41:aload_0         
		//   22   42:iload           4
		//   23   44:putfield        #46  <Field boolean b>
		//   24   47:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #49  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

}
