// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors, Message

public static final class Descriptors$EnumValueDescriptor extends Descriptors.GenericDescriptor
	implements Internal.EnumLite
{

	private void setProto(ptorProto ptorproto)
	{
		proto = ptorproto;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
	//    3    5:return          
	}

	public Descriptors.FileDescriptor getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Descriptors$FileDescriptor file>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String fullName>
	//    2    4:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int index>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return proto.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
	//    2    4:invokevirtual   #57  <Method String DescriptorProtos$EnumValueDescriptorProto.getName()>
	//    3    7:areturn         
	}

	public int getNumber()
	{
		return proto.getNumber();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
	//    2    4:invokevirtual   #133 <Method int DescriptorProtos$EnumValueDescriptorProto.getNumber()>
	//    3    7:ireturn         
	}

	public s getOptions()
	{
		return proto.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
	//    2    4:invokevirtual   #137 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueDescriptorProto.getOptions()>
	//    3    7:areturn         
	}

	public Descriptors.EnumDescriptor getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Descriptors$EnumDescriptor type>
	//    2    4:areturn         
	}

	public ptorProto toProto()
	{
		return proto;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
	//    2    4:areturn         
	}

	public volatile Message toProto()
	{
		return ((Message) (toProto()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method DescriptorProtos$EnumValueDescriptorProto toProto()>
	//    2    4:areturn         
	}

	public String toString()
	{
		return proto.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
	//    2    4:invokevirtual   #57  <Method String DescriptorProtos$EnumValueDescriptorProto.getName()>
	//    3    7:areturn         
	}

	private final Descriptors.FileDescriptor file;
	private final String fullName;
	private final int index;
	private Integer number;
	private ptorProto proto;
	private final Descriptors.EnumDescriptor type;


/*
	static void access$2700(Descriptors$EnumValueDescriptor descriptors$enumvaluedescriptor, ptorProto ptorproto)
	{
		descriptors$enumvaluedescriptor.setProto(ptorproto);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #127 <Method void setProto(DescriptorProtos$EnumValueDescriptorProto)>
		return;
	//    3    5:return          
	}

*/

	private Descriptors$EnumValueDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor, Descriptors.EnumDescriptor enumdescriptor, int i)
		throws Exception
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Descriptors$GenericDescriptor()>
		index = i;
	//    2    4:aload_0         
	//    3    5:iload           4
	//    4    7:putfield        #30  <Field int index>
		proto = ptorproto;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
		file = filedescriptor;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #34  <Field Descriptors$FileDescriptor file>
		type = enumdescriptor;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #36  <Field Descriptors$EnumDescriptor type>
		fullName = (new StringBuilder()).append(enumdescriptor.getFullName()).append('.').append(ptorproto.getName()).toString();
	//   14   25:aload_0         
	//   15   26:new             #38  <Class StringBuilder>
	//   16   29:dup             
	//   17   30:invokespecial   #39  <Method void StringBuilder()>
	//   18   33:aload_3         
	//   19   34:invokevirtual   #45  <Method String Descriptors$EnumDescriptor.getFullName()>
	//   20   37:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:bipush          46
	//   22   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   23   45:aload_1         
	//   24   46:invokevirtual   #57  <Method String DescriptorProtos$EnumValueDescriptorProto.getName()>
	//   25   49:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   27   55:putfield        #62  <Field String fullName>
		Descriptors.FileDescriptor.access$1400(filedescriptor).addSymbol(((Descriptors.GenericDescriptor) (this)));
	//   28   58:aload_2         
	//   29   59:invokestatic    #68  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//   30   62:aload_0         
	//   31   63:invokevirtual   #74  <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
		Descriptors.FileDescriptor.access$1400(filedescriptor).addEnumValueByNumber(this);
	//   32   66:aload_2         
	//   33   67:invokestatic    #68  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//   34   70:aload_0         
	//   35   71:invokevirtual   #78  <Method void Descriptors$DescriptorPool.addEnumValueByNumber(Descriptors$EnumValueDescriptor)>
	//   36   74:return          
	}

	Descriptors$EnumValueDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor, Descriptors.EnumDescriptor enumdescriptor, int i, Descriptors._cls1 _pcls1)
		throws Exception
	{
		this(ptorproto, filedescriptor, enumdescriptor, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #83  <Method void Descriptors$EnumValueDescriptor(DescriptorProtos$EnumValueDescriptorProto, Descriptors$FileDescriptor, Descriptors$EnumDescriptor, int)>
	//    6    9:return          
	}

	private Descriptors$EnumValueDescriptor(Descriptors.FileDescriptor filedescriptor, Descriptors.EnumDescriptor enumdescriptor, Integer integer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Descriptors$GenericDescriptor()>
		Object obj = ((Object) ((new StringBuilder()).append("UNKNOWN_ENUM_VALUE_").append(enumdescriptor.getName()).append("_").append(((Object) (integer))).toString()));
	//    2    4:new             #38  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #39  <Method void StringBuilder()>
	//    5   11:ldc1            #86  <String "UNKNOWN_ENUM_VALUE_">
	//    6   13:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_2         
	//    8   17:invokevirtual   #87  <Method String Descriptors$EnumDescriptor.getName()>
	//    9   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc1            #89  <String "_">
	//   11   25:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:aload_3         
	//   13   29:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
	//   14   32:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   15   35:astore          4
		obj = ((Object) (ptorProto.newBuilder().setName(((String) (obj))).setNumber(integer.intValue()).build()));
	//   16   37:invokestatic    #96  <Method DescriptorProtos$EnumValueDescriptorProto$Builder DescriptorProtos$EnumValueDescriptorProto.newBuilder()>
	//   17   40:aload           4
	//   18   42:invokevirtual   #102 <Method DescriptorProtos$EnumValueDescriptorProto$Builder DescriptorProtos$EnumValueDescriptorProto$Builder.setName(String)>
	//   19   45:aload_3         
	//   20   46:invokevirtual   #108 <Method int Integer.intValue()>
	//   21   49:invokevirtual   #112 <Method DescriptorProtos$EnumValueDescriptorProto$Builder DescriptorProtos$EnumValueDescriptorProto$Builder.setNumber(int)>
	//   22   52:invokevirtual   #116 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto$Builder.build()>
	//   23   55:astore          4
		index = -1;
	//   24   57:aload_0         
	//   25   58:iconst_m1       
	//   26   59:putfield        #30  <Field int index>
		proto = ((ptorProto) (obj));
	//   27   62:aload_0         
	//   28   63:aload           4
	//   29   65:putfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
		file = filedescriptor;
	//   30   68:aload_0         
	//   31   69:aload_1         
	//   32   70:putfield        #34  <Field Descriptors$FileDescriptor file>
		type = enumdescriptor;
	//   33   73:aload_0         
	//   34   74:aload_2         
	//   35   75:putfield        #36  <Field Descriptors$EnumDescriptor type>
		fullName = (new StringBuilder()).append(enumdescriptor.getFullName()).append('.').append(((ptorProto) (obj)).getName()).toString();
	//   36   78:aload_0         
	//   37   79:new             #38  <Class StringBuilder>
	//   38   82:dup             
	//   39   83:invokespecial   #39  <Method void StringBuilder()>
	//   40   86:aload_2         
	//   41   87:invokevirtual   #45  <Method String Descriptors$EnumDescriptor.getFullName()>
	//   42   90:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   43   93:bipush          46
	//   44   95:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   45   98:aload           4
	//   46  100:invokevirtual   #57  <Method String DescriptorProtos$EnumValueDescriptorProto.getName()>
	//   47  103:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   48  106:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   49  109:putfield        #62  <Field String fullName>
		number = integer;
	//   50  112:aload_0         
	//   51  113:aload_3         
	//   52  114:putfield        #118 <Field Integer number>
	//   53  117:return          
	}

	Descriptors$EnumValueDescriptor(Descriptors.FileDescriptor filedescriptor, Descriptors.EnumDescriptor enumdescriptor, Integer integer, Descriptors._cls1 _pcls1)
	{
		this(filedescriptor, enumdescriptor, integer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #121 <Method void Descriptors$EnumValueDescriptor(Descriptors$FileDescriptor, Descriptors$EnumDescriptor, Integer)>
	//    5    7:return          
	}
}
