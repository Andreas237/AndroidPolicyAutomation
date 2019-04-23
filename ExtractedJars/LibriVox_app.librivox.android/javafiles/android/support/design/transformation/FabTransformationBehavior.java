// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.design.a.a;
import android.support.design.a.b;
import android.support.design.a.c;
import android.support.design.a.e;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.design.a.j;
import android.support.design.c.d;
import android.support.design.c.f;
import android.support.design.c.k;
import android.support.design.g;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.am;
import android.support.design.widget.bn;
import android.support.v4.view.ac;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.transformation:
//			ExpandableTransformationBehavior, g, j, i, 
//			f, d, e, c

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior
{

	public FabTransformationBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ExpandableTransformationBehavior()>
		a = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void Rect()>
	//    6   12:putfield        #20  <Field Rect a>
		b = new RectF();
	//    7   15:aload_0         
	//    8   16:new             #22  <Class RectF>
	//    9   19:dup             
	//   10   20:invokespecial   #23  <Method void RectF()>
	//   11   23:putfield        #25  <Field RectF b>
		c = new RectF();
	//   12   26:aload_0         
	//   13   27:new             #22  <Class RectF>
	//   14   30:dup             
	//   15   31:invokespecial   #23  <Method void RectF()>
	//   16   34:putfield        #27  <Field RectF c>
		d = new int[2];
	//   17   37:aload_0         
	//   18   38:iconst_2        
	//   19   39:newarray        int[]
	//   20   41:putfield        #29  <Field int[] d>
	//   21   44:return          
	}

	public FabTransformationBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void ExpandableTransformationBehavior(Context, AttributeSet)>
		a = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #17  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #18  <Method void Rect()>
	//    8   14:putfield        #20  <Field Rect a>
		b = new RectF();
	//    9   17:aload_0         
	//   10   18:new             #22  <Class RectF>
	//   11   21:dup             
	//   12   22:invokespecial   #23  <Method void RectF()>
	//   13   25:putfield        #25  <Field RectF b>
		c = new RectF();
	//   14   28:aload_0         
	//   15   29:new             #22  <Class RectF>
	//   16   32:dup             
	//   17   33:invokespecial   #23  <Method void RectF()>
	//   18   36:putfield        #27  <Field RectF c>
		d = new int[2];
	//   19   39:aload_0         
	//   20   40:iconst_2        
	//   21   41:newarray        int[]
	//   22   43:putfield        #29  <Field int[] d>
	//   23   46:return          
	}

	private float a(android.support.design.transformation.g g1, i l, float f1, float f2)
	{
		long l1 = l.a();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #39  <Method long i.a()>
	//    2    4:lstore          6
		long l2 = l.b();
	//    3    6:aload_2         
	//    4    7:invokevirtual   #41  <Method long i.b()>
	//    5   10:lstore          8
		g1 = ((android.support.design.transformation.g) (g1.a.b("expansion")));
	//    6   12:aload_1         
	//    7   13:getfield        #46  <Field h android.support.design.transformation.g.a>
	//    8   16:ldc1            #48  <String "expansion">
	//    9   18:invokevirtual   #53  <Method i h.b(String)>
	//   10   21:astore_1        
		float f3 = (float)((((i) (g1)).a() + ((i) (g1)).b() + 17L) - l1) / (float)l2;
	//   11   22:aload_1         
	//   12   23:invokevirtual   #39  <Method long i.a()>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #41  <Method long i.b()>
	//   15   30:ladd            
	//   16   31:ldc2w           #54  <Long 17L>
	//   17   34:ladd            
	//   18   35:lload           6
	//   19   37:lsub            
	//   20   38:l2f             
	//   21   39:lload           8
	//   22   41:l2f             
	//   23   42:fdiv            
	//   24   43:fstore          5
		return android.support.design.a.a.a(f1, f2, l.c().getInterpolation(f3));
	//   25   45:fload_3         
	//   26   46:fload           4
	//   27   48:aload_2         
	//   28   49:invokevirtual   #58  <Method TimeInterpolator i.c()>
	//   29   52:fload           5
	//   30   54:invokeinterface #64  <Method float TimeInterpolator.getInterpolation(float)>
	//   31   59:invokestatic    #69  <Method float a.a(float, float, float)>
	//   32   62:freturn         
	}

	private float a(View view, View view1, j j1)
	{
		RectF rectf = b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RectF b>
	//    2    4:astore          6
		RectF rectf1 = c;
	//    3    6:aload_0         
	//    4    7:getfield        #27  <Field RectF c>
	//    5   10:astore          7
		a(view, rectf);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           6
	//    9   16:invokespecial   #73  <Method void a(View, RectF)>
		a(view1, rectf1);
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:aload           7
	//   13   23:invokespecial   #73  <Method void a(View, RectF)>
		int l = j1.a & 7;
	//   14   26:aload_3         
	//   15   27:getfield        #78  <Field int j.a>
	//   16   30:bipush          7
	//   17   32:iand            
	//   18   33:istore          5
		float f1;
		if(l != 1)
	//*  19   35:iload           5
	//*  20   37:iconst_1        
	//*  21   38:icmpeq          91
		{
			if(l != 3)
	//*  22   41:iload           5
	//*  23   43:iconst_3        
	//*  24   44:icmpeq          75
			{
				if(l != 5)
	//*  25   47:iload           5
	//*  26   49:iconst_5        
	//*  27   50:icmpeq          59
					f1 = 0.0F;
	//   28   53:fconst_0        
	//   29   54:fstore          4
				else
	//*  30   56:goto            104
					f1 = rectf1.right - rectf.right;
	//   31   59:aload           7
	//   32   61:getfield        #82  <Field float RectF.right>
	//   33   64:aload           6
	//   34   66:getfield        #82  <Field float RectF.right>
	//   35   69:fsub            
	//   36   70:fstore          4
			} else
	//*  37   72:goto            104
			{
				f1 = rectf1.left - rectf.left;
	//   38   75:aload           7
	//   39   77:getfield        #85  <Field float RectF.left>
	//   40   80:aload           6
	//   41   82:getfield        #85  <Field float RectF.left>
	//   42   85:fsub            
	//   43   86:fstore          4
			}
		} else
	//*  44   88:goto            104
		{
			f1 = rectf1.centerX() - rectf.centerX();
	//   45   91:aload           7
	//   46   93:invokevirtual   #89  <Method float RectF.centerX()>
	//   47   96:aload           6
	//   48   98:invokevirtual   #89  <Method float RectF.centerX()>
	//   49  101:fsub            
	//   50  102:fstore          4
		}
		return f1 + j1.b;
	//   51  104:fload           4
	//   52  106:aload_3         
	//   53  107:getfield        #91  <Field float j.b>
	//   54  110:fadd            
	//   55  111:freturn         
	}

	private ViewGroup a(View view)
	{
		View view1 = view.findViewById(g.mtrl_child_content_container);
	//    0    0:aload_1         
	//    1    1:getstatic       #97  <Field int g.mtrl_child_content_container>
	//    2    4:invokevirtual   #103 <Method View View.findViewById(int)>
	//    3    7:astore_2        
		if(view1 != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          18
			return b(view1);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokespecial   #105 <Method ViewGroup b(View)>
	//    9   17:areturn         
		if(!(view instanceof android.support.design.transformation.j) && !(view instanceof android.support.design.transformation.i))
	//*  10   18:aload_1         
	//*  11   19:instanceof      #107 <Class android.support.design.transformation.j>
	//*  12   22:ifne            41
	//*  13   25:aload_1         
	//*  14   26:instanceof      #109 <Class android.support.design.transformation.i>
	//*  15   29:ifeq            35
	//*  16   32:goto            41
			return b(view);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #105 <Method ViewGroup b(View)>
	//   20   40:areturn         
		else
			return b(((ViewGroup)view).getChildAt(0));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:checkcast       #111 <Class ViewGroup>
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #114 <Method View ViewGroup.getChildAt(int)>
	//   26   50:invokespecial   #105 <Method ViewGroup b(View)>
	//   27   53:areturn         
	}

	private void a(View view, long l, int i1, int j1, float f1, List list)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && l > 0L)
	//*   0    0:getstatic       #120 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          47
	//*   3    8:lload_2         
	//*   4    9:lconst_0        
	//*   5   10:lcmp            
	//*   6   11:ifle            47
		{
			view = ((View) (ViewAnimationUtils.createCircularReveal(view, i1, j1, f1, f1)));
	//    7   14:aload_1         
	//    8   15:iload           4
	//    9   17:iload           5
	//   10   19:fload           6
	//   11   21:fload           6
	//   12   23:invokestatic    #126 <Method Animator ViewAnimationUtils.createCircularReveal(View, int, int, float, float)>
	//   13   26:astore_1        
			((Animator) (view)).setStartDelay(0L);
	//   14   27:aload_1         
	//   15   28:lconst_0        
	//   16   29:invokevirtual   #132 <Method void Animator.setStartDelay(long)>
			((Animator) (view)).setDuration(l);
	//   17   32:aload_1         
	//   18   33:lload_2         
	//   19   34:invokevirtual   #136 <Method Animator Animator.setDuration(long)>
	//   20   37:pop             
			list.add(((Object) (view)));
	//   21   38:aload           7
	//   22   40:aload_1         
	//   23   41:invokeinterface #142 <Method boolean List.add(Object)>
	//   24   46:pop             
		}
	//   25   47:return          
	}

	private void a(View view, long l, long l1, long l2, 
			int i1, int j1, float f1, List list)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #120 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          56
		{
			l += l1;
	//    3    8:lload_2         
	//    4    9:lload           4
	//    5   11:ladd            
	//    6   12:lstore_2        
			if(l < l2)
	//*   7   13:lload_2         
	//*   8   14:lload           6
	//*   9   16:lcmp            
	//*  10   17:ifge            56
			{
				view = ((View) (ViewAnimationUtils.createCircularReveal(view, i1, j1, f1, f1)));
	//   11   20:aload_1         
	//   12   21:iload           8
	//   13   23:iload           9
	//   14   25:fload           10
	//   15   27:fload           10
	//   16   29:invokestatic    #126 <Method Animator ViewAnimationUtils.createCircularReveal(View, int, int, float, float)>
	//   17   32:astore_1        
				((Animator) (view)).setStartDelay(l);
	//   18   33:aload_1         
	//   19   34:lload_2         
	//   20   35:invokevirtual   #132 <Method void Animator.setStartDelay(long)>
				((Animator) (view)).setDuration(l2 - l);
	//   21   38:aload_1         
	//   22   39:lload           6
	//   23   41:lload_2         
	//   24   42:lsub            
	//   25   43:invokevirtual   #136 <Method Animator Animator.setDuration(long)>
	//   26   46:pop             
				list.add(((Object) (view)));
	//   27   47:aload           11
	//   28   49:aload_1         
	//   29   50:invokeinterface #142 <Method boolean List.add(Object)>
	//   30   55:pop             
			}
		}
	//   31   56:return          
	}

	private void a(View view, RectF rectf)
	{
		rectf.set(0.0F, 0.0F, view.getWidth(), view.getHeight());
	//    0    0:aload_2         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:aload_1         
	//    4    4:invokevirtual   #147 <Method int View.getWidth()>
	//    5    7:i2f             
	//    6    8:aload_1         
	//    7    9:invokevirtual   #150 <Method int View.getHeight()>
	//    8   12:i2f             
	//    9   13:invokevirtual   #154 <Method void RectF.set(float, float, float, float)>
		int ai[] = d;
	//   10   16:aload_0         
	//   11   17:getfield        #29  <Field int[] d>
	//   12   20:astore_3        
		view.getLocationInWindow(ai);
	//   13   21:aload_1         
	//   14   22:aload_3         
	//   15   23:invokevirtual   #158 <Method void View.getLocationInWindow(int[])>
		rectf.offsetTo(ai[0], ai[1]);
	//   16   26:aload_2         
	//   17   27:aload_3         
	//   18   28:iconst_0        
	//   19   29:iaload          
	//   20   30:i2f             
	//   21   31:aload_3         
	//   22   32:iconst_1        
	//   23   33:iaload          
	//   24   34:i2f             
	//   25   35:invokevirtual   #162 <Method void RectF.offsetTo(float, float)>
		rectf.offset((int)(-view.getTranslationX()), (int)(-view.getTranslationY()));
	//   26   38:aload_2         
	//   27   39:aload_1         
	//   28   40:invokevirtual   #165 <Method float View.getTranslationX()>
	//   29   43:fneg            
	//   30   44:f2i             
	//   31   45:i2f             
	//   32   46:aload_1         
	//   33   47:invokevirtual   #168 <Method float View.getTranslationY()>
	//   34   50:fneg            
	//   35   51:f2i             
	//   36   52:i2f             
	//   37   53:invokevirtual   #171 <Method void RectF.offset(float, float)>
	//   38   56:return          
	}

	private void a(View view, android.support.design.transformation.g g1, i l, i i1, float f1, float f2, float f3, 
			float f4, RectF rectf)
	{
		f1 = a(g1, l, f1, f3);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:fload           5
	//    4    5:fload           7
	//    5    7:invokespecial   #174 <Method float a(android.support.design.transformation.g, i, float, float)>
	//    6   10:fstore          5
		f2 = a(g1, i1, f2, f4);
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:aload           4
	//   10   16:fload           6
	//   11   18:fload           8
	//   12   20:invokespecial   #174 <Method float a(android.support.design.transformation.g, i, float, float)>
	//   13   23:fstore          6
		l = ((i) (a));
	//   14   25:aload_0         
	//   15   26:getfield        #20  <Field Rect a>
	//   16   29:astore_3        
		view.getWindowVisibleDisplayFrame(((Rect) (l)));
	//   17   30:aload_1         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #178 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		g1 = ((android.support.design.transformation.g) (b));
	//   20   35:aload_0         
	//   21   36:getfield        #25  <Field RectF b>
	//   22   39:astore_2        
		((RectF) (g1)).set(((Rect) (l)));
	//   23   40:aload_2         
	//   24   41:aload_3         
	//   25   42:invokevirtual   #180 <Method void RectF.set(Rect)>
		l = ((i) (c));
	//   26   45:aload_0         
	//   27   46:getfield        #27  <Field RectF c>
	//   28   49:astore_3        
		a(view, ((RectF) (l)));
	//   29   50:aload_0         
	//   30   51:aload_1         
	//   31   52:aload_3         
	//   32   53:invokespecial   #73  <Method void a(View, RectF)>
		((RectF) (l)).offset(f1, f2);
	//   33   56:aload_3         
	//   34   57:fload           5
	//   35   59:fload           6
	//   36   61:invokevirtual   #171 <Method void RectF.offset(float, float)>
		((RectF) (l)).intersect(((RectF) (g1)));
	//   37   64:aload_3         
	//   38   65:aload_2         
	//   39   66:invokevirtual   #184 <Method boolean RectF.intersect(RectF)>
	//   40   69:pop             
		rectf.set(((RectF) (l)));
	//   41   70:aload           9
	//   42   72:aload_3         
	//   43   73:invokevirtual   #187 <Method void RectF.set(RectF)>
	//   44   76:return          
	}

	private void a(View view, View view1, boolean flag, boolean flag1, android.support.design.transformation.g g1, float f1, float f2, 
			List list, List list1)
	{
		if(!(view1 instanceof f))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #190 <Class f>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		f f6 = (f)view1;
	//    4    8:aload_2         
	//    5    9:checkcast       #190 <Class f>
	//    6   12:astore          17
		float f4 = c(view, view1, g1.b);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload           5
	//   11   19:getfield        #193 <Field j android.support.design.transformation.g.b>
	//   12   22:invokespecial   #195 <Method float c(View, View, j)>
	//   13   25:fstore          11
		float f5 = d(view, view1, g1.b);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:aload           5
	//   18   32:getfield        #193 <Field j android.support.design.transformation.g.b>
	//   19   35:invokespecial   #197 <Method float d(View, View, j)>
	//   20   38:fstore          12
		((FloatingActionButton)view).a(a);
	//   21   40:aload_1         
	//   22   41:checkcast       #199 <Class FloatingActionButton>
	//   23   44:aload_0         
	//   24   45:getfield        #20  <Field Rect a>
	//   25   48:invokevirtual   #202 <Method boolean FloatingActionButton.a(Rect)>
	//   26   51:pop             
		float f3 = (float)a.width() / 2.0F;
	//   27   52:aload_0         
	//   28   53:getfield        #20  <Field Rect a>
	//   29   56:invokevirtual   #205 <Method int Rect.width()>
	//   30   59:i2f             
	//   31   60:fconst_2        
	//   32   61:fdiv            
	//   33   62:fstore          10
		i j1 = g1.a.b("expansion");
	//   34   64:aload           5
	//   35   66:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   36   69:ldc1            #48  <String "expansion">
	//   37   71:invokevirtual   #53  <Method i h.b(String)>
	//   38   74:astore          18
		if(flag)
	//*  39   76:iload_3         
	//*  40   77:ifeq            182
		{
			if(!flag1)
	//*  41   80:iload           4
	//*  42   82:ifne            105
				f6.setRevealInfo(new k(f4, f5, f3));
	//   43   85:aload           17
	//   44   87:new             #207 <Class k>
	//   45   90:dup             
	//   46   91:fload           11
	//   47   93:fload           12
	//   48   95:fload           10
	//   49   97:invokespecial   #210 <Method void k(float, float, float)>
	//   50  100:invokeinterface #214 <Method void f.setRevealInfo(k)>
			if(flag1)
	//*  51  105:iload           4
	//*  52  107:ifeq            122
				f3 = f6.getRevealInfo().c;
	//   53  110:aload           17
	//   54  112:invokeinterface #218 <Method k f.getRevealInfo()>
	//   55  117:getfield        #220 <Field float k.c>
	//   56  120:fstore          10
			view = ((View) (android.support.design.c.a.a(f6, f4, f5, bn.a(f4, f5, 0.0F, 0.0F, f1, f2))));
	//   57  122:aload           17
	//   58  124:fload           11
	//   59  126:fload           12
	//   60  128:fload           11
	//   61  130:fload           12
	//   62  132:fconst_0        
	//   63  133:fconst_0        
	//   64  134:fload           6
	//   65  136:fload           7
	//   66  138:invokestatic    #225 <Method float bn.a(float, float, float, float, float, float)>
	//   67  141:invokestatic    #230 <Method Animator android.support.design.c.a.a(f, float, float, float)>
	//   68  144:astore_1        
			((Animator) (view)).addListener(((android.animation.Animator.AnimatorListener) (new android.support.design.transformation.f(this, f6))));
	//   69  145:aload_1         
	//   70  146:new             #232 <Class android.support.design.transformation.f>
	//   71  149:dup             
	//   72  150:aload_0         
	//   73  151:aload           17
	//   74  153:invokespecial   #235 <Method void android.support.design.transformation.f(FabTransformationBehavior, f)>
	//   75  156:invokevirtual   #239 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			a(view1, j1.a(), (int)f4, (int)f5, f3, list);
	//   76  159:aload_0         
	//   77  160:aload_2         
	//   78  161:aload           18
	//   79  163:invokevirtual   #39  <Method long i.a()>
	//   80  166:fload           11
	//   81  168:f2i             
	//   82  169:fload           12
	//   83  171:f2i             
	//   84  172:fload           10
	//   85  174:aload           8
	//   86  176:invokespecial   #241 <Method void a(View, long, int, int, float, List)>
		} else
	//*  87  179:goto            269
		{
			f1 = f6.getRevealInfo().c;
	//   88  182:aload           17
	//   89  184:invokeinterface #218 <Method k f.getRevealInfo()>
	//   90  189:getfield        #220 <Field float k.c>
	//   91  192:fstore          6
			view = ((View) (android.support.design.c.a.a(f6, f4, f5, f3)));
	//   92  194:aload           17
	//   93  196:fload           11
	//   94  198:fload           12
	//   95  200:fload           10
	//   96  202:invokestatic    #230 <Method Animator android.support.design.c.a.a(f, float, float, float)>
	//   97  205:astore_1        
			long l1 = j1.a();
	//   98  206:aload           18
	//   99  208:invokevirtual   #39  <Method long i.a()>
	//  100  211:lstore          15
			int l = (int)f4;
	//  101  213:fload           11
	//  102  215:f2i             
	//  103  216:istore          13
			int i1 = (int)f5;
	//  104  218:fload           12
	//  105  220:f2i             
	//  106  221:istore          14
			a(view1, l1, l, i1, f1, list);
	//  107  223:aload_0         
	//  108  224:aload_2         
	//  109  225:lload           15
	//  110  227:iload           13
	//  111  229:iload           14
	//  112  231:fload           6
	//  113  233:aload           8
	//  114  235:invokespecial   #241 <Method void a(View, long, int, int, float, List)>
			a(view1, j1.a(), j1.b(), g1.a.a(), l, i1, f3, list);
	//  115  238:aload_0         
	//  116  239:aload_2         
	//  117  240:aload           18
	//  118  242:invokevirtual   #39  <Method long i.a()>
	//  119  245:aload           18
	//  120  247:invokevirtual   #41  <Method long i.b()>
	//  121  250:aload           5
	//  122  252:getfield        #46  <Field h android.support.design.transformation.g.a>
	//  123  255:invokevirtual   #242 <Method long h.a()>
	//  124  258:iload           13
	//  125  260:iload           14
	//  126  262:fload           10
	//  127  264:aload           8
	//  128  266:invokespecial   #244 <Method void a(View, long, long, long, int, int, float, List)>
		}
		j1.a(((Animator) (view)));
	//  129  269:aload           18
	//  130  271:aload_1         
	//  131  272:invokevirtual   #247 <Method void i.a(Animator)>
		list.add(((Object) (view)));
	//  132  275:aload           8
	//  133  277:aload_1         
	//  134  278:invokeinterface #142 <Method boolean List.add(Object)>
	//  135  283:pop             
		list1.add(((Object) (android.support.design.c.a.a(f6))));
	//  136  284:aload           9
	//  137  286:aload           17
	//  138  288:invokestatic    #250 <Method android.animation.Animator$AnimatorListener android.support.design.c.a.a(f)>
	//  139  291:invokeinterface #142 <Method boolean List.add(Object)>
	//  140  296:pop             
	//  141  297:return          
	}

	private void a(View view, View view1, boolean flag, boolean flag1, android.support.design.transformation.g g1, List list, List list1)
	{
		float f1 = ac.m(view1) - ac.m(view);
	//    0    0:aload_2         
	//    1    1:invokestatic    #260 <Method float ac.m(View)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #260 <Method float ac.m(View)>
	//    4    8:fsub            
	//    5    9:fstore          8
		if(flag)
	//*   6   11:iload_3         
	//*   7   12:ifeq            45
		{
			if(!flag1)
	//*   8   15:iload           4
	//*   9   17:ifne            27
				view1.setTranslationZ(-f1);
	//   10   20:aload_2         
	//   11   21:fload           8
	//   12   23:fneg            
	//   13   24:invokevirtual   #264 <Method void View.setTranslationZ(float)>
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_Z, new float[] {
				0.0F
			})));
	//   14   27:aload_2         
	//   15   28:getstatic       #268 <Field Property View.TRANSLATION_Z>
	//   16   31:iconst_1        
	//   17   32:newarray        float[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:fconst_0        
	//   21   37:fastore         
	//   22   38:invokestatic    #274 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   23   41:astore_1        
		} else
	//*  24   42:goto            62
		{
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_Z, new float[] {
				-f1
			})));
	//   25   45:aload_2         
	//   26   46:getstatic       #268 <Field Property View.TRANSLATION_Z>
	//   27   49:iconst_1        
	//   28   50:newarray        float[]
	//   29   52:dup             
	//   30   53:iconst_0        
	//   31   54:fload           8
	//   32   56:fneg            
	//   33   57:fastore         
	//   34   58:invokestatic    #274 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   35   61:astore_1        
		}
		g1.a.b("elevation").a(((Animator) (view)));
	//   36   62:aload           5
	//   37   64:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   38   67:ldc2            #276 <String "elevation">
	//   39   70:invokevirtual   #53  <Method i h.b(String)>
	//   40   73:aload_1         
	//   41   74:invokevirtual   #247 <Method void i.a(Animator)>
		list.add(((Object) (view)));
	//   42   77:aload           6
	//   43   79:aload_1         
	//   44   80:invokeinterface #142 <Method boolean List.add(Object)>
	//   45   85:pop             
	//   46   86:return          
	}

	private void a(View view, View view1, boolean flag, boolean flag1, android.support.design.transformation.g g1, List list, List list1, 
			RectF rectf)
	{
		float f1 = a(view, view1, g1.b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           5
	//    4    5:getfield        #193 <Field j android.support.design.transformation.g.b>
	//    5    8:invokespecial   #280 <Method float a(View, View, j)>
	//    6   11:fstore          9
		float f2 = b(view, view1, g1.b);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload           5
	//   11   18:getfield        #193 <Field j android.support.design.transformation.g.b>
	//   12   21:invokespecial   #282 <Method float b(View, View, j)>
	//   13   24:fstore          10
		if(f1 != 0.0F && f2 != 0.0F)
	//*  14   26:fload           9
	//*  15   28:fconst_0        
	//*  16   29:fcmpl           
	//*  17   30:ifeq            121
	//*  18   33:fload           10
	//*  19   35:fconst_0        
	//*  20   36:fcmpl           
	//*  21   37:ifne            43
	//*  22   40:goto            121
		{
			if(flag && f2 < 0.0F || !flag && f2 > 0.0F)
	//*  23   43:iload_3         
	//*  24   44:ifeq            54
	//*  25   47:fload           10
	//*  26   49:fconst_0        
	//*  27   50:fcmpg           
	//*  28   51:iflt            65
	//*  29   54:iload_3         
	//*  30   55:ifne            93
	//*  31   58:fload           10
	//*  32   60:fconst_0        
	//*  33   61:fcmpl           
	//*  34   62:ifle            93
			{
				view = ((View) (g1.a.b("translationXCurveUpwards")));
	//   35   65:aload           5
	//   36   67:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   37   70:ldc2            #284 <String "translationXCurveUpwards">
	//   38   73:invokevirtual   #53  <Method i h.b(String)>
	//   39   76:astore_1        
				list1 = ((List) (g1.a.b("translationYCurveUpwards")));
	//   40   77:aload           5
	//   41   79:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   42   82:ldc2            #286 <String "translationYCurveUpwards">
	//   43   85:invokevirtual   #53  <Method i h.b(String)>
	//   44   88:astore          7
			} else
	//*  45   90:goto            146
			{
				view = ((View) (g1.a.b("translationXCurveDownwards")));
	//   46   93:aload           5
	//   47   95:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   48   98:ldc2            #288 <String "translationXCurveDownwards">
	//   49  101:invokevirtual   #53  <Method i h.b(String)>
	//   50  104:astore_1        
				list1 = ((List) (g1.a.b("translationYCurveDownwards")));
	//   51  105:aload           5
	//   52  107:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   53  110:ldc2            #290 <String "translationYCurveDownwards">
	//   54  113:invokevirtual   #53  <Method i h.b(String)>
	//   55  116:astore          7
			}
		} else
	//*  56  118:goto            146
		{
			view = ((View) (g1.a.b("translationXLinear")));
	//   57  121:aload           5
	//   58  123:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   59  126:ldc2            #292 <String "translationXLinear">
	//   60  129:invokevirtual   #53  <Method i h.b(String)>
	//   61  132:astore_1        
			list1 = ((List) (g1.a.b("translationYLinear")));
	//   62  133:aload           5
	//   63  135:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   64  138:ldc2            #294 <String "translationYLinear">
	//   65  141:invokevirtual   #53  <Method i h.b(String)>
	//   66  144:astore          7
		}
		if(flag)
	//*  67  146:iload_3         
	//*  68  147:ifeq            231
		{
			if(!flag1)
	//*  69  150:iload           4
	//*  70  152:ifne            169
			{
				view1.setTranslationX(-f1);
	//   71  155:aload_2         
	//   72  156:fload           9
	//   73  158:fneg            
	//   74  159:invokevirtual   #297 <Method void View.setTranslationX(float)>
				view1.setTranslationY(-f2);
	//   75  162:aload_2         
	//   76  163:fload           10
	//   77  165:fneg            
	//   78  166:invokevirtual   #300 <Method void View.setTranslationY(float)>
			}
			ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_X, new float[] {
				0.0F
			});
	//   79  169:aload_2         
	//   80  170:getstatic       #303 <Field Property View.TRANSLATION_X>
	//   81  173:iconst_1        
	//   82  174:newarray        float[]
	//   83  176:dup             
	//   84  177:iconst_0        
	//   85  178:fconst_0        
	//   86  179:fastore         
	//   87  180:invokestatic    #274 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   88  183:astore          12
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_Y, new float[] {
				0.0F
			});
	//   89  185:aload_2         
	//   90  186:getstatic       #306 <Field Property View.TRANSLATION_Y>
	//   91  189:iconst_1        
	//   92  190:newarray        float[]
	//   93  192:dup             
	//   94  193:iconst_0        
	//   95  194:fconst_0        
	//   96  195:fastore         
	//   97  196:invokestatic    #274 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   98  199:astore          11
			a(view1, g1, ((i) (view)), ((i) (list1)), -f1, -f2, 0.0F, 0.0F, rectf);
	//   99  201:aload_0         
	//  100  202:aload_2         
	//  101  203:aload           5
	//  102  205:aload_1         
	//  103  206:aload           7
	//  104  208:fload           9
	//  105  210:fneg            
	//  106  211:fload           10
	//  107  213:fneg            
	//  108  214:fconst_0        
	//  109  215:fconst_0        
	//  110  216:aload           8
	//  111  218:invokespecial   #308 <Method void a(View, android.support.design.transformation.g, i, i, float, float, float, float, RectF)>
			view1 = ((View) (objectanimator1));
	//  112  221:aload           12
	//  113  223:astore_2        
			g1 = ((android.support.design.transformation.g) (objectanimator));
	//  114  224:aload           11
	//  115  226:astore          5
		} else
	//* 116  228:goto            270
		{
			rectf = ((RectF) (ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_X, new float[] {
				-f1
			})));
	//  117  231:aload_2         
	//  118  232:getstatic       #303 <Field Property View.TRANSLATION_X>
	//  119  235:iconst_1        
	//  120  236:newarray        float[]
	//  121  238:dup             
	//  122  239:iconst_0        
	//  123  240:fload           9
	//  124  242:fneg            
	//  125  243:fastore         
	//  126  244:invokestatic    #274 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//  127  247:astore          8
			g1 = ((android.support.design.transformation.g) (ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_Y, new float[] {
				-f2
			})));
	//  128  249:aload_2         
	//  129  250:getstatic       #306 <Field Property View.TRANSLATION_Y>
	//  130  253:iconst_1        
	//  131  254:newarray        float[]
	//  132  256:dup             
	//  133  257:iconst_0        
	//  134  258:fload           10
	//  135  260:fneg            
	//  136  261:fastore         
	//  137  262:invokestatic    #274 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//  138  265:astore          5
			view1 = ((View) (rectf));
	//  139  267:aload           8
	//  140  269:astore_2        
		}
		((i) (view)).a(((Animator) (view1)));
	//  141  270:aload_1         
	//  142  271:aload_2         
	//  143  272:invokevirtual   #247 <Method void i.a(Animator)>
		((i) (list1)).a(((Animator) (g1)));
	//  144  275:aload           7
	//  145  277:aload           5
	//  146  279:invokevirtual   #247 <Method void i.a(Animator)>
		list.add(((Object) (view1)));
	//  147  282:aload           6
	//  148  284:aload_2         
	//  149  285:invokeinterface #142 <Method boolean List.add(Object)>
	//  150  290:pop             
		list.add(((Object) (g1)));
	//  151  291:aload           6
	//  152  293:aload           5
	//  153  295:invokeinterface #142 <Method boolean List.add(Object)>
	//  154  300:pop             
	//  155  301:return          
	}

	private float b(View view, View view1, j j1)
	{
		RectF rectf = b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RectF b>
	//    2    4:astore          6
		RectF rectf1 = c;
	//    3    6:aload_0         
	//    4    7:getfield        #27  <Field RectF c>
	//    5   10:astore          7
		a(view, rectf);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           6
	//    9   16:invokespecial   #73  <Method void a(View, RectF)>
		a(view1, rectf1);
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:aload           7
	//   13   23:invokespecial   #73  <Method void a(View, RectF)>
		int l = j1.a & 0x70;
	//   14   26:aload_3         
	//   15   27:getfield        #78  <Field int j.a>
	//   16   30:bipush          112
	//   17   32:iand            
	//   18   33:istore          5
		float f1;
		if(l != 16)
	//*  19   35:iload           5
	//*  20   37:bipush          16
	//*  21   39:icmpeq          94
		{
			if(l != 48)
	//*  22   42:iload           5
	//*  23   44:bipush          48
	//*  24   46:icmpeq          78
			{
				if(l != 80)
	//*  25   49:iload           5
	//*  26   51:bipush          80
	//*  27   53:icmpeq          62
					f1 = 0.0F;
	//   28   56:fconst_0        
	//   29   57:fstore          4
				else
	//*  30   59:goto            107
					f1 = rectf1.bottom - rectf.bottom;
	//   31   62:aload           7
	//   32   64:getfield        #311 <Field float RectF.bottom>
	//   33   67:aload           6
	//   34   69:getfield        #311 <Field float RectF.bottom>
	//   35   72:fsub            
	//   36   73:fstore          4
			} else
	//*  37   75:goto            107
			{
				f1 = rectf1.top - rectf.top;
	//   38   78:aload           7
	//   39   80:getfield        #314 <Field float RectF.top>
	//   40   83:aload           6
	//   41   85:getfield        #314 <Field float RectF.top>
	//   42   88:fsub            
	//   43   89:fstore          4
			}
		} else
	//*  44   91:goto            107
		{
			f1 = rectf1.centerY() - rectf.centerY();
	//   45   94:aload           7
	//   46   96:invokevirtual   #317 <Method float RectF.centerY()>
	//   47   99:aload           6
	//   48  101:invokevirtual   #317 <Method float RectF.centerY()>
	//   49  104:fsub            
	//   50  105:fstore          4
		}
		return f1 + j1.c;
	//   51  107:fload           4
	//   52  109:aload_3         
	//   53  110:getfield        #318 <Field float j.c>
	//   54  113:fadd            
	//   55  114:freturn         
	}

	private ViewGroup b(View view)
	{
		if(view instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #111 <Class ViewGroup>
	//*   2    4:ifeq            12
			return (ViewGroup)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #111 <Class ViewGroup>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	private void b(View view, View view1, boolean flag, boolean flag1, android.support.design.transformation.g g1, List list, List list1)
	{
		if(view1 instanceof f)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #190 <Class f>
	//*   2    4:ifeq            154
		{
			if(!(view instanceof ImageView))
	//*   3    7:aload_1         
	//*   4    8:instanceof      #320 <Class ImageView>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			f f1 = (f)view1;
	//    7   15:aload_2         
	//    8   16:checkcast       #190 <Class f>
	//    9   19:astore          8
			Drawable drawable = ((ImageView)view).getDrawable();
	//   10   21:aload_1         
	//   11   22:checkcast       #320 <Class ImageView>
	//   12   25:invokevirtual   #324 <Method Drawable ImageView.getDrawable()>
	//   13   28:astore          9
			if(drawable == null)
	//*  14   30:aload           9
	//*  15   32:ifnonnull       36
				return;
	//   16   35:return          
			drawable.mutate();
	//   17   36:aload           9
	//   18   38:invokevirtual   #329 <Method Drawable Drawable.mutate()>
	//   19   41:pop             
			if(flag)
	//*  20   42:iload_3         
	//*  21   43:ifeq            78
			{
				if(!flag1)
	//*  22   46:iload           4
	//*  23   48:ifne            59
					drawable.setAlpha(255);
	//   24   51:aload           9
	//   25   53:sipush          255
	//   26   56:invokevirtual   #333 <Method void Drawable.setAlpha(int)>
				view = ((View) (ObjectAnimator.ofInt(((Object) (drawable)), e.a, new int[] {
					0
				})));
	//   27   59:aload           9
	//   28   61:getstatic       #337 <Field Property e.a>
	//   29   64:iconst_1        
	//   30   65:newarray        int[]
	//   31   67:dup             
	//   32   68:iconst_0        
	//   33   69:iconst_0        
	//   34   70:iastore         
	//   35   71:invokestatic    #341 <Method ObjectAnimator ObjectAnimator.ofInt(Object, Property, int[])>
	//   36   74:astore_1        
			} else
	//*  37   75:goto            96
			{
				view = ((View) (ObjectAnimator.ofInt(((Object) (drawable)), e.a, new int[] {
					255
				})));
	//   38   78:aload           9
	//   39   80:getstatic       #337 <Field Property e.a>
	//   40   83:iconst_1        
	//   41   84:newarray        int[]
	//   42   86:dup             
	//   43   87:iconst_0        
	//   44   88:sipush          255
	//   45   91:iastore         
	//   46   92:invokestatic    #341 <Method ObjectAnimator ObjectAnimator.ofInt(Object, Property, int[])>
	//   47   95:astore_1        
			}
			((ObjectAnimator) (view)).addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (new android.support.design.transformation.d(this, view1))));
	//   48   96:aload_1         
	//   49   97:new             #343 <Class android.support.design.transformation.d>
	//   50  100:dup             
	//   51  101:aload_0         
	//   52  102:aload_2         
	//   53  103:invokespecial   #346 <Method void android.support.design.transformation.d(FabTransformationBehavior, View)>
	//   54  106:invokevirtual   #350 <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			g1.a.b("iconFade").a(((Animator) (view)));
	//   55  109:aload           5
	//   56  111:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   57  114:ldc2            #352 <String "iconFade">
	//   58  117:invokevirtual   #53  <Method i h.b(String)>
	//   59  120:aload_1         
	//   60  121:invokevirtual   #247 <Method void i.a(Animator)>
			list.add(((Object) (view)));
	//   61  124:aload           6
	//   62  126:aload_1         
	//   63  127:invokeinterface #142 <Method boolean List.add(Object)>
	//   64  132:pop             
			list1.add(((Object) (new android.support.design.transformation.e(this, f1, drawable))));
	//   65  133:aload           7
	//   66  135:new             #354 <Class android.support.design.transformation.e>
	//   67  138:dup             
	//   68  139:aload_0         
	//   69  140:aload           8
	//   70  142:aload           9
	//   71  144:invokespecial   #357 <Method void android.support.design.transformation.e(FabTransformationBehavior, f, Drawable)>
	//   72  147:invokeinterface #142 <Method boolean List.add(Object)>
	//   73  152:pop             
			return;
	//   74  153:return          
		} else
		{
			return;
	//   75  154:return          
		}
	}

	private float c(View view, View view1, j j1)
	{
		RectF rectf = b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RectF b>
	//    2    4:astore          4
		RectF rectf1 = c;
	//    3    6:aload_0         
	//    4    7:getfield        #27  <Field RectF c>
	//    5   10:astore          5
		a(view, rectf);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           4
	//    9   16:invokespecial   #73  <Method void a(View, RectF)>
		a(view1, rectf1);
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:aload           5
	//   13   23:invokespecial   #73  <Method void a(View, RectF)>
		rectf1.offset(-a(view, view1, j1), 0.0F);
	//   14   26:aload           5
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:aload_3         
	//   19   32:invokespecial   #280 <Method float a(View, View, j)>
	//   20   35:fneg            
	//   21   36:fconst_0        
	//   22   37:invokevirtual   #171 <Method void RectF.offset(float, float)>
		return rectf.centerX() - rectf1.left;
	//   23   40:aload           4
	//   24   42:invokevirtual   #89  <Method float RectF.centerX()>
	//   25   45:aload           5
	//   26   47:getfield        #85  <Field float RectF.left>
	//   27   50:fsub            
	//   28   51:freturn         
	}

	private int c(View view)
	{
		ColorStateList colorstatelist = ac.t(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #362 <Method ColorStateList ac.t(View)>
	//    2    4:astore_2        
		if(colorstatelist != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
			return colorstatelist.getColorForState(view.getDrawableState(), colorstatelist.getDefaultColor());
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #366 <Method int[] View.getDrawableState()>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #371 <Method int ColorStateList.getDefaultColor()>
	//   10   18:invokevirtual   #375 <Method int ColorStateList.getColorForState(int[], int)>
	//   11   21:ireturn         
		else
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	private void c(View view, View view1, boolean flag, boolean flag1, android.support.design.transformation.g g1, List list, List list1)
	{
		if(!(view1 instanceof f))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #190 <Class f>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		view1 = ((View) ((f)view1));
	//    4    8:aload_2         
	//    5    9:checkcast       #190 <Class f>
	//    6   12:astore_2        
		int l = c(view);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #377 <Method int c(View)>
	//   10   18:istore          8
		if(flag)
	//*  11   20:iload_3         
	//*  12   21:ifeq            60
		{
			if(!flag1)
	//*  13   24:iload           4
	//*  14   26:ifne            37
				((f) (view1)).setCircularRevealScrimColor(l);
	//   15   29:aload_2         
	//   16   30:iload           8
	//   17   32:invokeinterface #380 <Method void f.setCircularRevealScrimColor(int)>
			view = ((View) (ObjectAnimator.ofInt(((Object) (view1)), android.support.design.c.j.a, new int[] {
				0xffffff & l
			})));
	//   18   37:aload_2         
	//   19   38:getstatic       #383 <Field Property android.support.design.c.j.a>
	//   20   41:iconst_1        
	//   21   42:newarray        int[]
	//   22   44:dup             
	//   23   45:iconst_0        
	//   24   46:ldc2            #384 <Int 0xffffff>
	//   25   49:iload           8
	//   26   51:iand            
	//   27   52:iastore         
	//   28   53:invokestatic    #341 <Method ObjectAnimator ObjectAnimator.ofInt(Object, Property, int[])>
	//   29   56:astore_1        
		} else
	//*  30   57:goto            76
		{
			view = ((View) (ObjectAnimator.ofInt(((Object) (view1)), android.support.design.c.j.a, new int[] {
				l
			})));
	//   31   60:aload_2         
	//   32   61:getstatic       #383 <Field Property android.support.design.c.j.a>
	//   33   64:iconst_1        
	//   34   65:newarray        int[]
	//   35   67:dup             
	//   36   68:iconst_0        
	//   37   69:iload           8
	//   38   71:iastore         
	//   39   72:invokestatic    #341 <Method ObjectAnimator ObjectAnimator.ofInt(Object, Property, int[])>
	//   40   75:astore_1        
		}
		((ObjectAnimator) (view)).setEvaluator(((android.animation.TypeEvaluator) (android.support.design.a.c.a())));
	//   41   76:aload_1         
	//   42   77:invokestatic    #389 <Method c c.a()>
	//   43   80:invokevirtual   #393 <Method void ObjectAnimator.setEvaluator(android.animation.TypeEvaluator)>
		g1.a.b("color").a(((Animator) (view)));
	//   44   83:aload           5
	//   45   85:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   46   88:ldc2            #395 <String "color">
	//   47   91:invokevirtual   #53  <Method i h.b(String)>
	//   48   94:aload_1         
	//   49   95:invokevirtual   #247 <Method void i.a(Animator)>
		list.add(((Object) (view)));
	//   50   98:aload           6
	//   51  100:aload_1         
	//   52  101:invokeinterface #142 <Method boolean List.add(Object)>
	//   53  106:pop             
	//   54  107:return          
	}

	private float d(View view, View view1, j j1)
	{
		RectF rectf = b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RectF b>
	//    2    4:astore          4
		RectF rectf1 = c;
	//    3    6:aload_0         
	//    4    7:getfield        #27  <Field RectF c>
	//    5   10:astore          5
		a(view, rectf);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           4
	//    9   16:invokespecial   #73  <Method void a(View, RectF)>
		a(view1, rectf1);
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:aload           5
	//   13   23:invokespecial   #73  <Method void a(View, RectF)>
		rectf1.offset(0.0F, -b(view, view1, j1));
	//   14   26:aload           5
	//   15   28:fconst_0        
	//   16   29:aload_0         
	//   17   30:aload_1         
	//   18   31:aload_2         
	//   19   32:aload_3         
	//   20   33:invokespecial   #282 <Method float b(View, View, j)>
	//   21   36:fneg            
	//   22   37:invokevirtual   #171 <Method void RectF.offset(float, float)>
		return rectf.centerY() - rectf1.top;
	//   23   40:aload           4
	//   24   42:invokevirtual   #317 <Method float RectF.centerY()>
	//   25   45:aload           5
	//   26   47:getfield        #314 <Field float RectF.top>
	//   27   50:fsub            
	//   28   51:freturn         
	}

	private void d(View view, View view1, boolean flag, boolean flag1, android.support.design.transformation.g g1, List list, List list1)
	{
		if(!(view1 instanceof ViewGroup))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #111 <Class ViewGroup>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if((view1 instanceof f) && d.a == 0)
	//*   4    8:aload_2         
	//*   5    9:instanceof      #190 <Class f>
	//*   6   12:ifeq            22
	//*   7   15:getstatic       #398 <Field int d.a>
	//*   8   18:ifne            22
			return;
	//    9   21:return          
		view = ((View) (a(view1)));
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:invokespecial   #400 <Method ViewGroup a(View)>
	//   13   27:astore_1        
		if(view == null)
	//*  14   28:aload_1         
	//*  15   29:ifnonnull       33
			return;
	//   16   32:return          
		if(flag)
	//*  17   33:iload_3         
	//*  18   34:ifeq            71
		{
			if(!flag1)
	//*  19   37:iload           4
	//*  20   39:ifne            53
				android.support.design.a.d.a.set(((Object) (view)), ((Object) (Float.valueOf(0.0F))));
	//   21   42:getstatic       #403 <Field Property android.support.design.a.d.a>
	//   22   45:aload_1         
	//   23   46:fconst_0        
	//   24   47:invokestatic    #409 <Method Float Float.valueOf(float)>
	//   25   50:invokevirtual   #414 <Method void Property.set(Object, Object)>
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), android.support.design.a.d.a, new float[] {
				1.0F
			})));
	//   26   53:aload_1         
	//   27   54:getstatic       #403 <Field Property android.support.design.a.d.a>
	//   28   57:iconst_1        
	//   29   58:newarray        float[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:fconst_1        
	//   33   63:fastore         
	//   34   64:invokestatic    #274 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   35   67:astore_1        
		} else
	//*  36   68:goto            86
		{
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), android.support.design.a.d.a, new float[] {
				0.0F
			})));
	//   37   71:aload_1         
	//   38   72:getstatic       #403 <Field Property android.support.design.a.d.a>
	//   39   75:iconst_1        
	//   40   76:newarray        float[]
	//   41   78:dup             
	//   42   79:iconst_0        
	//   43   80:fconst_0        
	//   44   81:fastore         
	//   45   82:invokestatic    #274 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   46   85:astore_1        
		}
		g1.a.b("contentFade").a(((Animator) (view)));
	//   47   86:aload           5
	//   48   88:getfield        #46  <Field h android.support.design.transformation.g.a>
	//   49   91:ldc2            #416 <String "contentFade">
	//   50   94:invokevirtual   #53  <Method i h.b(String)>
	//   51   97:aload_1         
	//   52   98:invokevirtual   #247 <Method void i.a(Animator)>
		list.add(((Object) (view)));
	//   53  101:aload           6
	//   54  103:aload_1         
	//   55  104:invokeinterface #142 <Method boolean List.add(Object)>
	//   56  109:pop             
	//   57  110:return          
	}

	protected abstract android.support.design.transformation.g a(Context context, boolean flag);

	public void a(am am1)
	{
		if(am1.h == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #423 <Field int am.h>
	//*   2    4:ifne            13
			am1.h = 80;
	//    3    7:aload_1         
	//    4    8:bipush          80
	//    5   10:putfield        #423 <Field int am.h>
	//    6   13:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		if(view.getVisibility() != 8)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #427 <Method int View.getVisibility()>
	//*   2    4:bipush          8
	//*   3    6:icmpeq          54
		{
			boolean flag1 = view1 instanceof FloatingActionButton;
	//    4    9:aload_3         
	//    5   10:instanceof      #199 <Class FloatingActionButton>
	//    6   13:istore          6
			boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore          5
			if(flag1)
	//*   9   18:iload           6
	//*  10   20:ifeq            52
			{
				int l = ((FloatingActionButton)view1).getExpandedComponentIdHint();
	//   11   23:aload_3         
	//   12   24:checkcast       #199 <Class FloatingActionButton>
	//   13   27:invokevirtual   #430 <Method int FloatingActionButton.getExpandedComponentIdHint()>
	//   14   30:istore          4
				if(l == 0 || l == view.getId())
	//*  15   32:iload           4
	//*  16   34:ifeq            46
	//*  17   37:iload           4
	//*  18   39:aload_2         
	//*  19   40:invokevirtual   #433 <Method int View.getId()>
	//*  20   43:icmpne          49
					flag = true;
	//   21   46:iconst_1        
	//   22   47:istore          5
				return flag;
	//   23   49:iload           5
	//   24   51:ireturn         
			} else
			{
				return false;
	//   25   52:iconst_0        
	//   26   53:ireturn         
			}
		} else
		{
			throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
	//   27   54:new             #435 <Class IllegalStateException>
	//   28   57:dup             
	//   29   58:ldc2            #437 <String "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.">
	//   30   61:invokespecial   #440 <Method void IllegalStateException(String)>
	//   31   64:athrow          
		}
	}

	protected AnimatorSet b(View view, View view1, boolean flag, boolean flag1)
	{
		Object obj = ((Object) (a(view1.getContext(), flag)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #445 <Method Context View.getContext()>
	//    3    5:iload_3         
	//    4    6:invokevirtual   #447 <Method android.support.design.transformation.g a(Context, boolean)>
	//    5    9:astore          11
		ArrayList arraylist = new ArrayList();
	//    6   11:new             #449 <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #450 <Method void ArrayList()>
	//    9   18:astore          9
		ArrayList arraylist1 = new ArrayList();
	//   10   20:new             #449 <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #450 <Method void ArrayList()>
	//   13   27:astore          10
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  14   29:getstatic       #120 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   32:bipush          21
	//*  16   34:icmplt          52
			a(view, view1, flag, flag1, ((android.support.design.transformation.g) (obj)), ((List) (arraylist)), ((List) (arraylist1)));
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:iload_3         
	//   21   41:iload           4
	//   22   43:aload           11
	//   23   45:aload           9
	//   24   47:aload           10
	//   25   49:invokespecial   #452 <Method void a(View, View, boolean, boolean, android.support.design.transformation.g, List, List)>
		RectF rectf = b;
	//   26   52:aload_0         
	//   27   53:getfield        #25  <Field RectF b>
	//   28   56:astore          12
		a(view, view1, flag, flag1, ((android.support.design.transformation.g) (obj)), ((List) (arraylist)), ((List) (arraylist1)), rectf);
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:aload_2         
	//   32   61:iload_3         
	//   33   62:iload           4
	//   34   64:aload           11
	//   35   66:aload           9
	//   36   68:aload           10
	//   37   70:aload           12
	//   38   72:invokespecial   #454 <Method void a(View, View, boolean, boolean, android.support.design.transformation.g, List, List, RectF)>
		float f1 = rectf.width();
	//   39   75:aload           12
	//   40   77:invokevirtual   #456 <Method float RectF.width()>
	//   41   80:fstore          5
		float f2 = rectf.height();
	//   42   82:aload           12
	//   43   84:invokevirtual   #459 <Method float RectF.height()>
	//   44   87:fstore          6
		b(view, view1, flag, flag1, ((android.support.design.transformation.g) (obj)), ((List) (arraylist)), ((List) (arraylist1)));
	//   45   89:aload_0         
	//   46   90:aload_1         
	//   47   91:aload_2         
	//   48   92:iload_3         
	//   49   93:iload           4
	//   50   95:aload           11
	//   51   97:aload           9
	//   52   99:aload           10
	//   53  101:invokespecial   #461 <Method void b(View, View, boolean, boolean, android.support.design.transformation.g, List, List)>
		a(view, view1, flag, flag1, ((android.support.design.transformation.g) (obj)), f1, f2, ((List) (arraylist)), ((List) (arraylist1)));
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:aload_2         
	//   57  107:iload_3         
	//   58  108:iload           4
	//   59  110:aload           11
	//   60  112:fload           5
	//   61  114:fload           6
	//   62  116:aload           9
	//   63  118:aload           10
	//   64  120:invokespecial   #463 <Method void a(View, View, boolean, boolean, android.support.design.transformation.g, float, float, List, List)>
		c(view, view1, flag, flag1, ((android.support.design.transformation.g) (obj)), ((List) (arraylist)), ((List) (arraylist1)));
	//   65  123:aload_0         
	//   66  124:aload_1         
	//   67  125:aload_2         
	//   68  126:iload_3         
	//   69  127:iload           4
	//   70  129:aload           11
	//   71  131:aload           9
	//   72  133:aload           10
	//   73  135:invokespecial   #465 <Method void c(View, View, boolean, boolean, android.support.design.transformation.g, List, List)>
		d(view, view1, flag, flag1, ((android.support.design.transformation.g) (obj)), ((List) (arraylist)), ((List) (arraylist1)));
	//   74  138:aload_0         
	//   75  139:aload_1         
	//   76  140:aload_2         
	//   77  141:iload_3         
	//   78  142:iload           4
	//   79  144:aload           11
	//   80  146:aload           9
	//   81  148:aload           10
	//   82  150:invokespecial   #467 <Method void d(View, View, boolean, boolean, android.support.design.transformation.g, List, List)>
		obj = ((Object) (new AnimatorSet()));
	//   83  153:new             #469 <Class AnimatorSet>
	//   84  156:dup             
	//   85  157:invokespecial   #470 <Method void AnimatorSet()>
	//   86  160:astore          11
		android.support.design.a.b.a(((AnimatorSet) (obj)), ((List) (arraylist)));
	//   87  162:aload           11
	//   88  164:aload           9
	//   89  166:invokestatic    #475 <Method void b.a(AnimatorSet, List)>
		((AnimatorSet) (obj)).addListener(((android.animation.Animator.AnimatorListener) (new android.support.design.transformation.c(this, flag, view1, view))));
	//   90  169:aload           11
	//   91  171:new             #477 <Class android.support.design.transformation.c>
	//   92  174:dup             
	//   93  175:aload_0         
	//   94  176:iload_3         
	//   95  177:aload_2         
	//   96  178:aload_1         
	//   97  179:invokespecial   #480 <Method void android.support.design.transformation.c(FabTransformationBehavior, boolean, View, View)>
	//   98  182:invokevirtual   #481 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
		int l = 0;
	//   99  185:iconst_0        
	//  100  186:istore          7
		for(int i1 = ((List) (arraylist1)).size(); l < i1; l++)
	//* 101  188:aload           10
	//* 102  190:invokeinterface #484 <Method int List.size()>
	//* 103  195:istore          8
	//* 104  197:iload           7
	//* 105  199:iload           8
	//* 106  201:icmpge          230
			((AnimatorSet) (obj)).addListener((android.animation.Animator.AnimatorListener)((List) (arraylist1)).get(l));
	//  107  204:aload           11
	//  108  206:aload           10
	//  109  208:iload           7
	//  110  210:invokeinterface #488 <Method Object List.get(int)>
	//  111  215:checkcast       #490 <Class android.animation.Animator$AnimatorListener>
	//  112  218:invokevirtual   #481 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>

	//  113  221:iload           7
	//  114  223:iconst_1        
	//  115  224:iadd            
	//  116  225:istore          7
	//* 117  227:goto            197
		return ((AnimatorSet) (obj));
	//  118  230:aload           11
	//  119  232:areturn         
	}

	private final Rect a;
	private final RectF b;
	private final RectF c;
	private final int d[];
}
