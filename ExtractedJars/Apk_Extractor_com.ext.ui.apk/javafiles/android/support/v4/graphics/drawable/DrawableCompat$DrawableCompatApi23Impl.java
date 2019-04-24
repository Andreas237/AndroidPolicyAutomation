// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableCompat

static class DrawableCompat$DrawableCompatApi23Impl extends DrawableCompat$DrawableCompatApi21Impl
{

	public void clearColorFilter(Drawable drawable)
	{
		drawable.clearColorFilter();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method void Drawable.clearColorFilter()>
	//    2    4:return          
	}

	public int getLayoutDirection(Drawable drawable)
	{
		return drawable.getLayoutDirection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method int Drawable.getLayoutDirection()>
	//    2    4:ireturn         
	}

	public boolean setLayoutDirection(Drawable drawable, int i)
	{
		return drawable.setLayoutDirection(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #31  <Method boolean Drawable.setLayoutDirection(int)>
	//    3    5:ireturn         
	}

	public Drawable wrap(Drawable drawable)
	{
		return drawable;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	DrawableCompat$DrawableCompatApi23Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void DrawableCompat$DrawableCompatApi21Impl()>
	//    2    4:return          
	}
}
