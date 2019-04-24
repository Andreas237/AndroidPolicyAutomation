// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableCompat, TintAwareDrawable, DrawableWrapperApi19

static class DrawableCompat$DrawableCompatApi19Impl extends DrawableCompat$DrawableCompatApi17Impl
{

	public int getAlpha(Drawable drawable)
	{
		return drawable.getAlpha();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int Drawable.getAlpha()>
	//    2    4:ireturn         
	}

	public boolean isAutoMirrored(Drawable drawable)
	{
		return drawable.isAutoMirrored();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method boolean Drawable.isAutoMirrored()>
	//    2    4:ireturn         
	}

	public void setAutoMirrored(Drawable drawable, boolean flag)
	{
		drawable.setAutoMirrored(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #32  <Method void Drawable.setAutoMirrored(boolean)>
	//    3    5:return          
	}

	public Drawable wrap(Drawable drawable)
	{
		if(!(drawable instanceof TintAwareDrawable))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #36  <Class TintAwareDrawable>
	//*   2    4:ifne            16
			return ((Drawable) (new DrawableWrapperApi19(drawable)));
	//    3    7:new             #38  <Class DrawableWrapperApi19>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #41  <Method void DrawableWrapperApi19(Drawable)>
	//    7   15:areturn         
		else
			return drawable;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	DrawableCompat$DrawableCompatApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void DrawableCompat$DrawableCompatApi17Impl()>
	//    2    4:return          
	}
}
