// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			AnyOrBuilder, Any, ByteString, AnyProto, 
//			GeneratedMessageV3, InvalidProtocolBufferException, Parser, AbstractMessageLite, 
//			Message, MessageLite, CodedInputStream, ExtensionRegistryLite, 
//			UnknownFieldSet

public static final class Any$Builder extends sageV3.Builder
	implements AnyOrBuilder
{

	public static final Descriptor getDescriptor()
	{
		return AnyProto.internal_static_google_protobuf_Any_descriptor;
	//    0    0:getstatic       #48  <Field Descriptors$Descriptor AnyProto.internal_static_google_protobuf_Any_descriptor>
	//    1    3:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
	//    0    0:getstatic       #54  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//    1    3:istore_1        
	//    2    4:return          
	}

	public Any$Builder addRepeatedField(FieldDescriptor fielddescriptor, Object obj)
	{
		return (Any$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #59  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class Any$Builder>
	//    5    9:areturn         
	}

	public volatile sageV3.Builder addRepeatedField(FieldDescriptor fielddescriptor, Object obj)
	{
		return ((sageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #61  <Method Any$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile der addRepeatedField(FieldDescriptor fielddescriptor, Object obj)
	{
		return ((der) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #61  <Method Any$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public Any build()
	{
		Any any = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method Any buildPartial()>
	//    2    4:astore_1        
		if(!any.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #71  <Method boolean Any.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (any)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #75  <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return any;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method Any build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method Any build()>
	//    2    4:areturn         
	}

	public Any buildPartial()
	{
		Any any = new Any(((sageV3.Builder) (this)), ((Any._cls1) (null)));
	//    0    0:new             #9   <Class Any>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #82  <Method void Any(GeneratedMessageV3$Builder, Any$1)>
	//    5    9:astore_1        
		Any.access$302(any, typeUrl_);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #22  <Field Object typeUrl_>
	//    9   15:invokestatic    #86  <Method Object Any.access$302(Any, Object)>
	//   10   18:pop             
		Any.access$402(any, value_);
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #29  <Field ByteString value_>
	//   14   24:invokestatic    #90  <Method ByteString Any.access$402(Any, ByteString)>
	//   15   27:pop             
		onBuilt();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #93  <Method void onBuilt()>
		return any;
	//   18   32:aload_1         
	//   19   33:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method Any buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method Any buildPartial()>
	//    2    4:areturn         
	}

	public volatile age.Builder clear()
	{
		return ((age.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method Any$Builder clear()>
	//    2    4:areturn         
	}

	public Any$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		typeUrl_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #20  <String "">
	//    5    8:putfield        #22  <Field Object typeUrl_>
		value_ = ByteString.EMPTY;
	//    6   11:aload_0         
	//    7   12:getstatic       #27  <Field ByteString ByteString.EMPTY>
	//    8   15:putfield        #29  <Field ByteString value_>
		return this;
	//    9   18:aload_0         
	//   10   19:areturn         
	}

	public volatile sageV3.Builder clear()
	{
		return ((sageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method Any$Builder clear()>
	//    2    4:areturn         
	}

	public volatile der clear()
	{
		return ((der) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method Any$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Builder clear()
	{
		return ((Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method Any$Builder clear()>
	//    2    4:areturn         
	}

	public Any$Builder clearField(FieldDescriptor fielddescriptor)
	{
		return (Any$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #108 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class Any$Builder>
	//    4    8:areturn         
	}

	public volatile sageV3.Builder clearField(FieldDescriptor fielddescriptor)
	{
		return ((sageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method Any$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile der clearField(FieldDescriptor fielddescriptor)
	{
		return ((der) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method Any$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile age.Builder clearOneof(OneofDescriptor oneofdescriptor)
	{
		return ((age.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method Any$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public Any$Builder clearOneof(OneofDescriptor oneofdescriptor)
	{
		return (Any$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #119 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class Any$Builder>
	//    4    8:areturn         
	}

	public volatile sageV3.Builder clearOneof(OneofDescriptor oneofdescriptor)
	{
		return ((sageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method Any$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile der clearOneof(OneofDescriptor oneofdescriptor)
	{
		return ((der) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method Any$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public Any$Builder clearTypeUrl()
	{
		typeUrl_ = ((Object) (Any.getDefaultInstance().getTypeUrl()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #124 <Method Any Any.getDefaultInstance()>
	//    2    4:invokevirtual   #128 <Method String Any.getTypeUrl()>
	//    3    7:putfield        #22  <Field Object typeUrl_>
		onChanged();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #131 <Method void onChanged()>
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public Any$Builder clearValue()
	{
		value_ = Any.getDefaultInstance().getValue();
	//    0    0:aload_0         
	//    1    1:invokestatic    #124 <Method Any Any.getDefaultInstance()>
	//    2    4:invokevirtual   #136 <Method ByteString Any.getValue()>
	//    3    7:putfield        #29  <Field ByteString value_>
		onChanged();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #131 <Method void onChanged()>
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public volatile age.Builder clone()
	{
		return ((age.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
	//    2    4:areturn         
	}

	public volatile ageLite.Builder clone()
	{
		return ((ageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
	//    2    4:areturn         
	}

	public Any$Builder clone()
	{
		return (Any$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class Any$Builder>
	//    3    7:areturn         
	}

	public volatile sageV3.Builder clone()
	{
		return ((sageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
	//    2    4:areturn         
	}

	public volatile der clone()
	{
		return ((der) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Builder clone()
	{
		return ((Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
	//    2    4:areturn         
	}

	public Any getDefaultInstanceForType()
	{
		return Any.getDefaultInstance();
	//    0    0:invokestatic    #124 <Method Any Any.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method Any getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method Any getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptor getDescriptorForType()
	{
		return AnyProto.internal_static_google_protobuf_Any_descriptor;
	//    0    0:getstatic       #48  <Field Descriptors$Descriptor AnyProto.internal_static_google_protobuf_Any_descriptor>
	//    1    3:areturn         
	}

	public String getTypeUrl()
	{
		Object obj = typeUrl_;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object typeUrl_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #152 <Class String>
	//*   5    9:ifne            27
		{
			obj = ((Object) (((ByteString)obj).toStringUtf8()));
	//    6   12:aload_1         
	//    7   13:checkcast       #24  <Class ByteString>
	//    8   16:invokevirtual   #155 <Method String ByteString.toStringUtf8()>
	//    9   19:astore_1        
			typeUrl_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #22  <Field Object typeUrl_>
			return ((String) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (String)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #152 <Class String>
	//   17   31:areturn         
		}
	}

	public ByteString getTypeUrlBytes()
	{
		Object obj = typeUrl_;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object typeUrl_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #152 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #152 <Class String>
	//    8   16:invokestatic    #160 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			typeUrl_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #22  <Field Object typeUrl_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #24  <Class ByteString>
	//   17   31:areturn         
		}
	}

	public ByteString getValue()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ByteString value_>
	//    2    4:areturn         
	}

	protected sageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return AnyProto.internal_static_google_protobuf_Any_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Any, com/google/protobuf/Any$Builder);
	//    0    0:getstatic       #166 <Field GeneratedMessageV3$FieldAccessorTable AnyProto.internal_static_google_protobuf_Any_fieldAccessorTable>
	//    1    3:ldc1            #9   <Class Any>
	//    2    5:ldc1            #2   <Class Any$Builder>
	//    3    7:invokevirtual   #172 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile age.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((age.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #179 <Method Any$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile age.Builder mergeFrom(Message message)
	{
		return ((age.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #183 <Method Any$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile ageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((ageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #179 <Method Any$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public Any$Builder mergeFrom(Any any)
	{
		if(any == Any.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #124 <Method Any Any.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(!any.getTypeUrl().isEmpty())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #128 <Method String Any.getTypeUrl()>
	//*   7   13:invokevirtual   #188 <Method boolean String.isEmpty()>
	//*   8   16:ifne            31
		{
			typeUrl_ = Any.access$300(any);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokestatic    #192 <Method Object Any.access$300(Any)>
	//   12   24:putfield        #22  <Field Object typeUrl_>
			onChanged();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #131 <Method void onChanged()>
		}
		if(any.getValue() != ByteString.EMPTY)
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #136 <Method ByteString Any.getValue()>
	//*  17   35:getstatic       #27  <Field ByteString ByteString.EMPTY>
	//*  18   38:if_acmpeq       50
			setValue(any.getValue());
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #136 <Method ByteString Any.getValue()>
	//   22   46:invokevirtual   #196 <Method Any$Builder setValue(ByteString)>
	//   23   49:pop             
		mergeUnknownFields(any.unknownFields);
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:getfield        #200 <Field UnknownFieldSet Any.unknownFields>
	//   27   55:invokevirtual   #204 <Method Any$Builder mergeUnknownFields(UnknownFieldSet)>
	//   28   58:pop             
		onChanged();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #131 <Method void onChanged()>
		return this;
	//   31   63:aload_0         
	//   32   64:areturn         
	}

	public Any$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((Any)Any.access$500().parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:invokestatic    #210 <Method Parser Any.access$500()>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #216 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class Any>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((Any) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #218 <Method Any$Builder mergeFrom(Any)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #221 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class Any>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #225 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #218 <Method Any$Builder mergeFrom(Any)>
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
		codedinputstream = ((CodedInputStream) ((Any)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((Any) (codedinputstream1)));
		throw codedinputstream;
	}

	public Any$Builder mergeFrom(Message message)
	{
		if(message instanceof Any)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class Any>
	//*   2    4:ifeq            16
		{
			return mergeFrom((Any)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class Any>
	//    6   12:invokevirtual   #218 <Method Any$Builder mergeFrom(Any)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #227 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
	//   11   21:pop             
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		}
	}

	public volatile der mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((der) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #179 <Method Any$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile der mergeFrom(Message message)
	{
		return ((der) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #183 <Method Any$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #179 <Method Any$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile age.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((age.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #204 <Method Any$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final Any$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (Any$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #234 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class Any$Builder>
	//    4    8:areturn         
	}

	public volatile sageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((sageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #204 <Method Any$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile der mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((der) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #204 <Method Any$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public Any$Builder setField(FieldDescriptor fielddescriptor, Object obj)
	{
		return (Any$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #238 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class Any$Builder>
	//    5    9:areturn         
	}

	public volatile sageV3.Builder setField(FieldDescriptor fielddescriptor, Object obj)
	{
		return ((sageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #240 <Method Any$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile der setField(FieldDescriptor fielddescriptor, Object obj)
	{
		return ((der) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #240 <Method Any$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public Any$Builder setRepeatedField(FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (Any$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #245 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class Any$Builder>
	//    6   10:areturn         
	}

	public volatile sageV3.Builder setRepeatedField(FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((sageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #247 <Method Any$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile der setRepeatedField(FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((der) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #247 <Method Any$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public Any$Builder setTypeUrl(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #252 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #253 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			typeUrl_ = ((Object) (s));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #22  <Field Object typeUrl_>
			onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #131 <Method void onChanged()>
			return this;
	//   11   21:aload_0         
	//   12   22:areturn         
		}
	}

	public Any$Builder setTypeUrlBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #252 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #253 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			AbstractMessageLite.checkByteStringIsUtf8(bytestring);
	//    6   12:aload_1         
	//    7   13:invokestatic    #260 <Method void AbstractMessageLite.checkByteStringIsUtf8(ByteString)>
			typeUrl_ = ((Object) (bytestring));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #22  <Field Object typeUrl_>
			onChanged();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #131 <Method void onChanged()>
			return this;
	//   13   25:aload_0         
	//   14   26:areturn         
		}
	}

	public final Any$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (Any$Builder)super.setUnknownFieldsProto3(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #264 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class Any$Builder>
	//    4    8:areturn         
	}

	public volatile sageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((sageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #266 <Method Any$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile der setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((der) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #266 <Method Any$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public Any$Builder setValue(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #252 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #253 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			value_ = bytestring;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #29  <Field ByteString value_>
			onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #131 <Method void onChanged()>
			return this;
	//   11   21:aload_0         
	//   12   22:areturn         
		}
	}

	private Object typeUrl_;
	private ByteString value_;

	private Any$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void GeneratedMessageV3$Builder()>
		typeUrl_ = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #20  <String "">
	//    4    7:putfield        #22  <Field Object typeUrl_>
		value_ = ByteString.EMPTY;
	//    5   10:aload_0         
	//    6   11:getstatic       #27  <Field ByteString ByteString.EMPTY>
	//    7   14:putfield        #29  <Field ByteString value_>
		maybeForceBuilderInitialization();
	//    8   17:aload_0         
	//    9   18:invokespecial   #32  <Method void maybeForceBuilderInitialization()>
	//   10   21:return          
	}

	Any$Builder(Any._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Any$Builder()>
	//    2    4:return          
	}

	private Any$Builder(sageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		typeUrl_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #20  <String "">
	//    5    8:putfield        #22  <Field Object typeUrl_>
		value_ = ByteString.EMPTY;
	//    6   11:aload_0         
	//    7   12:getstatic       #27  <Field ByteString ByteString.EMPTY>
	//    8   15:putfield        #29  <Field ByteString value_>
		maybeForceBuilderInitialization();
	//    9   18:aload_0         
	//   10   19:invokespecial   #32  <Method void maybeForceBuilderInitialization()>
	//   11   22:return          
	}

	Any$Builder(sageV3.BuilderParent builderparent, Any._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void Any$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
