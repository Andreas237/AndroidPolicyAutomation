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

public static final class DescriptorProtos$MethodOptions$Builder extends GeneratedMessageV3.ExtendableBuilder
	implements 
{

	private void ensureUninterpretedOptionIsMutable()
	{
		if((bitField0_ & 4) != 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int bitField0_>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:iconst_4        
	//*   5    7:icmpeq          35
		{
			uninterpretedOption_ = ((List) (new ArrayList(((java.util.Collection) (uninterpretedOption_)))));
	//    6   10:aload_0         
	//    7   11:new             #54  <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #38  <Field List uninterpretedOption_>
	//   11   19:invokespecial   #57  <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #38  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ | 4;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #52  <Field int bitField0_>
	//   16   30:iconst_4        
	//   17   31:ior             
	//   18   32:putfield        #52  <Field int bitField0_>
		}
	//   19   35:return          
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$23600();
	//    0    0:invokestatic    #62  <Method Descriptors$Descriptor DescriptorProtos.access$23600()>
	//    1    3:areturn         
	}

	private RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = uninterpretedOption_;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field List uninterpretedOption_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 4) == 4)
	//*   6   12:aload_0         
	//*   7   13:getfield        #52  <Field int bitField0_>
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
	//   18   30:new             #68  <Class RepeatedFieldBuilderV3>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:invokevirtual   #72  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   40:aload_0         
	//   25   41:invokevirtual   #76  <Method boolean isClean()>
	//   26   44:invokespecial   #79  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   47:putfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			uninterpretedOption_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #38  <Field List uninterpretedOption_>
		}
		return uninterpretedOptionBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   33   59:areturn         
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

	public DescriptorProtos$MethodOptions$Builder addAllUninterpretedOption(Iterable iterable)
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

	public DescriptorProtos$MethodOptions$Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.addExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #111 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (addExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #114 <Method DescriptorProtos$MethodOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #119 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #122 <Method DescriptorProtos$MethodOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #122 <Method DescriptorProtos$MethodOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #122 <Method DescriptorProtos$MethodOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder addUninterpretedOption(int i, ilder ilder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(i, ((Object) (ilder.build())));
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
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (ilder.build())));
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

	public DescriptorProtos$MethodOptions$Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
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

	public DescriptorProtos$MethodOptions$Builder addUninterpretedOption(ilder ilder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(((Object) (ilder.build())));
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
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (ilder.build())));
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

	public DescriptorProtos$MethodOptions$Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption uninterpretedoption)
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

	public ilder addUninterpretedOptionBuilder()
	{
		return (ilder)getUninterpretedOptionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokestatic    #160 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    3    7:invokevirtual   #164 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #127 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   13:areturn         
	}

	public ilder addUninterpretedOptionBuilder(int i)
	{
		return (ilder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #160 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    4    8:invokevirtual   #168 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #127 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos.MethodOptions build()
	{
		DescriptorProtos.MethodOptions methodoptions = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$MethodOptions buildPartial()>
	//    2    4:astore_1        
		if(!methodoptions.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #175 <Method boolean DescriptorProtos$MethodOptions.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (methodoptions)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #179 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return methodoptions;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #182 <Method DescriptorProtos$MethodOptions build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #182 <Method DescriptorProtos$MethodOptions build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.MethodOptions buildPartial()
	{
		DescriptorProtos.MethodOptions methodoptions = new DescriptorProtos.MethodOptions(((GeneratedMessageV3.ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$MethodOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #186 <Method void DescriptorProtos$MethodOptions(GeneratedMessageV3$ExtendableBuilder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #52  <Field int bitField0_>
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
		DescriptorProtos.MethodOptions.access$24102(methodoptions, deprecated_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #188 <Field boolean deprecated_>
	//   21   33:invokestatic    #192 <Method boolean DescriptorProtos$MethodOptions.access$24102(DescriptorProtos$MethodOptions, boolean)>
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
		DescriptorProtos.MethodOptions.access$24202(methodoptions, idempotencyLevel_);
	//   34   50:aload           4
	//   35   52:aload_0         
	//   36   53:getfield        #30  <Field int idempotencyLevel_>
	//   37   56:invokestatic    #196 <Method int DescriptorProtos$MethodOptions.access$24202(DescriptorProtos$MethodOptions, int)>
	//   38   59:pop             
		if(uninterpretedOptionBuilder_ == null)
	//*  39   60:aload_0         
	//*  40   61:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  41   64:ifnonnull       112
		{
			if((bitField0_ & 4) == 4)
	//*  42   67:aload_0         
	//*  43   68:getfield        #52  <Field int bitField0_>
	//*  44   71:iconst_4        
	//*  45   72:iand            
	//*  46   73:iconst_4        
	//*  47   74:icmpne          99
			{
				uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//   48   77:aload_0         
	//   49   78:aload_0         
	//   50   79:getfield        #38  <Field List uninterpretedOption_>
	//   51   82:invokestatic    #200 <Method List Collections.unmodifiableList(List)>
	//   52   85:putfield        #38  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & -5;
	//   53   88:aload_0         
	//   54   89:aload_0         
	//   55   90:getfield        #52  <Field int bitField0_>
	//   56   93:bipush          -5
	//   57   95:iand            
	//   58   96:putfield        #52  <Field int bitField0_>
			}
			DescriptorProtos.MethodOptions.access$24302(methodoptions, uninterpretedOption_);
	//   59   99:aload           4
	//   60  101:aload_0         
	//   61  102:getfield        #38  <Field List uninterpretedOption_>
	//   62  105:invokestatic    #204 <Method List DescriptorProtos$MethodOptions.access$24302(DescriptorProtos$MethodOptions, List)>
	//   63  108:pop             
		} else
	//*  64  109:goto            125
		{
			DescriptorProtos.MethodOptions.access$24302(methodoptions, uninterpretedOptionBuilder_.build());
	//   65  112:aload           4
	//   66  114:aload_0         
	//   67  115:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   68  118:invokevirtual   #206 <Method List RepeatedFieldBuilderV3.build()>
	//   69  121:invokestatic    #204 <Method List DescriptorProtos$MethodOptions.access$24302(DescriptorProtos$MethodOptions, List)>
	//   70  124:pop             
		}
		DescriptorProtos.MethodOptions.access$24402(methodoptions, j);
	//   71  125:aload           4
	//   72  127:iload_2         
	//   73  128:invokestatic    #209 <Method int DescriptorProtos$MethodOptions.access$24402(DescriptorProtos$MethodOptions, int)>
	//   74  131:pop             
		onBuilt();
	//   75  132:aload_0         
	//   76  133:invokevirtual   #212 <Method void onBuilt()>
		return methodoptions;
	//   77  136:aload           4
	//   78  138:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$MethodOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DescriptorProtos$MethodOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$MethodOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #220 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clear()>
	//    2    4:pop             
		deprecated_ = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #188 <Field boolean deprecated_>
		bitField0_ = bitField0_ & -2;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #52  <Field int bitField0_>
	//    9   15:bipush          -2
	//   10   17:iand            
	//   11   18:putfield        #52  <Field int bitField0_>
		idempotencyLevel_ = 0;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #30  <Field int idempotencyLevel_>
		bitField0_ = bitField0_ & -3;
	//   15   26:aload_0         
	//   16   27:aload_0         
	//   17   28:getfield        #52  <Field int bitField0_>
	//   18   31:bipush          -3
	//   19   33:iand            
	//   20   34:putfield        #52  <Field int bitField0_>
		if(uninterpretedOptionBuilder_ == null)
	//*  21   37:aload_0         
	//*  22   38:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  23   41:ifnonnull       64
		{
			uninterpretedOption_ = Collections.emptyList();
	//   24   44:aload_0         
	//   25   45:invokestatic    #36  <Method List Collections.emptyList()>
	//   26   48:putfield        #38  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & -5;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #52  <Field int bitField0_>
	//   30   56:bipush          -5
	//   31   58:iand            
	//   32   59:putfield        #52  <Field int bitField0_>
			return this;
	//   33   62:aload_0         
	//   34   63:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   35   64:aload_0         
	//   36   65:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
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
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$MethodOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clear()
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$MethodOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$MethodOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method DescriptorProtos$MethodOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder clearDeprecated()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #52  <Field int bitField0_>
		deprecated_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #188 <Field boolean deprecated_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.clearExtension(generatedextension);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #231 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clearExtension(generatedextension)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #234 <Method DescriptorProtos$MethodOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #239 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #242 <Method DescriptorProtos$MethodOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #242 <Method DescriptorProtos$MethodOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #242 <Method DescriptorProtos$MethodOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder clearIdempotencyLevel()
	{
		bitField0_ = bitField0_ & -3;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:bipush          -3
	//    4    7:iand            
	//    5    8:putfield        #52  <Field int bitField0_>
		idempotencyLevel_ = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #30  <Field int idempotencyLevel_>
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
	//    2    2:invokevirtual   #249 <Method DescriptorProtos$MethodOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #252 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #249 <Method DescriptorProtos$MethodOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #249 <Method DescriptorProtos$MethodOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder clearUninterpretedOption()
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
			bitField0_ = bitField0_ & -5;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #52  <Field int bitField0_>
	//    9   19:bipush          -5
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
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$MethodOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$MethodOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder clone()
	{
		return (DescriptorProtos$MethodOptions$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$MethodOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$MethodOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$MethodOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method DescriptorProtos$MethodOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.MethodOptions getDefaultInstanceForType()
	{
		return DescriptorProtos.MethodOptions.getDefaultInstance();
	//    0    0:invokestatic    #267 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodOptions.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method DescriptorProtos$MethodOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method DescriptorProtos$MethodOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$23600();
	//    0    0:invokestatic    #62  <Method Descriptors$Descriptor DescriptorProtos.access$23600()>
	//    1    3:areturn         
	}

	public ncyLevel getIdempotencyLevel()
	{
		ncyLevel ncylevel = ncyLevel.valueOf(idempotencyLevel_);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int idempotencyLevel_>
	//    2    4:invokestatic    #279 <Method DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions$IdempotencyLevel.valueOf(int)>
	//    3    7:astore_1        
		if(ncylevel == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return ncyLevel.IDEMPOTENCY_UNKNOWN;
	//    6   12:getstatic       #283 <Field DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions$IdempotencyLevel.IDEMPOTENCY_UNKNOWN>
	//    7   15:areturn         
		else
			return ncylevel;
	//    8   16:aload_1         
	//    9   17:areturn         
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
	//    6   12:invokeinterface #289 <Method Object List.get(int)>
	//    7   17:checkcast       #157 <Class DescriptorProtos$UninterpretedOption>
	//    8   20:areturn         
		else
			return (DescriptorProtos.UninterpretedOption)uninterpretedOptionBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #293 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #157 <Class DescriptorProtos$UninterpretedOption>
	//   14   32:areturn         
	}

	public ilder getUninterpretedOptionBuilder(int i)
	{
		return (ilder)getUninterpretedOptionFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #298 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #127 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   11:areturn         
	}

	public List getUninterpretedOptionBuilderList()
	{
		return getUninterpretedOptionFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokevirtual   #302 <Method List RepeatedFieldBuilderV3.getBuilderList()>
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
	//    5   11:invokeinterface #308 <Method int List.size()>
	//    6   16:ireturn         
		else
			return uninterpretedOptionBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   21:invokevirtual   #311 <Method int RepeatedFieldBuilderV3.getCount()>
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
	//    5   11:invokestatic    #200 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return uninterpretedOptionBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   19:invokevirtual   #315 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public uilder getUninterpretedOptionOrBuilder(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (uilder)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #289 <Method Object List.get(int)>
	//    7   17:checkcast       #320 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    8   20:areturn         
		else
			return (uilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #324 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #320 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
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
	//    5   11:invokevirtual   #328 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(uninterpretedOption_);
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field List uninterpretedOption_>
	//    9   19:invokestatic    #200 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public boolean hasDeprecated()
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

	public boolean hasIdempotencyLevel()
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
		return DescriptorProtos.access$23700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$MethodOptions, com/google/protobuf/DescriptorProtos$MethodOptions$Builder);
	//    0    0:invokestatic    #336 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$23700()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$MethodOptions>
	//    2    5:ldc1            #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    3    7:invokevirtual   #342 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < getUninterpretedOptionCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #344 <Method int getUninterpretedOptionCount()>
	//*   5    7:icmpge          30
			if(!getUninterpretedOption(i).isInitialized())
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #346 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*   9   15:invokevirtual   #347 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
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
	//   19   31:invokevirtual   #350 <Method boolean extensionsAreInitialized()>
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
	//    3    3:invokevirtual   #357 <Method DescriptorProtos$MethodOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #361 <Method DescriptorProtos$MethodOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #357 <Method DescriptorProtos$MethodOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.MethodOptions)DescriptorProtos.MethodOptions.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #368 <Field Parser DescriptorProtos$MethodOptions.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #374 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$MethodOptions>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.MethodOptions) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #377 <Method DescriptorProtos$MethodOptions$Builder mergeFrom(DescriptorProtos$MethodOptions)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #380 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$MethodOptions>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #384 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #377 <Method DescriptorProtos$MethodOptions$Builder mergeFrom(DescriptorProtos$MethodOptions)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.MethodOptions)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.MethodOptions) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$MethodOptions$Builder mergeFrom(DescriptorProtos.MethodOptions methodoptions)
	{
		if(methodoptions == DescriptorProtos.MethodOptions.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #267 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodOptions.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(methodoptions.hasDeprecated())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #386 <Method boolean DescriptorProtos$MethodOptions.hasDeprecated()>
	//*   7   13:ifeq            25
			setDeprecated(methodoptions.getDeprecated());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #388 <Method boolean DescriptorProtos$MethodOptions.getDeprecated()>
	//   11   21:invokevirtual   #392 <Method DescriptorProtos$MethodOptions$Builder setDeprecated(boolean)>
	//   12   24:pop             
		if(methodoptions.hasIdempotencyLevel())
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #394 <Method boolean DescriptorProtos$MethodOptions.hasIdempotencyLevel()>
	//*  15   29:ifeq            41
			setIdempotencyLevel(methodoptions.getIdempotencyLevel());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #396 <Method DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions.getIdempotencyLevel()>
	//   19   37:invokevirtual   #400 <Method DescriptorProtos$MethodOptions$Builder setIdempotencyLevel(DescriptorProtos$MethodOptions$IdempotencyLevel)>
	//   20   40:pop             
		if(uninterpretedOptionBuilder_ == null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  23   45:ifnonnull       119
		{
			if(!DescriptorProtos.MethodOptions.access$24300(methodoptions).isEmpty())
	//*  24   48:aload_1         
	//*  25   49:invokestatic    #404 <Method List DescriptorProtos$MethodOptions.access$24300(DescriptorProtos$MethodOptions)>
	//*  26   52:invokeinterface #407 <Method boolean List.isEmpty()>
	//*  27   57:ifne            208
			{
				if(uninterpretedOption_.isEmpty())
	//*  28   60:aload_0         
	//*  29   61:getfield        #38  <Field List uninterpretedOption_>
	//*  30   64:invokeinterface #407 <Method boolean List.isEmpty()>
	//*  31   69:ifeq            94
				{
					uninterpretedOption_ = DescriptorProtos.MethodOptions.access$24300(methodoptions);
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:invokestatic    #404 <Method List DescriptorProtos$MethodOptions.access$24300(DescriptorProtos$MethodOptions)>
	//   35   77:putfield        #38  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & -5;
	//   36   80:aload_0         
	//   37   81:aload_0         
	//   38   82:getfield        #52  <Field int bitField0_>
	//   39   85:bipush          -5
	//   40   87:iand            
	//   41   88:putfield        #52  <Field int bitField0_>
				} else
	//*  42   91:goto            112
				{
					ensureUninterpretedOptionIsMutable();
	//   43   94:aload_0         
	//   44   95:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.addAll(((java.util.Collection) (DescriptorProtos.MethodOptions.access$24300(methodoptions))));
	//   45   98:aload_0         
	//   46   99:getfield        #38  <Field List uninterpretedOption_>
	//   47  102:aload_1         
	//   48  103:invokestatic    #404 <Method List DescriptorProtos$MethodOptions.access$24300(DescriptorProtos$MethodOptions)>
	//   49  106:invokeinterface #410 <Method boolean List.addAll(java.util.Collection)>
	//   50  111:pop             
				}
				onChanged();
	//   51  112:aload_0         
	//   52  113:invokevirtual   #101 <Method void onChanged()>
			}
		} else
	//*  53  116:goto            208
		if(!DescriptorProtos.MethodOptions.access$24300(methodoptions).isEmpty())
	//*  54  119:aload_1         
	//*  55  120:invokestatic    #404 <Method List DescriptorProtos$MethodOptions.access$24300(DescriptorProtos$MethodOptions)>
	//*  56  123:invokeinterface #407 <Method boolean List.isEmpty()>
	//*  57  128:ifne            208
			if(uninterpretedOptionBuilder_.isEmpty())
	//*  58  131:aload_0         
	//*  59  132:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  60  135:invokevirtual   #411 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  61  138:ifeq            196
			{
				uninterpretedOptionBuilder_.dispose();
	//   62  141:aload_0         
	//   63  142:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   64  145:invokevirtual   #414 <Method void RepeatedFieldBuilderV3.dispose()>
				uninterpretedOptionBuilder_ = null;
	//   65  148:aload_0         
	//   66  149:aconst_null     
	//   67  150:putfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				uninterpretedOption_ = DescriptorProtos.MethodOptions.access$24300(methodoptions);
	//   68  153:aload_0         
	//   69  154:aload_1         
	//   70  155:invokestatic    #404 <Method List DescriptorProtos$MethodOptions.access$24300(DescriptorProtos$MethodOptions)>
	//   71  158:putfield        #38  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & -5;
	//   72  161:aload_0         
	//   73  162:aload_0         
	//   74  163:getfield        #52  <Field int bitField0_>
	//   75  166:bipush          -5
	//   76  168:iand            
	//   77  169:putfield        #52  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*  78  172:getstatic       #86  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*  79  175:ifeq            186
					repeatedfieldbuilderv3 = getUninterpretedOptionFieldBuilder();
	//   80  178:aload_0         
	//   81  179:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//   82  182:astore_2        
				else
	//*  83  183:goto            188
					repeatedfieldbuilderv3 = null;
	//   84  186:aconst_null     
	//   85  187:astore_2        
				uninterpretedOptionBuilder_ = repeatedfieldbuilderv3;
	//   86  188:aload_0         
	//   87  189:aload_2         
	//   88  190:putfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			} else
	//*  89  193:goto            208
			{
				uninterpretedOptionBuilder_.addAllMessages(((Iterable) (DescriptorProtos.MethodOptions.access$24300(methodoptions))));
	//   90  196:aload_0         
	//   91  197:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   92  200:aload_1         
	//   93  201:invokestatic    #404 <Method List DescriptorProtos$MethodOptions.access$24300(DescriptorProtos$MethodOptions)>
	//   94  204:invokevirtual   #105 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   95  207:pop             
			}
		mergeExtensionFields(((GeneratedMessageV3.ExtendableMessage) (methodoptions)));
	//   96  208:aload_0         
	//   97  209:aload_1         
	//   98  210:invokevirtual   #418 <Method void mergeExtensionFields(GeneratedMessageV3$ExtendableMessage)>
		mergeUnknownFields(methodoptions.unknownFields);
	//   99  213:aload_0         
	//  100  214:aload_1         
	//  101  215:getfield        #422 <Field UnknownFieldSet DescriptorProtos$MethodOptions.unknownFields>
	//  102  218:invokevirtual   #426 <Method DescriptorProtos$MethodOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//  103  221:pop             
		onChanged();
	//  104  222:aload_0         
	//  105  223:invokevirtual   #101 <Method void onChanged()>
		return this;
	//  106  226:aload_0         
	//  107  227:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.MethodOptions)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$MethodOptions>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.MethodOptions)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$MethodOptions>
	//    6   12:invokevirtual   #377 <Method DescriptorProtos$MethodOptions$Builder mergeFrom(DescriptorProtos$MethodOptions)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #428 <Method AbstractMessage$Builder GeneratedMessageV3$ExtendableBuilder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #357 <Method DescriptorProtos$MethodOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #361 <Method DescriptorProtos$MethodOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #357 <Method DescriptorProtos$MethodOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #426 <Method DescriptorProtos$MethodOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$MethodOptions$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #435 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #426 <Method DescriptorProtos$MethodOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #426 <Method DescriptorProtos$MethodOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder removeUninterpretedOption(int i)
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
	//    8   16:invokeinterface #441 <Method Object List.remove(int)>
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
	//   17   33:invokevirtual   #444 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$MethodOptions$Builder setDeprecated(boolean flag)
	{
		bitField0_ = bitField0_ | 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int bitField0_>
	//    3    5:iconst_1        
	//    4    6:ior             
	//    5    7:putfield        #52  <Field int bitField0_>
		deprecated_ = flag;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #188 <Field boolean deprecated_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #101 <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.setExtension(generatedextension, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #449 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    6   10:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.setExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #452 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #455 <Method DescriptorProtos$MethodOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #457 <Method DescriptorProtos$MethodOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #460 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #462 <Method DescriptorProtos$MethodOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #462 <Method DescriptorProtos$MethodOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #462 <Method DescriptorProtos$MethodOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder setIdempotencyLevel(ncyLevel ncylevel)
	{
		if(ncylevel == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #144 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #145 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 2;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field int bitField0_>
	//    9   17:iconst_2        
	//   10   18:ior             
	//   11   19:putfield        #52  <Field int bitField0_>
			idempotencyLevel_ = ncylevel.getNumber();
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #465 <Method int DescriptorProtos$MethodOptions$IdempotencyLevel.getNumber()>
	//   15   27:putfield        #30  <Field int idempotencyLevel_>
			onChanged();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #101 <Method void onChanged()>
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$MethodOptions$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #470 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #473 <Method DescriptorProtos$MethodOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #473 <Method DescriptorProtos$MethodOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #473 <Method DescriptorProtos$MethodOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$MethodOptions$Builder setUninterpretedOption(int i, ilder ilder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.set(i, ((Object) (ilder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #131 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #479 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #101 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (ilder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #131 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   21   41:invokevirtual   #482 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$MethodOptions$Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
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
	//   15   29:invokeinterface #479 <Method Object List.set(int, Object)>
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
	//   25   47:invokevirtual   #482 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public final DescriptorProtos$MethodOptions$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$MethodOptions$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #485 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #487 <Method DescriptorProtos$MethodOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #487 <Method DescriptorProtos$MethodOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private boolean deprecated_;
	private int idempotencyLevel_;
	private RepeatedFieldBuilderV3 uninterpretedOptionBuilder_;
	private List uninterpretedOption_;

	private DescriptorProtos$MethodOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void GeneratedMessageV3$ExtendableBuilder()>
		idempotencyLevel_ = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field int idempotencyLevel_>
		uninterpretedOption_ = Collections.emptyList();
	//    5    9:aload_0         
	//    6   10:invokestatic    #36  <Method List Collections.emptyList()>
	//    7   13:putfield        #38  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//    8   16:aload_0         
	//    9   17:invokespecial   #41  <Method void maybeForceBuilderInitialization()>
	//   10   20:return          
	}

	DescriptorProtos$MethodOptions$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void DescriptorProtos$MethodOptions$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$MethodOptions$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void GeneratedMessageV3$ExtendableBuilder(GeneratedMessageV3$BuilderParent)>
		idempotencyLevel_ = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #30  <Field int idempotencyLevel_>
		uninterpretedOption_ = Collections.emptyList();
	//    6   10:aload_0         
	//    7   11:invokestatic    #36  <Method List Collections.emptyList()>
	//    8   14:putfield        #38  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//    9   17:aload_0         
	//   10   18:invokespecial   #41  <Method void maybeForceBuilderInitialization()>
	//   11   21:return          
	}

	DescriptorProtos$MethodOptions$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void DescriptorProtos$MethodOptions$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
