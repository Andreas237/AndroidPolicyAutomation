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

public static final class DescriptorProtos$ExtensionRangeOptions$Builder extends GeneratedMessageV3.ExtendableBuilder
	implements 
{

	private void ensureUninterpretedOptionIsMutable()
	{
		if((bitField0_ & 1) != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          35
		{
			uninterpretedOption_ = ((List) (new ArrayList(((java.util.Collection) (uninterpretedOption_)))));
	//    6   10:aload_0         
	//    7   11:new             #49  <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field List uninterpretedOption_>
	//   11   19:invokespecial   #52  <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #33  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ | 1;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #47  <Field int bitField0_>
	//   16   30:iconst_1        
	//   17   31:ior             
	//   18   32:putfield        #47  <Field int bitField0_>
		}
	//   19   35:return          
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$6200();
	//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$6200()>
	//    1    3:areturn         
	}

	private RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = uninterpretedOption_;
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List uninterpretedOption_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 1) == 1)
	//*   6   12:aload_0         
	//*   7   13:getfield        #47  <Field int bitField0_>
	//*   8   16:iconst_1        
	//*   9   17:iand            
	//*  10   18:iconst_1        
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
	//   18   30:new             #63  <Class RepeatedFieldBuilderV3>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:invokevirtual   #67  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   40:aload_0         
	//   25   41:invokevirtual   #71  <Method boolean isClean()>
	//   26   44:invokespecial   #74  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   47:putfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			uninterpretedOption_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #33  <Field List uninterpretedOption_>
		}
		return uninterpretedOptionBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   33   59:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #82  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getUninterpretedOptionFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #84  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder addAllUninterpretedOption(Iterable iterable)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureUninterpretedOptionIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, uninterpretedOption_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field List uninterpretedOption_>
	//    8   16:invokestatic    #94  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #101 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.addExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #107 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (addExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #110 <Method DescriptorProtos$ExtensionRangeOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #115 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #118 <Method DescriptorProtos$ExtensionRangeOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #118 <Method DescriptorProtos$ExtensionRangeOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #118 <Method DescriptorProtos$ExtensionRangeOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #127 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #133 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #127 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   20   40:invokevirtual   #137 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #140 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #141 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #88  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(i, ((Object) (uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #133 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #97  <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #137 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption.Builder builder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List uninterpretedOption_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #127 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//    9   19:invokeinterface #145 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #127 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   19   39:invokevirtual   #148 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(uninterpretedoption == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #140 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #141 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #88  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(((Object) (uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field List uninterpretedOption_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #145 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #97  <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #148 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder()
	{
		return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokestatic    #156 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    3    7:invokevirtual   #160 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #123 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   13:areturn         
	}

	public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder(int i)
	{
		return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #156 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    4    8:invokevirtual   #164 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #123 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos.ExtensionRangeOptions build()
	{
		DescriptorProtos.ExtensionRangeOptions extensionrangeoptions = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method DescriptorProtos$ExtensionRangeOptions buildPartial()>
	//    2    4:astore_1        
		if(!extensionrangeoptions.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #171 <Method boolean DescriptorProtos$ExtensionRangeOptions.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (extensionrangeoptions)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #175 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return extensionrangeoptions;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method DescriptorProtos$ExtensionRangeOptions build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method DescriptorProtos$ExtensionRangeOptions build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.ExtensionRangeOptions buildPartial()
	{
		DescriptorProtos.ExtensionRangeOptions extensionrangeoptions = new DescriptorProtos.ExtensionRangeOptions(((GeneratedMessageV3.ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$ExtensionRangeOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #182 <Method void DescriptorProtos$ExtensionRangeOptions(GeneratedMessageV3$ExtendableBuilder, DescriptorProtos$1)>
	//    5    9:astore_2        
		int i = bitField0_;
	//    6   10:aload_0         
	//    7   11:getfield        #47  <Field int bitField0_>
	//    8   14:istore_1        
		if(uninterpretedOptionBuilder_ == null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  11   19:ifnonnull       66
		{
			if((bitField0_ & 1) == 1)
	//*  12   22:aload_0         
	//*  13   23:getfield        #47  <Field int bitField0_>
	//*  14   26:iconst_1        
	//*  15   27:iand            
	//*  16   28:iconst_1        
	//*  17   29:icmpne          54
			{
				uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #33  <Field List uninterpretedOption_>
	//   21   37:invokestatic    #186 <Method List Collections.unmodifiableList(List)>
	//   22   40:putfield        #33  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & -2;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #47  <Field int bitField0_>
	//   26   48:bipush          -2
	//   27   50:iand            
	//   28   51:putfield        #47  <Field int bitField0_>
			}
			DescriptorProtos.ExtensionRangeOptions.access$6702(extensionrangeoptions, uninterpretedOption_);
	//   29   54:aload_2         
	//   30   55:aload_0         
	//   31   56:getfield        #33  <Field List uninterpretedOption_>
	//   32   59:invokestatic    #190 <Method List DescriptorProtos$ExtensionRangeOptions.access$6702(DescriptorProtos$ExtensionRangeOptions, List)>
	//   33   62:pop             
		} else
	//*  34   63:goto            78
		{
			DescriptorProtos.ExtensionRangeOptions.access$6702(extensionrangeoptions, uninterpretedOptionBuilder_.build());
	//   35   66:aload_2         
	//   36   67:aload_0         
	//   37   68:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   38   71:invokevirtual   #192 <Method List RepeatedFieldBuilderV3.build()>
	//   39   74:invokestatic    #190 <Method List DescriptorProtos$ExtensionRangeOptions.access$6702(DescriptorProtos$ExtensionRangeOptions, List)>
	//   40   77:pop             
		}
		onBuilt();
	//   41   78:aload_0         
	//   42   79:invokevirtual   #195 <Method void onBuilt()>
		return extensionrangeoptions;
	//   43   82:aload_2         
	//   44   83:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method DescriptorProtos$ExtensionRangeOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method DescriptorProtos$ExtensionRangeOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method DescriptorProtos$ExtensionRangeOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #203 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clear()>
	//    2    4:pop             
		if(uninterpretedOptionBuilder_ == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   5    9:ifnonnull       32
		{
			uninterpretedOption_ = Collections.emptyList();
	//    6   12:aload_0         
	//    7   13:invokestatic    #31  <Method List Collections.emptyList()>
	//    8   16:putfield        #33  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & -2;
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field int bitField0_>
	//   12   24:bipush          -2
	//   13   26:iand            
	//   14   27:putfield        #47  <Field int bitField0_>
			return this;
	//   15   30:aload_0         
	//   16   31:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   17   32:aload_0         
	//   18   33:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   19   36:invokevirtual   #205 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   20   39:aload_0         
	//   21   40:areturn         
		}
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method DescriptorProtos$ExtensionRangeOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clear()
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method DescriptorProtos$ExtensionRangeOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method DescriptorProtos$ExtensionRangeOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method DescriptorProtos$ExtensionRangeOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.clearExtension(generatedextension);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #213 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clearExtension(generatedextension)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #216 <Method DescriptorProtos$ExtensionRangeOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #221 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #224 <Method DescriptorProtos$ExtensionRangeOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #224 <Method DescriptorProtos$ExtensionRangeOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #224 <Method DescriptorProtos$ExtensionRangeOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #230 <Method DescriptorProtos$ExtensionRangeOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #233 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #230 <Method DescriptorProtos$ExtensionRangeOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #230 <Method DescriptorProtos$ExtensionRangeOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder clearUninterpretedOption()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			uninterpretedOption_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #31  <Method List Collections.emptyList()>
	//    5   11:putfield        #33  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & -2;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #47  <Field int bitField0_>
	//    9   19:bipush          -2
	//   10   21:iand            
	//   11   22:putfield        #47  <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   35:invokevirtual   #205 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method DescriptorProtos$ExtensionRangeOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method DescriptorProtos$ExtensionRangeOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder clone()
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #241 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method DescriptorProtos$ExtensionRangeOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method DescriptorProtos$ExtensionRangeOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method DescriptorProtos$ExtensionRangeOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method DescriptorProtos$ExtensionRangeOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.ExtensionRangeOptions getDefaultInstanceForType()
	{
		return DescriptorProtos.ExtensionRangeOptions.getDefaultInstance();
	//    0    0:invokestatic    #248 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method DescriptorProtos$ExtensionRangeOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method DescriptorProtos$ExtensionRangeOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$6200();
	//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$6200()>
	//    1    3:areturn         
	}

	public DescriptorProtos.UninterpretedOption getUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.UninterpretedOption)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #257 <Method Object List.get(int)>
	//    7   17:checkcast       #153 <Class DescriptorProtos$UninterpretedOption>
	//    8   20:areturn         
		else
			return (DescriptorProtos.UninterpretedOption)uninterpretedOptionBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #261 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #153 <Class DescriptorProtos$UninterpretedOption>
	//   14   32:areturn         
	}

	public DescriptorProtos.UninterpretedOption.Builder getUninterpretedOptionBuilder(int i)
	{
		return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #266 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #123 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   11:areturn         
	}

	public List getUninterpretedOptionBuilderList()
	{
		return getUninterpretedOptionFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokevirtual   #270 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       17
			return uninterpretedOption_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List uninterpretedOption_>
	//    5   11:invokeinterface #276 <Method int List.size()>
	//    6   16:ireturn         
		else
			return uninterpretedOptionBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   21:invokevirtual   #279 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(uninterpretedOption_);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List uninterpretedOption_>
	//    5   11:invokestatic    #186 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return uninterpretedOptionBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   19:invokevirtual   #283 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public DescriptorProtos.UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #257 <Method Object List.get(int)>
	//    7   17:checkcast       #288 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    8   20:areturn         
		else
			return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #292 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #288 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//   14   32:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		if(uninterpretedOptionBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnull          15
			return uninterpretedOptionBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    5   11:invokevirtual   #296 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(uninterpretedOption_);
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field List uninterpretedOption_>
	//    9   19:invokestatic    #186 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$6300().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$ExtensionRangeOptions, com/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Builder);
	//    0    0:invokestatic    #302 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$6300()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$ExtensionRangeOptions>
	//    2    5:ldc1            #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    3    7:invokevirtual   #308 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < getUninterpretedOptionCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #310 <Method int getUninterpretedOptionCount()>
	//*   5    7:icmpge          30
			if(!getUninterpretedOption(i).isInitialized())
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #312 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*   9   15:invokevirtual   #313 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
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
	//   19   31:invokevirtual   #316 <Method boolean extensionsAreInitialized()>
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
	//    3    3:invokevirtual   #323 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #327 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #323 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.ExtensionRangeOptions)DescriptorProtos.ExtensionRangeOptions.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #334 <Field Parser DescriptorProtos$ExtensionRangeOptions.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #340 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$ExtensionRangeOptions>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.ExtensionRangeOptions) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #343 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(DescriptorProtos$ExtensionRangeOptions)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #346 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$ExtensionRangeOptions>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #350 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #343 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(DescriptorProtos$ExtensionRangeOptions)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.ExtensionRangeOptions)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.ExtensionRangeOptions) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(DescriptorProtos.ExtensionRangeOptions extensionrangeoptions)
	{
		if(extensionrangeoptions == DescriptorProtos.ExtensionRangeOptions.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #248 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(uninterpretedOptionBuilder_ == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   7   13:ifnonnull       87
		{
			if(!DescriptorProtos.ExtensionRangeOptions.access$6700(extensionrangeoptions).isEmpty())
	//*   8   16:aload_1         
	//*   9   17:invokestatic    #354 <Method List DescriptorProtos$ExtensionRangeOptions.access$6700(DescriptorProtos$ExtensionRangeOptions)>
	//*  10   20:invokeinterface #357 <Method boolean List.isEmpty()>
	//*  11   25:ifne            176
			{
				if(uninterpretedOption_.isEmpty())
	//*  12   28:aload_0         
	//*  13   29:getfield        #33  <Field List uninterpretedOption_>
	//*  14   32:invokeinterface #357 <Method boolean List.isEmpty()>
	//*  15   37:ifeq            62
				{
					uninterpretedOption_ = DescriptorProtos.ExtensionRangeOptions.access$6700(extensionrangeoptions);
	//   16   40:aload_0         
	//   17   41:aload_1         
	//   18   42:invokestatic    #354 <Method List DescriptorProtos$ExtensionRangeOptions.access$6700(DescriptorProtos$ExtensionRangeOptions)>
	//   19   45:putfield        #33  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & -2;
	//   20   48:aload_0         
	//   21   49:aload_0         
	//   22   50:getfield        #47  <Field int bitField0_>
	//   23   53:bipush          -2
	//   24   55:iand            
	//   25   56:putfield        #47  <Field int bitField0_>
				} else
	//*  26   59:goto            80
				{
					ensureUninterpretedOptionIsMutable();
	//   27   62:aload_0         
	//   28   63:invokespecial   #88  <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.addAll(((java.util.Collection) (DescriptorProtos.ExtensionRangeOptions.access$6700(extensionrangeoptions))));
	//   29   66:aload_0         
	//   30   67:getfield        #33  <Field List uninterpretedOption_>
	//   31   70:aload_1         
	//   32   71:invokestatic    #354 <Method List DescriptorProtos$ExtensionRangeOptions.access$6700(DescriptorProtos$ExtensionRangeOptions)>
	//   33   74:invokeinterface #360 <Method boolean List.addAll(java.util.Collection)>
	//   34   79:pop             
				}
				onChanged();
	//   35   80:aload_0         
	//   36   81:invokevirtual   #97  <Method void onChanged()>
			}
		} else
	//*  37   84:goto            176
		if(!DescriptorProtos.ExtensionRangeOptions.access$6700(extensionrangeoptions).isEmpty())
	//*  38   87:aload_1         
	//*  39   88:invokestatic    #354 <Method List DescriptorProtos$ExtensionRangeOptions.access$6700(DescriptorProtos$ExtensionRangeOptions)>
	//*  40   91:invokeinterface #357 <Method boolean List.isEmpty()>
	//*  41   96:ifne            176
			if(uninterpretedOptionBuilder_.isEmpty())
	//*  42   99:aload_0         
	//*  43  100:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  44  103:invokevirtual   #361 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  45  106:ifeq            164
			{
				uninterpretedOptionBuilder_.dispose();
	//   46  109:aload_0         
	//   47  110:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   48  113:invokevirtual   #364 <Method void RepeatedFieldBuilderV3.dispose()>
				uninterpretedOptionBuilder_ = null;
	//   49  116:aload_0         
	//   50  117:aconst_null     
	//   51  118:putfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				uninterpretedOption_ = DescriptorProtos.ExtensionRangeOptions.access$6700(extensionrangeoptions);
	//   52  121:aload_0         
	//   53  122:aload_1         
	//   54  123:invokestatic    #354 <Method List DescriptorProtos$ExtensionRangeOptions.access$6700(DescriptorProtos$ExtensionRangeOptions)>
	//   55  126:putfield        #33  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & -2;
	//   56  129:aload_0         
	//   57  130:aload_0         
	//   58  131:getfield        #47  <Field int bitField0_>
	//   59  134:bipush          -2
	//   60  136:iand            
	//   61  137:putfield        #47  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*  62  140:getstatic       #82  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*  63  143:ifeq            154
					repeatedfieldbuilderv3 = getUninterpretedOptionFieldBuilder();
	//   64  146:aload_0         
	//   65  147:invokespecial   #84  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//   66  150:astore_2        
				else
	//*  67  151:goto            156
					repeatedfieldbuilderv3 = null;
	//   68  154:aconst_null     
	//   69  155:astore_2        
				uninterpretedOptionBuilder_ = repeatedfieldbuilderv3;
	//   70  156:aload_0         
	//   71  157:aload_2         
	//   72  158:putfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			} else
	//*  73  161:goto            176
			{
				uninterpretedOptionBuilder_.addAllMessages(((Iterable) (DescriptorProtos.ExtensionRangeOptions.access$6700(extensionrangeoptions))));
	//   74  164:aload_0         
	//   75  165:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   76  168:aload_1         
	//   77  169:invokestatic    #354 <Method List DescriptorProtos$ExtensionRangeOptions.access$6700(DescriptorProtos$ExtensionRangeOptions)>
	//   78  172:invokevirtual   #101 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   79  175:pop             
			}
		mergeExtensionFields(((GeneratedMessageV3.ExtendableMessage) (extensionrangeoptions)));
	//   80  176:aload_0         
	//   81  177:aload_1         
	//   82  178:invokevirtual   #368 <Method void mergeExtensionFields(GeneratedMessageV3$ExtendableMessage)>
		mergeUnknownFields(extensionrangeoptions.unknownFields);
	//   83  181:aload_0         
	//   84  182:aload_1         
	//   85  183:getfield        #372 <Field UnknownFieldSet DescriptorProtos$ExtensionRangeOptions.unknownFields>
	//   86  186:invokevirtual   #376 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//   87  189:pop             
		onChanged();
	//   88  190:aload_0         
	//   89  191:invokevirtual   #97  <Method void onChanged()>
		return this;
	//   90  194:aload_0         
	//   91  195:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.ExtensionRangeOptions)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$ExtensionRangeOptions>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.ExtensionRangeOptions)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$ExtensionRangeOptions>
	//    6   12:invokevirtual   #343 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(DescriptorProtos$ExtensionRangeOptions)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #378 <Method AbstractMessage$Builder GeneratedMessageV3$ExtendableBuilder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #323 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #327 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #323 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #376 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$ExtensionRangeOptions$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #385 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #376 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #376 <Method DescriptorProtos$ExtensionRangeOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder removeUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #391 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			uninterpretedOptionBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #394 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.setExtension(generatedextension, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #399 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    6   10:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.setExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #402 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #405 <Method DescriptorProtos$ExtensionRangeOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #407 <Method DescriptorProtos$ExtensionRangeOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #410 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #412 <Method DescriptorProtos$ExtensionRangeOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #412 <Method DescriptorProtos$ExtensionRangeOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #412 <Method DescriptorProtos$ExtensionRangeOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #417 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #420 <Method DescriptorProtos$ExtensionRangeOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #420 <Method DescriptorProtos$ExtensionRangeOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #420 <Method DescriptorProtos$ExtensionRangeOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.set(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #127 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #426 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #127 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   21   41:invokevirtual   #429 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$ExtensionRangeOptions$Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #140 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #141 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #88  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.set(i, ((Object) (uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #426 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #97  <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (uninterpretedoption)));
	//   21   41:aload_0         
	//   22   42:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #429 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public final DescriptorProtos$ExtensionRangeOptions$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$ExtensionRangeOptions$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #432 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$ExtensionRangeOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #434 <Method DescriptorProtos$ExtensionRangeOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #434 <Method DescriptorProtos$ExtensionRangeOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private RepeatedFieldBuilderV3 uninterpretedOptionBuilder_;
	private List uninterpretedOption_;

	private DescriptorProtos$ExtensionRangeOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void GeneratedMessageV3$ExtendableBuilder()>
		uninterpretedOption_ = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #31  <Method List Collections.emptyList()>
	//    4    8:putfield        #33  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//    5   11:aload_0         
	//    6   12:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
	//    7   15:return          
	}

	DescriptorProtos$ExtensionRangeOptions$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void DescriptorProtos$ExtensionRangeOptions$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$ExtensionRangeOptions$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void GeneratedMessageV3$ExtendableBuilder(GeneratedMessageV3$BuilderParent)>
		uninterpretedOption_ = Collections.emptyList();
	//    3    5:aload_0         
	//    4    6:invokestatic    #31  <Method List Collections.emptyList()>
	//    5    9:putfield        #33  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//    6   12:aload_0         
	//    7   13:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
	//    8   16:return          
	}

	DescriptorProtos$ExtensionRangeOptions$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void DescriptorProtos$ExtensionRangeOptions$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
