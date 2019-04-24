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
//			GeneratedMessageV3, Parser, CodedOutputStream, MessageLite, 
//			Internal, ExtensionRegistryLite, ByteString, Message, 
//			RepeatedFieldBuilderV3, AbstractParser

public static final class DescriptorProtos$EnumOptions extends Message
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.ExtendableBuilder
		implements DescriptorProtos.EnumOptionsOrBuilder
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

		public Builder addAllUninterpretedOption(Iterable iterable)
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

		public Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.addExtension(generatedextension, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #109 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (addExtension(generatedextension, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #112 <Method DescriptorProtos$EnumOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:areturn         
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
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

		public volatile GeneratedMessageV3.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
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

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
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

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(uninterpretedoption == null)
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
					uninterpretedOption_.add(i, ((Object) (uninterpretedoption)));
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
				uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (uninterpretedoption)));
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

		public Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption.Builder builder)
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

		public Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption uninterpretedoption)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(uninterpretedoption == null)
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
					uninterpretedOption_.add(((Object) (uninterpretedoption)));
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
				uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (uninterpretedoption)));
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

		public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder()
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #86  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:invokestatic    #158 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    3    7:invokevirtual   #162 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #125 <Class DescriptorProtos$UninterpretedOption$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
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
			DescriptorProtos.EnumOptions enumoptions = new DescriptorProtos.EnumOptions(((GeneratedMessageV3.ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
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
			enumoptions.allowAlias_ = allowAlias_;
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
			enumoptions.deprecated_ = deprecated_;
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
				enumoptions.uninterpretedOption_ = uninterpretedOption_;
		//   59   99:aload           4
		//   60  101:aload_0         
		//   61  102:getfield        #36  <Field List uninterpretedOption_>
		//   62  105:invokestatic    #203 <Method List DescriptorProtos$EnumOptions.access$21502(DescriptorProtos$EnumOptions, List)>
		//   63  108:pop             
			} else
		//*  64  109:goto            125
			{
				enumoptions.uninterpretedOption_ = uninterpretedOptionBuilder_.build();
		//   65  112:aload           4
		//   66  114:aload_0         
		//   67  115:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   68  118:invokevirtual   #205 <Method List RepeatedFieldBuilderV3.build()>
		//   69  121:invokestatic    #203 <Method List DescriptorProtos$EnumOptions.access$21502(DescriptorProtos$EnumOptions, List)>
		//   70  124:pop             
			}
			enumoptions.bitField0_ = j;
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

		public Builder clear()
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

		public volatile GeneratedMessageV3.ExtendableBuilder clear()
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clear()));
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

		public Builder clearAllowAlias()
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

		public Builder clearDeprecated()
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

		public Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return (Builder)super.clearExtension(generatedextension);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #232 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clearExtension(generatedextension)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #235 <Method DescriptorProtos$EnumOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
		//    3    5:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
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

		public volatile GeneratedMessageV3.ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clearField(fielddescriptor)));
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

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
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

		public Builder clearUninterpretedOption()
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

		public Builder clone()
		{
			return (Builder)super.clone();
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

		public DescriptorProtos.UninterpretedOption getUninterpretedOption(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.UninterpretedOption)uninterpretedOption_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #36  <Field List uninterpretedOption_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #278 <Method Object List.get(int)>
		//    7   17:checkcast       #155 <Class DescriptorProtos$UninterpretedOption>
		//    8   20:areturn         
			else
				return (DescriptorProtos.UninterpretedOption)uninterpretedOptionBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #282 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #155 <Class DescriptorProtos$UninterpretedOption>
		//   14   32:areturn         
		}

		public DescriptorProtos.UninterpretedOption.Builder getUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().getBuilder(i);
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

		public DescriptorProtos.UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOption_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #36  <Field List uninterpretedOption_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #278 <Method Object List.get(int)>
		//    7   17:checkcast       #309 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
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

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
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

		public Builder mergeFrom(DescriptorProtos.EnumOptions enumoptions)
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
				if(!enumoptions.uninterpretedOption_.isEmpty())
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
						uninterpretedOption_ = enumoptions.uninterpretedOption_;
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
						uninterpretedOption_.addAll(((java.util.Collection) (enumoptions.uninterpretedOption_)));
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
			if(!enumoptions.uninterpretedOption_.isEmpty())
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
					uninterpretedOption_ = enumoptions.uninterpretedOption_;
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
					uninterpretedOptionBuilder_.addAllMessages(((Iterable) (enumoptions.uninterpretedOption_)));
		//   90  196:aload_0         
		//   91  197:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   92  200:aload_1         
		//   93  201:invokestatic    #392 <Method List DescriptorProtos$EnumOptions.access$21500(DescriptorProtos$EnumOptions)>
		//   94  204:invokevirtual   #103 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   95  207:pop             
				}
			mergeExtensionFields(((GeneratedMessageV3.ExtendableMessage) (enumoptions)));
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

		public Builder mergeFrom(Message message)
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

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
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

		public Builder removeUninterpretedOption(int i)
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

		public Builder setAllowAlias(boolean flag)
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

		public Builder setDeprecated(boolean flag)
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

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #437 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
		//    6   10:areturn         
		}

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #440 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #443 <Method DescriptorProtos$EnumOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #445 <Method DescriptorProtos$EnumOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
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

		public volatile GeneratedMessageV3.ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setField(fielddescriptor, obj)));
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

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

		public volatile GeneratedMessageV3.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
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

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
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

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #64  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(uninterpretedoption == null)
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
					uninterpretedOption_.set(i, ((Object) (uninterpretedoption)));
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
				uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (uninterpretedoption)));
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
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

		private Builder()
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

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void DescriptorProtos$EnumOptions$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #47  <Method void DescriptorProtos$EnumOptions$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$EnumOptions getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #48  <Field DescriptorProtos$EnumOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$20800();
	//    0    0:invokestatic    #164 <Method Descriptors$Descriptor DescriptorProtos.access$20800()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #48  <Field DescriptorProtos$EnumOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #168 <Method DescriptorProtos$EnumOptions$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$EnumOptions descriptorprotos$enumoptions)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$enumoptions);
	//    0    0:getstatic       #48  <Field DescriptorProtos$EnumOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #168 <Method DescriptorProtos$EnumOptions$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #172 <Method DescriptorProtos$EnumOptions$Builder DescriptorProtos$EnumOptions$Builder.mergeFrom(DescriptorProtos$EnumOptions)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #180 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #184 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumOptions)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #191 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumOptions)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #195 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #200 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #204 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #206 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #208 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumOptions)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #212 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumOptions)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #216 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumOptions)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #220 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumOptions parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumOptions)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #224 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #51  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$EnumOptions))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$EnumOptions>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #230 <Method boolean GeneratedMessageV3$ExtendableMessage.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$EnumOptions)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$EnumOptions>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasAllowAlias() == ((DescriptorProtos$EnumOptions) (obj)).hasAllowAlias())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #233 <Method boolean hasAllowAlias()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #233 <Method boolean hasAllowAlias()>
	//*  21   37:icmpne          45
			flag = true;
	//   22   40:iconst_1        
	//   23   41:istore_2        
		else
	//*  24   42:goto            47
			flag = false;
	//   25   45:iconst_0        
	//   26   46:istore_2        
		boolean flag1 = flag;
	//   27   47:iload_2         
	//   28   48:istore_3        
		if(hasAllowAlias())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #233 <Method boolean hasAllowAlias()>
	//*  31   53:ifeq            78
			if(flag && getAllowAlias() == ((DescriptorProtos$EnumOptions) (obj)).getAllowAlias())
	//*  32   56:iload_2         
	//*  33   57:ifeq            76
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #236 <Method boolean getAllowAlias()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #236 <Method boolean getAllowAlias()>
	//*  38   68:icmpne          76
				flag1 = true;
	//   39   71:iconst_1        
	//   40   72:istore_3        
			else
	//*  41   73:goto            78
				flag1 = false;
	//   42   76:iconst_0        
	//   43   77:istore_3        
		if(flag1 && hasDeprecated() == ((DescriptorProtos$EnumOptions) (obj)).hasDeprecated())
	//*  44   78:iload_3         
	//*  45   79:ifeq            98
	//*  46   82:aload_0         
	//*  47   83:invokevirtual   #239 <Method boolean hasDeprecated()>
	//*  48   86:aload_1         
	//*  49   87:invokevirtual   #239 <Method boolean hasDeprecated()>
	//*  50   90:icmpne          98
			flag = true;
	//   51   93:iconst_1        
	//   52   94:istore_2        
		else
	//*  53   95:goto            100
			flag = false;
	//   54   98:iconst_0        
	//   55   99:istore_2        
		flag1 = flag;
	//   56  100:iload_2         
	//   57  101:istore_3        
		if(hasDeprecated())
	//*  58  102:aload_0         
	//*  59  103:invokevirtual   #239 <Method boolean hasDeprecated()>
	//*  60  106:ifeq            131
			if(flag && getDeprecated() == ((DescriptorProtos$EnumOptions) (obj)).getDeprecated())
	//*  61  109:iload_2         
	//*  62  110:ifeq            129
	//*  63  113:aload_0         
	//*  64  114:invokevirtual   #242 <Method boolean getDeprecated()>
	//*  65  117:aload_1         
	//*  66  118:invokevirtual   #242 <Method boolean getDeprecated()>
	//*  67  121:icmpne          129
				flag1 = true;
	//   68  124:iconst_1        
	//   69  125:istore_3        
			else
	//*  70  126:goto            131
				flag1 = false;
	//   71  129:iconst_0        
	//   72  130:istore_3        
		if(flag1 && getUninterpretedOptionList().equals(((Object) (((DescriptorProtos$EnumOptions) (obj)).getUninterpretedOptionList()))))
	//*  73  131:iload_3         
	//*  74  132:ifeq            156
	//*  75  135:aload_0         
	//*  76  136:invokevirtual   #245 <Method List getUninterpretedOptionList()>
	//*  77  139:aload_1         
	//*  78  140:invokevirtual   #245 <Method List getUninterpretedOptionList()>
	//*  79  143:invokeinterface #246 <Method boolean List.equals(Object)>
	//*  80  148:ifeq            156
			flag = true;
	//   81  151:iconst_1        
	//   82  152:istore_2        
		else
	//*  83  153:goto            158
			flag = false;
	//   84  156:iconst_0        
	//   85  157:istore_2        
		if(flag && unknownFields.equals(((Object) (((DescriptorProtos$EnumOptions) (obj)).unknownFields))))
	//*  86  158:iload_2         
	//*  87  159:ifeq            181
	//*  88  162:aload_0         
	//*  89  163:getfield        #127 <Field UnknownFieldSet unknownFields>
	//*  90  166:aload_1         
	//*  91  167:getfield        #127 <Field UnknownFieldSet unknownFields>
	//*  92  170:invokevirtual   #247 <Method boolean UnknownFieldSet.equals(Object)>
	//*  93  173:ifeq            181
			flag = true;
	//   94  176:iconst_1        
	//   95  177:istore_2        
		else
	//*  96  178:goto            183
			flag = false;
	//   97  181:iconst_0        
	//   98  182:istore_2        
		return flag && getExtensionFields().equals(((Object) (((DescriptorProtos$EnumOptions) (obj)).getExtensionFields())));
	//   99  183:iload_2         
	//  100  184:ifeq            205
	//  101  187:aload_0         
	//  102  188:invokevirtual   #251 <Method Map getExtensionFields()>
	//  103  191:aload_1         
	//  104  192:invokevirtual   #251 <Method Map getExtensionFields()>
	//  105  195:invokeinterface #254 <Method boolean Map.equals(Object)>
	//  106  200:ifeq            205
	//  107  203:iconst_1        
	//  108  204:ireturn         
	//  109  205:iconst_0        
	//  110  206:ireturn         
	}

	public boolean getAllowAlias()
	{
		return allowAlias_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean allowAlias_>
	//    2    4:ireturn         
	}

	public DescriptorProtos$EnumOptions getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #48  <Field DescriptorProtos$EnumOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #258 <Method DescriptorProtos$EnumOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #258 <Method DescriptorProtos$EnumOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field int memoizedSize>
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
		if((bitField0_ & 1) == 1)
	//*  10   14:aload_0         
	//*  11   15:getfield        #93  <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			j = CodedOutputStream.computeBoolSize(2, allowAlias_) + 0;
	//   16   24:iconst_2        
	//   17   25:aload_0         
	//   18   26:getfield        #57  <Field boolean allowAlias_>
	//   19   29:invokestatic    #270 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_2        
		i = j;
	//   23   35:iload_2         
	//   24   36:istore_1        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #93  <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          58
			i = j + CodedOutputStream.computeBoolSize(3, deprecated_);
	//   31   47:iload_2         
	//   32   48:iconst_3        
	//   33   49:aload_0         
	//   34   50:getfield        #59  <Field boolean deprecated_>
	//   35   53:invokestatic    #270 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   36   56:iadd            
	//   37   57:istore_1        
		for(int k = 0; k < uninterpretedOption_.size(); k++)
	//*  38   58:iconst_0        
	//*  39   59:istore_2        
	//*  40   60:iload_2         
	//*  41   61:aload_0         
	//*  42   62:getfield        #67  <Field List uninterpretedOption_>
	//*  43   65:invokeinterface #273 <Method int List.size()>
	//*  44   70:icmpge          102
			i += CodedOutputStream.computeMessageSize(999, (MessageLite)uninterpretedOption_.get(k));
	//   45   73:iload_1         
	//   46   74:sipush          999
	//   47   77:aload_0         
	//   48   78:getfield        #67  <Field List uninterpretedOption_>
	//   49   81:iload_2         
	//   50   82:invokeinterface #277 <Method Object List.get(int)>
	//   51   87:checkcast       #279 <Class MessageLite>
	//   52   90:invokestatic    #283 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   53   93:iadd            
	//   54   94:istore_1        

	//   55   95:iload_2         
	//   56   96:iconst_1        
	//   57   97:iadd            
	//   58   98:istore_2        
	//*  59   99:goto            60
		i = i + extensionsSerializedSize() + unknownFields.getSerializedSize();
	//   60  102:iload_1         
	//   61  103:aload_0         
	//   62  104:invokevirtual   #286 <Method int extensionsSerializedSize()>
	//   63  107:iadd            
	//   64  108:aload_0         
	//   65  109:getfield        #127 <Field UnknownFieldSet unknownFields>
	//   66  112:invokevirtual   #288 <Method int UnknownFieldSet.getSerializedSize()>
	//   67  115:iadd            
	//   68  116:istore_1        
		memoizedSize = i;
	//   69  117:aload_0         
	//   70  118:iload_1         
	//   71  119:putfield        #264 <Field int memoizedSize>
		return i;
	//   72  122:iload_1         
	//   73  123:ireturn         
	}

	public dOption getUninterpretedOption(int i)
	{
		return (dOption)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #277 <Method Object List.get(int)>
	//    4   10:checkcast       #102 <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		return uninterpretedOption_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List uninterpretedOption_>
	//    2    4:invokeinterface #273 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public dOptionOrBuilder getUninterpretedOptionOrBuilder(int i)
	{
		return (dOptionOrBuilder)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #277 <Method Object List.get(int)>
	//    4   10:checkcast       #296 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    5   13:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasAllowAlias()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int bitField0_>
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
	//    1    1:getfield        #93  <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #303 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #303 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #305 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #309 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasAllowAlias())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #233 <Method boolean hasAllowAlias()>
	//*  15   29:ifeq            50
			i = (j * 37 + 2) * 53 + Internal.hashBoolean(getAllowAlias());
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_2        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #236 <Method boolean getAllowAlias()>
	//   25   45:invokestatic    #315 <Method int Internal.hashBoolean(boolean)>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(hasDeprecated())
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #239 <Method boolean hasDeprecated()>
	//*  32   56:ifeq            77
			j = (i * 37 + 3) * 53 + Internal.hashBoolean(getDeprecated());
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_3        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #242 <Method boolean getDeprecated()>
	//   42   72:invokestatic    #315 <Method int Internal.hashBoolean(boolean)>
	//   43   75:iadd            
	//   44   76:istore_2        
		i = j;
	//   45   77:iload_2         
	//   46   78:istore_1        
		if(getUninterpretedOptionCount() > 0)
	//*  47   79:aload_0         
	//*  48   80:invokevirtual   #317 <Method int getUninterpretedOptionCount()>
	//*  49   83:ifle            108
			i = (j * 37 + 999) * 53 + getUninterpretedOptionList().hashCode();
	//   50   86:iload_2         
	//   51   87:bipush          37
	//   52   89:imul            
	//   53   90:sipush          999
	//   54   93:iadd            
	//   55   94:bipush          53
	//   56   96:imul            
	//   57   97:aload_0         
	//   58   98:invokevirtual   #245 <Method List getUninterpretedOptionList()>
	//   59  101:invokeinterface #318 <Method int List.hashCode()>
	//   60  106:iadd            
	//   61  107:istore_1        
		i = hashFields(i, getExtensionFields()) * 29 + unknownFields.hashCode();
	//   62  108:iload_1         
	//   63  109:aload_0         
	//   64  110:invokevirtual   #251 <Method Map getExtensionFields()>
	//   65  113:invokestatic    #322 <Method int hashFields(int, Map)>
	//   66  116:bipush          29
	//   67  118:imul            
	//   68  119:aload_0         
	//   69  120:getfield        #127 <Field UnknownFieldSet unknownFields>
	//   70  123:invokevirtual   #323 <Method int UnknownFieldSet.hashCode()>
	//   71  126:iadd            
	//   72  127:istore_1        
		memoizedHashCode = i;
	//   73  128:aload_0         
	//   74  129:iload_1         
	//   75  130:putfield        #303 <Field int memoizedHashCode>
		return i;
	//   76  133:iload_1         
	//   77  134:ireturn         
	}

	protected sorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$20900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumOptions, com/google/protobuf/DescriptorProtos$EnumOptions$Builder);
	//    0    0:invokestatic    #328 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$20900()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$EnumOptions>
	//    2    5:ldc1            #14  <Class DescriptorProtos$EnumOptions$Builder>
	//    3    7:invokevirtual   #334 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field byte memoizedIsInitialized>
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
	//*  16   22:invokevirtual   #317 <Method int getUninterpretedOptionCount()>
	//*  17   25:icmpge          53
			if(!getUninterpretedOption(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #337 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*  21   33:invokevirtual   #339 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #55  <Field byte memoizedIsInitialized>
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
	//*  34   54:invokevirtual   #342 <Method boolean extensionsAreInitialized()>
	//*  35   57:ifne            67
		{
			memoizedIsInitialized = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #55  <Field byte memoizedIsInitialized>
			return false;
	//   39   65:iconst_0        
	//   40   66:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   41   67:aload_0         
	//   42   68:iconst_1        
	//   43   69:putfield        #55  <Field byte memoizedIsInitialized>
			return true;
	//   44   72:iconst_1        
	//   45   73:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #345 <Method DescriptorProtos$EnumOptions$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(ent ent)
	{
		return new Builder(ent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #14  <Class DescriptorProtos$EnumOptions$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #349 <Method void DescriptorProtos$EnumOptions$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method DescriptorProtos$EnumOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(ent ent)
	{
		return ((Message.Builder) (newBuilderForType(ent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #355 <Method DescriptorProtos$EnumOptions$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method DescriptorProtos$EnumOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #48  <Field DescriptorProtos$EnumOptions DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #14  <Class DescriptorProtos$EnumOptions$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #359 <Method void DescriptorProtos$EnumOptions$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #14  <Class DescriptorProtos$EnumOptions$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #359 <Method void DescriptorProtos$EnumOptions$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #172 <Method DescriptorProtos$EnumOptions$Builder DescriptorProtos$EnumOptions$Builder.mergeFrom(DescriptorProtos$EnumOptions)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method DescriptorProtos$EnumOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method DescriptorProtos$EnumOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		Message.ExtensionWriter extensionwriter = newExtensionWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #365 <Method GeneratedMessageV3$ExtendableMessage$ExtensionWriter newExtensionWriter()>
	//    2    4:astore_3        
		if((bitField0_ & 1) == 1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #93  <Field int bitField0_>
	//*   5    9:iconst_1        
	//*   6   10:iand            
	//*   7   11:iconst_1        
	//*   8   12:icmpne          24
			codedoutputstream.writeBool(2, allowAlias_);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #57  <Field boolean allowAlias_>
	//   13   21:invokevirtual   #369 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 2) == 2)
	//*  14   24:aload_0         
	//*  15   25:getfield        #93  <Field int bitField0_>
	//*  16   28:iconst_2        
	//*  17   29:iand            
	//*  18   30:iconst_2        
	//*  19   31:icmpne          43
			codedoutputstream.writeBool(3, deprecated_);
	//   20   34:aload_1         
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #59  <Field boolean deprecated_>
	//   24   40:invokevirtual   #369 <Method void CodedOutputStream.writeBool(int, boolean)>
		for(int i = 0; i < uninterpretedOption_.size(); i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #67  <Field List uninterpretedOption_>
	//*  30   50:invokeinterface #273 <Method int List.size()>
	//*  31   55:icmpge          85
			codedoutputstream.writeMessage(999, (MessageLite)uninterpretedOption_.get(i));
	//   32   58:aload_1         
	//   33   59:sipush          999
	//   34   62:aload_0         
	//   35   63:getfield        #67  <Field List uninterpretedOption_>
	//   36   66:iload_2         
	//   37   67:invokeinterface #277 <Method Object List.get(int)>
	//   38   72:checkcast       #279 <Class MessageLite>
	//   39   75:invokevirtual   #373 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   40   78:iload_2         
	//   41   79:iconst_1        
	//   42   80:iadd            
	//   43   81:istore_2        
	//*  44   82:goto            45
		extensionwriter.writeUntil(0x20000000, codedoutputstream);
	//   45   85:aload_3         
	//   46   86:ldc2            #374 <Int 0x20000000>
	//   47   89:aload_1         
	//   48   90:invokevirtual   #380 <Method void GeneratedMessageV3$ExtendableMessage$ExtensionWriter.writeUntil(int, CodedOutputStream)>
		unknownFields.writeTo(codedoutputstream);
	//   49   93:aload_0         
	//   50   94:getfield        #127 <Field UnknownFieldSet unknownFields>
	//   51   97:aload_1         
	//   52   98:invokevirtual   #382 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   53  101:return          
	}

	public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
	private static final DescriptorProtos$EnumOptions DEFAULT_INSTANCE = new DescriptorProtos$EnumOptions();
	public static final int DEPRECATED_FIELD_NUMBER = 3;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.EnumOptions parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.EnumOptions(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$EnumOptions>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$EnumOptions(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$EnumOptions parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
	private static final long serialVersionUID = 0L;
	private boolean allowAlias_;
	private int bitField0_;
	private boolean deprecated_;
	private byte memoizedIsInitialized;
	private List uninterpretedOption_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$EnumOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void DescriptorProtos$EnumOptions()>
	//    3    7:putstatic       #48  <Field DescriptorProtos$EnumOptions DEFAULT_INSTANCE>
	//    4   10:new             #12  <Class DescriptorProtos$EnumOptions$1>
	//    5   13:dup             
	//    6   14:invokespecial   #49  <Method void DescriptorProtos$EnumOptions$1()>
	//    7   17:putstatic       #51  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static boolean access$21302(DescriptorProtos$EnumOptions descriptorprotos$enumoptions, boolean flag)
	{
		descriptorprotos$enumoptions.allowAlias_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean allowAlias_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$21402(DescriptorProtos$EnumOptions descriptorprotos$enumoptions, boolean flag)
	{
		descriptorprotos$enumoptions.deprecated_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean deprecated_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static List access$21500(DescriptorProtos$EnumOptions descriptorprotos$enumoptions)
	{
		return descriptorprotos$enumoptions.uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

*/


/*
	static List access$21502(DescriptorProtos$EnumOptions descriptorprotos$enumoptions, List list)
	{
		descriptorprotos$enumoptions.uninterpretedOption_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field List uninterpretedOption_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$21602(DescriptorProtos$EnumOptions descriptorprotos$enumoptions, int i)
	{
		descriptorprotos$enumoptions.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #93  <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$EnumOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void GeneratedMessageV3$ExtendableMessage()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #55  <Field byte memoizedIsInitialized>
		allowAlias_ = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #57  <Field boolean allowAlias_>
		deprecated_ = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #59  <Field boolean deprecated_>
		uninterpretedOption_ = Collections.emptyList();
	//   11   19:aload_0         
	//   12   20:invokestatic    #65  <Method List Collections.emptyList()>
	//   13   23:putfield        #67  <Field List uninterpretedOption_>
	//   14   26:return          
	}

	private DescriptorProtos$EnumOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void DescriptorProtos$EnumOptions()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #74  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #75  <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #81  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          10
		flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L10:
		int k;
		int l;
		int i1;
		if(flag)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            281
		l = i;
	//   16   31:iload_3         
	//   17   32:istore          6
		i1 = i;
	//   18   34:iload_3         
	//   19   35:istore          7
		k = i;
	//   20   37:iload_3         
	//   21   38:istore          5
		int j1 = codedinputstream.readTag();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #87  <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		j1;
	//   25   46:iload           9
		JVM INSTR lookupswitch 4: default 377
	//	               0: 380
	//	               16: 126
	//	               24: 168
	//	               7994: 210;
	//   26   48:lookupswitch    4: default 377
	//	               0: 380
	//	               16: 126
	//	               24: 168
	//	               7994: 210
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		int j;
		j = i;
	//   27   92:iload_3         
	//   28   93:istore          4
		l = i;
	//   29   95:iload_3         
	//   30   96:istore          6
		i1 = i;
	//   31   98:iload_3         
	//   32   99:istore          7
		k = i;
	//   33  101:iload_3         
	//   34  102:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, j1))
	//*  35  104:aload_0         
	//*  36  105:aload_1         
	//*  37  106:aload           10
	//*  38  108:aload_2         
	//*  39  109:iload           9
	//*  40  111:invokevirtual   #91  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  114:ifne            275
		{
			flag = true;
	//   42  117:iconst_1        
	//   43  118:istore          8
			j = i;
	//   44  120:iload_3         
	//   45  121:istore          4
		}
		  goto _L6
	//*  46  123:goto            275
_L3:
		l = i;
	//   47  126:iload_3         
	//   48  127:istore          6
		i1 = i;
	//   49  129:iload_3         
	//   50  130:istore          7
		k = i;
	//   51  132:iload_3         
	//   52  133:istore          5
		bitField0_ = bitField0_ | 1;
	//   53  135:aload_0         
	//   54  136:aload_0         
	//   55  137:getfield        #93  <Field int bitField0_>
	//   56  140:iconst_1        
	//   57  141:ior             
	//   58  142:putfield        #93  <Field int bitField0_>
		l = i;
	//   59  145:iload_3         
	//   60  146:istore          6
		i1 = i;
	//   61  148:iload_3         
	//   62  149:istore          7
		k = i;
	//   63  151:iload_3         
	//   64  152:istore          5
		allowAlias_ = codedinputstream.readBool();
	//   65  154:aload_0         
	//   66  155:aload_1         
	//   67  156:invokevirtual   #97  <Method boolean CodedInputStream.readBool()>
	//   68  159:putfield        #57  <Field boolean allowAlias_>
		j = i;
	//   69  162:iload_3         
	//   70  163:istore          4
		  goto _L6
	//*  71  165:goto            275
_L4:
		l = i;
	//   72  168:iload_3         
	//   73  169:istore          6
		i1 = i;
	//   74  171:iload_3         
	//   75  172:istore          7
		k = i;
	//   76  174:iload_3         
	//   77  175:istore          5
		bitField0_ = bitField0_ | 2;
	//   78  177:aload_0         
	//   79  178:aload_0         
	//   80  179:getfield        #93  <Field int bitField0_>
	//   81  182:iconst_2        
	//   82  183:ior             
	//   83  184:putfield        #93  <Field int bitField0_>
		l = i;
	//   84  187:iload_3         
	//   85  188:istore          6
		i1 = i;
	//   86  190:iload_3         
	//   87  191:istore          7
		k = i;
	//   88  193:iload_3         
	//   89  194:istore          5
		deprecated_ = codedinputstream.readBool();
	//   90  196:aload_0         
	//   91  197:aload_1         
	//   92  198:invokevirtual   #97  <Method boolean CodedInputStream.readBool()>
	//   93  201:putfield        #59  <Field boolean deprecated_>
		j = i;
	//   94  204:iload_3         
	//   95  205:istore          4
		  goto _L6
	//*  96  207:goto            275
_L5:
		j = i;
	//   97  210:iload_3         
	//   98  211:istore          4
		if((i & 4) == 4) goto _L8; else goto _L7
	//   99  213:iload_3         
	//  100  214:iconst_4        
	//  101  215:iand            
	//  102  216:iconst_4        
	//  103  217:icmpeq          245
_L7:
		l = i;
	//  104  220:iload_3         
	//  105  221:istore          6
		i1 = i;
	//  106  223:iload_3         
	//  107  224:istore          7
		k = i;
	//  108  226:iload_3         
	//  109  227:istore          5
		uninterpretedOption_ = ((List) (new ArrayList()));
	//  110  229:aload_0         
	//  111  230:new             #99  <Class ArrayList>
	//  112  233:dup             
	//  113  234:invokespecial   #100 <Method void ArrayList()>
	//  114  237:putfield        #67  <Field List uninterpretedOption_>
		j = i | 4;
	//  115  240:iload_3         
	//  116  241:iconst_4        
	//  117  242:ior             
	//  118  243:istore          4
_L8:
		l = j;
	//  119  245:iload           4
	//  120  247:istore          6
		i1 = j;
	//  121  249:iload           4
	//  122  251:istore          7
		k = j;
	//  123  253:iload           4
	//  124  255:istore          5
		uninterpretedOption_.add(((Object) (codedinputstream.readMessage(dOption.PARSER, extensionregistrylite))));
	//  125  257:aload_0         
	//  126  258:getfield        #67  <Field List uninterpretedOption_>
	//  127  261:aload_1         
	//  128  262:getstatic       #103 <Field Parser DescriptorProtos$UninterpretedOption.PARSER>
	//  129  265:aload_2         
	//  130  266:invokevirtual   #107 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  131  269:invokeinterface #113 <Method boolean List.add(Object)>
	//  132  274:pop             
_L6:
		i = j;
	//  133  275:iload           4
	//  134  277:istore_3        
		if(true) goto _L10; else goto _L9
	//  135  278:goto            26
_L9:
		if((i & 4) == 4)
	//* 136  281:iload_3         
	//* 137  282:iconst_4        
	//* 138  283:iand            
	//* 139  284:iconst_4        
	//* 140  285:icmpne          299
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  141  288:aload_0         
	//  142  289:aload_0         
	//  143  290:getfield        #67  <Field List uninterpretedOption_>
	//  144  293:invokestatic    #117 <Method List Collections.unmodifiableList(List)>
	//  145  296:putfield        #67  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  146  299:aload_0         
	//  147  300:aload           10
	//  148  302:invokevirtual   #123 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  149  305:putfield        #127 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  150  308:aload_0         
	//  151  309:invokevirtual   #130 <Method void makeExtensionsImmutable()>
		return;
	//  152  312:return          
		codedinputstream;
	//  153  313:astore_1        
		k = l;
	//  154  314:iload           6
	//  155  316:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  156  318:aload_1         
	//  157  319:aload_0         
	//  158  320:invokevirtual   #134 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  159  323:athrow          
		codedinputstream;
	//  160  324:astore_1        
		k = i1;
	//  161  325:iload           7
	//  162  327:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  163  329:new             #70  <Class InvalidProtocolBufferException>
	//  164  332:dup             
	//  165  333:aload_1         
	//  166  334:invokespecial   #137 <Method void InvalidProtocolBufferException(IOException)>
	//  167  337:aload_0         
	//  168  338:invokevirtual   #134 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  169  341:athrow          
		codedinputstream;
	//  170  342:astore_1        
		if((k & 4) == 4)
	//* 171  343:iload           5
	//* 172  345:iconst_4        
	//* 173  346:iand            
	//* 174  347:iconst_4        
	//* 175  348:icmpne          362
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  176  351:aload_0         
	//  177  352:aload_0         
	//  178  353:getfield        #67  <Field List uninterpretedOption_>
	//  179  356:invokestatic    #117 <Method List Collections.unmodifiableList(List)>
	//  180  359:putfield        #67  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  181  362:aload_0         
	//  182  363:aload           10
	//  183  365:invokevirtual   #123 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  184  368:putfield        #127 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  185  371:aload_0         
	//  186  372:invokevirtual   #130 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  187  375:aload_1         
	//  188  376:athrow          
	//* 189  377:goto            92
_L2:
		flag = true;
	//  190  380:iconst_1        
	//  191  381:istore          8
		j = i;
	//  192  383:iload_3         
	//  193  384:istore          4
		  goto _L6
	//* 194  386:goto            275
	}

	DescriptorProtos$EnumOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #141 <Method void DescriptorProtos$EnumOptions(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$EnumOptions(Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #144 <Method void GeneratedMessageV3$ExtendableMessage(GeneratedMessageV3$ExtendableBuilder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #55  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$EnumOptions(Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void DescriptorProtos$EnumOptions(GeneratedMessageV3$ExtendableBuilder)>
	//    3    5:return          
	}
}
