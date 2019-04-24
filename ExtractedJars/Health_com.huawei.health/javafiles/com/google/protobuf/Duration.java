// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DurationOrBuilder, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, DurationProto, Parser, CodedOutputStream, 
//			Internal, ExtensionRegistryLite, ByteString, Message, 
//			MessageLite, AbstractParser

public final class Duration extends GeneratedMessageV3
	implements DurationOrBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DurationOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DurationProto.internal_static_google_protobuf_Duration_descriptor;
		//    0    0:getstatic       #37  <Field Descriptors$Descriptor DurationProto.internal_static_google_protobuf_Duration_descriptor>
		//    1    3:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
		//    0    0:getstatic       #43  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//    1    3:istore_1        
		//    2    4:return          
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #48  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class Duration$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #50  <Method Duration$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #50  <Method Duration$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Duration build()
		{
			Duration duration = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #56  <Method Duration buildPartial()>
		//    2    4:astore_1        
			if(!duration.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #60  <Method boolean Duration.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (duration)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #64  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return duration;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #67  <Method Duration build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #67  <Method Duration build()>
		//    2    4:areturn         
		}

		public Duration buildPartial()
		{
			Duration duration = new Duration(((GeneratedMessageV3.Builder) (this)));
		//    0    0:new             #9   <Class Duration>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #71  <Method void Duration(GeneratedMessageV3$Builder, Duration$1)>
		//    5    9:astore_1        
			duration.seconds_ = seconds_;
		//    6   10:aload_1         
		//    7   11:aload_0         
		//    8   12:getfield        #73  <Field long seconds_>
		//    9   15:invokestatic    #77  <Method long Duration.access$302(Duration, long)>
		//   10   18:pop2            
			duration.nanos_ = nanos_;
		//   11   19:aload_1         
		//   12   20:aload_0         
		//   13   21:getfield        #79  <Field int nanos_>
		//   14   24:invokestatic    #83  <Method int Duration.access$402(Duration, int)>
		//   15   27:pop             
			onBuilt();
		//   16   28:aload_0         
		//   17   29:invokevirtual   #86  <Method void onBuilt()>
			return duration;
		//   18   32:aload_1         
		//   19   33:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #56  <Method Duration buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #56  <Method Duration buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method Duration$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #94  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			seconds_ = 0L;
		//    3    5:aload_0         
		//    4    6:lconst_0        
		//    5    7:putfield        #73  <Field long seconds_>
			nanos_ = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #79  <Field int nanos_>
			return this;
		//    9   15:aload_0         
		//   10   16:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method Duration$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method Duration$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method Duration$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #101 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class Duration$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #103 <Method Duration$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #103 <Method Duration$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearNanos()
		{
			nanos_ = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #79  <Field int nanos_>
			onChanged();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #108 <Method void onChanged()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #113 <Method Duration$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #116 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class Duration$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #113 <Method Duration$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #113 <Method Duration$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearSeconds()
		{
			seconds_ = 0L;
		//    0    0:aload_0         
		//    1    1:lconst_0        
		//    2    2:putfield        #73  <Field long seconds_>
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
		//    1    1:invokevirtual   #121 <Method Duration$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #121 <Method Duration$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #124 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class Duration$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #121 <Method Duration$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #121 <Method Duration$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #121 <Method Duration$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #121 <Method Duration$Builder clone()>
		//    2    4:areturn         
		}

		public Duration getDefaultInstanceForType()
		{
			return Duration.getDefaultInstance();
		//    0    0:invokestatic    #132 <Method Duration Duration.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #134 <Method Duration getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #134 <Method Duration getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DurationProto.internal_static_google_protobuf_Duration_descriptor;
		//    0    0:getstatic       #37  <Field Descriptors$Descriptor DurationProto.internal_static_google_protobuf_Duration_descriptor>
		//    1    3:areturn         
		}

		public int getNanos()
		{
			return nanos_;
		//    0    0:aload_0         
		//    1    1:getfield        #79  <Field int nanos_>
		//    2    4:ireturn         
		}

		public long getSeconds()
		{
			return seconds_;
		//    0    0:aload_0         
		//    1    1:getfield        #73  <Field long seconds_>
		//    2    4:lreturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Duration, com/google/protobuf/Duration$Builder);
		//    0    0:getstatic       #145 <Field GeneratedMessageV3$FieldAccessorTable DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable>
		//    1    3:ldc1            #9   <Class Duration>
		//    2    5:ldc1            #2   <Class Duration$Builder>
		//    3    7:invokevirtual   #151 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
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
		//    3    3:invokevirtual   #158 <Method Duration$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #162 <Method Duration$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #158 <Method Duration$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((Duration)Duration.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:invokestatic    #169 <Method Parser Duration.access$500()>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #175 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class Duration>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((Duration) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #178 <Method Duration$Builder mergeFrom(Duration)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #181 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class Duration>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #185 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #178 <Method Duration$Builder mergeFrom(Duration)>
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
			codedinputstream = ((CodedInputStream) ((Duration)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((Duration) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(Duration duration)
		{
			if(duration == Duration.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #132 <Method Duration Duration.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(duration.getSeconds() != 0L)
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #187 <Method long Duration.getSeconds()>
		//*   7   13:lconst_0        
		//*   8   14:lcmp            
		//*   9   15:ifeq            27
				setSeconds(duration.getSeconds());
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:invokevirtual   #187 <Method long Duration.getSeconds()>
		//   13   23:invokevirtual   #191 <Method Duration$Builder setSeconds(long)>
		//   14   26:pop             
			if(duration.getNanos() != 0)
		//*  15   27:aload_1         
		//*  16   28:invokevirtual   #193 <Method int Duration.getNanos()>
		//*  17   31:ifeq            43
				setNanos(duration.getNanos());
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #193 <Method int Duration.getNanos()>
		//   21   39:invokevirtual   #197 <Method Duration$Builder setNanos(int)>
		//   22   42:pop             
			mergeUnknownFields(duration.unknownFields);
		//   23   43:aload_0         
		//   24   44:aload_1         
		//   25   45:getfield        #201 <Field UnknownFieldSet Duration.unknownFields>
		//   26   48:invokevirtual   #205 <Method Duration$Builder mergeUnknownFields(UnknownFieldSet)>
		//   27   51:pop             
			onChanged();
		//   28   52:aload_0         
		//   29   53:invokevirtual   #108 <Method void onChanged()>
			return this;
		//   30   56:aload_0         
		//   31   57:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof Duration)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class Duration>
		//*   2    4:ifeq            16
			{
				return mergeFrom((Duration)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class Duration>
		//    6   12:invokevirtual   #178 <Method Duration$Builder mergeFrom(Duration)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #207 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #158 <Method Duration$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #162 <Method Duration$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #158 <Method Duration$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #205 <Method Duration$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #214 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class Duration$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #205 <Method Duration$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #205 <Method Duration$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #218 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class Duration$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #220 <Method Duration$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #220 <Method Duration$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setNanos(int i)
		{
			nanos_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #79  <Field int nanos_>
			onChanged();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #108 <Method void onChanged()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #225 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class Duration$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #227 <Method Duration$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #227 <Method Duration$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setSeconds(long l)
		{
			seconds_ = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #73  <Field long seconds_>
			onChanged();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #108 <Method void onChanged()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFieldsProto3(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #232 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class Duration$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #234 <Method Duration$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #234 <Method Duration$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int nanos_;
		private long seconds_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void GeneratedMessageV3$Builder()>
			maybeForceBuilderInitialization();
		//    2    4:aload_0         
		//    3    5:invokespecial   #21  <Method void maybeForceBuilderInitialization()>
		//    4    8:return          
		}


		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #27  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			maybeForceBuilderInitialization();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void maybeForceBuilderInitialization()>
		//    5    9:return          
		}

	}


	private Duration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #43  <Field byte memoizedIsInitialized>
		seconds_ = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #45  <Field long seconds_>
		nanos_ = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #47  <Field int nanos_>
	//   11   19:return          
	}

	private Duration(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Duration()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #54  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #55  <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #61  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
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
	//   15   28:invokevirtual   #67  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 3: default 159
	//	               0: 162
	//	               8: 86
	//	               16: 97;
	//   18   35:lookupswitch    3: default 159
	//	               0: 162
	//	               8: 86
	//	               16: 97
		   goto _L3 _L4 _L5 _L6
_L3:
		if(!parseUnknownFieldProto3(codedinputstream, builder, extensionregistrylite, i))
	//*  19   68:aload_0         
	//*  20   69:aload_1         
	//*  21   70:aload           5
	//*  22   72:aload_2         
	//*  23   73:iload           4
	//*  24   75:invokevirtual   #71  <Method boolean parseUnknownFieldProto3(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25   78:ifne            105
			flag = true;
	//   26   81:iconst_1        
	//   27   82:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28   83:goto            105
_L5:
		seconds_ = codedinputstream.readInt64();
	//   29   86:aload_0         
	//   30   87:aload_1         
	//   31   88:invokevirtual   #75  <Method long CodedInputStream.readInt64()>
	//   32   91:putfield        #45  <Field long seconds_>
		continue; /* Loop/switch isn't completed */
	//   33   94:goto            105
_L6:
		nanos_ = codedinputstream.readInt32();
	//   34   97:aload_0         
	//   35   98:aload_1         
	//   36   99:invokevirtual   #78  <Method int CodedInputStream.readInt32()>
	//   37  102:putfield        #47  <Field int nanos_>
		continue; /* Loop/switch isn't completed */
	//   38  105:goto            23
_L2:
		unknownFields = builder.build();
	//   39  108:aload_0         
	//   40  109:aload           5
	//   41  111:invokevirtual   #84  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   42  114:putfield        #88  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   43  117:aload_0         
	//   44  118:invokevirtual   #91  <Method void makeExtensionsImmutable()>
		return;
	//   45  121:return          
		codedinputstream;
	//   46  122:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   47  123:aload_1         
	//   48  124:aload_0         
	//   49  125:invokevirtual   #95  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   50  128:athrow          
		codedinputstream;
	//   51  129:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//   52  130:new             #50  <Class InvalidProtocolBufferException>
	//   53  133:dup             
	//   54  134:aload_1         
	//   55  135:invokespecial   #98  <Method void InvalidProtocolBufferException(IOException)>
	//   56  138:aload_0         
	//   57  139:invokevirtual   #95  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   58  142:athrow          
		codedinputstream;
	//   59  143:astore_1        
		unknownFields = builder.build();
	//   60  144:aload_0         
	//   61  145:aload           5
	//   62  147:invokevirtual   #84  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   63  150:putfield        #88  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   64  153:aload_0         
	//   65  154:invokevirtual   #91  <Method void makeExtensionsImmutable()>
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


	private Duration(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #105 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #43  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}


	public static Duration getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #36  <Field Duration DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DurationProto.internal_static_google_protobuf_Duration_descriptor;
	//    0    0:getstatic       #125 <Field Descriptors$Descriptor DurationProto.internal_static_google_protobuf_Duration_descriptor>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #36  <Field Duration DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #129 <Method Duration$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(Duration duration)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(duration);
	//    0    0:getstatic       #36  <Field Duration DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #129 <Method Duration$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #133 <Method Duration$Builder Duration$Builder.mergeFrom(Duration)>
	//    4   10:areturn         
	}

	public static Duration parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (Duration)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #139 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Duration>
	//    4   10:areturn         
	}

	public static Duration parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Duration)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #143 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Duration>
	//    5   11:areturn         
	}

	public static Duration parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (Duration)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #150 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class Duration>
	//    4   12:areturn         
	}

	public static Duration parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Duration)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #154 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Duration>
	//    5   13:areturn         
	}

	public static Duration parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (Duration)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #159 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class Duration>
	//    4   10:areturn         
	}

	public static Duration parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Duration)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #163 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Duration>
	//    5   11:areturn         
	}

	public static Duration parseFrom(InputStream inputstream)
		throws IOException
	{
		return (Duration)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #165 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Duration>
	//    4   10:areturn         
	}

	public static Duration parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Duration)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #167 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Duration>
	//    5   11:areturn         
	}

	public static Duration parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (Duration)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #171 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class Duration>
	//    4   12:areturn         
	}

	public static Duration parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Duration)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #175 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Duration>
	//    5   13:areturn         
	}

	public static Duration parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (Duration)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #179 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class Duration>
	//    4   12:areturn         
	}

	public static Duration parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Duration)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #183 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Duration>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #39  <Field Parser PARSER>
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
		if(!(obj instanceof Duration))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Duration>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #189 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((Duration)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Duration>
	//   14   24:astore_1        
		boolean flag;
		if(true && getSeconds() == ((Duration) (obj)).getSeconds())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            46
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #192 <Method long getSeconds()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #192 <Method long getSeconds()>
	//*  21   37:lcmp            
	//*  22   38:ifne            46
			flag = true;
	//   23   41:iconst_1        
	//   24   42:istore_2        
		else
	//*  25   43:goto            48
			flag = false;
	//   26   46:iconst_0        
	//   27   47:istore_2        
		if(flag && getNanos() == ((Duration) (obj)).getNanos())
	//*  28   48:iload_2         
	//*  29   49:ifeq            68
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #195 <Method int getNanos()>
	//*  32   56:aload_1         
	//*  33   57:invokevirtual   #195 <Method int getNanos()>
	//*  34   60:icmpne          68
			flag = true;
	//   35   63:iconst_1        
	//   36   64:istore_2        
		else
	//*  37   65:goto            70
			flag = false;
	//   38   68:iconst_0        
	//   39   69:istore_2        
		return flag && unknownFields.equals(((Object) (((Duration) (obj)).unknownFields)));
	//   40   70:iload_2         
	//   41   71:ifeq            90
	//   42   74:aload_0         
	//   43   75:getfield        #88  <Field UnknownFieldSet unknownFields>
	//   44   78:aload_1         
	//   45   79:getfield        #88  <Field UnknownFieldSet unknownFields>
	//   46   82:invokevirtual   #196 <Method boolean UnknownFieldSet.equals(Object)>
	//   47   85:ifeq            90
	//   48   88:iconst_1        
	//   49   89:ireturn         
	//   50   90:iconst_0        
	//   51   91:ireturn         
	}

	public Duration getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #36  <Field Duration DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method Duration getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method Duration getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public int getNanos()
	{
		return nanos_;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int nanos_>
	//    2    4:ireturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public long getSeconds()
	{
		return seconds_;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field long seconds_>
	//    2    4:lreturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field int memoizedSize>
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
		if(seconds_ != 0L)
	//*  10   14:aload_0         
	//*  11   15:getfield        #45  <Field long seconds_>
	//*  12   18:lconst_0        
	//*  13   19:lcmp            
	//*  14   20:ifeq            34
			i = CodedOutputStream.computeInt64Size(1, seconds_) + 0;
	//   15   23:iconst_1        
	//   16   24:aload_0         
	//   17   25:getfield        #45  <Field long seconds_>
	//   18   28:invokestatic    #212 <Method int CodedOutputStream.computeInt64Size(int, long)>
	//   19   31:iconst_0        
	//   20   32:iadd            
	//   21   33:istore_1        
		int j = i;
	//   22   34:iload_1         
	//   23   35:istore_2        
		if(nanos_ != 0)
	//*  24   36:aload_0         
	//*  25   37:getfield        #47  <Field int nanos_>
	//*  26   40:ifeq            54
			j = i + CodedOutputStream.computeInt32Size(2, nanos_);
	//   27   43:iload_1         
	//   28   44:iconst_2        
	//   29   45:aload_0         
	//   30   46:getfield        #47  <Field int nanos_>
	//   31   49:invokestatic    #216 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//   32   52:iadd            
	//   33   53:istore_2        
		i = j + unknownFields.getSerializedSize();
	//   34   54:iload_2         
	//   35   55:aload_0         
	//   36   56:getfield        #88  <Field UnknownFieldSet unknownFields>
	//   37   59:invokevirtual   #218 <Method int UnknownFieldSet.getSerializedSize()>
	//   38   62:iadd            
	//   39   63:istore_1        
		memoizedSize = i;
	//   40   64:aload_0         
	//   41   65:iload_1         
	//   42   66:putfield        #206 <Field int memoizedSize>
		return i;
	//   43   69:iload_1         
	//   44   70:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
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
			int i = (((((((Object) (getDescriptor())).hashCode() + 779) * 37 + 1) * 53 + Internal.hashLong(getSeconds())) * 37 + 2) * 53 + getNanos()) * 29 + unknownFields.hashCode();
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
	//   17   31:invokevirtual   #192 <Method long getSeconds()>
	//   18   34:invokestatic    #235 <Method int Internal.hashLong(long)>
	//   19   37:iadd            
	//   20   38:bipush          37
	//   21   40:imul            
	//   22   41:iconst_2        
	//   23   42:iadd            
	//   24   43:bipush          53
	//   25   45:imul            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #195 <Method int getNanos()>
	//   28   50:iadd            
	//   29   51:bipush          29
	//   30   53:imul            
	//   31   54:aload_0         
	//   32   55:getfield        #88  <Field UnknownFieldSet unknownFields>
	//   33   58:invokevirtual   #236 <Method int UnknownFieldSet.hashCode()>
	//   34   61:iadd            
	//   35   62:istore_1        
			memoizedHashCode = i;
	//   36   63:aload_0         
	//   37   64:iload_1         
	//   38   65:putfield        #223 <Field int memoizedHashCode>
			return i;
	//   39   68:iload_1         
	//   40   69:ireturn         
		}
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Duration, com/google/protobuf/Duration$Builder);
	//    0    0:getstatic       #242 <Field GeneratedMessageV3$FieldAccessorTable DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable>
	//    1    3:ldc1            #2   <Class Duration>
	//    2    5:ldc1            #10  <Class Duration$Builder>
	//    3    7:invokevirtual   #248 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte memoizedIsInitialized>
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
	//   14   20:putfield        #43  <Field byte memoizedIsInitialized>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #253 <Method Duration$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent);
	//    0    0:new             #10  <Class Duration$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #257 <Method void Duration$Builder(GeneratedMessageV3$BuilderParent, Duration$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #260 <Method Duration$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #263 <Method Duration$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #260 <Method Duration$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #36  <Field Duration DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder();
	//    3    7:new             #10  <Class Duration$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #267 <Method void Duration$Builder(Duration$1)>
	//    7   15:areturn         
		else
			return (new Builder()).mergeFrom(this);
	//    8   16:new             #10  <Class Duration$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #267 <Method void Duration$Builder(Duration$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #133 <Method Duration$Builder Duration$Builder.mergeFrom(Duration)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method Duration$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method Duration$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(seconds_ != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field long seconds_>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            18
			codedoutputstream.writeInt64(1, seconds_);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_0         
	//    8   12:getfield        #45  <Field long seconds_>
	//    9   15:invokevirtual   #273 <Method void CodedOutputStream.writeInt64(int, long)>
		if(nanos_ != 0)
	//*  10   18:aload_0         
	//*  11   19:getfield        #47  <Field int nanos_>
	//*  12   22:ifeq            34
			codedoutputstream.writeInt32(2, nanos_);
	//   13   25:aload_1         
	//   14   26:iconst_2        
	//   15   27:aload_0         
	//   16   28:getfield        #47  <Field int nanos_>
	//   17   31:invokevirtual   #277 <Method void CodedOutputStream.writeInt32(int, int)>
		unknownFields.writeTo(codedoutputstream);
	//   18   34:aload_0         
	//   19   35:getfield        #88  <Field UnknownFieldSet unknownFields>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #279 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   22   42:return          
	}

	private static final Duration DEFAULT_INSTANCE = new Duration();
	public static final int NANOS_FIELD_NUMBER = 2;
	private static final Parser PARSER = new AbstractParser() {

		public Duration parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new Duration(codedinputstream, extensionregistrylite);
		//    0    0:new             #7   <Class Duration>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #19  <Method void Duration(CodedInputStream, ExtensionRegistryLite, Duration$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method Duration parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int SECONDS_FIELD_NUMBER = 1;
	private static final long serialVersionUID = 0L;
	private byte memoizedIsInitialized;
	private int nanos_;
	private long seconds_;

	static 
	{
	//    0    0:new             #2   <Class Duration>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void Duration()>
	//    3    7:putstatic       #36  <Field Duration DEFAULT_INSTANCE>
	//    4   10:new             #8   <Class Duration$1>
	//    5   13:dup             
	//    6   14:invokespecial   #37  <Method void Duration$1()>
	//    7   17:putstatic       #39  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static long access$302(Duration duration, long l)
	{
		duration.seconds_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #45  <Field long seconds_>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/


/*
	static int access$402(Duration duration, int i)
	{
		duration.nanos_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int nanos_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Parser access$500()
	{
		return PARSER;
	//    0    0:getstatic       #39  <Field Parser PARSER>
	//    1    3:areturn         
	}

*/
}
