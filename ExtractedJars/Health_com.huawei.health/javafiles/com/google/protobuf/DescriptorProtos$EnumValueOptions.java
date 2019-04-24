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

public static final class DescriptorProtos$EnumValueOptions extends ge
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.ExtendableBuilder
		implements DescriptorProtos.EnumValueOptionsOrBuilder
	{

		private void ensureUninterpretedOptionIsMutable()
		{
			if((bitField0_ & 2) != 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #49  <Field int bitField0_>
		//*   2    4:iconst_2        
		//*   3    5:iand            
		//*   4    6:iconst_2        
		//*   5    7:icmpeq          35
			{
				uninterpretedOption_ = ((List) (new ArrayList(((java.util.Collection) (uninterpretedOption_)))));
		//    6   10:aload_0         
		//    7   11:new             #51  <Class ArrayList>
		//    8   14:dup             
		//    9   15:aload_0         
		//   10   16:getfield        #35  <Field List uninterpretedOption_>
		//   11   19:invokespecial   #54  <Method void ArrayList(java.util.Collection)>
		//   12   22:putfield        #35  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ | 2;
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:getfield        #49  <Field int bitField0_>
		//   16   30:iconst_2        
		//   17   31:ior             
		//   18   32:putfield        #49  <Field int bitField0_>
			}
		//   19   35:return          
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$21800();
		//    0    0:invokestatic    #59  <Method Descriptors$Descriptor DescriptorProtos.access$21800()>
		//    1    3:areturn         
		}

		private RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       55
			{
				List list = uninterpretedOption_;
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field List uninterpretedOption_>
		//    5   11:astore_2        
				boolean flag;
				if((bitField0_ & 2) == 2)
		//*   6   12:aload_0         
		//*   7   13:getfield        #49  <Field int bitField0_>
		//*   8   16:iconst_2        
		//*   9   17:iand            
		//*  10   18:iconst_2        
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
		//   18   30:new             #65  <Class RepeatedFieldBuilderV3>
		//   19   33:dup             
		//   20   34:aload_2         
		//   21   35:iload_1         
		//   22   36:aload_0         
		//   23   37:invokevirtual   #69  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   24   40:aload_0         
		//   25   41:invokevirtual   #73  <Method boolean isClean()>
		//   26   44:invokespecial   #76  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
		//   27   47:putfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				uninterpretedOption_ = null;
		//   28   50:aload_0         
		//   29   51:aconst_null     
		//   30   52:putfield        #35  <Field List uninterpretedOption_>
			}
			return uninterpretedOptionBuilder_;
		//   31   55:aload_0         
		//   32   56:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   33   59:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #83  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            11
				getUninterpretedOptionFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #85  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    4   10:pop             
		//    5   11:return          
		}

		public Builder addAllUninterpretedOption(Iterable iterable)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #89  <Method void ensureUninterpretedOptionIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, uninterpretedOption_);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field List uninterpretedOption_>
		//    8   16:invokestatic    #95  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
				onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #98  <Method void onChanged()>
				return this;
		//   11   23:aload_0         
		//   12   24:areturn         
			} else
			{
				uninterpretedOptionBuilder_.addAllMessages(iterable);
		//   13   25:aload_0         
		//   14   26:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #102 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
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
		//    3    3:invokespecial   #108 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (addExtension(generatedextension, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #111 <Method DescriptorProtos$EnumValueOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:areturn         
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #116 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #119 <Method DescriptorProtos$EnumValueOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #119 <Method DescriptorProtos$EnumValueOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #119 <Method DescriptorProtos$EnumValueOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #89  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #35  <Field List uninterpretedOption_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #128 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   10   20:invokeinterface #134 <Method void List.add(int, Object)>
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #98  <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   17   35:iload_1         
		//   18   36:aload_2         
		//   19   37:invokevirtual   #128 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   20   40:invokevirtual   #138 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
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
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(uninterpretedoption == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #141 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #142 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureUninterpretedOptionIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #89  <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.add(i, ((Object) (uninterpretedoption)));
		//   11   23:aload_0         
		//   12   24:getfield        #35  <Field List uninterpretedOption_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #134 <Method void List.add(int, Object)>
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #98  <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (uninterpretedoption)));
		//   20   40:aload_0         
		//   21   41:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   22   44:iload_1         
		//   23   45:aload_2         
		//   24   46:invokevirtual   #138 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
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
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #89  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #35  <Field List uninterpretedOption_>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #128 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//    9   19:invokeinterface #146 <Method boolean List.add(Object)>
		//   10   24:pop             
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #98  <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #128 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   19   39:invokevirtual   #149 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
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
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(uninterpretedoption == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #141 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #142 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureUninterpretedOptionIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #89  <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.add(((Object) (uninterpretedoption)));
		//   11   23:aload_0         
		//   12   24:getfield        #35  <Field List uninterpretedOption_>
		//   13   27:aload_1         
		//   14   28:invokeinterface #146 <Method boolean List.add(Object)>
		//   15   33:pop             
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #98  <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (uninterpretedoption)));
		//   20   40:aload_0         
		//   21   41:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   22   44:aload_1         
		//   23   45:invokevirtual   #149 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
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
		//    1    1:invokespecial   #85  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:invokestatic    #157 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    3    7:invokevirtual   #161 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #124 <Class DescriptorProtos$UninterpretedOption$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #85  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #157 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    4    8:invokevirtual   #165 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #124 <Class DescriptorProtos$UninterpretedOption$Builder>
		//    6   14:areturn         
		}

		public DescriptorProtos.EnumValueOptions build()
		{
			DescriptorProtos.EnumValueOptions enumvalueoptions = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #169 <Method DescriptorProtos$EnumValueOptions buildPartial()>
		//    2    4:astore_1        
			if(!enumvalueoptions.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #172 <Method boolean DescriptorProtos$EnumValueOptions.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (enumvalueoptions)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #176 <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return enumvalueoptions;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #179 <Method DescriptorProtos$EnumValueOptions build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #179 <Method DescriptorProtos$EnumValueOptions build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.EnumValueOptions buildPartial()
		{
			DescriptorProtos.EnumValueOptions enumvalueoptions = new DescriptorProtos.EnumValueOptions(((GeneratedMessageV3.ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #9   <Class DescriptorProtos$EnumValueOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #183 <Method void DescriptorProtos$EnumValueOptions(GeneratedMessageV3$ExtendableBuilder, DescriptorProtos$1)>
		//    5    9:astore_3        
			int j = bitField0_;
		//    6   10:aload_0         
		//    7   11:getfield        #49  <Field int bitField0_>
		//    8   14:istore_2        
			int i = 0;
		//    9   15:iconst_0        
		//   10   16:istore_1        
			if((j & 1) == 1)
		//*  11   17:iload_2         
		//*  12   18:iconst_1        
		//*  13   19:iand            
		//*  14   20:iconst_1        
		//*  15   21:icmpne          26
				i = 1;
		//   16   24:iconst_1        
		//   17   25:istore_1        
			enumvalueoptions.deprecated_ = deprecated_;
		//   18   26:aload_3         
		//   19   27:aload_0         
		//   20   28:getfield        #185 <Field boolean deprecated_>
		//   21   31:invokestatic    #189 <Method boolean DescriptorProtos$EnumValueOptions.access$22302(DescriptorProtos$EnumValueOptions, boolean)>
		//   22   34:pop             
			if(uninterpretedOptionBuilder_ == null)
		//*  23   35:aload_0         
		//*  24   36:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*  25   39:ifnonnull       86
			{
				if((bitField0_ & 2) == 2)
		//*  26   42:aload_0         
		//*  27   43:getfield        #49  <Field int bitField0_>
		//*  28   46:iconst_2        
		//*  29   47:iand            
		//*  30   48:iconst_2        
		//*  31   49:icmpne          74
				{
					uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
		//   32   52:aload_0         
		//   33   53:aload_0         
		//   34   54:getfield        #35  <Field List uninterpretedOption_>
		//   35   57:invokestatic    #193 <Method List Collections.unmodifiableList(List)>
		//   36   60:putfield        #35  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & -3;
		//   37   63:aload_0         
		//   38   64:aload_0         
		//   39   65:getfield        #49  <Field int bitField0_>
		//   40   68:bipush          -3
		//   41   70:iand            
		//   42   71:putfield        #49  <Field int bitField0_>
				}
				enumvalueoptions.uninterpretedOption_ = uninterpretedOption_;
		//   43   74:aload_3         
		//   44   75:aload_0         
		//   45   76:getfield        #35  <Field List uninterpretedOption_>
		//   46   79:invokestatic    #197 <Method List DescriptorProtos$EnumValueOptions.access$22402(DescriptorProtos$EnumValueOptions, List)>
		//   47   82:pop             
			} else
		//*  48   83:goto            98
			{
				enumvalueoptions.uninterpretedOption_ = uninterpretedOptionBuilder_.build();
		//   49   86:aload_3         
		//   50   87:aload_0         
		//   51   88:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   52   91:invokevirtual   #199 <Method List RepeatedFieldBuilderV3.build()>
		//   53   94:invokestatic    #197 <Method List DescriptorProtos$EnumValueOptions.access$22402(DescriptorProtos$EnumValueOptions, List)>
		//   54   97:pop             
			}
			enumvalueoptions.bitField0_ = i;
		//   55   98:aload_3         
		//   56   99:iload_1         
		//   57  100:invokestatic    #203 <Method int DescriptorProtos$EnumValueOptions.access$22502(DescriptorProtos$EnumValueOptions, int)>
		//   58  103:pop             
			onBuilt();
		//   59  104:aload_0         
		//   60  105:invokevirtual   #206 <Method void onBuilt()>
			return enumvalueoptions;
		//   61  108:aload_3         
		//   62  109:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #169 <Method DescriptorProtos$EnumValueOptions buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #169 <Method DescriptorProtos$EnumValueOptions buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #211 <Method DescriptorProtos$EnumValueOptions$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #214 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clear()>
		//    2    4:pop             
			deprecated_ = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #185 <Field boolean deprecated_>
			bitField0_ = bitField0_ & -2;
		//    6   10:aload_0         
		//    7   11:aload_0         
		//    8   12:getfield        #49  <Field int bitField0_>
		//    9   15:bipush          -2
		//   10   17:iand            
		//   11   18:putfield        #49  <Field int bitField0_>
			if(uninterpretedOptionBuilder_ == null)
		//*  12   21:aload_0         
		//*  13   22:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*  14   25:ifnonnull       48
			{
				uninterpretedOption_ = Collections.emptyList();
		//   15   28:aload_0         
		//   16   29:invokestatic    #33  <Method List Collections.emptyList()>
		//   17   32:putfield        #35  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & -3;
		//   18   35:aload_0         
		//   19   36:aload_0         
		//   20   37:getfield        #49  <Field int bitField0_>
		//   21   40:bipush          -3
		//   22   42:iand            
		//   23   43:putfield        #49  <Field int bitField0_>
				return this;
		//   24   46:aload_0         
		//   25   47:areturn         
			} else
			{
				uninterpretedOptionBuilder_.clear();
		//   26   48:aload_0         
		//   27   49:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   28   52:invokevirtual   #216 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   29   55:aload_0         
		//   30   56:areturn         
			}
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #211 <Method DescriptorProtos$EnumValueOptions$Builder clear()>
		//    2    4:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clear()
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #211 <Method DescriptorProtos$EnumValueOptions$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #211 <Method DescriptorProtos$EnumValueOptions$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #211 <Method DescriptorProtos$EnumValueOptions$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearDeprecated()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #49  <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #49  <Field int bitField0_>
			deprecated_ = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #185 <Field boolean deprecated_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #98  <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return (Builder)super.clearExtension(generatedextension);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #225 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clearExtension(generatedextension)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #228 <Method DescriptorProtos$EnumValueOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
		//    3    5:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #233 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #236 <Method DescriptorProtos$EnumValueOptions$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #236 <Method DescriptorProtos$EnumValueOptions$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #236 <Method DescriptorProtos$EnumValueOptions$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #242 <Method DescriptorProtos$EnumValueOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #245 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #242 <Method DescriptorProtos$EnumValueOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #242 <Method DescriptorProtos$EnumValueOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearUninterpretedOption()
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       31
			{
				uninterpretedOption_ = Collections.emptyList();
		//    3    7:aload_0         
		//    4    8:invokestatic    #33  <Method List Collections.emptyList()>
		//    5   11:putfield        #35  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & -3;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #49  <Field int bitField0_>
		//    9   19:bipush          -3
		//   10   21:iand            
		//   11   22:putfield        #49  <Field int bitField0_>
				onChanged();
		//   12   25:aload_0         
		//   13   26:invokevirtual   #98  <Method void onChanged()>
				return this;
		//   14   29:aload_0         
		//   15   30:areturn         
			} else
			{
				uninterpretedOptionBuilder_.clear();
		//   16   31:aload_0         
		//   17   32:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   18   35:invokevirtual   #216 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   19   38:aload_0         
		//   20   39:areturn         
			}
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #250 <Method DescriptorProtos$EnumValueOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #250 <Method DescriptorProtos$EnumValueOptions$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #253 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #250 <Method DescriptorProtos$EnumValueOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #250 <Method DescriptorProtos$EnumValueOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #250 <Method DescriptorProtos$EnumValueOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #250 <Method DescriptorProtos$EnumValueOptions$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.EnumValueOptions getDefaultInstanceForType()
		{
			return DescriptorProtos.EnumValueOptions.getDefaultInstance();
		//    0    0:invokestatic    #260 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #262 <Method DescriptorProtos$EnumValueOptions getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #262 <Method DescriptorProtos$EnumValueOptions getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public boolean getDeprecated()
		{
			return deprecated_;
		//    0    0:aload_0         
		//    1    1:getfield        #185 <Field boolean deprecated_>
		//    2    4:ireturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$21800();
		//    0    0:invokestatic    #59  <Method Descriptors$Descriptor DescriptorProtos.access$21800()>
		//    1    3:areturn         
		}

		public DescriptorProtos.UninterpretedOption getUninterpretedOption(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.UninterpretedOption)uninterpretedOption_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field List uninterpretedOption_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #270 <Method Object List.get(int)>
		//    7   17:checkcast       #154 <Class DescriptorProtos$UninterpretedOption>
		//    8   20:areturn         
			else
				return (DescriptorProtos.UninterpretedOption)uninterpretedOptionBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #274 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #154 <Class DescriptorProtos$UninterpretedOption>
		//   14   32:areturn         
		}

		public DescriptorProtos.UninterpretedOption.Builder getUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().getBuilder(i);
		//    0    0:aload_0         
		//    1    1:invokespecial   #85  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #279 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
		//    4    8:checkcast       #124 <Class DescriptorProtos$UninterpretedOption$Builder>
		//    5   11:areturn         
		}

		public List getUninterpretedOptionBuilderList()
		{
			return getUninterpretedOptionFieldBuilder().getBuilderList();
		//    0    0:aload_0         
		//    1    1:invokespecial   #85  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:invokevirtual   #283 <Method List RepeatedFieldBuilderV3.getBuilderList()>
		//    3    7:areturn         
		}

		public int getUninterpretedOptionCount()
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       17
				return uninterpretedOption_.size();
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field List uninterpretedOption_>
		//    5   11:invokeinterface #289 <Method int List.size()>
		//    6   16:ireturn         
			else
				return uninterpretedOptionBuilder_.getCount();
		//    7   17:aload_0         
		//    8   18:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//    9   21:invokevirtual   #292 <Method int RepeatedFieldBuilderV3.getCount()>
		//   10   24:ireturn         
		}

		public List getUninterpretedOptionList()
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       15
				return Collections.unmodifiableList(uninterpretedOption_);
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field List uninterpretedOption_>
		//    5   11:invokestatic    #193 <Method List Collections.unmodifiableList(List)>
		//    6   14:areturn         
			else
				return uninterpretedOptionBuilder_.getMessageList();
		//    7   15:aload_0         
		//    8   16:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//    9   19:invokevirtual   #296 <Method List RepeatedFieldBuilderV3.getMessageList()>
		//   10   22:areturn         
		}

		public DescriptorProtos.UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOption_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field List uninterpretedOption_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #270 <Method Object List.get(int)>
		//    7   17:checkcast       #301 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
		//    9   21:aload_0         
		//   10   22:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #305 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
		//   13   29:checkcast       #301 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
		//   14   32:areturn         
		}

		public List getUninterpretedOptionOrBuilderList()
		{
			if(uninterpretedOptionBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnull          15
				return uninterpretedOptionBuilder_.getMessageOrBuilderList();
		//    3    7:aload_0         
		//    4    8:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//    5   11:invokevirtual   #309 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
		//    6   14:areturn         
			else
				return Collections.unmodifiableList(uninterpretedOption_);
		//    7   15:aload_0         
		//    8   16:getfield        #35  <Field List uninterpretedOption_>
		//    9   19:invokestatic    #193 <Method List Collections.unmodifiableList(List)>
		//   10   22:areturn         
		}

		public boolean hasDeprecated()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int bitField0_>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$21900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumValueOptions, com/google/protobuf/DescriptorProtos$EnumValueOptions$Builder);
		//    0    0:invokestatic    #316 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$21900()>
		//    1    3:ldc1            #9   <Class DescriptorProtos$EnumValueOptions>
		//    2    5:ldc1            #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    3    7:invokevirtual   #322 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			for(int i = 0; i < getUninterpretedOptionCount(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_1        
		//*   2    2:iload_1         
		//*   3    3:aload_0         
		//*   4    4:invokevirtual   #324 <Method int getUninterpretedOptionCount()>
		//*   5    7:icmpge          30
				if(!getUninterpretedOption(i).isInitialized())
		//*   6   10:aload_0         
		//*   7   11:iload_1         
		//*   8   12:invokevirtual   #326 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
		//*   9   15:invokevirtual   #327 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
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
		//   19   31:invokevirtual   #330 <Method boolean extensionsAreInitialized()>
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
		//    3    3:invokevirtual   #337 <Method DescriptorProtos$EnumValueOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #341 <Method DescriptorProtos$EnumValueOptions$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #337 <Method DescriptorProtos$EnumValueOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumValueOptions)DescriptorProtos.EnumValueOptions.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #348 <Field Parser DescriptorProtos$EnumValueOptions.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #354 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class DescriptorProtos$EnumValueOptions>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.EnumValueOptions) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #357 <Method DescriptorProtos$EnumValueOptions$Builder mergeFrom(DescriptorProtos$EnumValueOptions)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #360 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class DescriptorProtos$EnumValueOptions>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #364 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #357 <Method DescriptorProtos$EnumValueOptions$Builder mergeFrom(DescriptorProtos$EnumValueOptions)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumValueOptions)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.EnumValueOptions) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.EnumValueOptions enumvalueoptions)
		{
			if(enumvalueoptions == DescriptorProtos.EnumValueOptions.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #260 <Method DescriptorProtos$EnumValueOptions DescriptorProtos$EnumValueOptions.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(enumvalueoptions.hasDeprecated())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #366 <Method boolean DescriptorProtos$EnumValueOptions.hasDeprecated()>
		//*   7   13:ifeq            25
				setDeprecated(enumvalueoptions.getDeprecated());
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #368 <Method boolean DescriptorProtos$EnumValueOptions.getDeprecated()>
		//   11   21:invokevirtual   #372 <Method DescriptorProtos$EnumValueOptions$Builder setDeprecated(boolean)>
		//   12   24:pop             
			if(uninterpretedOptionBuilder_ == null)
		//*  13   25:aload_0         
		//*  14   26:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*  15   29:ifnonnull       103
			{
				if(!enumvalueoptions.uninterpretedOption_.isEmpty())
		//*  16   32:aload_1         
		//*  17   33:invokestatic    #376 <Method List DescriptorProtos$EnumValueOptions.access$22400(DescriptorProtos$EnumValueOptions)>
		//*  18   36:invokeinterface #379 <Method boolean List.isEmpty()>
		//*  19   41:ifne            192
				{
					if(uninterpretedOption_.isEmpty())
		//*  20   44:aload_0         
		//*  21   45:getfield        #35  <Field List uninterpretedOption_>
		//*  22   48:invokeinterface #379 <Method boolean List.isEmpty()>
		//*  23   53:ifeq            78
					{
						uninterpretedOption_ = enumvalueoptions.uninterpretedOption_;
		//   24   56:aload_0         
		//   25   57:aload_1         
		//   26   58:invokestatic    #376 <Method List DescriptorProtos$EnumValueOptions.access$22400(DescriptorProtos$EnumValueOptions)>
		//   27   61:putfield        #35  <Field List uninterpretedOption_>
						bitField0_ = bitField0_ & -3;
		//   28   64:aload_0         
		//   29   65:aload_0         
		//   30   66:getfield        #49  <Field int bitField0_>
		//   31   69:bipush          -3
		//   32   71:iand            
		//   33   72:putfield        #49  <Field int bitField0_>
					} else
		//*  34   75:goto            96
					{
						ensureUninterpretedOptionIsMutable();
		//   35   78:aload_0         
		//   36   79:invokespecial   #89  <Method void ensureUninterpretedOptionIsMutable()>
						uninterpretedOption_.addAll(((java.util.Collection) (enumvalueoptions.uninterpretedOption_)));
		//   37   82:aload_0         
		//   38   83:getfield        #35  <Field List uninterpretedOption_>
		//   39   86:aload_1         
		//   40   87:invokestatic    #376 <Method List DescriptorProtos$EnumValueOptions.access$22400(DescriptorProtos$EnumValueOptions)>
		//   41   90:invokeinterface #382 <Method boolean List.addAll(java.util.Collection)>
		//   42   95:pop             
					}
					onChanged();
		//   43   96:aload_0         
		//   44   97:invokevirtual   #98  <Method void onChanged()>
				}
			} else
		//*  45  100:goto            192
			if(!enumvalueoptions.uninterpretedOption_.isEmpty())
		//*  46  103:aload_1         
		//*  47  104:invokestatic    #376 <Method List DescriptorProtos$EnumValueOptions.access$22400(DescriptorProtos$EnumValueOptions)>
		//*  48  107:invokeinterface #379 <Method boolean List.isEmpty()>
		//*  49  112:ifne            192
				if(uninterpretedOptionBuilder_.isEmpty())
		//*  50  115:aload_0         
		//*  51  116:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*  52  119:invokevirtual   #383 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
		//*  53  122:ifeq            180
				{
					uninterpretedOptionBuilder_.dispose();
		//   54  125:aload_0         
		//   55  126:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   56  129:invokevirtual   #386 <Method void RepeatedFieldBuilderV3.dispose()>
					uninterpretedOptionBuilder_ = null;
		//   57  132:aload_0         
		//   58  133:aconst_null     
		//   59  134:putfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
					uninterpretedOption_ = enumvalueoptions.uninterpretedOption_;
		//   60  137:aload_0         
		//   61  138:aload_1         
		//   62  139:invokestatic    #376 <Method List DescriptorProtos$EnumValueOptions.access$22400(DescriptorProtos$EnumValueOptions)>
		//   63  142:putfield        #35  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & -3;
		//   64  145:aload_0         
		//   65  146:aload_0         
		//   66  147:getfield        #49  <Field int bitField0_>
		//   67  150:bipush          -3
		//   68  152:iand            
		//   69  153:putfield        #49  <Field int bitField0_>
					RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
					if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*  70  156:getstatic       #83  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*  71  159:ifeq            170
						repeatedfieldbuilderv3 = getUninterpretedOptionFieldBuilder();
		//   72  162:aload_0         
		//   73  163:invokespecial   #85  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//   74  166:astore_2        
					else
		//*  75  167:goto            172
						repeatedfieldbuilderv3 = null;
		//   76  170:aconst_null     
		//   77  171:astore_2        
					uninterpretedOptionBuilder_ = repeatedfieldbuilderv3;
		//   78  172:aload_0         
		//   79  173:aload_2         
		//   80  174:putfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				} else
		//*  81  177:goto            192
				{
					uninterpretedOptionBuilder_.addAllMessages(((Iterable) (enumvalueoptions.uninterpretedOption_)));
		//   82  180:aload_0         
		//   83  181:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   84  184:aload_1         
		//   85  185:invokestatic    #376 <Method List DescriptorProtos$EnumValueOptions.access$22400(DescriptorProtos$EnumValueOptions)>
		//   86  188:invokevirtual   #102 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   87  191:pop             
				}
			mergeExtensionFields(((GeneratedMessageV3.ExtendableMessage) (enumvalueoptions)));
		//   88  192:aload_0         
		//   89  193:aload_1         
		//   90  194:invokevirtual   #390 <Method void mergeExtensionFields(GeneratedMessageV3$ExtendableMessage)>
			mergeUnknownFields(enumvalueoptions.unknownFields);
		//   91  197:aload_0         
		//   92  198:aload_1         
		//   93  199:getfield        #394 <Field UnknownFieldSet DescriptorProtos$EnumValueOptions.unknownFields>
		//   94  202:invokevirtual   #398 <Method DescriptorProtos$EnumValueOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//   95  205:pop             
			onChanged();
		//   96  206:aload_0         
		//   97  207:invokevirtual   #98  <Method void onChanged()>
			return this;
		//   98  210:aload_0         
		//   99  211:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.EnumValueOptions)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class DescriptorProtos$EnumValueOptions>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.EnumValueOptions)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class DescriptorProtos$EnumValueOptions>
		//    6   12:invokevirtual   #357 <Method DescriptorProtos$EnumValueOptions$Builder mergeFrom(DescriptorProtos$EnumValueOptions)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #400 <Method AbstractMessage$Builder GeneratedMessageV3$ExtendableBuilder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #337 <Method DescriptorProtos$EnumValueOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #341 <Method DescriptorProtos$EnumValueOptions$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #337 <Method DescriptorProtos$EnumValueOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #398 <Method DescriptorProtos$EnumValueOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #407 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #398 <Method DescriptorProtos$EnumValueOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #398 <Method DescriptorProtos$EnumValueOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder removeUninterpretedOption(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       28
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #89  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.remove(i);
		//    5   11:aload_0         
		//    6   12:getfield        #35  <Field List uninterpretedOption_>
		//    7   15:iload_1         
		//    8   16:invokeinterface #413 <Method Object List.remove(int)>
		//    9   21:pop             
				onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #98  <Method void onChanged()>
				return this;
		//   12   26:aload_0         
		//   13   27:areturn         
			} else
			{
				uninterpretedOptionBuilder_.remove(i);
		//   14   28:aload_0         
		//   15   29:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #416 <Method void RepeatedFieldBuilderV3.remove(int)>
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
		//    2    2:getfield        #49  <Field int bitField0_>
		//    3    5:iconst_1        
		//    4    6:ior             
		//    5    7:putfield        #49  <Field int bitField0_>
			deprecated_ = flag;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #185 <Field boolean deprecated_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #98  <Method void onChanged()>
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
		//    4    4:invokespecial   #421 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    6   10:areturn         
		}

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #424 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #427 <Method DescriptorProtos$EnumValueOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #429 <Method DescriptorProtos$EnumValueOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #432 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #434 <Method DescriptorProtos$EnumValueOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #434 <Method DescriptorProtos$EnumValueOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #434 <Method DescriptorProtos$EnumValueOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #439 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #442 <Method DescriptorProtos$EnumValueOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #442 <Method DescriptorProtos$EnumValueOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #442 <Method DescriptorProtos$EnumValueOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #89  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.set(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #35  <Field List uninterpretedOption_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #128 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   10   20:invokeinterface #448 <Method Object List.set(int, Object)>
		//   11   25:pop             
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #98  <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
		//   16   32:aload_0         
		//   17   33:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   18   36:iload_1         
		//   19   37:aload_2         
		//   20   38:invokevirtual   #128 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   21   41:invokevirtual   #451 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
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
		//*   1    1:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(uninterpretedoption == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #141 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #142 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureUninterpretedOptionIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #89  <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.set(i, ((Object) (uninterpretedoption)));
		//   11   23:aload_0         
		//   12   24:getfield        #35  <Field List uninterpretedOption_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #448 <Method Object List.set(int, Object)>
		//   16   34:pop             
					onChanged();
		//   17   35:aload_0         
		//   18   36:invokevirtual   #98  <Method void onChanged()>
					return this;
		//   19   39:aload_0         
		//   20   40:areturn         
				}
			} else
			{
				uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (uninterpretedoption)));
		//   21   41:aload_0         
		//   22   42:getfield        #63  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   23   45:iload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #451 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
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
		//    2    2:invokespecial   #454 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumValueOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #456 <Method DescriptorProtos$EnumValueOptions$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #456 <Method DescriptorProtos$EnumValueOptions$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private boolean deprecated_;
		private RepeatedFieldBuilderV3 uninterpretedOptionBuilder_;
		private List uninterpretedOption_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void GeneratedMessageV3$ExtendableBuilder()>
			uninterpretedOption_ = Collections.emptyList();
		//    2    4:aload_0         
		//    3    5:invokestatic    #33  <Method List Collections.emptyList()>
		//    4    8:putfield        #35  <Field List uninterpretedOption_>
			maybeForceBuilderInitialization();
		//    5   11:aload_0         
		//    6   12:invokespecial   #38  <Method void maybeForceBuilderInitialization()>
		//    7   15:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void DescriptorProtos$EnumValueOptions$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #44  <Method void GeneratedMessageV3$ExtendableBuilder(GeneratedMessageV3$BuilderParent)>
			uninterpretedOption_ = Collections.emptyList();
		//    3    5:aload_0         
		//    4    6:invokestatic    #33  <Method List Collections.emptyList()>
		//    5    9:putfield        #35  <Field List uninterpretedOption_>
			maybeForceBuilderInitialization();
		//    6   12:aload_0         
		//    7   13:invokespecial   #38  <Method void maybeForceBuilderInitialization()>
		//    8   16:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #46  <Method void DescriptorProtos$EnumValueOptions$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$EnumValueOptions getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #45  <Field DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$21800();
	//    0    0:invokestatic    #158 <Method Descriptors$Descriptor DescriptorProtos.access$21800()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #45  <Field DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #162 <Method DescriptorProtos$EnumValueOptions$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$EnumValueOptions descriptorprotos$enumvalueoptions)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$enumvalueoptions);
	//    0    0:getstatic       #45  <Field DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #162 <Method DescriptorProtos$EnumValueOptions$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #166 <Method DescriptorProtos$EnumValueOptions$Builder DescriptorProtos$EnumValueOptions$Builder.mergeFrom(DescriptorProtos$EnumValueOptions)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumValueOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #174 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumValueOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #178 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueOptions)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #185 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueOptions)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #189 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumValueOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #194 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumValueOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #198 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumValueOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #200 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumValueOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #202 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueOptions)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #206 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueOptions)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #210 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueOptions)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #214 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumValueOptions parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumValueOptions)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #218 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #48  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$EnumValueOptions))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$EnumValueOptions>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #224 <Method boolean GeneratedMessageV3$ExtendableMessage.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$EnumValueOptions)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$EnumValueOptions>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasDeprecated() == ((DescriptorProtos$EnumValueOptions) (obj)).hasDeprecated())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #227 <Method boolean hasDeprecated()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #227 <Method boolean hasDeprecated()>
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
	//*  30   50:invokevirtual   #227 <Method boolean hasDeprecated()>
	//*  31   53:ifeq            78
			if(flag && getDeprecated() == ((DescriptorProtos$EnumValueOptions) (obj)).getDeprecated())
	//*  32   56:iload_2         
	//*  33   57:ifeq            76
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #230 <Method boolean getDeprecated()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #230 <Method boolean getDeprecated()>
	//*  38   68:icmpne          76
				flag1 = true;
	//   39   71:iconst_1        
	//   40   72:istore_3        
			else
	//*  41   73:goto            78
				flag1 = false;
	//   42   76:iconst_0        
	//   43   77:istore_3        
		if(flag1 && getUninterpretedOptionList().equals(((Object) (((DescriptorProtos$EnumValueOptions) (obj)).getUninterpretedOptionList()))))
	//*  44   78:iload_3         
	//*  45   79:ifeq            103
	//*  46   82:aload_0         
	//*  47   83:invokevirtual   #233 <Method List getUninterpretedOptionList()>
	//*  48   86:aload_1         
	//*  49   87:invokevirtual   #233 <Method List getUninterpretedOptionList()>
	//*  50   90:invokeinterface #234 <Method boolean List.equals(Object)>
	//*  51   95:ifeq            103
			flag = true;
	//   52   98:iconst_1        
	//   53   99:istore_2        
		else
	//*  54  100:goto            105
			flag = false;
	//   55  103:iconst_0        
	//   56  104:istore_2        
		if(flag && unknownFields.equals(((Object) (((DescriptorProtos$EnumValueOptions) (obj)).unknownFields))))
	//*  57  105:iload_2         
	//*  58  106:ifeq            128
	//*  59  109:aload_0         
	//*  60  110:getfield        #122 <Field UnknownFieldSet unknownFields>
	//*  61  113:aload_1         
	//*  62  114:getfield        #122 <Field UnknownFieldSet unknownFields>
	//*  63  117:invokevirtual   #235 <Method boolean UnknownFieldSet.equals(Object)>
	//*  64  120:ifeq            128
			flag = true;
	//   65  123:iconst_1        
	//   66  124:istore_2        
		else
	//*  67  125:goto            130
			flag = false;
	//   68  128:iconst_0        
	//   69  129:istore_2        
		return flag && getExtensionFields().equals(((Object) (((DescriptorProtos$EnumValueOptions) (obj)).getExtensionFields())));
	//   70  130:iload_2         
	//   71  131:ifeq            152
	//   72  134:aload_0         
	//   73  135:invokevirtual   #239 <Method Map getExtensionFields()>
	//   74  138:aload_1         
	//   75  139:invokevirtual   #239 <Method Map getExtensionFields()>
	//   76  142:invokeinterface #242 <Method boolean Map.equals(Object)>
	//   77  147:ifeq            152
	//   78  150:iconst_1        
	//   79  151:ireturn         
	//   80  152:iconst_0        
	//   81  153:ireturn         
	}

	public DescriptorProtos$EnumValueOptions getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #45  <Field DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #246 <Method DescriptorProtos$EnumValueOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #246 <Method DescriptorProtos$EnumValueOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #48  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field int memoizedSize>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_1        
		if((bitField0_ & 1) == 1)
	//*  10   14:aload_0         
	//*  11   15:getfield        #88  <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			i = CodedOutputStream.computeBoolSize(1, deprecated_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #54  <Field boolean deprecated_>
	//   19   29:invokestatic    #258 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_1        
		for(int j = 0; j < uninterpretedOption_.size(); j++)
	//*  23   35:iconst_0        
	//*  24   36:istore_2        
	//*  25   37:iload_2         
	//*  26   38:aload_0         
	//*  27   39:getfield        #62  <Field List uninterpretedOption_>
	//*  28   42:invokeinterface #261 <Method int List.size()>
	//*  29   47:icmpge          79
			i += CodedOutputStream.computeMessageSize(999, (MessageLite)uninterpretedOption_.get(j));
	//   30   50:iload_1         
	//   31   51:sipush          999
	//   32   54:aload_0         
	//   33   55:getfield        #62  <Field List uninterpretedOption_>
	//   34   58:iload_2         
	//   35   59:invokeinterface #265 <Method Object List.get(int)>
	//   36   64:checkcast       #267 <Class MessageLite>
	//   37   67:invokestatic    #271 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   38   70:iadd            
	//   39   71:istore_1        

	//   40   72:iload_2         
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:istore_2        
	//*  44   76:goto            37
		i = i + extensionsSerializedSize() + unknownFields.getSerializedSize();
	//   45   79:iload_1         
	//   46   80:aload_0         
	//   47   81:invokevirtual   #274 <Method int extensionsSerializedSize()>
	//   48   84:iadd            
	//   49   85:aload_0         
	//   50   86:getfield        #122 <Field UnknownFieldSet unknownFields>
	//   51   89:invokevirtual   #276 <Method int UnknownFieldSet.getSerializedSize()>
	//   52   92:iadd            
	//   53   93:istore_1        
		memoizedSize = i;
	//   54   94:aload_0         
	//   55   95:iload_1         
	//   56   96:putfield        #252 <Field int memoizedSize>
		return i;
	//   57   99:iload_1         
	//   58  100:ireturn         
	}

	public on getUninterpretedOption(int i)
	{
		return (on)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #265 <Method Object List.get(int)>
	//    4   10:checkcast       #97  <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		return uninterpretedOption_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List uninterpretedOption_>
	//    2    4:invokeinterface #261 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public onOrBuilder getUninterpretedOptionOrBuilder(int i)
	{
		return (onOrBuilder)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #265 <Method Object List.get(int)>
	//    4   10:checkcast       #284 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    5   13:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasDeprecated()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
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
	//*   1    1:getfield        #291 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #291 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #293 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #297 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasDeprecated())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #227 <Method boolean hasDeprecated()>
	//*  15   29:ifeq            50
			i = (j * 37 + 1) * 53 + Internal.hashBoolean(getDeprecated());
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #230 <Method boolean getDeprecated()>
	//   25   45:invokestatic    #303 <Method int Internal.hashBoolean(boolean)>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(getUninterpretedOptionCount() > 0)
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #305 <Method int getUninterpretedOptionCount()>
	//*  32   56:ifle            81
			j = (i * 37 + 999) * 53 + getUninterpretedOptionList().hashCode();
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:sipush          999
	//   37   66:iadd            
	//   38   67:bipush          53
	//   39   69:imul            
	//   40   70:aload_0         
	//   41   71:invokevirtual   #233 <Method List getUninterpretedOptionList()>
	//   42   74:invokeinterface #306 <Method int List.hashCode()>
	//   43   79:iadd            
	//   44   80:istore_2        
		i = hashFields(j, getExtensionFields()) * 29 + unknownFields.hashCode();
	//   45   81:iload_2         
	//   46   82:aload_0         
	//   47   83:invokevirtual   #239 <Method Map getExtensionFields()>
	//   48   86:invokestatic    #310 <Method int hashFields(int, Map)>
	//   49   89:bipush          29
	//   50   91:imul            
	//   51   92:aload_0         
	//   52   93:getfield        #122 <Field UnknownFieldSet unknownFields>
	//   53   96:invokevirtual   #311 <Method int UnknownFieldSet.hashCode()>
	//   54   99:iadd            
	//   55  100:istore_1        
		memoizedHashCode = i;
	//   56  101:aload_0         
	//   57  102:iload_1         
	//   58  103:putfield        #291 <Field int memoizedHashCode>
		return i;
	//   59  106:iload_1         
	//   60  107:ireturn         
	}

	protected ble internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$21900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumValueOptions, com/google/protobuf/DescriptorProtos$EnumValueOptions$Builder);
	//    0    0:invokestatic    #316 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$21900()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$EnumValueOptions>
	//    2    5:ldc1            #14  <Class DescriptorProtos$EnumValueOptions$Builder>
	//    3    7:invokevirtual   #322 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field byte memoizedIsInitialized>
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
	//*  16   22:invokevirtual   #305 <Method int getUninterpretedOptionCount()>
	//*  17   25:icmpge          53
			if(!getUninterpretedOption(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #325 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*  21   33:invokevirtual   #327 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #52  <Field byte memoizedIsInitialized>
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
	//*  34   54:invokevirtual   #330 <Method boolean extensionsAreInitialized()>
	//*  35   57:ifne            67
		{
			memoizedIsInitialized = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #52  <Field byte memoizedIsInitialized>
			return false;
	//   39   65:iconst_0        
	//   40   66:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   41   67:aload_0         
	//   42   68:iconst_1        
	//   43   69:putfield        #52  <Field byte memoizedIsInitialized>
			return true;
	//   44   72:iconst_1        
	//   45   73:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #333 <Method DescriptorProtos$EnumValueOptions$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #14  <Class DescriptorProtos$EnumValueOptions$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #337 <Method void DescriptorProtos$EnumValueOptions$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #340 <Method DescriptorProtos$EnumValueOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #343 <Method DescriptorProtos$EnumValueOptions$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #340 <Method DescriptorProtos$EnumValueOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #45  <Field DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #14  <Class DescriptorProtos$EnumValueOptions$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #347 <Method void DescriptorProtos$EnumValueOptions$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #14  <Class DescriptorProtos$EnumValueOptions$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #347 <Method void DescriptorProtos$EnumValueOptions$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #166 <Method DescriptorProtos$EnumValueOptions$Builder DescriptorProtos$EnumValueOptions$Builder.mergeFrom(DescriptorProtos$EnumValueOptions)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method DescriptorProtos$EnumValueOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method DescriptorProtos$EnumValueOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		ge.ExtensionWriter extensionwriter = newExtensionWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #353 <Method GeneratedMessageV3$ExtendableMessage$ExtensionWriter newExtensionWriter()>
	//    2    4:astore_3        
		if((bitField0_ & 1) == 1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #88  <Field int bitField0_>
	//*   5    9:iconst_1        
	//*   6   10:iand            
	//*   7   11:iconst_1        
	//*   8   12:icmpne          24
			codedoutputstream.writeBool(1, deprecated_);
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:aload_0         
	//   12   18:getfield        #54  <Field boolean deprecated_>
	//   13   21:invokevirtual   #357 <Method void CodedOutputStream.writeBool(int, boolean)>
		for(int i = 0; i < uninterpretedOption_.size(); i++)
	//*  14   24:iconst_0        
	//*  15   25:istore_2        
	//*  16   26:iload_2         
	//*  17   27:aload_0         
	//*  18   28:getfield        #62  <Field List uninterpretedOption_>
	//*  19   31:invokeinterface #261 <Method int List.size()>
	//*  20   36:icmpge          66
			codedoutputstream.writeMessage(999, (MessageLite)uninterpretedOption_.get(i));
	//   21   39:aload_1         
	//   22   40:sipush          999
	//   23   43:aload_0         
	//   24   44:getfield        #62  <Field List uninterpretedOption_>
	//   25   47:iload_2         
	//   26   48:invokeinterface #265 <Method Object List.get(int)>
	//   27   53:checkcast       #267 <Class MessageLite>
	//   28   56:invokevirtual   #361 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   29   59:iload_2         
	//   30   60:iconst_1        
	//   31   61:iadd            
	//   32   62:istore_2        
	//*  33   63:goto            26
		extensionwriter.writeUntil(0x20000000, codedoutputstream);
	//   34   66:aload_3         
	//   35   67:ldc2            #362 <Int 0x20000000>
	//   36   70:aload_1         
	//   37   71:invokevirtual   #368 <Method void GeneratedMessageV3$ExtendableMessage$ExtensionWriter.writeUntil(int, CodedOutputStream)>
		unknownFields.writeTo(codedoutputstream);
	//   38   74:aload_0         
	//   39   75:getfield        #122 <Field UnknownFieldSet unknownFields>
	//   40   78:aload_1         
	//   41   79:invokevirtual   #370 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   42   82:return          
	}

	private static final DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE = new DescriptorProtos$EnumValueOptions();
	public static final int DEPRECATED_FIELD_NUMBER = 1;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.EnumValueOptions parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.EnumValueOptions(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$EnumValueOptions>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$EnumValueOptions(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$EnumValueOptions parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private boolean deprecated_;
	private byte memoizedIsInitialized;
	private List uninterpretedOption_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$EnumValueOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void DescriptorProtos$EnumValueOptions()>
	//    3    7:putstatic       #45  <Field DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE>
	//    4   10:new             #12  <Class DescriptorProtos$EnumValueOptions$1>
	//    5   13:dup             
	//    6   14:invokespecial   #46  <Method void DescriptorProtos$EnumValueOptions$1()>
	//    7   17:putstatic       #48  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static boolean access$22302(DescriptorProtos$EnumValueOptions descriptorprotos$enumvalueoptions, boolean flag)
	{
		descriptorprotos$enumvalueoptions.deprecated_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field boolean deprecated_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static List access$22400(DescriptorProtos$EnumValueOptions descriptorprotos$enumvalueoptions)
	{
		return descriptorprotos$enumvalueoptions.uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

*/


/*
	static List access$22402(DescriptorProtos$EnumValueOptions descriptorprotos$enumvalueoptions, List list)
	{
		descriptorprotos$enumvalueoptions.uninterpretedOption_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field List uninterpretedOption_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$22502(DescriptorProtos$EnumValueOptions descriptorprotos$enumvalueoptions, int i)
	{
		descriptorprotos$enumvalueoptions.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$EnumValueOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void GeneratedMessageV3$ExtendableMessage()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #52  <Field byte memoizedIsInitialized>
		deprecated_ = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #54  <Field boolean deprecated_>
		uninterpretedOption_ = Collections.emptyList();
	//    8   14:aload_0         
	//    9   15:invokestatic    #60  <Method List Collections.emptyList()>
	//   10   18:putfield        #62  <Field List uninterpretedOption_>
	//   11   21:return          
	}

	private DescriptorProtos$EnumValueOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void DescriptorProtos$EnumValueOptions()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #69  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #70  <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #76  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          10
		flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L9:
		int k;
		int l;
		int i1;
		if(flag)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            231
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
	//   23   41:invokevirtual   #82  <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		j1;
	//   25   46:iload           9
		JVM INSTR lookupswitch 3: default 327
	//	               0: 330
	//	               8: 118
	//	               7994: 160;
	//   26   48:lookupswitch    3: default 327
	//	               0: 330
	//	               8: 118
	//	               7994: 160
		   goto _L1 _L2 _L3 _L4
_L1:
		int j;
		j = i;
	//   27   84:iload_3         
	//   28   85:istore          4
		l = i;
	//   29   87:iload_3         
	//   30   88:istore          6
		i1 = i;
	//   31   90:iload_3         
	//   32   91:istore          7
		k = i;
	//   33   93:iload_3         
	//   34   94:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, j1))
	//*  35   96:aload_0         
	//*  36   97:aload_1         
	//*  37   98:aload           10
	//*  38  100:aload_2         
	//*  39  101:iload           9
	//*  40  103:invokevirtual   #86  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  106:ifne            225
		{
			flag = true;
	//   42  109:iconst_1        
	//   43  110:istore          8
			j = i;
	//   44  112:iload_3         
	//   45  113:istore          4
		}
		  goto _L5
	//*  46  115:goto            225
_L3:
		l = i;
	//   47  118:iload_3         
	//   48  119:istore          6
		i1 = i;
	//   49  121:iload_3         
	//   50  122:istore          7
		k = i;
	//   51  124:iload_3         
	//   52  125:istore          5
		bitField0_ = bitField0_ | 1;
	//   53  127:aload_0         
	//   54  128:aload_0         
	//   55  129:getfield        #88  <Field int bitField0_>
	//   56  132:iconst_1        
	//   57  133:ior             
	//   58  134:putfield        #88  <Field int bitField0_>
		l = i;
	//   59  137:iload_3         
	//   60  138:istore          6
		i1 = i;
	//   61  140:iload_3         
	//   62  141:istore          7
		k = i;
	//   63  143:iload_3         
	//   64  144:istore          5
		deprecated_ = codedinputstream.readBool();
	//   65  146:aload_0         
	//   66  147:aload_1         
	//   67  148:invokevirtual   #92  <Method boolean CodedInputStream.readBool()>
	//   68  151:putfield        #54  <Field boolean deprecated_>
		j = i;
	//   69  154:iload_3         
	//   70  155:istore          4
		  goto _L5
	//*  71  157:goto            225
_L4:
		j = i;
	//   72  160:iload_3         
	//   73  161:istore          4
		if((i & 2) == 2) goto _L7; else goto _L6
	//   74  163:iload_3         
	//   75  164:iconst_2        
	//   76  165:iand            
	//   77  166:iconst_2        
	//   78  167:icmpeq          195
_L6:
		l = i;
	//   79  170:iload_3         
	//   80  171:istore          6
		i1 = i;
	//   81  173:iload_3         
	//   82  174:istore          7
		k = i;
	//   83  176:iload_3         
	//   84  177:istore          5
		uninterpretedOption_ = ((List) (new ArrayList()));
	//   85  179:aload_0         
	//   86  180:new             #94  <Class ArrayList>
	//   87  183:dup             
	//   88  184:invokespecial   #95  <Method void ArrayList()>
	//   89  187:putfield        #62  <Field List uninterpretedOption_>
		j = i | 2;
	//   90  190:iload_3         
	//   91  191:iconst_2        
	//   92  192:ior             
	//   93  193:istore          4
_L7:
		l = j;
	//   94  195:iload           4
	//   95  197:istore          6
		i1 = j;
	//   96  199:iload           4
	//   97  201:istore          7
		k = j;
	//   98  203:iload           4
	//   99  205:istore          5
		uninterpretedOption_.add(((Object) (codedinputstream.readMessage(on.PARSER, extensionregistrylite))));
	//  100  207:aload_0         
	//  101  208:getfield        #62  <Field List uninterpretedOption_>
	//  102  211:aload_1         
	//  103  212:getstatic       #98  <Field Parser DescriptorProtos$UninterpretedOption.PARSER>
	//  104  215:aload_2         
	//  105  216:invokevirtual   #102 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  106  219:invokeinterface #108 <Method boolean List.add(Object)>
	//  107  224:pop             
_L5:
		i = j;
	//  108  225:iload           4
	//  109  227:istore_3        
		if(true) goto _L9; else goto _L8
	//  110  228:goto            26
_L8:
		if((i & 2) == 2)
	//* 111  231:iload_3         
	//* 112  232:iconst_2        
	//* 113  233:iand            
	//* 114  234:iconst_2        
	//* 115  235:icmpne          249
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  116  238:aload_0         
	//  117  239:aload_0         
	//  118  240:getfield        #62  <Field List uninterpretedOption_>
	//  119  243:invokestatic    #112 <Method List Collections.unmodifiableList(List)>
	//  120  246:putfield        #62  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  121  249:aload_0         
	//  122  250:aload           10
	//  123  252:invokevirtual   #118 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  124  255:putfield        #122 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  125  258:aload_0         
	//  126  259:invokevirtual   #125 <Method void makeExtensionsImmutable()>
		return;
	//  127  262:return          
		codedinputstream;
	//  128  263:astore_1        
		k = l;
	//  129  264:iload           6
	//  130  266:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  131  268:aload_1         
	//  132  269:aload_0         
	//  133  270:invokevirtual   #129 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  134  273:athrow          
		codedinputstream;
	//  135  274:astore_1        
		k = i1;
	//  136  275:iload           7
	//  137  277:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  138  279:new             #65  <Class InvalidProtocolBufferException>
	//  139  282:dup             
	//  140  283:aload_1         
	//  141  284:invokespecial   #132 <Method void InvalidProtocolBufferException(IOException)>
	//  142  287:aload_0         
	//  143  288:invokevirtual   #129 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  144  291:athrow          
		codedinputstream;
	//  145  292:astore_1        
		if((k & 2) == 2)
	//* 146  293:iload           5
	//* 147  295:iconst_2        
	//* 148  296:iand            
	//* 149  297:iconst_2        
	//* 150  298:icmpne          312
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  151  301:aload_0         
	//  152  302:aload_0         
	//  153  303:getfield        #62  <Field List uninterpretedOption_>
	//  154  306:invokestatic    #112 <Method List Collections.unmodifiableList(List)>
	//  155  309:putfield        #62  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  156  312:aload_0         
	//  157  313:aload           10
	//  158  315:invokevirtual   #118 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  159  318:putfield        #122 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  160  321:aload_0         
	//  161  322:invokevirtual   #125 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  162  325:aload_1         
	//  163  326:athrow          
	//* 164  327:goto            84
_L2:
		flag = true;
	//  165  330:iconst_1        
	//  166  331:istore          8
		j = i;
	//  167  333:iload_3         
	//  168  334:istore          4
		  goto _L5
	//* 169  336:goto            225
	}

	DescriptorProtos$EnumValueOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #136 <Method void DescriptorProtos$EnumValueOptions(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$EnumValueOptions(er er)
	{
		super(er);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #139 <Method void GeneratedMessageV3$ExtendableMessage(GeneratedMessageV3$ExtendableBuilder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #52  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$EnumValueOptions(er er, DescriptorProtos._cls1 _pcls1)
	{
		this(er);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #143 <Method void DescriptorProtos$EnumValueOptions(GeneratedMessageV3$ExtendableBuilder)>
	//    3    5:return          
	}
}
