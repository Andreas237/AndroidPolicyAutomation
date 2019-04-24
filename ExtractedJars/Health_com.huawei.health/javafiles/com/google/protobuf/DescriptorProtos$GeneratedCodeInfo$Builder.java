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

public static final class DescriptorProtos$GeneratedCodeInfo$Builder extends GeneratedMessageV3.Builder
	implements 
{

	private void ensureAnnotationIsMutable()
	{
		if((bitField0_ & 1) != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          35
		{
			annotation_ = ((List) (new ArrayList(((java.util.Collection) (annotation_)))));
	//    6   10:aload_0         
	//    7   11:new             #49  <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field List annotation_>
	//   11   19:invokespecial   #52  <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #33  <Field List annotation_>
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

	private RepeatedFieldBuilderV3 getAnnotationFieldBuilder()
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = annotation_;
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List annotation_>
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
			annotationBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   29:aload_0         
	//   18   30:new             #58  <Class RepeatedFieldBuilderV3>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:invokevirtual   #62  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   40:aload_0         
	//   25   41:invokevirtual   #66  <Method boolean isClean()>
	//   26   44:invokespecial   #69  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   47:putfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
			annotation_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #33  <Field List annotation_>
		}
		return annotationBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   33   59:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$28800();
	//    0    0:invokestatic    #76  <Method Descriptors$Descriptor DescriptorProtos.access$28800()>
	//    1    3:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #82  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getAnnotationFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #84  <Method RepeatedFieldBuilderV3 getAnnotationFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder addAllAnnotation(Iterable iterable)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureAnnotationIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureAnnotationIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, annotation_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field List annotation_>
	//    8   16:invokestatic    #94  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			annotationBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #101 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder addAnnotation(int i, on.Builder builder)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureAnnotationIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureAnnotationIsMutable()>
			annotation_.add(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List annotation_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #110 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation$Builder.build()>
	//   10   20:invokeinterface #116 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			annotationBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #110 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation$Builder.build()>
	//   20   40:invokevirtual   #120 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder addAnnotation(int i, on on)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(on == null)
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
				ensureAnnotationIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #88  <Method void ensureAnnotationIsMutable()>
				annotation_.add(i, ((Object) (on)));
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field List annotation_>
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
			annotationBuilder_.addMessage(i, ((AbstractMessage) (on)));
	//   20   40:aload_0         
	//   21   41:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #120 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder addAnnotation(on.Builder builder)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureAnnotationIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureAnnotationIsMutable()>
			annotation_.add(((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List annotation_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #110 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation$Builder.build()>
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
			annotationBuilder_.addMessage(((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #110 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation$Builder.build()>
	//   19   39:invokevirtual   #131 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder addAnnotation(on on)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(on == null)
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
				ensureAnnotationIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #88  <Method void ensureAnnotationIsMutable()>
				annotation_.add(((Object) (on)));
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field List annotation_>
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
			annotationBuilder_.addMessage(((AbstractMessage) (on)));
	//   20   40:aload_0         
	//   21   41:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #131 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public on.Builder addAnnotationBuilder()
	{
		return (on.Builder)getAnnotationFieldBuilder().addBuilder(((AbstractMessage) (on.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getAnnotationFieldBuilder()>
	//    2    4:invokestatic    #139 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation.getDefaultInstance()>
	//    3    7:invokevirtual   #143 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #106 <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    5   13:areturn         
	}

	public on.Builder addAnnotationBuilder(int i)
	{
		return (on.Builder)getAnnotationFieldBuilder().addBuilder(i, ((AbstractMessage) (on.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getAnnotationFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #139 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation.getDefaultInstance()>
	//    4    8:invokevirtual   #147 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #106 <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #152 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #154 <Method DescriptorProtos$GeneratedCodeInfo$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #154 <Method DescriptorProtos$GeneratedCodeInfo$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos.GeneratedCodeInfo build()
	{
		DescriptorProtos.GeneratedCodeInfo generatedcodeinfo = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method DescriptorProtos$GeneratedCodeInfo buildPartial()>
	//    2    4:astore_1        
		if(!generatedcodeinfo.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #162 <Method boolean DescriptorProtos$GeneratedCodeInfo.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (generatedcodeinfo)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #166 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return generatedcodeinfo;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method DescriptorProtos$GeneratedCodeInfo build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method DescriptorProtos$GeneratedCodeInfo build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.GeneratedCodeInfo buildPartial()
	{
		DescriptorProtos.GeneratedCodeInfo generatedcodeinfo = new DescriptorProtos.GeneratedCodeInfo(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$GeneratedCodeInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #173 <Method void DescriptorProtos$GeneratedCodeInfo(GeneratedMessageV3$Builder, DescriptorProtos$1)>
	//    5    9:astore_2        
		int i = bitField0_;
	//    6   10:aload_0         
	//    7   11:getfield        #47  <Field int bitField0_>
	//    8   14:istore_1        
		if(annotationBuilder_ == null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
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
				annotation_ = Collections.unmodifiableList(annotation_);
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #33  <Field List annotation_>
	//   21   37:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
	//   22   40:putfield        #33  <Field List annotation_>
				bitField0_ = bitField0_ & -2;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #47  <Field int bitField0_>
	//   26   48:bipush          -2
	//   27   50:iand            
	//   28   51:putfield        #47  <Field int bitField0_>
			}
			DescriptorProtos.GeneratedCodeInfo.access$30402(generatedcodeinfo, annotation_);
	//   29   54:aload_2         
	//   30   55:aload_0         
	//   31   56:getfield        #33  <Field List annotation_>
	//   32   59:invokestatic    #181 <Method List DescriptorProtos$GeneratedCodeInfo.access$30402(DescriptorProtos$GeneratedCodeInfo, List)>
	//   33   62:pop             
		} else
	//*  34   63:goto            78
		{
			DescriptorProtos.GeneratedCodeInfo.access$30402(generatedcodeinfo, annotationBuilder_.build());
	//   35   66:aload_2         
	//   36   67:aload_0         
	//   37   68:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   38   71:invokevirtual   #183 <Method List RepeatedFieldBuilderV3.build()>
	//   39   74:invokestatic    #181 <Method List DescriptorProtos$GeneratedCodeInfo.access$30402(DescriptorProtos$GeneratedCodeInfo, List)>
	//   40   77:pop             
		}
		onBuilt();
	//   41   78:aload_0         
	//   42   79:invokevirtual   #186 <Method void onBuilt()>
		return generatedcodeinfo;
	//   43   82:aload_2         
	//   44   83:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method DescriptorProtos$GeneratedCodeInfo buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method DescriptorProtos$GeneratedCodeInfo buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method DescriptorProtos$GeneratedCodeInfo$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		if(annotationBuilder_ == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   5    9:ifnonnull       32
		{
			annotation_ = Collections.emptyList();
	//    6   12:aload_0         
	//    7   13:invokestatic    #31  <Method List Collections.emptyList()>
	//    8   16:putfield        #33  <Field List annotation_>
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
			annotationBuilder_.clear();
	//   17   32:aload_0         
	//   18   33:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
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
	//    1    1:invokevirtual   #191 <Method DescriptorProtos$GeneratedCodeInfo$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method DescriptorProtos$GeneratedCodeInfo$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method DescriptorProtos$GeneratedCodeInfo$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder clearAnnotation()
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       31
		{
			annotation_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #31  <Method List Collections.emptyList()>
	//    5   11:putfield        #33  <Field List annotation_>
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
			annotationBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   18   35:invokevirtual   #196 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #204 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #206 <Method DescriptorProtos$GeneratedCodeInfo$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #206 <Method DescriptorProtos$GeneratedCodeInfo$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #212 <Method DescriptorProtos$GeneratedCodeInfo$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #215 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #212 <Method DescriptorProtos$GeneratedCodeInfo$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #212 <Method DescriptorProtos$GeneratedCodeInfo$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$GeneratedCodeInfo$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$GeneratedCodeInfo$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder clone()
	{
		return (DescriptorProtos$GeneratedCodeInfo$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #222 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$GeneratedCodeInfo$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$GeneratedCodeInfo$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$GeneratedCodeInfo$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method DescriptorProtos$GeneratedCodeInfo$Builder clone()>
	//    2    4:areturn         
	}

	public on getAnnotation(int i)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       21
			return (on)annotation_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List annotation_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #232 <Method Object List.get(int)>
	//    7   17:checkcast       #136 <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    8   20:areturn         
		else
			return (on)annotationBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #236 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #136 <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//   14   32:areturn         
	}

	public on.Builder getAnnotationBuilder(int i)
	{
		return (on.Builder)getAnnotationFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getAnnotationFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #241 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #106 <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    5   11:areturn         
	}

	public List getAnnotationBuilderList()
	{
		return getAnnotationFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method RepeatedFieldBuilderV3 getAnnotationFieldBuilder()>
	//    2    4:invokevirtual   #245 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getAnnotationCount()
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       17
			return annotation_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List annotation_>
	//    5   11:invokeinterface #251 <Method int List.size()>
	//    6   16:ireturn         
		else
			return annotationBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//    9   21:invokevirtual   #254 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getAnnotationList()
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(annotation_);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List annotation_>
	//    5   11:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return annotationBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//    9   19:invokevirtual   #258 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public onOrBuilder getAnnotationOrBuilder(int i)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       21
			return (onOrBuilder)annotation_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field List annotation_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #232 <Method Object List.get(int)>
	//    7   17:checkcast       #263 <Class DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder>
	//    8   20:areturn         
		else
			return (onOrBuilder)annotationBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #267 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #263 <Class DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder>
	//   14   32:areturn         
	}

	public List getAnnotationOrBuilderList()
	{
		if(annotationBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnull          15
			return annotationBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//    5   11:invokevirtual   #271 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(annotation_);
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field List annotation_>
	//    9   19:invokestatic    #177 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public DescriptorProtos.GeneratedCodeInfo getDefaultInstanceForType()
	{
		return DescriptorProtos.GeneratedCodeInfo.getDefaultInstance();
	//    0    0:invokestatic    #275 <Method DescriptorProtos$GeneratedCodeInfo DescriptorProtos$GeneratedCodeInfo.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #277 <Method DescriptorProtos$GeneratedCodeInfo getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #277 <Method DescriptorProtos$GeneratedCodeInfo getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$28800();
	//    0    0:invokestatic    #76  <Method Descriptors$Descriptor DescriptorProtos.access$28800()>
	//    1    3:areturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$28900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$GeneratedCodeInfo, com/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Builder);
	//    0    0:invokestatic    #283 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$28900()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$GeneratedCodeInfo>
	//    2    5:ldc1            #2   <Class DescriptorProtos$GeneratedCodeInfo$Builder>
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
	//    3    3:invokevirtual   #296 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #300 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #296 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.GeneratedCodeInfo)DescriptorProtos.GeneratedCodeInfo.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #307 <Field Parser DescriptorProtos$GeneratedCodeInfo.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #313 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$GeneratedCodeInfo>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.GeneratedCodeInfo) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #316 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(DescriptorProtos$GeneratedCodeInfo)>
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
	//*  23   40:checkcast       #9   <Class DescriptorProtos$GeneratedCodeInfo>
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
	//*  35   58:invokevirtual   #316 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(DescriptorProtos$GeneratedCodeInfo)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.GeneratedCodeInfo)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.GeneratedCodeInfo) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(DescriptorProtos.GeneratedCodeInfo generatedcodeinfo)
	{
		if(generatedcodeinfo == DescriptorProtos.GeneratedCodeInfo.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #275 <Method DescriptorProtos$GeneratedCodeInfo DescriptorProtos$GeneratedCodeInfo.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(annotationBuilder_ == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   7   13:ifnonnull       87
		{
			if(!DescriptorProtos.GeneratedCodeInfo.access$30400(generatedcodeinfo).isEmpty())
	//*   8   16:aload_1         
	//*   9   17:invokestatic    #327 <Method List DescriptorProtos$GeneratedCodeInfo.access$30400(DescriptorProtos$GeneratedCodeInfo)>
	//*  10   20:invokeinterface #330 <Method boolean List.isEmpty()>
	//*  11   25:ifne            176
			{
				if(annotation_.isEmpty())
	//*  12   28:aload_0         
	//*  13   29:getfield        #33  <Field List annotation_>
	//*  14   32:invokeinterface #330 <Method boolean List.isEmpty()>
	//*  15   37:ifeq            62
				{
					annotation_ = DescriptorProtos.GeneratedCodeInfo.access$30400(generatedcodeinfo);
	//   16   40:aload_0         
	//   17   41:aload_1         
	//   18   42:invokestatic    #327 <Method List DescriptorProtos$GeneratedCodeInfo.access$30400(DescriptorProtos$GeneratedCodeInfo)>
	//   19   45:putfield        #33  <Field List annotation_>
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
					ensureAnnotationIsMutable();
	//   27   62:aload_0         
	//   28   63:invokespecial   #88  <Method void ensureAnnotationIsMutable()>
					annotation_.addAll(((java.util.Collection) (DescriptorProtos.GeneratedCodeInfo.access$30400(generatedcodeinfo))));
	//   29   66:aload_0         
	//   30   67:getfield        #33  <Field List annotation_>
	//   31   70:aload_1         
	//   32   71:invokestatic    #327 <Method List DescriptorProtos$GeneratedCodeInfo.access$30400(DescriptorProtos$GeneratedCodeInfo)>
	//   33   74:invokeinterface #333 <Method boolean List.addAll(java.util.Collection)>
	//   34   79:pop             
				}
				onChanged();
	//   35   80:aload_0         
	//   36   81:invokevirtual   #97  <Method void onChanged()>
			}
		} else
	//*  37   84:goto            176
		if(!DescriptorProtos.GeneratedCodeInfo.access$30400(generatedcodeinfo).isEmpty())
	//*  38   87:aload_1         
	//*  39   88:invokestatic    #327 <Method List DescriptorProtos$GeneratedCodeInfo.access$30400(DescriptorProtos$GeneratedCodeInfo)>
	//*  40   91:invokeinterface #330 <Method boolean List.isEmpty()>
	//*  41   96:ifne            176
			if(annotationBuilder_.isEmpty())
	//*  42   99:aload_0         
	//*  43  100:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*  44  103:invokevirtual   #334 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  45  106:ifeq            164
			{
				annotationBuilder_.dispose();
	//   46  109:aload_0         
	//   47  110:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   48  113:invokevirtual   #337 <Method void RepeatedFieldBuilderV3.dispose()>
				annotationBuilder_ = null;
	//   49  116:aload_0         
	//   50  117:aconst_null     
	//   51  118:putfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
				annotation_ = DescriptorProtos.GeneratedCodeInfo.access$30400(generatedcodeinfo);
	//   52  121:aload_0         
	//   53  122:aload_1         
	//   54  123:invokestatic    #327 <Method List DescriptorProtos$GeneratedCodeInfo.access$30400(DescriptorProtos$GeneratedCodeInfo)>
	//   55  126:putfield        #33  <Field List annotation_>
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
					repeatedfieldbuilderv3 = getAnnotationFieldBuilder();
	//   64  146:aload_0         
	//   65  147:invokespecial   #84  <Method RepeatedFieldBuilderV3 getAnnotationFieldBuilder()>
	//   66  150:astore_2        
				else
	//*  67  151:goto            156
					repeatedfieldbuilderv3 = null;
	//   68  154:aconst_null     
	//   69  155:astore_2        
				annotationBuilder_ = repeatedfieldbuilderv3;
	//   70  156:aload_0         
	//   71  157:aload_2         
	//   72  158:putfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
			} else
	//*  73  161:goto            176
			{
				annotationBuilder_.addAllMessages(((Iterable) (DescriptorProtos.GeneratedCodeInfo.access$30400(generatedcodeinfo))));
	//   74  164:aload_0         
	//   75  165:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   76  168:aload_1         
	//   77  169:invokestatic    #327 <Method List DescriptorProtos$GeneratedCodeInfo.access$30400(DescriptorProtos$GeneratedCodeInfo)>
	//   78  172:invokevirtual   #101 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   79  175:pop             
			}
		mergeUnknownFields(generatedcodeinfo.unknownFields);
	//   80  176:aload_0         
	//   81  177:aload_1         
	//   82  178:getfield        #341 <Field UnknownFieldSet DescriptorProtos$GeneratedCodeInfo.unknownFields>
	//   83  181:invokevirtual   #345 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeUnknownFields(UnknownFieldSet)>
	//   84  184:pop             
		onChanged();
	//   85  185:aload_0         
	//   86  186:invokevirtual   #97  <Method void onChanged()>
		return this;
	//   87  189:aload_0         
	//   88  190:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.GeneratedCodeInfo)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$GeneratedCodeInfo>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.GeneratedCodeInfo)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$GeneratedCodeInfo>
	//    6   12:invokevirtual   #316 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(DescriptorProtos$GeneratedCodeInfo)>
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
	//    3    3:invokevirtual   #296 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #300 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #296 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #345 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$GeneratedCodeInfo$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #354 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #345 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #345 <Method DescriptorProtos$GeneratedCodeInfo$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder removeAnnotation(int i)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureAnnotationIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureAnnotationIsMutable()>
			annotation_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List annotation_>
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
			annotationBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #363 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder setAnnotation(int i, on.Builder builder)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureAnnotationIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #88  <Method void ensureAnnotationIsMutable()>
			annotation_.set(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field List annotation_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #110 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation$Builder.build()>
	//   10   20:invokeinterface #368 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #97  <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			annotationBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #110 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation$Builder.build()>
	//   21   41:invokevirtual   #371 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder setAnnotation(int i, on on)
	{
		if(annotationBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(on == null)
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
				ensureAnnotationIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #88  <Method void ensureAnnotationIsMutable()>
				annotation_.set(i, ((Object) (on)));
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field List annotation_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #368 <Method Object List.set(int, Object)>
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
			annotationBuilder_.setMessage(i, ((AbstractMessage) (on)));
	//   21   41:aload_0         
	//   22   42:getfield        #56  <Field RepeatedFieldBuilderV3 annotationBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #371 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #374 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #376 <Method DescriptorProtos$GeneratedCodeInfo$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #376 <Method DescriptorProtos$GeneratedCodeInfo$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #381 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #383 <Method DescriptorProtos$GeneratedCodeInfo$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #383 <Method DescriptorProtos$GeneratedCodeInfo$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public final DescriptorProtos$GeneratedCodeInfo$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #387 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #389 <Method DescriptorProtos$GeneratedCodeInfo$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #389 <Method DescriptorProtos$GeneratedCodeInfo$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private RepeatedFieldBuilderV3 annotationBuilder_;
	private List annotation_;
	private int bitField0_;

	private DescriptorProtos$GeneratedCodeInfo$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void GeneratedMessageV3$Builder()>
		annotation_ = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #31  <Method List Collections.emptyList()>
	//    4    8:putfield        #33  <Field List annotation_>
		maybeForceBuilderInitialization();
	//    5   11:aload_0         
	//    6   12:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
	//    7   15:return          
	}

	DescriptorProtos$GeneratedCodeInfo$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void DescriptorProtos$GeneratedCodeInfo$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$GeneratedCodeInfo$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		annotation_ = Collections.emptyList();
	//    3    5:aload_0         
	//    4    6:invokestatic    #31  <Method List Collections.emptyList()>
	//    5    9:putfield        #33  <Field List annotation_>
		maybeForceBuilderInitialization();
	//    6   12:aload_0         
	//    7   13:invokespecial   #36  <Method void maybeForceBuilderInitialization()>
	//    8   16:return          
	}

	DescriptorProtos$GeneratedCodeInfo$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void DescriptorProtos$GeneratedCodeInfo$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
