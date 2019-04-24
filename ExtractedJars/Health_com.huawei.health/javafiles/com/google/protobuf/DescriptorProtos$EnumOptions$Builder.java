// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, RepeatedFieldBuilderV3, GeneratedMessageV3, InvalidProtocolBufferException, 
//			Parser, Message, MessageLite, CodedInputStream, 
//			ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$EnumOptions$Builder extends GeneratedMessageV3$ExtendableBuilder
	implements 
{

	private void ensureUninterpretedOptionIsMutable()
	{
		if((bitField0_ & 4) != 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field int bitField0_>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:iconst_4        
	//*   5    7:icmpeq          35
		{
			uninterpretedOption_ = ((List) (new ArrayList(((java.util.Collection) (uninterpretedOption_)))));
	//    6   10:aload_0         
	//    7   11:new             #52  <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #36  <Field List uninterpretedOption_>
	//   11   19:invokespecial   #55  <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #36  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ | 4;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #50  <Field int bitField0_>
	//   16   30:iconst_4        
	//   17   31:ior             
	//   18   32:putfield        #50  <Field int bitField0_>
		}
	//   19   35:return          
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$20800();
	//    0    0:invokestatic    #60  <Method Descriptors$Descriptor DescriptorProtos.access$20800()>
	//    1    3:areturn         
	}

	private RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = uninterpretedOption_;
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field List uninterpretedOption_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 4) == 4)
	//*   6   12:aload_0         
	//*   7   13:getfield        #50  <Field int bitField0_>
	//*   8   16:iconst_4        
	//*   9   17:iand            
	//*  10   18:iconst_4        
	//*  11   19:icmpne          27
				flag = true;
	//   12   22:iconst_1        
	//   13   23:istore_1        
			else
	//*  14   24:goto            29
				flag = false;
	//   15   27:iconst_0        
	//   16   28:istore_1        
			uninterpretedOptionBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   29:aload_0         
	//   18   30:new             #66  <Class RepeatedFieldBuilderV3>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:invokevirtual   #70  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   40:aload_0         
	//   25   41:invokevirtual   #74  <Method boolean isClean()>
	//   26   44:invokespecial   #77  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   47:putfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			uninterpretedOption_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #36  <Field List uninterpretedOption_>
		}
		return uninterpretedOptionBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   33   59:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #84  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getUninterpretedOptionFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #86  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$EnumOptions$Builder addAllUninterpretedOption(Iterable iterable)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #90  <Method void ensureUninterpretedOptionIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, uninterpretedOption_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field List uninterpretedOption_>
	//    8   16:invokestatic    #96  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #99  <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #103 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$EnumOptions$Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.addExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #109 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (addExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #112 <Method DescriptorProtos$EnumOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #117 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #120 <Method DescriptorProtos$EnumOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #120 <Method DescriptorProtos$EnumOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #120 <Method DescriptorProtos$EnumOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder addUninterpretedOption(int i, Builder builder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #90  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #129 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #135 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #99  <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #129 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   20   40:invokevirtual   #139 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$EnumOptions$Builder addUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(descriptorprotos$uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #142 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #143 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #90  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(i, ((Object) (descriptorprotos$uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #135 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #99  <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (descriptorprotos$uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #139 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$EnumOptions$Builder addUninterpretedOption(Builder builder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #90  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field List uninterpretedOption_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #129 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//    9   19:invokeinterface #147 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #99  <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #129 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   19   39:invokevirtual   #150 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$EnumOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(descriptorprotos$uninterpretedoption == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #142 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #143 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #90  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(((Object) (descriptorprotos$uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field List uninterpretedOption_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #147 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #99  <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (descriptorprotos$uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #150 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
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
	//    1    1:invokespecial   #86  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokestatic    #158 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    3    7:invokevirtual   #162 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #125 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   13:areturn         
	}

	public Builder addUninterpretedOptionBuilder(int i)
	{
		return (Builder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos$UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #158 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    4    8:invokevirtual   #166 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #125 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos.EnumOptions build()
	{
		DescriptorProtos.EnumOptions enumoptions = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #170 <Method DescriptorProtos$EnumOptions buildPartial()>
	//    2    4:astore_1        
		if(!enumoptions.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #173 <Method boolean DescriptorProtos$EnumOptions.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (enumoptions)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #177 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return enumoptions;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method DescriptorProtos$EnumOptions build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method DescriptorProtos$EnumOptions build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.EnumOptions buildPartial()
	{
		DescriptorProtos.EnumOptions enumoptions = new DescriptorProtos.EnumOptions(((GeneratedMessageV3$ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$EnumOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #184 <Method void DescriptorProtos$EnumOptions(GeneratedMessageV3$ExtendableBuilder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #50  <Field int bitField0_>
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
		DescriptorProtos.EnumOptions.access$21302(enumoptions, allowAlias_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #186 <Field boolean allowAlias_>
	//   21   33:invokestatic    #190 <Method boolean DescriptorProtos$EnumOptions.access$21302(DescriptorProtos$EnumOptions, boolean)>
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
		DescriptorProtos.EnumOptions.access$21402(enumoptions, deprecated_);
	//   34   50:aload           4
	//   35   52:aload_0         
	//   36   53:getfield        #192 <Field boolean deprecated_>
	//   37   56:invokestatic    #195 <Method boolean DescriptorProtos$EnumOptions.access$21402(DescriptorProtos$EnumOptions, boolean)>
	//   38   59:pop             
		if(uninterpretedOptionBuilder_ == null)
	//*  39   60:aload_0         
	//*  40   61:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  41   64:ifnonnull       112
		{
			if((bitField0_ & 4) == 4)
	//*  42   67:aload_0         
	//*  43   68:getfield        #50  <Field int bitField0_>
	//*  44   71:iconst_4        
	//*  45   72:iand            
	//*  46   73:iconst_4        
	//*  47   74:icmpne          99
			{
				uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//   48   77:aload_0         
	//   49   78:aload_0         
	//   50   79:getfield        #36  <Field List uninterpretedOption_>
	//   51   82:invokestatic    #199 <Method List Collections.unmodifiableList(List)>
	//   52   85:putfield        #36  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & -5;
	//   53   88:aload_0         
	//   54   89:aload_0         
	//   55   90:getfield        #50  <Field int bitField0_>
	//   56   93:bipush          -5
	//   57   95:iand            
	//   58   96:putfield        #50  <Field int bitField0_>
			}
			DescriptorProtos.EnumOptions.access$21502(enumoptions, uninterpretedOption_);
	//   59   99:aload           4
	//   60  101:aload_0         
	//   61  102:getfield        #36  <Field List uninterpretedOption_>
	//   62  105:invokestatic    #203 <Method List DescriptorProtos$EnumOptions.access$21502(DescriptorProtos$EnumOptions, List)>
	//   63  108:pop             
		} else
	//*  64  109:goto            125
		{
			DescriptorProtos.EnumOptions.access$21502(enumoptions, uninterpretedOptionBuilder_.build());
	//   65  112:aload           4
	//   66  114:aload_0         
	//   67  115:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   68  118:invokevirtual   #205 <Method List RepeatedFieldBuilderV3.build()>
	//   69  121:invokestatic    #203 <Method List DescriptorProtos$EnumOptions.access$21502(DescriptorProtos$EnumOptions, List)>
	//   70  124:pop             
		}
		DescriptorProtos.EnumOptions.access$21602(enumoptions, j);
	//   71  125:aload           4
	//   72  127:iload_2         
	//   73  128:invokestatic    #209 <Method int DescriptorProtos$EnumOptions.access$21602(DescriptorProtos$EnumOptions, int)>
	//   74  131:pop             
		onBuilt();
	//   75  132:aload_0         
	//   76  133:invokevirtual   #212 <Method void onBuilt()>
		return enumoptions;
	//   77  136:aload           4
	//   78  138:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #170 <Method DescriptorProtos$EnumOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #170 <Method DescriptorProtos$EnumOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$EnumOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #220 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clear()>
	//    2    4:pop             
		allowAlias_ = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #186 <Field boolean allowAlias_>
		bitField0_ = bitField0_ & -2;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #50  <Field int bitField0_>
	//    9   15:bipush          -2
	//   10   17:iand            
	//   11   18:putfield        #50  <Field int bitField0_>
		deprecated_ = false;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #192 <Field boolean deprecated_>
		bitField0_ = bitField0_ & -3;
	//   15   26:aload_0         
	//   16   27:aload_0         
	//   17   28:getfield        #50  <Field int bitField0_>
	//   18   31:bipush          -3
	//   19   33:iand            
	//   20   34:putfield        #50  <Field int bitField0_>
		if(uninterpretedOptionBuilder_ == null)
	//*  21   37:aload_0         
	//*  22   38:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  23   41:ifnonnull       64
		{
			uninterpretedOption_ = Collections.emptyList();
	//   24   44:aload_0         
	//   25   45:invokestatic    #34  <Method List Collections.emptyList()>
	//   26   48:putfield        #36  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & -5;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #50  <Field int bitField0_>
	//   30   56:bipush          -5
	//   31   58:iand            
	//   32   59:putfield        #50  <Field int bitField0_>
			return this;
	//   33   62:aload_0         
	//   34   63:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   35   64:aload_0         
	//   36   65:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   37   68:invokevirtual   #222 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   38   71:aload_0         
	//   39   72:areturn         
		}
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$EnumOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder clear()
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$EnumOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$EnumOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$EnumOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder clearAllowAlias()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #50  <Field int bitField0_>
		allowAlias_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #186 <Field boolean allowAlias_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #99  <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder clearDeprecated()
	{
		bitField0_ = bitField0_ & -3;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field int bitField0_>
	//    3    5:bipush          -3
	//    4    7:iand            
	//    5    8:putfield        #50  <Field int bitField0_>
		deprecated_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #192 <Field boolean deprecated_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #99  <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.clearExtension(generatedextension);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #232 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (clearExtension(generatedextension)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #235 <Method DescriptorProtos$EnumOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #240 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #243 <Method DescriptorProtos$EnumOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #243 <Method DescriptorProtos$EnumOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #243 <Method DescriptorProtos$EnumOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #249 <Method DescriptorProtos$EnumOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #252 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #249 <Method DescriptorProtos$EnumOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #249 <Method DescriptorProtos$EnumOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder clearUninterpretedOption()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			uninterpretedOption_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #34  <Method List Collections.emptyList()>
	//    5   11:putfield        #36  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & -5;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #50  <Field int bitField0_>
	//    9   19:bipush          -5
	//   10   21:iand            
	//   11   22:putfield        #50  <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #99  <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   35:invokevirtual   #222 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder clone()
	{
		return (DescriptorProtos$EnumOptions$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumOptions$Builder clone()>
	//    2    4:areturn         
	}

	public boolean getAllowAlias()
	{
		return allowAlias_;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field boolean allowAlias_>
	//    2    4:ireturn         
	}

	public DescriptorProtos.EnumOptions getDefaultInstanceForType()
	{
		return DescriptorProtos.EnumOptions.getDefaultInstance();
	//    0    0:invokestatic    #268 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #270 <Method DescriptorProtos$EnumOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #270 <Method DescriptorProtos$EnumOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$20800();
	//    0    0:invokestatic    #60  <Method Descriptors$Descriptor DescriptorProtos.access$20800()>
	//    1    3:areturn         
	}

	public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos$UninterpretedOption)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #278 <Method Object List.get(int)>
	//    7   17:checkcast       #155 <Class DescriptorProtos$UninterpretedOption>
	//    8   20:areturn         
		else
			return (DescriptorProtos$UninterpretedOption)uninterpretedOptionBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #282 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #155 <Class DescriptorProtos$UninterpretedOption>
	//   14   32:areturn         
	}

	public Builder getUninterpretedOptionBuilder(int i)
	{
		return (Builder)getUninterpretedOptionFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #125 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   11:areturn         
	}

	public List getUninterpretedOptionBuilderList()
	{
		return getUninterpretedOptionFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokevirtual   #291 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       17
			return uninterpretedOption_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field List uninterpretedOption_>
	//    5   11:invokeinterface #297 <Method int List.size()>
	//    6   16:ireturn         
		else
			return uninterpretedOptionBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   21:invokevirtual   #300 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(uninterpretedOption_);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field List uninterpretedOption_>
	//    5   11:invokestatic    #199 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return uninterpretedOptionBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   19:invokevirtual   #304 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public rBuilder getUninterpretedOptionOrBuilder(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (rBuilder)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #278 <Method Object List.get(int)>
	//    7   17:checkcast       #309 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    8   20:areturn         
		else
			return (rBuilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #313 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #309 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//   14   32:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		if(uninterpretedOptionBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnull          15
			return uninterpretedOptionBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    5   11:invokevirtual   #317 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(uninterpretedOption_);
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field List uninterpretedOption_>
	//    9   19:invokestatic    #199 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public boolean hasAllowAlias()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasDeprecated()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	protected  internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$20900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumOptions, com/google/protobuf/DescriptorProtos$EnumOptions$Builder);
	//    0    0:invokestatic    #325 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$20900()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$EnumOptions>
	//    2    5:ldc1            #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    3    7:invokevirtual   #331 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < getUninterpretedOptionCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #333 <Method int getUninterpretedOptionCount()>
	//*   5    7:icmpge          30
			if(!getUninterpretedOption(i).isInitialized())
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #335 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*   9   15:invokevirtual   #336 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
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
	//   19   31:invokevirtual   #339 <Method boolean extensionsAreInitialized()>
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
	//    3    3:invokevirtual   #346 <Method DescriptorProtos$EnumOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #350 <Method DescriptorProtos$EnumOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #346 <Method DescriptorProtos$EnumOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumOptions)DescriptorProtos.EnumOptions.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #357 <Field Parser DescriptorProtos$EnumOptions.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #363 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$EnumOptions>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.EnumOptions) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #366 <Method DescriptorProtos$EnumOptions$Builder mergeFrom(DescriptorProtos$EnumOptions)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #369 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$EnumOptions>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #373 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #366 <Method DescriptorProtos$EnumOptions$Builder mergeFrom(DescriptorProtos$EnumOptions)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumOptions)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.EnumOptions) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$EnumOptions$Builder mergeFrom(DescriptorProtos.EnumOptions enumoptions)
	{
		if(enumoptions == DescriptorProtos.EnumOptions.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #268 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(enumoptions.hasAllowAlias())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #375 <Method boolean DescriptorProtos$EnumOptions.hasAllowAlias()>
	//*   7   13:ifeq            25
			setAllowAlias(enumoptions.getAllowAlias());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #377 <Method boolean DescriptorProtos$EnumOptions.getAllowAlias()>
	//   11   21:invokevirtual   #381 <Method DescriptorProtos$EnumOptions$Builder setAllowAlias(boolean)>
	//   12   24:pop             
		if(enumoptions.hasDeprecated())
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #383 <Method boolean DescriptorProtos$EnumOptions.hasDeprecated()>
	//*  15   29:ifeq            41
			setDeprecated(enumoptions.getDeprecated());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #385 <Method boolean DescriptorProtos$EnumOptions.getDeprecated()>
	//   19   37:invokevirtual   #388 <Method DescriptorProtos$EnumOptions$Builder setDeprecated(boolean)>
	//   20   40:pop             
		if(uninterpretedOptionBuilder_ == null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  23   45:ifnonnull       119
		{
			if(!DescriptorProtos.EnumOptions.access$21500(enumoptions).isEmpty())
	//*  24   48:aload_1         
	//*  25   49:invokestatic    #392 <Method List DescriptorProtos$EnumOptions.access$21500(DescriptorProtos$EnumOptions)>
	//*  26   52:invokeinterface #395 <Method boolean List.isEmpty()>
	//*  27   57:ifne            208
			{
				if(uninterpretedOption_.isEmpty())
	//*  28   60:aload_0         
	//*  29   61:getfield        #36  <Field List uninterpretedOption_>
	//*  30   64:invokeinterface #395 <Method boolean List.isEmpty()>
	//*  31   69:ifeq            94
				{
					uninterpretedOption_ = DescriptorProtos.EnumOptions.access$21500(enumoptions);
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:invokestatic    #392 <Method List DescriptorProtos$EnumOptions.access$21500(DescriptorProtos$EnumOptions)>
	//   35   77:putfield        #36  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & -5;
	//   36   80:aload_0         
	//   37   81:aload_0         
	//   38   82:getfield        #50  <Field int bitField0_>
	//   39   85:bipush          -5
	//   40   87:iand            
	//   41   88:putfield        #50  <Field int bitField0_>
				} else
	//*  42   91:goto            112
				{
					ensureUninterpretedOptionIsMutable();
	//   43   94:aload_0         
	//   44   95:invokespecial   #90  <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.addAll(((java.util.Collection) (DescriptorProtos.EnumOptions.access$21500(enumoptions))));
	//   45   98:aload_0         
	//   46   99:getfield        #36  <Field List uninterpretedOption_>
	//   47  102:aload_1         
	//   48  103:invokestatic    #392 <Method List DescriptorProtos$EnumOptions.access$21500(DescriptorProtos$EnumOptions)>
	//   49  106:invokeinterface #398 <Method boolean List.addAll(java.util.Collection)>
	//   50  111:pop             
				}
				onChanged();
	//   51  112:aload_0         
	//   52  113:invokevirtual   #99  <Method void onChanged()>
			}
		} else
	//*  53  116:goto            208
		if(!DescriptorProtos.EnumOptions.access$21500(enumoptions).isEmpty())
	//*  54  119:aload_1         
	//*  55  120:invokestatic    #392 <Method List DescriptorProtos$EnumOptions.access$21500(DescriptorProtos$EnumOptions)>
	//*  56  123:invokeinterface #395 <Method boolean List.isEmpty()>
	//*  57  128:ifne            208
			if(uninterpretedOptionBuilder_.isEmpty())
	//*  58  131:aload_0         
	//*  59  132:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  60  135:invokevirtual   #399 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  61  138:ifeq            196
			{
				uninterpretedOptionBuilder_.dispose();
	//   62  141:aload_0         
	//   63  142:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   64  145:invokevirtual   #402 <Method void RepeatedFieldBuilderV3.dispose()>
				uninterpretedOptionBuilder_ = null;
	//   65  148:aload_0         
	//   66  149:aconst_null     
	//   67  150:putfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				uninterpretedOption_ = DescriptorProtos.EnumOptions.access$21500(enumoptions);
	//   68  153:aload_0         
	//   69  154:aload_1         
	//   70  155:invokestatic    #392 <Method List DescriptorProtos$EnumOptions.access$21500(DescriptorProtos$EnumOptions)>
	//   71  158:putfield        #36  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & -5;
	//   72  161:aload_0         
	//   73  162:aload_0         
	//   74  163:getfield        #50  <Field int bitField0_>
	//   75  166:bipush          -5
	//   76  168:iand            
	//   77  169:putfield        #50  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*  78  172:getstatic       #84  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*  79  175:ifeq            186
					repeatedfieldbuilderv3 = getUninterpretedOptionFieldBuilder();
	//   80  178:aload_0         
	//   81  179:invokespecial   #86  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//   82  182:astore_2        
				else
	//*  83  183:goto            188
					repeatedfieldbuilderv3 = null;
	//   84  186:aconst_null     
	//   85  187:astore_2        
				uninterpretedOptionBuilder_ = repeatedfieldbuilderv3;
	//   86  188:aload_0         
	//   87  189:aload_2         
	//   88  190:putfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			} else
	//*  89  193:goto            208
			{
				uninterpretedOptionBuilder_.addAllMessages(((Iterable) (DescriptorProtos.EnumOptions.access$21500(enumoptions))));
	//   90  196:aload_0         
	//   91  197:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   92  200:aload_1         
	//   93  201:invokestatic    #392 <Method List DescriptorProtos$EnumOptions.access$21500(DescriptorProtos$EnumOptions)>
	//   94  204:invokevirtual   #103 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   95  207:pop             
			}
		mergeExtensionFields(((GeneratedMessageV3$ExtendableMessage) (enumoptions)));
	//   96  208:aload_0         
	//   97  209:aload_1         
	//   98  210:invokevirtual   #406 <Method void mergeExtensionFields(GeneratedMessageV3$ExtendableMessage)>
		mergeUnknownFields(enumoptions.unknownFields);
	//   99  213:aload_0         
	//  100  214:aload_1         
	//  101  215:getfield        #410 <Field UnknownFieldSet DescriptorProtos$EnumOptions.unknownFields>
	//  102  218:invokevirtual   #414 <Method DescriptorProtos$EnumOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//  103  221:pop             
		onChanged();
	//  104  222:aload_0         
	//  105  223:invokevirtual   #99  <Method void onChanged()>
		return this;
	//  106  226:aload_0         
	//  107  227:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.EnumOptions)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$EnumOptions>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.EnumOptions)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$EnumOptions>
	//    6   12:invokevirtual   #366 <Method DescriptorProtos$EnumOptions$Builder mergeFrom(DescriptorProtos$EnumOptions)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #416 <Method AbstractMessage$Builder GeneratedMessageV3$ExtendableBuilder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #346 <Method DescriptorProtos$EnumOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #350 <Method DescriptorProtos$EnumOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #346 <Method DescriptorProtos$EnumOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #414 <Method DescriptorProtos$EnumOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$EnumOptions$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #423 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #414 <Method DescriptorProtos$EnumOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #414 <Method DescriptorProtos$EnumOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder removeUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #90  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #429 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #99  <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			uninterpretedOptionBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #432 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$EnumOptions$Builder setAllowAlias(boolean flag)
	{
		bitField0_ = bitField0_ | 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field int bitField0_>
	//    3    5:iconst_1        
	//    4    6:ior             
	//    5    7:putfield        #50  <Field int bitField0_>
		allowAlias_ = flag;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #186 <Field boolean allowAlias_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #99  <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder setDeprecated(boolean flag)
	{
		bitField0_ = bitField0_ | 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field int bitField0_>
	//    3    5:iconst_2        
	//    4    6:ior             
	//    5    7:putfield        #50  <Field int bitField0_>
		deprecated_ = flag;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #192 <Field boolean deprecated_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #99  <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.setExtension(generatedextension, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #437 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    6   10:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.setExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #440 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (setExtension(generatedextension, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #443 <Method DescriptorProtos$EnumOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (setExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #445 <Method DescriptorProtos$EnumOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #448 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #450 <Method DescriptorProtos$EnumOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #450 <Method DescriptorProtos$EnumOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #450 <Method DescriptorProtos$EnumOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #455 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #458 <Method DescriptorProtos$EnumOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3$ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3$ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #458 <Method DescriptorProtos$EnumOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #458 <Method DescriptorProtos$EnumOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$EnumOptions$Builder setUninterpretedOption(int i, Builder builder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #90  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.set(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #129 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #464 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #99  <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #129 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   21   41:invokevirtual   #467 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$EnumOptions$Builder setUninterpretedOption(int i, DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(descriptorprotos$uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #142 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #143 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #90  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.set(i, ((Object) (descriptorprotos$uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #464 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #99  <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (descriptorprotos$uninterpretedoption)));
	//   21   41:aload_0         
	//   22   42:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #467 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public final DescriptorProtos$EnumOptions$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$EnumOptions$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #470 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #472 <Method DescriptorProtos$EnumOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #472 <Method DescriptorProtos$EnumOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private boolean allowAlias_;
	private int bitField0_;
	private boolean deprecated_;
	private RepeatedFieldBuilderV3 uninterpretedOptionBuilder_;
	private List uninterpretedOption_;

	private DescriptorProtos$EnumOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void GeneratedMessageV3$ExtendableBuilder()>
		uninterpretedOption_ = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #34  <Method List Collections.emptyList()>
	//    4    8:putfield        #36  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//    5   11:aload_0         
	//    6   12:invokespecial   #39  <Method void maybeForceBuilderInitialization()>
	//    7   15:return          
	}

	DescriptorProtos$EnumOptions$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void DescriptorProtos$EnumOptions$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$EnumOptions$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void GeneratedMessageV3$ExtendableBuilder(GeneratedMessageV3$BuilderParent)>
		uninterpretedOption_ = Collections.emptyList();
	//    3    5:aload_0         
	//    4    6:invokestatic    #34  <Method List Collections.emptyList()>
	//    5    9:putfield        #36  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//    6   12:aload_0         
	//    7   13:invokespecial   #39  <Method void maybeForceBuilderInitialization()>
	//    8   16:return          
	}

	DescriptorProtos$EnumOptions$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void DescriptorProtos$EnumOptions$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
