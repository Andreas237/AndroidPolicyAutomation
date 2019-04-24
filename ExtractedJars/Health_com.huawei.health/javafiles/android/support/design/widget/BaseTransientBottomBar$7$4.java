// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Handler;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$7$4
	implements Runnable
{

	public void run()
	{
		d.b.onViewHidden(3);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BaseTransientBottomBar$7 d>
	//    2    4:getfield        #26  <Field BaseTransientBottomBar BaseTransientBottomBar$7.b>
	//    3    7:iconst_3        
	//    4    8:invokevirtual   #32  <Method void BaseTransientBottomBar.onViewHidden(int)>
	//    5   11:return          
	}

	final BaseTransientBottomBar._cls7 d;

	BaseTransientBottomBar$7$4(BaseTransientBottomBar._cls7 _pcls7)
	{
		d = _pcls7;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BaseTransientBottomBar$7 d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class android/support/design/widget/BaseTransientBottomBar$7

/* anonymous class */
	class BaseTransientBottomBar._cls7
		implements BaseTransientBottomBar.e
	{

		public void a(View view)
		{
			if(b.isShownOrQueued())
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field BaseTransientBottomBar b>
		//*   2    4:invokevirtual   #28  <Method boolean BaseTransientBottomBar.isShownOrQueued()>
		//*   3    7:ifeq            25
				BaseTransientBottomBar.sHandler.post(((Runnable) (new BaseTransientBottomBar._cls7._cls4(this))));
		//    4   10:getstatic       #32  <Field Handler BaseTransientBottomBar.sHandler>
		//    5   13:new             #13  <Class BaseTransientBottomBar$7$4>
		//    6   16:dup             
		//    7   17:aload_0         
		//    8   18:invokespecial   #35  <Method void BaseTransientBottomBar$7$4(BaseTransientBottomBar$7)>
		//    9   21:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
		//   10   24:pop             
		//   11   25:return          
		}

		public void e(View view)
		{
		//    0    0:return          
		}

		final BaseTransientBottomBar b;

			
			{
				b = basetransientbottombar;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
