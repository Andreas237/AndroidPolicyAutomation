// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$6
	implements android.view.istener
{

	public void onClick(View view)
	{
		if(view == a.b)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #14  <Field SearchView a>
	//*   3    5:getfield        #24  <Field android.widget.ImageView SearchView.b>
	//*   4    8:if_acmpne       19
		{
			a.g();
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field SearchView a>
	//    7   15:invokevirtual   #27  <Method void SearchView.g()>
			return;
	//    8   18:return          
		}
		if(view == a.d)
	//*   9   19:aload_1         
	//*  10   20:aload_0         
	//*  11   21:getfield        #14  <Field SearchView a>
	//*  12   24:getfield        #30  <Field android.widget.ImageView SearchView.d>
	//*  13   27:if_acmpne       38
		{
			a.f();
	//   14   30:aload_0         
	//   15   31:getfield        #14  <Field SearchView a>
	//   16   34:invokevirtual   #33  <Method void SearchView.f()>
			return;
	//   17   37:return          
		}
		if(view == a.c)
	//*  18   38:aload_1         
	//*  19   39:aload_0         
	//*  20   40:getfield        #14  <Field SearchView a>
	//*  21   43:getfield        #36  <Field android.widget.ImageView SearchView.c>
	//*  22   46:if_acmpne       57
		{
			a.e();
	//   23   49:aload_0         
	//   24   50:getfield        #14  <Field SearchView a>
	//   25   53:invokevirtual   #39  <Method void SearchView.e()>
			return;
	//   26   56:return          
		}
		if(view == a.e)
	//*  27   57:aload_1         
	//*  28   58:aload_0         
	//*  29   59:getfield        #14  <Field SearchView a>
	//*  30   62:getfield        #41  <Field android.widget.ImageView SearchView.e>
	//*  31   65:if_acmpne       76
		{
			a.h();
	//   32   68:aload_0         
	//   33   69:getfield        #14  <Field SearchView a>
	//   34   72:invokevirtual   #44  <Method void SearchView.h()>
			return;
	//   35   75:return          
		}
		if(view == a.a)
	//*  36   76:aload_1         
	//*  37   77:aload_0         
	//*  38   78:getfield        #14  <Field SearchView a>
	//*  39   81:getfield        #47  <Field SearchView$SearchAutoComplete SearchView.a>
	//*  40   84:if_acmpne       94
			a.l();
	//   41   87:aload_0         
	//   42   88:getfield        #14  <Field SearchView a>
	//   43   91:invokevirtual   #50  <Method void SearchView.l()>
	//   44   94:return          
	}

	final SearchView a;

	SearchView$6(SearchView searchview)
	{
		a = searchview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SearchView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
