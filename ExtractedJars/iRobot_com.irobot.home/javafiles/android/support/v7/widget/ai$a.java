// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ai, RecyclerView

public static class ai$a extends a
{

	public void a(View view, b b)
	{
		super.a(view, b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void a.a(View, b)>
		if(!a.b() && a.a.getLayoutManager() != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #15  <Field ai a>
	//*   6   10:invokevirtual   #23  <Method boolean android.support.v7.widget.ai.b()>
	//*   7   13:ifne            44
	//*   8   16:aload_0         
	//*   9   17:getfield        #15  <Field ai a>
	//*  10   20:getfield        #26  <Field RecyclerView android.support.v7.widget.ai.a>
	//*  11   23:invokevirtual   #32  <Method RecyclerView$h RecyclerView.getLayoutManager()>
	//*  12   26:ifnull          44
			a.a.getLayoutManager().a(view, b);
	//   13   29:aload_0         
	//   14   30:getfield        #15  <Field ai a>
	//   15   33:getfield        #26  <Field RecyclerView android.support.v7.widget.ai.a>
	//   16   36:invokevirtual   #32  <Method RecyclerView$h RecyclerView.getLayoutManager()>
	//   17   39:aload_1         
	//   18   40:aload_2         
	//   19   41:invokevirtual   #35  <Method void android.support.v7.widget.RecyclerView$h.a(View, b)>
	//   20   44:return          
	}

	public boolean a(View view, int i, Bundle bundle)
	{
		if(super.a(view, i, bundle))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #38  <Method boolean a.a(View, int, Bundle)>
	//*   5    7:ifeq            12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(!a.b() && a.a.getLayoutManager() != null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #15  <Field ai a>
	//*  10   16:invokevirtual   #23  <Method boolean android.support.v7.widget.ai.b()>
	//*  11   19:ifne            52
	//*  12   22:aload_0         
	//*  13   23:getfield        #15  <Field ai a>
	//*  14   26:getfield        #26  <Field RecyclerView android.support.v7.widget.ai.a>
	//*  15   29:invokevirtual   #32  <Method RecyclerView$h RecyclerView.getLayoutManager()>
	//*  16   32:ifnull          52
			return a.a.getLayoutManager().a(view, i, bundle);
	//   17   35:aload_0         
	//   18   36:getfield        #15  <Field ai a>
	//   19   39:getfield        #26  <Field RecyclerView android.support.v7.widget.ai.a>
	//   20   42:invokevirtual   #32  <Method RecyclerView$h RecyclerView.getLayoutManager()>
	//   21   45:aload_1         
	//   22   46:iload_2         
	//   23   47:aload_3         
	//   24   48:invokevirtual   #39  <Method boolean android.support.v7.widget.RecyclerView$h.a(View, int, Bundle)>
	//   25   51:ireturn         
		else
			return false;
	//   26   52:iconst_0        
	//   27   53:ireturn         
	}

	final ai a;

	public ai$a(ai ai1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void a()>
		a = ai1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ai a>
	//    5    9:return          
	}
}
