// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DescriptorProtos, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, Parser, ByteString, CodedOutputStream, 
//			ExtensionRegistryLite, Message, MessageLite, SingleFieldBuilderV3, 
//			AbstractParser

public static final class DescriptorProtos$EnumValueDescriptorProto extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.EnumValueDescriptorProtoOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$11600();
		//    0    0:invokestatic    #49  <Method Descriptors$Descriptor DescriptorProtos.access$11600()>
		//    1    3:areturn         
		}

		private SingleFieldBuilderV3 getOptionsFieldBuilder()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       35
			{
				optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//    3    7:aload_0         
		//    4    8:new             #55  <Class SingleFieldBuilderV3>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokevirtual   #59  <Method DescriptorProtos$EnumValueOptions getOptions()>
		//    8   16:aload_0         
		//    9   17:invokevirtual   #63  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   10   20:aload_0         
		//   11   21:invokevirtual   #67  <Method boolean isClean()>
		//   12   24:invokespecial   #70  <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
		//   13   27:putfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
				options_ = null;
		//   14   30:aload_0         
		//   15   31:aconst_null     
		//   16   32:putfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
			}
			return optionsBuilder_;
		//   17   35:aload_0         
		//   18   36:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   19   39:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #78  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            11
				getOptionsFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #80  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//    4   10:pop             
		//    5   11:return          
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #85  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #87  <Method DescriptorProtos$EnumValueDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #87  <Method DescriptorProtos$EnumValueDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public DescriptorProtos.EnumValueDescriptorProto build()
		{
			DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #93  <Method DescriptorProtos$EnumValueDescriptorProto buildPartial()>
		//    2    4:astore_1        
			if(!enumvaluedescriptorproto.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #96  <Method boolean DescriptorProtos$EnumValueDescriptorProto.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (enumvaluedescriptorproto)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #100 <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return enumvaluedescriptorproto;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$EnumValueDescriptorProto build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$EnumValueDescriptorProto build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.EnumValueDescriptorProto buildPartial()
		{
			DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto = new DescriptorProtos.EnumValueDescriptorProto(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #9   <Class DescriptorProtos$EnumValueDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #107 <Method void DescriptorProtos$EnumValueDescriptorProto(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #109 <Field int bitField0_>
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
			enumvaluedescriptorproto.name_ = name_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #31  <Field Object name_>
		//   21   33:invokestatic    #113 <Method Object DescriptorProtos$EnumValueDescriptorProto.access$12102(DescriptorProtos$EnumValueDescriptorProto, Object)>
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
			enumvaluedescriptorproto.number_ = number_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #115 <Field int number_>
		//   37   56:invokestatic    #119 <Method int DescriptorProtos$EnumValueDescriptorProto.access$12202(DescriptorProtos$EnumValueDescriptorProto, int)>
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
		//*  51   74:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  52   77:ifnonnull       93
				enumvaluedescriptorproto.options_ = options_;
		//   53   80:aload           4
		//   54   82:aload_0         
		//   55   83:getfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
		//   56   86:invokestatic    #123 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueDescriptorProto.access$12302(DescriptorProtos$EnumValueDescriptorProto, DescriptorProtos$EnumValueOptions)>
		//   57   89:pop             
			else
		//*  58   90:goto            109
				enumvaluedescriptorproto.options_ = (DescriptorProtos.EnumValueOptions)optionsBuilder_.build();
		//   59   93:aload           4
		//   60   95:aload_0         
		//   61   96:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   62   99:invokevirtual   #126 <Method AbstractMessage SingleFieldBuilderV3.build()>
		//   63  102:checkcast       #128 <Class DescriptorProtos$EnumValueOptions>
		//   64  105:invokestatic    #123 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueDescriptorProto.access$12302(DescriptorProtos$EnumValueDescriptorProto, DescriptorProtos$EnumValueOptions)>
		//   65  108:pop             
			enumvaluedescriptorproto.bitField0_ = j;
		//   66  109:aload           4
		//   67  111:iload_2         
		//   68  112:invokestatic    #131 <Method int DescriptorProtos$EnumValueDescriptorProto.access$12402(DescriptorProtos$EnumValueDescriptorProto, int)>
		//   69  115:pop             
			onBuilt();
		//   70  116:aload_0         
		//   71  117:invokevirtual   #134 <Method void onBuilt()>
			return enumvaluedescriptorproto;
		//   72  120:aload           4
		//   73  122:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #93  <Method DescriptorProtos$EnumValueDescriptorProto buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #93  <Method DescriptorProtos$EnumValueDescriptorProto buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #139 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #142 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			name_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #29  <String "">
		//    5    8:putfield        #31  <Field Object name_>
			bitField0_ = bitField0_ & -2;
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:getfield        #109 <Field int bitField0_>
		//    9   16:bipush          -2
		//   10   18:iand            
		//   11   19:putfield        #109 <Field int bitField0_>
			number_ = 0;
		//   12   22:aload_0         
		//   13   23:iconst_0        
		//   14   24:putfield        #115 <Field int number_>
			bitField0_ = bitField0_ & -3;
		//   15   27:aload_0         
		//   16   28:aload_0         
		//   17   29:getfield        #109 <Field int bitField0_>
		//   18   32:bipush          -3
		//   19   34:iand            
		//   20   35:putfield        #109 <Field int bitField0_>
			if(optionsBuilder_ == null)
		//*  21   38:aload_0         
		//*  22   39:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  23   42:ifnonnull       53
				options_ = null;
		//   24   45:aload_0         
		//   25   46:aconst_null     
		//   26   47:putfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
			else
		//*  27   50:goto            61
				optionsBuilder_.clear();
		//   28   53:aload_0         
		//   29   54:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   30   57:invokevirtual   #144 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   31   60:pop             
			bitField0_ = bitField0_ & -5;
		//   32   61:aload_0         
		//   33   62:aload_0         
		//   34   63:getfield        #109 <Field int bitField0_>
		//   35   66:bipush          -5
		//   36   68:iand            
		//   37   69:putfield        #109 <Field int bitField0_>
			return this;
		//   38   72:aload_0         
		//   39   73:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #139 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #139 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #139 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #151 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #153 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #153 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearName()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #109 <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #109 <Field int bitField0_>
			name_ = ((Object) (DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance().getName()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #158 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance()>
		//    8   15:invokevirtual   #162 <Method String DescriptorProtos$EnumValueDescriptorProto.getName()>
		//    9   18:putfield        #31  <Field Object name_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #165 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public Builder clearNumber()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #109 <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #109 <Field int bitField0_>
			number_ = 0;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #115 <Field int number_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #165 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #171 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #174 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #171 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #171 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       19
			{
				options_ = null;
		//    3    7:aload_0         
		//    4    8:aconst_null     
		//    5    9:putfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
				onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #165 <Method void onChanged()>
			} else
		//*   8   16:goto            27
			{
				optionsBuilder_.clear();
		//    9   19:aload_0         
		//   10   20:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   11   23:invokevirtual   #144 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   12   26:pop             
			}
			bitField0_ = bitField0_ & -5;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #109 <Field int bitField0_>
		//   16   32:bipush          -5
		//   17   34:iand            
		//   18   35:putfield        #109 <Field int bitField0_>
			return this;
		//   19   38:aload_0         
		//   20   39:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #179 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #179 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #182 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #179 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #179 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #179 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #179 <Method DescriptorProtos$EnumValueDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.EnumValueDescriptorProto getDefaultInstanceForType()
		{
			return DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance();
		//    0    0:invokestatic    #158 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #189 <Method DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #189 <Method DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$11600();
		//    0    0:invokestatic    #49  <Method Descriptors$Descriptor DescriptorProtos.access$11600()>
		//    1    3:areturn         
		}

		public String getName()
		{
			Object obj = name_;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Object name_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #192 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #194 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #197 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #200 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					name_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #31  <Field Object name_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #192 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getNameBytes()
		{
			Object obj = name_;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Object name_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #192 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #192 <Class String>
		//    8   16:invokestatic    #206 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				name_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #31  <Field Object name_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #194 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public int getNumber()
		{
			return number_;
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field int number_>
		//    2    4:ireturn         
		}

		public DescriptorProtos.EnumValueOptions getOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       23
			{
				if(options_ == null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
		//*   5   11:ifnonnull       18
					return DescriptorProtos.EnumValueOptions.getDefaultInstance();
		//    6   14:invokestatic    #210 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions.getDefaultInstance()>
		//    7   17:areturn         
				else
					return options_;
		//    8   18:aload_0         
		//    9   19:getfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
		//   10   22:areturn         
			} else
			{
				return (DescriptorProtos.EnumValueOptions)optionsBuilder_.getMessage();
		//   11   23:aload_0         
		//   12   24:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   13   27:invokevirtual   #213 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
		//   14   30:checkcast       #128 <Class DescriptorProtos$EnumValueOptions>
		//   15   33:areturn         
			}
		}

		public DescriptorProtos.EnumValueOptions.Builder getOptionsBuilder()
		{
			bitField0_ = bitField0_ | 4;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #109 <Field int bitField0_>
		//    3    5:iconst_4        
		//    4    6:ior             
		//    5    7:putfield        #109 <Field int bitField0_>
			onChanged();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #165 <Method void onChanged()>
			return (DescriptorProtos.EnumValueOptions.Builder)getOptionsFieldBuilder().getBuilder();
		//    8   14:aload_0         
		//    9   15:invokespecial   #80  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//   10   18:invokevirtual   #218 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
		//   11   21:checkcast       #220 <Class DescriptorProtos$EnumValueOptions$Builder>
		//   12   24:areturn         
		}

		public DescriptorProtos.EnumValueOptionsOrBuilder getOptionsOrBuilder()
		{
			if(optionsBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnull          18
				return (DescriptorProtos.EnumValueOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
		//    3    7:aload_0         
		//    4    8:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//    5   11:invokevirtual   #226 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
		//    6   14:checkcast       #228 <Class DescriptorProtos$EnumValueOptionsOrBuilder>
		//    7   17:areturn         
			if(options_ == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
		//*  10   22:ifnonnull       29
				return ((DescriptorProtos.EnumValueOptionsOrBuilder) (DescriptorProtos.EnumValueOptions.getDefaultInstance()));
		//   11   25:invokestatic    #210 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions.getDefaultInstance()>
		//   12   28:areturn         
			else
				return ((DescriptorProtos.EnumValueOptionsOrBuilder) (options_));
		//   13   29:aload_0         
		//   14   30:getfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
		//   15   33:areturn         
		}

		public boolean hasName()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field int bitField0_>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasNumber()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field int bitField0_>
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
		//    1    1:getfield        #109 <Field int bitField0_>
		//    2    4:iconst_4        
		//    3    5:iand            
		//    4    6:iconst_4        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$11700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumValueDescriptorProto, com/google/protobuf/DescriptorProtos$EnumValueDescriptorProto$Builder);
		//    0    0:invokestatic    #236 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$11700()>
		//    1    3:ldc1            #9   <Class DescriptorProtos$EnumValueDescriptorProto>
		//    2    5:ldc1            #2   <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    3    7:invokevirtual   #242 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			return !hasOptions() || getOptions().isInitialized();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #244 <Method boolean hasOptions()>
		//    2    4:ifeq            19
		//    3    7:aload_0         
		//    4    8:invokevirtual   #59  <Method DescriptorProtos$EnumValueOptions getOptions()>
		//    5   11:invokevirtual   #245 <Method boolean DescriptorProtos$EnumValueOptions.isInitialized()>
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
		//    3    3:invokevirtual   #252 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #256 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #252 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumValueDescriptorProto)DescriptorProtos.EnumValueDescriptorProto.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #263 <Field Parser DescriptorProtos$EnumValueDescriptorProto.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #269 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class DescriptorProtos$EnumValueDescriptorProto>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.EnumValueDescriptorProto) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #272 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(DescriptorProtos$EnumValueDescriptorProto)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #275 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class DescriptorProtos$EnumValueDescriptorProto>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #279 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #272 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(DescriptorProtos$EnumValueDescriptorProto)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumValueDescriptorProto)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.EnumValueDescriptorProto) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
		{
			if(enumvaluedescriptorproto == DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #158 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(enumvaluedescriptorproto.hasName())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #281 <Method boolean DescriptorProtos$EnumValueDescriptorProto.hasName()>
		//*   7   13:ifeq            38
			{
				bitField0_ = bitField0_ | 1;
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #109 <Field int bitField0_>
		//   11   21:iconst_1        
		//   12   22:ior             
		//   13   23:putfield        #109 <Field int bitField0_>
				name_ = enumvaluedescriptorproto.name_;
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokestatic    #285 <Method Object DescriptorProtos$EnumValueDescriptorProto.access$12100(DescriptorProtos$EnumValueDescriptorProto)>
		//   17   31:putfield        #31  <Field Object name_>
				onChanged();
		//   18   34:aload_0         
		//   19   35:invokevirtual   #165 <Method void onChanged()>
			}
			if(enumvaluedescriptorproto.hasNumber())
		//*  20   38:aload_1         
		//*  21   39:invokevirtual   #287 <Method boolean DescriptorProtos$EnumValueDescriptorProto.hasNumber()>
		//*  22   42:ifeq            54
				setNumber(enumvaluedescriptorproto.getNumber());
		//   23   45:aload_0         
		//   24   46:aload_1         
		//   25   47:invokevirtual   #289 <Method int DescriptorProtos$EnumValueDescriptorProto.getNumber()>
		//   26   50:invokevirtual   #293 <Method DescriptorProtos$EnumValueDescriptorProto$Builder setNumber(int)>
		//   27   53:pop             
			if(enumvaluedescriptorproto.hasOptions())
		//*  28   54:aload_1         
		//*  29   55:invokevirtual   #294 <Method boolean DescriptorProtos$EnumValueDescriptorProto.hasOptions()>
		//*  30   58:ifeq            70
				mergeOptions(enumvaluedescriptorproto.getOptions());
		//   31   61:aload_0         
		//   32   62:aload_1         
		//   33   63:invokevirtual   #295 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueDescriptorProto.getOptions()>
		//   34   66:invokevirtual   #299 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeOptions(DescriptorProtos$EnumValueOptions)>
		//   35   69:pop             
			mergeUnknownFields(enumvaluedescriptorproto.unknownFields);
		//   36   70:aload_0         
		//   37   71:aload_1         
		//   38   72:getfield        #303 <Field UnknownFieldSet DescriptorProtos$EnumValueDescriptorProto.unknownFields>
		//   39   75:invokevirtual   #307 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//   40   78:pop             
			onChanged();
		//   41   79:aload_0         
		//   42   80:invokevirtual   #165 <Method void onChanged()>
			return this;
		//   43   83:aload_0         
		//   44   84:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.EnumValueDescriptorProto)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class DescriptorProtos$EnumValueDescriptorProto>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.EnumValueDescriptorProto)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class DescriptorProtos$EnumValueDescriptorProto>
		//    6   12:invokevirtual   #272 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(DescriptorProtos$EnumValueDescriptorProto)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #309 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #252 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #256 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #252 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeOptions(DescriptorProtos.EnumValueOptions enumvalueoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       67
			{
				if((bitField0_ & 4) == 4 && options_ != null && options_ != DescriptorProtos.EnumValueOptions.getDefaultInstance())
		//*   3    7:aload_0         
		//*   4    8:getfield        #109 <Field int bitField0_>
		//*   5   11:iconst_4        
		//*   6   12:iand            
		//*   7   13:iconst_4        
		//*   8   14:icmpne          55
		//*   9   17:aload_0         
		//*  10   18:getfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
		//*  11   21:ifnull          55
		//*  12   24:aload_0         
		//*  13   25:getfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
		//*  14   28:invokestatic    #210 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions.getDefaultInstance()>
		//*  15   31:if_acmpeq       55
					options_ = DescriptorProtos.EnumValueOptions.newBuilder(options_).mergeFrom(enumvalueoptions).buildPartial();
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
		//   19   39:invokestatic    #316 <Method DescriptorProtos$EnumValueOptions$Builder DescriptorProtos$EnumValueOptions.newBuilder(DescriptorProtos$EnumValueOptions)>
		//   20   42:aload_1         
		//   21   43:invokevirtual   #318 <Method DescriptorProtos$EnumValueOptions$Builder DescriptorProtos$EnumValueOptions$Builder.mergeFrom(DescriptorProtos$EnumValueOptions)>
		//   22   46:invokevirtual   #320 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions$Builder.buildPartial()>
		//   23   49:putfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
				else
		//*  24   52:goto            60
					options_ = enumvalueoptions;
		//   25   55:aload_0         
		//   26   56:aload_1         
		//   27   57:putfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
				onChanged();
		//   28   60:aload_0         
		//   29   61:invokevirtual   #165 <Method void onChanged()>
			} else
		//*  30   64:goto            76
			{
				optionsBuilder_.mergeFrom(((AbstractMessage) (enumvalueoptions)));
		//   31   67:aload_0         
		//   32   68:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   33   71:aload_1         
		//   34   72:invokevirtual   #323 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
		//   35   75:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   36   76:aload_0         
		//   37   77:aload_0         
		//   38   78:getfield        #109 <Field int bitField0_>
		//   39   81:iconst_4        
		//   40   82:ior             
		//   41   83:putfield        #109 <Field int bitField0_>
			return this;
		//   42   86:aload_0         
		//   43   87:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #307 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #327 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #307 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #307 <Method DescriptorProtos$EnumValueDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #331 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #333 <Method DescriptorProtos$EnumValueDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #333 <Method DescriptorProtos$EnumValueDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setName(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #337 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #338 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #109 <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #109 <Field int bitField0_>
				name_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #31  <Field Object name_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #165 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setNameBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #337 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #338 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #109 <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #109 <Field int bitField0_>
				name_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #31  <Field Object name_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #165 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setNumber(int i)
		{
			bitField0_ = bitField0_ | 2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #109 <Field int bitField0_>
		//    3    5:iconst_2        
		//    4    6:ior             
		//    5    7:putfield        #109 <Field int bitField0_>
			number_ = i;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #115 <Field int number_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #165 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public Builder setOptions(DescriptorProtos.EnumValueOptions.Builder builder)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       22
			{
				options_ = builder.build();
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #344 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions$Builder.build()>
		//    6   12:putfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
				onChanged();
		//    7   15:aload_0         
		//    8   16:invokevirtual   #165 <Method void onChanged()>
			} else
		//*   9   19:goto            34
			{
				optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
		//   10   22:aload_0         
		//   11   23:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #344 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions$Builder.build()>
		//   14   30:invokevirtual   #347 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   15   33:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #109 <Field int bitField0_>
		//   19   39:iconst_4        
		//   20   40:ior             
		//   21   41:putfield        #109 <Field int bitField0_>
			return this;
		//   22   44:aload_0         
		//   23   45:areturn         
		}

		public Builder setOptions(DescriptorProtos.EnumValueOptions enumvalueoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       31
			{
				if(enumvalueoptions == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
					throw new NullPointerException();
		//    5   11:new             #337 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #338 <Method void NullPointerException()>
		//    8   18:athrow          
				options_ = enumvalueoptions;
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:putfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
				onChanged();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #165 <Method void onChanged()>
			} else
		//*  14   28:goto            40
			{
				optionsBuilder_.setMessage(((AbstractMessage) (enumvalueoptions)));
		//   15   31:aload_0         
		//   16   32:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #347 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   19   39:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   20   40:aload_0         
		//   21   41:aload_0         
		//   22   42:getfield        #109 <Field int bitField0_>
		//   23   45:iconst_4        
		//   24   46:ior             
		//   25   47:putfield        #109 <Field int bitField0_>
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
		//    4    4:invokespecial   #352 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #354 <Method DescriptorProtos$EnumValueDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #354 <Method DescriptorProtos$EnumValueDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #358 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #360 <Method DescriptorProtos$EnumValueDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #360 <Method DescriptorProtos$EnumValueDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private Object name_;
		private int number_;
		private SingleFieldBuilderV3 optionsBuilder_;
		private DescriptorProtos.EnumValueOptions options_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void GeneratedMessageV3$Builder()>
			name_ = "";
		//    2    4:aload_0         
		//    3    5:ldc1            #29  <String "">
		//    4    7:putfield        #31  <Field Object name_>
			options_ = null;
		//    5   10:aload_0         
		//    6   11:aconst_null     
		//    7   12:putfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
			maybeForceBuilderInitialization();
		//    8   15:aload_0         
		//    9   16:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
		//   10   19:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void DescriptorProtos$EnumValueDescriptorProto$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			name_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #29  <String "">
		//    5    8:putfield        #31  <Field Object name_>
			options_ = null;
		//    6   11:aload_0         
		//    7   12:aconst_null     
		//    8   13:putfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
			maybeForceBuilderInitialization();
		//    9   16:aload_0         
		//   10   17:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
		//   11   20:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #44  <Method void DescriptorProtos$EnumValueDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$EnumValueDescriptorProto getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #46  <Field DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$11600();
	//    0    0:invokestatic    #162 <Method Descriptors$Descriptor DescriptorProtos.access$11600()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #46  <Field DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #165 <Method DescriptorProtos$EnumValueDescriptorProto$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$EnumValueDescriptorProto descriptorprotos$enumvaluedescriptorproto)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$enumvaluedescriptorproto);
	//    0    0:getstatic       #46  <Field DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #165 <Method DescriptorProtos$EnumValueDescriptorProto$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #168 <Method DescriptorProtos$EnumValueDescriptorProto$Builder DescriptorProtos$EnumValueDescriptorProto$Builder.mergeFrom(DescriptorProtos$EnumValueDescriptorProto)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #174 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #178 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #185 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #189 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #194 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #198 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #200 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #202 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #206 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #210 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #214 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueDescriptorProto)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #218 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #49  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$EnumValueDescriptorProto))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #225 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$EnumValueDescriptorProto)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasName() == ((DescriptorProtos$EnumValueDescriptorProto) (obj)).hasName())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #229 <Method boolean hasName()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #229 <Method boolean hasName()>
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
		if(hasName())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #229 <Method boolean hasName()>
	//*  31   53:ifeq            81
			if(flag && getName().equals(((Object) (((DescriptorProtos$EnumValueDescriptorProto) (obj)).getName()))))
	//*  32   56:iload_2         
	//*  33   57:ifeq            79
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #233 <Method String getName()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #233 <Method String getName()>
	//*  38   68:invokevirtual   #236 <Method boolean String.equals(Object)>
	//*  39   71:ifeq            79
				flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
			else
	//*  42   76:goto            81
				flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if(flag1 && hasNumber() == ((DescriptorProtos$EnumValueDescriptorProto) (obj)).hasNumber())
	//*  45   81:iload_3         
	//*  46   82:ifeq            101
	//*  47   85:aload_0         
	//*  48   86:invokevirtual   #239 <Method boolean hasNumber()>
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #239 <Method boolean hasNumber()>
	//*  51   93:icmpne          101
			flag = true;
	//   52   96:iconst_1        
	//   53   97:istore_2        
		else
	//*  54   98:goto            103
			flag = false;
	//   55  101:iconst_0        
	//   56  102:istore_2        
		flag1 = flag;
	//   57  103:iload_2         
	//   58  104:istore_3        
		if(hasNumber())
	//*  59  105:aload_0         
	//*  60  106:invokevirtual   #239 <Method boolean hasNumber()>
	//*  61  109:ifeq            134
			if(flag && getNumber() == ((DescriptorProtos$EnumValueDescriptorProto) (obj)).getNumber())
	//*  62  112:iload_2         
	//*  63  113:ifeq            132
	//*  64  116:aload_0         
	//*  65  117:invokevirtual   #242 <Method int getNumber()>
	//*  66  120:aload_1         
	//*  67  121:invokevirtual   #242 <Method int getNumber()>
	//*  68  124:icmpne          132
				flag1 = true;
	//   69  127:iconst_1        
	//   70  128:istore_3        
			else
	//*  71  129:goto            134
				flag1 = false;
	//   72  132:iconst_0        
	//   73  133:istore_3        
		if(flag1 && hasOptions() == ((DescriptorProtos$EnumValueDescriptorProto) (obj)).hasOptions())
	//*  74  134:iload_3         
	//*  75  135:ifeq            154
	//*  76  138:aload_0         
	//*  77  139:invokevirtual   #245 <Method boolean hasOptions()>
	//*  78  142:aload_1         
	//*  79  143:invokevirtual   #245 <Method boolean hasOptions()>
	//*  80  146:icmpne          154
			flag = true;
	//   81  149:iconst_1        
	//   82  150:istore_2        
		else
	//*  83  151:goto            156
			flag = false;
	//   84  154:iconst_0        
	//   85  155:istore_2        
		flag1 = flag;
	//   86  156:iload_2         
	//   87  157:istore_3        
		if(hasOptions())
	//*  88  158:aload_0         
	//*  89  159:invokevirtual   #245 <Method boolean hasOptions()>
	//*  90  162:ifeq            190
			if(flag && getOptions().equals(((Object) (((DescriptorProtos$EnumValueDescriptorProto) (obj)).getOptions()))))
	//*  91  165:iload_2         
	//*  92  166:ifeq            188
	//*  93  169:aload_0         
	//*  94  170:invokevirtual   #248 <Method DescriptorProtos$EnumValueOptions getOptions()>
	//*  95  173:aload_1         
	//*  96  174:invokevirtual   #248 <Method DescriptorProtos$EnumValueOptions getOptions()>
	//*  97  177:invokevirtual   #249 <Method boolean DescriptorProtos$EnumValueOptions.equals(Object)>
	//*  98  180:ifeq            188
				flag1 = true;
	//   99  183:iconst_1        
	//  100  184:istore_3        
			else
	//* 101  185:goto            190
				flag1 = false;
	//  102  188:iconst_0        
	//  103  189:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$EnumValueDescriptorProto) (obj)).unknownFields)));
	//  104  190:iload_3         
	//  105  191:ifeq            210
	//  106  194:aload_0         
	//  107  195:getfield        #125 <Field UnknownFieldSet unknownFields>
	//  108  198:aload_1         
	//  109  199:getfield        #125 <Field UnknownFieldSet unknownFields>
	//  110  202:invokevirtual   #250 <Method boolean UnknownFieldSet.equals(Object)>
	//  111  205:ifeq            210
	//  112  208:iconst_1        
	//  113  209:ireturn         
	//  114  210:iconst_0        
	//  115  211:ireturn         
	}

	public DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #46  <Field DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method DescriptorProtos$EnumValueDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #235 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #235 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #257 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #260 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #263 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			name_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #57  <Field Object name_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #235 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #235 <Class String>
	//    8   16:invokestatic    #268 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #57  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #257 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public int getNumber()
	{
		return number_;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int number_>
	//    2    4:ireturn         
	}

	public DescriptorProtos.EnumValueOptions getOptions()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field DescriptorProtos$EnumValueOptions options_>
	//*   2    4:ifnonnull       11
			return DescriptorProtos.EnumValueOptions.getDefaultInstance();
	//    3    7:invokestatic    #270 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return options_;
	//    5   11:aload_0         
	//    6   12:getfield        #94  <Field DescriptorProtos$EnumValueOptions options_>
	//    7   15:areturn         
	}

	public  getOptionsOrBuilder()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field DescriptorProtos$EnumValueOptions options_>
	//*   2    4:ifnonnull       11
			return (() (DescriptorProtos.EnumValueOptions.getDefaultInstance()));
	//    3    7:invokestatic    #270 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return (() (options_));
	//    5   11:aload_0         
	//    6   12:getfield        #94  <Field DescriptorProtos$EnumValueOptions options_>
	//    7   15:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #277 <Field int memoizedSize>
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
	//*  11   15:getfield        #89  <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			j = GeneratedMessageV3.computeStringSize(1, name_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #57  <Field Object name_>
	//   19   29:invokestatic    #281 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_2        
		i = j;
	//   23   35:iload_2         
	//   24   36:istore_1        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #89  <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          58
			i = j + CodedOutputStream.computeInt32Size(2, number_);
	//   31   47:iload_2         
	//   32   48:iconst_2        
	//   33   49:aload_0         
	//   34   50:getfield        #59  <Field int number_>
	//   35   53:invokestatic    #287 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//   36   56:iadd            
	//   37   57:istore_1        
		j = i;
	//   38   58:iload_1         
	//   39   59:istore_2        
		if((bitField0_ & 4) == 4)
	//*  40   60:aload_0         
	//*  41   61:getfield        #89  <Field int bitField0_>
	//*  42   64:iconst_4        
	//*  43   65:iand            
	//*  44   66:iconst_4        
	//*  45   67:icmpne          81
			j = i + CodedOutputStream.computeMessageSize(3, ((MessageLite) (getOptions())));
	//   46   70:iload_1         
	//   47   71:iconst_3        
	//   48   72:aload_0         
	//   49   73:invokevirtual   #248 <Method DescriptorProtos$EnumValueOptions getOptions()>
	//   50   76:invokestatic    #291 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   51   79:iadd            
	//   52   80:istore_2        
		i = j + unknownFields.getSerializedSize();
	//   53   81:iload_2         
	//   54   82:aload_0         
	//   55   83:getfield        #125 <Field UnknownFieldSet unknownFields>
	//   56   86:invokevirtual   #293 <Method int UnknownFieldSet.getSerializedSize()>
	//   57   89:iadd            
	//   58   90:istore_1        
		memoizedSize = i;
	//   59   91:aload_0         
	//   60   92:iload_1         
	//   61   93:putfield        #277 <Field int memoizedSize>
		return i;
	//   62   96:iload_1         
	//   63   97:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasNumber()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int bitField0_>
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
	//    1    1:getfield        #89  <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
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
	//*   1    1:getfield        #298 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #298 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #300 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #304 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasName())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #229 <Method boolean hasName()>
	//*  15   29:ifeq            50
			i = (j * 37 + 1) * 53 + getName().hashCode();
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #233 <Method String getName()>
	//   25   45:invokevirtual   #305 <Method int String.hashCode()>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(hasNumber())
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #239 <Method boolean hasNumber()>
	//*  32   56:ifeq            74
			j = (i * 37 + 2) * 53 + getNumber();
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_2        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #242 <Method int getNumber()>
	//   42   72:iadd            
	//   43   73:istore_2        
		i = j;
	//   44   74:iload_2         
	//   45   75:istore_1        
		if(hasOptions())
	//*  46   76:aload_0         
	//*  47   77:invokevirtual   #245 <Method boolean hasOptions()>
	//*  48   80:ifeq            101
			i = (j * 37 + 3) * 53 + getOptions().hashCode();
	//   49   83:iload_2         
	//   50   84:bipush          37
	//   51   86:imul            
	//   52   87:iconst_3        
	//   53   88:iadd            
	//   54   89:bipush          53
	//   55   91:imul            
	//   56   92:aload_0         
	//   57   93:invokevirtual   #248 <Method DescriptorProtos$EnumValueOptions getOptions()>
	//   58   96:invokevirtual   #306 <Method int DescriptorProtos$EnumValueOptions.hashCode()>
	//   59   99:iadd            
	//   60  100:istore_1        
		i = i * 29 + unknownFields.hashCode();
	//   61  101:iload_1         
	//   62  102:bipush          29
	//   63  104:imul            
	//   64  105:aload_0         
	//   65  106:getfield        #125 <Field UnknownFieldSet unknownFields>
	//   66  109:invokevirtual   #307 <Method int UnknownFieldSet.hashCode()>
	//   67  112:iadd            
	//   68  113:istore_1        
		memoizedHashCode = i;
	//   69  114:aload_0         
	//   70  115:iload_1         
	//   71  116:putfield        #298 <Field int memoizedHashCode>
		return i;
	//   72  119:iload_1         
	//   73  120:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$11700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumValueDescriptorProto, com/google/protobuf/DescriptorProtos$EnumValueDescriptorProto$Builder);
	//    0    0:invokestatic    #312 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$11700()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    2    5:ldc1            #13  <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
	//    3    7:invokevirtual   #318 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field byte memoizedIsInitialized>
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
	//*  13   19:invokevirtual   #245 <Method boolean hasOptions()>
	//*  14   22:ifeq            42
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #248 <Method DescriptorProtos$EnumValueOptions getOptions()>
	//*  17   29:invokevirtual   #321 <Method boolean DescriptorProtos$EnumValueOptions.isInitialized()>
	//*  18   32:ifne            42
		{
			memoizedIsInitialized = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #53  <Field byte memoizedIsInitialized>
			return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   24   42:aload_0         
	//   25   43:iconst_1        
	//   26   44:putfield        #53  <Field byte memoizedIsInitialized>
			return true;
	//   27   47:iconst_1        
	//   28   48:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #324 <Method DescriptorProtos$EnumValueDescriptorProto$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #13  <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #328 <Method void DescriptorProtos$EnumValueDescriptorProto$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #331 <Method DescriptorProtos$EnumValueDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #334 <Method DescriptorProtos$EnumValueDescriptorProto$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #331 <Method DescriptorProtos$EnumValueDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #46  <Field DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #13  <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #338 <Method void DescriptorProtos$EnumValueDescriptorProto$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #13  <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #338 <Method void DescriptorProtos$EnumValueDescriptorProto$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #168 <Method DescriptorProtos$EnumValueDescriptorProto$Builder DescriptorProtos$EnumValueDescriptorProto$Builder.mergeFrom(DescriptorProtos$EnumValueDescriptorProto)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method DescriptorProtos$EnumValueDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method DescriptorProtos$EnumValueDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			GeneratedMessageV3.writeString(codedoutputstream, 1, name_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #57  <Field Object name_>
	//   10   16:invokestatic    #344 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 2) == 2)
	//*  11   19:aload_0         
	//*  12   20:getfield        #89  <Field int bitField0_>
	//*  13   23:iconst_2        
	//*  14   24:iand            
	//*  15   25:iconst_2        
	//*  16   26:icmpne          38
			codedoutputstream.writeInt32(2, number_);
	//   17   29:aload_1         
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:getfield        #59  <Field int number_>
	//   21   35:invokevirtual   #348 <Method void CodedOutputStream.writeInt32(int, int)>
		if((bitField0_ & 4) == 4)
	//*  22   38:aload_0         
	//*  23   39:getfield        #89  <Field int bitField0_>
	//*  24   42:iconst_4        
	//*  25   43:iand            
	//*  26   44:iconst_4        
	//*  27   45:icmpne          57
			codedoutputstream.writeMessage(3, ((MessageLite) (getOptions())));
	//   28   48:aload_1         
	//   29   49:iconst_3        
	//   30   50:aload_0         
	//   31   51:invokevirtual   #248 <Method DescriptorProtos$EnumValueOptions getOptions()>
	//   32   54:invokevirtual   #352 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		unknownFields.writeTo(codedoutputstream);
	//   33   57:aload_0         
	//   34   58:getfield        #125 <Field UnknownFieldSet unknownFields>
	//   35   61:aload_1         
	//   36   62:invokevirtual   #354 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   37   65:return          
	}

	private static final DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE = new DescriptorProtos$EnumValueDescriptorProto();
	public static final int NAME_FIELD_NUMBER = 1;
	public static final int NUMBER_FIELD_NUMBER = 2;
	public static final int OPTIONS_FIELD_NUMBER = 3;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.EnumValueDescriptorProto parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.EnumValueDescriptorProto(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$EnumValueDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$EnumValueDescriptorProto(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$EnumValueDescriptorProto parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private byte memoizedIsInitialized;
	private volatile Object name_;
	private int number_;
	private DescriptorProtos.EnumValueOptions options_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$EnumValueDescriptorProto>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void DescriptorProtos$EnumValueDescriptorProto()>
	//    3    7:putstatic       #46  <Field DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE>
	//    4   10:new             #11  <Class DescriptorProtos$EnumValueDescriptorProto$1>
	//    5   13:dup             
	//    6   14:invokespecial   #47  <Method void DescriptorProtos$EnumValueDescriptorProto$1()>
	//    7   17:putstatic       #49  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$12100(DescriptorProtos$EnumValueDescriptorProto descriptorprotos$enumvaluedescriptorproto)
	{
		return descriptorprotos$enumvaluedescriptorproto.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object name_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$12102(DescriptorProtos$EnumValueDescriptorProto descriptorprotos$enumvaluedescriptorproto, Object obj)
	{
		descriptorprotos$enumvaluedescriptorproto.name_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field Object name_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$12202(DescriptorProtos$EnumValueDescriptorProto descriptorprotos$enumvaluedescriptorproto, int i)
	{
		descriptorprotos$enumvaluedescriptorproto.number_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int number_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static DescriptorProtos.EnumValueOptions access$12302(DescriptorProtos$EnumValueDescriptorProto descriptorprotos$enumvaluedescriptorproto, DescriptorProtos.EnumValueOptions enumvalueoptions)
	{
		descriptorprotos$enumvaluedescriptorproto.options_ = enumvalueoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field DescriptorProtos$EnumValueOptions options_>
		return enumvalueoptions;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$12402(DescriptorProtos$EnumValueDescriptorProto descriptorprotos$enumvaluedescriptorproto, int i)
	{
		descriptorprotos$enumvaluedescriptorproto.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$EnumValueDescriptorProto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #53  <Field byte memoizedIsInitialized>
		name_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #55  <String "">
	//    7   12:putfield        #57  <Field Object name_>
		number_ = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #59  <Field int number_>
	//   11   20:return          
	}

	private DescriptorProtos$EnumValueDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void DescriptorProtos$EnumValueDescriptorProto()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #66  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #67  <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #73  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//    9   19:astore          6
		flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L11:
		if(flag) goto _L2; else goto _L1
	//   12   23:iload_3         
	//   13   24:ifne            214
_L1:
		int i = codedinputstream.readTag();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #79  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 4: default 265
	//	               0: 268
	//	               10: 94
	//	               16: 119
	//	               26: 140;
	//   18   35:lookupswitch    4: default 265
	//	               0: 268
	//	               10: 94
	//	               16: 119
	//	               26: 140
		   goto _L3 _L4 _L5 _L6 _L7
_L3:
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
	//*  19   76:aload_0         
	//*  20   77:aload_1         
	//*  21   78:aload           6
	//*  22   80:aload_2         
	//*  23   81:iload           4
	//*  24   83:invokevirtual   #83  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25   86:ifne            211
			flag = true;
	//   26   89:iconst_1        
	//   27   90:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28   91:goto            211
_L5:
		ByteString bytestring = codedinputstream.readBytes();
	//   29   94:aload_1         
	//   30   95:invokevirtual   #87  <Method ByteString CodedInputStream.readBytes()>
	//   31   98:astore          5
		bitField0_ = bitField0_ | 1;
	//   32  100:aload_0         
	//   33  101:aload_0         
	//   34  102:getfield        #89  <Field int bitField0_>
	//   35  105:iconst_1        
	//   36  106:ior             
	//   37  107:putfield        #89  <Field int bitField0_>
		name_ = ((Object) (bytestring));
	//   38  110:aload_0         
	//   39  111:aload           5
	//   40  113:putfield        #57  <Field Object name_>
		continue; /* Loop/switch isn't completed */
	//   41  116:goto            211
_L6:
		bitField0_ = bitField0_ | 2;
	//   42  119:aload_0         
	//   43  120:aload_0         
	//   44  121:getfield        #89  <Field int bitField0_>
	//   45  124:iconst_2        
	//   46  125:ior             
	//   47  126:putfield        #89  <Field int bitField0_>
		number_ = codedinputstream.readInt32();
	//   48  129:aload_0         
	//   49  130:aload_1         
	//   50  131:invokevirtual   #92  <Method int CodedInputStream.readInt32()>
	//   51  134:putfield        #59  <Field int number_>
		continue; /* Loop/switch isn't completed */
	//   52  137:goto            211
_L7:
		DescriptorProtos$EnumValueOptions$Builder descriptorprotos$enumvalueoptions$builder = null;
	//   53  140:aconst_null     
	//   54  141:astore          5
		if((bitField0_ & 4) == 4)
	//*  55  143:aload_0         
	//*  56  144:getfield        #89  <Field int bitField0_>
	//*  57  147:iconst_4        
	//*  58  148:iand            
	//*  59  149:iconst_4        
	//*  60  150:icmpne          162
			descriptorprotos$enumvalueoptions$builder = options_.toBuilder();
	//   61  153:aload_0         
	//   62  154:getfield        #94  <Field DescriptorProtos$EnumValueOptions options_>
	//   63  157:invokevirtual   #100 <Method DescriptorProtos$EnumValueOptions$Builder DescriptorProtos$EnumValueOptions.toBuilder()>
	//   64  160:astore          5
		options_ = (DescriptorProtos.EnumValueOptions)codedinputstream.readMessage(DescriptorProtos.EnumValueOptions.PARSER, extensionregistrylite);
	//   65  162:aload_0         
	//   66  163:aload_1         
	//   67  164:getstatic       #101 <Field Parser DescriptorProtos$EnumValueOptions.PARSER>
	//   68  167:aload_2         
	//   69  168:invokevirtual   #105 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//   70  171:checkcast       #96  <Class DescriptorProtos$EnumValueOptions>
	//   71  174:putfield        #94  <Field DescriptorProtos$EnumValueOptions options_>
		if(descriptorprotos$enumvalueoptions$builder == null) goto _L9; else goto _L8
	//   72  177:aload           5
	//   73  179:ifnull          201
_L8:
		descriptorprotos$enumvalueoptions$builder.mergeFrom(options_);
	//   74  182:aload           5
	//   75  184:aload_0         
	//   76  185:getfield        #94  <Field DescriptorProtos$EnumValueOptions options_>
	//   77  188:invokevirtual   #111 <Method DescriptorProtos$EnumValueOptions$Builder DescriptorProtos$EnumValueOptions$Builder.mergeFrom(DescriptorProtos$EnumValueOptions)>
	//   78  191:pop             
		options_ = descriptorprotos$enumvalueoptions$builder.buildPartial();
	//   79  192:aload_0         
	//   80  193:aload           5
	//   81  195:invokevirtual   #115 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions$Builder.buildPartial()>
	//   82  198:putfield        #94  <Field DescriptorProtos$EnumValueOptions options_>
_L9:
		bitField0_ = bitField0_ | 4;
	//   83  201:aload_0         
	//   84  202:aload_0         
	//   85  203:getfield        #89  <Field int bitField0_>
	//   86  206:iconst_4        
	//   87  207:ior             
	//   88  208:putfield        #89  <Field int bitField0_>
		continue; /* Loop/switch isn't completed */
	//   89  211:goto            23
_L2:
		unknownFields = builder.build();
	//   90  214:aload_0         
	//   91  215:aload           6
	//   92  217:invokevirtual   #121 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   93  220:putfield        #125 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   94  223:aload_0         
	//   95  224:invokevirtual   #128 <Method void makeExtensionsImmutable()>
		return;
	//   96  227:return          
		codedinputstream;
	//   97  228:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   98  229:aload_1         
	//   99  230:aload_0         
	//  100  231:invokevirtual   #132 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  101  234:athrow          
		codedinputstream;
	//  102  235:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  103  236:new             #62  <Class InvalidProtocolBufferException>
	//  104  239:dup             
	//  105  240:aload_1         
	//  106  241:invokespecial   #135 <Method void InvalidProtocolBufferException(IOException)>
	//  107  244:aload_0         
	//  108  245:invokevirtual   #132 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  109  248:athrow          
		codedinputstream;
	//  110  249:astore_1        
		unknownFields = builder.build();
	//  111  250:aload_0         
	//  112  251:aload           6
	//  113  253:invokevirtual   #121 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  114  256:putfield        #125 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  115  259:aload_0         
	//  116  260:invokevirtual   #128 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  117  263:aload_1         
	//  118  264:athrow          
	//* 119  265:goto            76
_L4:
		flag = true;
	//  120  268:iconst_1        
	//  121  269:istore_3        
		if(true) goto _L11; else goto _L10
	//  122  270:goto            211
_L10:
	}

	DescriptorProtos$EnumValueDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #139 <Method void DescriptorProtos$EnumValueDescriptorProto(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$EnumValueDescriptorProto(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #53  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$EnumValueDescriptorProto(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #146 <Method void DescriptorProtos$EnumValueDescriptorProto(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
