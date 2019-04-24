// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, DescriptorProtos, LazyStringArrayList, InvalidProtocolBufferException, 
//			UnknownFieldSet, CodedInputStream, LazyStringList, Parser, 
//			ByteString, ProtocolStringList, MessageLite, CodedOutputStream, 
//			ExtensionRegistryLite, Message, RepeatedFieldBuilderV3, SingleFieldBuilderV3, 
//			AbstractParser

public static final class DescriptorProtos$FileDescriptorProto extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.FileDescriptorProtoOrBuilder
	{

		private void ensureDependencyIsMutable()
		{
			if((bitField0_ & 4) != 4)
		//*   0    0:aload_0         
		//*   1    1:getfield        #106 <Field int bitField0_>
		//*   2    4:iconst_4        
		//*   3    5:iand            
		//*   4    6:iconst_4        
		//*   5    7:icmpeq          35
			{
				dependency_ = ((LazyStringList) (new LazyStringArrayList(dependency_)));
		//    6   10:aload_0         
		//    7   11:new             #63  <Class LazyStringArrayList>
		//    8   14:dup             
		//    9   15:aload_0         
		//   10   16:getfield        #68  <Field LazyStringList dependency_>
		//   11   19:invokespecial   #109 <Method void LazyStringArrayList(LazyStringList)>
		//   12   22:putfield        #68  <Field LazyStringList dependency_>
				bitField0_ = bitField0_ | 4;
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:getfield        #106 <Field int bitField0_>
		//   16   30:iconst_4        
		//   17   31:ior             
		//   18   32:putfield        #106 <Field int bitField0_>
			}
		//   19   35:return          
		}

		private void ensureEnumTypeIsMutable()
		{
			if((bitField0_ & 0x40) != 64)
		//*   0    0:aload_0         
		//*   1    1:getfield        #106 <Field int bitField0_>
		//*   2    4:bipush          64
		//*   3    6:iand            
		//*   4    7:bipush          64
		//*   5    9:icmpeq          38
			{
				enumType_ = ((List) (new ArrayList(((java.util.Collection) (enumType_)))));
		//    6   12:aload_0         
		//    7   13:new             #112 <Class ArrayList>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #82  <Field List enumType_>
		//   11   21:invokespecial   #115 <Method void ArrayList(java.util.Collection)>
		//   12   24:putfield        #82  <Field List enumType_>
				bitField0_ = bitField0_ | 0x40;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #106 <Field int bitField0_>
		//   16   32:bipush          64
		//   17   34:ior             
		//   18   35:putfield        #106 <Field int bitField0_>
			}
		//   19   38:return          
		}

		private void ensureExtensionIsMutable()
		{
			if((bitField0_ & 0x100) != 256)
		//*   0    0:aload_0         
		//*   1    1:getfield        #106 <Field int bitField0_>
		//*   2    4:sipush          256
		//*   3    7:iand            
		//*   4    8:sipush          256
		//*   5   11:icmpeq          41
			{
				extension_ = ((List) (new ArrayList(((java.util.Collection) (extension_)))));
		//    6   14:aload_0         
		//    7   15:new             #112 <Class ArrayList>
		//    8   18:dup             
		//    9   19:aload_0         
		//   10   20:getfield        #86  <Field List extension_>
		//   11   23:invokespecial   #115 <Method void ArrayList(java.util.Collection)>
		//   12   26:putfield        #86  <Field List extension_>
				bitField0_ = bitField0_ | 0x100;
		//   13   29:aload_0         
		//   14   30:aload_0         
		//   15   31:getfield        #106 <Field int bitField0_>
		//   16   34:sipush          256
		//   17   37:ior             
		//   18   38:putfield        #106 <Field int bitField0_>
			}
		//   19   41:return          
		}

		private void ensureMessageTypeIsMutable()
		{
			if((bitField0_ & 0x20) != 32)
		//*   0    0:aload_0         
		//*   1    1:getfield        #106 <Field int bitField0_>
		//*   2    4:bipush          32
		//*   3    6:iand            
		//*   4    7:bipush          32
		//*   5    9:icmpeq          38
			{
				messageType_ = ((List) (new ArrayList(((java.util.Collection) (messageType_)))));
		//    6   12:aload_0         
		//    7   13:new             #112 <Class ArrayList>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #80  <Field List messageType_>
		//   11   21:invokespecial   #115 <Method void ArrayList(java.util.Collection)>
		//   12   24:putfield        #80  <Field List messageType_>
				bitField0_ = bitField0_ | 0x20;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #106 <Field int bitField0_>
		//   16   32:bipush          32
		//   17   34:ior             
		//   18   35:putfield        #106 <Field int bitField0_>
			}
		//   19   38:return          
		}

		private void ensurePublicDependencyIsMutable()
		{
			if((bitField0_ & 8) != 8)
		//*   0    0:aload_0         
		//*   1    1:getfield        #106 <Field int bitField0_>
		//*   2    4:bipush          8
		//*   3    6:iand            
		//*   4    7:bipush          8
		//*   5    9:icmpeq          38
			{
				publicDependency_ = ((List) (new ArrayList(((java.util.Collection) (publicDependency_)))));
		//    6   12:aload_0         
		//    7   13:new             #112 <Class ArrayList>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #76  <Field List publicDependency_>
		//   11   21:invokespecial   #115 <Method void ArrayList(java.util.Collection)>
		//   12   24:putfield        #76  <Field List publicDependency_>
				bitField0_ = bitField0_ | 8;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #106 <Field int bitField0_>
		//   16   32:bipush          8
		//   17   34:ior             
		//   18   35:putfield        #106 <Field int bitField0_>
			}
		//   19   38:return          
		}

		private void ensureServiceIsMutable()
		{
			if((bitField0_ & 0x80) != 128)
		//*   0    0:aload_0         
		//*   1    1:getfield        #106 <Field int bitField0_>
		//*   2    4:sipush          128
		//*   3    7:iand            
		//*   4    8:sipush          128
		//*   5   11:icmpeq          41
			{
				service_ = ((List) (new ArrayList(((java.util.Collection) (service_)))));
		//    6   14:aload_0         
		//    7   15:new             #112 <Class ArrayList>
		//    8   18:dup             
		//    9   19:aload_0         
		//   10   20:getfield        #84  <Field List service_>
		//   11   23:invokespecial   #115 <Method void ArrayList(java.util.Collection)>
		//   12   26:putfield        #84  <Field List service_>
				bitField0_ = bitField0_ | 0x80;
		//   13   29:aload_0         
		//   14   30:aload_0         
		//   15   31:getfield        #106 <Field int bitField0_>
		//   16   34:sipush          128
		//   17   37:ior             
		//   18   38:putfield        #106 <Field int bitField0_>
			}
		//   19   41:return          
		}

		private void ensureWeakDependencyIsMutable()
		{
			if((bitField0_ & 0x10) != 16)
		//*   0    0:aload_0         
		//*   1    1:getfield        #106 <Field int bitField0_>
		//*   2    4:bipush          16
		//*   3    6:iand            
		//*   4    7:bipush          16
		//*   5    9:icmpeq          38
			{
				weakDependency_ = ((List) (new ArrayList(((java.util.Collection) (weakDependency_)))));
		//    6   12:aload_0         
		//    7   13:new             #112 <Class ArrayList>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #78  <Field List weakDependency_>
		//   11   21:invokespecial   #115 <Method void ArrayList(java.util.Collection)>
		//   12   24:putfield        #78  <Field List weakDependency_>
				bitField0_ = bitField0_ | 0x10;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #106 <Field int bitField0_>
		//   16   32:bipush          16
		//   17   34:ior             
		//   18   35:putfield        #106 <Field int bitField0_>
			}
		//   19   38:return          
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$700();
		//    0    0:invokestatic    #125 <Method Descriptors$Descriptor DescriptorProtos.access$700()>
		//    1    3:areturn         
		}

		private RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       57
			{
				List list = enumType_;
		//    3    7:aload_0         
		//    4    8:getfield        #82  <Field List enumType_>
		//    5   11:astore_2        
				boolean flag;
				if((bitField0_ & 0x40) == 64)
		//*   6   12:aload_0         
		//*   7   13:getfield        #106 <Field int bitField0_>
		//*   8   16:bipush          64
		//*   9   18:iand            
		//*  10   19:bipush          64
		//*  11   21:icmpne          29
					flag = true;
		//   12   24:iconst_1        
		//   13   25:istore_1        
				else
		//*  14   26:goto            31
					flag = false;
		//   15   29:iconst_0        
		//   16   30:istore_1        
				enumTypeBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//   17   31:aload_0         
		//   18   32:new             #131 <Class RepeatedFieldBuilderV3>
		//   19   35:dup             
		//   20   36:aload_2         
		//   21   37:iload_1         
		//   22   38:aload_0         
		//   23   39:invokevirtual   #135 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   24   42:aload_0         
		//   25   43:invokevirtual   #139 <Method boolean isClean()>
		//   26   46:invokespecial   #142 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
		//   27   49:putfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
				enumType_ = null;
		//   28   52:aload_0         
		//   29   53:aconst_null     
		//   30   54:putfield        #82  <Field List enumType_>
			}
			return enumTypeBuilder_;
		//   31   57:aload_0         
		//   32   58:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   33   61:areturn         
		}

		private RepeatedFieldBuilderV3 getExtensionFieldBuilder()
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       59
			{
				List list = extension_;
		//    3    7:aload_0         
		//    4    8:getfield        #86  <Field List extension_>
		//    5   11:astore_2        
				boolean flag;
				if((bitField0_ & 0x100) == 256)
		//*   6   12:aload_0         
		//*   7   13:getfield        #106 <Field int bitField0_>
		//*   8   16:sipush          256
		//*   9   19:iand            
		//*  10   20:sipush          256
		//*  11   23:icmpne          31
					flag = true;
		//   12   26:iconst_1        
		//   13   27:istore_1        
				else
		//*  14   28:goto            33
					flag = false;
		//   15   31:iconst_0        
		//   16   32:istore_1        
				extensionBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//   17   33:aload_0         
		//   18   34:new             #131 <Class RepeatedFieldBuilderV3>
		//   19   37:dup             
		//   20   38:aload_2         
		//   21   39:iload_1         
		//   22   40:aload_0         
		//   23   41:invokevirtual   #135 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   24   44:aload_0         
		//   25   45:invokevirtual   #139 <Method boolean isClean()>
		//   26   48:invokespecial   #142 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
		//   27   51:putfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
				extension_ = null;
		//   28   54:aload_0         
		//   29   55:aconst_null     
		//   30   56:putfield        #86  <Field List extension_>
			}
			return extensionBuilder_;
		//   31   59:aload_0         
		//   32   60:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   33   63:areturn         
		}

		private RepeatedFieldBuilderV3 getMessageTypeFieldBuilder()
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       57
			{
				List list = messageType_;
		//    3    7:aload_0         
		//    4    8:getfield        #80  <Field List messageType_>
		//    5   11:astore_2        
				boolean flag;
				if((bitField0_ & 0x20) == 32)
		//*   6   12:aload_0         
		//*   7   13:getfield        #106 <Field int bitField0_>
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
				messageTypeBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//   17   31:aload_0         
		//   18   32:new             #131 <Class RepeatedFieldBuilderV3>
		//   19   35:dup             
		//   20   36:aload_2         
		//   21   37:iload_1         
		//   22   38:aload_0         
		//   23   39:invokevirtual   #135 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   24   42:aload_0         
		//   25   43:invokevirtual   #139 <Method boolean isClean()>
		//   26   46:invokespecial   #142 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
		//   27   49:putfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
				messageType_ = null;
		//   28   52:aload_0         
		//   29   53:aconst_null     
		//   30   54:putfield        #80  <Field List messageType_>
			}
			return messageTypeBuilder_;
		//   31   57:aload_0         
		//   32   58:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   33   61:areturn         
		}

		private SingleFieldBuilderV3 getOptionsFieldBuilder()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       35
			{
				optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//    3    7:aload_0         
		//    4    8:new             #158 <Class SingleFieldBuilderV3>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokevirtual   #162 <Method DescriptorProtos$FileOptions getOptions()>
		//    8   16:aload_0         
		//    9   17:invokevirtual   #135 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   10   20:aload_0         
		//   11   21:invokevirtual   #139 <Method boolean isClean()>
		//   12   24:invokespecial   #165 <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
		//   13   27:putfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
				options_ = null;
		//   14   30:aload_0         
		//   15   31:aconst_null     
		//   16   32:putfield        #88  <Field DescriptorProtos$FileOptions options_>
			}
			return optionsBuilder_;
		//   17   35:aload_0         
		//   18   36:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//   19   39:areturn         
		}

		private RepeatedFieldBuilderV3 getServiceFieldBuilder()
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       59
			{
				List list = service_;
		//    3    7:aload_0         
		//    4    8:getfield        #84  <Field List service_>
		//    5   11:astore_2        
				boolean flag;
				if((bitField0_ & 0x80) == 128)
		//*   6   12:aload_0         
		//*   7   13:getfield        #106 <Field int bitField0_>
		//*   8   16:sipush          128
		//*   9   19:iand            
		//*  10   20:sipush          128
		//*  11   23:icmpne          31
					flag = true;
		//   12   26:iconst_1        
		//   13   27:istore_1        
				else
		//*  14   28:goto            33
					flag = false;
		//   15   31:iconst_0        
		//   16   32:istore_1        
				serviceBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//   17   33:aload_0         
		//   18   34:new             #131 <Class RepeatedFieldBuilderV3>
		//   19   37:dup             
		//   20   38:aload_2         
		//   21   39:iload_1         
		//   22   40:aload_0         
		//   23   41:invokevirtual   #135 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   24   44:aload_0         
		//   25   45:invokevirtual   #139 <Method boolean isClean()>
		//   26   48:invokespecial   #142 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
		//   27   51:putfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
				service_ = null;
		//   28   54:aload_0         
		//   29   55:aconst_null     
		//   30   56:putfield        #84  <Field List service_>
			}
			return serviceBuilder_;
		//   31   59:aload_0         
		//   32   60:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   33   63:areturn         
		}

		private SingleFieldBuilderV3 getSourceCodeInfoFieldBuilder()
		{
			if(sourceCodeInfoBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//*   2    4:ifnonnull       35
			{
				sourceCodeInfoBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getSourceCodeInfo())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//    3    7:aload_0         
		//    4    8:new             #158 <Class SingleFieldBuilderV3>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokevirtual   #177 <Method DescriptorProtos$SourceCodeInfo getSourceCodeInfo()>
		//    8   16:aload_0         
		//    9   17:invokevirtual   #135 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   10   20:aload_0         
		//   11   21:invokevirtual   #139 <Method boolean isClean()>
		//   12   24:invokespecial   #165 <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
		//   13   27:putfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
				sourceCodeInfo_ = null;
		//   14   30:aload_0         
		//   15   31:aconst_null     
		//   16   32:putfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
			}
			return sourceCodeInfoBuilder_;
		//   17   35:aload_0         
		//   18   36:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//   19   39:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #184 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            36
			{
				getMessageTypeFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #186 <Method RepeatedFieldBuilderV3 getMessageTypeFieldBuilder()>
		//    4   10:pop             
				getEnumTypeFieldBuilder();
		//    5   11:aload_0         
		//    6   12:invokespecial   #188 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
		//    7   15:pop             
				getServiceFieldBuilder();
		//    8   16:aload_0         
		//    9   17:invokespecial   #190 <Method RepeatedFieldBuilderV3 getServiceFieldBuilder()>
		//   10   20:pop             
				getExtensionFieldBuilder();
		//   11   21:aload_0         
		//   12   22:invokespecial   #192 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
		//   13   25:pop             
				getOptionsFieldBuilder();
		//   14   26:aload_0         
		//   15   27:invokespecial   #194 <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//   16   30:pop             
				getSourceCodeInfoFieldBuilder();
		//   17   31:aload_0         
		//   18   32:invokespecial   #196 <Method SingleFieldBuilderV3 getSourceCodeInfoFieldBuilder()>
		//   19   35:pop             
			}
		//   20   36:return          
		}

		public Builder addAllDependency(Iterable iterable)
		{
			ensureDependencyIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #200 <Method void ensureDependencyIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, ((List) (dependency_)));
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #68  <Field LazyStringList dependency_>
		//    5    9:invokestatic    #206 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #209 <Method void onChanged()>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder addAllEnumType(Iterable iterable)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureEnumTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, enumType_);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #82  <Field List enumType_>
		//    8   16:invokestatic    #206 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
				onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   11   23:aload_0         
		//   12   24:areturn         
			} else
			{
				enumTypeBuilder_.addAllMessages(iterable);
		//   13   25:aload_0         
		//   14   26:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #217 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   17   33:pop             
				return this;
		//   18   34:aload_0         
		//   19   35:areturn         
			}
		}

		public Builder addAllExtension(Iterable iterable)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureExtensionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #221 <Method void ensureExtensionIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, extension_);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #86  <Field List extension_>
		//    8   16:invokestatic    #206 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
				onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   11   23:aload_0         
		//   12   24:areturn         
			} else
			{
				extensionBuilder_.addAllMessages(iterable);
		//   13   25:aload_0         
		//   14   26:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #217 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   17   33:pop             
				return this;
		//   18   34:aload_0         
		//   19   35:areturn         
			}
		}

		public Builder addAllMessageType(Iterable iterable)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureMessageTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #225 <Method void ensureMessageTypeIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, messageType_);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #80  <Field List messageType_>
		//    8   16:invokestatic    #206 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
				onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   11   23:aload_0         
		//   12   24:areturn         
			} else
			{
				messageTypeBuilder_.addAllMessages(iterable);
		//   13   25:aload_0         
		//   14   26:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #217 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   17   33:pop             
				return this;
		//   18   34:aload_0         
		//   19   35:areturn         
			}
		}

		public Builder addAllPublicDependency(Iterable iterable)
		{
			ensurePublicDependencyIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #229 <Method void ensurePublicDependencyIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, publicDependency_);
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #76  <Field List publicDependency_>
		//    5    9:invokestatic    #206 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #209 <Method void onChanged()>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder addAllService(Iterable iterable)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       25
			{
				ensureServiceIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #233 <Method void ensureServiceIsMutable()>
				AbstractMessageLite.Builder.addAll(iterable, service_);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #84  <Field List service_>
		//    8   16:invokestatic    #206 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
				onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   11   23:aload_0         
		//   12   24:areturn         
			} else
			{
				serviceBuilder_.addAllMessages(iterable);
		//   13   25:aload_0         
		//   14   26:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #217 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//   17   33:pop             
				return this;
		//   18   34:aload_0         
		//   19   35:areturn         
			}
		}

		public Builder addAllWeakDependency(Iterable iterable)
		{
			ensureWeakDependencyIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #237 <Method void ensureWeakDependencyIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, weakDependency_);
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #78  <Field List weakDependency_>
		//    5    9:invokestatic    #206 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #209 <Method void onChanged()>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder addDependency(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #241 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #242 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				ensureDependencyIsMutable();
		//    6   12:aload_0         
		//    7   13:invokespecial   #200 <Method void ensureDependencyIsMutable()>
				dependency_.add(((Object) (s)));
		//    8   16:aload_0         
		//    9   17:getfield        #68  <Field LazyStringList dependency_>
		//   10   20:aload_1         
		//   11   21:invokeinterface #248 <Method boolean LazyStringList.add(Object)>
		//   12   26:pop             
				onChanged();
		//   13   27:aload_0         
		//   14   28:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   15   31:aload_0         
		//   16   32:areturn         
			}
		}

		public Builder addDependencyBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #241 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #242 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				ensureDependencyIsMutable();
		//    6   12:aload_0         
		//    7   13:invokespecial   #200 <Method void ensureDependencyIsMutable()>
				dependency_.add(bytestring);
		//    8   16:aload_0         
		//    9   17:getfield        #68  <Field LazyStringList dependency_>
		//   10   20:aload_1         
		//   11   21:invokeinterface #253 <Method void LazyStringList.add(ByteString)>
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			}
		}

		public Builder addEnumType(int i, DescriptorProtos.EnumDescriptorProto.Builder builder)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureEnumTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
				enumType_.add(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #82  <Field List enumType_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #261 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
		//   10   20:invokeinterface #266 <Method void List.add(int, Object)>
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				enumTypeBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   17   35:iload_1         
		//   18   36:aload_2         
		//   19   37:invokevirtual   #261 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
		//   20   40:invokevirtual   #270 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   21   43:pop             
				return this;
		//   22   44:aload_0         
		//   23   45:areturn         
			}
		}

		public Builder addEnumType(int i, DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(enumdescriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureEnumTypeIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
					enumType_.add(i, ((Object) (enumdescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #82  <Field List enumType_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #266 <Method void List.add(int, Object)>
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				enumTypeBuilder_.addMessage(i, ((AbstractMessage) (enumdescriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   22   44:iload_1         
		//   23   45:aload_2         
		//   24   46:invokevirtual   #270 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   25   49:pop             
				return this;
		//   26   50:aload_0         
		//   27   51:areturn         
			}
		}

		public Builder addEnumType(DescriptorProtos.EnumDescriptorProto.Builder builder)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureEnumTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
				enumType_.add(((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #82  <Field List enumType_>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #261 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
		//    9   19:invokeinterface #273 <Method boolean List.add(Object)>
		//   10   24:pop             
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				enumTypeBuilder_.addMessage(((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #261 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
		//   19   39:invokevirtual   #276 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   20   42:pop             
				return this;
		//   21   43:aload_0         
		//   22   44:areturn         
			}
		}

		public Builder addEnumType(DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(enumdescriptorproto == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureEnumTypeIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
					enumType_.add(((Object) (enumdescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #82  <Field List enumType_>
		//   13   27:aload_1         
		//   14   28:invokeinterface #273 <Method boolean List.add(Object)>
		//   15   33:pop             
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				enumTypeBuilder_.addMessage(((AbstractMessage) (enumdescriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   22   44:aload_1         
		//   23   45:invokevirtual   #276 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   24   48:pop             
				return this;
		//   25   49:aload_0         
		//   26   50:areturn         
			}
		}

		public DescriptorProtos.EnumDescriptorProto.Builder addEnumTypeBuilder()
		{
			return (DescriptorProtos.EnumDescriptorProto.Builder)getEnumTypeFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.EnumDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #188 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
		//    2    4:invokestatic    #284 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #288 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #257 <Class DescriptorProtos$EnumDescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.EnumDescriptorProto.Builder addEnumTypeBuilder(int i)
		{
			return (DescriptorProtos.EnumDescriptorProto.Builder)getEnumTypeFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.EnumDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #188 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #284 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #292 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #257 <Class DescriptorProtos$EnumDescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addExtension(int i, DescriptorProtos.FieldDescriptorProto.Builder builder)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureExtensionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #221 <Method void ensureExtensionIsMutable()>
				extension_.add(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #86  <Field List extension_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #299 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
		//   10   20:invokeinterface #266 <Method void List.add(int, Object)>
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				extensionBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   17   35:iload_1         
		//   18   36:aload_2         
		//   19   37:invokevirtual   #299 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
		//   20   40:invokevirtual   #270 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   21   43:pop             
				return this;
		//   22   44:aload_0         
		//   23   45:areturn         
			}
		}

		public Builder addExtension(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(fielddescriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureExtensionIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #221 <Method void ensureExtensionIsMutable()>
					extension_.add(i, ((Object) (fielddescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #86  <Field List extension_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #266 <Method void List.add(int, Object)>
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				extensionBuilder_.addMessage(i, ((AbstractMessage) (fielddescriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   22   44:iload_1         
		//   23   45:aload_2         
		//   24   46:invokevirtual   #270 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   25   49:pop             
				return this;
		//   26   50:aload_0         
		//   27   51:areturn         
			}
		}

		public Builder addExtension(DescriptorProtos.FieldDescriptorProto.Builder builder)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureExtensionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #221 <Method void ensureExtensionIsMutable()>
				extension_.add(((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #86  <Field List extension_>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #299 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
		//    9   19:invokeinterface #273 <Method boolean List.add(Object)>
		//   10   24:pop             
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				extensionBuilder_.addMessage(((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #299 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
		//   19   39:invokevirtual   #276 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   20   42:pop             
				return this;
		//   21   43:aload_0         
		//   22   44:areturn         
			}
		}

		public Builder addExtension(DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(fielddescriptorproto == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureExtensionIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #221 <Method void ensureExtensionIsMutable()>
					extension_.add(((Object) (fielddescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #86  <Field List extension_>
		//   13   27:aload_1         
		//   14   28:invokeinterface #273 <Method boolean List.add(Object)>
		//   15   33:pop             
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				extensionBuilder_.addMessage(((AbstractMessage) (fielddescriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   22   44:aload_1         
		//   23   45:invokevirtual   #276 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   24   48:pop             
				return this;
		//   25   49:aload_0         
		//   26   50:areturn         
			}
		}

		public DescriptorProtos.FieldDescriptorProto.Builder addExtensionBuilder()
		{
			return (DescriptorProtos.FieldDescriptorProto.Builder)getExtensionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #192 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
		//    2    4:invokestatic    #308 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #288 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #296 <Class DescriptorProtos$FieldDescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.FieldDescriptorProto.Builder addExtensionBuilder(int i)
		{
			return (DescriptorProtos.FieldDescriptorProto.Builder)getExtensionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #192 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #308 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #292 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #296 <Class DescriptorProtos$FieldDescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addMessageType(int i, DescriptorProtos.DescriptorProto.Builder builder)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureMessageTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #225 <Method void ensureMessageTypeIsMutable()>
				messageType_.add(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #80  <Field List messageType_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #316 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto$Builder.build()>
		//   10   20:invokeinterface #266 <Method void List.add(int, Object)>
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				messageTypeBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   17   35:iload_1         
		//   18   36:aload_2         
		//   19   37:invokevirtual   #316 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto$Builder.build()>
		//   20   40:invokevirtual   #270 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   21   43:pop             
				return this;
		//   22   44:aload_0         
		//   23   45:areturn         
			}
		}

		public Builder addMessageType(int i, DescriptorProtos.DescriptorProto descriptorproto)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(descriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureMessageTypeIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #225 <Method void ensureMessageTypeIsMutable()>
					messageType_.add(i, ((Object) (descriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #80  <Field List messageType_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #266 <Method void List.add(int, Object)>
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				messageTypeBuilder_.addMessage(i, ((AbstractMessage) (descriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   22   44:iload_1         
		//   23   45:aload_2         
		//   24   46:invokevirtual   #270 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   25   49:pop             
				return this;
		//   26   50:aload_0         
		//   27   51:areturn         
			}
		}

		public Builder addMessageType(DescriptorProtos.DescriptorProto.Builder builder)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureMessageTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #225 <Method void ensureMessageTypeIsMutable()>
				messageType_.add(((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #80  <Field List messageType_>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #316 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto$Builder.build()>
		//    9   19:invokeinterface #273 <Method boolean List.add(Object)>
		//   10   24:pop             
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				messageTypeBuilder_.addMessage(((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #316 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto$Builder.build()>
		//   19   39:invokevirtual   #276 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   20   42:pop             
				return this;
		//   21   43:aload_0         
		//   22   44:areturn         
			}
		}

		public Builder addMessageType(DescriptorProtos.DescriptorProto descriptorproto)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(descriptorproto == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureMessageTypeIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #225 <Method void ensureMessageTypeIsMutable()>
					messageType_.add(((Object) (descriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #80  <Field List messageType_>
		//   13   27:aload_1         
		//   14   28:invokeinterface #273 <Method boolean List.add(Object)>
		//   15   33:pop             
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				messageTypeBuilder_.addMessage(((AbstractMessage) (descriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   22   44:aload_1         
		//   23   45:invokevirtual   #276 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   24   48:pop             
				return this;
		//   25   49:aload_0         
		//   26   50:areturn         
			}
		}

		public DescriptorProtos.DescriptorProto.Builder addMessageTypeBuilder()
		{
			return (DescriptorProtos.DescriptorProto.Builder)getMessageTypeFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.DescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #186 <Method RepeatedFieldBuilderV3 getMessageTypeFieldBuilder()>
		//    2    4:invokestatic    #325 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #288 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #313 <Class DescriptorProtos$DescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.DescriptorProto.Builder addMessageTypeBuilder(int i)
		{
			return (DescriptorProtos.DescriptorProto.Builder)getMessageTypeFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.DescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #186 <Method RepeatedFieldBuilderV3 getMessageTypeFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #325 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #292 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #313 <Class DescriptorProtos$DescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addPublicDependency(int i)
		{
			ensurePublicDependencyIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #229 <Method void ensurePublicDependencyIsMutable()>
			publicDependency_.add(((Object) (Integer.valueOf(i))));
		//    2    4:aload_0         
		//    3    5:getfield        #76  <Field List publicDependency_>
		//    4    8:iload_1         
		//    5    9:invokestatic    #334 <Method Integer Integer.valueOf(int)>
		//    6   12:invokeinterface #273 <Method boolean List.add(Object)>
		//    7   17:pop             
			onChanged();
		//    8   18:aload_0         
		//    9   19:invokevirtual   #209 <Method void onChanged()>
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
		//    3    3:invokespecial   #339 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #341 <Method DescriptorProtos$FileDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #341 <Method DescriptorProtos$FileDescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder addService(int i, DescriptorProtos.ServiceDescriptorProto.Builder builder)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureServiceIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #233 <Method void ensureServiceIsMutable()>
				service_.add(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #84  <Field List service_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #349 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto$Builder.build()>
		//   10   20:invokeinterface #266 <Method void List.add(int, Object)>
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				serviceBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   17   35:iload_1         
		//   18   36:aload_2         
		//   19   37:invokevirtual   #349 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto$Builder.build()>
		//   20   40:invokevirtual   #270 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   21   43:pop             
				return this;
		//   22   44:aload_0         
		//   23   45:areturn         
			}
		}

		public Builder addService(int i, DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(servicedescriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureServiceIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #233 <Method void ensureServiceIsMutable()>
					service_.add(i, ((Object) (servicedescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #84  <Field List service_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #266 <Method void List.add(int, Object)>
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				serviceBuilder_.addMessage(i, ((AbstractMessage) (servicedescriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   22   44:iload_1         
		//   23   45:aload_2         
		//   24   46:invokevirtual   #270 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
		//   25   49:pop             
				return this;
		//   26   50:aload_0         
		//   27   51:areturn         
			}
		}

		public Builder addService(DescriptorProtos.ServiceDescriptorProto.Builder builder)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureServiceIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #233 <Method void ensureServiceIsMutable()>
				service_.add(((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #84  <Field List service_>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #349 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto$Builder.build()>
		//    9   19:invokeinterface #273 <Method boolean List.add(Object)>
		//   10   24:pop             
				onChanged();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   13   29:aload_0         
		//   14   30:areturn         
			} else
			{
				serviceBuilder_.addMessage(((AbstractMessage) (builder.build())));
		//   15   31:aload_0         
		//   16   32:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #349 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto$Builder.build()>
		//   19   39:invokevirtual   #276 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   20   42:pop             
				return this;
		//   21   43:aload_0         
		//   22   44:areturn         
			}
		}

		public Builder addService(DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(servicedescriptorproto == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureServiceIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #233 <Method void ensureServiceIsMutable()>
					service_.add(((Object) (servicedescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #84  <Field List service_>
		//   13   27:aload_1         
		//   14   28:invokeinterface #273 <Method boolean List.add(Object)>
		//   15   33:pop             
					onChanged();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   18   38:aload_0         
		//   19   39:areturn         
				}
			} else
			{
				serviceBuilder_.addMessage(((AbstractMessage) (servicedescriptorproto)));
		//   20   40:aload_0         
		//   21   41:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   22   44:aload_1         
		//   23   45:invokevirtual   #276 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
		//   24   48:pop             
				return this;
		//   25   49:aload_0         
		//   26   50:areturn         
			}
		}

		public DescriptorProtos.ServiceDescriptorProto.Builder addServiceBuilder()
		{
			return (DescriptorProtos.ServiceDescriptorProto.Builder)getServiceFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.ServiceDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #190 <Method RepeatedFieldBuilderV3 getServiceFieldBuilder()>
		//    2    4:invokestatic    #358 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #288 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #346 <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.ServiceDescriptorProto.Builder addServiceBuilder(int i)
		{
			return (DescriptorProtos.ServiceDescriptorProto.Builder)getServiceFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.ServiceDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #190 <Method RepeatedFieldBuilderV3 getServiceFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #358 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #292 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #346 <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addWeakDependency(int i)
		{
			ensureWeakDependencyIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #237 <Method void ensureWeakDependencyIsMutable()>
			weakDependency_.add(((Object) (Integer.valueOf(i))));
		//    2    4:aload_0         
		//    3    5:getfield        #78  <Field List weakDependency_>
		//    4    8:iload_1         
		//    5    9:invokestatic    #334 <Method Integer Integer.valueOf(int)>
		//    6   12:invokeinterface #273 <Method boolean List.add(Object)>
		//    7   17:pop             
			onChanged();
		//    8   18:aload_0         
		//    9   19:invokevirtual   #209 <Method void onChanged()>
			return this;
		//   10   22:aload_0         
		//   11   23:areturn         
		}

		public DescriptorProtos.FileDescriptorProto build()
		{
			DescriptorProtos.FileDescriptorProto filedescriptorproto = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #364 <Method DescriptorProtos$FileDescriptorProto buildPartial()>
		//    2    4:astore_1        
			if(!filedescriptorproto.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #367 <Method boolean DescriptorProtos$FileDescriptorProto.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (filedescriptorproto)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #371 <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return filedescriptorproto;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #374 <Method DescriptorProtos$FileDescriptorProto build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #374 <Method DescriptorProtos$FileDescriptorProto build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.FileDescriptorProto buildPartial()
		{
			DescriptorProtos.FileDescriptorProto filedescriptorproto = new DescriptorProtos.FileDescriptorProto(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #9   <Class DescriptorProtos$FileDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #378 <Method void DescriptorProtos$FileDescriptorProto(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #106 <Field int bitField0_>
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
			filedescriptorproto.name_ = name_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #59  <Field Object name_>
		//   21   33:invokestatic    #382 <Method Object DescriptorProtos$FileDescriptorProto.access$1202(DescriptorProtos$FileDescriptorProto, Object)>
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
			filedescriptorproto.package_ = package_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #61  <Field Object package_>
		//   37   56:invokestatic    #385 <Method Object DescriptorProtos$FileDescriptorProto.access$1302(DescriptorProtos$FileDescriptorProto, Object)>
		//   38   59:pop             
			if((bitField0_ & 4) == 4)
		//*  39   60:aload_0         
		//*  40   61:getfield        #106 <Field int bitField0_>
		//*  41   64:iconst_4        
		//*  42   65:iand            
		//*  43   66:iconst_4        
		//*  44   67:icmpne          94
			{
				dependency_ = dependency_.getUnmodifiableView();
		//   45   70:aload_0         
		//   46   71:aload_0         
		//   47   72:getfield        #68  <Field LazyStringList dependency_>
		//   48   75:invokeinterface #389 <Method LazyStringList LazyStringList.getUnmodifiableView()>
		//   49   80:putfield        #68  <Field LazyStringList dependency_>
				bitField0_ = bitField0_ & -5;
		//   50   83:aload_0         
		//   51   84:aload_0         
		//   52   85:getfield        #106 <Field int bitField0_>
		//   53   88:bipush          -5
		//   54   90:iand            
		//   55   91:putfield        #106 <Field int bitField0_>
			}
			filedescriptorproto.dependency_ = dependency_;
		//   56   94:aload           4
		//   57   96:aload_0         
		//   58   97:getfield        #68  <Field LazyStringList dependency_>
		//   59  100:invokestatic    #393 <Method LazyStringList DescriptorProtos$FileDescriptorProto.access$1402(DescriptorProtos$FileDescriptorProto, LazyStringList)>
		//   60  103:pop             
			if((bitField0_ & 8) == 8)
		//*  61  104:aload_0         
		//*  62  105:getfield        #106 <Field int bitField0_>
		//*  63  108:bipush          8
		//*  64  110:iand            
		//*  65  111:bipush          8
		//*  66  113:icmpne          138
			{
				publicDependency_ = Collections.unmodifiableList(publicDependency_);
		//   67  116:aload_0         
		//   68  117:aload_0         
		//   69  118:getfield        #76  <Field List publicDependency_>
		//   70  121:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//   71  124:putfield        #76  <Field List publicDependency_>
				bitField0_ = bitField0_ & -9;
		//   72  127:aload_0         
		//   73  128:aload_0         
		//   74  129:getfield        #106 <Field int bitField0_>
		//   75  132:bipush          -9
		//   76  134:iand            
		//   77  135:putfield        #106 <Field int bitField0_>
			}
			filedescriptorproto.publicDependency_ = publicDependency_;
		//   78  138:aload           4
		//   79  140:aload_0         
		//   80  141:getfield        #76  <Field List publicDependency_>
		//   81  144:invokestatic    #401 <Method List DescriptorProtos$FileDescriptorProto.access$1502(DescriptorProtos$FileDescriptorProto, List)>
		//   82  147:pop             
			if((bitField0_ & 0x10) == 16)
		//*  83  148:aload_0         
		//*  84  149:getfield        #106 <Field int bitField0_>
		//*  85  152:bipush          16
		//*  86  154:iand            
		//*  87  155:bipush          16
		//*  88  157:icmpne          182
			{
				weakDependency_ = Collections.unmodifiableList(weakDependency_);
		//   89  160:aload_0         
		//   90  161:aload_0         
		//   91  162:getfield        #78  <Field List weakDependency_>
		//   92  165:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//   93  168:putfield        #78  <Field List weakDependency_>
				bitField0_ = bitField0_ & 0xffffffef;
		//   94  171:aload_0         
		//   95  172:aload_0         
		//   96  173:getfield        #106 <Field int bitField0_>
		//   97  176:bipush          -17
		//   98  178:iand            
		//   99  179:putfield        #106 <Field int bitField0_>
			}
			filedescriptorproto.weakDependency_ = weakDependency_;
		//  100  182:aload           4
		//  101  184:aload_0         
		//  102  185:getfield        #78  <Field List weakDependency_>
		//  103  188:invokestatic    #404 <Method List DescriptorProtos$FileDescriptorProto.access$1602(DescriptorProtos$FileDescriptorProto, List)>
		//  104  191:pop             
			if(messageTypeBuilder_ == null)
		//* 105  192:aload_0         
		//* 106  193:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//* 107  196:ifnonnull       246
			{
				if((bitField0_ & 0x20) == 32)
		//* 108  199:aload_0         
		//* 109  200:getfield        #106 <Field int bitField0_>
		//* 110  203:bipush          32
		//* 111  205:iand            
		//* 112  206:bipush          32
		//* 113  208:icmpne          233
				{
					messageType_ = Collections.unmodifiableList(messageType_);
		//  114  211:aload_0         
		//  115  212:aload_0         
		//  116  213:getfield        #80  <Field List messageType_>
		//  117  216:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//  118  219:putfield        #80  <Field List messageType_>
					bitField0_ = bitField0_ & 0xffffffdf;
		//  119  222:aload_0         
		//  120  223:aload_0         
		//  121  224:getfield        #106 <Field int bitField0_>
		//  122  227:bipush          -33
		//  123  229:iand            
		//  124  230:putfield        #106 <Field int bitField0_>
				}
				filedescriptorproto.messageType_ = messageType_;
		//  125  233:aload           4
		//  126  235:aload_0         
		//  127  236:getfield        #80  <Field List messageType_>
		//  128  239:invokestatic    #407 <Method List DescriptorProtos$FileDescriptorProto.access$1702(DescriptorProtos$FileDescriptorProto, List)>
		//  129  242:pop             
			} else
		//* 130  243:goto            259
			{
				filedescriptorproto.messageType_ = messageTypeBuilder_.build();
		//  131  246:aload           4
		//  132  248:aload_0         
		//  133  249:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//  134  252:invokevirtual   #409 <Method List RepeatedFieldBuilderV3.build()>
		//  135  255:invokestatic    #407 <Method List DescriptorProtos$FileDescriptorProto.access$1702(DescriptorProtos$FileDescriptorProto, List)>
		//  136  258:pop             
			}
			if(enumTypeBuilder_ == null)
		//* 137  259:aload_0         
		//* 138  260:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//* 139  263:ifnonnull       313
			{
				if((bitField0_ & 0x40) == 64)
		//* 140  266:aload_0         
		//* 141  267:getfield        #106 <Field int bitField0_>
		//* 142  270:bipush          64
		//* 143  272:iand            
		//* 144  273:bipush          64
		//* 145  275:icmpne          300
				{
					enumType_ = Collections.unmodifiableList(enumType_);
		//  146  278:aload_0         
		//  147  279:aload_0         
		//  148  280:getfield        #82  <Field List enumType_>
		//  149  283:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//  150  286:putfield        #82  <Field List enumType_>
					bitField0_ = bitField0_ & 0xffffffbf;
		//  151  289:aload_0         
		//  152  290:aload_0         
		//  153  291:getfield        #106 <Field int bitField0_>
		//  154  294:bipush          -65
		//  155  296:iand            
		//  156  297:putfield        #106 <Field int bitField0_>
				}
				filedescriptorproto.enumType_ = enumType_;
		//  157  300:aload           4
		//  158  302:aload_0         
		//  159  303:getfield        #82  <Field List enumType_>
		//  160  306:invokestatic    #412 <Method List DescriptorProtos$FileDescriptorProto.access$1802(DescriptorProtos$FileDescriptorProto, List)>
		//  161  309:pop             
			} else
		//* 162  310:goto            326
			{
				filedescriptorproto.enumType_ = enumTypeBuilder_.build();
		//  163  313:aload           4
		//  164  315:aload_0         
		//  165  316:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//  166  319:invokevirtual   #409 <Method List RepeatedFieldBuilderV3.build()>
		//  167  322:invokestatic    #412 <Method List DescriptorProtos$FileDescriptorProto.access$1802(DescriptorProtos$FileDescriptorProto, List)>
		//  168  325:pop             
			}
			if(serviceBuilder_ == null)
		//* 169  326:aload_0         
		//* 170  327:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//* 171  330:ifnonnull       383
			{
				if((bitField0_ & 0x80) == 128)
		//* 172  333:aload_0         
		//* 173  334:getfield        #106 <Field int bitField0_>
		//* 174  337:sipush          128
		//* 175  340:iand            
		//* 176  341:sipush          128
		//* 177  344:icmpne          370
				{
					service_ = Collections.unmodifiableList(service_);
		//  178  347:aload_0         
		//  179  348:aload_0         
		//  180  349:getfield        #84  <Field List service_>
		//  181  352:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//  182  355:putfield        #84  <Field List service_>
					bitField0_ = bitField0_ & 0xffffff7f;
		//  183  358:aload_0         
		//  184  359:aload_0         
		//  185  360:getfield        #106 <Field int bitField0_>
		//  186  363:sipush          -129
		//  187  366:iand            
		//  188  367:putfield        #106 <Field int bitField0_>
				}
				filedescriptorproto.service_ = service_;
		//  189  370:aload           4
		//  190  372:aload_0         
		//  191  373:getfield        #84  <Field List service_>
		//  192  376:invokestatic    #415 <Method List DescriptorProtos$FileDescriptorProto.access$1902(DescriptorProtos$FileDescriptorProto, List)>
		//  193  379:pop             
			} else
		//* 194  380:goto            396
			{
				filedescriptorproto.service_ = serviceBuilder_.build();
		//  195  383:aload           4
		//  196  385:aload_0         
		//  197  386:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//  198  389:invokevirtual   #409 <Method List RepeatedFieldBuilderV3.build()>
		//  199  392:invokestatic    #415 <Method List DescriptorProtos$FileDescriptorProto.access$1902(DescriptorProtos$FileDescriptorProto, List)>
		//  200  395:pop             
			}
			if(extensionBuilder_ == null)
		//* 201  396:aload_0         
		//* 202  397:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//* 203  400:ifnonnull       453
			{
				if((bitField0_ & 0x100) == 256)
		//* 204  403:aload_0         
		//* 205  404:getfield        #106 <Field int bitField0_>
		//* 206  407:sipush          256
		//* 207  410:iand            
		//* 208  411:sipush          256
		//* 209  414:icmpne          440
				{
					extension_ = Collections.unmodifiableList(extension_);
		//  210  417:aload_0         
		//  211  418:aload_0         
		//  212  419:getfield        #86  <Field List extension_>
		//  213  422:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//  214  425:putfield        #86  <Field List extension_>
					bitField0_ = bitField0_ & 0xfffffeff;
		//  215  428:aload_0         
		//  216  429:aload_0         
		//  217  430:getfield        #106 <Field int bitField0_>
		//  218  433:sipush          -257
		//  219  436:iand            
		//  220  437:putfield        #106 <Field int bitField0_>
				}
				filedescriptorproto.extension_ = extension_;
		//  221  440:aload           4
		//  222  442:aload_0         
		//  223  443:getfield        #86  <Field List extension_>
		//  224  446:invokestatic    #418 <Method List DescriptorProtos$FileDescriptorProto.access$2002(DescriptorProtos$FileDescriptorProto, List)>
		//  225  449:pop             
			} else
		//* 226  450:goto            466
			{
				filedescriptorproto.extension_ = extensionBuilder_.build();
		//  227  453:aload           4
		//  228  455:aload_0         
		//  229  456:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//  230  459:invokevirtual   #409 <Method List RepeatedFieldBuilderV3.build()>
		//  231  462:invokestatic    #418 <Method List DescriptorProtos$FileDescriptorProto.access$2002(DescriptorProtos$FileDescriptorProto, List)>
		//  232  465:pop             
			}
			j = i;
		//  233  466:iload_1         
		//  234  467:istore_2        
			if((k & 0x200) == 512)
		//* 235  468:iload_3         
		//* 236  469:sipush          512
		//* 237  472:iand            
		//* 238  473:sipush          512
		//* 239  476:icmpne          483
				j = i | 4;
		//  240  479:iload_1         
		//  241  480:iconst_4        
		//  242  481:ior             
		//  243  482:istore_2        
			if(optionsBuilder_ == null)
		//* 244  483:aload_0         
		//* 245  484:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//* 246  487:ifnonnull       503
				filedescriptorproto.options_ = options_;
		//  247  490:aload           4
		//  248  492:aload_0         
		//  249  493:getfield        #88  <Field DescriptorProtos$FileOptions options_>
		//  250  496:invokestatic    #422 <Method DescriptorProtos$FileOptions DescriptorProtos$FileDescriptorProto.access$2102(DescriptorProtos$FileDescriptorProto, DescriptorProtos$FileOptions)>
		//  251  499:pop             
			else
		//* 252  500:goto            519
				filedescriptorproto.options_ = (DescriptorProtos.FileOptions)optionsBuilder_.build();
		//  253  503:aload           4
		//  254  505:aload_0         
		//  255  506:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//  256  509:invokevirtual   #425 <Method AbstractMessage SingleFieldBuilderV3.build()>
		//  257  512:checkcast       #427 <Class DescriptorProtos$FileOptions>
		//  258  515:invokestatic    #422 <Method DescriptorProtos$FileOptions DescriptorProtos$FileDescriptorProto.access$2102(DescriptorProtos$FileDescriptorProto, DescriptorProtos$FileOptions)>
		//  259  518:pop             
			i = j;
		//  260  519:iload_2         
		//  261  520:istore_1        
			if((k & 0x400) == 1024)
		//* 262  521:iload_3         
		//* 263  522:sipush          1024
		//* 264  525:iand            
		//* 265  526:sipush          1024
		//* 266  529:icmpne          537
				i = j | 8;
		//  267  532:iload_2         
		//  268  533:bipush          8
		//  269  535:ior             
		//  270  536:istore_1        
			if(sourceCodeInfoBuilder_ == null)
		//* 271  537:aload_0         
		//* 272  538:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//* 273  541:ifnonnull       557
				filedescriptorproto.sourceCodeInfo_ = sourceCodeInfo_;
		//  274  544:aload           4
		//  275  546:aload_0         
		//  276  547:getfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		//  277  550:invokestatic    #431 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$FileDescriptorProto.access$2202(DescriptorProtos$FileDescriptorProto, DescriptorProtos$SourceCodeInfo)>
		//  278  553:pop             
			else
		//* 279  554:goto            573
				filedescriptorproto.sourceCodeInfo_ = (DescriptorProtos.SourceCodeInfo)sourceCodeInfoBuilder_.build();
		//  280  557:aload           4
		//  281  559:aload_0         
		//  282  560:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//  283  563:invokevirtual   #425 <Method AbstractMessage SingleFieldBuilderV3.build()>
		//  284  566:checkcast       #433 <Class DescriptorProtos$SourceCodeInfo>
		//  285  569:invokestatic    #431 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$FileDescriptorProto.access$2202(DescriptorProtos$FileDescriptorProto, DescriptorProtos$SourceCodeInfo)>
		//  286  572:pop             
			j = i;
		//  287  573:iload_1         
		//  288  574:istore_2        
			if((k & 0x800) == 2048)
		//* 289  575:iload_3         
		//* 290  576:sipush          2048
		//* 291  579:iand            
		//* 292  580:sipush          2048
		//* 293  583:icmpne          591
				j = i | 0x10;
		//  294  586:iload_1         
		//  295  587:bipush          16
		//  296  589:ior             
		//  297  590:istore_2        
			filedescriptorproto.syntax_ = syntax_;
		//  298  591:aload           4
		//  299  593:aload_0         
		//  300  594:getfield        #92  <Field Object syntax_>
		//  301  597:invokestatic    #436 <Method Object DescriptorProtos$FileDescriptorProto.access$2302(DescriptorProtos$FileDescriptorProto, Object)>
		//  302  600:pop             
			filedescriptorproto.bitField0_ = j;
		//  303  601:aload           4
		//  304  603:iload_2         
		//  305  604:invokestatic    #440 <Method int DescriptorProtos$FileDescriptorProto.access$2402(DescriptorProtos$FileDescriptorProto, int)>
		//  306  607:pop             
			onBuilt();
		//  307  608:aload_0         
		//  308  609:invokevirtual   #443 <Method void onBuilt()>
			return filedescriptorproto;
		//  309  612:aload           4
		//  310  614:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #364 <Method DescriptorProtos$FileDescriptorProto buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #364 <Method DescriptorProtos$FileDescriptorProto buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #448 <Method DescriptorProtos$FileDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #451 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			name_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #57  <String "">
		//    5    8:putfield        #59  <Field Object name_>
			bitField0_ = bitField0_ & -2;
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:getfield        #106 <Field int bitField0_>
		//    9   16:bipush          -2
		//   10   18:iand            
		//   11   19:putfield        #106 <Field int bitField0_>
			package_ = "";
		//   12   22:aload_0         
		//   13   23:ldc1            #57  <String "">
		//   14   25:putfield        #61  <Field Object package_>
			bitField0_ = bitField0_ & -3;
		//   15   28:aload_0         
		//   16   29:aload_0         
		//   17   30:getfield        #106 <Field int bitField0_>
		//   18   33:bipush          -3
		//   19   35:iand            
		//   20   36:putfield        #106 <Field int bitField0_>
			dependency_ = LazyStringArrayList.EMPTY;
		//   21   39:aload_0         
		//   22   40:getstatic       #66  <Field LazyStringList LazyStringArrayList.EMPTY>
		//   23   43:putfield        #68  <Field LazyStringList dependency_>
			bitField0_ = bitField0_ & -5;
		//   24   46:aload_0         
		//   25   47:aload_0         
		//   26   48:getfield        #106 <Field int bitField0_>
		//   27   51:bipush          -5
		//   28   53:iand            
		//   29   54:putfield        #106 <Field int bitField0_>
			publicDependency_ = Collections.emptyList();
		//   30   57:aload_0         
		//   31   58:invokestatic    #74  <Method List Collections.emptyList()>
		//   32   61:putfield        #76  <Field List publicDependency_>
			bitField0_ = bitField0_ & -9;
		//   33   64:aload_0         
		//   34   65:aload_0         
		//   35   66:getfield        #106 <Field int bitField0_>
		//   36   69:bipush          -9
		//   37   71:iand            
		//   38   72:putfield        #106 <Field int bitField0_>
			weakDependency_ = Collections.emptyList();
		//   39   75:aload_0         
		//   40   76:invokestatic    #74  <Method List Collections.emptyList()>
		//   41   79:putfield        #78  <Field List weakDependency_>
			bitField0_ = bitField0_ & 0xffffffef;
		//   42   82:aload_0         
		//   43   83:aload_0         
		//   44   84:getfield        #106 <Field int bitField0_>
		//   45   87:bipush          -17
		//   46   89:iand            
		//   47   90:putfield        #106 <Field int bitField0_>
			if(messageTypeBuilder_ == null)
		//*  48   93:aload_0         
		//*  49   94:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*  50   97:ifnonnull       121
			{
				messageType_ = Collections.emptyList();
		//   51  100:aload_0         
		//   52  101:invokestatic    #74  <Method List Collections.emptyList()>
		//   53  104:putfield        #80  <Field List messageType_>
				bitField0_ = bitField0_ & 0xffffffdf;
		//   54  107:aload_0         
		//   55  108:aload_0         
		//   56  109:getfield        #106 <Field int bitField0_>
		//   57  112:bipush          -33
		//   58  114:iand            
		//   59  115:putfield        #106 <Field int bitField0_>
			} else
		//*  60  118:goto            128
			{
				messageTypeBuilder_.clear();
		//   61  121:aload_0         
		//   62  122:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   63  125:invokevirtual   #453 <Method void RepeatedFieldBuilderV3.clear()>
			}
			if(enumTypeBuilder_ == null)
		//*  64  128:aload_0         
		//*  65  129:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*  66  132:ifnonnull       156
			{
				enumType_ = Collections.emptyList();
		//   67  135:aload_0         
		//   68  136:invokestatic    #74  <Method List Collections.emptyList()>
		//   69  139:putfield        #82  <Field List enumType_>
				bitField0_ = bitField0_ & 0xffffffbf;
		//   70  142:aload_0         
		//   71  143:aload_0         
		//   72  144:getfield        #106 <Field int bitField0_>
		//   73  147:bipush          -65
		//   74  149:iand            
		//   75  150:putfield        #106 <Field int bitField0_>
			} else
		//*  76  153:goto            163
			{
				enumTypeBuilder_.clear();
		//   77  156:aload_0         
		//   78  157:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   79  160:invokevirtual   #453 <Method void RepeatedFieldBuilderV3.clear()>
			}
			if(serviceBuilder_ == null)
		//*  80  163:aload_0         
		//*  81  164:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*  82  167:ifnonnull       192
			{
				service_ = Collections.emptyList();
		//   83  170:aload_0         
		//   84  171:invokestatic    #74  <Method List Collections.emptyList()>
		//   85  174:putfield        #84  <Field List service_>
				bitField0_ = bitField0_ & 0xffffff7f;
		//   86  177:aload_0         
		//   87  178:aload_0         
		//   88  179:getfield        #106 <Field int bitField0_>
		//   89  182:sipush          -129
		//   90  185:iand            
		//   91  186:putfield        #106 <Field int bitField0_>
			} else
		//*  92  189:goto            199
			{
				serviceBuilder_.clear();
		//   93  192:aload_0         
		//   94  193:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   95  196:invokevirtual   #453 <Method void RepeatedFieldBuilderV3.clear()>
			}
			if(extensionBuilder_ == null)
		//*  96  199:aload_0         
		//*  97  200:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*  98  203:ifnonnull       228
			{
				extension_ = Collections.emptyList();
		//   99  206:aload_0         
		//  100  207:invokestatic    #74  <Method List Collections.emptyList()>
		//  101  210:putfield        #86  <Field List extension_>
				bitField0_ = bitField0_ & 0xfffffeff;
		//  102  213:aload_0         
		//  103  214:aload_0         
		//  104  215:getfield        #106 <Field int bitField0_>
		//  105  218:sipush          -257
		//  106  221:iand            
		//  107  222:putfield        #106 <Field int bitField0_>
			} else
		//* 108  225:goto            235
			{
				extensionBuilder_.clear();
		//  109  228:aload_0         
		//  110  229:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//  111  232:invokevirtual   #453 <Method void RepeatedFieldBuilderV3.clear()>
			}
			if(optionsBuilder_ == null)
		//* 112  235:aload_0         
		//* 113  236:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//* 114  239:ifnonnull       250
				options_ = null;
		//  115  242:aload_0         
		//  116  243:aconst_null     
		//  117  244:putfield        #88  <Field DescriptorProtos$FileOptions options_>
			else
		//* 118  247:goto            258
				optionsBuilder_.clear();
		//  119  250:aload_0         
		//  120  251:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//  121  254:invokevirtual   #455 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//  122  257:pop             
			bitField0_ = bitField0_ & 0xfffffdff;
		//  123  258:aload_0         
		//  124  259:aload_0         
		//  125  260:getfield        #106 <Field int bitField0_>
		//  126  263:sipush          -513
		//  127  266:iand            
		//  128  267:putfield        #106 <Field int bitField0_>
			if(sourceCodeInfoBuilder_ == null)
		//* 129  270:aload_0         
		//* 130  271:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//* 131  274:ifnonnull       285
				sourceCodeInfo_ = null;
		//  132  277:aload_0         
		//  133  278:aconst_null     
		//  134  279:putfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
			else
		//* 135  282:goto            293
				sourceCodeInfoBuilder_.clear();
		//  136  285:aload_0         
		//  137  286:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//  138  289:invokevirtual   #455 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//  139  292:pop             
			bitField0_ = bitField0_ & 0xfffffbff;
		//  140  293:aload_0         
		//  141  294:aload_0         
		//  142  295:getfield        #106 <Field int bitField0_>
		//  143  298:sipush          -1025
		//  144  301:iand            
		//  145  302:putfield        #106 <Field int bitField0_>
			syntax_ = "";
		//  146  305:aload_0         
		//  147  306:ldc1            #57  <String "">
		//  148  308:putfield        #92  <Field Object syntax_>
			bitField0_ = bitField0_ & 0xfffff7ff;
		//  149  311:aload_0         
		//  150  312:aload_0         
		//  151  313:getfield        #106 <Field int bitField0_>
		//  152  316:sipush          -2049
		//  153  319:iand            
		//  154  320:putfield        #106 <Field int bitField0_>
			return this;
		//  155  323:aload_0         
		//  156  324:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #448 <Method DescriptorProtos$FileDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #448 <Method DescriptorProtos$FileDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #448 <Method DescriptorProtos$FileDescriptorProto$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearDependency()
		{
			dependency_ = LazyStringArrayList.EMPTY;
		//    0    0:aload_0         
		//    1    1:getstatic       #66  <Field LazyStringList LazyStringArrayList.EMPTY>
		//    2    4:putfield        #68  <Field LazyStringList dependency_>
			bitField0_ = bitField0_ & -5;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #106 <Field int bitField0_>
		//    6   12:bipush          -5
		//    7   14:iand            
		//    8   15:putfield        #106 <Field int bitField0_>
			onChanged();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #209 <Method void onChanged()>
			return this;
		//   11   22:aload_0         
		//   12   23:areturn         
		}

		public Builder clearEnumType()
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				enumType_ = Collections.emptyList();
		//    3    7:aload_0         
		//    4    8:invokestatic    #74  <Method List Collections.emptyList()>
		//    5   11:putfield        #82  <Field List enumType_>
				bitField0_ = bitField0_ & 0xffffffbf;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #106 <Field int bitField0_>
		//    9   19:bipush          -65
		//   10   21:iand            
		//   11   22:putfield        #106 <Field int bitField0_>
				onChanged();
		//   12   25:aload_0         
		//   13   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   14   29:aload_0         
		//   15   30:areturn         
			} else
			{
				enumTypeBuilder_.clear();
		//   16   31:aload_0         
		//   17   32:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   18   35:invokevirtual   #453 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   19   38:aload_0         
		//   20   39:areturn         
			}
		}

		public Builder clearExtension()
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       32
			{
				extension_ = Collections.emptyList();
		//    3    7:aload_0         
		//    4    8:invokestatic    #74  <Method List Collections.emptyList()>
		//    5   11:putfield        #86  <Field List extension_>
				bitField0_ = bitField0_ & 0xfffffeff;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #106 <Field int bitField0_>
		//    9   19:sipush          -257
		//   10   22:iand            
		//   11   23:putfield        #106 <Field int bitField0_>
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				extensionBuilder_.clear();
		//   16   32:aload_0         
		//   17   33:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   18   36:invokevirtual   #453 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   19   39:aload_0         
		//   20   40:areturn         
			}
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #465 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #467 <Method DescriptorProtos$FileDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #467 <Method DescriptorProtos$FileDescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearMessageType()
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				messageType_ = Collections.emptyList();
		//    3    7:aload_0         
		//    4    8:invokestatic    #74  <Method List Collections.emptyList()>
		//    5   11:putfield        #80  <Field List messageType_>
				bitField0_ = bitField0_ & 0xffffffdf;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #106 <Field int bitField0_>
		//    9   19:bipush          -33
		//   10   21:iand            
		//   11   22:putfield        #106 <Field int bitField0_>
				onChanged();
		//   12   25:aload_0         
		//   13   26:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   14   29:aload_0         
		//   15   30:areturn         
			} else
			{
				messageTypeBuilder_.clear();
		//   16   31:aload_0         
		//   17   32:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   18   35:invokevirtual   #453 <Method void RepeatedFieldBuilderV3.clear()>
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
		//    2    2:getfield        #106 <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #106 <Field int bitField0_>
			name_ = ((Object) (DescriptorProtos.FileDescriptorProto.getDefaultInstance().getName()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #472 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.getDefaultInstance()>
		//    8   15:invokevirtual   #476 <Method String DescriptorProtos$FileDescriptorProto.getName()>
		//    9   18:putfield        #59  <Field Object name_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #209 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #481 <Method DescriptorProtos$FileDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #484 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #481 <Method DescriptorProtos$FileDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #481 <Method DescriptorProtos$FileDescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       19
			{
				options_ = null;
		//    3    7:aload_0         
		//    4    8:aconst_null     
		//    5    9:putfield        #88  <Field DescriptorProtos$FileOptions options_>
				onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #209 <Method void onChanged()>
			} else
		//*   8   16:goto            27
			{
				optionsBuilder_.clear();
		//    9   19:aload_0         
		//   10   20:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//   11   23:invokevirtual   #455 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   12   26:pop             
			}
			bitField0_ = bitField0_ & 0xfffffdff;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #106 <Field int bitField0_>
		//   16   32:sipush          -513
		//   17   35:iand            
		//   18   36:putfield        #106 <Field int bitField0_>
			return this;
		//   19   39:aload_0         
		//   20   40:areturn         
		}

		public Builder clearPackage()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #106 <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #106 <Field int bitField0_>
			package_ = ((Object) (DescriptorProtos.FileDescriptorProto.getDefaultInstance().getPackage()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #472 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.getDefaultInstance()>
		//    8   15:invokevirtual   #490 <Method String DescriptorProtos$FileDescriptorProto.getPackage()>
		//    9   18:putfield        #61  <Field Object package_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #209 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public Builder clearPublicDependency()
		{
			publicDependency_ = Collections.emptyList();
		//    0    0:aload_0         
		//    1    1:invokestatic    #74  <Method List Collections.emptyList()>
		//    2    4:putfield        #76  <Field List publicDependency_>
			bitField0_ = bitField0_ & -9;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #106 <Field int bitField0_>
		//    6   12:bipush          -9
		//    7   14:iand            
		//    8   15:putfield        #106 <Field int bitField0_>
			onChanged();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #209 <Method void onChanged()>
			return this;
		//   11   22:aload_0         
		//   12   23:areturn         
		}

		public Builder clearService()
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       32
			{
				service_ = Collections.emptyList();
		//    3    7:aload_0         
		//    4    8:invokestatic    #74  <Method List Collections.emptyList()>
		//    5   11:putfield        #84  <Field List service_>
				bitField0_ = bitField0_ & 0xffffff7f;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #106 <Field int bitField0_>
		//    9   19:sipush          -129
		//   10   22:iand            
		//   11   23:putfield        #106 <Field int bitField0_>
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				serviceBuilder_.clear();
		//   16   32:aload_0         
		//   17   33:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   18   36:invokevirtual   #453 <Method void RepeatedFieldBuilderV3.clear()>
				return this;
		//   19   39:aload_0         
		//   20   40:areturn         
			}
		}

		public Builder clearSourceCodeInfo()
		{
			if(sourceCodeInfoBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//*   2    4:ifnonnull       19
			{
				sourceCodeInfo_ = null;
		//    3    7:aload_0         
		//    4    8:aconst_null     
		//    5    9:putfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
				onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #209 <Method void onChanged()>
			} else
		//*   8   16:goto            27
			{
				sourceCodeInfoBuilder_.clear();
		//    9   19:aload_0         
		//   10   20:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//   11   23:invokevirtual   #455 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   12   26:pop             
			}
			bitField0_ = bitField0_ & 0xfffffbff;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #106 <Field int bitField0_>
		//   16   32:sipush          -1025
		//   17   35:iand            
		//   18   36:putfield        #106 <Field int bitField0_>
			return this;
		//   19   39:aload_0         
		//   20   40:areturn         
		}

		public Builder clearSyntax()
		{
			bitField0_ = bitField0_ & 0xfffff7ff;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #106 <Field int bitField0_>
		//    3    5:sipush          -2049
		//    4    8:iand            
		//    5    9:putfield        #106 <Field int bitField0_>
			syntax_ = ((Object) (DescriptorProtos.FileDescriptorProto.getDefaultInstance().getSyntax()));
		//    6   12:aload_0         
		//    7   13:invokestatic    #472 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.getDefaultInstance()>
		//    8   16:invokevirtual   #497 <Method String DescriptorProtos$FileDescriptorProto.getSyntax()>
		//    9   19:putfield        #92  <Field Object syntax_>
			onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #209 <Method void onChanged()>
			return this;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public Builder clearWeakDependency()
		{
			weakDependency_ = Collections.emptyList();
		//    0    0:aload_0         
		//    1    1:invokestatic    #74  <Method List Collections.emptyList()>
		//    2    4:putfield        #78  <Field List weakDependency_>
			bitField0_ = bitField0_ & 0xffffffef;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #106 <Field int bitField0_>
		//    6   12:bipush          -17
		//    7   14:iand            
		//    8   15:putfield        #106 <Field int bitField0_>
			onChanged();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #209 <Method void onChanged()>
			return this;
		//   11   22:aload_0         
		//   12   23:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #501 <Method DescriptorProtos$FileDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #501 <Method DescriptorProtos$FileDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #504 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #501 <Method DescriptorProtos$FileDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #501 <Method DescriptorProtos$FileDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #501 <Method DescriptorProtos$FileDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #501 <Method DescriptorProtos$FileDescriptorProto$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.FileDescriptorProto getDefaultInstanceForType()
		{
			return DescriptorProtos.FileDescriptorProto.getDefaultInstance();
		//    0    0:invokestatic    #472 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #511 <Method DescriptorProtos$FileDescriptorProto getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #511 <Method DescriptorProtos$FileDescriptorProto getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public String getDependency(int i)
		{
			return (String)dependency_.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field LazyStringList dependency_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #517 <Method Object LazyStringList.get(int)>
		//    4   10:checkcast       #519 <Class String>
		//    5   13:areturn         
		}

		public ByteString getDependencyBytes(int i)
		{
			return dependency_.getByteString(i);
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field LazyStringList dependency_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #524 <Method ByteString LazyStringList.getByteString(int)>
		//    4   10:areturn         
		}

		public int getDependencyCount()
		{
			return dependency_.size();
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field LazyStringList dependency_>
		//    2    4:invokeinterface #529 <Method int LazyStringList.size()>
		//    3    9:ireturn         
		}

		public ProtocolStringList getDependencyList()
		{
			return ((ProtocolStringList) (dependency_.getUnmodifiableView()));
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field LazyStringList dependency_>
		//    2    4:invokeinterface #389 <Method LazyStringList LazyStringList.getUnmodifiableView()>
		//    3    9:areturn         
		}

		public volatile List getDependencyList()
		{
			return ((List) (getDependencyList()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #533 <Method ProtocolStringList getDependencyList()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$700();
		//    0    0:invokestatic    #125 <Method Descriptors$Descriptor DescriptorProtos.access$700()>
		//    1    3:areturn         
		}

		public DescriptorProtos.EnumDescriptorProto getEnumType(int i)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.EnumDescriptorProto)enumType_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #82  <Field List enumType_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #537 <Method Object List.get(int)>
		//    7   17:checkcast       #281 <Class DescriptorProtos$EnumDescriptorProto>
		//    8   20:areturn         
			else
				return (DescriptorProtos.EnumDescriptorProto)enumTypeBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #541 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #281 <Class DescriptorProtos$EnumDescriptorProto>
		//   14   32:areturn         
		}

		public DescriptorProtos.EnumDescriptorProto.Builder getEnumTypeBuilder(int i)
		{
			return (DescriptorProtos.EnumDescriptorProto.Builder)getEnumTypeFieldBuilder().getBuilder(i);
		//    0    0:aload_0         
		//    1    1:invokespecial   #188 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #546 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
		//    4    8:checkcast       #257 <Class DescriptorProtos$EnumDescriptorProto$Builder>
		//    5   11:areturn         
		}

		public List getEnumTypeBuilderList()
		{
			return getEnumTypeFieldBuilder().getBuilderList();
		//    0    0:aload_0         
		//    1    1:invokespecial   #188 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
		//    2    4:invokevirtual   #550 <Method List RepeatedFieldBuilderV3.getBuilderList()>
		//    3    7:areturn         
		}

		public int getEnumTypeCount()
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       17
				return enumType_.size();
		//    3    7:aload_0         
		//    4    8:getfield        #82  <Field List enumType_>
		//    5   11:invokeinterface #553 <Method int List.size()>
		//    6   16:ireturn         
			else
				return enumTypeBuilder_.getCount();
		//    7   17:aload_0         
		//    8   18:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//    9   21:invokevirtual   #556 <Method int RepeatedFieldBuilderV3.getCount()>
		//   10   24:ireturn         
		}

		public List getEnumTypeList()
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       15
				return Collections.unmodifiableList(enumType_);
		//    3    7:aload_0         
		//    4    8:getfield        #82  <Field List enumType_>
		//    5   11:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//    6   14:areturn         
			else
				return enumTypeBuilder_.getMessageList();
		//    7   15:aload_0         
		//    8   16:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//    9   19:invokevirtual   #560 <Method List RepeatedFieldBuilderV3.getMessageList()>
		//   10   22:areturn         
		}

		public DescriptorProtos.EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.EnumDescriptorProtoOrBuilder)enumType_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #82  <Field List enumType_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #537 <Method Object List.get(int)>
		//    7   17:checkcast       #565 <Class DescriptorProtos$EnumDescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.EnumDescriptorProtoOrBuilder)enumTypeBuilder_.getMessageOrBuilder(i);
		//    9   21:aload_0         
		//   10   22:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #569 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
		//   13   29:checkcast       #565 <Class DescriptorProtos$EnumDescriptorProtoOrBuilder>
		//   14   32:areturn         
		}

		public List getEnumTypeOrBuilderList()
		{
			if(enumTypeBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnull          15
				return enumTypeBuilder_.getMessageOrBuilderList();
		//    3    7:aload_0         
		//    4    8:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//    5   11:invokevirtual   #573 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
		//    6   14:areturn         
			else
				return Collections.unmodifiableList(enumType_);
		//    7   15:aload_0         
		//    8   16:getfield        #82  <Field List enumType_>
		//    9   19:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//   10   22:areturn         
		}

		public DescriptorProtos.FieldDescriptorProto getExtension(int i)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.FieldDescriptorProto)extension_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #86  <Field List extension_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #537 <Method Object List.get(int)>
		//    7   17:checkcast       #306 <Class DescriptorProtos$FieldDescriptorProto>
		//    8   20:areturn         
			else
				return (DescriptorProtos.FieldDescriptorProto)extensionBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #541 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #306 <Class DescriptorProtos$FieldDescriptorProto>
		//   14   32:areturn         
		}

		public DescriptorProtos.FieldDescriptorProto.Builder getExtensionBuilder(int i)
		{
			return (DescriptorProtos.FieldDescriptorProto.Builder)getExtensionFieldBuilder().getBuilder(i);
		//    0    0:aload_0         
		//    1    1:invokespecial   #192 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #546 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
		//    4    8:checkcast       #296 <Class DescriptorProtos$FieldDescriptorProto$Builder>
		//    5   11:areturn         
		}

		public List getExtensionBuilderList()
		{
			return getExtensionFieldBuilder().getBuilderList();
		//    0    0:aload_0         
		//    1    1:invokespecial   #192 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
		//    2    4:invokevirtual   #550 <Method List RepeatedFieldBuilderV3.getBuilderList()>
		//    3    7:areturn         
		}

		public int getExtensionCount()
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       17
				return extension_.size();
		//    3    7:aload_0         
		//    4    8:getfield        #86  <Field List extension_>
		//    5   11:invokeinterface #553 <Method int List.size()>
		//    6   16:ireturn         
			else
				return extensionBuilder_.getCount();
		//    7   17:aload_0         
		//    8   18:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//    9   21:invokevirtual   #556 <Method int RepeatedFieldBuilderV3.getCount()>
		//   10   24:ireturn         
		}

		public List getExtensionList()
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       15
				return Collections.unmodifiableList(extension_);
		//    3    7:aload_0         
		//    4    8:getfield        #86  <Field List extension_>
		//    5   11:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//    6   14:areturn         
			else
				return extensionBuilder_.getMessageList();
		//    7   15:aload_0         
		//    8   16:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//    9   19:invokevirtual   #560 <Method List RepeatedFieldBuilderV3.getMessageList()>
		//   10   22:areturn         
		}

		public DescriptorProtos.FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.FieldDescriptorProtoOrBuilder)extension_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #86  <Field List extension_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #537 <Method Object List.get(int)>
		//    7   17:checkcast       #586 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.FieldDescriptorProtoOrBuilder)extensionBuilder_.getMessageOrBuilder(i);
		//    9   21:aload_0         
		//   10   22:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #569 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
		//   13   29:checkcast       #586 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
		//   14   32:areturn         
		}

		public List getExtensionOrBuilderList()
		{
			if(extensionBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnull          15
				return extensionBuilder_.getMessageOrBuilderList();
		//    3    7:aload_0         
		//    4    8:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//    5   11:invokevirtual   #573 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
		//    6   14:areturn         
			else
				return Collections.unmodifiableList(extension_);
		//    7   15:aload_0         
		//    8   16:getfield        #86  <Field List extension_>
		//    9   19:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//   10   22:areturn         
		}

		public DescriptorProtos.DescriptorProto getMessageType(int i)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.DescriptorProto)messageType_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #80  <Field List messageType_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #537 <Method Object List.get(int)>
		//    7   17:checkcast       #323 <Class DescriptorProtos$DescriptorProto>
		//    8   20:areturn         
			else
				return (DescriptorProtos.DescriptorProto)messageTypeBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #541 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #323 <Class DescriptorProtos$DescriptorProto>
		//   14   32:areturn         
		}

		public DescriptorProtos.DescriptorProto.Builder getMessageTypeBuilder(int i)
		{
			return (DescriptorProtos.DescriptorProto.Builder)getMessageTypeFieldBuilder().getBuilder(i);
		//    0    0:aload_0         
		//    1    1:invokespecial   #186 <Method RepeatedFieldBuilderV3 getMessageTypeFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #546 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
		//    4    8:checkcast       #313 <Class DescriptorProtos$DescriptorProto$Builder>
		//    5   11:areturn         
		}

		public List getMessageTypeBuilderList()
		{
			return getMessageTypeFieldBuilder().getBuilderList();
		//    0    0:aload_0         
		//    1    1:invokespecial   #186 <Method RepeatedFieldBuilderV3 getMessageTypeFieldBuilder()>
		//    2    4:invokevirtual   #550 <Method List RepeatedFieldBuilderV3.getBuilderList()>
		//    3    7:areturn         
		}

		public int getMessageTypeCount()
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       17
				return messageType_.size();
		//    3    7:aload_0         
		//    4    8:getfield        #80  <Field List messageType_>
		//    5   11:invokeinterface #553 <Method int List.size()>
		//    6   16:ireturn         
			else
				return messageTypeBuilder_.getCount();
		//    7   17:aload_0         
		//    8   18:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//    9   21:invokevirtual   #556 <Method int RepeatedFieldBuilderV3.getCount()>
		//   10   24:ireturn         
		}

		public List getMessageTypeList()
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       15
				return Collections.unmodifiableList(messageType_);
		//    3    7:aload_0         
		//    4    8:getfield        #80  <Field List messageType_>
		//    5   11:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//    6   14:areturn         
			else
				return messageTypeBuilder_.getMessageList();
		//    7   15:aload_0         
		//    8   16:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//    9   19:invokevirtual   #560 <Method List RepeatedFieldBuilderV3.getMessageList()>
		//   10   22:areturn         
		}

		public DescriptorProtos.DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.DescriptorProtoOrBuilder)messageType_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #80  <Field List messageType_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #537 <Method Object List.get(int)>
		//    7   17:checkcast       #600 <Class DescriptorProtos$DescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.DescriptorProtoOrBuilder)messageTypeBuilder_.getMessageOrBuilder(i);
		//    9   21:aload_0         
		//   10   22:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #569 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
		//   13   29:checkcast       #600 <Class DescriptorProtos$DescriptorProtoOrBuilder>
		//   14   32:areturn         
		}

		public List getMessageTypeOrBuilderList()
		{
			if(messageTypeBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnull          15
				return messageTypeBuilder_.getMessageOrBuilderList();
		//    3    7:aload_0         
		//    4    8:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//    5   11:invokevirtual   #573 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
		//    6   14:areturn         
			else
				return Collections.unmodifiableList(messageType_);
		//    7   15:aload_0         
		//    8   16:getfield        #80  <Field List messageType_>
		//    9   19:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//   10   22:areturn         
		}

		public String getName()
		{
			Object obj = name_;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object name_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #519 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #604 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #607 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #610 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					name_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #59  <Field Object name_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #519 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getNameBytes()
		{
			Object obj = name_;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object name_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #519 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #519 <Class String>
		//    8   16:invokestatic    #616 <Method ByteString ByteString.copyFromUtf8(String)>
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
		//   16   28:checkcast       #604 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public DescriptorProtos.FileOptions getOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       23
			{
				if(options_ == null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #88  <Field DescriptorProtos$FileOptions options_>
		//*   5   11:ifnonnull       18
					return DescriptorProtos.FileOptions.getDefaultInstance();
		//    6   14:invokestatic    #618 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//    7   17:areturn         
				else
					return options_;
		//    8   18:aload_0         
		//    9   19:getfield        #88  <Field DescriptorProtos$FileOptions options_>
		//   10   22:areturn         
			} else
			{
				return (DescriptorProtos.FileOptions)optionsBuilder_.getMessage();
		//   11   23:aload_0         
		//   12   24:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//   13   27:invokevirtual   #620 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
		//   14   30:checkcast       #427 <Class DescriptorProtos$FileOptions>
		//   15   33:areturn         
			}
		}

		public DescriptorProtos.FileOptions.Builder getOptionsBuilder()
		{
			bitField0_ = bitField0_ | 0x200;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #106 <Field int bitField0_>
		//    3    5:sipush          512
		//    4    8:ior             
		//    5    9:putfield        #106 <Field int bitField0_>
			onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #209 <Method void onChanged()>
			return (DescriptorProtos.FileOptions.Builder)getOptionsFieldBuilder().getBuilder();
		//    8   16:aload_0         
		//    9   17:invokespecial   #194 <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//   10   20:invokevirtual   #624 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
		//   11   23:checkcast       #626 <Class DescriptorProtos$FileOptions$Builder>
		//   12   26:areturn         
		}

		public DescriptorProtos.FileOptionsOrBuilder getOptionsOrBuilder()
		{
			if(optionsBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnull          18
				return (DescriptorProtos.FileOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
		//    3    7:aload_0         
		//    4    8:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//    5   11:invokevirtual   #631 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
		//    6   14:checkcast       #633 <Class DescriptorProtos$FileOptionsOrBuilder>
		//    7   17:areturn         
			if(options_ == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #88  <Field DescriptorProtos$FileOptions options_>
		//*  10   22:ifnonnull       29
				return ((DescriptorProtos.FileOptionsOrBuilder) (DescriptorProtos.FileOptions.getDefaultInstance()));
		//   11   25:invokestatic    #618 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//   12   28:areturn         
			else
				return ((DescriptorProtos.FileOptionsOrBuilder) (options_));
		//   13   29:aload_0         
		//   14   30:getfield        #88  <Field DescriptorProtos$FileOptions options_>
		//   15   33:areturn         
		}

		public String getPackage()
		{
			Object obj = package_;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field Object package_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #519 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #604 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #607 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #610 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					package_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #61  <Field Object package_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #519 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getPackageBytes()
		{
			Object obj = package_;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field Object package_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #519 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #519 <Class String>
		//    8   16:invokestatic    #616 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				package_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #61  <Field Object package_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #604 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public int getPublicDependency(int i)
		{
			return ((Integer)publicDependency_.get(i)).intValue();
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field List publicDependency_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #537 <Method Object List.get(int)>
		//    4   10:checkcast       #330 <Class Integer>
		//    5   13:invokevirtual   #639 <Method int Integer.intValue()>
		//    6   16:ireturn         
		}

		public int getPublicDependencyCount()
		{
			return publicDependency_.size();
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field List publicDependency_>
		//    2    4:invokeinterface #553 <Method int List.size()>
		//    3    9:ireturn         
		}

		public List getPublicDependencyList()
		{
			return Collections.unmodifiableList(publicDependency_);
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field List publicDependency_>
		//    2    4:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//    3    7:areturn         
		}

		public DescriptorProtos.ServiceDescriptorProto getService(int i)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.ServiceDescriptorProto)service_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #84  <Field List service_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #537 <Method Object List.get(int)>
		//    7   17:checkcast       #356 <Class DescriptorProtos$ServiceDescriptorProto>
		//    8   20:areturn         
			else
				return (DescriptorProtos.ServiceDescriptorProto)serviceBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #541 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #356 <Class DescriptorProtos$ServiceDescriptorProto>
		//   14   32:areturn         
		}

		public DescriptorProtos.ServiceDescriptorProto.Builder getServiceBuilder(int i)
		{
			return (DescriptorProtos.ServiceDescriptorProto.Builder)getServiceFieldBuilder().getBuilder(i);
		//    0    0:aload_0         
		//    1    1:invokespecial   #190 <Method RepeatedFieldBuilderV3 getServiceFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #546 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
		//    4    8:checkcast       #346 <Class DescriptorProtos$ServiceDescriptorProto$Builder>
		//    5   11:areturn         
		}

		public List getServiceBuilderList()
		{
			return getServiceFieldBuilder().getBuilderList();
		//    0    0:aload_0         
		//    1    1:invokespecial   #190 <Method RepeatedFieldBuilderV3 getServiceFieldBuilder()>
		//    2    4:invokevirtual   #550 <Method List RepeatedFieldBuilderV3.getBuilderList()>
		//    3    7:areturn         
		}

		public int getServiceCount()
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       17
				return service_.size();
		//    3    7:aload_0         
		//    4    8:getfield        #84  <Field List service_>
		//    5   11:invokeinterface #553 <Method int List.size()>
		//    6   16:ireturn         
			else
				return serviceBuilder_.getCount();
		//    7   17:aload_0         
		//    8   18:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//    9   21:invokevirtual   #556 <Method int RepeatedFieldBuilderV3.getCount()>
		//   10   24:ireturn         
		}

		public List getServiceList()
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       15
				return Collections.unmodifiableList(service_);
		//    3    7:aload_0         
		//    4    8:getfield        #84  <Field List service_>
		//    5   11:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//    6   14:areturn         
			else
				return serviceBuilder_.getMessageList();
		//    7   15:aload_0         
		//    8   16:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//    9   19:invokevirtual   #560 <Method List RepeatedFieldBuilderV3.getMessageList()>
		//   10   22:areturn         
		}

		public DescriptorProtos.ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int i)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.ServiceDescriptorProtoOrBuilder)service_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #84  <Field List service_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #537 <Method Object List.get(int)>
		//    7   17:checkcast       #654 <Class DescriptorProtos$ServiceDescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.ServiceDescriptorProtoOrBuilder)serviceBuilder_.getMessageOrBuilder(i);
		//    9   21:aload_0         
		//   10   22:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #569 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
		//   13   29:checkcast       #654 <Class DescriptorProtos$ServiceDescriptorProtoOrBuilder>
		//   14   32:areturn         
		}

		public List getServiceOrBuilderList()
		{
			if(serviceBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnull          15
				return serviceBuilder_.getMessageOrBuilderList();
		//    3    7:aload_0         
		//    4    8:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//    5   11:invokevirtual   #573 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
		//    6   14:areturn         
			else
				return Collections.unmodifiableList(service_);
		//    7   15:aload_0         
		//    8   16:getfield        #84  <Field List service_>
		//    9   19:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//   10   22:areturn         
		}

		public DescriptorProtos.SourceCodeInfo getSourceCodeInfo()
		{
			if(sourceCodeInfoBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//*   2    4:ifnonnull       23
			{
				if(sourceCodeInfo_ == null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		//*   5   11:ifnonnull       18
					return DescriptorProtos.SourceCodeInfo.getDefaultInstance();
		//    6   14:invokestatic    #658 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo.getDefaultInstance()>
		//    7   17:areturn         
				else
					return sourceCodeInfo_;
		//    8   18:aload_0         
		//    9   19:getfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		//   10   22:areturn         
			} else
			{
				return (DescriptorProtos.SourceCodeInfo)sourceCodeInfoBuilder_.getMessage();
		//   11   23:aload_0         
		//   12   24:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//   13   27:invokevirtual   #620 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
		//   14   30:checkcast       #433 <Class DescriptorProtos$SourceCodeInfo>
		//   15   33:areturn         
			}
		}

		public DescriptorProtos.SourceCodeInfo.Builder getSourceCodeInfoBuilder()
		{
			bitField0_ = bitField0_ | 0x400;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #106 <Field int bitField0_>
		//    3    5:sipush          1024
		//    4    8:ior             
		//    5    9:putfield        #106 <Field int bitField0_>
			onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #209 <Method void onChanged()>
			return (DescriptorProtos.SourceCodeInfo.Builder)getSourceCodeInfoFieldBuilder().getBuilder();
		//    8   16:aload_0         
		//    9   17:invokespecial   #196 <Method SingleFieldBuilderV3 getSourceCodeInfoFieldBuilder()>
		//   10   20:invokevirtual   #624 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
		//   11   23:checkcast       #662 <Class DescriptorProtos$SourceCodeInfo$Builder>
		//   12   26:areturn         
		}

		public DescriptorProtos.SourceCodeInfoOrBuilder getSourceCodeInfoOrBuilder()
		{
			if(sourceCodeInfoBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//*   2    4:ifnull          18
				return (DescriptorProtos.SourceCodeInfoOrBuilder)sourceCodeInfoBuilder_.getMessageOrBuilder();
		//    3    7:aload_0         
		//    4    8:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//    5   11:invokevirtual   #631 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
		//    6   14:checkcast       #666 <Class DescriptorProtos$SourceCodeInfoOrBuilder>
		//    7   17:areturn         
			if(sourceCodeInfo_ == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		//*  10   22:ifnonnull       29
				return ((DescriptorProtos.SourceCodeInfoOrBuilder) (DescriptorProtos.SourceCodeInfo.getDefaultInstance()));
		//   11   25:invokestatic    #658 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo.getDefaultInstance()>
		//   12   28:areturn         
			else
				return ((DescriptorProtos.SourceCodeInfoOrBuilder) (sourceCodeInfo_));
		//   13   29:aload_0         
		//   14   30:getfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		//   15   33:areturn         
		}

		public String getSyntax()
		{
			Object obj = syntax_;
		//    0    0:aload_0         
		//    1    1:getfield        #92  <Field Object syntax_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #519 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #604 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #607 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #610 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					syntax_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #92  <Field Object syntax_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #519 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getSyntaxBytes()
		{
			Object obj = syntax_;
		//    0    0:aload_0         
		//    1    1:getfield        #92  <Field Object syntax_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #519 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #519 <Class String>
		//    8   16:invokestatic    #616 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				syntax_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #92  <Field Object syntax_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #604 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public int getWeakDependency(int i)
		{
			return ((Integer)weakDependency_.get(i)).intValue();
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field List weakDependency_>
		//    2    4:iload_1         
		//    3    5:invokeinterface #537 <Method Object List.get(int)>
		//    4   10:checkcast       #330 <Class Integer>
		//    5   13:invokevirtual   #639 <Method int Integer.intValue()>
		//    6   16:ireturn         
		}

		public int getWeakDependencyCount()
		{
			return weakDependency_.size();
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field List weakDependency_>
		//    2    4:invokeinterface #553 <Method int List.size()>
		//    3    9:ireturn         
		}

		public List getWeakDependencyList()
		{
			return Collections.unmodifiableList(weakDependency_);
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field List weakDependency_>
		//    2    4:invokestatic    #397 <Method List Collections.unmodifiableList(List)>
		//    3    7:areturn         
		}

		public boolean hasName()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #106 <Field int bitField0_>
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
			return (bitField0_ & 0x200) == 512;
		//    0    0:aload_0         
		//    1    1:getfield        #106 <Field int bitField0_>
		//    2    4:sipush          512
		//    3    7:iand            
		//    4    8:sipush          512
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasPackage()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #106 <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasSourceCodeInfo()
		{
			return (bitField0_ & 0x400) == 1024;
		//    0    0:aload_0         
		//    1    1:getfield        #106 <Field int bitField0_>
		//    2    4:sipush          1024
		//    3    7:iand            
		//    4    8:sipush          1024
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean hasSyntax()
		{
			return (bitField0_ & 0x800) == 2048;
		//    0    0:aload_0         
		//    1    1:getfield        #106 <Field int bitField0_>
		//    2    4:sipush          2048
		//    3    7:iand            
		//    4    8:sipush          2048
		//    5   11:icmpne          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$800().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FileDescriptorProto, com/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder);
		//    0    0:invokestatic    #680 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$800()>
		//    1    3:ldc1            #9   <Class DescriptorProtos$FileDescriptorProto>
		//    2    5:ldc1            #2   <Class DescriptorProtos$FileDescriptorProto$Builder>
		//    3    7:invokevirtual   #686 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			for(int i = 0; i < getMessageTypeCount(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_1        
		//*   2    2:iload_1         
		//*   3    3:aload_0         
		//*   4    4:invokevirtual   #688 <Method int getMessageTypeCount()>
		//*   5    7:icmpge          30
				if(!getMessageType(i).isInitialized())
		//*   6   10:aload_0         
		//*   7   11:iload_1         
		//*   8   12:invokevirtual   #690 <Method DescriptorProtos$DescriptorProto getMessageType(int)>
		//*   9   15:invokevirtual   #691 <Method boolean DescriptorProtos$DescriptorProto.isInitialized()>
		//*  10   18:ifne            23
					return false;
		//   11   21:iconst_0        
		//   12   22:ireturn         

		//   13   23:iload_1         
		//   14   24:iconst_1        
		//   15   25:iadd            
		//   16   26:istore_1        
		//*  17   27:goto            2
			for(int j = 0; j < getEnumTypeCount(); j++)
		//*  18   30:iconst_0        
		//*  19   31:istore_1        
		//*  20   32:iload_1         
		//*  21   33:aload_0         
		//*  22   34:invokevirtual   #693 <Method int getEnumTypeCount()>
		//*  23   37:icmpge          60
				if(!getEnumType(j).isInitialized())
		//*  24   40:aload_0         
		//*  25   41:iload_1         
		//*  26   42:invokevirtual   #695 <Method DescriptorProtos$EnumDescriptorProto getEnumType(int)>
		//*  27   45:invokevirtual   #696 <Method boolean DescriptorProtos$EnumDescriptorProto.isInitialized()>
		//*  28   48:ifne            53
					return false;
		//   29   51:iconst_0        
		//   30   52:ireturn         

		//   31   53:iload_1         
		//   32   54:iconst_1        
		//   33   55:iadd            
		//   34   56:istore_1        
		//*  35   57:goto            32
			for(int k = 0; k < getServiceCount(); k++)
		//*  36   60:iconst_0        
		//*  37   61:istore_1        
		//*  38   62:iload_1         
		//*  39   63:aload_0         
		//*  40   64:invokevirtual   #698 <Method int getServiceCount()>
		//*  41   67:icmpge          90
				if(!getService(k).isInitialized())
		//*  42   70:aload_0         
		//*  43   71:iload_1         
		//*  44   72:invokevirtual   #700 <Method DescriptorProtos$ServiceDescriptorProto getService(int)>
		//*  45   75:invokevirtual   #701 <Method boolean DescriptorProtos$ServiceDescriptorProto.isInitialized()>
		//*  46   78:ifne            83
					return false;
		//   47   81:iconst_0        
		//   48   82:ireturn         

		//   49   83:iload_1         
		//   50   84:iconst_1        
		//   51   85:iadd            
		//   52   86:istore_1        
		//*  53   87:goto            62
			for(int l = 0; l < getExtensionCount(); l++)
		//*  54   90:iconst_0        
		//*  55   91:istore_1        
		//*  56   92:iload_1         
		//*  57   93:aload_0         
		//*  58   94:invokevirtual   #703 <Method int getExtensionCount()>
		//*  59   97:icmpge          120
				if(!getExtension(l).isInitialized())
		//*  60  100:aload_0         
		//*  61  101:iload_1         
		//*  62  102:invokevirtual   #705 <Method DescriptorProtos$FieldDescriptorProto getExtension(int)>
		//*  63  105:invokevirtual   #706 <Method boolean DescriptorProtos$FieldDescriptorProto.isInitialized()>
		//*  64  108:ifne            113
					return false;
		//   65  111:iconst_0        
		//   66  112:ireturn         

		//   67  113:iload_1         
		//   68  114:iconst_1        
		//   69  115:iadd            
		//   70  116:istore_1        
		//*  71  117:goto            92
			return !hasOptions() || getOptions().isInitialized();
		//   72  120:aload_0         
		//   73  121:invokevirtual   #708 <Method boolean hasOptions()>
		//   74  124:ifeq            139
		//   75  127:aload_0         
		//   76  128:invokevirtual   #162 <Method DescriptorProtos$FileOptions getOptions()>
		//   77  131:invokevirtual   #709 <Method boolean DescriptorProtos$FileOptions.isInitialized()>
		//   78  134:ifne            139
		//   79  137:iconst_0        
		//   80  138:ireturn         
		//   81  139:iconst_1        
		//   82  140:ireturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #716 <Method DescriptorProtos$FileDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #720 <Method DescriptorProtos$FileDescriptorProto$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #716 <Method DescriptorProtos$FileDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.FileDescriptorProto)DescriptorProtos.FileDescriptorProto.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #727 <Field Parser DescriptorProtos$FileDescriptorProto.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #733 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class DescriptorProtos$FileDescriptorProto>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.FileDescriptorProto) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #736 <Method DescriptorProtos$FileDescriptorProto$Builder mergeFrom(DescriptorProtos$FileDescriptorProto)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #739 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class DescriptorProtos$FileDescriptorProto>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #743 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #736 <Method DescriptorProtos$FileDescriptorProto$Builder mergeFrom(DescriptorProtos$FileDescriptorProto)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.FileDescriptorProto)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.FileDescriptorProto) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.FileDescriptorProto filedescriptorproto)
		{
			if(filedescriptorproto == DescriptorProtos.FileDescriptorProto.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #472 <Method DescriptorProtos$FileDescriptorProto DescriptorProtos$FileDescriptorProto.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(filedescriptorproto.hasName())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #745 <Method boolean DescriptorProtos$FileDescriptorProto.hasName()>
		//*   7   13:ifeq            38
			{
				bitField0_ = bitField0_ | 1;
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #106 <Field int bitField0_>
		//   11   21:iconst_1        
		//   12   22:ior             
		//   13   23:putfield        #106 <Field int bitField0_>
				name_ = filedescriptorproto.name_;
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokestatic    #749 <Method Object DescriptorProtos$FileDescriptorProto.access$1200(DescriptorProtos$FileDescriptorProto)>
		//   17   31:putfield        #59  <Field Object name_>
				onChanged();
		//   18   34:aload_0         
		//   19   35:invokevirtual   #209 <Method void onChanged()>
			}
			if(filedescriptorproto.hasPackage())
		//*  20   38:aload_1         
		//*  21   39:invokevirtual   #751 <Method boolean DescriptorProtos$FileDescriptorProto.hasPackage()>
		//*  22   42:ifeq            67
			{
				bitField0_ = bitField0_ | 2;
		//   23   45:aload_0         
		//   24   46:aload_0         
		//   25   47:getfield        #106 <Field int bitField0_>
		//   26   50:iconst_2        
		//   27   51:ior             
		//   28   52:putfield        #106 <Field int bitField0_>
				package_ = filedescriptorproto.package_;
		//   29   55:aload_0         
		//   30   56:aload_1         
		//   31   57:invokestatic    #754 <Method Object DescriptorProtos$FileDescriptorProto.access$1300(DescriptorProtos$FileDescriptorProto)>
		//   32   60:putfield        #61  <Field Object package_>
				onChanged();
		//   33   63:aload_0         
		//   34   64:invokevirtual   #209 <Method void onChanged()>
			}
			if(!filedescriptorproto.dependency_.isEmpty())
		//*  35   67:aload_1         
		//*  36   68:invokestatic    #758 <Method LazyStringList DescriptorProtos$FileDescriptorProto.access$1400(DescriptorProtos$FileDescriptorProto)>
		//*  37   71:invokeinterface #761 <Method boolean LazyStringList.isEmpty()>
		//*  38   76:ifne            135
			{
				if(dependency_.isEmpty())
		//*  39   79:aload_0         
		//*  40   80:getfield        #68  <Field LazyStringList dependency_>
		//*  41   83:invokeinterface #761 <Method boolean LazyStringList.isEmpty()>
		//*  42   88:ifeq            113
				{
					dependency_ = filedescriptorproto.dependency_;
		//   43   91:aload_0         
		//   44   92:aload_1         
		//   45   93:invokestatic    #758 <Method LazyStringList DescriptorProtos$FileDescriptorProto.access$1400(DescriptorProtos$FileDescriptorProto)>
		//   46   96:putfield        #68  <Field LazyStringList dependency_>
					bitField0_ = bitField0_ & -5;
		//   47   99:aload_0         
		//   48  100:aload_0         
		//   49  101:getfield        #106 <Field int bitField0_>
		//   50  104:bipush          -5
		//   51  106:iand            
		//   52  107:putfield        #106 <Field int bitField0_>
				} else
		//*  53  110:goto            131
				{
					ensureDependencyIsMutable();
		//   54  113:aload_0         
		//   55  114:invokespecial   #200 <Method void ensureDependencyIsMutable()>
					dependency_.addAll(((java.util.Collection) (filedescriptorproto.dependency_)));
		//   56  117:aload_0         
		//   57  118:getfield        #68  <Field LazyStringList dependency_>
		//   58  121:aload_1         
		//   59  122:invokestatic    #758 <Method LazyStringList DescriptorProtos$FileDescriptorProto.access$1400(DescriptorProtos$FileDescriptorProto)>
		//   60  125:invokeinterface #764 <Method boolean LazyStringList.addAll(java.util.Collection)>
		//   61  130:pop             
				}
				onChanged();
		//   62  131:aload_0         
		//   63  132:invokevirtual   #209 <Method void onChanged()>
			}
			if(!filedescriptorproto.publicDependency_.isEmpty())
		//*  64  135:aload_1         
		//*  65  136:invokestatic    #768 <Method List DescriptorProtos$FileDescriptorProto.access$1500(DescriptorProtos$FileDescriptorProto)>
		//*  66  139:invokeinterface #769 <Method boolean List.isEmpty()>
		//*  67  144:ifne            203
			{
				if(publicDependency_.isEmpty())
		//*  68  147:aload_0         
		//*  69  148:getfield        #76  <Field List publicDependency_>
		//*  70  151:invokeinterface #769 <Method boolean List.isEmpty()>
		//*  71  156:ifeq            181
				{
					publicDependency_ = filedescriptorproto.publicDependency_;
		//   72  159:aload_0         
		//   73  160:aload_1         
		//   74  161:invokestatic    #768 <Method List DescriptorProtos$FileDescriptorProto.access$1500(DescriptorProtos$FileDescriptorProto)>
		//   75  164:putfield        #76  <Field List publicDependency_>
					bitField0_ = bitField0_ & -9;
		//   76  167:aload_0         
		//   77  168:aload_0         
		//   78  169:getfield        #106 <Field int bitField0_>
		//   79  172:bipush          -9
		//   80  174:iand            
		//   81  175:putfield        #106 <Field int bitField0_>
				} else
		//*  82  178:goto            199
				{
					ensurePublicDependencyIsMutable();
		//   83  181:aload_0         
		//   84  182:invokespecial   #229 <Method void ensurePublicDependencyIsMutable()>
					publicDependency_.addAll(((java.util.Collection) (filedescriptorproto.publicDependency_)));
		//   85  185:aload_0         
		//   86  186:getfield        #76  <Field List publicDependency_>
		//   87  189:aload_1         
		//   88  190:invokestatic    #768 <Method List DescriptorProtos$FileDescriptorProto.access$1500(DescriptorProtos$FileDescriptorProto)>
		//   89  193:invokeinterface #770 <Method boolean List.addAll(java.util.Collection)>
		//   90  198:pop             
				}
				onChanged();
		//   91  199:aload_0         
		//   92  200:invokevirtual   #209 <Method void onChanged()>
			}
			if(!filedescriptorproto.weakDependency_.isEmpty())
		//*  93  203:aload_1         
		//*  94  204:invokestatic    #773 <Method List DescriptorProtos$FileDescriptorProto.access$1600(DescriptorProtos$FileDescriptorProto)>
		//*  95  207:invokeinterface #769 <Method boolean List.isEmpty()>
		//*  96  212:ifne            271
			{
				if(weakDependency_.isEmpty())
		//*  97  215:aload_0         
		//*  98  216:getfield        #78  <Field List weakDependency_>
		//*  99  219:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 100  224:ifeq            249
				{
					weakDependency_ = filedescriptorproto.weakDependency_;
		//  101  227:aload_0         
		//  102  228:aload_1         
		//  103  229:invokestatic    #773 <Method List DescriptorProtos$FileDescriptorProto.access$1600(DescriptorProtos$FileDescriptorProto)>
		//  104  232:putfield        #78  <Field List weakDependency_>
					bitField0_ = bitField0_ & 0xffffffef;
		//  105  235:aload_0         
		//  106  236:aload_0         
		//  107  237:getfield        #106 <Field int bitField0_>
		//  108  240:bipush          -17
		//  109  242:iand            
		//  110  243:putfield        #106 <Field int bitField0_>
				} else
		//* 111  246:goto            267
				{
					ensureWeakDependencyIsMutable();
		//  112  249:aload_0         
		//  113  250:invokespecial   #237 <Method void ensureWeakDependencyIsMutable()>
					weakDependency_.addAll(((java.util.Collection) (filedescriptorproto.weakDependency_)));
		//  114  253:aload_0         
		//  115  254:getfield        #78  <Field List weakDependency_>
		//  116  257:aload_1         
		//  117  258:invokestatic    #773 <Method List DescriptorProtos$FileDescriptorProto.access$1600(DescriptorProtos$FileDescriptorProto)>
		//  118  261:invokeinterface #770 <Method boolean List.addAll(java.util.Collection)>
		//  119  266:pop             
				}
				onChanged();
		//  120  267:aload_0         
		//  121  268:invokevirtual   #209 <Method void onChanged()>
			}
			if(messageTypeBuilder_ == null)
		//* 122  271:aload_0         
		//* 123  272:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//* 124  275:ifnonnull       349
			{
				if(!filedescriptorproto.messageType_.isEmpty())
		//* 125  278:aload_1         
		//* 126  279:invokestatic    #776 <Method List DescriptorProtos$FileDescriptorProto.access$1700(DescriptorProtos$FileDescriptorProto)>
		//* 127  282:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 128  287:ifne            438
				{
					if(messageType_.isEmpty())
		//* 129  290:aload_0         
		//* 130  291:getfield        #80  <Field List messageType_>
		//* 131  294:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 132  299:ifeq            324
					{
						messageType_ = filedescriptorproto.messageType_;
		//  133  302:aload_0         
		//  134  303:aload_1         
		//  135  304:invokestatic    #776 <Method List DescriptorProtos$FileDescriptorProto.access$1700(DescriptorProtos$FileDescriptorProto)>
		//  136  307:putfield        #80  <Field List messageType_>
						bitField0_ = bitField0_ & 0xffffffdf;
		//  137  310:aload_0         
		//  138  311:aload_0         
		//  139  312:getfield        #106 <Field int bitField0_>
		//  140  315:bipush          -33
		//  141  317:iand            
		//  142  318:putfield        #106 <Field int bitField0_>
					} else
		//* 143  321:goto            342
					{
						ensureMessageTypeIsMutable();
		//  144  324:aload_0         
		//  145  325:invokespecial   #225 <Method void ensureMessageTypeIsMutable()>
						messageType_.addAll(((java.util.Collection) (filedescriptorproto.messageType_)));
		//  146  328:aload_0         
		//  147  329:getfield        #80  <Field List messageType_>
		//  148  332:aload_1         
		//  149  333:invokestatic    #776 <Method List DescriptorProtos$FileDescriptorProto.access$1700(DescriptorProtos$FileDescriptorProto)>
		//  150  336:invokeinterface #770 <Method boolean List.addAll(java.util.Collection)>
		//  151  341:pop             
					}
					onChanged();
		//  152  342:aload_0         
		//  153  343:invokevirtual   #209 <Method void onChanged()>
				}
			} else
		//* 154  346:goto            438
			if(!filedescriptorproto.messageType_.isEmpty())
		//* 155  349:aload_1         
		//* 156  350:invokestatic    #776 <Method List DescriptorProtos$FileDescriptorProto.access$1700(DescriptorProtos$FileDescriptorProto)>
		//* 157  353:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 158  358:ifne            438
				if(messageTypeBuilder_.isEmpty())
		//* 159  361:aload_0         
		//* 160  362:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//* 161  365:invokevirtual   #777 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
		//* 162  368:ifeq            426
				{
					messageTypeBuilder_.dispose();
		//  163  371:aload_0         
		//  164  372:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//  165  375:invokevirtual   #780 <Method void RepeatedFieldBuilderV3.dispose()>
					messageTypeBuilder_ = null;
		//  166  378:aload_0         
		//  167  379:aconst_null     
		//  168  380:putfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
					messageType_ = filedescriptorproto.messageType_;
		//  169  383:aload_0         
		//  170  384:aload_1         
		//  171  385:invokestatic    #776 <Method List DescriptorProtos$FileDescriptorProto.access$1700(DescriptorProtos$FileDescriptorProto)>
		//  172  388:putfield        #80  <Field List messageType_>
					bitField0_ = bitField0_ & 0xffffffdf;
		//  173  391:aload_0         
		//  174  392:aload_0         
		//  175  393:getfield        #106 <Field int bitField0_>
		//  176  396:bipush          -33
		//  177  398:iand            
		//  178  399:putfield        #106 <Field int bitField0_>
					RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
					if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//* 179  402:getstatic       #184 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//* 180  405:ifeq            416
						repeatedfieldbuilderv3 = getMessageTypeFieldBuilder();
		//  181  408:aload_0         
		//  182  409:invokespecial   #186 <Method RepeatedFieldBuilderV3 getMessageTypeFieldBuilder()>
		//  183  412:astore_2        
					else
		//* 184  413:goto            418
						repeatedfieldbuilderv3 = null;
		//  185  416:aconst_null     
		//  186  417:astore_2        
					messageTypeBuilder_ = repeatedfieldbuilderv3;
		//  187  418:aload_0         
		//  188  419:aload_2         
		//  189  420:putfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
				} else
		//* 190  423:goto            438
				{
					messageTypeBuilder_.addAllMessages(((Iterable) (filedescriptorproto.messageType_)));
		//  191  426:aload_0         
		//  192  427:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//  193  430:aload_1         
		//  194  431:invokestatic    #776 <Method List DescriptorProtos$FileDescriptorProto.access$1700(DescriptorProtos$FileDescriptorProto)>
		//  195  434:invokevirtual   #217 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//  196  437:pop             
				}
			if(enumTypeBuilder_ == null)
		//* 197  438:aload_0         
		//* 198  439:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//* 199  442:ifnonnull       516
			{
				if(!filedescriptorproto.enumType_.isEmpty())
		//* 200  445:aload_1         
		//* 201  446:invokestatic    #783 <Method List DescriptorProtos$FileDescriptorProto.access$1800(DescriptorProtos$FileDescriptorProto)>
		//* 202  449:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 203  454:ifne            605
				{
					if(enumType_.isEmpty())
		//* 204  457:aload_0         
		//* 205  458:getfield        #82  <Field List enumType_>
		//* 206  461:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 207  466:ifeq            491
					{
						enumType_ = filedescriptorproto.enumType_;
		//  208  469:aload_0         
		//  209  470:aload_1         
		//  210  471:invokestatic    #783 <Method List DescriptorProtos$FileDescriptorProto.access$1800(DescriptorProtos$FileDescriptorProto)>
		//  211  474:putfield        #82  <Field List enumType_>
						bitField0_ = bitField0_ & 0xffffffbf;
		//  212  477:aload_0         
		//  213  478:aload_0         
		//  214  479:getfield        #106 <Field int bitField0_>
		//  215  482:bipush          -65
		//  216  484:iand            
		//  217  485:putfield        #106 <Field int bitField0_>
					} else
		//* 218  488:goto            509
					{
						ensureEnumTypeIsMutable();
		//  219  491:aload_0         
		//  220  492:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
						enumType_.addAll(((java.util.Collection) (filedescriptorproto.enumType_)));
		//  221  495:aload_0         
		//  222  496:getfield        #82  <Field List enumType_>
		//  223  499:aload_1         
		//  224  500:invokestatic    #783 <Method List DescriptorProtos$FileDescriptorProto.access$1800(DescriptorProtos$FileDescriptorProto)>
		//  225  503:invokeinterface #770 <Method boolean List.addAll(java.util.Collection)>
		//  226  508:pop             
					}
					onChanged();
		//  227  509:aload_0         
		//  228  510:invokevirtual   #209 <Method void onChanged()>
				}
			} else
		//* 229  513:goto            605
			if(!filedescriptorproto.enumType_.isEmpty())
		//* 230  516:aload_1         
		//* 231  517:invokestatic    #783 <Method List DescriptorProtos$FileDescriptorProto.access$1800(DescriptorProtos$FileDescriptorProto)>
		//* 232  520:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 233  525:ifne            605
				if(enumTypeBuilder_.isEmpty())
		//* 234  528:aload_0         
		//* 235  529:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//* 236  532:invokevirtual   #777 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
		//* 237  535:ifeq            593
				{
					enumTypeBuilder_.dispose();
		//  238  538:aload_0         
		//  239  539:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//  240  542:invokevirtual   #780 <Method void RepeatedFieldBuilderV3.dispose()>
					enumTypeBuilder_ = null;
		//  241  545:aload_0         
		//  242  546:aconst_null     
		//  243  547:putfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
					enumType_ = filedescriptorproto.enumType_;
		//  244  550:aload_0         
		//  245  551:aload_1         
		//  246  552:invokestatic    #783 <Method List DescriptorProtos$FileDescriptorProto.access$1800(DescriptorProtos$FileDescriptorProto)>
		//  247  555:putfield        #82  <Field List enumType_>
					bitField0_ = bitField0_ & 0xffffffbf;
		//  248  558:aload_0         
		//  249  559:aload_0         
		//  250  560:getfield        #106 <Field int bitField0_>
		//  251  563:bipush          -65
		//  252  565:iand            
		//  253  566:putfield        #106 <Field int bitField0_>
					RepeatedFieldBuilderV3 repeatedfieldbuilderv3_1;
					if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//* 254  569:getstatic       #184 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//* 255  572:ifeq            583
						repeatedfieldbuilderv3_1 = getEnumTypeFieldBuilder();
		//  256  575:aload_0         
		//  257  576:invokespecial   #188 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
		//  258  579:astore_2        
					else
		//* 259  580:goto            585
						repeatedfieldbuilderv3_1 = null;
		//  260  583:aconst_null     
		//  261  584:astore_2        
					enumTypeBuilder_ = repeatedfieldbuilderv3_1;
		//  262  585:aload_0         
		//  263  586:aload_2         
		//  264  587:putfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
				} else
		//* 265  590:goto            605
				{
					enumTypeBuilder_.addAllMessages(((Iterable) (filedescriptorproto.enumType_)));
		//  266  593:aload_0         
		//  267  594:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//  268  597:aload_1         
		//  269  598:invokestatic    #783 <Method List DescriptorProtos$FileDescriptorProto.access$1800(DescriptorProtos$FileDescriptorProto)>
		//  270  601:invokevirtual   #217 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//  271  604:pop             
				}
			if(serviceBuilder_ == null)
		//* 272  605:aload_0         
		//* 273  606:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//* 274  609:ifnonnull       684
			{
				if(!filedescriptorproto.service_.isEmpty())
		//* 275  612:aload_1         
		//* 276  613:invokestatic    #786 <Method List DescriptorProtos$FileDescriptorProto.access$1900(DescriptorProtos$FileDescriptorProto)>
		//* 277  616:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 278  621:ifne            774
				{
					if(service_.isEmpty())
		//* 279  624:aload_0         
		//* 280  625:getfield        #84  <Field List service_>
		//* 281  628:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 282  633:ifeq            659
					{
						service_ = filedescriptorproto.service_;
		//  283  636:aload_0         
		//  284  637:aload_1         
		//  285  638:invokestatic    #786 <Method List DescriptorProtos$FileDescriptorProto.access$1900(DescriptorProtos$FileDescriptorProto)>
		//  286  641:putfield        #84  <Field List service_>
						bitField0_ = bitField0_ & 0xffffff7f;
		//  287  644:aload_0         
		//  288  645:aload_0         
		//  289  646:getfield        #106 <Field int bitField0_>
		//  290  649:sipush          -129
		//  291  652:iand            
		//  292  653:putfield        #106 <Field int bitField0_>
					} else
		//* 293  656:goto            677
					{
						ensureServiceIsMutable();
		//  294  659:aload_0         
		//  295  660:invokespecial   #233 <Method void ensureServiceIsMutable()>
						service_.addAll(((java.util.Collection) (filedescriptorproto.service_)));
		//  296  663:aload_0         
		//  297  664:getfield        #84  <Field List service_>
		//  298  667:aload_1         
		//  299  668:invokestatic    #786 <Method List DescriptorProtos$FileDescriptorProto.access$1900(DescriptorProtos$FileDescriptorProto)>
		//  300  671:invokeinterface #770 <Method boolean List.addAll(java.util.Collection)>
		//  301  676:pop             
					}
					onChanged();
		//  302  677:aload_0         
		//  303  678:invokevirtual   #209 <Method void onChanged()>
				}
			} else
		//* 304  681:goto            774
			if(!filedescriptorproto.service_.isEmpty())
		//* 305  684:aload_1         
		//* 306  685:invokestatic    #786 <Method List DescriptorProtos$FileDescriptorProto.access$1900(DescriptorProtos$FileDescriptorProto)>
		//* 307  688:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 308  693:ifne            774
				if(serviceBuilder_.isEmpty())
		//* 309  696:aload_0         
		//* 310  697:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//* 311  700:invokevirtual   #777 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
		//* 312  703:ifeq            762
				{
					serviceBuilder_.dispose();
		//  313  706:aload_0         
		//  314  707:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//  315  710:invokevirtual   #780 <Method void RepeatedFieldBuilderV3.dispose()>
					serviceBuilder_ = null;
		//  316  713:aload_0         
		//  317  714:aconst_null     
		//  318  715:putfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
					service_ = filedescriptorproto.service_;
		//  319  718:aload_0         
		//  320  719:aload_1         
		//  321  720:invokestatic    #786 <Method List DescriptorProtos$FileDescriptorProto.access$1900(DescriptorProtos$FileDescriptorProto)>
		//  322  723:putfield        #84  <Field List service_>
					bitField0_ = bitField0_ & 0xffffff7f;
		//  323  726:aload_0         
		//  324  727:aload_0         
		//  325  728:getfield        #106 <Field int bitField0_>
		//  326  731:sipush          -129
		//  327  734:iand            
		//  328  735:putfield        #106 <Field int bitField0_>
					RepeatedFieldBuilderV3 repeatedfieldbuilderv3_2;
					if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//* 329  738:getstatic       #184 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//* 330  741:ifeq            752
						repeatedfieldbuilderv3_2 = getServiceFieldBuilder();
		//  331  744:aload_0         
		//  332  745:invokespecial   #190 <Method RepeatedFieldBuilderV3 getServiceFieldBuilder()>
		//  333  748:astore_2        
					else
		//* 334  749:goto            754
						repeatedfieldbuilderv3_2 = null;
		//  335  752:aconst_null     
		//  336  753:astore_2        
					serviceBuilder_ = repeatedfieldbuilderv3_2;
		//  337  754:aload_0         
		//  338  755:aload_2         
		//  339  756:putfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
				} else
		//* 340  759:goto            774
				{
					serviceBuilder_.addAllMessages(((Iterable) (filedescriptorproto.service_)));
		//  341  762:aload_0         
		//  342  763:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//  343  766:aload_1         
		//  344  767:invokestatic    #786 <Method List DescriptorProtos$FileDescriptorProto.access$1900(DescriptorProtos$FileDescriptorProto)>
		//  345  770:invokevirtual   #217 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//  346  773:pop             
				}
			if(extensionBuilder_ == null)
		//* 347  774:aload_0         
		//* 348  775:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//* 349  778:ifnonnull       853
			{
				if(!filedescriptorproto.extension_.isEmpty())
		//* 350  781:aload_1         
		//* 351  782:invokestatic    #789 <Method List DescriptorProtos$FileDescriptorProto.access$2000(DescriptorProtos$FileDescriptorProto)>
		//* 352  785:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 353  790:ifne            943
				{
					if(extension_.isEmpty())
		//* 354  793:aload_0         
		//* 355  794:getfield        #86  <Field List extension_>
		//* 356  797:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 357  802:ifeq            828
					{
						extension_ = filedescriptorproto.extension_;
		//  358  805:aload_0         
		//  359  806:aload_1         
		//  360  807:invokestatic    #789 <Method List DescriptorProtos$FileDescriptorProto.access$2000(DescriptorProtos$FileDescriptorProto)>
		//  361  810:putfield        #86  <Field List extension_>
						bitField0_ = bitField0_ & 0xfffffeff;
		//  362  813:aload_0         
		//  363  814:aload_0         
		//  364  815:getfield        #106 <Field int bitField0_>
		//  365  818:sipush          -257
		//  366  821:iand            
		//  367  822:putfield        #106 <Field int bitField0_>
					} else
		//* 368  825:goto            846
					{
						ensureExtensionIsMutable();
		//  369  828:aload_0         
		//  370  829:invokespecial   #221 <Method void ensureExtensionIsMutable()>
						extension_.addAll(((java.util.Collection) (filedescriptorproto.extension_)));
		//  371  832:aload_0         
		//  372  833:getfield        #86  <Field List extension_>
		//  373  836:aload_1         
		//  374  837:invokestatic    #789 <Method List DescriptorProtos$FileDescriptorProto.access$2000(DescriptorProtos$FileDescriptorProto)>
		//  375  840:invokeinterface #770 <Method boolean List.addAll(java.util.Collection)>
		//  376  845:pop             
					}
					onChanged();
		//  377  846:aload_0         
		//  378  847:invokevirtual   #209 <Method void onChanged()>
				}
			} else
		//* 379  850:goto            943
			if(!filedescriptorproto.extension_.isEmpty())
		//* 380  853:aload_1         
		//* 381  854:invokestatic    #789 <Method List DescriptorProtos$FileDescriptorProto.access$2000(DescriptorProtos$FileDescriptorProto)>
		//* 382  857:invokeinterface #769 <Method boolean List.isEmpty()>
		//* 383  862:ifne            943
				if(extensionBuilder_.isEmpty())
		//* 384  865:aload_0         
		//* 385  866:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//* 386  869:invokevirtual   #777 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
		//* 387  872:ifeq            931
				{
					extensionBuilder_.dispose();
		//  388  875:aload_0         
		//  389  876:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//  390  879:invokevirtual   #780 <Method void RepeatedFieldBuilderV3.dispose()>
					extensionBuilder_ = null;
		//  391  882:aload_0         
		//  392  883:aconst_null     
		//  393  884:putfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
					extension_ = filedescriptorproto.extension_;
		//  394  887:aload_0         
		//  395  888:aload_1         
		//  396  889:invokestatic    #789 <Method List DescriptorProtos$FileDescriptorProto.access$2000(DescriptorProtos$FileDescriptorProto)>
		//  397  892:putfield        #86  <Field List extension_>
					bitField0_ = bitField0_ & 0xfffffeff;
		//  398  895:aload_0         
		//  399  896:aload_0         
		//  400  897:getfield        #106 <Field int bitField0_>
		//  401  900:sipush          -257
		//  402  903:iand            
		//  403  904:putfield        #106 <Field int bitField0_>
					RepeatedFieldBuilderV3 repeatedfieldbuilderv3_3;
					if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//* 404  907:getstatic       #184 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//* 405  910:ifeq            921
						repeatedfieldbuilderv3_3 = getExtensionFieldBuilder();
		//  406  913:aload_0         
		//  407  914:invokespecial   #192 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
		//  408  917:astore_2        
					else
		//* 409  918:goto            923
						repeatedfieldbuilderv3_3 = null;
		//  410  921:aconst_null     
		//  411  922:astore_2        
					extensionBuilder_ = repeatedfieldbuilderv3_3;
		//  412  923:aload_0         
		//  413  924:aload_2         
		//  414  925:putfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
				} else
		//* 415  928:goto            943
				{
					extensionBuilder_.addAllMessages(((Iterable) (filedescriptorproto.extension_)));
		//  416  931:aload_0         
		//  417  932:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//  418  935:aload_1         
		//  419  936:invokestatic    #789 <Method List DescriptorProtos$FileDescriptorProto.access$2000(DescriptorProtos$FileDescriptorProto)>
		//  420  939:invokevirtual   #217 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//  421  942:pop             
				}
			if(filedescriptorproto.hasOptions())
		//* 422  943:aload_1         
		//* 423  944:invokevirtual   #790 <Method boolean DescriptorProtos$FileDescriptorProto.hasOptions()>
		//* 424  947:ifeq            959
				mergeOptions(filedescriptorproto.getOptions());
		//  425  950:aload_0         
		//  426  951:aload_1         
		//  427  952:invokevirtual   #791 <Method DescriptorProtos$FileOptions DescriptorProtos$FileDescriptorProto.getOptions()>
		//  428  955:invokevirtual   #795 <Method DescriptorProtos$FileDescriptorProto$Builder mergeOptions(DescriptorProtos$FileOptions)>
		//  429  958:pop             
			if(filedescriptorproto.hasSourceCodeInfo())
		//* 430  959:aload_1         
		//* 431  960:invokevirtual   #797 <Method boolean DescriptorProtos$FileDescriptorProto.hasSourceCodeInfo()>
		//* 432  963:ifeq            975
				mergeSourceCodeInfo(filedescriptorproto.getSourceCodeInfo());
		//  433  966:aload_0         
		//  434  967:aload_1         
		//  435  968:invokevirtual   #798 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$FileDescriptorProto.getSourceCodeInfo()>
		//  436  971:invokevirtual   #802 <Method DescriptorProtos$FileDescriptorProto$Builder mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo)>
		//  437  974:pop             
			if(filedescriptorproto.hasSyntax())
		//* 438  975:aload_1         
		//* 439  976:invokevirtual   #804 <Method boolean DescriptorProtos$FileDescriptorProto.hasSyntax()>
		//* 440  979:ifeq            1006
			{
				bitField0_ = bitField0_ | 0x800;
		//  441  982:aload_0         
		//  442  983:aload_0         
		//  443  984:getfield        #106 <Field int bitField0_>
		//  444  987:sipush          2048
		//  445  990:ior             
		//  446  991:putfield        #106 <Field int bitField0_>
				syntax_ = filedescriptorproto.syntax_;
		//  447  994:aload_0         
		//  448  995:aload_1         
		//  449  996:invokestatic    #807 <Method Object DescriptorProtos$FileDescriptorProto.access$2300(DescriptorProtos$FileDescriptorProto)>
		//  450  999:putfield        #92  <Field Object syntax_>
				onChanged();
		//  451 1002:aload_0         
		//  452 1003:invokevirtual   #209 <Method void onChanged()>
			}
			mergeUnknownFields(filedescriptorproto.unknownFields);
		//  453 1006:aload_0         
		//  454 1007:aload_1         
		//  455 1008:getfield        #811 <Field UnknownFieldSet DescriptorProtos$FileDescriptorProto.unknownFields>
		//  456 1011:invokevirtual   #815 <Method DescriptorProtos$FileDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//  457 1014:pop             
			onChanged();
		//  458 1015:aload_0         
		//  459 1016:invokevirtual   #209 <Method void onChanged()>
			return this;
		//  460 1019:aload_0         
		//  461 1020:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.FileDescriptorProto)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class DescriptorProtos$FileDescriptorProto>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.FileDescriptorProto)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class DescriptorProtos$FileDescriptorProto>
		//    6   12:invokevirtual   #736 <Method DescriptorProtos$FileDescriptorProto$Builder mergeFrom(DescriptorProtos$FileDescriptorProto)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #817 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #716 <Method DescriptorProtos$FileDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #720 <Method DescriptorProtos$FileDescriptorProto$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #716 <Method DescriptorProtos$FileDescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeOptions(DescriptorProtos.FileOptions fileoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       71
			{
				if((bitField0_ & 0x200) == 512 && options_ != null && options_ != DescriptorProtos.FileOptions.getDefaultInstance())
		//*   3    7:aload_0         
		//*   4    8:getfield        #106 <Field int bitField0_>
		//*   5   11:sipush          512
		//*   6   14:iand            
		//*   7   15:sipush          512
		//*   8   18:icmpne          59
		//*   9   21:aload_0         
		//*  10   22:getfield        #88  <Field DescriptorProtos$FileOptions options_>
		//*  11   25:ifnull          59
		//*  12   28:aload_0         
		//*  13   29:getfield        #88  <Field DescriptorProtos$FileOptions options_>
		//*  14   32:invokestatic    #618 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
		//*  15   35:if_acmpeq       59
					options_ = DescriptorProtos.FileOptions.newBuilder(options_).mergeFrom(fileoptions).buildPartial();
		//   16   38:aload_0         
		//   17   39:aload_0         
		//   18   40:getfield        #88  <Field DescriptorProtos$FileOptions options_>
		//   19   43:invokestatic    #824 <Method DescriptorProtos$FileOptions$Builder DescriptorProtos$FileOptions.newBuilder(DescriptorProtos$FileOptions)>
		//   20   46:aload_1         
		//   21   47:invokevirtual   #826 <Method DescriptorProtos$FileOptions$Builder DescriptorProtos$FileOptions$Builder.mergeFrom(DescriptorProtos$FileOptions)>
		//   22   50:invokevirtual   #828 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions$Builder.buildPartial()>
		//   23   53:putfield        #88  <Field DescriptorProtos$FileOptions options_>
				else
		//*  24   56:goto            64
					options_ = fileoptions;
		//   25   59:aload_0         
		//   26   60:aload_1         
		//   27   61:putfield        #88  <Field DescriptorProtos$FileOptions options_>
				onChanged();
		//   28   64:aload_0         
		//   29   65:invokevirtual   #209 <Method void onChanged()>
			} else
		//*  30   68:goto            80
			{
				optionsBuilder_.mergeFrom(((AbstractMessage) (fileoptions)));
		//   31   71:aload_0         
		//   32   72:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//   33   75:aload_1         
		//   34   76:invokevirtual   #831 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
		//   35   79:pop             
			}
			bitField0_ = bitField0_ | 0x200;
		//   36   80:aload_0         
		//   37   81:aload_0         
		//   38   82:getfield        #106 <Field int bitField0_>
		//   39   85:sipush          512
		//   40   88:ior             
		//   41   89:putfield        #106 <Field int bitField0_>
			return this;
		//   42   92:aload_0         
		//   43   93:areturn         
		}

		public Builder mergeSourceCodeInfo(DescriptorProtos.SourceCodeInfo sourcecodeinfo)
		{
			if(sourceCodeInfoBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//*   2    4:ifnonnull       71
			{
				if((bitField0_ & 0x400) == 1024 && sourceCodeInfo_ != null && sourceCodeInfo_ != DescriptorProtos.SourceCodeInfo.getDefaultInstance())
		//*   3    7:aload_0         
		//*   4    8:getfield        #106 <Field int bitField0_>
		//*   5   11:sipush          1024
		//*   6   14:iand            
		//*   7   15:sipush          1024
		//*   8   18:icmpne          59
		//*   9   21:aload_0         
		//*  10   22:getfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		//*  11   25:ifnull          59
		//*  12   28:aload_0         
		//*  13   29:getfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		//*  14   32:invokestatic    #658 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo.getDefaultInstance()>
		//*  15   35:if_acmpeq       59
					sourceCodeInfo_ = DescriptorProtos.SourceCodeInfo.newBuilder(sourceCodeInfo_).mergeFrom(sourcecodeinfo).buildPartial();
		//   16   38:aload_0         
		//   17   39:aload_0         
		//   18   40:getfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		//   19   43:invokestatic    #834 <Method DescriptorProtos$SourceCodeInfo$Builder DescriptorProtos$SourceCodeInfo.newBuilder(DescriptorProtos$SourceCodeInfo)>
		//   20   46:aload_1         
		//   21   47:invokevirtual   #836 <Method DescriptorProtos$SourceCodeInfo$Builder DescriptorProtos$SourceCodeInfo$Builder.mergeFrom(DescriptorProtos$SourceCodeInfo)>
		//   22   50:invokevirtual   #838 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo$Builder.buildPartial()>
		//   23   53:putfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
				else
		//*  24   56:goto            64
					sourceCodeInfo_ = sourcecodeinfo;
		//   25   59:aload_0         
		//   26   60:aload_1         
		//   27   61:putfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
				onChanged();
		//   28   64:aload_0         
		//   29   65:invokevirtual   #209 <Method void onChanged()>
			} else
		//*  30   68:goto            80
			{
				sourceCodeInfoBuilder_.mergeFrom(((AbstractMessage) (sourcecodeinfo)));
		//   31   71:aload_0         
		//   32   72:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//   33   75:aload_1         
		//   34   76:invokevirtual   #831 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
		//   35   79:pop             
			}
			bitField0_ = bitField0_ | 0x400;
		//   36   80:aload_0         
		//   37   81:aload_0         
		//   38   82:getfield        #106 <Field int bitField0_>
		//   39   85:sipush          1024
		//   40   88:ior             
		//   41   89:putfield        #106 <Field int bitField0_>
			return this;
		//   42   92:aload_0         
		//   43   93:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #815 <Method DescriptorProtos$FileDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #842 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #815 <Method DescriptorProtos$FileDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #815 <Method DescriptorProtos$FileDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder removeEnumType(int i)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       28
			{
				ensureEnumTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
				enumType_.remove(i);
		//    5   11:aload_0         
		//    6   12:getfield        #82  <Field List enumType_>
		//    7   15:iload_1         
		//    8   16:invokeinterface #847 <Method Object List.remove(int)>
		//    9   21:pop             
				onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   12   26:aload_0         
		//   13   27:areturn         
			} else
			{
				enumTypeBuilder_.remove(i);
		//   14   28:aload_0         
		//   15   29:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #850 <Method void RepeatedFieldBuilderV3.remove(int)>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Builder removeExtension(int i)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       28
			{
				ensureExtensionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #221 <Method void ensureExtensionIsMutable()>
				extension_.remove(i);
		//    5   11:aload_0         
		//    6   12:getfield        #86  <Field List extension_>
		//    7   15:iload_1         
		//    8   16:invokeinterface #847 <Method Object List.remove(int)>
		//    9   21:pop             
				onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   12   26:aload_0         
		//   13   27:areturn         
			} else
			{
				extensionBuilder_.remove(i);
		//   14   28:aload_0         
		//   15   29:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #850 <Method void RepeatedFieldBuilderV3.remove(int)>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Builder removeMessageType(int i)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       28
			{
				ensureMessageTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #225 <Method void ensureMessageTypeIsMutable()>
				messageType_.remove(i);
		//    5   11:aload_0         
		//    6   12:getfield        #80  <Field List messageType_>
		//    7   15:iload_1         
		//    8   16:invokeinterface #847 <Method Object List.remove(int)>
		//    9   21:pop             
				onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   12   26:aload_0         
		//   13   27:areturn         
			} else
			{
				messageTypeBuilder_.remove(i);
		//   14   28:aload_0         
		//   15   29:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #850 <Method void RepeatedFieldBuilderV3.remove(int)>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Builder removeService(int i)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       28
			{
				ensureServiceIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #233 <Method void ensureServiceIsMutable()>
				service_.remove(i);
		//    5   11:aload_0         
		//    6   12:getfield        #84  <Field List service_>
		//    7   15:iload_1         
		//    8   16:invokeinterface #847 <Method Object List.remove(int)>
		//    9   21:pop             
				onChanged();
		//   10   22:aload_0         
		//   11   23:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   12   26:aload_0         
		//   13   27:areturn         
			} else
			{
				serviceBuilder_.remove(i);
		//   14   28:aload_0         
		//   15   29:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #850 <Method void RepeatedFieldBuilderV3.remove(int)>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Builder setDependency(int i, String s)
		{
			if(s == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #241 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #242 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				ensureDependencyIsMutable();
		//    6   12:aload_0         
		//    7   13:invokespecial   #200 <Method void ensureDependencyIsMutable()>
				dependency_.set(i, ((Object) (s)));
		//    8   16:aload_0         
		//    9   17:getfield        #68  <Field LazyStringList dependency_>
		//   10   20:iload_1         
		//   11   21:aload_2         
		//   12   22:invokeinterface #859 <Method Object LazyStringList.set(int, Object)>
		//   13   27:pop             
				onChanged();
		//   14   28:aload_0         
		//   15   29:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   16   32:aload_0         
		//   17   33:areturn         
			}
		}

		public Builder setEnumType(int i, DescriptorProtos.EnumDescriptorProto.Builder builder)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureEnumTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
				enumType_.set(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #82  <Field List enumType_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #261 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
		//   10   20:invokeinterface #861 <Method Object List.set(int, Object)>
		//   11   25:pop             
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				enumTypeBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
		//   16   32:aload_0         
		//   17   33:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   18   36:iload_1         
		//   19   37:aload_2         
		//   20   38:invokevirtual   #261 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
		//   21   41:invokevirtual   #864 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   22   44:pop             
				return this;
		//   23   45:aload_0         
		//   24   46:areturn         
			}
		}

		public Builder setEnumType(int i, DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(enumdescriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureEnumTypeIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
					enumType_.set(i, ((Object) (enumdescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #82  <Field List enumType_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #861 <Method Object List.set(int, Object)>
		//   16   34:pop             
					onChanged();
		//   17   35:aload_0         
		//   18   36:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   19   39:aload_0         
		//   20   40:areturn         
				}
			} else
			{
				enumTypeBuilder_.setMessage(i, ((AbstractMessage) (enumdescriptorproto)));
		//   21   41:aload_0         
		//   22   42:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//   23   45:iload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #864 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   26   50:pop             
				return this;
		//   27   51:aload_0         
		//   28   52:areturn         
			}
		}

		public Builder setExtension(int i, DescriptorProtos.FieldDescriptorProto.Builder builder)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureExtensionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #221 <Method void ensureExtensionIsMutable()>
				extension_.set(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #86  <Field List extension_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #299 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
		//   10   20:invokeinterface #861 <Method Object List.set(int, Object)>
		//   11   25:pop             
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				extensionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
		//   16   32:aload_0         
		//   17   33:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   18   36:iload_1         
		//   19   37:aload_2         
		//   20   38:invokevirtual   #299 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
		//   21   41:invokevirtual   #864 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   22   44:pop             
				return this;
		//   23   45:aload_0         
		//   24   46:areturn         
			}
		}

		public Builder setExtension(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(fielddescriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureExtensionIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #221 <Method void ensureExtensionIsMutable()>
					extension_.set(i, ((Object) (fielddescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #86  <Field List extension_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #861 <Method Object List.set(int, Object)>
		//   16   34:pop             
					onChanged();
		//   17   35:aload_0         
		//   18   36:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   19   39:aload_0         
		//   20   40:areturn         
				}
			} else
			{
				extensionBuilder_.setMessage(i, ((AbstractMessage) (fielddescriptorproto)));
		//   21   41:aload_0         
		//   22   42:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//   23   45:iload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #864 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   26   50:pop             
				return this;
		//   27   51:aload_0         
		//   28   52:areturn         
			}
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #868 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #870 <Method DescriptorProtos$FileDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #870 <Method DescriptorProtos$FileDescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setMessageType(int i, DescriptorProtos.DescriptorProto.Builder builder)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureMessageTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #225 <Method void ensureMessageTypeIsMutable()>
				messageType_.set(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #80  <Field List messageType_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #316 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto$Builder.build()>
		//   10   20:invokeinterface #861 <Method Object List.set(int, Object)>
		//   11   25:pop             
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				messageTypeBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
		//   16   32:aload_0         
		//   17   33:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   18   36:iload_1         
		//   19   37:aload_2         
		//   20   38:invokevirtual   #316 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto$Builder.build()>
		//   21   41:invokevirtual   #864 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   22   44:pop             
				return this;
		//   23   45:aload_0         
		//   24   46:areturn         
			}
		}

		public Builder setMessageType(int i, DescriptorProtos.DescriptorProto descriptorproto)
		{
			if(messageTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(descriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureMessageTypeIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #225 <Method void ensureMessageTypeIsMutable()>
					messageType_.set(i, ((Object) (descriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #80  <Field List messageType_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #861 <Method Object List.set(int, Object)>
		//   16   34:pop             
					onChanged();
		//   17   35:aload_0         
		//   18   36:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   19   39:aload_0         
		//   20   40:areturn         
				}
			} else
			{
				messageTypeBuilder_.setMessage(i, ((AbstractMessage) (descriptorproto)));
		//   21   41:aload_0         
		//   22   42:getfield        #151 <Field RepeatedFieldBuilderV3 messageTypeBuilder_>
		//   23   45:iload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #864 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
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
		//    2    4:new             #241 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #242 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #106 <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #106 <Field int bitField0_>
				name_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #59  <Field Object name_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #209 <Method void onChanged()>
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
		//    2    4:new             #241 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #242 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #106 <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #106 <Field int bitField0_>
				name_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #59  <Field Object name_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setOptions(DescriptorProtos.FileOptions.Builder builder)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       22
			{
				options_ = builder.build();
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #877 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions$Builder.build()>
		//    6   12:putfield        #88  <Field DescriptorProtos$FileOptions options_>
				onChanged();
		//    7   15:aload_0         
		//    8   16:invokevirtual   #209 <Method void onChanged()>
			} else
		//*   9   19:goto            34
			{
				optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
		//   10   22:aload_0         
		//   11   23:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #877 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions$Builder.build()>
		//   14   30:invokevirtual   #879 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   15   33:pop             
			}
			bitField0_ = bitField0_ | 0x200;
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #106 <Field int bitField0_>
		//   19   39:sipush          512
		//   20   42:ior             
		//   21   43:putfield        #106 <Field int bitField0_>
			return this;
		//   22   46:aload_0         
		//   23   47:areturn         
		}

		public Builder setOptions(DescriptorProtos.FileOptions fileoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       31
			{
				if(fileoptions == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				options_ = fileoptions;
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:putfield        #88  <Field DescriptorProtos$FileOptions options_>
				onChanged();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #209 <Method void onChanged()>
			} else
		//*  14   28:goto            40
			{
				optionsBuilder_.setMessage(((AbstractMessage) (fileoptions)));
		//   15   31:aload_0         
		//   16   32:getfield        #156 <Field SingleFieldBuilderV3 optionsBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #879 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   19   39:pop             
			}
			bitField0_ = bitField0_ | 0x200;
		//   20   40:aload_0         
		//   21   41:aload_0         
		//   22   42:getfield        #106 <Field int bitField0_>
		//   23   45:sipush          512
		//   24   48:ior             
		//   25   49:putfield        #106 <Field int bitField0_>
			return this;
		//   26   52:aload_0         
		//   27   53:areturn         
		}

		public Builder setPackage(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #241 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #242 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 2;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #106 <Field int bitField0_>
		//    9   17:iconst_2        
		//   10   18:ior             
		//   11   19:putfield        #106 <Field int bitField0_>
				package_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #61  <Field Object package_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setPackageBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #241 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #242 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 2;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #106 <Field int bitField0_>
		//    9   17:iconst_2        
		//   10   18:ior             
		//   11   19:putfield        #106 <Field int bitField0_>
				package_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #61  <Field Object package_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setPublicDependency(int i, int j)
		{
			ensurePublicDependencyIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #229 <Method void ensurePublicDependencyIsMutable()>
			publicDependency_.set(i, ((Object) (Integer.valueOf(j))));
		//    2    4:aload_0         
		//    3    5:getfield        #76  <Field List publicDependency_>
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:invokestatic    #334 <Method Integer Integer.valueOf(int)>
		//    7   13:invokeinterface #861 <Method Object List.set(int, Object)>
		//    8   18:pop             
			onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #209 <Method void onChanged()>
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
		//    4    4:invokespecial   #888 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #890 <Method DescriptorProtos$FileDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #890 <Method DescriptorProtos$FileDescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setService(int i, DescriptorProtos.ServiceDescriptorProto.Builder builder)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureServiceIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #233 <Method void ensureServiceIsMutable()>
				service_.set(i, ((Object) (builder.build())));
		//    5   11:aload_0         
		//    6   12:getfield        #84  <Field List service_>
		//    7   15:iload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #349 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto$Builder.build()>
		//   10   20:invokeinterface #861 <Method Object List.set(int, Object)>
		//   11   25:pop             
				onChanged();
		//   12   26:aload_0         
		//   13   27:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   14   30:aload_0         
		//   15   31:areturn         
			} else
			{
				serviceBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
		//   16   32:aload_0         
		//   17   33:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   18   36:iload_1         
		//   19   37:aload_2         
		//   20   38:invokevirtual   #349 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto$Builder.build()>
		//   21   41:invokevirtual   #864 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   22   44:pop             
				return this;
		//   23   45:aload_0         
		//   24   46:areturn         
			}
		}

		public Builder setService(int i, DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
		{
			if(serviceBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(servicedescriptorproto == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       19
				{
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				} else
				{
					ensureServiceIsMutable();
		//    9   19:aload_0         
		//   10   20:invokespecial   #233 <Method void ensureServiceIsMutable()>
					service_.set(i, ((Object) (servicedescriptorproto)));
		//   11   23:aload_0         
		//   12   24:getfield        #84  <Field List service_>
		//   13   27:iload_1         
		//   14   28:aload_2         
		//   15   29:invokeinterface #861 <Method Object List.set(int, Object)>
		//   16   34:pop             
					onChanged();
		//   17   35:aload_0         
		//   18   36:invokevirtual   #209 <Method void onChanged()>
					return this;
		//   19   39:aload_0         
		//   20   40:areturn         
				}
			} else
			{
				serviceBuilder_.setMessage(i, ((AbstractMessage) (servicedescriptorproto)));
		//   21   41:aload_0         
		//   22   42:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
		//   23   45:iload_1         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #864 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
		//   26   50:pop             
				return this;
		//   27   51:aload_0         
		//   28   52:areturn         
			}
		}

		public Builder setSourceCodeInfo(DescriptorProtos.SourceCodeInfo.Builder builder)
		{
			if(sourceCodeInfoBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//*   2    4:ifnonnull       22
			{
				sourceCodeInfo_ = builder.build();
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #896 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo$Builder.build()>
		//    6   12:putfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
				onChanged();
		//    7   15:aload_0         
		//    8   16:invokevirtual   #209 <Method void onChanged()>
			} else
		//*   9   19:goto            34
			{
				sourceCodeInfoBuilder_.setMessage(((AbstractMessage) (builder.build())));
		//   10   22:aload_0         
		//   11   23:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #896 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo$Builder.build()>
		//   14   30:invokevirtual   #879 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   15   33:pop             
			}
			bitField0_ = bitField0_ | 0x400;
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #106 <Field int bitField0_>
		//   19   39:sipush          1024
		//   20   42:ior             
		//   21   43:putfield        #106 <Field int bitField0_>
			return this;
		//   22   46:aload_0         
		//   23   47:areturn         
		}

		public Builder setSourceCodeInfo(DescriptorProtos.SourceCodeInfo sourcecodeinfo)
		{
			if(sourceCodeInfoBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//*   2    4:ifnonnull       31
			{
				if(sourcecodeinfo == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
					throw new NullPointerException();
		//    5   11:new             #241 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #242 <Method void NullPointerException()>
		//    8   18:athrow          
				sourceCodeInfo_ = sourcecodeinfo;
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:putfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
				onChanged();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #209 <Method void onChanged()>
			} else
		//*  14   28:goto            40
			{
				sourceCodeInfoBuilder_.setMessage(((AbstractMessage) (sourcecodeinfo)));
		//   15   31:aload_0         
		//   16   32:getfield        #173 <Field SingleFieldBuilderV3 sourceCodeInfoBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #879 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   19   39:pop             
			}
			bitField0_ = bitField0_ | 0x400;
		//   20   40:aload_0         
		//   21   41:aload_0         
		//   22   42:getfield        #106 <Field int bitField0_>
		//   23   45:sipush          1024
		//   24   48:ior             
		//   25   49:putfield        #106 <Field int bitField0_>
			return this;
		//   26   52:aload_0         
		//   27   53:areturn         
		}

		public Builder setSyntax(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #241 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #242 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x800;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #106 <Field int bitField0_>
		//    9   17:sipush          2048
		//   10   20:ior             
		//   11   21:putfield        #106 <Field int bitField0_>
				syntax_ = ((Object) (s));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #92  <Field Object syntax_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public Builder setSyntaxBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #241 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #242 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 0x800;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #106 <Field int bitField0_>
		//    9   17:sipush          2048
		//   10   20:ior             
		//   11   21:putfield        #106 <Field int bitField0_>
				syntax_ = ((Object) (bytestring));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #92  <Field Object syntax_>
				onChanged();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #209 <Method void onChanged()>
				return this;
		//   17   33:aload_0         
		//   18   34:areturn         
			}
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #901 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #903 <Method DescriptorProtos$FileDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #903 <Method DescriptorProtos$FileDescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setWeakDependency(int i, int j)
		{
			ensureWeakDependencyIsMutable();
		//    0    0:aload_0         
		//    1    1:invokespecial   #237 <Method void ensureWeakDependencyIsMutable()>
			weakDependency_.set(i, ((Object) (Integer.valueOf(j))));
		//    2    4:aload_0         
		//    3    5:getfield        #78  <Field List weakDependency_>
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:invokestatic    #334 <Method Integer Integer.valueOf(int)>
		//    7   13:invokeinterface #861 <Method Object List.set(int, Object)>
		//    8   18:pop             
			onChanged();
		//    9   19:aload_0         
		//   10   20:invokevirtual   #209 <Method void onChanged()>
			return this;
		//   11   23:aload_0         
		//   12   24:areturn         
		}

		private int bitField0_;
		private LazyStringList dependency_;
		private RepeatedFieldBuilderV3 enumTypeBuilder_;
		private List enumType_;
		private RepeatedFieldBuilderV3 extensionBuilder_;
		private List extension_;
		private RepeatedFieldBuilderV3 messageTypeBuilder_;
		private List messageType_;
		private Object name_;
		private SingleFieldBuilderV3 optionsBuilder_;
		private DescriptorProtos.FileOptions options_;
		private Object package_;
		private List publicDependency_;
		private RepeatedFieldBuilderV3 serviceBuilder_;
		private List service_;
		private SingleFieldBuilderV3 sourceCodeInfoBuilder_;
		private DescriptorProtos.SourceCodeInfo sourceCodeInfo_;
		private Object syntax_;
		private List weakDependency_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #55  <Method void GeneratedMessageV3$Builder()>
			name_ = "";
		//    2    4:aload_0         
		//    3    5:ldc1            #57  <String "">
		//    4    7:putfield        #59  <Field Object name_>
			package_ = "";
		//    5   10:aload_0         
		//    6   11:ldc1            #57  <String "">
		//    7   13:putfield        #61  <Field Object package_>
			dependency_ = LazyStringArrayList.EMPTY;
		//    8   16:aload_0         
		//    9   17:getstatic       #66  <Field LazyStringList LazyStringArrayList.EMPTY>
		//   10   20:putfield        #68  <Field LazyStringList dependency_>
			publicDependency_ = Collections.emptyList();
		//   11   23:aload_0         
		//   12   24:invokestatic    #74  <Method List Collections.emptyList()>
		//   13   27:putfield        #76  <Field List publicDependency_>
			weakDependency_ = Collections.emptyList();
		//   14   30:aload_0         
		//   15   31:invokestatic    #74  <Method List Collections.emptyList()>
		//   16   34:putfield        #78  <Field List weakDependency_>
			messageType_ = Collections.emptyList();
		//   17   37:aload_0         
		//   18   38:invokestatic    #74  <Method List Collections.emptyList()>
		//   19   41:putfield        #80  <Field List messageType_>
			enumType_ = Collections.emptyList();
		//   20   44:aload_0         
		//   21   45:invokestatic    #74  <Method List Collections.emptyList()>
		//   22   48:putfield        #82  <Field List enumType_>
			service_ = Collections.emptyList();
		//   23   51:aload_0         
		//   24   52:invokestatic    #74  <Method List Collections.emptyList()>
		//   25   55:putfield        #84  <Field List service_>
			extension_ = Collections.emptyList();
		//   26   58:aload_0         
		//   27   59:invokestatic    #74  <Method List Collections.emptyList()>
		//   28   62:putfield        #86  <Field List extension_>
			options_ = null;
		//   29   65:aload_0         
		//   30   66:aconst_null     
		//   31   67:putfield        #88  <Field DescriptorProtos$FileOptions options_>
			sourceCodeInfo_ = null;
		//   32   70:aload_0         
		//   33   71:aconst_null     
		//   34   72:putfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
			syntax_ = "";
		//   35   75:aload_0         
		//   36   76:ldc1            #57  <String "">
		//   37   78:putfield        #92  <Field Object syntax_>
			maybeForceBuilderInitialization();
		//   38   81:aload_0         
		//   39   82:invokespecial   #95  <Method void maybeForceBuilderInitialization()>
		//   40   85:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #98  <Method void DescriptorProtos$FileDescriptorProto$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #101 <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			name_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #57  <String "">
		//    5    8:putfield        #59  <Field Object name_>
			package_ = "";
		//    6   11:aload_0         
		//    7   12:ldc1            #57  <String "">
		//    8   14:putfield        #61  <Field Object package_>
			dependency_ = LazyStringArrayList.EMPTY;
		//    9   17:aload_0         
		//   10   18:getstatic       #66  <Field LazyStringList LazyStringArrayList.EMPTY>
		//   11   21:putfield        #68  <Field LazyStringList dependency_>
			publicDependency_ = Collections.emptyList();
		//   12   24:aload_0         
		//   13   25:invokestatic    #74  <Method List Collections.emptyList()>
		//   14   28:putfield        #76  <Field List publicDependency_>
			weakDependency_ = Collections.emptyList();
		//   15   31:aload_0         
		//   16   32:invokestatic    #74  <Method List Collections.emptyList()>
		//   17   35:putfield        #78  <Field List weakDependency_>
			messageType_ = Collections.emptyList();
		//   18   38:aload_0         
		//   19   39:invokestatic    #74  <Method List Collections.emptyList()>
		//   20   42:putfield        #80  <Field List messageType_>
			enumType_ = Collections.emptyList();
		//   21   45:aload_0         
		//   22   46:invokestatic    #74  <Method List Collections.emptyList()>
		//   23   49:putfield        #82  <Field List enumType_>
			service_ = Collections.emptyList();
		//   24   52:aload_0         
		//   25   53:invokestatic    #74  <Method List Collections.emptyList()>
		//   26   56:putfield        #84  <Field List service_>
			extension_ = Collections.emptyList();
		//   27   59:aload_0         
		//   28   60:invokestatic    #74  <Method List Collections.emptyList()>
		//   29   63:putfield        #86  <Field List extension_>
			options_ = null;
		//   30   66:aload_0         
		//   31   67:aconst_null     
		//   32   68:putfield        #88  <Field DescriptorProtos$FileOptions options_>
			sourceCodeInfo_ = null;
		//   33   71:aload_0         
		//   34   72:aconst_null     
		//   35   73:putfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
			syntax_ = "";
		//   36   76:aload_0         
		//   37   77:ldc1            #57  <String "">
		//   38   79:putfield        #92  <Field Object syntax_>
			maybeForceBuilderInitialization();
		//   39   82:aload_0         
		//   40   83:invokespecial   #95  <Method void maybeForceBuilderInitialization()>
		//   41   86:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #103 <Method void DescriptorProtos$FileDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$FileDescriptorProto getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #81  <Field DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$700();
	//    0    0:invokestatic    #318 <Method Descriptors$Descriptor DescriptorProtos.access$700()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #81  <Field DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #321 <Method DescriptorProtos$FileDescriptorProto$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$filedescriptorproto);
	//    0    0:getstatic       #81  <Field DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #321 <Method DescriptorProtos$FileDescriptorProto$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #324 <Method DescriptorProtos$FileDescriptorProto$Builder DescriptorProtos$FileDescriptorProto$Builder.mergeFrom(DescriptorProtos$FileDescriptorProto)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$FileDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #330 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FileDescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #334 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileDescriptorProto)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #341 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileDescriptorProto)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #345 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$FileDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #350 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FileDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #354 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$FileDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #356 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$FileDescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #358 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileDescriptorProto)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #362 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileDescriptorProto)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #366 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileDescriptorProto)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #370 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$FileDescriptorProto parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$FileDescriptorProto)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #374 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #84  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$FileDescriptorProto))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$FileDescriptorProto>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #380 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$FileDescriptorProto)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$FileDescriptorProto>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasName() == ((DescriptorProtos$FileDescriptorProto) (obj)).hasName())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #384 <Method boolean hasName()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #384 <Method boolean hasName()>
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
	//*  30   50:invokevirtual   #384 <Method boolean hasName()>
	//*  31   53:ifeq            81
			if(flag && getName().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getName()))))
	//*  32   56:iload_2         
	//*  33   57:ifeq            79
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #388 <Method String getName()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #388 <Method String getName()>
	//*  38   68:invokevirtual   #391 <Method boolean String.equals(Object)>
	//*  39   71:ifeq            79
				flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
			else
	//*  42   76:goto            81
				flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if(flag1 && hasPackage() == ((DescriptorProtos$FileDescriptorProto) (obj)).hasPackage())
	//*  45   81:iload_3         
	//*  46   82:ifeq            101
	//*  47   85:aload_0         
	//*  48   86:invokevirtual   #394 <Method boolean hasPackage()>
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #394 <Method boolean hasPackage()>
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
		if(hasPackage())
	//*  59  105:aload_0         
	//*  60  106:invokevirtual   #394 <Method boolean hasPackage()>
	//*  61  109:ifeq            137
			if(flag && getPackage().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getPackage()))))
	//*  62  112:iload_2         
	//*  63  113:ifeq            135
	//*  64  116:aload_0         
	//*  65  117:invokevirtual   #397 <Method String getPackage()>
	//*  66  120:aload_1         
	//*  67  121:invokevirtual   #397 <Method String getPackage()>
	//*  68  124:invokevirtual   #391 <Method boolean String.equals(Object)>
	//*  69  127:ifeq            135
				flag1 = true;
	//   70  130:iconst_1        
	//   71  131:istore_3        
			else
	//*  72  132:goto            137
				flag1 = false;
	//   73  135:iconst_0        
	//   74  136:istore_3        
		if(flag1 && ((Object) (getDependencyList())).equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getDependencyList()))))
	//*  75  137:iload_3         
	//*  76  138:ifeq            160
	//*  77  141:aload_0         
	//*  78  142:invokevirtual   #401 <Method ProtocolStringList getDependencyList()>
	//*  79  145:aload_1         
	//*  80  146:invokevirtual   #401 <Method ProtocolStringList getDependencyList()>
	//*  81  149:invokevirtual   #404 <Method boolean Object.equals(Object)>
	//*  82  152:ifeq            160
			flag = true;
	//   83  155:iconst_1        
	//   84  156:istore_2        
		else
	//*  85  157:goto            162
			flag = false;
	//   86  160:iconst_0        
	//   87  161:istore_2        
		if(flag && getPublicDependencyList().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getPublicDependencyList()))))
	//*  88  162:iload_2         
	//*  89  163:ifeq            187
	//*  90  166:aload_0         
	//*  91  167:invokevirtual   #407 <Method List getPublicDependencyList()>
	//*  92  170:aload_1         
	//*  93  171:invokevirtual   #407 <Method List getPublicDependencyList()>
	//*  94  174:invokeinterface #408 <Method boolean List.equals(Object)>
	//*  95  179:ifeq            187
			flag = true;
	//   96  182:iconst_1        
	//   97  183:istore_2        
		else
	//*  98  184:goto            189
			flag = false;
	//   99  187:iconst_0        
	//  100  188:istore_2        
		if(flag && getWeakDependencyList().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getWeakDependencyList()))))
	//* 101  189:iload_2         
	//* 102  190:ifeq            214
	//* 103  193:aload_0         
	//* 104  194:invokevirtual   #411 <Method List getWeakDependencyList()>
	//* 105  197:aload_1         
	//* 106  198:invokevirtual   #411 <Method List getWeakDependencyList()>
	//* 107  201:invokeinterface #408 <Method boolean List.equals(Object)>
	//* 108  206:ifeq            214
			flag = true;
	//  109  209:iconst_1        
	//  110  210:istore_2        
		else
	//* 111  211:goto            216
			flag = false;
	//  112  214:iconst_0        
	//  113  215:istore_2        
		if(flag && getMessageTypeList().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getMessageTypeList()))))
	//* 114  216:iload_2         
	//* 115  217:ifeq            241
	//* 116  220:aload_0         
	//* 117  221:invokevirtual   #414 <Method List getMessageTypeList()>
	//* 118  224:aload_1         
	//* 119  225:invokevirtual   #414 <Method List getMessageTypeList()>
	//* 120  228:invokeinterface #408 <Method boolean List.equals(Object)>
	//* 121  233:ifeq            241
			flag = true;
	//  122  236:iconst_1        
	//  123  237:istore_2        
		else
	//* 124  238:goto            243
			flag = false;
	//  125  241:iconst_0        
	//  126  242:istore_2        
		if(flag && getEnumTypeList().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getEnumTypeList()))))
	//* 127  243:iload_2         
	//* 128  244:ifeq            268
	//* 129  247:aload_0         
	//* 130  248:invokevirtual   #417 <Method List getEnumTypeList()>
	//* 131  251:aload_1         
	//* 132  252:invokevirtual   #417 <Method List getEnumTypeList()>
	//* 133  255:invokeinterface #408 <Method boolean List.equals(Object)>
	//* 134  260:ifeq            268
			flag = true;
	//  135  263:iconst_1        
	//  136  264:istore_2        
		else
	//* 137  265:goto            270
			flag = false;
	//  138  268:iconst_0        
	//  139  269:istore_2        
		if(flag && getServiceList().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getServiceList()))))
	//* 140  270:iload_2         
	//* 141  271:ifeq            295
	//* 142  274:aload_0         
	//* 143  275:invokevirtual   #420 <Method List getServiceList()>
	//* 144  278:aload_1         
	//* 145  279:invokevirtual   #420 <Method List getServiceList()>
	//* 146  282:invokeinterface #408 <Method boolean List.equals(Object)>
	//* 147  287:ifeq            295
			flag = true;
	//  148  290:iconst_1        
	//  149  291:istore_2        
		else
	//* 150  292:goto            297
			flag = false;
	//  151  295:iconst_0        
	//  152  296:istore_2        
		if(flag && getExtensionList().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getExtensionList()))))
	//* 153  297:iload_2         
	//* 154  298:ifeq            322
	//* 155  301:aload_0         
	//* 156  302:invokevirtual   #423 <Method List getExtensionList()>
	//* 157  305:aload_1         
	//* 158  306:invokevirtual   #423 <Method List getExtensionList()>
	//* 159  309:invokeinterface #408 <Method boolean List.equals(Object)>
	//* 160  314:ifeq            322
			flag = true;
	//  161  317:iconst_1        
	//  162  318:istore_2        
		else
	//* 163  319:goto            324
			flag = false;
	//  164  322:iconst_0        
	//  165  323:istore_2        
		if(flag && hasOptions() == ((DescriptorProtos$FileDescriptorProto) (obj)).hasOptions())
	//* 166  324:iload_2         
	//* 167  325:ifeq            344
	//* 168  328:aload_0         
	//* 169  329:invokevirtual   #426 <Method boolean hasOptions()>
	//* 170  332:aload_1         
	//* 171  333:invokevirtual   #426 <Method boolean hasOptions()>
	//* 172  336:icmpne          344
			flag = true;
	//  173  339:iconst_1        
	//  174  340:istore_2        
		else
	//* 175  341:goto            346
			flag = false;
	//  176  344:iconst_0        
	//  177  345:istore_2        
		flag1 = flag;
	//  178  346:iload_2         
	//  179  347:istore_3        
		if(hasOptions())
	//* 180  348:aload_0         
	//* 181  349:invokevirtual   #426 <Method boolean hasOptions()>
	//* 182  352:ifeq            380
			if(flag && getOptions().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getOptions()))))
	//* 183  355:iload_2         
	//* 184  356:ifeq            378
	//* 185  359:aload_0         
	//* 186  360:invokevirtual   #429 <Method DescriptorProtos$FileOptions getOptions()>
	//* 187  363:aload_1         
	//* 188  364:invokevirtual   #429 <Method DescriptorProtos$FileOptions getOptions()>
	//* 189  367:invokevirtual   #430 <Method boolean DescriptorProtos$FileOptions.equals(Object)>
	//* 190  370:ifeq            378
				flag1 = true;
	//  191  373:iconst_1        
	//  192  374:istore_3        
			else
	//* 193  375:goto            380
				flag1 = false;
	//  194  378:iconst_0        
	//  195  379:istore_3        
		if(flag1 && hasSourceCodeInfo() == ((DescriptorProtos$FileDescriptorProto) (obj)).hasSourceCodeInfo())
	//* 196  380:iload_3         
	//* 197  381:ifeq            400
	//* 198  384:aload_0         
	//* 199  385:invokevirtual   #433 <Method boolean hasSourceCodeInfo()>
	//* 200  388:aload_1         
	//* 201  389:invokevirtual   #433 <Method boolean hasSourceCodeInfo()>
	//* 202  392:icmpne          400
			flag = true;
	//  203  395:iconst_1        
	//  204  396:istore_2        
		else
	//* 205  397:goto            402
			flag = false;
	//  206  400:iconst_0        
	//  207  401:istore_2        
		flag1 = flag;
	//  208  402:iload_2         
	//  209  403:istore_3        
		if(hasSourceCodeInfo())
	//* 210  404:aload_0         
	//* 211  405:invokevirtual   #433 <Method boolean hasSourceCodeInfo()>
	//* 212  408:ifeq            436
			if(flag && getSourceCodeInfo().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getSourceCodeInfo()))))
	//* 213  411:iload_2         
	//* 214  412:ifeq            434
	//* 215  415:aload_0         
	//* 216  416:invokevirtual   #436 <Method DescriptorProtos$SourceCodeInfo getSourceCodeInfo()>
	//* 217  419:aload_1         
	//* 218  420:invokevirtual   #436 <Method DescriptorProtos$SourceCodeInfo getSourceCodeInfo()>
	//* 219  423:invokevirtual   #437 <Method boolean DescriptorProtos$SourceCodeInfo.equals(Object)>
	//* 220  426:ifeq            434
				flag1 = true;
	//  221  429:iconst_1        
	//  222  430:istore_3        
			else
	//* 223  431:goto            436
				flag1 = false;
	//  224  434:iconst_0        
	//  225  435:istore_3        
		if(flag1 && hasSyntax() == ((DescriptorProtos$FileDescriptorProto) (obj)).hasSyntax())
	//* 226  436:iload_3         
	//* 227  437:ifeq            456
	//* 228  440:aload_0         
	//* 229  441:invokevirtual   #440 <Method boolean hasSyntax()>
	//* 230  444:aload_1         
	//* 231  445:invokevirtual   #440 <Method boolean hasSyntax()>
	//* 232  448:icmpne          456
			flag = true;
	//  233  451:iconst_1        
	//  234  452:istore_2        
		else
	//* 235  453:goto            458
			flag = false;
	//  236  456:iconst_0        
	//  237  457:istore_2        
		flag1 = flag;
	//  238  458:iload_2         
	//  239  459:istore_3        
		if(hasSyntax())
	//* 240  460:aload_0         
	//* 241  461:invokevirtual   #440 <Method boolean hasSyntax()>
	//* 242  464:ifeq            492
			if(flag && getSyntax().equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).getSyntax()))))
	//* 243  467:iload_2         
	//* 244  468:ifeq            490
	//* 245  471:aload_0         
	//* 246  472:invokevirtual   #443 <Method String getSyntax()>
	//* 247  475:aload_1         
	//* 248  476:invokevirtual   #443 <Method String getSyntax()>
	//* 249  479:invokevirtual   #391 <Method boolean String.equals(Object)>
	//* 250  482:ifeq            490
				flag1 = true;
	//  251  485:iconst_1        
	//  252  486:istore_3        
			else
	//* 253  487:goto            492
				flag1 = false;
	//  254  490:iconst_0        
	//  255  491:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$FileDescriptorProto) (obj)).unknownFields)));
	//  256  492:iload_3         
	//  257  493:ifeq            512
	//  258  496:aload_0         
	//  259  497:getfield        #258 <Field UnknownFieldSet unknownFields>
	//  260  500:aload_1         
	//  261  501:getfield        #258 <Field UnknownFieldSet unknownFields>
	//  262  504:invokevirtual   #444 <Method boolean UnknownFieldSet.equals(Object)>
	//  263  507:ifeq            512
	//  264  510:iconst_1        
	//  265  511:ireturn         
	//  266  512:iconst_0        
	//  267  513:ireturn         
	}

	public DescriptorProtos$FileDescriptorProto getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #81  <Field DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #448 <Method DescriptorProtos$FileDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #448 <Method DescriptorProtos$FileDescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public String getDependency(int i)
	{
		return (String)dependency_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field LazyStringList dependency_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #455 <Method Object LazyStringList.get(int)>
	//    4   10:checkcast       #390 <Class String>
	//    5   13:areturn         
	}

	public ByteString getDependencyBytes(int i)
	{
		return dependency_.getByteString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field LazyStringList dependency_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #460 <Method ByteString LazyStringList.getByteString(int)>
	//    4   10:areturn         
	}

	public int getDependencyCount()
	{
		return dependency_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field LazyStringList dependency_>
	//    2    4:invokeinterface #464 <Method int LazyStringList.size()>
	//    3    9:ireturn         
	}

	public ProtocolStringList getDependencyList()
	{
		return ((ProtocolStringList) (dependency_));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field LazyStringList dependency_>
	//    2    4:areturn         
	}

	public volatile List getDependencyList()
	{
		return ((List) (getDependencyList()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #401 <Method ProtocolStringList getDependencyList()>
	//    2    4:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto getEnumType(int i)
	{
		return (DescriptorProtos$EnumDescriptorProto)enumType_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field List enumType_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #175 <Class DescriptorProtos$EnumDescriptorProto>
	//    5   13:areturn         
	}

	public int getEnumTypeCount()
	{
		return enumType_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field List enumType_>
	//    2    4:invokeinterface #469 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getEnumTypeList()
	{
		return enumType_;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field List enumType_>
	//    2    4:areturn         
	}

	public rBuilder getEnumTypeOrBuilder(int i)
	{
		return (rBuilder)enumType_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field List enumType_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #474 <Class DescriptorProtos$EnumDescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getEnumTypeOrBuilderList()
	{
		return enumType_;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field List enumType_>
	//    2    4:areturn         
	}

	public  getExtension(int i)
	{
		return ()extension_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List extension_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #181 <Class DescriptorProtos$FieldDescriptorProto>
	//    5   13:areturn         
	}

	public int getExtensionCount()
	{
		return extension_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List extension_>
	//    2    4:invokeinterface #469 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getExtensionList()
	{
		return extension_;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List extension_>
	//    2    4:areturn         
	}

	public OrBuilder getExtensionOrBuilder(int i)
	{
		return (OrBuilder)extension_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List extension_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #484 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getExtensionOrBuilderList()
	{
		return extension_;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List extension_>
	//    2    4:areturn         
	}

	public DescriptorProtos.DescriptorProto getMessageType(int i)
	{
		return (DescriptorProtos.DescriptorProto)messageType_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List messageType_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #163 <Class DescriptorProtos$DescriptorProto>
	//    5   13:areturn         
	}

	public int getMessageTypeCount()
	{
		return messageType_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List messageType_>
	//    2    4:invokeinterface #469 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getMessageTypeList()
	{
		return messageType_;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List messageType_>
	//    2    4:areturn         
	}

	public lder getMessageTypeOrBuilder(int i)
	{
		return (lder)messageType_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List messageType_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #494 <Class DescriptorProtos$DescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getMessageTypeOrBuilderList()
	{
		return messageType_;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List messageType_>
	//    2    4:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #390 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #390 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #498 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #501 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #504 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			name_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #92  <Field Object name_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #390 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #390 <Class String>
	//    8   16:invokestatic    #509 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #92  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #498 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.FileOptions getOptions()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field DescriptorProtos$FileOptions options_>
	//*   2    4:ifnonnull       11
			return DescriptorProtos.FileOptions.getDefaultInstance();
	//    3    7:invokestatic    #511 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return options_;
	//    5   11:aload_0         
	//    6   12:getfield        #184 <Field DescriptorProtos$FileOptions options_>
	//    7   15:areturn         
	}

	public  getOptionsOrBuilder()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field DescriptorProtos$FileOptions options_>
	//*   2    4:ifnonnull       11
			return (() (DescriptorProtos.FileOptions.getDefaultInstance()));
	//    3    7:invokestatic    #511 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return (() (options_));
	//    5   11:aload_0         
	//    6   12:getfield        #184 <Field DescriptorProtos$FileOptions options_>
	//    7   15:areturn         
	}

	public String getPackage()
	{
		Object obj = package_;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Object package_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #390 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #390 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #498 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #501 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #504 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			package_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #94  <Field Object package_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getPackageBytes()
	{
		Object obj = package_;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Object package_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #390 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #390 <Class String>
	//    8   16:invokestatic    #509 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			package_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #94  <Field Object package_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #498 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #84  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getPublicDependency(int i)
	{
		return ((Integer)publicDependency_.get(i)).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field List publicDependency_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #222 <Class Integer>
	//    5   13:invokevirtual   #519 <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	public int getPublicDependencyCount()
	{
		return publicDependency_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field List publicDependency_>
	//    2    4:invokeinterface #469 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getPublicDependencyList()
	{
		return publicDependency_;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field List publicDependency_>
	//    2    4:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #525 <Field int memoizedSize>
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
	//*  11   15:getfield        #151 <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			i = GeneratedMessageV3.computeStringSize(1, name_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #92  <Field Object name_>
	//   19   29:invokestatic    #529 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_1        
		int j = i;
	//   23   35:iload_1         
	//   24   36:istore_2        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #151 <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          58
			j = i + GeneratedMessageV3.computeStringSize(2, package_);
	//   31   47:iload_1         
	//   32   48:iconst_2        
	//   33   49:aload_0         
	//   34   50:getfield        #94  <Field Object package_>
	//   35   53:invokestatic    #529 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   36   56:iadd            
	//   37   57:istore_2        
		int k = 0;
	//   38   58:iconst_0        
	//   39   59:istore_3        
		for(i = 0; i < dependency_.size(); i++)
	//*  40   60:iconst_0        
	//*  41   61:istore_1        
	//*  42   62:iload_1         
	//*  43   63:aload_0         
	//*  44   64:getfield        #101 <Field LazyStringList dependency_>
	//*  45   67:invokeinterface #464 <Method int LazyStringList.size()>
	//*  46   72:icmpge          98
			k += computeStringSizeNoTag(dependency_.getRaw(i));
	//   47   75:iload_3         
	//   48   76:aload_0         
	//   49   77:getfield        #101 <Field LazyStringList dependency_>
	//   50   80:iload_1         
	//   51   81:invokeinterface #532 <Method Object LazyStringList.getRaw(int)>
	//   52   86:invokestatic    #536 <Method int computeStringSizeNoTag(Object)>
	//   53   89:iadd            
	//   54   90:istore_3        

	//   55   91:iload_1         
	//   56   92:iconst_1        
	//   57   93:iadd            
	//   58   94:istore_1        
	//*  59   95:goto            62
		i = j + k + getDependencyList().size() * 1;
	//   60   98:iload_2         
	//   61   99:iload_3         
	//   62  100:iadd            
	//   63  101:aload_0         
	//   64  102:invokevirtual   #401 <Method ProtocolStringList getDependencyList()>
	//   65  105:invokeinterface #539 <Method int ProtocolStringList.size()>
	//   66  110:iconst_1        
	//   67  111:imul            
	//   68  112:iadd            
	//   69  113:istore_1        
		for(j = 0; j < messageType_.size(); j++)
	//*  70  114:iconst_0        
	//*  71  115:istore_2        
	//*  72  116:iload_2         
	//*  73  117:aload_0         
	//*  74  118:getfield        #113 <Field List messageType_>
	//*  75  121:invokeinterface #469 <Method int List.size()>
	//*  76  126:icmpge          156
			i += CodedOutputStream.computeMessageSize(4, (MessageLite)messageType_.get(j));
	//   77  129:iload_1         
	//   78  130:iconst_4        
	//   79  131:aload_0         
	//   80  132:getfield        #113 <Field List messageType_>
	//   81  135:iload_2         
	//   82  136:invokeinterface #467 <Method Object List.get(int)>
	//   83  141:checkcast       #541 <Class MessageLite>
	//   84  144:invokestatic    #547 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   85  147:iadd            
	//   86  148:istore_1        

	//   87  149:iload_2         
	//   88  150:iconst_1        
	//   89  151:iadd            
	//   90  152:istore_2        
	//*  91  153:goto            116
		for(j = 0; j < enumType_.size(); j++)
	//*  92  156:iconst_0        
	//*  93  157:istore_2        
	//*  94  158:iload_2         
	//*  95  159:aload_0         
	//*  96  160:getfield        #115 <Field List enumType_>
	//*  97  163:invokeinterface #469 <Method int List.size()>
	//*  98  168:icmpge          198
			i += CodedOutputStream.computeMessageSize(5, (MessageLite)enumType_.get(j));
	//   99  171:iload_1         
	//  100  172:iconst_5        
	//  101  173:aload_0         
	//  102  174:getfield        #115 <Field List enumType_>
	//  103  177:iload_2         
	//  104  178:invokeinterface #467 <Method Object List.get(int)>
	//  105  183:checkcast       #541 <Class MessageLite>
	//  106  186:invokestatic    #547 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  107  189:iadd            
	//  108  190:istore_1        

	//  109  191:iload_2         
	//  110  192:iconst_1        
	//  111  193:iadd            
	//  112  194:istore_2        
	//* 113  195:goto            158
		for(j = 0; j < service_.size(); j++)
	//* 114  198:iconst_0        
	//* 115  199:istore_2        
	//* 116  200:iload_2         
	//* 117  201:aload_0         
	//* 118  202:getfield        #117 <Field List service_>
	//* 119  205:invokeinterface #469 <Method int List.size()>
	//* 120  210:icmpge          241
			i += CodedOutputStream.computeMessageSize(6, (MessageLite)service_.get(j));
	//  121  213:iload_1         
	//  122  214:bipush          6
	//  123  216:aload_0         
	//  124  217:getfield        #117 <Field List service_>
	//  125  220:iload_2         
	//  126  221:invokeinterface #467 <Method Object List.get(int)>
	//  127  226:checkcast       #541 <Class MessageLite>
	//  128  229:invokestatic    #547 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  129  232:iadd            
	//  130  233:istore_1        

	//  131  234:iload_2         
	//  132  235:iconst_1        
	//  133  236:iadd            
	//  134  237:istore_2        
	//* 135  238:goto            200
		for(j = 0; j < extension_.size(); j++)
	//* 136  241:iconst_0        
	//* 137  242:istore_2        
	//* 138  243:iload_2         
	//* 139  244:aload_0         
	//* 140  245:getfield        #119 <Field List extension_>
	//* 141  248:invokeinterface #469 <Method int List.size()>
	//* 142  253:icmpge          284
			i += CodedOutputStream.computeMessageSize(7, (MessageLite)extension_.get(j));
	//  143  256:iload_1         
	//  144  257:bipush          7
	//  145  259:aload_0         
	//  146  260:getfield        #119 <Field List extension_>
	//  147  263:iload_2         
	//  148  264:invokeinterface #467 <Method Object List.get(int)>
	//  149  269:checkcast       #541 <Class MessageLite>
	//  150  272:invokestatic    #547 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  151  275:iadd            
	//  152  276:istore_1        

	//  153  277:iload_2         
	//  154  278:iconst_1        
	//  155  279:iadd            
	//  156  280:istore_2        
	//* 157  281:goto            243
		j = i;
	//  158  284:iload_1         
	//  159  285:istore_2        
		if((bitField0_ & 4) == 4)
	//* 160  286:aload_0         
	//* 161  287:getfield        #151 <Field int bitField0_>
	//* 162  290:iconst_4        
	//* 163  291:iand            
	//* 164  292:iconst_4        
	//* 165  293:icmpne          308
			j = i + CodedOutputStream.computeMessageSize(8, ((MessageLite) (getOptions())));
	//  166  296:iload_1         
	//  167  297:bipush          8
	//  168  299:aload_0         
	//  169  300:invokevirtual   #429 <Method DescriptorProtos$FileOptions getOptions()>
	//  170  303:invokestatic    #547 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  171  306:iadd            
	//  172  307:istore_2        
		i = j;
	//  173  308:iload_2         
	//  174  309:istore_1        
		if((bitField0_ & 8) == 8)
	//* 175  310:aload_0         
	//* 176  311:getfield        #151 <Field int bitField0_>
	//* 177  314:bipush          8
	//* 178  316:iand            
	//* 179  317:bipush          8
	//* 180  319:icmpne          334
			i = j + CodedOutputStream.computeMessageSize(9, ((MessageLite) (getSourceCodeInfo())));
	//  181  322:iload_2         
	//  182  323:bipush          9
	//  183  325:aload_0         
	//  184  326:invokevirtual   #436 <Method DescriptorProtos$SourceCodeInfo getSourceCodeInfo()>
	//  185  329:invokestatic    #547 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  186  332:iadd            
	//  187  333:istore_1        
		j = 0;
	//  188  334:iconst_0        
	//  189  335:istore_2        
		for(int l = 0; l < publicDependency_.size(); l++)
	//* 190  336:iconst_0        
	//* 191  337:istore_3        
	//* 192  338:iload_3         
	//* 193  339:aload_0         
	//* 194  340:getfield        #109 <Field List publicDependency_>
	//* 195  343:invokeinterface #469 <Method int List.size()>
	//* 196  348:icmpge          380
			j += CodedOutputStream.computeInt32SizeNoTag(((Integer)publicDependency_.get(l)).intValue());
	//  197  351:iload_2         
	//  198  352:aload_0         
	//  199  353:getfield        #109 <Field List publicDependency_>
	//  200  356:iload_3         
	//  201  357:invokeinterface #467 <Method Object List.get(int)>
	//  202  362:checkcast       #222 <Class Integer>
	//  203  365:invokevirtual   #519 <Method int Integer.intValue()>
	//  204  368:invokestatic    #550 <Method int CodedOutputStream.computeInt32SizeNoTag(int)>
	//  205  371:iadd            
	//  206  372:istore_2        

	//  207  373:iload_3         
	//  208  374:iconst_1        
	//  209  375:iadd            
	//  210  376:istore_3        
	//* 211  377:goto            338
		int k1 = getPublicDependencyList().size();
	//  212  380:aload_0         
	//  213  381:invokevirtual   #407 <Method List getPublicDependencyList()>
	//  214  384:invokeinterface #469 <Method int List.size()>
	//  215  389:istore          5
		int j1 = 0;
	//  216  391:iconst_0        
	//  217  392:istore          4
		for(int i1 = 0; i1 < weakDependency_.size(); i1++)
	//* 218  394:iconst_0        
	//* 219  395:istore_3        
	//* 220  396:iload_3         
	//* 221  397:aload_0         
	//* 222  398:getfield        #111 <Field List weakDependency_>
	//* 223  401:invokeinterface #469 <Method int List.size()>
	//* 224  406:icmpge          440
			j1 += CodedOutputStream.computeInt32SizeNoTag(((Integer)weakDependency_.get(i1)).intValue());
	//  225  409:iload           4
	//  226  411:aload_0         
	//  227  412:getfield        #111 <Field List weakDependency_>
	//  228  415:iload_3         
	//  229  416:invokeinterface #467 <Method Object List.get(int)>
	//  230  421:checkcast       #222 <Class Integer>
	//  231  424:invokevirtual   #519 <Method int Integer.intValue()>
	//  232  427:invokestatic    #550 <Method int CodedOutputStream.computeInt32SizeNoTag(int)>
	//  233  430:iadd            
	//  234  431:istore          4

	//  235  433:iload_3         
	//  236  434:iconst_1        
	//  237  435:iadd            
	//  238  436:istore_3        
	//* 239  437:goto            396
		j = i + j + k1 * 1 + j1 + getWeakDependencyList().size() * 1;
	//  240  440:iload_1         
	//  241  441:iload_2         
	//  242  442:iadd            
	//  243  443:iload           5
	//  244  445:iconst_1        
	//  245  446:imul            
	//  246  447:iadd            
	//  247  448:iload           4
	//  248  450:iadd            
	//  249  451:aload_0         
	//  250  452:invokevirtual   #411 <Method List getWeakDependencyList()>
	//  251  455:invokeinterface #469 <Method int List.size()>
	//  252  460:iconst_1        
	//  253  461:imul            
	//  254  462:iadd            
	//  255  463:istore_2        
		i = j;
	//  256  464:iload_2         
	//  257  465:istore_1        
		if((bitField0_ & 0x10) == 16)
	//* 258  466:aload_0         
	//* 259  467:getfield        #151 <Field int bitField0_>
	//* 260  470:bipush          16
	//* 261  472:iand            
	//* 262  473:bipush          16
	//* 263  475:icmpne          490
			i = j + GeneratedMessageV3.computeStringSize(12, syntax_);
	//  264  478:iload_2         
	//  265  479:bipush          12
	//  266  481:aload_0         
	//  267  482:getfield        #121 <Field Object syntax_>
	//  268  485:invokestatic    #529 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//  269  488:iadd            
	//  270  489:istore_1        
		i += unknownFields.getSerializedSize();
	//  271  490:iload_1         
	//  272  491:aload_0         
	//  273  492:getfield        #258 <Field UnknownFieldSet unknownFields>
	//  274  495:invokevirtual   #552 <Method int UnknownFieldSet.getSerializedSize()>
	//  275  498:iadd            
	//  276  499:istore_1        
		memoizedSize = i;
	//  277  500:aload_0         
	//  278  501:iload_1         
	//  279  502:putfield        #525 <Field int memoizedSize>
		return i;
	//  280  505:iload_1         
	//  281  506:ireturn         
	}

	public to getService(int i)
	{
		return (to)service_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field List service_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #178 <Class DescriptorProtos$ServiceDescriptorProto>
	//    5   13:areturn         
	}

	public int getServiceCount()
	{
		return service_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field List service_>
	//    2    4:invokeinterface #469 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getServiceList()
	{
		return service_;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field List service_>
	//    2    4:areturn         
	}

	public toOrBuilder getServiceOrBuilder(int i)
	{
		return (toOrBuilder)service_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field List service_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #560 <Class DescriptorProtos$ServiceDescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getServiceOrBuilderList()
	{
		return service_;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field List service_>
	//    2    4:areturn         
	}

	public DescriptorProtos.SourceCodeInfo getSourceCodeInfo()
	{
		if(sourceCodeInfo_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
	//*   2    4:ifnonnull       11
			return DescriptorProtos.SourceCodeInfo.getDefaultInstance();
	//    3    7:invokestatic    #564 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo.getDefaultInstance()>
	//    4   10:areturn         
		else
			return sourceCodeInfo_;
	//    5   11:aload_0         
	//    6   12:getfield        #203 <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
	//    7   15:areturn         
	}

	public der getSourceCodeInfoOrBuilder()
	{
		if(sourceCodeInfo_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
	//*   2    4:ifnonnull       11
			return ((der) (DescriptorProtos.SourceCodeInfo.getDefaultInstance()));
	//    3    7:invokestatic    #564 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo.getDefaultInstance()>
	//    4   10:areturn         
		else
			return ((der) (sourceCodeInfo_));
	//    5   11:aload_0         
	//    6   12:getfield        #203 <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
	//    7   15:areturn         
	}

	public String getSyntax()
	{
		Object obj = syntax_;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Object syntax_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #390 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #390 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #498 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #501 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #504 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			syntax_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #121 <Field Object syntax_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getSyntaxBytes()
	{
		Object obj = syntax_;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Object syntax_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #390 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #390 <Class String>
	//    8   16:invokestatic    #509 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			syntax_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #121 <Field Object syntax_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #498 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public int getWeakDependency(int i)
	{
		return ((Integer)weakDependency_.get(i)).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field List weakDependency_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method Object List.get(int)>
	//    4   10:checkcast       #222 <Class Integer>
	//    5   13:invokevirtual   #519 <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	public int getWeakDependencyCount()
	{
		return weakDependency_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field List weakDependency_>
	//    2    4:invokeinterface #469 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getWeakDependencyList()
	{
		return weakDependency_;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field List weakDependency_>
	//    2    4:areturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int bitField0_>
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
	//    1    1:getfield        #151 <Field int bitField0_>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasPackage()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasSourceCodeInfo()
	{
		return (bitField0_ & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int bitField0_>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean hasSyntax()
	{
		return (bitField0_ & 0x10) == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int bitField0_>
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
	//*   1    1:getfield        #574 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #574 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #576 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #578 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasName())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #384 <Method boolean hasName()>
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
	//   24   42:invokevirtual   #388 <Method String getName()>
	//   25   45:invokevirtual   #579 <Method int String.hashCode()>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(hasPackage())
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #394 <Method boolean hasPackage()>
	//*  32   56:ifeq            77
			j = (i * 37 + 2) * 53 + getPackage().hashCode();
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_2        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #397 <Method String getPackage()>
	//   42   72:invokevirtual   #579 <Method int String.hashCode()>
	//   43   75:iadd            
	//   44   76:istore_2        
		i = j;
	//   45   77:iload_2         
	//   46   78:istore_1        
		if(getDependencyCount() > 0)
	//*  47   79:aload_0         
	//*  48   80:invokevirtual   #581 <Method int getDependencyCount()>
	//*  49   83:ifle            104
			i = (j * 37 + 3) * 53 + ((Object) (getDependencyList())).hashCode();
	//   50   86:iload_2         
	//   51   87:bipush          37
	//   52   89:imul            
	//   53   90:iconst_3        
	//   54   91:iadd            
	//   55   92:bipush          53
	//   56   94:imul            
	//   57   95:aload_0         
	//   58   96:invokevirtual   #401 <Method ProtocolStringList getDependencyList()>
	//   59   99:invokevirtual   #578 <Method int Object.hashCode()>
	//   60  102:iadd            
	//   61  103:istore_1        
		j = i;
	//   62  104:iload_1         
	//   63  105:istore_2        
		if(getPublicDependencyCount() > 0)
	//*  64  106:aload_0         
	//*  65  107:invokevirtual   #583 <Method int getPublicDependencyCount()>
	//*  66  110:ifle            134
			j = (i * 37 + 10) * 53 + getPublicDependencyList().hashCode();
	//   67  113:iload_1         
	//   68  114:bipush          37
	//   69  116:imul            
	//   70  117:bipush          10
	//   71  119:iadd            
	//   72  120:bipush          53
	//   73  122:imul            
	//   74  123:aload_0         
	//   75  124:invokevirtual   #407 <Method List getPublicDependencyList()>
	//   76  127:invokeinterface #584 <Method int List.hashCode()>
	//   77  132:iadd            
	//   78  133:istore_2        
		i = j;
	//   79  134:iload_2         
	//   80  135:istore_1        
		if(getWeakDependencyCount() > 0)
	//*  81  136:aload_0         
	//*  82  137:invokevirtual   #586 <Method int getWeakDependencyCount()>
	//*  83  140:ifle            164
			i = (j * 37 + 11) * 53 + getWeakDependencyList().hashCode();
	//   84  143:iload_2         
	//   85  144:bipush          37
	//   86  146:imul            
	//   87  147:bipush          11
	//   88  149:iadd            
	//   89  150:bipush          53
	//   90  152:imul            
	//   91  153:aload_0         
	//   92  154:invokevirtual   #411 <Method List getWeakDependencyList()>
	//   93  157:invokeinterface #584 <Method int List.hashCode()>
	//   94  162:iadd            
	//   95  163:istore_1        
		j = i;
	//   96  164:iload_1         
	//   97  165:istore_2        
		if(getMessageTypeCount() > 0)
	//*  98  166:aload_0         
	//*  99  167:invokevirtual   #588 <Method int getMessageTypeCount()>
	//* 100  170:ifle            193
			j = (i * 37 + 4) * 53 + getMessageTypeList().hashCode();
	//  101  173:iload_1         
	//  102  174:bipush          37
	//  103  176:imul            
	//  104  177:iconst_4        
	//  105  178:iadd            
	//  106  179:bipush          53
	//  107  181:imul            
	//  108  182:aload_0         
	//  109  183:invokevirtual   #414 <Method List getMessageTypeList()>
	//  110  186:invokeinterface #584 <Method int List.hashCode()>
	//  111  191:iadd            
	//  112  192:istore_2        
		i = j;
	//  113  193:iload_2         
	//  114  194:istore_1        
		if(getEnumTypeCount() > 0)
	//* 115  195:aload_0         
	//* 116  196:invokevirtual   #590 <Method int getEnumTypeCount()>
	//* 117  199:ifle            222
			i = (j * 37 + 5) * 53 + getEnumTypeList().hashCode();
	//  118  202:iload_2         
	//  119  203:bipush          37
	//  120  205:imul            
	//  121  206:iconst_5        
	//  122  207:iadd            
	//  123  208:bipush          53
	//  124  210:imul            
	//  125  211:aload_0         
	//  126  212:invokevirtual   #417 <Method List getEnumTypeList()>
	//  127  215:invokeinterface #584 <Method int List.hashCode()>
	//  128  220:iadd            
	//  129  221:istore_1        
		j = i;
	//  130  222:iload_1         
	//  131  223:istore_2        
		if(getServiceCount() > 0)
	//* 132  224:aload_0         
	//* 133  225:invokevirtual   #592 <Method int getServiceCount()>
	//* 134  228:ifle            252
			j = (i * 37 + 6) * 53 + getServiceList().hashCode();
	//  135  231:iload_1         
	//  136  232:bipush          37
	//  137  234:imul            
	//  138  235:bipush          6
	//  139  237:iadd            
	//  140  238:bipush          53
	//  141  240:imul            
	//  142  241:aload_0         
	//  143  242:invokevirtual   #420 <Method List getServiceList()>
	//  144  245:invokeinterface #584 <Method int List.hashCode()>
	//  145  250:iadd            
	//  146  251:istore_2        
		i = j;
	//  147  252:iload_2         
	//  148  253:istore_1        
		if(getExtensionCount() > 0)
	//* 149  254:aload_0         
	//* 150  255:invokevirtual   #594 <Method int getExtensionCount()>
	//* 151  258:ifle            282
			i = (j * 37 + 7) * 53 + getExtensionList().hashCode();
	//  152  261:iload_2         
	//  153  262:bipush          37
	//  154  264:imul            
	//  155  265:bipush          7
	//  156  267:iadd            
	//  157  268:bipush          53
	//  158  270:imul            
	//  159  271:aload_0         
	//  160  272:invokevirtual   #423 <Method List getExtensionList()>
	//  161  275:invokeinterface #584 <Method int List.hashCode()>
	//  162  280:iadd            
	//  163  281:istore_1        
		j = i;
	//  164  282:iload_1         
	//  165  283:istore_2        
		if(hasOptions())
	//* 166  284:aload_0         
	//* 167  285:invokevirtual   #426 <Method boolean hasOptions()>
	//* 168  288:ifeq            310
			j = (i * 37 + 8) * 53 + getOptions().hashCode();
	//  169  291:iload_1         
	//  170  292:bipush          37
	//  171  294:imul            
	//  172  295:bipush          8
	//  173  297:iadd            
	//  174  298:bipush          53
	//  175  300:imul            
	//  176  301:aload_0         
	//  177  302:invokevirtual   #429 <Method DescriptorProtos$FileOptions getOptions()>
	//  178  305:invokevirtual   #595 <Method int DescriptorProtos$FileOptions.hashCode()>
	//  179  308:iadd            
	//  180  309:istore_2        
		i = j;
	//  181  310:iload_2         
	//  182  311:istore_1        
		if(hasSourceCodeInfo())
	//* 183  312:aload_0         
	//* 184  313:invokevirtual   #433 <Method boolean hasSourceCodeInfo()>
	//* 185  316:ifeq            338
			i = (j * 37 + 9) * 53 + getSourceCodeInfo().hashCode();
	//  186  319:iload_2         
	//  187  320:bipush          37
	//  188  322:imul            
	//  189  323:bipush          9
	//  190  325:iadd            
	//  191  326:bipush          53
	//  192  328:imul            
	//  193  329:aload_0         
	//  194  330:invokevirtual   #436 <Method DescriptorProtos$SourceCodeInfo getSourceCodeInfo()>
	//  195  333:invokevirtual   #596 <Method int DescriptorProtos$SourceCodeInfo.hashCode()>
	//  196  336:iadd            
	//  197  337:istore_1        
		j = i;
	//  198  338:iload_1         
	//  199  339:istore_2        
		if(hasSyntax())
	//* 200  340:aload_0         
	//* 201  341:invokevirtual   #440 <Method boolean hasSyntax()>
	//* 202  344:ifeq            366
			j = (i * 37 + 12) * 53 + getSyntax().hashCode();
	//  203  347:iload_1         
	//  204  348:bipush          37
	//  205  350:imul            
	//  206  351:bipush          12
	//  207  353:iadd            
	//  208  354:bipush          53
	//  209  356:imul            
	//  210  357:aload_0         
	//  211  358:invokevirtual   #443 <Method String getSyntax()>
	//  212  361:invokevirtual   #579 <Method int String.hashCode()>
	//  213  364:iadd            
	//  214  365:istore_2        
		i = j * 29 + unknownFields.hashCode();
	//  215  366:iload_2         
	//  216  367:bipush          29
	//  217  369:imul            
	//  218  370:aload_0         
	//  219  371:getfield        #258 <Field UnknownFieldSet unknownFields>
	//  220  374:invokevirtual   #597 <Method int UnknownFieldSet.hashCode()>
	//  221  377:iadd            
	//  222  378:istore_1        
		memoizedHashCode = i;
	//  223  379:aload_0         
	//  224  380:iload_1         
	//  225  381:putfield        #574 <Field int memoizedHashCode>
		return i;
	//  226  384:iload_1         
	//  227  385:ireturn         
	}

	protected  internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$800().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$FileDescriptorProto, com/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder);
	//    0    0:invokestatic    #602 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$800()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$FileDescriptorProto>
	//    2    5:ldc1            #13  <Class DescriptorProtos$FileDescriptorProto$Builder>
	//    3    7:invokevirtual   #608 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field byte memoizedIsInitialized>
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
		for(int i = 0; i < getMessageTypeCount(); i++)
	//*  12   18:iconst_0        
	//*  13   19:istore_1        
	//*  14   20:iload_1         
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #588 <Method int getMessageTypeCount()>
	//*  17   25:icmpge          53
			if(!getMessageType(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #611 <Method DescriptorProtos$DescriptorProto getMessageType(int)>
	//*  21   33:invokevirtual   #613 <Method boolean DescriptorProtos$DescriptorProto.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #88  <Field byte memoizedIsInitialized>
				return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
			}

	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_1        
	//*  32   50:goto            20
		for(int j = 0; j < getEnumTypeCount(); j++)
	//*  33   53:iconst_0        
	//*  34   54:istore_1        
	//*  35   55:iload_1         
	//*  36   56:aload_0         
	//*  37   57:invokevirtual   #590 <Method int getEnumTypeCount()>
	//*  38   60:icmpge          88
			if(!getEnumType(j).isInitialized())
	//*  39   63:aload_0         
	//*  40   64:iload_1         
	//*  41   65:invokevirtual   #615 <Method DescriptorProtos$EnumDescriptorProto getEnumType(int)>
	//*  42   68:invokevirtual   #616 <Method boolean DescriptorProtos$EnumDescriptorProto.isInitialized()>
	//*  43   71:ifne            81
			{
				memoizedIsInitialized = 0;
	//   44   74:aload_0         
	//   45   75:iconst_0        
	//   46   76:putfield        #88  <Field byte memoizedIsInitialized>
				return false;
	//   47   79:iconst_0        
	//   48   80:ireturn         
			}

	//   49   81:iload_1         
	//   50   82:iconst_1        
	//   51   83:iadd            
	//   52   84:istore_1        
	//*  53   85:goto            55
		for(int k = 0; k < getServiceCount(); k++)
	//*  54   88:iconst_0        
	//*  55   89:istore_1        
	//*  56   90:iload_1         
	//*  57   91:aload_0         
	//*  58   92:invokevirtual   #592 <Method int getServiceCount()>
	//*  59   95:icmpge          123
			if(!getService(k).isInitialized())
	//*  60   98:aload_0         
	//*  61   99:iload_1         
	//*  62  100:invokevirtual   #618 <Method DescriptorProtos$ServiceDescriptorProto getService(int)>
	//*  63  103:invokevirtual   #619 <Method boolean DescriptorProtos$ServiceDescriptorProto.isInitialized()>
	//*  64  106:ifne            116
			{
				memoizedIsInitialized = 0;
	//   65  109:aload_0         
	//   66  110:iconst_0        
	//   67  111:putfield        #88  <Field byte memoizedIsInitialized>
				return false;
	//   68  114:iconst_0        
	//   69  115:ireturn         
			}

	//   70  116:iload_1         
	//   71  117:iconst_1        
	//   72  118:iadd            
	//   73  119:istore_1        
	//*  74  120:goto            90
		for(int l = 0; l < getExtensionCount(); l++)
	//*  75  123:iconst_0        
	//*  76  124:istore_1        
	//*  77  125:iload_1         
	//*  78  126:aload_0         
	//*  79  127:invokevirtual   #594 <Method int getExtensionCount()>
	//*  80  130:icmpge          158
			if(!getExtension(l).isInitialized())
	//*  81  133:aload_0         
	//*  82  134:iload_1         
	//*  83  135:invokevirtual   #621 <Method DescriptorProtos$FieldDescriptorProto getExtension(int)>
	//*  84  138:invokevirtual   #622 <Method boolean DescriptorProtos$FieldDescriptorProto.isInitialized()>
	//*  85  141:ifne            151
			{
				memoizedIsInitialized = 0;
	//   86  144:aload_0         
	//   87  145:iconst_0        
	//   88  146:putfield        #88  <Field byte memoizedIsInitialized>
				return false;
	//   89  149:iconst_0        
	//   90  150:ireturn         
			}

	//   91  151:iload_1         
	//   92  152:iconst_1        
	//   93  153:iadd            
	//   94  154:istore_1        
	//*  95  155:goto            125
		if(hasOptions() && !getOptions().isInitialized())
	//*  96  158:aload_0         
	//*  97  159:invokevirtual   #426 <Method boolean hasOptions()>
	//*  98  162:ifeq            182
	//*  99  165:aload_0         
	//* 100  166:invokevirtual   #429 <Method DescriptorProtos$FileOptions getOptions()>
	//* 101  169:invokevirtual   #623 <Method boolean DescriptorProtos$FileOptions.isInitialized()>
	//* 102  172:ifne            182
		{
			memoizedIsInitialized = 0;
	//  103  175:aload_0         
	//  104  176:iconst_0        
	//  105  177:putfield        #88  <Field byte memoizedIsInitialized>
			return false;
	//  106  180:iconst_0        
	//  107  181:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//  108  182:aload_0         
	//  109  183:iconst_1        
	//  110  184:putfield        #88  <Field byte memoizedIsInitialized>
			return true;
	//  111  187:iconst_1        
	//  112  188:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #626 <Method DescriptorProtos$FileDescriptorProto$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #13  <Class DescriptorProtos$FileDescriptorProto$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #630 <Method void DescriptorProtos$FileDescriptorProto$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #633 <Method DescriptorProtos$FileDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #636 <Method DescriptorProtos$FileDescriptorProto$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #633 <Method DescriptorProtos$FileDescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #81  <Field DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #13  <Class DescriptorProtos$FileDescriptorProto$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #640 <Method void DescriptorProtos$FileDescriptorProto$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #13  <Class DescriptorProtos$FileDescriptorProto$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #640 <Method void DescriptorProtos$FileDescriptorProto$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #324 <Method DescriptorProtos$FileDescriptorProto$Builder DescriptorProtos$FileDescriptorProto$Builder.mergeFrom(DescriptorProtos$FileDescriptorProto)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method DescriptorProtos$FileDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method DescriptorProtos$FileDescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			GeneratedMessageV3.writeString(codedoutputstream, 1, name_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #92  <Field Object name_>
	//   10   16:invokestatic    #646 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 2) == 2)
	//*  11   19:aload_0         
	//*  12   20:getfield        #151 <Field int bitField0_>
	//*  13   23:iconst_2        
	//*  14   24:iand            
	//*  15   25:iconst_2        
	//*  16   26:icmpne          38
			GeneratedMessageV3.writeString(codedoutputstream, 2, package_);
	//   17   29:aload_1         
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:getfield        #94  <Field Object package_>
	//   21   35:invokestatic    #646 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		for(int i = 0; i < dependency_.size(); i++)
	//*  22   38:iconst_0        
	//*  23   39:istore_2        
	//*  24   40:iload_2         
	//*  25   41:aload_0         
	//*  26   42:getfield        #101 <Field LazyStringList dependency_>
	//*  27   45:invokeinterface #464 <Method int LazyStringList.size()>
	//*  28   50:icmpge          75
			GeneratedMessageV3.writeString(codedoutputstream, 3, dependency_.getRaw(i));
	//   29   53:aload_1         
	//   30   54:iconst_3        
	//   31   55:aload_0         
	//   32   56:getfield        #101 <Field LazyStringList dependency_>
	//   33   59:iload_2         
	//   34   60:invokeinterface #532 <Method Object LazyStringList.getRaw(int)>
	//   35   65:invokestatic    #646 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>

	//   36   68:iload_2         
	//   37   69:iconst_1        
	//   38   70:iadd            
	//   39   71:istore_2        
	//*  40   72:goto            40
		for(int j = 0; j < messageType_.size(); j++)
	//*  41   75:iconst_0        
	//*  42   76:istore_2        
	//*  43   77:iload_2         
	//*  44   78:aload_0         
	//*  45   79:getfield        #113 <Field List messageType_>
	//*  46   82:invokeinterface #469 <Method int List.size()>
	//*  47   87:icmpge          115
			codedoutputstream.writeMessage(4, (MessageLite)messageType_.get(j));
	//   48   90:aload_1         
	//   49   91:iconst_4        
	//   50   92:aload_0         
	//   51   93:getfield        #113 <Field List messageType_>
	//   52   96:iload_2         
	//   53   97:invokeinterface #467 <Method Object List.get(int)>
	//   54  102:checkcast       #541 <Class MessageLite>
	//   55  105:invokevirtual   #650 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   56  108:iload_2         
	//   57  109:iconst_1        
	//   58  110:iadd            
	//   59  111:istore_2        
	//*  60  112:goto            77
		for(int k = 0; k < enumType_.size(); k++)
	//*  61  115:iconst_0        
	//*  62  116:istore_2        
	//*  63  117:iload_2         
	//*  64  118:aload_0         
	//*  65  119:getfield        #115 <Field List enumType_>
	//*  66  122:invokeinterface #469 <Method int List.size()>
	//*  67  127:icmpge          155
			codedoutputstream.writeMessage(5, (MessageLite)enumType_.get(k));
	//   68  130:aload_1         
	//   69  131:iconst_5        
	//   70  132:aload_0         
	//   71  133:getfield        #115 <Field List enumType_>
	//   72  136:iload_2         
	//   73  137:invokeinterface #467 <Method Object List.get(int)>
	//   74  142:checkcast       #541 <Class MessageLite>
	//   75  145:invokevirtual   #650 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   76  148:iload_2         
	//   77  149:iconst_1        
	//   78  150:iadd            
	//   79  151:istore_2        
	//*  80  152:goto            117
		for(int l = 0; l < service_.size(); l++)
	//*  81  155:iconst_0        
	//*  82  156:istore_2        
	//*  83  157:iload_2         
	//*  84  158:aload_0         
	//*  85  159:getfield        #117 <Field List service_>
	//*  86  162:invokeinterface #469 <Method int List.size()>
	//*  87  167:icmpge          196
			codedoutputstream.writeMessage(6, (MessageLite)service_.get(l));
	//   88  170:aload_1         
	//   89  171:bipush          6
	//   90  173:aload_0         
	//   91  174:getfield        #117 <Field List service_>
	//   92  177:iload_2         
	//   93  178:invokeinterface #467 <Method Object List.get(int)>
	//   94  183:checkcast       #541 <Class MessageLite>
	//   95  186:invokevirtual   #650 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   96  189:iload_2         
	//   97  190:iconst_1        
	//   98  191:iadd            
	//   99  192:istore_2        
	//* 100  193:goto            157
		for(int i1 = 0; i1 < extension_.size(); i1++)
	//* 101  196:iconst_0        
	//* 102  197:istore_2        
	//* 103  198:iload_2         
	//* 104  199:aload_0         
	//* 105  200:getfield        #119 <Field List extension_>
	//* 106  203:invokeinterface #469 <Method int List.size()>
	//* 107  208:icmpge          237
			codedoutputstream.writeMessage(7, (MessageLite)extension_.get(i1));
	//  108  211:aload_1         
	//  109  212:bipush          7
	//  110  214:aload_0         
	//  111  215:getfield        #119 <Field List extension_>
	//  112  218:iload_2         
	//  113  219:invokeinterface #467 <Method Object List.get(int)>
	//  114  224:checkcast       #541 <Class MessageLite>
	//  115  227:invokevirtual   #650 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//  116  230:iload_2         
	//  117  231:iconst_1        
	//  118  232:iadd            
	//  119  233:istore_2        
	//* 120  234:goto            198
		if((bitField0_ & 4) == 4)
	//* 121  237:aload_0         
	//* 122  238:getfield        #151 <Field int bitField0_>
	//* 123  241:iconst_4        
	//* 124  242:iand            
	//* 125  243:iconst_4        
	//* 126  244:icmpne          257
			codedoutputstream.writeMessage(8, ((MessageLite) (getOptions())));
	//  127  247:aload_1         
	//  128  248:bipush          8
	//  129  250:aload_0         
	//  130  251:invokevirtual   #429 <Method DescriptorProtos$FileOptions getOptions()>
	//  131  254:invokevirtual   #650 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		if((bitField0_ & 8) == 8)
	//* 132  257:aload_0         
	//* 133  258:getfield        #151 <Field int bitField0_>
	//* 134  261:bipush          8
	//* 135  263:iand            
	//* 136  264:bipush          8
	//* 137  266:icmpne          279
			codedoutputstream.writeMessage(9, ((MessageLite) (getSourceCodeInfo())));
	//  138  269:aload_1         
	//  139  270:bipush          9
	//  140  272:aload_0         
	//  141  273:invokevirtual   #436 <Method DescriptorProtos$SourceCodeInfo getSourceCodeInfo()>
	//  142  276:invokevirtual   #650 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		for(int j1 = 0; j1 < publicDependency_.size(); j1++)
	//* 143  279:iconst_0        
	//* 144  280:istore_2        
	//* 145  281:iload_2         
	//* 146  282:aload_0         
	//* 147  283:getfield        #109 <Field List publicDependency_>
	//* 148  286:invokeinterface #469 <Method int List.size()>
	//* 149  291:icmpge          323
			codedoutputstream.writeInt32(10, ((Integer)publicDependency_.get(j1)).intValue());
	//  150  294:aload_1         
	//  151  295:bipush          10
	//  152  297:aload_0         
	//  153  298:getfield        #109 <Field List publicDependency_>
	//  154  301:iload_2         
	//  155  302:invokeinterface #467 <Method Object List.get(int)>
	//  156  307:checkcast       #222 <Class Integer>
	//  157  310:invokevirtual   #519 <Method int Integer.intValue()>
	//  158  313:invokevirtual   #654 <Method void CodedOutputStream.writeInt32(int, int)>

	//  159  316:iload_2         
	//  160  317:iconst_1        
	//  161  318:iadd            
	//  162  319:istore_2        
	//* 163  320:goto            281
		for(int k1 = 0; k1 < weakDependency_.size(); k1++)
	//* 164  323:iconst_0        
	//* 165  324:istore_2        
	//* 166  325:iload_2         
	//* 167  326:aload_0         
	//* 168  327:getfield        #111 <Field List weakDependency_>
	//* 169  330:invokeinterface #469 <Method int List.size()>
	//* 170  335:icmpge          367
			codedoutputstream.writeInt32(11, ((Integer)weakDependency_.get(k1)).intValue());
	//  171  338:aload_1         
	//  172  339:bipush          11
	//  173  341:aload_0         
	//  174  342:getfield        #111 <Field List weakDependency_>
	//  175  345:iload_2         
	//  176  346:invokeinterface #467 <Method Object List.get(int)>
	//  177  351:checkcast       #222 <Class Integer>
	//  178  354:invokevirtual   #519 <Method int Integer.intValue()>
	//  179  357:invokevirtual   #654 <Method void CodedOutputStream.writeInt32(int, int)>

	//  180  360:iload_2         
	//  181  361:iconst_1        
	//  182  362:iadd            
	//  183  363:istore_2        
	//* 184  364:goto            325
		if((bitField0_ & 0x10) == 16)
	//* 185  367:aload_0         
	//* 186  368:getfield        #151 <Field int bitField0_>
	//* 187  371:bipush          16
	//* 188  373:iand            
	//* 189  374:bipush          16
	//* 190  376:icmpne          389
			GeneratedMessageV3.writeString(codedoutputstream, 12, syntax_);
	//  191  379:aload_1         
	//  192  380:bipush          12
	//  193  382:aload_0         
	//  194  383:getfield        #121 <Field Object syntax_>
	//  195  386:invokestatic    #646 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		unknownFields.writeTo(codedoutputstream);
	//  196  389:aload_0         
	//  197  390:getfield        #258 <Field UnknownFieldSet unknownFields>
	//  198  393:aload_1         
	//  199  394:invokevirtual   #656 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//  200  397:return          
	}

	private static final DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE = new DescriptorProtos$FileDescriptorProto();
	public static final int DEPENDENCY_FIELD_NUMBER = 3;
	public static final int ENUM_TYPE_FIELD_NUMBER = 5;
	public static final int EXTENSION_FIELD_NUMBER = 7;
	public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
	public static final int NAME_FIELD_NUMBER = 1;
	public static final int OPTIONS_FIELD_NUMBER = 8;
	public static final int PACKAGE_FIELD_NUMBER = 2;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.FileDescriptorProto parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.FileDescriptorProto(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$FileDescriptorProto>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$FileDescriptorProto(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$FileDescriptorProto parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
	public static final int SERVICE_FIELD_NUMBER = 6;
	public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
	public static final int SYNTAX_FIELD_NUMBER = 12;
	public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private LazyStringList dependency_;
	private List enumType_;
	private List extension_;
	private byte memoizedIsInitialized;
	private List messageType_;
	private volatile Object name_;
	private DescriptorProtos.FileOptions options_;
	private volatile Object package_;
	private List publicDependency_;
	private List service_;
	private DescriptorProtos.SourceCodeInfo sourceCodeInfo_;
	private volatile Object syntax_;
	private List weakDependency_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$FileDescriptorProto>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void DescriptorProtos$FileDescriptorProto()>
	//    3    7:putstatic       #81  <Field DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE>
	//    4   10:new             #11  <Class DescriptorProtos$FileDescriptorProto$1>
	//    5   13:dup             
	//    6   14:invokespecial   #82  <Method void DescriptorProtos$FileDescriptorProto$1()>
	//    7   17:putstatic       #84  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$1200(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Object name_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$1202(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, Object obj)
	{
		descriptorprotos$filedescriptorproto.name_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field Object name_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$1300(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.package_;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Object package_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$1302(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, Object obj)
	{
		descriptorprotos$filedescriptorproto.package_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field Object package_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static LazyStringList access$1400(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.dependency_;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field LazyStringList dependency_>
	//    2    4:areturn         
	}

*/


/*
	static LazyStringList access$1402(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, LazyStringList lazystringlist)
	{
		descriptorprotos$filedescriptorproto.dependency_ = lazystringlist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field LazyStringList dependency_>
		return lazystringlist;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$1500(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.publicDependency_;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field List publicDependency_>
	//    2    4:areturn         
	}

*/


/*
	static List access$1502(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, List list)
	{
		descriptorprotos$filedescriptorproto.publicDependency_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field List publicDependency_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$1600(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.weakDependency_;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field List weakDependency_>
	//    2    4:areturn         
	}

*/


/*
	static List access$1602(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, List list)
	{
		descriptorprotos$filedescriptorproto.weakDependency_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field List weakDependency_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$1700(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.messageType_;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List messageType_>
	//    2    4:areturn         
	}

*/


/*
	static List access$1702(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, List list)
	{
		descriptorprotos$filedescriptorproto.messageType_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field List messageType_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$1800(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.enumType_;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field List enumType_>
	//    2    4:areturn         
	}

*/


/*
	static List access$1802(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, List list)
	{
		descriptorprotos$filedescriptorproto.enumType_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field List enumType_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$1900(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.service_;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field List service_>
	//    2    4:areturn         
	}

*/


/*
	static List access$1902(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, List list)
	{
		descriptorprotos$filedescriptorproto.service_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field List service_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$2000(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.extension_;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List extension_>
	//    2    4:areturn         
	}

*/


/*
	static List access$2002(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, List list)
	{
		descriptorprotos$filedescriptorproto.extension_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field List extension_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static DescriptorProtos.FileOptions access$2102(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, DescriptorProtos.FileOptions fileoptions)
	{
		descriptorprotos$filedescriptorproto.options_ = fileoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #184 <Field DescriptorProtos$FileOptions options_>
		return fileoptions;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static DescriptorProtos.SourceCodeInfo access$2202(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, DescriptorProtos.SourceCodeInfo sourcecodeinfo)
	{
		descriptorprotos$filedescriptorproto.sourceCodeInfo_ = sourcecodeinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #203 <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		return sourcecodeinfo;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$2300(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto)
	{
		return descriptorprotos$filedescriptorproto.syntax_;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Object syntax_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$2302(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, Object obj)
	{
		descriptorprotos$filedescriptorproto.syntax_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field Object syntax_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$2402(DescriptorProtos$FileDescriptorProto descriptorprotos$filedescriptorproto, int i)
	{
		descriptorprotos$filedescriptorproto.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #151 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$FileDescriptorProto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #88  <Field byte memoizedIsInitialized>
		name_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #90  <String "">
	//    7   12:putfield        #92  <Field Object name_>
		package_ = "";
	//    8   15:aload_0         
	//    9   16:ldc1            #90  <String "">
	//   10   18:putfield        #94  <Field Object package_>
		dependency_ = LazyStringArrayList.EMPTY;
	//   11   21:aload_0         
	//   12   22:getstatic       #99  <Field LazyStringList LazyStringArrayList.EMPTY>
	//   13   25:putfield        #101 <Field LazyStringList dependency_>
		publicDependency_ = Collections.emptyList();
	//   14   28:aload_0         
	//   15   29:invokestatic    #107 <Method List Collections.emptyList()>
	//   16   32:putfield        #109 <Field List publicDependency_>
		weakDependency_ = Collections.emptyList();
	//   17   35:aload_0         
	//   18   36:invokestatic    #107 <Method List Collections.emptyList()>
	//   19   39:putfield        #111 <Field List weakDependency_>
		messageType_ = Collections.emptyList();
	//   20   42:aload_0         
	//   21   43:invokestatic    #107 <Method List Collections.emptyList()>
	//   22   46:putfield        #113 <Field List messageType_>
		enumType_ = Collections.emptyList();
	//   23   49:aload_0         
	//   24   50:invokestatic    #107 <Method List Collections.emptyList()>
	//   25   53:putfield        #115 <Field List enumType_>
		service_ = Collections.emptyList();
	//   26   56:aload_0         
	//   27   57:invokestatic    #107 <Method List Collections.emptyList()>
	//   28   60:putfield        #117 <Field List service_>
		extension_ = Collections.emptyList();
	//   29   63:aload_0         
	//   30   64:invokestatic    #107 <Method List Collections.emptyList()>
	//   31   67:putfield        #119 <Field List extension_>
		syntax_ = "";
	//   32   70:aload_0         
	//   33   71:ldc1            #90  <String "">
	//   34   73:putfield        #121 <Field Object syntax_>
	//   35   76:return          
	}

	private DescriptorProtos$FileDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void DescriptorProtos$FileDescriptorProto()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #128 <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #129 <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #135 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          11
		flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L45:
		int j;
		int k;
		int l;
		if(flag)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            1450
		k = i;
	//   16   31:iload_3         
	//   17   32:istore          5
		l = i;
	//   18   34:iload_3         
	//   19   35:istore          6
		j = i;
	//   20   37:iload_3         
	//   21   38:istore          4
		int j1 = codedinputstream.readTag();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #141 <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		j1;
	//   25   46:iload           9
		JVM INSTR lookupswitch 15: default 1804
	//	               0: 1807
	//	               10: 214
	//	               18: 269
	//	               26: 324
	//	               34: 400
	//	               42: 471
	//	               50: 542
	//	               58: 616
	//	               66: 690
	//	               74: 821
	//	               80: 955
	//	               82: 1025
	//	               88: 1173
	//	               90: 1243
	//	               98: 1391;
	//   26   48:lookupswitch    15: default 1804
	//	               0: 1807
	//	               10: 214
	//	               18: 269
	//	               26: 324
	//	               34: 400
	//	               42: 471
	//	               50: 542
	//	               58: 616
	//	               66: 690
	//	               74: 821
	//	               80: 955
	//	               82: 1025
	//	               88: 1173
	//	               90: 1243
	//	               98: 1391
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
		int i1;
		i1 = i;
	//   27  180:iload_3         
	//   28  181:istore          7
		k = i;
	//   29  183:iload_3         
	//   30  184:istore          5
		l = i;
	//   31  186:iload_3         
	//   32  187:istore          6
		j = i;
	//   33  189:iload_3         
	//   34  190:istore          4
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, j1))
	//*  35  192:aload_0         
	//*  36  193:aload_1         
	//*  37  194:aload           11
	//*  38  196:aload_2         
	//*  39  197:iload           9
	//*  40  199:invokevirtual   #145 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  202:ifne            1444
		{
			flag = true;
	//   42  205:iconst_1        
	//   43  206:istore          8
			i1 = i;
	//   44  208:iload_3         
	//   45  209:istore          7
		}
		  goto _L17
	//*  46  211:goto            1444
_L3:
		k = i;
	//   47  214:iload_3         
	//   48  215:istore          5
		l = i;
	//   49  217:iload_3         
	//   50  218:istore          6
		j = i;
	//   51  220:iload_3         
	//   52  221:istore          4
		Object obj = ((Object) (codedinputstream.readBytes()));
	//   53  223:aload_1         
	//   54  224:invokevirtual   #149 <Method ByteString CodedInputStream.readBytes()>
	//   55  227:astore          10
		k = i;
	//   56  229:iload_3         
	//   57  230:istore          5
		l = i;
	//   58  232:iload_3         
	//   59  233:istore          6
		j = i;
	//   60  235:iload_3         
	//   61  236:istore          4
		bitField0_ = bitField0_ | 1;
	//   62  238:aload_0         
	//   63  239:aload_0         
	//   64  240:getfield        #151 <Field int bitField0_>
	//   65  243:iconst_1        
	//   66  244:ior             
	//   67  245:putfield        #151 <Field int bitField0_>
		k = i;
	//   68  248:iload_3         
	//   69  249:istore          5
		l = i;
	//   70  251:iload_3         
	//   71  252:istore          6
		j = i;
	//   72  254:iload_3         
	//   73  255:istore          4
		name_ = obj;
	//   74  257:aload_0         
	//   75  258:aload           10
	//   76  260:putfield        #92  <Field Object name_>
		i1 = i;
	//   77  263:iload_3         
	//   78  264:istore          7
		  goto _L17
	//*  79  266:goto            1444
_L4:
		k = i;
	//   80  269:iload_3         
	//   81  270:istore          5
		l = i;
	//   82  272:iload_3         
	//   83  273:istore          6
		j = i;
	//   84  275:iload_3         
	//   85  276:istore          4
		obj = ((Object) (codedinputstream.readBytes()));
	//   86  278:aload_1         
	//   87  279:invokevirtual   #149 <Method ByteString CodedInputStream.readBytes()>
	//   88  282:astore          10
		k = i;
	//   89  284:iload_3         
	//   90  285:istore          5
		l = i;
	//   91  287:iload_3         
	//   92  288:istore          6
		j = i;
	//   93  290:iload_3         
	//   94  291:istore          4
		bitField0_ = bitField0_ | 2;
	//   95  293:aload_0         
	//   96  294:aload_0         
	//   97  295:getfield        #151 <Field int bitField0_>
	//   98  298:iconst_2        
	//   99  299:ior             
	//  100  300:putfield        #151 <Field int bitField0_>
		k = i;
	//  101  303:iload_3         
	//  102  304:istore          5
		l = i;
	//  103  306:iload_3         
	//  104  307:istore          6
		j = i;
	//  105  309:iload_3         
	//  106  310:istore          4
		package_ = obj;
	//  107  312:aload_0         
	//  108  313:aload           10
	//  109  315:putfield        #94  <Field Object package_>
		i1 = i;
	//  110  318:iload_3         
	//  111  319:istore          7
		  goto _L17
	//* 112  321:goto            1444
_L5:
		k = i;
	//  113  324:iload_3         
	//  114  325:istore          5
		l = i;
	//  115  327:iload_3         
	//  116  328:istore          6
		j = i;
	//  117  330:iload_3         
	//  118  331:istore          4
		obj = ((Object) (codedinputstream.readBytes()));
	//  119  333:aload_1         
	//  120  334:invokevirtual   #149 <Method ByteString CodedInputStream.readBytes()>
	//  121  337:astore          10
		i1 = i;
	//  122  339:iload_3         
	//  123  340:istore          7
		if((i & 4) == 4) goto _L19; else goto _L18
	//  124  342:iload_3         
	//  125  343:iconst_4        
	//  126  344:iand            
	//  127  345:iconst_4        
	//  128  346:icmpeq          374
_L18:
		k = i;
	//  129  349:iload_3         
	//  130  350:istore          5
		l = i;
	//  131  352:iload_3         
	//  132  353:istore          6
		j = i;
	//  133  355:iload_3         
	//  134  356:istore          4
		dependency_ = ((LazyStringList) (new LazyStringArrayList()));
	//  135  358:aload_0         
	//  136  359:new             #96  <Class LazyStringArrayList>
	//  137  362:dup             
	//  138  363:invokespecial   #152 <Method void LazyStringArrayList()>
	//  139  366:putfield        #101 <Field LazyStringList dependency_>
		i1 = i | 4;
	//  140  369:iload_3         
	//  141  370:iconst_4        
	//  142  371:ior             
	//  143  372:istore          7
_L19:
		k = i1;
	//  144  374:iload           7
	//  145  376:istore          5
		l = i1;
	//  146  378:iload           7
	//  147  380:istore          6
		j = i1;
	//  148  382:iload           7
	//  149  384:istore          4
		dependency_.add(((ByteString) (obj)));
	//  150  386:aload_0         
	//  151  387:getfield        #101 <Field LazyStringList dependency_>
	//  152  390:aload           10
	//  153  392:invokeinterface #158 <Method void LazyStringList.add(ByteString)>
		  goto _L17
	//* 154  397:goto            1444
_L6:
		i1 = i;
	//  155  400:iload_3         
	//  156  401:istore          7
		if((i & 0x20) == 32) goto _L21; else goto _L20
	//  157  403:iload_3         
	//  158  404:bipush          32
	//  159  406:iand            
	//  160  407:bipush          32
	//  161  409:icmpeq          438
_L20:
		k = i;
	//  162  412:iload_3         
	//  163  413:istore          5
		l = i;
	//  164  415:iload_3         
	//  165  416:istore          6
		j = i;
	//  166  418:iload_3         
	//  167  419:istore          4
		messageType_ = ((List) (new ArrayList()));
	//  168  421:aload_0         
	//  169  422:new             #160 <Class ArrayList>
	//  170  425:dup             
	//  171  426:invokespecial   #161 <Method void ArrayList()>
	//  172  429:putfield        #113 <Field List messageType_>
		i1 = i | 0x20;
	//  173  432:iload_3         
	//  174  433:bipush          32
	//  175  435:ior             
	//  176  436:istore          7
_L21:
		k = i1;
	//  177  438:iload           7
	//  178  440:istore          5
		l = i1;
	//  179  442:iload           7
	//  180  444:istore          6
		j = i1;
	//  181  446:iload           7
	//  182  448:istore          4
		messageType_.add(((Object) (codedinputstream.readMessage(DescriptorProtos.DescriptorProto.PARSER, extensionregistrylite))));
	//  183  450:aload_0         
	//  184  451:getfield        #113 <Field List messageType_>
	//  185  454:aload_1         
	//  186  455:getstatic       #164 <Field Parser DescriptorProtos$DescriptorProto.PARSER>
	//  187  458:aload_2         
	//  188  459:invokevirtual   #168 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  189  462:invokeinterface #173 <Method boolean List.add(Object)>
	//  190  467:pop             
		  goto _L17
	//* 191  468:goto            1444
_L7:
		i1 = i;
	//  192  471:iload_3         
	//  193  472:istore          7
		if((i & 0x40) == 64) goto _L23; else goto _L22
	//  194  474:iload_3         
	//  195  475:bipush          64
	//  196  477:iand            
	//  197  478:bipush          64
	//  198  480:icmpeq          509
_L22:
		k = i;
	//  199  483:iload_3         
	//  200  484:istore          5
		l = i;
	//  201  486:iload_3         
	//  202  487:istore          6
		j = i;
	//  203  489:iload_3         
	//  204  490:istore          4
		enumType_ = ((List) (new ArrayList()));
	//  205  492:aload_0         
	//  206  493:new             #160 <Class ArrayList>
	//  207  496:dup             
	//  208  497:invokespecial   #161 <Method void ArrayList()>
	//  209  500:putfield        #115 <Field List enumType_>
		i1 = i | 0x40;
	//  210  503:iload_3         
	//  211  504:bipush          64
	//  212  506:ior             
	//  213  507:istore          7
_L23:
		k = i1;
	//  214  509:iload           7
	//  215  511:istore          5
		l = i1;
	//  216  513:iload           7
	//  217  515:istore          6
		j = i1;
	//  218  517:iload           7
	//  219  519:istore          4
		enumType_.add(((Object) (codedinputstream.readMessage(DescriptorProtos$EnumDescriptorProto.PARSER, extensionregistrylite))));
	//  220  521:aload_0         
	//  221  522:getfield        #115 <Field List enumType_>
	//  222  525:aload_1         
	//  223  526:getstatic       #176 <Field Parser DescriptorProtos$EnumDescriptorProto.PARSER>
	//  224  529:aload_2         
	//  225  530:invokevirtual   #168 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  226  533:invokeinterface #173 <Method boolean List.add(Object)>
	//  227  538:pop             
		  goto _L17
	//* 228  539:goto            1444
_L8:
		i1 = i;
	//  229  542:iload_3         
	//  230  543:istore          7
		if((i & 0x80) == 128) goto _L25; else goto _L24
	//  231  545:iload_3         
	//  232  546:sipush          128
	//  233  549:iand            
	//  234  550:sipush          128
	//  235  553:icmpeq          583
_L24:
		k = i;
	//  236  556:iload_3         
	//  237  557:istore          5
		l = i;
	//  238  559:iload_3         
	//  239  560:istore          6
		j = i;
	//  240  562:iload_3         
	//  241  563:istore          4
		service_ = ((List) (new ArrayList()));
	//  242  565:aload_0         
	//  243  566:new             #160 <Class ArrayList>
	//  244  569:dup             
	//  245  570:invokespecial   #161 <Method void ArrayList()>
	//  246  573:putfield        #117 <Field List service_>
		i1 = i | 0x80;
	//  247  576:iload_3         
	//  248  577:sipush          128
	//  249  580:ior             
	//  250  581:istore          7
_L25:
		k = i1;
	//  251  583:iload           7
	//  252  585:istore          5
		l = i1;
	//  253  587:iload           7
	//  254  589:istore          6
		j = i1;
	//  255  591:iload           7
	//  256  593:istore          4
		service_.add(((Object) (codedinputstream.readMessage(to.PARSER, extensionregistrylite))));
	//  257  595:aload_0         
	//  258  596:getfield        #117 <Field List service_>
	//  259  599:aload_1         
	//  260  600:getstatic       #179 <Field Parser DescriptorProtos$ServiceDescriptorProto.PARSER>
	//  261  603:aload_2         
	//  262  604:invokevirtual   #168 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  263  607:invokeinterface #173 <Method boolean List.add(Object)>
	//  264  612:pop             
		  goto _L17
	//* 265  613:goto            1444
_L9:
		i1 = i;
	//  266  616:iload_3         
	//  267  617:istore          7
		if((i & 0x100) == 256) goto _L27; else goto _L26
	//  268  619:iload_3         
	//  269  620:sipush          256
	//  270  623:iand            
	//  271  624:sipush          256
	//  272  627:icmpeq          657
_L26:
		k = i;
	//  273  630:iload_3         
	//  274  631:istore          5
		l = i;
	//  275  633:iload_3         
	//  276  634:istore          6
		j = i;
	//  277  636:iload_3         
	//  278  637:istore          4
		extension_ = ((List) (new ArrayList()));
	//  279  639:aload_0         
	//  280  640:new             #160 <Class ArrayList>
	//  281  643:dup             
	//  282  644:invokespecial   #161 <Method void ArrayList()>
	//  283  647:putfield        #119 <Field List extension_>
		i1 = i | 0x100;
	//  284  650:iload_3         
	//  285  651:sipush          256
	//  286  654:ior             
	//  287  655:istore          7
_L27:
		k = i1;
	//  288  657:iload           7
	//  289  659:istore          5
		l = i1;
	//  290  661:iload           7
	//  291  663:istore          6
		j = i1;
	//  292  665:iload           7
	//  293  667:istore          4
		extension_.add(((Object) (codedinputstream.readMessage(.PARSER, extensionregistrylite))));
	//  294  669:aload_0         
	//  295  670:getfield        #119 <Field List extension_>
	//  296  673:aload_1         
	//  297  674:getstatic       #182 <Field Parser DescriptorProtos$FieldDescriptorProto.PARSER>
	//  298  677:aload_2         
	//  299  678:invokevirtual   #168 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  300  681:invokeinterface #173 <Method boolean List.add(Object)>
	//  301  686:pop             
		  goto _L17
	//* 302  687:goto            1444
_L10:
		obj = null;
	//  303  690:aconst_null     
	//  304  691:astore          10
		k = i;
	//  305  693:iload_3         
	//  306  694:istore          5
		l = i;
	//  307  696:iload_3         
	//  308  697:istore          6
		j = i;
	//  309  699:iload_3         
	//  310  700:istore          4
		if((bitField0_ & 4) != 4) goto _L29; else goto _L28
	//  311  702:aload_0         
	//  312  703:getfield        #151 <Field int bitField0_>
	//  313  706:iconst_4        
	//  314  707:iand            
	//  315  708:iconst_4        
	//  316  709:icmpne          730
_L28:
		k = i;
	//  317  712:iload_3         
	//  318  713:istore          5
		l = i;
	//  319  715:iload_3         
	//  320  716:istore          6
		j = i;
	//  321  718:iload_3         
	//  322  719:istore          4
		obj = ((Object) (options_.toBuilder()));
	//  323  721:aload_0         
	//  324  722:getfield        #184 <Field DescriptorProtos$FileOptions options_>
	//  325  725:invokevirtual   #190 <Method DescriptorProtos$FileOptions$Builder DescriptorProtos$FileOptions.toBuilder()>
	//  326  728:astore          10
_L29:
		k = i;
	//  327  730:iload_3         
	//  328  731:istore          5
		l = i;
	//  329  733:iload_3         
	//  330  734:istore          6
		j = i;
	//  331  736:iload_3         
	//  332  737:istore          4
		options_ = (DescriptorProtos.FileOptions)codedinputstream.readMessage(DescriptorProtos.FileOptions.PARSER, extensionregistrylite);
	//  333  739:aload_0         
	//  334  740:aload_1         
	//  335  741:getstatic       #191 <Field Parser DescriptorProtos$FileOptions.PARSER>
	//  336  744:aload_2         
	//  337  745:invokevirtual   #168 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  338  748:checkcast       #186 <Class DescriptorProtos$FileOptions>
	//  339  751:putfield        #184 <Field DescriptorProtos$FileOptions options_>
		if(obj == null) goto _L31; else goto _L30
	//  340  754:aload           10
	//  341  756:ifnull          796
_L30:
		k = i;
	//  342  759:iload_3         
	//  343  760:istore          5
		l = i;
	//  344  762:iload_3         
	//  345  763:istore          6
		j = i;
	//  346  765:iload_3         
	//  347  766:istore          4
		((DescriptorProtos$FileOptions$Builder) (obj)).mergeFrom(options_);
	//  348  768:aload           10
	//  349  770:aload_0         
	//  350  771:getfield        #184 <Field DescriptorProtos$FileOptions options_>
	//  351  774:invokevirtual   #197 <Method DescriptorProtos$FileOptions$Builder DescriptorProtos$FileOptions$Builder.mergeFrom(DescriptorProtos$FileOptions)>
	//  352  777:pop             
		k = i;
	//  353  778:iload_3         
	//  354  779:istore          5
		l = i;
	//  355  781:iload_3         
	//  356  782:istore          6
		j = i;
	//  357  784:iload_3         
	//  358  785:istore          4
		options_ = ((DescriptorProtos$FileOptions$Builder) (obj)).buildPartial();
	//  359  787:aload_0         
	//  360  788:aload           10
	//  361  790:invokevirtual   #201 <Method DescriptorProtos$FileOptions DescriptorProtos$FileOptions$Builder.buildPartial()>
	//  362  793:putfield        #184 <Field DescriptorProtos$FileOptions options_>
_L31:
		k = i;
	//  363  796:iload_3         
	//  364  797:istore          5
		l = i;
	//  365  799:iload_3         
	//  366  800:istore          6
		j = i;
	//  367  802:iload_3         
	//  368  803:istore          4
		bitField0_ = bitField0_ | 4;
	//  369  805:aload_0         
	//  370  806:aload_0         
	//  371  807:getfield        #151 <Field int bitField0_>
	//  372  810:iconst_4        
	//  373  811:ior             
	//  374  812:putfield        #151 <Field int bitField0_>
		i1 = i;
	//  375  815:iload_3         
	//  376  816:istore          7
		  goto _L17
	//* 377  818:goto            1444
_L11:
		obj = null;
	//  378  821:aconst_null     
	//  379  822:astore          10
		k = i;
	//  380  824:iload_3         
	//  381  825:istore          5
		l = i;
	//  382  827:iload_3         
	//  383  828:istore          6
		j = i;
	//  384  830:iload_3         
	//  385  831:istore          4
		if((bitField0_ & 8) != 8) goto _L33; else goto _L32
	//  386  833:aload_0         
	//  387  834:getfield        #151 <Field int bitField0_>
	//  388  837:bipush          8
	//  389  839:iand            
	//  390  840:bipush          8
	//  391  842:icmpne          863
_L32:
		k = i;
	//  392  845:iload_3         
	//  393  846:istore          5
		l = i;
	//  394  848:iload_3         
	//  395  849:istore          6
		j = i;
	//  396  851:iload_3         
	//  397  852:istore          4
		obj = ((Object) (sourceCodeInfo_.toBuilder()));
	//  398  854:aload_0         
	//  399  855:getfield        #203 <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
	//  400  858:invokevirtual   #208 <Method DescriptorProtos$SourceCodeInfo$Builder DescriptorProtos$SourceCodeInfo.toBuilder()>
	//  401  861:astore          10
_L33:
		k = i;
	//  402  863:iload_3         
	//  403  864:istore          5
		l = i;
	//  404  866:iload_3         
	//  405  867:istore          6
		j = i;
	//  406  869:iload_3         
	//  407  870:istore          4
		sourceCodeInfo_ = (DescriptorProtos.SourceCodeInfo)codedinputstream.readMessage(DescriptorProtos.SourceCodeInfo.PARSER, extensionregistrylite);
	//  408  872:aload_0         
	//  409  873:aload_1         
	//  410  874:getstatic       #209 <Field Parser DescriptorProtos$SourceCodeInfo.PARSER>
	//  411  877:aload_2         
	//  412  878:invokevirtual   #168 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  413  881:checkcast       #205 <Class DescriptorProtos$SourceCodeInfo>
	//  414  884:putfield        #203 <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
		if(obj == null) goto _L35; else goto _L34
	//  415  887:aload           10
	//  416  889:ifnull          929
_L34:
		k = i;
	//  417  892:iload_3         
	//  418  893:istore          5
		l = i;
	//  419  895:iload_3         
	//  420  896:istore          6
		j = i;
	//  421  898:iload_3         
	//  422  899:istore          4
		((er) (obj)).mergeFrom(sourceCodeInfo_);
	//  423  901:aload           10
	//  424  903:aload_0         
	//  425  904:getfield        #203 <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
	//  426  907:invokevirtual   #214 <Method DescriptorProtos$SourceCodeInfo$Builder DescriptorProtos$SourceCodeInfo$Builder.mergeFrom(DescriptorProtos$SourceCodeInfo)>
	//  427  910:pop             
		k = i;
	//  428  911:iload_3         
	//  429  912:istore          5
		l = i;
	//  430  914:iload_3         
	//  431  915:istore          6
		j = i;
	//  432  917:iload_3         
	//  433  918:istore          4
		sourceCodeInfo_ = ((er) (obj)).buildPartial();
	//  434  920:aload_0         
	//  435  921:aload           10
	//  436  923:invokevirtual   #217 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$SourceCodeInfo$Builder.buildPartial()>
	//  437  926:putfield        #203 <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
_L35:
		k = i;
	//  438  929:iload_3         
	//  439  930:istore          5
		l = i;
	//  440  932:iload_3         
	//  441  933:istore          6
		j = i;
	//  442  935:iload_3         
	//  443  936:istore          4
		bitField0_ = bitField0_ | 8;
	//  444  938:aload_0         
	//  445  939:aload_0         
	//  446  940:getfield        #151 <Field int bitField0_>
	//  447  943:bipush          8
	//  448  945:ior             
	//  449  946:putfield        #151 <Field int bitField0_>
		i1 = i;
	//  450  949:iload_3         
	//  451  950:istore          7
		  goto _L17
	//* 452  952:goto            1444
_L12:
		i1 = i;
	//  453  955:iload_3         
	//  454  956:istore          7
		if((i & 8) == 8) goto _L37; else goto _L36
	//  455  958:iload_3         
	//  456  959:bipush          8
	//  457  961:iand            
	//  458  962:bipush          8
	//  459  964:icmpeq          993
_L36:
		k = i;
	//  460  967:iload_3         
	//  461  968:istore          5
		l = i;
	//  462  970:iload_3         
	//  463  971:istore          6
		j = i;
	//  464  973:iload_3         
	//  465  974:istore          4
		publicDependency_ = ((List) (new ArrayList()));
	//  466  976:aload_0         
	//  467  977:new             #160 <Class ArrayList>
	//  468  980:dup             
	//  469  981:invokespecial   #161 <Method void ArrayList()>
	//  470  984:putfield        #109 <Field List publicDependency_>
		i1 = i | 8;
	//  471  987:iload_3         
	//  472  988:bipush          8
	//  473  990:ior             
	//  474  991:istore          7
_L37:
		k = i1;
	//  475  993:iload           7
	//  476  995:istore          5
		l = i1;
	//  477  997:iload           7
	//  478  999:istore          6
		j = i1;
	//  479 1001:iload           7
	//  480 1003:istore          4
		publicDependency_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
	//  481 1005:aload_0         
	//  482 1006:getfield        #109 <Field List publicDependency_>
	//  483 1009:aload_1         
	//  484 1010:invokevirtual   #220 <Method int CodedInputStream.readInt32()>
	//  485 1013:invokestatic    #226 <Method Integer Integer.valueOf(int)>
	//  486 1016:invokeinterface #173 <Method boolean List.add(Object)>
	//  487 1021:pop             
		  goto _L17
	//* 488 1022:goto            1444
_L13:
		k = i;
	//  489 1025:iload_3         
	//  490 1026:istore          5
		l = i;
	//  491 1028:iload_3         
	//  492 1029:istore          6
		j = i;
	//  493 1031:iload_3         
	//  494 1032:istore          4
		j1 = codedinputstream.pushLimit(codedinputstream.readRawVarint32());
	//  495 1034:aload_1         
	//  496 1035:aload_1         
	//  497 1036:invokevirtual   #229 <Method int CodedInputStream.readRawVarint32()>
	//  498 1039:invokevirtual   #233 <Method int CodedInputStream.pushLimit(int)>
	//  499 1042:istore          9
		i1 = i;
	//  500 1044:iload_3         
	//  501 1045:istore          7
		if((i & 8) == 8)
			break MISSING_BLOCK_LABEL_1101;
	//  502 1047:iload_3         
	//  503 1048:bipush          8
	//  504 1050:iand            
	//  505 1051:bipush          8
	//  506 1053:icmpeq          1101
		i1 = i;
	//  507 1056:iload_3         
	//  508 1057:istore          7
		k = i;
	//  509 1059:iload_3         
	//  510 1060:istore          5
		l = i;
	//  511 1062:iload_3         
	//  512 1063:istore          6
		j = i;
	//  513 1065:iload_3         
	//  514 1066:istore          4
		if(codedinputstream.getBytesUntilLimit() <= 0)
			break MISSING_BLOCK_LABEL_1101;
	//  515 1068:aload_1         
	//  516 1069:invokevirtual   #236 <Method int CodedInputStream.getBytesUntilLimit()>
	//  517 1072:ifle            1101
		k = i;
	//  518 1075:iload_3         
	//  519 1076:istore          5
		l = i;
	//  520 1078:iload_3         
	//  521 1079:istore          6
		j = i;
	//  522 1081:iload_3         
	//  523 1082:istore          4
		publicDependency_ = ((List) (new ArrayList()));
	//  524 1084:aload_0         
	//  525 1085:new             #160 <Class ArrayList>
	//  526 1088:dup             
	//  527 1089:invokespecial   #161 <Method void ArrayList()>
	//  528 1092:putfield        #109 <Field List publicDependency_>
		i1 = i | 8;
	//  529 1095:iload_3         
	//  530 1096:bipush          8
	//  531 1098:ior             
	//  532 1099:istore          7
_L39:
		k = i1;
	//  533 1101:iload           7
	//  534 1103:istore          5
		l = i1;
	//  535 1105:iload           7
	//  536 1107:istore          6
		j = i1;
	//  537 1109:iload           7
	//  538 1111:istore          4
		if(codedinputstream.getBytesUntilLimit() <= 0)
			break; /* Loop/switch isn't completed */
	//  539 1113:aload_1         
	//  540 1114:invokevirtual   #236 <Method int CodedInputStream.getBytesUntilLimit()>
	//  541 1117:ifle            1152
		k = i1;
	//  542 1120:iload           7
	//  543 1122:istore          5
		l = i1;
	//  544 1124:iload           7
	//  545 1126:istore          6
		j = i1;
	//  546 1128:iload           7
	//  547 1130:istore          4
		publicDependency_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
	//  548 1132:aload_0         
	//  549 1133:getfield        #109 <Field List publicDependency_>
	//  550 1136:aload_1         
	//  551 1137:invokevirtual   #220 <Method int CodedInputStream.readInt32()>
	//  552 1140:invokestatic    #226 <Method Integer Integer.valueOf(int)>
	//  553 1143:invokeinterface #173 <Method boolean List.add(Object)>
	//  554 1148:pop             
		if(true) goto _L39; else goto _L38
	//  555 1149:goto            1101
_L38:
		k = i1;
	//  556 1152:iload           7
	//  557 1154:istore          5
		l = i1;
	//  558 1156:iload           7
	//  559 1158:istore          6
		j = i1;
	//  560 1160:iload           7
	//  561 1162:istore          4
		codedinputstream.popLimit(j1);
	//  562 1164:aload_1         
	//  563 1165:iload           9
	//  564 1167:invokevirtual   #240 <Method void CodedInputStream.popLimit(int)>
		  goto _L17
	//* 565 1170:goto            1444
_L14:
		i1 = i;
	//  566 1173:iload_3         
	//  567 1174:istore          7
		if((i & 0x10) == 16) goto _L41; else goto _L40
	//  568 1176:iload_3         
	//  569 1177:bipush          16
	//  570 1179:iand            
	//  571 1180:bipush          16
	//  572 1182:icmpeq          1211
_L40:
		k = i;
	//  573 1185:iload_3         
	//  574 1186:istore          5
		l = i;
	//  575 1188:iload_3         
	//  576 1189:istore          6
		j = i;
	//  577 1191:iload_3         
	//  578 1192:istore          4
		weakDependency_ = ((List) (new ArrayList()));
	//  579 1194:aload_0         
	//  580 1195:new             #160 <Class ArrayList>
	//  581 1198:dup             
	//  582 1199:invokespecial   #161 <Method void ArrayList()>
	//  583 1202:putfield        #111 <Field List weakDependency_>
		i1 = i | 0x10;
	//  584 1205:iload_3         
	//  585 1206:bipush          16
	//  586 1208:ior             
	//  587 1209:istore          7
_L41:
		k = i1;
	//  588 1211:iload           7
	//  589 1213:istore          5
		l = i1;
	//  590 1215:iload           7
	//  591 1217:istore          6
		j = i1;
	//  592 1219:iload           7
	//  593 1221:istore          4
		weakDependency_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
	//  594 1223:aload_0         
	//  595 1224:getfield        #111 <Field List weakDependency_>
	//  596 1227:aload_1         
	//  597 1228:invokevirtual   #220 <Method int CodedInputStream.readInt32()>
	//  598 1231:invokestatic    #226 <Method Integer Integer.valueOf(int)>
	//  599 1234:invokeinterface #173 <Method boolean List.add(Object)>
	//  600 1239:pop             
		  goto _L17
	//* 601 1240:goto            1444
_L15:
		k = i;
	//  602 1243:iload_3         
	//  603 1244:istore          5
		l = i;
	//  604 1246:iload_3         
	//  605 1247:istore          6
		j = i;
	//  606 1249:iload_3         
	//  607 1250:istore          4
		j1 = codedinputstream.pushLimit(codedinputstream.readRawVarint32());
	//  608 1252:aload_1         
	//  609 1253:aload_1         
	//  610 1254:invokevirtual   #229 <Method int CodedInputStream.readRawVarint32()>
	//  611 1257:invokevirtual   #233 <Method int CodedInputStream.pushLimit(int)>
	//  612 1260:istore          9
		i1 = i;
	//  613 1262:iload_3         
	//  614 1263:istore          7
		if((i & 0x10) == 16)
			break MISSING_BLOCK_LABEL_1319;
	//  615 1265:iload_3         
	//  616 1266:bipush          16
	//  617 1268:iand            
	//  618 1269:bipush          16
	//  619 1271:icmpeq          1319
		i1 = i;
	//  620 1274:iload_3         
	//  621 1275:istore          7
		k = i;
	//  622 1277:iload_3         
	//  623 1278:istore          5
		l = i;
	//  624 1280:iload_3         
	//  625 1281:istore          6
		j = i;
	//  626 1283:iload_3         
	//  627 1284:istore          4
		if(codedinputstream.getBytesUntilLimit() <= 0)
			break MISSING_BLOCK_LABEL_1319;
	//  628 1286:aload_1         
	//  629 1287:invokevirtual   #236 <Method int CodedInputStream.getBytesUntilLimit()>
	//  630 1290:ifle            1319
		k = i;
	//  631 1293:iload_3         
	//  632 1294:istore          5
		l = i;
	//  633 1296:iload_3         
	//  634 1297:istore          6
		j = i;
	//  635 1299:iload_3         
	//  636 1300:istore          4
		weakDependency_ = ((List) (new ArrayList()));
	//  637 1302:aload_0         
	//  638 1303:new             #160 <Class ArrayList>
	//  639 1306:dup             
	//  640 1307:invokespecial   #161 <Method void ArrayList()>
	//  641 1310:putfield        #111 <Field List weakDependency_>
		i1 = i | 0x10;
	//  642 1313:iload_3         
	//  643 1314:bipush          16
	//  644 1316:ior             
	//  645 1317:istore          7
_L43:
		k = i1;
	//  646 1319:iload           7
	//  647 1321:istore          5
		l = i1;
	//  648 1323:iload           7
	//  649 1325:istore          6
		j = i1;
	//  650 1327:iload           7
	//  651 1329:istore          4
		if(codedinputstream.getBytesUntilLimit() <= 0)
			break; /* Loop/switch isn't completed */
	//  652 1331:aload_1         
	//  653 1332:invokevirtual   #236 <Method int CodedInputStream.getBytesUntilLimit()>
	//  654 1335:ifle            1370
		k = i1;
	//  655 1338:iload           7
	//  656 1340:istore          5
		l = i1;
	//  657 1342:iload           7
	//  658 1344:istore          6
		j = i1;
	//  659 1346:iload           7
	//  660 1348:istore          4
		weakDependency_.add(((Object) (Integer.valueOf(codedinputstream.readInt32()))));
	//  661 1350:aload_0         
	//  662 1351:getfield        #111 <Field List weakDependency_>
	//  663 1354:aload_1         
	//  664 1355:invokevirtual   #220 <Method int CodedInputStream.readInt32()>
	//  665 1358:invokestatic    #226 <Method Integer Integer.valueOf(int)>
	//  666 1361:invokeinterface #173 <Method boolean List.add(Object)>
	//  667 1366:pop             
		if(true) goto _L43; else goto _L42
	//  668 1367:goto            1319
_L42:
		k = i1;
	//  669 1370:iload           7
	//  670 1372:istore          5
		l = i1;
	//  671 1374:iload           7
	//  672 1376:istore          6
		j = i1;
	//  673 1378:iload           7
	//  674 1380:istore          4
		codedinputstream.popLimit(j1);
	//  675 1382:aload_1         
	//  676 1383:iload           9
	//  677 1385:invokevirtual   #240 <Method void CodedInputStream.popLimit(int)>
		  goto _L17
	//* 678 1388:goto            1444
_L16:
		k = i;
	//  679 1391:iload_3         
	//  680 1392:istore          5
		l = i;
	//  681 1394:iload_3         
	//  682 1395:istore          6
		j = i;
	//  683 1397:iload_3         
	//  684 1398:istore          4
		obj = ((Object) (codedinputstream.readBytes()));
	//  685 1400:aload_1         
	//  686 1401:invokevirtual   #149 <Method ByteString CodedInputStream.readBytes()>
	//  687 1404:astore          10
		k = i;
	//  688 1406:iload_3         
	//  689 1407:istore          5
		l = i;
	//  690 1409:iload_3         
	//  691 1410:istore          6
		j = i;
	//  692 1412:iload_3         
	//  693 1413:istore          4
		bitField0_ = bitField0_ | 0x10;
	//  694 1415:aload_0         
	//  695 1416:aload_0         
	//  696 1417:getfield        #151 <Field int bitField0_>
	//  697 1420:bipush          16
	//  698 1422:ior             
	//  699 1423:putfield        #151 <Field int bitField0_>
		k = i;
	//  700 1426:iload_3         
	//  701 1427:istore          5
		l = i;
	//  702 1429:iload_3         
	//  703 1430:istore          6
		j = i;
	//  704 1432:iload_3         
	//  705 1433:istore          4
		syntax_ = obj;
	//  706 1435:aload_0         
	//  707 1436:aload           10
	//  708 1438:putfield        #121 <Field Object syntax_>
		i1 = i;
	//  709 1441:iload_3         
	//  710 1442:istore          7
_L17:
		i = i1;
	//  711 1444:iload           7
	//  712 1446:istore_3        
		if(true) goto _L45; else goto _L44
	//  713 1447:goto            26
_L44:
		if((i & 4) == 4)
	//* 714 1450:iload_3         
	//* 715 1451:iconst_4        
	//* 716 1452:iand            
	//* 717 1453:iconst_4        
	//* 718 1454:icmpne          1470
			dependency_ = dependency_.getUnmodifiableView();
	//  719 1457:aload_0         
	//  720 1458:aload_0         
	//  721 1459:getfield        #101 <Field LazyStringList dependency_>
	//  722 1462:invokeinterface #244 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//  723 1467:putfield        #101 <Field LazyStringList dependency_>
		if((i & 0x20) == 32)
	//* 724 1470:iload_3         
	//* 725 1471:bipush          32
	//* 726 1473:iand            
	//* 727 1474:bipush          32
	//* 728 1476:icmpne          1490
			messageType_ = Collections.unmodifiableList(messageType_);
	//  729 1479:aload_0         
	//  730 1480:aload_0         
	//  731 1481:getfield        #113 <Field List messageType_>
	//  732 1484:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  733 1487:putfield        #113 <Field List messageType_>
		if((i & 0x40) == 64)
	//* 734 1490:iload_3         
	//* 735 1491:bipush          64
	//* 736 1493:iand            
	//* 737 1494:bipush          64
	//* 738 1496:icmpne          1510
			enumType_ = Collections.unmodifiableList(enumType_);
	//  739 1499:aload_0         
	//  740 1500:aload_0         
	//  741 1501:getfield        #115 <Field List enumType_>
	//  742 1504:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  743 1507:putfield        #115 <Field List enumType_>
		if((i & 0x80) == 128)
	//* 744 1510:iload_3         
	//* 745 1511:sipush          128
	//* 746 1514:iand            
	//* 747 1515:sipush          128
	//* 748 1518:icmpne          1532
			service_ = Collections.unmodifiableList(service_);
	//  749 1521:aload_0         
	//  750 1522:aload_0         
	//  751 1523:getfield        #117 <Field List service_>
	//  752 1526:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  753 1529:putfield        #117 <Field List service_>
		if((i & 0x100) == 256)
	//* 754 1532:iload_3         
	//* 755 1533:sipush          256
	//* 756 1536:iand            
	//* 757 1537:sipush          256
	//* 758 1540:icmpne          1554
			extension_ = Collections.unmodifiableList(extension_);
	//  759 1543:aload_0         
	//  760 1544:aload_0         
	//  761 1545:getfield        #119 <Field List extension_>
	//  762 1548:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  763 1551:putfield        #119 <Field List extension_>
		if((i & 8) == 8)
	//* 764 1554:iload_3         
	//* 765 1555:bipush          8
	//* 766 1557:iand            
	//* 767 1558:bipush          8
	//* 768 1560:icmpne          1574
			publicDependency_ = Collections.unmodifiableList(publicDependency_);
	//  769 1563:aload_0         
	//  770 1564:aload_0         
	//  771 1565:getfield        #109 <Field List publicDependency_>
	//  772 1568:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  773 1571:putfield        #109 <Field List publicDependency_>
		if((i & 0x10) == 16)
	//* 774 1574:iload_3         
	//* 775 1575:bipush          16
	//* 776 1577:iand            
	//* 777 1578:bipush          16
	//* 778 1580:icmpne          1594
			weakDependency_ = Collections.unmodifiableList(weakDependency_);
	//  779 1583:aload_0         
	//  780 1584:aload_0         
	//  781 1585:getfield        #111 <Field List weakDependency_>
	//  782 1588:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  783 1591:putfield        #111 <Field List weakDependency_>
		unknownFields = builder.build();
	//  784 1594:aload_0         
	//  785 1595:aload           11
	//  786 1597:invokevirtual   #254 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  787 1600:putfield        #258 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  788 1603:aload_0         
	//  789 1604:invokevirtual   #261 <Method void makeExtensionsImmutable()>
		return;
	//  790 1607:return          
		codedinputstream;
	//  791 1608:astore_1        
		j = k;
	//  792 1609:iload           5
	//  793 1611:istore          4
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  794 1613:aload_1         
	//  795 1614:aload_0         
	//  796 1615:invokevirtual   #265 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  797 1618:athrow          
		codedinputstream;
	//  798 1619:astore_1        
		j = l;
	//  799 1620:iload           6
	//  800 1622:istore          4
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  801 1624:new             #124 <Class InvalidProtocolBufferException>
	//  802 1627:dup             
	//  803 1628:aload_1         
	//  804 1629:invokespecial   #268 <Method void InvalidProtocolBufferException(IOException)>
	//  805 1632:aload_0         
	//  806 1633:invokevirtual   #265 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  807 1636:athrow          
		codedinputstream;
	//  808 1637:astore_1        
		if((j & 4) == 4)
	//* 809 1638:iload           4
	//* 810 1640:iconst_4        
	//* 811 1641:iand            
	//* 812 1642:iconst_4        
	//* 813 1643:icmpne          1659
			dependency_ = dependency_.getUnmodifiableView();
	//  814 1646:aload_0         
	//  815 1647:aload_0         
	//  816 1648:getfield        #101 <Field LazyStringList dependency_>
	//  817 1651:invokeinterface #244 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//  818 1656:putfield        #101 <Field LazyStringList dependency_>
		if((j & 0x20) == 32)
	//* 819 1659:iload           4
	//* 820 1661:bipush          32
	//* 821 1663:iand            
	//* 822 1664:bipush          32
	//* 823 1666:icmpne          1680
			messageType_ = Collections.unmodifiableList(messageType_);
	//  824 1669:aload_0         
	//  825 1670:aload_0         
	//  826 1671:getfield        #113 <Field List messageType_>
	//  827 1674:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  828 1677:putfield        #113 <Field List messageType_>
		if((j & 0x40) == 64)
	//* 829 1680:iload           4
	//* 830 1682:bipush          64
	//* 831 1684:iand            
	//* 832 1685:bipush          64
	//* 833 1687:icmpne          1701
			enumType_ = Collections.unmodifiableList(enumType_);
	//  834 1690:aload_0         
	//  835 1691:aload_0         
	//  836 1692:getfield        #115 <Field List enumType_>
	//  837 1695:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  838 1698:putfield        #115 <Field List enumType_>
		if((j & 0x80) == 128)
	//* 839 1701:iload           4
	//* 840 1703:sipush          128
	//* 841 1706:iand            
	//* 842 1707:sipush          128
	//* 843 1710:icmpne          1724
			service_ = Collections.unmodifiableList(service_);
	//  844 1713:aload_0         
	//  845 1714:aload_0         
	//  846 1715:getfield        #117 <Field List service_>
	//  847 1718:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  848 1721:putfield        #117 <Field List service_>
		if((j & 0x100) == 256)
	//* 849 1724:iload           4
	//* 850 1726:sipush          256
	//* 851 1729:iand            
	//* 852 1730:sipush          256
	//* 853 1733:icmpne          1747
			extension_ = Collections.unmodifiableList(extension_);
	//  854 1736:aload_0         
	//  855 1737:aload_0         
	//  856 1738:getfield        #119 <Field List extension_>
	//  857 1741:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  858 1744:putfield        #119 <Field List extension_>
		if((j & 8) == 8)
	//* 859 1747:iload           4
	//* 860 1749:bipush          8
	//* 861 1751:iand            
	//* 862 1752:bipush          8
	//* 863 1754:icmpne          1768
			publicDependency_ = Collections.unmodifiableList(publicDependency_);
	//  864 1757:aload_0         
	//  865 1758:aload_0         
	//  866 1759:getfield        #109 <Field List publicDependency_>
	//  867 1762:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  868 1765:putfield        #109 <Field List publicDependency_>
		if((j & 0x10) == 16)
	//* 869 1768:iload           4
	//* 870 1770:bipush          16
	//* 871 1772:iand            
	//* 872 1773:bipush          16
	//* 873 1775:icmpne          1789
			weakDependency_ = Collections.unmodifiableList(weakDependency_);
	//  874 1778:aload_0         
	//  875 1779:aload_0         
	//  876 1780:getfield        #111 <Field List weakDependency_>
	//  877 1783:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//  878 1786:putfield        #111 <Field List weakDependency_>
		unknownFields = builder.build();
	//  879 1789:aload_0         
	//  880 1790:aload           11
	//  881 1792:invokevirtual   #254 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  882 1795:putfield        #258 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  883 1798:aload_0         
	//  884 1799:invokevirtual   #261 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  885 1802:aload_1         
	//  886 1803:athrow          
	//* 887 1804:goto            180
_L2:
		flag = true;
	//  888 1807:iconst_1        
	//  889 1808:istore          8
		i1 = i;
	//  890 1810:iload_3         
	//  891 1811:istore          7
		  goto _L17
	//* 892 1813:goto            1444
	}

	DescriptorProtos$FileDescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #272 <Method void DescriptorProtos$FileDescriptorProto(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$FileDescriptorProto(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #275 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #88  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$FileDescriptorProto(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #279 <Method void DescriptorProtos$FileDescriptorProto(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
