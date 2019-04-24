// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, ApiOrBuilder, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, Method, Option, SourceContext, 
//			Mixin, ApiProto, Parser, MethodOrBuilder, 
//			MixinOrBuilder, ByteString, OptionOrBuilder, MessageLite, 
//			CodedOutputStream, Syntax, ExtensionRegistryLite, Message, 
//			SourceContextOrBuilder, RepeatedFieldBuilderV3, SingleFieldBuilderV3, AbstractMessageLite, 
//			AbstractParser

public final class Api extends GeneratedMessageV3
	implements ApiOrBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
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

		public static final Descriptors.Descriptor getDescriptor()
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
				methodsBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
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
				mixinsBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
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
				optionsBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
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
				sourceContextBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getSourceContext())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
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

		public Builder addAllMethods(Iterable iterable)
		{
			if(methodsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureMethodsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #147 <Method void ensureMethodsIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, methods_);
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

		public Builder addAllMixins(Iterable iterable)
		{
			if(mixinsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureMixinsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #164 <Method void ensureMixinsIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, mixins_);
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

		public Builder addAllOptions(Iterable iterable)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureOptionsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #168 <Method void ensureOptionsIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, options_);
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

		public Builder addMethods(int i, Method.Builder builder)
		{
			if(methodsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureMethodsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #147 <Method void ensureMethodsIsMutable()>
				methods_.add(i, ((Object) (builder.build())));
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
				methodsBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addMethods(int i, Method method)
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

		public Builder addMethods(Method.Builder builder)
		{
			if(methodsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureMethodsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #147 <Method void ensureMethodsIsMutable()>
				methods_.add(((Object) (builder.build())));
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
				methodsBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addMethods(Method method)
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

		public Method.Builder addMethodsBuilder()
		{
			return (Method.Builder)getMethodsFieldBuilder().addBuilder(((AbstractMessage) (Method.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getMethodsFieldBuilder()>
		//    2    4:invokestatic    #206 <Method Method Method.getDefaultInstance()>
		//    3    7:invokevirtual   #210 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #173 <Class Method$Builder>
		//    5   13:areturn         
		}

		public Method.Builder addMethodsBuilder(int i)
		{
			return (Method.Builder)getMethodsFieldBuilder().addBuilder(i, ((AbstractMessage) (Method.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #139 <Method RepeatedFieldBuilderV3 getMethodsFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #206 <Method Method Method.getDefaultInstance()>
		//    4    8:invokevirtual   #214 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #173 <Class Method$Builder>
		//    6   14:areturn         
		}

		public Builder addMixins(int i, Mixin.Builder builder)
		{
			if(mixinsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureMixinsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #164 <Method void ensureMixinsIsMutable()>
				mixins_.add(i, ((Object) (builder.build())));
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
				mixinsBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addMixins(int i, Mixin mixin)
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

		public Builder addMixins(Mixin.Builder builder)
		{
			if(mixinsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureMixinsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #164 <Method void ensureMixinsIsMutable()>
				mixins_.add(((Object) (builder.build())));
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
				mixinsBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addMixins(Mixin mixin)
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

		public Mixin.Builder addMixinsBuilder()
		{
			return (Mixin.Builder)getMixinsFieldBuilder().addBuilder(((AbstractMessage) (Mixin.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #143 <Method RepeatedFieldBuilderV3 getMixinsFieldBuilder()>
		//    2    4:invokestatic    #230 <Method Mixin Mixin.getDefaultInstance()>
		//    3    7:invokevirtual   #210 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #218 <Class Mixin$Builder>
		//    5   13:areturn         
		}

		public Mixin.Builder addMixinsBuilder(int i)
		{
			return (Mixin.Builder)getMixinsFieldBuilder().addBuilder(i, ((AbstractMessage) (Mixin.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #143 <Method RepeatedFieldBuilderV3 getMixinsFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #230 <Method Mixin Mixin.getDefaultInstance()>
		//    4    8:invokevirtual   #214 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #218 <Class Mixin$Builder>
		//    6   14:areturn         
		}

		public Builder addOptions(int i, Option.Builder builder)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureOptionsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #168 <Method void ensureOptionsIsMutable()>
				options_.add(i, ((Object) (builder.build())));
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
				optionsBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addOptions(int i, Option option)
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

		public Builder addOptions(Option.Builder builder)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureOptionsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #168 <Method void ensureOptionsIsMutable()>
				options_.add(((Object) (builder.build())));
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
				optionsBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addOptions(Option option)
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

		public Option.Builder addOptionsBuilder()
		{
			return (Option.Builder)getOptionsFieldBuilder().addBuilder(((AbstractMessage) (Option.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #141 <Method RepeatedFieldBuilderV3 getOptionsFieldBuilder()>
		//    2    4:invokestatic    #247 <Method Option Option.getDefaultInstance()>
		//    3    7:invokevirtual   #210 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #235 <Class Option$Builder>
		//    5   13:areturn         
		}

		public Option.Builder addOptionsBuilder(int i)
		{
			return (Option.Builder)getOptionsFieldBuilder().addBuilder(i, ((AbstractMessage) (Option.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #141 <Method RepeatedFieldBuilderV3 getOptionsFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #247 <Method Option Option.getDefaultInstance()>
		//    4    8:invokevirtual   #214 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #235 <Class Option$Builder>
		//    6   14:areturn         
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #253 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class Api$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #255 <Method Api$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
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
			Api api = new Api(((GeneratedMessageV3.Builder) (this)));
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
			api.name_ = name_;
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
				api.methods_ = methods_;
		//   34   63:aload_2         
		//   35   64:aload_0         
		//   36   65:getfield        #51  <Field List methods_>
		//   37   68:invokestatic    #286 <Method List Api.access$402(Api, List)>
		//   38   71:pop             
			} else
		//*  39   72:goto            87
			{
				api.methods_ = methodsBuilder_.build();
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
				api.options_ = options_;
		//   66  126:aload_2         
		//   67  127:aload_0         
		//   68  128:getfield        #53  <Field List options_>
		//   69  131:invokestatic    #291 <Method List Api.access$502(Api, List)>
		//   70  134:pop             
			} else
		//*  71  135:goto            150
			{
				api.options_ = optionsBuilder_.build();
		//   72  138:aload_2         
		//   73  139:aload_0         
		//   74  140:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
		//   75  143:invokevirtual   #288 <Method List RepeatedFieldBuilderV3.build()>
		//   76  146:invokestatic    #291 <Method List Api.access$502(Api, List)>
		//   77  149:pop             
			}
			api.version_ = version_;
		//   78  150:aload_2         
		//   79  151:aload_0         
		//   80  152:getfield        #55  <Field Object version_>
		//   81  155:invokestatic    #294 <Method Object Api.access$602(Api, Object)>
		//   82  158:pop             
			if(sourceContextBuilder_ == null)
		//*  83  159:aload_0         
		//*  84  160:getfield        #121 <Field SingleFieldBuilderV3 sourceContextBuilder_>
		//*  85  163:ifnonnull       178
				api.sourceContext_ = sourceContext_;
		//   86  166:aload_2         
		//   87  167:aload_0         
		//   88  168:getfield        #57  <Field SourceContext sourceContext_>
		//   89  171:invokestatic    #298 <Method SourceContext Api.access$702(Api, SourceContext)>
		//   90  174:pop             
			else
		//*  91  175:goto            193
				api.sourceContext_ = (SourceContext)sourceContextBuilder_.build();
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
				api.mixins_ = mixins_;
		//  119  234:aload_2         
		//  120  235:aload_0         
		//  121  236:getfield        #59  <Field List mixins_>
		//  122  239:invokestatic    #306 <Method List Api.access$802(Api, List)>
		//  123  242:pop             
			} else
		//* 124  243:goto            258
			{
				api.mixins_ = mixinsBuilder_.build();
		//  125  246:aload_2         
		//  126  247:aload_0         
		//  127  248:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
		//  128  251:invokevirtual   #288 <Method List RepeatedFieldBuilderV3.build()>
		//  129  254:invokestatic    #306 <Method List Api.access$802(Api, List)>
		//  130  257:pop             
			}
			api.syntax_ = syntax_;
		//  131  258:aload_2         
		//  132  259:aload_0         
		//  133  260:getfield        #61  <Field int syntax_>
		//  134  263:invokestatic    #310 <Method int Api.access$902(Api, int)>
		//  135  266:pop             
			api.bitField0_ = 0;
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

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #321 <Method Api$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
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

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #321 <Method Api$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #321 <Method Api$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #321 <Method Api$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #333 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class Api$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #335 <Method Api$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #335 <Method Api$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearMethods()
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

		public Builder clearMixins()
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

		public Builder clearName()
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

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #350 <Method Api$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #353 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class Api$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #350 <Method Api$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #350 <Method Api$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOptions()
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

		public Builder clearSourceContext()
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

		public Builder clearSyntax()
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

		public Builder clearVersion()
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

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #367 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class Api$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #364 <Method Api$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
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

		public Descriptors.Descriptor getDescriptorForType()
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

		public Method.Builder getMethodsBuilder(int i)
		{
			return (Method.Builder)getMethodsFieldBuilder().getBuilder(i);
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

		public Mixin.Builder getMixinsBuilder(int i)
		{
			return (Mixin.Builder)getMixinsFieldBuilder().getBuilder(i);
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

		public Option.Builder getOptionsBuilder(int i)
		{
			return (Option.Builder)getOptionsFieldBuilder().getBuilder(i);
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

		public SourceContext.Builder getSourceContextBuilder()
		{
			onChanged();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #156 <Method void onChanged()>
			return (SourceContext.Builder)getSourceContextFieldBuilder().getBuilder();
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

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
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

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #515 <Method Api$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #519 <Method Api$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #515 <Method Api$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeFrom(Api api)
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
				name_ = api.name_;
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
				if(!api.methods_.isEmpty())
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
						methods_ = api.methods_;
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
						methods_.addAll(((java.util.Collection) (api.methods_)));
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
			if(!api.methods_.isEmpty())
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
					methods_ = api.methods_;
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
					methodsBuilder_.addAllMessages(((Iterable) (api.methods_)));
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
				if(!api.options_.isEmpty())
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
						options_ = api.options_;
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
						options_.addAll(((java.util.Collection) (api.options_)));
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
			if(!api.options_.isEmpty())
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
					options_ = api.options_;
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
					optionsBuilder_.addAllMessages(((Iterable) (api.options_)));
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
				version_ = api.version_;
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
				if(!api.mixins_.isEmpty())
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
						mixins_ = api.mixins_;
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
						mixins_.addAll(((java.util.Collection) (api.mixins_)));
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
			if(!api.mixins_.isEmpty())
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
					mixins_ = api.mixins_;
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
					mixinsBuilder_.addAllMessages(((Iterable) (api.mixins_)));
		//  252  558:aload_0         
		//  253  559:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
		//  254  562:aload_1         
		//  255  563:invokestatic    #556 <Method List Api.access$800(Api)>
		//  256  566:invokevirtual   #160 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//  257  569:pop             
				}
			if(api.syntax_ != 0)
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
			codedinputstream = ((CodedInputStream) ((Api)Api.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
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

		public Builder mergeFrom(Message message)
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

		public volatile Message.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((Message.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #515 <Method Api$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #519 <Method Api$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #515 <Method Api$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeSourceContext(SourceContext sourcecontext)
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

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #574 <Method Api$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #615 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class Api$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #574 <Method Api$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #574 <Method Api$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder removeMethods(int i)
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

		public Builder removeMixins(int i)
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

		public Builder removeOptions(int i)
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #628 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class Api$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #630 <Method Api$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #630 <Method Api$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setMethods(int i, Method.Builder builder)
		{
			if(methodsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #94  <Field RepeatedFieldBuilderV3 methodsBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureMethodsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #147 <Method void ensureMethodsIsMutable()>
				methods_.set(i, ((Object) (builder.build())));
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
				methodsBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setMethods(int i, Method method)
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

		public Builder setMixins(int i, Mixin.Builder builder)
		{
			if(mixinsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #112 <Field RepeatedFieldBuilderV3 mixinsBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureMixinsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #164 <Method void ensureMixinsIsMutable()>
				mixins_.set(i, ((Object) (builder.build())));
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
				mixinsBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setMixins(int i, Mixin mixin)
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

		public Builder setName(String s)
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

		public Builder setNameBytes(ByteString bytestring)
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

		public Builder setOptions(int i, Option.Builder builder)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #116 <Field RepeatedFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureOptionsIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #168 <Method void ensureOptionsIsMutable()>
				options_.set(i, ((Object) (builder.build())));
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
				optionsBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setOptions(int i, Option option)
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

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #655 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class Api$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #657 <Method Api$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #657 <Method Api$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setSourceContext(SourceContext.Builder builder)
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

		public Builder setSourceContext(SourceContext sourcecontext)
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

		public Builder setSyntax(Syntax syntax)
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

		public Builder setSyntaxValue(int i)
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFieldsProto3(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #673 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class Api$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #675 <Method Api$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #675 <Method Api$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setVersion(String s)
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

		public Builder setVersionBytes(ByteString bytestring)
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

		private Builder()
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


		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	}


	private Api()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #65  <Field byte memoizedIsInitialized>
		name_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #67  <String "">
	//    7   12:putfield        #69  <Field Object name_>
		methods_ = Collections.emptyList();
	//    8   15:aload_0         
	//    9   16:invokestatic    #75  <Method List Collections.emptyList()>
	//   10   19:putfield        #77  <Field List methods_>
		options_ = Collections.emptyList();
	//   11   22:aload_0         
	//   12   23:invokestatic    #75  <Method List Collections.emptyList()>
	//   13   26:putfield        #79  <Field List options_>
		version_ = "";
	//   14   29:aload_0         
	//   15   30:ldc1            #67  <String "">
	//   16   32:putfield        #81  <Field Object version_>
		mixins_ = Collections.emptyList();
	//   17   35:aload_0         
	//   18   36:invokestatic    #75  <Method List Collections.emptyList()>
	//   19   39:putfield        #83  <Field List mixins_>
		syntax_ = 0;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #85  <Field int syntax_>
	//   23   47:return          
	}

	private Api(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag1;
		UnknownFieldSet.Builder builder1;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Api()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #92  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #93  <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder1 = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #99  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          12
		flag1 = false;
	//   12   23:iconst_0        
	//   13   24:istore          9
_L21:
		int j;
		int l;
		int i1;
		if(flag1)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           9
	//   15   28:ifne            589
		l = i;
	//   16   31:iload_3         
	//   17   32:istore          6
		i1 = i;
	//   18   34:iload_3         
	//   19   35:istore          7
		j = i;
	//   20   37:iload_3         
	//   21   38:istore          4
		int j1 = codedinputstream.readTag();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #105 <Method int CodedInputStream.readTag()>
	//   24   44:istore          10
		j1;
	//   25   46:iload           10
		JVM INSTR lookupswitch 8: default 763
	//	               0: 766
	//	               10: 162
	//	               18: 189
	//	               26: 261
	//	               34: 333
	//	               42: 360
	//	               50: 480
	//	               56: 555;
	//   26   48:lookupswitch    8: default 763
	//	               0: 766
	//	               10: 162
	//	               18: 189
	//	               26: 261
	//	               34: 333
	//	               42: 360
	//	               50: 480
	//	               56: 555
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
		int k;
		boolean flag;
		k = i;
	//   27  124:iload_3         
	//   28  125:istore          5
		flag = flag1;
	//   29  127:iload           9
	//   30  129:istore          8
		l = i;
	//   31  131:iload_3         
	//   32  132:istore          6
		i1 = i;
	//   33  134:iload_3         
	//   34  135:istore          7
		j = i;
	//   35  137:iload_3         
	//   36  138:istore          4
		if(!parseUnknownFieldProto3(codedinputstream, builder1, extensionregistrylite, j1))
	//*  37  140:aload_0         
	//*  38  141:aload_1         
	//*  39  142:aload           12
	//*  40  144:aload_2         
	//*  41  145:iload           10
	//*  42  147:invokevirtual   #109 <Method boolean parseUnknownFieldProto3(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  43  150:ifne            579
		{
			flag = true;
	//   44  153:iconst_1        
	//   45  154:istore          8
			k = i;
	//   46  156:iload_3         
	//   47  157:istore          5
		}
		  goto _L10
	//*  48  159:goto            579
_L3:
		l = i;
	//   49  162:iload_3         
	//   50  163:istore          6
		i1 = i;
	//   51  165:iload_3         
	//   52  166:istore          7
		j = i;
	//   53  168:iload_3         
	//   54  169:istore          4
		name_ = ((Object) (codedinputstream.readStringRequireUtf8()));
	//   55  171:aload_0         
	//   56  172:aload_1         
	//   57  173:invokevirtual   #113 <Method String CodedInputStream.readStringRequireUtf8()>
	//   58  176:putfield        #69  <Field Object name_>
		k = i;
	//   59  179:iload_3         
	//   60  180:istore          5
		flag = flag1;
	//   61  182:iload           9
	//   62  184:istore          8
		  goto _L10
	//*  63  186:goto            579
_L4:
		k = i;
	//   64  189:iload_3         
	//   65  190:istore          5
		if((i & 2) == 2) goto _L12; else goto _L11
	//   66  192:iload_3         
	//   67  193:iconst_2        
	//   68  194:iand            
	//   69  195:iconst_2        
	//   70  196:icmpeq          224
_L11:
		l = i;
	//   71  199:iload_3         
	//   72  200:istore          6
		i1 = i;
	//   73  202:iload_3         
	//   74  203:istore          7
		j = i;
	//   75  205:iload_3         
	//   76  206:istore          4
		methods_ = ((List) (new ArrayList()));
	//   77  208:aload_0         
	//   78  209:new             #115 <Class ArrayList>
	//   79  212:dup             
	//   80  213:invokespecial   #116 <Method void ArrayList()>
	//   81  216:putfield        #77  <Field List methods_>
		k = i | 2;
	//   82  219:iload_3         
	//   83  220:iconst_2        
	//   84  221:ior             
	//   85  222:istore          5
_L12:
		l = k;
	//   86  224:iload           5
	//   87  226:istore          6
		i1 = k;
	//   88  228:iload           5
	//   89  230:istore          7
		j = k;
	//   90  232:iload           5
	//   91  234:istore          4
		methods_.add(((Object) (codedinputstream.readMessage(Method.parser(), extensionregistrylite))));
	//   92  236:aload_0         
	//   93  237:getfield        #77  <Field List methods_>
	//   94  240:aload_1         
	//   95  241:invokestatic    #122 <Method Parser Method.parser()>
	//   96  244:aload_2         
	//   97  245:invokevirtual   #126 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//   98  248:invokeinterface #132 <Method boolean List.add(Object)>
	//   99  253:pop             
		flag = flag1;
	//  100  254:iload           9
	//  101  256:istore          8
		  goto _L10
	//* 102  258:goto            579
_L5:
		k = i;
	//  103  261:iload_3         
	//  104  262:istore          5
		if((i & 4) == 4) goto _L14; else goto _L13
	//  105  264:iload_3         
	//  106  265:iconst_4        
	//  107  266:iand            
	//  108  267:iconst_4        
	//  109  268:icmpeq          296
_L13:
		l = i;
	//  110  271:iload_3         
	//  111  272:istore          6
		i1 = i;
	//  112  274:iload_3         
	//  113  275:istore          7
		j = i;
	//  114  277:iload_3         
	//  115  278:istore          4
		options_ = ((List) (new ArrayList()));
	//  116  280:aload_0         
	//  117  281:new             #115 <Class ArrayList>
	//  118  284:dup             
	//  119  285:invokespecial   #116 <Method void ArrayList()>
	//  120  288:putfield        #79  <Field List options_>
		k = i | 4;
	//  121  291:iload_3         
	//  122  292:iconst_4        
	//  123  293:ior             
	//  124  294:istore          5
_L14:
		l = k;
	//  125  296:iload           5
	//  126  298:istore          6
		i1 = k;
	//  127  300:iload           5
	//  128  302:istore          7
		j = k;
	//  129  304:iload           5
	//  130  306:istore          4
		options_.add(((Object) (codedinputstream.readMessage(Option.parser(), extensionregistrylite))));
	//  131  308:aload_0         
	//  132  309:getfield        #79  <Field List options_>
	//  133  312:aload_1         
	//  134  313:invokestatic    #135 <Method Parser Option.parser()>
	//  135  316:aload_2         
	//  136  317:invokevirtual   #126 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  137  320:invokeinterface #132 <Method boolean List.add(Object)>
	//  138  325:pop             
		flag = flag1;
	//  139  326:iload           9
	//  140  328:istore          8
		  goto _L10
	//* 141  330:goto            579
_L6:
		l = i;
	//  142  333:iload_3         
	//  143  334:istore          6
		i1 = i;
	//  144  336:iload_3         
	//  145  337:istore          7
		j = i;
	//  146  339:iload_3         
	//  147  340:istore          4
		version_ = ((Object) (codedinputstream.readStringRequireUtf8()));
	//  148  342:aload_0         
	//  149  343:aload_1         
	//  150  344:invokevirtual   #113 <Method String CodedInputStream.readStringRequireUtf8()>
	//  151  347:putfield        #81  <Field Object version_>
		k = i;
	//  152  350:iload_3         
	//  153  351:istore          5
		flag = flag1;
	//  154  353:iload           9
	//  155  355:istore          8
		  goto _L10
	//* 156  357:goto            579
_L7:
		SourceContext.Builder builder;
		builder = null;
	//  157  360:aconst_null     
	//  158  361:astore          11
		l = i;
	//  159  363:iload_3         
	//  160  364:istore          6
		i1 = i;
	//  161  366:iload_3         
	//  162  367:istore          7
		j = i;
	//  163  369:iload_3         
	//  164  370:istore          4
		if(sourceContext_ == null) goto _L16; else goto _L15
	//  165  372:aload_0         
	//  166  373:getfield        #137 <Field SourceContext sourceContext_>
	//  167  376:ifnull          397
_L15:
		l = i;
	//  168  379:iload_3         
	//  169  380:istore          6
		i1 = i;
	//  170  382:iload_3         
	//  171  383:istore          7
		j = i;
	//  172  385:iload_3         
	//  173  386:istore          4
		builder = sourceContext_.toBuilder();
	//  174  388:aload_0         
	//  175  389:getfield        #137 <Field SourceContext sourceContext_>
	//  176  392:invokevirtual   #143 <Method SourceContext$Builder SourceContext.toBuilder()>
	//  177  395:astore          11
_L16:
		l = i;
	//  178  397:iload_3         
	//  179  398:istore          6
		i1 = i;
	//  180  400:iload_3         
	//  181  401:istore          7
		j = i;
	//  182  403:iload_3         
	//  183  404:istore          4
		sourceContext_ = (SourceContext)codedinputstream.readMessage(SourceContext.parser(), extensionregistrylite);
	//  184  406:aload_0         
	//  185  407:aload_1         
	//  186  408:invokestatic    #144 <Method Parser SourceContext.parser()>
	//  187  411:aload_2         
	//  188  412:invokevirtual   #126 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  189  415:checkcast       #139 <Class SourceContext>
	//  190  418:putfield        #137 <Field SourceContext sourceContext_>
		k = i;
	//  191  421:iload_3         
	//  192  422:istore          5
		flag = flag1;
	//  193  424:iload           9
	//  194  426:istore          8
		if(builder == null) goto _L10; else goto _L17
	//  195  428:aload           11
	//  196  430:ifnull          579
_L17:
		l = i;
	//  197  433:iload_3         
	//  198  434:istore          6
		i1 = i;
	//  199  436:iload_3         
	//  200  437:istore          7
		j = i;
	//  201  439:iload_3         
	//  202  440:istore          4
		builder.mergeFrom(sourceContext_);
	//  203  442:aload           11
	//  204  444:aload_0         
	//  205  445:getfield        #137 <Field SourceContext sourceContext_>
	//  206  448:invokevirtual   #150 <Method SourceContext$Builder SourceContext$Builder.mergeFrom(SourceContext)>
	//  207  451:pop             
		l = i;
	//  208  452:iload_3         
	//  209  453:istore          6
		i1 = i;
	//  210  455:iload_3         
	//  211  456:istore          7
		j = i;
	//  212  458:iload_3         
	//  213  459:istore          4
		sourceContext_ = builder.buildPartial();
	//  214  461:aload_0         
	//  215  462:aload           11
	//  216  464:invokevirtual   #154 <Method SourceContext SourceContext$Builder.buildPartial()>
	//  217  467:putfield        #137 <Field SourceContext sourceContext_>
		k = i;
	//  218  470:iload_3         
	//  219  471:istore          5
		flag = flag1;
	//  220  473:iload           9
	//  221  475:istore          8
		  goto _L10
	//* 222  477:goto            579
_L8:
		k = i;
	//  223  480:iload_3         
	//  224  481:istore          5
		if((i & 0x20) == 32) goto _L19; else goto _L18
	//  225  483:iload_3         
	//  226  484:bipush          32
	//  227  486:iand            
	//  228  487:bipush          32
	//  229  489:icmpeq          518
_L18:
		l = i;
	//  230  492:iload_3         
	//  231  493:istore          6
		i1 = i;
	//  232  495:iload_3         
	//  233  496:istore          7
		j = i;
	//  234  498:iload_3         
	//  235  499:istore          4
		mixins_ = ((List) (new ArrayList()));
	//  236  501:aload_0         
	//  237  502:new             #115 <Class ArrayList>
	//  238  505:dup             
	//  239  506:invokespecial   #116 <Method void ArrayList()>
	//  240  509:putfield        #83  <Field List mixins_>
		k = i | 0x20;
	//  241  512:iload_3         
	//  242  513:bipush          32
	//  243  515:ior             
	//  244  516:istore          5
_L19:
		l = k;
	//  245  518:iload           5
	//  246  520:istore          6
		i1 = k;
	//  247  522:iload           5
	//  248  524:istore          7
		j = k;
	//  249  526:iload           5
	//  250  528:istore          4
		mixins_.add(((Object) (codedinputstream.readMessage(Mixin.parser(), extensionregistrylite))));
	//  251  530:aload_0         
	//  252  531:getfield        #83  <Field List mixins_>
	//  253  534:aload_1         
	//  254  535:invokestatic    #157 <Method Parser Mixin.parser()>
	//  255  538:aload_2         
	//  256  539:invokevirtual   #126 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  257  542:invokeinterface #132 <Method boolean List.add(Object)>
	//  258  547:pop             
		flag = flag1;
	//  259  548:iload           9
	//  260  550:istore          8
		  goto _L10
	//* 261  552:goto            579
_L9:
		l = i;
	//  262  555:iload_3         
	//  263  556:istore          6
		i1 = i;
	//  264  558:iload_3         
	//  265  559:istore          7
		j = i;
	//  266  561:iload_3         
	//  267  562:istore          4
		syntax_ = codedinputstream.readEnum();
	//  268  564:aload_0         
	//  269  565:aload_1         
	//  270  566:invokevirtual   #160 <Method int CodedInputStream.readEnum()>
	//  271  569:putfield        #85  <Field int syntax_>
		flag = flag1;
	//  272  572:iload           9
	//  273  574:istore          8
		k = i;
	//  274  576:iload_3         
	//  275  577:istore          5
_L10:
		i = k;
	//  276  579:iload           5
	//  277  581:istore_3        
		flag1 = flag;
	//  278  582:iload           8
	//  279  584:istore          9
		if(true) goto _L21; else goto _L20
	//  280  586:goto            26
_L20:
		if((i & 2) == 2)
	//* 281  589:iload_3         
	//* 282  590:iconst_2        
	//* 283  591:iand            
	//* 284  592:iconst_2        
	//* 285  593:icmpne          607
			methods_ = Collections.unmodifiableList(methods_);
	//  286  596:aload_0         
	//  287  597:aload_0         
	//  288  598:getfield        #77  <Field List methods_>
	//  289  601:invokestatic    #164 <Method List Collections.unmodifiableList(List)>
	//  290  604:putfield        #77  <Field List methods_>
		if((i & 4) == 4)
	//* 291  607:iload_3         
	//* 292  608:iconst_4        
	//* 293  609:iand            
	//* 294  610:iconst_4        
	//* 295  611:icmpne          625
			options_ = Collections.unmodifiableList(options_);
	//  296  614:aload_0         
	//  297  615:aload_0         
	//  298  616:getfield        #79  <Field List options_>
	//  299  619:invokestatic    #164 <Method List Collections.unmodifiableList(List)>
	//  300  622:putfield        #79  <Field List options_>
		if((i & 0x20) == 32)
	//* 301  625:iload_3         
	//* 302  626:bipush          32
	//* 303  628:iand            
	//* 304  629:bipush          32
	//* 305  631:icmpne          645
			mixins_ = Collections.unmodifiableList(mixins_);
	//  306  634:aload_0         
	//  307  635:aload_0         
	//  308  636:getfield        #83  <Field List mixins_>
	//  309  639:invokestatic    #164 <Method List Collections.unmodifiableList(List)>
	//  310  642:putfield        #83  <Field List mixins_>
		unknownFields = builder1.build();
	//  311  645:aload_0         
	//  312  646:aload           12
	//  313  648:invokevirtual   #170 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  314  651:putfield        #174 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  315  654:aload_0         
	//  316  655:invokevirtual   #177 <Method void makeExtensionsImmutable()>
		return;
	//  317  658:return          
		codedinputstream;
	//  318  659:astore_1        
		j = l;
	//  319  660:iload           6
	//  320  662:istore          4
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  321  664:aload_1         
	//  322  665:aload_0         
	//  323  666:invokevirtual   #181 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  324  669:athrow          
		codedinputstream;
	//  325  670:astore_1        
		j = i1;
	//  326  671:iload           7
	//  327  673:istore          4
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  328  675:new             #88  <Class InvalidProtocolBufferException>
	//  329  678:dup             
	//  330  679:aload_1         
	//  331  680:invokespecial   #184 <Method void InvalidProtocolBufferException(IOException)>
	//  332  683:aload_0         
	//  333  684:invokevirtual   #181 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  334  687:athrow          
		codedinputstream;
	//  335  688:astore_1        
		if((j & 2) == 2)
	//* 336  689:iload           4
	//* 337  691:iconst_2        
	//* 338  692:iand            
	//* 339  693:iconst_2        
	//* 340  694:icmpne          708
			methods_ = Collections.unmodifiableList(methods_);
	//  341  697:aload_0         
	//  342  698:aload_0         
	//  343  699:getfield        #77  <Field List methods_>
	//  344  702:invokestatic    #164 <Method List Collections.unmodifiableList(List)>
	//  345  705:putfield        #77  <Field List methods_>
		if((j & 4) == 4)
	//* 346  708:iload           4
	//* 347  710:iconst_4        
	//* 348  711:iand            
	//* 349  712:iconst_4        
	//* 350  713:icmpne          727
			options_ = Collections.unmodifiableList(options_);
	//  351  716:aload_0         
	//  352  717:aload_0         
	//  353  718:getfield        #79  <Field List options_>
	//  354  721:invokestatic    #164 <Method List Collections.unmodifiableList(List)>
	//  355  724:putfield        #79  <Field List options_>
		if((j & 0x20) == 32)
	//* 356  727:iload           4
	//* 357  729:bipush          32
	//* 358  731:iand            
	//* 359  732:bipush          32
	//* 360  734:icmpne          748
			mixins_ = Collections.unmodifiableList(mixins_);
	//  361  737:aload_0         
	//  362  738:aload_0         
	//  363  739:getfield        #83  <Field List mixins_>
	//  364  742:invokestatic    #164 <Method List Collections.unmodifiableList(List)>
	//  365  745:putfield        #83  <Field List mixins_>
		unknownFields = builder1.build();
	//  366  748:aload_0         
	//  367  749:aload           12
	//  368  751:invokevirtual   #170 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  369  754:putfield        #174 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  370  757:aload_0         
	//  371  758:invokevirtual   #177 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  372  761:aload_1         
	//  373  762:athrow          
	//* 374  763:goto            124
_L2:
		flag = true;
	//  375  766:iconst_1        
	//  376  767:istore          8
		k = i;
	//  377  769:iload_3         
	//  378  770:istore          5
		  goto _L10
	//* 379  772:goto            579
	}


	private Api(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #191 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #65  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}


	public static Api getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #58  <Field Api DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return ApiProto.internal_static_google_protobuf_Api_descriptor;
	//    0    0:getstatic       #229 <Field Descriptors$Descriptor ApiProto.internal_static_google_protobuf_Api_descriptor>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #58  <Field Api DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #232 <Method Api$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(Api api)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(api);
	//    0    0:getstatic       #58  <Field Api DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #232 <Method Api$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #235 <Method Api$Builder Api$Builder.mergeFrom(Api)>
	//    4   10:areturn         
	}

	public static Api parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (Api)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #241 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Api>
	//    4   10:areturn         
	}

	public static Api parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Api)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #245 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Api>
	//    5   11:areturn         
	}

	public static Api parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (Api)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #252 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class Api>
	//    4   12:areturn         
	}

	public static Api parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Api)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #256 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Api>
	//    5   13:areturn         
	}

	public static Api parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (Api)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #261 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class Api>
	//    4   10:areturn         
	}

	public static Api parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Api)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #265 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Api>
	//    5   11:areturn         
	}

	public static Api parseFrom(InputStream inputstream)
		throws IOException
	{
		return (Api)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #267 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Api>
	//    4   10:areturn         
	}

	public static Api parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Api)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #269 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Api>
	//    5   11:areturn         
	}

	public static Api parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (Api)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #273 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class Api>
	//    4   12:areturn         
	}

	public static Api parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Api)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #277 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Api>
	//    5   13:areturn         
	}

	public static Api parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (Api)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #281 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class Api>
	//    4   12:areturn         
	}

	public static Api parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Api)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #285 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Api>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #61  <Field Parser PARSER>
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
		if(!(obj instanceof Api))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Api>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #289 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((Api)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Api>
	//   14   24:astore_1        
		boolean flag;
		if(true && getName().equals(((Object) (((Api) (obj)).getName()))))
	//*  15   25:iconst_1        
	//*  16   26:ifeq            48
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #292 <Method String getName()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #292 <Method String getName()>
	//*  21   37:invokevirtual   #295 <Method boolean String.equals(Object)>
	//*  22   40:ifeq            48
			flag = true;
	//   23   43:iconst_1        
	//   24   44:istore_2        
		else
	//*  25   45:goto            50
			flag = false;
	//   26   48:iconst_0        
	//   27   49:istore_2        
		if(flag && getMethodsList().equals(((Object) (((Api) (obj)).getMethodsList()))))
	//*  28   50:iload_2         
	//*  29   51:ifeq            75
	//*  30   54:aload_0         
	//*  31   55:invokevirtual   #298 <Method List getMethodsList()>
	//*  32   58:aload_1         
	//*  33   59:invokevirtual   #298 <Method List getMethodsList()>
	//*  34   62:invokeinterface #299 <Method boolean List.equals(Object)>
	//*  35   67:ifeq            75
			flag = true;
	//   36   70:iconst_1        
	//   37   71:istore_2        
		else
	//*  38   72:goto            77
			flag = false;
	//   39   75:iconst_0        
	//   40   76:istore_2        
		if(flag && getOptionsList().equals(((Object) (((Api) (obj)).getOptionsList()))))
	//*  41   77:iload_2         
	//*  42   78:ifeq            102
	//*  43   81:aload_0         
	//*  44   82:invokevirtual   #302 <Method List getOptionsList()>
	//*  45   85:aload_1         
	//*  46   86:invokevirtual   #302 <Method List getOptionsList()>
	//*  47   89:invokeinterface #299 <Method boolean List.equals(Object)>
	//*  48   94:ifeq            102
			flag = true;
	//   49   97:iconst_1        
	//   50   98:istore_2        
		else
	//*  51   99:goto            104
			flag = false;
	//   52  102:iconst_0        
	//   53  103:istore_2        
		if(flag && getVersion().equals(((Object) (((Api) (obj)).getVersion()))))
	//*  54  104:iload_2         
	//*  55  105:ifeq            127
	//*  56  108:aload_0         
	//*  57  109:invokevirtual   #305 <Method String getVersion()>
	//*  58  112:aload_1         
	//*  59  113:invokevirtual   #305 <Method String getVersion()>
	//*  60  116:invokevirtual   #295 <Method boolean String.equals(Object)>
	//*  61  119:ifeq            127
			flag = true;
	//   62  122:iconst_1        
	//   63  123:istore_2        
		else
	//*  64  124:goto            129
			flag = false;
	//   65  127:iconst_0        
	//   66  128:istore_2        
		if(flag && hasSourceContext() == ((Api) (obj)).hasSourceContext())
	//*  67  129:iload_2         
	//*  68  130:ifeq            149
	//*  69  133:aload_0         
	//*  70  134:invokevirtual   #309 <Method boolean hasSourceContext()>
	//*  71  137:aload_1         
	//*  72  138:invokevirtual   #309 <Method boolean hasSourceContext()>
	//*  73  141:icmpne          149
			flag = true;
	//   74  144:iconst_1        
	//   75  145:istore_2        
		else
	//*  76  146:goto            151
			flag = false;
	//   77  149:iconst_0        
	//   78  150:istore_2        
		boolean flag1 = flag;
	//   79  151:iload_2         
	//   80  152:istore_3        
		if(hasSourceContext())
	//*  81  153:aload_0         
	//*  82  154:invokevirtual   #309 <Method boolean hasSourceContext()>
	//*  83  157:ifeq            185
			if(flag && getSourceContext().equals(((Object) (((Api) (obj)).getSourceContext()))))
	//*  84  160:iload_2         
	//*  85  161:ifeq            183
	//*  86  164:aload_0         
	//*  87  165:invokevirtual   #312 <Method SourceContext getSourceContext()>
	//*  88  168:aload_1         
	//*  89  169:invokevirtual   #312 <Method SourceContext getSourceContext()>
	//*  90  172:invokevirtual   #313 <Method boolean SourceContext.equals(Object)>
	//*  91  175:ifeq            183
				flag1 = true;
	//   92  178:iconst_1        
	//   93  179:istore_3        
			else
	//*  94  180:goto            185
				flag1 = false;
	//   95  183:iconst_0        
	//   96  184:istore_3        
		if(flag1 && getMixinsList().equals(((Object) (((Api) (obj)).getMixinsList()))))
	//*  97  185:iload_3         
	//*  98  186:ifeq            210
	//*  99  189:aload_0         
	//* 100  190:invokevirtual   #316 <Method List getMixinsList()>
	//* 101  193:aload_1         
	//* 102  194:invokevirtual   #316 <Method List getMixinsList()>
	//* 103  197:invokeinterface #299 <Method boolean List.equals(Object)>
	//* 104  202:ifeq            210
			flag = true;
	//  105  205:iconst_1        
	//  106  206:istore_2        
		else
	//* 107  207:goto            212
			flag = false;
	//  108  210:iconst_0        
	//  109  211:istore_2        
		if(flag && syntax_ == ((Api) (obj)).syntax_)
	//* 110  212:iload_2         
	//* 111  213:ifeq            232
	//* 112  216:aload_0         
	//* 113  217:getfield        #85  <Field int syntax_>
	//* 114  220:aload_1         
	//* 115  221:getfield        #85  <Field int syntax_>
	//* 116  224:icmpne          232
			flag = true;
	//  117  227:iconst_1        
	//  118  228:istore_2        
		else
	//* 119  229:goto            234
			flag = false;
	//  120  232:iconst_0        
	//  121  233:istore_2        
		return flag && unknownFields.equals(((Object) (((Api) (obj)).unknownFields)));
	//  122  234:iload_2         
	//  123  235:ifeq            254
	//  124  238:aload_0         
	//  125  239:getfield        #174 <Field UnknownFieldSet unknownFields>
	//  126  242:aload_1         
	//  127  243:getfield        #174 <Field UnknownFieldSet unknownFields>
	//  128  246:invokevirtual   #317 <Method boolean UnknownFieldSet.equals(Object)>
	//  129  249:ifeq            254
	//  130  252:iconst_1        
	//  131  253:ireturn         
	//  132  254:iconst_0        
	//  133  255:ireturn         
	}

	public Api getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #58  <Field Api DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method Api getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method Api getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Method getMethods(int i)
	{
		return (Method)methods_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List methods_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #328 <Method Object List.get(int)>
	//    4   10:checkcast       #118 <Class Method>
	//    5   13:areturn         
	}

	public int getMethodsCount()
	{
		return methods_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List methods_>
	//    2    4:invokeinterface #332 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getMethodsList()
	{
		return methods_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List methods_>
	//    2    4:areturn         
	}

	public MethodOrBuilder getMethodsOrBuilder(int i)
	{
		return (MethodOrBuilder)methods_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List methods_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #328 <Method Object List.get(int)>
	//    4   10:checkcast       #337 <Class MethodOrBuilder>
	//    5   13:areturn         
	}

	public List getMethodsOrBuilderList()
	{
		return methods_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List methods_>
	//    2    4:areturn         
	}

	public Mixin getMixins(int i)
	{
		return (Mixin)mixins_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field List mixins_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #328 <Method Object List.get(int)>
	//    4   10:checkcast       #156 <Class Mixin>
	//    5   13:areturn         
	}

	public int getMixinsCount()
	{
		return mixins_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field List mixins_>
	//    2    4:invokeinterface #332 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getMixinsList()
	{
		return mixins_;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field List mixins_>
	//    2    4:areturn         
	}

	public MixinOrBuilder getMixinsOrBuilder(int i)
	{
		return (MixinOrBuilder)mixins_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field List mixins_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #328 <Method Object List.get(int)>
	//    4   10:checkcast       #347 <Class MixinOrBuilder>
	//    5   13:areturn         
	}

	public List getMixinsOrBuilderList()
	{
		return mixins_;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field List mixins_>
	//    2    4:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #294 <Class String>
	//*   5    9:ifeq            17
		{
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #294 <Class String>
	//    8   16:areturn         
		} else
		{
			obj = ((Object) (((ByteString)obj).toStringUtf8()));
	//    9   17:aload_1         
	//   10   18:checkcast       #351 <Class ByteString>
	//   11   21:invokevirtual   #354 <Method String ByteString.toStringUtf8()>
	//   12   24:astore_1        
			name_ = obj;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #69  <Field Object name_>
			return ((String) (obj));
	//   16   30:aload_1         
	//   17   31:areturn         
		}
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #294 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #294 <Class String>
	//    8   16:invokestatic    #360 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #69  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #351 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public Option getOptions(int i)
	{
		return (Option)options_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field List options_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #328 <Method Object List.get(int)>
	//    4   10:checkcast       #134 <Class Option>
	//    5   13:areturn         
	}

	public int getOptionsCount()
	{
		return options_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field List options_>
	//    2    4:invokeinterface #332 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getOptionsList()
	{
		return options_;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field List options_>
	//    2    4:areturn         
	}

	public OptionOrBuilder getOptionsOrBuilder(int i)
	{
		return (OptionOrBuilder)options_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field List options_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #328 <Method Object List.get(int)>
	//    4   10:checkcast       #368 <Class OptionOrBuilder>
	//    5   13:areturn         
	}

	public List getOptionsOrBuilderList()
	{
		return options_;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field List options_>
	//    2    4:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #375 <Field int memoizedSize>
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
		if(!getNameBytes().isEmpty())
	//*  10   14:aload_0         
	//*  11   15:invokevirtual   #377 <Method ByteString getNameBytes()>
	//*  12   18:invokevirtual   #380 <Method boolean ByteString.isEmpty()>
	//*  13   21:ifne            35
			i = GeneratedMessageV3.computeStringSize(1, name_) + 0;
	//   14   24:iconst_1        
	//   15   25:aload_0         
	//   16   26:getfield        #69  <Field Object name_>
	//   17   29:invokestatic    #384 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   18   32:iconst_0        
	//   19   33:iadd            
	//   20   34:istore_1        
		for(int j = 0; j < methods_.size(); j++)
	//*  21   35:iconst_0        
	//*  22   36:istore_2        
	//*  23   37:iload_2         
	//*  24   38:aload_0         
	//*  25   39:getfield        #77  <Field List methods_>
	//*  26   42:invokeinterface #332 <Method int List.size()>
	//*  27   47:icmpge          77
			i += CodedOutputStream.computeMessageSize(2, (MessageLite)methods_.get(j));
	//   28   50:iload_1         
	//   29   51:iconst_2        
	//   30   52:aload_0         
	//   31   53:getfield        #77  <Field List methods_>
	//   32   56:iload_2         
	//   33   57:invokeinterface #328 <Method Object List.get(int)>
	//   34   62:checkcast       #386 <Class MessageLite>
	//   35   65:invokestatic    #392 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   36   68:iadd            
	//   37   69:istore_1        

	//   38   70:iload_2         
	//   39   71:iconst_1        
	//   40   72:iadd            
	//   41   73:istore_2        
	//*  42   74:goto            37
		for(int k = 0; k < options_.size(); k++)
	//*  43   77:iconst_0        
	//*  44   78:istore_2        
	//*  45   79:iload_2         
	//*  46   80:aload_0         
	//*  47   81:getfield        #79  <Field List options_>
	//*  48   84:invokeinterface #332 <Method int List.size()>
	//*  49   89:icmpge          119
			i += CodedOutputStream.computeMessageSize(3, (MessageLite)options_.get(k));
	//   50   92:iload_1         
	//   51   93:iconst_3        
	//   52   94:aload_0         
	//   53   95:getfield        #79  <Field List options_>
	//   54   98:iload_2         
	//   55   99:invokeinterface #328 <Method Object List.get(int)>
	//   56  104:checkcast       #386 <Class MessageLite>
	//   57  107:invokestatic    #392 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   58  110:iadd            
	//   59  111:istore_1        

	//   60  112:iload_2         
	//   61  113:iconst_1        
	//   62  114:iadd            
	//   63  115:istore_2        
	//*  64  116:goto            79
		int l = i;
	//   65  119:iload_1         
	//   66  120:istore_2        
		if(!getVersionBytes().isEmpty())
	//*  67  121:aload_0         
	//*  68  122:invokevirtual   #395 <Method ByteString getVersionBytes()>
	//*  69  125:invokevirtual   #380 <Method boolean ByteString.isEmpty()>
	//*  70  128:ifne            142
			l = i + GeneratedMessageV3.computeStringSize(4, version_);
	//   71  131:iload_1         
	//   72  132:iconst_4        
	//   73  133:aload_0         
	//   74  134:getfield        #81  <Field Object version_>
	//   75  137:invokestatic    #384 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   76  140:iadd            
	//   77  141:istore_2        
		i = l;
	//   78  142:iload_2         
	//   79  143:istore_1        
		if(sourceContext_ != null)
	//*  80  144:aload_0         
	//*  81  145:getfield        #137 <Field SourceContext sourceContext_>
	//*  82  148:ifnull          162
			i = l + CodedOutputStream.computeMessageSize(5, ((MessageLite) (getSourceContext())));
	//   83  151:iload_2         
	//   84  152:iconst_5        
	//   85  153:aload_0         
	//   86  154:invokevirtual   #312 <Method SourceContext getSourceContext()>
	//   87  157:invokestatic    #392 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   88  160:iadd            
	//   89  161:istore_1        
		for(l = 0; l < mixins_.size(); l++)
	//*  90  162:iconst_0        
	//*  91  163:istore_2        
	//*  92  164:iload_2         
	//*  93  165:aload_0         
	//*  94  166:getfield        #83  <Field List mixins_>
	//*  95  169:invokeinterface #332 <Method int List.size()>
	//*  96  174:icmpge          205
			i += CodedOutputStream.computeMessageSize(6, (MessageLite)mixins_.get(l));
	//   97  177:iload_1         
	//   98  178:bipush          6
	//   99  180:aload_0         
	//  100  181:getfield        #83  <Field List mixins_>
	//  101  184:iload_2         
	//  102  185:invokeinterface #328 <Method Object List.get(int)>
	//  103  190:checkcast       #386 <Class MessageLite>
	//  104  193:invokestatic    #392 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  105  196:iadd            
	//  106  197:istore_1        

	//  107  198:iload_2         
	//  108  199:iconst_1        
	//  109  200:iadd            
	//  110  201:istore_2        
	//* 111  202:goto            164
		l = i;
	//  112  205:iload_1         
	//  113  206:istore_2        
		if(syntax_ != Syntax.SYNTAX_PROTO2.getNumber())
	//* 114  207:aload_0         
	//* 115  208:getfield        #85  <Field int syntax_>
	//* 116  211:getstatic       #401 <Field Syntax Syntax.SYNTAX_PROTO2>
	//* 117  214:invokevirtual   #404 <Method int Syntax.getNumber()>
	//* 118  217:icmpeq          232
			l = i + CodedOutputStream.computeEnumSize(7, syntax_);
	//  119  220:iload_1         
	//  120  221:bipush          7
	//  121  223:aload_0         
	//  122  224:getfield        #85  <Field int syntax_>
	//  123  227:invokestatic    #408 <Method int CodedOutputStream.computeEnumSize(int, int)>
	//  124  230:iadd            
	//  125  231:istore_2        
		i = l + unknownFields.getSerializedSize();
	//  126  232:iload_2         
	//  127  233:aload_0         
	//  128  234:getfield        #174 <Field UnknownFieldSet unknownFields>
	//  129  237:invokevirtual   #410 <Method int UnknownFieldSet.getSerializedSize()>
	//  130  240:iadd            
	//  131  241:istore_1        
		memoizedSize = i;
	//  132  242:aload_0         
	//  133  243:iload_1         
	//  134  244:putfield        #375 <Field int memoizedSize>
		return i;
	//  135  247:iload_1         
	//  136  248:ireturn         
	}

	public SourceContext getSourceContext()
	{
		if(sourceContext_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field SourceContext sourceContext_>
	//*   2    4:ifnonnull       11
			return SourceContext.getDefaultInstance();
	//    3    7:invokestatic    #412 <Method SourceContext SourceContext.getDefaultInstance()>
	//    4   10:areturn         
		else
			return sourceContext_;
	//    5   11:aload_0         
	//    6   12:getfield        #137 <Field SourceContext sourceContext_>
	//    7   15:areturn         
	}

	public SourceContextOrBuilder getSourceContextOrBuilder()
	{
		return ((SourceContextOrBuilder) (getSourceContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #312 <Method SourceContext getSourceContext()>
	//    2    4:areturn         
	}

	public Syntax getSyntax()
	{
		Syntax syntax = Syntax.valueOf(syntax_);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int syntax_>
	//    2    4:invokestatic    #420 <Method Syntax Syntax.valueOf(int)>
	//    3    7:astore_1        
		if(syntax == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return Syntax.UNRECOGNIZED;
	//    6   12:getstatic       #423 <Field Syntax Syntax.UNRECOGNIZED>
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
	//    1    1:getfield        #85  <Field int syntax_>
	//    2    4:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		Object obj = version_;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Object version_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #294 <Class String>
	//*   5    9:ifeq            17
		{
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #294 <Class String>
	//    8   16:areturn         
		} else
		{
			obj = ((Object) (((ByteString)obj).toStringUtf8()));
	//    9   17:aload_1         
	//   10   18:checkcast       #351 <Class ByteString>
	//   11   21:invokevirtual   #354 <Method String ByteString.toStringUtf8()>
	//   12   24:astore_1        
			version_ = obj;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #81  <Field Object version_>
			return ((String) (obj));
	//   16   30:aload_1         
	//   17   31:areturn         
		}
	}

	public ByteString getVersionBytes()
	{
		Object obj = version_;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Object version_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #294 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #294 <Class String>
	//    8   16:invokestatic    #360 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			version_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #81  <Field Object version_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #351 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public boolean hasSourceContext()
	{
		return sourceContext_ != null;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field SourceContext sourceContext_>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #429 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #429 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((((Object) (getDescriptor())).hashCode() + 779) * 37 + 1) * 53 + getName().hashCode();
	//    6   12:invokestatic    #431 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #435 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:bipush          37
	//   11   24:imul            
	//   12   25:iconst_1        
	//   13   26:iadd            
	//   14   27:bipush          53
	//   15   29:imul            
	//   16   30:aload_0         
	//   17   31:invokevirtual   #292 <Method String getName()>
	//   18   34:invokevirtual   #436 <Method int String.hashCode()>
	//   19   37:iadd            
	//   20   38:istore_2        
		int i = j;
	//   21   39:iload_2         
	//   22   40:istore_1        
		if(getMethodsCount() > 0)
	//*  23   41:aload_0         
	//*  24   42:invokevirtual   #438 <Method int getMethodsCount()>
	//*  25   45:ifle            68
			i = (j * 37 + 2) * 53 + getMethodsList().hashCode();
	//   26   48:iload_2         
	//   27   49:bipush          37
	//   28   51:imul            
	//   29   52:iconst_2        
	//   30   53:iadd            
	//   31   54:bipush          53
	//   32   56:imul            
	//   33   57:aload_0         
	//   34   58:invokevirtual   #298 <Method List getMethodsList()>
	//   35   61:invokeinterface #439 <Method int List.hashCode()>
	//   36   66:iadd            
	//   37   67:istore_1        
		j = i;
	//   38   68:iload_1         
	//   39   69:istore_2        
		if(getOptionsCount() > 0)
	//*  40   70:aload_0         
	//*  41   71:invokevirtual   #441 <Method int getOptionsCount()>
	//*  42   74:ifle            97
			j = (i * 37 + 3) * 53 + getOptionsList().hashCode();
	//   43   77:iload_1         
	//   44   78:bipush          37
	//   45   80:imul            
	//   46   81:iconst_3        
	//   47   82:iadd            
	//   48   83:bipush          53
	//   49   85:imul            
	//   50   86:aload_0         
	//   51   87:invokevirtual   #302 <Method List getOptionsList()>
	//   52   90:invokeinterface #439 <Method int List.hashCode()>
	//   53   95:iadd            
	//   54   96:istore_2        
		j = (j * 37 + 4) * 53 + getVersion().hashCode();
	//   55   97:iload_2         
	//   56   98:bipush          37
	//   57  100:imul            
	//   58  101:iconst_4        
	//   59  102:iadd            
	//   60  103:bipush          53
	//   61  105:imul            
	//   62  106:aload_0         
	//   63  107:invokevirtual   #305 <Method String getVersion()>
	//   64  110:invokevirtual   #436 <Method int String.hashCode()>
	//   65  113:iadd            
	//   66  114:istore_2        
		i = j;
	//   67  115:iload_2         
	//   68  116:istore_1        
		if(hasSourceContext())
	//*  69  117:aload_0         
	//*  70  118:invokevirtual   #309 <Method boolean hasSourceContext()>
	//*  71  121:ifeq            142
			i = (j * 37 + 5) * 53 + getSourceContext().hashCode();
	//   72  124:iload_2         
	//   73  125:bipush          37
	//   74  127:imul            
	//   75  128:iconst_5        
	//   76  129:iadd            
	//   77  130:bipush          53
	//   78  132:imul            
	//   79  133:aload_0         
	//   80  134:invokevirtual   #312 <Method SourceContext getSourceContext()>
	//   81  137:invokevirtual   #442 <Method int SourceContext.hashCode()>
	//   82  140:iadd            
	//   83  141:istore_1        
		j = i;
	//   84  142:iload_1         
	//   85  143:istore_2        
		if(getMixinsCount() > 0)
	//*  86  144:aload_0         
	//*  87  145:invokevirtual   #444 <Method int getMixinsCount()>
	//*  88  148:ifle            172
			j = (i * 37 + 6) * 53 + getMixinsList().hashCode();
	//   89  151:iload_1         
	//   90  152:bipush          37
	//   91  154:imul            
	//   92  155:bipush          6
	//   93  157:iadd            
	//   94  158:bipush          53
	//   95  160:imul            
	//   96  161:aload_0         
	//   97  162:invokevirtual   #316 <Method List getMixinsList()>
	//   98  165:invokeinterface #439 <Method int List.hashCode()>
	//   99  170:iadd            
	//  100  171:istore_2        
		i = ((j * 37 + 7) * 53 + syntax_) * 29 + unknownFields.hashCode();
	//  101  172:iload_2         
	//  102  173:bipush          37
	//  103  175:imul            
	//  104  176:bipush          7
	//  105  178:iadd            
	//  106  179:bipush          53
	//  107  181:imul            
	//  108  182:aload_0         
	//  109  183:getfield        #85  <Field int syntax_>
	//  110  186:iadd            
	//  111  187:bipush          29
	//  112  189:imul            
	//  113  190:aload_0         
	//  114  191:getfield        #174 <Field UnknownFieldSet unknownFields>
	//  115  194:invokevirtual   #445 <Method int UnknownFieldSet.hashCode()>
	//  116  197:iadd            
	//  117  198:istore_1        
		memoizedHashCode = i;
	//  118  199:aload_0         
	//  119  200:iload_1         
	//  120  201:putfield        #429 <Field int memoizedHashCode>
		return i;
	//  121  204:iload_1         
	//  122  205:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Api, com/google/protobuf/Api$Builder);
	//    0    0:getstatic       #451 <Field GeneratedMessageV3$FieldAccessorTable ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable>
	//    1    3:ldc1            #2   <Class Api>
	//    2    5:ldc1            #10  <Class Api$Builder>
	//    3    7:invokevirtual   #457 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field byte memoizedIsInitialized>
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
	//   14   20:putfield        #65  <Field byte memoizedIsInitialized>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #461 <Method Api$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent);
	//    0    0:new             #10  <Class Api$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #465 <Method void Api$Builder(GeneratedMessageV3$BuilderParent, Api$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #468 <Method Api$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #471 <Method Api$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #468 <Method Api$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #58  <Field Api DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder();
	//    3    7:new             #10  <Class Api$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #475 <Method void Api$Builder(Api$1)>
	//    7   15:areturn         
		else
			return (new Builder()).mergeFrom(this);
	//    8   16:new             #10  <Class Api$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #475 <Method void Api$Builder(Api$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #235 <Method Api$Builder Api$Builder.mergeFrom(Api)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #232 <Method Api$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #232 <Method Api$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(!getNameBytes().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #377 <Method ByteString getNameBytes()>
	//*   2    4:invokevirtual   #380 <Method boolean ByteString.isEmpty()>
	//*   3    7:ifne            19
			GeneratedMessageV3.writeString(codedoutputstream, 1, name_);
	//    4   10:aload_1         
	//    5   11:iconst_1        
	//    6   12:aload_0         
	//    7   13:getfield        #69  <Field Object name_>
	//    8   16:invokestatic    #481 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		for(int i = 0; i < methods_.size(); i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:aload_0         
	//*  13   23:getfield        #77  <Field List methods_>
	//*  14   26:invokeinterface #332 <Method int List.size()>
	//*  15   31:icmpge          59
			codedoutputstream.writeMessage(2, (MessageLite)methods_.get(i));
	//   16   34:aload_1         
	//   17   35:iconst_2        
	//   18   36:aload_0         
	//   19   37:getfield        #77  <Field List methods_>
	//   20   40:iload_2         
	//   21   41:invokeinterface #328 <Method Object List.get(int)>
	//   22   46:checkcast       #386 <Class MessageLite>
	//   23   49:invokevirtual   #485 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   24   52:iload_2         
	//   25   53:iconst_1        
	//   26   54:iadd            
	//   27   55:istore_2        
	//*  28   56:goto            21
		for(int j = 0; j < options_.size(); j++)
	//*  29   59:iconst_0        
	//*  30   60:istore_2        
	//*  31   61:iload_2         
	//*  32   62:aload_0         
	//*  33   63:getfield        #79  <Field List options_>
	//*  34   66:invokeinterface #332 <Method int List.size()>
	//*  35   71:icmpge          99
			codedoutputstream.writeMessage(3, (MessageLite)options_.get(j));
	//   36   74:aload_1         
	//   37   75:iconst_3        
	//   38   76:aload_0         
	//   39   77:getfield        #79  <Field List options_>
	//   40   80:iload_2         
	//   41   81:invokeinterface #328 <Method Object List.get(int)>
	//   42   86:checkcast       #386 <Class MessageLite>
	//   43   89:invokevirtual   #485 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   44   92:iload_2         
	//   45   93:iconst_1        
	//   46   94:iadd            
	//   47   95:istore_2        
	//*  48   96:goto            61
		if(!getVersionBytes().isEmpty())
	//*  49   99:aload_0         
	//*  50  100:invokevirtual   #395 <Method ByteString getVersionBytes()>
	//*  51  103:invokevirtual   #380 <Method boolean ByteString.isEmpty()>
	//*  52  106:ifne            118
			GeneratedMessageV3.writeString(codedoutputstream, 4, version_);
	//   53  109:aload_1         
	//   54  110:iconst_4        
	//   55  111:aload_0         
	//   56  112:getfield        #81  <Field Object version_>
	//   57  115:invokestatic    #481 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if(sourceContext_ != null)
	//*  58  118:aload_0         
	//*  59  119:getfield        #137 <Field SourceContext sourceContext_>
	//*  60  122:ifnull          134
			codedoutputstream.writeMessage(5, ((MessageLite) (getSourceContext())));
	//   61  125:aload_1         
	//   62  126:iconst_5        
	//   63  127:aload_0         
	//   64  128:invokevirtual   #312 <Method SourceContext getSourceContext()>
	//   65  131:invokevirtual   #485 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		for(int k = 0; k < mixins_.size(); k++)
	//*  66  134:iconst_0        
	//*  67  135:istore_2        
	//*  68  136:iload_2         
	//*  69  137:aload_0         
	//*  70  138:getfield        #83  <Field List mixins_>
	//*  71  141:invokeinterface #332 <Method int List.size()>
	//*  72  146:icmpge          175
			codedoutputstream.writeMessage(6, (MessageLite)mixins_.get(k));
	//   73  149:aload_1         
	//   74  150:bipush          6
	//   75  152:aload_0         
	//   76  153:getfield        #83  <Field List mixins_>
	//   77  156:iload_2         
	//   78  157:invokeinterface #328 <Method Object List.get(int)>
	//   79  162:checkcast       #386 <Class MessageLite>
	//   80  165:invokevirtual   #485 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   81  168:iload_2         
	//   82  169:iconst_1        
	//   83  170:iadd            
	//   84  171:istore_2        
	//*  85  172:goto            136
		if(syntax_ != Syntax.SYNTAX_PROTO2.getNumber())
	//*  86  175:aload_0         
	//*  87  176:getfield        #85  <Field int syntax_>
	//*  88  179:getstatic       #401 <Field Syntax Syntax.SYNTAX_PROTO2>
	//*  89  182:invokevirtual   #404 <Method int Syntax.getNumber()>
	//*  90  185:icmpeq          198
			codedoutputstream.writeEnum(7, syntax_);
	//   91  188:aload_1         
	//   92  189:bipush          7
	//   93  191:aload_0         
	//   94  192:getfield        #85  <Field int syntax_>
	//   95  195:invokevirtual   #489 <Method void CodedOutputStream.writeEnum(int, int)>
		unknownFields.writeTo(codedoutputstream);
	//   96  198:aload_0         
	//   97  199:getfield        #174 <Field UnknownFieldSet unknownFields>
	//   98  202:aload_1         
	//   99  203:invokevirtual   #491 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//  100  206:return          
	}

	private static final Api DEFAULT_INSTANCE = new Api();
	public static final int METHODS_FIELD_NUMBER = 2;
	public static final int MIXINS_FIELD_NUMBER = 6;
	public static final int NAME_FIELD_NUMBER = 1;
	public static final int OPTIONS_FIELD_NUMBER = 3;
	private static final Parser PARSER = new AbstractParser() {

		public Api parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new Api(codedinputstream, extensionregistrylite);
		//    0    0:new             #7   <Class Api>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #19  <Method void Api(CodedInputStream, ExtensionRegistryLite, Api$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method Api parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
	public static final int SYNTAX_FIELD_NUMBER = 7;
	public static final int VERSION_FIELD_NUMBER = 4;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private byte memoizedIsInitialized;
	private List methods_;
	private List mixins_;
	private volatile Object name_;
	private List options_;
	private SourceContext sourceContext_;
	private int syntax_;
	private volatile Object version_;

	static 
	{
	//    0    0:new             #2   <Class Api>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void Api()>
	//    3    7:putstatic       #58  <Field Api DEFAULT_INSTANCE>
	//    4   10:new             #8   <Class Api$1>
	//    5   13:dup             
	//    6   14:invokespecial   #59  <Method void Api$1()>
	//    7   17:putstatic       #61  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static int access$1002(Api api, int i)
	{
		api.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #199 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Parser access$1100()
	{
		return PARSER;
	//    0    0:getstatic       #61  <Field Parser PARSER>
	//    1    3:areturn         
	}

*/


/*
	static Object access$300(Api api)
	{
		return api.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object name_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$302(Api api, Object obj)
	{
		api.name_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field Object name_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$400(Api api)
	{
		return api.methods_;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List methods_>
	//    2    4:areturn         
	}

*/


/*
	static List access$402(Api api, List list)
	{
		api.methods_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field List methods_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$500(Api api)
	{
		return api.options_;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field List options_>
	//    2    4:areturn         
	}

*/


/*
	static List access$502(Api api, List list)
	{
		api.options_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field List options_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$600(Api api)
	{
		return api.version_;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Object version_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$602(Api api, Object obj)
	{
		api.version_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field Object version_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static SourceContext access$702(Api api, SourceContext sourcecontext)
	{
		api.sourceContext_ = sourcecontext;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field SourceContext sourceContext_>
		return sourcecontext;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$800(Api api)
	{
		return api.mixins_;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field List mixins_>
	//    2    4:areturn         
	}

*/


/*
	static List access$802(Api api, List list)
	{
		api.mixins_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field List mixins_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$900(Api api)
	{
		return api.syntax_;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int syntax_>
	//    2    4:ireturn         
	}

*/


/*
	static int access$902(Api api, int i)
	{
		api.syntax_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #85  <Field int syntax_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
