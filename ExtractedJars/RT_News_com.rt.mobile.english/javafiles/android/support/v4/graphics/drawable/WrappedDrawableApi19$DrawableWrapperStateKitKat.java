// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//			WrappedDrawableApi19

private static class WrappedDrawableApi19$DrawableWrapperStateKitKat extends WrappedDrawableApi14.DrawableWrapperState
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

	WrappedDrawableApi19$DrawableWrapperStateKitKat(WrappedDrawableApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
	{
		super(drawablewrapperstate, resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void WrappedDrawableApi14$DrawableWrapperState(WrappedDrawableApi14$DrawableWrapperState, Resources)>
	//    4    6:return          
	}
}
