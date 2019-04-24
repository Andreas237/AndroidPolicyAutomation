// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors, Message

public static final class Descriptors$MethodDescriptor extends 
{

	private void crossLink()
		throws ionException
	{
		  = Descriptors.FileDescriptor.access$1400(file).lookupSymbol(proto.getInputType(), (() (this)), archFilter.TYPES_ONLY);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Descriptors$FileDescriptor file>
	//    2    4:invokestatic    #67  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
	//    5   11:invokevirtual   #92  <Method String DescriptorProtos$MethodDescriptorProto.getInputType()>
	//    6   14:aload_0         
	//    7   15:getstatic       #98  <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.TYPES_ONLY>
	//    8   18:invokevirtual   #102 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.lookupSymbol(String, Descriptors$GenericDescriptor, Descriptors$DescriptorPool$SearchFilter)>
	//    9   21:astore_1        
		if(!( instanceof Descriptors.Descriptor))
	//*  10   22:aload_1         
	//*  11   23:instanceof      #104 <Class Descriptors$Descriptor>
	//*  12   26:ifne            69
			throw new ionException((() (this)), (new StringBuilder()).append('"').append(proto.getInputType()).append("\" is not a message type.").toString(), ((Descriptors._cls1) (null)));
	//   13   29:new             #24  <Class Descriptors$DescriptorValidationException>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:new             #37  <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #38  <Method void StringBuilder()>
	//   19   41:bipush          34
	//   20   43:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   21   46:aload_0         
	//   22   47:getfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
	//   23   50:invokevirtual   #92  <Method String DescriptorProtos$MethodDescriptorProto.getInputType()>
	//   24   53:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:ldc1            #106 <String "\" is not a message type.">
	//   26   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   27   61:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   28   64:aconst_null     
	//   29   65:invokespecial   #109 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//   30   68:athrow          
		inputType = (Descriptors.Descriptor);
	//   31   69:aload_0         
	//   32   70:aload_1         
	//   33   71:checkcast       #104 <Class Descriptors$Descriptor>
	//   34   74:putfield        #111 <Field Descriptors$Descriptor inputType>
		 = Descriptors.FileDescriptor.access$1400(file).lookupSymbol(proto.getOutputType(), (() (this)), archFilter.TYPES_ONLY);
	//   35   77:aload_0         
	//   36   78:getfield        #33  <Field Descriptors$FileDescriptor file>
	//   37   81:invokestatic    #67  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//   38   84:aload_0         
	//   39   85:getfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
	//   40   88:invokevirtual   #114 <Method String DescriptorProtos$MethodDescriptorProto.getOutputType()>
	//   41   91:aload_0         
	//   42   92:getstatic       #98  <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.TYPES_ONLY>
	//   43   95:invokevirtual   #102 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.lookupSymbol(String, Descriptors$GenericDescriptor, Descriptors$DescriptorPool$SearchFilter)>
	//   44   98:astore_1        
		if(!( instanceof Descriptors.Descriptor))
	//*  45   99:aload_1         
	//*  46  100:instanceof      #104 <Class Descriptors$Descriptor>
	//*  47  103:ifne            146
		{
			throw new ionException((() (this)), (new StringBuilder()).append('"').append(proto.getOutputType()).append("\" is not a message type.").toString(), ((Descriptors._cls1) (null)));
	//   48  106:new             #24  <Class Descriptors$DescriptorValidationException>
	//   49  109:dup             
	//   50  110:aload_0         
	//   51  111:new             #37  <Class StringBuilder>
	//   52  114:dup             
	//   53  115:invokespecial   #38  <Method void StringBuilder()>
	//   54  118:bipush          34
	//   55  120:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   56  123:aload_0         
	//   57  124:getfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
	//   58  127:invokevirtual   #114 <Method String DescriptorProtos$MethodDescriptorProto.getOutputType()>
	//   59  130:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   60  133:ldc1            #106 <String "\" is not a message type.">
	//   61  135:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   62  138:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   63  141:aconst_null     
	//   64  142:invokespecial   #109 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//   65  145:athrow          
		} else
		{
			outputType = (Descriptors.Descriptor);
	//   66  146:aload_0         
	//   67  147:aload_1         
	//   68  148:checkcast       #104 <Class Descriptors$Descriptor>
	//   69  151:putfield        #116 <Field Descriptors$Descriptor outputType>
			return;
	//   70  154:return          
		}
	}

	private void setProto(ptorProto ptorproto)
	{
		proto = ptorproto;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
	//    3    5:return          
	}

	public Descriptors.FileDescriptor getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Descriptors$FileDescriptor file>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String fullName>
	//    2    4:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int index>
	//    2    4:ireturn         
	}

	public Descriptors.Descriptor getInputType()
	{
		return inputType;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Descriptors$Descriptor inputType>
	//    2    4:areturn         
	}

	public String getName()
	{
		return proto.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
	//    2    4:invokevirtual   #56  <Method String DescriptorProtos$MethodDescriptorProto.getName()>
	//    3    7:areturn         
	}

	public s getOptions()
	{
		return proto.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
	//    2    4:invokevirtual   #125 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodDescriptorProto.getOptions()>
	//    3    7:areturn         
	}

	public Descriptors.Descriptor getOutputType()
	{
		return outputType;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Descriptors$Descriptor outputType>
	//    2    4:areturn         
	}

	public  getService()
	{
		return service;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Descriptors$ServiceDescriptor service>
	//    2    4:areturn         
	}

	public ptorProto toProto()
	{
		return proto;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
	//    2    4:areturn         
	}

	public volatile Message toProto()
	{
		return ((Message) (toProto()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method DescriptorProtos$MethodDescriptorProto toProto()>
	//    2    4:areturn         
	}

	private final Descriptors.FileDescriptor file;
	private final String fullName;
	private final int index;
	private Descriptors.Descriptor inputType;
	private Descriptors.Descriptor outputType;
	private ptorProto proto;
	private final  service;


/*
	static void access$2900(Descriptors$MethodDescriptor descriptors$methoddescriptor)
		throws ionException
	{
		descriptors$methoddescriptor.crossLink();
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void crossLink()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$3000(Descriptors$MethodDescriptor descriptors$methoddescriptor, ptorProto ptorproto)
	{
		descriptors$methoddescriptor.setProto(ptorproto);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #89  <Method void setProto(DescriptorProtos$MethodDescriptorProto)>
		return;
	//    3    5:return          
	}

*/

	private Descriptors$MethodDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor,  , int i)
		throws ionException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Descriptors$GenericDescriptor()>
		index = i;
	//    2    4:aload_0         
	//    3    5:iload           4
	//    4    7:putfield        #29  <Field int index>
		proto = ptorproto;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
		file = filedescriptor;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #33  <Field Descriptors$FileDescriptor file>
		service = ;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #35  <Field Descriptors$ServiceDescriptor service>
		fullName = (new StringBuilder()).append(.getFullName()).append('.').append(ptorproto.getName()).toString();
	//   14   25:aload_0         
	//   15   26:new             #37  <Class StringBuilder>
	//   16   29:dup             
	//   17   30:invokespecial   #38  <Method void StringBuilder()>
	//   18   33:aload_3         
	//   19   34:invokevirtual   #44  <Method String Descriptors$ServiceDescriptor.getFullName()>
	//   20   37:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:bipush          46
	//   22   42:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   23   45:aload_1         
	//   24   46:invokevirtual   #56  <Method String DescriptorProtos$MethodDescriptorProto.getName()>
	//   25   49:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   27   55:putfield        #61  <Field String fullName>
		Descriptors.FileDescriptor.access$1400(filedescriptor).addSymbol((() (this)));
	//   28   58:aload_2         
	//   29   59:invokestatic    #67  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//   30   62:aload_0         
	//   31   63:invokevirtual   #73  <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
	//   32   66:return          
	}

	Descriptors$MethodDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor,  , int i, Descriptors._cls1 _pcls1)
		throws ionException
	{
		this(ptorproto, filedescriptor, , i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #78  <Method void Descriptors$MethodDescriptor(DescriptorProtos$MethodDescriptorProto, Descriptors$FileDescriptor, Descriptors$ServiceDescriptor, int)>
	//    6    9:return          
	}
}
