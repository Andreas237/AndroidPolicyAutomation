// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//			s, aa, o

static class s$f extends s$e
{

	private static Rect b()
	{
		if(d == null)
	//*   0    0:getstatic       #21  <Field ThreadLocal d>
	//*   1    3:ifnonnull       16
			d = new ThreadLocal();
	//    2    6:new             #23  <Class ThreadLocal>
	//    3    9:dup             
	//    4   10:invokespecial   #24  <Method void ThreadLocal()>
	//    5   13:putstatic       #21  <Field ThreadLocal d>
		Rect rect1 = (Rect)d.get();
	//    6   16:getstatic       #21  <Field ThreadLocal d>
	//    7   19:invokevirtual   #28  <Method Object ThreadLocal.get()>
	//    8   22:checkcast       #30  <Class Rect>
	//    9   25:astore_1        
		Rect rect = rect1;
	//   10   26:aload_1         
	//   11   27:astore_0        
		if(rect1 == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       47
		{
			rect = new Rect();
	//   14   32:new             #30  <Class Rect>
	//   15   35:dup             
	//   16   36:invokespecial   #31  <Method void Rect()>
	//   17   39:astore_0        
			d.set(((Object) (rect)));
	//   18   40:getstatic       #21  <Field ThreadLocal d>
	//   19   43:aload_0         
	//   20   44:invokevirtual   #35  <Method void ThreadLocal.set(Object)>
		}
		rect.setEmpty();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #38  <Method void Rect.setEmpty()>
		return rect;
	//   23   51:aload_0         
	//   24   52:areturn         
	}

	public float A(View view)
	{
		return view.getZ();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #46  <Method float View.getZ()>
	//    2    4:freturn         
	}

	public aa a(View view, aa aa1)
	{
		aa1 = ((aa) ((WindowInsets)aa.a(aa1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #53  <Method Object aa.a(aa)>
	//    2    4:checkcast       #55  <Class WindowInsets>
	//    3    7:astore_2        
		WindowInsets windowinsets = view.onApplyWindowInsets(((WindowInsets) (aa1)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #59  <Method WindowInsets View.onApplyWindowInsets(WindowInsets)>
	//    7   13:astore_3        
		view = ((View) (aa1));
	//    8   14:aload_2         
	//    9   15:astore_1        
		if(windowinsets != aa1)
	//*  10   16:aload_3         
	//*  11   17:aload_2         
	//*  12   18:if_acmpeq       30
			view = ((View) (new WindowInsets(windowinsets)));
	//   13   21:new             #55  <Class WindowInsets>
	//   14   24:dup             
	//   15   25:aload_3         
	//   16   26:invokespecial   #62  <Method void WindowInsets(WindowInsets)>
	//   17   29:astore_1        
		return aa.a(((Object) (view)));
	//   18   30:aload_1         
	//   19   31:invokestatic    #65  <Method aa aa.a(Object)>
	//   20   34:areturn         
	}

	public void a(View view, float f1)
	{
		view.setElevation(f1);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:invokevirtual   #70  <Method void View.setElevation(float)>
	//    3    5:return          
	}

	public void a(View view, ColorStateList colorstatelist)
	{
		view.setBackgroundTintList(colorstatelist);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #75  <Method void View.setBackgroundTintList(ColorStateList)>
		if(android.os.d.VERSION.SDK_INT == 21)
	//*   3    5:getstatic       #81  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpne          68
		{
			colorstatelist = ((ColorStateList) (view.getBackground()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #85  <Method Drawable View.getBackground()>
	//    8   17:astore_2        
			boolean flag;
			if(view.getBackgroundTintList() != null && view.getBackgroundTintMode() != null)
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #89  <Method ColorStateList View.getBackgroundTintList()>
	//*  11   22:ifnull          37
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #93  <Method android.graphics.PorterDuff$Mode View.getBackgroundTintMode()>
	//*  14   29:ifnull          37
				flag = true;
	//   15   32:iconst_1        
	//   16   33:istore_3        
			else
	//*  17   34:goto            39
				flag = false;
	//   18   37:iconst_0        
	//   19   38:istore_3        
			if(colorstatelist != null && flag)
	//*  20   39:aload_2         
	//*  21   40:ifnull          68
	//*  22   43:iload_3         
	//*  23   44:ifeq            68
			{
				if(((Drawable) (colorstatelist)).isStateful())
	//*  24   47:aload_2         
	//*  25   48:invokevirtual   #99  <Method boolean Drawable.isStateful()>
	//*  26   51:ifeq            63
					((Drawable) (colorstatelist)).setState(view.getDrawableState());
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #103 <Method int[] View.getDrawableState()>
	//   30   59:invokevirtual   #107 <Method boolean Drawable.setState(int[])>
	//   31   62:pop             
				view.setBackground(((Drawable) (colorstatelist)));
	//   32   63:aload_1         
	//   33   64:aload_2         
	//   34   65:invokevirtual   #111 <Method void View.setBackground(Drawable)>
			}
		}
	//   35   68:return          
	}

	public void a(View view, android.graphics.erDuff.Mode mode)
	{
		view.setBackgroundTintMode(mode);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #116 <Method void View.setBackgroundTintMode(android.graphics.PorterDuff$Mode)>
		if(android.os.d.VERSION.SDK_INT == 21)
	//*   3    5:getstatic       #81  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpne          68
		{
			mode = ((android.graphics.erDuff.Mode) (view.getBackground()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #85  <Method Drawable View.getBackground()>
	//    8   17:astore_2        
			boolean flag;
			if(view.getBackgroundTintList() != null && view.getBackgroundTintMode() != null)
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #89  <Method ColorStateList View.getBackgroundTintList()>
	//*  11   22:ifnull          37
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #93  <Method android.graphics.PorterDuff$Mode View.getBackgroundTintMode()>
	//*  14   29:ifnull          37
				flag = true;
	//   15   32:iconst_1        
	//   16   33:istore_3        
			else
	//*  17   34:goto            39
				flag = false;
	//   18   37:iconst_0        
	//   19   38:istore_3        
			if(mode != null && flag)
	//*  20   39:aload_2         
	//*  21   40:ifnull          68
	//*  22   43:iload_3         
	//*  23   44:ifeq            68
			{
				if(((Drawable) (mode)).isStateful())
	//*  24   47:aload_2         
	//*  25   48:invokevirtual   #99  <Method boolean Drawable.isStateful()>
	//*  26   51:ifeq            63
					((Drawable) (mode)).setState(view.getDrawableState());
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #103 <Method int[] View.getDrawableState()>
	//   30   59:invokevirtual   #107 <Method boolean Drawable.setState(int[])>
	//   31   62:pop             
				view.setBackground(((Drawable) (mode)));
	//   32   63:aload_1         
	//   33   64:aload_2         
	//   34   65:invokevirtual   #111 <Method void View.setBackground(Drawable)>
			}
		}
	//   35   68:return          
	}

	public void a(View view, o o)
	{
		if(o == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			view.setOnApplyWindowInsetsListener(((android.view..OnApplyWindowInsetsListener) (null)));
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #121 <Method void View.setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
			return;
	//    5    9:return          
		} else
		{
			view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener(o) {

				public WindowInsets onApplyWindowInsets(View view1, WindowInsets windowinsets)
				{
					windowinsets = ((WindowInsets) (aa.a(((Object) (windowinsets)))));
				//    0    0:aload_2         
				//    1    1:invokestatic    #34  <Method aa aa.a(Object)>
				//    2    4:astore_2        
					return (WindowInsets)aa.a(a.a(view1, ((aa) (windowinsets))));
				//    3    5:aload_0         
				//    4    6:getfield        #23  <Field o a>
				//    5    9:aload_1         
				//    6   10:aload_2         
				//    7   11:invokeinterface #39  <Method aa o.a(View, aa)>
				//    8   16:invokestatic    #42  <Method Object aa.a(aa)>
				//    9   19:checkcast       #44  <Class WindowInsets>
				//   10   22:areturn         
				}

				final o a;
				final s.f b;

			
			{
				b = s.f.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field s$f b>
				a = o1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field o a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   10:aload_1         
	//    7   11:new             #9   <Class s$f$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokespecial   #124 <Method void s$f$1(s$f, o)>
	//   12   20:invokevirtual   #121 <Method void View.setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
			return;
	//   13   23:return          
		}
	}

	public aa b(View view, aa aa1)
	{
		aa1 = ((aa) ((WindowInsets)aa.a(aa1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #53  <Method Object aa.a(aa)>
	//    2    4:checkcast       #55  <Class WindowInsets>
	//    3    7:astore_2        
		WindowInsets windowinsets = view.dispatchApplyWindowInsets(((WindowInsets) (aa1)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #127 <Method WindowInsets View.dispatchApplyWindowInsets(WindowInsets)>
	//    7   13:astore_3        
		view = ((View) (aa1));
	//    8   14:aload_2         
	//    9   15:astore_1        
		if(windowinsets != aa1)
	//*  10   16:aload_3         
	//*  11   17:aload_2         
	//*  12   18:if_acmpeq       30
			view = ((View) (new WindowInsets(windowinsets)));
	//   13   21:new             #55  <Class WindowInsets>
	//   14   24:dup             
	//   15   25:aload_3         
	//   16   26:invokespecial   #62  <Method void WindowInsets(WindowInsets)>
	//   17   29:astore_1        
		return aa.a(((Object) (view)));
	//   18   30:aload_1         
	//   19   31:invokestatic    #65  <Method aa aa.a(Object)>
	//   20   34:areturn         
	}

	public void b(View view, float f1)
	{
		view.setTranslationZ(f1);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:invokevirtual   #130 <Method void View.setTranslationZ(float)>
	//    3    5:return          
	}

	public void b(View view, boolean flag)
	{
		view.setNestedScrollingEnabled(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #135 <Method void View.setNestedScrollingEnabled(boolean)>
	//    3    5:return          
	}

	public void c(View view, int i)
	{
		Rect rect = b();
	//    0    0:invokestatic    #139 <Method Rect b()>
	//    1    3:astore          4
		android.view.ViewParent viewparent = view.getParent();
	//    2    5:aload_1         
	//    3    6:invokevirtual   #143 <Method android.view.ViewParent View.getParent()>
	//    4    9:astore          5
		boolean flag;
		if(viewparent instanceof View)
	//*   5   11:aload           5
	//*   6   13:instanceof      #42  <Class View>
	//*   7   16:ifeq            78
		{
			View view1 = (View)viewparent;
	//    8   19:aload           5
	//    9   21:checkcast       #42  <Class View>
	//   10   24:astore          6
			rect.set(view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom());
	//   11   26:aload           4
	//   12   28:aload           6
	//   13   30:invokevirtual   #147 <Method int View.getLeft()>
	//   14   33:aload           6
	//   15   35:invokevirtual   #150 <Method int View.getTop()>
	//   16   38:aload           6
	//   17   40:invokevirtual   #153 <Method int View.getRight()>
	//   18   43:aload           6
	//   19   45:invokevirtual   #156 <Method int View.getBottom()>
	//   20   48:invokevirtual   #159 <Method void Rect.set(int, int, int, int)>
			flag = rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true;
	//   21   51:aload           4
	//   22   53:aload_1         
	//   23   54:invokevirtual   #147 <Method int View.getLeft()>
	//   24   57:aload_1         
	//   25   58:invokevirtual   #150 <Method int View.getTop()>
	//   26   61:aload_1         
	//   27   62:invokevirtual   #153 <Method int View.getRight()>
	//   28   65:aload_1         
	//   29   66:invokevirtual   #156 <Method int View.getBottom()>
	//   30   69:invokevirtual   #163 <Method boolean Rect.intersects(int, int, int, int)>
	//   31   72:iconst_1        
	//   32   73:ixor            
	//   33   74:istore_3        
		} else
	//*  34   75:goto            80
		{
			flag = false;
	//   35   78:iconst_0        
	//   36   79:istore_3        
		}
		super.c(view, i);
	//   37   80:aload_0         
	//   38   81:aload_1         
	//   39   82:iload_2         
	//   40   83:invokespecial   #165 <Method void s$e.c(View, int)>
		if(flag && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))
	//*  41   86:iload_3         
	//*  42   87:ifeq            124
	//*  43   90:aload           4
	//*  44   92:aload_1         
	//*  45   93:invokevirtual   #147 <Method int View.getLeft()>
	//*  46   96:aload_1         
	//*  47   97:invokevirtual   #150 <Method int View.getTop()>
	//*  48  100:aload_1         
	//*  49  101:invokevirtual   #153 <Method int View.getRight()>
	//*  50  104:aload_1         
	//*  51  105:invokevirtual   #156 <Method int View.getBottom()>
	//*  52  108:invokevirtual   #168 <Method boolean Rect.intersect(int, int, int, int)>
	//*  53  111:ifeq            124
			((View)viewparent).invalidate(rect);
	//   54  114:aload           5
	//   55  116:checkcast       #42  <Class View>
	//   56  119:aload           4
	//   57  121:invokevirtual   #172 <Method void View.invalidate(Rect)>
	//   58  124:return          
	}

	public void d(View view, int i)
	{
		Rect rect = b();
	//    0    0:invokestatic    #139 <Method Rect b()>
	//    1    3:astore          4
		android.view.ViewParent viewparent = view.getParent();
	//    2    5:aload_1         
	//    3    6:invokevirtual   #143 <Method android.view.ViewParent View.getParent()>
	//    4    9:astore          5
		boolean flag;
		if(viewparent instanceof View)
	//*   5   11:aload           5
	//*   6   13:instanceof      #42  <Class View>
	//*   7   16:ifeq            78
		{
			View view1 = (View)viewparent;
	//    8   19:aload           5
	//    9   21:checkcast       #42  <Class View>
	//   10   24:astore          6
			rect.set(view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom());
	//   11   26:aload           4
	//   12   28:aload           6
	//   13   30:invokevirtual   #147 <Method int View.getLeft()>
	//   14   33:aload           6
	//   15   35:invokevirtual   #150 <Method int View.getTop()>
	//   16   38:aload           6
	//   17   40:invokevirtual   #153 <Method int View.getRight()>
	//   18   43:aload           6
	//   19   45:invokevirtual   #156 <Method int View.getBottom()>
	//   20   48:invokevirtual   #159 <Method void Rect.set(int, int, int, int)>
			flag = rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true;
	//   21   51:aload           4
	//   22   53:aload_1         
	//   23   54:invokevirtual   #147 <Method int View.getLeft()>
	//   24   57:aload_1         
	//   25   58:invokevirtual   #150 <Method int View.getTop()>
	//   26   61:aload_1         
	//   27   62:invokevirtual   #153 <Method int View.getRight()>
	//   28   65:aload_1         
	//   29   66:invokevirtual   #156 <Method int View.getBottom()>
	//   30   69:invokevirtual   #163 <Method boolean Rect.intersects(int, int, int, int)>
	//   31   72:iconst_1        
	//   32   73:ixor            
	//   33   74:istore_3        
		} else
	//*  34   75:goto            80
		{
			flag = false;
	//   35   78:iconst_0        
	//   36   79:istore_3        
		}
		super.d(view, i);
	//   37   80:aload_0         
	//   38   81:aload_1         
	//   39   82:iload_2         
	//   40   83:invokespecial   #174 <Method void s$e.d(View, int)>
		if(flag && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))
	//*  41   86:iload_3         
	//*  42   87:ifeq            124
	//*  43   90:aload           4
	//*  44   92:aload_1         
	//*  45   93:invokevirtual   #147 <Method int View.getLeft()>
	//*  46   96:aload_1         
	//*  47   97:invokevirtual   #150 <Method int View.getTop()>
	//*  48  100:aload_1         
	//*  49  101:invokevirtual   #153 <Method int View.getRight()>
	//*  50  104:aload_1         
	//*  51  105:invokevirtual   #156 <Method int View.getBottom()>
	//*  52  108:invokevirtual   #168 <Method boolean Rect.intersect(int, int, int, int)>
	//*  53  111:ifeq            124
			((View)viewparent).invalidate(rect);
	//   54  114:aload           5
	//   55  116:checkcast       #42  <Class View>
	//   56  119:aload           4
	//   57  121:invokevirtual   #172 <Method void View.invalidate(Rect)>
	//   58  124:return          
	}

	public void h(View view)
	{
		view.requestApplyInsets();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #179 <Method void View.requestApplyInsets()>
	//    2    4:return          
	}

	public String t(View view)
	{
		return view.getTransitionName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #185 <Method String View.getTransitionName()>
	//    2    4:areturn         
	}

	public float u(View view)
	{
		return view.getElevation();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #189 <Method float View.getElevation()>
	//    2    4:freturn         
	}

	public float v(View view)
	{
		return view.getTranslationZ();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #193 <Method float View.getTranslationZ()>
	//    2    4:freturn         
	}

	public boolean w(View view)
	{
		return view.isNestedScrollingEnabled();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #198 <Method boolean View.isNestedScrollingEnabled()>
	//    2    4:ireturn         
	}

	public void x(View view)
	{
		view.stopNestedScroll();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #202 <Method void View.stopNestedScroll()>
	//    2    4:return          
	}

	public ColorStateList y(View view)
	{
		return view.getBackgroundTintList();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #89  <Method ColorStateList View.getBackgroundTintList()>
	//    2    4:areturn         
	}

	public android.graphics.erDuff.Mode z(View view)
	{
		return view.getBackgroundTintMode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method android.graphics.PorterDuff$Mode View.getBackgroundTintMode()>
	//    2    4:areturn         
	}

	private static ThreadLocal d;

	s$f()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void s$e()>
	//    2    4:return          
	}
}
