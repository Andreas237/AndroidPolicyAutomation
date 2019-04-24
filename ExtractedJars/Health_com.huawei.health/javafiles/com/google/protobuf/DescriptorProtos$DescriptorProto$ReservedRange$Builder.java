// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, GeneratedMessageV3, InvalidProtocolBufferException, Parser, 
//			Message, MessageLite, CodedInputStream, ExtensionRegistryLite, 
//			UnknownFieldSet

public static final class DescriptorProtos$DescriptorProto$ReservedRange$Builder extends GeneratedMessageV3.Builder
	implements 
{

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$3800();
	//    0    0:invokestatic    #40  <Method Descriptors$Descriptor DescriptorProtos.access$3800()>
	//    1    3:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
	//    0    0:getstatic       #46  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//    1    3:istore_1        
	//    2    4:return          
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #51  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #53  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #53  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos.DescriptorProto.ReservedRange build()
	{
		DescriptorProtos.DescriptorProto.ReservedRange reservedrange = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method DescriptorProtos$DescriptorProto$ReservedRange buildPartial()>
	//    2    4:astore_1        
		if(!reservedrange.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #63  <Method boolean DescriptorProtos$DescriptorProto$ReservedRange.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (reservedrange)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #67  <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return reservedrange;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method DescriptorProtos$DescriptorProto$ReservedRange build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method DescriptorProtos$DescriptorProto$ReservedRange build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.DescriptorProto.ReservedRange buildPartial()
	{
		DescriptorProtos.DescriptorProto.ReservedRange reservedrange = new DescriptorProtos.DescriptorProto.ReservedRange(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #74  <Method void DescriptorProtos$DescriptorProto$ReservedRange(GeneratedMessageV3$Builder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #76  <Field int bitField0_>
	//    8   15:istore_3        
		int i = 0;
	//    9   16:iconst_0        
	//   10   17:istore_1        
		if((k & 1) == 1)
	//*  11   18:iload_3         
	//*  12   19:iconst_1        
	//*  13   20:iand            
	//*  14   21:iconst_1        
	//*  15   22:icmpne          27
			i = 1;
	//   16   25:iconst_1        
	//   17   26:istore_1        
		DescriptorProtos.DescriptorProto.ReservedRange.access$4302(reservedrange, start_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #78  <Field int start_>
	//   21   33:invokestatic    #82  <Method int DescriptorProtos$DescriptorProto$ReservedRange.access$4302(DescriptorProtos$DescriptorProto$ReservedRange, int)>
	//   22   36:pop             
		int j = i;
	//   23   37:iload_1         
	//   24   38:istore_2        
		if((k & 2) == 2)
	//*  25   39:iload_3         
	//*  26   40:iconst_2        
	//*  27   41:iand            
	//*  28   42:iconst_2        
	//*  29   43:icmpne          50
			j = i | 2;
	//   30   46:iload_1         
	//   31   47:iconst_2        
	//   32   48:ior             
	//   33   49:istore_2        
		DescriptorProtos.DescriptorProto.ReservedRange.access$4402(reservedrange, end_);
	//   34   50:aload           4
	//   35   52:aload_0         
	//   36   53:getfield        #84  <Field int end_>
	//   37   56:invokestatic    #87  <Method int DescriptorProtos$DescriptorProto$ReservedRange.access$4402(DescriptorProtos$DescriptorProto$ReservedRange, int)>
	//   38   59:pop             
		DescriptorProtos.DescriptorProto.ReservedRange.access$4502(reservedrange, j);
	//   39   60:aload           4
	//   40   62:iload_2         
	//   41   63:invokestatic    #90  <Method int DescriptorProtos$DescriptorProto$ReservedRange.access$4502(DescriptorProtos$DescriptorProto$ReservedRange, int)>
	//   42   66:pop             
		onBuilt();
	//   43   67:aload_0         
	//   44   68:invokevirtual   #93  <Method void onBuilt()>
		return reservedrange;
	//   45   71:aload           4
	//   46   73:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method DescriptorProtos$DescriptorProto$ReservedRange buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method DescriptorProtos$DescriptorProto$ReservedRange buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		start_ = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #78  <Field int start_>
		bitField0_ = bitField0_ & -2;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #76  <Field int bitField0_>
	//    9   15:bipush          -2
	//   10   17:iand            
	//   11   18:putfield        #76  <Field int bitField0_>
		end_ = 0;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #84  <Field int end_>
		bitField0_ = bitField0_ & -3;
	//   15   26:aload_0         
	//   16   27:aload_0         
	//   17   28:getfield        #76  <Field int bitField0_>
	//   18   31:bipush          -3
	//   19   33:iand            
	//   20   34:putfield        #76  <Field int bitField0_>
		return this;
	//   21   37:aload_0         
	//   22   38:areturn         
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder clearEnd()
	{
		bitField0_ = bitField0_ & -3;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #76  <Field int bitField0_>
	//    3    5:bipush          -3
	//    4    7:iand            
	//    5    8:putfield        #76  <Field int bitField0_>
		end_ = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #84  <Field int end_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #112 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #120 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #120 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #120 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder clearStart()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #76  <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #76  <Field int bitField0_>
		start_ = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #78  <Field int start_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()
	{
		return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.DescriptorProto.ReservedRange getDefaultInstanceForType()
	{
		return DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance();
	//    0    0:invokestatic    #139 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method DescriptorProtos$DescriptorProto$ReservedRange getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method DescriptorProtos$DescriptorProto$ReservedRange getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$3800();
	//    0    0:invokestatic    #40  <Method Descriptors$Descriptor DescriptorProtos.access$3800()>
	//    1    3:areturn         
	}

	public int getEnd()
	{
		return end_;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int end_>
	//    2    4:ireturn         
	}

	public int getStart()
	{
		return start_;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int start_>
	//    2    4:ireturn         
	}

	public boolean hasEnd()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasStart()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$3900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange, com/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange$Builder);
	//    0    0:invokestatic    #152 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$3900()>
	//    1    3:ldc1            #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//    2    5:ldc1            #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    3    7:invokevirtual   #158 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
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
	//    3    3:invokevirtual   #165 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #169 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #165 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.DescriptorProto.ReservedRange)DescriptorProtos.DescriptorProto.ReservedRange.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #176 <Field Parser DescriptorProtos$DescriptorProto$ReservedRange.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #182 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.DescriptorProto.ReservedRange) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #185 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ReservedRange)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #188 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #192 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #185 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ReservedRange)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.DescriptorProto.ReservedRange)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.DescriptorProto.ReservedRange) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(DescriptorProtos.DescriptorProto.ReservedRange reservedrange)
	{
		if(reservedrange == DescriptorProtos.DescriptorProto.ReservedRange.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #139 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(reservedrange.hasStart())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #194 <Method boolean DescriptorProtos$DescriptorProto$ReservedRange.hasStart()>
	//*   7   13:ifeq            25
			setStart(reservedrange.getStart());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #196 <Method int DescriptorProtos$DescriptorProto$ReservedRange.getStart()>
	//   11   21:invokevirtual   #200 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setStart(int)>
	//   12   24:pop             
		if(reservedrange.hasEnd())
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #202 <Method boolean DescriptorProtos$DescriptorProto$ReservedRange.hasEnd()>
	//*  15   29:ifeq            41
			setEnd(reservedrange.getEnd());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #204 <Method int DescriptorProtos$DescriptorProto$ReservedRange.getEnd()>
	//   19   37:invokevirtual   #207 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setEnd(int)>
	//   20   40:pop             
		mergeUnknownFields(reservedrange.unknownFields);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getfield        #211 <Field UnknownFieldSet DescriptorProtos$DescriptorProto$ReservedRange.unknownFields>
	//   24   46:invokevirtual   #215 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
	//   25   49:pop             
		onChanged();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   28   54:aload_0         
	//   29   55:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.DescriptorProto.ReservedRange)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.DescriptorProto.ReservedRange)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//    6   12:invokevirtual   #185 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ReservedRange)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #217 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #165 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #169 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #165 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #215 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #224 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #215 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #215 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder setEnd(int i)
	{
		bitField0_ = bitField0_ | 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #76  <Field int bitField0_>
	//    3    5:iconst_2        
	//    4    6:ior             
	//    5    7:putfield        #76  <Field int bitField0_>
		end_ = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #84  <Field int end_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #228 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #230 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #230 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #235 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #237 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #237 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$DescriptorProto$ReservedRange$Builder setStart(int i)
	{
		bitField0_ = bitField0_ | 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #76  <Field int bitField0_>
	//    3    5:iconst_1        
	//    4    6:ior             
	//    5    7:putfield        #76  <Field int bitField0_>
		start_ = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #78  <Field int start_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public final DescriptorProtos$DescriptorProto$ReservedRange$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #241 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #243 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #243 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private int end_;
	private int start_;

	private DescriptorProtos$DescriptorProto$ReservedRange$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void GeneratedMessageV3$Builder()>
		maybeForceBuilderInitialization();
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void maybeForceBuilderInitialization()>
	//    4    8:return          
	}

	DescriptorProtos$DescriptorProto$ReservedRange$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void DescriptorProtos$DescriptorProto$ReservedRange$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$DescriptorProto$ReservedRange$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		maybeForceBuilderInitialization();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void maybeForceBuilderInitialization()>
	//    5    9:return          
	}

	DescriptorProtos$DescriptorProto$ReservedRange$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void DescriptorProtos$DescriptorProto$ReservedRange$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
