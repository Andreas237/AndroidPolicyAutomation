// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.*;
import java.util.logging.Logger;

// Referenced classes of package com.google.protobuf:
//			Descriptors, Message

static final class Descriptors$DescriptorPool
{
	static final class DescriptorIntPair
	{

		public boolean equals(Object obj)
		{
			if(!(obj instanceof DescriptorIntPair))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class Descriptors$DescriptorPool$DescriptorIntPair>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			obj = ((Object) ((DescriptorIntPair)obj));
		//    5    9:aload_1         
		//    6   10:checkcast       #2   <Class Descriptors$DescriptorPool$DescriptorIntPair>
		//    7   13:astore_1        
			return descriptor == ((DescriptorIntPair) (obj)).descriptor && number == ((DescriptorIntPair) (obj)).number;
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

		private final Descriptors.GenericDescriptor descriptor;
		private final int number;

		DescriptorIntPair(Descriptors.GenericDescriptor genericdescriptor, int i)
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

	static final class PackageDescriptor extends Descriptors.GenericDescriptor
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

		PackageDescriptor(String s, String s1, Descriptors.FileDescriptor filedescriptor)
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

	static final class SearchFilter extends Enum
	{

		public static SearchFilter valueOf(String s)
		{
			return (SearchFilter)Enum.valueOf(com/google/protobuf/Descriptors$DescriptorPool$SearchFilter, s);
		//    0    0:ldc1            #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//    1    2:aload_0         
		//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//    4    9:areturn         
		}

		public static SearchFilter[] values()
		{
			return (SearchFilter[])((SearchFilter []) ($VALUES)).clone();
		//    0    0:getstatic       #34  <Field Descriptors$DescriptorPool$SearchFilter[] $VALUES>
		//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.google.protobuf.Descriptors$DescriptorPool$SearchFilter_3B_.clone()>
		//    2    6:checkcast       #45  <Class Descriptors$DescriptorPool$SearchFilter[]>
		//    3    9:areturn         
		}

		private static final SearchFilter $VALUES[];
		public static final SearchFilter AGGREGATES_ONLY;
		public static final SearchFilter ALL_SYMBOLS;
		public static final SearchFilter TYPES_ONLY;

		static 
		{
			TYPES_ONLY = new SearchFilter("TYPES_ONLY", 0);
		//    0    0:new             #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "TYPES_ONLY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void Descriptors$DescriptorPool$SearchFilter(String, int)>
		//    5   10:putstatic       #26  <Field Descriptors$DescriptorPool$SearchFilter TYPES_ONLY>
			AGGREGATES_ONLY = new SearchFilter("AGGREGATES_ONLY", 1);
		//    6   13:new             #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "AGGREGATES_ONLY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void Descriptors$DescriptorPool$SearchFilter(String, int)>
		//   11   23:putstatic       #29  <Field Descriptors$DescriptorPool$SearchFilter AGGREGATES_ONLY>
			ALL_SYMBOLS = new SearchFilter("ALL_SYMBOLS", 2);
		//   12   26:new             #2   <Class Descriptors$DescriptorPool$SearchFilter>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "ALL_SYMBOLS">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void Descriptors$DescriptorPool$SearchFilter(String, int)>
		//   17   36:putstatic       #32  <Field Descriptors$DescriptorPool$SearchFilter ALL_SYMBOLS>
			$VALUES = (new SearchFilter[] {
				TYPES_ONLY, AGGREGATES_ONLY, ALL_SYMBOLS
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       SearchFilter[]
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

		private SearchFilter(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #36  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private void importPublicDependencies(Descriptors$FileDescriptor descriptors$filedescriptor)
	{
		descriptors$filedescriptor = ((Descriptors$FileDescriptor) (descriptors$filedescriptor.getPublicDependencies().iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #98  <Method List Descriptors$FileDescriptor.getPublicDependencies()>
	//    2    4:invokeinterface #101 <Method Iterator List.iterator()>
	//    3    9:astore_1        
		do
		{
			if(!((Iterator) (descriptors$filedescriptor)).hasNext())
				break;
	//    4   10:aload_1         
	//    5   11:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            50
			Descriptors$FileDescriptor descriptors$filedescriptor1 = (Descriptors$FileDescriptor)((Iterator) (descriptors$filedescriptor)).next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #75  <Method Object Iterator.next()>
	//    9   25:checkcast       #77  <Class Descriptors$FileDescriptor>
	//   10   28:astore_2        
			if(dependencies.add(((Object) (descriptors$filedescriptor1))))
	//*  11   29:aload_0         
	//*  12   30:getfield        #49  <Field Set dependencies>
	//*  13   33:aload_2         
	//*  14   34:invokeinterface #57  <Method boolean Set.add(Object)>
	//*  15   39:ifeq            47
				importPublicDependencies(descriptors$filedescriptor1);
	//   16   42:aload_0         
	//   17   43:aload_2         
	//   18   44:invokespecial   #61  <Method void importPublicDependencies(Descriptors$FileDescriptor)>
		} while(true);
	//   19   47:goto            10
	//   20   50:return          
	}

	static void validateSymbolName(or or)
		throws ationException
	{
		String s = or.getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method String Descriptors$GenericDescriptor.getName()>
	//    2    4:astore          5
		if(s.length() == 0)
	//*   3    6:aload           5
	//*   4    8:invokevirtual   #114 <Method int String.length()>
	//*   5   11:ifne            26
			throw new ationException(or, "Missing name.", ((Descriptors._cls1) (null)));
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
			throw new ationException(or, (new StringBuilder()).append('"').append(s).append("\" is not a valid identifier.").toString(), ((Descriptors._cls1) (null)));
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

	void addEnumValueByNumber(ptor ptor)
	{
		DescriptorIntPair descriptorintpair = new DescriptorIntPair(((or) (ptor.getType())), ptor.getNumber());
	//    0    0:new             #9   <Class Descriptors$DescriptorPool$DescriptorIntPair>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method Descriptors$EnumDescriptor Descriptors$EnumValueDescriptor.getType()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #159 <Method int Descriptors$EnumValueDescriptor.getNumber()>
	//    6   12:invokespecial   #162 <Method void Descriptors$DescriptorPool$DescriptorIntPair(Descriptors$GenericDescriptor, int)>
	//    7   15:astore_2        
		ptor = (ptor)enumValuesByNumber.put(((Object) (descriptorintpair)), ((Object) (ptor)));
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field Map enumValuesByNumber>
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokeinterface #168 <Method Object Map.put(Object, Object)>
	//   13   27:checkcast       #152 <Class Descriptors$EnumValueDescriptor>
	//   14   30:astore_1        
		if(ptor != null)
	//*  15   31:aload_1         
	//*  16   32:ifnull          47
			enumValuesByNumber.put(((Object) (descriptorintpair)), ((Object) (ptor)));
	//   17   35:aload_0         
	//   18   36:getfield        #44  <Field Map enumValuesByNumber>
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokeinterface #168 <Method Object Map.put(Object, Object)>
	//   22   46:pop             
	//   23   47:return          
	}

	void addFieldByNumber( )
		throws ationException
	{
		DescriptorIntPair descriptorintpair = new DescriptorIntPair(((or) (.getContainingType())), .getNumber());
	//    0    0:new             #9   <Class Descriptors$DescriptorPool$DescriptorIntPair>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #176 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getContainingType()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #177 <Method int Descriptors$FieldDescriptor.getNumber()>
	//    6   12:invokespecial   #162 <Method void Descriptors$DescriptorPool$DescriptorIntPair(Descriptors$GenericDescriptor, int)>
	//    7   15:astore_2        
		 1 = ()fieldsByNumber.put(((Object) (descriptorintpair)), ((Object) ()));
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field Map fieldsByNumber>
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokeinterface #168 <Method Object Map.put(Object, Object)>
	//   13   27:checkcast       #172 <Class Descriptors$FieldDescriptor>
	//   14   30:astore_3        
		if(1 != null)
	//*  15   31:aload_3         
	//*  16   32:ifnull          111
		{
			fieldsByNumber.put(((Object) (descriptorintpair)), ((Object) (1)));
	//   17   35:aload_0         
	//   18   36:getfield        #42  <Field Map fieldsByNumber>
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokeinterface #168 <Method Object Map.put(Object, Object)>
	//   22   46:pop             
			throw new ationException(((or) ()), (new StringBuilder()).append("Field number ").append(.getNumber()).append(" has already been used in \"").append(.getContainingType().getFullName()).append("\" by field \"").append(1.getName()).append("\".").toString(), ((Descriptors._cls1) (null)));
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

	void addPackage(String s, Descriptors$FileDescriptor descriptors$filedescriptor)
		throws ationException
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
			addPackage(s.substring(0, i), descriptors$filedescriptor);
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
		or or = (or)descriptorsByName.put(((Object) (s)), ((Object) (new PackageDescriptor(s1, s, descriptors$filedescriptor))));
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
		if(or != null)
	//*  35   64:aload           5
	//*  36   66:ifnull          141
		{
			descriptorsByName.put(((Object) (s)), ((Object) (or)));
	//   37   69:aload_0         
	//   38   70:getfield        #40  <Field Map descriptorsByName>
	//   39   73:aload_1         
	//   40   74:aload           5
	//   41   76:invokeinterface #168 <Method Object Map.put(Object, Object)>
	//   42   81:pop             
			if(!(or instanceof PackageDescriptor))
	//*  43   82:aload           5
	//*  44   84:instanceof      #12  <Class Descriptors$DescriptorPool$PackageDescriptor>
	//*  45   87:ifne            141
				throw new ationException(descriptors$filedescriptor, (new StringBuilder()).append('"').append(s1).append("\" is already defined (as something other than a package) in file \"").append(or.getFile().getName()).append("\".").toString(), ((Descriptors._cls1) (null)));
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

	void addSymbol(or or)
		throws ationException
	{
		validateSymbolName(or);
	//    0    0:aload_1         
	//    1    1:invokestatic    #221 <Method void validateSymbolName(Descriptors$GenericDescriptor)>
		String s = or.getFullName();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #222 <Method String Descriptors$GenericDescriptor.getFullName()>
	//    4    8:astore_3        
		int i = s.lastIndexOf('.');
	//    5    9:aload_3         
	//    6   10:bipush          46
	//    7   12:invokevirtual   #198 <Method int String.lastIndexOf(int)>
	//    8   15:istore_2        
		or or1 = (or)descriptorsByName.put(((Object) (s)), ((Object) (or)));
	//    9   16:aload_0         
	//   10   17:getfield        #40  <Field Map descriptorsByName>
	//   11   20:aload_3         
	//   12   21:aload_1         
	//   13   22:invokeinterface #168 <Method Object Map.put(Object, Object)>
	//   14   27:checkcast       #105 <Class Descriptors$GenericDescriptor>
	//   15   30:astore          4
		if(or1 != null)
	//*  16   32:aload           4
	//*  17   34:ifnull          205
		{
			descriptorsByName.put(((Object) (s)), ((Object) (or1)));
	//   18   37:aload_0         
	//   19   38:getfield        #40  <Field Map descriptorsByName>
	//   20   41:aload_3         
	//   21   42:aload           4
	//   22   44:invokeinterface #168 <Method Object Map.put(Object, Object)>
	//   23   49:pop             
			if(or.getFile() == or1.getFile())
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
					throw new ationException(or, (new StringBuilder()).append('"').append(s).append("\" is already defined.").toString(), ((Descriptors._cls1) (null)));
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
					throw new ationException(or, (new StringBuilder()).append('"').append(s.substring(i + 1)).append("\" is already defined in \"").append(s.substring(0, i)).append("\".").toString(), ((Descriptors._cls1) (null)));
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
				throw new ationException(or, (new StringBuilder()).append('"').append(s).append("\" is already defined in file \"").append(or1.getFile().getName()).append("\".").toString(), ((Descriptors._cls1) (null)));
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

	or findSymbol(String s)
	{
		return findSymbol(s, SearchFilter.ALL_SYMBOLS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #234 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.ALL_SYMBOLS>
	//    3    5:invokevirtual   #237 <Method Descriptors$GenericDescriptor findSymbol(String, Descriptors$DescriptorPool$SearchFilter)>
	//    4    8:areturn         
	}

	or findSymbol(String s, SearchFilter searchfilter)
	{
		or or = (or)descriptorsByName.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Map descriptorsByName>
	//    2    4:aload_1         
	//    3    5:invokeinterface #241 <Method Object Map.get(Object)>
	//    4   10:checkcast       #105 <Class Descriptors$GenericDescriptor>
	//    5   13:astore_3        
		if(or != null && (searchfilter == SearchFilter.ALL_SYMBOLS || searchfilter == SearchFilter.TYPES_ONLY && isType(or) || searchfilter == SearchFilter.AGGREGATES_ONLY && isAggregate(or)))
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
			return or;
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
			or or1 = (or)Descriptors$FileDescriptor.access$1400((Descriptors$FileDescriptor)iterator.next()).descriptorsByName.get(((Object) (s)));
	//   34   76:aload_3         
	//   35   77:invokeinterface #75  <Method Object Iterator.next()>
	//   36   82:checkcast       #77  <Class Descriptors$FileDescriptor>
	//   37   85:invokestatic    #258 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//   38   88:getfield        #40  <Field Map descriptorsByName>
	//   39   91:aload_1         
	//   40   92:invokeinterface #241 <Method Object Map.get(Object)>
	//   41   97:checkcast       #105 <Class Descriptors$GenericDescriptor>
	//   42  100:astore          4
			if(or1 != null && (searchfilter == SearchFilter.ALL_SYMBOLS || searchfilter == SearchFilter.TYPES_ONLY && isType(or1) || searchfilter == SearchFilter.AGGREGATES_ONLY && isAggregate(or1)))
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
				return or1;
	//   62  146:aload           4
	//   63  148:areturn         
		}

	//*  64  149:goto            67
		return null;
	//   65  152:aconst_null     
	//   66  153:areturn         
	}

	boolean isAggregate(or or)
	{
		return (or instanceof Descriptors.Descriptor) || (or instanceof Descriptors$EnumDescriptor) || (or instanceof PackageDescriptor) || (or instanceof or);
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

	boolean isType(or or)
	{
		return (or instanceof Descriptors.Descriptor) || (or instanceof Descriptors$EnumDescriptor);
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

	or lookupSymbol(String s, or or, SearchFilter searchfilter)
		throws ationException
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
			StringBuilder stringbuilder = new StringBuilder(or.getFullName());
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
				Descriptors.access$100().warning((new StringBuilder()).append("The descriptor for message type \"").append(s).append("\" can not be found and a placeholder is created for it").toString());
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
				s = ((String) (new Descriptors.Descriptor(((String) (obj1)))));
	//  115  246:new             #186 <Class Descriptors$Descriptor>
	//  116  249:dup             
	//  117  250:aload           7
	//  118  252:invokespecial   #297 <Method void Descriptors$Descriptor(String)>
	//  119  255:astore_1        
				dependencies.add(((Object) (((or) (s)).getFile())));
	//  120  256:aload_0         
	//  121  257:getfield        #49  <Field Set dependencies>
	//  122  260:aload_1         
	//  123  261:invokevirtual   #214 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
	//  124  264:invokeinterface #57  <Method boolean Set.add(Object)>
	//  125  269:pop             
				return ((or) (s));
	//  126  270:aload_1         
	//  127  271:areturn         
			} else
			{
				throw new ationException(or, (new StringBuilder()).append('"').append(s).append("\" is not defined.").toString(), ((Descriptors._cls1) (null)));
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
			return ((or) (obj));
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
	static Map access$1500(Descriptors$DescriptorPool descriptors$descriptorpool)
	{
		return descriptors$descriptorpool.fieldsByNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map fieldsByNumber>
	//    2    4:areturn         
	}

*/


/*
	static Map access$2400(Descriptors$DescriptorPool descriptors$descriptorpool)
	{
		return descriptors$descriptorpool.enumValuesByNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Map enumValuesByNumber>
	//    2    4:areturn         
	}

*/

	Descriptors$DescriptorPool(Descriptors$FileDescriptor adescriptors$filedescriptor[], boolean flag)
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
		for(int i = 0; i < adescriptors$filedescriptor.length; i++)
	//*  25   53:iconst_0        
	//*  26   54:istore_3        
	//*  27   55:iload_3         
	//*  28   56:aload_1         
	//*  29   57:arraylength     
	//*  30   58:icmpge          88
		{
			dependencies.add(((Object) (adescriptors$filedescriptor[i])));
	//   31   61:aload_0         
	//   32   62:getfield        #49  <Field Set dependencies>
	//   33   65:aload_1         
	//   34   66:iload_3         
	//   35   67:aaload          
	//   36   68:invokeinterface #57  <Method boolean Set.add(Object)>
	//   37   73:pop             
			importPublicDependencies(adescriptors$filedescriptor[i]);
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
		for(adescriptors$filedescriptor = ((Descriptors$FileDescriptor []) (dependencies.iterator())); ((Iterator) (adescriptors$filedescriptor)).hasNext();)
	//*  48   88:aload_0         
	//*  49   89:getfield        #49  <Field Set dependencies>
	//*  50   92:invokeinterface #65  <Method Iterator Set.iterator()>
	//*  51   97:astore_1        
	//*  52   98:aload_1         
	//*  53   99:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  54  104:ifeq            145
		{
			Descriptors$FileDescriptor descriptors$filedescriptor = (Descriptors$FileDescriptor)((Iterator) (adescriptors$filedescriptor)).next();
	//   55  107:aload_1         
	//   56  108:invokeinterface #75  <Method Object Iterator.next()>
	//   57  113:checkcast       #77  <Class Descriptors$FileDescriptor>
	//   58  116:astore          4
			try
			{
				addPackage(descriptors$filedescriptor.getPackage(), descriptors$filedescriptor);
	//   59  118:aload_0         
	//   60  119:aload           4
	//   61  121:invokevirtual   #81  <Method String Descriptors$FileDescriptor.getPackage()>
	//   62  124:aload           4
	//   63  126:invokevirtual   #85  <Method void addPackage(String, Descriptors$FileDescriptor)>
			}
	//*  64  129:goto            142
			// Misplaced declaration of an exception variable
			catch(Descriptors$FileDescriptor adescriptors$filedescriptor[])
	//*  65  132:astore_1        
			{
				throw new AssertionError(((Object) (adescriptors$filedescriptor)));
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
