// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, LazyStringArrayList, GeneratedMessageV3, LazyStringList, 
//			ByteString, InvalidProtocolBufferException, Parser, Message, 
//			MessageLite, ProtocolStringList, CodedInputStream, ExtensionRegistryLite, 
//			UnknownFieldSet

public static final class DescriptorProtos$SourceCodeInfo$Location$Builder extends GeneratedMessageV3.Builder
	implements 
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder addAllLeadingDetachedComments(Iterable iterable)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder addAllPath(Iterable iterable)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder addAllSpan(Iterable iterable)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder addLeadingDetachedComments(String s)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder addLeadingDetachedCommentsBytes(ByteString bytestring)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder addPath(int i)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$SourceCodeInfo$Location$Builder)super.addRepeatedField(fielddescriptor, obj);
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder addSpan(int i)
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

	public DescriptorProtos.SourceCodeInfo.Location build()
	{
		DescriptorProtos.SourceCodeInfo.Location location = buildPartial();
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

	public DescriptorProtos.SourceCodeInfo.Location buildPartial()
	{
		DescriptorProtos.SourceCodeInfo.Location location = new DescriptorProtos.SourceCodeInfo.Location(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
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
		DescriptorProtos.SourceCodeInfo.Location.access$27602(location, path_);
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
		DescriptorProtos.SourceCodeInfo.Location.access$27702(location, span_);
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
		DescriptorProtos.SourceCodeInfo.Location.access$27802(location, leadingComments_);
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
		DescriptorProtos.SourceCodeInfo.Location.access$27902(location, trailingComments_);
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
		DescriptorProtos.SourceCodeInfo.Location.access$28002(location, leadingDetachedComments_);
	//  100  182:aload           4
	//  101  184:aload_0         
	//  102  185:getfield        #54  <Field LazyStringList leadingDetachedComments_>
	//  103  188:invokestatic    #193 <Method LazyStringList DescriptorProtos$SourceCodeInfo$Location.access$28002(DescriptorProtos$SourceCodeInfo$Location, LazyStringList)>
	//  104  191:pop             
		DescriptorProtos.SourceCodeInfo.Location.access$28102(location, j);
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder clear()
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$SourceCodeInfo$Location$Builder)super.clearField(fielddescriptor);
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder clearLeadingComments()
	{
		bitField0_ = bitField0_ & -5;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #68  <Field int bitField0_>
	//    3    5:bipush          -5
	//    4    7:iand            
	//    5    8:putfield        #68  <Field int bitField0_>
		leadingComments_ = ((Object) (DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getLeadingComments()));
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder clearLeadingDetachedComments()
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$SourceCodeInfo$Location$Builder)super.clearOneof(oneofdescriptor);
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder clearPath()
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder clearSpan()
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder clearTrailingComments()
	{
		bitField0_ = bitField0_ & -9;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #68  <Field int bitField0_>
	//    3    5:bipush          -9
	//    4    7:iand            
	//    5    8:putfield        #68  <Field int bitField0_>
		trailingComments_ = ((Object) (DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance().getTrailingComments()));
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder clone()
	{
		return (DescriptorProtos$SourceCodeInfo$Location$Builder)super.clone();
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

	public DescriptorProtos.SourceCodeInfo.Location getDefaultInstanceForType()
	{
		return DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance();
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.SourceCodeInfo.Location)DescriptorProtos.SourceCodeInfo.Location.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
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
			mergeFrom(((DescriptorProtos.SourceCodeInfo.Location) (codedinputstream)));
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.SourceCodeInfo.Location)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.SourceCodeInfo.Location) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(DescriptorProtos.SourceCodeInfo.Location location)
	{
		if(location == DescriptorProtos.SourceCodeInfo.Location.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #222 <Method DescriptorProtos$SourceCodeInfo$Location DescriptorProtos$SourceCodeInfo$Location.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(!DescriptorProtos.SourceCodeInfo.Location.access$27600(location).isEmpty())
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
				path_ = DescriptorProtos.SourceCodeInfo.Location.access$27600(location);
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
				path_.addAll(((java.util.Collection) (DescriptorProtos.SourceCodeInfo.Location.access$27600(location))));
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
		if(!DescriptorProtos.SourceCodeInfo.Location.access$27700(location).isEmpty())
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
				span_ = DescriptorProtos.SourceCodeInfo.Location.access$27700(location);
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
				span_.addAll(((java.util.Collection) (DescriptorProtos.SourceCodeInfo.Location.access$27700(location))));
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
			leadingComments_ = DescriptorProtos.SourceCodeInfo.Location.access$27800(location);
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
			trailingComments_ = DescriptorProtos.SourceCodeInfo.Location.access$27900(location);
	//   87  192:aload_0         
	//   88  193:aload_1         
	//   89  194:invokestatic    #377 <Method Object DescriptorProtos$SourceCodeInfo$Location.access$27900(DescriptorProtos$SourceCodeInfo$Location)>
	//   90  197:putfield        #47  <Field Object trailingComments_>
			onChanged();
	//   91  200:aload_0         
	//   92  201:invokevirtual   #102 <Method void onChanged()>
		}
		if(!DescriptorProtos.SourceCodeInfo.Location.access$28000(location).isEmpty())
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
				leadingDetachedComments_ = DescriptorProtos.SourceCodeInfo.Location.access$28000(location);
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
				leadingDetachedComments_.addAll(((java.util.Collection) (DescriptorProtos.SourceCodeInfo.Location.access$28000(location))));
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.SourceCodeInfo.Location)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #14  <Class DescriptorProtos$SourceCodeInfo$Location>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.SourceCodeInfo.Location)message);
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

	public final DescriptorProtos$SourceCodeInfo$Location$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$SourceCodeInfo$Location$Builder)super.mergeUnknownFields(unknownfieldset);
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$SourceCodeInfo$Location$Builder)super.setField(fielddescriptor, obj);
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder setLeadingComments(String s)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder setLeadingCommentsBytes(ByteString bytestring)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder setLeadingDetachedComments(int i, String s)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder setPath(int i, int j)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$SourceCodeInfo$Location$Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder setSpan(int i, int j)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder setTrailingComments(String s)
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

	public DescriptorProtos$SourceCodeInfo$Location$Builder setTrailingCommentsBytes(ByteString bytestring)
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

	public final DescriptorProtos$SourceCodeInfo$Location$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$SourceCodeInfo$Location$Builder)super.setUnknownFields(unknownfieldset);
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

	private DescriptorProtos$SourceCodeInfo$Location$Builder()
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

	DescriptorProtos$SourceCodeInfo$Location$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void DescriptorProtos$SourceCodeInfo$Location$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$SourceCodeInfo$Location$Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	DescriptorProtos$SourceCodeInfo$Location$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void DescriptorProtos$SourceCodeInfo$Location$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
