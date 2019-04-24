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

public static final class DescriptorProtos$FieldOptions extends essage
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.ExtendableBuilder
		implements DescriptorProtos.FieldOptionsOrBuilder
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

		public Builder addAllUninterpretedOption(Iterable iterable)
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

		public Builder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.addExtension(generatedextension, obj);
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
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

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(i, ((Object) (builder.build())));
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
				uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
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

		public Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(((Object) (builder.build())));
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
				uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addUninterpretedOption(DescriptorProtos.UninterpretedOption uninterpretedoption)
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

		public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder()
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #94  <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:invokestatic    #166 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    3    7:invokevirtual   #170 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #133 <Class DescriptorProtos$UninterpretedOption$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
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
			fieldoptions.ctype_ = ctype_;
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
			fieldoptions.packed_ = packed_;
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
			fieldoptions.jstype_ = jstype_;
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
			fieldoptions.lazy_ = lazy_;
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
			fieldoptions.deprecated_ = deprecated_;
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
			fieldoptions.weak_ = weak_;
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
				fieldoptions.uninterpretedOption_ = uninterpretedOption_;
		//  123  202:aload           4
		//  124  204:aload_0         
		//  125  205:getfield        #44  <Field List uninterpretedOption_>
		//  126  208:invokestatic    #228 <Method List DescriptorProtos$FieldOptions.access$19802(DescriptorProtos$FieldOptions, List)>
		//  127  211:pop             
			} else
		//* 128  212:goto            228
			{
				fieldoptions.uninterpretedOption_ = uninterpretedOptionBuilder_.build();
		//  129  215:aload           4
		//  130  217:aload_0         
		//  131  218:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//  132  221:invokevirtual   #230 <Method List RepeatedFieldBuilderV3.build()>
		//  133  224:invokestatic    #228 <Method List DescriptorProtos$FieldOptions.access$19802(DescriptorProtos$FieldOptions, List)>
		//  134  227:pop             
			}
			fieldoptions.bitField0_ = i;
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

		public Builder clear()
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

		public Builder clearCtype()
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

		public Builder clearDeprecated()
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

		public Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return (Builder)super.clearExtension(generatedextension);
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

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
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

		public Builder clearJstype()
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

		public Builder clearLazy()
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

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
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

		public Builder clearPacked()
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

		public Builder clearUninterpretedOption()
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

		public Builder clearWeak()
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

		public Builder clone()
		{
			return (Builder)super.clone();
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

		public CType getCtype()
		{
			CType ctype = CType.valueOf(ctype_);
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field int ctype_>
		//    2    4:invokestatic    #300 <Method DescriptorProtos$FieldOptions$CType DescriptorProtos$FieldOptions$CType.valueOf(int)>
		//    3    7:astore_1        
			if(ctype == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       16
				return CType.STRING;
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

		public JSType getJstype()
		{
			JSType jstype = JSType.valueOf(jstype_);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int jstype_>
		//    2    4:invokestatic    #318 <Method DescriptorProtos$FieldOptions$JSType DescriptorProtos$FieldOptions$JSType.valueOf(int)>
		//    3    7:astore_1        
			if(jstype == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       16
				return JSType.JS_NORMAL;
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

		public DescriptorProtos.UninterpretedOption.Builder getUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().getBuilder(i);
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

		public DescriptorProtos.UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOption_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field List uninterpretedOption_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #330 <Method Object List.get(int)>
		//    7   17:checkcast       #361 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
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

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
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

		public Builder mergeFrom(DescriptorProtos.FieldOptions fieldoptions)
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
				if(!fieldoptions.uninterpretedOption_.isEmpty())
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
						uninterpretedOption_ = fieldoptions.uninterpretedOption_;
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
						uninterpretedOption_.addAll(((java.util.Collection) (fieldoptions.uninterpretedOption_)));
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
			if(!fieldoptions.uninterpretedOption_.isEmpty())
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
					uninterpretedOption_ = fieldoptions.uninterpretedOption_;
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
					uninterpretedOptionBuilder_.addAllMessages(((Iterable) (fieldoptions.uninterpretedOption_)));
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

		public Builder mergeFrom(Message message)
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

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
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

		public Builder removeUninterpretedOption(int i)
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

		public Builder setCtype(CType ctype)
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

		public Builder setDeprecated(boolean flag)
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

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #527 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$FieldOptions$Builder>
		//    6   10:areturn         
		}

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, obj);
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
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

		public Builder setJstype(JSType jstype)
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

		public Builder setLazy(boolean flag)
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

		public Builder setPacked(boolean flag)
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

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #98  <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.set(i, ((Object) (builder.build())));
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
				uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption uninterpretedoption)
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
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

		public Builder setWeak(boolean flag)
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

		private Builder()
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

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #50  <Method void DescriptorProtos$FieldOptions$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #55  <Method void DescriptorProtos$FieldOptions$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static final class CType extends Enum
		implements ProtocolMessageEnum
	{

		public static CType forNumber(int i)
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
				return STRING;
		//    3   31:getstatic       #42  <Field DescriptorProtos$FieldOptions$CType STRING>
		//    4   34:areturn         

			case 1: // '\001'
				return CORD;
		//    5   35:getstatic       #45  <Field DescriptorProtos$FieldOptions$CType CORD>
		//    6   38:areturn         

			case 2: // '\002'
				return STRING_PIECE;
		//    7   39:getstatic       #48  <Field DescriptorProtos$FieldOptions$CType STRING_PIECE>
		//    8   42:areturn         
			}
			return null;
		//    9   43:aconst_null     
		//   10   44:areturn         
		}

		public static final Descriptors.EnumDescriptor getDescriptor()
		{
			return (Descriptors.EnumDescriptor)DescriptorProtos.FieldOptions.getDescriptor().getEnumTypes().get(0);
		//    0    0:invokestatic    #75  <Method Descriptors$Descriptor DescriptorProtos$FieldOptions.getDescriptor()>
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

		public static CType valueOf(int i)
		{
			return forNumber(i);
		//    0    0:iload_0         
		//    1    1:invokestatic    #96  <Method DescriptorProtos$FieldOptions$CType forNumber(int)>
		//    2    4:areturn         
		}

		public static CType valueOf(Descriptors.EnumValueDescriptor enumvaluedescriptor)
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
		//    9   20:getstatic       #60  <Field DescriptorProtos$FieldOptions$CType[] VALUES>
		//   10   23:aload_0         
		//   11   24:invokevirtual   #116 <Method int Descriptors$EnumValueDescriptor.getIndex()>
		//   12   27:aaload          
		//   13   28:areturn         
		}

		public static CType valueOf(String s)
		{
			return (CType)Enum.valueOf(com/google/protobuf/DescriptorProtos$FieldOptions$CType, s);
		//    0    0:ldc1            #2   <Class DescriptorProtos$FieldOptions$CType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #120 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DescriptorProtos$FieldOptions$CType>
		//    4    9:areturn         
		}

		public static CType[] values()
		{
			return (CType[])((CType []) ($VALUES)).clone();
		//    0    0:getstatic       #50  <Field DescriptorProtos$FieldOptions$CType[] $VALUES>
		//    1    3:invokevirtual   #125 <Method Object _5B_Lcom.google.protobuf.DescriptorProtos$FieldOptions$CType_3B_.clone()>
		//    2    6:checkcast       #121 <Class DescriptorProtos$FieldOptions$CType[]>
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

		private static final CType $VALUES[];
		public static final CType CORD;
		public static final int CORD_VALUE = 1;
		public static final CType STRING;
		public static final CType STRING_PIECE;
		public static final int STRING_PIECE_VALUE = 2;
		public static final int STRING_VALUE = 0;
		private static final CType VALUES[] = values();
		private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() {

			public CType findValueByNumber(int i)
			{
				return CType.forNumber(i);
			//    0    0:iload_1         
			//    1    1:invokestatic    #25  <Method DescriptorProtos$FieldOptions$CType DescriptorProtos$FieldOptions$CType.forNumber(int)>
			//    2    4:areturn         
			}

			public volatile Internal.EnumLite findValueByNumber(int i)
			{
				return ((Internal.EnumLite) (findValueByNumber(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #28  <Method DescriptorProtos$FieldOptions$CType findValueByNumber(int)>
			//    3    5:areturn         
			}

		}
;
		private final int value;

		static 
		{
			STRING = new CType("STRING", 0, 0);
		//    0    0:new             #2   <Class DescriptorProtos$FieldOptions$CType>
		//    1    3:dup             
		//    2    4:ldc1            #36  <String "STRING">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #40  <Method void DescriptorProtos$FieldOptions$CType(String, int, int)>
		//    6   11:putstatic       #42  <Field DescriptorProtos$FieldOptions$CType STRING>
			CORD = new CType("CORD", 1, 1);
		//    7   14:new             #2   <Class DescriptorProtos$FieldOptions$CType>
		//    8   17:dup             
		//    9   18:ldc1            #43  <String "CORD">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #40  <Method void DescriptorProtos$FieldOptions$CType(String, int, int)>
		//   13   25:putstatic       #45  <Field DescriptorProtos$FieldOptions$CType CORD>
			STRING_PIECE = new CType("STRING_PIECE", 2, 2);
		//   14   28:new             #2   <Class DescriptorProtos$FieldOptions$CType>
		//   15   31:dup             
		//   16   32:ldc1            #46  <String "STRING_PIECE">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #40  <Method void DescriptorProtos$FieldOptions$CType(String, int, int)>
		//   20   39:putstatic       #48  <Field DescriptorProtos$FieldOptions$CType STRING_PIECE>
			$VALUES = (new CType[] {
				STRING, CORD, STRING_PIECE
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       CType[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #42  <Field DescriptorProtos$FieldOptions$CType STRING>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #45  <Field DescriptorProtos$FieldOptions$CType CORD>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #48  <Field DescriptorProtos$FieldOptions$CType STRING_PIECE>
		//   34   63:aastore         
		//   35   64:putstatic       #50  <Field DescriptorProtos$FieldOptions$CType[] $VALUES>
		//   36   67:new             #15  <Class DescriptorProtos$FieldOptions$CType$1>
		//   37   70:dup             
		//   38   71:invokespecial   #52  <Method void DescriptorProtos$FieldOptions$CType$1()>
		//   39   74:putstatic       #54  <Field Internal$EnumLiteMap internalValueMap>
		//   40   77:invokestatic    #58  <Method DescriptorProtos$FieldOptions$CType[] values()>
		//   41   80:putstatic       #60  <Field DescriptorProtos$FieldOptions$CType[] VALUES>
		//*  42   83:return          
		}

		private CType(String s, int i, int j)
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

	public static final class JSType extends Enum
		implements ProtocolMessageEnum
	{

		public static JSType forNumber(int i)
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
				return JS_NORMAL;
		//    3   31:getstatic       #42  <Field DescriptorProtos$FieldOptions$JSType JS_NORMAL>
		//    4   34:areturn         

			case 1: // '\001'
				return JS_STRING;
		//    5   35:getstatic       #45  <Field DescriptorProtos$FieldOptions$JSType JS_STRING>
		//    6   38:areturn         

			case 2: // '\002'
				return JS_NUMBER;
		//    7   39:getstatic       #48  <Field DescriptorProtos$FieldOptions$JSType JS_NUMBER>
		//    8   42:areturn         
			}
			return null;
		//    9   43:aconst_null     
		//   10   44:areturn         
		}

		public static final Descriptors.EnumDescriptor getDescriptor()
		{
			return (Descriptors.EnumDescriptor)DescriptorProtos.FieldOptions.getDescriptor().getEnumTypes().get(1);
		//    0    0:invokestatic    #75  <Method Descriptors$Descriptor DescriptorProtos$FieldOptions.getDescriptor()>
		//    1    3:invokevirtual   #81  <Method List Descriptors$Descriptor.getEnumTypes()>
		//    2    6:iconst_1        
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

		public static JSType valueOf(int i)
		{
			return forNumber(i);
		//    0    0:iload_0         
		//    1    1:invokestatic    #96  <Method DescriptorProtos$FieldOptions$JSType forNumber(int)>
		//    2    4:areturn         
		}

		public static JSType valueOf(Descriptors.EnumValueDescriptor enumvaluedescriptor)
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
		//    9   20:getstatic       #60  <Field DescriptorProtos$FieldOptions$JSType[] VALUES>
		//   10   23:aload_0         
		//   11   24:invokevirtual   #116 <Method int Descriptors$EnumValueDescriptor.getIndex()>
		//   12   27:aaload          
		//   13   28:areturn         
		}

		public static JSType valueOf(String s)
		{
			return (JSType)Enum.valueOf(com/google/protobuf/DescriptorProtos$FieldOptions$JSType, s);
		//    0    0:ldc1            #2   <Class DescriptorProtos$FieldOptions$JSType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #120 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DescriptorProtos$FieldOptions$JSType>
		//    4    9:areturn         
		}

		public static JSType[] values()
		{
			return (JSType[])((JSType []) ($VALUES)).clone();
		//    0    0:getstatic       #50  <Field DescriptorProtos$FieldOptions$JSType[] $VALUES>
		//    1    3:invokevirtual   #125 <Method Object _5B_Lcom.google.protobuf.DescriptorProtos$FieldOptions$JSType_3B_.clone()>
		//    2    6:checkcast       #121 <Class DescriptorProtos$FieldOptions$JSType[]>
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

		private static final JSType $VALUES[];
		public static final JSType JS_NORMAL;
		public static final int JS_NORMAL_VALUE = 0;
		public static final JSType JS_NUMBER;
		public static final int JS_NUMBER_VALUE = 2;
		public static final JSType JS_STRING;
		public static final int JS_STRING_VALUE = 1;
		private static final JSType VALUES[] = values();
		private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() {

			public JSType findValueByNumber(int i)
			{
				return JSType.forNumber(i);
			//    0    0:iload_1         
			//    1    1:invokestatic    #25  <Method DescriptorProtos$FieldOptions$JSType DescriptorProtos$FieldOptions$JSType.forNumber(int)>
			//    2    4:areturn         
			}

			public volatile Internal.EnumLite findValueByNumber(int i)
			{
				return ((Internal.EnumLite) (findValueByNumber(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #28  <Method DescriptorProtos$FieldOptions$JSType findValueByNumber(int)>
			//    3    5:areturn         
			}

		}
;
		private final int value;

		static 
		{
			JS_NORMAL = new JSType("JS_NORMAL", 0, 0);
		//    0    0:new             #2   <Class DescriptorProtos$FieldOptions$JSType>
		//    1    3:dup             
		//    2    4:ldc1            #36  <String "JS_NORMAL">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #40  <Method void DescriptorProtos$FieldOptions$JSType(String, int, int)>
		//    6   11:putstatic       #42  <Field DescriptorProtos$FieldOptions$JSType JS_NORMAL>
			JS_STRING = new JSType("JS_STRING", 1, 1);
		//    7   14:new             #2   <Class DescriptorProtos$FieldOptions$JSType>
		//    8   17:dup             
		//    9   18:ldc1            #43  <String "JS_STRING">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #40  <Method void DescriptorProtos$FieldOptions$JSType(String, int, int)>
		//   13   25:putstatic       #45  <Field DescriptorProtos$FieldOptions$JSType JS_STRING>
			JS_NUMBER = new JSType("JS_NUMBER", 2, 2);
		//   14   28:new             #2   <Class DescriptorProtos$FieldOptions$JSType>
		//   15   31:dup             
		//   16   32:ldc1            #46  <String "JS_NUMBER">
		//   17   34:iconst_2        
		//   18   35:iconst_2        
		//   19   36:invokespecial   #40  <Method void DescriptorProtos$FieldOptions$JSType(String, int, int)>
		//   20   39:putstatic       #48  <Field DescriptorProtos$FieldOptions$JSType JS_NUMBER>
			$VALUES = (new JSType[] {
				JS_NORMAL, JS_STRING, JS_NUMBER
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       JSType[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #42  <Field DescriptorProtos$FieldOptions$JSType JS_NORMAL>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #45  <Field DescriptorProtos$FieldOptions$JSType JS_STRING>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #48  <Field DescriptorProtos$FieldOptions$JSType JS_NUMBER>
		//   34   63:aastore         
		//   35   64:putstatic       #50  <Field DescriptorProtos$FieldOptions$JSType[] $VALUES>
		//   36   67:new             #15  <Class DescriptorProtos$FieldOptions$JSType$1>
		//   37   70:dup             
		//   38   71:invokespecial   #52  <Method void DescriptorProtos$FieldOptions$JSType$1()>
		//   39   74:putstatic       #54  <Field Internal$EnumLiteMap internalValueMap>
		//   40   77:invokestatic    #58  <Method DescriptorProtos$FieldOptions$JSType[] values()>
		//   41   80:putstatic       #60  <Field DescriptorProtos$FieldOptions$JSType[] VALUES>
		//*  42   83:return          
		}

		private JSType(String s, int i, int j)
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


	public static DescriptorProtos$FieldOptions getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #70  <Field DescriptorProtos$FieldOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$18700();
	//    0    0:invokestatic    #212 <Method Descriptors$Descriptor DescriptorProtos.access$18700()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #70  <Field DescriptorProtos$FieldOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #216 <Method DescriptorProtos$FieldOptions$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$fieldoptions);
	//    0    0:getstatic       #70  <Field DescriptorProtos$FieldOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #216 <Method DescriptorProtos$FieldOptions$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #220 <Method DescriptorProtos$FieldOptions$Builder DescriptorProtos$FieldOptions$Builder.mergeFrom(DescriptorProtos$FieldOptions)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$FieldOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #228 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FieldOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #232 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldOptions)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #239 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldOptions)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #243 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$FieldOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #248 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FieldOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #252 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$FieldOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #254 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FieldOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #256 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldOptions)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #260 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldOptions)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #264 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldOptions)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #268 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FieldOptions parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldOptions)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #272 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #73  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$FieldOptions))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$FieldOptions>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #278 <Method boolean GeneratedMessageV3$ExtendableMessage.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$FieldOptions)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$FieldOptions>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasCtype() == ((DescriptorProtos$FieldOptions) (obj)).hasCtype())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #281 <Method boolean hasCtype()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #281 <Method boolean hasCtype()>
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
		if(hasCtype())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #281 <Method boolean hasCtype()>
	//*  31   53:ifeq            78
			if(flag && ctype_ == ((DescriptorProtos$FieldOptions) (obj)).ctype_)
	//*  32   56:iload_2         
	//*  33   57:ifeq            76
	//*  34   60:aload_0         
	//*  35   61:getfield        #79  <Field int ctype_>
	//*  36   64:aload_1         
	//*  37   65:getfield        #79  <Field int ctype_>
	//*  38   68:icmpne          76
				flag1 = true;
	//   39   71:iconst_1        
	//   40   72:istore_3        
			else
	//*  41   73:goto            78
				flag1 = false;
	//   42   76:iconst_0        
	//   43   77:istore_3        
		if(flag1 && hasPacked() == ((DescriptorProtos$FieldOptions) (obj)).hasPacked())
	//*  44   78:iload_3         
	//*  45   79:ifeq            98
	//*  46   82:aload_0         
	//*  47   83:invokevirtual   #284 <Method boolean hasPacked()>
	//*  48   86:aload_1         
	//*  49   87:invokevirtual   #284 <Method boolean hasPacked()>
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
		if(hasPacked())
	//*  58  102:aload_0         
	//*  59  103:invokevirtual   #284 <Method boolean hasPacked()>
	//*  60  106:ifeq            131
			if(flag && getPacked() == ((DescriptorProtos$FieldOptions) (obj)).getPacked())
	//*  61  109:iload_2         
	//*  62  110:ifeq            129
	//*  63  113:aload_0         
	//*  64  114:invokevirtual   #287 <Method boolean getPacked()>
	//*  65  117:aload_1         
	//*  66  118:invokevirtual   #287 <Method boolean getPacked()>
	//*  67  121:icmpne          129
				flag1 = true;
	//   68  124:iconst_1        
	//   69  125:istore_3        
			else
	//*  70  126:goto            131
				flag1 = false;
	//   71  129:iconst_0        
	//   72  130:istore_3        
		if(flag1 && hasJstype() == ((DescriptorProtos$FieldOptions) (obj)).hasJstype())
	//*  73  131:iload_3         
	//*  74  132:ifeq            151
	//*  75  135:aload_0         
	//*  76  136:invokevirtual   #290 <Method boolean hasJstype()>
	//*  77  139:aload_1         
	//*  78  140:invokevirtual   #290 <Method boolean hasJstype()>
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
		if(hasJstype())
	//*  87  155:aload_0         
	//*  88  156:invokevirtual   #290 <Method boolean hasJstype()>
	//*  89  159:ifeq            184
			if(flag && jstype_ == ((DescriptorProtos$FieldOptions) (obj)).jstype_)
	//*  90  162:iload_2         
	//*  91  163:ifeq            182
	//*  92  166:aload_0         
	//*  93  167:getfield        #83  <Field int jstype_>
	//*  94  170:aload_1         
	//*  95  171:getfield        #83  <Field int jstype_>
	//*  96  174:icmpne          182
				flag1 = true;
	//   97  177:iconst_1        
	//   98  178:istore_3        
			else
	//*  99  179:goto            184
				flag1 = false;
	//  100  182:iconst_0        
	//  101  183:istore_3        
		if(flag1 && hasLazy() == ((DescriptorProtos$FieldOptions) (obj)).hasLazy())
	//* 102  184:iload_3         
	//* 103  185:ifeq            204
	//* 104  188:aload_0         
	//* 105  189:invokevirtual   #293 <Method boolean hasLazy()>
	//* 106  192:aload_1         
	//* 107  193:invokevirtual   #293 <Method boolean hasLazy()>
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
		if(hasLazy())
	//* 116  208:aload_0         
	//* 117  209:invokevirtual   #293 <Method boolean hasLazy()>
	//* 118  212:ifeq            237
			if(flag && getLazy() == ((DescriptorProtos$FieldOptions) (obj)).getLazy())
	//* 119  215:iload_2         
	//* 120  216:ifeq            235
	//* 121  219:aload_0         
	//* 122  220:invokevirtual   #296 <Method boolean getLazy()>
	//* 123  223:aload_1         
	//* 124  224:invokevirtual   #296 <Method boolean getLazy()>
	//* 125  227:icmpne          235
				flag1 = true;
	//  126  230:iconst_1        
	//  127  231:istore_3        
			else
	//* 128  232:goto            237
				flag1 = false;
	//  129  235:iconst_0        
	//  130  236:istore_3        
		if(flag1 && hasDeprecated() == ((DescriptorProtos$FieldOptions) (obj)).hasDeprecated())
	//* 131  237:iload_3         
	//* 132  238:ifeq            257
	//* 133  241:aload_0         
	//* 134  242:invokevirtual   #299 <Method boolean hasDeprecated()>
	//* 135  245:aload_1         
	//* 136  246:invokevirtual   #299 <Method boolean hasDeprecated()>
	//* 137  249:icmpne          257
			flag = true;
	//  138  252:iconst_1        
	//  139  253:istore_2        
		else
	//* 140  254:goto            259
			flag = false;
	//  141  257:iconst_0        
	//  142  258:istore_2        
		flag1 = flag;
	//  143  259:iload_2         
	//  144  260:istore_3        
		if(hasDeprecated())
	//* 145  261:aload_0         
	//* 146  262:invokevirtual   #299 <Method boolean hasDeprecated()>
	//* 147  265:ifeq            290
			if(flag && getDeprecated() == ((DescriptorProtos$FieldOptions) (obj)).getDeprecated())
	//* 148  268:iload_2         
	//* 149  269:ifeq            288
	//* 150  272:aload_0         
	//* 151  273:invokevirtual   #302 <Method boolean getDeprecated()>
	//* 152  276:aload_1         
	//* 153  277:invokevirtual   #302 <Method boolean getDeprecated()>
	//* 154  280:icmpne          288
				flag1 = true;
	//  155  283:iconst_1        
	//  156  284:istore_3        
			else
	//* 157  285:goto            290
				flag1 = false;
	//  158  288:iconst_0        
	//  159  289:istore_3        
		if(flag1 && hasWeak() == ((DescriptorProtos$FieldOptions) (obj)).hasWeak())
	//* 160  290:iload_3         
	//* 161  291:ifeq            310
	//* 162  294:aload_0         
	//* 163  295:invokevirtual   #305 <Method boolean hasWeak()>
	//* 164  298:aload_1         
	//* 165  299:invokevirtual   #305 <Method boolean hasWeak()>
	//* 166  302:icmpne          310
			flag = true;
	//  167  305:iconst_1        
	//  168  306:istore_2        
		else
	//* 169  307:goto            312
			flag = false;
	//  170  310:iconst_0        
	//  171  311:istore_2        
		flag1 = flag;
	//  172  312:iload_2         
	//  173  313:istore_3        
		if(hasWeak())
	//* 174  314:aload_0         
	//* 175  315:invokevirtual   #305 <Method boolean hasWeak()>
	//* 176  318:ifeq            343
			if(flag && getWeak() == ((DescriptorProtos$FieldOptions) (obj)).getWeak())
	//* 177  321:iload_2         
	//* 178  322:ifeq            341
	//* 179  325:aload_0         
	//* 180  326:invokevirtual   #308 <Method boolean getWeak()>
	//* 181  329:aload_1         
	//* 182  330:invokevirtual   #308 <Method boolean getWeak()>
	//* 183  333:icmpne          341
				flag1 = true;
	//  184  336:iconst_1        
	//  185  337:istore_3        
			else
	//* 186  338:goto            343
				flag1 = false;
	//  187  341:iconst_0        
	//  188  342:istore_3        
		if(flag1 && getUninterpretedOptionList().equals(((Object) (((DescriptorProtos$FieldOptions) (obj)).getUninterpretedOptionList()))))
	//* 189  343:iload_3         
	//* 190  344:ifeq            368
	//* 191  347:aload_0         
	//* 192  348:invokevirtual   #311 <Method List getUninterpretedOptionList()>
	//* 193  351:aload_1         
	//* 194  352:invokevirtual   #311 <Method List getUninterpretedOptionList()>
	//* 195  355:invokeinterface #312 <Method boolean List.equals(Object)>
	//* 196  360:ifeq            368
			flag = true;
	//  197  363:iconst_1        
	//  198  364:istore_2        
		else
	//* 199  365:goto            370
			flag = false;
	//  200  368:iconst_0        
	//  201  369:istore_2        
		if(flag && unknownFields.equals(((Object) (((DescriptorProtos$FieldOptions) (obj)).unknownFields))))
	//* 202  370:iload_2         
	//* 203  371:ifeq            393
	//* 204  374:aload_0         
	//* 205  375:getfield        #171 <Field UnknownFieldSet unknownFields>
	//* 206  378:aload_1         
	//* 207  379:getfield        #171 <Field UnknownFieldSet unknownFields>
	//* 208  382:invokevirtual   #313 <Method boolean UnknownFieldSet.equals(Object)>
	//* 209  385:ifeq            393
			flag = true;
	//  210  388:iconst_1        
	//  211  389:istore_2        
		else
	//* 212  390:goto            395
			flag = false;
	//  213  393:iconst_0        
	//  214  394:istore_2        
		return flag && getExtensionFields().equals(((Object) (((DescriptorProtos$FieldOptions) (obj)).getExtensionFields())));
	//  215  395:iload_2         
	//  216  396:ifeq            417
	//  217  399:aload_0         
	//  218  400:invokevirtual   #317 <Method Map getExtensionFields()>
	//  219  403:aload_1         
	//  220  404:invokevirtual   #317 <Method Map getExtensionFields()>
	//  221  407:invokeinterface #320 <Method boolean Map.equals(Object)>
	//  222  412:ifeq            417
	//  223  415:iconst_1        
	//  224  416:ireturn         
	//  225  417:iconst_0        
	//  226  418:ireturn         
	}

	public CType getCtype()
	{
		CType ctype = CType.valueOf(ctype_);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int ctype_>
	//    2    4:invokestatic    #128 <Method DescriptorProtos$FieldOptions$CType DescriptorProtos$FieldOptions$CType.valueOf(int)>
	//    3    7:astore_1        
		if(ctype == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return CType.STRING;
	//    6   12:getstatic       #326 <Field DescriptorProtos$FieldOptions$CType DescriptorProtos$FieldOptions$CType.STRING>
	//    7   15:areturn         
		else
			return ctype;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public DescriptorProtos$FieldOptions getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #70  <Field DescriptorProtos$FieldOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method DescriptorProtos$FieldOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method DescriptorProtos$FieldOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public JSType getJstype()
	{
		JSType jstype = JSType.valueOf(jstype_);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int jstype_>
	//    2    4:invokestatic    #143 <Method DescriptorProtos$FieldOptions$JSType DescriptorProtos$FieldOptions$JSType.valueOf(int)>
	//    3    7:astore_1        
		if(jstype == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return JSType.JS_NORMAL;
	//    6   12:getstatic       #337 <Field DescriptorProtos$FieldOptions$JSType DescriptorProtos$FieldOptions$JSType.JS_NORMAL>
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
	//    1    1:getfield        #85  <Field boolean lazy_>
	//    2    4:ireturn         
	}

	public boolean getPacked()
	{
		return packed_;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean packed_>
	//    2    4:ireturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #73  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field int memoizedSize>
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
	//*  11   15:getfield        #136 <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			j = CodedOutputStream.computeEnumSize(1, ctype_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #79  <Field int ctype_>
	//   19   29:invokestatic    #348 <Method int CodedOutputStream.computeEnumSize(int, int)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_2        
		i = j;
	//   23   35:iload_2         
	//   24   36:istore_1        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #136 <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          58
			i = j + CodedOutputStream.computeBoolSize(2, packed_);
	//   31   47:iload_2         
	//   32   48:iconst_2        
	//   33   49:aload_0         
	//   34   50:getfield        #81  <Field boolean packed_>
	//   35   53:invokestatic    #352 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   36   56:iadd            
	//   37   57:istore_1        
		j = i;
	//   38   58:iload_1         
	//   39   59:istore_2        
		if((bitField0_ & 0x10) == 16)
	//*  40   60:aload_0         
	//*  41   61:getfield        #136 <Field int bitField0_>
	//*  42   64:bipush          16
	//*  43   66:iand            
	//*  44   67:bipush          16
	//*  45   69:icmpne          83
			j = i + CodedOutputStream.computeBoolSize(3, deprecated_);
	//   46   72:iload_1         
	//   47   73:iconst_3        
	//   48   74:aload_0         
	//   49   75:getfield        #87  <Field boolean deprecated_>
	//   50   78:invokestatic    #352 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   51   81:iadd            
	//   52   82:istore_2        
		i = j;
	//   53   83:iload_2         
	//   54   84:istore_1        
		if((bitField0_ & 8) == 8)
	//*  55   85:aload_0         
	//*  56   86:getfield        #136 <Field int bitField0_>
	//*  57   89:bipush          8
	//*  58   91:iand            
	//*  59   92:bipush          8
	//*  60   94:icmpne          108
			i = j + CodedOutputStream.computeBoolSize(5, lazy_);
	//   61   97:iload_2         
	//   62   98:iconst_5        
	//   63   99:aload_0         
	//   64  100:getfield        #85  <Field boolean lazy_>
	//   65  103:invokestatic    #352 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   66  106:iadd            
	//   67  107:istore_1        
		j = i;
	//   68  108:iload_1         
	//   69  109:istore_2        
		if((bitField0_ & 4) == 4)
	//*  70  110:aload_0         
	//*  71  111:getfield        #136 <Field int bitField0_>
	//*  72  114:iconst_4        
	//*  73  115:iand            
	//*  74  116:iconst_4        
	//*  75  117:icmpne          132
			j = i + CodedOutputStream.computeEnumSize(6, jstype_);
	//   76  120:iload_1         
	//   77  121:bipush          6
	//   78  123:aload_0         
	//   79  124:getfield        #83  <Field int jstype_>
	//   80  127:invokestatic    #348 <Method int CodedOutputStream.computeEnumSize(int, int)>
	//   81  130:iadd            
	//   82  131:istore_2        
		i = j;
	//   83  132:iload_2         
	//   84  133:istore_1        
		if((bitField0_ & 0x20) == 32)
	//*  85  134:aload_0         
	//*  86  135:getfield        #136 <Field int bitField0_>
	//*  87  138:bipush          32
	//*  88  140:iand            
	//*  89  141:bipush          32
	//*  90  143:icmpne          158
			i = j + CodedOutputStream.computeBoolSize(10, weak_);
	//   91  146:iload_2         
	//   92  147:bipush          10
	//   93  149:aload_0         
	//   94  150:getfield        #89  <Field boolean weak_>
	//   95  153:invokestatic    #352 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   96  156:iadd            
	//   97  157:istore_1        
		for(int k = 0; k < uninterpretedOption_.size(); k++)
	//*  98  158:iconst_0        
	//*  99  159:istore_2        
	//* 100  160:iload_2         
	//* 101  161:aload_0         
	//* 102  162:getfield        #97  <Field List uninterpretedOption_>
	//* 103  165:invokeinterface #355 <Method int List.size()>
	//* 104  170:icmpge          202
			i += CodedOutputStream.computeMessageSize(999, (MessageLite)uninterpretedOption_.get(k));
	//  105  173:iload_1         
	//  106  174:sipush          999
	//  107  177:aload_0         
	//  108  178:getfield        #97  <Field List uninterpretedOption_>
	//  109  181:iload_2         
	//  110  182:invokeinterface #359 <Method Object List.get(int)>
	//  111  187:checkcast       #361 <Class MessageLite>
	//  112  190:invokestatic    #365 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  113  193:iadd            
	//  114  194:istore_1        

	//  115  195:iload_2         
	//  116  196:iconst_1        
	//  117  197:iadd            
	//  118  198:istore_2        
	//* 119  199:goto            160
		i = i + extensionsSerializedSize() + unknownFields.getSerializedSize();
	//  120  202:iload_1         
	//  121  203:aload_0         
	//  122  204:invokevirtual   #368 <Method int extensionsSerializedSize()>
	//  123  207:iadd            
	//  124  208:aload_0         
	//  125  209:getfield        #171 <Field UnknownFieldSet unknownFields>
	//  126  212:invokevirtual   #370 <Method int UnknownFieldSet.getSerializedSize()>
	//  127  215:iadd            
	//  128  216:istore_1        
		memoizedSize = i;
	//  129  217:aload_0         
	//  130  218:iload_1         
	//  131  219:putfield        #342 <Field int memoizedSize>
		return i;
	//  132  222:iload_1         
	//  133  223:ireturn         
	}

	public Option getUninterpretedOption(int i)
	{
		return (Option)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #359 <Method Object List.get(int)>
	//    4   10:checkcast       #148 <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		return uninterpretedOption_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field List uninterpretedOption_>
	//    2    4:invokeinterface #355 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public OptionOrBuilder getUninterpretedOptionOrBuilder(int i)
	{
		return (OptionOrBuilder)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #359 <Method Object List.get(int)>
	//    4   10:checkcast       #378 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    5   13:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean getWeak()
	{
		return weak_;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field boolean weak_>
	//    2    4:ireturn         
	}

	public boolean hasCtype()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int bitField0_>
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
	//    1    1:getfield        #136 <Field int bitField0_>
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
	//    1    1:getfield        #136 <Field int bitField0_>
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
	//    1    1:getfield        #136 <Field int bitField0_>
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
	//    1    1:getfield        #136 <Field int bitField0_>
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
	//    1    1:getfield        #136 <Field int bitField0_>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #385 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #385 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #387 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #391 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasCtype())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #281 <Method boolean hasCtype()>
	//*  15   29:ifeq            47
			i = (j * 37 + 1) * 53 + ctype_;
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:getfield        #79  <Field int ctype_>
	//   25   45:iadd            
	//   26   46:istore_1        
		j = i;
	//   27   47:iload_1         
	//   28   48:istore_2        
		if(hasPacked())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #284 <Method boolean hasPacked()>
	//*  31   53:ifeq            74
			j = (i * 37 + 2) * 53 + Internal.hashBoolean(getPacked());
	//   32   56:iload_1         
	//   33   57:bipush          37
	//   34   59:imul            
	//   35   60:iconst_2        
	//   36   61:iadd            
	//   37   62:bipush          53
	//   38   64:imul            
	//   39   65:aload_0         
	//   40   66:invokevirtual   #287 <Method boolean getPacked()>
	//   41   69:invokestatic    #397 <Method int Internal.hashBoolean(boolean)>
	//   42   72:iadd            
	//   43   73:istore_2        
		i = j;
	//   44   74:iload_2         
	//   45   75:istore_1        
		if(hasJstype())
	//*  46   76:aload_0         
	//*  47   77:invokevirtual   #290 <Method boolean hasJstype()>
	//*  48   80:ifeq            99
			i = (j * 37 + 6) * 53 + jstype_;
	//   49   83:iload_2         
	//   50   84:bipush          37
	//   51   86:imul            
	//   52   87:bipush          6
	//   53   89:iadd            
	//   54   90:bipush          53
	//   55   92:imul            
	//   56   93:aload_0         
	//   57   94:getfield        #83  <Field int jstype_>
	//   58   97:iadd            
	//   59   98:istore_1        
		j = i;
	//   60   99:iload_1         
	//   61  100:istore_2        
		if(hasLazy())
	//*  62  101:aload_0         
	//*  63  102:invokevirtual   #293 <Method boolean hasLazy()>
	//*  64  105:ifeq            126
			j = (i * 37 + 5) * 53 + Internal.hashBoolean(getLazy());
	//   65  108:iload_1         
	//   66  109:bipush          37
	//   67  111:imul            
	//   68  112:iconst_5        
	//   69  113:iadd            
	//   70  114:bipush          53
	//   71  116:imul            
	//   72  117:aload_0         
	//   73  118:invokevirtual   #296 <Method boolean getLazy()>
	//   74  121:invokestatic    #397 <Method int Internal.hashBoolean(boolean)>
	//   75  124:iadd            
	//   76  125:istore_2        
		i = j;
	//   77  126:iload_2         
	//   78  127:istore_1        
		if(hasDeprecated())
	//*  79  128:aload_0         
	//*  80  129:invokevirtual   #299 <Method boolean hasDeprecated()>
	//*  81  132:ifeq            153
			i = (j * 37 + 3) * 53 + Internal.hashBoolean(getDeprecated());
	//   82  135:iload_2         
	//   83  136:bipush          37
	//   84  138:imul            
	//   85  139:iconst_3        
	//   86  140:iadd            
	//   87  141:bipush          53
	//   88  143:imul            
	//   89  144:aload_0         
	//   90  145:invokevirtual   #302 <Method boolean getDeprecated()>
	//   91  148:invokestatic    #397 <Method int Internal.hashBoolean(boolean)>
	//   92  151:iadd            
	//   93  152:istore_1        
		j = i;
	//   94  153:iload_1         
	//   95  154:istore_2        
		if(hasWeak())
	//*  96  155:aload_0         
	//*  97  156:invokevirtual   #305 <Method boolean hasWeak()>
	//*  98  159:ifeq            181
			j = (i * 37 + 10) * 53 + Internal.hashBoolean(getWeak());
	//   99  162:iload_1         
	//  100  163:bipush          37
	//  101  165:imul            
	//  102  166:bipush          10
	//  103  168:iadd            
	//  104  169:bipush          53
	//  105  171:imul            
	//  106  172:aload_0         
	//  107  173:invokevirtual   #308 <Method boolean getWeak()>
	//  108  176:invokestatic    #397 <Method int Internal.hashBoolean(boolean)>
	//  109  179:iadd            
	//  110  180:istore_2        
		i = j;
	//  111  181:iload_2         
	//  112  182:istore_1        
		if(getUninterpretedOptionCount() > 0)
	//* 113  183:aload_0         
	//* 114  184:invokevirtual   #399 <Method int getUninterpretedOptionCount()>
	//* 115  187:ifle            212
			i = (j * 37 + 999) * 53 + getUninterpretedOptionList().hashCode();
	//  116  190:iload_2         
	//  117  191:bipush          37
	//  118  193:imul            
	//  119  194:sipush          999
	//  120  197:iadd            
	//  121  198:bipush          53
	//  122  200:imul            
	//  123  201:aload_0         
	//  124  202:invokevirtual   #311 <Method List getUninterpretedOptionList()>
	//  125  205:invokeinterface #400 <Method int List.hashCode()>
	//  126  210:iadd            
	//  127  211:istore_1        
		i = hashFields(i, getExtensionFields()) * 29 + unknownFields.hashCode();
	//  128  212:iload_1         
	//  129  213:aload_0         
	//  130  214:invokevirtual   #317 <Method Map getExtensionFields()>
	//  131  217:invokestatic    #404 <Method int hashFields(int, Map)>
	//  132  220:bipush          29
	//  133  222:imul            
	//  134  223:aload_0         
	//  135  224:getfield        #171 <Field UnknownFieldSet unknownFields>
	//  136  227:invokevirtual   #405 <Method int UnknownFieldSet.hashCode()>
	//  137  230:iadd            
	//  138  231:istore_1        
		memoizedHashCode = i;
	//  139  232:aload_0         
	//  140  233:iload_1         
	//  141  234:putfield        #385 <Field int memoizedHashCode>
		return i;
	//  142  237:iload_1         
	//  143  238:ireturn         
	}

	protected orTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$18800().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FieldOptions, com/google/protobuf/DescriptorProtos$FieldOptions$Builder);
	//    0    0:invokestatic    #410 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$18800()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$FieldOptions>
	//    2    5:ldc1            #14  <Class DescriptorProtos$FieldOptions$Builder>
	//    3    7:invokevirtual   #416 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field byte memoizedIsInitialized>
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
	//*  16   22:invokevirtual   #399 <Method int getUninterpretedOptionCount()>
	//*  17   25:icmpge          53
			if(!getUninterpretedOption(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #419 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*  21   33:invokevirtual   #421 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #77  <Field byte memoizedIsInitialized>
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
	//*  34   54:invokevirtual   #424 <Method boolean extensionsAreInitialized()>
	//*  35   57:ifne            67
		{
			memoizedIsInitialized = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #77  <Field byte memoizedIsInitialized>
			return false;
	//   39   65:iconst_0        
	//   40   66:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   41   67:aload_0         
	//   42   68:iconst_1        
	//   43   69:putfield        #77  <Field byte memoizedIsInitialized>
			return true;
	//   44   72:iconst_1        
	//   45   73:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #427 <Method DescriptorProtos$FieldOptions$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(nt nt)
	{
		return new Builder(nt, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #14  <Class DescriptorProtos$FieldOptions$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #431 <Method void DescriptorProtos$FieldOptions$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #434 <Method DescriptorProtos$FieldOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(nt nt)
	{
		return ((Message.Builder) (newBuilderForType(nt)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #437 <Method DescriptorProtos$FieldOptions$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #434 <Method DescriptorProtos$FieldOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #70  <Field DescriptorProtos$FieldOptions DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #14  <Class DescriptorProtos$FieldOptions$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #441 <Method void DescriptorProtos$FieldOptions$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #14  <Class DescriptorProtos$FieldOptions$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #441 <Method void DescriptorProtos$FieldOptions$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #220 <Method DescriptorProtos$FieldOptions$Builder DescriptorProtos$FieldOptions$Builder.mergeFrom(DescriptorProtos$FieldOptions)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #216 <Method DescriptorProtos$FieldOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #216 <Method DescriptorProtos$FieldOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		essage.ExtensionWriter extensionwriter = newExtensionWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #447 <Method GeneratedMessageV3$ExtendableMessage$ExtensionWriter newExtensionWriter()>
	//    2    4:astore_3        
		if((bitField0_ & 1) == 1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #136 <Field int bitField0_>
	//*   5    9:iconst_1        
	//*   6   10:iand            
	//*   7   11:iconst_1        
	//*   8   12:icmpne          24
			codedoutputstream.writeEnum(1, ctype_);
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:aload_0         
	//   12   18:getfield        #79  <Field int ctype_>
	//   13   21:invokevirtual   #451 <Method void CodedOutputStream.writeEnum(int, int)>
		if((bitField0_ & 2) == 2)
	//*  14   24:aload_0         
	//*  15   25:getfield        #136 <Field int bitField0_>
	//*  16   28:iconst_2        
	//*  17   29:iand            
	//*  18   30:iconst_2        
	//*  19   31:icmpne          43
			codedoutputstream.writeBool(2, packed_);
	//   20   34:aload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #81  <Field boolean packed_>
	//   24   40:invokevirtual   #455 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 0x10) == 16)
	//*  25   43:aload_0         
	//*  26   44:getfield        #136 <Field int bitField0_>
	//*  27   47:bipush          16
	//*  28   49:iand            
	//*  29   50:bipush          16
	//*  30   52:icmpne          64
			codedoutputstream.writeBool(3, deprecated_);
	//   31   55:aload_1         
	//   32   56:iconst_3        
	//   33   57:aload_0         
	//   34   58:getfield        #87  <Field boolean deprecated_>
	//   35   61:invokevirtual   #455 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 8) == 8)
	//*  36   64:aload_0         
	//*  37   65:getfield        #136 <Field int bitField0_>
	//*  38   68:bipush          8
	//*  39   70:iand            
	//*  40   71:bipush          8
	//*  41   73:icmpne          85
			codedoutputstream.writeBool(5, lazy_);
	//   42   76:aload_1         
	//   43   77:iconst_5        
	//   44   78:aload_0         
	//   45   79:getfield        #85  <Field boolean lazy_>
	//   46   82:invokevirtual   #455 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 4) == 4)
	//*  47   85:aload_0         
	//*  48   86:getfield        #136 <Field int bitField0_>
	//*  49   89:iconst_4        
	//*  50   90:iand            
	//*  51   91:iconst_4        
	//*  52   92:icmpne          105
			codedoutputstream.writeEnum(6, jstype_);
	//   53   95:aload_1         
	//   54   96:bipush          6
	//   55   98:aload_0         
	//   56   99:getfield        #83  <Field int jstype_>
	//   57  102:invokevirtual   #451 <Method void CodedOutputStream.writeEnum(int, int)>
		if((bitField0_ & 0x20) == 32)
	//*  58  105:aload_0         
	//*  59  106:getfield        #136 <Field int bitField0_>
	//*  60  109:bipush          32
	//*  61  111:iand            
	//*  62  112:bipush          32
	//*  63  114:icmpne          127
			codedoutputstream.writeBool(10, weak_);
	//   64  117:aload_1         
	//   65  118:bipush          10
	//   66  120:aload_0         
	//   67  121:getfield        #89  <Field boolean weak_>
	//   68  124:invokevirtual   #455 <Method void CodedOutputStream.writeBool(int, boolean)>
		for(int i = 0; i < uninterpretedOption_.size(); i++)
	//*  69  127:iconst_0        
	//*  70  128:istore_2        
	//*  71  129:iload_2         
	//*  72  130:aload_0         
	//*  73  131:getfield        #97  <Field List uninterpretedOption_>
	//*  74  134:invokeinterface #355 <Method int List.size()>
	//*  75  139:icmpge          169
			codedoutputstream.writeMessage(999, (MessageLite)uninterpretedOption_.get(i));
	//   76  142:aload_1         
	//   77  143:sipush          999
	//   78  146:aload_0         
	//   79  147:getfield        #97  <Field List uninterpretedOption_>
	//   80  150:iload_2         
	//   81  151:invokeinterface #359 <Method Object List.get(int)>
	//   82  156:checkcast       #361 <Class MessageLite>
	//   83  159:invokevirtual   #459 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   84  162:iload_2         
	//   85  163:iconst_1        
	//   86  164:iadd            
	//   87  165:istore_2        
	//*  88  166:goto            129
		extensionwriter.writeUntil(0x20000000, codedoutputstream);
	//   89  169:aload_3         
	//   90  170:ldc2            #460 <Int 0x20000000>
	//   91  173:aload_1         
	//   92  174:invokevirtual   #466 <Method void GeneratedMessageV3$ExtendableMessage$ExtensionWriter.writeUntil(int, CodedOutputStream)>
		unknownFields.writeTo(codedoutputstream);
	//   93  177:aload_0         
	//   94  178:getfield        #171 <Field UnknownFieldSet unknownFields>
	//   95  181:aload_1         
	//   96  182:invokevirtual   #468 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   97  185:return          
	}

	public static final int CTYPE_FIELD_NUMBER = 1;
	private static final DescriptorProtos$FieldOptions DEFAULT_INSTANCE = new DescriptorProtos$FieldOptions();
	public static final int DEPRECATED_FIELD_NUMBER = 3;
	public static final int JSTYPE_FIELD_NUMBER = 6;
	public static final int LAZY_FIELD_NUMBER = 5;
	public static final int PACKED_FIELD_NUMBER = 2;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.FieldOptions parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.FieldOptions(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$FieldOptions>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$FieldOptions(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$FieldOptions parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
	public static final int WEAK_FIELD_NUMBER = 10;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private int ctype_;
	private boolean deprecated_;
	private int jstype_;
	private boolean lazy_;
	private byte memoizedIsInitialized;
	private boolean packed_;
	private List uninterpretedOption_;
	private boolean weak_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$FieldOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void DescriptorProtos$FieldOptions()>
	//    3    7:putstatic       #70  <Field DescriptorProtos$FieldOptions DEFAULT_INSTANCE>
	//    4   10:new             #12  <Class DescriptorProtos$FieldOptions$1>
	//    5   13:dup             
	//    6   14:invokespecial   #71  <Method void DescriptorProtos$FieldOptions$1()>
	//    7   17:putstatic       #73  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static int access$19202(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions, int i)
	{
		descriptorprotos$fieldoptions.ctype_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field int ctype_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$19302(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions, boolean flag)
	{
		descriptorprotos$fieldoptions.packed_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field boolean packed_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$19402(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions, int i)
	{
		descriptorprotos$fieldoptions.jstype_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #83  <Field int jstype_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$19502(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions, boolean flag)
	{
		descriptorprotos$fieldoptions.lazy_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #85  <Field boolean lazy_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$19602(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions, boolean flag)
	{
		descriptorprotos$fieldoptions.deprecated_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field boolean deprecated_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$19702(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions, boolean flag)
	{
		descriptorprotos$fieldoptions.weak_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field boolean weak_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static List access$19800(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions)
	{
		return descriptorprotos$fieldoptions.uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

*/


/*
	static List access$19802(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions, List list)
	{
		descriptorprotos$fieldoptions.uninterpretedOption_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field List uninterpretedOption_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$19902(DescriptorProtos$FieldOptions descriptorprotos$fieldoptions, int i)
	{
		descriptorprotos$fieldoptions.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #136 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$FieldOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void GeneratedMessageV3$ExtendableMessage()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #77  <Field byte memoizedIsInitialized>
		ctype_ = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #79  <Field int ctype_>
		packed_ = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #81  <Field boolean packed_>
		jstype_ = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #83  <Field int jstype_>
		lazy_ = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #85  <Field boolean lazy_>
		deprecated_ = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #87  <Field boolean deprecated_>
		weak_ = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #89  <Field boolean weak_>
		uninterpretedOption_ = Collections.emptyList();
	//   23   39:aload_0         
	//   24   40:invokestatic    #95  <Method List Collections.emptyList()>
	//   25   43:putfield        #97  <Field List uninterpretedOption_>
	//   26   46:return          
	}

	private DescriptorProtos$FieldOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void DescriptorProtos$FieldOptions()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #104 <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #105 <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #111 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          10
		flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L18:
		int k;
		int l;
		int i1;
		if(flag)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            596
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
	//   23   41:invokevirtual   #117 <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		j1;
	//   25   46:iload           9
		JVM INSTR lookupswitch 8: default 696
	//	               0: 699
	//	               8: 158
	//	               16: 254
	//	               24: 296
	//	               40: 339
	//	               48: 382
	//	               80: 479
	//	               7994: 522;
	//   26   48:lookupswitch    8: default 696
	//	               0: 699
	//	               8: 158
	//	               16: 254
	//	               24: 296
	//	               40: 339
	//	               48: 382
	//	               80: 479
	//	               7994: 522
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
		int j;
		j = i;
	//   27  124:iload_3         
	//   28  125:istore          4
		l = i;
	//   29  127:iload_3         
	//   30  128:istore          6
		i1 = i;
	//   31  130:iload_3         
	//   32  131:istore          7
		k = i;
	//   33  133:iload_3         
	//   34  134:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, j1))
	//*  35  136:aload_0         
	//*  36  137:aload_1         
	//*  37  138:aload           10
	//*  38  140:aload_2         
	//*  39  141:iload           9
	//*  40  143:invokevirtual   #121 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  146:ifne            590
		{
			flag = true;
	//   42  149:iconst_1        
	//   43  150:istore          8
			j = i;
	//   44  152:iload_3         
	//   45  153:istore          4
		}
		  goto _L10
	//*  46  155:goto            590
_L3:
		l = i;
	//   47  158:iload_3         
	//   48  159:istore          6
		i1 = i;
	//   49  161:iload_3         
	//   50  162:istore          7
		k = i;
	//   51  164:iload_3         
	//   52  165:istore          5
		j = codedinputstream.readEnum();
	//   53  167:aload_1         
	//   54  168:invokevirtual   #124 <Method int CodedInputStream.readEnum()>
	//   55  171:istore          4
		l = i;
	//   56  173:iload_3         
	//   57  174:istore          6
		i1 = i;
	//   58  176:iload_3         
	//   59  177:istore          7
		k = i;
	//   60  179:iload_3         
	//   61  180:istore          5
		if(CType.valueOf(j) != null) goto _L12; else goto _L11
	//   62  182:iload           4
	//   63  184:invokestatic    #128 <Method DescriptorProtos$FieldOptions$CType DescriptorProtos$FieldOptions$CType.valueOf(int)>
	//   64  187:ifnonnull       214
_L11:
		l = i;
	//   65  190:iload_3         
	//   66  191:istore          6
		i1 = i;
	//   67  193:iload_3         
	//   68  194:istore          7
		k = i;
	//   69  196:iload_3         
	//   70  197:istore          5
		builder.mergeVarintField(1, j);
	//   71  199:aload           10
	//   72  201:iconst_1        
	//   73  202:iload           4
	//   74  204:invokevirtual   #134 <Method UnknownFieldSet$Builder UnknownFieldSet$Builder.mergeVarintField(int, int)>
	//   75  207:pop             
		j = i;
	//   76  208:iload_3         
	//   77  209:istore          4
		  goto _L10
	//*  78  211:goto            590
_L12:
		l = i;
	//   79  214:iload_3         
	//   80  215:istore          6
		i1 = i;
	//   81  217:iload_3         
	//   82  218:istore          7
		k = i;
	//   83  220:iload_3         
	//   84  221:istore          5
		bitField0_ = bitField0_ | 1;
	//   85  223:aload_0         
	//   86  224:aload_0         
	//   87  225:getfield        #136 <Field int bitField0_>
	//   88  228:iconst_1        
	//   89  229:ior             
	//   90  230:putfield        #136 <Field int bitField0_>
		l = i;
	//   91  233:iload_3         
	//   92  234:istore          6
		i1 = i;
	//   93  236:iload_3         
	//   94  237:istore          7
		k = i;
	//   95  239:iload_3         
	//   96  240:istore          5
		ctype_ = j;
	//   97  242:aload_0         
	//   98  243:iload           4
	//   99  245:putfield        #79  <Field int ctype_>
		j = i;
	//  100  248:iload_3         
	//  101  249:istore          4
		  goto _L10
	//* 102  251:goto            590
_L4:
		l = i;
	//  103  254:iload_3         
	//  104  255:istore          6
		i1 = i;
	//  105  257:iload_3         
	//  106  258:istore          7
		k = i;
	//  107  260:iload_3         
	//  108  261:istore          5
		bitField0_ = bitField0_ | 2;
	//  109  263:aload_0         
	//  110  264:aload_0         
	//  111  265:getfield        #136 <Field int bitField0_>
	//  112  268:iconst_2        
	//  113  269:ior             
	//  114  270:putfield        #136 <Field int bitField0_>
		l = i;
	//  115  273:iload_3         
	//  116  274:istore          6
		i1 = i;
	//  117  276:iload_3         
	//  118  277:istore          7
		k = i;
	//  119  279:iload_3         
	//  120  280:istore          5
		packed_ = codedinputstream.readBool();
	//  121  282:aload_0         
	//  122  283:aload_1         
	//  123  284:invokevirtual   #140 <Method boolean CodedInputStream.readBool()>
	//  124  287:putfield        #81  <Field boolean packed_>
		j = i;
	//  125  290:iload_3         
	//  126  291:istore          4
		  goto _L10
	//* 127  293:goto            590
_L5:
		l = i;
	//  128  296:iload_3         
	//  129  297:istore          6
		i1 = i;
	//  130  299:iload_3         
	//  131  300:istore          7
		k = i;
	//  132  302:iload_3         
	//  133  303:istore          5
		bitField0_ = bitField0_ | 0x10;
	//  134  305:aload_0         
	//  135  306:aload_0         
	//  136  307:getfield        #136 <Field int bitField0_>
	//  137  310:bipush          16
	//  138  312:ior             
	//  139  313:putfield        #136 <Field int bitField0_>
		l = i;
	//  140  316:iload_3         
	//  141  317:istore          6
		i1 = i;
	//  142  319:iload_3         
	//  143  320:istore          7
		k = i;
	//  144  322:iload_3         
	//  145  323:istore          5
		deprecated_ = codedinputstream.readBool();
	//  146  325:aload_0         
	//  147  326:aload_1         
	//  148  327:invokevirtual   #140 <Method boolean CodedInputStream.readBool()>
	//  149  330:putfield        #87  <Field boolean deprecated_>
		j = i;
	//  150  333:iload_3         
	//  151  334:istore          4
		  goto _L10
	//* 152  336:goto            590
_L6:
		l = i;
	//  153  339:iload_3         
	//  154  340:istore          6
		i1 = i;
	//  155  342:iload_3         
	//  156  343:istore          7
		k = i;
	//  157  345:iload_3         
	//  158  346:istore          5
		bitField0_ = bitField0_ | 8;
	//  159  348:aload_0         
	//  160  349:aload_0         
	//  161  350:getfield        #136 <Field int bitField0_>
	//  162  353:bipush          8
	//  163  355:ior             
	//  164  356:putfield        #136 <Field int bitField0_>
		l = i;
	//  165  359:iload_3         
	//  166  360:istore          6
		i1 = i;
	//  167  362:iload_3         
	//  168  363:istore          7
		k = i;
	//  169  365:iload_3         
	//  170  366:istore          5
		lazy_ = codedinputstream.readBool();
	//  171  368:aload_0         
	//  172  369:aload_1         
	//  173  370:invokevirtual   #140 <Method boolean CodedInputStream.readBool()>
	//  174  373:putfield        #85  <Field boolean lazy_>
		j = i;
	//  175  376:iload_3         
	//  176  377:istore          4
		  goto _L10
	//* 177  379:goto            590
_L7:
		l = i;
	//  178  382:iload_3         
	//  179  383:istore          6
		i1 = i;
	//  180  385:iload_3         
	//  181  386:istore          7
		k = i;
	//  182  388:iload_3         
	//  183  389:istore          5
		j = codedinputstream.readEnum();
	//  184  391:aload_1         
	//  185  392:invokevirtual   #124 <Method int CodedInputStream.readEnum()>
	//  186  395:istore          4
		l = i;
	//  187  397:iload_3         
	//  188  398:istore          6
		i1 = i;
	//  189  400:iload_3         
	//  190  401:istore          7
		k = i;
	//  191  403:iload_3         
	//  192  404:istore          5
		if(JSType.valueOf(j) != null) goto _L14; else goto _L13
	//  193  406:iload           4
	//  194  408:invokestatic    #143 <Method DescriptorProtos$FieldOptions$JSType DescriptorProtos$FieldOptions$JSType.valueOf(int)>
	//  195  411:ifnonnull       439
_L13:
		l = i;
	//  196  414:iload_3         
	//  197  415:istore          6
		i1 = i;
	//  198  417:iload_3         
	//  199  418:istore          7
		k = i;
	//  200  420:iload_3         
	//  201  421:istore          5
		builder.mergeVarintField(6, j);
	//  202  423:aload           10
	//  203  425:bipush          6
	//  204  427:iload           4
	//  205  429:invokevirtual   #134 <Method UnknownFieldSet$Builder UnknownFieldSet$Builder.mergeVarintField(int, int)>
	//  206  432:pop             
		j = i;
	//  207  433:iload_3         
	//  208  434:istore          4
		  goto _L10
	//* 209  436:goto            590
_L14:
		l = i;
	//  210  439:iload_3         
	//  211  440:istore          6
		i1 = i;
	//  212  442:iload_3         
	//  213  443:istore          7
		k = i;
	//  214  445:iload_3         
	//  215  446:istore          5
		bitField0_ = bitField0_ | 4;
	//  216  448:aload_0         
	//  217  449:aload_0         
	//  218  450:getfield        #136 <Field int bitField0_>
	//  219  453:iconst_4        
	//  220  454:ior             
	//  221  455:putfield        #136 <Field int bitField0_>
		l = i;
	//  222  458:iload_3         
	//  223  459:istore          6
		i1 = i;
	//  224  461:iload_3         
	//  225  462:istore          7
		k = i;
	//  226  464:iload_3         
	//  227  465:istore          5
		jstype_ = j;
	//  228  467:aload_0         
	//  229  468:iload           4
	//  230  470:putfield        #83  <Field int jstype_>
		j = i;
	//  231  473:iload_3         
	//  232  474:istore          4
		  goto _L10
	//* 233  476:goto            590
_L8:
		l = i;
	//  234  479:iload_3         
	//  235  480:istore          6
		i1 = i;
	//  236  482:iload_3         
	//  237  483:istore          7
		k = i;
	//  238  485:iload_3         
	//  239  486:istore          5
		bitField0_ = bitField0_ | 0x20;
	//  240  488:aload_0         
	//  241  489:aload_0         
	//  242  490:getfield        #136 <Field int bitField0_>
	//  243  493:bipush          32
	//  244  495:ior             
	//  245  496:putfield        #136 <Field int bitField0_>
		l = i;
	//  246  499:iload_3         
	//  247  500:istore          6
		i1 = i;
	//  248  502:iload_3         
	//  249  503:istore          7
		k = i;
	//  250  505:iload_3         
	//  251  506:istore          5
		weak_ = codedinputstream.readBool();
	//  252  508:aload_0         
	//  253  509:aload_1         
	//  254  510:invokevirtual   #140 <Method boolean CodedInputStream.readBool()>
	//  255  513:putfield        #89  <Field boolean weak_>
		j = i;
	//  256  516:iload_3         
	//  257  517:istore          4
		  goto _L10
	//* 258  519:goto            590
_L9:
		j = i;
	//  259  522:iload_3         
	//  260  523:istore          4
		if((i & 0x40) == 64) goto _L16; else goto _L15
	//  261  525:iload_3         
	//  262  526:bipush          64
	//  263  528:iand            
	//  264  529:bipush          64
	//  265  531:icmpeq          560
_L15:
		l = i;
	//  266  534:iload_3         
	//  267  535:istore          6
		i1 = i;
	//  268  537:iload_3         
	//  269  538:istore          7
		k = i;
	//  270  540:iload_3         
	//  271  541:istore          5
		uninterpretedOption_ = ((List) (new ArrayList()));
	//  272  543:aload_0         
	//  273  544:new             #145 <Class ArrayList>
	//  274  547:dup             
	//  275  548:invokespecial   #146 <Method void ArrayList()>
	//  276  551:putfield        #97  <Field List uninterpretedOption_>
		j = i | 0x40;
	//  277  554:iload_3         
	//  278  555:bipush          64
	//  279  557:ior             
	//  280  558:istore          4
_L16:
		l = j;
	//  281  560:iload           4
	//  282  562:istore          6
		i1 = j;
	//  283  564:iload           4
	//  284  566:istore          7
		k = j;
	//  285  568:iload           4
	//  286  570:istore          5
		uninterpretedOption_.add(((Object) (codedinputstream.readMessage(Option.PARSER, extensionregistrylite))));
	//  287  572:aload_0         
	//  288  573:getfield        #97  <Field List uninterpretedOption_>
	//  289  576:aload_1         
	//  290  577:getstatic       #149 <Field Parser DescriptorProtos$UninterpretedOption.PARSER>
	//  291  580:aload_2         
	//  292  581:invokevirtual   #153 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  293  584:invokeinterface #159 <Method boolean List.add(Object)>
	//  294  589:pop             
_L10:
		i = j;
	//  295  590:iload           4
	//  296  592:istore_3        
		if(true) goto _L18; else goto _L17
	//  297  593:goto            26
_L17:
		if((i & 0x40) == 64)
	//* 298  596:iload_3         
	//* 299  597:bipush          64
	//* 300  599:iand            
	//* 301  600:bipush          64
	//* 302  602:icmpne          616
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  303  605:aload_0         
	//  304  606:aload_0         
	//  305  607:getfield        #97  <Field List uninterpretedOption_>
	//  306  610:invokestatic    #163 <Method List Collections.unmodifiableList(List)>
	//  307  613:putfield        #97  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  308  616:aload_0         
	//  309  617:aload           10
	//  310  619:invokevirtual   #167 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  311  622:putfield        #171 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  312  625:aload_0         
	//  313  626:invokevirtual   #174 <Method void makeExtensionsImmutable()>
		return;
	//  314  629:return          
		codedinputstream;
	//  315  630:astore_1        
		k = l;
	//  316  631:iload           6
	//  317  633:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  318  635:aload_1         
	//  319  636:aload_0         
	//  320  637:invokevirtual   #178 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  321  640:athrow          
		codedinputstream;
	//  322  641:astore_1        
		k = i1;
	//  323  642:iload           7
	//  324  644:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  325  646:new             #100 <Class InvalidProtocolBufferException>
	//  326  649:dup             
	//  327  650:aload_1         
	//  328  651:invokespecial   #181 <Method void InvalidProtocolBufferException(IOException)>
	//  329  654:aload_0         
	//  330  655:invokevirtual   #178 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  331  658:athrow          
		codedinputstream;
	//  332  659:astore_1        
		if((k & 0x40) == 64)
	//* 333  660:iload           5
	//* 334  662:bipush          64
	//* 335  664:iand            
	//* 336  665:bipush          64
	//* 337  667:icmpne          681
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  338  670:aload_0         
	//  339  671:aload_0         
	//  340  672:getfield        #97  <Field List uninterpretedOption_>
	//  341  675:invokestatic    #163 <Method List Collections.unmodifiableList(List)>
	//  342  678:putfield        #97  <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  343  681:aload_0         
	//  344  682:aload           10
	//  345  684:invokevirtual   #167 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  346  687:putfield        #171 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  347  690:aload_0         
	//  348  691:invokevirtual   #174 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  349  694:aload_1         
	//  350  695:athrow          
	//* 351  696:goto            124
_L2:
		flag = true;
	//  352  699:iconst_1        
	//  353  700:istore          8
		j = i;
	//  354  702:iload_3         
	//  355  703:istore          4
		  goto _L10
	//* 356  705:goto            590
	}

	DescriptorProtos$FieldOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #185 <Method void DescriptorProtos$FieldOptions(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$FieldOptions(uilder uilder)
	{
		super(uilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #188 <Method void GeneratedMessageV3$ExtendableMessage(GeneratedMessageV3$ExtendableBuilder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #77  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$FieldOptions(uilder uilder, DescriptorProtos._cls1 _pcls1)
	{
		this(uilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #192 <Method void DescriptorProtos$FieldOptions(GeneratedMessageV3$ExtendableBuilder)>
	//    3    5:return          
	}
}
