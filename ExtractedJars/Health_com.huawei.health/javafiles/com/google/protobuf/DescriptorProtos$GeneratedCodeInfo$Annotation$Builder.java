// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, GeneratedMessageV3, ByteString, InvalidProtocolBufferException, 
//			Parser, Message, MessageLite, CodedInputStream, 
//			ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder extends GeneratedMessageV3.Builder
	implements 
{

	private void ensurePathIsMutable()
	{
		if((bitField0_ & 1) != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          35
		{
			path_ = ((List) (new ArrayList(((java.util.Collection) (path_)))));
	//    6   10:aload_0         
	//    7   11:new             #57  <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #37  <Field List path_>
	//   11   19:invokespecial   #60  <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #37  <Field List path_>
			bitField0_ = bitField0_ | 1;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #55  <Field int bitField0_>
	//   16   30:iconst_1        
	//   17   31:ior             
	//   18   32:putfield        #55  <Field int bitField0_>
		}
	//   19   35:return          
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$29000();
	//    0    0:invokestatic    #65  <Method Descriptors$Descriptor DescriptorProtos.access$29000()>
	//    1    3:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
	//    0    0:getstatic       #71  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//    1    3:istore_1        
	//    2    4:return          
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder addAllPath(Iterable iterable)
	{
		ensurePathIsMutable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void ensurePathIsMutable()>
		AbstractMessageLite.Builder.addAll(iterable, path_);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field List path_>
	//    5    9:invokestatic    #81  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
		onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #84  <Method void onChanged()>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder addPath(int i)
	{
		ensurePathIsMutable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void ensurePathIsMutable()>
		path_.add(((Object) (Integer.valueOf(i))));
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field List path_>
	//    4    8:iload_1         
	//    5    9:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//    6   12:invokeinterface #100 <Method boolean List.add(Object)>
	//    7   17:pop             
		onChanged();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #84  <Method void onChanged()>
		return this;
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #105 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #107 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #107 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos.GeneratedCodeInfo.Annotation build()
	{
		DescriptorProtos.GeneratedCodeInfo.Annotation annotation = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method DescriptorProtos$GeneratedCodeInfo$Annotation buildPartial()>
	//    2    4:astore_1        
		if(!annotation.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #117 <Method boolean DescriptorProtos$GeneratedCodeInfo$Annotation.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (annotation)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #121 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return annotation;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method DescriptorProtos$GeneratedCodeInfo$Annotation build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method DescriptorProtos$GeneratedCodeInfo$Annotation build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.GeneratedCodeInfo.Annotation buildPartial()
	{
		DescriptorProtos.GeneratedCodeInfo.Annotation annotation = new DescriptorProtos.GeneratedCodeInfo.Annotation(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #14  <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #128 <Method void DescriptorProtos$GeneratedCodeInfo$Annotation(GeneratedMessageV3$Builder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #55  <Field int bitField0_>
	//    8   15:istore_3        
		int j = 0;
	//    9   16:iconst_0        
	//   10   17:istore_2        
		if((bitField0_ & 1) == 1)
	//*  11   18:aload_0         
	//*  12   19:getfield        #55  <Field int bitField0_>
	//*  13   22:iconst_1        
	//*  14   23:iand            
	//*  15   24:iconst_1        
	//*  16   25:icmpne          50
		{
			path_ = Collections.unmodifiableList(path_);
	//   17   28:aload_0         
	//   18   29:aload_0         
	//   19   30:getfield        #37  <Field List path_>
	//   20   33:invokestatic    #132 <Method List Collections.unmodifiableList(List)>
	//   21   36:putfield        #37  <Field List path_>
			bitField0_ = bitField0_ & -2;
	//   22   39:aload_0         
	//   23   40:aload_0         
	//   24   41:getfield        #55  <Field int bitField0_>
	//   25   44:bipush          -2
	//   26   46:iand            
	//   27   47:putfield        #55  <Field int bitField0_>
		}
		DescriptorProtos.GeneratedCodeInfo.Annotation.access$29502(annotation, path_);
	//   28   50:aload           4
	//   29   52:aload_0         
	//   30   53:getfield        #37  <Field List path_>
	//   31   56:invokestatic    #136 <Method List DescriptorProtos$GeneratedCodeInfo$Annotation.access$29502(DescriptorProtos$GeneratedCodeInfo$Annotation, List)>
	//   32   59:pop             
		if((k & 2) == 2)
	//*  33   60:iload_3         
	//*  34   61:iconst_2        
	//*  35   62:iand            
	//*  36   63:iconst_2        
	//*  37   64:icmpne          69
			j = 1;
	//   38   67:iconst_1        
	//   39   68:istore_2        
		DescriptorProtos.GeneratedCodeInfo.Annotation.access$29602(annotation, sourceFile_);
	//   40   69:aload           4
	//   41   71:aload_0         
	//   42   72:getfield        #41  <Field Object sourceFile_>
	//   43   75:invokestatic    #140 <Method Object DescriptorProtos$GeneratedCodeInfo$Annotation.access$29602(DescriptorProtos$GeneratedCodeInfo$Annotation, Object)>
	//   44   78:pop             
		int i = j;
	//   45   79:iload_2         
	//   46   80:istore_1        
		if((k & 4) == 4)
	//*  47   81:iload_3         
	//*  48   82:iconst_4        
	//*  49   83:iand            
	//*  50   84:iconst_4        
	//*  51   85:icmpne          92
			i = j | 2;
	//   52   88:iload_2         
	//   53   89:iconst_2        
	//   54   90:ior             
	//   55   91:istore_1        
		DescriptorProtos.GeneratedCodeInfo.Annotation.access$29702(annotation, begin_);
	//   56   92:aload           4
	//   57   94:aload_0         
	//   58   95:getfield        #142 <Field int begin_>
	//   59   98:invokestatic    #146 <Method int DescriptorProtos$GeneratedCodeInfo$Annotation.access$29702(DescriptorProtos$GeneratedCodeInfo$Annotation, int)>
	//   60  101:pop             
		j = i;
	//   61  102:iload_1         
	//   62  103:istore_2        
		if((k & 8) == 8)
	//*  63  104:iload_3         
	//*  64  105:bipush          8
	//*  65  107:iand            
	//*  66  108:bipush          8
	//*  67  110:icmpne          117
			j = i | 4;
	//   68  113:iload_1         
	//   69  114:iconst_4        
	//   70  115:ior             
	//   71  116:istore_2        
		DescriptorProtos.GeneratedCodeInfo.Annotation.access$29802(annotation, end_);
	//   72  117:aload           4
	//   73  119:aload_0         
	//   74  120:getfield        #148 <Field int end_>
	//   75  123:invokestatic    #151 <Method int DescriptorProtos$GeneratedCodeInfo$Annotation.access$29802(DescriptorProtos$GeneratedCodeInfo$Annotation, int)>
	//   76  126:pop             
		DescriptorProtos.GeneratedCodeInfo.Annotation.access$29902(annotation, j);
	//   77  127:aload           4
	//   78  129:iload_2         
	//   79  130:invokestatic    #154 <Method int DescriptorProtos$GeneratedCodeInfo$Annotation.access$29902(DescriptorProtos$GeneratedCodeInfo$Annotation, int)>
	//   80  133:pop             
		onBuilt();
	//   81  134:aload_0         
	//   82  135:invokevirtual   #157 <Method void onBuilt()>
		return annotation;
	//   83  138:aload           4
	//   84  140:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method DescriptorProtos$GeneratedCodeInfo$Annotation buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method DescriptorProtos$GeneratedCodeInfo$Annotation buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #165 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		path_ = Collections.emptyList();
	//    3    5:aload_0         
	//    4    6:invokestatic    #35  <Method List Collections.emptyList()>
	//    5    9:putfield        #37  <Field List path_>
		bitField0_ = bitField0_ & -2;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field int bitField0_>
	//    9   17:bipush          -2
	//   10   19:iand            
	//   11   20:putfield        #55  <Field int bitField0_>
		sourceFile_ = "";
	//   12   23:aload_0         
	//   13   24:ldc1            #39  <String "">
	//   14   26:putfield        #41  <Field Object sourceFile_>
		bitField0_ = bitField0_ & -3;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #55  <Field int bitField0_>
	//   18   34:bipush          -3
	//   19   36:iand            
	//   20   37:putfield        #55  <Field int bitField0_>
		begin_ = 0;
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:putfield        #142 <Field int begin_>
		bitField0_ = bitField0_ & -5;
	//   24   45:aload_0         
	//   25   46:aload_0         
	//   26   47:getfield        #55  <Field int bitField0_>
	//   27   50:bipush          -5
	//   28   52:iand            
	//   29   53:putfield        #55  <Field int bitField0_>
		end_ = 0;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #148 <Field int end_>
		bitField0_ = bitField0_ & -9;
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #55  <Field int bitField0_>
	//   36   66:bipush          -9
	//   37   68:iand            
	//   38   69:putfield        #55  <Field int bitField0_>
		return this;
	//   39   72:aload_0         
	//   40   73:areturn         
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearBegin()
	{
		bitField0_ = bitField0_ & -5;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field int bitField0_>
	//    3    5:bipush          -5
	//    4    7:iand            
	//    5    8:putfield        #55  <Field int bitField0_>
		begin_ = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #142 <Field int begin_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #84  <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearEnd()
	{
		bitField0_ = bitField0_ & -9;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field int bitField0_>
	//    3    5:bipush          -9
	//    4    7:iand            
	//    5    8:putfield        #55  <Field int bitField0_>
		end_ = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #148 <Field int end_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #84  <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #182 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #182 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #182 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearPath()
	{
		path_ = Collections.emptyList();
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method List Collections.emptyList()>
	//    2    4:putfield        #37  <Field List path_>
		bitField0_ = bitField0_ & -2;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field int bitField0_>
	//    6   12:bipush          -2
	//    7   14:iand            
	//    8   15:putfield        #55  <Field int bitField0_>
		onChanged();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #84  <Method void onChanged()>
		return this;
	//   11   22:aload_0         
	//   12   23:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clearSourceFile()
	{
		bitField0_ = bitField0_ & -3;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field int bitField0_>
	//    3    5:bipush          -3
	//    4    7:iand            
	//    5    8:putfield        #55  <Field int bitField0_>
		sourceFile_ = ((Object) (DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance().getSourceFile()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #191 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation.getDefaultInstance()>
	//    8   15:invokevirtual   #195 <Method String DescriptorProtos$GeneratedCodeInfo$Annotation.getSourceFile()>
	//    9   18:putfield        #41  <Field Object sourceFile_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #84  <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clone()
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #201 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder clone()>
	//    2    4:areturn         
	}

	public int getBegin()
	{
		return begin_;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int begin_>
	//    2    4:ireturn         
	}

	public DescriptorProtos.GeneratedCodeInfo.Annotation getDefaultInstanceForType()
	{
		return DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance();
	//    0    0:invokestatic    #191 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method DescriptorProtos$GeneratedCodeInfo$Annotation getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method DescriptorProtos$GeneratedCodeInfo$Annotation getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$29000();
	//    0    0:invokestatic    #65  <Method Descriptors$Descriptor DescriptorProtos.access$29000()>
	//    1    3:areturn         
	}

	public int getEnd()
	{
		return end_;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int end_>
	//    2    4:ireturn         
	}

	public int getPath(int i)
	{
		return ((Integer)path_.get(i)).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List path_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #218 <Method Object List.get(int)>
	//    4   10:checkcast       #90  <Class Integer>
	//    5   13:invokevirtual   #221 <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	public int getPathCount()
	{
		return path_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List path_>
	//    2    4:invokeinterface #225 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getPathList()
	{
		return Collections.unmodifiableList(path_);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List path_>
	//    2    4:invokestatic    #132 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public String getSourceFile()
	{
		Object obj = sourceFile_;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Object sourceFile_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #229 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #231 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #234 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #237 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				sourceFile_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #41  <Field Object sourceFile_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #229 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getSourceFileBytes()
	{
		Object obj = sourceFile_;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Object sourceFile_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #229 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #229 <Class String>
	//    8   16:invokestatic    #243 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			sourceFile_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #41  <Field Object sourceFile_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #231 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean hasBegin()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasEnd()
	{
		return (bitField0_ & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int bitField0_>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasSourceFile()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$29100().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation, com/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation$Builder);
	//    0    0:invokestatic    #251 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$29100()>
	//    1    3:ldc1            #14  <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    2    5:ldc1            #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    3    7:invokevirtual   #257 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
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
	//    3    3:invokevirtual   #264 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #268 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #264 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.GeneratedCodeInfo.Annotation)DescriptorProtos.GeneratedCodeInfo.Annotation.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #275 <Field Parser DescriptorProtos$GeneratedCodeInfo$Annotation.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #281 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #14  <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.GeneratedCodeInfo.Annotation) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #284 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(DescriptorProtos$GeneratedCodeInfo$Annotation)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #287 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #14  <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #291 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #284 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(DescriptorProtos$GeneratedCodeInfo$Annotation)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.GeneratedCodeInfo.Annotation)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.GeneratedCodeInfo.Annotation) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(DescriptorProtos.GeneratedCodeInfo.Annotation annotation)
	{
		if(annotation == DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #191 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(!DescriptorProtos.GeneratedCodeInfo.Annotation.access$29500(annotation).isEmpty())
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #295 <Method List DescriptorProtos$GeneratedCodeInfo$Annotation.access$29500(DescriptorProtos$GeneratedCodeInfo$Annotation)>
	//*   7   13:invokeinterface #298 <Method boolean List.isEmpty()>
	//*   8   18:ifne            77
		{
			if(path_.isEmpty())
	//*   9   21:aload_0         
	//*  10   22:getfield        #37  <Field List path_>
	//*  11   25:invokeinterface #298 <Method boolean List.isEmpty()>
	//*  12   30:ifeq            55
			{
				path_ = DescriptorProtos.GeneratedCodeInfo.Annotation.access$29500(annotation);
	//   13   33:aload_0         
	//   14   34:aload_1         
	//   15   35:invokestatic    #295 <Method List DescriptorProtos$GeneratedCodeInfo$Annotation.access$29500(DescriptorProtos$GeneratedCodeInfo$Annotation)>
	//   16   38:putfield        #37  <Field List path_>
				bitField0_ = bitField0_ & -2;
	//   17   41:aload_0         
	//   18   42:aload_0         
	//   19   43:getfield        #55  <Field int bitField0_>
	//   20   46:bipush          -2
	//   21   48:iand            
	//   22   49:putfield        #55  <Field int bitField0_>
			} else
	//*  23   52:goto            73
			{
				ensurePathIsMutable();
	//   24   55:aload_0         
	//   25   56:invokespecial   #75  <Method void ensurePathIsMutable()>
				path_.addAll(((java.util.Collection) (DescriptorProtos.GeneratedCodeInfo.Annotation.access$29500(annotation))));
	//   26   59:aload_0         
	//   27   60:getfield        #37  <Field List path_>
	//   28   63:aload_1         
	//   29   64:invokestatic    #295 <Method List DescriptorProtos$GeneratedCodeInfo$Annotation.access$29500(DescriptorProtos$GeneratedCodeInfo$Annotation)>
	//   30   67:invokeinterface #301 <Method boolean List.addAll(java.util.Collection)>
	//   31   72:pop             
			}
			onChanged();
	//   32   73:aload_0         
	//   33   74:invokevirtual   #84  <Method void onChanged()>
		}
		if(annotation.hasSourceFile())
	//*  34   77:aload_1         
	//*  35   78:invokevirtual   #303 <Method boolean DescriptorProtos$GeneratedCodeInfo$Annotation.hasSourceFile()>
	//*  36   81:ifeq            106
		{
			bitField0_ = bitField0_ | 2;
	//   37   84:aload_0         
	//   38   85:aload_0         
	//   39   86:getfield        #55  <Field int bitField0_>
	//   40   89:iconst_2        
	//   41   90:ior             
	//   42   91:putfield        #55  <Field int bitField0_>
			sourceFile_ = DescriptorProtos.GeneratedCodeInfo.Annotation.access$29600(annotation);
	//   43   94:aload_0         
	//   44   95:aload_1         
	//   45   96:invokestatic    #307 <Method Object DescriptorProtos$GeneratedCodeInfo$Annotation.access$29600(DescriptorProtos$GeneratedCodeInfo$Annotation)>
	//   46   99:putfield        #41  <Field Object sourceFile_>
			onChanged();
	//   47  102:aload_0         
	//   48  103:invokevirtual   #84  <Method void onChanged()>
		}
		if(annotation.hasBegin())
	//*  49  106:aload_1         
	//*  50  107:invokevirtual   #309 <Method boolean DescriptorProtos$GeneratedCodeInfo$Annotation.hasBegin()>
	//*  51  110:ifeq            122
			setBegin(annotation.getBegin());
	//   52  113:aload_0         
	//   53  114:aload_1         
	//   54  115:invokevirtual   #311 <Method int DescriptorProtos$GeneratedCodeInfo$Annotation.getBegin()>
	//   55  118:invokevirtual   #314 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setBegin(int)>
	//   56  121:pop             
		if(annotation.hasEnd())
	//*  57  122:aload_1         
	//*  58  123:invokevirtual   #316 <Method boolean DescriptorProtos$GeneratedCodeInfo$Annotation.hasEnd()>
	//*  59  126:ifeq            138
			setEnd(annotation.getEnd());
	//   60  129:aload_0         
	//   61  130:aload_1         
	//   62  131:invokevirtual   #318 <Method int DescriptorProtos$GeneratedCodeInfo$Annotation.getEnd()>
	//   63  134:invokevirtual   #321 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setEnd(int)>
	//   64  137:pop             
		mergeUnknownFields(annotation.unknownFields);
	//   65  138:aload_0         
	//   66  139:aload_1         
	//   67  140:getfield        #325 <Field UnknownFieldSet DescriptorProtos$GeneratedCodeInfo$Annotation.unknownFields>
	//   68  143:invokevirtual   #329 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeUnknownFields(UnknownFieldSet)>
	//   69  146:pop             
		onChanged();
	//   70  147:aload_0         
	//   71  148:invokevirtual   #84  <Method void onChanged()>
		return this;
	//   72  151:aload_0         
	//   73  152:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.GeneratedCodeInfo.Annotation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #14  <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.GeneratedCodeInfo.Annotation)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #14  <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    6   12:invokevirtual   #284 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(DescriptorProtos$GeneratedCodeInfo$Annotation)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #331 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #264 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #268 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #264 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #329 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #338 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #329 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #329 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setBegin(int i)
	{
		bitField0_ = bitField0_ | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field int bitField0_>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #55  <Field int bitField0_>
		begin_ = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #142 <Field int begin_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #84  <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setEnd(int i)
	{
		bitField0_ = bitField0_ | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field int bitField0_>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #55  <Field int bitField0_>
		end_ = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #148 <Field int end_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #84  <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #342 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #344 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #344 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setPath(int i, int j)
	{
		ensurePathIsMutable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void ensurePathIsMutable()>
		path_.set(i, ((Object) (Integer.valueOf(j))));
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field List path_>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//    7   13:invokeinterface #350 <Method Object List.set(int, Object)>
	//    8   18:pop             
		onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #84  <Method void onChanged()>
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #355 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #357 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #357 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setSourceFile(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #362 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #363 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 2;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field int bitField0_>
	//    9   17:iconst_2        
	//   10   18:ior             
	//   11   19:putfield        #55  <Field int bitField0_>
			sourceFile_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #41  <Field Object sourceFile_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #84  <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setSourceFileBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #362 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #363 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 2;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field int bitField0_>
	//    9   17:iconst_2        
	//   10   18:ior             
	//   11   19:putfield        #55  <Field int bitField0_>
			sourceFile_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #41  <Field Object sourceFile_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #84  <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public final DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #368 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #370 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #370 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int begin_;
	private int bitField0_;
	private int end_;
	private List path_;
	private Object sourceFile_;

	private DescriptorProtos$GeneratedCodeInfo$Annotation$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void GeneratedMessageV3$Builder()>
		path_ = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #35  <Method List Collections.emptyList()>
	//    4    8:putfield        #37  <Field List path_>
		sourceFile_ = "";
	//    5   11:aload_0         
	//    6   12:ldc1            #39  <String "">
	//    7   14:putfield        #41  <Field Object sourceFile_>
		maybeForceBuilderInitialization();
	//    8   17:aload_0         
	//    9   18:invokespecial   #44  <Method void maybeForceBuilderInitialization()>
	//   10   21:return          
	}

	DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void DescriptorProtos$GeneratedCodeInfo$Annotation$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		path_ = Collections.emptyList();
	//    3    5:aload_0         
	//    4    6:invokestatic    #35  <Method List Collections.emptyList()>
	//    5    9:putfield        #37  <Field List path_>
		sourceFile_ = "";
	//    6   12:aload_0         
	//    7   13:ldc1            #39  <String "">
	//    8   15:putfield        #41  <Field Object sourceFile_>
		maybeForceBuilderInitialization();
	//    9   18:aload_0         
	//   10   19:invokespecial   #44  <Method void maybeForceBuilderInitialization()>
	//   11   22:return          
	}

	DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
