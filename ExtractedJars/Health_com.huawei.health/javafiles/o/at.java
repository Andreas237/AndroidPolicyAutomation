// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

// Referenced classes of package o:
//			aw

class at
	implements aw
{

	at(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = view.getOverlay();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method ViewOverlay View.getOverlay()>
	//    5    9:putfield        #25  <Field ViewOverlay a>
	//    6   12:return          
	}

	public void d(Drawable drawable)
	{
		a.add(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewOverlay a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void ViewOverlay.add(Drawable)>
	//    4    8:return          
	}

	public void e(Drawable drawable)
	{
		a.remove(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewOverlay a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method void ViewOverlay.remove(Drawable)>
	//    4    8:return          
	}

	private final ViewOverlay a;
}
