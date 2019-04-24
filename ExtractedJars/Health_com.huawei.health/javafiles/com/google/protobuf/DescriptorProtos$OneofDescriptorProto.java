// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DescriptorProtos, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, Parser, ByteString, CodedOutputStream, 
//			ExtensionRegistryLite, Message, MessageLite, SingleFieldBuilderV3, 
//			AbstractParser

public static final class DescriptorProtos$OneofDescriptorProto extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.OneofDescriptorProtoOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$8600();
		//    0    0:invokestatic    #48  <Method Descriptors$Descriptor DescriptorProtos.access$8600()>
		//    1    3:areturn         
		}

		private SingleFieldBuilderV3 getOptionsFieldBuilder()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       35
			{
				optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//    3    7:aload_0         
		//    4    8:new             #54  <Class SingleFieldBuilderV3>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokevirtual   #58  <Method DescriptorProtos$OneofOptions getOptions()>
		//    8   16:aload_0         
		//    9   17:invokevirtual   #62  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   10   20:aload_0         
		//   11   21:invokevirtual   #66  <Method boolean isClean()>
		//   12   24:invokespecial   #69  <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
		//   13   27:putfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
				options_ = null;
		//   14   30:aload_0         
		//   15   31:aconst_null     
		//   16   32:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
			}
			return optionsBuilder_;
		//   17   35:aload_0         
		//   18   36:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   19   39:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #77  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            11
				getOptionsFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #79  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//    4   10:pop             
		//    5   11:return          
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #84  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #86  <Method DescriptorProtos$OneofDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #86  <Method DescriptorProtos$OneofDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public DescriptorProtos.OneofDescriptorProto build()
		{
			DescriptorProtos.OneofDescriptorProto oneofdescriptorproto = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #92  <Method DescriptorProtos$OneofDescriptorProto buildPartial()>
		//    2    4:astore_1        
			if(!oneofdescriptorproto.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #95  <Method boolean DescriptorProtos$OneofDescriptorProto.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (oneofdescriptorproto)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #99  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return oneofdescriptorproto;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #102 <Method DescriptorProtos$OneofDescriptorProto build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #102 <Method DescriptorProtos$OneofDescriptorProto build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.OneofDescriptorProto buildPartial()
		{
			DescriptorProtos.OneofDescriptorProto oneofdescriptorproto = new DescriptorProtos.OneofDescriptorProto(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #9   <Class DescriptorProtos$OneofDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #106 <Method void DescriptorProtos$OneofDescriptorProto(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #108 <Field int bitField0_>
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
			oneofdescriptorproto.name_ = name_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #30  <Field Object name_>
		//   21   33:invokestatic    #112 <Method Object DescriptorProtos$OneofDescriptorProto.access$9102(DescriptorProtos$OneofDescriptorProto, Object)>
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
			if(optionsBuilder_ == null)
		//*  34   50:aload_0         
		//*  35   51:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  36   54:ifnonnull       70
				oneofdescriptorproto.options_ = options_;
		//   37   57:aload           4
		//   38   59:aload_0         
		//   39   60:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
		//   40   63:invokestatic    #116 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofDescriptorProto.access$9202(DescriptorProtos$OneofDescriptorProto, DescriptorProtos$OneofOptions)>
		//   41   66:pop             
			else
		//*  42   67:goto            86
				oneofdescriptorproto.options_ = (DescriptorProtos.OneofOptions)optionsBuilder_.build();
		//   43   70:aload           4
		//   44   72:aload_0         
		//   45   73:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   46   76:invokevirtual   #119 <Method AbstractMessage SingleFieldBuilderV3.build()>
		//   47   79:checkcast       #121 <Class DescriptorProtos$OneofOptions>
		//   48   82:invokestatic    #116 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofDescriptorProto.access$9202(DescriptorProtos$OneofDescriptorProto, DescriptorProtos$OneofOptions)>
		//   49   85:pop             
			oneofdescriptorproto.bitField0_ = j;
		//   50   86:aload           4
		//   51   88:iload_2         
		//   52   89:invokestatic    #125 <Method int DescriptorProtos$OneofDescriptorProto.access$9302(DescriptorProtos$OneofDescriptorProto, int)>
		//   53   92:pop             
			onBuilt();
		//   54   93:aload_0         
		//   55   94:invokevirtual   #128 <Method void onBuilt()>
			return oneofdescriptorproto;
		//   56   97:aload           4
		//   57   99:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #92  <Method DescriptorProtos$OneofDescriptorProto buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #92  <Method DescriptorProtos$OneofDescriptorProto buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #133 <Method DescriptorProtos$OneofDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #136 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			name_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #28  <String "">
		//    5    8:putfield        #30  <Field Object name_>
			bitField0_ = bitField0_ & -2;
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:getfield        #108 <Field int bitField0_>
		//    9   16:bipush          -2
		//   10   18:iand            
		//   11   19:putfield        #108 <Field int bitField0_>
			if(optionsBuilder_ == null)
		//*  12   22:aload_0         
		//*  13   23:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  14   26:ifnonnull       37
				options_ = null;
		//   15   29:aload_0         
		//   16   30:aconst_null     
		//   17   31:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
			else
		//*  18   34:goto            45
				optionsBuilder_.clear();
		//   19   37:aload_0         
		//   20   38:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   21   41:invokevirtual   #138 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   22   44:pop             
			bitField0_ = bitField0_ & -3;
		//   23   45:aload_0         
		//   24   46:aload_0         
		//   25   47:getfield        #108 <Field int bitField0_>
		//   26   50:bipush          -3
		//   27   52:iand            
		//   28   53:putfield        #108 <Field int bitField0_>
			return this;
		//   29   56:aload_0         
		//   30   57:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #133 <Method DescriptorProtos$OneofDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #133 <Method DescriptorProtos$OneofDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #133 <Method DescriptorProtos$OneofDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #145 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #147 <Method DescriptorProtos$OneofDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #147 <Method DescriptorProtos$OneofDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearName()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #108 <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #108 <Field int bitField0_>
			name_ = ((Object) (DescriptorProtos.OneofDescriptorProto.getDefaultInstance().getName()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #152 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
		//    8   15:invokevirtual   #156 <Method String DescriptorProtos$OneofDescriptorProto.getName()>
		//    9   18:putfield        #30  <Field Object name_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #159 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #164 <Method DescriptorProtos$OneofDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #167 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #164 <Method DescriptorProtos$OneofDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #164 <Method DescriptorProtos$OneofDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       19
			{
				options_ = null;
		//    3    7:aload_0         
		//    4    8:aconst_null     
		//    5    9:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
				onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #159 <Method void onChanged()>
			} else
		//*   8   16:goto            27
			{
				optionsBuilder_.clear();
		//    9   19:aload_0         
		//   10   20:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   11   23:invokevirtual   #138 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   12   26:pop             
			}
			bitField0_ = bitField0_ & -3;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #108 <Field int bitField0_>
		//   16   32:bipush          -3
		//   17   34:iand            
		//   18   35:putfield        #108 <Field int bitField0_>
			return this;
		//   19   38:aload_0         
		//   20   39:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #175 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #172 <Method DescriptorProtos$OneofDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.OneofDescriptorProto getDefaultInstanceForType()
		{
			return DescriptorProtos.OneofDescriptorProto.getDefaultInstance();
		//    0    0:invokestatic    #152 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #182 <Method DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #182 <Method DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$8600();
		//    0    0:invokestatic    #48  <Method Descriptors$Descriptor DescriptorProtos.access$8600()>
		//    1    3:areturn         
		}

		public String getName()
		{
			Object obj = name_;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Object name_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #185 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #187 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #190 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #193 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					name_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #30  <Field Object name_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #185 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getNameBytes()
		{
			Object obj = name_;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Object name_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #185 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #185 <Class String>
		//    8   16:invokestatic    #199 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				name_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #30  <Field Object name_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #187 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public DescriptorProtos.OneofOptions getOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       23
			{
				if(options_ == null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
		//*   5   11:ifnonnull       18
					return DescriptorProtos.OneofOptions.getDefaultInstance();
		//    6   14:invokestatic    #201 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
		//    7   17:areturn         
				else
					return options_;
		//    8   18:aload_0         
		//    9   19:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
		//   10   22:areturn         
			} else
			{
				return (DescriptorProtos.OneofOptions)optionsBuilder_.getMessage();
		//   11   23:aload_0         
		//   12   24:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   13   27:invokevirtual   #204 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
		//   14   30:checkcast       #121 <Class DescriptorProtos$OneofOptions>
		//   15   33:areturn         
			}
		}

		public DescriptorProtos.OneofOptions.Builder getOptionsBuilder()
		{
			bitField0_ = bitField0_ | 2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #108 <Field int bitField0_>
		//    3    5:iconst_2        
		//    4    6:ior             
		//    5    7:putfield        #108 <Field int bitField0_>
			onChanged();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #159 <Method void onChanged()>
			return (DescriptorProtos.OneofOptions.Builder)getOptionsFieldBuilder().getBuilder();
		//    8   14:aload_0         
		//    9   15:invokespecial   #79  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//   10   18:invokevirtual   #209 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
		//   11   21:checkcast       #211 <Class DescriptorProtos$OneofOptions$Builder>
		//   12   24:areturn         
		}

		public DescriptorProtos.OneofOptionsOrBuilder getOptionsOrBuilder()
		{
			if(optionsBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnull          18
				return (DescriptorProtos.OneofOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
		//    3    7:aload_0         
		//    4    8:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//    5   11:invokevirtual   #217 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
		//    6   14:checkcast       #219 <Class DescriptorProtos$OneofOptionsOrBuilder>
		//    7   17:areturn         
			if(options_ == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
		//*  10   22:ifnonnull       29
				return ((DescriptorProtos.OneofOptionsOrBuilder) (DescriptorProtos.OneofOptions.getDefaultInstance()));
		//   11   25:invokestatic    #201 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
		//   12   28:areturn         
			else
				return ((DescriptorProtos.OneofOptionsOrBuilder) (options_));
		//   13   29:aload_0         
		//   14   30:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
		//   15   33:areturn         
		}

		public boolean hasName()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #108 <Field int bitField0_>
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
		//    1    1:getfield        #108 <Field int bitField0_>
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
			return DescriptorProtos.access$8700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$OneofDescriptorProto, com/google/protobuf/DescriptorProtos$OneofDescriptorProto$Builder);
		//    0    0:invokestatic    #226 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$8700()>
		//    1    3:ldc1            #9   <Class DescriptorProtos$OneofDescriptorProto>
		//    2    5:ldc1            #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    3    7:invokevirtual   #232 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			return !hasOptions() || getOptions().isInitialized();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #234 <Method boolean hasOptions()>
		//    2    4:ifeq            19
		//    3    7:aload_0         
		//    4    8:invokevirtual   #58  <Method DescriptorProtos$OneofOptions getOptions()>
		//    5   11:invokevirtual   #235 <Method boolean DescriptorProtos$OneofOptions.isInitialized()>
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
		//    3    3:invokevirtual   #242 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #246 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #242 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.OneofDescriptorProto)DescriptorProtos.OneofDescriptorProto.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #253 <Field Parser DescriptorProtos$OneofDescriptorProto.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #259 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class DescriptorProtos$OneofDescriptorProto>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.OneofDescriptorProto) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #262 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(DescriptorProtos$OneofDescriptorProto)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #265 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class DescriptorProtos$OneofDescriptorProto>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #269 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #262 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(DescriptorProtos$OneofDescriptorProto)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.OneofDescriptorProto)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.OneofDescriptorProto) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
		{
			if(oneofdescriptorproto == DescriptorProtos.OneofDescriptorProto.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #152 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(oneofdescriptorproto.hasName())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #271 <Method boolean DescriptorProtos$OneofDescriptorProto.hasName()>
		//*   7   13:ifeq            38
			{
				bitField0_ = bitField0_ | 1;
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #108 <Field int bitField0_>
		//   11   21:iconst_1        
		//   12   22:ior             
		//   13   23:putfield        #108 <Field int bitField0_>
				name_ = oneofdescriptorproto.name_;
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokestatic    #275 <Method Object DescriptorProtos$OneofDescriptorProto.access$9100(DescriptorProtos$OneofDescriptorProto)>
		//   17   31:putfield        #30  <Field Object name_>
				onChanged();
		//   18   34:aload_0         
		//   19   35:invokevirtual   #159 <Method void onChanged()>
			}
			if(oneofdescriptorproto.hasOptions())
		//*  20   38:aload_1         
		//*  21   39:invokevirtual   #276 <Method boolean DescriptorProtos$OneofDescriptorProto.hasOptions()>
		//*  22   42:ifeq            54
				mergeOptions(oneofdescriptorproto.getOptions());
		//   23   45:aload_0         
		//   24   46:aload_1         
		//   25   47:invokevirtual   #277 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofDescriptorProto.getOptions()>
		//   26   50:invokevirtual   #281 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeOptions(DescriptorProtos$OneofOptions)>
		//   27   53:pop             
			mergeUnknownFields(oneofdescriptorproto.unknownFields);
		//   28   54:aload_0         
		//   29   55:aload_1         
		//   30   56:getfield        #285 <Field UnknownFieldSet DescriptorProtos$OneofDescriptorProto.unknownFields>
		//   31   59:invokevirtual   #289 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//   32   62:pop             
			onChanged();
		//   33   63:aload_0         
		//   34   64:invokevirtual   #159 <Method void onChanged()>
			return this;
		//   35   67:aload_0         
		//   36   68:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.OneofDescriptorProto)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class DescriptorProtos$OneofDescriptorProto>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.OneofDescriptorProto)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class DescriptorProtos$OneofDescriptorProto>
		//    6   12:invokevirtual   #262 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(DescriptorProtos$OneofDescriptorProto)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #291 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #242 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #246 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #242 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeOptions(DescriptorProtos.OneofOptions oneofoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       67
			{
				if((bitField0_ & 2) == 2 && options_ != null && options_ != DescriptorProtos.OneofOptions.getDefaultInstance())
		//*   3    7:aload_0         
		//*   4    8:getfield        #108 <Field int bitField0_>
		//*   5   11:iconst_2        
		//*   6   12:iand            
		//*   7   13:iconst_2        
		//*   8   14:icmpne          55
		//*   9   17:aload_0         
		//*  10   18:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
		//*  11   21:ifnull          55
		//*  12   24:aload_0         
		//*  13   25:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
		//*  14   28:invokestatic    #201 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
		//*  15   31:if_acmpeq       55
					options_ = DescriptorProtos.OneofOptions.newBuilder(options_).mergeFrom(oneofoptions).buildPartial();
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #32  <Field DescriptorProtos$OneofOptions options_>
		//   19   39:invokestatic    #298 <Method DescriptorProtos$OneofOptions$Builder DescriptorProtos$OneofOptions.newBuilder(DescriptorProtos$OneofOptions)>
		//   20   42:aload_1         
		//   21   43:invokevirtual   #300 <Method DescriptorProtos$OneofOptions$Builder DescriptorProtos$OneofOptions$Builder.mergeFrom(DescriptorProtos$OneofOptions)>
		//   22   46:invokevirtual   #302 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions$Builder.buildPartial()>
		//   23   49:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
				else
		//*  24   52:goto            60
					options_ = oneofoptions;
		//   25   55:aload_0         
		//   26   56:aload_1         
		//   27   57:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
				onChanged();
		//   28   60:aload_0         
		//   29   61:invokevirtual   #159 <Method void onChanged()>
			} else
		//*  30   64:goto            76
			{
				optionsBuilder_.mergeFrom(((AbstractMessage) (oneofoptions)));
		//   31   67:aload_0         
		//   32   68:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   33   71:aload_1         
		//   34   72:invokevirtual   #305 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
		//   35   75:pop             
			}
			bitField0_ = bitField0_ | 2;
		//   36   76:aload_0         
		//   37   77:aload_0         
		//   38   78:getfield        #108 <Field int bitField0_>
		//   39   81:iconst_2        
		//   40   82:ior             
		//   41   83:putfield        #108 <Field int bitField0_>
			return this;
		//   42   86:aload_0         
		//   43   87:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #289 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #309 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #289 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #289 <Method DescriptorProtos$OneofDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #313 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #315 <Method DescriptorProtos$OneofDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #315 <Method DescriptorProtos$OneofDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setName(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #319 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #320 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #108 <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #108 <Field int bitField0_>
				name_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #30  <Field Object name_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #159 <Method void onChanged()>
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
		//    2    4:new             #319 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #320 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #108 <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #108 <Field int bitField0_>
				name_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #30  <Field Object name_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #159 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setOptions(DescriptorProtos.OneofOptions.Builder builder)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       22
			{
				options_ = builder.build();
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #326 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions$Builder.build()>
		//    6   12:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
				onChanged();
		//    7   15:aload_0         
		//    8   16:invokevirtual   #159 <Method void onChanged()>
			} else
		//*   9   19:goto            34
			{
				optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
		//   10   22:aload_0         
		//   11   23:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #326 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions$Builder.build()>
		//   14   30:invokevirtual   #329 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   15   33:pop             
			}
			bitField0_ = bitField0_ | 2;
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #108 <Field int bitField0_>
		//   19   39:iconst_2        
		//   20   40:ior             
		//   21   41:putfield        #108 <Field int bitField0_>
			return this;
		//   22   44:aload_0         
		//   23   45:areturn         
		}

		public Builder setOptions(DescriptorProtos.OneofOptions oneofoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       31
			{
				if(oneofoptions == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
					throw new NullPointerException();
		//    5   11:new             #319 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #320 <Method void NullPointerException()>
		//    8   18:athrow          
				options_ = oneofoptions;
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
				onChanged();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #159 <Method void onChanged()>
			} else
		//*  14   28:goto            40
			{
				optionsBuilder_.setMessage(((AbstractMessage) (oneofoptions)));
		//   15   31:aload_0         
		//   16   32:getfield        #52  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #329 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   19   39:pop             
			}
			bitField0_ = bitField0_ | 2;
		//   20   40:aload_0         
		//   21   41:aload_0         
		//   22   42:getfield        #108 <Field int bitField0_>
		//   23   45:iconst_2        
		//   24   46:ior             
		//   25   47:putfield        #108 <Field int bitField0_>
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
		//    4    4:invokespecial   #334 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #336 <Method DescriptorProtos$OneofDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #336 <Method DescriptorProtos$OneofDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #340 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #342 <Method DescriptorProtos$OneofDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #342 <Method DescriptorProtos$OneofDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private Object name_;
		private SingleFieldBuilderV3 optionsBuilder_;
		private DescriptorProtos.OneofOptions options_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void GeneratedMessageV3$Builder()>
			name_ = "";
		//    2    4:aload_0         
		//    3    5:ldc1            #28  <String "">
		//    4    7:putfield        #30  <Field Object name_>
			options_ = null;
		//    5   10:aload_0         
		//    6   11:aconst_null     
		//    7   12:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
			maybeForceBuilderInitialization();
		//    8   15:aload_0         
		//    9   16:invokespecial   #35  <Method void maybeForceBuilderInitialization()>
		//   10   19:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void DescriptorProtos$OneofDescriptorProto$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			name_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #28  <String "">
		//    5    8:putfield        #30  <Field Object name_>
			options_ = null;
		//    6   11:aload_0         
		//    7   12:aconst_null     
		//    8   13:putfield        #32  <Field DescriptorProtos$OneofOptions options_>
			maybeForceBuilderInitialization();
		//    9   16:aload_0         
		//   10   17:invokespecial   #35  <Method void maybeForceBuilderInitialization()>
		//   11   20:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #43  <Method void DescriptorProtos$OneofDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$OneofDescriptorProto getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #43  <Field DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$8600();
	//    0    0:invokestatic    #153 <Method Descriptors$Descriptor DescriptorProtos.access$8600()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #43  <Field DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #156 <Method DescriptorProtos$OneofDescriptorProto$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$OneofDescriptorProto descriptorprotos$oneofdescriptorproto)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$oneofdescriptorproto);
	//    0    0:getstatic       #43  <Field DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #156 <Method DescriptorProtos$OneofDescriptorProto$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #159 <Method DescriptorProtos$OneofDescriptorProto$Builder DescriptorProtos$OneofDescriptorProto$Builder.mergeFrom(DescriptorProtos$OneofDescriptorProto)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #165 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #169 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofDescriptorProto)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #176 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofDescriptorProto)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #180 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #185 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #189 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #191 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$OneofDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #193 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofDescriptorProto)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #197 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofDescriptorProto)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #201 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofDescriptorProto)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #205 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$OneofDescriptorProto parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$OneofDescriptorProto)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #209 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #46  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$OneofDescriptorProto))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$OneofDescriptorProto>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #216 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$OneofDescriptorProto)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$OneofDescriptorProto>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasName() == ((DescriptorProtos$OneofDescriptorProto) (obj)).hasName())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #220 <Method boolean hasName()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #220 <Method boolean hasName()>
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
	//*  30   50:invokevirtual   #220 <Method boolean hasName()>
	//*  31   53:ifeq            81
			if(flag && getName().equals(((Object) (((DescriptorProtos$OneofDescriptorProto) (obj)).getName()))))
	//*  32   56:iload_2         
	//*  33   57:ifeq            79
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #224 <Method String getName()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #224 <Method String getName()>
	//*  38   68:invokevirtual   #227 <Method boolean String.equals(Object)>
	//*  39   71:ifeq            79
				flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
			else
	//*  42   76:goto            81
				flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if(flag1 && hasOptions() == ((DescriptorProtos$OneofDescriptorProto) (obj)).hasOptions())
	//*  45   81:iload_3         
	//*  46   82:ifeq            101
	//*  47   85:aload_0         
	//*  48   86:invokevirtual   #230 <Method boolean hasOptions()>
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #230 <Method boolean hasOptions()>
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
		if(hasOptions())
	//*  59  105:aload_0         
	//*  60  106:invokevirtual   #230 <Method boolean hasOptions()>
	//*  61  109:ifeq            137
			if(flag && getOptions().equals(((Object) (((DescriptorProtos$OneofDescriptorProto) (obj)).getOptions()))))
	//*  62  112:iload_2         
	//*  63  113:ifeq            135
	//*  64  116:aload_0         
	//*  65  117:invokevirtual   #233 <Method DescriptorProtos$OneofOptions getOptions()>
	//*  66  120:aload_1         
	//*  67  121:invokevirtual   #233 <Method DescriptorProtos$OneofOptions getOptions()>
	//*  68  124:invokevirtual   #234 <Method boolean DescriptorProtos$OneofOptions.equals(Object)>
	//*  69  127:ifeq            135
				flag1 = true;
	//   70  130:iconst_1        
	//   71  131:istore_3        
			else
	//*  72  132:goto            137
				flag1 = false;
	//   73  135:iconst_0        
	//   74  136:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$OneofDescriptorProto) (obj)).unknownFields)));
	//   75  137:iload_3         
	//   76  138:ifeq            157
	//   77  141:aload_0         
	//   78  142:getfield        #117 <Field UnknownFieldSet unknownFields>
	//   79  145:aload_1         
	//   80  146:getfield        #117 <Field UnknownFieldSet unknownFields>
	//   81  149:invokevirtual   #235 <Method boolean UnknownFieldSet.equals(Object)>
	//   82  152:ifeq            157
	//   83  155:iconst_1        
	//   84  156:ireturn         
	//   85  157:iconst_0        
	//   86  158:ireturn         
	}

	public DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #43  <Field DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method DescriptorProtos$OneofDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #226 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #226 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #242 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #245 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #248 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			name_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #54  <Field Object name_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #226 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #226 <Class String>
	//    8   16:invokestatic    #253 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #54  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #242 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.OneofOptions getOptions()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field DescriptorProtos$OneofOptions options_>
	//*   2    4:ifnonnull       11
			return DescriptorProtos.OneofOptions.getDefaultInstance();
	//    3    7:invokestatic    #255 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return options_;
	//    5   11:aload_0         
	//    6   12:getfield        #86  <Field DescriptorProtos$OneofOptions options_>
	//    7   15:areturn         
	}

	public  getOptionsOrBuilder()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field DescriptorProtos$OneofOptions options_>
	//*   2    4:ifnonnull       11
			return (() (DescriptorProtos.OneofOptions.getDefaultInstance()));
	//    3    7:invokestatic    #255 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return (() (options_));
	//    5   11:aload_0         
	//    6   12:getfield        #86  <Field DescriptorProtos$OneofOptions options_>
	//    7   15:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #46  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field int memoizedSize>
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
	//*  11   15:getfield        #84  <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			i = GeneratedMessageV3.computeStringSize(1, name_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #54  <Field Object name_>
	//   19   29:invokestatic    #266 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_1        
		int j = i;
	//   23   35:iload_1         
	//   24   36:istore_2        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #84  <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          58
			j = i + CodedOutputStream.computeMessageSize(2, ((MessageLite) (getOptions())));
	//   31   47:iload_1         
	//   32   48:iconst_2        
	//   33   49:aload_0         
	//   34   50:invokevirtual   #233 <Method DescriptorProtos$OneofOptions getOptions()>
	//   35   53:invokestatic    #272 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   36   56:iadd            
	//   37   57:istore_2        
		i = j + unknownFields.getSerializedSize();
	//   38   58:iload_2         
	//   39   59:aload_0         
	//   40   60:getfield        #117 <Field UnknownFieldSet unknownFields>
	//   41   63:invokevirtual   #274 <Method int UnknownFieldSet.getSerializedSize()>
	//   42   66:iadd            
	//   43   67:istore_1        
		memoizedSize = i;
	//   44   68:aload_0         
	//   45   69:iload_1         
	//   46   70:putfield        #262 <Field int memoizedSize>
		return i;
	//   47   73:iload_1         
	//   48   74:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int bitField0_>
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
	//    1    1:getfield        #84  <Field int bitField0_>
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
	//*   1    1:getfield        #279 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #279 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #281 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #285 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasName())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #220 <Method boolean hasName()>
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
	//   24   42:invokevirtual   #224 <Method String getName()>
	//   25   45:invokevirtual   #286 <Method int String.hashCode()>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(hasOptions())
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #230 <Method boolean hasOptions()>
	//*  32   56:ifeq            77
			j = (i * 37 + 2) * 53 + getOptions().hashCode();
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_2        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #233 <Method DescriptorProtos$OneofOptions getOptions()>
	//   42   72:invokevirtual   #287 <Method int DescriptorProtos$OneofOptions.hashCode()>
	//   43   75:iadd            
	//   44   76:istore_2        
		i = j * 29 + unknownFields.hashCode();
	//   45   77:iload_2         
	//   46   78:bipush          29
	//   47   80:imul            
	//   48   81:aload_0         
	//   49   82:getfield        #117 <Field UnknownFieldSet unknownFields>
	//   50   85:invokevirtual   #288 <Method int UnknownFieldSet.hashCode()>
	//   51   88:iadd            
	//   52   89:istore_1        
		memoizedHashCode = i;
	//   53   90:aload_0         
	//   54   91:iload_1         
	//   55   92:putfield        #279 <Field int memoizedHashCode>
		return i;
	//   56   95:iload_1         
	//   57   96:ireturn         
	}

	protected GeneratedMessageV3$FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$8700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$OneofDescriptorProto, com/google/protobuf/DescriptorProtos$OneofDescriptorProto$Builder);
	//    0    0:invokestatic    #293 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$8700()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    2    5:ldc1            #13  <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    3    7:invokevirtual   #299 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field byte memoizedIsInitialized>
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
	//*  13   19:invokevirtual   #230 <Method boolean hasOptions()>
	//*  14   22:ifeq            42
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #233 <Method DescriptorProtos$OneofOptions getOptions()>
	//*  17   29:invokevirtual   #302 <Method boolean DescriptorProtos$OneofOptions.isInitialized()>
	//*  18   32:ifne            42
		{
			memoizedIsInitialized = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #50  <Field byte memoizedIsInitialized>
			return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   24   42:aload_0         
	//   25   43:iconst_1        
	//   26   44:putfield        #50  <Field byte memoizedIsInitialized>
			return true;
	//   27   47:iconst_1        
	//   28   48:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #305 <Method DescriptorProtos$OneofDescriptorProto$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #13  <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #309 <Method void DescriptorProtos$OneofDescriptorProto$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #312 <Method DescriptorProtos$OneofDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #315 <Method DescriptorProtos$OneofDescriptorProto$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #312 <Method DescriptorProtos$OneofDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #43  <Field DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #13  <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #319 <Method void DescriptorProtos$OneofDescriptorProto$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #13  <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #319 <Method void DescriptorProtos$OneofDescriptorProto$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #159 <Method DescriptorProtos$OneofDescriptorProto$Builder DescriptorProtos$OneofDescriptorProto$Builder.mergeFrom(DescriptorProtos$OneofDescriptorProto)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method DescriptorProtos$OneofDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method DescriptorProtos$OneofDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			GeneratedMessageV3.writeString(codedoutputstream, 1, name_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #54  <Field Object name_>
	//   10   16:invokestatic    #325 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 2) == 2)
	//*  11   19:aload_0         
	//*  12   20:getfield        #84  <Field int bitField0_>
	//*  13   23:iconst_2        
	//*  14   24:iand            
	//*  15   25:iconst_2        
	//*  16   26:icmpne          38
			codedoutputstream.writeMessage(2, ((MessageLite) (getOptions())));
	//   17   29:aload_1         
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:invokevirtual   #233 <Method DescriptorProtos$OneofOptions getOptions()>
	//   21   35:invokevirtual   #329 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		unknownFields.writeTo(codedoutputstream);
	//   22   38:aload_0         
	//   23   39:getfield        #117 <Field UnknownFieldSet unknownFields>
	//   24   42:aload_1         
	//   25   43:invokevirtual   #331 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   26   46:return          
	}

	private static final DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE = new DescriptorProtos$OneofDescriptorProto();
	public static final int NAME_FIELD_NUMBER = 1;
	public static final int OPTIONS_FIELD_NUMBER = 2;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.OneofDescriptorProto parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.OneofDescriptorProto(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$OneofDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$OneofDescriptorProto(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$OneofDescriptorProto parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private byte memoizedIsInitialized;
	private volatile Object name_;
	private DescriptorProtos.OneofOptions options_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$OneofDescriptorProto>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void DescriptorProtos$OneofDescriptorProto()>
	//    3    7:putstatic       #43  <Field DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE>
	//    4   10:new             #11  <Class DescriptorProtos$OneofDescriptorProto$1>
	//    5   13:dup             
	//    6   14:invokespecial   #44  <Method void DescriptorProtos$OneofDescriptorProto$1()>
	//    7   17:putstatic       #46  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$9100(DescriptorProtos$OneofDescriptorProto descriptorprotos$oneofdescriptorproto)
	{
		return descriptorprotos$oneofdescriptorproto.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Object name_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$9102(DescriptorProtos$OneofDescriptorProto descriptorprotos$oneofdescriptorproto, Object obj)
	{
		descriptorprotos$oneofdescriptorproto.name_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field Object name_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static DescriptorProtos.OneofOptions access$9202(DescriptorProtos$OneofDescriptorProto descriptorprotos$oneofdescriptorproto, DescriptorProtos.OneofOptions oneofoptions)
	{
		descriptorprotos$oneofdescriptorproto.options_ = oneofoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field DescriptorProtos$OneofOptions options_>
		return oneofoptions;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$9302(DescriptorProtos$OneofDescriptorProto descriptorprotos$oneofdescriptorproto, int i)
	{
		descriptorprotos$oneofdescriptorproto.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$OneofDescriptorProto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #50  <Field byte memoizedIsInitialized>
		name_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #52  <String "">
	//    7   12:putfield        #54  <Field Object name_>
	//    8   15:return          
	}

	private DescriptorProtos$OneofDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void DescriptorProtos$OneofDescriptorProto()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #61  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #62  <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #68  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//    9   19:astore          6
		flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L10:
		if(flag) goto _L2; else goto _L1
	//   12   23:iload_3         
	//   13   24:ifne            185
_L1:
		int i = codedinputstream.readTag();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #74  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 3: default 236
	//	               0: 239
	//	               10: 86
	//	               18: 111;
	//   18   35:lookupswitch    3: default 236
	//	               0: 239
	//	               10: 86
	//	               18: 111
		   goto _L3 _L4 _L5 _L6
_L3:
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
	//*  19   68:aload_0         
	//*  20   69:aload_1         
	//*  21   70:aload           6
	//*  22   72:aload_2         
	//*  23   73:iload           4
	//*  24   75:invokevirtual   #78  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25   78:ifne            182
			flag = true;
	//   26   81:iconst_1        
	//   27   82:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28   83:goto            182
_L5:
		ByteString bytestring = codedinputstream.readBytes();
	//   29   86:aload_1         
	//   30   87:invokevirtual   #82  <Method ByteString CodedInputStream.readBytes()>
	//   31   90:astore          5
		bitField0_ = bitField0_ | 1;
	//   32   92:aload_0         
	//   33   93:aload_0         
	//   34   94:getfield        #84  <Field int bitField0_>
	//   35   97:iconst_1        
	//   36   98:ior             
	//   37   99:putfield        #84  <Field int bitField0_>
		name_ = ((Object) (bytestring));
	//   38  102:aload_0         
	//   39  103:aload           5
	//   40  105:putfield        #54  <Field Object name_>
		continue; /* Loop/switch isn't completed */
	//   41  108:goto            182
_L6:
		DescriptorProtos$OneofOptions$Builder descriptorprotos$oneofoptions$builder = null;
	//   42  111:aconst_null     
	//   43  112:astore          5
		if((bitField0_ & 2) == 2)
	//*  44  114:aload_0         
	//*  45  115:getfield        #84  <Field int bitField0_>
	//*  46  118:iconst_2        
	//*  47  119:iand            
	//*  48  120:iconst_2        
	//*  49  121:icmpne          133
			descriptorprotos$oneofoptions$builder = options_.toBuilder();
	//   50  124:aload_0         
	//   51  125:getfield        #86  <Field DescriptorProtos$OneofOptions options_>
	//   52  128:invokevirtual   #92  <Method DescriptorProtos$OneofOptions$Builder DescriptorProtos$OneofOptions.toBuilder()>
	//   53  131:astore          5
		options_ = (DescriptorProtos.OneofOptions)codedinputstream.readMessage(DescriptorProtos.OneofOptions.PARSER, extensionregistrylite);
	//   54  133:aload_0         
	//   55  134:aload_1         
	//   56  135:getstatic       #93  <Field Parser DescriptorProtos$OneofOptions.PARSER>
	//   57  138:aload_2         
	//   58  139:invokevirtual   #97  <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//   59  142:checkcast       #88  <Class DescriptorProtos$OneofOptions>
	//   60  145:putfield        #86  <Field DescriptorProtos$OneofOptions options_>
		if(descriptorprotos$oneofoptions$builder == null) goto _L8; else goto _L7
	//   61  148:aload           5
	//   62  150:ifnull          172
_L7:
		descriptorprotos$oneofoptions$builder.mergeFrom(options_);
	//   63  153:aload           5
	//   64  155:aload_0         
	//   65  156:getfield        #86  <Field DescriptorProtos$OneofOptions options_>
	//   66  159:invokevirtual   #103 <Method DescriptorProtos$OneofOptions$Builder DescriptorProtos$OneofOptions$Builder.mergeFrom(DescriptorProtos$OneofOptions)>
	//   67  162:pop             
		options_ = descriptorprotos$oneofoptions$builder.buildPartial();
	//   68  163:aload_0         
	//   69  164:aload           5
	//   70  166:invokevirtual   #107 <Method DescriptorProtos$OneofOptions DescriptorProtos$OneofOptions$Builder.buildPartial()>
	//   71  169:putfield        #86  <Field DescriptorProtos$OneofOptions options_>
_L8:
		bitField0_ = bitField0_ | 2;
	//   72  172:aload_0         
	//   73  173:aload_0         
	//   74  174:getfield        #84  <Field int bitField0_>
	//   75  177:iconst_2        
	//   76  178:ior             
	//   77  179:putfield        #84  <Field int bitField0_>
		continue; /* Loop/switch isn't completed */
	//   78  182:goto            23
_L2:
		unknownFields = builder.build();
	//   79  185:aload_0         
	//   80  186:aload           6
	//   81  188:invokevirtual   #113 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   82  191:putfield        #117 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   83  194:aload_0         
	//   84  195:invokevirtual   #120 <Method void makeExtensionsImmutable()>
		return;
	//   85  198:return          
		codedinputstream;
	//   86  199:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   87  200:aload_1         
	//   88  201:aload_0         
	//   89  202:invokevirtual   #124 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   90  205:athrow          
		codedinputstream;
	//   91  206:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//   92  207:new             #57  <Class InvalidProtocolBufferException>
	//   93  210:dup             
	//   94  211:aload_1         
	//   95  212:invokespecial   #127 <Method void InvalidProtocolBufferException(IOException)>
	//   96  215:aload_0         
	//   97  216:invokevirtual   #124 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   98  219:athrow          
		codedinputstream;
	//   99  220:astore_1        
		unknownFields = builder.build();
	//  100  221:aload_0         
	//  101  222:aload           6
	//  102  224:invokevirtual   #113 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  103  227:putfield        #117 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  104  230:aload_0         
	//  105  231:invokevirtual   #120 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  106  234:aload_1         
	//  107  235:athrow          
	//* 108  236:goto            68
_L4:
		flag = true;
	//  109  239:iconst_1        
	//  110  240:istore_3        
		if(true) goto _L10; else goto _L9
	//  111  241:goto            182
_L9:
	}

	DescriptorProtos$OneofDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #131 <Method void DescriptorProtos$OneofDescriptorProto(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$OneofDescriptorProto(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #134 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #50  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$OneofDescriptorProto(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #138 <Method void DescriptorProtos$OneofDescriptorProto(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
