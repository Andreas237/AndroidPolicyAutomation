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
//			CodedInputStream, Parser, ByteString, MessageLite, 
//			CodedOutputStream, ExtensionRegistryLite, Message, RepeatedFieldBuilderV3, 
//			SingleFieldBuilderV3, AbstractParser

public static final class DescriptorProtos$ServiceDescriptorProto extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.ServiceDescriptorProtoOrBuilder
	{

		private void ensureMethodIsMutable()
		{
			if((bitField0_ & 2) != 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #60  <Field int bitField0_>
		//*   2    4:iconst_2        
		//*   3    5:iand            
		//*   4    6:iconst_2        
		//*   5    7:icmpeq          35
			{
				method_ = ((List) (new ArrayList(((java.util.Collection) (method_)))));
		//    6   10:aload_0         
		//    7   11:new             #62  <Class ArrayList>
		//    8   14:dup             
		//    9   15:aload_0         
		//   10   16:getfield        #44  <Field List method_>
		//   11   19:invokespecial   #65  <Method void ArrayList(java.util.Collection)>
		//   12   22:putfield        #44  <Field List method_>
				bitField0_ = bitField0_ | 2;
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:getfield        #60  <Field int bitField0_>
		//   16   30:iconst_2        
		//   17   31:ior             
		//   18   32:putfield        #60  <Field int bitField0_>
			}
		//   19   35:return          
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$12600();
		//    0    0:invokestatic    #70  <Method Descriptors$Descriptor DescriptorProtos.access$12600()>
		//    1    3:areturn         
		}

		private RepeatedFieldBuilderV3 getMethodFieldBuilder()
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       55
			{
				List list = method_;
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field List method_>
		//    5   11:astore_2        
				boolean flag;
				if((bitField0_ & 2) == 2)
		//*   6   12:aload_0         
		//*   7   13:getfield        #60  <Field int bitField0_>
		//*   8   16:iconst_2        
		//*   9   17:iand            
		//*  10   18:iconst_2        
		//*  11   19:icmpne          27
					flag = true;
		//   12   22:iconst_1        
		//   13   23:istore_1        
				else
		//*  14   24:goto            29
					flag = false;
		//   15   27:iconst_0        
		//   16   28:istore_1        
				methodBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//   17   29:aload_0         
		//   18   30:new             #76  <Class RepeatedFieldBuilderV3>
		//   19   33:dup             
		//   20   34:aload_2         
		//   21   35:iload_1         
		//   22   36:aload_0         
		//   23   37:invokevirtual   #80  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   24   40:aload_0         
		//   25   41:invokevirtual   #84  <Method boolean isClean()>
		//   26   44:invokespecial   #87  <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
		//   27   47:putfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
				method_ = null;
		//   28   50:aload_0         
		//   29   51:aconst_null     
		//   30   52:putfield        #44  <Field List method_>
			}
			return methodBuilder_;
		//   31   55:aload_0         
		//   32   56:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   33   59:areturn         
		}

		private SingleFieldBuilderV3 getOptionsFieldBuilder()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       35
			{
				optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//    3    7:aload_0         
		//    4    8:new             #95  <Class SingleFieldBuilderV3>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokevirtual   #99  <Method DescriptorProtos$ServiceOptions getOptions()>
		//    8   16:aload_0         
		//    9   17:invokevirtual   #80  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   10   20:aload_0         
		//   11   21:invokevirtual   #84  <Method boolean isClean()>
		//   12   24:invokespecial   #102 <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
		//   13   27:putfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
				options_ = null;
		//   14   30:aload_0         
		//   15   31:aconst_null     
		//   16   32:putfield        #46  <Field DescriptorProtos$ServiceOptions options_>
			}
			return optionsBuilder_;
		//   17   35:aload_0         
		//   18   36:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   19   39:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #109 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            16
			{
				getMethodFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #111 <Method RepeatedFieldBuilderV3 getMethodFieldBuilder()>
		//    4   10:pop             
				getOptionsFieldBuilder();
		//    5   11:aload_0         
		//    6   12:invokespecial   #113 <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//    7   15:pop             
			}
		//    8   16:return          
		}

		public Builder addAllMethod(Iterable iterable)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureMethodIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #117 <Method void ensureMethodIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, method_);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #44  <Field List method_>
		//    8   16:invokestatic    #123 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
				onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #126 <Method void onChanged()>
				return this;
		//   11   23:aload_0         
		//   12   24:areturn         
			} else
			{
				methodBuilder_.addAllMessages(iterable);
		//   13   25:aload_0         
		//   14   26:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #130 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   17   33:pop             
				return this;
		//   18   34:aload_0         
		//   19   35:areturn         
			}
		}

		public Builder addMethod(int i, DescriptorProtos.MethodDescriptorProto.Builder builder)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureMethodIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #117 <Method void ensureMethodIsMutable()>
				method_.add(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #44  <Field List method_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #139 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto$Builder.build()>
		//   10   20:invokeinterface #145 <Method void List.add(int, Object)>
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #126 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				methodBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   17   35:iload_1         
		//   18   36:aload_2         
		//   19   37:invokevirtual   #139 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto$Builder.build()>
		//   20   40:invokevirtual   #149 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   21   43:pop             
				return this;
		//   22   44:aload_0         
		//   23   45:areturn         
			}
		}

		public Builder addMethod(int i, DescriptorProtos.MethodDescriptorProto methoddescriptorproto)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(methoddescriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #152 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #153 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureMethodIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #117 <Method void ensureMethodIsMutable()>
					method_.add(i, ((Object) (methoddescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #44  <Field List method_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #145 <Method void List.add(int, Object)>
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #126 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				methodBuilder_.addMessage(i, ((AbstractMessage) (methoddescriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   22   44:iload_1         
		//   23   45:aload_2         
		//   24   46:invokevirtual   #149 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   25   49:pop             
				return this;
		//   26   50:aload_0         
		//   27   51:areturn         
			}
		}

		public Builder addMethod(DescriptorProtos.MethodDescriptorProto.Builder builder)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureMethodIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #117 <Method void ensureMethodIsMutable()>
				method_.add(((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #44  <Field List method_>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #139 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto$Builder.build()>
		//    9   19:invokeinterface #157 <Method boolean List.add(Object)>
		//   10   24:pop             
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #126 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				methodBuilder_.addMessage(((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #139 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto$Builder.build()>
		//   19   39:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   20   42:pop             
				return this;
		//   21   43:aload_0         
		//   22   44:areturn         
			}
		}

		public Builder addMethod(DescriptorProtos.MethodDescriptorProto methoddescriptorproto)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(methoddescriptorproto == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #152 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #153 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureMethodIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #117 <Method void ensureMethodIsMutable()>
					method_.add(((Object) (methoddescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #44  <Field List method_>
		//   13   27:aload_1         
		//   14   28:invokeinterface #157 <Method boolean List.add(Object)>
		//   15   33:pop             
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #126 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				methodBuilder_.addMessage(((AbstractMessage) (methoddescriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   22   44:aload_1         
		//   23   45:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   24   48:pop             
				return this;
		//   25   49:aload_0         
		//   26   50:areturn         
			}
		}

		public DescriptorProtos.MethodDescriptorProto.Builder addMethodBuilder()
		{
			return (DescriptorProtos.MethodDescriptorProto.Builder)getMethodFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.MethodDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #111 <Method RepeatedFieldBuilderV3 getMethodFieldBuilder()>
		//    2    4:invokestatic    #168 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #172 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #135 <Class DescriptorProtos$MethodDescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.MethodDescriptorProto.Builder addMethodBuilder(int i)
		{
			return (DescriptorProtos.MethodDescriptorProto.Builder)getMethodFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.MethodDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #111 <Method RepeatedFieldBuilderV3 getMethodFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #168 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #176 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #135 <Class DescriptorProtos$MethodDescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #181 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #183 <Method DescriptorProtos$ServiceDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #183 <Method DescriptorProtos$ServiceDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public DescriptorProtos.ServiceDescriptorProto build()
		{
			DescriptorProtos.ServiceDescriptorProto servicedescriptorproto = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #188 <Method DescriptorProtos$ServiceDescriptorProto buildPartial()>
		//    2    4:astore_1        
			if(!servicedescriptorproto.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #191 <Method boolean DescriptorProtos$ServiceDescriptorProto.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (servicedescriptorproto)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #195 <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return servicedescriptorproto;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #198 <Method DescriptorProtos$ServiceDescriptorProto build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #198 <Method DescriptorProtos$ServiceDescriptorProto build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.ServiceDescriptorProto buildPartial()
		{
			DescriptorProtos.ServiceDescriptorProto servicedescriptorproto = new DescriptorProtos.ServiceDescriptorProto(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #9   <Class DescriptorProtos$ServiceDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #202 <Method void DescriptorProtos$ServiceDescriptorProto(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #60  <Field int bitField0_>
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
			servicedescriptorproto.name_ = name_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #36  <Field Object name_>
		//   21   33:invokestatic    #206 <Method Object DescriptorProtos$ServiceDescriptorProto.access$13102(DescriptorProtos$ServiceDescriptorProto, Object)>
		//   22   36:pop             
			if(methodBuilder_ == null)
		//*  23   37:aload_0         
		//*  24   38:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*  25   41:ifnonnull       89
			{
				if((bitField0_ & 2) == 2)
		//*  26   44:aload_0         
		//*  27   45:getfield        #60  <Field int bitField0_>
		//*  28   48:iconst_2        
		//*  29   49:iand            
		//*  30   50:iconst_2        
		//*  31   51:icmpne          76
				{
					method_ = Collections.unmodifiableList(method_);
		//   32   54:aload_0         
		//   33   55:aload_0         
		//   34   56:getfield        #44  <Field List method_>
		//   35   59:invokestatic    #210 <Method List Collections.unmodifiableList(List)>
		//   36   62:putfield        #44  <Field List method_>
					bitField0_ = bitField0_ & -3;
		//   37   65:aload_0         
		//   38   66:aload_0         
		//   39   67:getfield        #60  <Field int bitField0_>
		//   40   70:bipush          -3
		//   41   72:iand            
		//   42   73:putfield        #60  <Field int bitField0_>
				}
				servicedescriptorproto.method_ = method_;
		//   43   76:aload           4
		//   44   78:aload_0         
		//   45   79:getfield        #44  <Field List method_>
		//   46   82:invokestatic    #214 <Method List DescriptorProtos$ServiceDescriptorProto.access$13202(DescriptorProtos$ServiceDescriptorProto, List)>
		//   47   85:pop             
			} else
		//*  48   86:goto            102
			{
				servicedescriptorproto.method_ = methodBuilder_.build();
		//   49   89:aload           4
		//   50   91:aload_0         
		//   51   92:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   52   95:invokevirtual   #216 <Method List RepeatedFieldBuilderV3.build()>
		//   53   98:invokestatic    #214 <Method List DescriptorProtos$ServiceDescriptorProto.access$13202(DescriptorProtos$ServiceDescriptorProto, List)>
		//   54  101:pop             
			}
			int j = i;
		//   55  102:iload_1         
		//   56  103:istore_2        
			if((k & 4) == 4)
		//*  57  104:iload_3         
		//*  58  105:iconst_4        
		//*  59  106:iand            
		//*  60  107:iconst_4        
		//*  61  108:icmpne          115
				j = i | 2;
		//   62  111:iload_1         
		//   63  112:iconst_2        
		//   64  113:ior             
		//   65  114:istore_2        
			if(optionsBuilder_ == null)
		//*  66  115:aload_0         
		//*  67  116:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  68  119:ifnonnull       135
				servicedescriptorproto.options_ = options_;
		//   69  122:aload           4
		//   70  124:aload_0         
		//   71  125:getfield        #46  <Field DescriptorProtos$ServiceOptions options_>
		//   72  128:invokestatic    #220 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceDescriptorProto.access$13302(DescriptorProtos$ServiceDescriptorProto, DescriptorProtos$ServiceOptions)>
		//   73  131:pop             
			else
		//*  74  132:goto            151
				servicedescriptorproto.options_ = (DescriptorProtos.ServiceOptions)optionsBuilder_.build();
		//   75  135:aload           4
		//   76  137:aload_0         
		//   77  138:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   78  141:invokevirtual   #223 <Method AbstractMessage SingleFieldBuilderV3.build()>
		//   79  144:checkcast       #225 <Class DescriptorProtos$ServiceOptions>
		//   80  147:invokestatic    #220 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceDescriptorProto.access$13302(DescriptorProtos$ServiceDescriptorProto, DescriptorProtos$ServiceOptions)>
		//   81  150:pop             
			servicedescriptorproto.bitField0_ = j;
		//   82  151:aload           4
		//   83  153:iload_2         
		//   84  154:invokestatic    #229 <Method int DescriptorProtos$ServiceDescriptorProto.access$13402(DescriptorProtos$ServiceDescriptorProto, int)>
		//   85  157:pop             
			onBuilt();
		//   86  158:aload_0         
		//   87  159:invokevirtual   #232 <Method void onBuilt()>
			return servicedescriptorproto;
		//   88  162:aload           4
		//   89  164:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #188 <Method DescriptorProtos$ServiceDescriptorProto buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #188 <Method DescriptorProtos$ServiceDescriptorProto buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #237 <Method DescriptorProtos$ServiceDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #240 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			name_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #34  <String "">
		//    5    8:putfield        #36  <Field Object name_>
			bitField0_ = bitField0_ & -2;
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:getfield        #60  <Field int bitField0_>
		//    9   16:bipush          -2
		//   10   18:iand            
		//   11   19:putfield        #60  <Field int bitField0_>
			if(methodBuilder_ == null)
		//*  12   22:aload_0         
		//*  13   23:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*  14   26:ifnonnull       50
			{
				method_ = Collections.emptyList();
		//   15   29:aload_0         
		//   16   30:invokestatic    #42  <Method List Collections.emptyList()>
		//   17   33:putfield        #44  <Field List method_>
				bitField0_ = bitField0_ & -3;
		//   18   36:aload_0         
		//   19   37:aload_0         
		//   20   38:getfield        #60  <Field int bitField0_>
		//   21   41:bipush          -3
		//   22   43:iand            
		//   23   44:putfield        #60  <Field int bitField0_>
			} else
		//*  24   47:goto            57
			{
				methodBuilder_.clear();
		//   25   50:aload_0         
		//   26   51:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   27   54:invokevirtual   #242 <Method void RepeatedFieldBuilderV3.clear()>
			}
			if(optionsBuilder_ == null)
		//*  28   57:aload_0         
		//*  29   58:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  30   61:ifnonnull       72
				options_ = null;
		//   31   64:aload_0         
		//   32   65:aconst_null     
		//   33   66:putfield        #46  <Field DescriptorProtos$ServiceOptions options_>
			else
		//*  34   69:goto            80
				optionsBuilder_.clear();
		//   35   72:aload_0         
		//   36   73:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   37   76:invokevirtual   #244 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   38   79:pop             
			bitField0_ = bitField0_ & -5;
		//   39   80:aload_0         
		//   40   81:aload_0         
		//   41   82:getfield        #60  <Field int bitField0_>
		//   42   85:bipush          -5
		//   43   87:iand            
		//   44   88:putfield        #60  <Field int bitField0_>
			return this;
		//   45   91:aload_0         
		//   46   92:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #237 <Method DescriptorProtos$ServiceDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #237 <Method DescriptorProtos$ServiceDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #237 <Method DescriptorProtos$ServiceDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #251 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #253 <Method DescriptorProtos$ServiceDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #253 <Method DescriptorProtos$ServiceDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearMethod()
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       31
			{
				method_ = Collections.emptyList();
		//    3    7:aload_0         
		//    4    8:invokestatic    #42  <Method List Collections.emptyList()>
		//    5   11:putfield        #44  <Field List method_>
				bitField0_ = bitField0_ & -3;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #60  <Field int bitField0_>
		//    9   19:bipush          -3
		//   10   21:iand            
		//   11   22:putfield        #60  <Field int bitField0_>
				onChanged();
		//   12   25:aload_0         
		//   13   26:invokevirtual   #126 <Method void onChanged()>
				return this;
		//   14   29:aload_0         
		//   15   30:areturn         
			} else
			{
				methodBuilder_.clear();
		//   16   31:aload_0         
		//   17   32:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   18   35:invokevirtual   #242 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   19   38:aload_0         
		//   20   39:areturn         
			}
		}

		public Builder clearName()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #60  <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #60  <Field int bitField0_>
			name_ = ((Object) (DescriptorProtos.ServiceDescriptorProto.getDefaultInstance().getName()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #258 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto.getDefaultInstance()>
		//    8   15:invokevirtual   #262 <Method String DescriptorProtos$ServiceDescriptorProto.getName()>
		//    9   18:putfield        #36  <Field Object name_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #126 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #267 <Method DescriptorProtos$ServiceDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #270 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #267 <Method DescriptorProtos$ServiceDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #267 <Method DescriptorProtos$ServiceDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       19
			{
				options_ = null;
		//    3    7:aload_0         
		//    4    8:aconst_null     
		//    5    9:putfield        #46  <Field DescriptorProtos$ServiceOptions options_>
				onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #126 <Method void onChanged()>
			} else
		//*   8   16:goto            27
			{
				optionsBuilder_.clear();
		//    9   19:aload_0         
		//   10   20:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   11   23:invokevirtual   #244 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   12   26:pop             
			}
			bitField0_ = bitField0_ & -5;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #60  <Field int bitField0_>
		//   16   32:bipush          -5
		//   17   34:iand            
		//   18   35:putfield        #60  <Field int bitField0_>
			return this;
		//   19   38:aload_0         
		//   20   39:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #275 <Method DescriptorProtos$ServiceDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #275 <Method DescriptorProtos$ServiceDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #278 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #275 <Method DescriptorProtos$ServiceDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #275 <Method DescriptorProtos$ServiceDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #275 <Method DescriptorProtos$ServiceDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #275 <Method DescriptorProtos$ServiceDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.ServiceDescriptorProto getDefaultInstanceForType()
		{
			return DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
		//    0    0:invokestatic    #258 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #285 <Method DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #285 <Method DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$12600();
		//    0    0:invokestatic    #70  <Method Descriptors$Descriptor DescriptorProtos.access$12600()>
		//    1    3:areturn         
		}

		public DescriptorProtos.MethodDescriptorProto getMethod(int i)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.MethodDescriptorProto)method_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field List method_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #292 <Method Object List.get(int)>
		//    7   17:checkcast       #165 <Class DescriptorProtos$MethodDescriptorProto>
		//    8   20:areturn         
			else
				return (DescriptorProtos.MethodDescriptorProto)methodBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #296 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #165 <Class DescriptorProtos$MethodDescriptorProto>
		//   14   32:areturn         
		}

		public DescriptorProtos.MethodDescriptorProto.Builder getMethodBuilder(int i)
		{
			return (DescriptorProtos.MethodDescriptorProto.Builder)getMethodFieldBuilder().getBuilder(i);
		//    0    0:aload_0         
		//    1    1:invokespecial   #111 <Method RepeatedFieldBuilderV3 getMethodFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #301 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
		//    4    8:checkcast       #135 <Class DescriptorProtos$MethodDescriptorProto$Builder>
		//    5   11:areturn         
		}

		public List getMethodBuilderList()
		{
			return getMethodFieldBuilder().getBuilderList();
		//    0    0:aload_0         
		//    1    1:invokespecial   #111 <Method RepeatedFieldBuilderV3 getMethodFieldBuilder()>
		//    2    4:invokevirtual   #305 <Method List RepeatedFieldBuilderV3.getBuilderList()>
		//    3    7:areturn         
		}

		public int getMethodCount()
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       17
				return method_.size();
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field List method_>
		//    5   11:invokeinterface #311 <Method int List.size()>
		//    6   16:ireturn         
			else
				return methodBuilder_.getCount();
		//    7   17:aload_0         
		//    8   18:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//    9   21:invokevirtual   #314 <Method int RepeatedFieldBuilderV3.getCount()>
		//   10   24:ireturn         
		}

		public List getMethodList()
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       15
				return Collections.unmodifiableList(method_);
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field List method_>
		//    5   11:invokestatic    #210 <Method List Collections.unmodifiableList(List)>
		//    6   14:areturn         
			else
				return methodBuilder_.getMessageList();
		//    7   15:aload_0         
		//    8   16:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//    9   19:invokevirtual   #318 <Method List RepeatedFieldBuilderV3.getMessageList()>
		//   10   22:areturn         
		}

		public DescriptorProtos.MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.MethodDescriptorProtoOrBuilder)method_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field List method_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #292 <Method Object List.get(int)>
		//    7   17:checkcast       #323 <Class DescriptorProtos$MethodDescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.MethodDescriptorProtoOrBuilder)methodBuilder_.getMessageOrBuilder(i);
		//    9   21:aload_0         
		//   10   22:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #327 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
		//   13   29:checkcast       #323 <Class DescriptorProtos$MethodDescriptorProtoOrBuilder>
		//   14   32:areturn         
		}

		public List getMethodOrBuilderList()
		{
			if(methodBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnull          15
				return methodBuilder_.getMessageOrBuilderList();
		//    3    7:aload_0         
		//    4    8:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//    5   11:invokevirtual   #331 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
		//    6   14:areturn         
			else
				return Collections.unmodifiableList(method_);
		//    7   15:aload_0         
		//    8   16:getfield        #44  <Field List method_>
		//    9   19:invokestatic    #210 <Method List Collections.unmodifiableList(List)>
		//   10   22:areturn         
		}

		public String getName()
		{
			Object obj = name_;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Object name_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #334 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #336 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #339 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #342 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					name_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #36  <Field Object name_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #334 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getNameBytes()
		{
			Object obj = name_;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Object name_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #334 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #334 <Class String>
		//    8   16:invokestatic    #348 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				name_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #36  <Field Object name_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #336 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public DescriptorProtos.ServiceOptions getOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       23
			{
				if(options_ == null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #46  <Field DescriptorProtos$ServiceOptions options_>
		//*   5   11:ifnonnull       18
					return DescriptorProtos.ServiceOptions.getDefaultInstance();
		//    6   14:invokestatic    #350 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceOptions.getDefaultInstance()>
		//    7   17:areturn         
				else
					return options_;
		//    8   18:aload_0         
		//    9   19:getfield        #46  <Field DescriptorProtos$ServiceOptions options_>
		//   10   22:areturn         
			} else
			{
				return (DescriptorProtos.ServiceOptions)optionsBuilder_.getMessage();
		//   11   23:aload_0         
		//   12   24:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   13   27:invokevirtual   #352 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
		//   14   30:checkcast       #225 <Class DescriptorProtos$ServiceOptions>
		//   15   33:areturn         
			}
		}

		public DescriptorProtos.ServiceOptions.Builder getOptionsBuilder()
		{
			bitField0_ = bitField0_ | 4;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #60  <Field int bitField0_>
		//    3    5:iconst_4        
		//    4    6:ior             
		//    5    7:putfield        #60  <Field int bitField0_>
			onChanged();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #126 <Method void onChanged()>
			return (DescriptorProtos.ServiceOptions.Builder)getOptionsFieldBuilder().getBuilder();
		//    8   14:aload_0         
		//    9   15:invokespecial   #113 <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//   10   18:invokevirtual   #356 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
		//   11   21:checkcast       #358 <Class DescriptorProtos$ServiceOptions$Builder>
		//   12   24:areturn         
		}

		public DescriptorProtos.ServiceOptionsOrBuilder getOptionsOrBuilder()
		{
			if(optionsBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnull          18
				return (DescriptorProtos.ServiceOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
		//    3    7:aload_0         
		//    4    8:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//    5   11:invokevirtual   #363 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
		//    6   14:checkcast       #365 <Class DescriptorProtos$ServiceOptionsOrBuilder>
		//    7   17:areturn         
			if(options_ == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #46  <Field DescriptorProtos$ServiceOptions options_>
		//*  10   22:ifnonnull       29
				return ((DescriptorProtos.ServiceOptionsOrBuilder) (DescriptorProtos.ServiceOptions.getDefaultInstance()));
		//   11   25:invokestatic    #350 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceOptions.getDefaultInstance()>
		//   12   28:areturn         
			else
				return ((DescriptorProtos.ServiceOptionsOrBuilder) (options_));
		//   13   29:aload_0         
		//   14   30:getfield        #46  <Field DescriptorProtos$ServiceOptions options_>
		//   15   33:areturn         
		}

		public boolean hasName()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field int bitField0_>
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
			return (bitField0_ & 4) == 4;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field int bitField0_>
		//    2    4:iconst_4        
		//    3    5:iand            
		//    4    6:iconst_4        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$12700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$ServiceDescriptorProto, com/google/protobuf/DescriptorProtos$ServiceDescriptorProto$Builder);
		//    0    0:invokestatic    #372 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$12700()>
		//    1    3:ldc1            #9   <Class DescriptorProtos$ServiceDescriptorProto>
		//    2    5:ldc1            #2   <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    3    7:invokevirtual   #378 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			for(int i = 0; i < getMethodCount(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_1        
		//*   2    2:iload_1         
		//*   3    3:aload_0         
		//*   4    4:invokevirtual   #380 <Method int getMethodCount()>
		//*   5    7:icmpge          30
				if(!getMethod(i).isInitialized())
		//*   6   10:aload_0         
		//*   7   11:iload_1         
		//*   8   12:invokevirtual   #382 <Method DescriptorProtos$MethodDescriptorProto getMethod(int)>
		//*   9   15:invokevirtual   #383 <Method boolean DescriptorProtos$MethodDescriptorProto.isInitialized()>
		//*  10   18:ifne            23
					return false;
		//   11   21:iconst_0        
		//   12   22:ireturn         

		//   13   23:iload_1         
		//   14   24:iconst_1        
		//   15   25:iadd            
		//   16   26:istore_1        
		//*  17   27:goto            2
			return !hasOptions() || getOptions().isInitialized();
		//   18   30:aload_0         
		//   19   31:invokevirtual   #385 <Method boolean hasOptions()>
		//   20   34:ifeq            49
		//   21   37:aload_0         
		//   22   38:invokevirtual   #99  <Method DescriptorProtos$ServiceOptions getOptions()>
		//   23   41:invokevirtual   #386 <Method boolean DescriptorProtos$ServiceOptions.isInitialized()>
		//   24   44:ifne            49
		//   25   47:iconst_0        
		//   26   48:ireturn         
		//   27   49:iconst_1        
		//   28   50:ireturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #393 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #397 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #393 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.ServiceDescriptorProto)DescriptorProtos.ServiceDescriptorProto.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #404 <Field Parser DescriptorProtos$ServiceDescriptorProto.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #410 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class DescriptorProtos$ServiceDescriptorProto>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.ServiceDescriptorProto) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #413 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(DescriptorProtos$ServiceDescriptorProto)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #416 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class DescriptorProtos$ServiceDescriptorProto>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #420 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #413 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(DescriptorProtos$ServiceDescriptorProto)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.ServiceDescriptorProto)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.ServiceDescriptorProto) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
		{
			if(servicedescriptorproto == DescriptorProtos.ServiceDescriptorProto.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #258 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(servicedescriptorproto.hasName())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #422 <Method boolean DescriptorProtos$ServiceDescriptorProto.hasName()>
		//*   7   13:ifeq            38
			{
				bitField0_ = bitField0_ | 1;
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #60  <Field int bitField0_>
		//   11   21:iconst_1        
		//   12   22:ior             
		//   13   23:putfield        #60  <Field int bitField0_>
				name_ = servicedescriptorproto.name_;
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokestatic    #426 <Method Object DescriptorProtos$ServiceDescriptorProto.access$13100(DescriptorProtos$ServiceDescriptorProto)>
		//   17   31:putfield        #36  <Field Object name_>
				onChanged();
		//   18   34:aload_0         
		//   19   35:invokevirtual   #126 <Method void onChanged()>
			}
			if(methodBuilder_ == null)
		//*  20   38:aload_0         
		//*  21   39:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*  22   42:ifnonnull       116
			{
				if(!servicedescriptorproto.method_.isEmpty())
		//*  23   45:aload_1         
		//*  24   46:invokestatic    #430 <Method List DescriptorProtos$ServiceDescriptorProto.access$13200(DescriptorProtos$ServiceDescriptorProto)>
		//*  25   49:invokeinterface #433 <Method boolean List.isEmpty()>
		//*  26   54:ifne            205
				{
					if(method_.isEmpty())
		//*  27   57:aload_0         
		//*  28   58:getfield        #44  <Field List method_>
		//*  29   61:invokeinterface #433 <Method boolean List.isEmpty()>
		//*  30   66:ifeq            91
					{
						method_ = servicedescriptorproto.method_;
		//   31   69:aload_0         
		//   32   70:aload_1         
		//   33   71:invokestatic    #430 <Method List DescriptorProtos$ServiceDescriptorProto.access$13200(DescriptorProtos$ServiceDescriptorProto)>
		//   34   74:putfield        #44  <Field List method_>
						bitField0_ = bitField0_ & -3;
		//   35   77:aload_0         
		//   36   78:aload_0         
		//   37   79:getfield        #60  <Field int bitField0_>
		//   38   82:bipush          -3
		//   39   84:iand            
		//   40   85:putfield        #60  <Field int bitField0_>
					} else
		//*  41   88:goto            109
					{
						ensureMethodIsMutable();
		//   42   91:aload_0         
		//   43   92:invokespecial   #117 <Method void ensureMethodIsMutable()>
						method_.addAll(((java.util.Collection) (servicedescriptorproto.method_)));
		//   44   95:aload_0         
		//   45   96:getfield        #44  <Field List method_>
		//   46   99:aload_1         
		//   47  100:invokestatic    #430 <Method List DescriptorProtos$ServiceDescriptorProto.access$13200(DescriptorProtos$ServiceDescriptorProto)>
		//   48  103:invokeinterface #436 <Method boolean List.addAll(java.util.Collection)>
		//   49  108:pop             
					}
					onChanged();
		//   50  109:aload_0         
		//   51  110:invokevirtual   #126 <Method void onChanged()>
				}
			} else
		//*  52  113:goto            205
			if(!servicedescriptorproto.method_.isEmpty())
		//*  53  116:aload_1         
		//*  54  117:invokestatic    #430 <Method List DescriptorProtos$ServiceDescriptorProto.access$13200(DescriptorProtos$ServiceDescriptorProto)>
		//*  55  120:invokeinterface #433 <Method boolean List.isEmpty()>
		//*  56  125:ifne            205
				if(methodBuilder_.isEmpty())
		//*  57  128:aload_0         
		//*  58  129:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*  59  132:invokevirtual   #437 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
		//*  60  135:ifeq            193
				{
					methodBuilder_.dispose();
		//   61  138:aload_0         
		//   62  139:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   63  142:invokevirtual   #440 <Method void RepeatedFieldBuilderV3.dispose()>
					methodBuilder_ = null;
		//   64  145:aload_0         
		//   65  146:aconst_null     
		//   66  147:putfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
					method_ = servicedescriptorproto.method_;
		//   67  150:aload_0         
		//   68  151:aload_1         
		//   69  152:invokestatic    #430 <Method List DescriptorProtos$ServiceDescriptorProto.access$13200(DescriptorProtos$ServiceDescriptorProto)>
		//   70  155:putfield        #44  <Field List method_>
					bitField0_ = bitField0_ & -3;
		//   71  158:aload_0         
		//   72  159:aload_0         
		//   73  160:getfield        #60  <Field int bitField0_>
		//   74  163:bipush          -3
		//   75  165:iand            
		//   76  166:putfield        #60  <Field int bitField0_>
					RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
					if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*  77  169:getstatic       #109 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*  78  172:ifeq            183
						repeatedfieldbuilderv3 = getMethodFieldBuilder();
		//   79  175:aload_0         
		//   80  176:invokespecial   #111 <Method RepeatedFieldBuilderV3 getMethodFieldBuilder()>
		//   81  179:astore_2        
					else
		//*  82  180:goto            185
						repeatedfieldbuilderv3 = null;
		//   83  183:aconst_null     
		//   84  184:astore_2        
					methodBuilder_ = repeatedfieldbuilderv3;
		//   85  185:aload_0         
		//   86  186:aload_2         
		//   87  187:putfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
				} else
		//*  88  190:goto            205
				{
					methodBuilder_.addAllMessages(((Iterable) (servicedescriptorproto.method_)));
		//   89  193:aload_0         
		//   90  194:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   91  197:aload_1         
		//   92  198:invokestatic    #430 <Method List DescriptorProtos$ServiceDescriptorProto.access$13200(DescriptorProtos$ServiceDescriptorProto)>
		//   93  201:invokevirtual   #130 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   94  204:pop             
				}
			if(servicedescriptorproto.hasOptions())
		//*  95  205:aload_1         
		//*  96  206:invokevirtual   #441 <Method boolean DescriptorProtos$ServiceDescriptorProto.hasOptions()>
		//*  97  209:ifeq            221
				mergeOptions(servicedescriptorproto.getOptions());
		//   98  212:aload_0         
		//   99  213:aload_1         
		//  100  214:invokevirtual   #442 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceDescriptorProto.getOptions()>
		//  101  217:invokevirtual   #446 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeOptions(DescriptorProtos$ServiceOptions)>
		//  102  220:pop             
			mergeUnknownFields(servicedescriptorproto.unknownFields);
		//  103  221:aload_0         
		//  104  222:aload_1         
		//  105  223:getfield        #450 <Field UnknownFieldSet DescriptorProtos$ServiceDescriptorProto.unknownFields>
		//  106  226:invokevirtual   #454 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//  107  229:pop             
			onChanged();
		//  108  230:aload_0         
		//  109  231:invokevirtual   #126 <Method void onChanged()>
			return this;
		//  110  234:aload_0         
		//  111  235:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.ServiceDescriptorProto)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class DescriptorProtos$ServiceDescriptorProto>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.ServiceDescriptorProto)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class DescriptorProtos$ServiceDescriptorProto>
		//    6   12:invokevirtual   #413 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(DescriptorProtos$ServiceDescriptorProto)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #456 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #393 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #397 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #393 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeOptions(DescriptorProtos.ServiceOptions serviceoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       67
			{
				if((bitField0_ & 4) == 4 && options_ != null && options_ != DescriptorProtos.ServiceOptions.getDefaultInstance())
		//*   3    7:aload_0         
		//*   4    8:getfield        #60  <Field int bitField0_>
		//*   5   11:iconst_4        
		//*   6   12:iand            
		//*   7   13:iconst_4        
		//*   8   14:icmpne          55
		//*   9   17:aload_0         
		//*  10   18:getfield        #46  <Field DescriptorProtos$ServiceOptions options_>
		//*  11   21:ifnull          55
		//*  12   24:aload_0         
		//*  13   25:getfield        #46  <Field DescriptorProtos$ServiceOptions options_>
		//*  14   28:invokestatic    #350 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceOptions.getDefaultInstance()>
		//*  15   31:if_acmpeq       55
					options_ = DescriptorProtos.ServiceOptions.newBuilder(options_).mergeFrom(serviceoptions).buildPartial();
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #46  <Field DescriptorProtos$ServiceOptions options_>
		//   19   39:invokestatic    #463 <Method DescriptorProtos$ServiceOptions$Builder DescriptorProtos$ServiceOptions.newBuilder(DescriptorProtos$ServiceOptions)>
		//   20   42:aload_1         
		//   21   43:invokevirtual   #465 <Method DescriptorProtos$ServiceOptions$Builder DescriptorProtos$ServiceOptions$Builder.mergeFrom(DescriptorProtos$ServiceOptions)>
		//   22   46:invokevirtual   #467 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceOptions$Builder.buildPartial()>
		//   23   49:putfield        #46  <Field DescriptorProtos$ServiceOptions options_>
				else
		//*  24   52:goto            60
					options_ = serviceoptions;
		//   25   55:aload_0         
		//   26   56:aload_1         
		//   27   57:putfield        #46  <Field DescriptorProtos$ServiceOptions options_>
				onChanged();
		//   28   60:aload_0         
		//   29   61:invokevirtual   #126 <Method void onChanged()>
			} else
		//*  30   64:goto            76
			{
				optionsBuilder_.mergeFrom(((AbstractMessage) (serviceoptions)));
		//   31   67:aload_0         
		//   32   68:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   33   71:aload_1         
		//   34   72:invokevirtual   #470 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
		//   35   75:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   36   76:aload_0         
		//   37   77:aload_0         
		//   38   78:getfield        #60  <Field int bitField0_>
		//   39   81:iconst_4        
		//   40   82:ior             
		//   41   83:putfield        #60  <Field int bitField0_>
			return this;
		//   42   86:aload_0         
		//   43   87:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #454 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #474 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #454 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #454 <Method DescriptorProtos$ServiceDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder removeMethod(int i)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       28
			{
				ensureMethodIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #117 <Method void ensureMethodIsMutable()>
				method_.remove(i);
		//    5   11:aload_0         
		//    6   12:getfield        #44  <Field List method_>
		//    7   15:iload_1         
		//    8   16:invokeinterface #480 <Method Object List.remove(int)>
		//    9   21:pop             
				onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #126 <Method void onChanged()>
				return this;
		//   12   26:aload_0         
		//   13   27:areturn         
			} else
			{
				methodBuilder_.remove(i);
		//   14   28:aload_0         
		//   15   29:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #483 <Method void RepeatedFieldBuilderV3.remove(int)>
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
		//    3    3:invokespecial   #486 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #488 <Method DescriptorProtos$ServiceDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #488 <Method DescriptorProtos$ServiceDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setMethod(int i, DescriptorProtos.MethodDescriptorProto.Builder builder)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureMethodIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #117 <Method void ensureMethodIsMutable()>
				method_.set(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #44  <Field List method_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #139 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto$Builder.build()>
		//   10   20:invokeinterface #493 <Method Object List.set(int, Object)>
		//   11   25:pop             
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #126 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				methodBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
		//   16   32:aload_0         
		//   17   33:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   18   36:iload_1         
		//   19   37:aload_2         
		//   20   38:invokevirtual   #139 <Method DescriptorProtos$MethodDescriptorProto DescriptorProtos$MethodDescriptorProto$Builder.build()>
		//   21   41:invokevirtual   #496 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   22   44:pop             
				return this;
		//   23   45:aload_0         
		//   24   46:areturn         
			}
		}

		public Builder setMethod(int i, DescriptorProtos.MethodDescriptorProto methoddescriptorproto)
		{
			if(methodBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(methoddescriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #152 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #153 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureMethodIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #117 <Method void ensureMethodIsMutable()>
					method_.set(i, ((Object) (methoddescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #44  <Field List method_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #493 <Method Object List.set(int, Object)>
		//   16   34:pop             
					onChanged();
		//   17   35:aload_0         
		//   18   36:invokevirtual   #126 <Method void onChanged()>
					return this;
		//   19   39:aload_0         
		//   20   40:areturn         
				}
			} else
			{
				methodBuilder_.setMessage(i, ((AbstractMessage) (methoddescriptorproto)));
		//   21   41:aload_0         
		//   22   42:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
		//   23   45:iload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #496 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   26   50:pop             
				return this;
		//   27   51:aload_0         
		//   28   52:areturn         
			}
		}

		public Builder setName(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #152 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #153 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #60  <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #60  <Field int bitField0_>
				name_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #36  <Field Object name_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #126 <Method void onChanged()>
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
		//    2    4:new             #152 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #153 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #60  <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #60  <Field int bitField0_>
				name_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #36  <Field Object name_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #126 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setOptions(DescriptorProtos.ServiceOptions.Builder builder)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       22
			{
				options_ = builder.build();
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #504 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceOptions$Builder.build()>
		//    6   12:putfield        #46  <Field DescriptorProtos$ServiceOptions options_>
				onChanged();
		//    7   15:aload_0         
		//    8   16:invokevirtual   #126 <Method void onChanged()>
			} else
		//*   9   19:goto            34
			{
				optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
		//   10   22:aload_0         
		//   11   23:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #504 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceOptions$Builder.build()>
		//   14   30:invokevirtual   #506 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   15   33:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #60  <Field int bitField0_>
		//   19   39:iconst_4        
		//   20   40:ior             
		//   21   41:putfield        #60  <Field int bitField0_>
			return this;
		//   22   44:aload_0         
		//   23   45:areturn         
		}

		public Builder setOptions(DescriptorProtos.ServiceOptions serviceoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       31
			{
				if(serviceoptions == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
					throw new NullPointerException();
		//    5   11:new             #152 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #153 <Method void NullPointerException()>
		//    8   18:athrow          
				options_ = serviceoptions;
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:putfield        #46  <Field DescriptorProtos$ServiceOptions options_>
				onChanged();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #126 <Method void onChanged()>
			} else
		//*  14   28:goto            40
			{
				optionsBuilder_.setMessage(((AbstractMessage) (serviceoptions)));
		//   15   31:aload_0         
		//   16   32:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #506 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   19   39:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   20   40:aload_0         
		//   21   41:aload_0         
		//   22   42:getfield        #60  <Field int bitField0_>
		//   23   45:iconst_4        
		//   24   46:ior             
		//   25   47:putfield        #60  <Field int bitField0_>
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
		//    4    4:invokespecial   #511 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #513 <Method DescriptorProtos$ServiceDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #513 <Method DescriptorProtos$ServiceDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #517 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #519 <Method DescriptorProtos$ServiceDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #519 <Method DescriptorProtos$ServiceDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private RepeatedFieldBuilderV3 methodBuilder_;
		private List method_;
		private Object name_;
		private SingleFieldBuilderV3 optionsBuilder_;
		private DescriptorProtos.ServiceOptions options_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void GeneratedMessageV3$Builder()>
			name_ = "";
		//    2    4:aload_0         
		//    3    5:ldc1            #34  <String "">
		//    4    7:putfield        #36  <Field Object name_>
			method_ = Collections.emptyList();
		//    5   10:aload_0         
		//    6   11:invokestatic    #42  <Method List Collections.emptyList()>
		//    7   14:putfield        #44  <Field List method_>
			options_ = null;
		//    8   17:aload_0         
		//    9   18:aconst_null     
		//   10   19:putfield        #46  <Field DescriptorProtos$ServiceOptions options_>
			maybeForceBuilderInitialization();
		//   11   22:aload_0         
		//   12   23:invokespecial   #49  <Method void maybeForceBuilderInitialization()>
		//   13   26:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #52  <Method void DescriptorProtos$ServiceDescriptorProto$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #55  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			name_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #34  <String "">
		//    5    8:putfield        #36  <Field Object name_>
			method_ = Collections.emptyList();
		//    6   11:aload_0         
		//    7   12:invokestatic    #42  <Method List Collections.emptyList()>
		//    8   15:putfield        #44  <Field List method_>
			options_ = null;
		//    9   18:aload_0         
		//   10   19:aconst_null     
		//   11   20:putfield        #46  <Field DescriptorProtos$ServiceOptions options_>
			maybeForceBuilderInitialization();
		//   12   23:aload_0         
		//   13   24:invokespecial   #49  <Method void maybeForceBuilderInitialization()>
		//   14   27:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #57  <Method void DescriptorProtos$ServiceDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$ServiceDescriptorProto getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #48  <Field DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$12600();
	//    0    0:invokestatic    #186 <Method Descriptors$Descriptor DescriptorProtos.access$12600()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #48  <Field DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #189 <Method DescriptorProtos$ServiceDescriptorProto$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$ServiceDescriptorProto descriptorprotos$servicedescriptorproto)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$servicedescriptorproto);
	//    0    0:getstatic       #48  <Field DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #189 <Method DescriptorProtos$ServiceDescriptorProto$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #192 <Method DescriptorProtos$ServiceDescriptorProto$Builder DescriptorProtos$ServiceDescriptorProto$Builder.mergeFrom(DescriptorProtos$ServiceDescriptorProto)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #198 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #202 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$ServiceDescriptorProto)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #209 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$ServiceDescriptorProto)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #213 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #218 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #222 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #224 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$ServiceDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #226 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$ServiceDescriptorProto)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #230 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$ServiceDescriptorProto)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #234 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$ServiceDescriptorProto)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #238 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$ServiceDescriptorProto)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #242 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #51  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$ServiceDescriptorProto))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #248 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$ServiceDescriptorProto)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasName() == ((DescriptorProtos$ServiceDescriptorProto) (obj)).hasName())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #252 <Method boolean hasName()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #252 <Method boolean hasName()>
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
	//*  30   50:invokevirtual   #252 <Method boolean hasName()>
	//*  31   53:ifeq            81
			if(flag && getName().equals(((Object) (((DescriptorProtos$ServiceDescriptorProto) (obj)).getName()))))
	//*  32   56:iload_2         
	//*  33   57:ifeq            79
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #256 <Method String getName()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #256 <Method String getName()>
	//*  38   68:invokevirtual   #259 <Method boolean String.equals(Object)>
	//*  39   71:ifeq            79
				flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
			else
	//*  42   76:goto            81
				flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if(flag1 && getMethodList().equals(((Object) (((DescriptorProtos$ServiceDescriptorProto) (obj)).getMethodList()))))
	//*  45   81:iload_3         
	//*  46   82:ifeq            106
	//*  47   85:aload_0         
	//*  48   86:invokevirtual   #262 <Method List getMethodList()>
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #262 <Method List getMethodList()>
	//*  51   93:invokeinterface #263 <Method boolean List.equals(Object)>
	//*  52   98:ifeq            106
			flag = true;
	//   53  101:iconst_1        
	//   54  102:istore_2        
		else
	//*  55  103:goto            108
			flag = false;
	//   56  106:iconst_0        
	//   57  107:istore_2        
		if(flag && hasOptions() == ((DescriptorProtos$ServiceDescriptorProto) (obj)).hasOptions())
	//*  58  108:iload_2         
	//*  59  109:ifeq            128
	//*  60  112:aload_0         
	//*  61  113:invokevirtual   #266 <Method boolean hasOptions()>
	//*  62  116:aload_1         
	//*  63  117:invokevirtual   #266 <Method boolean hasOptions()>
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
		if(hasOptions())
	//*  72  132:aload_0         
	//*  73  133:invokevirtual   #266 <Method boolean hasOptions()>
	//*  74  136:ifeq            164
			if(flag && getOptions().equals(((Object) (((DescriptorProtos$ServiceDescriptorProto) (obj)).getOptions()))))
	//*  75  139:iload_2         
	//*  76  140:ifeq            162
	//*  77  143:aload_0         
	//*  78  144:invokevirtual   #269 <Method DescriptorProtos$ServiceOptions getOptions()>
	//*  79  147:aload_1         
	//*  80  148:invokevirtual   #269 <Method DescriptorProtos$ServiceOptions getOptions()>
	//*  81  151:invokevirtual   #270 <Method boolean DescriptorProtos$ServiceOptions.equals(Object)>
	//*  82  154:ifeq            162
				flag1 = true;
	//   83  157:iconst_1        
	//   84  158:istore_3        
			else
	//*  85  159:goto            164
				flag1 = false;
	//   86  162:iconst_0        
	//   87  163:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$ServiceDescriptorProto) (obj)).unknownFields)));
	//   88  164:iload_3         
	//   89  165:ifeq            184
	//   90  168:aload_0         
	//   91  169:getfield        #146 <Field UnknownFieldSet unknownFields>
	//   92  172:aload_1         
	//   93  173:getfield        #146 <Field UnknownFieldSet unknownFields>
	//   94  176:invokevirtual   #271 <Method boolean UnknownFieldSet.equals(Object)>
	//   95  179:ifeq            184
	//   96  182:iconst_1        
	//   97  183:ireturn         
	//   98  184:iconst_0        
	//   99  185:ireturn         
	}

	public DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #48  <Field DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #275 <Method DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #275 <Method DescriptorProtos$ServiceDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public DescriptorProtos.MethodDescriptorProto getMethod(int i)
	{
		return (DescriptorProtos.MethodDescriptorProto)method_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List method_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #282 <Method Object List.get(int)>
	//    4   10:checkcast       #102 <Class DescriptorProtos$MethodDescriptorProto>
	//    5   13:areturn         
	}

	public int getMethodCount()
	{
		return method_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List method_>
	//    2    4:invokeinterface #286 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getMethodList()
	{
		return method_;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List method_>
	//    2    4:areturn         
	}

	public Builder getMethodOrBuilder(int i)
	{
		return (Builder)method_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List method_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #282 <Method Object List.get(int)>
	//    4   10:checkcast       #291 <Class DescriptorProtos$MethodDescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getMethodOrBuilderList()
	{
		return method_;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List method_>
	//    2    4:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #258 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #258 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #295 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #298 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #301 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			name_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #59  <Field Object name_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #258 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #258 <Class String>
	//    8   16:invokestatic    #306 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #59  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #295 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.ServiceOptions getOptions()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field DescriptorProtos$ServiceOptions options_>
	//*   2    4:ifnonnull       11
			return DescriptorProtos.ServiceOptions.getDefaultInstance();
	//    3    7:invokestatic    #308 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return options_;
	//    5   11:aload_0         
	//    6   12:getfield        #115 <Field DescriptorProtos$ServiceOptions options_>
	//    7   15:areturn         
	}

	public  getOptionsOrBuilder()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field DescriptorProtos$ServiceOptions options_>
	//*   2    4:ifnonnull       11
			return (() (DescriptorProtos.ServiceOptions.getDefaultInstance()));
	//    3    7:invokestatic    #308 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return (() (options_));
	//    5   11:aload_0         
	//    6   12:getfield        #115 <Field DescriptorProtos$ServiceOptions options_>
	//    7   15:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #51  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field int memoizedSize>
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
	//*  11   15:getfield        #97  <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			i = GeneratedMessageV3.computeStringSize(1, name_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #59  <Field Object name_>
	//   19   29:invokestatic    #319 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_1        
		for(int j = 0; j < method_.size(); j++)
	//*  23   35:iconst_0        
	//*  24   36:istore_2        
	//*  25   37:iload_2         
	//*  26   38:aload_0         
	//*  27   39:getfield        #67  <Field List method_>
	//*  28   42:invokeinterface #286 <Method int List.size()>
	//*  29   47:icmpge          77
			i += CodedOutputStream.computeMessageSize(2, (MessageLite)method_.get(j));
	//   30   50:iload_1         
	//   31   51:iconst_2        
	//   32   52:aload_0         
	//   33   53:getfield        #67  <Field List method_>
	//   34   56:iload_2         
	//   35   57:invokeinterface #282 <Method Object List.get(int)>
	//   36   62:checkcast       #321 <Class MessageLite>
	//   37   65:invokestatic    #327 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   38   68:iadd            
	//   39   69:istore_1        

	//   40   70:iload_2         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:istore_2        
	//*  44   74:goto            37
		int k = i;
	//   45   77:iload_1         
	//   46   78:istore_2        
		if((bitField0_ & 2) == 2)
	//*  47   79:aload_0         
	//*  48   80:getfield        #97  <Field int bitField0_>
	//*  49   83:iconst_2        
	//*  50   84:iand            
	//*  51   85:iconst_2        
	//*  52   86:icmpne          100
			k = i + CodedOutputStream.computeMessageSize(3, ((MessageLite) (getOptions())));
	//   53   89:iload_1         
	//   54   90:iconst_3        
	//   55   91:aload_0         
	//   56   92:invokevirtual   #269 <Method DescriptorProtos$ServiceOptions getOptions()>
	//   57   95:invokestatic    #327 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   58   98:iadd            
	//   59   99:istore_2        
		i = k + unknownFields.getSerializedSize();
	//   60  100:iload_2         
	//   61  101:aload_0         
	//   62  102:getfield        #146 <Field UnknownFieldSet unknownFields>
	//   63  105:invokevirtual   #329 <Method int UnknownFieldSet.getSerializedSize()>
	//   64  108:iadd            
	//   65  109:istore_1        
		memoizedSize = i;
	//   66  110:aload_0         
	//   67  111:iload_1         
	//   68  112:putfield        #315 <Field int memoizedSize>
		return i;
	//   69  115:iload_1         
	//   70  116:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int bitField0_>
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
	//    1    1:getfield        #97  <Field int bitField0_>
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
	//*   1    1:getfield        #334 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #334 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #336 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #340 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasName())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #252 <Method boolean hasName()>
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
	//   24   42:invokevirtual   #256 <Method String getName()>
	//   25   45:invokevirtual   #341 <Method int String.hashCode()>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(getMethodCount() > 0)
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #343 <Method int getMethodCount()>
	//*  32   56:ifle            79
			j = (i * 37 + 2) * 53 + getMethodList().hashCode();
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_2        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #262 <Method List getMethodList()>
	//   42   72:invokeinterface #344 <Method int List.hashCode()>
	//   43   77:iadd            
	//   44   78:istore_2        
		i = j;
	//   45   79:iload_2         
	//   46   80:istore_1        
		if(hasOptions())
	//*  47   81:aload_0         
	//*  48   82:invokevirtual   #266 <Method boolean hasOptions()>
	//*  49   85:ifeq            106
			i = (j * 37 + 3) * 53 + getOptions().hashCode();
	//   50   88:iload_2         
	//   51   89:bipush          37
	//   52   91:imul            
	//   53   92:iconst_3        
	//   54   93:iadd            
	//   55   94:bipush          53
	//   56   96:imul            
	//   57   97:aload_0         
	//   58   98:invokevirtual   #269 <Method DescriptorProtos$ServiceOptions getOptions()>
	//   59  101:invokevirtual   #345 <Method int DescriptorProtos$ServiceOptions.hashCode()>
	//   60  104:iadd            
	//   61  105:istore_1        
		i = i * 29 + unknownFields.hashCode();
	//   62  106:iload_1         
	//   63  107:bipush          29
	//   64  109:imul            
	//   65  110:aload_0         
	//   66  111:getfield        #146 <Field UnknownFieldSet unknownFields>
	//   67  114:invokevirtual   #346 <Method int UnknownFieldSet.hashCode()>
	//   68  117:iadd            
	//   69  118:istore_1        
		memoizedHashCode = i;
	//   70  119:aload_0         
	//   71  120:iload_1         
	//   72  121:putfield        #334 <Field int memoizedHashCode>
		return i;
	//   73  124:iload_1         
	//   74  125:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$12700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$ServiceDescriptorProto, com/google/protobuf/DescriptorProtos$ServiceDescriptorProto$Builder);
	//    0    0:invokestatic    #351 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$12700()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    2    5:ldc1            #13  <Class DescriptorProtos$ServiceDescriptorProto$Builder>
	//    3    7:invokevirtual   #357 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field byte memoizedIsInitialized>
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
		for(int i = 0; i < getMethodCount(); i++)
	//*  12   18:iconst_0        
	//*  13   19:istore_1        
	//*  14   20:iload_1         
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #343 <Method int getMethodCount()>
	//*  17   25:icmpge          53
			if(!getMethod(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #360 <Method DescriptorProtos$MethodDescriptorProto getMethod(int)>
	//*  21   33:invokevirtual   #362 <Method boolean DescriptorProtos$MethodDescriptorProto.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #55  <Field byte memoizedIsInitialized>
				return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
			}

	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_1        
	//*  32   50:goto            20
		if(hasOptions() && !getOptions().isInitialized())
	//*  33   53:aload_0         
	//*  34   54:invokevirtual   #266 <Method boolean hasOptions()>
	//*  35   57:ifeq            77
	//*  36   60:aload_0         
	//*  37   61:invokevirtual   #269 <Method DescriptorProtos$ServiceOptions getOptions()>
	//*  38   64:invokevirtual   #363 <Method boolean DescriptorProtos$ServiceOptions.isInitialized()>
	//*  39   67:ifne            77
		{
			memoizedIsInitialized = 0;
	//   40   70:aload_0         
	//   41   71:iconst_0        
	//   42   72:putfield        #55  <Field byte memoizedIsInitialized>
			return false;
	//   43   75:iconst_0        
	//   44   76:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   45   77:aload_0         
	//   46   78:iconst_1        
	//   47   79:putfield        #55  <Field byte memoizedIsInitialized>
			return true;
	//   48   82:iconst_1        
	//   49   83:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #366 <Method DescriptorProtos$ServiceDescriptorProto$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #13  <Class DescriptorProtos$ServiceDescriptorProto$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #370 <Method void DescriptorProtos$ServiceDescriptorProto$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #373 <Method DescriptorProtos$ServiceDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #376 <Method DescriptorProtos$ServiceDescriptorProto$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #373 <Method DescriptorProtos$ServiceDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #48  <Field DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #13  <Class DescriptorProtos$ServiceDescriptorProto$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #380 <Method void DescriptorProtos$ServiceDescriptorProto$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #13  <Class DescriptorProtos$ServiceDescriptorProto$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #380 <Method void DescriptorProtos$ServiceDescriptorProto$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #192 <Method DescriptorProtos$ServiceDescriptorProto$Builder DescriptorProtos$ServiceDescriptorProto$Builder.mergeFrom(DescriptorProtos$ServiceDescriptorProto)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #189 <Method DescriptorProtos$ServiceDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #189 <Method DescriptorProtos$ServiceDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			GeneratedMessageV3.writeString(codedoutputstream, 1, name_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #59  <Field Object name_>
	//   10   16:invokestatic    #386 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		for(int i = 0; i < method_.size(); i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:aload_0         
	//*  15   23:getfield        #67  <Field List method_>
	//*  16   26:invokeinterface #286 <Method int List.size()>
	//*  17   31:icmpge          59
			codedoutputstream.writeMessage(2, (MessageLite)method_.get(i));
	//   18   34:aload_1         
	//   19   35:iconst_2        
	//   20   36:aload_0         
	//   21   37:getfield        #67  <Field List method_>
	//   22   40:iload_2         
	//   23   41:invokeinterface #282 <Method Object List.get(int)>
	//   24   46:checkcast       #321 <Class MessageLite>
	//   25   49:invokevirtual   #390 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   26   52:iload_2         
	//   27   53:iconst_1        
	//   28   54:iadd            
	//   29   55:istore_2        
	//*  30   56:goto            21
		if((bitField0_ & 2) == 2)
	//*  31   59:aload_0         
	//*  32   60:getfield        #97  <Field int bitField0_>
	//*  33   63:iconst_2        
	//*  34   64:iand            
	//*  35   65:iconst_2        
	//*  36   66:icmpne          78
			codedoutputstream.writeMessage(3, ((MessageLite) (getOptions())));
	//   37   69:aload_1         
	//   38   70:iconst_3        
	//   39   71:aload_0         
	//   40   72:invokevirtual   #269 <Method DescriptorProtos$ServiceOptions getOptions()>
	//   41   75:invokevirtual   #390 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		unknownFields.writeTo(codedoutputstream);
	//   42   78:aload_0         
	//   43   79:getfield        #146 <Field UnknownFieldSet unknownFields>
	//   44   82:aload_1         
	//   45   83:invokevirtual   #392 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   46   86:return          
	}

	private static final DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE = new DescriptorProtos$ServiceDescriptorProto();
	public static final int METHOD_FIELD_NUMBER = 2;
	public static final int NAME_FIELD_NUMBER = 1;
	public static final int OPTIONS_FIELD_NUMBER = 3;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.ServiceDescriptorProto parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.ServiceDescriptorProto(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$ServiceDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$ServiceDescriptorProto(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$ServiceDescriptorProto parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private byte memoizedIsInitialized;
	private List method_;
	private volatile Object name_;
	private DescriptorProtos.ServiceOptions options_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$ServiceDescriptorProto>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void DescriptorProtos$ServiceDescriptorProto()>
	//    3    7:putstatic       #48  <Field DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE>
	//    4   10:new             #11  <Class DescriptorProtos$ServiceDescriptorProto$1>
	//    5   13:dup             
	//    6   14:invokespecial   #49  <Method void DescriptorProtos$ServiceDescriptorProto$1()>
	//    7   17:putstatic       #51  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$13100(DescriptorProtos$ServiceDescriptorProto descriptorprotos$servicedescriptorproto)
	{
		return descriptorprotos$servicedescriptorproto.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object name_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$13102(DescriptorProtos$ServiceDescriptorProto descriptorprotos$servicedescriptorproto, Object obj)
	{
		descriptorprotos$servicedescriptorproto.name_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field Object name_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$13200(DescriptorProtos$ServiceDescriptorProto descriptorprotos$servicedescriptorproto)
	{
		return descriptorprotos$servicedescriptorproto.method_;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List method_>
	//    2    4:areturn         
	}

*/


/*
	static List access$13202(DescriptorProtos$ServiceDescriptorProto descriptorprotos$servicedescriptorproto, List list)
	{
		descriptorprotos$servicedescriptorproto.method_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field List method_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static DescriptorProtos.ServiceOptions access$13302(DescriptorProtos$ServiceDescriptorProto descriptorprotos$servicedescriptorproto, DescriptorProtos.ServiceOptions serviceoptions)
	{
		descriptorprotos$servicedescriptorproto.options_ = serviceoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field DescriptorProtos$ServiceOptions options_>
		return serviceoptions;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$13402(DescriptorProtos$ServiceDescriptorProto descriptorprotos$servicedescriptorproto, int i)
	{
		descriptorprotos$servicedescriptorproto.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #97  <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$ServiceDescriptorProto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #55  <Field byte memoizedIsInitialized>
		name_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #57  <String "">
	//    7   12:putfield        #59  <Field Object name_>
		method_ = Collections.emptyList();
	//    8   15:aload_0         
	//    9   16:invokestatic    #65  <Method List Collections.emptyList()>
	//   10   19:putfield        #67  <Field List method_>
	//   11   22:return          
	}

	private DescriptorProtos$ServiceDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		int j1;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void DescriptorProtos$ServiceDescriptorProto()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #74  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #75  <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #81  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          12
		j1 = 0;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L14:
		int k;
		int l;
		int i1;
		if(j1 != 0)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            407
		l = i;
	//   16   31:iload_3         
	//   17   32:istore          6
		i1 = i;
	//   18   34:iload_3         
	//   19   35:istore          7
		k = i;
	//   20   37:iload_3         
	//   21   38:istore          5
		int l1 = codedinputstream.readTag();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #87  <Method int CodedInputStream.readTag()>
	//   24   44:istore          10
		l1;
	//   25   46:iload           10
		JVM INSTR lookupswitch 4: default 503
	//	               0: 506
	//	               10: 130
	//	               18: 189
	//	               26: 265;
	//   26   48:lookupswitch    4: default 503
	//	               0: 506
	//	               10: 130
	//	               18: 189
	//	               26: 265
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		int j;
		int k1;
		k1 = i;
	//   27   92:iload_3         
	//   28   93:istore          9
		j = j1;
	//   29   95:iload           8
	//   30   97:istore          4
		l = i;
	//   31   99:iload_3         
	//   32  100:istore          6
		i1 = i;
	//   33  102:iload_3         
	//   34  103:istore          7
		k = i;
	//   35  105:iload_3         
	//   36  106:istore          5
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, l1))
	//*  37  108:aload_0         
	//*  38  109:aload_1         
	//*  39  110:aload           12
	//*  40  112:aload_2         
	//*  41  113:iload           10
	//*  42  115:invokevirtual   #91  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  43  118:ifne            397
		{
			j = 1;
	//   44  121:iconst_1        
	//   45  122:istore          4
			k1 = i;
	//   46  124:iload_3         
	//   47  125:istore          9
		}
		  goto _L6
	//*  48  127:goto            397
_L3:
		l = i;
	//   49  130:iload_3         
	//   50  131:istore          6
		i1 = i;
	//   51  133:iload_3         
	//   52  134:istore          7
		k = i;
	//   53  136:iload_3         
	//   54  137:istore          5
		Object obj = ((Object) (codedinputstream.readBytes()));
	//   55  139:aload_1         
	//   56  140:invokevirtual   #95  <Method ByteString CodedInputStream.readBytes()>
	//   57  143:astore          11
		l = i;
	//   58  145:iload_3         
	//   59  146:istore          6
		i1 = i;
	//   60  148:iload_3         
	//   61  149:istore          7
		k = i;
	//   62  151:iload_3         
	//   63  152:istore          5
		bitField0_ = bitField0_ | 1;
	//   64  154:aload_0         
	//   65  155:aload_0         
	//   66  156:getfield        #97  <Field int bitField0_>
	//   67  159:iconst_1        
	//   68  160:ior             
	//   69  161:putfield        #97  <Field int bitField0_>
		l = i;
	//   70  164:iload_3         
	//   71  165:istore          6
		i1 = i;
	//   72  167:iload_3         
	//   73  168:istore          7
		k = i;
	//   74  170:iload_3         
	//   75  171:istore          5
		name_ = obj;
	//   76  173:aload_0         
	//   77  174:aload           11
	//   78  176:putfield        #59  <Field Object name_>
		k1 = i;
	//   79  179:iload_3         
	//   80  180:istore          9
		j = j1;
	//   81  182:iload           8
	//   82  184:istore          4
		  goto _L6
	//*  83  186:goto            397
_L4:
		j = i;
	//   84  189:iload_3         
	//   85  190:istore          4
		if((i & 2) == 2) goto _L8; else goto _L7
	//   86  192:iload_3         
	//   87  193:iconst_2        
	//   88  194:iand            
	//   89  195:iconst_2        
	//   90  196:icmpeq          224
_L7:
		l = i;
	//   91  199:iload_3         
	//   92  200:istore          6
		i1 = i;
	//   93  202:iload_3         
	//   94  203:istore          7
		k = i;
	//   95  205:iload_3         
	//   96  206:istore          5
		method_ = ((List) (new ArrayList()));
	//   97  208:aload_0         
	//   98  209:new             #99  <Class ArrayList>
	//   99  212:dup             
	//  100  213:invokespecial   #100 <Method void ArrayList()>
	//  101  216:putfield        #67  <Field List method_>
		j = i | 2;
	//  102  219:iload_3         
	//  103  220:iconst_2        
	//  104  221:ior             
	//  105  222:istore          4
_L8:
		l = j;
	//  106  224:iload           4
	//  107  226:istore          6
		i1 = j;
	//  108  228:iload           4
	//  109  230:istore          7
		k = j;
	//  110  232:iload           4
	//  111  234:istore          5
		method_.add(((Object) (codedinputstream.readMessage(DescriptorProtos.MethodDescriptorProto.PARSER, extensionregistrylite))));
	//  112  236:aload_0         
	//  113  237:getfield        #67  <Field List method_>
	//  114  240:aload_1         
	//  115  241:getstatic       #103 <Field Parser DescriptorProtos$MethodDescriptorProto.PARSER>
	//  116  244:aload_2         
	//  117  245:invokevirtual   #107 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  118  248:invokeinterface #113 <Method boolean List.add(Object)>
	//  119  253:pop             
		k1 = j;
	//  120  254:iload           4
	//  121  256:istore          9
		j = j1;
	//  122  258:iload           8
	//  123  260:istore          4
		  goto _L6
	//* 124  262:goto            397
_L5:
		obj = null;
	//  125  265:aconst_null     
	//  126  266:astore          11
		l = i;
	//  127  268:iload_3         
	//  128  269:istore          6
		i1 = i;
	//  129  271:iload_3         
	//  130  272:istore          7
		k = i;
	//  131  274:iload_3         
	//  132  275:istore          5
		if((bitField0_ & 2) != 2) goto _L10; else goto _L9
	//  133  277:aload_0         
	//  134  278:getfield        #97  <Field int bitField0_>
	//  135  281:iconst_2        
	//  136  282:iand            
	//  137  283:iconst_2        
	//  138  284:icmpne          305
_L9:
		l = i;
	//  139  287:iload_3         
	//  140  288:istore          6
		i1 = i;
	//  141  290:iload_3         
	//  142  291:istore          7
		k = i;
	//  143  293:iload_3         
	//  144  294:istore          5
		obj = ((Object) (options_.toBuilder()));
	//  145  296:aload_0         
	//  146  297:getfield        #115 <Field DescriptorProtos$ServiceOptions options_>
	//  147  300:invokevirtual   #121 <Method DescriptorProtos$ServiceOptions$Builder DescriptorProtos$ServiceOptions.toBuilder()>
	//  148  303:astore          11
_L10:
		l = i;
	//  149  305:iload_3         
	//  150  306:istore          6
		i1 = i;
	//  151  308:iload_3         
	//  152  309:istore          7
		k = i;
	//  153  311:iload_3         
	//  154  312:istore          5
		options_ = (DescriptorProtos.ServiceOptions)codedinputstream.readMessage(DescriptorProtos.ServiceOptions.PARSER, extensionregistrylite);
	//  155  314:aload_0         
	//  156  315:aload_1         
	//  157  316:getstatic       #122 <Field Parser DescriptorProtos$ServiceOptions.PARSER>
	//  158  319:aload_2         
	//  159  320:invokevirtual   #107 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  160  323:checkcast       #117 <Class DescriptorProtos$ServiceOptions>
	//  161  326:putfield        #115 <Field DescriptorProtos$ServiceOptions options_>
		if(obj == null) goto _L12; else goto _L11
	//  162  329:aload           11
	//  163  331:ifnull          371
_L11:
		l = i;
	//  164  334:iload_3         
	//  165  335:istore          6
		i1 = i;
	//  166  337:iload_3         
	//  167  338:istore          7
		k = i;
	//  168  340:iload_3         
	//  169  341:istore          5
		((DescriptorProtos$ServiceOptions$Builder) (obj)).mergeFrom(options_);
	//  170  343:aload           11
	//  171  345:aload_0         
	//  172  346:getfield        #115 <Field DescriptorProtos$ServiceOptions options_>
	//  173  349:invokevirtual   #128 <Method DescriptorProtos$ServiceOptions$Builder DescriptorProtos$ServiceOptions$Builder.mergeFrom(DescriptorProtos$ServiceOptions)>
	//  174  352:pop             
		l = i;
	//  175  353:iload_3         
	//  176  354:istore          6
		i1 = i;
	//  177  356:iload_3         
	//  178  357:istore          7
		k = i;
	//  179  359:iload_3         
	//  180  360:istore          5
		options_ = ((DescriptorProtos$ServiceOptions$Builder) (obj)).buildPartial();
	//  181  362:aload_0         
	//  182  363:aload           11
	//  183  365:invokevirtual   #132 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceOptions$Builder.buildPartial()>
	//  184  368:putfield        #115 <Field DescriptorProtos$ServiceOptions options_>
_L12:
		l = i;
	//  185  371:iload_3         
	//  186  372:istore          6
		i1 = i;
	//  187  374:iload_3         
	//  188  375:istore          7
		k = i;
	//  189  377:iload_3         
	//  190  378:istore          5
		bitField0_ = bitField0_ | 2;
	//  191  380:aload_0         
	//  192  381:aload_0         
	//  193  382:getfield        #97  <Field int bitField0_>
	//  194  385:iconst_2        
	//  195  386:ior             
	//  196  387:putfield        #97  <Field int bitField0_>
		j = j1;
	//  197  390:iload           8
	//  198  392:istore          4
		k1 = i;
	//  199  394:iload_3         
	//  200  395:istore          9
_L6:
		i = k1;
	//  201  397:iload           9
	//  202  399:istore_3        
		j1 = j;
	//  203  400:iload           4
	//  204  402:istore          8
		if(true) goto _L14; else goto _L13
	//  205  404:goto            26
_L13:
		if((i & 2) == 2)
	//* 206  407:iload_3         
	//* 207  408:iconst_2        
	//* 208  409:iand            
	//* 209  410:iconst_2        
	//* 210  411:icmpne          425
			method_ = Collections.unmodifiableList(method_);
	//  211  414:aload_0         
	//  212  415:aload_0         
	//  213  416:getfield        #67  <Field List method_>
	//  214  419:invokestatic    #136 <Method List Collections.unmodifiableList(List)>
	//  215  422:putfield        #67  <Field List method_>
		unknownFields = builder.build();
	//  216  425:aload_0         
	//  217  426:aload           12
	//  218  428:invokevirtual   #142 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  219  431:putfield        #146 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  220  434:aload_0         
	//  221  435:invokevirtual   #149 <Method void makeExtensionsImmutable()>
		return;
	//  222  438:return          
		codedinputstream;
	//  223  439:astore_1        
		k = l;
	//  224  440:iload           6
	//  225  442:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  226  444:aload_1         
	//  227  445:aload_0         
	//  228  446:invokevirtual   #153 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  229  449:athrow          
		codedinputstream;
	//  230  450:astore_1        
		k = i1;
	//  231  451:iload           7
	//  232  453:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  233  455:new             #70  <Class InvalidProtocolBufferException>
	//  234  458:dup             
	//  235  459:aload_1         
	//  236  460:invokespecial   #156 <Method void InvalidProtocolBufferException(IOException)>
	//  237  463:aload_0         
	//  238  464:invokevirtual   #153 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  239  467:athrow          
		codedinputstream;
	//  240  468:astore_1        
		if((k & 2) == 2)
	//* 241  469:iload           5
	//* 242  471:iconst_2        
	//* 243  472:iand            
	//* 244  473:iconst_2        
	//* 245  474:icmpne          488
			method_ = Collections.unmodifiableList(method_);
	//  246  477:aload_0         
	//  247  478:aload_0         
	//  248  479:getfield        #67  <Field List method_>
	//  249  482:invokestatic    #136 <Method List Collections.unmodifiableList(List)>
	//  250  485:putfield        #67  <Field List method_>
		unknownFields = builder.build();
	//  251  488:aload_0         
	//  252  489:aload           12
	//  253  491:invokevirtual   #142 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  254  494:putfield        #146 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  255  497:aload_0         
	//  256  498:invokevirtual   #149 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  257  501:aload_1         
	//  258  502:athrow          
	//* 259  503:goto            92
_L2:
		j = 1;
	//  260  506:iconst_1        
	//  261  507:istore          4
		k1 = i;
	//  262  509:iload_3         
	//  263  510:istore          9
		  goto _L6
	//* 264  512:goto            397
	}

	DescriptorProtos$ServiceDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #160 <Method void DescriptorProtos$ServiceDescriptorProto(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$ServiceDescriptorProto(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #55  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$ServiceDescriptorProto(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #167 <Method void DescriptorProtos$ServiceDescriptorProto(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
