// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.os.Debug;

// Referenced classes of package com.squareup.leakcanary:
//			DebuggerControl

public final class AndroidDebuggerControl
	implements DebuggerControl
{

	public AndroidDebuggerControl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public boolean isDebuggerAttached()
	{
		return Debug.isDebuggerConnected();
	//    0    0:invokestatic    #18  <Method boolean Debug.isDebuggerConnected()>
	//    1    3:ireturn         
	}
}
