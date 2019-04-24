// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, SingleFieldBuilderV3, GeneratedMessageV3, InvalidProtocolBufferException, 
//			Parser, Message, MessageLite, CodedInputStream, 
//			ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$DescriptorProto$ExtensionRange$Builder extends GeneratedMessageV3.Builder
	implements 
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)super.addRepeatedField(fielddescriptor, obj);
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
		DescriptorProtos.DescriptorProto.ExtensionRange.access$3302(extensionrange, start_);
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
		DescriptorProtos.DescriptorProto.ExtensionRange.access$3402(extensionrange, end_);
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
			DescriptorProtos.DescriptorProto.ExtensionRange.access$3502(extensionrange, options_);
	//   53   80:aload           4
	//   54   82:aload_0         
	//   55   83:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
	//   56   86:invokestatic    #122 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$DescriptorProto$ExtensionRange.access$3502(DescriptorProtos$DescriptorProto$ExtensionRange, DescriptorProtos$ExtensionRangeOptions)>
	//   57   89:pop             
		else
	//*  58   90:goto            109
			DescriptorProtos.DescriptorProto.ExtensionRange.access$3502(extensionrange, (DescriptorProtos.ExtensionRangeOptions)optionsBuilder_.build());
	//   59   93:aload           4
	//   60   95:aload_0         
	//   61   96:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   62   99:invokevirtual   #125 <Method AbstractMessage SingleFieldBuilderV3.build()>
	//   63  102:checkcast       #127 <Class DescriptorProtos$ExtensionRangeOptions>
	//   64  105:invokestatic    #122 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$DescriptorProto$ExtensionRange.access$3502(DescriptorProtos$DescriptorProto$ExtensionRange, DescriptorProtos$ExtensionRangeOptions)>
	//   65  108:pop             
		DescriptorProtos.DescriptorProto.ExtensionRange.access$3602(extensionrange, j);
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clear()
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearEnd()
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)super.clearField(fielddescriptor);
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)super.clearOneof(oneofdescriptor);
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearOptions()
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearStart()
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)super.clone();
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(DescriptorProtos.DescriptorProto.ExtensionRange extensionrange)
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(Message message)
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeOptions(DescriptorProtos.ExtensionRangeOptions extensionrangeoptions)
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

	public final DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)super.mergeUnknownFields(unknownfieldset);
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setEnd(int i)
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)super.setField(fielddescriptor, obj);
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setOptions(DescriptorProtos.ExtensionRangeOptions.Builder builder)
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setOptions(DescriptorProtos.ExtensionRangeOptions extensionrangeoptions)
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

	public DescriptorProtos$DescriptorProto$ExtensionRange$Builder setStart(int i)
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

	public final DescriptorProtos$DescriptorProto$ExtensionRange$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)super.setUnknownFields(unknownfieldset);
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

	private DescriptorProtos$DescriptorProto$ExtensionRange$Builder()
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

	DescriptorProtos$DescriptorProto$ExtensionRange$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$DescriptorProto$ExtensionRange$Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	DescriptorProtos$DescriptorProto$ExtensionRange$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
