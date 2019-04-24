// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			BytesValueOrBuilder, BytesValue, ByteString, WrappersProto, 
//			GeneratedMessageV3, InvalidProtocolBufferException, Parser, Message, 
//			MessageLite, CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class BytesValue$Builder extends Builder
	implements BytesValueOrBuilder
{

	public static final tor getDescriptor()
	{
		return WrappersProto.internal_static_google_protobuf_BytesValue_descriptor;
	//    0    0:getstatic       #42  <Field Descriptors$Descriptor WrappersProto.internal_static_google_protobuf_BytesValue_descriptor>
	//    1    3:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
	//    0    0:getstatic       #48  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//    1    3:istore_1        
	//    2    4:return          
	}

	public BytesValue$Builder addRepeatedField(scriptor scriptor, Object obj)
	{
		return (BytesValue$Builder)super.addRepeatedField(scriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #53  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class BytesValue$Builder>
	//    5    9:areturn         
	}

	public volatile Builder addRepeatedField(scriptor scriptor, Object obj)
	{
		return ((Builder) (addRepeatedField(scriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #55  <Method BytesValue$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(scriptor scriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(scriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #55  <Method BytesValue$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public BytesValue build()
	{
		BytesValue bytesvalue = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method BytesValue buildPartial()>
	//    2    4:astore_1        
		if(!bytesvalue.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #65  <Method boolean BytesValue.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (bytesvalue)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #69  <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return bytesvalue;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method BytesValue build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method BytesValue build()>
	//    2    4:areturn         
	}

	public BytesValue buildPartial()
	{
		BytesValue bytesvalue = new BytesValue(((Builder) (this)), ((BytesValue._cls1) (null)));
	//    0    0:new             #9   <Class BytesValue>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #76  <Method void BytesValue(GeneratedMessageV3$Builder, BytesValue$1)>
	//    5    9:astore_1        
		BytesValue.access$302(bytesvalue, value_);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field ByteString value_>
	//    9   15:invokestatic    #80  <Method ByteString BytesValue.access$302(BytesValue, ByteString)>
	//   10   18:pop             
		onBuilt();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #83  <Method void onBuilt()>
		return bytesvalue;
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method BytesValue buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method BytesValue buildPartial()>
	//    2    4:areturn         
	}

	public volatile lder clear()
	{
		return ((lder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method BytesValue$Builder clear()>
	//    2    4:areturn         
	}

	public BytesValue$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		value_ = ByteString.EMPTY;
	//    3    5:aload_0         
	//    4    6:getstatic       #21  <Field ByteString ByteString.EMPTY>
	//    5    9:putfield        #23  <Field ByteString value_>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public volatile Builder clear()
	{
		return ((Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method BytesValue$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method BytesValue$Builder clear()>
	//    2    4:areturn         
	}

	public volatile  clear()
	{
		return (() (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method BytesValue$Builder clear()>
	//    2    4:areturn         
	}

	public BytesValue$Builder clearField(scriptor scriptor)
	{
		return (BytesValue$Builder)super.clearField(scriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class BytesValue$Builder>
	//    4    8:areturn         
	}

	public volatile Builder clearField(scriptor scriptor)
	{
		return ((Builder) (clearField(scriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method BytesValue$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(scriptor scriptor)
	{
		return ((Message.Builder) (clearField(scriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method BytesValue$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile lder clearOneof(scriptor scriptor)
	{
		return ((lder) (clearOneof(scriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #106 <Method BytesValue$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public BytesValue$Builder clearOneof(scriptor scriptor)
	{
		return (BytesValue$Builder)super.clearOneof(scriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #109 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class BytesValue$Builder>
	//    4    8:areturn         
	}

	public volatile Builder clearOneof(scriptor scriptor)
	{
		return ((Builder) (clearOneof(scriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #106 <Method BytesValue$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(scriptor scriptor)
	{
		return ((Message.Builder) (clearOneof(scriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #106 <Method BytesValue$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public BytesValue$Builder clearValue()
	{
		value_ = BytesValue.getDefaultInstance().getValue();
	//    0    0:aload_0         
	//    1    1:invokestatic    #114 <Method BytesValue BytesValue.getDefaultInstance()>
	//    2    4:invokevirtual   #118 <Method ByteString BytesValue.getValue()>
	//    3    7:putfield        #23  <Field ByteString value_>
		onChanged();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #121 <Method void onChanged()>
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public volatile lder clone()
	{
		return ((lder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method BytesValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile .Builder clone()
	{
		return ((.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method BytesValue$Builder clone()>
	//    2    4:areturn         
	}

	public BytesValue$Builder clone()
	{
		return (BytesValue$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class BytesValue$Builder>
	//    3    7:areturn         
	}

	public volatile Builder clone()
	{
		return ((Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method BytesValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method BytesValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile  clone()
	{
		return (() (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method BytesValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method BytesValue$Builder clone()>
	//    2    4:areturn         
	}

	public BytesValue getDefaultInstanceForType()
	{
		return BytesValue.getDefaultInstance();
	//    0    0:invokestatic    #114 <Method BytesValue BytesValue.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method BytesValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method BytesValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public tor getDescriptorForType()
	{
		return WrappersProto.internal_static_google_protobuf_BytesValue_descriptor;
	//    0    0:getstatic       #42  <Field Descriptors$Descriptor WrappersProto.internal_static_google_protobuf_BytesValue_descriptor>
	//    1    3:areturn         
	}

	public ByteString getValue()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ByteString value_>
	//    2    4:areturn         
	}

	protected FieldAccessorTable internalGetFieldAccessorTable()
	{
		return WrappersProto.internal_static_google_protobuf_BytesValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/BytesValue, com/google/protobuf/BytesValue$Builder);
	//    0    0:getstatic       #141 <Field GeneratedMessageV3$FieldAccessorTable WrappersProto.internal_static_google_protobuf_BytesValue_fieldAccessorTable>
	//    1    3:ldc1            #9   <Class BytesValue>
	//    2    5:ldc1            #2   <Class BytesValue$Builder>
	//    3    7:invokevirtual   #147 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile lder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((lder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #154 <Method BytesValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile lder mergeFrom(Message message)
	{
		return ((lder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #158 <Method BytesValue$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile .Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #154 <Method BytesValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public BytesValue$Builder mergeFrom(BytesValue bytesvalue)
	{
		if(bytesvalue == BytesValue.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #114 <Method BytesValue BytesValue.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(bytesvalue.getValue() != ByteString.EMPTY)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #118 <Method ByteString BytesValue.getValue()>
	//*   7   13:getstatic       #21  <Field ByteString ByteString.EMPTY>
	//*   8   16:if_acmpeq       28
			setValue(bytesvalue.getValue());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #118 <Method ByteString BytesValue.getValue()>
	//   12   24:invokevirtual   #164 <Method BytesValue$Builder setValue(ByteString)>
	//   13   27:pop             
		mergeUnknownFields(bytesvalue.unknownFields);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #168 <Field UnknownFieldSet BytesValue.unknownFields>
	//   17   33:invokevirtual   #172 <Method BytesValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//   18   36:pop             
		onChanged();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #121 <Method void onChanged()>
		return this;
	//   21   41:aload_0         
	//   22   42:areturn         
	}

	public BytesValue$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((BytesValue)BytesValue.access$400().parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:invokestatic    #178 <Method Parser BytesValue.access$400()>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #184 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class BytesValue>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((BytesValue) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #186 <Method BytesValue$Builder mergeFrom(BytesValue)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #189 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class BytesValue>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #193 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #186 <Method BytesValue$Builder mergeFrom(BytesValue)>
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
		codedinputstream = ((CodedInputStream) ((BytesValue)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((BytesValue) (codedinputstream1)));
		throw codedinputstream;
	}

	public BytesValue$Builder mergeFrom(Message message)
	{
		if(message instanceof BytesValue)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class BytesValue>
	//*   2    4:ifeq            16
		{
			return mergeFrom((BytesValue)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class BytesValue>
	//    6   12:invokevirtual   #186 <Method BytesValue$Builder mergeFrom(BytesValue)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #195 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
	//   11   21:pop             
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		}
	}

	public volatile Message.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((Message.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #154 <Method BytesValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #158 <Method BytesValue$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile  mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (() (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #154 <Method BytesValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile lder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((lder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #172 <Method BytesValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final BytesValue$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (BytesValue$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #202 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class BytesValue$Builder>
	//    4    8:areturn         
	}

	public volatile Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #172 <Method BytesValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #172 <Method BytesValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public BytesValue$Builder setField(scriptor scriptor, Object obj)
	{
		return (BytesValue$Builder)super.setField(scriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #206 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class BytesValue$Builder>
	//    5    9:areturn         
	}

	public volatile Builder setField(scriptor scriptor, Object obj)
	{
		return ((Builder) (setField(scriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #208 <Method BytesValue$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(scriptor scriptor, Object obj)
	{
		return ((Message.Builder) (setField(scriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #208 <Method BytesValue$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public BytesValue$Builder setRepeatedField(scriptor scriptor, int i, Object obj)
	{
		return (BytesValue$Builder)super.setRepeatedField(scriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #213 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class BytesValue$Builder>
	//    6   10:areturn         
	}

	public volatile Builder setRepeatedField(scriptor scriptor, int i, Object obj)
	{
		return ((Builder) (setRepeatedField(scriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #215 <Method BytesValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(scriptor scriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(scriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #215 <Method BytesValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public final BytesValue$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (BytesValue$Builder)super.setUnknownFieldsProto3(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #220 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class BytesValue$Builder>
	//    4    8:areturn         
	}

	public volatile Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #222 <Method BytesValue$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #222 <Method BytesValue$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public BytesValue$Builder setValue(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #224 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #225 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			value_ = bytestring;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #23  <Field ByteString value_>
			onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #121 <Method void onChanged()>
			return this;
	//   11   21:aload_0         
	//   12   22:areturn         
		}
	}

	private ByteString value_;

	private BytesValue$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void GeneratedMessageV3$Builder()>
		value_ = ByteString.EMPTY;
	//    2    4:aload_0         
	//    3    5:getstatic       #21  <Field ByteString ByteString.EMPTY>
	//    4    8:putfield        #23  <Field ByteString value_>
		maybeForceBuilderInitialization();
	//    5   11:aload_0         
	//    6   12:invokespecial   #26  <Method void maybeForceBuilderInitialization()>
	//    7   15:return          
	}

	BytesValue$Builder(BytesValue._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void BytesValue$Builder()>
	//    2    4:return          
	}

	private BytesValue$Builder(BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		value_ = ByteString.EMPTY;
	//    3    5:aload_0         
	//    4    6:getstatic       #21  <Field ByteString ByteString.EMPTY>
	//    5    9:putfield        #23  <Field ByteString value_>
		maybeForceBuilderInitialization();
	//    6   12:aload_0         
	//    7   13:invokespecial   #26  <Method void maybeForceBuilderInitialization()>
	//    8   16:return          
	}

	BytesValue$Builder(BuilderParent builderparent, BytesValue._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void BytesValue$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
