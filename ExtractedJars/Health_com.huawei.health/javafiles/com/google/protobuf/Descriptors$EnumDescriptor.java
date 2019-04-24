// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			Descriptors, Message

public static final class Descriptors$EnumDescriptor extends or
	implements Internal.EnumLiteMap
{

	private void setProto(ptorProto ptorproto)
	{
		proto = ptorproto;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field DescriptorProtos$EnumDescriptorProto proto>
		for(int i = 0; i < values.length; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #70  <Field Descriptors$EnumValueDescriptor[] values>
	//*   8   12:arraylength     
	//*   9   13:icmpge          37
			ptor.access._mth2700(values[i], ptorproto.getValue(i));
	//   10   16:aload_0         
	//   11   17:getfield        #70  <Field Descriptors$EnumValueDescriptor[] values>
	//   12   20:iload_2         
	//   13   21:aaload          
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:invokevirtual   #74  <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumDescriptorProto.getValue(int)>
	//   17   27:invokestatic    #104 <Method void Descriptors$EnumValueDescriptor.access$2700(Descriptors$EnumValueDescriptor, DescriptorProtos$EnumValueDescriptorProto)>

	//   18   30:iload_2         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_2        
	//*  22   34:goto            7
	//   23   37:return          
	}

	public ptor findValueByName(String s)
	{
		s = ((String) (Descriptors$FileDescriptor.access$1400(file).findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Descriptors$FileDescriptor file>
	//    2    4:invokestatic    #83  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//    3    7:new             #108 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #109 <Method void StringBuilder()>
	//    6   14:aload_0         
	//    7   15:getfield        #53  <Field String fullName>
	//    8   18:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:bipush          46
	//   10   23:invokevirtual   #116 <Method StringBuilder StringBuilder.append(char)>
	//   11   26:aload_1         
	//   12   27:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   14   33:invokevirtual   #123 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.findSymbol(String)>
	//   15   36:astore_1        
		if(s != null && (s instanceof ptor))
	//*  16   37:aload_1         
	//*  17   38:ifnull          53
	//*  18   41:aload_1         
	//*  19   42:instanceof      #68  <Class Descriptors$EnumValueDescriptor>
	//*  20   45:ifeq            53
			return (ptor)s;
	//   21   48:aload_1         
	//   22   49:checkcast       #68  <Class Descriptors$EnumValueDescriptor>
	//   23   52:areturn         
		else
			return null;
	//   24   53:aconst_null     
	//   25   54:areturn         
	}

	public ptor findValueByNumber(int i)
	{
		return (ptor)Descriptors$DescriptorPool.access$2400(Descriptors$FileDescriptor.access$1400(file)).get(((Object) (new DescriptorIntPair(((or) (this)), i))));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Descriptors$FileDescriptor file>
	//    2    4:invokestatic    #83  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//    3    7:invokestatic    #129 <Method Map Descriptors$DescriptorPool.access$2400(Descriptors$DescriptorPool)>
	//    4   10:new             #131 <Class Descriptors$DescriptorPool$DescriptorIntPair>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #134 <Method void Descriptors$DescriptorPool$DescriptorIntPair(Descriptors$GenericDescriptor, int)>
	//    9   19:invokeinterface #140 <Method Object Map.get(Object)>
	//   10   24:checkcast       #68  <Class Descriptors$EnumValueDescriptor>
	//   11   27:areturn         
	}

	public volatile Internal.EnumLite findValueByNumber(int i)
	{
		return ((Internal.EnumLite) (findValueByNumber(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #143 <Method Descriptors$EnumValueDescriptor findValueByNumber(int)>
	//    3    5:areturn         
	}

	public ptor findValueByNumberCreatingIfUnknown(int i)
	{
		ptor ptor;
		ptor = findValueByNumber(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #143 <Method Descriptors$EnumValueDescriptor findValueByNumber(int)>
	//    3    5:astore_2        
		if(ptor != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          12
			return ptor;
	//    6   10:aload_2         
	//    7   11:areturn         
		this;
	//    8   12:aload_0         
		JVM INSTR monitorenter ;
	//    9   13:monitorenter    
		Object obj;
		Integer integer;
		integer = new Integer(i);
	//   10   14:new             #146 <Class Integer>
	//   11   17:dup             
	//   12   18:iload_1         
	//   13   19:invokespecial   #149 <Method void Integer(int)>
	//   14   22:astore          4
		obj = ((Object) ((WeakReference)unknownValues.get(((Object) (integer)))));
	//   15   24:aload_0         
	//   16   25:getfield        #37  <Field WeakHashMap unknownValues>
	//   17   28:aload           4
	//   18   30:invokevirtual   #150 <Method Object WeakHashMap.get(Object)>
	//   19   33:checkcast       #152 <Class WeakReference>
	//   20   36:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_49;
	//   21   37:aload_3         
	//   22   38:ifnull          49
		ptor = (ptor)((WeakReference) (obj)).get();
	//   23   41:aload_3         
	//   24   42:invokevirtual   #155 <Method Object WeakReference.get()>
	//   25   45:checkcast       #68  <Class Descriptors$EnumValueDescriptor>
	//   26   48:astore_2        
		obj = ((Object) (ptor));
	//   27   49:aload_2         
	//   28   50:astore_3        
		if(ptor != null)
			break MISSING_BLOCK_LABEL_89;
	//   29   51:aload_2         
	//   30   52:ifnonnull       89
		obj = ((Object) (new ptor(file, this, integer, ((Descriptors._cls1) (null)))));
	//   31   55:new             #68  <Class Descriptors$EnumValueDescriptor>
	//   32   58:dup             
	//   33   59:aload_0         
	//   34   60:getfield        #55  <Field Descriptors$FileDescriptor file>
	//   35   63:aload_0         
	//   36   64:aload           4
	//   37   66:aconst_null     
	//   38   67:invokespecial   #158 <Method void Descriptors$EnumValueDescriptor(Descriptors$FileDescriptor, Descriptors$EnumDescriptor, Integer, Descriptors$1)>
	//   39   70:astore_3        
		unknownValues.put(((Object) (integer)), ((Object) (new WeakReference(obj))));
	//   40   71:aload_0         
	//   41   72:getfield        #37  <Field WeakHashMap unknownValues>
	//   42   75:aload           4
	//   43   77:new             #152 <Class WeakReference>
	//   44   80:dup             
	//   45   81:aload_3         
	//   46   82:invokespecial   #161 <Method void WeakReference(Object)>
	//   47   85:invokevirtual   #165 <Method Object WeakHashMap.put(Object, Object)>
	//   48   88:pop             
		this;
	//   49   89:aload_0         
		JVM INSTR monitorexit ;
	//   50   90:monitorexit     
		return ((ptor) (obj));
	//   51   91:aload_3         
	//   52   92:areturn         
		Exception exception;
		exception;
	//   53   93:astore_2        
	//*  54   94:aload_0         
		throw exception;
	//   55   95:monitorexit     
	//   56   96:aload_2         
	//   57   97:athrow          
	}

	public Descriptors.Descriptor getContainingType()
	{
		return containingType;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Descriptors$Descriptor containingType>
	//    2    4:areturn         
	}

	public Descriptors$FileDescriptor getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Descriptors$FileDescriptor file>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String fullName>
	//    2    4:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int index>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return proto.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DescriptorProtos$EnumDescriptorProto proto>
	//    2    4:invokevirtual   #47  <Method String DescriptorProtos$EnumDescriptorProto.getName()>
	//    3    7:areturn         
	}

	public s getOptions()
	{
		return proto.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DescriptorProtos$EnumDescriptorProto proto>
	//    2    4:invokevirtual   #175 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumDescriptorProto.getOptions()>
	//    3    7:areturn         
	}

	int getUnknownEnumValueDescriptorCount()
	{
		return unknownValues.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakHashMap unknownValues>
	//    2    4:invokevirtual   #179 <Method int WeakHashMap.size()>
	//    3    7:ireturn         
	}

	public List getValues()
	{
		return Collections.unmodifiableList(Arrays.asList(((Object []) (values))));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Descriptors$EnumValueDescriptor[] values>
	//    2    4:invokestatic    #187 <Method List Arrays.asList(Object[])>
	//    3    7:invokestatic    #193 <Method List Collections.unmodifiableList(List)>
	//    4   10:areturn         
	}

	public ptorProto toProto()
	{
		return proto;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DescriptorProtos$EnumDescriptorProto proto>
	//    2    4:areturn         
	}

	public volatile Message toProto()
	{
		return ((Message) (toProto()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method DescriptorProtos$EnumDescriptorProto toProto()>
	//    2    4:areturn         
	}

	private final Descriptors.Descriptor containingType;
	private final Descriptors$FileDescriptor file;
	private final String fullName;
	private final int index;
	private ptorProto proto;
	private final WeakHashMap unknownValues;
	private ptor values[];


/*
	static void access$1100(Descriptors$EnumDescriptor descriptors$enumdescriptor, ptorProto ptorproto)
	{
		descriptors$enumdescriptor.setProto(ptorproto);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void setProto(DescriptorProtos$EnumDescriptorProto)>
		return;
	//    3    5:return          
	}

*/

	private Descriptors$EnumDescriptor(ptorProto ptorproto, Descriptors$FileDescriptor descriptors$filedescriptor, Descriptors.Descriptor descriptor, int i)
		throws ationException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Descriptors$GenericDescriptor()>
		unknownValues = new WeakHashMap();
	//    2    4:aload_0         
	//    3    5:new             #34  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void WeakHashMap()>
	//    6   12:putfield        #37  <Field WeakHashMap unknownValues>
		index = i;
	//    7   15:aload_0         
	//    8   16:iload           4
	//    9   18:putfield        #39  <Field int index>
		proto = ptorproto;
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:putfield        #41  <Field DescriptorProtos$EnumDescriptorProto proto>
		fullName = Descriptors.access$1600(descriptors$filedescriptor, descriptor, ptorproto.getName());
	//   13   26:aload_0         
	//   14   27:aload_2         
	//   15   28:aload_3         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #47  <Method String DescriptorProtos$EnumDescriptorProto.getName()>
	//   18   33:invokestatic    #51  <Method String Descriptors.access$1600(Descriptors$FileDescriptor, Descriptors$Descriptor, String)>
	//   19   36:putfield        #53  <Field String fullName>
		file = descriptors$filedescriptor;
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #55  <Field Descriptors$FileDescriptor file>
		containingType = descriptor;
	//   23   44:aload_0         
	//   24   45:aload_3         
	//   25   46:putfield        #57  <Field Descriptors$Descriptor containingType>
		if(ptorproto.getValueCount() == 0)
	//*  26   49:aload_1         
	//*  27   50:invokevirtual   #61  <Method int DescriptorProtos$EnumDescriptorProto.getValueCount()>
	//*  28   53:ifne            68
			throw new ationException(((or) (this)), "Enums must contain at least one value.", ((Descriptors._cls1) (null)));
	//   29   56:new             #29  <Class Descriptors$DescriptorValidationException>
	//   30   59:dup             
	//   31   60:aload_0         
	//   32   61:ldc1            #63  <String "Enums must contain at least one value.">
	//   33   63:aconst_null     
	//   34   64:invokespecial   #66  <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//   35   67:athrow          
		values = new ptor[ptorproto.getValueCount()];
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:invokevirtual   #61  <Method int DescriptorProtos$EnumDescriptorProto.getValueCount()>
	//   39   73:anewarray       ptor[]
	//   40   76:putfield        #70  <Field Descriptors$EnumValueDescriptor[] values>
		for(i = 0; i < ptorproto.getValueCount(); i++)
	//*  41   79:iconst_0        
	//*  42   80:istore          4
	//*  43   82:iload           4
	//*  44   84:aload_1         
	//*  45   85:invokevirtual   #61  <Method int DescriptorProtos$EnumDescriptorProto.getValueCount()>
	//*  46   88:icmpge          125
			values[i] = new ptor(ptorproto.getValue(i), descriptors$filedescriptor, this, i, ((Descriptors._cls1) (null)));
	//   47   91:aload_0         
	//   48   92:getfield        #70  <Field Descriptors$EnumValueDescriptor[] values>
	//   49   95:iload           4
	//   50   97:new             #68  <Class Descriptors$EnumValueDescriptor>
	//   51  100:dup             
	//   52  101:aload_1         
	//   53  102:iload           4
	//   54  104:invokevirtual   #74  <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumDescriptorProto.getValue(int)>
	//   55  107:aload_2         
	//   56  108:aload_0         
	//   57  109:iload           4
	//   58  111:aconst_null     
	//   59  112:invokespecial   #77  <Method void Descriptors$EnumValueDescriptor(DescriptorProtos$EnumValueDescriptorProto, Descriptors$FileDescriptor, Descriptors$EnumDescriptor, int, Descriptors$1)>
	//   60  115:aastore         

	//   61  116:iload           4
	//   62  118:iconst_1        
	//   63  119:iadd            
	//   64  120:istore          4
	//*  65  122:goto            82
		Descriptors$FileDescriptor.access$1400(descriptors$filedescriptor).addSymbol(((or) (this)));
	//   66  125:aload_2         
	//   67  126:invokestatic    #83  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//   68  129:aload_0         
	//   69  130:invokevirtual   #89  <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
	//   70  133:return          
	}

	Descriptors$EnumDescriptor(ptorProto ptorproto, Descriptors$FileDescriptor descriptors$filedescriptor, Descriptors.Descriptor descriptor, int i, Descriptors._cls1 _pcls1)
		throws ationException
	{
		this(ptorproto, descriptors$filedescriptor, descriptor, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #94  <Method void Descriptors$EnumDescriptor(DescriptorProtos$EnumDescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int)>
	//    6    9:return          
	}
}
