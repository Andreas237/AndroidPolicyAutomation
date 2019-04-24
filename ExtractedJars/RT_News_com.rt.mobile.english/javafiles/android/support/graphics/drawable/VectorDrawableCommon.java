// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.graphics.drawable.TintAwareDrawable;

abstract class VectorDrawableCommon extends Drawable
	implements TintAwareDrawable
{

	VectorDrawableCommon()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Drawable()>
	//    2    4:return          
	}

	public void applyTheme(android.content.res.Resources.Theme theme)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.applyTheme(mDelegateDrawable, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #22  <Method void DrawableCompat.applyTheme(Drawable, android.content.res.Resources$Theme)>
			return;
	//    7   15:return          
		} else
		{
			return;
	//    8   16:return          
		}
	}

	public void clearColorFilter()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
		{
			mDelegateDrawable.clearColorFilter();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #25  <Method void Drawable.clearColorFilter()>
			return;
	//    6   14:return          
		} else
		{
			super.clearColorFilter();
	//    7   15:aload_0         
	//    8   16:invokespecial   #25  <Method void Drawable.clearColorFilter()>
			return;
	//    9   19:return          
		}
	}

	public ColorFilter getColorFilter()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.getColorFilter(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #30  <Method ColorFilter DrawableCompat.getColorFilter(Drawable)>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public Drawable getCurrent()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getCurrent();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #34  <Method Drawable Drawable.getCurrent()>
	//    6   14:areturn         
		else
			return super.getCurrent();
	//    7   15:aload_0         
	//    8   16:invokespecial   #34  <Method Drawable Drawable.getCurrent()>
	//    9   19:areturn         
	}

	public int getMinimumHeight()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getMinimumHeight();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #38  <Method int Drawable.getMinimumHeight()>
	//    6   14:ireturn         
		else
			return super.getMinimumHeight();
	//    7   15:aload_0         
	//    8   16:invokespecial   #38  <Method int Drawable.getMinimumHeight()>
	//    9   19:ireturn         
	}

	public int getMinimumWidth()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getMinimumWidth();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #41  <Method int Drawable.getMinimumWidth()>
	//    6   14:ireturn         
		else
			return super.getMinimumWidth();
	//    7   15:aload_0         
	//    8   16:invokespecial   #41  <Method int Drawable.getMinimumWidth()>
	//    9   19:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.getPadding(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #45  <Method boolean Drawable.getPadding(Rect)>
	//    7   15:ireturn         
		else
			return super.getPadding(rect);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #45  <Method boolean Drawable.getPadding(Rect)>
	//   11   21:ireturn         
	}

	public int[] getState()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getState();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #49  <Method int[] Drawable.getState()>
	//    6   14:areturn         
		else
			return super.getState();
	//    7   15:aload_0         
	//    8   16:invokespecial   #49  <Method int[] Drawable.getState()>
	//    9   19:areturn         
	}

	public Region getTransparentRegion()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getTransparentRegion();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #53  <Method Region Drawable.getTransparentRegion()>
	//    6   14:areturn         
		else
			return super.getTransparentRegion();
	//    7   15:aload_0         
	//    8   16:invokespecial   #53  <Method Region Drawable.getTransparentRegion()>
	//    9   19:areturn         
	}

	public void jumpToCurrentState()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
		{
			DrawableCompat.jumpToCurrentState(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #57  <Method void DrawableCompat.jumpToCurrentState(Drawable)>
			return;
	//    6   14:return          
		} else
		{
			return;
	//    7   15:return          
		}
	}

	protected void onBoundsChange(Rect rect)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setBounds(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #62  <Method void Drawable.setBounds(Rect)>
			return;
	//    7   15:return          
		} else
		{
			super.onBoundsChange(rect);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #64  <Method void Drawable.onBoundsChange(Rect)>
			return;
	//   11   21:return          
		}
	}

	protected boolean onLevelChange(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setLevel(i);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #69  <Method boolean Drawable.setLevel(int)>
	//    7   15:ireturn         
		else
			return super.onLevelChange(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #71  <Method boolean Drawable.onLevelChange(int)>
	//   11   21:ireturn         
	}

	public void setChangingConfigurations(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setChangingConfigurations(i);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #75  <Method void Drawable.setChangingConfigurations(int)>
			return;
	//    7   15:return          
		} else
		{
			super.setChangingConfigurations(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #75  <Method void Drawable.setChangingConfigurations(int)>
			return;
	//   11   21:return          
		}
	}

	public void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			mDelegateDrawable.setColorFilter(i, mode);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #79  <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//    8   16:return          
		} else
		{
			super.setColorFilter(i, mode);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #79  <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//   13   23:return          
		}
	}

	public void setFilterBitmap(boolean flag)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setFilterBitmap(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #83  <Method void Drawable.setFilterBitmap(boolean)>
			return;
	//    7   15:return          
		} else
		{
			return;
	//    8   16:return          
		}
	}

	public void setHotspot(float f, float f1)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			DrawableCompat.setHotspot(mDelegateDrawable, f, f1);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:fload_1         
	//    6   12:fload_2         
	//    7   13:invokestatic    #88  <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//    8   16:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          20
		{
			DrawableCompat.setHotspotBounds(mDelegateDrawable, i, j, k, l);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokestatic    #93  <Method void DrawableCompat.setHotspotBounds(Drawable, int, int, int, int)>
			return;
	//   10   19:return          
		} else
		{
			return;
	//   11   20:return          
		}
	}

	public boolean setState(int ai[])
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setState(ai);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #97  <Method boolean Drawable.setState(int[])>
	//    7   15:ireturn         
		else
			return super.setState(ai);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #97  <Method boolean Drawable.setState(int[])>
	//   11   21:ireturn         
	}

	Drawable mDelegateDrawable;
}
