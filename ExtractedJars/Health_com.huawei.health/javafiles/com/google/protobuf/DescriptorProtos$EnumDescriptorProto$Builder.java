// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, LazyStringArrayList, SingleFieldBuilderV3, RepeatedFieldBuilderV3, 
//			GeneratedMessageV3, LazyStringList, ByteString, InvalidProtocolBufferException, 
//			Parser, Message, MessageLite, ProtocolStringList, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$EnumDescriptorProto$Builder extends GeneratedMessageV3.Builder
	implements 
{

	private void ensureReservedNameIsMutable()
	{
		if((bitField0_ & 0x10) != 16)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int bitField0_>
	//*   2    4:bipush          16
	//*   3    6:iand            
	//*   4    7:bipush          16
	//*   5    9:icmpeq          38
		{
			reservedName_ = ((LazyStringList) (new LazyStringArrayList(reservedName_)));
	//    6   12:aload_0         
	//    7   13:new             #56  <Class LazyStringArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #61  <Field LazyStringList reservedName_>
	//   11   21:invokespecial   #78  <Method void LazyStringArrayList(LazyStringList)>
	//   12   24:putfield        #61  <Field LazyStringList reservedName_>
			bitField0_ = bitField0_ | 0x10;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #75  <Field int bitField0_>
	//   16   32:bipush          16
	//   17   34:ior             
	//   18   35:putfield        #75  <Field int bitField0_>
		}
	//   19   38:return          
	}

	private void ensureReservedRangeIsMutable()
	{
		if((bitField0_ & 8) != 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int bitField0_>
	//*   2    4:bipush          8
	//*   3    6:iand            
	//*   4    7:bipush          8
	//*   5    9:icmpeq          38
		{
			reservedRange_ = ((List) (new ArrayList(((java.util.Collection) (reservedRange_)))));
	//    6   12:aload_0         
	//    7   13:new             #81  <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #54  <Field List reservedRange_>
	//   11   21:invokespecial   #84  <Method void ArrayList(java.util.Collection)>
	//   12   24:putfield        #54  <Field List reservedRange_>
			bitField0_ = bitField0_ | 8;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #75  <Field int bitField0_>
	//   16   32:bipush          8
	//   17   34:ior             
	//   18   35:putfield        #75  <Field int bitField0_>
		}
	//   19   38:return          
	}

	private void ensureValueIsMutable()
	{
		if((bitField0_ & 2) != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int bitField0_>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          35
		{
			value_ = ((List) (new ArrayList(((java.util.Collection) (value_)))));
	//    6   10:aload_0         
	//    7   11:new             #81  <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #50  <Field List value_>
	//   11   19:invokespecial   #84  <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #50  <Field List value_>
			bitField0_ = bitField0_ | 2;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #75  <Field int bitField0_>
	//   16   30:iconst_2        
	//   17   31:ior             
	//   18   32:putfield        #75  <Field int bitField0_>
		}
	//   19   35:return          
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$9500();
	//    0    0:invokestatic    #90  <Method Descriptors$Descriptor DescriptorProtos.access$9500()>
	//    1    3:areturn         
	}

	private SingleFieldBuilderV3 getOptionsFieldBuilder()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       35
		{
			optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//    3    7:aload_0         
	//    4    8:new             #96  <Class SingleFieldBuilderV3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #100 <Method DescriptorProtos$EnumOptions getOptions()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #104 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #108 <Method boolean isClean()>
	//   12   24:invokespecial   #111 <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
	//   13   27:putfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
			options_ = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #52  <Field DescriptorProtos$EnumOptions options_>
		}
		return optionsBuilder_;
	//   17   35:aload_0         
	//   18   36:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   19   39:areturn         
	}

	private RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       57
		{
			List list = reservedRange_;
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field List reservedRange_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 8) == 8)
	//*   6   12:aload_0         
	//*   7   13:getfield        #75  <Field int bitField0_>
	//*   8   16:bipush          8
	//*   9   18:iand            
	//*  10   19:bipush          8
	//*  11   21:icmpne          29
				flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_1        
			else
	//*  14   26:goto            31
				flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_1        
			reservedRangeBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   31:aload_0         
	//   18   32:new             #119 <Class RepeatedFieldBuilderV3>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #104 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   42:aload_0         
	//   25   43:invokevirtual   #108 <Method boolean isClean()>
	//   26   46:invokespecial   #122 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   49:putfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
			reservedRange_ = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #54  <Field List reservedRange_>
		}
		return reservedRangeBuilder_;
	//   31   57:aload_0         
	//   32   58:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   33   61:areturn         
	}

	private RepeatedFieldBuilderV3 getValueFieldBuilder()
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = value_;
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field List value_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 2) == 2)
	//*   6   12:aload_0         
	//*   7   13:getfield        #75  <Field int bitField0_>
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
			valueBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   29:aload_0         
	//   18   30:new             #119 <Class RepeatedFieldBuilderV3>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:invokevirtual   #104 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   40:aload_0         
	//   25   41:invokevirtual   #108 <Method boolean isClean()>
	//   26   44:invokespecial   #122 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   47:putfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
			value_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #50  <Field List value_>
		}
		return valueBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   33   59:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #133 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            21
		{
			getValueFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #135 <Method RepeatedFieldBuilderV3 getValueFieldBuilder()>
	//    4   10:pop             
			getOptionsFieldBuilder();
	//    5   11:aload_0         
	//    6   12:invokespecial   #137 <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//    7   15:pop             
			getReservedRangeFieldBuilder();
	//    8   16:aload_0         
	//    9   17:invokespecial   #139 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addAllReservedName(Iterable iterable)
	{
		ensureReservedNameIsMutable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method void ensureReservedNameIsMutable()>
		AbstractMessageLite.Builder.addAll(iterable, ((List) (reservedName_)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #61  <Field LazyStringList reservedName_>
	//    5    9:invokestatic    #149 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
		onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #152 <Method void onChanged()>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addAllReservedRange(Iterable iterable)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #156 <Method void ensureReservedRangeIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, reservedRange_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field List reservedRange_>
	//    8   16:invokestatic    #149 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			reservedRangeBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addAllValue(Iterable iterable)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureValueIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureValueIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, value_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field List value_>
	//    8   16:invokestatic    #149 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			valueBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #170 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #172 <Method DescriptorProtos$EnumDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #172 <Method DescriptorProtos$EnumDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addReservedName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #177 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #178 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			ensureReservedNameIsMutable();
	//    6   12:aload_0         
	//    7   13:invokespecial   #143 <Method void ensureReservedNameIsMutable()>
			reservedName_.add(((Object) (s)));
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field LazyStringList reservedName_>
	//   10   20:aload_1         
	//   11   21:invokeinterface #184 <Method boolean LazyStringList.add(Object)>
	//   12   26:pop             
			onChanged();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   15   31:aload_0         
	//   16   32:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addReservedNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #177 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #178 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			ensureReservedNameIsMutable();
	//    6   12:aload_0         
	//    7   13:invokespecial   #143 <Method void ensureReservedNameIsMutable()>
			reservedName_.add(bytestring);
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field LazyStringList reservedName_>
	//   10   20:aload_1         
	//   11   21:invokeinterface #189 <Method void LazyStringList.add(ByteString)>
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addReservedRange(int i, rvedRange.Builder builder)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #156 <Method void ensureReservedRangeIsMutable()>
			reservedRange_.add(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #54  <Field List reservedRange_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #197 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.build()>
	//   10   20:invokeinterface #202 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			reservedRangeBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #197 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.build()>
	//   20   40:invokevirtual   #206 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addReservedRange(int i, rvedRange rvedrange)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(rvedrange == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #177 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #178 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureReservedRangeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #156 <Method void ensureReservedRangeIsMutable()>
				reservedRange_.add(i, ((Object) (rvedrange)));
	//   11   23:aload_0         
	//   12   24:getfield        #54  <Field List reservedRange_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #202 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #152 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			reservedRangeBuilder_.addMessage(i, ((AbstractMessage) (rvedrange)));
	//   20   40:aload_0         
	//   21   41:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #206 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addReservedRange(rvedRange.Builder builder)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #156 <Method void ensureReservedRangeIsMutable()>
			reservedRange_.add(((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #54  <Field List reservedRange_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #197 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.build()>
	//    9   19:invokeinterface #209 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			reservedRangeBuilder_.addMessage(((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #197 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.build()>
	//   19   39:invokevirtual   #212 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addReservedRange(rvedRange rvedrange)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(rvedrange == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #177 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #178 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureReservedRangeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #156 <Method void ensureReservedRangeIsMutable()>
				reservedRange_.add(((Object) (rvedrange)));
	//   11   23:aload_0         
	//   12   24:getfield        #54  <Field List reservedRange_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #209 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #152 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			reservedRangeBuilder_.addMessage(((AbstractMessage) (rvedrange)));
	//   20   40:aload_0         
	//   21   41:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #212 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public rvedRange.Builder addReservedRangeBuilder()
	{
		return (rvedRange.Builder)getReservedRangeFieldBuilder().addBuilder(((AbstractMessage) (rvedRange.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//    2    4:invokestatic    #220 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getDefaultInstance()>
	//    3    7:invokevirtual   #224 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #193 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
	//    5   13:areturn         
	}

	public rvedRange.Builder addReservedRangeBuilder(int i)
	{
		return (rvedRange.Builder)getReservedRangeFieldBuilder().addBuilder(i, ((AbstractMessage) (rvedRange.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #220 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getDefaultInstance()>
	//    4    8:invokevirtual   #228 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #193 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addValue(int i, lder lder)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureValueIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureValueIsMutable()>
			value_.add(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field List value_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #235 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #202 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			valueBuilder_.addMessage(i, ((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #235 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto$Builder.build()>
	//   20   40:invokevirtual   #206 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addValue(int i, DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(enumvaluedescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #177 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #178 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureValueIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #164 <Method void ensureValueIsMutable()>
				value_.add(i, ((Object) (enumvaluedescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #50  <Field List value_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #202 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #152 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			valueBuilder_.addMessage(i, ((AbstractMessage) (enumvaluedescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #206 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addValue(lder lder)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureValueIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureValueIsMutable()>
			value_.add(((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field List value_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #235 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto$Builder.build()>
	//    9   19:invokeinterface #209 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			valueBuilder_.addMessage(((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #235 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto$Builder.build()>
	//   19   39:invokevirtual   #212 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addValue(DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(enumvaluedescriptorproto == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #177 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #178 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureValueIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #164 <Method void ensureValueIsMutable()>
				value_.add(((Object) (enumvaluedescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #50  <Field List value_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #209 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #152 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			valueBuilder_.addMessage(((AbstractMessage) (enumvaluedescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #212 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public lder addValueBuilder()
	{
		return (lder)getValueFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method RepeatedFieldBuilderV3 getValueFieldBuilder()>
	//    2    4:invokestatic    #244 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #224 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #232 <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
	//    5   13:areturn         
	}

	public lder addValueBuilder(int i)
	{
		return (lder)getValueFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method RepeatedFieldBuilderV3 getValueFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #244 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #228 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #232 <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos.EnumDescriptorProto build()
	{
		DescriptorProtos.EnumDescriptorProto enumdescriptorproto = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method DescriptorProtos$EnumDescriptorProto buildPartial()>
	//    2    4:astore_1        
		if(!enumdescriptorproto.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #252 <Method boolean DescriptorProtos$EnumDescriptorProto.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (enumdescriptorproto)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #256 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return enumdescriptorproto;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method DescriptorProtos$EnumDescriptorProto build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method DescriptorProtos$EnumDescriptorProto build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.EnumDescriptorProto buildPartial()
	{
		DescriptorProtos.EnumDescriptorProto enumdescriptorproto = new DescriptorProtos.EnumDescriptorProto(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$EnumDescriptorProto>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #263 <Method void DescriptorProtos$EnumDescriptorProto(GeneratedMessageV3$Builder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #75  <Field int bitField0_>
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
		DescriptorProtos.EnumDescriptorProto.access$10902(enumdescriptorproto, name_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #42  <Field Object name_>
	//   21   33:invokestatic    #267 <Method Object DescriptorProtos$EnumDescriptorProto.access$10902(DescriptorProtos$EnumDescriptorProto, Object)>
	//   22   36:pop             
		if(valueBuilder_ == null)
	//*  23   37:aload_0         
	//*  24   38:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*  25   41:ifnonnull       89
		{
			if((bitField0_ & 2) == 2)
	//*  26   44:aload_0         
	//*  27   45:getfield        #75  <Field int bitField0_>
	//*  28   48:iconst_2        
	//*  29   49:iand            
	//*  30   50:iconst_2        
	//*  31   51:icmpne          76
			{
				value_ = Collections.unmodifiableList(value_);
	//   32   54:aload_0         
	//   33   55:aload_0         
	//   34   56:getfield        #50  <Field List value_>
	//   35   59:invokestatic    #271 <Method List Collections.unmodifiableList(List)>
	//   36   62:putfield        #50  <Field List value_>
				bitField0_ = bitField0_ & -3;
	//   37   65:aload_0         
	//   38   66:aload_0         
	//   39   67:getfield        #75  <Field int bitField0_>
	//   40   70:bipush          -3
	//   41   72:iand            
	//   42   73:putfield        #75  <Field int bitField0_>
			}
			DescriptorProtos.EnumDescriptorProto.access$11002(enumdescriptorproto, value_);
	//   43   76:aload           4
	//   44   78:aload_0         
	//   45   79:getfield        #50  <Field List value_>
	//   46   82:invokestatic    #275 <Method List DescriptorProtos$EnumDescriptorProto.access$11002(DescriptorProtos$EnumDescriptorProto, List)>
	//   47   85:pop             
		} else
	//*  48   86:goto            102
		{
			DescriptorProtos.EnumDescriptorProto.access$11002(enumdescriptorproto, valueBuilder_.build());
	//   49   89:aload           4
	//   50   91:aload_0         
	//   51   92:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   52   95:invokevirtual   #277 <Method List RepeatedFieldBuilderV3.build()>
	//   53   98:invokestatic    #275 <Method List DescriptorProtos$EnumDescriptorProto.access$11002(DescriptorProtos$EnumDescriptorProto, List)>
	//   54  101:pop             
		}
		int j = i;
	//   55  102:iload_1         
	//   56  103:istore_2        
		if((k & 4) == 4)
	//*  57  104:iload_3         
	//*  58  105:iconst_4        
	//*  59  106:iand            
	//*  60  107:iconst_4        
	//*  61  108:icmpne          115
			j = i | 2;
	//   62  111:iload_1         
	//   63  112:iconst_2        
	//   64  113:ior             
	//   65  114:istore_2        
		if(optionsBuilder_ == null)
	//*  66  115:aload_0         
	//*  67  116:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*  68  119:ifnonnull       135
			DescriptorProtos.EnumDescriptorProto.access$11102(enumdescriptorproto, options_);
	//   69  122:aload           4
	//   70  124:aload_0         
	//   71  125:getfield        #52  <Field DescriptorProtos$EnumOptions options_>
	//   72  128:invokestatic    #281 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumDescriptorProto.access$11102(DescriptorProtos$EnumDescriptorProto, DescriptorProtos$EnumOptions)>
	//   73  131:pop             
		else
	//*  74  132:goto            151
			DescriptorProtos.EnumDescriptorProto.access$11102(enumdescriptorproto, (DescriptorProtos.EnumOptions)optionsBuilder_.build());
	//   75  135:aload           4
	//   76  137:aload_0         
	//   77  138:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   78  141:invokevirtual   #284 <Method AbstractMessage SingleFieldBuilderV3.build()>
	//   79  144:checkcast       #286 <Class DescriptorProtos$EnumOptions>
	//   80  147:invokestatic    #281 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumDescriptorProto.access$11102(DescriptorProtos$EnumDescriptorProto, DescriptorProtos$EnumOptions)>
	//   81  150:pop             
		if(reservedRangeBuilder_ == null)
	//*  82  151:aload_0         
	//*  83  152:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*  84  155:ifnonnull       205
		{
			if((bitField0_ & 8) == 8)
	//*  85  158:aload_0         
	//*  86  159:getfield        #75  <Field int bitField0_>
	//*  87  162:bipush          8
	//*  88  164:iand            
	//*  89  165:bipush          8
	//*  90  167:icmpne          192
			{
				reservedRange_ = Collections.unmodifiableList(reservedRange_);
	//   91  170:aload_0         
	//   92  171:aload_0         
	//   93  172:getfield        #54  <Field List reservedRange_>
	//   94  175:invokestatic    #271 <Method List Collections.unmodifiableList(List)>
	//   95  178:putfield        #54  <Field List reservedRange_>
				bitField0_ = bitField0_ & -9;
	//   96  181:aload_0         
	//   97  182:aload_0         
	//   98  183:getfield        #75  <Field int bitField0_>
	//   99  186:bipush          -9
	//  100  188:iand            
	//  101  189:putfield        #75  <Field int bitField0_>
			}
			DescriptorProtos.EnumDescriptorProto.access$11202(enumdescriptorproto, reservedRange_);
	//  102  192:aload           4
	//  103  194:aload_0         
	//  104  195:getfield        #54  <Field List reservedRange_>
	//  105  198:invokestatic    #289 <Method List DescriptorProtos$EnumDescriptorProto.access$11202(DescriptorProtos$EnumDescriptorProto, List)>
	//  106  201:pop             
		} else
	//* 107  202:goto            218
		{
			DescriptorProtos.EnumDescriptorProto.access$11202(enumdescriptorproto, reservedRangeBuilder_.build());
	//  108  205:aload           4
	//  109  207:aload_0         
	//  110  208:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//  111  211:invokevirtual   #277 <Method List RepeatedFieldBuilderV3.build()>
	//  112  214:invokestatic    #289 <Method List DescriptorProtos$EnumDescriptorProto.access$11202(DescriptorProtos$EnumDescriptorProto, List)>
	//  113  217:pop             
		}
		if((bitField0_ & 0x10) == 16)
	//* 114  218:aload_0         
	//* 115  219:getfield        #75  <Field int bitField0_>
	//* 116  222:bipush          16
	//* 117  224:iand            
	//* 118  225:bipush          16
	//* 119  227:icmpne          254
		{
			reservedName_ = reservedName_.getUnmodifiableView();
	//  120  230:aload_0         
	//  121  231:aload_0         
	//  122  232:getfield        #61  <Field LazyStringList reservedName_>
	//  123  235:invokeinterface #293 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//  124  240:putfield        #61  <Field LazyStringList reservedName_>
			bitField0_ = bitField0_ & 0xffffffef;
	//  125  243:aload_0         
	//  126  244:aload_0         
	//  127  245:getfield        #75  <Field int bitField0_>
	//  128  248:bipush          -17
	//  129  250:iand            
	//  130  251:putfield        #75  <Field int bitField0_>
		}
		DescriptorProtos.EnumDescriptorProto.access$11302(enumdescriptorproto, reservedName_);
	//  131  254:aload           4
	//  132  256:aload_0         
	//  133  257:getfield        #61  <Field LazyStringList reservedName_>
	//  134  260:invokestatic    #297 <Method LazyStringList DescriptorProtos$EnumDescriptorProto.access$11302(DescriptorProtos$EnumDescriptorProto, LazyStringList)>
	//  135  263:pop             
		DescriptorProtos.EnumDescriptorProto.access$11402(enumdescriptorproto, j);
	//  136  264:aload           4
	//  137  266:iload_2         
	//  138  267:invokestatic    #301 <Method int DescriptorProtos$EnumDescriptorProto.access$11402(DescriptorProtos$EnumDescriptorProto, int)>
	//  139  270:pop             
		onBuilt();
	//  140  271:aload_0         
	//  141  272:invokevirtual   #304 <Method void onBuilt()>
		return enumdescriptorproto;
	//  142  275:aload           4
	//  143  277:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method DescriptorProtos$EnumDescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method DescriptorProtos$EnumDescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #309 <Method DescriptorProtos$EnumDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #312 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #40  <String "">
	//    5    8:putfield        #42  <Field Object name_>
		bitField0_ = bitField0_ & -2;
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #75  <Field int bitField0_>
	//    9   16:bipush          -2
	//   10   18:iand            
	//   11   19:putfield        #75  <Field int bitField0_>
		if(valueBuilder_ == null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*  14   26:ifnonnull       50
		{
			value_ = Collections.emptyList();
	//   15   29:aload_0         
	//   16   30:invokestatic    #48  <Method List Collections.emptyList()>
	//   17   33:putfield        #50  <Field List value_>
			bitField0_ = bitField0_ & -3;
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #75  <Field int bitField0_>
	//   21   41:bipush          -3
	//   22   43:iand            
	//   23   44:putfield        #75  <Field int bitField0_>
		} else
	//*  24   47:goto            57
		{
			valueBuilder_.clear();
	//   25   50:aload_0         
	//   26   51:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   27   54:invokevirtual   #314 <Method void RepeatedFieldBuilderV3.clear()>
		}
		if(optionsBuilder_ == null)
	//*  28   57:aload_0         
	//*  29   58:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*  30   61:ifnonnull       72
			options_ = null;
	//   31   64:aload_0         
	//   32   65:aconst_null     
	//   33   66:putfield        #52  <Field DescriptorProtos$EnumOptions options_>
		else
	//*  34   69:goto            80
			optionsBuilder_.clear();
	//   35   72:aload_0         
	//   36   73:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   37   76:invokevirtual   #316 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//   38   79:pop             
		bitField0_ = bitField0_ & -5;
	//   39   80:aload_0         
	//   40   81:aload_0         
	//   41   82:getfield        #75  <Field int bitField0_>
	//   42   85:bipush          -5
	//   43   87:iand            
	//   44   88:putfield        #75  <Field int bitField0_>
		if(reservedRangeBuilder_ == null)
	//*  45   91:aload_0         
	//*  46   92:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*  47   95:ifnonnull       119
		{
			reservedRange_ = Collections.emptyList();
	//   48   98:aload_0         
	//   49   99:invokestatic    #48  <Method List Collections.emptyList()>
	//   50  102:putfield        #54  <Field List reservedRange_>
			bitField0_ = bitField0_ & -9;
	//   51  105:aload_0         
	//   52  106:aload_0         
	//   53  107:getfield        #75  <Field int bitField0_>
	//   54  110:bipush          -9
	//   55  112:iand            
	//   56  113:putfield        #75  <Field int bitField0_>
		} else
	//*  57  116:goto            126
		{
			reservedRangeBuilder_.clear();
	//   58  119:aload_0         
	//   59  120:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   60  123:invokevirtual   #314 <Method void RepeatedFieldBuilderV3.clear()>
		}
		reservedName_ = LazyStringArrayList.EMPTY;
	//   61  126:aload_0         
	//   62  127:getstatic       #59  <Field LazyStringList LazyStringArrayList.EMPTY>
	//   63  130:putfield        #61  <Field LazyStringList reservedName_>
		bitField0_ = bitField0_ & 0xffffffef;
	//   64  133:aload_0         
	//   65  134:aload_0         
	//   66  135:getfield        #75  <Field int bitField0_>
	//   67  138:bipush          -17
	//   68  140:iand            
	//   69  141:putfield        #75  <Field int bitField0_>
		return this;
	//   70  144:aload_0         
	//   71  145:areturn         
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #309 <Method DescriptorProtos$EnumDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #309 <Method DescriptorProtos$EnumDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #309 <Method DescriptorProtos$EnumDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #323 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #325 <Method DescriptorProtos$EnumDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #325 <Method DescriptorProtos$EnumDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder clearName()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #75  <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #75  <Field int bitField0_>
		name_ = ((Object) (DescriptorProtos.EnumDescriptorProto.getDefaultInstance().getName()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #329 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #333 <Method String DescriptorProtos$EnumDescriptorProto.getName()>
	//    9   18:putfield        #42  <Field Object name_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #152 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #338 <Method DescriptorProtos$EnumDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #341 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #338 <Method DescriptorProtos$EnumDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #338 <Method DescriptorProtos$EnumDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder clearOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       19
		{
			options_ = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #52  <Field DescriptorProtos$EnumOptions options_>
			onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #152 <Method void onChanged()>
		} else
	//*   8   16:goto            27
		{
			optionsBuilder_.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   11   23:invokevirtual   #316 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//   12   26:pop             
		}
		bitField0_ = bitField0_ & -5;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #75  <Field int bitField0_>
	//   16   32:bipush          -5
	//   17   34:iand            
	//   18   35:putfield        #75  <Field int bitField0_>
		return this;
	//   19   38:aload_0         
	//   20   39:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder clearReservedName()
	{
		reservedName_ = LazyStringArrayList.EMPTY;
	//    0    0:aload_0         
	//    1    1:getstatic       #59  <Field LazyStringList LazyStringArrayList.EMPTY>
	//    2    4:putfield        #61  <Field LazyStringList reservedName_>
		bitField0_ = bitField0_ & 0xffffffef;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #75  <Field int bitField0_>
	//    6   12:bipush          -17
	//    7   14:iand            
	//    8   15:putfield        #75  <Field int bitField0_>
		onChanged();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #152 <Method void onChanged()>
		return this;
	//   11   22:aload_0         
	//   12   23:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder clearReservedRange()
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       31
		{
			reservedRange_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #48  <Method List Collections.emptyList()>
	//    5   11:putfield        #54  <Field List reservedRange_>
			bitField0_ = bitField0_ & -9;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #75  <Field int bitField0_>
	//    9   19:bipush          -9
	//   10   21:iand            
	//   11   22:putfield        #75  <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			reservedRangeBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   18   35:invokevirtual   #314 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder clearValue()
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       31
		{
			value_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #48  <Method List Collections.emptyList()>
	//    5   11:putfield        #50  <Field List value_>
			bitField0_ = bitField0_ & -3;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #75  <Field int bitField0_>
	//    9   19:bipush          -3
	//   10   21:iand            
	//   11   22:putfield        #75  <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			valueBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   18   35:invokevirtual   #314 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #349 <Method DescriptorProtos$EnumDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #349 <Method DescriptorProtos$EnumDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder clone()
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #352 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #349 <Method DescriptorProtos$EnumDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #349 <Method DescriptorProtos$EnumDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #349 <Method DescriptorProtos$EnumDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #349 <Method DescriptorProtos$EnumDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.EnumDescriptorProto getDefaultInstanceForType()
	{
		return DescriptorProtos.EnumDescriptorProto.getDefaultInstance();
	//    0    0:invokestatic    #329 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #359 <Method DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #359 <Method DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$9500();
	//    0    0:invokestatic    #90  <Method Descriptors$Descriptor DescriptorProtos.access$9500()>
	//    1    3:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object name_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #362 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #364 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #367 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #370 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				name_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #42  <Field Object name_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #362 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #362 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #362 <Class String>
	//    8   16:invokestatic    #376 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #42  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #364 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.EnumOptions getOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       23
		{
			if(options_ == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #52  <Field DescriptorProtos$EnumOptions options_>
	//*   5   11:ifnonnull       18
				return DescriptorProtos.EnumOptions.getDefaultInstance();
	//    6   14:invokestatic    #378 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions.getDefaultInstance()>
	//    7   17:areturn         
			else
				return options_;
	//    8   18:aload_0         
	//    9   19:getfield        #52  <Field DescriptorProtos$EnumOptions options_>
	//   10   22:areturn         
		} else
		{
			return (DescriptorProtos.EnumOptions)optionsBuilder_.getMessage();
	//   11   23:aload_0         
	//   12   24:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   13   27:invokevirtual   #381 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
	//   14   30:checkcast       #286 <Class DescriptorProtos$EnumOptions>
	//   15   33:areturn         
		}
	}

	public DescriptorProtos.EnumOptions.Builder getOptionsBuilder()
	{
		bitField0_ = bitField0_ | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #75  <Field int bitField0_>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #75  <Field int bitField0_>
		onChanged();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #152 <Method void onChanged()>
		return (DescriptorProtos.EnumOptions.Builder)getOptionsFieldBuilder().getBuilder();
	//    8   14:aload_0         
	//    9   15:invokespecial   #137 <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//   10   18:invokevirtual   #386 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
	//   11   21:checkcast       #388 <Class DescriptorProtos$EnumOptions$Builder>
	//   12   24:areturn         
	}

	public DescriptorProtos.EnumOptionsOrBuilder getOptionsOrBuilder()
	{
		if(optionsBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnull          18
			return (DescriptorProtos.EnumOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
	//    3    7:aload_0         
	//    4    8:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//    5   11:invokevirtual   #394 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
	//    6   14:checkcast       #396 <Class DescriptorProtos$EnumOptionsOrBuilder>
	//    7   17:areturn         
		if(options_ == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #52  <Field DescriptorProtos$EnumOptions options_>
	//*  10   22:ifnonnull       29
			return ((DescriptorProtos.EnumOptionsOrBuilder) (DescriptorProtos.EnumOptions.getDefaultInstance()));
	//   11   25:invokestatic    #378 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions.getDefaultInstance()>
	//   12   28:areturn         
		else
			return ((DescriptorProtos.EnumOptionsOrBuilder) (options_));
	//   13   29:aload_0         
	//   14   30:getfield        #52  <Field DescriptorProtos$EnumOptions options_>
	//   15   33:areturn         
	}

	public String getReservedName(int i)
	{
		return (String)reservedName_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field LazyStringList reservedName_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #402 <Method Object LazyStringList.get(int)>
	//    4   10:checkcast       #362 <Class String>
	//    5   13:areturn         
	}

	public ByteString getReservedNameBytes(int i)
	{
		return reservedName_.getByteString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field LazyStringList reservedName_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method ByteString LazyStringList.getByteString(int)>
	//    4   10:areturn         
	}

	public int getReservedNameCount()
	{
		return reservedName_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field LazyStringList reservedName_>
	//    2    4:invokeinterface #412 <Method int LazyStringList.size()>
	//    3    9:ireturn         
	}

	public ProtocolStringList getReservedNameList()
	{
		return ((ProtocolStringList) (reservedName_.getUnmodifiableView()));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field LazyStringList reservedName_>
	//    2    4:invokeinterface #293 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//    3    9:areturn         
	}

	public volatile List getReservedNameList()
	{
		return ((List) (getReservedNameList()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #416 <Method ProtocolStringList getReservedNameList()>
	//    2    4:areturn         
	}

	public rvedRange getReservedRange(int i)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       21
			return (rvedRange)reservedRange_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field List reservedRange_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #419 <Method Object List.get(int)>
	//    7   17:checkcast       #217 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    8   20:areturn         
		else
			return (rvedRange)reservedRangeBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #422 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #217 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//   14   32:areturn         
	}

	public rvedRange.Builder getReservedRangeBuilder(int i)
	{
		return (rvedRange.Builder)getReservedRangeFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #426 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #193 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
	//    5   11:areturn         
	}

	public List getReservedRangeBuilderList()
	{
		return getReservedRangeFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//    2    4:invokevirtual   #430 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getReservedRangeCount()
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       17
			return reservedRange_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field List reservedRange_>
	//    5   11:invokeinterface #433 <Method int List.size()>
	//    6   16:ireturn         
		else
			return reservedRangeBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//    9   21:invokevirtual   #436 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getReservedRangeList()
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(reservedRange_);
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field List reservedRange_>
	//    5   11:invokestatic    #271 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return reservedRangeBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//    9   19:invokevirtual   #440 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public rvedRangeOrBuilder getReservedRangeOrBuilder(int i)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       21
			return (rvedRangeOrBuilder)reservedRange_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field List reservedRange_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #419 <Method Object List.get(int)>
	//    7   17:checkcast       #445 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder>
	//    8   20:areturn         
		else
			return (rvedRangeOrBuilder)reservedRangeBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #448 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #445 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder>
	//   14   32:areturn         
	}

	public List getReservedRangeOrBuilderList()
	{
		if(reservedRangeBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnull          15
			return reservedRangeBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//    5   11:invokevirtual   #452 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(reservedRange_);
	//    7   15:aload_0         
	//    8   16:getfield        #54  <Field List reservedRange_>
	//    9   19:invokestatic    #271 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public DescriptorProtos.EnumValueDescriptorProto getValue(int i)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.EnumValueDescriptorProto)value_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field List value_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #419 <Method Object List.get(int)>
	//    7   17:checkcast       #242 <Class DescriptorProtos$EnumValueDescriptorProto>
	//    8   20:areturn         
		else
			return (DescriptorProtos.EnumValueDescriptorProto)valueBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #422 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #242 <Class DescriptorProtos$EnumValueDescriptorProto>
	//   14   32:areturn         
	}

	public lder getValueBuilder(int i)
	{
		return (lder)getValueFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method RepeatedFieldBuilderV3 getValueFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #426 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #232 <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
	//    5   11:areturn         
	}

	public List getValueBuilderList()
	{
		return getValueFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method RepeatedFieldBuilderV3 getValueFieldBuilder()>
	//    2    4:invokevirtual   #430 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getValueCount()
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       17
			return value_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field List value_>
	//    5   11:invokeinterface #433 <Method int List.size()>
	//    6   16:ireturn         
		else
			return valueBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//    9   21:invokevirtual   #436 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getValueList()
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(value_);
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field List value_>
	//    5   11:invokestatic    #271 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return valueBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//    9   19:invokevirtual   #440 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public ilder getValueOrBuilder(int i)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       21
			return (ilder)value_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field List value_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #419 <Method Object List.get(int)>
	//    7   17:checkcast       #465 <Class DescriptorProtos$EnumValueDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return (ilder)valueBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #448 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #465 <Class DescriptorProtos$EnumValueDescriptorProtoOrBuilder>
	//   14   32:areturn         
	}

	public List getValueOrBuilderList()
	{
		if(valueBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnull          15
			return valueBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//    5   11:invokevirtual   #452 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(value_);
	//    7   15:aload_0         
	//    8   16:getfield        #50  <Field List value_>
	//    9   19:invokestatic    #271 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasOptions()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$9600().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumDescriptorProto, com/google/protobuf/DescriptorProtos$EnumDescriptorProto$Builder);
	//    0    0:invokestatic    #474 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$9600()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$EnumDescriptorProto>
	//    2    5:ldc1            #2   <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    3    7:invokevirtual   #480 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < getValueCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #482 <Method int getValueCount()>
	//*   5    7:icmpge          30
			if(!getValue(i).isInitialized())
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #484 <Method DescriptorProtos$EnumValueDescriptorProto getValue(int)>
	//*   9   15:invokevirtual   #485 <Method boolean DescriptorProtos$EnumValueDescriptorProto.isInitialized()>
	//*  10   18:ifne            23
				return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         

	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore_1        
	//*  17   27:goto            2
		return !hasOptions() || getOptions().isInitialized();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #487 <Method boolean hasOptions()>
	//   20   34:ifeq            49
	//   21   37:aload_0         
	//   22   38:invokevirtual   #100 <Method DescriptorProtos$EnumOptions getOptions()>
	//   23   41:invokevirtual   #488 <Method boolean DescriptorProtos$EnumOptions.isInitialized()>
	//   24   44:ifne            49
	//   25   47:iconst_0        
	//   26   48:ireturn         
	//   27   49:iconst_1        
	//   28   50:ireturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #495 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #499 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #495 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumDescriptorProto)DescriptorProtos.EnumDescriptorProto.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #506 <Field Parser DescriptorProtos$EnumDescriptorProto.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #512 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$EnumDescriptorProto>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.EnumDescriptorProto) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #515 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(DescriptorProtos$EnumDescriptorProto)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #518 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$EnumDescriptorProto>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #522 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #515 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(DescriptorProtos$EnumDescriptorProto)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.EnumDescriptorProto)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.EnumDescriptorProto) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
	{
		if(enumdescriptorproto == DescriptorProtos.EnumDescriptorProto.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #329 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(enumdescriptorproto.hasName())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #524 <Method boolean DescriptorProtos$EnumDescriptorProto.hasName()>
	//*   7   13:ifeq            38
		{
			bitField0_ = bitField0_ | 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field int bitField0_>
	//   11   21:iconst_1        
	//   12   22:ior             
	//   13   23:putfield        #75  <Field int bitField0_>
			name_ = DescriptorProtos.EnumDescriptorProto.access$10900(enumdescriptorproto);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokestatic    #528 <Method Object DescriptorProtos$EnumDescriptorProto.access$10900(DescriptorProtos$EnumDescriptorProto)>
	//   17   31:putfield        #42  <Field Object name_>
			onChanged();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #152 <Method void onChanged()>
		}
		if(valueBuilder_ == null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*  22   42:ifnonnull       116
		{
			if(!DescriptorProtos.EnumDescriptorProto.access$11000(enumdescriptorproto).isEmpty())
	//*  23   45:aload_1         
	//*  24   46:invokestatic    #532 <Method List DescriptorProtos$EnumDescriptorProto.access$11000(DescriptorProtos$EnumDescriptorProto)>
	//*  25   49:invokeinterface #535 <Method boolean List.isEmpty()>
	//*  26   54:ifne            205
			{
				if(value_.isEmpty())
	//*  27   57:aload_0         
	//*  28   58:getfield        #50  <Field List value_>
	//*  29   61:invokeinterface #535 <Method boolean List.isEmpty()>
	//*  30   66:ifeq            91
				{
					value_ = DescriptorProtos.EnumDescriptorProto.access$11000(enumdescriptorproto);
	//   31   69:aload_0         
	//   32   70:aload_1         
	//   33   71:invokestatic    #532 <Method List DescriptorProtos$EnumDescriptorProto.access$11000(DescriptorProtos$EnumDescriptorProto)>
	//   34   74:putfield        #50  <Field List value_>
					bitField0_ = bitField0_ & -3;
	//   35   77:aload_0         
	//   36   78:aload_0         
	//   37   79:getfield        #75  <Field int bitField0_>
	//   38   82:bipush          -3
	//   39   84:iand            
	//   40   85:putfield        #75  <Field int bitField0_>
				} else
	//*  41   88:goto            109
				{
					ensureValueIsMutable();
	//   42   91:aload_0         
	//   43   92:invokespecial   #164 <Method void ensureValueIsMutable()>
					value_.addAll(((java.util.Collection) (DescriptorProtos.EnumDescriptorProto.access$11000(enumdescriptorproto))));
	//   44   95:aload_0         
	//   45   96:getfield        #50  <Field List value_>
	//   46   99:aload_1         
	//   47  100:invokestatic    #532 <Method List DescriptorProtos$EnumDescriptorProto.access$11000(DescriptorProtos$EnumDescriptorProto)>
	//   48  103:invokeinterface #538 <Method boolean List.addAll(java.util.Collection)>
	//   49  108:pop             
				}
				onChanged();
	//   50  109:aload_0         
	//   51  110:invokevirtual   #152 <Method void onChanged()>
			}
		} else
	//*  52  113:goto            205
		if(!DescriptorProtos.EnumDescriptorProto.access$11000(enumdescriptorproto).isEmpty())
	//*  53  116:aload_1         
	//*  54  117:invokestatic    #532 <Method List DescriptorProtos$EnumDescriptorProto.access$11000(DescriptorProtos$EnumDescriptorProto)>
	//*  55  120:invokeinterface #535 <Method boolean List.isEmpty()>
	//*  56  125:ifne            205
			if(valueBuilder_.isEmpty())
	//*  57  128:aload_0         
	//*  58  129:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*  59  132:invokevirtual   #539 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  60  135:ifeq            193
			{
				valueBuilder_.dispose();
	//   61  138:aload_0         
	//   62  139:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   63  142:invokevirtual   #542 <Method void RepeatedFieldBuilderV3.dispose()>
				valueBuilder_ = null;
	//   64  145:aload_0         
	//   65  146:aconst_null     
	//   66  147:putfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
				value_ = DescriptorProtos.EnumDescriptorProto.access$11000(enumdescriptorproto);
	//   67  150:aload_0         
	//   68  151:aload_1         
	//   69  152:invokestatic    #532 <Method List DescriptorProtos$EnumDescriptorProto.access$11000(DescriptorProtos$EnumDescriptorProto)>
	//   70  155:putfield        #50  <Field List value_>
				bitField0_ = bitField0_ & -3;
	//   71  158:aload_0         
	//   72  159:aload_0         
	//   73  160:getfield        #75  <Field int bitField0_>
	//   74  163:bipush          -3
	//   75  165:iand            
	//   76  166:putfield        #75  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*  77  169:getstatic       #133 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*  78  172:ifeq            183
					repeatedfieldbuilderv3 = getValueFieldBuilder();
	//   79  175:aload_0         
	//   80  176:invokespecial   #135 <Method RepeatedFieldBuilderV3 getValueFieldBuilder()>
	//   81  179:astore_2        
				else
	//*  82  180:goto            185
					repeatedfieldbuilderv3 = null;
	//   83  183:aconst_null     
	//   84  184:astore_2        
				valueBuilder_ = repeatedfieldbuilderv3;
	//   85  185:aload_0         
	//   86  186:aload_2         
	//   87  187:putfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
			} else
	//*  88  190:goto            205
			{
				valueBuilder_.addAllMessages(((Iterable) (DescriptorProtos.EnumDescriptorProto.access$11000(enumdescriptorproto))));
	//   89  193:aload_0         
	//   90  194:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   91  197:aload_1         
	//   92  198:invokestatic    #532 <Method List DescriptorProtos$EnumDescriptorProto.access$11000(DescriptorProtos$EnumDescriptorProto)>
	//   93  201:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   94  204:pop             
			}
		if(enumdescriptorproto.hasOptions())
	//*  95  205:aload_1         
	//*  96  206:invokevirtual   #543 <Method boolean DescriptorProtos$EnumDescriptorProto.hasOptions()>
	//*  97  209:ifeq            221
			mergeOptions(enumdescriptorproto.getOptions());
	//   98  212:aload_0         
	//   99  213:aload_1         
	//  100  214:invokevirtual   #544 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumDescriptorProto.getOptions()>
	//  101  217:invokevirtual   #548 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeOptions(DescriptorProtos$EnumOptions)>
	//  102  220:pop             
		if(reservedRangeBuilder_ == null)
	//* 103  221:aload_0         
	//* 104  222:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//* 105  225:ifnonnull       299
		{
			if(!DescriptorProtos.EnumDescriptorProto.access$11200(enumdescriptorproto).isEmpty())
	//* 106  228:aload_1         
	//* 107  229:invokestatic    #551 <Method List DescriptorProtos$EnumDescriptorProto.access$11200(DescriptorProtos$EnumDescriptorProto)>
	//* 108  232:invokeinterface #535 <Method boolean List.isEmpty()>
	//* 109  237:ifne            388
			{
				if(reservedRange_.isEmpty())
	//* 110  240:aload_0         
	//* 111  241:getfield        #54  <Field List reservedRange_>
	//* 112  244:invokeinterface #535 <Method boolean List.isEmpty()>
	//* 113  249:ifeq            274
				{
					reservedRange_ = DescriptorProtos.EnumDescriptorProto.access$11200(enumdescriptorproto);
	//  114  252:aload_0         
	//  115  253:aload_1         
	//  116  254:invokestatic    #551 <Method List DescriptorProtos$EnumDescriptorProto.access$11200(DescriptorProtos$EnumDescriptorProto)>
	//  117  257:putfield        #54  <Field List reservedRange_>
					bitField0_ = bitField0_ & -9;
	//  118  260:aload_0         
	//  119  261:aload_0         
	//  120  262:getfield        #75  <Field int bitField0_>
	//  121  265:bipush          -9
	//  122  267:iand            
	//  123  268:putfield        #75  <Field int bitField0_>
				} else
	//* 124  271:goto            292
				{
					ensureReservedRangeIsMutable();
	//  125  274:aload_0         
	//  126  275:invokespecial   #156 <Method void ensureReservedRangeIsMutable()>
					reservedRange_.addAll(((java.util.Collection) (DescriptorProtos.EnumDescriptorProto.access$11200(enumdescriptorproto))));
	//  127  278:aload_0         
	//  128  279:getfield        #54  <Field List reservedRange_>
	//  129  282:aload_1         
	//  130  283:invokestatic    #551 <Method List DescriptorProtos$EnumDescriptorProto.access$11200(DescriptorProtos$EnumDescriptorProto)>
	//  131  286:invokeinterface #538 <Method boolean List.addAll(java.util.Collection)>
	//  132  291:pop             
				}
				onChanged();
	//  133  292:aload_0         
	//  134  293:invokevirtual   #152 <Method void onChanged()>
			}
		} else
	//* 135  296:goto            388
		if(!DescriptorProtos.EnumDescriptorProto.access$11200(enumdescriptorproto).isEmpty())
	//* 136  299:aload_1         
	//* 137  300:invokestatic    #551 <Method List DescriptorProtos$EnumDescriptorProto.access$11200(DescriptorProtos$EnumDescriptorProto)>
	//* 138  303:invokeinterface #535 <Method boolean List.isEmpty()>
	//* 139  308:ifne            388
			if(reservedRangeBuilder_.isEmpty())
	//* 140  311:aload_0         
	//* 141  312:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//* 142  315:invokevirtual   #539 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 143  318:ifeq            376
			{
				reservedRangeBuilder_.dispose();
	//  144  321:aload_0         
	//  145  322:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//  146  325:invokevirtual   #542 <Method void RepeatedFieldBuilderV3.dispose()>
				reservedRangeBuilder_ = null;
	//  147  328:aload_0         
	//  148  329:aconst_null     
	//  149  330:putfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
				reservedRange_ = DescriptorProtos.EnumDescriptorProto.access$11200(enumdescriptorproto);
	//  150  333:aload_0         
	//  151  334:aload_1         
	//  152  335:invokestatic    #551 <Method List DescriptorProtos$EnumDescriptorProto.access$11200(DescriptorProtos$EnumDescriptorProto)>
	//  153  338:putfield        #54  <Field List reservedRange_>
				bitField0_ = bitField0_ & -9;
	//  154  341:aload_0         
	//  155  342:aload_0         
	//  156  343:getfield        #75  <Field int bitField0_>
	//  157  346:bipush          -9
	//  158  348:iand            
	//  159  349:putfield        #75  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3_1;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 160  352:getstatic       #133 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 161  355:ifeq            366
					repeatedfieldbuilderv3_1 = getReservedRangeFieldBuilder();
	//  162  358:aload_0         
	//  163  359:invokespecial   #139 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//  164  362:astore_2        
				else
	//* 165  363:goto            368
					repeatedfieldbuilderv3_1 = null;
	//  166  366:aconst_null     
	//  167  367:astore_2        
				reservedRangeBuilder_ = repeatedfieldbuilderv3_1;
	//  168  368:aload_0         
	//  169  369:aload_2         
	//  170  370:putfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
			} else
	//* 171  373:goto            388
			{
				reservedRangeBuilder_.addAllMessages(((Iterable) (DescriptorProtos.EnumDescriptorProto.access$11200(enumdescriptorproto))));
	//  172  376:aload_0         
	//  173  377:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//  174  380:aload_1         
	//  175  381:invokestatic    #551 <Method List DescriptorProtos$EnumDescriptorProto.access$11200(DescriptorProtos$EnumDescriptorProto)>
	//  176  384:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  177  387:pop             
			}
		if(!DescriptorProtos.EnumDescriptorProto.access$11300(enumdescriptorproto).isEmpty())
	//* 178  388:aload_1         
	//* 179  389:invokestatic    #555 <Method LazyStringList DescriptorProtos$EnumDescriptorProto.access$11300(DescriptorProtos$EnumDescriptorProto)>
	//* 180  392:invokeinterface #556 <Method boolean LazyStringList.isEmpty()>
	//* 181  397:ifne            456
		{
			if(reservedName_.isEmpty())
	//* 182  400:aload_0         
	//* 183  401:getfield        #61  <Field LazyStringList reservedName_>
	//* 184  404:invokeinterface #556 <Method boolean LazyStringList.isEmpty()>
	//* 185  409:ifeq            434
			{
				reservedName_ = DescriptorProtos.EnumDescriptorProto.access$11300(enumdescriptorproto);
	//  186  412:aload_0         
	//  187  413:aload_1         
	//  188  414:invokestatic    #555 <Method LazyStringList DescriptorProtos$EnumDescriptorProto.access$11300(DescriptorProtos$EnumDescriptorProto)>
	//  189  417:putfield        #61  <Field LazyStringList reservedName_>
				bitField0_ = bitField0_ & 0xffffffef;
	//  190  420:aload_0         
	//  191  421:aload_0         
	//  192  422:getfield        #75  <Field int bitField0_>
	//  193  425:bipush          -17
	//  194  427:iand            
	//  195  428:putfield        #75  <Field int bitField0_>
			} else
	//* 196  431:goto            452
			{
				ensureReservedNameIsMutable();
	//  197  434:aload_0         
	//  198  435:invokespecial   #143 <Method void ensureReservedNameIsMutable()>
				reservedName_.addAll(((java.util.Collection) (DescriptorProtos.EnumDescriptorProto.access$11300(enumdescriptorproto))));
	//  199  438:aload_0         
	//  200  439:getfield        #61  <Field LazyStringList reservedName_>
	//  201  442:aload_1         
	//  202  443:invokestatic    #555 <Method LazyStringList DescriptorProtos$EnumDescriptorProto.access$11300(DescriptorProtos$EnumDescriptorProto)>
	//  203  446:invokeinterface #557 <Method boolean LazyStringList.addAll(java.util.Collection)>
	//  204  451:pop             
			}
			onChanged();
	//  205  452:aload_0         
	//  206  453:invokevirtual   #152 <Method void onChanged()>
		}
		mergeUnknownFields(enumdescriptorproto.unknownFields);
	//  207  456:aload_0         
	//  208  457:aload_1         
	//  209  458:getfield        #561 <Field UnknownFieldSet DescriptorProtos$EnumDescriptorProto.unknownFields>
	//  210  461:invokevirtual   #565 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//  211  464:pop             
		onChanged();
	//  212  465:aload_0         
	//  213  466:invokevirtual   #152 <Method void onChanged()>
		return this;
	//  214  469:aload_0         
	//  215  470:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.EnumDescriptorProto)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$EnumDescriptorProto>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.EnumDescriptorProto)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$EnumDescriptorProto>
	//    6   12:invokevirtual   #515 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(DescriptorProtos$EnumDescriptorProto)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #567 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #495 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #499 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #495 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder mergeOptions(DescriptorProtos.EnumOptions enumoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       67
		{
			if((bitField0_ & 4) == 4 && options_ != null && options_ != DescriptorProtos.EnumOptions.getDefaultInstance())
	//*   3    7:aload_0         
	//*   4    8:getfield        #75  <Field int bitField0_>
	//*   5   11:iconst_4        
	//*   6   12:iand            
	//*   7   13:iconst_4        
	//*   8   14:icmpne          55
	//*   9   17:aload_0         
	//*  10   18:getfield        #52  <Field DescriptorProtos$EnumOptions options_>
	//*  11   21:ifnull          55
	//*  12   24:aload_0         
	//*  13   25:getfield        #52  <Field DescriptorProtos$EnumOptions options_>
	//*  14   28:invokestatic    #378 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions.getDefaultInstance()>
	//*  15   31:if_acmpeq       55
				options_ = DescriptorProtos.EnumOptions.newBuilder(options_).mergeFrom(enumoptions).buildPartial();
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #52  <Field DescriptorProtos$EnumOptions options_>
	//   19   39:invokestatic    #574 <Method DescriptorProtos$EnumOptions$Builder DescriptorProtos$EnumOptions.newBuilder(DescriptorProtos$EnumOptions)>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #576 <Method DescriptorProtos$EnumOptions$Builder DescriptorProtos$EnumOptions$Builder.mergeFrom(DescriptorProtos$EnumOptions)>
	//   22   46:invokevirtual   #578 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions$Builder.buildPartial()>
	//   23   49:putfield        #52  <Field DescriptorProtos$EnumOptions options_>
			else
	//*  24   52:goto            60
				options_ = enumoptions;
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:putfield        #52  <Field DescriptorProtos$EnumOptions options_>
			onChanged();
	//   28   60:aload_0         
	//   29   61:invokevirtual   #152 <Method void onChanged()>
		} else
	//*  30   64:goto            76
		{
			optionsBuilder_.mergeFrom(((AbstractMessage) (enumoptions)));
	//   31   67:aload_0         
	//   32   68:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   33   71:aload_1         
	//   34   72:invokevirtual   #581 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
	//   35   75:pop             
		}
		bitField0_ = bitField0_ | 4;
	//   36   76:aload_0         
	//   37   77:aload_0         
	//   38   78:getfield        #75  <Field int bitField0_>
	//   39   81:iconst_4        
	//   40   82:ior             
	//   41   83:putfield        #75  <Field int bitField0_>
		return this;
	//   42   86:aload_0         
	//   43   87:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #565 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$EnumDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #585 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #565 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #565 <Method DescriptorProtos$EnumDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder removeReservedRange(int i)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #156 <Method void ensureReservedRangeIsMutable()>
			reservedRange_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #54  <Field List reservedRange_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #591 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			reservedRangeBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #594 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder removeValue(int i)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureValueIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureValueIsMutable()>
			value_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field List value_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #591 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			valueBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #594 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #598 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #600 <Method DescriptorProtos$EnumDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #600 <Method DescriptorProtos$EnumDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #177 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #178 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #75  <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #75  <Field int bitField0_>
			name_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #42  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #177 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #178 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #75  <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #75  <Field int bitField0_>
			name_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #42  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setOptions(DescriptorProtos.EnumOptions.Builder builder)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       22
		{
			options_ = builder.build();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #606 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions$Builder.build()>
	//    6   12:putfield        #52  <Field DescriptorProtos$EnumOptions options_>
			onChanged();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #152 <Method void onChanged()>
		} else
	//*   9   19:goto            34
		{
			optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
	//   10   22:aload_0         
	//   11   23:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #606 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions$Builder.build()>
	//   14   30:invokevirtual   #609 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   15   33:pop             
		}
		bitField0_ = bitField0_ | 4;
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #75  <Field int bitField0_>
	//   19   39:iconst_4        
	//   20   40:ior             
	//   21   41:putfield        #75  <Field int bitField0_>
		return this;
	//   22   44:aload_0         
	//   23   45:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setOptions(DescriptorProtos.EnumOptions enumoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       31
		{
			if(enumoptions == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
				throw new NullPointerException();
	//    5   11:new             #177 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #178 <Method void NullPointerException()>
	//    8   18:athrow          
			options_ = enumoptions;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #52  <Field DescriptorProtos$EnumOptions options_>
			onChanged();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #152 <Method void onChanged()>
		} else
	//*  14   28:goto            40
		{
			optionsBuilder_.setMessage(((AbstractMessage) (enumoptions)));
	//   15   31:aload_0         
	//   16   32:getfield        #94  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #609 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   19   39:pop             
		}
		bitField0_ = bitField0_ | 4;
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #75  <Field int bitField0_>
	//   23   45:iconst_4        
	//   24   46:ior             
	//   25   47:putfield        #75  <Field int bitField0_>
		return this;
	//   26   50:aload_0         
	//   27   51:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #614 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #616 <Method DescriptorProtos$EnumDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #616 <Method DescriptorProtos$EnumDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setReservedName(int i, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #177 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #178 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			ensureReservedNameIsMutable();
	//    6   12:aload_0         
	//    7   13:invokespecial   #143 <Method void ensureReservedNameIsMutable()>
			reservedName_.set(i, ((Object) (s)));
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field LazyStringList reservedName_>
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:invokeinterface #623 <Method Object LazyStringList.set(int, Object)>
	//   13   27:pop             
			onChanged();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   16   32:aload_0         
	//   17   33:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setReservedRange(int i, rvedRange.Builder builder)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #156 <Method void ensureReservedRangeIsMutable()>
			reservedRange_.set(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #54  <Field List reservedRange_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #197 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.build()>
	//   10   20:invokeinterface #625 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			reservedRangeBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #197 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.build()>
	//   21   41:invokevirtual   #627 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setReservedRange(int i, rvedRange rvedrange)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(rvedrange == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #177 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #178 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureReservedRangeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #156 <Method void ensureReservedRangeIsMutable()>
				reservedRange_.set(i, ((Object) (rvedrange)));
	//   11   23:aload_0         
	//   12   24:getfield        #54  <Field List reservedRange_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #625 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #152 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			reservedRangeBuilder_.setMessage(i, ((AbstractMessage) (rvedrange)));
	//   21   41:aload_0         
	//   22   42:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #627 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public final DescriptorProtos$EnumDescriptorProto$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #630 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #632 <Method DescriptorProtos$EnumDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #632 <Method DescriptorProtos$EnumDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setValue(int i, lder lder)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureValueIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureValueIsMutable()>
			value_.set(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field List value_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #235 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #625 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #152 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			valueBuilder_.setMessage(i, ((AbstractMessage) (lder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #235 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto$Builder.build()>
	//   21   41:invokevirtual   #627 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$EnumDescriptorProto$Builder setValue(int i, DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
	{
		if(valueBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(enumvaluedescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #177 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #178 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureValueIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #164 <Method void ensureValueIsMutable()>
				value_.set(i, ((Object) (enumvaluedescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #50  <Field List value_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #625 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #152 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			valueBuilder_.setMessage(i, ((AbstractMessage) (enumvaluedescriptorproto)));
	//   21   41:aload_0         
	//   22   42:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #627 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	private int bitField0_;
	private Object name_;
	private SingleFieldBuilderV3 optionsBuilder_;
	private DescriptorProtos.EnumOptions options_;
	private LazyStringList reservedName_;
	private RepeatedFieldBuilderV3 reservedRangeBuilder_;
	private List reservedRange_;
	private RepeatedFieldBuilderV3 valueBuilder_;
	private List value_;

	private DescriptorProtos$EnumDescriptorProto$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void GeneratedMessageV3$Builder()>
		name_ = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <String "">
	//    4    7:putfield        #42  <Field Object name_>
		value_ = Collections.emptyList();
	//    5   10:aload_0         
	//    6   11:invokestatic    #48  <Method List Collections.emptyList()>
	//    7   14:putfield        #50  <Field List value_>
		options_ = null;
	//    8   17:aload_0         
	//    9   18:aconst_null     
	//   10   19:putfield        #52  <Field DescriptorProtos$EnumOptions options_>
		reservedRange_ = Collections.emptyList();
	//   11   22:aload_0         
	//   12   23:invokestatic    #48  <Method List Collections.emptyList()>
	//   13   26:putfield        #54  <Field List reservedRange_>
		reservedName_ = LazyStringArrayList.EMPTY;
	//   14   29:aload_0         
	//   15   30:getstatic       #59  <Field LazyStringList LazyStringArrayList.EMPTY>
	//   16   33:putfield        #61  <Field LazyStringList reservedName_>
		maybeForceBuilderInitialization();
	//   17   36:aload_0         
	//   18   37:invokespecial   #64  <Method void maybeForceBuilderInitialization()>
	//   19   40:return          
	}

	DescriptorProtos$EnumDescriptorProto$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void DescriptorProtos$EnumDescriptorProto$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$EnumDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #40  <String "">
	//    5    8:putfield        #42  <Field Object name_>
		value_ = Collections.emptyList();
	//    6   11:aload_0         
	//    7   12:invokestatic    #48  <Method List Collections.emptyList()>
	//    8   15:putfield        #50  <Field List value_>
		options_ = null;
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:putfield        #52  <Field DescriptorProtos$EnumOptions options_>
		reservedRange_ = Collections.emptyList();
	//   12   23:aload_0         
	//   13   24:invokestatic    #48  <Method List Collections.emptyList()>
	//   14   27:putfield        #54  <Field List reservedRange_>
		reservedName_ = LazyStringArrayList.EMPTY;
	//   15   30:aload_0         
	//   16   31:getstatic       #59  <Field LazyStringList LazyStringArrayList.EMPTY>
	//   17   34:putfield        #61  <Field LazyStringList reservedName_>
		maybeForceBuilderInitialization();
	//   18   37:aload_0         
	//   19   38:invokespecial   #64  <Method void maybeForceBuilderInitialization()>
	//   20   41:return          
	}

	DescriptorProtos$EnumDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #72  <Method void DescriptorProtos$EnumDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
