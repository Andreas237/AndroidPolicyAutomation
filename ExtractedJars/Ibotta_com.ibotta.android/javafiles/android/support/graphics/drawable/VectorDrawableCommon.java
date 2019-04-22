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
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			DrawableCompat.applyTheme(drawable, theme);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #22  <Method void DrawableCompat.applyTheme(Drawable, android.content.res.Resources$Theme)>
			return;
	//    8   14:return          
		} else
		{
			return;
	//    9   15:return          
		}
	}

	public void clearColorFilter()
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
		{
			drawable.clearColorFilter();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #25  <Method void Drawable.clearColorFilter()>
			return;
	//    7   13:return          
		} else
		{
			super.clearColorFilter();
	//    8   14:aload_0         
	//    9   15:invokespecial   #25  <Method void Drawable.clearColorFilter()>
			return;
	//   10   18:return          
		}
	}

	public ColorFilter getColorFilter()
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return DrawableCompat.getColorFilter(drawable);
	//    5    9:aload_1         
	//    6   10:invokestatic    #30  <Method ColorFilter DrawableCompat.getColorFilter(Drawable)>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public Drawable getCurrent()
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return drawable.getCurrent();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #34  <Method Drawable Drawable.getCurrent()>
	//    7   13:areturn         
		else
			return super.getCurrent();
	//    8   14:aload_0         
	//    9   15:invokespecial   #34  <Method Drawable Drawable.getCurrent()>
	//   10   18:areturn         
	}

	public int getMinimumHeight()
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return drawable.getMinimumHeight();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #38  <Method int Drawable.getMinimumHeight()>
	//    7   13:ireturn         
		else
			return super.getMinimumHeight();
	//    8   14:aload_0         
	//    9   15:invokespecial   #38  <Method int Drawable.getMinimumHeight()>
	//   10   18:ireturn         
	}

	public int getMinimumWidth()
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return drawable.getMinimumWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #41  <Method int Drawable.getMinimumWidth()>
	//    7   13:ireturn         
		else
			return super.getMinimumWidth();
	//    8   14:aload_0         
	//    9   15:invokespecial   #41  <Method int Drawable.getMinimumWidth()>
	//   10   18:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return drawable.getPadding(rect);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #45  <Method boolean Drawable.getPadding(Rect)>
	//    8   14:ireturn         
		else
			return super.getPadding(rect);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #45  <Method boolean Drawable.getPadding(Rect)>
	//   12   20:ireturn         
	}

	public int[] getState()
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return drawable.getState();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #49  <Method int[] Drawable.getState()>
	//    7   13:areturn         
		else
			return super.getState();
	//    8   14:aload_0         
	//    9   15:invokespecial   #49  <Method int[] Drawable.getState()>
	//   10   18:areturn         
	}

	public Region getTransparentRegion()
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return drawable.getTransparentRegion();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #53  <Method Region Drawable.getTransparentRegion()>
	//    7   13:areturn         
		else
			return super.getTransparentRegion();
	//    8   14:aload_0         
	//    9   15:invokespecial   #53  <Method Region Drawable.getTransparentRegion()>
	//   10   18:areturn         
	}

	public void jumpToCurrentState()
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
		{
			DrawableCompat.jumpToCurrentState(drawable);
	//    5    9:aload_1         
	//    6   10:invokestatic    #57  <Method void DrawableCompat.jumpToCurrentState(Drawable)>
			return;
	//    7   13:return          
		} else
		{
			return;
	//    8   14:return          
		}
	}

	protected void onBoundsChange(Rect rect)
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			drawable.setBounds(rect);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #62  <Method void Drawable.setBounds(Rect)>
			return;
	//    8   14:return          
		} else
		{
			super.onBoundsChange(rect);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #64  <Method void Drawable.onBoundsChange(Rect)>
			return;
	//   12   20:return          
		}
	}

	protected boolean onLevelChange(int i)
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return drawable.setLevel(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #69  <Method boolean Drawable.setLevel(int)>
	//    8   14:ireturn         
		else
			return super.onLevelChange(i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokespecial   #71  <Method boolean Drawable.onLevelChange(int)>
	//   12   20:ireturn         
	}

	public void setChangingConfigurations(int i)
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			drawable.setChangingConfigurations(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #75  <Method void Drawable.setChangingConfigurations(int)>
			return;
	//    8   14:return          
		} else
		{
			super.setChangingConfigurations(i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokespecial   #75  <Method void Drawable.setChangingConfigurations(int)>
			return;
	//   12   20:return          
		}
	}

	public void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_3        
		if(drawable != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
		{
			drawable.setColorFilter(i, mode);
	//    5    9:aload_3         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #79  <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//    9   15:return          
		} else
		{
			super.setColorFilter(i, mode);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:aload_2         
	//   13   19:invokespecial   #79  <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//   14   22:return          
		}
	}

	public void setFilterBitmap(boolean flag)
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			drawable.setFilterBitmap(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #83  <Method void Drawable.setFilterBitmap(boolean)>
			return;
	//    8   14:return          
		} else
		{
			return;
	//    9   15:return          
		}
	}

	public void setHotspot(float f, float f1)
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_3        
		if(drawable != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			DrawableCompat.setHotspot(drawable, f, f1);
	//    5    9:aload_3         
	//    6   10:fload_1         
	//    7   11:fload_2         
	//    8   12:invokestatic    #88  <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//    9   15:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore          5
		if(drawable != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          22
		{
			DrawableCompat.setHotspotBounds(drawable, i, j, k, l);
	//    5   11:aload           5
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokestatic    #93  <Method void DrawableCompat.setHotspotBounds(Drawable, int, int, int, int)>
			return;
	//   11   21:return          
		} else
		{
			return;
	//   12   22:return          
		}
	}

	public boolean setState(int ai[])
	{
		Drawable drawable = mDelegateDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Drawable mDelegateDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return drawable.setState(ai);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #97  <Method boolean Drawable.setState(int[])>
	//    8   14:ireturn         
		else
			return super.setState(ai);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #97  <Method boolean Drawable.setState(int[])>
	//   12   20:ireturn         
	}

	Drawable mDelegateDrawable;
}
