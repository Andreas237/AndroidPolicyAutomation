// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			ExtensionRegistry, ExtensionRegistryLite

public final class EmptyProto
{

	private EmptyProto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:return          
	}

	public static Descriptors.FileDescriptor getDescriptor()
	{
		return descriptor;
	//    0    0:getstatic       #58  <Field Descriptors$FileDescriptor descriptor>
	//    1    3:areturn         
	}

	public static void registerAllExtensions(ExtensionRegistry extensionregistry)
	{
		registerAllExtensions(((ExtensionRegistryLite) (extensionregistry)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #63  <Method void registerAllExtensions(ExtensionRegistryLite)>
	//    2    4:return          
	}

	public static void registerAllExtensions(ExtensionRegistryLite extensionregistrylite)
	{
	//    0    0:return          
	}

	private static Descriptors.FileDescriptor descriptor;
	static final Descriptors.Descriptor internal_static_google_protobuf_Empty_descriptor;
	static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_Empty_fieldAccessorTable;

	static 
	{
		Descriptors.FileDescriptor.InternalDescriptorAssigner internaldescriptorassigner = new Descriptors.FileDescriptor.InternalDescriptorAssigner() {

			public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor filedescriptor)
			{
				EmptyProto.descriptor = filedescriptor;
			//    0    0:aload_1         
			//    1    1:invokestatic    #19  <Method Descriptors$FileDescriptor EmptyProto.access$002(Descriptors$FileDescriptor)>
			//    2    4:pop             
				return null;
			//    3    5:aconst_null     
			//    4    6:areturn         
			}

		}
;
	//    0    0:new             #6   <Class EmptyProto$1>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void EmptyProto$1()>
	//    3    7:astore_0        
		Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[] {
			"\n\033google/protobuf/empty.proto\022\017google.protobuf\"\007\n\005EmptyBv\n\023com.google.protobufB\nEmptyProtoP\001Z'github.com/golang/protobuf/ptypes/empty\370\001\001\242\002\003GPB\252\002\036Google.Protobuf.WellKnownTypesb\006proto3"
		}, new Descriptors.FileDescriptor[0], internaldescriptorassigner);
	//    4    8:iconst_1        
	//    5    9:anewarray       String[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:ldc1            #21  <String "\n\033google/protobuf/empty.proto\022\017google.protobuf\"\007\n\005EmptyBv\n\023com.google.protobufB\nEmptyProtoP\001Z'github.com/golang/protobuf/ptypes/empty\370\001\001\242\002\003GPB\252\002\036Google.Protobuf.WellKnownTypesb\006proto3">
	//    9   16:aastore         
	//   10   17:iconst_0        
	//   11   18:anewarray       Descriptors.FileDescriptor[]
	//   12   21:aload_0         
	//   13   22:invokestatic    #27  <Method void Descriptors$FileDescriptor.internalBuildGeneratedFileFrom(String[], Descriptors$FileDescriptor[], Descriptors$FileDescriptor$InternalDescriptorAssigner)>
		internal_static_google_protobuf_Empty_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
	//   14   25:invokestatic    #31  <Method Descriptors$FileDescriptor getDescriptor()>
	//   15   28:invokevirtual   #35  <Method List Descriptors$FileDescriptor.getMessageTypes()>
	//   16   31:iconst_0        
	//   17   32:invokeinterface #41  <Method Object List.get(int)>
	//   18   37:checkcast       #43  <Class Descriptors$Descriptor>
	//   19   40:putstatic       #45  <Field Descriptors$Descriptor internal_static_google_protobuf_Empty_descriptor>
		internal_static_google_protobuf_Empty_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_Empty_descriptor, new String[0]);
	//   20   43:new             #47  <Class GeneratedMessageV3$FieldAccessorTable>
	//   21   46:dup             
	//   22   47:getstatic       #45  <Field Descriptors$Descriptor internal_static_google_protobuf_Empty_descriptor>
	//   23   50:iconst_0        
	//   24   51:anewarray       String[]
	//   25   54:invokespecial   #50  <Method void GeneratedMessageV3$FieldAccessorTable(Descriptors$Descriptor, String[])>
	//   26   57:putstatic       #52  <Field GeneratedMessageV3$FieldAccessorTable internal_static_google_protobuf_Empty_fieldAccessorTable>
	//*  27   60:return          
	}


/*
	static Descriptors.FileDescriptor access$002(Descriptors.FileDescriptor filedescriptor)
	{
		descriptor = filedescriptor;
	//    0    0:aload_0         
	//    1    1:putstatic       #58  <Field Descriptors$FileDescriptor descriptor>
		return filedescriptor;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/
}
