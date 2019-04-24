// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, LazyStringArrayList, RepeatedFieldBuilderV3, SingleFieldBuilderV3, 
//			GeneratedMessageV3, LazyStringList, ByteString, InvalidProtocolBufferException, 
//			Parser, Message, MessageLite, ProtocolStringList, 
//			CodedInputStream, ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$FileDescriptorProto$Builder extends GeneratedMessageV3.Builder
	implements 
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

	public DescriptorProtos$FileDescriptorProto$Builder addAllDependency(Iterable iterable)
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

	public DescriptorProtos$FileDescriptorProto$Builder addAllEnumType(Iterable iterable)
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

	public DescriptorProtos$FileDescriptorProto$Builder addAllExtension(Iterable iterable)
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

	public DescriptorProtos$FileDescriptorProto$Builder addAllMessageType(Iterable iterable)
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

	public DescriptorProtos$FileDescriptorProto$Builder addAllPublicDependency(Iterable iterable)
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

	public DescriptorProtos$FileDescriptorProto$Builder addAllService(Iterable iterable)
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

	public DescriptorProtos$FileDescriptorProto$Builder addAllWeakDependency(Iterable iterable)
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

	public DescriptorProtos$FileDescriptorProto$Builder addDependency(String s)
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

	public DescriptorProtos$FileDescriptorProto$Builder addDependencyBytes(ByteString bytestring)
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

	public DescriptorProtos$FileDescriptorProto$Builder addEnumType(int i, DescriptorProtos$EnumDescriptorProto$Builder descriptorprotos$enumdescriptorproto$builder)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureEnumTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
			enumType_.add(i, ((Object) (descriptorprotos$enumdescriptorproto$builder.build())));
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
			enumTypeBuilder_.addMessage(i, ((AbstractMessage) (descriptorprotos$enumdescriptorproto$builder.build())));
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

	public DescriptorProtos$FileDescriptorProto$Builder addEnumType(int i, DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
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

	public DescriptorProtos$FileDescriptorProto$Builder addEnumType(DescriptorProtos$EnumDescriptorProto$Builder descriptorprotos$enumdescriptorproto$builder)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureEnumTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
			enumType_.add(((Object) (descriptorprotos$enumdescriptorproto$builder.build())));
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
			enumTypeBuilder_.addMessage(((AbstractMessage) (descriptorprotos$enumdescriptorproto$builder.build())));
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

	public DescriptorProtos$FileDescriptorProto$Builder addEnumType(DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
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

	public DescriptorProtos$EnumDescriptorProto$Builder addEnumTypeBuilder()
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)getEnumTypeFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.EnumDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
	//    2    4:invokestatic    #284 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #288 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #257 <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    5   13:areturn         
	}

	public DescriptorProtos$EnumDescriptorProto$Builder addEnumTypeBuilder(int i)
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)getEnumTypeFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.EnumDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #284 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #292 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #257 <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$FileDescriptorProto$Builder addExtension(int i,  )
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureExtensionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #221 <Method void ensureExtensionIsMutable()>
			extension_.add(i, ((Object) (.build())));
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
			extensionBuilder_.addMessage(i, ((AbstractMessage) (.build())));
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

	public DescriptorProtos$FileDescriptorProto$Builder addExtension(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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

	public DescriptorProtos$FileDescriptorProto$Builder addExtension( )
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureExtensionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #221 <Method void ensureExtensionIsMutable()>
			extension_.add(((Object) (.build())));
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
			extensionBuilder_.addMessage(((AbstractMessage) (.build())));
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

	public DescriptorProtos$FileDescriptorProto$Builder addExtension(DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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

	public  addExtensionBuilder()
	{
		return ()getExtensionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
	//    2    4:invokestatic    #308 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #288 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #296 <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    5   13:areturn         
	}

	public  addExtensionBuilder(int i)
	{
		return ()getExtensionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #308 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #292 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #296 <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$FileDescriptorProto$Builder addMessageType(int i, DescriptorProtos.DescriptorProto.Builder builder)
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

	public DescriptorProtos$FileDescriptorProto$Builder addMessageType(int i, DescriptorProtos.DescriptorProto descriptorproto)
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

	public DescriptorProtos$FileDescriptorProto$Builder addMessageType(DescriptorProtos.DescriptorProto.Builder builder)
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

	public DescriptorProtos$FileDescriptorProto$Builder addMessageType(DescriptorProtos.DescriptorProto descriptorproto)
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

	public DescriptorProtos$FileDescriptorProto$Builder addPublicDependency(int i)
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

	public DescriptorProtos$FileDescriptorProto$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FileDescriptorProto$Builder)super.addRepeatedField(fielddescriptor, obj);
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

	public DescriptorProtos$FileDescriptorProto$Builder addService(int i, er er)
	{
		if(serviceBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureServiceIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #233 <Method void ensureServiceIsMutable()>
			service_.add(i, ((Object) (er.build())));
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
			serviceBuilder_.addMessage(i, ((AbstractMessage) (er.build())));
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

	public DescriptorProtos$FileDescriptorProto$Builder addService(int i, DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
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

	public DescriptorProtos$FileDescriptorProto$Builder addService(er er)
	{
		if(serviceBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureServiceIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #233 <Method void ensureServiceIsMutable()>
			service_.add(((Object) (er.build())));
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
			serviceBuilder_.addMessage(((AbstractMessage) (er.build())));
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

	public DescriptorProtos$FileDescriptorProto$Builder addService(DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
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

	public er addServiceBuilder()
	{
		return (er)getServiceFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.ServiceDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #190 <Method RepeatedFieldBuilderV3 getServiceFieldBuilder()>
	//    2    4:invokestatic    #358 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #288 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #346 <Class DescriptorProtos$ServiceDescriptorProto$Builder>
	//    5   13:areturn         
	}

	public er addServiceBuilder(int i)
	{
		return (er)getServiceFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.ServiceDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #190 <Method RepeatedFieldBuilderV3 getServiceFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #358 <Method DescriptorProtos$ServiceDescriptorProto DescriptorProtos$ServiceDescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #292 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #346 <Class DescriptorProtos$ServiceDescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$FileDescriptorProto$Builder addWeakDependency(int i)
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
		DescriptorProtos.FileDescriptorProto.access$1202(filedescriptorproto, name_);
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
		DescriptorProtos.FileDescriptorProto.access$1302(filedescriptorproto, package_);
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
		DescriptorProtos.FileDescriptorProto.access$1402(filedescriptorproto, dependency_);
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
		DescriptorProtos.FileDescriptorProto.access$1502(filedescriptorproto, publicDependency_);
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
		DescriptorProtos.FileDescriptorProto.access$1602(filedescriptorproto, weakDependency_);
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
			DescriptorProtos.FileDescriptorProto.access$1702(filedescriptorproto, messageType_);
	//  125  233:aload           4
	//  126  235:aload_0         
	//  127  236:getfield        #80  <Field List messageType_>
	//  128  239:invokestatic    #407 <Method List DescriptorProtos$FileDescriptorProto.access$1702(DescriptorProtos$FileDescriptorProto, List)>
	//  129  242:pop             
		} else
	//* 130  243:goto            259
		{
			DescriptorProtos.FileDescriptorProto.access$1702(filedescriptorproto, messageTypeBuilder_.build());
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
			DescriptorProtos.FileDescriptorProto.access$1802(filedescriptorproto, enumType_);
	//  157  300:aload           4
	//  158  302:aload_0         
	//  159  303:getfield        #82  <Field List enumType_>
	//  160  306:invokestatic    #412 <Method List DescriptorProtos$FileDescriptorProto.access$1802(DescriptorProtos$FileDescriptorProto, List)>
	//  161  309:pop             
		} else
	//* 162  310:goto            326
		{
			DescriptorProtos.FileDescriptorProto.access$1802(filedescriptorproto, enumTypeBuilder_.build());
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
			DescriptorProtos.FileDescriptorProto.access$1902(filedescriptorproto, service_);
	//  189  370:aload           4
	//  190  372:aload_0         
	//  191  373:getfield        #84  <Field List service_>
	//  192  376:invokestatic    #415 <Method List DescriptorProtos$FileDescriptorProto.access$1902(DescriptorProtos$FileDescriptorProto, List)>
	//  193  379:pop             
		} else
	//* 194  380:goto            396
		{
			DescriptorProtos.FileDescriptorProto.access$1902(filedescriptorproto, serviceBuilder_.build());
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
			DescriptorProtos.FileDescriptorProto.access$2002(filedescriptorproto, extension_);
	//  221  440:aload           4
	//  222  442:aload_0         
	//  223  443:getfield        #86  <Field List extension_>
	//  224  446:invokestatic    #418 <Method List DescriptorProtos$FileDescriptorProto.access$2002(DescriptorProtos$FileDescriptorProto, List)>
	//  225  449:pop             
		} else
	//* 226  450:goto            466
		{
			DescriptorProtos.FileDescriptorProto.access$2002(filedescriptorproto, extensionBuilder_.build());
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
			DescriptorProtos.FileDescriptorProto.access$2102(filedescriptorproto, options_);
	//  247  490:aload           4
	//  248  492:aload_0         
	//  249  493:getfield        #88  <Field DescriptorProtos$FileOptions options_>
	//  250  496:invokestatic    #422 <Method DescriptorProtos$FileOptions DescriptorProtos$FileDescriptorProto.access$2102(DescriptorProtos$FileDescriptorProto, DescriptorProtos$FileOptions)>
	//  251  499:pop             
		else
	//* 252  500:goto            519
			DescriptorProtos.FileDescriptorProto.access$2102(filedescriptorproto, (DescriptorProtos.FileOptions)optionsBuilder_.build());
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
			DescriptorProtos.FileDescriptorProto.access$2202(filedescriptorproto, sourceCodeInfo_);
	//  274  544:aload           4
	//  275  546:aload_0         
	//  276  547:getfield        #90  <Field DescriptorProtos$SourceCodeInfo sourceCodeInfo_>
	//  277  550:invokestatic    #431 <Method DescriptorProtos$SourceCodeInfo DescriptorProtos$FileDescriptorProto.access$2202(DescriptorProtos$FileDescriptorProto, DescriptorProtos$SourceCodeInfo)>
	//  278  553:pop             
		else
	//* 279  554:goto            573
			DescriptorProtos.FileDescriptorProto.access$2202(filedescriptorproto, (DescriptorProtos.SourceCodeInfo)sourceCodeInfoBuilder_.build());
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
		DescriptorProtos.FileDescriptorProto.access$2302(filedescriptorproto, syntax_);
	//  298  591:aload           4
	//  299  593:aload_0         
	//  300  594:getfield        #92  <Field Object syntax_>
	//  301  597:invokestatic    #436 <Method Object DescriptorProtos$FileDescriptorProto.access$2302(DescriptorProtos$FileDescriptorProto, Object)>
	//  302  600:pop             
		DescriptorProtos.FileDescriptorProto.access$2402(filedescriptorproto, j);
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

	public DescriptorProtos$FileDescriptorProto$Builder clear()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearDependency()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearEnumType()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearExtension()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$FileDescriptorProto$Builder)super.clearField(fielddescriptor);
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

	public DescriptorProtos$FileDescriptorProto$Builder clearMessageType()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearName()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$FileDescriptorProto$Builder)super.clearOneof(oneofdescriptor);
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

	public DescriptorProtos$FileDescriptorProto$Builder clearOptions()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearPackage()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearPublicDependency()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearService()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearSourceCodeInfo()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearSyntax()
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

	public DescriptorProtos$FileDescriptorProto$Builder clearWeakDependency()
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

	public DescriptorProtos$FileDescriptorProto$Builder clone()
	{
		return (DescriptorProtos$FileDescriptorProto$Builder)super.clone();
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

	public DescriptorProtos$EnumDescriptorProto$Builder getEnumTypeBuilder(int i)
	{
		return (DescriptorProtos$EnumDescriptorProto$Builder)getEnumTypeFieldBuilder().getBuilder(i);
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

	public  getEnumTypeOrBuilder(int i)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       21
			return ()enumType_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field List enumType_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #537 <Method Object List.get(int)>
	//    7   17:checkcast       #565 <Class DescriptorProtos$EnumDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return ()enumTypeBuilder_.getMessageOrBuilder(i);
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

	public  getExtensionBuilder(int i)
	{
		return ()getExtensionFieldBuilder().getBuilder(i);
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

	public r getExtensionOrBuilder(int i)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       21
			return (r)extension_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #86  <Field List extension_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #537 <Method Object List.get(int)>
	//    7   17:checkcast       #586 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return (r)extensionBuilder_.getMessageOrBuilder(i);
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

	public er getServiceBuilder(int i)
	{
		return (er)getServiceFieldBuilder().getBuilder(i);
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

	public der getServiceOrBuilder(int i)
	{
		if(serviceBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
	//*   2    4:ifnonnull       21
			return (der)service_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #84  <Field List service_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #537 <Method Object List.get(int)>
	//    7   17:checkcast       #654 <Class DescriptorProtos$ServiceDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return (der)serviceBuilder_.getMessageOrBuilder(i);
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

	public DescriptorProtos$FileDescriptorProto$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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

	public DescriptorProtos$FileDescriptorProto$Builder mergeFrom(DescriptorProtos.FileDescriptorProto filedescriptorproto)
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
			name_ = DescriptorProtos.FileDescriptorProto.access$1200(filedescriptorproto);
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
			package_ = DescriptorProtos.FileDescriptorProto.access$1300(filedescriptorproto);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokestatic    #754 <Method Object DescriptorProtos$FileDescriptorProto.access$1300(DescriptorProtos$FileDescriptorProto)>
	//   32   60:putfield        #61  <Field Object package_>
			onChanged();
	//   33   63:aload_0         
	//   34   64:invokevirtual   #209 <Method void onChanged()>
		}
		if(!DescriptorProtos.FileDescriptorProto.access$1400(filedescriptorproto).isEmpty())
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
				dependency_ = DescriptorProtos.FileDescriptorProto.access$1400(filedescriptorproto);
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
				dependency_.addAll(((java.util.Collection) (DescriptorProtos.FileDescriptorProto.access$1400(filedescriptorproto))));
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
		if(!DescriptorProtos.FileDescriptorProto.access$1500(filedescriptorproto).isEmpty())
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
				publicDependency_ = DescriptorProtos.FileDescriptorProto.access$1500(filedescriptorproto);
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
				publicDependency_.addAll(((java.util.Collection) (DescriptorProtos.FileDescriptorProto.access$1500(filedescriptorproto))));
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
		if(!DescriptorProtos.FileDescriptorProto.access$1600(filedescriptorproto).isEmpty())
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
				weakDependency_ = DescriptorProtos.FileDescriptorProto.access$1600(filedescriptorproto);
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
				weakDependency_.addAll(((java.util.Collection) (DescriptorProtos.FileDescriptorProto.access$1600(filedescriptorproto))));
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
			if(!DescriptorProtos.FileDescriptorProto.access$1700(filedescriptorproto).isEmpty())
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
					messageType_ = DescriptorProtos.FileDescriptorProto.access$1700(filedescriptorproto);
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
					messageType_.addAll(((java.util.Collection) (DescriptorProtos.FileDescriptorProto.access$1700(filedescriptorproto))));
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
		if(!DescriptorProtos.FileDescriptorProto.access$1700(filedescriptorproto).isEmpty())
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
				messageType_ = DescriptorProtos.FileDescriptorProto.access$1700(filedescriptorproto);
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
				messageTypeBuilder_.addAllMessages(((Iterable) (DescriptorProtos.FileDescriptorProto.access$1700(filedescriptorproto))));
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
			if(!DescriptorProtos.FileDescriptorProto.access$1800(filedescriptorproto).isEmpty())
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
					enumType_ = DescriptorProtos.FileDescriptorProto.access$1800(filedescriptorproto);
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
					enumType_.addAll(((java.util.Collection) (DescriptorProtos.FileDescriptorProto.access$1800(filedescriptorproto))));
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
		if(!DescriptorProtos.FileDescriptorProto.access$1800(filedescriptorproto).isEmpty())
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
				enumType_ = DescriptorProtos.FileDescriptorProto.access$1800(filedescriptorproto);
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
				enumTypeBuilder_.addAllMessages(((Iterable) (DescriptorProtos.FileDescriptorProto.access$1800(filedescriptorproto))));
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
			if(!DescriptorProtos.FileDescriptorProto.access$1900(filedescriptorproto).isEmpty())
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
					service_ = DescriptorProtos.FileDescriptorProto.access$1900(filedescriptorproto);
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
					service_.addAll(((java.util.Collection) (DescriptorProtos.FileDescriptorProto.access$1900(filedescriptorproto))));
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
		if(!DescriptorProtos.FileDescriptorProto.access$1900(filedescriptorproto).isEmpty())
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
				service_ = DescriptorProtos.FileDescriptorProto.access$1900(filedescriptorproto);
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
				serviceBuilder_.addAllMessages(((Iterable) (DescriptorProtos.FileDescriptorProto.access$1900(filedescriptorproto))));
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
			if(!DescriptorProtos.FileDescriptorProto.access$2000(filedescriptorproto).isEmpty())
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
					extension_ = DescriptorProtos.FileDescriptorProto.access$2000(filedescriptorproto);
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
					extension_.addAll(((java.util.Collection) (DescriptorProtos.FileDescriptorProto.access$2000(filedescriptorproto))));
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
		if(!DescriptorProtos.FileDescriptorProto.access$2000(filedescriptorproto).isEmpty())
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
				extension_ = DescriptorProtos.FileDescriptorProto.access$2000(filedescriptorproto);
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
				extensionBuilder_.addAllMessages(((Iterable) (DescriptorProtos.FileDescriptorProto.access$2000(filedescriptorproto))));
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
			syntax_ = DescriptorProtos.FileDescriptorProto.access$2300(filedescriptorproto);
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

	public DescriptorProtos$FileDescriptorProto$Builder mergeFrom(Message message)
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

	public DescriptorProtos$FileDescriptorProto$Builder mergeOptions(DescriptorProtos.FileOptions fileoptions)
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

	public DescriptorProtos$FileDescriptorProto$Builder mergeSourceCodeInfo(DescriptorProtos.SourceCodeInfo sourcecodeinfo)
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

	public final DescriptorProtos$FileDescriptorProto$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FileDescriptorProto$Builder)super.mergeUnknownFields(unknownfieldset);
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

	public DescriptorProtos$FileDescriptorProto$Builder removeEnumType(int i)
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

	public DescriptorProtos$FileDescriptorProto$Builder removeExtension(int i)
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

	public DescriptorProtos$FileDescriptorProto$Builder removeMessageType(int i)
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

	public DescriptorProtos$FileDescriptorProto$Builder removeService(int i)
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

	public DescriptorProtos$FileDescriptorProto$Builder setDependency(int i, String s)
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

	public DescriptorProtos$FileDescriptorProto$Builder setEnumType(int i, DescriptorProtos$EnumDescriptorProto$Builder descriptorprotos$enumdescriptorproto$builder)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureEnumTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #213 <Method void ensureEnumTypeIsMutable()>
			enumType_.set(i, ((Object) (descriptorprotos$enumdescriptorproto$builder.build())));
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
			enumTypeBuilder_.setMessage(i, ((AbstractMessage) (descriptorprotos$enumdescriptorproto$builder.build())));
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

	public DescriptorProtos$FileDescriptorProto$Builder setEnumType(int i, DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
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

	public DescriptorProtos$FileDescriptorProto$Builder setExtension(int i,  )
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureExtensionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #221 <Method void ensureExtensionIsMutable()>
			extension_.set(i, ((Object) (.build())));
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
			extensionBuilder_.setMessage(i, ((AbstractMessage) (.build())));
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

	public DescriptorProtos$FileDescriptorProto$Builder setExtension(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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

	public DescriptorProtos$FileDescriptorProto$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$FileDescriptorProto$Builder)super.setField(fielddescriptor, obj);
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

	public DescriptorProtos$FileDescriptorProto$Builder setMessageType(int i, DescriptorProtos.DescriptorProto.Builder builder)
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

	public DescriptorProtos$FileDescriptorProto$Builder setMessageType(int i, DescriptorProtos.DescriptorProto descriptorproto)
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

	public DescriptorProtos$FileDescriptorProto$Builder setName(String s)
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

	public DescriptorProtos$FileDescriptorProto$Builder setNameBytes(ByteString bytestring)
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

	public DescriptorProtos$FileDescriptorProto$Builder setOptions(DescriptorProtos.FileOptions.Builder builder)
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

	public DescriptorProtos$FileDescriptorProto$Builder setOptions(DescriptorProtos.FileOptions fileoptions)
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

	public DescriptorProtos$FileDescriptorProto$Builder setPackage(String s)
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

	public DescriptorProtos$FileDescriptorProto$Builder setPackageBytes(ByteString bytestring)
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

	public DescriptorProtos$FileDescriptorProto$Builder setPublicDependency(int i, int j)
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

	public DescriptorProtos$FileDescriptorProto$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$FileDescriptorProto$Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

	public DescriptorProtos$FileDescriptorProto$Builder setService(int i, er er)
	{
		if(serviceBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field RepeatedFieldBuilderV3 serviceBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureServiceIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #233 <Method void ensureServiceIsMutable()>
			service_.set(i, ((Object) (er.build())));
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
			serviceBuilder_.setMessage(i, ((AbstractMessage) (er.build())));
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

	public DescriptorProtos$FileDescriptorProto$Builder setService(int i, DescriptorProtos.ServiceDescriptorProto servicedescriptorproto)
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

	public DescriptorProtos$FileDescriptorProto$Builder setSourceCodeInfo(DescriptorProtos.SourceCodeInfo.Builder builder)
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

	public DescriptorProtos$FileDescriptorProto$Builder setSourceCodeInfo(DescriptorProtos.SourceCodeInfo sourcecodeinfo)
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

	public DescriptorProtos$FileDescriptorProto$Builder setSyntax(String s)
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

	public DescriptorProtos$FileDescriptorProto$Builder setSyntaxBytes(ByteString bytestring)
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

	public final DescriptorProtos$FileDescriptorProto$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$FileDescriptorProto$Builder)super.setUnknownFields(unknownfieldset);
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

	public DescriptorProtos$FileDescriptorProto$Builder setWeakDependency(int i, int j)
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

	private DescriptorProtos$FileDescriptorProto$Builder()
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

	DescriptorProtos$FileDescriptorProto$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void DescriptorProtos$FileDescriptorProto$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$FileDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	DescriptorProtos$FileDescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method void DescriptorProtos$FileDescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
