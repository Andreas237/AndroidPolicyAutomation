// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors, Message

public static abstract class Descriptors$GenericDescriptor
{

	public abstract Descriptors.FileDescriptor getFile();

	public abstract String getFullName();

	public abstract String getName();

	public abstract Message toProto();

	public Descriptors$GenericDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
