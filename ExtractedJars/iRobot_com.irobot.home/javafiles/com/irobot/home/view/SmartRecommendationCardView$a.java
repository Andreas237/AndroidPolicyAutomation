// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;

// Referenced classes of package com.irobot.home.view:
//			SmartRecommendationCardView

public static class SmartRecommendationCardView$a
{

	public SmartRecommendationCardView$a a(int i)
	{
		a.c = i;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    2    4:iload_1         
	//    3    5:putfield        #29  <Field int SmartRecommendationCardView$b.c>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SmartRecommendationCardView$a a(com.irobot.home.n.b.a a1)
	{
		a.i = a1;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    2    4:aload_1         
	//    3    5:putfield        #34  <Field com.irobot.home.n.b$a SmartRecommendationCardView$b.i>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SmartRecommendationCardView$a a(com.irobot.home.n.b.c c1)
	{
		a.k = c1;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    2    4:aload_1         
	//    3    5:putfield        #39  <Field com.irobot.home.n.b$c SmartRecommendationCardView$b.k>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SmartRecommendationCardView$a a(String s)
	{
		a.e = s;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    2    4:aload_1         
	//    3    5:putfield        #44  <Field String SmartRecommendationCardView$b.e>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SmartRecommendationCardView a()
	{
		SmartRecommendationCardView smartrecommendationcardview = new SmartRecommendationCardView(b);
	//    0    0:new             #6   <Class SmartRecommendationCardView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Context b>
	//    4    8:invokespecial   #46  <Method void SmartRecommendationCardView(Context)>
	//    5   11:astore_1        
		SmartRecommendationCardView.a(smartrecommendationcardview, a);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    9   17:invokestatic    #49  <Method void SmartRecommendationCardView.a(SmartRecommendationCardView, SmartRecommendationCardView$b)>
		return smartrecommendationcardview;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public SmartRecommendationCardView$a b(int i)
	{
		a.d = i;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    2    4:iload_1         
	//    3    5:putfield        #52  <Field int SmartRecommendationCardView$b.d>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SmartRecommendationCardView$a b(com.irobot.home.n.b.a a1)
	{
		a.j = a1;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    2    4:aload_1         
	//    3    5:putfield        #55  <Field com.irobot.home.n.b$a SmartRecommendationCardView$b.j>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SmartRecommendationCardView$a b(String s)
	{
		a.f = s;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    2    4:aload_1         
	//    3    5:putfield        #58  <Field String SmartRecommendationCardView$b.f>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SmartRecommendationCardView$a c(int i)
	{
		a.h = b.getString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Context b>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #64  <Method String Context.getString(int)>
	//    6   12:putfield        #67  <Field String SmartRecommendationCardView$b.h>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public SmartRecommendationCardView$a c(String s)
	{
		a.g = s;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SmartRecommendationCardView$b a>
	//    2    4:aload_1         
	//    3    5:putfield        #70  <Field String SmartRecommendationCardView$b.g>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final SmartRecommendationCardView$b a;
	private final Context b;

	public SmartRecommendationCardView$a(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Context b>
		a = new SmartRecommendationCardView$b(context);
	//    5    9:aload_0         
	//    6   10:new             #19  <Class SmartRecommendationCardView$b>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #21  <Method void SmartRecommendationCardView$b(Context)>
	//   10   18:putfield        #23  <Field SmartRecommendationCardView$b a>
	//   11   21:return          
	}
}
