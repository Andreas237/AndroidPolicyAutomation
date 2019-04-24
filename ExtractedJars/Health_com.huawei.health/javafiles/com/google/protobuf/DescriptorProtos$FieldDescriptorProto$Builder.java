// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, SingleFieldBuilderV3, GeneratedMessageV3, ByteString, 
//			InvalidProtocolBufferException, Parser, Message, MessageLite, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$FieldDescriptorProto$Builder extends GeneratedMessageV3.Builder
	implements 
{

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$6900();
	//    0    0:invokestatic    #68  <Method Descriptors$Descriptor DescriptorProtos.access$6900()>
	//    1    3:areturn         
	}

	private SingleFieldBuilderV3 getOptionsFieldBuilder()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       35
		{
			optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//    3    7:aload_0         
	//    4    8:new             #74  <Class SingleFieldBuilderV3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #78  <Method DescriptorProtos$FieldOptions getOptions()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #82  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #86  <Method boolean isClean()>
	//   12   24:invokespecial   #89  <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
	//   13   27:putfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
			options_ = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #52  <Field DescriptorProtos$FieldOptions options_>
		}
		return optionsBuilder_;
	//   17   35:aload_0         
	//   18   36:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   19   39:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #97  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            11
			getOptionsFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #99  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//    4   10:pop             
	//    5   11:return          
	}

	public DescriptorProtos$FieldDescriptorProto$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FieldDescriptorProto$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #104 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #106 <Method DescriptorProtos$FieldDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #106 <Method DescriptorProtos$FieldDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos.FieldDescriptorProto build()
	{
		DescriptorProtos.FieldDescriptorProto fielddescriptorproto = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method DescriptorProtos$FieldDescriptorProto buildPartial()>
	//    2    4:astore_1        
		if(!fielddescriptorproto.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #115 <Method boolean DescriptorProtos$FieldDescriptorProto.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (fielddescriptorproto)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #119 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return fielddescriptorproto;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method DescriptorProtos$FieldDescriptorProto build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method DescriptorProtos$FieldDescriptorProto build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.FieldDescriptorProto buildPartial()
	{
		DescriptorProtos.FieldDescriptorProto fielddescriptorproto = new DescriptorProtos.FieldDescriptorProto(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$FieldDescriptorProto>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #126 <Method void DescriptorProtos$FieldDescriptorProto(GeneratedMessageV3$Builder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #128 <Field int bitField0_>
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
		DescriptorProtos.FieldDescriptorProto.access$7402(fielddescriptorproto, name_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #38  <Field Object name_>
	//   21   33:invokestatic    #132 <Method Object DescriptorProtos$FieldDescriptorProto.access$7402(DescriptorProtos$FieldDescriptorProto, Object)>
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
		DescriptorProtos.FieldDescriptorProto.access$7502(fielddescriptorproto, number_);
	//   34   50:aload           4
	//   35   52:aload_0         
	//   36   53:getfield        #134 <Field int number_>
	//   37   56:invokestatic    #138 <Method int DescriptorProtos$FieldDescriptorProto.access$7502(DescriptorProtos$FieldDescriptorProto, int)>
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
		DescriptorProtos.FieldDescriptorProto.access$7602(fielddescriptorproto, label_);
	//   50   73:aload           4
	//   51   75:aload_0         
	//   52   76:getfield        #40  <Field int label_>
	//   53   79:invokestatic    #141 <Method int DescriptorProtos$FieldDescriptorProto.access$7602(DescriptorProtos$FieldDescriptorProto, int)>
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
		DescriptorProtos.FieldDescriptorProto.access$7702(fielddescriptorproto, type_);
	//   66   99:aload           4
	//   67  101:aload_0         
	//   68  102:getfield        #42  <Field int type_>
	//   69  105:invokestatic    #144 <Method int DescriptorProtos$FieldDescriptorProto.access$7702(DescriptorProtos$FieldDescriptorProto, int)>
	//   70  108:pop             
		j = i;
	//   71  109:iload_1         
	//   72  110:istore_2        
		if((k & 0x10) == 16)
	//*  73  111:iload_3         
	//*  74  112:bipush          16
	//*  75  114:iand            
	//*  76  115:bipush          16
	//*  77  117:icmpne          125
			j = i | 0x10;
	//   78  120:iload_1         
	//   79  121:bipush          16
	//   80  123:ior             
	//   81  124:istore_2        
		DescriptorProtos.FieldDescriptorProto.access$7802(fielddescriptorproto, typeName_);
	//   82  125:aload           4
	//   83  127:aload_0         
	//   84  128:getfield        #44  <Field Object typeName_>
	//   85  131:invokestatic    #147 <Method Object DescriptorProtos$FieldDescriptorProto.access$7802(DescriptorProtos$FieldDescriptorProto, Object)>
	//   86  134:pop             
		i = j;
	//   87  135:iload_2         
	//   88  136:istore_1        
		if((k & 0x20) == 32)
	//*  89  137:iload_3         
	//*  90  138:bipush          32
	//*  91  140:iand            
	//*  92  141:bipush          32
	//*  93  143:icmpne          151
			i = j | 0x20;
	//   94  146:iload_2         
	//   95  147:bipush          32
	//   96  149:ior             
	//   97  150:istore_1        
		DescriptorProtos.FieldDescriptorProto.access$7902(fielddescriptorproto, extendee_);
	//   98  151:aload           4
	//   99  153:aload_0         
	//  100  154:getfield        #46  <Field Object extendee_>
	//  101  157:invokestatic    #150 <Method Object DescriptorProtos$FieldDescriptorProto.access$7902(DescriptorProtos$FieldDescriptorProto, Object)>
	//  102  160:pop             
		j = i;
	//  103  161:iload_1         
	//  104  162:istore_2        
		if((k & 0x40) == 64)
	//* 105  163:iload_3         
	//* 106  164:bipush          64
	//* 107  166:iand            
	//* 108  167:bipush          64
	//* 109  169:icmpne          177
			j = i | 0x40;
	//  110  172:iload_1         
	//  111  173:bipush          64
	//  112  175:ior             
	//  113  176:istore_2        
		DescriptorProtos.FieldDescriptorProto.access$8002(fielddescriptorproto, defaultValue_);
	//  114  177:aload           4
	//  115  179:aload_0         
	//  116  180:getfield        #48  <Field Object defaultValue_>
	//  117  183:invokestatic    #153 <Method Object DescriptorProtos$FieldDescriptorProto.access$8002(DescriptorProtos$FieldDescriptorProto, Object)>
	//  118  186:pop             
		i = j;
	//  119  187:iload_2         
	//  120  188:istore_1        
		if((k & 0x80) == 128)
	//* 121  189:iload_3         
	//* 122  190:sipush          128
	//* 123  193:iand            
	//* 124  194:sipush          128
	//* 125  197:icmpne          206
			i = j | 0x80;
	//  126  200:iload_2         
	//  127  201:sipush          128
	//  128  204:ior             
	//  129  205:istore_1        
		DescriptorProtos.FieldDescriptorProto.access$8102(fielddescriptorproto, oneofIndex_);
	//  130  206:aload           4
	//  131  208:aload_0         
	//  132  209:getfield        #155 <Field int oneofIndex_>
	//  133  212:invokestatic    #158 <Method int DescriptorProtos$FieldDescriptorProto.access$8102(DescriptorProtos$FieldDescriptorProto, int)>
	//  134  215:pop             
		j = i;
	//  135  216:iload_1         
	//  136  217:istore_2        
		if((k & 0x100) == 256)
	//* 137  218:iload_3         
	//* 138  219:sipush          256
	//* 139  222:iand            
	//* 140  223:sipush          256
	//* 141  226:icmpne          235
			j = i | 0x100;
	//  142  229:iload_1         
	//  143  230:sipush          256
	//  144  233:ior             
	//  145  234:istore_2        
		DescriptorProtos.FieldDescriptorProto.access$8202(fielddescriptorproto, jsonName_);
	//  146  235:aload           4
	//  147  237:aload_0         
	//  148  238:getfield        #50  <Field Object jsonName_>
	//  149  241:invokestatic    #161 <Method Object DescriptorProtos$FieldDescriptorProto.access$8202(DescriptorProtos$FieldDescriptorProto, Object)>
	//  150  244:pop             
		i = j;
	//  151  245:iload_2         
	//  152  246:istore_1        
		if((k & 0x200) == 512)
	//* 153  247:iload_3         
	//* 154  248:sipush          512
	//* 155  251:iand            
	//* 156  252:sipush          512
	//* 157  255:icmpne          264
			i = j | 0x200;
	//  158  258:iload_2         
	//  159  259:sipush          512
	//  160  262:ior             
	//  161  263:istore_1        
		if(optionsBuilder_ == null)
	//* 162  264:aload_0         
	//* 163  265:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//* 164  268:ifnonnull       284
			DescriptorProtos.FieldDescriptorProto.access$8302(fielddescriptorproto, options_);
	//  165  271:aload           4
	//  166  273:aload_0         
	//  167  274:getfield        #52  <Field DescriptorProtos$FieldOptions options_>
	//  168  277:invokestatic    #165 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldDescriptorProto.access$8302(DescriptorProtos$FieldDescriptorProto, DescriptorProtos$FieldOptions)>
	//  169  280:pop             
		else
	//* 170  281:goto            300
			DescriptorProtos.FieldDescriptorProto.access$8302(fielddescriptorproto, (DescriptorProtos.FieldOptions)optionsBuilder_.build());
	//  171  284:aload           4
	//  172  286:aload_0         
	//  173  287:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//  174  290:invokevirtual   #168 <Method AbstractMessage SingleFieldBuilderV3.build()>
	//  175  293:checkcast       #170 <Class DescriptorProtos$FieldOptions>
	//  176  296:invokestatic    #165 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldDescriptorProto.access$8302(DescriptorProtos$FieldDescriptorProto, DescriptorProtos$FieldOptions)>
	//  177  299:pop             
		DescriptorProtos.FieldDescriptorProto.access$8402(fielddescriptorproto, i);
	//  178  300:aload           4
	//  179  302:iload_1         
	//  180  303:invokestatic    #173 <Method int DescriptorProtos$FieldDescriptorProto.access$8402(DescriptorProtos$FieldDescriptorProto, int)>
	//  181  306:pop             
		onBuilt();
	//  182  307:aload_0         
	//  183  308:invokevirtual   #176 <Method void onBuilt()>
		return fielddescriptorproto;
	//  184  311:aload           4
	//  185  313:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method DescriptorProtos$FieldDescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method DescriptorProtos$FieldDescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #181 <Method DescriptorProtos$FieldDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #184 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #36  <String "">
	//    5    8:putfield        #38  <Field Object name_>
		bitField0_ = bitField0_ & -2;
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #128 <Field int bitField0_>
	//    9   16:bipush          -2
	//   10   18:iand            
	//   11   19:putfield        #128 <Field int bitField0_>
		number_ = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #134 <Field int number_>
		bitField0_ = bitField0_ & -3;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #128 <Field int bitField0_>
	//   18   32:bipush          -3
	//   19   34:iand            
	//   20   35:putfield        #128 <Field int bitField0_>
		label_ = 1;
	//   21   38:aload_0         
	//   22   39:iconst_1        
	//   23   40:putfield        #40  <Field int label_>
		bitField0_ = bitField0_ & -5;
	//   24   43:aload_0         
	//   25   44:aload_0         
	//   26   45:getfield        #128 <Field int bitField0_>
	//   27   48:bipush          -5
	//   28   50:iand            
	//   29   51:putfield        #128 <Field int bitField0_>
		type_ = 1;
	//   30   54:aload_0         
	//   31   55:iconst_1        
	//   32   56:putfield        #42  <Field int type_>
		bitField0_ = bitField0_ & -9;
	//   33   59:aload_0         
	//   34   60:aload_0         
	//   35   61:getfield        #128 <Field int bitField0_>
	//   36   64:bipush          -9
	//   37   66:iand            
	//   38   67:putfield        #128 <Field int bitField0_>
		typeName_ = "";
	//   39   70:aload_0         
	//   40   71:ldc1            #36  <String "">
	//   41   73:putfield        #44  <Field Object typeName_>
		bitField0_ = bitField0_ & 0xffffffef;
	//   42   76:aload_0         
	//   43   77:aload_0         
	//   44   78:getfield        #128 <Field int bitField0_>
	//   45   81:bipush          -17
	//   46   83:iand            
	//   47   84:putfield        #128 <Field int bitField0_>
		extendee_ = "";
	//   48   87:aload_0         
	//   49   88:ldc1            #36  <String "">
	//   50   90:putfield        #46  <Field Object extendee_>
		bitField0_ = bitField0_ & 0xffffffdf;
	//   51   93:aload_0         
	//   52   94:aload_0         
	//   53   95:getfield        #128 <Field int bitField0_>
	//   54   98:bipush          -33
	//   55  100:iand            
	//   56  101:putfield        #128 <Field int bitField0_>
		defaultValue_ = "";
	//   57  104:aload_0         
	//   58  105:ldc1            #36  <String "">
	//   59  107:putfield        #48  <Field Object defaultValue_>
		bitField0_ = bitField0_ & 0xffffffbf;
	//   60  110:aload_0         
	//   61  111:aload_0         
	//   62  112:getfield        #128 <Field int bitField0_>
	//   63  115:bipush          -65
	//   64  117:iand            
	//   65  118:putfield        #128 <Field int bitField0_>
		oneofIndex_ = 0;
	//   66  121:aload_0         
	//   67  122:iconst_0        
	//   68  123:putfield        #155 <Field int oneofIndex_>
		bitField0_ = bitField0_ & 0xffffff7f;
	//   69  126:aload_0         
	//   70  127:aload_0         
	//   71  128:getfield        #128 <Field int bitField0_>
	//   72  131:sipush          -129
	//   73  134:iand            
	//   74  135:putfield        #128 <Field int bitField0_>
		jsonName_ = "";
	//   75  138:aload_0         
	//   76  139:ldc1            #36  <String "">
	//   77  141:putfield        #50  <Field Object jsonName_>
		bitField0_ = bitField0_ & 0xfffffeff;
	//   78  144:aload_0         
	//   79  145:aload_0         
	//   80  146:getfield        #128 <Field int bitField0_>
	//   81  149:sipush          -257
	//   82  152:iand            
	//   83  153:putfield        #128 <Field int bitField0_>
		if(optionsBuilder_ == null)
	//*  84  156:aload_0         
	//*  85  157:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*  86  160:ifnonnull       171
			options_ = null;
	//   87  163:aload_0         
	//   88  164:aconst_null     
	//   89  165:putfield        #52  <Field DescriptorProtos$FieldOptions options_>
		else
	//*  90  168:goto            179
			optionsBuilder_.clear();
	//   91  171:aload_0         
	//   92  172:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   93  175:invokevirtual   #186 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//   94  178:pop             
		bitField0_ = bitField0_ & 0xfffffdff;
	//   95  179:aload_0         
	//   96  180:aload_0         
	//   97  181:getfield        #128 <Field int bitField0_>
	//   98  184:sipush          -513
	//   99  187:iand            
	//  100  188:putfield        #128 <Field int bitField0_>
		return this;
	//  101  191:aload_0         
	//  102  192:areturn         
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #181 <Method DescriptorProtos$FieldDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #181 <Method DescriptorProtos$FieldDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #181 <Method DescriptorProtos$FieldDescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearDefaultValue()
	{
		bitField0_ = bitField0_ & 0xffffffbf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:bipush          -65
	//    4    7:iand            
	//    5    8:putfield        #128 <Field int bitField0_>
		defaultValue_ = ((Object) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getDefaultValue()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #192 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #196 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//    9   18:putfield        #48  <Field Object defaultValue_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearExtendee()
	{
		bitField0_ = bitField0_ & 0xffffffdf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:bipush          -33
	//    4    7:iand            
	//    5    8:putfield        #128 <Field int bitField0_>
		extendee_ = ((Object) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getExtendee()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #192 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #203 <Method String DescriptorProtos$FieldDescriptorProto.getExtendee()>
	//    9   18:putfield        #46  <Field Object extendee_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$FieldDescriptorProto$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #208 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #210 <Method DescriptorProtos$FieldDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #210 <Method DescriptorProtos$FieldDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearJsonName()
	{
		bitField0_ = bitField0_ & 0xfffffeff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:sipush          -257
	//    4    8:iand            
	//    5    9:putfield        #128 <Field int bitField0_>
		jsonName_ = ((Object) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getJsonName()));
	//    6   12:aload_0         
	//    7   13:invokestatic    #192 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    8   16:invokevirtual   #215 <Method String DescriptorProtos$FieldDescriptorProto.getJsonName()>
	//    9   19:putfield        #50  <Field Object jsonName_>
		onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearLabel()
	{
		bitField0_ = bitField0_ & -5;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:bipush          -5
	//    4    7:iand            
	//    5    8:putfield        #128 <Field int bitField0_>
		label_ = 1;
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:putfield        #40  <Field int label_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearName()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #128 <Field int bitField0_>
		name_ = ((Object) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getName()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #192 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #220 <Method String DescriptorProtos$FieldDescriptorProto.getName()>
	//    9   18:putfield        #38  <Field Object name_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearNumber()
	{
		bitField0_ = bitField0_ & -3;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:bipush          -3
	//    4    7:iand            
	//    5    8:putfield        #128 <Field int bitField0_>
		number_ = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #134 <Field int number_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method DescriptorProtos$FieldDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$FieldDescriptorProto$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #229 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method DescriptorProtos$FieldDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method DescriptorProtos$FieldDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearOneofIndex()
	{
		bitField0_ = bitField0_ & 0xffffff7f;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:sipush          -129
	//    4    8:iand            
	//    5    9:putfield        #128 <Field int bitField0_>
		oneofIndex_ = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #155 <Field int oneofIndex_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       19
		{
			options_ = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #52  <Field DescriptorProtos$FieldOptions options_>
			onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #199 <Method void onChanged()>
		} else
	//*   8   16:goto            27
		{
			optionsBuilder_.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   11   23:invokevirtual   #186 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//   12   26:pop             
		}
		bitField0_ = bitField0_ & 0xfffffdff;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #128 <Field int bitField0_>
	//   16   32:sipush          -513
	//   17   35:iand            
	//   18   36:putfield        #128 <Field int bitField0_>
		return this;
	//   19   39:aload_0         
	//   20   40:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearType()
	{
		bitField0_ = bitField0_ & -9;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:bipush          -9
	//    4    7:iand            
	//    5    8:putfield        #128 <Field int bitField0_>
		type_ = 1;
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:putfield        #42  <Field int type_>
		onChanged();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clearTypeName()
	{
		bitField0_ = bitField0_ & 0xffffffef;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:bipush          -17
	//    4    7:iand            
	//    5    8:putfield        #128 <Field int bitField0_>
		typeName_ = ((Object) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance().getTypeName()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #192 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #237 <Method String DescriptorProtos$FieldDescriptorProto.getTypeName()>
	//    9   18:putfield        #44  <Field Object typeName_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method DescriptorProtos$FieldDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method DescriptorProtos$FieldDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder clone()
	{
		return (DescriptorProtos$FieldDescriptorProto$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #243 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method DescriptorProtos$FieldDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method DescriptorProtos$FieldDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method DescriptorProtos$FieldDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method DescriptorProtos$FieldDescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.FieldDescriptorProto getDefaultInstanceForType()
	{
		return DescriptorProtos.FieldDescriptorProto.getDefaultInstance();
	//    0    0:invokestatic    #192 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method DescriptorProtos$FieldDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method DescriptorProtos$FieldDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public String getDefaultValue()
	{
		Object obj = defaultValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object defaultValue_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #254 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #257 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #260 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				defaultValue_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #48  <Field Object defaultValue_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #252 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getDefaultValueBytes()
	{
		Object obj = defaultValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object defaultValue_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #252 <Class String>
	//    8   16:invokestatic    #266 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			defaultValue_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #48  <Field Object defaultValue_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #254 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$6900();
	//    0    0:invokestatic    #68  <Method Descriptors$Descriptor DescriptorProtos.access$6900()>
	//    1    3:areturn         
	}

	public String getExtendee()
	{
		Object obj = extendee_;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Object extendee_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #254 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #257 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #260 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				extendee_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #46  <Field Object extendee_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #252 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getExtendeeBytes()
	{
		Object obj = extendee_;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Object extendee_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #252 <Class String>
	//    8   16:invokestatic    #266 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			extendee_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #46  <Field Object extendee_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #254 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public String getJsonName()
	{
		Object obj = jsonName_;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Object jsonName_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #254 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #257 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #260 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				jsonName_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #50  <Field Object jsonName_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #252 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getJsonNameBytes()
	{
		Object obj = jsonName_;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Object jsonName_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #252 <Class String>
	//    8   16:invokestatic    #266 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			jsonName_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #50  <Field Object jsonName_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #254 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.FieldDescriptorProto.Label getLabel()
	{
		DescriptorProtos.FieldDescriptorProto.Label label = DescriptorProtos.FieldDescriptorProto.Label.valueOf(label_);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int label_>
	//    2    4:invokestatic    #277 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.valueOf(int)>
	//    3    7:astore_1        
		if(label == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL;
	//    6   12:getstatic       #281 <Field DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.LABEL_OPTIONAL>
	//    7   15:areturn         
		else
			return label;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object name_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #254 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #257 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #260 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				name_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #38  <Field Object name_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #252 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #252 <Class String>
	//    8   16:invokestatic    #266 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #38  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #254 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public int getNumber()
	{
		return number_;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field int number_>
	//    2    4:ireturn         
	}

	public int getOneofIndex()
	{
		return oneofIndex_;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field int oneofIndex_>
	//    2    4:ireturn         
	}

	public DescriptorProtos.FieldOptions getOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       23
		{
			if(options_ == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #52  <Field DescriptorProtos$FieldOptions options_>
	//*   5   11:ifnonnull       18
				return DescriptorProtos.FieldOptions.getDefaultInstance();
	//    6   14:invokestatic    #287 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions.getDefaultInstance()>
	//    7   17:areturn         
			else
				return options_;
	//    8   18:aload_0         
	//    9   19:getfield        #52  <Field DescriptorProtos$FieldOptions options_>
	//   10   22:areturn         
		} else
		{
			return (DescriptorProtos.FieldOptions)optionsBuilder_.getMessage();
	//   11   23:aload_0         
	//   12   24:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   13   27:invokevirtual   #290 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
	//   14   30:checkcast       #170 <Class DescriptorProtos$FieldOptions>
	//   15   33:areturn         
		}
	}

	public DescriptorProtos.FieldOptions.Builder getOptionsBuilder()
	{
		bitField0_ = bitField0_ | 0x200;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:sipush          512
	//    4    8:ior             
	//    5    9:putfield        #128 <Field int bitField0_>
		onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #199 <Method void onChanged()>
		return (DescriptorProtos.FieldOptions.Builder)getOptionsFieldBuilder().getBuilder();
	//    8   16:aload_0         
	//    9   17:invokespecial   #99  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//   10   20:invokevirtual   #295 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
	//   11   23:checkcast       #297 <Class DescriptorProtos$FieldOptions$Builder>
	//   12   26:areturn         
	}

	public DescriptorProtos.FieldOptionsOrBuilder getOptionsOrBuilder()
	{
		if(optionsBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnull          18
			return (DescriptorProtos.FieldOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//    5   11:invokevirtual   #303 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
	//    6   14:checkcast       #305 <Class DescriptorProtos$FieldOptionsOrBuilder>
	//    7   17:areturn         
		if(options_ == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #52  <Field DescriptorProtos$FieldOptions options_>
	//*  10   22:ifnonnull       29
			return ((DescriptorProtos.FieldOptionsOrBuilder) (DescriptorProtos.FieldOptions.getDefaultInstance()));
	//   11   25:invokestatic    #287 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions.getDefaultInstance()>
	//   12   28:areturn         
		else
			return ((DescriptorProtos.FieldOptionsOrBuilder) (options_));
	//   13   29:aload_0         
	//   14   30:getfield        #52  <Field DescriptorProtos$FieldOptions options_>
	//   15   33:areturn         
	}

	public DescriptorProtos.FieldDescriptorProto.Type getType()
	{
		DescriptorProtos.FieldDescriptorProto.Type type = DescriptorProtos.FieldDescriptorProto.Type.valueOf(type_);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int type_>
	//    2    4:invokestatic    #312 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.valueOf(int)>
	//    3    7:astore_1        
		if(type == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE;
	//    6   12:getstatic       #316 <Field DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.TYPE_DOUBLE>
	//    7   15:areturn         
		else
			return type;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public String getTypeName()
	{
		Object obj = typeName_;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object typeName_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #254 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #257 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #260 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				typeName_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #44  <Field Object typeName_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #252 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getTypeNameBytes()
	{
		Object obj = typeName_;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object typeName_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #252 <Class String>
	//    8   16:invokestatic    #266 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			typeName_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #44  <Field Object typeName_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #254 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean hasDefaultValue()
	{
		return (bitField0_ & 0x40) == 64;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:bipush          64
	//    3    6:iand            
	//    4    7:bipush          64
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasExtendee()
	{
		return (bitField0_ & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasJsonName()
	{
		return (bitField0_ & 0x100) == 256;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:sipush          256
	//    3    7:iand            
	//    4    8:sipush          256
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasLabel()
	{
		return (bitField0_ & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
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
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasNumber()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasOneofIndex()
	{
		return (bitField0_ & 0x80) == 128;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:sipush          128
	//    3    7:iand            
	//    4    8:sipush          128
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasOptions()
	{
		return (bitField0_ & 0x200) == 512;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:sipush          512
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasType()
	{
		return (bitField0_ & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasTypeName()
	{
		return (bitField0_ & 0x10) == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int bitField0_>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:bipush          16
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$7000().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FieldDescriptorProto, com/google/protobuf/DescriptorProtos$FieldDescriptorProto$Builder);
	//    0    0:invokestatic    #332 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$7000()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$FieldDescriptorProto>
	//    2    5:ldc1            #2   <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    3    7:invokevirtual   #338 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		return !hasOptions() || getOptions().isInitialized();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #340 <Method boolean hasOptions()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #78  <Method DescriptorProtos$FieldOptions getOptions()>
	//    5   11:invokevirtual   #341 <Method boolean DescriptorProtos$FieldOptions.isInitialized()>
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
	//    3    3:invokevirtual   #348 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #352 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #348 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.FieldDescriptorProto)DescriptorProtos.FieldDescriptorProto.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #359 <Field Parser DescriptorProtos$FieldDescriptorProto.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #365 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$FieldDescriptorProto>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.FieldDescriptorProto) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #368 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(DescriptorProtos$FieldDescriptorProto)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #371 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$FieldDescriptorProto>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #375 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #368 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(DescriptorProtos$FieldDescriptorProto)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.FieldDescriptorProto)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.FieldDescriptorProto) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
	{
		if(fielddescriptorproto == DescriptorProtos.FieldDescriptorProto.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #192 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(fielddescriptorproto.hasName())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #377 <Method boolean DescriptorProtos$FieldDescriptorProto.hasName()>
	//*   7   13:ifeq            38
		{
			bitField0_ = bitField0_ | 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #128 <Field int bitField0_>
	//   11   21:iconst_1        
	//   12   22:ior             
	//   13   23:putfield        #128 <Field int bitField0_>
			name_ = DescriptorProtos.FieldDescriptorProto.access$7400(fielddescriptorproto);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokestatic    #381 <Method Object DescriptorProtos$FieldDescriptorProto.access$7400(DescriptorProtos$FieldDescriptorProto)>
	//   17   31:putfield        #38  <Field Object name_>
			onChanged();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #199 <Method void onChanged()>
		}
		if(fielddescriptorproto.hasNumber())
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #383 <Method boolean DescriptorProtos$FieldDescriptorProto.hasNumber()>
	//*  22   42:ifeq            54
			setNumber(fielddescriptorproto.getNumber());
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #385 <Method int DescriptorProtos$FieldDescriptorProto.getNumber()>
	//   26   50:invokevirtual   #389 <Method DescriptorProtos$FieldDescriptorProto$Builder setNumber(int)>
	//   27   53:pop             
		if(fielddescriptorproto.hasLabel())
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #391 <Method boolean DescriptorProtos$FieldDescriptorProto.hasLabel()>
	//*  30   58:ifeq            70
			setLabel(fielddescriptorproto.getLabel());
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #393 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto.getLabel()>
	//   34   66:invokevirtual   #397 <Method DescriptorProtos$FieldDescriptorProto$Builder setLabel(DescriptorProtos$FieldDescriptorProto$Label)>
	//   35   69:pop             
		if(fielddescriptorproto.hasType())
	//*  36   70:aload_1         
	//*  37   71:invokevirtual   #399 <Method boolean DescriptorProtos$FieldDescriptorProto.hasType()>
	//*  38   74:ifeq            86
			setType(fielddescriptorproto.getType());
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:invokevirtual   #401 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto.getType()>
	//   42   82:invokevirtual   #405 <Method DescriptorProtos$FieldDescriptorProto$Builder setType(DescriptorProtos$FieldDescriptorProto$Type)>
	//   43   85:pop             
		if(fielddescriptorproto.hasTypeName())
	//*  44   86:aload_1         
	//*  45   87:invokevirtual   #407 <Method boolean DescriptorProtos$FieldDescriptorProto.hasTypeName()>
	//*  46   90:ifeq            116
		{
			bitField0_ = bitField0_ | 0x10;
	//   47   93:aload_0         
	//   48   94:aload_0         
	//   49   95:getfield        #128 <Field int bitField0_>
	//   50   98:bipush          16
	//   51  100:ior             
	//   52  101:putfield        #128 <Field int bitField0_>
			typeName_ = DescriptorProtos.FieldDescriptorProto.access$7800(fielddescriptorproto);
	//   53  104:aload_0         
	//   54  105:aload_1         
	//   55  106:invokestatic    #410 <Method Object DescriptorProtos$FieldDescriptorProto.access$7800(DescriptorProtos$FieldDescriptorProto)>
	//   56  109:putfield        #44  <Field Object typeName_>
			onChanged();
	//   57  112:aload_0         
	//   58  113:invokevirtual   #199 <Method void onChanged()>
		}
		if(fielddescriptorproto.hasExtendee())
	//*  59  116:aload_1         
	//*  60  117:invokevirtual   #412 <Method boolean DescriptorProtos$FieldDescriptorProto.hasExtendee()>
	//*  61  120:ifeq            146
		{
			bitField0_ = bitField0_ | 0x20;
	//   62  123:aload_0         
	//   63  124:aload_0         
	//   64  125:getfield        #128 <Field int bitField0_>
	//   65  128:bipush          32
	//   66  130:ior             
	//   67  131:putfield        #128 <Field int bitField0_>
			extendee_ = DescriptorProtos.FieldDescriptorProto.access$7900(fielddescriptorproto);
	//   68  134:aload_0         
	//   69  135:aload_1         
	//   70  136:invokestatic    #415 <Method Object DescriptorProtos$FieldDescriptorProto.access$7900(DescriptorProtos$FieldDescriptorProto)>
	//   71  139:putfield        #46  <Field Object extendee_>
			onChanged();
	//   72  142:aload_0         
	//   73  143:invokevirtual   #199 <Method void onChanged()>
		}
		if(fielddescriptorproto.hasDefaultValue())
	//*  74  146:aload_1         
	//*  75  147:invokevirtual   #417 <Method boolean DescriptorProtos$FieldDescriptorProto.hasDefaultValue()>
	//*  76  150:ifeq            176
		{
			bitField0_ = bitField0_ | 0x40;
	//   77  153:aload_0         
	//   78  154:aload_0         
	//   79  155:getfield        #128 <Field int bitField0_>
	//   80  158:bipush          64
	//   81  160:ior             
	//   82  161:putfield        #128 <Field int bitField0_>
			defaultValue_ = DescriptorProtos.FieldDescriptorProto.access$8000(fielddescriptorproto);
	//   83  164:aload_0         
	//   84  165:aload_1         
	//   85  166:invokestatic    #420 <Method Object DescriptorProtos$FieldDescriptorProto.access$8000(DescriptorProtos$FieldDescriptorProto)>
	//   86  169:putfield        #48  <Field Object defaultValue_>
			onChanged();
	//   87  172:aload_0         
	//   88  173:invokevirtual   #199 <Method void onChanged()>
		}
		if(fielddescriptorproto.hasOneofIndex())
	//*  89  176:aload_1         
	//*  90  177:invokevirtual   #422 <Method boolean DescriptorProtos$FieldDescriptorProto.hasOneofIndex()>
	//*  91  180:ifeq            192
			setOneofIndex(fielddescriptorproto.getOneofIndex());
	//   92  183:aload_0         
	//   93  184:aload_1         
	//   94  185:invokevirtual   #424 <Method int DescriptorProtos$FieldDescriptorProto.getOneofIndex()>
	//   95  188:invokevirtual   #427 <Method DescriptorProtos$FieldDescriptorProto$Builder setOneofIndex(int)>
	//   96  191:pop             
		if(fielddescriptorproto.hasJsonName())
	//*  97  192:aload_1         
	//*  98  193:invokevirtual   #429 <Method boolean DescriptorProtos$FieldDescriptorProto.hasJsonName()>
	//*  99  196:ifeq            223
		{
			bitField0_ = bitField0_ | 0x100;
	//  100  199:aload_0         
	//  101  200:aload_0         
	//  102  201:getfield        #128 <Field int bitField0_>
	//  103  204:sipush          256
	//  104  207:ior             
	//  105  208:putfield        #128 <Field int bitField0_>
			jsonName_ = DescriptorProtos.FieldDescriptorProto.access$8200(fielddescriptorproto);
	//  106  211:aload_0         
	//  107  212:aload_1         
	//  108  213:invokestatic    #432 <Method Object DescriptorProtos$FieldDescriptorProto.access$8200(DescriptorProtos$FieldDescriptorProto)>
	//  109  216:putfield        #50  <Field Object jsonName_>
			onChanged();
	//  110  219:aload_0         
	//  111  220:invokevirtual   #199 <Method void onChanged()>
		}
		if(fielddescriptorproto.hasOptions())
	//* 112  223:aload_1         
	//* 113  224:invokevirtual   #433 <Method boolean DescriptorProtos$FieldDescriptorProto.hasOptions()>
	//* 114  227:ifeq            239
			mergeOptions(fielddescriptorproto.getOptions());
	//  115  230:aload_0         
	//  116  231:aload_1         
	//  117  232:invokevirtual   #434 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldDescriptorProto.getOptions()>
	//  118  235:invokevirtual   #438 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeOptions(DescriptorProtos$FieldOptions)>
	//  119  238:pop             
		mergeUnknownFields(fielddescriptorproto.unknownFields);
	//  120  239:aload_0         
	//  121  240:aload_1         
	//  122  241:getfield        #442 <Field UnknownFieldSet DescriptorProtos$FieldDescriptorProto.unknownFields>
	//  123  244:invokevirtual   #446 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//  124  247:pop             
		onChanged();
	//  125  248:aload_0         
	//  126  249:invokevirtual   #199 <Method void onChanged()>
		return this;
	//  127  252:aload_0         
	//  128  253:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.FieldDescriptorProto)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$FieldDescriptorProto>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.FieldDescriptorProto)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$FieldDescriptorProto>
	//    6   12:invokevirtual   #368 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(DescriptorProtos$FieldDescriptorProto)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #448 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #348 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #352 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #348 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder mergeOptions(DescriptorProtos.FieldOptions fieldoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       71
		{
			if((bitField0_ & 0x200) == 512 && options_ != null && options_ != DescriptorProtos.FieldOptions.getDefaultInstance())
	//*   3    7:aload_0         
	//*   4    8:getfield        #128 <Field int bitField0_>
	//*   5   11:sipush          512
	//*   6   14:iand            
	//*   7   15:sipush          512
	//*   8   18:icmpne          59
	//*   9   21:aload_0         
	//*  10   22:getfield        #52  <Field DescriptorProtos$FieldOptions options_>
	//*  11   25:ifnull          59
	//*  12   28:aload_0         
	//*  13   29:getfield        #52  <Field DescriptorProtos$FieldOptions options_>
	//*  14   32:invokestatic    #287 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions.getDefaultInstance()>
	//*  15   35:if_acmpeq       59
				options_ = DescriptorProtos.FieldOptions.newBuilder(options_).mergeFrom(fieldoptions).buildPartial();
	//   16   38:aload_0         
	//   17   39:aload_0         
	//   18   40:getfield        #52  <Field DescriptorProtos$FieldOptions options_>
	//   19   43:invokestatic    #455 <Method DescriptorProtos$FieldOptions$Builder DescriptorProtos$FieldOptions.newBuilder(DescriptorProtos$FieldOptions)>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #457 <Method DescriptorProtos$FieldOptions$Builder DescriptorProtos$FieldOptions$Builder.mergeFrom(DescriptorProtos$FieldOptions)>
	//   22   50:invokevirtual   #459 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions$Builder.buildPartial()>
	//   23   53:putfield        #52  <Field DescriptorProtos$FieldOptions options_>
			else
	//*  24   56:goto            64
				options_ = fieldoptions;
	//   25   59:aload_0         
	//   26   60:aload_1         
	//   27   61:putfield        #52  <Field DescriptorProtos$FieldOptions options_>
			onChanged();
	//   28   64:aload_0         
	//   29   65:invokevirtual   #199 <Method void onChanged()>
		} else
	//*  30   68:goto            80
		{
			optionsBuilder_.mergeFrom(((AbstractMessage) (fieldoptions)));
	//   31   71:aload_0         
	//   32   72:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   33   75:aload_1         
	//   34   76:invokevirtual   #462 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
	//   35   79:pop             
		}
		bitField0_ = bitField0_ | 0x200;
	//   36   80:aload_0         
	//   37   81:aload_0         
	//   38   82:getfield        #128 <Field int bitField0_>
	//   39   85:sipush          512
	//   40   88:ior             
	//   41   89:putfield        #128 <Field int bitField0_>
		return this;
	//   42   92:aload_0         
	//   43   93:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #446 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$FieldDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FieldDescriptorProto$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #466 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #446 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #446 <Method DescriptorProtos$FieldDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setDefaultValue(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x40;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:bipush          64
	//   10   19:ior             
	//   11   20:putfield        #128 <Field int bitField0_>
			defaultValue_ = ((Object) (s));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #48  <Field Object defaultValue_>
			onChanged();
	//   15   28:aload_0         
	//   16   29:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   32:aload_0         
	//   18   33:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setDefaultValueBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x40;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:bipush          64
	//   10   19:ior             
	//   11   20:putfield        #128 <Field int bitField0_>
			defaultValue_ = ((Object) (bytestring));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #48  <Field Object defaultValue_>
			onChanged();
	//   15   28:aload_0         
	//   16   29:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   32:aload_0         
	//   18   33:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setExtendee(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x20;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:bipush          32
	//   10   19:ior             
	//   11   20:putfield        #128 <Field int bitField0_>
			extendee_ = ((Object) (s));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #46  <Field Object extendee_>
			onChanged();
	//   15   28:aload_0         
	//   16   29:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   32:aload_0         
	//   18   33:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setExtendeeBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x20;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:bipush          32
	//   10   19:ior             
	//   11   20:putfield        #128 <Field int bitField0_>
			extendee_ = ((Object) (bytestring));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #46  <Field Object extendee_>
			onChanged();
	//   15   28:aload_0         
	//   16   29:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   32:aload_0         
	//   18   33:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FieldDescriptorProto$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #479 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #481 <Method DescriptorProtos$FieldDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #481 <Method DescriptorProtos$FieldDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setJsonName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x100;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:sipush          256
	//   10   20:ior             
	//   11   21:putfield        #128 <Field int bitField0_>
			jsonName_ = ((Object) (s));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #50  <Field Object jsonName_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setJsonNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x100;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:sipush          256
	//   10   20:ior             
	//   11   21:putfield        #128 <Field int bitField0_>
			jsonName_ = ((Object) (bytestring));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #50  <Field Object jsonName_>
			onChanged();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setLabel(DescriptorProtos.FieldDescriptorProto.Label label)
	{
		if(label == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 4;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:iconst_4        
	//   10   18:ior             
	//   11   19:putfield        #128 <Field int bitField0_>
			label_ = label.getNumber();
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #484 <Method int DescriptorProtos$FieldDescriptorProto$Label.getNumber()>
	//   15   27:putfield        #40  <Field int label_>
			onChanged();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #128 <Field int bitField0_>
			name_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #38  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #128 <Field int bitField0_>
			name_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #38  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setNumber(int i)
	{
		bitField0_ = bitField0_ | 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:iconst_2        
	//    4    6:ior             
	//    5    7:putfield        #128 <Field int bitField0_>
		number_ = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #134 <Field int number_>
		onChanged();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setOneofIndex(int i)
	{
		bitField0_ = bitField0_ | 0x80;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #128 <Field int bitField0_>
	//    3    5:sipush          128
	//    4    8:ior             
	//    5    9:putfield        #128 <Field int bitField0_>
		oneofIndex_ = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #155 <Field int oneofIndex_>
		onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #199 <Method void onChanged()>
		return this;
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setOptions(DescriptorProtos.FieldOptions.Builder builder)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       22
		{
			options_ = builder.build();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #490 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions$Builder.build()>
	//    6   12:putfield        #52  <Field DescriptorProtos$FieldOptions options_>
			onChanged();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #199 <Method void onChanged()>
		} else
	//*   9   19:goto            34
		{
			optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
	//   10   22:aload_0         
	//   11   23:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #490 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions$Builder.build()>
	//   14   30:invokevirtual   #493 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   15   33:pop             
		}
		bitField0_ = bitField0_ | 0x200;
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #128 <Field int bitField0_>
	//   19   39:sipush          512
	//   20   42:ior             
	//   21   43:putfield        #128 <Field int bitField0_>
		return this;
	//   22   46:aload_0         
	//   23   47:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setOptions(DescriptorProtos.FieldOptions fieldoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       31
		{
			if(fieldoptions == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
				throw new NullPointerException();
	//    5   11:new             #471 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #472 <Method void NullPointerException()>
	//    8   18:athrow          
			options_ = fieldoptions;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #52  <Field DescriptorProtos$FieldOptions options_>
			onChanged();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #199 <Method void onChanged()>
		} else
	//*  14   28:goto            40
		{
			optionsBuilder_.setMessage(((AbstractMessage) (fieldoptions)));
	//   15   31:aload_0         
	//   16   32:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #493 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   19   39:pop             
		}
		bitField0_ = bitField0_ | 0x200;
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #128 <Field int bitField0_>
	//   23   45:sipush          512
	//   24   48:ior             
	//   25   49:putfield        #128 <Field int bitField0_>
		return this;
	//   26   52:aload_0         
	//   27   53:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$FieldDescriptorProto$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #498 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #500 <Method DescriptorProtos$FieldDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #500 <Method DescriptorProtos$FieldDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setType(DescriptorProtos.FieldDescriptorProto.Type type)
	{
		if(type == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 8;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:bipush          8
	//   10   19:ior             
	//   11   20:putfield        #128 <Field int bitField0_>
			type_ = type.getNumber();
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #502 <Method int DescriptorProtos$FieldDescriptorProto$Type.getNumber()>
	//   15   28:putfield        #42  <Field int type_>
			onChanged();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   18   35:aload_0         
	//   19   36:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setTypeName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x10;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:bipush          16
	//   10   19:ior             
	//   11   20:putfield        #128 <Field int bitField0_>
			typeName_ = ((Object) (s));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #44  <Field Object typeName_>
			onChanged();
	//   15   28:aload_0         
	//   16   29:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   32:aload_0         
	//   18   33:areturn         
		}
	}

	public DescriptorProtos$FieldDescriptorProto$Builder setTypeNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #471 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #472 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 0x10;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field int bitField0_>
	//    9   17:bipush          16
	//   10   19:ior             
	//   11   20:putfield        #128 <Field int bitField0_>
			typeName_ = ((Object) (bytestring));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #44  <Field Object typeName_>
			onChanged();
	//   15   28:aload_0         
	//   16   29:invokevirtual   #199 <Method void onChanged()>
			return this;
	//   17   32:aload_0         
	//   18   33:areturn         
		}
	}

	public final DescriptorProtos$FieldDescriptorProto$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FieldDescriptorProto$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #507 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #509 <Method DescriptorProtos$FieldDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #509 <Method DescriptorProtos$FieldDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private Object defaultValue_;
	private Object extendee_;
	private Object jsonName_;
	private int label_;
	private Object name_;
	private int number_;
	private int oneofIndex_;
	private SingleFieldBuilderV3 optionsBuilder_;
	private DescriptorProtos.FieldOptions options_;
	private Object typeName_;
	private int type_;

	private DescriptorProtos$FieldDescriptorProto$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void GeneratedMessageV3$Builder()>
		name_ = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #36  <String "">
	//    4    7:putfield        #38  <Field Object name_>
		label_ = 1;
	//    5   10:aload_0         
	//    6   11:iconst_1        
	//    7   12:putfield        #40  <Field int label_>
		type_ = 1;
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:putfield        #42  <Field int type_>
		typeName_ = "";
	//   11   20:aload_0         
	//   12   21:ldc1            #36  <String "">
	//   13   23:putfield        #44  <Field Object typeName_>
		extendee_ = "";
	//   14   26:aload_0         
	//   15   27:ldc1            #36  <String "">
	//   16   29:putfield        #46  <Field Object extendee_>
		defaultValue_ = "";
	//   17   32:aload_0         
	//   18   33:ldc1            #36  <String "">
	//   19   35:putfield        #48  <Field Object defaultValue_>
		jsonName_ = "";
	//   20   38:aload_0         
	//   21   39:ldc1            #36  <String "">
	//   22   41:putfield        #50  <Field Object jsonName_>
		options_ = null;
	//   23   44:aload_0         
	//   24   45:aconst_null     
	//   25   46:putfield        #52  <Field DescriptorProtos$FieldOptions options_>
		maybeForceBuilderInitialization();
	//   26   49:aload_0         
	//   27   50:invokespecial   #55  <Method void maybeForceBuilderInitialization()>
	//   28   53:return          
	}

	DescriptorProtos$FieldDescriptorProto$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void DescriptorProtos$FieldDescriptorProto$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$FieldDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #36  <String "">
	//    5    8:putfield        #38  <Field Object name_>
		label_ = 1;
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:putfield        #40  <Field int label_>
		type_ = 1;
	//    9   16:aload_0         
	//   10   17:iconst_1        
	//   11   18:putfield        #42  <Field int type_>
		typeName_ = "";
	//   12   21:aload_0         
	//   13   22:ldc1            #36  <String "">
	//   14   24:putfield        #44  <Field Object typeName_>
		extendee_ = "";
	//   15   27:aload_0         
	//   16   28:ldc1            #36  <String "">
	//   17   30:putfield        #46  <Field Object extendee_>
		defaultValue_ = "";
	//   18   33:aload_0         
	//   19   34:ldc1            #36  <String "">
	//   20   36:putfield        #48  <Field Object defaultValue_>
		jsonName_ = "";
	//   21   39:aload_0         
	//   22   40:ldc1            #36  <String "">
	//   23   42:putfield        #50  <Field Object jsonName_>
		options_ = null;
	//   24   45:aload_0         
	//   25   46:aconst_null     
	//   26   47:putfield        #52  <Field DescriptorProtos$FieldOptions options_>
		maybeForceBuilderInitialization();
	//   27   50:aload_0         
	//   28   51:invokespecial   #55  <Method void maybeForceBuilderInitialization()>
	//   29   54:return          
	}

	DescriptorProtos$FieldDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void DescriptorProtos$FieldDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
