// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.*;

// Referenced classes of package com.google.protobuf:
//			Descriptors, Internal, ProtocolStringList, Message

public static final class Descriptors$Descriptor extends riptor
{

	private void crossLink()
		throws alidationException
	{
		Object aobj[] = ((Object []) (nestedTypes));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Descriptors$Descriptor[] nestedTypes>
	//    2    4:astore_3        
		int l = aobj.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < l; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          28
			aobj[i].crossLink();
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokespecial   #217 <Method void crossLink()>

	//   15   21:iload_1         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_1        
	//*  19   25:goto            10
		aobj = ((Object []) (fields));
	//   20   28:aload_0         
	//   21   29:getfield        #100 <Field Descriptors$FieldDescriptor[] fields>
	//   22   32:astore_3        
		l = aobj.length;
	//   23   33:aload_3         
	//   24   34:arraylength     
	//   25   35:istore_2        
		for(int j = 0; j < l; j++)
	//*  26   36:iconst_0        
	//*  27   37:istore_1        
	//*  28   38:iload_1         
	//*  29   39:iload_2         
	//*  30   40:icmpge          56
			ptor.access._mth900(aobj[j]);
	//   31   43:aload_3         
	//   32   44:iload_1         
	//   33   45:aaload          
	//   34   46:invokestatic    #221 <Method void Descriptors$FieldDescriptor.access$900(Descriptors$FieldDescriptor)>

	//   35   49:iload_1         
	//   36   50:iconst_1        
	//   37   51:iadd            
	//   38   52:istore_1        
	//*  39   53:goto            38
		aobj = ((Object []) (extensions));
	//   40   56:aload_0         
	//   41   57:getfield        #112 <Field Descriptors$FieldDescriptor[] extensions>
	//   42   60:astore_3        
		l = aobj.length;
	//   43   61:aload_3         
	//   44   62:arraylength     
	//   45   63:istore_2        
		for(int k = 0; k < l; k++)
	//*  46   64:iconst_0        
	//*  47   65:istore_1        
	//*  48   66:iload_1         
	//*  49   67:iload_2         
	//*  50   68:icmpge          84
			ptor.access._mth900(aobj[k]);
	//   51   71:aload_3         
	//   52   72:iload_1         
	//   53   73:aaload          
	//   54   74:invokestatic    #221 <Method void Descriptors$FieldDescriptor.access$900(Descriptors$FieldDescriptor)>

	//   55   77:iload_1         
	//   56   78:iconst_1        
	//   57   79:iadd            
	//   58   80:istore_1        
	//*  59   81:goto            66
	//   60   84:return          
	}

	private void setProto(ptorProto ptorproto)
	{
		proto = ptorproto;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field DescriptorProtos$DescriptorProto proto>
		for(int i = 0; i < nestedTypes.length; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #73  <Field Descriptors$Descriptor[] nestedTypes>
	//*   8   12:arraylength     
	//*   9   13:icmpge          37
			nestedTypes[i].setProto(ptorproto.getNestedType(i));
	//   10   16:aload_0         
	//   11   17:getfield        #73  <Field Descriptors$Descriptor[] nestedTypes>
	//   12   20:iload_2         
	//   13   21:aaload          
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:invokevirtual   #77  <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getNestedType(int)>
	//   17   27:invokespecial   #212 <Method void setProto(DescriptorProtos$DescriptorProto)>

	//   18   30:iload_2         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_2        
	//*  22   34:goto            7
		for(int j = 0; j < oneofs.length; j++)
	//*  23   37:iconst_0        
	//*  24   38:istore_2        
	//*  25   39:iload_2         
	//*  26   40:aload_0         
	//*  27   41:getfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
	//*  28   44:arraylength     
	//*  29   45:icmpge          69
			ptor.access._mth2000(oneofs[j], ptorproto.getOneofDecl(j));
	//   30   48:aload_0         
	//   31   49:getfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
	//   32   52:iload_2         
	//   33   53:aaload          
	//   34   54:aload_1         
	//   35   55:iload_2         
	//   36   56:invokevirtual   #65  <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$DescriptorProto.getOneofDecl(int)>
	//   37   59:invokestatic    #225 <Method void Descriptors$OneofDescriptor.access$2000(Descriptors$OneofDescriptor, DescriptorProtos$OneofDescriptorProto)>

	//   38   62:iload_2         
	//   39   63:iconst_1        
	//   40   64:iadd            
	//   41   65:istore_2        
	//*  42   66:goto            39
		for(int k = 0; k < enumTypes.length; k++)
	//*  43   69:iconst_0        
	//*  44   70:istore_2        
	//*  45   71:iload_2         
	//*  46   72:aload_0         
	//*  47   73:getfield        #86  <Field Descriptors$EnumDescriptor[] enumTypes>
	//*  48   76:arraylength     
	//*  49   77:icmpge          101
			tor.access._mth1100(enumTypes[k], ptorproto.getEnumType(k));
	//   50   80:aload_0         
	//   51   81:getfield        #86  <Field Descriptors$EnumDescriptor[] enumTypes>
	//   52   84:iload_2         
	//   53   85:aaload          
	//   54   86:aload_1         
	//   55   87:iload_2         
	//   56   88:invokevirtual   #90  <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$DescriptorProto.getEnumType(int)>
	//   57   91:invokestatic    #229 <Method void Descriptors$EnumDescriptor.access$1100(Descriptors$EnumDescriptor, DescriptorProtos$EnumDescriptorProto)>

	//   58   94:iload_2         
	//   59   95:iconst_1        
	//   60   96:iadd            
	//   61   97:istore_2        
	//*  62   98:goto            71
		for(int l = 0; l < fields.length; l++)
	//*  63  101:iconst_0        
	//*  64  102:istore_2        
	//*  65  103:iload_2         
	//*  66  104:aload_0         
	//*  67  105:getfield        #100 <Field Descriptors$FieldDescriptor[] fields>
	//*  68  108:arraylength     
	//*  69  109:icmpge          133
			ptor.access._mth1300(fields[l], ptorproto.getField(l));
	//   70  112:aload_0         
	//   71  113:getfield        #100 <Field Descriptors$FieldDescriptor[] fields>
	//   72  116:iload_2         
	//   73  117:aaload          
	//   74  118:aload_1         
	//   75  119:iload_2         
	//   76  120:invokevirtual   #104 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$DescriptorProto.getField(int)>
	//   77  123:invokestatic    #233 <Method void Descriptors$FieldDescriptor.access$1300(Descriptors$FieldDescriptor, DescriptorProtos$FieldDescriptorProto)>

	//   78  126:iload_2         
	//   79  127:iconst_1        
	//   80  128:iadd            
	//   81  129:istore_2        
	//*  82  130:goto            103
		for(int i1 = 0; i1 < extensions.length; i1++)
	//*  83  133:iconst_0        
	//*  84  134:istore_2        
	//*  85  135:iload_2         
	//*  86  136:aload_0         
	//*  87  137:getfield        #112 <Field Descriptors$FieldDescriptor[] extensions>
	//*  88  140:arraylength     
	//*  89  141:icmpge          165
			ptor.access._mth1300(extensions[i1], ptorproto.getExtension(i1));
	//   90  144:aload_0         
	//   91  145:getfield        #112 <Field Descriptors$FieldDescriptor[] extensions>
	//   92  148:iload_2         
	//   93  149:aaload          
	//   94  150:aload_1         
	//   95  151:iload_2         
	//   96  152:invokevirtual   #115 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$DescriptorProto.getExtension(int)>
	//   97  155:invokestatic    #233 <Method void Descriptors$FieldDescriptor.access$1300(Descriptors$FieldDescriptor, DescriptorProtos$FieldDescriptorProto)>

	//   98  158:iload_2         
	//   99  159:iconst_1        
	//  100  160:iadd            
	//  101  161:istore_2        
	//* 102  162:goto            135
	//  103  165:return          
	}

	public tor findEnumTypeByName(String s)
	{
		s = ((String) (tor.access._mth1400(file).findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Descriptors$FileDescriptor file>
	//    2    4:invokestatic    #142 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//    3    7:new             #237 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #238 <Method void StringBuilder()>
	//    6   14:aload_0         
	//    7   15:getfield        #49  <Field String fullName>
	//    8   18:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:bipush          46
	//   10   23:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
	//   11   26:aload_1         
	//   12   27:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #248 <Method String StringBuilder.toString()>
	//   14   33:invokevirtual   #252 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.findSymbol(String)>
	//   15   36:astore_1        
		if(s != null && (s instanceof tor))
	//*  16   37:aload_1         
	//*  17   38:ifnull          53
	//*  18   41:aload_1         
	//*  19   42:instanceof      #84  <Class Descriptors$EnumDescriptor>
	//*  20   45:ifeq            53
			return (tor)s;
	//   21   48:aload_1         
	//   22   49:checkcast       #84  <Class Descriptors$EnumDescriptor>
	//   23   52:areturn         
		else
			return null;
	//   24   53:aconst_null     
	//   25   54:areturn         
	}

	public ptor findFieldByName(String s)
	{
		s = ((String) (tor.access._mth1400(file).findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Descriptors$FileDescriptor file>
	//    2    4:invokestatic    #142 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//    3    7:new             #237 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #238 <Method void StringBuilder()>
	//    6   14:aload_0         
	//    7   15:getfield        #49  <Field String fullName>
	//    8   18:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:bipush          46
	//   10   23:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
	//   11   26:aload_1         
	//   12   27:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #248 <Method String StringBuilder.toString()>
	//   14   33:invokevirtual   #252 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.findSymbol(String)>
	//   15   36:astore_1        
		if(s != null && (s instanceof ptor))
	//*  16   37:aload_1         
	//*  17   38:ifnull          53
	//*  18   41:aload_1         
	//*  19   42:instanceof      #98  <Class Descriptors$FieldDescriptor>
	//*  20   45:ifeq            53
			return (ptor)s;
	//   21   48:aload_1         
	//   22   49:checkcast       #98  <Class Descriptors$FieldDescriptor>
	//   23   52:areturn         
		else
			return null;
	//   24   53:aconst_null     
	//   25   54:areturn         
	}

	public ptor findFieldByNumber(int i)
	{
		return (ptor)ool.access._mth1500(tor.access._mth1400(file)).get(((Object) (new ool.DescriptorIntPair(((riptor) (this)), i))));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Descriptors$FileDescriptor file>
	//    2    4:invokestatic    #142 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//    3    7:invokestatic    #260 <Method Map Descriptors$DescriptorPool.access$1500(Descriptors$DescriptorPool)>
	//    4   10:new             #262 <Class Descriptors$DescriptorPool$DescriptorIntPair>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #265 <Method void Descriptors$DescriptorPool$DescriptorIntPair(Descriptors$GenericDescriptor, int)>
	//    9   19:invokeinterface #271 <Method Object Map.get(Object)>
	//   10   24:checkcast       #98  <Class Descriptors$FieldDescriptor>
	//   11   27:areturn         
	}

	public Descriptors$Descriptor findNestedTypeByName(String s)
	{
		s = ((String) (tor.access._mth1400(file).findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Descriptors$FileDescriptor file>
	//    2    4:invokestatic    #142 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//    3    7:new             #237 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #238 <Method void StringBuilder()>
	//    6   14:aload_0         
	//    7   15:getfield        #49  <Field String fullName>
	//    8   18:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:bipush          46
	//   10   23:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
	//   11   26:aload_1         
	//   12   27:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #248 <Method String StringBuilder.toString()>
	//   14   33:invokevirtual   #252 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.findSymbol(String)>
	//   15   36:astore_1        
		if(s != null && (s instanceof Descriptors$Descriptor))
	//*  16   37:aload_1         
	//*  17   38:ifnull          53
	//*  18   41:aload_1         
	//*  19   42:instanceof      #2   <Class Descriptors$Descriptor>
	//*  20   45:ifeq            53
			return (Descriptors$Descriptor)s;
	//   21   48:aload_1         
	//   22   49:checkcast       #2   <Class Descriptors$Descriptor>
	//   23   52:areturn         
		else
			return null;
	//   24   53:aconst_null     
	//   25   54:areturn         
	}

	public Descriptors$Descriptor getContainingType()
	{
		return containingType;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Descriptors$Descriptor containingType>
	//    2    4:areturn         
	}

	public List getEnumTypes()
	{
		return Collections.unmodifiableList(Arrays.asList(((Object []) (enumTypes))));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Descriptors$EnumDescriptor[] enumTypes>
	//    2    4:invokestatic    #283 <Method List Arrays.asList(Object[])>
	//    3    7:invokestatic    #289 <Method List Collections.unmodifiableList(List)>
	//    4   10:areturn         
	}

	public List getExtensions()
	{
		return Collections.unmodifiableList(Arrays.asList(((Object []) (extensions))));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Descriptors$FieldDescriptor[] extensions>
	//    2    4:invokestatic    #283 <Method List Arrays.asList(Object[])>
	//    3    7:invokestatic    #289 <Method List Collections.unmodifiableList(List)>
	//    4   10:areturn         
	}

	public List getFields()
	{
		return Collections.unmodifiableList(Arrays.asList(((Object []) (fields))));
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Descriptors$FieldDescriptor[] fields>
	//    2    4:invokestatic    #283 <Method List Arrays.asList(Object[])>
	//    3    7:invokestatic    #289 <Method List Collections.unmodifiableList(List)>
	//    4   10:areturn         
	}

	public tor getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Descriptors$FileDescriptor file>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String fullName>
	//    2    4:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int index>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return proto.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field DescriptorProtos$DescriptorProto proto>
	//    2    4:invokevirtual   #43  <Method String DescriptorProtos$DescriptorProto.getName()>
	//    3    7:areturn         
	}

	public List getNestedTypes()
	{
		return Collections.unmodifiableList(Arrays.asList(((Object []) (nestedTypes))));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Descriptors$Descriptor[] nestedTypes>
	//    2    4:invokestatic    #283 <Method List Arrays.asList(Object[])>
	//    3    7:invokestatic    #289 <Method List Collections.unmodifiableList(List)>
	//    4   10:areturn         
	}

	public List getOneofs()
	{
		return Collections.unmodifiableList(Arrays.asList(((Object []) (oneofs))));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
	//    2    4:invokestatic    #283 <Method List Arrays.asList(Object[])>
	//    3    7:invokestatic    #289 <Method List Collections.unmodifiableList(List)>
	//    4   10:areturn         
	}

	public eOptions getOptions()
	{
		return proto.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field DescriptorProtos$DescriptorProto proto>
	//    2    4:invokevirtual   #306 <Method DescriptorProtos$MessageOptions DescriptorProtos$DescriptorProto.getOptions()>
	//    3    7:areturn         
	}

	public boolean isExtendable()
	{
		return proto.getExtensionRangeList().size() != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field DescriptorProtos$DescriptorProto proto>
	//    2    4:invokevirtual   #311 <Method List DescriptorProtos$DescriptorProto.getExtensionRangeList()>
	//    3    7:invokeinterface #316 <Method int List.size()>
	//    4   12:ifeq            17
	//    5   15:iconst_1        
	//    6   16:ireturn         
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public boolean isExtensionNumber(int i)
	{
		for(Iterator iterator = proto.getExtensionRangeList().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field DescriptorProtos$DescriptorProto proto>
	//*   2    4:invokevirtual   #311 <Method List DescriptorProtos$DescriptorProto.getExtensionRangeList()>
	//*   3    7:invokeinterface #322 <Method Iterator List.iterator()>
	//*   4   12:astore_2        
	//*   5   13:aload_2         
	//*   6   14:invokeinterface #327 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            53
		{
			ptorProto.ExtensionRange extensionrange = (ptorProto.ExtensionRange)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #331 <Method Object Iterator.next()>
	//   10   28:checkcast       #179 <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//   11   31:astore_3        
			if(extensionrange.getStart() <= i && i < extensionrange.getEnd())
	//*  12   32:aload_3         
	//*  13   33:invokevirtual   #334 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.getStart()>
	//*  14   36:iload_1         
	//*  15   37:icmpgt          50
	//*  16   40:iload_1         
	//*  17   41:aload_3         
	//*  18   42:invokevirtual   #337 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.getEnd()>
	//*  19   45:icmpge          50
				return true;
	//   20   48:iconst_1        
	//   21   49:ireturn         
		}

	//*  22   50:goto            13
		return false;
	//   23   53:iconst_0        
	//   24   54:ireturn         
	}

	public boolean isReservedName(String s)
	{
		Internal.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #344 <Method Object Internal.checkNotNull(Object)>
	//    2    4:pop             
		for(Iterator iterator = proto.getReservedNameList().iterator(); iterator.hasNext();)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field DescriptorProtos$DescriptorProto proto>
	//*   5    9:invokevirtual   #348 <Method ProtocolStringList DescriptorProtos$DescriptorProto.getReservedNameList()>
	//*   6   12:invokeinterface #351 <Method Iterator ProtocolStringList.iterator()>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #327 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            48
			if(((String)iterator.next()).equals(((Object) (s))))
	//*  11   27:aload_2         
	//*  12   28:invokeinterface #331 <Method Object Iterator.next()>
	//*  13   33:checkcast       #156 <Class String>
	//*  14   36:aload_1         
	//*  15   37:invokevirtual   #355 <Method boolean String.equals(Object)>
	//*  16   40:ifeq            45
				return true;
	//   17   43:iconst_1        
	//   18   44:ireturn         

	//*  19   45:goto            18
		return false;
	//   20   48:iconst_0        
	//   21   49:ireturn         
	}

	public boolean isReservedNumber(int i)
	{
		for(Iterator iterator = proto.getReservedRangeList().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field DescriptorProtos$DescriptorProto proto>
	//*   2    4:invokevirtual   #359 <Method List DescriptorProtos$DescriptorProto.getReservedRangeList()>
	//*   3    7:invokeinterface #322 <Method Iterator List.iterator()>
	//*   4   12:astore_2        
	//*   5   13:aload_2         
	//*   6   14:invokeinterface #327 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            53
		{
			ptorProto.ReservedRange reservedrange = (ptorProto.ReservedRange)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #331 <Method Object Iterator.next()>
	//   10   28:checkcast       #361 <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//   11   31:astore_3        
			if(reservedrange.getStart() <= i && i < reservedrange.getEnd())
	//*  12   32:aload_3         
	//*  13   33:invokevirtual   #362 <Method int DescriptorProtos$DescriptorProto$ReservedRange.getStart()>
	//*  14   36:iload_1         
	//*  15   37:icmpgt          50
	//*  16   40:iload_1         
	//*  17   41:aload_3         
	//*  18   42:invokevirtual   #363 <Method int DescriptorProtos$DescriptorProto$ReservedRange.getEnd()>
	//*  19   45:icmpge          50
				return true;
	//   20   48:iconst_1        
	//   21   49:ireturn         
		}

	//*  22   50:goto            13
		return false;
	//   23   53:iconst_0        
	//   24   54:ireturn         
	}

	public ptorProto toProto()
	{
		return proto;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field DescriptorProtos$DescriptorProto proto>
	//    2    4:areturn         
	}

	public volatile Message toProto()
	{
		return ((Message) (toProto()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method DescriptorProtos$DescriptorProto toProto()>
	//    2    4:areturn         
	}

	private final Descriptors$Descriptor containingType;
	private final tor enumTypes[];
	private final ptor extensions[];
	private final ptor fields[];
	private final tor file;
	private final String fullName;
	private final int index;
	private final Descriptors$Descriptor nestedTypes[];
	private final ptor oneofs[];
	private ptorProto proto;


/*
	static void access$1000(Descriptors$Descriptor descriptors$descriptor, ptorProto ptorproto)
	{
		descriptors$descriptor.setProto(ptorproto);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #212 <Method void setProto(DescriptorProtos$DescriptorProto)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$700(Descriptors$Descriptor descriptors$descriptor)
		throws alidationException
	{
		descriptors$descriptor.crossLink();
	//    0    0:aload_0         
	//    1    1:invokespecial   #217 <Method void crossLink()>
		return;
	//    2    4:return          
	}

*/

	private Descriptors$Descriptor(ptorProto ptorproto, tor tor, Descriptors$Descriptor descriptors$descriptor, int i)
		throws alidationException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Descriptors$GenericDescriptor()>
		index = i;
	//    2    4:aload_0         
	//    3    5:iload           4
	//    4    7:putfield        #35  <Field int index>
		proto = ptorproto;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #37  <Field DescriptorProtos$DescriptorProto proto>
		fullName = Descriptors.access$1600(tor, descriptors$descriptor, ptorproto.getName());
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:aload_3         
	//   11   18:aload_1         
	//   12   19:invokevirtual   #43  <Method String DescriptorProtos$DescriptorProto.getName()>
	//   13   22:invokestatic    #47  <Method String Descriptors.access$1600(Descriptors$FileDescriptor, Descriptors$Descriptor, String)>
	//   14   25:putfield        #49  <Field String fullName>
		file = tor;
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:putfield        #51  <Field Descriptors$FileDescriptor file>
		containingType = descriptors$descriptor;
	//   18   33:aload_0         
	//   19   34:aload_3         
	//   20   35:putfield        #53  <Field Descriptors$Descriptor containingType>
		oneofs = new ptor[ptorproto.getOneofDeclCount()];
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #57  <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
	//   24   43:anewarray       ptor[]
	//   25   46:putfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
		for(i = 0; i < ptorproto.getOneofDeclCount(); i++)
	//*  26   49:iconst_0        
	//*  27   50:istore          4
	//*  28   52:iload           4
	//*  29   54:aload_1         
	//*  30   55:invokevirtual   #57  <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
	//*  31   58:icmpge          95
			oneofs[i] = new ptor(ptorproto.getOneofDecl(i), tor, this, i, ((Descriptors._cls1) (null)));
	//   32   61:aload_0         
	//   33   62:getfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
	//   34   65:iload           4
	//   35   67:new             #59  <Class Descriptors$OneofDescriptor>
	//   36   70:dup             
	//   37   71:aload_1         
	//   38   72:iload           4
	//   39   74:invokevirtual   #65  <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$DescriptorProto.getOneofDecl(int)>
	//   40   77:aload_2         
	//   41   78:aload_0         
	//   42   79:iload           4
	//   43   81:aconst_null     
	//   44   82:invokespecial   #68  <Method void Descriptors$OneofDescriptor(DescriptorProtos$OneofDescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int, Descriptors$1)>
	//   45   85:aastore         

	//   46   86:iload           4
	//   47   88:iconst_1        
	//   48   89:iadd            
	//   49   90:istore          4
	//*  50   92:goto            52
		nestedTypes = new Descriptors$Descriptor[ptorproto.getNestedTypeCount()];
	//   51   95:aload_0         
	//   52   96:aload_1         
	//   53   97:invokevirtual   #71  <Method int DescriptorProtos$DescriptorProto.getNestedTypeCount()>
	//   54  100:anewarray       Descriptors$Descriptor[]
	//   55  103:putfield        #73  <Field Descriptors$Descriptor[] nestedTypes>
		for(i = 0; i < ptorproto.getNestedTypeCount(); i++)
	//*  56  106:iconst_0        
	//*  57  107:istore          4
	//*  58  109:iload           4
	//*  59  111:aload_1         
	//*  60  112:invokevirtual   #71  <Method int DescriptorProtos$DescriptorProto.getNestedTypeCount()>
	//*  61  115:icmpge          151
			nestedTypes[i] = new Descriptors$Descriptor(ptorproto.getNestedType(i), tor, this, i);
	//   62  118:aload_0         
	//   63  119:getfield        #73  <Field Descriptors$Descriptor[] nestedTypes>
	//   64  122:iload           4
	//   65  124:new             #2   <Class Descriptors$Descriptor>
	//   66  127:dup             
	//   67  128:aload_1         
	//   68  129:iload           4
	//   69  131:invokevirtual   #77  <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getNestedType(int)>
	//   70  134:aload_2         
	//   71  135:aload_0         
	//   72  136:iload           4
	//   73  138:invokespecial   #79  <Method void Descriptors$Descriptor(DescriptorProtos$DescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int)>
	//   74  141:aastore         

	//   75  142:iload           4
	//   76  144:iconst_1        
	//   77  145:iadd            
	//   78  146:istore          4
	//*  79  148:goto            109
		enumTypes = new tor[ptorproto.getEnumTypeCount()];
	//   80  151:aload_0         
	//   81  152:aload_1         
	//   82  153:invokevirtual   #82  <Method int DescriptorProtos$DescriptorProto.getEnumTypeCount()>
	//   83  156:anewarray       tor[]
	//   84  159:putfield        #86  <Field Descriptors$EnumDescriptor[] enumTypes>
		for(i = 0; i < ptorproto.getEnumTypeCount(); i++)
	//*  85  162:iconst_0        
	//*  86  163:istore          4
	//*  87  165:iload           4
	//*  88  167:aload_1         
	//*  89  168:invokevirtual   #82  <Method int DescriptorProtos$DescriptorProto.getEnumTypeCount()>
	//*  90  171:icmpge          208
			enumTypes[i] = new tor(ptorproto.getEnumType(i), tor, this, i, ((Descriptors._cls1) (null)));
	//   91  174:aload_0         
	//   92  175:getfield        #86  <Field Descriptors$EnumDescriptor[] enumTypes>
	//   93  178:iload           4
	//   94  180:new             #84  <Class Descriptors$EnumDescriptor>
	//   95  183:dup             
	//   96  184:aload_1         
	//   97  185:iload           4
	//   98  187:invokevirtual   #90  <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$DescriptorProto.getEnumType(int)>
	//   99  190:aload_2         
	//  100  191:aload_0         
	//  101  192:iload           4
	//  102  194:aconst_null     
	//  103  195:invokespecial   #93  <Method void Descriptors$EnumDescriptor(DescriptorProtos$EnumDescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int, Descriptors$1)>
	//  104  198:aastore         

	//  105  199:iload           4
	//  106  201:iconst_1        
	//  107  202:iadd            
	//  108  203:istore          4
	//* 109  205:goto            165
		fields = new ptor[ptorproto.getFieldCount()];
	//  110  208:aload_0         
	//  111  209:aload_1         
	//  112  210:invokevirtual   #96  <Method int DescriptorProtos$DescriptorProto.getFieldCount()>
	//  113  213:anewarray       ptor[]
	//  114  216:putfield        #100 <Field Descriptors$FieldDescriptor[] fields>
		for(i = 0; i < ptorproto.getFieldCount(); i++)
	//* 115  219:iconst_0        
	//* 116  220:istore          4
	//* 117  222:iload           4
	//* 118  224:aload_1         
	//* 119  225:invokevirtual   #96  <Method int DescriptorProtos$DescriptorProto.getFieldCount()>
	//* 120  228:icmpge          266
			fields[i] = new ptor(ptorproto.getField(i), tor, this, i, false, ((Descriptors._cls1) (null)));
	//  121  231:aload_0         
	//  122  232:getfield        #100 <Field Descriptors$FieldDescriptor[] fields>
	//  123  235:iload           4
	//  124  237:new             #98  <Class Descriptors$FieldDescriptor>
	//  125  240:dup             
	//  126  241:aload_1         
	//  127  242:iload           4
	//  128  244:invokevirtual   #104 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$DescriptorProto.getField(int)>
	//  129  247:aload_2         
	//  130  248:aload_0         
	//  131  249:iload           4
	//  132  251:iconst_0        
	//  133  252:aconst_null     
	//  134  253:invokespecial   #107 <Method void Descriptors$FieldDescriptor(DescriptorProtos$FieldDescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int, boolean, Descriptors$1)>
	//  135  256:aastore         

	//  136  257:iload           4
	//  137  259:iconst_1        
	//  138  260:iadd            
	//  139  261:istore          4
	//* 140  263:goto            222
		extensions = new ptor[ptorproto.getExtensionCount()];
	//  141  266:aload_0         
	//  142  267:aload_1         
	//  143  268:invokevirtual   #110 <Method int DescriptorProtos$DescriptorProto.getExtensionCount()>
	//  144  271:anewarray       ptor[]
	//  145  274:putfield        #112 <Field Descriptors$FieldDescriptor[] extensions>
		for(i = 0; i < ptorproto.getExtensionCount(); i++)
	//* 146  277:iconst_0        
	//* 147  278:istore          4
	//* 148  280:iload           4
	//* 149  282:aload_1         
	//* 150  283:invokevirtual   #110 <Method int DescriptorProtos$DescriptorProto.getExtensionCount()>
	//* 151  286:icmpge          324
			extensions[i] = new ptor(ptorproto.getExtension(i), tor, this, i, true, ((Descriptors._cls1) (null)));
	//  152  289:aload_0         
	//  153  290:getfield        #112 <Field Descriptors$FieldDescriptor[] extensions>
	//  154  293:iload           4
	//  155  295:new             #98  <Class Descriptors$FieldDescriptor>
	//  156  298:dup             
	//  157  299:aload_1         
	//  158  300:iload           4
	//  159  302:invokevirtual   #115 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$DescriptorProto.getExtension(int)>
	//  160  305:aload_2         
	//  161  306:aload_0         
	//  162  307:iload           4
	//  163  309:iconst_1        
	//  164  310:aconst_null     
	//  165  311:invokespecial   #107 <Method void Descriptors$FieldDescriptor(DescriptorProtos$FieldDescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int, boolean, Descriptors$1)>
	//  166  314:aastore         

	//  167  315:iload           4
	//  168  317:iconst_1        
	//  169  318:iadd            
	//  170  319:istore          4
	//* 171  321:goto            280
		for(i = 0; i < ptorproto.getOneofDeclCount(); i++)
	//* 172  324:iconst_0        
	//* 173  325:istore          4
	//* 174  327:iload           4
	//* 175  329:aload_1         
	//* 176  330:invokevirtual   #57  <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
	//* 177  333:icmpge          381
		{
			ptor.access._mth1802(oneofs[i], new ptor[oneofs[i].getFieldCount()]);
	//  178  336:aload_0         
	//  179  337:getfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
	//  180  340:iload           4
	//  181  342:aaload          
	//  182  343:aload_0         
	//  183  344:getfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
	//  184  347:iload           4
	//  185  349:aaload          
	//  186  350:invokevirtual   #116 <Method int Descriptors$OneofDescriptor.getFieldCount()>
	//  187  353:anewarray       ptor[]
	//  188  356:invokestatic    #120 <Method Descriptors$FieldDescriptor[] Descriptors$OneofDescriptor.access$1802(Descriptors$OneofDescriptor, Descriptors$FieldDescriptor[])>
	//  189  359:pop             
			ptor.access._mth1902(oneofs[i], 0);
	//  190  360:aload_0         
	//  191  361:getfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
	//  192  364:iload           4
	//  193  366:aaload          
	//  194  367:iconst_0        
	//  195  368:invokestatic    #124 <Method int Descriptors$OneofDescriptor.access$1902(Descriptors$OneofDescriptor, int)>
	//  196  371:pop             
		}

	//  197  372:iload           4
	//  198  374:iconst_1        
	//  199  375:iadd            
	//  200  376:istore          4
	//* 201  378:goto            327
		for(i = 0; i < ptorproto.getFieldCount(); i++)
	//* 202  381:iconst_0        
	//* 203  382:istore          4
	//* 204  384:iload           4
	//* 205  386:aload_1         
	//* 206  387:invokevirtual   #96  <Method int DescriptorProtos$DescriptorProto.getFieldCount()>
	//* 207  390:icmpge          433
		{
			descriptors$descriptor = ((Descriptors$Descriptor) (fields[i].getContainingOneof()));
	//  208  393:aload_0         
	//  209  394:getfield        #100 <Field Descriptors$FieldDescriptor[] fields>
	//  210  397:iload           4
	//  211  399:aaload          
	//  212  400:invokevirtual   #128 <Method Descriptors$OneofDescriptor Descriptors$FieldDescriptor.getContainingOneof()>
	//  213  403:astore_3        
			if(descriptors$descriptor != null)
	//* 214  404:aload_3         
	//* 215  405:ifnull          424
				ptor.access._mth1800(((ptor) (descriptors$descriptor)))[ptor.access._mth1908(((ptor) (descriptors$descriptor)))] = fields[i];
	//  216  408:aload_3         
	//  217  409:invokestatic    #132 <Method Descriptors$FieldDescriptor[] Descriptors$OneofDescriptor.access$1800(Descriptors$OneofDescriptor)>
	//  218  412:aload_3         
	//  219  413:invokestatic    #136 <Method int Descriptors$OneofDescriptor.access$1908(Descriptors$OneofDescriptor)>
	//  220  416:aload_0         
	//  221  417:getfield        #100 <Field Descriptors$FieldDescriptor[] fields>
	//  222  420:iload           4
	//  223  422:aaload          
	//  224  423:aastore         
		}

	//  225  424:iload           4
	//  226  426:iconst_1        
	//  227  427:iadd            
	//  228  428:istore          4
	//* 229  430:goto            384
		tor.access._mth1400(tor).addSymbol(((riptor) (this)));
	//  230  433:aload_2         
	//  231  434:invokestatic    #142 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//  232  437:aload_0         
	//  233  438:invokevirtual   #148 <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
	//  234  441:return          
	}

	Descriptors$Descriptor(ptorProto ptorproto, tor tor, Descriptors$Descriptor descriptors$descriptor, int i, Descriptors._cls1 _pcls1)
		throws alidationException
	{
		this(ptorproto, tor, descriptors$descriptor, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #79  <Method void Descriptors$Descriptor(DescriptorProtos$DescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int)>
	//    6    9:return          
	}

	Descriptors$Descriptor(String s)
		throws alidationException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Descriptors$GenericDescriptor()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore_3        
		String s2 = "";
	//    4    6:ldc1            #154 <String "">
	//    5    8:astore          4
		int i = s.lastIndexOf('.');
	//    6   10:aload_1         
	//    7   11:bipush          46
	//    8   13:invokevirtual   #160 <Method int String.lastIndexOf(int)>
	//    9   16:istore_2        
		if(i != -1)
	//*  10   17:iload_2         
	//*  11   18:iconst_m1       
	//*  12   19:icmpeq          38
		{
			s1 = s.substring(i + 1);
	//   13   22:aload_1         
	//   14   23:iload_2         
	//   15   24:iconst_1        
	//   16   25:iadd            
	//   17   26:invokevirtual   #164 <Method String String.substring(int)>
	//   18   29:astore_3        
			s2 = s.substring(0, i);
	//   19   30:aload_1         
	//   20   31:iconst_0        
	//   21   32:iload_2         
	//   22   33:invokevirtual   #167 <Method String String.substring(int, int)>
	//   23   36:astore          4
		}
		index = 0;
	//   24   38:aload_0         
	//   25   39:iconst_0        
	//   26   40:putfield        #35  <Field int index>
		proto = ptorProto.newBuilder().setName(s1).addExtensionRange(ptorProto.ExtensionRange.newBuilder().setStart(1).setEnd(0x20000000).build()).build();
	//   27   43:aload_0         
	//   28   44:invokestatic    #171 <Method DescriptorProtos$DescriptorProto$Builder DescriptorProtos$DescriptorProto.newBuilder()>
	//   29   47:aload_3         
	//   30   48:invokevirtual   #177 <Method DescriptorProtos$DescriptorProto$Builder DescriptorProtos$DescriptorProto$Builder.setName(String)>
	//   31   51:invokestatic    #182 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder DescriptorProtos$DescriptorProto$ExtensionRange.newBuilder()>
	//   32   54:iconst_1        
	//   33   55:invokevirtual   #188 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder DescriptorProtos$DescriptorProto$ExtensionRange$Builder.setStart(int)>
	//   34   58:ldc1            #189 <Int 0x20000000>
	//   35   60:invokevirtual   #192 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder DescriptorProtos$DescriptorProto$ExtensionRange$Builder.setEnd(int)>
	//   36   63:invokevirtual   #196 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange$Builder.build()>
	//   37   66:invokevirtual   #200 <Method DescriptorProtos$DescriptorProto$Builder DescriptorProtos$DescriptorProto$Builder.addExtensionRange(DescriptorProtos$DescriptorProto$ExtensionRange)>
	//   38   69:invokevirtual   #203 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto$Builder.build()>
	//   39   72:putfield        #37  <Field DescriptorProtos$DescriptorProto proto>
		fullName = s;
	//   40   75:aload_0         
	//   41   76:aload_1         
	//   42   77:putfield        #49  <Field String fullName>
		containingType = null;
	//   43   80:aload_0         
	//   44   81:aconst_null     
	//   45   82:putfield        #53  <Field Descriptors$Descriptor containingType>
		nestedTypes = new Descriptors$Descriptor[0];
	//   46   85:aload_0         
	//   47   86:iconst_0        
	//   48   87:anewarray       Descriptors$Descriptor[]
	//   49   90:putfield        #73  <Field Descriptors$Descriptor[] nestedTypes>
		enumTypes = new tor[0];
	//   50   93:aload_0         
	//   51   94:iconst_0        
	//   52   95:anewarray       tor[]
	//   53   98:putfield        #86  <Field Descriptors$EnumDescriptor[] enumTypes>
		fields = new ptor[0];
	//   54  101:aload_0         
	//   55  102:iconst_0        
	//   56  103:anewarray       ptor[]
	//   57  106:putfield        #100 <Field Descriptors$FieldDescriptor[] fields>
		extensions = new ptor[0];
	//   58  109:aload_0         
	//   59  110:iconst_0        
	//   60  111:anewarray       ptor[]
	//   61  114:putfield        #112 <Field Descriptors$FieldDescriptor[] extensions>
		oneofs = new ptor[0];
	//   62  117:aload_0         
	//   63  118:iconst_0        
	//   64  119:anewarray       ptor[]
	//   65  122:putfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
		file = new tor(s2, this);
	//   66  125:aload_0         
	//   67  126:new             #138 <Class Descriptors$FileDescriptor>
	//   68  129:dup             
	//   69  130:aload           4
	//   70  132:aload_0         
	//   71  133:invokespecial   #206 <Method void Descriptors$FileDescriptor(String, Descriptors$Descriptor)>
	//   72  136:putfield        #51  <Field Descriptors$FileDescriptor file>
	//   73  139:return          
	}
}
