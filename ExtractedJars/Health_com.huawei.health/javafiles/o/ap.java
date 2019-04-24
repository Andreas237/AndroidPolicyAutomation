// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.view.*;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package o:
//			aw, am

class ap
	implements aw
{
	static class d extends ViewGroup
	{

		private void d(int ai[])
		{
			int ai1[] = new int[2];
		//    0    0:iconst_2        
		//    1    1:newarray        int[]
		//    2    3:astore_2        
			int ai2[] = new int[2];
		//    3    4:iconst_2        
		//    4    5:newarray        int[]
		//    5    7:astore_3        
			ViewGroup viewgroup = (ViewGroup)getParent();
		//    6    8:aload_0         
		//    7    9:invokevirtual   #76  <Method ViewParent getParent()>
		//    8   12:checkcast       #4   <Class ViewGroup>
		//    9   15:astore          4
			a.getLocationOnScreen(ai1);
		//   10   17:aload_0         
		//   11   18:getfield        #49  <Field ViewGroup a>
		//   12   21:aload_2         
		//   13   22:invokevirtual   #79  <Method void ViewGroup.getLocationOnScreen(int[])>
			e.getLocationOnScreen(ai2);
		//   14   25:aload_0         
		//   15   26:getfield        #51  <Field View e>
		//   16   29:aload_3         
		//   17   30:invokevirtual   #82  <Method void View.getLocationOnScreen(int[])>
			ai[0] = ai2[0] - ai1[0];
		//   18   33:aload_1         
		//   19   34:iconst_0        
		//   20   35:aload_3         
		//   21   36:iconst_0        
		//   22   37:iaload          
		//   23   38:aload_2         
		//   24   39:iconst_0        
		//   25   40:iaload          
		//   26   41:isub            
		//   27   42:iastore         
			ai[1] = ai2[1] - ai1[1];
		//   28   43:aload_1         
		//   29   44:iconst_1        
		//   30   45:aload_3         
		//   31   46:iconst_1        
		//   32   47:iaload          
		//   33   48:aload_2         
		//   34   49:iconst_1        
		//   35   50:iaload          
		//   36   51:isub            
		//   37   52:iastore         
		//   38   53:return          
		}

		public void b(Drawable drawable)
		{
			if(d == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field ArrayList d>
		//*   2    4:ifnonnull       18
				d = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #85  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #87  <Method void ArrayList()>
		//    7   15:putfield        #47  <Field ArrayList d>
			if(!d.contains(((Object) (drawable))))
		//*   8   18:aload_0         
		//*   9   19:getfield        #47  <Field ArrayList d>
		//*  10   22:aload_1         
		//*  11   23:invokevirtual   #91  <Method boolean ArrayList.contains(Object)>
		//*  12   26:ifne            51
			{
				d.add(((Object) (drawable)));
		//   13   29:aload_0         
		//   14   30:getfield        #47  <Field ArrayList d>
		//   15   33:aload_1         
		//   16   34:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
		//   17   37:pop             
				invalidate(drawable.getBounds());
		//   18   38:aload_0         
		//   19   39:aload_1         
		//   20   40:invokevirtual   #100 <Method Rect Drawable.getBounds()>
		//   21   43:invokevirtual   #104 <Method void invalidate(Rect)>
				drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
		//   22   46:aload_1         
		//   23   47:aload_0         
		//   24   48:invokevirtual   #108 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			}
		//   25   51:return          
		}

		public void c(Drawable drawable)
		{
			if(d != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field ArrayList d>
		//*   2    4:ifnull          29
			{
				d.remove(((Object) (drawable)));
		//    3    7:aload_0         
		//    4    8:getfield        #47  <Field ArrayList d>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #111 <Method boolean ArrayList.remove(Object)>
		//    7   15:pop             
				invalidate(drawable.getBounds());
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #100 <Method Rect Drawable.getBounds()>
		//   11   21:invokevirtual   #104 <Method void invalidate(Rect)>
				drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
		//   12   24:aload_1         
		//   13   25:aconst_null     
		//   14   26:invokevirtual   #108 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			}
		//   15   29:return          
		}

		public void c(View view)
		{
			super.removeView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #114 <Method void ViewGroup.removeView(View)>
			if(d())
		//*   3    5:aload_0         
		//*   4    6:invokevirtual   #117 <Method boolean d()>
		//*   5    9:ifeq            20
				a.removeView(((View) (this)));
		//    6   12:aload_0         
		//    7   13:getfield        #49  <Field ViewGroup a>
		//    8   16:aload_0         
		//    9   17:invokevirtual   #114 <Method void ViewGroup.removeView(View)>
		//   10   20:return          
		}

		boolean d()
		{
			return getChildCount() == 0 && (d == null || d.size() == 0);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #120 <Method int getChildCount()>
		//    2    4:ifne            26
		//    3    7:aload_0         
		//    4    8:getfield        #47  <Field ArrayList d>
		//    5   11:ifnull          24
		//    6   14:aload_0         
		//    7   15:getfield        #47  <Field ArrayList d>
		//    8   18:invokevirtual   #123 <Method int ArrayList.size()>
		//    9   21:ifne            26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		protected void dispatchDraw(Canvas canvas)
		{
			int ai[] = new int[2];
		//    0    0:iconst_2        
		//    1    1:newarray        int[]
		//    2    3:astore          4
			int ai1[] = new int[2];
		//    3    5:iconst_2        
		//    4    6:newarray        int[]
		//    5    8:astore          5
			ViewGroup viewgroup = (ViewGroup)getParent();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #76  <Method ViewParent getParent()>
		//    8   14:checkcast       #4   <Class ViewGroup>
		//    9   17:astore          6
			a.getLocationOnScreen(ai);
		//   10   19:aload_0         
		//   11   20:getfield        #49  <Field ViewGroup a>
		//   12   23:aload           4
		//   13   25:invokevirtual   #79  <Method void ViewGroup.getLocationOnScreen(int[])>
			e.getLocationOnScreen(ai1);
		//   14   28:aload_0         
		//   15   29:getfield        #51  <Field View e>
		//   16   32:aload           5
		//   17   34:invokevirtual   #82  <Method void View.getLocationOnScreen(int[])>
			canvas.translate(ai1[0] - ai[0], ai1[1] - ai[1]);
		//   18   37:aload_1         
		//   19   38:aload           5
		//   20   40:iconst_0        
		//   21   41:iaload          
		//   22   42:aload           4
		//   23   44:iconst_0        
		//   24   45:iaload          
		//   25   46:isub            
		//   26   47:i2f             
		//   27   48:aload           5
		//   28   50:iconst_1        
		//   29   51:iaload          
		//   30   52:aload           4
		//   31   54:iconst_1        
		//   32   55:iaload          
		//   33   56:isub            
		//   34   57:i2f             
		//   35   58:invokevirtual   #131 <Method void Canvas.translate(float, float)>
			canvas.clipRect(new Rect(0, 0, e.getWidth(), e.getHeight()));
		//   36   61:aload_1         
		//   37   62:new             #33  <Class Rect>
		//   38   65:dup             
		//   39   66:iconst_0        
		//   40   67:iconst_0        
		//   41   68:aload_0         
		//   42   69:getfield        #51  <Field View e>
		//   43   72:invokevirtual   #132 <Method int View.getWidth()>
		//   44   75:aload_0         
		//   45   76:getfield        #51  <Field View e>
		//   46   79:invokevirtual   #133 <Method int View.getHeight()>
		//   47   82:invokespecial   #136 <Method void Rect(int, int, int, int)>
		//   48   85:invokevirtual   #140 <Method boolean Canvas.clipRect(Rect)>
		//   49   88:pop             
			super.dispatchDraw(canvas);
		//   50   89:aload_0         
		//   51   90:aload_1         
		//   52   91:invokespecial   #142 <Method void ViewGroup.dispatchDraw(Canvas)>
			int i;
			if(d == null)
		//*  53   94:aload_0         
		//*  54   95:getfield        #47  <Field ArrayList d>
		//*  55   98:ifnonnull       106
				i = 0;
		//   56  101:iconst_0        
		//   57  102:istore_2        
			else
		//*  58  103:goto            114
				i = d.size();
		//   59  106:aload_0         
		//   60  107:getfield        #47  <Field ArrayList d>
		//   61  110:invokevirtual   #123 <Method int ArrayList.size()>
		//   62  113:istore_2        
			for(int j = 0; j < i; j++)
		//*  63  114:iconst_0        
		//*  64  115:istore_3        
		//*  65  116:iload_3         
		//*  66  117:iload_2         
		//*  67  118:icmpge          143
				((Drawable)d.get(j)).draw(canvas);
		//   68  121:aload_0         
		//   69  122:getfield        #47  <Field ArrayList d>
		//   70  125:iload_3         
		//   71  126:invokevirtual   #146 <Method Object ArrayList.get(int)>
		//   72  129:checkcast       #96  <Class Drawable>
		//   73  132:aload_1         
		//   74  133:invokevirtual   #149 <Method void Drawable.draw(Canvas)>

		//   75  136:iload_3         
		//   76  137:iconst_1        
		//   77  138:iadd            
		//   78  139:istore_3        
		//*  79  140:goto            116
		//   80  143:return          
		}

		public boolean dispatchTouchEvent(MotionEvent motionevent)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void e(View view)
		{
			if(view.getParent() instanceof ViewGroup)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #152 <Method ViewParent View.getParent()>
		//*   2    4:instanceof      #4   <Class ViewGroup>
		//*   3    7:ifeq            104
			{
				ViewGroup viewgroup = (ViewGroup)view.getParent();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #152 <Method ViewParent View.getParent()>
		//    6   14:checkcast       #4   <Class ViewGroup>
		//    7   17:astore_2        
				if(viewgroup != a && viewgroup.getParent() != null && ViewCompat.isAttachedToWindow(((View) (viewgroup))))
		//*   8   18:aload_2         
		//*   9   19:aload_0         
		//*  10   20:getfield        #49  <Field ViewGroup a>
		//*  11   23:if_acmpeq       87
		//*  12   26:aload_2         
		//*  13   27:invokevirtual   #153 <Method ViewParent ViewGroup.getParent()>
		//*  14   30:ifnull          87
		//*  15   33:aload_2         
		//*  16   34:invokestatic    #159 <Method boolean ViewCompat.isAttachedToWindow(View)>
		//*  17   37:ifeq            87
				{
					int ai[] = new int[2];
		//   18   40:iconst_2        
		//   19   41:newarray        int[]
		//   20   43:astore_3        
					int ai1[] = new int[2];
		//   21   44:iconst_2        
		//   22   45:newarray        int[]
		//   23   47:astore          4
					viewgroup.getLocationOnScreen(ai);
		//   24   49:aload_2         
		//   25   50:aload_3         
		//   26   51:invokevirtual   #79  <Method void ViewGroup.getLocationOnScreen(int[])>
					a.getLocationOnScreen(ai1);
		//   27   54:aload_0         
		//   28   55:getfield        #49  <Field ViewGroup a>
		//   29   58:aload           4
		//   30   60:invokevirtual   #79  <Method void ViewGroup.getLocationOnScreen(int[])>
					ViewCompat.offsetLeftAndRight(view, ai[0] - ai1[0]);
		//   31   63:aload_1         
		//   32   64:aload_3         
		//   33   65:iconst_0        
		//   34   66:iaload          
		//   35   67:aload           4
		//   36   69:iconst_0        
		//   37   70:iaload          
		//   38   71:isub            
		//   39   72:invokestatic    #163 <Method void ViewCompat.offsetLeftAndRight(View, int)>
					ViewCompat.offsetTopAndBottom(view, ai[1] - ai1[1]);
		//   40   75:aload_1         
		//   41   76:aload_3         
		//   42   77:iconst_1        
		//   43   78:iaload          
		//   44   79:aload           4
		//   45   81:iconst_1        
		//   46   82:iaload          
		//   47   83:isub            
		//   48   84:invokestatic    #166 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				}
				viewgroup.removeView(view);
		//   49   87:aload_2         
		//   50   88:aload_1         
		//   51   89:invokevirtual   #114 <Method void ViewGroup.removeView(View)>
				if(view.getParent() != null)
		//*  52   92:aload_1         
		//*  53   93:invokevirtual   #152 <Method ViewParent View.getParent()>
		//*  54   96:ifnull          104
					viewgroup.removeView(view);
		//   55   99:aload_2         
		//   56  100:aload_1         
		//   57  101:invokevirtual   #114 <Method void ViewGroup.removeView(View)>
			}
			super.addView(view, getChildCount() - 1);
		//   58  104:aload_0         
		//   59  105:aload_1         
		//   60  106:aload_0         
		//   61  107:invokevirtual   #120 <Method int getChildCount()>
		//   62  110:iconst_1        
		//   63  111:isub            
		//   64  112:invokespecial   #168 <Method void ViewGroup.addView(View, int)>
		//   65  115:return          
		}

		public ViewParent invalidateChildInParent(int ai[], Rect rect)
		{
			if(a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #49  <Field ViewGroup a>
		//*   2    4:ifnull          66
			{
				rect.offset(ai[0], ai[1]);
		//    3    7:aload_2         
		//    4    8:aload_1         
		//    5    9:iconst_0        
		//    6   10:iaload          
		//    7   11:aload_1         
		//    8   12:iconst_1        
		//    9   13:iaload          
		//   10   14:invokevirtual   #174 <Method void Rect.offset(int, int)>
				if(a instanceof ViewGroup)
		//*  11   17:aload_0         
		//*  12   18:getfield        #49  <Field ViewGroup a>
		//*  13   21:instanceof      #4   <Class ViewGroup>
		//*  14   24:ifeq            61
				{
					ai[0] = 0;
		//   15   27:aload_1         
		//   16   28:iconst_0        
		//   17   29:iconst_0        
		//   18   30:iastore         
					ai[1] = 0;
		//   19   31:aload_1         
		//   20   32:iconst_1        
		//   21   33:iconst_0        
		//   22   34:iastore         
					int ai1[] = new int[2];
		//   23   35:iconst_2        
		//   24   36:newarray        int[]
		//   25   38:astore_3        
					d(ai1);
		//   26   39:aload_0         
		//   27   40:aload_3         
		//   28   41:invokespecial   #176 <Method void d(int[])>
					rect.offset(ai1[0], ai1[1]);
		//   29   44:aload_2         
		//   30   45:aload_3         
		//   31   46:iconst_0        
		//   32   47:iaload          
		//   33   48:aload_3         
		//   34   49:iconst_1        
		//   35   50:iaload          
		//   36   51:invokevirtual   #174 <Method void Rect.offset(int, int)>
					return super.invalidateChildInParent(ai, rect);
		//   37   54:aload_0         
		//   38   55:aload_1         
		//   39   56:aload_2         
		//   40   57:invokespecial   #178 <Method ViewParent ViewGroup.invalidateChildInParent(int[], Rect)>
		//   41   60:areturn         
				}
				invalidate(rect);
		//   42   61:aload_0         
		//   43   62:aload_2         
		//   44   63:invokevirtual   #104 <Method void invalidate(Rect)>
			}
			return null;
		//   45   66:aconst_null     
		//   46   67:areturn         
		}

		public void invalidateDrawable(Drawable drawable)
		{
			invalidate(drawable.getBounds());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method Rect Drawable.getBounds()>
		//    3    5:invokevirtual   #104 <Method void invalidate(Rect)>
		//    4    8:return          
		}

		protected void onLayout(boolean flag, int i, int j, int k, int l)
		{
		//    0    0:return          
		}

		protected boolean verifyDrawable(Drawable drawable)
		{
			return super.verifyDrawable(drawable) || d != null && d.contains(((Object) (drawable)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #185 <Method boolean ViewGroup.verifyDrawable(Drawable)>
		//    3    5:ifne            26
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field ArrayList d>
		//    6   12:ifnull          28
		//    7   15:aload_0         
		//    8   16:getfield        #47  <Field ArrayList d>
		//    9   19:aload_1         
		//   10   20:invokevirtual   #91  <Method boolean ArrayList.contains(Object)>
		//   11   23:ifeq            28
		//   12   26:iconst_1        
		//   13   27:ireturn         
		//   14   28:iconst_0        
		//   15   29:ireturn         
		}

		static Method b;
		ViewGroup a;
		ap c;
		ArrayList d;
		View e;

		static 
		{
			try
			{
				b = ((Class) (android/view/ViewGroup)).getDeclaredMethod("invalidateChildInParentFast", new Class[] {
					Integer.TYPE, Integer.TYPE, android/graphics/Rect
				});
		//    0    0:ldc1            #4   <Class ViewGroup>
		//    1    2:ldc1            #23  <String "invalidateChildInParentFast">
		//    2    4:iconst_3        
		//    3    5:anewarray       Class[]
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:getstatic       #31  <Field Class Integer.TYPE>
		//    7   13:aastore         
		//    8   14:dup             
		//    9   15:iconst_1        
		//   10   16:getstatic       #31  <Field Class Integer.TYPE>
		//   11   19:aastore         
		//   12   20:dup             
		//   13   21:iconst_2        
		//   14   22:ldc1            #33  <Class Rect>
		//   15   24:aastore         
		//   16   25:invokevirtual   #37  <Method Method Class.getDeclaredMethod(String, Class[])>
		//   17   28:putstatic       #39  <Field Method b>
		//   18   31:return          
			}
			catch(NoSuchMethodException nosuchmethodexception) { }
		//   19   32:astore_0        
		//*  20   33:return          
		}

		d(Context context, ViewGroup viewgroup, View view, ap ap1)
		{
			super(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #45  <Method void ViewGroup(Context)>
			d = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #47  <Field ArrayList d>
			a = viewgroup;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #49  <Field ViewGroup a>
			e = view;
		//    9   15:aload_0         
		//   10   16:aload_3         
		//   11   17:putfield        #51  <Field View e>
			setRight(viewgroup.getWidth());
		//   12   20:aload_0         
		//   13   21:aload_2         
		//   14   22:invokevirtual   #55  <Method int ViewGroup.getWidth()>
		//   15   25:invokevirtual   #59  <Method void setRight(int)>
			setBottom(viewgroup.getHeight());
		//   16   28:aload_0         
		//   17   29:aload_2         
		//   18   30:invokevirtual   #62  <Method int ViewGroup.getHeight()>
		//   19   33:invokevirtual   #65  <Method void setBottom(int)>
			viewgroup.addView(((View) (this)));
		//   20   36:aload_2         
		//   21   37:aload_0         
		//   22   38:invokevirtual   #69  <Method void ViewGroup.addView(View)>
			c = ap1;
		//   23   41:aload_0         
		//   24   42:aload           4
		//   25   44:putfield        #71  <Field ap c>
		//   26   47:return          
		}
	}


	ap(Context context, ViewGroup viewgroup, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		c = new d(context, viewgroup, view, this);
	//    2    4:aload_0         
	//    3    5:new             #8   <Class ap$d>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload_0         
	//    9   13:invokespecial   #22  <Method void ap$d(Context, ViewGroup, View, ap)>
	//   10   16:putfield        #24  <Field ap$d c>
	//   11   19:return          
	}

	static ap a(View view)
	{
		ViewGroup viewgroup = b(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method ViewGroup b(View)>
	//    2    4:astore_3        
		if(viewgroup != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          66
		{
			int j = viewgroup.getChildCount();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #37  <Method int ViewGroup.getChildCount()>
	//    7   13:istore_2        
			for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          52
			{
				View view1 = viewgroup.getChildAt(i);
	//   13   21:aload_3         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #41  <Method View ViewGroup.getChildAt(int)>
	//   16   26:astore          4
				if(view1 instanceof d)
	//*  17   28:aload           4
	//*  18   30:instanceof      #8   <Class ap$d>
	//*  19   33:ifeq            45
					return ((d)view1).c;
	//   20   36:aload           4
	//   21   38:checkcast       #8   <Class ap$d>
	//   22   41:getfield        #44  <Field ap ap$d.c>
	//   23   44:areturn         
			}

	//   24   45:iload_1         
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore_1        
	//*  28   49:goto            16
			return ((ap) (new am(viewgroup.getContext(), viewgroup, view)));
	//   29   52:new             #46  <Class am>
	//   30   55:dup             
	//   31   56:aload_3         
	//   32   57:invokevirtual   #50  <Method Context ViewGroup.getContext()>
	//   33   60:aload_3         
	//   34   61:aload_0         
	//   35   62:invokespecial   #52  <Method void am(Context, ViewGroup, View)>
	//   36   65:areturn         
		} else
		{
			return null;
	//   37   66:aconst_null     
	//   38   67:areturn         
		}
	}

	static ViewGroup b(View view)
	{
		do
		{
			if(view == null)
				break;
	//    0    0:aload_0         
	//    1    1:ifnull          46
			if(view.getId() == 0x1020002 && (view instanceof ViewGroup))
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #57  <Method int View.getId()>
	//*   4    8:ldc1            #58  <Int 0x1020002>
	//*   5   10:icmpne          25
	//*   6   13:aload_0         
	//*   7   14:instanceof      #33  <Class ViewGroup>
	//*   8   17:ifeq            25
				return (ViewGroup)view;
	//    9   20:aload_0         
	//   10   21:checkcast       #33  <Class ViewGroup>
	//   11   24:areturn         
			if(view.getParent() instanceof ViewGroup)
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #62  <Method ViewParent View.getParent()>
	//*  14   29:instanceof      #33  <Class ViewGroup>
	//*  15   32:ifeq            0
				view = ((View) ((ViewGroup)view.getParent()));
	//   16   35:aload_0         
	//   17   36:invokevirtual   #62  <Method ViewParent View.getParent()>
	//   18   39:checkcast       #33  <Class ViewGroup>
	//   19   42:astore_0        
		} while(true);
	//   20   43:goto            0
		return null;
	//   21   46:aconst_null     
	//   22   47:areturn         
	}

	public void d(Drawable drawable)
	{
		c.b(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ap$d c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #66  <Method void ap$d.b(Drawable)>
	//    4    8:return          
	}

	public void e(Drawable drawable)
	{
		c.c(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ap$d c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #70  <Method void ap$d.c(Drawable)>
	//    4    8:return          
	}

	protected d c;
}
