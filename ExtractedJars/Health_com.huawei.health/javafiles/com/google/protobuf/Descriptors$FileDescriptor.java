// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.Logger;

// Referenced classes of package com.google.protobuf:
//			Descriptors, InvalidProtocolBufferException, Internal, ExtensionRegistry, 
//			Message

public static final class Descriptors$FileDescriptor extends or
{
	public static interface InternalDescriptorAssigner
	{

		public abstract ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor filedescriptor);
	}

	public static final class Syntax extends Enum
	{

		public static Syntax valueOf(String s)
		{
			return (Syntax)Enum.valueOf(com/google/protobuf/Descriptors$FileDescriptor$Syntax, s);
		//    0    0:ldc1            #2   <Class Descriptors$FileDescriptor$Syntax>
		//    1    2:aload_0         
		//    2    3:invokestatic    #57  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Descriptors$FileDescriptor$Syntax>
		//    4    9:areturn         
		}

		public static Syntax[] values()
		{
			return (Syntax[])((Syntax []) ($VALUES)).clone();
		//    0    0:getstatic       #42  <Field Descriptors$FileDescriptor$Syntax[] $VALUES>
		//    1    3:invokevirtual   #64  <Method Object _5B_Lcom.google.protobuf.Descriptors$FileDescriptor$Syntax_3B_.clone()>
		//    2    6:checkcast       #60  <Class Descriptors$FileDescriptor$Syntax[]>
		//    3    9:areturn         
		}

		private static final Syntax $VALUES[];
		public static final Syntax PROTO2;
		public static final Syntax PROTO3;
		public static final Syntax UNKNOWN;
		private final String name;

		static 
		{
			UNKNOWN = new Syntax("UNKNOWN", 0, "unknown");
		//    0    0:new             #2   <Class Descriptors$FileDescriptor$Syntax>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "unknown">
		//    5    9:invokespecial   #28  <Method void Descriptors$FileDescriptor$Syntax(String, int, String)>
		//    6   12:putstatic       #30  <Field Descriptors$FileDescriptor$Syntax UNKNOWN>
			PROTO2 = new Syntax("PROTO2", 1, "proto2");
		//    7   15:new             #2   <Class Descriptors$FileDescriptor$Syntax>
		//    8   18:dup             
		//    9   19:ldc1            #31  <String "PROTO2">
		//   10   21:iconst_1        
		//   11   22:ldc1            #33  <String "proto2">
		//   12   24:invokespecial   #28  <Method void Descriptors$FileDescriptor$Syntax(String, int, String)>
		//   13   27:putstatic       #35  <Field Descriptors$FileDescriptor$Syntax PROTO2>
			PROTO3 = new Syntax("PROTO3", 2, "proto3");
		//   14   30:new             #2   <Class Descriptors$FileDescriptor$Syntax>
		//   15   33:dup             
		//   16   34:ldc1            #36  <String "PROTO3">
		//   17   36:iconst_2        
		//   18   37:ldc1            #38  <String "proto3">
		//   19   39:invokespecial   #28  <Method void Descriptors$FileDescriptor$Syntax(String, int, String)>
		//   20   42:putstatic       #40  <Field Descriptors$FileDescriptor$Syntax PROTO3>
			$VALUES = (new Syntax[] {
				UNKNOWN, PROTO2, PROTO3
			});
		//   21   45:iconst_3        
		//   22   46:anewarray       Syntax[]
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
		static String access$000(Syntax syntax)
		{
			return syntax.name;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field String name>
		//    2    4:areturn         
		}

*/

		private Syntax(String s, int i, String s1)
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


	public static Descriptors$FileDescriptor buildFrom(ptorProto ptorproto, Descriptors$FileDescriptor adescriptors$filedescriptor[])
		throws ationException
	{
		return buildFrom(ptorproto, adescriptors$filedescriptor, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #225 <Method Descriptors$FileDescriptor buildFrom(DescriptorProtos$FileDescriptorProto, Descriptors$FileDescriptor[], boolean)>
	//    4    6:areturn         
	}

	public static Descriptors$FileDescriptor buildFrom(ptorProto ptorproto, Descriptors$FileDescriptor adescriptors$filedescriptor[], boolean flag)
		throws ationException
	{
		ptorproto = ((ptorProto) (new Descriptors$FileDescriptor(ptorproto, adescriptors$filedescriptor, new Descriptors$DescriptorPool(adescriptors$filedescriptor, flag), flag)));
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
		((Descriptors$FileDescriptor) (ptorproto)).crossLink();
	//   12   20:aload_0         
	//   13   21:invokespecial   #230 <Method void crossLink()>
		return ((Descriptors$FileDescriptor) (ptorproto));
	//   14   24:aload_0         
	//   15   25:areturn         
	}

	private void crossLink()
		throws ationException
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
			Descriptors.Descriptor.access$700(aobj[i]);
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
			or.access._mth800(aobj[j]);
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
			.access._mth900(aobj[k]);
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
				((List) (arraylist)).add(((Object) ((Descriptors$FileDescriptor)class1.getClassLoader().loadClass(as1[i]).getField("descriptor").get(((Object) (null))))));
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
				Descriptors.access$100().warning((new StringBuilder()).append("Descriptors for \"").append(as2[i]).append("\" can not be found.").toString());
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
		class1 = ((Class) (new Descriptors$FileDescriptor[((List) (arraylist)).size()]));
	//   45  100:aload           6
	//   46  102:invokeinterface #107 <Method int List.size()>
	//   47  107:anewarray       Descriptors$FileDescriptor[]
	//   48  110:astore_1        
		((List) (arraylist)).toArray(((Object []) (class1)));
	//   49  111:aload           6
	//   50  113:aload_1         
	//   51  114:invokeinterface #113 <Method Object[] List.toArray(Object[])>
	//   52  119:pop             
		internalBuildGeneratedFileFrom(as, ((Descriptors$FileDescriptor []) (class1)), internaldescriptorassigner);
	//   53  120:aload_0         
	//   54  121:aload_1         
	//   55  122:aload           4
	//   56  124:invokestatic    #284 <Method void internalBuildGeneratedFileFrom(String[], Descriptors$FileDescriptor[], Descriptors$FileDescriptor$InternalDescriptorAssigner)>
	//   57  127:return          
	}

	public static void internalBuildGeneratedFileFrom(String as[], Descriptors$FileDescriptor adescriptors$filedescriptor[], InternalDescriptorAssigner internaldescriptorassigner)
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
			obj = ((Object) (ptorProto.parseFrom(((byte []) (as)))));
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
			adescriptors$filedescriptor = ((Descriptors$FileDescriptor []) (buildFrom(((ptorProto) (obj)), adescriptors$filedescriptor, true)));
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
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid embedded descriptor for \"").append(((ptorProto) (obj)).getName()).append("\".").toString(), ((Throwable) (as)));
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
		internaldescriptorassigner = ((InternalDescriptorAssigner) (internaldescriptorassigner.assignDescriptors(((Descriptors$FileDescriptor) (adescriptors$filedescriptor)))));
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
				as = ((String []) (ptorProto.parseFrom(((byte []) (as)), ((ExtensionRegistryLite) (internaldescriptorassigner)))));
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
			((Descriptors$FileDescriptor) (adescriptors$filedescriptor)).setProto(((ptorProto) (as)));
	//   80  156:aload_1         
	//   81  157:aload_0         
	//   82  158:invokespecial   #327 <Method void setProto(DescriptorProtos$FileDescriptorProto)>
		}
	//   83  161:return          
	}

	public static void internalUpdateFileDescriptor(Descriptors$FileDescriptor descriptors$filedescriptor, ExtensionRegistry extensionregistry)
	{
		ByteString bytestring = descriptors$filedescriptor.proto.toByteString();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
	//    2    4:invokevirtual   #333 <Method ByteString DescriptorProtos$FileDescriptorProto.toByteString()>
	//    3    7:astore_2        
		try
		{
			extensionregistry = ((ExtensionRegistry) (ptorProto.parseFrom(bytestring, ((ExtensionRegistryLite) (extensionregistry)))));
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokestatic    #336 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.parseFrom(ByteString, ExtensionRegistryLite)>
	//    7   13:astore_1        
		}
	//*   8   14:goto            30
		// Misplaced declaration of an exception variable
		catch(Descriptors$FileDescriptor descriptors$filedescriptor)
	//*   9   17:astore_0        
		{
			throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", ((Throwable) (descriptors$filedescriptor)));
	//   10   18:new             #306 <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc2            #308 <String "Failed to parse protocol buffer descriptor for generated code.">
	//   13   25:aload_0         
	//   14   26:invokespecial   #311 <Method void IllegalArgumentException(String, Throwable)>
	//   15   29:athrow          
		}
		descriptors$filedescriptor.setProto(((ptorProto) (extensionregistry)));
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokespecial   #327 <Method void setProto(DescriptorProtos$FileDescriptorProto)>
	//   19   35:return          
	}

	private void setProto(ptorProto ptorproto)
	{
		proto = ptorproto;
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
			Descriptors.Descriptor.access$1000(messageTypes[i], ptorproto.getMessageType(i));
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
			Descriptors$EnumDescriptor.access$1100(enumTypes[j], ptorproto.getEnumType(j));
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
			or.access._mth1200(services[k], ptorproto.getService(k));
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
			.access._mth1300(extensions[l], ptorproto.getExtension(l));
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

	public Descriptors$EnumDescriptor findEnumTypeByName(String s)
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
		if(s != null && (s instanceof Descriptors$EnumDescriptor) && ((or) (s)).getFile() == this)
	//*  30   60:aload_1         
	//*  31   61:ifnull          84
	//*  32   64:aload_1         
	//*  33   65:instanceof      #141 <Class Descriptors$EnumDescriptor>
	//*  34   68:ifeq            84
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #371 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
	//*  37   75:aload_0         
	//*  38   76:if_acmpne       84
			return (Descriptors$EnumDescriptor)s;
	//   39   79:aload_1         
	//   40   80:checkcast       #141 <Class Descriptors$EnumDescriptor>
	//   41   83:areturn         
		else
			return null;
	//   42   84:aconst_null     
	//   43   85:areturn         
	}

	public  findExtensionByName(String s)
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
		if(s != null && (s instanceof ) && ((or) (s)).getFile() == this)
	//*  30   60:aload_1         
	//*  31   61:ifnull          84
	//*  32   64:aload_1         
	//*  33   65:instanceof      #169 <Class Descriptors$FieldDescriptor>
	//*  34   68:ifeq            84
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #371 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
	//*  37   75:aload_0         
	//*  38   76:if_acmpne       84
			return ()s;
	//   39   79:aload_1         
	//   40   80:checkcast       #169 <Class Descriptors$FieldDescriptor>
	//   41   83:areturn         
		else
			return null;
	//   42   84:aconst_null     
	//   43   85:areturn         
	}

	public Descriptors.Descriptor findMessageTypeByName(String s)
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
		if(s != null && (s instanceof Descriptors.Descriptor) && ((or) (s)).getFile() == this)
	//*  30   60:aload_1         
	//*  31   61:ifnull          84
	//*  32   64:aload_1         
	//*  33   65:instanceof      #127 <Class Descriptors$Descriptor>
	//*  34   68:ifeq            84
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #371 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
	//*  37   75:aload_0         
	//*  38   76:if_acmpne       84
			return (Descriptors.Descriptor)s;
	//   39   79:aload_1         
	//   40   80:checkcast       #127 <Class Descriptors$Descriptor>
	//   41   83:areturn         
		else
			return null;
	//   42   84:aconst_null     
	//   43   85:areturn         
	}

	public or findServiceByName(String s)
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
		if(s != null && (s instanceof or) && ((or) (s)).getFile() == this)
	//*  30   60:aload_1         
	//*  31   61:ifnull          84
	//*  32   64:aload_1         
	//*  33   65:instanceof      #155 <Class Descriptors$ServiceDescriptor>
	//*  34   68:ifeq            84
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #371 <Method Descriptors$FileDescriptor Descriptors$GenericDescriptor.getFile()>
	//*  37   75:aload_0         
	//*  38   76:if_acmpne       84
			return (or)s;
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

	public Descriptors$FileDescriptor getFile()
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

	public s getOptions()
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

	public ptorProto toProto()
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

	private final Descriptors$FileDescriptor dependencies[];
	private final Descriptors$EnumDescriptor enumTypes[];
	private final  extensions[];
	private final Descriptors.Descriptor messageTypes[];
	private final Descriptors$DescriptorPool pool;
	private ptorProto proto;
	private final Descriptors$FileDescriptor publicDependencies[];
	private final or services[];


/*
	static Descriptors$DescriptorPool access$1400(Descriptors$FileDescriptor descriptors$filedescriptor)
	{
		return descriptors$filedescriptor.pool;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Descriptors$DescriptorPool pool>
	//    2    4:areturn         
	}

*/

	private Descriptors$FileDescriptor(ptorProto ptorproto, Descriptors$FileDescriptor adescriptors$filedescriptor[], Descriptors$DescriptorPool descriptors$descriptorpool, boolean flag)
		throws ationException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Descriptors$GenericDescriptor()>
		pool = descriptors$descriptorpool;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #37  <Field Descriptors$DescriptorPool pool>
		proto = ptorproto;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field DescriptorProtos$FileDescriptorProto proto>
		dependencies = (Descriptors$FileDescriptor[])((Descriptors$FileDescriptor []) (adescriptors$filedescriptor)).clone();
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
		int k1 = adescriptors$filedescriptor.length;
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
			Descriptors$FileDescriptor descriptors$filedescriptor = adescriptors$filedescriptor[i];
	//   25   48:aload_2         
	//   26   49:iload           5
	//   27   51:aaload          
	//   28   52:astore          8
			hashmap.put(((Object) (descriptors$filedescriptor.getName())), ((Object) (descriptors$filedescriptor)));
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
		adescriptors$filedescriptor = ((Descriptors$FileDescriptor []) (new ArrayList()));
	//   40   76:new             #59  <Class ArrayList>
	//   41   79:dup             
	//   42   80:invokespecial   #60  <Method void ArrayList()>
	//   43   83:astore_2        
		for(int j = 0; j < ptorproto.getPublicDependencyCount(); j++)
	//*  44   84:iconst_0        
	//*  45   85:istore          5
	//*  46   87:iload           5
	//*  47   89:aload_1         
	//*  48   90:invokevirtual   #66  <Method int DescriptorProtos$FileDescriptorProto.getPublicDependencyCount()>
	//*  49   93:icmpge          208
		{
			int l1 = ptorproto.getPublicDependency(j);
	//   50   96:aload_1         
	//   51   97:iload           5
	//   52   99:invokevirtual   #70  <Method int DescriptorProtos$FileDescriptorProto.getPublicDependency(int)>
	//   53  102:istore          6
			if(l1 < 0 || l1 >= ptorproto.getDependencyCount())
	//*  54  104:iload           6
	//*  55  106:iflt            118
	//*  56  109:iload           6
	//*  57  111:aload_1         
	//*  58  112:invokevirtual   #73  <Method int DescriptorProtos$FileDescriptorProto.getDependencyCount()>
	//*  59  115:icmplt          130
				throw new ationException(this, "Invalid public dependency index.", ((Descriptors._cls1) (null)));
	//   60  118:new             #32  <Class Descriptors$DescriptorValidationException>
	//   61  121:dup             
	//   62  122:aload_0         
	//   63  123:ldc1            #75  <String "Invalid public dependency index.">
	//   64  125:aconst_null     
	//   65  126:invokespecial   #78  <Method void Descriptors$DescriptorValidationException(Descriptors$FileDescriptor, String, Descriptors$1)>
	//   66  129:athrow          
			String s = ptorproto.getDependency(l1);
	//   67  130:aload_1         
	//   68  131:iload           6
	//   69  133:invokevirtual   #82  <Method String DescriptorProtos$FileDescriptorProto.getDependency(int)>
	//   70  136:astore          8
			Descriptors$FileDescriptor descriptors$filedescriptor1 = (Descriptors$FileDescriptor)hashmap.get(((Object) (s)));
	//   71  138:aload           7
	//   72  140:aload           8
	//   73  142:invokevirtual   #86  <Method Object HashMap.get(Object)>
	//   74  145:checkcast       #2   <Class Descriptors$FileDescriptor>
	//   75  148:astore          9
			if(descriptors$filedescriptor1 == null)
	//*  76  150:aload           9
	//*  77  152:ifnonnull       190
			{
				if(!flag)
	//*  78  155:iload           4
	//*  79  157:ifne            199
					throw new ationException(this, (new StringBuilder()).append("Invalid public dependency: ").append(s).toString(), ((Descriptors._cls1) (null)));
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
				((List) (adescriptors$filedescriptor)).add(((Object) (descriptors$filedescriptor1)));
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
		publicDependencies = new Descriptors$FileDescriptor[((List) (adescriptors$filedescriptor)).size()];
	//  103  208:aload_0         
	//  104  209:aload_2         
	//  105  210:invokeinterface #107 <Method int List.size()>
	//  106  215:anewarray       Descriptors$FileDescriptor[]
	//  107  218:putfield        #109 <Field Descriptors$FileDescriptor[] publicDependencies>
		((List) (adescriptors$filedescriptor)).toArray(((Object []) (publicDependencies)));
	//  108  221:aload_2         
	//  109  222:aload_0         
	//  110  223:getfield        #109 <Field Descriptors$FileDescriptor[] publicDependencies>
	//  111  226:invokeinterface #113 <Method Object[] List.toArray(Object[])>
	//  112  231:pop             
		descriptors$descriptorpool.addPackage(getPackage(), this);
	//  113  232:aload_3         
	//  114  233:aload_0         
	//  115  234:invokevirtual   #116 <Method String getPackage()>
	//  116  237:aload_0         
	//  117  238:invokevirtual   #122 <Method void Descriptors$DescriptorPool.addPackage(String, Descriptors$FileDescriptor)>
		messageTypes = new Descriptors.Descriptor[ptorproto.getMessageTypeCount()];
	//  118  241:aload_0         
	//  119  242:aload_1         
	//  120  243:invokevirtual   #125 <Method int DescriptorProtos$FileDescriptorProto.getMessageTypeCount()>
	//  121  246:anewarray       Descriptors.Descriptor[]
	//  122  249:putfield        #129 <Field Descriptors$Descriptor[] messageTypes>
		for(int k = 0; k < ptorproto.getMessageTypeCount(); k++)
	//* 123  252:iconst_0        
	//* 124  253:istore          5
	//* 125  255:iload           5
	//* 126  257:aload_1         
	//* 127  258:invokevirtual   #125 <Method int DescriptorProtos$FileDescriptorProto.getMessageTypeCount()>
	//* 128  261:icmpge          298
			messageTypes[k] = new Descriptors.Descriptor(ptorproto.getMessageType(k), this, ((Descriptors.Descriptor) (null)), k, ((Descriptors._cls1) (null)));
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
		enumTypes = new Descriptors$EnumDescriptor[ptorproto.getEnumTypeCount()];
	//  148  298:aload_0         
	//  149  299:aload_1         
	//  150  300:invokevirtual   #139 <Method int DescriptorProtos$FileDescriptorProto.getEnumTypeCount()>
	//  151  303:anewarray       Descriptors$EnumDescriptor[]
	//  152  306:putfield        #143 <Field Descriptors$EnumDescriptor[] enumTypes>
		for(int l = 0; l < ptorproto.getEnumTypeCount(); l++)
	//* 153  309:iconst_0        
	//* 154  310:istore          5
	//* 155  312:iload           5
	//* 156  314:aload_1         
	//* 157  315:invokevirtual   #139 <Method int DescriptorProtos$FileDescriptorProto.getEnumTypeCount()>
	//* 158  318:icmpge          355
			enumTypes[l] = new Descriptors$EnumDescriptor(ptorproto.getEnumType(l), this, ((Descriptors.Descriptor) (null)), l, ((Descriptors._cls1) (null)));
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
		services = new or[ptorproto.getServiceCount()];
	//  178  355:aload_0         
	//  179  356:aload_1         
	//  180  357:invokevirtual   #153 <Method int DescriptorProtos$FileDescriptorProto.getServiceCount()>
	//  181  360:anewarray       or[]
	//  182  363:putfield        #157 <Field Descriptors$ServiceDescriptor[] services>
		for(int i1 = 0; i1 < ptorproto.getServiceCount(); i1++)
	//* 183  366:iconst_0        
	//* 184  367:istore          5
	//* 185  369:iload           5
	//* 186  371:aload_1         
	//* 187  372:invokevirtual   #153 <Method int DescriptorProtos$FileDescriptorProto.getServiceCount()>
	//* 188  375:icmpge          411
			services[i1] = new or(ptorproto.getService(i1), this, i1, ((Descriptors._cls1) (null)));
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
		extensions = new [ptorproto.getExtensionCount()];
	//  207  411:aload_0         
	//  208  412:aload_1         
	//  209  413:invokevirtual   #167 <Method int DescriptorProtos$FileDescriptorProto.getExtensionCount()>
	//  210  416:anewarray       []
	//  211  419:putfield        #171 <Field Descriptors$FieldDescriptor[] extensions>
		for(int j1 = 0; j1 < ptorproto.getExtensionCount(); j1++)
	//* 212  422:iconst_0        
	//* 213  423:istore          5
	//* 214  425:iload           5
	//* 215  427:aload_1         
	//* 216  428:invokevirtual   #167 <Method int DescriptorProtos$FileDescriptorProto.getExtensionCount()>
	//* 217  431:icmpge          469
			extensions[j1] = new (ptorproto.getExtension(j1), this, ((Descriptors.Descriptor) (null)), j1, true, ((Descriptors._cls1) (null)));
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

	Descriptors$FileDescriptor(String s, Descriptors.Descriptor descriptor)
		throws ationException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Descriptors$GenericDescriptor()>
		pool = new Descriptors$DescriptorPool(new Descriptors$FileDescriptor[0], true);
	//    2    4:aload_0         
	//    3    5:new             #118 <Class Descriptors$DescriptorPool>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:anewarray       Descriptors$FileDescriptor[]
	//    7   13:iconst_1        
	//    8   14:invokespecial   #184 <Method void Descriptors$DescriptorPool(Descriptors$FileDescriptor[], boolean)>
	//    9   17:putfield        #37  <Field Descriptors$DescriptorPool pool>
		proto = ptorProto.newBuilder().setName((new StringBuilder()).append(descriptor.getFullName()).append(".placeholder.proto").toString()).setPackage(s).addMessageType(descriptor.toProto()).build();
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
		dependencies = new Descriptors$FileDescriptor[0];
	//   29   66:aload_0         
	//   30   67:iconst_0        
	//   31   68:anewarray       Descriptors$FileDescriptor[]
	//   32   71:putfield        #46  <Field Descriptors$FileDescriptor[] dependencies>
		publicDependencies = new Descriptors$FileDescriptor[0];
	//   33   74:aload_0         
	//   34   75:iconst_0        
	//   35   76:anewarray       Descriptors$FileDescriptor[]
	//   36   79:putfield        #109 <Field Descriptors$FileDescriptor[] publicDependencies>
		messageTypes = (new Descriptors.Descriptor[] {
			descriptor
		});
	//   37   82:aload_0         
	//   38   83:iconst_1        
	//   39   84:anewarray       Descriptors.Descriptor[]
	//   40   87:dup             
	//   41   88:iconst_0        
	//   42   89:aload_2         
	//   43   90:aastore         
	//   44   91:putfield        #129 <Field Descriptors$Descriptor[] messageTypes>
		enumTypes = new Descriptors$EnumDescriptor[0];
	//   45   94:aload_0         
	//   46   95:iconst_0        
	//   47   96:anewarray       Descriptors$EnumDescriptor[]
	//   48   99:putfield        #143 <Field Descriptors$EnumDescriptor[] enumTypes>
		services = new or[0];
	//   49  102:aload_0         
	//   50  103:iconst_0        
	//   51  104:anewarray       or[]
	//   52  107:putfield        #157 <Field Descriptors$ServiceDescriptor[] services>
		extensions = new [0];
	//   53  110:aload_0         
	//   54  111:iconst_0        
	//   55  112:anewarray       []
	//   56  115:putfield        #171 <Field Descriptors$FieldDescriptor[] extensions>
		pool.addPackage(s, this);
	//   57  118:aload_0         
	//   58  119:getfield        #37  <Field Descriptors$DescriptorPool pool>
	//   59  122:aload_1         
	//   60  123:aload_0         
	//   61  124:invokevirtual   #122 <Method void Descriptors$DescriptorPool.addPackage(String, Descriptors$FileDescriptor)>
		pool.addSymbol(((or) (descriptor)));
	//   62  127:aload_0         
	//   63  128:getfield        #37  <Field Descriptors$DescriptorPool pool>
	//   64  131:aload_2         
	//   65  132:invokevirtual   #218 <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
	//   66  135:return          
	}
}
