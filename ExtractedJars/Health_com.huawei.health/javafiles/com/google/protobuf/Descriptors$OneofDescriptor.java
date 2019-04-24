// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.*;

// Referenced classes of package com.google.protobuf:
//			Descriptors

public static final class Descriptors$OneofDescriptor
{

	private void setProto(ptorProto ptorproto)
	{
		proto = ptorproto;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field DescriptorProtos$OneofDescriptorProto proto>
	//    3    5:return          
	}

	public Descriptors.Descriptor getContainingType()
	{
		return containingType;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Descriptors$Descriptor containingType>
	//    2    4:areturn         
	}

	public Descriptors$FieldDescriptor getField(int i)
	{
		return fields[i];
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Descriptors$FieldDescriptor[] fields>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int getFieldCount()
	{
		return fieldCount;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int fieldCount>
	//    2    4:ireturn         
	}

	public List getFields()
	{
		return Collections.unmodifiableList(Arrays.asList(((Object []) (fields))));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Descriptors$FieldDescriptor[] fields>
	//    2    4:invokestatic    #84  <Method List Arrays.asList(Object[])>
	//    3    7:invokestatic    #90  <Method List Collections.unmodifiableList(List)>
	//    4   10:areturn         
	}

	public Descriptors.FileDescriptor getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Descriptors$FileDescriptor file>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String fullName>
	//    2    4:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int index>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return proto.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field DescriptorProtos$OneofDescriptorProto proto>
	//    2    4:invokevirtual   #35  <Method String DescriptorProtos$OneofDescriptorProto.getName()>
	//    3    7:areturn         
	}

	public s getOptions()
	{
		return proto.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field DescriptorProtos$OneofDescriptorProto proto>
	//    2    4:invokevirtual   #100 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofDescriptorProto.getOptions()>
	//    3    7:areturn         
	}

	private Descriptors.Descriptor containingType;
	private int fieldCount;
	private Descriptors$FieldDescriptor fields[];
	private final Descriptors.FileDescriptor file;
	private final String fullName;
	private final int index;
	private ptorProto proto;


/*
	static Descriptors$FieldDescriptor[] access$1800(Descriptors$OneofDescriptor descriptors$oneofdescriptor)
	{
		return descriptors$oneofdescriptor.fields;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Descriptors$FieldDescriptor[] fields>
	//    2    4:areturn         
	}

*/


/*
	static Descriptors$FieldDescriptor[] access$1802(Descriptors$OneofDescriptor descriptors$oneofdescriptor, Descriptors$FieldDescriptor adescriptors$fielddescriptor[])
	{
		descriptors$oneofdescriptor.fields = adescriptors$fielddescriptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field Descriptors$FieldDescriptor[] fields>
		return adescriptors$fielddescriptor;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$1902(Descriptors$OneofDescriptor descriptors$oneofdescriptor, int i)
	{
		descriptors$oneofdescriptor.fieldCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int fieldCount>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$1908(Descriptors$OneofDescriptor descriptors$oneofdescriptor)
	{
		int i = descriptors$oneofdescriptor.fieldCount;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int fieldCount>
	//    2    4:istore_1        
		descriptors$oneofdescriptor.fieldCount = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #49  <Field int fieldCount>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

*/


/*
	static void access$2000(Descriptors$OneofDescriptor descriptors$oneofdescriptor, ptorProto ptorproto)
	{
		descriptors$oneofdescriptor.setProto(ptorproto);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void setProto(DescriptorProtos$OneofDescriptorProto)>
		return;
	//    3    5:return          
	}

*/

	private Descriptors$OneofDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor, Descriptors.Descriptor descriptor, int i)
		throws tionException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		proto = ptorproto;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field DescriptorProtos$OneofDescriptorProto proto>
		fullName = Descriptors.access$1600(filedescriptor, descriptor, ptorproto.getName());
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #35  <Method String DescriptorProtos$OneofDescriptorProto.getName()>
	//   10   16:invokestatic    #39  <Method String Descriptors.access$1600(Descriptors$FileDescriptor, Descriptors$Descriptor, String)>
	//   11   19:putfield        #41  <Field String fullName>
		file = filedescriptor;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #43  <Field Descriptors$FileDescriptor file>
		index = i;
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:putfield        #45  <Field int index>
		containingType = descriptor;
	//   18   33:aload_0         
	//   19   34:aload_3         
	//   20   35:putfield        #47  <Field Descriptors$Descriptor containingType>
		fieldCount = 0;
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:putfield        #49  <Field int fieldCount>
	//   24   43:return          
	}

	Descriptors$OneofDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor, Descriptors.Descriptor descriptor, int i, Descriptors._cls1 _pcls1)
		throws tionException
	{
		this(ptorproto, filedescriptor, descriptor, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #54  <Method void Descriptors$OneofDescriptor(DescriptorProtos$OneofDescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int)>
	//    6    9:return          
	}
}
