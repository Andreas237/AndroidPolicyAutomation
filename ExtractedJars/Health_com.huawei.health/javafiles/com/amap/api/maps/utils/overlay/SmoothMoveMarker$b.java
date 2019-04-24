// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.utils.overlay;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.amap.api.maps.utils.overlay:
//			SmoothMoveMarker

static class SmoothMoveMarker$b
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		return new Thread(runnable, "MoveSmoothThread");
	//    0    0:new             #20  <Class Thread>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #22  <String "MoveSmoothThread">
	//    4    7:invokespecial   #25  <Method void Thread(Runnable, String)>
	//    5   10:areturn         
	}

	private SmoothMoveMarker$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	SmoothMoveMarker$b(SmoothMoveMarker$1 smoothmovemarker$1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void SmoothMoveMarker$b()>
	//    2    4:return          
	}
}
