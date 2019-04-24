// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			DurationOrBuilder, Duration, DurationProto, GeneratedMessageV3, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class Duration$Builder extends Builder
	implements DurationOrBuilder
{

	public static final iptor getDescriptor()
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

	public Duration$Builder addRepeatedField(Descriptor descriptor, Object obj)
	{
		return (Duration$Builder)super.addRepeatedField(descriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #48  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class Duration$Builder>
	//    5    9:areturn         
	}

	public volatile Builder addRepeatedField(Descriptor descriptor, Object obj)
	{
		return ((Builder) (addRepeatedField(descriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #50  <Method Duration$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptor descriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(descriptor, obj)));
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
		Duration duration = new Duration(((Builder) (this)), ((Duration._cls1) (null)));
	//    0    0:new             #9   <Class Duration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #71  <Method void Duration(GeneratedMessageV3$Builder, Duration$1)>
	//    5    9:astore_1        
		Duration.access$302(duration, seconds_);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #73  <Field long seconds_>
	//    9   15:invokestatic    #77  <Method long Duration.access$302(Duration, long)>
	//   10   18:pop2            
		Duration.access$402(duration, nanos_);
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

	public volatile uilder clear()
	{
		return ((uilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method Duration$Builder clear()>
	//    2    4:areturn         
	}

	public Duration$Builder clear()
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

	public volatile Builder clear()
	{
		return ((Builder) (clear()));
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

	public volatile er clear()
	{
		return ((er) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method Duration$Builder clear()>
	//    2    4:areturn         
	}

	public Duration$Builder clearField(Descriptor descriptor)
	{
		return (Duration$Builder)super.clearField(descriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class Duration$Builder>
	//    4    8:areturn         
	}

	public volatile Builder clearField(Descriptor descriptor)
	{
		return ((Builder) (clearField(descriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method Duration$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptor descriptor)
	{
		return ((Message.Builder) (clearField(descriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method Duration$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public Duration$Builder clearNanos()
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

	public volatile uilder clearOneof(Descriptor descriptor)
	{
		return ((uilder) (clearOneof(descriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method Duration$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public Duration$Builder clearOneof(Descriptor descriptor)
	{
		return (Duration$Builder)super.clearOneof(descriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #116 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class Duration$Builder>
	//    4    8:areturn         
	}

	public volatile Builder clearOneof(Descriptor descriptor)
	{
		return ((Builder) (clearOneof(descriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method Duration$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptor descriptor)
	{
		return ((Message.Builder) (clearOneof(descriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method Duration$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public Duration$Builder clearSeconds()
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

	public volatile uilder clone()
	{
		return ((uilder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method Duration$Builder clone()>
	//    2    4:areturn         
	}

	public volatile te.Builder clone()
	{
		return ((te.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method Duration$Builder clone()>
	//    2    4:areturn         
	}

	public Duration$Builder clone()
	{
		return (Duration$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class Duration$Builder>
	//    3    7:areturn         
	}

	public volatile Builder clone()
	{
		return ((Builder) (clone()));
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

	public volatile er clone()
	{
		return ((er) (clone()));
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

	public iptor getDescriptorForType()
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

	protected FieldAccessorTable internalGetFieldAccessorTable()
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

	public volatile uilder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((uilder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #158 <Method Duration$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile uilder mergeFrom(Message message)
	{
		return ((uilder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #162 <Method Duration$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile te.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((te.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #158 <Method Duration$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public Duration$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((Duration)Duration.access$500().parsePartialFrom(codedinputstream, extensionregistrylite)));
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

	public Duration$Builder mergeFrom(Duration duration)
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

	public Duration$Builder mergeFrom(Message message)
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

	public volatile er mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((er) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #158 <Method Duration$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile uilder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((uilder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #205 <Method Duration$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final Duration$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (Duration$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #214 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class Duration$Builder>
	//    4    8:areturn         
	}

	public volatile Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Builder) (mergeUnknownFields(unknownfieldset)));
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

	public Duration$Builder setField(Descriptor descriptor, Object obj)
	{
		return (Duration$Builder)super.setField(descriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #218 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class Duration$Builder>
	//    5    9:areturn         
	}

	public volatile Builder setField(Descriptor descriptor, Object obj)
	{
		return ((Builder) (setField(descriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #220 <Method Duration$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptor descriptor, Object obj)
	{
		return ((Message.Builder) (setField(descriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #220 <Method Duration$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public Duration$Builder setNanos(int i)
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

	public Duration$Builder setRepeatedField(Descriptor descriptor, int i, Object obj)
	{
		return (Duration$Builder)super.setRepeatedField(descriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #225 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class Duration$Builder>
	//    6   10:areturn         
	}

	public volatile Builder setRepeatedField(Descriptor descriptor, int i, Object obj)
	{
		return ((Builder) (setRepeatedField(descriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #227 <Method Duration$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptor descriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(descriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #227 <Method Duration$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public Duration$Builder setSeconds(long l)
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

	public final Duration$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (Duration$Builder)super.setUnknownFieldsProto3(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #232 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class Duration$Builder>
	//    4    8:areturn         
	}

	public volatile Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Builder) (setUnknownFields(unknownfieldset)));
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

	private Duration$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void GeneratedMessageV3$Builder()>
		maybeForceBuilderInitialization();
	//    2    4:aload_0         
	//    3    5:invokespecial   #21  <Method void maybeForceBuilderInitialization()>
	//    4    8:return          
	}

	Duration$Builder(Duration._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Duration$Builder()>
	//    2    4:return          
	}

	private Duration$Builder(BuilderParent builderparent)
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

	Duration$Builder(BuilderParent builderparent, Duration._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void Duration$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
