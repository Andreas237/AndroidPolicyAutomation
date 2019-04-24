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
//			RepeatedFieldBuilderV3, ProtocolMessageEnum, AbstractParser

public static final class DescriptorProtos$MethodOptions extends ssage
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.ExtendableBuilder
		implements DescriptorProtos.MethodOptionsOrBuilder
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

		public Builder addAllUninterpretedOption(Iterable iterable)
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

		public Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.addExtension(generatedextension, obj);
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
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

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(i, ((Object) (builder.build())));
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
				uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
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

		public Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(((Object) (builder.build())));
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
				uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption uninterpretedoption)
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

		public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder()
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #88  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:invokestatic    #160 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    3    7:invokevirtual   #164 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #127 <Class DescriptorProtos$UninterpretedOption$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
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
			methodoptions.deprecated_ = deprecated_;
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
			methodoptions.idempotencyLevel_ = idempotencyLevel_;
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
				methodoptions.uninterpretedOption_ = uninterpretedOption_;
		//   59   99:aload           4
		//   60  101:aload_0         
		//   61  102:getfield        #38  <Field List uninterpretedOption_>
		//   62  105:invokestatic    #204 <Method List DescriptorProtos$MethodOptions.access$24302(DescriptorProtos$MethodOptions, List)>
		//   63  108:pop             
			} else
		//*  64  109:goto            125
			{
				methodoptions.uninterpretedOption_ = uninterpretedOptionBuilder_.build();
		//   65  112:aload           4
		//   66  114:aload_0         
		//   67  115:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   68  118:invokevirtual   #206 <Method List RepeatedFieldBuilderV3.build()>
		//   69  121:invokestatic    #204 <Method List DescriptorProtos$MethodOptions.access$24302(DescriptorProtos$MethodOptions, List)>
		//   70  124:pop             
			}
			methodoptions.bitField0_ = j;
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

		public Builder clear()
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

		public Builder clearDeprecated()
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

		public Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return (Builder)super.clearExtension(generatedextension);
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

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
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

		public Builder clearIdempotencyLevel()
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

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
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

		public Builder clearUninterpretedOption()
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

		public Builder clone()
		{
			return (Builder)super.clone();
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

		public IdempotencyLevel getIdempotencyLevel()
		{
			IdempotencyLevel idempotencylevel = IdempotencyLevel.valueOf(idempotencyLevel_);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int idempotencyLevel_>
		//    2    4:invokestatic    #279 <Method DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions$IdempotencyLevel.valueOf(int)>
		//    3    7:astore_1        
			if(idempotencylevel == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       16
				return IdempotencyLevel.IDEMPOTENCY_UNKNOWN;
		//    6   12:getstatic       #283 <Field DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions$IdempotencyLevel.IDEMPOTENCY_UNKNOWN>
		//    7   15:areturn         
			else
				return idempotencylevel;
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

		public DescriptorProtos.UninterpretedOption.Builder getUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().getBuilder(i);
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

		public DescriptorProtos.UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOption_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field List uninterpretedOption_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #289 <Method Object List.get(int)>
		//    7   17:checkcast       #320 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
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

		public Builder mergeFrom(DescriptorProtos.MethodOptions methodoptions)
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
				if(!methodoptions.uninterpretedOption_.isEmpty())
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
						uninterpretedOption_ = methodoptions.uninterpretedOption_;
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
						uninterpretedOption_.addAll(((java.util.Collection) (methodoptions.uninterpretedOption_)));
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
			if(!methodoptions.uninterpretedOption_.isEmpty())
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
					uninterpretedOption_ = methodoptions.uninterpretedOption_;
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
					uninterpretedOptionBuilder_.addAllMessages(((Iterable) (methodoptions.uninterpretedOption_)));
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

		public Builder mergeFrom(Message message)
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

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
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

		public Builder removeUninterpretedOption(int i)
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

		public Builder setDeprecated(boolean flag)
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

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #449 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$MethodOptions$Builder>
		//    6   10:areturn         
		}

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, obj);
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
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

		public Builder setIdempotencyLevel(IdempotencyLevel idempotencylevel)
		{
			if(idempotencylevel == null)
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
				idempotencyLevel_ = idempotencylevel.getNumber();
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

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #92  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.set(i, ((Object) (builder.build())));
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
				uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
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

		private Builder()
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

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void DescriptorProtos$MethodOptions$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #49  <Method void DescriptorProtos$MethodOptions$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static final class IdempotencyLevel extends Enum
		implements ProtocolMessageEnum
	{

		public static IdempotencyLevel forNumber(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 2: default 28
		//		               0 31
		//		               1 35
		//		               2 39
		//*   2   28:goto            43
			case 0: // '\0'
				return IDEMPOTENCY_UNKNOWN;
		//    3   31:getstatic       #42  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENCY_UNKNOWN>
		//    4   34:areturn         

			case 1: // '\001'
				return NO_SIDE_EFFECTS;
		//    5   35:getstatic       #45  <Field DescriptorProtos$MethodOptions$IdempotencyLevel NO_SIDE_EFFECTS>
		//    6   38:areturn         

			case 2: // '\002'
				return IDEMPOTENT;
		//    7   39:getstatic       #48  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENT>
		//    8   42:areturn         
			}
			return null;
		//    9   43:aconst_null     
		//   10   44:areturn         
		}

		public static final Descriptors.EnumDescriptor getDescriptor()
		{
			return (Descriptors.EnumDescriptor)DescriptorProtos.MethodOptions.getDescriptor().getEnumTypes().get(0);
		//    0    0:invokestatic    #75  <Method Descriptors$Descriptor DescriptorProtos$MethodOptions.getDescriptor()>
		//    1    3:invokevirtual   #81  <Method List Descriptors$Descriptor.getEnumTypes()>
		//    2    6:iconst_0        
		//    3    7:invokeinterface #87  <Method Object List.get(int)>
		//    4   12:checkcast       #89  <Class Descriptors$EnumDescriptor>
		//    5   15:areturn         
		}

		public static Internal.EnumLiteMap internalGetValueMap()
		{
			return internalValueMap;
		//    0    0:getstatic       #54  <Field Internal$EnumLiteMap internalValueMap>
		//    1    3:areturn         
		}

		public static IdempotencyLevel valueOf(int i)
		{
			return forNumber(i);
		//    0    0:iload_0         
		//    1    1:invokestatic    #96  <Method DescriptorProtos$MethodOptions$IdempotencyLevel forNumber(int)>
		//    2    4:areturn         
		}

		public static IdempotencyLevel valueOf(Descriptors.EnumValueDescriptor enumvaluedescriptor)
		{
			if(enumvaluedescriptor.getType() != getDescriptor())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #103 <Method Descriptors$EnumDescriptor Descriptors$EnumValueDescriptor.getType()>
		//*   2    4:invokestatic    #105 <Method Descriptors$EnumDescriptor getDescriptor()>
		//*   3    7:if_acmpeq       20
				throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
		//    4   10:new             #107 <Class IllegalArgumentException>
		//    5   13:dup             
		//    6   14:ldc1            #109 <String "EnumValueDescriptor is not for this type.">
		//    7   16:invokespecial   #112 <Method void IllegalArgumentException(String)>
		//    8   19:athrow          
			else
				return VALUES[enumvaluedescriptor.getIndex()];
		//    9   20:getstatic       #60  <Field DescriptorProtos$MethodOptions$IdempotencyLevel[] VALUES>
		//   10   23:aload_0         
		//   11   24:invokevirtual   #116 <Method int Descriptors$EnumValueDescriptor.getIndex()>
		//   12   27:aaload          
		//   13   28:areturn         
		}

		public static IdempotencyLevel valueOf(String s)
		{
			return (IdempotencyLevel)Enum.valueOf(com/google/protobuf/DescriptorProtos$MethodOptions$IdempotencyLevel, s);
		//    0    0:ldc1            #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
		//    1    2:aload_0         
		//    2    3:invokestatic    #120 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
		//    4    9:areturn         
		}

		public static IdempotencyLevel[] values()
		{
			return (IdempotencyLevel[])((IdempotencyLevel []) ($VALUES)).clone();
		//    0    0:getstatic       #50  <Field DescriptorProtos$MethodOptions$IdempotencyLevel[] $VALUES>
		//    1    3:invokevirtual   #125 <Method Object _5B_Lcom.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel_3B_.clone()>
		//    2    6:checkcast       #121 <Class DescriptorProtos$MethodOptions$IdempotencyLevel[]>
		//    3    9:areturn         
		}

		public final Descriptors.EnumDescriptor getDescriptorForType()
		{
			return getDescriptor();
		//    0    0:invokestatic    #105 <Method Descriptors$EnumDescriptor getDescriptor()>
		//    1    3:areturn         
		}

		public final int getNumber()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field int value>
		//    2    4:ireturn         
		}

		public final Descriptors.EnumValueDescriptor getValueDescriptor()
		{
			return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(ordinal());
		//    0    0:invokestatic    #105 <Method Descriptors$EnumDescriptor getDescriptor()>
		//    1    3:invokevirtual   #132 <Method List Descriptors$EnumDescriptor.getValues()>
		//    2    6:aload_0         
		//    3    7:invokevirtual   #135 <Method int ordinal()>
		//    4   10:invokeinterface #87  <Method Object List.get(int)>
		//    5   15:checkcast       #100 <Class Descriptors$EnumValueDescriptor>
		//    6   18:areturn         
		}

		private static final IdempotencyLevel $VALUES[];
		public static final IdempotencyLevel IDEMPOTENCY_UNKNOWN;
		public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
		public static final IdempotencyLevel IDEMPOTENT;
		public static final int IDEMPOTENT_VALUE = 2;
		public static final IdempotencyLevel NO_SIDE_EFFECTS;
		public static final int NO_SIDE_EFFECTS_VALUE = 1;
		private static final IdempotencyLevel VALUES[] = values();
		private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() {

			public IdempotencyLevel findValueByNumber(int i)
			{
				return IdempotencyLevel.forNumber(i);
			//    0    0:iload_1         
			//    1    1:invokestatic    #25  <Method DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(int)>
			//    2    4:areturn         
			}

			public volatile Internal.EnumLite findValueByNumber(int i)
			{
				return ((Internal.EnumLite) (findValueByNumber(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #28  <Method DescriptorProtos$MethodOptions$IdempotencyLevel findValueByNumber(int)>
			//    3    5:areturn         
			}

		}
;
		private final int value;

		static 
		{
			IDEMPOTENCY_UNKNOWN = new IdempotencyLevel("IDEMPOTENCY_UNKNOWN", 0, 0);
		//    0    0:new             #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
		//    1    3:dup             
		//    2    4:ldc1            #36  <String "IDEMPOTENCY_UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #40  <Method void DescriptorProtos$MethodOptions$IdempotencyLevel(String, int, int)>
		//    6   11:putstatic       #42  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENCY_UNKNOWN>
			NO_SIDE_EFFECTS = new IdempotencyLevel("NO_SIDE_EFFECTS", 1, 1);
		//    7   14:new             #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
		//    8   17:dup             
		//    9   18:ldc1            #43  <String "NO_SIDE_EFFECTS">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #40  <Method void DescriptorProtos$MethodOptions$IdempotencyLevel(String, int, int)>
		//   13   25:putstatic       #45  <Field DescriptorProtos$MethodOptions$IdempotencyLevel NO_SIDE_EFFECTS>
			IDEMPOTENT = new IdempotencyLevel("IDEMPOTENT", 2, 2);
		//   14   28:new             #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
		//   15   31:dup             
		//   16   32:ldc1            #46  <String "IDEMPOTENT">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #40  <Method void DescriptorProtos$MethodOptions$IdempotencyLevel(String, int, int)>
		//   20   39:putstatic       #48  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENT>
			$VALUES = (new IdempotencyLevel[] {
				IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       IdempotencyLevel[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #42  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENCY_UNKNOWN>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #45  <Field DescriptorProtos$MethodOptions$IdempotencyLevel NO_SIDE_EFFECTS>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #48  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENT>
		//   34   63:aastore         
		//   35   64:putstatic       #50  <Field DescriptorProtos$MethodOptions$IdempotencyLevel[] $VALUES>
		//   36   67:new             #15  <Class DescriptorProtos$MethodOptions$IdempotencyLevel$1>
		//   37   70:dup             
		//   38   71:invokespecial   #52  <Method void DescriptorProtos$MethodOptions$IdempotencyLevel$1()>
		//   39   74:putstatic       #54  <Field Internal$EnumLiteMap internalValueMap>
		//   40   77:invokestatic    #58  <Method DescriptorProtos$MethodOptions$IdempotencyLevel[] values()>
		//   41   80:putstatic       #60  <Field DescriptorProtos$MethodOptions$IdempotencyLevel[] VALUES>
		//*  42   83:return          
		}

		private IdempotencyLevel(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #64  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #66  <Field int value>
		//    7   11:return          
		}
	}


	public static DescriptorProtos$MethodOptions getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #53  <Field DescriptorProtos$MethodOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$23600();
	//    0    0:invokestatic    #180 <Method Descriptors$Descriptor DescriptorProtos.access$23600()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #53  <Field DescriptorProtos$MethodOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #184 <Method DescriptorProtos$MethodOptions$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$MethodOptions descriptorprotos$methodoptions)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$methodoptions);
	//    0    0:getstatic       #53  <Field DescriptorProtos$MethodOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #184 <Method DescriptorProtos$MethodOptions$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #188 <Method DescriptorProtos$MethodOptions$Builder DescriptorProtos$MethodOptions$Builder.mergeFrom(DescriptorProtos$MethodOptions)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$MethodOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #196 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$MethodOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #200 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MethodOptions)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #207 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MethodOptions)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #211 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$MethodOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #216 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$MethodOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #220 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$MethodOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #222 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$MethodOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #224 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MethodOptions)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #228 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MethodOptions)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #232 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MethodOptions)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #236 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$MethodOptions parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MethodOptions)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #240 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #56  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$MethodOptions))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$MethodOptions>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #246 <Method boolean GeneratedMessageV3$ExtendableMessage.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$MethodOptions)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$MethodOptions>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasDeprecated() == ((DescriptorProtos$MethodOptions) (obj)).hasDeprecated())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #249 <Method boolean hasDeprecated()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #249 <Method boolean hasDeprecated()>
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
		if(hasDeprecated())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #249 <Method boolean hasDeprecated()>
	//*  31   53:ifeq            78
			if(flag && getDeprecated() == ((DescriptorProtos$MethodOptions) (obj)).getDeprecated())
	//*  32   56:iload_2         
	//*  33   57:ifeq            76
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #252 <Method boolean getDeprecated()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #252 <Method boolean getDeprecated()>
	//*  38   68:icmpne          76
				flag1 = true;
	//   39   71:iconst_1        
	//   40   72:istore_3        
			else
	//*  41   73:goto            78
				flag1 = false;
	//   42   76:iconst_0        
	//   43   77:istore_3        
		if(flag1 && hasIdempotencyLevel() == ((DescriptorProtos$MethodOptions) (obj)).hasIdempotencyLevel())
	//*  44   78:iload_3         
	//*  45   79:ifeq            98
	//*  46   82:aload_0         
	//*  47   83:invokevirtual   #255 <Method boolean hasIdempotencyLevel()>
	//*  48   86:aload_1         
	//*  49   87:invokevirtual   #255 <Method boolean hasIdempotencyLevel()>
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
		if(hasIdempotencyLevel())
	//*  58  102:aload_0         
	//*  59  103:invokevirtual   #255 <Method boolean hasIdempotencyLevel()>
	//*  60  106:ifeq            131
			if(flag && idempotencyLevel_ == ((DescriptorProtos$MethodOptions) (obj)).idempotencyLevel_)
	//*  61  109:iload_2         
	//*  62  110:ifeq            129
	//*  63  113:aload_0         
	//*  64  114:getfield        #64  <Field int idempotencyLevel_>
	//*  65  117:aload_1         
	//*  66  118:getfield        #64  <Field int idempotencyLevel_>
	//*  67  121:icmpne          129
				flag1 = true;
	//   68  124:iconst_1        
	//   69  125:istore_3        
			else
	//*  70  126:goto            131
				flag1 = false;
	//   71  129:iconst_0        
	//   72  130:istore_3        
		if(flag1 && getUninterpretedOptionList().equals(((Object) (((DescriptorProtos$MethodOptions) (obj)).getUninterpretedOptionList()))))
	//*  73  131:iload_3         
	//*  74  132:ifeq            156
	//*  75  135:aload_0         
	//*  76  136:invokevirtual   #258 <Method List getUninterpretedOptionList()>
	//*  77  139:aload_1         
	//*  78  140:invokevirtual   #258 <Method List getUninterpretedOptionList()>
	//*  79  143:invokeinterface #259 <Method boolean List.equals(Object)>
	//*  80  148:ifeq            156
			flag = true;
	//   81  151:iconst_1        
	//   82  152:istore_2        
		else
	//*  83  153:goto            158
			flag = false;
	//   84  156:iconst_0        
	//   85  157:istore_2        
		if(flag && unknownFields.equals(((Object) (((DescriptorProtos$MethodOptions) (obj)).unknownFields))))
	//*  86  158:iload_2         
	//*  87  159:ifeq            181
	//*  88  162:aload_0         
	//*  89  163:getfield        #143 <Field UnknownFieldSet unknownFields>
	//*  90  166:aload_1         
	//*  91  167:getfield        #143 <Field UnknownFieldSet unknownFields>
	//*  92  170:invokevirtual   #260 <Method boolean UnknownFieldSet.equals(Object)>
	//*  93  173:ifeq            181
			flag = true;
	//   94  176:iconst_1        
	//   95  177:istore_2        
		else
	//*  96  178:goto            183
			flag = false;
	//   97  181:iconst_0        
	//   98  182:istore_2        
		return flag && getExtensionFields().equals(((Object) (((DescriptorProtos$MethodOptions) (obj)).getExtensionFields())));
	//   99  183:iload_2         
	//  100  184:ifeq            205
	//  101  187:aload_0         
	//  102  188:invokevirtual   #264 <Method Map getExtensionFields()>
	//  103  191:aload_1         
	//  104  192:invokevirtual   #264 <Method Map getExtensionFields()>
	//  105  195:invokeinterface #267 <Method boolean Map.equals(Object)>
	//  106  200:ifeq            205
	//  107  203:iconst_1        
	//  108  204:ireturn         
	//  109  205:iconst_0        
	//  110  206:ireturn         
	}

	public DescriptorProtos$MethodOptions getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #53  <Field DescriptorProtos$MethodOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method DescriptorProtos$MethodOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method DescriptorProtos$MethodOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public IdempotencyLevel getIdempotencyLevel()
	{
		IdempotencyLevel idempotencylevel = IdempotencyLevel.valueOf(idempotencyLevel_);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int idempotencyLevel_>
	//    2    4:invokestatic    #109 <Method DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions$IdempotencyLevel.valueOf(int)>
	//    3    7:astore_1        
		if(idempotencylevel == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return IdempotencyLevel.IDEMPOTENCY_UNKNOWN;
	//    6   12:getstatic       #278 <Field DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions$IdempotencyLevel.IDEMPOTENCY_UNKNOWN>
	//    7   15:areturn         
		else
			return idempotencylevel;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #56  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field int memoizedSize>
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
	//*  11   15:getfield        #98  <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          36
			j = CodedOutputStream.computeBoolSize(33, deprecated_) + 0;
	//   16   24:bipush          33
	//   17   26:aload_0         
	//   18   27:getfield        #62  <Field boolean deprecated_>
	//   19   30:invokestatic    #289 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   20   33:iconst_0        
	//   21   34:iadd            
	//   22   35:istore_2        
		i = j;
	//   23   36:iload_2         
	//   24   37:istore_1        
		if((bitField0_ & 2) == 2)
	//*  25   38:aload_0         
	//*  26   39:getfield        #98  <Field int bitField0_>
	//*  27   42:iconst_2        
	//*  28   43:iand            
	//*  29   44:iconst_2        
	//*  30   45:icmpne          60
			i = j + CodedOutputStream.computeEnumSize(34, idempotencyLevel_);
	//   31   48:iload_2         
	//   32   49:bipush          34
	//   33   51:aload_0         
	//   34   52:getfield        #64  <Field int idempotencyLevel_>
	//   35   55:invokestatic    #293 <Method int CodedOutputStream.computeEnumSize(int, int)>
	//   36   58:iadd            
	//   37   59:istore_1        
		for(int k = 0; k < uninterpretedOption_.size(); k++)
	//*  38   60:iconst_0        
	//*  39   61:istore_2        
	//*  40   62:iload_2         
	//*  41   63:aload_0         
	//*  42   64:getfield        #72  <Field List uninterpretedOption_>
	//*  43   67:invokeinterface #296 <Method int List.size()>
	//*  44   72:icmpge          104
			i += CodedOutputStream.computeMessageSize(999, (MessageLite)uninterpretedOption_.get(k));
	//   45   75:iload_1         
	//   46   76:sipush          999
	//   47   79:aload_0         
	//   48   80:getfield        #72  <Field List uninterpretedOption_>
	//   49   83:iload_2         
	//   50   84:invokeinterface #300 <Method Object List.get(int)>
	//   51   89:checkcast       #302 <Class MessageLite>
	//   52   92:invokestatic    #306 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   53   95:iadd            
	//   54   96:istore_1        

	//   55   97:iload_2         
	//   56   98:iconst_1        
	//   57   99:iadd            
	//   58  100:istore_2        
	//*  59  101:goto            62
		i = i + extensionsSerializedSize() + unknownFields.getSerializedSize();
	//   60  104:iload_1         
	//   61  105:aload_0         
	//   62  106:invokevirtual   #309 <Method int extensionsSerializedSize()>
	//   63  109:iadd            
	//   64  110:aload_0         
	//   65  111:getfield        #143 <Field UnknownFieldSet unknownFields>
	//   66  114:invokevirtual   #311 <Method int UnknownFieldSet.getSerializedSize()>
	//   67  117:iadd            
	//   68  118:istore_1        
		memoizedSize = i;
	//   69  119:aload_0         
	//   70  120:iload_1         
	//   71  121:putfield        #283 <Field int memoizedSize>
		return i;
	//   72  124:iload_1         
	//   73  125:ireturn         
	}

	public ption getUninterpretedOption(int i)
	{
		return (ption)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #300 <Method Object List.get(int)>
	//    4   10:checkcast       #120 <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		return uninterpretedOption_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field List uninterpretedOption_>
	//    2    4:invokeinterface #296 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public ptionOrBuilder getUninterpretedOptionOrBuilder(int i)
	{
		return (ptionOrBuilder)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #300 <Method Object List.get(int)>
	//    4   10:checkcast       #319 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    5   13:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasDeprecated()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field int bitField0_>
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
	//    1    1:getfield        #98  <Field int bitField0_>
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
	//*   1    1:getfield        #326 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #326 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #328 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #332 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasDeprecated())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #249 <Method boolean hasDeprecated()>
	//*  15   29:ifeq            51
			i = (j * 37 + 33) * 53 + Internal.hashBoolean(getDeprecated());
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:bipush          33
	//   20   38:iadd            
	//   21   39:bipush          53
	//   22   41:imul            
	//   23   42:aload_0         
	//   24   43:invokevirtual   #252 <Method boolean getDeprecated()>
	//   25   46:invokestatic    #338 <Method int Internal.hashBoolean(boolean)>
	//   26   49:iadd            
	//   27   50:istore_1        
		j = i;
	//   28   51:iload_1         
	//   29   52:istore_2        
		if(hasIdempotencyLevel())
	//*  30   53:aload_0         
	//*  31   54:invokevirtual   #255 <Method boolean hasIdempotencyLevel()>
	//*  32   57:ifeq            76
			j = (i * 37 + 34) * 53 + idempotencyLevel_;
	//   33   60:iload_1         
	//   34   61:bipush          37
	//   35   63:imul            
	//   36   64:bipush          34
	//   37   66:iadd            
	//   38   67:bipush          53
	//   39   69:imul            
	//   40   70:aload_0         
	//   41   71:getfield        #64  <Field int idempotencyLevel_>
	//   42   74:iadd            
	//   43   75:istore_2        
		i = j;
	//   44   76:iload_2         
	//   45   77:istore_1        
		if(getUninterpretedOptionCount() > 0)
	//*  46   78:aload_0         
	//*  47   79:invokevirtual   #340 <Method int getUninterpretedOptionCount()>
	//*  48   82:ifle            107
			i = (j * 37 + 999) * 53 + getUninterpretedOptionList().hashCode();
	//   49   85:iload_2         
	//   50   86:bipush          37
	//   51   88:imul            
	//   52   89:sipush          999
	//   53   92:iadd            
	//   54   93:bipush          53
	//   55   95:imul            
	//   56   96:aload_0         
	//   57   97:invokevirtual   #258 <Method List getUninterpretedOptionList()>
	//   58  100:invokeinterface #341 <Method int List.hashCode()>
	//   59  105:iadd            
	//   60  106:istore_1        
		i = hashFields(i, getExtensionFields()) * 29 + unknownFields.hashCode();
	//   61  107:iload_1         
	//   62  108:aload_0         
	//   63  109:invokevirtual   #264 <Method Map getExtensionFields()>
	//   64  112:invokestatic    #345 <Method int hashFields(int, Map)>
	//   65  115:bipush          29
	//   66  117:imul            
	//   67  118:aload_0         
	//   68  119:getfield        #143 <Field UnknownFieldSet unknownFields>
	//   69  122:invokevirtual   #346 <Method int UnknownFieldSet.hashCode()>
	//   70  125:iadd            
	//   71  126:istore_1        
		memoizedHashCode = i;
	//   72  127:aload_0         
	//   73  128:iload_1         
	//   74  129:putfield        #326 <Field int memoizedHashCode>
		return i;
	//   75  132:iload_1         
	//   76  133:ireturn         
	}

	protected rTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$23700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$MethodOptions, com/google/protobuf/DescriptorProtos$MethodOptions$Builder);
	//    0    0:invokestatic    #351 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$23700()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$MethodOptions>
	//    2    5:ldc1            #14  <Class DescriptorProtos$MethodOptions$Builder>
	//    3    7:invokevirtual   #357 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field byte memoizedIsInitialized>
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
	//*  16   22:invokevirtual   #340 <Method int getUninterpretedOptionCount()>
	//*  17   25:icmpge          53
			if(!getUninterpretedOption(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #360 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*  21   33:invokevirtual   #362 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #60  <Field byte memoizedIsInitialized>
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
	//*  34   54:invokevirtual   #365 <Method boolean extensionsAreInitialized()>
	//*  35   57:ifne            67
		{
			memoizedIsInitialized = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #60  <Field byte memoizedIsInitialized>
			return false;
	//   39   65:iconst_0        
	//   40   66:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   41   67:aload_0         
	//   42   68:iconst_1        
	//   43   69:putfield        #60  <Field byte memoizedIsInitialized>
			return true;
	//   44   72:iconst_1        
	//   45   73:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #368 <Method DescriptorProtos$MethodOptions$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(t t)
	{
		return new Builder(t, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #14  <Class DescriptorProtos$MethodOptions$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #372 <Method void DescriptorProtos$MethodOptions$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #375 <Method DescriptorProtos$MethodOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(t t)
	{
		return ((Message.Builder) (newBuilderForType(t)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #378 <Method DescriptorProtos$MethodOptions$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #375 <Method DescriptorProtos$MethodOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #53  <Field DescriptorProtos$MethodOptions DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #14  <Class DescriptorProtos$MethodOptions$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #382 <Method void DescriptorProtos$MethodOptions$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #14  <Class DescriptorProtos$MethodOptions$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #382 <Method void DescriptorProtos$MethodOptions$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #188 <Method DescriptorProtos$MethodOptions$Builder DescriptorProtos$MethodOptions$Builder.mergeFrom(DescriptorProtos$MethodOptions)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method DescriptorProtos$MethodOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method DescriptorProtos$MethodOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		ssage.ExtensionWriter extensionwriter = newExtensionWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #388 <Method GeneratedMessageV3$ExtendableMessage$ExtensionWriter newExtensionWriter()>
	//    2    4:astore_3        
		if((bitField0_ & 1) == 1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #98  <Field int bitField0_>
	//*   5    9:iconst_1        
	//*   6   10:iand            
	//*   7   11:iconst_1        
	//*   8   12:icmpne          25
			codedoutputstream.writeBool(33, deprecated_);
	//    9   15:aload_1         
	//   10   16:bipush          33
	//   11   18:aload_0         
	//   12   19:getfield        #62  <Field boolean deprecated_>
	//   13   22:invokevirtual   #392 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 2) == 2)
	//*  14   25:aload_0         
	//*  15   26:getfield        #98  <Field int bitField0_>
	//*  16   29:iconst_2        
	//*  17   30:iand            
	//*  18   31:iconst_2        
	//*  19   32:icmpne          45
			codedoutputstream.writeEnum(34, idempotencyLevel_);
	//   20   35:aload_1         
	//   21   36:bipush          34
	//   22   38:aload_0         
	//   23   39:getfield        #64  <Field int idempotencyLevel_>
	//   24   42:invokevirtual   #396 <Method void CodedOutputStream.writeEnum(int, int)>
		for(int i = 0; i < uninterpretedOption_.size(); i++)
	//*  25   45:iconst_0        
	//*  26   46:istore_2        
	//*  27   47:iload_2         
	//*  28   48:aload_0         
	//*  29   49:getfield        #72  <Field List uninterpretedOption_>
	//*  30   52:invokeinterface #296 <Method int List.size()>
	//*  31   57:icmpge          87
			codedoutputstream.writeMessage(999, (MessageLite)uninterpretedOption_.get(i));
	//   32   60:aload_1         
	//   33   61:sipush          999
	//   34   64:aload_0         
	//   35   65:getfield        #72  <Field List uninterpretedOption_>
	//   36   68:iload_2         
	//   37   69:invokeinterface #300 <Method Object List.get(int)>
	//   38   74:checkcast       #302 <Class MessageLite>
	//   39   77:invokevirtual   #400 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   40   80:iload_2         
	//   41   81:iconst_1        
	//   42   82:iadd            
	//   43   83:istore_2        
	//*  44   84:goto            47
		extensionwriter.writeUntil(0x20000000, codedoutputstream);
	//   45   87:aload_3         
	//   46   88:ldc2            #401 <Int 0x20000000>
	//   47   91:aload_1         
	//   48   92:invokevirtual   #407 <Method void GeneratedMessageV3$ExtendableMessage$ExtensionWriter.writeUntil(int, CodedOutputStream)>
		unknownFields.writeTo(codedoutputstream);
	//   49   95:aload_0         
	//   50   96:getfield        #143 <Field UnknownFieldSet unknownFields>
	//   51   99:aload_1         
	//   52  100:invokevirtual   #409 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   53  103:return          
	}

	private static final DescriptorProtos$MethodOptions DEFAULT_INSTANCE = new DescriptorProtos$MethodOptions();
	public static final int DEPRECATED_FIELD_NUMBER = 33;
	public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.MethodOptions parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.MethodOptions(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$MethodOptions>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$MethodOptions(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$MethodOptions parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private boolean deprecated_;
	private int idempotencyLevel_;
	private byte memoizedIsInitialized;
	private List uninterpretedOption_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$MethodOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void DescriptorProtos$MethodOptions()>
	//    3    7:putstatic       #53  <Field DescriptorProtos$MethodOptions DEFAULT_INSTANCE>
	//    4   10:new             #12  <Class DescriptorProtos$MethodOptions$1>
	//    5   13:dup             
	//    6   14:invokespecial   #54  <Method void DescriptorProtos$MethodOptions$1()>
	//    7   17:putstatic       #56  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static boolean access$24102(DescriptorProtos$MethodOptions descriptorprotos$methodoptions, boolean flag)
	{
		descriptorprotos$methodoptions.deprecated_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean deprecated_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$24202(DescriptorProtos$MethodOptions descriptorprotos$methodoptions, int i)
	{
		descriptorprotos$methodoptions.idempotencyLevel_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field int idempotencyLevel_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static List access$24300(DescriptorProtos$MethodOptions descriptorprotos$methodoptions)
	{
		return descriptorprotos$methodoptions.uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

*/


/*
	static List access$24302(DescriptorProtos$MethodOptions descriptorprotos$methodoptions, List list)
	{
		descriptorprotos$methodoptions.uninterpretedOption_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field List uninterpretedOption_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$24402(DescriptorProtos$MethodOptions descriptorprotos$methodoptions, int i)
	{
		descriptorprotos$methodoptions.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #98  <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$MethodOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void GeneratedMessageV3$ExtendableMessage()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #60  <Field byte memoizedIsInitialized>
		deprecated_ = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #62  <Field boolean deprecated_>
		idempotencyLevel_ = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #64  <Field int idempotencyLevel_>
		uninterpretedOption_ = Collections.emptyList();
	//   11   19:aload_0         
	//   12   20:invokestatic    #70  <Method List Collections.emptyList()>
	//   13   23:putfield        #72  <Field List uninterpretedOption_>
	//   14   26:return          
	}

	private DescriptorProtos$MethodOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void DescriptorProtos$MethodOptions()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #79  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #80  <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #86  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          10
		flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L12:
		int k;
		int l;
		int i1;
		if(flag)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            336
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
	//   23   41:invokevirtual   #92  <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		j1;
	//   25   46:iload           9
		JVM INSTR lookupswitch 4: default 432
	//	               0: 435
	//	               264: 126
	//	               272: 168
	//	               7994: 265;
	//   26   48:lookupswitch    4: default 432
	//	               0: 435
	//	               264: 126
	//	               272: 168
	//	               7994: 265
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
	//*  40  111:invokevirtual   #96  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  114:ifne            330
		{
			flag = true;
	//   42  117:iconst_1        
	//   43  118:istore          8
			j = i;
	//   44  120:iload_3         
	//   45  121:istore          4
		}
		  goto _L6
	//*  46  123:goto            330
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
	//   55  137:getfield        #98  <Field int bitField0_>
	//   56  140:iconst_1        
	//   57  141:ior             
	//   58  142:putfield        #98  <Field int bitField0_>
		l = i;
	//   59  145:iload_3         
	//   60  146:istore          6
		i1 = i;
	//   61  148:iload_3         
	//   62  149:istore          7
		k = i;
	//   63  151:iload_3         
	//   64  152:istore          5
		deprecated_ = codedinputstream.readBool();
	//   65  154:aload_0         
	//   66  155:aload_1         
	//   67  156:invokevirtual   #102 <Method boolean CodedInputStream.readBool()>
	//   68  159:putfield        #62  <Field boolean deprecated_>
		j = i;
	//   69  162:iload_3         
	//   70  163:istore          4
		  goto _L6
	//*  71  165:goto            330
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
		j = codedinputstream.readEnum();
	//   78  177:aload_1         
	//   79  178:invokevirtual   #105 <Method int CodedInputStream.readEnum()>
	//   80  181:istore          4
		l = i;
	//   81  183:iload_3         
	//   82  184:istore          6
		i1 = i;
	//   83  186:iload_3         
	//   84  187:istore          7
		k = i;
	//   85  189:iload_3         
	//   86  190:istore          5
		if(IdempotencyLevel.valueOf(j) != null) goto _L8; else goto _L7
	//   87  192:iload           4
	//   88  194:invokestatic    #109 <Method DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions$IdempotencyLevel.valueOf(int)>
	//   89  197:ifnonnull       225
_L7:
		l = i;
	//   90  200:iload_3         
	//   91  201:istore          6
		i1 = i;
	//   92  203:iload_3         
	//   93  204:istore          7
		k = i;
	//   94  206:iload_3         
	//   95  207:istore          5
		builder.mergeVarintField(34, j);
	//   96  209:aload           10
	//   97  211:bipush          34
	//   98  213:iload           4
	//   99  215:invokevirtual   #115 <Method UnknownFieldSet$Builder UnknownFieldSet$Builder.mergeVarintField(int, int)>
	//  100  218:pop             
		j = i;
	//  101  219:iload_3         
	//  102  220:istore          4
		  goto _L6
	//* 103  222:goto            330
_L8:
		l = i;
	//  104  225:iload_3         
	//  105  226:istore          6
		i1 = i;
	//  106  228:iload_3         
	//  107  229:istore          7
		k = i;
	//  108  231:iload_3         
	//  109  232:istore          5
		bitField0_ = bitField0_ | 2;
	//  110  234:aload_0         
	//  111  235:aload_0         
	//  112  236:getfield        #98  <Field int bitField0_>
	//  113  239:iconst_2        
	//  114  240:ior             
	//  115  241:putfield        #98  <Field int bitField0_>
		l = i;
	//  116  244:iload_3         
	//  117  245:istore          6
		i1 = i;
	//  118  247:iload_3         
	//  119  248:istore          7
		k = i;
	//  120  250:iload_3         
	//  121  251:istore          5
		idempotencyLevel_ = j;
	//  122  253:aload_0         
	//  123  254:iload           4
	//  124  256:putfield        #64  <Field int idempotencyLevel_>
		j = i;
	//  125  259:iload_3         
	//  126  260:istore          4
		  goto _L6
	//* 127  262:goto            330
_L5:
		j = i;
	//  128  265:iload_3         
	//  129  266:istore          4
		if((i & 4) == 4) goto _L10; else goto _L9
	//  130  268:iload_3         
	//  131  269:iconst_4        
	//  132  270:iand            
	//  133  271:iconst_4        
	//  134  272:icmpeq          300
_L9:
		l = i;
	//  135  275:iload_3         
	//  136  276:istore          6
		i1 = i;
	//  137  278:iload_3         
	//  138  279:istore          7
		k = i;
	//  139  281:iload_3         
	//  140  282:istore          5
		uninterpretedOption_ = ((List) (new ArrayList()));
	//  141  284:aload_0         
	//  142  285:new             #117 <Class ArrayList>
	//  143  288:dup             
	//  144  289:invokespecial   #118 <Method void ArrayList()>
	//  145  292:putfield        #72  <Field List uninterpretedOption_>
		j = i | 4;
	//  146  295:iload_3         
	//  147  296:iconst_4        
	//  148  297:ior             
	//  149  298:istore          4
_L10:
		l = j;
	//  150  300:iload           4
	//  151  302:istore          6
		i1 = j;
	//  152  304:iload           4
	//  153  306:istore          7
		k = j;
	//  154  308:iload           4
	//  155  310:istore          5
		uninterpretedOption_.add(((Object) (codedinputstream.readMessage(ption.PARSER, extensionregistrylite))));
	//  156  312:aload_0         
	//  157  313:getfield        #72  <Field List uninterpretedOption_>
	//  158  316:aload_1         
	//  159  317:getstatic       #121 <Field Parser DescriptorProtos$UninterpretedOption.PARSER>
	//  160  320:aload_2         
	//  161  321:invokevirtual   #125 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  162  324:invokeinterface #131 <Method boolean List.add(Object)>
	//  163  329:pop             
_L6:
		i = j;
	//  164  330:iload           4
	//  165  332:istore_3        
		if(true) goto _L12; else goto _L11
	//  166  333:goto            26
_L11:
		if((i & 4) == 4)
	//* 167  336:iload_3         
	//* 168  337:iconst_4        
	//* 169  338:iand            
	//* 170  339:iconst_4        
	//* 171  340:icmpne          354
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  172  343:aload_0         
	//  173  344:aload_0         
	//  174  345:getfield        #72  <Field List uninterpretedOption_>
	//  175  348:invokestatic    #135 <Method List Collections.unmodifiableList(List)>
	//  176  351:putfield        #72  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  177  354:aload_0         
	//  178  355:aload           10
	//  179  357:invokevirtual   #139 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  180  360:putfield        #143 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  181  363:aload_0         
	//  182  364:invokevirtual   #146 <Method void makeExtensionsImmutable()>
		return;
	//  183  367:return          
		codedinputstream;
	//  184  368:astore_1        
		k = l;
	//  185  369:iload           6
	//  186  371:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  187  373:aload_1         
	//  188  374:aload_0         
	//  189  375:invokevirtual   #150 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  190  378:athrow          
		codedinputstream;
	//  191  379:astore_1        
		k = i1;
	//  192  380:iload           7
	//  193  382:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  194  384:new             #75  <Class InvalidProtocolBufferException>
	//  195  387:dup             
	//  196  388:aload_1         
	//  197  389:invokespecial   #153 <Method void InvalidProtocolBufferException(IOException)>
	//  198  392:aload_0         
	//  199  393:invokevirtual   #150 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  200  396:athrow          
		codedinputstream;
	//  201  397:astore_1        
		if((k & 4) == 4)
	//* 202  398:iload           5
	//* 203  400:iconst_4        
	//* 204  401:iand            
	//* 205  402:iconst_4        
	//* 206  403:icmpne          417
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  207  406:aload_0         
	//  208  407:aload_0         
	//  209  408:getfield        #72  <Field List uninterpretedOption_>
	//  210  411:invokestatic    #135 <Method List Collections.unmodifiableList(List)>
	//  211  414:putfield        #72  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  212  417:aload_0         
	//  213  418:aload           10
	//  214  420:invokevirtual   #139 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  215  423:putfield        #143 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  216  426:aload_0         
	//  217  427:invokevirtual   #146 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  218  430:aload_1         
	//  219  431:athrow          
	//* 220  432:goto            92
_L2:
		flag = true;
	//  221  435:iconst_1        
	//  222  436:istore          8
		j = i;
	//  223  438:iload_3         
	//  224  439:istore          4
		  goto _L6
	//* 225  441:goto            330
	}

	DescriptorProtos$MethodOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #157 <Method void DescriptorProtos$MethodOptions(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$MethodOptions(ilder ilder)
	{
		super(ilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void GeneratedMessageV3$ExtendableMessage(GeneratedMessageV3$ExtendableBuilder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #60  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$MethodOptions(ilder ilder, DescriptorProtos._cls1 _pcls1)
	{
		this(ilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #164 <Method void DescriptorProtos$MethodOptions(GeneratedMessageV3$ExtendableBuilder)>
	//    3    5:return          
	}
}
