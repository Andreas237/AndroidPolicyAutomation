// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			ApiOrBuilder, Api, ApiProto, RepeatedFieldBuilderV3, 
//			SingleFieldBuilderV3, GeneratedMessageV3, Method, Mixin, 
//			Option, SourceContext, MethodOrBuilder, MixinOrBuilder, 
//			ByteString, OptionOrBuilder, SourceContextOrBuilder, Syntax, 
//			InvalidProtocolBufferException, Parser, AbstractMessageLite, Message, 
//			MessageLite, CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class Api$Builder extends sageV3.Builder
	implements ApiOrBuilder
{

	private void ensureMethodsIsMutable()
	{
		if((bitField0_ & 2) != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int bitField0_>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          35
		{
			methods_ = ((List) (new ArrayList(((java.util.Collection) (methods_)))));
	//    6   10:aload_0         
	//    7   11:new             #77  <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #51  <Field List methods_>
	//   11   19:invokespecial   #80  <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #51  <Field List methods_>
			bitField0_ = bitField0_ | 2;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #75  <Field int bitField0_>
	//   16   30:iconst_2        
	//   17   31:ior             
	//   18   32:putfield        #75  <Field int bitField0_>
		}
	//   19   35:return          
	}

	private void ensureMixinsIsMutable()
	{
		if((bitField0_ & 0x20) != 32)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int bitField0_>
	//*   2    4:bipush          32
	//*   3    6:iand            
	//*   4    7:bipush          32
	//*   5    9:icmpeq          38
		{
			mixins_ = ((List) (new ArrayList(((java.util.Collection) (mixins_)))));
	//    6   12:aload_0         
	//    7   13:new             #77  <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #59  <Field List mixins_>
	//   11   21:invokespecial   #80  <Method void ArrayList(java.util.Collection)>
	//   12   24:putfield        #59  <Field List mixins_>
			bitField0_ = bitField0_ | 0x20;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #75  <Field int bitField0_>
	//   16   32:bipush          32
	//   17   34:ior             
	//   18   35:putfield        #75  <Field int bitField0_>
		}
	//   19   38:return          
	}

	private void ensureOptionsIsMutable()
	{
		if((bitField0_ & 4) != 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int bitField0_>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:iconst_4        
	//*   5    7:icmpeq          35
		{
			options_ = ((List) (new ArrayList(((java.util.Collection) (options_)))));
	//    6   10:aload_0         
	//    7   11:new             #77  <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #53  <Field List options_>
	//   11   19:invokespecial   #80  <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #53  <Field List options_>
			bitField0_ = bitField0_ | 4;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #75  <Field int bitField0_>
	//   16   30:iconst_4        
	//   17   31:ior             
	//   18   32:putfield        #75  <Field int bitField0_>
		}
	//   19   35:return          
	}

	public static final Descriptor getDescriptor()
	{
		return ApiProto.internal_static_google_protobuf_Api_descriptor;
	//    0    0:getstatic       #90  <Field Descriptors$Descriptor ApiProto.internal_static_google_protobuf_Api_descriptor>
	//    1    3:areturn         
	}

	private RepeatedFieldBuilderV3 getMethodsFieldBuilder()
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = methods_;
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field List methods_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 2) == 2)
	//*   6   12:aload_0         
	//*   7   13:getfield        #75  <Field int bitField0_>
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
			methodsBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((age.BuilderParent) (getParentForChildren())), isClean());
	//   17   29:aload_0         
	//   18   30:new             #96  <Class RepeatedFieldBuilderV3>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:invokevirtual   #100 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   40:aload_0         
	//   25   41:invokevirtual   #104 <Method boolean isClean()>
	//   26   44:invokespecial   #107 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   47:putfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
			methods_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #51  <Field List methods_>
		}
		return methodsBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   33   59:areturn         
	}

	private RepeatedFieldBuilderV3 getMixinsFieldBuilder()
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       57
		{
			List list = mixins_;
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field List mixins_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 0x20) == 32)
	//*   6   12:aload_0         
	//*   7   13:getfield        #75  <Field int bitField0_>
	//*   8   16:bipush          32
	//*   9   18:iand            
	//*  10   19:bipush          32
	//*  11   21:icmpne          29
				flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_1        
			else
	//*  14   26:goto            31
				flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_1        
			mixinsBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((age.BuilderParent) (getParentForChildren())), isClean());
	//   17   31:aload_0         
	//   18   32:new             #96  <Class RepeatedFieldBuilderV3>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #100 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   42:aload_0         
	//   25   43:invokevirtual   #104 <Method boolean isClean()>
	//   26   46:invokespecial   #107 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   49:putfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
			mixins_ = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #59  <Field List mixins_>
		}
		return mixinsBuilder_;
	//   31   57:aload_0         
	//   32   58:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   33   61:areturn         
	}

	private RepeatedFieldBuilderV3 getOptionsFieldBuilder()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = options_;
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field List options_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 4) == 4)
	//*   6   12:aload_0         
	//*   7   13:getfield        #75  <Field int bitField0_>
	//*   8   16:iconst_4        
	//*   9   17:iand            
	//*  10   18:iconst_4        
	//*  11   19:icmpne          27
				flag = true;
	//   12   22:iconst_1        
	//   13   23:istore_1        
			else
	//*  14   24:goto            29
				flag = false;
	//   15   27:iconst_0        
	//   16   28:istore_1        
			optionsBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((age.BuilderParent) (getParentForChildren())), isClean());
	//   17   29:aload_0         
	//   18   30:new             #96  <Class RepeatedFieldBuilderV3>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:invokevirtual   #100 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   40:aload_0         
	//   25   41:invokevirtual   #104 <Method boolean isClean()>
	//   26   44:invokespecial   #107 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   47:putfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
			options_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #53  <Field List options_>
		}
		return optionsBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   33   59:areturn         
	}

	private SingleFieldBuilderV3 getSourceContextFieldBuilder()
	{
		if(sourceContextBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//*   2    4:ifnonnull       35
		{
			sourceContextBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getSourceContext())), ((age.BuilderParent) (getParentForChildren())), isClean());
	//    3    7:aload_0         
	//    4    8:new             #123 <Class SingleFieldBuilderV3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #127 <Method SourceContext getSourceContext()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #100 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #104 <Method boolean isClean()>
	//   12   24:invokespecial   #130 <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
	//   13   27:putfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
			sourceContext_ = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #57  <Field SourceContext sourceContext_>
		}
		return sourceContextBuilder_;
	//   17   35:aload_0         
	//   18   36:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//   19   39:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #137 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            21
		{
			getMethodsFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #139 <Method RepeatedFieldBuilderV3 getMethodsFieldBuilder()>
	//    4   10:pop             
			getOptionsFieldBuilder();
	//    5   11:aload_0         
	//    6   12:invokespecial   #141 <Method RepeatedFieldBuilderV3 getOptionsFieldBuilder()>
	//    7   15:pop             
			getMixinsFieldBuilder();
	//    8   16:aload_0         
	//    9   17:invokespecial   #143 <Method RepeatedFieldBuilderV3 getMixinsFieldBuilder()>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public Api$Builder addAllMethods(Iterable iterable)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureMethodsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #147 <Method void ensureMethodsIsMutable()>
			ageLite.Builder.addAll(iterable, methods_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field List methods_>
	//    8   16:invokestatic    #153 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			methodsBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public Api$Builder addAllMixins(Iterable iterable)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureMixinsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureMixinsIsMutable()>
			ageLite.Builder.addAll(iterable, mixins_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #59  <Field List mixins_>
	//    8   16:invokestatic    #153 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			mixinsBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public Api$Builder addAllOptions(Iterable iterable)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureOptionsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #168 <Method void ensureOptionsIsMutable()>
			ageLite.Builder.addAll(iterable, options_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #53  <Field List options_>
	//    8   16:invokestatic    #153 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			optionsBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public Api$Builder addMethods(int i, er er)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureMethodsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #147 <Method void ensureMethodsIsMutable()>
			methods_.add(i, ((Object) (er.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field List methods_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #177 <Method Method Method$Builder.build()>
	//   10   20:invokeinterface #183 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			methodsBuilder_.addMessage(i, ((AbstractMessage) (er.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #177 <Method Method Method$Builder.build()>
	//   20   40:invokevirtual   #187 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public Api$Builder addMethods(int i, Method method)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(method == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureMethodsIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #147 <Method void ensureMethodsIsMutable()>
				methods_.add(i, ((Object) (method)));
	//   11   23:aload_0         
	//   12   24:getfield        #51  <Field List methods_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #183 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			methodsBuilder_.addMessage(i, ((AbstractMessage) (method)));
	//   20   40:aload_0         
	//   21   41:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #187 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public Api$Builder addMethods(er er)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureMethodsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #147 <Method void ensureMethodsIsMutable()>
			methods_.add(((Object) (er.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field List methods_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #177 <Method Method Method$Builder.build()>
	//    9   19:invokeinterface #195 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			methodsBuilder_.addMessage(((AbstractMessage) (er.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #177 <Method Method Method$Builder.build()>
	//   19   39:invokevirtual   #198 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public Api$Builder addMethods(Method method)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(method == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureMethodsIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #147 <Method void ensureMethodsIsMutable()>
				methods_.add(((Object) (method)));
	//   11   23:aload_0         
	//   12   24:getfield        #51  <Field List methods_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #195 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			methodsBuilder_.addMessage(((AbstractMessage) (method)));
	//   20   40:aload_0         
	//   21   41:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #198 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public er addMethodsBuilder()
	{
		return (er)getMethodsFieldBuilder().addBuilder(((AbstractMessage) (Method.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getMethodsFieldBuilder()>
	//    2    4:invokestatic    #206 <Method Method Method.getDefaultInstance()>
	//    3    7:invokevirtual   #210 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #173 <Class Method$Builder>
	//    5   13:areturn         
	}

	public er addMethodsBuilder(int i)
	{
		return (er)getMethodsFieldBuilder().addBuilder(i, ((AbstractMessage) (Method.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getMethodsFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #206 <Method Method Method.getDefaultInstance()>
	//    4    8:invokevirtual   #214 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #173 <Class Method$Builder>
	//    6   14:areturn         
	}

	public Api$Builder addMixins(int i, r r)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureMixinsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureMixinsIsMutable()>
			mixins_.add(i, ((Object) (r.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #59  <Field List mixins_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #221 <Method Mixin Mixin$Builder.build()>
	//   10   20:invokeinterface #183 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			mixinsBuilder_.addMessage(i, ((AbstractMessage) (r.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #221 <Method Mixin Mixin$Builder.build()>
	//   20   40:invokevirtual   #187 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public Api$Builder addMixins(int i, Mixin mixin)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(mixin == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureMixinsIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #164 <Method void ensureMixinsIsMutable()>
				mixins_.add(i, ((Object) (mixin)));
	//   11   23:aload_0         
	//   12   24:getfield        #59  <Field List mixins_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #183 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			mixinsBuilder_.addMessage(i, ((AbstractMessage) (mixin)));
	//   20   40:aload_0         
	//   21   41:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #187 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public Api$Builder addMixins(r r)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureMixinsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureMixinsIsMutable()>
			mixins_.add(((Object) (r.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #59  <Field List mixins_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #221 <Method Mixin Mixin$Builder.build()>
	//    9   19:invokeinterface #195 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			mixinsBuilder_.addMessage(((AbstractMessage) (r.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #221 <Method Mixin Mixin$Builder.build()>
	//   19   39:invokevirtual   #198 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public Api$Builder addMixins(Mixin mixin)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(mixin == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureMixinsIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #164 <Method void ensureMixinsIsMutable()>
				mixins_.add(((Object) (mixin)));
	//   11   23:aload_0         
	//   12   24:getfield        #59  <Field List mixins_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #195 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			mixinsBuilder_.addMessage(((AbstractMessage) (mixin)));
	//   20   40:aload_0         
	//   21   41:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #198 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public r addMixinsBuilder()
	{
		return (r)getMixinsFieldBuilder().addBuilder(((AbstractMessage) (Mixin.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method RepeatedFieldBuilderV3 getMixinsFieldBuilder()>
	//    2    4:invokestatic    #230 <Method Mixin Mixin.getDefaultInstance()>
	//    3    7:invokevirtual   #210 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #218 <Class Mixin$Builder>
	//    5   13:areturn         
	}

	public r addMixinsBuilder(int i)
	{
		return (r)getMixinsFieldBuilder().addBuilder(i, ((AbstractMessage) (Mixin.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method RepeatedFieldBuilderV3 getMixinsFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #230 <Method Mixin Mixin.getDefaultInstance()>
	//    4    8:invokevirtual   #214 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #218 <Class Mixin$Builder>
	//    6   14:areturn         
	}

	public Api$Builder addOptions(int i, er er)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureOptionsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #168 <Method void ensureOptionsIsMutable()>
			options_.add(i, ((Object) (er.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field List options_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #238 <Method Option Option$Builder.build()>
	//   10   20:invokeinterface #183 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			optionsBuilder_.addMessage(i, ((AbstractMessage) (er.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #238 <Method Option Option$Builder.build()>
	//   20   40:invokevirtual   #187 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public Api$Builder addOptions(int i, Option option)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(option == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureOptionsIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #168 <Method void ensureOptionsIsMutable()>
				options_.add(i, ((Object) (option)));
	//   11   23:aload_0         
	//   12   24:getfield        #53  <Field List options_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #183 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			optionsBuilder_.addMessage(i, ((AbstractMessage) (option)));
	//   20   40:aload_0         
	//   21   41:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #187 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public Api$Builder addOptions(er er)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureOptionsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #168 <Method void ensureOptionsIsMutable()>
			options_.add(((Object) (er.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field List options_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #238 <Method Option Option$Builder.build()>
	//    9   19:invokeinterface #195 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			optionsBuilder_.addMessage(((AbstractMessage) (er.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #238 <Method Option Option$Builder.build()>
	//   19   39:invokevirtual   #198 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public Api$Builder addOptions(Option option)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(option == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureOptionsIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #168 <Method void ensureOptionsIsMutable()>
				options_.add(((Object) (option)));
	//   11   23:aload_0         
	//   12   24:getfield        #53  <Field List options_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #195 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			optionsBuilder_.addMessage(((AbstractMessage) (option)));
	//   20   40:aload_0         
	//   21   41:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #198 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public er addOptionsBuilder()
	{
		return (er)getOptionsFieldBuilder().addBuilder(((AbstractMessage) (Option.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method RepeatedFieldBuilderV3 getOptionsFieldBuilder()>
	//    2    4:invokestatic    #247 <Method Option Option.getDefaultInstance()>
	//    3    7:invokevirtual   #210 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #235 <Class Option$Builder>
	//    5   13:areturn         
	}

	public er addOptionsBuilder(int i)
	{
		return (er)getOptionsFieldBuilder().addBuilder(i, ((AbstractMessage) (Option.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method RepeatedFieldBuilderV3 getOptionsFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #247 <Method Option Option.getDefaultInstance()>
	//    4    8:invokevirtual   #214 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #235 <Class Option$Builder>
	//    6   14:areturn         
	}

	public Api$Builder addRepeatedField(FieldDescriptor fielddescriptor, Object obj)
	{
		return (Api$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #253 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class Api$Builder>
	//    5    9:areturn         
	}

	public volatile sageV3.Builder addRepeatedField(FieldDescriptor fielddescriptor, Object obj)
	{
		return ((sageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #255 <Method Api$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile der addRepeatedField(FieldDescriptor fielddescriptor, Object obj)
	{
		return ((der) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #255 <Method Api$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public Api build()
	{
		Api api = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #260 <Method Api buildPartial()>
	//    2    4:astore_1        
		if(!api.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #263 <Method boolean Api.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (api)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #267 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return api;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #270 <Method Api build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #270 <Method Api build()>
	//    2    4:areturn         
	}

	public Api buildPartial()
	{
		Api api = new Api(((sageV3.Builder) (this)), ((Api._cls1) (null)));
	//    0    0:new             #9   <Class Api>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #274 <Method void Api(GeneratedMessageV3$Builder, Api$1)>
	//    5    9:astore_2        
		int i = bitField0_;
	//    6   10:aload_0         
	//    7   11:getfield        #75  <Field int bitField0_>
	//    8   14:istore_1        
		Api.access$302(api, name_);
	//    9   15:aload_2         
	//   10   16:aload_0         
	//   11   17:getfield        #43  <Field Object name_>
	//   12   20:invokestatic    #278 <Method Object Api.access$302(Api, Object)>
	//   13   23:pop             
		if(methodsBuilder_ == null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*  16   28:ifnonnull       75
		{
			if((bitField0_ & 2) == 2)
	//*  17   31:aload_0         
	//*  18   32:getfield        #75  <Field int bitField0_>
	//*  19   35:iconst_2        
	//*  20   36:iand            
	//*  21   37:iconst_2        
	//*  22   38:icmpne          63
			{
				methods_ = Collections.unmodifiableList(methods_);
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:getfield        #51  <Field List methods_>
	//   26   46:invokestatic    #282 <Method List Collections.unmodifiableList(List)>
	//   27   49:putfield        #51  <Field List methods_>
				bitField0_ = bitField0_ & -3;
	//   28   52:aload_0         
	//   29   53:aload_0         
	//   30   54:getfield        #75  <Field int bitField0_>
	//   31   57:bipush          -3
	//   32   59:iand            
	//   33   60:putfield        #75  <Field int bitField0_>
			}
			Api.access$402(api, methods_);
	//   34   63:aload_2         
	//   35   64:aload_0         
	//   36   65:getfield        #51  <Field List methods_>
	//   37   68:invokestatic    #286 <Method List Api.access$402(Api, List)>
	//   38   71:pop             
		} else
	//*  39   72:goto            87
		{
			Api.access$402(api, methodsBuilder_.build());
	//   40   75:aload_2         
	//   41   76:aload_0         
	//   42   77:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   43   80:invokevirtual   #288 <Method List RepeatedFieldBuilderV3.build()>
	//   44   83:invokestatic    #286 <Method List Api.access$402(Api, List)>
	//   45   86:pop             
		}
		if(optionsBuilder_ == null)
	//*  46   87:aload_0         
	//*  47   88:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*  48   91:ifnonnull       138
		{
			if((bitField0_ & 4) == 4)
	//*  49   94:aload_0         
	//*  50   95:getfield        #75  <Field int bitField0_>
	//*  51   98:iconst_4        
	//*  52   99:iand            
	//*  53  100:iconst_4        
	//*  54  101:icmpne          126
			{
				options_ = Collections.unmodifiableList(options_);
	//   55  104:aload_0         
	//   56  105:aload_0         
	//   57  106:getfield        #53  <Field List options_>
	//   58  109:invokestatic    #282 <Method List Collections.unmodifiableList(List)>
	//   59  112:putfield        #53  <Field List options_>
				bitField0_ = bitField0_ & -5;
	//   60  115:aload_0         
	//   61  116:aload_0         
	//   62  117:getfield        #75  <Field int bitField0_>
	//   63  120:bipush          -5
	//   64  122:iand            
	//   65  123:putfield        #75  <Field int bitField0_>
			}
			Api.access$502(api, options_);
	//   66  126:aload_2         
	//   67  127:aload_0         
	//   68  128:getfield        #53  <Field List options_>
	//   69  131:invokestatic    #291 <Method List Api.access$502(Api, List)>
	//   70  134:pop             
		} else
	//*  71  135:goto            150
		{
			Api.access$502(api, optionsBuilder_.build());
	//   72  138:aload_2         
	//   73  139:aload_0         
	//   74  140:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   75  143:invokevirtual   #288 <Method List RepeatedFieldBuilderV3.build()>
	//   76  146:invokestatic    #291 <Method List Api.access$502(Api, List)>
	//   77  149:pop             
		}
		Api.access$602(api, version_);
	//   78  150:aload_2         
	//   79  151:aload_0         
	//   80  152:getfield        #55  <Field Object version_>
	//   81  155:invokestatic    #294 <Method Object Api.access$602(Api, Object)>
	//   82  158:pop             
		if(sourceContextBuilder_ == null)
	//*  83  159:aload_0         
	//*  84  160:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//*  85  163:ifnonnull       178
			Api.access$702(api, sourceContext_);
	//   86  166:aload_2         
	//   87  167:aload_0         
	//   88  168:getfield        #57  <Field SourceContext sourceContext_>
	//   89  171:invokestatic    #298 <Method SourceContext Api.access$702(Api, SourceContext)>
	//   90  174:pop             
		else
	//*  91  175:goto            193
			Api.access$702(api, (SourceContext)sourceContextBuilder_.build());
	//   92  178:aload_2         
	//   93  179:aload_0         
	//   94  180:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//   95  183:invokevirtual   #301 <Method AbstractMessage SingleFieldBuilderV3.build()>
	//   96  186:checkcast       #303 <Class SourceContext>
	//   97  189:invokestatic    #298 <Method SourceContext Api.access$702(Api, SourceContext)>
	//   98  192:pop             
		if(mixinsBuilder_ == null)
	//*  99  193:aload_0         
	//* 100  194:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//* 101  197:ifnonnull       246
		{
			if((bitField0_ & 0x20) == 32)
	//* 102  200:aload_0         
	//* 103  201:getfield        #75  <Field int bitField0_>
	//* 104  204:bipush          32
	//* 105  206:iand            
	//* 106  207:bipush          32
	//* 107  209:icmpne          234
			{
				mixins_ = Collections.unmodifiableList(mixins_);
	//  108  212:aload_0         
	//  109  213:aload_0         
	//  110  214:getfield        #59  <Field List mixins_>
	//  111  217:invokestatic    #282 <Method List Collections.unmodifiableList(List)>
	//  112  220:putfield        #59  <Field List mixins_>
				bitField0_ = bitField0_ & 0xffffffdf;
	//  113  223:aload_0         
	//  114  224:aload_0         
	//  115  225:getfield        #75  <Field int bitField0_>
	//  116  228:bipush          -33
	//  117  230:iand            
	//  118  231:putfield        #75  <Field int bitField0_>
			}
			Api.access$802(api, mixins_);
	//  119  234:aload_2         
	//  120  235:aload_0         
	//  121  236:getfield        #59  <Field List mixins_>
	//  122  239:invokestatic    #306 <Method List Api.access$802(Api, List)>
	//  123  242:pop             
		} else
	//* 124  243:goto            258
		{
			Api.access$802(api, mixinsBuilder_.build());
	//  125  246:aload_2         
	//  126  247:aload_0         
	//  127  248:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//  128  251:invokevirtual   #288 <Method List RepeatedFieldBuilderV3.build()>
	//  129  254:invokestatic    #306 <Method List Api.access$802(Api, List)>
	//  130  257:pop             
		}
		Api.access$902(api, syntax_);
	//  131  258:aload_2         
	//  132  259:aload_0         
	//  133  260:getfield        #61  <Field int syntax_>
	//  134  263:invokestatic    #310 <Method int Api.access$902(Api, int)>
	//  135  266:pop             
		Api.access$1002(api, 0);
	//  136  267:aload_2         
	//  137  268:iconst_0        
	//  138  269:invokestatic    #313 <Method int Api.access$1002(Api, int)>
	//  139  272:pop             
		onBuilt();
	//  140  273:aload_0         
	//  141  274:invokevirtual   #316 <Method void onBuilt()>
		return api;
	//  142  277:aload_2         
	//  143  278:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #260 <Method Api buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #260 <Method Api buildPartial()>
	//    2    4:areturn         
	}

	public volatile age.Builder clear()
	{
		return ((age.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method Api$Builder clear()>
	//    2    4:areturn         
	}

	public Api$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #324 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #41  <String "">
	//    5    8:putfield        #43  <Field Object name_>
		if(methodsBuilder_ == null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   8   15:ifnonnull       39
		{
			methods_ = Collections.emptyList();
	//    9   18:aload_0         
	//   10   19:invokestatic    #49  <Method List Collections.emptyList()>
	//   11   22:putfield        #51  <Field List methods_>
			bitField0_ = bitField0_ & -3;
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:getfield        #75  <Field int bitField0_>
	//   15   30:bipush          -3
	//   16   32:iand            
	//   17   33:putfield        #75  <Field int bitField0_>
		} else
	//*  18   36:goto            46
		{
			methodsBuilder_.clear();
	//   19   39:aload_0         
	//   20   40:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   21   43:invokevirtual   #326 <Method void RepeatedFieldBuilderV3.clear()>
		}
		if(optionsBuilder_ == null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*  24   50:ifnonnull       74
		{
			options_ = Collections.emptyList();
	//   25   53:aload_0         
	//   26   54:invokestatic    #49  <Method List Collections.emptyList()>
	//   27   57:putfield        #53  <Field List options_>
			bitField0_ = bitField0_ & -5;
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #75  <Field int bitField0_>
	//   31   65:bipush          -5
	//   32   67:iand            
	//   33   68:putfield        #75  <Field int bitField0_>
		} else
	//*  34   71:goto            81
		{
			optionsBuilder_.clear();
	//   35   74:aload_0         
	//   36   75:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   37   78:invokevirtual   #326 <Method void RepeatedFieldBuilderV3.clear()>
		}
		version_ = "";
	//   38   81:aload_0         
	//   39   82:ldc1            #41  <String "">
	//   40   84:putfield        #55  <Field Object version_>
		if(sourceContextBuilder_ == null)
	//*  41   87:aload_0         
	//*  42   88:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//*  43   91:ifnonnull       102
		{
			sourceContext_ = null;
	//   44   94:aload_0         
	//   45   95:aconst_null     
	//   46   96:putfield        #57  <Field SourceContext sourceContext_>
		} else
	//*  47   99:goto            112
		{
			sourceContext_ = null;
	//   48  102:aload_0         
	//   49  103:aconst_null     
	//   50  104:putfield        #57  <Field SourceContext sourceContext_>
			sourceContextBuilder_ = null;
	//   51  107:aload_0         
	//   52  108:aconst_null     
	//   53  109:putfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
		}
		if(mixinsBuilder_ == null)
	//*  54  112:aload_0         
	//*  55  113:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*  56  116:ifnonnull       140
		{
			mixins_ = Collections.emptyList();
	//   57  119:aload_0         
	//   58  120:invokestatic    #49  <Method List Collections.emptyList()>
	//   59  123:putfield        #59  <Field List mixins_>
			bitField0_ = bitField0_ & 0xffffffdf;
	//   60  126:aload_0         
	//   61  127:aload_0         
	//   62  128:getfield        #75  <Field int bitField0_>
	//   63  131:bipush          -33
	//   64  133:iand            
	//   65  134:putfield        #75  <Field int bitField0_>
		} else
	//*  66  137:goto            147
		{
			mixinsBuilder_.clear();
	//   67  140:aload_0         
	//   68  141:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   69  144:invokevirtual   #326 <Method void RepeatedFieldBuilderV3.clear()>
		}
		syntax_ = 0;
	//   70  147:aload_0         
	//   71  148:iconst_0        
	//   72  149:putfield        #61  <Field int syntax_>
		return this;
	//   73  152:aload_0         
	//   74  153:areturn         
	}

	public volatile sageV3.Builder clear()
	{
		return ((sageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method Api$Builder clear()>
	//    2    4:areturn         
	}

	public volatile der clear()
	{
		return ((der) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method Api$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Builder clear()
	{
		return ((Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method Api$Builder clear()>
	//    2    4:areturn         
	}

	public Api$Builder clearField(FieldDescriptor fielddescriptor)
	{
		return (Api$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #333 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class Api$Builder>
	//    4    8:areturn         
	}

	public volatile sageV3.Builder clearField(FieldDescriptor fielddescriptor)
	{
		return ((sageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #335 <Method Api$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile der clearField(FieldDescriptor fielddescriptor)
	{
		return ((der) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #335 <Method Api$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public Api$Builder clearMethods()
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       31
		{
			methods_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #49  <Method List Collections.emptyList()>
	//    5   11:putfield        #51  <Field List methods_>
			bitField0_ = bitField0_ & -3;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #75  <Field int bitField0_>
	//    9   19:bipush          -3
	//   10   21:iand            
	//   11   22:putfield        #75  <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			methodsBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   18   35:invokevirtual   #326 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public Api$Builder clearMixins()
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       31
		{
			mixins_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #49  <Method List Collections.emptyList()>
	//    5   11:putfield        #59  <Field List mixins_>
			bitField0_ = bitField0_ & 0xffffffdf;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #75  <Field int bitField0_>
	//    9   19:bipush          -33
	//   10   21:iand            
	//   11   22:putfield        #75  <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			mixinsBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   18   35:invokevirtual   #326 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public Api$Builder clearName()
	{
		name_ = ((Object) (Api.getDefaultInstance().getName()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #341 <Method Api Api.getDefaultInstance()>
	//    2    4:invokevirtual   #345 <Method String Api.getName()>
	//    3    7:putfield        #43  <Field Object name_>
		onChanged();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #156 <Method void onChanged()>
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public volatile age.Builder clearOneof(OneofDescriptor oneofdescriptor)
	{
		return ((age.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #350 <Method Api$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public Api$Builder clearOneof(OneofDescriptor oneofdescriptor)
	{
		return (Api$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #353 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class Api$Builder>
	//    4    8:areturn         
	}

	public volatile sageV3.Builder clearOneof(OneofDescriptor oneofdescriptor)
	{
		return ((sageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #350 <Method Api$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile der clearOneof(OneofDescriptor oneofdescriptor)
	{
		return ((der) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #350 <Method Api$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public Api$Builder clearOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       31
		{
			options_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #49  <Method List Collections.emptyList()>
	//    5   11:putfield        #53  <Field List options_>
			bitField0_ = bitField0_ & -5;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #75  <Field int bitField0_>
	//    9   19:bipush          -5
	//   10   21:iand            
	//   11   22:putfield        #75  <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			optionsBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   18   35:invokevirtual   #326 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public Api$Builder clearSourceContext()
	{
		if(sourceContextBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//*   2    4:ifnonnull       18
		{
			sourceContext_ = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #57  <Field SourceContext sourceContext_>
			onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #156 <Method void onChanged()>
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			sourceContext_ = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #57  <Field SourceContext sourceContext_>
			sourceContextBuilder_ = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
			return this;
	//   16   28:aload_0         
	//   17   29:areturn         
		}
	}

	public Api$Builder clearSyntax()
	{
		syntax_ = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #61  <Field int syntax_>
		onChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #156 <Method void onChanged()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Api$Builder clearVersion()
	{
		version_ = ((Object) (Api.getDefaultInstance().getVersion()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #341 <Method Api Api.getDefaultInstance()>
	//    2    4:invokevirtual   #361 <Method String Api.getVersion()>
	//    3    7:putfield        #55  <Field Object version_>
		onChanged();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #156 <Method void onChanged()>
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public volatile age.Builder clone()
	{
		return ((age.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
	//    2    4:areturn         
	}

	public volatile ageLite.Builder clone()
	{
		return ((ageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
	//    2    4:areturn         
	}

	public Api$Builder clone()
	{
		return (Api$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #367 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class Api$Builder>
	//    3    7:areturn         
	}

	public volatile sageV3.Builder clone()
	{
		return ((sageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
	//    2    4:areturn         
	}

	public volatile der clone()
	{
		return ((der) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Builder clone()
	{
		return ((Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
	//    2    4:areturn         
	}

	public Api getDefaultInstanceForType()
	{
		return Api.getDefaultInstance();
	//    0    0:invokestatic    #341 <Method Api Api.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #374 <Method Api getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #374 <Method Api getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptor getDescriptorForType()
	{
		return ApiProto.internal_static_google_protobuf_Api_descriptor;
	//    0    0:getstatic       #90  <Field Descriptors$Descriptor ApiProto.internal_static_google_protobuf_Api_descriptor>
	//    1    3:areturn         
	}

	public Method getMethods(int i)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       21
			return (Method)methods_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field List methods_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #381 <Method Object List.get(int)>
	//    7   17:checkcast       #203 <Class Method>
	//    8   20:areturn         
		else
			return (Method)methodsBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #385 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #203 <Class Method>
	//   14   32:areturn         
	}

	public er getMethodsBuilder(int i)
	{
		return (er)getMethodsFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getMethodsFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #390 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #173 <Class Method$Builder>
	//    5   11:areturn         
	}

	public List getMethodsBuilderList()
	{
		return getMethodsFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getMethodsFieldBuilder()>
	//    2    4:invokevirtual   #394 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getMethodsCount()
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       17
			return methods_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field List methods_>
	//    5   11:invokeinterface #400 <Method int List.size()>
	//    6   16:ireturn         
		else
			return methodsBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//    9   21:invokevirtual   #403 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getMethodsList()
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(methods_);
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field List methods_>
	//    5   11:invokestatic    #282 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return methodsBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//    9   19:invokevirtual   #407 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public MethodOrBuilder getMethodsOrBuilder(int i)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       21
			return (MethodOrBuilder)methods_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field List methods_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #381 <Method Object List.get(int)>
	//    7   17:checkcast       #412 <Class MethodOrBuilder>
	//    8   20:areturn         
		else
			return (MethodOrBuilder)methodsBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #416 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #412 <Class MethodOrBuilder>
	//   14   32:areturn         
	}

	public List getMethodsOrBuilderList()
	{
		if(methodsBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnull          15
			return methodsBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//    5   11:invokevirtual   #420 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(methods_);
	//    7   15:aload_0         
	//    8   16:getfield        #51  <Field List methods_>
	//    9   19:invokestatic    #282 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public Mixin getMixins(int i)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       21
			return (Mixin)mixins_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field List mixins_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #381 <Method Object List.get(int)>
	//    7   17:checkcast       #228 <Class Mixin>
	//    8   20:areturn         
		else
			return (Mixin)mixinsBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #385 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #228 <Class Mixin>
	//   14   32:areturn         
	}

	public r getMixinsBuilder(int i)
	{
		return (r)getMixinsFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method RepeatedFieldBuilderV3 getMixinsFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #390 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #218 <Class Mixin$Builder>
	//    5   11:areturn         
	}

	public List getMixinsBuilderList()
	{
		return getMixinsFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method RepeatedFieldBuilderV3 getMixinsFieldBuilder()>
	//    2    4:invokevirtual   #394 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getMixinsCount()
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       17
			return mixins_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field List mixins_>
	//    5   11:invokeinterface #400 <Method int List.size()>
	//    6   16:ireturn         
		else
			return mixinsBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//    9   21:invokevirtual   #403 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getMixinsList()
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(mixins_);
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field List mixins_>
	//    5   11:invokestatic    #282 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return mixinsBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//    9   19:invokevirtual   #407 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public MixinOrBuilder getMixinsOrBuilder(int i)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       21
			return (MixinOrBuilder)mixins_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field List mixins_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #381 <Method Object List.get(int)>
	//    7   17:checkcast       #433 <Class MixinOrBuilder>
	//    8   20:areturn         
		else
			return (MixinOrBuilder)mixinsBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #416 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #433 <Class MixinOrBuilder>
	//   14   32:areturn         
	}

	public List getMixinsOrBuilderList()
	{
		if(mixinsBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnull          15
			return mixinsBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//    5   11:invokevirtual   #420 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(mixins_);
	//    7   15:aload_0         
	//    8   16:getfield        #59  <Field List mixins_>
	//    9   19:invokestatic    #282 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object name_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #437 <Class String>
	//*   5    9:ifne            27
		{
			obj = ((Object) (((ByteString)obj).toStringUtf8()));
	//    6   12:aload_1         
	//    7   13:checkcast       #439 <Class ByteString>
	//    8   16:invokevirtual   #442 <Method String ByteString.toStringUtf8()>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #43  <Field Object name_>
			return ((String) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (String)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #437 <Class String>
	//   17   31:areturn         
		}
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #437 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #437 <Class String>
	//    8   16:invokestatic    #448 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #43  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #439 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public Option getOptions(int i)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       21
			return (Option)options_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field List options_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #381 <Method Object List.get(int)>
	//    7   17:checkcast       #245 <Class Option>
	//    8   20:areturn         
		else
			return (Option)optionsBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #385 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #245 <Class Option>
	//   14   32:areturn         
	}

	public er getOptionsBuilder(int i)
	{
		return (er)getOptionsFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method RepeatedFieldBuilderV3 getOptionsFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #390 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #235 <Class Option$Builder>
	//    5   11:areturn         
	}

	public List getOptionsBuilderList()
	{
		return getOptionsFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method RepeatedFieldBuilderV3 getOptionsFieldBuilder()>
	//    2    4:invokevirtual   #394 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getOptionsCount()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       17
			return options_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field List options_>
	//    5   11:invokeinterface #400 <Method int List.size()>
	//    6   16:ireturn         
		else
			return optionsBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//    9   21:invokevirtual   #403 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getOptionsList()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(options_);
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field List options_>
	//    5   11:invokestatic    #282 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return optionsBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//    9   19:invokevirtual   #407 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public OptionOrBuilder getOptionsOrBuilder(int i)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       21
			return (OptionOrBuilder)options_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field List options_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #381 <Method Object List.get(int)>
	//    7   17:checkcast       #460 <Class OptionOrBuilder>
	//    8   20:areturn         
		else
			return (OptionOrBuilder)optionsBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #416 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #460 <Class OptionOrBuilder>
	//   14   32:areturn         
	}

	public List getOptionsOrBuilderList()
	{
		if(optionsBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnull          15
			return optionsBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//    5   11:invokevirtual   #420 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(options_);
	//    7   15:aload_0         
	//    8   16:getfield        #53  <Field List options_>
	//    9   19:invokestatic    #282 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public SourceContext getSourceContext()
	{
		if(sourceContextBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//*   2    4:ifnonnull       23
		{
			if(sourceContext_ == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #57  <Field SourceContext sourceContext_>
	//*   5   11:ifnonnull       18
				return SourceContext.getDefaultInstance();
	//    6   14:invokestatic    #464 <Method SourceContext SourceContext.getDefaultInstance()>
	//    7   17:areturn         
			else
				return sourceContext_;
	//    8   18:aload_0         
	//    9   19:getfield        #57  <Field SourceContext sourceContext_>
	//   10   22:areturn         
		} else
		{
			return (SourceContext)sourceContextBuilder_.getMessage();
	//   11   23:aload_0         
	//   12   24:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//   13   27:invokevirtual   #466 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
	//   14   30:checkcast       #303 <Class SourceContext>
	//   15   33:areturn         
		}
	}

	public t.Builder getSourceContextBuilder()
	{
		onChanged();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method void onChanged()>
		return (t.Builder)getSourceContextFieldBuilder().getBuilder();
	//    2    4:aload_0         
	//    3    5:invokespecial   #470 <Method SingleFieldBuilderV3 getSourceContextFieldBuilder()>
	//    4    8:invokevirtual   #472 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
	//    5   11:checkcast       #474 <Class SourceContext$Builder>
	//    6   14:areturn         
	}

	public SourceContextOrBuilder getSourceContextOrBuilder()
	{
		if(sourceContextBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//*   2    4:ifnull          18
			return (SourceContextOrBuilder)sourceContextBuilder_.getMessageOrBuilder();
	//    3    7:aload_0         
	//    4    8:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//    5   11:invokevirtual   #479 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
	//    6   14:checkcast       #481 <Class SourceContextOrBuilder>
	//    7   17:areturn         
		if(sourceContext_ == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #57  <Field SourceContext sourceContext_>
	//*  10   22:ifnonnull       29
			return ((SourceContextOrBuilder) (SourceContext.getDefaultInstance()));
	//   11   25:invokestatic    #464 <Method SourceContext SourceContext.getDefaultInstance()>
	//   12   28:areturn         
		else
			return ((SourceContextOrBuilder) (sourceContext_));
	//   13   29:aload_0         
	//   14   30:getfield        #57  <Field SourceContext sourceContext_>
	//   15   33:areturn         
	}

	public Syntax getSyntax()
	{
		Syntax syntax = Syntax.valueOf(syntax_);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int syntax_>
	//    2    4:invokestatic    #489 <Method Syntax Syntax.valueOf(int)>
	//    3    7:astore_1        
		if(syntax == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return Syntax.UNRECOGNIZED;
	//    6   12:getstatic       #493 <Field Syntax Syntax.UNRECOGNIZED>
	//    7   15:areturn         
		else
			return syntax;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public int getSyntaxValue()
	{
		return syntax_;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int syntax_>
	//    2    4:ireturn         
	}

	public String getVersion()
	{
		Object obj = version_;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object version_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #437 <Class String>
	//*   5    9:ifne            27
		{
			obj = ((Object) (((ByteString)obj).toStringUtf8()));
	//    6   12:aload_1         
	//    7   13:checkcast       #439 <Class ByteString>
	//    8   16:invokevirtual   #442 <Method String ByteString.toStringUtf8()>
	//    9   19:astore_1        
			version_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #55  <Field Object version_>
			return ((String) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (String)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #437 <Class String>
	//   17   31:areturn         
		}
	}

	public ByteString getVersionBytes()
	{
		Object obj = version_;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object version_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #437 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #437 <Class String>
	//    8   16:invokestatic    #448 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			version_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #55  <Field Object version_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #439 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean hasSourceContext()
	{
		return sourceContextBuilder_ != null || sourceContext_ != null;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//    2    4:ifnonnull       14
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field SourceContext sourceContext_>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected sageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Api, com/google/protobuf/Api$Builder);
	//    0    0:getstatic       #502 <Field GeneratedMessageV3$FieldAccessorTable ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable>
	//    1    3:ldc1            #9   <Class Api>
	//    2    5:ldc1            #2   <Class Api$Builder>
	//    3    7:invokevirtual   #508 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile age.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((age.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #515 <Method Api$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile age.Builder mergeFrom(Message message)
	{
		return ((age.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #519 <Method Api$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile ageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((ageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #515 <Method Api$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public Api$Builder mergeFrom(Api api)
	{
		if(api == Api.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #341 <Method Api Api.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(!api.getName().isEmpty())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #345 <Method String Api.getName()>
	//*   7   13:invokevirtual   #524 <Method boolean String.isEmpty()>
	//*   8   16:ifne            31
		{
			name_ = Api.access$300(api);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokestatic    #528 <Method Object Api.access$300(Api)>
	//   12   24:putfield        #43  <Field Object name_>
			onChanged();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #156 <Method void onChanged()>
		}
		if(methodsBuilder_ == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*  17   35:ifnonnull       109
		{
			if(!Api.access$400(api).isEmpty())
	//*  18   38:aload_1         
	//*  19   39:invokestatic    #532 <Method List Api.access$400(Api)>
	//*  20   42:invokeinterface #533 <Method boolean List.isEmpty()>
	//*  21   47:ifne            198
			{
				if(methods_.isEmpty())
	//*  22   50:aload_0         
	//*  23   51:getfield        #51  <Field List methods_>
	//*  24   54:invokeinterface #533 <Method boolean List.isEmpty()>
	//*  25   59:ifeq            84
				{
					methods_ = Api.access$400(api);
	//   26   62:aload_0         
	//   27   63:aload_1         
	//   28   64:invokestatic    #532 <Method List Api.access$400(Api)>
	//   29   67:putfield        #51  <Field List methods_>
					bitField0_ = bitField0_ & -3;
	//   30   70:aload_0         
	//   31   71:aload_0         
	//   32   72:getfield        #75  <Field int bitField0_>
	//   33   75:bipush          -3
	//   34   77:iand            
	//   35   78:putfield        #75  <Field int bitField0_>
				} else
	//*  36   81:goto            102
				{
					ensureMethodsIsMutable();
	//   37   84:aload_0         
	//   38   85:invokespecial   #147 <Method void ensureMethodsIsMutable()>
					methods_.addAll(((java.util.Collection) (Api.access$400(api))));
	//   39   88:aload_0         
	//   40   89:getfield        #51  <Field List methods_>
	//   41   92:aload_1         
	//   42   93:invokestatic    #532 <Method List Api.access$400(Api)>
	//   43   96:invokeinterface #536 <Method boolean List.addAll(java.util.Collection)>
	//   44  101:pop             
				}
				onChanged();
	//   45  102:aload_0         
	//   46  103:invokevirtual   #156 <Method void onChanged()>
			}
		} else
	//*  47  106:goto            198
		if(!Api.access$400(api).isEmpty())
	//*  48  109:aload_1         
	//*  49  110:invokestatic    #532 <Method List Api.access$400(Api)>
	//*  50  113:invokeinterface #533 <Method boolean List.isEmpty()>
	//*  51  118:ifne            198
			if(methodsBuilder_.isEmpty())
	//*  52  121:aload_0         
	//*  53  122:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*  54  125:invokevirtual   #537 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  55  128:ifeq            186
			{
				methodsBuilder_.dispose();
	//   56  131:aload_0         
	//   57  132:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   58  135:invokevirtual   #540 <Method void RepeatedFieldBuilderV3.dispose()>
				methodsBuilder_ = null;
	//   59  138:aload_0         
	//   60  139:aconst_null     
	//   61  140:putfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
				methods_ = Api.access$400(api);
	//   62  143:aload_0         
	//   63  144:aload_1         
	//   64  145:invokestatic    #532 <Method List Api.access$400(Api)>
	//   65  148:putfield        #51  <Field List methods_>
				bitField0_ = bitField0_ & -3;
	//   66  151:aload_0         
	//   67  152:aload_0         
	//   68  153:getfield        #75  <Field int bitField0_>
	//   69  156:bipush          -3
	//   70  158:iand            
	//   71  159:putfield        #75  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*  72  162:getstatic       #137 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*  73  165:ifeq            176
					repeatedfieldbuilderv3 = getMethodsFieldBuilder();
	//   74  168:aload_0         
	//   75  169:invokespecial   #139 <Method RepeatedFieldBuilderV3 getMethodsFieldBuilder()>
	//   76  172:astore_2        
				else
	//*  77  173:goto            178
					repeatedfieldbuilderv3 = null;
	//   78  176:aconst_null     
	//   79  177:astore_2        
				methodsBuilder_ = repeatedfieldbuilderv3;
	//   80  178:aload_0         
	//   81  179:aload_2         
	//   82  180:putfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
			} else
	//*  83  183:goto            198
			{
				methodsBuilder_.addAllMessages(((Iterable) (Api.access$400(api))));
	//   84  186:aload_0         
	//   85  187:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   86  190:aload_1         
	//   87  191:invokestatic    #532 <Method List Api.access$400(Api)>
	//   88  194:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   89  197:pop             
			}
		if(optionsBuilder_ == null)
	//*  90  198:aload_0         
	//*  91  199:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*  92  202:ifnonnull       276
		{
			if(!Api.access$500(api).isEmpty())
	//*  93  205:aload_1         
	//*  94  206:invokestatic    #543 <Method List Api.access$500(Api)>
	//*  95  209:invokeinterface #533 <Method boolean List.isEmpty()>
	//*  96  214:ifne            365
			{
				if(options_.isEmpty())
	//*  97  217:aload_0         
	//*  98  218:getfield        #53  <Field List options_>
	//*  99  221:invokeinterface #533 <Method boolean List.isEmpty()>
	//* 100  226:ifeq            251
				{
					options_ = Api.access$500(api);
	//  101  229:aload_0         
	//  102  230:aload_1         
	//  103  231:invokestatic    #543 <Method List Api.access$500(Api)>
	//  104  234:putfield        #53  <Field List options_>
					bitField0_ = bitField0_ & -5;
	//  105  237:aload_0         
	//  106  238:aload_0         
	//  107  239:getfield        #75  <Field int bitField0_>
	//  108  242:bipush          -5
	//  109  244:iand            
	//  110  245:putfield        #75  <Field int bitField0_>
				} else
	//* 111  248:goto            269
				{
					ensureOptionsIsMutable();
	//  112  251:aload_0         
	//  113  252:invokespecial   #168 <Method void ensureOptionsIsMutable()>
					options_.addAll(((java.util.Collection) (Api.access$500(api))));
	//  114  255:aload_0         
	//  115  256:getfield        #53  <Field List options_>
	//  116  259:aload_1         
	//  117  260:invokestatic    #543 <Method List Api.access$500(Api)>
	//  118  263:invokeinterface #536 <Method boolean List.addAll(java.util.Collection)>
	//  119  268:pop             
				}
				onChanged();
	//  120  269:aload_0         
	//  121  270:invokevirtual   #156 <Method void onChanged()>
			}
		} else
	//* 122  273:goto            365
		if(!Api.access$500(api).isEmpty())
	//* 123  276:aload_1         
	//* 124  277:invokestatic    #543 <Method List Api.access$500(Api)>
	//* 125  280:invokeinterface #533 <Method boolean List.isEmpty()>
	//* 126  285:ifne            365
			if(optionsBuilder_.isEmpty())
	//* 127  288:aload_0         
	//* 128  289:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//* 129  292:invokevirtual   #537 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 130  295:ifeq            353
			{
				optionsBuilder_.dispose();
	//  131  298:aload_0         
	//  132  299:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//  133  302:invokevirtual   #540 <Method void RepeatedFieldBuilderV3.dispose()>
				optionsBuilder_ = null;
	//  134  305:aload_0         
	//  135  306:aconst_null     
	//  136  307:putfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
				options_ = Api.access$500(api);
	//  137  310:aload_0         
	//  138  311:aload_1         
	//  139  312:invokestatic    #543 <Method List Api.access$500(Api)>
	//  140  315:putfield        #53  <Field List options_>
				bitField0_ = bitField0_ & -5;
	//  141  318:aload_0         
	//  142  319:aload_0         
	//  143  320:getfield        #75  <Field int bitField0_>
	//  144  323:bipush          -5
	//  145  325:iand            
	//  146  326:putfield        #75  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3_1;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 147  329:getstatic       #137 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 148  332:ifeq            343
					repeatedfieldbuilderv3_1 = getOptionsFieldBuilder();
	//  149  335:aload_0         
	//  150  336:invokespecial   #141 <Method RepeatedFieldBuilderV3 getOptionsFieldBuilder()>
	//  151  339:astore_2        
				else
	//* 152  340:goto            345
					repeatedfieldbuilderv3_1 = null;
	//  153  343:aconst_null     
	//  154  344:astore_2        
				optionsBuilder_ = repeatedfieldbuilderv3_1;
	//  155  345:aload_0         
	//  156  346:aload_2         
	//  157  347:putfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
			} else
	//* 158  350:goto            365
			{
				optionsBuilder_.addAllMessages(((Iterable) (Api.access$500(api))));
	//  159  353:aload_0         
	//  160  354:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//  161  357:aload_1         
	//  162  358:invokestatic    #543 <Method List Api.access$500(Api)>
	//  163  361:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  164  364:pop             
			}
		if(!api.getVersion().isEmpty())
	//* 165  365:aload_1         
	//* 166  366:invokevirtual   #361 <Method String Api.getVersion()>
	//* 167  369:invokevirtual   #524 <Method boolean String.isEmpty()>
	//* 168  372:ifne            387
		{
			version_ = Api.access$600(api);
	//  169  375:aload_0         
	//  170  376:aload_1         
	//  171  377:invokestatic    #546 <Method Object Api.access$600(Api)>
	//  172  380:putfield        #55  <Field Object version_>
			onChanged();
	//  173  383:aload_0         
	//  174  384:invokevirtual   #156 <Method void onChanged()>
		}
		if(api.hasSourceContext())
	//* 175  387:aload_1         
	//* 176  388:invokevirtual   #548 <Method boolean Api.hasSourceContext()>
	//* 177  391:ifeq            403
			mergeSourceContext(api.getSourceContext());
	//  178  394:aload_0         
	//  179  395:aload_1         
	//  180  396:invokevirtual   #549 <Method SourceContext Api.getSourceContext()>
	//  181  399:invokevirtual   #553 <Method Api$Builder mergeSourceContext(SourceContext)>
	//  182  402:pop             
		if(mixinsBuilder_ == null)
	//* 183  403:aload_0         
	//* 184  404:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//* 185  407:ifnonnull       481
		{
			if(!Api.access$800(api).isEmpty())
	//* 186  410:aload_1         
	//* 187  411:invokestatic    #556 <Method List Api.access$800(Api)>
	//* 188  414:invokeinterface #533 <Method boolean List.isEmpty()>
	//* 189  419:ifne            570
			{
				if(mixins_.isEmpty())
	//* 190  422:aload_0         
	//* 191  423:getfield        #59  <Field List mixins_>
	//* 192  426:invokeinterface #533 <Method boolean List.isEmpty()>
	//* 193  431:ifeq            456
				{
					mixins_ = Api.access$800(api);
	//  194  434:aload_0         
	//  195  435:aload_1         
	//  196  436:invokestatic    #556 <Method List Api.access$800(Api)>
	//  197  439:putfield        #59  <Field List mixins_>
					bitField0_ = bitField0_ & 0xffffffdf;
	//  198  442:aload_0         
	//  199  443:aload_0         
	//  200  444:getfield        #75  <Field int bitField0_>
	//  201  447:bipush          -33
	//  202  449:iand            
	//  203  450:putfield        #75  <Field int bitField0_>
				} else
	//* 204  453:goto            474
				{
					ensureMixinsIsMutable();
	//  205  456:aload_0         
	//  206  457:invokespecial   #164 <Method void ensureMixinsIsMutable()>
					mixins_.addAll(((java.util.Collection) (Api.access$800(api))));
	//  207  460:aload_0         
	//  208  461:getfield        #59  <Field List mixins_>
	//  209  464:aload_1         
	//  210  465:invokestatic    #556 <Method List Api.access$800(Api)>
	//  211  468:invokeinterface #536 <Method boolean List.addAll(java.util.Collection)>
	//  212  473:pop             
				}
				onChanged();
	//  213  474:aload_0         
	//  214  475:invokevirtual   #156 <Method void onChanged()>
			}
		} else
	//* 215  478:goto            570
		if(!Api.access$800(api).isEmpty())
	//* 216  481:aload_1         
	//* 217  482:invokestatic    #556 <Method List Api.access$800(Api)>
	//* 218  485:invokeinterface #533 <Method boolean List.isEmpty()>
	//* 219  490:ifne            570
			if(mixinsBuilder_.isEmpty())
	//* 220  493:aload_0         
	//* 221  494:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//* 222  497:invokevirtual   #537 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 223  500:ifeq            558
			{
				mixinsBuilder_.dispose();
	//  224  503:aload_0         
	//  225  504:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//  226  507:invokevirtual   #540 <Method void RepeatedFieldBuilderV3.dispose()>
				mixinsBuilder_ = null;
	//  227  510:aload_0         
	//  228  511:aconst_null     
	//  229  512:putfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
				mixins_ = Api.access$800(api);
	//  230  515:aload_0         
	//  231  516:aload_1         
	//  232  517:invokestatic    #556 <Method List Api.access$800(Api)>
	//  233  520:putfield        #59  <Field List mixins_>
				bitField0_ = bitField0_ & 0xffffffdf;
	//  234  523:aload_0         
	//  235  524:aload_0         
	//  236  525:getfield        #75  <Field int bitField0_>
	//  237  528:bipush          -33
	//  238  530:iand            
	//  239  531:putfield        #75  <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3_2;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 240  534:getstatic       #137 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 241  537:ifeq            548
					repeatedfieldbuilderv3_2 = getMixinsFieldBuilder();
	//  242  540:aload_0         
	//  243  541:invokespecial   #143 <Method RepeatedFieldBuilderV3 getMixinsFieldBuilder()>
	//  244  544:astore_2        
				else
	//* 245  545:goto            550
					repeatedfieldbuilderv3_2 = null;
	//  246  548:aconst_null     
	//  247  549:astore_2        
				mixinsBuilder_ = repeatedfieldbuilderv3_2;
	//  248  550:aload_0         
	//  249  551:aload_2         
	//  250  552:putfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
			} else
	//* 251  555:goto            570
			{
				mixinsBuilder_.addAllMessages(((Iterable) (Api.access$800(api))));
	//  252  558:aload_0         
	//  253  559:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//  254  562:aload_1         
	//  255  563:invokestatic    #556 <Method List Api.access$800(Api)>
	//  256  566:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  257  569:pop             
			}
		if(Api.access$900(api) != 0)
	//* 258  570:aload_1         
	//* 259  571:invokestatic    #560 <Method int Api.access$900(Api)>
	//* 260  574:ifeq            586
			setSyntaxValue(api.getSyntaxValue());
	//  261  577:aload_0         
	//  262  578:aload_1         
	//  263  579:invokevirtual   #562 <Method int Api.getSyntaxValue()>
	//  264  582:invokevirtual   #566 <Method Api$Builder setSyntaxValue(int)>
	//  265  585:pop             
		mergeUnknownFields(api.unknownFields);
	//  266  586:aload_0         
	//  267  587:aload_1         
	//  268  588:getfield        #570 <Field UnknownFieldSet Api.unknownFields>
	//  269  591:invokevirtual   #574 <Method Api$Builder mergeUnknownFields(UnknownFieldSet)>
	//  270  594:pop             
		onChanged();
	//  271  595:aload_0         
	//  272  596:invokevirtual   #156 <Method void onChanged()>
		return this;
	//  273  599:aload_0         
	//  274  600:areturn         
	}

	public Api$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((Api)Api.access$1100().parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:invokestatic    #580 <Method Parser Api.access$1100()>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #586 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class Api>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((Api) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #588 <Method Api$Builder mergeFrom(Api)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #591 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class Api>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #595 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #588 <Method Api$Builder mergeFrom(Api)>
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
		codedinputstream = ((CodedInputStream) ((Api)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((Api) (codedinputstream1)));
		throw codedinputstream;
	}

	public Api$Builder mergeFrom(Message message)
	{
		if(message instanceof Api)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class Api>
	//*   2    4:ifeq            16
		{
			return mergeFrom((Api)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class Api>
	//    6   12:invokevirtual   #588 <Method Api$Builder mergeFrom(Api)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #597 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
	//   11   21:pop             
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		}
	}

	public volatile der mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((der) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #515 <Method Api$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile der mergeFrom(Message message)
	{
		return ((der) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #519 <Method Api$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #515 <Method Api$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public Api$Builder mergeSourceContext(SourceContext sourcecontext)
	{
		if(sourceContextBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//*   2    4:ifnonnull       46
		{
			if(sourceContext_ != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #57  <Field SourceContext sourceContext_>
	//*   5   11:ifnull          35
				sourceContext_ = SourceContext.newBuilder(sourceContext_).mergeFrom(sourcecontext).buildPartial();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #57  <Field SourceContext sourceContext_>
	//    9   19:invokestatic    #604 <Method SourceContext$Builder SourceContext.newBuilder(SourceContext)>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #606 <Method SourceContext$Builder SourceContext$Builder.mergeFrom(SourceContext)>
	//   12   26:invokevirtual   #608 <Method SourceContext SourceContext$Builder.buildPartial()>
	//   13   29:putfield        #57  <Field SourceContext sourceContext_>
			else
	//*  14   32:goto            40
				sourceContext_ = sourcecontext;
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:putfield        #57  <Field SourceContext sourceContext_>
			onChanged();
	//   18   40:aload_0         
	//   19   41:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   20   44:aload_0         
	//   21   45:areturn         
		} else
		{
			sourceContextBuilder_.mergeFrom(((AbstractMessage) (sourcecontext)));
	//   22   46:aload_0         
	//   23   47:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #611 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
	//   26   54:pop             
			return this;
	//   27   55:aload_0         
	//   28   56:areturn         
		}
	}

	public volatile age.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((age.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #574 <Method Api$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final Api$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (Api$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #615 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class Api$Builder>
	//    4    8:areturn         
	}

	public volatile sageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((sageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #574 <Method Api$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile der mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((der) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #574 <Method Api$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public Api$Builder removeMethods(int i)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureMethodsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #147 <Method void ensureMethodsIsMutable()>
			methods_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field List methods_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #620 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			methodsBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #623 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public Api$Builder removeMixins(int i)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureMixinsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureMixinsIsMutable()>
			mixins_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #59  <Field List mixins_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #620 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			mixinsBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #623 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public Api$Builder removeOptions(int i)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureOptionsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #168 <Method void ensureOptionsIsMutable()>
			options_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field List options_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #620 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			optionsBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #623 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public Api$Builder setField(FieldDescriptor fielddescriptor, Object obj)
	{
		return (Api$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #628 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class Api$Builder>
	//    5    9:areturn         
	}

	public volatile sageV3.Builder setField(FieldDescriptor fielddescriptor, Object obj)
	{
		return ((sageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #630 <Method Api$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile der setField(FieldDescriptor fielddescriptor, Object obj)
	{
		return ((der) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #630 <Method Api$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public Api$Builder setMethods(int i, er er)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureMethodsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #147 <Method void ensureMethodsIsMutable()>
			methods_.set(i, ((Object) (er.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field List methods_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #177 <Method Method Method$Builder.build()>
	//   10   20:invokeinterface #635 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			methodsBuilder_.setMessage(i, ((AbstractMessage) (er.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #177 <Method Method Method$Builder.build()>
	//   21   41:invokevirtual   #638 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public Api$Builder setMethods(int i, Method method)
	{
		if(methodsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(method == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureMethodsIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #147 <Method void ensureMethodsIsMutable()>
				methods_.set(i, ((Object) (method)));
	//   11   23:aload_0         
	//   12   24:getfield        #51  <Field List methods_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #635 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			methodsBuilder_.setMessage(i, ((AbstractMessage) (method)));
	//   21   41:aload_0         
	//   22   42:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #638 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public Api$Builder setMixins(int i, r r)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureMixinsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #164 <Method void ensureMixinsIsMutable()>
			mixins_.set(i, ((Object) (r.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #59  <Field List mixins_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #221 <Method Mixin Mixin$Builder.build()>
	//   10   20:invokeinterface #635 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			mixinsBuilder_.setMessage(i, ((AbstractMessage) (r.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #221 <Method Mixin Mixin$Builder.build()>
	//   21   41:invokevirtual   #638 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public Api$Builder setMixins(int i, Mixin mixin)
	{
		if(mixinsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(mixin == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureMixinsIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #164 <Method void ensureMixinsIsMutable()>
				mixins_.set(i, ((Object) (mixin)));
	//   11   23:aload_0         
	//   12   24:getfield        #59  <Field List mixins_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #635 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			mixinsBuilder_.setMessage(i, ((AbstractMessage) (mixin)));
	//   21   41:aload_0         
	//   22   42:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #638 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public Api$Builder setName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #190 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #191 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			name_ = ((Object) (s));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #43  <Field Object name_>
			onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   11   21:aload_0         
	//   12   22:areturn         
		}
	}

	public Api$Builder setNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #190 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #191 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			AbstractMessageLite.checkByteStringIsUtf8(bytestring);
	//    6   12:aload_1         
	//    7   13:invokestatic    #649 <Method void AbstractMessageLite.checkByteStringIsUtf8(ByteString)>
			name_ = ((Object) (bytestring));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #43  <Field Object name_>
			onChanged();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   13   25:aload_0         
	//   14   26:areturn         
		}
	}

	public Api$Builder setOptions(int i, er er)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureOptionsIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #168 <Method void ensureOptionsIsMutable()>
			options_.set(i, ((Object) (er.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field List options_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #238 <Method Option Option$Builder.build()>
	//   10   20:invokeinterface #635 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			optionsBuilder_.setMessage(i, ((AbstractMessage) (er.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #238 <Method Option Option$Builder.build()>
	//   21   41:invokevirtual   #638 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public Api$Builder setOptions(int i, Option option)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(option == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureOptionsIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #168 <Method void ensureOptionsIsMutable()>
				options_.set(i, ((Object) (option)));
	//   11   23:aload_0         
	//   12   24:getfield        #53  <Field List options_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #635 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			optionsBuilder_.setMessage(i, ((AbstractMessage) (option)));
	//   21   41:aload_0         
	//   22   42:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #638 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public Api$Builder setRepeatedField(FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (Api$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #655 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class Api$Builder>
	//    6   10:areturn         
	}

	public volatile sageV3.Builder setRepeatedField(FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((sageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #657 <Method Api$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile der setRepeatedField(FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((der) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #657 <Method Api$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public Api$Builder setSourceContext(t.Builder builder)
	{
		if(sourceContextBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//*   2    4:ifnonnull       21
		{
			sourceContext_ = builder.build();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #662 <Method SourceContext SourceContext$Builder.build()>
	//    6   12:putfield        #57  <Field SourceContext sourceContext_>
			onChanged();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #156 <Method void onChanged()>
			return this;
	//    9   19:aload_0         
	//   10   20:areturn         
		} else
		{
			sourceContextBuilder_.setMessage(((AbstractMessage) (builder.build())));
	//   11   21:aload_0         
	//   12   22:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #662 <Method SourceContext SourceContext$Builder.build()>
	//   15   29:invokevirtual   #664 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   16   32:pop             
			return this;
	//   17   33:aload_0         
	//   18   34:areturn         
		}
	}

	public Api$Builder setSourceContext(SourceContext sourcecontext)
	{
		if(sourceContextBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//*   2    4:ifnonnull       30
		{
			if(sourcecontext == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #190 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				sourceContext_ = sourcecontext;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #57  <Field SourceContext sourceContext_>
				onChanged();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #156 <Method void onChanged()>
				return this;
	//   14   28:aload_0         
	//   15   29:areturn         
			}
		} else
		{
			sourceContextBuilder_.setMessage(((AbstractMessage) (sourcecontext)));
	//   16   30:aload_0         
	//   17   31:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #664 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   20   38:pop             
			return this;
	//   21   39:aload_0         
	//   22   40:areturn         
		}
	}

	public Api$Builder setSyntax(Syntax syntax)
	{
		if(syntax == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #190 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #191 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			syntax_ = syntax.getNumber();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #669 <Method int Syntax.getNumber()>
	//    9   17:putfield        #61  <Field int syntax_>
			onChanged();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		}
	}

	public Api$Builder setSyntaxValue(int i)
	{
		syntax_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field int syntax_>
		onChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #156 <Method void onChanged()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public final Api$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (Api$Builder)super.setUnknownFieldsProto3(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #673 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class Api$Builder>
	//    4    8:areturn         
	}

	public volatile sageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((sageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #675 <Method Api$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile der setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((der) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #675 <Method Api$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public Api$Builder setVersion(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #190 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #191 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			version_ = ((Object) (s));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #55  <Field Object version_>
			onChanged();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   11   21:aload_0         
	//   12   22:areturn         
		}
	}

	public Api$Builder setVersionBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #190 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #191 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			AbstractMessageLite.checkByteStringIsUtf8(bytestring);
	//    6   12:aload_1         
	//    7   13:invokestatic    #649 <Method void AbstractMessageLite.checkByteStringIsUtf8(ByteString)>
			version_ = ((Object) (bytestring));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #55  <Field Object version_>
			onChanged();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #156 <Method void onChanged()>
			return this;
	//   13   25:aload_0         
	//   14   26:areturn         
		}
	}

	private int bitField0_;
	private RepeatedFieldBuilderV3 methodsBuilder_;
	private List methods_;
	private RepeatedFieldBuilderV3 mixinsBuilder_;
	private List mixins_;
	private Object name_;
	private RepeatedFieldBuilderV3 optionsBuilder_;
	private List options_;
	private SingleFieldBuilderV3 sourceContextBuilder_;
	private SourceContext sourceContext_;
	private int syntax_;
	private Object version_;

	private Api$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void GeneratedMessageV3$Builder()>
		name_ = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #41  <String "">
	//    4    7:putfield        #43  <Field Object name_>
		methods_ = Collections.emptyList();
	//    5   10:aload_0         
	//    6   11:invokestatic    #49  <Method List Collections.emptyList()>
	//    7   14:putfield        #51  <Field List methods_>
		options_ = Collections.emptyList();
	//    8   17:aload_0         
	//    9   18:invokestatic    #49  <Method List Collections.emptyList()>
	//   10   21:putfield        #53  <Field List options_>
		version_ = "";
	//   11   24:aload_0         
	//   12   25:ldc1            #41  <String "">
	//   13   27:putfield        #55  <Field Object version_>
		sourceContext_ = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #57  <Field SourceContext sourceContext_>
		mixins_ = Collections.emptyList();
	//   17   35:aload_0         
	//   18   36:invokestatic    #49  <Method List Collections.emptyList()>
	//   19   39:putfield        #59  <Field List mixins_>
		syntax_ = 0;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #61  <Field int syntax_>
		maybeForceBuilderInitialization();
	//   23   47:aload_0         
	//   24   48:invokespecial   #64  <Method void maybeForceBuilderInitialization()>
	//   25   51:return          
	}

	Api$Builder(Api._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Api$Builder()>
	//    2    4:return          
	}

	private Api$Builder(sageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #41  <String "">
	//    5    8:putfield        #43  <Field Object name_>
		methods_ = Collections.emptyList();
	//    6   11:aload_0         
	//    7   12:invokestatic    #49  <Method List Collections.emptyList()>
	//    8   15:putfield        #51  <Field List methods_>
		options_ = Collections.emptyList();
	//    9   18:aload_0         
	//   10   19:invokestatic    #49  <Method List Collections.emptyList()>
	//   11   22:putfield        #53  <Field List options_>
		version_ = "";
	//   12   25:aload_0         
	//   13   26:ldc1            #41  <String "">
	//   14   28:putfield        #55  <Field Object version_>
		sourceContext_ = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #57  <Field SourceContext sourceContext_>
		mixins_ = Collections.emptyList();
	//   18   36:aload_0         
	//   19   37:invokestatic    #49  <Method List Collections.emptyList()>
	//   20   40:putfield        #59  <Field List mixins_>
		syntax_ = 0;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #61  <Field int syntax_>
		maybeForceBuilderInitialization();
	//   24   48:aload_0         
	//   25   49:invokespecial   #64  <Method void maybeForceBuilderInitialization()>
	//   26   52:return          
	}

	Api$Builder(sageV3.BuilderParent builderparent, Api._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #72  <Method void Api$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
