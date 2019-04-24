// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableWrapperApi21

static class DrawableWrapperApi21$DrawableWrapperStateLollipop extends DrawableWrapperApi14.DrawableWrapperState
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

	DrawableWrapperApi21$DrawableWrapperStateLollipop(DrawableWrapperApi14.DrawableWrapperState drawablewrapperstate, Resources resources)
	{
		super(drawablewrapperstate, resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void DrawableWrapperApi14$DrawableWrapperState(DrawableWrapperApi14$DrawableWrapperState, Resources)>
	//    4    6:return          
	}
}
