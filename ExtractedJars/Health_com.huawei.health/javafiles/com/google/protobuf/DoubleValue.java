// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DoubleValueOrBuilder, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, WrappersProto, Parser, CodedOutputStream, 
//			Internal, ExtensionRegistryLite, ByteString, Message, 
//			MessageLite, AbstractParser

public final class DoubleValue extends GeneratedMessageV3
	implements DoubleValueOrBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DoubleValueOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #46  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DoubleValue$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #48  <Method DoubleValue$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
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
			DoubleValue doublevalue = new DoubleValue(((GeneratedMessageV3.Builder) (this)));
		//    0    0:new             #9   <Class DoubleValue>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #69  <Method void DoubleValue(GeneratedMessageV3$Builder, DoubleValue$1)>
		//    5    9:astore_1        
			doublevalue.value_ = value_;
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

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #83  <Method DoubleValue$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
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

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
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

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #83  <Method DoubleValue$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #93  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DoubleValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #95  <Method DoubleValue$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #95  <Method DoubleValue$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #101 <Method DoubleValue$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #104 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DoubleValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #101 <Method DoubleValue$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #101 <Method DoubleValue$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearValue()
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

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #112 <Method DoubleValue$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #112 <Method DoubleValue$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #115 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DoubleValue$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
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

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
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

		public Descriptors.Descriptor getDescriptorForType()
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

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
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

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #147 <Method DoubleValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #151 <Method DoubleValue$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #147 <Method DoubleValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
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
			codedinputstream = ((CodedInputStream) ((DoubleValue)DoubleValue.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
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

		public Builder mergeFrom(DoubleValue doublevalue)
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

		public Builder mergeFrom(Message message)
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

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #147 <Method DoubleValue$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #188 <Method DoubleValue$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #197 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DoubleValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #201 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DoubleValue$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #203 <Method DoubleValue$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #203 <Method DoubleValue$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #208 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DoubleValue$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #210 <Method DoubleValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #210 <Method DoubleValue$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFieldsProto3(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #215 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DoubleValue$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
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

		public Builder setValue(double d)
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


	private DoubleValue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #41  <Field byte memoizedIsInitialized>
		value_ = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #43  <Field double value_>
	//    8   14:return          
	}

	private DoubleValue(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void DoubleValue()>
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
	//	               9: 78;
	//   18   35:lookupswitch    2: default 140
	//	               0: 143
	//	               9: 78
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
		value_ = codedinputstream.readDouble();
	//   29   78:aload_0         
	//   30   79:aload_1         
	//   31   80:invokevirtual   #71  <Method double CodedInputStream.readDouble()>
	//   32   83:putfield        #43  <Field double value_>
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


	private DoubleValue(GeneratedMessageV3.Builder builder)
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


	public static DoubleValue getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #34  <Field DoubleValue DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return WrappersProto.internal_static_google_protobuf_DoubleValue_descriptor;
	//    0    0:getstatic       #116 <Field Descriptors$Descriptor WrappersProto.internal_static_google_protobuf_DoubleValue_descriptor>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #34  <Field DoubleValue DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #120 <Method DoubleValue$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DoubleValue doublevalue)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(doublevalue);
	//    0    0:getstatic       #34  <Field DoubleValue DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #120 <Method DoubleValue$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #124 <Method DoubleValue$Builder DoubleValue$Builder.mergeFrom(DoubleValue)>
	//    4   10:areturn         
	}

	public static DoubleValue of(double d)
	{
		return newBuilder().setValue(d).build();
	//    0    0:invokestatic    #128 <Method DoubleValue$Builder newBuilder()>
	//    1    3:dload_0         
	//    2    4:invokevirtual   #132 <Method DoubleValue$Builder DoubleValue$Builder.setValue(double)>
	//    3    7:invokevirtual   #134 <Method DoubleValue DoubleValue$Builder.build()>
	//    4   10:areturn         
	}

	public static DoubleValue parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DoubleValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #140 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DoubleValue>
	//    4   10:areturn         
	}

	public static DoubleValue parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DoubleValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #144 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DoubleValue>
	//    5   11:areturn         
	}

	public static DoubleValue parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DoubleValue)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #151 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DoubleValue>
	//    4   12:areturn         
	}

	public static DoubleValue parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DoubleValue)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #155 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DoubleValue>
	//    5   13:areturn         
	}

	public static DoubleValue parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DoubleValue)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #160 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DoubleValue>
	//    4   10:areturn         
	}

	public static DoubleValue parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DoubleValue)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #164 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DoubleValue>
	//    5   11:areturn         
	}

	public static DoubleValue parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DoubleValue)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #166 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DoubleValue>
	//    4   10:areturn         
	}

	public static DoubleValue parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DoubleValue)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #168 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DoubleValue>
	//    5   11:areturn         
	}

	public static DoubleValue parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DoubleValue)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #172 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DoubleValue>
	//    4   12:areturn         
	}

	public static DoubleValue parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DoubleValue)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #176 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DoubleValue>
	//    5   13:areturn         
	}

	public static DoubleValue parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DoubleValue)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #180 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DoubleValue>
	//    4   12:areturn         
	}

	public static DoubleValue parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DoubleValue)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #37  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #184 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DoubleValue>
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
		if(!(obj instanceof DoubleValue))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DoubleValue>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #190 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DoubleValue)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DoubleValue>
	//   14   24:astore_1        
		boolean flag;
		if(true && Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(((DoubleValue) (obj)).getValue()))
	//*  15   25:iconst_1        
	//*  16   26:ifeq            52
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #193 <Method double getValue()>
	//*  19   33:invokestatic    #199 <Method long Double.doubleToLongBits(double)>
	//*  20   36:aload_1         
	//*  21   37:invokevirtual   #193 <Method double getValue()>
	//*  22   40:invokestatic    #199 <Method long Double.doubleToLongBits(double)>
	//*  23   43:lcmp            
	//*  24   44:ifne            52
			flag = true;
	//   25   47:iconst_1        
	//   26   48:istore_2        
		else
	//*  27   49:goto            54
			flag = false;
	//   28   52:iconst_0        
	//   29   53:istore_2        
		return flag && unknownFields.equals(((Object) (((DoubleValue) (obj)).unknownFields)));
	//   30   54:iload_2         
	//   31   55:ifeq            74
	//   32   58:aload_0         
	//   33   59:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   34   62:aload_1         
	//   35   63:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   36   66:invokevirtual   #200 <Method boolean UnknownFieldSet.equals(Object)>
	//   37   69:ifeq            74
	//   38   72:iconst_1        
	//   39   73:ireturn         
	//   40   74:iconst_0        
	//   41   75:ireturn         
	}

	public DoubleValue getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #34  <Field DoubleValue DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method DoubleValue getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method DoubleValue getDefaultInstanceForType()>
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
	//    1    1:getfield        #210 <Field int memoizedSize>
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
		if(value_ != 0.0D)
	//*  10   14:aload_0         
	//*  11   15:getfield        #43  <Field double value_>
	//*  12   18:dconst_0        
	//*  13   19:dcmpl           
	//*  14   20:ifeq            34
			i = CodedOutputStream.computeDoubleSize(1, value_) + 0;
	//   15   23:iconst_1        
	//   16   24:aload_0         
	//   17   25:getfield        #43  <Field double value_>
	//   18   28:invokestatic    #216 <Method int CodedOutputStream.computeDoubleSize(int, double)>
	//   19   31:iconst_0        
	//   20   32:iadd            
	//   21   33:istore_1        
		i += unknownFields.getSerializedSize();
	//   22   34:iload_1         
	//   23   35:aload_0         
	//   24   36:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   25   39:invokevirtual   #218 <Method int UnknownFieldSet.getSerializedSize()>
	//   26   42:iadd            
	//   27   43:istore_1        
		memoizedSize = i;
	//   28   44:aload_0         
	//   29   45:iload_1         
	//   30   46:putfield        #210 <Field int memoizedSize>
		return i;
	//   31   49:iload_1         
	//   32   50:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public double getValue()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field double value_>
	//    2    4:dreturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
		{
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #223 <Field int memoizedHashCode>
	//    5   11:ireturn         
		} else
		{
			int i = (((((Object) (getDescriptor())).hashCode() + 779) * 37 + 1) * 53 + Internal.hashLong(Double.doubleToLongBits(getValue()))) * 29 + unknownFields.hashCode();
	//    6   12:invokestatic    #225 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #229 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:bipush          37
	//   11   24:imul            
	//   12   25:iconst_1        
	//   13   26:iadd            
	//   14   27:bipush          53
	//   15   29:imul            
	//   16   30:aload_0         
	//   17   31:invokevirtual   #193 <Method double getValue()>
	//   18   34:invokestatic    #199 <Method long Double.doubleToLongBits(double)>
	//   19   37:invokestatic    #235 <Method int Internal.hashLong(long)>
	//   20   40:iadd            
	//   21   41:bipush          29
	//   22   43:imul            
	//   23   44:aload_0         
	//   24   45:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   25   48:invokevirtual   #236 <Method int UnknownFieldSet.hashCode()>
	//   26   51:iadd            
	//   27   52:istore_1        
			memoizedHashCode = i;
	//   28   53:aload_0         
	//   29   54:iload_1         
	//   30   55:putfield        #223 <Field int memoizedHashCode>
			return i;
	//   31   58:iload_1         
	//   32   59:ireturn         
		}
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return WrappersProto.internal_static_google_protobuf_DoubleValue_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/DoubleValue, com/google/protobuf/DoubleValue$Builder);
	//    0    0:getstatic       #242 <Field GeneratedMessageV3$FieldAccessorTable WrappersProto.internal_static_google_protobuf_DoubleValue_fieldAccessorTable>
	//    1    3:ldc1            #2   <Class DoubleValue>
	//    2    5:ldc1            #10  <Class DoubleValue$Builder>
	//    3    7:invokevirtual   #248 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
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
	//    0    0:invokestatic    #128 <Method DoubleValue$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent);
	//    0    0:new             #10  <Class DoubleValue$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #255 <Method void DoubleValue$Builder(GeneratedMessageV3$BuilderParent, DoubleValue$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #258 <Method DoubleValue$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #261 <Method DoubleValue$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #258 <Method DoubleValue$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #34  <Field DoubleValue DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder();
	//    3    7:new             #10  <Class DoubleValue$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #265 <Method void DoubleValue$Builder(DoubleValue$1)>
	//    7   15:areturn         
		else
			return (new Builder()).mergeFrom(this);
	//    8   16:new             #10  <Class DoubleValue$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #265 <Method void DoubleValue$Builder(DoubleValue$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #124 <Method DoubleValue$Builder DoubleValue$Builder.mergeFrom(DoubleValue)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method DoubleValue$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method DoubleValue$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(value_ != 0.0D)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field double value_>
	//*   2    4:dconst_0        
	//*   3    5:dcmpl           
	//*   4    6:ifeq            18
			codedoutputstream.writeDouble(1, value_);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_0         
	//    8   12:getfield        #43  <Field double value_>
	//    9   15:invokevirtual   #271 <Method void CodedOutputStream.writeDouble(int, double)>
		unknownFields.writeTo(codedoutputstream);
	//   10   18:aload_0         
	//   11   19:getfield        #81  <Field UnknownFieldSet unknownFields>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #273 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   14   26:return          
	}

	private static final DoubleValue DEFAULT_INSTANCE = new DoubleValue();
	private static final Parser PARSER = new AbstractParser() {

		public DoubleValue parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DoubleValue(codedinputstream, extensionregistrylite);
		//    0    0:new             #7   <Class DoubleValue>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #19  <Method void DoubleValue(CodedInputStream, ExtensionRegistryLite, DoubleValue$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method DoubleValue parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int VALUE_FIELD_NUMBER = 1;
	private static final long serialVersionUID = 0L;
	private byte memoizedIsInitialized;
	private double value_;

	static 
	{
	//    0    0:new             #2   <Class DoubleValue>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void DoubleValue()>
	//    3    7:putstatic       #34  <Field DoubleValue DEFAULT_INSTANCE>
	//    4   10:new             #8   <Class DoubleValue$1>
	//    5   13:dup             
	//    6   14:invokespecial   #35  <Method void DoubleValue$1()>
	//    7   17:putstatic       #37  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static double access$302(DoubleValue doublevalue, double d)
	{
		doublevalue.value_ = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #43  <Field double value_>
		return d;
	//    3    5:dload_1         
	//    4    6:dreturn         
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
