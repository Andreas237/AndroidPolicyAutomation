// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			DoubleValueOrBuilder, DoubleValue, WrappersProto, GeneratedMessageV3, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DoubleValue$Builder extends uilder
	implements DoubleValueOrBuilder
{

	public static final or getDescriptor()
	{
		return WrappersProto.internal_static_google_protobuf_DoubleValue_descriptor;
	//    0    0:getstatic       #35  <Field Descriptors$Descriptor WrappersProto.internal_static_google_protobuf_DoubleValue_descriptor>
	//    1    3:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
	//    0    0:getstatic       #41  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//    1    3:istore_1        
	//    2    4:return          
	}

	public DoubleValue$Builder addRepeatedField(criptor criptor, Object obj)
	{
		return (DoubleValue$Builder)super.addRepeatedField(criptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DoubleValue$Builder>
	//    5    9:areturn         
	}

	public volatile uilder addRepeatedField(criptor criptor, Object obj)
	{
		return ((uilder) (addRepeatedField(criptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #48  <Method DoubleValue$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(criptor criptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(criptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #48  <Method DoubleValue$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DoubleValue build()
	{
		DoubleValue doublevalue = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method DoubleValue buildPartial()>
	//    2    4:astore_1        
		if(!doublevalue.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #58  <Method boolean DoubleValue.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (doublevalue)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #62  <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return doublevalue;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method DoubleValue build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method DoubleValue build()>
	//    2    4:areturn         
	}

	public DoubleValue buildPartial()
	{
		DoubleValue doublevalue = new DoubleValue(((uilder) (this)), ((DoubleValue._cls1) (null)));
	//    0    0:new             #9   <Class DoubleValue>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #69  <Method void DoubleValue(GeneratedMessageV3$Builder, DoubleValue$1)>
	//    5    9:astore_1        
		DoubleValue.access$302(doublevalue, value_);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #71  <Field double value_>
	//    9   15:invokestatic    #75  <Method double DoubleValue.access$302(DoubleValue, double)>
	//   10   18:pop2            
		onBuilt();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #78  <Method void onBuilt()>
		return doublevalue;
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method DoubleValue buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method DoubleValue buildPartial()>
	//    2    4:areturn         
	}

	public volatile der clear()
	{
		return ((der) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method DoubleValue$Builder clear()>
	//    2    4:areturn         
	}

	public DoubleValue$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		value_ = 0.0D;
	//    3    5:aload_0         
	//    4    6:dconst_0        
	//    5    7:putfield        #71  <Field double value_>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public volatile uilder clear()
	{
		return ((uilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method DoubleValue$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method DoubleValue$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite$Builder clear()
	{
		return ((MessageLite$Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method DoubleValue$Builder clear()>
	//    2    4:areturn         
	}

	public DoubleValue$Builder clearField(criptor criptor)
	{
		return (DoubleValue$Builder)super.clearField(criptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #93  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DoubleValue$Builder>
	//    4    8:areturn         
	}

	public volatile uilder clearField(criptor criptor)
	{
		return ((uilder) (clearField(criptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #95  <Method DoubleValue$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(criptor criptor)
	{
		return ((Message.Builder) (clearField(criptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #95  <Method DoubleValue$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile der clearOneof(criptor criptor)
	{
		return ((der) (clearOneof(criptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method DoubleValue$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DoubleValue$Builder clearOneof(criptor criptor)
	{
		return (DoubleValue$Builder)super.clearOneof(criptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DoubleValue$Builder>
	//    4    8:areturn         
	}

	public volatile uilder clearOneof(criptor criptor)
	{
		return ((uilder) (clearOneof(criptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method DoubleValue$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(criptor criptor)
	{
		return ((Message.Builder) (clearOneof(criptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method DoubleValue$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DoubleValue$Builder clearValue()
	{
		value_ = 0.0D;
	//    0    0:aload_0         
	//    1    1:dconst_0        
	//    2    2:putfield        #71  <Field double value_>
		onChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #109 <Method void onChanged()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public volatile der clone()
	{
		return ((der) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method DoubleValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Builder clone()
	{
		return ((Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method DoubleValue$Builder clone()>
	//    2    4:areturn         
	}

	public DoubleValue$Builder clone()
	{
		return (DoubleValue$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DoubleValue$Builder>
	//    3    7:areturn         
	}

	public volatile uilder clone()
	{
		return ((uilder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method DoubleValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method DoubleValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite$Builder clone()
	{
		return ((MessageLite$Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method DoubleValue$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method DoubleValue$Builder clone()>
	//    2    4:areturn         
	}

	public DoubleValue getDefaultInstanceForType()
	{
		return DoubleValue.getDefaultInstance();
	//    0    0:invokestatic    #123 <Method DoubleValue DoubleValue.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method DoubleValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method DoubleValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public or getDescriptorForType()
	{
		return WrappersProto.internal_static_google_protobuf_DoubleValue_descriptor;
	//    0    0:getstatic       #35  <Field Descriptors$Descriptor WrappersProto.internal_static_google_protobuf_DoubleValue_descriptor>
	//    1    3:areturn         
	}

	public double getValue()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field double value_>
	//    2    4:dreturn         
	}

	protected ieldAccessorTable internalGetFieldAccessorTable()
	{
		return WrappersProto.internal_static_google_protobuf_DoubleValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/DoubleValue, com/google/protobuf/DoubleValue$Builder);
	//    0    0:getstatic       #134 <Field GeneratedMessageV3$FieldAccessorTable WrappersProto.internal_static_google_protobuf_DoubleValue_fieldAccessorTable>
	//    1    3:ldc1            #9   <Class DoubleValue>
	//    2    5:ldc1            #2   <Class DoubleValue$Builder>
	//    3    7:invokevirtual   #140 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile der mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((der) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #147 <Method DoubleValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile der mergeFrom(Message message)
	{
		return ((der) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #151 <Method DoubleValue$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #147 <Method DoubleValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DoubleValue$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DoubleValue)DoubleValue.access$400().parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:invokestatic    #158 <Method Parser DoubleValue.access$400()>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #164 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DoubleValue>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DoubleValue) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #167 <Method DoubleValue$Builder mergeFrom(DoubleValue)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #170 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DoubleValue>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #174 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #167 <Method DoubleValue$Builder mergeFrom(DoubleValue)>
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
		codedinputstream = ((CodedInputStream) ((DoubleValue)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DoubleValue) (codedinputstream1)));
		throw codedinputstream;
	}

	public DoubleValue$Builder mergeFrom(DoubleValue doublevalue)
	{
		if(doublevalue == DoubleValue.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #123 <Method DoubleValue DoubleValue.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(doublevalue.getValue() != 0.0D)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #176 <Method double DoubleValue.getValue()>
	//*   7   13:dconst_0        
	//*   8   14:dcmpl           
	//*   9   15:ifeq            27
			setValue(doublevalue.getValue());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #176 <Method double DoubleValue.getValue()>
	//   13   23:invokevirtual   #180 <Method DoubleValue$Builder setValue(double)>
	//   14   26:pop             
		mergeUnknownFields(doublevalue.unknownFields);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getfield        #184 <Field UnknownFieldSet DoubleValue.unknownFields>
	//   18   32:invokevirtual   #188 <Method DoubleValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//   19   35:pop             
		onChanged();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #109 <Method void onChanged()>
		return this;
	//   22   40:aload_0         
	//   23   41:areturn         
	}

	public DoubleValue$Builder mergeFrom(Message message)
	{
		if(message instanceof DoubleValue)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DoubleValue>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DoubleValue)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DoubleValue>
	//    6   12:invokevirtual   #167 <Method DoubleValue$Builder mergeFrom(DoubleValue)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #190 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #147 <Method DoubleValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #151 <Method DoubleValue$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite$Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #147 <Method DoubleValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile der mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((der) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #188 <Method DoubleValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DoubleValue$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DoubleValue$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #197 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DoubleValue$Builder>
	//    4    8:areturn         
	}

	public volatile uilder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((uilder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #188 <Method DoubleValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #188 <Method DoubleValue$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DoubleValue$Builder setField(criptor criptor, Object obj)
	{
		return (DoubleValue$Builder)super.setField(criptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #201 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DoubleValue$Builder>
	//    5    9:areturn         
	}

	public volatile uilder setField(criptor criptor, Object obj)
	{
		return ((uilder) (setField(criptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #203 <Method DoubleValue$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(criptor criptor, Object obj)
	{
		return ((Message.Builder) (setField(criptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #203 <Method DoubleValue$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DoubleValue$Builder setRepeatedField(criptor criptor, int i, Object obj)
	{
		return (DoubleValue$Builder)super.setRepeatedField(criptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #208 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DoubleValue$Builder>
	//    6   10:areturn         
	}

	public volatile uilder setRepeatedField(criptor criptor, int i, Object obj)
	{
		return ((uilder) (setRepeatedField(criptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #210 <Method DoubleValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(criptor criptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(criptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #210 <Method DoubleValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public final DoubleValue$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DoubleValue$Builder)super.setUnknownFieldsProto3(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #215 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DoubleValue$Builder>
	//    4    8:areturn         
	}

	public volatile uilder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((uilder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #217 <Method DoubleValue$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #217 <Method DoubleValue$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DoubleValue$Builder setValue(double d)
	{
		value_ = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #71  <Field double value_>
		onChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #109 <Method void onChanged()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	private double value_;

	private DoubleValue$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void GeneratedMessageV3$Builder()>
		maybeForceBuilderInitialization();
	//    2    4:aload_0         
	//    3    5:invokespecial   #19  <Method void maybeForceBuilderInitialization()>
	//    4    8:return          
	}

	DoubleValue$Builder(DoubleValue._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void DoubleValue$Builder()>
	//    2    4:return          
	}

	private DoubleValue$Builder(uilderParent uilderparent)
	{
		super(uilderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		maybeForceBuilderInitialization();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void maybeForceBuilderInitialization()>
	//    5    9:return          
	}

	DoubleValue$Builder(uilderParent uilderparent, DoubleValue._cls1 _pcls1)
	{
		this(uilderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void DoubleValue$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
