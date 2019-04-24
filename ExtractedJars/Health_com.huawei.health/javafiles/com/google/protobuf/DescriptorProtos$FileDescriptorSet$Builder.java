// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, RepeatedFieldBuilderV3, GeneratedMessageV3, InvalidProtocolBufferException, 
//			Parser, Message, MessageLite, CodedInputStream, 
//			ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$FileDescriptorSet$Builder extends GeneratedMessageV3.Builder
	implements 
{

	private void ensureFileIsMutable()
	{
		if((bitField0_ & 1) != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          35
		{
			file_ = ((List) (new ArrayList(((java.util.Collection) (file_)))));
	//    6   10:aload_0         
	//    7   11:new             #49  <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field List file_>
	//   11   19:invokespecial   #52  <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #33  <Field List file_>
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
		return DescriptorProtos.access$000();
	//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$000()>
	//    1    3:areturn         
	}

	private RepeatedFieldBuilderV3 getFileFieldBuilder()
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = file_;
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List file_>
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
			fileBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
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
	//   27   47:putfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
			file_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #33  <Field List file_>
		}
		return fileBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   33   59:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #82  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getFileFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #84  <Method RepeatedFieldBuilderV3 getFileFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$FileDescriptorSet$Builder addAllFile(Iterable iterable)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureFileIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureFileIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, file_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field List file_>
	//    8   16:invokestatic    #94  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			fileBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #101 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$FileDescriptorSet$Builder addFile(int i, r r)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureFileIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureFileIsMutable()>
			file_.add(i, ((Object) (r.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List file_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #110 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #116 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			fileBuilder_.addMessage(i, ((AbstractMessage) (r.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #110 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto$Builder.build()>
	//   20   40:invokevirtual   #120 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$FileDescriptorSet$Builder addFile(int i, DescriptorProtos.FileDescriptorProto filedescriptorproto)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(filedescriptorproto == null)
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
				ensureFileIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #88  <Method void ensureFileIsMutable()>
				file_.add(i, ((Object) (filedescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field List file_>
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
			fileBuilder_.addMessage(i, ((AbstractMessage) (filedescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #120 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$FileDescriptorSet$Builder addFile(r r)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureFileIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureFileIsMutable()>
			file_.add(((Object) (r.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List file_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #110 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto$Builder.build()>
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
			fileBuilder_.addMessage(((AbstractMessage) (r.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #110 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto$Builder.build()>
	//   19   39:invokevirtual   #131 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$FileDescriptorSet$Builder addFile(DescriptorProtos.FileDescriptorProto filedescriptorproto)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(filedescriptorproto == null)
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
				ensureFileIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #88  <Method void ensureFileIsMutable()>
				file_.add(((Object) (filedescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field List file_>
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
			fileBuilder_.addMessage(((AbstractMessage) (filedescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #131 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public r addFileBuilder()
	{
		return (r)getFileFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.FileDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getFileFieldBuilder()>
	//    2    4:invokestatic    #139 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #143 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #106 <Class DescriptorProtos$FileDescriptorProto$Builder>
	//    5   13:areturn         
	}

	public r addFileBuilder(int i)
	{
		return (r)getFileFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.FileDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getFileFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #139 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #147 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #106 <Class DescriptorProtos$FileDescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FileDescriptorSet$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #152 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FileDescriptorSet$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #154 <Method DescriptorProtos$FileDescriptorSet$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #154 <Method DescriptorProtos$FileDescriptorSet$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos.FileDescriptorSet build()
	{
		DescriptorProtos.FileDescriptorSet filedescriptorset = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method DescriptorProtos$FileDescriptorSet buildPartial()>
	//    2    4:astore_1        
		if(!filedescriptorset.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #162 <Method boolean DescriptorProtos$FileDescriptorSet.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (filedescriptorset)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #166 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return filedescriptorset;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method DescriptorProtos$FileDescriptorSet build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method DescriptorProtos$FileDescriptorSet build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.FileDescriptorSet buildPartial()
	{
		DescriptorProtos.FileDescriptorSet filedescriptorset = new DescriptorProtos.FileDescriptorSet(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$FileDescriptorSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #173 <Method void DescriptorProtos$FileDescriptorSet(GeneratedMessageV3$Builder, DescriptorProtos$1)>
	//    5    9:astore_2        
		int i = bitField0_;
	//    6   10:aload_0         
	//    7   11:getfield        #47  <Field int bitField0_>
	//    8   14:istore_1        
		if(fileBuilder_ == null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
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
				file_ = Collections.unmodifiableList(file_);
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #33  <Field List file_>
	//   21   37:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
	//   22   40:putfield        #33  <Field List file_>
				bitField0_ = bitField0_ & -2;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #47  <Field int bitField0_>
	//   26   48:bipush          -2
	//   27   50:iand            
	//   28   51:putfield        #47  <Field int bitField0_>
			}
			DescriptorProtos.FileDescriptorSet.access$502(filedescriptorset, file_);
	//   29   54:aload_2         
	//   30   55:aload_0         
	//   31   56:getfield        #33  <Field List file_>
	//   32   59:invokestatic    #181 <Method List DescriptorProtos$FileDescriptorSet.access$502(DescriptorProtos$FileDescriptorSet, List)>
	//   33   62:pop             
		} else
	//*  34   63:goto            78
		{
			DescriptorProtos.FileDescriptorSet.access$502(filedescriptorset, fileBuilder_.build());
	//   35   66:aload_2         
	//   36   67:aload_0         
	//   37   68:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   38   71:invokevirtual   #183 <Method List RepeatedFieldBuilderV3.build()>
	//   39   74:invokestatic    #181 <Method List DescriptorProtos$FileDescriptorSet.access$502(DescriptorProtos$FileDescriptorSet, List)>
	//   40   77:pop             
		}
		onBuilt();
	//   41   78:aload_0         
	//   42   79:invokevirtual   #186 <Method void onBuilt()>
		return filedescriptorset;
	//   43   82:aload_2         
	//   44   83:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method DescriptorProtos$FileDescriptorSet buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method DescriptorProtos$FileDescriptorSet buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method DescriptorProtos$FileDescriptorSet$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		if(fileBuilder_ == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   5    9:ifnonnull       32
		{
			file_ = Collections.emptyList();
	//    6   12:aload_0         
	//    7   13:invokestatic    #31  <Method List Collections.emptyList()>
	//    8   16:putfield        #33  <Field List file_>
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
			fileBuilder_.clear();
	//   17   32:aload_0         
	//   18   33:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
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
	//    1    1:invokevirtual   #191 <Method DescriptorProtos$FileDescriptorSet$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method DescriptorProtos$FileDescriptorSet$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method DescriptorProtos$FileDescriptorSet$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$FileDescriptorSet$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #203 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FileDescriptorSet$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #205 <Method DescriptorProtos$FileDescriptorSet$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #205 <Method DescriptorProtos$FileDescriptorSet$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder clearFile()
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       31
		{
			file_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #31  <Method List Collections.emptyList()>
	//    5   11:putfield        #33  <Field List file_>
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
			fileBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
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
	//    2    2:invokevirtual   #212 <Method DescriptorProtos$FileDescriptorSet$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$FileDescriptorSet$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #215 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FileDescriptorSet$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #212 <Method DescriptorProtos$FileDescriptorSet$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #212 <Method DescriptorProtos$FileDescriptorSet$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$FileDescriptorSet$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$FileDescriptorSet$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder clone()
	{
		return (DescriptorProtos$FileDescriptorSet$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #222 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$FileDescriptorSet$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$FileDescriptorSet$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$FileDescriptorSet$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$FileDescriptorSet$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$FileDescriptorSet$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.FileDescriptorSet getDefaultInstanceForType()
	{
		return DescriptorProtos.FileDescriptorSet.getDefaultInstance();
	//    0    0:invokestatic    #229 <Method DescriptorProtos$FileDescriptorSet DescriptorProtos$FileDescriptorSet.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #231 <Method DescriptorProtos$FileDescriptorSet getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #231 <Method DescriptorProtos$FileDescriptorSet getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$000();
	//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$000()>
	//    1    3:areturn         
	}

	public DescriptorProtos.FileDescriptorProto getFile(int i)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.FileDescriptorProto)file_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List file_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #238 <Method Object List.get(int)>
	//    7   17:checkcast       #136 <Class DescriptorProtos$FileDescriptorProto>
	//    8   20:areturn         
		else
			return (DescriptorProtos.FileDescriptorProto)fileBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #242 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #136 <Class DescriptorProtos$FileDescriptorProto>
	//   14   32:areturn         
	}

	public r getFileBuilder(int i)
	{
		return (r)getFileFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getFileFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #247 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #106 <Class DescriptorProtos$FileDescriptorProto$Builder>
	//    5   11:areturn         
	}

	public List getFileBuilderList()
	{
		return getFileFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getFileFieldBuilder()>
	//    2    4:invokevirtual   #251 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getFileCount()
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       17
			return file_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List file_>
	//    5   11:invokeinterface #257 <Method int List.size()>
	//    6   16:ireturn         
		else
			return fileBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//    9   21:invokevirtual   #260 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getFileList()
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(file_);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List file_>
	//    5   11:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return fileBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//    9   19:invokevirtual   #264 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public er getFileOrBuilder(int i)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       21
			return (er)file_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List file_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #238 <Method Object List.get(int)>
	//    7   17:checkcast       #269 <Class DescriptorProtos$FileDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return (er)fileBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #273 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #269 <Class DescriptorProtos$FileDescriptorProtoOrBuilder>
	//   14   32:areturn         
	}

	public List getFileOrBuilderList()
	{
		if(fileBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnull          15
			return fileBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//    5   11:invokevirtual   #277 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(file_);
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field List file_>
	//    9   19:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$100().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FileDescriptorSet, com/google/protobuf/DescriptorProtos$FileDescriptorSet$Builder);
	//    0    0:invokestatic    #283 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$100()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$FileDescriptorSet>
	//    2    5:ldc1            #2   <Class DescriptorProtos$FileDescriptorSet$Builder>
	//    3    7:invokevirtual   #289 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < getFileCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #291 <Method int getFileCount()>
	//*   5    7:icmpge          30
			if(!getFile(i).isInitialized())
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #293 <Method DescriptorProtos$FileDescriptorProto getFile(int)>
	//*   9   15:invokevirtual   #294 <Method boolean DescriptorProtos$FileDescriptorProto.isInitialized()>
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
	//    3    3:invokevirtual   #301 <Method DescriptorProtos$FileDescriptorSet$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #305 <Method DescriptorProtos$FileDescriptorSet$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #301 <Method DescriptorProtos$FileDescriptorSet$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.FileDescriptorSet)DescriptorProtos.FileDescriptorSet.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #312 <Field Parser DescriptorProtos$FileDescriptorSet.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #318 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$FileDescriptorSet>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.FileDescriptorSet) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #321 <Method DescriptorProtos$FileDescriptorSet$Builder mergeFrom(DescriptorProtos$FileDescriptorSet)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #324 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$FileDescriptorSet>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #328 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #321 <Method DescriptorProtos$FileDescriptorSet$Builder mergeFrom(DescriptorProtos$FileDescriptorSet)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.FileDescriptorSet)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.FileDescriptorSet) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$FileDescriptorSet$Builder mergeFrom(DescriptorProtos.FileDescriptorSet filedescriptorset)
	{
		if(filedescriptorset == DescriptorProtos.FileDescriptorSet.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #229 <Method DescriptorProtos$FileDescriptorSet DescriptorProtos$FileDescriptorSet.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(fileBuilder_ == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   7   13:ifnonnull       87
		{
			if(!DescriptorProtos.FileDescriptorSet.access$500(filedescriptorset).isEmpty())
	//*   8   16:aload_1         
	//*   9   17:invokestatic    #332 <Method List DescriptorProtos$FileDescriptorSet.access$500(DescriptorProtos$FileDescriptorSet)>
	//*  10   20:invokeinterface #335 <Method boolean List.isEmpty()>
	//*  11   25:ifne            176
			{
				if(file_.isEmpty())
	//*  12   28:aload_0         
	//*  13   29:getfield        #33  <Field List file_>
	//*  14   32:invokeinterface #335 <Method boolean List.isEmpty()>
	//*  15   37:ifeq            62
				{
					file_ = DescriptorProtos.FileDescriptorSet.access$500(filedescriptorset);
	//   16   40:aload_0         
	//   17   41:aload_1         
	//   18   42:invokestatic    #332 <Method List DescriptorProtos$FileDescriptorSet.access$500(DescriptorProtos$FileDescriptorSet)>
	//   19   45:putfield        #33  <Field List file_>
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
					ensureFileIsMutable();
	//   27   62:aload_0         
	//   28   63:invokespecial   #88  <Method void ensureFileIsMutable()>
					file_.addAll(((java.util.Collection) (DescriptorProtos.FileDescriptorSet.access$500(filedescriptorset))));
	//   29   66:aload_0         
	//   30   67:getfield        #33  <Field List file_>
	//   31   70:aload_1         
	//   32   71:invokestatic    #332 <Method List DescriptorProtos$FileDescriptorSet.access$500(DescriptorProtos$FileDescriptorSet)>
	//   33   74:invokeinterface #338 <Method boolean List.addAll(java.util.Collection)>
	//   34   79:pop             
				}
				onChanged();
	//   35   80:aload_0         
	//   36   81:invokevirtual   #97  <Method void onChanged()>
			}
		} else
	//*  37   84:goto            176
		if(!DescriptorProtos.FileDescriptorSet.access$500(filedescriptorset).isEmpty())
	//*  38   87:aload_1         
	//*  39   88:invokestatic    #332 <Method List DescriptorProtos$FileDescriptorSet.access$500(DescriptorProtos$FileDescriptorSet)>
	//*  40   91:invokeinterface #335 <Method boolean List.isEmpty()>
	//*  41   96:ifne            176
			if(fileBuilder_.isEmpty())
	//*  42   99:aload_0         
	//*  43  100:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*  44  103:invokevirtual   #339 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  45  106:ifeq            164
			{
				fileBuilder_.dispose();
	//   46  109:aload_0         
	//   47  110:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   48  113:invokevirtual   #342 <Method void RepeatedFieldBuilderV3.dispose()>
				fileBuilder_ = null;
	//   49  116:aload_0         
	//   50  117:aconst_null     
	//   51  118:putfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
				file_ = DescriptorProtos.FileDescriptorSet.access$500(filedescriptorset);
	//   52  121:aload_0         
	//   53  122:aload_1         
	//   54  123:invokestatic    #332 <Method List DescriptorProtos$FileDescriptorSet.access$500(DescriptorProtos$FileDescriptorSet)>
	//   55  126:putfield        #33  <Field List file_>
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
					repeatedfieldbuilderv3 = getFileFieldBuilder();
	//   64  146:aload_0         
	//   65  147:invokespecial   #84  <Method RepeatedFieldBuilderV3 getFileFieldBuilder()>
	//   66  150:astore_2        
				else
	//*  67  151:goto            156
					repeatedfieldbuilderv3 = null;
	//   68  154:aconst_null     
	//   69  155:astore_2        
				fileBuilder_ = repeatedfieldbuilderv3;
	//   70  156:aload_0         
	//   71  157:aload_2         
	//   72  158:putfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
			} else
	//*  73  161:goto            176
			{
				fileBuilder_.addAllMessages(((Iterable) (DescriptorProtos.FileDescriptorSet.access$500(filedescriptorset))));
	//   74  164:aload_0         
	//   75  165:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   76  168:aload_1         
	//   77  169:invokestatic    #332 <Method List DescriptorProtos$FileDescriptorSet.access$500(DescriptorProtos$FileDescriptorSet)>
	//   78  172:invokevirtual   #101 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   79  175:pop             
			}
		mergeUnknownFields(filedescriptorset.unknownFields);
	//   80  176:aload_0         
	//   81  177:aload_1         
	//   82  178:getfield        #346 <Field UnknownFieldSet DescriptorProtos$FileDescriptorSet.unknownFields>
	//   83  181:invokevirtual   #350 <Method DescriptorProtos$FileDescriptorSet$Builder mergeUnknownFields(UnknownFieldSet)>
	//   84  184:pop             
		onChanged();
	//   85  185:aload_0         
	//   86  186:invokevirtual   #97  <Method void onChanged()>
		return this;
	//   87  189:aload_0         
	//   88  190:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.FileDescriptorSet)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$FileDescriptorSet>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.FileDescriptorSet)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$FileDescriptorSet>
	//    6   12:invokevirtual   #321 <Method DescriptorProtos$FileDescriptorSet$Builder mergeFrom(DescriptorProtos$FileDescriptorSet)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #352 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #301 <Method DescriptorProtos$FileDescriptorSet$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #305 <Method DescriptorProtos$FileDescriptorSet$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #301 <Method DescriptorProtos$FileDescriptorSet$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #350 <Method DescriptorProtos$FileDescriptorSet$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$FileDescriptorSet$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FileDescriptorSet$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #359 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FileDescriptorSet$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #350 <Method DescriptorProtos$FileDescriptorSet$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #350 <Method DescriptorProtos$FileDescriptorSet$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder removeFile(int i)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureFileIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureFileIsMutable()>
			file_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List file_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #365 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			fileBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #368 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$FileDescriptorSet$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FileDescriptorSet$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #371 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FileDescriptorSet$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #373 <Method DescriptorProtos$FileDescriptorSet$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #373 <Method DescriptorProtos$FileDescriptorSet$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FileDescriptorSet$Builder setFile(int i, r r)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureFileIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureFileIsMutable()>
			file_.set(i, ((Object) (r.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List file_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #110 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #378 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			fileBuilder_.setMessage(i, ((AbstractMessage) (r.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #110 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto$Builder.build()>
	//   21   41:invokevirtual   #381 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$FileDescriptorSet$Builder setFile(int i, DescriptorProtos.FileDescriptorProto filedescriptorproto)
	{
		if(fileBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(filedescriptorproto == null)
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
				ensureFileIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #88  <Method void ensureFileIsMutable()>
				file_.set(i, ((Object) (filedescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field List file_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #378 <Method Object List.set(int, Object)>
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
			fileBuilder_.setMessage(i, ((AbstractMessage) (filedescriptorproto)));
	//   21   41:aload_0         
	//   22   42:getfield        #61  <Field RepeatedFieldBuilderV3 fileBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #381 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public DescriptorProtos$FileDescriptorSet$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$FileDescriptorSet$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #386 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$FileDescriptorSet$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #388 <Method DescriptorProtos$FileDescriptorSet$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #388 <Method DescriptorProtos$FileDescriptorSet$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public final DescriptorProtos$FileDescriptorSet$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FileDescriptorSet$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #392 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FileDescriptorSet$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #394 <Method DescriptorProtos$FileDescriptorSet$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #394 <Method DescriptorProtos$FileDescriptorSet$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private RepeatedFieldBuilderV3 fileBuilder_;
	private List file_;

	private DescriptorProtos$FileDescriptorSet$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void GeneratedMessageV3$Builder()>
		file_ = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #31  <Method List Collections.emptyList()>
	//    4    8:putfield        #33  <Field List file_>
		maybeForceBuilderInitialization();
	//    5   11:aload_0         
	//    6   12:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
	//    7   15:return          
	}

	DescriptorProtos$FileDescriptorSet$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void DescriptorProtos$FileDescriptorSet$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$FileDescriptorSet$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		file_ = Collections.emptyList();
	//    3    5:aload_0         
	//    4    6:invokestatic    #31  <Method List Collections.emptyList()>
	//    5    9:putfield        #33  <Field List file_>
		maybeForceBuilderInitialization();
	//    6   12:aload_0         
	//    7   13:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
	//    8   16:return          
	}

	DescriptorProtos$FileDescriptorSet$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void DescriptorProtos$FileDescriptorSet$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
