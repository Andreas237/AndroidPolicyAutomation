// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.af;
import android.support.v7.v;
import java.util.concurrent.SynchronousQueue;

// Referenced classes of package com.truenet.android:
//			b

static final class b$f extends af
	implements v
{

	public Object a()
	{
		return ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method SynchronousQueue b()>
	//    2    4:areturn         
	}

	public final SynchronousQueue b()
	{
		return new SynchronousQueue();
	//    0    0:new             #32  <Class SynchronousQueue>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void SynchronousQueue()>
	//    3    7:areturn         
	}

	public static final b$f a = new b$f();

	static 
	{
	//    0    0:new             #2   <Class b$f>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void b$f()>
	//    3    7:putstatic       #20  <Field b$f a>
	//*   4   10:return          
	}

	b$f()
	{
		super(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #24  <Method void af(int)>
	//    3    5:return          
	}
}
