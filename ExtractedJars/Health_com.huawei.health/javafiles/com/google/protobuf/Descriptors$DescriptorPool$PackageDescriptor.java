// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors, Message

static final class Descriptors$DescriptorPool$PackageDescriptor extends Descriptors.GenericDescriptor
{

	public Descriptors.FileDescriptor getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Descriptors$FileDescriptor file>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String fullName>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String name>
	//    2    4:areturn         
	}

	public Message toProto()
	{
		return ((Message) (file.toProto()));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Descriptors$FileDescriptor file>
	//    2    4:invokevirtual   #39  <Method DescriptorProtos$FileDescriptorProto Descriptors$FileDescriptor.toProto()>
	//    3    7:areturn         
	}

	private final Descriptors.FileDescriptor file;
	private final String fullName;
	private final String name;

	Descriptors$DescriptorPool$PackageDescriptor(String s, String s1, Descriptors.FileDescriptor filedescriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Descriptors$GenericDescriptor()>
		file = filedescriptor;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #22  <Field Descriptors$FileDescriptor file>
		fullName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field String fullName>
		name = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #26  <Field String name>
	//   11   19:return          
	}
}
