// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.*;

// Referenced classes of package com.google.protobuf:
//			Descriptors, Message

public static final class Descriptors$ServiceDescriptor extends Descriptors$GenericDescriptor
{

	private void crossLink()
		throws onException
	{
		Descriptors.MethodDescriptor amethoddescriptor[] = methods;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Descriptors$MethodDescriptor[] methods>
	//    2    4:astore_3        
		int j = amethoddescriptor.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          28
			Descriptors.MethodDescriptor.access$2900(amethoddescriptor[i]);
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokestatic    #89  <Method void Descriptors$MethodDescriptor.access$2900(Descriptors$MethodDescriptor)>

	//   15   21:iload_1         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_1        
	//*  19   25:goto            10
	//   20   28:return          
	}

	private void setProto(ptorProto ptorproto)
	{
		proto = ptorproto;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field DescriptorProtos$ServiceDescriptorProto proto>
		for(int i = 0; i < methods.length; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #50  <Field Descriptors$MethodDescriptor[] methods>
	//*   8   12:arraylength     
	//*   9   13:icmpge          37
			Descriptors.MethodDescriptor.access$3000(methods[i], ptorproto.getMethod(i));
	//   10   16:aload_0         
	//   11   17:getfield        #50  <Field Descriptors$MethodDescriptor[] methods>
	//   12   20:iload_2         
	//   13   21:aaload          
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:invokevirtual   #54  <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$ServiceDescriptorProto.getMethod(int)>
	//   17   27:invokestatic    #93  <Method void Descriptors$MethodDescriptor.access$3000(Descriptors$MethodDescriptor, DescriptorProtos$MethodDescriptorProto)>

	//   18   30:iload_2         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_2        
	//*  22   34:goto            7
	//   23   37:return          
	}

	public Descriptors.MethodDescriptor findMethodByName(String s)
	{
		s = ((String) (Descriptors.FileDescriptor.access$1400(file).findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Descriptors$FileDescriptor file>
	//    2    4:invokestatic    #63  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//    3    7:new             #97  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #98  <Method void StringBuilder()>
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field String fullName>
	//    8   18:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:bipush          46
	//   10   23:invokevirtual   #105 <Method StringBuilder StringBuilder.append(char)>
	//   11   26:aload_1         
	//   12   27:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   14   33:invokevirtual   #112 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.findSymbol(String)>
	//   15   36:astore_1        
		if(s != null && (s instanceof Descriptors.MethodDescriptor))
	//*  16   37:aload_1         
	//*  17   38:ifnull          53
	//*  18   41:aload_1         
	//*  19   42:instanceof      #48  <Class Descriptors$MethodDescriptor>
	//*  20   45:ifeq            53
			return (Descriptors.MethodDescriptor)s;
	//   21   48:aload_1         
	//   22   49:checkcast       #48  <Class Descriptors$MethodDescriptor>
	//   23   52:areturn         
		else
			return null;
	//   24   53:aconst_null     
	//   25   54:areturn         
	}

	public Descriptors.FileDescriptor getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Descriptors$FileDescriptor file>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String fullName>
	//    2    4:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int index>
	//    2    4:ireturn         
	}

	public List getMethods()
	{
		return Collections.unmodifiableList(Arrays.asList(((Object []) (methods))));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Descriptors$MethodDescriptor[] methods>
	//    2    4:invokestatic    #124 <Method List Arrays.asList(Object[])>
	//    3    7:invokestatic    #130 <Method List Collections.unmodifiableList(List)>
	//    4   10:areturn         
	}

	public String getName()
	{
		return proto.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field DescriptorProtos$ServiceDescriptorProto proto>
	//    2    4:invokevirtual   #34  <Method String DescriptorProtos$ServiceDescriptorProto.getName()>
	//    3    7:areturn         
	}

	public s getOptions()
	{
		return proto.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field DescriptorProtos$ServiceDescriptorProto proto>
	//    2    4:invokevirtual   #136 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceDescriptorProto.getOptions()>
	//    3    7:areturn         
	}

	public ptorProto toProto()
	{
		return proto;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field DescriptorProtos$ServiceDescriptorProto proto>
	//    2    4:areturn         
	}

	public volatile Message toProto()
	{
		return ((Message) (toProto()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method DescriptorProtos$ServiceDescriptorProto toProto()>
	//    2    4:areturn         
	}

	private final Descriptors.FileDescriptor file;
	private final String fullName;
	private final int index;
	private Descriptors.MethodDescriptor methods[];
	private ptorProto proto;


/*
	static void access$1200(Descriptors$ServiceDescriptor descriptors$servicedescriptor, ptorProto ptorproto)
	{
		descriptors$servicedescriptor.setProto(ptorproto);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void setProto(DescriptorProtos$ServiceDescriptorProto)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$800(Descriptors$ServiceDescriptor descriptors$servicedescriptor)
		throws onException
	{
		descriptors$servicedescriptor.crossLink();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void crossLink()>
		return;
	//    2    4:return          
	}

*/

	private Descriptors$ServiceDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor, int i)
		throws onException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Descriptors$GenericDescriptor()>
		index = i;
	//    2    4:aload_0         
	//    3    5:iload_3         
	//    4    6:putfield        #26  <Field int index>
		proto = ptorproto;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #28  <Field DescriptorProtos$ServiceDescriptorProto proto>
		fullName = Descriptors.access$1600(filedescriptor, ((Descriptors.Descriptor) (null)), ptorproto.getName());
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:aconst_null     
	//   11   17:aload_1         
	//   12   18:invokevirtual   #34  <Method String DescriptorProtos$ServiceDescriptorProto.getName()>
	//   13   21:invokestatic    #38  <Method String Descriptors.access$1600(Descriptors$FileDescriptor, Descriptors$Descriptor, String)>
	//   14   24:putfield        #40  <Field String fullName>
		file = filedescriptor;
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:putfield        #42  <Field Descriptors$FileDescriptor file>
		methods = new Descriptors.MethodDescriptor[ptorproto.getMethodCount()];
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #46  <Method int DescriptorProtos$ServiceDescriptorProto.getMethodCount()>
	//   21   37:anewarray       Descriptors.MethodDescriptor[]
	//   22   40:putfield        #50  <Field Descriptors$MethodDescriptor[] methods>
		for(i = 0; i < ptorproto.getMethodCount(); i++)
	//*  23   43:iconst_0        
	//*  24   44:istore_3        
	//*  25   45:iload_3         
	//*  26   46:aload_1         
	//*  27   47:invokevirtual   #46  <Method int DescriptorProtos$ServiceDescriptorProto.getMethodCount()>
	//*  28   50:icmpge          82
			methods[i] = new Descriptors.MethodDescriptor(ptorproto.getMethod(i), filedescriptor, this, i, ((Descriptors._cls1) (null)));
	//   29   53:aload_0         
	//   30   54:getfield        #50  <Field Descriptors$MethodDescriptor[] methods>
	//   31   57:iload_3         
	//   32   58:new             #48  <Class Descriptors$MethodDescriptor>
	//   33   61:dup             
	//   34   62:aload_1         
	//   35   63:iload_3         
	//   36   64:invokevirtual   #54  <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$ServiceDescriptorProto.getMethod(int)>
	//   37   67:aload_2         
	//   38   68:aload_0         
	//   39   69:iload_3         
	//   40   70:aconst_null     
	//   41   71:invokespecial   #57  <Method void Descriptors$MethodDescriptor(DescriptorProtos$MethodDescriptorProto, Descriptors$FileDescriptor, Descriptors$ServiceDescriptor, int, Descriptors$1)>
	//   42   74:aastore         

	//   43   75:iload_3         
	//   44   76:iconst_1        
	//   45   77:iadd            
	//   46   78:istore_3        
	//*  47   79:goto            45
		Descriptors.FileDescriptor.access$1400(filedescriptor).addSymbol(((Descriptors$GenericDescriptor) (this)));
	//   48   82:aload_2         
	//   49   83:invokestatic    #63  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//   50   86:aload_0         
	//   51   87:invokevirtual   #69  <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
	//   52   90:return          
	}

	Descriptors$ServiceDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor, int i, Descriptors._cls1 _pcls1)
		throws onException
	{
		this(ptorproto, filedescriptor, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #74  <Method void Descriptors$ServiceDescriptor(DescriptorProtos$ServiceDescriptorProto, Descriptors$FileDescriptor, int)>
	//    5    7:return          
	}
}
