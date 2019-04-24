// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;

// Referenced classes of package android.support.transition:
//			ad, ChangeTransform, Transition, j, 
//			i

private static class ChangeTransform$a extends ad
{

	public void a(Transition transition)
	{
		transition.b(((Transition.c) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #26  <Method Transition Transition.b(Transition$c)>
	//    3    5:pop             
		j.a(a);
	//    4    6:aload_0         
	//    5    7:getfield        #17  <Field View a>
	//    6   10:invokestatic    #31  <Method void j.a(View)>
		a.setTag(y.a.transition_transform, ((Object) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field View a>
	//    9   17:getstatic       #37  <Field int y$a.transition_transform>
	//   10   20:aconst_null     
	//   11   21:invokevirtual   #43  <Method void View.setTag(int, Object)>
		a.setTag(y.a.parent_matrix, ((Object) (null)));
	//   12   24:aload_0         
	//   13   25:getfield        #17  <Field View a>
	//   14   28:getstatic       #46  <Field int y$a.parent_matrix>
	//   15   31:aconst_null     
	//   16   32:invokevirtual   #43  <Method void View.setTag(int, Object)>
	//   17   35:return          
	}

	public void b(Transition transition)
	{
		b.setVisibility(4);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field i b>
	//    2    4:iconst_4        
	//    3    5:invokeinterface #52  <Method void i.setVisibility(int)>
	//    4   10:return          
	}

	public void c(Transition transition)
	{
		b.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field i b>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #52  <Method void i.setVisibility(int)>
	//    4   10:return          
	}

	private View a;
	private i b;

	ChangeTransform$a(View view, i k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ad()>
		a = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field View a>
		b = k;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field i b>
	//    8   14:return          
	}
}
