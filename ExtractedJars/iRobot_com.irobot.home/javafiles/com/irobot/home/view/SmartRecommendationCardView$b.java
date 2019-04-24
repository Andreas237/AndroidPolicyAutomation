// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.view.LayoutInflater;

// Referenced classes of package com.irobot.home.view:
//			SmartRecommendationCardView

private static class SmartRecommendationCardView$b
{

	public int a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int c>
	//    2    4:ireturn         
	}

	public String b()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String f>
	//    2    4:areturn         
	}

	public String c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String g>
	//    2    4:areturn         
	}

	public String d()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String h>
	//    2    4:areturn         
	}

	public String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String e>
	//    2    4:areturn         
	}

	public int f()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int d>
	//    2    4:ireturn         
	}

	public com.irobot.home.n.b.a g()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field com.irobot.home.n.b$a i>
	//    2    4:areturn         
	}

	public com.irobot.home.n.b.a h()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field com.irobot.home.n.b$a j>
	//    2    4:areturn         
	}

	public com.irobot.home.n.b.c i()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field com.irobot.home.n.b$c k>
	//    2    4:areturn         
	}

	public com.irobot.home.n.b.b j()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field com.irobot.home.n.b$b l>
	//    2    4:areturn         
	}

	final Context a;
	final LayoutInflater b;
	int c;
	int d;
	String e;
	String f;
	String g;
	String h;
	com.irobot.home.n.b.a i;
	com.irobot.home.n.b.a j;
	com.irobot.home.n.b.c k;
	com.irobot.home.n.b.b l;

	SmartRecommendationCardView$b(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field Context a>
		b = (LayoutInflater)context.getSystemService("layout_inflater");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #34  <String "layout_inflater">
	//    8   13:invokevirtual   #40  <Method Object Context.getSystemService(String)>
	//    9   16:checkcast       #42  <Class LayoutInflater>
	//   10   19:putfield        #44  <Field LayoutInflater b>
	//   11   22:return          
	}
}
