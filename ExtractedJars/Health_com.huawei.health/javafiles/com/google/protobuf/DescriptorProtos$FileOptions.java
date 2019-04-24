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
//			GeneratedMessageV3, Parser, ByteString, CodedOutputStream, 
//			MessageLite, Internal, ExtensionRegistryLite, Message, 
//			RepeatedFieldBuilderV3, ProtocolMessageEnum, AbstractParser

public static final class DescriptorProtos$FileOptions extends Message
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.ExtendableBuilder
		implements DescriptorProtos.FileOptionsOrBuilder
	{

		private void ensureUninterpretedOptionIsMutable()
		{
			if((bitField0_ & 0x40000) != 0x40000)
		//*   0    0:aload_0         
		//*   1    1:getfield        #87  <Field int bitField0_>
		//*   2    4:ldc1            #88  <Int 0x40000>
		//*   3    6:iand            
		//*   4    7:ldc1            #88  <Int 0x40000>
		//*   5    9:icmpeq          38
			{
				uninterpretedOption_ = ((List) (new ArrayList(((java.util.Collection) (uninterpretedOption_)))));
		//    6   12:aload_0         
		//    7   13:new             #90  <Class ArrayList>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #73  <Field List uninterpretedOption_>
		//   11   21:invokespecial   #93  <Method void ArrayList(java.util.Collection)>
		//   12   24:putfield        #73  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ | 0x40000;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #87  <Field int bitField0_>
		//   16   32:ldc1            #88  <Int 0x40000>
		//   17   34:ior             
		//   18   35:putfield        #87  <Field int bitField0_>
			}
		//   19   38:return          
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$14900();
		//    0    0:invokestatic    #98  <Method Descriptors$Descriptor DescriptorProtos.access$14900()>
		//    1    3:areturn         
		}

		private RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       57
			{
				List list = uninterpretedOption_;
		//    3    7:aload_0         
		//    4    8:getfield        #73  <Field List uninterpretedOption_>
		//    5   11:astore_2        
				boolean flag;
				if((bitField0_ & 0x40000) == 0x40000)
		//*   6   12:aload_0         
		//*   7   13:getfield        #87  <Field int bitField0_>
		//*   8   16:ldc1            #88  <Int 0x40000>
		//*   9   18:iand            
		//*  10   19:ldc1            #88  <Int 0x40000>
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
		//   18   32:new             #104 <Class RepeatedFieldBuilderV3>
		//   19   35:dup             
		//   20   36:aload_2         
		//   21   37:iload_1         
		//   22   38:aload_0         
		//   23   39:invokevirtual   #108 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   24   42:aload_0         
		//   25   43:invokevirtual   #112 <Method boolean isClean()>
		//   26   46:invokespecial   #115 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
		//   27   49:putfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				uninterpretedOption_ = null;
		//   28   52:aload_0         
		//   29   53:aconst_null     
		//   30   54:putfield        #73  <Field List uninterpretedOption_>
			}
			return uninterpretedOptionBuilder_;
		//   31   57:aload_0         
		//   32   58:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   33   61:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #122 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            11
				getUninterpretedOptionFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    4   10:pop             
		//    5   11:return          
		}

		public Builder addAllUninterpretedOption(Iterable iterable)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, uninterpretedOption_);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #73  <Field List uninterpretedOption_>
		//    8   16:invokestatic    #134 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
				onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   11   23:aload_0         
		//   12   24:areturn         
			} else
			{
				uninterpretedOptionBuilder_.addAllMessages(iterable);
		//   13   25:aload_0         
		//   14   26:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #141 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
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
		//    3    3:invokespecial   #147 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (addExtension(generatedextension, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #150 <Method DescriptorProtos$FileOptions$Builder addExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:areturn         
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #155 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #158 <Method DescriptorProtos$FileOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #158 <Method DescriptorProtos$FileOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #158 <Method DescriptorProtos$FileOptions$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder addUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #73  <Field List uninterpretedOption_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   10   20:invokeinterface #173 <Method void List.add(int, Object)>
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   17   35:iload_1         
		//   18   36:aload_2         
		//   19   37:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   20   40:invokevirtual   #177 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
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
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(uninterpretedoption == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #180 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #181 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureUninterpretedOptionIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.add(i, ((Object) (uninterpretedoption)));
		//   11   23:aload_0         
		//   12   24:getfield        #73  <Field List uninterpretedOption_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #173 <Method void List.add(int, Object)>
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #137 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				uninterpretedOptionBuilder_.addMessage(i, ((AbstractMessage) (uninterpretedoption)));
		//   20   40:aload_0         
		//   21   41:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   22   44:iload_1         
		//   23   45:aload_2         
		//   24   46:invokevirtual   #177 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
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
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.add(((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #73  <Field List uninterpretedOption_>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//    9   19:invokeinterface #185 <Method boolean List.add(Object)>
		//   10   24:pop             
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   19   39:invokevirtual   #188 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
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
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(uninterpretedoption == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #180 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #181 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureUninterpretedOptionIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.add(((Object) (uninterpretedoption)));
		//   11   23:aload_0         
		//   12   24:getfield        #73  <Field List uninterpretedOption_>
		//   13   27:aload_1         
		//   14   28:invokeinterface #185 <Method boolean List.add(Object)>
		//   15   33:pop             
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #137 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				uninterpretedOptionBuilder_.addMessage(((AbstractMessage) (uninterpretedoption)));
		//   20   40:aload_0         
		//   21   41:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   22   44:aload_1         
		//   23   45:invokevirtual   #188 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
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
		//    1    1:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:invokestatic    #196 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    3    7:invokevirtual   #200 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #163 <Class DescriptorProtos$UninterpretedOption$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.UninterpretedOption.Builder addUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.UninterpretedOption.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #196 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    4    8:invokevirtual   #204 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #163 <Class DescriptorProtos$UninterpretedOption$Builder>
		//    6   14:areturn         
		}

		public DescriptorProtos.FileOptions build()
		{
			DescriptorProtos.FileOptions fileoptions = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #208 <Method DescriptorProtos$FileOptions buildPartial()>
		//    2    4:astore_1        
			if(!fileoptions.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #211 <Method boolean DescriptorProtos$FileOptions.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (fileoptions)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #215 <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return fileoptions;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #218 <Method DescriptorProtos$FileOptions build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #218 <Method DescriptorProtos$FileOptions build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.FileOptions buildPartial()
		{
			DescriptorProtos.FileOptions fileoptions = new DescriptorProtos.FileOptions(((GeneratedMessageV3.ExtendableBuilder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #9   <Class DescriptorProtos$FileOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #222 <Method void DescriptorProtos$FileOptions(GeneratedMessageV3$ExtendableBuilder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #87  <Field int bitField0_>
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
			fileoptions.javaPackage_ = javaPackage_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #49  <Field Object javaPackage_>
		//   21   33:invokestatic    #226 <Method Object DescriptorProtos$FileOptions.access$15402(DescriptorProtos$FileOptions, Object)>
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
			fileoptions.javaOuterClassname_ = javaOuterClassname_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #51  <Field Object javaOuterClassname_>
		//   37   56:invokestatic    #229 <Method Object DescriptorProtos$FileOptions.access$15502(DescriptorProtos$FileOptions, Object)>
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
			fileoptions.javaMultipleFiles_ = javaMultipleFiles_;
		//   50   73:aload           4
		//   51   75:aload_0         
		//   52   76:getfield        #231 <Field boolean javaMultipleFiles_>
		//   53   79:invokestatic    #235 <Method boolean DescriptorProtos$FileOptions.access$15602(DescriptorProtos$FileOptions, boolean)>
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
			fileoptions.javaGenerateEqualsAndHash_ = javaGenerateEqualsAndHash_;
		//   66   99:aload           4
		//   67  101:aload_0         
		//   68  102:getfield        #237 <Field boolean javaGenerateEqualsAndHash_>
		//   69  105:invokestatic    #240 <Method boolean DescriptorProtos$FileOptions.access$15702(DescriptorProtos$FileOptions, boolean)>
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
			fileoptions.javaStringCheckUtf8_ = javaStringCheckUtf8_;
		//   82  125:aload           4
		//   83  127:aload_0         
		//   84  128:getfield        #242 <Field boolean javaStringCheckUtf8_>
		//   85  131:invokestatic    #245 <Method boolean DescriptorProtos$FileOptions.access$15802(DescriptorProtos$FileOptions, boolean)>
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
			fileoptions.optimizeFor_ = optimizeFor_;
		//   98  151:aload           4
		//   99  153:aload_0         
		//  100  154:getfield        #53  <Field int optimizeFor_>
		//  101  157:invokestatic    #249 <Method int DescriptorProtos$FileOptions.access$15902(DescriptorProtos$FileOptions, int)>
		//  102  160:pop             
			j = i;
		//  103  161:iload_1         
		//  104  162:istore_2        
			if((k & 0x40) == 64)
		//* 105  163:iload_3         
		//* 106  164:bipush          64
		//* 107  166:iand            
		//* 108  167:bipush          64
		//* 109  169:icmpne          177
				j = i | 0x40;
		//  110  172:iload_1         
		//  111  173:bipush          64
		//  112  175:ior             
		//  113  176:istore_2        
			fileoptions.goPackage_ = goPackage_;
		//  114  177:aload           4
		//  115  179:aload_0         
		//  116  180:getfield        #55  <Field Object goPackage_>
		//  117  183:invokestatic    #252 <Method Object DescriptorProtos$FileOptions.access$16002(DescriptorProtos$FileOptions, Object)>
		//  118  186:pop             
			i = j;
		//  119  187:iload_2         
		//  120  188:istore_1        
			if((k & 0x80) == 128)
		//* 121  189:iload_3         
		//* 122  190:sipush          128
		//* 123  193:iand            
		//* 124  194:sipush          128
		//* 125  197:icmpne          206
				i = j | 0x80;
		//  126  200:iload_2         
		//  127  201:sipush          128
		//  128  204:ior             
		//  129  205:istore_1        
			fileoptions.ccGenericServices_ = ccGenericServices_;
		//  130  206:aload           4
		//  131  208:aload_0         
		//  132  209:getfield        #254 <Field boolean ccGenericServices_>
		//  133  212:invokestatic    #257 <Method boolean DescriptorProtos$FileOptions.access$16102(DescriptorProtos$FileOptions, boolean)>
		//  134  215:pop             
			j = i;
		//  135  216:iload_1         
		//  136  217:istore_2        
			if((k & 0x100) == 256)
		//* 137  218:iload_3         
		//* 138  219:sipush          256
		//* 139  222:iand            
		//* 140  223:sipush          256
		//* 141  226:icmpne          235
				j = i | 0x100;
		//  142  229:iload_1         
		//  143  230:sipush          256
		//  144  233:ior             
		//  145  234:istore_2        
			fileoptions.javaGenericServices_ = javaGenericServices_;
		//  146  235:aload           4
		//  147  237:aload_0         
		//  148  238:getfield        #259 <Field boolean javaGenericServices_>
		//  149  241:invokestatic    #262 <Method boolean DescriptorProtos$FileOptions.access$16202(DescriptorProtos$FileOptions, boolean)>
		//  150  244:pop             
			i = j;
		//  151  245:iload_2         
		//  152  246:istore_1        
			if((k & 0x200) == 512)
		//* 153  247:iload_3         
		//* 154  248:sipush          512
		//* 155  251:iand            
		//* 156  252:sipush          512
		//* 157  255:icmpne          264
				i = j | 0x200;
		//  158  258:iload_2         
		//  159  259:sipush          512
		//  160  262:ior             
		//  161  263:istore_1        
			fileoptions.pyGenericServices_ = pyGenericServices_;
		//  162  264:aload           4
		//  163  266:aload_0         
		//  164  267:getfield        #264 <Field boolean pyGenericServices_>
		//  165  270:invokestatic    #267 <Method boolean DescriptorProtos$FileOptions.access$16302(DescriptorProtos$FileOptions, boolean)>
		//  166  273:pop             
			j = i;
		//  167  274:iload_1         
		//  168  275:istore_2        
			if((k & 0x400) == 1024)
		//* 169  276:iload_3         
		//* 170  277:sipush          1024
		//* 171  280:iand            
		//* 172  281:sipush          1024
		//* 173  284:icmpne          293
				j = i | 0x400;
		//  174  287:iload_1         
		//  175  288:sipush          1024
		//  176  291:ior             
		//  177  292:istore_2        
			fileoptions.phpGenericServices_ = phpGenericServices_;
		//  178  293:aload           4
		//  179  295:aload_0         
		//  180  296:getfield        #269 <Field boolean phpGenericServices_>
		//  181  299:invokestatic    #272 <Method boolean DescriptorProtos$FileOptions.access$16402(DescriptorProtos$FileOptions, boolean)>
		//  182  302:pop             
			i = j;
		//  183  303:iload_2         
		//  184  304:istore_1        
			if((k & 0x800) == 2048)
		//* 185  305:iload_3         
		//* 186  306:sipush          2048
		//* 187  309:iand            
		//* 188  310:sipush          2048
		//* 189  313:icmpne          322
				i = j | 0x800;
		//  190  316:iload_2         
		//  191  317:sipush          2048
		//  192  320:ior             
		//  193  321:istore_1        
			fileoptions.deprecated_ = deprecated_;
		//  194  322:aload           4
		//  195  324:aload_0         
		//  196  325:getfield        #274 <Field boolean deprecated_>
		//  197  328:invokestatic    #277 <Method boolean DescriptorProtos$FileOptions.access$16502(DescriptorProtos$FileOptions, boolean)>
		//  198  331:pop             
			j = i;
		//  199  332:iload_1         
		//  200  333:istore_2        
			if((k & 0x1000) == 4096)
		//* 201  334:iload_3         
		//* 202  335:sipush          4096
		//* 203  338:iand            
		//* 204  339:sipush          4096
		//* 205  342:icmpne          351
				j = i | 0x1000;
		//  206  345:iload_1         
		//  207  346:sipush          4096
		//  208  349:ior             
		//  209  350:istore_2        
			fileoptions.ccEnableArenas_ = ccEnableArenas_;
		//  210  351:aload           4
		//  211  353:aload_0         
		//  212  354:getfield        #279 <Field boolean ccEnableArenas_>
		//  213  357:invokestatic    #282 <Method boolean DescriptorProtos$FileOptions.access$16602(DescriptorProtos$FileOptions, boolean)>
		//  214  360:pop             
			i = j;
		//  215  361:iload_2         
		//  216  362:istore_1        
			if((k & 0x2000) == 8192)
		//* 217  363:iload_3         
		//* 218  364:sipush          8192
		//* 219  367:iand            
		//* 220  368:sipush          8192
		//* 221  371:icmpne          380
				i = j | 0x2000;
		//  222  374:iload_2         
		//  223  375:sipush          8192
		//  224  378:ior             
		//  225  379:istore_1        
			fileoptions.objcClassPrefix_ = objcClassPrefix_;
		//  226  380:aload           4
		//  227  382:aload_0         
		//  228  383:getfield        #57  <Field Object objcClassPrefix_>
		//  229  386:invokestatic    #285 <Method Object DescriptorProtos$FileOptions.access$16702(DescriptorProtos$FileOptions, Object)>
		//  230  389:pop             
			j = i;
		//  231  390:iload_1         
		//  232  391:istore_2        
			if((k & 0x4000) == 16384)
		//* 233  392:iload_3         
		//* 234  393:sipush          16384
		//* 235  396:iand            
		//* 236  397:sipush          16384
		//* 237  400:icmpne          409
				j = i | 0x4000;
		//  238  403:iload_1         
		//  239  404:sipush          16384
		//  240  407:ior             
		//  241  408:istore_2        
			fileoptions.csharpNamespace_ = csharpNamespace_;
		//  242  409:aload           4
		//  243  411:aload_0         
		//  244  412:getfield        #59  <Field Object csharpNamespace_>
		//  245  415:invokestatic    #288 <Method Object DescriptorProtos$FileOptions.access$16802(DescriptorProtos$FileOptions, Object)>
		//  246  418:pop             
			i = j;
		//  247  419:iload_2         
		//  248  420:istore_1        
			if((0x8000 & k) == 32768)
		//* 249  421:ldc2            #289 <Int 32768>
		//* 250  424:iload_3         
		//* 251  425:iand            
		//* 252  426:ldc2            #289 <Int 32768>
		//* 253  429:icmpne          438
				i = j | 0x8000;
		//  254  432:iload_2         
		//  255  433:ldc2            #289 <Int 32768>
		//  256  436:ior             
		//  257  437:istore_1        
			fileoptions.swiftPrefix_ = swiftPrefix_;
		//  258  438:aload           4
		//  259  440:aload_0         
		//  260  441:getfield        #61  <Field Object swiftPrefix_>
		//  261  444:invokestatic    #292 <Method Object DescriptorProtos$FileOptions.access$16902(DescriptorProtos$FileOptions, Object)>
		//  262  447:pop             
			j = i;
		//  263  448:iload_1         
		//  264  449:istore_2        
			if((0x10000 & k) == 0x10000)
		//* 265  450:ldc2            #293 <Int 0x10000>
		//* 266  453:iload_3         
		//* 267  454:iand            
		//* 268  455:ldc2            #293 <Int 0x10000>
		//* 269  458:icmpne          467
				j = i | 0x10000;
		//  270  461:iload_1         
		//  271  462:ldc2            #293 <Int 0x10000>
		//  272  465:ior             
		//  273  466:istore_2        
			fileoptions.phpClassPrefix_ = phpClassPrefix_;
		//  274  467:aload           4
		//  275  469:aload_0         
		//  276  470:getfield        #63  <Field Object phpClassPrefix_>
		//  277  473:invokestatic    #296 <Method Object DescriptorProtos$FileOptions.access$17002(DescriptorProtos$FileOptions, Object)>
		//  278  476:pop             
			i = j;
		//  279  477:iload_2         
		//  280  478:istore_1        
			if((0x20000 & k) == 0x20000)
		//* 281  479:ldc2            #297 <Int 0x20000>
		//* 282  482:iload_3         
		//* 283  483:iand            
		//* 284  484:ldc2            #297 <Int 0x20000>
		//* 285  487:icmpne          496
				i = j | 0x20000;
		//  286  490:iload_2         
		//  287  491:ldc2            #297 <Int 0x20000>
		//  288  494:ior             
		//  289  495:istore_1        
			fileoptions.phpNamespace_ = phpNamespace_;
		//  290  496:aload           4
		//  291  498:aload_0         
		//  292  499:getfield        #65  <Field Object phpNamespace_>
		//  293  502:invokestatic    #300 <Method Object DescriptorProtos$FileOptions.access$17102(DescriptorProtos$FileOptions, Object)>
		//  294  505:pop             
			if(uninterpretedOptionBuilder_ == null)
		//* 295  506:aload_0         
		//* 296  507:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//* 297  510:ifnonnull       561
			{
				if((bitField0_ & 0x40000) == 0x40000)
		//* 298  513:aload_0         
		//* 299  514:getfield        #87  <Field int bitField0_>
		//* 300  517:ldc1            #88  <Int 0x40000>
		//* 301  519:iand            
		//* 302  520:ldc1            #88  <Int 0x40000>
		//* 303  522:icmpne          548
				{
					uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
		//  304  525:aload_0         
		//  305  526:aload_0         
		//  306  527:getfield        #73  <Field List uninterpretedOption_>
		//  307  530:invokestatic    #304 <Method List Collections.unmodifiableList(List)>
		//  308  533:putfield        #73  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & 0xfffbffff;
		//  309  536:aload_0         
		//  310  537:aload_0         
		//  311  538:getfield        #87  <Field int bitField0_>
		//  312  541:ldc2            #305 <Int 0xfffbffff>
		//  313  544:iand            
		//  314  545:putfield        #87  <Field int bitField0_>
				}
				fileoptions.uninterpretedOption_ = uninterpretedOption_;
		//  315  548:aload           4
		//  316  550:aload_0         
		//  317  551:getfield        #73  <Field List uninterpretedOption_>
		//  318  554:invokestatic    #309 <Method List DescriptorProtos$FileOptions.access$17202(DescriptorProtos$FileOptions, List)>
		//  319  557:pop             
			} else
		//* 320  558:goto            574
			{
				fileoptions.uninterpretedOption_ = uninterpretedOptionBuilder_.build();
		//  321  561:aload           4
		//  322  563:aload_0         
		//  323  564:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//  324  567:invokevirtual   #311 <Method List RepeatedFieldBuilderV3.build()>
		//  325  570:invokestatic    #309 <Method List DescriptorProtos$FileOptions.access$17202(DescriptorProtos$FileOptions, List)>
		//  326  573:pop             
			}
			fileoptions.bitField0_ = i;
		//  327  574:aload           4
		//  328  576:iload_1         
		//  329  577:invokestatic    #314 <Method int DescriptorProtos$FileOptions.access$17302(DescriptorProtos$FileOptions, int)>
		//  330  580:pop             
			onBuilt();
		//  331  581:aload_0         
		//  332  582:invokevirtual   #317 <Method void onBuilt()>
			return fileoptions;
		//  333  585:aload           4
		//  334  587:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #208 <Method DescriptorProtos$FileOptions buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #208 <Method DescriptorProtos$FileOptions buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #325 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clear()>
		//    2    4:pop             
			javaPackage_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #47  <String "">
		//    5    8:putfield        #49  <Field Object javaPackage_>
			bitField0_ = bitField0_ & -2;
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:getfield        #87  <Field int bitField0_>
		//    9   16:bipush          -2
		//   10   18:iand            
		//   11   19:putfield        #87  <Field int bitField0_>
			javaOuterClassname_ = "";
		//   12   22:aload_0         
		//   13   23:ldc1            #47  <String "">
		//   14   25:putfield        #51  <Field Object javaOuterClassname_>
			bitField0_ = bitField0_ & -3;
		//   15   28:aload_0         
		//   16   29:aload_0         
		//   17   30:getfield        #87  <Field int bitField0_>
		//   18   33:bipush          -3
		//   19   35:iand            
		//   20   36:putfield        #87  <Field int bitField0_>
			javaMultipleFiles_ = false;
		//   21   39:aload_0         
		//   22   40:iconst_0        
		//   23   41:putfield        #231 <Field boolean javaMultipleFiles_>
			bitField0_ = bitField0_ & -5;
		//   24   44:aload_0         
		//   25   45:aload_0         
		//   26   46:getfield        #87  <Field int bitField0_>
		//   27   49:bipush          -5
		//   28   51:iand            
		//   29   52:putfield        #87  <Field int bitField0_>
			javaGenerateEqualsAndHash_ = false;
		//   30   55:aload_0         
		//   31   56:iconst_0        
		//   32   57:putfield        #237 <Field boolean javaGenerateEqualsAndHash_>
			bitField0_ = bitField0_ & -9;
		//   33   60:aload_0         
		//   34   61:aload_0         
		//   35   62:getfield        #87  <Field int bitField0_>
		//   36   65:bipush          -9
		//   37   67:iand            
		//   38   68:putfield        #87  <Field int bitField0_>
			javaStringCheckUtf8_ = false;
		//   39   71:aload_0         
		//   40   72:iconst_0        
		//   41   73:putfield        #242 <Field boolean javaStringCheckUtf8_>
			bitField0_ = bitField0_ & 0xffffffef;
		//   42   76:aload_0         
		//   43   77:aload_0         
		//   44   78:getfield        #87  <Field int bitField0_>
		//   45   81:bipush          -17
		//   46   83:iand            
		//   47   84:putfield        #87  <Field int bitField0_>
			optimizeFor_ = 1;
		//   48   87:aload_0         
		//   49   88:iconst_1        
		//   50   89:putfield        #53  <Field int optimizeFor_>
			bitField0_ = bitField0_ & 0xffffffdf;
		//   51   92:aload_0         
		//   52   93:aload_0         
		//   53   94:getfield        #87  <Field int bitField0_>
		//   54   97:bipush          -33
		//   55   99:iand            
		//   56  100:putfield        #87  <Field int bitField0_>
			goPackage_ = "";
		//   57  103:aload_0         
		//   58  104:ldc1            #47  <String "">
		//   59  106:putfield        #55  <Field Object goPackage_>
			bitField0_ = bitField0_ & 0xffffffbf;
		//   60  109:aload_0         
		//   61  110:aload_0         
		//   62  111:getfield        #87  <Field int bitField0_>
		//   63  114:bipush          -65
		//   64  116:iand            
		//   65  117:putfield        #87  <Field int bitField0_>
			ccGenericServices_ = false;
		//   66  120:aload_0         
		//   67  121:iconst_0        
		//   68  122:putfield        #254 <Field boolean ccGenericServices_>
			bitField0_ = bitField0_ & 0xffffff7f;
		//   69  125:aload_0         
		//   70  126:aload_0         
		//   71  127:getfield        #87  <Field int bitField0_>
		//   72  130:sipush          -129
		//   73  133:iand            
		//   74  134:putfield        #87  <Field int bitField0_>
			javaGenericServices_ = false;
		//   75  137:aload_0         
		//   76  138:iconst_0        
		//   77  139:putfield        #259 <Field boolean javaGenericServices_>
			bitField0_ = bitField0_ & 0xfffffeff;
		//   78  142:aload_0         
		//   79  143:aload_0         
		//   80  144:getfield        #87  <Field int bitField0_>
		//   81  147:sipush          -257
		//   82  150:iand            
		//   83  151:putfield        #87  <Field int bitField0_>
			pyGenericServices_ = false;
		//   84  154:aload_0         
		//   85  155:iconst_0        
		//   86  156:putfield        #264 <Field boolean pyGenericServices_>
			bitField0_ = bitField0_ & 0xfffffdff;
		//   87  159:aload_0         
		//   88  160:aload_0         
		//   89  161:getfield        #87  <Field int bitField0_>
		//   90  164:sipush          -513
		//   91  167:iand            
		//   92  168:putfield        #87  <Field int bitField0_>
			phpGenericServices_ = false;
		//   93  171:aload_0         
		//   94  172:iconst_0        
		//   95  173:putfield        #269 <Field boolean phpGenericServices_>
			bitField0_ = bitField0_ & 0xfffffbff;
		//   96  176:aload_0         
		//   97  177:aload_0         
		//   98  178:getfield        #87  <Field int bitField0_>
		//   99  181:sipush          -1025
		//  100  184:iand            
		//  101  185:putfield        #87  <Field int bitField0_>
			deprecated_ = false;
		//  102  188:aload_0         
		//  103  189:iconst_0        
		//  104  190:putfield        #274 <Field boolean deprecated_>
			bitField0_ = bitField0_ & 0xfffff7ff;
		//  105  193:aload_0         
		//  106  194:aload_0         
		//  107  195:getfield        #87  <Field int bitField0_>
		//  108  198:sipush          -2049
		//  109  201:iand            
		//  110  202:putfield        #87  <Field int bitField0_>
			ccEnableArenas_ = false;
		//  111  205:aload_0         
		//  112  206:iconst_0        
		//  113  207:putfield        #279 <Field boolean ccEnableArenas_>
			bitField0_ = bitField0_ & 0xffffefff;
		//  114  210:aload_0         
		//  115  211:aload_0         
		//  116  212:getfield        #87  <Field int bitField0_>
		//  117  215:sipush          -4097
		//  118  218:iand            
		//  119  219:putfield        #87  <Field int bitField0_>
			objcClassPrefix_ = "";
		//  120  222:aload_0         
		//  121  223:ldc1            #47  <String "">
		//  122  225:putfield        #57  <Field Object objcClassPrefix_>
			bitField0_ = bitField0_ & 0xffffdfff;
		//  123  228:aload_0         
		//  124  229:aload_0         
		//  125  230:getfield        #87  <Field int bitField0_>
		//  126  233:sipush          -8193
		//  127  236:iand            
		//  128  237:putfield        #87  <Field int bitField0_>
			csharpNamespace_ = "";
		//  129  240:aload_0         
		//  130  241:ldc1            #47  <String "">
		//  131  243:putfield        #59  <Field Object csharpNamespace_>
			bitField0_ = bitField0_ & 0xffffbfff;
		//  132  246:aload_0         
		//  133  247:aload_0         
		//  134  248:getfield        #87  <Field int bitField0_>
		//  135  251:sipush          -16385
		//  136  254:iand            
		//  137  255:putfield        #87  <Field int bitField0_>
			swiftPrefix_ = "";
		//  138  258:aload_0         
		//  139  259:ldc1            #47  <String "">
		//  140  261:putfield        #61  <Field Object swiftPrefix_>
			bitField0_ = bitField0_ & 0xffff7fff;
		//  141  264:aload_0         
		//  142  265:aload_0         
		//  143  266:getfield        #87  <Field int bitField0_>
		//  144  269:ldc2            #326 <Int -32769>
		//  145  272:iand            
		//  146  273:putfield        #87  <Field int bitField0_>
			phpClassPrefix_ = "";
		//  147  276:aload_0         
		//  148  277:ldc1            #47  <String "">
		//  149  279:putfield        #63  <Field Object phpClassPrefix_>
			bitField0_ = bitField0_ & 0xfffeffff;
		//  150  282:aload_0         
		//  151  283:aload_0         
		//  152  284:getfield        #87  <Field int bitField0_>
		//  153  287:ldc2            #327 <Int 0xfffeffff>
		//  154  290:iand            
		//  155  291:putfield        #87  <Field int bitField0_>
			phpNamespace_ = "";
		//  156  294:aload_0         
		//  157  295:ldc1            #47  <String "">
		//  158  297:putfield        #65  <Field Object phpNamespace_>
			bitField0_ = bitField0_ & 0xfffdffff;
		//  159  300:aload_0         
		//  160  301:aload_0         
		//  161  302:getfield        #87  <Field int bitField0_>
		//  162  305:ldc2            #328 <Int 0xfffdffff>
		//  163  308:iand            
		//  164  309:putfield        #87  <Field int bitField0_>
			if(uninterpretedOptionBuilder_ == null)
		//* 165  312:aload_0         
		//* 166  313:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//* 167  316:ifnonnull       340
			{
				uninterpretedOption_ = Collections.emptyList();
		//  168  319:aload_0         
		//  169  320:invokestatic    #71  <Method List Collections.emptyList()>
		//  170  323:putfield        #73  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & 0xfffbffff;
		//  171  326:aload_0         
		//  172  327:aload_0         
		//  173  328:getfield        #87  <Field int bitField0_>
		//  174  331:ldc2            #305 <Int 0xfffbffff>
		//  175  334:iand            
		//  176  335:putfield        #87  <Field int bitField0_>
				return this;
		//  177  338:aload_0         
		//  178  339:areturn         
			} else
			{
				uninterpretedOptionBuilder_.clear();
		//  179  340:aload_0         
		//  180  341:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//  181  344:invokevirtual   #330 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//  182  347:aload_0         
		//  183  348:areturn         
			}
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
		//    2    4:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clear()
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #322 <Method DescriptorProtos$FileOptions$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearCcEnableArenas()
		{
			bitField0_ = bitField0_ & 0xffffefff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          -4097
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			ccEnableArenas_ = false;
		//    6   12:aload_0         
		//    7   13:iconst_0        
		//    8   14:putfield        #279 <Field boolean ccEnableArenas_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder clearCcGenericServices()
		{
			bitField0_ = bitField0_ & 0xffffff7f;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          -129
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			ccGenericServices_ = false;
		//    6   12:aload_0         
		//    7   13:iconst_0        
		//    8   14:putfield        #254 <Field boolean ccGenericServices_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder clearCsharpNamespace()
		{
			bitField0_ = bitField0_ & 0xffffbfff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          -16385
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			csharpNamespace_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getCsharpNamespace()));
		//    6   12:aload_0         
		//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    8   16:invokevirtual   #342 <Method String DescriptorProtos$FileOptions.getCsharpNamespace()>
		//    9   19:putfield        #59  <Field Object csharpNamespace_>
			onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public Builder clearDeprecated()
		{
			bitField0_ = bitField0_ & 0xfffff7ff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          -2049
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			deprecated_ = false;
		//    6   12:aload_0         
		//    7   13:iconst_0        
		//    8   14:putfield        #274 <Field boolean deprecated_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return (Builder)super.clearExtension(generatedextension);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #348 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearExtension(GeneratedMessage$GeneratedExtension)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension generatedextension)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clearExtension(generatedextension)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #351 <Method DescriptorProtos$FileOptions$Builder clearExtension(GeneratedMessage$GeneratedExtension)>
		//    3    5:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #356 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #359 <Method DescriptorProtos$FileOptions$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #359 <Method DescriptorProtos$FileOptions$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #359 <Method DescriptorProtos$FileOptions$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearGoPackage()
		{
			bitField0_ = bitField0_ & 0xffffffbf;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:bipush          -65
		//    4    7:iand            
		//    5    8:putfield        #87  <Field int bitField0_>
			goPackage_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getGoPackage()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    8   15:invokevirtual   #364 <Method String DescriptorProtos$FileOptions.getGoPackage()>
		//    9   18:putfield        #55  <Field Object goPackage_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public Builder clearJavaGenerateEqualsAndHash()
		{
			bitField0_ = bitField0_ & -9;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:bipush          -9
		//    4    7:iand            
		//    5    8:putfield        #87  <Field int bitField0_>
			javaGenerateEqualsAndHash_ = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #237 <Field boolean javaGenerateEqualsAndHash_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder clearJavaGenericServices()
		{
			bitField0_ = bitField0_ & 0xfffffeff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          -257
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			javaGenericServices_ = false;
		//    6   12:aload_0         
		//    7   13:iconst_0        
		//    8   14:putfield        #259 <Field boolean javaGenericServices_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder clearJavaMultipleFiles()
		{
			bitField0_ = bitField0_ & -5;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:bipush          -5
		//    4    7:iand            
		//    5    8:putfield        #87  <Field int bitField0_>
			javaMultipleFiles_ = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #231 <Field boolean javaMultipleFiles_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder clearJavaOuterClassname()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #87  <Field int bitField0_>
			javaOuterClassname_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getJavaOuterClassname()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    8   15:invokevirtual   #373 <Method String DescriptorProtos$FileOptions.getJavaOuterClassname()>
		//    9   18:putfield        #51  <Field Object javaOuterClassname_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public Builder clearJavaPackage()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #87  <Field int bitField0_>
			javaPackage_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getJavaPackage()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    8   15:invokevirtual   #377 <Method String DescriptorProtos$FileOptions.getJavaPackage()>
		//    9   18:putfield        #49  <Field Object javaPackage_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public Builder clearJavaStringCheckUtf8()
		{
			bitField0_ = bitField0_ & 0xffffffef;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:bipush          -17
		//    4    7:iand            
		//    5    8:putfield        #87  <Field int bitField0_>
			javaStringCheckUtf8_ = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #242 <Field boolean javaStringCheckUtf8_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder clearObjcClassPrefix()
		{
			bitField0_ = bitField0_ & 0xffffdfff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          -8193
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			objcClassPrefix_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getObjcClassPrefix()));
		//    6   12:aload_0         
		//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    8   16:invokevirtual   #382 <Method String DescriptorProtos$FileOptions.getObjcClassPrefix()>
		//    9   19:putfield        #57  <Field Object objcClassPrefix_>
			onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #387 <Method DescriptorProtos$FileOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #390 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #387 <Method DescriptorProtos$FileOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #387 <Method DescriptorProtos$FileOptions$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOptimizeFor()
		{
			bitField0_ = bitField0_ & 0xffffffdf;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:bipush          -33
		//    4    7:iand            
		//    5    8:putfield        #87  <Field int bitField0_>
			optimizeFor_ = 1;
		//    6   11:aload_0         
		//    7   12:iconst_1        
		//    8   13:putfield        #53  <Field int optimizeFor_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder clearPhpClassPrefix()
		{
			bitField0_ = bitField0_ & 0xfffeffff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:ldc2            #327 <Int 0xfffeffff>
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			phpClassPrefix_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getPhpClassPrefix()));
		//    6   12:aload_0         
		//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    8   16:invokevirtual   #396 <Method String DescriptorProtos$FileOptions.getPhpClassPrefix()>
		//    9   19:putfield        #63  <Field Object phpClassPrefix_>
			onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public Builder clearPhpGenericServices()
		{
			bitField0_ = bitField0_ & 0xfffffbff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          -1025
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			phpGenericServices_ = false;
		//    6   12:aload_0         
		//    7   13:iconst_0        
		//    8   14:putfield        #269 <Field boolean phpGenericServices_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder clearPhpNamespace()
		{
			bitField0_ = bitField0_ & 0xfffdffff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:ldc2            #328 <Int 0xfffdffff>
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			phpNamespace_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getPhpNamespace()));
		//    6   12:aload_0         
		//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    8   16:invokevirtual   #401 <Method String DescriptorProtos$FileOptions.getPhpNamespace()>
		//    9   19:putfield        #65  <Field Object phpNamespace_>
			onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public Builder clearPyGenericServices()
		{
			bitField0_ = bitField0_ & 0xfffffdff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          -513
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			pyGenericServices_ = false;
		//    6   12:aload_0         
		//    7   13:iconst_0        
		//    8   14:putfield        #264 <Field boolean pyGenericServices_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder clearSwiftPrefix()
		{
			bitField0_ = bitField0_ & 0xffff7fff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:ldc2            #326 <Int -32769>
		//    4    8:iand            
		//    5    9:putfield        #87  <Field int bitField0_>
			swiftPrefix_ = ((Object) (DescriptorProtos.FileOptions.getDefaultInstance().getSwiftPrefix()));
		//    6   12:aload_0         
		//    7   13:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    8   16:invokevirtual   #406 <Method String DescriptorProtos$FileOptions.getSwiftPrefix()>
		//    9   19:putfield        #61  <Field Object swiftPrefix_>
			onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public Builder clearUninterpretedOption()
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       32
			{
				uninterpretedOption_ = Collections.emptyList();
		//    3    7:aload_0         
		//    4    8:invokestatic    #71  <Method List Collections.emptyList()>
		//    5   11:putfield        #73  <Field List uninterpretedOption_>
				bitField0_ = bitField0_ & 0xfffbffff;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #87  <Field int bitField0_>
		//    9   19:ldc2            #305 <Int 0xfffbffff>
		//   10   22:iand            
		//   11   23:putfield        #87  <Field int bitField0_>
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				uninterpretedOptionBuilder_.clear();
		//   16   32:aload_0         
		//   17   33:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   18   36:invokevirtual   #330 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   19   39:aload_0         
		//   20   40:areturn         
			}
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #413 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #410 <Method DescriptorProtos$FileOptions$Builder clone()>
		//    2    4:areturn         
		}

		public boolean getCcEnableArenas()
		{
			return ccEnableArenas_;
		//    0    0:aload_0         
		//    1    1:getfield        #279 <Field boolean ccEnableArenas_>
		//    2    4:ireturn         
		}

		public boolean getCcGenericServices()
		{
			return ccGenericServices_;
		//    0    0:aload_0         
		//    1    1:getfield        #254 <Field boolean ccGenericServices_>
		//    2    4:ireturn         
		}

		public String getCsharpNamespace()
		{
			Object obj = csharpNamespace_;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object csharpNamespace_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #423 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					csharpNamespace_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #59  <Field Object csharpNamespace_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #421 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getCsharpNamespaceBytes()
		{
			Object obj = csharpNamespace_;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object csharpNamespace_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #421 <Class String>
		//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				csharpNamespace_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #59  <Field Object csharpNamespace_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #423 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public DescriptorProtos.FileOptions getDefaultInstanceForType()
		{
			return DescriptorProtos.FileOptions.getDefaultInstance();
		//    0    0:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #438 <Method DescriptorProtos$FileOptions getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #438 <Method DescriptorProtos$FileOptions getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public boolean getDeprecated()
		{
			return deprecated_;
		//    0    0:aload_0         
		//    1    1:getfield        #274 <Field boolean deprecated_>
		//    2    4:ireturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$14900();
		//    0    0:invokestatic    #98  <Method Descriptors$Descriptor DescriptorProtos.access$14900()>
		//    1    3:areturn         
		}

		public String getGoPackage()
		{
			Object obj = goPackage_;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Object goPackage_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #423 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					goPackage_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #55  <Field Object goPackage_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #421 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getGoPackageBytes()
		{
			Object obj = goPackage_;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Object goPackage_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #421 <Class String>
		//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				goPackage_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #55  <Field Object goPackage_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #423 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public boolean getJavaGenerateEqualsAndHash()
		{
			return javaGenerateEqualsAndHash_;
		//    0    0:aload_0         
		//    1    1:getfield        #237 <Field boolean javaGenerateEqualsAndHash_>
		//    2    4:ireturn         
		}

		public boolean getJavaGenericServices()
		{
			return javaGenericServices_;
		//    0    0:aload_0         
		//    1    1:getfield        #259 <Field boolean javaGenericServices_>
		//    2    4:ireturn         
		}

		public boolean getJavaMultipleFiles()
		{
			return javaMultipleFiles_;
		//    0    0:aload_0         
		//    1    1:getfield        #231 <Field boolean javaMultipleFiles_>
		//    2    4:ireturn         
		}

		public String getJavaOuterClassname()
		{
			Object obj = javaOuterClassname_;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Object javaOuterClassname_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #423 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					javaOuterClassname_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #51  <Field Object javaOuterClassname_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #421 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getJavaOuterClassnameBytes()
		{
			Object obj = javaOuterClassname_;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Object javaOuterClassname_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #421 <Class String>
		//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				javaOuterClassname_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #51  <Field Object javaOuterClassname_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #423 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public String getJavaPackage()
		{
			Object obj = javaPackage_;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Object javaPackage_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #423 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					javaPackage_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #49  <Field Object javaPackage_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #421 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getJavaPackageBytes()
		{
			Object obj = javaPackage_;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Object javaPackage_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #421 <Class String>
		//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				javaPackage_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #49  <Field Object javaPackage_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #423 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public boolean getJavaStringCheckUtf8()
		{
			return javaStringCheckUtf8_;
		//    0    0:aload_0         
		//    1    1:getfield        #242 <Field boolean javaStringCheckUtf8_>
		//    2    4:ireturn         
		}

		public String getObjcClassPrefix()
		{
			Object obj = objcClassPrefix_;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object objcClassPrefix_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #423 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					objcClassPrefix_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #57  <Field Object objcClassPrefix_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #421 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getObjcClassPrefixBytes()
		{
			Object obj = objcClassPrefix_;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object objcClassPrefix_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #421 <Class String>
		//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				objcClassPrefix_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #57  <Field Object objcClassPrefix_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #423 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public OptimizeMode getOptimizeFor()
		{
			OptimizeMode optimizemode = OptimizeMode.valueOf(optimizeFor_);
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field int optimizeFor_>
		//    2    4:invokestatic    #456 <Method DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions$OptimizeMode.valueOf(int)>
		//    3    7:astore_1        
			if(optimizemode == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       16
				return OptimizeMode.SPEED;
		//    6   12:getstatic       #460 <Field DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions$OptimizeMode.SPEED>
		//    7   15:areturn         
			else
				return optimizemode;
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public String getPhpClassPrefix()
		{
			Object obj = phpClassPrefix_;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field Object phpClassPrefix_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #423 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					phpClassPrefix_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #63  <Field Object phpClassPrefix_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #421 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getPhpClassPrefixBytes()
		{
			Object obj = phpClassPrefix_;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field Object phpClassPrefix_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #421 <Class String>
		//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				phpClassPrefix_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #63  <Field Object phpClassPrefix_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #423 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public boolean getPhpGenericServices()
		{
			return phpGenericServices_;
		//    0    0:aload_0         
		//    1    1:getfield        #269 <Field boolean phpGenericServices_>
		//    2    4:ireturn         
		}

		public String getPhpNamespace()
		{
			Object obj = phpNamespace_;
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object phpNamespace_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #423 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					phpNamespace_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #65  <Field Object phpNamespace_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #421 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getPhpNamespaceBytes()
		{
			Object obj = phpNamespace_;
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object phpNamespace_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #421 <Class String>
		//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				phpNamespace_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #65  <Field Object phpNamespace_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #423 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public boolean getPyGenericServices()
		{
			return pyGenericServices_;
		//    0    0:aload_0         
		//    1    1:getfield        #264 <Field boolean pyGenericServices_>
		//    2    4:ireturn         
		}

		public String getSwiftPrefix()
		{
			Object obj = swiftPrefix_;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field Object swiftPrefix_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #423 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #426 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #429 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					swiftPrefix_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #61  <Field Object swiftPrefix_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #421 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getSwiftPrefixBytes()
		{
			Object obj = swiftPrefix_;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field Object swiftPrefix_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #421 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #421 <Class String>
		//    8   16:invokestatic    #435 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				swiftPrefix_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #61  <Field Object swiftPrefix_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #423 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public DescriptorProtos.UninterpretedOption getUninterpretedOption(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.UninterpretedOption)uninterpretedOption_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #73  <Field List uninterpretedOption_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #471 <Method Object List.get(int)>
		//    7   17:checkcast       #193 <Class DescriptorProtos$UninterpretedOption>
		//    8   20:areturn         
			else
				return (DescriptorProtos.UninterpretedOption)uninterpretedOptionBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #475 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #193 <Class DescriptorProtos$UninterpretedOption>
		//   14   32:areturn         
		}

		public DescriptorProtos.UninterpretedOption.Builder getUninterpretedOptionBuilder(int i)
		{
			return (DescriptorProtos.UninterpretedOption.Builder)getUninterpretedOptionFieldBuilder().getBuilder(i);
		//    0    0:aload_0         
		//    1    1:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #480 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
		//    4    8:checkcast       #163 <Class DescriptorProtos$UninterpretedOption$Builder>
		//    5   11:areturn         
		}

		public List getUninterpretedOptionBuilderList()
		{
			return getUninterpretedOptionFieldBuilder().getBuilderList();
		//    0    0:aload_0         
		//    1    1:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//    2    4:invokevirtual   #484 <Method List RepeatedFieldBuilderV3.getBuilderList()>
		//    3    7:areturn         
		}

		public int getUninterpretedOptionCount()
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       17
				return uninterpretedOption_.size();
		//    3    7:aload_0         
		//    4    8:getfield        #73  <Field List uninterpretedOption_>
		//    5   11:invokeinterface #490 <Method int List.size()>
		//    6   16:ireturn         
			else
				return uninterpretedOptionBuilder_.getCount();
		//    7   17:aload_0         
		//    8   18:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//    9   21:invokevirtual   #493 <Method int RepeatedFieldBuilderV3.getCount()>
		//   10   24:ireturn         
		}

		public List getUninterpretedOptionList()
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       15
				return Collections.unmodifiableList(uninterpretedOption_);
		//    3    7:aload_0         
		//    4    8:getfield        #73  <Field List uninterpretedOption_>
		//    5   11:invokestatic    #304 <Method List Collections.unmodifiableList(List)>
		//    6   14:areturn         
			else
				return uninterpretedOptionBuilder_.getMessageList();
		//    7   15:aload_0         
		//    8   16:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//    9   19:invokevirtual   #497 <Method List RepeatedFieldBuilderV3.getMessageList()>
		//   10   22:areturn         
		}

		public DescriptorProtos.UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOption_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #73  <Field List uninterpretedOption_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #471 <Method Object List.get(int)>
		//    7   17:checkcast       #502 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.UninterpretedOptionOrBuilder)uninterpretedOptionBuilder_.getMessageOrBuilder(i);
		//    9   21:aload_0         
		//   10   22:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #506 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
		//   13   29:checkcast       #502 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
		//   14   32:areturn         
		}

		public List getUninterpretedOptionOrBuilderList()
		{
			if(uninterpretedOptionBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnull          15
				return uninterpretedOptionBuilder_.getMessageOrBuilderList();
		//    3    7:aload_0         
		//    4    8:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//    5   11:invokevirtual   #510 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
		//    6   14:areturn         
			else
				return Collections.unmodifiableList(uninterpretedOption_);
		//    7   15:aload_0         
		//    8   16:getfield        #73  <Field List uninterpretedOption_>
		//    9   19:invokestatic    #304 <Method List Collections.unmodifiableList(List)>
		//   10   22:areturn         
		}

		public boolean hasCcEnableArenas()
		{
			return (bitField0_ & 0x1000) == 4096;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:sipush          4096
		//    3    7:iand            
		//    4    8:sipush          4096
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasCcGenericServices()
		{
			return (bitField0_ & 0x80) == 128;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:sipush          128
		//    3    7:iand            
		//    4    8:sipush          128
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasCsharpNamespace()
		{
			return (bitField0_ & 0x4000) == 16384;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:sipush          16384
		//    3    7:iand            
		//    4    8:sipush          16384
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasDeprecated()
		{
			return (bitField0_ & 0x800) == 2048;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:sipush          2048
		//    3    7:iand            
		//    4    8:sipush          2048
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasGoPackage()
		{
			return (bitField0_ & 0x40) == 64;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:bipush          64
		//    3    6:iand            
		//    4    7:bipush          64
		//    5    9:icmpne          14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public boolean hasJavaGenerateEqualsAndHash()
		{
			return (bitField0_ & 8) == 8;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:bipush          8
		//    3    6:iand            
		//    4    7:bipush          8
		//    5    9:icmpne          14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public boolean hasJavaGenericServices()
		{
			return (bitField0_ & 0x100) == 256;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:sipush          256
		//    3    7:iand            
		//    4    8:sipush          256
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasJavaMultipleFiles()
		{
			return (bitField0_ & 4) == 4;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:iconst_4        
		//    3    5:iand            
		//    4    6:iconst_4        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasJavaOuterClassname()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasJavaPackage()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasJavaStringCheckUtf8()
		{
			return (bitField0_ & 0x10) == 16;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:bipush          16
		//    3    6:iand            
		//    4    7:bipush          16
		//    5    9:icmpne          14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public boolean hasObjcClassPrefix()
		{
			return (bitField0_ & 0x2000) == 8192;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:sipush          8192
		//    3    7:iand            
		//    4    8:sipush          8192
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasOptimizeFor()
		{
			return (bitField0_ & 0x20) == 32;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:bipush          32
		//    3    6:iand            
		//    4    7:bipush          32
		//    5    9:icmpne          14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public boolean hasPhpClassPrefix()
		{
			return (bitField0_ & 0x10000) == 0x10000;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:ldc2            #293 <Int 0x10000>
		//    3    7:iand            
		//    4    8:ldc2            #293 <Int 0x10000>
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasPhpGenericServices()
		{
			return (bitField0_ & 0x400) == 1024;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:sipush          1024
		//    3    7:iand            
		//    4    8:sipush          1024
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasPhpNamespace()
		{
			return (bitField0_ & 0x20000) == 0x20000;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:ldc2            #297 <Int 0x20000>
		//    3    7:iand            
		//    4    8:ldc2            #297 <Int 0x20000>
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasPyGenericServices()
		{
			return (bitField0_ & 0x200) == 512;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:sipush          512
		//    3    7:iand            
		//    4    8:sipush          512
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasSwiftPrefix()
		{
			return (bitField0_ & 0x8000) == 32768;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int bitField0_>
		//    2    4:ldc2            #289 <Int 32768>
		//    3    7:iand            
		//    4    8:ldc2            #289 <Int 32768>
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$15000().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FileOptions, com/google/protobuf/DescriptorProtos$FileOptions$Builder);
		//    0    0:invokestatic    #534 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$15000()>
		//    1    3:ldc1            #9   <Class DescriptorProtos$FileOptions>
		//    2    5:ldc1            #2   <Class DescriptorProtos$FileOptions$Builder>
		//    3    7:invokevirtual   #540 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			for(int i = 0; i < getUninterpretedOptionCount(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_1        
		//*   2    2:iload_1         
		//*   3    3:aload_0         
		//*   4    4:invokevirtual   #542 <Method int getUninterpretedOptionCount()>
		//*   5    7:icmpge          30
				if(!getUninterpretedOption(i).isInitialized())
		//*   6   10:aload_0         
		//*   7   11:iload_1         
		//*   8   12:invokevirtual   #544 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
		//*   9   15:invokevirtual   #545 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
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
		//   19   31:invokevirtual   #548 <Method boolean extensionsAreInitialized()>
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
		//    3    3:invokevirtual   #555 <Method DescriptorProtos$FileOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #559 <Method DescriptorProtos$FileOptions$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #555 <Method DescriptorProtos$FileOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.FileOptions)DescriptorProtos.FileOptions.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #566 <Field Parser DescriptorProtos$FileOptions.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #572 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class DescriptorProtos$FileOptions>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.FileOptions) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #575 <Method DescriptorProtos$FileOptions$Builder mergeFrom(DescriptorProtos$FileOptions)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #578 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class DescriptorProtos$FileOptions>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #582 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #575 <Method DescriptorProtos$FileOptions$Builder mergeFrom(DescriptorProtos$FileOptions)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.FileOptions)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.FileOptions) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.FileOptions fileoptions)
		{
			if(fileoptions == DescriptorProtos.FileOptions.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #338 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(fileoptions.hasJavaPackage())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #584 <Method boolean DescriptorProtos$FileOptions.hasJavaPackage()>
		//*   7   13:ifeq            38
			{
				bitField0_ = bitField0_ | 1;
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #87  <Field int bitField0_>
		//   11   21:iconst_1        
		//   12   22:ior             
		//   13   23:putfield        #87  <Field int bitField0_>
				javaPackage_ = fileoptions.javaPackage_;
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokestatic    #588 <Method Object DescriptorProtos$FileOptions.access$15400(DescriptorProtos$FileOptions)>
		//   17   31:putfield        #49  <Field Object javaPackage_>
				onChanged();
		//   18   34:aload_0         
		//   19   35:invokevirtual   #137 <Method void onChanged()>
			}
			if(fileoptions.hasJavaOuterClassname())
		//*  20   38:aload_1         
		//*  21   39:invokevirtual   #590 <Method boolean DescriptorProtos$FileOptions.hasJavaOuterClassname()>
		//*  22   42:ifeq            67
			{
				bitField0_ = bitField0_ | 2;
		//   23   45:aload_0         
		//   24   46:aload_0         
		//   25   47:getfield        #87  <Field int bitField0_>
		//   26   50:iconst_2        
		//   27   51:ior             
		//   28   52:putfield        #87  <Field int bitField0_>
				javaOuterClassname_ = fileoptions.javaOuterClassname_;
		//   29   55:aload_0         
		//   30   56:aload_1         
		//   31   57:invokestatic    #593 <Method Object DescriptorProtos$FileOptions.access$15500(DescriptorProtos$FileOptions)>
		//   32   60:putfield        #51  <Field Object javaOuterClassname_>
				onChanged();
		//   33   63:aload_0         
		//   34   64:invokevirtual   #137 <Method void onChanged()>
			}
			if(fileoptions.hasJavaMultipleFiles())
		//*  35   67:aload_1         
		//*  36   68:invokevirtual   #595 <Method boolean DescriptorProtos$FileOptions.hasJavaMultipleFiles()>
		//*  37   71:ifeq            83
				setJavaMultipleFiles(fileoptions.getJavaMultipleFiles());
		//   38   74:aload_0         
		//   39   75:aload_1         
		//   40   76:invokevirtual   #597 <Method boolean DescriptorProtos$FileOptions.getJavaMultipleFiles()>
		//   41   79:invokevirtual   #601 <Method DescriptorProtos$FileOptions$Builder setJavaMultipleFiles(boolean)>
		//   42   82:pop             
			if(fileoptions.hasJavaGenerateEqualsAndHash())
		//*  43   83:aload_1         
		//*  44   84:invokevirtual   #603 <Method boolean DescriptorProtos$FileOptions.hasJavaGenerateEqualsAndHash()>
		//*  45   87:ifeq            99
				setJavaGenerateEqualsAndHash(fileoptions.getJavaGenerateEqualsAndHash());
		//   46   90:aload_0         
		//   47   91:aload_1         
		//   48   92:invokevirtual   #605 <Method boolean DescriptorProtos$FileOptions.getJavaGenerateEqualsAndHash()>
		//   49   95:invokevirtual   #608 <Method DescriptorProtos$FileOptions$Builder setJavaGenerateEqualsAndHash(boolean)>
		//   50   98:pop             
			if(fileoptions.hasJavaStringCheckUtf8())
		//*  51   99:aload_1         
		//*  52  100:invokevirtual   #610 <Method boolean DescriptorProtos$FileOptions.hasJavaStringCheckUtf8()>
		//*  53  103:ifeq            115
				setJavaStringCheckUtf8(fileoptions.getJavaStringCheckUtf8());
		//   54  106:aload_0         
		//   55  107:aload_1         
		//   56  108:invokevirtual   #612 <Method boolean DescriptorProtos$FileOptions.getJavaStringCheckUtf8()>
		//   57  111:invokevirtual   #615 <Method DescriptorProtos$FileOptions$Builder setJavaStringCheckUtf8(boolean)>
		//   58  114:pop             
			if(fileoptions.hasOptimizeFor())
		//*  59  115:aload_1         
		//*  60  116:invokevirtual   #617 <Method boolean DescriptorProtos$FileOptions.hasOptimizeFor()>
		//*  61  119:ifeq            131
				setOptimizeFor(fileoptions.getOptimizeFor());
		//   62  122:aload_0         
		//   63  123:aload_1         
		//   64  124:invokevirtual   #619 <Method DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions.getOptimizeFor()>
		//   65  127:invokevirtual   #623 <Method DescriptorProtos$FileOptions$Builder setOptimizeFor(DescriptorProtos$FileOptions$OptimizeMode)>
		//   66  130:pop             
			if(fileoptions.hasGoPackage())
		//*  67  131:aload_1         
		//*  68  132:invokevirtual   #625 <Method boolean DescriptorProtos$FileOptions.hasGoPackage()>
		//*  69  135:ifeq            161
			{
				bitField0_ = bitField0_ | 0x40;
		//   70  138:aload_0         
		//   71  139:aload_0         
		//   72  140:getfield        #87  <Field int bitField0_>
		//   73  143:bipush          64
		//   74  145:ior             
		//   75  146:putfield        #87  <Field int bitField0_>
				goPackage_ = fileoptions.goPackage_;
		//   76  149:aload_0         
		//   77  150:aload_1         
		//   78  151:invokestatic    #628 <Method Object DescriptorProtos$FileOptions.access$16000(DescriptorProtos$FileOptions)>
		//   79  154:putfield        #55  <Field Object goPackage_>
				onChanged();
		//   80  157:aload_0         
		//   81  158:invokevirtual   #137 <Method void onChanged()>
			}
			if(fileoptions.hasCcGenericServices())
		//*  82  161:aload_1         
		//*  83  162:invokevirtual   #630 <Method boolean DescriptorProtos$FileOptions.hasCcGenericServices()>
		//*  84  165:ifeq            177
				setCcGenericServices(fileoptions.getCcGenericServices());
		//   85  168:aload_0         
		//   86  169:aload_1         
		//   87  170:invokevirtual   #632 <Method boolean DescriptorProtos$FileOptions.getCcGenericServices()>
		//   88  173:invokevirtual   #635 <Method DescriptorProtos$FileOptions$Builder setCcGenericServices(boolean)>
		//   89  176:pop             
			if(fileoptions.hasJavaGenericServices())
		//*  90  177:aload_1         
		//*  91  178:invokevirtual   #637 <Method boolean DescriptorProtos$FileOptions.hasJavaGenericServices()>
		//*  92  181:ifeq            193
				setJavaGenericServices(fileoptions.getJavaGenericServices());
		//   93  184:aload_0         
		//   94  185:aload_1         
		//   95  186:invokevirtual   #639 <Method boolean DescriptorProtos$FileOptions.getJavaGenericServices()>
		//   96  189:invokevirtual   #642 <Method DescriptorProtos$FileOptions$Builder setJavaGenericServices(boolean)>
		//   97  192:pop             
			if(fileoptions.hasPyGenericServices())
		//*  98  193:aload_1         
		//*  99  194:invokevirtual   #644 <Method boolean DescriptorProtos$FileOptions.hasPyGenericServices()>
		//* 100  197:ifeq            209
				setPyGenericServices(fileoptions.getPyGenericServices());
		//  101  200:aload_0         
		//  102  201:aload_1         
		//  103  202:invokevirtual   #646 <Method boolean DescriptorProtos$FileOptions.getPyGenericServices()>
		//  104  205:invokevirtual   #649 <Method DescriptorProtos$FileOptions$Builder setPyGenericServices(boolean)>
		//  105  208:pop             
			if(fileoptions.hasPhpGenericServices())
		//* 106  209:aload_1         
		//* 107  210:invokevirtual   #651 <Method boolean DescriptorProtos$FileOptions.hasPhpGenericServices()>
		//* 108  213:ifeq            225
				setPhpGenericServices(fileoptions.getPhpGenericServices());
		//  109  216:aload_0         
		//  110  217:aload_1         
		//  111  218:invokevirtual   #653 <Method boolean DescriptorProtos$FileOptions.getPhpGenericServices()>
		//  112  221:invokevirtual   #656 <Method DescriptorProtos$FileOptions$Builder setPhpGenericServices(boolean)>
		//  113  224:pop             
			if(fileoptions.hasDeprecated())
		//* 114  225:aload_1         
		//* 115  226:invokevirtual   #658 <Method boolean DescriptorProtos$FileOptions.hasDeprecated()>
		//* 116  229:ifeq            241
				setDeprecated(fileoptions.getDeprecated());
		//  117  232:aload_0         
		//  118  233:aload_1         
		//  119  234:invokevirtual   #660 <Method boolean DescriptorProtos$FileOptions.getDeprecated()>
		//  120  237:invokevirtual   #663 <Method DescriptorProtos$FileOptions$Builder setDeprecated(boolean)>
		//  121  240:pop             
			if(fileoptions.hasCcEnableArenas())
		//* 122  241:aload_1         
		//* 123  242:invokevirtual   #665 <Method boolean DescriptorProtos$FileOptions.hasCcEnableArenas()>
		//* 124  245:ifeq            257
				setCcEnableArenas(fileoptions.getCcEnableArenas());
		//  125  248:aload_0         
		//  126  249:aload_1         
		//  127  250:invokevirtual   #667 <Method boolean DescriptorProtos$FileOptions.getCcEnableArenas()>
		//  128  253:invokevirtual   #670 <Method DescriptorProtos$FileOptions$Builder setCcEnableArenas(boolean)>
		//  129  256:pop             
			if(fileoptions.hasObjcClassPrefix())
		//* 130  257:aload_1         
		//* 131  258:invokevirtual   #672 <Method boolean DescriptorProtos$FileOptions.hasObjcClassPrefix()>
		//* 132  261:ifeq            288
			{
				bitField0_ = bitField0_ | 0x2000;
		//  133  264:aload_0         
		//  134  265:aload_0         
		//  135  266:getfield        #87  <Field int bitField0_>
		//  136  269:sipush          8192
		//  137  272:ior             
		//  138  273:putfield        #87  <Field int bitField0_>
				objcClassPrefix_ = fileoptions.objcClassPrefix_;
		//  139  276:aload_0         
		//  140  277:aload_1         
		//  141  278:invokestatic    #675 <Method Object DescriptorProtos$FileOptions.access$16700(DescriptorProtos$FileOptions)>
		//  142  281:putfield        #57  <Field Object objcClassPrefix_>
				onChanged();
		//  143  284:aload_0         
		//  144  285:invokevirtual   #137 <Method void onChanged()>
			}
			if(fileoptions.hasCsharpNamespace())
		//* 145  288:aload_1         
		//* 146  289:invokevirtual   #677 <Method boolean DescriptorProtos$FileOptions.hasCsharpNamespace()>
		//* 147  292:ifeq            319
			{
				bitField0_ = bitField0_ | 0x4000;
		//  148  295:aload_0         
		//  149  296:aload_0         
		//  150  297:getfield        #87  <Field int bitField0_>
		//  151  300:sipush          16384
		//  152  303:ior             
		//  153  304:putfield        #87  <Field int bitField0_>
				csharpNamespace_ = fileoptions.csharpNamespace_;
		//  154  307:aload_0         
		//  155  308:aload_1         
		//  156  309:invokestatic    #680 <Method Object DescriptorProtos$FileOptions.access$16800(DescriptorProtos$FileOptions)>
		//  157  312:putfield        #59  <Field Object csharpNamespace_>
				onChanged();
		//  158  315:aload_0         
		//  159  316:invokevirtual   #137 <Method void onChanged()>
			}
			if(fileoptions.hasSwiftPrefix())
		//* 160  319:aload_1         
		//* 161  320:invokevirtual   #682 <Method boolean DescriptorProtos$FileOptions.hasSwiftPrefix()>
		//* 162  323:ifeq            350
			{
				bitField0_ = bitField0_ | 0x8000;
		//  163  326:aload_0         
		//  164  327:aload_0         
		//  165  328:getfield        #87  <Field int bitField0_>
		//  166  331:ldc2            #289 <Int 32768>
		//  167  334:ior             
		//  168  335:putfield        #87  <Field int bitField0_>
				swiftPrefix_ = fileoptions.swiftPrefix_;
		//  169  338:aload_0         
		//  170  339:aload_1         
		//  171  340:invokestatic    #685 <Method Object DescriptorProtos$FileOptions.access$16900(DescriptorProtos$FileOptions)>
		//  172  343:putfield        #61  <Field Object swiftPrefix_>
				onChanged();
		//  173  346:aload_0         
		//  174  347:invokevirtual   #137 <Method void onChanged()>
			}
			if(fileoptions.hasPhpClassPrefix())
		//* 175  350:aload_1         
		//* 176  351:invokevirtual   #687 <Method boolean DescriptorProtos$FileOptions.hasPhpClassPrefix()>
		//* 177  354:ifeq            381
			{
				bitField0_ = bitField0_ | 0x10000;
		//  178  357:aload_0         
		//  179  358:aload_0         
		//  180  359:getfield        #87  <Field int bitField0_>
		//  181  362:ldc2            #293 <Int 0x10000>
		//  182  365:ior             
		//  183  366:putfield        #87  <Field int bitField0_>
				phpClassPrefix_ = fileoptions.phpClassPrefix_;
		//  184  369:aload_0         
		//  185  370:aload_1         
		//  186  371:invokestatic    #690 <Method Object DescriptorProtos$FileOptions.access$17000(DescriptorProtos$FileOptions)>
		//  187  374:putfield        #63  <Field Object phpClassPrefix_>
				onChanged();
		//  188  377:aload_0         
		//  189  378:invokevirtual   #137 <Method void onChanged()>
			}
			if(fileoptions.hasPhpNamespace())
		//* 190  381:aload_1         
		//* 191  382:invokevirtual   #692 <Method boolean DescriptorProtos$FileOptions.hasPhpNamespace()>
		//* 192  385:ifeq            412
			{
				bitField0_ = bitField0_ | 0x20000;
		//  193  388:aload_0         
		//  194  389:aload_0         
		//  195  390:getfield        #87  <Field int bitField0_>
		//  196  393:ldc2            #297 <Int 0x20000>
		//  197  396:ior             
		//  198  397:putfield        #87  <Field int bitField0_>
				phpNamespace_ = fileoptions.phpNamespace_;
		//  199  400:aload_0         
		//  200  401:aload_1         
		//  201  402:invokestatic    #695 <Method Object DescriptorProtos$FileOptions.access$17100(DescriptorProtos$FileOptions)>
		//  202  405:putfield        #65  <Field Object phpNamespace_>
				onChanged();
		//  203  408:aload_0         
		//  204  409:invokevirtual   #137 <Method void onChanged()>
			}
			if(uninterpretedOptionBuilder_ == null)
		//* 205  412:aload_0         
		//* 206  413:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//* 207  416:ifnonnull       491
			{
				if(!fileoptions.uninterpretedOption_.isEmpty())
		//* 208  419:aload_1         
		//* 209  420:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
		//* 210  423:invokeinterface #702 <Method boolean List.isEmpty()>
		//* 211  428:ifne            581
				{
					if(uninterpretedOption_.isEmpty())
		//* 212  431:aload_0         
		//* 213  432:getfield        #73  <Field List uninterpretedOption_>
		//* 214  435:invokeinterface #702 <Method boolean List.isEmpty()>
		//* 215  440:ifeq            466
					{
						uninterpretedOption_ = fileoptions.uninterpretedOption_;
		//  216  443:aload_0         
		//  217  444:aload_1         
		//  218  445:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
		//  219  448:putfield        #73  <Field List uninterpretedOption_>
						bitField0_ = bitField0_ & 0xfffbffff;
		//  220  451:aload_0         
		//  221  452:aload_0         
		//  222  453:getfield        #87  <Field int bitField0_>
		//  223  456:ldc2            #305 <Int 0xfffbffff>
		//  224  459:iand            
		//  225  460:putfield        #87  <Field int bitField0_>
					} else
		//* 226  463:goto            484
					{
						ensureUninterpretedOptionIsMutable();
		//  227  466:aload_0         
		//  228  467:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
						uninterpretedOption_.addAll(((java.util.Collection) (fileoptions.uninterpretedOption_)));
		//  229  470:aload_0         
		//  230  471:getfield        #73  <Field List uninterpretedOption_>
		//  231  474:aload_1         
		//  232  475:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
		//  233  478:invokeinterface #705 <Method boolean List.addAll(java.util.Collection)>
		//  234  483:pop             
					}
					onChanged();
		//  235  484:aload_0         
		//  236  485:invokevirtual   #137 <Method void onChanged()>
				}
			} else
		//* 237  488:goto            581
			if(!fileoptions.uninterpretedOption_.isEmpty())
		//* 238  491:aload_1         
		//* 239  492:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
		//* 240  495:invokeinterface #702 <Method boolean List.isEmpty()>
		//* 241  500:ifne            581
				if(uninterpretedOptionBuilder_.isEmpty())
		//* 242  503:aload_0         
		//* 243  504:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//* 244  507:invokevirtual   #706 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
		//* 245  510:ifeq            569
				{
					uninterpretedOptionBuilder_.dispose();
		//  246  513:aload_0         
		//  247  514:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//  248  517:invokevirtual   #709 <Method void RepeatedFieldBuilderV3.dispose()>
					uninterpretedOptionBuilder_ = null;
		//  249  520:aload_0         
		//  250  521:aconst_null     
		//  251  522:putfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
					uninterpretedOption_ = fileoptions.uninterpretedOption_;
		//  252  525:aload_0         
		//  253  526:aload_1         
		//  254  527:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
		//  255  530:putfield        #73  <Field List uninterpretedOption_>
					bitField0_ = bitField0_ & 0xfffbffff;
		//  256  533:aload_0         
		//  257  534:aload_0         
		//  258  535:getfield        #87  <Field int bitField0_>
		//  259  538:ldc2            #305 <Int 0xfffbffff>
		//  260  541:iand            
		//  261  542:putfield        #87  <Field int bitField0_>
					RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
					if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//* 262  545:getstatic       #122 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//* 263  548:ifeq            559
						repeatedfieldbuilderv3 = getUninterpretedOptionFieldBuilder();
		//  264  551:aload_0         
		//  265  552:invokespecial   #124 <Method RepeatedFieldBuilderV3 getUninterpretedOptionFieldBuilder()>
		//  266  555:astore_2        
					else
		//* 267  556:goto            561
						repeatedfieldbuilderv3 = null;
		//  268  559:aconst_null     
		//  269  560:astore_2        
					uninterpretedOptionBuilder_ = repeatedfieldbuilderv3;
		//  270  561:aload_0         
		//  271  562:aload_2         
		//  272  563:putfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
				} else
		//* 273  566:goto            581
				{
					uninterpretedOptionBuilder_.addAllMessages(((Iterable) (fileoptions.uninterpretedOption_)));
		//  274  569:aload_0         
		//  275  570:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//  276  573:aload_1         
		//  277  574:invokestatic    #699 <Method List DescriptorProtos$FileOptions.access$17200(DescriptorProtos$FileOptions)>
		//  278  577:invokevirtual   #141 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//  279  580:pop             
				}
			mergeExtensionFields(((GeneratedMessageV3.ExtendableMessage) (fileoptions)));
		//  280  581:aload_0         
		//  281  582:aload_1         
		//  282  583:invokevirtual   #713 <Method void mergeExtensionFields(GeneratedMessageV3$ExtendableMessage)>
			mergeUnknownFields(fileoptions.unknownFields);
		//  283  586:aload_0         
		//  284  587:aload_1         
		//  285  588:getfield        #717 <Field UnknownFieldSet DescriptorProtos$FileOptions.unknownFields>
		//  286  591:invokevirtual   #721 <Method DescriptorProtos$FileOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//  287  594:pop             
			onChanged();
		//  288  595:aload_0         
		//  289  596:invokevirtual   #137 <Method void onChanged()>
			return this;
		//  290  599:aload_0         
		//  291  600:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.FileOptions)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class DescriptorProtos$FileOptions>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.FileOptions)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class DescriptorProtos$FileOptions>
		//    6   12:invokevirtual   #575 <Method DescriptorProtos$FileOptions$Builder mergeFrom(DescriptorProtos$FileOptions)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #723 <Method AbstractMessage$Builder GeneratedMessageV3$ExtendableBuilder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #555 <Method DescriptorProtos$FileOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #559 <Method DescriptorProtos$FileOptions$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #555 <Method DescriptorProtos$FileOptions$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #721 <Method DescriptorProtos$FileOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #730 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #721 <Method DescriptorProtos$FileOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #721 <Method DescriptorProtos$FileOptions$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder removeUninterpretedOption(int i)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       28
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.remove(i);
		//    5   11:aload_0         
		//    6   12:getfield        #73  <Field List uninterpretedOption_>
		//    7   15:iload_1         
		//    8   16:invokeinterface #736 <Method Object List.remove(int)>
		//    9   21:pop             
				onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   12   26:aload_0         
		//   13   27:areturn         
			} else
			{
				uninterpretedOptionBuilder_.remove(i);
		//   14   28:aload_0         
		//   15   29:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #739 <Method void RepeatedFieldBuilderV3.remove(int)>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Builder setCcEnableArenas(boolean flag)
		{
			bitField0_ = bitField0_ | 0x1000;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          4096
		//    4    8:ior             
		//    5    9:putfield        #87  <Field int bitField0_>
			ccEnableArenas_ = flag;
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:putfield        #279 <Field boolean ccEnableArenas_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder setCcGenericServices(boolean flag)
		{
			bitField0_ = bitField0_ | 0x80;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          128
		//    4    8:ior             
		//    5    9:putfield        #87  <Field int bitField0_>
			ccGenericServices_ = flag;
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:putfield        #254 <Field boolean ccGenericServices_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder setCsharpNamespace(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x4000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:sipush          16384
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				csharpNamespace_ = ((Object) (s));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #59  <Field Object csharpNamespace_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setCsharpNamespaceBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x4000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:sipush          16384
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				csharpNamespace_ = ((Object) (bytestring));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #59  <Field Object csharpNamespace_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setDeprecated(boolean flag)
		{
			bitField0_ = bitField0_ | 0x800;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          2048
		//    4    8:ior             
		//    5    9:putfield        #87  <Field int bitField0_>
			deprecated_ = flag;
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:putfield        #274 <Field boolean deprecated_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #748 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    6   10:areturn         
		}

		public Builder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return (Builder)super.setExtension(generatedextension, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #751 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, int i, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #754 <Method DescriptorProtos$FileOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, int, Object)>
		//    5    7:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedextension, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setExtension(generatedextension, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #756 <Method DescriptorProtos$FileOptions$Builder setExtension(GeneratedMessage$GeneratedExtension, Object)>
		//    4    6:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #759 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #761 <Method DescriptorProtos$FileOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #761 <Method DescriptorProtos$FileOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #761 <Method DescriptorProtos$FileOptions$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setGoPackage(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x40;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:bipush          64
		//   10   19:ior             
		//   11   20:putfield        #87  <Field int bitField0_>
				goPackage_ = ((Object) (s));
		//   12   23:aload_0         
		//   13   24:aload_1         
		//   14   25:putfield        #55  <Field Object goPackage_>
				onChanged();
		//   15   28:aload_0         
		//   16   29:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   32:aload_0         
		//   18   33:areturn         
			}
		}

		public Builder setGoPackageBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x40;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:bipush          64
		//   10   19:ior             
		//   11   20:putfield        #87  <Field int bitField0_>
				goPackage_ = ((Object) (bytestring));
		//   12   23:aload_0         
		//   13   24:aload_1         
		//   14   25:putfield        #55  <Field Object goPackage_>
				onChanged();
		//   15   28:aload_0         
		//   16   29:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   32:aload_0         
		//   18   33:areturn         
			}
		}

		public Builder setJavaGenerateEqualsAndHash(boolean flag)
		{
			bitField0_ = bitField0_ | 8;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:bipush          8
		//    4    7:ior             
		//    5    8:putfield        #87  <Field int bitField0_>
			javaGenerateEqualsAndHash_ = flag;
		//    6   11:aload_0         
		//    7   12:iload_1         
		//    8   13:putfield        #237 <Field boolean javaGenerateEqualsAndHash_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder setJavaGenericServices(boolean flag)
		{
			bitField0_ = bitField0_ | 0x100;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          256
		//    4    8:ior             
		//    5    9:putfield        #87  <Field int bitField0_>
			javaGenericServices_ = flag;
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:putfield        #259 <Field boolean javaGenericServices_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder setJavaMultipleFiles(boolean flag)
		{
			bitField0_ = bitField0_ | 4;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:iconst_4        
		//    4    6:ior             
		//    5    7:putfield        #87  <Field int bitField0_>
			javaMultipleFiles_ = flag;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #231 <Field boolean javaMultipleFiles_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public Builder setJavaOuterClassname(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 2;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:iconst_2        
		//   10   18:ior             
		//   11   19:putfield        #87  <Field int bitField0_>
				javaOuterClassname_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #51  <Field Object javaOuterClassname_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setJavaOuterClassnameBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 2;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:iconst_2        
		//   10   18:ior             
		//   11   19:putfield        #87  <Field int bitField0_>
				javaOuterClassname_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #51  <Field Object javaOuterClassname_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setJavaPackage(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #87  <Field int bitField0_>
				javaPackage_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #49  <Field Object javaPackage_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setJavaPackageBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #87  <Field int bitField0_>
				javaPackage_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #49  <Field Object javaPackage_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setJavaStringCheckUtf8(boolean flag)
		{
			bitField0_ = bitField0_ | 0x10;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:bipush          16
		//    4    7:ior             
		//    5    8:putfield        #87  <Field int bitField0_>
			javaStringCheckUtf8_ = flag;
		//    6   11:aload_0         
		//    7   12:iload_1         
		//    8   13:putfield        #242 <Field boolean javaStringCheckUtf8_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder setObjcClassPrefix(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x2000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:sipush          8192
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				objcClassPrefix_ = ((Object) (s));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #57  <Field Object objcClassPrefix_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setObjcClassPrefixBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x2000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:sipush          8192
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				objcClassPrefix_ = ((Object) (bytestring));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #57  <Field Object objcClassPrefix_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setOptimizeFor(OptimizeMode optimizemode)
		{
			if(optimizemode == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x20;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:bipush          32
		//   10   19:ior             
		//   11   20:putfield        #87  <Field int bitField0_>
				optimizeFor_ = optimizemode.getNumber();
		//   12   23:aload_0         
		//   13   24:aload_1         
		//   14   25:invokevirtual   #772 <Method int DescriptorProtos$FileOptions$OptimizeMode.getNumber()>
		//   15   28:putfield        #53  <Field int optimizeFor_>
				onChanged();
		//   16   31:aload_0         
		//   17   32:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   18   35:aload_0         
		//   19   36:areturn         
			}
		}

		public Builder setPhpClassPrefix(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x10000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:ldc2            #293 <Int 0x10000>
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				phpClassPrefix_ = ((Object) (s));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #63  <Field Object phpClassPrefix_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setPhpClassPrefixBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x10000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:ldc2            #293 <Int 0x10000>
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				phpClassPrefix_ = ((Object) (bytestring));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #63  <Field Object phpClassPrefix_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setPhpGenericServices(boolean flag)
		{
			bitField0_ = bitField0_ | 0x400;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          1024
		//    4    8:ior             
		//    5    9:putfield        #87  <Field int bitField0_>
			phpGenericServices_ = flag;
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:putfield        #269 <Field boolean phpGenericServices_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder setPhpNamespace(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x20000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:ldc2            #297 <Int 0x20000>
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				phpNamespace_ = ((Object) (s));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #65  <Field Object phpNamespace_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setPhpNamespaceBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x20000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:ldc2            #297 <Int 0x20000>
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				phpNamespace_ = ((Object) (bytestring));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #65  <Field Object phpNamespace_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setPyGenericServices(boolean flag)
		{
			bitField0_ = bitField0_ | 0x200;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #87  <Field int bitField0_>
		//    3    5:sipush          512
		//    4    8:ior             
		//    5    9:putfield        #87  <Field int bitField0_>
			pyGenericServices_ = flag;
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:putfield        #264 <Field boolean pyGenericServices_>
			onChanged();
		//    9   17:aload_0         
		//   10   18:invokevirtual   #137 <Method void onChanged()>
			return this;
		//   11   21:aload_0         
		//   12   22:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #781 <Method GeneratedMessageV3$ExtendableBuilder GeneratedMessageV3$ExtendableBuilder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #784 <Method DescriptorProtos$FileOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile GeneratedMessageV3.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.ExtendableBuilder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #784 <Method DescriptorProtos$FileOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #784 <Method DescriptorProtos$FileOptions$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setSwiftPrefix(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x8000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:ldc2            #289 <Int 32768>
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				swiftPrefix_ = ((Object) (s));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #61  <Field Object swiftPrefix_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setSwiftPrefixBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #180 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #181 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x8000;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #87  <Field int bitField0_>
		//    9   17:ldc2            #289 <Int 32768>
		//   10   20:ior             
		//   11   21:putfield        #87  <Field int bitField0_>
				swiftPrefix_ = ((Object) (bytestring));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #61  <Field Object swiftPrefix_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setUninterpretedOption(int i, DescriptorProtos.UninterpretedOption.Builder builder)
		{
			if(uninterpretedOptionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureUninterpretedOptionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
				uninterpretedOption_.set(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #73  <Field List uninterpretedOption_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   10   20:invokeinterface #792 <Method Object List.set(int, Object)>
		//   11   25:pop             
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #137 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
		//   16   32:aload_0         
		//   17   33:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   18   36:iload_1         
		//   19   37:aload_2         
		//   20   38:invokevirtual   #167 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption$Builder.build()>
		//   21   41:invokevirtual   #795 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
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
		//*   1    1:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(uninterpretedoption == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #180 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #181 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureUninterpretedOptionIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #128 <Method void ensureUninterpretedOptionIsMutable()>
					uninterpretedOption_.set(i, ((Object) (uninterpretedoption)));
		//   11   23:aload_0         
		//   12   24:getfield        #73  <Field List uninterpretedOption_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #792 <Method Object List.set(int, Object)>
		//   16   34:pop             
					onChanged();
		//   17   35:aload_0         
		//   18   36:invokevirtual   #137 <Method void onChanged()>
					return this;
		//   19   39:aload_0         
		//   20   40:areturn         
				}
			} else
			{
				uninterpretedOptionBuilder_.setMessage(i, ((AbstractMessage) (uninterpretedoption)));
		//   21   41:aload_0         
		//   22   42:getfield        #102 <Field RepeatedFieldBuilderV3 uninterpretedOptionBuilder_>
		//   23   45:iload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #795 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
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
		//    2    2:invokespecial   #798 <Method GeneratedMessageV3$Builder GeneratedMessageV3$ExtendableBuilder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$FileOptions$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #800 <Method DescriptorProtos$FileOptions$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #800 <Method DescriptorProtos$FileOptions$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private boolean ccEnableArenas_;
		private boolean ccGenericServices_;
		private Object csharpNamespace_;
		private boolean deprecated_;
		private Object goPackage_;
		private boolean javaGenerateEqualsAndHash_;
		private boolean javaGenericServices_;
		private boolean javaMultipleFiles_;
		private Object javaOuterClassname_;
		private Object javaPackage_;
		private boolean javaStringCheckUtf8_;
		private Object objcClassPrefix_;
		private int optimizeFor_;
		private Object phpClassPrefix_;
		private boolean phpGenericServices_;
		private Object phpNamespace_;
		private boolean pyGenericServices_;
		private Object swiftPrefix_;
		private RepeatedFieldBuilderV3 uninterpretedOptionBuilder_;
		private List uninterpretedOption_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void GeneratedMessageV3$ExtendableBuilder()>
			javaPackage_ = "";
		//    2    4:aload_0         
		//    3    5:ldc1            #47  <String "">
		//    4    7:putfield        #49  <Field Object javaPackage_>
			javaOuterClassname_ = "";
		//    5   10:aload_0         
		//    6   11:ldc1            #47  <String "">
		//    7   13:putfield        #51  <Field Object javaOuterClassname_>
			optimizeFor_ = 1;
		//    8   16:aload_0         
		//    9   17:iconst_1        
		//   10   18:putfield        #53  <Field int optimizeFor_>
			goPackage_ = "";
		//   11   21:aload_0         
		//   12   22:ldc1            #47  <String "">
		//   13   24:putfield        #55  <Field Object goPackage_>
			objcClassPrefix_ = "";
		//   14   27:aload_0         
		//   15   28:ldc1            #47  <String "">
		//   16   30:putfield        #57  <Field Object objcClassPrefix_>
			csharpNamespace_ = "";
		//   17   33:aload_0         
		//   18   34:ldc1            #47  <String "">
		//   19   36:putfield        #59  <Field Object csharpNamespace_>
			swiftPrefix_ = "";
		//   20   39:aload_0         
		//   21   40:ldc1            #47  <String "">
		//   22   42:putfield        #61  <Field Object swiftPrefix_>
			phpClassPrefix_ = "";
		//   23   45:aload_0         
		//   24   46:ldc1            #47  <String "">
		//   25   48:putfield        #63  <Field Object phpClassPrefix_>
			phpNamespace_ = "";
		//   26   51:aload_0         
		//   27   52:ldc1            #47  <String "">
		//   28   54:putfield        #65  <Field Object phpNamespace_>
			uninterpretedOption_ = Collections.emptyList();
		//   29   57:aload_0         
		//   30   58:invokestatic    #71  <Method List Collections.emptyList()>
		//   31   61:putfield        #73  <Field List uninterpretedOption_>
			maybeForceBuilderInitialization();
		//   32   64:aload_0         
		//   33   65:invokespecial   #76  <Method void maybeForceBuilderInitialization()>
		//   34   68:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #79  <Method void DescriptorProtos$FileOptions$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #82  <Method void GeneratedMessageV3$ExtendableBuilder(GeneratedMessageV3$BuilderParent)>
			javaPackage_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #47  <String "">
		//    5    8:putfield        #49  <Field Object javaPackage_>
			javaOuterClassname_ = "";
		//    6   11:aload_0         
		//    7   12:ldc1            #47  <String "">
		//    8   14:putfield        #51  <Field Object javaOuterClassname_>
			optimizeFor_ = 1;
		//    9   17:aload_0         
		//   10   18:iconst_1        
		//   11   19:putfield        #53  <Field int optimizeFor_>
			goPackage_ = "";
		//   12   22:aload_0         
		//   13   23:ldc1            #47  <String "">
		//   14   25:putfield        #55  <Field Object goPackage_>
			objcClassPrefix_ = "";
		//   15   28:aload_0         
		//   16   29:ldc1            #47  <String "">
		//   17   31:putfield        #57  <Field Object objcClassPrefix_>
			csharpNamespace_ = "";
		//   18   34:aload_0         
		//   19   35:ldc1            #47  <String "">
		//   20   37:putfield        #59  <Field Object csharpNamespace_>
			swiftPrefix_ = "";
		//   21   40:aload_0         
		//   22   41:ldc1            #47  <String "">
		//   23   43:putfield        #61  <Field Object swiftPrefix_>
			phpClassPrefix_ = "";
		//   24   46:aload_0         
		//   25   47:ldc1            #47  <String "">
		//   26   49:putfield        #63  <Field Object phpClassPrefix_>
			phpNamespace_ = "";
		//   27   52:aload_0         
		//   28   53:ldc1            #47  <String "">
		//   29   55:putfield        #65  <Field Object phpNamespace_>
			uninterpretedOption_ = Collections.emptyList();
		//   30   58:aload_0         
		//   31   59:invokestatic    #71  <Method List Collections.emptyList()>
		//   32   62:putfield        #73  <Field List uninterpretedOption_>
			maybeForceBuilderInitialization();
		//   33   65:aload_0         
		//   34   66:invokespecial   #76  <Method void maybeForceBuilderInitialization()>
		//   35   69:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #84  <Method void DescriptorProtos$FileOptions$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static final class OptimizeMode extends Enum
		implements ProtocolMessageEnum
	{

		public static OptimizeMode forNumber(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     1 3: default 28
		//		               1 31
		//		               2 35
		//		               3 39
		//*   2   28:goto            43
			case 1: // '\001'
				return SPEED;
		//    3   31:getstatic       #42  <Field DescriptorProtos$FileOptions$OptimizeMode SPEED>
		//    4   34:areturn         

			case 2: // '\002'
				return CODE_SIZE;
		//    5   35:getstatic       #45  <Field DescriptorProtos$FileOptions$OptimizeMode CODE_SIZE>
		//    6   38:areturn         

			case 3: // '\003'
				return LITE_RUNTIME;
		//    7   39:getstatic       #48  <Field DescriptorProtos$FileOptions$OptimizeMode LITE_RUNTIME>
		//    8   42:areturn         
			}
			return null;
		//    9   43:aconst_null     
		//   10   44:areturn         
		}

		public static final Descriptors.EnumDescriptor getDescriptor()
		{
			return (Descriptors.EnumDescriptor)DescriptorProtos.FileOptions.getDescriptor().getEnumTypes().get(0);
		//    0    0:invokestatic    #75  <Method Descriptors$Descriptor DescriptorProtos$FileOptions.getDescriptor()>
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

		public static OptimizeMode valueOf(int i)
		{
			return forNumber(i);
		//    0    0:iload_0         
		//    1    1:invokestatic    #96  <Method DescriptorProtos$FileOptions$OptimizeMode forNumber(int)>
		//    2    4:areturn         
		}

		public static OptimizeMode valueOf(Descriptors.EnumValueDescriptor enumvaluedescriptor)
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
		//    9   20:getstatic       #60  <Field DescriptorProtos$FileOptions$OptimizeMode[] VALUES>
		//   10   23:aload_0         
		//   11   24:invokevirtual   #116 <Method int Descriptors$EnumValueDescriptor.getIndex()>
		//   12   27:aaload          
		//   13   28:areturn         
		}

		public static OptimizeMode valueOf(String s)
		{
			return (OptimizeMode)Enum.valueOf(com/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode, s);
		//    0    0:ldc1            #2   <Class DescriptorProtos$FileOptions$OptimizeMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #120 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DescriptorProtos$FileOptions$OptimizeMode>
		//    4    9:areturn         
		}

		public static OptimizeMode[] values()
		{
			return (OptimizeMode[])((OptimizeMode []) ($VALUES)).clone();
		//    0    0:getstatic       #50  <Field DescriptorProtos$FileOptions$OptimizeMode[] $VALUES>
		//    1    3:invokevirtual   #125 <Method Object _5B_Lcom.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode_3B_.clone()>
		//    2    6:checkcast       #121 <Class DescriptorProtos$FileOptions$OptimizeMode[]>
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

		private static final OptimizeMode $VALUES[];
		public static final OptimizeMode CODE_SIZE;
		public static final int CODE_SIZE_VALUE = 2;
		public static final OptimizeMode LITE_RUNTIME;
		public static final int LITE_RUNTIME_VALUE = 3;
		public static final OptimizeMode SPEED;
		public static final int SPEED_VALUE = 1;
		private static final OptimizeMode VALUES[] = values();
		private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() {

			public OptimizeMode findValueByNumber(int i)
			{
				return OptimizeMode.forNumber(i);
			//    0    0:iload_1         
			//    1    1:invokestatic    #25  <Method DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions$OptimizeMode.forNumber(int)>
			//    2    4:areturn         
			}

			public volatile Internal.EnumLite findValueByNumber(int i)
			{
				return ((Internal.EnumLite) (findValueByNumber(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #28  <Method DescriptorProtos$FileOptions$OptimizeMode findValueByNumber(int)>
			//    3    5:areturn         
			}

		}
;
		private final int value;

		static 
		{
			SPEED = new OptimizeMode("SPEED", 0, 1);
		//    0    0:new             #2   <Class DescriptorProtos$FileOptions$OptimizeMode>
		//    1    3:dup             
		//    2    4:ldc1            #36  <String "SPEED">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #40  <Method void DescriptorProtos$FileOptions$OptimizeMode(String, int, int)>
		//    6   11:putstatic       #42  <Field DescriptorProtos$FileOptions$OptimizeMode SPEED>
			CODE_SIZE = new OptimizeMode("CODE_SIZE", 1, 2);
		//    7   14:new             #2   <Class DescriptorProtos$FileOptions$OptimizeMode>
		//    8   17:dup             
		//    9   18:ldc1            #43  <String "CODE_SIZE">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #40  <Method void DescriptorProtos$FileOptions$OptimizeMode(String, int, int)>
		//   13   25:putstatic       #45  <Field DescriptorProtos$FileOptions$OptimizeMode CODE_SIZE>
			LITE_RUNTIME = new OptimizeMode("LITE_RUNTIME", 2, 3);
		//   14   28:new             #2   <Class DescriptorProtos$FileOptions$OptimizeMode>
		//   15   31:dup             
		//   16   32:ldc1            #46  <String "LITE_RUNTIME">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #40  <Method void DescriptorProtos$FileOptions$OptimizeMode(String, int, int)>
		//   20   39:putstatic       #48  <Field DescriptorProtos$FileOptions$OptimizeMode LITE_RUNTIME>
			$VALUES = (new OptimizeMode[] {
				SPEED, CODE_SIZE, LITE_RUNTIME
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       OptimizeMode[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #42  <Field DescriptorProtos$FileOptions$OptimizeMode SPEED>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #45  <Field DescriptorProtos$FileOptions$OptimizeMode CODE_SIZE>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #48  <Field DescriptorProtos$FileOptions$OptimizeMode LITE_RUNTIME>
		//   34   63:aastore         
		//   35   64:putstatic       #50  <Field DescriptorProtos$FileOptions$OptimizeMode[] $VALUES>
		//   36   67:new             #15  <Class DescriptorProtos$FileOptions$OptimizeMode$1>
		//   37   70:dup             
		//   38   71:invokespecial   #52  <Method void DescriptorProtos$FileOptions$OptimizeMode$1()>
		//   39   74:putstatic       #54  <Field Internal$EnumLiteMap internalValueMap>
		//   40   77:invokestatic    #58  <Method DescriptorProtos$FileOptions$OptimizeMode[] values()>
		//   41   80:putstatic       #60  <Field DescriptorProtos$FileOptions$OptimizeMode[] VALUES>
		//*  42   83:return          
		}

		private OptimizeMode(String s, int i, int j)
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


	public static DescriptorProtos$FileOptions getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #102 <Field DescriptorProtos$FileOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$14900();
	//    0    0:invokestatic    #297 <Method Descriptors$Descriptor DescriptorProtos.access$14900()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #102 <Field DescriptorProtos$FileOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #301 <Method DescriptorProtos$FileOptions$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$fileoptions);
	//    0    0:getstatic       #102 <Field DescriptorProtos$FileOptions DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #301 <Method DescriptorProtos$FileOptions$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #305 <Method DescriptorProtos$FileOptions$Builder DescriptorProtos$FileOptions$Builder.mergeFrom(DescriptorProtos$FileOptions)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$FileOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #313 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FileOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #317 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileOptions)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #324 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileOptions)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #328 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$FileOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #333 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FileOptions)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #337 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$FileOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #339 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FileOptions)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #341 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileOptions)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #345 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileOptions)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #349 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    5   13:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileOptions)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #353 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FileOptions parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileOptions)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #357 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #105 <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$FileOptions))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$FileOptions>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #363 <Method boolean GeneratedMessageV3$ExtendableMessage.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$FileOptions)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$FileOptions>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasJavaPackage() == ((DescriptorProtos$FileOptions) (obj)).hasJavaPackage())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #366 <Method boolean hasJavaPackage()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #366 <Method boolean hasJavaPackage()>
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
		if(hasJavaPackage())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #366 <Method boolean hasJavaPackage()>
	//*  31   53:ifeq            81
			if(flag && getJavaPackage().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getJavaPackage()))))
	//*  32   56:iload_2         
	//*  33   57:ifeq            79
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #370 <Method String getJavaPackage()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #370 <Method String getJavaPackage()>
	//*  38   68:invokevirtual   #373 <Method boolean String.equals(Object)>
	//*  39   71:ifeq            79
				flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
			else
	//*  42   76:goto            81
				flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if(flag1 && hasJavaOuterClassname() == ((DescriptorProtos$FileOptions) (obj)).hasJavaOuterClassname())
	//*  45   81:iload_3         
	//*  46   82:ifeq            101
	//*  47   85:aload_0         
	//*  48   86:invokevirtual   #376 <Method boolean hasJavaOuterClassname()>
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #376 <Method boolean hasJavaOuterClassname()>
	//*  51   93:icmpne          101
			flag = true;
	//   52   96:iconst_1        
	//   53   97:istore_2        
		else
	//*  54   98:goto            103
			flag = false;
	//   55  101:iconst_0        
	//   56  102:istore_2        
		flag1 = flag;
	//   57  103:iload_2         
	//   58  104:istore_3        
		if(hasJavaOuterClassname())
	//*  59  105:aload_0         
	//*  60  106:invokevirtual   #376 <Method boolean hasJavaOuterClassname()>
	//*  61  109:ifeq            137
			if(flag && getJavaOuterClassname().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getJavaOuterClassname()))))
	//*  62  112:iload_2         
	//*  63  113:ifeq            135
	//*  64  116:aload_0         
	//*  65  117:invokevirtual   #379 <Method String getJavaOuterClassname()>
	//*  66  120:aload_1         
	//*  67  121:invokevirtual   #379 <Method String getJavaOuterClassname()>
	//*  68  124:invokevirtual   #373 <Method boolean String.equals(Object)>
	//*  69  127:ifeq            135
				flag1 = true;
	//   70  130:iconst_1        
	//   71  131:istore_3        
			else
	//*  72  132:goto            137
				flag1 = false;
	//   73  135:iconst_0        
	//   74  136:istore_3        
		if(flag1 && hasJavaMultipleFiles() == ((DescriptorProtos$FileOptions) (obj)).hasJavaMultipleFiles())
	//*  75  137:iload_3         
	//*  76  138:ifeq            157
	//*  77  141:aload_0         
	//*  78  142:invokevirtual   #382 <Method boolean hasJavaMultipleFiles()>
	//*  79  145:aload_1         
	//*  80  146:invokevirtual   #382 <Method boolean hasJavaMultipleFiles()>
	//*  81  149:icmpne          157
			flag = true;
	//   82  152:iconst_1        
	//   83  153:istore_2        
		else
	//*  84  154:goto            159
			flag = false;
	//   85  157:iconst_0        
	//   86  158:istore_2        
		flag1 = flag;
	//   87  159:iload_2         
	//   88  160:istore_3        
		if(hasJavaMultipleFiles())
	//*  89  161:aload_0         
	//*  90  162:invokevirtual   #382 <Method boolean hasJavaMultipleFiles()>
	//*  91  165:ifeq            190
			if(flag && getJavaMultipleFiles() == ((DescriptorProtos$FileOptions) (obj)).getJavaMultipleFiles())
	//*  92  168:iload_2         
	//*  93  169:ifeq            188
	//*  94  172:aload_0         
	//*  95  173:invokevirtual   #385 <Method boolean getJavaMultipleFiles()>
	//*  96  176:aload_1         
	//*  97  177:invokevirtual   #385 <Method boolean getJavaMultipleFiles()>
	//*  98  180:icmpne          188
				flag1 = true;
	//   99  183:iconst_1        
	//  100  184:istore_3        
			else
	//* 101  185:goto            190
				flag1 = false;
	//  102  188:iconst_0        
	//  103  189:istore_3        
		if(flag1 && hasJavaGenerateEqualsAndHash() == ((DescriptorProtos$FileOptions) (obj)).hasJavaGenerateEqualsAndHash())
	//* 104  190:iload_3         
	//* 105  191:ifeq            210
	//* 106  194:aload_0         
	//* 107  195:invokevirtual   #388 <Method boolean hasJavaGenerateEqualsAndHash()>
	//* 108  198:aload_1         
	//* 109  199:invokevirtual   #388 <Method boolean hasJavaGenerateEqualsAndHash()>
	//* 110  202:icmpne          210
			flag = true;
	//  111  205:iconst_1        
	//  112  206:istore_2        
		else
	//* 113  207:goto            212
			flag = false;
	//  114  210:iconst_0        
	//  115  211:istore_2        
		flag1 = flag;
	//  116  212:iload_2         
	//  117  213:istore_3        
		if(hasJavaGenerateEqualsAndHash())
	//* 118  214:aload_0         
	//* 119  215:invokevirtual   #388 <Method boolean hasJavaGenerateEqualsAndHash()>
	//* 120  218:ifeq            243
			if(flag && getJavaGenerateEqualsAndHash() == ((DescriptorProtos$FileOptions) (obj)).getJavaGenerateEqualsAndHash())
	//* 121  221:iload_2         
	//* 122  222:ifeq            241
	//* 123  225:aload_0         
	//* 124  226:invokevirtual   #391 <Method boolean getJavaGenerateEqualsAndHash()>
	//* 125  229:aload_1         
	//* 126  230:invokevirtual   #391 <Method boolean getJavaGenerateEqualsAndHash()>
	//* 127  233:icmpne          241
				flag1 = true;
	//  128  236:iconst_1        
	//  129  237:istore_3        
			else
	//* 130  238:goto            243
				flag1 = false;
	//  131  241:iconst_0        
	//  132  242:istore_3        
		if(flag1 && hasJavaStringCheckUtf8() == ((DescriptorProtos$FileOptions) (obj)).hasJavaStringCheckUtf8())
	//* 133  243:iload_3         
	//* 134  244:ifeq            263
	//* 135  247:aload_0         
	//* 136  248:invokevirtual   #394 <Method boolean hasJavaStringCheckUtf8()>
	//* 137  251:aload_1         
	//* 138  252:invokevirtual   #394 <Method boolean hasJavaStringCheckUtf8()>
	//* 139  255:icmpne          263
			flag = true;
	//  140  258:iconst_1        
	//  141  259:istore_2        
		else
	//* 142  260:goto            265
			flag = false;
	//  143  263:iconst_0        
	//  144  264:istore_2        
		flag1 = flag;
	//  145  265:iload_2         
	//  146  266:istore_3        
		if(hasJavaStringCheckUtf8())
	//* 147  267:aload_0         
	//* 148  268:invokevirtual   #394 <Method boolean hasJavaStringCheckUtf8()>
	//* 149  271:ifeq            296
			if(flag && getJavaStringCheckUtf8() == ((DescriptorProtos$FileOptions) (obj)).getJavaStringCheckUtf8())
	//* 150  274:iload_2         
	//* 151  275:ifeq            294
	//* 152  278:aload_0         
	//* 153  279:invokevirtual   #397 <Method boolean getJavaStringCheckUtf8()>
	//* 154  282:aload_1         
	//* 155  283:invokevirtual   #397 <Method boolean getJavaStringCheckUtf8()>
	//* 156  286:icmpne          294
				flag1 = true;
	//  157  289:iconst_1        
	//  158  290:istore_3        
			else
	//* 159  291:goto            296
				flag1 = false;
	//  160  294:iconst_0        
	//  161  295:istore_3        
		if(flag1 && hasOptimizeFor() == ((DescriptorProtos$FileOptions) (obj)).hasOptimizeFor())
	//* 162  296:iload_3         
	//* 163  297:ifeq            316
	//* 164  300:aload_0         
	//* 165  301:invokevirtual   #400 <Method boolean hasOptimizeFor()>
	//* 166  304:aload_1         
	//* 167  305:invokevirtual   #400 <Method boolean hasOptimizeFor()>
	//* 168  308:icmpne          316
			flag = true;
	//  169  311:iconst_1        
	//  170  312:istore_2        
		else
	//* 171  313:goto            318
			flag = false;
	//  172  316:iconst_0        
	//  173  317:istore_2        
		flag1 = flag;
	//  174  318:iload_2         
	//  175  319:istore_3        
		if(hasOptimizeFor())
	//* 176  320:aload_0         
	//* 177  321:invokevirtual   #400 <Method boolean hasOptimizeFor()>
	//* 178  324:ifeq            349
			if(flag && optimizeFor_ == ((DescriptorProtos$FileOptions) (obj)).optimizeFor_)
	//* 179  327:iload_2         
	//* 180  328:ifeq            347
	//* 181  331:aload_0         
	//* 182  332:getfield        #123 <Field int optimizeFor_>
	//* 183  335:aload_1         
	//* 184  336:getfield        #123 <Field int optimizeFor_>
	//* 185  339:icmpne          347
				flag1 = true;
	//  186  342:iconst_1        
	//  187  343:istore_3        
			else
	//* 188  344:goto            349
				flag1 = false;
	//  189  347:iconst_0        
	//  190  348:istore_3        
		if(flag1 && hasGoPackage() == ((DescriptorProtos$FileOptions) (obj)).hasGoPackage())
	//* 191  349:iload_3         
	//* 192  350:ifeq            369
	//* 193  353:aload_0         
	//* 194  354:invokevirtual   #403 <Method boolean hasGoPackage()>
	//* 195  357:aload_1         
	//* 196  358:invokevirtual   #403 <Method boolean hasGoPackage()>
	//* 197  361:icmpne          369
			flag = true;
	//  198  364:iconst_1        
	//  199  365:istore_2        
		else
	//* 200  366:goto            371
			flag = false;
	//  201  369:iconst_0        
	//  202  370:istore_2        
		flag1 = flag;
	//  203  371:iload_2         
	//  204  372:istore_3        
		if(hasGoPackage())
	//* 205  373:aload_0         
	//* 206  374:invokevirtual   #403 <Method boolean hasGoPackage()>
	//* 207  377:ifeq            405
			if(flag && getGoPackage().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getGoPackage()))))
	//* 208  380:iload_2         
	//* 209  381:ifeq            403
	//* 210  384:aload_0         
	//* 211  385:invokevirtual   #406 <Method String getGoPackage()>
	//* 212  388:aload_1         
	//* 213  389:invokevirtual   #406 <Method String getGoPackage()>
	//* 214  392:invokevirtual   #373 <Method boolean String.equals(Object)>
	//* 215  395:ifeq            403
				flag1 = true;
	//  216  398:iconst_1        
	//  217  399:istore_3        
			else
	//* 218  400:goto            405
				flag1 = false;
	//  219  403:iconst_0        
	//  220  404:istore_3        
		if(flag1 && hasCcGenericServices() == ((DescriptorProtos$FileOptions) (obj)).hasCcGenericServices())
	//* 221  405:iload_3         
	//* 222  406:ifeq            425
	//* 223  409:aload_0         
	//* 224  410:invokevirtual   #409 <Method boolean hasCcGenericServices()>
	//* 225  413:aload_1         
	//* 226  414:invokevirtual   #409 <Method boolean hasCcGenericServices()>
	//* 227  417:icmpne          425
			flag = true;
	//  228  420:iconst_1        
	//  229  421:istore_2        
		else
	//* 230  422:goto            427
			flag = false;
	//  231  425:iconst_0        
	//  232  426:istore_2        
		flag1 = flag;
	//  233  427:iload_2         
	//  234  428:istore_3        
		if(hasCcGenericServices())
	//* 235  429:aload_0         
	//* 236  430:invokevirtual   #409 <Method boolean hasCcGenericServices()>
	//* 237  433:ifeq            458
			if(flag && getCcGenericServices() == ((DescriptorProtos$FileOptions) (obj)).getCcGenericServices())
	//* 238  436:iload_2         
	//* 239  437:ifeq            456
	//* 240  440:aload_0         
	//* 241  441:invokevirtual   #412 <Method boolean getCcGenericServices()>
	//* 242  444:aload_1         
	//* 243  445:invokevirtual   #412 <Method boolean getCcGenericServices()>
	//* 244  448:icmpne          456
				flag1 = true;
	//  245  451:iconst_1        
	//  246  452:istore_3        
			else
	//* 247  453:goto            458
				flag1 = false;
	//  248  456:iconst_0        
	//  249  457:istore_3        
		if(flag1 && hasJavaGenericServices() == ((DescriptorProtos$FileOptions) (obj)).hasJavaGenericServices())
	//* 250  458:iload_3         
	//* 251  459:ifeq            478
	//* 252  462:aload_0         
	//* 253  463:invokevirtual   #415 <Method boolean hasJavaGenericServices()>
	//* 254  466:aload_1         
	//* 255  467:invokevirtual   #415 <Method boolean hasJavaGenericServices()>
	//* 256  470:icmpne          478
			flag = true;
	//  257  473:iconst_1        
	//  258  474:istore_2        
		else
	//* 259  475:goto            480
			flag = false;
	//  260  478:iconst_0        
	//  261  479:istore_2        
		flag1 = flag;
	//  262  480:iload_2         
	//  263  481:istore_3        
		if(hasJavaGenericServices())
	//* 264  482:aload_0         
	//* 265  483:invokevirtual   #415 <Method boolean hasJavaGenericServices()>
	//* 266  486:ifeq            511
			if(flag && getJavaGenericServices() == ((DescriptorProtos$FileOptions) (obj)).getJavaGenericServices())
	//* 267  489:iload_2         
	//* 268  490:ifeq            509
	//* 269  493:aload_0         
	//* 270  494:invokevirtual   #418 <Method boolean getJavaGenericServices()>
	//* 271  497:aload_1         
	//* 272  498:invokevirtual   #418 <Method boolean getJavaGenericServices()>
	//* 273  501:icmpne          509
				flag1 = true;
	//  274  504:iconst_1        
	//  275  505:istore_3        
			else
	//* 276  506:goto            511
				flag1 = false;
	//  277  509:iconst_0        
	//  278  510:istore_3        
		if(flag1 && hasPyGenericServices() == ((DescriptorProtos$FileOptions) (obj)).hasPyGenericServices())
	//* 279  511:iload_3         
	//* 280  512:ifeq            531
	//* 281  515:aload_0         
	//* 282  516:invokevirtual   #421 <Method boolean hasPyGenericServices()>
	//* 283  519:aload_1         
	//* 284  520:invokevirtual   #421 <Method boolean hasPyGenericServices()>
	//* 285  523:icmpne          531
			flag = true;
	//  286  526:iconst_1        
	//  287  527:istore_2        
		else
	//* 288  528:goto            533
			flag = false;
	//  289  531:iconst_0        
	//  290  532:istore_2        
		flag1 = flag;
	//  291  533:iload_2         
	//  292  534:istore_3        
		if(hasPyGenericServices())
	//* 293  535:aload_0         
	//* 294  536:invokevirtual   #421 <Method boolean hasPyGenericServices()>
	//* 295  539:ifeq            564
			if(flag && getPyGenericServices() == ((DescriptorProtos$FileOptions) (obj)).getPyGenericServices())
	//* 296  542:iload_2         
	//* 297  543:ifeq            562
	//* 298  546:aload_0         
	//* 299  547:invokevirtual   #424 <Method boolean getPyGenericServices()>
	//* 300  550:aload_1         
	//* 301  551:invokevirtual   #424 <Method boolean getPyGenericServices()>
	//* 302  554:icmpne          562
				flag1 = true;
	//  303  557:iconst_1        
	//  304  558:istore_3        
			else
	//* 305  559:goto            564
				flag1 = false;
	//  306  562:iconst_0        
	//  307  563:istore_3        
		if(flag1 && hasPhpGenericServices() == ((DescriptorProtos$FileOptions) (obj)).hasPhpGenericServices())
	//* 308  564:iload_3         
	//* 309  565:ifeq            584
	//* 310  568:aload_0         
	//* 311  569:invokevirtual   #427 <Method boolean hasPhpGenericServices()>
	//* 312  572:aload_1         
	//* 313  573:invokevirtual   #427 <Method boolean hasPhpGenericServices()>
	//* 314  576:icmpne          584
			flag = true;
	//  315  579:iconst_1        
	//  316  580:istore_2        
		else
	//* 317  581:goto            586
			flag = false;
	//  318  584:iconst_0        
	//  319  585:istore_2        
		flag1 = flag;
	//  320  586:iload_2         
	//  321  587:istore_3        
		if(hasPhpGenericServices())
	//* 322  588:aload_0         
	//* 323  589:invokevirtual   #427 <Method boolean hasPhpGenericServices()>
	//* 324  592:ifeq            617
			if(flag && getPhpGenericServices() == ((DescriptorProtos$FileOptions) (obj)).getPhpGenericServices())
	//* 325  595:iload_2         
	//* 326  596:ifeq            615
	//* 327  599:aload_0         
	//* 328  600:invokevirtual   #430 <Method boolean getPhpGenericServices()>
	//* 329  603:aload_1         
	//* 330  604:invokevirtual   #430 <Method boolean getPhpGenericServices()>
	//* 331  607:icmpne          615
				flag1 = true;
	//  332  610:iconst_1        
	//  333  611:istore_3        
			else
	//* 334  612:goto            617
				flag1 = false;
	//  335  615:iconst_0        
	//  336  616:istore_3        
		if(flag1 && hasDeprecated() == ((DescriptorProtos$FileOptions) (obj)).hasDeprecated())
	//* 337  617:iload_3         
	//* 338  618:ifeq            637
	//* 339  621:aload_0         
	//* 340  622:invokevirtual   #433 <Method boolean hasDeprecated()>
	//* 341  625:aload_1         
	//* 342  626:invokevirtual   #433 <Method boolean hasDeprecated()>
	//* 343  629:icmpne          637
			flag = true;
	//  344  632:iconst_1        
	//  345  633:istore_2        
		else
	//* 346  634:goto            639
			flag = false;
	//  347  637:iconst_0        
	//  348  638:istore_2        
		flag1 = flag;
	//  349  639:iload_2         
	//  350  640:istore_3        
		if(hasDeprecated())
	//* 351  641:aload_0         
	//* 352  642:invokevirtual   #433 <Method boolean hasDeprecated()>
	//* 353  645:ifeq            670
			if(flag && getDeprecated() == ((DescriptorProtos$FileOptions) (obj)).getDeprecated())
	//* 354  648:iload_2         
	//* 355  649:ifeq            668
	//* 356  652:aload_0         
	//* 357  653:invokevirtual   #436 <Method boolean getDeprecated()>
	//* 358  656:aload_1         
	//* 359  657:invokevirtual   #436 <Method boolean getDeprecated()>
	//* 360  660:icmpne          668
				flag1 = true;
	//  361  663:iconst_1        
	//  362  664:istore_3        
			else
	//* 363  665:goto            670
				flag1 = false;
	//  364  668:iconst_0        
	//  365  669:istore_3        
		if(flag1 && hasCcEnableArenas() == ((DescriptorProtos$FileOptions) (obj)).hasCcEnableArenas())
	//* 366  670:iload_3         
	//* 367  671:ifeq            690
	//* 368  674:aload_0         
	//* 369  675:invokevirtual   #439 <Method boolean hasCcEnableArenas()>
	//* 370  678:aload_1         
	//* 371  679:invokevirtual   #439 <Method boolean hasCcEnableArenas()>
	//* 372  682:icmpne          690
			flag = true;
	//  373  685:iconst_1        
	//  374  686:istore_2        
		else
	//* 375  687:goto            692
			flag = false;
	//  376  690:iconst_0        
	//  377  691:istore_2        
		flag1 = flag;
	//  378  692:iload_2         
	//  379  693:istore_3        
		if(hasCcEnableArenas())
	//* 380  694:aload_0         
	//* 381  695:invokevirtual   #439 <Method boolean hasCcEnableArenas()>
	//* 382  698:ifeq            723
			if(flag && getCcEnableArenas() == ((DescriptorProtos$FileOptions) (obj)).getCcEnableArenas())
	//* 383  701:iload_2         
	//* 384  702:ifeq            721
	//* 385  705:aload_0         
	//* 386  706:invokevirtual   #442 <Method boolean getCcEnableArenas()>
	//* 387  709:aload_1         
	//* 388  710:invokevirtual   #442 <Method boolean getCcEnableArenas()>
	//* 389  713:icmpne          721
				flag1 = true;
	//  390  716:iconst_1        
	//  391  717:istore_3        
			else
	//* 392  718:goto            723
				flag1 = false;
	//  393  721:iconst_0        
	//  394  722:istore_3        
		if(flag1 && hasObjcClassPrefix() == ((DescriptorProtos$FileOptions) (obj)).hasObjcClassPrefix())
	//* 395  723:iload_3         
	//* 396  724:ifeq            743
	//* 397  727:aload_0         
	//* 398  728:invokevirtual   #445 <Method boolean hasObjcClassPrefix()>
	//* 399  731:aload_1         
	//* 400  732:invokevirtual   #445 <Method boolean hasObjcClassPrefix()>
	//* 401  735:icmpne          743
			flag = true;
	//  402  738:iconst_1        
	//  403  739:istore_2        
		else
	//* 404  740:goto            745
			flag = false;
	//  405  743:iconst_0        
	//  406  744:istore_2        
		flag1 = flag;
	//  407  745:iload_2         
	//  408  746:istore_3        
		if(hasObjcClassPrefix())
	//* 409  747:aload_0         
	//* 410  748:invokevirtual   #445 <Method boolean hasObjcClassPrefix()>
	//* 411  751:ifeq            779
			if(flag && getObjcClassPrefix().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getObjcClassPrefix()))))
	//* 412  754:iload_2         
	//* 413  755:ifeq            777
	//* 414  758:aload_0         
	//* 415  759:invokevirtual   #448 <Method String getObjcClassPrefix()>
	//* 416  762:aload_1         
	//* 417  763:invokevirtual   #448 <Method String getObjcClassPrefix()>
	//* 418  766:invokevirtual   #373 <Method boolean String.equals(Object)>
	//* 419  769:ifeq            777
				flag1 = true;
	//  420  772:iconst_1        
	//  421  773:istore_3        
			else
	//* 422  774:goto            779
				flag1 = false;
	//  423  777:iconst_0        
	//  424  778:istore_3        
		if(flag1 && hasCsharpNamespace() == ((DescriptorProtos$FileOptions) (obj)).hasCsharpNamespace())
	//* 425  779:iload_3         
	//* 426  780:ifeq            799
	//* 427  783:aload_0         
	//* 428  784:invokevirtual   #451 <Method boolean hasCsharpNamespace()>
	//* 429  787:aload_1         
	//* 430  788:invokevirtual   #451 <Method boolean hasCsharpNamespace()>
	//* 431  791:icmpne          799
			flag = true;
	//  432  794:iconst_1        
	//  433  795:istore_2        
		else
	//* 434  796:goto            801
			flag = false;
	//  435  799:iconst_0        
	//  436  800:istore_2        
		flag1 = flag;
	//  437  801:iload_2         
	//  438  802:istore_3        
		if(hasCsharpNamespace())
	//* 439  803:aload_0         
	//* 440  804:invokevirtual   #451 <Method boolean hasCsharpNamespace()>
	//* 441  807:ifeq            835
			if(flag && getCsharpNamespace().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getCsharpNamespace()))))
	//* 442  810:iload_2         
	//* 443  811:ifeq            833
	//* 444  814:aload_0         
	//* 445  815:invokevirtual   #454 <Method String getCsharpNamespace()>
	//* 446  818:aload_1         
	//* 447  819:invokevirtual   #454 <Method String getCsharpNamespace()>
	//* 448  822:invokevirtual   #373 <Method boolean String.equals(Object)>
	//* 449  825:ifeq            833
				flag1 = true;
	//  450  828:iconst_1        
	//  451  829:istore_3        
			else
	//* 452  830:goto            835
				flag1 = false;
	//  453  833:iconst_0        
	//  454  834:istore_3        
		if(flag1 && hasSwiftPrefix() == ((DescriptorProtos$FileOptions) (obj)).hasSwiftPrefix())
	//* 455  835:iload_3         
	//* 456  836:ifeq            855
	//* 457  839:aload_0         
	//* 458  840:invokevirtual   #457 <Method boolean hasSwiftPrefix()>
	//* 459  843:aload_1         
	//* 460  844:invokevirtual   #457 <Method boolean hasSwiftPrefix()>
	//* 461  847:icmpne          855
			flag = true;
	//  462  850:iconst_1        
	//  463  851:istore_2        
		else
	//* 464  852:goto            857
			flag = false;
	//  465  855:iconst_0        
	//  466  856:istore_2        
		flag1 = flag;
	//  467  857:iload_2         
	//  468  858:istore_3        
		if(hasSwiftPrefix())
	//* 469  859:aload_0         
	//* 470  860:invokevirtual   #457 <Method boolean hasSwiftPrefix()>
	//* 471  863:ifeq            891
			if(flag && getSwiftPrefix().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getSwiftPrefix()))))
	//* 472  866:iload_2         
	//* 473  867:ifeq            889
	//* 474  870:aload_0         
	//* 475  871:invokevirtual   #460 <Method String getSwiftPrefix()>
	//* 476  874:aload_1         
	//* 477  875:invokevirtual   #460 <Method String getSwiftPrefix()>
	//* 478  878:invokevirtual   #373 <Method boolean String.equals(Object)>
	//* 479  881:ifeq            889
				flag1 = true;
	//  480  884:iconst_1        
	//  481  885:istore_3        
			else
	//* 482  886:goto            891
				flag1 = false;
	//  483  889:iconst_0        
	//  484  890:istore_3        
		if(flag1 && hasPhpClassPrefix() == ((DescriptorProtos$FileOptions) (obj)).hasPhpClassPrefix())
	//* 485  891:iload_3         
	//* 486  892:ifeq            911
	//* 487  895:aload_0         
	//* 488  896:invokevirtual   #463 <Method boolean hasPhpClassPrefix()>
	//* 489  899:aload_1         
	//* 490  900:invokevirtual   #463 <Method boolean hasPhpClassPrefix()>
	//* 491  903:icmpne          911
			flag = true;
	//  492  906:iconst_1        
	//  493  907:istore_2        
		else
	//* 494  908:goto            913
			flag = false;
	//  495  911:iconst_0        
	//  496  912:istore_2        
		flag1 = flag;
	//  497  913:iload_2         
	//  498  914:istore_3        
		if(hasPhpClassPrefix())
	//* 499  915:aload_0         
	//* 500  916:invokevirtual   #463 <Method boolean hasPhpClassPrefix()>
	//* 501  919:ifeq            947
			if(flag && getPhpClassPrefix().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getPhpClassPrefix()))))
	//* 502  922:iload_2         
	//* 503  923:ifeq            945
	//* 504  926:aload_0         
	//* 505  927:invokevirtual   #466 <Method String getPhpClassPrefix()>
	//* 506  930:aload_1         
	//* 507  931:invokevirtual   #466 <Method String getPhpClassPrefix()>
	//* 508  934:invokevirtual   #373 <Method boolean String.equals(Object)>
	//* 509  937:ifeq            945
				flag1 = true;
	//  510  940:iconst_1        
	//  511  941:istore_3        
			else
	//* 512  942:goto            947
				flag1 = false;
	//  513  945:iconst_0        
	//  514  946:istore_3        
		if(flag1 && hasPhpNamespace() == ((DescriptorProtos$FileOptions) (obj)).hasPhpNamespace())
	//* 515  947:iload_3         
	//* 516  948:ifeq            967
	//* 517  951:aload_0         
	//* 518  952:invokevirtual   #469 <Method boolean hasPhpNamespace()>
	//* 519  955:aload_1         
	//* 520  956:invokevirtual   #469 <Method boolean hasPhpNamespace()>
	//* 521  959:icmpne          967
			flag = true;
	//  522  962:iconst_1        
	//  523  963:istore_2        
		else
	//* 524  964:goto            969
			flag = false;
	//  525  967:iconst_0        
	//  526  968:istore_2        
		flag1 = flag;
	//  527  969:iload_2         
	//  528  970:istore_3        
		if(hasPhpNamespace())
	//* 529  971:aload_0         
	//* 530  972:invokevirtual   #469 <Method boolean hasPhpNamespace()>
	//* 531  975:ifeq            1003
			if(flag && getPhpNamespace().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getPhpNamespace()))))
	//* 532  978:iload_2         
	//* 533  979:ifeq            1001
	//* 534  982:aload_0         
	//* 535  983:invokevirtual   #472 <Method String getPhpNamespace()>
	//* 536  986:aload_1         
	//* 537  987:invokevirtual   #472 <Method String getPhpNamespace()>
	//* 538  990:invokevirtual   #373 <Method boolean String.equals(Object)>
	//* 539  993:ifeq            1001
				flag1 = true;
	//  540  996:iconst_1        
	//  541  997:istore_3        
			else
	//* 542  998:goto            1003
				flag1 = false;
	//  543 1001:iconst_0        
	//  544 1002:istore_3        
		if(flag1 && getUninterpretedOptionList().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getUninterpretedOptionList()))))
	//* 545 1003:iload_3         
	//* 546 1004:ifeq            1028
	//* 547 1007:aload_0         
	//* 548 1008:invokevirtual   #475 <Method List getUninterpretedOptionList()>
	//* 549 1011:aload_1         
	//* 550 1012:invokevirtual   #475 <Method List getUninterpretedOptionList()>
	//* 551 1015:invokeinterface #476 <Method boolean List.equals(Object)>
	//* 552 1020:ifeq            1028
			flag = true;
	//  553 1023:iconst_1        
	//  554 1024:istore_2        
		else
	//* 555 1025:goto            1030
			flag = false;
	//  556 1028:iconst_0        
	//  557 1029:istore_2        
		if(flag && unknownFields.equals(((Object) (((DescriptorProtos$FileOptions) (obj)).unknownFields))))
	//* 558 1030:iload_2         
	//* 559 1031:ifeq            1053
	//* 560 1034:aload_0         
	//* 561 1035:getfield        #234 <Field UnknownFieldSet unknownFields>
	//* 562 1038:aload_1         
	//* 563 1039:getfield        #234 <Field UnknownFieldSet unknownFields>
	//* 564 1042:invokevirtual   #477 <Method boolean UnknownFieldSet.equals(Object)>
	//* 565 1045:ifeq            1053
			flag = true;
	//  566 1048:iconst_1        
	//  567 1049:istore_2        
		else
	//* 568 1050:goto            1055
			flag = false;
	//  569 1053:iconst_0        
	//  570 1054:istore_2        
		return flag && getExtensionFields().equals(((Object) (((DescriptorProtos$FileOptions) (obj)).getExtensionFields())));
	//  571 1055:iload_2         
	//  572 1056:ifeq            1077
	//  573 1059:aload_0         
	//  574 1060:invokevirtual   #481 <Method Map getExtensionFields()>
	//  575 1063:aload_1         
	//  576 1064:invokevirtual   #481 <Method Map getExtensionFields()>
	//  577 1067:invokeinterface #484 <Method boolean Map.equals(Object)>
	//  578 1072:ifeq            1077
	//  579 1075:iconst_1        
	//  580 1076:ireturn         
	//  581 1077:iconst_0        
	//  582 1078:ireturn         
	}

	public boolean getCcEnableArenas()
	{
		return ccEnableArenas_;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field boolean ccEnableArenas_>
	//    2    4:ireturn         
	}

	public boolean getCcGenericServices()
	{
		return ccGenericServices_;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean ccGenericServices_>
	//    2    4:ireturn         
	}

	public String getCsharpNamespace()
	{
		Object obj = csharpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field Object csharpNamespace_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #486 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #489 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #492 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			csharpNamespace_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #141 <Field Object csharpNamespace_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getCsharpNamespaceBytes()
	{
		Object obj = csharpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field Object csharpNamespace_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:invokestatic    #497 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			csharpNamespace_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #141 <Field Object csharpNamespace_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #486 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos$FileOptions getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #102 <Field DescriptorProtos$FileOptions DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #501 <Method DescriptorProtos$FileOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #501 <Method DescriptorProtos$FileOptions getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getDeprecated()
	{
		return deprecated_;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field boolean deprecated_>
	//    2    4:ireturn         
	}

	public String getGoPackage()
	{
		Object obj = goPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Object goPackage_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #486 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #489 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #492 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			goPackage_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #125 <Field Object goPackage_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getGoPackageBytes()
	{
		Object obj = goPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Object goPackage_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:invokestatic    #497 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			goPackage_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #125 <Field Object goPackage_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #486 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean getJavaGenerateEqualsAndHash()
	{
		return javaGenerateEqualsAndHash_;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field boolean javaGenerateEqualsAndHash_>
	//    2    4:ireturn         
	}

	public boolean getJavaGenericServices()
	{
		return javaGenericServices_;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field boolean javaGenericServices_>
	//    2    4:ireturn         
	}

	public boolean getJavaMultipleFiles()
	{
		return javaMultipleFiles_;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field boolean javaMultipleFiles_>
	//    2    4:ireturn         
	}

	public String getJavaOuterClassname()
	{
		Object obj = javaOuterClassname_;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Object javaOuterClassname_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #486 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #489 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #492 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			javaOuterClassname_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #115 <Field Object javaOuterClassname_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getJavaOuterClassnameBytes()
	{
		Object obj = javaOuterClassname_;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Object javaOuterClassname_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:invokestatic    #497 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			javaOuterClassname_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #115 <Field Object javaOuterClassname_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #486 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public String getJavaPackage()
	{
		Object obj = javaPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object javaPackage_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #486 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #489 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #492 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			javaPackage_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #113 <Field Object javaPackage_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getJavaPackageBytes()
	{
		Object obj = javaPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object javaPackage_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:invokestatic    #497 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			javaPackage_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #113 <Field Object javaPackage_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #486 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean getJavaStringCheckUtf8()
	{
		return javaStringCheckUtf8_;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field boolean javaStringCheckUtf8_>
	//    2    4:ireturn         
	}

	public String getObjcClassPrefix()
	{
		Object obj = objcClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field Object objcClassPrefix_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #486 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #489 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #492 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			objcClassPrefix_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #139 <Field Object objcClassPrefix_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getObjcClassPrefixBytes()
	{
		Object obj = objcClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field Object objcClassPrefix_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:invokestatic    #497 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			objcClassPrefix_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #139 <Field Object objcClassPrefix_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #486 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public OptimizeMode getOptimizeFor()
	{
		OptimizeMode optimizemode = OptimizeMode.valueOf(optimizeFor_);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int optimizeFor_>
	//    2    4:invokestatic    #192 <Method DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions$OptimizeMode.valueOf(int)>
	//    3    7:astore_1        
		if(optimizemode == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return OptimizeMode.SPEED;
	//    6   12:getstatic       #513 <Field DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions$OptimizeMode.SPEED>
	//    7   15:areturn         
		else
			return optimizemode;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #105 <Field Parser PARSER>
	//    1    3:areturn         
	}

	public String getPhpClassPrefix()
	{
		Object obj = phpClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Object phpClassPrefix_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #486 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #489 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #492 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			phpClassPrefix_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #145 <Field Object phpClassPrefix_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getPhpClassPrefixBytes()
	{
		Object obj = phpClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Object phpClassPrefix_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:invokestatic    #497 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			phpClassPrefix_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #145 <Field Object phpClassPrefix_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #486 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean getPhpGenericServices()
	{
		return phpGenericServices_;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field boolean phpGenericServices_>
	//    2    4:ireturn         
	}

	public String getPhpNamespace()
	{
		Object obj = phpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field Object phpNamespace_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #486 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #489 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #492 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			phpNamespace_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #147 <Field Object phpNamespace_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getPhpNamespaceBytes()
	{
		Object obj = phpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field Object phpNamespace_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:invokestatic    #497 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			phpNamespace_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #147 <Field Object phpNamespace_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #486 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean getPyGenericServices()
	{
		return pyGenericServices_;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field boolean pyGenericServices_>
	//    2    4:ireturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field int memoizedSize>
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
	//*  11   15:getfield        #185 <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			j = GeneratedMessageV3.computeStringSize(1, javaPackage_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #113 <Field Object javaPackage_>
	//   19   29:invokestatic    #524 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_2        
		i = j;
	//   23   35:iload_2         
	//   24   36:istore_1        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #185 <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          59
			i = j + GeneratedMessageV3.computeStringSize(8, javaOuterClassname_);
	//   31   47:iload_2         
	//   32   48:bipush          8
	//   33   50:aload_0         
	//   34   51:getfield        #115 <Field Object javaOuterClassname_>
	//   35   54:invokestatic    #524 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   36   57:iadd            
	//   37   58:istore_1        
		j = i;
	//   38   59:iload_1         
	//   39   60:istore_2        
		if((bitField0_ & 0x20) == 32)
	//*  40   61:aload_0         
	//*  41   62:getfield        #185 <Field int bitField0_>
	//*  42   65:bipush          32
	//*  43   67:iand            
	//*  44   68:bipush          32
	//*  45   70:icmpne          85
			j = i + CodedOutputStream.computeEnumSize(9, optimizeFor_);
	//   46   73:iload_1         
	//   47   74:bipush          9
	//   48   76:aload_0         
	//   49   77:getfield        #123 <Field int optimizeFor_>
	//   50   80:invokestatic    #530 <Method int CodedOutputStream.computeEnumSize(int, int)>
	//   51   83:iadd            
	//   52   84:istore_2        
		i = j;
	//   53   85:iload_2         
	//   54   86:istore_1        
		if((bitField0_ & 4) == 4)
	//*  55   87:aload_0         
	//*  56   88:getfield        #185 <Field int bitField0_>
	//*  57   91:iconst_4        
	//*  58   92:iand            
	//*  59   93:iconst_4        
	//*  60   94:icmpne          109
			i = j + CodedOutputStream.computeBoolSize(10, javaMultipleFiles_);
	//   61   97:iload_2         
	//   62   98:bipush          10
	//   63  100:aload_0         
	//   64  101:getfield        #117 <Field boolean javaMultipleFiles_>
	//   65  104:invokestatic    #534 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   66  107:iadd            
	//   67  108:istore_1        
		j = i;
	//   68  109:iload_1         
	//   69  110:istore_2        
		if((bitField0_ & 0x40) == 64)
	//*  70  111:aload_0         
	//*  71  112:getfield        #185 <Field int bitField0_>
	//*  72  115:bipush          64
	//*  73  117:iand            
	//*  74  118:bipush          64
	//*  75  120:icmpne          135
			j = i + GeneratedMessageV3.computeStringSize(11, goPackage_);
	//   76  123:iload_1         
	//   77  124:bipush          11
	//   78  126:aload_0         
	//   79  127:getfield        #125 <Field Object goPackage_>
	//   80  130:invokestatic    #524 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   81  133:iadd            
	//   82  134:istore_2        
		i = j;
	//   83  135:iload_2         
	//   84  136:istore_1        
		if((bitField0_ & 0x80) == 128)
	//*  85  137:aload_0         
	//*  86  138:getfield        #185 <Field int bitField0_>
	//*  87  141:sipush          128
	//*  88  144:iand            
	//*  89  145:sipush          128
	//*  90  148:icmpne          163
			i = j + CodedOutputStream.computeBoolSize(16, ccGenericServices_);
	//   91  151:iload_2         
	//   92  152:bipush          16
	//   93  154:aload_0         
	//   94  155:getfield        #127 <Field boolean ccGenericServices_>
	//   95  158:invokestatic    #534 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   96  161:iadd            
	//   97  162:istore_1        
		j = i;
	//   98  163:iload_1         
	//   99  164:istore_2        
		if((bitField0_ & 0x100) == 256)
	//* 100  165:aload_0         
	//* 101  166:getfield        #185 <Field int bitField0_>
	//* 102  169:sipush          256
	//* 103  172:iand            
	//* 104  173:sipush          256
	//* 105  176:icmpne          191
			j = i + CodedOutputStream.computeBoolSize(17, javaGenericServices_);
	//  106  179:iload_1         
	//  107  180:bipush          17
	//  108  182:aload_0         
	//  109  183:getfield        #129 <Field boolean javaGenericServices_>
	//  110  186:invokestatic    #534 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//  111  189:iadd            
	//  112  190:istore_2        
		i = j;
	//  113  191:iload_2         
	//  114  192:istore_1        
		if((bitField0_ & 0x200) == 512)
	//* 115  193:aload_0         
	//* 116  194:getfield        #185 <Field int bitField0_>
	//* 117  197:sipush          512
	//* 118  200:iand            
	//* 119  201:sipush          512
	//* 120  204:icmpne          219
			i = j + CodedOutputStream.computeBoolSize(18, pyGenericServices_);
	//  121  207:iload_2         
	//  122  208:bipush          18
	//  123  210:aload_0         
	//  124  211:getfield        #131 <Field boolean pyGenericServices_>
	//  125  214:invokestatic    #534 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//  126  217:iadd            
	//  127  218:istore_1        
		j = i;
	//  128  219:iload_1         
	//  129  220:istore_2        
		if((bitField0_ & 8) == 8)
	//* 130  221:aload_0         
	//* 131  222:getfield        #185 <Field int bitField0_>
	//* 132  225:bipush          8
	//* 133  227:iand            
	//* 134  228:bipush          8
	//* 135  230:icmpne          245
			j = i + CodedOutputStream.computeBoolSize(20, javaGenerateEqualsAndHash_);
	//  136  233:iload_1         
	//  137  234:bipush          20
	//  138  236:aload_0         
	//  139  237:getfield        #119 <Field boolean javaGenerateEqualsAndHash_>
	//  140  240:invokestatic    #534 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//  141  243:iadd            
	//  142  244:istore_2        
		i = j;
	//  143  245:iload_2         
	//  144  246:istore_1        
		if((bitField0_ & 0x800) == 2048)
	//* 145  247:aload_0         
	//* 146  248:getfield        #185 <Field int bitField0_>
	//* 147  251:sipush          2048
	//* 148  254:iand            
	//* 149  255:sipush          2048
	//* 150  258:icmpne          273
			i = j + CodedOutputStream.computeBoolSize(23, deprecated_);
	//  151  261:iload_2         
	//  152  262:bipush          23
	//  153  264:aload_0         
	//  154  265:getfield        #135 <Field boolean deprecated_>
	//  155  268:invokestatic    #534 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//  156  271:iadd            
	//  157  272:istore_1        
		j = i;
	//  158  273:iload_1         
	//  159  274:istore_2        
		if((bitField0_ & 0x10) == 16)
	//* 160  275:aload_0         
	//* 161  276:getfield        #185 <Field int bitField0_>
	//* 162  279:bipush          16
	//* 163  281:iand            
	//* 164  282:bipush          16
	//* 165  284:icmpne          299
			j = i + CodedOutputStream.computeBoolSize(27, javaStringCheckUtf8_);
	//  166  287:iload_1         
	//  167  288:bipush          27
	//  168  290:aload_0         
	//  169  291:getfield        #121 <Field boolean javaStringCheckUtf8_>
	//  170  294:invokestatic    #534 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//  171  297:iadd            
	//  172  298:istore_2        
		i = j;
	//  173  299:iload_2         
	//  174  300:istore_1        
		if((bitField0_ & 0x1000) == 4096)
	//* 175  301:aload_0         
	//* 176  302:getfield        #185 <Field int bitField0_>
	//* 177  305:sipush          4096
	//* 178  308:iand            
	//* 179  309:sipush          4096
	//* 180  312:icmpne          327
			i = j + CodedOutputStream.computeBoolSize(31, ccEnableArenas_);
	//  181  315:iload_2         
	//  182  316:bipush          31
	//  183  318:aload_0         
	//  184  319:getfield        #137 <Field boolean ccEnableArenas_>
	//  185  322:invokestatic    #534 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//  186  325:iadd            
	//  187  326:istore_1        
		j = i;
	//  188  327:iload_1         
	//  189  328:istore_2        
		if((bitField0_ & 0x2000) == 8192)
	//* 190  329:aload_0         
	//* 191  330:getfield        #185 <Field int bitField0_>
	//* 192  333:sipush          8192
	//* 193  336:iand            
	//* 194  337:sipush          8192
	//* 195  340:icmpne          355
			j = i + GeneratedMessageV3.computeStringSize(36, objcClassPrefix_);
	//  196  343:iload_1         
	//  197  344:bipush          36
	//  198  346:aload_0         
	//  199  347:getfield        #139 <Field Object objcClassPrefix_>
	//  200  350:invokestatic    #524 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//  201  353:iadd            
	//  202  354:istore_2        
		i = j;
	//  203  355:iload_2         
	//  204  356:istore_1        
		if((bitField0_ & 0x4000) == 16384)
	//* 205  357:aload_0         
	//* 206  358:getfield        #185 <Field int bitField0_>
	//* 207  361:sipush          16384
	//* 208  364:iand            
	//* 209  365:sipush          16384
	//* 210  368:icmpne          383
			i = j + GeneratedMessageV3.computeStringSize(37, csharpNamespace_);
	//  211  371:iload_2         
	//  212  372:bipush          37
	//  213  374:aload_0         
	//  214  375:getfield        #141 <Field Object csharpNamespace_>
	//  215  378:invokestatic    #524 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//  216  381:iadd            
	//  217  382:istore_1        
		j = i;
	//  218  383:iload_1         
	//  219  384:istore_2        
		if((bitField0_ & 0x8000) == 32768)
	//* 220  385:aload_0         
	//* 221  386:getfield        #185 <Field int bitField0_>
	//* 222  389:ldc1            #203 <Int 32768>
	//* 223  391:iand            
	//* 224  392:ldc1            #203 <Int 32768>
	//* 225  394:icmpne          409
			j = i + GeneratedMessageV3.computeStringSize(39, swiftPrefix_);
	//  226  397:iload_1         
	//  227  398:bipush          39
	//  228  400:aload_0         
	//  229  401:getfield        #143 <Field Object swiftPrefix_>
	//  230  404:invokestatic    #524 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//  231  407:iadd            
	//  232  408:istore_2        
		i = j;
	//  233  409:iload_2         
	//  234  410:istore_1        
		if((bitField0_ & 0x10000) == 0x10000)
	//* 235  411:aload_0         
	//* 236  412:getfield        #185 <Field int bitField0_>
	//* 237  415:ldc1            #204 <Int 0x10000>
	//* 238  417:iand            
	//* 239  418:ldc1            #204 <Int 0x10000>
	//* 240  420:icmpne          435
			i = j + GeneratedMessageV3.computeStringSize(40, phpClassPrefix_);
	//  241  423:iload_2         
	//  242  424:bipush          40
	//  243  426:aload_0         
	//  244  427:getfield        #145 <Field Object phpClassPrefix_>
	//  245  430:invokestatic    #524 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//  246  433:iadd            
	//  247  434:istore_1        
		j = i;
	//  248  435:iload_1         
	//  249  436:istore_2        
		if((bitField0_ & 0x20000) == 0x20000)
	//* 250  437:aload_0         
	//* 251  438:getfield        #185 <Field int bitField0_>
	//* 252  441:ldc1            #205 <Int 0x20000>
	//* 253  443:iand            
	//* 254  444:ldc1            #205 <Int 0x20000>
	//* 255  446:icmpne          461
			j = i + GeneratedMessageV3.computeStringSize(41, phpNamespace_);
	//  256  449:iload_1         
	//  257  450:bipush          41
	//  258  452:aload_0         
	//  259  453:getfield        #147 <Field Object phpNamespace_>
	//  260  456:invokestatic    #524 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//  261  459:iadd            
	//  262  460:istore_2        
		i = j;
	//  263  461:iload_2         
	//  264  462:istore_1        
		if((bitField0_ & 0x400) == 1024)
	//* 265  463:aload_0         
	//* 266  464:getfield        #185 <Field int bitField0_>
	//* 267  467:sipush          1024
	//* 268  470:iand            
	//* 269  471:sipush          1024
	//* 270  474:icmpne          489
			i = j + CodedOutputStream.computeBoolSize(42, phpGenericServices_);
	//  271  477:iload_2         
	//  272  478:bipush          42
	//  273  480:aload_0         
	//  274  481:getfield        #133 <Field boolean phpGenericServices_>
	//  275  484:invokestatic    #534 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//  276  487:iadd            
	//  277  488:istore_1        
		for(int k = 0; k < uninterpretedOption_.size(); k++)
	//* 278  489:iconst_0        
	//* 279  490:istore_2        
	//* 280  491:iload_2         
	//* 281  492:aload_0         
	//* 282  493:getfield        #155 <Field List uninterpretedOption_>
	//* 283  496:invokeinterface #537 <Method int List.size()>
	//* 284  501:icmpge          533
			i += CodedOutputStream.computeMessageSize(999, (MessageLite)uninterpretedOption_.get(k));
	//  285  504:iload_1         
	//  286  505:sipush          999
	//  287  508:aload_0         
	//  288  509:getfield        #155 <Field List uninterpretedOption_>
	//  289  512:iload_2         
	//  290  513:invokeinterface #541 <Method Object List.get(int)>
	//  291  518:checkcast       #543 <Class MessageLite>
	//  292  521:invokestatic    #547 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  293  524:iadd            
	//  294  525:istore_1        

	//  295  526:iload_2         
	//  296  527:iconst_1        
	//  297  528:iadd            
	//  298  529:istore_2        
	//* 299  530:goto            491
		i = i + extensionsSerializedSize() + unknownFields.getSerializedSize();
	//  300  533:iload_1         
	//  301  534:aload_0         
	//  302  535:invokevirtual   #550 <Method int extensionsSerializedSize()>
	//  303  538:iadd            
	//  304  539:aload_0         
	//  305  540:getfield        #234 <Field UnknownFieldSet unknownFields>
	//  306  543:invokevirtual   #552 <Method int UnknownFieldSet.getSerializedSize()>
	//  307  546:iadd            
	//  308  547:istore_1        
		memoizedSize = i;
	//  309  548:aload_0         
	//  310  549:iload_1         
	//  311  550:putfield        #520 <Field int memoizedSize>
		return i;
	//  312  553:iload_1         
	//  313  554:ireturn         
	}

	public String getSwiftPrefix()
	{
		Object obj = swiftPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Object swiftPrefix_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #486 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #489 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #492 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			swiftPrefix_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #143 <Field Object swiftPrefix_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getSwiftPrefixBytes()
	{
		Object obj = swiftPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Object swiftPrefix_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #372 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #372 <Class String>
	//    8   16:invokestatic    #497 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			swiftPrefix_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #143 <Field Object swiftPrefix_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #486 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public dOption getUninterpretedOption(int i)
	{
		return (dOption)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #541 <Method Object List.get(int)>
	//    4   10:checkcast       #211 <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public int getUninterpretedOptionCount()
	{
		return uninterpretedOption_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field List uninterpretedOption_>
	//    2    4:invokeinterface #537 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getUninterpretedOptionList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public dOptionOrBuilder getUninterpretedOptionOrBuilder(int i)
	{
		return (dOptionOrBuilder)uninterpretedOption_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field List uninterpretedOption_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #541 <Method Object List.get(int)>
	//    4   10:checkcast       #561 <Class DescriptorProtos$UninterpretedOptionOrBuilder>
	//    5   13:areturn         
	}

	public List getUninterpretedOptionOrBuilderList()
	{
		return uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasCcEnableArenas()
	{
		return (bitField0_ & 0x1000) == 4096;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:sipush          4096
	//    3    7:iand            
	//    4    8:sipush          4096
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasCcGenericServices()
	{
		return (bitField0_ & 0x80) == 128;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:sipush          128
	//    3    7:iand            
	//    4    8:sipush          128
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasCsharpNamespace()
	{
		return (bitField0_ & 0x4000) == 16384;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:sipush          16384
	//    3    7:iand            
	//    4    8:sipush          16384
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasDeprecated()
	{
		return (bitField0_ & 0x800) == 2048;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:sipush          2048
	//    3    7:iand            
	//    4    8:sipush          2048
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasGoPackage()
	{
		return (bitField0_ & 0x40) == 64;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:bipush          64
	//    3    6:iand            
	//    4    7:bipush          64
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasJavaGenerateEqualsAndHash()
	{
		return (bitField0_ & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasJavaGenericServices()
	{
		return (bitField0_ & 0x100) == 256;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:sipush          256
	//    3    7:iand            
	//    4    8:sipush          256
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasJavaMultipleFiles()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasJavaOuterClassname()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasJavaPackage()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasJavaStringCheckUtf8()
	{
		return (bitField0_ & 0x10) == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:bipush          16
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasObjcClassPrefix()
	{
		return (bitField0_ & 0x2000) == 8192;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:sipush          8192
	//    3    7:iand            
	//    4    8:sipush          8192
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasOptimizeFor()
	{
		return (bitField0_ & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasPhpClassPrefix()
	{
		return (bitField0_ & 0x10000) == 0x10000;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:ldc1            #204 <Int 0x10000>
	//    3    6:iand            
	//    4    7:ldc1            #204 <Int 0x10000>
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasPhpGenericServices()
	{
		return (bitField0_ & 0x400) == 1024;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:sipush          1024
	//    3    7:iand            
	//    4    8:sipush          1024
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasPhpNamespace()
	{
		return (bitField0_ & 0x20000) == 0x20000;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:ldc1            #205 <Int 0x20000>
	//    3    6:iand            
	//    4    7:ldc1            #205 <Int 0x20000>
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasPyGenericServices()
	{
		return (bitField0_ & 0x200) == 512;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:sipush          512
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasSwiftPrefix()
	{
		return (bitField0_ & 0x8000) == 32768;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int bitField0_>
	//    2    4:ldc1            #203 <Int 32768>
	//    3    6:iand            
	//    4    7:ldc1            #203 <Int 32768>
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
	//*   1    1:getfield        #568 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #568 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #570 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #574 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasJavaPackage())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #366 <Method boolean hasJavaPackage()>
	//*  15   29:ifeq            50
			i = (j * 37 + 1) * 53 + getJavaPackage().hashCode();
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #370 <Method String getJavaPackage()>
	//   25   45:invokevirtual   #575 <Method int String.hashCode()>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(hasJavaOuterClassname())
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #376 <Method boolean hasJavaOuterClassname()>
	//*  32   56:ifeq            78
			j = (i * 37 + 8) * 53 + getJavaOuterClassname().hashCode();
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:bipush          8
	//   37   65:iadd            
	//   38   66:bipush          53
	//   39   68:imul            
	//   40   69:aload_0         
	//   41   70:invokevirtual   #379 <Method String getJavaOuterClassname()>
	//   42   73:invokevirtual   #575 <Method int String.hashCode()>
	//   43   76:iadd            
	//   44   77:istore_2        
		i = j;
	//   45   78:iload_2         
	//   46   79:istore_1        
		if(hasJavaMultipleFiles())
	//*  47   80:aload_0         
	//*  48   81:invokevirtual   #382 <Method boolean hasJavaMultipleFiles()>
	//*  49   84:ifeq            106
			i = (j * 37 + 10) * 53 + Internal.hashBoolean(getJavaMultipleFiles());
	//   50   87:iload_2         
	//   51   88:bipush          37
	//   52   90:imul            
	//   53   91:bipush          10
	//   54   93:iadd            
	//   55   94:bipush          53
	//   56   96:imul            
	//   57   97:aload_0         
	//   58   98:invokevirtual   #385 <Method boolean getJavaMultipleFiles()>
	//   59  101:invokestatic    #581 <Method int Internal.hashBoolean(boolean)>
	//   60  104:iadd            
	//   61  105:istore_1        
		j = i;
	//   62  106:iload_1         
	//   63  107:istore_2        
		if(hasJavaGenerateEqualsAndHash())
	//*  64  108:aload_0         
	//*  65  109:invokevirtual   #388 <Method boolean hasJavaGenerateEqualsAndHash()>
	//*  66  112:ifeq            134
			j = (i * 37 + 20) * 53 + Internal.hashBoolean(getJavaGenerateEqualsAndHash());
	//   67  115:iload_1         
	//   68  116:bipush          37
	//   69  118:imul            
	//   70  119:bipush          20
	//   71  121:iadd            
	//   72  122:bipush          53
	//   73  124:imul            
	//   74  125:aload_0         
	//   75  126:invokevirtual   #391 <Method boolean getJavaGenerateEqualsAndHash()>
	//   76  129:invokestatic    #581 <Method int Internal.hashBoolean(boolean)>
	//   77  132:iadd            
	//   78  133:istore_2        
		i = j;
	//   79  134:iload_2         
	//   80  135:istore_1        
		if(hasJavaStringCheckUtf8())
	//*  81  136:aload_0         
	//*  82  137:invokevirtual   #394 <Method boolean hasJavaStringCheckUtf8()>
	//*  83  140:ifeq            162
			i = (j * 37 + 27) * 53 + Internal.hashBoolean(getJavaStringCheckUtf8());
	//   84  143:iload_2         
	//   85  144:bipush          37
	//   86  146:imul            
	//   87  147:bipush          27
	//   88  149:iadd            
	//   89  150:bipush          53
	//   90  152:imul            
	//   91  153:aload_0         
	//   92  154:invokevirtual   #397 <Method boolean getJavaStringCheckUtf8()>
	//   93  157:invokestatic    #581 <Method int Internal.hashBoolean(boolean)>
	//   94  160:iadd            
	//   95  161:istore_1        
		j = i;
	//   96  162:iload_1         
	//   97  163:istore_2        
		if(hasOptimizeFor())
	//*  98  164:aload_0         
	//*  99  165:invokevirtual   #400 <Method boolean hasOptimizeFor()>
	//* 100  168:ifeq            187
			j = (i * 37 + 9) * 53 + optimizeFor_;
	//  101  171:iload_1         
	//  102  172:bipush          37
	//  103  174:imul            
	//  104  175:bipush          9
	//  105  177:iadd            
	//  106  178:bipush          53
	//  107  180:imul            
	//  108  181:aload_0         
	//  109  182:getfield        #123 <Field int optimizeFor_>
	//  110  185:iadd            
	//  111  186:istore_2        
		i = j;
	//  112  187:iload_2         
	//  113  188:istore_1        
		if(hasGoPackage())
	//* 114  189:aload_0         
	//* 115  190:invokevirtual   #403 <Method boolean hasGoPackage()>
	//* 116  193:ifeq            215
			i = (j * 37 + 11) * 53 + getGoPackage().hashCode();
	//  117  196:iload_2         
	//  118  197:bipush          37
	//  119  199:imul            
	//  120  200:bipush          11
	//  121  202:iadd            
	//  122  203:bipush          53
	//  123  205:imul            
	//  124  206:aload_0         
	//  125  207:invokevirtual   #406 <Method String getGoPackage()>
	//  126  210:invokevirtual   #575 <Method int String.hashCode()>
	//  127  213:iadd            
	//  128  214:istore_1        
		j = i;
	//  129  215:iload_1         
	//  130  216:istore_2        
		if(hasCcGenericServices())
	//* 131  217:aload_0         
	//* 132  218:invokevirtual   #409 <Method boolean hasCcGenericServices()>
	//* 133  221:ifeq            243
			j = (i * 37 + 16) * 53 + Internal.hashBoolean(getCcGenericServices());
	//  134  224:iload_1         
	//  135  225:bipush          37
	//  136  227:imul            
	//  137  228:bipush          16
	//  138  230:iadd            
	//  139  231:bipush          53
	//  140  233:imul            
	//  141  234:aload_0         
	//  142  235:invokevirtual   #412 <Method boolean getCcGenericServices()>
	//  143  238:invokestatic    #581 <Method int Internal.hashBoolean(boolean)>
	//  144  241:iadd            
	//  145  242:istore_2        
		i = j;
	//  146  243:iload_2         
	//  147  244:istore_1        
		if(hasJavaGenericServices())
	//* 148  245:aload_0         
	//* 149  246:invokevirtual   #415 <Method boolean hasJavaGenericServices()>
	//* 150  249:ifeq            271
			i = (j * 37 + 17) * 53 + Internal.hashBoolean(getJavaGenericServices());
	//  151  252:iload_2         
	//  152  253:bipush          37
	//  153  255:imul            
	//  154  256:bipush          17
	//  155  258:iadd            
	//  156  259:bipush          53
	//  157  261:imul            
	//  158  262:aload_0         
	//  159  263:invokevirtual   #418 <Method boolean getJavaGenericServices()>
	//  160  266:invokestatic    #581 <Method int Internal.hashBoolean(boolean)>
	//  161  269:iadd            
	//  162  270:istore_1        
		j = i;
	//  163  271:iload_1         
	//  164  272:istore_2        
		if(hasPyGenericServices())
	//* 165  273:aload_0         
	//* 166  274:invokevirtual   #421 <Method boolean hasPyGenericServices()>
	//* 167  277:ifeq            299
			j = (i * 37 + 18) * 53 + Internal.hashBoolean(getPyGenericServices());
	//  168  280:iload_1         
	//  169  281:bipush          37
	//  170  283:imul            
	//  171  284:bipush          18
	//  172  286:iadd            
	//  173  287:bipush          53
	//  174  289:imul            
	//  175  290:aload_0         
	//  176  291:invokevirtual   #424 <Method boolean getPyGenericServices()>
	//  177  294:invokestatic    #581 <Method int Internal.hashBoolean(boolean)>
	//  178  297:iadd            
	//  179  298:istore_2        
		i = j;
	//  180  299:iload_2         
	//  181  300:istore_1        
		if(hasPhpGenericServices())
	//* 182  301:aload_0         
	//* 183  302:invokevirtual   #427 <Method boolean hasPhpGenericServices()>
	//* 184  305:ifeq            327
			i = (j * 37 + 42) * 53 + Internal.hashBoolean(getPhpGenericServices());
	//  185  308:iload_2         
	//  186  309:bipush          37
	//  187  311:imul            
	//  188  312:bipush          42
	//  189  314:iadd            
	//  190  315:bipush          53
	//  191  317:imul            
	//  192  318:aload_0         
	//  193  319:invokevirtual   #430 <Method boolean getPhpGenericServices()>
	//  194  322:invokestatic    #581 <Method int Internal.hashBoolean(boolean)>
	//  195  325:iadd            
	//  196  326:istore_1        
		j = i;
	//  197  327:iload_1         
	//  198  328:istore_2        
		if(hasDeprecated())
	//* 199  329:aload_0         
	//* 200  330:invokevirtual   #433 <Method boolean hasDeprecated()>
	//* 201  333:ifeq            355
			j = (i * 37 + 23) * 53 + Internal.hashBoolean(getDeprecated());
	//  202  336:iload_1         
	//  203  337:bipush          37
	//  204  339:imul            
	//  205  340:bipush          23
	//  206  342:iadd            
	//  207  343:bipush          53
	//  208  345:imul            
	//  209  346:aload_0         
	//  210  347:invokevirtual   #436 <Method boolean getDeprecated()>
	//  211  350:invokestatic    #581 <Method int Internal.hashBoolean(boolean)>
	//  212  353:iadd            
	//  213  354:istore_2        
		i = j;
	//  214  355:iload_2         
	//  215  356:istore_1        
		if(hasCcEnableArenas())
	//* 216  357:aload_0         
	//* 217  358:invokevirtual   #439 <Method boolean hasCcEnableArenas()>
	//* 218  361:ifeq            383
			i = (j * 37 + 31) * 53 + Internal.hashBoolean(getCcEnableArenas());
	//  219  364:iload_2         
	//  220  365:bipush          37
	//  221  367:imul            
	//  222  368:bipush          31
	//  223  370:iadd            
	//  224  371:bipush          53
	//  225  373:imul            
	//  226  374:aload_0         
	//  227  375:invokevirtual   #442 <Method boolean getCcEnableArenas()>
	//  228  378:invokestatic    #581 <Method int Internal.hashBoolean(boolean)>
	//  229  381:iadd            
	//  230  382:istore_1        
		j = i;
	//  231  383:iload_1         
	//  232  384:istore_2        
		if(hasObjcClassPrefix())
	//* 233  385:aload_0         
	//* 234  386:invokevirtual   #445 <Method boolean hasObjcClassPrefix()>
	//* 235  389:ifeq            411
			j = (i * 37 + 36) * 53 + getObjcClassPrefix().hashCode();
	//  236  392:iload_1         
	//  237  393:bipush          37
	//  238  395:imul            
	//  239  396:bipush          36
	//  240  398:iadd            
	//  241  399:bipush          53
	//  242  401:imul            
	//  243  402:aload_0         
	//  244  403:invokevirtual   #448 <Method String getObjcClassPrefix()>
	//  245  406:invokevirtual   #575 <Method int String.hashCode()>
	//  246  409:iadd            
	//  247  410:istore_2        
		i = j;
	//  248  411:iload_2         
	//  249  412:istore_1        
		if(hasCsharpNamespace())
	//* 250  413:aload_0         
	//* 251  414:invokevirtual   #451 <Method boolean hasCsharpNamespace()>
	//* 252  417:ifeq            439
			i = (j * 37 + 37) * 53 + getCsharpNamespace().hashCode();
	//  253  420:iload_2         
	//  254  421:bipush          37
	//  255  423:imul            
	//  256  424:bipush          37
	//  257  426:iadd            
	//  258  427:bipush          53
	//  259  429:imul            
	//  260  430:aload_0         
	//  261  431:invokevirtual   #454 <Method String getCsharpNamespace()>
	//  262  434:invokevirtual   #575 <Method int String.hashCode()>
	//  263  437:iadd            
	//  264  438:istore_1        
		j = i;
	//  265  439:iload_1         
	//  266  440:istore_2        
		if(hasSwiftPrefix())
	//* 267  441:aload_0         
	//* 268  442:invokevirtual   #457 <Method boolean hasSwiftPrefix()>
	//* 269  445:ifeq            467
			j = (i * 37 + 39) * 53 + getSwiftPrefix().hashCode();
	//  270  448:iload_1         
	//  271  449:bipush          37
	//  272  451:imul            
	//  273  452:bipush          39
	//  274  454:iadd            
	//  275  455:bipush          53
	//  276  457:imul            
	//  277  458:aload_0         
	//  278  459:invokevirtual   #460 <Method String getSwiftPrefix()>
	//  279  462:invokevirtual   #575 <Method int String.hashCode()>
	//  280  465:iadd            
	//  281  466:istore_2        
		i = j;
	//  282  467:iload_2         
	//  283  468:istore_1        
		if(hasPhpClassPrefix())
	//* 284  469:aload_0         
	//* 285  470:invokevirtual   #463 <Method boolean hasPhpClassPrefix()>
	//* 286  473:ifeq            495
			i = (j * 37 + 40) * 53 + getPhpClassPrefix().hashCode();
	//  287  476:iload_2         
	//  288  477:bipush          37
	//  289  479:imul            
	//  290  480:bipush          40
	//  291  482:iadd            
	//  292  483:bipush          53
	//  293  485:imul            
	//  294  486:aload_0         
	//  295  487:invokevirtual   #466 <Method String getPhpClassPrefix()>
	//  296  490:invokevirtual   #575 <Method int String.hashCode()>
	//  297  493:iadd            
	//  298  494:istore_1        
		j = i;
	//  299  495:iload_1         
	//  300  496:istore_2        
		if(hasPhpNamespace())
	//* 301  497:aload_0         
	//* 302  498:invokevirtual   #469 <Method boolean hasPhpNamespace()>
	//* 303  501:ifeq            523
			j = (i * 37 + 41) * 53 + getPhpNamespace().hashCode();
	//  304  504:iload_1         
	//  305  505:bipush          37
	//  306  507:imul            
	//  307  508:bipush          41
	//  308  510:iadd            
	//  309  511:bipush          53
	//  310  513:imul            
	//  311  514:aload_0         
	//  312  515:invokevirtual   #472 <Method String getPhpNamespace()>
	//  313  518:invokevirtual   #575 <Method int String.hashCode()>
	//  314  521:iadd            
	//  315  522:istore_2        
		i = j;
	//  316  523:iload_2         
	//  317  524:istore_1        
		if(getUninterpretedOptionCount() > 0)
	//* 318  525:aload_0         
	//* 319  526:invokevirtual   #583 <Method int getUninterpretedOptionCount()>
	//* 320  529:ifle            554
			i = (j * 37 + 999) * 53 + getUninterpretedOptionList().hashCode();
	//  321  532:iload_2         
	//  322  533:bipush          37
	//  323  535:imul            
	//  324  536:sipush          999
	//  325  539:iadd            
	//  326  540:bipush          53
	//  327  542:imul            
	//  328  543:aload_0         
	//  329  544:invokevirtual   #475 <Method List getUninterpretedOptionList()>
	//  330  547:invokeinterface #584 <Method int List.hashCode()>
	//  331  552:iadd            
	//  332  553:istore_1        
		i = hashFields(i, getExtensionFields()) * 29 + unknownFields.hashCode();
	//  333  554:iload_1         
	//  334  555:aload_0         
	//  335  556:invokevirtual   #481 <Method Map getExtensionFields()>
	//  336  559:invokestatic    #588 <Method int hashFields(int, Map)>
	//  337  562:bipush          29
	//  338  564:imul            
	//  339  565:aload_0         
	//  340  566:getfield        #234 <Field UnknownFieldSet unknownFields>
	//  341  569:invokevirtual   #589 <Method int UnknownFieldSet.hashCode()>
	//  342  572:iadd            
	//  343  573:istore_1        
		memoizedHashCode = i;
	//  344  574:aload_0         
	//  345  575:iload_1         
	//  346  576:putfield        #568 <Field int memoizedHashCode>
		return i;
	//  347  579:iload_1         
	//  348  580:ireturn         
	}

	protected sorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$15000().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FileOptions, com/google/protobuf/DescriptorProtos$FileOptions$Builder);
	//    0    0:invokestatic    #594 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$15000()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$FileOptions>
	//    2    5:ldc1            #14  <Class DescriptorProtos$FileOptions$Builder>
	//    3    7:invokevirtual   #600 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field byte memoizedIsInitialized>
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
	//*  16   22:invokevirtual   #583 <Method int getUninterpretedOptionCount()>
	//*  17   25:icmpge          53
			if(!getUninterpretedOption(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #603 <Method DescriptorProtos$UninterpretedOption getUninterpretedOption(int)>
	//*  21   33:invokevirtual   #605 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #109 <Field byte memoizedIsInitialized>
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
	//*  34   54:invokevirtual   #608 <Method boolean extensionsAreInitialized()>
	//*  35   57:ifne            67
		{
			memoizedIsInitialized = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #109 <Field byte memoizedIsInitialized>
			return false;
	//   39   65:iconst_0        
	//   40   66:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   41   67:aload_0         
	//   42   68:iconst_1        
	//   43   69:putfield        #109 <Field byte memoizedIsInitialized>
			return true;
	//   44   72:iconst_1        
	//   45   73:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #611 <Method DescriptorProtos$FileOptions$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(ent ent)
	{
		return new Builder(ent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #14  <Class DescriptorProtos$FileOptions$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #615 <Method void DescriptorProtos$FileOptions$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #618 <Method DescriptorProtos$FileOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(ent ent)
	{
		return ((Message.Builder) (newBuilderForType(ent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #621 <Method DescriptorProtos$FileOptions$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #618 <Method DescriptorProtos$FileOptions$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #102 <Field DescriptorProtos$FileOptions DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #14  <Class DescriptorProtos$FileOptions$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #625 <Method void DescriptorProtos$FileOptions$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #14  <Class DescriptorProtos$FileOptions$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #625 <Method void DescriptorProtos$FileOptions$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #305 <Method DescriptorProtos$FileOptions$Builder DescriptorProtos$FileOptions$Builder.mergeFrom(DescriptorProtos$FileOptions)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method DescriptorProtos$FileOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method DescriptorProtos$FileOptions$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		Message.ExtensionWriter extensionwriter = newExtensionWriter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #631 <Method GeneratedMessageV3$ExtendableMessage$ExtensionWriter newExtensionWriter()>
	//    2    4:astore_3        
		if((bitField0_ & 1) == 1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #185 <Field int bitField0_>
	//*   5    9:iconst_1        
	//*   6   10:iand            
	//*   7   11:iconst_1        
	//*   8   12:icmpne          24
			GeneratedMessageV3.writeString(codedoutputstream, 1, javaPackage_);
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:aload_0         
	//   12   18:getfield        #113 <Field Object javaPackage_>
	//   13   21:invokestatic    #635 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 2) == 2)
	//*  14   24:aload_0         
	//*  15   25:getfield        #185 <Field int bitField0_>
	//*  16   28:iconst_2        
	//*  17   29:iand            
	//*  18   30:iconst_2        
	//*  19   31:icmpne          44
			GeneratedMessageV3.writeString(codedoutputstream, 8, javaOuterClassname_);
	//   20   34:aload_1         
	//   21   35:bipush          8
	//   22   37:aload_0         
	//   23   38:getfield        #115 <Field Object javaOuterClassname_>
	//   24   41:invokestatic    #635 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x20) == 32)
	//*  25   44:aload_0         
	//*  26   45:getfield        #185 <Field int bitField0_>
	//*  27   48:bipush          32
	//*  28   50:iand            
	//*  29   51:bipush          32
	//*  30   53:icmpne          66
			codedoutputstream.writeEnum(9, optimizeFor_);
	//   31   56:aload_1         
	//   32   57:bipush          9
	//   33   59:aload_0         
	//   34   60:getfield        #123 <Field int optimizeFor_>
	//   35   63:invokevirtual   #639 <Method void CodedOutputStream.writeEnum(int, int)>
		if((bitField0_ & 4) == 4)
	//*  36   66:aload_0         
	//*  37   67:getfield        #185 <Field int bitField0_>
	//*  38   70:iconst_4        
	//*  39   71:iand            
	//*  40   72:iconst_4        
	//*  41   73:icmpne          86
			codedoutputstream.writeBool(10, javaMultipleFiles_);
	//   42   76:aload_1         
	//   43   77:bipush          10
	//   44   79:aload_0         
	//   45   80:getfield        #117 <Field boolean javaMultipleFiles_>
	//   46   83:invokevirtual   #643 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 0x40) == 64)
	//*  47   86:aload_0         
	//*  48   87:getfield        #185 <Field int bitField0_>
	//*  49   90:bipush          64
	//*  50   92:iand            
	//*  51   93:bipush          64
	//*  52   95:icmpne          108
			GeneratedMessageV3.writeString(codedoutputstream, 11, goPackage_);
	//   53   98:aload_1         
	//   54   99:bipush          11
	//   55  101:aload_0         
	//   56  102:getfield        #125 <Field Object goPackage_>
	//   57  105:invokestatic    #635 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x80) == 128)
	//*  58  108:aload_0         
	//*  59  109:getfield        #185 <Field int bitField0_>
	//*  60  112:sipush          128
	//*  61  115:iand            
	//*  62  116:sipush          128
	//*  63  119:icmpne          132
			codedoutputstream.writeBool(16, ccGenericServices_);
	//   64  122:aload_1         
	//   65  123:bipush          16
	//   66  125:aload_0         
	//   67  126:getfield        #127 <Field boolean ccGenericServices_>
	//   68  129:invokevirtual   #643 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 0x100) == 256)
	//*  69  132:aload_0         
	//*  70  133:getfield        #185 <Field int bitField0_>
	//*  71  136:sipush          256
	//*  72  139:iand            
	//*  73  140:sipush          256
	//*  74  143:icmpne          156
			codedoutputstream.writeBool(17, javaGenericServices_);
	//   75  146:aload_1         
	//   76  147:bipush          17
	//   77  149:aload_0         
	//   78  150:getfield        #129 <Field boolean javaGenericServices_>
	//   79  153:invokevirtual   #643 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 0x200) == 512)
	//*  80  156:aload_0         
	//*  81  157:getfield        #185 <Field int bitField0_>
	//*  82  160:sipush          512
	//*  83  163:iand            
	//*  84  164:sipush          512
	//*  85  167:icmpne          180
			codedoutputstream.writeBool(18, pyGenericServices_);
	//   86  170:aload_1         
	//   87  171:bipush          18
	//   88  173:aload_0         
	//   89  174:getfield        #131 <Field boolean pyGenericServices_>
	//   90  177:invokevirtual   #643 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 8) == 8)
	//*  91  180:aload_0         
	//*  92  181:getfield        #185 <Field int bitField0_>
	//*  93  184:bipush          8
	//*  94  186:iand            
	//*  95  187:bipush          8
	//*  96  189:icmpne          202
			codedoutputstream.writeBool(20, javaGenerateEqualsAndHash_);
	//   97  192:aload_1         
	//   98  193:bipush          20
	//   99  195:aload_0         
	//  100  196:getfield        #119 <Field boolean javaGenerateEqualsAndHash_>
	//  101  199:invokevirtual   #643 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 0x800) == 2048)
	//* 102  202:aload_0         
	//* 103  203:getfield        #185 <Field int bitField0_>
	//* 104  206:sipush          2048
	//* 105  209:iand            
	//* 106  210:sipush          2048
	//* 107  213:icmpne          226
			codedoutputstream.writeBool(23, deprecated_);
	//  108  216:aload_1         
	//  109  217:bipush          23
	//  110  219:aload_0         
	//  111  220:getfield        #135 <Field boolean deprecated_>
	//  112  223:invokevirtual   #643 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 0x10) == 16)
	//* 113  226:aload_0         
	//* 114  227:getfield        #185 <Field int bitField0_>
	//* 115  230:bipush          16
	//* 116  232:iand            
	//* 117  233:bipush          16
	//* 118  235:icmpne          248
			codedoutputstream.writeBool(27, javaStringCheckUtf8_);
	//  119  238:aload_1         
	//  120  239:bipush          27
	//  121  241:aload_0         
	//  122  242:getfield        #121 <Field boolean javaStringCheckUtf8_>
	//  123  245:invokevirtual   #643 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 0x1000) == 4096)
	//* 124  248:aload_0         
	//* 125  249:getfield        #185 <Field int bitField0_>
	//* 126  252:sipush          4096
	//* 127  255:iand            
	//* 128  256:sipush          4096
	//* 129  259:icmpne          272
			codedoutputstream.writeBool(31, ccEnableArenas_);
	//  130  262:aload_1         
	//  131  263:bipush          31
	//  132  265:aload_0         
	//  133  266:getfield        #137 <Field boolean ccEnableArenas_>
	//  134  269:invokevirtual   #643 <Method void CodedOutputStream.writeBool(int, boolean)>
		if((bitField0_ & 0x2000) == 8192)
	//* 135  272:aload_0         
	//* 136  273:getfield        #185 <Field int bitField0_>
	//* 137  276:sipush          8192
	//* 138  279:iand            
	//* 139  280:sipush          8192
	//* 140  283:icmpne          296
			GeneratedMessageV3.writeString(codedoutputstream, 36, objcClassPrefix_);
	//  141  286:aload_1         
	//  142  287:bipush          36
	//  143  289:aload_0         
	//  144  290:getfield        #139 <Field Object objcClassPrefix_>
	//  145  293:invokestatic    #635 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x4000) == 16384)
	//* 146  296:aload_0         
	//* 147  297:getfield        #185 <Field int bitField0_>
	//* 148  300:sipush          16384
	//* 149  303:iand            
	//* 150  304:sipush          16384
	//* 151  307:icmpne          320
			GeneratedMessageV3.writeString(codedoutputstream, 37, csharpNamespace_);
	//  152  310:aload_1         
	//  153  311:bipush          37
	//  154  313:aload_0         
	//  155  314:getfield        #141 <Field Object csharpNamespace_>
	//  156  317:invokestatic    #635 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x8000) == 32768)
	//* 157  320:aload_0         
	//* 158  321:getfield        #185 <Field int bitField0_>
	//* 159  324:ldc1            #203 <Int 32768>
	//* 160  326:iand            
	//* 161  327:ldc1            #203 <Int 32768>
	//* 162  329:icmpne          342
			GeneratedMessageV3.writeString(codedoutputstream, 39, swiftPrefix_);
	//  163  332:aload_1         
	//  164  333:bipush          39
	//  165  335:aload_0         
	//  166  336:getfield        #143 <Field Object swiftPrefix_>
	//  167  339:invokestatic    #635 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x10000) == 0x10000)
	//* 168  342:aload_0         
	//* 169  343:getfield        #185 <Field int bitField0_>
	//* 170  346:ldc1            #204 <Int 0x10000>
	//* 171  348:iand            
	//* 172  349:ldc1            #204 <Int 0x10000>
	//* 173  351:icmpne          364
			GeneratedMessageV3.writeString(codedoutputstream, 40, phpClassPrefix_);
	//  174  354:aload_1         
	//  175  355:bipush          40
	//  176  357:aload_0         
	//  177  358:getfield        #145 <Field Object phpClassPrefix_>
	//  178  361:invokestatic    #635 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x20000) == 0x20000)
	//* 179  364:aload_0         
	//* 180  365:getfield        #185 <Field int bitField0_>
	//* 181  368:ldc1            #205 <Int 0x20000>
	//* 182  370:iand            
	//* 183  371:ldc1            #205 <Int 0x20000>
	//* 184  373:icmpne          386
			GeneratedMessageV3.writeString(codedoutputstream, 41, phpNamespace_);
	//  185  376:aload_1         
	//  186  377:bipush          41
	//  187  379:aload_0         
	//  188  380:getfield        #147 <Field Object phpNamespace_>
	//  189  383:invokestatic    #635 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x400) == 1024)
	//* 190  386:aload_0         
	//* 191  387:getfield        #185 <Field int bitField0_>
	//* 192  390:sipush          1024
	//* 193  393:iand            
	//* 194  394:sipush          1024
	//* 195  397:icmpne          410
			codedoutputstream.writeBool(42, phpGenericServices_);
	//  196  400:aload_1         
	//  197  401:bipush          42
	//  198  403:aload_0         
	//  199  404:getfield        #133 <Field boolean phpGenericServices_>
	//  200  407:invokevirtual   #643 <Method void CodedOutputStream.writeBool(int, boolean)>
		for(int i = 0; i < uninterpretedOption_.size(); i++)
	//* 201  410:iconst_0        
	//* 202  411:istore_2        
	//* 203  412:iload_2         
	//* 204  413:aload_0         
	//* 205  414:getfield        #155 <Field List uninterpretedOption_>
	//* 206  417:invokeinterface #537 <Method int List.size()>
	//* 207  422:icmpge          452
			codedoutputstream.writeMessage(999, (MessageLite)uninterpretedOption_.get(i));
	//  208  425:aload_1         
	//  209  426:sipush          999
	//  210  429:aload_0         
	//  211  430:getfield        #155 <Field List uninterpretedOption_>
	//  212  433:iload_2         
	//  213  434:invokeinterface #541 <Method Object List.get(int)>
	//  214  439:checkcast       #543 <Class MessageLite>
	//  215  442:invokevirtual   #647 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//  216  445:iload_2         
	//  217  446:iconst_1        
	//  218  447:iadd            
	//  219  448:istore_2        
	//* 220  449:goto            412
		extensionwriter.writeUntil(0x20000000, codedoutputstream);
	//  221  452:aload_3         
	//  222  453:ldc2            #648 <Int 0x20000000>
	//  223  456:aload_1         
	//  224  457:invokevirtual   #654 <Method void GeneratedMessageV3$ExtendableMessage$ExtensionWriter.writeUntil(int, CodedOutputStream)>
		unknownFields.writeTo(codedoutputstream);
	//  225  460:aload_0         
	//  226  461:getfield        #234 <Field UnknownFieldSet unknownFields>
	//  227  464:aload_1         
	//  228  465:invokevirtual   #656 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//  229  468:return          
	}

	public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
	public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
	public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
	private static final DescriptorProtos$FileOptions DEFAULT_INSTANCE = new DescriptorProtos$FileOptions();
	public static final int DEPRECATED_FIELD_NUMBER = 23;
	public static final int GO_PACKAGE_FIELD_NUMBER = 11;
	public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
	public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
	public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
	public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
	public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
	public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
	public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
	public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.FileOptions parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.FileOptions(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$FileOptions>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$FileOptions(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$FileOptions parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
	public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
	public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
	public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
	public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
	public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private boolean ccEnableArenas_;
	private boolean ccGenericServices_;
	private volatile Object csharpNamespace_;
	private boolean deprecated_;
	private volatile Object goPackage_;
	private boolean javaGenerateEqualsAndHash_;
	private boolean javaGenericServices_;
	private boolean javaMultipleFiles_;
	private volatile Object javaOuterClassname_;
	private volatile Object javaPackage_;
	private boolean javaStringCheckUtf8_;
	private byte memoizedIsInitialized;
	private volatile Object objcClassPrefix_;
	private int optimizeFor_;
	private volatile Object phpClassPrefix_;
	private boolean phpGenericServices_;
	private volatile Object phpNamespace_;
	private boolean pyGenericServices_;
	private volatile Object swiftPrefix_;
	private List uninterpretedOption_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$FileOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void DescriptorProtos$FileOptions()>
	//    3    7:putstatic       #102 <Field DescriptorProtos$FileOptions DEFAULT_INSTANCE>
	//    4   10:new             #12  <Class DescriptorProtos$FileOptions$1>
	//    5   13:dup             
	//    6   14:invokespecial   #103 <Method void DescriptorProtos$FileOptions$1()>
	//    7   17:putstatic       #105 <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$15400(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return descriptorprotos$fileoptions.javaPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object javaPackage_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$15402(DescriptorProtos$FileOptions descriptorprotos$fileoptions, Object obj)
	{
		descriptorprotos$fileoptions.javaPackage_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field Object javaPackage_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$15500(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return descriptorprotos$fileoptions.javaOuterClassname_;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Object javaOuterClassname_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$15502(DescriptorProtos$FileOptions descriptorprotos$fileoptions, Object obj)
	{
		descriptorprotos$fileoptions.javaOuterClassname_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field Object javaOuterClassname_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$15602(DescriptorProtos$FileOptions descriptorprotos$fileoptions, boolean flag)
	{
		descriptorprotos$fileoptions.javaMultipleFiles_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #117 <Field boolean javaMultipleFiles_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$15702(DescriptorProtos$FileOptions descriptorprotos$fileoptions, boolean flag)
	{
		descriptorprotos$fileoptions.javaGenerateEqualsAndHash_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #119 <Field boolean javaGenerateEqualsAndHash_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$15802(DescriptorProtos$FileOptions descriptorprotos$fileoptions, boolean flag)
	{
		descriptorprotos$fileoptions.javaStringCheckUtf8_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #121 <Field boolean javaStringCheckUtf8_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$15902(DescriptorProtos$FileOptions descriptorprotos$fileoptions, int i)
	{
		descriptorprotos$fileoptions.optimizeFor_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field int optimizeFor_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Object access$16000(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return descriptorprotos$fileoptions.goPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Object goPackage_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$16002(DescriptorProtos$FileOptions descriptorprotos$fileoptions, Object obj)
	{
		descriptorprotos$fileoptions.goPackage_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field Object goPackage_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$16102(DescriptorProtos$FileOptions descriptorprotos$fileoptions, boolean flag)
	{
		descriptorprotos$fileoptions.ccGenericServices_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #127 <Field boolean ccGenericServices_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$16202(DescriptorProtos$FileOptions descriptorprotos$fileoptions, boolean flag)
	{
		descriptorprotos$fileoptions.javaGenericServices_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #129 <Field boolean javaGenericServices_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$16302(DescriptorProtos$FileOptions descriptorprotos$fileoptions, boolean flag)
	{
		descriptorprotos$fileoptions.pyGenericServices_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #131 <Field boolean pyGenericServices_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$16402(DescriptorProtos$FileOptions descriptorprotos$fileoptions, boolean flag)
	{
		descriptorprotos$fileoptions.phpGenericServices_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #133 <Field boolean phpGenericServices_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$16502(DescriptorProtos$FileOptions descriptorprotos$fileoptions, boolean flag)
	{
		descriptorprotos$fileoptions.deprecated_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #135 <Field boolean deprecated_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$16602(DescriptorProtos$FileOptions descriptorprotos$fileoptions, boolean flag)
	{
		descriptorprotos$fileoptions.ccEnableArenas_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #137 <Field boolean ccEnableArenas_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Object access$16700(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return descriptorprotos$fileoptions.objcClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field Object objcClassPrefix_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$16702(DescriptorProtos$FileOptions descriptorprotos$fileoptions, Object obj)
	{
		descriptorprotos$fileoptions.objcClassPrefix_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #139 <Field Object objcClassPrefix_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$16800(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return descriptorprotos$fileoptions.csharpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field Object csharpNamespace_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$16802(DescriptorProtos$FileOptions descriptorprotos$fileoptions, Object obj)
	{
		descriptorprotos$fileoptions.csharpNamespace_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field Object csharpNamespace_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$16900(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return descriptorprotos$fileoptions.swiftPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Object swiftPrefix_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$16902(DescriptorProtos$FileOptions descriptorprotos$fileoptions, Object obj)
	{
		descriptorprotos$fileoptions.swiftPrefix_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #143 <Field Object swiftPrefix_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$17000(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return descriptorprotos$fileoptions.phpClassPrefix_;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Object phpClassPrefix_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$17002(DescriptorProtos$FileOptions descriptorprotos$fileoptions, Object obj)
	{
		descriptorprotos$fileoptions.phpClassPrefix_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field Object phpClassPrefix_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$17100(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return descriptorprotos$fileoptions.phpNamespace_;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field Object phpNamespace_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$17102(DescriptorProtos$FileOptions descriptorprotos$fileoptions, Object obj)
	{
		descriptorprotos$fileoptions.phpNamespace_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field Object phpNamespace_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$17200(DescriptorProtos$FileOptions descriptorprotos$fileoptions)
	{
		return descriptorprotos$fileoptions.uninterpretedOption_;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field List uninterpretedOption_>
	//    2    4:areturn         
	}

*/


/*
	static List access$17202(DescriptorProtos$FileOptions descriptorprotos$fileoptions, List list)
	{
		descriptorprotos$fileoptions.uninterpretedOption_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field List uninterpretedOption_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$17302(DescriptorProtos$FileOptions descriptorprotos$fileoptions, int i)
	{
		descriptorprotos$fileoptions.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #185 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$FileOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void GeneratedMessageV3$ExtendableMessage()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #109 <Field byte memoizedIsInitialized>
		javaPackage_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #111 <String "">
	//    7   12:putfield        #113 <Field Object javaPackage_>
		javaOuterClassname_ = "";
	//    8   15:aload_0         
	//    9   16:ldc1            #111 <String "">
	//   10   18:putfield        #115 <Field Object javaOuterClassname_>
		javaMultipleFiles_ = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #117 <Field boolean javaMultipleFiles_>
		javaGenerateEqualsAndHash_ = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #119 <Field boolean javaGenerateEqualsAndHash_>
		javaStringCheckUtf8_ = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #121 <Field boolean javaStringCheckUtf8_>
		optimizeFor_ = 1;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #123 <Field int optimizeFor_>
		goPackage_ = "";
	//   23   41:aload_0         
	//   24   42:ldc1            #111 <String "">
	//   25   44:putfield        #125 <Field Object goPackage_>
		ccGenericServices_ = false;
	//   26   47:aload_0         
	//   27   48:iconst_0        
	//   28   49:putfield        #127 <Field boolean ccGenericServices_>
		javaGenericServices_ = false;
	//   29   52:aload_0         
	//   30   53:iconst_0        
	//   31   54:putfield        #129 <Field boolean javaGenericServices_>
		pyGenericServices_ = false;
	//   32   57:aload_0         
	//   33   58:iconst_0        
	//   34   59:putfield        #131 <Field boolean pyGenericServices_>
		phpGenericServices_ = false;
	//   35   62:aload_0         
	//   36   63:iconst_0        
	//   37   64:putfield        #133 <Field boolean phpGenericServices_>
		deprecated_ = false;
	//   38   67:aload_0         
	//   39   68:iconst_0        
	//   40   69:putfield        #135 <Field boolean deprecated_>
		ccEnableArenas_ = false;
	//   41   72:aload_0         
	//   42   73:iconst_0        
	//   43   74:putfield        #137 <Field boolean ccEnableArenas_>
		objcClassPrefix_ = "";
	//   44   77:aload_0         
	//   45   78:ldc1            #111 <String "">
	//   46   80:putfield        #139 <Field Object objcClassPrefix_>
		csharpNamespace_ = "";
	//   47   83:aload_0         
	//   48   84:ldc1            #111 <String "">
	//   49   86:putfield        #141 <Field Object csharpNamespace_>
		swiftPrefix_ = "";
	//   50   89:aload_0         
	//   51   90:ldc1            #111 <String "">
	//   52   92:putfield        #143 <Field Object swiftPrefix_>
		phpClassPrefix_ = "";
	//   53   95:aload_0         
	//   54   96:ldc1            #111 <String "">
	//   55   98:putfield        #145 <Field Object phpClassPrefix_>
		phpNamespace_ = "";
	//   56  101:aload_0         
	//   57  102:ldc1            #111 <String "">
	//   58  104:putfield        #147 <Field Object phpNamespace_>
		uninterpretedOption_ = Collections.emptyList();
	//   59  107:aload_0         
	//   60  108:invokestatic    #153 <Method List Collections.emptyList()>
	//   61  111:putfield        #155 <Field List uninterpretedOption_>
	//   62  114:return          
	}

	private DescriptorProtos$FileOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void DescriptorProtos$FileOptions()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #162 <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #163 <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #169 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          10
		flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L28:
		int k;
		int l;
		int i1;
		if(flag)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            1266
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
	//   23   41:invokevirtual   #175 <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		j1;
	//   25   46:iload           9
		JVM INSTR lookupswitch 20: default 1366
	//	               0: 1369
	//	               10: 254
	//	               66: 309
	//	               72: 364
	//	               80: 462
	//	               90: 504
	//	               128: 560
	//	               136: 604
	//	               144: 648
	//	               160: 692
	//	               184: 735
	//	               216: 779
	//	               248: 822
	//	               290: 866
	//	               298: 923
	//	               314: 980
	//	               322: 1036
	//	               330: 1092
	//	               336: 1148
	//	               7994: 1192;
	//   26   48:lookupswitch    20: default 1366
	//	               0: 1369
	//	               10: 254
	//	               66: 309
	//	               72: 364
	//	               80: 462
	//	               90: 504
	//	               128: 560
	//	               136: 604
	//	               144: 648
	//	               160: 692
	//	               184: 735
	//	               216: 779
	//	               248: 822
	//	               290: 866
	//	               298: 923
	//	               314: 980
	//	               322: 1036
	//	               330: 1092
	//	               336: 1148
	//	               7994: 1192
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L1:
		int j;
		j = i;
	//   27  220:iload_3         
	//   28  221:istore          4
		l = i;
	//   29  223:iload_3         
	//   30  224:istore          6
		i1 = i;
	//   31  226:iload_3         
	//   32  227:istore          7
		k = i;
	//   33  229:iload_3         
	//   34  230:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, j1))
	//*  35  232:aload_0         
	//*  36  233:aload_1         
	//*  37  234:aload           10
	//*  38  236:aload_2         
	//*  39  237:iload           9
	//*  40  239:invokevirtual   #179 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  242:ifne            1260
		{
			flag = true;
	//   42  245:iconst_1        
	//   43  246:istore          8
			j = i;
	//   44  248:iload_3         
	//   45  249:istore          4
		}
		  goto _L22
	//*  46  251:goto            1260
_L3:
		l = i;
	//   47  254:iload_3         
	//   48  255:istore          6
		i1 = i;
	//   49  257:iload_3         
	//   50  258:istore          7
		k = i;
	//   51  260:iload_3         
	//   52  261:istore          5
		ByteString bytestring = codedinputstream.readBytes();
	//   53  263:aload_1         
	//   54  264:invokevirtual   #183 <Method ByteString CodedInputStream.readBytes()>
	//   55  267:astore          11
		l = i;
	//   56  269:iload_3         
	//   57  270:istore          6
		i1 = i;
	//   58  272:iload_3         
	//   59  273:istore          7
		k = i;
	//   60  275:iload_3         
	//   61  276:istore          5
		bitField0_ = bitField0_ | 1;
	//   62  278:aload_0         
	//   63  279:aload_0         
	//   64  280:getfield        #185 <Field int bitField0_>
	//   65  283:iconst_1        
	//   66  284:ior             
	//   67  285:putfield        #185 <Field int bitField0_>
		l = i;
	//   68  288:iload_3         
	//   69  289:istore          6
		i1 = i;
	//   70  291:iload_3         
	//   71  292:istore          7
		k = i;
	//   72  294:iload_3         
	//   73  295:istore          5
		javaPackage_ = ((Object) (bytestring));
	//   74  297:aload_0         
	//   75  298:aload           11
	//   76  300:putfield        #113 <Field Object javaPackage_>
		j = i;
	//   77  303:iload_3         
	//   78  304:istore          4
		  goto _L22
	//*  79  306:goto            1260
_L4:
		l = i;
	//   80  309:iload_3         
	//   81  310:istore          6
		i1 = i;
	//   82  312:iload_3         
	//   83  313:istore          7
		k = i;
	//   84  315:iload_3         
	//   85  316:istore          5
		bytestring = codedinputstream.readBytes();
	//   86  318:aload_1         
	//   87  319:invokevirtual   #183 <Method ByteString CodedInputStream.readBytes()>
	//   88  322:astore          11
		l = i;
	//   89  324:iload_3         
	//   90  325:istore          6
		i1 = i;
	//   91  327:iload_3         
	//   92  328:istore          7
		k = i;
	//   93  330:iload_3         
	//   94  331:istore          5
		bitField0_ = bitField0_ | 2;
	//   95  333:aload_0         
	//   96  334:aload_0         
	//   97  335:getfield        #185 <Field int bitField0_>
	//   98  338:iconst_2        
	//   99  339:ior             
	//  100  340:putfield        #185 <Field int bitField0_>
		l = i;
	//  101  343:iload_3         
	//  102  344:istore          6
		i1 = i;
	//  103  346:iload_3         
	//  104  347:istore          7
		k = i;
	//  105  349:iload_3         
	//  106  350:istore          5
		javaOuterClassname_ = ((Object) (bytestring));
	//  107  352:aload_0         
	//  108  353:aload           11
	//  109  355:putfield        #115 <Field Object javaOuterClassname_>
		j = i;
	//  110  358:iload_3         
	//  111  359:istore          4
		  goto _L22
	//* 112  361:goto            1260
_L5:
		l = i;
	//  113  364:iload_3         
	//  114  365:istore          6
		i1 = i;
	//  115  367:iload_3         
	//  116  368:istore          7
		k = i;
	//  117  370:iload_3         
	//  118  371:istore          5
		j = codedinputstream.readEnum();
	//  119  373:aload_1         
	//  120  374:invokevirtual   #188 <Method int CodedInputStream.readEnum()>
	//  121  377:istore          4
		l = i;
	//  122  379:iload_3         
	//  123  380:istore          6
		i1 = i;
	//  124  382:iload_3         
	//  125  383:istore          7
		k = i;
	//  126  385:iload_3         
	//  127  386:istore          5
		if(OptimizeMode.valueOf(j) != null) goto _L24; else goto _L23
	//  128  388:iload           4
	//  129  390:invokestatic    #192 <Method DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions$OptimizeMode.valueOf(int)>
	//  130  393:ifnonnull       421
_L23:
		l = i;
	//  131  396:iload_3         
	//  132  397:istore          6
		i1 = i;
	//  133  399:iload_3         
	//  134  400:istore          7
		k = i;
	//  135  402:iload_3         
	//  136  403:istore          5
		builder.mergeVarintField(9, j);
	//  137  405:aload           10
	//  138  407:bipush          9
	//  139  409:iload           4
	//  140  411:invokevirtual   #198 <Method UnknownFieldSet$Builder UnknownFieldSet$Builder.mergeVarintField(int, int)>
	//  141  414:pop             
		j = i;
	//  142  415:iload_3         
	//  143  416:istore          4
		  goto _L22
	//* 144  418:goto            1260
_L24:
		l = i;
	//  145  421:iload_3         
	//  146  422:istore          6
		i1 = i;
	//  147  424:iload_3         
	//  148  425:istore          7
		k = i;
	//  149  427:iload_3         
	//  150  428:istore          5
		bitField0_ = bitField0_ | 0x20;
	//  151  430:aload_0         
	//  152  431:aload_0         
	//  153  432:getfield        #185 <Field int bitField0_>
	//  154  435:bipush          32
	//  155  437:ior             
	//  156  438:putfield        #185 <Field int bitField0_>
		l = i;
	//  157  441:iload_3         
	//  158  442:istore          6
		i1 = i;
	//  159  444:iload_3         
	//  160  445:istore          7
		k = i;
	//  161  447:iload_3         
	//  162  448:istore          5
		optimizeFor_ = j;
	//  163  450:aload_0         
	//  164  451:iload           4
	//  165  453:putfield        #123 <Field int optimizeFor_>
		j = i;
	//  166  456:iload_3         
	//  167  457:istore          4
		  goto _L22
	//* 168  459:goto            1260
_L6:
		l = i;
	//  169  462:iload_3         
	//  170  463:istore          6
		i1 = i;
	//  171  465:iload_3         
	//  172  466:istore          7
		k = i;
	//  173  468:iload_3         
	//  174  469:istore          5
		bitField0_ = bitField0_ | 4;
	//  175  471:aload_0         
	//  176  472:aload_0         
	//  177  473:getfield        #185 <Field int bitField0_>
	//  178  476:iconst_4        
	//  179  477:ior             
	//  180  478:putfield        #185 <Field int bitField0_>
		l = i;
	//  181  481:iload_3         
	//  182  482:istore          6
		i1 = i;
	//  183  484:iload_3         
	//  184  485:istore          7
		k = i;
	//  185  487:iload_3         
	//  186  488:istore          5
		javaMultipleFiles_ = codedinputstream.readBool();
	//  187  490:aload_0         
	//  188  491:aload_1         
	//  189  492:invokevirtual   #202 <Method boolean CodedInputStream.readBool()>
	//  190  495:putfield        #117 <Field boolean javaMultipleFiles_>
		j = i;
	//  191  498:iload_3         
	//  192  499:istore          4
		  goto _L22
	//* 193  501:goto            1260
_L7:
		l = i;
	//  194  504:iload_3         
	//  195  505:istore          6
		i1 = i;
	//  196  507:iload_3         
	//  197  508:istore          7
		k = i;
	//  198  510:iload_3         
	//  199  511:istore          5
		bytestring = codedinputstream.readBytes();
	//  200  513:aload_1         
	//  201  514:invokevirtual   #183 <Method ByteString CodedInputStream.readBytes()>
	//  202  517:astore          11
		l = i;
	//  203  519:iload_3         
	//  204  520:istore          6
		i1 = i;
	//  205  522:iload_3         
	//  206  523:istore          7
		k = i;
	//  207  525:iload_3         
	//  208  526:istore          5
		bitField0_ = bitField0_ | 0x40;
	//  209  528:aload_0         
	//  210  529:aload_0         
	//  211  530:getfield        #185 <Field int bitField0_>
	//  212  533:bipush          64
	//  213  535:ior             
	//  214  536:putfield        #185 <Field int bitField0_>
		l = i;
	//  215  539:iload_3         
	//  216  540:istore          6
		i1 = i;
	//  217  542:iload_3         
	//  218  543:istore          7
		k = i;
	//  219  545:iload_3         
	//  220  546:istore          5
		goPackage_ = ((Object) (bytestring));
	//  221  548:aload_0         
	//  222  549:aload           11
	//  223  551:putfield        #125 <Field Object goPackage_>
		j = i;
	//  224  554:iload_3         
	//  225  555:istore          4
		  goto _L22
	//* 226  557:goto            1260
_L8:
		l = i;
	//  227  560:iload_3         
	//  228  561:istore          6
		i1 = i;
	//  229  563:iload_3         
	//  230  564:istore          7
		k = i;
	//  231  566:iload_3         
	//  232  567:istore          5
		bitField0_ = bitField0_ | 0x80;
	//  233  569:aload_0         
	//  234  570:aload_0         
	//  235  571:getfield        #185 <Field int bitField0_>
	//  236  574:sipush          128
	//  237  577:ior             
	//  238  578:putfield        #185 <Field int bitField0_>
		l = i;
	//  239  581:iload_3         
	//  240  582:istore          6
		i1 = i;
	//  241  584:iload_3         
	//  242  585:istore          7
		k = i;
	//  243  587:iload_3         
	//  244  588:istore          5
		ccGenericServices_ = codedinputstream.readBool();
	//  245  590:aload_0         
	//  246  591:aload_1         
	//  247  592:invokevirtual   #202 <Method boolean CodedInputStream.readBool()>
	//  248  595:putfield        #127 <Field boolean ccGenericServices_>
		j = i;
	//  249  598:iload_3         
	//  250  599:istore          4
		  goto _L22
	//* 251  601:goto            1260
_L9:
		l = i;
	//  252  604:iload_3         
	//  253  605:istore          6
		i1 = i;
	//  254  607:iload_3         
	//  255  608:istore          7
		k = i;
	//  256  610:iload_3         
	//  257  611:istore          5
		bitField0_ = bitField0_ | 0x100;
	//  258  613:aload_0         
	//  259  614:aload_0         
	//  260  615:getfield        #185 <Field int bitField0_>
	//  261  618:sipush          256
	//  262  621:ior             
	//  263  622:putfield        #185 <Field int bitField0_>
		l = i;
	//  264  625:iload_3         
	//  265  626:istore          6
		i1 = i;
	//  266  628:iload_3         
	//  267  629:istore          7
		k = i;
	//  268  631:iload_3         
	//  269  632:istore          5
		javaGenericServices_ = codedinputstream.readBool();
	//  270  634:aload_0         
	//  271  635:aload_1         
	//  272  636:invokevirtual   #202 <Method boolean CodedInputStream.readBool()>
	//  273  639:putfield        #129 <Field boolean javaGenericServices_>
		j = i;
	//  274  642:iload_3         
	//  275  643:istore          4
		  goto _L22
	//* 276  645:goto            1260
_L10:
		l = i;
	//  277  648:iload_3         
	//  278  649:istore          6
		i1 = i;
	//  279  651:iload_3         
	//  280  652:istore          7
		k = i;
	//  281  654:iload_3         
	//  282  655:istore          5
		bitField0_ = bitField0_ | 0x200;
	//  283  657:aload_0         
	//  284  658:aload_0         
	//  285  659:getfield        #185 <Field int bitField0_>
	//  286  662:sipush          512
	//  287  665:ior             
	//  288  666:putfield        #185 <Field int bitField0_>
		l = i;
	//  289  669:iload_3         
	//  290  670:istore          6
		i1 = i;
	//  291  672:iload_3         
	//  292  673:istore          7
		k = i;
	//  293  675:iload_3         
	//  294  676:istore          5
		pyGenericServices_ = codedinputstream.readBool();
	//  295  678:aload_0         
	//  296  679:aload_1         
	//  297  680:invokevirtual   #202 <Method boolean CodedInputStream.readBool()>
	//  298  683:putfield        #131 <Field boolean pyGenericServices_>
		j = i;
	//  299  686:iload_3         
	//  300  687:istore          4
		  goto _L22
	//* 301  689:goto            1260
_L11:
		l = i;
	//  302  692:iload_3         
	//  303  693:istore          6
		i1 = i;
	//  304  695:iload_3         
	//  305  696:istore          7
		k = i;
	//  306  698:iload_3         
	//  307  699:istore          5
		bitField0_ = bitField0_ | 8;
	//  308  701:aload_0         
	//  309  702:aload_0         
	//  310  703:getfield        #185 <Field int bitField0_>
	//  311  706:bipush          8
	//  312  708:ior             
	//  313  709:putfield        #185 <Field int bitField0_>
		l = i;
	//  314  712:iload_3         
	//  315  713:istore          6
		i1 = i;
	//  316  715:iload_3         
	//  317  716:istore          7
		k = i;
	//  318  718:iload_3         
	//  319  719:istore          5
		javaGenerateEqualsAndHash_ = codedinputstream.readBool();
	//  320  721:aload_0         
	//  321  722:aload_1         
	//  322  723:invokevirtual   #202 <Method boolean CodedInputStream.readBool()>
	//  323  726:putfield        #119 <Field boolean javaGenerateEqualsAndHash_>
		j = i;
	//  324  729:iload_3         
	//  325  730:istore          4
		  goto _L22
	//* 326  732:goto            1260
_L12:
		l = i;
	//  327  735:iload_3         
	//  328  736:istore          6
		i1 = i;
	//  329  738:iload_3         
	//  330  739:istore          7
		k = i;
	//  331  741:iload_3         
	//  332  742:istore          5
		bitField0_ = bitField0_ | 0x800;
	//  333  744:aload_0         
	//  334  745:aload_0         
	//  335  746:getfield        #185 <Field int bitField0_>
	//  336  749:sipush          2048
	//  337  752:ior             
	//  338  753:putfield        #185 <Field int bitField0_>
		l = i;
	//  339  756:iload_3         
	//  340  757:istore          6
		i1 = i;
	//  341  759:iload_3         
	//  342  760:istore          7
		k = i;
	//  343  762:iload_3         
	//  344  763:istore          5
		deprecated_ = codedinputstream.readBool();
	//  345  765:aload_0         
	//  346  766:aload_1         
	//  347  767:invokevirtual   #202 <Method boolean CodedInputStream.readBool()>
	//  348  770:putfield        #135 <Field boolean deprecated_>
		j = i;
	//  349  773:iload_3         
	//  350  774:istore          4
		  goto _L22
	//* 351  776:goto            1260
_L13:
		l = i;
	//  352  779:iload_3         
	//  353  780:istore          6
		i1 = i;
	//  354  782:iload_3         
	//  355  783:istore          7
		k = i;
	//  356  785:iload_3         
	//  357  786:istore          5
		bitField0_ = bitField0_ | 0x10;
	//  358  788:aload_0         
	//  359  789:aload_0         
	//  360  790:getfield        #185 <Field int bitField0_>
	//  361  793:bipush          16
	//  362  795:ior             
	//  363  796:putfield        #185 <Field int bitField0_>
		l = i;
	//  364  799:iload_3         
	//  365  800:istore          6
		i1 = i;
	//  366  802:iload_3         
	//  367  803:istore          7
		k = i;
	//  368  805:iload_3         
	//  369  806:istore          5
		javaStringCheckUtf8_ = codedinputstream.readBool();
	//  370  808:aload_0         
	//  371  809:aload_1         
	//  372  810:invokevirtual   #202 <Method boolean CodedInputStream.readBool()>
	//  373  813:putfield        #121 <Field boolean javaStringCheckUtf8_>
		j = i;
	//  374  816:iload_3         
	//  375  817:istore          4
		  goto _L22
	//* 376  819:goto            1260
_L14:
		l = i;
	//  377  822:iload_3         
	//  378  823:istore          6
		i1 = i;
	//  379  825:iload_3         
	//  380  826:istore          7
		k = i;
	//  381  828:iload_3         
	//  382  829:istore          5
		bitField0_ = bitField0_ | 0x1000;
	//  383  831:aload_0         
	//  384  832:aload_0         
	//  385  833:getfield        #185 <Field int bitField0_>
	//  386  836:sipush          4096
	//  387  839:ior             
	//  388  840:putfield        #185 <Field int bitField0_>
		l = i;
	//  389  843:iload_3         
	//  390  844:istore          6
		i1 = i;
	//  391  846:iload_3         
	//  392  847:istore          7
		k = i;
	//  393  849:iload_3         
	//  394  850:istore          5
		ccEnableArenas_ = codedinputstream.readBool();
	//  395  852:aload_0         
	//  396  853:aload_1         
	//  397  854:invokevirtual   #202 <Method boolean CodedInputStream.readBool()>
	//  398  857:putfield        #137 <Field boolean ccEnableArenas_>
		j = i;
	//  399  860:iload_3         
	//  400  861:istore          4
		  goto _L22
	//* 401  863:goto            1260
_L15:
		l = i;
	//  402  866:iload_3         
	//  403  867:istore          6
		i1 = i;
	//  404  869:iload_3         
	//  405  870:istore          7
		k = i;
	//  406  872:iload_3         
	//  407  873:istore          5
		bytestring = codedinputstream.readBytes();
	//  408  875:aload_1         
	//  409  876:invokevirtual   #183 <Method ByteString CodedInputStream.readBytes()>
	//  410  879:astore          11
		l = i;
	//  411  881:iload_3         
	//  412  882:istore          6
		i1 = i;
	//  413  884:iload_3         
	//  414  885:istore          7
		k = i;
	//  415  887:iload_3         
	//  416  888:istore          5
		bitField0_ = bitField0_ | 0x2000;
	//  417  890:aload_0         
	//  418  891:aload_0         
	//  419  892:getfield        #185 <Field int bitField0_>
	//  420  895:sipush          8192
	//  421  898:ior             
	//  422  899:putfield        #185 <Field int bitField0_>
		l = i;
	//  423  902:iload_3         
	//  424  903:istore          6
		i1 = i;
	//  425  905:iload_3         
	//  426  906:istore          7
		k = i;
	//  427  908:iload_3         
	//  428  909:istore          5
		objcClassPrefix_ = ((Object) (bytestring));
	//  429  911:aload_0         
	//  430  912:aload           11
	//  431  914:putfield        #139 <Field Object objcClassPrefix_>
		j = i;
	//  432  917:iload_3         
	//  433  918:istore          4
		  goto _L22
	//* 434  920:goto            1260
_L16:
		l = i;
	//  435  923:iload_3         
	//  436  924:istore          6
		i1 = i;
	//  437  926:iload_3         
	//  438  927:istore          7
		k = i;
	//  439  929:iload_3         
	//  440  930:istore          5
		bytestring = codedinputstream.readBytes();
	//  441  932:aload_1         
	//  442  933:invokevirtual   #183 <Method ByteString CodedInputStream.readBytes()>
	//  443  936:astore          11
		l = i;
	//  444  938:iload_3         
	//  445  939:istore          6
		i1 = i;
	//  446  941:iload_3         
	//  447  942:istore          7
		k = i;
	//  448  944:iload_3         
	//  449  945:istore          5
		bitField0_ = bitField0_ | 0x4000;
	//  450  947:aload_0         
	//  451  948:aload_0         
	//  452  949:getfield        #185 <Field int bitField0_>
	//  453  952:sipush          16384
	//  454  955:ior             
	//  455  956:putfield        #185 <Field int bitField0_>
		l = i;
	//  456  959:iload_3         
	//  457  960:istore          6
		i1 = i;
	//  458  962:iload_3         
	//  459  963:istore          7
		k = i;
	//  460  965:iload_3         
	//  461  966:istore          5
		csharpNamespace_ = ((Object) (bytestring));
	//  462  968:aload_0         
	//  463  969:aload           11
	//  464  971:putfield        #141 <Field Object csharpNamespace_>
		j = i;
	//  465  974:iload_3         
	//  466  975:istore          4
		  goto _L22
	//* 467  977:goto            1260
_L17:
		l = i;
	//  468  980:iload_3         
	//  469  981:istore          6
		i1 = i;
	//  470  983:iload_3         
	//  471  984:istore          7
		k = i;
	//  472  986:iload_3         
	//  473  987:istore          5
		bytestring = codedinputstream.readBytes();
	//  474  989:aload_1         
	//  475  990:invokevirtual   #183 <Method ByteString CodedInputStream.readBytes()>
	//  476  993:astore          11
		l = i;
	//  477  995:iload_3         
	//  478  996:istore          6
		i1 = i;
	//  479  998:iload_3         
	//  480  999:istore          7
		k = i;
	//  481 1001:iload_3         
	//  482 1002:istore          5
		bitField0_ = bitField0_ | 0x8000;
	//  483 1004:aload_0         
	//  484 1005:aload_0         
	//  485 1006:getfield        #185 <Field int bitField0_>
	//  486 1009:ldc1            #203 <Int 32768>
	//  487 1011:ior             
	//  488 1012:putfield        #185 <Field int bitField0_>
		l = i;
	//  489 1015:iload_3         
	//  490 1016:istore          6
		i1 = i;
	//  491 1018:iload_3         
	//  492 1019:istore          7
		k = i;
	//  493 1021:iload_3         
	//  494 1022:istore          5
		swiftPrefix_ = ((Object) (bytestring));
	//  495 1024:aload_0         
	//  496 1025:aload           11
	//  497 1027:putfield        #143 <Field Object swiftPrefix_>
		j = i;
	//  498 1030:iload_3         
	//  499 1031:istore          4
		  goto _L22
	//* 500 1033:goto            1260
_L18:
		l = i;
	//  501 1036:iload_3         
	//  502 1037:istore          6
		i1 = i;
	//  503 1039:iload_3         
	//  504 1040:istore          7
		k = i;
	//  505 1042:iload_3         
	//  506 1043:istore          5
		bytestring = codedinputstream.readBytes();
	//  507 1045:aload_1         
	//  508 1046:invokevirtual   #183 <Method ByteString CodedInputStream.readBytes()>
	//  509 1049:astore          11
		l = i;
	//  510 1051:iload_3         
	//  511 1052:istore          6
		i1 = i;
	//  512 1054:iload_3         
	//  513 1055:istore          7
		k = i;
	//  514 1057:iload_3         
	//  515 1058:istore          5
		bitField0_ = bitField0_ | 0x10000;
	//  516 1060:aload_0         
	//  517 1061:aload_0         
	//  518 1062:getfield        #185 <Field int bitField0_>
	//  519 1065:ldc1            #204 <Int 0x10000>
	//  520 1067:ior             
	//  521 1068:putfield        #185 <Field int bitField0_>
		l = i;
	//  522 1071:iload_3         
	//  523 1072:istore          6
		i1 = i;
	//  524 1074:iload_3         
	//  525 1075:istore          7
		k = i;
	//  526 1077:iload_3         
	//  527 1078:istore          5
		phpClassPrefix_ = ((Object) (bytestring));
	//  528 1080:aload_0         
	//  529 1081:aload           11
	//  530 1083:putfield        #145 <Field Object phpClassPrefix_>
		j = i;
	//  531 1086:iload_3         
	//  532 1087:istore          4
		  goto _L22
	//* 533 1089:goto            1260
_L19:
		l = i;
	//  534 1092:iload_3         
	//  535 1093:istore          6
		i1 = i;
	//  536 1095:iload_3         
	//  537 1096:istore          7
		k = i;
	//  538 1098:iload_3         
	//  539 1099:istore          5
		bytestring = codedinputstream.readBytes();
	//  540 1101:aload_1         
	//  541 1102:invokevirtual   #183 <Method ByteString CodedInputStream.readBytes()>
	//  542 1105:astore          11
		l = i;
	//  543 1107:iload_3         
	//  544 1108:istore          6
		i1 = i;
	//  545 1110:iload_3         
	//  546 1111:istore          7
		k = i;
	//  547 1113:iload_3         
	//  548 1114:istore          5
		bitField0_ = bitField0_ | 0x20000;
	//  549 1116:aload_0         
	//  550 1117:aload_0         
	//  551 1118:getfield        #185 <Field int bitField0_>
	//  552 1121:ldc1            #205 <Int 0x20000>
	//  553 1123:ior             
	//  554 1124:putfield        #185 <Field int bitField0_>
		l = i;
	//  555 1127:iload_3         
	//  556 1128:istore          6
		i1 = i;
	//  557 1130:iload_3         
	//  558 1131:istore          7
		k = i;
	//  559 1133:iload_3         
	//  560 1134:istore          5
		phpNamespace_ = ((Object) (bytestring));
	//  561 1136:aload_0         
	//  562 1137:aload           11
	//  563 1139:putfield        #147 <Field Object phpNamespace_>
		j = i;
	//  564 1142:iload_3         
	//  565 1143:istore          4
		  goto _L22
	//* 566 1145:goto            1260
_L20:
		l = i;
	//  567 1148:iload_3         
	//  568 1149:istore          6
		i1 = i;
	//  569 1151:iload_3         
	//  570 1152:istore          7
		k = i;
	//  571 1154:iload_3         
	//  572 1155:istore          5
		bitField0_ = bitField0_ | 0x400;
	//  573 1157:aload_0         
	//  574 1158:aload_0         
	//  575 1159:getfield        #185 <Field int bitField0_>
	//  576 1162:sipush          1024
	//  577 1165:ior             
	//  578 1166:putfield        #185 <Field int bitField0_>
		l = i;
	//  579 1169:iload_3         
	//  580 1170:istore          6
		i1 = i;
	//  581 1172:iload_3         
	//  582 1173:istore          7
		k = i;
	//  583 1175:iload_3         
	//  584 1176:istore          5
		phpGenericServices_ = codedinputstream.readBool();
	//  585 1178:aload_0         
	//  586 1179:aload_1         
	//  587 1180:invokevirtual   #202 <Method boolean CodedInputStream.readBool()>
	//  588 1183:putfield        #133 <Field boolean phpGenericServices_>
		j = i;
	//  589 1186:iload_3         
	//  590 1187:istore          4
		  goto _L22
	//* 591 1189:goto            1260
_L21:
		j = i;
	//  592 1192:iload_3         
	//  593 1193:istore          4
		if((0x40000 & i) == 0x40000) goto _L26; else goto _L25
	//  594 1195:ldc1            #206 <Int 0x40000>
	//  595 1197:iload_3         
	//  596 1198:iand            
	//  597 1199:ldc1            #206 <Int 0x40000>
	//  598 1201:icmpeq          1230
_L25:
		l = i;
	//  599 1204:iload_3         
	//  600 1205:istore          6
		i1 = i;
	//  601 1207:iload_3         
	//  602 1208:istore          7
		k = i;
	//  603 1210:iload_3         
	//  604 1211:istore          5
		uninterpretedOption_ = ((List) (new ArrayList()));
	//  605 1213:aload_0         
	//  606 1214:new             #208 <Class ArrayList>
	//  607 1217:dup             
	//  608 1218:invokespecial   #209 <Method void ArrayList()>
	//  609 1221:putfield        #155 <Field List uninterpretedOption_>
		j = 0x40000 | i;
	//  610 1224:ldc1            #206 <Int 0x40000>
	//  611 1226:iload_3         
	//  612 1227:ior             
	//  613 1228:istore          4
_L26:
		l = j;
	//  614 1230:iload           4
	//  615 1232:istore          6
		i1 = j;
	//  616 1234:iload           4
	//  617 1236:istore          7
		k = j;
	//  618 1238:iload           4
	//  619 1240:istore          5
		uninterpretedOption_.add(((Object) (codedinputstream.readMessage(dOption.PARSER, extensionregistrylite))));
	//  620 1242:aload_0         
	//  621 1243:getfield        #155 <Field List uninterpretedOption_>
	//  622 1246:aload_1         
	//  623 1247:getstatic       #212 <Field Parser DescriptorProtos$UninterpretedOption.PARSER>
	//  624 1250:aload_2         
	//  625 1251:invokevirtual   #216 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  626 1254:invokeinterface #222 <Method boolean List.add(Object)>
	//  627 1259:pop             
_L22:
		i = j;
	//  628 1260:iload           4
	//  629 1262:istore_3        
		if(true) goto _L28; else goto _L27
	//  630 1263:goto            26
_L27:
		if((0x40000 & i) == 0x40000)
	//* 631 1266:ldc1            #206 <Int 0x40000>
	//* 632 1268:iload_3         
	//* 633 1269:iand            
	//* 634 1270:ldc1            #206 <Int 0x40000>
	//* 635 1272:icmpne          1286
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  636 1275:aload_0         
	//  637 1276:aload_0         
	//  638 1277:getfield        #155 <Field List uninterpretedOption_>
	//  639 1280:invokestatic    #226 <Method List Collections.unmodifiableList(List)>
	//  640 1283:putfield        #155 <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  641 1286:aload_0         
	//  642 1287:aload           10
	//  643 1289:invokevirtual   #230 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  644 1292:putfield        #234 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  645 1295:aload_0         
	//  646 1296:invokevirtual   #237 <Method void makeExtensionsImmutable()>
		return;
	//  647 1299:return          
		codedinputstream;
	//  648 1300:astore_1        
		k = l;
	//  649 1301:iload           6
	//  650 1303:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  651 1305:aload_1         
	//  652 1306:aload_0         
	//  653 1307:invokevirtual   #241 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  654 1310:athrow          
		codedinputstream;
	//  655 1311:astore_1        
		k = i1;
	//  656 1312:iload           7
	//  657 1314:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  658 1316:new             #158 <Class InvalidProtocolBufferException>
	//  659 1319:dup             
	//  660 1320:aload_1         
	//  661 1321:invokespecial   #244 <Method void InvalidProtocolBufferException(IOException)>
	//  662 1324:aload_0         
	//  663 1325:invokevirtual   #241 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  664 1328:athrow          
		codedinputstream;
	//  665 1329:astore_1        
		if((0x40000 & k) == 0x40000)
	//* 666 1330:ldc1            #206 <Int 0x40000>
	//* 667 1332:iload           5
	//* 668 1334:iand            
	//* 669 1335:ldc1            #206 <Int 0x40000>
	//* 670 1337:icmpne          1351
			uninterpretedOption_ = Collections.unmodifiableList(uninterpretedOption_);
	//  671 1340:aload_0         
	//  672 1341:aload_0         
	//  673 1342:getfield        #155 <Field List uninterpretedOption_>
	//  674 1345:invokestatic    #226 <Method List Collections.unmodifiableList(List)>
	//  675 1348:putfield        #155 <Field List uninterpretedOption_>
		unknownFields = builder.build();
	//  676 1351:aload_0         
	//  677 1352:aload           10
	//  678 1354:invokevirtual   #230 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  679 1357:putfield        #234 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  680 1360:aload_0         
	//  681 1361:invokevirtual   #237 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  682 1364:aload_1         
	//  683 1365:athrow          
	//* 684 1366:goto            220
_L2:
		flag = true;
	//  685 1369:iconst_1        
	//  686 1370:istore          8
		j = i;
	//  687 1372:iload_3         
	//  688 1373:istore          4
		  goto _L22
	//* 689 1375:goto            1260
	}

	DescriptorProtos$FileOptions(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #248 <Method void DescriptorProtos$FileOptions(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$FileOptions(Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #251 <Method void GeneratedMessageV3$ExtendableMessage(GeneratedMessageV3$ExtendableBuilder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #109 <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$FileOptions(Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #255 <Method void DescriptorProtos$FileOptions(GeneratedMessageV3$ExtendableBuilder)>
	//    3    5:return          
	}
}
