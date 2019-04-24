// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, AnyOrBuilder, ByteString, InvalidProtocolBufferException, 
//			UnknownFieldSet, CodedInputStream, AnyProto, Message, 
//			Parser, CodedOutputStream, Internal, ExtensionRegistryLite, 
//			MessageLite, AbstractMessageLite, AbstractParser

public final class Any extends GeneratedMessageV3
	implements AnyOrBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements AnyOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #59  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class Any$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #61  <Method Any$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
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
			Any any = new Any(((GeneratedMessageV3.Builder) (this)));
		//    0    0:new             #9   <Class Any>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #82  <Method void Any(GeneratedMessageV3$Builder, Any$1)>
		//    5    9:astore_1        
			any.typeUrl_ = typeUrl_;
		//    6   10:aload_1         
		//    7   11:aload_0         
		//    8   12:getfield        #22  <Field Object typeUrl_>
		//    9   15:invokestatic    #86  <Method Object Any.access$302(Any, Object)>
		//   10   18:pop             
			any.value_ = value_;
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

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method Any$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
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

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method Any$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method Any$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method Any$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #108 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class Any$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #110 <Method Any$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #110 <Method Any$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #116 <Method Any$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #119 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class Any$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #116 <Method Any$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #116 <Method Any$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearTypeUrl()
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

		public Builder clearValue()
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

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #142 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class Any$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #139 <Method Any$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
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

		public Descriptors.Descriptor getDescriptorForType()
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

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
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

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #179 <Method Any$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #183 <Method Any$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #179 <Method Any$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeFrom(Any any)
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
				typeUrl_ = any.typeUrl_;
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

		public Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
			codedinputstream = ((CodedInputStream) ((Any)Any.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
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

		public Builder mergeFrom(Message message)
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

		public volatile Message.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((Message.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #179 <Method Any$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #183 <Method Any$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #179 <Method Any$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #204 <Method Any$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #234 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class Any$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #204 <Method Any$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #204 <Method Any$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #238 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class Any$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #240 <Method Any$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #240 <Method Any$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #245 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class Any$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #247 <Method Any$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #247 <Method Any$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setTypeUrl(String s)
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

		public Builder setTypeUrlBytes(ByteString bytestring)
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFieldsProto3(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #264 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class Any$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #266 <Method Any$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #266 <Method Any$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setValue(ByteString bytestring)
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

		private Builder()
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


		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	}


	private Any()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #47  <Field byte memoizedIsInitialized>
		typeUrl_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #49  <String "">
	//    7   12:putfield        #51  <Field Object typeUrl_>
		value_ = ByteString.EMPTY;
	//    8   15:aload_0         
	//    9   16:getstatic       #56  <Field ByteString ByteString.EMPTY>
	//   10   19:putfield        #58  <Field ByteString value_>
	//   11   22:return          
	}

	private Any(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Any()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #65  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #66  <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #72  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//    9   19:astore          5
		flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L8:
		if(flag) goto _L2; else goto _L1
	//   12   23:iload_3         
	//   13   24:ifne            108
_L1:
		int i = codedinputstream.readTag();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #78  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 3: default 159
	//	               0: 162
	//	               10: 86
	//	               18: 97;
	//   18   35:lookupswitch    3: default 159
	//	               0: 162
	//	               10: 86
	//	               18: 97
		   goto _L3 _L4 _L5 _L6
_L3:
		if(!parseUnknownFieldProto3(codedinputstream, builder, extensionregistrylite, i))
	//*  19   68:aload_0         
	//*  20   69:aload_1         
	//*  21   70:aload           5
	//*  22   72:aload_2         
	//*  23   73:iload           4
	//*  24   75:invokevirtual   #82  <Method boolean parseUnknownFieldProto3(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25   78:ifne            105
			flag = true;
	//   26   81:iconst_1        
	//   27   82:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28   83:goto            105
_L5:
		typeUrl_ = ((Object) (codedinputstream.readStringRequireUtf8()));
	//   29   86:aload_0         
	//   30   87:aload_1         
	//   31   88:invokevirtual   #86  <Method String CodedInputStream.readStringRequireUtf8()>
	//   32   91:putfield        #51  <Field Object typeUrl_>
		continue; /* Loop/switch isn't completed */
	//   33   94:goto            105
_L6:
		value_ = codedinputstream.readBytes();
	//   34   97:aload_0         
	//   35   98:aload_1         
	//   36   99:invokevirtual   #90  <Method ByteString CodedInputStream.readBytes()>
	//   37  102:putfield        #58  <Field ByteString value_>
		continue; /* Loop/switch isn't completed */
	//   38  105:goto            23
_L2:
		unknownFields = builder.build();
	//   39  108:aload_0         
	//   40  109:aload           5
	//   41  111:invokevirtual   #96  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   42  114:putfield        #100 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   43  117:aload_0         
	//   44  118:invokevirtual   #103 <Method void makeExtensionsImmutable()>
		return;
	//   45  121:return          
		codedinputstream;
	//   46  122:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   47  123:aload_1         
	//   48  124:aload_0         
	//   49  125:invokevirtual   #107 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   50  128:athrow          
		codedinputstream;
	//   51  129:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//   52  130:new             #61  <Class InvalidProtocolBufferException>
	//   53  133:dup             
	//   54  134:aload_1         
	//   55  135:invokespecial   #110 <Method void InvalidProtocolBufferException(IOException)>
	//   56  138:aload_0         
	//   57  139:invokevirtual   #107 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   58  142:athrow          
		codedinputstream;
	//   59  143:astore_1        
		unknownFields = builder.build();
	//   60  144:aload_0         
	//   61  145:aload           5
	//   62  147:invokevirtual   #96  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   63  150:putfield        #100 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   64  153:aload_0         
	//   65  154:invokevirtual   #103 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//   66  157:aload_1         
	//   67  158:athrow          
	//*  68  159:goto            68
_L4:
		flag = true;
	//   69  162:iconst_1        
	//   70  163:istore_3        
		if(true) goto _L8; else goto _L7
	//   71  164:goto            105
_L7:
	}


	private Any(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #117 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #47  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}


	public static Any getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #40  <Field Any DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return AnyProto.internal_static_google_protobuf_Any_descriptor;
	//    0    0:getstatic       #139 <Field Descriptors$Descriptor AnyProto.internal_static_google_protobuf_Any_descriptor>
	//    1    3:areturn         
	}

	private static String getTypeNameFromTypeUrl(String s)
	{
		int i = s.lastIndexOf('/');
	//    0    0:aload_0         
	//    1    1:bipush          47
	//    2    3:invokevirtual   #147 <Method int String.lastIndexOf(int)>
	//    3    6:istore_1        
		if(i == -1)
	//*   4    7:iload_1         
	//*   5    8:iconst_m1       
	//*   6    9:icmpne          15
			return "";
	//    7   12:ldc1            #49  <String "">
	//    8   14:areturn         
		else
			return s.substring(i + 1);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iconst_1        
	//   12   18:iadd            
	//   13   19:invokevirtual   #151 <Method String String.substring(int)>
	//   14   22:areturn         
	}

	private static String getTypeUrl(String s, Descriptors.Descriptor descriptor)
	{
		if(s.endsWith("/"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #155 <String "/">
	//*   2    3:invokevirtual   #159 <Method boolean String.endsWith(String)>
	//*   3    6:ifeq            31
			return (new StringBuilder()).append(s).append(descriptor.getFullName()).toString();
	//    4    9:new             #161 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #162 <Method void StringBuilder()>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #171 <Method String Descriptors$Descriptor.getFullName()>
	//   11   24:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   13   30:areturn         
		else
			return (new StringBuilder()).append(s).append("/").append(descriptor.getFullName()).toString();
	//   14   31:new             #161 <Class StringBuilder>
	//   15   34:dup             
	//   16   35:invokespecial   #162 <Method void StringBuilder()>
	//   17   38:aload_0         
	//   18   39:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   19   42:ldc1            #155 <String "/">
	//   20   44:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #171 <Method String Descriptors$Descriptor.getFullName()>
	//   23   51:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   25   57:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #40  <Field Any DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #178 <Method Any$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(Any any)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(any);
	//    0    0:getstatic       #40  <Field Any DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #178 <Method Any$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #182 <Method Any$Builder Any$Builder.mergeFrom(Any)>
	//    4   10:areturn         
	}

	public static Any pack(Message message)
	{
		return newBuilder().setTypeUrl(getTypeUrl("type.googleapis.com", message.getDescriptorForType())).setValue(message.toByteString()).build();
	//    0    0:invokestatic    #186 <Method Any$Builder newBuilder()>
	//    1    3:ldc1            #188 <String "type.googleapis.com">
	//    2    5:aload_0         
	//    3    6:invokeinterface #193 <Method Descriptors$Descriptor Message.getDescriptorForType()>
	//    4   11:invokestatic    #195 <Method String getTypeUrl(String, Descriptors$Descriptor)>
	//    5   14:invokevirtual   #199 <Method Any$Builder Any$Builder.setTypeUrl(String)>
	//    6   17:aload_0         
	//    7   18:invokeinterface #202 <Method ByteString Message.toByteString()>
	//    8   23:invokevirtual   #206 <Method Any$Builder Any$Builder.setValue(ByteString)>
	//    9   26:invokevirtual   #208 <Method Any Any$Builder.build()>
	//   10   29:areturn         
	}

	public static Any pack(Message message, String s)
	{
		return newBuilder().setTypeUrl(getTypeUrl(s, message.getDescriptorForType())).setValue(message.toByteString()).build();
	//    0    0:invokestatic    #186 <Method Any$Builder newBuilder()>
	//    1    3:aload_1         
	//    2    4:aload_0         
	//    3    5:invokeinterface #193 <Method Descriptors$Descriptor Message.getDescriptorForType()>
	//    4   10:invokestatic    #195 <Method String getTypeUrl(String, Descriptors$Descriptor)>
	//    5   13:invokevirtual   #199 <Method Any$Builder Any$Builder.setTypeUrl(String)>
	//    6   16:aload_0         
	//    7   17:invokeinterface #202 <Method ByteString Message.toByteString()>
	//    8   22:invokevirtual   #206 <Method Any$Builder Any$Builder.setValue(ByteString)>
	//    9   25:invokevirtual   #208 <Method Any Any$Builder.build()>
	//   10   28:areturn         
	}

	public static Any parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (Any)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #217 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Any>
	//    4   10:areturn         
	}

	public static Any parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Any)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #221 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Any>
	//    5   11:areturn         
	}

	public static Any parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (Any)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #228 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class Any>
	//    4   12:areturn         
	}

	public static Any parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Any)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #232 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Any>
	//    5   13:areturn         
	}

	public static Any parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (Any)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #237 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class Any>
	//    4   10:areturn         
	}

	public static Any parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Any)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #241 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Any>
	//    5   11:areturn         
	}

	public static Any parseFrom(InputStream inputstream)
		throws IOException
	{
		return (Any)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #243 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Any>
	//    4   10:areturn         
	}

	public static Any parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Any)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #245 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Any>
	//    5   11:areturn         
	}

	public static Any parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (Any)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #249 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class Any>
	//    4   12:areturn         
	}

	public static Any parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Any)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #253 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Any>
	//    5   13:areturn         
	}

	public static Any parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (Any)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #257 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class Any>
	//    4   12:areturn         
	}

	public static Any parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Any)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #261 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Any>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof Any))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Any>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #267 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((Any)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Any>
	//   14   24:astore_1        
		boolean flag;
		if(true && getTypeUrl().equals(((Object) (((Any) (obj)).getTypeUrl()))))
	//*  15   25:iconst_1        
	//*  16   26:ifeq            48
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #269 <Method String getTypeUrl()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #269 <Method String getTypeUrl()>
	//*  21   37:invokevirtual   #270 <Method boolean String.equals(Object)>
	//*  22   40:ifeq            48
			flag = true;
	//   23   43:iconst_1        
	//   24   44:istore_2        
		else
	//*  25   45:goto            50
			flag = false;
	//   26   48:iconst_0        
	//   27   49:istore_2        
		if(flag && getValue().equals(((Object) (((Any) (obj)).getValue()))))
	//*  28   50:iload_2         
	//*  29   51:ifeq            73
	//*  30   54:aload_0         
	//*  31   55:invokevirtual   #273 <Method ByteString getValue()>
	//*  32   58:aload_1         
	//*  33   59:invokevirtual   #273 <Method ByteString getValue()>
	//*  34   62:invokevirtual   #274 <Method boolean ByteString.equals(Object)>
	//*  35   65:ifeq            73
			flag = true;
	//   36   68:iconst_1        
	//   37   69:istore_2        
		else
	//*  38   70:goto            75
			flag = false;
	//   39   73:iconst_0        
	//   40   74:istore_2        
		return flag && unknownFields.equals(((Object) (((Any) (obj)).unknownFields)));
	//   41   75:iload_2         
	//   42   76:ifeq            95
	//   43   79:aload_0         
	//   44   80:getfield        #100 <Field UnknownFieldSet unknownFields>
	//   45   83:aload_1         
	//   46   84:getfield        #100 <Field UnknownFieldSet unknownFields>
	//   47   87:invokevirtual   #275 <Method boolean UnknownFieldSet.equals(Object)>
	//   48   90:ifeq            95
	//   49   93:iconst_1        
	//   50   94:ireturn         
	//   51   95:iconst_0        
	//   52   96:ireturn         
	}

	public Any getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #40  <Field Any DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #279 <Method Any getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #279 <Method Any getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field int memoizedSize>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_1        
		if(!getTypeUrlBytes().isEmpty())
	//*  10   14:aload_0         
	//*  11   15:invokevirtual   #288 <Method ByteString getTypeUrlBytes()>
	//*  12   18:invokevirtual   #292 <Method boolean ByteString.isEmpty()>
	//*  13   21:ifne            35
			i = GeneratedMessageV3.computeStringSize(1, typeUrl_) + 0;
	//   14   24:iconst_1        
	//   15   25:aload_0         
	//   16   26:getfield        #51  <Field Object typeUrl_>
	//   17   29:invokestatic    #296 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   18   32:iconst_0        
	//   19   33:iadd            
	//   20   34:istore_1        
		int j = i;
	//   21   35:iload_1         
	//   22   36:istore_2        
		if(!value_.isEmpty())
	//*  23   37:aload_0         
	//*  24   38:getfield        #58  <Field ByteString value_>
	//*  25   41:invokevirtual   #292 <Method boolean ByteString.isEmpty()>
	//*  26   44:ifne            58
			j = i + CodedOutputStream.computeBytesSize(2, value_);
	//   27   47:iload_1         
	//   28   48:iconst_2        
	//   29   49:aload_0         
	//   30   50:getfield        #58  <Field ByteString value_>
	//   31   53:invokestatic    #302 <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   32   56:iadd            
	//   33   57:istore_2        
		i = j + unknownFields.getSerializedSize();
	//   34   58:iload_2         
	//   35   59:aload_0         
	//   36   60:getfield        #100 <Field UnknownFieldSet unknownFields>
	//   37   63:invokevirtual   #304 <Method int UnknownFieldSet.getSerializedSize()>
	//   38   66:iadd            
	//   39   67:istore_1        
		memoizedSize = i;
	//   40   68:aload_0         
	//   41   69:iload_1         
	//   42   70:putfield        #285 <Field int memoizedSize>
		return i;
	//   43   73:iload_1         
	//   44   74:ireturn         
	}

	public String getTypeUrl()
	{
		Object obj = typeUrl_;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object typeUrl_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #143 <Class String>
	//*   5    9:ifeq            17
		{
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #143 <Class String>
	//    8   16:areturn         
		} else
		{
			obj = ((Object) (((ByteString)obj).toStringUtf8()));
	//    9   17:aload_1         
	//   10   18:checkcast       #53  <Class ByteString>
	//   11   21:invokevirtual   #307 <Method String ByteString.toStringUtf8()>
	//   12   24:astore_1        
			typeUrl_ = obj;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #51  <Field Object typeUrl_>
			return ((String) (obj));
	//   16   30:aload_1         
	//   17   31:areturn         
		}
	}

	public ByteString getTypeUrlBytes()
	{
		Object obj = typeUrl_;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object typeUrl_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #143 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #143 <Class String>
	//    8   16:invokestatic    #311 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			typeUrl_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #51  <Field Object typeUrl_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #53  <Class ByteString>
	//   17   31:areturn         
		}
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public ByteString getValue()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ByteString value_>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #316 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
		{
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #316 <Field int memoizedHashCode>
	//    5   11:ireturn         
		} else
		{
			int i = (((((((Object) (getDescriptor())).hashCode() + 779) * 37 + 1) * 53 + getTypeUrl().hashCode()) * 37 + 2) * 53 + getValue().hashCode()) * 29 + unknownFields.hashCode();
	//    6   12:invokestatic    #318 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #322 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:bipush          37
	//   11   24:imul            
	//   12   25:iconst_1        
	//   13   26:iadd            
	//   14   27:bipush          53
	//   15   29:imul            
	//   16   30:aload_0         
	//   17   31:invokevirtual   #269 <Method String getTypeUrl()>
	//   18   34:invokevirtual   #323 <Method int String.hashCode()>
	//   19   37:iadd            
	//   20   38:bipush          37
	//   21   40:imul            
	//   22   41:iconst_2        
	//   23   42:iadd            
	//   24   43:bipush          53
	//   25   45:imul            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #273 <Method ByteString getValue()>
	//   28   50:invokevirtual   #324 <Method int ByteString.hashCode()>
	//   29   53:iadd            
	//   30   54:bipush          29
	//   31   56:imul            
	//   32   57:aload_0         
	//   33   58:getfield        #100 <Field UnknownFieldSet unknownFields>
	//   34   61:invokevirtual   #325 <Method int UnknownFieldSet.hashCode()>
	//   35   64:iadd            
	//   36   65:istore_1        
			memoizedHashCode = i;
	//   37   66:aload_0         
	//   38   67:iload_1         
	//   39   68:putfield        #316 <Field int memoizedHashCode>
			return i;
	//   40   71:iload_1         
	//   41   72:ireturn         
		}
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return AnyProto.internal_static_google_protobuf_Any_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Any, com/google/protobuf/Any$Builder);
	//    0    0:getstatic       #331 <Field GeneratedMessageV3$FieldAccessorTable AnyProto.internal_static_google_protobuf_Any_fieldAccessorTable>
	//    1    3:ldc1            #2   <Class Any>
	//    2    5:ldc1            #10  <Class Any$Builder>
	//    3    7:invokevirtual   #337 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public boolean is(Class class1)
	{
		class1 = ((Class) ((Message)Internal.getDefaultInstance(class1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #344 <Method MessageLite Internal.getDefaultInstance(Class)>
	//    2    4:checkcast       #190 <Class Message>
	//    3    7:astore_1        
		return getTypeNameFromTypeUrl(getTypeUrl()).equals(((Object) (((Message) (class1)).getDescriptorForType().getFullName())));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #269 <Method String getTypeUrl()>
	//    6   12:invokestatic    #346 <Method String getTypeNameFromTypeUrl(String)>
	//    7   15:aload_1         
	//    8   16:invokeinterface #193 <Method Descriptors$Descriptor Message.getDescriptorForType()>
	//    9   21:invokevirtual   #171 <Method String Descriptors$Descriptor.getFullName()>
	//   10   24:invokevirtual   #270 <Method boolean String.equals(Object)>
	//   11   27:ireturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field byte memoizedIsInitialized>
	//    2    4:istore_1        
		if(byte0 == 1)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(byte0 == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            18
		{
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #47  <Field byte memoizedIsInitialized>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #186 <Method Any$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent);
	//    0    0:new             #10  <Class Any$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #353 <Method void Any$Builder(GeneratedMessageV3$BuilderParent, Any$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #356 <Method Any$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #359 <Method Any$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #356 <Method Any$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #40  <Field Any DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder();
	//    3    7:new             #10  <Class Any$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #363 <Method void Any$Builder(Any$1)>
	//    7   15:areturn         
		else
			return (new Builder()).mergeFrom(this);
	//    8   16:new             #10  <Class Any$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #363 <Method void Any$Builder(Any$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #182 <Method Any$Builder Any$Builder.mergeFrom(Any)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method Any$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method Any$Builder toBuilder()>
	//    2    4:areturn         
	}

	public Message unpack(Class class1)
		throws InvalidProtocolBufferException
	{
		if(!is(class1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #367 <Method boolean is(Class)>
	//*   3    5:ifne            19
			throw new InvalidProtocolBufferException("Type of the Any message does not match the given class.");
	//    4    8:new             #61  <Class InvalidProtocolBufferException>
	//    5   11:dup             
	//    6   12:ldc2            #369 <String "Type of the Any message does not match the given class.">
	//    7   15:invokespecial   #372 <Method void InvalidProtocolBufferException(String)>
	//    8   18:athrow          
		if(cachedUnpackValue != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #374 <Field Message cachedUnpackValue>
	//*  11   23:ifnull          31
		{
			return cachedUnpackValue;
	//   12   26:aload_0         
	//   13   27:getfield        #374 <Field Message cachedUnpackValue>
	//   14   30:areturn         
		} else
		{
			class1 = ((Class) ((Message)((Message)Internal.getDefaultInstance(class1)).getParserForType().parseFrom(getValue())));
	//   15   31:aload_1         
	//   16   32:invokestatic    #344 <Method MessageLite Internal.getDefaultInstance(Class)>
	//   17   35:checkcast       #190 <Class Message>
	//   18   38:invokeinterface #376 <Method Parser Message.getParserForType()>
	//   19   43:aload_0         
	//   20   44:invokevirtual   #273 <Method ByteString getValue()>
	//   21   47:invokeinterface #228 <Method Object Parser.parseFrom(ByteString)>
	//   22   52:checkcast       #190 <Class Message>
	//   23   55:astore_1        
			cachedUnpackValue = ((Message) (class1));
	//   24   56:aload_0         
	//   25   57:aload_1         
	//   26   58:putfield        #374 <Field Message cachedUnpackValue>
			return ((Message) (class1));
	//   27   61:aload_1         
	//   28   62:areturn         
		}
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(!getTypeUrlBytes().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #288 <Method ByteString getTypeUrlBytes()>
	//*   2    4:invokevirtual   #292 <Method boolean ByteString.isEmpty()>
	//*   3    7:ifne            19
			GeneratedMessageV3.writeString(codedoutputstream, 1, typeUrl_);
	//    4   10:aload_1         
	//    5   11:iconst_1        
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field Object typeUrl_>
	//    8   16:invokestatic    #383 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if(!value_.isEmpty())
	//*   9   19:aload_0         
	//*  10   20:getfield        #58  <Field ByteString value_>
	//*  11   23:invokevirtual   #292 <Method boolean ByteString.isEmpty()>
	//*  12   26:ifne            38
			codedoutputstream.writeBytes(2, value_);
	//   13   29:aload_1         
	//   14   30:iconst_2        
	//   15   31:aload_0         
	//   16   32:getfield        #58  <Field ByteString value_>
	//   17   35:invokevirtual   #387 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		unknownFields.writeTo(codedoutputstream);
	//   18   38:aload_0         
	//   19   39:getfield        #100 <Field UnknownFieldSet unknownFields>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #389 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   22   46:return          
	}

	private static final Any DEFAULT_INSTANCE = new Any();
	private static final Parser PARSER = new AbstractParser() {

		public Any parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new Any(codedinputstream, extensionregistrylite);
		//    0    0:new             #7   <Class Any>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #19  <Method void Any(CodedInputStream, ExtensionRegistryLite, Any$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method Any parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int TYPE_URL_FIELD_NUMBER = 1;
	public static final int VALUE_FIELD_NUMBER = 2;
	private static final long serialVersionUID = 0L;
	private volatile Message cachedUnpackValue;
	private byte memoizedIsInitialized;
	private volatile Object typeUrl_;
	private ByteString value_;

	static 
	{
	//    0    0:new             #2   <Class Any>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void Any()>
	//    3    7:putstatic       #40  <Field Any DEFAULT_INSTANCE>
	//    4   10:new             #8   <Class Any$1>
	//    5   13:dup             
	//    6   14:invokespecial   #41  <Method void Any$1()>
	//    7   17:putstatic       #43  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$300(Any any)
	{
		return any.typeUrl_;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object typeUrl_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$302(Any any, Object obj)
	{
		any.typeUrl_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Object typeUrl_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static ByteString access$402(Any any, ByteString bytestring)
	{
		any.value_ = bytestring;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field ByteString value_>
		return bytestring;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Parser access$500()
	{
		return PARSER;
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:areturn         
	}

*/
}
