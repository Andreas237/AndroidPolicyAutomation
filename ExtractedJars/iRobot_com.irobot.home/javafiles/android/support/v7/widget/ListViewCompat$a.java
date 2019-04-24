// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.d.a.a;

// Referenced classes of package android.support.v7.widget:
//			ListViewCompat

private static class ListViewCompat$a extends a
{

	void a(boolean flag)
	{
		a = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #14  <Field boolean a>
	//    3    5:return          
	}

	public void draw(Canvas canvas)
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field boolean a>
	//*   2    4:ifeq            12
			super.draw(canvas);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #20  <Method void a.draw(Canvas)>
	//    6   12:return          
	}

	public void setHotspot(float f, float f1)
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field boolean a>
	//*   2    4:ifeq            13
			super.setHotspot(f, f1);
	//    3    7:aload_0         
	//    4    8:fload_1         
	//    5    9:fload_2         
	//    6   10:invokespecial   #24  <Method void a.setHotspot(float, float)>
	//    7   13:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field boolean a>
	//*   2    4:ifeq            16
			super.setHotspotBounds(i, j, k, l);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokespecial   #28  <Method void a.setHotspotBounds(int, int, int, int)>
	//    9   16:return          
	}

	public boolean setState(int ai[])
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field boolean a>
	//*   2    4:ifeq            13
			return super.setState(ai);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #32  <Method boolean a.setState(int[])>
	//    6   12:ireturn         
		else
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field boolean a>
	//*   2    4:ifeq            14
			return super.setVisible(flag, flag1);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #36  <Method boolean a.setVisible(boolean, boolean)>
	//    7   13:ireturn         
		else
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private boolean a;

	public ListViewCompat$a(Drawable drawable)
	{
		super(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void a(Drawable)>
		a = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #14  <Field boolean a>
	//    6   10:return          
	}
}
