// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.Logger;

// Referenced classes of package com.google.protobuf:
//			Internal, ProtocolStringList, Message, InvalidProtocolBufferException, 
//			ExtensionRegistry, TextFormat, MessageLite, ByteString

public final class Descriptors
{
	public static final class Descriptor extends GenericDescriptor
	{

		private void crossLink()
			throws DescriptorValidationException
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
				aobj[j].crossLink();
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
				aobj[k].crossLink();
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

		private void setProto(DescriptorProtos.DescriptorProto descriptorproto)
		{
			proto = descriptorproto;
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
				nestedTypes[i].setProto(descriptorproto.getNestedType(i));
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
				oneofs[j].setProto(descriptorproto.getOneofDecl(j));
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
				enumTypes[k].setProto(descriptorproto.getEnumType(k));
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
				fields[l].setProto(descriptorproto.getField(l));
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
				extensions[i1].setProto(descriptorproto.getExtension(i1));
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

		public EnumDescriptor findEnumTypeByName(String s)
		{
			s = ((String) (file.pool.findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
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
			if(s != null && (s instanceof EnumDescriptor))
		//*  16   37:aload_1         
		//*  17   38:ifnull          53
		//*  18   41:aload_1         
		//*  19   42:instanceof      #84  <Class Descriptors$EnumDescriptor>
		//*  20   45:ifeq            53
				return (EnumDescriptor)s;
		//   21   48:aload_1         
		//   22   49:checkcast       #84  <Class Descriptors$EnumDescriptor>
		//   23   52:areturn         
			else
				return null;
		//   24   53:aconst_null     
		//   25   54:areturn         
		}

		public FieldDescriptor findFieldByName(String s)
		{
			s = ((String) (file.pool.findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
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
			if(s != null && (s instanceof FieldDescriptor))
		//*  16   37:aload_1         
		//*  17   38:ifnull          53
		//*  18   41:aload_1         
		//*  19   42:instanceof      #98  <Class Descriptors$FieldDescriptor>
		//*  20   45:ifeq            53
				return (FieldDescriptor)s;
		//   21   48:aload_1         
		//   22   49:checkcast       #98  <Class Descriptors$FieldDescriptor>
		//   23   52:areturn         
			else
				return null;
		//   24   53:aconst_null     
		//   25   54:areturn         
		}

		public FieldDescriptor findFieldByNumber(int i)
		{
			return (FieldDescriptor)file.pool.fieldsByNumber.get(((Object) (new DescriptorPool.DescriptorIntPair(((GenericDescriptor) (this)), i))));
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

		public Descriptor findNestedTypeByName(String s)
		{
			s = ((String) (file.pool.findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
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
			if(s != null && (s instanceof Descriptor))
		//*  16   37:aload_1         
		//*  17   38:ifnull          53
		//*  18   41:aload_1         
		//*  19   42:instanceof      #2   <Class Descriptors$Descriptor>
		//*  20   45:ifeq            53
				return (Descriptor)s;
		//   21   48:aload_1         
		//   22   49:checkcast       #2   <Class Descriptors$Descriptor>
		//   23   52:areturn         
			else
				return null;
		//   24   53:aconst_null     
		//   25   54:areturn         
		}

		public Descriptor getContainingType()
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

		public FileDescriptor getFile()
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

		public DescriptorProtos.MessageOptions getOptions()
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
				DescriptorProtos.DescriptorProto.ExtensionRange extensionrange = (DescriptorProtos.DescriptorProto.ExtensionRange)iterator.next();
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
				DescriptorProtos.DescriptorProto.ReservedRange reservedrange = (DescriptorProtos.DescriptorProto.ReservedRange)iterator.next();
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

		public DescriptorProtos.DescriptorProto toProto()
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

		private final Descriptor containingType;
		private final EnumDescriptor enumTypes[];
		private final FieldDescriptor extensions[];
		private final FieldDescriptor fields[];
		private final FileDescriptor file;
		private final String fullName;
		private final int index;
		private final Descriptor nestedTypes[];
		private final OneofDescriptor oneofs[];
		private DescriptorProtos.DescriptorProto proto;


/*
		static void access$1000(Descriptor descriptor, DescriptorProtos.DescriptorProto descriptorproto)
		{
			descriptor.setProto(descriptorproto);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #212 <Method void setProto(DescriptorProtos$DescriptorProto)>
			return;
		//    3    5:return          
		}

*/


/*
		static void access$700(Descriptor descriptor)
			throws DescriptorValidationException
		{
			descriptor.crossLink();
		//    0    0:aload_0         
		//    1    1:invokespecial   #217 <Method void crossLink()>
			return;
		//    2    4:return          
		}

*/

		private Descriptor(DescriptorProtos.DescriptorProto descriptorproto, FileDescriptor filedescriptor, Descriptor descriptor, int i)
			throws DescriptorValidationException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Descriptors$GenericDescriptor()>
			index = i;
		//    2    4:aload_0         
		//    3    5:iload           4
		//    4    7:putfield        #35  <Field int index>
			proto = descriptorproto;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #37  <Field DescriptorProtos$DescriptorProto proto>
			fullName = Descriptors.computeFullName(filedescriptor, descriptor, descriptorproto.getName());
		//    8   15:aload_0         
		//    9   16:aload_2         
		//   10   17:aload_3         
		//   11   18:aload_1         
		//   12   19:invokevirtual   #43  <Method String DescriptorProtos$DescriptorProto.getName()>
		//   13   22:invokestatic    #47  <Method String Descriptors.access$1600(Descriptors$FileDescriptor, Descriptors$Descriptor, String)>
		//   14   25:putfield        #49  <Field String fullName>
			file = filedescriptor;
		//   15   28:aload_0         
		//   16   29:aload_2         
		//   17   30:putfield        #51  <Field Descriptors$FileDescriptor file>
			containingType = descriptor;
		//   18   33:aload_0         
		//   19   34:aload_3         
		//   20   35:putfield        #53  <Field Descriptors$Descriptor containingType>
			oneofs = new OneofDescriptor[descriptorproto.getOneofDeclCount()];
		//   21   38:aload_0         
		//   22   39:aload_1         
		//   23   40:invokevirtual   #57  <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
		//   24   43:anewarray       OneofDescriptor[]
		//   25   46:putfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
			for(i = 0; i < descriptorproto.getOneofDeclCount(); i++)
		//*  26   49:iconst_0        
		//*  27   50:istore          4
		//*  28   52:iload           4
		//*  29   54:aload_1         
		//*  30   55:invokevirtual   #57  <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
		//*  31   58:icmpge          95
				oneofs[i] = new OneofDescriptor(descriptorproto.getOneofDecl(i), filedescriptor, this, i);
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
			nestedTypes = new Descriptor[descriptorproto.getNestedTypeCount()];
		//   51   95:aload_0         
		//   52   96:aload_1         
		//   53   97:invokevirtual   #71  <Method int DescriptorProtos$DescriptorProto.getNestedTypeCount()>
		//   54  100:anewarray       Descriptor[]
		//   55  103:putfield        #73  <Field Descriptors$Descriptor[] nestedTypes>
			for(i = 0; i < descriptorproto.getNestedTypeCount(); i++)
		//*  56  106:iconst_0        
		//*  57  107:istore          4
		//*  58  109:iload           4
		//*  59  111:aload_1         
		//*  60  112:invokevirtual   #71  <Method int DescriptorProtos$DescriptorProto.getNestedTypeCount()>
		//*  61  115:icmpge          151
				nestedTypes[i] = new Descriptor(descriptorproto.getNestedType(i), filedescriptor, this, i);
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
			enumTypes = new EnumDescriptor[descriptorproto.getEnumTypeCount()];
		//   80  151:aload_0         
		//   81  152:aload_1         
		//   82  153:invokevirtual   #82  <Method int DescriptorProtos$DescriptorProto.getEnumTypeCount()>
		//   83  156:anewarray       EnumDescriptor[]
		//   84  159:putfield        #86  <Field Descriptors$EnumDescriptor[] enumTypes>
			for(i = 0; i < descriptorproto.getEnumTypeCount(); i++)
		//*  85  162:iconst_0        
		//*  86  163:istore          4
		//*  87  165:iload           4
		//*  88  167:aload_1         
		//*  89  168:invokevirtual   #82  <Method int DescriptorProtos$DescriptorProto.getEnumTypeCount()>
		//*  90  171:icmpge          208
				enumTypes[i] = new EnumDescriptor(descriptorproto.getEnumType(i), filedescriptor, this, i);
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
			fields = new FieldDescriptor[descriptorproto.getFieldCount()];
		//  110  208:aload_0         
		//  111  209:aload_1         
		//  112  210:invokevirtual   #96  <Method int DescriptorProtos$DescriptorProto.getFieldCount()>
		//  113  213:anewarray       FieldDescriptor[]
		//  114  216:putfield        #100 <Field Descriptors$FieldDescriptor[] fields>
			for(i = 0; i < descriptorproto.getFieldCount(); i++)
		//* 115  219:iconst_0        
		//* 116  220:istore          4
		//* 117  222:iload           4
		//* 118  224:aload_1         
		//* 119  225:invokevirtual   #96  <Method int DescriptorProtos$DescriptorProto.getFieldCount()>
		//* 120  228:icmpge          266
				fields[i] = new FieldDescriptor(descriptorproto.getField(i), filedescriptor, this, i, false);
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
			extensions = new FieldDescriptor[descriptorproto.getExtensionCount()];
		//  141  266:aload_0         
		//  142  267:aload_1         
		//  143  268:invokevirtual   #110 <Method int DescriptorProtos$DescriptorProto.getExtensionCount()>
		//  144  271:anewarray       FieldDescriptor[]
		//  145  274:putfield        #112 <Field Descriptors$FieldDescriptor[] extensions>
			for(i = 0; i < descriptorproto.getExtensionCount(); i++)
		//* 146  277:iconst_0        
		//* 147  278:istore          4
		//* 148  280:iload           4
		//* 149  282:aload_1         
		//* 150  283:invokevirtual   #110 <Method int DescriptorProtos$DescriptorProto.getExtensionCount()>
		//* 151  286:icmpge          324
				extensions[i] = new FieldDescriptor(descriptorproto.getExtension(i), filedescriptor, this, i, true);
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
			for(i = 0; i < descriptorproto.getOneofDeclCount(); i++)
		//* 172  324:iconst_0        
		//* 173  325:istore          4
		//* 174  327:iload           4
		//* 175  329:aload_1         
		//* 176  330:invokevirtual   #57  <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
		//* 177  333:icmpge          381
			{
				oneofs[i].fields = new FieldDescriptor[oneofs[i].getFieldCount()];
		//  178  336:aload_0         
		//  179  337:getfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
		//  180  340:iload           4
		//  181  342:aaload          
		//  182  343:aload_0         
		//  183  344:getfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
		//  184  347:iload           4
		//  185  349:aaload          
		//  186  350:invokevirtual   #116 <Method int Descriptors$OneofDescriptor.getFieldCount()>
		//  187  353:anewarray       FieldDescriptor[]
		//  188  356:invokestatic    #120 <Method Descriptors$FieldDescriptor[] Descriptors$OneofDescriptor.access$1802(Descriptors$OneofDescriptor, Descriptors$FieldDescriptor[])>
		//  189  359:pop             
				oneofs[i].fieldCount = 0;
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
			for(i = 0; i < descriptorproto.getFieldCount(); i++)
		//* 202  381:iconst_0        
		//* 203  382:istore          4
		//* 204  384:iload           4
		//* 205  386:aload_1         
		//* 206  387:invokevirtual   #96  <Method int DescriptorProtos$DescriptorProto.getFieldCount()>
		//* 207  390:icmpge          433
			{
				descriptor = ((Descriptor) (fields[i].getContainingOneof()));
		//  208  393:aload_0         
		//  209  394:getfield        #100 <Field Descriptors$FieldDescriptor[] fields>
		//  210  397:iload           4
		//  211  399:aaload          
		//  212  400:invokevirtual   #128 <Method Descriptors$OneofDescriptor Descriptors$FieldDescriptor.getContainingOneof()>
		//  213  403:astore_3        
				if(descriptor != null)
		//* 214  404:aload_3         
		//* 215  405:ifnull          424
					((OneofDescriptor) (descriptor)).fields[int i = ((Descriptor) (this)).fullName] = fields[i];
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
			filedescriptor.pool.addSymbol(((GenericDescriptor) (this)));
		//  230  433:aload_2         
		//  231  434:invokestatic    #142 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//  232  437:aload_0         
		//  233  438:invokevirtual   #148 <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
		//  234  441:return          
		}


		Descriptor(String s)
			throws DescriptorValidationException
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
			proto = DescriptorProtos.DescriptorProto.newBuilder().setName(s1).addExtensionRange(DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder().setStart(1).setEnd(0x20000000).build()).build();
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
			nestedTypes = new Descriptor[0];
		//   46   85:aload_0         
		//   47   86:iconst_0        
		//   48   87:anewarray       Descriptor[]
		//   49   90:putfield        #73  <Field Descriptors$Descriptor[] nestedTypes>
			enumTypes = new EnumDescriptor[0];
		//   50   93:aload_0         
		//   51   94:iconst_0        
		//   52   95:anewarray       EnumDescriptor[]
		//   53   98:putfield        #86  <Field Descriptors$EnumDescriptor[] enumTypes>
			fields = new FieldDescriptor[0];
		//   54  101:aload_0         
		//   55  102:iconst_0        
		//   56  103:anewarray       FieldDescriptor[]
		//   57  106:putfield        #100 <Field Descriptors$FieldDescriptor[] fields>
			extensions = new FieldDescriptor[0];
		//   58  109:aload_0         
		//   59  110:iconst_0        
		//   60  111:anewarray       FieldDescriptor[]
		//   61  114:putfield        #112 <Field Descriptors$FieldDescriptor[] extensions>
			oneofs = new OneofDescriptor[0];
		//   62  117:aload_0         
		//   63  118:iconst_0        
		//   64  119:anewarray       OneofDescriptor[]
		//   65  122:putfield        #61  <Field Descriptors$OneofDescriptor[] oneofs>
			file = new FileDescriptor(s2, this);
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

	static final class DescriptorPool
	{

		private void importPublicDependencies(FileDescriptor filedescriptor)
		{
			filedescriptor = ((FileDescriptor) (filedescriptor.getPublicDependencies().iterator()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #98  <Method List Descriptors$FileDescriptor.getPublicDependencies()>
		//    2    4:invokeinterface #101 <Method Iterator List.iterator()>
		//    3    9:astore_1        
			do
			{
				if(!((Iterator) (filedescriptor)).hasNext())
					break;
		//    4   10:aload_1         
		//    5   11:invokeinterface #71  <Method boolean Iterator.hasNext()>
		//    6   16:ifeq            50
				FileDescriptor filedescriptor1 = (FileDescriptor)((Iterator) (filedescriptor)).next();
		//    7   19:aload_1         
		//    8   20:invokeinterface #75  <Method Object Iterator.next()>
		//    9   25:checkcast       #77  <Class Descriptors$FileDescriptor>
		//   10   28:astore_2        
				if(dependencies.add(((Object) (filedescriptor1))))
		//*  11   29:aload_0         
		//*  12   30:getfield        #49  <Field Set dependencies>
		//*  13   33:aload_2         
		//*  14   34:invokeinterface #57  <Method boolean Set.add(Object)>
		//*  15   39:ifeq            47
					importPublicDependencies(filedescriptor1);
		//   16   42:aload_0         
		//   17   43:aload_2         
		//   18   44:invokespecial   #61  <Method void importPublicDependencies(Descriptors$FileDescriptor)>
			} while(true);
		//   19   47:goto            10
		//   20   50:return          
		}

		static void validateSymbolName(GenericDescriptor genericdescriptor)
			throws DescriptorValidationException
		{
			String s = genericdescriptor.getName();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #108 <Method String Descriptors$GenericDescriptor.getName()>
		//    2    4:astore          5
			if(s.length() == 0)
		//*   3    6:aload           5
		//*   4    8:invokevirtual   #114 <Method int String.length()>
		//*   5   11:ifne            26
				throw new DescriptorValidationException(genericdescriptor, "Missing name.");
		//    6   14:new             #32  <Class Descriptors$DescriptorValidationException>
		//    7   17:dup             
		//    8   18:aload_0         
		//    9   19:ldc1            #116 <String "Missing name.">
		//   10   21:aconst_null     
		//   11   22:invokespecial   #119 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   12   25:athrow          
			boolean flag = true;
		//   13   26:iconst_1        
		//   14   27:istore_2        
			for(int i = 0; i < s.length(); i++)
		//*  15   28:iconst_0        
		//*  16   29:istore          4
		//*  17   31:iload           4
		//*  18   33:aload           5
		//*  19   35:invokevirtual   #114 <Method int String.length()>
		//*  20   38:icmpge          105
			{
				char c = s.charAt(i);
		//   21   41:aload           5
		//   22   43:iload           4
		//   23   45:invokevirtual   #123 <Method char String.charAt(int)>
		//   24   48:istore_1        
				boolean flag1 = flag;
		//   25   49:iload_2         
		//   26   50:istore_3        
				if(c >= '\200')
		//*  27   51:iload_1         
		//*  28   52:sipush          128
		//*  29   55:icmplt          60
					flag1 = false;
		//   30   58:iconst_0        
		//   31   59:istore_3        
				flag = flag1;
		//   32   60:iload_3         
		//   33   61:istore_2        
				if(Character.isLetter(c))
					continue;
		//   34   62:iload_1         
		//   35   63:invokestatic    #129 <Method boolean Character.isLetter(char)>
		//   36   66:ifne            96
				flag = flag1;
		//   37   69:iload_3         
		//   38   70:istore_2        
				if(c == '_')
					continue;
		//   39   71:iload_1         
		//   40   72:bipush          95
		//   41   74:icmpeq          96
				if(Character.isDigit(c) && i > 0)
		//*  42   77:iload_1         
		//*  43   78:invokestatic    #132 <Method boolean Character.isDigit(char)>
		//*  44   81:ifeq            94
		//*  45   84:iload           4
		//*  46   86:ifle            94
					flag = flag1;
		//   47   89:iload_3         
		//   48   90:istore_2        
				else
		//*  49   91:goto            96
					flag = false;
		//   50   94:iconst_0        
		//   51   95:istore_2        
			}

		//   52   96:iload           4
		//   53   98:iconst_1        
		//   54   99:iadd            
		//   55  100:istore          4
		//*  56  102:goto            31
			if(!flag)
		//*  57  105:iload_2         
		//*  58  106:ifne            144
				throw new DescriptorValidationException(genericdescriptor, (new StringBuilder()).append('"').append(s).append("\" is not a valid identifier.").toString());
		//   59  109:new             #32  <Class Descriptors$DescriptorValidationException>
		//   60  112:dup             
		//   61  113:aload_0         
		//   62  114:new             #134 <Class StringBuilder>
		//   63  117:dup             
		//   64  118:invokespecial   #135 <Method void StringBuilder()>
		//   65  121:bipush          34
		//   66  123:invokevirtual   #139 <Method StringBuilder StringBuilder.append(char)>
		//   67  126:aload           5
		//   68  128:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   69  131:ldc1            #144 <String "\" is not a valid identifier.">
		//   70  133:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   71  136:invokevirtual   #147 <Method String StringBuilder.toString()>
		//   72  139:aconst_null     
		//   73  140:invokespecial   #119 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   74  143:athrow          
			else
				return;
		//   75  144:return          
		}

		void addEnumValueByNumber(EnumValueDescriptor enumvaluedescriptor)
		{
			DescriptorIntPair descriptorintpair = new DescriptorIntPair(((GenericDescriptor) (enumvaluedescriptor.getType())), enumvaluedescriptor.getNumber());
		//    0    0:new             #9   <Class Descriptors$DescriptorPool$DescriptorIntPair>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #156 <Method Descriptors$EnumDescriptor Descriptors$EnumValueDescriptor.getType()>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #159 <Method int Descriptors$EnumValueDescriptor.getNumber()>
		//    6   12:invokespecial   #162 <Method void Descriptors$DescriptorPool$DescriptorIntPair(Descriptors$GenericDescriptor, int)>
		//    7   15:astore_2        
			enumvaluedescriptor = (EnumValueDescriptor)enumValuesByNumber.put(((Object) (descriptorintpair)), ((Object) (enumvaluedescriptor)));
		//    8   16:aload_0         
		//    9   17:getfield        #44  <Field Map enumValuesByNumber>
		//   10   20:aload_2         
		//   11   21:aload_1         
		//   12   22:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   13   27:checkcast       #152 <Class Descriptors$EnumValueDescriptor>
		//   14   30:astore_1        
			if(enumvaluedescriptor != null)
		//*  15   31:aload_1         
		//*  16   32:ifnull          47
				enumValuesByNumber.put(((Object) (descriptorintpair)), ((Object) (enumvaluedescriptor)));
		//   17   35:aload_0         
		//   18   36:getfield        #44  <Field Map enumValuesByNumber>
		//   19   39:aload_2         
		//   20   40:aload_1         
		//   21   41:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   22   46:pop             
		//   23   47:return          
		}

		void addFieldByNumber(FieldDescriptor fielddescriptor)
			throws DescriptorValidationException
		{
			DescriptorIntPair descriptorintpair = new DescriptorIntPair(((GenericDescriptor) (fielddescriptor.getContainingType())), fielddescriptor.getNumber());
		//    0    0:new             #9   <Class Descriptors$DescriptorPool$DescriptorIntPair>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #176 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getContainingType()>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #177 <Method int Descriptors$FieldDescriptor.getNumber()>
		//    6   12:invokespecial   #162 <Method void Descriptors$DescriptorPool$DescriptorIntPair(Descriptors$GenericDescriptor, int)>
		//    7   15:astore_2        
			FieldDescriptor fielddescriptor1 = (FieldDescriptor)fieldsByNumber.put(((Object) (descriptorintpair)), ((Object) (fielddescriptor)));
		//    8   16:aload_0         
		//    9   17:getfield        #42  <Field Map fieldsByNumber>
		//   10   20:aload_2         
		//   11   21:aload_1         
		//   12   22:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   13   27:checkcast       #172 <Class Descriptors$FieldDescriptor>
		//   14   30:astore_3        
			if(fielddescriptor1 != null)
		//*  15   31:aload_3         
		//*  16   32:ifnull          111
			{
				fieldsByNumber.put(((Object) (descriptorintpair)), ((Object) (fielddescriptor1)));
		//   17   35:aload_0         
		//   18   36:getfield        #42  <Field Map fieldsByNumber>
		//   19   39:aload_2         
		//   20   40:aload_3         
		//   21   41:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   22   46:pop             
				throw new DescriptorValidationException(((GenericDescriptor) (fielddescriptor)), (new StringBuilder()).append("Field number ").append(fielddescriptor.getNumber()).append(" has already been used in \"").append(fielddescriptor.getContainingType().getFullName()).append("\" by field \"").append(fielddescriptor1.getName()).append("\".").toString());
		//   23   47:new             #32  <Class Descriptors$DescriptorValidationException>
		//   24   50:dup             
		//   25   51:aload_1         
		//   26   52:new             #134 <Class StringBuilder>
		//   27   55:dup             
		//   28   56:invokespecial   #135 <Method void StringBuilder()>
		//   29   59:ldc1            #179 <String "Field number ">
		//   30   61:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   31   64:aload_1         
		//   32   65:invokevirtual   #177 <Method int Descriptors$FieldDescriptor.getNumber()>
		//   33   68:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
		//   34   71:ldc1            #184 <String " has already been used in \"">
		//   35   73:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   36   76:aload_1         
		//   37   77:invokevirtual   #176 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getContainingType()>
		//   38   80:invokevirtual   #189 <Method String Descriptors$Descriptor.getFullName()>
		//   39   83:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   40   86:ldc1            #191 <String "\" by field \"">
		//   41   88:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   42   91:aload_3         
		//   43   92:invokevirtual   #192 <Method String Descriptors$FieldDescriptor.getName()>
		//   44   95:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   45   98:ldc1            #194 <String "\".">
		//   46  100:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   47  103:invokevirtual   #147 <Method String StringBuilder.toString()>
		//   48  106:aconst_null     
		//   49  107:invokespecial   #119 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   50  110:athrow          
			} else
			{
				return;
		//   51  111:return          
			}
		}

		void addPackage(String s, FileDescriptor filedescriptor)
			throws DescriptorValidationException
		{
			int i = s.lastIndexOf('.');
		//    0    0:aload_1         
		//    1    1:bipush          46
		//    2    3:invokevirtual   #198 <Method int String.lastIndexOf(int)>
		//    3    6:istore_3        
			String s1;
			if(i == -1)
		//*   4    7:iload_3         
		//*   5    8:iconst_m1       
		//*   6    9:icmpne          18
			{
				s1 = s;
		//    7   12:aload_1         
		//    8   13:astore          4
			} else
		//*   9   15:goto            38
			{
				addPackage(s.substring(0, i), filedescriptor);
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:iconst_0        
		//   13   21:iload_3         
		//   14   22:invokevirtual   #202 <Method String String.substring(int, int)>
		//   15   25:aload_2         
		//   16   26:invokevirtual   #85  <Method void addPackage(String, Descriptors$FileDescriptor)>
				s1 = s.substring(i + 1);
		//   17   29:aload_1         
		//   18   30:iload_3         
		//   19   31:iconst_1        
		//   20   32:iadd            
		//   21   33:invokevirtual   #205 <Method String String.substring(int)>
		//   22   36:astore          4
			}
			GenericDescriptor genericdescriptor = (GenericDescriptor)descriptorsByName.put(((Object) (s)), ((Object) (new PackageDescriptor(s1, s, filedescriptor))));
		//   23   38:aload_0         
		//   24   39:getfield        #40  <Field Map descriptorsByName>
		//   25   42:aload_1         
		//   26   43:new             #12  <Class Descriptors$DescriptorPool$PackageDescriptor>
		//   27   46:dup             
		//   28   47:aload           4
		//   29   49:aload_1         
		//   30   50:aload_2         
		//   31   51:invokespecial   #208 <Method void Descriptors$DescriptorPool$PackageDescriptor(String, String, Descriptors$FileDescriptor)>
		//   32   54:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   33   59:checkcast       #105 <Class Descriptors$GenericDescriptor>
		//   34   62:astore          5
			if(genericdescriptor != null)
		//*  35   64:aload           5
		//*  36   66:ifnull          141
			{
				descriptorsByName.put(((Object) (s)), ((Object) (genericdescriptor)));
		//   37   69:aload_0         
		//   38   70:getfield        #40  <Field Map descriptorsByName>
		//   39   73:aload_1         
		//   40   74:aload           5
		//   41   76:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   42   81:pop             
				if(!(genericdescriptor instanceof PackageDescriptor))
		//*  43   82:aload           5
		//*  44   84:instanceof      #12  <Class Descriptors$DescriptorPool$PackageDescriptor>
		//*  45   87:ifne            141
					throw new DescriptorValidationException(filedescriptor, (new StringBuilder()).append('"').append(s1).append("\" is already defined (as something other than a package) in file \"").append(genericdescriptor.getFile().getName()).append("\".").toString());
		//   46   90:new             #32  <Class Descriptors$DescriptorValidationException>
		//   47   93:dup             
		//   48   94:aload_2         
		//   49   95:new             #134 <Class StringBuilder>
		//   50   98:dup             
		//   51   99:invokespecial   #135 <Method void StringBuilder()>
		//   52  102:bipush          34
		//   53  104:invokevirtual   #139 <Method StringBuilder StringBuilder.append(char)>
		//   54  107:aload           4
		//   55  109:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   56  112:ldc1            #210 <String "\" is already defined (as something other than a package) in file \"">
		//   57  114:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   58  117:aload           5
		//   59  119:invokevirtual   #214 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
		//   60  122:invokevirtual   #215 <Method String Descriptors$FileDescriptor.getName()>
		//   61  125:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   62  128:ldc1            #194 <String "\".">
		//   63  130:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   64  133:invokevirtual   #147 <Method String StringBuilder.toString()>
		//   65  136:aconst_null     
		//   66  137:invokespecial   #218 <Method void Descriptors$DescriptorValidationException(Descriptors$FileDescriptor, String, Descriptors$1)>
		//   67  140:athrow          
			}
		//   68  141:return          
		}

		void addSymbol(GenericDescriptor genericdescriptor)
			throws DescriptorValidationException
		{
			validateSymbolName(genericdescriptor);
		//    0    0:aload_1         
		//    1    1:invokestatic    #221 <Method void validateSymbolName(Descriptors$GenericDescriptor)>
			String s = genericdescriptor.getFullName();
		//    2    4:aload_1         
		//    3    5:invokevirtual   #222 <Method String Descriptors$GenericDescriptor.getFullName()>
		//    4    8:astore_3        
			int i = s.lastIndexOf('.');
		//    5    9:aload_3         
		//    6   10:bipush          46
		//    7   12:invokevirtual   #198 <Method int String.lastIndexOf(int)>
		//    8   15:istore_2        
			GenericDescriptor genericdescriptor1 = (GenericDescriptor)descriptorsByName.put(((Object) (s)), ((Object) (genericdescriptor)));
		//    9   16:aload_0         
		//   10   17:getfield        #40  <Field Map descriptorsByName>
		//   11   20:aload_3         
		//   12   21:aload_1         
		//   13   22:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   14   27:checkcast       #105 <Class Descriptors$GenericDescriptor>
		//   15   30:astore          4
			if(genericdescriptor1 != null)
		//*  16   32:aload           4
		//*  17   34:ifnull          205
			{
				descriptorsByName.put(((Object) (s)), ((Object) (genericdescriptor1)));
		//   18   37:aload_0         
		//   19   38:getfield        #40  <Field Map descriptorsByName>
		//   20   41:aload_3         
		//   21   42:aload           4
		//   22   44:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   23   49:pop             
				if(genericdescriptor.getFile() == genericdescriptor1.getFile())
		//*  24   50:aload_1         
		//*  25   51:invokevirtual   #214 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
		//*  26   54:aload           4
		//*  27   56:invokevirtual   #214 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
		//*  28   59:if_acmpne       155
				{
					if(i == -1)
		//*  29   62:iload_2         
		//*  30   63:iconst_m1       
		//*  31   64:icmpne          101
						throw new DescriptorValidationException(genericdescriptor, (new StringBuilder()).append('"').append(s).append("\" is already defined.").toString());
		//   32   67:new             #32  <Class Descriptors$DescriptorValidationException>
		//   33   70:dup             
		//   34   71:aload_1         
		//   35   72:new             #134 <Class StringBuilder>
		//   36   75:dup             
		//   37   76:invokespecial   #135 <Method void StringBuilder()>
		//   38   79:bipush          34
		//   39   81:invokevirtual   #139 <Method StringBuilder StringBuilder.append(char)>
		//   40   84:aload_3         
		//   41   85:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   42   88:ldc1            #224 <String "\" is already defined.">
		//   43   90:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   44   93:invokevirtual   #147 <Method String StringBuilder.toString()>
		//   45   96:aconst_null     
		//   46   97:invokespecial   #119 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   47  100:athrow          
					else
						throw new DescriptorValidationException(genericdescriptor, (new StringBuilder()).append('"').append(s.substring(i + 1)).append("\" is already defined in \"").append(s.substring(0, i)).append("\".").toString());
		//   48  101:new             #32  <Class Descriptors$DescriptorValidationException>
		//   49  104:dup             
		//   50  105:aload_1         
		//   51  106:new             #134 <Class StringBuilder>
		//   52  109:dup             
		//   53  110:invokespecial   #135 <Method void StringBuilder()>
		//   54  113:bipush          34
		//   55  115:invokevirtual   #139 <Method StringBuilder StringBuilder.append(char)>
		//   56  118:aload_3         
		//   57  119:iload_2         
		//   58  120:iconst_1        
		//   59  121:iadd            
		//   60  122:invokevirtual   #205 <Method String String.substring(int)>
		//   61  125:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   62  128:ldc1            #226 <String "\" is already defined in \"">
		//   63  130:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   64  133:aload_3         
		//   65  134:iconst_0        
		//   66  135:iload_2         
		//   67  136:invokevirtual   #202 <Method String String.substring(int, int)>
		//   68  139:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   69  142:ldc1            #194 <String "\".">
		//   70  144:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   71  147:invokevirtual   #147 <Method String StringBuilder.toString()>
		//   72  150:aconst_null     
		//   73  151:invokespecial   #119 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   74  154:athrow          
				} else
				{
					throw new DescriptorValidationException(genericdescriptor, (new StringBuilder()).append('"').append(s).append("\" is already defined in file \"").append(genericdescriptor1.getFile().getName()).append("\".").toString());
		//   75  155:new             #32  <Class Descriptors$DescriptorValidationException>
		//   76  158:dup             
		//   77  159:aload_1         
		//   78  160:new             #134 <Class StringBuilder>
		//   79  163:dup             
		//   80  164:invokespecial   #135 <Method void StringBuilder()>
		//   81  167:bipush          34
		//   82  169:invokevirtual   #139 <Method StringBuilder StringBuilder.append(char)>
		//   83  172:aload_3         
		//   84  173:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   85  176:ldc1            #228 <String "\" is already defined in file \"">
		//   86  178:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   87  181:aload           4
		//   88  183:invokevirtual   #214 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
		//   89  186:invokevirtual   #215 <Method String Descriptors$FileDescriptor.getName()>
		//   90  189:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   91  192:ldc1            #194 <String "\".">
		//   92  194:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   93  197:invokevirtual   #147 <Method String StringBuilder.toString()>
		//   94  200:aconst_null     
		//   95  201:invokespecial   #119 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   96  204:athrow          
				}
			} else
			{
				return;
		//   97  205:return          
			}
		}

		GenericDescriptor findSymbol(String s)
		{
			return findSymbol(s, SearchFilter.ALL_SYMBOLS);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #234 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.ALL_SYMBOLS>
		//    3    5:invokevirtual   #237 <Method Descriptors$GenericDescriptor findSymbol(String, Descriptors$DescriptorPool$SearchFilter)>
		//    4    8:areturn         
		}

		GenericDescriptor findSymbol(String s, SearchFilter searchfilter)
		{
			GenericDescriptor genericdescriptor = (GenericDescriptor)descriptorsByName.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field Map descriptorsByName>
		//    2    4:aload_1         
		//    3    5:invokeinterface #241 <Method Object Map.get(Object)>
		//    4   10:checkcast       #105 <Class Descriptors$GenericDescriptor>
		//    5   13:astore_3        
			if(genericdescriptor != null && (searchfilter == SearchFilter.ALL_SYMBOLS || searchfilter == SearchFilter.TYPES_ONLY && isType(genericdescriptor) || searchfilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericdescriptor)))
		//*   6   14:aload_3         
		//*   7   15:ifnull          57
		//*   8   18:aload_2         
		//*   9   19:getstatic       #234 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.ALL_SYMBOLS>
		//*  10   22:if_acmpeq       55
		//*  11   25:aload_2         
		//*  12   26:getstatic       #244 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.TYPES_ONLY>
		//*  13   29:if_acmpne       40
		//*  14   32:aload_0         
		//*  15   33:aload_3         
		//*  16   34:invokevirtual   #248 <Method boolean isType(Descriptors$GenericDescriptor)>
		//*  17   37:ifne            55
		//*  18   40:aload_2         
		//*  19   41:getstatic       #251 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.AGGREGATES_ONLY>
		//*  20   44:if_acmpne       57
		//*  21   47:aload_0         
		//*  22   48:aload_3         
		//*  23   49:invokevirtual   #254 <Method boolean isAggregate(Descriptors$GenericDescriptor)>
		//*  24   52:ifeq            57
				return genericdescriptor;
		//   25   55:aload_3         
		//   26   56:areturn         
			for(Iterator iterator = dependencies.iterator(); iterator.hasNext();)
		//*  27   57:aload_0         
		//*  28   58:getfield        #49  <Field Set dependencies>
		//*  29   61:invokeinterface #65  <Method Iterator Set.iterator()>
		//*  30   66:astore_3        
		//*  31   67:aload_3         
		//*  32   68:invokeinterface #71  <Method boolean Iterator.hasNext()>
		//*  33   73:ifeq            152
			{
				GenericDescriptor genericdescriptor1 = (GenericDescriptor)((FileDescriptor)iterator.next()).pool.descriptorsByName.get(((Object) (s)));
		//   34   76:aload_3         
		//   35   77:invokeinterface #75  <Method Object Iterator.next()>
		//   36   82:checkcast       #77  <Class Descriptors$FileDescriptor>
		//   37   85:invokestatic    #258 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//   38   88:getfield        #40  <Field Map descriptorsByName>
		//   39   91:aload_1         
		//   40   92:invokeinterface #241 <Method Object Map.get(Object)>
		//   41   97:checkcast       #105 <Class Descriptors$GenericDescriptor>
		//   42  100:astore          4
				if(genericdescriptor1 != null && (searchfilter == SearchFilter.ALL_SYMBOLS || searchfilter == SearchFilter.TYPES_ONLY && isType(genericdescriptor1) || searchfilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericdescriptor1)))
		//*  43  102:aload           4
		//*  44  104:ifnull          149
		//*  45  107:aload_2         
		//*  46  108:getstatic       #234 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.ALL_SYMBOLS>
		//*  47  111:if_acmpeq       146
		//*  48  114:aload_2         
		//*  49  115:getstatic       #244 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.TYPES_ONLY>
		//*  50  118:if_acmpne       130
		//*  51  121:aload_0         
		//*  52  122:aload           4
		//*  53  124:invokevirtual   #248 <Method boolean isType(Descriptors$GenericDescriptor)>
		//*  54  127:ifne            146
		//*  55  130:aload_2         
		//*  56  131:getstatic       #251 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.AGGREGATES_ONLY>
		//*  57  134:if_acmpne       149
		//*  58  137:aload_0         
		//*  59  138:aload           4
		//*  60  140:invokevirtual   #254 <Method boolean isAggregate(Descriptors$GenericDescriptor)>
		//*  61  143:ifeq            149
					return genericdescriptor1;
		//   62  146:aload           4
		//   63  148:areturn         
			}

		//*  64  149:goto            67
			return null;
		//   65  152:aconst_null     
		//   66  153:areturn         
		}

		boolean isAggregate(GenericDescriptor genericdescriptor)
		{
			return (genericdescriptor instanceof Descriptor) || (genericdescriptor instanceof EnumDescriptor) || (genericdescriptor instanceof PackageDescriptor) || (genericdescriptor instanceof ServiceDescriptor);
		//    0    0:aload_1         
		//    1    1:instanceof      #186 <Class Descriptors$Descriptor>
		//    2    4:ifne            28
		//    3    7:aload_1         
		//    4    8:instanceof      #260 <Class Descriptors$EnumDescriptor>
		//    5   11:ifne            28
		//    6   14:aload_1         
		//    7   15:instanceof      #12  <Class Descriptors$DescriptorPool$PackageDescriptor>
		//    8   18:ifne            28
		//    9   21:aload_1         
		//   10   22:instanceof      #262 <Class Descriptors$ServiceDescriptor>
		//   11   25:ifeq            30
		//   12   28:iconst_1        
		//   13   29:ireturn         
		//   14   30:iconst_0        
		//   15   31:ireturn         
		}

		boolean isType(GenericDescriptor genericdescriptor)
		{
			return (genericdescriptor instanceof Descriptor) || (genericdescriptor instanceof EnumDescriptor);
		//    0    0:aload_1         
		//    1    1:instanceof      #186 <Class Descriptors$Descriptor>
		//    2    4:ifne            14
		//    3    7:aload_1         
		//    4    8:instanceof      #260 <Class Descriptors$EnumDescriptor>
		//    5   11:ifeq            16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		GenericDescriptor lookupSymbol(String s, GenericDescriptor genericdescriptor, SearchFilter searchfilter)
			throws DescriptorValidationException
		{
			Object obj;
			Object obj1;
			if(s.startsWith("."))
		//*   0    0:aload_1         
		//*   1    1:ldc2            #266 <String ".">
		//*   2    4:invokevirtual   #270 <Method boolean String.startsWith(String)>
		//*   3    7:ifeq            29
			{
				obj1 = ((Object) (s.substring(1)));
		//    4   10:aload_1         
		//    5   11:iconst_1        
		//    6   12:invokevirtual   #205 <Method String String.substring(int)>
		//    7   15:astore          7
				obj = ((Object) (findSymbol(((String) (obj1)), searchfilter)));
		//    8   17:aload_0         
		//    9   18:aload           7
		//   10   20:aload_3         
		//   11   21:invokevirtual   #237 <Method Descriptors$GenericDescriptor findSymbol(String, Descriptors$DescriptorPool$SearchFilter)>
		//   12   24:astore          6
			} else
		//*  13   26:goto            195
			{
				int i = s.indexOf('.');
		//   14   29:aload_1         
		//   15   30:bipush          46
		//   16   32:invokevirtual   #273 <Method int String.indexOf(int)>
		//   17   35:istore          4
				if(i == -1)
		//*  18   37:iload           4
		//*  19   39:iconst_m1       
		//*  20   40:icmpne          49
					obj = ((Object) (s));
		//   21   43:aload_1         
		//   22   44:astore          6
				else
		//*  23   46:goto            58
					obj = ((Object) (s.substring(0, i)));
		//   24   49:aload_1         
		//   25   50:iconst_0        
		//   26   51:iload           4
		//   27   53:invokevirtual   #202 <Method String String.substring(int, int)>
		//   28   56:astore          6
				StringBuilder stringbuilder = new StringBuilder(genericdescriptor.getFullName());
		//   29   58:new             #134 <Class StringBuilder>
		//   30   61:dup             
		//   31   62:aload_2         
		//   32   63:invokevirtual   #222 <Method String Descriptors$GenericDescriptor.getFullName()>
		//   33   66:invokespecial   #276 <Method void StringBuilder(String)>
		//   34   69:astore          8
				do
				{
					int j = stringbuilder.lastIndexOf(".");
		//   35   71:aload           8
		//   36   73:ldc2            #266 <String ".">
		//   37   76:invokevirtual   #279 <Method int StringBuilder.lastIndexOf(String)>
		//   38   79:istore          5
					if(j == -1)
		//*  39   81:iload           5
		//*  40   83:iconst_m1       
		//*  41   84:icmpne          101
					{
						obj1 = ((Object) (s));
		//   42   87:aload_1         
		//   43   88:astore          7
						obj = ((Object) (findSymbol(s, searchfilter)));
		//   44   90:aload_0         
		//   45   91:aload_1         
		//   46   92:aload_3         
		//   47   93:invokevirtual   #237 <Method Descriptors$GenericDescriptor findSymbol(String, Descriptors$DescriptorPool$SearchFilter)>
		//   48   96:astore          6
						break;
		//   49   98:goto            195
					}
					stringbuilder.setLength(j + 1);
		//   50  101:aload           8
		//   51  103:iload           5
		//   52  105:iconst_1        
		//   53  106:iadd            
		//   54  107:invokevirtual   #283 <Method void StringBuilder.setLength(int)>
					stringbuilder.append(((String) (obj)));
		//   55  110:aload           8
		//   56  112:aload           6
		//   57  114:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   58  117:pop             
					obj1 = ((Object) (findSymbol(stringbuilder.toString(), SearchFilter.AGGREGATES_ONLY)));
		//   59  118:aload_0         
		//   60  119:aload           8
		//   61  121:invokevirtual   #147 <Method String StringBuilder.toString()>
		//   62  124:getstatic       #251 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.AGGREGATES_ONLY>
		//   63  127:invokevirtual   #237 <Method Descriptors$GenericDescriptor findSymbol(String, Descriptors$DescriptorPool$SearchFilter)>
		//   64  130:astore          7
					if(obj1 != null)
		//*  65  132:aload           7
		//*  66  134:ifnull          185
					{
						obj = obj1;
		//   67  137:aload           7
		//   68  139:astore          6
						if(i != -1)
		//*  69  141:iload           4
		//*  70  143:iconst_m1       
		//*  71  144:icmpeq          175
						{
							stringbuilder.setLength(j + 1);
		//   72  147:aload           8
		//   73  149:iload           5
		//   74  151:iconst_1        
		//   75  152:iadd            
		//   76  153:invokevirtual   #283 <Method void StringBuilder.setLength(int)>
							stringbuilder.append(s);
		//   77  156:aload           8
		//   78  158:aload_1         
		//   79  159:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//   80  162:pop             
							obj = ((Object) (findSymbol(stringbuilder.toString(), searchfilter)));
		//   81  163:aload_0         
		//   82  164:aload           8
		//   83  166:invokevirtual   #147 <Method String StringBuilder.toString()>
		//   84  169:aload_3         
		//   85  170:invokevirtual   #237 <Method Descriptors$GenericDescriptor findSymbol(String, Descriptors$DescriptorPool$SearchFilter)>
		//   86  173:astore          6
						}
						obj1 = ((Object) (stringbuilder.toString()));
		//   87  175:aload           8
		//   88  177:invokevirtual   #147 <Method String StringBuilder.toString()>
		//   89  180:astore          7
						break;
		//   90  182:goto            195
					}
					stringbuilder.setLength(j);
		//   91  185:aload           8
		//   92  187:iload           5
		//   93  189:invokevirtual   #283 <Method void StringBuilder.setLength(int)>
				} while(true);
		//   94  192:goto            71
			}
			if(obj == null)
		//*  95  195:aload           6
		//*  96  197:ifnonnull       307
			{
				if(allowUnknownDependencies && searchfilter == SearchFilter.TYPES_ONLY)
		//*  97  200:aload_0         
		//*  98  201:getfield        #51  <Field boolean allowUnknownDependencies>
		//*  99  204:ifeq            272
		//* 100  207:aload_3         
		//* 101  208:getstatic       #244 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.TYPES_ONLY>
		//* 102  211:if_acmpne       272
				{
					Descriptors.logger.warning((new StringBuilder()).append("The descriptor for message type \"").append(s).append("\" can not be found and a placeholder is created for it").toString());
		//  103  214:invokestatic    #287 <Method Logger Descriptors.access$100()>
		//  104  217:new             #134 <Class StringBuilder>
		//  105  220:dup             
		//  106  221:invokespecial   #135 <Method void StringBuilder()>
		//  107  224:ldc2            #289 <String "The descriptor for message type \"">
		//  108  227:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//  109  230:aload_1         
		//  110  231:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//  111  234:ldc2            #291 <String "\" can not be found and a placeholder is created for it">
		//  112  237:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//  113  240:invokevirtual   #147 <Method String StringBuilder.toString()>
		//  114  243:invokevirtual   #296 <Method void Logger.warning(String)>
					s = ((String) (new Descriptor(((String) (obj1)))));
		//  115  246:new             #186 <Class Descriptors$Descriptor>
		//  116  249:dup             
		//  117  250:aload           7
		//  118  252:invokespecial   #297 <Method void Descriptors$Descriptor(String)>
		//  119  255:astore_1        
					dependencies.add(((Object) (((GenericDescriptor) (s)).getFile())));
		//  120  256:aload_0         
		//  121  257:getfield        #49  <Field Set dependencies>
		//  122  260:aload_1         
		//  123  261:invokevirtual   #214 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
		//  124  264:invokeinterface #57  <Method boolean Set.add(Object)>
		//  125  269:pop             
					return ((GenericDescriptor) (s));
		//  126  270:aload_1         
		//  127  271:areturn         
				} else
				{
					throw new DescriptorValidationException(genericdescriptor, (new StringBuilder()).append('"').append(s).append("\" is not defined.").toString());
		//  128  272:new             #32  <Class Descriptors$DescriptorValidationException>
		//  129  275:dup             
		//  130  276:aload_2         
		//  131  277:new             #134 <Class StringBuilder>
		//  132  280:dup             
		//  133  281:invokespecial   #135 <Method void StringBuilder()>
		//  134  284:bipush          34
		//  135  286:invokevirtual   #139 <Method StringBuilder StringBuilder.append(char)>
		//  136  289:aload_1         
		//  137  290:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//  138  293:ldc2            #299 <String "\" is not defined.">
		//  139  296:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
		//  140  299:invokevirtual   #147 <Method String StringBuilder.toString()>
		//  141  302:aconst_null     
		//  142  303:invokespecial   #119 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  143  306:athrow          
				}
			} else
			{
				return ((GenericDescriptor) (obj));
		//  144  307:aload           6
		//  145  309:areturn         
			}
		}

		private boolean allowUnknownDependencies;
		private final Set dependencies = new HashSet();
		private final Map descriptorsByName = new HashMap();
		private final Map enumValuesByNumber = new HashMap();
		private final Map fieldsByNumber = new HashMap();


/*
		static Map access$1500(DescriptorPool descriptorpool)
		{
			return descriptorpool.fieldsByNumber;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field Map fieldsByNumber>
		//    2    4:areturn         
		}

*/


/*
		static Map access$2400(DescriptorPool descriptorpool)
		{
			return descriptorpool.enumValuesByNumber;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field Map enumValuesByNumber>
		//    2    4:areturn         
		}

*/

		DescriptorPool(FileDescriptor afiledescriptor[], boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #37  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #38  <Method void HashMap()>
		//    6   12:putfield        #40  <Field Map descriptorsByName>
		//    7   15:aload_0         
		//    8   16:new             #37  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #38  <Method void HashMap()>
		//   11   23:putfield        #42  <Field Map fieldsByNumber>
		//   12   26:aload_0         
		//   13   27:new             #37  <Class HashMap>
		//   14   30:dup             
		//   15   31:invokespecial   #38  <Method void HashMap()>
		//   16   34:putfield        #44  <Field Map enumValuesByNumber>
		//   17   37:aload_0         
		//   18   38:new             #46  <Class HashSet>
		//   19   41:dup             
		//   20   42:invokespecial   #47  <Method void HashSet()>
		//   21   45:putfield        #49  <Field Set dependencies>
			allowUnknownDependencies = flag;
		//   22   48:aload_0         
		//   23   49:iload_2         
		//   24   50:putfield        #51  <Field boolean allowUnknownDependencies>
			for(int i = 0; i < afiledescriptor.length; i++)
		//*  25   53:iconst_0        
		//*  26   54:istore_3        
		//*  27   55:iload_3         
		//*  28   56:aload_1         
		//*  29   57:arraylength     
		//*  30   58:icmpge          88
			{
				dependencies.add(((Object) (afiledescriptor[i])));
		//   31   61:aload_0         
		//   32   62:getfield        #49  <Field Set dependencies>
		//   33   65:aload_1         
		//   34   66:iload_3         
		//   35   67:aaload          
		//   36   68:invokeinterface #57  <Method boolean Set.add(Object)>
		//   37   73:pop             
				importPublicDependencies(afiledescriptor[i]);
		//   38   74:aload_0         
		//   39   75:aload_1         
		//   40   76:iload_3         
		//   41   77:aaload          
		//   42   78:invokespecial   #61  <Method void importPublicDependencies(Descriptors$FileDescriptor)>
			}

		//   43   81:iload_3         
		//   44   82:iconst_1        
		//   45   83:iadd            
		//   46   84:istore_3        
		//*  47   85:goto            55
			for(afiledescriptor = ((FileDescriptor []) (dependencies.iterator())); ((Iterator) (afiledescriptor)).hasNext();)
		//*  48   88:aload_0         
		//*  49   89:getfield        #49  <Field Set dependencies>
		//*  50   92:invokeinterface #65  <Method Iterator Set.iterator()>
		//*  51   97:astore_1        
		//*  52   98:aload_1         
		//*  53   99:invokeinterface #71  <Method boolean Iterator.hasNext()>
		//*  54  104:ifeq            145
			{
				FileDescriptor filedescriptor = (FileDescriptor)((Iterator) (afiledescriptor)).next();
		//   55  107:aload_1         
		//   56  108:invokeinterface #75  <Method Object Iterator.next()>
		//   57  113:checkcast       #77  <Class Descriptors$FileDescriptor>
		//   58  116:astore          4
				try
				{
					addPackage(filedescriptor.getPackage(), filedescriptor);
		//   59  118:aload_0         
		//   60  119:aload           4
		//   61  121:invokevirtual   #81  <Method String Descriptors$FileDescriptor.getPackage()>
		//   62  124:aload           4
		//   63  126:invokevirtual   #85  <Method void addPackage(String, Descriptors$FileDescriptor)>
				}
		//*  64  129:goto            142
				// Misplaced declaration of an exception variable
				catch(FileDescriptor afiledescriptor[])
		//*  65  132:astore_1        
				{
					throw new AssertionError(((Object) (afiledescriptor)));
		//   66  133:new             #87  <Class AssertionError>
		//   67  136:dup             
		//   68  137:aload_1         
		//   69  138:invokespecial   #90  <Method void AssertionError(Object)>
		//   70  141:athrow          
				}
			}

		//*  71  142:goto            98
		//   72  145:return          
		}
	}

	static final class DescriptorPool.DescriptorIntPair
	{

		public boolean equals(Object obj)
		{
			if(!(obj instanceof DescriptorPool.DescriptorIntPair))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class Descriptors$DescriptorPool$DescriptorIntPair>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			obj = ((Object) ((DescriptorPool.DescriptorIntPair)obj));
		//    5    9:aload_1         
		//    6   10:checkcast       #2   <Class Descriptors$DescriptorPool$DescriptorIntPair>
		//    7   13:astore_1        
			return descriptor == ((DescriptorPool.DescriptorIntPair) (obj)).descriptor && number == ((DescriptorPool.DescriptorIntPair) (obj)).number;
		//    8   14:aload_0         
		//    9   15:getfield        #21  <Field Descriptors$GenericDescriptor descriptor>
		//   10   18:aload_1         
		//   11   19:getfield        #21  <Field Descriptors$GenericDescriptor descriptor>
		//   12   22:if_acmpne       38
		//   13   25:aload_0         
		//   14   26:getfield        #23  <Field int number>
		//   15   29:aload_1         
		//   16   30:getfield        #23  <Field int number>
		//   17   33:icmpne          38
		//   18   36:iconst_1        
		//   19   37:ireturn         
		//   20   38:iconst_0        
		//   21   39:ireturn         
		}

		public int hashCode()
		{
			return ((Object) (descriptor)).hashCode() * 65535 + number;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Descriptors$GenericDescriptor descriptor>
		//    2    4:invokevirtual   #30  <Method int Object.hashCode()>
		//    3    7:ldc1            #31  <Int 65535>
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #23  <Field int number>
		//    7   14:iadd            
		//    8   15:ireturn         
		}

		private final GenericDescriptor descriptor;
		private final int number;

		DescriptorPool.DescriptorIntPair(GenericDescriptor genericdescriptor, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			descriptor = genericdescriptor;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Descriptors$GenericDescriptor descriptor>
			number = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int number>
		//    8   14:return          
		}
	}

	static final class DescriptorPool.PackageDescriptor extends GenericDescriptor
	{

		public FileDescriptor getFile()
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

		private final FileDescriptor file;
		private final String fullName;
		private final String name;

		DescriptorPool.PackageDescriptor(String s, String s1, FileDescriptor filedescriptor)
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

	static final class DescriptorPool.SearchFilter extends Enum
	{

		public static DescriptorPool.SearchFilter valueOf(String s)
		{
			return (DescriptorPool.SearchFilter)Enum.valueOf(com/google/protobuf/Descriptors$DescriptorPool$SearchFilter, s);
		//    0    0:ldc1            #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//    1    2:aload_0         
		//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//    4    9:areturn         
		}

		public static DescriptorPool.SearchFilter[] values()
		{
			return (DescriptorPool.SearchFilter[])((DescriptorPool.SearchFilter []) ($VALUES)).clone();
		//    0    0:getstatic       #34  <Field Descriptors$DescriptorPool$SearchFilter[] $VALUES>
		//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.google.protobuf.Descriptors$DescriptorPool$SearchFilter_3B_.clone()>
		//    2    6:checkcast       #45  <Class Descriptors$DescriptorPool$SearchFilter[]>
		//    3    9:areturn         
		}

		private static final DescriptorPool.SearchFilter $VALUES[];
		public static final DescriptorPool.SearchFilter AGGREGATES_ONLY;
		public static final DescriptorPool.SearchFilter ALL_SYMBOLS;
		public static final DescriptorPool.SearchFilter TYPES_ONLY;

		static 
		{
			TYPES_ONLY = new DescriptorPool.SearchFilter("TYPES_ONLY", 0);
		//    0    0:new             #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "TYPES_ONLY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void Descriptors$DescriptorPool$SearchFilter(String, int)>
		//    5   10:putstatic       #26  <Field Descriptors$DescriptorPool$SearchFilter TYPES_ONLY>
			AGGREGATES_ONLY = new DescriptorPool.SearchFilter("AGGREGATES_ONLY", 1);
		//    6   13:new             #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "AGGREGATES_ONLY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void Descriptors$DescriptorPool$SearchFilter(String, int)>
		//   11   23:putstatic       #29  <Field Descriptors$DescriptorPool$SearchFilter AGGREGATES_ONLY>
			ALL_SYMBOLS = new DescriptorPool.SearchFilter("ALL_SYMBOLS", 2);
		//   12   26:new             #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "ALL_SYMBOLS">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void Descriptors$DescriptorPool$SearchFilter(String, int)>
		//   17   36:putstatic       #32  <Field Descriptors$DescriptorPool$SearchFilter ALL_SYMBOLS>
			$VALUES = (new DescriptorPool.SearchFilter[] {
				TYPES_ONLY, AGGREGATES_ONLY, ALL_SYMBOLS
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       DescriptorPool.SearchFilter[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #26  <Field Descriptors$DescriptorPool$SearchFilter TYPES_ONLY>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #29  <Field Descriptors$DescriptorPool$SearchFilter AGGREGATES_ONLY>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #32  <Field Descriptors$DescriptorPool$SearchFilter ALL_SYMBOLS>
		//   31   60:aastore         
		//   32   61:putstatic       #34  <Field Descriptors$DescriptorPool$SearchFilter[] $VALUES>
		//*  33   64:return          
		}

		private DescriptorPool.SearchFilter(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #36  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static class DescriptorValidationException extends Exception
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

		private DescriptorValidationException(FileDescriptor filedescriptor, String s)
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


		private DescriptorValidationException(GenericDescriptor genericdescriptor, String s)
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


		private DescriptorValidationException(GenericDescriptor genericdescriptor, String s, Throwable throwable)
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

	}

	public static final class EnumDescriptor extends GenericDescriptor
		implements Internal.EnumLiteMap
	{

		private void setProto(DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
		{
			proto = enumdescriptorproto;
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
				values[i].setProto(enumdescriptorproto.getValue(i));
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

		public EnumValueDescriptor findValueByName(String s)
		{
			s = ((String) (file.pool.findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
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
			if(s != null && (s instanceof EnumValueDescriptor))
		//*  16   37:aload_1         
		//*  17   38:ifnull          53
		//*  18   41:aload_1         
		//*  19   42:instanceof      #68  <Class Descriptors$EnumValueDescriptor>
		//*  20   45:ifeq            53
				return (EnumValueDescriptor)s;
		//   21   48:aload_1         
		//   22   49:checkcast       #68  <Class Descriptors$EnumValueDescriptor>
		//   23   52:areturn         
			else
				return null;
		//   24   53:aconst_null     
		//   25   54:areturn         
		}

		public EnumValueDescriptor findValueByNumber(int i)
		{
			return (EnumValueDescriptor)file.pool.enumValuesByNumber.get(((Object) (new DescriptorPool.DescriptorIntPair(((GenericDescriptor) (this)), i))));
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

		public EnumValueDescriptor findValueByNumberCreatingIfUnknown(int i)
		{
			EnumValueDescriptor enumvaluedescriptor;
			enumvaluedescriptor = findValueByNumber(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #143 <Method Descriptors$EnumValueDescriptor findValueByNumber(int)>
		//    3    5:astore_2        
			if(enumvaluedescriptor != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          12
				return enumvaluedescriptor;
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
			enumvaluedescriptor = (EnumValueDescriptor)((WeakReference) (obj)).get();
		//   23   41:aload_3         
		//   24   42:invokevirtual   #155 <Method Object WeakReference.get()>
		//   25   45:checkcast       #68  <Class Descriptors$EnumValueDescriptor>
		//   26   48:astore_2        
			obj = ((Object) (enumvaluedescriptor));
		//   27   49:aload_2         
		//   28   50:astore_3        
			if(enumvaluedescriptor != null)
				break MISSING_BLOCK_LABEL_89;
		//   29   51:aload_2         
		//   30   52:ifnonnull       89
			obj = ((Object) (new EnumValueDescriptor(file, this, integer)));
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
			return ((EnumValueDescriptor) (obj));
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

		public Descriptor getContainingType()
		{
			return containingType;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Descriptors$Descriptor containingType>
		//    2    4:areturn         
		}

		public FileDescriptor getFile()
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

		public DescriptorProtos.EnumOptions getOptions()
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

		public DescriptorProtos.EnumDescriptorProto toProto()
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

		private final Descriptor containingType;
		private final FileDescriptor file;
		private final String fullName;
		private final int index;
		private DescriptorProtos.EnumDescriptorProto proto;
		private final WeakHashMap unknownValues;
		private EnumValueDescriptor values[];


/*
		static void access$1100(EnumDescriptor enumdescriptor, DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
		{
			enumdescriptor.setProto(enumdescriptorproto);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #100 <Method void setProto(DescriptorProtos$EnumDescriptorProto)>
			return;
		//    3    5:return          
		}

*/

		private EnumDescriptor(DescriptorProtos.EnumDescriptorProto enumdescriptorproto, FileDescriptor filedescriptor, Descriptor descriptor, int i)
			throws DescriptorValidationException
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
			proto = enumdescriptorproto;
		//   10   21:aload_0         
		//   11   22:aload_1         
		//   12   23:putfield        #41  <Field DescriptorProtos$EnumDescriptorProto proto>
			fullName = Descriptors.computeFullName(filedescriptor, descriptor, enumdescriptorproto.getName());
		//   13   26:aload_0         
		//   14   27:aload_2         
		//   15   28:aload_3         
		//   16   29:aload_1         
		//   17   30:invokevirtual   #47  <Method String DescriptorProtos$EnumDescriptorProto.getName()>
		//   18   33:invokestatic    #51  <Method String Descriptors.access$1600(Descriptors$FileDescriptor, Descriptors$Descriptor, String)>
		//   19   36:putfield        #53  <Field String fullName>
			file = filedescriptor;
		//   20   39:aload_0         
		//   21   40:aload_2         
		//   22   41:putfield        #55  <Field Descriptors$FileDescriptor file>
			containingType = descriptor;
		//   23   44:aload_0         
		//   24   45:aload_3         
		//   25   46:putfield        #57  <Field Descriptors$Descriptor containingType>
			if(enumdescriptorproto.getValueCount() == 0)
		//*  26   49:aload_1         
		//*  27   50:invokevirtual   #61  <Method int DescriptorProtos$EnumDescriptorProto.getValueCount()>
		//*  28   53:ifne            68
				throw new DescriptorValidationException(((GenericDescriptor) (this)), "Enums must contain at least one value.");
		//   29   56:new             #29  <Class Descriptors$DescriptorValidationException>
		//   30   59:dup             
		//   31   60:aload_0         
		//   32   61:ldc1            #63  <String "Enums must contain at least one value.">
		//   33   63:aconst_null     
		//   34   64:invokespecial   #66  <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   35   67:athrow          
			values = new EnumValueDescriptor[enumdescriptorproto.getValueCount()];
		//   36   68:aload_0         
		//   37   69:aload_1         
		//   38   70:invokevirtual   #61  <Method int DescriptorProtos$EnumDescriptorProto.getValueCount()>
		//   39   73:anewarray       EnumValueDescriptor[]
		//   40   76:putfield        #70  <Field Descriptors$EnumValueDescriptor[] values>
			for(i = 0; i < enumdescriptorproto.getValueCount(); i++)
		//*  41   79:iconst_0        
		//*  42   80:istore          4
		//*  43   82:iload           4
		//*  44   84:aload_1         
		//*  45   85:invokevirtual   #61  <Method int DescriptorProtos$EnumDescriptorProto.getValueCount()>
		//*  46   88:icmpge          125
				values[i] = new EnumValueDescriptor(enumdescriptorproto.getValue(i), filedescriptor, this, i);
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
			filedescriptor.pool.addSymbol(((GenericDescriptor) (this)));
		//   66  125:aload_2         
		//   67  126:invokestatic    #83  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//   68  129:aload_0         
		//   69  130:invokevirtual   #89  <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
		//   70  133:return          
		}

	}

	public static final class EnumValueDescriptor extends GenericDescriptor
		implements Internal.EnumLite
	{

		private void setProto(DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
		{
			proto = enumvaluedescriptorproto;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
		//    3    5:return          
		}

		public FileDescriptor getFile()
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

		public DescriptorProtos.EnumValueOptions getOptions()
		{
			return proto.getOptions();
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field DescriptorProtos$EnumValueDescriptorProto proto>
		//    2    4:invokevirtual   #137 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueDescriptorProto.getOptions()>
		//    3    7:areturn         
		}

		public EnumDescriptor getType()
		{
			return type;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Descriptors$EnumDescriptor type>
		//    2    4:areturn         
		}

		public DescriptorProtos.EnumValueDescriptorProto toProto()
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

		private final FileDescriptor file;
		private final String fullName;
		private final int index;
		private Integer number;
		private DescriptorProtos.EnumValueDescriptorProto proto;
		private final EnumDescriptor type;


/*
		static void access$2700(EnumValueDescriptor enumvaluedescriptor, DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
		{
			enumvaluedescriptor.setProto(enumvaluedescriptorproto);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #127 <Method void setProto(DescriptorProtos$EnumValueDescriptorProto)>
			return;
		//    3    5:return          
		}

*/

		private EnumValueDescriptor(DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto, FileDescriptor filedescriptor, EnumDescriptor enumdescriptor, int i)
			throws DescriptorValidationException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Descriptors$GenericDescriptor()>
			index = i;
		//    2    4:aload_0         
		//    3    5:iload           4
		//    4    7:putfield        #30  <Field int index>
			proto = enumvaluedescriptorproto;
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
			fullName = (new StringBuilder()).append(enumdescriptor.getFullName()).append('.').append(enumvaluedescriptorproto.getName()).toString();
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
			filedescriptor.pool.addSymbol(((GenericDescriptor) (this)));
		//   28   58:aload_2         
		//   29   59:invokestatic    #68  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//   30   62:aload_0         
		//   31   63:invokevirtual   #74  <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
			filedescriptor.pool.addEnumValueByNumber(this);
		//   32   66:aload_2         
		//   33   67:invokestatic    #68  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//   34   70:aload_0         
		//   35   71:invokevirtual   #78  <Method void Descriptors$DescriptorPool.addEnumValueByNumber(Descriptors$EnumValueDescriptor)>
		//   36   74:return          
		}


		private EnumValueDescriptor(FileDescriptor filedescriptor, EnumDescriptor enumdescriptor, Integer integer)
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
			obj = ((Object) (DescriptorProtos.EnumValueDescriptorProto.newBuilder().setName(((String) (obj))).setNumber(integer.intValue()).build()));
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
			proto = ((DescriptorProtos.EnumValueDescriptorProto) (obj));
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
			fullName = (new StringBuilder()).append(enumdescriptor.getFullName()).append('.').append(((DescriptorProtos.EnumValueDescriptorProto) (obj)).getName()).toString();
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

	}

	public static final class FieldDescriptor extends GenericDescriptor
		implements Comparable, FieldSet.FieldDescriptorLite
	{

		private void crossLink()
			throws DescriptorValidationException
		{
			if(proto.hasExtendee())
		//*   0    0:aload_0         
		//*   1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//*   2    4:invokevirtual   #129 <Method boolean DescriptorProtos$FieldDescriptorProto.hasExtendee()>
		//*   3    7:ifeq            153
			{
				GenericDescriptor genericdescriptor = file.pool.lookupSymbol(proto.getExtendee(), ((GenericDescriptor) (this)), DescriptorPool.SearchFilter.TYPES_ONLY);
		//    4   10:aload_0         
		//    5   11:getfield        #91  <Field Descriptors$FileDescriptor file>
		//    6   14:invokestatic    #193 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//    7   17:aload_0         
		//    8   18:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    9   21:invokevirtual   #221 <Method String DescriptorProtos$FieldDescriptorProto.getExtendee()>
		//   10   24:aload_0         
		//   11   25:getstatic       #227 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.TYPES_ONLY>
		//   12   28:invokevirtual   #231 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.lookupSymbol(String, Descriptors$GenericDescriptor, Descriptors$DescriptorPool$SearchFilter)>
		//   13   31:astore_1        
				if(!(genericdescriptor instanceof Descriptor))
		//*  14   32:aload_1         
		//*  15   33:instanceof      #149 <Class Descriptors$Descriptor>
		//*  16   36:ifne            79
					throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append('"').append(proto.getExtendee()).append("\" is not a message type.").toString());
		//   17   39:new             #71  <Class Descriptors$DescriptorValidationException>
		//   18   42:dup             
		//   19   43:aload_0         
		//   20   44:new             #160 <Class StringBuilder>
		//   21   47:dup             
		//   22   48:invokespecial   #161 <Method void StringBuilder()>
		//   23   51:bipush          34
		//   24   53:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
		//   25   56:aload_0         
		//   26   57:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//   27   60:invokevirtual   #221 <Method String DescriptorProtos$FieldDescriptorProto.getExtendee()>
		//   28   63:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//   29   66:ldc1            #236 <String "\" is not a message type.">
		//   30   68:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//   31   71:invokevirtual   #171 <Method String StringBuilder.toString()>
		//   32   74:aconst_null     
		//   33   75:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   34   78:athrow          
				containingType = (Descriptor)genericdescriptor;
		//   35   79:aload_0         
		//   36   80:aload_1         
		//   37   81:checkcast       #149 <Class Descriptors$Descriptor>
		//   38   84:putfield        #133 <Field Descriptors$Descriptor containingType>
				if(!getContainingType().isExtensionNumber(getNumber()))
		//*  39   87:aload_0         
		//*  40   88:invokevirtual   #240 <Method Descriptors$Descriptor getContainingType()>
		//*  41   91:aload_0         
		//*  42   92:invokevirtual   #121 <Method int getNumber()>
		//*  43   95:invokevirtual   #244 <Method boolean Descriptors$Descriptor.isExtensionNumber(int)>
		//*  44   98:ifne            153
					throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append('"').append(getContainingType().getFullName()).append("\" does not declare ").append(getNumber()).append(" as an extension number.").toString());
		//   45  101:new             #71  <Class Descriptors$DescriptorValidationException>
		//   46  104:dup             
		//   47  105:aload_0         
		//   48  106:new             #160 <Class StringBuilder>
		//   49  109:dup             
		//   50  110:invokespecial   #161 <Method void StringBuilder()>
		//   51  113:bipush          34
		//   52  115:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
		//   53  118:aload_0         
		//   54  119:invokevirtual   #240 <Method Descriptors$Descriptor getContainingType()>
		//   55  122:invokevirtual   #247 <Method String Descriptors$Descriptor.getFullName()>
		//   56  125:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//   57  128:ldc1            #249 <String "\" does not declare ">
		//   58  130:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//   59  133:aload_0         
		//   60  134:invokevirtual   #121 <Method int getNumber()>
		//   61  137:invokevirtual   #252 <Method StringBuilder StringBuilder.append(int)>
		//   62  140:ldc1            #254 <String " as an extension number.">
		//   63  142:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//   64  145:invokevirtual   #171 <Method String StringBuilder.toString()>
		//   65  148:aconst_null     
		//   66  149:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   67  152:athrow          
			}
			if(proto.hasTypeName())
		//*  68  153:aload_0         
		//*  69  154:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//*  70  157:invokevirtual   #257 <Method boolean DescriptorProtos$FieldDescriptorProto.hasTypeName()>
		//*  71  160:ifeq            443
			{
				GenericDescriptor genericdescriptor1 = file.pool.lookupSymbol(proto.getTypeName(), ((GenericDescriptor) (this)), DescriptorPool.SearchFilter.TYPES_ONLY);
		//   72  163:aload_0         
		//   73  164:getfield        #91  <Field Descriptors$FileDescriptor file>
		//   74  167:invokestatic    #193 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//   75  170:aload_0         
		//   76  171:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//   77  174:invokevirtual   #260 <Method String DescriptorProtos$FieldDescriptorProto.getTypeName()>
		//   78  177:aload_0         
		//   79  178:getstatic       #227 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.TYPES_ONLY>
		//   80  181:invokevirtual   #231 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.lookupSymbol(String, Descriptors$GenericDescriptor, Descriptors$DescriptorPool$SearchFilter)>
		//   81  184:astore_1        
				if(!proto.hasType())
		//*  82  185:aload_0         
		//*  83  186:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//*  84  189:invokevirtual   #107 <Method boolean DescriptorProtos$FieldDescriptorProto.hasType()>
		//*  85  192:ifne            270
					if(genericdescriptor1 instanceof Descriptor)
		//*  86  195:aload_1         
		//*  87  196:instanceof      #149 <Class Descriptors$Descriptor>
		//*  88  199:ifeq            212
						type = Type.MESSAGE;
		//   89  202:aload_0         
		//   90  203:getstatic       #263 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.MESSAGE>
		//   91  206:putfield        #117 <Field Descriptors$FieldDescriptor$Type type>
					else
		//*  92  209:goto            270
					if(genericdescriptor1 instanceof EnumDescriptor)
		//*  93  212:aload_1         
		//*  94  213:instanceof      #265 <Class Descriptors$EnumDescriptor>
		//*  95  216:ifeq            229
						type = Type.ENUM;
		//   96  219:aload_0         
		//   97  220:getstatic       #268 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.ENUM>
		//   98  223:putfield        #117 <Field Descriptors$FieldDescriptor$Type type>
					else
		//*  99  226:goto            270
						throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append('"').append(proto.getTypeName()).append("\" is not a type.").toString());
		//  100  229:new             #71  <Class Descriptors$DescriptorValidationException>
		//  101  232:dup             
		//  102  233:aload_0         
		//  103  234:new             #160 <Class StringBuilder>
		//  104  237:dup             
		//  105  238:invokespecial   #161 <Method void StringBuilder()>
		//  106  241:bipush          34
		//  107  243:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
		//  108  246:aload_0         
		//  109  247:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//  110  250:invokevirtual   #260 <Method String DescriptorProtos$FieldDescriptorProto.getTypeName()>
		//  111  253:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  112  256:ldc2            #270 <String "\" is not a type.">
		//  113  259:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  114  262:invokevirtual   #171 <Method String StringBuilder.toString()>
		//  115  265:aconst_null     
		//  116  266:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  117  269:athrow          
				if(getJavaType() == JavaType.MESSAGE)
		//* 118  270:aload_0         
		//* 119  271:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
		//* 120  274:getstatic       #277 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//* 121  277:if_acmpne       358
				{
					if(!(genericdescriptor1 instanceof Descriptor))
		//* 122  280:aload_1         
		//* 123  281:instanceof      #149 <Class Descriptors$Descriptor>
		//* 124  284:ifne            327
						throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append('"').append(proto.getTypeName()).append("\" is not a message type.").toString());
		//  125  287:new             #71  <Class Descriptors$DescriptorValidationException>
		//  126  290:dup             
		//  127  291:aload_0         
		//  128  292:new             #160 <Class StringBuilder>
		//  129  295:dup             
		//  130  296:invokespecial   #161 <Method void StringBuilder()>
		//  131  299:bipush          34
		//  132  301:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
		//  133  304:aload_0         
		//  134  305:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//  135  308:invokevirtual   #260 <Method String DescriptorProtos$FieldDescriptorProto.getTypeName()>
		//  136  311:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  137  314:ldc1            #236 <String "\" is not a message type.">
		//  138  316:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  139  319:invokevirtual   #171 <Method String StringBuilder.toString()>
		//  140  322:aconst_null     
		//  141  323:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  142  326:athrow          
					messageType = (Descriptor)genericdescriptor1;
		//  143  327:aload_0         
		//  144  328:aload_1         
		//  145  329:checkcast       #149 <Class Descriptors$Descriptor>
		//  146  332:putfield        #279 <Field Descriptors$Descriptor messageType>
					if(proto.hasDefaultValue())
		//* 147  335:aload_0         
		//* 148  336:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 149  339:invokevirtual   #282 <Method boolean DescriptorProtos$FieldDescriptorProto.hasDefaultValue()>
		//* 150  342:ifeq            440
						throw new DescriptorValidationException(((GenericDescriptor) (this)), "Messages can't have default values.");
		//  151  345:new             #71  <Class Descriptors$DescriptorValidationException>
		//  152  348:dup             
		//  153  349:aload_0         
		//  154  350:ldc2            #284 <String "Messages can't have default values.">
		//  155  353:aconst_null     
		//  156  354:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  157  357:athrow          
				} else
				if(getJavaType() == JavaType.ENUM)
		//* 158  358:aload_0         
		//* 159  359:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
		//* 160  362:getstatic       #286 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
		//* 161  365:if_acmpne       427
				{
					if(!(genericdescriptor1 instanceof EnumDescriptor))
		//* 162  368:aload_1         
		//* 163  369:instanceof      #265 <Class Descriptors$EnumDescriptor>
		//* 164  372:ifne            416
						throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append('"').append(proto.getTypeName()).append("\" is not an enum type.").toString());
		//  165  375:new             #71  <Class Descriptors$DescriptorValidationException>
		//  166  378:dup             
		//  167  379:aload_0         
		//  168  380:new             #160 <Class StringBuilder>
		//  169  383:dup             
		//  170  384:invokespecial   #161 <Method void StringBuilder()>
		//  171  387:bipush          34
		//  172  389:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
		//  173  392:aload_0         
		//  174  393:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//  175  396:invokevirtual   #260 <Method String DescriptorProtos$FieldDescriptorProto.getTypeName()>
		//  176  399:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  177  402:ldc2            #288 <String "\" is not an enum type.">
		//  178  405:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  179  408:invokevirtual   #171 <Method String StringBuilder.toString()>
		//  180  411:aconst_null     
		//  181  412:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  182  415:athrow          
					enumType = (EnumDescriptor)genericdescriptor1;
		//  183  416:aload_0         
		//  184  417:aload_1         
		//  185  418:checkcast       #265 <Class Descriptors$EnumDescriptor>
		//  186  421:putfield        #290 <Field Descriptors$EnumDescriptor enumType>
				} else
		//* 187  424:goto            440
				{
					throw new DescriptorValidationException(((GenericDescriptor) (this)), "Field with primitive type has type_name.");
		//  188  427:new             #71  <Class Descriptors$DescriptorValidationException>
		//  189  430:dup             
		//  190  431:aload_0         
		//  191  432:ldc2            #292 <String "Field with primitive type has type_name.">
		//  192  435:aconst_null     
		//  193  436:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  194  439:athrow          
				}
			} else
		//* 195  440:goto            476
			if(getJavaType() == JavaType.MESSAGE || getJavaType() == JavaType.ENUM)
		//* 196  443:aload_0         
		//* 197  444:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
		//* 198  447:getstatic       #277 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//* 199  450:if_acmpeq       463
		//* 200  453:aload_0         
		//* 201  454:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
		//* 202  457:getstatic       #286 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
		//* 203  460:if_acmpne       476
				throw new DescriptorValidationException(((GenericDescriptor) (this)), "Field with message or enum type missing type_name.");
		//  204  463:new             #71  <Class Descriptors$DescriptorValidationException>
		//  205  466:dup             
		//  206  467:aload_0         
		//  207  468:ldc2            #294 <String "Field with message or enum type missing type_name.">
		//  208  471:aconst_null     
		//  209  472:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  210  475:athrow          
			if(proto.getOptions().getPacked() && !isPackable())
		//* 211  476:aload_0         
		//* 212  477:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 213  480:invokevirtual   #298 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldDescriptorProto.getOptions()>
		//* 214  483:invokevirtual   #303 <Method boolean DescriptorProtos$FieldOptions.getPacked()>
		//* 215  486:ifeq            509
		//* 216  489:aload_0         
		//* 217  490:invokevirtual   #306 <Method boolean isPackable()>
		//* 218  493:ifne            509
				throw new DescriptorValidationException(((GenericDescriptor) (this)), "[packed = true] can only be specified for repeated primitive fields.");
		//  219  496:new             #71  <Class Descriptors$DescriptorValidationException>
		//  220  499:dup             
		//  221  500:aload_0         
		//  222  501:ldc2            #308 <String "[packed = true] can only be specified for repeated primitive fields.">
		//  223  504:aconst_null     
		//  224  505:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  225  508:athrow          
			if(!proto.hasDefaultValue()) goto _L2; else goto _L1
		//  226  509:aload_0         
		//  227  510:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//  228  513:invokevirtual   #282 <Method boolean DescriptorProtos$FieldDescriptorProto.hasDefaultValue()>
		//  229  516:ifeq            1132
_L1:
			if(isRepeated())
		//* 230  519:aload_0         
		//* 231  520:invokevirtual   #311 <Method boolean isRepeated()>
		//* 232  523:ifeq            539
				throw new DescriptorValidationException(((GenericDescriptor) (this)), "Repeated fields cannot have default values.");
		//  233  526:new             #71  <Class Descriptors$DescriptorValidationException>
		//  234  529:dup             
		//  235  530:aload_0         
		//  236  531:ldc2            #313 <String "Repeated fields cannot have default values.">
		//  237  534:aconst_null     
		//  238  535:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  239  538:athrow          
			static class _cls1
			{

				static final int $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[];
				static final int $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[];

				static 
				{
					$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = new int[FieldDescriptor.JavaType.values().length];
				//    0    0:invokestatic    #19  <Method Descriptors$FieldDescriptor$JavaType[] Descriptors$FieldDescriptor$JavaType.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType>
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[FieldDescriptor.JavaType.ENUM.ordinal()] = 1;
				//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType>
				//    5   12:getstatic       #25  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
				//    6   15:invokevirtual   #29  <Method int Descriptors$FieldDescriptor$JavaType.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:goto            24
					catch(NoSuchFieldError nosuchfielderror) { }
				//   10   23:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[FieldDescriptor.JavaType.MESSAGE.ordinal()] = 2;
				//   11   24:getstatic       #21  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType>
				//   12   27:getstatic       #32  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
				//   13   30:invokevirtual   #29  <Method int Descriptors$FieldDescriptor$JavaType.ordinal()>
				//   14   33:iconst_2        
				//   15   34:iastore         
					}
				//*  16   35:goto            39
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   17   38:astore_0        
					$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = new int[FieldDescriptor.Type.values().length];
				//   18   39:invokestatic    #37  <Method Descriptors$FieldDescriptor$Type[] Descriptors$FieldDescriptor$Type.values()>
				//   19   42:arraylength     
				//   20   43:newarray        int[]
				//   21   45:putstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.INT32.ordinal()] = 1;
				//   22   48:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   23   51:getstatic       #43  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.INT32>
				//   24   54:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   25   57:iconst_1        
				//   26   58:iastore         
					}
				//*  27   59:goto            63
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   28   62:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SINT32.ordinal()] = 2;
				//   29   63:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   30   66:getstatic       #47  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.SINT32>
				//   31   69:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   32   72:iconst_2        
				//   33   73:iastore         
					}
				//*  34   74:goto            78
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   35   77:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
				//   36   78:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   37   81:getstatic       #50  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.SFIXED32>
				//   38   84:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   39   87:iconst_3        
				//   40   88:iastore         
					}
				//*  41   89:goto            93
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   42   92:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.UINT32.ordinal()] = 4;
				//   43   93:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   44   96:getstatic       #53  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.UINT32>
				//   45   99:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   46  102:iconst_4        
				//   47  103:iastore         
					}
				//*  48  104:goto            108
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   49  107:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FIXED32.ordinal()] = 5;
				//   50  108:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   51  111:getstatic       #56  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.FIXED32>
				//   52  114:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   53  117:iconst_5        
				//   54  118:iastore         
					}
				//*  55  119:goto            123
					catch(NoSuchFieldError nosuchfielderror6) { }
				//   56  122:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.INT64.ordinal()] = 6;
				//   57  123:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   58  126:getstatic       #59  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.INT64>
				//   59  129:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   60  132:bipush          6
				//   61  134:iastore         
					}
				//*  62  135:goto            139
					catch(NoSuchFieldError nosuchfielderror7) { }
				//   63  138:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SINT64.ordinal()] = 7;
				//   64  139:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   65  142:getstatic       #62  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.SINT64>
				//   66  145:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   67  148:bipush          7
				//   68  150:iastore         
					}
				//*  69  151:goto            155
					catch(NoSuchFieldError nosuchfielderror8) { }
				//   70  154:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SFIXED64.ordinal()] = 8;
				//   71  155:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   72  158:getstatic       #65  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.SFIXED64>
				//   73  161:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   74  164:bipush          8
				//   75  166:iastore         
					}
				//*  76  167:goto            171
					catch(NoSuchFieldError nosuchfielderror9) { }
				//   77  170:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.UINT64.ordinal()] = 9;
				//   78  171:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   79  174:getstatic       #68  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.UINT64>
				//   80  177:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   81  180:bipush          9
				//   82  182:iastore         
					}
				//*  83  183:goto            187
					catch(NoSuchFieldError nosuchfielderror10) { }
				//   84  186:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FIXED64.ordinal()] = 10;
				//   85  187:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   86  190:getstatic       #71  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.FIXED64>
				//   87  193:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   88  196:bipush          10
				//   89  198:iastore         
					}
				//*  90  199:goto            203
					catch(NoSuchFieldError nosuchfielderror11) { }
				//   91  202:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FLOAT.ordinal()] = 11;
				//   92  203:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//   93  206:getstatic       #74  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.FLOAT>
				//   94  209:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//   95  212:bipush          11
				//   96  214:iastore         
					}
				//*  97  215:goto            219
					catch(NoSuchFieldError nosuchfielderror12) { }
				//   98  218:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.DOUBLE.ordinal()] = 12;
				//   99  219:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//  100  222:getstatic       #77  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.DOUBLE>
				//  101  225:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//  102  228:bipush          12
				//  103  230:iastore         
					}
				//* 104  231:goto            235
					catch(NoSuchFieldError nosuchfielderror13) { }
				//  105  234:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.BOOL.ordinal()] = 13;
				//  106  235:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//  107  238:getstatic       #80  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.BOOL>
				//  108  241:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//  109  244:bipush          13
				//  110  246:iastore         
					}
				//* 111  247:goto            251
					catch(NoSuchFieldError nosuchfielderror14) { }
				//  112  250:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.STRING.ordinal()] = 14;
				//  113  251:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//  114  254:getstatic       #83  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.STRING>
				//  115  257:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//  116  260:bipush          14
				//  117  262:iastore         
					}
				//* 118  263:goto            267
					catch(NoSuchFieldError nosuchfielderror15) { }
				//  119  266:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.BYTES.ordinal()] = 15;
				//  120  267:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//  121  270:getstatic       #86  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.BYTES>
				//  122  273:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//  123  276:bipush          15
				//  124  278:iastore         
					}
				//* 125  279:goto            283
					catch(NoSuchFieldError nosuchfielderror16) { }
				//  126  282:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.ENUM.ordinal()] = 16;
				//  127  283:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//  128  286:getstatic       #88  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.ENUM>
				//  129  289:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//  130  292:bipush          16
				//  131  294:iastore         
					}
				//* 132  295:goto            299
					catch(NoSuchFieldError nosuchfielderror17) { }
				//  133  298:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
				//  134  299:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//  135  302:getstatic       #90  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.MESSAGE>
				//  136  305:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//  137  308:bipush          17
				//  138  310:iastore         
					}
				//* 139  311:goto            315
					catch(NoSuchFieldError nosuchfielderror18) { }
				//  140  314:astore_0        
					try
					{
						$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.GROUP.ordinal()] = 18;
				//  141  315:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
				//  142  318:getstatic       #93  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.GROUP>
				//  143  321:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
				//  144  324:bipush          18
				//  145  326:iastore         
				//  146  327:return          
					}
					catch(NoSuchFieldError nosuchfielderror19) { }
				//  147  328:astore_0        
				//* 148  329:return          
				}
			}

			_cls1..SwitchMap.com.google.protobuf.Descriptors.FieldDescriptor.Type[getType().ordinal()];
		//  240  539:getstatic       #319 <Field int[] Descriptors$1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
		//  241  542:aload_0         
		//  242  543:invokevirtual   #322 <Method Descriptors$FieldDescriptor$Type getType()>
		//  243  546:invokevirtual   #325 <Method int Descriptors$FieldDescriptor$Type.ordinal()>
		//  244  549:iaload          
			JVM INSTR tableswitch 1 18: default 1319
		//		               1 636
		//		               2 636
		//		               3 636
		//		               4 656
		//		               5 656
		//		               6 676
		//		               7 676
		//		               8 676
		//		               9 696
		//		               10 696
		//		               11 716
		//		               12 820
		//		               13 924
		//		               14 941
		//		               15 955
		//		               16 1007
		//		               17 1073
		//		               18 1073;
		//  245  550:tableswitch     1 18: default 1319
		//		               1 636
		//		               2 636
		//		               3 636
		//		               4 656
		//		               5 656
		//		               6 676
		//		               7 676
		//		               8 676
		//		               9 696
		//		               10 696
		//		               11 716
		//		               12 820
		//		               13 924
		//		               14 941
		//		               15 955
		//		               16 1007
		//		               17 1073
		//		               18 1073
			   goto _L3 _L4 _L4 _L4 _L5 _L5 _L6 _L6 _L6 _L7 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L14
_L3:
			break; /* Loop/switch isn't completed */
_L4:
			defaultValue = ((Object) (Integer.valueOf(TextFormat.parseInt32(proto.getDefaultValue()))));
		//  246  636:aload_0         
		//  247  637:aload_0         
		//  248  638:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//  249  641:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//  250  644:invokestatic    #334 <Method int TextFormat.parseInt32(String)>
		//  251  647:invokestatic    #339 <Method Integer Integer.valueOf(int)>
		//  252  650:putfield        #341 <Field Object defaultValue>
			break; /* Loop/switch isn't completed */
		//  253  653:goto            1086
_L5:
			TextFormat.InvalidEscapeSequenceException invalidescapesequenceexception;
			try
			{
				defaultValue = ((Object) (Integer.valueOf(TextFormat.parseUInt32(proto.getDefaultValue()))));
		//  254  656:aload_0         
		//  255  657:aload_0         
		//  256  658:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//  257  661:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//  258  664:invokestatic    #344 <Method int TextFormat.parseUInt32(String)>
		//  259  667:invokestatic    #339 <Method Integer Integer.valueOf(int)>
		//  260  670:putfield        #341 <Field Object defaultValue>
			}
		//* 261  673:goto            1086
		//* 262  676:aload_0         
		//* 263  677:aload_0         
		//* 264  678:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 265  681:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 266  684:invokestatic    #348 <Method long TextFormat.parseInt64(String)>
		//* 267  687:invokestatic    #353 <Method Long Long.valueOf(long)>
		//* 268  690:putfield        #341 <Field Object defaultValue>
		//* 269  693:goto            1086
		//* 270  696:aload_0         
		//* 271  697:aload_0         
		//* 272  698:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 273  701:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 274  704:invokestatic    #356 <Method long TextFormat.parseUInt64(String)>
		//* 275  707:invokestatic    #353 <Method Long Long.valueOf(long)>
		//* 276  710:putfield        #341 <Field Object defaultValue>
		//* 277  713:goto            1086
		//* 278  716:aload_0         
		//* 279  717:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 280  720:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 281  723:ldc2            #358 <String "inf">
		//* 282  726:invokevirtual   #364 <Method boolean String.equals(Object)>
		//* 283  729:ifeq            745
		//* 284  732:aload_0         
		//* 285  733:ldc2            #365 <Float (1.0F / 0.0F)>
		//* 286  736:invokestatic    #370 <Method Float Float.valueOf(float)>
		//* 287  739:putfield        #341 <Field Object defaultValue>
		//* 288  742:goto            1086
		//* 289  745:aload_0         
		//* 290  746:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 291  749:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 292  752:ldc2            #372 <String "-inf">
		//* 293  755:invokevirtual   #364 <Method boolean String.equals(Object)>
		//* 294  758:ifeq            774
		//* 295  761:aload_0         
		//* 296  762:ldc2            #373 <Float (-1.0F / 0.0F)>
		//* 297  765:invokestatic    #370 <Method Float Float.valueOf(float)>
		//* 298  768:putfield        #341 <Field Object defaultValue>
		//* 299  771:goto            1086
		//* 300  774:aload_0         
		//* 301  775:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 302  778:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 303  781:ldc2            #375 <String "nan">
		//* 304  784:invokevirtual   #364 <Method boolean String.equals(Object)>
		//* 305  787:ifeq            803
		//* 306  790:aload_0         
		//* 307  791:ldc2            #376 <Float (0.0F / 0.0F)>
		//* 308  794:invokestatic    #370 <Method Float Float.valueOf(float)>
		//* 309  797:putfield        #341 <Field Object defaultValue>
		//* 310  800:goto            1086
		//* 311  803:aload_0         
		//* 312  804:aload_0         
		//* 313  805:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 314  808:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 315  811:invokestatic    #379 <Method Float Float.valueOf(String)>
		//* 316  814:putfield        #341 <Field Object defaultValue>
		//* 317  817:goto            1086
		//* 318  820:aload_0         
		//* 319  821:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 320  824:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 321  827:ldc2            #358 <String "inf">
		//* 322  830:invokevirtual   #364 <Method boolean String.equals(Object)>
		//* 323  833:ifeq            849
		//* 324  836:aload_0         
		//* 325  837:ldc2w           #380 <Double (1.0D / 0.0D)>
		//* 326  840:invokestatic    #386 <Method Double Double.valueOf(double)>
		//* 327  843:putfield        #341 <Field Object defaultValue>
		//* 328  846:goto            1086
		//* 329  849:aload_0         
		//* 330  850:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 331  853:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 332  856:ldc2            #372 <String "-inf">
		//* 333  859:invokevirtual   #364 <Method boolean String.equals(Object)>
		//* 334  862:ifeq            878
		//* 335  865:aload_0         
		//* 336  866:ldc2w           #387 <Double (-1.0D / 0.0D)>
		//* 337  869:invokestatic    #386 <Method Double Double.valueOf(double)>
		//* 338  872:putfield        #341 <Field Object defaultValue>
		//* 339  875:goto            1086
		//* 340  878:aload_0         
		//* 341  879:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 342  882:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 343  885:ldc2            #375 <String "nan">
		//* 344  888:invokevirtual   #364 <Method boolean String.equals(Object)>
		//* 345  891:ifeq            907
		//* 346  894:aload_0         
		//* 347  895:ldc2w           #389 <Double (0.0D / 0.0D)>
		//* 348  898:invokestatic    #386 <Method Double Double.valueOf(double)>
		//* 349  901:putfield        #341 <Field Object defaultValue>
		//* 350  904:goto            1086
		//* 351  907:aload_0         
		//* 352  908:aload_0         
		//* 353  909:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 354  912:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 355  915:invokestatic    #393 <Method Double Double.valueOf(String)>
		//* 356  918:putfield        #341 <Field Object defaultValue>
		//* 357  921:goto            1086
		//* 358  924:aload_0         
		//* 359  925:aload_0         
		//* 360  926:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 361  929:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 362  932:invokestatic    #398 <Method Boolean Boolean.valueOf(String)>
		//* 363  935:putfield        #341 <Field Object defaultValue>
		//* 364  938:goto            1086
		//* 365  941:aload_0         
		//* 366  942:aload_0         
		//* 367  943:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 368  946:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 369  949:putfield        #341 <Field Object defaultValue>
		//* 370  952:goto            1086
		//* 371  955:aload_0         
		//* 372  956:aload_0         
		//* 373  957:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 374  960:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 375  963:invokestatic    #402 <Method ByteString TextFormat.unescapeBytes(CharSequence)>
		//* 376  966:putfield        #341 <Field Object defaultValue>
		//* 377  969:goto            1086
		//* 378  972:astore_1        
		//* 379  973:new             #71  <Class Descriptors$DescriptorValidationException>
		//* 380  976:dup             
		//* 381  977:aload_0         
		//* 382  978:new             #160 <Class StringBuilder>
		//* 383  981:dup             
		//* 384  982:invokespecial   #161 <Method void StringBuilder()>
		//* 385  985:ldc2            #404 <String "Couldn't parse default value: ">
		//* 386  988:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//* 387  991:aload_1         
		//* 388  992:invokevirtual   #407 <Method String TextFormat$InvalidEscapeSequenceException.getMessage()>
		//* 389  995:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//* 390  998:invokevirtual   #171 <Method String StringBuilder.toString()>
		//* 391 1001:aload_1         
		//* 392 1002:aconst_null     
		//* 393 1003:invokespecial   #410 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Throwable, Descriptors$1)>
		//* 394 1006:athrow          
		//* 395 1007:aload_0         
		//* 396 1008:aload_0         
		//* 397 1009:getfield        #290 <Field Descriptors$EnumDescriptor enumType>
		//* 398 1012:aload_0         
		//* 399 1013:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 400 1016:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 401 1019:invokevirtual   #414 <Method Descriptors$EnumValueDescriptor Descriptors$EnumDescriptor.findValueByName(String)>
		//* 402 1022:putfield        #341 <Field Object defaultValue>
		//* 403 1025:aload_0         
		//* 404 1026:getfield        #341 <Field Object defaultValue>
		//* 405 1029:ifnonnull       1086
		//* 406 1032:new             #71  <Class Descriptors$DescriptorValidationException>
		//* 407 1035:dup             
		//* 408 1036:aload_0         
		//* 409 1037:new             #160 <Class StringBuilder>
		//* 410 1040:dup             
		//* 411 1041:invokespecial   #161 <Method void StringBuilder()>
		//* 412 1044:ldc2            #416 <String "Unknown enum default value: \"">
		//* 413 1047:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//* 414 1050:aload_0         
		//* 415 1051:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//* 416 1054:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//* 417 1057:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//* 418 1060:bipush          34
		//* 419 1062:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
		//* 420 1065:invokevirtual   #171 <Method String StringBuilder.toString()>
		//* 421 1068:aconst_null     
		//* 422 1069:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//* 423 1072:athrow          
		//* 424 1073:new             #71  <Class Descriptors$DescriptorValidationException>
		//* 425 1076:dup             
		//* 426 1077:aload_0         
		//* 427 1078:ldc2            #418 <String "Message type had default value.">
		//* 428 1081:aconst_null     
		//* 429 1082:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//* 430 1085:athrow          
		//* 431 1086:goto            1230
			catch(NumberFormatException numberformatexception)
		//* 432 1089:astore_1        
			{
				throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append("Could not parse default value: \"").append(proto.getDefaultValue()).append('"').toString(), ((Throwable) (numberformatexception)), ((_cls1) (null)));
		//  433 1090:new             #71  <Class Descriptors$DescriptorValidationException>
		//  434 1093:dup             
		//  435 1094:aload_0         
		//  436 1095:new             #160 <Class StringBuilder>
		//  437 1098:dup             
		//  438 1099:invokespecial   #161 <Method void StringBuilder()>
		//  439 1102:ldc2            #420 <String "Could not parse default value: \"">
		//  440 1105:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  441 1108:aload_0         
		//  442 1109:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//  443 1112:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
		//  444 1115:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  445 1118:bipush          34
		//  446 1120:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
		//  447 1123:invokevirtual   #171 <Method String StringBuilder.toString()>
		//  448 1126:aload_1         
		//  449 1127:aconst_null     
		//  450 1128:invokespecial   #410 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Throwable, Descriptors$1)>
		//  451 1131:athrow          
			}
			break; /* Loop/switch isn't completed */
_L6:
			defaultValue = ((Object) (Long.valueOf(TextFormat.parseInt64(proto.getDefaultValue()))));
			break; /* Loop/switch isn't completed */
_L7:
			defaultValue = ((Object) (Long.valueOf(TextFormat.parseUInt64(proto.getDefaultValue()))));
			break; /* Loop/switch isn't completed */
_L8:
			if(proto.getDefaultValue().equals("inf"))
			{
				defaultValue = ((Object) (Float.valueOf((1.0F / 0.0F))));
				break; /* Loop/switch isn't completed */
			}
			if(proto.getDefaultValue().equals("-inf"))
			{
				defaultValue = ((Object) (Float.valueOf((-1.0F / 0.0F))));
				break; /* Loop/switch isn't completed */
			}
			if(proto.getDefaultValue().equals("nan"))
			{
				defaultValue = ((Object) (Float.valueOf((0.0F / 0.0F))));
				break; /* Loop/switch isn't completed */
			}
			defaultValue = ((Object) (Float.valueOf(proto.getDefaultValue())));
			break; /* Loop/switch isn't completed */
_L9:
			if(proto.getDefaultValue().equals("inf"))
			{
				defaultValue = ((Object) (Double.valueOf((1.0D / 0.0D))));
				break; /* Loop/switch isn't completed */
			}
			if(proto.getDefaultValue().equals("-inf"))
			{
				defaultValue = ((Object) (Double.valueOf((-1.0D / 0.0D))));
				break; /* Loop/switch isn't completed */
			}
			if(proto.getDefaultValue().equals("nan"))
			{
				defaultValue = ((Object) (Double.valueOf((0.0D / 0.0D))));
				break; /* Loop/switch isn't completed */
			}
			defaultValue = ((Object) (Double.valueOf(proto.getDefaultValue())));
			break; /* Loop/switch isn't completed */
_L10:
			defaultValue = ((Object) (Boolean.valueOf(proto.getDefaultValue())));
			break; /* Loop/switch isn't completed */
_L11:
			defaultValue = ((Object) (proto.getDefaultValue()));
			break; /* Loop/switch isn't completed */
_L12:
			defaultValue = ((Object) (TextFormat.unescapeBytes(((CharSequence) (proto.getDefaultValue())))));
			break; /* Loop/switch isn't completed */
			invalidescapesequenceexception;
			throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append("Couldn't parse default value: ").append(invalidescapesequenceexception.getMessage()).toString(), ((Throwable) (invalidescapesequenceexception)), ((_cls1) (null)));
_L13:
			defaultValue = ((Object) (enumType.findValueByName(proto.getDefaultValue())));
			if(defaultValue == null)
				throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append("Unknown enum default value: \"").append(proto.getDefaultValue()).append('"').toString(), ((_cls1) (null)));
			break; /* Loop/switch isn't completed */
_L14:
			throw new DescriptorValidationException(((GenericDescriptor) (this)), "Message type had default value.", ((_cls1) (null)));
_L2:
			if(isRepeated())
		//* 452 1132:aload_0         
		//* 453 1133:invokevirtual   #311 <Method boolean isRepeated()>
		//* 454 1136:ifeq            1149
				defaultValue = ((Object) (Collections.emptyList()));
		//  455 1139:aload_0         
		//  456 1140:invokestatic    #425 <Method List Collections.emptyList()>
		//  457 1143:putfield        #341 <Field Object defaultValue>
			else
		//* 458 1146:goto            1230
				switch(_cls1..SwitchMap.com.google.protobuf.Descriptors.FieldDescriptor.JavaType[getJavaType().ordinal()])
		//* 459 1149:getstatic       #428 <Field int[] Descriptors$1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType>
		//* 460 1152:aload_0         
		//* 461 1153:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
		//* 462 1156:invokevirtual   #429 <Method int Descriptors$FieldDescriptor$JavaType.ordinal()>
		//* 463 1159:iaload          
				{
		//* 464 1160:lookupswitch    2: default 1188
		//		               1: 1191
		//		               2: 1211
		//* 465 1188:goto            1219
				case 1: // '\001'
					defaultValue = enumType.getValues().get(0);
		//  466 1191:aload_0         
		//  467 1192:aload_0         
		//  468 1193:getfield        #290 <Field Descriptors$EnumDescriptor enumType>
		//  469 1196:invokevirtual   #432 <Method List Descriptors$EnumDescriptor.getValues()>
		//  470 1199:iconst_0        
		//  471 1200:invokeinterface #181 <Method Object List.get(int)>
		//  472 1205:putfield        #341 <Field Object defaultValue>
					break;

		//* 473 1208:goto            1230
				case 2: // '\002'
					defaultValue = null;
		//  474 1211:aload_0         
		//  475 1212:aconst_null     
		//  476 1213:putfield        #341 <Field Object defaultValue>
					break;

		//* 477 1216:goto            1230
				default:
					defaultValue = getJavaType().defaultDefault;
		//  478 1219:aload_0         
		//  479 1220:aload_0         
		//  480 1221:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
		//  481 1224:invokestatic    #436 <Method Object Descriptors$FieldDescriptor$JavaType.access$2300(Descriptors$FieldDescriptor$JavaType)>
		//  482 1227:putfield        #341 <Field Object defaultValue>
					break;
				}
			if(!isExtension())
		//* 483 1230:aload_0         
		//* 484 1231:invokevirtual   #439 <Method boolean isExtension()>
		//* 485 1234:ifne            1248
				file.pool.addFieldByNumber(this);
		//  486 1237:aload_0         
		//  487 1238:getfield        #91  <Field Descriptors$FileDescriptor file>
		//  488 1241:invokestatic    #193 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//  489 1244:aload_0         
		//  490 1245:invokevirtual   #442 <Method void Descriptors$DescriptorPool.addFieldByNumber(Descriptors$FieldDescriptor)>
			if(containingType != null && containingType.getOptions().getMessageSetWireFormat())
		//* 491 1248:aload_0         
		//* 492 1249:getfield        #133 <Field Descriptors$Descriptor containingType>
		//* 493 1252:ifnull          1318
		//* 494 1255:aload_0         
		//* 495 1256:getfield        #133 <Field Descriptors$Descriptor containingType>
		//* 496 1259:invokevirtual   #445 <Method DescriptorProtos$MessageOptions Descriptors$Descriptor.getOptions()>
		//* 497 1262:invokevirtual   #450 <Method boolean DescriptorProtos$MessageOptions.getMessageSetWireFormat()>
		//* 498 1265:ifeq            1318
				if(isExtension())
		//* 499 1268:aload_0         
		//* 500 1269:invokevirtual   #439 <Method boolean isExtension()>
		//* 501 1272:ifeq            1305
				{
					if(!isOptional() || getType() != Type.MESSAGE)
		//* 502 1275:aload_0         
		//* 503 1276:invokevirtual   #453 <Method boolean isOptional()>
		//* 504 1279:ifeq            1292
		//* 505 1282:aload_0         
		//* 506 1283:invokevirtual   #322 <Method Descriptors$FieldDescriptor$Type getType()>
		//* 507 1286:getstatic       #263 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.MESSAGE>
		//* 508 1289:if_acmpeq       1318
						throw new DescriptorValidationException(((GenericDescriptor) (this)), "Extensions of MessageSets must be optional messages.", ((_cls1) (null)));
		//  509 1292:new             #71  <Class Descriptors$DescriptorValidationException>
		//  510 1295:dup             
		//  511 1296:aload_0         
		//  512 1297:ldc2            #455 <String "Extensions of MessageSets must be optional messages.">
		//  513 1300:aconst_null     
		//  514 1301:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  515 1304:athrow          
				} else
				{
					throw new DescriptorValidationException(((GenericDescriptor) (this)), "MessageSets cannot have fields, only extensions.", ((_cls1) (null)));
		//  516 1305:new             #71  <Class Descriptors$DescriptorValidationException>
		//  517 1308:dup             
		//  518 1309:aload_0         
		//  519 1310:ldc2            #457 <String "MessageSets cannot have fields, only extensions.">
		//  520 1313:aconst_null     
		//  521 1314:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  522 1317:athrow          
				}
			return;
		//  523 1318:return          
		//* 524 1319:goto            1086
		}

		private static String fieldNameToJsonName(String s)
		{
			StringBuilder stringbuilder = new StringBuilder(s.length());
		//    0    0:new             #160 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokevirtual   #460 <Method int String.length()>
		//    4    8:invokespecial   #463 <Method void StringBuilder(int)>
		//    5   11:astore_3        
			boolean flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_1        
			for(int i = 0; i < s.length(); i++)
		//*   8   14:iconst_0        
		//*   9   15:istore_2        
		//*  10   16:iload_2         
		//*  11   17:aload_0         
		//*  12   18:invokevirtual   #460 <Method int String.length()>
		//*  13   21:icmpge          85
			{
				Character character = Character.valueOf(s.charAt(i));
		//   14   24:aload_0         
		//   15   25:iload_2         
		//   16   26:invokevirtual   #467 <Method char String.charAt(int)>
		//   17   29:invokestatic    #472 <Method Character Character.valueOf(char)>
		//   18   32:astore          4
				if(character.charValue() == '_')
		//*  19   34:aload           4
		//*  20   36:invokevirtual   #476 <Method char Character.charValue()>
		//*  21   39:bipush          95
		//*  22   41:icmpne          49
				{
					flag = true;
		//   23   44:iconst_1        
		//   24   45:istore_1        
					continue;
		//   25   46:goto            78
				}
				if(flag)
		//*  26   49:iload_1         
		//*  27   50:ifeq            71
				{
					stringbuilder.append(Character.toUpperCase(character.charValue()));
		//   28   53:aload_3         
		//   29   54:aload           4
		//   30   56:invokevirtual   #476 <Method char Character.charValue()>
		//   31   59:invokestatic    #480 <Method char Character.toUpperCase(char)>
		//   32   62:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
		//   33   65:pop             
					flag = false;
		//   34   66:iconst_0        
		//   35   67:istore_1        
				} else
		//*  36   68:goto            78
				{
					stringbuilder.append(((Object) (character)));
		//   37   71:aload_3         
		//   38   72:aload           4
		//   39   74:invokevirtual   #483 <Method StringBuilder StringBuilder.append(Object)>
		//   40   77:pop             
				}
			}

		//   41   78:iload_2         
		//   42   79:iconst_1        
		//   43   80:iadd            
		//   44   81:istore_2        
		//*  45   82:goto            16
			return stringbuilder.toString();
		//   46   85:aload_3         
		//   47   86:invokevirtual   #171 <Method String StringBuilder.toString()>
		//   48   89:areturn         
		}

		private void setProto(DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
		{
			proto = fielddescriptorproto;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    3    5:return          
		}

		public int compareTo(FieldDescriptor fielddescriptor)
		{
			if(fielddescriptor.containingType != containingType)
		//*   0    0:aload_1         
		//*   1    1:getfield        #133 <Field Descriptors$Descriptor containingType>
		//*   2    4:aload_0         
		//*   3    5:getfield        #133 <Field Descriptors$Descriptor containingType>
		//*   4    8:if_acmpeq       22
				throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
		//    5   11:new             #487 <Class IllegalArgumentException>
		//    6   14:dup             
		//    7   15:ldc2            #489 <String "FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.">
		//    8   18:invokespecial   #490 <Method void IllegalArgumentException(String)>
		//    9   21:athrow          
			else
				return getNumber() - fielddescriptor.getNumber();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #121 <Method int getNumber()>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #121 <Method int getNumber()>
		//   14   30:isub            
		//   15   31:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((FieldDescriptor)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class Descriptors$FieldDescriptor>
		//    3    5:invokevirtual   #493 <Method int compareTo(Descriptors$FieldDescriptor)>
		//    4    8:ireturn         
		}

		public OneofDescriptor getContainingOneof()
		{
			return containingOneof;
		//    0    0:aload_0         
		//    1    1:getfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
		//    2    4:areturn         
		}

		public Descriptor getContainingType()
		{
			return containingType;
		//    0    0:aload_0         
		//    1    1:getfield        #133 <Field Descriptors$Descriptor containingType>
		//    2    4:areturn         
		}

		public Object getDefaultValue()
		{
			if(getJavaType() == JavaType.MESSAGE)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
		//*   2    4:getstatic       #277 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//*   3    7:if_acmpne       21
				throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
		//    4   10:new             #498 <Class UnsupportedOperationException>
		//    5   13:dup             
		//    6   14:ldc2            #500 <String "FieldDescriptor.getDefaultValue() called on an embedded message field.">
		//    7   17:invokespecial   #501 <Method void UnsupportedOperationException(String)>
		//    8   20:athrow          
			else
				return defaultValue;
		//    9   21:aload_0         
		//   10   22:getfield        #341 <Field Object defaultValue>
		//   11   25:areturn         
		}

		public EnumDescriptor getEnumType()
		{
			if(getJavaType() != JavaType.ENUM)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
		//*   2    4:getstatic       #286 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
		//*   3    7:if_acmpeq       21
				throw new UnsupportedOperationException("This field is not of enum type.");
		//    4   10:new             #498 <Class UnsupportedOperationException>
		//    5   13:dup             
		//    6   14:ldc2            #505 <String "This field is not of enum type.">
		//    7   17:invokespecial   #501 <Method void UnsupportedOperationException(String)>
		//    8   20:athrow          
			else
				return enumType;
		//    9   21:aload_0         
		//   10   22:getfield        #290 <Field Descriptors$EnumDescriptor enumType>
		//   11   25:areturn         
		}

		public volatile Internal.EnumLiteMap getEnumType()
		{
			return ((Internal.EnumLiteMap) (getEnumType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #508 <Method Descriptors$EnumDescriptor getEnumType()>
		//    2    4:areturn         
		}

		public Descriptor getExtensionScope()
		{
			if(!isExtension())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #439 <Method boolean isExtension()>
		//*   2    4:ifne            18
				throw new UnsupportedOperationException("This field is not an extension.");
		//    3    7:new             #498 <Class UnsupportedOperationException>
		//    4   10:dup             
		//    5   11:ldc2            #511 <String "This field is not an extension.">
		//    6   14:invokespecial   #501 <Method void UnsupportedOperationException(String)>
		//    7   17:athrow          
			else
				return extensionScope;
		//    8   18:aload_0         
		//    9   19:getfield        #135 <Field Descriptors$Descriptor extensionScope>
		//   10   22:areturn         
		}

		public FileDescriptor getFile()
		{
			return file;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field Descriptors$FileDescriptor file>
		//    2    4:areturn         
		}

		public String getFullName()
		{
			return fullName;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field String fullName>
		//    2    4:areturn         
		}

		public int getIndex()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #75  <Field int index>
		//    2    4:ireturn         
		}

		public JavaType getJavaType()
		{
			return type.getJavaType();
		//    0    0:aload_0         
		//    1    1:getfield        #117 <Field Descriptors$FieldDescriptor$Type type>
		//    2    4:invokevirtual   #515 <Method Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$Type.getJavaType()>
		//    3    7:areturn         
		}

		public String getJsonName()
		{
			return jsonName;
		//    0    0:aload_0         
		//    1    1:getfield        #100 <Field String jsonName>
		//    2    4:areturn         
		}

		public WireFormat.JavaType getLiteJavaType()
		{
			return getLiteType().getJavaType();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #521 <Method WireFormat$FieldType getLiteType()>
		//    2    4:invokevirtual   #523 <Method WireFormat$JavaType WireFormat$FieldType.getJavaType()>
		//    3    7:areturn         
		}

		public WireFormat.FieldType getLiteType()
		{
			return table[type.ordinal()];
		//    0    0:getstatic       #51  <Field WireFormat$FieldType[] table>
		//    1    3:aload_0         
		//    2    4:getfield        #117 <Field Descriptors$FieldDescriptor$Type type>
		//    3    7:invokevirtual   #325 <Method int Descriptors$FieldDescriptor$Type.ordinal()>
		//    4   10:aaload          
		//    5   11:areturn         
		}

		public Descriptor getMessageType()
		{
			if(getJavaType() != JavaType.MESSAGE)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
		//*   2    4:getstatic       #277 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//*   3    7:if_acmpeq       21
				throw new UnsupportedOperationException("This field is not of message type.");
		//    4   10:new             #498 <Class UnsupportedOperationException>
		//    5   13:dup             
		//    6   14:ldc2            #526 <String "This field is not of message type.">
		//    7   17:invokespecial   #501 <Method void UnsupportedOperationException(String)>
		//    8   20:athrow          
			else
				return messageType;
		//    9   21:aload_0         
		//   10   22:getfield        #279 <Field Descriptors$Descriptor messageType>
		//   11   25:areturn         
		}

		public String getName()
		{
			return proto.getName();
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    2    4:invokevirtual   #83  <Method String DescriptorProtos$FieldDescriptorProto.getName()>
		//    3    7:areturn         
		}

		public int getNumber()
		{
			return proto.getNumber();
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    2    4:invokevirtual   #527 <Method int DescriptorProtos$FieldDescriptorProto.getNumber()>
		//    3    7:ireturn         
		}

		public DescriptorProtos.FieldOptions getOptions()
		{
			return proto.getOptions();
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    2    4:invokevirtual   #298 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldDescriptorProto.getOptions()>
		//    3    7:areturn         
		}

		public Type getType()
		{
			return type;
		//    0    0:aload_0         
		//    1    1:getfield        #117 <Field Descriptors$FieldDescriptor$Type type>
		//    2    4:areturn         
		}

		public boolean hasDefaultValue()
		{
			return proto.hasDefaultValue();
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    2    4:invokevirtual   #282 <Method boolean DescriptorProtos$FieldDescriptorProto.hasDefaultValue()>
		//    3    7:ireturn         
		}

		public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messagelite)
		{
			return ((MessageLite.Builder) (((Message.Builder)builder).mergeFrom((Message)messagelite)));
		//    0    0:aload_1         
		//    1    1:checkcast       #531 <Class Message$Builder>
		//    2    4:aload_2         
		//    3    5:checkcast       #533 <Class Message>
		//    4    8:invokeinterface #537 <Method Message$Builder Message$Builder.mergeFrom(Message)>
		//    5   13:areturn         
		}

		public boolean isExtension()
		{
			return proto.hasExtendee();
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    2    4:invokevirtual   #129 <Method boolean DescriptorProtos$FieldDescriptorProto.hasExtendee()>
		//    3    7:ireturn         
		}

		public boolean isMapField()
		{
			return getType() == Type.MESSAGE && isRepeated() && getMessageType().getOptions().getMapEntry();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #322 <Method Descriptors$FieldDescriptor$Type getType()>
		//    2    4:getstatic       #263 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.MESSAGE>
		//    3    7:if_acmpne       32
		//    4   10:aload_0         
		//    5   11:invokevirtual   #311 <Method boolean isRepeated()>
		//    6   14:ifeq            32
		//    7   17:aload_0         
		//    8   18:invokevirtual   #540 <Method Descriptors$Descriptor getMessageType()>
		//    9   21:invokevirtual   #445 <Method DescriptorProtos$MessageOptions Descriptors$Descriptor.getOptions()>
		//   10   24:invokevirtual   #543 <Method boolean DescriptorProtos$MessageOptions.getMapEntry()>
		//   11   27:ifeq            32
		//   12   30:iconst_1        
		//   13   31:ireturn         
		//   14   32:iconst_0        
		//   15   33:ireturn         
		}

		public boolean isOptional()
		{
			return proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    2    4:invokevirtual   #547 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto.getLabel()>
		//    3    7:getstatic       #553 <Field DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.LABEL_OPTIONAL>
		//    4   10:if_acmpne       15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public boolean isPackable()
		{
			return isRepeated() && getLiteType().isPackable();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #311 <Method boolean isRepeated()>
		//    2    4:ifeq            19
		//    3    7:aload_0         
		//    4    8:invokevirtual   #521 <Method WireFormat$FieldType getLiteType()>
		//    5   11:invokevirtual   #554 <Method boolean WireFormat$FieldType.isPackable()>
		//    6   14:ifeq            19
		//    7   17:iconst_1        
		//    8   18:ireturn         
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		public boolean isPacked()
		{
			if(!isPackable())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #306 <Method boolean isPackable()>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			if(getFile().getSyntax() == FileDescriptor.Syntax.PROTO2)
		//*   5    9:aload_0         
		//*   6   10:invokevirtual   #557 <Method Descriptors$FileDescriptor getFile()>
		//*   7   13:invokevirtual   #561 <Method Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor.getSyntax()>
		//*   8   16:getstatic       #567 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO2>
		//*   9   19:if_acmpne       30
				return getOptions().getPacked();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #568 <Method DescriptorProtos$FieldOptions getOptions()>
		//   12   26:invokevirtual   #303 <Method boolean DescriptorProtos$FieldOptions.getPacked()>
		//   13   29:ireturn         
			return !getOptions().hasPacked() || getOptions().getPacked();
		//   14   30:aload_0         
		//   15   31:invokevirtual   #568 <Method DescriptorProtos$FieldOptions getOptions()>
		//   16   34:invokevirtual   #571 <Method boolean DescriptorProtos$FieldOptions.hasPacked()>
		//   17   37:ifeq            50
		//   18   40:aload_0         
		//   19   41:invokevirtual   #568 <Method DescriptorProtos$FieldOptions getOptions()>
		//   20   44:invokevirtual   #303 <Method boolean DescriptorProtos$FieldOptions.getPacked()>
		//   21   47:ifeq            52
		//   22   50:iconst_1        
		//   23   51:ireturn         
		//   24   52:iconst_0        
		//   25   53:ireturn         
		}

		public boolean isRepeated()
		{
			return proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REPEATED;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    2    4:invokevirtual   #547 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto.getLabel()>
		//    3    7:getstatic       #574 <Field DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.LABEL_REPEATED>
		//    4   10:if_acmpne       15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public boolean isRequired()
		{
			return proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REQUIRED;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    2    4:invokevirtual   #547 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto.getLabel()>
		//    3    7:getstatic       #578 <Field DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.LABEL_REQUIRED>
		//    4   10:if_acmpne       15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public boolean needsUtf8Check()
		{
			if(type != Type.STRING)
		//*   0    0:aload_0         
		//*   1    1:getfield        #117 <Field Descriptors$FieldDescriptor$Type type>
		//*   2    4:getstatic       #582 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.STRING>
		//*   3    7:if_acmpeq       12
				return false;
		//    4   10:iconst_0        
		//    5   11:ireturn         
			if(getContainingType().getOptions().getMapEntry())
		//*   6   12:aload_0         
		//*   7   13:invokevirtual   #240 <Method Descriptors$Descriptor getContainingType()>
		//*   8   16:invokevirtual   #445 <Method DescriptorProtos$MessageOptions Descriptors$Descriptor.getOptions()>
		//*   9   19:invokevirtual   #543 <Method boolean DescriptorProtos$MessageOptions.getMapEntry()>
		//*  10   22:ifeq            27
				return true;
		//   11   25:iconst_1        
		//   12   26:ireturn         
			if(getFile().getSyntax() == FileDescriptor.Syntax.PROTO3)
		//*  13   27:aload_0         
		//*  14   28:invokevirtual   #557 <Method Descriptors$FileDescriptor getFile()>
		//*  15   31:invokevirtual   #561 <Method Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor.getSyntax()>
		//*  16   34:getstatic       #585 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO3>
		//*  17   37:if_acmpne       42
				return true;
		//   18   40:iconst_1        
		//   19   41:ireturn         
			else
				return getFile().getOptions().getJavaStringCheckUtf8();
		//   20   42:aload_0         
		//   21   43:invokevirtual   #557 <Method Descriptors$FileDescriptor getFile()>
		//   22   46:invokevirtual   #588 <Method DescriptorProtos$FileOptions Descriptors$FileDescriptor.getOptions()>
		//   23   49:invokevirtual   #593 <Method boolean DescriptorProtos$FileOptions.getJavaStringCheckUtf8()>
		//   24   52:ireturn         
		}

		public DescriptorProtos.FieldDescriptorProto toProto()
		{
			return proto;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		//    2    4:areturn         
		}

		public volatile Message toProto()
		{
			return ((Message) (toProto()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #597 <Method DescriptorProtos$FieldDescriptorProto toProto()>
		//    2    4:areturn         
		}

		public String toString()
		{
			return getFullName();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #598 <Method String getFullName()>
		//    2    4:areturn         
		}

		private static final WireFormat.FieldType table[] = WireFormat.FieldType.values();
		private OneofDescriptor containingOneof;
		private Descriptor containingType;
		private Object defaultValue;
		private EnumDescriptor enumType;
		private final Descriptor extensionScope;
		private final FileDescriptor file;
		private final String fullName;
		private final int index;
		private final String jsonName;
		private Descriptor messageType;
		private DescriptorProtos.FieldDescriptorProto proto;
		private Type type;

		static 
		{
		//    0    0:invokestatic    #49  <Method WireFormat$FieldType[] WireFormat$FieldType.values()>
		//    1    3:putstatic       #51  <Field WireFormat$FieldType[] table>
			if(Type.values().length != DescriptorProtos.FieldDescriptorProto.Type.values().length)
		//*   2    6:invokestatic    #54  <Method Descriptors$FieldDescriptor$Type[] Descriptors$FieldDescriptor$Type.values()>
		//*   3    9:arraylength     
		//*   4   10:invokestatic    #59  <Method DescriptorProtos$FieldDescriptorProto$Type[] DescriptorProtos$FieldDescriptorProto$Type.values()>
		//*   5   13:arraylength     
		//*   6   14:icmpeq          27
				throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
		//    7   17:new             #61  <Class RuntimeException>
		//    8   20:dup             
		//    9   21:ldc1            #63  <String "descriptor.proto has a new declared type but Descriptors.java wasn't updated.">
		//   10   23:invokespecial   #67  <Method void RuntimeException(String)>
		//   11   26:athrow          
		//   12   27:return          
		}


/*
		static void access$1300(FieldDescriptor fielddescriptor, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
		{
			fielddescriptor.setProto(fielddescriptorproto);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #209 <Method void setProto(DescriptorProtos$FieldDescriptorProto)>
			return;
		//    3    5:return          
		}

*/


/*
		static void access$900(FieldDescriptor fielddescriptor)
			throws DescriptorValidationException
		{
			fielddescriptor.crossLink();
		//    0    0:aload_0         
		//    1    1:invokespecial   #214 <Method void crossLink()>
			return;
		//    2    4:return          
		}

*/

		private FieldDescriptor(DescriptorProtos.FieldDescriptorProto fielddescriptorproto, FileDescriptor filedescriptor, Descriptor descriptor, int i, boolean flag)
			throws DescriptorValidationException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #73  <Method void Descriptors$GenericDescriptor()>
			index = i;
		//    2    4:aload_0         
		//    3    5:iload           4
		//    4    7:putfield        #75  <Field int index>
			proto = fielddescriptorproto;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
			fullName = Descriptors.computeFullName(filedescriptor, descriptor, fielddescriptorproto.getName());
		//    8   15:aload_0         
		//    9   16:aload_2         
		//   10   17:aload_3         
		//   11   18:aload_1         
		//   12   19:invokevirtual   #83  <Method String DescriptorProtos$FieldDescriptorProto.getName()>
		//   13   22:invokestatic    #87  <Method String Descriptors.access$1600(Descriptors$FileDescriptor, Descriptors$Descriptor, String)>
		//   14   25:putfield        #89  <Field String fullName>
			file = filedescriptor;
		//   15   28:aload_0         
		//   16   29:aload_2         
		//   17   30:putfield        #91  <Field Descriptors$FileDescriptor file>
			if(fielddescriptorproto.hasJsonName())
		//*  18   33:aload_1         
		//*  19   34:invokevirtual   #95  <Method boolean DescriptorProtos$FieldDescriptorProto.hasJsonName()>
		//*  20   37:ifeq            51
				jsonName = fielddescriptorproto.getJsonName();
		//   21   40:aload_0         
		//   22   41:aload_1         
		//   23   42:invokevirtual   #98  <Method String DescriptorProtos$FieldDescriptorProto.getJsonName()>
		//   24   45:putfield        #100 <Field String jsonName>
			else
		//*  25   48:goto            62
				jsonName = fieldNameToJsonName(fielddescriptorproto.getName());
		//   26   51:aload_0         
		//   27   52:aload_1         
		//   28   53:invokevirtual   #83  <Method String DescriptorProtos$FieldDescriptorProto.getName()>
		//   29   56:invokestatic    #104 <Method String fieldNameToJsonName(String)>
		//   30   59:putfield        #100 <Field String jsonName>
			if(fielddescriptorproto.hasType())
		//*  31   62:aload_1         
		//*  32   63:invokevirtual   #107 <Method boolean DescriptorProtos$FieldDescriptorProto.hasType()>
		//*  33   66:ifeq            80
				type = Type.valueOf(fielddescriptorproto.getType());
		//   34   69:aload_0         
		//   35   70:aload_1         
		//   36   71:invokevirtual   #111 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto.getType()>
		//   37   74:invokestatic    #115 <Method Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.valueOf(DescriptorProtos$FieldDescriptorProto$Type)>
		//   38   77:putfield        #117 <Field Descriptors$FieldDescriptor$Type type>
			if(getNumber() <= 0)
		//*  39   80:aload_0         
		//*  40   81:invokevirtual   #121 <Method int getNumber()>
		//*  41   84:ifgt            99
				throw new DescriptorValidationException(((GenericDescriptor) (this)), "Field numbers must be positive integers.");
		//   42   87:new             #71  <Class Descriptors$DescriptorValidationException>
		//   43   90:dup             
		//   44   91:aload_0         
		//   45   92:ldc1            #123 <String "Field numbers must be positive integers.">
		//   46   94:aconst_null     
		//   47   95:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   48   98:athrow          
			if(flag)
		//*  49   99:iload           5
		//*  50  101:ifeq            172
			{
				if(!fielddescriptorproto.hasExtendee())
		//*  51  104:aload_1         
		//*  52  105:invokevirtual   #129 <Method boolean DescriptorProtos$FieldDescriptorProto.hasExtendee()>
		//*  53  108:ifne            123
					throw new DescriptorValidationException(((GenericDescriptor) (this)), "FieldDescriptorProto.extendee not set for extension field.");
		//   54  111:new             #71  <Class Descriptors$DescriptorValidationException>
		//   55  114:dup             
		//   56  115:aload_0         
		//   57  116:ldc1            #131 <String "FieldDescriptorProto.extendee not set for extension field.">
		//   58  118:aconst_null     
		//   59  119:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   60  122:athrow          
				containingType = null;
		//   61  123:aload_0         
		//   62  124:aconst_null     
		//   63  125:putfield        #133 <Field Descriptors$Descriptor containingType>
				if(descriptor != null)
		//*  64  128:aload_3         
		//*  65  129:ifnull          140
					extensionScope = descriptor;
		//   66  132:aload_0         
		//   67  133:aload_3         
		//   68  134:putfield        #135 <Field Descriptors$Descriptor extensionScope>
				else
		//*  69  137:goto            145
					extensionScope = null;
		//   70  140:aload_0         
		//   71  141:aconst_null     
		//   72  142:putfield        #135 <Field Descriptors$Descriptor extensionScope>
				if(fielddescriptorproto.hasOneofIndex())
		//*  73  145:aload_1         
		//*  74  146:invokevirtual   #138 <Method boolean DescriptorProtos$FieldDescriptorProto.hasOneofIndex()>
		//*  75  149:ifeq            164
					throw new DescriptorValidationException(((GenericDescriptor) (this)), "FieldDescriptorProto.oneof_index set for extension field.");
		//   76  152:new             #71  <Class Descriptors$DescriptorValidationException>
		//   77  155:dup             
		//   78  156:aload_0         
		//   79  157:ldc1            #140 <String "FieldDescriptorProto.oneof_index set for extension field.">
		//   80  159:aconst_null     
		//   81  160:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   82  163:athrow          
				containingOneof = null;
		//   83  164:aload_0         
		//   84  165:aconst_null     
		//   85  166:putfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
			} else
		//*  86  169:goto            297
			{
				if(fielddescriptorproto.hasExtendee())
		//*  87  172:aload_1         
		//*  88  173:invokevirtual   #129 <Method boolean DescriptorProtos$FieldDescriptorProto.hasExtendee()>
		//*  89  176:ifeq            191
					throw new DescriptorValidationException(((GenericDescriptor) (this)), "FieldDescriptorProto.extendee set for non-extension field.");
		//   90  179:new             #71  <Class Descriptors$DescriptorValidationException>
		//   91  182:dup             
		//   92  183:aload_0         
		//   93  184:ldc1            #144 <String "FieldDescriptorProto.extendee set for non-extension field.">
		//   94  186:aconst_null     
		//   95  187:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//   96  190:athrow          
				containingType = descriptor;
		//   97  191:aload_0         
		//   98  192:aload_3         
		//   99  193:putfield        #133 <Field Descriptors$Descriptor containingType>
				if(fielddescriptorproto.hasOneofIndex())
		//* 100  196:aload_1         
		//* 101  197:invokevirtual   #138 <Method boolean DescriptorProtos$FieldDescriptorProto.hasOneofIndex()>
		//* 102  200:ifeq            287
				{
					if(fielddescriptorproto.getOneofIndex() < 0 || fielddescriptorproto.getOneofIndex() >= descriptor.toProto().getOneofDeclCount())
		//* 103  203:aload_1         
		//* 104  204:invokevirtual   #147 <Method int DescriptorProtos$FieldDescriptorProto.getOneofIndex()>
		//* 105  207:iflt            224
		//* 106  210:aload_1         
		//* 107  211:invokevirtual   #147 <Method int DescriptorProtos$FieldDescriptorProto.getOneofIndex()>
		//* 108  214:aload_3         
		//* 109  215:invokevirtual   #153 <Method DescriptorProtos$DescriptorProto Descriptors$Descriptor.toProto()>
		//* 110  218:invokevirtual   #158 <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
		//* 111  221:icmplt          256
						throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append("FieldDescriptorProto.oneof_index is out of range for type ").append(descriptor.getName()).toString());
		//  112  224:new             #71  <Class Descriptors$DescriptorValidationException>
		//  113  227:dup             
		//  114  228:aload_0         
		//  115  229:new             #160 <Class StringBuilder>
		//  116  232:dup             
		//  117  233:invokespecial   #161 <Method void StringBuilder()>
		//  118  236:ldc1            #163 <String "FieldDescriptorProto.oneof_index is out of range for type ">
		//  119  238:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  120  241:aload_3         
		//  121  242:invokevirtual   #168 <Method String Descriptors$Descriptor.getName()>
		//  122  245:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  123  248:invokevirtual   #171 <Method String StringBuilder.toString()>
		//  124  251:aconst_null     
		//  125  252:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
		//  126  255:athrow          
					containingOneof = (OneofDescriptor)descriptor.getOneofs().get(fielddescriptorproto.getOneofIndex());
		//  127  256:aload_0         
		//  128  257:aload_3         
		//  129  258:invokevirtual   #175 <Method List Descriptors$Descriptor.getOneofs()>
		//  130  261:aload_1         
		//  131  262:invokevirtual   #147 <Method int DescriptorProtos$FieldDescriptorProto.getOneofIndex()>
		//  132  265:invokeinterface #181 <Method Object List.get(int)>
		//  133  270:checkcast       #183 <Class Descriptors$OneofDescriptor>
		//  134  273:putfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
					int i = ((WireFormat.FieldType) (this)).values;
		//  135  276:aload_0         
		//  136  277:getfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
		//  137  280:invokestatic    #187 <Method int Descriptors$OneofDescriptor.access$1908(Descriptors$OneofDescriptor)>
		//  138  283:pop             
				} else
		//* 139  284:goto            292
				{
					containingOneof = null;
		//  140  287:aload_0         
		//  141  288:aconst_null     
		//  142  289:putfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
				}
				extensionScope = null;
		//  143  292:aload_0         
		//  144  293:aconst_null     
		//  145  294:putfield        #135 <Field Descriptors$Descriptor extensionScope>
			}
			filedescriptor.pool.addSymbol(((GenericDescriptor) (this)));
		//  146  297:aload_2         
		//  147  298:invokestatic    #193 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//  148  301:aload_0         
		//  149  302:invokevirtual   #199 <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
		//  150  305:return          
		}

	}

	public static final class FieldDescriptor.JavaType extends Enum
	{

		public static FieldDescriptor.JavaType valueOf(String s)
		{
			return (FieldDescriptor.JavaType)Enum.valueOf(com/google/protobuf/Descriptors$FieldDescriptor$JavaType, s);
		//    0    0:ldc1            #2   <Class Descriptors$FieldDescriptor$JavaType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #108 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Descriptors$FieldDescriptor$JavaType>
		//    4    9:areturn         
		}

		public static FieldDescriptor.JavaType[] values()
		{
			return (FieldDescriptor.JavaType[])((FieldDescriptor.JavaType []) ($VALUES)).clone();
		//    0    0:getstatic       #94  <Field Descriptors$FieldDescriptor$JavaType[] $VALUES>
		//    1    3:invokevirtual   #115 <Method Object _5B_Lcom.google.protobuf.Descriptors$FieldDescriptor$JavaType_3B_.clone()>
		//    2    6:checkcast       #111 <Class Descriptors$FieldDescriptor$JavaType[]>
		//    3    9:areturn         
		}

		private static final FieldDescriptor.JavaType $VALUES[];
		public static final FieldDescriptor.JavaType BOOLEAN;
		public static final FieldDescriptor.JavaType BYTE_STRING;
		public static final FieldDescriptor.JavaType DOUBLE;
		public static final FieldDescriptor.JavaType ENUM;
		public static final FieldDescriptor.JavaType FLOAT;
		public static final FieldDescriptor.JavaType INT;
		public static final FieldDescriptor.JavaType LONG;
		public static final FieldDescriptor.JavaType MESSAGE;
		public static final FieldDescriptor.JavaType STRING;
		private final Object defaultDefault;

		static 
		{
			INT = new FieldDescriptor.JavaType("INT", 0, ((Object) (Integer.valueOf(0))));
		//    0    0:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "INT">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//    6   11:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//    7   14:putstatic       #40  <Field Descriptors$FieldDescriptor$JavaType INT>
			LONG = new FieldDescriptor.JavaType("LONG", 1, ((Object) (Long.valueOf(0L))));
		//    8   17:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//    9   20:dup             
		//   10   21:ldc1            #41  <String "LONG">
		//   11   23:iconst_1        
		//   12   24:lconst_0        
		//   13   25:invokestatic    #46  <Method Long Long.valueOf(long)>
		//   14   28:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   15   31:putstatic       #48  <Field Descriptors$FieldDescriptor$JavaType LONG>
			FLOAT = new FieldDescriptor.JavaType("FLOAT", 2, ((Object) (Float.valueOf(0.0F))));
		//   16   34:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   17   37:dup             
		//   18   38:ldc1            #49  <String "FLOAT">
		//   19   40:iconst_2        
		//   20   41:fconst_0        
		//   21   42:invokestatic    #54  <Method Float Float.valueOf(float)>
		//   22   45:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   23   48:putstatic       #56  <Field Descriptors$FieldDescriptor$JavaType FLOAT>
			DOUBLE = new FieldDescriptor.JavaType("DOUBLE", 3, ((Object) (Double.valueOf(0.0D))));
		//   24   51:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   25   54:dup             
		//   26   55:ldc1            #57  <String "DOUBLE">
		//   27   57:iconst_3        
		//   28   58:dconst_0        
		//   29   59:invokestatic    #62  <Method Double Double.valueOf(double)>
		//   30   62:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   31   65:putstatic       #64  <Field Descriptors$FieldDescriptor$JavaType DOUBLE>
			BOOLEAN = new FieldDescriptor.JavaType("BOOLEAN", 4, ((Object) (Boolean.valueOf(false))));
		//   32   68:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   33   71:dup             
		//   34   72:ldc1            #65  <String "BOOLEAN">
		//   35   74:iconst_4        
		//   36   75:iconst_0        
		//   37   76:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
		//   38   79:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   39   82:putstatic       #72  <Field Descriptors$FieldDescriptor$JavaType BOOLEAN>
			STRING = new FieldDescriptor.JavaType("STRING", 5, "");
		//   40   85:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   41   88:dup             
		//   42   89:ldc1            #73  <String "STRING">
		//   43   91:iconst_5        
		//   44   92:ldc1            #75  <String "">
		//   45   94:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   46   97:putstatic       #77  <Field Descriptors$FieldDescriptor$JavaType STRING>
			BYTE_STRING = new FieldDescriptor.JavaType("BYTE_STRING", 6, ((Object) (ByteString.EMPTY)));
		//   47  100:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   48  103:dup             
		//   49  104:ldc1            #78  <String "BYTE_STRING">
		//   50  106:bipush          6
		//   51  108:getstatic       #84  <Field ByteString ByteString.EMPTY>
		//   52  111:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   53  114:putstatic       #86  <Field Descriptors$FieldDescriptor$JavaType BYTE_STRING>
			ENUM = new FieldDescriptor.JavaType("ENUM", 7, ((Object) (null)));
		//   54  117:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   55  120:dup             
		//   56  121:ldc1            #87  <String "ENUM">
		//   57  123:bipush          7
		//   58  125:aconst_null     
		//   59  126:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   60  129:putstatic       #89  <Field Descriptors$FieldDescriptor$JavaType ENUM>
			MESSAGE = new FieldDescriptor.JavaType("MESSAGE", 8, ((Object) (null)));
		//   61  132:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   62  135:dup             
		//   63  136:ldc1            #90  <String "MESSAGE">
		//   64  138:bipush          8
		//   65  140:aconst_null     
		//   66  141:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   67  144:putstatic       #92  <Field Descriptors$FieldDescriptor$JavaType MESSAGE>
			$VALUES = (new FieldDescriptor.JavaType[] {
				INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE
			});
		//   68  147:bipush          9
		//   69  149:anewarray       FieldDescriptor.JavaType[]
		//   70  152:dup             
		//   71  153:iconst_0        
		//   72  154:getstatic       #40  <Field Descriptors$FieldDescriptor$JavaType INT>
		//   73  157:aastore         
		//   74  158:dup             
		//   75  159:iconst_1        
		//   76  160:getstatic       #48  <Field Descriptors$FieldDescriptor$JavaType LONG>
		//   77  163:aastore         
		//   78  164:dup             
		//   79  165:iconst_2        
		//   80  166:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType FLOAT>
		//   81  169:aastore         
		//   82  170:dup             
		//   83  171:iconst_3        
		//   84  172:getstatic       #64  <Field Descriptors$FieldDescriptor$JavaType DOUBLE>
		//   85  175:aastore         
		//   86  176:dup             
		//   87  177:iconst_4        
		//   88  178:getstatic       #72  <Field Descriptors$FieldDescriptor$JavaType BOOLEAN>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:iconst_5        
		//   92  184:getstatic       #77  <Field Descriptors$FieldDescriptor$JavaType STRING>
		//   93  187:aastore         
		//   94  188:dup             
		//   95  189:bipush          6
		//   96  191:getstatic       #86  <Field Descriptors$FieldDescriptor$JavaType BYTE_STRING>
		//   97  194:aastore         
		//   98  195:dup             
		//   99  196:bipush          7
		//  100  198:getstatic       #89  <Field Descriptors$FieldDescriptor$JavaType ENUM>
		//  101  201:aastore         
		//  102  202:dup             
		//  103  203:bipush          8
		//  104  205:getstatic       #92  <Field Descriptors$FieldDescriptor$JavaType MESSAGE>
		//  105  208:aastore         
		//  106  209:putstatic       #94  <Field Descriptors$FieldDescriptor$JavaType[] $VALUES>
		//* 107  212:return          
		}


/*
		static Object access$2300(FieldDescriptor.JavaType javatype)
		{
			return javatype.defaultDefault;
		//    0    0:aload_0         
		//    1    1:getfield        #100 <Field Object defaultDefault>
		//    2    4:areturn         
		}

*/

		private FieldDescriptor.JavaType(String s, int i, Object obj)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #98  <Method void Enum(String, int)>
			defaultDefault = obj;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #100 <Field Object defaultDefault>
		//    7   11:return          
		}
	}

	public static final class FieldDescriptor.Type extends Enum
	{

		public static FieldDescriptor.Type valueOf(DescriptorProtos.FieldDescriptorProto.Type type)
		{
			return values()[type.getNumber() - 1];
		//    0    0:invokestatic    #134 <Method Descriptors$FieldDescriptor$Type[] values()>
		//    1    3:aload_0         
		//    2    4:invokevirtual   #140 <Method int DescriptorProtos$FieldDescriptorProto$Type.getNumber()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:aaload          
		//    6   10:areturn         
		}

		public static FieldDescriptor.Type valueOf(String s)
		{
			return (FieldDescriptor.Type)Enum.valueOf(com/google/protobuf/Descriptors$FieldDescriptor$Type, s);
		//    0    0:ldc1            #2   <Class Descriptors$FieldDescriptor$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #144 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Descriptors$FieldDescriptor$Type>
		//    4    9:areturn         
		}

		public static FieldDescriptor.Type[] values()
		{
			return (FieldDescriptor.Type[])((FieldDescriptor.Type []) ($VALUES)).clone();
		//    0    0:getstatic       #120 <Field Descriptors$FieldDescriptor$Type[] $VALUES>
		//    1    3:invokevirtual   #149 <Method Object _5B_Lcom.google.protobuf.Descriptors$FieldDescriptor$Type_3B_.clone()>
		//    2    6:checkcast       #145 <Class Descriptors$FieldDescriptor$Type[]>
		//    3    9:areturn         
		}

		public FieldDescriptor.JavaType getJavaType()
		{
			return javaType;
		//    0    0:aload_0         
		//    1    1:getfield        #126 <Field Descriptors$FieldDescriptor$JavaType javaType>
		//    2    4:areturn         
		}

		public DescriptorProtos.FieldDescriptorProto.Type toProto()
		{
			return DescriptorProtos.FieldDescriptorProto.Type.forNumber(ordinal() + 1);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #156 <Method int ordinal()>
		//    2    4:iconst_1        
		//    3    5:iadd            
		//    4    6:invokestatic    #160 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.forNumber(int)>
		//    5    9:areturn         
		}

		private static final FieldDescriptor.Type $VALUES[];
		public static final FieldDescriptor.Type BOOL;
		public static final FieldDescriptor.Type BYTES;
		public static final FieldDescriptor.Type DOUBLE;
		public static final FieldDescriptor.Type ENUM;
		public static final FieldDescriptor.Type FIXED32;
		public static final FieldDescriptor.Type FIXED64;
		public static final FieldDescriptor.Type FLOAT;
		public static final FieldDescriptor.Type GROUP;
		public static final FieldDescriptor.Type INT32;
		public static final FieldDescriptor.Type INT64;
		public static final FieldDescriptor.Type MESSAGE;
		public static final FieldDescriptor.Type SFIXED32;
		public static final FieldDescriptor.Type SFIXED64;
		public static final FieldDescriptor.Type SINT32;
		public static final FieldDescriptor.Type SINT64;
		public static final FieldDescriptor.Type STRING;
		public static final FieldDescriptor.Type UINT32;
		public static final FieldDescriptor.Type UINT64;
		private FieldDescriptor.JavaType javaType;

		static 
		{
			DOUBLE = new FieldDescriptor.Type("DOUBLE", 0, FieldDescriptor.JavaType.DOUBLE);
		//    0    0:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//    1    3:dup             
		//    2    4:ldc1            #37  <String "DOUBLE">
		//    3    6:iconst_0        
		//    4    7:getstatic       #41  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.DOUBLE>
		//    5   10:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//    6   13:putstatic       #47  <Field Descriptors$FieldDescriptor$Type DOUBLE>
			FLOAT = new FieldDescriptor.Type("FLOAT", 1, FieldDescriptor.JavaType.FLOAT);
		//    7   16:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//    8   19:dup             
		//    9   20:ldc1            #48  <String "FLOAT">
		//   10   22:iconst_1        
		//   11   23:getstatic       #50  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.FLOAT>
		//   12   26:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   13   29:putstatic       #52  <Field Descriptors$FieldDescriptor$Type FLOAT>
			INT64 = new FieldDescriptor.Type("INT64", 2, FieldDescriptor.JavaType.LONG);
		//   14   32:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   15   35:dup             
		//   16   36:ldc1            #53  <String "INT64">
		//   17   38:iconst_2        
		//   18   39:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//   19   42:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   20   45:putstatic       #58  <Field Descriptors$FieldDescriptor$Type INT64>
			UINT64 = new FieldDescriptor.Type("UINT64", 3, FieldDescriptor.JavaType.LONG);
		//   21   48:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   22   51:dup             
		//   23   52:ldc1            #59  <String "UINT64">
		//   24   54:iconst_3        
		//   25   55:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//   26   58:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   27   61:putstatic       #61  <Field Descriptors$FieldDescriptor$Type UINT64>
			INT32 = new FieldDescriptor.Type("INT32", 4, FieldDescriptor.JavaType.INT);
		//   28   64:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   29   67:dup             
		//   30   68:ldc1            #62  <String "INT32">
		//   31   70:iconst_4        
		//   32   71:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//   33   74:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   34   77:putstatic       #67  <Field Descriptors$FieldDescriptor$Type INT32>
			FIXED64 = new FieldDescriptor.Type("FIXED64", 5, FieldDescriptor.JavaType.LONG);
		//   35   80:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   36   83:dup             
		//   37   84:ldc1            #68  <String "FIXED64">
		//   38   86:iconst_5        
		//   39   87:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//   40   90:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   41   93:putstatic       #70  <Field Descriptors$FieldDescriptor$Type FIXED64>
			FIXED32 = new FieldDescriptor.Type("FIXED32", 6, FieldDescriptor.JavaType.INT);
		//   42   96:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   43   99:dup             
		//   44  100:ldc1            #71  <String "FIXED32">
		//   45  102:bipush          6
		//   46  104:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//   47  107:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   48  110:putstatic       #73  <Field Descriptors$FieldDescriptor$Type FIXED32>
			BOOL = new FieldDescriptor.Type("BOOL", 7, FieldDescriptor.JavaType.BOOLEAN);
		//   49  113:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   50  116:dup             
		//   51  117:ldc1            #74  <String "BOOL">
		//   52  119:bipush          7
		//   53  121:getstatic       #77  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.BOOLEAN>
		//   54  124:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   55  127:putstatic       #79  <Field Descriptors$FieldDescriptor$Type BOOL>
			STRING = new FieldDescriptor.Type("STRING", 8, FieldDescriptor.JavaType.STRING);
		//   56  130:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   57  133:dup             
		//   58  134:ldc1            #80  <String "STRING">
		//   59  136:bipush          8
		//   60  138:getstatic       #82  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.STRING>
		//   61  141:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   62  144:putstatic       #84  <Field Descriptors$FieldDescriptor$Type STRING>
			GROUP = new FieldDescriptor.Type("GROUP", 9, FieldDescriptor.JavaType.MESSAGE);
		//   63  147:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   64  150:dup             
		//   65  151:ldc1            #85  <String "GROUP">
		//   66  153:bipush          9
		//   67  155:getstatic       #87  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//   68  158:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   69  161:putstatic       #89  <Field Descriptors$FieldDescriptor$Type GROUP>
			MESSAGE = new FieldDescriptor.Type("MESSAGE", 10, FieldDescriptor.JavaType.MESSAGE);
		//   70  164:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   71  167:dup             
		//   72  168:ldc1            #90  <String "MESSAGE">
		//   73  170:bipush          10
		//   74  172:getstatic       #87  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//   75  175:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   76  178:putstatic       #92  <Field Descriptors$FieldDescriptor$Type MESSAGE>
			BYTES = new FieldDescriptor.Type("BYTES", 11, FieldDescriptor.JavaType.BYTE_STRING);
		//   77  181:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   78  184:dup             
		//   79  185:ldc1            #93  <String "BYTES">
		//   80  187:bipush          11
		//   81  189:getstatic       #96  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.BYTE_STRING>
		//   82  192:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   83  195:putstatic       #98  <Field Descriptors$FieldDescriptor$Type BYTES>
			UINT32 = new FieldDescriptor.Type("UINT32", 12, FieldDescriptor.JavaType.INT);
		//   84  198:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   85  201:dup             
		//   86  202:ldc1            #99  <String "UINT32">
		//   87  204:bipush          12
		//   88  206:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//   89  209:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   90  212:putstatic       #101 <Field Descriptors$FieldDescriptor$Type UINT32>
			ENUM = new FieldDescriptor.Type("ENUM", 13, FieldDescriptor.JavaType.ENUM);
		//   91  215:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   92  218:dup             
		//   93  219:ldc1            #102 <String "ENUM">
		//   94  221:bipush          13
		//   95  223:getstatic       #104 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
		//   96  226:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   97  229:putstatic       #106 <Field Descriptors$FieldDescriptor$Type ENUM>
			SFIXED32 = new FieldDescriptor.Type("SFIXED32", 14, FieldDescriptor.JavaType.INT);
		//   98  232:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   99  235:dup             
		//  100  236:ldc1            #107 <String "SFIXED32">
		//  101  238:bipush          14
		//  102  240:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//  103  243:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//  104  246:putstatic       #109 <Field Descriptors$FieldDescriptor$Type SFIXED32>
			SFIXED64 = new FieldDescriptor.Type("SFIXED64", 15, FieldDescriptor.JavaType.LONG);
		//  105  249:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//  106  252:dup             
		//  107  253:ldc1            #110 <String "SFIXED64">
		//  108  255:bipush          15
		//  109  257:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//  110  260:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//  111  263:putstatic       #112 <Field Descriptors$FieldDescriptor$Type SFIXED64>
			SINT32 = new FieldDescriptor.Type("SINT32", 16, FieldDescriptor.JavaType.INT);
		//  112  266:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//  113  269:dup             
		//  114  270:ldc1            #113 <String "SINT32">
		//  115  272:bipush          16
		//  116  274:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//  117  277:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//  118  280:putstatic       #115 <Field Descriptors$FieldDescriptor$Type SINT32>
			SINT64 = new FieldDescriptor.Type("SINT64", 17, FieldDescriptor.JavaType.LONG);
		//  119  283:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//  120  286:dup             
		//  121  287:ldc1            #116 <String "SINT64">
		//  122  289:bipush          17
		//  123  291:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//  124  294:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//  125  297:putstatic       #118 <Field Descriptors$FieldDescriptor$Type SINT64>
			$VALUES = (new FieldDescriptor.Type[] {
				DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, 
				MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64
			});
		//  126  300:bipush          18
		//  127  302:anewarray       FieldDescriptor.Type[]
		//  128  305:dup             
		//  129  306:iconst_0        
		//  130  307:getstatic       #47  <Field Descriptors$FieldDescriptor$Type DOUBLE>
		//  131  310:aastore         
		//  132  311:dup             
		//  133  312:iconst_1        
		//  134  313:getstatic       #52  <Field Descriptors$FieldDescriptor$Type FLOAT>
		//  135  316:aastore         
		//  136  317:dup             
		//  137  318:iconst_2        
		//  138  319:getstatic       #58  <Field Descriptors$FieldDescriptor$Type INT64>
		//  139  322:aastore         
		//  140  323:dup             
		//  141  324:iconst_3        
		//  142  325:getstatic       #61  <Field Descriptors$FieldDescriptor$Type UINT64>
		//  143  328:aastore         
		//  144  329:dup             
		//  145  330:iconst_4        
		//  146  331:getstatic       #67  <Field Descriptors$FieldDescriptor$Type INT32>
		//  147  334:aastore         
		//  148  335:dup             
		//  149  336:iconst_5        
		//  150  337:getstatic       #70  <Field Descriptors$FieldDescriptor$Type FIXED64>
		//  151  340:aastore         
		//  152  341:dup             
		//  153  342:bipush          6
		//  154  344:getstatic       #73  <Field Descriptors$FieldDescriptor$Type FIXED32>
		//  155  347:aastore         
		//  156  348:dup             
		//  157  349:bipush          7
		//  158  351:getstatic       #79  <Field Descriptors$FieldDescriptor$Type BOOL>
		//  159  354:aastore         
		//  160  355:dup             
		//  161  356:bipush          8
		//  162  358:getstatic       #84  <Field Descriptors$FieldDescriptor$Type STRING>
		//  163  361:aastore         
		//  164  362:dup             
		//  165  363:bipush          9
		//  166  365:getstatic       #89  <Field Descriptors$FieldDescriptor$Type GROUP>
		//  167  368:aastore         
		//  168  369:dup             
		//  169  370:bipush          10
		//  170  372:getstatic       #92  <Field Descriptors$FieldDescriptor$Type MESSAGE>
		//  171  375:aastore         
		//  172  376:dup             
		//  173  377:bipush          11
		//  174  379:getstatic       #98  <Field Descriptors$FieldDescriptor$Type BYTES>
		//  175  382:aastore         
		//  176  383:dup             
		//  177  384:bipush          12
		//  178  386:getstatic       #101 <Field Descriptors$FieldDescriptor$Type UINT32>
		//  179  389:aastore         
		//  180  390:dup             
		//  181  391:bipush          13
		//  182  393:getstatic       #106 <Field Descriptors$FieldDescriptor$Type ENUM>
		//  183  396:aastore         
		//  184  397:dup             
		//  185  398:bipush          14
		//  186  400:getstatic       #109 <Field Descriptors$FieldDescriptor$Type SFIXED32>
		//  187  403:aastore         
		//  188  404:dup             
		//  189  405:bipush          15
		//  190  407:getstatic       #112 <Field Descriptors$FieldDescriptor$Type SFIXED64>
		//  191  410:aastore         
		//  192  411:dup             
		//  193  412:bipush          16
		//  194  414:getstatic       #115 <Field Descriptors$FieldDescriptor$Type SINT32>
		//  195  417:aastore         
		//  196  418:dup             
		//  197  419:bipush          17
		//  198  421:getstatic       #118 <Field Descriptors$FieldDescriptor$Type SINT64>
		//  199  424:aastore         
		//  200  425:putstatic       #120 <Field Descriptors$FieldDescriptor$Type[] $VALUES>
		//* 201  428:return          
		}

		private FieldDescriptor.Type(String s, int i, FieldDescriptor.JavaType javatype)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #124 <Method void Enum(String, int)>
			javaType = javatype;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #126 <Field Descriptors$FieldDescriptor$JavaType javaType>
		//    7   11:return          
		}
	}

	public static final class FileDescriptor extends GenericDescriptor
	{

		public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto filedescriptorproto, FileDescriptor afiledescriptor[])
			throws DescriptorValidationException
		{
			return buildFrom(filedescriptorproto, afiledescriptor, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:invokestatic    #225 <Method Descriptors$FileDescriptor buildFrom(DescriptorProtos$FileDescriptorProto, Descriptors$FileDescriptor[], boolean)>
		//    4    6:areturn         
		}

		public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto filedescriptorproto, FileDescriptor afiledescriptor[], boolean flag)
			throws DescriptorValidationException
		{
			filedescriptorproto = ((DescriptorProtos.FileDescriptorProto) (new FileDescriptor(filedescriptorproto, afiledescriptor, new DescriptorPool(afiledescriptor, flag), flag)));
		//    0    0:new             #2   <Class Descriptors$FileDescriptor>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:new             #118 <Class Descriptors$DescriptorPool>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:iload_2         
		//    8   12:invokespecial   #184 <Method void Descriptors$DescriptorPool(Descriptors$FileDescriptor[], boolean)>
		//    9   15:iload_2         
		//   10   16:invokespecial   #227 <Method void Descriptors$FileDescriptor(DescriptorProtos$FileDescriptorProto, Descriptors$FileDescriptor[], Descriptors$DescriptorPool, boolean)>
		//   11   19:astore_0        
			((FileDescriptor) (filedescriptorproto)).crossLink();
		//   12   20:aload_0         
		//   13   21:invokespecial   #230 <Method void crossLink()>
			return ((FileDescriptor) (filedescriptorproto));
		//   14   24:aload_0         
		//   15   25:areturn         
		}

		private void crossLink()
			throws DescriptorValidationException
		{
			Object aobj[] = ((Object []) (messageTypes));
		//    0    0:aload_0         
		//    1    1:getfield        #129 <Field Descriptors$Descriptor[] messageTypes>
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
		//   14   18:invokestatic    #234 <Method void Descriptors$Descriptor.access$700(Descriptors$Descriptor)>

		//   15   21:iload_1         
		//   16   22:iconst_1        
		//   17   23:iadd            
		//   18   24:istore_1        
		//*  19   25:goto            10
			aobj = ((Object []) (services));
		//   20   28:aload_0         
		//   21   29:getfield        #157 <Field Descriptors$ServiceDescriptor[] services>
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
				aobj[j].crossLink();
		//   31   43:aload_3         
		//   32   44:iload_1         
		//   33   45:aaload          
		//   34   46:invokestatic    #238 <Method void Descriptors$ServiceDescriptor.access$800(Descriptors$ServiceDescriptor)>

		//   35   49:iload_1         
		//   36   50:iconst_1        
		//   37   51:iadd            
		//   38   52:istore_1        
		//*  39   53:goto            38
			aobj = ((Object []) (extensions));
		//   40   56:aload_0         
		//   41   57:getfield        #171 <Field Descriptors$FieldDescriptor[] extensions>
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
				aobj[k].crossLink();
		//   51   71:aload_3         
		//   52   72:iload_1         
		//   53   73:aaload          
		//   54   74:invokestatic    #242 <Method void Descriptors$FieldDescriptor.access$900(Descriptors$FieldDescriptor)>

		//   55   77:iload_1         
		//   56   78:iconst_1        
		//   57   79:iadd            
		//   58   80:istore_1        
		//*  59   81:goto            66
		//   60   84:return          
		}

		public static void internalBuildGeneratedFileFrom(String as[], Class class1, String as1[], String as2[], InternalDescriptorAssigner internaldescriptorassigner)
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #59  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void ArrayList()>
		//    3    7:astore          6
			for(int i = 0; i < as1.length; i++)
		//*   4    9:iconst_0        
		//*   5   10:istore          5
		//*   6   12:iload           5
		//*   7   14:aload_2         
		//*   8   15:arraylength     
		//*   9   16:icmpge          100
				try
				{
					((List) (arraylist)).add(((Object) ((FileDescriptor)class1.getClassLoader().loadClass(as1[i]).getField("descriptor").get(((Object) (null))))));
		//   10   19:aload           6
		//   11   21:aload_1         
		//   12   22:invokevirtual   #252 <Method ClassLoader Class.getClassLoader()>
		//   13   25:aload_2         
		//   14   26:iload           5
		//   15   28:aaload          
		//   16   29:invokevirtual   #258 <Method Class ClassLoader.loadClass(String)>
		//   17   32:ldc2            #260 <String "descriptor">
		//   18   35:invokevirtual   #264 <Method Field Class.getField(String)>
		//   19   38:aconst_null     
		//   20   39:invokevirtual   #267 <Method Object Field.get(Object)>
		//   21   42:checkcast       #2   <Class Descriptors$FileDescriptor>
		//   22   45:invokeinterface #104 <Method boolean List.add(Object)>
		//   23   50:pop             
				}
		//*  24   51:goto            91
				catch(Exception exception)
		//*  25   54:astore          7
				{
					Descriptors.logger.warning((new StringBuilder()).append("Descriptors for \"").append(as2[i]).append("\" can not be found.").toString());
		//   26   56:invokestatic    #271 <Method Logger Descriptors.access$100()>
		//   27   59:new             #88  <Class StringBuilder>
		//   28   62:dup             
		//   29   63:invokespecial   #89  <Method void StringBuilder()>
		//   30   66:ldc2            #273 <String "Descriptors for \"">
		//   31   69:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   32   72:aload_3         
		//   33   73:iload           5
		//   34   75:aaload          
		//   35   76:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   36   79:ldc2            #275 <String "\" can not be found.">
		//   37   82:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   38   85:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   39   88:invokevirtual   #281 <Method void Logger.warning(String)>
				}

		//   40   91:iload           5
		//   41   93:iconst_1        
		//   42   94:iadd            
		//   43   95:istore          5
		//*  44   97:goto            12
			class1 = ((Class) (new FileDescriptor[((List) (arraylist)).size()]));
		//   45  100:aload           6
		//   46  102:invokeinterface #107 <Method int List.size()>
		//   47  107:anewarray       FileDescriptor[]
		//   48  110:astore_1        
			((List) (arraylist)).toArray(((Object []) (class1)));
		//   49  111:aload           6
		//   50  113:aload_1         
		//   51  114:invokeinterface #113 <Method Object[] List.toArray(Object[])>
		//   52  119:pop             
			internalBuildGeneratedFileFrom(as, ((FileDescriptor []) (class1)), internaldescriptorassigner);
		//   53  120:aload_0         
		//   54  121:aload_1         
		//   55  122:aload           4
		//   56  124:invokestatic    #284 <Method void internalBuildGeneratedFileFrom(String[], Descriptors$FileDescriptor[], Descriptors$FileDescriptor$InternalDescriptorAssigner)>
		//   57  127:return          
		}

		public static void internalBuildGeneratedFileFrom(String as[], FileDescriptor afiledescriptor[], InternalDescriptorAssigner internaldescriptorassigner)
		{
			Object obj = ((Object) (new StringBuilder()));
		//    0    0:new             #88  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #89  <Method void StringBuilder()>
		//    3    7:astore          5
			int j = as.length;
		//    4    9:aload_0         
		//    5   10:arraylength     
		//    6   11:istore          4
			for(int i = 0; i < j; i++)
		//*   7   13:iconst_0        
		//*   8   14:istore_3        
		//*   9   15:iload_3         
		//*  10   16:iload           4
		//*  11   18:icmpge          37
				((StringBuilder) (obj)).append(as[i]);
		//   12   21:aload           5
		//   13   23:aload_0         
		//   14   24:iload_3         
		//   15   25:aaload          
		//   16   26:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   17   29:pop             

		//   18   30:iload_3         
		//   19   31:iconst_1        
		//   20   32:iadd            
		//   21   33:istore_3        
		//*  22   34:goto            15
			as = ((String []) (((StringBuilder) (obj)).toString().getBytes(Internal.ISO_8859_1)));
		//   23   37:aload           5
		//   24   39:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   25   42:getstatic       #294 <Field java.nio.charset.Charset Internal.ISO_8859_1>
		//   26   45:invokevirtual   #300 <Method byte[] String.getBytes(java.nio.charset.Charset)>
		//   27   48:astore_0        
			try
			{
				obj = ((Object) (DescriptorProtos.FileDescriptorProto.parseFrom(((byte []) (as)))));
		//   28   49:aload_0         
		//   29   50:invokestatic    #304 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.parseFrom(byte[])>
		//   30   53:astore          5
			}
		//*  31   55:goto            71
			// Misplaced declaration of an exception variable
			catch(String as[])
		//*  32   58:astore_0        
			{
				throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", ((Throwable) (as)));
		//   33   59:new             #306 <Class IllegalArgumentException>
		//   34   62:dup             
		//   35   63:ldc2            #308 <String "Failed to parse protocol buffer descriptor for generated code.">
		//   36   66:aload_0         
		//   37   67:invokespecial   #311 <Method void IllegalArgumentException(String, Throwable)>
		//   38   70:athrow          
			}
			try
			{
				afiledescriptor = ((FileDescriptor []) (buildFrom(((DescriptorProtos.FileDescriptorProto) (obj)), afiledescriptor, true)));
		//   39   71:aload           5
		//   40   73:aload_1         
		//   41   74:iconst_1        
		//   42   75:invokestatic    #225 <Method Descriptors$FileDescriptor buildFrom(DescriptorProtos$FileDescriptorProto, Descriptors$FileDescriptor[], boolean)>
		//   43   78:astore_1        
			}
		//*  44   79:goto            122
			// Misplaced declaration of an exception variable
			catch(String as[])
		//*  45   82:astore_0        
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Invalid embedded descriptor for \"").append(((DescriptorProtos.FileDescriptorProto) (obj)).getName()).append("\".").toString(), ((Throwable) (as)));
		//   46   83:new             #306 <Class IllegalArgumentException>
		//   47   86:dup             
		//   48   87:new             #88  <Class StringBuilder>
		//   49   90:dup             
		//   50   91:invokespecial   #89  <Method void StringBuilder()>
		//   51   94:ldc2            #313 <String "Invalid embedded descriptor for \"">
		//   52   97:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   53  100:aload           5
		//   54  102:invokevirtual   #314 <Method String DescriptorProtos$FileDescriptorProto.getName()>
		//   55  105:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   56  108:ldc2            #316 <String "\".">
		//   57  111:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   58  114:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   59  117:aload_0         
		//   60  118:invokespecial   #311 <Method void IllegalArgumentException(String, Throwable)>
		//   61  121:athrow          
			}
			internaldescriptorassigner = ((InternalDescriptorAssigner) (internaldescriptorassigner.assignDescriptors(((FileDescriptor) (afiledescriptor)))));
		//   62  122:aload_2         
		//   63  123:aload_1         
		//   64  124:invokeinterface #320 <Method ExtensionRegistry Descriptors$FileDescriptor$InternalDescriptorAssigner.assignDescriptors(Descriptors$FileDescriptor)>
		//   65  129:astore_2        
			if(internaldescriptorassigner != null)
		//*  66  130:aload_2         
		//*  67  131:ifnull          161
			{
				try
				{
					as = ((String []) (DescriptorProtos.FileDescriptorProto.parseFrom(((byte []) (as)), ((ExtensionRegistryLite) (internaldescriptorassigner)))));
		//   68  134:aload_0         
		//   69  135:aload_2         
		//   70  136:invokestatic    #323 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.parseFrom(byte[], ExtensionRegistryLite)>
		//   71  139:astore_0        
				}
		//*  72  140:goto            156
				// Misplaced declaration of an exception variable
				catch(String as[])
		//*  73  143:astore_0        
				{
					throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", ((Throwable) (as)));
		//   74  144:new             #306 <Class IllegalArgumentException>
		//   75  147:dup             
		//   76  148:ldc2            #308 <String "Failed to parse protocol buffer descriptor for generated code.">
		//   77  151:aload_0         
		//   78  152:invokespecial   #311 <Method void IllegalArgumentException(String, Throwable)>
		//   79  155:athrow          
				}
				((FileDescriptor) (afiledescriptor)).setProto(((DescriptorProtos.FileDescriptorProto) (as)));
		//   80  156:aload_1         
		//   81  157:aload_0         
		//   82  158:invokespecial   #327 <Method void setProto(DescriptorProtos$FileDescriptorProto)>
			}
		//   83  161:return          
		}

		public static void internalUpdateFileDescriptor(FileDescriptor filedescriptor, ExtensionRegistry extensionregistry)
		{
			ByteString bytestring = filedescriptor.proto.toByteString();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
		//    2    4:invokevirtual   #333 <Method ByteString DescriptorProtos$FileDescriptorProto.toByteString()>
		//    3    7:astore_2        
			try
			{
				extensionregistry = ((ExtensionRegistry) (DescriptorProtos.FileDescriptorProto.parseFrom(bytestring, ((ExtensionRegistryLite) (extensionregistry)))));
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:invokestatic    #336 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.parseFrom(ByteString, ExtensionRegistryLite)>
		//    7   13:astore_1        
			}
		//*   8   14:goto            30
			// Misplaced declaration of an exception variable
			catch(FileDescriptor filedescriptor)
		//*   9   17:astore_0        
			{
				throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", ((Throwable) (filedescriptor)));
		//   10   18:new             #306 <Class IllegalArgumentException>
		//   11   21:dup             
		//   12   22:ldc2            #308 <String "Failed to parse protocol buffer descriptor for generated code.">
		//   13   25:aload_0         
		//   14   26:invokespecial   #311 <Method void IllegalArgumentException(String, Throwable)>
		//   15   29:athrow          
			}
			filedescriptor.setProto(((DescriptorProtos.FileDescriptorProto) (extensionregistry)));
		//   16   30:aload_0         
		//   17   31:aload_1         
		//   18   32:invokespecial   #327 <Method void setProto(DescriptorProtos$FileDescriptorProto)>
		//   19   35:return          
		}

		private void setProto(DescriptorProtos.FileDescriptorProto filedescriptorproto)
		{
			proto = filedescriptorproto;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
			for(int i = 0; i < messageTypes.length; i++)
		//*   3    5:iconst_0        
		//*   4    6:istore_2        
		//*   5    7:iload_2         
		//*   6    8:aload_0         
		//*   7    9:getfield        #129 <Field Descriptors$Descriptor[] messageTypes>
		//*   8   12:arraylength     
		//*   9   13:icmpge          37
				messageTypes[i].setProto(filedescriptorproto.getMessageType(i));
		//   10   16:aload_0         
		//   11   17:getfield        #129 <Field Descriptors$Descriptor[] messageTypes>
		//   12   20:iload_2         
		//   13   21:aaload          
		//   14   22:aload_1         
		//   15   23:iload_2         
		//   16   24:invokevirtual   #133 <Method DescriptorProtos$DescriptorProto DescriptorProtos$FileDescriptorProto.getMessageType(int)>
		//   17   27:invokestatic    #340 <Method void Descriptors$Descriptor.access$1000(Descriptors$Descriptor, DescriptorProtos$DescriptorProto)>

		//   18   30:iload_2         
		//   19   31:iconst_1        
		//   20   32:iadd            
		//   21   33:istore_2        
		//*  22   34:goto            7
			for(int j = 0; j < enumTypes.length; j++)
		//*  23   37:iconst_0        
		//*  24   38:istore_2        
		//*  25   39:iload_2         
		//*  26   40:aload_0         
		//*  27   41:getfield        #143 <Field Descriptors$EnumDescriptor[] enumTypes>
		//*  28   44:arraylength     
		//*  29   45:icmpge          69
				enumTypes[j].setProto(filedescriptorproto.getEnumType(j));
		//   30   48:aload_0         
		//   31   49:getfield        #143 <Field Descriptors$EnumDescriptor[] enumTypes>
		//   32   52:iload_2         
		//   33   53:aaload          
		//   34   54:aload_1         
		//   35   55:iload_2         
		//   36   56:invokevirtual   #147 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$FileDescriptorProto.getEnumType(int)>
		//   37   59:invokestatic    #344 <Method void Descriptors$EnumDescriptor.access$1100(Descriptors$EnumDescriptor, DescriptorProtos$EnumDescriptorProto)>

		//   38   62:iload_2         
		//   39   63:iconst_1        
		//   40   64:iadd            
		//   41   65:istore_2        
		//*  42   66:goto            39
			for(int k = 0; k < services.length; k++)
		//*  43   69:iconst_0        
		//*  44   70:istore_2        
		//*  45   71:iload_2         
		//*  46   72:aload_0         
		//*  47   73:getfield        #157 <Field Descriptors$ServiceDescriptor[] services>
		//*  48   76:arraylength     
		//*  49   77:icmpge          101
				services[k].setProto(filedescriptorproto.getService(k));
		//   50   80:aload_0         
		//   51   81:getfield        #157 <Field Descriptors$ServiceDescriptor[] services>
		//   52   84:iload_2         
		//   53   85:aaload          
		//   54   86:aload_1         
		//   55   87:iload_2         
		//   56   88:invokevirtual   #161 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$FileDescriptorProto.getService(int)>
		//   57   91:invokestatic    #348 <Method void Descriptors$ServiceDescriptor.access$1200(Descriptors$ServiceDescriptor, DescriptorProtos$ServiceDescriptorProto)>

		//   58   94:iload_2         
		//   59   95:iconst_1        
		//   60   96:iadd            
		//   61   97:istore_2        
		//*  62   98:goto            71
			for(int l = 0; l < extensions.length; l++)
		//*  63  101:iconst_0        
		//*  64  102:istore_2        
		//*  65  103:iload_2         
		//*  66  104:aload_0         
		//*  67  105:getfield        #171 <Field Descriptors$FieldDescriptor[] extensions>
		//*  68  108:arraylength     
		//*  69  109:icmpge          133
				extensions[l].setProto(filedescriptorproto.getExtension(l));
		//   70  112:aload_0         
		//   71  113:getfield        #171 <Field Descriptors$FieldDescriptor[] extensions>
		//   72  116:iload_2         
		//   73  117:aaload          
		//   74  118:aload_1         
		//   75  119:iload_2         
		//   76  120:invokevirtual   #175 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FileDescriptorProto.getExtension(int)>
		//   77  123:invokestatic    #352 <Method void Descriptors$FieldDescriptor.access$1300(Descriptors$FieldDescriptor, DescriptorProtos$FieldDescriptorProto)>

		//   78  126:iload_2         
		//   79  127:iconst_1        
		//   80  128:iadd            
		//   81  129:istore_2        
		//*  82  130:goto            103
		//   83  133:return          
		}

		public EnumDescriptor findEnumTypeByName(String s)
		{
			if(s.indexOf('.') != -1)
		//*   0    0:aload_1         
		//*   1    1:bipush          46
		//*   2    3:invokevirtual   #357 <Method int String.indexOf(int)>
		//*   3    6:iconst_m1       
		//*   4    7:icmpeq          12
				return null;
		//    5   10:aconst_null     
		//    6   11:areturn         
			String s1 = s;
		//    7   12:aload_1         
		//    8   13:astore_2        
			if(getPackage().length() > 0)
		//*   9   14:aload_0         
		//*  10   15:invokevirtual   #116 <Method String getPackage()>
		//*  11   18:invokevirtual   #360 <Method int String.length()>
		//*  12   21:ifle            51
				s1 = (new StringBuilder()).append(getPackage()).append('.').append(s).toString();
		//   13   24:new             #88  <Class StringBuilder>
		//   14   27:dup             
		//   15   28:invokespecial   #89  <Method void StringBuilder()>
		//   16   31:aload_0         
		//   17   32:invokevirtual   #116 <Method String getPackage()>
		//   18   35:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   19   38:bipush          46
		//   20   40:invokevirtual   #363 <Method StringBuilder StringBuilder.append(char)>
		//   21   43:aload_1         
		//   22   44:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   23   47:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   24   50:astore_2        
			s = ((String) (pool.findSymbol(s1)));
		//   25   51:aload_0         
		//   26   52:getfield        #37  <Field Descriptors$DescriptorPool pool>
		//   27   55:aload_2         
		//   28   56:invokevirtual   #367 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.findSymbol(String)>
		//   29   59:astore_1        
			if(s != null && (s instanceof EnumDescriptor) && ((GenericDescriptor) (s)).getFile() == this)
		//*  30   60:aload_1         
		//*  31   61:ifnull          84
		//*  32   64:aload_1         
		//*  33   65:instanceof      #141 <Class Descriptors$EnumDescriptor>
		//*  34   68:ifeq            84
		//*  35   71:aload_1         
		//*  36   72:invokevirtual   #371 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
		//*  37   75:aload_0         
		//*  38   76:if_acmpne       84
				return (EnumDescriptor)s;
		//   39   79:aload_1         
		//   40   80:checkcast       #141 <Class Descriptors$EnumDescriptor>
		//   41   83:areturn         
			else
				return null;
		//   42   84:aconst_null     
		//   43   85:areturn         
		}

		public FieldDescriptor findExtensionByName(String s)
		{
			if(s.indexOf('.') != -1)
		//*   0    0:aload_1         
		//*   1    1:bipush          46
		//*   2    3:invokevirtual   #357 <Method int String.indexOf(int)>
		//*   3    6:iconst_m1       
		//*   4    7:icmpeq          12
				return null;
		//    5   10:aconst_null     
		//    6   11:areturn         
			String s1 = s;
		//    7   12:aload_1         
		//    8   13:astore_2        
			if(getPackage().length() > 0)
		//*   9   14:aload_0         
		//*  10   15:invokevirtual   #116 <Method String getPackage()>
		//*  11   18:invokevirtual   #360 <Method int String.length()>
		//*  12   21:ifle            51
				s1 = (new StringBuilder()).append(getPackage()).append('.').append(s).toString();
		//   13   24:new             #88  <Class StringBuilder>
		//   14   27:dup             
		//   15   28:invokespecial   #89  <Method void StringBuilder()>
		//   16   31:aload_0         
		//   17   32:invokevirtual   #116 <Method String getPackage()>
		//   18   35:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   19   38:bipush          46
		//   20   40:invokevirtual   #363 <Method StringBuilder StringBuilder.append(char)>
		//   21   43:aload_1         
		//   22   44:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   23   47:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   24   50:astore_2        
			s = ((String) (pool.findSymbol(s1)));
		//   25   51:aload_0         
		//   26   52:getfield        #37  <Field Descriptors$DescriptorPool pool>
		//   27   55:aload_2         
		//   28   56:invokevirtual   #367 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.findSymbol(String)>
		//   29   59:astore_1        
			if(s != null && (s instanceof FieldDescriptor) && ((GenericDescriptor) (s)).getFile() == this)
		//*  30   60:aload_1         
		//*  31   61:ifnull          84
		//*  32   64:aload_1         
		//*  33   65:instanceof      #169 <Class Descriptors$FieldDescriptor>
		//*  34   68:ifeq            84
		//*  35   71:aload_1         
		//*  36   72:invokevirtual   #371 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
		//*  37   75:aload_0         
		//*  38   76:if_acmpne       84
				return (FieldDescriptor)s;
		//   39   79:aload_1         
		//   40   80:checkcast       #169 <Class Descriptors$FieldDescriptor>
		//   41   83:areturn         
			else
				return null;
		//   42   84:aconst_null     
		//   43   85:areturn         
		}

		public Descriptor findMessageTypeByName(String s)
		{
			if(s.indexOf('.') != -1)
		//*   0    0:aload_1         
		//*   1    1:bipush          46
		//*   2    3:invokevirtual   #357 <Method int String.indexOf(int)>
		//*   3    6:iconst_m1       
		//*   4    7:icmpeq          12
				return null;
		//    5   10:aconst_null     
		//    6   11:areturn         
			String s1 = s;
		//    7   12:aload_1         
		//    8   13:astore_2        
			if(getPackage().length() > 0)
		//*   9   14:aload_0         
		//*  10   15:invokevirtual   #116 <Method String getPackage()>
		//*  11   18:invokevirtual   #360 <Method int String.length()>
		//*  12   21:ifle            51
				s1 = (new StringBuilder()).append(getPackage()).append('.').append(s).toString();
		//   13   24:new             #88  <Class StringBuilder>
		//   14   27:dup             
		//   15   28:invokespecial   #89  <Method void StringBuilder()>
		//   16   31:aload_0         
		//   17   32:invokevirtual   #116 <Method String getPackage()>
		//   18   35:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   19   38:bipush          46
		//   20   40:invokevirtual   #363 <Method StringBuilder StringBuilder.append(char)>
		//   21   43:aload_1         
		//   22   44:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   23   47:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   24   50:astore_2        
			s = ((String) (pool.findSymbol(s1)));
		//   25   51:aload_0         
		//   26   52:getfield        #37  <Field Descriptors$DescriptorPool pool>
		//   27   55:aload_2         
		//   28   56:invokevirtual   #367 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.findSymbol(String)>
		//   29   59:astore_1        
			if(s != null && (s instanceof Descriptor) && ((GenericDescriptor) (s)).getFile() == this)
		//*  30   60:aload_1         
		//*  31   61:ifnull          84
		//*  32   64:aload_1         
		//*  33   65:instanceof      #127 <Class Descriptors$Descriptor>
		//*  34   68:ifeq            84
		//*  35   71:aload_1         
		//*  36   72:invokevirtual   #371 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
		//*  37   75:aload_0         
		//*  38   76:if_acmpne       84
				return (Descriptor)s;
		//   39   79:aload_1         
		//   40   80:checkcast       #127 <Class Descriptors$Descriptor>
		//   41   83:areturn         
			else
				return null;
		//   42   84:aconst_null     
		//   43   85:areturn         
		}

		public ServiceDescriptor findServiceByName(String s)
		{
			if(s.indexOf('.') != -1)
		//*   0    0:aload_1         
		//*   1    1:bipush          46
		//*   2    3:invokevirtual   #357 <Method int String.indexOf(int)>
		//*   3    6:iconst_m1       
		//*   4    7:icmpeq          12
				return null;
		//    5   10:aconst_null     
		//    6   11:areturn         
			String s1 = s;
		//    7   12:aload_1         
		//    8   13:astore_2        
			if(getPackage().length() > 0)
		//*   9   14:aload_0         
		//*  10   15:invokevirtual   #116 <Method String getPackage()>
		//*  11   18:invokevirtual   #360 <Method int String.length()>
		//*  12   21:ifle            51
				s1 = (new StringBuilder()).append(getPackage()).append('.').append(s).toString();
		//   13   24:new             #88  <Class StringBuilder>
		//   14   27:dup             
		//   15   28:invokespecial   #89  <Method void StringBuilder()>
		//   16   31:aload_0         
		//   17   32:invokevirtual   #116 <Method String getPackage()>
		//   18   35:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   19   38:bipush          46
		//   20   40:invokevirtual   #363 <Method StringBuilder StringBuilder.append(char)>
		//   21   43:aload_1         
		//   22   44:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   23   47:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   24   50:astore_2        
			s = ((String) (pool.findSymbol(s1)));
		//   25   51:aload_0         
		//   26   52:getfield        #37  <Field Descriptors$DescriptorPool pool>
		//   27   55:aload_2         
		//   28   56:invokevirtual   #367 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.findSymbol(String)>
		//   29   59:astore_1        
			if(s != null && (s instanceof ServiceDescriptor) && ((GenericDescriptor) (s)).getFile() == this)
		//*  30   60:aload_1         
		//*  31   61:ifnull          84
		//*  32   64:aload_1         
		//*  33   65:instanceof      #155 <Class Descriptors$ServiceDescriptor>
		//*  34   68:ifeq            84
		//*  35   71:aload_1         
		//*  36   72:invokevirtual   #371 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
		//*  37   75:aload_0         
		//*  38   76:if_acmpne       84
				return (ServiceDescriptor)s;
		//   39   79:aload_1         
		//   40   80:checkcast       #155 <Class Descriptors$ServiceDescriptor>
		//   41   83:areturn         
			else
				return null;
		//   42   84:aconst_null     
		//   43   85:areturn         
		}

		public List getDependencies()
		{
			return Collections.unmodifiableList(Arrays.asList(((Object []) (dependencies))));
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Descriptors$FileDescriptor[] dependencies>
		//    2    4:invokestatic    #385 <Method List Arrays.asList(Object[])>
		//    3    7:invokestatic    #391 <Method List Collections.unmodifiableList(List)>
		//    4   10:areturn         
		}

		public List getEnumTypes()
		{
			return Collections.unmodifiableList(Arrays.asList(((Object []) (enumTypes))));
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Descriptors$EnumDescriptor[] enumTypes>
		//    2    4:invokestatic    #385 <Method List Arrays.asList(Object[])>
		//    3    7:invokestatic    #391 <Method List Collections.unmodifiableList(List)>
		//    4   10:areturn         
		}

		public List getExtensions()
		{
			return Collections.unmodifiableList(Arrays.asList(((Object []) (extensions))));
		//    0    0:aload_0         
		//    1    1:getfield        #171 <Field Descriptors$FieldDescriptor[] extensions>
		//    2    4:invokestatic    #385 <Method List Arrays.asList(Object[])>
		//    3    7:invokestatic    #391 <Method List Collections.unmodifiableList(List)>
		//    4   10:areturn         
		}

		public FileDescriptor getFile()
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public String getFullName()
		{
			return proto.getName();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
		//    2    4:invokevirtual   #314 <Method String DescriptorProtos$FileDescriptorProto.getName()>
		//    3    7:areturn         
		}

		public List getMessageTypes()
		{
			return Collections.unmodifiableList(Arrays.asList(((Object []) (messageTypes))));
		//    0    0:aload_0         
		//    1    1:getfield        #129 <Field Descriptors$Descriptor[] messageTypes>
		//    2    4:invokestatic    #385 <Method List Arrays.asList(Object[])>
		//    3    7:invokestatic    #391 <Method List Collections.unmodifiableList(List)>
		//    4   10:areturn         
		}

		public String getName()
		{
			return proto.getName();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
		//    2    4:invokevirtual   #314 <Method String DescriptorProtos$FileDescriptorProto.getName()>
		//    3    7:areturn         
		}

		public DescriptorProtos.FileOptions getOptions()
		{
			return proto.getOptions();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
		//    2    4:invokevirtual   #402 <Method DescriptorProtos$FileOptions DescriptorProtos$FileDescriptorProto.getOptions()>
		//    3    7:areturn         
		}

		public String getPackage()
		{
			return proto.getPackage();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
		//    2    4:invokevirtual   #403 <Method String DescriptorProtos$FileDescriptorProto.getPackage()>
		//    3    7:areturn         
		}

		public List getPublicDependencies()
		{
			return Collections.unmodifiableList(Arrays.asList(((Object []) (publicDependencies))));
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field Descriptors$FileDescriptor[] publicDependencies>
		//    2    4:invokestatic    #385 <Method List Arrays.asList(Object[])>
		//    3    7:invokestatic    #391 <Method List Collections.unmodifiableList(List)>
		//    4   10:areturn         
		}

		public List getServices()
		{
			return Collections.unmodifiableList(Arrays.asList(((Object []) (services))));
		//    0    0:aload_0         
		//    1    1:getfield        #157 <Field Descriptors$ServiceDescriptor[] services>
		//    2    4:invokestatic    #385 <Method List Arrays.asList(Object[])>
		//    3    7:invokestatic    #391 <Method List Collections.unmodifiableList(List)>
		//    4   10:areturn         
		}

		public Syntax getSyntax()
		{
			if(Syntax.PROTO3.name.equals(((Object) (proto.getSyntax()))))
		//*   0    0:getstatic       #412 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO3>
		//*   1    3:invokestatic    #416 <Method String Descriptors$FileDescriptor$Syntax.access$000(Descriptors$FileDescriptor$Syntax)>
		//*   2    6:aload_0         
		//*   3    7:getfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
		//*   4   10:invokevirtual   #418 <Method String DescriptorProtos$FileDescriptorProto.getSyntax()>
		//*   5   13:invokevirtual   #421 <Method boolean String.equals(Object)>
		//*   6   16:ifeq            23
				return Syntax.PROTO3;
		//    7   19:getstatic       #412 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO3>
		//    8   22:areturn         
			else
				return Syntax.PROTO2;
		//    9   23:getstatic       #424 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO2>
		//   10   26:areturn         
		}

		boolean supportsUnknownEnumValue()
		{
			return getSyntax() == Syntax.PROTO3;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #428 <Method Descriptors$FileDescriptor$Syntax getSyntax()>
		//    2    4:getstatic       #412 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO3>
		//    3    7:if_acmpne       12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public DescriptorProtos.FileDescriptorProto toProto()
		{
			return proto;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
		//    2    4:areturn         
		}

		public volatile Message toProto()
		{
			return ((Message) (toProto()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #431 <Method DescriptorProtos$FileDescriptorProto toProto()>
		//    2    4:areturn         
		}

		private final FileDescriptor dependencies[];
		private final EnumDescriptor enumTypes[];
		private final FieldDescriptor extensions[];
		private final Descriptor messageTypes[];
		private final DescriptorPool pool;
		private DescriptorProtos.FileDescriptorProto proto;
		private final FileDescriptor publicDependencies[];
		private final ServiceDescriptor services[];


/*
		static DescriptorPool access$1400(FileDescriptor filedescriptor)
		{
			return filedescriptor.pool;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field Descriptors$DescriptorPool pool>
		//    2    4:areturn         
		}

*/

		private FileDescriptor(DescriptorProtos.FileDescriptorProto filedescriptorproto, FileDescriptor afiledescriptor[], DescriptorPool descriptorpool, boolean flag)
			throws DescriptorValidationException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Descriptors$GenericDescriptor()>
			pool = descriptorpool;
		//    2    4:aload_0         
		//    3    5:aload_3         
		//    4    6:putfield        #37  <Field Descriptors$DescriptorPool pool>
			proto = filedescriptorproto;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
			dependencies = (FileDescriptor[])((FileDescriptor []) (afiledescriptor)).clone();
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #44  <Method Object _5B_Lcom.google.protobuf.Descriptors$FileDescriptor_3B_.clone()>
		//   11   19:checkcast       #40  <Class Descriptors$FileDescriptor[]>
		//   12   22:putfield        #46  <Field Descriptors$FileDescriptor[] dependencies>
			HashMap hashmap = new HashMap();
		//   13   25:new             #48  <Class HashMap>
		//   14   28:dup             
		//   15   29:invokespecial   #49  <Method void HashMap()>
		//   16   32:astore          7
			int k1 = afiledescriptor.length;
		//   17   34:aload_2         
		//   18   35:arraylength     
		//   19   36:istore          6
			for(int i = 0; i < k1; i++)
		//*  20   38:iconst_0        
		//*  21   39:istore          5
		//*  22   41:iload           5
		//*  23   43:iload           6
		//*  24   45:icmpge          76
			{
				FileDescriptor filedescriptor = afiledescriptor[i];
		//   25   48:aload_2         
		//   26   49:iload           5
		//   27   51:aaload          
		//   28   52:astore          8
				hashmap.put(((Object) (filedescriptor.getName())), ((Object) (filedescriptor)));
		//   29   54:aload           7
		//   30   56:aload           8
		//   31   58:invokevirtual   #53  <Method String getName()>
		//   32   61:aload           8
		//   33   63:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
		//   34   66:pop             
			}

		//   35   67:iload           5
		//   36   69:iconst_1        
		//   37   70:iadd            
		//   38   71:istore          5
		//*  39   73:goto            41
			afiledescriptor = ((FileDescriptor []) (new ArrayList()));
		//   40   76:new             #59  <Class ArrayList>
		//   41   79:dup             
		//   42   80:invokespecial   #60  <Method void ArrayList()>
		//   43   83:astore_2        
			for(int j = 0; j < filedescriptorproto.getPublicDependencyCount(); j++)
		//*  44   84:iconst_0        
		//*  45   85:istore          5
		//*  46   87:iload           5
		//*  47   89:aload_1         
		//*  48   90:invokevirtual   #66  <Method int DescriptorProtos$FileDescriptorProto.getPublicDependencyCount()>
		//*  49   93:icmpge          208
			{
				int l1 = filedescriptorproto.getPublicDependency(j);
		//   50   96:aload_1         
		//   51   97:iload           5
		//   52   99:invokevirtual   #70  <Method int DescriptorProtos$FileDescriptorProto.getPublicDependency(int)>
		//   53  102:istore          6
				if(l1 < 0 || l1 >= filedescriptorproto.getDependencyCount())
		//*  54  104:iload           6
		//*  55  106:iflt            118
		//*  56  109:iload           6
		//*  57  111:aload_1         
		//*  58  112:invokevirtual   #73  <Method int DescriptorProtos$FileDescriptorProto.getDependencyCount()>
		//*  59  115:icmplt          130
					throw new DescriptorValidationException(this, "Invalid public dependency index.");
		//   60  118:new             #32  <Class Descriptors$DescriptorValidationException>
		//   61  121:dup             
		//   62  122:aload_0         
		//   63  123:ldc1            #75  <String "Invalid public dependency index.">
		//   64  125:aconst_null     
		//   65  126:invokespecial   #78  <Method void Descriptors$DescriptorValidationException(Descriptors$FileDescriptor, String, Descriptors$1)>
		//   66  129:athrow          
				String s = filedescriptorproto.getDependency(l1);
		//   67  130:aload_1         
		//   68  131:iload           6
		//   69  133:invokevirtual   #82  <Method String DescriptorProtos$FileDescriptorProto.getDependency(int)>
		//   70  136:astore          8
				FileDescriptor filedescriptor1 = (FileDescriptor)hashmap.get(((Object) (s)));
		//   71  138:aload           7
		//   72  140:aload           8
		//   73  142:invokevirtual   #86  <Method Object HashMap.get(Object)>
		//   74  145:checkcast       #2   <Class Descriptors$FileDescriptor>
		//   75  148:astore          9
				if(filedescriptor1 == null)
		//*  76  150:aload           9
		//*  77  152:ifnonnull       190
				{
					if(!flag)
		//*  78  155:iload           4
		//*  79  157:ifne            199
						throw new DescriptorValidationException(this, (new StringBuilder()).append("Invalid public dependency: ").append(s).toString());
		//   80  160:new             #32  <Class Descriptors$DescriptorValidationException>
		//   81  163:dup             
		//   82  164:aload_0         
		//   83  165:new             #88  <Class StringBuilder>
		//   84  168:dup             
		//   85  169:invokespecial   #89  <Method void StringBuilder()>
		//   86  172:ldc1            #91  <String "Invalid public dependency: ">
		//   87  174:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   88  177:aload           8
		//   89  179:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   90  182:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   91  185:aconst_null     
		//   92  186:invokespecial   #78  <Method void Descriptors$DescriptorValidationException(Descriptors$FileDescriptor, String, Descriptors$1)>
		//   93  189:athrow          
				} else
				{
					((List) (afiledescriptor)).add(((Object) (filedescriptor1)));
		//   94  190:aload_2         
		//   95  191:aload           9
		//   96  193:invokeinterface #104 <Method boolean List.add(Object)>
		//   97  198:pop             
				}
			}

		//   98  199:iload           5
		//   99  201:iconst_1        
		//  100  202:iadd            
		//  101  203:istore          5
		//* 102  205:goto            87
			publicDependencies = new FileDescriptor[((List) (afiledescriptor)).size()];
		//  103  208:aload_0         
		//  104  209:aload_2         
		//  105  210:invokeinterface #107 <Method int List.size()>
		//  106  215:anewarray       FileDescriptor[]
		//  107  218:putfield        #109 <Field Descriptors$FileDescriptor[] publicDependencies>
			((List) (afiledescriptor)).toArray(((Object []) (publicDependencies)));
		//  108  221:aload_2         
		//  109  222:aload_0         
		//  110  223:getfield        #109 <Field Descriptors$FileDescriptor[] publicDependencies>
		//  111  226:invokeinterface #113 <Method Object[] List.toArray(Object[])>
		//  112  231:pop             
			descriptorpool.addPackage(getPackage(), this);
		//  113  232:aload_3         
		//  114  233:aload_0         
		//  115  234:invokevirtual   #116 <Method String getPackage()>
		//  116  237:aload_0         
		//  117  238:invokevirtual   #122 <Method void Descriptors$DescriptorPool.addPackage(String, Descriptors$FileDescriptor)>
			messageTypes = new Descriptor[filedescriptorproto.getMessageTypeCount()];
		//  118  241:aload_0         
		//  119  242:aload_1         
		//  120  243:invokevirtual   #125 <Method int DescriptorProtos$FileDescriptorProto.getMessageTypeCount()>
		//  121  246:anewarray       Descriptor[]
		//  122  249:putfield        #129 <Field Descriptors$Descriptor[] messageTypes>
			for(int k = 0; k < filedescriptorproto.getMessageTypeCount(); k++)
		//* 123  252:iconst_0        
		//* 124  253:istore          5
		//* 125  255:iload           5
		//* 126  257:aload_1         
		//* 127  258:invokevirtual   #125 <Method int DescriptorProtos$FileDescriptorProto.getMessageTypeCount()>
		//* 128  261:icmpge          298
				messageTypes[k] = new Descriptor(filedescriptorproto.getMessageType(k), this, ((Descriptor) (null)), k);
		//  129  264:aload_0         
		//  130  265:getfield        #129 <Field Descriptors$Descriptor[] messageTypes>
		//  131  268:iload           5
		//  132  270:new             #127 <Class Descriptors$Descriptor>
		//  133  273:dup             
		//  134  274:aload_1         
		//  135  275:iload           5
		//  136  277:invokevirtual   #133 <Method DescriptorProtos$DescriptorProto DescriptorProtos$FileDescriptorProto.getMessageType(int)>
		//  137  280:aload_0         
		//  138  281:aconst_null     
		//  139  282:iload           5
		//  140  284:aconst_null     
		//  141  285:invokespecial   #136 <Method void Descriptors$Descriptor(DescriptorProtos$DescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int, Descriptors$1)>
		//  142  288:aastore         

		//  143  289:iload           5
		//  144  291:iconst_1        
		//  145  292:iadd            
		//  146  293:istore          5
		//* 147  295:goto            255
			enumTypes = new EnumDescriptor[filedescriptorproto.getEnumTypeCount()];
		//  148  298:aload_0         
		//  149  299:aload_1         
		//  150  300:invokevirtual   #139 <Method int DescriptorProtos$FileDescriptorProto.getEnumTypeCount()>
		//  151  303:anewarray       EnumDescriptor[]
		//  152  306:putfield        #143 <Field Descriptors$EnumDescriptor[] enumTypes>
			for(int l = 0; l < filedescriptorproto.getEnumTypeCount(); l++)
		//* 153  309:iconst_0        
		//* 154  310:istore          5
		//* 155  312:iload           5
		//* 156  314:aload_1         
		//* 157  315:invokevirtual   #139 <Method int DescriptorProtos$FileDescriptorProto.getEnumTypeCount()>
		//* 158  318:icmpge          355
				enumTypes[l] = new EnumDescriptor(filedescriptorproto.getEnumType(l), this, ((Descriptor) (null)), l);
		//  159  321:aload_0         
		//  160  322:getfield        #143 <Field Descriptors$EnumDescriptor[] enumTypes>
		//  161  325:iload           5
		//  162  327:new             #141 <Class Descriptors$EnumDescriptor>
		//  163  330:dup             
		//  164  331:aload_1         
		//  165  332:iload           5
		//  166  334:invokevirtual   #147 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$FileDescriptorProto.getEnumType(int)>
		//  167  337:aload_0         
		//  168  338:aconst_null     
		//  169  339:iload           5
		//  170  341:aconst_null     
		//  171  342:invokespecial   #150 <Method void Descriptors$EnumDescriptor(DescriptorProtos$EnumDescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int, Descriptors$1)>
		//  172  345:aastore         

		//  173  346:iload           5
		//  174  348:iconst_1        
		//  175  349:iadd            
		//  176  350:istore          5
		//* 177  352:goto            312
			services = new ServiceDescriptor[filedescriptorproto.getServiceCount()];
		//  178  355:aload_0         
		//  179  356:aload_1         
		//  180  357:invokevirtual   #153 <Method int DescriptorProtos$FileDescriptorProto.getServiceCount()>
		//  181  360:anewarray       ServiceDescriptor[]
		//  182  363:putfield        #157 <Field Descriptors$ServiceDescriptor[] services>
			for(int i1 = 0; i1 < filedescriptorproto.getServiceCount(); i1++)
		//* 183  366:iconst_0        
		//* 184  367:istore          5
		//* 185  369:iload           5
		//* 186  371:aload_1         
		//* 187  372:invokevirtual   #153 <Method int DescriptorProtos$FileDescriptorProto.getServiceCount()>
		//* 188  375:icmpge          411
				services[i1] = new ServiceDescriptor(filedescriptorproto.getService(i1), this, i1);
		//  189  378:aload_0         
		//  190  379:getfield        #157 <Field Descriptors$ServiceDescriptor[] services>
		//  191  382:iload           5
		//  192  384:new             #155 <Class Descriptors$ServiceDescriptor>
		//  193  387:dup             
		//  194  388:aload_1         
		//  195  389:iload           5
		//  196  391:invokevirtual   #161 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$FileDescriptorProto.getService(int)>
		//  197  394:aload_0         
		//  198  395:iload           5
		//  199  397:aconst_null     
		//  200  398:invokespecial   #164 <Method void Descriptors$ServiceDescriptor(DescriptorProtos$ServiceDescriptorProto, Descriptors$FileDescriptor, int, Descriptors$1)>
		//  201  401:aastore         

		//  202  402:iload           5
		//  203  404:iconst_1        
		//  204  405:iadd            
		//  205  406:istore          5
		//* 206  408:goto            369
			extensions = new FieldDescriptor[filedescriptorproto.getExtensionCount()];
		//  207  411:aload_0         
		//  208  412:aload_1         
		//  209  413:invokevirtual   #167 <Method int DescriptorProtos$FileDescriptorProto.getExtensionCount()>
		//  210  416:anewarray       FieldDescriptor[]
		//  211  419:putfield        #171 <Field Descriptors$FieldDescriptor[] extensions>
			for(int j1 = 0; j1 < filedescriptorproto.getExtensionCount(); j1++)
		//* 212  422:iconst_0        
		//* 213  423:istore          5
		//* 214  425:iload           5
		//* 215  427:aload_1         
		//* 216  428:invokevirtual   #167 <Method int DescriptorProtos$FileDescriptorProto.getExtensionCount()>
		//* 217  431:icmpge          469
				extensions[j1] = new FieldDescriptor(filedescriptorproto.getExtension(j1), this, ((Descriptor) (null)), j1, true);
		//  218  434:aload_0         
		//  219  435:getfield        #171 <Field Descriptors$FieldDescriptor[] extensions>
		//  220  438:iload           5
		//  221  440:new             #169 <Class Descriptors$FieldDescriptor>
		//  222  443:dup             
		//  223  444:aload_1         
		//  224  445:iload           5
		//  225  447:invokevirtual   #175 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FileDescriptorProto.getExtension(int)>
		//  226  450:aload_0         
		//  227  451:aconst_null     
		//  228  452:iload           5
		//  229  454:iconst_1        
		//  230  455:aconst_null     
		//  231  456:invokespecial   #178 <Method void Descriptors$FieldDescriptor(DescriptorProtos$FieldDescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int, boolean, Descriptors$1)>
		//  232  459:aastore         

		//  233  460:iload           5
		//  234  462:iconst_1        
		//  235  463:iadd            
		//  236  464:istore          5
		//* 237  466:goto            425
		//  238  469:return          
		}

		FileDescriptor(String s, Descriptor descriptor)
			throws DescriptorValidationException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Descriptors$GenericDescriptor()>
			pool = new DescriptorPool(new FileDescriptor[0], true);
		//    2    4:aload_0         
		//    3    5:new             #118 <Class Descriptors$DescriptorPool>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:anewarray       FileDescriptor[]
		//    7   13:iconst_1        
		//    8   14:invokespecial   #184 <Method void Descriptors$DescriptorPool(Descriptors$FileDescriptor[], boolean)>
		//    9   17:putfield        #37  <Field Descriptors$DescriptorPool pool>
			proto = DescriptorProtos.FileDescriptorProto.newBuilder().setName((new StringBuilder()).append(descriptor.getFullName()).append(".placeholder.proto").toString()).setPackage(s).addMessageType(descriptor.toProto()).build();
		//   10   20:aload_0         
		//   11   21:invokestatic    #188 <Method DescriptorProtos$FileDescriptorProto$Builder DescriptorProtos$FileDescriptorProto.newBuilder()>
		//   12   24:new             #88  <Class StringBuilder>
		//   13   27:dup             
		//   14   28:invokespecial   #89  <Method void StringBuilder()>
		//   15   31:aload_2         
		//   16   32:invokevirtual   #191 <Method String Descriptors$Descriptor.getFullName()>
		//   17   35:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   18   38:ldc1            #193 <String ".placeholder.proto">
		//   19   40:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
		//   20   43:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   21   46:invokevirtual   #199 <Method DescriptorProtos$FileDescriptorProto$Builder DescriptorProtos$FileDescriptorProto$Builder.setName(String)>
		//   22   49:aload_1         
		//   23   50:invokevirtual   #202 <Method DescriptorProtos$FileDescriptorProto$Builder DescriptorProtos$FileDescriptorProto$Builder.setPackage(String)>
		//   24   53:aload_2         
		//   25   54:invokevirtual   #206 <Method DescriptorProtos$DescriptorProto Descriptors$Descriptor.toProto()>
		//   26   57:invokevirtual   #210 <Method DescriptorProtos$FileDescriptorProto$Builder DescriptorProtos$FileDescriptorProto$Builder.addMessageType(DescriptorProtos$DescriptorProto)>
		//   27   60:invokevirtual   #214 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto$Builder.build()>
		//   28   63:putfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
			dependencies = new FileDescriptor[0];
		//   29   66:aload_0         
		//   30   67:iconst_0        
		//   31   68:anewarray       FileDescriptor[]
		//   32   71:putfield        #46  <Field Descriptors$FileDescriptor[] dependencies>
			publicDependencies = new FileDescriptor[0];
		//   33   74:aload_0         
		//   34   75:iconst_0        
		//   35   76:anewarray       FileDescriptor[]
		//   36   79:putfield        #109 <Field Descriptors$FileDescriptor[] publicDependencies>
			messageTypes = (new Descriptor[] {
				descriptor
			});
		//   37   82:aload_0         
		//   38   83:iconst_1        
		//   39   84:anewarray       Descriptor[]
		//   40   87:dup             
		//   41   88:iconst_0        
		//   42   89:aload_2         
		//   43   90:aastore         
		//   44   91:putfield        #129 <Field Descriptors$Descriptor[] messageTypes>
			enumTypes = new EnumDescriptor[0];
		//   45   94:aload_0         
		//   46   95:iconst_0        
		//   47   96:anewarray       EnumDescriptor[]
		//   48   99:putfield        #143 <Field Descriptors$EnumDescriptor[] enumTypes>
			services = new ServiceDescriptor[0];
		//   49  102:aload_0         
		//   50  103:iconst_0        
		//   51  104:anewarray       ServiceDescriptor[]
		//   52  107:putfield        #157 <Field Descriptors$ServiceDescriptor[] services>
			extensions = new FieldDescriptor[0];
		//   53  110:aload_0         
		//   54  111:iconst_0        
		//   55  112:anewarray       FieldDescriptor[]
		//   56  115:putfield        #171 <Field Descriptors$FieldDescriptor[] extensions>
			pool.addPackage(s, this);
		//   57  118:aload_0         
		//   58  119:getfield        #37  <Field Descriptors$DescriptorPool pool>
		//   59  122:aload_1         
		//   60  123:aload_0         
		//   61  124:invokevirtual   #122 <Method void Descriptors$DescriptorPool.addPackage(String, Descriptors$FileDescriptor)>
			pool.addSymbol(((GenericDescriptor) (descriptor)));
		//   62  127:aload_0         
		//   63  128:getfield        #37  <Field Descriptors$DescriptorPool pool>
		//   64  131:aload_2         
		//   65  132:invokevirtual   #218 <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
		//   66  135:return          
		}
	}

	public static interface FileDescriptor.InternalDescriptorAssigner
	{

		public abstract ExtensionRegistry assignDescriptors(FileDescriptor filedescriptor);
	}

	public static final class FileDescriptor.Syntax extends Enum
	{

		public static FileDescriptor.Syntax valueOf(String s)
		{
			return (FileDescriptor.Syntax)Enum.valueOf(com/google/protobuf/Descriptors$FileDescriptor$Syntax, s);
		//    0    0:ldc1            #2   <Class Descriptors$FileDescriptor$Syntax>
		//    1    2:aload_0         
		//    2    3:invokestatic    #57  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Descriptors$FileDescriptor$Syntax>
		//    4    9:areturn         
		}

		public static FileDescriptor.Syntax[] values()
		{
			return (FileDescriptor.Syntax[])((FileDescriptor.Syntax []) ($VALUES)).clone();
		//    0    0:getstatic       #42  <Field Descriptors$FileDescriptor$Syntax[] $VALUES>
		//    1    3:invokevirtual   #64  <Method Object _5B_Lcom.google.protobuf.Descriptors$FileDescriptor$Syntax_3B_.clone()>
		//    2    6:checkcast       #60  <Class Descriptors$FileDescriptor$Syntax[]>
		//    3    9:areturn         
		}

		private static final FileDescriptor.Syntax $VALUES[];
		public static final FileDescriptor.Syntax PROTO2;
		public static final FileDescriptor.Syntax PROTO3;
		public static final FileDescriptor.Syntax UNKNOWN;
		private final String name;

		static 
		{
			UNKNOWN = new FileDescriptor.Syntax("UNKNOWN", 0, "unknown");
		//    0    0:new             #2   <Class Descriptors$FileDescriptor$Syntax>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "unknown">
		//    5    9:invokespecial   #28  <Method void Descriptors$FileDescriptor$Syntax(String, int, String)>
		//    6   12:putstatic       #30  <Field Descriptors$FileDescriptor$Syntax UNKNOWN>
			PROTO2 = new FileDescriptor.Syntax("PROTO2", 1, "proto2");
		//    7   15:new             #2   <Class Descriptors$FileDescriptor$Syntax>
		//    8   18:dup             
		//    9   19:ldc1            #31  <String "PROTO2">
		//   10   21:iconst_1        
		//   11   22:ldc1            #33  <String "proto2">
		//   12   24:invokespecial   #28  <Method void Descriptors$FileDescriptor$Syntax(String, int, String)>
		//   13   27:putstatic       #35  <Field Descriptors$FileDescriptor$Syntax PROTO2>
			PROTO3 = new FileDescriptor.Syntax("PROTO3", 2, "proto3");
		//   14   30:new             #2   <Class Descriptors$FileDescriptor$Syntax>
		//   15   33:dup             
		//   16   34:ldc1            #36  <String "PROTO3">
		//   17   36:iconst_2        
		//   18   37:ldc1            #38  <String "proto3">
		//   19   39:invokespecial   #28  <Method void Descriptors$FileDescriptor$Syntax(String, int, String)>
		//   20   42:putstatic       #40  <Field Descriptors$FileDescriptor$Syntax PROTO3>
			$VALUES = (new FileDescriptor.Syntax[] {
				UNKNOWN, PROTO2, PROTO3
			});
		//   21   45:iconst_3        
		//   22   46:anewarray       FileDescriptor.Syntax[]
		//   23   49:dup             
		//   24   50:iconst_0        
		//   25   51:getstatic       #30  <Field Descriptors$FileDescriptor$Syntax UNKNOWN>
		//   26   54:aastore         
		//   27   55:dup             
		//   28   56:iconst_1        
		//   29   57:getstatic       #35  <Field Descriptors$FileDescriptor$Syntax PROTO2>
		//   30   60:aastore         
		//   31   61:dup             
		//   32   62:iconst_2        
		//   33   63:getstatic       #40  <Field Descriptors$FileDescriptor$Syntax PROTO3>
		//   34   66:aastore         
		//   35   67:putstatic       #42  <Field Descriptors$FileDescriptor$Syntax[] $VALUES>
		//*  36   70:return          
		}


/*
		static String access$000(FileDescriptor.Syntax syntax)
		{
			return syntax.name;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field String name>
		//    2    4:areturn         
		}

*/

		private FileDescriptor.Syntax(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #46  <Method void Enum(String, int)>
			name = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #48  <Field String name>
		//    7   11:return          
		}
	}

	public static abstract class GenericDescriptor
	{

		public abstract FileDescriptor getFile();

		public abstract String getFullName();

		public abstract String getName();

		public abstract Message toProto();

		public GenericDescriptor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class MethodDescriptor extends GenericDescriptor
	{

		private void crossLink()
			throws DescriptorValidationException
		{
			GenericDescriptor genericdescriptor = file.pool.lookupSymbol(proto.getInputType(), ((GenericDescriptor) (this)), DescriptorPool.SearchFilter.TYPES_ONLY);
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
			if(!(genericdescriptor instanceof Descriptor))
		//*  10   22:aload_1         
		//*  11   23:instanceof      #104 <Class Descriptors$Descriptor>
		//*  12   26:ifne            69
				throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append('"').append(proto.getInputType()).append("\" is not a message type.").toString(), ((_cls1) (null)));
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
			inputType = (Descriptor)genericdescriptor;
		//   31   69:aload_0         
		//   32   70:aload_1         
		//   33   71:checkcast       #104 <Class Descriptors$Descriptor>
		//   34   74:putfield        #111 <Field Descriptors$Descriptor inputType>
			genericdescriptor = file.pool.lookupSymbol(proto.getOutputType(), ((GenericDescriptor) (this)), DescriptorPool.SearchFilter.TYPES_ONLY);
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
			if(!(genericdescriptor instanceof Descriptor))
		//*  45   99:aload_1         
		//*  46  100:instanceof      #104 <Class Descriptors$Descriptor>
		//*  47  103:ifne            146
			{
				throw new DescriptorValidationException(((GenericDescriptor) (this)), (new StringBuilder()).append('"').append(proto.getOutputType()).append("\" is not a message type.").toString(), ((_cls1) (null)));
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
				outputType = (Descriptor)genericdescriptor;
		//   66  146:aload_0         
		//   67  147:aload_1         
		//   68  148:checkcast       #104 <Class Descriptors$Descriptor>
		//   69  151:putfield        #116 <Field Descriptors$Descriptor outputType>
				return;
		//   70  154:return          
			}
		}

		private void setProto(DescriptorProtos.MethodDescriptorProto methoddescriptorproto)
		{
			proto = methoddescriptorproto;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
		//    3    5:return          
		}

		public FileDescriptor getFile()
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

		public Descriptor getInputType()
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

		public DescriptorProtos.MethodOptions getOptions()
		{
			return proto.getOptions();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
		//    2    4:invokevirtual   #125 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodDescriptorProto.getOptions()>
		//    3    7:areturn         
		}

		public Descriptor getOutputType()
		{
			return outputType;
		//    0    0:aload_0         
		//    1    1:getfield        #116 <Field Descriptors$Descriptor outputType>
		//    2    4:areturn         
		}

		public ServiceDescriptor getService()
		{
			return service;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Descriptors$ServiceDescriptor service>
		//    2    4:areturn         
		}

		public DescriptorProtos.MethodDescriptorProto toProto()
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

		private final FileDescriptor file;
		private final String fullName;
		private final int index;
		private Descriptor inputType;
		private Descriptor outputType;
		private DescriptorProtos.MethodDescriptorProto proto;
		private final ServiceDescriptor service;


/*
		static void access$2900(MethodDescriptor methoddescriptor)
			throws DescriptorValidationException
		{
			methoddescriptor.crossLink();
		//    0    0:aload_0         
		//    1    1:invokespecial   #83  <Method void crossLink()>
			return;
		//    2    4:return          
		}

*/


/*
		static void access$3000(MethodDescriptor methoddescriptor, DescriptorProtos.MethodDescriptorProto methoddescriptorproto)
		{
			methoddescriptor.setProto(methoddescriptorproto);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #89  <Method void setProto(DescriptorProtos$MethodDescriptorProto)>
			return;
		//    3    5:return          
		}

*/

		private MethodDescriptor(DescriptorProtos.MethodDescriptorProto methoddescriptorproto, FileDescriptor filedescriptor, ServiceDescriptor servicedescriptor, int i)
			throws DescriptorValidationException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Descriptors$GenericDescriptor()>
			index = i;
		//    2    4:aload_0         
		//    3    5:iload           4
		//    4    7:putfield        #29  <Field int index>
			proto = methoddescriptorproto;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #31  <Field DescriptorProtos$MethodDescriptorProto proto>
			file = filedescriptor;
		//    8   15:aload_0         
		//    9   16:aload_2         
		//   10   17:putfield        #33  <Field Descriptors$FileDescriptor file>
			service = servicedescriptor;
		//   11   20:aload_0         
		//   12   21:aload_3         
		//   13   22:putfield        #35  <Field Descriptors$ServiceDescriptor service>
			fullName = (new StringBuilder()).append(servicedescriptor.getFullName()).append('.').append(methoddescriptorproto.getName()).toString();
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
			filedescriptor.pool.addSymbol(((GenericDescriptor) (this)));
		//   28   58:aload_2         
		//   29   59:invokestatic    #67  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//   30   62:aload_0         
		//   31   63:invokevirtual   #73  <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
		//   32   66:return          
		}

	}

	public static final class OneofDescriptor
	{

		private void setProto(DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
		{
			proto = oneofdescriptorproto;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field DescriptorProtos$OneofDescriptorProto proto>
		//    3    5:return          
		}

		public Descriptor getContainingType()
		{
			return containingType;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Descriptors$Descriptor containingType>
		//    2    4:areturn         
		}

		public FieldDescriptor getField(int i)
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

		public FileDescriptor getFile()
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

		public DescriptorProtos.OneofOptions getOptions()
		{
			return proto.getOptions();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field DescriptorProtos$OneofDescriptorProto proto>
		//    2    4:invokevirtual   #100 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofDescriptorProto.getOptions()>
		//    3    7:areturn         
		}

		private Descriptor containingType;
		private int fieldCount;
		private FieldDescriptor fields[];
		private final FileDescriptor file;
		private final String fullName;
		private final int index;
		private DescriptorProtos.OneofDescriptorProto proto;


/*
		static FieldDescriptor[] access$1800(OneofDescriptor oneofdescriptor)
		{
			return oneofdescriptor.fields;
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field Descriptors$FieldDescriptor[] fields>
		//    2    4:areturn         
		}

*/


/*
		static FieldDescriptor[] access$1802(OneofDescriptor oneofdescriptor, FieldDescriptor afielddescriptor[])
		{
			oneofdescriptor.fields = afielddescriptor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #58  <Field Descriptors$FieldDescriptor[] fields>
			return afielddescriptor;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static int access$1902(OneofDescriptor oneofdescriptor, int i)
		{
			oneofdescriptor.fieldCount = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #49  <Field int fieldCount>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static int access$1908(OneofDescriptor oneofdescriptor)
		{
			int i = oneofdescriptor.fieldCount;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int fieldCount>
		//    2    4:istore_1        
			oneofdescriptor.fieldCount = i + 1;
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
		static void access$2000(OneofDescriptor oneofdescriptor, DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
		{
			oneofdescriptor.setProto(oneofdescriptorproto);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #70  <Method void setProto(DescriptorProtos$OneofDescriptorProto)>
			return;
		//    3    5:return          
		}

*/

		private OneofDescriptor(DescriptorProtos.OneofDescriptorProto oneofdescriptorproto, FileDescriptor filedescriptor, Descriptor descriptor, int i)
			throws DescriptorValidationException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			proto = oneofdescriptorproto;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #29  <Field DescriptorProtos$OneofDescriptorProto proto>
			fullName = Descriptors.computeFullName(filedescriptor, descriptor, oneofdescriptorproto.getName());
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

	}

	public static final class ServiceDescriptor extends GenericDescriptor
	{

		private void crossLink()
			throws DescriptorValidationException
		{
			MethodDescriptor amethoddescriptor[] = methods;
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
				amethoddescriptor[i].crossLink();
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

		private void setProto(DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
		{
			proto = servicedescriptorproto;
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
				methods[i].setProto(servicedescriptorproto.getMethod(i));
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

		public MethodDescriptor findMethodByName(String s)
		{
			s = ((String) (file.pool.findSymbol((new StringBuilder()).append(fullName).append('.').append(s).toString())));
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
			if(s != null && (s instanceof MethodDescriptor))
		//*  16   37:aload_1         
		//*  17   38:ifnull          53
		//*  18   41:aload_1         
		//*  19   42:instanceof      #48  <Class Descriptors$MethodDescriptor>
		//*  20   45:ifeq            53
				return (MethodDescriptor)s;
		//   21   48:aload_1         
		//   22   49:checkcast       #48  <Class Descriptors$MethodDescriptor>
		//   23   52:areturn         
			else
				return null;
		//   24   53:aconst_null     
		//   25   54:areturn         
		}

		public FileDescriptor getFile()
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

		public DescriptorProtos.ServiceOptions getOptions()
		{
			return proto.getOptions();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field DescriptorProtos$ServiceDescriptorProto proto>
		//    2    4:invokevirtual   #136 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceDescriptorProto.getOptions()>
		//    3    7:areturn         
		}

		public DescriptorProtos.ServiceDescriptorProto toProto()
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

		private final FileDescriptor file;
		private final String fullName;
		private final int index;
		private MethodDescriptor methods[];
		private DescriptorProtos.ServiceDescriptorProto proto;


/*
		static void access$1200(ServiceDescriptor servicedescriptor, DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
		{
			servicedescriptor.setProto(servicedescriptorproto);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #80  <Method void setProto(DescriptorProtos$ServiceDescriptorProto)>
			return;
		//    3    5:return          
		}

*/


/*
		static void access$800(ServiceDescriptor servicedescriptor)
			throws DescriptorValidationException
		{
			servicedescriptor.crossLink();
		//    0    0:aload_0         
		//    1    1:invokespecial   #85  <Method void crossLink()>
			return;
		//    2    4:return          
		}

*/

		private ServiceDescriptor(DescriptorProtos.ServiceDescriptorProto servicedescriptorproto, FileDescriptor filedescriptor, int i)
			throws DescriptorValidationException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Descriptors$GenericDescriptor()>
			index = i;
		//    2    4:aload_0         
		//    3    5:iload_3         
		//    4    6:putfield        #26  <Field int index>
			proto = servicedescriptorproto;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #28  <Field DescriptorProtos$ServiceDescriptorProto proto>
			fullName = Descriptors.computeFullName(filedescriptor, ((Descriptor) (null)), servicedescriptorproto.getName());
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
			methods = new MethodDescriptor[servicedescriptorproto.getMethodCount()];
		//   18   32:aload_0         
		//   19   33:aload_1         
		//   20   34:invokevirtual   #46  <Method int DescriptorProtos$ServiceDescriptorProto.getMethodCount()>
		//   21   37:anewarray       MethodDescriptor[]
		//   22   40:putfield        #50  <Field Descriptors$MethodDescriptor[] methods>
			for(i = 0; i < servicedescriptorproto.getMethodCount(); i++)
		//*  23   43:iconst_0        
		//*  24   44:istore_3        
		//*  25   45:iload_3         
		//*  26   46:aload_1         
		//*  27   47:invokevirtual   #46  <Method int DescriptorProtos$ServiceDescriptorProto.getMethodCount()>
		//*  28   50:icmpge          82
				methods[i] = new MethodDescriptor(servicedescriptorproto.getMethod(i), filedescriptor, this, i);
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
			filedescriptor.pool.addSymbol(((GenericDescriptor) (this)));
		//   48   82:aload_2         
		//   49   83:invokestatic    #63  <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
		//   50   86:aload_0         
		//   51   87:invokevirtual   #69  <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
		//   52   90:return          
		}

	}


	public Descriptors()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:return          
	}

	private static String computeFullName(FileDescriptor filedescriptor, Descriptor descriptor, String s)
	{
		if(descriptor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
			return (new StringBuilder()).append(descriptor.getFullName()).append('.').append(s).toString();
	//    2    4:new             #91  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #92  <Method void StringBuilder()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #95  <Method String Descriptors$Descriptor.getFullName()>
	//    7   15:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:bipush          46
	//    9   20:invokevirtual   #102 <Method StringBuilder StringBuilder.append(char)>
	//   10   23:aload_2         
	//   11   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   13   30:areturn         
		if(filedescriptor.getPackage().length() > 0)
	//*  14   31:aload_0         
	//*  15   32:invokevirtual   #108 <Method String Descriptors$FileDescriptor.getPackage()>
	//*  16   35:invokevirtual   #114 <Method int String.length()>
	//*  17   38:ifle            68
			return (new StringBuilder()).append(filedescriptor.getPackage()).append('.').append(s).toString();
	//   18   41:new             #91  <Class StringBuilder>
	//   19   44:dup             
	//   20   45:invokespecial   #92  <Method void StringBuilder()>
	//   21   48:aload_0         
	//   22   49:invokevirtual   #108 <Method String Descriptors$FileDescriptor.getPackage()>
	//   23   52:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   24   55:bipush          46
	//   25   57:invokevirtual   #102 <Method StringBuilder StringBuilder.append(char)>
	//   26   60:aload_2         
	//   27   61:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   28   64:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   29   67:areturn         
		else
			return s;
	//   30   68:aload_2         
	//   31   69:areturn         
	}

	private static final Logger logger = Logger.getLogger(((Class) (com/google/protobuf/Descriptors)).getName());

	static 
	{
	//    0    0:ldc1            #2   <Class Descriptors>
	//    1    2:invokevirtual   #70  <Method String Class.getName()>
	//    2    5:invokestatic    #76  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #78  <Field Logger logger>
	//*   4   11:return          
	}


/*
	static Logger access$100()
	{
		return logger;
	//    0    0:getstatic       #78  <Field Logger logger>
	//    1    3:areturn         
	}

*/


/*
	static String access$1600(FileDescriptor filedescriptor, Descriptor descriptor, String s)
	{
		return computeFullName(filedescriptor, descriptor, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #89  <Method String computeFullName(Descriptors$FileDescriptor, Descriptors$Descriptor, String)>
	//    4    6:areturn         
	}

*/
}
