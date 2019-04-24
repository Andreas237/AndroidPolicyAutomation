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

public static final class DescriptorProtos$FieldOptions$Builder extends GeneratedMessageV3.ExtendableBuilder
	implements 
{

	private void ensureUninterpretedOptionIsMutable()
	{
		if((bitField0_ & 0x40) != 64)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field int bitField0_>
	//*   2    4:bipush          64
	//*   3    6:iand            
	//*   4    7:bipush          64
	//*   5    9:icmpeq          38
		{
			uninterpretedOption_ = ((List) (new ArrayList(((java.util.Collection) (uninterpretedOption_)))));
	//    6   12:aload_0         
	//    7   13:new             #60  <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #44  <Field List uninterpretedOption_>
	//   11   21:invokespecial   #63  <Method void ArrayList(java.util.Collection)>
	//   12   24:putfield        #44  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ | 0x40;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #58  <Field int bitField0_>
	//   16   32:bipush          64
	//   17   34:ior             
	//   18   35:putfield        #58  <Field int bitField0_>
		}
	//   19   38:return          
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$18700();
	//    0    0:invokestatic    #68  <Method Descriptors$Descriptor DescriptorProtos.access$18700()>
	//    1    3:areturn         
	}

	private RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       57
		{
			List list = uninterpretedOption_;
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field List uninterpretedOption_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 0x40) == 64)
	//*   6   12:aload_0         
	//*   7   13:getfield        #58  <Field int bitField0_>
	//*   8   16:bipush          64
	//*   9   18:iand            
	//*  10   19:bipush          64
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
	//   18   32:new             #74  <Class RepeatedFieldBuilderV3>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #78  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   42:aload_0         
	//   25   43:invokevirtual   #82  <Method boolean isClean()>
	//   26   46:invokespecial   #85  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   49:putfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			uninterpretedOption_ = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #44  <Field List uninterpretedOption_>
		}
		return uninterpretedOptionBuilder_;
	//   31   57:aload_0         
	//   32   58:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   33   61:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #92  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getUninterpretedOptionFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #94  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$FieldOptions$Builder addAllUninterpretedOption(Iterable iterable)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, uninterpretedOption_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field List uninterpretedOption_>
	//    8   16:invokestatic    #104 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #107 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #111 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$FieldOptions$Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.addExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #117 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (addExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #120 <Method DescriptorProtos$FieldOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #125 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #128 <Method DescriptorProtos$FieldOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #128 <Method DescriptorProtos$FieldOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #128 <Method DescriptorProtos$FieldOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder addUninterpretedOption(int i, uilder uilder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(i, ((Object) (uilder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #137 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #143 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #107 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (uilder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #137 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   20   40:invokevirtual   #147 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$FieldOptions$Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #150 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #151 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(i, ((Object) (uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #44  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #143 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #107 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #147 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$FieldOptions$Builder addUninterpretedOption(uilder uilder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.add(((Object) (uilder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field List uninterpretedOption_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #137 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//    9   19:invokeinterface #155 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #107 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (uilder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #137 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   19   39:invokevirtual   #158 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$FieldOptions$Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(uninterpretedoption == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #150 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #151 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(((Object) (uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #44  <Field List uninterpretedOption_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #155 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #107 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (uninterpretedoption)));
	//   20   40:aload_0         
	//   21   41:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #158 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public uilder addUninterpretedOptionBuilder()
	{
		return (uilder)getUninterpretedOptionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokestatic    #166 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    3    7:invokevirtual   #170 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #133 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   13:areturn         
	}

	public uilder addUninterpretedOptionBuilder(int i)
	{
		return (uilder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #166 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
	//    4    8:invokevirtual   #174 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #133 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos.FieldOptions build()
	{
		DescriptorProtos.FieldOptions fieldoptions = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method DescriptorProtos$FieldOptions buildPartial()>
	//    2    4:astore_1        
		if(!fieldoptions.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #181 <Method boolean DescriptorProtos$FieldOptions.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (fieldoptions)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #185 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return fieldoptions;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method DescriptorProtos$FieldOptions build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method DescriptorProtos$FieldOptions build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.FieldOptions buildPartial()
	{
		DescriptorProtos.FieldOptions fieldoptions = new DescriptorProtos.FieldOptions(((GeneratedMessageV3.ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$FieldOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #192 <Method void DescriptorProtos$FieldOptions(GeneratedMessageV3$ExtendableBuilder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #58  <Field int bitField0_>
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
		DescriptorProtos.FieldOptions.access$19202(fieldoptions, ctype_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #34  <Field int ctype_>
	//   21   33:invokestatic    #196 <Method int DescriptorProtos$FieldOptions.access$19202(DescriptorProtos$FieldOptions, int)>
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
		DescriptorProtos.FieldOptions.access$19302(fieldoptions, packed_);
	//   34   50:aload           4
	//   35   52:aload_0         
	//   36   53:getfield        #198 <Field boolean packed_>
	//   37   56:invokestatic    #202 <Method boolean DescriptorProtos$FieldOptions.access$19302(DescriptorProtos$FieldOptions, boolean)>
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
		DescriptorProtos.FieldOptions.access$19402(fieldoptions, jstype_);
	//   50   73:aload           4
	//   51   75:aload_0         
	//   52   76:getfield        #36  <Field int jstype_>
	//   53   79:invokestatic    #205 <Method int DescriptorProtos$FieldOptions.access$19402(DescriptorProtos$FieldOptions, int)>
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
		DescriptorProtos.FieldOptions.access$19502(fieldoptions, lazy_);
	//   66   99:aload           4
	//   67  101:aload_0         
	//   68  102:getfield        #207 <Field boolean lazy_>
	//   69  105:invokestatic    #210 <Method boolean DescriptorProtos$FieldOptions.access$19502(DescriptorProtos$FieldOptions, boolean)>
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
		DescriptorProtos.FieldOptions.access$19602(fieldoptions, deprecated_);
	//   82  125:aload           4
	//   83  127:aload_0         
	//   84  128:getfield        #212 <Field boolean deprecated_>
	//   85  131:invokestatic    #215 <Method boolean DescriptorProtos$FieldOptions.access$19602(DescriptorProtos$FieldOptions, boolean)>
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
		DescriptorProtos.FieldOptions.access$19702(fieldoptions, weak_);
	//   98  151:aload           4
	//   99  153:aload_0         
	//  100  154:getfield        #217 <Field boolean weak_>
	//  101  157:invokestatic    #220 <Method boolean DescriptorProtos$FieldOptions.access$19702(DescriptorProtos$FieldOptions, boolean)>
	//  102  160:pop             
		if(uninterpretedOptionBuilder_ == null)
	//* 103  161:aload_0         
	//* 104  162:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//* 105  165:ifnonnull       215
		{
			if((bitField0_ & 0x40) == 64)
	//* 106  168:aload_0         
	//* 107  169:getfield        #58  <Field int bitField0_>
	//* 108  172:bipush          64
	//* 109  174:iand            
	//* 110  175:bipush          64
	//* 111  177:icmpne          202
			{
				uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  112  180:aload_0         
	//  113  181:aload_0         
	//  114  182:getfield        #44  <Field List uninterpretedOption_>
	//  115  185:invokestatic    #224 <Method List Collections.unmodifiableList(List)>
	//  116  188:putfield        #44  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & 0xffffffbf;
	//  117  191:aload_0         
	//  118  192:aload_0         
	//  119  193:getfield        #58  <Field int bitField0_>
	//  120  196:bipush          -65
	//  121  198:iand            
	//  122  199:putfield        #58  <Field int bitField0_>
			}
			DescriptorProtos.FieldOptions.access$19802(fieldoptions, uninterpretedOption_);
	//  123  202:aload           4
	//  124  204:aload_0         
	//  125  205:getfield        #44  <Field List uninterpretedOption_>
	//  126  208:invokestatic    #228 <Method List DescriptorProtos$FieldOptions.access$19802(DescriptorProtos$FieldOptions, List)>
	//  127  211:pop             
		} else
	//* 128  212:goto            228
		{
			DescriptorProtos.FieldOptions.access$19802(fieldoptions, uninterpretedOptionBuilder_.build());
	//  129  215:aload           4
	//  130  217:aload_0         
	//  131  218:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//  132  221:invokevirtual   #230 <Method List RepeatedFieldBuilderV3.build()>
	//  133  224:invokestatic    #228 <Method List DescriptorProtos$FieldOptions.access$19802(DescriptorProtos$FieldOptions, List)>
	//  134  227:pop             
		}
		DescriptorProtos.FieldOptions.access$19902(fieldoptions, i);
	//  135  228:aload           4
	//  136  230:iload_1         
	//  137  231:invokestatic    #233 <Method int DescriptorProtos$FieldOptions.access$19902(DescriptorProtos$FieldOptions, int)>
	//  138  234:pop             
		onBuilt();
	//  139  235:aload_0         
	//  140  236:invokevirtual   #236 <Method void onBuilt()>
		return fieldoptions;
	//  141  239:aload           4
	//  142  241:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method DescriptorProtos$FieldOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method DescriptorProtos$FieldOptions buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #241 <Method DescriptorProtos$FieldOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #244 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clear()>
	//    2    4:pop             
		ctype_ = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #34  <Field int ctype_>
		bitField0_ = bitField0_ & -2;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #58  <Field int bitField0_>
	//    9   15:bipush          -2
	//   10   17:iand            
	//   11   18:putfield        #58  <Field int bitField0_>
		packed_ = false;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #198 <Field boolean packed_>
		bitField0_ = bitField0_ & -3;
	//   15   26:aload_0         
	//   16   27:aload_0         
	//   17   28:getfield        #58  <Field int bitField0_>
	//   18   31:bipush          -3
	//   19   33:iand            
	//   20   34:putfield        #58  <Field int bitField0_>
		jstype_ = 0;
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:putfield        #36  <Field int jstype_>
		bitField0_ = bitField0_ & -5;
	//   24   42:aload_0         
	//   25   43:aload_0         
	//   26   44:getfield        #58  <Field int bitField0_>
	//   27   47:bipush          -5
	//   28   49:iand            
	//   29   50:putfield        #58  <Field int bitField0_>
		lazy_ = false;
	//   30   53:aload_0         
	//   31   54:iconst_0        
	//   32   55:putfield        #207 <Field boolean lazy_>
		bitField0_ = bitField0_ & -9;
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:getfield        #58  <Field int bitField0_>
	//   36   63:bipush          -9
	//   37   65:iand            
	//   38   66:putfield        #58  <Field int bitField0_>
		deprecated_ = false;
	//   39   69:aload_0         
	//   40   70:iconst_0        
	//   41   71:putfield        #212 <Field boolean deprecated_>
		bitField0_ = bitField0_ & 0xffffffef;
	//   42   74:aload_0         
	//   43   75:aload_0         
	//   44   76:getfield        #58  <Field int bitField0_>
	//   45   79:bipush          -17
	//   46   81:iand            
	//   47   82:putfield        #58  <Field int bitField0_>
		weak_ = false;
	//   48   85:aload_0         
	//   49   86:iconst_0        
	//   50   87:putfield        #217 <Field boolean weak_>
		bitField0_ = bitField0_ & 0xffffffdf;
	//   51   90:aload_0         
	//   52   91:aload_0         
	//   53   92:getfield        #58  <Field int bitField0_>
	//   54   95:bipush          -33
	//   55   97:iand            
	//   56   98:putfield        #58  <Field int bitField0_>
		if(uninterpretedOptionBuilder_ == null)
	//*  57  101:aload_0         
	//*  58  102:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  59  105:ifnonnull       128
		{
			uninterpretedOption_ = Collections.emptyList();
	//   60  108:aload_0         
	//   61  109:invokestatic    #42  <Method List Collections.emptyList()>
	//   62  112:putfield        #44  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & 0xffffffbf;
	//   63  115:aload_0         
	//   64  116:aload_0         
	//   65  117:getfield        #58  <Field int bitField0_>
	//   66  120:bipush          -65
	//   67  122:iand            
	//   68  123:putfield        #58  <Field int bitField0_>
			return this;
	//   69  126:aload_0         
	//   70  127:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   71  128:aload_0         
	//   72  129:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   73  132:invokevirtual   #246 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   74  135:aload_0         
	//   75  136:areturn         
		}
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #241 <Method DescriptorProtos$FieldOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clear()
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #241 <Method DescriptorProtos$FieldOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #241 <Method DescriptorProtos$FieldOptions$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #241 <Method DescriptorProtos$FieldOptions$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clearCtype()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #58  <Field int bitField0_>
		ctype_ = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #34  <Field int ctype_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clearDeprecated()
	{
		bitField0_ = bitField0_ & 0xffffffef;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:bipush          -17
	//    4    7:iand            
	//    5    8:putfield        #58  <Field int bitField0_>
		deprecated_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #212 <Field boolean deprecated_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.clearExtension(generatedextension);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #256 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clearExtension(generatedextension)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #259 <Method DescriptorProtos$FieldOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #264 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #267 <Method DescriptorProtos$FieldOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #267 <Method DescriptorProtos$FieldOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #267 <Method DescriptorProtos$FieldOptions$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clearJstype()
	{
		bitField0_ = bitField0_ & -5;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:bipush          -5
	//    4    7:iand            
	//    5    8:putfield        #58  <Field int bitField0_>
		jstype_ = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #36  <Field int jstype_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clearLazy()
	{
		bitField0_ = bitField0_ & -9;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:bipush          -9
	//    4    7:iand            
	//    5    8:putfield        #58  <Field int bitField0_>
		lazy_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #207 <Field boolean lazy_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #275 <Method DescriptorProtos$FieldOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #278 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #275 <Method DescriptorProtos$FieldOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #275 <Method DescriptorProtos$FieldOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clearPacked()
	{
		bitField0_ = bitField0_ & -3;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:bipush          -3
	//    4    7:iand            
	//    5    8:putfield        #58  <Field int bitField0_>
		packed_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #198 <Field boolean packed_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clearUninterpretedOption()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       31
		{
			uninterpretedOption_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #42  <Method List Collections.emptyList()>
	//    5   11:putfield        #44  <Field List uninterpretedOption_>
			bitField0_ = bitField0_ & 0xffffffbf;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field int bitField0_>
	//    9   19:bipush          -65
	//   10   21:iand            
	//   11   22:putfield        #58  <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #107 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			uninterpretedOptionBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   35:invokevirtual   #246 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public DescriptorProtos$FieldOptions$Builder clearWeak()
	{
		bitField0_ = bitField0_ & 0xffffffdf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:bipush          -33
	//    4    7:iand            
	//    5    8:putfield        #58  <Field int bitField0_>
		weak_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #217 <Field boolean weak_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method DescriptorProtos$FieldOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method DescriptorProtos$FieldOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder clone()
	{
		return (DescriptorProtos$FieldOptions$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #288 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method DescriptorProtos$FieldOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method DescriptorProtos$FieldOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method DescriptorProtos$FieldOptions$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method DescriptorProtos$FieldOptions$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.FieldOptions.CType getCtype()
	{
		DescriptorProtos.FieldOptions.CType ctype = DescriptorProtos.FieldOptions.CType.valueOf(ctype_);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int ctype_>
	//    2    4:invokestatic    #300 <Method DescriptorProtos$FieldOptions$CType DescriptorProtos$FieldOptions$CType.valueOf(int)>
	//    3    7:astore_1        
		if(ctype == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return DescriptorProtos.FieldOptions.CType.STRING;
	//    6   12:getstatic       #304 <Field DescriptorProtos$FieldOptions$CType DescriptorProtos$FieldOptions$CType.STRING>
	//    7   15:areturn         
		else
			return ctype;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public DescriptorProtos.FieldOptions getDefaultInstanceForType()
	{
		return DescriptorProtos.FieldOptions.getDefaultInstance();
	//    0    0:invokestatic    #307 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #309 <Method DescriptorProtos$FieldOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #309 <Method DescriptorProtos$FieldOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$18700();
	//    0    0:invokestatic    #68  <Method Descriptors$Descriptor DescriptorProtos.access$18700()>
	//    1    3:areturn         
	}

	public DescriptorProtos.FieldOptions.JSType getJstype()
	{
		DescriptorProtos.FieldOptions.JSType jstype = DescriptorProtos.FieldOptions.JSType.valueOf(jstype_);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int jstype_>
	//    2    4:invokestatic    #318 <Method DescriptorProtos$FieldOptions$JSType DescriptorProtos$FieldOptions$JSType.valueOf(int)>
	//    3    7:astore_1        
		if(jstype == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return DescriptorProtos.FieldOptions.JSType.JS_NORMAL;
	//    6   12:getstatic       #322 <Field DescriptorProtos$FieldOptions$JSType DescriptorProtos$FieldOptions$JSType.JS_NORMAL>
	//    7   15:areturn         
		else
			return jstype;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public boolean getLazy()
	{
		return lazy_;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field boolean lazy_>
	//    2    4:ireturn         
	}

	public boolean getPacked()
	{
		return packed_;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field boolean packed_>
	//    2    4:ireturn         
	}

	public DescriptorProtos.UninterpretedOption getUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.UninterpretedOption)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #330 <Method Object List.get(int)>
	//    7   17:checkcast       #163 <Class DescriptorProtos$UninterpretedOption>
	//    8   20:areturn         
		else
			return (DescriptorProtos.UninterpretedOption)uninterpretedOptionBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #334 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #163 <Class DescriptorProtos$UninterpretedOption>
	//   14   32:areturn         
	}

	public uilder getUninterpretedOptionBuilder(int i)
	{
		return (uilder)getUninterpretedOptionFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #339 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #133 <Class DescriptorProtos$UninterpretedOption$Builder>
	//    5   11:areturn         
	}

	public List getUninterpretedOptionBuilderList()
	{
		return getUninterpretedOptionFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//    2    4:invokevirtual   #343 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       17
			return uninterpretedOption_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field List uninterpretedOption_>
	//    5   11:invokeinterface #349 <Method int List.size()>
	//    6   16:ireturn         
		else
			return uninterpretedOptionBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   21:invokevirtual   #352 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(uninterpretedOption_);
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field List uninterpretedOption_>
	//    5   11:invokestatic    #224 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return uninterpretedOptionBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    9   19:invokevirtual   #356 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public Builder getUninterpretedOptionOrBuilder(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       21
			return (Builder)uninterpretedOption_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field List uninterpretedOption_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #330 <Method Object List.get(int)>
	//    7   17:checkcast       #361 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    8   20:areturn         
		else
			return (Builder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #365 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #361 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//   14   32:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		if(uninterpretedOptionBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnull          15
			return uninterpretedOptionBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//    5   11:invokevirtual   #369 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(uninterpretedOption_);
	//    7   15:aload_0         
	//    8   16:getfield        #44  <Field List uninterpretedOption_>
	//    9   19:invokestatic    #224 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public boolean getWeak()
	{
		return weak_;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field boolean weak_>
	//    2    4:ireturn         
	}

	public boolean hasCtype()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int bitField0_>
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
		return (bitField0_ & 0x10) == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int bitField0_>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:bipush          16
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasJstype()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasLazy()
	{
		return (bitField0_ & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int bitField0_>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasPacked()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasWeak()
	{
		return (bitField0_ & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int bitField0_>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	protected GeneratedMessageV3$FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$18800().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FieldOptions, com/google/protobuf/DescriptorProtos$FieldOptions$Builder);
	//    0    0:invokestatic    #382 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$18800()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$FieldOptions>
	//    2    5:ldc1            #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    3    7:invokevirtual   #388 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < getUninterpretedOptionCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #390 <Method int getUninterpretedOptionCount()>
	//*   5    7:icmpge          30
			if(!getUninterpretedOption(i).isInitialized())
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #392 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*   9   15:invokevirtual   #393 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
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
	//   19   31:invokevirtual   #396 <Method boolean extensionsAreInitialized()>
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
	//    3    3:invokevirtual   #403 <Method DescriptorProtos$FieldOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #407 <Method DescriptorProtos$FieldOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #403 <Method DescriptorProtos$FieldOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.FieldOptions)DescriptorProtos.FieldOptions.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #414 <Field Parser DescriptorProtos$FieldOptions.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #420 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$FieldOptions>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.FieldOptions) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #423 <Method DescriptorProtos$FieldOptions$Builder mergeFrom(DescriptorProtos$FieldOptions)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #426 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$FieldOptions>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #430 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #423 <Method DescriptorProtos$FieldOptions$Builder mergeFrom(DescriptorProtos$FieldOptions)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.FieldOptions)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.FieldOptions) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$FieldOptions$Builder mergeFrom(DescriptorProtos.FieldOptions fieldoptions)
	{
		if(fieldoptions == DescriptorProtos.FieldOptions.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #307 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(fieldoptions.hasCtype())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #432 <Method boolean DescriptorProtos$FieldOptions.hasCtype()>
	//*   7   13:ifeq            25
			setCtype(fieldoptions.getCtype());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #434 <Method DescriptorProtos$FieldOptions$CType DescriptorProtos$FieldOptions.getCtype()>
	//   11   21:invokevirtual   #438 <Method DescriptorProtos$FieldOptions$Builder setCtype(DescriptorProtos$FieldOptions$CType)>
	//   12   24:pop             
		if(fieldoptions.hasPacked())
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #440 <Method boolean DescriptorProtos$FieldOptions.hasPacked()>
	//*  15   29:ifeq            41
			setPacked(fieldoptions.getPacked());
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #442 <Method boolean DescriptorProtos$FieldOptions.getPacked()>
	//   19   37:invokevirtual   #446 <Method DescriptorProtos$FieldOptions$Builder setPacked(boolean)>
	//   20   40:pop             
		if(fieldoptions.hasJstype())
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #448 <Method boolean DescriptorProtos$FieldOptions.hasJstype()>
	//*  23   45:ifeq            57
			setJstype(fieldoptions.getJstype());
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #450 <Method DescriptorProtos$FieldOptions$JSType DescriptorProtos$FieldOptions.getJstype()>
	//   27   53:invokevirtual   #454 <Method DescriptorProtos$FieldOptions$Builder setJstype(DescriptorProtos$FieldOptions$JSType)>
	//   28   56:pop             
		if(fieldoptions.hasLazy())
	//*  29   57:aload_1         
	//*  30   58:invokevirtual   #456 <Method boolean DescriptorProtos$FieldOptions.hasLazy()>
	//*  31   61:ifeq            73
			setLazy(fieldoptions.getLazy());
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #458 <Method boolean DescriptorProtos$FieldOptions.getLazy()>
	//   35   69:invokevirtual   #461 <Method DescriptorProtos$FieldOptions$Builder setLazy(boolean)>
	//   36   72:pop             
		if(fieldoptions.hasDeprecated())
	//*  37   73:aload_1         
	//*  38   74:invokevirtual   #463 <Method boolean DescriptorProtos$FieldOptions.hasDeprecated()>
	//*  39   77:ifeq            89
			setDeprecated(fieldoptions.getDeprecated());
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokevirtual   #465 <Method boolean DescriptorProtos$FieldOptions.getDeprecated()>
	//   43   85:invokevirtual   #468 <Method DescriptorProtos$FieldOptions$Builder setDeprecated(boolean)>
	//   44   88:pop             
		if(fieldoptions.hasWeak())
	//*  45   89:aload_1         
	//*  46   90:invokevirtual   #470 <Method boolean DescriptorProtos$FieldOptions.hasWeak()>
	//*  47   93:ifeq            105
			setWeak(fieldoptions.getWeak());
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:invokevirtual   #472 <Method boolean DescriptorProtos$FieldOptions.getWeak()>
	//   51  101:invokevirtual   #475 <Method DescriptorProtos$FieldOptions$Builder setWeak(boolean)>
	//   52  104:pop             
		if(uninterpretedOptionBuilder_ == null)
	//*  53  105:aload_0         
	//*  54  106:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  55  109:ifnonnull       183
		{
			if(!DescriptorProtos.FieldOptions.access$19800(fieldoptions).isEmpty())
	//*  56  112:aload_1         
	//*  57  113:invokestatic    #479 <Method List DescriptorProtos$FieldOptions.access$19800(DescriptorProtos$FieldOptions)>
	//*  58  116:invokeinterface #482 <Method boolean List.isEmpty()>
	//*  59  121:ifne            272
			{
				if(uninterpretedOption_.isEmpty())
	//*  60  124:aload_0         
	//*  61  125:getfield        #44  <Field List uninterpretedOption_>
	//*  62  128:invokeinterface #482 <Method boolean List.isEmpty()>
	//*  63  133:ifeq            158
				{
					uninterpretedOption_ = DescriptorProtos.FieldOptions.access$19800(fieldoptions);
	//   64  136:aload_0         
	//   65  137:aload_1         
	//   66  138:invokestatic    #479 <Method List DescriptorProtos$FieldOptions.access$19800(DescriptorProtos$FieldOptions)>
	//   67  141:putfield        #44  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & 0xffffffbf;
	//   68  144:aload_0         
	//   69  145:aload_0         
	//   70  146:getfield        #58  <Field int bitField0_>
	//   71  149:bipush          -65
	//   72  151:iand            
	//   73  152:putfield        #58  <Field int bitField0_>
				} else
	//*  74  155:goto            176
				{
					ensureUninterpretedOptionIsMutable();
	//   75  158:aload_0         
	//   76  159:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.addAll(((java.util.Collection) (DescriptorProtos.FieldOptions.access$19800(fieldoptions))));
	//   77  162:aload_0         
	//   78  163:getfield        #44  <Field List uninterpretedOption_>
	//   79  166:aload_1         
	//   80  167:invokestatic    #479 <Method List DescriptorProtos$FieldOptions.access$19800(DescriptorProtos$FieldOptions)>
	//   81  170:invokeinterface #485 <Method boolean List.addAll(java.util.Collection)>
	//   82  175:pop             
				}
				onChanged();
	//   83  176:aload_0         
	//   84  177:invokevirtual   #107 <Method void onChanged()>
			}
		} else
	//*  85  180:goto            272
		if(!DescriptorProtos.FieldOptions.access$19800(fieldoptions).isEmpty())
	//*  86  183:aload_1         
	//*  87  184:invokestatic    #479 <Method List DescriptorProtos$FieldOptions.access$19800(DescriptorProtos$FieldOptions)>
	//*  88  187:invokeinterface #482 <Method boolean List.isEmpty()>
	//*  89  192:ifne            272
			if(uninterpretedOptionBuilder_.isEmpty())
	//*  90  195:aload_0         
	//*  91  196:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*  92  199:invokevirtual   #486 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  93  202:ifeq            260
			{
				uninterpretedOptionBuilder_.dispose();
	//   94  205:aload_0         
	//   95  206:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   96  209:invokevirtual   #489 <Method void RepeatedFieldBuilderV3.dispose()>
				uninterpretedOptionBuilder_ = null;
	//   97  212:aload_0         
	//   98  213:aconst_null     
	//   99  214:putfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				uninterpretedOption_ = DescriptorProtos.FieldOptions.access$19800(fieldoptions);
	//  100  217:aload_0         
	//  101  218:aload_1         
	//  102  219:invokestatic    #479 <Method List DescriptorProtos$FieldOptions.access$19800(DescriptorProtos$FieldOptions)>
	//  103  222:putfield        #44  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & 0xffffffbf;
	//  104  225:aload_0         
	//  105  226:aload_0         
	//  106  227:getfield        #58  <Field int bitField0_>
	//  107  230:bipush          -65
	//  108  232:iand            
	//  109  233:putfield        #58  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 110  236:getstatic       #92  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 111  239:ifeq            250
					repeatedfieldbuilderv3 = getUninterpretedOptionFieldBuilder();
	//  112  242:aload_0         
	//  113  243:invokespecial   #94  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
	//  114  246:astore_2        
				else
	//* 115  247:goto            252
					repeatedfieldbuilderv3 = null;
	//  116  250:aconst_null     
	//  117  251:astore_2        
				uninterpretedOptionBuilder_ = repeatedfieldbuilderv3;
	//  118  252:aload_0         
	//  119  253:aload_2         
	//  120  254:putfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
			} else
	//* 121  257:goto            272
			{
				uninterpretedOptionBuilder_.addAllMessages(((Iterable) (DescriptorProtos.FieldOptions.access$19800(fieldoptions))));
	//  122  260:aload_0         
	//  123  261:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//  124  264:aload_1         
	//  125  265:invokestatic    #479 <Method List DescriptorProtos$FieldOptions.access$19800(DescriptorProtos$FieldOptions)>
	//  126  268:invokevirtual   #111 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  127  271:pop             
			}
		mergeExtensionFields(((GeneratedMessageV3.ExtendableMessage) (fieldoptions)));
	//  128  272:aload_0         
	//  129  273:aload_1         
	//  130  274:invokevirtual   #493 <Method void mergeExtensionFields(GeneratedMessageV3$ExtendableMessage)>
		mergeUnknownFields(fieldoptions.unknownFields);
	//  131  277:aload_0         
	//  132  278:aload_1         
	//  133  279:getfield        #497 <Field UnknownFieldSet DescriptorProtos$FieldOptions.unknownFields>
	//  134  282:invokevirtual   #501 <Method DescriptorProtos$FieldOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//  135  285:pop             
		onChanged();
	//  136  286:aload_0         
	//  137  287:invokevirtual   #107 <Method void onChanged()>
		return this;
	//  138  290:aload_0         
	//  139  291:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.FieldOptions)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$FieldOptions>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.FieldOptions)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$FieldOptions>
	//    6   12:invokevirtual   #423 <Method DescriptorProtos$FieldOptions$Builder mergeFrom(DescriptorProtos$FieldOptions)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #503 <Method AbstractMessage$Builder GeneratedMessageV3$ExtendableBuilder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #403 <Method DescriptorProtos$FieldOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #407 <Method DescriptorProtos$FieldOptions$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #403 <Method DescriptorProtos$FieldOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #501 <Method DescriptorProtos$FieldOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$FieldOptions$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #510 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #501 <Method DescriptorProtos$FieldOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #501 <Method DescriptorProtos$FieldOptions$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder removeUninterpretedOption(int i)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #516 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #107 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			uninterpretedOptionBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #519 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$FieldOptions$Builder setCtype(DescriptorProtos.FieldOptions.CType ctype)
	{
		if(ctype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #150 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #151 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #58  <Field int bitField0_>
			ctype_ = ctype.getNumber();
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #522 <Method int DescriptorProtos$FieldOptions$CType.getNumber()>
	//   15   27:putfield        #34  <Field int ctype_>
			onChanged();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #107 <Method void onChanged()>
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$FieldOptions$Builder setDeprecated(boolean flag)
	{
		bitField0_ = bitField0_ | 0x10;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:bipush          16
	//    4    7:ior             
	//    5    8:putfield        #58  <Field int bitField0_>
		deprecated_ = flag;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #212 <Field boolean deprecated_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.setExtension(generatedextension, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #527 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    6   10:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.setExtension(generatedextension, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #530 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #533 <Method DescriptorProtos$FieldOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #535 <Method DescriptorProtos$FieldOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #538 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #540 <Method DescriptorProtos$FieldOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #540 <Method DescriptorProtos$FieldOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #540 <Method DescriptorProtos$FieldOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder setJstype(DescriptorProtos.FieldOptions.JSType jstype)
	{
		if(jstype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #150 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #151 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 4;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field int bitField0_>
	//    9   17:iconst_4        
	//   10   18:ior             
	//   11   19:putfield        #58  <Field int bitField0_>
			jstype_ = jstype.getNumber();
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #541 <Method int DescriptorProtos$FieldOptions$JSType.getNumber()>
	//   15   27:putfield        #36  <Field int jstype_>
			onChanged();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #107 <Method void onChanged()>
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$FieldOptions$Builder setLazy(boolean flag)
	{
		bitField0_ = bitField0_ | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #58  <Field int bitField0_>
		lazy_ = flag;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #207 <Field boolean lazy_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder setPacked(boolean flag)
	{
		bitField0_ = bitField0_ | 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:iconst_2        
	//    4    6:ior             
	//    5    7:putfield        #58  <Field int bitField0_>
		packed_ = flag;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #198 <Field boolean packed_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #546 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #549 <Method DescriptorProtos$FieldOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile GeneratedMessageV3.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #549 <Method DescriptorProtos$FieldOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #549 <Method DescriptorProtos$FieldOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder setUninterpretedOption(int i, uilder uilder)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureUninterpretedOptionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
			uninterpretedOption_.set(i, ((Object) (uilder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field List uninterpretedOption_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #137 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   10   20:invokeinterface #555 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #107 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (uilder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #137 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
	//   21   41:invokevirtual   #558 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$FieldOptions$Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
	{
		if(uninterpretedOptionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(uninterpretedoption == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #150 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #151 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureUninterpretedOptionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.set(i, ((Object) (uninterpretedoption)));
	//   11   23:aload_0         
	//   12   24:getfield        #44  <Field List uninterpretedOption_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #555 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #107 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (uninterpretedoption)));
	//   21   41:aload_0         
	//   22   42:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #558 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public final DescriptorProtos$FieldOptions$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FieldOptions$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #561 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #563 <Method DescriptorProtos$FieldOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #563 <Method DescriptorProtos$FieldOptions$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldOptions$Builder setWeak(boolean flag)
	{
		bitField0_ = bitField0_ | 0x20;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int bitField0_>
	//    3    5:bipush          32
	//    4    7:ior             
	//    5    8:putfield        #58  <Field int bitField0_>
		weak_ = flag;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #217 <Field boolean weak_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #107 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	private int bitField0_;
	private int ctype_;
	private boolean deprecated_;
	private int jstype_;
	private boolean lazy_;
	private boolean packed_;
	private RepeatedFieldBuilderV3 uninterpretedOptionBuilder_;
	private List uninterpretedOption_;
	private boolean weak_;

	private DescriptorProtos$FieldOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void GeneratedMessageV3$ExtendableBuilder()>
		ctype_ = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #34  <Field int ctype_>
		jstype_ = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #36  <Field int jstype_>
		uninterpretedOption_ = Collections.emptyList();
	//    8   14:aload_0         
	//    9   15:invokestatic    #42  <Method List Collections.emptyList()>
	//   10   18:putfield        #44  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//   11   21:aload_0         
	//   12   22:invokespecial   #47  <Method void maybeForceBuilderInitialization()>
	//   13   25:return          
	}

	DescriptorProtos$FieldOptions$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void DescriptorProtos$FieldOptions$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$FieldOptions$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void GeneratedMessageV3$ExtendableBuilder(GeneratedMessageV3$BuilderParent)>
		ctype_ = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #34  <Field int ctype_>
		jstype_ = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #36  <Field int jstype_>
		uninterpretedOption_ = Collections.emptyList();
	//    9   15:aload_0         
	//   10   16:invokestatic    #42  <Method List Collections.emptyList()>
	//   11   19:putfield        #44  <Field List uninterpretedOption_>
		maybeForceBuilderInitialization();
	//   12   22:aload_0         
	//   13   23:invokespecial   #47  <Method void maybeForceBuilderInitialization()>
	//   14   26:return          
	}

	DescriptorProtos$FieldOptions$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void DescriptorProtos$FieldOptions$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
