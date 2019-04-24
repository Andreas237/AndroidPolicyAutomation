// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package o:
//			ap, al

class am extends ap
	implements al
{

	am(Context context, ViewGroup viewgroup, View view)
	{
		super(context, viewgroup, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #13  <Method void ap(Context, ViewGroup, View)>
	//    5    7:return          
	}

	static am e(ViewGroup viewgroup)
	{
		return (am)ap.a(((View) (viewgroup)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #20  <Method ap ap.a(View)>
	//    2    4:checkcast       #2   <Class am>
	//    3    7:areturn         
	}

	public void c(View view)
	{
		c.c(view);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ap$d c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method void ap$d.c(View)>
	//    4    8:return          
	}

	public void d(View view)
	{
		c.e(view);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ap$d c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void ap$d.e(View)>
	//    4    8:return          
	}
}
