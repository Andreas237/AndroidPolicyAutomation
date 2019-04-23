// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;

public class DrawableWrapper extends Drawable
	implements android.graphics.drawable.Drawable.Callback
{

	public DrawableWrapper(Drawable drawable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Drawable()>
		setWrappedDrawable(drawable);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #20  <Method void setWrappedDrawable(Drawable)>
	//    5    9:return          
	}

	public void draw(Canvas canvas)
	{
		mDrawable.draw(canvas);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method void Drawable.draw(Canvas)>
	//    4    8:return          
	}

	public int getChangingConfigurations()
	{
		return mDrawable.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #31  <Method int Drawable.getChangingConfigurations()>
	//    3    7:ireturn         
	}

	public Drawable getCurrent()
	{
		return mDrawable.getCurrent();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #35  <Method Drawable Drawable.getCurrent()>
	//    3    7:areturn         
	}

	public int getIntrinsicHeight()
	{
		return mDrawable.getIntrinsicHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #38  <Method int Drawable.getIntrinsicHeight()>
	//    3    7:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return mDrawable.getIntrinsicWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #41  <Method int Drawable.getIntrinsicWidth()>
	//    3    7:ireturn         
	}

	public int getMinimumHeight()
	{
		return mDrawable.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #44  <Method int Drawable.getMinimumHeight()>
	//    3    7:ireturn         
	}

	public int getMinimumWidth()
	{
		return mDrawable.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #47  <Method int Drawable.getMinimumWidth()>
	//    3    7:ireturn         
	}

	public int getOpacity()
	{
		return mDrawable.getOpacity();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #50  <Method int Drawable.getOpacity()>
	//    3    7:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		return mDrawable.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method boolean Drawable.getPadding(Rect)>
	//    4    8:ireturn         
	}

	public int[] getState()
	{
		return mDrawable.getState();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #58  <Method int[] Drawable.getState()>
	//    3    7:areturn         
	}

	public Region getTransparentRegion()
	{
		return mDrawable.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #62  <Method Region Drawable.getTransparentRegion()>
	//    3    7:areturn         
	}

	public Drawable getWrappedDrawable()
	{
		return mDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:areturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		invalidateSelf();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method void invalidateSelf()>
	//    2    4:return          
	}

	public boolean isAutoMirrored()
	{
		return DrawableCompat.isAutoMirrored(mDrawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokestatic    #74  <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//    3    7:ireturn         
	}

	public boolean isStateful()
	{
		return mDrawable.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #77  <Method boolean Drawable.isStateful()>
	//    3    7:ireturn         
	}

	public void jumpToCurrentState()
	{
		DrawableCompat.jumpToCurrentState(mDrawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:invokestatic    #80  <Method void DrawableCompat.jumpToCurrentState(Drawable)>
	//    3    7:return          
	}

	protected void onBoundsChange(Rect rect)
	{
		mDrawable.setBounds(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #85  <Method void Drawable.setBounds(Rect)>
	//    4    8:return          
	}

	protected boolean onLevelChange(int i)
	{
		return mDrawable.setLevel(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #90  <Method boolean Drawable.setLevel(int)>
	//    4    8:ireturn         
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		scheduleSelf(runnable, l);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:lload_3         
	//    3    3:invokevirtual   #96  <Method void scheduleSelf(Runnable, long)>
	//    4    6:return          
	}

	public void setAlpha(int i)
	{
		mDrawable.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #100 <Method void Drawable.setAlpha(int)>
	//    4    8:return          
	}

	public void setAutoMirrored(boolean flag)
	{
		DrawableCompat.setAutoMirrored(mDrawable, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokestatic    #105 <Method void DrawableCompat.setAutoMirrored(Drawable, boolean)>
	//    4    8:return          
	}

	public void setChangingConfigurations(int i)
	{
		mDrawable.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #108 <Method void Drawable.setChangingConfigurations(int)>
	//    4    8:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mDrawable.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method void Drawable.setColorFilter(ColorFilter)>
	//    4    8:return          
	}

	public void setDither(boolean flag)
	{
		mDrawable.setDither(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #115 <Method void Drawable.setDither(boolean)>
	//    4    8:return          
	}

	public void setFilterBitmap(boolean flag)
	{
		mDrawable.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #118 <Method void Drawable.setFilterBitmap(boolean)>
	//    4    8:return          
	}

	public void setHotspot(float f, float f1)
	{
		DrawableCompat.setHotspot(mDrawable, f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokestatic    #123 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//    5    9:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		DrawableCompat.setHotspotBounds(mDrawable, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokestatic    #128 <Method void DrawableCompat.setHotspotBounds(Drawable, int, int, int, int)>
	//    7   12:return          
	}

	public boolean setState(int ai[])
	{
		return mDrawable.setState(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #132 <Method boolean Drawable.setState(int[])>
	//    4    8:ireturn         
	}

	public void setTint(int i)
	{
		DrawableCompat.setTint(mDrawable, i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokestatic    #136 <Method void DrawableCompat.setTint(Drawable, int)>
	//    4    8:return          
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		DrawableCompat.setTintList(mDrawable, colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokestatic    #141 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
	//    4    8:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		DrawableCompat.setTintMode(mDrawable, mode);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokestatic    #146 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
	//    4    8:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		return super.setVisible(flag, flag1) || mDrawable.setVisible(flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #150 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    4    6:ifne            26
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field Drawable mDrawable>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #150 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   10   18:ifeq            24
	//   11   21:goto            26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	public void setWrappedDrawable(Drawable drawable)
	{
		Drawable drawable1 = mDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable mDrawable>
	//    2    4:astore_2        
		if(drawable1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #154 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mDrawable = drawable;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #25  <Field Drawable mDrawable>
		if(drawable != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          28
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #154 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//   16   28:return          
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		unscheduleSelf(runnable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #160 <Method void unscheduleSelf(Runnable)>
	//    3    5:return          
	}

	private Drawable mDrawable;
}
