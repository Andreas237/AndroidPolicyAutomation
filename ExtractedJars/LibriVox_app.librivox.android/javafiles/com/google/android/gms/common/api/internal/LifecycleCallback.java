// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			n, dh, df, o

public class LifecycleCallback
{

	protected LifecycleCallback(o o1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = o1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field o a>
	//    5    9:return          
	}

	protected static o a(n n1)
	{
		if(n1.a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #20  <Method boolean n.a()>
	//*   2    4:ifeq            15
			return ((o) (dh.a(n1.d())));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #24  <Method android.support.v4.app.x n.d()>
	//    5   11:invokestatic    #29  <Method dh dh.a(android.support.v4.app.x)>
	//    6   14:areturn         
		if(n1.b())
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #32  <Method boolean n.b()>
	//*   9   19:ifeq            30
			return ((o) (df.a(n1.c())));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #36  <Method Activity n.c()>
	//   12   26:invokestatic    #41  <Method df df.a(Activity)>
	//   13   29:areturn         
		else
			throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
	//   14   30:new             #43  <Class IllegalArgumentException>
	//   15   33:dup             
	//   16   34:ldc1            #45  <String "Can't get fragment for unexpected activity.">
	//   17   36:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//   18   39:athrow          
	}

	private static o getChimeraLifecycleFragmentImpl(n n1)
	{
		throw new IllegalStateException("Method not available in SDK.");
	//    0    0:new             #52  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #54  <String "Method not available in SDK.">
	//    3    6:invokespecial   #55  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public Activity a()
	{
		return a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field o a>
	//    2    4:invokeinterface #60  <Method Activity o.a()>
	//    3    9:areturn         
	}

	public void a(int i, int j, Intent intent)
	{
	//    0    0:return          
	}

	public void a(Bundle bundle)
	{
	//    0    0:return          
	}

	public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public void b()
	{
	//    0    0:return          
	}

	public void b(Bundle bundle)
	{
	//    0    0:return          
	}

	public void c()
	{
	//    0    0:return          
	}

	public void d()
	{
	//    0    0:return          
	}

	public void e()
	{
	//    0    0:return          
	}

	protected final o a;
}
