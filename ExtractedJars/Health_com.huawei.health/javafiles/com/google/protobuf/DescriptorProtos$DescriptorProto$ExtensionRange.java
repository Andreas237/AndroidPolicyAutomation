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
//			ByteString, Message, MessageLite, SingleFieldBuilderV3, 
//			AbstractParser

public static final class DescriptorProtos$DescriptorProto$ExtensionRange extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$2800();
		//    0    0:invokestatic    #47  <Method Descriptors$Descriptor DescriptorProtos.access$2800()>
		//    1    3:areturn         
		}

		private SingleFieldBuilderV3 getOptionsFieldBuilder()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       35
			{
				optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//    3    7:aload_0         
		//    4    8:new             #53  <Class SingleFieldBuilderV3>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokevirtual   #57  <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//    8   16:aload_0         
		//    9   17:invokevirtual   #61  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   10   20:aload_0         
		//   11   21:invokevirtual   #65  <Method boolean isClean()>
		//   12   24:invokespecial   #68  <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
		//   13   27:putfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
				options_ = null;
		//   14   30:aload_0         
		//   15   31:aconst_null     
		//   16   32:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
			}
			return optionsBuilder_;
		//   17   35:aload_0         
		//   18   36:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   19   39:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #76  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            11
				getOptionsFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #78  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//    4   10:pop             
		//    5   11:return          
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #83  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #85  <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #85  <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public DescriptorProtos.DescriptorProto.ExtensionRange build()
		{
			DescriptorProtos.DescriptorProto.ExtensionRange extensionrange = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method DescriptorProtos$DescriptorProto$ExtensionRange buildPartial()>
		//    2    4:astore_1        
			if(!extensionrange.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #94  <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (extensionrange)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #98  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return extensionrange;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #101 <Method DescriptorProtos$DescriptorProto$ExtensionRange build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #101 <Method DescriptorProtos$DescriptorProto$ExtensionRange build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.DescriptorProto.ExtensionRange buildPartial()
		{
			DescriptorProtos.DescriptorProto.ExtensionRange extensionrange = new DescriptorProtos.DescriptorProto.ExtensionRange(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #105 <Method void DescriptorProtos$DescriptorProto$ExtensionRange(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #107 <Field int bitField0_>
		//    8   15:istore_3        
			int j = 0;
		//    9   16:iconst_0        
		//   10   17:istore_2        
			if((k & 1) == 1)
		//*  11   18:iload_3         
		//*  12   19:iconst_1        
		//*  13   20:iand            
		//*  14   21:iconst_1        
		//*  15   22:icmpne          27
				j = 1;
		//   16   25:iconst_1        
		//   17   26:istore_2        
			extensionrange.start_ = start_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #109 <Field int start_>
		//   21   33:invokestatic    #113 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.access$3302(DescriptorProtos$DescriptorProto$ExtensionRange, int)>
		//   22   36:pop             
			int i = j;
		//   23   37:iload_2         
		//   24   38:istore_1        
			if((k & 2) == 2)
		//*  25   39:iload_3         
		//*  26   40:iconst_2        
		//*  27   41:iand            
		//*  28   42:iconst_2        
		//*  29   43:icmpne          50
				i = j | 2;
		//   30   46:iload_2         
		//   31   47:iconst_2        
		//   32   48:ior             
		//   33   49:istore_1        
			extensionrange.end_ = end_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #115 <Field int end_>
		//   37   56:invokestatic    #118 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.access$3402(DescriptorProtos$DescriptorProto$ExtensionRange, int)>
		//   38   59:pop             
			j = i;
		//   39   60:iload_1         
		//   40   61:istore_2        
			if((k & 4) == 4)
		//*  41   62:iload_3         
		//*  42   63:iconst_4        
		//*  43   64:iand            
		//*  44   65:iconst_4        
		//*  45   66:icmpne          73
				j = i | 4;
		//   46   69:iload_1         
		//   47   70:iconst_4        
		//   48   71:ior             
		//   49   72:istore_2        
			if(optionsBuilder_ == null)
		//*  50   73:aload_0         
		//*  51   74:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  52   77:ifnonnull       93
				extensionrange.options_ = options_;
		//   53   80:aload           4
		//   54   82:aload_0         
		//   55   83:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   56   86:invokestatic    #122 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$DescriptorProto$ExtensionRange.access$3502(DescriptorProtos$DescriptorProto$ExtensionRange, DescriptorProtos$ExtensionRangeOptions)>
		//   57   89:pop             
			else
		//*  58   90:goto            109
				extensionrange.options_ = (DescriptorProtos.ExtensionRangeOptions)optionsBuilder_.build();
		//   59   93:aload           4
		//   60   95:aload_0         
		//   61   96:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   62   99:invokevirtual   #125 <Method AbstractMessage SingleFieldBuilderV3.build()>
		//   63  102:checkcast       #127 <Class DescriptorProtos$ExtensionRangeOptions>
		//   64  105:invokestatic    #122 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$DescriptorProto$ExtensionRange.access$3502(DescriptorProtos$DescriptorProto$ExtensionRange, DescriptorProtos$ExtensionRangeOptions)>
		//   65  108:pop             
			extensionrange.bitField0_ = j;
		//   66  109:aload           4
		//   67  111:iload_2         
		//   68  112:invokestatic    #130 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.access$3602(DescriptorProtos$DescriptorProto$ExtensionRange, int)>
		//   69  115:pop             
			onBuilt();
		//   70  116:aload_0         
		//   71  117:invokevirtual   #133 <Method void onBuilt()>
			return extensionrange;
		//   72  120:aload           4
		//   73  122:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method DescriptorProtos$DescriptorProto$ExtensionRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method DescriptorProtos$DescriptorProto$ExtensionRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #138 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #141 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			start_ = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #109 <Field int start_>
			bitField0_ = bitField0_ & -2;
		//    6   10:aload_0         
		//    7   11:aload_0         
		//    8   12:getfield        #107 <Field int bitField0_>
		//    9   15:bipush          -2
		//   10   17:iand            
		//   11   18:putfield        #107 <Field int bitField0_>
			end_ = 0;
		//   12   21:aload_0         
		//   13   22:iconst_0        
		//   14   23:putfield        #115 <Field int end_>
			bitField0_ = bitField0_ & -3;
		//   15   26:aload_0         
		//   16   27:aload_0         
		//   17   28:getfield        #107 <Field int bitField0_>
		//   18   31:bipush          -3
		//   19   33:iand            
		//   20   34:putfield        #107 <Field int bitField0_>
			if(optionsBuilder_ == null)
		//*  21   37:aload_0         
		//*  22   38:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  23   41:ifnonnull       52
				options_ = null;
		//   24   44:aload_0         
		//   25   45:aconst_null     
		//   26   46:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
			else
		//*  27   49:goto            60
				optionsBuilder_.clear();
		//   28   52:aload_0         
		//   29   53:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   30   56:invokevirtual   #143 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   31   59:pop             
			bitField0_ = bitField0_ & -5;
		//   32   60:aload_0         
		//   33   61:aload_0         
		//   34   62:getfield        #107 <Field int bitField0_>
		//   35   65:bipush          -5
		//   36   67:iand            
		//   37   68:putfield        #107 <Field int bitField0_>
			return this;
		//   38   71:aload_0         
		//   39   72:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #138 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #138 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #138 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearEnd()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #107 <Field int bitField0_>
			end_ = 0;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #115 <Field int end_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #149 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #154 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #156 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #156 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #162 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #165 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #162 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #162 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       19
			{
				options_ = null;
		//    3    7:aload_0         
		//    4    8:aconst_null     
		//    5    9:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #149 <Method void onChanged()>
			} else
		//*   8   16:goto            27
			{
				optionsBuilder_.clear();
		//    9   19:aload_0         
		//   10   20:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   11   23:invokevirtual   #143 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   12   26:pop             
			}
			bitField0_ = bitField0_ & -5;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #107 <Field int bitField0_>
		//   16   32:bipush          -5
		//   17   34:iand            
		//   18   35:putfield        #107 <Field int bitField0_>
			return this;
		//   19   38:aload_0         
		//   20   39:areturn         
		}

		public Builder clearStart()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #107 <Field int bitField0_>
			start_ = 0;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #109 <Field int start_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #149 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #174 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.DescriptorProto.ExtensionRange getDefaultInstanceForType()
		{
			return DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance();
		//    0    0:invokestatic    #182 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #184 <Method DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #184 <Method DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$2800();
		//    0    0:invokestatic    #47  <Method Descriptors$Descriptor DescriptorProtos.access$2800()>
		//    1    3:areturn         
		}

		public int getEnd()
		{
			return end_;
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field int end_>
		//    2    4:ireturn         
		}

		public DescriptorProtos.ExtensionRangeOptions getOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       23
			{
				if(options_ == null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*   5   11:ifnonnull       18
					return DescriptorProtos.ExtensionRangeOptions.getDefaultInstance();
		//    6   14:invokestatic    #189 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
		//    7   17:areturn         
				else
					return options_;
		//    8   18:aload_0         
		//    9   19:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   10   22:areturn         
			} else
			{
				return (DescriptorProtos.ExtensionRangeOptions)optionsBuilder_.getMessage();
		//   11   23:aload_0         
		//   12   24:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   13   27:invokevirtual   #192 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
		//   14   30:checkcast       #127 <Class DescriptorProtos$ExtensionRangeOptions>
		//   15   33:areturn         
			}
		}

		public DescriptorProtos.ExtensionRangeOptions.Builder getOptionsBuilder()
		{
			bitField0_ = bitField0_ | 4;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:iconst_4        
		//    4    6:ior             
		//    5    7:putfield        #107 <Field int bitField0_>
			onChanged();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #149 <Method void onChanged()>
			return (DescriptorProtos.ExtensionRangeOptions.Builder)getOptionsFieldBuilder().getBuilder();
		//    8   14:aload_0         
		//    9   15:invokespecial   #78  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//   10   18:invokevirtual   #197 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
		//   11   21:checkcast       #199 <Class DescriptorProtos$ExtensionRangeOptions$Builder>
		//   12   24:areturn         
		}

		public DescriptorProtos.ExtensionRangeOptionsOrBuilder getOptionsOrBuilder()
		{
			if(optionsBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnull          18
				return (DescriptorProtos.ExtensionRangeOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
		//    3    7:aload_0         
		//    4    8:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//    5   11:invokevirtual   #205 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
		//    6   14:checkcast       #207 <Class DescriptorProtos$ExtensionRangeOptionsOrBuilder>
		//    7   17:areturn         
			if(options_ == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*  10   22:ifnonnull       29
				return ((DescriptorProtos.ExtensionRangeOptionsOrBuilder) (DescriptorProtos.ExtensionRangeOptions.getDefaultInstance()));
		//   11   25:invokestatic    #189 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
		//   12   28:areturn         
			else
				return ((DescriptorProtos.ExtensionRangeOptionsOrBuilder) (options_));
		//   13   29:aload_0         
		//   14   30:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   15   33:areturn         
		}

		public int getStart()
		{
			return start_;
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field int start_>
		//    2    4:ireturn         
		}

		public boolean hasEnd()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #107 <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasOptions()
		{
			return (bitField0_ & 4) == 4;
		//    0    0:aload_0         
		//    1    1:getfield        #107 <Field int bitField0_>
		//    2    4:iconst_4        
		//    3    5:iand            
		//    4    6:iconst_4        
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
		//    1    1:getfield        #107 <Field int bitField0_>
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
			return DescriptorProtos.access$2900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange, com/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$Builder);
		//    0    0:invokestatic    #216 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$2900()>
		//    1    3:ldc1            #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    2    5:ldc1            #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    3    7:invokevirtual   #222 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			return !hasOptions() || getOptions().isInitialized();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #224 <Method boolean hasOptions()>
		//    2    4:ifeq            19
		//    3    7:aload_0         
		//    4    8:invokevirtual   #57  <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//    5   11:invokevirtual   #225 <Method boolean DescriptorProtos$ExtensionRangeOptions.isInitialized()>
		//    6   14:ifne            19
		//    7   17:iconst_0        
		//    8   18:ireturn         
		//    9   19:iconst_1        
		//   10   20:ireturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #232 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #236 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #232 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.DescriptorProto.ExtensionRange)DescriptorProtos.DescriptorProto.ExtensionRange.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #243 <Field Parser DescriptorProtos$DescriptorProto$ExtensionRange.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #249 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.DescriptorProto.ExtensionRange) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #252 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #255 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #259 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #252 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.DescriptorProto.ExtensionRange)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.DescriptorProto.ExtensionRange) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.DescriptorProto.ExtensionRange extensionrange)
		{
			if(extensionrange == DescriptorProtos.DescriptorProto.ExtensionRange.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #182 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(extensionrange.hasStart())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #261 <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.hasStart()>
		//*   7   13:ifeq            25
				setStart(extensionrange.getStart());
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #263 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.getStart()>
		//   11   21:invokevirtual   #267 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setStart(int)>
		//   12   24:pop             
			if(extensionrange.hasEnd())
		//*  13   25:aload_1         
		//*  14   26:invokevirtual   #269 <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.hasEnd()>
		//*  15   29:ifeq            41
				setEnd(extensionrange.getEnd());
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:invokevirtual   #271 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.getEnd()>
		//   19   37:invokevirtual   #274 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setEnd(int)>
		//   20   40:pop             
			if(extensionrange.hasOptions())
		//*  21   41:aload_1         
		//*  22   42:invokevirtual   #275 <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.hasOptions()>
		//*  23   45:ifeq            57
				mergeOptions(extensionrange.getOptions());
		//   24   48:aload_0         
		//   25   49:aload_1         
		//   26   50:invokevirtual   #276 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$DescriptorProto$ExtensionRange.getOptions()>
		//   27   53:invokevirtual   #280 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeOptions(DescriptorProtos$ExtensionRangeOptions)>
		//   28   56:pop             
			mergeUnknownFields(extensionrange.unknownFields);
		//   29   57:aload_0         
		//   30   58:aload_1         
		//   31   59:getfield        #284 <Field UnknownFieldSet DescriptorProtos$DescriptorProto$ExtensionRange.unknownFields>
		//   32   62:invokevirtual   #288 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//   33   65:pop             
			onChanged();
		//   34   66:aload_0         
		//   35   67:invokevirtual   #149 <Method void onChanged()>
			return this;
		//   36   70:aload_0         
		//   37   71:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.DescriptorProto.ExtensionRange)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.DescriptorProto.ExtensionRange)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    6   12:invokevirtual   #252 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #290 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #232 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #236 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #232 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeOptions(DescriptorProtos.ExtensionRangeOptions extensionrangeoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       67
			{
				if((bitField0_ & 4) == 4 && options_ != null && options_ != DescriptorProtos.ExtensionRangeOptions.getDefaultInstance())
		//*   3    7:aload_0         
		//*   4    8:getfield        #107 <Field int bitField0_>
		//*   5   11:iconst_4        
		//*   6   12:iand            
		//*   7   13:iconst_4        
		//*   8   14:icmpne          55
		//*   9   17:aload_0         
		//*  10   18:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*  11   21:ifnull          55
		//*  12   24:aload_0         
		//*  13   25:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*  14   28:invokestatic    #189 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
		//*  15   31:if_acmpeq       55
					options_ = DescriptorProtos.ExtensionRangeOptions.newBuilder(options_).mergeFrom(extensionrangeoptions).buildPartial();
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   19   39:invokestatic    #297 <Method DescriptorProtos$ExtensionRangeOptions$Builder DescriptorProtos$ExtensionRangeOptions.newBuilder(DescriptorProtos$ExtensionRangeOptions)>
		//   20   42:aload_1         
		//   21   43:invokevirtual   #299 <Method DescriptorProtos$ExtensionRangeOptions$Builder DescriptorProtos$ExtensionRangeOptions$Builder.mergeFrom(DescriptorProtos$ExtensionRangeOptions)>
		//   22   46:invokevirtual   #301 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions$Builder.buildPartial()>
		//   23   49:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				else
		//*  24   52:goto            60
					options_ = extensionrangeoptions;
		//   25   55:aload_0         
		//   26   56:aload_1         
		//   27   57:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				onChanged();
		//   28   60:aload_0         
		//   29   61:invokevirtual   #149 <Method void onChanged()>
			} else
		//*  30   64:goto            76
			{
				optionsBuilder_.mergeFrom(((AbstractMessage) (extensionrangeoptions)));
		//   31   67:aload_0         
		//   32   68:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   33   71:aload_1         
		//   34   72:invokevirtual   #304 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
		//   35   75:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   36   76:aload_0         
		//   37   77:aload_0         
		//   38   78:getfield        #107 <Field int bitField0_>
		//   39   81:iconst_4        
		//   40   82:ior             
		//   41   83:putfield        #107 <Field int bitField0_>
			return this;
		//   42   86:aload_0         
		//   43   87:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #288 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #308 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #288 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #288 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setEnd(int i)
		{
			bitField0_ = bitField0_ | 2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:iconst_2        
		//    4    6:ior             
		//    5    7:putfield        #107 <Field int bitField0_>
			end_ = i;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #115 <Field int end_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #149 <Method void onChanged()>
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
		//    3    3:invokespecial   #312 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #314 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #314 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setOptions(DescriptorProtos.ExtensionRangeOptions.Builder builder)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       22
			{
				options_ = builder.build();
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #318 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions$Builder.build()>
		//    6   12:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				onChanged();
		//    7   15:aload_0         
		//    8   16:invokevirtual   #149 <Method void onChanged()>
			} else
		//*   9   19:goto            34
			{
				optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
		//   10   22:aload_0         
		//   11   23:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #318 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions$Builder.build()>
		//   14   30:invokevirtual   #321 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   15   33:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #107 <Field int bitField0_>
		//   19   39:iconst_4        
		//   20   40:ior             
		//   21   41:putfield        #107 <Field int bitField0_>
			return this;
		//   22   44:aload_0         
		//   23   45:areturn         
		}

		public Builder setOptions(DescriptorProtos.ExtensionRangeOptions extensionrangeoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       31
			{
				if(extensionrangeoptions == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
					throw new NullPointerException();
		//    5   11:new             #323 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #324 <Method void NullPointerException()>
		//    8   18:athrow          
				options_ = extensionrangeoptions;
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				onChanged();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #149 <Method void onChanged()>
			} else
		//*  14   28:goto            40
			{
				optionsBuilder_.setMessage(((AbstractMessage) (extensionrangeoptions)));
		//   15   31:aload_0         
		//   16   32:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #321 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   19   39:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   20   40:aload_0         
		//   21   41:aload_0         
		//   22   42:getfield        #107 <Field int bitField0_>
		//   23   45:iconst_4        
		//   24   46:ior             
		//   25   47:putfield        #107 <Field int bitField0_>
			return this;
		//   26   50:aload_0         
		//   27   51:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #329 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #331 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #331 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setStart(int i)
		{
			bitField0_ = bitField0_ | 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:iconst_1        
		//    4    6:ior             
		//    5    7:putfield        #107 <Field int bitField0_>
			start_ = i;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #109 <Field int start_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #149 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #335 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #337 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #337 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private int end_;
		private SingleFieldBuilderV3 optionsBuilder_;
		private DescriptorProtos.ExtensionRangeOptions options_;
		private int start_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void GeneratedMessageV3$Builder()>
			options_ = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
			maybeForceBuilderInitialization();
		//    5    9:aload_0         
		//    6   10:invokespecial   #34  <Method void maybeForceBuilderInitialization()>
		//    7   13:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #40  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			options_ = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
			maybeForceBuilderInitialization();
		//    6   10:aload_0         
		//    7   11:invokespecial   #34  <Method void maybeForceBuilderInitialization()>
		//    8   14:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$2800();
	//    0    0:invokestatic    #155 <Method Descriptors$Descriptor DescriptorProtos.access$2800()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #158 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$DescriptorProto$ExtensionRange descriptorprotos$descriptorproto$extensionrange)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$descriptorproto$extensionrange);
	//    0    0:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #158 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #161 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder DescriptorProtos$DescriptorProto$ExtensionRange$Builder.mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #167 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    4   10:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #171 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    5   11:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #178 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    4   12:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #182 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    5   13:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #187 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    4   10:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #191 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    5   11:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #193 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    4   10:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #195 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    5   11:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #199 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    4   12:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #203 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    5   13:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #207 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    4   12:areturn         
	}

	public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #211 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #51  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$DescriptorProto$ExtensionRange))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #218 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$DescriptorProto$ExtensionRange)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasStart() == ((DescriptorProtos$DescriptorProto$ExtensionRange) (obj)).hasStart())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #222 <Method boolean hasStart()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #222 <Method boolean hasStart()>
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
	//*  30   50:invokevirtual   #222 <Method boolean hasStart()>
	//*  31   53:ifeq            78
			if(flag && getStart() == ((DescriptorProtos$DescriptorProto$ExtensionRange) (obj)).getStart())
	//*  32   56:iload_2         
	//*  33   57:ifeq            76
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #225 <Method int getStart()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #225 <Method int getStart()>
	//*  38   68:icmpne          76
				flag1 = true;
	//   39   71:iconst_1        
	//   40   72:istore_3        
			else
	//*  41   73:goto            78
				flag1 = false;
	//   42   76:iconst_0        
	//   43   77:istore_3        
		if(flag1 && hasEnd() == ((DescriptorProtos$DescriptorProto$ExtensionRange) (obj)).hasEnd())
	//*  44   78:iload_3         
	//*  45   79:ifeq            98
	//*  46   82:aload_0         
	//*  47   83:invokevirtual   #228 <Method boolean hasEnd()>
	//*  48   86:aload_1         
	//*  49   87:invokevirtual   #228 <Method boolean hasEnd()>
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
	//*  59  103:invokevirtual   #228 <Method boolean hasEnd()>
	//*  60  106:ifeq            131
			if(flag && getEnd() == ((DescriptorProtos$DescriptorProto$ExtensionRange) (obj)).getEnd())
	//*  61  109:iload_2         
	//*  62  110:ifeq            129
	//*  63  113:aload_0         
	//*  64  114:invokevirtual   #231 <Method int getEnd()>
	//*  65  117:aload_1         
	//*  66  118:invokevirtual   #231 <Method int getEnd()>
	//*  67  121:icmpne          129
				flag1 = true;
	//   68  124:iconst_1        
	//   69  125:istore_3        
			else
	//*  70  126:goto            131
				flag1 = false;
	//   71  129:iconst_0        
	//   72  130:istore_3        
		if(flag1 && hasOptions() == ((DescriptorProtos$DescriptorProto$ExtensionRange) (obj)).hasOptions())
	//*  73  131:iload_3         
	//*  74  132:ifeq            151
	//*  75  135:aload_0         
	//*  76  136:invokevirtual   #234 <Method boolean hasOptions()>
	//*  77  139:aload_1         
	//*  78  140:invokevirtual   #234 <Method boolean hasOptions()>
	//*  79  143:icmpne          151
			flag = true;
	//   80  146:iconst_1        
	//   81  147:istore_2        
		else
	//*  82  148:goto            153
			flag = false;
	//   83  151:iconst_0        
	//   84  152:istore_2        
		flag1 = flag;
	//   85  153:iload_2         
	//   86  154:istore_3        
		if(hasOptions())
	//*  87  155:aload_0         
	//*  88  156:invokevirtual   #234 <Method boolean hasOptions()>
	//*  89  159:ifeq            187
			if(flag && getOptions().equals(((Object) (((DescriptorProtos$DescriptorProto$ExtensionRange) (obj)).getOptions()))))
	//*  90  162:iload_2         
	//*  91  163:ifeq            185
	//*  92  166:aload_0         
	//*  93  167:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
	//*  94  170:aload_1         
	//*  95  171:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
	//*  96  174:invokevirtual   #238 <Method boolean DescriptorProtos$ExtensionRangeOptions.equals(Object)>
	//*  97  177:ifeq            185
				flag1 = true;
	//   98  180:iconst_1        
	//   99  181:istore_3        
			else
	//* 100  182:goto            187
				flag1 = false;
	//  101  185:iconst_0        
	//  102  186:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$DescriptorProto$ExtensionRange) (obj)).unknownFields)));
	//  103  187:iload_3         
	//  104  188:ifeq            207
	//  105  191:aload_0         
	//  106  192:getfield        #121 <Field UnknownFieldSet unknownFields>
	//  107  195:aload_1         
	//  108  196:getfield        #121 <Field UnknownFieldSet unknownFields>
	//  109  199:invokevirtual   #239 <Method boolean UnknownFieldSet.equals(Object)>
	//  110  202:ifeq            207
	//  111  205:iconst_1        
	//  112  206:ireturn         
	//  113  207:iconst_0        
	//  114  208:ireturn         
	}

	public DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public int getEnd()
	{
		return end_;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int end_>
	//    2    4:ireturn         
	}

	public DescriptorProtos.ExtensionRangeOptions getOptions()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
	//*   2    4:ifnonnull       11
			return DescriptorProtos.ExtensionRangeOptions.getDefaultInstance();
	//    3    7:invokestatic    #246 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return options_;
	//    5   11:aload_0         
	//    6   12:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
	//    7   15:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptionsOrBuilder getOptionsOrBuilder()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
	//*   2    4:ifnonnull       11
			return ((DescriptorProtos$ExtensionRangeOptionsOrBuilder) (DescriptorProtos.ExtensionRangeOptions.getDefaultInstance()));
	//    3    7:invokestatic    #246 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return ((DescriptorProtos$ExtensionRangeOptionsOrBuilder) (options_));
	//    5   11:aload_0         
	//    6   12:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
	//    7   15:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field int memoizedSize>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		int j = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
		if((bitField0_ & 1) == 1)
	//*  10   14:aload_0         
	//*  11   15:getfield        #85  <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			j = CodedOutputStream.computeInt32Size(1, start_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #57  <Field int start_>
	//   19   29:invokestatic    #259 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_2        
		i = j;
	//   23   35:iload_2         
	//   24   36:istore_1        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #85  <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          58
			i = j + CodedOutputStream.computeInt32Size(2, end_);
	//   31   47:iload_2         
	//   32   48:iconst_2        
	//   33   49:aload_0         
	//   34   50:getfield        #59  <Field int end_>
	//   35   53:invokestatic    #259 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//   36   56:iadd            
	//   37   57:istore_1        
		j = i;
	//   38   58:iload_1         
	//   39   59:istore_2        
		if((bitField0_ & 4) == 4)
	//*  40   60:aload_0         
	//*  41   61:getfield        #85  <Field int bitField0_>
	//*  42   64:iconst_4        
	//*  43   65:iand            
	//*  44   66:iconst_4        
	//*  45   67:icmpne          81
			j = i + CodedOutputStream.computeMessageSize(3, ((MessageLite) (getOptions())));
	//   46   70:iload_1         
	//   47   71:iconst_3        
	//   48   72:aload_0         
	//   49   73:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
	//   50   76:invokestatic    #263 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   51   79:iadd            
	//   52   80:istore_2        
		i = j + unknownFields.getSerializedSize();
	//   53   81:iload_2         
	//   54   82:aload_0         
	//   55   83:getfield        #121 <Field UnknownFieldSet unknownFields>
	//   56   86:invokevirtual   #265 <Method int UnknownFieldSet.getSerializedSize()>
	//   57   89:iadd            
	//   58   90:istore_1        
		memoizedSize = i;
	//   59   91:aload_0         
	//   60   92:iload_1         
	//   61   93:putfield        #253 <Field int memoizedSize>
		return i;
	//   62   96:iload_1         
	//   63   97:ireturn         
	}

	public int getStart()
	{
		return start_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int start_>
	//    2    4:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasEnd()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasOptions()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
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
	//    1    1:getfield        #85  <Field int bitField0_>
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
	//*   1    1:getfield        #270 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #270 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #272 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #276 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasStart())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #222 <Method boolean hasStart()>
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
	//   24   42:invokevirtual   #225 <Method int getStart()>
	//   25   45:iadd            
	//   26   46:istore_1        
		j = i;
	//   27   47:iload_1         
	//   28   48:istore_2        
		if(hasEnd())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #228 <Method boolean hasEnd()>
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
	//   40   66:invokevirtual   #231 <Method int getEnd()>
	//   41   69:iadd            
	//   42   70:istore_2        
		i = j;
	//   43   71:iload_2         
	//   44   72:istore_1        
		if(hasOptions())
	//*  45   73:aload_0         
	//*  46   74:invokevirtual   #234 <Method boolean hasOptions()>
	//*  47   77:ifeq            98
			i = (j * 37 + 3) * 53 + getOptions().hashCode();
	//   48   80:iload_2         
	//   49   81:bipush          37
	//   50   83:imul            
	//   51   84:iconst_3        
	//   52   85:iadd            
	//   53   86:bipush          53
	//   54   88:imul            
	//   55   89:aload_0         
	//   56   90:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
	//   57   93:invokevirtual   #277 <Method int DescriptorProtos$ExtensionRangeOptions.hashCode()>
	//   58   96:iadd            
	//   59   97:istore_1        
		i = i * 29 + unknownFields.hashCode();
	//   60   98:iload_1         
	//   61   99:bipush          29
	//   62  101:imul            
	//   63  102:aload_0         
	//   64  103:getfield        #121 <Field UnknownFieldSet unknownFields>
	//   65  106:invokevirtual   #278 <Method int UnknownFieldSet.hashCode()>
	//   66  109:iadd            
	//   67  110:istore_1        
		memoizedHashCode = i;
	//   68  111:aload_0         
	//   69  112:iload_1         
	//   70  113:putfield        #270 <Field int memoizedHashCode>
		return i;
	//   71  116:iload_1         
	//   72  117:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$2900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange, com/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$Builder);
	//    0    0:invokestatic    #283 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$2900()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    2    5:ldc1            #16  <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
	//    3    7:invokevirtual   #289 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field byte memoizedIsInitialized>
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
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		if(hasOptions() && !getOptions().isInitialized())
	//*  12   18:aload_0         
	//*  13   19:invokevirtual   #234 <Method boolean hasOptions()>
	//*  14   22:ifeq            42
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
	//*  17   29:invokevirtual   #292 <Method boolean DescriptorProtos$ExtensionRangeOptions.isInitialized()>
	//*  18   32:ifne            42
		{
			memoizedIsInitialized = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #55  <Field byte memoizedIsInitialized>
			return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   24   42:aload_0         
	//   25   43:iconst_1        
	//   26   44:putfield        #55  <Field byte memoizedIsInitialized>
			return true;
	//   27   47:iconst_1        
	//   28   48:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #295 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #16  <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #299 <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #302 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #305 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #302 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #16  <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #309 <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #16  <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #309 <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #161 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder DescriptorProtos$DescriptorProto$ExtensionRange$Builder.mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			codedoutputstream.writeInt32(1, start_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #57  <Field int start_>
	//   10   16:invokevirtual   #315 <Method void CodedOutputStream.writeInt32(int, int)>
		if((bitField0_ & 2) == 2)
	//*  11   19:aload_0         
	//*  12   20:getfield        #85  <Field int bitField0_>
	//*  13   23:iconst_2        
	//*  14   24:iand            
	//*  15   25:iconst_2        
	//*  16   26:icmpne          38
			codedoutputstream.writeInt32(2, end_);
	//   17   29:aload_1         
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:getfield        #59  <Field int end_>
	//   21   35:invokevirtual   #315 <Method void CodedOutputStream.writeInt32(int, int)>
		if((bitField0_ & 4) == 4)
	//*  22   38:aload_0         
	//*  23   39:getfield        #85  <Field int bitField0_>
	//*  24   42:iconst_4        
	//*  25   43:iand            
	//*  26   44:iconst_4        
	//*  27   45:icmpne          57
			codedoutputstream.writeMessage(3, ((MessageLite) (getOptions())));
	//   28   48:aload_1         
	//   29   49:iconst_3        
	//   30   50:aload_0         
	//   31   51:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
	//   32   54:invokevirtual   #319 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		unknownFields.writeTo(codedoutputstream);
	//   33   57:aload_0         
	//   34   58:getfield        #121 <Field UnknownFieldSet unknownFields>
	//   35   61:aload_1         
	//   36   62:invokevirtual   #321 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   37   65:return          
	}

	private static final DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE = new DescriptorProtos$DescriptorProto$ExtensionRange();
	public static final int END_FIELD_NUMBER = 2;
	public static final int OPTIONS_FIELD_NUMBER = 3;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.DescriptorProto.ExtensionRange parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.DescriptorProto.ExtensionRange(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #25  <Method void DescriptorProtos$DescriptorProto$ExtensionRange(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method DescriptorProtos$DescriptorProto$ExtensionRange parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int START_FIELD_NUMBER = 1;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private int end_;
	private byte memoizedIsInitialized;
	private DescriptorProtos.ExtensionRangeOptions options_;
	private int start_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void DescriptorProtos$DescriptorProto$ExtensionRange()>
	//    3    7:putstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
	//    4   10:new             #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange$1>
	//    5   13:dup             
	//    6   14:invokespecial   #49  <Method void DescriptorProtos$DescriptorProto$ExtensionRange$1()>
	//    7   17:putstatic       #51  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static int access$3302(DescriptorProtos$DescriptorProto$ExtensionRange descriptorprotos$descriptorproto$extensionrange, int i)
	{
		descriptorprotos$descriptorproto$extensionrange.start_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int start_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$3402(DescriptorProtos$DescriptorProto$ExtensionRange descriptorprotos$descriptorproto$extensionrange, int i)
	{
		descriptorprotos$descriptorproto$extensionrange.end_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int end_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static DescriptorProtos.ExtensionRangeOptions access$3502(DescriptorProtos$DescriptorProto$ExtensionRange descriptorprotos$descriptorproto$extensionrange, DescriptorProtos.ExtensionRangeOptions extensionrangeoptions)
	{
		descriptorprotos$descriptorproto$extensionrange.options_ = extensionrangeoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
		return extensionrangeoptions;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$3602(DescriptorProtos$DescriptorProto$ExtensionRange descriptorprotos$descriptorproto$extensionrange, int i)
	{
		descriptorprotos$descriptorproto$extensionrange.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #85  <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$DescriptorProto$ExtensionRange()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #55  <Field byte memoizedIsInitialized>
		start_ = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #57  <Field int start_>
		end_ = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #59  <Field int end_>
	//   11   19:return          
	}

	private DescriptorProtos$DescriptorProto$ExtensionRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder1;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void DescriptorProtos$DescriptorProto$ExtensionRange()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #66  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #67  <Method void NullPointerException()>
	//    7   15:athrow          
		builder1 = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #73  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//    9   19:astore          6
		flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L11:
		if(flag) goto _L2; else goto _L1
	//   12   23:iload_3         
	//   13   24:ifne            210
_L1:
		int i = codedinputstream.readTag();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #79  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 4: default 261
	//	               0: 264
	//	               8: 94
	//	               16: 115
	//	               26: 136;
	//   18   35:lookupswitch    4: default 261
	//	               0: 264
	//	               8: 94
	//	               16: 115
	//	               26: 136
		   goto _L3 _L4 _L5 _L6 _L7
_L3:
		if(!parseUnknownField(codedinputstream, builder1, extensionregistrylite, i))
	//*  19   76:aload_0         
	//*  20   77:aload_1         
	//*  21   78:aload           6
	//*  22   80:aload_2         
	//*  23   81:iload           4
	//*  24   83:invokevirtual   #83  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25   86:ifne            207
			flag = true;
	//   26   89:iconst_1        
	//   27   90:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28   91:goto            207
_L5:
		bitField0_ = bitField0_ | 1;
	//   29   94:aload_0         
	//   30   95:aload_0         
	//   31   96:getfield        #85  <Field int bitField0_>
	//   32   99:iconst_1        
	//   33  100:ior             
	//   34  101:putfield        #85  <Field int bitField0_>
		start_ = codedinputstream.readInt32();
	//   35  104:aload_0         
	//   36  105:aload_1         
	//   37  106:invokevirtual   #88  <Method int CodedInputStream.readInt32()>
	//   38  109:putfield        #57  <Field int start_>
		continue; /* Loop/switch isn't completed */
	//   39  112:goto            207
_L6:
		bitField0_ = bitField0_ | 2;
	//   40  115:aload_0         
	//   41  116:aload_0         
	//   42  117:getfield        #85  <Field int bitField0_>
	//   43  120:iconst_2        
	//   44  121:ior             
	//   45  122:putfield        #85  <Field int bitField0_>
		end_ = codedinputstream.readInt32();
	//   46  125:aload_0         
	//   47  126:aload_1         
	//   48  127:invokevirtual   #88  <Method int CodedInputStream.readInt32()>
	//   49  130:putfield        #59  <Field int end_>
		continue; /* Loop/switch isn't completed */
	//   50  133:goto            207
_L7:
		DescriptorProtos.ExtensionRangeOptions.Builder builder = null;
	//   51  136:aconst_null     
	//   52  137:astore          5
		if((bitField0_ & 4) == 4)
	//*  53  139:aload_0         
	//*  54  140:getfield        #85  <Field int bitField0_>
	//*  55  143:iconst_4        
	//*  56  144:iand            
	//*  57  145:iconst_4        
	//*  58  146:icmpne          158
			builder = options_.toBuilder();
	//   59  149:aload_0         
	//   60  150:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
	//   61  153:invokevirtual   #96  <Method DescriptorProtos$ExtensionRangeOptions$Builder DescriptorProtos$ExtensionRangeOptions.toBuilder()>
	//   62  156:astore          5
		options_ = (DescriptorProtos.ExtensionRangeOptions)codedinputstream.readMessage(DescriptorProtos.ExtensionRangeOptions.PARSER, extensionregistrylite);
	//   63  158:aload_0         
	//   64  159:aload_1         
	//   65  160:getstatic       #97  <Field Parser DescriptorProtos$ExtensionRangeOptions.PARSER>
	//   66  163:aload_2         
	//   67  164:invokevirtual   #101 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//   68  167:checkcast       #92  <Class DescriptorProtos$ExtensionRangeOptions>
	//   69  170:putfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
		if(builder == null) goto _L9; else goto _L8
	//   70  173:aload           5
	//   71  175:ifnull          197
_L8:
		builder.mergeFrom(options_);
	//   72  178:aload           5
	//   73  180:aload_0         
	//   74  181:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
	//   75  184:invokevirtual   #107 <Method DescriptorProtos$ExtensionRangeOptions$Builder DescriptorProtos$ExtensionRangeOptions$Builder.mergeFrom(DescriptorProtos$ExtensionRangeOptions)>
	//   76  187:pop             
		options_ = builder.buildPartial();
	//   77  188:aload_0         
	//   78  189:aload           5
	//   79  191:invokevirtual   #111 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions$Builder.buildPartial()>
	//   80  194:putfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
_L9:
		bitField0_ = bitField0_ | 4;
	//   81  197:aload_0         
	//   82  198:aload_0         
	//   83  199:getfield        #85  <Field int bitField0_>
	//   84  202:iconst_4        
	//   85  203:ior             
	//   86  204:putfield        #85  <Field int bitField0_>
		continue; /* Loop/switch isn't completed */
	//   87  207:goto            23
_L2:
		unknownFields = builder1.build();
	//   88  210:aload_0         
	//   89  211:aload           6
	//   90  213:invokevirtual   #117 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   91  216:putfield        #121 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   92  219:aload_0         
	//   93  220:invokevirtual   #124 <Method void makeExtensionsImmutable()>
		return;
	//   94  223:return          
		codedinputstream;
	//   95  224:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   96  225:aload_1         
	//   97  226:aload_0         
	//   98  227:invokevirtual   #128 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   99  230:athrow          
		codedinputstream;
	//  100  231:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  101  232:new             #62  <Class InvalidProtocolBufferException>
	//  102  235:dup             
	//  103  236:aload_1         
	//  104  237:invokespecial   #131 <Method void InvalidProtocolBufferException(IOException)>
	//  105  240:aload_0         
	//  106  241:invokevirtual   #128 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  107  244:athrow          
		codedinputstream;
	//  108  245:astore_1        
		unknownFields = builder1.build();
	//  109  246:aload_0         
	//  110  247:aload           6
	//  111  249:invokevirtual   #117 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  112  252:putfield        #121 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  113  255:aload_0         
	//  114  256:invokevirtual   #124 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  115  259:aload_1         
	//  116  260:athrow          
	//* 117  261:goto            76
_L4:
		flag = true;
	//  118  264:iconst_1        
	//  119  265:istore_3        
		if(true) goto _L11; else goto _L10
	//  120  266:goto            207
_L10:
	}

	DescriptorProtos$DescriptorProto$ExtensionRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #135 <Method void DescriptorProtos$DescriptorProto$ExtensionRange(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$DescriptorProto$ExtensionRange(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #138 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #55  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$DescriptorProto$ExtensionRange(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method void DescriptorProtos$DescriptorProto$ExtensionRange(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
