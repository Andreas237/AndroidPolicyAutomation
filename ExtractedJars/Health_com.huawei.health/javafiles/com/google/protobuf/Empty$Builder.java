// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			EmptyOrBuilder, Empty, EmptyProto, GeneratedMessageV3, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class Empty$Builder extends geV3.Builder
	implements EmptyOrBuilder
{

	public static final scriptor getDescriptor()
	{
		return EmptyProto.internal_static_google_protobuf_Empty_descriptor;
	//    0    0:getstatic       #33  <Field Descriptors$Descriptor EmptyProto.internal_static_google_protobuf_Empty_descriptor>
	//    1    3:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
	//    0    0:getstatic       #39  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//    1    3:istore_1        
	//    2    4:return          
	}

	public Empty$Builder addRepeatedField(eldDescriptor elddescriptor, Object obj)
	{
		return (Empty$Builder)super.addRepeatedField(elddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #44  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class Empty$Builder>
	//    5    9:areturn         
	}

	public volatile geV3.Builder addRepeatedField(eldDescriptor elddescriptor, Object obj)
	{
		return ((geV3.Builder) (addRepeatedField(elddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #46  <Method Empty$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile r addRepeatedField(eldDescriptor elddescriptor, Object obj)
	{
		return ((r) (addRepeatedField(elddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #46  <Method Empty$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public Empty build()
	{
		Empty empty = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method Empty buildPartial()>
	//    2    4:astore_1        
		if(!empty.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #56  <Method boolean Empty.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (empty)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #60  <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return empty;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method Empty build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method Empty build()>
	//    2    4:areturn         
	}

	public Empty buildPartial()
	{
		Empty empty = new Empty(((geV3.Builder) (this)), ((Empty._cls1) (null)));
	//    0    0:new             #9   <Class Empty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #67  <Method void Empty(GeneratedMessageV3$Builder, Empty$1)>
	//    5    9:astore_1        
		onBuilt();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #70  <Method void onBuilt()>
		return empty;
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method Empty buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method Empty buildPartial()>
	//    2    4:areturn         
	}

	public volatile e.Builder clear()
	{
		return ((e.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method Empty$Builder clear()>
	//    2    4:areturn         
	}

	public Empty$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile geV3.Builder clear()
	{
		return ((geV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method Empty$Builder clear()>
	//    2    4:areturn         
	}

	public volatile r clear()
	{
		return ((r) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method Empty$Builder clear()>
	//    2    4:areturn         
	}

	public volatile ilder clear()
	{
		return ((ilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method Empty$Builder clear()>
	//    2    4:areturn         
	}

	public Empty$Builder clearField(eldDescriptor elddescriptor)
	{
		return (Empty$Builder)super.clearField(elddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class Empty$Builder>
	//    4    8:areturn         
	}

	public volatile geV3.Builder clearField(eldDescriptor elddescriptor)
	{
		return ((geV3.Builder) (clearField(elddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #87  <Method Empty$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile r clearField(eldDescriptor elddescriptor)
	{
		return ((r) (clearField(elddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #87  <Method Empty$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile e.Builder clearOneof(eofDescriptor eofdescriptor)
	{
		return ((e.Builder) (clearOneof(eofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #93  <Method Empty$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public Empty$Builder clearOneof(eofDescriptor eofdescriptor)
	{
		return (Empty$Builder)super.clearOneof(eofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class Empty$Builder>
	//    4    8:areturn         
	}

	public volatile geV3.Builder clearOneof(eofDescriptor eofdescriptor)
	{
		return ((geV3.Builder) (clearOneof(eofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #93  <Method Empty$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile r clearOneof(eofDescriptor eofdescriptor)
	{
		return ((r) (clearOneof(eofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #93  <Method Empty$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile e.Builder clone()
	{
		return ((e.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
	//    2    4:areturn         
	}

	public volatile eLite.Builder clone()
	{
		return ((eLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
	//    2    4:areturn         
	}

	public Empty$Builder clone()
	{
		return (Empty$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class Empty$Builder>
	//    3    7:areturn         
	}

	public volatile geV3.Builder clone()
	{
		return ((geV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
	//    2    4:areturn         
	}

	public volatile r clone()
	{
		return ((r) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
	//    2    4:areturn         
	}

	public volatile ilder clone()
	{
		return ((ilder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
	//    2    4:areturn         
	}

	public Empty getDefaultInstanceForType()
	{
		return Empty.getDefaultInstance();
	//    0    0:invokestatic    #111 <Method Empty Empty.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Empty getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Empty getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public scriptor getDescriptorForType()
	{
		return EmptyProto.internal_static_google_protobuf_Empty_descriptor;
	//    0    0:getstatic       #33  <Field Descriptors$Descriptor EmptyProto.internal_static_google_protobuf_Empty_descriptor>
	//    1    3:areturn         
	}

	protected geV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return EmptyProto.internal_static_google_protobuf_Empty_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Empty, com/google/protobuf/Empty$Builder);
	//    0    0:getstatic       #120 <Field GeneratedMessageV3$FieldAccessorTable EmptyProto.internal_static_google_protobuf_Empty_fieldAccessorTable>
	//    1    3:ldc1            #9   <Class Empty>
	//    2    5:ldc1            #2   <Class Empty$Builder>
	//    3    7:invokevirtual   #126 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile e.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((e.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #133 <Method Empty$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile e.Builder mergeFrom(Message message)
	{
		return ((e.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #137 <Method Empty$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile eLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((eLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #133 <Method Empty$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public Empty$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		CodedInputStream codedinputstream1;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		codedinputstream1 = ((CodedInputStream) (obj));
	//    2    3:aload           4
	//    3    5:astore_3        
		codedinputstream = ((CodedInputStream) ((Empty)Empty.access$300().parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:invokestatic    #144 <Method Parser Empty.access$300()>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #150 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class Empty>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((Empty) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #153 <Method Empty$Builder mergeFrom(Empty)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #156 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class Empty>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #160 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #153 <Method Empty$Builder mergeFrom(Empty)>
	//*  36   61:pop             
	//*  37   62:aload_1         
	//*  38   63:athrow          
		{
			return this;
	//   39   64:aload_0         
	//   40   65:areturn         
		}
		extensionregistrylite;
		codedinputstream1 = ((CodedInputStream) (obj));
		codedinputstream = ((CodedInputStream) ((Empty)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((Empty) (codedinputstream1)));
		throw codedinputstream;
	}

	public Empty$Builder mergeFrom(Empty empty)
	{
		if(empty == Empty.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #111 <Method Empty Empty.getDefaultInstance()>
	//*   2    4:if_acmpne       9
		{
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		} else
		{
			mergeUnknownFields(empty.unknownFields);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #164 <Field UnknownFieldSet Empty.unknownFields>
	//    8   14:invokevirtual   #168 <Method Empty$Builder mergeUnknownFields(UnknownFieldSet)>
	//    9   17:pop             
			onChanged();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #171 <Method void onChanged()>
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		}
	}

	public Empty$Builder mergeFrom(Message message)
	{
		if(message instanceof Empty)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class Empty>
	//*   2    4:ifeq            16
		{
			return mergeFrom((Empty)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class Empty>
	//    6   12:invokevirtual   #153 <Method Empty$Builder mergeFrom(Empty)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #173 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
	//   11   21:pop             
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		}
	}

	public volatile r mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((r) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #133 <Method Empty$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile r mergeFrom(Message message)
	{
		return ((r) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #137 <Method Empty$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile ilder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((ilder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #133 <Method Empty$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile e.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((e.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #168 <Method Empty$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final Empty$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (Empty$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #180 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class Empty$Builder>
	//    4    8:areturn         
	}

	public volatile geV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((geV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #168 <Method Empty$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile r mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((r) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #168 <Method Empty$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public Empty$Builder setField(eldDescriptor elddescriptor, Object obj)
	{
		return (Empty$Builder)super.setField(elddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #184 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class Empty$Builder>
	//    5    9:areturn         
	}

	public volatile geV3.Builder setField(eldDescriptor elddescriptor, Object obj)
	{
		return ((geV3.Builder) (setField(elddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #186 <Method Empty$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile r setField(eldDescriptor elddescriptor, Object obj)
	{
		return ((r) (setField(elddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #186 <Method Empty$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public Empty$Builder setRepeatedField(eldDescriptor elddescriptor, int i, Object obj)
	{
		return (Empty$Builder)super.setRepeatedField(elddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #191 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class Empty$Builder>
	//    6   10:areturn         
	}

	public volatile geV3.Builder setRepeatedField(eldDescriptor elddescriptor, int i, Object obj)
	{
		return ((geV3.Builder) (setRepeatedField(elddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #193 <Method Empty$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile r setRepeatedField(eldDescriptor elddescriptor, int i, Object obj)
	{
		return ((r) (setRepeatedField(elddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #193 <Method Empty$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public final Empty$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (Empty$Builder)super.setUnknownFieldsProto3(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #198 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class Empty$Builder>
	//    4    8:areturn         
	}

	public volatile geV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((geV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #200 <Method Empty$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile r setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((r) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #200 <Method Empty$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private Empty$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void GeneratedMessageV3$Builder()>
		maybeForceBuilderInitialization();
	//    2    4:aload_0         
	//    3    5:invokespecial   #17  <Method void maybeForceBuilderInitialization()>
	//    4    8:return          
	}

	Empty$Builder(Empty._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Empty$Builder()>
	//    2    4:return          
	}

	private Empty$Builder(geV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		maybeForceBuilderInitialization();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void maybeForceBuilderInitialization()>
	//    5    9:return          
	}

	Empty$Builder(geV3.BuilderParent builderparent, Empty._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void Empty$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
