// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.irobot.core.NotificationCenterDataItem;
import com.irobot.home.s.a;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home.fragments:
//			ac

private class ac$a extends android.support.v7.widget.lerView.a
{

	public int a()
	{
		return com.irobot.home.fragments.ac.a(a).size();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ac a>
	//    2    4:invokestatic    #29  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
	//    3    7:invokevirtual   #34  <Method int ArrayList.size()>
	//    4   10:ireturn         
	}

	public a a(ViewGroup viewgroup, int i)
	{
		return new a(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0b00ef, viewgroup, false));
	//    0    0:new             #37  <Class a>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method Context ViewGroup.getContext()>
	//    4    8:invokestatic    #49  <Method LayoutInflater LayoutInflater.from(Context)>
	//    5   11:ldc1            #50  <Int 0x7f0b00ef>
	//    6   13:aload_1         
	//    7   14:iconst_0        
	//    8   15:invokevirtual   #54  <Method android.view.View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    9   18:invokespecial   #57  <Method void a(android.view.View)>
	//   10   21:areturn         
	}

	public volatile void a(android.support.v7.widget.lerView.u u, int i)
	{
		a((a)u, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #37  <Class a>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #61  <Method void a(a, int)>
	//    5    9:return          
	}

	public void a(a a1, int i)
	{
		a1.a(b, i, (NotificationCenterDataItem)com.irobot.home.fragments.ac.a(a).get(i), c);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Context b>
	//    3    5:iload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #17  <Field ac a>
	//    6   10:invokestatic    #29  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
	//    7   13:iload_2         
	//    8   14:invokevirtual   #65  <Method Object ArrayList.get(int)>
	//    9   17:checkcast       #67  <Class NotificationCenterDataItem>
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field ac$b c>
	//   12   24:invokevirtual   #70  <Method void a.a(Context, int, NotificationCenterDataItem, ac$b)>
	//   13   27:return          
	}

	public android.support.v7.widget.lerView.u b(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.lerView.u) (a(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #73  <Method a a(ViewGroup, int)>
	//    4    6:areturn         
	}

	final ac a;
	private Context b;
	private ac$b c;

	ac$a(ac ac1, Context context, ac$b ac$b)
	{
		a = ac1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ac a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void android.support.v7.widget.RecyclerView$a()>
		b = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Context b>
		c = ac$b;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field ac$b c>
	//   11   19:return          
	}
}
