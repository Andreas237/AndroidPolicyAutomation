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
//			WrappedDrawableApi14

class WrappedDrawableApi21 extends WrappedDrawableApi14
{
	private static class DrawableWrapperStateLollipop extends WrappedDrawableApi14.DrawableWrapperState
	{

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new WrappedDrawableApi21(((WrappedDrawableApi14.DrawableWrapperState) (this)), resources)));
		//    0    0:new             #6   <Class WrappedDrawableApi21>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #18  <Method void WrappedDrawableApi21(WrappedDrawableApi14$DrawableWrapperState, Resources)>
		//    5    9:areturn         
		}

		DrawableWrapperStateLollipop(WrappedDrawableApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
		{
			super(drawablewrapperstate, resources);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void WrappedDrawableApi14$DrawableWrapperState(WrappedDrawableApi14$DrawableWrapperState, Resources)>
		//    4    6:return          
		}
	}


	WrappedDrawableApi21(Drawable drawable)
	{
		super(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void WrappedDrawableApi14(Drawable)>
		findAndCacheIsProjectedDrawableMethod();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void findAndCacheIsProjectedDrawableMethod()>
	//    5    9:return          
	}

	WrappedDrawableApi21(WrappedDrawableApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
	{
		super(drawablewrapperstate, resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void WrappedDrawableApi14(WrappedDrawableApi14$DrawableWrapperState, Resources)>
		findAndCacheIsProjectedDrawableMethod();
	//    4    6:aload_0         
	//    5    7:invokespecial   #24  <Method void findAndCacheIsProjectedDrawableMethod()>
	//    6   10:return          
	}

	private void findAndCacheIsProjectedDrawableMethod()
	{
		if(sIsProjectedDrawableMethod == null)
	//*   0    0:getstatic       #32  <Field Method sIsProjectedDrawableMethod>
	//*   1    3:ifnonnull       31
			try
			{
				sIsProjectedDrawableMethod = ((Class) (android/graphics/drawable/Drawable)).getDeclaredMethod("isProjected", new Class[0]);
	//    2    6:ldc1            #34  <Class Drawable>
	//    3    8:ldc1            #36  <String "isProjected">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #42  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #32  <Field Method sIsProjectedDrawableMethod>
				return;
	//    8   20:return          
			}
			catch(Exception exception)
	//*   9   21:astore_1        
			{
				Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ((Throwable) (exception)));
	//   10   22:ldc1            #14  <String "WrappedDrawableApi21">
	//   11   24:ldc1            #44  <String "Failed to retrieve Drawable#isProjected() method">
	//   12   26:aload_1         
	//   13   27:invokestatic    #50  <Method int Log.w(String, String, Throwable)>
	//   14   30:pop             
			}
	//   15   31:return          
	}

	public Rect getDirtyBounds()
	{
		return mDrawable.getDirtyBounds();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #59  <Method Rect Drawable.getDirtyBounds()>
	//    3    7:areturn         
	}

	public void getOutline(Outline outline)
	{
		mDrawable.getOutline(outline);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method void Drawable.getOutline(Outline)>
	//    4    8:return          
	}

	protected boolean isCompatTintEnabled()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		if(i == 21)
	//*   4    6:iload_1         
	//*   5    7:bipush          21
	//*   6    9:icmpne          49
		{
			Drawable drawable = mDrawable;
	//    7   12:aload_0         
	//    8   13:getfield        #57  <Field Drawable mDrawable>
	//    9   16:astore_3        
			if((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable))
	//*  10   17:aload_3         
	//*  11   18:instanceof      #75  <Class GradientDrawable>
	//*  12   21:ifne            45
	//*  13   24:aload_3         
	//*  14   25:instanceof      #77  <Class DrawableContainer>
	//*  15   28:ifne            45
	//*  16   31:aload_3         
	//*  17   32:instanceof      #79  <Class InsetDrawable>
	//*  18   35:ifne            45
	//*  19   38:aload_3         
	//*  20   39:instanceof      #81  <Class RippleDrawable>
	//*  21   42:ifeq            47
				flag = true;
	//   22   45:iconst_1        
	//   23   46:istore_2        
			return flag;
	//   24   47:iload_2         
	//   25   48:ireturn         
		} else
		{
			return false;
	//   26   49:iconst_0        
	//   27   50:ireturn         
		}
	}

	public boolean isProjected()
	{
		Method method;
		if(mDrawable == null)
			break MISSING_BLOCK_LABEL_46;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Drawable mDrawable>
	//    2    4:ifnull          46
		method = sIsProjectedDrawableMethod;
	//    3    7:getstatic       #32  <Field Method sIsProjectedDrawableMethod>
	//    4   10:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_46;
	//    5   11:aload_2         
	//    6   12:ifnull          46
		boolean flag = ((Boolean)method.invoke(((Object) (mDrawable)), new Object[0])).booleanValue();
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #57  <Field Drawable mDrawable>
	//   10   20:iconst_0        
	//   11   21:anewarray       Object[]
	//   12   24:invokevirtual   #89  <Method Object Method.invoke(Object, Object[])>
	//   13   27:checkcast       #91  <Class Boolean>
	//   14   30:invokevirtual   #94  <Method boolean Boolean.booleanValue()>
	//   15   33:istore_1        
		return flag;
	//   16   34:iload_1         
	//   17   35:ireturn         
		Exception exception;
		exception;
	//   18   36:astore_2        
		Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", ((Throwable) (exception)));
	//   19   37:ldc1            #14  <String "WrappedDrawableApi21">
	//   20   39:ldc1            #96  <String "Error calling Drawable#isProjected() method">
	//   21   41:aload_2         
	//   22   42:invokestatic    #50  <Method int Log.w(String, String, Throwable)>
	//   23   45:pop             
		return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
	}

	WrappedDrawableApi14.DrawableWrapperState mutateConstantState()
	{
		return ((WrappedDrawableApi14.DrawableWrapperState) (new DrawableWrapperStateLollipop(mState, ((Resources) (null)))));
	//    0    0:new             #6   <Class WrappedDrawableApi21$DrawableWrapperStateLollipop>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #102 <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #103 <Method void WrappedDrawableApi21$DrawableWrapperStateLollipop(WrappedDrawableApi14$DrawableWrapperState, Resources)>
	//    6   12:areturn         
	}

	public void setHotspot(float f, float f1)
	{
		mDrawable.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Drawable mDrawable>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #107 <Method void Drawable.setHotspot(float, float)>
	//    5    9:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		mDrawable.setHotspotBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #111 <Method void Drawable.setHotspotBounds(int, int, int, int)>
	//    7   12:return          
	}

	public boolean setState(int ai[])
	{
		if(super.setState(ai))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #115 <Method boolean WrappedDrawableApi14.setState(int[])>
	//*   3    5:ifeq            14
		{
			invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #118 <Method void invalidateSelf()>
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
	//*   1    1:invokevirtual   #122 <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTint(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #124 <Method void WrappedDrawableApi14.setTint(int)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTint(i);
	//    7   13:aload_0         
	//    8   14:getfield        #57  <Field Drawable mDrawable>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #125 <Method void Drawable.setTint(int)>
			return;
	//   11   21:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #122 <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #129 <Method void WrappedDrawableApi14.setTintList(ColorStateList)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTintList(colorstatelist);
	//    7   13:aload_0         
	//    8   14:getfield        #57  <Field Drawable mDrawable>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #130 <Method void Drawable.setTintList(ColorStateList)>
			return;
	//   11   21:return          
		}
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #122 <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTintMode(mode);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #134 <Method void WrappedDrawableApi14.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTintMode(mode);
	//    7   13:aload_0         
	//    8   14:getfield        #57  <Field Drawable mDrawable>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #135 <Method void Drawable.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//   11   21:return          
		}
	}

	private static final String TAG = "WrappedDrawableApi21";
	private static Method sIsProjectedDrawableMethod;
}
