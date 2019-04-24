// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.view.MotionEvent;

// Referenced classes of package com.irobot.home.view:
//			GestureImageView

private class GestureImageView$b extends android.view.pleOnGestureListener
{

	public boolean onDoubleTap(MotionEvent motionevent)
	{
		boolean flag;
		if(GestureImageView.k(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field GestureImageView a>
	//*   2    4:invokestatic    #26  <Method android.view.GestureDetector$OnDoubleTapListener GestureImageView.k(GestureImageView)>
	//*   3    7:ifnull          28
			flag = GestureImageView.k(a).onDoubleTap(motionevent);
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field GestureImageView a>
	//    6   14:invokestatic    #26  <Method android.view.GestureDetector$OnDoubleTapListener GestureImageView.k(GestureImageView)>
	//    7   17:aload_1         
	//    8   18:invokeinterface #30  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTap(MotionEvent)>
	//    9   23:istore          4
		else
	//*  10   25:goto            31
			flag = false;
	//   11   28:iconst_0        
	//   12   29:istore          4
		if(GestureImageView.h(a) == GestureImageView$g.NONE)
	//*  13   31:aload_0         
	//*  14   32:getfield        #13  <Field GestureImageView a>
	//*  15   35:invokestatic    #34  <Method GestureImageView$g GestureImageView.h(GestureImageView)>
	//*  16   38:getstatic       #40  <Field GestureImageView$g GestureImageView$g.NONE>
	//*  17   41:if_acmpne       140
		{
			float f1 = GestureImageView.l(a);
	//   18   44:aload_0         
	//   19   45:getfield        #13  <Field GestureImageView a>
	//   20   48:invokestatic    #44  <Method float GestureImageView.l(GestureImageView)>
	//   21   51:fstore_3        
			float f = 1.0F;
	//   22   52:fconst_1        
	//   23   53:fstore_2        
			if(f1 == 1.0F)
	//*  24   54:fload_3         
	//*  25   55:fconst_1        
	//*  26   56:fcmpl           
	//*  27   57:ifne            63
				f = 3F;
	//   28   60:ldc1            #45  <Float 3F>
	//   29   62:fstore_2        
			if(GestureImageView.k(a) == null)
	//*  30   63:aload_0         
	//*  31   64:getfield        #13  <Field GestureImageView a>
	//*  32   67:invokestatic    #26  <Method android.view.GestureDetector$OnDoubleTapListener GestureImageView.k(GestureImageView)>
	//*  33   70:ifnonnull       104
				GestureImageView.a(a, new GestureImageView$a(a, f, motionevent.getX(), motionevent.getY()));
	//   34   73:aload_0         
	//   35   74:getfield        #13  <Field GestureImageView a>
	//   36   77:new             #47  <Class GestureImageView$a>
	//   37   80:dup             
	//   38   81:aload_0         
	//   39   82:getfield        #13  <Field GestureImageView a>
	//   40   85:fload_2         
	//   41   86:aload_1         
	//   42   87:invokevirtual   #53  <Method float MotionEvent.getX()>
	//   43   90:aload_1         
	//   44   91:invokevirtual   #56  <Method float MotionEvent.getY()>
	//   45   94:invokespecial   #59  <Method void GestureImageView$a(GestureImageView, float, float, float)>
	//   46   97:invokestatic    #62  <Method GestureImageView$a GestureImageView.a(GestureImageView, GestureImageView$a)>
	//   47  100:pop             
			else
	//*  48  101:goto            123
				GestureImageView.m(a).a(f, motionevent.getX(), motionevent.getY());
	//   49  104:aload_0         
	//   50  105:getfield        #13  <Field GestureImageView a>
	//   51  108:invokestatic    #66  <Method GestureImageView$a GestureImageView.m(GestureImageView)>
	//   52  111:fload_2         
	//   53  112:aload_1         
	//   54  113:invokevirtual   #53  <Method float MotionEvent.getX()>
	//   55  116:aload_1         
	//   56  117:invokevirtual   #56  <Method float MotionEvent.getY()>
	//   57  120:invokevirtual   #69  <Method void GestureImageView$a.a(float, float, float)>
			a.postOnAnimation(((Runnable) (GestureImageView.m(a))));
	//   58  123:aload_0         
	//   59  124:getfield        #13  <Field GestureImageView a>
	//   60  127:aload_0         
	//   61  128:getfield        #13  <Field GestureImageView a>
	//   62  131:invokestatic    #66  <Method GestureImageView$a GestureImageView.m(GestureImageView)>
	//   63  134:invokevirtual   #73  <Method void GestureImageView.postOnAnimation(Runnable)>
			flag = true;
	//   64  137:iconst_1        
	//   65  138:istore          4
		}
		return flag;
	//   66  140:iload           4
	//   67  142:ireturn         
	}

	public boolean onSingleTapConfirmed(MotionEvent motionevent)
	{
		return a.performClick();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field GestureImageView a>
	//    2    4:invokevirtual   #78  <Method boolean GestureImageView.performClick()>
	//    3    7:ireturn         
	}

	final GestureImageView a;

	private GestureImageView$b(GestureImageView gestureimageview)
	{
		a = gestureimageview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field GestureImageView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
	//    5    9:return          
	}

	GestureImageView$b(GestureImageView gestureimageview, GestureImageView$1 gestureimageview$1)
	{
		this(gestureimageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void GestureImageView$b(GestureImageView)>
	//    3    5:return          
	}
}
