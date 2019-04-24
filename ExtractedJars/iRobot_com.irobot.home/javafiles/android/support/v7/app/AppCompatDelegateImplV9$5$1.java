// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$5$1 extends y
{

	public void a(View view)
	{
		a.a.n.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImplV9$5 a>
	//    2    4:getfield        #22  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.a>
	//    3    7:getfield        #28  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//    4   10:iconst_0        
	//    5   11:invokevirtual   #34  <Method void ActionBarContextView.setVisibility(int)>
	//    6   14:return          
	}

	public void b(View view)
	{
		a.a.n.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImplV9$5 a>
	//    2    4:getfield        #22  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.a>
	//    3    7:getfield        #28  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//    4   10:fconst_1        
	//    5   11:invokevirtual   #39  <Method void ActionBarContextView.setAlpha(float)>
		a.a.q.a(((android.support.v4.view.x) (null)));
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field AppCompatDelegateImplV9$5 a>
	//    8   18:getfield        #22  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.a>
	//    9   21:getfield        #43  <Field w AppCompatDelegateImplV9.q>
	//   10   24:aconst_null     
	//   11   25:invokevirtual   #48  <Method w w.a(android.support.v4.view.x)>
	//   12   28:pop             
		a.a.q = null;
	//   13   29:aload_0         
	//   14   30:getfield        #15  <Field AppCompatDelegateImplV9$5 a>
	//   15   33:getfield        #22  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.a>
	//   16   36:aconst_null     
	//   17   37:putfield        #43  <Field w AppCompatDelegateImplV9.q>
	//   18   40:return          
	}

	final AppCompatDelegateImplV9._cls5 a;

	AppCompatDelegateImplV9$5$1(AppCompatDelegateImplV9._cls5 _pcls5)
	{
		a = _pcls5;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppCompatDelegateImplV9$5 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void y()>
	//    5    9:return          
	}

	// Unreferenced inner class android/support/v7/app/AppCompatDelegateImplV9$5

/* anonymous class */
	class AppCompatDelegateImplV9._cls5
		implements Runnable
	{

		public void run()
		{
			a.o.showAtLocation(((View) (a.n)), 55, 0, 0);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//    2    4:getfield        #27  <Field PopupWindow AppCompatDelegateImplV9.o>
		//    3    7:aload_0         
		//    4    8:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//    5   11:getfield        #31  <Field ActionBarContextView AppCompatDelegateImplV9.n>
		//    6   14:bipush          55
		//    7   16:iconst_0        
		//    8   17:iconst_0        
		//    9   18:invokevirtual   #37  <Method void PopupWindow.showAtLocation(View, int, int, int)>
			a.t();
		//   10   21:aload_0         
		//   11   22:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//   12   25:invokevirtual   #40  <Method void AppCompatDelegateImplV9.t()>
			if(a.s())
		//*  13   28:aload_0         
		//*  14   29:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//*  15   32:invokevirtual   #44  <Method boolean android.support.v7.app.AppCompatDelegateImplV9.s()>
		//*  16   35:ifeq            90
			{
				a.n.setAlpha(0.0F);
		//   17   38:aload_0         
		//   18   39:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//   19   42:getfield        #31  <Field ActionBarContextView AppCompatDelegateImplV9.n>
		//   20   45:fconst_0        
		//   21   46:invokevirtual   #50  <Method void ActionBarContextView.setAlpha(float)>
				a.q = s.k(((View) (a.n))).a(1.0F);
		//   22   49:aload_0         
		//   23   50:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//   24   53:aload_0         
		//   25   54:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//   26   57:getfield        #31  <Field ActionBarContextView AppCompatDelegateImplV9.n>
		//   27   60:invokestatic    #56  <Method w s.k(View)>
		//   28   63:fconst_1        
		//   29   64:invokevirtual   #61  <Method w w.a(float)>
		//   30   67:putfield        #65  <Field w AppCompatDelegateImplV9.q>
				a.q.a(((android.support.v4.view.x) (new AppCompatDelegateImplV9._cls5._cls1(this))));
		//   31   70:aload_0         
		//   32   71:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//   33   74:getfield        #65  <Field w AppCompatDelegateImplV9.q>
		//   34   77:new             #13  <Class AppCompatDelegateImplV9$5$1>
		//   35   80:dup             
		//   36   81:aload_0         
		//   37   82:invokespecial   #68  <Method void AppCompatDelegateImplV9$5$1(AppCompatDelegateImplV9$5)>
		//   38   85:invokevirtual   #71  <Method w w.a(android.support.v4.view.x)>
		//   39   88:pop             
				return;
		//   40   89:return          
			} else
			{
				a.n.setAlpha(1.0F);
		//   41   90:aload_0         
		//   42   91:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//   43   94:getfield        #31  <Field ActionBarContextView AppCompatDelegateImplV9.n>
		//   44   97:fconst_1        
		//   45   98:invokevirtual   #50  <Method void ActionBarContextView.setAlpha(float)>
				a.n.setVisibility(0);
		//   46  101:aload_0         
		//   47  102:getfield        #18  <Field AppCompatDelegateImplV9 a>
		//   48  105:getfield        #31  <Field ActionBarContextView AppCompatDelegateImplV9.n>
		//   49  108:iconst_0        
		//   50  109:invokevirtual   #75  <Method void ActionBarContextView.setVisibility(int)>
				return;
		//   51  112:return          
			}
		}

		final AppCompatDelegateImplV9 a;

			
			{
				a = appcompatdelegateimplv9;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AppCompatDelegateImplV9 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
