// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, SingleFieldBuilderV3, GeneratedMessageV3, ByteString, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$MethodDescriptorProto$Builder extends GeneratedMessageV3.Builder
	implements 
{

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$13600();
	//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$13600()>
	//    1    3:areturn         
	}

	private SingleFieldBuilderV3 getOptionsFieldBuilder()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       35
		{
			optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//    3    7:aload_0         
	//    4    8:new             #63  <Class SingleFieldBuilderV3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #67  <Method DescriptorProtos$MethodOptions getOptions()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #71  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #75  <Method boolean isClean()>
	//   12   24:invokespecial   #78  <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
	//   13   27:putfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
			options_ = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #41  <Field DescriptorProtos$MethodOptions options_>
		}
		return optionsBuilder_;
	//   17   35:aload_0         
	//   18   36:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   19   39:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #85  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getOptionsFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #87  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$MethodDescriptorProto$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$MethodDescriptorProto$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #92  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MethodDescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #94  <Method DescriptorProtos$MethodDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #94  <Method DescriptorProtos$MethodDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos.MethodDescriptorProto build()
	{
		DescriptorProtos.MethodDescriptorProto methoddescriptorproto = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method DescriptorProtos$MethodDescriptorProto buildPartial()>
	//    2    4:astore_1        
		if(!methoddescriptorproto.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #103 <Method boolean DescriptorProtos$MethodDescriptorProto.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (methoddescriptorproto)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #107 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return methoddescriptorproto;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method DescriptorProtos$MethodDescriptorProto build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method DescriptorProtos$MethodDescriptorProto build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.MethodDescriptorProto buildPartial()
	{
		DescriptorProtos.MethodDescriptorProto methoddescriptorproto = new DescriptorProtos.MethodDescriptorProto(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$MethodDescriptorProto>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #114 <Method void DescriptorProtos$MethodDescriptorProto(GeneratedMessageV3$Builder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #116 <Field int bitField0_>
	//    8   15:istore_3        
		int j = 0;
	//    9   16:iconst_0        
	//   10   17:istore_2        
		if((k & 1) == 1)
	//*  11   18:iload_3         
	//*  12   19:iconst_1        
	//*  13   20:iand            
	//*  14   21:iconst_1        
	//*  15   22:icmpne          27
			j = 1;
	//   16   25:iconst_1        
	//   17   26:istore_2        
		DescriptorProtos.MethodDescriptorProto.access$14102(methoddescriptorproto, name_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #35  <Field Object name_>
	//   21   33:invokestatic    #120 <Method Object DescriptorProtos$MethodDescriptorProto.access$14102(DescriptorProtos$MethodDescriptorProto, Object)>
	//   22   36:pop             
		int i = j;
	//   23   37:iload_2         
	//   24   38:istore_1        
		if((k & 2) == 2)
	//*  25   39:iload_3         
	//*  26   40:iconst_2        
	//*  27   41:iand            
	//*  28   42:iconst_2        
	//*  29   43:icmpne          50
			i = j | 2;
	//   30   46:iload_2         
	//   31   47:iconst_2        
	//   32   48:ior             
	//   33   49:istore_1        
		DescriptorProtos.MethodDescriptorProto.access$14202(methoddescriptorproto, inputType_);
	//   34   50:aload           4
	//   35   52:aload_0         
	//   36   53:getfield        #37  <Field Object inputType_>
	//   37   56:invokestatic    #123 <Method Object DescriptorProtos$MethodDescriptorProto.access$14202(DescriptorProtos$MethodDescriptorProto, Object)>
	//   38   59:pop             
		j = i;
	//   39   60:iload_1         
	//   40   61:istore_2        
		if((k & 4) == 4)
	//*  41   62:iload_3         
	//*  42   63:iconst_4        
	//*  43   64:iand            
	//*  44   65:iconst_4        
	//*  45   66:icmpne          73
			j = i | 4;
	//   46   69:iload_1         
	//   47   70:iconst_4        
	//   48   71:ior             
	//   49   72:istore_2        
		DescriptorProtos.MethodDescriptorProto.access$14302(methoddescriptorproto, outputType_);
	//   50   73:aload           4
	//   51   75:aload_0         
	//   52   76:getfield        #39  <Field Object outputType_>
	//   53   79:invokestatic    #126 <Method Object DescriptorProtos$MethodDescriptorProto.access$14302(DescriptorProtos$MethodDescriptorProto, Object)>
	//   54   82:pop             
		i = j;
	//   55   83:iload_2         
	//   56   84:istore_1        
		if((k & 8) == 8)
	//*  57   85:iload_3         
	//*  58   86:bipush          8
	//*  59   88:iand            
	//*  60   89:bipush          8
	//*  61   91:icmpne          99
			i = j | 8;
	//   62   94:iload_2         
	//   63   95:bipush          8
	//   64   97:ior             
	//   65   98:istore_1        
		if(optionsBuilder_ == null)
	//*  66   99:aload_0         
	//*  67  100:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*  68  103:ifnonnull       119
			DescriptorProtos.MethodDescriptorProto.access$14402(methoddescriptorproto, options_);
	//   69  106:aload           4
	//   70  108:aload_0         
	//   71  109:getfield        #41  <Field DescriptorProtos$MethodOptions options_>
	//   72  112:invokestatic    #130 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodDescriptorProto.access$14402(DescriptorProtos$MethodDescriptorProto, DescriptorProtos$MethodOptions)>
	//   73  115:pop             
		else
	//*  74  116:goto            135
			DescriptorProtos.MethodDescriptorProto.access$14402(methoddescriptorproto, (DescriptorProtos.MethodOptions)optionsBuilder_.build());
	//   75  119:aload           4
	//   76  121:aload_0         
	//   77  122:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   78  125:invokevirtual   #133 <Method AbstractMessage SingleFieldBuilderV3.build()>
	//   79  128:checkcast       #135 <Class DescriptorProtos$MethodOptions>
	//   80  131:invokestatic    #130 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodDescriptorProto.access$14402(DescriptorProtos$MethodDescriptorProto, DescriptorProtos$MethodOptions)>
	//   81  134:pop             
		j = i;
	//   82  135:iload_1         
	//   83  136:istore_2        
		if((k & 0x10) == 16)
	//*  84  137:iload_3         
	//*  85  138:bipush          16
	//*  86  140:iand            
	//*  87  141:bipush          16
	//*  88  143:icmpne          151
			j = i | 0x10;
	//   89  146:iload_1         
	//   90  147:bipush          16
	//   91  149:ior             
	//   92  150:istore_2        
		DescriptorProtos.MethodDescriptorProto.access$14502(methoddescriptorproto, clientStreaming_);
	//   93  151:aload           4
	//   94  153:aload_0         
	//   95  154:getfield        #137 <Field boolean clientStreaming_>
	//   96  157:invokestatic    #141 <Method boolean DescriptorProtos$MethodDescriptorProto.access$14502(DescriptorProtos$MethodDescriptorProto, boolean)>
	//   97  160:pop             
		i = j;
	//   98  161:iload_2         
	//   99  162:istore_1        
		if((k & 0x20) == 32)
	//* 100  163:iload_3         
	//* 101  164:bipush          32
	//* 102  166:iand            
	//* 103  167:bipush          32
	//* 104  169:icmpne          177
			i = j | 0x20;
	//  105  172:iload_2         
	//  106  173:bipush          32
	//  107  175:ior             
	//  108  176:istore_1        
		DescriptorProtos.MethodDescriptorProto.access$14602(methoddescriptorproto, serverStreaming_);
	//  109  177:aload           4
	//  110  179:aload_0         
	//  111  180:getfield        #143 <Field boolean serverStreaming_>
	//  112  183:invokestatic    #146 <Method boolean DescriptorProtos$MethodDescriptorProto.access$14602(DescriptorProtos$MethodDescriptorProto, boolean)>
	//  113  186:pop             
		DescriptorProtos.MethodDescriptorProto.access$14702(methoddescriptorproto, i);
	//  114  187:aload           4
	//  115  189:iload_1         
	//  116  190:invokestatic    #150 <Method int DescriptorProtos$MethodDescriptorProto.access$14702(DescriptorProtos$MethodDescriptorProto, int)>
	//  117  193:pop             
		onBuilt();
	//  118  194:aload_0         
	//  119  195:invokevirtual   #153 <Method void onBuilt()>
		return methoddescriptorproto;
	//  120  198:aload           4
	//  121  200:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method DescriptorProtos$MethodDescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method DescriptorProtos$MethodDescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method DescriptorProtos$MethodDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #161 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #33  <String "">
	//    5    8:putfield        #35  <Field Object name_>
		bitField0_ = bitField0_ & -2;
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #116 <Field int bitField0_>
	//    9   16:bipush          -2
	//   10   18:iand            
	//   11   19:putfield        #116 <Field int bitField0_>
		inputType_ = "";
	//   12   22:aload_0         
	//   13   23:ldc1            #33  <String "">
	//   14   25:putfield        #37  <Field Object inputType_>
		bitField0_ = bitField0_ & -3;
	//   15   28:aload_0         
	//   16   29:aload_0         
	//   17   30:getfield        #116 <Field int bitField0_>
	//   18   33:bipush          -3
	//   19   35:iand            
	//   20   36:putfield        #116 <Field int bitField0_>
		outputType_ = "";
	//   21   39:aload_0         
	//   22   40:ldc1            #33  <String "">
	//   23   42:putfield        #39  <Field Object outputType_>
		bitField0_ = bitField0_ & -5;
	//   24   45:aload_0         
	//   25   46:aload_0         
	//   26   47:getfield        #116 <Field int bitField0_>
	//   27   50:bipush          -5
	//   28   52:iand            
	//   29   53:putfield        #116 <Field int bitField0_>
		if(optionsBuilder_ == null)
	//*  30   56:aload_0         
	//*  31   57:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*  32   60:ifnonnull       71
			options_ = null;
	//   33   63:aload_0         
	//   34   64:aconst_null     
	//   35   65:putfield        #41  <Field DescriptorProtos$MethodOptions options_>
		else
	//*  36   68:goto            79
			optionsBuilder_.clear();
	//   37   71:aload_0         
	//   38   72:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   39   75:invokevirtual   #163 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//   40   78:pop             
		bitField0_ = bitField0_ & -9;
	//   41   79:aload_0         
	//   42   80:aload_0         
	//   43   81:getfield        #116 <Field int bitField0_>
	//   44   84:bipush          -9
	//   45   86:iand            
	//   46   87:putfield        #116 <Field int bitField0_>
		clientStreaming_ = false;
	//   47   90:aload_0         
	//   48   91:iconst_0        
	//   49   92:putfield        #137 <Field boolean clientStreaming_>
		bitField0_ = bitField0_ & 0xffffffef;
	//   50   95:aload_0         
	//   51   96:aload_0         
	//   52   97:getfield        #116 <Field int bitField0_>
	//   53  100:bipush          -17
	//   54  102:iand            
	//   55  103:putfield        #116 <Field int bitField0_>
		serverStreaming_ = false;
	//   56  106:aload_0         
	//   57  107:iconst_0        
	//   58  108:putfield        #143 <Field boolean serverStreaming_>
		bitField0_ = bitField0_ & 0xffffffdf;
	//   59  111:aload_0         
	//   60  112:aload_0         
	//   61  113:getfield        #116 <Field int bitField0_>
	//   62  116:bipush          -33
	//   63  118:iand            
	//   64  119:putfield        #116 <Field int bitField0_>
		return this;
	//   65  122:aload_0         
	//   66  123:areturn         
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method DescriptorProtos$MethodDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method DescriptorProtos$MethodDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method DescriptorProtos$MethodDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clearClientStreaming()
	{
		bitField0_ = bitField0_ & 0xffffffef;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field int bitField0_>
	//    3    5:bipush          -17
	//    4    7:iand            
	//    5    8:putfield        #116 <Field int bitField0_>
		clientStreaming_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #137 <Field boolean clientStreaming_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #169 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$MethodDescriptorProto$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MethodDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method DescriptorProtos$MethodDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method DescriptorProtos$MethodDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clearInputType()
	{
		bitField0_ = bitField0_ & -3;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field int bitField0_>
	//    3    5:bipush          -3
	//    4    7:iand            
	//    5    8:putfield        #116 <Field int bitField0_>
		inputType_ = ((Object) (DescriptorProtos.MethodDescriptorProto.getDefaultInstance().getInputType()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #181 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #185 <Method String DescriptorProtos$MethodDescriptorProto.getInputType()>
	//    9   18:putfield        #37  <Field Object inputType_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #169 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clearName()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #116 <Field int bitField0_>
		name_ = ((Object) (DescriptorProtos.MethodDescriptorProto.getDefaultInstance().getName()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #181 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #189 <Method String DescriptorProtos$MethodDescriptorProto.getName()>
	//    9   18:putfield        #35  <Field Object name_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #169 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method DescriptorProtos$MethodDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$MethodDescriptorProto$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #197 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MethodDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method DescriptorProtos$MethodDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method DescriptorProtos$MethodDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clearOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       19
		{
			options_ = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #41  <Field DescriptorProtos$MethodOptions options_>
			onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #169 <Method void onChanged()>
		} else
	//*   8   16:goto            27
		{
			optionsBuilder_.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   11   23:invokevirtual   #163 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//   12   26:pop             
		}
		bitField0_ = bitField0_ & -9;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #116 <Field int bitField0_>
	//   16   32:bipush          -9
	//   17   34:iand            
	//   18   35:putfield        #116 <Field int bitField0_>
		return this;
	//   19   38:aload_0         
	//   20   39:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clearOutputType()
	{
		bitField0_ = bitField0_ & -5;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field int bitField0_>
	//    3    5:bipush          -5
	//    4    7:iand            
	//    5    8:putfield        #116 <Field int bitField0_>
		outputType_ = ((Object) (DescriptorProtos.MethodDescriptorProto.getDefaultInstance().getOutputType()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #181 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #203 <Method String DescriptorProtos$MethodDescriptorProto.getOutputType()>
	//    9   18:putfield        #39  <Field Object outputType_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #169 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clearServerStreaming()
	{
		bitField0_ = bitField0_ & 0xffffffdf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field int bitField0_>
	//    3    5:bipush          -33
	//    4    7:iand            
	//    5    8:putfield        #116 <Field int bitField0_>
		serverStreaming_ = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #143 <Field boolean serverStreaming_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #169 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method DescriptorProtos$MethodDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method DescriptorProtos$MethodDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder clone()
	{
		return (DescriptorProtos$MethodDescriptorProto$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #210 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$MethodDescriptorProto$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method DescriptorProtos$MethodDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method DescriptorProtos$MethodDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method DescriptorProtos$MethodDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method DescriptorProtos$MethodDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public boolean getClientStreaming()
	{
		return clientStreaming_;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field boolean clientStreaming_>
	//    2    4:ireturn         
	}

	public DescriptorProtos.MethodDescriptorProto getDefaultInstanceForType()
	{
		return DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
	//    0    0:invokestatic    #181 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #218 <Method DescriptorProtos$MethodDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #218 <Method DescriptorProtos$MethodDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$13600();
	//    0    0:invokestatic    #57  <Method Descriptors$Descriptor DescriptorProtos.access$13600()>
	//    1    3:areturn         
	}

	public String getInputType()
	{
		Object obj = inputType_;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object inputType_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #221 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #223 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #226 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #229 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				inputType_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #37  <Field Object inputType_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #221 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getInputTypeBytes()
	{
		Object obj = inputType_;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object inputType_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #221 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #221 <Class String>
	//    8   16:invokestatic    #235 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			inputType_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #37  <Field Object inputType_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #223 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object name_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #221 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #223 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #226 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #229 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				name_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #35  <Field Object name_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #221 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #221 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #221 <Class String>
	//    8   16:invokestatic    #235 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #35  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #223 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.MethodOptions getOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       23
		{
			if(options_ == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field DescriptorProtos$MethodOptions options_>
	//*   5   11:ifnonnull       18
				return DescriptorProtos.MethodOptions.getDefaultInstance();
	//    6   14:invokestatic    #238 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodOptions.getDefaultInstance()>
	//    7   17:areturn         
			else
				return options_;
	//    8   18:aload_0         
	//    9   19:getfield        #41  <Field DescriptorProtos$MethodOptions options_>
	//   10   22:areturn         
		} else
		{
			return (DescriptorProtos.MethodOptions)optionsBuilder_.getMessage();
	//   11   23:aload_0         
	//   12   24:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   13   27:invokevirtual   #241 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
	//   14   30:checkcast       #135 <Class DescriptorProtos$MethodOptions>
	//   15   33:areturn         
		}
	}

	public DescriptorProtos.MethodOptions.Builder getOptionsBuilder()
	{
		bitField0_ = bitField0_ | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field int bitField0_>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #116 <Field int bitField0_>
		onChanged();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #169 <Method void onChanged()>
		return (DescriptorProtos.MethodOptions.Builder)getOptionsFieldBuilder().getBuilder();
	//    8   15:aload_0         
	//    9   16:invokespecial   #87  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//   10   19:invokevirtual   #246 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
	//   11   22:checkcast       #248 <Class DescriptorProtos$MethodOptions$Builder>
	//   12   25:areturn         
	}

	public DescriptorProtos.MethodOptionsOrBuilder getOptionsOrBuilder()
	{
		if(optionsBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnull          18
			return (DescriptorProtos.MethodOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//    5   11:invokevirtual   #254 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
	//    6   14:checkcast       #256 <Class DescriptorProtos$MethodOptionsOrBuilder>
	//    7   17:areturn         
		if(options_ == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #41  <Field DescriptorProtos$MethodOptions options_>
	//*  10   22:ifnonnull       29
			return ((DescriptorProtos.MethodOptionsOrBuilder) (DescriptorProtos.MethodOptions.getDefaultInstance()));
	//   11   25:invokestatic    #238 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodOptions.getDefaultInstance()>
	//   12   28:areturn         
		else
			return ((DescriptorProtos.MethodOptionsOrBuilder) (options_));
	//   13   29:aload_0         
	//   14   30:getfield        #41  <Field DescriptorProtos$MethodOptions options_>
	//   15   33:areturn         
	}

	public String getOutputType()
	{
		Object obj = outputType_;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Object outputType_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #221 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #223 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #226 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #229 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				outputType_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #39  <Field Object outputType_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #221 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getOutputTypeBytes()
	{
		Object obj = outputType_;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Object outputType_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #221 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #221 <Class String>
	//    8   16:invokestatic    #235 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			outputType_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #39  <Field Object outputType_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #223 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean getServerStreaming()
	{
		return serverStreaming_;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field boolean serverStreaming_>
	//    2    4:ireturn         
	}

	public boolean hasClientStreaming()
	{
		return (bitField0_ & 0x10) == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int bitField0_>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:bipush          16
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasInputType()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int bitField0_>
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
		return (bitField0_ & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int bitField0_>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasOutputType()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasServerStreaming()
	{
		return (bitField0_ & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int bitField0_>
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
		return DescriptorProtos.access$13700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$MethodDescriptorProto, com/google/protobuf/DescriptorProtos$MethodDescriptorProto$Builder);
	//    0    0:invokestatic    #269 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$13700()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$MethodDescriptorProto>
	//    2    5:ldc1            #2   <Class DescriptorProtos$MethodDescriptorProto$Builder>
	//    3    7:invokevirtual   #275 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		return !hasOptions() || getOptions().isInitialized();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #277 <Method boolean hasOptions()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #67  <Method DescriptorProtos$MethodOptions getOptions()>
	//    5   11:invokevirtual   #278 <Method boolean DescriptorProtos$MethodOptions.isInitialized()>
	//    6   14:ifne            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #285 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #289 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #285 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.MethodDescriptorProto)DescriptorProtos.MethodDescriptorProto.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #296 <Field Parser DescriptorProtos$MethodDescriptorProto.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #302 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$MethodDescriptorProto>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.MethodDescriptorProto) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #305 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(DescriptorProtos$MethodDescriptorProto)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #308 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$MethodDescriptorProto>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #312 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #305 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(DescriptorProtos$MethodDescriptorProto)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.MethodDescriptorProto)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.MethodDescriptorProto) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(DescriptorProtos.MethodDescriptorProto methoddescriptorproto)
	{
		if(methoddescriptorproto == DescriptorProtos.MethodDescriptorProto.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #181 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(methoddescriptorproto.hasName())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #314 <Method boolean DescriptorProtos$MethodDescriptorProto.hasName()>
	//*   7   13:ifeq            38
		{
			bitField0_ = bitField0_ | 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #116 <Field int bitField0_>
	//   11   21:iconst_1        
	//   12   22:ior             
	//   13   23:putfield        #116 <Field int bitField0_>
			name_ = DescriptorProtos.MethodDescriptorProto.access$14100(methoddescriptorproto);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokestatic    #318 <Method Object DescriptorProtos$MethodDescriptorProto.access$14100(DescriptorProtos$MethodDescriptorProto)>
	//   17   31:putfield        #35  <Field Object name_>
			onChanged();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #169 <Method void onChanged()>
		}
		if(methoddescriptorproto.hasInputType())
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #320 <Method boolean DescriptorProtos$MethodDescriptorProto.hasInputType()>
	//*  22   42:ifeq            67
		{
			bitField0_ = bitField0_ | 2;
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #116 <Field int bitField0_>
	//   26   50:iconst_2        
	//   27   51:ior             
	//   28   52:putfield        #116 <Field int bitField0_>
			inputType_ = DescriptorProtos.MethodDescriptorProto.access$14200(methoddescriptorproto);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokestatic    #323 <Method Object DescriptorProtos$MethodDescriptorProto.access$14200(DescriptorProtos$MethodDescriptorProto)>
	//   32   60:putfield        #37  <Field Object inputType_>
			onChanged();
	//   33   63:aload_0         
	//   34   64:invokevirtual   #169 <Method void onChanged()>
		}
		if(methoddescriptorproto.hasOutputType())
	//*  35   67:aload_1         
	//*  36   68:invokevirtual   #325 <Method boolean DescriptorProtos$MethodDescriptorProto.hasOutputType()>
	//*  37   71:ifeq            96
		{
			bitField0_ = bitField0_ | 4;
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #116 <Field int bitField0_>
	//   41   79:iconst_4        
	//   42   80:ior             
	//   43   81:putfield        #116 <Field int bitField0_>
			outputType_ = DescriptorProtos.MethodDescriptorProto.access$14300(methoddescriptorproto);
	//   44   84:aload_0         
	//   45   85:aload_1         
	//   46   86:invokestatic    #328 <Method Object DescriptorProtos$MethodDescriptorProto.access$14300(DescriptorProtos$MethodDescriptorProto)>
	//   47   89:putfield        #39  <Field Object outputType_>
			onChanged();
	//   48   92:aload_0         
	//   49   93:invokevirtual   #169 <Method void onChanged()>
		}
		if(methoddescriptorproto.hasOptions())
	//*  50   96:aload_1         
	//*  51   97:invokevirtual   #329 <Method boolean DescriptorProtos$MethodDescriptorProto.hasOptions()>
	//*  52  100:ifeq            112
			mergeOptions(methoddescriptorproto.getOptions());
	//   53  103:aload_0         
	//   54  104:aload_1         
	//   55  105:invokevirtual   #330 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodDescriptorProto.getOptions()>
	//   56  108:invokevirtual   #334 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeOptions(DescriptorProtos$MethodOptions)>
	//   57  111:pop             
		if(methoddescriptorproto.hasClientStreaming())
	//*  58  112:aload_1         
	//*  59  113:invokevirtual   #336 <Method boolean DescriptorProtos$MethodDescriptorProto.hasClientStreaming()>
	//*  60  116:ifeq            128
			setClientStreaming(methoddescriptorproto.getClientStreaming());
	//   61  119:aload_0         
	//   62  120:aload_1         
	//   63  121:invokevirtual   #338 <Method boolean DescriptorProtos$MethodDescriptorProto.getClientStreaming()>
	//   64  124:invokevirtual   #342 <Method DescriptorProtos$MethodDescriptorProto$Builder setClientStreaming(boolean)>
	//   65  127:pop             
		if(methoddescriptorproto.hasServerStreaming())
	//*  66  128:aload_1         
	//*  67  129:invokevirtual   #344 <Method boolean DescriptorProtos$MethodDescriptorProto.hasServerStreaming()>
	//*  68  132:ifeq            144
			setServerStreaming(methoddescriptorproto.getServerStreaming());
	//   69  135:aload_0         
	//   70  136:aload_1         
	//   71  137:invokevirtual   #346 <Method boolean DescriptorProtos$MethodDescriptorProto.getServerStreaming()>
	//   72  140:invokevirtual   #349 <Method DescriptorProtos$MethodDescriptorProto$Builder setServerStreaming(boolean)>
	//   73  143:pop             
		mergeUnknownFields(methoddescriptorproto.unknownFields);
	//   74  144:aload_0         
	//   75  145:aload_1         
	//   76  146:getfield        #353 <Field UnknownFieldSet DescriptorProtos$MethodDescriptorProto.unknownFields>
	//   77  149:invokevirtual   #357 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//   78  152:pop             
		onChanged();
	//   79  153:aload_0         
	//   80  154:invokevirtual   #169 <Method void onChanged()>
		return this;
	//   81  157:aload_0         
	//   82  158:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.MethodDescriptorProto)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$MethodDescriptorProto>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.MethodDescriptorProto)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$MethodDescriptorProto>
	//    6   12:invokevirtual   #305 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(DescriptorProtos$MethodDescriptorProto)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #359 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #285 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #289 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #285 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder mergeOptions(DescriptorProtos.MethodOptions methodoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       69
		{
			if((bitField0_ & 8) == 8 && options_ != null && options_ != DescriptorProtos.MethodOptions.getDefaultInstance())
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field int bitField0_>
	//*   5   11:bipush          8
	//*   6   13:iand            
	//*   7   14:bipush          8
	//*   8   16:icmpne          57
	//*   9   19:aload_0         
	//*  10   20:getfield        #41  <Field DescriptorProtos$MethodOptions options_>
	//*  11   23:ifnull          57
	//*  12   26:aload_0         
	//*  13   27:getfield        #41  <Field DescriptorProtos$MethodOptions options_>
	//*  14   30:invokestatic    #238 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodOptions.getDefaultInstance()>
	//*  15   33:if_acmpeq       57
				options_ = DescriptorProtos.MethodOptions.newBuilder(options_).mergeFrom(methodoptions).buildPartial();
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #41  <Field DescriptorProtos$MethodOptions options_>
	//   19   41:invokestatic    #366 <Method DescriptorProtos$MethodOptions$Builder DescriptorProtos$MethodOptions.newBuilder(DescriptorProtos$MethodOptions)>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #368 <Method DescriptorProtos$MethodOptions$Builder DescriptorProtos$MethodOptions$Builder.mergeFrom(DescriptorProtos$MethodOptions)>
	//   22   48:invokevirtual   #370 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodOptions$Builder.buildPartial()>
	//   23   51:putfield        #41  <Field DescriptorProtos$MethodOptions options_>
			else
	//*  24   54:goto            62
				options_ = methodoptions;
	//   25   57:aload_0         
	//   26   58:aload_1         
	//   27   59:putfield        #41  <Field DescriptorProtos$MethodOptions options_>
			onChanged();
	//   28   62:aload_0         
	//   29   63:invokevirtual   #169 <Method void onChanged()>
		} else
	//*  30   66:goto            78
		{
			optionsBuilder_.mergeFrom(((AbstractMessage) (methodoptions)));
	//   31   69:aload_0         
	//   32   70:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   33   73:aload_1         
	//   34   74:invokevirtual   #373 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
	//   35   77:pop             
		}
		bitField0_ = bitField0_ | 8;
	//   36   78:aload_0         
	//   37   79:aload_0         
	//   38   80:getfield        #116 <Field int bitField0_>
	//   39   83:bipush          8
	//   40   85:ior             
	//   41   86:putfield        #116 <Field int bitField0_>
		return this;
	//   42   89:aload_0         
	//   43   90:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #357 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$MethodDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$MethodDescriptorProto$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #377 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MethodDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #357 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #357 <Method DescriptorProtos$MethodDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setClientStreaming(boolean flag)
	{
		bitField0_ = bitField0_ | 0x10;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field int bitField0_>
	//    3    5:bipush          16
	//    4    7:ior             
	//    5    8:putfield        #116 <Field int bitField0_>
		clientStreaming_ = flag;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #137 <Field boolean clientStreaming_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #169 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$MethodDescriptorProto$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #381 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$MethodDescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #383 <Method DescriptorProtos$MethodDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #383 <Method DescriptorProtos$MethodDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setInputType(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #387 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #388 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 2;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #116 <Field int bitField0_>
	//    9   17:iconst_2        
	//   10   18:ior             
	//   11   19:putfield        #116 <Field int bitField0_>
			inputType_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #37  <Field Object inputType_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #169 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setInputTypeBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #387 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #388 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 2;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #116 <Field int bitField0_>
	//    9   17:iconst_2        
	//   10   18:ior             
	//   11   19:putfield        #116 <Field int bitField0_>
			inputType_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #37  <Field Object inputType_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #169 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #387 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #388 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #116 <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #116 <Field int bitField0_>
			name_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #35  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #169 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #387 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #388 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #116 <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #116 <Field int bitField0_>
			name_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #35  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #169 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setOptions(DescriptorProtos.MethodOptions.Builder builder)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       22
		{
			options_ = builder.build();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #396 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodOptions$Builder.build()>
	//    6   12:putfield        #41  <Field DescriptorProtos$MethodOptions options_>
			onChanged();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #169 <Method void onChanged()>
		} else
	//*   9   19:goto            34
		{
			optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
	//   10   22:aload_0         
	//   11   23:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #396 <Method DescriptorProtos$MethodOptions DescriptorProtos$MethodOptions$Builder.build()>
	//   14   30:invokevirtual   #399 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   15   33:pop             
		}
		bitField0_ = bitField0_ | 8;
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #116 <Field int bitField0_>
	//   19   39:bipush          8
	//   20   41:ior             
	//   21   42:putfield        #116 <Field int bitField0_>
		return this;
	//   22   45:aload_0         
	//   23   46:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setOptions(DescriptorProtos.MethodOptions methodoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       31
		{
			if(methodoptions == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
				throw new NullPointerException();
	//    5   11:new             #387 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #388 <Method void NullPointerException()>
	//    8   18:athrow          
			options_ = methodoptions;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #41  <Field DescriptorProtos$MethodOptions options_>
			onChanged();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #169 <Method void onChanged()>
		} else
	//*  14   28:goto            40
		{
			optionsBuilder_.setMessage(((AbstractMessage) (methodoptions)));
	//   15   31:aload_0         
	//   16   32:getfield        #61  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #399 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   19   39:pop             
		}
		bitField0_ = bitField0_ | 8;
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #116 <Field int bitField0_>
	//   23   45:bipush          8
	//   24   47:ior             
	//   25   48:putfield        #116 <Field int bitField0_>
		return this;
	//   26   51:aload_0         
	//   27   52:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setOutputType(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #387 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #388 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 4;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #116 <Field int bitField0_>
	//    9   17:iconst_4        
	//   10   18:ior             
	//   11   19:putfield        #116 <Field int bitField0_>
			outputType_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #39  <Field Object outputType_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #169 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setOutputTypeBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #387 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #388 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 4;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #116 <Field int bitField0_>
	//    9   17:iconst_4        
	//   10   18:ior             
	//   11   19:putfield        #116 <Field int bitField0_>
			outputType_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #39  <Field Object outputType_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #169 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$MethodDescriptorProto$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #406 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$MethodDescriptorProto$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #408 <Method DescriptorProtos$MethodDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #408 <Method DescriptorProtos$MethodDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$MethodDescriptorProto$Builder setServerStreaming(boolean flag)
	{
		bitField0_ = bitField0_ | 0x20;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field int bitField0_>
	//    3    5:bipush          32
	//    4    7:ior             
	//    5    8:putfield        #116 <Field int bitField0_>
		serverStreaming_ = flag;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #143 <Field boolean serverStreaming_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #169 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public final DescriptorProtos$MethodDescriptorProto$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$MethodDescriptorProto$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #412 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$MethodDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #414 <Method DescriptorProtos$MethodDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #414 <Method DescriptorProtos$MethodDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private boolean clientStreaming_;
	private Object inputType_;
	private Object name_;
	private SingleFieldBuilderV3 optionsBuilder_;
	private DescriptorProtos.MethodOptions options_;
	private Object outputType_;
	private boolean serverStreaming_;

	private DescriptorProtos$MethodDescriptorProto$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void GeneratedMessageV3$Builder()>
		name_ = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <String "">
	//    4    7:putfield        #35  <Field Object name_>
		inputType_ = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #33  <String "">
	//    7   13:putfield        #37  <Field Object inputType_>
		outputType_ = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #33  <String "">
	//   10   19:putfield        #39  <Field Object outputType_>
		options_ = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #41  <Field DescriptorProtos$MethodOptions options_>
		maybeForceBuilderInitialization();
	//   14   27:aload_0         
	//   15   28:invokespecial   #44  <Method void maybeForceBuilderInitialization()>
	//   16   31:return          
	}

	DescriptorProtos$MethodDescriptorProto$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void DescriptorProtos$MethodDescriptorProto$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$MethodDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #33  <String "">
	//    5    8:putfield        #35  <Field Object name_>
		inputType_ = "";
	//    6   11:aload_0         
	//    7   12:ldc1            #33  <String "">
	//    8   14:putfield        #37  <Field Object inputType_>
		outputType_ = "";
	//    9   17:aload_0         
	//   10   18:ldc1            #33  <String "">
	//   11   20:putfield        #39  <Field Object outputType_>
		options_ = null;
	//   12   23:aload_0         
	//   13   24:aconst_null     
	//   14   25:putfield        #41  <Field DescriptorProtos$MethodOptions options_>
		maybeForceBuilderInitialization();
	//   15   28:aload_0         
	//   16   29:invokespecial   #44  <Method void maybeForceBuilderInitialization()>
	//   17   32:return          
	}

	DescriptorProtos$MethodDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void DescriptorProtos$MethodDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
