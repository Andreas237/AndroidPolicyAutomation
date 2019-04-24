// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, SingleFieldBuilderV3, GeneratedMessageV3, ByteString, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$EnumValueDescriptorProto$Builder extends GeneratedMessageV3.Builder
	implements 
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$EnumValueDescriptorProto$Builder)super.addRepeatedField(fielddescriptor, obj);
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
		DescriptorProtos.EnumValueDescriptorProto.access$12102(enumvaluedescriptorproto, name_);
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
		DescriptorProtos.EnumValueDescriptorProto.access$12202(enumvaluedescriptorproto, number_);
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
			DescriptorProtos.EnumValueDescriptorProto.access$12302(enumvaluedescriptorproto, options_);
	//   53   80:aload           4
	//   54   82:aload_0         
	//   55   83:getfield        #33  <Field DescriptorProtos$EnumValueOptions options_>
	//   56   86:invokestatic    #123 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueDescriptorProto.access$12302(DescriptorProtos$EnumValueDescriptorProto, DescriptorProtos$EnumValueOptions)>
	//   57   89:pop             
		else
	//*  58   90:goto            109
			DescriptorProtos.EnumValueDescriptorProto.access$12302(enumvaluedescriptorproto, (DescriptorProtos.EnumValueOptions)optionsBuilder_.build());
	//   59   93:aload           4
	//   60   95:aload_0         
	//   61   96:getfield        #53  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   62   99:invokevirtual   #126 <Method AbstractMessage SingleFieldBuilderV3.build()>
	//   63  102:checkcast       #128 <Class DescriptorProtos$EnumValueOptions>
	//   64  105:invokestatic    #123 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueDescriptorProto.access$12302(DescriptorProtos$EnumValueDescriptorProto, DescriptorProtos$EnumValueOptions)>
	//   65  108:pop             
		DescriptorProtos.EnumValueDescriptorProto.access$12402(enumvaluedescriptorproto, j);
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder clear()
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$EnumValueDescriptorProto$Builder)super.clearField(fielddescriptor);
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder clearName()
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder clearNumber()
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$EnumValueDescriptorProto$Builder)super.clearOneof(oneofdescriptor);
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder clearOptions()
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder clone()
	{
		return (DescriptorProtos$EnumValueDescriptorProto$Builder)super.clone();
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
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
			name_ = DescriptorProtos.EnumValueDescriptorProto.access$12100(enumvaluedescriptorproto);
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder mergeFrom(Message message)
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder mergeOptions(DescriptorProtos.EnumValueOptions enumvalueoptions)
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

	public final DescriptorProtos$EnumValueDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$EnumValueDescriptorProto$Builder)super.mergeUnknownFields(unknownfieldset);
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$EnumValueDescriptorProto$Builder)super.setField(fielddescriptor, obj);
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder setName(String s)
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder setNameBytes(ByteString bytestring)
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder setNumber(int i)
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder setOptions(DescriptorProtos.EnumValueOptions.Builder builder)
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder setOptions(DescriptorProtos.EnumValueOptions enumvalueoptions)
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

	public DescriptorProtos$EnumValueDescriptorProto$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$EnumValueDescriptorProto$Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

	public final DescriptorProtos$EnumValueDescriptorProto$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$EnumValueDescriptorProto$Builder)super.setUnknownFields(unknownfieldset);
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

	private DescriptorProtos$EnumValueDescriptorProto$Builder()
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

	DescriptorProtos$EnumValueDescriptorProto$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void DescriptorProtos$EnumValueDescriptorProto$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$EnumValueDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	DescriptorProtos$EnumValueDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void DescriptorProtos$EnumValueDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
