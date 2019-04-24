// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.MotionEvent;
import com.irobot.home.view.RevealableView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.irobot.home.b:
//			ak

class ak$3 extends android.view.reDetector.SimpleOnGestureListener
{

	public boolean onSingleTapConfirmed(MotionEvent motionevent)
	{
		for(Iterator iterator = ak.f(a).iterator(); iterator.hasNext() && !((RevealableView)iterator.next()).a(motionevent.getX(), motionevent.getY()););
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ak a>
	//    2    4:invokestatic    #22  <Method List ak.f(ak)>
	//    3    7:invokeinterface #28  <Method Iterator List.iterator()>
	//    4   12:astore_2        
	//    5   13:aload_2         
	//    6   14:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            45
	//    8   22:aload_2         
	//    9   23:invokeinterface #38  <Method Object Iterator.next()>
	//   10   28:checkcast       #40  <Class RevealableView>
	//   11   31:aload_1         
	//   12   32:invokevirtual   #46  <Method float MotionEvent.getX()>
	//   13   35:aload_1         
	//   14   36:invokevirtual   #49  <Method float MotionEvent.getY()>
	//   15   39:invokevirtual   #52  <Method boolean RevealableView.a(float, float)>
	//   16   42:ifeq            13
		return true;
	//   17   45:iconst_1        
	//   18   46:ireturn         
	}

	final ak a;

	ak$3(ak ak1)
	{
		a = ak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ak a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
	//    5    9:return          
	}
}
