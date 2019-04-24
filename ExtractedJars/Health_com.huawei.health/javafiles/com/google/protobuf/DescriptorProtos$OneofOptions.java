// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, InvalidProtocolBufferException, UnknownFieldSet, CodedInputStream, 
//			GeneratedMessageV3, Parser, MessageLite, CodedOutputStream, 
//			ExtensionRegistryLite, ByteString, Message, RepeatedFieldBuilderV3, 
//			AbstractParser

public static final class DescriptorProtos$OneofOptions extends essage
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.ExtendableBuilder
		implements DescriptorProtos.OneofOptionsOrBuilder
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
			return DescriptorProtos.access$20100();
		//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$20100()>
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

		public Builder addAllUninterpretedOption(Iterable iterable)
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

		public Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.addExtension(generatedextension, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #107 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (addExtension(generatedextension, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #110 <Method DescriptorProtos$OneofOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:areturn         
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #115 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #118 <Method DescriptorProtos$OneofOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #118 <Method DescriptorProtos$OneofOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #118 <Method DescriptorProtos$OneofOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
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

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
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

		public Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption.Builder builder)
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

		public Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption uninterpretedoption)
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

		public DescriptorProtos.OneofOptions build()
		{
			DescriptorProtos.OneofOptions oneofoptions = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #168 <Method DescriptorProtos$OneofOptions buildPartial()>
		//    2    4:astore_1        
			if(!oneofoptions.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #171 <Method boolean DescriptorProtos$OneofOptions.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (oneofoptions)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #175 <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return oneofoptions;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #178 <Method DescriptorProtos$OneofOptions build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #178 <Method DescriptorProtos$OneofOptions build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.OneofOptions buildPartial()
		{
			DescriptorProtos.OneofOptions oneofoptions = new DescriptorProtos.OneofOptions(((GeneratedMessageV3.ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #9   <Class DescriptorProtos$OneofOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #182 <Method void DescriptorProtos$OneofOptions(GeneratedMessageV3$ExtendableBuilder, DescriptorProtos$1)>
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
				oneofoptions.uninterpretedOption_ = uninterpretedOption_;
		//   29   54:aload_2         
		//   30   55:aload_0         
		//   31   56:getfield        #33  <Field List uninterpretedOption_>
		//   32   59:invokestatic    #190 <Method List DescriptorProtos$OneofOptions.access$20602(DescriptorProtos$OneofOptions, List)>
		//   33   62:pop             
			} else
		//*  34   63:goto            78
			{
				oneofoptions.uninterpretedOption_ = uninterpretedOptionBuilder_.build();
		//   35   66:aload_2         
		//   36   67:aload_0         
		//   37   68:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   38   71:invokevirtual   #192 <Method List RepeatedFieldBuilderV3.build()>
		//   39   74:invokestatic    #190 <Method List DescriptorProtos$OneofOptions.access$20602(DescriptorProtos$OneofOptions, List)>
		//   40   77:pop             
			}
			onBuilt();
		//   41   78:aload_0         
		//   42   79:invokevirtual   #195 <Method void onBuilt()>
			return oneofoptions;
		//   43   82:aload_2         
		//   44   83:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #168 <Method DescriptorProtos$OneofOptions buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #168 <Method DescriptorProtos$OneofOptions buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #200 <Method DescriptorProtos$OneofOptions$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
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
		//    1    1:invokevirtual   #200 <Method DescriptorProtos$OneofOptions$Builder clear()>
		//    2    4:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clear()
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #200 <Method DescriptorProtos$OneofOptions$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #200 <Method DescriptorProtos$OneofOptions$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #200 <Method DescriptorProtos$OneofOptions$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return (Builder)super.clearExtension(generatedextension);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #213 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clearExtension(generatedextension)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #216 <Method DescriptorProtos$OneofOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
		//    3    5:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #221 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #224 <Method DescriptorProtos$OneofOptions$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #224 <Method DescriptorProtos$OneofOptions$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #224 <Method DescriptorProtos$OneofOptions$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #230 <Method DescriptorProtos$OneofOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #233 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #230 <Method DescriptorProtos$OneofOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #230 <Method DescriptorProtos$OneofOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearUninterpretedOption()
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
		//    1    1:invokevirtual   #238 <Method DescriptorProtos$OneofOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #238 <Method DescriptorProtos$OneofOptions$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #241 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #238 <Method DescriptorProtos$OneofOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #238 <Method DescriptorProtos$OneofOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #238 <Method DescriptorProtos$OneofOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #238 <Method DescriptorProtos$OneofOptions$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.OneofOptions getDefaultInstanceForType()
		{
			return DescriptorProtos.OneofOptions.getDefaultInstance();
		//    0    0:invokestatic    #248 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #250 <Method DescriptorProtos$OneofOptions getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #250 <Method DescriptorProtos$OneofOptions getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$20100();
		//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$20100()>
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
			return DescriptorProtos.access$20200().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$OneofOptions, com/google/protobuf/DescriptorProtos$OneofOptions$Builder);
		//    0    0:invokestatic    #302 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$20200()>
		//    1    3:ldc1            #9   <Class DescriptorProtos$OneofOptions>
		//    2    5:ldc1            #2   <Class DescriptorProtos$OneofOptions$Builder>
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
		//    3    3:invokevirtual   #323 <Method DescriptorProtos$OneofOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #327 <Method DescriptorProtos$OneofOptions$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #323 <Method DescriptorProtos$OneofOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.OneofOptions)DescriptorProtos.OneofOptions.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #334 <Field Parser DescriptorProtos$OneofOptions.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #340 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class DescriptorProtos$OneofOptions>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.OneofOptions) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #343 <Method DescriptorProtos$OneofOptions$Builder mergeFrom(DescriptorProtos$OneofOptions)>
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
		//*  23   40:checkcast       #9   <Class DescriptorProtos$OneofOptions>
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
		//*  35   58:invokevirtual   #343 <Method DescriptorProtos$OneofOptions$Builder mergeFrom(DescriptorProtos$OneofOptions)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.OneofOptions)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.OneofOptions) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.OneofOptions oneofoptions)
		{
			if(oneofoptions == DescriptorProtos.OneofOptions.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #248 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(uninterpretedOptionBuilder_ == null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   7   13:ifnonnull       87
			{
				if(!oneofoptions.uninterpretedOption_.isEmpty())
		//*   8   16:aload_1         
		//*   9   17:invokestatic    #354 <Method List DescriptorProtos$OneofOptions.access$20600(DescriptorProtos$OneofOptions)>
		//*  10   20:invokeinterface #357 <Method boolean List.isEmpty()>
		//*  11   25:ifne            176
				{
					if(uninterpretedOption_.isEmpty())
		//*  12   28:aload_0         
		//*  13   29:getfield        #33  <Field List uninterpretedOption_>
		//*  14   32:invokeinterface #357 <Method boolean List.isEmpty()>
		//*  15   37:ifeq            62
					{
						uninterpretedOption_ = oneofoptions.uninterpretedOption_;
		//   16   40:aload_0         
		//   17   41:aload_1         
		//   18   42:invokestatic    #354 <Method List DescriptorProtos$OneofOptions.access$20600(DescriptorProtos$OneofOptions)>
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
						uninterpretedOption_.addAll(((java.util.Collection) (oneofoptions.uninterpretedOption_)));
		//   29   66:aload_0         
		//   30   67:getfield        #33  <Field List uninterpretedOption_>
		//   31   70:aload_1         
		//   32   71:invokestatic    #354 <Method List DescriptorProtos$OneofOptions.access$20600(DescriptorProtos$OneofOptions)>
		//   33   74:invokeinterface #360 <Method boolean List.addAll(java.util.Collection)>
		//   34   79:pop             
					}
					onChanged();
		//   35   80:aload_0         
		//   36   81:invokevirtual   #97  <Method void onChanged()>
				}
			} else
		//*  37   84:goto            176
			if(!oneofoptions.uninterpretedOption_.isEmpty())
		//*  38   87:aload_1         
		//*  39   88:invokestatic    #354 <Method List DescriptorProtos$OneofOptions.access$20600(DescriptorProtos$OneofOptions)>
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
					uninterpretedOption_ = oneofoptions.uninterpretedOption_;
		//   52  121:aload_0         
		//   53  122:aload_1         
		//   54  123:invokestatic    #354 <Method List DescriptorProtos$OneofOptions.access$20600(DescriptorProtos$OneofOptions)>
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
					uninterpretedOptionBuilder_.addAllMessages(((Iterable) (oneofoptions.uninterpretedOption_)));
		//   74  164:aload_0         
		//   75  165:getfield        #61  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   76  168:aload_1         
		//   77  169:invokestatic    #354 <Method List DescriptorProtos$OneofOptions.access$20600(DescriptorProtos$OneofOptions)>
		//   78  172:invokevirtual   #101 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   79  175:pop             
				}
			mergeExtensionFields(((GeneratedMessageV3.ExtendableMessage) (oneofoptions)));
		//   80  176:aload_0         
		//   81  177:aload_1         
		//   82  178:invokevirtual   #368 <Method void mergeExtensionFields(GeneratedMessageV3$ExtendableMessage)>
			mergeUnknownFields(oneofoptions.unknownFields);
		//   83  181:aload_0         
		//   84  182:aload_1         
		//   85  183:getfield        #372 <Field UnknownFieldSet DescriptorProtos$OneofOptions.unknownFields>
		//   86  186:invokevirtual   #376 <Method DescriptorProtos$OneofOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//   87  189:pop             
			onChanged();
		//   88  190:aload_0         
		//   89  191:invokevirtual   #97  <Method void onChanged()>
			return this;
		//   90  194:aload_0         
		//   91  195:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.OneofOptions)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class DescriptorProtos$OneofOptions>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.OneofOptions)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class DescriptorProtos$OneofOptions>
		//    6   12:invokevirtual   #343 <Method DescriptorProtos$OneofOptions$Builder mergeFrom(DescriptorProtos$OneofOptions)>
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
		//    3    3:invokevirtual   #323 <Method DescriptorProtos$OneofOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #327 <Method DescriptorProtos$OneofOptions$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #323 <Method DescriptorProtos$OneofOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #376 <Method DescriptorProtos$OneofOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #385 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #376 <Method DescriptorProtos$OneofOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #376 <Method DescriptorProtos$OneofOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder removeUninterpretedOption(int i)
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

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #399 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    6   10:areturn         
		}

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #402 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #405 <Method DescriptorProtos$OneofOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #407 <Method DescriptorProtos$OneofOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #410 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #412 <Method DescriptorProtos$OneofOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #412 <Method DescriptorProtos$OneofOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #412 <Method DescriptorProtos$OneofOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #417 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #420 <Method DescriptorProtos$OneofOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #420 <Method DescriptorProtos$OneofOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #420 <Method DescriptorProtos$OneofOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
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

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #432 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$OneofOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #434 <Method DescriptorProtos$OneofOptions$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #434 <Method DescriptorProtos$OneofOptions$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private RepeatedFieldBuilderV3 uninterpretedOptionBuilder_;
		private List uninterpretedOption_;

		private Builder()
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

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void DescriptorProtos$OneofOptions$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #44  <Method void DescriptorProtos$OneofOptions$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$OneofOptions getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #40  <Field DescriptorProtos$OneofOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$20100();
	//    0    0:invokestatic    #141 <Method Descriptors$Descriptor DescriptorProtos.access$20100()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #40  <Field DescriptorProtos$OneofOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #145 <Method DescriptorProtos$OneofOptions$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$OneofOptions descriptorprotos$oneofoptions)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$oneofoptions);
	//    0    0:getstatic       #40  <Field DescriptorProtos$OneofOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #145 <Method DescriptorProtos$OneofOptions$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #149 <Method DescriptorProtos$OneofOptions$Builder DescriptorProtos$OneofOptions$Builder.mergeFrom(DescriptorProtos$OneofOptions)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$OneofOptions parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$OneofOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #157 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$OneofOptions parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$OneofOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #161 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofOptions)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #168 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofOptions)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #172 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$OneofOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #177 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$OneofOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #181 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$OneofOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #183 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$OneofOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #185 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofOptions)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #189 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofOptions)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #193 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofOptions)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #197 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$OneofOptions parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofOptions)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #201 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #43  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$OneofOptions))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$OneofOptions>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #207 <Method boolean GeneratedMessageV3$ExtendableMessage.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$OneofOptions)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$OneofOptions>
	//   14   24:astore_1        
		boolean flag;
		if(true && getUninterpretedOptionList().equals(((Object) (((DescriptorProtos$OneofOptions) (obj)).getUninterpretedOptionList()))))
	//*  15   25:iconst_1        
	//*  16   26:ifeq            50
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #210 <Method List getUninterpretedOptionList()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #210 <Method List getUninterpretedOptionList()>
	//*  21   37:invokeinterface #211 <Method boolean List.equals(Object)>
	//*  22   42:ifeq            50
			flag = true;
	//   23   45:iconst_1        
	//   24   46:istore_2        
		else
	//*  25   47:goto            52
			flag = false;
	//   26   50:iconst_0        
	//   27   51:istore_2        
		if(flag && unknownFields.equals(((Object) (((DescriptorProtos$OneofOptions) (obj)).unknownFields))))
	//*  28   52:iload_2         
	//*  29   53:ifeq            75
	//*  30   56:aload_0         
	//*  31   57:getfield        #109 <Field UnknownFieldSet unknownFields>
	//*  32   60:aload_1         
	//*  33   61:getfield        #109 <Field UnknownFieldSet unknownFields>
	//*  34   64:invokevirtual   #212 <Method boolean UnknownFieldSet.equals(Object)>
	//*  35   67:ifeq            75
			flag = true;
	//   36   70:iconst_1        
	//   37   71:istore_2        
		else
	//*  38   72:goto            77
			flag = false;
	//   39   75:iconst_0        
	//   40   76:istore_2        
		return flag && getExtensionFields().equals(((Object) (((DescriptorProtos$OneofOptions) (obj)).getExtensionFields())));
	//   41   77:iload_2         
	//   42   78:ifeq            99
	//   43   81:aload_0         
	//   44   82:invokevirtual   #216 <Method Map getExtensionFields()>
	//   45   85:aload_1         
	//   46   86:invokevirtual   #216 <Method Map getExtensionFields()>
	//   47   89:invokeinterface #219 <Method boolean Map.equals(Object)>
	//   48   94:ifeq            99
	//   49   97:iconst_1        
	//   50   98:ireturn         
	//   51   99:iconst_0        
	//   52  100:ireturn         
	}

	public DescriptorProtos$OneofOptions getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #40  <Field DescriptorProtos$OneofOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #223 <Method DescriptorProtos$OneofOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #223 <Method DescriptorProtos$OneofOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #43  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field int memoizedSize>
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
		for(i = 0; i < uninterpretedOption_.size(); i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:aload_0         
	//*  14   18:getfield        #55  <Field List uninterpretedOption_>
	//*  15   21:invokeinterface #232 <Method int List.size()>
	//*  16   26:icmpge          58
			j += CodedOutputStream.computeMessageSize(999, (MessageLite)uninterpretedOption_.get(i));
	//   17   29:iload_2         
	//   18   30:sipush          999
	//   19   33:aload_0         
	//   20   34:getfield        #55  <Field List uninterpretedOption_>
	//   21   37:iload_1         
	//   22   38:invokeinterface #236 <Method Object List.get(int)>
	//   23   43:checkcast       #238 <Class MessageLite>
	//   24   46:invokestatic    #244 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   25   49:iadd            
	//   26   50:istore_2        

	//   27   51:iload_1         
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:istore_1        
	//*  31   55:goto            16
		i = j + extensionsSerializedSize() + unknownFields.getSerializedSize();
	//   32   58:iload_2         
	//   33   59:aload_0         
	//   34   60:invokevirtual   #247 <Method int extensionsSerializedSize()>
	//   35   63:iadd            
	//   36   64:aload_0         
	//   37   65:getfield        #109 <Field UnknownFieldSet unknownFields>
	//   38   68:invokevirtual   #249 <Method int UnknownFieldSet.getSerializedSize()>
	//   39   71:iadd            
	//   40   72:istore_1        
		memoizedSize = i;
	//   41   73:aload_0         
	//   42   74:iload_1         
	//   43   75:putfield        #229 <Field int memoizedSize>
		return i;
	//   44   78:iload_1         
	//   45   79:ireturn         
	}

	public Option getUninterpretedOption(int i)
	{
		return (Option)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #236 <Method Object List.get(int)>
	//    4   10:checkcast       #84  <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		return uninterpretedOption_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List uninterpretedOption_>
	//    2    4:invokeinterface #232 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public OptionOrBuilder getUninterpretedOptionOrBuilder(int i)
	{
		return (OptionOrBuilder)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #236 <Method Object List.get(int)>
	//    4   10:checkcast       #257 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    5   13:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #264 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #264 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #266 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #270 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(getUninterpretedOptionCount() > 0)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #272 <Method int getUninterpretedOptionCount()>
	//*  15   29:ifle            54
			i = (j * 37 + 999) * 53 + getUninterpretedOptionList().hashCode();
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:sipush          999
	//   20   39:iadd            
	//   21   40:bipush          53
	//   22   42:imul            
	//   23   43:aload_0         
	//   24   44:invokevirtual   #210 <Method List getUninterpretedOptionList()>
	//   25   47:invokeinterface #273 <Method int List.hashCode()>
	//   26   52:iadd            
	//   27   53:istore_1        
		i = hashFields(i, getExtensionFields()) * 29 + unknownFields.hashCode();
	//   28   54:iload_1         
	//   29   55:aload_0         
	//   30   56:invokevirtual   #216 <Method Map getExtensionFields()>
	//   31   59:invokestatic    #277 <Method int hashFields(int, Map)>
	//   32   62:bipush          29
	//   33   64:imul            
	//   34   65:aload_0         
	//   35   66:getfield        #109 <Field UnknownFieldSet unknownFields>
	//   36   69:invokevirtual   #278 <Method int UnknownFieldSet.hashCode()>
	//   37   72:iadd            
	//   38   73:istore_1        
		memoizedHashCode = i;
	//   39   74:aload_0         
	//   40   75:iload_1         
	//   41   76:putfield        #264 <Field int memoizedHashCode>
		return i;
	//   42   79:iload_1         
	//   43   80:ireturn         
	}

	protected orTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$20200().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$OneofOptions, com/google/protobuf/DescriptorProtos$OneofOptions$Builder);
	//    0    0:invokestatic    #283 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$20200()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$OneofOptions>
	//    2    5:ldc1            #14  <Class DescriptorProtos$OneofOptions$Builder>
	//    3    7:invokevirtual   #289 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field byte memoizedIsInitialized>
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
		for(int i = 0; i < getUninterpretedOptionCount(); i++)
	//*  12   18:iconst_0        
	//*  13   19:istore_1        
	//*  14   20:iload_1         
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #272 <Method int getUninterpretedOptionCount()>
	//*  17   25:icmpge          53
			if(!getUninterpretedOption(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #293 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*  21   33:invokevirtual   #295 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #47  <Field byte memoizedIsInitialized>
				return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
			}

	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_1        
	//*  32   50:goto            20
		if(!extensionsAreInitialized())
	//*  33   53:aload_0         
	//*  34   54:invokevirtual   #298 <Method boolean extensionsAreInitialized()>
	//*  35   57:ifne            67
		{
			memoizedIsInitialized = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #47  <Field byte memoizedIsInitialized>
			return false;
	//   39   65:iconst_0        
	//   40   66:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   41   67:aload_0         
	//   42   68:iconst_1        
	//   43   69:putfield        #47  <Field byte memoizedIsInitialized>
			return true;
	//   44   72:iconst_1        
	//   45   73:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #301 <Method DescriptorProtos$OneofOptions$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(nt nt)
	{
		return new Builder(nt, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #14  <Class DescriptorProtos$OneofOptions$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #305 <Method void DescriptorProtos$OneofOptions$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #308 <Method DescriptorProtos$OneofOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(nt nt)
	{
		return ((Message.Builder) (newBuilderForType(nt)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #311 <Method DescriptorProtos$OneofOptions$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #308 <Method DescriptorProtos$OneofOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #40  <Field DescriptorProtos$OneofOptions DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #14  <Class DescriptorProtos$OneofOptions$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #315 <Method void DescriptorProtos$OneofOptions$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #14  <Class DescriptorProtos$OneofOptions$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #315 <Method void DescriptorProtos$OneofOptions$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #149 <Method DescriptorProtos$OneofOptions$Builder DescriptorProtos$OneofOptions$Builder.mergeFrom(DescriptorProtos$OneofOptions)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method DescriptorProtos$OneofOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method DescriptorProtos$OneofOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		essage.ExtensionWriter extensionwriter = newExtensionWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method GeneratedMessageV3$ExtendableMessage$ExtensionWriter newExtensionWriter()>
	//    2    4:astore_3        
		for(int i = 0; i < uninterpretedOption_.size(); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #55  <Field List uninterpretedOption_>
	//*   8   12:invokeinterface #232 <Method int List.size()>
	//*   9   17:icmpge          47
			codedoutputstream.writeMessage(999, (MessageLite)uninterpretedOption_.get(i));
	//   10   20:aload_1         
	//   11   21:sipush          999
	//   12   24:aload_0         
	//   13   25:getfield        #55  <Field List uninterpretedOption_>
	//   14   28:iload_2         
	//   15   29:invokeinterface #236 <Method Object List.get(int)>
	//   16   34:checkcast       #238 <Class MessageLite>
	//   17   37:invokevirtual   #325 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   18   40:iload_2         
	//   19   41:iconst_1        
	//   20   42:iadd            
	//   21   43:istore_2        
	//*  22   44:goto            7
		extensionwriter.writeUntil(0x20000000, codedoutputstream);
	//   23   47:aload_3         
	//   24   48:ldc2            #326 <Int 0x20000000>
	//   25   51:aload_1         
	//   26   52:invokevirtual   #332 <Method void GeneratedMessageV3$ExtendableMessage$ExtensionWriter.writeUntil(int, CodedOutputStream)>
		unknownFields.writeTo(codedoutputstream);
	//   27   55:aload_0         
	//   28   56:getfield        #109 <Field UnknownFieldSet unknownFields>
	//   29   59:aload_1         
	//   30   60:invokevirtual   #334 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   31   63:return          
	}

	private static final DescriptorProtos$OneofOptions DEFAULT_INSTANCE = new DescriptorProtos$OneofOptions();
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.OneofOptions parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.OneofOptions(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$OneofOptions>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$OneofOptions(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$OneofOptions parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
	private static final long serialVersionUID = 0L;
	private byte memoizedIsInitialized;
	private List uninterpretedOption_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$OneofOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void DescriptorProtos$OneofOptions()>
	//    3    7:putstatic       #40  <Field DescriptorProtos$OneofOptions DEFAULT_INSTANCE>
	//    4   10:new             #12  <Class DescriptorProtos$OneofOptions$1>
	//    5   13:dup             
	//    6   14:invokespecial   #41  <Method void DescriptorProtos$OneofOptions$1()>
	//    7   17:putstatic       #43  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static List access$20600(DescriptorProtos$OneofOptions descriptorprotos$oneofoptions)
	{
		return descriptorprotos$oneofoptions.uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

*/


/*
	static List access$20602(DescriptorProtos$OneofOptions descriptorprotos$oneofoptions, List list)
	{
		descriptorprotos$oneofoptions.uninterpretedOption_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field List uninterpretedOption_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	private DescriptorProtos$OneofOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void GeneratedMessageV3$ExtendableMessage()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #47  <Field byte memoizedIsInitialized>
		uninterpretedOption_ = Collections.emptyList();
	//    5    9:aload_0         
	//    6   10:invokestatic    #53  <Method List Collections.emptyList()>
	//    7   13:putfield        #55  <Field List uninterpretedOption_>
	//    8   16:return          
	}

	private DescriptorProtos$OneofOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		boolean flag5;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void DescriptorProtos$OneofOptions()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #62  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #63  <Method void NullPointerException()>
	//    7   15:athrow          
		flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #69  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          10
		flag5 = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L8:
		boolean flag2;
		boolean flag3;
		boolean flag4;
		if(flag5)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            181
		flag3 = flag;
	//   16   31:iload_3         
	//   17   32:istore          6
		flag4 = flag;
	//   18   34:iload_3         
	//   19   35:istore          7
		flag2 = flag;
	//   20   37:iload_3         
	//   21   38:istore          5
		int i = codedinputstream.readTag();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #75  <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		i;
	//   25   46:iload           9
		JVM INSTR lookupswitch 2: default 277
	//	               0: 280
	//	               7994: 110;
	//   26   48:lookupswitch    2: default 277
	//	               0: 280
	//	               7994: 110
		   goto _L1 _L2 _L3
_L1:
		boolean flag1;
		flag1 = flag;
	//   27   76:iload_3         
	//   28   77:istore          4
		flag3 = flag;
	//   29   79:iload_3         
	//   30   80:istore          6
		flag4 = flag;
	//   31   82:iload_3         
	//   32   83:istore          7
		flag2 = flag;
	//   33   85:iload_3         
	//   34   86:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
	//*  35   88:aload_0         
	//*  36   89:aload_1         
	//*  37   90:aload           10
	//*  38   92:aload_2         
	//*  39   93:iload           9
	//*  40   95:invokevirtual   #79  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41   98:ifne            175
		{
			flag5 = true;
	//   42  101:iconst_1        
	//   43  102:istore          8
			flag1 = flag;
	//   44  104:iload_3         
	//   45  105:istore          4
		}
		  goto _L4
	//*  46  107:goto            175
_L3:
		flag1 = flag;
	//   47  110:iload_3         
	//   48  111:istore          4
		if((flag & true)) goto _L6; else goto _L5
	//   49  113:iload_3         
	//   50  114:iconst_1        
	//   51  115:iand            
	//   52  116:iconst_1        
	//   53  117:icmpeq          145
_L5:
		flag3 = flag;
	//   54  120:iload_3         
	//   55  121:istore          6
		flag4 = flag;
	//   56  123:iload_3         
	//   57  124:istore          7
		flag2 = flag;
	//   58  126:iload_3         
	//   59  127:istore          5
		uninterpretedOption_ = ((List) (new ArrayList()));
	//   60  129:aload_0         
	//   61  130:new             #81  <Class ArrayList>
	//   62  133:dup             
	//   63  134:invokespecial   #82  <Method void ArrayList()>
	//   64  137:putfield        #55  <Field List uninterpretedOption_>
		flag1 = flag | true;
	//   65  140:iload_3         
	//   66  141:iconst_1        
	//   67  142:ior             
	//   68  143:istore          4
_L6:
		flag3 = flag1;
	//   69  145:iload           4
	//   70  147:istore          6
		flag4 = flag1;
	//   71  149:iload           4
	//   72  151:istore          7
		flag2 = flag1;
	//   73  153:iload           4
	//   74  155:istore          5
		uninterpretedOption_.add(((Object) (codedinputstream.readMessage(Option.PARSER, extensionregistrylite))));
	//   75  157:aload_0         
	//   76  158:getfield        #55  <Field List uninterpretedOption_>
	//   77  161:aload_1         
	//   78  162:getstatic       #85  <Field Parser DescriptorProtos$UninterpretedOption.PARSER>
	//   79  165:aload_2         
	//   80  166:invokevirtual   #89  <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//   81  169:invokeinterface #95  <Method boolean List.add(Object)>
	//   82  174:pop             
_L4:
		flag = flag1;
	//   83  175:iload           4
	//   84  177:istore_3        
		if(true) goto _L8; else goto _L7
	//   85  178:goto            26
_L7:
		if((flag & true))
	//*  86  181:iload_3         
	//*  87  182:iconst_1        
	//*  88  183:iand            
	//*  89  184:iconst_1        
	//*  90  185:icmpne          199
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//   91  188:aload_0         
	//   92  189:aload_0         
	//   93  190:getfield        #55  <Field List uninterpretedOption_>
	//   94  193:invokestatic    #99  <Method List Collections.unmodifiableList(List)>
	//   95  196:putfield        #55  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//   96  199:aload_0         
	//   97  200:aload           10
	//   98  202:invokevirtual   #105 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   99  205:putfield        #109 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  100  208:aload_0         
	//  101  209:invokevirtual   #112 <Method void makeExtensionsImmutable()>
		return;
	//  102  212:return          
		codedinputstream;
	//  103  213:astore_1        
		flag2 = flag3;
	//  104  214:iload           6
	//  105  216:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  106  218:aload_1         
	//  107  219:aload_0         
	//  108  220:invokevirtual   #116 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  109  223:athrow          
		codedinputstream;
	//  110  224:astore_1        
		flag2 = flag4;
	//  111  225:iload           7
	//  112  227:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  113  229:new             #58  <Class InvalidProtocolBufferException>
	//  114  232:dup             
	//  115  233:aload_1         
	//  116  234:invokespecial   #119 <Method void InvalidProtocolBufferException(IOException)>
	//  117  237:aload_0         
	//  118  238:invokevirtual   #116 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  119  241:athrow          
		codedinputstream;
	//  120  242:astore_1        
		if((flag2 & true))
	//* 121  243:iload           5
	//* 122  245:iconst_1        
	//* 123  246:iand            
	//* 124  247:iconst_1        
	//* 125  248:icmpne          262
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  126  251:aload_0         
	//  127  252:aload_0         
	//  128  253:getfield        #55  <Field List uninterpretedOption_>
	//  129  256:invokestatic    #99  <Method List Collections.unmodifiableList(List)>
	//  130  259:putfield        #55  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  131  262:aload_0         
	//  132  263:aload           10
	//  133  265:invokevirtual   #105 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  134  268:putfield        #109 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  135  271:aload_0         
	//  136  272:invokevirtual   #112 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  137  275:aload_1         
	//  138  276:athrow          
	//* 139  277:goto            76
_L2:
		flag5 = true;
	//  140  280:iconst_1        
	//  141  281:istore          8
		flag1 = flag;
	//  142  283:iload_3         
	//  143  284:istore          4
		  goto _L4
	//* 144  286:goto            175
	}

	DescriptorProtos$OneofOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #123 <Method void DescriptorProtos$OneofOptions(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$OneofOptions(uilder uilder)
	{
		super(uilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method void GeneratedMessageV3$ExtendableMessage(GeneratedMessageV3$ExtendableBuilder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #47  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$OneofOptions(uilder uilder, DescriptorProtos._cls1 _pcls1)
	{
		this(uilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method void DescriptorProtos$OneofOptions(GeneratedMessageV3$ExtendableBuilder)>
	//    3    5:return          
	}
}
