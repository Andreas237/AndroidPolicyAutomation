// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, BoolValueOrBuilder, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, WrappersProto, Parser, CodedOutputStream, 
//			Internal, ExtensionRegistryLite, ByteString, Message, 
//			MessageLite, AbstractParser

public final class BoolValue extends GeneratedMessageV3
	implements BoolValueOrBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements BoolValueOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #45  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class BoolValue$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #47  <Method BoolValue$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
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
			BoolValue boolvalue = new BoolValue(((GeneratedMessageV3.Builder) (this)));
		//    0    0:new             #9   <Class BoolValue>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #68  <Method void BoolValue(GeneratedMessageV3$Builder, BoolValue$1)>
		//    5    9:astore_1        
			boolvalue.value_ = value_;
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

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #82  <Method BoolValue$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
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

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
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

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #82  <Method BoolValue$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #92  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class BoolValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #94  <Method BoolValue$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #94  <Method BoolValue$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method BoolValue$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #103 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class BoolValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method BoolValue$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method BoolValue$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearValue()
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

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #111 <Method BoolValue$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #111 <Method BoolValue$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #114 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class BoolValue$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
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

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
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

		public Descriptors.Descriptor getDescriptorForType()
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

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
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

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #145 <Method BoolValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #149 <Method BoolValue$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #145 <Method BoolValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeFrom(BoolValue boolvalue)
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
			codedinputstream = ((CodedInputStream) ((BoolValue)BoolValue.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
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

		public Builder mergeFrom(Message message)
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

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #145 <Method BoolValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #165 <Method BoolValue$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #195 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class BoolValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #199 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class BoolValue$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #201 <Method BoolValue$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #201 <Method BoolValue$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #206 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class BoolValue$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #208 <Method BoolValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #208 <Method BoolValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFieldsProto3(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #213 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class BoolValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
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

		public Builder setValue(boolean flag)
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

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void GeneratedMessageV3$Builder()>
			maybeForceBuilderInitialization();
		//    2    4:aload_0         
		//    3    5:invokespecial   #19  <Method void maybeForceBuilderInitialization()>
		//    4    8:return          
		}


		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	}


	private BoolValue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #41  <Field byte memoizedIsInitialized>
		value_ = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #43  <Field boolean value_>
	//    8   14:return          
	}

	private BoolValue(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void BoolValue()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #50  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #51  <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #57  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
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
	//   15   28:invokevirtual   #63  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 2: default 140
	//	               0: 143
	//	               8: 78;
	//   18   35:lookupswitch    2: default 140
	//	               0: 143
	//	               8: 78
		   goto _L3 _L4 _L5
_L3:
		if(!parseUnknownFieldProto3(codedinputstream, builder, extensionregistrylite, i))
	//*  19   60:aload_0         
	//*  20   61:aload_1         
	//*  21   62:aload           5
	//*  22   64:aload_2         
	//*  23   65:iload           4
	//*  24   67:invokevirtual   #67  <Method boolean parseUnknownFieldProto3(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25   70:ifne            86
			flag = true;
	//   26   73:iconst_1        
	//   27   74:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28   75:goto            86
_L5:
		value_ = codedinputstream.readBool();
	//   29   78:aload_0         
	//   30   79:aload_1         
	//   31   80:invokevirtual   #71  <Method boolean CodedInputStream.readBool()>
	//   32   83:putfield        #43  <Field boolean value_>
		continue; /* Loop/switch isn't completed */
	//   33   86:goto            23
_L2:
		unknownFields = builder.build();
	//   34   89:aload_0         
	//   35   90:aload           5
	//   36   92:invokevirtual   #77  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   37   95:putfield        #81  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   38   98:aload_0         
	//   39   99:invokevirtual   #84  <Method void makeExtensionsImmutable()>
		return;
	//   40  102:return          
		codedinputstream;
	//   41  103:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   42  104:aload_1         
	//   43  105:aload_0         
	//   44  106:invokevirtual   #88  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   45  109:athrow          
		codedinputstream;
	//   46  110:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//   47  111:new             #46  <Class InvalidProtocolBufferException>
	//   48  114:dup             
	//   49  115:aload_1         
	//   50  116:invokespecial   #91  <Method void InvalidProtocolBufferException(IOException)>
	//   51  119:aload_0         
	//   52  120:invokevirtual   #88  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   53  123:athrow          
		codedinputstream;
	//   54  124:astore_1        
		unknownFields = builder.build();
	//   55  125:aload_0         
	//   56  126:aload           5
	//   57  128:invokevirtual   #77  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   58  131:putfield        #81  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   59  134:aload_0         
	//   60  135:invokevirtual   #84  <Method void makeExtensionsImmutable()>
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


	private BoolValue(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #41  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}


	public static BoolValue getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #34  <Field BoolValue DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return WrappersProto.internal_static_google_protobuf_BoolValue_descriptor;
	//    0    0:getstatic       #116 <Field Descriptors$Descriptor WrappersProto.internal_static_google_protobuf_BoolValue_descriptor>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #34  <Field BoolValue DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #120 <Method BoolValue$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(BoolValue boolvalue)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(boolvalue);
	//    0    0:getstatic       #34  <Field BoolValue DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #120 <Method BoolValue$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #124 <Method BoolValue$Builder BoolValue$Builder.mergeFrom(BoolValue)>
	//    4   10:areturn         
	}

	public static BoolValue of(boolean flag)
	{
		return newBuilder().setValue(flag).build();
	//    0    0:invokestatic    #128 <Method BoolValue$Builder newBuilder()>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #132 <Method BoolValue$Builder BoolValue$Builder.setValue(boolean)>
	//    3    7:invokevirtual   #134 <Method BoolValue BoolValue$Builder.build()>
	//    4   10:areturn         
	}

	public static BoolValue parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (BoolValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #140 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class BoolValue>
	//    4   10:areturn         
	}

	public static BoolValue parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (BoolValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #144 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class BoolValue>
	//    5   11:areturn         
	}

	public static BoolValue parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (BoolValue)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #151 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class BoolValue>
	//    4   12:areturn         
	}

	public static BoolValue parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (BoolValue)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #155 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class BoolValue>
	//    5   13:areturn         
	}

	public static BoolValue parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (BoolValue)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #160 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class BoolValue>
	//    4   10:areturn         
	}

	public static BoolValue parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (BoolValue)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #164 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class BoolValue>
	//    5   11:areturn         
	}

	public static BoolValue parseFrom(InputStream inputstream)
		throws IOException
	{
		return (BoolValue)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #166 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class BoolValue>
	//    4   10:areturn         
	}

	public static BoolValue parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (BoolValue)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #168 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class BoolValue>
	//    5   11:areturn         
	}

	public static BoolValue parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (BoolValue)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #172 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class BoolValue>
	//    4   12:areturn         
	}

	public static BoolValue parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (BoolValue)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #176 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class BoolValue>
	//    5   13:areturn         
	}

	public static BoolValue parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (BoolValue)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #180 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class BoolValue>
	//    4   12:areturn         
	}

	public static BoolValue parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (BoolValue)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #184 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class BoolValue>
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
		if(!(obj instanceof BoolValue))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class BoolValue>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #190 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((BoolValue)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class BoolValue>
	//   14   24:astore_1        
		boolean flag;
		if(true && getValue() == ((BoolValue) (obj)).getValue())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #193 <Method boolean getValue()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #193 <Method boolean getValue()>
	//*  21   37:icmpne          45
			flag = true;
	//   22   40:iconst_1        
	//   23   41:istore_2        
		else
	//*  24   42:goto            47
			flag = false;
	//   25   45:iconst_0        
	//   26   46:istore_2        
		return flag && unknownFields.equals(((Object) (((BoolValue) (obj)).unknownFields)));
	//   27   47:iload_2         
	//   28   48:ifeq            67
	//   29   51:aload_0         
	//   30   52:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   31   55:aload_1         
	//   32   56:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   33   59:invokevirtual   #194 <Method boolean UnknownFieldSet.equals(Object)>
	//   34   62:ifeq            67
	//   35   65:iconst_1        
	//   36   66:ireturn         
	//   37   67:iconst_0        
	//   38   68:ireturn         
	}

	public BoolValue getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #34  <Field BoolValue DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method BoolValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method BoolValue getDefaultInstanceForType()>
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
	//    1    1:getfield        #204 <Field int memoizedSize>
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
		if(value_)
	//*  10   14:aload_0         
	//*  11   15:getfield        #43  <Field boolean value_>
	//*  12   18:ifeq            32
			i = CodedOutputStream.computeBoolSize(1, value_) + 0;
	//   13   21:iconst_1        
	//   14   22:aload_0         
	//   15   23:getfield        #43  <Field boolean value_>
	//   16   26:invokestatic    #210 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   17   29:iconst_0        
	//   18   30:iadd            
	//   19   31:istore_1        
		i += unknownFields.getSerializedSize();
	//   20   32:iload_1         
	//   21   33:aload_0         
	//   22   34:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   23   37:invokevirtual   #212 <Method int UnknownFieldSet.getSerializedSize()>
	//   24   40:iadd            
	//   25   41:istore_1        
		memoizedSize = i;
	//   26   42:aload_0         
	//   27   43:iload_1         
	//   28   44:putfield        #204 <Field int memoizedSize>
		return i;
	//   29   47:iload_1         
	//   30   48:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean getValue()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean value_>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
		{
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #217 <Field int memoizedHashCode>
	//    5   11:ireturn         
		} else
		{
			int i = (((((Object) (getDescriptor())).hashCode() + 779) * 37 + 1) * 53 + Internal.hashBoolean(getValue())) * 29 + unknownFields.hashCode();
	//    6   12:invokestatic    #219 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #223 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:bipush          37
	//   11   24:imul            
	//   12   25:iconst_1        
	//   13   26:iadd            
	//   14   27:bipush          53
	//   15   29:imul            
	//   16   30:aload_0         
	//   17   31:invokevirtual   #193 <Method boolean getValue()>
	//   18   34:invokestatic    #229 <Method int Internal.hashBoolean(boolean)>
	//   19   37:iadd            
	//   20   38:bipush          29
	//   21   40:imul            
	//   22   41:aload_0         
	//   23   42:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   24   45:invokevirtual   #230 <Method int UnknownFieldSet.hashCode()>
	//   25   48:iadd            
	//   26   49:istore_1        
			memoizedHashCode = i;
	//   27   50:aload_0         
	//   28   51:iload_1         
	//   29   52:putfield        #217 <Field int memoizedHashCode>
			return i;
	//   30   55:iload_1         
	//   31   56:ireturn         
		}
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return WrappersProto.internal_static_google_protobuf_BoolValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/BoolValue, com/google/protobuf/BoolValue$Builder);
	//    0    0:getstatic       #236 <Field GeneratedMessageV3$FieldAccessorTable WrappersProto.internal_static_google_protobuf_BoolValue_fieldAccessorTable>
	//    1    3:ldc1            #2   <Class BoolValue>
	//    2    5:ldc1            #10  <Class BoolValue$Builder>
	//    3    7:invokevirtual   #242 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
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
	//    0    0:invokestatic    #128 <Method BoolValue$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent);
	//    0    0:new             #10  <Class BoolValue$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #248 <Method void BoolValue$Builder(GeneratedMessageV3$BuilderParent, BoolValue$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #251 <Method BoolValue$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #254 <Method BoolValue$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #251 <Method BoolValue$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #34  <Field BoolValue DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder();
	//    3    7:new             #10  <Class BoolValue$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #258 <Method void BoolValue$Builder(BoolValue$1)>
	//    7   15:areturn         
		else
			return (new Builder()).mergeFrom(this);
	//    8   16:new             #10  <Class BoolValue$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #258 <Method void BoolValue$Builder(BoolValue$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #124 <Method BoolValue$Builder BoolValue$Builder.mergeFrom(BoolValue)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method BoolValue$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method BoolValue$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(value_)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean value_>
	//*   2    4:ifeq            16
			codedoutputstream.writeBool(1, value_);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field boolean value_>
	//    7   13:invokevirtual   #264 <Method void CodedOutputStream.writeBool(int, boolean)>
		unknownFields.writeTo(codedoutputstream);
	//    8   16:aload_0         
	//    9   17:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #266 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   12   24:return          
	}

	private static final BoolValue DEFAULT_INSTANCE = new BoolValue();
	private static final Parser PARSER = new AbstractParser() {

		public BoolValue parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new BoolValue(codedinputstream, extensionregistrylite);
		//    0    0:new             #7   <Class BoolValue>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #19  <Method void BoolValue(CodedInputStream, ExtensionRegistryLite, BoolValue$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method BoolValue parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int VALUE_FIELD_NUMBER = 1;
	private static final long serialVersionUID = 0L;
	private byte memoizedIsInitialized;
	private boolean value_;

	static 
	{
	//    0    0:new             #2   <Class BoolValue>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void BoolValue()>
	//    3    7:putstatic       #34  <Field BoolValue DEFAULT_INSTANCE>
	//    4   10:new             #8   <Class BoolValue$1>
	//    5   13:dup             
	//    6   14:invokespecial   #35  <Method void BoolValue$1()>
	//    7   17:putstatic       #37  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static boolean access$302(BoolValue boolvalue, boolean flag)
	{
		boolvalue.value_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean value_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
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
