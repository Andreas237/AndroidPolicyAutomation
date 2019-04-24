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

public static final class DescriptorProtos$MessageOptions extends sage
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.ExtendableBuilder
		implements DescriptorProtos.MessageOptionsOrBuilder
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
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
			messageoptions.messageSetWireFormat_ = messageSetWireFormat_;
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
			messageoptions.noStandardDescriptorAccessor_ = noStandardDescriptorAccessor_;
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
			messageoptions.deprecated_ = deprecated_;
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
			messageoptions.mapEntry_ = mapEntry_;
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
				messageoptions.uninterpretedOption_ = uninterpretedOption_;
		//   91  150:aload           4
		//   92  152:aload_0         
		//   93  153:getfield        #38  <Field List uninterpretedOption_>
		//   94  156:invokestatic    #215 <Method List DescriptorProtos$MessageOptions.access$18402(DescriptorProtos$MessageOptions, List)>
		//   95  159:pop             
			} else
		//*  96  160:goto            176
			{
				messageoptions.uninterpretedOption_ = uninterpretedOptionBuilder_.build();
		//   97  163:aload           4
		//   98  165:aload_0         
		//   99  166:getfield        #66  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//  100  169:invokevirtual   #217 <Method List RepeatedFieldBuilderV3.build()>
		//  101  172:invokestatic    #215 <Method List DescriptorProtos$MessageOptions.access$18402(DescriptorProtos$MessageOptions, List)>
		//  102  175:pop             
			}
			messageoptions.bitField0_ = i;
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

		public Builder clear()
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

		public Builder clearDeprecated()
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

		public Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return (Builder)super.clearExtension(generatedextension);
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

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
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

		public Builder clearMapEntry()
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

		public Builder clearMessageSetWireFormat()
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

		public Builder clearNoStandardDescriptorAccessor()
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

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
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

		public Builder clone()
		{
			return (Builder)super.clone();
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

		public DescriptorProtos.UninterpretedOption.Builder getUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().getBuilder(i);
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
		//    6   12:invokeinterface #294 <Method Object List.get(int)>
		//    7   17:checkcast       #325 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
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

		public Builder mergeFrom(DescriptorProtos.MessageOptions messageoptions)
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
				if(!messageoptions.uninterpretedOption_.isEmpty())
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
						uninterpretedOption_ = messageoptions.uninterpretedOption_;
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
						uninterpretedOption_.addAll(((java.util.Collection) (messageoptions.uninterpretedOption_)));
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
			if(!messageoptions.uninterpretedOption_.isEmpty())
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
					uninterpretedOption_ = messageoptions.uninterpretedOption_;
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
					uninterpretedOptionBuilder_.addAllMessages(((Iterable) (messageoptions.uninterpretedOption_)));
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

		public Builder mergeFrom(Message message)
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

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
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

		public Builder setDeprecated(boolean flag)
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

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #469 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$MessageOptions$Builder>
		//    6   10:areturn         
		}

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, obj);
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
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

		public Builder setMapEntry(boolean flag)
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

		public Builder setMessageSetWireFormat(boolean flag)
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

		public Builder setNoStandardDescriptorAccessor(boolean flag)
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

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
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
				uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
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

		private Builder()
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

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void DescriptorProtos$MessageOptions$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #49  <Method void DescriptorProtos$MessageOptions$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$MessageOptions getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #54  <Field DescriptorProtos$MessageOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$17500();
	//    0    0:invokestatic    #176 <Method Descriptors$Descriptor DescriptorProtos.access$17500()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #54  <Field DescriptorProtos$MessageOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #180 <Method DescriptorProtos$MessageOptions$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$MessageOptions descriptorprotos$messageoptions)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$messageoptions);
	//    0    0:getstatic       #54  <Field DescriptorProtos$MessageOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #180 <Method DescriptorProtos$MessageOptions$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #184 <Method DescriptorProtos$MessageOptions$Builder DescriptorProtos$MessageOptions$Builder.mergeFrom(DescriptorProtos$MessageOptions)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$MessageOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #192 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$MessageOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #196 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MessageOptions)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #203 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MessageOptions)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #207 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$MessageOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #212 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$MessageOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #216 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$MessageOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #218 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$MessageOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #220 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MessageOptions)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #224 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MessageOptions)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #228 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MessageOptions)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #232 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$MessageOptions parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$MessageOptions)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #236 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #57  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$MessageOptions))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$MessageOptions>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #242 <Method boolean GeneratedMessageV3$ExtendableMessage.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$MessageOptions)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$MessageOptions>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasMessageSetWireFormat() == ((DescriptorProtos$MessageOptions) (obj)).hasMessageSetWireFormat())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #245 <Method boolean hasMessageSetWireFormat()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #245 <Method boolean hasMessageSetWireFormat()>
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
		if(hasMessageSetWireFormat())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #245 <Method boolean hasMessageSetWireFormat()>
	//*  31   53:ifeq            78
			if(flag && getMessageSetWireFormat() == ((DescriptorProtos$MessageOptions) (obj)).getMessageSetWireFormat())
	//*  32   56:iload_2         
	//*  33   57:ifeq            76
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #248 <Method boolean getMessageSetWireFormat()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #248 <Method boolean getMessageSetWireFormat()>
	//*  38   68:icmpne          76
				flag1 = true;
	//   39   71:iconst_1        
	//   40   72:istore_3        
			else
	//*  41   73:goto            78
				flag1 = false;
	//   42   76:iconst_0        
	//   43   77:istore_3        
		if(flag1 && hasNoStandardDescriptorAccessor() == ((DescriptorProtos$MessageOptions) (obj)).hasNoStandardDescriptorAccessor())
	//*  44   78:iload_3         
	//*  45   79:ifeq            98
	//*  46   82:aload_0         
	//*  47   83:invokevirtual   #251 <Method boolean hasNoStandardDescriptorAccessor()>
	//*  48   86:aload_1         
	//*  49   87:invokevirtual   #251 <Method boolean hasNoStandardDescriptorAccessor()>
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
		if(hasNoStandardDescriptorAccessor())
	//*  58  102:aload_0         
	//*  59  103:invokevirtual   #251 <Method boolean hasNoStandardDescriptorAccessor()>
	//*  60  106:ifeq            131
			if(flag && getNoStandardDescriptorAccessor() == ((DescriptorProtos$MessageOptions) (obj)).getNoStandardDescriptorAccessor())
	//*  61  109:iload_2         
	//*  62  110:ifeq            129
	//*  63  113:aload_0         
	//*  64  114:invokevirtual   #254 <Method boolean getNoStandardDescriptorAccessor()>
	//*  65  117:aload_1         
	//*  66  118:invokevirtual   #254 <Method boolean getNoStandardDescriptorAccessor()>
	//*  67  121:icmpne          129
				flag1 = true;
	//   68  124:iconst_1        
	//   69  125:istore_3        
			else
	//*  70  126:goto            131
				flag1 = false;
	//   71  129:iconst_0        
	//   72  130:istore_3        
		if(flag1 && hasDeprecated() == ((DescriptorProtos$MessageOptions) (obj)).hasDeprecated())
	//*  73  131:iload_3         
	//*  74  132:ifeq            151
	//*  75  135:aload_0         
	//*  76  136:invokevirtual   #257 <Method boolean hasDeprecated()>
	//*  77  139:aload_1         
	//*  78  140:invokevirtual   #257 <Method boolean hasDeprecated()>
	//*  79  143:icmpne          151
			flag = true;
	//   80  146:iconst_1        
	//   81  147:istore_2        
		else
	//*  82  148:goto            153
			flag = false;
	//   83  151:iconst_0        
	//   84  152:istore_2        
		flag1 = flag;
	//   85  153:iload_2         
	//   86  154:istore_3        
		if(hasDeprecated())
	//*  87  155:aload_0         
	//*  88  156:invokevirtual   #257 <Method boolean hasDeprecated()>
	//*  89  159:ifeq            184
			if(flag && getDeprecated() == ((DescriptorProtos$MessageOptions) (obj)).getDeprecated())
	//*  90  162:iload_2         
	//*  91  163:ifeq            182
	//*  92  166:aload_0         
	//*  93  167:invokevirtual   #260 <Method boolean getDeprecated()>
	//*  94  170:aload_1         
	//*  95  171:invokevirtual   #260 <Method boolean getDeprecated()>
	//*  96  174:icmpne          182
				flag1 = true;
	//   97  177:iconst_1        
	//   98  178:istore_3        
			else
	//*  99  179:goto            184
				flag1 = false;
	//  100  182:iconst_0        
	//  101  183:istore_3        
		if(flag1 && hasMapEntry() == ((DescriptorProtos$MessageOptions) (obj)).hasMapEntry())
	//* 102  184:iload_3         
	//* 103  185:ifeq            204
	//* 104  188:aload_0         
	//* 105  189:invokevirtual   #263 <Method boolean hasMapEntry()>
	//* 106  192:aload_1         
	//* 107  193:invokevirtual   #263 <Method boolean hasMapEntry()>
	//* 108  196:icmpne          204
			flag = true;
	//  109  199:iconst_1        
	//  110  200:istore_2        
		else
	//* 111  201:goto            206
			flag = false;
	//  112  204:iconst_0        
	//  113  205:istore_2        
		flag1 = flag;
	//  114  206:iload_2         
	//  115  207:istore_3        
		if(hasMapEntry())
	//* 116  208:aload_0         
	//* 117  209:invokevirtual   #263 <Method boolean hasMapEntry()>
	//* 118  212:ifeq            237
			if(flag && getMapEntry() == ((DescriptorProtos$MessageOptions) (obj)).getMapEntry())
	//* 119  215:iload_2         
	//* 120  216:ifeq            235
	//* 121  219:aload_0         
	//* 122  220:invokevirtual   #266 <Method boolean getMapEntry()>
	//* 123  223:aload_1         
	//* 124  224:invokevirtual   #266 <Method boolean getMapEntry()>
	//* 125  227:icmpne          235
				flag1 = true;
	//  126  230:iconst_1        
	//  127  231:istore_3        
			else
	//* 128  232:goto            237
				flag1 = false;
	//  129  235:iconst_0        
	//  130  236:istore_3        
		if(flag1 && getUninterpretedOptionList().equals(((Object) (((DescriptorProtos$MessageOptions) (obj)).getUninterpretedOptionList()))))
	//* 131  237:iload_3         
	//* 132  238:ifeq            262
	//* 133  241:aload_0         
	//* 134  242:invokevirtual   #269 <Method List getUninterpretedOptionList()>
	//* 135  245:aload_1         
	//* 136  246:invokevirtual   #269 <Method List getUninterpretedOptionList()>
	//* 137  249:invokeinterface #270 <Method boolean List.equals(Object)>
	//* 138  254:ifeq            262
			flag = true;
	//  139  257:iconst_1        
	//  140  258:istore_2        
		else
	//* 141  259:goto            264
			flag = false;
	//  142  262:iconst_0        
	//  143  263:istore_2        
		if(flag && unknownFields.equals(((Object) (((DescriptorProtos$MessageOptions) (obj)).unknownFields))))
	//* 144  264:iload_2         
	//* 145  265:ifeq            287
	//* 146  268:aload_0         
	//* 147  269:getfield        #137 <Field UnknownFieldSet unknownFields>
	//* 148  272:aload_1         
	//* 149  273:getfield        #137 <Field UnknownFieldSet unknownFields>
	//* 150  276:invokevirtual   #271 <Method boolean UnknownFieldSet.equals(Object)>
	//* 151  279:ifeq            287
			flag = true;
	//  152  282:iconst_1        
	//  153  283:istore_2        
		else
	//* 154  284:goto            289
			flag = false;
	//  155  287:iconst_0        
	//  156  288:istore_2        
		return flag && getExtensionFields().equals(((Object) (((DescriptorProtos$MessageOptions) (obj)).getExtensionFields())));
	//  157  289:iload_2         
	//  158  290:ifeq            311
	//  159  293:aload_0         
	//  160  294:invokevirtual   #275 <Method Map getExtensionFields()>
	//  161  297:aload_1         
	//  162  298:invokevirtual   #275 <Method Map getExtensionFields()>
	//  163  301:invokeinterface #278 <Method boolean Map.equals(Object)>
	//  164  306:ifeq            311
	//  165  309:iconst_1        
	//  166  310:ireturn         
	//  167  311:iconst_0        
	//  168  312:ireturn         
	}

	public DescriptorProtos$MessageOptions getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #54  <Field DescriptorProtos$MessageOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method DescriptorProtos$MessageOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method DescriptorProtos$MessageOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public boolean getMapEntry()
	{
		return mapEntry_;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean mapEntry_>
	//    2    4:ireturn         
	}

	public boolean getMessageSetWireFormat()
	{
		return messageSetWireFormat_;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean messageSetWireFormat_>
	//    2    4:ireturn         
	}

	public boolean getNoStandardDescriptorAccessor()
	{
		return noStandardDescriptorAccessor_;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean noStandardDescriptorAccessor_>
	//    2    4:ireturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #288 <Field int memoizedSize>
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
	//*  11   15:getfield        #103 <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			j = CodedOutputStream.computeBoolSize(1, messageSetWireFormat_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #63  <Field boolean messageSetWireFormat_>
	//   19   29:invokestatic    #294 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_2        
		i = j;
	//   23   35:iload_2         
	//   24   36:istore_1        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #103 <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          58
			i = j + CodedOutputStream.computeBoolSize(2, noStandardDescriptorAccessor_);
	//   31   47:iload_2         
	//   32   48:iconst_2        
	//   33   49:aload_0         
	//   34   50:getfield        #65  <Field boolean noStandardDescriptorAccessor_>
	//   35   53:invokestatic    #294 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   36   56:iadd            
	//   37   57:istore_1        
		j = i;
	//   38   58:iload_1         
	//   39   59:istore_2        
		if((bitField0_ & 4) == 4)
	//*  40   60:aload_0         
	//*  41   61:getfield        #103 <Field int bitField0_>
	//*  42   64:iconst_4        
	//*  43   65:iand            
	//*  44   66:iconst_4        
	//*  45   67:icmpne          81
			j = i + CodedOutputStream.computeBoolSize(3, deprecated_);
	//   46   70:iload_1         
	//   47   71:iconst_3        
	//   48   72:aload_0         
	//   49   73:getfield        #67  <Field boolean deprecated_>
	//   50   76:invokestatic    #294 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   51   79:iadd            
	//   52   80:istore_2        
		i = j;
	//   53   81:iload_2         
	//   54   82:istore_1        
		if((bitField0_ & 8) == 8)
	//*  55   83:aload_0         
	//*  56   84:getfield        #103 <Field int bitField0_>
	//*  57   87:bipush          8
	//*  58   89:iand            
	//*  59   90:bipush          8
	//*  60   92:icmpne          107
			i = j + CodedOutputStream.computeBoolSize(7, mapEntry_);
	//   61   95:iload_2         
	//   62   96:bipush          7
	//   63   98:aload_0         
	//   64   99:getfield        #69  <Field boolean mapEntry_>
	//   65  102:invokestatic    #294 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   66  105:iadd            
	//   67  106:istore_1        
		for(int k = 0; k < uninterpretedOption_.size(); k++)
	//*  68  107:iconst_0        
	//*  69  108:istore_2        
	//*  70  109:iload_2         
	//*  71  110:aload_0         
	//*  72  111:getfield        #77  <Field List uninterpretedOption_>
	//*  73  114:invokeinterface #297 <Method int List.size()>
	//*  74  119:icmpge          151
			i += CodedOutputStream.computeMessageSize(999, (MessageLite)uninterpretedOption_.get(k));
	//   75  122:iload_1         
	//   76  123:sipush          999
	//   77  126:aload_0         
	//   78  127:getfield        #77  <Field List uninterpretedOption_>
	//   79  130:iload_2         
	//   80  131:invokeinterface #301 <Method Object List.get(int)>
	//   81  136:checkcast       #303 <Class MessageLite>
	//   82  139:invokestatic    #307 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   83  142:iadd            
	//   84  143:istore_1        

	//   85  144:iload_2         
	//   86  145:iconst_1        
	//   87  146:iadd            
	//   88  147:istore_2        
	//*  89  148:goto            109
		i = i + extensionsSerializedSize() + unknownFields.getSerializedSize();
	//   90  151:iload_1         
	//   91  152:aload_0         
	//   92  153:invokevirtual   #310 <Method int extensionsSerializedSize()>
	//   93  156:iadd            
	//   94  157:aload_0         
	//   95  158:getfield        #137 <Field UnknownFieldSet unknownFields>
	//   96  161:invokevirtual   #312 <Method int UnknownFieldSet.getSerializedSize()>
	//   97  164:iadd            
	//   98  165:istore_1        
		memoizedSize = i;
	//   99  166:aload_0         
	//  100  167:iload_1         
	//  101  168:putfield        #288 <Field int memoizedSize>
		return i;
	//  102  171:iload_1         
	//  103  172:ireturn         
	}

	public tion getUninterpretedOption(int i)
	{
		return (tion)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #301 <Method Object List.get(int)>
	//    4   10:checkcast       #112 <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		return uninterpretedOption_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List uninterpretedOption_>
	//    2    4:invokeinterface #297 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public tionOrBuilder getUninterpretedOptionOrBuilder(int i)
	{
		return (tionOrBuilder)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #301 <Method Object List.get(int)>
	//    4   10:checkcast       #320 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    5   13:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasDeprecated()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int bitField0_>
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
	//    1    1:getfield        #103 <Field int bitField0_>
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
	//    1    1:getfield        #103 <Field int bitField0_>
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
	//    1    1:getfield        #103 <Field int bitField0_>
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
	//*   1    1:getfield        #327 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #327 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #329 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #333 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasMessageSetWireFormat())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #245 <Method boolean hasMessageSetWireFormat()>
	//*  15   29:ifeq            50
			i = (j * 37 + 1) * 53 + Internal.hashBoolean(getMessageSetWireFormat());
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #248 <Method boolean getMessageSetWireFormat()>
	//   25   45:invokestatic    #339 <Method int Internal.hashBoolean(boolean)>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(hasNoStandardDescriptorAccessor())
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #251 <Method boolean hasNoStandardDescriptorAccessor()>
	//*  32   56:ifeq            77
			j = (i * 37 + 2) * 53 + Internal.hashBoolean(getNoStandardDescriptorAccessor());
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_2        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #254 <Method boolean getNoStandardDescriptorAccessor()>
	//   42   72:invokestatic    #339 <Method int Internal.hashBoolean(boolean)>
	//   43   75:iadd            
	//   44   76:istore_2        
		i = j;
	//   45   77:iload_2         
	//   46   78:istore_1        
		if(hasDeprecated())
	//*  47   79:aload_0         
	//*  48   80:invokevirtual   #257 <Method boolean hasDeprecated()>
	//*  49   83:ifeq            104
			i = (j * 37 + 3) * 53 + Internal.hashBoolean(getDeprecated());
	//   50   86:iload_2         
	//   51   87:bipush          37
	//   52   89:imul            
	//   53   90:iconst_3        
	//   54   91:iadd            
	//   55   92:bipush          53
	//   56   94:imul            
	//   57   95:aload_0         
	//   58   96:invokevirtual   #260 <Method boolean getDeprecated()>
	//   59   99:invokestatic    #339 <Method int Internal.hashBoolean(boolean)>
	//   60  102:iadd            
	//   61  103:istore_1        
		j = i;
	//   62  104:iload_1         
	//   63  105:istore_2        
		if(hasMapEntry())
	//*  64  106:aload_0         
	//*  65  107:invokevirtual   #263 <Method boolean hasMapEntry()>
	//*  66  110:ifeq            132
			j = (i * 37 + 7) * 53 + Internal.hashBoolean(getMapEntry());
	//   67  113:iload_1         
	//   68  114:bipush          37
	//   69  116:imul            
	//   70  117:bipush          7
	//   71  119:iadd            
	//   72  120:bipush          53
	//   73  122:imul            
	//   74  123:aload_0         
	//   75  124:invokevirtual   #266 <Method boolean getMapEntry()>
	//   76  127:invokestatic    #339 <Method int Internal.hashBoolean(boolean)>
	//   77  130:iadd            
	//   78  131:istore_2        
		i = j;
	//   79  132:iload_2         
	//   80  133:istore_1        
		if(getUninterpretedOptionCount() > 0)
	//*  81  134:aload_0         
	//*  82  135:invokevirtual   #341 <Method int getUninterpretedOptionCount()>
	//*  83  138:ifle            163
			i = (j * 37 + 999) * 53 + getUninterpretedOptionList().hashCode();
	//   84  141:iload_2         
	//   85  142:bipush          37
	//   86  144:imul            
	//   87  145:sipush          999
	//   88  148:iadd            
	//   89  149:bipush          53
	//   90  151:imul            
	//   91  152:aload_0         
	//   92  153:invokevirtual   #269 <Method List getUninterpretedOptionList()>
	//   93  156:invokeinterface #342 <Method int List.hashCode()>
	//   94  161:iadd            
	//   95  162:istore_1        
		i = hashFields(i, getExtensionFields()) * 29 + unknownFields.hashCode();
	//   96  163:iload_1         
	//   97  164:aload_0         
	//   98  165:invokevirtual   #275 <Method Map getExtensionFields()>
	//   99  168:invokestatic    #346 <Method int hashFields(int, Map)>
	//  100  171:bipush          29
	//  101  173:imul            
	//  102  174:aload_0         
	//  103  175:getfield        #137 <Field UnknownFieldSet unknownFields>
	//  104  178:invokevirtual   #347 <Method int UnknownFieldSet.hashCode()>
	//  105  181:iadd            
	//  106  182:istore_1        
		memoizedHashCode = i;
	//  107  183:aload_0         
	//  108  184:iload_1         
	//  109  185:putfield        #327 <Field int memoizedHashCode>
		return i;
	//  110  188:iload_1         
	//  111  189:ireturn         
	}

	protected Table internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$17600().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$MessageOptions, com/google/protobuf/DescriptorProtos$MessageOptions$Builder);
	//    0    0:invokestatic    #352 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$17600()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$MessageOptions>
	//    2    5:ldc1            #14  <Class DescriptorProtos$MessageOptions$Builder>
	//    3    7:invokevirtual   #358 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field byte memoizedIsInitialized>
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
	//*  16   22:invokevirtual   #341 <Method int getUninterpretedOptionCount()>
	//*  17   25:icmpge          53
			if(!getUninterpretedOption(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #361 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*  21   33:invokevirtual   #363 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #61  <Field byte memoizedIsInitialized>
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
	//*  34   54:invokevirtual   #366 <Method boolean extensionsAreInitialized()>
	//*  35   57:ifne            67
		{
			memoizedIsInitialized = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #61  <Field byte memoizedIsInitialized>
			return false;
	//   39   65:iconst_0        
	//   40   66:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   41   67:aload_0         
	//   42   68:iconst_1        
	//   43   69:putfield        #61  <Field byte memoizedIsInitialized>
			return true;
	//   44   72:iconst_1        
	//   45   73:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #369 <Method DescriptorProtos$MessageOptions$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType( )
	{
		return new Builder(, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #14  <Class DescriptorProtos$MessageOptions$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #373 <Method void DescriptorProtos$MessageOptions$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method DescriptorProtos$MessageOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType( )
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #379 <Method DescriptorProtos$MessageOptions$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method DescriptorProtos$MessageOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #54  <Field DescriptorProtos$MessageOptions DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #14  <Class DescriptorProtos$MessageOptions$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #383 <Method void DescriptorProtos$MessageOptions$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #14  <Class DescriptorProtos$MessageOptions$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #383 <Method void DescriptorProtos$MessageOptions$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #184 <Method DescriptorProtos$MessageOptions$Builder DescriptorProtos$MessageOptions$Builder.mergeFrom(DescriptorProtos$MessageOptions)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method DescriptorProtos$MessageOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method DescriptorProtos$MessageOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		sage.ExtensionWriter extensionwriter = newExtensionWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #389 <Method GeneratedMessageV3$ExtendableMessage$ExtensionWriter newExtensionWriter()>
	//    2    4:astore_3        
		if((bitField0_ & 1) == 1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #103 <Field int bitField0_>
	//*   5    9:iconst_1        
	//*   6   10:iand            
	//*   7   11:iconst_1        
	//*   8   12:icmpne          24
			codedoutputstream.writeBool(1, messageSetWireFormat_);
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:aload_0         
	//   12   18:getfield        #63  <Field boolean messageSetWireFormat_>
	//   13   21:invokevirtual   #393 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 2) == 2)
	//*  14   24:aload_0         
	//*  15   25:getfield        #103 <Field int bitField0_>
	//*  16   28:iconst_2        
	//*  17   29:iand            
	//*  18   30:iconst_2        
	//*  19   31:icmpne          43
			codedoutputstream.writeBool(2, noStandardDescriptorAccessor_);
	//   20   34:aload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #65  <Field boolean noStandardDescriptorAccessor_>
	//   24   40:invokevirtual   #393 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 4) == 4)
	//*  25   43:aload_0         
	//*  26   44:getfield        #103 <Field int bitField0_>
	//*  27   47:iconst_4        
	//*  28   48:iand            
	//*  29   49:iconst_4        
	//*  30   50:icmpne          62
			codedoutputstream.writeBool(3, deprecated_);
	//   31   53:aload_1         
	//   32   54:iconst_3        
	//   33   55:aload_0         
	//   34   56:getfield        #67  <Field boolean deprecated_>
	//   35   59:invokevirtual   #393 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 8) == 8)
	//*  36   62:aload_0         
	//*  37   63:getfield        #103 <Field int bitField0_>
	//*  38   66:bipush          8
	//*  39   68:iand            
	//*  40   69:bipush          8
	//*  41   71:icmpne          84
			codedoutputstream.writeBool(7, mapEntry_);
	//   42   74:aload_1         
	//   43   75:bipush          7
	//   44   77:aload_0         
	//   45   78:getfield        #69  <Field boolean mapEntry_>
	//   46   81:invokevirtual   #393 <Method void CodedOutputStream.writeBool(int, boolean)>
		for(int i = 0; i < uninterpretedOption_.size(); i++)
	//*  47   84:iconst_0        
	//*  48   85:istore_2        
	//*  49   86:iload_2         
	//*  50   87:aload_0         
	//*  51   88:getfield        #77  <Field List uninterpretedOption_>
	//*  52   91:invokeinterface #297 <Method int List.size()>
	//*  53   96:icmpge          126
			codedoutputstream.writeMessage(999, (MessageLite)uninterpretedOption_.get(i));
	//   54   99:aload_1         
	//   55  100:sipush          999
	//   56  103:aload_0         
	//   57  104:getfield        #77  <Field List uninterpretedOption_>
	//   58  107:iload_2         
	//   59  108:invokeinterface #301 <Method Object List.get(int)>
	//   60  113:checkcast       #303 <Class MessageLite>
	//   61  116:invokevirtual   #397 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   62  119:iload_2         
	//   63  120:iconst_1        
	//   64  121:iadd            
	//   65  122:istore_2        
	//*  66  123:goto            86
		extensionwriter.writeUntil(0x20000000, codedoutputstream);
	//   67  126:aload_3         
	//   68  127:ldc2            #398 <Int 0x20000000>
	//   69  130:aload_1         
	//   70  131:invokevirtual   #404 <Method void GeneratedMessageV3$ExtendableMessage$ExtensionWriter.writeUntil(int, CodedOutputStream)>
		unknownFields.writeTo(codedoutputstream);
	//   71  134:aload_0         
	//   72  135:getfield        #137 <Field UnknownFieldSet unknownFields>
	//   73  138:aload_1         
	//   74  139:invokevirtual   #406 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   75  142:return          
	}

	private static final DescriptorProtos$MessageOptions DEFAULT_INSTANCE = new DescriptorProtos$MessageOptions();
	public static final int DEPRECATED_FIELD_NUMBER = 3;
	public static final int MAP_ENTRY_FIELD_NUMBER = 7;
	public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
	public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.MessageOptions parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.MessageOptions(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$MessageOptions>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$MessageOptions(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$MessageOptions parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private boolean deprecated_;
	private boolean mapEntry_;
	private byte memoizedIsInitialized;
	private boolean messageSetWireFormat_;
	private boolean noStandardDescriptorAccessor_;
	private List uninterpretedOption_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$MessageOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void DescriptorProtos$MessageOptions()>
	//    3    7:putstatic       #54  <Field DescriptorProtos$MessageOptions DEFAULT_INSTANCE>
	//    4   10:new             #12  <Class DescriptorProtos$MessageOptions$1>
	//    5   13:dup             
	//    6   14:invokespecial   #55  <Method void DescriptorProtos$MessageOptions$1()>
	//    7   17:putstatic       #57  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static boolean access$18002(DescriptorProtos$MessageOptions descriptorprotos$messageoptions, boolean flag)
	{
		descriptorprotos$messageoptions.messageSetWireFormat_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field boolean messageSetWireFormat_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$18102(DescriptorProtos$MessageOptions descriptorprotos$messageoptions, boolean flag)
	{
		descriptorprotos$messageoptions.noStandardDescriptorAccessor_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field boolean noStandardDescriptorAccessor_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$18202(DescriptorProtos$MessageOptions descriptorprotos$messageoptions, boolean flag)
	{
		descriptorprotos$messageoptions.deprecated_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field boolean deprecated_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$18302(DescriptorProtos$MessageOptions descriptorprotos$messageoptions, boolean flag)
	{
		descriptorprotos$messageoptions.mapEntry_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean mapEntry_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static List access$18400(DescriptorProtos$MessageOptions descriptorprotos$messageoptions)
	{
		return descriptorprotos$messageoptions.uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

*/


/*
	static List access$18402(DescriptorProtos$MessageOptions descriptorprotos$messageoptions, List list)
	{
		descriptorprotos$messageoptions.uninterpretedOption_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field List uninterpretedOption_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$18502(DescriptorProtos$MessageOptions descriptorprotos$messageoptions, int i)
	{
		descriptorprotos$messageoptions.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #103 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$MessageOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void GeneratedMessageV3$ExtendableMessage()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #61  <Field byte memoizedIsInitialized>
		messageSetWireFormat_ = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #63  <Field boolean messageSetWireFormat_>
		noStandardDescriptorAccessor_ = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #65  <Field boolean noStandardDescriptorAccessor_>
		deprecated_ = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #67  <Field boolean deprecated_>
		mapEntry_ = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #69  <Field boolean mapEntry_>
		uninterpretedOption_ = Collections.emptyList();
	//   17   29:aload_0         
	//   18   30:invokestatic    #75  <Method List Collections.emptyList()>
	//   19   33:putfield        #77  <Field List uninterpretedOption_>
	//   20   36:return          
	}

	private DescriptorProtos$MessageOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void DescriptorProtos$MessageOptions()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #84  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #85  <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #91  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
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
	//   15   28:ifne            385
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
	//   23   41:invokevirtual   #97  <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		j1;
	//   25   46:iload           9
		JVM INSTR lookupswitch 6: default 485
	//	               0: 488
	//	               8: 142
	//	               16: 184
	//	               24: 226
	//	               56: 268
	//	               7994: 311;
	//   26   48:lookupswitch    6: default 485
	//	               0: 488
	//	               8: 142
	//	               16: 184
	//	               24: 226
	//	               56: 268
	//	               7994: 311
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		int j;
		j = i;
	//   27  108:iload_3         
	//   28  109:istore          4
		l = i;
	//   29  111:iload_3         
	//   30  112:istore          6
		i1 = i;
	//   31  114:iload_3         
	//   32  115:istore          7
		k = i;
	//   33  117:iload_3         
	//   34  118:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, j1))
	//*  35  120:aload_0         
	//*  36  121:aload_1         
	//*  37  122:aload           10
	//*  38  124:aload_2         
	//*  39  125:iload           9
	//*  40  127:invokevirtual   #101 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  130:ifne            379
		{
			flag = true;
	//   42  133:iconst_1        
	//   43  134:istore          8
			j = i;
	//   44  136:iload_3         
	//   45  137:istore          4
		}
		  goto _L8
	//*  46  139:goto            379
_L3:
		l = i;
	//   47  142:iload_3         
	//   48  143:istore          6
		i1 = i;
	//   49  145:iload_3         
	//   50  146:istore          7
		k = i;
	//   51  148:iload_3         
	//   52  149:istore          5
		bitField0_ = bitField0_ | 1;
	//   53  151:aload_0         
	//   54  152:aload_0         
	//   55  153:getfield        #103 <Field int bitField0_>
	//   56  156:iconst_1        
	//   57  157:ior             
	//   58  158:putfield        #103 <Field int bitField0_>
		l = i;
	//   59  161:iload_3         
	//   60  162:istore          6
		i1 = i;
	//   61  164:iload_3         
	//   62  165:istore          7
		k = i;
	//   63  167:iload_3         
	//   64  168:istore          5
		messageSetWireFormat_ = codedinputstream.readBool();
	//   65  170:aload_0         
	//   66  171:aload_1         
	//   67  172:invokevirtual   #107 <Method boolean CodedInputStream.readBool()>
	//   68  175:putfield        #63  <Field boolean messageSetWireFormat_>
		j = i;
	//   69  178:iload_3         
	//   70  179:istore          4
		  goto _L8
	//*  71  181:goto            379
_L4:
		l = i;
	//   72  184:iload_3         
	//   73  185:istore          6
		i1 = i;
	//   74  187:iload_3         
	//   75  188:istore          7
		k = i;
	//   76  190:iload_3         
	//   77  191:istore          5
		bitField0_ = bitField0_ | 2;
	//   78  193:aload_0         
	//   79  194:aload_0         
	//   80  195:getfield        #103 <Field int bitField0_>
	//   81  198:iconst_2        
	//   82  199:ior             
	//   83  200:putfield        #103 <Field int bitField0_>
		l = i;
	//   84  203:iload_3         
	//   85  204:istore          6
		i1 = i;
	//   86  206:iload_3         
	//   87  207:istore          7
		k = i;
	//   88  209:iload_3         
	//   89  210:istore          5
		noStandardDescriptorAccessor_ = codedinputstream.readBool();
	//   90  212:aload_0         
	//   91  213:aload_1         
	//   92  214:invokevirtual   #107 <Method boolean CodedInputStream.readBool()>
	//   93  217:putfield        #65  <Field boolean noStandardDescriptorAccessor_>
		j = i;
	//   94  220:iload_3         
	//   95  221:istore          4
		  goto _L8
	//*  96  223:goto            379
_L5:
		l = i;
	//   97  226:iload_3         
	//   98  227:istore          6
		i1 = i;
	//   99  229:iload_3         
	//  100  230:istore          7
		k = i;
	//  101  232:iload_3         
	//  102  233:istore          5
		bitField0_ = bitField0_ | 4;
	//  103  235:aload_0         
	//  104  236:aload_0         
	//  105  237:getfield        #103 <Field int bitField0_>
	//  106  240:iconst_4        
	//  107  241:ior             
	//  108  242:putfield        #103 <Field int bitField0_>
		l = i;
	//  109  245:iload_3         
	//  110  246:istore          6
		i1 = i;
	//  111  248:iload_3         
	//  112  249:istore          7
		k = i;
	//  113  251:iload_3         
	//  114  252:istore          5
		deprecated_ = codedinputstream.readBool();
	//  115  254:aload_0         
	//  116  255:aload_1         
	//  117  256:invokevirtual   #107 <Method boolean CodedInputStream.readBool()>
	//  118  259:putfield        #67  <Field boolean deprecated_>
		j = i;
	//  119  262:iload_3         
	//  120  263:istore          4
		  goto _L8
	//* 121  265:goto            379
_L6:
		l = i;
	//  122  268:iload_3         
	//  123  269:istore          6
		i1 = i;
	//  124  271:iload_3         
	//  125  272:istore          7
		k = i;
	//  126  274:iload_3         
	//  127  275:istore          5
		bitField0_ = bitField0_ | 8;
	//  128  277:aload_0         
	//  129  278:aload_0         
	//  130  279:getfield        #103 <Field int bitField0_>
	//  131  282:bipush          8
	//  132  284:ior             
	//  133  285:putfield        #103 <Field int bitField0_>
		l = i;
	//  134  288:iload_3         
	//  135  289:istore          6
		i1 = i;
	//  136  291:iload_3         
	//  137  292:istore          7
		k = i;
	//  138  294:iload_3         
	//  139  295:istore          5
		mapEntry_ = codedinputstream.readBool();
	//  140  297:aload_0         
	//  141  298:aload_1         
	//  142  299:invokevirtual   #107 <Method boolean CodedInputStream.readBool()>
	//  143  302:putfield        #69  <Field boolean mapEntry_>
		j = i;
	//  144  305:iload_3         
	//  145  306:istore          4
		  goto _L8
	//* 146  308:goto            379
_L7:
		j = i;
	//  147  311:iload_3         
	//  148  312:istore          4
		if((i & 0x10) == 16) goto _L10; else goto _L9
	//  149  314:iload_3         
	//  150  315:bipush          16
	//  151  317:iand            
	//  152  318:bipush          16
	//  153  320:icmpeq          349
_L9:
		l = i;
	//  154  323:iload_3         
	//  155  324:istore          6
		i1 = i;
	//  156  326:iload_3         
	//  157  327:istore          7
		k = i;
	//  158  329:iload_3         
	//  159  330:istore          5
		uninterpretedOption_ = ((List) (new ArrayList()));
	//  160  332:aload_0         
	//  161  333:new             #109 <Class ArrayList>
	//  162  336:dup             
	//  163  337:invokespecial   #110 <Method void ArrayList()>
	//  164  340:putfield        #77  <Field List uninterpretedOption_>
		j = i | 0x10;
	//  165  343:iload_3         
	//  166  344:bipush          16
	//  167  346:ior             
	//  168  347:istore          4
_L10:
		l = j;
	//  169  349:iload           4
	//  170  351:istore          6
		i1 = j;
	//  171  353:iload           4
	//  172  355:istore          7
		k = j;
	//  173  357:iload           4
	//  174  359:istore          5
		uninterpretedOption_.add(((Object) (codedinputstream.readMessage(tion.PARSER, extensionregistrylite))));
	//  175  361:aload_0         
	//  176  362:getfield        #77  <Field List uninterpretedOption_>
	//  177  365:aload_1         
	//  178  366:getstatic       #113 <Field Parser DescriptorProtos$UninterpretedOption.PARSER>
	//  179  369:aload_2         
	//  180  370:invokevirtual   #117 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  181  373:invokeinterface #123 <Method boolean List.add(Object)>
	//  182  378:pop             
_L8:
		i = j;
	//  183  379:iload           4
	//  184  381:istore_3        
		if(true) goto _L12; else goto _L11
	//  185  382:goto            26
_L11:
		if((i & 0x10) == 16)
	//* 186  385:iload_3         
	//* 187  386:bipush          16
	//* 188  388:iand            
	//* 189  389:bipush          16
	//* 190  391:icmpne          405
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  191  394:aload_0         
	//  192  395:aload_0         
	//  193  396:getfield        #77  <Field List uninterpretedOption_>
	//  194  399:invokestatic    #127 <Method List Collections.unmodifiableList(List)>
	//  195  402:putfield        #77  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  196  405:aload_0         
	//  197  406:aload           10
	//  198  408:invokevirtual   #133 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  199  411:putfield        #137 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  200  414:aload_0         
	//  201  415:invokevirtual   #140 <Method void makeExtensionsImmutable()>
		return;
	//  202  418:return          
		codedinputstream;
	//  203  419:astore_1        
		k = l;
	//  204  420:iload           6
	//  205  422:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  206  424:aload_1         
	//  207  425:aload_0         
	//  208  426:invokevirtual   #144 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  209  429:athrow          
		codedinputstream;
	//  210  430:astore_1        
		k = i1;
	//  211  431:iload           7
	//  212  433:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  213  435:new             #80  <Class InvalidProtocolBufferException>
	//  214  438:dup             
	//  215  439:aload_1         
	//  216  440:invokespecial   #147 <Method void InvalidProtocolBufferException(IOException)>
	//  217  443:aload_0         
	//  218  444:invokevirtual   #144 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  219  447:athrow          
		codedinputstream;
	//  220  448:astore_1        
		if((k & 0x10) == 16)
	//* 221  449:iload           5
	//* 222  451:bipush          16
	//* 223  453:iand            
	//* 224  454:bipush          16
	//* 225  456:icmpne          470
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  226  459:aload_0         
	//  227  460:aload_0         
	//  228  461:getfield        #77  <Field List uninterpretedOption_>
	//  229  464:invokestatic    #127 <Method List Collections.unmodifiableList(List)>
	//  230  467:putfield        #77  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  231  470:aload_0         
	//  232  471:aload           10
	//  233  473:invokevirtual   #133 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  234  476:putfield        #137 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  235  479:aload_0         
	//  236  480:invokevirtual   #140 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  237  483:aload_1         
	//  238  484:athrow          
	//* 239  485:goto            108
_L2:
		flag = true;
	//  240  488:iconst_1        
	//  241  489:istore          8
		j = i;
	//  242  491:iload_3         
	//  243  492:istore          4
		  goto _L8
	//* 244  494:goto            379
	}

	DescriptorProtos$MessageOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #151 <Method void DescriptorProtos$MessageOptions(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$MessageOptions(lder lder)
	{
		super(lder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #154 <Method void GeneratedMessageV3$ExtendableMessage(GeneratedMessageV3$ExtendableBuilder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #61  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$MessageOptions(lder lder, DescriptorProtos._cls1 _pcls1)
	{
		this(lder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method void DescriptorProtos$MessageOptions(GeneratedMessageV3$ExtendableBuilder)>
	//    3    5:return          
	}
}
