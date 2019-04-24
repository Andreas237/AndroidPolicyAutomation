// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.util.Log;
import android.view.*;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.*;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//			ViewCompat, ViewPropertyAnimatorCompat, NestedScrollingChild, TintableBackgroundView, 
//			AccessibilityDelegateCompat, ViewCompatICS, WindowInsetsCompat, OnApplyWindowInsetsListener, 
//			PointerIconCompat

static class ViewCompat$ViewCompatBaseImpl
{

	private void bindTempDetach()
	{
		try
		{
			mDispatchStartTemporaryDetach = ((Class) (android/view/View)).getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
	//    0    0:aload_0         
	//    1    1:ldc1            #40  <Class View>
	//    2    3:ldc1            #42  <String "dispatchStartTemporaryDetach">
	//    3    5:iconst_0        
	//    4    6:anewarray       Class[]
	//    5    9:invokevirtual   #48  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    6   12:putfield        #50  <Field Method mDispatchStartTemporaryDetach>
			mDispatchFinishTemporaryDetach = ((Class) (android/view/View)).getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
	//    7   15:aload_0         
	//    8   16:ldc1            #40  <Class View>
	//    9   18:ldc1            #52  <String "dispatchFinishTemporaryDetach">
	//   10   20:iconst_0        
	//   11   21:anewarray       Class[]
	//   12   24:invokevirtual   #48  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   13   27:putfield        #54  <Field Method mDispatchFinishTemporaryDetach>
		}
	//*  14   30:goto            43
		catch(NoSuchMethodException nosuchmethodexception)
	//*  15   33:astore_1        
		{
			Log.e("ViewCompat", "Couldn't find method", ((Throwable) (nosuchmethodexception)));
	//   16   34:ldc1            #56  <String "ViewCompat">
	//   17   36:ldc1            #58  <String "Couldn't find method">
	//   18   38:aload_1         
	//   19   39:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   20   42:pop             
		}
		mTempDetachBound = true;
	//   21   43:aload_0         
	//   22   44:iconst_1        
	//   23   45:putfield        #66  <Field boolean mTempDetachBound>
	//   24   48:return          
	}

	private static void tickleInvalidationFlag(View view)
	{
		float f = view.getTranslationY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method float View.getTranslationY()>
	//    2    4:fstore_1        
		view.setTranslationY(1.0F + f);
	//    3    5:aload_0         
	//    4    6:fconst_1        
	//    5    7:fload_1         
	//    6    8:fadd            
	//    7    9:invokevirtual   #76  <Method void View.setTranslationY(float)>
		view.setTranslationY(f);
	//    8   12:aload_0         
	//    9   13:fload_1         
	//   10   14:invokevirtual   #76  <Method void View.setTranslationY(float)>
	//   11   17:return          
	}

	public ViewPropertyAnimatorCompat animate(View view)
	{
		if(mViewPropertyAnimatorCompatMap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field WeakHashMap mViewPropertyAnimatorCompatMap>
	//*   2    4:ifnonnull       18
			mViewPropertyAnimatorCompatMap = new WeakHashMap();
	//    3    7:aload_0         
	//    4    8:new             #80  <Class WeakHashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #81  <Method void WeakHashMap()>
	//    7   15:putfield        #35  <Field WeakHashMap mViewPropertyAnimatorCompatMap>
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = (ViewPropertyAnimatorCompat)mViewPropertyAnimatorCompatMap.get(((Object) (view)));
	//    8   18:aload_0         
	//    9   19:getfield        #35  <Field WeakHashMap mViewPropertyAnimatorCompatMap>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #85  <Method Object WeakHashMap.get(Object)>
	//   12   26:checkcast       #87  <Class ViewPropertyAnimatorCompat>
	//   13   29:astore_3        
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat = viewpropertyanimatorcompat1;
	//   14   30:aload_3         
	//   15   31:astore_2        
		if(viewpropertyanimatorcompat1 == null)
	//*  16   32:aload_3         
	//*  17   33:ifnonnull       55
		{
			viewpropertyanimatorcompat = new ViewPropertyAnimatorCompat(view);
	//   18   36:new             #87  <Class ViewPropertyAnimatorCompat>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:invokespecial   #89  <Method void ViewPropertyAnimatorCompat(View)>
	//   22   44:astore_2        
			mViewPropertyAnimatorCompatMap.put(((Object) (view)), ((Object) (viewpropertyanimatorcompat)));
	//   23   45:aload_0         
	//   24   46:getfield        #35  <Field WeakHashMap mViewPropertyAnimatorCompatMap>
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #93  <Method Object WeakHashMap.put(Object, Object)>
	//   28   54:pop             
		}
		return viewpropertyanimatorcompat;
	//   29   55:aload_2         
	//   30   56:areturn         
	}

	public void cancelDragAndDrop(View view)
	{
	//    0    0:return          
	}

	public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		return windowinsetscompat;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public void dispatchFinishTemporaryDetach(View view)
	{
		if(!mTempDetachBound)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field boolean mTempDetachBound>
	//*   2    4:ifne            11
			bindTempDetach();
	//    3    7:aload_0         
	//    4    8:invokespecial   #100 <Method void bindTempDetach()>
		if(mDispatchFinishTemporaryDetach != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #54  <Field Method mDispatchFinishTemporaryDetach>
	//*   7   15:ifnull          43
		{
			try
			{
				mDispatchFinishTemporaryDetach.invoke(((Object) (view)), new Object[0]);
	//    8   18:aload_0         
	//    9   19:getfield        #54  <Field Method mDispatchFinishTemporaryDetach>
	//   10   22:aload_1         
	//   11   23:iconst_0        
	//   12   24:anewarray       Object[]
	//   13   27:invokevirtual   #106 <Method Object Method.invoke(Object, Object[])>
	//   14   30:pop             
				return;
	//   15   31:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  16   32:astore_1        
			{
				Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", ((Throwable) (view)));
	//   17   33:ldc1            #56  <String "ViewCompat">
	//   18   35:ldc1            #108 <String "Error calling dispatchFinishTemporaryDetach">
	//   19   37:aload_1         
	//   20   38:invokestatic    #111 <Method int Log.d(String, String, Throwable)>
	//   21   41:pop             
			}
			return;
	//   22   42:return          
		} else
		{
			view.onFinishTemporaryDetach();
	//   23   43:aload_1         
	//   24   44:invokevirtual   #114 <Method void View.onFinishTemporaryDetach()>
			return;
	//   25   47:return          
		}
	}

	public boolean dispatchNestedFling(View view, float f, float f1, boolean flag)
	{
		if(view instanceof NestedScrollingChild)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #118 <Class NestedScrollingChild>
	//*   2    4:ifeq            21
			return ((NestedScrollingChild)view).dispatchNestedFling(f, f1, flag);
	//    3    7:aload_1         
	//    4    8:checkcast       #118 <Class NestedScrollingChild>
	//    5   11:fload_2         
	//    6   12:fload_3         
	//    7   13:iload           4
	//    8   15:invokeinterface #121 <Method boolean NestedScrollingChild.dispatchNestedFling(float, float, boolean)>
	//    9   20:ireturn         
		else
			return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	public boolean dispatchNestedPreFling(View view, float f, float f1)
	{
		if(view instanceof NestedScrollingChild)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #118 <Class NestedScrollingChild>
	//*   2    4:ifeq            19
			return ((NestedScrollingChild)view).dispatchNestedPreFling(f, f1);
	//    3    7:aload_1         
	//    4    8:checkcast       #118 <Class NestedScrollingChild>
	//    5   11:fload_2         
	//    6   12:fload_3         
	//    7   13:invokeinterface #126 <Method boolean NestedScrollingChild.dispatchNestedPreFling(float, float)>
	//    8   18:ireturn         
		else
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[])
	{
		if(view instanceof NestedScrollingChild)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #118 <Class NestedScrollingChild>
	//*   2    4:ifeq            23
			return ((NestedScrollingChild)view).dispatchNestedPreScroll(i, j, ai, ai1);
	//    3    7:aload_1         
	//    4    8:checkcast       #118 <Class NestedScrollingChild>
	//    5   11:iload_2         
	//    6   12:iload_3         
	//    7   13:aload           4
	//    8   15:aload           5
	//    9   17:invokeinterface #131 <Method boolean NestedScrollingChild.dispatchNestedPreScroll(int, int, int[], int[])>
	//   10   22:ireturn         
		else
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[])
	{
		if(view instanceof NestedScrollingChild)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #118 <Class NestedScrollingChild>
	//*   2    4:ifeq            25
			return ((NestedScrollingChild)view).dispatchNestedScroll(i, j, k, l, ai);
	//    3    7:aload_1         
	//    4    8:checkcast       #118 <Class NestedScrollingChild>
	//    5   11:iload_2         
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:iload           5
	//    9   17:aload           6
	//   10   19:invokeinterface #136 <Method boolean NestedScrollingChild.dispatchNestedScroll(int, int, int, int, int[])>
	//   11   24:ireturn         
		else
			return false;
	//   12   25:iconst_0        
	//   13   26:ireturn         
	}

	public void dispatchStartTemporaryDetach(View view)
	{
		if(!mTempDetachBound)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field boolean mTempDetachBound>
	//*   2    4:ifne            11
			bindTempDetach();
	//    3    7:aload_0         
	//    4    8:invokespecial   #100 <Method void bindTempDetach()>
		if(mDispatchStartTemporaryDetach != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #50  <Field Method mDispatchStartTemporaryDetach>
	//*   7   15:ifnull          43
		{
			try
			{
				mDispatchStartTemporaryDetach.invoke(((Object) (view)), new Object[0]);
	//    8   18:aload_0         
	//    9   19:getfield        #50  <Field Method mDispatchStartTemporaryDetach>
	//   10   22:aload_1         
	//   11   23:iconst_0        
	//   12   24:anewarray       Object[]
	//   13   27:invokevirtual   #106 <Method Object Method.invoke(Object, Object[])>
	//   14   30:pop             
				return;
	//   15   31:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  16   32:astore_1        
			{
				Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", ((Throwable) (view)));
	//   17   33:ldc1            #56  <String "ViewCompat">
	//   18   35:ldc1            #138 <String "Error calling dispatchStartTemporaryDetach">
	//   19   37:aload_1         
	//   20   38:invokestatic    #111 <Method int Log.d(String, String, Throwable)>
	//   21   41:pop             
			}
			return;
	//   22   42:return          
		} else
		{
			view.onStartTemporaryDetach();
	//   23   43:aload_1         
	//   24   44:invokevirtual   #141 <Method void View.onStartTemporaryDetach()>
			return;
	//   25   47:return          
		}
	}

	public int getAccessibilityLiveRegion(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ColorStateList getBackgroundTintList(View view)
	{
		if(view instanceof TintableBackgroundView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #149 <Class TintableBackgroundView>
	//*   2    4:ifeq            17
			return ((TintableBackgroundView)view).getSupportBackgroundTintList();
	//    3    7:aload_1         
	//    4    8:checkcast       #149 <Class TintableBackgroundView>
	//    5   11:invokeinterface #153 <Method ColorStateList TintableBackgroundView.getSupportBackgroundTintList()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public android.graphics.PorterDuff.Mode getBackgroundTintMode(View view)
	{
		if(view instanceof TintableBackgroundView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #149 <Class TintableBackgroundView>
	//*   2    4:ifeq            17
			return ((TintableBackgroundView)view).getSupportBackgroundTintMode();
	//    3    7:aload_1         
	//    4    8:checkcast       #149 <Class TintableBackgroundView>
	//    5   11:invokeinterface #159 <Method android.graphics.PorterDuff$Mode TintableBackgroundView.getSupportBackgroundTintMode()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public Rect getClipBounds(View view)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Display getDisplay(View view)
	{
		if(isAttachedToWindow(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #167 <Method boolean isAttachedToWindow(View)>
	//*   3    5:ifeq            26
			return ((WindowManager)view.getContext().getSystemService("window")).getDefaultDisplay();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #171 <Method Context View.getContext()>
	//    6   12:ldc1            #173 <String "window">
	//    7   14:invokevirtual   #179 <Method Object Context.getSystemService(String)>
	//    8   17:checkcast       #181 <Class WindowManager>
	//    9   20:invokeinterface #185 <Method Display WindowManager.getDefaultDisplay()>
	//   10   25:areturn         
		else
			return null;
	//   11   26:aconst_null     
	//   12   27:areturn         
	}

	public float getElevation(View view)
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public boolean getFitsSystemWindows(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	long getFrameTime()
	{
		return ValueAnimator.getFrameDelay();
	//    0    0:invokestatic    #195 <Method long ValueAnimator.getFrameDelay()>
	//    1    3:lreturn         
	}

	public int getImportantForAccessibility(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getLabelFor(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getLayoutDirection(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getMinimumHeight(View view)
	{
		if(!sMinHeightFieldFetched)
	//*   0    0:getstatic       #203 <Field boolean sMinHeightFieldFetched>
	//*   1    3:ifne            31
		{
			try
			{
				sMinHeightField = ((Class) (android/view/View)).getDeclaredField("mMinHeight");
	//    2    6:ldc1            #40  <Class View>
	//    3    8:ldc1            #205 <String "mMinHeight">
	//    4   10:invokevirtual   #209 <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #211 <Field Field sMinHeightField>
				sMinHeightField.setAccessible(true);
	//    6   16:getstatic       #211 <Field Field sMinHeightField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #217 <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            27
			catch(NoSuchFieldException nosuchfieldexception) { }
	//   10   26:astore_3        
			sMinHeightFieldFetched = true;
	//   11   27:iconst_1        
	//   12   28:putstatic       #203 <Field boolean sMinHeightFieldFetched>
		}
		if(sMinHeightField == null)
			break MISSING_BLOCK_LABEL_54;
	//   13   31:getstatic       #211 <Field Field sMinHeightField>
	//   14   34:ifnull          54
		int i = ((Integer)sMinHeightField.get(((Object) (view)))).intValue();
	//   15   37:getstatic       #211 <Field Field sMinHeightField>
	//   16   40:aload_1         
	//   17   41:invokevirtual   #218 <Method Object Field.get(Object)>
	//   18   44:checkcast       #220 <Class Integer>
	//   19   47:invokevirtual   #224 <Method int Integer.intValue()>
	//   20   50:istore_2        
		return i;
	//   21   51:iload_2         
	//   22   52:ireturn         
		view;
	//   23   53:astore_1        
		return 0;
	//   24   54:iconst_0        
	//   25   55:ireturn         
	}

	public int getMinimumWidth(View view)
	{
		if(!sMinWidthFieldFetched)
	//*   0    0:getstatic       #227 <Field boolean sMinWidthFieldFetched>
	//*   1    3:ifne            31
		{
			try
			{
				sMinWidthField = ((Class) (android/view/View)).getDeclaredField("mMinWidth");
	//    2    6:ldc1            #40  <Class View>
	//    3    8:ldc1            #229 <String "mMinWidth">
	//    4   10:invokevirtual   #209 <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #231 <Field Field sMinWidthField>
				sMinWidthField.setAccessible(true);
	//    6   16:getstatic       #231 <Field Field sMinWidthField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #217 <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            27
			catch(NoSuchFieldException nosuchfieldexception) { }
	//   10   26:astore_3        
			sMinWidthFieldFetched = true;
	//   11   27:iconst_1        
	//   12   28:putstatic       #227 <Field boolean sMinWidthFieldFetched>
		}
		if(sMinWidthField == null)
			break MISSING_BLOCK_LABEL_54;
	//   13   31:getstatic       #231 <Field Field sMinWidthField>
	//   14   34:ifnull          54
		int i = ((Integer)sMinWidthField.get(((Object) (view)))).intValue();
	//   15   37:getstatic       #231 <Field Field sMinWidthField>
	//   16   40:aload_1         
	//   17   41:invokevirtual   #218 <Method Object Field.get(Object)>
	//   18   44:checkcast       #220 <Class Integer>
	//   19   47:invokevirtual   #224 <Method int Integer.intValue()>
	//   20   50:istore_2        
		return i;
	//   21   51:iload_2         
	//   22   52:ireturn         
		view;
	//   23   53:astore_1        
		return 0;
	//   24   54:iconst_0        
	//   25   55:ireturn         
	}

	public int getPaddingEnd(View view)
	{
		return view.getPaddingRight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #235 <Method int View.getPaddingRight()>
	//    2    4:ireturn         
	}

	public int getPaddingStart(View view)
	{
		return view.getPaddingLeft();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #239 <Method int View.getPaddingLeft()>
	//    2    4:ireturn         
	}

	public ViewParent getParentForAccessibility(View view)
	{
		return view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #245 <Method ViewParent View.getParent()>
	//    2    4:areturn         
	}

	public int getScrollIndicators(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getTransitionName(View view)
	{
		if(sTransitionNameMap == null)
	//*   0    0:getstatic       #250 <Field WeakHashMap sTransitionNameMap>
	//*   1    3:ifnonnull       8
			return null;
	//    2    6:aconst_null     
	//    3    7:areturn         
		else
			return (String)sTransitionNameMap.get(((Object) (view)));
	//    4    8:getstatic       #250 <Field WeakHashMap sTransitionNameMap>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #85  <Method Object WeakHashMap.get(Object)>
	//    7   15:checkcast       #252 <Class String>
	//    8   18:areturn         
	}

	public float getTranslationZ(View view)
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public int getWindowSystemUiVisibility(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public float getZ(View view)
	{
		return getTranslationZ(view) + getElevation(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #257 <Method float getTranslationZ(View)>
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #259 <Method float getElevation(View)>
	//    6   10:fadd            
	//    7   11:freturn         
	}

	public boolean hasAccessibilityDelegate(View view)
	{
		if(sAccessibilityDelegateCheckFailed)
	//*   0    0:getstatic       #29  <Field boolean sAccessibilityDelegateCheckFailed>
	//*   1    3:ifeq            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		if(sAccessibilityDelegateField == null)
	//*   4    8:getstatic       #264 <Field Field sAccessibilityDelegateField>
	//*   5   11:ifnonnull       42
			try
			{
				sAccessibilityDelegateField = ((Class) (android/view/View)).getDeclaredField("mAccessibilityDelegate");
	//    6   14:ldc1            #40  <Class View>
	//    7   16:ldc2            #266 <String "mAccessibilityDelegate">
	//    8   19:invokevirtual   #209 <Method Field Class.getDeclaredField(String)>
	//    9   22:putstatic       #264 <Field Field sAccessibilityDelegateField>
				sAccessibilityDelegateField.setAccessible(true);
	//   10   25:getstatic       #264 <Field Field sAccessibilityDelegateField>
	//   11   28:iconst_1        
	//   12   29:invokevirtual   #217 <Method void Field.setAccessible(boolean)>
			}
	//*  13   32:goto            42
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  14   35:astore_1        
			{
				sAccessibilityDelegateCheckFailed = true;
	//   15   36:iconst_1        
	//   16   37:putstatic       #29  <Field boolean sAccessibilityDelegateCheckFailed>
				return false;
	//   17   40:iconst_0        
	//   18   41:ireturn         
			}
		try
		{
			view = ((View) (sAccessibilityDelegateField.get(((Object) (view)))));
	//   19   42:getstatic       #264 <Field Field sAccessibilityDelegateField>
	//   20   45:aload_1         
	//   21   46:invokevirtual   #218 <Method Object Field.get(Object)>
	//   22   49:astore_1        
		}
	//*  23   50:aload_1         
	//*  24   51:ifnull          56
	//*  25   54:iconst_1        
	//*  26   55:ireturn         
	//*  27   56:iconst_0        
	//*  28   57:ireturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  29   58:astore_1        
		{
			sAccessibilityDelegateCheckFailed = true;
	//   30   59:iconst_1        
	//   31   60:putstatic       #29  <Field boolean sAccessibilityDelegateCheckFailed>
			return false;
	//   32   63:iconst_0        
	//   33   64:ireturn         
		}
		return view != null;
	}

	public boolean hasNestedScrollingParent(View view)
	{
		if(view instanceof NestedScrollingChild)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #118 <Class NestedScrollingChild>
	//*   2    4:ifeq            17
			return ((NestedScrollingChild)view).hasNestedScrollingParent();
	//    3    7:aload_1         
	//    4    8:checkcast       #118 <Class NestedScrollingChild>
	//    5   11:invokeinterface #270 <Method boolean NestedScrollingChild.hasNestedScrollingParent()>
	//    6   16:ireturn         
		else
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public boolean hasOnClickListeners(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean hasOverlappingRendering(View view)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean hasTransientState(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isAttachedToWindow(View view)
	{
		return view.getWindowToken() != null;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #277 <Method android.os.IBinder View.getWindowToken()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isImportantForAccessibility(View view)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isInLayout(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isLaidOut(View view)
	{
		return view.getWidth() > 0 && view.getHeight() > 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #283 <Method int View.getWidth()>
	//    2    4:ifle            16
	//    3    7:aload_1         
	//    4    8:invokevirtual   #286 <Method int View.getHeight()>
	//    5   11:ifle            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isLayoutDirectionResolved(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNestedScrollingEnabled(View view)
	{
		if(view instanceof NestedScrollingChild)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #118 <Class NestedScrollingChild>
	//*   2    4:ifeq            17
			return ((NestedScrollingChild)view).isNestedScrollingEnabled();
	//    3    7:aload_1         
	//    4    8:checkcast       #118 <Class NestedScrollingChild>
	//    5   11:invokeinterface #290 <Method boolean NestedScrollingChild.isNestedScrollingEnabled()>
	//    6   16:ireturn         
		else
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public boolean isPaddingRelative(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void offsetLeftAndRight(View view, int i)
	{
		view.offsetLeftAndRight(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #296 <Method void View.offsetLeftAndRight(int)>
		if(view.getVisibility() == 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #299 <Method int View.getVisibility()>
	//*   5    9:ifne            35
		{
			tickleInvalidationFlag(view);
	//    6   12:aload_1         
	//    7   13:invokestatic    #301 <Method void tickleInvalidationFlag(View)>
			view = ((View) (view.getParent()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #245 <Method ViewParent View.getParent()>
	//   10   20:astore_1        
			if(view instanceof View)
	//*  11   21:aload_1         
	//*  12   22:instanceof      #40  <Class View>
	//*  13   25:ifeq            35
				tickleInvalidationFlag((View)view);
	//   14   28:aload_1         
	//   15   29:checkcast       #40  <Class View>
	//   16   32:invokestatic    #301 <Method void tickleInvalidationFlag(View)>
		}
	//   17   35:return          
	}

	public void offsetTopAndBottom(View view, int i)
	{
		view.offsetTopAndBottom(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #304 <Method void View.offsetTopAndBottom(int)>
		if(view.getVisibility() == 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #299 <Method int View.getVisibility()>
	//*   5    9:ifne            35
		{
			tickleInvalidationFlag(view);
	//    6   12:aload_1         
	//    7   13:invokestatic    #301 <Method void tickleInvalidationFlag(View)>
			view = ((View) (view.getParent()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #245 <Method ViewParent View.getParent()>
	//   10   20:astore_1        
			if(view instanceof View)
	//*  11   21:aload_1         
	//*  12   22:instanceof      #40  <Class View>
	//*  13   25:ifeq            35
				tickleInvalidationFlag((View)view);
	//   14   28:aload_1         
	//   15   29:checkcast       #40  <Class View>
	//   16   32:invokestatic    #301 <Method void tickleInvalidationFlag(View)>
		}
	//   17   35:return          
	}

	public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		return windowinsetscompat;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		view.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)accessibilitynodeinfocompat.getInfo());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #313 <Method Object AccessibilityNodeInfoCompat.getInfo()>
	//    3    5:checkcast       #315 <Class AccessibilityNodeInfo>
	//    4    8:invokevirtual   #318 <Method void View.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
	//    5   11:return          
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void postInvalidateOnAnimation(View view)
	{
		view.invalidate();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #324 <Method void View.invalidate()>
	//    2    4:return          
	}

	public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
	{
		view.invalidate(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #328 <Method void View.invalidate(int, int, int, int)>
	//    6   10:return          
	}

	public void postOnAnimation(View view, Runnable runnable)
	{
		view.postDelayed(runnable, getFrameTime());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #332 <Method long getFrameTime()>
	//    4    6:invokevirtual   #336 <Method boolean View.postDelayed(Runnable, long)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void postOnAnimationDelayed(View view, Runnable runnable, long l)
	{
		view.postDelayed(runnable, getFrameTime() + l);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #332 <Method long getFrameTime()>
	//    4    6:lload_3         
	//    5    7:ladd            
	//    6    8:invokevirtual   #336 <Method boolean View.postDelayed(Runnable, long)>
	//    7   11:pop             
	//    8   12:return          
	}

	public void requestApplyInsets(View view)
	{
	//    0    0:return          
	}

	public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
	{
		if(accessibilitydelegatecompat == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			accessibilitydelegatecompat = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			accessibilitydelegatecompat = ((AccessibilityDelegateCompat) (accessibilitydelegatecompat.getBridge()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #348 <Method android.view.View$AccessibilityDelegate AccessibilityDelegateCompat.getBridge()>
	//    7   13:astore_2        
		view.setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (accessibilitydelegatecompat)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #351 <Method void View.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
	//   11   19:return          
	}

	public void setAccessibilityLiveRegion(View view, int i)
	{
	//    0    0:return          
	}

	public void setBackground(View view, Drawable drawable)
	{
		view.setBackgroundDrawable(drawable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #359 <Method void View.setBackgroundDrawable(Drawable)>
	//    3    5:return          
	}

	public void setBackgroundTintList(View view, ColorStateList colorstatelist)
	{
		if(view instanceof TintableBackgroundView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #149 <Class TintableBackgroundView>
	//*   2    4:ifeq            17
			((TintableBackgroundView)view).setSupportBackgroundTintList(colorstatelist);
	//    3    7:aload_1         
	//    4    8:checkcast       #149 <Class TintableBackgroundView>
	//    5   11:aload_2         
	//    6   12:invokeinterface #365 <Method void TintableBackgroundView.setSupportBackgroundTintList(ColorStateList)>
	//    7   17:return          
	}

	public void setBackgroundTintMode(View view, android.graphics.PorterDuff.Mode mode)
	{
		if(view instanceof TintableBackgroundView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #149 <Class TintableBackgroundView>
	//*   2    4:ifeq            17
			((TintableBackgroundView)view).setSupportBackgroundTintMode(mode);
	//    3    7:aload_1         
	//    4    8:checkcast       #149 <Class TintableBackgroundView>
	//    5   11:aload_2         
	//    6   12:invokeinterface #371 <Method void TintableBackgroundView.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    7   17:return          
	}

	public void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
	{
		if(sChildrenDrawingOrderMethod == null)
	//*   0    0:getstatic       #381 <Field Method sChildrenDrawingOrderMethod>
	//*   1    3:ifnonnull       49
		{
			try
			{
				sChildrenDrawingOrderMethod = ((Class) (android/view/ViewGroup)).getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
					Boolean.TYPE
				});
	//    2    6:ldc2            #383 <Class ViewGroup>
	//    3    9:ldc2            #384 <String "setChildrenDrawingOrderEnabled">
	//    4   12:iconst_1        
	//    5   13:anewarray       Class[]
	//    6   16:dup             
	//    7   17:iconst_0        
	//    8   18:getstatic       #390 <Field Class Boolean.TYPE>
	//    9   21:aastore         
	//   10   22:invokevirtual   #48  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   25:putstatic       #381 <Field Method sChildrenDrawingOrderMethod>
			}
	//*  12   28:goto            42
			catch(NoSuchMethodException nosuchmethodexception)
	//*  13   31:astore_3        
			{
				Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", ((Throwable) (nosuchmethodexception)));
	//   14   32:ldc1            #56  <String "ViewCompat">
	//   15   34:ldc2            #392 <String "Unable to find childrenDrawingOrderEnabled">
	//   16   37:aload_3         
	//   17   38:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   18   41:pop             
			}
			sChildrenDrawingOrderMethod.setAccessible(true);
	//   19   42:getstatic       #381 <Field Method sChildrenDrawingOrderMethod>
	//   20   45:iconst_1        
	//   21   46:invokevirtual   #393 <Method void Method.setAccessible(boolean)>
		}
		try
		{
			sChildrenDrawingOrderMethod.invoke(((Object) (viewgroup)), new Object[] {
				Boolean.valueOf(flag)
			});
	//   22   49:getstatic       #381 <Field Method sChildrenDrawingOrderMethod>
	//   23   52:aload_1         
	//   24   53:iconst_1        
	//   25   54:anewarray       Object[]
	//   26   57:dup             
	//   27   58:iconst_0        
	//   28   59:iload_2         
	//   29   60:invokestatic    #397 <Method Boolean Boolean.valueOf(boolean)>
	//   30   63:aastore         
	//   31   64:invokevirtual   #106 <Method Object Method.invoke(Object, Object[])>
	//   32   67:pop             
			return;
	//   33   68:return          
		}
		// Misplaced declaration of an exception variable
		catch(ViewGroup viewgroup)
	//*  34   69:astore_1        
		{
			Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable) (viewgroup)));
	//   35   70:ldc1            #56  <String "ViewCompat">
	//   36   72:ldc2            #399 <String "Unable to invoke childrenDrawingOrderEnabled">
	//   37   75:aload_1         
	//   38   76:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   39   79:pop             
			return;
	//   40   80:return          
		}
		// Misplaced declaration of an exception variable
		catch(ViewGroup viewgroup)
	//*  41   81:astore_1        
		{
			Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable) (viewgroup)));
	//   42   82:ldc1            #56  <String "ViewCompat">
	//   43   84:ldc2            #399 <String "Unable to invoke childrenDrawingOrderEnabled">
	//   44   87:aload_1         
	//   45   88:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   46   91:pop             
			return;
	//   47   92:return          
		}
		// Misplaced declaration of an exception variable
		catch(ViewGroup viewgroup)
	//*  48   93:astore_1        
		{
			Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable) (viewgroup)));
	//   49   94:ldc1            #56  <String "ViewCompat">
	//   50   96:ldc2            #399 <String "Unable to invoke childrenDrawingOrderEnabled">
	//   51   99:aload_1         
	//   52  100:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   53  103:pop             
		}
	//   54  104:return          
	}

	public void setClipBounds(View view, Rect rect)
	{
	//    0    0:return          
	}

	public void setElevation(View view, float f)
	{
	//    0    0:return          
	}

	public void setHasTransientState(View view, boolean flag)
	{
	//    0    0:return          
	}

	public void setImportantForAccessibility(View view, int i)
	{
	//    0    0:return          
	}

	public void setLabelFor(View view, int i)
	{
	//    0    0:return          
	}

	public void setLayerPaint(View view, Paint paint)
	{
		view.setLayerType(view.getLayerType(), paint);
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #412 <Method int View.getLayerType()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #416 <Method void View.setLayerType(int, Paint)>
		view.invalidate();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #324 <Method void View.invalidate()>
	//    7   13:return          
	}

	public void setLayoutDirection(View view, int i)
	{
	//    0    0:return          
	}

	public void setNestedScrollingEnabled(View view, boolean flag)
	{
		if(view instanceof NestedScrollingChild)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #118 <Class NestedScrollingChild>
	//*   2    4:ifeq            17
			((NestedScrollingChild)view).setNestedScrollingEnabled(flag);
	//    3    7:aload_1         
	//    4    8:checkcast       #118 <Class NestedScrollingChild>
	//    5   11:iload_2         
	//    6   12:invokeinterface #420 <Method void NestedScrollingChild.setNestedScrollingEnabled(boolean)>
	//    7   17:return          
	}

	public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
	{
	//    0    0:return          
	}

	public void setPaddingRelative(View view, int i, int j, int k, int l)
	{
		view.setPadding(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #426 <Method void View.setPadding(int, int, int, int)>
	//    6   10:return          
	}

	public void setPointerIcon(View view, PointerIconCompat pointericoncompat)
	{
	//    0    0:return          
	}

	public void setScrollIndicators(View view, int i)
	{
	//    0    0:return          
	}

	public void setScrollIndicators(View view, int i, int j)
	{
	//    0    0:return          
	}

	public void setTooltipText(View view, CharSequence charsequence)
	{
		ViewCompatICS.setTooltipText(view, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #436 <Method void ViewCompatICS.setTooltipText(View, CharSequence)>
	//    3    5:return          
	}

	public void setTransitionName(View view, String s)
	{
		if(sTransitionNameMap == null)
	//*   0    0:getstatic       #250 <Field WeakHashMap sTransitionNameMap>
	//*   1    3:ifnonnull       16
			sTransitionNameMap = new WeakHashMap();
	//    2    6:new             #80  <Class WeakHashMap>
	//    3    9:dup             
	//    4   10:invokespecial   #81  <Method void WeakHashMap()>
	//    5   13:putstatic       #250 <Field WeakHashMap sTransitionNameMap>
		sTransitionNameMap.put(((Object) (view)), ((Object) (s)));
	//    6   16:getstatic       #250 <Field WeakHashMap sTransitionNameMap>
	//    7   19:aload_1         
	//    8   20:aload_2         
	//    9   21:invokevirtual   #93  <Method Object WeakHashMap.put(Object, Object)>
	//   10   24:pop             
	//   11   25:return          
	}

	public void setTranslationZ(View view, float f)
	{
	//    0    0:return          
	}

	public void setZ(View view, float f)
	{
	//    0    0:return          
	}

	public boolean startDragAndDrop(View view, ClipData clipdata, android.view.View.DragShadowBuilder dragshadowbuilder, Object obj, int i)
	{
		return view.startDrag(clipdata, dragshadowbuilder, obj, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #446 <Method boolean View.startDrag(ClipData, android.view.View$DragShadowBuilder, Object, int)>
	//    6   10:ireturn         
	}

	public boolean startNestedScroll(View view, int i)
	{
		if(view instanceof NestedScrollingChild)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #118 <Class NestedScrollingChild>
	//*   2    4:ifeq            18
			return ((NestedScrollingChild)view).startNestedScroll(i);
	//    3    7:aload_1         
	//    4    8:checkcast       #118 <Class NestedScrollingChild>
	//    5   11:iload_2         
	//    6   12:invokeinterface #451 <Method boolean NestedScrollingChild.startNestedScroll(int)>
	//    7   17:ireturn         
		else
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public void stopNestedScroll(View view)
	{
		if(view instanceof NestedScrollingChild)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #118 <Class NestedScrollingChild>
	//*   2    4:ifeq            16
			((NestedScrollingChild)view).stopNestedScroll();
	//    3    7:aload_1         
	//    4    8:checkcast       #118 <Class NestedScrollingChild>
	//    5   11:invokeinterface #454 <Method void NestedScrollingChild.stopNestedScroll()>
	//    6   16:return          
	}

	public void updateDragShadow(View view, android.view.View.DragShadowBuilder dragshadowbuilder)
	{
	//    0    0:return          
	}

	static boolean sAccessibilityDelegateCheckFailed = false;
	static Field sAccessibilityDelegateField;
	private static Method sChildrenDrawingOrderMethod;
	private static Field sMinHeightField;
	private static boolean sMinHeightFieldFetched;
	private static Field sMinWidthField;
	private static boolean sMinWidthFieldFetched;
	private static WeakHashMap sTransitionNameMap;
	private Method mDispatchFinishTemporaryDetach;
	private Method mDispatchStartTemporaryDetach;
	private boolean mTempDetachBound;
	WeakHashMap mViewPropertyAnimatorCompatMap;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #29  <Field boolean sAccessibilityDelegateCheckFailed>
	//*   2    4:return          
	}

	ViewCompat$ViewCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mViewPropertyAnimatorCompatMap = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field WeakHashMap mViewPropertyAnimatorCompatMap>
	//    5    9:return          
	}
}
