// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.os.Handler;
import android.support.v7.ci;
import android.support.v7.widget.SearchView;

// Referenced classes of package com.ext.ui:
//			MainActivity

class MainActivity$3
	implements android.support.v7.widget.eryTextListener
{

	public boolean onQueryTextChange(String s)
	{
		(new Thread(new Runnable(new Handler(), s) {

			public void run()
			{
				a.post(new Runnable(this) {

					public void run()
					{
						if(!MainActivity.c(a.c.a).isIconified())
					//*   0    0:aload_0         
					//*   1    1:getfield        #19  <Field MainActivity$3$1 a>
					//*   2    4:getfield        #26  <Field MainActivity$3 MainActivity$3$1.c>
					//*   3    7:getfield        #29  <Field MainActivity MainActivity$3.a>
					//*   4   10:invokestatic    #34  <Method SearchView MainActivity.c(MainActivity)>
					//*   5   13:invokevirtual   #40  <Method boolean SearchView.isIconified()>
					//*   6   16:ifne            46
						{
							ci.a("MainActivity : ", "onQueryTextChange filtering apps");
					//    7   19:ldc1            #42  <String "MainActivity : ">
					//    8   21:ldc1            #44  <String "onQueryTextChange filtering apps">
					//    9   23:invokestatic    #49  <Method void ci.a(String, String)>
							MainActivity.a(a.c.a, a.b);
					//   10   26:aload_0         
					//   11   27:getfield        #19  <Field MainActivity$3$1 a>
					//   12   30:getfield        #26  <Field MainActivity$3 MainActivity$3$1.c>
					//   13   33:getfield        #29  <Field MainActivity MainActivity$3.a>
					//   14   36:aload_0         
					//   15   37:getfield        #19  <Field MainActivity$3$1 a>
					//   16   40:getfield        #53  <Field String MainActivity$3$1.b>
					//   17   43:invokestatic    #56  <Method void MainActivity.a(MainActivity, String)>
						}
					//   18   46:return          
					}

					final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MainActivity$3$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field Handler a>
			//    2    4:new             #13  <Class MainActivity$3$1$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:invokespecial   #35  <Method void MainActivity$3$1$1(MainActivity$3$1)>
			//    6   12:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
			//    7   15:pop             
			//    8   16:return          
			}

			final Handler a;
			final String b;
			final MainActivity._cls3 c;

			
			{
				c = MainActivity._cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field MainActivity$3 c>
				a = handler;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Handler a>
				b = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
		}
)).start();
	//    0    0:new             #26  <Class Thread>
	//    1    3:dup             
	//    2    4:new             #10  <Class MainActivity$3$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:new             #28  <Class Handler>
	//    6   12:dup             
	//    7   13:invokespecial   #29  <Method void Handler()>
	//    8   16:aload_1         
	//    9   17:invokespecial   #32  <Method void MainActivity$3$1(MainActivity$3, Handler, String)>
	//   10   20:invokespecial   #35  <Method void Thread(Runnable)>
	//   11   23:invokevirtual   #38  <Method void Thread.start()>
		return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	public boolean onQueryTextSubmit(String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final MainActivity a;

	MainActivity$3(MainActivity mainactivity)
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
