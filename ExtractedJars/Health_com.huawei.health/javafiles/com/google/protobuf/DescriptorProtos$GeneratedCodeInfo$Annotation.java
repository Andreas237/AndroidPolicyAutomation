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
//			CodedInputStream, Parser, CodedOutputStream, ByteString, 
//			ExtensionRegistryLite, Message, MessageLite, AbstractParser

public static final class DescriptorProtos$GeneratedCodeInfo$Annotation extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
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

		public Builder addAllPath(Iterable iterable)
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

		public Builder addPath(int i)
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
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
			annotation.path_ = path_;
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
			annotation.sourceFile_ = sourceFile_;
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
			annotation.begin_ = begin_;
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
			annotation.end_ = end_;
		//   72  117:aload           4
		//   73  119:aload_0         
		//   74  120:getfield        #148 <Field int end_>
		//   75  123:invokestatic    #151 <Method int DescriptorProtos$GeneratedCodeInfo$Annotation.access$29802(DescriptorProtos$GeneratedCodeInfo$Annotation, int)>
		//   76  126:pop             
			annotation.bitField0_ = j;
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

		public Builder clear()
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

		public Builder clearBegin()
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

		public Builder clearEnd()
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

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
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

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
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

		public Builder clearPath()
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

		public Builder clearSourceFile()
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

		public Builder clone()
		{
			return (Builder)super.clone();
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

		public Builder mergeFrom(DescriptorProtos.GeneratedCodeInfo.Annotation annotation)
		{
			if(annotation == DescriptorProtos.GeneratedCodeInfo.Annotation.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #191 <Method DescriptorProtos$GeneratedCodeInfo$Annotation DescriptorProtos$GeneratedCodeInfo$Annotation.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(!annotation.path_.isEmpty())
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
					path_ = annotation.path_;
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
					path_.addAll(((java.util.Collection) (annotation.path_)));
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
				sourceFile_ = annotation.sourceFile_;
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

		public Builder mergeFrom(Message message)
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

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
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

		public Builder setBegin(int i)
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

		public Builder setEnd(int i)
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
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

		public Builder setPath(int i, int j)
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

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

		public Builder setSourceFile(String s)
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

		public Builder setSourceFileBytes(ByteString bytestring)
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
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

		private Builder()
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

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method void DescriptorProtos$GeneratedCodeInfo$Annotation$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #52  <Method void DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$GeneratedCodeInfo$Annotation getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #54  <Field DescriptorProtos$GeneratedCodeInfo$Annotation DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$29000();
	//    0    0:invokestatic    #195 <Method Descriptors$Descriptor DescriptorProtos.access$29000()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #54  <Field DescriptorProtos$GeneratedCodeInfo$Annotation DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #199 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorprotos$generatedcodeinfo$annotation)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$generatedcodeinfo$annotation);
	//    0    0:getstatic       #54  <Field DescriptorProtos$GeneratedCodeInfo$Annotation DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #199 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #203 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder DescriptorProtos$GeneratedCodeInfo$Annotation$Builder.mergeFrom(DescriptorProtos$GeneratedCodeInfo$Annotation)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #209 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    4   10:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #213 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    5   11:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #220 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    4   12:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #224 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    5   13:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #229 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    4   10:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #233 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    5   11:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #235 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    4   10:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #237 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    5   11:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #241 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    4   12:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #245 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    5   13:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #249 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    4   12:areturn         
	}

	public static DescriptorProtos$GeneratedCodeInfo$Annotation parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$GeneratedCodeInfo$Annotation)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #253 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #57  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$GeneratedCodeInfo$Annotation))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #259 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$GeneratedCodeInfo$Annotation)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//   14   24:astore_1        
		boolean flag;
		if(true && getPathList().equals(((Object) (((DescriptorProtos$GeneratedCodeInfo$Annotation) (obj)).getPathList()))))
	//*  15   25:iconst_1        
	//*  16   26:ifeq            50
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #262 <Method List getPathList()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #262 <Method List getPathList()>
	//*  21   37:invokeinterface #263 <Method boolean List.equals(Object)>
	//*  22   42:ifeq            50
			flag = true;
	//   23   45:iconst_1        
	//   24   46:istore_2        
		else
	//*  25   47:goto            52
			flag = false;
	//   26   50:iconst_0        
	//   27   51:istore_2        
		if(flag && hasSourceFile() == ((DescriptorProtos$GeneratedCodeInfo$Annotation) (obj)).hasSourceFile())
	//*  28   52:iload_2         
	//*  29   53:ifeq            72
	//*  30   56:aload_0         
	//*  31   57:invokevirtual   #267 <Method boolean hasSourceFile()>
	//*  32   60:aload_1         
	//*  33   61:invokevirtual   #267 <Method boolean hasSourceFile()>
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
		if(hasSourceFile())
	//*  42   76:aload_0         
	//*  43   77:invokevirtual   #267 <Method boolean hasSourceFile()>
	//*  44   80:ifeq            108
			if(flag && getSourceFile().equals(((Object) (((DescriptorProtos$GeneratedCodeInfo$Annotation) (obj)).getSourceFile()))))
	//*  45   83:iload_2         
	//*  46   84:ifeq            106
	//*  47   87:aload_0         
	//*  48   88:invokevirtual   #271 <Method String getSourceFile()>
	//*  49   91:aload_1         
	//*  50   92:invokevirtual   #271 <Method String getSourceFile()>
	//*  51   95:invokevirtual   #274 <Method boolean String.equals(Object)>
	//*  52   98:ifeq            106
				flag1 = true;
	//   53  101:iconst_1        
	//   54  102:istore_3        
			else
	//*  55  103:goto            108
				flag1 = false;
	//   56  106:iconst_0        
	//   57  107:istore_3        
		if(flag1 && hasBegin() == ((DescriptorProtos$GeneratedCodeInfo$Annotation) (obj)).hasBegin())
	//*  58  108:iload_3         
	//*  59  109:ifeq            128
	//*  60  112:aload_0         
	//*  61  113:invokevirtual   #277 <Method boolean hasBegin()>
	//*  62  116:aload_1         
	//*  63  117:invokevirtual   #277 <Method boolean hasBegin()>
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
		if(hasBegin())
	//*  72  132:aload_0         
	//*  73  133:invokevirtual   #277 <Method boolean hasBegin()>
	//*  74  136:ifeq            161
			if(flag && getBegin() == ((DescriptorProtos$GeneratedCodeInfo$Annotation) (obj)).getBegin())
	//*  75  139:iload_2         
	//*  76  140:ifeq            159
	//*  77  143:aload_0         
	//*  78  144:invokevirtual   #280 <Method int getBegin()>
	//*  79  147:aload_1         
	//*  80  148:invokevirtual   #280 <Method int getBegin()>
	//*  81  151:icmpne          159
				flag1 = true;
	//   82  154:iconst_1        
	//   83  155:istore_3        
			else
	//*  84  156:goto            161
				flag1 = false;
	//   85  159:iconst_0        
	//   86  160:istore_3        
		if(flag1 && hasEnd() == ((DescriptorProtos$GeneratedCodeInfo$Annotation) (obj)).hasEnd())
	//*  87  161:iload_3         
	//*  88  162:ifeq            181
	//*  89  165:aload_0         
	//*  90  166:invokevirtual   #283 <Method boolean hasEnd()>
	//*  91  169:aload_1         
	//*  92  170:invokevirtual   #283 <Method boolean hasEnd()>
	//*  93  173:icmpne          181
			flag = true;
	//   94  176:iconst_1        
	//   95  177:istore_2        
		else
	//*  96  178:goto            183
			flag = false;
	//   97  181:iconst_0        
	//   98  182:istore_2        
		flag1 = flag;
	//   99  183:iload_2         
	//  100  184:istore_3        
		if(hasEnd())
	//* 101  185:aload_0         
	//* 102  186:invokevirtual   #283 <Method boolean hasEnd()>
	//* 103  189:ifeq            214
			if(flag && getEnd() == ((DescriptorProtos$GeneratedCodeInfo$Annotation) (obj)).getEnd())
	//* 104  192:iload_2         
	//* 105  193:ifeq            212
	//* 106  196:aload_0         
	//* 107  197:invokevirtual   #286 <Method int getEnd()>
	//* 108  200:aload_1         
	//* 109  201:invokevirtual   #286 <Method int getEnd()>
	//* 110  204:icmpne          212
				flag1 = true;
	//  111  207:iconst_1        
	//  112  208:istore_3        
			else
	//* 113  209:goto            214
				flag1 = false;
	//  114  212:iconst_0        
	//  115  213:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$GeneratedCodeInfo$Annotation) (obj)).unknownFields)));
	//  116  214:iload_3         
	//  117  215:ifeq            234
	//  118  218:aload_0         
	//  119  219:getfield        #155 <Field UnknownFieldSet unknownFields>
	//  120  222:aload_1         
	//  121  223:getfield        #155 <Field UnknownFieldSet unknownFields>
	//  122  226:invokevirtual   #287 <Method boolean UnknownFieldSet.equals(Object)>
	//  123  229:ifeq            234
	//  124  232:iconst_1        
	//  125  233:ireturn         
	//  126  234:iconst_0        
	//  127  235:ireturn         
	}

	public int getBegin()
	{
		return begin_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int begin_>
	//    2    4:ireturn         
	}

	public DescriptorProtos$GeneratedCodeInfo$Annotation getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #54  <Field DescriptorProtos$GeneratedCodeInfo$Annotation DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #291 <Method DescriptorProtos$GeneratedCodeInfo$Annotation getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #291 <Method DescriptorProtos$GeneratedCodeInfo$Annotation getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public int getEnd()
	{
		return end_;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int end_>
	//    2    4:ireturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #57  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getPath(int i)
	{
		return ((Integer)path_.get(i)).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List path_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #298 <Method Object List.get(int)>
	//    4   10:checkcast       #111 <Class Integer>
	//    5   13:invokevirtual   #301 <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	public int getPathCount()
	{
		return path_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List path_>
	//    2    4:invokeinterface #305 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getPathList()
	{
		return path_;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List path_>
	//    2    4:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field int memoizedSize>
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
	//*  14   18:getfield        #71  <Field List path_>
	//*  15   21:invokeinterface #305 <Method int List.size()>
	//*  16   26:icmpge          58
			j += CodedOutputStream.computeInt32SizeNoTag(((Integer)path_.get(i)).intValue());
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #71  <Field List path_>
	//   20   34:iload_1         
	//   21   35:invokeinterface #298 <Method Object List.get(int)>
	//   22   40:checkcast       #111 <Class Integer>
	//   23   43:invokevirtual   #301 <Method int Integer.intValue()>
	//   24   46:invokestatic    #315 <Method int CodedOutputStream.computeInt32SizeNoTag(int)>
	//   25   49:iadd            
	//   26   50:istore_2        

	//   27   51:iload_1         
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:istore_1        
	//*  31   55:goto            16
		int k = j + 0;
	//   32   58:iload_2         
	//   33   59:iconst_0        
	//   34   60:iadd            
	//   35   61:istore_3        
		i = k;
	//   36   62:iload_3         
	//   37   63:istore_1        
		if(!getPathList().isEmpty())
	//*  38   64:aload_0         
	//*  39   65:invokevirtual   #262 <Method List getPathList()>
	//*  40   68:invokeinterface #318 <Method boolean List.isEmpty()>
	//*  41   73:ifne            85
			i = k + 1 + CodedOutputStream.computeInt32SizeNoTag(j);
	//   42   76:iload_3         
	//   43   77:iconst_1        
	//   44   78:iadd            
	//   45   79:iload_2         
	//   46   80:invokestatic    #315 <Method int CodedOutputStream.computeInt32SizeNoTag(int)>
	//   47   83:iadd            
	//   48   84:istore_1        
		pathMemoizedSerializedSize = j;
	//   49   85:aload_0         
	//   50   86:iload_2         
	//   51   87:putfield        #61  <Field int pathMemoizedSerializedSize>
		j = i;
	//   52   90:iload_1         
	//   53   91:istore_2        
		if((bitField0_ & 1) == 1)
	//*  54   92:aload_0         
	//*  55   93:getfield        #141 <Field int bitField0_>
	//*  56   96:iconst_1        
	//*  57   97:iand            
	//*  58   98:iconst_1        
	//*  59   99:icmpne          113
			j = i + GeneratedMessageV3.computeStringSize(2, sourceFile_);
	//   60  102:iload_1         
	//   61  103:iconst_2        
	//   62  104:aload_0         
	//   63  105:getfield        #75  <Field Object sourceFile_>
	//   64  108:invokestatic    #322 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   65  111:iadd            
	//   66  112:istore_2        
		i = j;
	//   67  113:iload_2         
	//   68  114:istore_1        
		if((bitField0_ & 2) == 2)
	//*  69  115:aload_0         
	//*  70  116:getfield        #141 <Field int bitField0_>
	//*  71  119:iconst_2        
	//*  72  120:iand            
	//*  73  121:iconst_2        
	//*  74  122:icmpne          136
			i = j + CodedOutputStream.computeInt32Size(3, begin_);
	//   75  125:iload_2         
	//   76  126:iconst_3        
	//   77  127:aload_0         
	//   78  128:getfield        #77  <Field int begin_>
	//   79  131:invokestatic    #326 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//   80  134:iadd            
	//   81  135:istore_1        
		j = i;
	//   82  136:iload_1         
	//   83  137:istore_2        
		if((bitField0_ & 4) == 4)
	//*  84  138:aload_0         
	//*  85  139:getfield        #141 <Field int bitField0_>
	//*  86  142:iconst_4        
	//*  87  143:iand            
	//*  88  144:iconst_4        
	//*  89  145:icmpne          159
			j = i + CodedOutputStream.computeInt32Size(4, end_);
	//   90  148:iload_1         
	//   91  149:iconst_4        
	//   92  150:aload_0         
	//   93  151:getfield        #79  <Field int end_>
	//   94  154:invokestatic    #326 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//   95  157:iadd            
	//   96  158:istore_2        
		i = j + unknownFields.getSerializedSize();
	//   97  159:iload_2         
	//   98  160:aload_0         
	//   99  161:getfield        #155 <Field UnknownFieldSet unknownFields>
	//  100  164:invokevirtual   #328 <Method int UnknownFieldSet.getSerializedSize()>
	//  101  167:iadd            
	//  102  168:istore_1        
		memoizedSize = i;
	//  103  169:aload_0         
	//  104  170:iload_1         
	//  105  171:putfield        #310 <Field int memoizedSize>
		return i;
	//  106  174:iload_1         
	//  107  175:ireturn         
	}

	public String getSourceFile()
	{
		Object obj = sourceFile_;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Object sourceFile_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #273 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #273 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #330 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #333 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #336 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			sourceFile_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #75  <Field Object sourceFile_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getSourceFileBytes()
	{
		Object obj = sourceFile_;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Object sourceFile_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #273 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #273 <Class String>
	//    8   16:invokestatic    #341 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			sourceFile_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #75  <Field Object sourceFile_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #330 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasBegin()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasEnd()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasSourceFile()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int bitField0_>
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
	//*   1    1:getfield        #346 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #346 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #348 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #352 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(getPathCount() > 0)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #354 <Method int getPathCount()>
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
	//   24   42:invokevirtual   #262 <Method List getPathList()>
	//   25   45:invokeinterface #355 <Method int List.hashCode()>
	//   26   50:iadd            
	//   27   51:istore_1        
		j = i;
	//   28   52:iload_1         
	//   29   53:istore_2        
		if(hasSourceFile())
	//*  30   54:aload_0         
	//*  31   55:invokevirtual   #267 <Method boolean hasSourceFile()>
	//*  32   58:ifeq            79
			j = (i * 37 + 2) * 53 + getSourceFile().hashCode();
	//   33   61:iload_1         
	//   34   62:bipush          37
	//   35   64:imul            
	//   36   65:iconst_2        
	//   37   66:iadd            
	//   38   67:bipush          53
	//   39   69:imul            
	//   40   70:aload_0         
	//   41   71:invokevirtual   #271 <Method String getSourceFile()>
	//   42   74:invokevirtual   #356 <Method int String.hashCode()>
	//   43   77:iadd            
	//   44   78:istore_2        
		i = j;
	//   45   79:iload_2         
	//   46   80:istore_1        
		if(hasBegin())
	//*  47   81:aload_0         
	//*  48   82:invokevirtual   #277 <Method boolean hasBegin()>
	//*  49   85:ifeq            103
			i = (j * 37 + 3) * 53 + getBegin();
	//   50   88:iload_2         
	//   51   89:bipush          37
	//   52   91:imul            
	//   53   92:iconst_3        
	//   54   93:iadd            
	//   55   94:bipush          53
	//   56   96:imul            
	//   57   97:aload_0         
	//   58   98:invokevirtual   #280 <Method int getBegin()>
	//   59  101:iadd            
	//   60  102:istore_1        
		j = i;
	//   61  103:iload_1         
	//   62  104:istore_2        
		if(hasEnd())
	//*  63  105:aload_0         
	//*  64  106:invokevirtual   #283 <Method boolean hasEnd()>
	//*  65  109:ifeq            127
			j = (i * 37 + 4) * 53 + getEnd();
	//   66  112:iload_1         
	//   67  113:bipush          37
	//   68  115:imul            
	//   69  116:iconst_4        
	//   70  117:iadd            
	//   71  118:bipush          53
	//   72  120:imul            
	//   73  121:aload_0         
	//   74  122:invokevirtual   #286 <Method int getEnd()>
	//   75  125:iadd            
	//   76  126:istore_2        
		i = j * 29 + unknownFields.hashCode();
	//   77  127:iload_2         
	//   78  128:bipush          29
	//   79  130:imul            
	//   80  131:aload_0         
	//   81  132:getfield        #155 <Field UnknownFieldSet unknownFields>
	//   82  135:invokevirtual   #357 <Method int UnknownFieldSet.hashCode()>
	//   83  138:iadd            
	//   84  139:istore_1        
		memoizedHashCode = i;
	//   85  140:aload_0         
	//   86  141:iload_1         
	//   87  142:putfield        #346 <Field int memoizedHashCode>
		return i;
	//   88  145:iload_1         
	//   89  146:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$29100().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation, com/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation$Builder);
	//    0    0:invokestatic    #362 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$29100()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    2    5:ldc1            #16  <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    3    7:invokevirtual   #368 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field byte memoizedIsInitialized>
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
	//   14   20:putfield        #63  <Field byte memoizedIsInitialized>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #372 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #16  <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #376 <Method void DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #379 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #382 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #379 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #54  <Field DescriptorProtos$GeneratedCodeInfo$Annotation DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #16  <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #386 <Method void DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #16  <Class DescriptorProtos$GeneratedCodeInfo$Annotation$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #386 <Method void DescriptorProtos$GeneratedCodeInfo$Annotation$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #203 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder DescriptorProtos$GeneratedCodeInfo$Annotation$Builder.mergeFrom(DescriptorProtos$GeneratedCodeInfo$Annotation)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method DescriptorProtos$GeneratedCodeInfo$Annotation$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		getSerializedSize();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #389 <Method int getSerializedSize()>
	//    2    4:pop             
		if(getPathList().size() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #262 <Method List getPathList()>
	//*   5    9:invokeinterface #305 <Method int List.size()>
	//*   6   14:ifle            31
		{
			codedoutputstream.writeUInt32NoTag(10);
	//    7   17:aload_1         
	//    8   18:bipush          10
	//    9   20:invokevirtual   #392 <Method void CodedOutputStream.writeUInt32NoTag(int)>
			codedoutputstream.writeUInt32NoTag(pathMemoizedSerializedSize);
	//   10   23:aload_1         
	//   11   24:aload_0         
	//   12   25:getfield        #61  <Field int pathMemoizedSerializedSize>
	//   13   28:invokevirtual   #392 <Method void CodedOutputStream.writeUInt32NoTag(int)>
		}
		for(int i = 0; i < path_.size(); i++)
	//*  14   31:iconst_0        
	//*  15   32:istore_2        
	//*  16   33:iload_2         
	//*  17   34:aload_0         
	//*  18   35:getfield        #71  <Field List path_>
	//*  19   38:invokeinterface #305 <Method int List.size()>
	//*  20   43:icmpge          73
			codedoutputstream.writeInt32NoTag(((Integer)path_.get(i)).intValue());
	//   21   46:aload_1         
	//   22   47:aload_0         
	//   23   48:getfield        #71  <Field List path_>
	//   24   51:iload_2         
	//   25   52:invokeinterface #298 <Method Object List.get(int)>
	//   26   57:checkcast       #111 <Class Integer>
	//   27   60:invokevirtual   #301 <Method int Integer.intValue()>
	//   28   63:invokevirtual   #395 <Method void CodedOutputStream.writeInt32NoTag(int)>

	//   29   66:iload_2         
	//   30   67:iconst_1        
	//   31   68:iadd            
	//   32   69:istore_2        
	//*  33   70:goto            33
		if((bitField0_ & 1) == 1)
	//*  34   73:aload_0         
	//*  35   74:getfield        #141 <Field int bitField0_>
	//*  36   77:iconst_1        
	//*  37   78:iand            
	//*  38   79:iconst_1        
	//*  39   80:icmpne          92
			GeneratedMessageV3.writeString(codedoutputstream, 2, sourceFile_);
	//   40   83:aload_1         
	//   41   84:iconst_2        
	//   42   85:aload_0         
	//   43   86:getfield        #75  <Field Object sourceFile_>
	//   44   89:invokestatic    #399 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 2) == 2)
	//*  45   92:aload_0         
	//*  46   93:getfield        #141 <Field int bitField0_>
	//*  47   96:iconst_2        
	//*  48   97:iand            
	//*  49   98:iconst_2        
	//*  50   99:icmpne          111
			codedoutputstream.writeInt32(3, begin_);
	//   51  102:aload_1         
	//   52  103:iconst_3        
	//   53  104:aload_0         
	//   54  105:getfield        #77  <Field int begin_>
	//   55  108:invokevirtual   #403 <Method void CodedOutputStream.writeInt32(int, int)>
		if((bitField0_ & 4) == 4)
	//*  56  111:aload_0         
	//*  57  112:getfield        #141 <Field int bitField0_>
	//*  58  115:iconst_4        
	//*  59  116:iand            
	//*  60  117:iconst_4        
	//*  61  118:icmpne          130
			codedoutputstream.writeInt32(4, end_);
	//   62  121:aload_1         
	//   63  122:iconst_4        
	//   64  123:aload_0         
	//   65  124:getfield        #79  <Field int end_>
	//   66  127:invokevirtual   #403 <Method void CodedOutputStream.writeInt32(int, int)>
		unknownFields.writeTo(codedoutputstream);
	//   67  130:aload_0         
	//   68  131:getfield        #155 <Field UnknownFieldSet unknownFields>
	//   69  134:aload_1         
	//   70  135:invokevirtual   #405 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   71  138:return          
	}

	public static final int BEGIN_FIELD_NUMBER = 3;
	private static final DescriptorProtos$GeneratedCodeInfo$Annotation DEFAULT_INSTANCE = new DescriptorProtos$GeneratedCodeInfo$Annotation();
	public static final int END_FIELD_NUMBER = 4;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.GeneratedCodeInfo.Annotation parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.GeneratedCodeInfo.Annotation(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #25  <Method void DescriptorProtos$GeneratedCodeInfo$Annotation(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method DescriptorProtos$GeneratedCodeInfo$Annotation parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int PATH_FIELD_NUMBER = 1;
	public static final int SOURCE_FILE_FIELD_NUMBER = 2;
	private static final long serialVersionUID = 0L;
	private int begin_;
	private int bitField0_;
	private int end_;
	private byte memoizedIsInitialized;
	private int pathMemoizedSerializedSize;
	private List path_;
	private volatile Object sourceFile_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$GeneratedCodeInfo$Annotation>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void DescriptorProtos$GeneratedCodeInfo$Annotation()>
	//    3    7:putstatic       #54  <Field DescriptorProtos$GeneratedCodeInfo$Annotation DEFAULT_INSTANCE>
	//    4   10:new             #14  <Class DescriptorProtos$GeneratedCodeInfo$Annotation$1>
	//    5   13:dup             
	//    6   14:invokespecial   #55  <Method void DescriptorProtos$GeneratedCodeInfo$Annotation$1()>
	//    7   17:putstatic       #57  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static List access$29500(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorprotos$generatedcodeinfo$annotation)
	{
		return descriptorprotos$generatedcodeinfo$annotation.path_;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List path_>
	//    2    4:areturn         
	}

*/


/*
	static List access$29502(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorprotos$generatedcodeinfo$annotation, List list)
	{
		descriptorprotos$generatedcodeinfo$annotation.path_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field List path_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$29600(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorprotos$generatedcodeinfo$annotation)
	{
		return descriptorprotos$generatedcodeinfo$annotation.sourceFile_;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Object sourceFile_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$29602(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorprotos$generatedcodeinfo$annotation, Object obj)
	{
		descriptorprotos$generatedcodeinfo$annotation.sourceFile_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field Object sourceFile_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$29702(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorprotos$generatedcodeinfo$annotation, int i)
	{
		descriptorprotos$generatedcodeinfo$annotation.begin_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field int begin_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$29802(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorprotos$generatedcodeinfo$annotation, int i)
	{
		descriptorprotos$generatedcodeinfo$annotation.end_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field int end_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$29902(DescriptorProtos$GeneratedCodeInfo$Annotation descriptorprotos$generatedcodeinfo$annotation, int i)
	{
		descriptorprotos$generatedcodeinfo$annotation.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #141 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$GeneratedCodeInfo$Annotation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void GeneratedMessageV3()>
		pathMemoizedSerializedSize = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #61  <Field int pathMemoizedSerializedSize>
		memoizedIsInitialized = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #63  <Field byte memoizedIsInitialized>
		path_ = Collections.emptyList();
	//    8   14:aload_0         
	//    9   15:invokestatic    #69  <Method List Collections.emptyList()>
	//   10   18:putfield        #71  <Field List path_>
		sourceFile_ = "";
	//   11   21:aload_0         
	//   12   22:ldc1            #73  <String "">
	//   13   24:putfield        #75  <Field Object sourceFile_>
		begin_ = 0;
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:putfield        #77  <Field int begin_>
		end_ = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #79  <Field int end_>
	//   20   37:return          
	}

	private DescriptorProtos$GeneratedCodeInfo$Annotation(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		boolean flag5;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void DescriptorProtos$GeneratedCodeInfo$Annotation()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #86  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #87  <Method void NullPointerException()>
	//    7   15:athrow          
		flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #93  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          10
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
	//   15   28:ifne            496
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
	//   23   41:invokevirtual   #99  <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		i;
	//   25   46:iload           9
		JVM INSTR lookupswitch 6: default 592
	//	               0: 595
	//	               8: 142
	//	               10: 209
	//	               18: 354
	//	               24: 409
	//	               32: 451;
	//   26   48:lookupswitch    6: default 592
	//	               0: 595
	//	               8: 142
	//	               10: 209
	//	               18: 354
	//	               24: 409
	//	               32: 451
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		boolean flag1;
		flag1 = flag;
	//   27  108:iload_3         
	//   28  109:istore          4
		flag3 = flag;
	//   29  111:iload_3         
	//   30  112:istore          6
		flag4 = flag;
	//   31  114:iload_3         
	//   32  115:istore          7
		flag2 = flag;
	//   33  117:iload_3         
	//   34  118:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
	//*  35  120:aload_0         
	//*  36  121:aload_1         
	//*  37  122:aload           10
	//*  38  124:aload_2         
	//*  39  125:iload           9
	//*  40  127:invokevirtual   #103 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  130:ifne            490
		{
			flag5 = true;
	//   42  133:iconst_1        
	//   43  134:istore          8
			flag1 = flag;
	//   44  136:iload_3         
	//   45  137:istore          4
		}
		  goto _L8
	//*  46  139:goto            490
_L3:
		flag1 = flag;
	//   47  142:iload_3         
	//   48  143:istore          4
		if((flag & true)) goto _L10; else goto _L9
	//   49  145:iload_3         
	//   50  146:iconst_1        
	//   51  147:iand            
	//   52  148:iconst_1        
	//   53  149:icmpeq          177
_L9:
		flag3 = flag;
	//   54  152:iload_3         
	//   55  153:istore          6
		flag4 = flag;
	//   56  155:iload_3         
	//   57  156:istore          7
		flag2 = flag;
	//   58  158:iload_3         
	//   59  159:istore          5
		path_ = ((List) (new ArrayList()));
	//   60  161:aload_0         
	//   61  162:new             #105 <Class ArrayList>
	//   62  165:dup             
	//   63  166:invokespecial   #106 <Method void ArrayList()>
	//   64  169:putfield        #71  <Field List path_>
		flag1 = flag | true;
	//   65  172:iload_3         
	//   66  173:iconst_1        
	//   67  174:ior             
	//   68  175:istore          4
_L10:
		flag3 = flag1;
	//   69  177:iload           4
	//   70  179:istore          6
		flag4 = flag1;
	//   71  181:iload           4
	//   72  183:istore          7
		flag2 = flag1;
	//   73  185:iload           4
	//   74  187:istore          5
		path_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
	//   75  189:aload_0         
	//   76  190:getfield        #71  <Field List path_>
	//   77  193:aload_1         
	//   78  194:invokevirtual   #109 <Method int CodedInputStream.readInt32()>
	//   79  197:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//   80  200:invokeinterface #121 <Method boolean List.add(Object)>
	//   81  205:pop             
		  goto _L8
	//*  82  206:goto            490
_L4:
		flag3 = flag;
	//   83  209:iload_3         
	//   84  210:istore          6
		flag4 = flag;
	//   85  212:iload_3         
	//   86  213:istore          7
		flag2 = flag;
	//   87  215:iload_3         
	//   88  216:istore          5
		i = codedinputstream.pushLimit(codedinputstream.readRawVarint32());
	//   89  218:aload_1         
	//   90  219:aload_1         
	//   91  220:invokevirtual   #124 <Method int CodedInputStream.readRawVarint32()>
	//   92  223:invokevirtual   #128 <Method int CodedInputStream.pushLimit(int)>
	//   93  226:istore          9
		flag1 = flag;
	//   94  228:iload_3         
	//   95  229:istore          4
		if((flag & true))
			break MISSING_BLOCK_LABEL_282;
	//   96  231:iload_3         
	//   97  232:iconst_1        
	//   98  233:iand            
	//   99  234:iconst_1        
	//  100  235:icmpeq          282
		flag1 = flag;
	//  101  238:iload_3         
	//  102  239:istore          4
		flag3 = flag;
	//  103  241:iload_3         
	//  104  242:istore          6
		flag4 = flag;
	//  105  244:iload_3         
	//  106  245:istore          7
		flag2 = flag;
	//  107  247:iload_3         
	//  108  248:istore          5
		if(codedinputstream.getBytesUntilLimit() <= 0)
			break MISSING_BLOCK_LABEL_282;
	//  109  250:aload_1         
	//  110  251:invokevirtual   #131 <Method int CodedInputStream.getBytesUntilLimit()>
	//  111  254:ifle            282
		flag3 = flag;
	//  112  257:iload_3         
	//  113  258:istore          6
		flag4 = flag;
	//  114  260:iload_3         
	//  115  261:istore          7
		flag2 = flag;
	//  116  263:iload_3         
	//  117  264:istore          5
		path_ = ((List) (new ArrayList()));
	//  118  266:aload_0         
	//  119  267:new             #105 <Class ArrayList>
	//  120  270:dup             
	//  121  271:invokespecial   #106 <Method void ArrayList()>
	//  122  274:putfield        #71  <Field List path_>
		flag1 = flag | true;
	//  123  277:iload_3         
	//  124  278:iconst_1        
	//  125  279:ior             
	//  126  280:istore          4
_L12:
		flag3 = flag1;
	//  127  282:iload           4
	//  128  284:istore          6
		flag4 = flag1;
	//  129  286:iload           4
	//  130  288:istore          7
		flag2 = flag1;
	//  131  290:iload           4
	//  132  292:istore          5
		if(codedinputstream.getBytesUntilLimit() <= 0)
			break; /* Loop/switch isn't completed */
	//  133  294:aload_1         
	//  134  295:invokevirtual   #131 <Method int CodedInputStream.getBytesUntilLimit()>
	//  135  298:ifle            333
		flag3 = flag1;
	//  136  301:iload           4
	//  137  303:istore          6
		flag4 = flag1;
	//  138  305:iload           4
	//  139  307:istore          7
		flag2 = flag1;
	//  140  309:iload           4
	//  141  311:istore          5
		path_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
	//  142  313:aload_0         
	//  143  314:getfield        #71  <Field List path_>
	//  144  317:aload_1         
	//  145  318:invokevirtual   #109 <Method int CodedInputStream.readInt32()>
	//  146  321:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//  147  324:invokeinterface #121 <Method boolean List.add(Object)>
	//  148  329:pop             
		if(true) goto _L12; else goto _L11
	//  149  330:goto            282
_L11:
		flag3 = flag1;
	//  150  333:iload           4
	//  151  335:istore          6
		flag4 = flag1;
	//  152  337:iload           4
	//  153  339:istore          7
		flag2 = flag1;
	//  154  341:iload           4
	//  155  343:istore          5
		codedinputstream.popLimit(i);
	//  156  345:aload_1         
	//  157  346:iload           9
	//  158  348:invokevirtual   #135 <Method void CodedInputStream.popLimit(int)>
		  goto _L8
	//* 159  351:goto            490
_L5:
		flag3 = flag;
	//  160  354:iload_3         
	//  161  355:istore          6
		flag4 = flag;
	//  162  357:iload_3         
	//  163  358:istore          7
		flag2 = flag;
	//  164  360:iload_3         
	//  165  361:istore          5
		ByteString bytestring = codedinputstream.readBytes();
	//  166  363:aload_1         
	//  167  364:invokevirtual   #139 <Method ByteString CodedInputStream.readBytes()>
	//  168  367:astore          11
		flag3 = flag;
	//  169  369:iload_3         
	//  170  370:istore          6
		flag4 = flag;
	//  171  372:iload_3         
	//  172  373:istore          7
		flag2 = flag;
	//  173  375:iload_3         
	//  174  376:istore          5
		bitField0_ = bitField0_ | 1;
	//  175  378:aload_0         
	//  176  379:aload_0         
	//  177  380:getfield        #141 <Field int bitField0_>
	//  178  383:iconst_1        
	//  179  384:ior             
	//  180  385:putfield        #141 <Field int bitField0_>
		flag3 = flag;
	//  181  388:iload_3         
	//  182  389:istore          6
		flag4 = flag;
	//  183  391:iload_3         
	//  184  392:istore          7
		flag2 = flag;
	//  185  394:iload_3         
	//  186  395:istore          5
		sourceFile_ = ((Object) (bytestring));
	//  187  397:aload_0         
	//  188  398:aload           11
	//  189  400:putfield        #75  <Field Object sourceFile_>
		flag1 = flag;
	//  190  403:iload_3         
	//  191  404:istore          4
		  goto _L8
	//* 192  406:goto            490
_L6:
		flag3 = flag;
	//  193  409:iload_3         
	//  194  410:istore          6
		flag4 = flag;
	//  195  412:iload_3         
	//  196  413:istore          7
		flag2 = flag;
	//  197  415:iload_3         
	//  198  416:istore          5
		bitField0_ = bitField0_ | 2;
	//  199  418:aload_0         
	//  200  419:aload_0         
	//  201  420:getfield        #141 <Field int bitField0_>
	//  202  423:iconst_2        
	//  203  424:ior             
	//  204  425:putfield        #141 <Field int bitField0_>
		flag3 = flag;
	//  205  428:iload_3         
	//  206  429:istore          6
		flag4 = flag;
	//  207  431:iload_3         
	//  208  432:istore          7
		flag2 = flag;
	//  209  434:iload_3         
	//  210  435:istore          5
		begin_ = codedinputstream.readInt32();
	//  211  437:aload_0         
	//  212  438:aload_1         
	//  213  439:invokevirtual   #109 <Method int CodedInputStream.readInt32()>
	//  214  442:putfield        #77  <Field int begin_>
		flag1 = flag;
	//  215  445:iload_3         
	//  216  446:istore          4
		  goto _L8
	//* 217  448:goto            490
_L7:
		flag3 = flag;
	//  218  451:iload_3         
	//  219  452:istore          6
		flag4 = flag;
	//  220  454:iload_3         
	//  221  455:istore          7
		flag2 = flag;
	//  222  457:iload_3         
	//  223  458:istore          5
		bitField0_ = bitField0_ | 4;
	//  224  460:aload_0         
	//  225  461:aload_0         
	//  226  462:getfield        #141 <Field int bitField0_>
	//  227  465:iconst_4        
	//  228  466:ior             
	//  229  467:putfield        #141 <Field int bitField0_>
		flag3 = flag;
	//  230  470:iload_3         
	//  231  471:istore          6
		flag4 = flag;
	//  232  473:iload_3         
	//  233  474:istore          7
		flag2 = flag;
	//  234  476:iload_3         
	//  235  477:istore          5
		end_ = codedinputstream.readInt32();
	//  236  479:aload_0         
	//  237  480:aload_1         
	//  238  481:invokevirtual   #109 <Method int CodedInputStream.readInt32()>
	//  239  484:putfield        #79  <Field int end_>
		flag1 = flag;
	//  240  487:iload_3         
	//  241  488:istore          4
_L8:
		flag = flag1;
	//  242  490:iload           4
	//  243  492:istore_3        
		if(true) goto _L14; else goto _L13
	//  244  493:goto            26
_L13:
		if((flag & true))
	//* 245  496:iload_3         
	//* 246  497:iconst_1        
	//* 247  498:iand            
	//* 248  499:iconst_1        
	//* 249  500:icmpne          514
			path_ = Collections.unmodifiableList(path_);
	//  250  503:aload_0         
	//  251  504:aload_0         
	//  252  505:getfield        #71  <Field List path_>
	//  253  508:invokestatic    #145 <Method List Collections.unmodifiableList(List)>
	//  254  511:putfield        #71  <Field List path_>
		unknownFields = builder.build();
	//  255  514:aload_0         
	//  256  515:aload           10
	//  257  517:invokevirtual   #151 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  258  520:putfield        #155 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  259  523:aload_0         
	//  260  524:invokevirtual   #158 <Method void makeExtensionsImmutable()>
		return;
	//  261  527:return          
		codedinputstream;
	//  262  528:astore_1        
		flag2 = flag3;
	//  263  529:iload           6
	//  264  531:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  265  533:aload_1         
	//  266  534:aload_0         
	//  267  535:invokevirtual   #162 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  268  538:athrow          
		codedinputstream;
	//  269  539:astore_1        
		flag2 = flag4;
	//  270  540:iload           7
	//  271  542:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  272  544:new             #82  <Class InvalidProtocolBufferException>
	//  273  547:dup             
	//  274  548:aload_1         
	//  275  549:invokespecial   #165 <Method void InvalidProtocolBufferException(IOException)>
	//  276  552:aload_0         
	//  277  553:invokevirtual   #162 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  278  556:athrow          
		codedinputstream;
	//  279  557:astore_1        
		if((flag2 & true))
	//* 280  558:iload           5
	//* 281  560:iconst_1        
	//* 282  561:iand            
	//* 283  562:iconst_1        
	//* 284  563:icmpne          577
			path_ = Collections.unmodifiableList(path_);
	//  285  566:aload_0         
	//  286  567:aload_0         
	//  287  568:getfield        #71  <Field List path_>
	//  288  571:invokestatic    #145 <Method List Collections.unmodifiableList(List)>
	//  289  574:putfield        #71  <Field List path_>
		unknownFields = builder.build();
	//  290  577:aload_0         
	//  291  578:aload           10
	//  292  580:invokevirtual   #151 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  293  583:putfield        #155 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  294  586:aload_0         
	//  295  587:invokevirtual   #158 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  296  590:aload_1         
	//  297  591:athrow          
	//* 298  592:goto            108
_L2:
		flag5 = true;
	//  299  595:iconst_1        
	//  300  596:istore          8
		flag1 = flag;
	//  301  598:iload_3         
	//  302  599:istore          4
		  goto _L8
	//* 303  601:goto            490
	}

	DescriptorProtos$GeneratedCodeInfo$Annotation(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #169 <Method void DescriptorProtos$GeneratedCodeInfo$Annotation(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$GeneratedCodeInfo$Annotation(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #172 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		pathMemoizedSerializedSize = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #61  <Field int pathMemoizedSerializedSize>
		memoizedIsInitialized = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #63  <Field byte memoizedIsInitialized>
	//    9   15:return          
	}

	DescriptorProtos$GeneratedCodeInfo$Annotation(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method void DescriptorProtos$GeneratedCodeInfo$Annotation(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
