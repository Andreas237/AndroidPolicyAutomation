// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors, Message

public static class Descriptors$DescriptorValidationException extends Exception
{

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String description>
	//    2    4:areturn         
	}

	public Message getProblemProto()
	{
		return proto;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Message proto>
	//    2    4:areturn         
	}

	public String getProblemSymbolName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String name>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 0xd98283ccL;
	private final String description;
	private final String name;
	private final Message proto;

	private Descriptors$DescriptorValidationException(Descriptors.FileDescriptor filedescriptor, String s)
	{
		super((new StringBuilder()).append(filedescriptor.getName()).append(": ").append(s).toString());
	//    0    0:aload_0         
	//    1    1:new             #20  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #23  <Method void StringBuilder()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #29  <Method String Descriptors$FileDescriptor.getName()>
	//    6   12:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:ldc1            #35  <String ": ">
	//    8   17:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_2         
	//   10   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #41  <Method void Exception(String)>
		name = filedescriptor.getName();
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:invokevirtual   #29  <Method String Descriptors$FileDescriptor.getName()>
	//   16   35:putfield        #43  <Field String name>
		proto = ((Message) (filedescriptor.toProto()));
	//   17   38:aload_0         
	//   18   39:aload_1         
	//   19   40:invokevirtual   #47  <Method DescriptorProtos$FileDescriptorProto Descriptors$FileDescriptor.toProto()>
	//   20   43:putfield        #49  <Field Message proto>
		description = s;
	//   21   46:aload_0         
	//   22   47:aload_2         
	//   23   48:putfield        #51  <Field String description>
	//   24   51:return          
	}

	Descriptors$DescriptorValidationException(Descriptors.FileDescriptor filedescriptor, String s, Descriptors._cls1 _pcls1)
	{
		this(filedescriptor, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #55  <Method void Descriptors$DescriptorValidationException(Descriptors$FileDescriptor, String)>
	//    4    6:return          
	}

	private Descriptors$DescriptorValidationException(Descriptors.GenericDescriptor genericdescriptor, String s)
	{
		super((new StringBuilder()).append(genericdescriptor.getFullName()).append(": ").append(s).toString());
	//    0    0:aload_0         
	//    1    1:new             #20  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #23  <Method void StringBuilder()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #61  <Method String Descriptors$GenericDescriptor.getFullName()>
	//    6   12:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:ldc1            #35  <String ": ">
	//    8   17:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_2         
	//   10   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #41  <Method void Exception(String)>
		name = genericdescriptor.getFullName();
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:invokevirtual   #61  <Method String Descriptors$GenericDescriptor.getFullName()>
	//   16   35:putfield        #43  <Field String name>
		proto = genericdescriptor.toProto();
	//   17   38:aload_0         
	//   18   39:aload_1         
	//   19   40:invokevirtual   #64  <Method Message Descriptors$GenericDescriptor.toProto()>
	//   20   43:putfield        #49  <Field Message proto>
		description = s;
	//   21   46:aload_0         
	//   22   47:aload_2         
	//   23   48:putfield        #51  <Field String description>
	//   24   51:return          
	}

	Descriptors$DescriptorValidationException(Descriptors.GenericDescriptor genericdescriptor, String s, Descriptors._cls1 _pcls1)
	{
		this(genericdescriptor, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #67  <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String)>
	//    4    6:return          
	}

	private Descriptors$DescriptorValidationException(Descriptors.GenericDescriptor genericdescriptor, String s, Throwable throwable)
	{
		this(genericdescriptor, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #67  <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String)>
		initCause(throwable);
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #72  <Method Throwable initCause(Throwable)>
	//    7   11:pop             
	//    8   12:return          
	}

	Descriptors$DescriptorValidationException(Descriptors.GenericDescriptor genericdescriptor, String s, Throwable throwable, Descriptors._cls1 _pcls1)
	{
		this(genericdescriptor, s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #75  <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Throwable)>
	//    5    7:return          
	}
}
