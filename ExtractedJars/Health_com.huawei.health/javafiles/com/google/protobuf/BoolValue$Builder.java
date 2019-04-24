// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			BoolValueOrBuilder, BoolValue, WrappersProto, GeneratedMessageV3, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class BoolValue$Builder extends .Builder
	implements BoolValueOrBuilder
{

	public static final ptor getDescriptor()
	{
		return WrappersProto.internal_static_google_protobuf_BoolValue_descriptor;
	//    0    0:getstatic       #35  <Field Descriptors$Descriptor WrappersProto.internal_static_google_protobuf_BoolValue_descriptor>
	//    1    3:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
	//    0    0:getstatic       #40  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//    1    3:istore_1        
	//    2    4:return          
	}

	public BoolValue$Builder addRepeatedField(escriptor escriptor, Object obj)
	{
		return (BoolValue$Builder)super.addRepeatedField(escriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #45  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class BoolValue$Builder>
	//    5    9:areturn         
	}

	public volatile .Builder addRepeatedField(escriptor escriptor, Object obj)
	{
		return ((.Builder) (addRepeatedField(escriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #47  <Method BoolValue$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(escriptor escriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(escriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #47  <Method BoolValue$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public BoolValue build()
	{
		BoolValue boolvalue = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method BoolValue buildPartial()>
	//    2    4:astore_1        
		if(!boolvalue.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #57  <Method boolean BoolValue.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (boolvalue)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #61  <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return boolvalue;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method BoolValue build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method BoolValue build()>
	//    2    4:areturn         
	}

	public BoolValue buildPartial()
	{
		BoolValue boolvalue = new BoolValue(((.Builder) (this)), ((BoolValue._cls1) (null)));
	//    0    0:new             #9   <Class BoolValue>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #68  <Method void BoolValue(GeneratedMessageV3$Builder, BoolValue$1)>
	//    5    9:astore_1        
		BoolValue.access$302(boolvalue, value_);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #70  <Field boolean value_>
	//    9   15:invokestatic    #74  <Method boolean BoolValue.access$302(BoolValue, boolean)>
	//   10   18:pop             
		onBuilt();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #77  <Method void onBuilt()>
		return boolvalue;
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method BoolValue buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method BoolValue buildPartial()>
	//    2    4:areturn         
	}

	public volatile ilder clear()
	{
		return ((ilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method BoolValue$Builder clear()>
	//    2    4:areturn         
	}

	public BoolValue$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		value_ = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #70  <Field boolean value_>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public volatile .Builder clear()
	{
		return ((.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method BoolValue$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method BoolValue$Builder clear()>
	//    2    4:areturn         
	}

	public volatile r clear()
	{
		return ((r) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method BoolValue$Builder clear()>
	//    2    4:areturn         
	}

	public BoolValue$Builder clearField(escriptor escriptor)
	{
		return (BoolValue$Builder)super.clearField(escriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class BoolValue$Builder>
	//    4    8:areturn         
	}

	public volatile .Builder clearField(escriptor escriptor)
	{
		return ((.Builder) (clearField(escriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #94  <Method BoolValue$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(escriptor escriptor)
	{
		return ((Message.Builder) (clearField(escriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #94  <Method BoolValue$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile ilder clearOneof(escriptor escriptor)
	{
		return ((ilder) (clearOneof(escriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method BoolValue$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public BoolValue$Builder clearOneof(escriptor escriptor)
	{
		return (BoolValue$Builder)super.clearOneof(escriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class BoolValue$Builder>
	//    4    8:areturn         
	}

	public volatile .Builder clearOneof(escriptor escriptor)
	{
		return ((.Builder) (clearOneof(escriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method BoolValue$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(escriptor escriptor)
	{
		return ((Message.Builder) (clearOneof(escriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method BoolValue$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public BoolValue$Builder clearValue()
	{
		value_ = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #70  <Field boolean value_>
		onChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #108 <Method void onChanged()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public volatile ilder clone()
	{
		return ((ilder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method BoolValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile e.Builder clone()
	{
		return ((e.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method BoolValue$Builder clone()>
	//    2    4:areturn         
	}

	public BoolValue$Builder clone()
	{
		return (BoolValue$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class BoolValue$Builder>
	//    3    7:areturn         
	}

	public volatile .Builder clone()
	{
		return ((.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method BoolValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method BoolValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile r clone()
	{
		return ((r) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method BoolValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method BoolValue$Builder clone()>
	//    2    4:areturn         
	}

	public BoolValue getDefaultInstanceForType()
	{
		return BoolValue.getDefaultInstance();
	//    0    0:invokestatic    #122 <Method BoolValue BoolValue.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method BoolValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method BoolValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public ptor getDescriptorForType()
	{
		return WrappersProto.internal_static_google_protobuf_BoolValue_descriptor;
	//    0    0:getstatic       #35  <Field Descriptors$Descriptor WrappersProto.internal_static_google_protobuf_BoolValue_descriptor>
	//    1    3:areturn         
	}

	public boolean getValue()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean value_>
	//    2    4:ireturn         
	}

	protected .FieldAccessorTable internalGetFieldAccessorTable()
	{
		return WrappersProto.internal_static_google_protobuf_BoolValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/BoolValue, com/google/protobuf/BoolValue$Builder);
	//    0    0:getstatic       #132 <Field GeneratedMessageV3$FieldAccessorTable WrappersProto.internal_static_google_protobuf_BoolValue_fieldAccessorTable>
	//    1    3:ldc1            #9   <Class BoolValue>
	//    2    5:ldc1            #2   <Class BoolValue$Builder>
	//    3    7:invokevirtual   #138 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile ilder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((ilder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #145 <Method BoolValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile ilder mergeFrom(Message message)
	{
		return ((ilder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #149 <Method BoolValue$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile e.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((e.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #145 <Method BoolValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public BoolValue$Builder mergeFrom(BoolValue boolvalue)
	{
		if(boolvalue == BoolValue.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #122 <Method BoolValue BoolValue.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(boolvalue.getValue())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #153 <Method boolean BoolValue.getValue()>
	//*   7   13:ifeq            25
			setValue(boolvalue.getValue());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #153 <Method boolean BoolValue.getValue()>
	//   11   21:invokevirtual   #157 <Method BoolValue$Builder setValue(boolean)>
	//   12   24:pop             
		mergeUnknownFields(boolvalue.unknownFields);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #161 <Field UnknownFieldSet BoolValue.unknownFields>
	//   16   30:invokevirtual   #165 <Method BoolValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//   17   33:pop             
		onChanged();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #108 <Method void onChanged()>
		return this;
	//   20   38:aload_0         
	//   21   39:areturn         
	}

	public BoolValue$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((BoolValue)BoolValue.access$400().parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:invokestatic    #171 <Method Parser BoolValue.access$400()>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #177 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class BoolValue>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((BoolValue) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #179 <Method BoolValue$Builder mergeFrom(BoolValue)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #182 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class BoolValue>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #186 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #179 <Method BoolValue$Builder mergeFrom(BoolValue)>
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
		codedinputstream = ((CodedInputStream) ((BoolValue)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((BoolValue) (codedinputstream1)));
		throw codedinputstream;
	}

	public BoolValue$Builder mergeFrom(Message message)
	{
		if(message instanceof BoolValue)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class BoolValue>
	//*   2    4:ifeq            16
		{
			return mergeFrom((BoolValue)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class BoolValue>
	//    6   12:invokevirtual   #179 <Method BoolValue$Builder mergeFrom(BoolValue)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #188 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #145 <Method BoolValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #149 <Method BoolValue$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile r mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((r) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #145 <Method BoolValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile ilder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((ilder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method BoolValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final BoolValue$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (BoolValue$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #195 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class BoolValue$Builder>
	//    4    8:areturn         
	}

	public volatile .Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method BoolValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method BoolValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public BoolValue$Builder setField(escriptor escriptor, Object obj)
	{
		return (BoolValue$Builder)super.setField(escriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #199 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class BoolValue$Builder>
	//    5    9:areturn         
	}

	public volatile .Builder setField(escriptor escriptor, Object obj)
	{
		return ((.Builder) (setField(escriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #201 <Method BoolValue$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(escriptor escriptor, Object obj)
	{
		return ((Message.Builder) (setField(escriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #201 <Method BoolValue$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public BoolValue$Builder setRepeatedField(escriptor escriptor, int i, Object obj)
	{
		return (BoolValue$Builder)super.setRepeatedField(escriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #206 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class BoolValue$Builder>
	//    6   10:areturn         
	}

	public volatile .Builder setRepeatedField(escriptor escriptor, int i, Object obj)
	{
		return ((.Builder) (setRepeatedField(escriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #208 <Method BoolValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(escriptor escriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(escriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #208 <Method BoolValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public final BoolValue$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (BoolValue$Builder)super.setUnknownFieldsProto3(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #213 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class BoolValue$Builder>
	//    4    8:areturn         
	}

	public volatile .Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #215 <Method BoolValue$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #215 <Method BoolValue$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public BoolValue$Builder setValue(boolean flag)
	{
		value_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field boolean value_>
		onChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #108 <Method void onChanged()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	private boolean value_;

	private BoolValue$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void GeneratedMessageV3$Builder()>
		maybeForceBuilderInitialization();
	//    2    4:aload_0         
	//    3    5:invokespecial   #19  <Method void maybeForceBuilderInitialization()>
	//    4    8:return          
	}

	BoolValue$Builder(BoolValue._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BoolValue$Builder()>
	//    2    4:return          
	}

	private BoolValue$Builder(.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		maybeForceBuilderInitialization();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void maybeForceBuilderInitialization()>
	//    5    9:return          
	}

	BoolValue$Builder(.BuilderParent builderparent, BoolValue._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void BoolValue$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
