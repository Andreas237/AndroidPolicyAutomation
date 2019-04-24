// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.*;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableWrapperApi19

class DrawableWrapperApi21 extends DrawableWrapperApi19
{
	static class DrawableWrapperStateLollipop extends DrawableWrapperApi14.DrawableWrapperState
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
	//    2    2:invokespecial   #14  <Method void DrawableWrapperApi19(Drawable)>
	//    3    5:return          
	}

	DrawableWrapperApi21(DrawableWrapperApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
	{
		super(drawablewrapperstate, resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void DrawableWrapperApi19(DrawableWrapperApi14$DrawableWrapperState, Resources)>
	//    4    6:return          
	}

	public Rect getDirtyBounds()
	{
		return mDrawable.getDirtyBounds();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #28  <Method Rect Drawable.getDirtyBounds()>
	//    3    7:areturn         
	}

	public void getOutline(Outline outline)
	{
		mDrawable.getOutline(outline);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method void Drawable.getOutline(Outline)>
	//    4    8:return          
	}

	protected boolean isCompatTintEnabled()
	{
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   0    0:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpne          38
		{
			Drawable drawable = mDrawable;
	//    3    8:aload_0         
	//    4    9:getfield        #24  <Field Drawable mDrawable>
	//    5   12:astore_1        
			return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable);
	//    6   13:aload_1         
	//    7   14:instanceof      #42  <Class GradientDrawable>
	//    8   17:ifne            34
	//    9   20:aload_1         
	//   10   21:instanceof      #44  <Class DrawableContainer>
	//   11   24:ifne            34
	//   12   27:aload_1         
	//   13   28:instanceof      #46  <Class InsetDrawable>
	//   14   31:ifeq            36
	//   15   34:iconst_1        
	//   16   35:ireturn         
	//   17   36:iconst_0        
	//   18   37:ireturn         
		} else
		{
			return false;
	//   19   38:iconst_0        
	//   20   39:ireturn         
		}
	}

	DrawableWrapperApi14.DrawableWrapperState mutateConstantState()
	{
		return ((DrawableWrapperApi14.DrawableWrapperState) (new DrawableWrapperStateLollipop(mState, ((Resources) (null)))));
	//    0    0:new             #6   <Class DrawableWrapperApi21$DrawableWrapperStateLollipop>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #54  <Method void DrawableWrapperApi21$DrawableWrapperStateLollipop(DrawableWrapperApi14$DrawableWrapperState, Resources)>
	//    6   12:areturn         
	}

	public void setHotspot(float f, float f1)
	{
		mDrawable.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Drawable mDrawable>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #59  <Method void Drawable.setHotspot(float, float)>
	//    5    9:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		mDrawable.setHotspotBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #63  <Method void Drawable.setHotspotBounds(int, int, int, int)>
	//    7   12:return          
	}

	public boolean setState(int ai[])
	{
		if(super.setState(ai))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #67  <Method boolean DrawableWrapperApi19.setState(int[])>
	//*   3    5:ifeq            14
		{
			invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #71  <Method void invalidateSelf()>
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
	//*   1    1:invokevirtual   #75  <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTint(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #77  <Method void DrawableWrapperApi19.setTint(int)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTint(i);
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field Drawable mDrawable>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #78  <Method void Drawable.setTint(int)>
			return;
	//   11   21:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #75  <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #82  <Method void DrawableWrapperApi19.setTintList(ColorStateList)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTintList(colorstatelist);
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field Drawable mDrawable>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #83  <Method void Drawable.setTintList(ColorStateList)>
			return;
	//   11   21:return          
		}
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #75  <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            13
		{
			super.setTintMode(mode);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #87  <Method void DrawableWrapperApi19.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//    6   12:return          
		} else
		{
			mDrawable.setTintMode(mode);
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field Drawable mDrawable>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #88  <Method void Drawable.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//   11   21:return          
		}
	}
}
