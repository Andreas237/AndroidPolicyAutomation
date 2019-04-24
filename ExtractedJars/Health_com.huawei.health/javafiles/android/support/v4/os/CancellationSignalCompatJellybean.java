// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.CancellationSignal;

class CancellationSignalCompatJellybean
{

	CancellationSignalCompatJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void cancel(Object obj)
	{
		((CancellationSignal)obj).cancel();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class CancellationSignal>
	//    2    4:invokevirtual   #18  <Method void CancellationSignal.cancel()>
	//    3    7:return          
	}

	public static Object create()
	{
		return ((Object) (new CancellationSignal()));
	//    0    0:new             #16  <Class CancellationSignal>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void CancellationSignal()>
	//    3    7:areturn         
	}
}
