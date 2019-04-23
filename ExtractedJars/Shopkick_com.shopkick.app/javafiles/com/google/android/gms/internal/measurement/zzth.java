// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztl

abstract class zzth
	implements zztl
{

	zzth()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Object next()
	{
		return ((Object) (Byte.valueOf(nextByte())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method byte nextByte()>
	//    2    4:invokestatic    #23  <Method Byte Byte.valueOf(byte)>
	//    3    7:areturn         
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #26  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}
}
