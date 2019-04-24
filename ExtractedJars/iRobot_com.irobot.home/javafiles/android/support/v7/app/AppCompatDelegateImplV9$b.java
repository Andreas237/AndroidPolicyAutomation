// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.view.b;
import android.support.v7.widget.ActionBarContextView;
import android.view.*;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9, b

class AppCompatDelegateImplV9$b
	implements android.support.v7.view.b.a
{

	public void a(b b1)
	{
		b.a(b1);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.support.v7.view.b$a b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #27  <Method void android.support.v7.view.b$a.a(b)>
		if(a.o != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//*   6   14:getfield        #31  <Field PopupWindow AppCompatDelegateImplV9.o>
	//*   7   17:ifnull          41
			a.b.getDecorView().removeCallbacks(a.p);
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//   10   24:getfield        #34  <Field Window android.support.v7.app.AppCompatDelegateImplV9.b>
	//   11   27:invokevirtual   #40  <Method View Window.getDecorView()>
	//   12   30:aload_0         
	//   13   31:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//   14   34:getfield        #44  <Field Runnable AppCompatDelegateImplV9.p>
	//   15   37:invokevirtual   #50  <Method boolean View.removeCallbacks(Runnable)>
	//   16   40:pop             
		if(a.n != null)
	//*  17   41:aload_0         
	//*  18   42:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//*  19   45:getfield        #54  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//*  20   48:ifnull          98
		{
			a.t();
	//   21   51:aload_0         
	//   22   52:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//   23   55:invokevirtual   #57  <Method void AppCompatDelegateImplV9.t()>
			a.q = s.k(((View) (a.n))).a(0.0F);
	//   24   58:aload_0         
	//   25   59:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//   26   62:aload_0         
	//   27   63:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//   28   66:getfield        #54  <Field ActionBarContextView AppCompatDelegateImplV9.n>
	//   29   69:invokestatic    #63  <Method w s.k(View)>
	//   30   72:fconst_0        
	//   31   73:invokevirtual   #68  <Method w w.a(float)>
	//   32   76:putfield        #72  <Field w AppCompatDelegateImplV9.q>
			a.q.a(((android.support.v4.view.x) (new y() {

				public void b(View view)
				{
					a.a.n.setVisibility(8);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field AppCompatDelegateImplV9$b a>
				//    2    4:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
				//    3    7:getfield        #29  <Field ActionBarContextView AppCompatDelegateImplV9.n>
				//    4   10:bipush          8
				//    5   12:invokevirtual   #35  <Method void ActionBarContextView.setVisibility(int)>
					if(a.a.o != null)
				//*   6   15:aload_0         
				//*   7   16:getfield        #17  <Field AppCompatDelegateImplV9$b a>
				//*   8   19:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
				//*   9   22:getfield        #39  <Field PopupWindow AppCompatDelegateImplV9.o>
				//*  10   25:ifnull          44
						a.a.o.dismiss();
				//   11   28:aload_0         
				//   12   29:getfield        #17  <Field AppCompatDelegateImplV9$b a>
				//   13   32:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
				//   14   35:getfield        #39  <Field PopupWindow AppCompatDelegateImplV9.o>
				//   15   38:invokevirtual   #44  <Method void PopupWindow.dismiss()>
					else
				//*  16   41:goto            82
					if(a.a.n.getParent() instanceof View)
				//*  17   44:aload_0         
				//*  18   45:getfield        #17  <Field AppCompatDelegateImplV9$b a>
				//*  19   48:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
				//*  20   51:getfield        #29  <Field ActionBarContextView AppCompatDelegateImplV9.n>
				//*  21   54:invokevirtual   #48  <Method android.view.ViewParent ActionBarContextView.getParent()>
				//*  22   57:instanceof      #50  <Class View>
				//*  23   60:ifeq            82
						s.p((View)a.a.n.getParent());
				//   24   63:aload_0         
				//   25   64:getfield        #17  <Field AppCompatDelegateImplV9$b a>
				//   26   67:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
				//   27   70:getfield        #29  <Field ActionBarContextView AppCompatDelegateImplV9.n>
				//   28   73:invokevirtual   #48  <Method android.view.ViewParent ActionBarContextView.getParent()>
				//   29   76:checkcast       #50  <Class View>
				//   30   79:invokestatic    #55  <Method void s.p(View)>
					a.a.n.removeAllViews();
				//   31   82:aload_0         
				//   32   83:getfield        #17  <Field AppCompatDelegateImplV9$b a>
				//   33   86:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
				//   34   89:getfield        #29  <Field ActionBarContextView AppCompatDelegateImplV9.n>
				//   35   92:invokevirtual   #58  <Method void ActionBarContextView.removeAllViews()>
					a.a.q.a(((android.support.v4.view.x) (null)));
				//   36   95:aload_0         
				//   37   96:getfield        #17  <Field AppCompatDelegateImplV9$b a>
				//   38   99:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
				//   39  102:getfield        #62  <Field w AppCompatDelegateImplV9.q>
				//   40  105:aconst_null     
				//   41  106:invokevirtual   #67  <Method w w.a(android.support.v4.view.x)>
				//   42  109:pop             
					a.a.q = null;
				//   43  110:aload_0         
				//   44  111:getfield        #17  <Field AppCompatDelegateImplV9$b a>
				//   45  114:getfield        #25  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$b.a>
				//   46  117:aconst_null     
				//   47  118:putfield        #62  <Field w AppCompatDelegateImplV9.q>
				//   48  121:return          
				}

				final AppCompatDelegateImplV9.b a;

			
			{
				a = AppCompatDelegateImplV9.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppCompatDelegateImplV9$b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void y()>
			//    5    9:return          
			}
			}
)));
	//   33   79:aload_0         
	//   34   80:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//   35   83:getfield        #72  <Field w AppCompatDelegateImplV9.q>
	//   36   86:new             #11  <Class AppCompatDelegateImplV9$b$1>
	//   37   89:dup             
	//   38   90:aload_0         
	//   39   91:invokespecial   #75  <Method void AppCompatDelegateImplV9$b$1(AppCompatDelegateImplV9$b)>
	//   40   94:invokevirtual   #78  <Method w w.a(android.support.v4.view.x)>
	//   41   97:pop             
		}
		if(a.e != null)
	//*  42   98:aload_0         
	//*  43   99:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//*  44  102:getfield        #82  <Field android.support.v7.app.b AppCompatDelegateImplV9.e>
	//*  45  105:ifnull          127
			a.e.b(a.m);
	//   46  108:aload_0         
	//   47  109:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//   48  112:getfield        #82  <Field android.support.v7.app.b AppCompatDelegateImplV9.e>
	//   49  115:aload_0         
	//   50  116:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//   51  119:getfield        #86  <Field b AppCompatDelegateImplV9.m>
	//   52  122:invokeinterface #90  <Method void android.support.v7.app.b.b(b)>
		a.m = null;
	//   53  127:aload_0         
	//   54  128:getfield        #18  <Field AppCompatDelegateImplV9 a>
	//   55  131:aconst_null     
	//   56  132:putfield        #86  <Field b AppCompatDelegateImplV9.m>
	//   57  135:return          
	}

	public boolean a(b b1, Menu menu)
	{
		return b.a(b1, menu);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.support.v7.view.b$a b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #93  <Method boolean android.support.v7.view.b$a.a(b, Menu)>
	//    5   11:ireturn         
	}

	public boolean a(b b1, MenuItem menuitem)
	{
		return b.a(b1, menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.support.v7.view.b$a b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #96  <Method boolean android.support.v7.view.b$a.a(b, MenuItem)>
	//    5   11:ireturn         
	}

	public boolean b(b b1, Menu menu)
	{
		return b.b(b1, menu);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.support.v7.view.b$a b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #98  <Method boolean android.support.v7.view.b$a.b(b, Menu)>
	//    5   11:ireturn         
	}

	final AppCompatDelegateImplV9 a;
	private android.support.v7.view.b.a b;

	public AppCompatDelegateImplV9$b(AppCompatDelegateImplV9 appcompatdelegateimplv9, android.support.v7.view.b.a a1)
	{
		a = appcompatdelegateimplv9;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AppCompatDelegateImplV9 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		b = a1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field android.support.v7.view.b$a b>
	//    8   14:return          
	}
}
