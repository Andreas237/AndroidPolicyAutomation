// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;


// Referenced classes of package com.irobot.home.view:
//			GestureImageView, e

private class GestureImageView$e
	implements e.a
{

	public boolean a(e e1)
	{
		GestureImageView.a(a, e1.a(), e1.b(), e1.c());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GestureImageView a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method float e.a()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #31  <Method float e.b()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #34  <Method float e.c()>
	//    8   16:invokestatic    #37  <Method void GestureImageView.a(GestureImageView, float, float, float)>
		return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean b(e e1)
	{
		GestureImageView.a(a, GestureImageView$g.ROTATE);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GestureImageView a>
	//    2    4:getstatic       #43  <Field GestureImageView$g GestureImageView$g.ROTATE>
	//    3    7:invokestatic    #46  <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
		return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
	}

	public boolean c(e e1)
	{
		GestureImageView.a(a, GestureImageView$g.NONE);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GestureImageView a>
	//    2    4:getstatic       #49  <Field GestureImageView$g GestureImageView$g.NONE>
	//    3    7:invokestatic    #46  <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
		return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
	}

	final GestureImageView a;

	private GestureImageView$e(GestureImageView gestureimageview)
	{
		a = gestureimageview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field GestureImageView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	GestureImageView$e(GestureImageView gestureimageview, GestureImageView$1 gestureimageview$1)
	{
		this(gestureimageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void GestureImageView$e(GestureImageView)>
	//    3    5:return          
	}
}
