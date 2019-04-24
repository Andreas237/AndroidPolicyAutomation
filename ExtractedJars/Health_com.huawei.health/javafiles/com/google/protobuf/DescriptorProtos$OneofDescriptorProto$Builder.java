// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, SingleFieldBuilderV3, GeneratedMessageV3, ByteString, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$OneofDescriptorProto$Builder extends GeneratedMessageV3.Builder
	implements 
{

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$8600();
	//    0    0:invokestatic    #48  <Method Descriptors$Descriptor DescriptorProtos.access$8600()>
	//    1    3:areturn         
	}

	private SingleFieldBuilderV3 getOptionsFieldBuilder()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       35
		{
			optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//    3    7:aload_0         
	//    4    8:new             #54  <Class SingleFieldBuilderV3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #58  <Method DescriptorProtos$OneofOptions getOptions()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #62  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #66  <Method boolean isClean()>
	//   12   24:invokespecial   #69  <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
	//   13   27:putfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
			options_ = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
		}
		return optionsBuilder_;
	//   17   35:aload_0         
	//   18   36:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   19   39:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #77  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getOptionsFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #79  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$OneofDescriptorProto$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$OneofDescriptorProto$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #84  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #86  <Method DescriptorProtos$OneofDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #86  <Method DescriptorProtos$OneofDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos.OneofDescriptorProto build()
	{
		DescriptorProtos.OneofDescriptorProto oneofdescriptorproto = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method DescriptorProtos$OneofDescriptorProto buildPartial()>
	//    2    4:astore_1        
		if(!oneofdescriptorproto.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #95  <Method boolean DescriptorProtos$OneofDescriptorProto.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (oneofdescriptorproto)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #99  <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return oneofdescriptorproto;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method DescriptorProtos$OneofDescriptorProto build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method DescriptorProtos$OneofDescriptorProto build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.OneofDescriptorProto buildPartial()
	{
		DescriptorProtos.OneofDescriptorProto oneofdescriptorproto = new DescriptorProtos.OneofDescriptorProto(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$OneofDescriptorProto>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #106 <Method void DescriptorProtos$OneofDescriptorProto(GeneratedMessageV3$Builder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #108 <Field int bitField0_>
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
		DescriptorProtos.OneofDescriptorProto.access$9102(oneofdescriptorproto, name_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #30  <Field Object name_>
	//   21   33:invokestatic    #112 <Method Object DescriptorProtos$OneofDescriptorProto.access$9102(DescriptorProtos$OneofDescriptorProto, Object)>
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
		if(optionsBuilder_ == null)
	//*  34   50:aload_0         
	//*  35   51:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*  36   54:ifnonnull       70
			DescriptorProtos.OneofDescriptorProto.access$9202(oneofdescriptorproto, options_);
	//   37   57:aload           4
	//   38   59:aload_0         
	//   39   60:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
	//   40   63:invokestatic    #116 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofDescriptorProto.access$9202(DescriptorProtos$OneofDescriptorProto, DescriptorProtos$OneofOptions)>
	//   41   66:pop             
		else
	//*  42   67:goto            86
			DescriptorProtos.OneofDescriptorProto.access$9202(oneofdescriptorproto, (DescriptorProtos.OneofOptions)optionsBuilder_.build());
	//   43   70:aload           4
	//   44   72:aload_0         
	//   45   73:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   46   76:invokevirtual   #119 <Method AbstractMessage SingleFieldBuilderV3.build()>
	//   47   79:checkcast       #121 <Class DescriptorProtos$OneofOptions>
	//   48   82:invokestatic    #116 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofDescriptorProto.access$9202(DescriptorProtos$OneofDescriptorProto, DescriptorProtos$OneofOptions)>
	//   49   85:pop             
		DescriptorProtos.OneofDescriptorProto.access$9302(oneofdescriptorproto, j);
	//   50   86:aload           4
	//   51   88:iload_2         
	//   52   89:invokestatic    #125 <Method int DescriptorProtos$OneofDescriptorProto.access$9302(DescriptorProtos$OneofDescriptorProto, int)>
	//   53   92:pop             
		onBuilt();
	//   54   93:aload_0         
	//   55   94:invokevirtual   #128 <Method void onBuilt()>
		return oneofdescriptorproto;
	//   56   97:aload           4
	//   57   99:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method DescriptorProtos$OneofDescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method DescriptorProtos$OneofDescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method DescriptorProtos$OneofDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #136 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #28  <String "">
	//    5    8:putfield        #30  <Field Object name_>
		bitField0_ = bitField0_ & -2;
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #108 <Field int bitField0_>
	//    9   16:bipush          -2
	//   10   18:iand            
	//   11   19:putfield        #108 <Field int bitField0_>
		if(optionsBuilder_ == null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*  14   26:ifnonnull       37
			options_ = null;
	//   15   29:aload_0         
	//   16   30:aconst_null     
	//   17   31:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
		else
	//*  18   34:goto            45
			optionsBuilder_.clear();
	//   19   37:aload_0         
	//   20   38:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   21   41:invokevirtual   #138 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//   22   44:pop             
		bitField0_ = bitField0_ & -3;
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #108 <Field int bitField0_>
	//   26   50:bipush          -3
	//   27   52:iand            
	//   28   53:putfield        #108 <Field int bitField0_>
		return this;
	//   29   56:aload_0         
	//   30   57:areturn         
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method DescriptorProtos$OneofDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method DescriptorProtos$OneofDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method DescriptorProtos$OneofDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$OneofDescriptorProto$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #145 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #147 <Method DescriptorProtos$OneofDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #147 <Method DescriptorProtos$OneofDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder clearName()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #108 <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #108 <Field int bitField0_>
		name_ = ((Object) (DescriptorProtos.OneofDescriptorProto.getDefaultInstance().getName()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #152 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #156 <Method String DescriptorProtos$OneofDescriptorProto.getName()>
	//    9   18:putfield        #30  <Field Object name_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #159 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #164 <Method DescriptorProtos$OneofDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$OneofDescriptorProto$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #167 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #164 <Method DescriptorProtos$OneofDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #164 <Method DescriptorProtos$OneofDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder clearOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       19
		{
			options_ = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
			onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #159 <Method void onChanged()>
		} else
	//*   8   16:goto            27
		{
			optionsBuilder_.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   11   23:invokevirtual   #138 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//   12   26:pop             
		}
		bitField0_ = bitField0_ & -3;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #108 <Field int bitField0_>
	//   16   32:bipush          -3
	//   17   34:iand            
	//   18   35:putfield        #108 <Field int bitField0_>
		return this;
	//   19   38:aload_0         
	//   20   39:areturn         
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder clone()
	{
		return (DescriptorProtos$OneofDescriptorProto$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.OneofDescriptorProto getDefaultInstanceForType()
	{
		return DescriptorProtos.OneofDescriptorProto.getDefaultInstance();
	//    0    0:invokestatic    #152 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #182 <Method DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #182 <Method DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$8600();
	//    0    0:invokestatic    #48  <Method Descriptors$Descriptor DescriptorProtos.access$8600()>
	//    1    3:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object name_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #185 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #187 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #190 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #193 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				name_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #30  <Field Object name_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #185 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #185 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #185 <Class String>
	//    8   16:invokestatic    #199 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #30  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #187 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.OneofOptions getOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       23
		{
			if(options_ == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
	//*   5   11:ifnonnull       18
				return DescriptorProtos.OneofOptions.getDefaultInstance();
	//    6   14:invokestatic    #201 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
	//    7   17:areturn         
			else
				return options_;
	//    8   18:aload_0         
	//    9   19:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
	//   10   22:areturn         
		} else
		{
			return (DescriptorProtos.OneofOptions)optionsBuilder_.getMessage();
	//   11   23:aload_0         
	//   12   24:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   13   27:invokevirtual   #204 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
	//   14   30:checkcast       #121 <Class DescriptorProtos$OneofOptions>
	//   15   33:areturn         
		}
	}

	public DescriptorProtos.OneofOptions.Builder getOptionsBuilder()
	{
		bitField0_ = bitField0_ | 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #108 <Field int bitField0_>
	//    3    5:iconst_2        
	//    4    6:ior             
	//    5    7:putfield        #108 <Field int bitField0_>
		onChanged();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #159 <Method void onChanged()>
		return (DescriptorProtos.OneofOptions.Builder)getOptionsFieldBuilder().getBuilder();
	//    8   14:aload_0         
	//    9   15:invokespecial   #79  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//   10   18:invokevirtual   #209 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
	//   11   21:checkcast       #211 <Class DescriptorProtos$OneofOptions$Builder>
	//   12   24:areturn         
	}

	public DescriptorProtos.OneofOptionsOrBuilder getOptionsOrBuilder()
	{
		if(optionsBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnull          18
			return (DescriptorProtos.OneofOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//    5   11:invokevirtual   #217 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
	//    6   14:checkcast       #219 <Class DescriptorProtos$OneofOptionsOrBuilder>
	//    7   17:areturn         
		if(options_ == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
	//*  10   22:ifnonnull       29
			return ((DescriptorProtos.OneofOptionsOrBuilder) (DescriptorProtos.OneofOptions.getDefaultInstance()));
	//   11   25:invokestatic    #201 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
	//   12   28:areturn         
		else
			return ((DescriptorProtos.OneofOptionsOrBuilder) (options_));
	//   13   29:aload_0         
	//   14   30:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
	//   15   33:areturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasOptions()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$8700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$OneofDescriptorProto, com/google/protobuf/DescriptorProtos$OneofDescriptorProto$Builder);
	//    0    0:invokestatic    #226 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$8700()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$OneofDescriptorProto>
	//    2    5:ldc1            #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    3    7:invokevirtual   #232 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		return !hasOptions() || getOptions().isInitialized();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #234 <Method boolean hasOptions()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #58  <Method DescriptorProtos$OneofOptions getOptions()>
	//    5   11:invokevirtual   #235 <Method boolean DescriptorProtos$OneofOptions.isInitialized()>
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
	//    3    3:invokevirtual   #242 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #246 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #242 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.OneofDescriptorProto)DescriptorProtos.OneofDescriptorProto.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #253 <Field Parser DescriptorProtos$OneofDescriptorProto.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #259 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$OneofDescriptorProto>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.OneofDescriptorProto) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #262 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(DescriptorProtos$OneofDescriptorProto)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #265 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$OneofDescriptorProto>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #269 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #262 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(DescriptorProtos$OneofDescriptorProto)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.OneofDescriptorProto)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.OneofDescriptorProto) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
	{
		if(oneofdescriptorproto == DescriptorProtos.OneofDescriptorProto.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #152 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(oneofdescriptorproto.hasName())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #271 <Method boolean DescriptorProtos$OneofDescriptorProto.hasName()>
	//*   7   13:ifeq            38
		{
			bitField0_ = bitField0_ | 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #108 <Field int bitField0_>
	//   11   21:iconst_1        
	//   12   22:ior             
	//   13   23:putfield        #108 <Field int bitField0_>
			name_ = DescriptorProtos.OneofDescriptorProto.access$9100(oneofdescriptorproto);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokestatic    #275 <Method Object DescriptorProtos$OneofDescriptorProto.access$9100(DescriptorProtos$OneofDescriptorProto)>
	//   17   31:putfield        #30  <Field Object name_>
			onChanged();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #159 <Method void onChanged()>
		}
		if(oneofdescriptorproto.hasOptions())
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #276 <Method boolean DescriptorProtos$OneofDescriptorProto.hasOptions()>
	//*  22   42:ifeq            54
			mergeOptions(oneofdescriptorproto.getOptions());
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #277 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofDescriptorProto.getOptions()>
	//   26   50:invokevirtual   #281 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeOptions(DescriptorProtos$OneofOptions)>
	//   27   53:pop             
		mergeUnknownFields(oneofdescriptorproto.unknownFields);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #285 <Field UnknownFieldSet DescriptorProtos$OneofDescriptorProto.unknownFields>
	//   31   59:invokevirtual   #289 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//   32   62:pop             
		onChanged();
	//   33   63:aload_0         
	//   34   64:invokevirtual   #159 <Method void onChanged()>
		return this;
	//   35   67:aload_0         
	//   36   68:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.OneofDescriptorProto)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$OneofDescriptorProto>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.OneofDescriptorProto)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$OneofDescriptorProto>
	//    6   12:invokevirtual   #262 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(DescriptorProtos$OneofDescriptorProto)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #291 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #242 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #246 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #242 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder mergeOptions(DescriptorProtos.OneofOptions oneofoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       67
		{
			if((bitField0_ & 2) == 2 && options_ != null && options_ != DescriptorProtos.OneofOptions.getDefaultInstance())
	//*   3    7:aload_0         
	//*   4    8:getfield        #108 <Field int bitField0_>
	//*   5   11:iconst_2        
	//*   6   12:iand            
	//*   7   13:iconst_2        
	//*   8   14:icmpne          55
	//*   9   17:aload_0         
	//*  10   18:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
	//*  11   21:ifnull          55
	//*  12   24:aload_0         
	//*  13   25:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
	//*  14   28:invokestatic    #201 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
	//*  15   31:if_acmpeq       55
				options_ = DescriptorProtos.OneofOptions.newBuilder(options_).mergeFrom(oneofoptions).buildPartial();
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
	//   19   39:invokestatic    #298 <Method DescriptorProtos$OneofOptions$Builder DescriptorProtos$OneofOptions.newBuilder(DescriptorProtos$OneofOptions)>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #300 <Method DescriptorProtos$OneofOptions$Builder DescriptorProtos$OneofOptions$Builder.mergeFrom(DescriptorProtos$OneofOptions)>
	//   22   46:invokevirtual   #302 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions$Builder.buildPartial()>
	//   23   49:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
			else
	//*  24   52:goto            60
				options_ = oneofoptions;
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
			onChanged();
	//   28   60:aload_0         
	//   29   61:invokevirtual   #159 <Method void onChanged()>
		} else
	//*  30   64:goto            76
		{
			optionsBuilder_.mergeFrom(((AbstractMessage) (oneofoptions)));
	//   31   67:aload_0         
	//   32   68:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   33   71:aload_1         
	//   34   72:invokevirtual   #305 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
	//   35   75:pop             
		}
		bitField0_ = bitField0_ | 2;
	//   36   76:aload_0         
	//   37   77:aload_0         
	//   38   78:getfield        #108 <Field int bitField0_>
	//   39   81:iconst_2        
	//   40   82:ior             
	//   41   83:putfield        #108 <Field int bitField0_>
		return this;
	//   42   86:aload_0         
	//   43   87:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #289 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$OneofDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$OneofDescriptorProto$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #309 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #289 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #289 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$OneofDescriptorProto$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #313 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #315 <Method DescriptorProtos$OneofDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #315 <Method DescriptorProtos$OneofDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder setName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #319 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #320 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #108 <Field int bitField0_>
			name_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #30  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #159 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$OneofDescriptorProto$Builder setNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #319 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #320 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #108 <Field int bitField0_>
			name_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #30  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #159 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$OneofDescriptorProto$Builder setOptions(DescriptorProtos.OneofOptions.Builder builder)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       22
		{
			options_ = builder.build();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #326 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions$Builder.build()>
	//    6   12:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
			onChanged();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #159 <Method void onChanged()>
		} else
	//*   9   19:goto            34
		{
			optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
	//   10   22:aload_0         
	//   11   23:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #326 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions$Builder.build()>
	//   14   30:invokevirtual   #329 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   15   33:pop             
		}
		bitField0_ = bitField0_ | 2;
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #108 <Field int bitField0_>
	//   19   39:iconst_2        
	//   20   40:ior             
	//   21   41:putfield        #108 <Field int bitField0_>
		return this;
	//   22   44:aload_0         
	//   23   45:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder setOptions(DescriptorProtos.OneofOptions oneofoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       31
		{
			if(oneofoptions == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
				throw new NullPointerException();
	//    5   11:new             #319 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #320 <Method void NullPointerException()>
	//    8   18:athrow          
			options_ = oneofoptions;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
			onChanged();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #159 <Method void onChanged()>
		} else
	//*  14   28:goto            40
		{
			optionsBuilder_.setMessage(((AbstractMessage) (oneofoptions)));
	//   15   31:aload_0         
	//   16   32:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #329 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   19   39:pop             
		}
		bitField0_ = bitField0_ | 2;
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #108 <Field int bitField0_>
	//   23   45:iconst_2        
	//   24   46:ior             
	//   25   47:putfield        #108 <Field int bitField0_>
		return this;
	//   26   50:aload_0         
	//   27   51:areturn         
	}

	public DescriptorProtos$OneofDescriptorProto$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$OneofDescriptorProto$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #334 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #336 <Method DescriptorProtos$OneofDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #336 <Method DescriptorProtos$OneofDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public final DescriptorProtos$OneofDescriptorProto$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$OneofDescriptorProto$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #340 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #342 <Method DescriptorProtos$OneofDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #342 <Method DescriptorProtos$OneofDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private Object name_;
	private SingleFieldBuilderV3 optionsBuilder_;
	private DescriptorProtos.OneofOptions options_;

	private DescriptorProtos$OneofDescriptorProto$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void GeneratedMessageV3$Builder()>
		name_ = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <String "">
	//    4    7:putfield        #30  <Field Object name_>
		options_ = null;
	//    5   10:aload_0         
	//    6   11:aconst_null     
	//    7   12:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
		maybeForceBuilderInitialization();
	//    8   15:aload_0         
	//    9   16:invokespecial   #35  <Method void maybeForceBuilderInitialization()>
	//   10   19:return          
	}

	DescriptorProtos$OneofDescriptorProto$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void DescriptorProtos$OneofDescriptorProto$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$OneofDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #28  <String "">
	//    5    8:putfield        #30  <Field Object name_>
		options_ = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
		maybeForceBuilderInitialization();
	//    9   16:aload_0         
	//   10   17:invokespecial   #35  <Method void maybeForceBuilderInitialization()>
	//   11   20:return          
	}

	DescriptorProtos$OneofDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void DescriptorProtos$OneofDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
