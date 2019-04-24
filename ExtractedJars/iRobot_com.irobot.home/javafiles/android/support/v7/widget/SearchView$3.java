// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.widget.e;

// Referenced classes of package android.support.v7.widget:
//			SearchView, ap

class SearchView$3
	implements Runnable
{

	public void run()
	{
		if(a.g != null && (a.g instanceof ap))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field SearchView a>
	//*   2    4:getfield        #23  <Field e SearchView.g>
	//*   3    7:ifnull          34
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field SearchView a>
	//*   6   14:getfield        #23  <Field e SearchView.g>
	//*   7   17:instanceof      #25  <Class ap>
	//*   8   20:ifeq            34
			a.g.a(((android.database.Cursor) (null)));
	//    9   23:aload_0         
	//   10   24:getfield        #14  <Field SearchView a>
	//   11   27:getfield        #23  <Field e SearchView.g>
	//   12   30:aconst_null     
	//   13   31:invokevirtual   #30  <Method void e.a(android.database.Cursor)>
	//   14   34:return          
	}

	final SearchView a;

	SearchView$3(SearchView searchview)
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
