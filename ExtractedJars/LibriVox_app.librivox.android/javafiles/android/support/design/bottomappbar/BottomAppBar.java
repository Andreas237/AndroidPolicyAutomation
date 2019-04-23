// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomappbar;

import android.animation.*;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.design.g.c;
import android.support.design.widget.*;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.ac;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import java.util.*;

// Referenced classes of package android.support.design.bottomappbar:
//			a, f, b, c, 
//			d

public class BottomAppBar extends Toolbar
	implements ai
{

	private float a(boolean flag)
	{
		FloatingActionButton floatingactionbutton = a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method FloatingActionButton a()>
	//    2    4:astore          7
		if(floatingactionbutton == null)
	//*   3    6:aload           7
	//*   4    8:ifnonnull       13
			return 0.0F;
	//    5   11:fconst_0        
	//    6   12:freturn         
		Rect rect = new Rect();
	//    7   13:new             #28  <Class Rect>
	//    8   16:dup             
	//    9   17:invokespecial   #32  <Method void Rect()>
	//   10   20:astore          8
		floatingactionbutton.a(rect);
	//   11   22:aload           7
	//   12   24:aload           8
	//   13   26:invokevirtual   #37  <Method boolean FloatingActionButton.a(Rect)>
	//   14   29:pop             
		float f2 = rect.height();
	//   15   30:aload           8
	//   16   32:invokevirtual   #41  <Method int Rect.height()>
	//   17   35:i2f             
	//   18   36:fstore_3        
		float f1 = f2;
	//   19   37:fload_3         
	//   20   38:fstore_2        
		if(f2 == 0.0F)
	//*  21   39:fload_3         
	//*  22   40:fconst_0        
	//*  23   41:fcmpl           
	//*  24   42:ifne            52
			f1 = floatingactionbutton.getMeasuredHeight();
	//   25   45:aload           7
	//   26   47:invokevirtual   #44  <Method int FloatingActionButton.getMeasuredHeight()>
	//   27   50:i2f             
	//   28   51:fstore_2        
		f2 = floatingactionbutton.getHeight() - rect.bottom;
	//   29   52:aload           7
	//   30   54:invokevirtual   #47  <Method int FloatingActionButton.getHeight()>
	//   31   57:aload           8
	//   32   59:getfield        #50  <Field int Rect.bottom>
	//   33   62:isub            
	//   34   63:i2f             
	//   35   64:fstore_3        
		float f5 = floatingactionbutton.getHeight() - rect.height();
	//   36   65:aload           7
	//   37   67:invokevirtual   #47  <Method int FloatingActionButton.getHeight()>
	//   38   70:aload           8
	//   39   72:invokevirtual   #41  <Method int Rect.height()>
	//   40   75:isub            
	//   41   76:i2f             
	//   42   77:fstore          6
		float f3 = -getCradleVerticalOffset();
	//   43   79:aload_0         
	//   44   80:invokevirtual   #54  <Method float getCradleVerticalOffset()>
	//   45   83:fneg            
	//   46   84:fstore          4
		float f4 = f1 / 2.0F;
	//   47   86:fload_2         
	//   48   87:fconst_2        
	//   49   88:fdiv            
	//   50   89:fstore          5
		f1 = f5 - (float)floatingactionbutton.getPaddingBottom();
	//   51   91:fload           6
	//   52   93:aload           7
	//   53   95:invokevirtual   #57  <Method int FloatingActionButton.getPaddingBottom()>
	//   54   98:i2f             
	//   55   99:fsub            
	//   56  100:fstore_2        
		f5 = -getMeasuredHeight();
	//   57  101:aload_0         
	//   58  102:invokevirtual   #58  <Method int getMeasuredHeight()>
	//   59  105:ineg            
	//   60  106:i2f             
	//   61  107:fstore          6
		if(flag)
	//*  62  109:iload_1         
	//*  63  110:ifeq            121
			f1 = f3 + f4 + f2;
	//   64  113:fload           4
	//   65  115:fload           5
	//   66  117:fadd            
	//   67  118:fload_3         
	//   68  119:fadd            
	//   69  120:fstore_2        
		return f5 + f1;
	//   70  121:fload           6
	//   71  123:fload_2         
	//   72  124:fadd            
	//   73  125:freturn         
	}

	static Animator a(BottomAppBar bottomappbar, Animator animator)
	{
		bottomappbar.f = animator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field Animator f>
		return animator;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static f a(BottomAppBar bottomappbar)
	{
		return bottomappbar.d;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field f d>
	//    2    4:areturn         
	}

	private FloatingActionButton a()
	{
		if(!(getParent() instanceof CoordinatorLayout))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method android.view.ViewParent getParent()>
	//*   2    4:instanceof      #71  <Class CoordinatorLayout>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		for(Iterator iterator = ((CoordinatorLayout)getParent()).d(((View) (this))).iterator(); iterator.hasNext();)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #69  <Method android.view.ViewParent getParent()>
	//*   8   16:checkcast       #71  <Class CoordinatorLayout>
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #74  <Method List CoordinatorLayout.d(View)>
	//*  11   23:invokeinterface #80  <Method Iterator List.iterator()>
	//*  12   28:astore_1        
	//*  13   29:aload_1         
	//*  14   30:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//*  15   35:ifeq            60
		{
			View view = (View)iterator.next();
	//   16   38:aload_1         
	//   17   39:invokeinterface #90  <Method Object Iterator.next()>
	//   18   44:checkcast       #92  <Class View>
	//   19   47:astore_2        
			if(view instanceof FloatingActionButton)
	//*  20   48:aload_2         
	//*  21   49:instanceof      #34  <Class FloatingActionButton>
	//*  22   52:ifeq            29
				return (FloatingActionButton)view;
	//   23   55:aload_2         
	//   24   56:checkcast       #34  <Class FloatingActionButton>
	//   25   59:areturn         
		}

		return null;
	//   26   60:aconst_null     
	//   27   61:areturn         
	}

	private void a(int k)
	{
		if(h != k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field int h>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          90
		{
			if(!ac.x(((View) (this))))
	//*   4    8:aload_0         
	//*   5    9:invokestatic    #101 <Method boolean ac.x(View)>
	//*   6   12:ifne            16
				return;
	//    7   15:return          
			Object obj = ((Object) (f));
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field Animator f>
	//   10   20:astore_2        
			if(obj != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          29
				((Animator) (obj)).cancel();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #106 <Method void Animator.cancel()>
			obj = ((Object) (new ArrayList()));
	//   15   29:new             #108 <Class ArrayList>
	//   16   32:dup             
	//   17   33:invokespecial   #109 <Method void ArrayList()>
	//   18   36:astore_2        
			a(k, ((List) (obj)));
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:aload_2         
	//   22   40:invokespecial   #112 <Method void a(int, List)>
			b(k, ((List) (obj)));
	//   23   43:aload_0         
	//   24   44:iload_1         
	//   25   45:aload_2         
	//   26   46:invokespecial   #114 <Method void b(int, List)>
			AnimatorSet animatorset = new AnimatorSet();
	//   27   49:new             #116 <Class AnimatorSet>
	//   28   52:dup             
	//   29   53:invokespecial   #117 <Method void AnimatorSet()>
	//   30   56:astore_3        
			animatorset.playTogether(((java.util.Collection) (obj)));
	//   31   57:aload_3         
	//   32   58:aload_2         
	//   33   59:invokevirtual   #121 <Method void AnimatorSet.playTogether(java.util.Collection)>
			f = ((Animator) (animatorset));
	//   34   62:aload_0         
	//   35   63:aload_3         
	//   36   64:putfield        #62  <Field Animator f>
			f.addListener(((android.animation.Animator.AnimatorListener) (new android.support.design.bottomappbar.a(this))));
	//   37   67:aload_0         
	//   38   68:getfield        #62  <Field Animator f>
	//   39   71:new             #123 <Class android.support.design.bottomappbar.a>
	//   40   74:dup             
	//   41   75:aload_0         
	//   42   76:invokespecial   #126 <Method void android.support.design.bottomappbar.a(BottomAppBar)>
	//   43   79:invokevirtual   #130 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			f.start();
	//   44   82:aload_0         
	//   45   83:getfield        #62  <Field Animator f>
	//   46   86:invokevirtual   #133 <Method void Animator.start()>
			return;
	//   47   89:return          
		} else
		{
			return;
	//   48   90:return          
		}
	}

	private void a(int k, List list)
	{
		if(!j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field boolean j>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
				d.a(), (float)b(k)
			});
	//    4    8:iconst_2        
	//    5    9:newarray        float[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:getfield        #65  <Field f d>
	//   10   17:invokevirtual   #139 <Method float android.support.design.bottomappbar.f.a()>
	//   11   20:fastore         
	//   12   21:dup             
	//   13   22:iconst_1        
	//   14   23:aload_0         
	//   15   24:iload_1         
	//   16   25:invokespecial   #142 <Method int b(int)>
	//   17   28:i2f             
	//   18   29:fastore         
	//   19   30:invokestatic    #148 <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   20   33:astore_3        
			valueanimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (new b(this))));
	//   21   34:aload_3         
	//   22   35:new             #150 <Class b>
	//   23   38:dup             
	//   24   39:aload_0         
	//   25   40:invokespecial   #151 <Method void b(BottomAppBar)>
	//   26   43:invokevirtual   #155 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			valueanimator.setDuration(300L);
	//   27   46:aload_3         
	//   28   47:ldc2w           #156 <Long 300L>
	//   29   50:invokevirtual   #161 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   30   53:pop             
			list.add(((Object) (valueanimator)));
	//   31   54:aload_2         
	//   32   55:aload_3         
	//   33   56:invokeinterface #165 <Method boolean List.add(Object)>
	//   34   61:pop             
			return;
	//   35   62:return          
		}
	}

	private void a(int k, boolean flag)
	{
		if(!ac.x(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #101 <Method boolean ac.x(View)>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj = ((Object) (g));
	//    4    8:aload_0         
	//    5    9:getfield        #168 <Field Animator g>
	//    6   12:astore_3        
		if(obj != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          21
			((Animator) (obj)).cancel();
	//    9   17:aload_3         
	//   10   18:invokevirtual   #106 <Method void Animator.cancel()>
		obj = ((Object) (new ArrayList()));
	//   11   21:new             #108 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #109 <Method void ArrayList()>
	//   14   28:astore_3        
		if(!b())
	//*  15   29:aload_0         
	//*  16   30:invokespecial   #170 <Method boolean b()>
	//*  17   33:ifne            40
		{
			k = 0;
	//   18   36:iconst_0        
	//   19   37:istore_1        
			flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_2        
		}
		a(k, flag, ((List) (obj)));
	//   22   40:aload_0         
	//   23   41:iload_1         
	//   24   42:iload_2         
	//   25   43:aload_3         
	//   26   44:invokespecial   #173 <Method void a(int, boolean, List)>
		AnimatorSet animatorset = new AnimatorSet();
	//   27   47:new             #116 <Class AnimatorSet>
	//   28   50:dup             
	//   29   51:invokespecial   #117 <Method void AnimatorSet()>
	//   30   54:astore          4
		animatorset.playTogether(((java.util.Collection) (obj)));
	//   31   56:aload           4
	//   32   58:aload_3         
	//   33   59:invokevirtual   #121 <Method void AnimatorSet.playTogether(java.util.Collection)>
		g = ((Animator) (animatorset));
	//   34   62:aload_0         
	//   35   63:aload           4
	//   36   65:putfield        #168 <Field Animator g>
		g.addListener(((android.animation.Animator.AnimatorListener) (new android.support.design.bottomappbar.c(this))));
	//   37   68:aload_0         
	//   38   69:getfield        #168 <Field Animator g>
	//   39   72:new             #175 <Class android.support.design.bottomappbar.c>
	//   40   75:dup             
	//   41   76:aload_0         
	//   42   77:invokespecial   #176 <Method void android.support.design.bottomappbar.c(BottomAppBar)>
	//   43   80:invokevirtual   #130 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
		g.start();
	//   44   83:aload_0         
	//   45   84:getfield        #168 <Field Animator g>
	//   46   87:invokevirtual   #133 <Method void Animator.start()>
	//   47   90:return          
	}

	private void a(int k, boolean flag, List list)
	{
		Object obj = ((Object) (getActionMenuView()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #180 <Method ActionMenuView getActionMenuView()>
	//    2    4:astore          6
		if(obj == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
			1.0F
		});
	//    6   12:aload           6
	//    7   14:ldc1            #182 <String "alpha">
	//    8   16:iconst_1        
	//    9   17:newarray        float[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:fconst_1        
	//   13   22:fastore         
	//   14   23:invokestatic    #187 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   15   26:astore          4
		if(!j && (!flag || !b()) || h != 1 && k != 1)
	//*  16   28:aload_0         
	//*  17   29:getfield        #135 <Field boolean j>
	//*  18   32:ifne            46
	//*  19   35:iload_2         
	//*  20   36:ifeq            62
	//*  21   39:aload_0         
	//*  22   40:invokespecial   #170 <Method boolean b()>
	//*  23   43:ifeq            62
	//*  24   46:aload_0         
	//*  25   47:getfield        #95  <Field int h>
	//*  26   50:iconst_1        
	//*  27   51:icmpeq          82
	//*  28   54:iload_1         
	//*  29   55:iconst_1        
	//*  30   56:icmpne          62
	//*  31   59:goto            82
		{
			if(((ActionMenuView) (obj)).getAlpha() < 1.0F)
	//*  32   62:aload           6
	//*  33   64:invokevirtual   #192 <Method float ActionMenuView.getAlpha()>
	//*  34   67:fconst_1        
	//*  35   68:fcmpg           
	//*  36   69:ifge            161
			{
				list.add(((Object) (objectanimator)));
	//   37   72:aload_3         
	//   38   73:aload           4
	//   39   75:invokeinterface #165 <Method boolean List.add(Object)>
	//   40   80:pop             
				return;
	//   41   81:return          
			}
		} else
		{
			ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
				0.0F
			});
	//   42   82:aload           6
	//   43   84:ldc1            #182 <String "alpha">
	//   44   86:iconst_1        
	//   45   87:newarray        float[]
	//   46   89:dup             
	//   47   90:iconst_0        
	//   48   91:fconst_0        
	//   49   92:fastore         
	//   50   93:invokestatic    #187 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   51   96:astore          5
			((Animator) (objectanimator1)).addListener(((android.animation.Animator.AnimatorListener) (new d(this, ((ActionMenuView) (obj)), k, flag))));
	//   52   98:aload           5
	//   53  100:new             #194 <Class d>
	//   54  103:dup             
	//   55  104:aload_0         
	//   56  105:aload           6
	//   57  107:iload_1         
	//   58  108:iload_2         
	//   59  109:invokespecial   #197 <Method void d(BottomAppBar, ActionMenuView, int, boolean)>
	//   60  112:invokevirtual   #130 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			obj = ((Object) (new AnimatorSet()));
	//   61  115:new             #116 <Class AnimatorSet>
	//   62  118:dup             
	//   63  119:invokespecial   #117 <Method void AnimatorSet()>
	//   64  122:astore          6
			((AnimatorSet) (obj)).setDuration(150L);
	//   65  124:aload           6
	//   66  126:ldc2w           #198 <Long 150L>
	//   67  129:invokevirtual   #202 <Method AnimatorSet AnimatorSet.setDuration(long)>
	//   68  132:pop             
			((AnimatorSet) (obj)).playSequentially(new Animator[] {
				objectanimator1, objectanimator
			});
	//   69  133:aload           6
	//   70  135:iconst_2        
	//   71  136:anewarray       Animator[]
	//   72  139:dup             
	//   73  140:iconst_0        
	//   74  141:aload           5
	//   75  143:aastore         
	//   76  144:dup             
	//   77  145:iconst_1        
	//   78  146:aload           4
	//   79  148:aastore         
	//   80  149:invokevirtual   #206 <Method void AnimatorSet.playSequentially(Animator[])>
			list.add(obj);
	//   81  152:aload_3         
	//   82  153:aload           6
	//   83  155:invokeinterface #165 <Method boolean List.add(Object)>
	//   84  160:pop             
		}
	//   85  161:return          
	}

	static void a(BottomAppBar bottomappbar, FloatingActionButton floatingactionbutton)
	{
		bottomappbar.a(floatingactionbutton);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #210 <Method void a(FloatingActionButton)>
	//    3    5:return          
	}

	static void a(BottomAppBar bottomappbar, ActionMenuView actionmenuview, int k, boolean flag)
	{
		bottomappbar.a(actionmenuview, k, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #213 <Method void a(ActionMenuView, int, boolean)>
	//    5    7:return          
	}

	private void a(FloatingActionButton floatingactionbutton)
	{
		b(floatingactionbutton);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #215 <Method void b(FloatingActionButton)>
		floatingactionbutton.c(((android.animation.Animator.AnimatorListener) (a)));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #217 <Field AnimatorListenerAdapter a>
	//    6   10:invokevirtual   #219 <Method void FloatingActionButton.c(android.animation.Animator$AnimatorListener)>
		floatingactionbutton.a(((android.animation.Animator.AnimatorListener) (a)));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #217 <Field AnimatorListenerAdapter a>
	//   10   18:invokevirtual   #221 <Method void FloatingActionButton.a(android.animation.Animator$AnimatorListener)>
	//   11   21:return          
	}

	private void a(ActionMenuView actionmenuview, int k, boolean flag)
	{
		boolean flag1;
		if(ac.f(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #224 <Method int ac.f(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          14
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore          5
		else
	//*   6   11:goto            17
			flag1 = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
		int j1 = 0;
	//    9   17:iconst_0        
	//   10   18:istore          7
		int i1;
		int k1;
		for(i1 = 0; j1 < getChildCount(); i1 = k1)
	//*  11   20:iconst_0        
	//*  12   21:istore          6
	//*  13   23:iload           7
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #227 <Method int getChildCount()>
	//*  16   29:icmpge          132
		{
			View view = getChildAt(j1);
	//   17   32:aload_0         
	//   18   33:iload           7
	//   19   35:invokevirtual   #231 <Method View getChildAt(int)>
	//   20   38:astore          10
			boolean flag2;
			if((view.getLayoutParams() instanceof android.support.v7.widget.Toolbar.LayoutParams) && (((android.support.v7.widget.Toolbar.LayoutParams)view.getLayoutParams()).gravity & 0x800007) == 0x800003)
	//*  21   40:aload           10
	//*  22   42:invokevirtual   #235 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  23   45:instanceof      #237 <Class android.support.v7.widget.Toolbar$LayoutParams>
	//*  24   48:ifeq            76
	//*  25   51:aload           10
	//*  26   53:invokevirtual   #235 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  27   56:checkcast       #237 <Class android.support.v7.widget.Toolbar$LayoutParams>
	//*  28   59:getfield        #240 <Field int android.support.v7.widget.Toolbar$LayoutParams.gravity>
	//*  29   62:ldc1            #241 <Int 0x800007>
	//*  30   64:iand            
	//*  31   65:ldc1            #242 <Int 0x800003>
	//*  32   67:icmpne          76
				flag2 = true;
	//   33   70:iconst_1        
	//   34   71:istore          9
			else
	//*  35   73:goto            79
				flag2 = false;
	//   36   76:iconst_0        
	//   37   77:istore          9
			k1 = i1;
	//   38   79:iload           6
	//   39   81:istore          8
			if(flag2)
	//*  40   83:iload           9
	//*  41   85:ifeq            119
			{
				if(flag1)
	//*  42   88:iload           5
	//*  43   90:ifeq            103
					k1 = view.getLeft();
	//   44   93:aload           10
	//   45   95:invokevirtual   #245 <Method int View.getLeft()>
	//   46   98:istore          8
				else
	//*  47  100:goto            110
					k1 = view.getRight();
	//   48  103:aload           10
	//   49  105:invokevirtual   #248 <Method int View.getRight()>
	//   50  108:istore          8
				k1 = Math.max(i1, k1);
	//   51  110:iload           6
	//   52  112:iload           8
	//   53  114:invokestatic    #254 <Method int Math.max(int, int)>
	//   54  117:istore          8
			}
			j1++;
	//   55  119:iload           7
	//   56  121:iconst_1        
	//   57  122:iadd            
	//   58  123:istore          7
		}

	//   59  125:iload           8
	//   60  127:istore          6
	//*  61  129:goto            23
		int l;
		if(flag1)
	//*  62  132:iload           5
	//*  63  134:ifeq            146
			l = actionmenuview.getRight();
	//   64  137:aload_1         
	//   65  138:invokevirtual   #255 <Method int ActionMenuView.getRight()>
	//   66  141:istore          5
		else
	//*  67  143:goto            152
			l = actionmenuview.getLeft();
	//   68  146:aload_1         
	//   69  147:invokevirtual   #256 <Method int ActionMenuView.getLeft()>
	//   70  150:istore          5
		float f1;
		if(k == 1 && flag)
	//*  71  152:iload_2         
	//*  72  153:iconst_1        
	//*  73  154:icmpne          172
	//*  74  157:iload_3         
	//*  75  158:ifeq            172
			f1 = i1 - l;
	//   76  161:iload           6
	//   77  163:iload           5
	//   78  165:isub            
	//   79  166:i2f             
	//   80  167:fstore          4
		else
	//*  81  169:goto            175
			f1 = 0.0F;
	//   82  172:fconst_0        
	//   83  173:fstore          4
		actionmenuview.setTranslationX(f1);
	//   84  175:aload_1         
	//   85  176:fload           4
	//   86  178:invokevirtual   #260 <Method void ActionMenuView.setTranslationX(float)>
	//   87  181:return          
	}

	private int b(int k)
	{
		int l = ac.f(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #224 <Method int ac.f(View)>
	//    2    4:istore_2        
		int i1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		boolean flag1 = true;
	//    5    7:iconst_1        
	//    6    8:istore          4
		boolean flag;
		if(l == 1)
	//*   7   10:iload_2         
	//*   8   11:iconst_1        
	//*   9   12:icmpne          20
			flag = true;
	//   10   15:iconst_1        
	//   11   16:istore_2        
		else
	//*  12   17:goto            22
			flag = false;
	//   13   20:iconst_0        
	//   14   21:istore_2        
		if(k == 1)
	//*  15   22:iload_1         
	//*  16   23:iconst_1        
	//*  17   24:icmpne          56
		{
			i1 = getMeasuredWidth() / 2;
	//   18   27:aload_0         
	//   19   28:invokevirtual   #263 <Method int getMeasuredWidth()>
	//   20   31:iconst_2        
	//   21   32:idiv            
	//   22   33:istore_3        
			int j1 = b;
	//   23   34:aload_0         
	//   24   35:getfield        #265 <Field int b>
	//   25   38:istore          5
			k = ((int) (flag1));
	//   26   40:iload           4
	//   27   42:istore_1        
			if(flag)
	//*  28   43:iload_2         
	//*  29   44:ifeq            49
				k = -1;
	//   30   47:iconst_m1       
	//   31   48:istore_1        
			i1 = (i1 - j1) * k;
	//   32   49:iload_3         
	//   33   50:iload           5
	//   34   52:isub            
	//   35   53:iload_1         
	//   36   54:imul            
	//   37   55:istore_3        
		}
		return i1;
	//   38   56:iload_3         
	//   39   57:ireturn         
	}

	static Animator b(BottomAppBar bottomappbar, Animator animator)
	{
		bottomappbar.g = animator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #168 <Field Animator g>
		return animator;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static c b(BottomAppBar bottomappbar)
	{
		return bottomappbar.c;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field c c>
	//    2    4:areturn         
	}

	private void b(int k, List list)
	{
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (a())), "translationX", new float[] {
			(float)b(k)
		});
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method FloatingActionButton a()>
	//    2    4:ldc2            #270 <String "translationX">
	//    3    7:iconst_1        
	//    4    8:newarray        float[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:invokespecial   #142 <Method int b(int)>
	//   10   17:i2f             
	//   11   18:fastore         
	//   12   19:invokestatic    #187 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   13   22:astore_3        
		objectanimator.setDuration(300L);
	//   14   23:aload_3         
	//   15   24:ldc2w           #156 <Long 300L>
	//   16   27:invokevirtual   #273 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   17   30:pop             
		list.add(((Object) (objectanimator)));
	//   18   31:aload_2         
	//   19   32:aload_3         
	//   20   33:invokeinterface #165 <Method boolean List.add(Object)>
	//   21   38:pop             
	//   22   39:return          
	}

	private void b(FloatingActionButton floatingactionbutton)
	{
		floatingactionbutton.d(((android.animation.Animator.AnimatorListener) (a)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #217 <Field AnimatorListenerAdapter a>
	//    3    5:invokevirtual   #275 <Method void FloatingActionButton.d(android.animation.Animator$AnimatorListener)>
		floatingactionbutton.b(((android.animation.Animator.AnimatorListener) (a)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #217 <Field AnimatorListenerAdapter a>
	//    7   13:invokevirtual   #277 <Method void FloatingActionButton.b(android.animation.Animator$AnimatorListener)>
	//    8   16:return          
	}

	private boolean b()
	{
		FloatingActionButton floatingactionbutton = a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method FloatingActionButton a()>
	//    2    4:astore_1        
		return floatingactionbutton != null && floatingactionbutton.b();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #278 <Method boolean FloatingActionButton.b()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	static FloatingActionButton c(BottomAppBar bottomappbar)
	{
		return bottomappbar.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method FloatingActionButton a()>
	//    2    4:areturn         
	}

	private void c()
	{
		Animator animator = e;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field Animator e>
	//    2    4:astore_1        
		if(animator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			animator.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #106 <Method void Animator.cancel()>
		animator = g;
	//    7   13:aload_0         
	//    8   14:getfield        #168 <Field Animator g>
	//    9   17:astore_1        
		if(animator != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          26
			animator.cancel();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #106 <Method void Animator.cancel()>
		animator = f;
	//   14   26:aload_0         
	//   15   27:getfield        #62  <Field Animator f>
	//   16   30:astore_1        
		if(animator != null)
	//*  17   31:aload_1         
	//*  18   32:ifnull          39
			animator.cancel();
	//   19   35:aload_1         
	//   20   36:invokevirtual   #106 <Method void Animator.cancel()>
	//   21   39:return          
	}

	private boolean d()
	{
label0:
		{
			Animator animator = e;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field Animator e>
	//    2    4:astore_1        
			if(animator == null || !animator.isRunning())
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #284 <Method boolean Animator.isRunning()>
	//*   7   13:ifne            48
			{
				Animator animator1 = g;
	//    8   16:aload_0         
	//    9   17:getfield        #168 <Field Animator g>
	//   10   20:astore_1        
				if(animator1 == null || !animator1.isRunning())
	//*  11   21:aload_1         
	//*  12   22:ifnull          32
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #284 <Method boolean Animator.isRunning()>
	//*  15   29:ifne            48
				{
					Animator animator2 = f;
	//   16   32:aload_0         
	//   17   33:getfield        #62  <Field Animator f>
	//   18   36:astore_1        
					if(animator2 == null || !animator2.isRunning())
						break label0;
	//   19   37:aload_1         
	//   20   38:ifnull          50
	//   21   41:aload_1         
	//   22   42:invokevirtual   #284 <Method boolean Animator.isRunning()>
	//   23   45:ifeq            50
				}
			}
			return true;
	//   24   48:iconst_1        
	//   25   49:ireturn         
		}
		return false;
	//   26   50:iconst_0        
	//   27   51:ireturn         
	}

	static boolean d(BottomAppBar bottomappbar)
	{
		return bottomappbar.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #287 <Method boolean d()>
	//    2    4:ireturn         
	}

	private void e()
	{
		d.a(getFabTranslationX());
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field f d>
	//    2    4:aload_0         
	//    3    5:invokespecial   #290 <Method float getFabTranslationX()>
	//    4    8:invokevirtual   #292 <Method void android.support.design.bottomappbar.f.a(float)>
		Object obj = ((Object) (a()));
	//    5   11:aload_0         
	//    6   12:invokespecial   #26  <Method FloatingActionButton a()>
	//    7   15:astore_2        
		c c1 = c;
	//    8   16:aload_0         
	//    9   17:getfield        #268 <Field c c>
	//   10   20:astore_3        
		float f1;
		if(j && b())
	//*  11   21:aload_0         
	//*  12   22:getfield        #135 <Field boolean j>
	//*  13   25:ifeq            40
	//*  14   28:aload_0         
	//*  15   29:invokespecial   #170 <Method boolean b()>
	//*  16   32:ifeq            40
			f1 = 1.0F;
	//   17   35:fconst_1        
	//   18   36:fstore_1        
		else
	//*  19   37:goto            42
			f1 = 0.0F;
	//   20   40:fconst_0        
	//   21   41:fstore_1        
		c1.a(f1);
	//   22   42:aload_3         
	//   23   43:fload_1         
	//   24   44:invokevirtual   #295 <Method void c.a(float)>
		if(obj != null)
	//*  25   47:aload_2         
	//*  26   48:ifnull          67
		{
			((FloatingActionButton) (obj)).setTranslationY(getFabTranslationY());
	//   27   51:aload_2         
	//   28   52:aload_0         
	//   29   53:invokespecial   #298 <Method float getFabTranslationY()>
	//   30   56:invokevirtual   #301 <Method void FloatingActionButton.setTranslationY(float)>
			((FloatingActionButton) (obj)).setTranslationX(getFabTranslationX());
	//   31   59:aload_2         
	//   32   60:aload_0         
	//   33   61:invokespecial   #290 <Method float getFabTranslationX()>
	//   34   64:invokevirtual   #302 <Method void FloatingActionButton.setTranslationX(float)>
		}
		obj = ((Object) (getActionMenuView()));
	//   35   67:aload_0         
	//   36   68:invokespecial   #180 <Method ActionMenuView getActionMenuView()>
	//   37   71:astore_2        
		if(obj != null)
	//*  38   72:aload_2         
	//*  39   73:ifnull          109
		{
			((ActionMenuView) (obj)).setAlpha(1.0F);
	//   40   76:aload_2         
	//   41   77:fconst_1        
	//   42   78:invokevirtual   #305 <Method void ActionMenuView.setAlpha(float)>
			if(!b())
	//*  43   81:aload_0         
	//*  44   82:invokespecial   #170 <Method boolean b()>
	//*  45   85:ifne            96
			{
				a(((ActionMenuView) (obj)), 0, false);
	//   46   88:aload_0         
	//   47   89:aload_2         
	//   48   90:iconst_0        
	//   49   91:iconst_0        
	//   50   92:invokespecial   #213 <Method void a(ActionMenuView, int, boolean)>
				return;
	//   51   95:return          
			}
			a(((ActionMenuView) (obj)), h, j);
	//   52   96:aload_0         
	//   53   97:aload_2         
	//   54   98:aload_0         
	//   55   99:getfield        #95  <Field int h>
	//   56  102:aload_0         
	//   57  103:getfield        #135 <Field boolean j>
	//   58  106:invokespecial   #213 <Method void a(ActionMenuView, int, boolean)>
		}
	//   59  109:return          
	}

	static void e(BottomAppBar bottomappbar)
	{
		bottomappbar.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #307 <Method void e()>
	//    2    4:return          
	}

	static float f(BottomAppBar bottomappbar)
	{
		return bottomappbar.getFabTranslationY();
	//    0    0:aload_0         
	//    1    1:invokespecial   #298 <Method float getFabTranslationY()>
	//    2    4:freturn         
	}

	private ActionMenuView getActionMenuView()
	{
		for(int k = 0; k < getChildCount(); k++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #227 <Method int getChildCount()>
	//*   5    7:icmpge          35
		{
			View view = getChildAt(k);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #231 <Method View getChildAt(int)>
	//    9   15:astore_2        
			if(view instanceof ActionMenuView)
	//*  10   16:aload_2         
	//*  11   17:instanceof      #189 <Class ActionMenuView>
	//*  12   20:ifeq            28
				return (ActionMenuView)view;
	//   13   23:aload_2         
	//   14   24:checkcast       #189 <Class ActionMenuView>
	//   15   27:areturn         
		}

	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_1        
	//*  20   32:goto            2
		return null;
	//   21   35:aconst_null     
	//   22   36:areturn         
	}

	private float getFabTranslationX()
	{
		return (float)b(h);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field int h>
	//    3    5:invokespecial   #142 <Method int b(int)>
	//    4    8:i2f             
	//    5    9:freturn         
	}

	private float getFabTranslationY()
	{
		return a(j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #135 <Field boolean j>
	//    3    5:invokespecial   #310 <Method float a(boolean)>
	//    4    8:freturn         
	}

	public ColorStateList getBackgroundTint()
	{
		return c.a();
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field c c>
	//    2    4:invokevirtual   #314 <Method ColorStateList c.a()>
	//    3    7:areturn         
	}

	public aj getBehavior()
	{
		return ((aj) (new Behavior()));
	//    0    0:new             #318 <Class BottomAppBar$Behavior>
	//    1    3:dup             
	//    2    4:invokespecial   #319 <Method void BottomAppBar$Behavior()>
	//    3    7:areturn         
	}

	public float getCradleVerticalOffset()
	{
		return d.b();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field f d>
	//    2    4:invokevirtual   #321 <Method float f.b()>
	//    3    7:freturn         
	}

	public int getFabAlignmentMode()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int h>
	//    2    4:ireturn         
	}

	public float getFabCradleMargin()
	{
		return d.d();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field f d>
	//    2    4:invokevirtual   #325 <Method float f.d()>
	//    3    7:freturn         
	}

	public float getFabCradleRoundedCornerRadius()
	{
		return d.e();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field f d>
	//    2    4:invokevirtual   #328 <Method float f.e()>
	//    3    7:freturn         
	}

	public boolean getHideOnScroll()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field boolean i>
	//    2    4:ireturn         
	}

	protected void onLayout(boolean flag, int k, int l, int i1, int j1)
	{
		super.onLayout(flag, k, l, i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #335 <Method void Toolbar.onLayout(boolean, int, int, int, int)>
		c();
	//    7   11:aload_0         
	//    8   12:invokespecial   #337 <Method void c()>
		e();
	//    9   15:aload_0         
	//   10   16:invokespecial   #307 <Method void e()>
	//   11   19:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #341 <Class BottomAppBar$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #343 <Method void Toolbar.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #341 <Class BottomAppBar$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #347 <Method Parcelable BottomAppBar$SavedState.getSuperState()>
	//   13   23:invokespecial   #343 <Method void Toolbar.onRestoreInstanceState(Parcelable)>
			h = ((SavedState) (parcelable)).a;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #349 <Field int android.support.design.bottomappbar.BottomAppBar$SavedState.a>
	//   17   31:putfield        #95  <Field int h>
			j = ((SavedState) (parcelable)).b;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #351 <Field boolean BottomAppBar$SavedState.b>
	//   21   39:putfield        #135 <Field boolean j>
			return;
	//   22   42:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #341 <Class BottomAppBar$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #354 <Method Parcelable Toolbar.onSaveInstanceState()>
	//    4    8:invokespecial   #356 <Method void BottomAppBar$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = h;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #95  <Field int h>
	//    9   17:putfield        #349 <Field int android.support.design.bottomappbar.BottomAppBar$SavedState.a>
		savedstate.b = j;
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #135 <Field boolean j>
	//   13   25:putfield        #351 <Field boolean BottomAppBar$SavedState.b>
		return ((Parcelable) (savedstate));
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public void setBackgroundTint(ColorStateList colorstatelist)
	{
		android.support.v4.graphics.drawable.a.a(((android.graphics.drawable.Drawable) (c)), colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field c c>
	//    2    4:aload_1         
	//    3    5:invokestatic    #363 <Method void a.a(android.graphics.drawable.Drawable, ColorStateList)>
	//    4    8:return          
	}

	public void setCradleVerticalOffset(float f1)
	{
		if(f1 != getCradleVerticalOffset())
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #54  <Method float getCradleVerticalOffset()>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            24
		{
			d.b(f1);
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field f d>
	//    7   13:fload_1         
	//    8   14:invokevirtual   #366 <Method void f.b(float)>
			c.invalidateSelf();
	//    9   17:aload_0         
	//   10   18:getfield        #268 <Field c c>
	//   11   21:invokevirtual   #369 <Method void c.invalidateSelf()>
		}
	//   12   24:return          
	}

	public void setFabAlignmentMode(int k)
	{
		a(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #372 <Method void a(int)>
		a(k, j);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #135 <Field boolean j>
	//    7   11:invokespecial   #374 <Method void a(int, boolean)>
		h = k;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #95  <Field int h>
	//   11   19:return          
	}

	public void setFabCradleMargin(float f1)
	{
		if(f1 != getFabCradleMargin())
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #377 <Method float getFabCradleMargin()>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            24
		{
			d.d(f1);
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field f d>
	//    7   13:fload_1         
	//    8   14:invokevirtual   #379 <Method void f.d(float)>
			c.invalidateSelf();
	//    9   17:aload_0         
	//   10   18:getfield        #268 <Field c c>
	//   11   21:invokevirtual   #369 <Method void c.invalidateSelf()>
		}
	//   12   24:return          
	}

	public void setFabCradleRoundedCornerRadius(float f1)
	{
		if(f1 != getFabCradleRoundedCornerRadius())
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #382 <Method float getFabCradleRoundedCornerRadius()>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            24
		{
			d.e(f1);
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field f d>
	//    7   13:fload_1         
	//    8   14:invokevirtual   #384 <Method void f.e(float)>
			c.invalidateSelf();
	//    9   17:aload_0         
	//   10   18:getfield        #268 <Field c c>
	//   11   21:invokevirtual   #369 <Method void c.invalidateSelf()>
		}
	//   12   24:return          
	}

	void setFabDiameter(int k)
	{
		float f1 = k;
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:fstore_2        
		if(f1 != d.c())
	//*   3    3:fload_2         
	//*   4    4:aload_0         
	//*   5    5:getfield        #65  <Field f d>
	//*   6    8:invokevirtual   #387 <Method float android.support.design.bottomappbar.f.c()>
	//*   7   11:fcmpl           
	//*   8   12:ifeq            30
		{
			d.c(f1);
	//    9   15:aload_0         
	//   10   16:getfield        #65  <Field f d>
	//   11   19:fload_2         
	//   12   20:invokevirtual   #389 <Method void android.support.design.bottomappbar.f.c(float)>
			c.invalidateSelf();
	//   13   23:aload_0         
	//   14   24:getfield        #268 <Field c c>
	//   15   27:invokevirtual   #369 <Method void c.invalidateSelf()>
		}
	//   16   30:return          
	}

	public void setHideOnScroll(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #331 <Field boolean i>
	//    3    5:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setTitle(CharSequence charsequence)
	{
	//    0    0:return          
	}

	AnimatorListenerAdapter a;
	private final int b;
	private final c c;
	private final f d;
	private Animator e;
	private Animator f;
	private Animator g;
	private int h;
	private boolean i;
	private boolean j;

	private class Behavior extends HideBottomViewOnScrollBehavior
	{

		private boolean a(FloatingActionButton floatingactionbutton, BottomAppBar bottomappbar)
		{
			((am)floatingactionbutton.getLayoutParams()).d = 17;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #26  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
		//    2    4:checkcast       #28  <Class am>
		//    3    7:bipush          17
		//    4    9:putfield        #32  <Field int am.d>
			android.support.design.bottomappbar.BottomAppBar.a(bottomappbar, floatingactionbutton);
		//    5   12:aload_2         
		//    6   13:aload_1         
		//    7   14:invokestatic    #37  <Method void android.support.design.bottomappbar.BottomAppBar.a(BottomAppBar, FloatingActionButton)>
			return true;
		//    8   17:iconst_1        
		//    9   18:ireturn         
		}

		protected void a(BottomAppBar bottomappbar)
		{
			super.a(((View) (bottomappbar)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void HideBottomViewOnScrollBehavior.a(View)>
			FloatingActionButton floatingactionbutton = android.support.design.bottomappbar.BottomAppBar.c(bottomappbar);
		//    3    5:aload_1         
		//    4    6:invokestatic    #45  <Method FloatingActionButton android.support.design.bottomappbar.BottomAppBar.c(BottomAppBar)>
		//    5    9:astore_2        
			if(floatingactionbutton != null)
		//*   6   10:aload_2         
		//*   7   11:ifnull          42
			{
				floatingactionbutton.clearAnimation();
		//    8   14:aload_2         
		//    9   15:invokevirtual   #48  <Method void FloatingActionButton.clearAnimation()>
				floatingactionbutton.animate().translationY(BottomAppBar.f(bottomappbar)).setInterpolator(android.support.design.a.a.d).setDuration(225L);
		//   10   18:aload_2         
		//   11   19:invokevirtual   #52  <Method ViewPropertyAnimator FloatingActionButton.animate()>
		//   12   22:aload_1         
		//   13   23:invokestatic    #56  <Method float BottomAppBar.f(BottomAppBar)>
		//   14   26:invokevirtual   #62  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
		//   15   29:getstatic       #67  <Field android.animation.TimeInterpolator android.support.design.a.a.d>
		//   16   32:invokevirtual   #71  <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
		//   17   35:ldc2w           #72  <Long 225L>
		//   18   38:invokevirtual   #77  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
		//   19   41:pop             
			}
		//   20   42:return          
		}

		protected volatile void a(View view)
		{
			a((BottomAppBar)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #34  <Class BottomAppBar>
		//    3    5:invokevirtual   #79  <Method void a(BottomAppBar)>
		//    4    8:return          
		}

		public boolean a(CoordinatorLayout coordinatorlayout, BottomAppBar bottomappbar, int k)
		{
			FloatingActionButton floatingactionbutton = android.support.design.bottomappbar.BottomAppBar.c(bottomappbar);
		//    0    0:aload_2         
		//    1    1:invokestatic    #45  <Method FloatingActionButton android.support.design.bottomappbar.BottomAppBar.c(BottomAppBar)>
		//    2    4:astore          4
			if(floatingactionbutton != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          39
			{
				a(floatingactionbutton, bottomappbar);
		//    5   11:aload_0         
		//    6   12:aload           4
		//    7   14:aload_2         
		//    8   15:invokespecial   #82  <Method boolean a(FloatingActionButton, BottomAppBar)>
		//    9   18:pop             
				floatingactionbutton.b(a);
		//   10   19:aload           4
		//   11   21:aload_0         
		//   12   22:getfield        #15  <Field Rect a>
		//   13   25:invokevirtual   #86  <Method void FloatingActionButton.b(Rect)>
				bottomappbar.setFabDiameter(a.height());
		//   14   28:aload_2         
		//   15   29:aload_0         
		//   16   30:getfield        #15  <Field Rect a>
		//   17   33:invokevirtual   #90  <Method int Rect.height()>
		//   18   36:invokevirtual   #94  <Method void BottomAppBar.setFabDiameter(int)>
			}
			if(!BottomAppBar.d(bottomappbar))
		//*  19   39:aload_2         
		//*  20   40:invokestatic    #97  <Method boolean BottomAppBar.d(BottomAppBar)>
		//*  21   43:ifne            50
				BottomAppBar.e(bottomappbar);
		//   22   46:aload_2         
		//   23   47:invokestatic    #100 <Method void BottomAppBar.e(BottomAppBar)>
			coordinatorlayout.a(((View) (bottomappbar)), k);
		//   24   50:aload_1         
		//   25   51:aload_2         
		//   26   52:iload_3         
		//   27   53:invokevirtual   #105 <Method void CoordinatorLayout.a(View, int)>
			return super.a(coordinatorlayout, ((View) (bottomappbar)), k);
		//   28   56:aload_0         
		//   29   57:aload_1         
		//   30   58:aload_2         
		//   31   59:iload_3         
		//   32   60:invokespecial   #108 <Method boolean HideBottomViewOnScrollBehavior.a(CoordinatorLayout, View, int)>
		//   33   63:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, BottomAppBar bottomappbar, View view, View view1, int k, int l)
		{
			return bottomappbar.getHideOnScroll() && super.a(coordinatorlayout, ((View) (bottomappbar)), view, view1, k, l);
		//    0    0:aload_2         
		//    1    1:invokevirtual   #113 <Method boolean BottomAppBar.getHideOnScroll()>
		//    2    4:ifeq            25
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:aload_3         
		//    7   11:aload           4
		//    8   13:iload           5
		//    9   15:iload           6
		//   10   17:invokespecial   #116 <Method boolean HideBottomViewOnScrollBehavior.a(CoordinatorLayout, View, View, View, int, int)>
		//   11   20:ifeq            25
		//   12   23:iconst_1        
		//   13   24:ireturn         
		//   14   25:iconst_0        
		//   15   26:ireturn         
		}

		public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int k)
		{
			return a(coordinatorlayout, (BottomAppBar)view, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #34  <Class BottomAppBar>
		//    4    6:iload_3         
		//    5    7:invokevirtual   #118 <Method boolean a(CoordinatorLayout, BottomAppBar, int)>
		//    6   10:ireturn         
		}

		public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int k, int l)
		{
			return a(coordinatorlayout, (BottomAppBar)view, view1, view2, k, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #34  <Class BottomAppBar>
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:iload           5
		//    7   11:iload           6
		//    8   13:invokevirtual   #120 <Method boolean a(CoordinatorLayout, BottomAppBar, View, View, int, int)>
		//    9   16:ireturn         
		}

		protected void b(BottomAppBar bottomappbar)
		{
			super.b(((View) (bottomappbar)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #122 <Method void HideBottomViewOnScrollBehavior.b(View)>
			bottomappbar = ((BottomAppBar) (android.support.design.bottomappbar.BottomAppBar.c(bottomappbar)));
		//    3    5:aload_1         
		//    4    6:invokestatic    #45  <Method FloatingActionButton android.support.design.bottomappbar.BottomAppBar.c(BottomAppBar)>
		//    5    9:astore_1        
			if(bottomappbar != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          69
			{
				((FloatingActionButton) (bottomappbar)).a(a);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #15  <Field Rect a>
		//   11   19:invokevirtual   #125 <Method boolean FloatingActionButton.a(Rect)>
		//   12   22:pop             
				float f1 = ((FloatingActionButton) (bottomappbar)).getMeasuredHeight() - a.height();
		//   13   23:aload_1         
		//   14   24:invokevirtual   #128 <Method int FloatingActionButton.getMeasuredHeight()>
		//   15   27:aload_0         
		//   16   28:getfield        #15  <Field Rect a>
		//   17   31:invokevirtual   #90  <Method int Rect.height()>
		//   18   34:isub            
		//   19   35:i2f             
		//   20   36:fstore_2        
				((FloatingActionButton) (bottomappbar)).clearAnimation();
		//   21   37:aload_1         
		//   22   38:invokevirtual   #48  <Method void FloatingActionButton.clearAnimation()>
				((FloatingActionButton) (bottomappbar)).animate().translationY((float)(-((FloatingActionButton) (bottomappbar)).getPaddingBottom()) + f1).setInterpolator(android.support.design.a.a.c).setDuration(175L);
		//   23   41:aload_1         
		//   24   42:invokevirtual   #52  <Method ViewPropertyAnimator FloatingActionButton.animate()>
		//   25   45:aload_1         
		//   26   46:invokevirtual   #131 <Method int FloatingActionButton.getPaddingBottom()>
		//   27   49:ineg            
		//   28   50:i2f             
		//   29   51:fload_2         
		//   30   52:fadd            
		//   31   53:invokevirtual   #62  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
		//   32   56:getstatic       #133 <Field android.animation.TimeInterpolator android.support.design.a.a.c>
		//   33   59:invokevirtual   #71  <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
		//   34   62:ldc2w           #134 <Long 175L>
		//   35   65:invokevirtual   #77  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
		//   36   68:pop             
			}
		//   37   69:return          
		}

		protected volatile void b(View view)
		{
			b((BottomAppBar)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #34  <Class BottomAppBar>
		//    3    5:invokevirtual   #137 <Method void b(BottomAppBar)>
		//    4    8:return          
		}

		private final Rect a;

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #10  <Method void HideBottomViewOnScrollBehavior()>
			a = new Rect();
		//    2    4:aload_0         
		//    3    5:new             #12  <Class Rect>
		//    4    8:dup             
		//    5    9:invokespecial   #13  <Method void Rect()>
		//    6   12:putfield        #15  <Field Rect a>
		//    7   15:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void HideBottomViewOnScrollBehavior(Context, AttributeSet)>
			a = new Rect();
		//    4    6:aload_0         
		//    5    7:new             #12  <Class Rect>
		//    6   10:dup             
		//    7   11:invokespecial   #13  <Method void Rect()>
		//    8   14:putfield        #15  <Field Rect a>
		//    9   17:return          
		}
	}


	private class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int k)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #40  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #42  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #47  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new e();
		int a;
		boolean b;

		static 
		{
		//    0    0:new             #14  <Class e>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void e()>
		//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #29  <Method int Parcel.readInt()>
		//    7   11:putfield        #31  <Field int a>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #29  <Method int Parcel.readInt()>
		//*  10   18:ifeq            26
				flag = true;
		//   11   21:iconst_1        
		//   12   22:istore_3        
			else
		//*  13   23:goto            28
				flag = false;
		//   14   26:iconst_0        
		//   15   27:istore_3        
			b = flag;
		//   16   28:aload_0         
		//   17   29:iload_3         
		//   18   30:putfield        #33  <Field boolean b>
		//   19   33:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

}
