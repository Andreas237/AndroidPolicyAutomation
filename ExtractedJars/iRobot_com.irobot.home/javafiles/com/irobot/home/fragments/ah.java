// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.irobot.home.IRobotApplication_;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ag, ah

public final class ah extends ag
	implements a, b
{

	public ah()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void ag()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void c()>
	//    6   12:putfield        #33  <Field c d>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		b = IRobotApplication_.r();
	//    0    0:aload_0         
	//    1    1:invokestatic    #42  <Method com.irobot.home.IRobotApplication IRobotApplication_.r()>
	//    2    4:putfield        #46  <Field com.irobot.home.IRobotApplication b>
		org.androidannotations.api.c.c.a(((b) (this)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #49  <Method void c.a(b)>
	//    5   11:return          
	}

	static void a(ah ah1)
	{
		((ag) (ah1)).com.irobot.home.fragments.ag.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void com.irobot.home.fragments.ag.a()>
	//    2    4:return          
	}

	static void a(ah ah1, String s)
	{
		((ag) (ah1)).com.irobot.home.fragments.ag.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void com.irobot.home.fragments.ag.a(String)>
	//    3    5:return          
	}

	static void a(ah ah1, boolean flag)
	{
		((ag) (ah1)).com.irobot.home.fragments.ag.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #60  <Method void com.irobot.home.fragments.ag.a(boolean)>
	//    3    5:return          
	}

	static void b(ah ah1)
	{
		((ag) (ah1)).ag.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void ag.d()>
	//    2    4:return          
	}

	static void b(ah ah1, String s)
	{
		((ag) (ah1)).com.irobot.home.fragments.ag.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void com.irobot.home.fragments.ag.b(String)>
	//    3    5:return          
	}

	static void c(ah ah1)
	{
		((ag) (ah1)).com.irobot.home.fragments.ag.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void com.irobot.home.fragments.ag.c()>
	//    2    4:return          
	}

	public View a(int i)
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field View e>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return e.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field View e>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #75  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a()
	{
		org.androidannotations.api.b.a("", ((Runnable) (new ah(this) {

			public int a(View view)
			{
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
			//    3    7:astore_2        
				return a.i(view) - layoutparams.topMargin;
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field RecyclerView$h a>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #31  <Method int RecyclerView$h.i(View)>
			//    8   16:aload_2         
			//    9   17:getfield        #35  <Field int RecyclerView$LayoutParams.topMargin>
			//   10   20:isub            
			//   11   21:ireturn         
			}

			public void a(int j)
			{
				a.j(j);
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:iload_1         
			//    3    5:invokevirtual   #39  <Method void RecyclerView$h.j(int)>
			//    4    8:return          
			}

			public int b(View view)
			{
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
			//    3    7:astore_2        
				return a.k(view) + layoutparams.bottomMargin;
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field RecyclerView$h a>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #42  <Method int RecyclerView$h.k(View)>
			//    8   16:aload_2         
			//    9   17:getfield        #45  <Field int RecyclerView$LayoutParams.bottomMargin>
			//   10   20:iadd            
			//   11   21:ireturn         
			}

			public int c()
			{
				return a.A();
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #50  <Method int RecyclerView$h.A()>
			//    3    7:ireturn         
			}

			public int c(View view)
			{
				a.a(view, true, b);
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:aload_1         
			//    3    5:iconst_1        
			//    4    6:aload_0         
			//    5    7:getfield        #53  <Field Rect b>
			//    6   10:invokevirtual   #56  <Method void android.support.v7.widget.RecyclerView$h.a(View, boolean, Rect)>
				return b.bottom;
			//    7   13:aload_0         
			//    8   14:getfield        #53  <Field Rect b>
			//    9   17:getfield        #61  <Field int Rect.bottom>
			//   10   20:ireturn         
			}

			public int d()
			{
				return a.y() - a.C();
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #65  <Method int RecyclerView$h.y()>
			//    3    7:aload_0         
			//    4    8:getfield        #26  <Field RecyclerView$h a>
			//    5   11:invokevirtual   #68  <Method int RecyclerView$h.C()>
			//    6   14:isub            
			//    7   15:ireturn         
			}

			public int d(View view)
			{
				a.a(view, true, b);
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:aload_1         
			//    3    5:iconst_1        
			//    4    6:aload_0         
			//    5    7:getfield        #53  <Field Rect b>
			//    6   10:invokevirtual   #56  <Method void android.support.v7.widget.RecyclerView$h.a(View, boolean, Rect)>
				return b.top;
			//    7   13:aload_0         
			//    8   14:getfield        #53  <Field Rect b>
			//    9   17:getfield        #71  <Field int Rect.top>
			//   10   20:ireturn         
			}

			public int e()
			{
				return a.y();
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #65  <Method int RecyclerView$h.y()>
			//    3    7:ireturn         
			}

			public int e(View view)
			{
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
			//    3    7:astore_2        
				return a.g(view) + layoutparams.topMargin + layoutparams.bottomMargin;
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field RecyclerView$h a>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #75  <Method int RecyclerView$h.g(View)>
			//    8   16:aload_2         
			//    9   17:getfield        #35  <Field int RecyclerView$LayoutParams.topMargin>
			//   10   20:iadd            
			//   11   21:aload_2         
			//   12   22:getfield        #45  <Field int RecyclerView$LayoutParams.bottomMargin>
			//   13   25:iadd            
			//   14   26:ireturn         
			}

			public int f()
			{
				return a.y() - a.A() - a.C();
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #65  <Method int RecyclerView$h.y()>
			//    3    7:aload_0         
			//    4    8:getfield        #26  <Field RecyclerView$h a>
			//    5   11:invokevirtual   #50  <Method int RecyclerView$h.A()>
			//    6   14:isub            
			//    7   15:aload_0         
			//    8   16:getfield        #26  <Field RecyclerView$h a>
			//    9   19:invokevirtual   #68  <Method int RecyclerView$h.C()>
			//   10   22:isub            
			//   11   23:ireturn         
			}

			public int f(View view)
			{
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
			//    3    7:astore_2        
				return a.f(view) + layoutparams.leftMargin + layoutparams.rightMargin;
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field RecyclerView$h a>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #78  <Method int RecyclerView$h.f(View)>
			//    8   16:aload_2         
			//    9   17:getfield        #81  <Field int RecyclerView$LayoutParams.leftMargin>
			//   10   20:iadd            
			//   11   21:aload_2         
			//   12   22:getfield        #84  <Field int RecyclerView$LayoutParams.rightMargin>
			//   13   25:iadd            
			//   14   26:ireturn         
			}

			public int g()
			{
				return a.C();
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #68  <Method int RecyclerView$h.C()>
			//    3    7:ireturn         
			}

			public int h()
			{
				return a.w();
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #88  <Method int RecyclerView$h.w()>
			//    3    7:ireturn         
			}

			public int i()
			{
				return a.v();
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #91  <Method int RecyclerView$h.v()>
			//    3    7:ireturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aconst_null     
			//    3    3:invokespecial   #12  <Method void ah(RecyclerView$h, ah$1)>
			//    4    6:return          
			}
		}
)), 0L);
	//    0    0:ldc1            #79  <String "">
	//    1    2:new             #12  <Class ah$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #81  <Method void ah$2(ah)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #86  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void a(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.fragments.ah.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ah b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.ah.a(ah, String)>
			//    5   11:return          
			}

			final String a;
			final ah b;

			
			{
				b = ah.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ah b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #79  <String "">
	//    1    2:new             #14  <Class ah$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #88  <Method void ah$3(ah, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #86  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(a a1)
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method void b()>
	//    2    4:return          
	}

	public void a(boolean flag)
	{
		org.androidannotations.api.b.a("", ((Runnable) (new ah(this, flag) {

			public int a(View view)
			{
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #20  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//    2    4:checkcast       #22  <Class RecyclerView$LayoutParams>
			//    3    7:astore_2        
				return a.h(view) - layoutparams.leftMargin;
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field RecyclerView$h a>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #30  <Method int RecyclerView$h.h(View)>
			//    8   16:aload_2         
			//    9   17:getfield        #34  <Field int RecyclerView$LayoutParams.leftMargin>
			//   10   20:isub            
			//   11   21:ireturn         
			}

			public void a(int j)
			{
				a.i(j);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:iload_1         
			//    3    5:invokevirtual   #38  <Method void RecyclerView$h.i(int)>
			//    4    8:return          
			}

			public int b(View view)
			{
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #20  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//    2    4:checkcast       #22  <Class RecyclerView$LayoutParams>
			//    3    7:astore_2        
				return a.j(view) + layoutparams.rightMargin;
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field RecyclerView$h a>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #42  <Method int RecyclerView$h.j(View)>
			//    8   16:aload_2         
			//    9   17:getfield        #45  <Field int RecyclerView$LayoutParams.rightMargin>
			//   10   20:iadd            
			//   11   21:ireturn         
			}

			public int c()
			{
				return a.z();
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #50  <Method int RecyclerView$h.z()>
			//    3    7:ireturn         
			}

			public int c(View view)
			{
				a.a(view, true, b);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:aload_1         
			//    3    5:iconst_1        
			//    4    6:aload_0         
			//    5    7:getfield        #53  <Field Rect b>
			//    6   10:invokevirtual   #56  <Method void android.support.v7.widget.RecyclerView$h.a(View, boolean, Rect)>
				return b.right;
			//    7   13:aload_0         
			//    8   14:getfield        #53  <Field Rect b>
			//    9   17:getfield        #61  <Field int Rect.right>
			//   10   20:ireturn         
			}

			public int d()
			{
				return a.x() - a.B();
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #65  <Method int RecyclerView$h.x()>
			//    3    7:aload_0         
			//    4    8:getfield        #25  <Field RecyclerView$h a>
			//    5   11:invokevirtual   #68  <Method int RecyclerView$h.B()>
			//    6   14:isub            
			//    7   15:ireturn         
			}

			public int d(View view)
			{
				a.a(view, true, b);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:aload_1         
			//    3    5:iconst_1        
			//    4    6:aload_0         
			//    5    7:getfield        #53  <Field Rect b>
			//    6   10:invokevirtual   #56  <Method void android.support.v7.widget.RecyclerView$h.a(View, boolean, Rect)>
				return b.left;
			//    7   13:aload_0         
			//    8   14:getfield        #53  <Field Rect b>
			//    9   17:getfield        #71  <Field int Rect.left>
			//   10   20:ireturn         
			}

			public int e()
			{
				return a.x();
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #65  <Method int RecyclerView$h.x()>
			//    3    7:ireturn         
			}

			public int e(View view)
			{
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #20  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//    2    4:checkcast       #22  <Class RecyclerView$LayoutParams>
			//    3    7:astore_2        
				return a.f(view) + layoutparams.leftMargin + layoutparams.rightMargin;
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field RecyclerView$h a>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #75  <Method int RecyclerView$h.f(View)>
			//    8   16:aload_2         
			//    9   17:getfield        #34  <Field int RecyclerView$LayoutParams.leftMargin>
			//   10   20:iadd            
			//   11   21:aload_2         
			//   12   22:getfield        #45  <Field int RecyclerView$LayoutParams.rightMargin>
			//   13   25:iadd            
			//   14   26:ireturn         
			}

			public int f()
			{
				return a.x() - a.z() - a.B();
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #65  <Method int RecyclerView$h.x()>
			//    3    7:aload_0         
			//    4    8:getfield        #25  <Field RecyclerView$h a>
			//    5   11:invokevirtual   #50  <Method int RecyclerView$h.z()>
			//    6   14:isub            
			//    7   15:aload_0         
			//    8   16:getfield        #25  <Field RecyclerView$h a>
			//    9   19:invokevirtual   #68  <Method int RecyclerView$h.B()>
			//   10   22:isub            
			//   11   23:ireturn         
			}

			public int f(View view)
			{
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #20  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//    2    4:checkcast       #22  <Class RecyclerView$LayoutParams>
			//    3    7:astore_2        
				return a.g(view) + layoutparams.topMargin + layoutparams.bottomMargin;
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field RecyclerView$h a>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #78  <Method int RecyclerView$h.g(View)>
			//    8   16:aload_2         
			//    9   17:getfield        #81  <Field int RecyclerView$LayoutParams.topMargin>
			//   10   20:iadd            
			//   11   21:aload_2         
			//   12   22:getfield        #84  <Field int RecyclerView$LayoutParams.bottomMargin>
			//   13   25:iadd            
			//   14   26:ireturn         
			}

			public int g()
			{
				return a.B();
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #68  <Method int RecyclerView$h.B()>
			//    3    7:ireturn         
			}

			public int h()
			{
				return a.v();
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #87  <Method int RecyclerView$h.v()>
			//    3    7:ireturn         
			}

			public int i()
			{
				return a.w();
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field RecyclerView$h a>
			//    2    4:invokevirtual   #90  <Method int RecyclerView$h.w()>
			//    3    7:ireturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aconst_null     
			//    3    3:invokespecial   #12  <Method void ah(RecyclerView$h, ah$1)>
			//    4    6:return          
			}
		}
)), 0L);
	//    0    0:ldc1            #79  <String "">
	//    1    2:new             #10  <Class ah$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #93  <Method void ah$1(ah, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #86  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void b(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.fragments.ah.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ah b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.ah.b(ah, String)>
			//    5   11:return          
			}

			final String a;
			final ah b;

			
			{
				b = ah.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ah b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #79  <String "">
	//    1    2:new             #16  <Class ah$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #94  <Method void ah$4(ah, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #86  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void c()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.ah.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ah a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.ah.c(ah)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #30  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #34  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #40  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final ah a;

			
			{
				a = ah.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ah a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #20  <Class ah$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #79  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #79  <String "">
	//    6   10:invokespecial   #97  <Method void ah$6(ah, String, long, String)>
	//    7   13:invokestatic    #102 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void d()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.ah.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ah a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.ah.b(ah)>
			//    3    7:return          
			}

			final ah a;

			
			{
				a = ah.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ah a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #79  <String "">
	//    1    2:new             #18  <Class ah$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #103 <Method void ah$5(ah)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #86  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field c d>
	//    2    4:invokestatic    #107 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #109 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #111 <Method void ag.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #107 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		e = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #115 <Method View ag.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #70  <Field View e>
		if(e == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #70  <Field View e>
	//*   9   15:ifnonnull       30
			e = layoutinflater.inflate(0x7f0b00b9, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #116 <Int 0x7f0b00b9>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #122 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #70  <Field View e>
		return e;
	//   17   30:aload_0         
	//   18   31:getfield        #70  <Field View e>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void ag.onDestroyView()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #70  <Field View e>
	//    5    9:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #129 <Method void ag.onViewCreated(View, Bundle)>
		d.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #131 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c d = new c();
	private View e;
}
