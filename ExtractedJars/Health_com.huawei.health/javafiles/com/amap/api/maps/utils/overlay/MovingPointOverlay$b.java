// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.utils.overlay;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.amap.api.maps.utils.overlay:
//			MovingPointOverlay

class MovingPointOverlay$b
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		return new Thread(runnable, "MoveSmoothThread");
	//    0    0:new             #26  <Class Thread>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #28  <String "MoveSmoothThread">
	//    4    7:invokespecial   #31  <Method void Thread(Runnable, String)>
	//    5   10:areturn         
	}

	final MovingPointOverlay a;

	private MovingPointOverlay$b(MovingPointOverlay movingpointoverlay)
	{
		a = movingpointoverlay;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MovingPointOverlay a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	MovingPointOverlay$b(MovingPointOverlay movingpointoverlay, MovingPointOverlay$1 movingpointoverlay$1)
	{
		this(movingpointoverlay);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void MovingPointOverlay$b(MovingPointOverlay)>
	//    3    5:return          
	}
}
