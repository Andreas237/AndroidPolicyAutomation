// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, RepeatedFieldBuilderV3, GeneratedMessageV3, ByteString, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$FileOptions$Builder extends GeneratedMessageV3$ExtendableBuilder
	implements 
{

	private void ensureUninterpretedOptionIsMutable()
	{
		if((bitField0_ & 0x40000) != 0x40000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field int bitField0_>
	//*   2    4:ldc1            #88  <Int 0x40000>
	//*   3    6:iand            
	//*   4    7:ldc1            #88  <Int 0x40000>
	//*   5    9:icmpeq          38
		{
			uninterpretedOption_ = ((List) (new ArrayList(((java.util.Collection) (uninterpretedOption_)))));
	//    6   12:aload_0         
	//    7   13:new             #90  <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #73  <Field List uninterpretedOption_>
	//   11   21:invokespecial   #93  <Method void ArrayList(java.util.Collection)>
	//   12   24:putfield        #73  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ | 0x40000;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #87  <Field int bitField0_>
	//   16   32:ldc1            #88  <Int 0x40000>
	//   17   34:ior             
	//   18   35:putfield        #87  <Field int bitField0_>
		}
	//   19   38:return          
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$14900();
	//    0    0:invokestatic    #98  <Method Descriptors$Descriptor DescriptorProtos.access$14900()>
	//    1    3:areturn         
	}

	private RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       57
		{
			List list = uninterpretedOption_;
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field List uninterpretedOption_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 0x40000) == 0x40000)
	//*   6   12:aload_0         
	//*   7   13:getfield        #87  <Field int bitField0_>
	//*   8   16:ldc1            #88  <Int 0x40000>
	//*   9   18:iand            
	//*  10   19:ldc1            #88  <Int 0x40000>
	//*  11   21:icmpne          29
				flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_1        
			else
	//*  14   26:goto            31
				flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_1        
			uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   31:aload_0         
	//   18   32:new             #104 <Class RepeatedFieldBuilderV3>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #108 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   42:aload_0         
	//   25   43:invokevirtual   #112 <Method boolean isClean()>
	//   26   46:invokespecial   #115 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   49:putfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			uninterpretedOption_ = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #73  <Field List uninterpretedOption_>
		}
		return uninterpretedOptionBuilder_;
	//   31   57:aload_0         
	//   32   58:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   33   61:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #122 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getUninterpretedOptionFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$FileOptions$Builder addAllUninterpretedOption(Iterable iterable)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, uninterpretedOption_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #73  <Field List uninterpretedOption_>
	//    8   16:invokestatic    #134 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #141 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$FileOptions$Builder)super.addExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #147 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (addExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #150 <Method DescriptorProtos$FileOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FileOptions$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FileOptions$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #155 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #158 <Method DescriptorProtos$FileOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #158 <Method DescriptorProtos$FileOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #158 <Method DescriptorProtos$FileOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FileOptions$Builder addUninterpretedOption(int i, Builder builder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #173 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   20   40:invokevirtual   #177 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(descriptorprotos$uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #180 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #181 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(i, ((Object) (descriptorprotos$uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #73  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #173 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #137 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (descriptorprotos$uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #177 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder addUninterpretedOption(Builder builder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field List uninterpretedOption_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//    9   19:invokeinterface #185 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   19   39:invokevirtual   #188 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(descriptorprotos$uninterpretedoption == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #180 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #181 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(((Object) (descriptorprotos$uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #73  <Field List uninterpretedOption_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #185 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #137 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (descriptorprotos$uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #188 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public Builder addUninterpretedOptionBuilder()
	{
		return (Builder)getUninterpretedOptionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos$UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokestatic    #196 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    3    7:invokevirtual   #200 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #163 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   13:areturn         
	}

	public Builder addUninterpretedOptionBuilder(int i)
	{
		return (Builder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos$UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #196 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    4    8:invokevirtual   #204 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #163 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos.FileOptions build()
	{
		DescriptorProtos.FileOptions fileoptions = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #208 <Method DescriptorProtos$FileOptions buildPartial()>
	//    2    4:astore_1        
		if(!fileoptions.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #211 <Method boolean DescriptorProtos$FileOptions.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (fileoptions)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #215 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return fileoptions;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #218 <Method DescriptorProtos$FileOptions build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #218 <Method DescriptorProtos$FileOptions build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.FileOptions buildPartial()
	{
		DescriptorProtos.FileOptions fileoptions = new DescriptorProtos.FileOptions(((GeneratedMessageV3$ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$FileOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #222 <Method void DescriptorProtos$FileOptions(GeneratedMessageV3$ExtendableBuilder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #87  <Field int bitField0_>
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
		DescriptorProtos.FileOptions.access$15402(fileoptions, javaPackage_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #49  <Field Object javaPackage_>
	//   21   33:invokestatic    #226 <Method Object DescriptorProtos$FileOptions.access$15402(DescriptorProtos$FileOptions, Object)>
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
		DescriptorProtos.FileOptions.access$15502(fileoptions, javaOuterClassname_);
	//   34   50:aload           4
	//   35   52:aload_0         
	//   36   53:getfield        #51  <Field Object javaOuterClassname_>
	//   37   56:invokestatic    #229 <Method Object DescriptorProtos$FileOptions.access$15502(DescriptorProtos$FileOptions, Object)>
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
		DescriptorProtos.FileOptions.access$15602(fileoptions, javaMultipleFiles_);
	//   50   73:aload           4
	//   51   75:aload_0         
	//   52   76:getfield        #231 <Field boolean javaMultipleFiles_>
	//   53   79:invokestatic    #235 <Method boolean DescriptorProtos$FileOptions.access$15602(DescriptorProtos$FileOptions, boolean)>
	//   54   82:pop             
		i = j;
	//   55   83:iload_2         
	//   56   84:istore_1        
		if((k & 8) == 8)
	//*  57   85:iload_3         
	//*  58   86:bipush          8
	//*  59   88:iand            
	//*  60   89:bipush          8
	//*  61   91:icmpne          99
			i = j | 8;
	//   62   94:iload_2         
	//   63   95:bipush          8
	//   64   97:ior             
	//   65   98:istore_1        
		DescriptorProtos.FileOptions.access$15702(fileoptions, javaGenerateEqualsAndHash_);
	//   66   99:aload           4
	//   67  101:aload_0         
	//   68  102:getfield        #237 <Field boolean javaGenerateEqualsAndHash_>
	//   69  105:invokestatic    #240 <Method boolean DescriptorProtos$FileOptions.access$15702(DescriptorProtos$FileOptions, boolean)>
	//   70  108:pop             
		j = i;
	//   71  109:iload_1         
	//   72  110:istore_2        
		if((k & 0x10) == 16)
	//*  73  111:iload_3         
	//*  74  112:bipush          16
	//*  75  114:iand            
	//*  76  115:bipush          16
	//*  77  117:icmpne          125
			j = i | 0x10;
	//   78  120:iload_1         
	//   79  121:bipush          16
	//   80  123:ior             
	//   81  124:istore_2        
		DescriptorProtos.FileOptions.access$15802(fileoptions, javaStringCheckUtf8_);
	//   82  125:aload           4
	//   83  127:aload_0         
	//   84  128:getfield        #242 <Field boolean javaStringCheckUtf8_>
	//   85  131:invokestatic    #245 <Method boolean DescriptorProtos$FileOptions.access$15802(DescriptorProtos$FileOptions, boolean)>
	//   86  134:pop             
		i = j;
	//   87  135:iload_2         
	//   88  136:istore_1        
		if((k & 0x20) == 32)
	//*  89  137:iload_3         
	//*  90  138:bipush          32
	//*  91  140:iand            
	//*  92  141:bipush          32
	//*  93  143:icmpne          151
			i = j | 0x20;
	//   94  146:iload_2         
	//   95  147:bipush          32
	//   96  149:ior             
	//   97  150:istore_1        
		DescriptorProtos.FileOptions.access$15902(fileoptions, optimizeFor_);
	//   98  151:aload           4
	//   99  153:aload_0         
	//  100  154:getfield        #53  <Field int optimizeFor_>
	//  101  157:invokestatic    #249 <Method int DescriptorProtos$FileOptions.access$15902(DescriptorProtos$FileOptions, int)>
	//  102  160:pop             
		j = i;
	//  103  161:iload_1         
	//  104  162:istore_2        
		if((k & 0x40) == 64)
	//* 105  163:iload_3         
	//* 106  164:bipush          64
	//* 107  166:iand            
	//* 108  167:bipush          64
	//* 109  169:icmpne          177
			j = i | 0x40;
	//  110  172:iload_1         
	//  111  173:bipush          64
	//  112  175:ior             
	//  113  176:istore_2        
		DescriptorProtos.FileOptions.access$16002(fileoptions, goPackage_);
	//  114  177:aload           4
	//  115  179:aload_0         
	//  116  180:getfield        #55  <Field Object goPackage_>
	//  117  183:invokestatic    #252 <Method Object DescriptorProtos$FileOptions.access$16002(DescriptorProtos$FileOptions, Object)>
	//  118  186:pop             
		i = j;
	//  119  187:iload_2         
	//  120  188:istore_1        
		if((k & 0x80) == 128)
	//* 121  189:iload_3         
	//* 122  190:sipush          128
	//* 123  193:iand            
	//* 124  194:sipush          128
	//* 125  197:icmpne          206
			i = j | 0x80;
	//  126  200:iload_2         
	//  127  201:sipush          128
	//  128  204:ior             
	//  129  205:istore_1        
		DescriptorProtos.FileOptions.access$16102(fileoptions, ccGenericServices_);
	//  130  206:aload           4
	//  131  208:aload_0         
	//  132  209:getfield        #254 <Field boolean ccGenericServices_>
	//  133  212:invokestatic    #257 <Method boolean DescriptorProtos$FileOptions.access$16102(DescriptorProtos$FileOptions, boolean)>
	//  134  215:pop             
		j = i;
	//  135  216:iload_1         
	//  136  217:istore_2        
		if((k & 0x100) == 256)
	//* 137  218:iload_3         
	//* 138  219:sipush          256
	//* 139  222:iand            
	//* 140  223:sipush          256
	//* 141  226:icmpne          235
			j = i | 0x100;
	//  142  229:iload_1         
	//  143  230:sipush          256
	//  144  233:ior             
	//  145  234:istore_2        
		DescriptorProtos.FileOptions.access$16202(fileoptions, javaGenericServices_);
	//  146  235:aload           4
	//  147  237:aload_0         
	//  148  238:getfield        #259 <Field boolean javaGenericServices_>
	//  149  241:invokestatic    #262 <Method boolean DescriptorProtos$FileOptions.access$16202(DescriptorProtos$FileOptions, boolean)>
	//  150  244:pop             
		i = j;
	//  151  245:iload_2         
	//  152  246:istore_1        
		if((k & 0x200) == 512)
	//* 153  247:iload_3         
	//* 154  248:sipush          512
	//* 155  251:iand            
	//* 156  252:sipush          512
	//* 157  255:icmpne          264
			i = j | 0x200;
	//  158  258:iload_2         
	//  159  259:sipush          512
	//  160  262:ior             
	//  161  263:istore_1        
		DescriptorProtos.FileOptions.access$16302(fileoptions, pyGenericServices_);
	//  162  264:aload           4
	//  163  266:aload_0         
	//  164  267:getfield        #264 <Field boolean pyGenericServices_>
	//  165  270:invokestatic    #267 <Method boolean DescriptorProtos$FileOptions.access$16302(DescriptorProtos$FileOptions, boolean)>
	//  166  273:pop             
		j = i;
	//  167  274:iload_1         
	//  168  275:istore_2        
		if((k & 0x400) == 1024)
	//* 169  276:iload_3         
	//* 170  277:sipush          1024
	//* 171  280:iand            
	//* 172  281:sipush          1024
	//* 173  284:icmpne          293
			j = i | 0x400;
	//  174  287:iload_1         
	//  175  288:sipush          1024
	//  176  291:ior             
	//  177  292:istore_2        
		DescriptorProtos.FileOptions.access$16402(fileoptions, phpGenericServices_);
	//  178  293:aload           4
	//  179  295:aload_0         
	//  180  296:getfield        #269 <Field boolean phpGenericServices_>
	//  181  299:invokestatic    #272 <Method boolean DescriptorProtos$FileOptions.access$16402(DescriptorProtos$FileOptions, boolean)>
	//  182  302:pop             
		i = j;
	//  183  303:iload_2         
	//  184  304:istore_1        
		if((k & 0x800) == 2048)
	//* 185  305:iload_3         
	//* 186  306:sipush          2048
	//* 187  309:iand            
	//* 188  310:sipush          2048
	//* 189  313:icmpne          322
			i = j | 0x800;
	//  190  316:iload_2         
	//  191  317:sipush          2048
	//  192  320:ior             
	//  193  321:istore_1        
		DescriptorProtos.FileOptions.access$16502(fileoptions, deprecated_);
	//  194  322:aload           4
	//  195  324:aload_0         
	//  196  325:getfield        #274 <Field boolean deprecated_>
	//  197  328:invokestatic    #277 <Method boolean DescriptorProtos$FileOptions.access$16502(DescriptorProtos$FileOptions, boolean)>
	//  198  331:pop             
		j = i;
	//  199  332:iload_1         
	//  200  333:istore_2        
		if((k & 0x1000) == 4096)
	//* 201  334:iload_3         
	//* 202  335:sipush          4096
	//* 203  338:iand            
	//* 204  339:sipush          4096
	//* 205  342:icmpne          351
			j = i | 0x1000;
	//  206  345:iload_1         
	//  207  346:sipush          4096
	//  208  349:ior             
	//  209  350:istore_2        
		DescriptorProtos.FileOptions.access$16602(fileoptions, ccEnableArenas_);
	//  210  351:aload           4
	//  211  353:aload_0         
	//  212  354:getfield        #279 <Field boolean ccEnableArenas_>
	//  213  357:invokestatic    #282 <Method boolean DescriptorProtos$FileOptions.access$16602(DescriptorProtos$FileOptions, boolean)>
	//  214  360:pop             
		i = j;
	//  215  361:iload_2         
	//  216  362:istore_1        
		if((k & 0x2000) == 8192)
	//* 217  363:iload_3         
	//* 218  364:sipush          8192
	//* 219  367:iand            
	//* 220  368:sipush          8192
	//* 221  371:icmpne          380
			i = j | 0x2000;
	//  222  374:iload_2         
	//  223  375:sipush          8192
	//  224  378:ior             
	//  225  379:istore_1        
		DescriptorProtos.FileOptions.access$16702(fileoptions, objcClassPrefix_);
	//  226  380:aload           4
	//  227  382:aload_0         
	//  228  383:getfield        #57  <Field Object objcClassPrefix_>
	//  229  386:invokestatic    #285 <Method Object DescriptorProtos$FileOptions.access$16702(DescriptorProtos$FileOptions, Object)>
	//  230  389:pop             
		j = i;
	//  231  390:iload_1         
	//  232  391:istore_2        
		if((k & 0x4000) == 16384)
	//* 233  392:iload_3         
	//* 234  393:sipush          16384
	//* 235  396:iand            
	//* 236  397:sipush          16384
	//* 237  400:icmpne          409
			j = i | 0x4000;
	//  238  403:iload_1         
	//  239  404:sipush          16384
	//  240  407:ior             
	//  241  408:istore_2        
		DescriptorProtos.FileOptions.access$16802(fileoptions, csharpNamespace_);
	//  242  409:aload           4
	//  243  411:aload_0         
	//  244  412:getfield        #59  <Field Object csharpNamespace_>
	//  245  415:invokestatic    #288 <Method Object DescriptorProtos$FileOptions.access$16802(DescriptorProtos$FileOptions, Object)>
	//  246  418:pop             
		i = j;
	//  247  419:iload_2         
	//  248  420:istore_1        
		if((0x8000 & k) == 32768)
	//* 249  421:ldc2            #289 <Int 32768>
	//* 250  424:iload_3         
	//* 251  425:iand            
	//* 252  426:ldc2            #289 <Int 32768>
	//* 253  429:icmpne          438
			i = j | 0x8000;
	//  254  432:iload_2         
	//  255  433:ldc2            #289 <Int 32768>
	//  256  436:ior             
	//  257  437:istore_1        
		DescriptorProtos.FileOptions.access$16902(fileoptions, swiftPrefix_);
	//  258  438:aload           4
	//  259  440:aload_0         
	//  260  441:getfield        #61  <Field Object swiftPrefix_>
	//  261  444:invokestatic    #292 <Method Object DescriptorProtos$FileOptions.access$16902(DescriptorProtos$FileOptions, Object)>
	//  262  447:pop             
		j = i;
	//  263  448:iload_1         
	//  264  449:istore_2        
		if((0x10000 & k) == 0x10000)
	//* 265  450:ldc2            #293 <Int 0x10000>
	//* 266  453:iload_3         
	//* 267  454:iand            
	//* 268  455:ldc2            #293 <Int 0x10000>
	//* 269  458:icmpne          467
			j = i | 0x10000;
	//  270  461:iload_1         
	//  271  462:ldc2            #293 <Int 0x10000>
	//  272  465:ior             
	//  273  466:istore_2        
		DescriptorProtos.FileOptions.access$17002(fileoptions, phpClassPrefix_);
	//  274  467:aload           4
	//  275  469:aload_0         
	//  276  470:getfield        #63  <Field Object phpClassPrefix_>
	//  277  473:invokestatic    #296 <Method Object DescriptorProtos$FileOptions.access$17002(DescriptorProtos$FileOptions, Object)>
	//  278  476:pop             
		i = j;
	//  279  477:iload_2         
	//  280  478:istore_1        
		if((0x20000 & k) == 0x20000)
	//* 281  479:ldc2            #297 <Int 0x20000>
	//* 282  482:iload_3         
	//* 283  483:iand            
	//* 284  484:ldc2            #297 <Int 0x20000>
	//* 285  487:icmpne          496
			i = j | 0x20000;
	//  286  490:iload_2         
	//  287  491:ldc2            #297 <Int 0x20000>
	//  288  494:ior             
	//  289  495:istore_1        
		DescriptorProtos.FileOptions.access$17102(fileoptions, phpNamespace_);
	//  290  496:aload           4
	//  291  498:aload_0         
	//  292  499:getfield        #65  <Field Object phpNamespace_>
	//  293  502:invokestatic    #300 <Method Object DescriptorProtos$FileOptions.access$17102(DescriptorProtos$FileOptions, Object)>
	//  294  505:pop             
		if(uninterpretedOptionBuilder_ == null)
	//* 295  506:aload_0         
	//* 296  507:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//* 297  510:ifnonnull       561
		{
			if((bitField0_ & 0x40000) == 0x40000)
	//* 298  513:aload_0         
	//* 299  514:getfield        #87  <Field int bitField0_>
	//* 300  517:ldc1            #88  <Int 0x40000>
	//* 301  519:iand            
	//* 302  520:ldc1            #88  <Int 0x40000>
	//* 303  522:icmpne          548
			{
				uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  304  525:aload_0         
	//  305  526:aload_0         
	//  306  527:getfield        #73  <Field List uninterpretedOption_>
	//  307  530:invokestatic    #304 <Method List Collections.unmodifiableList(List)>
	//  308  533:putfield        #73  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & 0xfffbffff;
	//  309  536:aload_0         
	//  310  537:aload_0         
	//  311  538:getfield        #87  <Field int bitField0_>
	//  312  541:ldc2            #305 <Int 0xfffbffff>
	//  313  544:iand            
	//  314  545:putfield        #87  <Field int bitField0_>
			}
			DescriptorProtos.FileOptions.access$17202(fileoptions, uninterpretedOption_);
	//  315  548:aload           4
	//  316  550:aload_0         
	//  317  551:getfield        #73  <Field List uninterpretedOption_>
	//  318  554:invokestatic    #309 <Method List DescriptorProtos$FileOptions.access$17202(DescriptorProtos$FileOptions, List)>
	//  319  557:pop             
		} else
	//* 320  558:goto            574
		{
			DescriptorProtos.FileOptions.access$17202(fileoptions, uninterpretedOptionBuilder_.build());
	//  321  561:aload           4
	//  322  563:aload_0         
	//  323  564:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//  324  567:invokevirtual   #311 <Method List RepeatedFieldBuilderV3.build()>
	//  325  570:invokestatic    #309 <Method List DescriptorProtos$FileOptions.access$17202(DescriptorProtos$FileOptions, List)>
	//  326  573:pop             
		}
		DescriptorProtos.FileOptions.access$17302(fileoptions, i);
	//  327  574:aload           4
	//  328  576:iload_1         
	//  329  577:invokestatic    #314 <Method int DescriptorProtos$FileOptions.access$17302(DescriptorProtos$FileOptions, int)>
	//  330  580:pop             
		onBuilt();
	//  331  581:aload_0         
	//  332  582:invokevirtual   #317 <Method void onBuilt()>
		return fileoptions;
	//  333  585:aload           4
	//  334  587:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #208 <Method DescriptorProtos$FileOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #208 <Method DescriptorProtos$FileOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #325 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clear()>
	//    2    4:pop             
		javaPackage_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #47  <String "">
	//    5    8:putfield        #49  <Field Object javaPackage_>
		bitField0_ = bitField0_ & -2;
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #87  <Field int bitField0_>
	//    9   16:bipush          -2
	//   10   18:iand            
	//   11   19:putfield        #87  <Field int bitField0_>
		javaOuterClassname_ = "";
	//   12   22:aload_0         
	//   13   23:ldc1            #47  <String "">
	//   14   25:putfield        #51  <Field Object javaOuterClassname_>
		bitField0_ = bitField0_ & -3;
	//   15   28:aload_0         
	//   16   29:aload_0         
	//   17   30:getfield        #87  <Field int bitField0_>
	//   18   33:bipush          -3
	//   19   35:iand            
	//   20   36:putfield        #87  <Field int bitField0_>
		javaMultipleFiles_ = false;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #231 <Field boolean javaMultipleFiles_>
		bitField0_ = bitField0_ & -5;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #87  <Field int bitField0_>
	//   27   49:bipush          -5
	//   28   51:iand            
	//   29   52:putfield        #87  <Field int bitField0_>
		javaGenerateEqualsAndHash_ = false;
	//   30   55:aload_0         
	//   31   56:iconst_0        
	//   32   57:putfield        #237 <Field boolean javaGenerateEqualsAndHash_>
		bitField0_ = bitField0_ & -9;
	//   33   60:aload_0         
	//   34   61:aload_0         
	//   35   62:getfield        #87  <Field int bitField0_>
	//   36   65:bipush          -9
	//   37   67:iand            
	//   38   68:putfield        #87  <Field int bitField0_>
		javaStringCheckUtf8_ = false;
	//   39   71:aload_0         
	//   40   72:iconst_0        
	//   41   73:putfield        #242 <Field boolean javaStringCheckUtf8_>
		bitField0_ = bitField0_ & 0xffffffef;
	//   42   76:aload_0         
	//   43   77:aload_0         
	//   44   78:getfield        #87  <Field int bitField0_>
	//   45   81:bipush          -17
	//   46   83:iand            
	//   47   84:putfield        #87  <Field int bitField0_>
		optimizeFor_ = 1;
	//   48   87:aload_0         
	//   49   88:iconst_1        
	//   50   89:putfield        #53  <Field int optimizeFor_>
		bitField0_ = bitField0_ & 0xffffffdf;
	//   51   92:aload_0         
	//   52   93:aload_0         
	//   53   94:getfield        #87  <Field int bitField0_>
	//   54   97:bipush          -33
	//   55   99:iand            
	//   56  100:putfield        #87  <Field int bitField0_>
		goPackage_ = "";
	//   57  103:aload_0         
	//   58  104:ldc1            #47  <String "">
	//   59  106:putfield        #55  <Field Object goPackage_>
		bitField0_ = bitField0_ & 0xffffffbf;
	//   60  109:aload_0         
	//   61  110:aload_0         
	//   62  111:getfield        #87  <Field int bitField0_>
	//   63  114:bipush          -65
	//   64  116:iand            
	//   65  117:putfield        #87  <Field int bitField0_>
		ccGenericServices_ = false;
	//   66  120:aload_0         
	//   67  121:iconst_0        
	//   68  122:putfield        #254 <Field boolean ccGenericServices_>
		bitField0_ = bitField0_ & 0xffffff7f;
	//   69  125:aload_0         
	//   70  126:aload_0         
	//   71  127:getfield        #87  <Field int bitField0_>
	//   72  130:sipush          -129
	//   73  133:iand            
	//   74  134:putfield        #87  <Field int bitField0_>
		javaGenericServices_ = false;
	//   75  137:aload_0         
	//   76  138:iconst_0        
	//   77  139:putfield        #259 <Field boolean javaGenericServices_>
		bitField0_ = bitField0_ & 0xfffffeff;
	//   78  142:aload_0         
	//   79  143:aload_0         
	//   80  144:getfield        #87  <Field int bitField0_>
	//   81  147:sipush          -257
	//   82  150:iand            
	//   83  151:putfield        #87  <Field int bitField0_>
		pyGenericServices_ = false;
	//   84  154:aload_0         
	//   85  155:iconst_0        
	//   86  156:putfield        #264 <Field boolean pyGenericServices_>
		bitField0_ = bitField0_ & 0xfffffdff;
	//   87  159:aload_0         
	//   88  160:aload_0         
	//   89  161:getfield        #87  <Field int bitField0_>
	//   90  164:sipush          -513
	//   91  167:iand            
	//   92  168:putfield        #87  <Field int bitField0_>
		phpGenericServices_ = false;
	//   93  171:aload_0         
	//   94  172:iconst_0        
	//   95  173:putfield        #269 <Field boolean phpGenericServices_>
		bitField0_ = bitField0_ & 0xfffffbff;
	//   96  176:aload_0         
	//   97  177:aload_0         
	//   98  178:getfield        #87  <Field int bitField0_>
	//   99  181:sipush          -1025
	//  100  184:iand            
	//  101  185:putfield        #87  <Field int bitField0_>
		deprecated_ = false;
	//  102  188:aload_0         
	//  103  189:iconst_0        
	//  104  190:putfield        #274 <Field boolean deprecated_>
		bitField0_ = bitField0_ & 0xfffff7ff;
	//  105  193:aload_0         
	//  106  194:aload_0         
	//  107  195:getfield        #87  <Field int bitField0_>
	//  108  198:sipush          -2049
	//  109  201:iand            
	//  110  202:putfield        #87  <Field int bitField0_>
		ccEnableArenas_ = false;
	//  111  205:aload_0         
	//  112  206:iconst_0        
	//  113  207:putfield        #279 <Field boolean ccEnableArenas_>
		bitField0_ = bitField0_ & 0xffffefff;
	//  114  210:aload_0         
	//  115  211:aload_0         
	//  116  212:getfield        #87  <Field int bitField0_>
	//  117  215:sipush          -4097
	//  118  218:iand            
	//  119  219:putfield        #87  <Field int bitField0_>
		objcClassPrefix_ = "";
	//  120  222:aload_0         
	//  121  223:ldc1            #47  <String "">
	//  122  225:putfield        #57  <Field Object objcClassPrefix_>
		bitField0_ = bitField0_ & 0xffffdfff;
	//  123  228:aload_0         
	//  124  229:aload_0         
	//  125  230:getfield        #87  <Field int bitField0_>
	//  126  233:sipush          -8193
	//  127  236:iand            
	//  128  237:putfield        #87  <Field int bitField0_>
		csharpNamespace_ = "";
	//  129  240:aload_0         
	//  130  241:ldc1            #47  <String "">
	//  131  243:putfield        #59  <Field Object csharpNamespace_>
		bitField0_ = bitField0_ & 0xffffbfff;
	//  132  246:aload_0         
	//  133  247:aload_0         
	//  134  248:getfield        #87  <Field int bitField0_>
	//  135  251:sipush          -16385
	//  136  254:iand            
	//  137  255:putfield        #87  <Field int bitField0_>
		swiftPrefix_ = "";
	//  138  258:aload_0         
	//  139  259:ldc1            #47  <String "">
	//  140  261:putfield        #61  <Field Object swiftPrefix_>
		bitField0_ = bitField0_ & 0xffff7fff;
	//  141  264:aload_0         
	//  142  265:aload_0         
	//  143  266:getfield        #87  <Field int bitField0_>
	//  144  269:ldc2            #326 <Int -32769>
	//  145  272:iand            
	//  146  273:putfield        #87  <Field int bitField0_>
		phpClassPrefix_ = "";
	//  147  276:aload_0         
	//  148  277:ldc1            #47  <String "">
	//  149  279:putfield        #63  <Field Object phpClassPrefix_>
		bitField0_ = bitField0_ & 0xfffeffff;
	//  150  282:aload_0         
	//  151  283:aload_0         
	//  152  284:getfield        #87  <Field int bitField0_>
	//  153  287:ldc2            #327 <Int 0xfffeffff>
	//  154  290:iand            
	//  155  291:putfield        #87  <Field int bitField0_>
		phpNamespace_ = "";
	//  156  294:aload_0         
	//  157  295:ldc1            #47  <String "">
	//  158  297:putfield        #65  <Field Object phpNamespace_>
		bitField0_ = bitField0_ & 0xfffdffff;
	//  159  300:aload_0         
	//  160  301:aload_0         
	//  161  302:getfield        #87  <Field int bitField0_>
	//  162  305:ldc2            #328 <Int 0xfffdffff>
	//  163  308:iand            
	//  164  309:putfield        #87  <Field int bitField0_>
		if(uninterpretedOptionBuilder_ == null)
	//* 165  312:aload_0         
	//* 166  313:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//* 167  316:ifnonnull       340
		{
			uninterpretedOption_ = Collections.emptyList();
	//  168  319:aload_0         
	//  169  320:invokestatic    #71  <Method List Collections.emptyList()>
	//  170  323:putfield        #73  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & 0xfffbffff;
	//  171  326:aload_0         
	//  172  327:aload_0         
	//  173  328:getfield        #87  <Field int bitField0_>
	//  174  331:ldc2            #305 <Int 0xfffbffff>
	//  175  334:iand            
	//  176  335:putfield        #87  <Field int bitField0_>
			return this;
	//  177  338:aload_0         
	//  178  339:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//  179  340:aload_0         
	//  180  341:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//  181  344:invokevirtual   #330 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//  182  347:aload_0         
	//  183  348:areturn         
		}
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder clear()
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearCcEnableArenas()
	{
		bitField0_ = bitField0_ & 0xffffefff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          -4097
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		ccEnableArenas_ = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #279 <Field boolean ccEnableArenas_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearCcGenericServices()
	{
		bitField0_ = bitField0_ & 0xffffff7f;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          -129
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		ccGenericServices_ = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #254 <Field boolean ccGenericServices_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearCsharpNamespace()
	{
		bitField0_ = bitField0_ & 0xffffbfff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          -16385
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		csharpNamespace_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getCsharpNamespace()));
	//    6   12:aload_0         
	//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    8   16:invokevirtual   #342 <Method String DescriptorProtos$FileOptions.getCsharpNamespace()>
	//    9   19:putfield        #59  <Field Object csharpNamespace_>
		onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearDeprecated()
	{
		bitField0_ = bitField0_ & 0xfffff7ff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          -2049
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		deprecated_ = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #274 <Field boolean deprecated_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return (DescriptorProtos$FileOptions$Builder)super.clearExtension(generatedextension);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #348 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (clearExtension(generatedextension)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #351 <Method DescriptorProtos$FileOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$FileOptions$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #356 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #359 <Method DescriptorProtos$FileOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #359 <Method DescriptorProtos$FileOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #359 <Method DescriptorProtos$FileOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearGoPackage()
	{
		bitField0_ = bitField0_ & 0xffffffbf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:bipush          -65
	//    4    7:iand            
	//    5    8:putfield        #87  <Field int bitField0_>
		goPackage_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getGoPackage()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    8   15:invokevirtual   #364 <Method String DescriptorProtos$FileOptions.getGoPackage()>
	//    9   18:putfield        #55  <Field Object goPackage_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearJavaGenerateEqualsAndHash()
	{
		bitField0_ = bitField0_ & -9;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:bipush          -9
	//    4    7:iand            
	//    5    8:putfield        #87  <Field int bitField0_>
		javaGenerateEqualsAndHash_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #237 <Field boolean javaGenerateEqualsAndHash_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearJavaGenericServices()
	{
		bitField0_ = bitField0_ & 0xfffffeff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          -257
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		javaGenericServices_ = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #259 <Field boolean javaGenericServices_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearJavaMultipleFiles()
	{
		bitField0_ = bitField0_ & -5;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:bipush          -5
	//    4    7:iand            
	//    5    8:putfield        #87  <Field int bitField0_>
		javaMultipleFiles_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #231 <Field boolean javaMultipleFiles_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearJavaOuterClassname()
	{
		bitField0_ = bitField0_ & -3;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:bipush          -3
	//    4    7:iand            
	//    5    8:putfield        #87  <Field int bitField0_>
		javaOuterClassname_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getJavaOuterClassname()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    8   15:invokevirtual   #373 <Method String DescriptorProtos$FileOptions.getJavaOuterClassname()>
	//    9   18:putfield        #51  <Field Object javaOuterClassname_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearJavaPackage()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #87  <Field int bitField0_>
		javaPackage_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getJavaPackage()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    8   15:invokevirtual   #377 <Method String DescriptorProtos$FileOptions.getJavaPackage()>
	//    9   18:putfield        #49  <Field Object javaPackage_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearJavaStringCheckUtf8()
	{
		bitField0_ = bitField0_ & 0xffffffef;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:bipush          -17
	//    4    7:iand            
	//    5    8:putfield        #87  <Field int bitField0_>
		javaStringCheckUtf8_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #242 <Field boolean javaStringCheckUtf8_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearObjcClassPrefix()
	{
		bitField0_ = bitField0_ & 0xffffdfff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          -8193
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		objcClassPrefix_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getObjcClassPrefix()));
	//    6   12:aload_0         
	//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    8   16:invokevirtual   #382 <Method String DescriptorProtos$FileOptions.getObjcClassPrefix()>
	//    9   19:putfield        #57  <Field Object objcClassPrefix_>
		onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #387 <Method DescriptorProtos$FileOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$FileOptions$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #390 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #387 <Method DescriptorProtos$FileOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #387 <Method DescriptorProtos$FileOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearOptimizeFor()
	{
		bitField0_ = bitField0_ & 0xffffffdf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:bipush          -33
	//    4    7:iand            
	//    5    8:putfield        #87  <Field int bitField0_>
		optimizeFor_ = 1;
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:putfield        #53  <Field int optimizeFor_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearPhpClassPrefix()
	{
		bitField0_ = bitField0_ & 0xfffeffff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:ldc2            #327 <Int 0xfffeffff>
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		phpClassPrefix_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getPhpClassPrefix()));
	//    6   12:aload_0         
	//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    8   16:invokevirtual   #396 <Method String DescriptorProtos$FileOptions.getPhpClassPrefix()>
	//    9   19:putfield        #63  <Field Object phpClassPrefix_>
		onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearPhpGenericServices()
	{
		bitField0_ = bitField0_ & 0xfffffbff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          -1025
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		phpGenericServices_ = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #269 <Field boolean phpGenericServices_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearPhpNamespace()
	{
		bitField0_ = bitField0_ & 0xfffdffff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:ldc2            #328 <Int 0xfffdffff>
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		phpNamespace_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getPhpNamespace()));
	//    6   12:aload_0         
	//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    8   16:invokevirtual   #401 <Method String DescriptorProtos$FileOptions.getPhpNamespace()>
	//    9   19:putfield        #65  <Field Object phpNamespace_>
		onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearPyGenericServices()
	{
		bitField0_ = bitField0_ & 0xfffffdff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          -513
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		pyGenericServices_ = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #264 <Field boolean pyGenericServices_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearSwiftPrefix()
	{
		bitField0_ = bitField0_ & 0xffff7fff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:ldc2            #326 <Int -32769>
	//    4    8:iand            
	//    5    9:putfield        #87  <Field int bitField0_>
		swiftPrefix_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getSwiftPrefix()));
	//    6   12:aload_0         
	//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    8   16:invokevirtual   #406 <Method String DescriptorProtos$FileOptions.getSwiftPrefix()>
	//    9   19:putfield        #61  <Field Object swiftPrefix_>
		onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clearUninterpretedOption()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       32
		{
			uninterpretedOption_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #71  <Method List Collections.emptyList()>
	//    5   11:putfield        #73  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & 0xfffbffff;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #87  <Field int bitField0_>
	//    9   19:ldc2            #305 <Int 0xfffbffff>
	//   10   22:iand            
	//   11   23:putfield        #87  <Field int bitField0_>
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   16   32:aload_0         
	//   17   33:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   36:invokevirtual   #330 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   39:aload_0         
	//   20   40:areturn         
		}
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FileOptions$Builder clone()
	{
		return (DescriptorProtos$FileOptions$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #413 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
	//    2    4:areturn         
	}

	public boolean getCcEnableArenas()
	{
		return ccEnableArenas_;
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field boolean ccEnableArenas_>
	//    2    4:ireturn         
	}

	public boolean getCcGenericServices()
	{
		return ccGenericServices_;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field boolean ccGenericServices_>
	//    2    4:ireturn         
	}

	public String getCsharpNamespace()
	{
		Object obj = csharpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object csharpNamespace_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #423 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				csharpNamespace_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #59  <Field Object csharpNamespace_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #421 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getCsharpNamespaceBytes()
	{
		Object obj = csharpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object csharpNamespace_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #421 <Class String>
	//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			csharpNamespace_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #59  <Field Object csharpNamespace_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #423 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.FileOptions getDefaultInstanceForType()
	{
		return DescriptorProtos.FileOptions.getDefaultInstance();
	//    0    0:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #438 <Method DescriptorProtos$FileOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #438 <Method DescriptorProtos$FileOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$14900();
	//    0    0:invokestatic    #98  <Method Descriptors$Descriptor DescriptorProtos.access$14900()>
	//    1    3:areturn         
	}

	public String getGoPackage()
	{
		Object obj = goPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object goPackage_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #423 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				goPackage_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #55  <Field Object goPackage_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #421 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getGoPackageBytes()
	{
		Object obj = goPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object goPackage_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #421 <Class String>
	//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			goPackage_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #55  <Field Object goPackage_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #423 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean getJavaGenerateEqualsAndHash()
	{
		return javaGenerateEqualsAndHash_;
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field boolean javaGenerateEqualsAndHash_>
	//    2    4:ireturn         
	}

	public boolean getJavaGenericServices()
	{
		return javaGenericServices_;
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field boolean javaGenericServices_>
	//    2    4:ireturn         
	}

	public boolean getJavaMultipleFiles()
	{
		return javaMultipleFiles_;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field boolean javaMultipleFiles_>
	//    2    4:ireturn         
	}

	public String getJavaOuterClassname()
	{
		Object obj = javaOuterClassname_;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object javaOuterClassname_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #423 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				javaOuterClassname_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #51  <Field Object javaOuterClassname_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #421 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getJavaOuterClassnameBytes()
	{
		Object obj = javaOuterClassname_;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object javaOuterClassname_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #421 <Class String>
	//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			javaOuterClassname_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #51  <Field Object javaOuterClassname_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #423 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public String getJavaPackage()
	{
		Object obj = javaPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Object javaPackage_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #423 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				javaPackage_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #49  <Field Object javaPackage_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #421 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getJavaPackageBytes()
	{
		Object obj = javaPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Object javaPackage_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #421 <Class String>
	//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			javaPackage_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #49  <Field Object javaPackage_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #423 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean getJavaStringCheckUtf8()
	{
		return javaStringCheckUtf8_;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field boolean javaStringCheckUtf8_>
	//    2    4:ireturn         
	}

	public String getObjcClassPrefix()
	{
		Object obj = objcClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object objcClassPrefix_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #423 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				objcClassPrefix_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #57  <Field Object objcClassPrefix_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #421 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getObjcClassPrefixBytes()
	{
		Object obj = objcClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object objcClassPrefix_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #421 <Class String>
	//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			objcClassPrefix_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #57  <Field Object objcClassPrefix_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #423 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public Mode getOptimizeFor()
	{
		Mode mode = Mode.valueOf(optimizeFor_);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int optimizeFor_>
	//    2    4:invokestatic    #456 <Method DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions$OptimizeMode.valueOf(int)>
	//    3    7:astore_1        
		if(mode == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return Mode.SPEED;
	//    6   12:getstatic       #460 <Field DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions$OptimizeMode.SPEED>
	//    7   15:areturn         
		else
			return mode;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public String getPhpClassPrefix()
	{
		Object obj = phpClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Object phpClassPrefix_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #423 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				phpClassPrefix_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #63  <Field Object phpClassPrefix_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #421 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getPhpClassPrefixBytes()
	{
		Object obj = phpClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Object phpClassPrefix_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #421 <Class String>
	//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			phpClassPrefix_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #63  <Field Object phpClassPrefix_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #423 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean getPhpGenericServices()
	{
		return phpGenericServices_;
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field boolean phpGenericServices_>
	//    2    4:ireturn         
	}

	public String getPhpNamespace()
	{
		Object obj = phpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Object phpNamespace_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #423 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				phpNamespace_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #65  <Field Object phpNamespace_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #421 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getPhpNamespaceBytes()
	{
		Object obj = phpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Object phpNamespace_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #421 <Class String>
	//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			phpNamespace_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #65  <Field Object phpNamespace_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #423 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean getPyGenericServices()
	{
		return pyGenericServices_;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field boolean pyGenericServices_>
	//    2    4:ireturn         
	}

	public String getSwiftPrefix()
	{
		Object obj = swiftPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Object swiftPrefix_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #423 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				swiftPrefix_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #61  <Field Object swiftPrefix_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #421 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getSwiftPrefixBytes()
	{
		Object obj = swiftPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Object swiftPrefix_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #421 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #421 <Class String>
	//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			swiftPrefix_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #61  <Field Object swiftPrefix_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #423 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos$UninterpretedOption)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #471 <Method Object List.get(int)>
	//    7   17:checkcast       #193 <Class DescriptorProtos$UninterpretedOption>
	//    8   20:areturn         
		else
			return (DescriptorProtos$UninterpretedOption)uninterpretedOptionBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #475 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #193 <Class DescriptorProtos$UninterpretedOption>
	//   14   32:areturn         
	}

	public Builder getUninterpretedOptionBuilder(int i)
	{
		return (Builder)getUninterpretedOptionFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #480 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #163 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   11:areturn         
	}

	public List getUninterpretedOptionBuilderList()
	{
		return getUninterpretedOptionFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokevirtual   #484 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       17
			return uninterpretedOption_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field List uninterpretedOption_>
	//    5   11:invokeinterface #490 <Method int List.size()>
	//    6   16:ireturn         
		else
			return uninterpretedOptionBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   21:invokevirtual   #493 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(uninterpretedOption_);
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field List uninterpretedOption_>
	//    5   11:invokestatic    #304 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return uninterpretedOptionBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   19:invokevirtual   #497 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public rBuilder getUninterpretedOptionOrBuilder(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (rBuilder)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #471 <Method Object List.get(int)>
	//    7   17:checkcast       #502 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    8   20:areturn         
		else
			return (rBuilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #506 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #502 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//   14   32:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		if(uninterpretedOptionBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnull          15
			return uninterpretedOptionBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    5   11:invokevirtual   #510 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(uninterpretedOption_);
	//    7   15:aload_0         
	//    8   16:getfield        #73  <Field List uninterpretedOption_>
	//    9   19:invokestatic    #304 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public boolean hasCcEnableArenas()
	{
		return (bitField0_ & 0x1000) == 4096;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:sipush          4096
	//    3    7:iand            
	//    4    8:sipush          4096
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasCcGenericServices()
	{
		return (bitField0_ & 0x80) == 128;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:sipush          128
	//    3    7:iand            
	//    4    8:sipush          128
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasCsharpNamespace()
	{
		return (bitField0_ & 0x4000) == 16384;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:sipush          16384
	//    3    7:iand            
	//    4    8:sipush          16384
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasDeprecated()
	{
		return (bitField0_ & 0x800) == 2048;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:sipush          2048
	//    3    7:iand            
	//    4    8:sipush          2048
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasGoPackage()
	{
		return (bitField0_ & 0x40) == 64;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:bipush          64
	//    3    6:iand            
	//    4    7:bipush          64
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasJavaGenerateEqualsAndHash()
	{
		return (bitField0_ & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasJavaGenericServices()
	{
		return (bitField0_ & 0x100) == 256;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:sipush          256
	//    3    7:iand            
	//    4    8:sipush          256
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasJavaMultipleFiles()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasJavaOuterClassname()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasJavaPackage()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasJavaStringCheckUtf8()
	{
		return (bitField0_ & 0x10) == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:bipush          16
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasObjcClassPrefix()
	{
		return (bitField0_ & 0x2000) == 8192;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:sipush          8192
	//    3    7:iand            
	//    4    8:sipush          8192
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasOptimizeFor()
	{
		return (bitField0_ & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasPhpClassPrefix()
	{
		return (bitField0_ & 0x10000) == 0x10000;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:ldc2            #293 <Int 0x10000>
	//    3    7:iand            
	//    4    8:ldc2            #293 <Int 0x10000>
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasPhpGenericServices()
	{
		return (bitField0_ & 0x400) == 1024;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:sipush          1024
	//    3    7:iand            
	//    4    8:sipush          1024
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasPhpNamespace()
	{
		return (bitField0_ & 0x20000) == 0x20000;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:ldc2            #297 <Int 0x20000>
	//    3    7:iand            
	//    4    8:ldc2            #297 <Int 0x20000>
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasPyGenericServices()
	{
		return (bitField0_ & 0x200) == 512;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:sipush          512
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasSwiftPrefix()
	{
		return (bitField0_ & 0x8000) == 32768;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int bitField0_>
	//    2    4:ldc2            #289 <Int 32768>
	//    3    7:iand            
	//    4    8:ldc2            #289 <Int 32768>
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected  internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$15000().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FileOptions, com/google/protobuf/DescriptorProtos$FileOptions$Builder);
	//    0    0:invokestatic    #534 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$15000()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$FileOptions>
	//    2    5:ldc1            #2   <Class DescriptorProtos$FileOptions$Builder>
	//    3    7:invokevirtual   #540 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < getUninterpretedOptionCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #542 <Method int getUninterpretedOptionCount()>
	//*   5    7:icmpge          30
			if(!getUninterpretedOption(i).isInitialized())
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #544 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*   9   15:invokevirtual   #545 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
	//*  10   18:ifne            23
				return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         

	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore_1        
	//*  17   27:goto            2
		return extensionsAreInitialized();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #548 <Method boolean extensionsAreInitialized()>
	//   20   34:ifne            39
	//   21   37:iconst_0        
	//   22   38:ireturn         
	//   23   39:iconst_1        
	//   24   40:ireturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #555 <Method DescriptorProtos$FileOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #559 <Method DescriptorProtos$FileOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #555 <Method DescriptorProtos$FileOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FileOptions$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.FileOptions)DescriptorProtos.FileOptions.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #566 <Field Parser DescriptorProtos$FileOptions.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #572 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$FileOptions>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.FileOptions) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #575 <Method DescriptorProtos$FileOptions$Builder mergeFrom(DescriptorProtos$FileOptions)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #578 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$FileOptions>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #582 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #575 <Method DescriptorProtos$FileOptions$Builder mergeFrom(DescriptorProtos$FileOptions)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.FileOptions)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.FileOptions) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$FileOptions$Builder mergeFrom(DescriptorProtos.FileOptions fileoptions)
	{
		if(fileoptions == DescriptorProtos.FileOptions.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(fileoptions.hasJavaPackage())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #584 <Method boolean DescriptorProtos$FileOptions.hasJavaPackage()>
	//*   7   13:ifeq            38
		{
			bitField0_ = bitField0_ | 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #87  <Field int bitField0_>
	//   11   21:iconst_1        
	//   12   22:ior             
	//   13   23:putfield        #87  <Field int bitField0_>
			javaPackage_ = DescriptorProtos.FileOptions.access$15400(fileoptions);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokestatic    #588 <Method Object DescriptorProtos$FileOptions.access$15400(DescriptorProtos$FileOptions)>
	//   17   31:putfield        #49  <Field Object javaPackage_>
			onChanged();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #137 <Method void onChanged()>
		}
		if(fileoptions.hasJavaOuterClassname())
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #590 <Method boolean DescriptorProtos$FileOptions.hasJavaOuterClassname()>
	//*  22   42:ifeq            67
		{
			bitField0_ = bitField0_ | 2;
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #87  <Field int bitField0_>
	//   26   50:iconst_2        
	//   27   51:ior             
	//   28   52:putfield        #87  <Field int bitField0_>
			javaOuterClassname_ = DescriptorProtos.FileOptions.access$15500(fileoptions);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokestatic    #593 <Method Object DescriptorProtos$FileOptions.access$15500(DescriptorProtos$FileOptions)>
	//   32   60:putfield        #51  <Field Object javaOuterClassname_>
			onChanged();
	//   33   63:aload_0         
	//   34   64:invokevirtual   #137 <Method void onChanged()>
		}
		if(fileoptions.hasJavaMultipleFiles())
	//*  35   67:aload_1         
	//*  36   68:invokevirtual   #595 <Method boolean DescriptorProtos$FileOptions.hasJavaMultipleFiles()>
	//*  37   71:ifeq            83
			setJavaMultipleFiles(fileoptions.getJavaMultipleFiles());
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:invokevirtual   #597 <Method boolean DescriptorProtos$FileOptions.getJavaMultipleFiles()>
	//   41   79:invokevirtual   #601 <Method DescriptorProtos$FileOptions$Builder setJavaMultipleFiles(boolean)>
	//   42   82:pop             
		if(fileoptions.hasJavaGenerateEqualsAndHash())
	//*  43   83:aload_1         
	//*  44   84:invokevirtual   #603 <Method boolean DescriptorProtos$FileOptions.hasJavaGenerateEqualsAndHash()>
	//*  45   87:ifeq            99
			setJavaGenerateEqualsAndHash(fileoptions.getJavaGenerateEqualsAndHash());
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:invokevirtual   #605 <Method boolean DescriptorProtos$FileOptions.getJavaGenerateEqualsAndHash()>
	//   49   95:invokevirtual   #608 <Method DescriptorProtos$FileOptions$Builder setJavaGenerateEqualsAndHash(boolean)>
	//   50   98:pop             
		if(fileoptions.hasJavaStringCheckUtf8())
	//*  51   99:aload_1         
	//*  52  100:invokevirtual   #610 <Method boolean DescriptorProtos$FileOptions.hasJavaStringCheckUtf8()>
	//*  53  103:ifeq            115
			setJavaStringCheckUtf8(fileoptions.getJavaStringCheckUtf8());
	//   54  106:aload_0         
	//   55  107:aload_1         
	//   56  108:invokevirtual   #612 <Method boolean DescriptorProtos$FileOptions.getJavaStringCheckUtf8()>
	//   57  111:invokevirtual   #615 <Method DescriptorProtos$FileOptions$Builder setJavaStringCheckUtf8(boolean)>
	//   58  114:pop             
		if(fileoptions.hasOptimizeFor())
	//*  59  115:aload_1         
	//*  60  116:invokevirtual   #617 <Method boolean DescriptorProtos$FileOptions.hasOptimizeFor()>
	//*  61  119:ifeq            131
			setOptimizeFor(fileoptions.getOptimizeFor());
	//   62  122:aload_0         
	//   63  123:aload_1         
	//   64  124:invokevirtual   #619 <Method DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions.getOptimizeFor()>
	//   65  127:invokevirtual   #623 <Method DescriptorProtos$FileOptions$Builder setOptimizeFor(DescriptorProtos$FileOptions$OptimizeMode)>
	//   66  130:pop             
		if(fileoptions.hasGoPackage())
	//*  67  131:aload_1         
	//*  68  132:invokevirtual   #625 <Method boolean DescriptorProtos$FileOptions.hasGoPackage()>
	//*  69  135:ifeq            161
		{
			bitField0_ = bitField0_ | 0x40;
	//   70  138:aload_0         
	//   71  139:aload_0         
	//   72  140:getfield        #87  <Field int bitField0_>
	//   73  143:bipush          64
	//   74  145:ior             
	//   75  146:putfield        #87  <Field int bitField0_>
			goPackage_ = DescriptorProtos.FileOptions.access$16000(fileoptions);
	//   76  149:aload_0         
	//   77  150:aload_1         
	//   78  151:invokestatic    #628 <Method Object DescriptorProtos$FileOptions.access$16000(DescriptorProtos$FileOptions)>
	//   79  154:putfield        #55  <Field Object goPackage_>
			onChanged();
	//   80  157:aload_0         
	//   81  158:invokevirtual   #137 <Method void onChanged()>
		}
		if(fileoptions.hasCcGenericServices())
	//*  82  161:aload_1         
	//*  83  162:invokevirtual   #630 <Method boolean DescriptorProtos$FileOptions.hasCcGenericServices()>
	//*  84  165:ifeq            177
			setCcGenericServices(fileoptions.getCcGenericServices());
	//   85  168:aload_0         
	//   86  169:aload_1         
	//   87  170:invokevirtual   #632 <Method boolean DescriptorProtos$FileOptions.getCcGenericServices()>
	//   88  173:invokevirtual   #635 <Method DescriptorProtos$FileOptions$Builder setCcGenericServices(boolean)>
	//   89  176:pop             
		if(fileoptions.hasJavaGenericServices())
	//*  90  177:aload_1         
	//*  91  178:invokevirtual   #637 <Method boolean DescriptorProtos$FileOptions.hasJavaGenericServices()>
	//*  92  181:ifeq            193
			setJavaGenericServices(fileoptions.getJavaGenericServices());
	//   93  184:aload_0         
	//   94  185:aload_1         
	//   95  186:invokevirtual   #639 <Method boolean DescriptorProtos$FileOptions.getJavaGenericServices()>
	//   96  189:invokevirtual   #642 <Method DescriptorProtos$FileOptions$Builder setJavaGenericServices(boolean)>
	//   97  192:pop             
		if(fileoptions.hasPyGenericServices())
	//*  98  193:aload_1         
	//*  99  194:invokevirtual   #644 <Method boolean DescriptorProtos$FileOptions.hasPyGenericServices()>
	//* 100  197:ifeq            209
			setPyGenericServices(fileoptions.getPyGenericServices());
	//  101  200:aload_0         
	//  102  201:aload_1         
	//  103  202:invokevirtual   #646 <Method boolean DescriptorProtos$FileOptions.getPyGenericServices()>
	//  104  205:invokevirtual   #649 <Method DescriptorProtos$FileOptions$Builder setPyGenericServices(boolean)>
	//  105  208:pop             
		if(fileoptions.hasPhpGenericServices())
	//* 106  209:aload_1         
	//* 107  210:invokevirtual   #651 <Method boolean DescriptorProtos$FileOptions.hasPhpGenericServices()>
	//* 108  213:ifeq            225
			setPhpGenericServices(fileoptions.getPhpGenericServices());
	//  109  216:aload_0         
	//  110  217:aload_1         
	//  111  218:invokevirtual   #653 <Method boolean DescriptorProtos$FileOptions.getPhpGenericServices()>
	//  112  221:invokevirtual   #656 <Method DescriptorProtos$FileOptions$Builder setPhpGenericServices(boolean)>
	//  113  224:pop             
		if(fileoptions.hasDeprecated())
	//* 114  225:aload_1         
	//* 115  226:invokevirtual   #658 <Method boolean DescriptorProtos$FileOptions.hasDeprecated()>
	//* 116  229:ifeq            241
			setDeprecated(fileoptions.getDeprecated());
	//  117  232:aload_0         
	//  118  233:aload_1         
	//  119  234:invokevirtual   #660 <Method boolean DescriptorProtos$FileOptions.getDeprecated()>
	//  120  237:invokevirtual   #663 <Method DescriptorProtos$FileOptions$Builder setDeprecated(boolean)>
	//  121  240:pop             
		if(fileoptions.hasCcEnableArenas())
	//* 122  241:aload_1         
	//* 123  242:invokevirtual   #665 <Method boolean DescriptorProtos$FileOptions.hasCcEnableArenas()>
	//* 124  245:ifeq            257
			setCcEnableArenas(fileoptions.getCcEnableArenas());
	//  125  248:aload_0         
	//  126  249:aload_1         
	//  127  250:invokevirtual   #667 <Method boolean DescriptorProtos$FileOptions.getCcEnableArenas()>
	//  128  253:invokevirtual   #670 <Method DescriptorProtos$FileOptions$Builder setCcEnableArenas(boolean)>
	//  129  256:pop             
		if(fileoptions.hasObjcClassPrefix())
	//* 130  257:aload_1         
	//* 131  258:invokevirtual   #672 <Method boolean DescriptorProtos$FileOptions.hasObjcClassPrefix()>
	//* 132  261:ifeq            288
		{
			bitField0_ = bitField0_ | 0x2000;
	//  133  264:aload_0         
	//  134  265:aload_0         
	//  135  266:getfield        #87  <Field int bitField0_>
	//  136  269:sipush          8192
	//  137  272:ior             
	//  138  273:putfield        #87  <Field int bitField0_>
			objcClassPrefix_ = DescriptorProtos.FileOptions.access$16700(fileoptions);
	//  139  276:aload_0         
	//  140  277:aload_1         
	//  141  278:invokestatic    #675 <Method Object DescriptorProtos$FileOptions.access$16700(DescriptorProtos$FileOptions)>
	//  142  281:putfield        #57  <Field Object objcClassPrefix_>
			onChanged();
	//  143  284:aload_0         
	//  144  285:invokevirtual   #137 <Method void onChanged()>
		}
		if(fileoptions.hasCsharpNamespace())
	//* 145  288:aload_1         
	//* 146  289:invokevirtual   #677 <Method boolean DescriptorProtos$FileOptions.hasCsharpNamespace()>
	//* 147  292:ifeq            319
		{
			bitField0_ = bitField0_ | 0x4000;
	//  148  295:aload_0         
	//  149  296:aload_0         
	//  150  297:getfield        #87  <Field int bitField0_>
	//  151  300:sipush          16384
	//  152  303:ior             
	//  153  304:putfield        #87  <Field int bitField0_>
			csharpNamespace_ = DescriptorProtos.FileOptions.access$16800(fileoptions);
	//  154  307:aload_0         
	//  155  308:aload_1         
	//  156  309:invokestatic    #680 <Method Object DescriptorProtos$FileOptions.access$16800(DescriptorProtos$FileOptions)>
	//  157  312:putfield        #59  <Field Object csharpNamespace_>
			onChanged();
	//  158  315:aload_0         
	//  159  316:invokevirtual   #137 <Method void onChanged()>
		}
		if(fileoptions.hasSwiftPrefix())
	//* 160  319:aload_1         
	//* 161  320:invokevirtual   #682 <Method boolean DescriptorProtos$FileOptions.hasSwiftPrefix()>
	//* 162  323:ifeq            350
		{
			bitField0_ = bitField0_ | 0x8000;
	//  163  326:aload_0         
	//  164  327:aload_0         
	//  165  328:getfield        #87  <Field int bitField0_>
	//  166  331:ldc2            #289 <Int 32768>
	//  167  334:ior             
	//  168  335:putfield        #87  <Field int bitField0_>
			swiftPrefix_ = DescriptorProtos.FileOptions.access$16900(fileoptions);
	//  169  338:aload_0         
	//  170  339:aload_1         
	//  171  340:invokestatic    #685 <Method Object DescriptorProtos$FileOptions.access$16900(DescriptorProtos$FileOptions)>
	//  172  343:putfield        #61  <Field Object swiftPrefix_>
			onChanged();
	//  173  346:aload_0         
	//  174  347:invokevirtual   #137 <Method void onChanged()>
		}
		if(fileoptions.hasPhpClassPrefix())
	//* 175  350:aload_1         
	//* 176  351:invokevirtual   #687 <Method boolean DescriptorProtos$FileOptions.hasPhpClassPrefix()>
	//* 177  354:ifeq            381
		{
			bitField0_ = bitField0_ | 0x10000;
	//  178  357:aload_0         
	//  179  358:aload_0         
	//  180  359:getfield        #87  <Field int bitField0_>
	//  181  362:ldc2            #293 <Int 0x10000>
	//  182  365:ior             
	//  183  366:putfield        #87  <Field int bitField0_>
			phpClassPrefix_ = DescriptorProtos.FileOptions.access$17000(fileoptions);
	//  184  369:aload_0         
	//  185  370:aload_1         
	//  186  371:invokestatic    #690 <Method Object DescriptorProtos$FileOptions.access$17000(DescriptorProtos$FileOptions)>
	//  187  374:putfield        #63  <Field Object phpClassPrefix_>
			onChanged();
	//  188  377:aload_0         
	//  189  378:invokevirtual   #137 <Method void onChanged()>
		}
		if(fileoptions.hasPhpNamespace())
	//* 190  381:aload_1         
	//* 191  382:invokevirtual   #692 <Method boolean DescriptorProtos$FileOptions.hasPhpNamespace()>
	//* 192  385:ifeq            412
		{
			bitField0_ = bitField0_ | 0x20000;
	//  193  388:aload_0         
	//  194  389:aload_0         
	//  195  390:getfield        #87  <Field int bitField0_>
	//  196  393:ldc2            #297 <Int 0x20000>
	//  197  396:ior             
	//  198  397:putfield        #87  <Field int bitField0_>
			phpNamespace_ = DescriptorProtos.FileOptions.access$17100(fileoptions);
	//  199  400:aload_0         
	//  200  401:aload_1         
	//  201  402:invokestatic    #695 <Method Object DescriptorProtos$FileOptions.access$17100(DescriptorProtos$FileOptions)>
	//  202  405:putfield        #65  <Field Object phpNamespace_>
			onChanged();
	//  203  408:aload_0         
	//  204  409:invokevirtual   #137 <Method void onChanged()>
		}
		if(uninterpretedOptionBuilder_ == null)
	//* 205  412:aload_0         
	//* 206  413:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//* 207  416:ifnonnull       491
		{
			if(!DescriptorProtos.FileOptions.access$17200(fileoptions).isEmpty())
	//* 208  419:aload_1         
	//* 209  420:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
	//* 210  423:invokeinterface #702 <Method boolean List.isEmpty()>
	//* 211  428:ifne            581
			{
				if(uninterpretedOption_.isEmpty())
	//* 212  431:aload_0         
	//* 213  432:getfield        #73  <Field List uninterpretedOption_>
	//* 214  435:invokeinterface #702 <Method boolean List.isEmpty()>
	//* 215  440:ifeq            466
				{
					uninterpretedOption_ = DescriptorProtos.FileOptions.access$17200(fileoptions);
	//  216  443:aload_0         
	//  217  444:aload_1         
	//  218  445:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
	//  219  448:putfield        #73  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & 0xfffbffff;
	//  220  451:aload_0         
	//  221  452:aload_0         
	//  222  453:getfield        #87  <Field int bitField0_>
	//  223  456:ldc2            #305 <Int 0xfffbffff>
	//  224  459:iand            
	//  225  460:putfield        #87  <Field int bitField0_>
				} else
	//* 226  463:goto            484
				{
					ensureUninterpretedOptionIsMutable();
	//  227  466:aload_0         
	//  228  467:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.addAll(((java.util.Collection) (DescriptorProtos.FileOptions.access$17200(fileoptions))));
	//  229  470:aload_0         
	//  230  471:getfield        #73  <Field List uninterpretedOption_>
	//  231  474:aload_1         
	//  232  475:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
	//  233  478:invokeinterface #705 <Method boolean List.addAll(java.util.Collection)>
	//  234  483:pop             
				}
				onChanged();
	//  235  484:aload_0         
	//  236  485:invokevirtual   #137 <Method void onChanged()>
			}
		} else
	//* 237  488:goto            581
		if(!DescriptorProtos.FileOptions.access$17200(fileoptions).isEmpty())
	//* 238  491:aload_1         
	//* 239  492:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
	//* 240  495:invokeinterface #702 <Method boolean List.isEmpty()>
	//* 241  500:ifne            581
			if(uninterpretedOptionBuilder_.isEmpty())
	//* 242  503:aload_0         
	//* 243  504:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//* 244  507:invokevirtual   #706 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 245  510:ifeq            569
			{
				uninterpretedOptionBuilder_.dispose();
	//  246  513:aload_0         
	//  247  514:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//  248  517:invokevirtual   #709 <Method void RepeatedFieldBuilderV3.dispose()>
				uninterpretedOptionBuilder_ = null;
	//  249  520:aload_0         
	//  250  521:aconst_null     
	//  251  522:putfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				uninterpretedOption_ = DescriptorProtos.FileOptions.access$17200(fileoptions);
	//  252  525:aload_0         
	//  253  526:aload_1         
	//  254  527:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
	//  255  530:putfield        #73  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & 0xfffbffff;
	//  256  533:aload_0         
	//  257  534:aload_0         
	//  258  535:getfield        #87  <Field int bitField0_>
	//  259  538:ldc2            #305 <Int 0xfffbffff>
	//  260  541:iand            
	//  261  542:putfield        #87  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 262  545:getstatic       #122 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 263  548:ifeq            559
					repeatedfieldbuilderv3 = getUninterpretedOptionFieldBuilder();
	//  264  551:aload_0         
	//  265  552:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//  266  555:astore_2        
				else
	//* 267  556:goto            561
					repeatedfieldbuilderv3 = null;
	//  268  559:aconst_null     
	//  269  560:astore_2        
				uninterpretedOptionBuilder_ = repeatedfieldbuilderv3;
	//  270  561:aload_0         
	//  271  562:aload_2         
	//  272  563:putfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			} else
	//* 273  566:goto            581
			{
				uninterpretedOptionBuilder_.addAllMessages(((Iterable) (DescriptorProtos.FileOptions.access$17200(fileoptions))));
	//  274  569:aload_0         
	//  275  570:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//  276  573:aload_1         
	//  277  574:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
	//  278  577:invokevirtual   #141 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  279  580:pop             
			}
		mergeExtensionFields(((GeneratedMessageV3$ExtendableMessage) (fileoptions)));
	//  280  581:aload_0         
	//  281  582:aload_1         
	//  282  583:invokevirtual   #713 <Method void mergeExtensionFields(GeneratedMessageV3$ExtendableMessage)>
		mergeUnknownFields(fileoptions.unknownFields);
	//  283  586:aload_0         
	//  284  587:aload_1         
	//  285  588:getfield        #717 <Field UnknownFieldSet DescriptorProtos$FileOptions.unknownFields>
	//  286  591:invokevirtual   #721 <Method DescriptorProtos$FileOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//  287  594:pop             
		onChanged();
	//  288  595:aload_0         
	//  289  596:invokevirtual   #137 <Method void onChanged()>
		return this;
	//  290  599:aload_0         
	//  291  600:areturn         
	}

	public DescriptorProtos$FileOptions$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.FileOptions)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$FileOptions>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.FileOptions)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$FileOptions>
	//    6   12:invokevirtual   #575 <Method DescriptorProtos$FileOptions$Builder mergeFrom(DescriptorProtos$FileOptions)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #723 <Method AbstractMessage$Builder GeneratedMessageV3$ExtendableBuilder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #555 <Method DescriptorProtos$FileOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #559 <Method DescriptorProtos$FileOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #555 <Method DescriptorProtos$FileOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #721 <Method DescriptorProtos$FileOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$FileOptions$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FileOptions$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #730 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #721 <Method DescriptorProtos$FileOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #721 <Method DescriptorProtos$FileOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FileOptions$Builder removeUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #736 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			uninterpretedOptionBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #739 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setCcEnableArenas(boolean flag)
	{
		bitField0_ = bitField0_ | 0x1000;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          4096
	//    4    8:ior             
	//    5    9:putfield        #87  <Field int bitField0_>
		ccEnableArenas_ = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #279 <Field boolean ccEnableArenas_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setCcGenericServices(boolean flag)
	{
		bitField0_ = bitField0_ | 0x80;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          128
	//    4    8:ior             
	//    5    9:putfield        #87  <Field int bitField0_>
		ccGenericServices_ = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #254 <Field boolean ccGenericServices_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setCsharpNamespace(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x4000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:sipush          16384
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			csharpNamespace_ = ((Object) (s));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #59  <Field Object csharpNamespace_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setCsharpNamespaceBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x4000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:sipush          16384
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			csharpNamespace_ = ((Object) (bytestring));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #59  <Field Object csharpNamespace_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setDeprecated(boolean flag)
	{
		bitField0_ = bitField0_ | 0x800;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          2048
	//    4    8:ior             
	//    5    9:putfield        #87  <Field int bitField0_>
		deprecated_ = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #274 <Field boolean deprecated_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return (DescriptorProtos$FileOptions$Builder)super.setExtension(generatedextension, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #748 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    6   10:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$FileOptions$Builder)super.setExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #751 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (setExtension(generatedextension, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #754 <Method DescriptorProtos$FileOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (setExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #756 <Method DescriptorProtos$FileOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FileOptions$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #759 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #761 <Method DescriptorProtos$FileOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #761 <Method DescriptorProtos$FileOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #761 <Method DescriptorProtos$FileOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setGoPackage(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x40;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:bipush          64
	//   10   19:ior             
	//   11   20:putfield        #87  <Field int bitField0_>
			goPackage_ = ((Object) (s));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #55  <Field Object goPackage_>
			onChanged();
	//   15   28:aload_0         
	//   16   29:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   32:aload_0         
	//   18   33:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setGoPackageBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x40;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:bipush          64
	//   10   19:ior             
	//   11   20:putfield        #87  <Field int bitField0_>
			goPackage_ = ((Object) (bytestring));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #55  <Field Object goPackage_>
			onChanged();
	//   15   28:aload_0         
	//   16   29:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   32:aload_0         
	//   18   33:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setJavaGenerateEqualsAndHash(boolean flag)
	{
		bitField0_ = bitField0_ | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #87  <Field int bitField0_>
		javaGenerateEqualsAndHash_ = flag;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #237 <Field boolean javaGenerateEqualsAndHash_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setJavaGenericServices(boolean flag)
	{
		bitField0_ = bitField0_ | 0x100;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          256
	//    4    8:ior             
	//    5    9:putfield        #87  <Field int bitField0_>
		javaGenericServices_ = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #259 <Field boolean javaGenericServices_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setJavaMultipleFiles(boolean flag)
	{
		bitField0_ = bitField0_ | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #87  <Field int bitField0_>
		javaMultipleFiles_ = flag;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #231 <Field boolean javaMultipleFiles_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setJavaOuterClassname(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 2;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:iconst_2        
	//   10   18:ior             
	//   11   19:putfield        #87  <Field int bitField0_>
			javaOuterClassname_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #51  <Field Object javaOuterClassname_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setJavaOuterClassnameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 2;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:iconst_2        
	//   10   18:ior             
	//   11   19:putfield        #87  <Field int bitField0_>
			javaOuterClassname_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #51  <Field Object javaOuterClassname_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setJavaPackage(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #87  <Field int bitField0_>
			javaPackage_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #49  <Field Object javaPackage_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setJavaPackageBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #87  <Field int bitField0_>
			javaPackage_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #49  <Field Object javaPackage_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setJavaStringCheckUtf8(boolean flag)
	{
		bitField0_ = bitField0_ | 0x10;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:bipush          16
	//    4    7:ior             
	//    5    8:putfield        #87  <Field int bitField0_>
		javaStringCheckUtf8_ = flag;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #242 <Field boolean javaStringCheckUtf8_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setObjcClassPrefix(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x2000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:sipush          8192
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			objcClassPrefix_ = ((Object) (s));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #57  <Field Object objcClassPrefix_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setObjcClassPrefixBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x2000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:sipush          8192
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			objcClassPrefix_ = ((Object) (bytestring));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #57  <Field Object objcClassPrefix_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setOptimizeFor(Mode mode)
	{
		if(mode == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x20;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:bipush          32
	//   10   19:ior             
	//   11   20:putfield        #87  <Field int bitField0_>
			optimizeFor_ = mode.getNumber();
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #772 <Method int DescriptorProtos$FileOptions$OptimizeMode.getNumber()>
	//   15   28:putfield        #53  <Field int optimizeFor_>
			onChanged();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   18   35:aload_0         
	//   19   36:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setPhpClassPrefix(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x10000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:ldc2            #293 <Int 0x10000>
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			phpClassPrefix_ = ((Object) (s));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #63  <Field Object phpClassPrefix_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setPhpClassPrefixBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x10000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:ldc2            #293 <Int 0x10000>
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			phpClassPrefix_ = ((Object) (bytestring));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #63  <Field Object phpClassPrefix_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setPhpGenericServices(boolean flag)
	{
		bitField0_ = bitField0_ | 0x400;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          1024
	//    4    8:ior             
	//    5    9:putfield        #87  <Field int bitField0_>
		phpGenericServices_ = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #269 <Field boolean phpGenericServices_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setPhpNamespace(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x20000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:ldc2            #297 <Int 0x20000>
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			phpNamespace_ = ((Object) (s));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #65  <Field Object phpNamespace_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setPhpNamespaceBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x20000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:ldc2            #297 <Int 0x20000>
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			phpNamespace_ = ((Object) (bytestring));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #65  <Field Object phpNamespace_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setPyGenericServices(boolean flag)
	{
		bitField0_ = bitField0_ | 0x200;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field int bitField0_>
	//    3    5:sipush          512
	//    4    8:ior             
	//    5    9:putfield        #87  <Field int bitField0_>
		pyGenericServices_ = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #264 <Field boolean pyGenericServices_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #137 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$FileOptions$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #781 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #784 <Method DescriptorProtos$FileOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #784 <Method DescriptorProtos$FileOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #784 <Method DescriptorProtos$FileOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$FileOptions$Builder setSwiftPrefix(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x8000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:ldc2            #289 <Int 32768>
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			swiftPrefix_ = ((Object) (s));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #61  <Field Object swiftPrefix_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setSwiftPrefixBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #180 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #181 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x8000;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field int bitField0_>
	//    9   17:ldc2            #289 <Int 32768>
	//   10   20:ior             
	//   11   21:putfield        #87  <Field int bitField0_>
			swiftPrefix_ = ((Object) (bytestring));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #61  <Field Object swiftPrefix_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setUninterpretedOption(int i, Builder builder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.set(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #792 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #137 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   21   41:invokevirtual   #795 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$FileOptions$Builder setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(descriptorprotos$uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #180 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #181 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.set(i, ((Object) (descriptorprotos$uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #73  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #792 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #137 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (descriptorprotos$uninterpretedoption)));
	//   21   41:aload_0         
	//   22   42:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #795 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public final DescriptorProtos$FileOptions$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FileOptions$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #798 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #800 <Method DescriptorProtos$FileOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #800 <Method DescriptorProtos$FileOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private boolean ccEnableArenas_;
	private boolean ccGenericServices_;
	private Object csharpNamespace_;
	private boolean deprecated_;
	private Object goPackage_;
	private boolean javaGenerateEqualsAndHash_;
	private boolean javaGenericServices_;
	private boolean javaMultipleFiles_;
	private Object javaOuterClassname_;
	private Object javaPackage_;
	private boolean javaStringCheckUtf8_;
	private Object objcClassPrefix_;
	private int optimizeFor_;
	private Object phpClassPrefix_;
	private boolean phpGenericServices_;
	private Object phpNamespace_;
	private boolean pyGenericServices_;
	private Object swiftPrefix_;
	private RepeatedFieldBuilderV3 uninterpretedOptionBuilder_;
	private List uninterpretedOption_;

	private DescriptorProtos$FileOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void GeneratedMessageV3$ExtendableBuilder()>
		javaPackage_ = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #47  <String "">
	//    4    7:putfield        #49  <Field Object javaPackage_>
		javaOuterClassname_ = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #47  <String "">
	//    7   13:putfield        #51  <Field Object javaOuterClassname_>
		optimizeFor_ = 1;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #53  <Field int optimizeFor_>
		goPackage_ = "";
	//   11   21:aload_0         
	//   12   22:ldc1            #47  <String "">
	//   13   24:putfield        #55  <Field Object goPackage_>
		objcClassPrefix_ = "";
	//   14   27:aload_0         
	//   15   28:ldc1            #47  <String "">
	//   16   30:putfield        #57  <Field Object objcClassPrefix_>
		csharpNamespace_ = "";
	//   17   33:aload_0         
	//   18   34:ldc1            #47  <String "">
	//   19   36:putfield        #59  <Field Object csharpNamespace_>
		swiftPrefix_ = "";
	//   20   39:aload_0         
	//   21   40:ldc1            #47  <String "">
	//   22   42:putfield        #61  <Field Object swiftPrefix_>
		phpClassPrefix_ = "";
	//   23   45:aload_0         
	//   24   46:ldc1            #47  <String "">
	//   25   48:putfield        #63  <Field Object phpClassPrefix_>
		phpNamespace_ = "";
	//   26   51:aload_0         
	//   27   52:ldc1            #47  <String "">
	//   28   54:putfield        #65  <Field Object phpNamespace_>
		uninterpretedOption_ = Collections.emptyList();
	//   29   57:aload_0         
	//   30   58:invokestatic    #71  <Method List Collections.emptyList()>
	//   31   61:putfield        #73  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//   32   64:aload_0         
	//   33   65:invokespecial   #76  <Method void maybeForceBuilderInitialization()>
	//   34   68:return          
	}

	DescriptorProtos$FileOptions$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void DescriptorProtos$FileOptions$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$FileOptions$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void GeneratedMessageV3$ExtendableBuilder(GeneratedMessageV3$BuilderParent)>
		javaPackage_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #47  <String "">
	//    5    8:putfield        #49  <Field Object javaPackage_>
		javaOuterClassname_ = "";
	//    6   11:aload_0         
	//    7   12:ldc1            #47  <String "">
	//    8   14:putfield        #51  <Field Object javaOuterClassname_>
		optimizeFor_ = 1;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #53  <Field int optimizeFor_>
		goPackage_ = "";
	//   12   22:aload_0         
	//   13   23:ldc1            #47  <String "">
	//   14   25:putfield        #55  <Field Object goPackage_>
		objcClassPrefix_ = "";
	//   15   28:aload_0         
	//   16   29:ldc1            #47  <String "">
	//   17   31:putfield        #57  <Field Object objcClassPrefix_>
		csharpNamespace_ = "";
	//   18   34:aload_0         
	//   19   35:ldc1            #47  <String "">
	//   20   37:putfield        #59  <Field Object csharpNamespace_>
		swiftPrefix_ = "";
	//   21   40:aload_0         
	//   22   41:ldc1            #47  <String "">
	//   23   43:putfield        #61  <Field Object swiftPrefix_>
		phpClassPrefix_ = "";
	//   24   46:aload_0         
	//   25   47:ldc1            #47  <String "">
	//   26   49:putfield        #63  <Field Object phpClassPrefix_>
		phpNamespace_ = "";
	//   27   52:aload_0         
	//   28   53:ldc1            #47  <String "">
	//   29   55:putfield        #65  <Field Object phpNamespace_>
		uninterpretedOption_ = Collections.emptyList();
	//   30   58:aload_0         
	//   31   59:invokestatic    #71  <Method List Collections.emptyList()>
	//   32   62:putfield        #73  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//   33   65:aload_0         
	//   34   66:invokespecial   #76  <Method void maybeForceBuilderInitialization()>
	//   35   69:return          
	}

	DescriptorProtos$FileOptions$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void DescriptorProtos$FileOptions$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
