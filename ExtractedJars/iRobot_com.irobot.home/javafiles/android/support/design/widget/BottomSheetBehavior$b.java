// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.s;
import android.support.v4.widget.p;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

private class BottomSheetBehavior$b
	implements Runnable
{

	public void run()
	{
		if(a.e != null && a.e.a(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field BottomSheetBehavior a>
	//*   2    4:getfield        #31  <Field p BottomSheetBehavior.e>
	//*   3    7:ifnull          33
	//*   4   10:aload_0         
	//*   5   11:getfield        #18  <Field BottomSheetBehavior a>
	//*   6   14:getfield        #31  <Field p BottomSheetBehavior.e>
	//*   7   17:iconst_1        
	//*   8   18:invokevirtual   #36  <Method boolean p.a(boolean)>
	//*   9   21:ifeq            33
		{
			s.a(b, ((Runnable) (this)));
	//   10   24:aload_0         
	//   11   25:getfield        #23  <Field View b>
	//   12   28:aload_0         
	//   13   29:invokestatic    #41  <Method void s.a(View, Runnable)>
			return;
	//   14   32:return          
		} else
		{
			a.c(c);
	//   15   33:aload_0         
	//   16   34:getfield        #18  <Field BottomSheetBehavior a>
	//   17   37:aload_0         
	//   18   38:getfield        #25  <Field int c>
	//   19   41:invokevirtual   #44  <Method void BottomSheetBehavior.c(int)>
			return;
	//   20   44:return          
		}
	}

	final BottomSheetBehavior a;
	private final View b;
	private final int c;

	BottomSheetBehavior$b(BottomSheetBehavior bottomsheetbehavior, View view, int i)
	{
		a = bottomsheetbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field BottomSheetBehavior a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		b = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field View b>
		c = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int c>
	//   11   19:return          
	}
}
