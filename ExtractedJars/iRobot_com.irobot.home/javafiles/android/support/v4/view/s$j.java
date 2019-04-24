// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.*;
import java.lang.reflect.*;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//			s, w, r, a, 
//			i, aa, o, q

static class s$j
{

	private static void D(View view)
	{
		float f1 = view.getTranslationY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method float View.getTranslationY()>
	//    2    4:fstore_1        
		view.setTranslationY(1.0F + f1);
	//    3    5:aload_0         
	//    4    6:fconst_1        
	//    5    7:fload_1         
	//    6    8:fadd            
	//    7    9:invokevirtual   #43  <Method void View.setTranslationY(float)>
		view.setTranslationY(f1);
	//    8   12:aload_0         
	//    9   13:fload_1         
	//   10   14:invokevirtual   #43  <Method void View.setTranslationY(float)>
	//   11   17:return          
	}

	public float A(View view)
	{
		return v(view) + u(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method float v(View)>
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #51  <Method float u(View)>
	//    6   10:fadd            
	//    7   11:freturn         
	}

	public boolean B(View view)
	{
		boolean flag1 = c;
	//    0    0:getstatic       #57  <Field boolean c>
	//    1    3:istore_3        
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		if(flag1)
	//*   4    6:iload_3         
	//*   5    7:ifeq            12
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		if(b == null)
	//*   8   12:getstatic       #59  <Field Field b>
	//*   9   15:ifnonnull       44
			try
			{
				b = ((Class) (android/view/View)).getDeclaredField("mAccessibilityDelegate");
	//   10   18:ldc1            #35  <Class View>
	//   11   20:ldc1            #61  <String "mAccessibilityDelegate">
	//   12   22:invokevirtual   #67  <Method Field Class.getDeclaredField(String)>
	//   13   25:putstatic       #59  <Field Field b>
				b.setAccessible(true);
	//   14   28:getstatic       #59  <Field Field b>
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #73  <Method void Field.setAccessible(boolean)>
			}
	//*  17   35:goto            44
	//*  18   38:iconst_1        
	//*  19   39:putstatic       #57  <Field boolean c>
	//*  20   42:iconst_0        
	//*  21   43:ireturn         
	//*  22   44:getstatic       #59  <Field Field b>
	//*  23   47:aload_1         
	//*  24   48:invokevirtual   #77  <Method Object Field.get(Object)>
	//*  25   51:astore_1        
	//*  26   52:aload_1         
	//*  27   53:ifnull          58
	//*  28   56:iconst_1        
	//*  29   57:istore_2        
	//*  30   58:iload_2         
	//*  31   59:ireturn         
	//*  32   60:iconst_1        
	//*  33   61:putstatic       #57  <Field boolean c>
	//*  34   64:iconst_0        
	//*  35   65:ireturn         
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				c = true;
				return false;
			}
		try
		{
			view = ((View) (b.get(((Object) (view)))));
		}
	//*  36   66:astore_1        
	//*  37   67:goto            38
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			c = true;
			return false;
		}
		if(view != null)
			flag = true;
		return flag;
	//*  38   70:astore_1        
	//*  39   71:goto            60
	}

	public w C(View view)
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field WeakHashMap a>
	//*   2    4:ifnonnull       18
			a = new WeakHashMap();
	//    3    7:aload_0         
	//    4    8:new             #81  <Class WeakHashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #82  <Method void WeakHashMap()>
	//    7   15:putfield        #31  <Field WeakHashMap a>
		w w2 = (w)a.get(((Object) (view)));
	//    8   18:aload_0         
	//    9   19:getfield        #31  <Field WeakHashMap a>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #83  <Method Object WeakHashMap.get(Object)>
	//   12   26:checkcast       #85  <Class w>
	//   13   29:astore_3        
		w w1 = w2;
	//   14   30:aload_3         
	//   15   31:astore_2        
		if(w2 == null)
	//*  16   32:aload_3         
	//*  17   33:ifnonnull       55
		{
			w1 = new w(view);
	//   18   36:new             #85  <Class w>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:invokespecial   #87  <Method void w(View)>
	//   22   44:astore_2        
			a.put(((Object) (view)), ((Object) (w1)));
	//   23   45:aload_0         
	//   24   46:getfield        #31  <Field WeakHashMap a>
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #91  <Method Object WeakHashMap.put(Object, Object)>
	//   28   54:pop             
		}
		return w1;
	//   29   55:aload_2         
	//   30   56:areturn         
	}

	long a()
	{
		return ValueAnimator.getFrameDelay();
	//    0    0:invokestatic    #97  <Method long ValueAnimator.getFrameDelay()>
	//    1    3:lreturn         
	}

	public aa a(View view, aa aa)
	{
		return aa;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public void a(View view, float f1)
	{
	//    0    0:return          
	}

	public void a(View view, int i1)
	{
	//    0    0:return          
	}

	public void a(View view, int i1, int j1)
	{
	//    0    0:return          
	}

	public void a(View view, int i1, int j1, int k1, int l1)
	{
		view.postInvalidate(i1, j1, k1, l1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #106 <Method void View.postInvalidate(int, int, int, int)>
	//    6   10:return          
	}

	public void a(View view, ColorStateList colorstatelist)
	{
		if(view instanceof r)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #109 <Class r>
	//*   2    4:ifeq            17
			((r)view).setSupportBackgroundTintList(colorstatelist);
	//    3    7:aload_1         
	//    4    8:checkcast       #109 <Class r>
	//    5   11:aload_2         
	//    6   12:invokeinterface #113 <Method void r.setSupportBackgroundTintList(ColorStateList)>
	//    7   17:return          
	}

	public void a(View view, Paint paint)
	{
		view.setLayerType(view.getLayerType(), paint);
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method int View.getLayerType()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #122 <Method void View.setLayerType(int, Paint)>
		view.invalidate();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #125 <Method void View.invalidate()>
	//    7   13:return          
	}

	public void a(View view, android.graphics.erDuff.Mode mode)
	{
		if(view instanceof r)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #109 <Class r>
	//*   2    4:ifeq            17
			((r)view).setSupportBackgroundTintMode(mode);
	//    3    7:aload_1         
	//    4    8:checkcast       #109 <Class r>
	//    5   11:aload_2         
	//    6   12:invokeinterface #130 <Method void r.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    7   17:return          
	}

	public void a(View view, Rect rect)
	{
	//    0    0:return          
	}

	public void a(View view, Drawable drawable)
	{
		view.setBackgroundDrawable(drawable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #136 <Method void View.setBackgroundDrawable(Drawable)>
	//    3    5:return          
	}

	public void a(View view, a a1)
	{
		if(a1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			a1 = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			a1 = ((a) (a1.a()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #142 <Method android.view.View$AccessibilityDelegate a.a()>
	//    7   13:astore_2        
		view.setAccessibilityDelegate(((android.view..AccessibilityDelegate) (a1)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #146 <Method void View.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
	//   11   19:return          
	}

	public void a(View view, o o1)
	{
	//    0    0:return          
	}

	public void a(View view, q q1)
	{
	//    0    0:return          
	}

	public void a(View view, Runnable runnable)
	{
		view.postDelayed(runnable, a());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #151 <Method long a()>
	//    4    6:invokevirtual   #155 <Method boolean View.postDelayed(Runnable, long)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void a(View view, Runnable runnable, long l1)
	{
		view.postDelayed(runnable, a() + l1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #151 <Method long a()>
	//    4    6:lload_3         
	//    5    7:ladd            
	//    6    8:invokevirtual   #155 <Method boolean View.postDelayed(Runnable, long)>
	//    7   11:pop             
	//    8   12:return          
	}

	public void a(View view, boolean flag)
	{
	//    0    0:return          
	}

	public void a(ViewGroup viewgroup, boolean flag)
	{
		if(i == null)
	//*   0    0:getstatic       #168 <Field Method i>
	//*   1    3:ifnonnull       46
		{
			try
			{
				i = ((Class) (android/view/ViewGroup)).getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
					Boolean.TYPE
				});
	//    2    6:ldc1            #170 <Class ViewGroup>
	//    3    8:ldc1            #172 <String "setChildrenDrawingOrderEnabled">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #178 <Field Class Boolean.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #182 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   23:putstatic       #168 <Field Method i>
			}
	//*  12   26:goto            39
			catch(NoSuchMethodException nosuchmethodexception)
	//*  13   29:astore_3        
			{
				Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", ((Throwable) (nosuchmethodexception)));
	//   14   30:ldc1            #184 <String "ViewCompat">
	//   15   32:ldc1            #186 <String "Unable to find childrenDrawingOrderEnabled">
	//   16   34:aload_3         
	//   17   35:invokestatic    #191 <Method int Log.e(String, String, Throwable)>
	//   18   38:pop             
			}
			i.setAccessible(true);
	//   19   39:getstatic       #168 <Field Method i>
	//   20   42:iconst_1        
	//   21   43:invokevirtual   #194 <Method void Method.setAccessible(boolean)>
		}
		try
		{
			i.invoke(((Object) (viewgroup)), new Object[] {
				Boolean.valueOf(flag)
			});
	//   22   46:getstatic       #168 <Field Method i>
	//   23   49:aload_1         
	//   24   50:iconst_1        
	//   25   51:anewarray       Object[]
	//   26   54:dup             
	//   27   55:iconst_0        
	//   28   56:iload_2         
	//   29   57:invokestatic    #198 <Method Boolean Boolean.valueOf(boolean)>
	//   30   60:aastore         
	//   31   61:invokevirtual   #202 <Method Object Method.invoke(Object, Object[])>
	//   32   64:pop             
			return;
	//   33   65:return          
		}
		// Misplaced declaration of an exception variable
		catch(ViewGroup viewgroup)
	//*  34   66:astore_1        
		{
			Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable) (viewgroup)));
	//   35   67:ldc1            #184 <String "ViewCompat">
	//   36   69:ldc1            #204 <String "Unable to invoke childrenDrawingOrderEnabled">
	//   37   71:aload_1         
	//   38   72:invokestatic    #191 <Method int Log.e(String, String, Throwable)>
	//   39   75:pop             
		}
		return;
	//   40   76:return          
	}

	public boolean a(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public aa b(View view, aa aa)
	{
		return aa;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public void b(View view, float f1)
	{
	//    0    0:return          
	}

	public void b(View view, int i1)
	{
	//    0    0:return          
	}

	public void b(View view, int i1, int j1, int k1, int l1)
	{
		view.setPadding(i1, j1, k1, l1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #207 <Method void View.setPadding(int, int, int, int)>
	//    6   10:return          
	}

	public void b(View view, boolean flag)
	{
		if(view instanceof i)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #209 <Class i>
	//*   2    4:ifeq            17
			((i)view).setNestedScrollingEnabled(flag);
	//    3    7:aload_1         
	//    4    8:checkcast       #209 <Class i>
	//    5   11:iload_2         
	//    6   12:invokeinterface #212 <Method void i.setNestedScrollingEnabled(boolean)>
	//    7   17:return          
	}

	public boolean b(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void c(View view)
	{
		view.postInvalidate();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #214 <Method void View.postInvalidate()>
	//    2    4:return          
	}

	public void c(View view, int i1)
	{
		view.offsetLeftAndRight(i1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #218 <Method void View.offsetLeftAndRight(int)>
		if(view.getVisibility() == 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #221 <Method int View.getVisibility()>
	//*   5    9:ifne            35
		{
			D(view);
	//    6   12:aload_1         
	//    7   13:invokestatic    #223 <Method void D(View)>
			view = ((View) (view.getParent()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #227 <Method ViewParent View.getParent()>
	//   10   20:astore_1        
			if(view instanceof View)
	//*  11   21:aload_1         
	//*  12   22:instanceof      #35  <Class View>
	//*  13   25:ifeq            35
				D((View)view);
	//   14   28:aload_1         
	//   15   29:checkcast       #35  <Class View>
	//   16   32:invokestatic    #223 <Method void D(View)>
		}
	//   17   35:return          
	}

	public int d(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void d(View view, int i1)
	{
		view.offsetTopAndBottom(i1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #231 <Method void View.offsetTopAndBottom(int)>
		if(view.getVisibility() == 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #221 <Method int View.getVisibility()>
	//*   5    9:ifne            35
		{
			D(view);
	//    6   12:aload_1         
	//    7   13:invokestatic    #223 <Method void D(View)>
			view = ((View) (view.getParent()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #227 <Method ViewParent View.getParent()>
	//   10   20:astore_1        
			if(view instanceof View)
	//*  11   21:aload_1         
	//*  12   22:instanceof      #35  <Class View>
	//*  13   25:ifeq            35
				D((View)view);
	//   14   28:aload_1         
	//   15   29:checkcast       #35  <Class View>
	//   16   32:invokestatic    #223 <Method void D(View)>
		}
	//   17   35:return          
	}

	public ViewParent e(View view)
	{
		return view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #227 <Method ViewParent View.getParent()>
	//    2    4:areturn         
	}

	public int f(View view)
	{
		if(!e)
	//*   0    0:getstatic       #238 <Field boolean e>
	//*   1    3:ifne            27
		{
			int i1;
			try
			{
				d = ((Class) (android/view/View)).getDeclaredField("mMinWidth");
	//    2    6:ldc1            #35  <Class View>
	//    3    8:ldc1            #240 <String "mMinWidth">
	//    4   10:invokevirtual   #67  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #242 <Field Field d>
				d.setAccessible(true);
	//    6   16:getstatic       #242 <Field Field d>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #73  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:iconst_1        
	//*  10   24:putstatic       #238 <Field boolean e>
	//*  11   27:getstatic       #242 <Field Field d>
	//*  12   30:ifnull          49
	//*  13   33:getstatic       #242 <Field Field d>
	//*  14   36:aload_1         
	//*  15   37:invokevirtual   #77  <Method Object Field.get(Object)>
	//*  16   40:checkcast       #244 <Class Integer>
	//*  17   43:invokevirtual   #247 <Method int Integer.intValue()>
	//*  18   46:istore_2        
	//*  19   47:iload_2         
	//*  20   48:ireturn         
	//*  21   49:iconst_0        
	//*  22   50:ireturn         
			catch(NoSuchFieldException nosuchfieldexception) { }
	//   23   51:astore_3        
			e = true;
		}
		if(d == null)
			break MISSING_BLOCK_LABEL_49;
		i1 = ((Integer)d.get(((Object) (view)))).intValue();
		return i1;
_L2:
		return 0;
	//*  24   52:goto            23
		view;
	//   25   55:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  26   56:goto            49
	}

	public int g(View view)
	{
		if(!g)
	//*   0    0:getstatic       #249 <Field boolean g>
	//*   1    3:ifne            27
		{
			int i1;
			try
			{
				f = ((Class) (android/view/View)).getDeclaredField("mMinHeight");
	//    2    6:ldc1            #35  <Class View>
	//    3    8:ldc1            #251 <String "mMinHeight">
	//    4   10:invokevirtual   #67  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #253 <Field Field f>
				f.setAccessible(true);
	//    6   16:getstatic       #253 <Field Field f>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #73  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:iconst_1        
	//*  10   24:putstatic       #249 <Field boolean g>
	//*  11   27:getstatic       #253 <Field Field f>
	//*  12   30:ifnull          49
	//*  13   33:getstatic       #253 <Field Field f>
	//*  14   36:aload_1         
	//*  15   37:invokevirtual   #77  <Method Object Field.get(Object)>
	//*  16   40:checkcast       #244 <Class Integer>
	//*  17   43:invokevirtual   #247 <Method int Integer.intValue()>
	//*  18   46:istore_2        
	//*  19   47:iload_2         
	//*  20   48:ireturn         
	//*  21   49:iconst_0        
	//*  22   50:ireturn         
			catch(NoSuchFieldException nosuchfieldexception) { }
	//   23   51:astore_3        
			g = true;
		}
		if(f == null)
			break MISSING_BLOCK_LABEL_49;
		i1 = ((Integer)f.get(((Object) (view)))).intValue();
		return i1;
_L2:
		return 0;
	//*  24   52:goto            23
		view;
	//   25   55:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  26   56:goto            49
	}

	public void h(View view)
	{
	//    0    0:return          
	}

	public boolean i(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean j(View view)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int k(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int l(View view)
	{
		return view.getPaddingLeft();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #258 <Method int View.getPaddingLeft()>
	//    2    4:ireturn         
	}

	public int m(View view)
	{
		return view.getPaddingRight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #262 <Method int View.getPaddingRight()>
	//    2    4:ireturn         
	}

	public int n(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean o(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Display p(View view)
	{
		if(s(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #269 <Method boolean s(View)>
	//*   3    5:ifeq            27
			return ((WindowManager)view.getContext().getSystemService("window")).getDefaultDisplay();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #273 <Method Context View.getContext()>
	//    6   12:ldc2            #275 <String "window">
	//    7   15:invokevirtual   #281 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #283 <Class WindowManager>
	//    9   21:invokeinterface #287 <Method Display WindowManager.getDefaultDisplay()>
	//   10   26:areturn         
		else
			return null;
	//   11   27:aconst_null     
	//   12   28:areturn         
	}

	public Rect q(View view)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean r(View view)
	{
		return view.getWidth() > 0 && view.getHeight() > 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #293 <Method int View.getWidth()>
	//    2    4:ifle            16
	//    3    7:aload_1         
	//    4    8:invokevirtual   #296 <Method int View.getHeight()>
	//    5   11:ifle            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean s(View view)
	{
		return view.getWindowToken() != null;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #300 <Method android.os.IBinder View.getWindowToken()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String t(View view)
	{
		if(h == null)
	//*   0    0:getstatic       #304 <Field WeakHashMap h>
	//*   1    3:ifnonnull       8
			return null;
	//    2    6:aconst_null     
	//    3    7:areturn         
		else
			return (String)h.get(((Object) (view)));
	//    4    8:getstatic       #304 <Field WeakHashMap h>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #83  <Method Object WeakHashMap.get(Object)>
	//    7   15:checkcast       #306 <Class String>
	//    8   18:areturn         
	}

	public float u(View view)
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public float v(View view)
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public boolean w(View view)
	{
		if(view instanceof i)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #209 <Class i>
	//*   2    4:ifeq            17
			return ((i)view).isNestedScrollingEnabled();
	//    3    7:aload_1         
	//    4    8:checkcast       #209 <Class i>
	//    5   11:invokeinterface #311 <Method boolean i.isNestedScrollingEnabled()>
	//    6   16:ireturn         
		else
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public void x(View view)
	{
		if(view instanceof i)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #209 <Class i>
	//*   2    4:ifeq            16
			((i)view).stopNestedScroll();
	//    3    7:aload_1         
	//    4    8:checkcast       #209 <Class i>
	//    5   11:invokeinterface #315 <Method void i.stopNestedScroll()>
	//    6   16:return          
	}

	public ColorStateList y(View view)
	{
		if(view instanceof r)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #109 <Class r>
	//*   2    4:ifeq            17
			return ((r)view).getSupportBackgroundTintList();
	//    3    7:aload_1         
	//    4    8:checkcast       #109 <Class r>
	//    5   11:invokeinterface #321 <Method ColorStateList r.getSupportBackgroundTintList()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public android.graphics.erDuff.Mode z(View view)
	{
		if(view instanceof r)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #109 <Class r>
	//*   2    4:ifeq            17
			return ((r)view).getSupportBackgroundTintMode();
	//    3    7:aload_1         
	//    4    8:checkcast       #109 <Class r>
	//    5   11:invokeinterface #327 <Method android.graphics.PorterDuff$Mode r.getSupportBackgroundTintMode()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	static Field b;
	static boolean c = false;
	private static Field d;
	private static boolean e;
	private static Field f;
	private static boolean g;
	private static WeakHashMap h;
	private static Method i;
	WeakHashMap a;

	static 
	{
	//    0    0:return          
	}

	s$j()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field WeakHashMap a>
	//    5    9:return          
	}
}
