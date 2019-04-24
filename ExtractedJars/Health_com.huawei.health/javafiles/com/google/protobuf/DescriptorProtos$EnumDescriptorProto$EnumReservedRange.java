// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DescriptorProtos, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, Parser, CodedOutputStream, ExtensionRegistryLite, 
//			ByteString, Message, MessageLite, AbstractParser

public static final class DescriptorProtos$EnumDescriptorProto$EnumReservedRange extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$9700();
		//    0    0:invokestatic    #40  <Method Descriptors$Descriptor DescriptorProtos.access$9700()>
		//    1    3:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
		//    0    0:getstatic       #46  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//    1    3:istore_1        
		//    2    4:return          
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #51  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #53  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #53  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public DescriptorProtos.EnumDescriptorProto.EnumReservedRange build()
		{
			DescriptorProtos.EnumDescriptorProto.EnumReservedRange enumreservedrange = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange buildPartial()>
		//    2    4:astore_1        
			if(!enumreservedrange.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #63  <Method boolean DescriptorProtos$EnumDescriptorProto$EnumReservedRange.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (enumreservedrange)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #67  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return enumreservedrange;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #70  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #70  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.EnumDescriptorProto.EnumReservedRange buildPartial()
		{
			DescriptorProtos.EnumDescriptorProto.EnumReservedRange enumreservedrange = new DescriptorProtos.EnumDescriptorProto.EnumReservedRange(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #74  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange(GeneratedMessageV3$Builder, DescriptorProtos$1)>
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
			enumreservedrange.start_ = start_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #78  <Field int start_>
		//   21   33:invokestatic    #82  <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$10202(DescriptorProtos$EnumDescriptorProto$EnumReservedRange, int)>
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
			enumreservedrange.end_ = end_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #84  <Field int end_>
		//   37   56:invokestatic    #87  <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$10302(DescriptorProtos$EnumDescriptorProto$EnumReservedRange, int)>
		//   38   59:pop             
			enumreservedrange.bitField0_ = j;
		//   39   60:aload           4
		//   40   62:iload_2         
		//   41   63:invokestatic    #90  <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$10402(DescriptorProtos$EnumDescriptorProto$EnumReservedRange, int)>
		//   42   66:pop             
			onBuilt();
		//   43   67:aload_0         
		//   44   68:invokevirtual   #93  <Method void onBuilt()>
			return enumreservedrange;
		//   45   71:aload           4
		//   46   73:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
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
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearEnd()
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

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #112 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #114 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #114 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #123 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearStart()
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
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #131 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.EnumDescriptorProto.EnumReservedRange getDefaultInstanceForType()
		{
			return DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance();
		//    0    0:invokestatic    #139 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #141 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #141 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$9700();
		//    0    0:invokestatic    #40  <Method Descriptors$Descriptor DescriptorProtos.access$9700()>
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
			return DescriptorProtos.access$9800().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange, com/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder);
		//    0    0:invokestatic    #152 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$9800()>
		//    1    3:ldc1            #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    2    5:ldc1            #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
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
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #169 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumDescriptorProto.EnumReservedRange)DescriptorProtos.EnumDescriptorProto.EnumReservedRange.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #176 <Field Parser DescriptorProtos$EnumDescriptorProto$EnumReservedRange.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #182 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.EnumDescriptorProto.EnumReservedRange) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #185 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
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
		//*  23   40:checkcast       #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
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
		//*  35   58:invokevirtual   #185 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumDescriptorProto.EnumReservedRange)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.EnumDescriptorProto.EnumReservedRange) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.EnumDescriptorProto.EnumReservedRange enumreservedrange)
		{
			if(enumreservedrange == DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #139 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(enumreservedrange.hasStart())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #194 <Method boolean DescriptorProtos$EnumDescriptorProto$EnumReservedRange.hasStart()>
		//*   7   13:ifeq            25
				setStart(enumreservedrange.getStart());
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #196 <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getStart()>
		//   11   21:invokevirtual   #200 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setStart(int)>
		//   12   24:pop             
			if(enumreservedrange.hasEnd())
		//*  13   25:aload_1         
		//*  14   26:invokevirtual   #202 <Method boolean DescriptorProtos$EnumDescriptorProto$EnumReservedRange.hasEnd()>
		//*  15   29:ifeq            41
				setEnd(enumreservedrange.getEnd());
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:invokevirtual   #204 <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getEnd()>
		//   19   37:invokevirtual   #207 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setEnd(int)>
		//   20   40:pop             
			mergeUnknownFields(enumreservedrange.unknownFields);
		//   21   41:aload_0         
		//   22   42:aload_1         
		//   23   43:getfield        #211 <Field UnknownFieldSet DescriptorProtos$EnumDescriptorProto$EnumReservedRange.unknownFields>
		//   24   46:invokevirtual   #215 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//   25   49:pop             
			onChanged();
		//   26   50:aload_0         
		//   27   51:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   28   54:aload_0         
		//   29   55:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.EnumDescriptorProto.EnumReservedRange)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.EnumDescriptorProto.EnumReservedRange)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    6   12:invokevirtual   #185 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
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
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #169 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #215 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #224 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #215 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #215 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setEnd(int i)
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #228 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #230 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #230 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #235 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #237 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #237 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setStart(int i)
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #241 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #243 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #243 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private int end_;
		private int start_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void GeneratedMessageV3$Builder()>
			maybeForceBuilderInitialization();
		//    2    4:aload_0         
		//    3    5:invokespecial   #27  <Method void maybeForceBuilderInitialization()>
		//    4    8:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #35  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$9700();
	//    0    0:invokestatic    #126 <Method Descriptors$Descriptor DescriptorProtos.access$9700()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #130 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorprotos$enumdescriptorproto$enumreservedrange)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$enumdescriptorproto$enumreservedrange);
	//    0    0:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #130 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #134 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #140 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #144 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #151 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #155 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #160 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #164 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #166 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #168 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #172 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #176 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #180 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #184 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #47  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$EnumDescriptorProto$EnumReservedRange))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #191 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$EnumDescriptorProto$EnumReservedRange)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasStart() == ((DescriptorProtos$EnumDescriptorProto$EnumReservedRange) (obj)).hasStart())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #195 <Method boolean hasStart()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #195 <Method boolean hasStart()>
	//*  21   37:icmpne          45
			flag = true;
	//   22   40:iconst_1        
	//   23   41:istore_2        
		else
	//*  24   42:goto            47
			flag = false;
	//   25   45:iconst_0        
	//   26   46:istore_2        
		boolean flag1 = flag;
	//   27   47:iload_2         
	//   28   48:istore_3        
		if(hasStart())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #195 <Method boolean hasStart()>
	//*  31   53:ifeq            78
			if(flag && getStart() == ((DescriptorProtos$EnumDescriptorProto$EnumReservedRange) (obj)).getStart())
	//*  32   56:iload_2         
	//*  33   57:ifeq            76
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #198 <Method int getStart()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #198 <Method int getStart()>
	//*  38   68:icmpne          76
				flag1 = true;
	//   39   71:iconst_1        
	//   40   72:istore_3        
			else
	//*  41   73:goto            78
				flag1 = false;
	//   42   76:iconst_0        
	//   43   77:istore_3        
		if(flag1 && hasEnd() == ((DescriptorProtos$EnumDescriptorProto$EnumReservedRange) (obj)).hasEnd())
	//*  44   78:iload_3         
	//*  45   79:ifeq            98
	//*  46   82:aload_0         
	//*  47   83:invokevirtual   #201 <Method boolean hasEnd()>
	//*  48   86:aload_1         
	//*  49   87:invokevirtual   #201 <Method boolean hasEnd()>
	//*  50   90:icmpne          98
			flag = true;
	//   51   93:iconst_1        
	//   52   94:istore_2        
		else
	//*  53   95:goto            100
			flag = false;
	//   54   98:iconst_0        
	//   55   99:istore_2        
		flag1 = flag;
	//   56  100:iload_2         
	//   57  101:istore_3        
		if(hasEnd())
	//*  58  102:aload_0         
	//*  59  103:invokevirtual   #201 <Method boolean hasEnd()>
	//*  60  106:ifeq            131
			if(flag && getEnd() == ((DescriptorProtos$EnumDescriptorProto$EnumReservedRange) (obj)).getEnd())
	//*  61  109:iload_2         
	//*  62  110:ifeq            129
	//*  63  113:aload_0         
	//*  64  114:invokevirtual   #204 <Method int getEnd()>
	//*  65  117:aload_1         
	//*  66  118:invokevirtual   #204 <Method int getEnd()>
	//*  67  121:icmpne          129
				flag1 = true;
	//   68  124:iconst_1        
	//   69  125:istore_3        
			else
	//*  70  126:goto            131
				flag1 = false;
	//   71  129:iconst_0        
	//   72  130:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$EnumDescriptorProto$EnumReservedRange) (obj)).unknownFields)));
	//   73  131:iload_3         
	//   74  132:ifeq            151
	//   75  135:aload_0         
	//   76  136:getfield        #94  <Field UnknownFieldSet unknownFields>
	//   77  139:aload_1         
	//   78  140:getfield        #94  <Field UnknownFieldSet unknownFields>
	//   79  143:invokevirtual   #205 <Method boolean UnknownFieldSet.equals(Object)>
	//   80  146:ifeq            151
	//   81  149:iconst_1        
	//   82  150:ireturn         
	//   83  151:iconst_0        
	//   84  152:ireturn         
	}

	public DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public int getEnd()
	{
		return end_;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int end_>
	//    2    4:ireturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #47  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field int memoizedSize>
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
		if((bitField0_ & 1) == 1)
	//*  10   14:aload_0         
	//*  11   15:getfield        #81  <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			i = CodedOutputStream.computeInt32Size(1, start_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #53  <Field int start_>
	//   19   29:invokestatic    #221 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_1        
		int j = i;
	//   23   35:iload_1         
	//   24   36:istore_2        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #81  <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          58
			j = i + CodedOutputStream.computeInt32Size(2, end_);
	//   31   47:iload_1         
	//   32   48:iconst_2        
	//   33   49:aload_0         
	//   34   50:getfield        #55  <Field int end_>
	//   35   53:invokestatic    #221 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//   36   56:iadd            
	//   37   57:istore_2        
		i = j + unknownFields.getSerializedSize();
	//   38   58:iload_2         
	//   39   59:aload_0         
	//   40   60:getfield        #94  <Field UnknownFieldSet unknownFields>
	//   41   63:invokevirtual   #223 <Method int UnknownFieldSet.getSerializedSize()>
	//   42   66:iadd            
	//   43   67:istore_1        
		memoizedSize = i;
	//   44   68:aload_0         
	//   45   69:iload_1         
	//   46   70:putfield        #215 <Field int memoizedSize>
		return i;
	//   47   73:iload_1         
	//   48   74:ireturn         
	}

	public int getStart()
	{
		return start_;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int start_>
	//    2    4:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasEnd()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int bitField0_>
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
	//    1    1:getfield        #81  <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #228 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #230 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #234 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasStart())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #195 <Method boolean hasStart()>
	//*  15   29:ifeq            47
			i = (j * 37 + 1) * 53 + getStart();
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #198 <Method int getStart()>
	//   25   45:iadd            
	//   26   46:istore_1        
		j = i;
	//   27   47:iload_1         
	//   28   48:istore_2        
		if(hasEnd())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #201 <Method boolean hasEnd()>
	//*  31   53:ifeq            71
			j = (i * 37 + 2) * 53 + getEnd();
	//   32   56:iload_1         
	//   33   57:bipush          37
	//   34   59:imul            
	//   35   60:iconst_2        
	//   36   61:iadd            
	//   37   62:bipush          53
	//   38   64:imul            
	//   39   65:aload_0         
	//   40   66:invokevirtual   #204 <Method int getEnd()>
	//   41   69:iadd            
	//   42   70:istore_2        
		i = j * 29 + unknownFields.hashCode();
	//   43   71:iload_2         
	//   44   72:bipush          29
	//   45   74:imul            
	//   46   75:aload_0         
	//   47   76:getfield        #94  <Field UnknownFieldSet unknownFields>
	//   48   79:invokevirtual   #235 <Method int UnknownFieldSet.hashCode()>
	//   49   82:iadd            
	//   50   83:istore_1        
		memoizedHashCode = i;
	//   51   84:aload_0         
	//   52   85:iload_1         
	//   53   86:putfield        #228 <Field int memoizedHashCode>
		return i;
	//   54   89:iload_1         
	//   55   90:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$9800().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange, com/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder);
	//    0    0:invokestatic    #240 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$9800()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    2    5:ldc1            #16  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
	//    3    7:invokevirtual   #246 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field byte memoizedIsInitialized>
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
	//   14   20:putfield        #51  <Field byte memoizedIsInitialized>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #250 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #16  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #254 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #260 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #16  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #264 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #16  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #264 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #134 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			codedoutputstream.writeInt32(1, start_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #53  <Field int start_>
	//   10   16:invokevirtual   #270 <Method void CodedOutputStream.writeInt32(int, int)>
		if((bitField0_ & 2) == 2)
	//*  11   19:aload_0         
	//*  12   20:getfield        #81  <Field int bitField0_>
	//*  13   23:iconst_2        
	//*  14   24:iand            
	//*  15   25:iconst_2        
	//*  16   26:icmpne          38
			codedoutputstream.writeInt32(2, end_);
	//   17   29:aload_1         
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:getfield        #55  <Field int end_>
	//   21   35:invokevirtual   #270 <Method void CodedOutputStream.writeInt32(int, int)>
		unknownFields.writeTo(codedoutputstream);
	//   22   38:aload_0         
	//   23   39:getfield        #94  <Field UnknownFieldSet unknownFields>
	//   24   42:aload_1         
	//   25   43:invokevirtual   #272 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   26   46:return          
	}

	private static final DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE = new DescriptorProtos$EnumDescriptorProto$EnumReservedRange();
	public static final int END_FIELD_NUMBER = 2;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.EnumDescriptorProto.EnumReservedRange parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.EnumDescriptorProto.EnumReservedRange(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #25  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int START_FIELD_NUMBER = 1;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private int end_;
	private byte memoizedIsInitialized;
	private int start_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange()>
	//    3    7:putstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
	//    4   10:new             #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$1>
	//    5   13:dup             
	//    6   14:invokespecial   #45  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$1()>
	//    7   17:putstatic       #47  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static int access$10202(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorprotos$enumdescriptorproto$enumreservedrange, int i)
	{
		descriptorprotos$enumdescriptorproto$enumreservedrange.start_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int start_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$10302(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorprotos$enumdescriptorproto$enumreservedrange, int i)
	{
		descriptorprotos$enumdescriptorproto$enumreservedrange.end_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int end_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$10402(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorprotos$enumdescriptorproto$enumreservedrange, int i)
	{
		descriptorprotos$enumdescriptorproto$enumreservedrange.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$EnumDescriptorProto$EnumReservedRange()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #51  <Field byte memoizedIsInitialized>
		start_ = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #53  <Field int start_>
		end_ = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #55  <Field int end_>
	//   11   19:return          
	}

	private DescriptorProtos$EnumDescriptorProto$EnumReservedRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #62  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #63  <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #69  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//    9   19:astore          5
		flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L8:
		if(flag) goto _L2; else goto _L1
	//   12   23:iload_3         
	//   13   24:ifne            128
_L1:
		int i = codedinputstream.readTag();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #75  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 3: default 179
	//	               0: 182
	//	               8: 86
	//	               16: 107;
	//   18   35:lookupswitch    3: default 179
	//	               0: 182
	//	               8: 86
	//	               16: 107
		   goto _L3 _L4 _L5 _L6
_L3:
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
	//*  19   68:aload_0         
	//*  20   69:aload_1         
	//*  21   70:aload           5
	//*  22   72:aload_2         
	//*  23   73:iload           4
	//*  24   75:invokevirtual   #79  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25   78:ifne            125
			flag = true;
	//   26   81:iconst_1        
	//   27   82:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28   83:goto            125
_L5:
		bitField0_ = bitField0_ | 1;
	//   29   86:aload_0         
	//   30   87:aload_0         
	//   31   88:getfield        #81  <Field int bitField0_>
	//   32   91:iconst_1        
	//   33   92:ior             
	//   34   93:putfield        #81  <Field int bitField0_>
		start_ = codedinputstream.readInt32();
	//   35   96:aload_0         
	//   36   97:aload_1         
	//   37   98:invokevirtual   #84  <Method int CodedInputStream.readInt32()>
	//   38  101:putfield        #53  <Field int start_>
		continue; /* Loop/switch isn't completed */
	//   39  104:goto            125
_L6:
		bitField0_ = bitField0_ | 2;
	//   40  107:aload_0         
	//   41  108:aload_0         
	//   42  109:getfield        #81  <Field int bitField0_>
	//   43  112:iconst_2        
	//   44  113:ior             
	//   45  114:putfield        #81  <Field int bitField0_>
		end_ = codedinputstream.readInt32();
	//   46  117:aload_0         
	//   47  118:aload_1         
	//   48  119:invokevirtual   #84  <Method int CodedInputStream.readInt32()>
	//   49  122:putfield        #55  <Field int end_>
		continue; /* Loop/switch isn't completed */
	//   50  125:goto            23
_L2:
		unknownFields = builder.build();
	//   51  128:aload_0         
	//   52  129:aload           5
	//   53  131:invokevirtual   #90  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   54  134:putfield        #94  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   55  137:aload_0         
	//   56  138:invokevirtual   #97  <Method void makeExtensionsImmutable()>
		return;
	//   57  141:return          
		codedinputstream;
	//   58  142:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   59  143:aload_1         
	//   60  144:aload_0         
	//   61  145:invokevirtual   #101 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   62  148:athrow          
		codedinputstream;
	//   63  149:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//   64  150:new             #58  <Class InvalidProtocolBufferException>
	//   65  153:dup             
	//   66  154:aload_1         
	//   67  155:invokespecial   #104 <Method void InvalidProtocolBufferException(IOException)>
	//   68  158:aload_0         
	//   69  159:invokevirtual   #101 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   70  162:athrow          
		codedinputstream;
	//   71  163:astore_1        
		unknownFields = builder.build();
	//   72  164:aload_0         
	//   73  165:aload           5
	//   74  167:invokevirtual   #90  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   75  170:putfield        #94  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   76  173:aload_0         
	//   77  174:invokevirtual   #97  <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//   78  177:aload_1         
	//   79  178:athrow          
	//*  80  179:goto            68
_L4:
		flag = true;
	//   81  182:iconst_1        
	//   82  183:istore_3        
		if(true) goto _L8; else goto _L7
	//   83  184:goto            125
_L7:
	}

	DescriptorProtos$EnumDescriptorProto$EnumReservedRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #108 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$EnumDescriptorProto$EnumReservedRange(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #111 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #51  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$EnumDescriptorProto$EnumReservedRange(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
