// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//			WrappedDrawableApi14

class WrappedDrawableApi19 extends WrappedDrawableApi14
{
	private static class DrawableWrapperStateKitKat extends WrappedDrawableApi14.DrawableWrapperState
	{

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new WrappedDrawableApi19(((WrappedDrawableApi14.DrawableWrapperState) (this)), resources)));
		//    0    0:new             #6   <Class WrappedDrawableApi19>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #18  <Method void WrappedDrawableApi19(WrappedDrawableApi14$DrawableWrapperState, Resources)>
		//    5    9:areturn         
		}

		DrawableWrapperStateKitKat(WrappedDrawableApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
		{
			super(drawablewrapperstate, resources);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void WrappedDrawableApi14$DrawableWrapperState(WrappedDrawableApi14$DrawableWrapperState, Resources)>
		//    4    6:return          
		}
	}


	WrappedDrawableApi19(Drawable drawable)
	{
		super(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void WrappedDrawableApi14(Drawable)>
	//    3    5:return          
	}

	WrappedDrawableApi19(WrappedDrawableApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
	{
		super(drawablewrapperstate, resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void WrappedDrawableApi14(WrappedDrawableApi14$DrawableWrapperState, Resources)>
	//    4    6:return          
	}

	public boolean isAutoMirrored()
	{
		return mDrawable.isAutoMirrored();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Drawable mDrawable>
	//    2    4:invokevirtual   #28  <Method boolean Drawable.isAutoMirrored()>
	//    3    7:ireturn         
	}

	WrappedDrawableApi14.DrawableWrapperState mutateConstantState()
	{
		return ((WrappedDrawableApi14.DrawableWrapperState) (new DrawableWrapperStateKitKat(mState, ((Resources) (null)))));
	//    0    0:new             #6   <Class WrappedDrawableApi19$DrawableWrapperStateKitKat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #36  <Method void WrappedDrawableApi19$DrawableWrapperStateKitKat(WrappedDrawableApi14$DrawableWrapperState, Resources)>
	//    6   12:areturn         
	}

	public void setAutoMirrored(boolean flag)
	{
		mDrawable.setAutoMirrored(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #41  <Method void Drawable.setAutoMirrored(boolean)>
	//    4    8:return          
	}
}
