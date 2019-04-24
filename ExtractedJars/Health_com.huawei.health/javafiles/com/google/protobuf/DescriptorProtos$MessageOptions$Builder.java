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

public static final class DescriptorProtos$MessageOptions$Builder extends GeneratedMessageV3.ExtendableBuilder
	implements 
{

	private void ensureUninterpretedOptionIsMutable()
	{
		if((bitField0_ & 0x10) != 16)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int bitField0_>
	//*   2    4:bipush          16
	//*   3    6:iand            
	//*   4    7:bipush          16
	//*   5    9:icmpeq          38
		{
			uninterpretedOption_ = ((List) (new ArrayList(((java.util.Collection) (uninterpretedOption_)))));
	//    6   12:aload_0         
	//    7   13:new             #54  <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field List uninterpretedOption_>
	//   11   21:invokespecial   #57  <Method void ArrayList(java.util.Collection)>
	//   12   24:putfield        #38  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ | 0x10;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #52  <Field int bitField0_>
	//   16   32:bipush          16
	//   17   34:ior             
	//   18   35:putfield        #52  <Field int bitField0_>
		}
	//   19   38:return          
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$17500();
	//    0    0:invokestatic    #62  <Method Descriptors$Descriptor DescriptorProtos.access$17500()>
	//    1    3:areturn         
	}

	private RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       57
		{
			List list = uninterpretedOption_;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field List uninterpretedOption_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 0x10) == 16)
	//*   6   12:aload_0         
	//*   7   13:getfield        #52  <Field int bitField0_>
	//*   8   16:bipush          16
	//*   9   18:iand            
	//*  10   19:bipush          16
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
	//   18   32:new             #68  <Class RepeatedFieldBuilderV3>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #72  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   42:aload_0         
	//   25   43:invokevirtual   #76  <Method boolean isClean()>
	//   26   46:invokespecial   #79  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   49:putfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			uninterpretedOption_ = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #38  <Field List uninterpretedOption_>
		}
		return uninterpretedOptionBuilder_;
	//   31   57:aload_0         
	//   32   58:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   33   61:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #86  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getUninterpretedOptionFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$MessageOptions$Builder addAllUninterpretedOption(Iterable iterable)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, uninterpretedOption_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field List uninterpretedOption_>
	//    8   16:invokestatic    #98  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #101 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #105 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$MessageOptions$Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.addExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #111 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (addExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #114 <Method DescriptorProtos$MessageOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #119 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #122 <Method DescriptorProtos$MessageOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #122 <Method DescriptorProtos$MessageOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #122 <Method DescriptorProtos$MessageOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder addUninterpretedOption(int i, lder lder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #131 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #137 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #101 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #131 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   20   40:invokevirtual   #141 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$MessageOptions$Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #144 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #145 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(i, ((Object) (uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #38  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #137 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #101 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #141 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$MessageOptions$Builder addUninterpretedOption(lder lder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field List uninterpretedOption_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #131 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//    9   19:invokeinterface #149 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #101 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #131 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   19   39:invokevirtual   #152 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$MessageOptions$Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(uninterpretedoption == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #144 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #145 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(((Object) (uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #38  <Field List uninterpretedOption_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #149 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #101 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #152 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public lder addUninterpretedOptionBuilder()
	{
		return (lder)getUninterpretedOptionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokestatic    #160 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    3    7:invokevirtual   #164 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #127 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   13:areturn         
	}

	public lder addUninterpretedOptionBuilder(int i)
	{
		return (lder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #160 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    4    8:invokevirtual   #168 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #127 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos.MessageOptions build()
	{
		DescriptorProtos.MessageOptions messageoptions = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$MessageOptions buildPartial()>
	//    2    4:astore_1        
		if(!messageoptions.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #175 <Method boolean DescriptorProtos$MessageOptions.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (messageoptions)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #179 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return messageoptions;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #182 <Method DescriptorProtos$MessageOptions build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #182 <Method DescriptorProtos$MessageOptions build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.MessageOptions buildPartial()
	{
		DescriptorProtos.MessageOptions messageoptions = new DescriptorProtos.MessageOptions(((GeneratedMessageV3.ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$MessageOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #186 <Method void DescriptorProtos$MessageOptions(GeneratedMessageV3$ExtendableBuilder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #52  <Field int bitField0_>
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
		DescriptorProtos.MessageOptions.access$18002(messageoptions, messageSetWireFormat_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #188 <Field boolean messageSetWireFormat_>
	//   21   33:invokestatic    #192 <Method boolean DescriptorProtos$MessageOptions.access$18002(DescriptorProtos$MessageOptions, boolean)>
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
		DescriptorProtos.MessageOptions.access$18102(messageoptions, noStandardDescriptorAccessor_);
	//   34   50:aload           4
	//   35   52:aload_0         
	//   36   53:getfield        #194 <Field boolean noStandardDescriptorAccessor_>
	//   37   56:invokestatic    #197 <Method boolean DescriptorProtos$MessageOptions.access$18102(DescriptorProtos$MessageOptions, boolean)>
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
		DescriptorProtos.MessageOptions.access$18202(messageoptions, deprecated_);
	//   50   73:aload           4
	//   51   75:aload_0         
	//   52   76:getfield        #199 <Field boolean deprecated_>
	//   53   79:invokestatic    #202 <Method boolean DescriptorProtos$MessageOptions.access$18202(DescriptorProtos$MessageOptions, boolean)>
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
		DescriptorProtos.MessageOptions.access$18302(messageoptions, mapEntry_);
	//   66   99:aload           4
	//   67  101:aload_0         
	//   68  102:getfield        #204 <Field boolean mapEntry_>
	//   69  105:invokestatic    #207 <Method boolean DescriptorProtos$MessageOptions.access$18302(DescriptorProtos$MessageOptions, boolean)>
	//   70  108:pop             
		if(uninterpretedOptionBuilder_ == null)
	//*  71  109:aload_0         
	//*  72  110:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  73  113:ifnonnull       163
		{
			if((bitField0_ & 0x10) == 16)
	//*  74  116:aload_0         
	//*  75  117:getfield        #52  <Field int bitField0_>
	//*  76  120:bipush          16
	//*  77  122:iand            
	//*  78  123:bipush          16
	//*  79  125:icmpne          150
			{
				uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//   80  128:aload_0         
	//   81  129:aload_0         
	//   82  130:getfield        #38  <Field List uninterpretedOption_>
	//   83  133:invokestatic    #211 <Method List Collections.unmodifiableList(List)>
	//   84  136:putfield        #38  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & 0xffffffef;
	//   85  139:aload_0         
	//   86  140:aload_0         
	//   87  141:getfield        #52  <Field int bitField0_>
	//   88  144:bipush          -17
	//   89  146:iand            
	//   90  147:putfield        #52  <Field int bitField0_>
			}
			DescriptorProtos.MessageOptions.access$18402(messageoptions, uninterpretedOption_);
	//   91  150:aload           4
	//   92  152:aload_0         
	//   93  153:getfield        #38  <Field List uninterpretedOption_>
	//   94  156:invokestatic    #215 <Method List DescriptorProtos$MessageOptions.access$18402(DescriptorProtos$MessageOptions, List)>
	//   95  159:pop             
		} else
	//*  96  160:goto            176
		{
			DescriptorProtos.MessageOptions.access$18402(messageoptions, uninterpretedOptionBuilder_.build());
	//   97  163:aload           4
	//   98  165:aload_0         
	//   99  166:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//  100  169:invokevirtual   #217 <Method List RepeatedFieldBuilderV3.build()>
	//  101  172:invokestatic    #215 <Method List DescriptorProtos$MessageOptions.access$18402(DescriptorProtos$MessageOptions, List)>
	//  102  175:pop             
		}
		DescriptorProtos.MessageOptions.access$18502(messageoptions, i);
	//  103  176:aload           4
	//  104  178:iload_1         
	//  105  179:invokestatic    #221 <Method int DescriptorProtos$MessageOptions.access$18502(DescriptorProtos$MessageOptions, int)>
	//  106  182:pop             
		onBuilt();
	//  107  183:aload_0         
	//  108  184:invokevirtual   #224 <Method void onBuilt()>
		return messageoptions;
	//  109  187:aload           4
	//  110  189:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$MessageOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$MessageOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #229 <Method DescriptorProtos$MessageOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #232 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clear()>
	//    2    4:pop             
		messageSetWireFormat_ = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #188 <Field boolean messageSetWireFormat_>
		bitField0_ = bitField0_ & -2;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #52  <Field int bitField0_>
	//    9   15:bipush          -2
	//   10   17:iand            
	//   11   18:putfield        #52  <Field int bitField0_>
		noStandardDescriptorAccessor_ = false;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #194 <Field boolean noStandardDescriptorAccessor_>
		bitField0_ = bitField0_ & -3;
	//   15   26:aload_0         
	//   16   27:aload_0         
	//   17   28:getfield        #52  <Field int bitField0_>
	//   18   31:bipush          -3
	//   19   33:iand            
	//   20   34:putfield        #52  <Field int bitField0_>
		deprecated_ = false;
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:putfield        #199 <Field boolean deprecated_>
		bitField0_ = bitField0_ & -5;
	//   24   42:aload_0         
	//   25   43:aload_0         
	//   26   44:getfield        #52  <Field int bitField0_>
	//   27   47:bipush          -5
	//   28   49:iand            
	//   29   50:putfield        #52  <Field int bitField0_>
		mapEntry_ = false;
	//   30   53:aload_0         
	//   31   54:iconst_0        
	//   32   55:putfield        #204 <Field boolean mapEntry_>
		bitField0_ = bitField0_ & -9;
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:getfield        #52  <Field int bitField0_>
	//   36   63:bipush          -9
	//   37   65:iand            
	//   38   66:putfield        #52  <Field int bitField0_>
		if(uninterpretedOptionBuilder_ == null)
	//*  39   69:aload_0         
	//*  40   70:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  41   73:ifnonnull       96
		{
			uninterpretedOption_ = Collections.emptyList();
	//   42   76:aload_0         
	//   43   77:invokestatic    #36  <Method List Collections.emptyList()>
	//   44   80:putfield        #38  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & 0xffffffef;
	//   45   83:aload_0         
	//   46   84:aload_0         
	//   47   85:getfield        #52  <Field int bitField0_>
	//   48   88:bipush          -17
	//   49   90:iand            
	//   50   91:putfield        #52  <Field int bitField0_>
			return this;
	//   51   94:aload_0         
	//   52   95:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   53   96:aload_0         
	//   54   97:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   55  100:invokevirtual   #234 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   56  103:aload_0         
	//   57  104:areturn         
		}
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #229 <Method DescriptorProtos$MessageOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clear()
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #229 <Method DescriptorProtos$MessageOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #229 <Method DescriptorProtos$MessageOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #229 <Method DescriptorProtos$MessageOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clearDeprecated()
	{
		bitField0_ = bitField0_ & -5;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:bipush          -5
	//    4    7:iand            
	//    5    8:putfield        #52  <Field int bitField0_>
		deprecated_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #199 <Field boolean deprecated_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.clearExtension(generatedextension);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #243 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clearExtension(generatedextension)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #246 <Method DescriptorProtos$MessageOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #251 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #254 <Method DescriptorProtos$MessageOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #254 <Method DescriptorProtos$MessageOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #254 <Method DescriptorProtos$MessageOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clearMapEntry()
	{
		bitField0_ = bitField0_ & -9;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:bipush          -9
	//    4    7:iand            
	//    5    8:putfield        #52  <Field int bitField0_>
		mapEntry_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #204 <Field boolean mapEntry_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clearMessageSetWireFormat()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #52  <Field int bitField0_>
		messageSetWireFormat_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #188 <Field boolean messageSetWireFormat_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clearNoStandardDescriptorAccessor()
	{
		bitField0_ = bitField0_ & -3;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:bipush          -3
	//    4    7:iand            
	//    5    8:putfield        #52  <Field int bitField0_>
		noStandardDescriptorAccessor_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #194 <Field boolean noStandardDescriptorAccessor_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #263 <Method DescriptorProtos$MessageOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #266 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #263 <Method DescriptorProtos$MessageOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #263 <Method DescriptorProtos$MessageOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clearUninterpretedOption()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			uninterpretedOption_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #36  <Method List Collections.emptyList()>
	//    5   11:putfield        #38  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & 0xffffffef;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #52  <Field int bitField0_>
	//    9   19:bipush          -17
	//   10   21:iand            
	//   11   22:putfield        #52  <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #101 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   35:invokevirtual   #234 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method DescriptorProtos$MessageOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method DescriptorProtos$MessageOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder clone()
	{
		return (DescriptorProtos$MessageOptions$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #274 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method DescriptorProtos$MessageOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method DescriptorProtos$MessageOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method DescriptorProtos$MessageOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method DescriptorProtos$MessageOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.MessageOptions getDefaultInstanceForType()
	{
		return DescriptorProtos.MessageOptions.getDefaultInstance();
	//    0    0:invokestatic    #281 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #283 <Method DescriptorProtos$MessageOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #283 <Method DescriptorProtos$MessageOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$17500();
	//    0    0:invokestatic    #62  <Method Descriptors$Descriptor DescriptorProtos.access$17500()>
	//    1    3:areturn         
	}

	public boolean getMapEntry()
	{
		return mapEntry_;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field boolean mapEntry_>
	//    2    4:ireturn         
	}

	public boolean getMessageSetWireFormat()
	{
		return messageSetWireFormat_;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field boolean messageSetWireFormat_>
	//    2    4:ireturn         
	}

	public boolean getNoStandardDescriptorAccessor()
	{
		return noStandardDescriptorAccessor_;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field boolean noStandardDescriptorAccessor_>
	//    2    4:ireturn         
	}

	public DescriptorProtos.UninterpretedOption getUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.UninterpretedOption)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #294 <Method Object List.get(int)>
	//    7   17:checkcast       #157 <Class DescriptorProtos$UninterpretedOption>
	//    8   20:areturn         
		else
			return (DescriptorProtos.UninterpretedOption)uninterpretedOptionBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #298 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #157 <Class DescriptorProtos$UninterpretedOption>
	//   14   32:areturn         
	}

	public lder getUninterpretedOptionBuilder(int i)
	{
		return (lder)getUninterpretedOptionFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #303 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #127 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   11:areturn         
	}

	public List getUninterpretedOptionBuilderList()
	{
		return getUninterpretedOptionFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokevirtual   #307 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       17
			return uninterpretedOption_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field List uninterpretedOption_>
	//    5   11:invokeinterface #313 <Method int List.size()>
	//    6   16:ireturn         
		else
			return uninterpretedOptionBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   21:invokevirtual   #316 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(uninterpretedOption_);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field List uninterpretedOption_>
	//    5   11:invokestatic    #211 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return uninterpretedOptionBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   19:invokevirtual   #320 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public ilder getUninterpretedOptionOrBuilder(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (ilder)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #294 <Method Object List.get(int)>
	//    7   17:checkcast       #325 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    8   20:areturn         
		else
			return (ilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #329 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #325 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//   14   32:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		if(uninterpretedOptionBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnull          15
			return uninterpretedOptionBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    5   11:invokevirtual   #333 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(uninterpretedOption_);
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field List uninterpretedOption_>
	//    9   19:invokestatic    #211 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public boolean hasDeprecated()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasMapEntry()
	{
		return (bitField0_ & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int bitField0_>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasMessageSetWireFormat()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasNoStandardDescriptorAccessor()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int bitField0_>
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
		return DescriptorProtos.access$17600().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$MessageOptions, com/google/protobuf/DescriptorProtos$MessageOptions$Builder);
	//    0    0:invokestatic    #343 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$17600()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$MessageOptions>
	//    2    5:ldc1            #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    3    7:invokevirtual   #349 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < getUninterpretedOptionCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #351 <Method int getUninterpretedOptionCount()>
	//*   5    7:icmpge          30
			if(!getUninterpretedOption(i).isInitialized())
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #353 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*   9   15:invokevirtual   #354 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
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
	//   19   31:invokevirtual   #357 <Method boolean extensionsAreInitialized()>
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
	//    3    3:invokevirtual   #364 <Method DescriptorProtos$MessageOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #368 <Method DescriptorProtos$MessageOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #364 <Method DescriptorProtos$MessageOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.MessageOptions)DescriptorProtos.MessageOptions.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #375 <Field Parser DescriptorProtos$MessageOptions.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #381 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$MessageOptions>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.MessageOptions) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #384 <Method DescriptorProtos$MessageOptions$Builder mergeFrom(DescriptorProtos$MessageOptions)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #387 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$MessageOptions>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #391 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #384 <Method DescriptorProtos$MessageOptions$Builder mergeFrom(DescriptorProtos$MessageOptions)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.MessageOptions)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.MessageOptions) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$MessageOptions$Builder mergeFrom(DescriptorProtos.MessageOptions messageoptions)
	{
		if(messageoptions == DescriptorProtos.MessageOptions.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #281 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(messageoptions.hasMessageSetWireFormat())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #393 <Method boolean DescriptorProtos$MessageOptions.hasMessageSetWireFormat()>
	//*   7   13:ifeq            25
			setMessageSetWireFormat(messageoptions.getMessageSetWireFormat());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #395 <Method boolean DescriptorProtos$MessageOptions.getMessageSetWireFormat()>
	//   11   21:invokevirtual   #399 <Method DescriptorProtos$MessageOptions$Builder setMessageSetWireFormat(boolean)>
	//   12   24:pop             
		if(messageoptions.hasNoStandardDescriptorAccessor())
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #401 <Method boolean DescriptorProtos$MessageOptions.hasNoStandardDescriptorAccessor()>
	//*  15   29:ifeq            41
			setNoStandardDescriptorAccessor(messageoptions.getNoStandardDescriptorAccessor());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #403 <Method boolean DescriptorProtos$MessageOptions.getNoStandardDescriptorAccessor()>
	//   19   37:invokevirtual   #406 <Method DescriptorProtos$MessageOptions$Builder setNoStandardDescriptorAccessor(boolean)>
	//   20   40:pop             
		if(messageoptions.hasDeprecated())
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #408 <Method boolean DescriptorProtos$MessageOptions.hasDeprecated()>
	//*  23   45:ifeq            57
			setDeprecated(messageoptions.getDeprecated());
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #410 <Method boolean DescriptorProtos$MessageOptions.getDeprecated()>
	//   27   53:invokevirtual   #413 <Method DescriptorProtos$MessageOptions$Builder setDeprecated(boolean)>
	//   28   56:pop             
		if(messageoptions.hasMapEntry())
	//*  29   57:aload_1         
	//*  30   58:invokevirtual   #415 <Method boolean DescriptorProtos$MessageOptions.hasMapEntry()>
	//*  31   61:ifeq            73
			setMapEntry(messageoptions.getMapEntry());
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #417 <Method boolean DescriptorProtos$MessageOptions.getMapEntry()>
	//   35   69:invokevirtual   #420 <Method DescriptorProtos$MessageOptions$Builder setMapEntry(boolean)>
	//   36   72:pop             
		if(uninterpretedOptionBuilder_ == null)
	//*  37   73:aload_0         
	//*  38   74:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  39   77:ifnonnull       151
		{
			if(!DescriptorProtos.MessageOptions.access$18400(messageoptions).isEmpty())
	//*  40   80:aload_1         
	//*  41   81:invokestatic    #424 <Method List DescriptorProtos$MessageOptions.access$18400(DescriptorProtos$MessageOptions)>
	//*  42   84:invokeinterface #427 <Method boolean List.isEmpty()>
	//*  43   89:ifne            240
			{
				if(uninterpretedOption_.isEmpty())
	//*  44   92:aload_0         
	//*  45   93:getfield        #38  <Field List uninterpretedOption_>
	//*  46   96:invokeinterface #427 <Method boolean List.isEmpty()>
	//*  47  101:ifeq            126
				{
					uninterpretedOption_ = DescriptorProtos.MessageOptions.access$18400(messageoptions);
	//   48  104:aload_0         
	//   49  105:aload_1         
	//   50  106:invokestatic    #424 <Method List DescriptorProtos$MessageOptions.access$18400(DescriptorProtos$MessageOptions)>
	//   51  109:putfield        #38  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & 0xffffffef;
	//   52  112:aload_0         
	//   53  113:aload_0         
	//   54  114:getfield        #52  <Field int bitField0_>
	//   55  117:bipush          -17
	//   56  119:iand            
	//   57  120:putfield        #52  <Field int bitField0_>
				} else
	//*  58  123:goto            144
				{
					ensureUninterpretedOptionIsMutable();
	//   59  126:aload_0         
	//   60  127:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.addAll(((java.util.Collection) (DescriptorProtos.MessageOptions.access$18400(messageoptions))));
	//   61  130:aload_0         
	//   62  131:getfield        #38  <Field List uninterpretedOption_>
	//   63  134:aload_1         
	//   64  135:invokestatic    #424 <Method List DescriptorProtos$MessageOptions.access$18400(DescriptorProtos$MessageOptions)>
	//   65  138:invokeinterface #430 <Method boolean List.addAll(java.util.Collection)>
	//   66  143:pop             
				}
				onChanged();
	//   67  144:aload_0         
	//   68  145:invokevirtual   #101 <Method void onChanged()>
			}
		} else
	//*  69  148:goto            240
		if(!DescriptorProtos.MessageOptions.access$18400(messageoptions).isEmpty())
	//*  70  151:aload_1         
	//*  71  152:invokestatic    #424 <Method List DescriptorProtos$MessageOptions.access$18400(DescriptorProtos$MessageOptions)>
	//*  72  155:invokeinterface #427 <Method boolean List.isEmpty()>
	//*  73  160:ifne            240
			if(uninterpretedOptionBuilder_.isEmpty())
	//*  74  163:aload_0         
	//*  75  164:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  76  167:invokevirtual   #431 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  77  170:ifeq            228
			{
				uninterpretedOptionBuilder_.dispose();
	//   78  173:aload_0         
	//   79  174:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   80  177:invokevirtual   #434 <Method void RepeatedFieldBuilderV3.dispose()>
				uninterpretedOptionBuilder_ = null;
	//   81  180:aload_0         
	//   82  181:aconst_null     
	//   83  182:putfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				uninterpretedOption_ = DescriptorProtos.MessageOptions.access$18400(messageoptions);
	//   84  185:aload_0         
	//   85  186:aload_1         
	//   86  187:invokestatic    #424 <Method List DescriptorProtos$MessageOptions.access$18400(DescriptorProtos$MessageOptions)>
	//   87  190:putfield        #38  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & 0xffffffef;
	//   88  193:aload_0         
	//   89  194:aload_0         
	//   90  195:getfield        #52  <Field int bitField0_>
	//   91  198:bipush          -17
	//   92  200:iand            
	//   93  201:putfield        #52  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*  94  204:getstatic       #86  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*  95  207:ifeq            218
					repeatedfieldbuilderv3 = getUninterpretedOptionFieldBuilder();
	//   96  210:aload_0         
	//   97  211:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//   98  214:astore_2        
				else
	//*  99  215:goto            220
					repeatedfieldbuilderv3 = null;
	//  100  218:aconst_null     
	//  101  219:astore_2        
				uninterpretedOptionBuilder_ = repeatedfieldbuilderv3;
	//  102  220:aload_0         
	//  103  221:aload_2         
	//  104  222:putfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			} else
	//* 105  225:goto            240
			{
				uninterpretedOptionBuilder_.addAllMessages(((Iterable) (DescriptorProtos.MessageOptions.access$18400(messageoptions))));
	//  106  228:aload_0         
	//  107  229:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//  108  232:aload_1         
	//  109  233:invokestatic    #424 <Method List DescriptorProtos$MessageOptions.access$18400(DescriptorProtos$MessageOptions)>
	//  110  236:invokevirtual   #105 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  111  239:pop             
			}
		mergeExtensionFields(((GeneratedMessageV3.ExtendableMessage) (messageoptions)));
	//  112  240:aload_0         
	//  113  241:aload_1         
	//  114  242:invokevirtual   #438 <Method void mergeExtensionFields(GeneratedMessageV3$ExtendableMessage)>
		mergeUnknownFields(messageoptions.unknownFields);
	//  115  245:aload_0         
	//  116  246:aload_1         
	//  117  247:getfield        #442 <Field UnknownFieldSet DescriptorProtos$MessageOptions.unknownFields>
	//  118  250:invokevirtual   #446 <Method DescriptorProtos$MessageOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//  119  253:pop             
		onChanged();
	//  120  254:aload_0         
	//  121  255:invokevirtual   #101 <Method void onChanged()>
		return this;
	//  122  258:aload_0         
	//  123  259:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.MessageOptions)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$MessageOptions>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.MessageOptions)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$MessageOptions>
	//    6   12:invokevirtual   #384 <Method DescriptorProtos$MessageOptions$Builder mergeFrom(DescriptorProtos$MessageOptions)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #448 <Method AbstractMessage$Builder GeneratedMessageV3$ExtendableBuilder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #364 <Method DescriptorProtos$MessageOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #368 <Method DescriptorProtos$MessageOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #364 <Method DescriptorProtos$MessageOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #446 <Method DescriptorProtos$MessageOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$MessageOptions$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #455 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #446 <Method DescriptorProtos$MessageOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #446 <Method DescriptorProtos$MessageOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder removeUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #461 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #101 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			uninterpretedOptionBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #464 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$MessageOptions$Builder setDeprecated(boolean flag)
	{
		bitField0_ = bitField0_ | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #52  <Field int bitField0_>
		deprecated_ = flag;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #199 <Field boolean deprecated_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.setExtension(generatedextension, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #469 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    6   10:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.setExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #472 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #475 <Method DescriptorProtos$MessageOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #477 <Method DescriptorProtos$MessageOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #480 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #482 <Method DescriptorProtos$MessageOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #482 <Method DescriptorProtos$MessageOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #482 <Method DescriptorProtos$MessageOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder setMapEntry(boolean flag)
	{
		bitField0_ = bitField0_ | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #52  <Field int bitField0_>
		mapEntry_ = flag;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #204 <Field boolean mapEntry_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder setMessageSetWireFormat(boolean flag)
	{
		bitField0_ = bitField0_ | 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:iconst_1        
	//    4    6:ior             
	//    5    7:putfield        #52  <Field int bitField0_>
		messageSetWireFormat_ = flag;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #188 <Field boolean messageSetWireFormat_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder setNoStandardDescriptorAccessor(boolean flag)
	{
		bitField0_ = bitField0_ | 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:iconst_2        
	//    4    6:ior             
	//    5    7:putfield        #52  <Field int bitField0_>
		noStandardDescriptorAccessor_ = flag;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #194 <Field boolean noStandardDescriptorAccessor_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #487 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #490 <Method DescriptorProtos$MessageOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #490 <Method DescriptorProtos$MessageOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #490 <Method DescriptorProtos$MessageOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$MessageOptions$Builder setUninterpretedOption(int i, lder lder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.set(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #131 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #496 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #101 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (lder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #131 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   21   41:invokevirtual   #499 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$MessageOptions$Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #144 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #145 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.set(i, ((Object) (uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #38  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #496 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #101 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (uninterpretedoption)));
	//   21   41:aload_0         
	//   22   42:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #499 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public final DescriptorProtos$MessageOptions$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$MessageOptions$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #502 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #504 <Method DescriptorProtos$MessageOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #504 <Method DescriptorProtos$MessageOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private boolean deprecated_;
	private boolean mapEntry_;
	private boolean messageSetWireFormat_;
	private boolean noStandardDescriptorAccessor_;
	private RepeatedFieldBuilderV3 uninterpretedOptionBuilder_;
	private List uninterpretedOption_;

	private DescriptorProtos$MessageOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void GeneratedMessageV3$ExtendableBuilder()>
		uninterpretedOption_ = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method List Collections.emptyList()>
	//    4    8:putfield        #38  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//    5   11:aload_0         
	//    6   12:invokespecial   #41  <Method void maybeForceBuilderInitialization()>
	//    7   15:return          
	}

	DescriptorProtos$MessageOptions$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void DescriptorProtos$MessageOptions$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$MessageOptions$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void GeneratedMessageV3$ExtendableBuilder(GeneratedMessageV3$BuilderParent)>
		uninterpretedOption_ = Collections.emptyList();
	//    3    5:aload_0         
	//    4    6:invokestatic    #36  <Method List Collections.emptyList()>
	//    5    9:putfield        #38  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//    6   12:aload_0         
	//    7   13:invokespecial   #41  <Method void maybeForceBuilderInitialization()>
	//    8   16:return          
	}

	DescriptorProtos$MessageOptions$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void DescriptorProtos$MessageOptions$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
