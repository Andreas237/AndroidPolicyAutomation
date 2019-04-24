// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.os.Handler;
import android.support.v7.bv;
import android.support.v7.ci;
import android.view.MenuItem;
import java.util.List;

// Referenced classes of package com.ext.ui:
//			MainActivity

class MainActivity$2$1$1
	implements Runnable
{

	public void run()
	{
		ci.a("MainActivity : ", "onMenuItemActionCollapse filtering apps");
	//    0    0:ldc1            #24  <String "MainActivity : ">
	//    1    2:ldc1            #26  <String "onMenuItemActionCollapse filtering apps">
	//    2    4:invokestatic    #31  <Method void ci.a(String, String)>
		MainActivity.a(a.b.a, "");
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field MainActivity$2$1 a>
	//    5   11:getfield        #35  <Field MainActivity$2 MainActivity$2$1.b>
	//    6   14:getfield        #38  <Field MainActivity MainActivity$2.a>
	//    7   17:ldc1            #40  <String "">
	//    8   19:invokestatic    #45  <Method void MainActivity.a(MainActivity, String)>
		MainActivity.b(a.b.a).clear();
	//    9   22:aload_0         
	//   10   23:getfield        #19  <Field MainActivity$2$1 a>
	//   11   26:getfield        #35  <Field MainActivity$2 MainActivity$2$1.b>
	//   12   29:getfield        #38  <Field MainActivity MainActivity$2.a>
	//   13   32:invokestatic    #48  <Method List MainActivity.b(MainActivity)>
	//   14   35:invokeinterface #53  <Method void List.clear()>
	//   15   40:return          
	}

	final MainActivity._cls2._cls1 a;

	MainActivity$2$1$1(MainActivity._cls2._cls1 _pcls1)
	{
		a = _pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MainActivity$2$1 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/ext/ui/MainActivity$2

/* anonymous class */
	class MainActivity._cls2
		implements android.support.v4.view.MenuItemCompat.OnActionExpandListener
	{

		public boolean onMenuItemActionCollapse(MenuItem menuitem)
		{
			(new Thread(new MainActivity._cls2._cls1(this, new Handler()))).start();
		//    0    0:new             #26  <Class Thread>
		//    1    3:dup             
		//    2    4:new             #10  <Class MainActivity$2$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:new             #28  <Class Handler>
		//    6   12:dup             
		//    7   13:invokespecial   #29  <Method void Handler()>
		//    8   16:invokespecial   #32  <Method void MainActivity$2$1(MainActivity$2, Handler)>
		//    9   19:invokespecial   #35  <Method void Thread(Runnable)>
		//   10   22:invokevirtual   #38  <Method void Thread.start()>
			return true;
		//   11   25:iconst_1        
		//   12   26:ireturn         
		}

		public boolean onMenuItemActionExpand(MenuItem menuitem)
		{
			MainActivity.b(a).clear();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MainActivity a>
		//    2    4:invokestatic    #43  <Method List MainActivity.b(MainActivity)>
		//    3    7:invokeinterface #48  <Method void List.clear()>
			MainActivity.b(a).addAll(((java.util.Collection) (MainActivity.a(a).a())));
		//    4   12:aload_0         
		//    5   13:getfield        #18  <Field MainActivity a>
		//    6   16:invokestatic    #43  <Method List MainActivity.b(MainActivity)>
		//    7   19:aload_0         
		//    8   20:getfield        #18  <Field MainActivity a>
		//    9   23:invokestatic    #51  <Method bv MainActivity.a(MainActivity)>
		//   10   26:invokevirtual   #56  <Method List bv.a()>
		//   11   29:invokeinterface #60  <Method boolean List.addAll(java.util.Collection)>
		//   12   34:pop             
			return true;
		//   13   35:iconst_1        
		//   14   36:ireturn         
		}

		final MainActivity a;

			
			{
				a = mainactivity;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MainActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}


	// Unreferenced inner class com/ext/ui/MainActivity$2$1

/* anonymous class */
	class MainActivity._cls2._cls1
		implements Runnable
	{

		public void run()
		{
			a.post(((Runnable) (new MainActivity._cls2._cls1._cls1(this))));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Handler a>
		//    2    4:new             #13  <Class MainActivity$2$1$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:invokespecial   #31  <Method void MainActivity$2$1$1(MainActivity$2$1)>
		//    6   12:invokevirtual   #37  <Method boolean Handler.post(Runnable)>
		//    7   15:pop             
		//    8   16:return          
		}

		final Handler a;
		final MainActivity._cls2 b;

			
			{
				b = _pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MainActivity$2 b>
				a = handler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Handler a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
