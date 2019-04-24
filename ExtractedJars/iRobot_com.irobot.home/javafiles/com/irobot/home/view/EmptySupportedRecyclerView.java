// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class EmptySupportedRecyclerView extends RecyclerView
{

	public EmptySupportedRecyclerView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void RecyclerView(Context)>
		I = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #17  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #20  <Method void ArrayList()>
	//    7   13:putfield        #22  <Field ArrayList I>
	//    8   16:aload_0         
	//    9   17:new             #6   <Class EmptySupportedRecyclerView$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #25  <Method void EmptySupportedRecyclerView$1(EmptySupportedRecyclerView)>
	//   13   25:putfield        #27  <Field android.support.v7.widget.RecyclerView$c J>
	//   14   28:return          
	}

	public EmptySupportedRecyclerView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void RecyclerView(Context, AttributeSet)>
		I = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #17  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #20  <Method void ArrayList()>
	//    8   14:putfield        #22  <Field ArrayList I>
	//    9   17:aload_0         
	//   10   18:new             #6   <Class EmptySupportedRecyclerView$1>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #25  <Method void EmptySupportedRecyclerView$1(EmptySupportedRecyclerView)>
	//   14   26:putfield        #27  <Field android.support.v7.widget.RecyclerView$c J>
	//   15   29:return          
	}

	public EmptySupportedRecyclerView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #34  <Method void RecyclerView(Context, AttributeSet, int)>
		I = new ArrayList();
	//    5    7:aload_0         
	//    6    8:new             #17  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #20  <Method void ArrayList()>
	//    9   15:putfield        #22  <Field ArrayList I>
	//   10   18:aload_0         
	//   11   19:new             #6   <Class EmptySupportedRecyclerView$1>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:invokespecial   #25  <Method void EmptySupportedRecyclerView$1(EmptySupportedRecyclerView)>
	//   15   27:putfield        #27  <Field android.support.v7.widget.RecyclerView$c J>
	//   16   30:return          
	}

	private void A()
	{
		if(getAdapter() != null && I.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #39  <Method android.support.v7.widget.RecyclerView$a getAdapter()>
	//*   2    4:ifnull          68
	//*   3    7:aload_0         
	//*   4    8:getfield        #22  <Field ArrayList I>
	//*   5   11:invokevirtual   #43  <Method int ArrayList.size()>
	//*   6   14:ifle            68
		{
			byte byte0;
			if(getAdapter().a() == 0)
	//*   7   17:aload_0         
	//*   8   18:invokevirtual   #39  <Method android.support.v7.widget.RecyclerView$a getAdapter()>
	//*   9   21:invokevirtual   #48  <Method int android.support.v7.widget.RecyclerView$a.a()>
	//*  10   24:ifne            32
				byte0 = 0;
	//   11   27:iconst_0        
	//   12   28:istore_1        
			else
	//*  13   29:goto            35
				byte0 = 8;
	//   14   32:bipush          8
	//   15   34:istore_1        
			for(Iterator iterator = I.iterator(); iterator.hasNext(); ((View)iterator.next()).setVisibility(((int) (byte0))));
	//   16   35:aload_0         
	//   17   36:getfield        #22  <Field ArrayList I>
	//   18   39:invokevirtual   #52  <Method Iterator ArrayList.iterator()>
	//   19   42:astore_2        
	//   20   43:aload_2         
	//   21   44:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   22   49:ifeq            68
	//   23   52:aload_2         
	//   24   53:invokeinterface #62  <Method Object Iterator.next()>
	//   25   58:checkcast       #64  <Class View>
	//   26   61:iload_1         
	//   27   62:invokevirtual   #68  <Method void View.setVisibility(int)>
		}
	//*  28   65:goto            43
	//   29   68:return          
	}

	static void a(EmptySupportedRecyclerView emptysupportedrecyclerview)
	{
		emptysupportedrecyclerview.A();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void A()>
	//    2    4:return          
	}

	public void m(View view)
	{
		I.add(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ArrayList I>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		A();
	//    5    9:aload_0         
	//    6   10:invokespecial   #70  <Method void A()>
	//    7   13:return          
	}

	public void setAdapter(android.support.v7.widget.RecyclerView.a a1)
	{
		android.support.v7.widget.RecyclerView.a a2 = getAdapter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method android.support.v7.widget.RecyclerView$a getAdapter()>
	//    2    4:astore_2        
		if(a2 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			a2.b(J);
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #27  <Field android.support.v7.widget.RecyclerView$c J>
	//    8   14:invokevirtual   #82  <Method void android.support.v7.widget.RecyclerView$a.b(android.support.v7.widget.RecyclerView$c)>
		if(a1 != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          29
			a1.a(J);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field android.support.v7.widget.RecyclerView$c J>
	//   14   26:invokevirtual   #84  <Method void android.support.v7.widget.RecyclerView$a.a(android.support.v7.widget.RecyclerView$c)>
		super.setAdapter(a1);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokespecial   #86  <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		A();
	//   18   34:aload_0         
	//   19   35:invokespecial   #70  <Method void A()>
	//   20   38:return          
	}

	private ArrayList I;
	private android.support.v7.widget.RecyclerView.c J = new android.support.v7.widget.RecyclerView.c() {

		public void a()
		{
			super.a();
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void android.support.v7.widget.RecyclerView$c.a()>
			EmptySupportedRecyclerView.a(a);
		//    2    4:aload_0         
		//    3    5:getfield        #12  <Field EmptySupportedRecyclerView a>
		//    4    8:invokestatic    #20  <Method void EmptySupportedRecyclerView.a(EmptySupportedRecyclerView)>
		//    5   11:return          
		}

		final EmptySupportedRecyclerView a;

			
			{
				a = EmptySupportedRecyclerView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field EmptySupportedRecyclerView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void android.support.v7.widget.RecyclerView$c()>
			//    5    9:return          
			}
	}
;
}
