// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DescriptorProtos, LazyStringArrayList, InvalidProtocolBufferException, 
//			UnknownFieldSet, CodedInputStream, LazyStringList, Parser, 
//			ByteString, MessageLite, CodedOutputStream, ProtocolStringList, 
//			ExtensionRegistryLite, Message, SingleFieldBuilderV3, RepeatedFieldBuilderV3, 
//			AbstractParser, MessageOrBuilder

public static final class DescriptorProtos$EnumDescriptorProto extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.EnumDescriptorProtoOrBuilder
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

		public Builder addAllReservedName(Iterable iterable)
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

		public Builder addAllReservedRange(Iterable iterable)
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

		public Builder addAllValue(Iterable iterable)
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
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

		public Builder addReservedName(String s)
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

		public Builder addReservedNameBytes(ByteString bytestring)
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

		public Builder addReservedRange(int i, EnumReservedRange.Builder builder)
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

		public Builder addReservedRange(int i, EnumReservedRange enumreservedrange)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(enumreservedrange == null)
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
					reservedRange_.add(i, ((Object) (enumreservedrange)));
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
				reservedRangeBuilder_.addMessage(i, ((AbstractMessage) (enumreservedrange)));
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

		public Builder addReservedRange(EnumReservedRange.Builder builder)
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

		public Builder addReservedRange(EnumReservedRange enumreservedrange)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(enumreservedrange == null)
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
					reservedRange_.add(((Object) (enumreservedrange)));
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
				reservedRangeBuilder_.addMessage(((AbstractMessage) (enumreservedrange)));
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

		public EnumReservedRange.Builder addReservedRangeBuilder()
		{
			return (EnumReservedRange.Builder)getReservedRangeFieldBuilder().addBuilder(((AbstractMessage) (EnumReservedRange.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
		//    2    4:invokestatic    #220 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getDefaultInstance()>
		//    3    7:invokevirtual   #224 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #193 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    5   13:areturn         
		}

		public EnumReservedRange.Builder addReservedRangeBuilder(int i)
		{
			return (EnumReservedRange.Builder)getReservedRangeFieldBuilder().addBuilder(i, ((AbstractMessage) (EnumReservedRange.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #220 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getDefaultInstance()>
		//    4    8:invokevirtual   #228 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #193 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    6   14:areturn         
		}

		public Builder addValue(int i, DescriptorProtos.EnumValueDescriptorProto.Builder builder)
		{
			if(valueBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureValueIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #164 <Method void ensureValueIsMutable()>
				value_.add(i, ((Object) (builder.build())));
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
				valueBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addValue(int i, DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
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

		public Builder addValue(DescriptorProtos.EnumValueDescriptorProto.Builder builder)
		{
			if(valueBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureValueIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #164 <Method void ensureValueIsMutable()>
				value_.add(((Object) (builder.build())));
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
				valueBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addValue(DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
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

		public DescriptorProtos.EnumValueDescriptorProto.Builder addValueBuilder()
		{
			return (DescriptorProtos.EnumValueDescriptorProto.Builder)getValueFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #135 <Method RepeatedFieldBuilderV3 getValueFieldBuilder()>
		//    2    4:invokestatic    #244 <Method DescriptorProtos$EnumValueDescriptorProto DescriptorProtos$EnumValueDescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #224 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #232 <Class DescriptorProtos$EnumValueDescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.EnumValueDescriptorProto.Builder addValueBuilder(int i)
		{
			return (DescriptorProtos.EnumValueDescriptorProto.Builder)getValueFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance())));
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
			enumdescriptorproto.name_ = name_;
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
				enumdescriptorproto.value_ = value_;
		//   43   76:aload           4
		//   44   78:aload_0         
		//   45   79:getfield        #50  <Field List value_>
		//   46   82:invokestatic    #275 <Method List DescriptorProtos$EnumDescriptorProto.access$11002(DescriptorProtos$EnumDescriptorProto, List)>
		//   47   85:pop             
			} else
		//*  48   86:goto            102
			{
				enumdescriptorproto.value_ = valueBuilder_.build();
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
				enumdescriptorproto.options_ = options_;
		//   69  122:aload           4
		//   70  124:aload_0         
		//   71  125:getfield        #52  <Field DescriptorProtos$EnumOptions options_>
		//   72  128:invokestatic    #281 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumDescriptorProto.access$11102(DescriptorProtos$EnumDescriptorProto, DescriptorProtos$EnumOptions)>
		//   73  131:pop             
			else
		//*  74  132:goto            151
				enumdescriptorproto.options_ = (DescriptorProtos.EnumOptions)optionsBuilder_.build();
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
				enumdescriptorproto.reservedRange_ = reservedRange_;
		//  102  192:aload           4
		//  103  194:aload_0         
		//  104  195:getfield        #54  <Field List reservedRange_>
		//  105  198:invokestatic    #289 <Method List DescriptorProtos$EnumDescriptorProto.access$11202(DescriptorProtos$EnumDescriptorProto, List)>
		//  106  201:pop             
			} else
		//* 107  202:goto            218
			{
				enumdescriptorproto.reservedRange_ = reservedRangeBuilder_.build();
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
			enumdescriptorproto.reservedName_ = reservedName_;
		//  131  254:aload           4
		//  132  256:aload_0         
		//  133  257:getfield        #61  <Field LazyStringList reservedName_>
		//  134  260:invokestatic    #297 <Method LazyStringList DescriptorProtos$EnumDescriptorProto.access$11302(DescriptorProtos$EnumDescriptorProto, LazyStringList)>
		//  135  263:pop             
			enumdescriptorproto.bitField0_ = j;
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

		public Builder clear()
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

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
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

		public Builder clearName()
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

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
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

		public Builder clearOptions()
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

		public Builder clearReservedName()
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

		public Builder clearReservedRange()
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

		public Builder clearValue()
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

		public Builder clone()
		{
			return (Builder)super.clone();
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

		public EnumReservedRange getReservedRange(int i)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       21
				return (EnumReservedRange)reservedRange_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #54  <Field List reservedRange_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #419 <Method Object List.get(int)>
		//    7   17:checkcast       #217 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    8   20:areturn         
			else
				return (EnumReservedRange)reservedRangeBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #422 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #217 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//   14   32:areturn         
		}

		public EnumReservedRange.Builder getReservedRangeBuilder(int i)
		{
			return (EnumReservedRange.Builder)getReservedRangeFieldBuilder().getBuilder(i);
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

		public EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int i)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       21
				return (EnumReservedRangeOrBuilder)reservedRange_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #54  <Field List reservedRange_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #419 <Method Object List.get(int)>
		//    7   17:checkcast       #445 <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder>
		//    8   20:areturn         
			else
				return (EnumReservedRangeOrBuilder)reservedRangeBuilder_.getMessageOrBuilder(i);
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

		public DescriptorProtos.EnumValueDescriptorProto.Builder getValueBuilder(int i)
		{
			return (DescriptorProtos.EnumValueDescriptorProto.Builder)getValueFieldBuilder().getBuilder(i);
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

		public DescriptorProtos.EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int i)
		{
			if(valueBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.EnumValueDescriptorProtoOrBuilder)value_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #50  <Field List value_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #419 <Method Object List.get(int)>
		//    7   17:checkcast       #465 <Class DescriptorProtos$EnumValueDescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.EnumValueDescriptorProtoOrBuilder)valueBuilder_.getMessageOrBuilder(i);
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

		public Builder mergeFrom(DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
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
				name_ = enumdescriptorproto.name_;
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
				if(!enumdescriptorproto.value_.isEmpty())
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
						value_ = enumdescriptorproto.value_;
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
						value_.addAll(((java.util.Collection) (enumdescriptorproto.value_)));
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
			if(!enumdescriptorproto.value_.isEmpty())
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
					value_ = enumdescriptorproto.value_;
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
					valueBuilder_.addAllMessages(((Iterable) (enumdescriptorproto.value_)));
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
				if(!enumdescriptorproto.reservedRange_.isEmpty())
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
						reservedRange_ = enumdescriptorproto.reservedRange_;
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
						reservedRange_.addAll(((java.util.Collection) (enumdescriptorproto.reservedRange_)));
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
			if(!enumdescriptorproto.reservedRange_.isEmpty())
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
					reservedRange_ = enumdescriptorproto.reservedRange_;
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
					reservedRangeBuilder_.addAllMessages(((Iterable) (enumdescriptorproto.reservedRange_)));
		//  172  376:aload_0         
		//  173  377:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//  174  380:aload_1         
		//  175  381:invokestatic    #551 <Method List DescriptorProtos$EnumDescriptorProto.access$11200(DescriptorProtos$EnumDescriptorProto)>
		//  176  384:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//  177  387:pop             
				}
			if(!enumdescriptorproto.reservedName_.isEmpty())
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
					reservedName_ = enumdescriptorproto.reservedName_;
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
					reservedName_.addAll(((java.util.Collection) (enumdescriptorproto.reservedName_)));
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

		public Builder mergeFrom(Message message)
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

		public Builder mergeOptions(DescriptorProtos.EnumOptions enumoptions)
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

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
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

		public Builder removeReservedRange(int i)
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

		public Builder removeValue(int i)
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
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

		public Builder setName(String s)
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

		public Builder setNameBytes(ByteString bytestring)
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

		public Builder setOptions(DescriptorProtos.EnumOptions.Builder builder)
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

		public Builder setOptions(DescriptorProtos.EnumOptions enumoptions)
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

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

		public Builder setReservedName(int i, String s)
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

		public Builder setReservedRange(int i, EnumReservedRange.Builder builder)
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

		public Builder setReservedRange(int i, EnumReservedRange enumreservedrange)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #117 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(enumreservedrange == null)
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
					reservedRange_.set(i, ((Object) (enumreservedrange)));
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
				reservedRangeBuilder_.setMessage(i, ((AbstractMessage) (enumreservedrange)));
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
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

		public Builder setValue(int i, DescriptorProtos.EnumValueDescriptorProto.Builder builder)
		{
			if(valueBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #126 <Field RepeatedFieldBuilderV3 valueBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureValueIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #164 <Method void ensureValueIsMutable()>
				value_.set(i, ((Object) (builder.build())));
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
				valueBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setValue(int i, DescriptorProtos.EnumValueDescriptorProto enumvaluedescriptorproto)
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

		private Builder()
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

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #67  <Method void DescriptorProtos$EnumDescriptorProto$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #72  <Method void DescriptorProtos$EnumDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static final class EnumReservedRange extends GeneratedMessageV3
		implements EnumReservedRangeOrBuilder
	{

		public static EnumReservedRange getDefaultInstance()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$9700();
		//    0    0:invokestatic    #126 <Method Descriptors$Descriptor DescriptorProtos.access$9700()>
		//    1    3:areturn         
		}

		public static Builder newBuilder()
		{
			return DEFAULT_INSTANCE.toBuilder();
		//    0    0:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #130 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder toBuilder()>
		//    2    6:areturn         
		}

		public static Builder newBuilder(EnumReservedRange enumreservedrange)
		{
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(enumreservedrange);
		//    0    0:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #130 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder toBuilder()>
		//    2    6:aload_0         
		//    3    7:invokevirtual   #134 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
		//    4   10:areturn         
		}

		public static EnumReservedRange parseDelimitedFrom(InputStream inputstream)
			throws IOException
		{
			return (EnumReservedRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #140 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    4   10:areturn         
		}

		public static EnumReservedRange parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (EnumReservedRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #144 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    5   11:areturn         
		}

		public static EnumReservedRange parseFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return (EnumReservedRange)PARSER.parseFrom(bytestring);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #151 <Method Object Parser.parseFrom(ByteString)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    4   12:areturn         
		}

		public static EnumReservedRange parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (EnumReservedRange)PARSER.parseFrom(bytestring, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #155 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    5   13:areturn         
		}

		public static EnumReservedRange parseFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return (EnumReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #160 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    4   10:areturn         
		}

		public static EnumReservedRange parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (EnumReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #164 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    5   11:areturn         
		}

		public static EnumReservedRange parseFrom(InputStream inputstream)
			throws IOException
		{
			return (EnumReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #166 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    4   10:areturn         
		}

		public static EnumReservedRange parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (EnumReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #168 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    5   11:areturn         
		}

		public static EnumReservedRange parseFrom(ByteBuffer bytebuffer)
			throws InvalidProtocolBufferException
		{
			return (EnumReservedRange)PARSER.parseFrom(bytebuffer);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #172 <Method Object Parser.parseFrom(ByteBuffer)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    4   12:areturn         
		}

		public static EnumReservedRange parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (EnumReservedRange)PARSER.parseFrom(bytebuffer, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #176 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    5   13:areturn         
		}

		public static EnumReservedRange parseFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return (EnumReservedRange)PARSER.parseFrom(abyte0);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #180 <Method Object Parser.parseFrom(byte[])>
		//    3    9:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    4   12:areturn         
		}

		public static EnumReservedRange parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (EnumReservedRange)PARSER.parseFrom(abyte0, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #184 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    5   13:areturn         
		}

		public static Parser parser()
		{
			return PARSER;
		//    0    0:getstatic       #47  <Field Parser PARSER>
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
			if(!(obj instanceof EnumReservedRange))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//*   7   11:ifne            20
				return super.equals(obj);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokespecial   #191 <Method boolean GeneratedMessageV3.equals(Object)>
		//   11   19:ireturn         
			obj = ((Object) ((EnumReservedRange)obj));
		//   12   20:aload_1         
		//   13   21:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//   14   24:astore_1        
			boolean flag;
			if(true && hasStart() == ((EnumReservedRange) (obj)).hasStart())
		//*  15   25:iconst_1        
		//*  16   26:ifeq            45
		//*  17   29:aload_0         
		//*  18   30:invokevirtual   #195 <Method boolean hasStart()>
		//*  19   33:aload_1         
		//*  20   34:invokevirtual   #195 <Method boolean hasStart()>
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
			if(hasStart())
		//*  29   49:aload_0         
		//*  30   50:invokevirtual   #195 <Method boolean hasStart()>
		//*  31   53:ifeq            78
				if(flag && getStart() == ((EnumReservedRange) (obj)).getStart())
		//*  32   56:iload_2         
		//*  33   57:ifeq            76
		//*  34   60:aload_0         
		//*  35   61:invokevirtual   #198 <Method int getStart()>
		//*  36   64:aload_1         
		//*  37   65:invokevirtual   #198 <Method int getStart()>
		//*  38   68:icmpne          76
					flag1 = true;
		//   39   71:iconst_1        
		//   40   72:istore_3        
				else
		//*  41   73:goto            78
					flag1 = false;
		//   42   76:iconst_0        
		//   43   77:istore_3        
			if(flag1 && hasEnd() == ((EnumReservedRange) (obj)).hasEnd())
		//*  44   78:iload_3         
		//*  45   79:ifeq            98
		//*  46   82:aload_0         
		//*  47   83:invokevirtual   #201 <Method boolean hasEnd()>
		//*  48   86:aload_1         
		//*  49   87:invokevirtual   #201 <Method boolean hasEnd()>
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
			if(hasEnd())
		//*  58  102:aload_0         
		//*  59  103:invokevirtual   #201 <Method boolean hasEnd()>
		//*  60  106:ifeq            131
				if(flag && getEnd() == ((EnumReservedRange) (obj)).getEnd())
		//*  61  109:iload_2         
		//*  62  110:ifeq            129
		//*  63  113:aload_0         
		//*  64  114:invokevirtual   #204 <Method int getEnd()>
		//*  65  117:aload_1         
		//*  66  118:invokevirtual   #204 <Method int getEnd()>
		//*  67  121:icmpne          129
					flag1 = true;
		//   68  124:iconst_1        
		//   69  125:istore_3        
				else
		//*  70  126:goto            131
					flag1 = false;
		//   71  129:iconst_0        
		//   72  130:istore_3        
			return flag1 && unknownFields.equals(((Object) (((EnumReservedRange) (obj)).unknownFields)));
		//   73  131:iload_3         
		//   74  132:ifeq            151
		//   75  135:aload_0         
		//   76  136:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   77  139:aload_1         
		//   78  140:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   79  143:invokevirtual   #205 <Method boolean UnknownFieldSet.equals(Object)>
		//   80  146:ifeq            151
		//   81  149:iconst_1        
		//   82  150:ireturn         
		//   83  151:iconst_0        
		//   84  152:ireturn         
		}

		public EnumReservedRange getDefaultInstanceForType()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #209 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #209 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public int getEnd()
		{
			return end_;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field int end_>
		//    2    4:ireturn         
		}

		public Parser getParserForType()
		{
			return PARSER;
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:areturn         
		}

		public int getSerializedSize()
		{
			int i = memoizedSize;
		//    0    0:aload_0         
		//    1    1:getfield        #215 <Field int memoizedSize>
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
		//*  11   15:getfield        #81  <Field int bitField0_>
		//*  12   18:iconst_1        
		//*  13   19:iand            
		//*  14   20:iconst_1        
		//*  15   21:icmpne          35
				i = CodedOutputStream.computeInt32Size(1, start_) + 0;
		//   16   24:iconst_1        
		//   17   25:aload_0         
		//   18   26:getfield        #53  <Field int start_>
		//   19   29:invokestatic    #221 <Method int CodedOutputStream.computeInt32Size(int, int)>
		//   20   32:iconst_0        
		//   21   33:iadd            
		//   22   34:istore_1        
			int j = i;
		//   23   35:iload_1         
		//   24   36:istore_2        
			if((bitField0_ & 2) == 2)
		//*  25   37:aload_0         
		//*  26   38:getfield        #81  <Field int bitField0_>
		//*  27   41:iconst_2        
		//*  28   42:iand            
		//*  29   43:iconst_2        
		//*  30   44:icmpne          58
				j = i + CodedOutputStream.computeInt32Size(2, end_);
		//   31   47:iload_1         
		//   32   48:iconst_2        
		//   33   49:aload_0         
		//   34   50:getfield        #55  <Field int end_>
		//   35   53:invokestatic    #221 <Method int CodedOutputStream.computeInt32Size(int, int)>
		//   36   56:iadd            
		//   37   57:istore_2        
			i = j + unknownFields.getSerializedSize();
		//   38   58:iload_2         
		//   39   59:aload_0         
		//   40   60:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   41   63:invokevirtual   #223 <Method int UnknownFieldSet.getSerializedSize()>
		//   42   66:iadd            
		//   43   67:istore_1        
			memoizedSize = i;
		//   44   68:aload_0         
		//   45   69:iload_1         
		//   46   70:putfield        #215 <Field int memoizedSize>
			return i;
		//   47   73:iload_1         
		//   48   74:ireturn         
		}

		public int getStart()
		{
			return start_;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field int start_>
		//    2    4:ireturn         
		}

		public final UnknownFieldSet getUnknownFields()
		{
			return unknownFields;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field UnknownFieldSet unknownFields>
		//    2    4:areturn         
		}

		public boolean hasEnd()
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

		public boolean hasStart()
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

		public int hashCode()
		{
			if(memoizedHashCode != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #228 <Field int memoizedHashCode>
		//*   2    4:ifeq            12
				return memoizedHashCode;
		//    3    7:aload_0         
		//    4    8:getfield        #228 <Field int memoizedHashCode>
		//    5   11:ireturn         
			int j = ((Object) (getDescriptor())).hashCode() + 779;
		//    6   12:invokestatic    #230 <Method Descriptors$Descriptor getDescriptor()>
		//    7   15:invokevirtual   #234 <Method int Object.hashCode()>
		//    8   18:sipush          779
		//    9   21:iadd            
		//   10   22:istore_2        
			int i = j;
		//   11   23:iload_2         
		//   12   24:istore_1        
			if(hasStart())
		//*  13   25:aload_0         
		//*  14   26:invokevirtual   #195 <Method boolean hasStart()>
		//*  15   29:ifeq            47
				i = (j * 37 + 1) * 53 + getStart();
		//   16   32:iload_2         
		//   17   33:bipush          37
		//   18   35:imul            
		//   19   36:iconst_1        
		//   20   37:iadd            
		//   21   38:bipush          53
		//   22   40:imul            
		//   23   41:aload_0         
		//   24   42:invokevirtual   #198 <Method int getStart()>
		//   25   45:iadd            
		//   26   46:istore_1        
			j = i;
		//   27   47:iload_1         
		//   28   48:istore_2        
			if(hasEnd())
		//*  29   49:aload_0         
		//*  30   50:invokevirtual   #201 <Method boolean hasEnd()>
		//*  31   53:ifeq            71
				j = (i * 37 + 2) * 53 + getEnd();
		//   32   56:iload_1         
		//   33   57:bipush          37
		//   34   59:imul            
		//   35   60:iconst_2        
		//   36   61:iadd            
		//   37   62:bipush          53
		//   38   64:imul            
		//   39   65:aload_0         
		//   40   66:invokevirtual   #204 <Method int getEnd()>
		//   41   69:iadd            
		//   42   70:istore_2        
			i = j * 29 + unknownFields.hashCode();
		//   43   71:iload_2         
		//   44   72:bipush          29
		//   45   74:imul            
		//   46   75:aload_0         
		//   47   76:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   48   79:invokevirtual   #235 <Method int UnknownFieldSet.hashCode()>
		//   49   82:iadd            
		//   50   83:istore_1        
			memoizedHashCode = i;
		//   51   84:aload_0         
		//   52   85:iload_1         
		//   53   86:putfield        #228 <Field int memoizedHashCode>
			return i;
		//   54   89:iload_1         
		//   55   90:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$9800().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange, com/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder);
		//    0    0:invokestatic    #240 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$9800()>
		//    1    3:ldc1            #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    2    5:ldc1            #16  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    3    7:invokevirtual   #246 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			byte byte0 = memoizedIsInitialized;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field byte memoizedIsInitialized>
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
			{
				return false;
		//   10   16:iconst_0        
		//   11   17:ireturn         
			} else
			{
				memoizedIsInitialized = 1;
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:putfield        #51  <Field byte memoizedIsInitialized>
				return true;
		//   15   23:iconst_1        
		//   16   24:ireturn         
			}
		}

		public Builder newBuilderForType()
		{
			return newBuilder();
		//    0    0:invokestatic    #250 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilder()>
		//    1    3:areturn         
		}

		protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #16  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #254 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
		//    5    9:areturn         
		}

		public volatile Message.Builder newBuilderForType()
		{
			return ((Message.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return ((Message.Builder) (newBuilderForType(builderparent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #260 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder newBuilderForType()
		{
			return ((MessageLite.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #257 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		public Builder toBuilder()
		{
			if(this == DEFAULT_INSTANCE)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
		//*   2    4:if_acmpne       16
				return new Builder(((DescriptorProtos._cls1) (null)));
		//    3    7:new             #16  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    4   10:dup             
		//    5   11:aconst_null     
		//    6   12:invokespecial   #264 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(DescriptorProtos$1)>
		//    7   15:areturn         
			else
				return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
		//    8   16:new             #16  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    9   19:dup             
		//   10   20:aconst_null     
		//   11   21:invokespecial   #264 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(DescriptorProtos$1)>
		//   12   24:aload_0         
		//   13   25:invokevirtual   #134 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder.mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
		//   14   28:areturn         
		}

		public volatile Message.Builder toBuilder()
		{
			return ((Message.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #130 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder toBuilder()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder toBuilder()
		{
			return ((MessageLite.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #130 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder toBuilder()>
		//    2    4:areturn         
		}

		public void writeTo(CodedOutputStream codedoutputstream)
			throws IOException
		{
			if((bitField0_ & 1) == 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #81  <Field int bitField0_>
		//*   2    4:iconst_1        
		//*   3    5:iand            
		//*   4    6:iconst_1        
		//*   5    7:icmpne          19
				codedoutputstream.writeInt32(1, start_);
		//    6   10:aload_1         
		//    7   11:iconst_1        
		//    8   12:aload_0         
		//    9   13:getfield        #53  <Field int start_>
		//   10   16:invokevirtual   #270 <Method void CodedOutputStream.writeInt32(int, int)>
			if((bitField0_ & 2) == 2)
		//*  11   19:aload_0         
		//*  12   20:getfield        #81  <Field int bitField0_>
		//*  13   23:iconst_2        
		//*  14   24:iand            
		//*  15   25:iconst_2        
		//*  16   26:icmpne          38
				codedoutputstream.writeInt32(2, end_);
		//   17   29:aload_1         
		//   18   30:iconst_2        
		//   19   31:aload_0         
		//   20   32:getfield        #55  <Field int end_>
		//   21   35:invokevirtual   #270 <Method void CodedOutputStream.writeInt32(int, int)>
			unknownFields.writeTo(codedoutputstream);
		//   22   38:aload_0         
		//   23   39:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   24   42:aload_1         
		//   25   43:invokevirtual   #272 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
		//   26   46:return          
		}

		private static final EnumReservedRange DEFAULT_INSTANCE = new EnumReservedRange();
		public static final int END_FIELD_NUMBER = 2;
		public static final Parser PARSER = new AbstractParser() {

			public EnumReservedRange parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return new EnumReservedRange(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
			//    0    0:new             #7   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #25  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
			//    6   10:areturn         
			}

			public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
			//    4    6:areturn         
			}

		}
;
		public static final int START_FIELD_NUMBER = 1;
		private static final long serialVersionUID = 0L;
		private int bitField0_;
		private int end_;
		private byte memoizedIsInitialized;
		private int start_;

		static 
		{
		//    0    0:new             #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    1    3:dup             
		//    2    4:invokespecial   #42  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange()>
		//    3    7:putstatic       #44  <Field DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE>
		//    4   10:new             #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$1>
		//    5   13:dup             
		//    6   14:invokespecial   #45  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$1()>
		//    7   17:putstatic       #47  <Field Parser PARSER>
		//*   8   20:return          
		}


/*
		static int access$10202(EnumReservedRange enumreservedrange, int i)
		{
			enumreservedrange.start_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #53  <Field int start_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static int access$10302(EnumReservedRange enumreservedrange, int i)
		{
			enumreservedrange.end_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #55  <Field int end_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static int access$10402(EnumReservedRange enumreservedrange, int i)
		{
			enumreservedrange.bitField0_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #81  <Field int bitField0_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/

		private EnumReservedRange()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #49  <Method void GeneratedMessageV3()>
			memoizedIsInitialized = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #51  <Field byte memoizedIsInitialized>
			start_ = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #53  <Field int start_>
			end_ = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #55  <Field int end_>
		//   11   19:return          
		}

		private EnumReservedRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			boolean flag;
			UnknownFieldSet.Builder builder;
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange()>
			if(extensionregistrylite == null)
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       16
				throw new NullPointerException();
		//    4    8:new             #62  <Class NullPointerException>
		//    5   11:dup             
		//    6   12:invokespecial   #63  <Method void NullPointerException()>
		//    7   15:athrow          
			builder = UnknownFieldSet.newBuilder();
		//    8   16:invokestatic    #69  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
		//    9   19:astore          5
			flag = false;
		//   10   21:iconst_0        
		//   11   22:istore_3        
_L8:
			if(flag) goto _L2; else goto _L1
		//   12   23:iload_3         
		//   13   24:ifne            128
_L1:
			int i = codedinputstream.readTag();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #75  <Method int CodedInputStream.readTag()>
		//   16   31:istore          4
			i;
		//   17   33:iload           4
			JVM INSTR lookupswitch 3: default 179
		//		               0: 182
		//		               8: 86
		//		               16: 107;
		//   18   35:lookupswitch    3: default 179
		//		               0: 182
		//		               8: 86
		//		               16: 107
			   goto _L3 _L4 _L5 _L6
_L3:
			if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
		//*  19   68:aload_0         
		//*  20   69:aload_1         
		//*  21   70:aload           5
		//*  22   72:aload_2         
		//*  23   73:iload           4
		//*  24   75:invokevirtual   #79  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
		//*  25   78:ifne            125
				flag = true;
		//   26   81:iconst_1        
		//   27   82:istore_3        
			continue; /* Loop/switch isn't completed */
		//   28   83:goto            125
_L5:
			bitField0_ = bitField0_ | 1;
		//   29   86:aload_0         
		//   30   87:aload_0         
		//   31   88:getfield        #81  <Field int bitField0_>
		//   32   91:iconst_1        
		//   33   92:ior             
		//   34   93:putfield        #81  <Field int bitField0_>
			start_ = codedinputstream.readInt32();
		//   35   96:aload_0         
		//   36   97:aload_1         
		//   37   98:invokevirtual   #84  <Method int CodedInputStream.readInt32()>
		//   38  101:putfield        #53  <Field int start_>
			continue; /* Loop/switch isn't completed */
		//   39  104:goto            125
_L6:
			bitField0_ = bitField0_ | 2;
		//   40  107:aload_0         
		//   41  108:aload_0         
		//   42  109:getfield        #81  <Field int bitField0_>
		//   43  112:iconst_2        
		//   44  113:ior             
		//   45  114:putfield        #81  <Field int bitField0_>
			end_ = codedinputstream.readInt32();
		//   46  117:aload_0         
		//   47  118:aload_1         
		//   48  119:invokevirtual   #84  <Method int CodedInputStream.readInt32()>
		//   49  122:putfield        #55  <Field int end_>
			continue; /* Loop/switch isn't completed */
		//   50  125:goto            23
_L2:
			unknownFields = builder.build();
		//   51  128:aload_0         
		//   52  129:aload           5
		//   53  131:invokevirtual   #90  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//   54  134:putfield        #94  <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//   55  137:aload_0         
		//   56  138:invokevirtual   #97  <Method void makeExtensionsImmutable()>
			return;
		//   57  141:return          
			codedinputstream;
		//   58  142:astore_1        
			throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
		//   59  143:aload_1         
		//   60  144:aload_0         
		//   61  145:invokevirtual   #101 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//   62  148:athrow          
			codedinputstream;
		//   63  149:astore_1        
			throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
		//   64  150:new             #58  <Class InvalidProtocolBufferException>
		//   65  153:dup             
		//   66  154:aload_1         
		//   67  155:invokespecial   #104 <Method void InvalidProtocolBufferException(IOException)>
		//   68  158:aload_0         
		//   69  159:invokevirtual   #101 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//   70  162:athrow          
			codedinputstream;
		//   71  163:astore_1        
			unknownFields = builder.build();
		//   72  164:aload_0         
		//   73  165:aload           5
		//   74  167:invokevirtual   #90  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//   75  170:putfield        #94  <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//   76  173:aload_0         
		//   77  174:invokevirtual   #97  <Method void makeExtensionsImmutable()>
			throw codedinputstream;
		//   78  177:aload_1         
		//   79  178:athrow          
		//*  80  179:goto            68
_L4:
			flag = true;
		//   81  182:iconst_1        
		//   82  183:istore_3        
			if(true) goto _L8; else goto _L7
		//   83  184:goto            125
_L7:
		}

		EnumReservedRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
			throws InvalidProtocolBufferException
		{
			this(codedinputstream, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #108 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:return          
		}

		private EnumReservedRange(GeneratedMessageV3.Builder builder)
		{
			super(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #111 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
			memoizedIsInitialized = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #51  <Field byte memoizedIsInitialized>
		//    6   10:return          
		}

		EnumReservedRange(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
		{
			this(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #115 <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange(GeneratedMessageV3$Builder)>
		//    3    5:return          
		}
	}

	public static final class EnumReservedRange.Builder extends GeneratedMessageV3.Builder
		implements EnumReservedRangeOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$9700();
		//    0    0:invokestatic    #40  <Method Descriptors$Descriptor DescriptorProtos.access$9700()>
		//    1    3:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
		//    0    0:getstatic       #46  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//    1    3:istore_1        
		//    2    4:return          
		}

		public EnumReservedRange.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (EnumReservedRange.Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #51  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #53  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #53  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public EnumReservedRange build()
		{
			EnumReservedRange enumreservedrange = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange buildPartial()>
		//    2    4:astore_1        
			if(!enumreservedrange.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #63  <Method boolean DescriptorProtos$EnumDescriptorProto$EnumReservedRange.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (enumreservedrange)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #67  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return enumreservedrange;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #70  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #70  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange build()>
		//    2    4:areturn         
		}

		public EnumReservedRange buildPartial()
		{
			EnumReservedRange enumreservedrange = new EnumReservedRange(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #74  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #76  <Field int bitField0_>
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
			enumreservedrange.start_ = start_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #78  <Field int start_>
		//   21   33:invokestatic    #82  <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$10202(DescriptorProtos$EnumDescriptorProto$EnumReservedRange, int)>
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
			enumreservedrange.end_ = end_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #84  <Field int end_>
		//   37   56:invokestatic    #87  <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$10302(DescriptorProtos$EnumDescriptorProto$EnumReservedRange, int)>
		//   38   59:pop             
			enumreservedrange.bitField0_ = j;
		//   39   60:aload           4
		//   40   62:iload_2         
		//   41   63:invokestatic    #90  <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.access$10402(DescriptorProtos$EnumDescriptorProto$EnumReservedRange, int)>
		//   42   66:pop             
			onBuilt();
		//   43   67:aload_0         
		//   44   68:invokevirtual   #93  <Method void onBuilt()>
			return enumreservedrange;
		//   45   71:aload           4
		//   46   73:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public EnumReservedRange.Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #101 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			start_ = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #78  <Field int start_>
			bitField0_ = bitField0_ & -2;
		//    6   10:aload_0         
		//    7   11:aload_0         
		//    8   12:getfield        #76  <Field int bitField0_>
		//    9   15:bipush          -2
		//   10   17:iand            
		//   11   18:putfield        #76  <Field int bitField0_>
			end_ = 0;
		//   12   21:aload_0         
		//   13   22:iconst_0        
		//   14   23:putfield        #84  <Field int end_>
			bitField0_ = bitField0_ & -3;
		//   15   26:aload_0         
		//   16   27:aload_0         
		//   17   28:getfield        #76  <Field int bitField0_>
		//   18   31:bipush          -3
		//   19   33:iand            
		//   20   34:putfield        #76  <Field int bitField0_>
			return this;
		//   21   37:aload_0         
		//   22   38:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public EnumReservedRange.Builder clearEnd()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #76  <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #76  <Field int bitField0_>
			end_ = 0;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #84  <Field int end_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public EnumReservedRange.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (EnumReservedRange.Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #112 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #114 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #114 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public EnumReservedRange.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (EnumReservedRange.Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #123 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public EnumReservedRange.Builder clearStart()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #76  <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #76  <Field int bitField0_>
			start_ = 0;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #78  <Field int start_>
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
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public EnumReservedRange.Builder clone()
		{
			return (EnumReservedRange.Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #131 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public EnumReservedRange getDefaultInstanceForType()
		{
			return EnumReservedRange.getDefaultInstance();
		//    0    0:invokestatic    #139 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #141 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #141 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$9700();
		//    0    0:invokestatic    #40  <Method Descriptors$Descriptor DescriptorProtos.access$9700()>
		//    1    3:areturn         
		}

		public int getEnd()
		{
			return end_;
		//    0    0:aload_0         
		//    1    1:getfield        #84  <Field int end_>
		//    2    4:ireturn         
		}

		public int getStart()
		{
			return start_;
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field int start_>
		//    2    4:ireturn         
		}

		public boolean hasEnd()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasStart()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field int bitField0_>
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
			return DescriptorProtos.access$9800().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange, com/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder);
		//    0    0:invokestatic    #152 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$9800()>
		//    1    3:ldc1            #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    2    5:ldc1            #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    3    7:invokevirtual   #158 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #169 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public EnumReservedRange.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
			codedinputstream = ((CodedInputStream) ((EnumReservedRange)EnumReservedRange.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #176 <Field Parser DescriptorProtos$EnumDescriptorProto$EnumReservedRange.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #182 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((EnumReservedRange) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #185 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #188 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #192 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #185 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
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
			codedinputstream = ((CodedInputStream) ((EnumReservedRange)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((EnumReservedRange) (codedinputstream1)));
			throw codedinputstream;
		}

		public EnumReservedRange.Builder mergeFrom(EnumReservedRange enumreservedrange)
		{
			if(enumreservedrange == EnumReservedRange.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #139 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(enumreservedrange.hasStart())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #194 <Method boolean DescriptorProtos$EnumDescriptorProto$EnumReservedRange.hasStart()>
		//*   7   13:ifeq            25
				setStart(enumreservedrange.getStart());
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #196 <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getStart()>
		//   11   21:invokevirtual   #200 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setStart(int)>
		//   12   24:pop             
			if(enumreservedrange.hasEnd())
		//*  13   25:aload_1         
		//*  14   26:invokevirtual   #202 <Method boolean DescriptorProtos$EnumDescriptorProto$EnumReservedRange.hasEnd()>
		//*  15   29:ifeq            41
				setEnd(enumreservedrange.getEnd());
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:invokevirtual   #204 <Method int DescriptorProtos$EnumDescriptorProto$EnumReservedRange.getEnd()>
		//   19   37:invokevirtual   #207 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setEnd(int)>
		//   20   40:pop             
			mergeUnknownFields(enumreservedrange.unknownFields);
		//   21   41:aload_0         
		//   22   42:aload_1         
		//   23   43:getfield        #211 <Field UnknownFieldSet DescriptorProtos$EnumDescriptorProto$EnumReservedRange.unknownFields>
		//   24   46:invokevirtual   #215 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//   25   49:pop             
			onChanged();
		//   26   50:aload_0         
		//   27   51:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   28   54:aload_0         
		//   29   55:areturn         
		}

		public EnumReservedRange.Builder mergeFrom(Message message)
		{
			if(message instanceof EnumReservedRange)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//*   2    4:ifeq            16
			{
				return mergeFrom((EnumReservedRange)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #14  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
		//    6   12:invokevirtual   #185 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(DescriptorProtos$EnumDescriptorProto$EnumReservedRange)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #217 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #169 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #215 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final EnumReservedRange.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (EnumReservedRange.Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #224 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #215 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #215 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public EnumReservedRange.Builder setEnd(int i)
		{
			bitField0_ = bitField0_ | 2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #76  <Field int bitField0_>
		//    3    5:iconst_2        
		//    4    6:ior             
		//    5    7:putfield        #76  <Field int bitField0_>
			end_ = i;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #84  <Field int end_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public EnumReservedRange.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (EnumReservedRange.Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #228 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #230 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #230 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public EnumReservedRange.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (EnumReservedRange.Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #235 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #237 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #237 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public EnumReservedRange.Builder setStart(int i)
		{
			bitField0_ = bitField0_ | 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #76  <Field int bitField0_>
		//    3    5:iconst_1        
		//    4    6:ior             
		//    5    7:putfield        #76  <Field int bitField0_>
			start_ = i;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #78  <Field int start_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public final EnumReservedRange.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (EnumReservedRange.Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #241 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #243 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #243 <Method DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private int end_;
		private int start_;

		private EnumReservedRange.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void GeneratedMessageV3$Builder()>
			maybeForceBuilderInitialization();
		//    2    4:aload_0         
		//    3    5:invokespecial   #27  <Method void maybeForceBuilderInitialization()>
		//    4    8:return          
		}

		EnumReservedRange.Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder()>
		//    2    4:return          
		}

		private EnumReservedRange.Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #33  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			maybeForceBuilderInitialization();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void maybeForceBuilderInitialization()>
		//    5    9:return          
		}

		EnumReservedRange.Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #35  <Method void DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static interface EnumReservedRangeOrBuilder
		extends MessageOrBuilder
	{

		public abstract int getEnd();

		public abstract int getStart();

		public abstract boolean hasEnd();

		public abstract boolean hasStart();
	}


	public static DescriptorProtos$EnumDescriptorProto getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #66  <Field DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$9500();
	//    0    0:invokestatic    #230 <Method Descriptors$Descriptor DescriptorProtos.access$9500()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #66  <Field DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #233 <Method DescriptorProtos$EnumDescriptorProto$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$enumdescriptorproto);
	//    0    0:getstatic       #66  <Field DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #233 <Method DescriptorProtos$EnumDescriptorProto$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #236 <Method DescriptorProtos$EnumDescriptorProto$Builder DescriptorProtos$EnumDescriptorProto$Builder.mergeFrom(DescriptorProtos$EnumDescriptorProto)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #242 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #246 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #253 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #257 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #262 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #266 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #268 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$EnumDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #270 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #274 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #278 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #282 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$EnumDescriptorProto parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$EnumDescriptorProto)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #286 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #69  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$EnumDescriptorProto))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$EnumDescriptorProto>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #292 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$EnumDescriptorProto)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$EnumDescriptorProto>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasName() == ((DescriptorProtos$EnumDescriptorProto) (obj)).hasName())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #296 <Method boolean hasName()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #296 <Method boolean hasName()>
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
		if(hasName())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #296 <Method boolean hasName()>
	//*  31   53:ifeq            81
			if(flag && getName().equals(((Object) (((DescriptorProtos$EnumDescriptorProto) (obj)).getName()))))
	//*  32   56:iload_2         
	//*  33   57:ifeq            79
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #300 <Method String getName()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #300 <Method String getName()>
	//*  38   68:invokevirtual   #303 <Method boolean String.equals(Object)>
	//*  39   71:ifeq            79
				flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
			else
	//*  42   76:goto            81
				flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if(flag1 && getValueList().equals(((Object) (((DescriptorProtos$EnumDescriptorProto) (obj)).getValueList()))))
	//*  45   81:iload_3         
	//*  46   82:ifeq            106
	//*  47   85:aload_0         
	//*  48   86:invokevirtual   #306 <Method List getValueList()>
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #306 <Method List getValueList()>
	//*  51   93:invokeinterface #307 <Method boolean List.equals(Object)>
	//*  52   98:ifeq            106
			flag = true;
	//   53  101:iconst_1        
	//   54  102:istore_2        
		else
	//*  55  103:goto            108
			flag = false;
	//   56  106:iconst_0        
	//   57  107:istore_2        
		if(flag && hasOptions() == ((DescriptorProtos$EnumDescriptorProto) (obj)).hasOptions())
	//*  58  108:iload_2         
	//*  59  109:ifeq            128
	//*  60  112:aload_0         
	//*  61  113:invokevirtual   #310 <Method boolean hasOptions()>
	//*  62  116:aload_1         
	//*  63  117:invokevirtual   #310 <Method boolean hasOptions()>
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
		if(hasOptions())
	//*  72  132:aload_0         
	//*  73  133:invokevirtual   #310 <Method boolean hasOptions()>
	//*  74  136:ifeq            164
			if(flag && getOptions().equals(((Object) (((DescriptorProtos$EnumDescriptorProto) (obj)).getOptions()))))
	//*  75  139:iload_2         
	//*  76  140:ifeq            162
	//*  77  143:aload_0         
	//*  78  144:invokevirtual   #313 <Method DescriptorProtos$EnumOptions getOptions()>
	//*  79  147:aload_1         
	//*  80  148:invokevirtual   #313 <Method DescriptorProtos$EnumOptions getOptions()>
	//*  81  151:invokevirtual   #314 <Method boolean DescriptorProtos$EnumOptions.equals(Object)>
	//*  82  154:ifeq            162
				flag1 = true;
	//   83  157:iconst_1        
	//   84  158:istore_3        
			else
	//*  85  159:goto            164
				flag1 = false;
	//   86  162:iconst_0        
	//   87  163:istore_3        
		if(flag1 && getReservedRangeList().equals(((Object) (((DescriptorProtos$EnumDescriptorProto) (obj)).getReservedRangeList()))))
	//*  88  164:iload_3         
	//*  89  165:ifeq            189
	//*  90  168:aload_0         
	//*  91  169:invokevirtual   #317 <Method List getReservedRangeList()>
	//*  92  172:aload_1         
	//*  93  173:invokevirtual   #317 <Method List getReservedRangeList()>
	//*  94  176:invokeinterface #307 <Method boolean List.equals(Object)>
	//*  95  181:ifeq            189
			flag = true;
	//   96  184:iconst_1        
	//   97  185:istore_2        
		else
	//*  98  186:goto            191
			flag = false;
	//   99  189:iconst_0        
	//  100  190:istore_2        
		if(flag && ((Object) (getReservedNameList())).equals(((Object) (((DescriptorProtos$EnumDescriptorProto) (obj)).getReservedNameList()))))
	//* 101  191:iload_2         
	//* 102  192:ifeq            214
	//* 103  195:aload_0         
	//* 104  196:invokevirtual   #321 <Method ProtocolStringList getReservedNameList()>
	//* 105  199:aload_1         
	//* 106  200:invokevirtual   #321 <Method ProtocolStringList getReservedNameList()>
	//* 107  203:invokevirtual   #324 <Method boolean Object.equals(Object)>
	//* 108  206:ifeq            214
			flag = true;
	//  109  209:iconst_1        
	//  110  210:istore_2        
		else
	//* 111  211:goto            216
			flag = false;
	//  112  214:iconst_0        
	//  113  215:istore_2        
		return flag && unknownFields.equals(((Object) (((DescriptorProtos$EnumDescriptorProto) (obj)).unknownFields)));
	//  114  216:iload_2         
	//  115  217:ifeq            236
	//  116  220:aload_0         
	//  117  221:getfield        #184 <Field UnknownFieldSet unknownFields>
	//  118  224:aload_1         
	//  119  225:getfield        #184 <Field UnknownFieldSet unknownFields>
	//  120  228:invokevirtual   #325 <Method boolean UnknownFieldSet.equals(Object)>
	//  121  231:ifeq            236
	//  122  234:iconst_1        
	//  123  235:ireturn         
	//  124  236:iconst_0        
	//  125  237:ireturn         
	}

	public DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #66  <Field DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #329 <Method DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #329 <Method DescriptorProtos$EnumDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #302 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #302 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #332 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #335 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #338 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			name_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #77  <Field Object name_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #302 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #302 <Class String>
	//    8   16:invokestatic    #343 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #77  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #332 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.EnumOptions getOptions()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field DescriptorProtos$EnumOptions options_>
	//*   2    4:ifnonnull       11
			return DescriptorProtos.EnumOptions.getDefaultInstance();
	//    3    7:invokestatic    #345 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return options_;
	//    5   11:aload_0         
	//    6   12:getfield        #142 <Field DescriptorProtos$EnumOptions options_>
	//    7   15:areturn         
	}

	public  getOptionsOrBuilder()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field DescriptorProtos$EnumOptions options_>
	//*   2    4:ifnonnull       11
			return (() (DescriptorProtos.EnumOptions.getDefaultInstance()));
	//    3    7:invokestatic    #345 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return (() (options_));
	//    5   11:aload_0         
	//    6   12:getfield        #142 <Field DescriptorProtos$EnumOptions options_>
	//    7   15:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #69  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public String getReservedName(int i)
	{
		return (String)reservedName_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field LazyStringList reservedName_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #354 <Method Object LazyStringList.get(int)>
	//    4   10:checkcast       #302 <Class String>
	//    5   13:areturn         
	}

	public ByteString getReservedNameBytes(int i)
	{
		return reservedName_.getByteString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field LazyStringList reservedName_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #359 <Method ByteString LazyStringList.getByteString(int)>
	//    4   10:areturn         
	}

	public int getReservedNameCount()
	{
		return reservedName_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field LazyStringList reservedName_>
	//    2    4:invokeinterface #363 <Method int LazyStringList.size()>
	//    3    9:ireturn         
	}

	public ProtocolStringList getReservedNameList()
	{
		return ((ProtocolStringList) (reservedName_));
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field LazyStringList reservedName_>
	//    2    4:areturn         
	}

	public volatile List getReservedNameList()
	{
		return ((List) (getReservedNameList()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method ProtocolStringList getReservedNameList()>
	//    2    4:areturn         
	}

	public EnumReservedRange getReservedRange(int i)
	{
		return (EnumReservedRange)reservedRange_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field List reservedRange_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #366 <Method Object List.get(int)>
	//    4   10:checkcast       #16  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRange>
	//    5   13:areturn         
	}

	public int getReservedRangeCount()
	{
		return reservedRange_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field List reservedRange_>
	//    2    4:invokeinterface #368 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getReservedRangeList()
	{
		return reservedRange_;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field List reservedRange_>
	//    2    4:areturn         
	}

	public EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int i)
	{
		return (EnumReservedRangeOrBuilder)reservedRange_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field List reservedRange_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #366 <Method Object List.get(int)>
	//    4   10:checkcast       #23  <Class DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder>
	//    5   13:areturn         
	}

	public List getReservedRangeOrBuilderList()
	{
		return reservedRange_;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field List reservedRange_>
	//    2    4:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #377 <Field int memoizedSize>
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
	//*  11   15:getfield        #124 <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			i = GeneratedMessageV3.computeStringSize(1, name_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #77  <Field Object name_>
	//   19   29:invokestatic    #381 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_1        
		for(int j = 0; j < value_.size(); j++)
	//*  23   35:iconst_0        
	//*  24   36:istore_2        
	//*  25   37:iload_2         
	//*  26   38:aload_0         
	//*  27   39:getfield        #85  <Field List value_>
	//*  28   42:invokeinterface #368 <Method int List.size()>
	//*  29   47:icmpge          77
			i += CodedOutputStream.computeMessageSize(2, (MessageLite)value_.get(j));
	//   30   50:iload_1         
	//   31   51:iconst_2        
	//   32   52:aload_0         
	//   33   53:getfield        #85  <Field List value_>
	//   34   56:iload_2         
	//   35   57:invokeinterface #366 <Method Object List.get(int)>
	//   36   62:checkcast       #383 <Class MessageLite>
	//   37   65:invokestatic    #389 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   38   68:iadd            
	//   39   69:istore_1        

	//   40   70:iload_2         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:istore_2        
	//*  44   74:goto            37
		int k = i;
	//   45   77:iload_1         
	//   46   78:istore_2        
		if((bitField0_ & 2) == 2)
	//*  47   79:aload_0         
	//*  48   80:getfield        #124 <Field int bitField0_>
	//*  49   83:iconst_2        
	//*  50   84:iand            
	//*  51   85:iconst_2        
	//*  52   86:icmpne          100
			k = i + CodedOutputStream.computeMessageSize(3, ((MessageLite) (getOptions())));
	//   53   89:iload_1         
	//   54   90:iconst_3        
	//   55   91:aload_0         
	//   56   92:invokevirtual   #313 <Method DescriptorProtos$EnumOptions getOptions()>
	//   57   95:invokestatic    #389 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   58   98:iadd            
	//   59   99:istore_2        
		for(i = 0; i < reservedRange_.size(); i++)
	//*  60  100:iconst_0        
	//*  61  101:istore_1        
	//*  62  102:iload_1         
	//*  63  103:aload_0         
	//*  64  104:getfield        #87  <Field List reservedRange_>
	//*  65  107:invokeinterface #368 <Method int List.size()>
	//*  66  112:icmpge          142
			k += CodedOutputStream.computeMessageSize(4, (MessageLite)reservedRange_.get(i));
	//   67  115:iload_2         
	//   68  116:iconst_4        
	//   69  117:aload_0         
	//   70  118:getfield        #87  <Field List reservedRange_>
	//   71  121:iload_1         
	//   72  122:invokeinterface #366 <Method Object List.get(int)>
	//   73  127:checkcast       #383 <Class MessageLite>
	//   74  130:invokestatic    #389 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   75  133:iadd            
	//   76  134:istore_2        

	//   77  135:iload_1         
	//   78  136:iconst_1        
	//   79  137:iadd            
	//   80  138:istore_1        
	//*  81  139:goto            102
		int l = 0;
	//   82  142:iconst_0        
	//   83  143:istore_3        
		for(i = 0; i < reservedName_.size(); i++)
	//*  84  144:iconst_0        
	//*  85  145:istore_1        
	//*  86  146:iload_1         
	//*  87  147:aload_0         
	//*  88  148:getfield        #94  <Field LazyStringList reservedName_>
	//*  89  151:invokeinterface #363 <Method int LazyStringList.size()>
	//*  90  156:icmpge          182
			l += computeStringSizeNoTag(reservedName_.getRaw(i));
	//   91  159:iload_3         
	//   92  160:aload_0         
	//   93  161:getfield        #94  <Field LazyStringList reservedName_>
	//   94  164:iload_1         
	//   95  165:invokeinterface #392 <Method Object LazyStringList.getRaw(int)>
	//   96  170:invokestatic    #396 <Method int computeStringSizeNoTag(Object)>
	//   97  173:iadd            
	//   98  174:istore_3        

	//   99  175:iload_1         
	//  100  176:iconst_1        
	//  101  177:iadd            
	//  102  178:istore_1        
	//* 103  179:goto            146
		i = k + l + getReservedNameList().size() * 1 + unknownFields.getSerializedSize();
	//  104  182:iload_2         
	//  105  183:iload_3         
	//  106  184:iadd            
	//  107  185:aload_0         
	//  108  186:invokevirtual   #321 <Method ProtocolStringList getReservedNameList()>
	//  109  189:invokeinterface #399 <Method int ProtocolStringList.size()>
	//  110  194:iconst_1        
	//  111  195:imul            
	//  112  196:iadd            
	//  113  197:aload_0         
	//  114  198:getfield        #184 <Field UnknownFieldSet unknownFields>
	//  115  201:invokevirtual   #401 <Method int UnknownFieldSet.getSerializedSize()>
	//  116  204:iadd            
	//  117  205:istore_1        
		memoizedSize = i;
	//  118  206:aload_0         
	//  119  207:iload_1         
	//  120  208:putfield        #377 <Field int memoizedSize>
		return i;
	//  121  211:iload_1         
	//  122  212:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public roto getValue(int i)
	{
		return (roto)value_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List value_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #366 <Method Object List.get(int)>
	//    4   10:checkcast       #129 <Class DescriptorProtos$EnumValueDescriptorProto>
	//    5   13:areturn         
	}

	public int getValueCount()
	{
		return value_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List value_>
	//    2    4:invokeinterface #368 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getValueList()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List value_>
	//    2    4:areturn         
	}

	public rotoOrBuilder getValueOrBuilder(int i)
	{
		return (rotoOrBuilder)value_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List value_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #366 <Method Object List.get(int)>
	//    4   10:checkcast       #410 <Class DescriptorProtos$EnumValueDescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getValueOrBuilderList()
	{
		return value_;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List value_>
	//    2    4:areturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int bitField0_>
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
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int bitField0_>
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
	//*   1    1:getfield        #416 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #416 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #418 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #420 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasName())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #296 <Method boolean hasName()>
	//*  15   29:ifeq            50
			i = (j * 37 + 1) * 53 + getName().hashCode();
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #300 <Method String getName()>
	//   25   45:invokevirtual   #421 <Method int String.hashCode()>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(getValueCount() > 0)
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #423 <Method int getValueCount()>
	//*  32   56:ifle            79
			j = (i * 37 + 2) * 53 + getValueList().hashCode();
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_2        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #306 <Method List getValueList()>
	//   42   72:invokeinterface #424 <Method int List.hashCode()>
	//   43   77:iadd            
	//   44   78:istore_2        
		i = j;
	//   45   79:iload_2         
	//   46   80:istore_1        
		if(hasOptions())
	//*  47   81:aload_0         
	//*  48   82:invokevirtual   #310 <Method boolean hasOptions()>
	//*  49   85:ifeq            106
			i = (j * 37 + 3) * 53 + getOptions().hashCode();
	//   50   88:iload_2         
	//   51   89:bipush          37
	//   52   91:imul            
	//   53   92:iconst_3        
	//   54   93:iadd            
	//   55   94:bipush          53
	//   56   96:imul            
	//   57   97:aload_0         
	//   58   98:invokevirtual   #313 <Method DescriptorProtos$EnumOptions getOptions()>
	//   59  101:invokevirtual   #425 <Method int DescriptorProtos$EnumOptions.hashCode()>
	//   60  104:iadd            
	//   61  105:istore_1        
		j = i;
	//   62  106:iload_1         
	//   63  107:istore_2        
		if(getReservedRangeCount() > 0)
	//*  64  108:aload_0         
	//*  65  109:invokevirtual   #427 <Method int getReservedRangeCount()>
	//*  66  112:ifle            135
			j = (i * 37 + 4) * 53 + getReservedRangeList().hashCode();
	//   67  115:iload_1         
	//   68  116:bipush          37
	//   69  118:imul            
	//   70  119:iconst_4        
	//   71  120:iadd            
	//   72  121:bipush          53
	//   73  123:imul            
	//   74  124:aload_0         
	//   75  125:invokevirtual   #317 <Method List getReservedRangeList()>
	//   76  128:invokeinterface #424 <Method int List.hashCode()>
	//   77  133:iadd            
	//   78  134:istore_2        
		i = j;
	//   79  135:iload_2         
	//   80  136:istore_1        
		if(getReservedNameCount() > 0)
	//*  81  137:aload_0         
	//*  82  138:invokevirtual   #429 <Method int getReservedNameCount()>
	//*  83  141:ifle            162
			i = (j * 37 + 5) * 53 + ((Object) (getReservedNameList())).hashCode();
	//   84  144:iload_2         
	//   85  145:bipush          37
	//   86  147:imul            
	//   87  148:iconst_5        
	//   88  149:iadd            
	//   89  150:bipush          53
	//   90  152:imul            
	//   91  153:aload_0         
	//   92  154:invokevirtual   #321 <Method ProtocolStringList getReservedNameList()>
	//   93  157:invokevirtual   #420 <Method int Object.hashCode()>
	//   94  160:iadd            
	//   95  161:istore_1        
		i = i * 29 + unknownFields.hashCode();
	//   96  162:iload_1         
	//   97  163:bipush          29
	//   98  165:imul            
	//   99  166:aload_0         
	//  100  167:getfield        #184 <Field UnknownFieldSet unknownFields>
	//  101  170:invokevirtual   #430 <Method int UnknownFieldSet.hashCode()>
	//  102  173:iadd            
	//  103  174:istore_1        
		memoizedHashCode = i;
	//  104  175:aload_0         
	//  105  176:iload_1         
	//  106  177:putfield        #416 <Field int memoizedHashCode>
		return i;
	//  107  180:iload_1         
	//  108  181:ireturn         
	}

	protected  internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$9600().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$EnumDescriptorProto, com/google/protobuf/DescriptorProtos$EnumDescriptorProto$Builder);
	//    0    0:invokestatic    #435 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$9600()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    2    5:ldc1            #13  <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    3    7:invokevirtual   #441 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field byte memoizedIsInitialized>
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
		for(int i = 0; i < getValueCount(); i++)
	//*  12   18:iconst_0        
	//*  13   19:istore_1        
	//*  14   20:iload_1         
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #423 <Method int getValueCount()>
	//*  17   25:icmpge          53
			if(!getValue(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #444 <Method DescriptorProtos$EnumValueDescriptorProto getValue(int)>
	//*  21   33:invokevirtual   #446 <Method boolean DescriptorProtos$EnumValueDescriptorProto.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #73  <Field byte memoizedIsInitialized>
				return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
			}

	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_1        
	//*  32   50:goto            20
		if(hasOptions() && !getOptions().isInitialized())
	//*  33   53:aload_0         
	//*  34   54:invokevirtual   #310 <Method boolean hasOptions()>
	//*  35   57:ifeq            77
	//*  36   60:aload_0         
	//*  37   61:invokevirtual   #313 <Method DescriptorProtos$EnumOptions getOptions()>
	//*  38   64:invokevirtual   #447 <Method boolean DescriptorProtos$EnumOptions.isInitialized()>
	//*  39   67:ifne            77
		{
			memoizedIsInitialized = 0;
	//   40   70:aload_0         
	//   41   71:iconst_0        
	//   42   72:putfield        #73  <Field byte memoizedIsInitialized>
			return false;
	//   43   75:iconst_0        
	//   44   76:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   45   77:aload_0         
	//   46   78:iconst_1        
	//   47   79:putfield        #73  <Field byte memoizedIsInitialized>
			return true;
	//   48   82:iconst_1        
	//   49   83:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #450 <Method DescriptorProtos$EnumDescriptorProto$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #13  <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #454 <Method void DescriptorProtos$EnumDescriptorProto$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #457 <Method DescriptorProtos$EnumDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #460 <Method DescriptorProtos$EnumDescriptorProto$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #457 <Method DescriptorProtos$EnumDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #66  <Field DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #13  <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #464 <Method void DescriptorProtos$EnumDescriptorProto$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #13  <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #464 <Method void DescriptorProtos$EnumDescriptorProto$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #236 <Method DescriptorProtos$EnumDescriptorProto$Builder DescriptorProtos$EnumDescriptorProto$Builder.mergeFrom(DescriptorProtos$EnumDescriptorProto)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method DescriptorProtos$EnumDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method DescriptorProtos$EnumDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			GeneratedMessageV3.writeString(codedoutputstream, 1, name_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #77  <Field Object name_>
	//   10   16:invokestatic    #470 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		for(int i = 0; i < value_.size(); i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:aload_0         
	//*  15   23:getfield        #85  <Field List value_>
	//*  16   26:invokeinterface #368 <Method int List.size()>
	//*  17   31:icmpge          59
			codedoutputstream.writeMessage(2, (MessageLite)value_.get(i));
	//   18   34:aload_1         
	//   19   35:iconst_2        
	//   20   36:aload_0         
	//   21   37:getfield        #85  <Field List value_>
	//   22   40:iload_2         
	//   23   41:invokeinterface #366 <Method Object List.get(int)>
	//   24   46:checkcast       #383 <Class MessageLite>
	//   25   49:invokevirtual   #474 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   26   52:iload_2         
	//   27   53:iconst_1        
	//   28   54:iadd            
	//   29   55:istore_2        
	//*  30   56:goto            21
		if((bitField0_ & 2) == 2)
	//*  31   59:aload_0         
	//*  32   60:getfield        #124 <Field int bitField0_>
	//*  33   63:iconst_2        
	//*  34   64:iand            
	//*  35   65:iconst_2        
	//*  36   66:icmpne          78
			codedoutputstream.writeMessage(3, ((MessageLite) (getOptions())));
	//   37   69:aload_1         
	//   38   70:iconst_3        
	//   39   71:aload_0         
	//   40   72:invokevirtual   #313 <Method DescriptorProtos$EnumOptions getOptions()>
	//   41   75:invokevirtual   #474 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		for(int j = 0; j < reservedRange_.size(); j++)
	//*  42   78:iconst_0        
	//*  43   79:istore_2        
	//*  44   80:iload_2         
	//*  45   81:aload_0         
	//*  46   82:getfield        #87  <Field List reservedRange_>
	//*  47   85:invokeinterface #368 <Method int List.size()>
	//*  48   90:icmpge          118
			codedoutputstream.writeMessage(4, (MessageLite)reservedRange_.get(j));
	//   49   93:aload_1         
	//   50   94:iconst_4        
	//   51   95:aload_0         
	//   52   96:getfield        #87  <Field List reservedRange_>
	//   53   99:iload_2         
	//   54  100:invokeinterface #366 <Method Object List.get(int)>
	//   55  105:checkcast       #383 <Class MessageLite>
	//   56  108:invokevirtual   #474 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   57  111:iload_2         
	//   58  112:iconst_1        
	//   59  113:iadd            
	//   60  114:istore_2        
	//*  61  115:goto            80
		for(int k = 0; k < reservedName_.size(); k++)
	//*  62  118:iconst_0        
	//*  63  119:istore_2        
	//*  64  120:iload_2         
	//*  65  121:aload_0         
	//*  66  122:getfield        #94  <Field LazyStringList reservedName_>
	//*  67  125:invokeinterface #363 <Method int LazyStringList.size()>
	//*  68  130:icmpge          155
			GeneratedMessageV3.writeString(codedoutputstream, 5, reservedName_.getRaw(k));
	//   69  133:aload_1         
	//   70  134:iconst_5        
	//   71  135:aload_0         
	//   72  136:getfield        #94  <Field LazyStringList reservedName_>
	//   73  139:iload_2         
	//   74  140:invokeinterface #392 <Method Object LazyStringList.getRaw(int)>
	//   75  145:invokestatic    #470 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>

	//   76  148:iload_2         
	//   77  149:iconst_1        
	//   78  150:iadd            
	//   79  151:istore_2        
	//*  80  152:goto            120
		unknownFields.writeTo(codedoutputstream);
	//   81  155:aload_0         
	//   82  156:getfield        #184 <Field UnknownFieldSet unknownFields>
	//   83  159:aload_1         
	//   84  160:invokevirtual   #476 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   85  163:return          
	}

	private static final DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE = new DescriptorProtos$EnumDescriptorProto();
	public static final int NAME_FIELD_NUMBER = 1;
	public static final int OPTIONS_FIELD_NUMBER = 3;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.EnumDescriptorProto parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.EnumDescriptorProto(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$EnumDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$EnumDescriptorProto(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$EnumDescriptorProto parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int RESERVED_NAME_FIELD_NUMBER = 5;
	public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
	public static final int VALUE_FIELD_NUMBER = 2;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private byte memoizedIsInitialized;
	private volatile Object name_;
	private DescriptorProtos.EnumOptions options_;
	private LazyStringList reservedName_;
	private List reservedRange_;
	private List value_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$EnumDescriptorProto>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void DescriptorProtos$EnumDescriptorProto()>
	//    3    7:putstatic       #66  <Field DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE>
	//    4   10:new             #11  <Class DescriptorProtos$EnumDescriptorProto$1>
	//    5   13:dup             
	//    6   14:invokespecial   #67  <Method void DescriptorProtos$EnumDescriptorProto$1()>
	//    7   17:putstatic       #69  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$10900(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto)
	{
		return descriptorprotos$enumdescriptorproto.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Object name_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$10902(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto, Object obj)
	{
		descriptorprotos$enumdescriptorproto.name_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field Object name_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$11000(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto)
	{
		return descriptorprotos$enumdescriptorproto.value_;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List value_>
	//    2    4:areturn         
	}

*/


/*
	static List access$11002(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto, List list)
	{
		descriptorprotos$enumdescriptorproto.value_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field List value_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static DescriptorProtos.EnumOptions access$11102(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto, DescriptorProtos.EnumOptions enumoptions)
	{
		descriptorprotos$enumdescriptorproto.options_ = enumoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field DescriptorProtos$EnumOptions options_>
		return enumoptions;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$11200(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto)
	{
		return descriptorprotos$enumdescriptorproto.reservedRange_;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field List reservedRange_>
	//    2    4:areturn         
	}

*/


/*
	static List access$11202(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto, List list)
	{
		descriptorprotos$enumdescriptorproto.reservedRange_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field List reservedRange_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static LazyStringList access$11300(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto)
	{
		return descriptorprotos$enumdescriptorproto.reservedName_;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field LazyStringList reservedName_>
	//    2    4:areturn         
	}

*/


/*
	static LazyStringList access$11302(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto, LazyStringList lazystringlist)
	{
		descriptorprotos$enumdescriptorproto.reservedName_ = lazystringlist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field LazyStringList reservedName_>
		return lazystringlist;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$11402(DescriptorProtos$EnumDescriptorProto descriptorprotos$enumdescriptorproto, int i)
	{
		descriptorprotos$enumdescriptorproto.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$EnumDescriptorProto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #73  <Field byte memoizedIsInitialized>
		name_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #75  <String "">
	//    7   12:putfield        #77  <Field Object name_>
		value_ = Collections.emptyList();
	//    8   15:aload_0         
	//    9   16:invokestatic    #83  <Method List Collections.emptyList()>
	//   10   19:putfield        #85  <Field List value_>
		reservedRange_ = Collections.emptyList();
	//   11   22:aload_0         
	//   12   23:invokestatic    #83  <Method List Collections.emptyList()>
	//   13   26:putfield        #87  <Field List reservedRange_>
		reservedName_ = LazyStringArrayList.EMPTY;
	//   14   29:aload_0         
	//   15   30:getstatic       #92  <Field LazyStringList LazyStringArrayList.EMPTY>
	//   16   33:putfield        #94  <Field LazyStringList reservedName_>
	//   17   36:return          
	}

	private DescriptorProtos$EnumDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void DescriptorProtos$EnumDescriptorProto()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #101 <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #102 <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #108 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          11
		flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L20:
		int j;
		int l;
		int i1;
		if(flag)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            549
		l = i;
	//   16   31:iload_3         
	//   17   32:istore          6
		i1 = i;
	//   18   34:iload_3         
	//   19   35:istore          7
		j = i;
	//   20   37:iload_3         
	//   21   38:istore          4
		int j1 = codedinputstream.readTag();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #114 <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		j1;
	//   25   46:iload           9
		JVM INSTR lookupswitch 6: default 731
	//	               0: 734
	//	               10: 142
	//	               18: 197
	//	               26: 265
	//	               34: 396
	//	               42: 467;
	//   26   48:lookupswitch    6: default 731
	//	               0: 734
	//	               10: 142
	//	               18: 197
	//	               26: 265
	//	               34: 396
	//	               42: 467
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		int k;
		k = i;
	//   27  108:iload_3         
	//   28  109:istore          5
		l = i;
	//   29  111:iload_3         
	//   30  112:istore          6
		i1 = i;
	//   31  114:iload_3         
	//   32  115:istore          7
		j = i;
	//   33  117:iload_3         
	//   34  118:istore          4
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, j1))
	//*  35  120:aload_0         
	//*  36  121:aload_1         
	//*  37  122:aload           11
	//*  38  124:aload_2         
	//*  39  125:iload           9
	//*  40  127:invokevirtual   #118 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  130:ifne            543
		{
			flag = true;
	//   42  133:iconst_1        
	//   43  134:istore          8
			k = i;
	//   44  136:iload_3         
	//   45  137:istore          5
		}
		  goto _L8
	//*  46  139:goto            543
_L3:
		l = i;
	//   47  142:iload_3         
	//   48  143:istore          6
		i1 = i;
	//   49  145:iload_3         
	//   50  146:istore          7
		j = i;
	//   51  148:iload_3         
	//   52  149:istore          4
		Object obj = ((Object) (codedinputstream.readBytes()));
	//   53  151:aload_1         
	//   54  152:invokevirtual   #122 <Method ByteString CodedInputStream.readBytes()>
	//   55  155:astore          10
		l = i;
	//   56  157:iload_3         
	//   57  158:istore          6
		i1 = i;
	//   58  160:iload_3         
	//   59  161:istore          7
		j = i;
	//   60  163:iload_3         
	//   61  164:istore          4
		bitField0_ = bitField0_ | 1;
	//   62  166:aload_0         
	//   63  167:aload_0         
	//   64  168:getfield        #124 <Field int bitField0_>
	//   65  171:iconst_1        
	//   66  172:ior             
	//   67  173:putfield        #124 <Field int bitField0_>
		l = i;
	//   68  176:iload_3         
	//   69  177:istore          6
		i1 = i;
	//   70  179:iload_3         
	//   71  180:istore          7
		j = i;
	//   72  182:iload_3         
	//   73  183:istore          4
		name_ = obj;
	//   74  185:aload_0         
	//   75  186:aload           10
	//   76  188:putfield        #77  <Field Object name_>
		k = i;
	//   77  191:iload_3         
	//   78  192:istore          5
		  goto _L8
	//*  79  194:goto            543
_L4:
		k = i;
	//   80  197:iload_3         
	//   81  198:istore          5
		if((i & 2) == 2) goto _L10; else goto _L9
	//   82  200:iload_3         
	//   83  201:iconst_2        
	//   84  202:iand            
	//   85  203:iconst_2        
	//   86  204:icmpeq          232
_L9:
		l = i;
	//   87  207:iload_3         
	//   88  208:istore          6
		i1 = i;
	//   89  210:iload_3         
	//   90  211:istore          7
		j = i;
	//   91  213:iload_3         
	//   92  214:istore          4
		value_ = ((List) (new ArrayList()));
	//   93  216:aload_0         
	//   94  217:new             #126 <Class ArrayList>
	//   95  220:dup             
	//   96  221:invokespecial   #127 <Method void ArrayList()>
	//   97  224:putfield        #85  <Field List value_>
		k = i | 2;
	//   98  227:iload_3         
	//   99  228:iconst_2        
	//  100  229:ior             
	//  101  230:istore          5
_L10:
		l = k;
	//  102  232:iload           5
	//  103  234:istore          6
		i1 = k;
	//  104  236:iload           5
	//  105  238:istore          7
		j = k;
	//  106  240:iload           5
	//  107  242:istore          4
		value_.add(((Object) (codedinputstream.readMessage(roto.PARSER, extensionregistrylite))));
	//  108  244:aload_0         
	//  109  245:getfield        #85  <Field List value_>
	//  110  248:aload_1         
	//  111  249:getstatic       #130 <Field Parser DescriptorProtos$EnumValueDescriptorProto.PARSER>
	//  112  252:aload_2         
	//  113  253:invokevirtual   #134 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  114  256:invokeinterface #140 <Method boolean List.add(Object)>
	//  115  261:pop             
		  goto _L8
	//* 116  262:goto            543
_L5:
		obj = null;
	//  117  265:aconst_null     
	//  118  266:astore          10
		l = i;
	//  119  268:iload_3         
	//  120  269:istore          6
		i1 = i;
	//  121  271:iload_3         
	//  122  272:istore          7
		j = i;
	//  123  274:iload_3         
	//  124  275:istore          4
		if((bitField0_ & 2) != 2) goto _L12; else goto _L11
	//  125  277:aload_0         
	//  126  278:getfield        #124 <Field int bitField0_>
	//  127  281:iconst_2        
	//  128  282:iand            
	//  129  283:iconst_2        
	//  130  284:icmpne          305
_L11:
		l = i;
	//  131  287:iload_3         
	//  132  288:istore          6
		i1 = i;
	//  133  290:iload_3         
	//  134  291:istore          7
		j = i;
	//  135  293:iload_3         
	//  136  294:istore          4
		obj = ((Object) (options_.toBuilder()));
	//  137  296:aload_0         
	//  138  297:getfield        #142 <Field DescriptorProtos$EnumOptions options_>
	//  139  300:invokevirtual   #148 <Method DescriptorProtos$EnumOptions$Builder DescriptorProtos$EnumOptions.toBuilder()>
	//  140  303:astore          10
_L12:
		l = i;
	//  141  305:iload_3         
	//  142  306:istore          6
		i1 = i;
	//  143  308:iload_3         
	//  144  309:istore          7
		j = i;
	//  145  311:iload_3         
	//  146  312:istore          4
		options_ = (DescriptorProtos.EnumOptions)codedinputstream.readMessage(DescriptorProtos.EnumOptions.PARSER, extensionregistrylite);
	//  147  314:aload_0         
	//  148  315:aload_1         
	//  149  316:getstatic       #149 <Field Parser DescriptorProtos$EnumOptions.PARSER>
	//  150  319:aload_2         
	//  151  320:invokevirtual   #134 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  152  323:checkcast       #144 <Class DescriptorProtos$EnumOptions>
	//  153  326:putfield        #142 <Field DescriptorProtos$EnumOptions options_>
		if(obj == null) goto _L14; else goto _L13
	//  154  329:aload           10
	//  155  331:ifnull          371
_L13:
		l = i;
	//  156  334:iload_3         
	//  157  335:istore          6
		i1 = i;
	//  158  337:iload_3         
	//  159  338:istore          7
		j = i;
	//  160  340:iload_3         
	//  161  341:istore          4
		((DescriptorProtos$EnumOptions$Builder) (obj)).mergeFrom(options_);
	//  162  343:aload           10
	//  163  345:aload_0         
	//  164  346:getfield        #142 <Field DescriptorProtos$EnumOptions options_>
	//  165  349:invokevirtual   #155 <Method DescriptorProtos$EnumOptions$Builder DescriptorProtos$EnumOptions$Builder.mergeFrom(DescriptorProtos$EnumOptions)>
	//  166  352:pop             
		l = i;
	//  167  353:iload_3         
	//  168  354:istore          6
		i1 = i;
	//  169  356:iload_3         
	//  170  357:istore          7
		j = i;
	//  171  359:iload_3         
	//  172  360:istore          4
		options_ = ((DescriptorProtos$EnumOptions$Builder) (obj)).buildPartial();
	//  173  362:aload_0         
	//  174  363:aload           10
	//  175  365:invokevirtual   #159 <Method DescriptorProtos$EnumOptions DescriptorProtos$EnumOptions$Builder.buildPartial()>
	//  176  368:putfield        #142 <Field DescriptorProtos$EnumOptions options_>
_L14:
		l = i;
	//  177  371:iload_3         
	//  178  372:istore          6
		i1 = i;
	//  179  374:iload_3         
	//  180  375:istore          7
		j = i;
	//  181  377:iload_3         
	//  182  378:istore          4
		bitField0_ = bitField0_ | 2;
	//  183  380:aload_0         
	//  184  381:aload_0         
	//  185  382:getfield        #124 <Field int bitField0_>
	//  186  385:iconst_2        
	//  187  386:ior             
	//  188  387:putfield        #124 <Field int bitField0_>
		k = i;
	//  189  390:iload_3         
	//  190  391:istore          5
		  goto _L8
	//* 191  393:goto            543
_L6:
		k = i;
	//  192  396:iload_3         
	//  193  397:istore          5
		if((i & 8) == 8) goto _L16; else goto _L15
	//  194  399:iload_3         
	//  195  400:bipush          8
	//  196  402:iand            
	//  197  403:bipush          8
	//  198  405:icmpeq          434
_L15:
		l = i;
	//  199  408:iload_3         
	//  200  409:istore          6
		i1 = i;
	//  201  411:iload_3         
	//  202  412:istore          7
		j = i;
	//  203  414:iload_3         
	//  204  415:istore          4
		reservedRange_ = ((List) (new ArrayList()));
	//  205  417:aload_0         
	//  206  418:new             #126 <Class ArrayList>
	//  207  421:dup             
	//  208  422:invokespecial   #127 <Method void ArrayList()>
	//  209  425:putfield        #87  <Field List reservedRange_>
		k = i | 8;
	//  210  428:iload_3         
	//  211  429:bipush          8
	//  212  431:ior             
	//  213  432:istore          5
_L16:
		l = k;
	//  214  434:iload           5
	//  215  436:istore          6
		i1 = k;
	//  216  438:iload           5
	//  217  440:istore          7
		j = k;
	//  218  442:iload           5
	//  219  444:istore          4
		reservedRange_.add(((Object) (codedinputstream.readMessage(EnumReservedRange.PARSER, extensionregistrylite))));
	//  220  446:aload_0         
	//  221  447:getfield        #87  <Field List reservedRange_>
	//  222  450:aload_1         
	//  223  451:getstatic       #160 <Field Parser DescriptorProtos$EnumDescriptorProto$EnumReservedRange.PARSER>
	//  224  454:aload_2         
	//  225  455:invokevirtual   #134 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  226  458:invokeinterface #140 <Method boolean List.add(Object)>
	//  227  463:pop             
		  goto _L8
	//* 228  464:goto            543
_L7:
		l = i;
	//  229  467:iload_3         
	//  230  468:istore          6
		i1 = i;
	//  231  470:iload_3         
	//  232  471:istore          7
		j = i;
	//  233  473:iload_3         
	//  234  474:istore          4
		obj = ((Object) (codedinputstream.readBytes()));
	//  235  476:aload_1         
	//  236  477:invokevirtual   #122 <Method ByteString CodedInputStream.readBytes()>
	//  237  480:astore          10
		k = i;
	//  238  482:iload_3         
	//  239  483:istore          5
		if((i & 0x10) == 16) goto _L18; else goto _L17
	//  240  485:iload_3         
	//  241  486:bipush          16
	//  242  488:iand            
	//  243  489:bipush          16
	//  244  491:icmpeq          520
_L17:
		l = i;
	//  245  494:iload_3         
	//  246  495:istore          6
		i1 = i;
	//  247  497:iload_3         
	//  248  498:istore          7
		j = i;
	//  249  500:iload_3         
	//  250  501:istore          4
		reservedName_ = ((LazyStringList) (new LazyStringArrayList()));
	//  251  503:aload_0         
	//  252  504:new             #89  <Class LazyStringArrayList>
	//  253  507:dup             
	//  254  508:invokespecial   #161 <Method void LazyStringArrayList()>
	//  255  511:putfield        #94  <Field LazyStringList reservedName_>
		k = i | 0x10;
	//  256  514:iload_3         
	//  257  515:bipush          16
	//  258  517:ior             
	//  259  518:istore          5
_L18:
		l = k;
	//  260  520:iload           5
	//  261  522:istore          6
		i1 = k;
	//  262  524:iload           5
	//  263  526:istore          7
		j = k;
	//  264  528:iload           5
	//  265  530:istore          4
		reservedName_.add(((ByteString) (obj)));
	//  266  532:aload_0         
	//  267  533:getfield        #94  <Field LazyStringList reservedName_>
	//  268  536:aload           10
	//  269  538:invokeinterface #166 <Method void LazyStringList.add(ByteString)>
_L8:
		i = k;
	//  270  543:iload           5
	//  271  545:istore_3        
		if(true) goto _L20; else goto _L19
	//  272  546:goto            26
_L19:
		if((i & 2) == 2)
	//* 273  549:iload_3         
	//* 274  550:iconst_2        
	//* 275  551:iand            
	//* 276  552:iconst_2        
	//* 277  553:icmpne          567
			value_ = Collections.unmodifiableList(value_);
	//  278  556:aload_0         
	//  279  557:aload_0         
	//  280  558:getfield        #85  <Field List value_>
	//  281  561:invokestatic    #170 <Method List Collections.unmodifiableList(List)>
	//  282  564:putfield        #85  <Field List value_>
		if((i & 8) == 8)
	//* 283  567:iload_3         
	//* 284  568:bipush          8
	//* 285  570:iand            
	//* 286  571:bipush          8
	//* 287  573:icmpne          587
			reservedRange_ = Collections.unmodifiableList(reservedRange_);
	//  288  576:aload_0         
	//  289  577:aload_0         
	//  290  578:getfield        #87  <Field List reservedRange_>
	//  291  581:invokestatic    #170 <Method List Collections.unmodifiableList(List)>
	//  292  584:putfield        #87  <Field List reservedRange_>
		if((i & 0x10) == 16)
	//* 293  587:iload_3         
	//* 294  588:bipush          16
	//* 295  590:iand            
	//* 296  591:bipush          16
	//* 297  593:icmpne          609
			reservedName_ = reservedName_.getUnmodifiableView();
	//  298  596:aload_0         
	//  299  597:aload_0         
	//  300  598:getfield        #94  <Field LazyStringList reservedName_>
	//  301  601:invokeinterface #174 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//  302  606:putfield        #94  <Field LazyStringList reservedName_>
		unknownFields = builder.build();
	//  303  609:aload_0         
	//  304  610:aload           11
	//  305  612:invokevirtual   #180 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  306  615:putfield        #184 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  307  618:aload_0         
	//  308  619:invokevirtual   #187 <Method void makeExtensionsImmutable()>
		return;
	//  309  622:return          
		codedinputstream;
	//  310  623:astore_1        
		j = l;
	//  311  624:iload           6
	//  312  626:istore          4
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  313  628:aload_1         
	//  314  629:aload_0         
	//  315  630:invokevirtual   #191 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  316  633:athrow          
		codedinputstream;
	//  317  634:astore_1        
		j = i1;
	//  318  635:iload           7
	//  319  637:istore          4
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  320  639:new             #97  <Class InvalidProtocolBufferException>
	//  321  642:dup             
	//  322  643:aload_1         
	//  323  644:invokespecial   #194 <Method void InvalidProtocolBufferException(IOException)>
	//  324  647:aload_0         
	//  325  648:invokevirtual   #191 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  326  651:athrow          
		codedinputstream;
	//  327  652:astore_1        
		if((j & 2) == 2)
	//* 328  653:iload           4
	//* 329  655:iconst_2        
	//* 330  656:iand            
	//* 331  657:iconst_2        
	//* 332  658:icmpne          672
			value_ = Collections.unmodifiableList(value_);
	//  333  661:aload_0         
	//  334  662:aload_0         
	//  335  663:getfield        #85  <Field List value_>
	//  336  666:invokestatic    #170 <Method List Collections.unmodifiableList(List)>
	//  337  669:putfield        #85  <Field List value_>
		if((j & 8) == 8)
	//* 338  672:iload           4
	//* 339  674:bipush          8
	//* 340  676:iand            
	//* 341  677:bipush          8
	//* 342  679:icmpne          693
			reservedRange_ = Collections.unmodifiableList(reservedRange_);
	//  343  682:aload_0         
	//  344  683:aload_0         
	//  345  684:getfield        #87  <Field List reservedRange_>
	//  346  687:invokestatic    #170 <Method List Collections.unmodifiableList(List)>
	//  347  690:putfield        #87  <Field List reservedRange_>
		if((j & 0x10) == 16)
	//* 348  693:iload           4
	//* 349  695:bipush          16
	//* 350  697:iand            
	//* 351  698:bipush          16
	//* 352  700:icmpne          716
			reservedName_ = reservedName_.getUnmodifiableView();
	//  353  703:aload_0         
	//  354  704:aload_0         
	//  355  705:getfield        #94  <Field LazyStringList reservedName_>
	//  356  708:invokeinterface #174 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//  357  713:putfield        #94  <Field LazyStringList reservedName_>
		unknownFields = builder.build();
	//  358  716:aload_0         
	//  359  717:aload           11
	//  360  719:invokevirtual   #180 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  361  722:putfield        #184 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  362  725:aload_0         
	//  363  726:invokevirtual   #187 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  364  729:aload_1         
	//  365  730:athrow          
	//* 366  731:goto            108
_L2:
		flag = true;
	//  367  734:iconst_1        
	//  368  735:istore          8
		k = i;
	//  369  737:iload_3         
	//  370  738:istore          5
		  goto _L8
	//* 371  740:goto            543
	}

	DescriptorProtos$EnumDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #198 <Method void DescriptorProtos$EnumDescriptorProto(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$EnumDescriptorProto(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #73  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$EnumDescriptorProto(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #205 <Method void DescriptorProtos$EnumDescriptorProto(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
