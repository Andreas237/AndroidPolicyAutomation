// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DescriptorProtos, ByteString, InvalidProtocolBufferException, 
//			UnknownFieldSet, CodedInputStream, Parser, MessageLite, 
//			CodedOutputStream, Internal, ExtensionRegistryLite, Message, 
//			RepeatedFieldBuilderV3, AbstractParser, MessageOrBuilder

public static final class DescriptorProtos$UninterpretedOption extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.UninterpretedOptionOrBuilder
	{

		private void ensureNameIsMutable()
		{
			if((bitField0_ & 1) != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #70  <Field int bitField0_>
		//*   2    4:iconst_1        
		//*   3    5:iand            
		//*   4    6:iconst_1        
		//*   5    7:icmpeq          35
			{
				name_ = ((List) (new ArrayList(((java.util.Collection) (name_)))));
		//    6   10:aload_0         
		//    7   11:new             #72  <Class ArrayList>
		//    8   14:dup             
		//    9   15:aload_0         
		//   10   16:getfield        #43  <Field List name_>
		//   11   19:invokespecial   #75  <Method void ArrayList(java.util.Collection)>
		//   12   22:putfield        #43  <Field List name_>
				bitField0_ = bitField0_ | 1;
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:getfield        #70  <Field int bitField0_>
		//   16   30:iconst_1        
		//   17   31:ior             
		//   18   32:putfield        #70  <Field int bitField0_>
			}
		//   19   35:return          
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$24600();
		//    0    0:invokestatic    #80  <Method Descriptors$Descriptor DescriptorProtos.access$24600()>
		//    1    3:areturn         
		}

		private RepeatedFieldBuilderV3 getNameFieldBuilder()
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       55
			{
				List list = name_;
		//    3    7:aload_0         
		//    4    8:getfield        #43  <Field List name_>
		//    5   11:astore_2        
				boolean flag;
				if((bitField0_ & 1) == 1)
		//*   6   12:aload_0         
		//*   7   13:getfield        #70  <Field int bitField0_>
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
				nameBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//   17   29:aload_0         
		//   18   30:new             #86  <Class RepeatedFieldBuilderV3>
		//   19   33:dup             
		//   20   34:aload_2         
		//   21   35:iload_1         
		//   22   36:aload_0         
		//   23   37:invokevirtual   #90  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   24   40:aload_0         
		//   25   41:invokevirtual   #94  <Method boolean isClean()>
		//   26   44:invokespecial   #97  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
		//   27   47:putfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
				name_ = null;
		//   28   50:aload_0         
		//   29   51:aconst_null     
		//   30   52:putfield        #43  <Field List name_>
			}
			return nameBuilder_;
		//   31   55:aload_0         
		//   32   56:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   33   59:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #105 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            11
				getNameFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #107 <Method RepeatedFieldBuilderV3 getNameFieldBuilder()>
		//    4   10:pop             
		//    5   11:return          
		}

		public Builder addAllName(Iterable iterable)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureNameIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #111 <Method void ensureNameIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, name_);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #43  <Field List name_>
		//    8   16:invokestatic    #117 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
				onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   11   23:aload_0         
		//   12   24:areturn         
			} else
			{
				nameBuilder_.addAllMessages(iterable);
		//   13   25:aload_0         
		//   14   26:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #124 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   17   33:pop             
				return this;
		//   18   34:aload_0         
		//   19   35:areturn         
			}
		}

		public Builder addName(int i, NamePart.Builder builder)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureNameIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #111 <Method void ensureNameIsMutable()>
				name_.add(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #43  <Field List name_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart$Builder.build()>
		//   10   20:invokeinterface #139 <Method void List.add(int, Object)>
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				nameBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   17   35:iload_1         
		//   18   36:aload_2         
		//   19   37:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart$Builder.build()>
		//   20   40:invokevirtual   #143 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   21   43:pop             
				return this;
		//   22   44:aload_0         
		//   23   45:areturn         
			}
		}

		public Builder addName(int i, NamePart namepart)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(namepart == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #146 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #147 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureNameIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #111 <Method void ensureNameIsMutable()>
					name_.add(i, ((Object) (namepart)));
		//   11   23:aload_0         
		//   12   24:getfield        #43  <Field List name_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #139 <Method void List.add(int, Object)>
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #120 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				nameBuilder_.addMessage(i, ((AbstractMessage) (namepart)));
		//   20   40:aload_0         
		//   21   41:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   22   44:iload_1         
		//   23   45:aload_2         
		//   24   46:invokevirtual   #143 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   25   49:pop             
				return this;
		//   26   50:aload_0         
		//   27   51:areturn         
			}
		}

		public Builder addName(NamePart.Builder builder)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureNameIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #111 <Method void ensureNameIsMutable()>
				name_.add(((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #43  <Field List name_>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart$Builder.build()>
		//    9   19:invokeinterface #151 <Method boolean List.add(Object)>
		//   10   24:pop             
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				nameBuilder_.addMessage(((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart$Builder.build()>
		//   19   39:invokevirtual   #154 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   20   42:pop             
				return this;
		//   21   43:aload_0         
		//   22   44:areturn         
			}
		}

		public Builder addName(NamePart namepart)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(namepart == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #146 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #147 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureNameIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #111 <Method void ensureNameIsMutable()>
					name_.add(((Object) (namepart)));
		//   11   23:aload_0         
		//   12   24:getfield        #43  <Field List name_>
		//   13   27:aload_1         
		//   14   28:invokeinterface #151 <Method boolean List.add(Object)>
		//   15   33:pop             
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #120 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				nameBuilder_.addMessage(((AbstractMessage) (namepart)));
		//   20   40:aload_0         
		//   21   41:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   22   44:aload_1         
		//   23   45:invokevirtual   #154 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   24   48:pop             
				return this;
		//   25   49:aload_0         
		//   26   50:areturn         
			}
		}

		public NamePart.Builder addNameBuilder()
		{
			return (NamePart.Builder)getNameFieldBuilder().addBuilder(((AbstractMessage) (NamePart.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #107 <Method RepeatedFieldBuilderV3 getNameFieldBuilder()>
		//    2    4:invokestatic    #162 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
		//    3    7:invokevirtual   #166 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #129 <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    5   13:areturn         
		}

		public NamePart.Builder addNameBuilder(int i)
		{
			return (NamePart.Builder)getNameFieldBuilder().addBuilder(i, ((AbstractMessage) (NamePart.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #107 <Method RepeatedFieldBuilderV3 getNameFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #162 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
		//    4    8:invokevirtual   #170 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #129 <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    6   14:areturn         
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #175 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #177 <Method DescriptorProtos$UninterpretedOption$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #177 <Method DescriptorProtos$UninterpretedOption$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public DescriptorProtos.UninterpretedOption build()
		{
			DescriptorProtos.UninterpretedOption uninterpretedoption = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #182 <Method DescriptorProtos$UninterpretedOption buildPartial()>
		//    2    4:astore_1        
			if(!uninterpretedoption.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #185 <Method boolean DescriptorProtos$UninterpretedOption.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (uninterpretedoption)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #189 <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return uninterpretedoption;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.UninterpretedOption buildPartial()
		{
			DescriptorProtos.UninterpretedOption uninterpretedoption = new DescriptorProtos.UninterpretedOption(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #9   <Class DescriptorProtos$UninterpretedOption>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #196 <Method void DescriptorProtos$UninterpretedOption(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #70  <Field int bitField0_>
		//    8   15:istore_3        
			int j = 0;
		//    9   16:iconst_0        
		//   10   17:istore_2        
			if(nameBuilder_ == null)
		//*  11   18:aload_0         
		//*  12   19:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*  13   22:ifnonnull       70
			{
				if((bitField0_ & 1) == 1)
		//*  14   25:aload_0         
		//*  15   26:getfield        #70  <Field int bitField0_>
		//*  16   29:iconst_1        
		//*  17   30:iand            
		//*  18   31:iconst_1        
		//*  19   32:icmpne          57
				{
					name_ = Collections.unmodifiableList(name_);
		//   20   35:aload_0         
		//   21   36:aload_0         
		//   22   37:getfield        #43  <Field List name_>
		//   23   40:invokestatic    #200 <Method List Collections.unmodifiableList(List)>
		//   24   43:putfield        #43  <Field List name_>
					bitField0_ = bitField0_ & -2;
		//   25   46:aload_0         
		//   26   47:aload_0         
		//   27   48:getfield        #70  <Field int bitField0_>
		//   28   51:bipush          -2
		//   29   53:iand            
		//   30   54:putfield        #70  <Field int bitField0_>
				}
				uninterpretedoption.name_ = name_;
		//   31   57:aload           4
		//   32   59:aload_0         
		//   33   60:getfield        #43  <Field List name_>
		//   34   63:invokestatic    #204 <Method List DescriptorProtos$UninterpretedOption.access$26002(DescriptorProtos$UninterpretedOption, List)>
		//   35   66:pop             
			} else
		//*  36   67:goto            83
			{
				uninterpretedoption.name_ = nameBuilder_.build();
		//   37   70:aload           4
		//   38   72:aload_0         
		//   39   73:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   40   76:invokevirtual   #206 <Method List RepeatedFieldBuilderV3.build()>
		//   41   79:invokestatic    #204 <Method List DescriptorProtos$UninterpretedOption.access$26002(DescriptorProtos$UninterpretedOption, List)>
		//   42   82:pop             
			}
			if((k & 2) == 2)
		//*  43   83:iload_3         
		//*  44   84:iconst_2        
		//*  45   85:iand            
		//*  46   86:iconst_2        
		//*  47   87:icmpne          92
				j = 1;
		//   48   90:iconst_1        
		//   49   91:istore_2        
			uninterpretedoption.identifierValue_ = identifierValue_;
		//   50   92:aload           4
		//   51   94:aload_0         
		//   52   95:getfield        #47  <Field Object identifierValue_>
		//   53   98:invokestatic    #210 <Method Object DescriptorProtos$UninterpretedOption.access$26102(DescriptorProtos$UninterpretedOption, Object)>
		//   54  101:pop             
			int i = j;
		//   55  102:iload_2         
		//   56  103:istore_1        
			if((k & 4) == 4)
		//*  57  104:iload_3         
		//*  58  105:iconst_4        
		//*  59  106:iand            
		//*  60  107:iconst_4        
		//*  61  108:icmpne          115
				i = j | 2;
		//   62  111:iload_2         
		//   63  112:iconst_2        
		//   64  113:ior             
		//   65  114:istore_1        
			uninterpretedoption.positiveIntValue_ = positiveIntValue_;
		//   66  115:aload           4
		//   67  117:aload_0         
		//   68  118:getfield        #212 <Field long positiveIntValue_>
		//   69  121:invokestatic    #216 <Method long DescriptorProtos$UninterpretedOption.access$26202(DescriptorProtos$UninterpretedOption, long)>
		//   70  124:pop2            
			j = i;
		//   71  125:iload_1         
		//   72  126:istore_2        
			if((k & 8) == 8)
		//*  73  127:iload_3         
		//*  74  128:bipush          8
		//*  75  130:iand            
		//*  76  131:bipush          8
		//*  77  133:icmpne          140
				j = i | 4;
		//   78  136:iload_1         
		//   79  137:iconst_4        
		//   80  138:ior             
		//   81  139:istore_2        
			uninterpretedoption.negativeIntValue_ = negativeIntValue_;
		//   82  140:aload           4
		//   83  142:aload_0         
		//   84  143:getfield        #218 <Field long negativeIntValue_>
		//   85  146:invokestatic    #221 <Method long DescriptorProtos$UninterpretedOption.access$26302(DescriptorProtos$UninterpretedOption, long)>
		//   86  149:pop2            
			i = j;
		//   87  150:iload_2         
		//   88  151:istore_1        
			if((k & 0x10) == 16)
		//*  89  152:iload_3         
		//*  90  153:bipush          16
		//*  91  155:iand            
		//*  92  156:bipush          16
		//*  93  158:icmpne          166
				i = j | 8;
		//   94  161:iload_2         
		//   95  162:bipush          8
		//   96  164:ior             
		//   97  165:istore_1        
			uninterpretedoption.doubleValue_ = doubleValue_;
		//   98  166:aload           4
		//   99  168:aload_0         
		//  100  169:getfield        #223 <Field double doubleValue_>
		//  101  172:invokestatic    #227 <Method double DescriptorProtos$UninterpretedOption.access$26402(DescriptorProtos$UninterpretedOption, double)>
		//  102  175:pop2            
			j = i;
		//  103  176:iload_1         
		//  104  177:istore_2        
			if((k & 0x20) == 32)
		//* 105  178:iload_3         
		//* 106  179:bipush          32
		//* 107  181:iand            
		//* 108  182:bipush          32
		//* 109  184:icmpne          192
				j = i | 0x10;
		//  110  187:iload_1         
		//  111  188:bipush          16
		//  112  190:ior             
		//  113  191:istore_2        
			uninterpretedoption.stringValue_ = stringValue_;
		//  114  192:aload           4
		//  115  194:aload_0         
		//  116  195:getfield        #54  <Field ByteString stringValue_>
		//  117  198:invokestatic    #231 <Method ByteString DescriptorProtos$UninterpretedOption.access$26502(DescriptorProtos$UninterpretedOption, ByteString)>
		//  118  201:pop             
			i = j;
		//  119  202:iload_2         
		//  120  203:istore_1        
			if((k & 0x40) == 64)
		//* 121  204:iload_3         
		//* 122  205:bipush          64
		//* 123  207:iand            
		//* 124  208:bipush          64
		//* 125  210:icmpne          218
				i = j | 0x20;
		//  126  213:iload_2         
		//  127  214:bipush          32
		//  128  216:ior             
		//  129  217:istore_1        
			uninterpretedoption.aggregateValue_ = aggregateValue_;
		//  130  218:aload           4
		//  131  220:aload_0         
		//  132  221:getfield        #56  <Field Object aggregateValue_>
		//  133  224:invokestatic    #234 <Method Object DescriptorProtos$UninterpretedOption.access$26602(DescriptorProtos$UninterpretedOption, Object)>
		//  134  227:pop             
			uninterpretedoption.bitField0_ = i;
		//  135  228:aload           4
		//  136  230:iload_1         
		//  137  231:invokestatic    #238 <Method int DescriptorProtos$UninterpretedOption.access$26702(DescriptorProtos$UninterpretedOption, int)>
		//  138  234:pop             
			onBuilt();
		//  139  235:aload_0         
		//  140  236:invokevirtual   #241 <Method void onBuilt()>
			return uninterpretedoption;
		//  141  239:aload           4
		//  142  241:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #182 <Method DescriptorProtos$UninterpretedOption buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #182 <Method DescriptorProtos$UninterpretedOption buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #246 <Method DescriptorProtos$UninterpretedOption$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #249 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			if(nameBuilder_ == null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   5    9:ifnonnull       33
			{
				name_ = Collections.emptyList();
		//    6   12:aload_0         
		//    7   13:invokestatic    #41  <Method List Collections.emptyList()>
		//    8   16:putfield        #43  <Field List name_>
				bitField0_ = bitField0_ & -2;
		//    9   19:aload_0         
		//   10   20:aload_0         
		//   11   21:getfield        #70  <Field int bitField0_>
		//   12   24:bipush          -2
		//   13   26:iand            
		//   14   27:putfield        #70  <Field int bitField0_>
			} else
		//*  15   30:goto            40
			{
				nameBuilder_.clear();
		//   16   33:aload_0         
		//   17   34:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   18   37:invokevirtual   #251 <Method void RepeatedFieldBuilderV3.clear()>
			}
			identifierValue_ = "";
		//   19   40:aload_0         
		//   20   41:ldc1            #45  <String "">
		//   21   43:putfield        #47  <Field Object identifierValue_>
			bitField0_ = bitField0_ & -3;
		//   22   46:aload_0         
		//   23   47:aload_0         
		//   24   48:getfield        #70  <Field int bitField0_>
		//   25   51:bipush          -3
		//   26   53:iand            
		//   27   54:putfield        #70  <Field int bitField0_>
			positiveIntValue_ = 0L;
		//   28   57:aload_0         
		//   29   58:lconst_0        
		//   30   59:putfield        #212 <Field long positiveIntValue_>
			bitField0_ = bitField0_ & -5;
		//   31   62:aload_0         
		//   32   63:aload_0         
		//   33   64:getfield        #70  <Field int bitField0_>
		//   34   67:bipush          -5
		//   35   69:iand            
		//   36   70:putfield        #70  <Field int bitField0_>
			negativeIntValue_ = 0L;
		//   37   73:aload_0         
		//   38   74:lconst_0        
		//   39   75:putfield        #218 <Field long negativeIntValue_>
			bitField0_ = bitField0_ & -9;
		//   40   78:aload_0         
		//   41   79:aload_0         
		//   42   80:getfield        #70  <Field int bitField0_>
		//   43   83:bipush          -9
		//   44   85:iand            
		//   45   86:putfield        #70  <Field int bitField0_>
			doubleValue_ = 0.0D;
		//   46   89:aload_0         
		//   47   90:dconst_0        
		//   48   91:putfield        #223 <Field double doubleValue_>
			bitField0_ = bitField0_ & 0xffffffef;
		//   49   94:aload_0         
		//   50   95:aload_0         
		//   51   96:getfield        #70  <Field int bitField0_>
		//   52   99:bipush          -17
		//   53  101:iand            
		//   54  102:putfield        #70  <Field int bitField0_>
			stringValue_ = ByteString.EMPTY;
		//   55  105:aload_0         
		//   56  106:getstatic       #52  <Field ByteString ByteString.EMPTY>
		//   57  109:putfield        #54  <Field ByteString stringValue_>
			bitField0_ = bitField0_ & 0xffffffdf;
		//   58  112:aload_0         
		//   59  113:aload_0         
		//   60  114:getfield        #70  <Field int bitField0_>
		//   61  117:bipush          -33
		//   62  119:iand            
		//   63  120:putfield        #70  <Field int bitField0_>
			aggregateValue_ = "";
		//   64  123:aload_0         
		//   65  124:ldc1            #45  <String "">
		//   66  126:putfield        #56  <Field Object aggregateValue_>
			bitField0_ = bitField0_ & 0xffffffbf;
		//   67  129:aload_0         
		//   68  130:aload_0         
		//   69  131:getfield        #70  <Field int bitField0_>
		//   70  134:bipush          -65
		//   71  136:iand            
		//   72  137:putfield        #70  <Field int bitField0_>
			return this;
		//   73  140:aload_0         
		//   74  141:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #246 <Method DescriptorProtos$UninterpretedOption$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #246 <Method DescriptorProtos$UninterpretedOption$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #246 <Method DescriptorProtos$UninterpretedOption$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearAggregateValue()
		{
			bitField0_ = bitField0_ & 0xffffffbf;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field int bitField0_>
		//    3    5:bipush          -65
		//    4    7:iand            
		//    5    8:putfield        #70  <Field int bitField0_>
			aggregateValue_ = ((Object) (DescriptorProtos.UninterpretedOption.getDefaultInstance().getAggregateValue()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #256 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    8   15:invokevirtual   #260 <Method String DescriptorProtos$UninterpretedOption.getAggregateValue()>
		//    9   18:putfield        #56  <Field Object aggregateValue_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public Builder clearDoubleValue()
		{
			bitField0_ = bitField0_ & 0xffffffef;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field int bitField0_>
		//    3    5:bipush          -17
		//    4    7:iand            
		//    5    8:putfield        #70  <Field int bitField0_>
			doubleValue_ = 0.0D;
		//    6   11:aload_0         
		//    7   12:dconst_0        
		//    8   13:putfield        #223 <Field double doubleValue_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #266 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #268 <Method DescriptorProtos$UninterpretedOption$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #268 <Method DescriptorProtos$UninterpretedOption$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearIdentifierValue()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #70  <Field int bitField0_>
			identifierValue_ = ((Object) (DescriptorProtos.UninterpretedOption.getDefaultInstance().getIdentifierValue()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #256 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    8   15:invokevirtual   #273 <Method String DescriptorProtos$UninterpretedOption.getIdentifierValue()>
		//    9   18:putfield        #47  <Field Object identifierValue_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public Builder clearName()
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       31
			{
				name_ = Collections.emptyList();
		//    3    7:aload_0         
		//    4    8:invokestatic    #41  <Method List Collections.emptyList()>
		//    5   11:putfield        #43  <Field List name_>
				bitField0_ = bitField0_ & -2;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #70  <Field int bitField0_>
		//    9   19:bipush          -2
		//   10   21:iand            
		//   11   22:putfield        #70  <Field int bitField0_>
				onChanged();
		//   12   25:aload_0         
		//   13   26:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   14   29:aload_0         
		//   15   30:areturn         
			} else
			{
				nameBuilder_.clear();
		//   16   31:aload_0         
		//   17   32:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   18   35:invokevirtual   #251 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   19   38:aload_0         
		//   20   39:areturn         
			}
		}

		public Builder clearNegativeIntValue()
		{
			bitField0_ = bitField0_ & -9;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field int bitField0_>
		//    3    5:bipush          -9
		//    4    7:iand            
		//    5    8:putfield        #70  <Field int bitField0_>
			negativeIntValue_ = 0L;
		//    6   11:aload_0         
		//    7   12:lconst_0        
		//    8   13:putfield        #218 <Field long negativeIntValue_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #280 <Method DescriptorProtos$UninterpretedOption$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #283 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #280 <Method DescriptorProtos$UninterpretedOption$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #280 <Method DescriptorProtos$UninterpretedOption$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearPositiveIntValue()
		{
			bitField0_ = bitField0_ & -5;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field int bitField0_>
		//    3    5:bipush          -5
		//    4    7:iand            
		//    5    8:putfield        #70  <Field int bitField0_>
			positiveIntValue_ = 0L;
		//    6   11:aload_0         
		//    7   12:lconst_0        
		//    8   13:putfield        #212 <Field long positiveIntValue_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder clearStringValue()
		{
			bitField0_ = bitField0_ & 0xffffffdf;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field int bitField0_>
		//    3    5:bipush          -33
		//    4    7:iand            
		//    5    8:putfield        #70  <Field int bitField0_>
			stringValue_ = DescriptorProtos.UninterpretedOption.getDefaultInstance().getStringValue();
		//    6   11:aload_0         
		//    7   12:invokestatic    #256 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    8   15:invokevirtual   #290 <Method ByteString DescriptorProtos$UninterpretedOption.getStringValue()>
		//    9   18:putfield        #54  <Field ByteString stringValue_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #293 <Method DescriptorProtos$UninterpretedOption$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #293 <Method DescriptorProtos$UninterpretedOption$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #296 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #293 <Method DescriptorProtos$UninterpretedOption$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #293 <Method DescriptorProtos$UninterpretedOption$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #293 <Method DescriptorProtos$UninterpretedOption$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #293 <Method DescriptorProtos$UninterpretedOption$Builder clone()>
		//    2    4:areturn         
		}

		public String getAggregateValue()
		{
			Object obj = aggregateValue_;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object aggregateValue_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #302 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #49  <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #305 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #308 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					aggregateValue_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #56  <Field Object aggregateValue_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #302 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getAggregateValueBytes()
		{
			Object obj = aggregateValue_;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object aggregateValue_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #302 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #302 <Class String>
		//    8   16:invokestatic    #313 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				aggregateValue_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #56  <Field Object aggregateValue_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #49  <Class ByteString>
		//   17   31:areturn         
			}
		}

		public DescriptorProtos.UninterpretedOption getDefaultInstanceForType()
		{
			return DescriptorProtos.UninterpretedOption.getDefaultInstance();
		//    0    0:invokestatic    #256 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #316 <Method DescriptorProtos$UninterpretedOption getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #316 <Method DescriptorProtos$UninterpretedOption getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$24600();
		//    0    0:invokestatic    #80  <Method Descriptors$Descriptor DescriptorProtos.access$24600()>
		//    1    3:areturn         
		}

		public double getDoubleValue()
		{
			return doubleValue_;
		//    0    0:aload_0         
		//    1    1:getfield        #223 <Field double doubleValue_>
		//    2    4:dreturn         
		}

		public String getIdentifierValue()
		{
			Object obj = identifierValue_;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Object identifierValue_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #302 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #49  <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #305 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #308 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					identifierValue_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #47  <Field Object identifierValue_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #302 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getIdentifierValueBytes()
		{
			Object obj = identifierValue_;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Object identifierValue_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #302 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #302 <Class String>
		//    8   16:invokestatic    #313 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				identifierValue_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #47  <Field Object identifierValue_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #49  <Class ByteString>
		//   17   31:areturn         
			}
		}

		public NamePart getName(int i)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       21
				return (NamePart)name_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #43  <Field List name_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #326 <Method Object List.get(int)>
		//    7   17:checkcast       #159 <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    8   20:areturn         
			else
				return (NamePart)nameBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #330 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #159 <Class DescriptorProtos$UninterpretedOption$NamePart>
		//   14   32:areturn         
		}

		public NamePart.Builder getNameBuilder(int i)
		{
			return (NamePart.Builder)getNameFieldBuilder().getBuilder(i);
		//    0    0:aload_0         
		//    1    1:invokespecial   #107 <Method RepeatedFieldBuilderV3 getNameFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #335 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
		//    4    8:checkcast       #129 <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    5   11:areturn         
		}

		public List getNameBuilderList()
		{
			return getNameFieldBuilder().getBuilderList();
		//    0    0:aload_0         
		//    1    1:invokespecial   #107 <Method RepeatedFieldBuilderV3 getNameFieldBuilder()>
		//    2    4:invokevirtual   #339 <Method List RepeatedFieldBuilderV3.getBuilderList()>
		//    3    7:areturn         
		}

		public int getNameCount()
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       17
				return name_.size();
		//    3    7:aload_0         
		//    4    8:getfield        #43  <Field List name_>
		//    5   11:invokeinterface #345 <Method int List.size()>
		//    6   16:ireturn         
			else
				return nameBuilder_.getCount();
		//    7   17:aload_0         
		//    8   18:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//    9   21:invokevirtual   #348 <Method int RepeatedFieldBuilderV3.getCount()>
		//   10   24:ireturn         
		}

		public List getNameList()
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       15
				return Collections.unmodifiableList(name_);
		//    3    7:aload_0         
		//    4    8:getfield        #43  <Field List name_>
		//    5   11:invokestatic    #200 <Method List Collections.unmodifiableList(List)>
		//    6   14:areturn         
			else
				return nameBuilder_.getMessageList();
		//    7   15:aload_0         
		//    8   16:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//    9   19:invokevirtual   #352 <Method List RepeatedFieldBuilderV3.getMessageList()>
		//   10   22:areturn         
		}

		public NamePartOrBuilder getNameOrBuilder(int i)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       21
				return (NamePartOrBuilder)name_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #43  <Field List name_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #326 <Method Object List.get(int)>
		//    7   17:checkcast       #357 <Class DescriptorProtos$UninterpretedOption$NamePartOrBuilder>
		//    8   20:areturn         
			else
				return (NamePartOrBuilder)nameBuilder_.getMessageOrBuilder(i);
		//    9   21:aload_0         
		//   10   22:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #361 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
		//   13   29:checkcast       #357 <Class DescriptorProtos$UninterpretedOption$NamePartOrBuilder>
		//   14   32:areturn         
		}

		public List getNameOrBuilderList()
		{
			if(nameBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnull          15
				return nameBuilder_.getMessageOrBuilderList();
		//    3    7:aload_0         
		//    4    8:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//    5   11:invokevirtual   #365 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
		//    6   14:areturn         
			else
				return Collections.unmodifiableList(name_);
		//    7   15:aload_0         
		//    8   16:getfield        #43  <Field List name_>
		//    9   19:invokestatic    #200 <Method List Collections.unmodifiableList(List)>
		//   10   22:areturn         
		}

		public long getNegativeIntValue()
		{
			return negativeIntValue_;
		//    0    0:aload_0         
		//    1    1:getfield        #218 <Field long negativeIntValue_>
		//    2    4:lreturn         
		}

		public long getPositiveIntValue()
		{
			return positiveIntValue_;
		//    0    0:aload_0         
		//    1    1:getfield        #212 <Field long positiveIntValue_>
		//    2    4:lreturn         
		}

		public ByteString getStringValue()
		{
			return stringValue_;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field ByteString stringValue_>
		//    2    4:areturn         
		}

		public boolean hasAggregateValue()
		{
			return (bitField0_ & 0x40) == 64;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field int bitField0_>
		//    2    4:bipush          64
		//    3    6:iand            
		//    4    7:bipush          64
		//    5    9:icmpne          14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public boolean hasDoubleValue()
		{
			return (bitField0_ & 0x10) == 16;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field int bitField0_>
		//    2    4:bipush          16
		//    3    6:iand            
		//    4    7:bipush          16
		//    5    9:icmpne          14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public boolean hasIdentifierValue()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasNegativeIntValue()
		{
			return (bitField0_ & 8) == 8;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field int bitField0_>
		//    2    4:bipush          8
		//    3    6:iand            
		//    4    7:bipush          8
		//    5    9:icmpne          14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public boolean hasPositiveIntValue()
		{
			return (bitField0_ & 4) == 4;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field int bitField0_>
		//    2    4:iconst_4        
		//    3    5:iand            
		//    4    6:iconst_4        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasStringValue()
		{
			return (bitField0_ & 0x20) == 32;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field int bitField0_>
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
			return DescriptorProtos.access$24700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$UninterpretedOption, com/google/protobuf/DescriptorProtos$UninterpretedOption$Builder);
		//    0    0:invokestatic    #380 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$24700()>
		//    1    3:ldc1            #9   <Class DescriptorProtos$UninterpretedOption>
		//    2    5:ldc1            #2   <Class DescriptorProtos$UninterpretedOption$Builder>
		//    3    7:invokevirtual   #386 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			for(int i = 0; i < getNameCount(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_1        
		//*   2    2:iload_1         
		//*   3    3:aload_0         
		//*   4    4:invokevirtual   #388 <Method int getNameCount()>
		//*   5    7:icmpge          30
				if(!getName(i).isInitialized())
		//*   6   10:aload_0         
		//*   7   11:iload_1         
		//*   8   12:invokevirtual   #390 <Method DescriptorProtos$UninterpretedOption$NamePart getName(int)>
		//*   9   15:invokevirtual   #391 <Method boolean DescriptorProtos$UninterpretedOption$NamePart.isInitialized()>
		//*  10   18:ifne            23
					return false;
		//   11   21:iconst_0        
		//   12   22:ireturn         

		//   13   23:iload_1         
		//   14   24:iconst_1        
		//   15   25:iadd            
		//   16   26:istore_1        
		//*  17   27:goto            2
			return true;
		//   18   30:iconst_1        
		//   19   31:ireturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #398 <Method DescriptorProtos$UninterpretedOption$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #402 <Method DescriptorProtos$UninterpretedOption$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #398 <Method DescriptorProtos$UninterpretedOption$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.UninterpretedOption)DescriptorProtos.UninterpretedOption.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #409 <Field Parser DescriptorProtos$UninterpretedOption.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #415 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class DescriptorProtos$UninterpretedOption>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.UninterpretedOption) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #418 <Method DescriptorProtos$UninterpretedOption$Builder mergeFrom(DescriptorProtos$UninterpretedOption)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #421 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class DescriptorProtos$UninterpretedOption>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #425 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #418 <Method DescriptorProtos$UninterpretedOption$Builder mergeFrom(DescriptorProtos$UninterpretedOption)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.UninterpretedOption)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.UninterpretedOption) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.UninterpretedOption uninterpretedoption)
		{
			if(uninterpretedoption == DescriptorProtos.UninterpretedOption.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #256 <Method DescriptorProtos$UninterpretedOption DescriptorProtos$UninterpretedOption.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(nameBuilder_ == null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   7   13:ifnonnull       87
			{
				if(!uninterpretedoption.name_.isEmpty())
		//*   8   16:aload_1         
		//*   9   17:invokestatic    #429 <Method List DescriptorProtos$UninterpretedOption.access$26000(DescriptorProtos$UninterpretedOption)>
		//*  10   20:invokeinterface #432 <Method boolean List.isEmpty()>
		//*  11   25:ifne            176
				{
					if(name_.isEmpty())
		//*  12   28:aload_0         
		//*  13   29:getfield        #43  <Field List name_>
		//*  14   32:invokeinterface #432 <Method boolean List.isEmpty()>
		//*  15   37:ifeq            62
					{
						name_ = uninterpretedoption.name_;
		//   16   40:aload_0         
		//   17   41:aload_1         
		//   18   42:invokestatic    #429 <Method List DescriptorProtos$UninterpretedOption.access$26000(DescriptorProtos$UninterpretedOption)>
		//   19   45:putfield        #43  <Field List name_>
						bitField0_ = bitField0_ & -2;
		//   20   48:aload_0         
		//   21   49:aload_0         
		//   22   50:getfield        #70  <Field int bitField0_>
		//   23   53:bipush          -2
		//   24   55:iand            
		//   25   56:putfield        #70  <Field int bitField0_>
					} else
		//*  26   59:goto            80
					{
						ensureNameIsMutable();
		//   27   62:aload_0         
		//   28   63:invokespecial   #111 <Method void ensureNameIsMutable()>
						name_.addAll(((java.util.Collection) (uninterpretedoption.name_)));
		//   29   66:aload_0         
		//   30   67:getfield        #43  <Field List name_>
		//   31   70:aload_1         
		//   32   71:invokestatic    #429 <Method List DescriptorProtos$UninterpretedOption.access$26000(DescriptorProtos$UninterpretedOption)>
		//   33   74:invokeinterface #435 <Method boolean List.addAll(java.util.Collection)>
		//   34   79:pop             
					}
					onChanged();
		//   35   80:aload_0         
		//   36   81:invokevirtual   #120 <Method void onChanged()>
				}
			} else
		//*  37   84:goto            176
			if(!uninterpretedoption.name_.isEmpty())
		//*  38   87:aload_1         
		//*  39   88:invokestatic    #429 <Method List DescriptorProtos$UninterpretedOption.access$26000(DescriptorProtos$UninterpretedOption)>
		//*  40   91:invokeinterface #432 <Method boolean List.isEmpty()>
		//*  41   96:ifne            176
				if(nameBuilder_.isEmpty())
		//*  42   99:aload_0         
		//*  43  100:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*  44  103:invokevirtual   #436 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
		//*  45  106:ifeq            164
				{
					nameBuilder_.dispose();
		//   46  109:aload_0         
		//   47  110:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   48  113:invokevirtual   #439 <Method void RepeatedFieldBuilderV3.dispose()>
					nameBuilder_ = null;
		//   49  116:aload_0         
		//   50  117:aconst_null     
		//   51  118:putfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
					name_ = uninterpretedoption.name_;
		//   52  121:aload_0         
		//   53  122:aload_1         
		//   54  123:invokestatic    #429 <Method List DescriptorProtos$UninterpretedOption.access$26000(DescriptorProtos$UninterpretedOption)>
		//   55  126:putfield        #43  <Field List name_>
					bitField0_ = bitField0_ & -2;
		//   56  129:aload_0         
		//   57  130:aload_0         
		//   58  131:getfield        #70  <Field int bitField0_>
		//   59  134:bipush          -2
		//   60  136:iand            
		//   61  137:putfield        #70  <Field int bitField0_>
					RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
					if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*  62  140:getstatic       #105 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*  63  143:ifeq            154
						repeatedfieldbuilderv3 = getNameFieldBuilder();
		//   64  146:aload_0         
		//   65  147:invokespecial   #107 <Method RepeatedFieldBuilderV3 getNameFieldBuilder()>
		//   66  150:astore_2        
					else
		//*  67  151:goto            156
						repeatedfieldbuilderv3 = null;
		//   68  154:aconst_null     
		//   69  155:astore_2        
					nameBuilder_ = repeatedfieldbuilderv3;
		//   70  156:aload_0         
		//   71  157:aload_2         
		//   72  158:putfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
				} else
		//*  73  161:goto            176
				{
					nameBuilder_.addAllMessages(((Iterable) (uninterpretedoption.name_)));
		//   74  164:aload_0         
		//   75  165:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   76  168:aload_1         
		//   77  169:invokestatic    #429 <Method List DescriptorProtos$UninterpretedOption.access$26000(DescriptorProtos$UninterpretedOption)>
		//   78  172:invokevirtual   #124 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   79  175:pop             
				}
			if(uninterpretedoption.hasIdentifierValue())
		//*  80  176:aload_1         
		//*  81  177:invokevirtual   #441 <Method boolean DescriptorProtos$UninterpretedOption.hasIdentifierValue()>
		//*  82  180:ifeq            205
			{
				bitField0_ = bitField0_ | 2;
		//   83  183:aload_0         
		//   84  184:aload_0         
		//   85  185:getfield        #70  <Field int bitField0_>
		//   86  188:iconst_2        
		//   87  189:ior             
		//   88  190:putfield        #70  <Field int bitField0_>
				identifierValue_ = uninterpretedoption.identifierValue_;
		//   89  193:aload_0         
		//   90  194:aload_1         
		//   91  195:invokestatic    #445 <Method Object DescriptorProtos$UninterpretedOption.access$26100(DescriptorProtos$UninterpretedOption)>
		//   92  198:putfield        #47  <Field Object identifierValue_>
				onChanged();
		//   93  201:aload_0         
		//   94  202:invokevirtual   #120 <Method void onChanged()>
			}
			if(uninterpretedoption.hasPositiveIntValue())
		//*  95  205:aload_1         
		//*  96  206:invokevirtual   #447 <Method boolean DescriptorProtos$UninterpretedOption.hasPositiveIntValue()>
		//*  97  209:ifeq            221
				setPositiveIntValue(uninterpretedoption.getPositiveIntValue());
		//   98  212:aload_0         
		//   99  213:aload_1         
		//  100  214:invokevirtual   #449 <Method long DescriptorProtos$UninterpretedOption.getPositiveIntValue()>
		//  101  217:invokevirtual   #453 <Method DescriptorProtos$UninterpretedOption$Builder setPositiveIntValue(long)>
		//  102  220:pop             
			if(uninterpretedoption.hasNegativeIntValue())
		//* 103  221:aload_1         
		//* 104  222:invokevirtual   #455 <Method boolean DescriptorProtos$UninterpretedOption.hasNegativeIntValue()>
		//* 105  225:ifeq            237
				setNegativeIntValue(uninterpretedoption.getNegativeIntValue());
		//  106  228:aload_0         
		//  107  229:aload_1         
		//  108  230:invokevirtual   #457 <Method long DescriptorProtos$UninterpretedOption.getNegativeIntValue()>
		//  109  233:invokevirtual   #460 <Method DescriptorProtos$UninterpretedOption$Builder setNegativeIntValue(long)>
		//  110  236:pop             
			if(uninterpretedoption.hasDoubleValue())
		//* 111  237:aload_1         
		//* 112  238:invokevirtual   #462 <Method boolean DescriptorProtos$UninterpretedOption.hasDoubleValue()>
		//* 113  241:ifeq            253
				setDoubleValue(uninterpretedoption.getDoubleValue());
		//  114  244:aload_0         
		//  115  245:aload_1         
		//  116  246:invokevirtual   #464 <Method double DescriptorProtos$UninterpretedOption.getDoubleValue()>
		//  117  249:invokevirtual   #468 <Method DescriptorProtos$UninterpretedOption$Builder setDoubleValue(double)>
		//  118  252:pop             
			if(uninterpretedoption.hasStringValue())
		//* 119  253:aload_1         
		//* 120  254:invokevirtual   #470 <Method boolean DescriptorProtos$UninterpretedOption.hasStringValue()>
		//* 121  257:ifeq            269
				setStringValue(uninterpretedoption.getStringValue());
		//  122  260:aload_0         
		//  123  261:aload_1         
		//  124  262:invokevirtual   #290 <Method ByteString DescriptorProtos$UninterpretedOption.getStringValue()>
		//  125  265:invokevirtual   #474 <Method DescriptorProtos$UninterpretedOption$Builder setStringValue(ByteString)>
		//  126  268:pop             
			if(uninterpretedoption.hasAggregateValue())
		//* 127  269:aload_1         
		//* 128  270:invokevirtual   #476 <Method boolean DescriptorProtos$UninterpretedOption.hasAggregateValue()>
		//* 129  273:ifeq            299
			{
				bitField0_ = bitField0_ | 0x40;
		//  130  276:aload_0         
		//  131  277:aload_0         
		//  132  278:getfield        #70  <Field int bitField0_>
		//  133  281:bipush          64
		//  134  283:ior             
		//  135  284:putfield        #70  <Field int bitField0_>
				aggregateValue_ = uninterpretedoption.aggregateValue_;
		//  136  287:aload_0         
		//  137  288:aload_1         
		//  138  289:invokestatic    #479 <Method Object DescriptorProtos$UninterpretedOption.access$26600(DescriptorProtos$UninterpretedOption)>
		//  139  292:putfield        #56  <Field Object aggregateValue_>
				onChanged();
		//  140  295:aload_0         
		//  141  296:invokevirtual   #120 <Method void onChanged()>
			}
			mergeUnknownFields(uninterpretedoption.unknownFields);
		//  142  299:aload_0         
		//  143  300:aload_1         
		//  144  301:getfield        #483 <Field UnknownFieldSet DescriptorProtos$UninterpretedOption.unknownFields>
		//  145  304:invokevirtual   #487 <Method DescriptorProtos$UninterpretedOption$Builder mergeUnknownFields(UnknownFieldSet)>
		//  146  307:pop             
			onChanged();
		//  147  308:aload_0         
		//  148  309:invokevirtual   #120 <Method void onChanged()>
			return this;
		//  149  312:aload_0         
		//  150  313:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.UninterpretedOption)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class DescriptorProtos$UninterpretedOption>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.UninterpretedOption)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class DescriptorProtos$UninterpretedOption>
		//    6   12:invokevirtual   #418 <Method DescriptorProtos$UninterpretedOption$Builder mergeFrom(DescriptorProtos$UninterpretedOption)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #489 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #398 <Method DescriptorProtos$UninterpretedOption$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #402 <Method DescriptorProtos$UninterpretedOption$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #398 <Method DescriptorProtos$UninterpretedOption$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #487 <Method DescriptorProtos$UninterpretedOption$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #496 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #487 <Method DescriptorProtos$UninterpretedOption$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #487 <Method DescriptorProtos$UninterpretedOption$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder removeName(int i)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       28
			{
				ensureNameIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #111 <Method void ensureNameIsMutable()>
				name_.remove(i);
		//    5   11:aload_0         
		//    6   12:getfield        #43  <Field List name_>
		//    7   15:iload_1         
		//    8   16:invokeinterface #502 <Method Object List.remove(int)>
		//    9   21:pop             
				onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   12   26:aload_0         
		//   13   27:areturn         
			} else
			{
				nameBuilder_.remove(i);
		//   14   28:aload_0         
		//   15   29:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #505 <Method void RepeatedFieldBuilderV3.remove(int)>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Builder setAggregateValue(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #146 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #147 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x40;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #70  <Field int bitField0_>
		//    9   17:bipush          64
		//   10   19:ior             
		//   11   20:putfield        #70  <Field int bitField0_>
				aggregateValue_ = ((Object) (s));
		//   12   23:aload_0         
		//   13   24:aload_1         
		//   14   25:putfield        #56  <Field Object aggregateValue_>
				onChanged();
		//   15   28:aload_0         
		//   16   29:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   17   32:aload_0         
		//   18   33:areturn         
			}
		}

		public Builder setAggregateValueBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #146 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #147 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x40;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #70  <Field int bitField0_>
		//    9   17:bipush          64
		//   10   19:ior             
		//   11   20:putfield        #70  <Field int bitField0_>
				aggregateValue_ = ((Object) (bytestring));
		//   12   23:aload_0         
		//   13   24:aload_1         
		//   14   25:putfield        #56  <Field Object aggregateValue_>
				onChanged();
		//   15   28:aload_0         
		//   16   29:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   17   32:aload_0         
		//   18   33:areturn         
			}
		}

		public Builder setDoubleValue(double d)
		{
			bitField0_ = bitField0_ | 0x10;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field int bitField0_>
		//    3    5:bipush          16
		//    4    7:ior             
		//    5    8:putfield        #70  <Field int bitField0_>
			doubleValue_ = d;
		//    6   11:aload_0         
		//    7   12:dload_1         
		//    8   13:putfield        #223 <Field double doubleValue_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #511 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #513 <Method DescriptorProtos$UninterpretedOption$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #513 <Method DescriptorProtos$UninterpretedOption$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setIdentifierValue(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #146 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #147 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 2;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #70  <Field int bitField0_>
		//    9   17:iconst_2        
		//   10   18:ior             
		//   11   19:putfield        #70  <Field int bitField0_>
				identifierValue_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #47  <Field Object identifierValue_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setIdentifierValueBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #146 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #147 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 2;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #70  <Field int bitField0_>
		//    9   17:iconst_2        
		//   10   18:ior             
		//   11   19:putfield        #70  <Field int bitField0_>
				identifierValue_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #47  <Field Object identifierValue_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setName(int i, NamePart.Builder builder)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureNameIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #111 <Method void ensureNameIsMutable()>
				name_.set(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #43  <Field List name_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart$Builder.build()>
		//   10   20:invokeinterface #520 <Method Object List.set(int, Object)>
		//   11   25:pop             
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				nameBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
		//   16   32:aload_0         
		//   17   33:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   18   36:iload_1         
		//   19   37:aload_2         
		//   20   38:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart$Builder.build()>
		//   21   41:invokevirtual   #523 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   22   44:pop             
				return this;
		//   23   45:aload_0         
		//   24   46:areturn         
			}
		}

		public Builder setName(int i, NamePart namepart)
		{
			if(nameBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(namepart == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #146 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #147 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureNameIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #111 <Method void ensureNameIsMutable()>
					name_.set(i, ((Object) (namepart)));
		//   11   23:aload_0         
		//   12   24:getfield        #43  <Field List name_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #520 <Method Object List.set(int, Object)>
		//   16   34:pop             
					onChanged();
		//   17   35:aload_0         
		//   18   36:invokevirtual   #120 <Method void onChanged()>
					return this;
		//   19   39:aload_0         
		//   20   40:areturn         
				}
			} else
			{
				nameBuilder_.setMessage(i, ((AbstractMessage) (namepart)));
		//   21   41:aload_0         
		//   22   42:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
		//   23   45:iload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #523 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   26   50:pop             
				return this;
		//   27   51:aload_0         
		//   28   52:areturn         
			}
		}

		public Builder setNegativeIntValue(long l)
		{
			bitField0_ = bitField0_ | 8;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field int bitField0_>
		//    3    5:bipush          8
		//    4    7:ior             
		//    5    8:putfield        #70  <Field int bitField0_>
			negativeIntValue_ = l;
		//    6   11:aload_0         
		//    7   12:lload_1         
		//    8   13:putfield        #218 <Field long negativeIntValue_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder setPositiveIntValue(long l)
		{
			bitField0_ = bitField0_ | 4;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field int bitField0_>
		//    3    5:iconst_4        
		//    4    6:ior             
		//    5    7:putfield        #70  <Field int bitField0_>
			positiveIntValue_ = l;
		//    6   10:aload_0         
		//    7   11:lload_1         
		//    8   12:putfield        #212 <Field long positiveIntValue_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #120 <Method void onChanged()>
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
		//    4    4:invokespecial   #528 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #530 <Method DescriptorProtos$UninterpretedOption$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #530 <Method DescriptorProtos$UninterpretedOption$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setStringValue(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #146 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #147 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x20;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #70  <Field int bitField0_>
		//    9   17:bipush          32
		//   10   19:ior             
		//   11   20:putfield        #70  <Field int bitField0_>
				stringValue_ = bytestring;
		//   12   23:aload_0         
		//   13   24:aload_1         
		//   14   25:putfield        #54  <Field ByteString stringValue_>
				onChanged();
		//   15   28:aload_0         
		//   16   29:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   17   32:aload_0         
		//   18   33:areturn         
			}
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #534 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #536 <Method DescriptorProtos$UninterpretedOption$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #536 <Method DescriptorProtos$UninterpretedOption$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private Object aggregateValue_;
		private int bitField0_;
		private double doubleValue_;
		private Object identifierValue_;
		private RepeatedFieldBuilderV3 nameBuilder_;
		private List name_;
		private long negativeIntValue_;
		private long positiveIntValue_;
		private ByteString stringValue_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void GeneratedMessageV3$Builder()>
			name_ = Collections.emptyList();
		//    2    4:aload_0         
		//    3    5:invokestatic    #41  <Method List Collections.emptyList()>
		//    4    8:putfield        #43  <Field List name_>
			identifierValue_ = "";
		//    5   11:aload_0         
		//    6   12:ldc1            #45  <String "">
		//    7   14:putfield        #47  <Field Object identifierValue_>
			stringValue_ = ByteString.EMPTY;
		//    8   17:aload_0         
		//    9   18:getstatic       #52  <Field ByteString ByteString.EMPTY>
		//   10   21:putfield        #54  <Field ByteString stringValue_>
			aggregateValue_ = "";
		//   11   24:aload_0         
		//   12   25:ldc1            #45  <String "">
		//   13   27:putfield        #56  <Field Object aggregateValue_>
			maybeForceBuilderInitialization();
		//   14   30:aload_0         
		//   15   31:invokespecial   #59  <Method void maybeForceBuilderInitialization()>
		//   16   34:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #62  <Method void DescriptorProtos$UninterpretedOption$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #65  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			name_ = Collections.emptyList();
		//    3    5:aload_0         
		//    4    6:invokestatic    #41  <Method List Collections.emptyList()>
		//    5    9:putfield        #43  <Field List name_>
			identifierValue_ = "";
		//    6   12:aload_0         
		//    7   13:ldc1            #45  <String "">
		//    8   15:putfield        #47  <Field Object identifierValue_>
			stringValue_ = ByteString.EMPTY;
		//    9   18:aload_0         
		//   10   19:getstatic       #52  <Field ByteString ByteString.EMPTY>
		//   11   22:putfield        #54  <Field ByteString stringValue_>
			aggregateValue_ = "";
		//   12   25:aload_0         
		//   13   26:ldc1            #45  <String "">
		//   14   28:putfield        #56  <Field Object aggregateValue_>
			maybeForceBuilderInitialization();
		//   15   31:aload_0         
		//   16   32:invokespecial   #59  <Method void maybeForceBuilderInitialization()>
		//   17   35:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #67  <Method void DescriptorProtos$UninterpretedOption$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static final class NamePart extends GeneratedMessageV3
		implements NamePartOrBuilder
	{

		public static NamePart getDefaultInstance()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$24800();
		//    0    0:invokestatic    #139 <Method Descriptors$Descriptor DescriptorProtos.access$24800()>
		//    1    3:areturn         
		}

		public static Builder newBuilder()
		{
			return DEFAULT_INSTANCE.toBuilder();
		//    0    0:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #143 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder toBuilder()>
		//    2    6:areturn         
		}

		public static Builder newBuilder(NamePart namepart)
		{
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(namepart);
		//    0    0:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #143 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder toBuilder()>
		//    2    6:aload_0         
		//    3    7:invokevirtual   #147 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder DescriptorProtos$UninterpretedOption$NamePart$Builder.mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
		//    4   10:areturn         
		}

		public static NamePart parseDelimitedFrom(InputStream inputstream)
			throws IOException
		{
			return (NamePart)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #153 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    4   10:areturn         
		}

		public static NamePart parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (NamePart)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #157 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    5   11:areturn         
		}

		public static NamePart parseFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return (NamePart)PARSER.parseFrom(bytestring);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #164 <Method Object Parser.parseFrom(ByteString)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    4   12:areturn         
		}

		public static NamePart parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (NamePart)PARSER.parseFrom(bytestring, extensionregistrylite);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #168 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    5   13:areturn         
		}

		public static NamePart parseFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return (NamePart)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #173 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    4   10:areturn         
		}

		public static NamePart parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (NamePart)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #177 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    5   11:areturn         
		}

		public static NamePart parseFrom(InputStream inputstream)
			throws IOException
		{
			return (NamePart)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #179 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    4   10:areturn         
		}

		public static NamePart parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (NamePart)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #181 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    5   11:areturn         
		}

		public static NamePart parseFrom(ByteBuffer bytebuffer)
			throws InvalidProtocolBufferException
		{
			return (NamePart)PARSER.parseFrom(bytebuffer);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #185 <Method Object Parser.parseFrom(ByteBuffer)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    4   12:areturn         
		}

		public static NamePart parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (NamePart)PARSER.parseFrom(bytebuffer, extensionregistrylite);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #189 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    5   13:areturn         
		}

		public static NamePart parseFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return (NamePart)PARSER.parseFrom(abyte0);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #193 <Method Object Parser.parseFrom(byte[])>
		//    3    9:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    4   12:areturn         
		}

		public static NamePart parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (NamePart)PARSER.parseFrom(abyte0, extensionregistrylite);
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #197 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    5   13:areturn         
		}

		public static Parser parser()
		{
			return PARSER;
		//    0    0:getstatic       #49  <Field Parser PARSER>
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
			if(!(obj instanceof NamePart))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//*   7   11:ifne            20
				return super.equals(obj);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokespecial   #204 <Method boolean GeneratedMessageV3.equals(Object)>
		//   11   19:ireturn         
			obj = ((Object) ((NamePart)obj));
		//   12   20:aload_1         
		//   13   21:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//   14   24:astore_1        
			boolean flag;
			if(true && hasNamePart() == ((NamePart) (obj)).hasNamePart())
		//*  15   25:iconst_1        
		//*  16   26:ifeq            45
		//*  17   29:aload_0         
		//*  18   30:invokevirtual   #207 <Method boolean hasNamePart()>
		//*  19   33:aload_1         
		//*  20   34:invokevirtual   #207 <Method boolean hasNamePart()>
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
			if(hasNamePart())
		//*  29   49:aload_0         
		//*  30   50:invokevirtual   #207 <Method boolean hasNamePart()>
		//*  31   53:ifeq            81
				if(flag && getNamePart().equals(((Object) (((NamePart) (obj)).getNamePart()))))
		//*  32   56:iload_2         
		//*  33   57:ifeq            79
		//*  34   60:aload_0         
		//*  35   61:invokevirtual   #211 <Method String getNamePart()>
		//*  36   64:aload_1         
		//*  37   65:invokevirtual   #211 <Method String getNamePart()>
		//*  38   68:invokevirtual   #214 <Method boolean String.equals(Object)>
		//*  39   71:ifeq            79
					flag1 = true;
		//   40   74:iconst_1        
		//   41   75:istore_3        
				else
		//*  42   76:goto            81
					flag1 = false;
		//   43   79:iconst_0        
		//   44   80:istore_3        
			if(flag1 && hasIsExtension() == ((NamePart) (obj)).hasIsExtension())
		//*  45   81:iload_3         
		//*  46   82:ifeq            101
		//*  47   85:aload_0         
		//*  48   86:invokevirtual   #217 <Method boolean hasIsExtension()>
		//*  49   89:aload_1         
		//*  50   90:invokevirtual   #217 <Method boolean hasIsExtension()>
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
			if(hasIsExtension())
		//*  59  105:aload_0         
		//*  60  106:invokevirtual   #217 <Method boolean hasIsExtension()>
		//*  61  109:ifeq            134
				if(flag && getIsExtension() == ((NamePart) (obj)).getIsExtension())
		//*  62  112:iload_2         
		//*  63  113:ifeq            132
		//*  64  116:aload_0         
		//*  65  117:invokevirtual   #220 <Method boolean getIsExtension()>
		//*  66  120:aload_1         
		//*  67  121:invokevirtual   #220 <Method boolean getIsExtension()>
		//*  68  124:icmpne          132
					flag1 = true;
		//   69  127:iconst_1        
		//   70  128:istore_3        
				else
		//*  71  129:goto            134
					flag1 = false;
		//   72  132:iconst_0        
		//   73  133:istore_3        
			return flag1 && unknownFields.equals(((Object) (((NamePart) (obj)).unknownFields)));
		//   74  134:iload_3         
		//   75  135:ifeq            154
		//   76  138:aload_0         
		//   77  139:getfield        #103 <Field UnknownFieldSet unknownFields>
		//   78  142:aload_1         
		//   79  143:getfield        #103 <Field UnknownFieldSet unknownFields>
		//   80  146:invokevirtual   #221 <Method boolean UnknownFieldSet.equals(Object)>
		//   81  149:ifeq            154
		//   82  152:iconst_1        
		//   83  153:ireturn         
		//   84  154:iconst_0        
		//   85  155:ireturn         
		}

		public NamePart getDefaultInstanceForType()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #225 <Method DescriptorProtos$UninterpretedOption$NamePart getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #225 <Method DescriptorProtos$UninterpretedOption$NamePart getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public boolean getIsExtension()
		{
			return isExtension_;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field boolean isExtension_>
		//    2    4:ireturn         
		}

		public String getNamePart()
		{
			Object obj = namePart_;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object namePart_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #213 <Class String>
		//*   5    9:ifeq            17
				return (String)obj;
		//    6   12:aload_1         
		//    7   13:checkcast       #213 <Class String>
		//    8   16:areturn         
			obj = ((Object) ((ByteString)obj));
		//    9   17:aload_1         
		//   10   18:checkcast       #228 <Class ByteString>
		//   11   21:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
		//   12   22:aload_1         
		//   13   23:invokevirtual   #231 <Method String ByteString.toStringUtf8()>
		//   14   26:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
		//*  15   27:aload_1         
		//*  16   28:invokevirtual   #234 <Method boolean ByteString.isValidUtf8()>
		//*  17   31:ifeq            39
				namePart_ = ((Object) (s));
		//   18   34:aload_0         
		//   19   35:aload_2         
		//   20   36:putfield        #57  <Field Object namePart_>
			return s;
		//   21   39:aload_2         
		//   22   40:areturn         
		}

		public ByteString getNamePartBytes()
		{
			Object obj = namePart_;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object namePart_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #213 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #213 <Class String>
		//    8   16:invokestatic    #239 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				namePart_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #57  <Field Object namePart_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #228 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public Parser getParserForType()
		{
			return PARSER;
		//    0    0:getstatic       #49  <Field Parser PARSER>
		//    1    3:areturn         
		}

		public int getSerializedSize()
		{
			int i = memoizedSize;
		//    0    0:aload_0         
		//    1    1:getfield        #244 <Field int memoizedSize>
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
		//*  11   15:getfield        #89  <Field int bitField0_>
		//*  12   18:iconst_1        
		//*  13   19:iand            
		//*  14   20:iconst_1        
		//*  15   21:icmpne          35
				i = GeneratedMessageV3.computeStringSize(1, namePart_) + 0;
		//   16   24:iconst_1        
		//   17   25:aload_0         
		//   18   26:getfield        #57  <Field Object namePart_>
		//   19   29:invokestatic    #248 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
		//   20   32:iconst_0        
		//   21   33:iadd            
		//   22   34:istore_1        
			int j = i;
		//   23   35:iload_1         
		//   24   36:istore_2        
			if((bitField0_ & 2) == 2)
		//*  25   37:aload_0         
		//*  26   38:getfield        #89  <Field int bitField0_>
		//*  27   41:iconst_2        
		//*  28   42:iand            
		//*  29   43:iconst_2        
		//*  30   44:icmpne          58
				j = i + CodedOutputStream.computeBoolSize(2, isExtension_);
		//   31   47:iload_1         
		//   32   48:iconst_2        
		//   33   49:aload_0         
		//   34   50:getfield        #59  <Field boolean isExtension_>
		//   35   53:invokestatic    #254 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
		//   36   56:iadd            
		//   37   57:istore_2        
			i = j + unknownFields.getSerializedSize();
		//   38   58:iload_2         
		//   39   59:aload_0         
		//   40   60:getfield        #103 <Field UnknownFieldSet unknownFields>
		//   41   63:invokevirtual   #256 <Method int UnknownFieldSet.getSerializedSize()>
		//   42   66:iadd            
		//   43   67:istore_1        
			memoizedSize = i;
		//   44   68:aload_0         
		//   45   69:iload_1         
		//   46   70:putfield        #244 <Field int memoizedSize>
			return i;
		//   47   73:iload_1         
		//   48   74:ireturn         
		}

		public final UnknownFieldSet getUnknownFields()
		{
			return unknownFields;
		//    0    0:aload_0         
		//    1    1:getfield        #103 <Field UnknownFieldSet unknownFields>
		//    2    4:areturn         
		}

		public boolean hasIsExtension()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasNamePart()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field int bitField0_>
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
		//*   1    1:getfield        #261 <Field int memoizedHashCode>
		//*   2    4:ifeq            12
				return memoizedHashCode;
		//    3    7:aload_0         
		//    4    8:getfield        #261 <Field int memoizedHashCode>
		//    5   11:ireturn         
			int j = ((Object) (getDescriptor())).hashCode() + 779;
		//    6   12:invokestatic    #263 <Method Descriptors$Descriptor getDescriptor()>
		//    7   15:invokevirtual   #267 <Method int Object.hashCode()>
		//    8   18:sipush          779
		//    9   21:iadd            
		//   10   22:istore_2        
			int i = j;
		//   11   23:iload_2         
		//   12   24:istore_1        
			if(hasNamePart())
		//*  13   25:aload_0         
		//*  14   26:invokevirtual   #207 <Method boolean hasNamePart()>
		//*  15   29:ifeq            50
				i = (j * 37 + 1) * 53 + getNamePart().hashCode();
		//   16   32:iload_2         
		//   17   33:bipush          37
		//   18   35:imul            
		//   19   36:iconst_1        
		//   20   37:iadd            
		//   21   38:bipush          53
		//   22   40:imul            
		//   23   41:aload_0         
		//   24   42:invokevirtual   #211 <Method String getNamePart()>
		//   25   45:invokevirtual   #268 <Method int String.hashCode()>
		//   26   48:iadd            
		//   27   49:istore_1        
			j = i;
		//   28   50:iload_1         
		//   29   51:istore_2        
			if(hasIsExtension())
		//*  30   52:aload_0         
		//*  31   53:invokevirtual   #217 <Method boolean hasIsExtension()>
		//*  32   56:ifeq            77
				j = (i * 37 + 2) * 53 + Internal.hashBoolean(getIsExtension());
		//   33   59:iload_1         
		//   34   60:bipush          37
		//   35   62:imul            
		//   36   63:iconst_2        
		//   37   64:iadd            
		//   38   65:bipush          53
		//   39   67:imul            
		//   40   68:aload_0         
		//   41   69:invokevirtual   #220 <Method boolean getIsExtension()>
		//   42   72:invokestatic    #274 <Method int Internal.hashBoolean(boolean)>
		//   43   75:iadd            
		//   44   76:istore_2        
			i = j * 29 + unknownFields.hashCode();
		//   45   77:iload_2         
		//   46   78:bipush          29
		//   47   80:imul            
		//   48   81:aload_0         
		//   49   82:getfield        #103 <Field UnknownFieldSet unknownFields>
		//   50   85:invokevirtual   #275 <Method int UnknownFieldSet.hashCode()>
		//   51   88:iadd            
		//   52   89:istore_1        
			memoizedHashCode = i;
		//   53   90:aload_0         
		//   54   91:iload_1         
		//   55   92:putfield        #261 <Field int memoizedHashCode>
			return i;
		//   56   95:iload_1         
		//   57   96:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$24900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart, com/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart$Builder);
		//    0    0:invokestatic    #280 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$24900()>
		//    1    3:ldc1            #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    2    5:ldc1            #16  <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    3    7:invokevirtual   #286 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			byte byte0 = memoizedIsInitialized;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field byte memoizedIsInitialized>
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
			if(!hasNamePart())
		//*  12   18:aload_0         
		//*  13   19:invokevirtual   #207 <Method boolean hasNamePart()>
		//*  14   22:ifne            32
			{
				memoizedIsInitialized = 0;
		//   15   25:aload_0         
		//   16   26:iconst_0        
		//   17   27:putfield        #53  <Field byte memoizedIsInitialized>
				return false;
		//   18   30:iconst_0        
		//   19   31:ireturn         
			}
			if(!hasIsExtension())
		//*  20   32:aload_0         
		//*  21   33:invokevirtual   #217 <Method boolean hasIsExtension()>
		//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
		//   23   39:aload_0         
		//   24   40:iconst_0        
		//   25   41:putfield        #53  <Field byte memoizedIsInitialized>
				return false;
		//   26   44:iconst_0        
		//   27   45:ireturn         
			} else
			{
				memoizedIsInitialized = 1;
		//   28   46:aload_0         
		//   29   47:iconst_1        
		//   30   48:putfield        #53  <Field byte memoizedIsInitialized>
				return true;
		//   31   51:iconst_1        
		//   32   52:ireturn         
			}
		}

		public Builder newBuilderForType()
		{
			return newBuilder();
		//    0    0:invokestatic    #290 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilder()>
		//    1    3:areturn         
		}

		protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #16  <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #294 <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
		//    5    9:areturn         
		}

		public volatile Message.Builder newBuilderForType()
		{
			return ((Message.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #297 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return ((Message.Builder) (newBuilderForType(builderparent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #300 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder newBuilderForType()
		{
			return ((MessageLite.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #297 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		public Builder toBuilder()
		{
			if(this == DEFAULT_INSTANCE)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
		//*   2    4:if_acmpne       16
				return new Builder(((DescriptorProtos._cls1) (null)));
		//    3    7:new             #16  <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    4   10:dup             
		//    5   11:aconst_null     
		//    6   12:invokespecial   #304 <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder(DescriptorProtos$1)>
		//    7   15:areturn         
			else
				return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
		//    8   16:new             #16  <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    9   19:dup             
		//   10   20:aconst_null     
		//   11   21:invokespecial   #304 <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder(DescriptorProtos$1)>
		//   12   24:aload_0         
		//   13   25:invokevirtual   #147 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder DescriptorProtos$UninterpretedOption$NamePart$Builder.mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
		//   14   28:areturn         
		}

		public volatile Message.Builder toBuilder()
		{
			return ((Message.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #143 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder toBuilder()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder toBuilder()
		{
			return ((MessageLite.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #143 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder toBuilder()>
		//    2    4:areturn         
		}

		public void writeTo(CodedOutputStream codedoutputstream)
			throws IOException
		{
			if((bitField0_ & 1) == 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #89  <Field int bitField0_>
		//*   2    4:iconst_1        
		//*   3    5:iand            
		//*   4    6:iconst_1        
		//*   5    7:icmpne          19
				GeneratedMessageV3.writeString(codedoutputstream, 1, namePart_);
		//    6   10:aload_1         
		//    7   11:iconst_1        
		//    8   12:aload_0         
		//    9   13:getfield        #57  <Field Object namePart_>
		//   10   16:invokestatic    #310 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
			if((bitField0_ & 2) == 2)
		//*  11   19:aload_0         
		//*  12   20:getfield        #89  <Field int bitField0_>
		//*  13   23:iconst_2        
		//*  14   24:iand            
		//*  15   25:iconst_2        
		//*  16   26:icmpne          38
				codedoutputstream.writeBool(2, isExtension_);
		//   17   29:aload_1         
		//   18   30:iconst_2        
		//   19   31:aload_0         
		//   20   32:getfield        #59  <Field boolean isExtension_>
		//   21   35:invokevirtual   #314 <Method void CodedOutputStream.writeBool(int, boolean)>
			unknownFields.writeTo(codedoutputstream);
		//   22   38:aload_0         
		//   23   39:getfield        #103 <Field UnknownFieldSet unknownFields>
		//   24   42:aload_1         
		//   25   43:invokevirtual   #316 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
		//   26   46:return          
		}

		private static final NamePart DEFAULT_INSTANCE = new NamePart();
		public static final int IS_EXTENSION_FIELD_NUMBER = 2;
		public static final int NAME_PART_FIELD_NUMBER = 1;
		public static final Parser PARSER = new AbstractParser() {

			public NamePart parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return new NamePart(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
			//    0    0:new             #7   <Class DescriptorProtos$UninterpretedOption$NamePart>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #25  <Method void DescriptorProtos$UninterpretedOption$NamePart(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
			//    6   10:areturn         
			}

			public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method DescriptorProtos$UninterpretedOption$NamePart parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
			//    4    6:areturn         
			}

		}
;
		private static final long serialVersionUID = 0L;
		private int bitField0_;
		private boolean isExtension_;
		private byte memoizedIsInitialized;
		private volatile Object namePart_;

		static 
		{
		//    0    0:new             #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    1    3:dup             
		//    2    4:invokespecial   #44  <Method void DescriptorProtos$UninterpretedOption$NamePart()>
		//    3    7:putstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
		//    4   10:new             #14  <Class DescriptorProtos$UninterpretedOption$NamePart$1>
		//    5   13:dup             
		//    6   14:invokespecial   #47  <Method void DescriptorProtos$UninterpretedOption$NamePart$1()>
		//    7   17:putstatic       #49  <Field Parser PARSER>
		//*   8   20:return          
		}


/*
		static Object access$25300(NamePart namepart)
		{
			return namepart.namePart_;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object namePart_>
		//    2    4:areturn         
		}

*/


/*
		static Object access$25302(NamePart namepart, Object obj)
		{
			namepart.namePart_ = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #57  <Field Object namePart_>
			return obj;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static boolean access$25402(NamePart namepart, boolean flag)
		{
			namepart.isExtension_ = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #59  <Field boolean isExtension_>
			return flag;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static int access$25502(NamePart namepart, int i)
		{
			namepart.bitField0_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #89  <Field int bitField0_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/

		private NamePart()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #51  <Method void GeneratedMessageV3()>
			memoizedIsInitialized = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #53  <Field byte memoizedIsInitialized>
			namePart_ = "";
		//    5    9:aload_0         
		//    6   10:ldc1            #55  <String "">
		//    7   12:putfield        #57  <Field Object namePart_>
			isExtension_ = false;
		//    8   15:aload_0         
		//    9   16:iconst_0        
		//   10   17:putfield        #59  <Field boolean isExtension_>
		//   11   20:return          
		}

		private NamePart(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			boolean flag;
			UnknownFieldSet.Builder builder;
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void DescriptorProtos$UninterpretedOption$NamePart()>
			if(extensionregistrylite == null)
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       16
				throw new NullPointerException();
		//    4    8:new             #66  <Class NullPointerException>
		//    5   11:dup             
		//    6   12:invokespecial   #67  <Method void NullPointerException()>
		//    7   15:athrow          
			builder = UnknownFieldSet.newBuilder();
		//    8   16:invokestatic    #73  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
		//    9   19:astore          5
			flag = false;
		//   10   21:iconst_0        
		//   11   22:istore_3        
_L8:
			if(flag) goto _L2; else goto _L1
		//   12   23:iload_3         
		//   13   24:ifne            132
_L1:
			int i = codedinputstream.readTag();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #79  <Method int CodedInputStream.readTag()>
		//   16   31:istore          4
			i;
		//   17   33:iload           4
			JVM INSTR lookupswitch 3: default 183
		//		               0: 186
		//		               10: 86
		//		               16: 111;
		//   18   35:lookupswitch    3: default 183
		//		               0: 186
		//		               10: 86
		//		               16: 111
			   goto _L3 _L4 _L5 _L6
_L3:
			if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
		//*  19   68:aload_0         
		//*  20   69:aload_1         
		//*  21   70:aload           5
		//*  22   72:aload_2         
		//*  23   73:iload           4
		//*  24   75:invokevirtual   #83  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
		//*  25   78:ifne            129
				flag = true;
		//   26   81:iconst_1        
		//   27   82:istore_3        
			continue; /* Loop/switch isn't completed */
		//   28   83:goto            129
_L5:
			ByteString bytestring = codedinputstream.readBytes();
		//   29   86:aload_1         
		//   30   87:invokevirtual   #87  <Method ByteString CodedInputStream.readBytes()>
		//   31   90:astore          6
			bitField0_ = bitField0_ | 1;
		//   32   92:aload_0         
		//   33   93:aload_0         
		//   34   94:getfield        #89  <Field int bitField0_>
		//   35   97:iconst_1        
		//   36   98:ior             
		//   37   99:putfield        #89  <Field int bitField0_>
			namePart_ = ((Object) (bytestring));
		//   38  102:aload_0         
		//   39  103:aload           6
		//   40  105:putfield        #57  <Field Object namePart_>
			continue; /* Loop/switch isn't completed */
		//   41  108:goto            129
_L6:
			bitField0_ = bitField0_ | 2;
		//   42  111:aload_0         
		//   43  112:aload_0         
		//   44  113:getfield        #89  <Field int bitField0_>
		//   45  116:iconst_2        
		//   46  117:ior             
		//   47  118:putfield        #89  <Field int bitField0_>
			isExtension_ = codedinputstream.readBool();
		//   48  121:aload_0         
		//   49  122:aload_1         
		//   50  123:invokevirtual   #93  <Method boolean CodedInputStream.readBool()>
		//   51  126:putfield        #59  <Field boolean isExtension_>
			continue; /* Loop/switch isn't completed */
		//   52  129:goto            23
_L2:
			unknownFields = builder.build();
		//   53  132:aload_0         
		//   54  133:aload           5
		//   55  135:invokevirtual   #99  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//   56  138:putfield        #103 <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//   57  141:aload_0         
		//   58  142:invokevirtual   #106 <Method void makeExtensionsImmutable()>
			return;
		//   59  145:return          
			codedinputstream;
		//   60  146:astore_1        
			throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
		//   61  147:aload_1         
		//   62  148:aload_0         
		//   63  149:invokevirtual   #110 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//   64  152:athrow          
			codedinputstream;
		//   65  153:astore_1        
			throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
		//   66  154:new             #62  <Class InvalidProtocolBufferException>
		//   67  157:dup             
		//   68  158:aload_1         
		//   69  159:invokespecial   #113 <Method void InvalidProtocolBufferException(IOException)>
		//   70  162:aload_0         
		//   71  163:invokevirtual   #110 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//   72  166:athrow          
			codedinputstream;
		//   73  167:astore_1        
			unknownFields = builder.build();
		//   74  168:aload_0         
		//   75  169:aload           5
		//   76  171:invokevirtual   #99  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//   77  174:putfield        #103 <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//   78  177:aload_0         
		//   79  178:invokevirtual   #106 <Method void makeExtensionsImmutable()>
			throw codedinputstream;
		//   80  181:aload_1         
		//   81  182:athrow          
		//*  82  183:goto            68
_L4:
			flag = true;
		//   83  186:iconst_1        
		//   84  187:istore_3        
			if(true) goto _L8; else goto _L7
		//   85  188:goto            129
_L7:
		}

		NamePart(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
			throws InvalidProtocolBufferException
		{
			this(codedinputstream, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #117 <Method void DescriptorProtos$UninterpretedOption$NamePart(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:return          
		}

		private NamePart(GeneratedMessageV3.Builder builder)
		{
			super(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #120 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
			memoizedIsInitialized = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #53  <Field byte memoizedIsInitialized>
		//    6   10:return          
		}

		NamePart(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
		{
			this(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #124 <Method void DescriptorProtos$UninterpretedOption$NamePart(GeneratedMessageV3$Builder)>
		//    3    5:return          
		}
	}

	public static final class NamePart.Builder extends GeneratedMessageV3.Builder
		implements NamePartOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$24800();
		//    0    0:invokestatic    #46  <Method Descriptors$Descriptor DescriptorProtos.access$24800()>
		//    1    3:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
		//    0    0:getstatic       #51  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//    1    3:istore_1        
		//    2    4:return          
		}

		public NamePart.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (NamePart.Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #56  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #58  <Method DescriptorProtos$UninterpretedOption$NamePart$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #58  <Method DescriptorProtos$UninterpretedOption$NamePart$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public NamePart build()
		{
			NamePart namepart = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #64  <Method DescriptorProtos$UninterpretedOption$NamePart buildPartial()>
		//    2    4:astore_1        
			if(!namepart.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #68  <Method boolean DescriptorProtos$UninterpretedOption$NamePart.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (namepart)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #72  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return namepart;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method DescriptorProtos$UninterpretedOption$NamePart build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method DescriptorProtos$UninterpretedOption$NamePart build()>
		//    2    4:areturn         
		}

		public NamePart buildPartial()
		{
			NamePart namepart = new NamePart(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #79  <Method void DescriptorProtos$UninterpretedOption$NamePart(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #81  <Field int bitField0_>
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
			namepart.namePart_ = namePart_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #30  <Field Object namePart_>
		//   21   33:invokestatic    #85  <Method Object DescriptorProtos$UninterpretedOption$NamePart.access$25302(DescriptorProtos$UninterpretedOption$NamePart, Object)>
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
			namepart.isExtension_ = isExtension_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #87  <Field boolean isExtension_>
		//   37   56:invokestatic    #91  <Method boolean DescriptorProtos$UninterpretedOption$NamePart.access$25402(DescriptorProtos$UninterpretedOption$NamePart, boolean)>
		//   38   59:pop             
			namepart.bitField0_ = j;
		//   39   60:aload           4
		//   40   62:iload_2         
		//   41   63:invokestatic    #95  <Method int DescriptorProtos$UninterpretedOption$NamePart.access$25502(DescriptorProtos$UninterpretedOption$NamePart, int)>
		//   42   66:pop             
			onBuilt();
		//   43   67:aload_0         
		//   44   68:invokevirtual   #98  <Method void onBuilt()>
			return namepart;
		//   45   71:aload           4
		//   46   73:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #64  <Method DescriptorProtos$UninterpretedOption$NamePart buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #64  <Method DescriptorProtos$UninterpretedOption$NamePart buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clear()>
		//    2    4:areturn         
		}

		public NamePart.Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #106 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			namePart_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #28  <String "">
		//    5    8:putfield        #30  <Field Object namePart_>
			bitField0_ = bitField0_ & -2;
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:getfield        #81  <Field int bitField0_>
		//    9   16:bipush          -2
		//   10   18:iand            
		//   11   19:putfield        #81  <Field int bitField0_>
			isExtension_ = false;
		//   12   22:aload_0         
		//   13   23:iconst_0        
		//   14   24:putfield        #87  <Field boolean isExtension_>
			bitField0_ = bitField0_ & -3;
		//   15   27:aload_0         
		//   16   28:aload_0         
		//   17   29:getfield        #81  <Field int bitField0_>
		//   18   32:bipush          -3
		//   19   34:iand            
		//   20   35:putfield        #81  <Field int bitField0_>
			return this;
		//   21   38:aload_0         
		//   22   39:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clear()>
		//    2    4:areturn         
		}

		public NamePart.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (NamePart.Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #113 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #115 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #115 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public NamePart.Builder clearIsExtension()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #81  <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #81  <Field int bitField0_>
			isExtension_ = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #87  <Field boolean isExtension_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public NamePart.Builder clearNamePart()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #81  <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #81  <Field int bitField0_>
			namePart_ = ((Object) (NamePart.getDefaultInstance().getNamePart()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #124 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
		//    8   15:invokevirtual   #128 <Method String DescriptorProtos$UninterpretedOption$NamePart.getNamePart()>
		//    9   18:putfield        #30  <Field Object namePart_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public NamePart.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (NamePart.Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #136 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public NamePart.Builder clone()
		{
			return (NamePart.Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #143 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public NamePart getDefaultInstanceForType()
		{
			return NamePart.getDefaultInstance();
		//    0    0:invokestatic    #124 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #150 <Method DescriptorProtos$UninterpretedOption$NamePart getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #150 <Method DescriptorProtos$UninterpretedOption$NamePart getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$24800();
		//    0    0:invokestatic    #46  <Method Descriptors$Descriptor DescriptorProtos.access$24800()>
		//    1    3:areturn         
		}

		public boolean getIsExtension()
		{
			return isExtension_;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field boolean isExtension_>
		//    2    4:ireturn         
		}

		public String getNamePart()
		{
			Object obj = namePart_;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Object namePart_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #154 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #156 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #159 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #162 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					namePart_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #30  <Field Object namePart_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #154 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getNamePartBytes()
		{
			Object obj = namePart_;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Object namePart_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #154 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #154 <Class String>
		//    8   16:invokestatic    #168 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				namePart_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #30  <Field Object namePart_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #156 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public boolean hasIsExtension()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasNamePart()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field int bitField0_>
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
			return DescriptorProtos.access$24900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart, com/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart$Builder);
		//    0    0:invokestatic    #175 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$24900()>
		//    1    3:ldc1            #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    2    5:ldc1            #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    3    7:invokevirtual   #181 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			if(!hasNamePart())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #183 <Method boolean hasNamePart()>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			return hasIsExtension();
		//    5    9:aload_0         
		//    6   10:invokevirtual   #185 <Method boolean hasIsExtension()>
		//    7   13:ifne            18
		//    8   16:iconst_0        
		//    9   17:ireturn         
		//   10   18:iconst_1        
		//   11   19:ireturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #196 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public NamePart.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
			codedinputstream = ((CodedInputStream) ((NamePart)NamePart.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #203 <Field Parser DescriptorProtos$UninterpretedOption$NamePart.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #209 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((NamePart) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #212 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #215 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #219 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #212 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
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
			codedinputstream = ((CodedInputStream) ((NamePart)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((NamePart) (codedinputstream1)));
			throw codedinputstream;
		}

		public NamePart.Builder mergeFrom(NamePart namepart)
		{
			if(namepart == NamePart.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #124 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(namepart.hasNamePart())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #220 <Method boolean DescriptorProtos$UninterpretedOption$NamePart.hasNamePart()>
		//*   7   13:ifeq            38
			{
				bitField0_ = bitField0_ | 1;
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #81  <Field int bitField0_>
		//   11   21:iconst_1        
		//   12   22:ior             
		//   13   23:putfield        #81  <Field int bitField0_>
				namePart_ = namepart.namePart_;
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokestatic    #224 <Method Object DescriptorProtos$UninterpretedOption$NamePart.access$25300(DescriptorProtos$UninterpretedOption$NamePart)>
		//   17   31:putfield        #30  <Field Object namePart_>
				onChanged();
		//   18   34:aload_0         
		//   19   35:invokevirtual   #120 <Method void onChanged()>
			}
			if(namepart.hasIsExtension())
		//*  20   38:aload_1         
		//*  21   39:invokevirtual   #225 <Method boolean DescriptorProtos$UninterpretedOption$NamePart.hasIsExtension()>
		//*  22   42:ifeq            54
				setIsExtension(namepart.getIsExtension());
		//   23   45:aload_0         
		//   24   46:aload_1         
		//   25   47:invokevirtual   #227 <Method boolean DescriptorProtos$UninterpretedOption$NamePart.getIsExtension()>
		//   26   50:invokevirtual   #231 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setIsExtension(boolean)>
		//   27   53:pop             
			mergeUnknownFields(namepart.unknownFields);
		//   28   54:aload_0         
		//   29   55:aload_1         
		//   30   56:getfield        #235 <Field UnknownFieldSet DescriptorProtos$UninterpretedOption$NamePart.unknownFields>
		//   31   59:invokevirtual   #239 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeUnknownFields(UnknownFieldSet)>
		//   32   62:pop             
			onChanged();
		//   33   63:aload_0         
		//   34   64:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   35   67:aload_0         
		//   36   68:areturn         
		}

		public NamePart.Builder mergeFrom(Message message)
		{
			if(message instanceof NamePart)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//*   2    4:ifeq            16
			{
				return mergeFrom((NamePart)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    6   12:invokevirtual   #212 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #241 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #196 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #239 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final NamePart.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (NamePart.Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #248 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #239 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #239 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public NamePart.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (NamePart.Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #252 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #254 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #254 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public NamePart.Builder setIsExtension(boolean flag)
		{
			bitField0_ = bitField0_ | 2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #81  <Field int bitField0_>
		//    3    5:iconst_2        
		//    4    6:ior             
		//    5    7:putfield        #81  <Field int bitField0_>
			isExtension_ = flag;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #87  <Field boolean isExtension_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public NamePart.Builder setNamePart(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #258 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #259 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #81  <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #81  <Field int bitField0_>
				namePart_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #30  <Field Object namePart_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public NamePart.Builder setNamePartBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #258 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #259 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #81  <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #81  <Field int bitField0_>
				namePart_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #30  <Field Object namePart_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public NamePart.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (NamePart.Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #266 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #268 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #268 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final NamePart.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (NamePart.Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #272 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #274 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #274 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private boolean isExtension_;
		private Object namePart_;

		private NamePart.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void GeneratedMessageV3$Builder()>
			namePart_ = "";
		//    2    4:aload_0         
		//    3    5:ldc1            #28  <String "">
		//    4    7:putfield        #30  <Field Object namePart_>
			maybeForceBuilderInitialization();
		//    5   10:aload_0         
		//    6   11:invokespecial   #33  <Method void maybeForceBuilderInitialization()>
		//    7   14:return          
		}

		NamePart.Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder()>
		//    2    4:return          
		}

		private NamePart.Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			namePart_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #28  <String "">
		//    5    8:putfield        #30  <Field Object namePart_>
			maybeForceBuilderInitialization();
		//    6   11:aload_0         
		//    7   12:invokespecial   #33  <Method void maybeForceBuilderInitialization()>
		//    8   15:return          
		}

		NamePart.Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static interface NamePartOrBuilder
		extends MessageOrBuilder
	{

		public abstract boolean getIsExtension();

		public abstract String getNamePart();

		public abstract ByteString getNamePartBytes();

		public abstract boolean hasIsExtension();

		public abstract boolean hasNamePart();
	}


	public static DescriptorProtos$UninterpretedOption getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #71  <Field DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$24600();
	//    0    0:invokestatic    #221 <Method Descriptors$Descriptor DescriptorProtos.access$24600()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #71  <Field DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #225 <Method DescriptorProtos$UninterpretedOption$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$uninterpretedoption);
	//    0    0:getstatic       #71  <Field DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #225 <Method DescriptorProtos$UninterpretedOption$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #229 <Method DescriptorProtos$UninterpretedOption$Builder DescriptorProtos$UninterpretedOption$Builder.mergeFrom(DescriptorProtos$UninterpretedOption)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #235 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    4   10:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #239 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    5   11:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #246 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    4   12:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #250 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #255 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    4   10:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #259 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    5   11:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #261 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    4   10:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #263 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    5   11:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #267 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    4   12:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #271 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #275 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    4   12:areturn         
	}

	public static DescriptorProtos$UninterpretedOption parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #279 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #74  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$UninterpretedOption))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$UninterpretedOption>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #285 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$UninterpretedOption)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$UninterpretedOption>
	//   14   24:astore_1        
		boolean flag;
		if(true && getNameList().equals(((Object) (((DescriptorProtos$UninterpretedOption) (obj)).getNameList()))))
	//*  15   25:iconst_1        
	//*  16   26:ifeq            50
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #288 <Method List getNameList()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #288 <Method List getNameList()>
	//*  21   37:invokeinterface #289 <Method boolean List.equals(Object)>
	//*  22   42:ifeq            50
			flag = true;
	//   23   45:iconst_1        
	//   24   46:istore_2        
		else
	//*  25   47:goto            52
			flag = false;
	//   26   50:iconst_0        
	//   27   51:istore_2        
		if(flag && hasIdentifierValue() == ((DescriptorProtos$UninterpretedOption) (obj)).hasIdentifierValue())
	//*  28   52:iload_2         
	//*  29   53:ifeq            72
	//*  30   56:aload_0         
	//*  31   57:invokevirtual   #293 <Method boolean hasIdentifierValue()>
	//*  32   60:aload_1         
	//*  33   61:invokevirtual   #293 <Method boolean hasIdentifierValue()>
	//*  34   64:icmpne          72
			flag = true;
	//   35   67:iconst_1        
	//   36   68:istore_2        
		else
	//*  37   69:goto            74
			flag = false;
	//   38   72:iconst_0        
	//   39   73:istore_2        
		boolean flag1 = flag;
	//   40   74:iload_2         
	//   41   75:istore_3        
		if(hasIdentifierValue())
	//*  42   76:aload_0         
	//*  43   77:invokevirtual   #293 <Method boolean hasIdentifierValue()>
	//*  44   80:ifeq            108
			if(flag && getIdentifierValue().equals(((Object) (((DescriptorProtos$UninterpretedOption) (obj)).getIdentifierValue()))))
	//*  45   83:iload_2         
	//*  46   84:ifeq            106
	//*  47   87:aload_0         
	//*  48   88:invokevirtual   #297 <Method String getIdentifierValue()>
	//*  49   91:aload_1         
	//*  50   92:invokevirtual   #297 <Method String getIdentifierValue()>
	//*  51   95:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*  52   98:ifeq            106
				flag1 = true;
	//   53  101:iconst_1        
	//   54  102:istore_3        
			else
	//*  55  103:goto            108
				flag1 = false;
	//   56  106:iconst_0        
	//   57  107:istore_3        
		if(flag1 && hasPositiveIntValue() == ((DescriptorProtos$UninterpretedOption) (obj)).hasPositiveIntValue())
	//*  58  108:iload_3         
	//*  59  109:ifeq            128
	//*  60  112:aload_0         
	//*  61  113:invokevirtual   #303 <Method boolean hasPositiveIntValue()>
	//*  62  116:aload_1         
	//*  63  117:invokevirtual   #303 <Method boolean hasPositiveIntValue()>
	//*  64  120:icmpne          128
			flag = true;
	//   65  123:iconst_1        
	//   66  124:istore_2        
		else
	//*  67  125:goto            130
			flag = false;
	//   68  128:iconst_0        
	//   69  129:istore_2        
		flag1 = flag;
	//   70  130:iload_2         
	//   71  131:istore_3        
		if(hasPositiveIntValue())
	//*  72  132:aload_0         
	//*  73  133:invokevirtual   #303 <Method boolean hasPositiveIntValue()>
	//*  74  136:ifeq            162
			if(flag && getPositiveIntValue() == ((DescriptorProtos$UninterpretedOption) (obj)).getPositiveIntValue())
	//*  75  139:iload_2         
	//*  76  140:ifeq            160
	//*  77  143:aload_0         
	//*  78  144:invokevirtual   #306 <Method long getPositiveIntValue()>
	//*  79  147:aload_1         
	//*  80  148:invokevirtual   #306 <Method long getPositiveIntValue()>
	//*  81  151:lcmp            
	//*  82  152:ifne            160
				flag1 = true;
	//   83  155:iconst_1        
	//   84  156:istore_3        
			else
	//*  85  157:goto            162
				flag1 = false;
	//   86  160:iconst_0        
	//   87  161:istore_3        
		if(flag1 && hasNegativeIntValue() == ((DescriptorProtos$UninterpretedOption) (obj)).hasNegativeIntValue())
	//*  88  162:iload_3         
	//*  89  163:ifeq            182
	//*  90  166:aload_0         
	//*  91  167:invokevirtual   #309 <Method boolean hasNegativeIntValue()>
	//*  92  170:aload_1         
	//*  93  171:invokevirtual   #309 <Method boolean hasNegativeIntValue()>
	//*  94  174:icmpne          182
			flag = true;
	//   95  177:iconst_1        
	//   96  178:istore_2        
		else
	//*  97  179:goto            184
			flag = false;
	//   98  182:iconst_0        
	//   99  183:istore_2        
		flag1 = flag;
	//  100  184:iload_2         
	//  101  185:istore_3        
		if(hasNegativeIntValue())
	//* 102  186:aload_0         
	//* 103  187:invokevirtual   #309 <Method boolean hasNegativeIntValue()>
	//* 104  190:ifeq            216
			if(flag && getNegativeIntValue() == ((DescriptorProtos$UninterpretedOption) (obj)).getNegativeIntValue())
	//* 105  193:iload_2         
	//* 106  194:ifeq            214
	//* 107  197:aload_0         
	//* 108  198:invokevirtual   #312 <Method long getNegativeIntValue()>
	//* 109  201:aload_1         
	//* 110  202:invokevirtual   #312 <Method long getNegativeIntValue()>
	//* 111  205:lcmp            
	//* 112  206:ifne            214
				flag1 = true;
	//  113  209:iconst_1        
	//  114  210:istore_3        
			else
	//* 115  211:goto            216
				flag1 = false;
	//  116  214:iconst_0        
	//  117  215:istore_3        
		if(flag1 && hasDoubleValue() == ((DescriptorProtos$UninterpretedOption) (obj)).hasDoubleValue())
	//* 118  216:iload_3         
	//* 119  217:ifeq            236
	//* 120  220:aload_0         
	//* 121  221:invokevirtual   #315 <Method boolean hasDoubleValue()>
	//* 122  224:aload_1         
	//* 123  225:invokevirtual   #315 <Method boolean hasDoubleValue()>
	//* 124  228:icmpne          236
			flag = true;
	//  125  231:iconst_1        
	//  126  232:istore_2        
		else
	//* 127  233:goto            238
			flag = false;
	//  128  236:iconst_0        
	//  129  237:istore_2        
		flag1 = flag;
	//  130  238:iload_2         
	//  131  239:istore_3        
		if(hasDoubleValue())
	//* 132  240:aload_0         
	//* 133  241:invokevirtual   #315 <Method boolean hasDoubleValue()>
	//* 134  244:ifeq            276
			if(flag && Double.doubleToLongBits(getDoubleValue()) == Double.doubleToLongBits(((DescriptorProtos$UninterpretedOption) (obj)).getDoubleValue()))
	//* 135  247:iload_2         
	//* 136  248:ifeq            274
	//* 137  251:aload_0         
	//* 138  252:invokevirtual   #318 <Method double getDoubleValue()>
	//* 139  255:invokestatic    #324 <Method long Double.doubleToLongBits(double)>
	//* 140  258:aload_1         
	//* 141  259:invokevirtual   #318 <Method double getDoubleValue()>
	//* 142  262:invokestatic    #324 <Method long Double.doubleToLongBits(double)>
	//* 143  265:lcmp            
	//* 144  266:ifne            274
				flag1 = true;
	//  145  269:iconst_1        
	//  146  270:istore_3        
			else
	//* 147  271:goto            276
				flag1 = false;
	//  148  274:iconst_0        
	//  149  275:istore_3        
		if(flag1 && hasStringValue() == ((DescriptorProtos$UninterpretedOption) (obj)).hasStringValue())
	//* 150  276:iload_3         
	//* 151  277:ifeq            296
	//* 152  280:aload_0         
	//* 153  281:invokevirtual   #327 <Method boolean hasStringValue()>
	//* 154  284:aload_1         
	//* 155  285:invokevirtual   #327 <Method boolean hasStringValue()>
	//* 156  288:icmpne          296
			flag = true;
	//  157  291:iconst_1        
	//  158  292:istore_2        
		else
	//* 159  293:goto            298
			flag = false;
	//  160  296:iconst_0        
	//  161  297:istore_2        
		flag1 = flag;
	//  162  298:iload_2         
	//  163  299:istore_3        
		if(hasStringValue())
	//* 164  300:aload_0         
	//* 165  301:invokevirtual   #327 <Method boolean hasStringValue()>
	//* 166  304:ifeq            332
			if(flag && getStringValue().equals(((Object) (((DescriptorProtos$UninterpretedOption) (obj)).getStringValue()))))
	//* 167  307:iload_2         
	//* 168  308:ifeq            330
	//* 169  311:aload_0         
	//* 170  312:invokevirtual   #330 <Method ByteString getStringValue()>
	//* 171  315:aload_1         
	//* 172  316:invokevirtual   #330 <Method ByteString getStringValue()>
	//* 173  319:invokevirtual   #331 <Method boolean ByteString.equals(Object)>
	//* 174  322:ifeq            330
				flag1 = true;
	//  175  325:iconst_1        
	//  176  326:istore_3        
			else
	//* 177  327:goto            332
				flag1 = false;
	//  178  330:iconst_0        
	//  179  331:istore_3        
		if(flag1 && hasAggregateValue() == ((DescriptorProtos$UninterpretedOption) (obj)).hasAggregateValue())
	//* 180  332:iload_3         
	//* 181  333:ifeq            352
	//* 182  336:aload_0         
	//* 183  337:invokevirtual   #334 <Method boolean hasAggregateValue()>
	//* 184  340:aload_1         
	//* 185  341:invokevirtual   #334 <Method boolean hasAggregateValue()>
	//* 186  344:icmpne          352
			flag = true;
	//  187  347:iconst_1        
	//  188  348:istore_2        
		else
	//* 189  349:goto            354
			flag = false;
	//  190  352:iconst_0        
	//  191  353:istore_2        
		flag1 = flag;
	//  192  354:iload_2         
	//  193  355:istore_3        
		if(hasAggregateValue())
	//* 194  356:aload_0         
	//* 195  357:invokevirtual   #334 <Method boolean hasAggregateValue()>
	//* 196  360:ifeq            388
			if(flag && getAggregateValue().equals(((Object) (((DescriptorProtos$UninterpretedOption) (obj)).getAggregateValue()))))
	//* 197  363:iload_2         
	//* 198  364:ifeq            386
	//* 199  367:aload_0         
	//* 200  368:invokevirtual   #337 <Method String getAggregateValue()>
	//* 201  371:aload_1         
	//* 202  372:invokevirtual   #337 <Method String getAggregateValue()>
	//* 203  375:invokevirtual   #300 <Method boolean String.equals(Object)>
	//* 204  378:ifeq            386
				flag1 = true;
	//  205  381:iconst_1        
	//  206  382:istore_3        
			else
	//* 207  383:goto            388
				flag1 = false;
	//  208  386:iconst_0        
	//  209  387:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$UninterpretedOption) (obj)).unknownFields)));
	//  210  388:iload_3         
	//  211  389:ifeq            408
	//  212  392:aload_0         
	//  213  393:getfield        #174 <Field UnknownFieldSet unknownFields>
	//  214  396:aload_1         
	//  215  397:getfield        #174 <Field UnknownFieldSet unknownFields>
	//  216  400:invokevirtual   #338 <Method boolean UnknownFieldSet.equals(Object)>
	//  217  403:ifeq            408
	//  218  406:iconst_1        
	//  219  407:ireturn         
	//  220  408:iconst_0        
	//  221  409:ireturn         
	}

	public String getAggregateValue()
	{
		Object obj = aggregateValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Object aggregateValue_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #299 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #299 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #98  <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #341 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #344 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			aggregateValue_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #105 <Field Object aggregateValue_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getAggregateValueBytes()
	{
		Object obj = aggregateValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Object aggregateValue_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #299 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #299 <Class String>
	//    8   16:invokestatic    #349 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			aggregateValue_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #105 <Field Object aggregateValue_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #98  <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos$UninterpretedOption getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #71  <Field DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #353 <Method DescriptorProtos$UninterpretedOption getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #353 <Method DescriptorProtos$UninterpretedOption getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public double getDoubleValue()
	{
		return doubleValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field double doubleValue_>
	//    2    4:dreturn         
	}

	public String getIdentifierValue()
	{
		Object obj = identifierValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Object identifierValue_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #299 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #299 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #98  <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #341 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #344 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			identifierValue_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #90  <Field Object identifierValue_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getIdentifierValueBytes()
	{
		Object obj = identifierValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Object identifierValue_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #299 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #299 <Class String>
	//    8   16:invokestatic    #349 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			identifierValue_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #90  <Field Object identifierValue_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #98  <Class ByteString>
	//   17   31:areturn         
		}
	}

	public NamePart getName(int i)
	{
		return (NamePart)name_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field List name_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #361 <Method Object List.get(int)>
	//    4   10:checkcast       #16  <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    5   13:areturn         
	}

	public int getNameCount()
	{
		return name_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field List name_>
	//    2    4:invokeinterface #365 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getNameList()
	{
		return name_;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field List name_>
	//    2    4:areturn         
	}

	public NamePartOrBuilder getNameOrBuilder(int i)
	{
		return (NamePartOrBuilder)name_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field List name_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #361 <Method Object List.get(int)>
	//    4   10:checkcast       #23  <Class DescriptorProtos$UninterpretedOption$NamePartOrBuilder>
	//    5   13:areturn         
	}

	public List getNameOrBuilderList()
	{
		return name_;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field List name_>
	//    2    4:areturn         
	}

	public long getNegativeIntValue()
	{
		return negativeIntValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field long negativeIntValue_>
	//    2    4:lreturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #74  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public long getPositiveIntValue()
	{
		return positiveIntValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field long positiveIntValue_>
	//    2    4:lreturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #375 <Field int memoizedSize>
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
		for(int j = 0; j < name_.size(); j++)
	//*  10   14:iconst_0        
	//*  11   15:istore_2        
	//*  12   16:iload_2         
	//*  13   17:aload_0         
	//*  14   18:getfield        #86  <Field List name_>
	//*  15   21:invokeinterface #365 <Method int List.size()>
	//*  16   26:icmpge          56
			i += CodedOutputStream.computeMessageSize(2, (MessageLite)name_.get(j));
	//   17   29:iload_1         
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:getfield        #86  <Field List name_>
	//   21   35:iload_2         
	//   22   36:invokeinterface #361 <Method Object List.get(int)>
	//   23   41:checkcast       #377 <Class MessageLite>
	//   24   44:invokestatic    #383 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   25   47:iadd            
	//   26   48:istore_1        

	//   27   49:iload_2         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_2        
	//*  31   53:goto            16
		int k = i;
	//   32   56:iload_1         
	//   33   57:istore_2        
		if((bitField0_ & 1) == 1)
	//*  34   58:aload_0         
	//*  35   59:getfield        #149 <Field int bitField0_>
	//*  36   62:iconst_1        
	//*  37   63:iand            
	//*  38   64:iconst_1        
	//*  39   65:icmpne          79
			k = i + GeneratedMessageV3.computeStringSize(3, identifierValue_);
	//   40   68:iload_1         
	//   41   69:iconst_3        
	//   42   70:aload_0         
	//   43   71:getfield        #90  <Field Object identifierValue_>
	//   44   74:invokestatic    #387 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   45   77:iadd            
	//   46   78:istore_2        
		i = k;
	//   47   79:iload_2         
	//   48   80:istore_1        
		if((bitField0_ & 2) == 2)
	//*  49   81:aload_0         
	//*  50   82:getfield        #149 <Field int bitField0_>
	//*  51   85:iconst_2        
	//*  52   86:iand            
	//*  53   87:iconst_2        
	//*  54   88:icmpne          102
			i = k + CodedOutputStream.computeUInt64Size(4, positiveIntValue_);
	//   55   91:iload_2         
	//   56   92:iconst_4        
	//   57   93:aload_0         
	//   58   94:getfield        #92  <Field long positiveIntValue_>
	//   59   97:invokestatic    #391 <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   60  100:iadd            
	//   61  101:istore_1        
		k = i;
	//   62  102:iload_1         
	//   63  103:istore_2        
		if((bitField0_ & 4) == 4)
	//*  64  104:aload_0         
	//*  65  105:getfield        #149 <Field int bitField0_>
	//*  66  108:iconst_4        
	//*  67  109:iand            
	//*  68  110:iconst_4        
	//*  69  111:icmpne          125
			k = i + CodedOutputStream.computeInt64Size(5, negativeIntValue_);
	//   70  114:iload_1         
	//   71  115:iconst_5        
	//   72  116:aload_0         
	//   73  117:getfield        #94  <Field long negativeIntValue_>
	//   74  120:invokestatic    #394 <Method int CodedOutputStream.computeInt64Size(int, long)>
	//   75  123:iadd            
	//   76  124:istore_2        
		i = k;
	//   77  125:iload_2         
	//   78  126:istore_1        
		if((bitField0_ & 8) == 8)
	//*  79  127:aload_0         
	//*  80  128:getfield        #149 <Field int bitField0_>
	//*  81  131:bipush          8
	//*  82  133:iand            
	//*  83  134:bipush          8
	//*  84  136:icmpne          151
			i = k + CodedOutputStream.computeDoubleSize(6, doubleValue_);
	//   85  139:iload_2         
	//   86  140:bipush          6
	//   87  142:aload_0         
	//   88  143:getfield        #96  <Field double doubleValue_>
	//   89  146:invokestatic    #398 <Method int CodedOutputStream.computeDoubleSize(int, double)>
	//   90  149:iadd            
	//   91  150:istore_1        
		k = i;
	//   92  151:iload_1         
	//   93  152:istore_2        
		if((bitField0_ & 0x10) == 16)
	//*  94  153:aload_0         
	//*  95  154:getfield        #149 <Field int bitField0_>
	//*  96  157:bipush          16
	//*  97  159:iand            
	//*  98  160:bipush          16
	//*  99  162:icmpne          177
			k = i + CodedOutputStream.computeBytesSize(7, stringValue_);
	//  100  165:iload_1         
	//  101  166:bipush          7
	//  102  168:aload_0         
	//  103  169:getfield        #103 <Field ByteString stringValue_>
	//  104  172:invokestatic    #402 <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//  105  175:iadd            
	//  106  176:istore_2        
		i = k;
	//  107  177:iload_2         
	//  108  178:istore_1        
		if((bitField0_ & 0x20) == 32)
	//* 109  179:aload_0         
	//* 110  180:getfield        #149 <Field int bitField0_>
	//* 111  183:bipush          32
	//* 112  185:iand            
	//* 113  186:bipush          32
	//* 114  188:icmpne          203
			i = k + GeneratedMessageV3.computeStringSize(8, aggregateValue_);
	//  115  191:iload_2         
	//  116  192:bipush          8
	//  117  194:aload_0         
	//  118  195:getfield        #105 <Field Object aggregateValue_>
	//  119  198:invokestatic    #387 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//  120  201:iadd            
	//  121  202:istore_1        
		i += unknownFields.getSerializedSize();
	//  122  203:iload_1         
	//  123  204:aload_0         
	//  124  205:getfield        #174 <Field UnknownFieldSet unknownFields>
	//  125  208:invokevirtual   #404 <Method int UnknownFieldSet.getSerializedSize()>
	//  126  211:iadd            
	//  127  212:istore_1        
		memoizedSize = i;
	//  128  213:aload_0         
	//  129  214:iload_1         
	//  130  215:putfield        #375 <Field int memoizedSize>
		return i;
	//  131  218:iload_1         
	//  132  219:ireturn         
	}

	public ByteString getStringValue()
	{
		return stringValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field ByteString stringValue_>
	//    2    4:areturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasAggregateValue()
	{
		return (bitField0_ & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field int bitField0_>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasDoubleValue()
	{
		return (bitField0_ & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field int bitField0_>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasIdentifierValue()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasNegativeIntValue()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasPositiveIntValue()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasStringValue()
	{
		return (bitField0_ & 0x10) == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field int bitField0_>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:bipush          16
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
	//*   1    1:getfield        #409 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #409 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #411 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #415 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(getNameCount() > 0)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #417 <Method int getNameCount()>
	//*  15   29:ifle            52
			i = (j * 37 + 2) * 53 + getNameList().hashCode();
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_2        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #288 <Method List getNameList()>
	//   25   45:invokeinterface #418 <Method int List.hashCode()>
	//   26   50:iadd            
	//   27   51:istore_1        
		j = i;
	//   28   52:iload_1         
	//   29   53:istore_2        
		if(hasIdentifierValue())
	//*  30   54:aload_0         
	//*  31   55:invokevirtual   #293 <Method boolean hasIdentifierValue()>
	//*  32   58:ifeq            79
			j = (i * 37 + 3) * 53 + getIdentifierValue().hashCode();
	//   33   61:iload_1         
	//   34   62:bipush          37
	//   35   64:imul            
	//   36   65:iconst_3        
	//   37   66:iadd            
	//   38   67:bipush          53
	//   39   69:imul            
	//   40   70:aload_0         
	//   41   71:invokevirtual   #297 <Method String getIdentifierValue()>
	//   42   74:invokevirtual   #419 <Method int String.hashCode()>
	//   43   77:iadd            
	//   44   78:istore_2        
		i = j;
	//   45   79:iload_2         
	//   46   80:istore_1        
		if(hasPositiveIntValue())
	//*  47   81:aload_0         
	//*  48   82:invokevirtual   #303 <Method boolean hasPositiveIntValue()>
	//*  49   85:ifeq            106
			i = (j * 37 + 4) * 53 + Internal.hashLong(getPositiveIntValue());
	//   50   88:iload_2         
	//   51   89:bipush          37
	//   52   91:imul            
	//   53   92:iconst_4        
	//   54   93:iadd            
	//   55   94:bipush          53
	//   56   96:imul            
	//   57   97:aload_0         
	//   58   98:invokevirtual   #306 <Method long getPositiveIntValue()>
	//   59  101:invokestatic    #425 <Method int Internal.hashLong(long)>
	//   60  104:iadd            
	//   61  105:istore_1        
		j = i;
	//   62  106:iload_1         
	//   63  107:istore_2        
		if(hasNegativeIntValue())
	//*  64  108:aload_0         
	//*  65  109:invokevirtual   #309 <Method boolean hasNegativeIntValue()>
	//*  66  112:ifeq            133
			j = (i * 37 + 5) * 53 + Internal.hashLong(getNegativeIntValue());
	//   67  115:iload_1         
	//   68  116:bipush          37
	//   69  118:imul            
	//   70  119:iconst_5        
	//   71  120:iadd            
	//   72  121:bipush          53
	//   73  123:imul            
	//   74  124:aload_0         
	//   75  125:invokevirtual   #312 <Method long getNegativeIntValue()>
	//   76  128:invokestatic    #425 <Method int Internal.hashLong(long)>
	//   77  131:iadd            
	//   78  132:istore_2        
		i = j;
	//   79  133:iload_2         
	//   80  134:istore_1        
		if(hasDoubleValue())
	//*  81  135:aload_0         
	//*  82  136:invokevirtual   #315 <Method boolean hasDoubleValue()>
	//*  83  139:ifeq            164
			i = (j * 37 + 6) * 53 + Internal.hashLong(Double.doubleToLongBits(getDoubleValue()));
	//   84  142:iload_2         
	//   85  143:bipush          37
	//   86  145:imul            
	//   87  146:bipush          6
	//   88  148:iadd            
	//   89  149:bipush          53
	//   90  151:imul            
	//   91  152:aload_0         
	//   92  153:invokevirtual   #318 <Method double getDoubleValue()>
	//   93  156:invokestatic    #324 <Method long Double.doubleToLongBits(double)>
	//   94  159:invokestatic    #425 <Method int Internal.hashLong(long)>
	//   95  162:iadd            
	//   96  163:istore_1        
		j = i;
	//   97  164:iload_1         
	//   98  165:istore_2        
		if(hasStringValue())
	//*  99  166:aload_0         
	//* 100  167:invokevirtual   #327 <Method boolean hasStringValue()>
	//* 101  170:ifeq            192
			j = (i * 37 + 7) * 53 + getStringValue().hashCode();
	//  102  173:iload_1         
	//  103  174:bipush          37
	//  104  176:imul            
	//  105  177:bipush          7
	//  106  179:iadd            
	//  107  180:bipush          53
	//  108  182:imul            
	//  109  183:aload_0         
	//  110  184:invokevirtual   #330 <Method ByteString getStringValue()>
	//  111  187:invokevirtual   #426 <Method int ByteString.hashCode()>
	//  112  190:iadd            
	//  113  191:istore_2        
		i = j;
	//  114  192:iload_2         
	//  115  193:istore_1        
		if(hasAggregateValue())
	//* 116  194:aload_0         
	//* 117  195:invokevirtual   #334 <Method boolean hasAggregateValue()>
	//* 118  198:ifeq            220
			i = (j * 37 + 8) * 53 + getAggregateValue().hashCode();
	//  119  201:iload_2         
	//  120  202:bipush          37
	//  121  204:imul            
	//  122  205:bipush          8
	//  123  207:iadd            
	//  124  208:bipush          53
	//  125  210:imul            
	//  126  211:aload_0         
	//  127  212:invokevirtual   #337 <Method String getAggregateValue()>
	//  128  215:invokevirtual   #419 <Method int String.hashCode()>
	//  129  218:iadd            
	//  130  219:istore_1        
		i = i * 29 + unknownFields.hashCode();
	//  131  220:iload_1         
	//  132  221:bipush          29
	//  133  223:imul            
	//  134  224:aload_0         
	//  135  225:getfield        #174 <Field UnknownFieldSet unknownFields>
	//  136  228:invokevirtual   #427 <Method int UnknownFieldSet.hashCode()>
	//  137  231:iadd            
	//  138  232:istore_1        
		memoizedHashCode = i;
	//  139  233:aload_0         
	//  140  234:iload_1         
	//  141  235:putfield        #409 <Field int memoizedHashCode>
		return i;
	//  142  238:iload_1         
	//  143  239:ireturn         
	}

	protected  internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$24700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$UninterpretedOption, com/google/protobuf/DescriptorProtos$UninterpretedOption$Builder);
	//    0    0:invokestatic    #432 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$24700()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$UninterpretedOption>
	//    2    5:ldc1            #13  <Class DescriptorProtos$UninterpretedOption$Builder>
	//    3    7:invokevirtual   #438 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field byte memoizedIsInitialized>
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
		for(int i = 0; i < getNameCount(); i++)
	//*  12   18:iconst_0        
	//*  13   19:istore_1        
	//*  14   20:iload_1         
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #417 <Method int getNameCount()>
	//*  17   25:icmpge          53
			if(!getName(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #441 <Method DescriptorProtos$UninterpretedOption$NamePart getName(int)>
	//*  21   33:invokevirtual   #443 <Method boolean DescriptorProtos$UninterpretedOption$NamePart.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #78  <Field byte memoizedIsInitialized>
				return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
			}

	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_1        
	//*  32   50:goto            20
		memoizedIsInitialized = 1;
	//   33   53:aload_0         
	//   34   54:iconst_1        
	//   35   55:putfield        #78  <Field byte memoizedIsInitialized>
		return true;
	//   36   58:iconst_1        
	//   37   59:ireturn         
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #446 <Method DescriptorProtos$UninterpretedOption$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #13  <Class DescriptorProtos$UninterpretedOption$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #450 <Method void DescriptorProtos$UninterpretedOption$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #453 <Method DescriptorProtos$UninterpretedOption$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #456 <Method DescriptorProtos$UninterpretedOption$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #453 <Method DescriptorProtos$UninterpretedOption$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #71  <Field DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #13  <Class DescriptorProtos$UninterpretedOption$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #460 <Method void DescriptorProtos$UninterpretedOption$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #13  <Class DescriptorProtos$UninterpretedOption$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #460 <Method void DescriptorProtos$UninterpretedOption$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #229 <Method DescriptorProtos$UninterpretedOption$Builder DescriptorProtos$UninterpretedOption$Builder.mergeFrom(DescriptorProtos$UninterpretedOption)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method DescriptorProtos$UninterpretedOption$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method DescriptorProtos$UninterpretedOption$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		for(int i = 0; i < name_.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #86  <Field List name_>
	//*   5    7:invokeinterface #365 <Method int List.size()>
	//*   6   12:icmpge          40
			codedoutputstream.writeMessage(2, (MessageLite)name_.get(i));
	//    7   15:aload_1         
	//    8   16:iconst_2        
	//    9   17:aload_0         
	//   10   18:getfield        #86  <Field List name_>
	//   11   21:iload_2         
	//   12   22:invokeinterface #361 <Method Object List.get(int)>
	//   13   27:checkcast       #377 <Class MessageLite>
	//   14   30:invokevirtual   #466 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   15   33:iload_2         
	//   16   34:iconst_1        
	//   17   35:iadd            
	//   18   36:istore_2        
	//*  19   37:goto            2
		if((bitField0_ & 1) == 1)
	//*  20   40:aload_0         
	//*  21   41:getfield        #149 <Field int bitField0_>
	//*  22   44:iconst_1        
	//*  23   45:iand            
	//*  24   46:iconst_1        
	//*  25   47:icmpne          59
			GeneratedMessageV3.writeString(codedoutputstream, 3, identifierValue_);
	//   26   50:aload_1         
	//   27   51:iconst_3        
	//   28   52:aload_0         
	//   29   53:getfield        #90  <Field Object identifierValue_>
	//   30   56:invokestatic    #470 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 2) == 2)
	//*  31   59:aload_0         
	//*  32   60:getfield        #149 <Field int bitField0_>
	//*  33   63:iconst_2        
	//*  34   64:iand            
	//*  35   65:iconst_2        
	//*  36   66:icmpne          78
			codedoutputstream.writeUInt64(4, positiveIntValue_);
	//   37   69:aload_1         
	//   38   70:iconst_4        
	//   39   71:aload_0         
	//   40   72:getfield        #92  <Field long positiveIntValue_>
	//   41   75:invokevirtual   #474 <Method void CodedOutputStream.writeUInt64(int, long)>
		if((bitField0_ & 4) == 4)
	//*  42   78:aload_0         
	//*  43   79:getfield        #149 <Field int bitField0_>
	//*  44   82:iconst_4        
	//*  45   83:iand            
	//*  46   84:iconst_4        
	//*  47   85:icmpne          97
			codedoutputstream.writeInt64(5, negativeIntValue_);
	//   48   88:aload_1         
	//   49   89:iconst_5        
	//   50   90:aload_0         
	//   51   91:getfield        #94  <Field long negativeIntValue_>
	//   52   94:invokevirtual   #477 <Method void CodedOutputStream.writeInt64(int, long)>
		if((bitField0_ & 8) == 8)
	//*  53   97:aload_0         
	//*  54   98:getfield        #149 <Field int bitField0_>
	//*  55  101:bipush          8
	//*  56  103:iand            
	//*  57  104:bipush          8
	//*  58  106:icmpne          119
			codedoutputstream.writeDouble(6, doubleValue_);
	//   59  109:aload_1         
	//   60  110:bipush          6
	//   61  112:aload_0         
	//   62  113:getfield        #96  <Field double doubleValue_>
	//   63  116:invokevirtual   #481 <Method void CodedOutputStream.writeDouble(int, double)>
		if((bitField0_ & 0x10) == 16)
	//*  64  119:aload_0         
	//*  65  120:getfield        #149 <Field int bitField0_>
	//*  66  123:bipush          16
	//*  67  125:iand            
	//*  68  126:bipush          16
	//*  69  128:icmpne          141
			codedoutputstream.writeBytes(7, stringValue_);
	//   70  131:aload_1         
	//   71  132:bipush          7
	//   72  134:aload_0         
	//   73  135:getfield        #103 <Field ByteString stringValue_>
	//   74  138:invokevirtual   #485 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if((bitField0_ & 0x20) == 32)
	//*  75  141:aload_0         
	//*  76  142:getfield        #149 <Field int bitField0_>
	//*  77  145:bipush          32
	//*  78  147:iand            
	//*  79  148:bipush          32
	//*  80  150:icmpne          163
			GeneratedMessageV3.writeString(codedoutputstream, 8, aggregateValue_);
	//   81  153:aload_1         
	//   82  154:bipush          8
	//   83  156:aload_0         
	//   84  157:getfield        #105 <Field Object aggregateValue_>
	//   85  160:invokestatic    #470 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		unknownFields.writeTo(codedoutputstream);
	//   86  163:aload_0         
	//   87  164:getfield        #174 <Field UnknownFieldSet unknownFields>
	//   88  167:aload_1         
	//   89  168:invokevirtual   #487 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   90  171:return          
	}

	public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
	private static final DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE = new DescriptorProtos$UninterpretedOption();
	public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
	public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
	public static final int NAME_FIELD_NUMBER = 2;
	public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.UninterpretedOption parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.UninterpretedOption(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$UninterpretedOption>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$UninterpretedOption(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$UninterpretedOption parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
	public static final int STRING_VALUE_FIELD_NUMBER = 7;
	private static final long serialVersionUID = 0L;
	private volatile Object aggregateValue_;
	private int bitField0_;
	private double doubleValue_;
	private volatile Object identifierValue_;
	private byte memoizedIsInitialized;
	private List name_;
	private long negativeIntValue_;
	private long positiveIntValue_;
	private ByteString stringValue_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$UninterpretedOption>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void DescriptorProtos$UninterpretedOption()>
	//    3    7:putstatic       #71  <Field DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE>
	//    4   10:new             #11  <Class DescriptorProtos$UninterpretedOption$1>
	//    5   13:dup             
	//    6   14:invokespecial   #72  <Method void DescriptorProtos$UninterpretedOption$1()>
	//    7   17:putstatic       #74  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static List access$26000(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		return descriptorprotos$uninterpretedoption.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field List name_>
	//    2    4:areturn         
	}

*/


/*
	static List access$26002(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption, List list)
	{
		descriptorprotos$uninterpretedoption.name_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field List name_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$26100(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		return descriptorprotos$uninterpretedoption.identifierValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Object identifierValue_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$26102(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption, Object obj)
	{
		descriptorprotos$uninterpretedoption.identifierValue_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field Object identifierValue_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static long access$26202(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption, long l)
	{
		descriptorprotos$uninterpretedoption.positiveIntValue_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #92  <Field long positiveIntValue_>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/


/*
	static long access$26302(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption, long l)
	{
		descriptorprotos$uninterpretedoption.negativeIntValue_ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #94  <Field long negativeIntValue_>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/


/*
	static double access$26402(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption, double d)
	{
		descriptorprotos$uninterpretedoption.doubleValue_ = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #96  <Field double doubleValue_>
		return d;
	//    3    5:dload_1         
	//    4    6:dreturn         
	}

*/


/*
	static ByteString access$26502(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption, ByteString bytestring)
	{
		descriptorprotos$uninterpretedoption.stringValue_ = bytestring;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field ByteString stringValue_>
		return bytestring;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$26600(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption)
	{
		return descriptorprotos$uninterpretedoption.aggregateValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Object aggregateValue_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$26602(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption, Object obj)
	{
		descriptorprotos$uninterpretedoption.aggregateValue_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field Object aggregateValue_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$26702(DescriptorProtos$UninterpretedOption descriptorprotos$uninterpretedoption, int i)
	{
		descriptorprotos$uninterpretedoption.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #149 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$UninterpretedOption()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #78  <Field byte memoizedIsInitialized>
		name_ = Collections.emptyList();
	//    5    9:aload_0         
	//    6   10:invokestatic    #84  <Method List Collections.emptyList()>
	//    7   13:putfield        #86  <Field List name_>
		identifierValue_ = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #88  <String "">
	//   10   19:putfield        #90  <Field Object identifierValue_>
		positiveIntValue_ = 0L;
	//   11   22:aload_0         
	//   12   23:lconst_0        
	//   13   24:putfield        #92  <Field long positiveIntValue_>
		negativeIntValue_ = 0L;
	//   14   27:aload_0         
	//   15   28:lconst_0        
	//   16   29:putfield        #94  <Field long negativeIntValue_>
		doubleValue_ = 0.0D;
	//   17   32:aload_0         
	//   18   33:dconst_0        
	//   19   34:putfield        #96  <Field double doubleValue_>
		stringValue_ = ByteString.EMPTY;
	//   20   37:aload_0         
	//   21   38:getstatic       #101 <Field ByteString ByteString.EMPTY>
	//   22   41:putfield        #103 <Field ByteString stringValue_>
		aggregateValue_ = "";
	//   23   44:aload_0         
	//   24   45:ldc1            #88  <String "">
	//   25   47:putfield        #105 <Field Object aggregateValue_>
	//   26   50:return          
	}

	private DescriptorProtos$UninterpretedOption(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		boolean flag5;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void DescriptorProtos$UninterpretedOption()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #112 <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #113 <Method void NullPointerException()>
	//    7   15:athrow          
		flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #119 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          11
		flag5 = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L14:
		boolean flag2;
		boolean flag3;
		boolean flag4;
		if(flag5)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            550
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
	//   23   41:invokevirtual   #125 <Method int CodedInputStream.readTag()>
	//   24   44:istore          10
		i;
	//   25   46:iload           10
		JVM INSTR lookupswitch 8: default 646
	//	               0: 649
	//	               18: 162
	//	               26: 238
	//	               32: 297
	//	               40: 343
	//	               49: 389
	//	               58: 436
	//	               66: 483;
	//   26   48:lookupswitch    8: default 646
	//	               0: 649
	//	               18: 162
	//	               26: 238
	//	               32: 297
	//	               40: 343
	//	               49: 389
	//	               58: 436
	//	               66: 483
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
		boolean flag1;
		boolean flag6;
		flag6 = flag;
	//   27  124:iload_3         
	//   28  125:istore          9
		flag1 = flag5;
	//   29  127:iload           8
	//   30  129:istore          4
		flag3 = flag;
	//   31  131:iload_3         
	//   32  132:istore          6
		flag4 = flag;
	//   33  134:iload_3         
	//   34  135:istore          7
		flag2 = flag;
	//   35  137:iload_3         
	//   36  138:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
	//*  37  140:aload_0         
	//*  38  141:aload_1         
	//*  39  142:aload           11
	//*  40  144:aload_2         
	//*  41  145:iload           10
	//*  42  147:invokevirtual   #129 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  43  150:ifne            540
		{
			flag1 = true;
	//   44  153:iconst_1        
	//   45  154:istore          4
			flag6 = flag;
	//   46  156:iload_3         
	//   47  157:istore          9
		}
		  goto _L10
	//*  48  159:goto            540
_L3:
		flag1 = flag;
	//   49  162:iload_3         
	//   50  163:istore          4
		if((flag & true)) goto _L12; else goto _L11
	//   51  165:iload_3         
	//   52  166:iconst_1        
	//   53  167:iand            
	//   54  168:iconst_1        
	//   55  169:icmpeq          197
_L11:
		flag3 = flag;
	//   56  172:iload_3         
	//   57  173:istore          6
		flag4 = flag;
	//   58  175:iload_3         
	//   59  176:istore          7
		flag2 = flag;
	//   60  178:iload_3         
	//   61  179:istore          5
		name_ = ((List) (new ArrayList()));
	//   62  181:aload_0         
	//   63  182:new             #131 <Class ArrayList>
	//   64  185:dup             
	//   65  186:invokespecial   #132 <Method void ArrayList()>
	//   66  189:putfield        #86  <Field List name_>
		flag1 = flag | true;
	//   67  192:iload_3         
	//   68  193:iconst_1        
	//   69  194:ior             
	//   70  195:istore          4
_L12:
		flag3 = flag1;
	//   71  197:iload           4
	//   72  199:istore          6
		flag4 = flag1;
	//   73  201:iload           4
	//   74  203:istore          7
		flag2 = flag1;
	//   75  205:iload           4
	//   76  207:istore          5
		name_.add(((Object) (codedinputstream.readMessage(NamePart.PARSER, extensionregistrylite))));
	//   77  209:aload_0         
	//   78  210:getfield        #86  <Field List name_>
	//   79  213:aload_1         
	//   80  214:getstatic       #133 <Field Parser DescriptorProtos$UninterpretedOption$NamePart.PARSER>
	//   81  217:aload_2         
	//   82  218:invokevirtual   #137 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//   83  221:invokeinterface #143 <Method boolean List.add(Object)>
	//   84  226:pop             
		flag6 = flag1;
	//   85  227:iload           4
	//   86  229:istore          9
		flag1 = flag5;
	//   87  231:iload           8
	//   88  233:istore          4
		  goto _L10
	//*  89  235:goto            540
_L4:
		flag3 = flag;
	//   90  238:iload_3         
	//   91  239:istore          6
		flag4 = flag;
	//   92  241:iload_3         
	//   93  242:istore          7
		flag2 = flag;
	//   94  244:iload_3         
	//   95  245:istore          5
		ByteString bytestring = codedinputstream.readBytes();
	//   96  247:aload_1         
	//   97  248:invokevirtual   #147 <Method ByteString CodedInputStream.readBytes()>
	//   98  251:astore          12
		flag3 = flag;
	//   99  253:iload_3         
	//  100  254:istore          6
		flag4 = flag;
	//  101  256:iload_3         
	//  102  257:istore          7
		flag2 = flag;
	//  103  259:iload_3         
	//  104  260:istore          5
		bitField0_ = bitField0_ | 1;
	//  105  262:aload_0         
	//  106  263:aload_0         
	//  107  264:getfield        #149 <Field int bitField0_>
	//  108  267:iconst_1        
	//  109  268:ior             
	//  110  269:putfield        #149 <Field int bitField0_>
		flag3 = flag;
	//  111  272:iload_3         
	//  112  273:istore          6
		flag4 = flag;
	//  113  275:iload_3         
	//  114  276:istore          7
		flag2 = flag;
	//  115  278:iload_3         
	//  116  279:istore          5
		identifierValue_ = ((Object) (bytestring));
	//  117  281:aload_0         
	//  118  282:aload           12
	//  119  284:putfield        #90  <Field Object identifierValue_>
		flag6 = flag;
	//  120  287:iload_3         
	//  121  288:istore          9
		flag1 = flag5;
	//  122  290:iload           8
	//  123  292:istore          4
		  goto _L10
	//* 124  294:goto            540
_L5:
		flag3 = flag;
	//  125  297:iload_3         
	//  126  298:istore          6
		flag4 = flag;
	//  127  300:iload_3         
	//  128  301:istore          7
		flag2 = flag;
	//  129  303:iload_3         
	//  130  304:istore          5
		bitField0_ = bitField0_ | 2;
	//  131  306:aload_0         
	//  132  307:aload_0         
	//  133  308:getfield        #149 <Field int bitField0_>
	//  134  311:iconst_2        
	//  135  312:ior             
	//  136  313:putfield        #149 <Field int bitField0_>
		flag3 = flag;
	//  137  316:iload_3         
	//  138  317:istore          6
		flag4 = flag;
	//  139  319:iload_3         
	//  140  320:istore          7
		flag2 = flag;
	//  141  322:iload_3         
	//  142  323:istore          5
		positiveIntValue_ = codedinputstream.readUInt64();
	//  143  325:aload_0         
	//  144  326:aload_1         
	//  145  327:invokevirtual   #153 <Method long CodedInputStream.readUInt64()>
	//  146  330:putfield        #92  <Field long positiveIntValue_>
		flag6 = flag;
	//  147  333:iload_3         
	//  148  334:istore          9
		flag1 = flag5;
	//  149  336:iload           8
	//  150  338:istore          4
		  goto _L10
	//* 151  340:goto            540
_L6:
		flag3 = flag;
	//  152  343:iload_3         
	//  153  344:istore          6
		flag4 = flag;
	//  154  346:iload_3         
	//  155  347:istore          7
		flag2 = flag;
	//  156  349:iload_3         
	//  157  350:istore          5
		bitField0_ = bitField0_ | 4;
	//  158  352:aload_0         
	//  159  353:aload_0         
	//  160  354:getfield        #149 <Field int bitField0_>
	//  161  357:iconst_4        
	//  162  358:ior             
	//  163  359:putfield        #149 <Field int bitField0_>
		flag3 = flag;
	//  164  362:iload_3         
	//  165  363:istore          6
		flag4 = flag;
	//  166  365:iload_3         
	//  167  366:istore          7
		flag2 = flag;
	//  168  368:iload_3         
	//  169  369:istore          5
		negativeIntValue_ = codedinputstream.readInt64();
	//  170  371:aload_0         
	//  171  372:aload_1         
	//  172  373:invokevirtual   #156 <Method long CodedInputStream.readInt64()>
	//  173  376:putfield        #94  <Field long negativeIntValue_>
		flag6 = flag;
	//  174  379:iload_3         
	//  175  380:istore          9
		flag1 = flag5;
	//  176  382:iload           8
	//  177  384:istore          4
		  goto _L10
	//* 178  386:goto            540
_L7:
		flag3 = flag;
	//  179  389:iload_3         
	//  180  390:istore          6
		flag4 = flag;
	//  181  392:iload_3         
	//  182  393:istore          7
		flag2 = flag;
	//  183  395:iload_3         
	//  184  396:istore          5
		bitField0_ = bitField0_ | 8;
	//  185  398:aload_0         
	//  186  399:aload_0         
	//  187  400:getfield        #149 <Field int bitField0_>
	//  188  403:bipush          8
	//  189  405:ior             
	//  190  406:putfield        #149 <Field int bitField0_>
		flag3 = flag;
	//  191  409:iload_3         
	//  192  410:istore          6
		flag4 = flag;
	//  193  412:iload_3         
	//  194  413:istore          7
		flag2 = flag;
	//  195  415:iload_3         
	//  196  416:istore          5
		doubleValue_ = codedinputstream.readDouble();
	//  197  418:aload_0         
	//  198  419:aload_1         
	//  199  420:invokevirtual   #160 <Method double CodedInputStream.readDouble()>
	//  200  423:putfield        #96  <Field double doubleValue_>
		flag6 = flag;
	//  201  426:iload_3         
	//  202  427:istore          9
		flag1 = flag5;
	//  203  429:iload           8
	//  204  431:istore          4
		  goto _L10
	//* 205  433:goto            540
_L8:
		flag3 = flag;
	//  206  436:iload_3         
	//  207  437:istore          6
		flag4 = flag;
	//  208  439:iload_3         
	//  209  440:istore          7
		flag2 = flag;
	//  210  442:iload_3         
	//  211  443:istore          5
		bitField0_ = bitField0_ | 0x10;
	//  212  445:aload_0         
	//  213  446:aload_0         
	//  214  447:getfield        #149 <Field int bitField0_>
	//  215  450:bipush          16
	//  216  452:ior             
	//  217  453:putfield        #149 <Field int bitField0_>
		flag3 = flag;
	//  218  456:iload_3         
	//  219  457:istore          6
		flag4 = flag;
	//  220  459:iload_3         
	//  221  460:istore          7
		flag2 = flag;
	//  222  462:iload_3         
	//  223  463:istore          5
		stringValue_ = codedinputstream.readBytes();
	//  224  465:aload_0         
	//  225  466:aload_1         
	//  226  467:invokevirtual   #147 <Method ByteString CodedInputStream.readBytes()>
	//  227  470:putfield        #103 <Field ByteString stringValue_>
		flag6 = flag;
	//  228  473:iload_3         
	//  229  474:istore          9
		flag1 = flag5;
	//  230  476:iload           8
	//  231  478:istore          4
		  goto _L10
	//* 232  480:goto            540
_L9:
		flag3 = flag;
	//  233  483:iload_3         
	//  234  484:istore          6
		flag4 = flag;
	//  235  486:iload_3         
	//  236  487:istore          7
		flag2 = flag;
	//  237  489:iload_3         
	//  238  490:istore          5
		bytestring = codedinputstream.readBytes();
	//  239  492:aload_1         
	//  240  493:invokevirtual   #147 <Method ByteString CodedInputStream.readBytes()>
	//  241  496:astore          12
		flag3 = flag;
	//  242  498:iload_3         
	//  243  499:istore          6
		flag4 = flag;
	//  244  501:iload_3         
	//  245  502:istore          7
		flag2 = flag;
	//  246  504:iload_3         
	//  247  505:istore          5
		bitField0_ = bitField0_ | 0x20;
	//  248  507:aload_0         
	//  249  508:aload_0         
	//  250  509:getfield        #149 <Field int bitField0_>
	//  251  512:bipush          32
	//  252  514:ior             
	//  253  515:putfield        #149 <Field int bitField0_>
		flag3 = flag;
	//  254  518:iload_3         
	//  255  519:istore          6
		flag4 = flag;
	//  256  521:iload_3         
	//  257  522:istore          7
		flag2 = flag;
	//  258  524:iload_3         
	//  259  525:istore          5
		aggregateValue_ = ((Object) (bytestring));
	//  260  527:aload_0         
	//  261  528:aload           12
	//  262  530:putfield        #105 <Field Object aggregateValue_>
		flag1 = flag5;
	//  263  533:iload           8
	//  264  535:istore          4
		flag6 = flag;
	//  265  537:iload_3         
	//  266  538:istore          9
_L10:
		flag = flag6;
	//  267  540:iload           9
	//  268  542:istore_3        
		flag5 = flag1;
	//  269  543:iload           4
	//  270  545:istore          8
		if(true) goto _L14; else goto _L13
	//  271  547:goto            26
_L13:
		if((flag & true))
	//* 272  550:iload_3         
	//* 273  551:iconst_1        
	//* 274  552:iand            
	//* 275  553:iconst_1        
	//* 276  554:icmpne          568
			name_ = Collections.unmodifiableList(name_);
	//  277  557:aload_0         
	//  278  558:aload_0         
	//  279  559:getfield        #86  <Field List name_>
	//  280  562:invokestatic    #164 <Method List Collections.unmodifiableList(List)>
	//  281  565:putfield        #86  <Field List name_>
		unknownFields = builder.build();
	//  282  568:aload_0         
	//  283  569:aload           11
	//  284  571:invokevirtual   #170 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  285  574:putfield        #174 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  286  577:aload_0         
	//  287  578:invokevirtual   #177 <Method void makeExtensionsImmutable()>
		return;
	//  288  581:return          
		codedinputstream;
	//  289  582:astore_1        
		flag2 = flag3;
	//  290  583:iload           6
	//  291  585:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  292  587:aload_1         
	//  293  588:aload_0         
	//  294  589:invokevirtual   #181 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  295  592:athrow          
		codedinputstream;
	//  296  593:astore_1        
		flag2 = flag4;
	//  297  594:iload           7
	//  298  596:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  299  598:new             #108 <Class InvalidProtocolBufferException>
	//  300  601:dup             
	//  301  602:aload_1         
	//  302  603:invokespecial   #184 <Method void InvalidProtocolBufferException(IOException)>
	//  303  606:aload_0         
	//  304  607:invokevirtual   #181 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  305  610:athrow          
		codedinputstream;
	//  306  611:astore_1        
		if((flag2 & true))
	//* 307  612:iload           5
	//* 308  614:iconst_1        
	//* 309  615:iand            
	//* 310  616:iconst_1        
	//* 311  617:icmpne          631
			name_ = Collections.unmodifiableList(name_);
	//  312  620:aload_0         
	//  313  621:aload_0         
	//  314  622:getfield        #86  <Field List name_>
	//  315  625:invokestatic    #164 <Method List Collections.unmodifiableList(List)>
	//  316  628:putfield        #86  <Field List name_>
		unknownFields = builder.build();
	//  317  631:aload_0         
	//  318  632:aload           11
	//  319  634:invokevirtual   #170 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  320  637:putfield        #174 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  321  640:aload_0         
	//  322  641:invokevirtual   #177 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  323  644:aload_1         
	//  324  645:athrow          
	//* 325  646:goto            124
_L2:
		flag1 = true;
	//  326  649:iconst_1        
	//  327  650:istore          4
		flag6 = flag;
	//  328  652:iload_3         
	//  329  653:istore          9
		  goto _L10
	//* 330  655:goto            540
	}

	DescriptorProtos$UninterpretedOption(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #188 <Method void DescriptorProtos$UninterpretedOption(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$UninterpretedOption(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #191 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #78  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$UninterpretedOption(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #195 <Method void DescriptorProtos$UninterpretedOption(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
