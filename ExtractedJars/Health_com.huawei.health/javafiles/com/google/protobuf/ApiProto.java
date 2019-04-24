// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			SourceContextProto, TypeProto, ExtensionRegistry, ExtensionRegistryLite

public final class ApiProto
{

	private ApiProto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
	//    2    4:return          
	}

	public static Descriptors.FileDescriptor getDescriptor()
	{
		return descriptor;
	//    0    0:getstatic       #100 <Field Descriptors$FileDescriptor descriptor>
	//    1    3:areturn         
	}

	public static void registerAllExtensions(ExtensionRegistry extensionregistry)
	{
		registerAllExtensions(((ExtensionRegistryLite) (extensionregistry)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #105 <Method void registerAllExtensions(ExtensionRegistryLite)>
	//    2    4:return          
	}

	public static void registerAllExtensions(ExtensionRegistryLite extensionregistrylite)
	{
	//    0    0:return          
	}

	private static Descriptors.FileDescriptor descriptor;
	static final Descriptors.Descriptor internal_static_google_protobuf_Api_descriptor;
	static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_Api_fieldAccessorTable;
	static final Descriptors.Descriptor internal_static_google_protobuf_Method_descriptor;
	static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_Method_fieldAccessorTable;
	static final Descriptors.Descriptor internal_static_google_protobuf_Mixin_descriptor;
	static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_Mixin_fieldAccessorTable;

	static 
	{
		Descriptors.FileDescriptor.InternalDescriptorAssigner internaldescriptorassigner = new Descriptors.FileDescriptor.InternalDescriptorAssigner() {

			public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor filedescriptor2)
			{
				ApiProto.descriptor = filedescriptor2;
			//    0    0:aload_1         
			//    1    1:invokestatic    #19  <Method Descriptors$FileDescriptor ApiProto.access$002(Descriptors$FileDescriptor)>
			//    2    4:pop             
				return null;
			//    3    5:aconst_null     
			//    4    6:areturn         
			}

		}
;
	//    0    0:new             #6   <Class ApiProto$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ApiProto$1()>
	//    3    7:astore_0        
		Descriptors.FileDescriptor filedescriptor = SourceContextProto.getDescriptor();
	//    4    8:invokestatic    #27  <Method Descriptors$FileDescriptor SourceContextProto.getDescriptor()>
	//    5   11:astore_1        
		Descriptors.FileDescriptor filedescriptor1 = TypeProto.getDescriptor();
	//    6   12:invokestatic    #30  <Method Descriptors$FileDescriptor TypeProto.getDescriptor()>
	//    7   15:astore_2        
		Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[] {
			"\n\031google/protobuf/api.proto\022\017google.protobuf\032$google/protobuf/source_context.proto\032\032google/protobuf/type.proto\"\201\002\n\003Api\022\f\n\004name\030\001 \001(\t\022(\n\007methods\030\002 \003(\0132\027.google.protobuf.Method\022(\n\007options\030\003 \003(\0132\027.google.protobuf.Option\022\017\n\007version\030\004 \001(\t\0226\n\016source_context\030\005 \001(\0132\036.google.protobuf.SourceContext\022&\n\006mixins\030\006 \003(\0132\026.google.protobuf.Mixin\022'\n\006syntax\030\007 \001(\0162\027.google.protobuf.Syntax\"\325\001\n\006Method\022\f\n\004name\030\001 \001(\t\022\030\n\020request_type_url\030\002 \001(\t\022\031\n\021request_streaming\030\003 \001(\b\022\031\n\021response_type_url\030\004 \001(\t\022\032\n\022response_streaming\030\005 \001(\b\022(\n\007options\030\006 \003(\0132\027.google.protobuf.Option\022'\n\006syntax\030\007 \001(\0162\027.google.protobuf.Syntax\"#\n\005Mixin\022\f\n\004name\030\001 \001(\t\022\f\n\004root\030\002 \001(\tBu\n\023com.google.protobufB\bApiProtoP\001Z+google.golang.org/genproto/protobuf/api;api\242\002\003GPB\252\002\036Google.Protobuf.WellKnownTypesb\006proto3"
		}, new Descriptors.FileDescriptor[] {
			filedescriptor, filedescriptor1
		}, internaldescriptorassigner);
	//    8   16:iconst_1        
	//    9   17:anewarray       String[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:ldc1            #34  <String "\n\031google/protobuf/api.proto\022\017google.protobuf\032$google/protobuf/source_context.proto\032\032google/protobuf/type.proto\"\201\002\n\003Api\022\f\n\004name\030\001 \001(\t\022(\n\007methods\030\002 \003(\0132\027.google.protobuf.Method\022(\n\007options\030\003 \003(\0132\027.google.protobuf.Option\022\017\n\007version\030\004 \001(\t\0226\n\016source_context\030\005 \001(\0132\036.google.protobuf.SourceContext\022&\n\006mixins\030\006 \003(\0132\026.google.protobuf.Mixin\022'\n\006syntax\030\007 \001(\0162\027.google.protobuf.Syntax\"\325\001\n\006Method\022\f\n\004name\030\001 \001(\t\022\030\n\020request_type_url\030\002 \001(\t\022\031\n\021request_streaming\030\003 \001(\b\022\031\n\021response_type_url\030\004 \001(\t\022\032\n\022response_streaming\030\005 \001(\b\022(\n\007options\030\006 \003(\0132\027.google.protobuf.Option\022'\n\006syntax\030\007 \001(\0162\027.google.protobuf.Syntax\"#\n\005Mixin\022\f\n\004name\030\001 \001(\t\022\f\n\004root\030\002 \001(\tBu\n\023com.google.protobufB\bApiProtoP\001Z+google.golang.org/genproto/protobuf/api;api\242\002\003GPB\252\002\036Google.Protobuf.WellKnownTypesb\006proto3">
	//   13   24:aastore         
	//   14   25:iconst_2        
	//   15   26:anewarray       Descriptors.FileDescriptor[]
	//   16   29:dup             
	//   17   30:iconst_0        
	//   18   31:aload_1         
	//   19   32:aastore         
	//   20   33:dup             
	//   21   34:iconst_1        
	//   22   35:aload_2         
	//   23   36:aastore         
	//   24   37:aload_0         
	//   25   38:invokestatic    #40  <Method void Descriptors$FileDescriptor.internalBuildGeneratedFileFrom(String[], Descriptors$FileDescriptor[], Descriptors$FileDescriptor$InternalDescriptorAssigner)>
		internal_static_google_protobuf_Api_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
	//   26   41:invokestatic    #41  <Method Descriptors$FileDescriptor getDescriptor()>
	//   27   44:invokevirtual   #45  <Method List Descriptors$FileDescriptor.getMessageTypes()>
	//   28   47:iconst_0        
	//   29   48:invokeinterface #51  <Method Object List.get(int)>
	//   30   53:checkcast       #53  <Class Descriptors$Descriptor>
	//   31   56:putstatic       #55  <Field Descriptors$Descriptor internal_static_google_protobuf_Api_descriptor>
		internal_static_google_protobuf_Api_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_Api_descriptor, new String[] {
			"Name", "Methods", "Options", "Version", "SourceContext", "Mixins", "Syntax"
		});
	//   32   59:new             #57  <Class GeneratedMessageV3$FieldAccessorTable>
	//   33   62:dup             
	//   34   63:getstatic       #55  <Field Descriptors$Descriptor internal_static_google_protobuf_Api_descriptor>
	//   35   66:bipush          7
	//   36   68:anewarray       String[]
	//   37   71:dup             
	//   38   72:iconst_0        
	//   39   73:ldc1            #59  <String "Name">
	//   40   75:aastore         
	//   41   76:dup             
	//   42   77:iconst_1        
	//   43   78:ldc1            #61  <String "Methods">
	//   44   80:aastore         
	//   45   81:dup             
	//   46   82:iconst_2        
	//   47   83:ldc1            #63  <String "Options">
	//   48   85:aastore         
	//   49   86:dup             
	//   50   87:iconst_3        
	//   51   88:ldc1            #65  <String "Version">
	//   52   90:aastore         
	//   53   91:dup             
	//   54   92:iconst_4        
	//   55   93:ldc1            #67  <String "SourceContext">
	//   56   95:aastore         
	//   57   96:dup             
	//   58   97:iconst_5        
	//   59   98:ldc1            #69  <String "Mixins">
	//   60  100:aastore         
	//   61  101:dup             
	//   62  102:bipush          6
	//   63  104:ldc1            #71  <String "Syntax">
	//   64  106:aastore         
	//   65  107:invokespecial   #74  <Method void GeneratedMessageV3$FieldAccessorTable(Descriptors$Descriptor, String[])>
	//   66  110:putstatic       #76  <Field GeneratedMessageV3$FieldAccessorTable internal_static_google_protobuf_Api_fieldAccessorTable>
		internal_static_google_protobuf_Method_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
	//   67  113:invokestatic    #41  <Method Descriptors$FileDescriptor getDescriptor()>
	//   68  116:invokevirtual   #45  <Method List Descriptors$FileDescriptor.getMessageTypes()>
	//   69  119:iconst_1        
	//   70  120:invokeinterface #51  <Method Object List.get(int)>
	//   71  125:checkcast       #53  <Class Descriptors$Descriptor>
	//   72  128:putstatic       #78  <Field Descriptors$Descriptor internal_static_google_protobuf_Method_descriptor>
		internal_static_google_protobuf_Method_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_Method_descriptor, new String[] {
			"Name", "RequestTypeUrl", "RequestStreaming", "ResponseTypeUrl", "ResponseStreaming", "Options", "Syntax"
		});
	//   73  131:new             #57  <Class GeneratedMessageV3$FieldAccessorTable>
	//   74  134:dup             
	//   75  135:getstatic       #78  <Field Descriptors$Descriptor internal_static_google_protobuf_Method_descriptor>
	//   76  138:bipush          7
	//   77  140:anewarray       String[]
	//   78  143:dup             
	//   79  144:iconst_0        
	//   80  145:ldc1            #59  <String "Name">
	//   81  147:aastore         
	//   82  148:dup             
	//   83  149:iconst_1        
	//   84  150:ldc1            #80  <String "RequestTypeUrl">
	//   85  152:aastore         
	//   86  153:dup             
	//   87  154:iconst_2        
	//   88  155:ldc1            #82  <String "RequestStreaming">
	//   89  157:aastore         
	//   90  158:dup             
	//   91  159:iconst_3        
	//   92  160:ldc1            #84  <String "ResponseTypeUrl">
	//   93  162:aastore         
	//   94  163:dup             
	//   95  164:iconst_4        
	//   96  165:ldc1            #86  <String "ResponseStreaming">
	//   97  167:aastore         
	//   98  168:dup             
	//   99  169:iconst_5        
	//  100  170:ldc1            #63  <String "Options">
	//  101  172:aastore         
	//  102  173:dup             
	//  103  174:bipush          6
	//  104  176:ldc1            #71  <String "Syntax">
	//  105  178:aastore         
	//  106  179:invokespecial   #74  <Method void GeneratedMessageV3$FieldAccessorTable(Descriptors$Descriptor, String[])>
	//  107  182:putstatic       #88  <Field GeneratedMessageV3$FieldAccessorTable internal_static_google_protobuf_Method_fieldAccessorTable>
		internal_static_google_protobuf_Mixin_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
	//  108  185:invokestatic    #41  <Method Descriptors$FileDescriptor getDescriptor()>
	//  109  188:invokevirtual   #45  <Method List Descriptors$FileDescriptor.getMessageTypes()>
	//  110  191:iconst_2        
	//  111  192:invokeinterface #51  <Method Object List.get(int)>
	//  112  197:checkcast       #53  <Class Descriptors$Descriptor>
	//  113  200:putstatic       #90  <Field Descriptors$Descriptor internal_static_google_protobuf_Mixin_descriptor>
		internal_static_google_protobuf_Mixin_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_Mixin_descriptor, new String[] {
			"Name", "Root"
		});
	//  114  203:new             #57  <Class GeneratedMessageV3$FieldAccessorTable>
	//  115  206:dup             
	//  116  207:getstatic       #90  <Field Descriptors$Descriptor internal_static_google_protobuf_Mixin_descriptor>
	//  117  210:iconst_2        
	//  118  211:anewarray       String[]
	//  119  214:dup             
	//  120  215:iconst_0        
	//  121  216:ldc1            #59  <String "Name">
	//  122  218:aastore         
	//  123  219:dup             
	//  124  220:iconst_1        
	//  125  221:ldc1            #92  <String "Root">
	//  126  223:aastore         
	//  127  224:invokespecial   #74  <Method void GeneratedMessageV3$FieldAccessorTable(Descriptors$Descriptor, String[])>
	//  128  227:putstatic       #94  <Field GeneratedMessageV3$FieldAccessorTable internal_static_google_protobuf_Mixin_fieldAccessorTable>
		SourceContextProto.getDescriptor();
	//  129  230:invokestatic    #27  <Method Descriptors$FileDescriptor SourceContextProto.getDescriptor()>
	//  130  233:pop             
		TypeProto.getDescriptor();
	//  131  234:invokestatic    #30  <Method Descriptors$FileDescriptor TypeProto.getDescriptor()>
	//  132  237:pop             
	//* 133  238:return          
	}


/*
	static Descriptors.FileDescriptor access$002(Descriptors.FileDescriptor filedescriptor)
	{
		descriptor = filedescriptor;
	//    0    0:aload_0         
	//    1    1:putstatic       #100 <Field Descriptors$FileDescriptor descriptor>
		return filedescriptor;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/
}
