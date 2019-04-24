// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, ByteString, RepeatedFieldBuilderV3, GeneratedMessageV3, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$UninterpretedOption$Builder extends GeneratedMessageV3.Builder
	implements 
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

	public DescriptorProtos$UninterpretedOption$Builder addAllName(Iterable iterable)
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

	public DescriptorProtos$UninterpretedOption$Builder addName(int i, .Builder builder)
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

	public DescriptorProtos$UninterpretedOption$Builder addName(int i,  )
	{
		if(nameBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
	//*   2    4:ifnonnull       40
		{
			if( == null)
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
				name_.add(i, ((Object) ()));
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
			nameBuilder_.addMessage(i, ((AbstractMessage) ()));
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

	public DescriptorProtos$UninterpretedOption$Builder addName(.Builder builder)
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

	public DescriptorProtos$UninterpretedOption$Builder addName( )
	{
		if(nameBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
	//*   2    4:ifnonnull       40
		{
			if( == null)
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
				name_.add(((Object) ()));
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
			nameBuilder_.addMessage(((AbstractMessage) ()));
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

	public .Builder addNameBuilder()
	{
		return (.Builder)getNameFieldBuilder().addBuilder(((AbstractMessage) (.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method RepeatedFieldBuilderV3 getNameFieldBuilder()>
	//    2    4:invokestatic    #162 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
	//    3    7:invokevirtual   #166 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #129 <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
	//    5   13:areturn         
	}

	public .Builder addNameBuilder(int i)
	{
		return (.Builder)getNameFieldBuilder().addBuilder(i, ((AbstractMessage) (.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method RepeatedFieldBuilderV3 getNameFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #162 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
	//    4    8:invokevirtual   #170 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #129 <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$UninterpretedOption$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$UninterpretedOption$Builder)super.addRepeatedField(fielddescriptor, obj);
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
			DescriptorProtos.UninterpretedOption.access$26002(uninterpretedoption, name_);
	//   31   57:aload           4
	//   32   59:aload_0         
	//   33   60:getfield        #43  <Field List name_>
	//   34   63:invokestatic    #204 <Method List DescriptorProtos$UninterpretedOption.access$26002(DescriptorProtos$UninterpretedOption, List)>
	//   35   66:pop             
		} else
	//*  36   67:goto            83
		{
			DescriptorProtos.UninterpretedOption.access$26002(uninterpretedoption, nameBuilder_.build());
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
		DescriptorProtos.UninterpretedOption.access$26102(uninterpretedoption, identifierValue_);
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
		DescriptorProtos.UninterpretedOption.access$26202(uninterpretedoption, positiveIntValue_);
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
		DescriptorProtos.UninterpretedOption.access$26302(uninterpretedoption, negativeIntValue_);
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
		DescriptorProtos.UninterpretedOption.access$26402(uninterpretedoption, doubleValue_);
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
		DescriptorProtos.UninterpretedOption.access$26502(uninterpretedoption, stringValue_);
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
		DescriptorProtos.UninterpretedOption.access$26602(uninterpretedoption, aggregateValue_);
	//  130  218:aload           4
	//  131  220:aload_0         
	//  132  221:getfield        #56  <Field Object aggregateValue_>
	//  133  224:invokestatic    #234 <Method Object DescriptorProtos$UninterpretedOption.access$26602(DescriptorProtos$UninterpretedOption, Object)>
	//  134  227:pop             
		DescriptorProtos.UninterpretedOption.access$26702(uninterpretedoption, i);
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

	public DescriptorProtos$UninterpretedOption$Builder clear()
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

	public DescriptorProtos$UninterpretedOption$Builder clearAggregateValue()
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

	public DescriptorProtos$UninterpretedOption$Builder clearDoubleValue()
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

	public DescriptorProtos$UninterpretedOption$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$UninterpretedOption$Builder)super.clearField(fielddescriptor);
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

	public DescriptorProtos$UninterpretedOption$Builder clearIdentifierValue()
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

	public DescriptorProtos$UninterpretedOption$Builder clearName()
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

	public DescriptorProtos$UninterpretedOption$Builder clearNegativeIntValue()
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

	public DescriptorProtos$UninterpretedOption$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$UninterpretedOption$Builder)super.clearOneof(oneofdescriptor);
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

	public DescriptorProtos$UninterpretedOption$Builder clearPositiveIntValue()
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

	public DescriptorProtos$UninterpretedOption$Builder clearStringValue()
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

	public DescriptorProtos$UninterpretedOption$Builder clone()
	{
		return (DescriptorProtos$UninterpretedOption$Builder)super.clone();
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

	public  getName(int i)
	{
		if(nameBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
	//*   2    4:ifnonnull       21
			return ()name_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field List name_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #326 <Method Object List.get(int)>
	//    7   17:checkcast       #159 <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    8   20:areturn         
		else
			return ()nameBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #330 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #159 <Class DescriptorProtos$UninterpretedOption$NamePart>
	//   14   32:areturn         
	}

	public .Builder getNameBuilder(int i)
	{
		return (.Builder)getNameFieldBuilder().getBuilder(i);
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

	public OrBuilder getNameOrBuilder(int i)
	{
		if(nameBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
	//*   2    4:ifnonnull       21
			return (OrBuilder)name_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field List name_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #326 <Method Object List.get(int)>
	//    7   17:checkcast       #357 <Class DescriptorProtos$UninterpretedOption$NamePartOrBuilder>
	//    8   20:areturn         
		else
			return (OrBuilder)nameBuilder_.getMessageOrBuilder(i);
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

	public DescriptorProtos$UninterpretedOption$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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

	public DescriptorProtos$UninterpretedOption$Builder mergeFrom(DescriptorProtos.UninterpretedOption uninterpretedoption)
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
			if(!DescriptorProtos.UninterpretedOption.access$26000(uninterpretedoption).isEmpty())
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
					name_ = DescriptorProtos.UninterpretedOption.access$26000(uninterpretedoption);
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
					name_.addAll(((java.util.Collection) (DescriptorProtos.UninterpretedOption.access$26000(uninterpretedoption))));
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
		if(!DescriptorProtos.UninterpretedOption.access$26000(uninterpretedoption).isEmpty())
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
				name_ = DescriptorProtos.UninterpretedOption.access$26000(uninterpretedoption);
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
				nameBuilder_.addAllMessages(((Iterable) (DescriptorProtos.UninterpretedOption.access$26000(uninterpretedoption))));
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
			identifierValue_ = DescriptorProtos.UninterpretedOption.access$26100(uninterpretedoption);
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
			aggregateValue_ = DescriptorProtos.UninterpretedOption.access$26600(uninterpretedoption);
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

	public DescriptorProtos$UninterpretedOption$Builder mergeFrom(Message message)
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

	public final DescriptorProtos$UninterpretedOption$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$UninterpretedOption$Builder)super.mergeUnknownFields(unknownfieldset);
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

	public DescriptorProtos$UninterpretedOption$Builder removeName(int i)
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

	public DescriptorProtos$UninterpretedOption$Builder setAggregateValue(String s)
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

	public DescriptorProtos$UninterpretedOption$Builder setAggregateValueBytes(ByteString bytestring)
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

	public DescriptorProtos$UninterpretedOption$Builder setDoubleValue(double d)
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

	public DescriptorProtos$UninterpretedOption$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$UninterpretedOption$Builder)super.setField(fielddescriptor, obj);
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

	public DescriptorProtos$UninterpretedOption$Builder setIdentifierValue(String s)
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

	public DescriptorProtos$UninterpretedOption$Builder setIdentifierValueBytes(ByteString bytestring)
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

	public DescriptorProtos$UninterpretedOption$Builder setName(int i, .Builder builder)
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

	public DescriptorProtos$UninterpretedOption$Builder setName(int i,  )
	{
		if(nameBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field RepeatedFieldBuilderV3 nameBuilder_>
	//*   2    4:ifnonnull       41
		{
			if( == null)
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
				name_.set(i, ((Object) ()));
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
			nameBuilder_.setMessage(i, ((AbstractMessage) ()));
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

	public DescriptorProtos$UninterpretedOption$Builder setNegativeIntValue(long l)
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

	public DescriptorProtos$UninterpretedOption$Builder setPositiveIntValue(long l)
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

	public DescriptorProtos$UninterpretedOption$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$UninterpretedOption$Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

	public DescriptorProtos$UninterpretedOption$Builder setStringValue(ByteString bytestring)
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

	public final DescriptorProtos$UninterpretedOption$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$UninterpretedOption$Builder)super.setUnknownFields(unknownfieldset);
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

	private DescriptorProtos$UninterpretedOption$Builder()
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

	DescriptorProtos$UninterpretedOption$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void DescriptorProtos$UninterpretedOption$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$UninterpretedOption$Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	DescriptorProtos$UninterpretedOption$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void DescriptorProtos$UninterpretedOption$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
