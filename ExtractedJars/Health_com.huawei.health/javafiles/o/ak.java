// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.drawable.Drawable;
import android.view.*;

// Referenced classes of package o:
//			al

class ak
	implements al
{

	ak(ViewGroup viewgroup)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		c = viewgroup.getOverlay();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method ViewGroupOverlay ViewGroup.getOverlay()>
	//    5    9:putfield        #25  <Field ViewGroupOverlay c>
	//    6   12:return          
	}

	public void c(View view)
	{
		c.remove(view);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupOverlay c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method void ViewGroupOverlay.remove(View)>
	//    4    8:return          
	}

	public void d(Drawable drawable)
	{
		c.add(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupOverlay c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method void ViewGroupOverlay.add(Drawable)>
	//    4    8:return          
	}

	public void d(View view)
	{
		c.add(view);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupOverlay c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method void ViewGroupOverlay.add(View)>
	//    4    8:return          
	}

	public void e(Drawable drawable)
	{
		c.remove(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupOverlay c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method void ViewGroupOverlay.remove(Drawable)>
	//    4    8:return          
	}

	private final ViewGroupOverlay c;
}
