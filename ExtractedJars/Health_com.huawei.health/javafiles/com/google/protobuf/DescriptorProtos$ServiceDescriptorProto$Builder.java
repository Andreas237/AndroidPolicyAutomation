// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, RepeatedFieldBuilderV3, SingleFieldBuilderV3, GeneratedMessageV3, 
//			ByteString, InvalidProtocolBufferException, Parser, Message, 
//			MessageLite, CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$ServiceDescriptorProto$Builder extends GeneratedMessageV3.Builder
	implements 
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

	public DescriptorProtos$ServiceDescriptorProto$Builder addAllMethod(Iterable iterable)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder addMethod(int i, DescriptorProtos.MethodDescriptorProto.Builder builder)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder addMethod(int i, DescriptorProtos.MethodDescriptorProto methoddescriptorproto)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder addMethod(DescriptorProtos.MethodDescriptorProto.Builder builder)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder addMethod(DescriptorProtos.MethodDescriptorProto methoddescriptorproto)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$ServiceDescriptorProto$Builder)super.addRepeatedField(fielddescriptor, obj);
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
		DescriptorProtos.ServiceDescriptorProto.access$13102(servicedescriptorproto, name_);
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
			DescriptorProtos.ServiceDescriptorProto.access$13202(servicedescriptorproto, method_);
	//   43   76:aload           4
	//   44   78:aload_0         
	//   45   79:getfield        #44  <Field List method_>
	//   46   82:invokestatic    #214 <Method List DescriptorProtos$ServiceDescriptorProto.access$13202(DescriptorProtos$ServiceDescriptorProto, List)>
	//   47   85:pop             
		} else
	//*  48   86:goto            102
		{
			DescriptorProtos.ServiceDescriptorProto.access$13202(servicedescriptorproto, methodBuilder_.build());
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
			DescriptorProtos.ServiceDescriptorProto.access$13302(servicedescriptorproto, options_);
	//   69  122:aload           4
	//   70  124:aload_0         
	//   71  125:getfield        #46  <Field DescriptorProtos$ServiceOptions options_>
	//   72  128:invokestatic    #220 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceDescriptorProto.access$13302(DescriptorProtos$ServiceDescriptorProto, DescriptorProtos$ServiceOptions)>
	//   73  131:pop             
		else
	//*  74  132:goto            151
			DescriptorProtos.ServiceDescriptorProto.access$13302(servicedescriptorproto, (DescriptorProtos.ServiceOptions)optionsBuilder_.build());
	//   75  135:aload           4
	//   76  137:aload_0         
	//   77  138:getfield        #93  <Field SingleFieldBuilderV3 optionsBuilder_>
	//   78  141:invokevirtual   #223 <Method AbstractMessage SingleFieldBuilderV3.build()>
	//   79  144:checkcast       #225 <Class DescriptorProtos$ServiceOptions>
	//   80  147:invokestatic    #220 <Method DescriptorProtos$ServiceOptions DescriptorProtos$ServiceDescriptorProto.access$13302(DescriptorProtos$ServiceDescriptorProto, DescriptorProtos$ServiceOptions)>
	//   81  150:pop             
		DescriptorProtos.ServiceDescriptorProto.access$13402(servicedescriptorproto, j);
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

	public DescriptorProtos$ServiceDescriptorProto$Builder clear()
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

	public DescriptorProtos$ServiceDescriptorProto$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$ServiceDescriptorProto$Builder)super.clearField(fielddescriptor);
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

	public DescriptorProtos$ServiceDescriptorProto$Builder clearMethod()
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

	public DescriptorProtos$ServiceDescriptorProto$Builder clearName()
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

	public DescriptorProtos$ServiceDescriptorProto$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$ServiceDescriptorProto$Builder)super.clearOneof(oneofdescriptor);
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

	public DescriptorProtos$ServiceDescriptorProto$Builder clearOptions()
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

	public DescriptorProtos$ServiceDescriptorProto$Builder clone()
	{
		return (DescriptorProtos$ServiceDescriptorProto$Builder)super.clone();
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

	public DescriptorProtos$MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i)
	{
		if(methodBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field RepeatedFieldBuilderV3 methodBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos$MethodDescriptorProtoOrBuilder)method_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field List method_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #292 <Method Object List.get(int)>
	//    7   17:checkcast       #323 <Class DescriptorProtos$MethodDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return (DescriptorProtos$MethodDescriptorProtoOrBuilder)methodBuilder_.getMessageOrBuilder(i);
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

	public DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
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
			name_ = DescriptorProtos.ServiceDescriptorProto.access$13100(servicedescriptorproto);
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
			if(!DescriptorProtos.ServiceDescriptorProto.access$13200(servicedescriptorproto).isEmpty())
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
					method_ = DescriptorProtos.ServiceDescriptorProto.access$13200(servicedescriptorproto);
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
					method_.addAll(((java.util.Collection) (DescriptorProtos.ServiceDescriptorProto.access$13200(servicedescriptorproto))));
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
		if(!DescriptorProtos.ServiceDescriptorProto.access$13200(servicedescriptorproto).isEmpty())
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
				method_ = DescriptorProtos.ServiceDescriptorProto.access$13200(servicedescriptorproto);
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
				methodBuilder_.addAllMessages(((Iterable) (DescriptorProtos.ServiceDescriptorProto.access$13200(servicedescriptorproto))));
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

	public DescriptorProtos$ServiceDescriptorProto$Builder mergeFrom(Message message)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder mergeOptions(DescriptorProtos.ServiceOptions serviceoptions)
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

	public final DescriptorProtos$ServiceDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$ServiceDescriptorProto$Builder)super.mergeUnknownFields(unknownfieldset);
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

	public DescriptorProtos$ServiceDescriptorProto$Builder removeMethod(int i)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$ServiceDescriptorProto$Builder)super.setField(fielddescriptor, obj);
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

	public DescriptorProtos$ServiceDescriptorProto$Builder setMethod(int i, DescriptorProtos.MethodDescriptorProto.Builder builder)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder setMethod(int i, DescriptorProtos.MethodDescriptorProto methoddescriptorproto)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder setName(String s)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder setNameBytes(ByteString bytestring)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder setOptions(DescriptorProtos.ServiceOptions.Builder builder)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder setOptions(DescriptorProtos.ServiceOptions serviceoptions)
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

	public DescriptorProtos$ServiceDescriptorProto$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$ServiceDescriptorProto$Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

	public final DescriptorProtos$ServiceDescriptorProto$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$ServiceDescriptorProto$Builder)super.setUnknownFields(unknownfieldset);
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

	private DescriptorProtos$ServiceDescriptorProto$Builder()
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

	DescriptorProtos$ServiceDescriptorProto$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void DescriptorProtos$ServiceDescriptorProto$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$ServiceDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	DescriptorProtos$ServiceDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void DescriptorProtos$ServiceDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
