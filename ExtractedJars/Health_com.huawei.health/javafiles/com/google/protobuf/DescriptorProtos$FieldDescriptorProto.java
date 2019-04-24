// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DescriptorProtos, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, Parser, ByteString, CodedOutputStream, 
//			ExtensionRegistryLite, Message, MessageLite, SingleFieldBuilderV3, 
//			ProtocolMessageEnum, AbstractParser

public static final class DescriptorProtos$FieldDescriptorProto extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.FieldDescriptorProtoOrBuilder
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
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
			fielddescriptorproto.name_ = name_;
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
			fielddescriptorproto.number_ = number_;
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
			fielddescriptorproto.label_ = label_;
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
			fielddescriptorproto.type_ = type_;
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
			fielddescriptorproto.typeName_ = typeName_;
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
			fielddescriptorproto.extendee_ = extendee_;
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
			fielddescriptorproto.defaultValue_ = defaultValue_;
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
			fielddescriptorproto.oneofIndex_ = oneofIndex_;
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
			fielddescriptorproto.jsonName_ = jsonName_;
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
				fielddescriptorproto.options_ = options_;
		//  165  271:aload           4
		//  166  273:aload_0         
		//  167  274:getfield        #52  <Field DescriptorProtos$FieldOptions options_>
		//  168  277:invokestatic    #165 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldDescriptorProto.access$8302(DescriptorProtos$FieldDescriptorProto, DescriptorProtos$FieldOptions)>
		//  169  280:pop             
			else
		//* 170  281:goto            300
				fielddescriptorproto.options_ = (DescriptorProtos.FieldOptions)optionsBuilder_.build();
		//  171  284:aload           4
		//  172  286:aload_0         
		//  173  287:getfield        #72  <Field SingleFieldBuilderV3 optionsBuilder_>
		//  174  290:invokevirtual   #168 <Method AbstractMessage SingleFieldBuilderV3.build()>
		//  175  293:checkcast       #170 <Class DescriptorProtos$FieldOptions>
		//  176  296:invokestatic    #165 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldDescriptorProto.access$8302(DescriptorProtos$FieldDescriptorProto, DescriptorProtos$FieldOptions)>
		//  177  299:pop             
			fielddescriptorproto.bitField0_ = i;
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

		public Builder clear()
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

		public Builder clearDefaultValue()
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

		public Builder clearExtendee()
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

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
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

		public Builder clearJsonName()
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

		public Builder clearLabel()
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

		public Builder clearName()
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

		public Builder clearNumber()
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

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
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

		public Builder clearOneofIndex()
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

		public Builder clearOptions()
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

		public Builder clearType()
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

		public Builder clearTypeName()
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

		public Builder clone()
		{
			return (Builder)super.clone();
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

		public Label getLabel()
		{
			Label label = Label.valueOf(label_);
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field int label_>
		//    2    4:invokestatic    #277 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.valueOf(int)>
		//    3    7:astore_1        
			if(label == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       16
				return Label.LABEL_OPTIONAL;
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

		public Type getType()
		{
			Type type = Type.valueOf(type_);
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field int type_>
		//    2    4:invokestatic    #312 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.valueOf(int)>
		//    3    7:astore_1        
			if(type == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       16
				return Type.TYPE_DOUBLE;
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

		public Builder mergeFrom(DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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
				name_ = fielddescriptorproto.name_;
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
				typeName_ = fielddescriptorproto.typeName_;
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
				extendee_ = fielddescriptorproto.extendee_;
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
				defaultValue_ = fielddescriptorproto.defaultValue_;
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
				jsonName_ = fielddescriptorproto.jsonName_;
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

		public Builder mergeFrom(Message message)
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

		public Builder mergeOptions(DescriptorProtos.FieldOptions fieldoptions)
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

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
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

		public Builder setDefaultValue(String s)
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

		public Builder setDefaultValueBytes(ByteString bytestring)
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

		public Builder setExtendee(String s)
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

		public Builder setExtendeeBytes(ByteString bytestring)
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
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

		public Builder setJsonName(String s)
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

		public Builder setJsonNameBytes(ByteString bytestring)
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

		public Builder setLabel(Label label)
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

		public Builder setName(String s)
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

		public Builder setNameBytes(ByteString bytestring)
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

		public Builder setNumber(int i)
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

		public Builder setOneofIndex(int i)
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

		public Builder setOptions(DescriptorProtos.FieldOptions.Builder builder)
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

		public Builder setOptions(DescriptorProtos.FieldOptions fieldoptions)
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

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

		public Builder setType(Type type)
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

		public Builder setTypeName(String s)
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

		public Builder setTypeNameBytes(ByteString bytestring)
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
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

		private Builder()
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

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #58  <Method void DescriptorProtos$FieldDescriptorProto$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #63  <Method void DescriptorProtos$FieldDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static final class Label extends Enum
		implements ProtocolMessageEnum
	{

		public static Label forNumber(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     1 3: default 28
		//		               1 31
		//		               2 35
		//		               3 39
		//*   2   28:goto            43
			case 1: // '\001'
				return LABEL_OPTIONAL;
		//    3   31:getstatic       #42  <Field DescriptorProtos$FieldDescriptorProto$Label LABEL_OPTIONAL>
		//    4   34:areturn         

			case 2: // '\002'
				return LABEL_REQUIRED;
		//    5   35:getstatic       #45  <Field DescriptorProtos$FieldDescriptorProto$Label LABEL_REQUIRED>
		//    6   38:areturn         

			case 3: // '\003'
				return LABEL_REPEATED;
		//    7   39:getstatic       #48  <Field DescriptorProtos$FieldDescriptorProto$Label LABEL_REPEATED>
		//    8   42:areturn         
			}
			return null;
		//    9   43:aconst_null     
		//   10   44:areturn         
		}

		public static final Descriptors.EnumDescriptor getDescriptor()
		{
			return (Descriptors.EnumDescriptor)DescriptorProtos.FieldDescriptorProto.getDescriptor().getEnumTypes().get(1);
		//    0    0:invokestatic    #75  <Method Descriptors$Descriptor DescriptorProtos$FieldDescriptorProto.getDescriptor()>
		//    1    3:invokevirtual   #81  <Method List Descriptors$Descriptor.getEnumTypes()>
		//    2    6:iconst_1        
		//    3    7:invokeinterface #87  <Method Object List.get(int)>
		//    4   12:checkcast       #89  <Class Descriptors$EnumDescriptor>
		//    5   15:areturn         
		}

		public static Internal.EnumLiteMap internalGetValueMap()
		{
			return internalValueMap;
		//    0    0:getstatic       #54  <Field Internal$EnumLiteMap internalValueMap>
		//    1    3:areturn         
		}

		public static Label valueOf(int i)
		{
			return forNumber(i);
		//    0    0:iload_0         
		//    1    1:invokestatic    #96  <Method DescriptorProtos$FieldDescriptorProto$Label forNumber(int)>
		//    2    4:areturn         
		}

		public static Label valueOf(Descriptors.EnumValueDescriptor enumvaluedescriptor)
		{
			if(enumvaluedescriptor.getType() != getDescriptor())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #103 <Method Descriptors$EnumDescriptor Descriptors$EnumValueDescriptor.getType()>
		//*   2    4:invokestatic    #105 <Method Descriptors$EnumDescriptor getDescriptor()>
		//*   3    7:if_acmpeq       20
				throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
		//    4   10:new             #107 <Class IllegalArgumentException>
		//    5   13:dup             
		//    6   14:ldc1            #109 <String "EnumValueDescriptor is not for this type.">
		//    7   16:invokespecial   #112 <Method void IllegalArgumentException(String)>
		//    8   19:athrow          
			else
				return VALUES[enumvaluedescriptor.getIndex()];
		//    9   20:getstatic       #60  <Field DescriptorProtos$FieldDescriptorProto$Label[] VALUES>
		//   10   23:aload_0         
		//   11   24:invokevirtual   #116 <Method int Descriptors$EnumValueDescriptor.getIndex()>
		//   12   27:aaload          
		//   13   28:areturn         
		}

		public static Label valueOf(String s)
		{
			return (Label)Enum.valueOf(com/google/protobuf/DescriptorProtos$FieldDescriptorProto$Label, s);
		//    0    0:ldc1            #2   <Class DescriptorProtos$FieldDescriptorProto$Label>
		//    1    2:aload_0         
		//    2    3:invokestatic    #120 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Label>
		//    4    9:areturn         
		}

		public static Label[] values()
		{
			return (Label[])((Label []) ($VALUES)).clone();
		//    0    0:getstatic       #50  <Field DescriptorProtos$FieldDescriptorProto$Label[] $VALUES>
		//    1    3:invokevirtual   #125 <Method Object _5B_Lcom.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label_3B_.clone()>
		//    2    6:checkcast       #121 <Class DescriptorProtos$FieldDescriptorProto$Label[]>
		//    3    9:areturn         
		}

		public final Descriptors.EnumDescriptor getDescriptorForType()
		{
			return getDescriptor();
		//    0    0:invokestatic    #105 <Method Descriptors$EnumDescriptor getDescriptor()>
		//    1    3:areturn         
		}

		public final int getNumber()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field int value>
		//    2    4:ireturn         
		}

		public final Descriptors.EnumValueDescriptor getValueDescriptor()
		{
			return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(ordinal());
		//    0    0:invokestatic    #105 <Method Descriptors$EnumDescriptor getDescriptor()>
		//    1    3:invokevirtual   #132 <Method List Descriptors$EnumDescriptor.getValues()>
		//    2    6:aload_0         
		//    3    7:invokevirtual   #135 <Method int ordinal()>
		//    4   10:invokeinterface #87  <Method Object List.get(int)>
		//    5   15:checkcast       #100 <Class Descriptors$EnumValueDescriptor>
		//    6   18:areturn         
		}

		private static final Label $VALUES[];
		public static final Label LABEL_OPTIONAL;
		public static final int LABEL_OPTIONAL_VALUE = 1;
		public static final Label LABEL_REPEATED;
		public static final int LABEL_REPEATED_VALUE = 3;
		public static final Label LABEL_REQUIRED;
		public static final int LABEL_REQUIRED_VALUE = 2;
		private static final Label VALUES[] = values();
		private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() {

			public Label findValueByNumber(int i)
			{
				return Label.forNumber(i);
			//    0    0:iload_1         
			//    1    1:invokestatic    #25  <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.forNumber(int)>
			//    2    4:areturn         
			}

			public volatile Internal.EnumLite findValueByNumber(int i)
			{
				return ((Internal.EnumLite) (findValueByNumber(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #28  <Method DescriptorProtos$FieldDescriptorProto$Label findValueByNumber(int)>
			//    3    5:areturn         
			}

		}
;
		private final int value;

		static 
		{
			LABEL_OPTIONAL = new Label("LABEL_OPTIONAL", 0, 1);
		//    0    0:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Label>
		//    1    3:dup             
		//    2    4:ldc1            #36  <String "LABEL_OPTIONAL">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #40  <Method void DescriptorProtos$FieldDescriptorProto$Label(String, int, int)>
		//    6   11:putstatic       #42  <Field DescriptorProtos$FieldDescriptorProto$Label LABEL_OPTIONAL>
			LABEL_REQUIRED = new Label("LABEL_REQUIRED", 1, 2);
		//    7   14:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Label>
		//    8   17:dup             
		//    9   18:ldc1            #43  <String "LABEL_REQUIRED">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #40  <Method void DescriptorProtos$FieldDescriptorProto$Label(String, int, int)>
		//   13   25:putstatic       #45  <Field DescriptorProtos$FieldDescriptorProto$Label LABEL_REQUIRED>
			LABEL_REPEATED = new Label("LABEL_REPEATED", 2, 3);
		//   14   28:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Label>
		//   15   31:dup             
		//   16   32:ldc1            #46  <String "LABEL_REPEATED">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #40  <Method void DescriptorProtos$FieldDescriptorProto$Label(String, int, int)>
		//   20   39:putstatic       #48  <Field DescriptorProtos$FieldDescriptorProto$Label LABEL_REPEATED>
			$VALUES = (new Label[] {
				LABEL_OPTIONAL, LABEL_REQUIRED, LABEL_REPEATED
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       Label[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #42  <Field DescriptorProtos$FieldDescriptorProto$Label LABEL_OPTIONAL>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #45  <Field DescriptorProtos$FieldDescriptorProto$Label LABEL_REQUIRED>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #48  <Field DescriptorProtos$FieldDescriptorProto$Label LABEL_REPEATED>
		//   34   63:aastore         
		//   35   64:putstatic       #50  <Field DescriptorProtos$FieldDescriptorProto$Label[] $VALUES>
		//   36   67:new             #15  <Class DescriptorProtos$FieldDescriptorProto$Label$1>
		//   37   70:dup             
		//   38   71:invokespecial   #52  <Method void DescriptorProtos$FieldDescriptorProto$Label$1()>
		//   39   74:putstatic       #54  <Field Internal$EnumLiteMap internalValueMap>
		//   40   77:invokestatic    #58  <Method DescriptorProtos$FieldDescriptorProto$Label[] values()>
		//   41   80:putstatic       #60  <Field DescriptorProtos$FieldDescriptorProto$Label[] VALUES>
		//*  42   83:return          
		}

		private Label(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #64  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #66  <Field int value>
		//    7   11:return          
		}
	}

	public static final class Type extends Enum
		implements ProtocolMessageEnum
	{

		public static Type forNumber(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     1 18: default 88
		//		               1 91
		//		               2 95
		//		               3 99
		//		               4 103
		//		               5 107
		//		               6 111
		//		               7 115
		//		               8 119
		//		               9 123
		//		               10 127
		//		               11 131
		//		               12 135
		//		               13 139
		//		               14 143
		//		               15 147
		//		               16 151
		//		               17 155
		//		               18 159
		//*   2   88:goto            163
			case 1: // '\001'
				return TYPE_DOUBLE;
		//    3   91:getstatic       #87  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_DOUBLE>
		//    4   94:areturn         

			case 2: // '\002'
				return TYPE_FLOAT;
		//    5   95:getstatic       #90  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FLOAT>
		//    6   98:areturn         

			case 3: // '\003'
				return TYPE_INT64;
		//    7   99:getstatic       #93  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT64>
		//    8  102:areturn         

			case 4: // '\004'
				return TYPE_UINT64;
		//    9  103:getstatic       #96  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT64>
		//   10  106:areturn         

			case 5: // '\005'
				return TYPE_INT32;
		//   11  107:getstatic       #99  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT32>
		//   12  110:areturn         

			case 6: // '\006'
				return TYPE_FIXED64;
		//   13  111:getstatic       #102 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED64>
		//   14  114:areturn         

			case 7: // '\007'
				return TYPE_FIXED32;
		//   15  115:getstatic       #105 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED32>
		//   16  118:areturn         

			case 8: // '\b'
				return TYPE_BOOL;
		//   17  119:getstatic       #108 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BOOL>
		//   18  122:areturn         

			case 9: // '\t'
				return TYPE_STRING;
		//   19  123:getstatic       #111 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_STRING>
		//   20  126:areturn         

			case 10: // '\n'
				return TYPE_GROUP;
		//   21  127:getstatic       #114 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_GROUP>
		//   22  130:areturn         

			case 11: // '\013'
				return TYPE_MESSAGE;
		//   23  131:getstatic       #117 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_MESSAGE>
		//   24  134:areturn         

			case 12: // '\f'
				return TYPE_BYTES;
		//   25  135:getstatic       #120 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BYTES>
		//   26  138:areturn         

			case 13: // '\r'
				return TYPE_UINT32;
		//   27  139:getstatic       #123 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT32>
		//   28  142:areturn         

			case 14: // '\016'
				return TYPE_ENUM;
		//   29  143:getstatic       #126 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_ENUM>
		//   30  146:areturn         

			case 15: // '\017'
				return TYPE_SFIXED32;
		//   31  147:getstatic       #129 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED32>
		//   32  150:areturn         

			case 16: // '\020'
				return TYPE_SFIXED64;
		//   33  151:getstatic       #132 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED64>
		//   34  154:areturn         

			case 17: // '\021'
				return TYPE_SINT32;
		//   35  155:getstatic       #135 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT32>
		//   36  158:areturn         

			case 18: // '\022'
				return TYPE_SINT64;
		//   37  159:getstatic       #138 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT64>
		//   38  162:areturn         
			}
			return null;
		//   39  163:aconst_null     
		//   40  164:areturn         
		}

		public static final Descriptors.EnumDescriptor getDescriptor()
		{
			return (Descriptors.EnumDescriptor)DescriptorProtos.FieldDescriptorProto.getDescriptor().getEnumTypes().get(0);
		//    0    0:invokestatic    #165 <Method Descriptors$Descriptor DescriptorProtos$FieldDescriptorProto.getDescriptor()>
		//    1    3:invokevirtual   #171 <Method List Descriptors$Descriptor.getEnumTypes()>
		//    2    6:iconst_0        
		//    3    7:invokeinterface #177 <Method Object List.get(int)>
		//    4   12:checkcast       #179 <Class Descriptors$EnumDescriptor>
		//    5   15:areturn         
		}

		public static Internal.EnumLiteMap internalGetValueMap()
		{
			return internalValueMap;
		//    0    0:getstatic       #144 <Field Internal$EnumLiteMap internalValueMap>
		//    1    3:areturn         
		}

		public static Type valueOf(int i)
		{
			return forNumber(i);
		//    0    0:iload_0         
		//    1    1:invokestatic    #186 <Method DescriptorProtos$FieldDescriptorProto$Type forNumber(int)>
		//    2    4:areturn         
		}

		public static Type valueOf(Descriptors.EnumValueDescriptor enumvaluedescriptor)
		{
			if(enumvaluedescriptor.getType() != getDescriptor())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #193 <Method Descriptors$EnumDescriptor Descriptors$EnumValueDescriptor.getType()>
		//*   2    4:invokestatic    #195 <Method Descriptors$EnumDescriptor getDescriptor()>
		//*   3    7:if_acmpeq       20
				throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
		//    4   10:new             #197 <Class IllegalArgumentException>
		//    5   13:dup             
		//    6   14:ldc1            #199 <String "EnumValueDescriptor is not for this type.">
		//    7   16:invokespecial   #202 <Method void IllegalArgumentException(String)>
		//    8   19:athrow          
			else
				return VALUES[enumvaluedescriptor.getIndex()];
		//    9   20:getstatic       #150 <Field DescriptorProtos$FieldDescriptorProto$Type[] VALUES>
		//   10   23:aload_0         
		//   11   24:invokevirtual   #206 <Method int Descriptors$EnumValueDescriptor.getIndex()>
		//   12   27:aaload          
		//   13   28:areturn         
		}

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/google/protobuf/DescriptorProtos$FieldDescriptorProto$Type, s);
		//    0    0:ldc1            #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #210 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #140 <Field DescriptorProtos$FieldDescriptorProto$Type[] $VALUES>
		//    1    3:invokevirtual   #215 <Method Object _5B_Lcom.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type_3B_.clone()>
		//    2    6:checkcast       #211 <Class DescriptorProtos$FieldDescriptorProto$Type[]>
		//    3    9:areturn         
		}

		public final Descriptors.EnumDescriptor getDescriptorForType()
		{
			return getDescriptor();
		//    0    0:invokestatic    #195 <Method Descriptors$EnumDescriptor getDescriptor()>
		//    1    3:areturn         
		}

		public final int getNumber()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #156 <Field int value>
		//    2    4:ireturn         
		}

		public final Descriptors.EnumValueDescriptor getValueDescriptor()
		{
			return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(ordinal());
		//    0    0:invokestatic    #195 <Method Descriptors$EnumDescriptor getDescriptor()>
		//    1    3:invokevirtual   #222 <Method List Descriptors$EnumDescriptor.getValues()>
		//    2    6:aload_0         
		//    3    7:invokevirtual   #225 <Method int ordinal()>
		//    4   10:invokeinterface #177 <Method Object List.get(int)>
		//    5   15:checkcast       #190 <Class Descriptors$EnumValueDescriptor>
		//    6   18:areturn         
		}

		private static final Type $VALUES[];
		public static final Type TYPE_BOOL;
		public static final int TYPE_BOOL_VALUE = 8;
		public static final Type TYPE_BYTES;
		public static final int TYPE_BYTES_VALUE = 12;
		public static final Type TYPE_DOUBLE;
		public static final int TYPE_DOUBLE_VALUE = 1;
		public static final Type TYPE_ENUM;
		public static final int TYPE_ENUM_VALUE = 14;
		public static final Type TYPE_FIXED32;
		public static final int TYPE_FIXED32_VALUE = 7;
		public static final Type TYPE_FIXED64;
		public static final int TYPE_FIXED64_VALUE = 6;
		public static final Type TYPE_FLOAT;
		public static final int TYPE_FLOAT_VALUE = 2;
		public static final Type TYPE_GROUP;
		public static final int TYPE_GROUP_VALUE = 10;
		public static final Type TYPE_INT32;
		public static final int TYPE_INT32_VALUE = 5;
		public static final Type TYPE_INT64;
		public static final int TYPE_INT64_VALUE = 3;
		public static final Type TYPE_MESSAGE;
		public static final int TYPE_MESSAGE_VALUE = 11;
		public static final Type TYPE_SFIXED32;
		public static final int TYPE_SFIXED32_VALUE = 15;
		public static final Type TYPE_SFIXED64;
		public static final int TYPE_SFIXED64_VALUE = 16;
		public static final Type TYPE_SINT32;
		public static final int TYPE_SINT32_VALUE = 17;
		public static final Type TYPE_SINT64;
		public static final int TYPE_SINT64_VALUE = 18;
		public static final Type TYPE_STRING;
		public static final int TYPE_STRING_VALUE = 9;
		public static final Type TYPE_UINT32;
		public static final int TYPE_UINT32_VALUE = 13;
		public static final Type TYPE_UINT64;
		public static final int TYPE_UINT64_VALUE = 4;
		private static final Type VALUES[] = values();
		private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() {

			public Type findValueByNumber(int i)
			{
				return Type.forNumber(i);
			//    0    0:iload_1         
			//    1    1:invokestatic    #25  <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.forNumber(int)>
			//    2    4:areturn         
			}

			public volatile Internal.EnumLite findValueByNumber(int i)
			{
				return ((Internal.EnumLite) (findValueByNumber(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #28  <Method DescriptorProtos$FieldDescriptorProto$Type findValueByNumber(int)>
			//    3    5:areturn         
			}

		}
;
		private final int value;

		static 
		{
			TYPE_DOUBLE = new Type("TYPE_DOUBLE", 0, 1);
		//    0    0:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//    1    3:dup             
		//    2    4:ldc1            #81  <String "TYPE_DOUBLE">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//    6   11:putstatic       #87  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_DOUBLE>
			TYPE_FLOAT = new Type("TYPE_FLOAT", 1, 2);
		//    7   14:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//    8   17:dup             
		//    9   18:ldc1            #88  <String "TYPE_FLOAT">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   13   25:putstatic       #90  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FLOAT>
			TYPE_INT64 = new Type("TYPE_INT64", 2, 3);
		//   14   28:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   15   31:dup             
		//   16   32:ldc1            #91  <String "TYPE_INT64">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   20   39:putstatic       #93  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT64>
			TYPE_UINT64 = new Type("TYPE_UINT64", 3, 4);
		//   21   42:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   22   45:dup             
		//   23   46:ldc1            #94  <String "TYPE_UINT64">
		//   24   48:iconst_3        
		//   25   49:iconst_4        
		//   26   50:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   27   53:putstatic       #96  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT64>
			TYPE_INT32 = new Type("TYPE_INT32", 4, 5);
		//   28   56:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   29   59:dup             
		//   30   60:ldc1            #97  <String "TYPE_INT32">
		//   31   62:iconst_4        
		//   32   63:iconst_5        
		//   33   64:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   34   67:putstatic       #99  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT32>
			TYPE_FIXED64 = new Type("TYPE_FIXED64", 5, 6);
		//   35   70:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   36   73:dup             
		//   37   74:ldc1            #100 <String "TYPE_FIXED64">
		//   38   76:iconst_5        
		//   39   77:bipush          6
		//   40   79:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   41   82:putstatic       #102 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED64>
			TYPE_FIXED32 = new Type("TYPE_FIXED32", 6, 7);
		//   42   85:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   43   88:dup             
		//   44   89:ldc1            #103 <String "TYPE_FIXED32">
		//   45   91:bipush          6
		//   46   93:bipush          7
		//   47   95:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   48   98:putstatic       #105 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED32>
			TYPE_BOOL = new Type("TYPE_BOOL", 7, 8);
		//   49  101:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   50  104:dup             
		//   51  105:ldc1            #106 <String "TYPE_BOOL">
		//   52  107:bipush          7
		//   53  109:bipush          8
		//   54  111:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   55  114:putstatic       #108 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BOOL>
			TYPE_STRING = new Type("TYPE_STRING", 8, 9);
		//   56  117:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   57  120:dup             
		//   58  121:ldc1            #109 <String "TYPE_STRING">
		//   59  123:bipush          8
		//   60  125:bipush          9
		//   61  127:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   62  130:putstatic       #111 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_STRING>
			TYPE_GROUP = new Type("TYPE_GROUP", 9, 10);
		//   63  133:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   64  136:dup             
		//   65  137:ldc1            #112 <String "TYPE_GROUP">
		//   66  139:bipush          9
		//   67  141:bipush          10
		//   68  143:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   69  146:putstatic       #114 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_GROUP>
			TYPE_MESSAGE = new Type("TYPE_MESSAGE", 10, 11);
		//   70  149:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   71  152:dup             
		//   72  153:ldc1            #115 <String "TYPE_MESSAGE">
		//   73  155:bipush          10
		//   74  157:bipush          11
		//   75  159:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   76  162:putstatic       #117 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_MESSAGE>
			TYPE_BYTES = new Type("TYPE_BYTES", 11, 12);
		//   77  165:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   78  168:dup             
		//   79  169:ldc1            #118 <String "TYPE_BYTES">
		//   80  171:bipush          11
		//   81  173:bipush          12
		//   82  175:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   83  178:putstatic       #120 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BYTES>
			TYPE_UINT32 = new Type("TYPE_UINT32", 12, 13);
		//   84  181:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   85  184:dup             
		//   86  185:ldc1            #121 <String "TYPE_UINT32">
		//   87  187:bipush          12
		//   88  189:bipush          13
		//   89  191:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   90  194:putstatic       #123 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT32>
			TYPE_ENUM = new Type("TYPE_ENUM", 13, 14);
		//   91  197:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   92  200:dup             
		//   93  201:ldc1            #124 <String "TYPE_ENUM">
		//   94  203:bipush          13
		//   95  205:bipush          14
		//   96  207:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//   97  210:putstatic       #126 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_ENUM>
			TYPE_SFIXED32 = new Type("TYPE_SFIXED32", 14, 15);
		//   98  213:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//   99  216:dup             
		//  100  217:ldc1            #127 <String "TYPE_SFIXED32">
		//  101  219:bipush          14
		//  102  221:bipush          15
		//  103  223:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//  104  226:putstatic       #129 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED32>
			TYPE_SFIXED64 = new Type("TYPE_SFIXED64", 15, 16);
		//  105  229:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//  106  232:dup             
		//  107  233:ldc1            #130 <String "TYPE_SFIXED64">
		//  108  235:bipush          15
		//  109  237:bipush          16
		//  110  239:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//  111  242:putstatic       #132 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED64>
			TYPE_SINT32 = new Type("TYPE_SINT32", 16, 17);
		//  112  245:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//  113  248:dup             
		//  114  249:ldc1            #133 <String "TYPE_SINT32">
		//  115  251:bipush          16
		//  116  253:bipush          17
		//  117  255:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//  118  258:putstatic       #135 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT32>
			TYPE_SINT64 = new Type("TYPE_SINT64", 17, 18);
		//  119  261:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
		//  120  264:dup             
		//  121  265:ldc1            #136 <String "TYPE_SINT64">
		//  122  267:bipush          17
		//  123  269:bipush          18
		//  124  271:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
		//  125  274:putstatic       #138 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT64>
			$VALUES = (new Type[] {
				TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, 
				TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64
			});
		//  126  277:bipush          18
		//  127  279:anewarray       Type[]
		//  128  282:dup             
		//  129  283:iconst_0        
		//  130  284:getstatic       #87  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_DOUBLE>
		//  131  287:aastore         
		//  132  288:dup             
		//  133  289:iconst_1        
		//  134  290:getstatic       #90  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FLOAT>
		//  135  293:aastore         
		//  136  294:dup             
		//  137  295:iconst_2        
		//  138  296:getstatic       #93  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT64>
		//  139  299:aastore         
		//  140  300:dup             
		//  141  301:iconst_3        
		//  142  302:getstatic       #96  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT64>
		//  143  305:aastore         
		//  144  306:dup             
		//  145  307:iconst_4        
		//  146  308:getstatic       #99  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT32>
		//  147  311:aastore         
		//  148  312:dup             
		//  149  313:iconst_5        
		//  150  314:getstatic       #102 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED64>
		//  151  317:aastore         
		//  152  318:dup             
		//  153  319:bipush          6
		//  154  321:getstatic       #105 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED32>
		//  155  324:aastore         
		//  156  325:dup             
		//  157  326:bipush          7
		//  158  328:getstatic       #108 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BOOL>
		//  159  331:aastore         
		//  160  332:dup             
		//  161  333:bipush          8
		//  162  335:getstatic       #111 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_STRING>
		//  163  338:aastore         
		//  164  339:dup             
		//  165  340:bipush          9
		//  166  342:getstatic       #114 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_GROUP>
		//  167  345:aastore         
		//  168  346:dup             
		//  169  347:bipush          10
		//  170  349:getstatic       #117 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_MESSAGE>
		//  171  352:aastore         
		//  172  353:dup             
		//  173  354:bipush          11
		//  174  356:getstatic       #120 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BYTES>
		//  175  359:aastore         
		//  176  360:dup             
		//  177  361:bipush          12
		//  178  363:getstatic       #123 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT32>
		//  179  366:aastore         
		//  180  367:dup             
		//  181  368:bipush          13
		//  182  370:getstatic       #126 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_ENUM>
		//  183  373:aastore         
		//  184  374:dup             
		//  185  375:bipush          14
		//  186  377:getstatic       #129 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED32>
		//  187  380:aastore         
		//  188  381:dup             
		//  189  382:bipush          15
		//  190  384:getstatic       #132 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED64>
		//  191  387:aastore         
		//  192  388:dup             
		//  193  389:bipush          16
		//  194  391:getstatic       #135 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT32>
		//  195  394:aastore         
		//  196  395:dup             
		//  197  396:bipush          17
		//  198  398:getstatic       #138 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT64>
		//  199  401:aastore         
		//  200  402:putstatic       #140 <Field DescriptorProtos$FieldDescriptorProto$Type[] $VALUES>
		//  201  405:new             #15  <Class DescriptorProtos$FieldDescriptorProto$Type$1>
		//  202  408:dup             
		//  203  409:invokespecial   #142 <Method void DescriptorProtos$FieldDescriptorProto$Type$1()>
		//  204  412:putstatic       #144 <Field Internal$EnumLiteMap internalValueMap>
		//  205  415:invokestatic    #148 <Method DescriptorProtos$FieldDescriptorProto$Type[] values()>
		//  206  418:putstatic       #150 <Field DescriptorProtos$FieldDescriptorProto$Type[] VALUES>
		//* 207  421:return          
		}

		private Type(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #154 <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #156 <Field int value>
		//    7   11:return          
		}
	}


	public static DescriptorProtos$FieldDescriptorProto getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #77  <Field DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$6900();
	//    0    0:invokestatic    #232 <Method Descriptors$Descriptor DescriptorProtos.access$6900()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #77  <Field DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #235 <Method DescriptorProtos$FieldDescriptorProto$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$fielddescriptorproto);
	//    0    0:getstatic       #77  <Field DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #235 <Method DescriptorProtos$FieldDescriptorProto$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #238 <Method DescriptorProtos$FieldDescriptorProto$Builder DescriptorProtos$FieldDescriptorProto$Builder.mergeFrom(DescriptorProtos$FieldDescriptorProto)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #244 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #248 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldDescriptorProto)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #255 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldDescriptorProto)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #259 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #264 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #268 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #270 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FieldDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #272 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldDescriptorProto)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #276 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldDescriptorProto)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #280 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldDescriptorProto)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #284 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FieldDescriptorProto)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #288 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #80  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$FieldDescriptorProto))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$FieldDescriptorProto>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #295 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$FieldDescriptorProto)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasName() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasName())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #299 <Method boolean hasName()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #299 <Method boolean hasName()>
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
	//*  30   50:invokevirtual   #299 <Method boolean hasName()>
	//*  31   53:ifeq            81
			if(flag && getName().equals(((Object) (((DescriptorProtos$FieldDescriptorProto) (obj)).getName()))))
	//*  32   56:iload_2         
	//*  33   57:ifeq            79
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #303 <Method String getName()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #303 <Method String getName()>
	//*  38   68:invokevirtual   #306 <Method boolean String.equals(Object)>
	//*  39   71:ifeq            79
				flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
			else
	//*  42   76:goto            81
				flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if(flag1 && hasNumber() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasNumber())
	//*  45   81:iload_3         
	//*  46   82:ifeq            101
	//*  47   85:aload_0         
	//*  48   86:invokevirtual   #309 <Method boolean hasNumber()>
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #309 <Method boolean hasNumber()>
	//*  51   93:icmpne          101
			flag = true;
	//   52   96:iconst_1        
	//   53   97:istore_2        
		else
	//*  54   98:goto            103
			flag = false;
	//   55  101:iconst_0        
	//   56  102:istore_2        
		flag1 = flag;
	//   57  103:iload_2         
	//   58  104:istore_3        
		if(hasNumber())
	//*  59  105:aload_0         
	//*  60  106:invokevirtual   #309 <Method boolean hasNumber()>
	//*  61  109:ifeq            134
			if(flag && getNumber() == ((DescriptorProtos$FieldDescriptorProto) (obj)).getNumber())
	//*  62  112:iload_2         
	//*  63  113:ifeq            132
	//*  64  116:aload_0         
	//*  65  117:invokevirtual   #312 <Method int getNumber()>
	//*  66  120:aload_1         
	//*  67  121:invokevirtual   #312 <Method int getNumber()>
	//*  68  124:icmpne          132
				flag1 = true;
	//   69  127:iconst_1        
	//   70  128:istore_3        
			else
	//*  71  129:goto            134
				flag1 = false;
	//   72  132:iconst_0        
	//   73  133:istore_3        
		if(flag1 && hasLabel() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasLabel())
	//*  74  134:iload_3         
	//*  75  135:ifeq            154
	//*  76  138:aload_0         
	//*  77  139:invokevirtual   #315 <Method boolean hasLabel()>
	//*  78  142:aload_1         
	//*  79  143:invokevirtual   #315 <Method boolean hasLabel()>
	//*  80  146:icmpne          154
			flag = true;
	//   81  149:iconst_1        
	//   82  150:istore_2        
		else
	//*  83  151:goto            156
			flag = false;
	//   84  154:iconst_0        
	//   85  155:istore_2        
		flag1 = flag;
	//   86  156:iload_2         
	//   87  157:istore_3        
		if(hasLabel())
	//*  88  158:aload_0         
	//*  89  159:invokevirtual   #315 <Method boolean hasLabel()>
	//*  90  162:ifeq            187
			if(flag && label_ == ((DescriptorProtos$FieldDescriptorProto) (obj)).label_)
	//*  91  165:iload_2         
	//*  92  166:ifeq            185
	//*  93  169:aload_0         
	//*  94  170:getfield        #92  <Field int label_>
	//*  95  173:aload_1         
	//*  96  174:getfield        #92  <Field int label_>
	//*  97  177:icmpne          185
				flag1 = true;
	//   98  180:iconst_1        
	//   99  181:istore_3        
			else
	//* 100  182:goto            187
				flag1 = false;
	//  101  185:iconst_0        
	//  102  186:istore_3        
		if(flag1 && hasType() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasType())
	//* 103  187:iload_3         
	//* 104  188:ifeq            207
	//* 105  191:aload_0         
	//* 106  192:invokevirtual   #318 <Method boolean hasType()>
	//* 107  195:aload_1         
	//* 108  196:invokevirtual   #318 <Method boolean hasType()>
	//* 109  199:icmpne          207
			flag = true;
	//  110  202:iconst_1        
	//  111  203:istore_2        
		else
	//* 112  204:goto            209
			flag = false;
	//  113  207:iconst_0        
	//  114  208:istore_2        
		flag1 = flag;
	//  115  209:iload_2         
	//  116  210:istore_3        
		if(hasType())
	//* 117  211:aload_0         
	//* 118  212:invokevirtual   #318 <Method boolean hasType()>
	//* 119  215:ifeq            240
			if(flag && type_ == ((DescriptorProtos$FieldDescriptorProto) (obj)).type_)
	//* 120  218:iload_2         
	//* 121  219:ifeq            238
	//* 122  222:aload_0         
	//* 123  223:getfield        #94  <Field int type_>
	//* 124  226:aload_1         
	//* 125  227:getfield        #94  <Field int type_>
	//* 126  230:icmpne          238
				flag1 = true;
	//  127  233:iconst_1        
	//  128  234:istore_3        
			else
	//* 129  235:goto            240
				flag1 = false;
	//  130  238:iconst_0        
	//  131  239:istore_3        
		if(flag1 && hasTypeName() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasTypeName())
	//* 132  240:iload_3         
	//* 133  241:ifeq            260
	//* 134  244:aload_0         
	//* 135  245:invokevirtual   #321 <Method boolean hasTypeName()>
	//* 136  248:aload_1         
	//* 137  249:invokevirtual   #321 <Method boolean hasTypeName()>
	//* 138  252:icmpne          260
			flag = true;
	//  139  255:iconst_1        
	//  140  256:istore_2        
		else
	//* 141  257:goto            262
			flag = false;
	//  142  260:iconst_0        
	//  143  261:istore_2        
		flag1 = flag;
	//  144  262:iload_2         
	//  145  263:istore_3        
		if(hasTypeName())
	//* 146  264:aload_0         
	//* 147  265:invokevirtual   #321 <Method boolean hasTypeName()>
	//* 148  268:ifeq            296
			if(flag && getTypeName().equals(((Object) (((DescriptorProtos$FieldDescriptorProto) (obj)).getTypeName()))))
	//* 149  271:iload_2         
	//* 150  272:ifeq            294
	//* 151  275:aload_0         
	//* 152  276:invokevirtual   #324 <Method String getTypeName()>
	//* 153  279:aload_1         
	//* 154  280:invokevirtual   #324 <Method String getTypeName()>
	//* 155  283:invokevirtual   #306 <Method boolean String.equals(Object)>
	//* 156  286:ifeq            294
				flag1 = true;
	//  157  289:iconst_1        
	//  158  290:istore_3        
			else
	//* 159  291:goto            296
				flag1 = false;
	//  160  294:iconst_0        
	//  161  295:istore_3        
		if(flag1 && hasExtendee() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasExtendee())
	//* 162  296:iload_3         
	//* 163  297:ifeq            316
	//* 164  300:aload_0         
	//* 165  301:invokevirtual   #327 <Method boolean hasExtendee()>
	//* 166  304:aload_1         
	//* 167  305:invokevirtual   #327 <Method boolean hasExtendee()>
	//* 168  308:icmpne          316
			flag = true;
	//  169  311:iconst_1        
	//  170  312:istore_2        
		else
	//* 171  313:goto            318
			flag = false;
	//  172  316:iconst_0        
	//  173  317:istore_2        
		flag1 = flag;
	//  174  318:iload_2         
	//  175  319:istore_3        
		if(hasExtendee())
	//* 176  320:aload_0         
	//* 177  321:invokevirtual   #327 <Method boolean hasExtendee()>
	//* 178  324:ifeq            352
			if(flag && getExtendee().equals(((Object) (((DescriptorProtos$FieldDescriptorProto) (obj)).getExtendee()))))
	//* 179  327:iload_2         
	//* 180  328:ifeq            350
	//* 181  331:aload_0         
	//* 182  332:invokevirtual   #330 <Method String getExtendee()>
	//* 183  335:aload_1         
	//* 184  336:invokevirtual   #330 <Method String getExtendee()>
	//* 185  339:invokevirtual   #306 <Method boolean String.equals(Object)>
	//* 186  342:ifeq            350
				flag1 = true;
	//  187  345:iconst_1        
	//  188  346:istore_3        
			else
	//* 189  347:goto            352
				flag1 = false;
	//  190  350:iconst_0        
	//  191  351:istore_3        
		if(flag1 && hasDefaultValue() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasDefaultValue())
	//* 192  352:iload_3         
	//* 193  353:ifeq            372
	//* 194  356:aload_0         
	//* 195  357:invokevirtual   #333 <Method boolean hasDefaultValue()>
	//* 196  360:aload_1         
	//* 197  361:invokevirtual   #333 <Method boolean hasDefaultValue()>
	//* 198  364:icmpne          372
			flag = true;
	//  199  367:iconst_1        
	//  200  368:istore_2        
		else
	//* 201  369:goto            374
			flag = false;
	//  202  372:iconst_0        
	//  203  373:istore_2        
		flag1 = flag;
	//  204  374:iload_2         
	//  205  375:istore_3        
		if(hasDefaultValue())
	//* 206  376:aload_0         
	//* 207  377:invokevirtual   #333 <Method boolean hasDefaultValue()>
	//* 208  380:ifeq            408
			if(flag && getDefaultValue().equals(((Object) (((DescriptorProtos$FieldDescriptorProto) (obj)).getDefaultValue()))))
	//* 209  383:iload_2         
	//* 210  384:ifeq            406
	//* 211  387:aload_0         
	//* 212  388:invokevirtual   #336 <Method String getDefaultValue()>
	//* 213  391:aload_1         
	//* 214  392:invokevirtual   #336 <Method String getDefaultValue()>
	//* 215  395:invokevirtual   #306 <Method boolean String.equals(Object)>
	//* 216  398:ifeq            406
				flag1 = true;
	//  217  401:iconst_1        
	//  218  402:istore_3        
			else
	//* 219  403:goto            408
				flag1 = false;
	//  220  406:iconst_0        
	//  221  407:istore_3        
		if(flag1 && hasOneofIndex() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasOneofIndex())
	//* 222  408:iload_3         
	//* 223  409:ifeq            428
	//* 224  412:aload_0         
	//* 225  413:invokevirtual   #339 <Method boolean hasOneofIndex()>
	//* 226  416:aload_1         
	//* 227  417:invokevirtual   #339 <Method boolean hasOneofIndex()>
	//* 228  420:icmpne          428
			flag = true;
	//  229  423:iconst_1        
	//  230  424:istore_2        
		else
	//* 231  425:goto            430
			flag = false;
	//  232  428:iconst_0        
	//  233  429:istore_2        
		flag1 = flag;
	//  234  430:iload_2         
	//  235  431:istore_3        
		if(hasOneofIndex())
	//* 236  432:aload_0         
	//* 237  433:invokevirtual   #339 <Method boolean hasOneofIndex()>
	//* 238  436:ifeq            461
			if(flag && getOneofIndex() == ((DescriptorProtos$FieldDescriptorProto) (obj)).getOneofIndex())
	//* 239  439:iload_2         
	//* 240  440:ifeq            459
	//* 241  443:aload_0         
	//* 242  444:invokevirtual   #342 <Method int getOneofIndex()>
	//* 243  447:aload_1         
	//* 244  448:invokevirtual   #342 <Method int getOneofIndex()>
	//* 245  451:icmpne          459
				flag1 = true;
	//  246  454:iconst_1        
	//  247  455:istore_3        
			else
	//* 248  456:goto            461
				flag1 = false;
	//  249  459:iconst_0        
	//  250  460:istore_3        
		if(flag1 && hasJsonName() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasJsonName())
	//* 251  461:iload_3         
	//* 252  462:ifeq            481
	//* 253  465:aload_0         
	//* 254  466:invokevirtual   #345 <Method boolean hasJsonName()>
	//* 255  469:aload_1         
	//* 256  470:invokevirtual   #345 <Method boolean hasJsonName()>
	//* 257  473:icmpne          481
			flag = true;
	//  258  476:iconst_1        
	//  259  477:istore_2        
		else
	//* 260  478:goto            483
			flag = false;
	//  261  481:iconst_0        
	//  262  482:istore_2        
		flag1 = flag;
	//  263  483:iload_2         
	//  264  484:istore_3        
		if(hasJsonName())
	//* 265  485:aload_0         
	//* 266  486:invokevirtual   #345 <Method boolean hasJsonName()>
	//* 267  489:ifeq            517
			if(flag && getJsonName().equals(((Object) (((DescriptorProtos$FieldDescriptorProto) (obj)).getJsonName()))))
	//* 268  492:iload_2         
	//* 269  493:ifeq            515
	//* 270  496:aload_0         
	//* 271  497:invokevirtual   #348 <Method String getJsonName()>
	//* 272  500:aload_1         
	//* 273  501:invokevirtual   #348 <Method String getJsonName()>
	//* 274  504:invokevirtual   #306 <Method boolean String.equals(Object)>
	//* 275  507:ifeq            515
				flag1 = true;
	//  276  510:iconst_1        
	//  277  511:istore_3        
			else
	//* 278  512:goto            517
				flag1 = false;
	//  279  515:iconst_0        
	//  280  516:istore_3        
		if(flag1 && hasOptions() == ((DescriptorProtos$FieldDescriptorProto) (obj)).hasOptions())
	//* 281  517:iload_3         
	//* 282  518:ifeq            537
	//* 283  521:aload_0         
	//* 284  522:invokevirtual   #351 <Method boolean hasOptions()>
	//* 285  525:aload_1         
	//* 286  526:invokevirtual   #351 <Method boolean hasOptions()>
	//* 287  529:icmpne          537
			flag = true;
	//  288  532:iconst_1        
	//  289  533:istore_2        
		else
	//* 290  534:goto            539
			flag = false;
	//  291  537:iconst_0        
	//  292  538:istore_2        
		flag1 = flag;
	//  293  539:iload_2         
	//  294  540:istore_3        
		if(hasOptions())
	//* 295  541:aload_0         
	//* 296  542:invokevirtual   #351 <Method boolean hasOptions()>
	//* 297  545:ifeq            573
			if(flag && getOptions().equals(((Object) (((DescriptorProtos$FieldDescriptorProto) (obj)).getOptions()))))
	//* 298  548:iload_2         
	//* 299  549:ifeq            571
	//* 300  552:aload_0         
	//* 301  553:invokevirtual   #354 <Method DescriptorProtos$FieldOptions getOptions()>
	//* 302  556:aload_1         
	//* 303  557:invokevirtual   #354 <Method DescriptorProtos$FieldOptions getOptions()>
	//* 304  560:invokevirtual   #355 <Method boolean DescriptorProtos$FieldOptions.equals(Object)>
	//* 305  563:ifeq            571
				flag1 = true;
	//  306  566:iconst_1        
	//  307  567:istore_3        
			else
	//* 308  568:goto            573
				flag1 = false;
	//  309  571:iconst_0        
	//  310  572:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$FieldDescriptorProto) (obj)).unknownFields)));
	//  311  573:iload_3         
	//  312  574:ifeq            593
	//  313  577:aload_0         
	//  314  578:getfield        #184 <Field UnknownFieldSet unknownFields>
	//  315  581:aload_1         
	//  316  582:getfield        #184 <Field UnknownFieldSet unknownFields>
	//  317  585:invokevirtual   #356 <Method boolean UnknownFieldSet.equals(Object)>
	//  318  588:ifeq            593
	//  319  591:iconst_1        
	//  320  592:ireturn         
	//  321  593:iconst_0        
	//  322  594:ireturn         
	}

	public DescriptorProtos$FieldDescriptorProto getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #77  <Field DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #360 <Method DescriptorProtos$FieldDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #360 <Method DescriptorProtos$FieldDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public String getDefaultValue()
	{
		Object obj = defaultValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Object defaultValue_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #363 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #366 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #369 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			defaultValue_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #100 <Field Object defaultValue_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getDefaultValueBytes()
	{
		Object obj = defaultValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Object defaultValue_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:invokestatic    #374 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			defaultValue_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #100 <Field Object defaultValue_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #363 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public String getExtendee()
	{
		Object obj = extendee_;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Object extendee_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #363 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #366 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #369 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			extendee_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #98  <Field Object extendee_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getExtendeeBytes()
	{
		Object obj = extendee_;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Object extendee_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:invokestatic    #374 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			extendee_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #98  <Field Object extendee_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #363 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public String getJsonName()
	{
		Object obj = jsonName_;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Object jsonName_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #363 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #366 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #369 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			jsonName_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #104 <Field Object jsonName_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getJsonNameBytes()
	{
		Object obj = jsonName_;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Object jsonName_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:invokestatic    #374 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			jsonName_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #104 <Field Object jsonName_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #363 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public Label getLabel()
	{
		Label label = Label.valueOf(label_);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int label_>
	//    2    4:invokestatic    #144 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.valueOf(int)>
	//    3    7:astore_1        
		if(label == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return Label.LABEL_OPTIONAL;
	//    6   12:getstatic       #382 <Field DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.LABEL_OPTIONAL>
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
	//    1    1:getfield        #88  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #363 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #366 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #369 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			name_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #88  <Field Object name_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:invokestatic    #374 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #88  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #363 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public int getNumber()
	{
		return number_;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int number_>
	//    2    4:ireturn         
	}

	public int getOneofIndex()
	{
		return oneofIndex_;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int oneofIndex_>
	//    2    4:ireturn         
	}

	public DescriptorProtos.FieldOptions getOptions()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field DescriptorProtos$FieldOptions options_>
	//*   2    4:ifnonnull       11
			return DescriptorProtos.FieldOptions.getDefaultInstance();
	//    3    7:invokestatic    #385 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return options_;
	//    5   11:aload_0         
	//    6   12:getfield        #155 <Field DescriptorProtos$FieldOptions options_>
	//    7   15:areturn         
	}

	public  getOptionsOrBuilder()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field DescriptorProtos$FieldOptions options_>
	//*   2    4:ifnonnull       11
			return (() (DescriptorProtos.FieldOptions.getDefaultInstance()));
	//    3    7:invokestatic    #385 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return (() (options_));
	//    5   11:aload_0         
	//    6   12:getfield        #155 <Field DescriptorProtos$FieldOptions options_>
	//    7   15:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #80  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #392 <Field int memoizedSize>
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
		if((bitField0_ & 1) == 1)
	//*  10   14:aload_0         
	//*  11   15:getfield        #134 <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			j = GeneratedMessageV3.computeStringSize(1, name_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #88  <Field Object name_>
	//   19   29:invokestatic    #396 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_2        
		i = j;
	//   23   35:iload_2         
	//   24   36:istore_1        
		if((bitField0_ & 0x20) == 32)
	//*  25   37:aload_0         
	//*  26   38:getfield        #134 <Field int bitField0_>
	//*  27   41:bipush          32
	//*  28   43:iand            
	//*  29   44:bipush          32
	//*  30   46:icmpne          60
			i = j + GeneratedMessageV3.computeStringSize(2, extendee_);
	//   31   49:iload_2         
	//   32   50:iconst_2        
	//   33   51:aload_0         
	//   34   52:getfield        #98  <Field Object extendee_>
	//   35   55:invokestatic    #396 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   36   58:iadd            
	//   37   59:istore_1        
		j = i;
	//   38   60:iload_1         
	//   39   61:istore_2        
		if((bitField0_ & 2) == 2)
	//*  40   62:aload_0         
	//*  41   63:getfield        #134 <Field int bitField0_>
	//*  42   66:iconst_2        
	//*  43   67:iand            
	//*  44   68:iconst_2        
	//*  45   69:icmpne          83
			j = i + CodedOutputStream.computeInt32Size(3, number_);
	//   46   72:iload_1         
	//   47   73:iconst_3        
	//   48   74:aload_0         
	//   49   75:getfield        #90  <Field int number_>
	//   50   78:invokestatic    #402 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//   51   81:iadd            
	//   52   82:istore_2        
		i = j;
	//   53   83:iload_2         
	//   54   84:istore_1        
		if((bitField0_ & 4) == 4)
	//*  55   85:aload_0         
	//*  56   86:getfield        #134 <Field int bitField0_>
	//*  57   89:iconst_4        
	//*  58   90:iand            
	//*  59   91:iconst_4        
	//*  60   92:icmpne          106
			i = j + CodedOutputStream.computeEnumSize(4, label_);
	//   61   95:iload_2         
	//   62   96:iconst_4        
	//   63   97:aload_0         
	//   64   98:getfield        #92  <Field int label_>
	//   65  101:invokestatic    #405 <Method int CodedOutputStream.computeEnumSize(int, int)>
	//   66  104:iadd            
	//   67  105:istore_1        
		j = i;
	//   68  106:iload_1         
	//   69  107:istore_2        
		if((bitField0_ & 8) == 8)
	//*  70  108:aload_0         
	//*  71  109:getfield        #134 <Field int bitField0_>
	//*  72  112:bipush          8
	//*  73  114:iand            
	//*  74  115:bipush          8
	//*  75  117:icmpne          131
			j = i + CodedOutputStream.computeEnumSize(5, type_);
	//   76  120:iload_1         
	//   77  121:iconst_5        
	//   78  122:aload_0         
	//   79  123:getfield        #94  <Field int type_>
	//   80  126:invokestatic    #405 <Method int CodedOutputStream.computeEnumSize(int, int)>
	//   81  129:iadd            
	//   82  130:istore_2        
		i = j;
	//   83  131:iload_2         
	//   84  132:istore_1        
		if((bitField0_ & 0x10) == 16)
	//*  85  133:aload_0         
	//*  86  134:getfield        #134 <Field int bitField0_>
	//*  87  137:bipush          16
	//*  88  139:iand            
	//*  89  140:bipush          16
	//*  90  142:icmpne          157
			i = j + GeneratedMessageV3.computeStringSize(6, typeName_);
	//   91  145:iload_2         
	//   92  146:bipush          6
	//   93  148:aload_0         
	//   94  149:getfield        #96  <Field Object typeName_>
	//   95  152:invokestatic    #396 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   96  155:iadd            
	//   97  156:istore_1        
		j = i;
	//   98  157:iload_1         
	//   99  158:istore_2        
		if((bitField0_ & 0x40) == 64)
	//* 100  159:aload_0         
	//* 101  160:getfield        #134 <Field int bitField0_>
	//* 102  163:bipush          64
	//* 103  165:iand            
	//* 104  166:bipush          64
	//* 105  168:icmpne          183
			j = i + GeneratedMessageV3.computeStringSize(7, defaultValue_);
	//  106  171:iload_1         
	//  107  172:bipush          7
	//  108  174:aload_0         
	//  109  175:getfield        #100 <Field Object defaultValue_>
	//  110  178:invokestatic    #396 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//  111  181:iadd            
	//  112  182:istore_2        
		i = j;
	//  113  183:iload_2         
	//  114  184:istore_1        
		if((bitField0_ & 0x200) == 512)
	//* 115  185:aload_0         
	//* 116  186:getfield        #134 <Field int bitField0_>
	//* 117  189:sipush          512
	//* 118  192:iand            
	//* 119  193:sipush          512
	//* 120  196:icmpne          211
			i = j + CodedOutputStream.computeMessageSize(8, ((MessageLite) (getOptions())));
	//  121  199:iload_2         
	//  122  200:bipush          8
	//  123  202:aload_0         
	//  124  203:invokevirtual   #354 <Method DescriptorProtos$FieldOptions getOptions()>
	//  125  206:invokestatic    #409 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  126  209:iadd            
	//  127  210:istore_1        
		j = i;
	//  128  211:iload_1         
	//  129  212:istore_2        
		if((bitField0_ & 0x80) == 128)
	//* 130  213:aload_0         
	//* 131  214:getfield        #134 <Field int bitField0_>
	//* 132  217:sipush          128
	//* 133  220:iand            
	//* 134  221:sipush          128
	//* 135  224:icmpne          239
			j = i + CodedOutputStream.computeInt32Size(9, oneofIndex_);
	//  136  227:iload_1         
	//  137  228:bipush          9
	//  138  230:aload_0         
	//  139  231:getfield        #102 <Field int oneofIndex_>
	//  140  234:invokestatic    #402 <Method int CodedOutputStream.computeInt32Size(int, int)>
	//  141  237:iadd            
	//  142  238:istore_2        
		i = j;
	//  143  239:iload_2         
	//  144  240:istore_1        
		if((bitField0_ & 0x100) == 256)
	//* 145  241:aload_0         
	//* 146  242:getfield        #134 <Field int bitField0_>
	//* 147  245:sipush          256
	//* 148  248:iand            
	//* 149  249:sipush          256
	//* 150  252:icmpne          267
			i = j + GeneratedMessageV3.computeStringSize(10, jsonName_);
	//  151  255:iload_2         
	//  152  256:bipush          10
	//  153  258:aload_0         
	//  154  259:getfield        #104 <Field Object jsonName_>
	//  155  262:invokestatic    #396 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//  156  265:iadd            
	//  157  266:istore_1        
		i += unknownFields.getSerializedSize();
	//  158  267:iload_1         
	//  159  268:aload_0         
	//  160  269:getfield        #184 <Field UnknownFieldSet unknownFields>
	//  161  272:invokevirtual   #411 <Method int UnknownFieldSet.getSerializedSize()>
	//  162  275:iadd            
	//  163  276:istore_1        
		memoizedSize = i;
	//  164  277:aload_0         
	//  165  278:iload_1         
	//  166  279:putfield        #392 <Field int memoizedSize>
		return i;
	//  167  282:iload_1         
	//  168  283:ireturn         
	}

	public Type getType()
	{
		Type type = Type.valueOf(type_);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int type_>
	//    2    4:invokestatic    #153 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.valueOf(int)>
	//    3    7:astore_1        
		if(type == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return Type.TYPE_DOUBLE;
	//    6   12:getstatic       #417 <Field DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.TYPE_DOUBLE>
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
	//    1    1:getfield        #96  <Field Object typeName_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #363 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #366 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #369 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			typeName_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #96  <Field Object typeName_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getTypeNameBytes()
	{
		Object obj = typeName_;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Object typeName_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #305 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #305 <Class String>
	//    8   16:invokestatic    #374 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			typeName_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #96  <Field Object typeName_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #363 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasDefaultValue()
	{
		return (bitField0_ & 0x40) == 64;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field int bitField0_>
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
	//    1    1:getfield        #134 <Field int bitField0_>
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
	//    1    1:getfield        #134 <Field int bitField0_>
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
	//    1    1:getfield        #134 <Field int bitField0_>
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
	//    1    1:getfield        #134 <Field int bitField0_>
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
	//    1    1:getfield        #134 <Field int bitField0_>
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
	//    1    1:getfield        #134 <Field int bitField0_>
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
	//    1    1:getfield        #134 <Field int bitField0_>
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
	//    1    1:getfield        #134 <Field int bitField0_>
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
	//    1    1:getfield        #134 <Field int bitField0_>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:bipush          16
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #423 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #423 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #425 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #429 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasName())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #299 <Method boolean hasName()>
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
	//   24   42:invokevirtual   #303 <Method String getName()>
	//   25   45:invokevirtual   #430 <Method int String.hashCode()>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(hasNumber())
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #309 <Method boolean hasNumber()>
	//*  32   56:ifeq            74
			j = (i * 37 + 3) * 53 + getNumber();
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_3        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #312 <Method int getNumber()>
	//   42   72:iadd            
	//   43   73:istore_2        
		i = j;
	//   44   74:iload_2         
	//   45   75:istore_1        
		if(hasLabel())
	//*  46   76:aload_0         
	//*  47   77:invokevirtual   #315 <Method boolean hasLabel()>
	//*  48   80:ifeq            98
			i = (j * 37 + 4) * 53 + label_;
	//   49   83:iload_2         
	//   50   84:bipush          37
	//   51   86:imul            
	//   52   87:iconst_4        
	//   53   88:iadd            
	//   54   89:bipush          53
	//   55   91:imul            
	//   56   92:aload_0         
	//   57   93:getfield        #92  <Field int label_>
	//   58   96:iadd            
	//   59   97:istore_1        
		j = i;
	//   60   98:iload_1         
	//   61   99:istore_2        
		if(hasType())
	//*  62  100:aload_0         
	//*  63  101:invokevirtual   #318 <Method boolean hasType()>
	//*  64  104:ifeq            122
			j = (i * 37 + 5) * 53 + type_;
	//   65  107:iload_1         
	//   66  108:bipush          37
	//   67  110:imul            
	//   68  111:iconst_5        
	//   69  112:iadd            
	//   70  113:bipush          53
	//   71  115:imul            
	//   72  116:aload_0         
	//   73  117:getfield        #94  <Field int type_>
	//   74  120:iadd            
	//   75  121:istore_2        
		i = j;
	//   76  122:iload_2         
	//   77  123:istore_1        
		if(hasTypeName())
	//*  78  124:aload_0         
	//*  79  125:invokevirtual   #321 <Method boolean hasTypeName()>
	//*  80  128:ifeq            150
			i = (j * 37 + 6) * 53 + getTypeName().hashCode();
	//   81  131:iload_2         
	//   82  132:bipush          37
	//   83  134:imul            
	//   84  135:bipush          6
	//   85  137:iadd            
	//   86  138:bipush          53
	//   87  140:imul            
	//   88  141:aload_0         
	//   89  142:invokevirtual   #324 <Method String getTypeName()>
	//   90  145:invokevirtual   #430 <Method int String.hashCode()>
	//   91  148:iadd            
	//   92  149:istore_1        
		j = i;
	//   93  150:iload_1         
	//   94  151:istore_2        
		if(hasExtendee())
	//*  95  152:aload_0         
	//*  96  153:invokevirtual   #327 <Method boolean hasExtendee()>
	//*  97  156:ifeq            177
			j = (i * 37 + 2) * 53 + getExtendee().hashCode();
	//   98  159:iload_1         
	//   99  160:bipush          37
	//  100  162:imul            
	//  101  163:iconst_2        
	//  102  164:iadd            
	//  103  165:bipush          53
	//  104  167:imul            
	//  105  168:aload_0         
	//  106  169:invokevirtual   #330 <Method String getExtendee()>
	//  107  172:invokevirtual   #430 <Method int String.hashCode()>
	//  108  175:iadd            
	//  109  176:istore_2        
		i = j;
	//  110  177:iload_2         
	//  111  178:istore_1        
		if(hasDefaultValue())
	//* 112  179:aload_0         
	//* 113  180:invokevirtual   #333 <Method boolean hasDefaultValue()>
	//* 114  183:ifeq            205
			i = (j * 37 + 7) * 53 + getDefaultValue().hashCode();
	//  115  186:iload_2         
	//  116  187:bipush          37
	//  117  189:imul            
	//  118  190:bipush          7
	//  119  192:iadd            
	//  120  193:bipush          53
	//  121  195:imul            
	//  122  196:aload_0         
	//  123  197:invokevirtual   #336 <Method String getDefaultValue()>
	//  124  200:invokevirtual   #430 <Method int String.hashCode()>
	//  125  203:iadd            
	//  126  204:istore_1        
		j = i;
	//  127  205:iload_1         
	//  128  206:istore_2        
		if(hasOneofIndex())
	//* 129  207:aload_0         
	//* 130  208:invokevirtual   #339 <Method boolean hasOneofIndex()>
	//* 131  211:ifeq            230
			j = (i * 37 + 9) * 53 + getOneofIndex();
	//  132  214:iload_1         
	//  133  215:bipush          37
	//  134  217:imul            
	//  135  218:bipush          9
	//  136  220:iadd            
	//  137  221:bipush          53
	//  138  223:imul            
	//  139  224:aload_0         
	//  140  225:invokevirtual   #342 <Method int getOneofIndex()>
	//  141  228:iadd            
	//  142  229:istore_2        
		i = j;
	//  143  230:iload_2         
	//  144  231:istore_1        
		if(hasJsonName())
	//* 145  232:aload_0         
	//* 146  233:invokevirtual   #345 <Method boolean hasJsonName()>
	//* 147  236:ifeq            258
			i = (j * 37 + 10) * 53 + getJsonName().hashCode();
	//  148  239:iload_2         
	//  149  240:bipush          37
	//  150  242:imul            
	//  151  243:bipush          10
	//  152  245:iadd            
	//  153  246:bipush          53
	//  154  248:imul            
	//  155  249:aload_0         
	//  156  250:invokevirtual   #348 <Method String getJsonName()>
	//  157  253:invokevirtual   #430 <Method int String.hashCode()>
	//  158  256:iadd            
	//  159  257:istore_1        
		j = i;
	//  160  258:iload_1         
	//  161  259:istore_2        
		if(hasOptions())
	//* 162  260:aload_0         
	//* 163  261:invokevirtual   #351 <Method boolean hasOptions()>
	//* 164  264:ifeq            286
			j = (i * 37 + 8) * 53 + getOptions().hashCode();
	//  165  267:iload_1         
	//  166  268:bipush          37
	//  167  270:imul            
	//  168  271:bipush          8
	//  169  273:iadd            
	//  170  274:bipush          53
	//  171  276:imul            
	//  172  277:aload_0         
	//  173  278:invokevirtual   #354 <Method DescriptorProtos$FieldOptions getOptions()>
	//  174  281:invokevirtual   #431 <Method int DescriptorProtos$FieldOptions.hashCode()>
	//  175  284:iadd            
	//  176  285:istore_2        
		i = j * 29 + unknownFields.hashCode();
	//  177  286:iload_2         
	//  178  287:bipush          29
	//  179  289:imul            
	//  180  290:aload_0         
	//  181  291:getfield        #184 <Field UnknownFieldSet unknownFields>
	//  182  294:invokevirtual   #432 <Method int UnknownFieldSet.hashCode()>
	//  183  297:iadd            
	//  184  298:istore_1        
		memoizedHashCode = i;
	//  185  299:aload_0         
	//  186  300:iload_1         
	//  187  301:putfield        #423 <Field int memoizedHashCode>
		return i;
	//  188  304:iload_1         
	//  189  305:ireturn         
	}

	protected GeneratedMessageV3$FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$7000().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FieldDescriptorProto, com/google/protobuf/DescriptorProtos$FieldDescriptorProto$Builder);
	//    0    0:invokestatic    #437 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$7000()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    2    5:ldc1            #13  <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    3    7:invokevirtual   #443 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field byte memoizedIsInitialized>
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
		if(hasOptions() && !getOptions().isInitialized())
	//*  12   18:aload_0         
	//*  13   19:invokevirtual   #351 <Method boolean hasOptions()>
	//*  14   22:ifeq            42
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #354 <Method DescriptorProtos$FieldOptions getOptions()>
	//*  17   29:invokevirtual   #446 <Method boolean DescriptorProtos$FieldOptions.isInitialized()>
	//*  18   32:ifne            42
		{
			memoizedIsInitialized = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #84  <Field byte memoizedIsInitialized>
			return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   24   42:aload_0         
	//   25   43:iconst_1        
	//   26   44:putfield        #84  <Field byte memoizedIsInitialized>
			return true;
	//   27   47:iconst_1        
	//   28   48:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #449 <Method DescriptorProtos$FieldDescriptorProto$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #13  <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #453 <Method void DescriptorProtos$FieldDescriptorProto$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #456 <Method DescriptorProtos$FieldDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #459 <Method DescriptorProtos$FieldDescriptorProto$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #456 <Method DescriptorProtos$FieldDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #77  <Field DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #13  <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #463 <Method void DescriptorProtos$FieldDescriptorProto$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #13  <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #463 <Method void DescriptorProtos$FieldDescriptorProto$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #238 <Method DescriptorProtos$FieldDescriptorProto$Builder DescriptorProtos$FieldDescriptorProto$Builder.mergeFrom(DescriptorProtos$FieldDescriptorProto)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method DescriptorProtos$FieldDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method DescriptorProtos$FieldDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			GeneratedMessageV3.writeString(codedoutputstream, 1, name_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #88  <Field Object name_>
	//   10   16:invokestatic    #469 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x20) == 32)
	//*  11   19:aload_0         
	//*  12   20:getfield        #134 <Field int bitField0_>
	//*  13   23:bipush          32
	//*  14   25:iand            
	//*  15   26:bipush          32
	//*  16   28:icmpne          40
			GeneratedMessageV3.writeString(codedoutputstream, 2, extendee_);
	//   17   31:aload_1         
	//   18   32:iconst_2        
	//   19   33:aload_0         
	//   20   34:getfield        #98  <Field Object extendee_>
	//   21   37:invokestatic    #469 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 2) == 2)
	//*  22   40:aload_0         
	//*  23   41:getfield        #134 <Field int bitField0_>
	//*  24   44:iconst_2        
	//*  25   45:iand            
	//*  26   46:iconst_2        
	//*  27   47:icmpne          59
			codedoutputstream.writeInt32(3, number_);
	//   28   50:aload_1         
	//   29   51:iconst_3        
	//   30   52:aload_0         
	//   31   53:getfield        #90  <Field int number_>
	//   32   56:invokevirtual   #473 <Method void CodedOutputStream.writeInt32(int, int)>
		if((bitField0_ & 4) == 4)
	//*  33   59:aload_0         
	//*  34   60:getfield        #134 <Field int bitField0_>
	//*  35   63:iconst_4        
	//*  36   64:iand            
	//*  37   65:iconst_4        
	//*  38   66:icmpne          78
			codedoutputstream.writeEnum(4, label_);
	//   39   69:aload_1         
	//   40   70:iconst_4        
	//   41   71:aload_0         
	//   42   72:getfield        #92  <Field int label_>
	//   43   75:invokevirtual   #476 <Method void CodedOutputStream.writeEnum(int, int)>
		if((bitField0_ & 8) == 8)
	//*  44   78:aload_0         
	//*  45   79:getfield        #134 <Field int bitField0_>
	//*  46   82:bipush          8
	//*  47   84:iand            
	//*  48   85:bipush          8
	//*  49   87:icmpne          99
			codedoutputstream.writeEnum(5, type_);
	//   50   90:aload_1         
	//   51   91:iconst_5        
	//   52   92:aload_0         
	//   53   93:getfield        #94  <Field int type_>
	//   54   96:invokevirtual   #476 <Method void CodedOutputStream.writeEnum(int, int)>
		if((bitField0_ & 0x10) == 16)
	//*  55   99:aload_0         
	//*  56  100:getfield        #134 <Field int bitField0_>
	//*  57  103:bipush          16
	//*  58  105:iand            
	//*  59  106:bipush          16
	//*  60  108:icmpne          121
			GeneratedMessageV3.writeString(codedoutputstream, 6, typeName_);
	//   61  111:aload_1         
	//   62  112:bipush          6
	//   63  114:aload_0         
	//   64  115:getfield        #96  <Field Object typeName_>
	//   65  118:invokestatic    #469 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x40) == 64)
	//*  66  121:aload_0         
	//*  67  122:getfield        #134 <Field int bitField0_>
	//*  68  125:bipush          64
	//*  69  127:iand            
	//*  70  128:bipush          64
	//*  71  130:icmpne          143
			GeneratedMessageV3.writeString(codedoutputstream, 7, defaultValue_);
	//   72  133:aload_1         
	//   73  134:bipush          7
	//   74  136:aload_0         
	//   75  137:getfield        #100 <Field Object defaultValue_>
	//   76  140:invokestatic    #469 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 0x200) == 512)
	//*  77  143:aload_0         
	//*  78  144:getfield        #134 <Field int bitField0_>
	//*  79  147:sipush          512
	//*  80  150:iand            
	//*  81  151:sipush          512
	//*  82  154:icmpne          167
			codedoutputstream.writeMessage(8, ((MessageLite) (getOptions())));
	//   83  157:aload_1         
	//   84  158:bipush          8
	//   85  160:aload_0         
	//   86  161:invokevirtual   #354 <Method DescriptorProtos$FieldOptions getOptions()>
	//   87  164:invokevirtual   #480 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		if((bitField0_ & 0x80) == 128)
	//*  88  167:aload_0         
	//*  89  168:getfield        #134 <Field int bitField0_>
	//*  90  171:sipush          128
	//*  91  174:iand            
	//*  92  175:sipush          128
	//*  93  178:icmpne          191
			codedoutputstream.writeInt32(9, oneofIndex_);
	//   94  181:aload_1         
	//   95  182:bipush          9
	//   96  184:aload_0         
	//   97  185:getfield        #102 <Field int oneofIndex_>
	//   98  188:invokevirtual   #473 <Method void CodedOutputStream.writeInt32(int, int)>
		if((bitField0_ & 0x100) == 256)
	//*  99  191:aload_0         
	//* 100  192:getfield        #134 <Field int bitField0_>
	//* 101  195:sipush          256
	//* 102  198:iand            
	//* 103  199:sipush          256
	//* 104  202:icmpne          215
			GeneratedMessageV3.writeString(codedoutputstream, 10, jsonName_);
	//  105  205:aload_1         
	//  106  206:bipush          10
	//  107  208:aload_0         
	//  108  209:getfield        #104 <Field Object jsonName_>
	//  109  212:invokestatic    #469 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		unknownFields.writeTo(codedoutputstream);
	//  110  215:aload_0         
	//  111  216:getfield        #184 <Field UnknownFieldSet unknownFields>
	//  112  219:aload_1         
	//  113  220:invokevirtual   #482 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//  114  223:return          
	}

	private static final DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE = new DescriptorProtos$FieldDescriptorProto();
	public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
	public static final int EXTENDEE_FIELD_NUMBER = 2;
	public static final int JSON_NAME_FIELD_NUMBER = 10;
	public static final int LABEL_FIELD_NUMBER = 4;
	public static final int NAME_FIELD_NUMBER = 1;
	public static final int NUMBER_FIELD_NUMBER = 3;
	public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
	public static final int OPTIONS_FIELD_NUMBER = 8;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.FieldDescriptorProto parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.FieldDescriptorProto(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$FieldDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$FieldDescriptorProto(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$FieldDescriptorProto parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int TYPE_FIELD_NUMBER = 5;
	public static final int TYPE_NAME_FIELD_NUMBER = 6;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private volatile Object defaultValue_;
	private volatile Object extendee_;
	private volatile Object jsonName_;
	private int label_;
	private byte memoizedIsInitialized;
	private volatile Object name_;
	private int number_;
	private int oneofIndex_;
	private DescriptorProtos.FieldOptions options_;
	private volatile Object typeName_;
	private int type_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$FieldDescriptorProto>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void DescriptorProtos$FieldDescriptorProto()>
	//    3    7:putstatic       #77  <Field DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE>
	//    4   10:new             #11  <Class DescriptorProtos$FieldDescriptorProto$1>
	//    5   13:dup             
	//    6   14:invokespecial   #78  <Method void DescriptorProtos$FieldDescriptorProto$1()>
	//    7   17:putstatic       #80  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$7400(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto)
	{
		return descriptorprotos$fielddescriptorproto.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Object name_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$7402(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, Object obj)
	{
		descriptorprotos$fielddescriptorproto.name_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field Object name_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$7502(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, int i)
	{
		descriptorprotos$fielddescriptorproto.number_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field int number_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$7602(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, int i)
	{
		descriptorprotos$fielddescriptorproto.label_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #92  <Field int label_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$7702(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, int i)
	{
		descriptorprotos$fielddescriptorproto.type_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #94  <Field int type_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Object access$7800(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto)
	{
		return descriptorprotos$fielddescriptorproto.typeName_;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Object typeName_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$7802(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, Object obj)
	{
		descriptorprotos$fielddescriptorproto.typeName_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field Object typeName_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$7900(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto)
	{
		return descriptorprotos$fielddescriptorproto.extendee_;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Object extendee_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$7902(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, Object obj)
	{
		descriptorprotos$fielddescriptorproto.extendee_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field Object extendee_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$8000(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto)
	{
		return descriptorprotos$fielddescriptorproto.defaultValue_;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Object defaultValue_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$8002(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, Object obj)
	{
		descriptorprotos$fielddescriptorproto.defaultValue_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field Object defaultValue_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$8102(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, int i)
	{
		descriptorprotos$fielddescriptorproto.oneofIndex_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #102 <Field int oneofIndex_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Object access$8200(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto)
	{
		return descriptorprotos$fielddescriptorproto.jsonName_;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Object jsonName_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$8202(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, Object obj)
	{
		descriptorprotos$fielddescriptorproto.jsonName_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field Object jsonName_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static DescriptorProtos.FieldOptions access$8302(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, DescriptorProtos.FieldOptions fieldoptions)
	{
		descriptorprotos$fielddescriptorproto.options_ = fieldoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field DescriptorProtos$FieldOptions options_>
		return fieldoptions;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$8402(DescriptorProtos$FieldDescriptorProto descriptorprotos$fielddescriptorproto, int i)
	{
		descriptorprotos$fielddescriptorproto.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #134 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$FieldDescriptorProto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #84  <Field byte memoizedIsInitialized>
		name_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #86  <String "">
	//    7   12:putfield        #88  <Field Object name_>
		number_ = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #90  <Field int number_>
		label_ = 1;
	//   11   20:aload_0         
	//   12   21:iconst_1        
	//   13   22:putfield        #92  <Field int label_>
		type_ = 1;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #94  <Field int type_>
		typeName_ = "";
	//   17   30:aload_0         
	//   18   31:ldc1            #86  <String "">
	//   19   33:putfield        #96  <Field Object typeName_>
		extendee_ = "";
	//   20   36:aload_0         
	//   21   37:ldc1            #86  <String "">
	//   22   39:putfield        #98  <Field Object extendee_>
		defaultValue_ = "";
	//   23   42:aload_0         
	//   24   43:ldc1            #86  <String "">
	//   25   45:putfield        #100 <Field Object defaultValue_>
		oneofIndex_ = 0;
	//   26   48:aload_0         
	//   27   49:iconst_0        
	//   28   50:putfield        #102 <Field int oneofIndex_>
		jsonName_ = "";
	//   29   53:aload_0         
	//   30   54:ldc1            #86  <String "">
	//   31   56:putfield        #104 <Field Object jsonName_>
	//   32   59:return          
	}

	private DescriptorProtos$FieldDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void DescriptorProtos$FieldDescriptorProto()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #111 <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #112 <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #118 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//    9   19:astore          6
		flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L18:
		if(flag) goto _L2; else goto _L1
	//   12   23:iload_3         
	//   13   24:ifne            495
_L1:
		int i = codedinputstream.readTag();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #124 <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 11: default 546
	//	               0: 549
	//	               10: 150
	//	               18: 175
	//	               24: 201
	//	               32: 222
	//	               40: 267
	//	               50: 313
	//	               58: 339
	//	               66: 365
	//	               72: 445
	//	               82: 468;
	//   18   35:lookupswitch    11: default 546
	//	               0: 549
	//	               10: 150
	//	               18: 175
	//	               24: 201
	//	               32: 222
	//	               40: 267
	//	               50: 313
	//	               58: 339
	//	               66: 365
	//	               72: 445
	//	               82: 468
		   goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L3:
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
	//*  19  132:aload_0         
	//*  20  133:aload_1         
	//*  21  134:aload           6
	//*  22  136:aload_2         
	//*  23  137:iload           4
	//*  24  139:invokevirtual   #128 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25  142:ifne            492
			flag = true;
	//   26  145:iconst_1        
	//   27  146:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28  147:goto            492
_L5:
		ByteString bytestring = codedinputstream.readBytes();
	//   29  150:aload_1         
	//   30  151:invokevirtual   #132 <Method ByteString CodedInputStream.readBytes()>
	//   31  154:astore          5
		bitField0_ = bitField0_ | 1;
	//   32  156:aload_0         
	//   33  157:aload_0         
	//   34  158:getfield        #134 <Field int bitField0_>
	//   35  161:iconst_1        
	//   36  162:ior             
	//   37  163:putfield        #134 <Field int bitField0_>
		name_ = ((Object) (bytestring));
	//   38  166:aload_0         
	//   39  167:aload           5
	//   40  169:putfield        #88  <Field Object name_>
		continue; /* Loop/switch isn't completed */
	//   41  172:goto            492
_L6:
		ByteString bytestring1 = codedinputstream.readBytes();
	//   42  175:aload_1         
	//   43  176:invokevirtual   #132 <Method ByteString CodedInputStream.readBytes()>
	//   44  179:astore          5
		bitField0_ = bitField0_ | 0x20;
	//   45  181:aload_0         
	//   46  182:aload_0         
	//   47  183:getfield        #134 <Field int bitField0_>
	//   48  186:bipush          32
	//   49  188:ior             
	//   50  189:putfield        #134 <Field int bitField0_>
		extendee_ = ((Object) (bytestring1));
	//   51  192:aload_0         
	//   52  193:aload           5
	//   53  195:putfield        #98  <Field Object extendee_>
		continue; /* Loop/switch isn't completed */
	//   54  198:goto            492
_L7:
		bitField0_ = bitField0_ | 2;
	//   55  201:aload_0         
	//   56  202:aload_0         
	//   57  203:getfield        #134 <Field int bitField0_>
	//   58  206:iconst_2        
	//   59  207:ior             
	//   60  208:putfield        #134 <Field int bitField0_>
		number_ = codedinputstream.readInt32();
	//   61  211:aload_0         
	//   62  212:aload_1         
	//   63  213:invokevirtual   #137 <Method int CodedInputStream.readInt32()>
	//   64  216:putfield        #90  <Field int number_>
		continue; /* Loop/switch isn't completed */
	//   65  219:goto            492
_L8:
		i = codedinputstream.readEnum();
	//   66  222:aload_1         
	//   67  223:invokevirtual   #140 <Method int CodedInputStream.readEnum()>
	//   68  226:istore          4
		if(Label.valueOf(i) == null)
	//*  69  228:iload           4
	//*  70  230:invokestatic    #144 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.valueOf(int)>
	//*  71  233:ifnonnull       248
		{
			builder.mergeVarintField(4, i);
	//   72  236:aload           6
	//   73  238:iconst_4        
	//   74  239:iload           4
	//   75  241:invokevirtual   #150 <Method UnknownFieldSet$Builder UnknownFieldSet$Builder.mergeVarintField(int, int)>
	//   76  244:pop             
			continue; /* Loop/switch isn't completed */
	//   77  245:goto            492
		}
		bitField0_ = bitField0_ | 4;
	//   78  248:aload_0         
	//   79  249:aload_0         
	//   80  250:getfield        #134 <Field int bitField0_>
	//   81  253:iconst_4        
	//   82  254:ior             
	//   83  255:putfield        #134 <Field int bitField0_>
		label_ = i;
	//   84  258:aload_0         
	//   85  259:iload           4
	//   86  261:putfield        #92  <Field int label_>
		continue; /* Loop/switch isn't completed */
	//   87  264:goto            492
_L9:
		i = codedinputstream.readEnum();
	//   88  267:aload_1         
	//   89  268:invokevirtual   #140 <Method int CodedInputStream.readEnum()>
	//   90  271:istore          4
		if(Type.valueOf(i) == null)
	//*  91  273:iload           4
	//*  92  275:invokestatic    #153 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.valueOf(int)>
	//*  93  278:ifnonnull       293
		{
			builder.mergeVarintField(5, i);
	//   94  281:aload           6
	//   95  283:iconst_5        
	//   96  284:iload           4
	//   97  286:invokevirtual   #150 <Method UnknownFieldSet$Builder UnknownFieldSet$Builder.mergeVarintField(int, int)>
	//   98  289:pop             
			continue; /* Loop/switch isn't completed */
	//   99  290:goto            492
		}
		bitField0_ = bitField0_ | 8;
	//  100  293:aload_0         
	//  101  294:aload_0         
	//  102  295:getfield        #134 <Field int bitField0_>
	//  103  298:bipush          8
	//  104  300:ior             
	//  105  301:putfield        #134 <Field int bitField0_>
		type_ = i;
	//  106  304:aload_0         
	//  107  305:iload           4
	//  108  307:putfield        #94  <Field int type_>
		continue; /* Loop/switch isn't completed */
	//  109  310:goto            492
_L10:
		ByteString bytestring2 = codedinputstream.readBytes();
	//  110  313:aload_1         
	//  111  314:invokevirtual   #132 <Method ByteString CodedInputStream.readBytes()>
	//  112  317:astore          5
		bitField0_ = bitField0_ | 0x10;
	//  113  319:aload_0         
	//  114  320:aload_0         
	//  115  321:getfield        #134 <Field int bitField0_>
	//  116  324:bipush          16
	//  117  326:ior             
	//  118  327:putfield        #134 <Field int bitField0_>
		typeName_ = ((Object) (bytestring2));
	//  119  330:aload_0         
	//  120  331:aload           5
	//  121  333:putfield        #96  <Field Object typeName_>
		continue; /* Loop/switch isn't completed */
	//  122  336:goto            492
_L11:
		ByteString bytestring3 = codedinputstream.readBytes();
	//  123  339:aload_1         
	//  124  340:invokevirtual   #132 <Method ByteString CodedInputStream.readBytes()>
	//  125  343:astore          5
		bitField0_ = bitField0_ | 0x40;
	//  126  345:aload_0         
	//  127  346:aload_0         
	//  128  347:getfield        #134 <Field int bitField0_>
	//  129  350:bipush          64
	//  130  352:ior             
	//  131  353:putfield        #134 <Field int bitField0_>
		defaultValue_ = ((Object) (bytestring3));
	//  132  356:aload_0         
	//  133  357:aload           5
	//  134  359:putfield        #100 <Field Object defaultValue_>
		continue; /* Loop/switch isn't completed */
	//  135  362:goto            492
_L12:
		DescriptorProtos$FieldOptions$Builder descriptorprotos$fieldoptions$builder = null;
	//  136  365:aconst_null     
	//  137  366:astore          5
		if((bitField0_ & 0x200) == 512)
	//* 138  368:aload_0         
	//* 139  369:getfield        #134 <Field int bitField0_>
	//* 140  372:sipush          512
	//* 141  375:iand            
	//* 142  376:sipush          512
	//* 143  379:icmpne          391
			descriptorprotos$fieldoptions$builder = options_.toBuilder();
	//  144  382:aload_0         
	//  145  383:getfield        #155 <Field DescriptorProtos$FieldOptions options_>
	//  146  386:invokevirtual   #161 <Method DescriptorProtos$FieldOptions$Builder DescriptorProtos$FieldOptions.toBuilder()>
	//  147  389:astore          5
		options_ = (DescriptorProtos.FieldOptions)codedinputstream.readMessage(DescriptorProtos.FieldOptions.PARSER, extensionregistrylite);
	//  148  391:aload_0         
	//  149  392:aload_1         
	//  150  393:getstatic       #162 <Field Parser DescriptorProtos$FieldOptions.PARSER>
	//  151  396:aload_2         
	//  152  397:invokevirtual   #166 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  153  400:checkcast       #157 <Class DescriptorProtos$FieldOptions>
	//  154  403:putfield        #155 <Field DescriptorProtos$FieldOptions options_>
		if(descriptorprotos$fieldoptions$builder == null) goto _L16; else goto _L15
	//  155  406:aload           5
	//  156  408:ifnull          430
_L15:
		descriptorprotos$fieldoptions$builder.mergeFrom(options_);
	//  157  411:aload           5
	//  158  413:aload_0         
	//  159  414:getfield        #155 <Field DescriptorProtos$FieldOptions options_>
	//  160  417:invokevirtual   #172 <Method DescriptorProtos$FieldOptions$Builder DescriptorProtos$FieldOptions$Builder.mergeFrom(DescriptorProtos$FieldOptions)>
	//  161  420:pop             
		options_ = descriptorprotos$fieldoptions$builder.buildPartial();
	//  162  421:aload_0         
	//  163  422:aload           5
	//  164  424:invokevirtual   #176 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldOptions$Builder.buildPartial()>
	//  165  427:putfield        #155 <Field DescriptorProtos$FieldOptions options_>
_L16:
		bitField0_ = bitField0_ | 0x200;
	//  166  430:aload_0         
	//  167  431:aload_0         
	//  168  432:getfield        #134 <Field int bitField0_>
	//  169  435:sipush          512
	//  170  438:ior             
	//  171  439:putfield        #134 <Field int bitField0_>
		continue; /* Loop/switch isn't completed */
	//  172  442:goto            492
_L13:
		bitField0_ = bitField0_ | 0x80;
	//  173  445:aload_0         
	//  174  446:aload_0         
	//  175  447:getfield        #134 <Field int bitField0_>
	//  176  450:sipush          128
	//  177  453:ior             
	//  178  454:putfield        #134 <Field int bitField0_>
		oneofIndex_ = codedinputstream.readInt32();
	//  179  457:aload_0         
	//  180  458:aload_1         
	//  181  459:invokevirtual   #137 <Method int CodedInputStream.readInt32()>
	//  182  462:putfield        #102 <Field int oneofIndex_>
		continue; /* Loop/switch isn't completed */
	//  183  465:goto            492
_L14:
		ByteString bytestring4 = codedinputstream.readBytes();
	//  184  468:aload_1         
	//  185  469:invokevirtual   #132 <Method ByteString CodedInputStream.readBytes()>
	//  186  472:astore          5
		bitField0_ = bitField0_ | 0x100;
	//  187  474:aload_0         
	//  188  475:aload_0         
	//  189  476:getfield        #134 <Field int bitField0_>
	//  190  479:sipush          256
	//  191  482:ior             
	//  192  483:putfield        #134 <Field int bitField0_>
		jsonName_ = ((Object) (bytestring4));
	//  193  486:aload_0         
	//  194  487:aload           5
	//  195  489:putfield        #104 <Field Object jsonName_>
		continue; /* Loop/switch isn't completed */
	//  196  492:goto            23
_L2:
		unknownFields = builder.build();
	//  197  495:aload_0         
	//  198  496:aload           6
	//  199  498:invokevirtual   #180 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  200  501:putfield        #184 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  201  504:aload_0         
	//  202  505:invokevirtual   #187 <Method void makeExtensionsImmutable()>
		return;
	//  203  508:return          
		codedinputstream;
	//  204  509:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  205  510:aload_1         
	//  206  511:aload_0         
	//  207  512:invokevirtual   #191 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  208  515:athrow          
		codedinputstream;
	//  209  516:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  210  517:new             #107 <Class InvalidProtocolBufferException>
	//  211  520:dup             
	//  212  521:aload_1         
	//  213  522:invokespecial   #194 <Method void InvalidProtocolBufferException(IOException)>
	//  214  525:aload_0         
	//  215  526:invokevirtual   #191 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  216  529:athrow          
		codedinputstream;
	//  217  530:astore_1        
		unknownFields = builder.build();
	//  218  531:aload_0         
	//  219  532:aload           6
	//  220  534:invokevirtual   #180 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  221  537:putfield        #184 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  222  540:aload_0         
	//  223  541:invokevirtual   #187 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  224  544:aload_1         
	//  225  545:athrow          
	//* 226  546:goto            132
_L4:
		flag = true;
	//  227  549:iconst_1        
	//  228  550:istore_3        
		if(true) goto _L18; else goto _L17
	//  229  551:goto            492
_L17:
	}

	DescriptorProtos$FieldDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #198 <Method void DescriptorProtos$FieldDescriptorProto(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$FieldDescriptorProto(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #84  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$FieldDescriptorProto(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #205 <Method void DescriptorProtos$FieldDescriptorProto(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
