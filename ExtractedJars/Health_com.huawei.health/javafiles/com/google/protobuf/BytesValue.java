// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, BytesValueOrBuilder, ByteString, InvalidProtocolBufferException, 
//			UnknownFieldSet, CodedInputStream, WrappersProto, Parser, 
//			CodedOutputStream, ExtensionRegistryLite, Message, MessageLite, 
//			AbstractParser

public final class BytesValue extends GeneratedMessageV3
	implements BytesValueOrBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements BytesValueOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #53  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class BytesValue$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #55  <Method BytesValue$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
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
			BytesValue bytesvalue = new BytesValue(((GeneratedMessageV3.Builder) (this)));
		//    0    0:new             #9   <Class BytesValue>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #76  <Method void BytesValue(GeneratedMessageV3$Builder, BytesValue$1)>
		//    5    9:astore_1        
			bytesvalue.value_ = value_;
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

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #88  <Method BytesValue$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
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

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
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

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #88  <Method BytesValue$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #98  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class BytesValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method BytesValue$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method BytesValue$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #106 <Method BytesValue$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #109 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class BytesValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #106 <Method BytesValue$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #106 <Method BytesValue$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearValue()
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

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #124 <Method BytesValue$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #124 <Method BytesValue$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #127 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class BytesValue$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
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

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
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

		public Descriptors.Descriptor getDescriptorForType()
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

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
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

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #154 <Method BytesValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #158 <Method BytesValue$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #154 <Method BytesValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeFrom(BytesValue bytesvalue)
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
			codedinputstream = ((CodedInputStream) ((BytesValue)BytesValue.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
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

		public Builder mergeFrom(Message message)
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

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #154 <Method BytesValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #172 <Method BytesValue$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #202 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class BytesValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #206 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class BytesValue$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #208 <Method BytesValue$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #208 <Method BytesValue$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #213 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class BytesValue$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #215 <Method BytesValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #215 <Method BytesValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFieldsProto3(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #220 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class BytesValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
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

		public Builder setValue(ByteString bytestring)
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

		private Builder()
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


		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	}


	private BytesValue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #41  <Field byte memoizedIsInitialized>
		value_ = ByteString.EMPTY;
	//    5    9:aload_0         
	//    6   10:getstatic       #46  <Field ByteString ByteString.EMPTY>
	//    7   13:putfield        #48  <Field ByteString value_>
	//    8   16:return          
	}

	private BytesValue(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void BytesValue()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #55  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #56  <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #62  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//    9   19:astore          5
		flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L7:
		if(flag) goto _L2; else goto _L1
	//   12   23:iload_3         
	//   13   24:ifne            89
_L1:
		int i = codedinputstream.readTag();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #68  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 2: default 140
	//	               0: 143
	//	               10: 78;
	//   18   35:lookupswitch    2: default 140
	//	               0: 143
	//	               10: 78
		   goto _L3 _L4 _L5
_L3:
		if(!parseUnknownFieldProto3(codedinputstream, builder, extensionregistrylite, i))
	//*  19   60:aload_0         
	//*  20   61:aload_1         
	//*  21   62:aload           5
	//*  22   64:aload_2         
	//*  23   65:iload           4
	//*  24   67:invokevirtual   #72  <Method boolean parseUnknownFieldProto3(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25   70:ifne            86
			flag = true;
	//   26   73:iconst_1        
	//   27   74:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28   75:goto            86
_L5:
		value_ = codedinputstream.readBytes();
	//   29   78:aload_0         
	//   30   79:aload_1         
	//   31   80:invokevirtual   #76  <Method ByteString CodedInputStream.readBytes()>
	//   32   83:putfield        #48  <Field ByteString value_>
		continue; /* Loop/switch isn't completed */
	//   33   86:goto            23
_L2:
		unknownFields = builder.build();
	//   34   89:aload_0         
	//   35   90:aload           5
	//   36   92:invokevirtual   #82  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   37   95:putfield        #86  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   38   98:aload_0         
	//   39   99:invokevirtual   #89  <Method void makeExtensionsImmutable()>
		return;
	//   40  102:return          
		codedinputstream;
	//   41  103:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   42  104:aload_1         
	//   43  105:aload_0         
	//   44  106:invokevirtual   #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   45  109:athrow          
		codedinputstream;
	//   46  110:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//   47  111:new             #51  <Class InvalidProtocolBufferException>
	//   48  114:dup             
	//   49  115:aload_1         
	//   50  116:invokespecial   #96  <Method void InvalidProtocolBufferException(IOException)>
	//   51  119:aload_0         
	//   52  120:invokevirtual   #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   53  123:athrow          
		codedinputstream;
	//   54  124:astore_1        
		unknownFields = builder.build();
	//   55  125:aload_0         
	//   56  126:aload           5
	//   57  128:invokevirtual   #82  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   58  131:putfield        #86  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   59  134:aload_0         
	//   60  135:invokevirtual   #89  <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//   61  138:aload_1         
	//   62  139:athrow          
	//*  63  140:goto            60
_L4:
		flag = true;
	//   64  143:iconst_1        
	//   65  144:istore_3        
		if(true) goto _L7; else goto _L6
	//   66  145:goto            86
_L6:
	}


	private BytesValue(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #41  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}


	public static BytesValue getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #34  <Field BytesValue DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return WrappersProto.internal_static_google_protobuf_BytesValue_descriptor;
	//    0    0:getstatic       #121 <Field Descriptors$Descriptor WrappersProto.internal_static_google_protobuf_BytesValue_descriptor>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #34  <Field BytesValue DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #125 <Method BytesValue$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(BytesValue bytesvalue)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(bytesvalue);
	//    0    0:getstatic       #34  <Field BytesValue DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #125 <Method BytesValue$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #129 <Method BytesValue$Builder BytesValue$Builder.mergeFrom(BytesValue)>
	//    4   10:areturn         
	}

	public static BytesValue of(ByteString bytestring)
	{
		return newBuilder().setValue(bytestring).build();
	//    0    0:invokestatic    #133 <Method BytesValue$Builder newBuilder()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #137 <Method BytesValue$Builder BytesValue$Builder.setValue(ByteString)>
	//    3    7:invokevirtual   #139 <Method BytesValue BytesValue$Builder.build()>
	//    4   10:areturn         
	}

	public static BytesValue parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (BytesValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #145 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class BytesValue>
	//    4   10:areturn         
	}

	public static BytesValue parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (BytesValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #149 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class BytesValue>
	//    5   11:areturn         
	}

	public static BytesValue parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (BytesValue)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #155 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class BytesValue>
	//    4   12:areturn         
	}

	public static BytesValue parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (BytesValue)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #159 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class BytesValue>
	//    5   13:areturn         
	}

	public static BytesValue parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (BytesValue)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #164 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class BytesValue>
	//    4   10:areturn         
	}

	public static BytesValue parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (BytesValue)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #168 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class BytesValue>
	//    5   11:areturn         
	}

	public static BytesValue parseFrom(InputStream inputstream)
		throws IOException
	{
		return (BytesValue)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #170 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class BytesValue>
	//    4   10:areturn         
	}

	public static BytesValue parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (BytesValue)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #172 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class BytesValue>
	//    5   11:areturn         
	}

	public static BytesValue parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (BytesValue)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #176 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class BytesValue>
	//    4   12:areturn         
	}

	public static BytesValue parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (BytesValue)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #180 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class BytesValue>
	//    5   13:areturn         
	}

	public static BytesValue parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (BytesValue)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #184 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class BytesValue>
	//    4   12:areturn         
	}

	public static BytesValue parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (BytesValue)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #188 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class BytesValue>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #37  <Field Parser PARSER>
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
		if(!(obj instanceof BytesValue))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class BytesValue>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #194 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((BytesValue)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class BytesValue>
	//   14   24:astore_1        
		boolean flag;
		if(true && getValue().equals(((Object) (((BytesValue) (obj)).getValue()))))
	//*  15   25:iconst_1        
	//*  16   26:ifeq            48
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #197 <Method ByteString getValue()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #197 <Method ByteString getValue()>
	//*  21   37:invokevirtual   #198 <Method boolean ByteString.equals(Object)>
	//*  22   40:ifeq            48
			flag = true;
	//   23   43:iconst_1        
	//   24   44:istore_2        
		else
	//*  25   45:goto            50
			flag = false;
	//   26   48:iconst_0        
	//   27   49:istore_2        
		return flag && unknownFields.equals(((Object) (((BytesValue) (obj)).unknownFields)));
	//   28   50:iload_2         
	//   29   51:ifeq            70
	//   30   54:aload_0         
	//   31   55:getfield        #86  <Field UnknownFieldSet unknownFields>
	//   32   58:aload_1         
	//   33   59:getfield        #86  <Field UnknownFieldSet unknownFields>
	//   34   62:invokevirtual   #199 <Method boolean UnknownFieldSet.equals(Object)>
	//   35   65:ifeq            70
	//   36   68:iconst_1        
	//   37   69:ireturn         
	//   38   70:iconst_0        
	//   39   71:ireturn         
	}

	public BytesValue getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #34  <Field BytesValue DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #203 <Method BytesValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #203 <Method BytesValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field int memoizedSize>
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
		if(!value_.isEmpty())
	//*  10   14:aload_0         
	//*  11   15:getfield        #48  <Field ByteString value_>
	//*  12   18:invokevirtual   #213 <Method boolean ByteString.isEmpty()>
	//*  13   21:ifne            35
			i = CodedOutputStream.computeBytesSize(1, value_) + 0;
	//   14   24:iconst_1        
	//   15   25:aload_0         
	//   16   26:getfield        #48  <Field ByteString value_>
	//   17   29:invokestatic    #219 <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   18   32:iconst_0        
	//   19   33:iadd            
	//   20   34:istore_1        
		i += unknownFields.getSerializedSize();
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:getfield        #86  <Field UnknownFieldSet unknownFields>
	//   24   40:invokevirtual   #221 <Method int UnknownFieldSet.getSerializedSize()>
	//   25   43:iadd            
	//   26   44:istore_1        
		memoizedSize = i;
	//   27   45:aload_0         
	//   28   46:iload_1         
	//   29   47:putfield        #209 <Field int memoizedSize>
		return i;
	//   30   50:iload_1         
	//   31   51:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public ByteString getValue()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ByteString value_>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
		{
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field int memoizedHashCode>
	//    5   11:ireturn         
		} else
		{
			int i = (((((Object) (getDescriptor())).hashCode() + 779) * 37 + 1) * 53 + getValue().hashCode()) * 29 + unknownFields.hashCode();
	//    6   12:invokestatic    #228 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #232 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:bipush          37
	//   11   24:imul            
	//   12   25:iconst_1        
	//   13   26:iadd            
	//   14   27:bipush          53
	//   15   29:imul            
	//   16   30:aload_0         
	//   17   31:invokevirtual   #197 <Method ByteString getValue()>
	//   18   34:invokevirtual   #233 <Method int ByteString.hashCode()>
	//   19   37:iadd            
	//   20   38:bipush          29
	//   21   40:imul            
	//   22   41:aload_0         
	//   23   42:getfield        #86  <Field UnknownFieldSet unknownFields>
	//   24   45:invokevirtual   #234 <Method int UnknownFieldSet.hashCode()>
	//   25   48:iadd            
	//   26   49:istore_1        
			memoizedHashCode = i;
	//   27   50:aload_0         
	//   28   51:iload_1         
	//   29   52:putfield        #226 <Field int memoizedHashCode>
			return i;
	//   30   55:iload_1         
	//   31   56:ireturn         
		}
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return WrappersProto.internal_static_google_protobuf_BytesValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/BytesValue, com/google/protobuf/BytesValue$Builder);
	//    0    0:getstatic       #240 <Field GeneratedMessageV3$FieldAccessorTable WrappersProto.internal_static_google_protobuf_BytesValue_fieldAccessorTable>
	//    1    3:ldc1            #2   <Class BytesValue>
	//    2    5:ldc1            #10  <Class BytesValue$Builder>
	//    3    7:invokevirtual   #246 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field byte memoizedIsInitialized>
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
	//   14   20:putfield        #41  <Field byte memoizedIsInitialized>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #133 <Method BytesValue$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent);
	//    0    0:new             #10  <Class BytesValue$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #252 <Method void BytesValue$Builder(GeneratedMessageV3$BuilderParent, BytesValue$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #255 <Method BytesValue$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #258 <Method BytesValue$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #255 <Method BytesValue$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #34  <Field BytesValue DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder();
	//    3    7:new             #10  <Class BytesValue$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #262 <Method void BytesValue$Builder(BytesValue$1)>
	//    7   15:areturn         
		else
			return (new Builder()).mergeFrom(this);
	//    8   16:new             #10  <Class BytesValue$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #262 <Method void BytesValue$Builder(BytesValue$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #129 <Method BytesValue$Builder BytesValue$Builder.mergeFrom(BytesValue)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method BytesValue$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method BytesValue$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(!value_.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field ByteString value_>
	//*   2    4:invokevirtual   #213 <Method boolean ByteString.isEmpty()>
	//*   3    7:ifne            19
			codedoutputstream.writeBytes(1, value_);
	//    4   10:aload_1         
	//    5   11:iconst_1        
	//    6   12:aload_0         
	//    7   13:getfield        #48  <Field ByteString value_>
	//    8   16:invokevirtual   #268 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		unknownFields.writeTo(codedoutputstream);
	//    9   19:aload_0         
	//   10   20:getfield        #86  <Field UnknownFieldSet unknownFields>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #270 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   13   27:return          
	}

	private static final BytesValue DEFAULT_INSTANCE = new BytesValue();
	private static final Parser PARSER = new AbstractParser() {

		public BytesValue parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new BytesValue(codedinputstream, extensionregistrylite);
		//    0    0:new             #7   <Class BytesValue>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #19  <Method void BytesValue(CodedInputStream, ExtensionRegistryLite, BytesValue$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method BytesValue parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int VALUE_FIELD_NUMBER = 1;
	private static final long serialVersionUID = 0L;
	private byte memoizedIsInitialized;
	private ByteString value_;

	static 
	{
	//    0    0:new             #2   <Class BytesValue>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void BytesValue()>
	//    3    7:putstatic       #34  <Field BytesValue DEFAULT_INSTANCE>
	//    4   10:new             #8   <Class BytesValue$1>
	//    5   13:dup             
	//    6   14:invokespecial   #35  <Method void BytesValue$1()>
	//    7   17:putstatic       #37  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static ByteString access$302(BytesValue bytesvalue, ByteString bytestring)
	{
		bytesvalue.value_ = bytestring;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field ByteString value_>
		return bytestring;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Parser access$400()
	{
		return PARSER;
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:areturn         
	}

*/
}
