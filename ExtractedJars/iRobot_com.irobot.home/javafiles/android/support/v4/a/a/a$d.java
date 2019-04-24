// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.a.a;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.a.a:
//			a

static class a$d extends a$c
{

	public int a(Drawable drawable)
	{
		return drawable.getLayoutDirection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method int Drawable.getLayoutDirection()>
	//    2    4:ireturn         
	}

	public boolean a(Drawable drawable, int i)
	{
		return drawable.setLayoutDirection(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #25  <Method boolean Drawable.setLayoutDirection(int)>
	//    3    5:ireturn         
	}

	public Drawable c(Drawable drawable)
	{
		return drawable;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public void g(Drawable drawable)
	{
		drawable.clearColorFilter();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method void Drawable.clearColorFilter()>
	//    2    4:return          
	}

	a$d()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void a$c()>
	//    2    4:return          
	}
}
