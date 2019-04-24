// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.*;
import android.util.Log;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableWrapperApi19

class DrawableWrapperApi21 extends DrawableWrapperApi19
{
	private static class DrawableWrapperStateLollipop extends DrawableWrapperApi14.DrawableWrapperState
	{

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new DrawableWrapperApi21(((DrawableWrapperApi14.DrawableWrapperState) (this)), resources)));
		//    0    0:new             #6   <Class DrawableWrapperApi21>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #17  <Method void DrawableWrapperApi21(DrawableWrapperApi14$DrawableWrapperState, Resources)>
		//    5    9:areturn         
		}

		DrawableWrapperStateLollipop(DrawableWrapperApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
		{
			super(drawablewrapperstate, resources);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void DrawableWrapperApi14$DrawableWrapperState(DrawableWrapperApi14$DrawableWrapperState, Resources)>
		//    4    6:return          
		}
	}


	DrawableWrapperApi21(Drawable drawable)
	{
		super(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void DrawableWrapperApi19(Drawable)>
		findAndCacheIsProjectedDrawableMethod();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void findAndCacheIsProjectedDrawableMethod()>
	//    5    9:return          
	}

	DrawableWrapperApi21(DrawableWrapperApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
	{
		super(drawablewrapperstate, resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void DrawableWrapperApi19(DrawableWrapperApi14$DrawableWrapperState, Resources)>
		findAndCacheIsProjectedDrawableMethod();
	//    4    6:aload_0         
	//    5    7:invokespecial   #24  <Method void findAndCacheIsProjectedDrawableMethod()>
	//    6   10:return          
	}

	private void findAndCacheIsProjectedDrawableMethod()
	{
		if(sIsProjectedDrawableMethod != null)
			break MISSING_BLOCK_LABEL_20;
	//    0    0:getstatic       #32  <Field Method sIsProjectedDrawableMethod>
	//    1    3:ifnonnull       20
		sIsProjectedDrawableMethod = ((Class) (android/graphics/drawable/Drawable)).getDeclaredMethod("isProjected", new Class[0]);
	//    2    6:ldc1            #34  <Class Drawable>
	//    3    8:ldc1            #36  <String "isProjected">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #42  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #32  <Field Method sIsProjectedDrawableMethod>
		return;
	//    8   20:return          
		Exception exception;
		exception;
	//    9   21:astore_1        
		Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", ((Throwable) (exception)));
	//   10   22:ldc1            #14  <String "DrawableWrapperApi21">
	//   11   24:ldc1            #44  <String "Failed to retrieve Drawable#isProjected() method">
	//   12   26:aload_1         
	//   13   27:invokestatic    #50  <Method int Log.w(String, String, Throwable)>
	//   14   30:pop             
		return;
	//   15   31:return          
	}

	public Rect getDirtyBounds()
	{
		return mDrawable.getDirtyBounds();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #58  <Method Rect Drawable.getDirtyBounds()>
	//    3    7:areturn         
	}

	public void getOutline(Outline outline)
	{
		mDrawable.getOutline(outline);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #62  <Method void Drawable.getOutline(Outline)>
	//    4    8:return          
	}

	protected boolean isCompatTintEnabled()
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
			flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
			if(android.os.Build.VERSION.SDK_INT != 21)
				break label0;
	//    4    4:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
	//    5    7:bipush          21
	//    6    9:icmpne          49
			Drawable drawable = mDrawable;
	//    7   12:aload_0         
	//    8   13:getfield        #56  <Field Drawable mDrawable>
	//    9   16:astore_3        
			if(!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable))
	//*  10   17:aload_3         
	//*  11   18:instanceof      #72  <Class GradientDrawable>
	//*  12   21:ifne            47
	//*  13   24:aload_3         
	//*  14   25:instanceof      #74  <Class DrawableContainer>
	//*  15   28:ifne            47
	//*  16   31:aload_3         
	//*  17   32:instanceof      #76  <Class InsetDrawable>
	//*  18   35:ifne            47
			{
				flag = flag1;
	//   19   38:iload_2         
	//   20   39:istore_1        
				if(!(drawable instanceof RippleDrawable))
					break label0;
	//   21   40:aload_3         
	//   22   41:instanceof      #78  <Class RippleDrawable>
	//   23   44:ifeq            49
			}
			flag = true;
	//   24   47:iconst_1        
	//   25   48:istore_1        
		}
		return flag;
	//   26   49:iload_1         
	//   27   50:ireturn         
	}

	public boolean isProjected()
	{
		if(mDrawable == null || sIsProjectedDrawableMethod == null)
			break MISSING_BLOCK_LABEL_46;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Drawable mDrawable>
	//    2    4:ifnull          46
	//    3    7:getstatic       #32  <Field Method sIsProjectedDrawableMethod>
	//    4   10:ifnull          46
		boolean flag = ((Boolean)sIsProjectedDrawableMethod.invoke(((Object) (mDrawable)), new Object[0])).booleanValue();
	//    5   13:getstatic       #32  <Field Method sIsProjectedDrawableMethod>
	//    6   16:aload_0         
	//    7   17:getfield        #56  <Field Drawable mDrawable>
	//    8   20:iconst_0        
	//    9   21:anewarray       Object[]
	//   10   24:invokevirtual   #89  <Method Object Method.invoke(Object, Object[])>
	//   11   27:checkcast       #91  <Class Boolean>
	//   12   30:invokevirtual   #94  <Method boolean Boolean.booleanValue()>
	//   13   33:istore_1        
		return flag;
	//   14   34:iload_1         
	//   15   35:ireturn         
		Exception exception;
		exception;
	//   16   36:astore_2        
		Log.w("DrawableWrapperApi21", "Error calling Drawable#isProjected() method", ((Throwable) (exception)));
	//   17   37:ldc1            #14  <String "DrawableWrapperApi21">
	//   18   39:ldc1            #96  <String "Error calling Drawable#isProjected() method">
	//   19   41:aload_2         
	//   20   42:invokestatic    #50  <Method int Log.w(String, String, Throwable)>
	//   21   45:pop             
		return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	DrawableWrapperApi14.DrawableWrapperState mutateConstantState()
	{
		return ((DrawableWrapperApi14.DrawableWrapperState) (new DrawableWrapperStateLollipop(mState, ((Resources) (null)))));
	//    0    0:new             #6   <Class DrawableWrapperApi21$DrawableWrapperStateLollipop>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #104 <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #105 <Method void DrawableWrapperApi21$DrawableWrapperStateLollipop(DrawableWrapperApi14$DrawableWrapperState, Resources)>
	//    6   12:areturn         
	}

	public void setHotspot(float f, float f1)
	{
		mDrawable.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Drawable mDrawable>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #109 <Method void Drawable.setHotspot(float, float)>
	//    5    9:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		mDrawable.setHotspotBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #113 <Method void Drawable.setHotspotBounds(int, int, int, int)>
	//    7   12:return          
	}

	public boolean setState(int ai[])
	{
		if(super.setState(ai))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #117 <Method boolean DrawableWrapperApi19.setState(int[])>
	//*   3    5:ifeq            14
		{
			invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #120 <Method void invalidateSelf()>
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		} else
		{
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		}
	}

	public void setTint(int i)
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #124 <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTint(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #126 <Method void DrawableWrapperApi19.setTint(int)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTint(i);
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field Drawable mDrawable>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #127 <Method void Drawable.setTint(int)>
			return;
	//   11   21:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #124 <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #131 <Method void DrawableWrapperApi19.setTintList(ColorStateList)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTintList(colorstatelist);
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field Drawable mDrawable>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #132 <Method void Drawable.setTintList(ColorStateList)>
			return;
	//   11   21:return          
		}
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #124 <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTintMode(mode);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #136 <Method void DrawableWrapperApi19.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTintMode(mode);
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field Drawable mDrawable>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #137 <Method void Drawable.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//   11   21:return          
		}
	}

	private static final String TAG = "DrawableWrapperApi21";
	private static Method sIsProjectedDrawableMethod;
}
