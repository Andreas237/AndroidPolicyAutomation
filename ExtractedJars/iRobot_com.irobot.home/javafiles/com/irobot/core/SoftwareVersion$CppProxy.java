// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			SoftwareVersion

private static final class SoftwareVersion$CppProxy extends SoftwareVersion
{

	private native void nativeDestroy(long l);

	private native int native_build(long l);

	private native boolean native_isEqualTo(long l, SoftwareVersion softwareversion);

	private native boolean native_isNewerThan(long l, SoftwareVersion softwareversion);

	private native boolean native_isNewerThanOrEqual(long l, SoftwareVersion softwareversion);

	private native int native_major(long l);

	private native int native_minor(long l);

	private native String native_revision(long l);

	private native String native_toString(long l);

	public int build()
	{
		return native_build(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #51  <Method int native_build(long)>
	//    4    8:ireturn         
	}

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #56  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #58  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #65  <Method void Object.finalize()>
	//    4    8:return          
	}

	public boolean isEqualTo(SoftwareVersion softwareversion)
	{
		return native_isEqualTo(nativeRef, softwareversion);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #69  <Method boolean native_isEqualTo(long, SoftwareVersion)>
	//    5    9:ireturn         
	}

	public boolean isNewerThan(SoftwareVersion softwareversion)
	{
		return native_isNewerThan(nativeRef, softwareversion);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #72  <Method boolean native_isNewerThan(long, SoftwareVersion)>
	//    5    9:ireturn         
	}

	public boolean isNewerThanOrEqual(SoftwareVersion softwareversion)
	{
		return native_isNewerThanOrEqual(nativeRef, softwareversion);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #75  <Method boolean native_isNewerThanOrEqual(long, SoftwareVersion)>
	//    5    9:ireturn         
	}

	public int major()
	{
		return native_major(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #78  <Method int native_major(long)>
	//    4    8:ireturn         
	}

	public int minor()
	{
		return native_minor(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #81  <Method int native_minor(long)>
	//    4    8:ireturn         
	}

	public String revision()
	{
		return native_revision(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #85  <Method String native_revision(long)>
	//    4    8:areturn         
	}

	public String toString()
	{
		return native_toString(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #88  <Method String native_toString(long)>
	//    4    8:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private SoftwareVersion$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void SoftwareVersion()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
		if(l == 0L)
	//*   8   16:lload_1         
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifne            32
		{
			throw new RuntimeException("nativeRef is zero");
	//   12   22:new             #28  <Class RuntimeException>
	//   13   25:dup             
	//   14   26:ldc1            #30  <String "nativeRef is zero">
	//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
	//   16   31:athrow          
		} else
		{
			nativeRef = l;
	//   17   32:aload_0         
	//   18   33:lload_1         
	//   19   34:putfield        #35  <Field long nativeRef>
			return;
	//   20   37:return          
		}
	}
}
