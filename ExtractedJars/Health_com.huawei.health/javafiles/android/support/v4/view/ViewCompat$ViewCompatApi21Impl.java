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
//			ViewCompat, WindowInsetsCompat, OnApplyWindowInsetsListener

static class ViewCompat$ViewCompatApi21Impl extends ViewCompat$ViewCompatApi19Impl
{

	private static Rect getEmptyTempRect()
	{
		if(sThreadLocalRect == null)
	//*   0    0:getstatic       #24  <Field ThreadLocal sThreadLocalRect>
	//*   1    3:ifnonnull       16
			sThreadLocalRect = new ThreadLocal();
	//    2    6:new             #26  <Class ThreadLocal>
	//    3    9:dup             
	//    4   10:invokespecial   #27  <Method void ThreadLocal()>
	//    5   13:putstatic       #24  <Field ThreadLocal sThreadLocalRect>
		Rect rect1 = (Rect)sThreadLocalRect.get();
	//    6   16:getstatic       #24  <Field ThreadLocal sThreadLocalRect>
	//    7   19:invokevirtual   #31  <Method Object ThreadLocal.get()>
	//    8   22:checkcast       #33  <Class Rect>
	//    9   25:astore_1        
		Rect rect = rect1;
	//   10   26:aload_1         
	//   11   27:astore_0        
		if(rect1 == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       47
		{
			rect = new Rect();
	//   14   32:new             #33  <Class Rect>
	//   15   35:dup             
	//   16   36:invokespecial   #34  <Method void Rect()>
	//   17   39:astore_0        
			sThreadLocalRect.set(((Object) (rect)));
	//   18   40:getstatic       #24  <Field ThreadLocal sThreadLocalRect>
	//   19   43:aload_0         
	//   20   44:invokevirtual   #38  <Method void ThreadLocal.set(Object)>
		}
		rect.setEmpty();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #41  <Method void Rect.setEmpty()>
		return rect;
	//   23   51:aload_0         
	//   24   52:areturn         
	}

	public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		windowinsetscompat = ((WindowInsetsCompat) ((WindowInsets)WindowInsetsCompat.unwrap(windowinsetscompat)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #49  <Method Object WindowInsetsCompat.unwrap(WindowInsetsCompat)>
	//    2    4:checkcast       #51  <Class WindowInsets>
	//    3    7:astore_2        
		WindowInsets windowinsets = view.dispatchApplyWindowInsets(((WindowInsets) (windowinsetscompat)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #56  <Method WindowInsets View.dispatchApplyWindowInsets(WindowInsets)>
	//    7   13:astore_3        
		view = ((View) (windowinsetscompat));
	//    8   14:aload_2         
	//    9   15:astore_1        
		if(windowinsets != windowinsetscompat)
	//*  10   16:aload_3         
	//*  11   17:aload_2         
	//*  12   18:if_acmpeq       30
			view = ((View) (new WindowInsets(windowinsets)));
	//   13   21:new             #51  <Class WindowInsets>
	//   14   24:dup             
	//   15   25:aload_3         
	//   16   26:invokespecial   #59  <Method void WindowInsets(WindowInsets)>
	//   17   29:astore_1        
		return WindowInsetsCompat.wrap(((Object) (view)));
	//   18   30:aload_1         
	//   19   31:invokestatic    #63  <Method WindowInsetsCompat WindowInsetsCompat.wrap(Object)>
	//   20   34:areturn         
	}

	public boolean dispatchNestedFling(View view, float f, float f1, boolean flag)
	{
		return view.dispatchNestedFling(f, f1, flag);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:iload           4
	//    4    5:invokevirtual   #68  <Method boolean View.dispatchNestedFling(float, float, boolean)>
	//    5    8:ireturn         
	}

	public boolean dispatchNestedPreFling(View view, float f, float f1)
	{
		return view.dispatchNestedPreFling(f, f1);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #73  <Method boolean View.dispatchNestedPreFling(float, float)>
	//    4    6:ireturn         
	}

	public boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[])
	{
		return view.dispatchNestedPreScroll(i, j, ai, ai1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #78  <Method boolean View.dispatchNestedPreScroll(int, int, int[], int[])>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[])
	{
		return view.dispatchNestedScroll(i, j, k, l, ai);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:aload           6
	//    6    9:invokevirtual   #83  <Method boolean View.dispatchNestedScroll(int, int, int, int, int[])>
	//    7   12:ireturn         
	}

	public ColorStateList getBackgroundTintList(View view)
	{
		return view.getBackgroundTintList();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #88  <Method ColorStateList View.getBackgroundTintList()>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getBackgroundTintMode(View view)
	{
		return view.getBackgroundTintMode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method android.graphics.PorterDuff$Mode View.getBackgroundTintMode()>
	//    2    4:areturn         
	}

	public float getElevation(View view)
	{
		return view.getElevation();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #98  <Method float View.getElevation()>
	//    2    4:freturn         
	}

	public String getTransitionName(View view)
	{
		return view.getTransitionName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #103 <Method String View.getTransitionName()>
	//    2    4:areturn         
	}

	public float getTranslationZ(View view)
	{
		return view.getTranslationZ();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method float View.getTranslationZ()>
	//    2    4:freturn         
	}

	public float getZ(View view)
	{
		return view.getZ();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #109 <Method float View.getZ()>
	//    2    4:freturn         
	}

	public boolean hasNestedScrollingParent(View view)
	{
		return view.hasNestedScrollingParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method boolean View.hasNestedScrollingParent()>
	//    2    4:ireturn         
	}

	public boolean isImportantForAccessibility(View view)
	{
		return view.isImportantForAccessibility();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #117 <Method boolean View.isImportantForAccessibility()>
	//    2    4:ireturn         
	}

	public boolean isNestedScrollingEnabled(View view)
	{
		return view.isNestedScrollingEnabled();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #120 <Method boolean View.isNestedScrollingEnabled()>
	//    2    4:ireturn         
	}

	public void offsetLeftAndRight(View view, int i)
	{
		Rect rect = getEmptyTempRect();
	//    0    0:invokestatic    #124 <Method Rect getEmptyTempRect()>
	//    1    3:astore          4
		boolean flag = false;
	//    2    5:iconst_0        
	//    3    6:istore_3        
		android.view.ViewParent viewparent = view.getParent();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #128 <Method android.view.ViewParent View.getParent()>
	//    6   11:astore          5
		if(viewparent instanceof View)
	//*   7   13:aload           5
	//*   8   15:instanceof      #53  <Class View>
	//*   9   18:ifeq            84
		{
			View view1 = (View)viewparent;
	//   10   21:aload           5
	//   11   23:checkcast       #53  <Class View>
	//   12   26:astore          6
			rect.set(view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom());
	//   13   28:aload           4
	//   14   30:aload           6
	//   15   32:invokevirtual   #132 <Method int View.getLeft()>
	//   16   35:aload           6
	//   17   37:invokevirtual   #135 <Method int View.getTop()>
	//   18   40:aload           6
	//   19   42:invokevirtual   #138 <Method int View.getRight()>
	//   20   45:aload           6
	//   21   47:invokevirtual   #141 <Method int View.getBottom()>
	//   22   50:invokevirtual   #144 <Method void Rect.set(int, int, int, int)>
			if(!rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))
	//*  23   53:aload           4
	//*  24   55:aload_1         
	//*  25   56:invokevirtual   #132 <Method int View.getLeft()>
	//*  26   59:aload_1         
	//*  27   60:invokevirtual   #135 <Method int View.getTop()>
	//*  28   63:aload_1         
	//*  29   64:invokevirtual   #138 <Method int View.getRight()>
	//*  30   67:aload_1         
	//*  31   68:invokevirtual   #141 <Method int View.getBottom()>
	//*  32   71:invokevirtual   #148 <Method boolean Rect.intersects(int, int, int, int)>
	//*  33   74:ifne            82
				flag = true;
	//   34   77:iconst_1        
	//   35   78:istore_3        
			else
	//*  36   79:goto            84
				flag = false;
	//   37   82:iconst_0        
	//   38   83:istore_3        
		}
		super.offsetLeftAndRight(view, i);
	//   39   84:aload_0         
	//   40   85:aload_1         
	//   41   86:iload_2         
	//   42   87:invokespecial   #150 <Method void ViewCompat$ViewCompatApi19Impl.offsetLeftAndRight(View, int)>
		if(flag && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))
	//*  43   90:iload_3         
	//*  44   91:ifeq            128
	//*  45   94:aload           4
	//*  46   96:aload_1         
	//*  47   97:invokevirtual   #132 <Method int View.getLeft()>
	//*  48  100:aload_1         
	//*  49  101:invokevirtual   #135 <Method int View.getTop()>
	//*  50  104:aload_1         
	//*  51  105:invokevirtual   #138 <Method int View.getRight()>
	//*  52  108:aload_1         
	//*  53  109:invokevirtual   #141 <Method int View.getBottom()>
	//*  54  112:invokevirtual   #153 <Method boolean Rect.intersect(int, int, int, int)>
	//*  55  115:ifeq            128
			((View)viewparent).invalidate(rect);
	//   56  118:aload           5
	//   57  120:checkcast       #53  <Class View>
	//   58  123:aload           4
	//   59  125:invokevirtual   #157 <Method void View.invalidate(Rect)>
	//   60  128:return          
	}

	public void offsetTopAndBottom(View view, int i)
	{
		Rect rect = getEmptyTempRect();
	//    0    0:invokestatic    #124 <Method Rect getEmptyTempRect()>
	//    1    3:astore          4
		boolean flag = false;
	//    2    5:iconst_0        
	//    3    6:istore_3        
		android.view.ViewParent viewparent = view.getParent();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #128 <Method android.view.ViewParent View.getParent()>
	//    6   11:astore          5
		if(viewparent instanceof View)
	//*   7   13:aload           5
	//*   8   15:instanceof      #53  <Class View>
	//*   9   18:ifeq            84
		{
			View view1 = (View)viewparent;
	//   10   21:aload           5
	//   11   23:checkcast       #53  <Class View>
	//   12   26:astore          6
			rect.set(view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom());
	//   13   28:aload           4
	//   14   30:aload           6
	//   15   32:invokevirtual   #132 <Method int View.getLeft()>
	//   16   35:aload           6
	//   17   37:invokevirtual   #135 <Method int View.getTop()>
	//   18   40:aload           6
	//   19   42:invokevirtual   #138 <Method int View.getRight()>
	//   20   45:aload           6
	//   21   47:invokevirtual   #141 <Method int View.getBottom()>
	//   22   50:invokevirtual   #144 <Method void Rect.set(int, int, int, int)>
			if(!rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))
	//*  23   53:aload           4
	//*  24   55:aload_1         
	//*  25   56:invokevirtual   #132 <Method int View.getLeft()>
	//*  26   59:aload_1         
	//*  27   60:invokevirtual   #135 <Method int View.getTop()>
	//*  28   63:aload_1         
	//*  29   64:invokevirtual   #138 <Method int View.getRight()>
	//*  30   67:aload_1         
	//*  31   68:invokevirtual   #141 <Method int View.getBottom()>
	//*  32   71:invokevirtual   #148 <Method boolean Rect.intersects(int, int, int, int)>
	//*  33   74:ifne            82
				flag = true;
	//   34   77:iconst_1        
	//   35   78:istore_3        
			else
	//*  36   79:goto            84
				flag = false;
	//   37   82:iconst_0        
	//   38   83:istore_3        
		}
		super.offsetTopAndBottom(view, i);
	//   39   84:aload_0         
	//   40   85:aload_1         
	//   41   86:iload_2         
	//   42   87:invokespecial   #160 <Method void ViewCompat$ViewCompatApi19Impl.offsetTopAndBottom(View, int)>
		if(flag && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))
	//*  43   90:iload_3         
	//*  44   91:ifeq            128
	//*  45   94:aload           4
	//*  46   96:aload_1         
	//*  47   97:invokevirtual   #132 <Method int View.getLeft()>
	//*  48  100:aload_1         
	//*  49  101:invokevirtual   #135 <Method int View.getTop()>
	//*  50  104:aload_1         
	//*  51  105:invokevirtual   #138 <Method int View.getRight()>
	//*  52  108:aload_1         
	//*  53  109:invokevirtual   #141 <Method int View.getBottom()>
	//*  54  112:invokevirtual   #153 <Method boolean Rect.intersect(int, int, int, int)>
	//*  55  115:ifeq            128
			((View)viewparent).invalidate(rect);
	//   56  118:aload           5
	//   57  120:checkcast       #53  <Class View>
	//   58  123:aload           4
	//   59  125:invokevirtual   #157 <Method void View.invalidate(Rect)>
	//   60  128:return          
	}

	public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		windowinsetscompat = ((WindowInsetsCompat) ((WindowInsets)WindowInsetsCompat.unwrap(windowinsetscompat)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #49  <Method Object WindowInsetsCompat.unwrap(WindowInsetsCompat)>
	//    2    4:checkcast       #51  <Class WindowInsets>
	//    3    7:astore_2        
		WindowInsets windowinsets = view.onApplyWindowInsets(((WindowInsets) (windowinsetscompat)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #163 <Method WindowInsets View.onApplyWindowInsets(WindowInsets)>
	//    7   13:astore_3        
		view = ((View) (windowinsetscompat));
	//    8   14:aload_2         
	//    9   15:astore_1        
		if(windowinsets != windowinsetscompat)
	//*  10   16:aload_3         
	//*  11   17:aload_2         
	//*  12   18:if_acmpeq       30
			view = ((View) (new WindowInsets(windowinsets)));
	//   13   21:new             #51  <Class WindowInsets>
	//   14   24:dup             
	//   15   25:aload_3         
	//   16   26:invokespecial   #59  <Method void WindowInsets(WindowInsets)>
	//   17   29:astore_1        
		return WindowInsetsCompat.wrap(((Object) (view)));
	//   18   30:aload_1         
	//   19   31:invokestatic    #63  <Method WindowInsetsCompat WindowInsetsCompat.wrap(Object)>
	//   20   34:areturn         
	}

	public void requestApplyInsets(View view)
	{
		view.requestApplyInsets();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #167 <Method void View.requestApplyInsets()>
	//    2    4:return          
	}

	public void setBackgroundTintList(View view, ColorStateList colorstatelist)
	{
		view.setBackgroundTintList(colorstatelist);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #172 <Method void View.setBackgroundTintList(ColorStateList)>
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   3    5:getstatic       #178 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpne          68
		{
			colorstatelist = ((ColorStateList) (view.getBackground()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #182 <Method Drawable View.getBackground()>
	//    8   17:astore_2        
			boolean flag;
			if(view.getBackgroundTintList() != null && view.getBackgroundTintMode() != null)
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #88  <Method ColorStateList View.getBackgroundTintList()>
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
	//*  25   48:invokevirtual   #187 <Method boolean Drawable.isStateful()>
	//*  26   51:ifeq            63
					((Drawable) (colorstatelist)).setState(view.getDrawableState());
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #191 <Method int[] View.getDrawableState()>
	//   30   59:invokevirtual   #195 <Method boolean Drawable.setState(int[])>
	//   31   62:pop             
				view.setBackground(((Drawable) (colorstatelist)));
	//   32   63:aload_1         
	//   33   64:aload_2         
	//   34   65:invokevirtual   #199 <Method void View.setBackground(Drawable)>
			}
		}
	//   35   68:return          
	}

	public void setBackgroundTintMode(View view, android.graphics.PorterDuff.Mode mode)
	{
		view.setBackgroundTintMode(mode);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #204 <Method void View.setBackgroundTintMode(android.graphics.PorterDuff$Mode)>
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   3    5:getstatic       #178 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpne          68
		{
			mode = ((android.graphics.PorterDuff.Mode) (view.getBackground()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #182 <Method Drawable View.getBackground()>
	//    8   17:astore_2        
			boolean flag;
			if(view.getBackgroundTintList() != null && view.getBackgroundTintMode() != null)
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #88  <Method ColorStateList View.getBackgroundTintList()>
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
	//*  25   48:invokevirtual   #187 <Method boolean Drawable.isStateful()>
	//*  26   51:ifeq            63
					((Drawable) (mode)).setState(view.getDrawableState());
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #191 <Method int[] View.getDrawableState()>
	//   30   59:invokevirtual   #195 <Method boolean Drawable.setState(int[])>
	//   31   62:pop             
				view.setBackground(((Drawable) (mode)));
	//   32   63:aload_1         
	//   33   64:aload_2         
	//   34   65:invokevirtual   #199 <Method void View.setBackground(Drawable)>
			}
		}
	//   35   68:return          
	}

	public void setElevation(View view, float f)
	{
		view.setElevation(f);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:invokevirtual   #209 <Method void View.setElevation(float)>
	//    3    5:return          
	}

	public void setNestedScrollingEnabled(View view, boolean flag)
	{
		view.setNestedScrollingEnabled(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #214 <Method void View.setNestedScrollingEnabled(boolean)>
	//    3    5:return          
	}

	public void setOnApplyWindowInsetsListener(View view, final OnApplyWindowInsetsListener listener)
	{
		if(listener == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			view.setOnApplyWindowInsetsListener(((android.view.r) (null)));
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #219 <Method void View.setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
			return;
	//    5    9:return          
		} else
		{
			view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() {

				public WindowInsets onApplyWindowInsets(View view1, WindowInsets windowinsets)
				{
					windowinsets = ((WindowInsets) (WindowInsetsCompat.wrap(((Object) (windowinsets)))));
				//    0    0:aload_2         
				//    1    1:invokestatic    #36  <Method WindowInsetsCompat WindowInsetsCompat.wrap(Object)>
				//    2    4:astore_2        
					return (WindowInsets)WindowInsetsCompat.unwrap(listener.onApplyWindowInsets(view1, ((WindowInsetsCompat) (windowinsets))));
				//    3    5:aload_0         
				//    4    6:getfield        #24  <Field OnApplyWindowInsetsListener val$listener>
				//    5    9:aload_1         
				//    6   10:aload_2         
				//    7   11:invokeinterface #41  <Method WindowInsetsCompat OnApplyWindowInsetsListener.onApplyWindowInsets(View, WindowInsetsCompat)>
				//    8   16:invokestatic    #45  <Method Object WindowInsetsCompat.unwrap(WindowInsetsCompat)>
				//    9   19:checkcast       #47  <Class WindowInsets>
				//   10   22:areturn         
				}

				final ViewCompat.ViewCompatApi21Impl this$0;
				final OnApplyWindowInsetsListener val$listener;

			
			{
				this$0 = ViewCompat.ViewCompatApi21Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ViewCompat$ViewCompatApi21Impl this$0>
				listener = onapplywindowinsetslistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field OnApplyWindowInsetsListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   10:aload_1         
	//    7   11:new             #9   <Class ViewCompat$ViewCompatApi21Impl$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokespecial   #222 <Method void ViewCompat$ViewCompatApi21Impl$1(ViewCompat$ViewCompatApi21Impl, OnApplyWindowInsetsListener)>
	//   12   20:invokevirtual   #219 <Method void View.setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
			return;
	//   13   23:return          
		}
	}

	public void setTransitionName(View view, String s)
	{
		view.setTransitionName(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #227 <Method void View.setTransitionName(String)>
	//    3    5:return          
	}

	public void setTranslationZ(View view, float f)
	{
		view.setTranslationZ(f);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:invokevirtual   #230 <Method void View.setTranslationZ(float)>
	//    3    5:return          
	}

	public void setZ(View view, float f)
	{
		view.setZ(f);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:invokevirtual   #233 <Method void View.setZ(float)>
	//    3    5:return          
	}

	public boolean startNestedScroll(View view, int i)
	{
		return view.startNestedScroll(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #238 <Method boolean View.startNestedScroll(int)>
	//    3    5:ireturn         
	}

	public void stopNestedScroll(View view)
	{
		view.stopNestedScroll();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #241 <Method void View.stopNestedScroll()>
	//    2    4:return          
	}

	private static ThreadLocal sThreadLocalRect;

	ViewCompat$ViewCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ViewCompat$ViewCompatApi19Impl()>
	//    2    4:return          
	}
}
