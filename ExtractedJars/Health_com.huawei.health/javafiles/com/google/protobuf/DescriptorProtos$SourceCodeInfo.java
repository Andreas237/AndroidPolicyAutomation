// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DescriptorProtos, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, Parser, MessageLite, CodedOutputStream, 
//			ExtensionRegistryLite, ByteString, Message, RepeatedFieldBuilderV3, 
//			LazyStringArrayList, LazyStringList, ProtocolStringList, AbstractParser, 
//			MessageOrBuilder

public static final class DescriptorProtos$SourceCodeInfo extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.SourceCodeInfoOrBuilder
	{

		private void ensureLocationIsMutable()
		{
			if((bitField0_ & 1) != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field int bitField0_>
		//*   2    4:iconst_1        
		//*   3    5:iand            
		//*   4    6:iconst_1        
		//*   5    7:icmpeq          35
			{
				location_ = ((List) (new ArrayList(((java.util.Collection) (location_)))));
		//    6   10:aload_0         
		//    7   11:new             #49  <Class ArrayList>
		//    8   14:dup             
		//    9   15:aload_0         
		//   10   16:getfield        #33  <Field List location_>
		//   11   19:invokespecial   #52  <Method void ArrayList(java.util.Collection)>
		//   12   22:putfield        #33  <Field List location_>
				bitField0_ = bitField0_ | 1;
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:getfield        #47  <Field int bitField0_>
		//   16   30:iconst_1        
		//   17   31:ior             
		//   18   32:putfield        #47  <Field int bitField0_>
			}
		//   19   35:return          
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$26900();
		//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$26900()>
		//    1    3:areturn         
		}

		private RepeatedFieldBuilderV3 getLocationFieldBuilder()
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       55
			{
				List list = location_;
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field List location_>
		//    5   11:astore_2        
				boolean flag;
				if((bitField0_ & 1) == 1)
		//*   6   12:aload_0         
		//*   7   13:getfield        #47  <Field int bitField0_>
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
				locationBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//   17   29:aload_0         
		//   18   30:new             #63  <Class RepeatedFieldBuilderV3>
		//   19   33:dup             
		//   20   34:aload_2         
		//   21   35:iload_1         
		//   22   36:aload_0         
		//   23   37:invokevirtual   #67  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   24   40:aload_0         
		//   25   41:invokevirtual   #71  <Method boolean isClean()>
		//   26   44:invokespecial   #74  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
		//   27   47:putfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
				location_ = null;
		//   28   50:aload_0         
		//   29   51:aconst_null     
		//   30   52:putfield        #33  <Field List location_>
			}
			return locationBuilder_;
		//   31   55:aload_0         
		//   32   56:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   33   59:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #82  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            11
				getLocationFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #84  <Method RepeatedFieldBuilderV3 getLocationFieldBuilder()>
		//    4   10:pop             
		//    5   11:return          
		}

		public Builder addAllLocation(Iterable iterable)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureLocationIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #88  <Method void ensureLocationIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, location_);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #33  <Field List location_>
		//    8   16:invokestatic    #94  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
				onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #97  <Method void onChanged()>
				return this;
		//   11   23:aload_0         
		//   12   24:areturn         
			} else
			{
				locationBuilder_.addAllMessages(iterable);
		//   13   25:aload_0         
		//   14   26:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #101 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   17   33:pop             
				return this;
		//   18   34:aload_0         
		//   19   35:areturn         
			}
		}

		public Builder addLocation(int i, Location.Builder builder)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureLocationIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #88  <Method void ensureLocationIsMutable()>
				location_.add(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #33  <Field List location_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #110 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location$Builder.build()>
		//   10   20:invokeinterface #116 <Method void List.add(int, Object)>
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #97  <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				locationBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   17   35:iload_1         
		//   18   36:aload_2         
		//   19   37:invokevirtual   #110 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location$Builder.build()>
		//   20   40:invokevirtual   #120 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   21   43:pop             
				return this;
		//   22   44:aload_0         
		//   23   45:areturn         
			}
		}

		public Builder addLocation(int i, Location location)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(location == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #123 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #124 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureLocationIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #88  <Method void ensureLocationIsMutable()>
					location_.add(i, ((Object) (location)));
		//   11   23:aload_0         
		//   12   24:getfield        #33  <Field List location_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #116 <Method void List.add(int, Object)>
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #97  <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				locationBuilder_.addMessage(i, ((AbstractMessage) (location)));
		//   20   40:aload_0         
		//   21   41:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   22   44:iload_1         
		//   23   45:aload_2         
		//   24   46:invokevirtual   #120 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   25   49:pop             
				return this;
		//   26   50:aload_0         
		//   27   51:areturn         
			}
		}

		public Builder addLocation(Location.Builder builder)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureLocationIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #88  <Method void ensureLocationIsMutable()>
				location_.add(((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #33  <Field List location_>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #110 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location$Builder.build()>
		//    9   19:invokeinterface #128 <Method boolean List.add(Object)>
		//   10   24:pop             
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #97  <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				locationBuilder_.addMessage(((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #110 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location$Builder.build()>
		//   19   39:invokevirtual   #131 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   20   42:pop             
				return this;
		//   21   43:aload_0         
		//   22   44:areturn         
			}
		}

		public Builder addLocation(Location location)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(location == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #123 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #124 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureLocationIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #88  <Method void ensureLocationIsMutable()>
					location_.add(((Object) (location)));
		//   11   23:aload_0         
		//   12   24:getfield        #33  <Field List location_>
		//   13   27:aload_1         
		//   14   28:invokeinterface #128 <Method boolean List.add(Object)>
		//   15   33:pop             
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #97  <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				locationBuilder_.addMessage(((AbstractMessage) (location)));
		//   20   40:aload_0         
		//   21   41:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   22   44:aload_1         
		//   23   45:invokevirtual   #131 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   24   48:pop             
				return this;
		//   25   49:aload_0         
		//   26   50:areturn         
			}
		}

		public Location.Builder addLocationBuilder()
		{
			return (Location.Builder)getLocationFieldBuilder().addBuilder(((AbstractMessage) (Location.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getLocationFieldBuilder()>
		//    2    4:invokestatic    #139 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location.getDefaultInstance()>
		//    3    7:invokevirtual   #143 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #106 <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    5   13:areturn         
		}

		public Location.Builder addLocationBuilder(int i)
		{
			return (Location.Builder)getLocationFieldBuilder().addBuilder(i, ((AbstractMessage) (Location.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getLocationFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #139 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location.getDefaultInstance()>
		//    4    8:invokevirtual   #147 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #106 <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    6   14:areturn         
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #152 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #154 <Method DescriptorProtos$SourceCodeInfo$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #154 <Method DescriptorProtos$SourceCodeInfo$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public DescriptorProtos.SourceCodeInfo build()
		{
			DescriptorProtos.SourceCodeInfo sourcecodeinfo = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #159 <Method DescriptorProtos$SourceCodeInfo buildPartial()>
		//    2    4:astore_1        
			if(!sourcecodeinfo.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #162 <Method boolean DescriptorProtos$SourceCodeInfo.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (sourcecodeinfo)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #166 <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return sourcecodeinfo;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #169 <Method DescriptorProtos$SourceCodeInfo build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #169 <Method DescriptorProtos$SourceCodeInfo build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.SourceCodeInfo buildPartial()
		{
			DescriptorProtos.SourceCodeInfo sourcecodeinfo = new DescriptorProtos.SourceCodeInfo(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #9   <Class DescriptorProtos$SourceCodeInfo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #173 <Method void DescriptorProtos$SourceCodeInfo(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore_2        
			int i = bitField0_;
		//    6   10:aload_0         
		//    7   11:getfield        #47  <Field int bitField0_>
		//    8   14:istore_1        
			if(locationBuilder_ == null)
		//*   9   15:aload_0         
		//*  10   16:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*  11   19:ifnonnull       66
			{
				if((bitField0_ & 1) == 1)
		//*  12   22:aload_0         
		//*  13   23:getfield        #47  <Field int bitField0_>
		//*  14   26:iconst_1        
		//*  15   27:iand            
		//*  16   28:iconst_1        
		//*  17   29:icmpne          54
				{
					location_ = Collections.unmodifiableList(location_);
		//   18   32:aload_0         
		//   19   33:aload_0         
		//   20   34:getfield        #33  <Field List location_>
		//   21   37:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
		//   22   40:putfield        #33  <Field List location_>
					bitField0_ = bitField0_ & -2;
		//   23   43:aload_0         
		//   24   44:aload_0         
		//   25   45:getfield        #47  <Field int bitField0_>
		//   26   48:bipush          -2
		//   27   50:iand            
		//   28   51:putfield        #47  <Field int bitField0_>
				}
				sourcecodeinfo.location_ = location_;
		//   29   54:aload_2         
		//   30   55:aload_0         
		//   31   56:getfield        #33  <Field List location_>
		//   32   59:invokestatic    #181 <Method List DescriptorProtos$SourceCodeInfo.access$28602(DescriptorProtos$SourceCodeInfo, List)>
		//   33   62:pop             
			} else
		//*  34   63:goto            78
			{
				sourcecodeinfo.location_ = locationBuilder_.build();
		//   35   66:aload_2         
		//   36   67:aload_0         
		//   37   68:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   38   71:invokevirtual   #183 <Method List RepeatedFieldBuilderV3.build()>
		//   39   74:invokestatic    #181 <Method List DescriptorProtos$SourceCodeInfo.access$28602(DescriptorProtos$SourceCodeInfo, List)>
		//   40   77:pop             
			}
			onBuilt();
		//   41   78:aload_0         
		//   42   79:invokevirtual   #186 <Method void onBuilt()>
			return sourcecodeinfo;
		//   43   82:aload_2         
		//   44   83:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #159 <Method DescriptorProtos$SourceCodeInfo buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #159 <Method DescriptorProtos$SourceCodeInfo buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #191 <Method DescriptorProtos$SourceCodeInfo$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #194 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			if(locationBuilder_ == null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   5    9:ifnonnull       32
			{
				location_ = Collections.emptyList();
		//    6   12:aload_0         
		//    7   13:invokestatic    #31  <Method List Collections.emptyList()>
		//    8   16:putfield        #33  <Field List location_>
				bitField0_ = bitField0_ & -2;
		//    9   19:aload_0         
		//   10   20:aload_0         
		//   11   21:getfield        #47  <Field int bitField0_>
		//   12   24:bipush          -2
		//   13   26:iand            
		//   14   27:putfield        #47  <Field int bitField0_>
				return this;
		//   15   30:aload_0         
		//   16   31:areturn         
			} else
			{
				locationBuilder_.clear();
		//   17   32:aload_0         
		//   18   33:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   19   36:invokevirtual   #196 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   20   39:aload_0         
		//   21   40:areturn         
			}
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #191 <Method DescriptorProtos$SourceCodeInfo$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #191 <Method DescriptorProtos$SourceCodeInfo$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #191 <Method DescriptorProtos$SourceCodeInfo$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #203 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #205 <Method DescriptorProtos$SourceCodeInfo$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #205 <Method DescriptorProtos$SourceCodeInfo$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearLocation()
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       31
			{
				location_ = Collections.emptyList();
		//    3    7:aload_0         
		//    4    8:invokestatic    #31  <Method List Collections.emptyList()>
		//    5   11:putfield        #33  <Field List location_>
				bitField0_ = bitField0_ & -2;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #47  <Field int bitField0_>
		//    9   19:bipush          -2
		//   10   21:iand            
		//   11   22:putfield        #47  <Field int bitField0_>
				onChanged();
		//   12   25:aload_0         
		//   13   26:invokevirtual   #97  <Method void onChanged()>
				return this;
		//   14   29:aload_0         
		//   15   30:areturn         
			} else
			{
				locationBuilder_.clear();
		//   16   31:aload_0         
		//   17   32:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   18   35:invokevirtual   #196 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   19   38:aload_0         
		//   20   39:areturn         
			}
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #212 <Method DescriptorProtos$SourceCodeInfo$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #215 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #212 <Method DescriptorProtos$SourceCodeInfo$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #212 <Method DescriptorProtos$SourceCodeInfo$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #219 <Method DescriptorProtos$SourceCodeInfo$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #219 <Method DescriptorProtos$SourceCodeInfo$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #222 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #219 <Method DescriptorProtos$SourceCodeInfo$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #219 <Method DescriptorProtos$SourceCodeInfo$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #219 <Method DescriptorProtos$SourceCodeInfo$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #219 <Method DescriptorProtos$SourceCodeInfo$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.SourceCodeInfo getDefaultInstanceForType()
		{
			return DescriptorProtos.SourceCodeInfo.getDefaultInstance();
		//    0    0:invokestatic    #229 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #231 <Method DescriptorProtos$SourceCodeInfo getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #231 <Method DescriptorProtos$SourceCodeInfo getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$26900();
		//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$26900()>
		//    1    3:areturn         
		}

		public Location getLocation(int i)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       21
				return (Location)location_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field List location_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #238 <Method Object List.get(int)>
		//    7   17:checkcast       #136 <Class DescriptorProtos$SourceCodeInfo$Location>
		//    8   20:areturn         
			else
				return (Location)locationBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #242 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #136 <Class DescriptorProtos$SourceCodeInfo$Location>
		//   14   32:areturn         
		}

		public Location.Builder getLocationBuilder(int i)
		{
			return (Location.Builder)getLocationFieldBuilder().getBuilder(i);
		//    0    0:aload_0         
		//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getLocationFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #247 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
		//    4    8:checkcast       #106 <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    5   11:areturn         
		}

		public List getLocationBuilderList()
		{
			return getLocationFieldBuilder().getBuilderList();
		//    0    0:aload_0         
		//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getLocationFieldBuilder()>
		//    2    4:invokevirtual   #251 <Method List RepeatedFieldBuilderV3.getBuilderList()>
		//    3    7:areturn         
		}

		public int getLocationCount()
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       17
				return location_.size();
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field List location_>
		//    5   11:invokeinterface #257 <Method int List.size()>
		//    6   16:ireturn         
			else
				return locationBuilder_.getCount();
		//    7   17:aload_0         
		//    8   18:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//    9   21:invokevirtual   #260 <Method int RepeatedFieldBuilderV3.getCount()>
		//   10   24:ireturn         
		}

		public List getLocationList()
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       15
				return Collections.unmodifiableList(location_);
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field List location_>
		//    5   11:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
		//    6   14:areturn         
			else
				return locationBuilder_.getMessageList();
		//    7   15:aload_0         
		//    8   16:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//    9   19:invokevirtual   #264 <Method List RepeatedFieldBuilderV3.getMessageList()>
		//   10   22:areturn         
		}

		public LocationOrBuilder getLocationOrBuilder(int i)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       21
				return (LocationOrBuilder)location_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field List location_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #238 <Method Object List.get(int)>
		//    7   17:checkcast       #269 <Class DescriptorProtos$SourceCodeInfo$LocationOrBuilder>
		//    8   20:areturn         
			else
				return (LocationOrBuilder)locationBuilder_.getMessageOrBuilder(i);
		//    9   21:aload_0         
		//   10   22:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #273 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
		//   13   29:checkcast       #269 <Class DescriptorProtos$SourceCodeInfo$LocationOrBuilder>
		//   14   32:areturn         
		}

		public List getLocationOrBuilderList()
		{
			if(locationBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnull          15
				return locationBuilder_.getMessageOrBuilderList();
		//    3    7:aload_0         
		//    4    8:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//    5   11:invokevirtual   #277 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
		//    6   14:areturn         
			else
				return Collections.unmodifiableList(location_);
		//    7   15:aload_0         
		//    8   16:getfield        #33  <Field List location_>
		//    9   19:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
		//   10   22:areturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$27000().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$SourceCodeInfo, com/google/protobuf/DescriptorProtos$SourceCodeInfo$Builder);
		//    0    0:invokestatic    #283 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$27000()>
		//    1    3:ldc1            #9   <Class DescriptorProtos$SourceCodeInfo>
		//    2    5:ldc1            #2   <Class DescriptorProtos$SourceCodeInfo$Builder>
		//    3    7:invokevirtual   #289 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
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
		//    3    3:invokevirtual   #296 <Method DescriptorProtos$SourceCodeInfo$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #300 <Method DescriptorProtos$SourceCodeInfo$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #296 <Method DescriptorProtos$SourceCodeInfo$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.SourceCodeInfo)DescriptorProtos.SourceCodeInfo.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #307 <Field Parser DescriptorProtos$SourceCodeInfo.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #313 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class DescriptorProtos$SourceCodeInfo>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.SourceCodeInfo) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #316 <Method DescriptorProtos$SourceCodeInfo$Builder mergeFrom(DescriptorProtos$SourceCodeInfo)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #319 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class DescriptorProtos$SourceCodeInfo>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #323 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #316 <Method DescriptorProtos$SourceCodeInfo$Builder mergeFrom(DescriptorProtos$SourceCodeInfo)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.SourceCodeInfo)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.SourceCodeInfo) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.SourceCodeInfo sourcecodeinfo)
		{
			if(sourcecodeinfo == DescriptorProtos.SourceCodeInfo.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #229 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(locationBuilder_ == null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   7   13:ifnonnull       87
			{
				if(!sourcecodeinfo.location_.isEmpty())
		//*   8   16:aload_1         
		//*   9   17:invokestatic    #327 <Method List DescriptorProtos$SourceCodeInfo.access$28600(DescriptorProtos$SourceCodeInfo)>
		//*  10   20:invokeinterface #330 <Method boolean List.isEmpty()>
		//*  11   25:ifne            176
				{
					if(location_.isEmpty())
		//*  12   28:aload_0         
		//*  13   29:getfield        #33  <Field List location_>
		//*  14   32:invokeinterface #330 <Method boolean List.isEmpty()>
		//*  15   37:ifeq            62
					{
						location_ = sourcecodeinfo.location_;
		//   16   40:aload_0         
		//   17   41:aload_1         
		//   18   42:invokestatic    #327 <Method List DescriptorProtos$SourceCodeInfo.access$28600(DescriptorProtos$SourceCodeInfo)>
		//   19   45:putfield        #33  <Field List location_>
						bitField0_ = bitField0_ & -2;
		//   20   48:aload_0         
		//   21   49:aload_0         
		//   22   50:getfield        #47  <Field int bitField0_>
		//   23   53:bipush          -2
		//   24   55:iand            
		//   25   56:putfield        #47  <Field int bitField0_>
					} else
		//*  26   59:goto            80
					{
						ensureLocationIsMutable();
		//   27   62:aload_0         
		//   28   63:invokespecial   #88  <Method void ensureLocationIsMutable()>
						location_.addAll(((java.util.Collection) (sourcecodeinfo.location_)));
		//   29   66:aload_0         
		//   30   67:getfield        #33  <Field List location_>
		//   31   70:aload_1         
		//   32   71:invokestatic    #327 <Method List DescriptorProtos$SourceCodeInfo.access$28600(DescriptorProtos$SourceCodeInfo)>
		//   33   74:invokeinterface #333 <Method boolean List.addAll(java.util.Collection)>
		//   34   79:pop             
					}
					onChanged();
		//   35   80:aload_0         
		//   36   81:invokevirtual   #97  <Method void onChanged()>
				}
			} else
		//*  37   84:goto            176
			if(!sourcecodeinfo.location_.isEmpty())
		//*  38   87:aload_1         
		//*  39   88:invokestatic    #327 <Method List DescriptorProtos$SourceCodeInfo.access$28600(DescriptorProtos$SourceCodeInfo)>
		//*  40   91:invokeinterface #330 <Method boolean List.isEmpty()>
		//*  41   96:ifne            176
				if(locationBuilder_.isEmpty())
		//*  42   99:aload_0         
		//*  43  100:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*  44  103:invokevirtual   #334 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
		//*  45  106:ifeq            164
				{
					locationBuilder_.dispose();
		//   46  109:aload_0         
		//   47  110:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   48  113:invokevirtual   #337 <Method void RepeatedFieldBuilderV3.dispose()>
					locationBuilder_ = null;
		//   49  116:aload_0         
		//   50  117:aconst_null     
		//   51  118:putfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
					location_ = sourcecodeinfo.location_;
		//   52  121:aload_0         
		//   53  122:aload_1         
		//   54  123:invokestatic    #327 <Method List DescriptorProtos$SourceCodeInfo.access$28600(DescriptorProtos$SourceCodeInfo)>
		//   55  126:putfield        #33  <Field List location_>
					bitField0_ = bitField0_ & -2;
		//   56  129:aload_0         
		//   57  130:aload_0         
		//   58  131:getfield        #47  <Field int bitField0_>
		//   59  134:bipush          -2
		//   60  136:iand            
		//   61  137:putfield        #47  <Field int bitField0_>
					RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
					if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*  62  140:getstatic       #82  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*  63  143:ifeq            154
						repeatedfieldbuilderv3 = getLocationFieldBuilder();
		//   64  146:aload_0         
		//   65  147:invokespecial   #84  <Method RepeatedFieldBuilderV3 getLocationFieldBuilder()>
		//   66  150:astore_2        
					else
		//*  67  151:goto            156
						repeatedfieldbuilderv3 = null;
		//   68  154:aconst_null     
		//   69  155:astore_2        
					locationBuilder_ = repeatedfieldbuilderv3;
		//   70  156:aload_0         
		//   71  157:aload_2         
		//   72  158:putfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
				} else
		//*  73  161:goto            176
				{
					locationBuilder_.addAllMessages(((Iterable) (sourcecodeinfo.location_)));
		//   74  164:aload_0         
		//   75  165:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   76  168:aload_1         
		//   77  169:invokestatic    #327 <Method List DescriptorProtos$SourceCodeInfo.access$28600(DescriptorProtos$SourceCodeInfo)>
		//   78  172:invokevirtual   #101 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   79  175:pop             
				}
			mergeUnknownFields(sourcecodeinfo.unknownFields);
		//   80  176:aload_0         
		//   81  177:aload_1         
		//   82  178:getfield        #341 <Field UnknownFieldSet DescriptorProtos$SourceCodeInfo.unknownFields>
		//   83  181:invokevirtual   #345 <Method DescriptorProtos$SourceCodeInfo$Builder mergeUnknownFields(UnknownFieldSet)>
		//   84  184:pop             
			onChanged();
		//   85  185:aload_0         
		//   86  186:invokevirtual   #97  <Method void onChanged()>
			return this;
		//   87  189:aload_0         
		//   88  190:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.SourceCodeInfo)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class DescriptorProtos$SourceCodeInfo>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.SourceCodeInfo)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class DescriptorProtos$SourceCodeInfo>
		//    6   12:invokevirtual   #316 <Method DescriptorProtos$SourceCodeInfo$Builder mergeFrom(DescriptorProtos$SourceCodeInfo)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #347 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #296 <Method DescriptorProtos$SourceCodeInfo$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #300 <Method DescriptorProtos$SourceCodeInfo$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #296 <Method DescriptorProtos$SourceCodeInfo$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #345 <Method DescriptorProtos$SourceCodeInfo$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #354 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #345 <Method DescriptorProtos$SourceCodeInfo$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #345 <Method DescriptorProtos$SourceCodeInfo$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder removeLocation(int i)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       28
			{
				ensureLocationIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #88  <Method void ensureLocationIsMutable()>
				location_.remove(i);
		//    5   11:aload_0         
		//    6   12:getfield        #33  <Field List location_>
		//    7   15:iload_1         
		//    8   16:invokeinterface #360 <Method Object List.remove(int)>
		//    9   21:pop             
				onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #97  <Method void onChanged()>
				return this;
		//   12   26:aload_0         
		//   13   27:areturn         
			} else
			{
				locationBuilder_.remove(i);
		//   14   28:aload_0         
		//   15   29:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #363 <Method void RepeatedFieldBuilderV3.remove(int)>
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
		//    3    3:invokespecial   #366 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #368 <Method DescriptorProtos$SourceCodeInfo$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #368 <Method DescriptorProtos$SourceCodeInfo$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setLocation(int i, Location.Builder builder)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureLocationIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #88  <Method void ensureLocationIsMutable()>
				location_.set(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #33  <Field List location_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #110 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location$Builder.build()>
		//   10   20:invokeinterface #373 <Method Object List.set(int, Object)>
		//   11   25:pop             
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #97  <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				locationBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
		//   16   32:aload_0         
		//   17   33:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   18   36:iload_1         
		//   19   37:aload_2         
		//   20   38:invokevirtual   #110 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location$Builder.build()>
		//   21   41:invokevirtual   #376 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   22   44:pop             
				return this;
		//   23   45:aload_0         
		//   24   46:areturn         
			}
		}

		public Builder setLocation(int i, Location location)
		{
			if(locationBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(location == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #123 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #124 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureLocationIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #88  <Method void ensureLocationIsMutable()>
					location_.set(i, ((Object) (location)));
		//   11   23:aload_0         
		//   12   24:getfield        #33  <Field List location_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #373 <Method Object List.set(int, Object)>
		//   16   34:pop             
					onChanged();
		//   17   35:aload_0         
		//   18   36:invokevirtual   #97  <Method void onChanged()>
					return this;
		//   19   39:aload_0         
		//   20   40:areturn         
				}
			} else
			{
				locationBuilder_.setMessage(i, ((AbstractMessage) (location)));
		//   21   41:aload_0         
		//   22   42:getfield        #61  <Field RepeatedFieldBuilderV3 locationBuilder_>
		//   23   45:iload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #376 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   26   50:pop             
				return this;
		//   27   51:aload_0         
		//   28   52:areturn         
			}
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #381 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #383 <Method DescriptorProtos$SourceCodeInfo$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #383 <Method DescriptorProtos$SourceCodeInfo$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #387 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #389 <Method DescriptorProtos$SourceCodeInfo$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #389 <Method DescriptorProtos$SourceCodeInfo$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private RepeatedFieldBuilderV3 locationBuilder_;
		private List location_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void GeneratedMessageV3$Builder()>
			location_ = Collections.emptyList();
		//    2    4:aload_0         
		//    3    5:invokestatic    #31  <Method List Collections.emptyList()>
		//    4    8:putfield        #33  <Field List location_>
			maybeForceBuilderInitialization();
		//    5   11:aload_0         
		//    6   12:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
		//    7   15:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void DescriptorProtos$SourceCodeInfo$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			location_ = Collections.emptyList();
		//    3    5:aload_0         
		//    4    6:invokestatic    #31  <Method List Collections.emptyList()>
		//    5    9:putfield        #33  <Field List location_>
			maybeForceBuilderInitialization();
		//    6   12:aload_0         
		//    7   13:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
		//    8   16:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #44  <Method void DescriptorProtos$SourceCodeInfo$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static final class Location extends GeneratedMessageV3
		implements LocationOrBuilder
	{

		public static Location getDefaultInstance()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #59  <Field DescriptorProtos$SourceCodeInfo$Location DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$27100();
		//    0    0:invokestatic    #225 <Method Descriptors$Descriptor DescriptorProtos.access$27100()>
		//    1    3:areturn         
		}

		public static Builder newBuilder()
		{
			return DEFAULT_INSTANCE.toBuilder();
		//    0    0:getstatic       #59  <Field DescriptorProtos$SourceCodeInfo$Location DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #229 <Method DescriptorProtos$SourceCodeInfo$Location$Builder toBuilder()>
		//    2    6:areturn         
		}

		public static Builder newBuilder(Location location)
		{
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(location);
		//    0    0:getstatic       #59  <Field DescriptorProtos$SourceCodeInfo$Location DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #229 <Method DescriptorProtos$SourceCodeInfo$Location$Builder toBuilder()>
		//    2    6:aload_0         
		//    3    7:invokevirtual   #233 <Method DescriptorProtos$SourceCodeInfo$Location$Builder DescriptorProtos$SourceCodeInfo$Location$Builder.mergeFrom(DescriptorProtos$SourceCodeInfo$Location)>
		//    4   10:areturn         
		}

		public static Location parseDelimitedFrom(InputStream inputstream)
			throws IOException
		{
			return (Location)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #239 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    4   10:areturn         
		}

		public static Location parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (Location)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #243 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    5   11:areturn         
		}

		public static Location parseFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return (Location)PARSER.parseFrom(bytestring);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #250 <Method Object Parser.parseFrom(ByteString)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    4   12:areturn         
		}

		public static Location parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (Location)PARSER.parseFrom(bytestring, extensionregistrylite);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #254 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    5   13:areturn         
		}

		public static Location parseFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return (Location)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #259 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    4   10:areturn         
		}

		public static Location parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (Location)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #263 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    5   11:areturn         
		}

		public static Location parseFrom(InputStream inputstream)
			throws IOException
		{
			return (Location)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #265 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    4   10:areturn         
		}

		public static Location parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (Location)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #267 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    5   11:areturn         
		}

		public static Location parseFrom(ByteBuffer bytebuffer)
			throws InvalidProtocolBufferException
		{
			return (Location)PARSER.parseFrom(bytebuffer);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #271 <Method Object Parser.parseFrom(ByteBuffer)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    4   12:areturn         
		}

		public static Location parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (Location)PARSER.parseFrom(bytebuffer, extensionregistrylite);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #275 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    5   13:areturn         
		}

		public static Location parseFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return (Location)PARSER.parseFrom(abyte0);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #279 <Method Object Parser.parseFrom(byte[])>
		//    3    9:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    4   12:areturn         
		}

		public static Location parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (Location)PARSER.parseFrom(abyte0, extensionregistrylite);
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #283 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    5   13:areturn         
		}

		public static Parser parser()
		{
			return PARSER;
		//    0    0:getstatic       #62  <Field Parser PARSER>
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
			if(!(obj instanceof Location))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//*   7   11:ifne            20
				return super.equals(obj);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokespecial   #289 <Method boolean GeneratedMessageV3.equals(Object)>
		//   11   19:ireturn         
			obj = ((Object) ((Location)obj));
		//   12   20:aload_1         
		//   13   21:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//   14   24:astore_1        
			boolean flag;
			if(true && getPathList().equals(((Object) (((Location) (obj)).getPathList()))))
		//*  15   25:iconst_1        
		//*  16   26:ifeq            50
		//*  17   29:aload_0         
		//*  18   30:invokevirtual   #292 <Method List getPathList()>
		//*  19   33:aload_1         
		//*  20   34:invokevirtual   #292 <Method List getPathList()>
		//*  21   37:invokeinterface #293 <Method boolean List.equals(Object)>
		//*  22   42:ifeq            50
				flag = true;
		//   23   45:iconst_1        
		//   24   46:istore_2        
			else
		//*  25   47:goto            52
				flag = false;
		//   26   50:iconst_0        
		//   27   51:istore_2        
			if(flag && getSpanList().equals(((Object) (((Location) (obj)).getSpanList()))))
		//*  28   52:iload_2         
		//*  29   53:ifeq            77
		//*  30   56:aload_0         
		//*  31   57:invokevirtual   #296 <Method List getSpanList()>
		//*  32   60:aload_1         
		//*  33   61:invokevirtual   #296 <Method List getSpanList()>
		//*  34   64:invokeinterface #293 <Method boolean List.equals(Object)>
		//*  35   69:ifeq            77
				flag = true;
		//   36   72:iconst_1        
		//   37   73:istore_2        
			else
		//*  38   74:goto            79
				flag = false;
		//   39   77:iconst_0        
		//   40   78:istore_2        
			if(flag && hasLeadingComments() == ((Location) (obj)).hasLeadingComments())
		//*  41   79:iload_2         
		//*  42   80:ifeq            99
		//*  43   83:aload_0         
		//*  44   84:invokevirtual   #300 <Method boolean hasLeadingComments()>
		//*  45   87:aload_1         
		//*  46   88:invokevirtual   #300 <Method boolean hasLeadingComments()>
		//*  47   91:icmpne          99
				flag = true;
		//   48   94:iconst_1        
		//   49   95:istore_2        
			else
		//*  50   96:goto            101
				flag = false;
		//   51   99:iconst_0        
		//   52  100:istore_2        
			boolean flag1 = flag;
		//   53  101:iload_2         
		//   54  102:istore_3        
			if(hasLeadingComments())
		//*  55  103:aload_0         
		//*  56  104:invokevirtual   #300 <Method boolean hasLeadingComments()>
		//*  57  107:ifeq            135
				if(flag && getLeadingComments().equals(((Object) (((Location) (obj)).getLeadingComments()))))
		//*  58  110:iload_2         
		//*  59  111:ifeq            133
		//*  60  114:aload_0         
		//*  61  115:invokevirtual   #304 <Method String getLeadingComments()>
		//*  62  118:aload_1         
		//*  63  119:invokevirtual   #304 <Method String getLeadingComments()>
		//*  64  122:invokevirtual   #307 <Method boolean String.equals(Object)>
		//*  65  125:ifeq            133
					flag1 = true;
		//   66  128:iconst_1        
		//   67  129:istore_3        
				else
		//*  68  130:goto            135
					flag1 = false;
		//   69  133:iconst_0        
		//   70  134:istore_3        
			if(flag1 && hasTrailingComments() == ((Location) (obj)).hasTrailingComments())
		//*  71  135:iload_3         
		//*  72  136:ifeq            155
		//*  73  139:aload_0         
		//*  74  140:invokevirtual   #310 <Method boolean hasTrailingComments()>
		//*  75  143:aload_1         
		//*  76  144:invokevirtual   #310 <Method boolean hasTrailingComments()>
		//*  77  147:icmpne          155
				flag = true;
		//   78  150:iconst_1        
		//   79  151:istore_2        
			else
		//*  80  152:goto            157
				flag = false;
		//   81  155:iconst_0        
		//   82  156:istore_2        
			flag1 = flag;
		//   83  157:iload_2         
		//   84  158:istore_3        
			if(hasTrailingComments())
		//*  85  159:aload_0         
		//*  86  160:invokevirtual   #310 <Method boolean hasTrailingComments()>
		//*  87  163:ifeq            191
				if(flag && getTrailingComments().equals(((Object) (((Location) (obj)).getTrailingComments()))))
		//*  88  166:iload_2         
		//*  89  167:ifeq            189
		//*  90  170:aload_0         
		//*  91  171:invokevirtual   #313 <Method String getTrailingComments()>
		//*  92  174:aload_1         
		//*  93  175:invokevirtual   #313 <Method String getTrailingComments()>
		//*  94  178:invokevirtual   #307 <Method boolean String.equals(Object)>
		//*  95  181:ifeq            189
					flag1 = true;
		//   96  184:iconst_1        
		//   97  185:istore_3        
				else
		//*  98  186:goto            191
					flag1 = false;
		//   99  189:iconst_0        
		//  100  190:istore_3        
			if(flag1 && ((Object) (getLeadingDetachedCommentsList())).equals(((Object) (((Location) (obj)).getLeadingDetachedCommentsList()))))
		//* 101  191:iload_3         
		//* 102  192:ifeq            214
		//* 103  195:aload_0         
		//* 104  196:invokevirtual   #317 <Method ProtocolStringList getLeadingDetachedCommentsList()>
		//* 105  199:aload_1         
		//* 106  200:invokevirtual   #317 <Method ProtocolStringList getLeadingDetachedCommentsList()>
		//* 107  203:invokevirtual   #320 <Method boolean Object.equals(Object)>
		//* 108  206:ifeq            214
				flag = true;
		//  109  209:iconst_1        
		//  110  210:istore_2        
			else
		//* 111  211:goto            216
				flag = false;
		//  112  214:iconst_0        
		//  113  215:istore_2        
			return flag && unknownFields.equals(((Object) (((Location) (obj)).unknownFields)));
		//  114  216:iload_2         
		//  115  217:ifeq            236
		//  116  220:aload_0         
		//  117  221:getfield        #179 <Field UnknownFieldSet unknownFields>
		//  118  224:aload_1         
		//  119  225:getfield        #179 <Field UnknownFieldSet unknownFields>
		//  120  228:invokevirtual   #321 <Method boolean UnknownFieldSet.equals(Object)>
		//  121  231:ifeq            236
		//  122  234:iconst_1        
		//  123  235:ireturn         
		//  124  236:iconst_0        
		//  125  237:ireturn         
		}

		public Location getDefaultInstanceForType()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #59  <Field DescriptorProtos$SourceCodeInfo$Location DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #325 <Method DescriptorProtos$SourceCodeInfo$Location getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #325 <Method DescriptorProtos$SourceCodeInfo$Location getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public String getLeadingComments()
		{
			Object obj = leadingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #84  <Field Object leadingComments_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #306 <Class String>
		//*   5    9:ifeq            17
				return (String)obj;
		//    6   12:aload_1         
		//    7   13:checkcast       #306 <Class String>
		//    8   16:areturn         
			obj = ((Object) ((ByteString)obj));
		//    9   17:aload_1         
		//   10   18:checkcast       #328 <Class ByteString>
		//   11   21:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
		//   12   22:aload_1         
		//   13   23:invokevirtual   #331 <Method String ByteString.toStringUtf8()>
		//   14   26:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
		//*  15   27:aload_1         
		//*  16   28:invokevirtual   #334 <Method boolean ByteString.isValidUtf8()>
		//*  17   31:ifeq            39
				leadingComments_ = ((Object) (s));
		//   18   34:aload_0         
		//   19   35:aload_2         
		//   20   36:putfield        #84  <Field Object leadingComments_>
			return s;
		//   21   39:aload_2         
		//   22   40:areturn         
		}

		public ByteString getLeadingCommentsBytes()
		{
			Object obj = leadingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #84  <Field Object leadingComments_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #306 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #306 <Class String>
		//    8   16:invokestatic    #339 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				leadingComments_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #84  <Field Object leadingComments_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #328 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public String getLeadingDetachedComments(int i)
		{
			return (String)leadingDetachedComments_.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #345 <Method Object LazyStringList.get(int)>
		//    4   10:checkcast       #306 <Class String>
		//    5   13:areturn         
		}

		public ByteString getLeadingDetachedCommentsBytes(int i)
		{
			return leadingDetachedComments_.getByteString(i);
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #350 <Method ByteString LazyStringList.getByteString(int)>
		//    4   10:areturn         
		}

		public int getLeadingDetachedCommentsCount()
		{
			return leadingDetachedComments_.size();
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//    2    4:invokeinterface #354 <Method int LazyStringList.size()>
		//    3    9:ireturn         
		}

		public ProtocolStringList getLeadingDetachedCommentsList()
		{
			return ((ProtocolStringList) (leadingDetachedComments_));
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//    2    4:areturn         
		}

		public volatile List getLeadingDetachedCommentsList()
		{
			return ((List) (getLeadingDetachedCommentsList()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #317 <Method ProtocolStringList getLeadingDetachedCommentsList()>
		//    2    4:areturn         
		}

		public Parser getParserForType()
		{
			return PARSER;
		//    0    0:getstatic       #62  <Field Parser PARSER>
		//    1    3:areturn         
		}

		public int getPath(int i)
		{
			return ((Integer)path_.get(i)).intValue();
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field List path_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #357 <Method Object List.get(int)>
		//    4   10:checkcast       #125 <Class Integer>
		//    5   13:invokevirtual   #360 <Method int Integer.intValue()>
		//    6   16:ireturn         
		}

		public int getPathCount()
		{
			return path_.size();
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field List path_>
		//    2    4:invokeinterface #362 <Method int List.size()>
		//    3    9:ireturn         
		}

		public List getPathList()
		{
			return path_;
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field List path_>
		//    2    4:areturn         
		}

		public int getSerializedSize()
		{
			int i = memoizedSize;
		//    0    0:aload_0         
		//    1    1:getfield        #367 <Field int memoizedSize>
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
			for(i = 0; i < path_.size(); i++)
		//*  10   14:iconst_0        
		//*  11   15:istore_1        
		//*  12   16:iload_1         
		//*  13   17:aload_0         
		//*  14   18:getfield        #78  <Field List path_>
		//*  15   21:invokeinterface #362 <Method int List.size()>
		//*  16   26:icmpge          58
				j += CodedOutputStream.computeInt32SizeNoTag(((Integer)path_.get(i)).intValue());
		//   17   29:iload_2         
		//   18   30:aload_0         
		//   19   31:getfield        #78  <Field List path_>
		//   20   34:iload_1         
		//   21   35:invokeinterface #357 <Method Object List.get(int)>
		//   22   40:checkcast       #125 <Class Integer>
		//   23   43:invokevirtual   #360 <Method int Integer.intValue()>
		//   24   46:invokestatic    #372 <Method int CodedOutputStream.computeInt32SizeNoTag(int)>
		//   25   49:iadd            
		//   26   50:istore_2        

		//   27   51:iload_1         
		//   28   52:iconst_1        
		//   29   53:iadd            
		//   30   54:istore_1        
		//*  31   55:goto            16
			int l = j + 0;
		//   32   58:iload_2         
		//   33   59:iconst_0        
		//   34   60:iadd            
		//   35   61:istore_3        
			i = l;
		//   36   62:iload_3         
		//   37   63:istore_1        
			if(!getPathList().isEmpty())
		//*  38   64:aload_0         
		//*  39   65:invokevirtual   #292 <Method List getPathList()>
		//*  40   68:invokeinterface #375 <Method boolean List.isEmpty()>
		//*  41   73:ifne            85
				i = l + 1 + CodedOutputStream.computeInt32SizeNoTag(j);
		//   42   76:iload_3         
		//   43   77:iconst_1        
		//   44   78:iadd            
		//   45   79:iload_2         
		//   46   80:invokestatic    #372 <Method int CodedOutputStream.computeInt32SizeNoTag(int)>
		//   47   83:iadd            
		//   48   84:istore_1        
			pathMemoizedSerializedSize = j;
		//   49   85:aload_0         
		//   50   86:iload_2         
		//   51   87:putfield        #66  <Field int pathMemoizedSerializedSize>
			j = 0;
		//   52   90:iconst_0        
		//   53   91:istore_2        
			for(l = 0; l < span_.size(); l++)
		//*  54   92:iconst_0        
		//*  55   93:istore_3        
		//*  56   94:iload_3         
		//*  57   95:aload_0         
		//*  58   96:getfield        #80  <Field List span_>
		//*  59   99:invokeinterface #362 <Method int List.size()>
		//*  60  104:icmpge          136
				j += CodedOutputStream.computeInt32SizeNoTag(((Integer)span_.get(l)).intValue());
		//   61  107:iload_2         
		//   62  108:aload_0         
		//   63  109:getfield        #80  <Field List span_>
		//   64  112:iload_3         
		//   65  113:invokeinterface #357 <Method Object List.get(int)>
		//   66  118:checkcast       #125 <Class Integer>
		//   67  121:invokevirtual   #360 <Method int Integer.intValue()>
		//   68  124:invokestatic    #372 <Method int CodedOutputStream.computeInt32SizeNoTag(int)>
		//   69  127:iadd            
		//   70  128:istore_2        

		//   71  129:iload_3         
		//   72  130:iconst_1        
		//   73  131:iadd            
		//   74  132:istore_3        
		//*  75  133:goto            94
			l = i + j;
		//   76  136:iload_1         
		//   77  137:iload_2         
		//   78  138:iadd            
		//   79  139:istore_3        
			i = l;
		//   80  140:iload_3         
		//   81  141:istore_1        
			if(!getSpanList().isEmpty())
		//*  82  142:aload_0         
		//*  83  143:invokevirtual   #296 <Method List getSpanList()>
		//*  84  146:invokeinterface #375 <Method boolean List.isEmpty()>
		//*  85  151:ifne            163
				i = l + 1 + CodedOutputStream.computeInt32SizeNoTag(j);
		//   86  154:iload_3         
		//   87  155:iconst_1        
		//   88  156:iadd            
		//   89  157:iload_2         
		//   90  158:invokestatic    #372 <Method int CodedOutputStream.computeInt32SizeNoTag(int)>
		//   91  161:iadd            
		//   92  162:istore_1        
			spanMemoizedSerializedSize = j;
		//   93  163:aload_0         
		//   94  164:iload_2         
		//   95  165:putfield        #68  <Field int spanMemoizedSerializedSize>
			j = i;
		//   96  168:iload_1         
		//   97  169:istore_2        
			if((bitField0_ & 1) == 1)
		//*  98  170:aload_0         
		//*  99  171:getfield        #155 <Field int bitField0_>
		//* 100  174:iconst_1        
		//* 101  175:iand            
		//* 102  176:iconst_1        
		//* 103  177:icmpne          191
				j = i + GeneratedMessageV3.computeStringSize(3, leadingComments_);
		//  104  180:iload_1         
		//  105  181:iconst_3        
		//  106  182:aload_0         
		//  107  183:getfield        #84  <Field Object leadingComments_>
		//  108  186:invokestatic    #379 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
		//  109  189:iadd            
		//  110  190:istore_2        
			i = j;
		//  111  191:iload_2         
		//  112  192:istore_1        
			if((bitField0_ & 2) == 2)
		//* 113  193:aload_0         
		//* 114  194:getfield        #155 <Field int bitField0_>
		//* 115  197:iconst_2        
		//* 116  198:iand            
		//* 117  199:iconst_2        
		//* 118  200:icmpne          214
				i = j + GeneratedMessageV3.computeStringSize(4, trailingComments_);
		//  119  203:iload_2         
		//  120  204:iconst_4        
		//  121  205:aload_0         
		//  122  206:getfield        #86  <Field Object trailingComments_>
		//  123  209:invokestatic    #379 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
		//  124  212:iadd            
		//  125  213:istore_1        
			l = 0;
		//  126  214:iconst_0        
		//  127  215:istore_3        
			for(int k = 0; k < leadingDetachedComments_.size(); k++)
		//* 128  216:iconst_0        
		//* 129  217:istore_2        
		//* 130  218:iload_2         
		//* 131  219:aload_0         
		//* 132  220:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//* 133  223:invokeinterface #354 <Method int LazyStringList.size()>
		//* 134  228:icmpge          254
				l += computeStringSizeNoTag(leadingDetachedComments_.getRaw(k));
		//  135  231:iload_3         
		//  136  232:aload_0         
		//  137  233:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//  138  236:iload_2         
		//  139  237:invokeinterface #382 <Method Object LazyStringList.getRaw(int)>
		//  140  242:invokestatic    #386 <Method int computeStringSizeNoTag(Object)>
		//  141  245:iadd            
		//  142  246:istore_3        

		//  143  247:iload_2         
		//  144  248:iconst_1        
		//  145  249:iadd            
		//  146  250:istore_2        
		//* 147  251:goto            218
			i = i + l + getLeadingDetachedCommentsList().size() * 1 + unknownFields.getSerializedSize();
		//  148  254:iload_1         
		//  149  255:iload_3         
		//  150  256:iadd            
		//  151  257:aload_0         
		//  152  258:invokevirtual   #317 <Method ProtocolStringList getLeadingDetachedCommentsList()>
		//  153  261:invokeinterface #389 <Method int ProtocolStringList.size()>
		//  154  266:iconst_1        
		//  155  267:imul            
		//  156  268:iadd            
		//  157  269:aload_0         
		//  158  270:getfield        #179 <Field UnknownFieldSet unknownFields>
		//  159  273:invokevirtual   #391 <Method int UnknownFieldSet.getSerializedSize()>
		//  160  276:iadd            
		//  161  277:istore_1        
			memoizedSize = i;
		//  162  278:aload_0         
		//  163  279:iload_1         
		//  164  280:putfield        #367 <Field int memoizedSize>
			return i;
		//  165  283:iload_1         
		//  166  284:ireturn         
		}

		public int getSpan(int i)
		{
			return ((Integer)span_.get(i)).intValue();
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field List span_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #357 <Method Object List.get(int)>
		//    4   10:checkcast       #125 <Class Integer>
		//    5   13:invokevirtual   #360 <Method int Integer.intValue()>
		//    6   16:ireturn         
		}

		public int getSpanCount()
		{
			return span_.size();
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field List span_>
		//    2    4:invokeinterface #362 <Method int List.size()>
		//    3    9:ireturn         
		}

		public List getSpanList()
		{
			return span_;
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field List span_>
		//    2    4:areturn         
		}

		public String getTrailingComments()
		{
			Object obj = trailingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #86  <Field Object trailingComments_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #306 <Class String>
		//*   5    9:ifeq            17
				return (String)obj;
		//    6   12:aload_1         
		//    7   13:checkcast       #306 <Class String>
		//    8   16:areturn         
			obj = ((Object) ((ByteString)obj));
		//    9   17:aload_1         
		//   10   18:checkcast       #328 <Class ByteString>
		//   11   21:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
		//   12   22:aload_1         
		//   13   23:invokevirtual   #331 <Method String ByteString.toStringUtf8()>
		//   14   26:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
		//*  15   27:aload_1         
		//*  16   28:invokevirtual   #334 <Method boolean ByteString.isValidUtf8()>
		//*  17   31:ifeq            39
				trailingComments_ = ((Object) (s));
		//   18   34:aload_0         
		//   19   35:aload_2         
		//   20   36:putfield        #86  <Field Object trailingComments_>
			return s;
		//   21   39:aload_2         
		//   22   40:areturn         
		}

		public ByteString getTrailingCommentsBytes()
		{
			Object obj = trailingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #86  <Field Object trailingComments_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #306 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #306 <Class String>
		//    8   16:invokestatic    #339 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				trailingComments_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #86  <Field Object trailingComments_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #328 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public final UnknownFieldSet getUnknownFields()
		{
			return unknownFields;
		//    0    0:aload_0         
		//    1    1:getfield        #179 <Field UnknownFieldSet unknownFields>
		//    2    4:areturn         
		}

		public boolean hasLeadingComments()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #155 <Field int bitField0_>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasTrailingComments()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #155 <Field int bitField0_>
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
		//*   1    1:getfield        #399 <Field int memoizedHashCode>
		//*   2    4:ifeq            12
				return memoizedHashCode;
		//    3    7:aload_0         
		//    4    8:getfield        #399 <Field int memoizedHashCode>
		//    5   11:ireturn         
			int j = ((Object) (getDescriptor())).hashCode() + 779;
		//    6   12:invokestatic    #401 <Method Descriptors$Descriptor getDescriptor()>
		//    7   15:invokevirtual   #403 <Method int Object.hashCode()>
		//    8   18:sipush          779
		//    9   21:iadd            
		//   10   22:istore_2        
			int i = j;
		//   11   23:iload_2         
		//   12   24:istore_1        
			if(getPathCount() > 0)
		//*  13   25:aload_0         
		//*  14   26:invokevirtual   #405 <Method int getPathCount()>
		//*  15   29:ifle            52
				i = (j * 37 + 1) * 53 + getPathList().hashCode();
		//   16   32:iload_2         
		//   17   33:bipush          37
		//   18   35:imul            
		//   19   36:iconst_1        
		//   20   37:iadd            
		//   21   38:bipush          53
		//   22   40:imul            
		//   23   41:aload_0         
		//   24   42:invokevirtual   #292 <Method List getPathList()>
		//   25   45:invokeinterface #406 <Method int List.hashCode()>
		//   26   50:iadd            
		//   27   51:istore_1        
			j = i;
		//   28   52:iload_1         
		//   29   53:istore_2        
			if(getSpanCount() > 0)
		//*  30   54:aload_0         
		//*  31   55:invokevirtual   #408 <Method int getSpanCount()>
		//*  32   58:ifle            81
				j = (i * 37 + 2) * 53 + getSpanList().hashCode();
		//   33   61:iload_1         
		//   34   62:bipush          37
		//   35   64:imul            
		//   36   65:iconst_2        
		//   37   66:iadd            
		//   38   67:bipush          53
		//   39   69:imul            
		//   40   70:aload_0         
		//   41   71:invokevirtual   #296 <Method List getSpanList()>
		//   42   74:invokeinterface #406 <Method int List.hashCode()>
		//   43   79:iadd            
		//   44   80:istore_2        
			i = j;
		//   45   81:iload_2         
		//   46   82:istore_1        
			if(hasLeadingComments())
		//*  47   83:aload_0         
		//*  48   84:invokevirtual   #300 <Method boolean hasLeadingComments()>
		//*  49   87:ifeq            108
				i = (j * 37 + 3) * 53 + getLeadingComments().hashCode();
		//   50   90:iload_2         
		//   51   91:bipush          37
		//   52   93:imul            
		//   53   94:iconst_3        
		//   54   95:iadd            
		//   55   96:bipush          53
		//   56   98:imul            
		//   57   99:aload_0         
		//   58  100:invokevirtual   #304 <Method String getLeadingComments()>
		//   59  103:invokevirtual   #409 <Method int String.hashCode()>
		//   60  106:iadd            
		//   61  107:istore_1        
			j = i;
		//   62  108:iload_1         
		//   63  109:istore_2        
			if(hasTrailingComments())
		//*  64  110:aload_0         
		//*  65  111:invokevirtual   #310 <Method boolean hasTrailingComments()>
		//*  66  114:ifeq            135
				j = (i * 37 + 4) * 53 + getTrailingComments().hashCode();
		//   67  117:iload_1         
		//   68  118:bipush          37
		//   69  120:imul            
		//   70  121:iconst_4        
		//   71  122:iadd            
		//   72  123:bipush          53
		//   73  125:imul            
		//   74  126:aload_0         
		//   75  127:invokevirtual   #313 <Method String getTrailingComments()>
		//   76  130:invokevirtual   #409 <Method int String.hashCode()>
		//   77  133:iadd            
		//   78  134:istore_2        
			i = j;
		//   79  135:iload_2         
		//   80  136:istore_1        
			if(getLeadingDetachedCommentsCount() > 0)
		//*  81  137:aload_0         
		//*  82  138:invokevirtual   #411 <Method int getLeadingDetachedCommentsCount()>
		//*  83  141:ifle            163
				i = (j * 37 + 6) * 53 + ((Object) (getLeadingDetachedCommentsList())).hashCode();
		//   84  144:iload_2         
		//   85  145:bipush          37
		//   86  147:imul            
		//   87  148:bipush          6
		//   88  150:iadd            
		//   89  151:bipush          53
		//   90  153:imul            
		//   91  154:aload_0         
		//   92  155:invokevirtual   #317 <Method ProtocolStringList getLeadingDetachedCommentsList()>
		//   93  158:invokevirtual   #403 <Method int Object.hashCode()>
		//   94  161:iadd            
		//   95  162:istore_1        
			i = i * 29 + unknownFields.hashCode();
		//   96  163:iload_1         
		//   97  164:bipush          29
		//   98  166:imul            
		//   99  167:aload_0         
		//  100  168:getfield        #179 <Field UnknownFieldSet unknownFields>
		//  101  171:invokevirtual   #412 <Method int UnknownFieldSet.hashCode()>
		//  102  174:iadd            
		//  103  175:istore_1        
			memoizedHashCode = i;
		//  104  176:aload_0         
		//  105  177:iload_1         
		//  106  178:putfield        #399 <Field int memoizedHashCode>
			return i;
		//  107  181:iload_1         
		//  108  182:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$27200().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$SourceCodeInfo$Location, com/google/protobuf/DescriptorProtos$SourceCodeInfo$Location$Builder);
		//    0    0:invokestatic    #417 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$27200()>
		//    1    3:ldc1            #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    2    5:ldc1            #16  <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    3    7:invokevirtual   #423 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			byte byte0 = memoizedIsInitialized;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field byte memoizedIsInitialized>
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
		//   14   20:putfield        #70  <Field byte memoizedIsInitialized>
				return true;
		//   15   23:iconst_1        
		//   16   24:ireturn         
			}
		}

		public Builder newBuilderForType()
		{
			return newBuilder();
		//    0    0:invokestatic    #427 <Method DescriptorProtos$SourceCodeInfo$Location$Builder newBuilder()>
		//    1    3:areturn         
		}

		protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #16  <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #431 <Method void DescriptorProtos$SourceCodeInfo$Location$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
		//    5    9:areturn         
		}

		public volatile Message.Builder newBuilderForType()
		{
			return ((Message.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #434 <Method DescriptorProtos$SourceCodeInfo$Location$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return ((Message.Builder) (newBuilderForType(builderparent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #437 <Method DescriptorProtos$SourceCodeInfo$Location$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder newBuilderForType()
		{
			return ((MessageLite.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #434 <Method DescriptorProtos$SourceCodeInfo$Location$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		public Builder toBuilder()
		{
			if(this == DEFAULT_INSTANCE)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #59  <Field DescriptorProtos$SourceCodeInfo$Location DEFAULT_INSTANCE>
		//*   2    4:if_acmpne       16
				return new Builder(((DescriptorProtos._cls1) (null)));
		//    3    7:new             #16  <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    4   10:dup             
		//    5   11:aconst_null     
		//    6   12:invokespecial   #441 <Method void DescriptorProtos$SourceCodeInfo$Location$Builder(DescriptorProtos$1)>
		//    7   15:areturn         
			else
				return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
		//    8   16:new             #16  <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    9   19:dup             
		//   10   20:aconst_null     
		//   11   21:invokespecial   #441 <Method void DescriptorProtos$SourceCodeInfo$Location$Builder(DescriptorProtos$1)>
		//   12   24:aload_0         
		//   13   25:invokevirtual   #233 <Method DescriptorProtos$SourceCodeInfo$Location$Builder DescriptorProtos$SourceCodeInfo$Location$Builder.mergeFrom(DescriptorProtos$SourceCodeInfo$Location)>
		//   14   28:areturn         
		}

		public volatile Message.Builder toBuilder()
		{
			return ((Message.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #229 <Method DescriptorProtos$SourceCodeInfo$Location$Builder toBuilder()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder toBuilder()
		{
			return ((MessageLite.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #229 <Method DescriptorProtos$SourceCodeInfo$Location$Builder toBuilder()>
		//    2    4:areturn         
		}

		public void writeTo(CodedOutputStream codedoutputstream)
			throws IOException
		{
			getSerializedSize();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #444 <Method int getSerializedSize()>
		//    2    4:pop             
			if(getPathList().size() > 0)
		//*   3    5:aload_0         
		//*   4    6:invokevirtual   #292 <Method List getPathList()>
		//*   5    9:invokeinterface #362 <Method int List.size()>
		//*   6   14:ifle            31
			{
				codedoutputstream.writeUInt32NoTag(10);
		//    7   17:aload_1         
		//    8   18:bipush          10
		//    9   20:invokevirtual   #447 <Method void CodedOutputStream.writeUInt32NoTag(int)>
				codedoutputstream.writeUInt32NoTag(pathMemoizedSerializedSize);
		//   10   23:aload_1         
		//   11   24:aload_0         
		//   12   25:getfield        #66  <Field int pathMemoizedSerializedSize>
		//   13   28:invokevirtual   #447 <Method void CodedOutputStream.writeUInt32NoTag(int)>
			}
			for(int i = 0; i < path_.size(); i++)
		//*  14   31:iconst_0        
		//*  15   32:istore_2        
		//*  16   33:iload_2         
		//*  17   34:aload_0         
		//*  18   35:getfield        #78  <Field List path_>
		//*  19   38:invokeinterface #362 <Method int List.size()>
		//*  20   43:icmpge          73
				codedoutputstream.writeInt32NoTag(((Integer)path_.get(i)).intValue());
		//   21   46:aload_1         
		//   22   47:aload_0         
		//   23   48:getfield        #78  <Field List path_>
		//   24   51:iload_2         
		//   25   52:invokeinterface #357 <Method Object List.get(int)>
		//   26   57:checkcast       #125 <Class Integer>
		//   27   60:invokevirtual   #360 <Method int Integer.intValue()>
		//   28   63:invokevirtual   #450 <Method void CodedOutputStream.writeInt32NoTag(int)>

		//   29   66:iload_2         
		//   30   67:iconst_1        
		//   31   68:iadd            
		//   32   69:istore_2        
		//*  33   70:goto            33
			if(getSpanList().size() > 0)
		//*  34   73:aload_0         
		//*  35   74:invokevirtual   #296 <Method List getSpanList()>
		//*  36   77:invokeinterface #362 <Method int List.size()>
		//*  37   82:ifle            99
			{
				codedoutputstream.writeUInt32NoTag(18);
		//   38   85:aload_1         
		//   39   86:bipush          18
		//   40   88:invokevirtual   #447 <Method void CodedOutputStream.writeUInt32NoTag(int)>
				codedoutputstream.writeUInt32NoTag(spanMemoizedSerializedSize);
		//   41   91:aload_1         
		//   42   92:aload_0         
		//   43   93:getfield        #68  <Field int spanMemoizedSerializedSize>
		//   44   96:invokevirtual   #447 <Method void CodedOutputStream.writeUInt32NoTag(int)>
			}
			for(int j = 0; j < span_.size(); j++)
		//*  45   99:iconst_0        
		//*  46  100:istore_2        
		//*  47  101:iload_2         
		//*  48  102:aload_0         
		//*  49  103:getfield        #80  <Field List span_>
		//*  50  106:invokeinterface #362 <Method int List.size()>
		//*  51  111:icmpge          141
				codedoutputstream.writeInt32NoTag(((Integer)span_.get(j)).intValue());
		//   52  114:aload_1         
		//   53  115:aload_0         
		//   54  116:getfield        #80  <Field List span_>
		//   55  119:iload_2         
		//   56  120:invokeinterface #357 <Method Object List.get(int)>
		//   57  125:checkcast       #125 <Class Integer>
		//   58  128:invokevirtual   #360 <Method int Integer.intValue()>
		//   59  131:invokevirtual   #450 <Method void CodedOutputStream.writeInt32NoTag(int)>

		//   60  134:iload_2         
		//   61  135:iconst_1        
		//   62  136:iadd            
		//   63  137:istore_2        
		//*  64  138:goto            101
			if((bitField0_ & 1) == 1)
		//*  65  141:aload_0         
		//*  66  142:getfield        #155 <Field int bitField0_>
		//*  67  145:iconst_1        
		//*  68  146:iand            
		//*  69  147:iconst_1        
		//*  70  148:icmpne          160
				GeneratedMessageV3.writeString(codedoutputstream, 3, leadingComments_);
		//   71  151:aload_1         
		//   72  152:iconst_3        
		//   73  153:aload_0         
		//   74  154:getfield        #84  <Field Object leadingComments_>
		//   75  157:invokestatic    #454 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
			if((bitField0_ & 2) == 2)
		//*  76  160:aload_0         
		//*  77  161:getfield        #155 <Field int bitField0_>
		//*  78  164:iconst_2        
		//*  79  165:iand            
		//*  80  166:iconst_2        
		//*  81  167:icmpne          179
				GeneratedMessageV3.writeString(codedoutputstream, 4, trailingComments_);
		//   82  170:aload_1         
		//   83  171:iconst_4        
		//   84  172:aload_0         
		//   85  173:getfield        #86  <Field Object trailingComments_>
		//   86  176:invokestatic    #454 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
			for(int k = 0; k < leadingDetachedComments_.size(); k++)
		//*  87  179:iconst_0        
		//*  88  180:istore_2        
		//*  89  181:iload_2         
		//*  90  182:aload_0         
		//*  91  183:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//*  92  186:invokeinterface #354 <Method int LazyStringList.size()>
		//*  93  191:icmpge          217
				GeneratedMessageV3.writeString(codedoutputstream, 6, leadingDetachedComments_.getRaw(k));
		//   94  194:aload_1         
		//   95  195:bipush          6
		//   96  197:aload_0         
		//   97  198:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//   98  201:iload_2         
		//   99  202:invokeinterface #382 <Method Object LazyStringList.getRaw(int)>
		//  100  207:invokestatic    #454 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>

		//  101  210:iload_2         
		//  102  211:iconst_1        
		//  103  212:iadd            
		//  104  213:istore_2        
		//* 105  214:goto            181
			unknownFields.writeTo(codedoutputstream);
		//  106  217:aload_0         
		//  107  218:getfield        #179 <Field UnknownFieldSet unknownFields>
		//  108  221:aload_1         
		//  109  222:invokevirtual   #456 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
		//  110  225:return          
		}

		private static final Location DEFAULT_INSTANCE = new Location();
		public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
		public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
		public static final Parser PARSER = new AbstractParser() {

			public Location parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return new Location(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
			//    0    0:new             #7   <Class DescriptorProtos$SourceCodeInfo$Location>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #25  <Method void DescriptorProtos$SourceCodeInfo$Location(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
			//    6   10:areturn         
			}

			public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method DescriptorProtos$SourceCodeInfo$Location parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
			//    4    6:areturn         
			}

		}
;
		public static final int PATH_FIELD_NUMBER = 1;
		public static final int SPAN_FIELD_NUMBER = 2;
		public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
		private static final long serialVersionUID = 0L;
		private int bitField0_;
		private volatile Object leadingComments_;
		private LazyStringList leadingDetachedComments_;
		private byte memoizedIsInitialized;
		private int pathMemoizedSerializedSize;
		private List path_;
		private int spanMemoizedSerializedSize;
		private List span_;
		private volatile Object trailingComments_;

		static 
		{
		//    0    0:new             #2   <Class DescriptorProtos$SourceCodeInfo$Location>
		//    1    3:dup             
		//    2    4:invokespecial   #57  <Method void DescriptorProtos$SourceCodeInfo$Location()>
		//    3    7:putstatic       #59  <Field DescriptorProtos$SourceCodeInfo$Location DEFAULT_INSTANCE>
		//    4   10:new             #14  <Class DescriptorProtos$SourceCodeInfo$Location$1>
		//    5   13:dup             
		//    6   14:invokespecial   #60  <Method void DescriptorProtos$SourceCodeInfo$Location$1()>
		//    7   17:putstatic       #62  <Field Parser PARSER>
		//*   8   20:return          
		}


/*
		static List access$27600(Location location)
		{
			return location.path_;
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field List path_>
		//    2    4:areturn         
		}

*/


/*
		static List access$27602(Location location, List list)
		{
			location.path_ = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #78  <Field List path_>
			return list;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static List access$27700(Location location)
		{
			return location.span_;
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field List span_>
		//    2    4:areturn         
		}

*/


/*
		static List access$27702(Location location, List list)
		{
			location.span_ = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #80  <Field List span_>
			return list;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Object access$27800(Location location)
		{
			return location.leadingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #84  <Field Object leadingComments_>
		//    2    4:areturn         
		}

*/


/*
		static Object access$27802(Location location, Object obj)
		{
			location.leadingComments_ = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #84  <Field Object leadingComments_>
			return obj;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Object access$27900(Location location)
		{
			return location.trailingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #86  <Field Object trailingComments_>
		//    2    4:areturn         
		}

*/


/*
		static Object access$27902(Location location, Object obj)
		{
			location.trailingComments_ = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #86  <Field Object trailingComments_>
			return obj;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static LazyStringList access$28000(Location location)
		{
			return location.leadingDetachedComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//    2    4:areturn         
		}

*/


/*
		static LazyStringList access$28002(Location location, LazyStringList lazystringlist)
		{
			location.leadingDetachedComments_ = lazystringlist;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #93  <Field LazyStringList leadingDetachedComments_>
			return lazystringlist;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static int access$28102(Location location, int i)
		{
			location.bitField0_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #155 <Field int bitField0_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/

		private Location()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #64  <Method void GeneratedMessageV3()>
			pathMemoizedSerializedSize = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #66  <Field int pathMemoizedSerializedSize>
			spanMemoizedSerializedSize = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #68  <Field int spanMemoizedSerializedSize>
			memoizedIsInitialized = -1;
		//    8   14:aload_0         
		//    9   15:iconst_m1       
		//   10   16:putfield        #70  <Field byte memoizedIsInitialized>
			path_ = Collections.emptyList();
		//   11   19:aload_0         
		//   12   20:invokestatic    #76  <Method List Collections.emptyList()>
		//   13   23:putfield        #78  <Field List path_>
			span_ = Collections.emptyList();
		//   14   26:aload_0         
		//   15   27:invokestatic    #76  <Method List Collections.emptyList()>
		//   16   30:putfield        #80  <Field List span_>
			leadingComments_ = "";
		//   17   33:aload_0         
		//   18   34:ldc1            #82  <String "">
		//   19   36:putfield        #84  <Field Object leadingComments_>
			trailingComments_ = "";
		//   20   39:aload_0         
		//   21   40:ldc1            #82  <String "">
		//   22   42:putfield        #86  <Field Object trailingComments_>
			leadingDetachedComments_ = LazyStringArrayList.EMPTY;
		//   23   45:aload_0         
		//   24   46:getstatic       #91  <Field LazyStringList LazyStringArrayList.EMPTY>
		//   25   49:putfield        #93  <Field LazyStringList leadingDetachedComments_>
		//   26   52:return          
		}

		private Location(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			int i;
			boolean flag;
			UnknownFieldSet.Builder builder;
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #57  <Method void DescriptorProtos$SourceCodeInfo$Location()>
			if(extensionregistrylite == null)
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       16
				throw new NullPointerException();
		//    4    8:new             #100 <Class NullPointerException>
		//    5   11:dup             
		//    6   12:invokespecial   #101 <Method void NullPointerException()>
		//    7   15:athrow          
			i = 0;
		//    8   16:iconst_0        
		//    9   17:istore_3        
			builder = UnknownFieldSet.newBuilder();
		//   10   18:invokestatic    #107 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
		//   11   21:astore          10
			flag = false;
		//   12   23:iconst_0        
		//   13   24:istore          8
_L22:
			int j;
			int k;
			int l;
			if(flag)
				break; /* Loop/switch isn't completed */
		//   14   26:iload           8
		//   15   28:ifne            774
			k = i;
		//   16   31:iload_3         
		//   17   32:istore          5
			l = i;
		//   18   34:iload_3         
		//   19   35:istore          6
			j = i;
		//   20   37:iload_3         
		//   21   38:istore          4
			int j1 = codedinputstream.readTag();
		//   22   40:aload_1         
		//   23   41:invokevirtual   #113 <Method int CodedInputStream.readTag()>
		//   24   44:istore          9
			j1;
		//   25   46:iload           9
			JVM INSTR lookupswitch 8: default 952
		//		               0: 955
		//		               8: 158
		//		               10: 225
		//		               16: 370
		//		               18: 437
		//		               26: 582
		//		               34: 637
		//		               50: 692;
		//   26   48:lookupswitch    8: default 952
		//		               0: 955
		//		               8: 158
		//		               10: 225
		//		               16: 370
		//		               18: 437
		//		               26: 582
		//		               34: 637
		//		               50: 692
			   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
			int i1;
			i1 = i;
		//   27  124:iload_3         
		//   28  125:istore          7
			k = i;
		//   29  127:iload_3         
		//   30  128:istore          5
			l = i;
		//   31  130:iload_3         
		//   32  131:istore          6
			j = i;
		//   33  133:iload_3         
		//   34  134:istore          4
			if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, j1))
		//*  35  136:aload_0         
		//*  36  137:aload_1         
		//*  37  138:aload           10
		//*  38  140:aload_2         
		//*  39  141:iload           9
		//*  40  143:invokevirtual   #117 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
		//*  41  146:ifne            768
			{
				flag = true;
		//   42  149:iconst_1        
		//   43  150:istore          8
				i1 = i;
		//   44  152:iload_3         
		//   45  153:istore          7
			}
			  goto _L10
		//*  46  155:goto            768
_L3:
			i1 = i;
		//   47  158:iload_3         
		//   48  159:istore          7
			if((i & 1) == 1) goto _L12; else goto _L11
		//   49  161:iload_3         
		//   50  162:iconst_1        
		//   51  163:iand            
		//   52  164:iconst_1        
		//   53  165:icmpeq          193
_L11:
			k = i;
		//   54  168:iload_3         
		//   55  169:istore          5
			l = i;
		//   56  171:iload_3         
		//   57  172:istore          6
			j = i;
		//   58  174:iload_3         
		//   59  175:istore          4
			path_ = ((List) (new ArrayList()));
		//   60  177:aload_0         
		//   61  178:new             #119 <Class ArrayList>
		//   62  181:dup             
		//   63  182:invokespecial   #120 <Method void ArrayList()>
		//   64  185:putfield        #78  <Field List path_>
			i1 = i | 1;
		//   65  188:iload_3         
		//   66  189:iconst_1        
		//   67  190:ior             
		//   68  191:istore          7
_L12:
			k = i1;
		//   69  193:iload           7
		//   70  195:istore          5
			l = i1;
		//   71  197:iload           7
		//   72  199:istore          6
			j = i1;
		//   73  201:iload           7
		//   74  203:istore          4
			path_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
		//   75  205:aload_0         
		//   76  206:getfield        #78  <Field List path_>
		//   77  209:aload_1         
		//   78  210:invokevirtual   #123 <Method int CodedInputStream.readInt32()>
		//   79  213:invokestatic    #129 <Method Integer Integer.valueOf(int)>
		//   80  216:invokeinterface #135 <Method boolean List.add(Object)>
		//   81  221:pop             
			  goto _L10
		//*  82  222:goto            768
_L4:
			k = i;
		//   83  225:iload_3         
		//   84  226:istore          5
			l = i;
		//   85  228:iload_3         
		//   86  229:istore          6
			j = i;
		//   87  231:iload_3         
		//   88  232:istore          4
			j1 = codedinputstream.pushLimit(codedinputstream.readRawVarint32());
		//   89  234:aload_1         
		//   90  235:aload_1         
		//   91  236:invokevirtual   #138 <Method int CodedInputStream.readRawVarint32()>
		//   92  239:invokevirtual   #142 <Method int CodedInputStream.pushLimit(int)>
		//   93  242:istore          9
			i1 = i;
		//   94  244:iload_3         
		//   95  245:istore          7
			if((i & 1) == 1)
				break MISSING_BLOCK_LABEL_298;
		//   96  247:iload_3         
		//   97  248:iconst_1        
		//   98  249:iand            
		//   99  250:iconst_1        
		//  100  251:icmpeq          298
			i1 = i;
		//  101  254:iload_3         
		//  102  255:istore          7
			k = i;
		//  103  257:iload_3         
		//  104  258:istore          5
			l = i;
		//  105  260:iload_3         
		//  106  261:istore          6
			j = i;
		//  107  263:iload_3         
		//  108  264:istore          4
			if(codedinputstream.getBytesUntilLimit() <= 0)
				break MISSING_BLOCK_LABEL_298;
		//  109  266:aload_1         
		//  110  267:invokevirtual   #145 <Method int CodedInputStream.getBytesUntilLimit()>
		//  111  270:ifle            298
			k = i;
		//  112  273:iload_3         
		//  113  274:istore          5
			l = i;
		//  114  276:iload_3         
		//  115  277:istore          6
			j = i;
		//  116  279:iload_3         
		//  117  280:istore          4
			path_ = ((List) (new ArrayList()));
		//  118  282:aload_0         
		//  119  283:new             #119 <Class ArrayList>
		//  120  286:dup             
		//  121  287:invokespecial   #120 <Method void ArrayList()>
		//  122  290:putfield        #78  <Field List path_>
			i1 = i | 1;
		//  123  293:iload_3         
		//  124  294:iconst_1        
		//  125  295:ior             
		//  126  296:istore          7
_L14:
			k = i1;
		//  127  298:iload           7
		//  128  300:istore          5
			l = i1;
		//  129  302:iload           7
		//  130  304:istore          6
			j = i1;
		//  131  306:iload           7
		//  132  308:istore          4
			if(codedinputstream.getBytesUntilLimit() <= 0)
				break; /* Loop/switch isn't completed */
		//  133  310:aload_1         
		//  134  311:invokevirtual   #145 <Method int CodedInputStream.getBytesUntilLimit()>
		//  135  314:ifle            349
			k = i1;
		//  136  317:iload           7
		//  137  319:istore          5
			l = i1;
		//  138  321:iload           7
		//  139  323:istore          6
			j = i1;
		//  140  325:iload           7
		//  141  327:istore          4
			path_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
		//  142  329:aload_0         
		//  143  330:getfield        #78  <Field List path_>
		//  144  333:aload_1         
		//  145  334:invokevirtual   #123 <Method int CodedInputStream.readInt32()>
		//  146  337:invokestatic    #129 <Method Integer Integer.valueOf(int)>
		//  147  340:invokeinterface #135 <Method boolean List.add(Object)>
		//  148  345:pop             
			if(true) goto _L14; else goto _L13
		//  149  346:goto            298
_L13:
			k = i1;
		//  150  349:iload           7
		//  151  351:istore          5
			l = i1;
		//  152  353:iload           7
		//  153  355:istore          6
			j = i1;
		//  154  357:iload           7
		//  155  359:istore          4
			codedinputstream.popLimit(j1);
		//  156  361:aload_1         
		//  157  362:iload           9
		//  158  364:invokevirtual   #149 <Method void CodedInputStream.popLimit(int)>
			  goto _L10
		//* 159  367:goto            768
_L5:
			i1 = i;
		//  160  370:iload_3         
		//  161  371:istore          7
			if((i & 2) == 2) goto _L16; else goto _L15
		//  162  373:iload_3         
		//  163  374:iconst_2        
		//  164  375:iand            
		//  165  376:iconst_2        
		//  166  377:icmpeq          405
_L15:
			k = i;
		//  167  380:iload_3         
		//  168  381:istore          5
			l = i;
		//  169  383:iload_3         
		//  170  384:istore          6
			j = i;
		//  171  386:iload_3         
		//  172  387:istore          4
			span_ = ((List) (new ArrayList()));
		//  173  389:aload_0         
		//  174  390:new             #119 <Class ArrayList>
		//  175  393:dup             
		//  176  394:invokespecial   #120 <Method void ArrayList()>
		//  177  397:putfield        #80  <Field List span_>
			i1 = i | 2;
		//  178  400:iload_3         
		//  179  401:iconst_2        
		//  180  402:ior             
		//  181  403:istore          7
_L16:
			k = i1;
		//  182  405:iload           7
		//  183  407:istore          5
			l = i1;
		//  184  409:iload           7
		//  185  411:istore          6
			j = i1;
		//  186  413:iload           7
		//  187  415:istore          4
			span_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
		//  188  417:aload_0         
		//  189  418:getfield        #80  <Field List span_>
		//  190  421:aload_1         
		//  191  422:invokevirtual   #123 <Method int CodedInputStream.readInt32()>
		//  192  425:invokestatic    #129 <Method Integer Integer.valueOf(int)>
		//  193  428:invokeinterface #135 <Method boolean List.add(Object)>
		//  194  433:pop             
			  goto _L10
		//* 195  434:goto            768
_L6:
			k = i;
		//  196  437:iload_3         
		//  197  438:istore          5
			l = i;
		//  198  440:iload_3         
		//  199  441:istore          6
			j = i;
		//  200  443:iload_3         
		//  201  444:istore          4
			j1 = codedinputstream.pushLimit(codedinputstream.readRawVarint32());
		//  202  446:aload_1         
		//  203  447:aload_1         
		//  204  448:invokevirtual   #138 <Method int CodedInputStream.readRawVarint32()>
		//  205  451:invokevirtual   #142 <Method int CodedInputStream.pushLimit(int)>
		//  206  454:istore          9
			i1 = i;
		//  207  456:iload_3         
		//  208  457:istore          7
			if((i & 2) == 2)
				break MISSING_BLOCK_LABEL_510;
		//  209  459:iload_3         
		//  210  460:iconst_2        
		//  211  461:iand            
		//  212  462:iconst_2        
		//  213  463:icmpeq          510
			i1 = i;
		//  214  466:iload_3         
		//  215  467:istore          7
			k = i;
		//  216  469:iload_3         
		//  217  470:istore          5
			l = i;
		//  218  472:iload_3         
		//  219  473:istore          6
			j = i;
		//  220  475:iload_3         
		//  221  476:istore          4
			if(codedinputstream.getBytesUntilLimit() <= 0)
				break MISSING_BLOCK_LABEL_510;
		//  222  478:aload_1         
		//  223  479:invokevirtual   #145 <Method int CodedInputStream.getBytesUntilLimit()>
		//  224  482:ifle            510
			k = i;
		//  225  485:iload_3         
		//  226  486:istore          5
			l = i;
		//  227  488:iload_3         
		//  228  489:istore          6
			j = i;
		//  229  491:iload_3         
		//  230  492:istore          4
			span_ = ((List) (new ArrayList()));
		//  231  494:aload_0         
		//  232  495:new             #119 <Class ArrayList>
		//  233  498:dup             
		//  234  499:invokespecial   #120 <Method void ArrayList()>
		//  235  502:putfield        #80  <Field List span_>
			i1 = i | 2;
		//  236  505:iload_3         
		//  237  506:iconst_2        
		//  238  507:ior             
		//  239  508:istore          7
_L18:
			k = i1;
		//  240  510:iload           7
		//  241  512:istore          5
			l = i1;
		//  242  514:iload           7
		//  243  516:istore          6
			j = i1;
		//  244  518:iload           7
		//  245  520:istore          4
			if(codedinputstream.getBytesUntilLimit() <= 0)
				break; /* Loop/switch isn't completed */
		//  246  522:aload_1         
		//  247  523:invokevirtual   #145 <Method int CodedInputStream.getBytesUntilLimit()>
		//  248  526:ifle            561
			k = i1;
		//  249  529:iload           7
		//  250  531:istore          5
			l = i1;
		//  251  533:iload           7
		//  252  535:istore          6
			j = i1;
		//  253  537:iload           7
		//  254  539:istore          4
			span_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
		//  255  541:aload_0         
		//  256  542:getfield        #80  <Field List span_>
		//  257  545:aload_1         
		//  258  546:invokevirtual   #123 <Method int CodedInputStream.readInt32()>
		//  259  549:invokestatic    #129 <Method Integer Integer.valueOf(int)>
		//  260  552:invokeinterface #135 <Method boolean List.add(Object)>
		//  261  557:pop             
			if(true) goto _L18; else goto _L17
		//  262  558:goto            510
_L17:
			k = i1;
		//  263  561:iload           7
		//  264  563:istore          5
			l = i1;
		//  265  565:iload           7
		//  266  567:istore          6
			j = i1;
		//  267  569:iload           7
		//  268  571:istore          4
			codedinputstream.popLimit(j1);
		//  269  573:aload_1         
		//  270  574:iload           9
		//  271  576:invokevirtual   #149 <Method void CodedInputStream.popLimit(int)>
			  goto _L10
		//* 272  579:goto            768
_L7:
			k = i;
		//  273  582:iload_3         
		//  274  583:istore          5
			l = i;
		//  275  585:iload_3         
		//  276  586:istore          6
			j = i;
		//  277  588:iload_3         
		//  278  589:istore          4
			ByteString bytestring = codedinputstream.readBytes();
		//  279  591:aload_1         
		//  280  592:invokevirtual   #153 <Method ByteString CodedInputStream.readBytes()>
		//  281  595:astore          11
			k = i;
		//  282  597:iload_3         
		//  283  598:istore          5
			l = i;
		//  284  600:iload_3         
		//  285  601:istore          6
			j = i;
		//  286  603:iload_3         
		//  287  604:istore          4
			bitField0_ = bitField0_ | 1;
		//  288  606:aload_0         
		//  289  607:aload_0         
		//  290  608:getfield        #155 <Field int bitField0_>
		//  291  611:iconst_1        
		//  292  612:ior             
		//  293  613:putfield        #155 <Field int bitField0_>
			k = i;
		//  294  616:iload_3         
		//  295  617:istore          5
			l = i;
		//  296  619:iload_3         
		//  297  620:istore          6
			j = i;
		//  298  622:iload_3         
		//  299  623:istore          4
			leadingComments_ = ((Object) (bytestring));
		//  300  625:aload_0         
		//  301  626:aload           11
		//  302  628:putfield        #84  <Field Object leadingComments_>
			i1 = i;
		//  303  631:iload_3         
		//  304  632:istore          7
			  goto _L10
		//* 305  634:goto            768
_L8:
			k = i;
		//  306  637:iload_3         
		//  307  638:istore          5
			l = i;
		//  308  640:iload_3         
		//  309  641:istore          6
			j = i;
		//  310  643:iload_3         
		//  311  644:istore          4
			bytestring = codedinputstream.readBytes();
		//  312  646:aload_1         
		//  313  647:invokevirtual   #153 <Method ByteString CodedInputStream.readBytes()>
		//  314  650:astore          11
			k = i;
		//  315  652:iload_3         
		//  316  653:istore          5
			l = i;
		//  317  655:iload_3         
		//  318  656:istore          6
			j = i;
		//  319  658:iload_3         
		//  320  659:istore          4
			bitField0_ = bitField0_ | 2;
		//  321  661:aload_0         
		//  322  662:aload_0         
		//  323  663:getfield        #155 <Field int bitField0_>
		//  324  666:iconst_2        
		//  325  667:ior             
		//  326  668:putfield        #155 <Field int bitField0_>
			k = i;
		//  327  671:iload_3         
		//  328  672:istore          5
			l = i;
		//  329  674:iload_3         
		//  330  675:istore          6
			j = i;
		//  331  677:iload_3         
		//  332  678:istore          4
			trailingComments_ = ((Object) (bytestring));
		//  333  680:aload_0         
		//  334  681:aload           11
		//  335  683:putfield        #86  <Field Object trailingComments_>
			i1 = i;
		//  336  686:iload_3         
		//  337  687:istore          7
			  goto _L10
		//* 338  689:goto            768
_L9:
			k = i;
		//  339  692:iload_3         
		//  340  693:istore          5
			l = i;
		//  341  695:iload_3         
		//  342  696:istore          6
			j = i;
		//  343  698:iload_3         
		//  344  699:istore          4
			bytestring = codedinputstream.readBytes();
		//  345  701:aload_1         
		//  346  702:invokevirtual   #153 <Method ByteString CodedInputStream.readBytes()>
		//  347  705:astore          11
			i1 = i;
		//  348  707:iload_3         
		//  349  708:istore          7
			if((i & 0x10) == 16) goto _L20; else goto _L19
		//  350  710:iload_3         
		//  351  711:bipush          16
		//  352  713:iand            
		//  353  714:bipush          16
		//  354  716:icmpeq          745
_L19:
			k = i;
		//  355  719:iload_3         
		//  356  720:istore          5
			l = i;
		//  357  722:iload_3         
		//  358  723:istore          6
			j = i;
		//  359  725:iload_3         
		//  360  726:istore          4
			leadingDetachedComments_ = ((LazyStringList) (new LazyStringArrayList()));
		//  361  728:aload_0         
		//  362  729:new             #88  <Class LazyStringArrayList>
		//  363  732:dup             
		//  364  733:invokespecial   #156 <Method void LazyStringArrayList()>
		//  365  736:putfield        #93  <Field LazyStringList leadingDetachedComments_>
			i1 = i | 0x10;
		//  366  739:iload_3         
		//  367  740:bipush          16
		//  368  742:ior             
		//  369  743:istore          7
_L20:
			k = i1;
		//  370  745:iload           7
		//  371  747:istore          5
			l = i1;
		//  372  749:iload           7
		//  373  751:istore          6
			j = i1;
		//  374  753:iload           7
		//  375  755:istore          4
			leadingDetachedComments_.add(bytestring);
		//  376  757:aload_0         
		//  377  758:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//  378  761:aload           11
		//  379  763:invokeinterface #161 <Method void LazyStringList.add(ByteString)>
_L10:
			i = i1;
		//  380  768:iload           7
		//  381  770:istore_3        
			if(true) goto _L22; else goto _L21
		//  382  771:goto            26
_L21:
			if((i & 1) == 1)
		//* 383  774:iload_3         
		//* 384  775:iconst_1        
		//* 385  776:iand            
		//* 386  777:iconst_1        
		//* 387  778:icmpne          792
				path_ = Collections.unmodifiableList(path_);
		//  388  781:aload_0         
		//  389  782:aload_0         
		//  390  783:getfield        #78  <Field List path_>
		//  391  786:invokestatic    #165 <Method List Collections.unmodifiableList(List)>
		//  392  789:putfield        #78  <Field List path_>
			if((i & 2) == 2)
		//* 393  792:iload_3         
		//* 394  793:iconst_2        
		//* 395  794:iand            
		//* 396  795:iconst_2        
		//* 397  796:icmpne          810
				span_ = Collections.unmodifiableList(span_);
		//  398  799:aload_0         
		//  399  800:aload_0         
		//  400  801:getfield        #80  <Field List span_>
		//  401  804:invokestatic    #165 <Method List Collections.unmodifiableList(List)>
		//  402  807:putfield        #80  <Field List span_>
			if((i & 0x10) == 16)
		//* 403  810:iload_3         
		//* 404  811:bipush          16
		//* 405  813:iand            
		//* 406  814:bipush          16
		//* 407  816:icmpne          832
				leadingDetachedComments_ = leadingDetachedComments_.getUnmodifiableView();
		//  408  819:aload_0         
		//  409  820:aload_0         
		//  410  821:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//  411  824:invokeinterface #169 <Method LazyStringList LazyStringList.getUnmodifiableView()>
		//  412  829:putfield        #93  <Field LazyStringList leadingDetachedComments_>
			unknownFields = builder.build();
		//  413  832:aload_0         
		//  414  833:aload           10
		//  415  835:invokevirtual   #175 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//  416  838:putfield        #179 <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//  417  841:aload_0         
		//  418  842:invokevirtual   #182 <Method void makeExtensionsImmutable()>
			return;
		//  419  845:return          
			codedinputstream;
		//  420  846:astore_1        
			j = k;
		//  421  847:iload           5
		//  422  849:istore          4
			throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
		//  423  851:aload_1         
		//  424  852:aload_0         
		//  425  853:invokevirtual   #186 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//  426  856:athrow          
			codedinputstream;
		//  427  857:astore_1        
			j = l;
		//  428  858:iload           6
		//  429  860:istore          4
			throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
		//  430  862:new             #96  <Class InvalidProtocolBufferException>
		//  431  865:dup             
		//  432  866:aload_1         
		//  433  867:invokespecial   #189 <Method void InvalidProtocolBufferException(IOException)>
		//  434  870:aload_0         
		//  435  871:invokevirtual   #186 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//  436  874:athrow          
			codedinputstream;
		//  437  875:astore_1        
			if((j & 1) == 1)
		//* 438  876:iload           4
		//* 439  878:iconst_1        
		//* 440  879:iand            
		//* 441  880:iconst_1        
		//* 442  881:icmpne          895
				path_ = Collections.unmodifiableList(path_);
		//  443  884:aload_0         
		//  444  885:aload_0         
		//  445  886:getfield        #78  <Field List path_>
		//  446  889:invokestatic    #165 <Method List Collections.unmodifiableList(List)>
		//  447  892:putfield        #78  <Field List path_>
			if((j & 2) == 2)
		//* 448  895:iload           4
		//* 449  897:iconst_2        
		//* 450  898:iand            
		//* 451  899:iconst_2        
		//* 452  900:icmpne          914
				span_ = Collections.unmodifiableList(span_);
		//  453  903:aload_0         
		//  454  904:aload_0         
		//  455  905:getfield        #80  <Field List span_>
		//  456  908:invokestatic    #165 <Method List Collections.unmodifiableList(List)>
		//  457  911:putfield        #80  <Field List span_>
			if((j & 0x10) == 16)
		//* 458  914:iload           4
		//* 459  916:bipush          16
		//* 460  918:iand            
		//* 461  919:bipush          16
		//* 462  921:icmpne          937
				leadingDetachedComments_ = leadingDetachedComments_.getUnmodifiableView();
		//  463  924:aload_0         
		//  464  925:aload_0         
		//  465  926:getfield        #93  <Field LazyStringList leadingDetachedComments_>
		//  466  929:invokeinterface #169 <Method LazyStringList LazyStringList.getUnmodifiableView()>
		//  467  934:putfield        #93  <Field LazyStringList leadingDetachedComments_>
			unknownFields = builder.build();
		//  468  937:aload_0         
		//  469  938:aload           10
		//  470  940:invokevirtual   #175 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//  471  943:putfield        #179 <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//  472  946:aload_0         
		//  473  947:invokevirtual   #182 <Method void makeExtensionsImmutable()>
			throw codedinputstream;
		//  474  950:aload_1         
		//  475  951:athrow          
		//* 476  952:goto            124
_L2:
			flag = true;
		//  477  955:iconst_1        
		//  478  956:istore          8
			i1 = i;
		//  479  958:iload_3         
		//  480  959:istore          7
			  goto _L10
		//* 481  961:goto            768
		}

		Location(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
			throws InvalidProtocolBufferException
		{
			this(codedinputstream, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #193 <Method void DescriptorProtos$SourceCodeInfo$Location(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:return          
		}

		private Location(GeneratedMessageV3.Builder builder)
		{
			super(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #196 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
			pathMemoizedSerializedSize = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #66  <Field int pathMemoizedSerializedSize>
			spanMemoizedSerializedSize = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #68  <Field int spanMemoizedSerializedSize>
			memoizedIsInitialized = -1;
		//    9   15:aload_0         
		//   10   16:iconst_m1       
		//   11   17:putfield        #70  <Field byte memoizedIsInitialized>
		//   12   20:return          
		}

		Location(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
		{
			this(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #200 <Method void DescriptorProtos$SourceCodeInfo$Location(GeneratedMessageV3$Builder)>
		//    3    5:return          
		}
	}

	public static final class Location.Builder extends GeneratedMessageV3.Builder
		implements LocationOrBuilder
	{

		private void ensureLeadingDetachedCommentsIsMutable()
		{
			if((bitField0_ & 0x10) != 16)
		//*   0    0:aload_0         
		//*   1    1:getfield        #68  <Field int bitField0_>
		//*   2    4:bipush          16
		//*   3    6:iand            
		//*   4    7:bipush          16
		//*   5    9:icmpeq          38
			{
				leadingDetachedComments_ = ((LazyStringList) (new LazyStringArrayList(leadingDetachedComments_)));
		//    6   12:aload_0         
		//    7   13:new             #49  <Class LazyStringArrayList>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//   11   21:invokespecial   #71  <Method void LazyStringArrayList(LazyStringList)>
		//   12   24:putfield        #54  <Field LazyStringList leadingDetachedComments_>
				bitField0_ = bitField0_ | 0x10;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #68  <Field int bitField0_>
		//   16   32:bipush          16
		//   17   34:ior             
		//   18   35:putfield        #68  <Field int bitField0_>
			}
		//   19   38:return          
		}

		private void ensurePathIsMutable()
		{
			if((bitField0_ & 1) != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #68  <Field int bitField0_>
		//*   2    4:iconst_1        
		//*   3    5:iand            
		//*   4    6:iconst_1        
		//*   5    7:icmpeq          35
			{
				path_ = ((List) (new ArrayList(((java.util.Collection) (path_)))));
		//    6   10:aload_0         
		//    7   11:new             #74  <Class ArrayList>
		//    8   14:dup             
		//    9   15:aload_0         
		//   10   16:getfield        #39  <Field List path_>
		//   11   19:invokespecial   #77  <Method void ArrayList(java.util.Collection)>
		//   12   22:putfield        #39  <Field List path_>
				bitField0_ = bitField0_ | 1;
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:getfield        #68  <Field int bitField0_>
		//   16   30:iconst_1        
		//   17   31:ior             
		//   18   32:putfield        #68  <Field int bitField0_>
			}
		//   19   35:return          
		}

		private void ensureSpanIsMutable()
		{
			if((bitField0_ & 2) != 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #68  <Field int bitField0_>
		//*   2    4:iconst_2        
		//*   3    5:iand            
		//*   4    6:iconst_2        
		//*   5    7:icmpeq          35
			{
				span_ = ((List) (new ArrayList(((java.util.Collection) (span_)))));
		//    6   10:aload_0         
		//    7   11:new             #74  <Class ArrayList>
		//    8   14:dup             
		//    9   15:aload_0         
		//   10   16:getfield        #41  <Field List span_>
		//   11   19:invokespecial   #77  <Method void ArrayList(java.util.Collection)>
		//   12   22:putfield        #41  <Field List span_>
				bitField0_ = bitField0_ | 2;
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:getfield        #68  <Field int bitField0_>
		//   16   30:iconst_2        
		//   17   31:ior             
		//   18   32:putfield        #68  <Field int bitField0_>
			}
		//   19   35:return          
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$27100();
		//    0    0:invokestatic    #83  <Method Descriptors$Descriptor DescriptorProtos.access$27100()>
		//    1    3:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
		//    0    0:getstatic       #89  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//    1    3:istore_1        
		//    2    4:return          
		}

		public Location.Builder addAllLeadingDetachedComments(Iterable iterable)
		{
			ensureLeadingDetachedCommentsIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #93  <Method void ensureLeadingDetachedCommentsIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, ((List) (leadingDetachedComments_)));
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//    5    9:invokestatic    #99  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #102 <Method void onChanged()>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Location.Builder addAllPath(Iterable iterable)
		{
			ensurePathIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #107 <Method void ensurePathIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, path_);
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #39  <Field List path_>
		//    5    9:invokestatic    #99  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #102 <Method void onChanged()>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Location.Builder addAllSpan(Iterable iterable)
		{
			ensureSpanIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #111 <Method void ensureSpanIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, span_);
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #41  <Field List span_>
		//    5    9:invokestatic    #99  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #102 <Method void onChanged()>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Location.Builder addLeadingDetachedComments(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #115 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #116 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				ensureLeadingDetachedCommentsIsMutable();
		//    6   12:aload_0         
		//    7   13:invokespecial   #93  <Method void ensureLeadingDetachedCommentsIsMutable()>
				leadingDetachedComments_.add(((Object) (s)));
		//    8   16:aload_0         
		//    9   17:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//   10   20:aload_1         
		//   11   21:invokeinterface #122 <Method boolean LazyStringList.add(Object)>
		//   12   26:pop             
				onChanged();
		//   13   27:aload_0         
		//   14   28:invokevirtual   #102 <Method void onChanged()>
				return this;
		//   15   31:aload_0         
		//   16   32:areturn         
			}
		}

		public Location.Builder addLeadingDetachedCommentsBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #115 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #116 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				ensureLeadingDetachedCommentsIsMutable();
		//    6   12:aload_0         
		//    7   13:invokespecial   #93  <Method void ensureLeadingDetachedCommentsIsMutable()>
				leadingDetachedComments_.add(bytestring);
		//    8   16:aload_0         
		//    9   17:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//   10   20:aload_1         
		//   11   21:invokeinterface #127 <Method void LazyStringList.add(ByteString)>
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #102 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			}
		}

		public Location.Builder addPath(int i)
		{
			ensurePathIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #107 <Method void ensurePathIsMutable()>
			path_.add(((Object) (Integer.valueOf(i))));
		//    2    4:aload_0         
		//    3    5:getfield        #39  <Field List path_>
		//    4    8:iload_1         
		//    5    9:invokestatic    #135 <Method Integer Integer.valueOf(int)>
		//    6   12:invokeinterface #138 <Method boolean List.add(Object)>
		//    7   17:pop             
			onChanged();
		//    8   18:aload_0         
		//    9   19:invokevirtual   #102 <Method void onChanged()>
			return this;
		//   10   22:aload_0         
		//   11   23:areturn         
		}

		public Location.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Location.Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #143 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #145 <Method DescriptorProtos$SourceCodeInfo$Location$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #145 <Method DescriptorProtos$SourceCodeInfo$Location$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Location.Builder addSpan(int i)
		{
			ensureSpanIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #111 <Method void ensureSpanIsMutable()>
			span_.add(((Object) (Integer.valueOf(i))));
		//    2    4:aload_0         
		//    3    5:getfield        #41  <Field List span_>
		//    4    8:iload_1         
		//    5    9:invokestatic    #135 <Method Integer Integer.valueOf(int)>
		//    6   12:invokeinterface #138 <Method boolean List.add(Object)>
		//    7   17:pop             
			onChanged();
		//    8   18:aload_0         
		//    9   19:invokevirtual   #102 <Method void onChanged()>
			return this;
		//   10   22:aload_0         
		//   11   23:areturn         
		}

		public Location build()
		{
			Location location = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #152 <Method DescriptorProtos$SourceCodeInfo$Location buildPartial()>
		//    2    4:astore_1        
			if(!location.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #156 <Method boolean DescriptorProtos$SourceCodeInfo$Location.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (location)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #160 <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return location;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #163 <Method DescriptorProtos$SourceCodeInfo$Location build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #163 <Method DescriptorProtos$SourceCodeInfo$Location build()>
		//    2    4:areturn         
		}

		public Location buildPartial()
		{
			Location location = new Location(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #14  <Class DescriptorProtos$SourceCodeInfo$Location>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #167 <Method void DescriptorProtos$SourceCodeInfo$Location(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #68  <Field int bitField0_>
		//    8   15:istore_3        
			int i = 0;
		//    9   16:iconst_0        
		//   10   17:istore_1        
			if((bitField0_ & 1) == 1)
		//*  11   18:aload_0         
		//*  12   19:getfield        #68  <Field int bitField0_>
		//*  13   22:iconst_1        
		//*  14   23:iand            
		//*  15   24:iconst_1        
		//*  16   25:icmpne          50
			{
				path_ = Collections.unmodifiableList(path_);
		//   17   28:aload_0         
		//   18   29:aload_0         
		//   19   30:getfield        #39  <Field List path_>
		//   20   33:invokestatic    #171 <Method List Collections.unmodifiableList(List)>
		//   21   36:putfield        #39  <Field List path_>
				bitField0_ = bitField0_ & -2;
		//   22   39:aload_0         
		//   23   40:aload_0         
		//   24   41:getfield        #68  <Field int bitField0_>
		//   25   44:bipush          -2
		//   26   46:iand            
		//   27   47:putfield        #68  <Field int bitField0_>
			}
			location.path_ = path_;
		//   28   50:aload           4
		//   29   52:aload_0         
		//   30   53:getfield        #39  <Field List path_>
		//   31   56:invokestatic    #175 <Method List DescriptorProtos$SourceCodeInfo$Location.access$27602(DescriptorProtos$SourceCodeInfo$Location, List)>
		//   32   59:pop             
			if((bitField0_ & 2) == 2)
		//*  33   60:aload_0         
		//*  34   61:getfield        #68  <Field int bitField0_>
		//*  35   64:iconst_2        
		//*  36   65:iand            
		//*  37   66:iconst_2        
		//*  38   67:icmpne          92
			{
				span_ = Collections.unmodifiableList(span_);
		//   39   70:aload_0         
		//   40   71:aload_0         
		//   41   72:getfield        #41  <Field List span_>
		//   42   75:invokestatic    #171 <Method List Collections.unmodifiableList(List)>
		//   43   78:putfield        #41  <Field List span_>
				bitField0_ = bitField0_ & -3;
		//   44   81:aload_0         
		//   45   82:aload_0         
		//   46   83:getfield        #68  <Field int bitField0_>
		//   47   86:bipush          -3
		//   48   88:iand            
		//   49   89:putfield        #68  <Field int bitField0_>
			}
			location.span_ = span_;
		//   50   92:aload           4
		//   51   94:aload_0         
		//   52   95:getfield        #41  <Field List span_>
		//   53   98:invokestatic    #178 <Method List DescriptorProtos$SourceCodeInfo$Location.access$27702(DescriptorProtos$SourceCodeInfo$Location, List)>
		//   54  101:pop             
			if((k & 4) == 4)
		//*  55  102:iload_3         
		//*  56  103:iconst_4        
		//*  57  104:iand            
		//*  58  105:iconst_4        
		//*  59  106:icmpne          111
				i = 1;
		//   60  109:iconst_1        
		//   61  110:istore_1        
			location.leadingComments_ = leadingComments_;
		//   62  111:aload           4
		//   63  113:aload_0         
		//   64  114:getfield        #45  <Field Object leadingComments_>
		//   65  117:invokestatic    #182 <Method Object DescriptorProtos$SourceCodeInfo$Location.access$27802(DescriptorProtos$SourceCodeInfo$Location, Object)>
		//   66  120:pop             
			int j = i;
		//   67  121:iload_1         
		//   68  122:istore_2        
			if((k & 8) == 8)
		//*  69  123:iload_3         
		//*  70  124:bipush          8
		//*  71  126:iand            
		//*  72  127:bipush          8
		//*  73  129:icmpne          136
				j = i | 2;
		//   74  132:iload_1         
		//   75  133:iconst_2        
		//   76  134:ior             
		//   77  135:istore_2        
			location.trailingComments_ = trailingComments_;
		//   78  136:aload           4
		//   79  138:aload_0         
		//   80  139:getfield        #47  <Field Object trailingComments_>
		//   81  142:invokestatic    #185 <Method Object DescriptorProtos$SourceCodeInfo$Location.access$27902(DescriptorProtos$SourceCodeInfo$Location, Object)>
		//   82  145:pop             
			if((bitField0_ & 0x10) == 16)
		//*  83  146:aload_0         
		//*  84  147:getfield        #68  <Field int bitField0_>
		//*  85  150:bipush          16
		//*  86  152:iand            
		//*  87  153:bipush          16
		//*  88  155:icmpne          182
			{
				leadingDetachedComments_ = leadingDetachedComments_.getUnmodifiableView();
		//   89  158:aload_0         
		//   90  159:aload_0         
		//   91  160:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//   92  163:invokeinterface #189 <Method LazyStringList LazyStringList.getUnmodifiableView()>
		//   93  168:putfield        #54  <Field LazyStringList leadingDetachedComments_>
				bitField0_ = bitField0_ & 0xffffffef;
		//   94  171:aload_0         
		//   95  172:aload_0         
		//   96  173:getfield        #68  <Field int bitField0_>
		//   97  176:bipush          -17
		//   98  178:iand            
		//   99  179:putfield        #68  <Field int bitField0_>
			}
			location.leadingDetachedComments_ = leadingDetachedComments_;
		//  100  182:aload           4
		//  101  184:aload_0         
		//  102  185:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//  103  188:invokestatic    #193 <Method LazyStringList DescriptorProtos$SourceCodeInfo$Location.access$28002(DescriptorProtos$SourceCodeInfo$Location, LazyStringList)>
		//  104  191:pop             
			location.bitField0_ = j;
		//  105  192:aload           4
		//  106  194:iload_2         
		//  107  195:invokestatic    #197 <Method int DescriptorProtos$SourceCodeInfo$Location.access$28102(DescriptorProtos$SourceCodeInfo$Location, int)>
		//  108  198:pop             
			onBuilt();
		//  109  199:aload_0         
		//  110  200:invokevirtual   #200 <Method void onBuilt()>
			return location;
		//  111  203:aload           4
		//  112  205:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #152 <Method DescriptorProtos$SourceCodeInfo$Location buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #152 <Method DescriptorProtos$SourceCodeInfo$Location buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #205 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clear()>
		//    2    4:areturn         
		}

		public Location.Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #208 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			path_ = Collections.emptyList();
		//    3    5:aload_0         
		//    4    6:invokestatic    #37  <Method List Collections.emptyList()>
		//    5    9:putfield        #39  <Field List path_>
			bitField0_ = bitField0_ & -2;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #68  <Field int bitField0_>
		//    9   17:bipush          -2
		//   10   19:iand            
		//   11   20:putfield        #68  <Field int bitField0_>
			span_ = Collections.emptyList();
		//   12   23:aload_0         
		//   13   24:invokestatic    #37  <Method List Collections.emptyList()>
		//   14   27:putfield        #41  <Field List span_>
			bitField0_ = bitField0_ & -3;
		//   15   30:aload_0         
		//   16   31:aload_0         
		//   17   32:getfield        #68  <Field int bitField0_>
		//   18   35:bipush          -3
		//   19   37:iand            
		//   20   38:putfield        #68  <Field int bitField0_>
			leadingComments_ = "";
		//   21   41:aload_0         
		//   22   42:ldc1            #43  <String "">
		//   23   44:putfield        #45  <Field Object leadingComments_>
			bitField0_ = bitField0_ & -5;
		//   24   47:aload_0         
		//   25   48:aload_0         
		//   26   49:getfield        #68  <Field int bitField0_>
		//   27   52:bipush          -5
		//   28   54:iand            
		//   29   55:putfield        #68  <Field int bitField0_>
			trailingComments_ = "";
		//   30   58:aload_0         
		//   31   59:ldc1            #43  <String "">
		//   32   61:putfield        #47  <Field Object trailingComments_>
			bitField0_ = bitField0_ & -9;
		//   33   64:aload_0         
		//   34   65:aload_0         
		//   35   66:getfield        #68  <Field int bitField0_>
		//   36   69:bipush          -9
		//   37   71:iand            
		//   38   72:putfield        #68  <Field int bitField0_>
			leadingDetachedComments_ = LazyStringArrayList.EMPTY;
		//   39   75:aload_0         
		//   40   76:getstatic       #52  <Field LazyStringList LazyStringArrayList.EMPTY>
		//   41   79:putfield        #54  <Field LazyStringList leadingDetachedComments_>
			bitField0_ = bitField0_ & 0xffffffef;
		//   42   82:aload_0         
		//   43   83:aload_0         
		//   44   84:getfield        #68  <Field int bitField0_>
		//   45   87:bipush          -17
		//   46   89:iand            
		//   47   90:putfield        #68  <Field int bitField0_>
			return this;
		//   48   93:aload_0         
		//   49   94:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #205 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #205 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #205 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clear()>
		//    2    4:areturn         
		}

		public Location.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Location.Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #215 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #217 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #217 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Location.Builder clearLeadingComments()
		{
			bitField0_ = bitField0_ & -5;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #68  <Field int bitField0_>
		//    3    5:bipush          -5
		//    4    7:iand            
		//    5    8:putfield        #68  <Field int bitField0_>
			leadingComments_ = ((Object) (Location.getDefaultInstance().getLeadingComments()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #222 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location.getDefaultInstance()>
		//    8   15:invokevirtual   #226 <Method String DescriptorProtos$SourceCodeInfo$Location.getLeadingComments()>
		//    9   18:putfield        #45  <Field Object leadingComments_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #102 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public Location.Builder clearLeadingDetachedComments()
		{
			leadingDetachedComments_ = LazyStringArrayList.EMPTY;
		//    0    0:aload_0         
		//    1    1:getstatic       #52  <Field LazyStringList LazyStringArrayList.EMPTY>
		//    2    4:putfield        #54  <Field LazyStringList leadingDetachedComments_>
			bitField0_ = bitField0_ & 0xffffffef;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #68  <Field int bitField0_>
		//    6   12:bipush          -17
		//    7   14:iand            
		//    8   15:putfield        #68  <Field int bitField0_>
			onChanged();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #102 <Method void onChanged()>
			return this;
		//   11   22:aload_0         
		//   12   23:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #232 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Location.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Location.Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #235 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #232 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #232 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Location.Builder clearPath()
		{
			path_ = Collections.emptyList();
		//    0    0:aload_0         
		//    1    1:invokestatic    #37  <Method List Collections.emptyList()>
		//    2    4:putfield        #39  <Field List path_>
			bitField0_ = bitField0_ & -2;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #68  <Field int bitField0_>
		//    6   12:bipush          -2
		//    7   14:iand            
		//    8   15:putfield        #68  <Field int bitField0_>
			onChanged();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #102 <Method void onChanged()>
			return this;
		//   11   22:aload_0         
		//   12   23:areturn         
		}

		public Location.Builder clearSpan()
		{
			span_ = Collections.emptyList();
		//    0    0:aload_0         
		//    1    1:invokestatic    #37  <Method List Collections.emptyList()>
		//    2    4:putfield        #41  <Field List span_>
			bitField0_ = bitField0_ & -3;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #68  <Field int bitField0_>
		//    6   12:bipush          -3
		//    7   14:iand            
		//    8   15:putfield        #68  <Field int bitField0_>
			onChanged();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #102 <Method void onChanged()>
			return this;
		//   11   22:aload_0         
		//   12   23:areturn         
		}

		public Location.Builder clearTrailingComments()
		{
			bitField0_ = bitField0_ & -9;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #68  <Field int bitField0_>
		//    3    5:bipush          -9
		//    4    7:iand            
		//    5    8:putfield        #68  <Field int bitField0_>
			trailingComments_ = ((Object) (Location.getDefaultInstance().getTrailingComments()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #222 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location.getDefaultInstance()>
		//    8   15:invokevirtual   #242 <Method String DescriptorProtos$SourceCodeInfo$Location.getTrailingComments()>
		//    9   18:putfield        #47  <Field Object trailingComments_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #102 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clone()>
		//    2    4:areturn         
		}

		public Location.Builder clone()
		{
			return (Location.Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #248 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method DescriptorProtos$SourceCodeInfo$Location$Builder clone()>
		//    2    4:areturn         
		}

		public Location getDefaultInstanceForType()
		{
			return Location.getDefaultInstance();
		//    0    0:invokestatic    #222 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #255 <Method DescriptorProtos$SourceCodeInfo$Location getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #255 <Method DescriptorProtos$SourceCodeInfo$Location getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$27100();
		//    0    0:invokestatic    #83  <Method Descriptors$Descriptor DescriptorProtos.access$27100()>
		//    1    3:areturn         
		}

		public String getLeadingComments()
		{
			Object obj = leadingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Object leadingComments_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #258 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #260 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #263 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #266 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					leadingComments_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #45  <Field Object leadingComments_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #258 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getLeadingCommentsBytes()
		{
			Object obj = leadingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Object leadingComments_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #258 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #258 <Class String>
		//    8   16:invokestatic    #272 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				leadingComments_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #45  <Field Object leadingComments_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #260 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public String getLeadingDetachedComments(int i)
		{
			return (String)leadingDetachedComments_.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #278 <Method Object LazyStringList.get(int)>
		//    4   10:checkcast       #258 <Class String>
		//    5   13:areturn         
		}

		public ByteString getLeadingDetachedCommentsBytes(int i)
		{
			return leadingDetachedComments_.getByteString(i);
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #283 <Method ByteString LazyStringList.getByteString(int)>
		//    4   10:areturn         
		}

		public int getLeadingDetachedCommentsCount()
		{
			return leadingDetachedComments_.size();
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//    2    4:invokeinterface #288 <Method int LazyStringList.size()>
		//    3    9:ireturn         
		}

		public ProtocolStringList getLeadingDetachedCommentsList()
		{
			return ((ProtocolStringList) (leadingDetachedComments_.getUnmodifiableView()));
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//    2    4:invokeinterface #189 <Method LazyStringList LazyStringList.getUnmodifiableView()>
		//    3    9:areturn         
		}

		public volatile List getLeadingDetachedCommentsList()
		{
			return ((List) (getLeadingDetachedCommentsList()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #292 <Method ProtocolStringList getLeadingDetachedCommentsList()>
		//    2    4:areturn         
		}

		public int getPath(int i)
		{
			return ((Integer)path_.get(i)).intValue();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field List path_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #295 <Method Object List.get(int)>
		//    4   10:checkcast       #131 <Class Integer>
		//    5   13:invokevirtual   #298 <Method int Integer.intValue()>
		//    6   16:ireturn         
		}

		public int getPathCount()
		{
			return path_.size();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field List path_>
		//    2    4:invokeinterface #300 <Method int List.size()>
		//    3    9:ireturn         
		}

		public List getPathList()
		{
			return Collections.unmodifiableList(path_);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field List path_>
		//    2    4:invokestatic    #171 <Method List Collections.unmodifiableList(List)>
		//    3    7:areturn         
		}

		public int getSpan(int i)
		{
			return ((Integer)span_.get(i)).intValue();
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field List span_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #295 <Method Object List.get(int)>
		//    4   10:checkcast       #131 <Class Integer>
		//    5   13:invokevirtual   #298 <Method int Integer.intValue()>
		//    6   16:ireturn         
		}

		public int getSpanCount()
		{
			return span_.size();
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field List span_>
		//    2    4:invokeinterface #300 <Method int List.size()>
		//    3    9:ireturn         
		}

		public List getSpanList()
		{
			return Collections.unmodifiableList(span_);
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field List span_>
		//    2    4:invokestatic    #171 <Method List Collections.unmodifiableList(List)>
		//    3    7:areturn         
		}

		public String getTrailingComments()
		{
			Object obj = trailingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Object trailingComments_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #258 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #260 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #263 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #266 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					trailingComments_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #47  <Field Object trailingComments_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #258 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getTrailingCommentsBytes()
		{
			Object obj = trailingComments_;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Object trailingComments_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #258 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #258 <Class String>
		//    8   16:invokestatic    #272 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				trailingComments_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #47  <Field Object trailingComments_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #260 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public boolean hasLeadingComments()
		{
			return (bitField0_ & 4) == 4;
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field int bitField0_>
		//    2    4:iconst_4        
		//    3    5:iand            
		//    4    6:iconst_4        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasTrailingComments()
		{
			return (bitField0_ & 8) == 8;
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field int bitField0_>
		//    2    4:bipush          8
		//    3    6:iand            
		//    4    7:bipush          8
		//    5    9:icmpne          14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$27200().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$SourceCodeInfo$Location, com/google/protobuf/DescriptorProtos$SourceCodeInfo$Location$Builder);
		//    0    0:invokestatic    #313 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$27200()>
		//    1    3:ldc1            #14  <Class DescriptorProtos$SourceCodeInfo$Location>
		//    2    5:ldc1            #2   <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    3    7:invokevirtual   #319 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
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
		//    3    3:invokevirtual   #326 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #330 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #326 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Location.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
			codedinputstream = ((CodedInputStream) ((Location)Location.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #337 <Field Parser DescriptorProtos$SourceCodeInfo$Location.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #343 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #14  <Class DescriptorProtos$SourceCodeInfo$Location>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((Location) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #346 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(DescriptorProtos$SourceCodeInfo$Location)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #349 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #14  <Class DescriptorProtos$SourceCodeInfo$Location>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #353 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #346 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(DescriptorProtos$SourceCodeInfo$Location)>
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
			codedinputstream = ((CodedInputStream) ((Location)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((Location) (codedinputstream1)));
			throw codedinputstream;
		}

		public Location.Builder mergeFrom(Location location)
		{
			if(location == Location.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #222 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(!location.path_.isEmpty())
		//*   5    9:aload_1         
		//*   6   10:invokestatic    #357 <Method List DescriptorProtos$SourceCodeInfo$Location.access$27600(DescriptorProtos$SourceCodeInfo$Location)>
		//*   7   13:invokeinterface #360 <Method boolean List.isEmpty()>
		//*   8   18:ifne            77
			{
				if(path_.isEmpty())
		//*   9   21:aload_0         
		//*  10   22:getfield        #39  <Field List path_>
		//*  11   25:invokeinterface #360 <Method boolean List.isEmpty()>
		//*  12   30:ifeq            55
				{
					path_ = location.path_;
		//   13   33:aload_0         
		//   14   34:aload_1         
		//   15   35:invokestatic    #357 <Method List DescriptorProtos$SourceCodeInfo$Location.access$27600(DescriptorProtos$SourceCodeInfo$Location)>
		//   16   38:putfield        #39  <Field List path_>
					bitField0_ = bitField0_ & -2;
		//   17   41:aload_0         
		//   18   42:aload_0         
		//   19   43:getfield        #68  <Field int bitField0_>
		//   20   46:bipush          -2
		//   21   48:iand            
		//   22   49:putfield        #68  <Field int bitField0_>
				} else
		//*  23   52:goto            73
				{
					ensurePathIsMutable();
		//   24   55:aload_0         
		//   25   56:invokespecial   #107 <Method void ensurePathIsMutable()>
					path_.addAll(((java.util.Collection) (location.path_)));
		//   26   59:aload_0         
		//   27   60:getfield        #39  <Field List path_>
		//   28   63:aload_1         
		//   29   64:invokestatic    #357 <Method List DescriptorProtos$SourceCodeInfo$Location.access$27600(DescriptorProtos$SourceCodeInfo$Location)>
		//   30   67:invokeinterface #363 <Method boolean List.addAll(java.util.Collection)>
		//   31   72:pop             
				}
				onChanged();
		//   32   73:aload_0         
		//   33   74:invokevirtual   #102 <Method void onChanged()>
			}
			if(!location.span_.isEmpty())
		//*  34   77:aload_1         
		//*  35   78:invokestatic    #366 <Method List DescriptorProtos$SourceCodeInfo$Location.access$27700(DescriptorProtos$SourceCodeInfo$Location)>
		//*  36   81:invokeinterface #360 <Method boolean List.isEmpty()>
		//*  37   86:ifne            145
			{
				if(span_.isEmpty())
		//*  38   89:aload_0         
		//*  39   90:getfield        #41  <Field List span_>
		//*  40   93:invokeinterface #360 <Method boolean List.isEmpty()>
		//*  41   98:ifeq            123
				{
					span_ = location.span_;
		//   42  101:aload_0         
		//   43  102:aload_1         
		//   44  103:invokestatic    #366 <Method List DescriptorProtos$SourceCodeInfo$Location.access$27700(DescriptorProtos$SourceCodeInfo$Location)>
		//   45  106:putfield        #41  <Field List span_>
					bitField0_ = bitField0_ & -3;
		//   46  109:aload_0         
		//   47  110:aload_0         
		//   48  111:getfield        #68  <Field int bitField0_>
		//   49  114:bipush          -3
		//   50  116:iand            
		//   51  117:putfield        #68  <Field int bitField0_>
				} else
		//*  52  120:goto            141
				{
					ensureSpanIsMutable();
		//   53  123:aload_0         
		//   54  124:invokespecial   #111 <Method void ensureSpanIsMutable()>
					span_.addAll(((java.util.Collection) (location.span_)));
		//   55  127:aload_0         
		//   56  128:getfield        #41  <Field List span_>
		//   57  131:aload_1         
		//   58  132:invokestatic    #366 <Method List DescriptorProtos$SourceCodeInfo$Location.access$27700(DescriptorProtos$SourceCodeInfo$Location)>
		//   59  135:invokeinterface #363 <Method boolean List.addAll(java.util.Collection)>
		//   60  140:pop             
				}
				onChanged();
		//   61  141:aload_0         
		//   62  142:invokevirtual   #102 <Method void onChanged()>
			}
			if(location.hasLeadingComments())
		//*  63  145:aload_1         
		//*  64  146:invokevirtual   #368 <Method boolean DescriptorProtos$SourceCodeInfo$Location.hasLeadingComments()>
		//*  65  149:ifeq            174
			{
				bitField0_ = bitField0_ | 4;
		//   66  152:aload_0         
		//   67  153:aload_0         
		//   68  154:getfield        #68  <Field int bitField0_>
		//   69  157:iconst_4        
		//   70  158:ior             
		//   71  159:putfield        #68  <Field int bitField0_>
				leadingComments_ = location.leadingComments_;
		//   72  162:aload_0         
		//   73  163:aload_1         
		//   74  164:invokestatic    #372 <Method Object DescriptorProtos$SourceCodeInfo$Location.access$27800(DescriptorProtos$SourceCodeInfo$Location)>
		//   75  167:putfield        #45  <Field Object leadingComments_>
				onChanged();
		//   76  170:aload_0         
		//   77  171:invokevirtual   #102 <Method void onChanged()>
			}
			if(location.hasTrailingComments())
		//*  78  174:aload_1         
		//*  79  175:invokevirtual   #374 <Method boolean DescriptorProtos$SourceCodeInfo$Location.hasTrailingComments()>
		//*  80  178:ifeq            204
			{
				bitField0_ = bitField0_ | 8;
		//   81  181:aload_0         
		//   82  182:aload_0         
		//   83  183:getfield        #68  <Field int bitField0_>
		//   84  186:bipush          8
		//   85  188:ior             
		//   86  189:putfield        #68  <Field int bitField0_>
				trailingComments_ = location.trailingComments_;
		//   87  192:aload_0         
		//   88  193:aload_1         
		//   89  194:invokestatic    #377 <Method Object DescriptorProtos$SourceCodeInfo$Location.access$27900(DescriptorProtos$SourceCodeInfo$Location)>
		//   90  197:putfield        #47  <Field Object trailingComments_>
				onChanged();
		//   91  200:aload_0         
		//   92  201:invokevirtual   #102 <Method void onChanged()>
			}
			if(!location.leadingDetachedComments_.isEmpty())
		//*  93  204:aload_1         
		//*  94  205:invokestatic    #381 <Method LazyStringList DescriptorProtos$SourceCodeInfo$Location.access$28000(DescriptorProtos$SourceCodeInfo$Location)>
		//*  95  208:invokeinterface #382 <Method boolean LazyStringList.isEmpty()>
		//*  96  213:ifne            272
			{
				if(leadingDetachedComments_.isEmpty())
		//*  97  216:aload_0         
		//*  98  217:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//*  99  220:invokeinterface #382 <Method boolean LazyStringList.isEmpty()>
		//* 100  225:ifeq            250
				{
					leadingDetachedComments_ = location.leadingDetachedComments_;
		//  101  228:aload_0         
		//  102  229:aload_1         
		//  103  230:invokestatic    #381 <Method LazyStringList DescriptorProtos$SourceCodeInfo$Location.access$28000(DescriptorProtos$SourceCodeInfo$Location)>
		//  104  233:putfield        #54  <Field LazyStringList leadingDetachedComments_>
					bitField0_ = bitField0_ & 0xffffffef;
		//  105  236:aload_0         
		//  106  237:aload_0         
		//  107  238:getfield        #68  <Field int bitField0_>
		//  108  241:bipush          -17
		//  109  243:iand            
		//  110  244:putfield        #68  <Field int bitField0_>
				} else
		//* 111  247:goto            268
				{
					ensureLeadingDetachedCommentsIsMutable();
		//  112  250:aload_0         
		//  113  251:invokespecial   #93  <Method void ensureLeadingDetachedCommentsIsMutable()>
					leadingDetachedComments_.addAll(((java.util.Collection) (location.leadingDetachedComments_)));
		//  114  254:aload_0         
		//  115  255:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//  116  258:aload_1         
		//  117  259:invokestatic    #381 <Method LazyStringList DescriptorProtos$SourceCodeInfo$Location.access$28000(DescriptorProtos$SourceCodeInfo$Location)>
		//  118  262:invokeinterface #383 <Method boolean LazyStringList.addAll(java.util.Collection)>
		//  119  267:pop             
				}
				onChanged();
		//  120  268:aload_0         
		//  121  269:invokevirtual   #102 <Method void onChanged()>
			}
			mergeUnknownFields(location.unknownFields);
		//  122  272:aload_0         
		//  123  273:aload_1         
		//  124  274:getfield        #387 <Field UnknownFieldSet DescriptorProtos$SourceCodeInfo$Location.unknownFields>
		//  125  277:invokevirtual   #391 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeUnknownFields(UnknownFieldSet)>
		//  126  280:pop             
			onChanged();
		//  127  281:aload_0         
		//  128  282:invokevirtual   #102 <Method void onChanged()>
			return this;
		//  129  285:aload_0         
		//  130  286:areturn         
		}

		public Location.Builder mergeFrom(Message message)
		{
			if(message instanceof Location)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #14  <Class DescriptorProtos$SourceCodeInfo$Location>
		//*   2    4:ifeq            16
			{
				return mergeFrom((Location)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #14  <Class DescriptorProtos$SourceCodeInfo$Location>
		//    6   12:invokevirtual   #346 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(DescriptorProtos$SourceCodeInfo$Location)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #393 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #326 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #330 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #326 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #391 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Location.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Location.Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #400 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #391 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #391 <Method DescriptorProtos$SourceCodeInfo$Location$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Location.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Location.Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #404 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #406 <Method DescriptorProtos$SourceCodeInfo$Location$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #406 <Method DescriptorProtos$SourceCodeInfo$Location$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Location.Builder setLeadingComments(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #115 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #116 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 4;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #68  <Field int bitField0_>
		//    9   17:iconst_4        
		//   10   18:ior             
		//   11   19:putfield        #68  <Field int bitField0_>
				leadingComments_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #45  <Field Object leadingComments_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #102 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Location.Builder setLeadingCommentsBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #115 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #116 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 4;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #68  <Field int bitField0_>
		//    9   17:iconst_4        
		//   10   18:ior             
		//   11   19:putfield        #68  <Field int bitField0_>
				leadingComments_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #45  <Field Object leadingComments_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #102 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Location.Builder setLeadingDetachedComments(int i, String s)
		{
			if(s == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #115 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #116 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				ensureLeadingDetachedCommentsIsMutable();
		//    6   12:aload_0         
		//    7   13:invokespecial   #93  <Method void ensureLeadingDetachedCommentsIsMutable()>
				leadingDetachedComments_.set(i, ((Object) (s)));
		//    8   16:aload_0         
		//    9   17:getfield        #54  <Field LazyStringList leadingDetachedComments_>
		//   10   20:iload_1         
		//   11   21:aload_2         
		//   12   22:invokeinterface #414 <Method Object LazyStringList.set(int, Object)>
		//   13   27:pop             
				onChanged();
		//   14   28:aload_0         
		//   15   29:invokevirtual   #102 <Method void onChanged()>
				return this;
		//   16   32:aload_0         
		//   17   33:areturn         
			}
		}

		public Location.Builder setPath(int i, int j)
		{
			ensurePathIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #107 <Method void ensurePathIsMutable()>
			path_.set(i, ((Object) (Integer.valueOf(j))));
		//    2    4:aload_0         
		//    3    5:getfield        #39  <Field List path_>
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:invokestatic    #135 <Method Integer Integer.valueOf(int)>
		//    7   13:invokeinterface #417 <Method Object List.set(int, Object)>
		//    8   18:pop             
			onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #102 <Method void onChanged()>
			return this;
		//   11   23:aload_0         
		//   12   24:areturn         
		}

		public Location.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Location.Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #422 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #424 <Method DescriptorProtos$SourceCodeInfo$Location$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #424 <Method DescriptorProtos$SourceCodeInfo$Location$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Location.Builder setSpan(int i, int j)
		{
			ensureSpanIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #111 <Method void ensureSpanIsMutable()>
			span_.set(i, ((Object) (Integer.valueOf(j))));
		//    2    4:aload_0         
		//    3    5:getfield        #41  <Field List span_>
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:invokestatic    #135 <Method Integer Integer.valueOf(int)>
		//    7   13:invokeinterface #417 <Method Object List.set(int, Object)>
		//    8   18:pop             
			onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #102 <Method void onChanged()>
			return this;
		//   11   23:aload_0         
		//   12   24:areturn         
		}

		public Location.Builder setTrailingComments(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #115 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #116 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 8;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #68  <Field int bitField0_>
		//    9   17:bipush          8
		//   10   19:ior             
		//   11   20:putfield        #68  <Field int bitField0_>
				trailingComments_ = ((Object) (s));
		//   12   23:aload_0         
		//   13   24:aload_1         
		//   14   25:putfield        #47  <Field Object trailingComments_>
				onChanged();
		//   15   28:aload_0         
		//   16   29:invokevirtual   #102 <Method void onChanged()>
				return this;
		//   17   32:aload_0         
		//   18   33:areturn         
			}
		}

		public Location.Builder setTrailingCommentsBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #115 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #116 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 8;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #68  <Field int bitField0_>
		//    9   17:bipush          8
		//   10   19:ior             
		//   11   20:putfield        #68  <Field int bitField0_>
				trailingComments_ = ((Object) (bytestring));
		//   12   23:aload_0         
		//   13   24:aload_1         
		//   14   25:putfield        #47  <Field Object trailingComments_>
				onChanged();
		//   15   28:aload_0         
		//   16   29:invokevirtual   #102 <Method void onChanged()>
				return this;
		//   17   32:aload_0         
		//   18   33:areturn         
			}
		}

		public final Location.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Location.Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #431 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo$Location$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #433 <Method DescriptorProtos$SourceCodeInfo$Location$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #433 <Method DescriptorProtos$SourceCodeInfo$Location$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private Object leadingComments_;
		private LazyStringList leadingDetachedComments_;
		private List path_;
		private List span_;
		private Object trailingComments_;

		private Location.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void GeneratedMessageV3$Builder()>
			path_ = Collections.emptyList();
		//    2    4:aload_0         
		//    3    5:invokestatic    #37  <Method List Collections.emptyList()>
		//    4    8:putfield        #39  <Field List path_>
			span_ = Collections.emptyList();
		//    5   11:aload_0         
		//    6   12:invokestatic    #37  <Method List Collections.emptyList()>
		//    7   15:putfield        #41  <Field List span_>
			leadingComments_ = "";
		//    8   18:aload_0         
		//    9   19:ldc1            #43  <String "">
		//   10   21:putfield        #45  <Field Object leadingComments_>
			trailingComments_ = "";
		//   11   24:aload_0         
		//   12   25:ldc1            #43  <String "">
		//   13   27:putfield        #47  <Field Object trailingComments_>
			leadingDetachedComments_ = LazyStringArrayList.EMPTY;
		//   14   30:aload_0         
		//   15   31:getstatic       #52  <Field LazyStringList LazyStringArrayList.EMPTY>
		//   16   34:putfield        #54  <Field LazyStringList leadingDetachedComments_>
			maybeForceBuilderInitialization();
		//   17   37:aload_0         
		//   18   38:invokespecial   #57  <Method void maybeForceBuilderInitialization()>
		//   19   41:return          
		}

		Location.Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #60  <Method void DescriptorProtos$SourceCodeInfo$Location$Builder()>
		//    2    4:return          
		}

		private Location.Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #63  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			path_ = Collections.emptyList();
		//    3    5:aload_0         
		//    4    6:invokestatic    #37  <Method List Collections.emptyList()>
		//    5    9:putfield        #39  <Field List path_>
			span_ = Collections.emptyList();
		//    6   12:aload_0         
		//    7   13:invokestatic    #37  <Method List Collections.emptyList()>
		//    8   16:putfield        #41  <Field List span_>
			leadingComments_ = "";
		//    9   19:aload_0         
		//   10   20:ldc1            #43  <String "">
		//   11   22:putfield        #45  <Field Object leadingComments_>
			trailingComments_ = "";
		//   12   25:aload_0         
		//   13   26:ldc1            #43  <String "">
		//   14   28:putfield        #47  <Field Object trailingComments_>
			leadingDetachedComments_ = LazyStringArrayList.EMPTY;
		//   15   31:aload_0         
		//   16   32:getstatic       #52  <Field LazyStringList LazyStringArrayList.EMPTY>
		//   17   35:putfield        #54  <Field LazyStringList leadingDetachedComments_>
			maybeForceBuilderInitialization();
		//   18   38:aload_0         
		//   19   39:invokespecial   #57  <Method void maybeForceBuilderInitialization()>
		//   20   42:return          
		}

		Location.Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #65  <Method void DescriptorProtos$SourceCodeInfo$Location$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static interface LocationOrBuilder
		extends MessageOrBuilder
	{

		public abstract String getLeadingComments();

		public abstract ByteString getLeadingCommentsBytes();

		public abstract String getLeadingDetachedComments(int i);

		public abstract ByteString getLeadingDetachedCommentsBytes(int i);

		public abstract int getLeadingDetachedCommentsCount();

		public abstract List getLeadingDetachedCommentsList();

		public abstract int getPath(int i);

		public abstract int getPathCount();

		public abstract List getPathList();

		public abstract int getSpan(int i);

		public abstract int getSpanCount();

		public abstract List getSpanList();

		public abstract String getTrailingComments();

		public abstract ByteString getTrailingCommentsBytes();

		public abstract boolean hasLeadingComments();

		public abstract boolean hasTrailingComments();
	}


	public static DescriptorProtos$SourceCodeInfo getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #49  <Field DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$26900();
	//    0    0:invokestatic    #148 <Method Descriptors$Descriptor DescriptorProtos.access$26900()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #49  <Field DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #152 <Method DescriptorProtos$SourceCodeInfo$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$SourceCodeInfo descriptorprotos$sourcecodeinfo)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$sourcecodeinfo);
	//    0    0:getstatic       #49  <Field DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #152 <Method DescriptorProtos$SourceCodeInfo$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #156 <Method DescriptorProtos$SourceCodeInfo$Builder DescriptorProtos$SourceCodeInfo$Builder.mergeFrom(DescriptorProtos$SourceCodeInfo)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$SourceCodeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #162 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    4   10:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$SourceCodeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #166 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    5   11:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$SourceCodeInfo)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #173 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    4   12:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$SourceCodeInfo)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #177 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    5   13:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$SourceCodeInfo)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #182 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    4   10:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$SourceCodeInfo)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #186 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    5   11:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$SourceCodeInfo)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #188 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    4   10:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$SourceCodeInfo)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #190 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    5   11:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$SourceCodeInfo)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #194 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    4   12:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$SourceCodeInfo)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #198 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    5   13:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$SourceCodeInfo)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #202 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    4   12:areturn         
	}

	public static DescriptorProtos$SourceCodeInfo parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$SourceCodeInfo)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #206 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #52  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$SourceCodeInfo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$SourceCodeInfo>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #212 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$SourceCodeInfo)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$SourceCodeInfo>
	//   14   24:astore_1        
		boolean flag;
		if(true && getLocationList().equals(((Object) (((DescriptorProtos$SourceCodeInfo) (obj)).getLocationList()))))
	//*  15   25:iconst_1        
	//*  16   26:ifeq            50
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #215 <Method List getLocationList()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #215 <Method List getLocationList()>
	//*  21   37:invokeinterface #216 <Method boolean List.equals(Object)>
	//*  22   42:ifeq            50
			flag = true;
	//   23   45:iconst_1        
	//   24   46:istore_2        
		else
	//*  25   47:goto            52
			flag = false;
	//   26   50:iconst_0        
	//   27   51:istore_2        
		return flag && unknownFields.equals(((Object) (((DescriptorProtos$SourceCodeInfo) (obj)).unknownFields)));
	//   28   52:iload_2         
	//   29   53:ifeq            72
	//   30   56:aload_0         
	//   31   57:getfield        #116 <Field UnknownFieldSet unknownFields>
	//   32   60:aload_1         
	//   33   61:getfield        #116 <Field UnknownFieldSet unknownFields>
	//   34   64:invokevirtual   #217 <Method boolean UnknownFieldSet.equals(Object)>
	//   35   67:ifeq            72
	//   36   70:iconst_1        
	//   37   71:ireturn         
	//   38   72:iconst_0        
	//   39   73:ireturn         
	}

	public DescriptorProtos$SourceCodeInfo getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #49  <Field DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #221 <Method DescriptorProtos$SourceCodeInfo getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #221 <Method DescriptorProtos$SourceCodeInfo getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Location getLocation(int i)
	{
		return (Location)location_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List location_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #228 <Method Object List.get(int)>
	//    4   10:checkcast       #16  <Class DescriptorProtos$SourceCodeInfo$Location>
	//    5   13:areturn         
	}

	public int getLocationCount()
	{
		return location_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List location_>
	//    2    4:invokeinterface #232 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getLocationList()
	{
		return location_;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List location_>
	//    2    4:areturn         
	}

	public LocationOrBuilder getLocationOrBuilder(int i)
	{
		return (LocationOrBuilder)location_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List location_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #228 <Method Object List.get(int)>
	//    4   10:checkcast       #23  <Class DescriptorProtos$SourceCodeInfo$LocationOrBuilder>
	//    5   13:areturn         
	}

	public List getLocationOrBuilderList()
	{
		return location_;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List location_>
	//    2    4:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #52  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field int memoizedSize>
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
		for(i = 0; i < location_.size(); i++)
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:aload_0         
	//*  14   18:getfield        #64  <Field List location_>
	//*  15   21:invokeinterface #232 <Method int List.size()>
	//*  16   26:icmpge          56
			j += CodedOutputStream.computeMessageSize(1, (MessageLite)location_.get(i));
	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:aload_0         
	//   20   32:getfield        #64  <Field List location_>
	//   21   35:iload_1         
	//   22   36:invokeinterface #228 <Method Object List.get(int)>
	//   23   41:checkcast       #244 <Class MessageLite>
	//   24   44:invokestatic    #250 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   25   47:iadd            
	//   26   48:istore_2        

	//   27   49:iload_1         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_1        
	//*  31   53:goto            16
		i = j + unknownFields.getSerializedSize();
	//   32   56:iload_2         
	//   33   57:aload_0         
	//   34   58:getfield        #116 <Field UnknownFieldSet unknownFields>
	//   35   61:invokevirtual   #252 <Method int UnknownFieldSet.getSerializedSize()>
	//   36   64:iadd            
	//   37   65:istore_1        
		memoizedSize = i;
	//   38   66:aload_0         
	//   39   67:iload_1         
	//   40   68:putfield        #242 <Field int memoizedSize>
		return i;
	//   41   71:iload_1         
	//   42   72:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #257 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #257 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #259 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #263 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(getLocationCount() > 0)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #265 <Method int getLocationCount()>
	//*  15   29:ifle            52
			i = (j * 37 + 1) * 53 + getLocationList().hashCode();
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #215 <Method List getLocationList()>
	//   25   45:invokeinterface #266 <Method int List.hashCode()>
	//   26   50:iadd            
	//   27   51:istore_1        
		i = i * 29 + unknownFields.hashCode();
	//   28   52:iload_1         
	//   29   53:bipush          29
	//   30   55:imul            
	//   31   56:aload_0         
	//   32   57:getfield        #116 <Field UnknownFieldSet unknownFields>
	//   33   60:invokevirtual   #267 <Method int UnknownFieldSet.hashCode()>
	//   34   63:iadd            
	//   35   64:istore_1        
		memoizedHashCode = i;
	//   36   65:aload_0         
	//   37   66:iload_1         
	//   38   67:putfield        #257 <Field int memoizedHashCode>
		return i;
	//   39   70:iload_1         
	//   40   71:ireturn         
	}

	protected Table internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$27000().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$SourceCodeInfo, com/google/protobuf/DescriptorProtos$SourceCodeInfo$Builder);
	//    0    0:invokestatic    #272 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$27000()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$SourceCodeInfo>
	//    2    5:ldc1            #13  <Class DescriptorProtos$SourceCodeInfo$Builder>
	//    3    7:invokevirtual   #278 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field byte memoizedIsInitialized>
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
	//   14   20:putfield        #56  <Field byte memoizedIsInitialized>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #283 <Method DescriptorProtos$SourceCodeInfo$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType( )
	{
		return new Builder(, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #13  <Class DescriptorProtos$SourceCodeInfo$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #287 <Method void DescriptorProtos$SourceCodeInfo$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method DescriptorProtos$SourceCodeInfo$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType( )
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #293 <Method DescriptorProtos$SourceCodeInfo$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method DescriptorProtos$SourceCodeInfo$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #49  <Field DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #13  <Class DescriptorProtos$SourceCodeInfo$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #297 <Method void DescriptorProtos$SourceCodeInfo$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #13  <Class DescriptorProtos$SourceCodeInfo$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #297 <Method void DescriptorProtos$SourceCodeInfo$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #156 <Method DescriptorProtos$SourceCodeInfo$Builder DescriptorProtos$SourceCodeInfo$Builder.mergeFrom(DescriptorProtos$SourceCodeInfo)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method DescriptorProtos$SourceCodeInfo$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method DescriptorProtos$SourceCodeInfo$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		for(int i = 0; i < location_.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #64  <Field List location_>
	//*   5    7:invokeinterface #232 <Method int List.size()>
	//*   6   12:icmpge          40
			codedoutputstream.writeMessage(1, (MessageLite)location_.get(i));
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:aload_0         
	//   10   18:getfield        #64  <Field List location_>
	//   11   21:iload_2         
	//   12   22:invokeinterface #228 <Method Object List.get(int)>
	//   13   27:checkcast       #244 <Class MessageLite>
	//   14   30:invokevirtual   #303 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   15   33:iload_2         
	//   16   34:iconst_1        
	//   17   35:iadd            
	//   18   36:istore_2        
	//*  19   37:goto            2
		unknownFields.writeTo(codedoutputstream);
	//   20   40:aload_0         
	//   21   41:getfield        #116 <Field UnknownFieldSet unknownFields>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #305 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   24   48:return          
	}

	private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE = new DescriptorProtos$SourceCodeInfo();
	public static final int LOCATION_FIELD_NUMBER = 1;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.SourceCodeInfo parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.SourceCodeInfo(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$SourceCodeInfo>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$SourceCodeInfo(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$SourceCodeInfo parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	private static final long serialVersionUID = 0L;
	private List location_;
	private byte memoizedIsInitialized;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$SourceCodeInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void DescriptorProtos$SourceCodeInfo()>
	//    3    7:putstatic       #49  <Field DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE>
	//    4   10:new             #11  <Class DescriptorProtos$SourceCodeInfo$1>
	//    5   13:dup             
	//    6   14:invokespecial   #50  <Method void DescriptorProtos$SourceCodeInfo$1()>
	//    7   17:putstatic       #52  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static List access$28600(DescriptorProtos$SourceCodeInfo descriptorprotos$sourcecodeinfo)
	{
		return descriptorprotos$sourcecodeinfo.location_;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List location_>
	//    2    4:areturn         
	}

*/


/*
	static List access$28602(DescriptorProtos$SourceCodeInfo descriptorprotos$sourcecodeinfo, List list)
	{
		descriptorprotos$sourcecodeinfo.location_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field List location_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	private DescriptorProtos$SourceCodeInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #56  <Field byte memoizedIsInitialized>
		location_ = Collections.emptyList();
	//    5    9:aload_0         
	//    6   10:invokestatic    #62  <Method List Collections.emptyList()>
	//    7   13:putfield        #64  <Field List location_>
	//    8   16:return          
	}

	private DescriptorProtos$SourceCodeInfo(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		boolean flag5;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void DescriptorProtos$SourceCodeInfo()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #71  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #72  <Method void NullPointerException()>
	//    7   15:athrow          
		flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #78  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          10
		flag5 = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L8:
		boolean flag2;
		boolean flag3;
		boolean flag4;
		if(flag5)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            181
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
	//   23   41:invokevirtual   #84  <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		i;
	//   25   46:iload           9
		JVM INSTR lookupswitch 2: default 277
	//	               0: 280
	//	               10: 110;
	//   26   48:lookupswitch    2: default 277
	//	               0: 280
	//	               10: 110
		   goto _L1 _L2 _L3
_L1:
		boolean flag1;
		flag1 = flag;
	//   27   76:iload_3         
	//   28   77:istore          4
		flag3 = flag;
	//   29   79:iload_3         
	//   30   80:istore          6
		flag4 = flag;
	//   31   82:iload_3         
	//   32   83:istore          7
		flag2 = flag;
	//   33   85:iload_3         
	//   34   86:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
	//*  35   88:aload_0         
	//*  36   89:aload_1         
	//*  37   90:aload           10
	//*  38   92:aload_2         
	//*  39   93:iload           9
	//*  40   95:invokevirtual   #88  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41   98:ifne            175
		{
			flag5 = true;
	//   42  101:iconst_1        
	//   43  102:istore          8
			flag1 = flag;
	//   44  104:iload_3         
	//   45  105:istore          4
		}
		  goto _L4
	//*  46  107:goto            175
_L3:
		flag1 = flag;
	//   47  110:iload_3         
	//   48  111:istore          4
		if((flag & true)) goto _L6; else goto _L5
	//   49  113:iload_3         
	//   50  114:iconst_1        
	//   51  115:iand            
	//   52  116:iconst_1        
	//   53  117:icmpeq          145
_L5:
		flag3 = flag;
	//   54  120:iload_3         
	//   55  121:istore          6
		flag4 = flag;
	//   56  123:iload_3         
	//   57  124:istore          7
		flag2 = flag;
	//   58  126:iload_3         
	//   59  127:istore          5
		location_ = ((List) (new ArrayList()));
	//   60  129:aload_0         
	//   61  130:new             #90  <Class ArrayList>
	//   62  133:dup             
	//   63  134:invokespecial   #91  <Method void ArrayList()>
	//   64  137:putfield        #64  <Field List location_>
		flag1 = flag | true;
	//   65  140:iload_3         
	//   66  141:iconst_1        
	//   67  142:ior             
	//   68  143:istore          4
_L6:
		flag3 = flag1;
	//   69  145:iload           4
	//   70  147:istore          6
		flag4 = flag1;
	//   71  149:iload           4
	//   72  151:istore          7
		flag2 = flag1;
	//   73  153:iload           4
	//   74  155:istore          5
		location_.add(((Object) (codedinputstream.readMessage(Location.PARSER, extensionregistrylite))));
	//   75  157:aload_0         
	//   76  158:getfield        #64  <Field List location_>
	//   77  161:aload_1         
	//   78  162:getstatic       #92  <Field Parser DescriptorProtos$SourceCodeInfo$Location.PARSER>
	//   79  165:aload_2         
	//   80  166:invokevirtual   #96  <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//   81  169:invokeinterface #102 <Method boolean List.add(Object)>
	//   82  174:pop             
_L4:
		flag = flag1;
	//   83  175:iload           4
	//   84  177:istore_3        
		if(true) goto _L8; else goto _L7
	//   85  178:goto            26
_L7:
		if((flag & true))
	//*  86  181:iload_3         
	//*  87  182:iconst_1        
	//*  88  183:iand            
	//*  89  184:iconst_1        
	//*  90  185:icmpne          199
			location_ = Collections.unmodifiableList(location_);
	//   91  188:aload_0         
	//   92  189:aload_0         
	//   93  190:getfield        #64  <Field List location_>
	//   94  193:invokestatic    #106 <Method List Collections.unmodifiableList(List)>
	//   95  196:putfield        #64  <Field List location_>
		unknownFields = builder.build();
	//   96  199:aload_0         
	//   97  200:aload           10
	//   98  202:invokevirtual   #112 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   99  205:putfield        #116 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  100  208:aload_0         
	//  101  209:invokevirtual   #119 <Method void makeExtensionsImmutable()>
		return;
	//  102  212:return          
		codedinputstream;
	//  103  213:astore_1        
		flag2 = flag3;
	//  104  214:iload           6
	//  105  216:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  106  218:aload_1         
	//  107  219:aload_0         
	//  108  220:invokevirtual   #123 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  109  223:athrow          
		codedinputstream;
	//  110  224:astore_1        
		flag2 = flag4;
	//  111  225:iload           7
	//  112  227:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  113  229:new             #67  <Class InvalidProtocolBufferException>
	//  114  232:dup             
	//  115  233:aload_1         
	//  116  234:invokespecial   #126 <Method void InvalidProtocolBufferException(IOException)>
	//  117  237:aload_0         
	//  118  238:invokevirtual   #123 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  119  241:athrow          
		codedinputstream;
	//  120  242:astore_1        
		if((flag2 & true))
	//* 121  243:iload           5
	//* 122  245:iconst_1        
	//* 123  246:iand            
	//* 124  247:iconst_1        
	//* 125  248:icmpne          262
			location_ = Collections.unmodifiableList(location_);
	//  126  251:aload_0         
	//  127  252:aload_0         
	//  128  253:getfield        #64  <Field List location_>
	//  129  256:invokestatic    #106 <Method List Collections.unmodifiableList(List)>
	//  130  259:putfield        #64  <Field List location_>
		unknownFields = builder.build();
	//  131  262:aload_0         
	//  132  263:aload           10
	//  133  265:invokevirtual   #112 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  134  268:putfield        #116 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  135  271:aload_0         
	//  136  272:invokevirtual   #119 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  137  275:aload_1         
	//  138  276:athrow          
	//* 139  277:goto            76
_L2:
		flag5 = true;
	//  140  280:iconst_1        
	//  141  281:istore          8
		flag1 = flag;
	//  142  283:iload_3         
	//  143  284:istore          4
		  goto _L4
	//* 144  286:goto            175
	}

	DescriptorProtos$SourceCodeInfo(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #130 <Method void DescriptorProtos$SourceCodeInfo(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$SourceCodeInfo(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #133 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #56  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$SourceCodeInfo(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #137 <Method void DescriptorProtos$SourceCodeInfo(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
