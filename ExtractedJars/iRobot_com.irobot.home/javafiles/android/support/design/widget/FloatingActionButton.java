// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.*;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.support.v7.widget.i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			VisibilityAwareImageButton, n, q, h, 
//			i, CoordinatorLayout, o, AppBarLayout, 
//			BottomSheetBehavior, k

public class FloatingActionButton extends VisibilityAwareImageButton
{
	public static class Behavior extends CoordinatorLayout.Behavior
	{

		private void a(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton)
		{
			Rect rect = floatingactionbutton.c;
		//    0    0:aload_2         
		//    1    1:getfield        #52  <Field Rect FloatingActionButton.c>
		//    2    4:astore          7
			if(rect != null && rect.centerX() > 0 && rect.centerY() > 0)
		//*   3    6:aload           7
		//*   4    8:ifnull          166
		//*   5   11:aload           7
		//*   6   13:invokevirtual   #58  <Method int Rect.centerX()>
		//*   7   16:ifle            166
		//*   8   19:aload           7
		//*   9   21:invokevirtual   #61  <Method int Rect.centerY()>
		//*  10   24:ifle            166
			{
				CoordinatorLayout.c c1 = (CoordinatorLayout.c)floatingactionbutton.getLayoutParams();
		//   11   27:aload_2         
		//   12   28:invokevirtual   #65  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
		//   13   31:checkcast       #67  <Class CoordinatorLayout$c>
		//   14   34:astore          8
				int i1 = floatingactionbutton.getRight();
		//   15   36:aload_2         
		//   16   37:invokevirtual   #70  <Method int FloatingActionButton.getRight()>
		//   17   40:istore_3        
				int k1 = coordinatorlayout.getWidth();
		//   18   41:aload_1         
		//   19   42:invokevirtual   #75  <Method int CoordinatorLayout.getWidth()>
		//   20   45:istore          5
				int l1 = c1.rightMargin;
		//   21   47:aload           8
		//   22   49:getfield        #78  <Field int CoordinatorLayout$c.rightMargin>
		//   23   52:istore          6
				int j1 = 0;
		//   24   54:iconst_0        
		//   25   55:istore          4
				if(i1 >= k1 - l1)
		//*  26   57:iload_3         
		//*  27   58:iload           5
		//*  28   60:iload           6
		//*  29   62:isub            
		//*  30   63:icmplt          75
					i1 = rect.right;
		//   31   66:aload           7
		//   32   68:getfield        #81  <Field int Rect.right>
		//   33   71:istore_3        
				else
		//*  34   72:goto            99
				if(floatingactionbutton.getLeft() <= c1.leftMargin)
		//*  35   75:aload_2         
		//*  36   76:invokevirtual   #84  <Method int FloatingActionButton.getLeft()>
		//*  37   79:aload           8
		//*  38   81:getfield        #87  <Field int CoordinatorLayout$c.leftMargin>
		//*  39   84:icmpgt          97
					i1 = -rect.left;
		//   40   87:aload           7
		//   41   89:getfield        #90  <Field int Rect.left>
		//   42   92:ineg            
		//   43   93:istore_3        
				else
		//*  44   94:goto            99
					i1 = 0;
		//   45   97:iconst_0        
		//   46   98:istore_3        
				if(floatingactionbutton.getBottom() >= coordinatorlayout.getHeight() - c1.bottomMargin)
		//*  47   99:aload_2         
		//*  48  100:invokevirtual   #93  <Method int FloatingActionButton.getBottom()>
		//*  49  103:aload_1         
		//*  50  104:invokevirtual   #96  <Method int CoordinatorLayout.getHeight()>
		//*  51  107:aload           8
		//*  52  109:getfield        #99  <Field int CoordinatorLayout$c.bottomMargin>
		//*  53  112:isub            
		//*  54  113:icmplt          126
					j1 = rect.bottom;
		//   55  116:aload           7
		//   56  118:getfield        #102 <Field int Rect.bottom>
		//   57  121:istore          4
				else
		//*  58  123:goto            146
				if(floatingactionbutton.getTop() <= c1.topMargin)
		//*  59  126:aload_2         
		//*  60  127:invokevirtual   #105 <Method int FloatingActionButton.getTop()>
		//*  61  130:aload           8
		//*  62  132:getfield        #108 <Field int CoordinatorLayout$c.topMargin>
		//*  63  135:icmpgt          146
					j1 = -rect.top;
		//   64  138:aload           7
		//   65  140:getfield        #111 <Field int Rect.top>
		//   66  143:ineg            
		//   67  144:istore          4
				if(j1 != 0)
		//*  68  146:iload           4
		//*  69  148:ifeq            157
					s.c(((View) (floatingactionbutton)), j1);
		//   70  151:aload_2         
		//   71  152:iload           4
		//   72  154:invokestatic    #116 <Method void s.c(View, int)>
				if(i1 != 0)
		//*  73  157:iload_3         
		//*  74  158:ifeq            166
					s.d(((View) (floatingactionbutton)), i1);
		//   75  161:aload_2         
		//   76  162:iload_3         
		//   77  163:invokestatic    #119 <Method void s.d(View, int)>
			}
		//   78  166:return          
		}

		private boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, FloatingActionButton floatingactionbutton)
		{
			if(!a(((View) (appbarlayout)), floatingactionbutton))
		//*   0    0:aload_0         
		//*   1    1:aload_2         
		//*   2    2:aload_3         
		//*   3    3:invokespecial   #123 <Method boolean a(View, FloatingActionButton)>
		//*   4    6:ifne            11
				return false;
		//    5    9:iconst_0        
		//    6   10:ireturn         
			if(a == null)
		//*   7   11:aload_0         
		//*   8   12:getfield        #125 <Field Rect a>
		//*   9   15:ifnonnull       29
				a = new Rect();
		//   10   18:aload_0         
		//   11   19:new             #54  <Class Rect>
		//   12   22:dup             
		//   13   23:invokespecial   #126 <Method void Rect()>
		//   14   26:putfield        #125 <Field Rect a>
			Rect rect = a;
		//   15   29:aload_0         
		//   16   30:getfield        #125 <Field Rect a>
		//   17   33:astore          4
			o.b(((android.view.ViewGroup) (coordinatorlayout)), ((View) (appbarlayout)), rect);
		//   18   35:aload_1         
		//   19   36:aload_2         
		//   20   37:aload           4
		//   21   39:invokestatic    #131 <Method void o.b(android.view.ViewGroup, View, Rect)>
			if(rect.bottom <= appbarlayout.getMinimumHeightForVisibleOverlappingContent())
		//*  22   42:aload           4
		//*  23   44:getfield        #102 <Field int Rect.bottom>
		//*  24   47:aload_2         
		//*  25   48:invokevirtual   #136 <Method int AppBarLayout.getMinimumHeightForVisibleOverlappingContent()>
		//*  26   51:icmpgt          66
				floatingactionbutton.b(b, false);
		//   27   54:aload_3         
		//   28   55:aload_0         
		//   29   56:getfield        #138 <Field FloatingActionButton$a b>
		//   30   59:iconst_0        
		//   31   60:invokevirtual   #141 <Method void FloatingActionButton.b(FloatingActionButton$a, boolean)>
			else
		//*  32   63:goto            75
				floatingactionbutton.a(b, false);
		//   33   66:aload_3         
		//   34   67:aload_0         
		//   35   68:getfield        #138 <Field FloatingActionButton$a b>
		//   36   71:iconst_0        
		//   37   72:invokevirtual   #143 <Method void FloatingActionButton.a(FloatingActionButton$a, boolean)>
			return true;
		//   38   75:iconst_1        
		//   39   76:ireturn         
		}

		private static boolean a(View view)
		{
			view = ((View) (view.getLayoutParams()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #147 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:astore_0        
			if(view instanceof CoordinatorLayout.c)
		//*   3    5:aload_0         
		//*   4    6:instanceof      #67  <Class CoordinatorLayout$c>
		//*   5    9:ifeq            23
				return ((CoordinatorLayout.c)view).b() instanceof BottomSheetBehavior;
		//    6   12:aload_0         
		//    7   13:checkcast       #67  <Class CoordinatorLayout$c>
		//    8   16:invokevirtual   #150 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
		//    9   19:instanceof      #152 <Class BottomSheetBehavior>
		//   10   22:ireturn         
			else
				return false;
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		private boolean a(View view, FloatingActionButton floatingactionbutton)
		{
			CoordinatorLayout.c c1 = (CoordinatorLayout.c)floatingactionbutton.getLayoutParams();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #65  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
		//    2    4:checkcast       #67  <Class CoordinatorLayout$c>
		//    3    7:astore_3        
			if(!c)
		//*   4    8:aload_0         
		//*   5    9:getfield        #20  <Field boolean c>
		//*   6   12:ifne            17
				return false;
		//    7   15:iconst_0        
		//    8   16:ireturn         
			if(c1.a() != view.getId())
		//*   9   17:aload_3         
		//*  10   18:invokevirtual   #154 <Method int CoordinatorLayout$c.a()>
		//*  11   21:aload_1         
		//*  12   22:invokevirtual   #157 <Method int View.getId()>
		//*  13   25:icmpeq          30
				return false;
		//   14   28:iconst_0        
		//   15   29:ireturn         
			return floatingactionbutton.getUserSetVisibility() == 0;
		//   16   30:aload_2         
		//   17   31:invokevirtual   #160 <Method int FloatingActionButton.getUserSetVisibility()>
		//   18   34:ifeq            39
		//   19   37:iconst_0        
		//   20   38:ireturn         
		//   21   39:iconst_1        
		//   22   40:ireturn         
		}

		private boolean b(View view, FloatingActionButton floatingactionbutton)
		{
			if(!a(view, floatingactionbutton))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:aload_2         
		//*   3    3:invokespecial   #123 <Method boolean a(View, FloatingActionButton)>
		//*   4    6:ifne            11
				return false;
		//    5    9:iconst_0        
		//    6   10:ireturn         
			CoordinatorLayout.c c1 = (CoordinatorLayout.c)floatingactionbutton.getLayoutParams();
		//    7   11:aload_2         
		//    8   12:invokevirtual   #65  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
		//    9   15:checkcast       #67  <Class CoordinatorLayout$c>
		//   10   18:astore_3        
			if(view.getTop() < floatingactionbutton.getHeight() / 2 + c1.topMargin)
		//*  11   19:aload_1         
		//*  12   20:invokevirtual   #161 <Method int View.getTop()>
		//*  13   23:aload_2         
		//*  14   24:invokevirtual   #162 <Method int FloatingActionButton.getHeight()>
		//*  15   27:iconst_2        
		//*  16   28:idiv            
		//*  17   29:aload_3         
		//*  18   30:getfield        #108 <Field int CoordinatorLayout$c.topMargin>
		//*  19   33:iadd            
		//*  20   34:icmpge          49
				floatingactionbutton.b(b, false);
		//   21   37:aload_2         
		//   22   38:aload_0         
		//   23   39:getfield        #138 <Field FloatingActionButton$a b>
		//   24   42:iconst_0        
		//   25   43:invokevirtual   #141 <Method void FloatingActionButton.b(FloatingActionButton$a, boolean)>
			else
		//*  26   46:goto            58
				floatingactionbutton.a(b, false);
		//   27   49:aload_2         
		//   28   50:aload_0         
		//   29   51:getfield        #138 <Field FloatingActionButton$a b>
		//   30   54:iconst_0        
		//   31   55:invokevirtual   #143 <Method void FloatingActionButton.a(FloatingActionButton$a, boolean)>
			return true;
		//   32   58:iconst_1        
		//   33   59:ireturn         
		}

		public void a(CoordinatorLayout.c c1)
		{
			if(c1.h == 0)
		//*   0    0:aload_1         
		//*   1    1:getfield        #166 <Field int CoordinatorLayout$c.h>
		//*   2    4:ifne            13
				c1.h = 80;
		//    3    7:aload_1         
		//    4    8:bipush          80
		//    5   10:putfield        #166 <Field int CoordinatorLayout$c.h>
		//    6   13:return          
		}

		public boolean a(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, int i1)
		{
			List list = coordinatorlayout.c(((View) (floatingactionbutton)));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #170 <Method List CoordinatorLayout.c(View)>
		//    3    5:astore          6
			int k1 = list.size();
		//    4    7:aload           6
		//    5    9:invokeinterface #175 <Method int List.size()>
		//    6   14:istore          5
			int j1 = 0;
		//    7   16:iconst_0        
		//    8   17:istore          4
			do
			{
				if(j1 >= k1)
					break;
		//    9   19:iload           4
		//   10   21:iload           5
		//   11   23:icmpge          95
				View view = (View)list.get(j1);
		//   12   26:aload           6
		//   13   28:iload           4
		//   14   30:invokeinterface #179 <Method Object List.get(int)>
		//   15   35:checkcast       #146 <Class View>
		//   16   38:astore          7
				if((view instanceof AppBarLayout) ? a(coordinatorlayout, (AppBarLayout)view, floatingactionbutton) : a(view) && b(view, floatingactionbutton))
		//*  17   40:aload           7
		//*  18   42:instanceof      #133 <Class AppBarLayout>
		//*  19   45:ifeq            65
		//*  20   48:aload_0         
		//*  21   49:aload_1         
		//*  22   50:aload           7
		//*  23   52:checkcast       #133 <Class AppBarLayout>
		//*  24   55:aload_2         
		//*  25   56:invokespecial   #181 <Method boolean a(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
		//*  26   59:ifeq            86
		//*  27   62:goto            95
		//*  28   65:aload           7
		//*  29   67:invokestatic    #183 <Method boolean a(View)>
		//*  30   70:ifeq            86
		//*  31   73:aload_0         
		//*  32   74:aload           7
		//*  33   76:aload_2         
		//*  34   77:invokespecial   #185 <Method boolean b(View, FloatingActionButton)>
		//*  35   80:ifeq            86
					break;
		//   36   83:goto            95
				j1++;
		//   37   86:iload           4
		//   38   88:iconst_1        
		//   39   89:iadd            
		//   40   90:istore          4
			} while(true);
		//   41   92:goto            19
			coordinatorlayout.a(((View) (floatingactionbutton)), i1);
		//   42   95:aload_1         
		//   43   96:aload_2         
		//   44   97:iload_3         
		//   45   98:invokevirtual   #187 <Method void CoordinatorLayout.a(View, int)>
			a(coordinatorlayout, floatingactionbutton);
		//   46  101:aload_0         
		//   47  102:aload_1         
		//   48  103:aload_2         
		//   49  104:invokespecial   #189 <Method void a(CoordinatorLayout, FloatingActionButton)>
			return true;
		//   50  107:iconst_1        
		//   51  108:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, Rect rect)
		{
			coordinatorlayout = ((CoordinatorLayout) (floatingactionbutton.c));
		//    0    0:aload_2         
		//    1    1:getfield        #52  <Field Rect FloatingActionButton.c>
		//    2    4:astore_1        
			rect.set(floatingactionbutton.getLeft() + ((Rect) (coordinatorlayout)).left, floatingactionbutton.getTop() + ((Rect) (coordinatorlayout)).top, floatingactionbutton.getRight() - ((Rect) (coordinatorlayout)).right, floatingactionbutton.getBottom() - ((Rect) (coordinatorlayout)).bottom);
		//    3    5:aload_3         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #84  <Method int FloatingActionButton.getLeft()>
		//    6   10:aload_1         
		//    7   11:getfield        #90  <Field int Rect.left>
		//    8   14:iadd            
		//    9   15:aload_2         
		//   10   16:invokevirtual   #105 <Method int FloatingActionButton.getTop()>
		//   11   19:aload_1         
		//   12   20:getfield        #111 <Field int Rect.top>
		//   13   23:iadd            
		//   14   24:aload_2         
		//   15   25:invokevirtual   #70  <Method int FloatingActionButton.getRight()>
		//   16   28:aload_1         
		//   17   29:getfield        #81  <Field int Rect.right>
		//   18   32:isub            
		//   19   33:aload_2         
		//   20   34:invokevirtual   #93  <Method int FloatingActionButton.getBottom()>
		//   21   37:aload_1         
		//   22   38:getfield        #102 <Field int Rect.bottom>
		//   23   41:isub            
		//   24   42:invokevirtual   #194 <Method void Rect.set(int, int, int, int)>
			return true;
		//   25   45:iconst_1        
		//   26   46:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
		{
			if(view instanceof AppBarLayout)
		//*   0    0:aload_3         
		//*   1    1:instanceof      #133 <Class AppBarLayout>
		//*   2    4:ifeq            21
				a(coordinatorlayout, (AppBarLayout)view, floatingactionbutton);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_3         
		//    6   10:checkcast       #133 <Class AppBarLayout>
		//    7   13:aload_2         
		//    8   14:invokespecial   #181 <Method boolean a(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
		//    9   17:pop             
			else
		//*  10   18:goto            35
			if(a(view))
		//*  11   21:aload_3         
		//*  12   22:invokestatic    #183 <Method boolean a(View)>
		//*  13   25:ifeq            35
				b(view, floatingactionbutton);
		//   14   28:aload_0         
		//   15   29:aload_3         
		//   16   30:aload_2         
		//   17   31:invokespecial   #185 <Method boolean b(View, FloatingActionButton)>
		//   18   34:pop             
			return false;
		//   19   35:iconst_0        
		//   20   36:ireturn         
		}

		public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int i1)
		{
			return a(coordinatorlayout, (FloatingActionButton)view, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class FloatingActionButton>
		//    4    6:iload_3         
		//    5    7:invokevirtual   #198 <Method boolean a(CoordinatorLayout, FloatingActionButton, int)>
		//    6   10:ireturn         
		}

		public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, Rect rect)
		{
			return a(coordinatorlayout, (FloatingActionButton)view, rect);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class FloatingActionButton>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #201 <Method boolean a(CoordinatorLayout, FloatingActionButton, Rect)>
		//    6   10:ireturn         
		}

		public boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			return a(coordinatorlayout, (FloatingActionButton)view, view1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class FloatingActionButton>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #204 <Method boolean a(CoordinatorLayout, FloatingActionButton, View)>
		//    6   10:ireturn         
		}

		private Rect a;
		private a b;
		private boolean c;

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void CoordinatorLayout$Behavior()>
			c = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #20  <Field boolean c>
		//    5    9:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #24  <Method void CoordinatorLayout$Behavior(Context, AttributeSet)>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.FloatingActionButton_Behavior_Layout)));
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #30  <Field int[] android.support.design.a$k.FloatingActionButton_Behavior_Layout>
		//    7   11:invokevirtual   #36  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//    8   14:astore_1        
			c = ((TypedArray) (context)).getBoolean(android.support.design.a.k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:getstatic       #40  <Field int android.support.design.a$k.FloatingActionButton_Behavior_Layout_behavior_autoHide>
		//   12   20:iconst_1        
		//   13   21:invokevirtual   #46  <Method boolean TypedArray.getBoolean(int, boolean)>
		//   14   24:putfield        #20  <Field boolean c>
			((TypedArray) (context)).recycle();
		//   15   27:aload_1         
		//   16   28:invokevirtual   #49  <Method void TypedArray.recycle()>
		//   17   31:return          
		}
	}

	public static abstract class a
	{

		public void a(FloatingActionButton floatingactionbutton)
		{
		//    0    0:return          
		}

		public void b(FloatingActionButton floatingactionbutton)
		{
		//    0    0:return          
		}
	}

	private class b
		implements k
	{

		public float a()
		{
			return (float)a.getSizeDimension() / 2.0F;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton a>
		//    2    4:invokevirtual   #24  <Method int FloatingActionButton.getSizeDimension()>
		//    3    7:i2f             
		//    4    8:fconst_2        
		//    5    9:fdiv            
		//    6   10:freturn         
		}

		public void a(int i1, int j1, int k1, int l1)
		{
			a.c.set(i1, j1, k1, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton a>
		//    2    4:getfield        #29  <Field Rect FloatingActionButton.c>
		//    3    7:iload_1         
		//    4    8:iload_2         
		//    5    9:iload_3         
		//    6   10:iload           4
		//    7   12:invokevirtual   #34  <Method void Rect.set(int, int, int, int)>
			a.setPadding(i1 + a.a, j1 + a.a, k1 + a.a, l1 + a.a);
		//    8   15:aload_0         
		//    9   16:getfield        #15  <Field FloatingActionButton a>
		//   10   19:iload_1         
		//   11   20:aload_0         
		//   12   21:getfield        #15  <Field FloatingActionButton a>
		//   13   24:getfield        #37  <Field int FloatingActionButton.a>
		//   14   27:iadd            
		//   15   28:iload_2         
		//   16   29:aload_0         
		//   17   30:getfield        #15  <Field FloatingActionButton a>
		//   18   33:getfield        #37  <Field int FloatingActionButton.a>
		//   19   36:iadd            
		//   20   37:iload_3         
		//   21   38:aload_0         
		//   22   39:getfield        #15  <Field FloatingActionButton a>
		//   23   42:getfield        #37  <Field int FloatingActionButton.a>
		//   24   45:iadd            
		//   25   46:iload           4
		//   26   48:aload_0         
		//   27   49:getfield        #15  <Field FloatingActionButton a>
		//   28   52:getfield        #37  <Field int FloatingActionButton.a>
		//   29   55:iadd            
		//   30   56:invokevirtual   #40  <Method void FloatingActionButton.setPadding(int, int, int, int)>
		//   31   59:return          
		}

		public void a(Drawable drawable)
		{
			FloatingActionButton.a(a, drawable);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton a>
		//    2    4:aload_1         
		//    3    5:invokestatic    #44  <Method void FloatingActionButton.a(FloatingActionButton, Drawable)>
		//    4    8:return          
		}

		public boolean b()
		{
			return a.b;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton a>
		//    2    4:getfield        #48  <Field boolean FloatingActionButton.b>
		//    3    7:ireturn         
		}

		final FloatingActionButton a;

		b()
		{
			a = FloatingActionButton.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field FloatingActionButton a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public FloatingActionButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #39  <Method void FloatingActionButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public FloatingActionButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #43  <Method void FloatingActionButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public FloatingActionButton(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #44  <Method void VisibilityAwareImageButton(Context, AttributeSet, int)>
		c = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #46  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #49  <Method void Rect()>
	//    9   15:putfield        #51  <Field Rect c>
		j = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #46  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #49  <Method void Rect()>
	//   14   26:putfield        #53  <Field Rect j>
		n.a(context);
	//   15   29:aload_1         
	//   16   30:invokestatic    #57  <Method void n.a(Context)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.FloatingActionButton, i1, android.support.design.a.j.Widget_Design_FloatingActionButton)));
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:getstatic       #63  <Field int[] android.support.design.a$k.FloatingActionButton>
	//   20   38:iload_3         
	//   21   39:getstatic       #68  <Field int android.support.design.a$j.Widget_Design_FloatingActionButton>
	//   22   42:invokevirtual   #74  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   23   45:astore_1        
		d = ((TypedArray) (context)).getColorStateList(android.support.design.a.k.FloatingActionButton_backgroundTint);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getstatic       #77  <Field int android.support.design.a$k.FloatingActionButton_backgroundTint>
	//   27   51:invokevirtual   #83  <Method ColorStateList TypedArray.getColorStateList(int)>
	//   28   54:putfield        #85  <Field ColorStateList d>
		e = q.a(((TypedArray) (context)).getInt(android.support.design.a.k.FloatingActionButton_backgroundTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:getstatic       #88  <Field int android.support.design.a$k.FloatingActionButton_backgroundTintMode>
	//   32   62:iconst_m1       
	//   33   63:invokevirtual   #92  <Method int TypedArray.getInt(int, int)>
	//   34   66:aconst_null     
	//   35   67:invokestatic    #97  <Method android.graphics.PorterDuff$Mode q.a(int, android.graphics.PorterDuff$Mode)>
	//   36   70:putfield        #99  <Field android.graphics.PorterDuff$Mode e>
		g = ((TypedArray) (context)).getColor(android.support.design.a.k.FloatingActionButton_rippleColor, 0);
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:getstatic       #102 <Field int android.support.design.a$k.FloatingActionButton_rippleColor>
	//   40   78:iconst_0        
	//   41   79:invokevirtual   #105 <Method int TypedArray.getColor(int, int)>
	//   42   82:putfield        #107 <Field int g>
		h = ((TypedArray) (context)).getInt(android.support.design.a.k.FloatingActionButton_fabSize, -1);
	//   43   85:aload_0         
	//   44   86:aload_1         
	//   45   87:getstatic       #110 <Field int android.support.design.a$k.FloatingActionButton_fabSize>
	//   46   90:iconst_m1       
	//   47   91:invokevirtual   #92  <Method int TypedArray.getInt(int, int)>
	//   48   94:putfield        #112 <Field int h>
		f = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.FloatingActionButton_borderWidth, 0);
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:getstatic       #115 <Field int android.support.design.a$k.FloatingActionButton_borderWidth>
	//   52  102:iconst_0        
	//   53  103:invokevirtual   #118 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   54  106:putfield        #120 <Field int f>
		float f1 = ((TypedArray) (context)).getDimension(android.support.design.a.k.FloatingActionButton_elevation, 0.0F);
	//   55  109:aload_1         
	//   56  110:getstatic       #123 <Field int android.support.design.a$k.FloatingActionButton_elevation>
	//   57  113:fconst_0        
	//   58  114:invokevirtual   #127 <Method float TypedArray.getDimension(int, float)>
	//   59  117:fstore          4
		float f2 = ((TypedArray) (context)).getDimension(android.support.design.a.k.FloatingActionButton_pressedTranslationZ, 0.0F);
	//   60  119:aload_1         
	//   61  120:getstatic       #130 <Field int android.support.design.a$k.FloatingActionButton_pressedTranslationZ>
	//   62  123:fconst_0        
	//   63  124:invokevirtual   #127 <Method float TypedArray.getDimension(int, float)>
	//   64  127:fstore          5
		b = ((TypedArray) (context)).getBoolean(android.support.design.a.k.FloatingActionButton_useCompatPadding, false);
	//   65  129:aload_0         
	//   66  130:aload_1         
	//   67  131:getstatic       #133 <Field int android.support.design.a$k.FloatingActionButton_useCompatPadding>
	//   68  134:iconst_0        
	//   69  135:invokevirtual   #137 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   70  138:putfield        #139 <Field boolean b>
		((TypedArray) (context)).recycle();
	//   71  141:aload_1         
	//   72  142:invokevirtual   #142 <Method void TypedArray.recycle()>
		k = new i(((android.widget.ImageView) (this)));
	//   73  145:aload_0         
	//   74  146:new             #144 <Class i>
	//   75  149:dup             
	//   76  150:aload_0         
	//   77  151:invokespecial   #147 <Method void i(android.widget.ImageView)>
	//   78  154:putfield        #149 <Field i k>
		k.a(attributeset, i1);
	//   79  157:aload_0         
	//   80  158:getfield        #149 <Field i k>
	//   81  161:aload_2         
	//   82  162:iload_3         
	//   83  163:invokevirtual   #152 <Method void i.a(AttributeSet, int)>
		i = (int)getResources().getDimension(android.support.design.a.d.design_fab_image_size);
	//   84  166:aload_0         
	//   85  167:aload_0         
	//   86  168:invokevirtual   #156 <Method Resources getResources()>
	//   87  171:getstatic       #161 <Field int android.support.design.a$d.design_fab_image_size>
	//   88  174:invokevirtual   #166 <Method float Resources.getDimension(int)>
	//   89  177:f2i             
	//   90  178:putfield        #168 <Field int i>
		getImpl().a(d, e, g, f);
	//   91  181:aload_0         
	//   92  182:invokespecial   #172 <Method h getImpl()>
	//   93  185:aload_0         
	//   94  186:getfield        #85  <Field ColorStateList d>
	//   95  189:aload_0         
	//   96  190:getfield        #99  <Field android.graphics.PorterDuff$Mode e>
	//   97  193:aload_0         
	//   98  194:getfield        #107 <Field int g>
	//   99  197:aload_0         
	//  100  198:getfield        #120 <Field int f>
	//  101  201:invokevirtual   #177 <Method void h.a(ColorStateList, android.graphics.PorterDuff$Mode, int, int)>
		getImpl().a(f1);
	//  102  204:aload_0         
	//  103  205:invokespecial   #172 <Method h getImpl()>
	//  104  208:fload           4
	//  105  210:invokevirtual   #180 <Method void h.a(float)>
		getImpl().b(f2);
	//  106  213:aload_0         
	//  107  214:invokespecial   #172 <Method h getImpl()>
	//  108  217:fload           5
	//  109  219:invokevirtual   #182 <Method void h.b(float)>
	//  110  222:return          
	}

	private int a(int i1)
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method Resources getResources()>
	//    2    4:astore_2        
		if(i1 != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          32
		{
			if(i1 != 1)
	//*   6   10:iload_1         
	//*   7   11:iconst_1        
	//*   8   12:icmpeq          25
				i1 = android.support.design.a.d.design_fab_size_normal;
	//    9   15:getstatic       #186 <Field int android.support.design.a$d.design_fab_size_normal>
	//   10   18:istore_1        
			else
	//*  11   19:aload_2         
	//*  12   20:iload_1         
	//*  13   21:invokevirtual   #188 <Method int Resources.getDimensionPixelSize(int)>
	//*  14   24:ireturn         
				i1 = android.support.design.a.d.design_fab_size_mini;
	//   15   25:getstatic       #191 <Field int android.support.design.a$d.design_fab_size_mini>
	//   16   28:istore_1        
			return resources.getDimensionPixelSize(i1);
		}
	//*  17   29:goto            19
		if(Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470)
	//*  18   32:aload_2         
	//*  19   33:invokevirtual   #195 <Method Configuration Resources.getConfiguration()>
	//*  20   36:getfield        #200 <Field int Configuration.screenWidthDp>
	//*  21   39:aload_2         
	//*  22   40:invokevirtual   #195 <Method Configuration Resources.getConfiguration()>
	//*  23   43:getfield        #203 <Field int Configuration.screenHeightDp>
	//*  24   46:invokestatic    #208 <Method int Math.max(int, int)>
	//*  25   49:sipush          470
	//*  26   52:icmpge          61
			return a(1);
	//   27   55:aload_0         
	//   28   56:iconst_1        
	//   29   57:invokespecial   #210 <Method int a(int)>
	//   30   60:ireturn         
		else
			return a(0);
	//   31   61:aload_0         
	//   32   62:iconst_0        
	//   33   63:invokespecial   #210 <Method int a(int)>
	//   34   66:ireturn         
	}

	private static int a(int i1, int j1)
	{
		int k1 = android.view.View.MeasureSpec.getMode(j1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #215 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
		int l1 = android.view.View.MeasureSpec.getSize(j1);
	//    3    5:iload_1         
	//    4    6:invokestatic    #218 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_3        
		if(k1 != 0x80000000)
	//*   6   10:iload_2         
	//*   7   11:ldc1            #219 <Int 0x80000000>
	//*   8   13:icmpeq          32
		{
			j1 = i1;
	//    9   16:iload_0         
	//   10   17:istore_1        
			if(k1 != 0)
	//*  11   18:iload_2         
	//*  12   19:ifeq            38
				if(k1 != 0x40000000)
	//*  13   22:iload_2         
	//*  14   23:ldc1            #220 <Int 0x40000000>
	//*  15   25:icmpeq          30
					return i1;
	//   16   28:iload_0         
	//   17   29:ireturn         
				else
					return l1;
	//   18   30:iload_3         
	//   19   31:ireturn         
		} else
		{
			j1 = Math.min(i1, l1);
	//   20   32:iload_0         
	//   21   33:iload_3         
	//   22   34:invokestatic    #223 <Method int Math.min(int, int)>
	//   23   37:istore_1        
		}
		return j1;
	//   24   38:iload_1         
	//   25   39:ireturn         
	}

	private h.c a(a a1)
	{
		if(a1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new h.c(a1) {

				public void a()
				{
					a.a(b);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field FloatingActionButton$a a>
				//    2    4:aload_0         
				//    3    5:getfield        #18  <Field FloatingActionButton b>
				//    4    8:invokevirtual   #29  <Method void FloatingActionButton$a.a(FloatingActionButton)>
				//    5   11:return          
				}

				public void b()
				{
					a.b(b);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field FloatingActionButton$a a>
				//    2    4:aload_0         
				//    3    5:getfield        #18  <Field FloatingActionButton b>
				//    4    8:invokevirtual   #31  <Method void FloatingActionButton$a.b(FloatingActionButton)>
				//    5   11:return          
				}

				final a a;
				final FloatingActionButton b;

			
			{
				b = FloatingActionButton.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field FloatingActionButton b>
				a = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field FloatingActionButton$a a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//    4    6:new             #6   <Class FloatingActionButton$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #227 <Method void FloatingActionButton$1(FloatingActionButton, FloatingActionButton$a)>
	//    9   15:areturn         
	}

	private h a()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #232 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          25
			return ((h) (new android.support.design.widget.i(((VisibilityAwareImageButton) (this)), ((k) (new b())))));
	//    3    8:new             #234 <Class android.support.design.widget.i>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:new             #14  <Class FloatingActionButton$b>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #237 <Method void FloatingActionButton$b(FloatingActionButton)>
	//   10   21:invokespecial   #240 <Method void android.support.design.widget.i(VisibilityAwareImageButton, k)>
	//   11   24:areturn         
		else
			return new h(((VisibilityAwareImageButton) (this)), ((k) (new b())));
	//   12   25:new             #174 <Class h>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:new             #14  <Class FloatingActionButton$b>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:invokespecial   #237 <Method void FloatingActionButton$b(FloatingActionButton)>
	//   19   38:invokespecial   #241 <Method void h(VisibilityAwareImageButton, k)>
	//   20   41:areturn         
	}

	static void a(FloatingActionButton floatingactionbutton, Drawable drawable)
	{
		((VisibilityAwareImageButton) (floatingactionbutton)).VisibilityAwareImageButton.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #246 <Method void VisibilityAwareImageButton.setBackgroundDrawable(Drawable)>
	//    3    5:return          
	}

	private h getImpl()
	{
		if(l == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #248 <Field h l>
	//*   2    4:ifnonnull       15
			l = a();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #250 <Method h a()>
	//    6   12:putfield        #248 <Field h l>
		return l;
	//    7   15:aload_0         
	//    8   16:getfield        #248 <Field h l>
	//    9   19:areturn         
	}

	void a(a a1, boolean flag)
	{
		getImpl().b(a(a1), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method h getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #253 <Method h$c a(FloatingActionButton$a)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #256 <Method void h.b(h$c, boolean)>
	//    7   13:return          
	}

	public boolean a(Rect rect)
	{
		if(s.x(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #263 <Method boolean s.x(View)>
	//*   2    4:ifeq            87
		{
			rect.set(0, 0, getWidth(), getHeight());
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #267 <Method int getWidth()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #270 <Method int getHeight()>
	//   10   18:invokevirtual   #274 <Method void Rect.set(int, int, int, int)>
			rect.left = rect.left + c.left;
	//   11   21:aload_1         
	//   12   22:aload_1         
	//   13   23:getfield        #277 <Field int Rect.left>
	//   14   26:aload_0         
	//   15   27:getfield        #51  <Field Rect c>
	//   16   30:getfield        #277 <Field int Rect.left>
	//   17   33:iadd            
	//   18   34:putfield        #277 <Field int Rect.left>
			rect.top = rect.top + c.top;
	//   19   37:aload_1         
	//   20   38:aload_1         
	//   21   39:getfield        #280 <Field int Rect.top>
	//   22   42:aload_0         
	//   23   43:getfield        #51  <Field Rect c>
	//   24   46:getfield        #280 <Field int Rect.top>
	//   25   49:iadd            
	//   26   50:putfield        #280 <Field int Rect.top>
			rect.right = rect.right - c.right;
	//   27   53:aload_1         
	//   28   54:aload_1         
	//   29   55:getfield        #283 <Field int Rect.right>
	//   30   58:aload_0         
	//   31   59:getfield        #51  <Field Rect c>
	//   32   62:getfield        #283 <Field int Rect.right>
	//   33   65:isub            
	//   34   66:putfield        #283 <Field int Rect.right>
			rect.bottom = rect.bottom - c.bottom;
	//   35   69:aload_1         
	//   36   70:aload_1         
	//   37   71:getfield        #286 <Field int Rect.bottom>
	//   38   74:aload_0         
	//   39   75:getfield        #51  <Field Rect c>
	//   40   78:getfield        #286 <Field int Rect.bottom>
	//   41   81:isub            
	//   42   82:putfield        #286 <Field int Rect.bottom>
			return true;
	//   43   85:iconst_1        
	//   44   86:ireturn         
		} else
		{
			return false;
	//   45   87:iconst_0        
	//   46   88:ireturn         
		}
	}

	void b(a a1, boolean flag)
	{
		getImpl().a(a(a1), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method h getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #253 <Method h$c a(FloatingActionButton$a)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #288 <Method void h.a(h$c, boolean)>
	//    7   13:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #291 <Method void VisibilityAwareImageButton.drawableStateChanged()>
		getImpl().a(getDrawableState());
	//    2    4:aload_0         
	//    3    5:invokespecial   #172 <Method h getImpl()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #295 <Method int[] getDrawableState()>
	//    6   12:invokevirtual   #298 <Method void h.a(int[])>
	//    7   15:return          
	}

	public ColorStateList getBackgroundTintList()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ColorStateList d>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getBackgroundTintMode()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field android.graphics.PorterDuff$Mode e>
	//    2    4:areturn         
	}

	public float getCompatElevation()
	{
		return getImpl().a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method h getImpl()>
	//    2    4:invokevirtual   #306 <Method float h.a()>
	//    3    7:freturn         
	}

	public Drawable getContentBackground()
	{
		return getImpl().c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method h getImpl()>
	//    2    4:invokevirtual   #310 <Method Drawable h.c()>
	//    3    7:areturn         
	}

	public int getRippleColor()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field int g>
	//    2    4:ireturn         
	}

	public int getSize()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int h>
	//    2    4:ireturn         
	}

	int getSizeDimension()
	{
		return a(h);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #112 <Field int h>
	//    3    5:invokespecial   #210 <Method int a(int)>
	//    4    8:ireturn         
	}

	public boolean getUseCompatPadding()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field boolean b>
	//    2    4:ireturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #317 <Method void VisibilityAwareImageButton.jumpDrawablesToCurrentState()>
		getImpl().b();
	//    2    4:aload_0         
	//    3    5:invokespecial   #172 <Method h getImpl()>
	//    4    8:invokevirtual   #319 <Method void h.b()>
	//    5   11:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #322 <Method void VisibilityAwareImageButton.onAttachedToWindow()>
		getImpl().f();
	//    2    4:aload_0         
	//    3    5:invokespecial   #172 <Method h getImpl()>
	//    4    8:invokevirtual   #324 <Method void h.f()>
	//    5   11:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #327 <Method void VisibilityAwareImageButton.onDetachedFromWindow()>
		getImpl().g();
	//    2    4:aload_0         
	//    3    5:invokespecial   #172 <Method h getImpl()>
	//    4    8:invokevirtual   #329 <Method void h.g()>
	//    5   11:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		int k1 = getSizeDimension();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #333 <Method int getSizeDimension()>
	//    2    4:istore_3        
		a = (k1 - i) / 2;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #168 <Field int i>
	//    7   11:isub            
	//    8   12:iconst_2        
	//    9   13:idiv            
	//   10   14:putfield        #335 <Field int a>
		getImpl().e();
	//   11   17:aload_0         
	//   12   18:invokespecial   #172 <Method h getImpl()>
	//   13   21:invokevirtual   #337 <Method void h.e()>
		i1 = Math.min(a(k1, i1), a(k1, j1));
	//   14   24:iload_3         
	//   15   25:iload_1         
	//   16   26:invokestatic    #339 <Method int a(int, int)>
	//   17   29:iload_3         
	//   18   30:iload_2         
	//   19   31:invokestatic    #339 <Method int a(int, int)>
	//   20   34:invokestatic    #223 <Method int Math.min(int, int)>
	//   21   37:istore_1        
		setMeasuredDimension(c.left + i1 + c.right, i1 + c.top + c.bottom);
	//   22   38:aload_0         
	//   23   39:aload_0         
	//   24   40:getfield        #51  <Field Rect c>
	//   25   43:getfield        #277 <Field int Rect.left>
	//   26   46:iload_1         
	//   27   47:iadd            
	//   28   48:aload_0         
	//   29   49:getfield        #51  <Field Rect c>
	//   30   52:getfield        #283 <Field int Rect.right>
	//   31   55:iadd            
	//   32   56:iload_1         
	//   33   57:aload_0         
	//   34   58:getfield        #51  <Field Rect c>
	//   35   61:getfield        #280 <Field int Rect.top>
	//   36   64:iadd            
	//   37   65:aload_0         
	//   38   66:getfield        #51  <Field Rect c>
	//   39   69:getfield        #286 <Field int Rect.bottom>
	//   40   72:iadd            
	//   41   73:invokevirtual   #342 <Method void setMeasuredDimension(int, int)>
	//   42   76:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0 && a(j) && !j.contains((int)motionevent.getX(), (int)motionevent.getY()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #349 <Method int MotionEvent.getAction()>
	//*   2    4:ifeq            10
	//*   3    7:goto            43
	//*   4   10:aload_0         
	//*   5   11:aload_0         
	//*   6   12:getfield        #53  <Field Rect j>
	//*   7   15:invokevirtual   #351 <Method boolean a(Rect)>
	//*   8   18:ifeq            43
	//*   9   21:aload_0         
	//*  10   22:getfield        #53  <Field Rect j>
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #354 <Method float MotionEvent.getX()>
	//*  13   29:f2i             
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #357 <Method float MotionEvent.getY()>
	//*  16   34:f2i             
	//*  17   35:invokevirtual   #361 <Method boolean Rect.contains(int, int)>
	//*  18   38:ifne            43
			return false;
	//   19   41:iconst_0        
	//   20   42:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:invokespecial   #363 <Method boolean VisibilityAwareImageButton.onTouchEvent(MotionEvent)>
	//   24   48:ireturn         
	}

	public void setBackgroundColor(int i1)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc2            #366 <String "FloatingActionButton">
	//    1    3:ldc2            #368 <String "Setting a custom background is not supported.">
	//    2    6:invokestatic    #373 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc2            #366 <String "FloatingActionButton">
	//    1    3:ldc2            #368 <String "Setting a custom background is not supported.">
	//    2    6:invokestatic    #373 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void setBackgroundResource(int i1)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc2            #366 <String "FloatingActionButton">
	//    1    3:ldc2            #368 <String "Setting a custom background is not supported.">
	//    2    6:invokestatic    #373 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void setBackgroundTintList(ColorStateList colorstatelist)
	{
		if(d != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field ColorStateList d>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			d = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #85  <Field ColorStateList d>
			getImpl().a(colorstatelist);
	//    7   13:aload_0         
	//    8   14:invokespecial   #172 <Method h getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #378 <Method void h.a(ColorStateList)>
		}
	//   11   21:return          
	}

	public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(e != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field android.graphics.PorterDuff$Mode e>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			e = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #99  <Field android.graphics.PorterDuff$Mode e>
			getImpl().a(mode);
	//    7   13:aload_0         
	//    8   14:invokespecial   #172 <Method h getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #382 <Method void h.a(android.graphics.PorterDuff$Mode)>
		}
	//   11   21:return          
	}

	public void setCompatElevation(float f1)
	{
		getImpl().a(f1);
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method h getImpl()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #180 <Method void h.a(float)>
	//    4    8:return          
	}

	public void setImageResource(int i1)
	{
		k.a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field i k>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #386 <Method void i.a(int)>
	//    4    8:return          
	}

	public void setRippleColor(int i1)
	{
		if(g != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field int g>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          21
		{
			g = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #107 <Field int g>
			getImpl().a(i1);
	//    7   13:aload_0         
	//    8   14:invokespecial   #172 <Method h getImpl()>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #388 <Method void h.a(int)>
		}
	//   11   21:return          
	}

	public void setSize(int i1)
	{
		if(i1 != h)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #112 <Field int h>
	//*   3    5:icmpeq          17
		{
			h = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #112 <Field int h>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #392 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setUseCompatPadding(boolean flag)
	{
		if(b != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field boolean b>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          20
		{
			b = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #139 <Field boolean b>
			getImpl().d();
	//    7   13:aload_0         
	//    8   14:invokespecial   #172 <Method h getImpl()>
	//    9   17:invokevirtual   #396 <Method void h.d()>
		}
	//   10   20:return          
	}

	public volatile void setVisibility(int i1)
	{
		super.setVisibility(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #399 <Method void VisibilityAwareImageButton.setVisibility(int)>
	//    3    5:return          
	}

	int a;
	boolean b;
	final Rect c;
	private ColorStateList d;
	private android.graphics.PorterDuff.Mode e;
	private int f;
	private int g;
	private int h;
	private int i;
	private final Rect j;
	private i k;
	private h l;
}
