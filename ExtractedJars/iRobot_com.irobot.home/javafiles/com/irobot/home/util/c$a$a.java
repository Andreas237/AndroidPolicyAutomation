// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.view.MotionEvent;

// Referenced classes of package com.irobot.home.util:
//			c

private final class c$a$a extends android.view.eDetector.SimpleOnGestureListener
{

	public boolean onDown(MotionEvent motionevent)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		f1 = motionevent1.getY();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #33  <Method float MotionEvent.getY()>
	//    2    4:fstore          4
		float f2 = motionevent.getY();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #33  <Method float MotionEvent.getY()>
	//    5   10:fstore          5
		float f3 = motionevent1.getX() - motionevent.getX();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #36  <Method float MotionEvent.getX()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #36  <Method float MotionEvent.getX()>
	//   10   20:fsub            
	//   11   21:fstore          6
		if(Math.abs(f3) <= Math.abs(f1 - f2) || Math.abs(f3) <= 250F || Math.abs(f) <= 200F)
			break MISSING_BLOCK_LABEL_75;
	//   12   23:fload           6
	//   13   25:invokestatic    #42  <Method float Math.abs(float)>
	//   14   28:fload           4
	//   15   30:fload           5
	//   16   32:fsub            
	//   17   33:invokestatic    #42  <Method float Math.abs(float)>
	//   18   36:fcmpl           
	//   19   37:ifle            75
	//   20   40:fload           6
	//   21   42:invokestatic    #42  <Method float Math.abs(float)>
	//   22   45:ldc1            #43  <Float 250F>
	//   23   47:fcmpl           
	//   24   48:ifle            75
	//   25   51:fload_3         
	//   26   52:invokestatic    #42  <Method float Math.abs(float)>
	//   27   55:ldc1            #44  <Float 200F>
	//   28   57:fcmpl           
	//   29   58:ifle            75
		a.a();
	//   30   61:aload_0         
	//   31   62:getfield        #14  <Field c$a a>
	//   32   65:invokevirtual   #46  <Method void c$a.a()>
		return true;
	//   33   68:iconst_1        
	//   34   69:ireturn         
		motionevent;
	//   35   70:astore_1        
		((Exception) (motionevent)).printStackTrace();
	//   36   71:aload_1         
	//   37   72:invokevirtual   #49  <Method void Exception.printStackTrace()>
		return false;
	//   38   75:iconst_0        
	//   39   76:ireturn         
	}

	final c.a a;

	private c$a$a(c.a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field c$a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
	//    5    9:return          
	}

	c$a$a(c.a a1, c._cls1 _pcls1)
	{
		this(a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void c$a$a(c$a)>
	//    3    5:return          
	}
}
