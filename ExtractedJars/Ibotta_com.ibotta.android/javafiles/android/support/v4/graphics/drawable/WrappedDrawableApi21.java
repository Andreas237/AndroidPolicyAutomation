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
	//    2    2:invokespecial   #16  <Method void WrappedDrawableApi14(Drawable)>
		findAndCacheIsProjectedDrawableMethod();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void findAndCacheIsProjectedDrawableMethod()>
	//    5    9:return          
	}

	WrappedDrawableApi21(WrappedDrawableApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
	{
		super(drawablewrapperstate, resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void WrappedDrawableApi14(WrappedDrawableApi14$DrawableWrapperState, Resources)>
		findAndCacheIsProjectedDrawableMethod();
	//    4    6:aload_0         
	//    5    7:invokespecial   #20  <Method void findAndCacheIsProjectedDrawableMethod()>
	//    6   10:return          
	}

	private void findAndCacheIsProjectedDrawableMethod()
	{
		if(sIsProjectedDrawableMethod == null)
	//*   0    0:getstatic       #28  <Field Method sIsProjectedDrawableMethod>
	//*   1    3:ifnonnull       31
			try
			{
				sIsProjectedDrawableMethod = ((Class) (android/graphics/drawable/Drawable)).getDeclaredMethod("isProjected", new Class[0]);
	//    2    6:ldc1            #30  <Class Drawable>
	//    3    8:ldc1            #32  <String "isProjected">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #38  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #28  <Field Method sIsProjectedDrawableMethod>
				return;
	//    8   20:return          
			}
			catch(Exception exception)
	//*   9   21:astore_1        
			{
				Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ((Throwable) (exception)));
	//   10   22:ldc1            #40  <String "WrappedDrawableApi21">
	//   11   24:ldc1            #42  <String "Failed to retrieve Drawable#isProjected() method">
	//   12   26:aload_1         
	//   13   27:invokestatic    #48  <Method int Log.w(String, String, Throwable)>
	//   14   30:pop             
			}
	//   15   31:return          
	}

	public Rect getDirtyBounds()
	{
		return mDrawable.getDirtyBounds();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #57  <Method Rect Drawable.getDirtyBounds()>
	//    3    7:areturn         
	}

	public void getOutline(Outline outline)
	{
		mDrawable.getOutline(outline);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #62  <Method void Drawable.getOutline(Outline)>
	//    4    8:return          
	}

	protected boolean isCompatTintEnabled()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
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
	//    8   13:getfield        #55  <Field Drawable mDrawable>
	//    9   16:astore_3        
			if((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable))
	//*  10   17:aload_3         
	//*  11   18:instanceof      #73  <Class GradientDrawable>
	//*  12   21:ifne            45
	//*  13   24:aload_3         
	//*  14   25:instanceof      #75  <Class DrawableContainer>
	//*  15   28:ifne            45
	//*  16   31:aload_3         
	//*  17   32:instanceof      #77  <Class InsetDrawable>
	//*  18   35:ifne            45
	//*  19   38:aload_3         
	//*  20   39:instanceof      #79  <Class RippleDrawable>
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

	WrappedDrawableApi14.DrawableWrapperState mutateConstantState()
	{
		return ((WrappedDrawableApi14.DrawableWrapperState) (new DrawableWrapperStateLollipop(mState, ((Resources) (null)))));
	//    0    0:new             #6   <Class WrappedDrawableApi21$DrawableWrapperStateLollipop>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #86  <Method void WrappedDrawableApi21$DrawableWrapperStateLollipop(WrappedDrawableApi14$DrawableWrapperState, Resources)>
	//    6   12:areturn         
	}

	public void setHotspot(float f, float f1)
	{
		mDrawable.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Drawable mDrawable>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #90  <Method void Drawable.setHotspot(float, float)>
	//    5    9:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		mDrawable.setHotspotBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #94  <Method void Drawable.setHotspotBounds(int, int, int, int)>
	//    7   12:return          
	}

	public boolean setState(int ai[])
	{
		if(super.setState(ai))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #98  <Method boolean WrappedDrawableApi14.setState(int[])>
	//*   3    5:ifeq            14
		{
			invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #101 <Method void invalidateSelf()>
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
	//*   1    1:invokevirtual   #105 <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTint(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #107 <Method void WrappedDrawableApi14.setTint(int)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTint(i);
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field Drawable mDrawable>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #108 <Method void Drawable.setTint(int)>
			return;
	//   11   21:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #105 <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #112 <Method void WrappedDrawableApi14.setTintList(ColorStateList)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTintList(colorstatelist);
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field Drawable mDrawable>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #113 <Method void Drawable.setTintList(ColorStateList)>
			return;
	//   11   21:return          
		}
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #105 <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTintMode(mode);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #117 <Method void WrappedDrawableApi14.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTintMode(mode);
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field Drawable mDrawable>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #118 <Method void Drawable.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//   11   21:return          
		}
	}

	private static Method sIsProjectedDrawableMethod;
}
