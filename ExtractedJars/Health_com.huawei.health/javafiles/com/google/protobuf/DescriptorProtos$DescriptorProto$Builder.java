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

public static final class DescriptorProtos$DescriptorProto$Builder extends GeneratedMessageV3.Builder
	implements 
{

	private void ensureEnumTypeIsMutable()
	{
		if((bitField0_ & 0x10) != 16)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field int bitField0_>
	//*   2    4:bipush          16
	//*   3    6:iand            
	//*   4    7:bipush          16
	//*   5    9:icmpeq          38
		{
			enumType_ = ((List) (new ArrayList(((java.util.Collection) (enumType_)))));
	//    6   12:aload_0         
	//    7   13:new             #105 <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #74  <Field List enumType_>
	//   11   21:invokespecial   #108 <Method void ArrayList(java.util.Collection)>
	//   12   24:putfield        #74  <Field List enumType_>
			bitField0_ = bitField0_ | 0x10;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field int bitField0_>
	//   16   32:bipush          16
	//   17   34:ior             
	//   18   35:putfield        #103 <Field int bitField0_>
		}
	//   19   38:return          
	}

	private void ensureExtensionIsMutable()
	{
		if((bitField0_ & 4) != 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field int bitField0_>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:iconst_4        
	//*   5    7:icmpeq          35
		{
			extension_ = ((List) (new ArrayList(((java.util.Collection) (extension_)))));
	//    6   10:aload_0         
	//    7   11:new             #105 <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #70  <Field List extension_>
	//   11   19:invokespecial   #108 <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #70  <Field List extension_>
			bitField0_ = bitField0_ | 4;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #103 <Field int bitField0_>
	//   16   30:iconst_4        
	//   17   31:ior             
	//   18   32:putfield        #103 <Field int bitField0_>
		}
	//   19   35:return          
	}

	private void ensureExtensionRangeIsMutable()
	{
		if((bitField0_ & 0x20) != 32)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field int bitField0_>
	//*   2    4:bipush          32
	//*   3    6:iand            
	//*   4    7:bipush          32
	//*   5    9:icmpeq          38
		{
			extensionRange_ = ((List) (new ArrayList(((java.util.Collection) (extensionRange_)))));
	//    6   12:aload_0         
	//    7   13:new             #105 <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #76  <Field List extensionRange_>
	//   11   21:invokespecial   #108 <Method void ArrayList(java.util.Collection)>
	//   12   24:putfield        #76  <Field List extensionRange_>
			bitField0_ = bitField0_ | 0x20;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field int bitField0_>
	//   16   32:bipush          32
	//   17   34:ior             
	//   18   35:putfield        #103 <Field int bitField0_>
		}
	//   19   38:return          
	}

	private void ensureFieldIsMutable()
	{
		if((bitField0_ & 2) != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field int bitField0_>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          35
		{
			field_ = ((List) (new ArrayList(((java.util.Collection) (field_)))));
	//    6   10:aload_0         
	//    7   11:new             #105 <Class ArrayList>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #68  <Field List field_>
	//   11   19:invokespecial   #108 <Method void ArrayList(java.util.Collection)>
	//   12   22:putfield        #68  <Field List field_>
			bitField0_ = bitField0_ | 2;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #103 <Field int bitField0_>
	//   16   30:iconst_2        
	//   17   31:ior             
	//   18   32:putfield        #103 <Field int bitField0_>
		}
	//   19   35:return          
	}

	private void ensureNestedTypeIsMutable()
	{
		if((bitField0_ & 8) != 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field int bitField0_>
	//*   2    4:bipush          8
	//*   3    6:iand            
	//*   4    7:bipush          8
	//*   5    9:icmpeq          38
		{
			nestedType_ = ((List) (new ArrayList(((java.util.Collection) (nestedType_)))));
	//    6   12:aload_0         
	//    7   13:new             #105 <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #72  <Field List nestedType_>
	//   11   21:invokespecial   #108 <Method void ArrayList(java.util.Collection)>
	//   12   24:putfield        #72  <Field List nestedType_>
			bitField0_ = bitField0_ | 8;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field int bitField0_>
	//   16   32:bipush          8
	//   17   34:ior             
	//   18   35:putfield        #103 <Field int bitField0_>
		}
	//   19   38:return          
	}

	private void ensureOneofDeclIsMutable()
	{
		if((bitField0_ & 0x40) != 64)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field int bitField0_>
	//*   2    4:bipush          64
	//*   3    6:iand            
	//*   4    7:bipush          64
	//*   5    9:icmpeq          38
		{
			oneofDecl_ = ((List) (new ArrayList(((java.util.Collection) (oneofDecl_)))));
	//    6   12:aload_0         
	//    7   13:new             #105 <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #78  <Field List oneofDecl_>
	//   11   21:invokespecial   #108 <Method void ArrayList(java.util.Collection)>
	//   12   24:putfield        #78  <Field List oneofDecl_>
			bitField0_ = bitField0_ | 0x40;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field int bitField0_>
	//   16   32:bipush          64
	//   17   34:ior             
	//   18   35:putfield        #103 <Field int bitField0_>
		}
	//   19   38:return          
	}

	private void ensureReservedNameIsMutable()
	{
		if((bitField0_ & 0x200) != 512)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field int bitField0_>
	//*   2    4:sipush          512
	//*   3    7:iand            
	//*   4    8:sipush          512
	//*   5   11:icmpeq          41
		{
			reservedName_ = ((LazyStringList) (new LazyStringArrayList(reservedName_)));
	//    6   14:aload_0         
	//    7   15:new             #84  <Class LazyStringArrayList>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #89  <Field LazyStringList reservedName_>
	//   11   23:invokespecial   #117 <Method void LazyStringArrayList(LazyStringList)>
	//   12   26:putfield        #89  <Field LazyStringList reservedName_>
			bitField0_ = bitField0_ | 0x200;
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #103 <Field int bitField0_>
	//   16   34:sipush          512
	//   17   37:ior             
	//   18   38:putfield        #103 <Field int bitField0_>
		}
	//   19   41:return          
	}

	private void ensureReservedRangeIsMutable()
	{
		if((bitField0_ & 0x100) != 256)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field int bitField0_>
	//*   2    4:sipush          256
	//*   3    7:iand            
	//*   4    8:sipush          256
	//*   5   11:icmpeq          41
		{
			reservedRange_ = ((List) (new ArrayList(((java.util.Collection) (reservedRange_)))));
	//    6   14:aload_0         
	//    7   15:new             #105 <Class ArrayList>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #82  <Field List reservedRange_>
	//   11   23:invokespecial   #108 <Method void ArrayList(java.util.Collection)>
	//   12   26:putfield        #82  <Field List reservedRange_>
			bitField0_ = bitField0_ | 0x100;
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #103 <Field int bitField0_>
	//   16   34:sipush          256
	//   17   37:ior             
	//   18   38:putfield        #103 <Field int bitField0_>
		}
	//   19   41:return          
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$2600();
	//    0    0:invokestatic    #123 <Method Descriptors$Descriptor DescriptorProtos.access$2600()>
	//    1    3:areturn         
	}

	private RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       57
		{
			List list = enumType_;
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field List enumType_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 0x10) == 16)
	//*   6   12:aload_0         
	//*   7   13:getfield        #103 <Field int bitField0_>
	//*   8   16:bipush          16
	//*   9   18:iand            
	//*  10   19:bipush          16
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
	//   18   32:new             #129 <Class RepeatedFieldBuilderV3>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #133 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   42:aload_0         
	//   25   43:invokevirtual   #137 <Method boolean isClean()>
	//   26   46:invokespecial   #140 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   49:putfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
			enumType_ = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #74  <Field List enumType_>
		}
		return enumTypeBuilder_;
	//   31   57:aload_0         
	//   32   58:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   33   61:areturn         
	}

	private RepeatedFieldBuilderV3 getExtensionFieldBuilder()
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = extension_;
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field List extension_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 4) == 4)
	//*   6   12:aload_0         
	//*   7   13:getfield        #103 <Field int bitField0_>
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
			extensionBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   29:aload_0         
	//   18   30:new             #129 <Class RepeatedFieldBuilderV3>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:invokevirtual   #133 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   40:aload_0         
	//   25   41:invokevirtual   #137 <Method boolean isClean()>
	//   26   44:invokespecial   #140 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   47:putfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
			extension_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #70  <Field List extension_>
		}
		return extensionBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   33   59:areturn         
	}

	private RepeatedFieldBuilderV3 getExtensionRangeFieldBuilder()
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       57
		{
			List list = extensionRange_;
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field List extensionRange_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 0x20) == 32)
	//*   6   12:aload_0         
	//*   7   13:getfield        #103 <Field int bitField0_>
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
			extensionRangeBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   31:aload_0         
	//   18   32:new             #129 <Class RepeatedFieldBuilderV3>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #133 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   42:aload_0         
	//   25   43:invokevirtual   #137 <Method boolean isClean()>
	//   26   46:invokespecial   #140 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   49:putfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
			extensionRange_ = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #76  <Field List extensionRange_>
		}
		return extensionRangeBuilder_;
	//   31   57:aload_0         
	//   32   58:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   33   61:areturn         
	}

	private RepeatedFieldBuilderV3 getFieldFieldBuilder()
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       55
		{
			List list = field_;
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field List field_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 2) == 2)
	//*   6   12:aload_0         
	//*   7   13:getfield        #103 <Field int bitField0_>
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
			fieldBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   29:aload_0         
	//   18   30:new             #129 <Class RepeatedFieldBuilderV3>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:invokevirtual   #133 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   40:aload_0         
	//   25   41:invokevirtual   #137 <Method boolean isClean()>
	//   26   44:invokespecial   #140 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   47:putfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
			field_ = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #68  <Field List field_>
		}
		return fieldBuilder_;
	//   31   55:aload_0         
	//   32   56:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   33   59:areturn         
	}

	private RepeatedFieldBuilderV3 getNestedTypeFieldBuilder()
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       57
		{
			List list = nestedType_;
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field List nestedType_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 8) == 8)
	//*   6   12:aload_0         
	//*   7   13:getfield        #103 <Field int bitField0_>
	//*   8   16:bipush          8
	//*   9   18:iand            
	//*  10   19:bipush          8
	//*  11   21:icmpne          29
				flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_1        
			else
	//*  14   26:goto            31
				flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_1        
			nestedTypeBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   31:aload_0         
	//   18   32:new             #129 <Class RepeatedFieldBuilderV3>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #133 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   42:aload_0         
	//   25   43:invokevirtual   #137 <Method boolean isClean()>
	//   26   46:invokespecial   #140 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   49:putfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
			nestedType_ = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #72  <Field List nestedType_>
		}
		return nestedTypeBuilder_;
	//   31   57:aload_0         
	//   32   58:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   33   61:areturn         
	}

	private RepeatedFieldBuilderV3 getOneofDeclFieldBuilder()
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       57
		{
			List list = oneofDecl_;
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field List oneofDecl_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 0x40) == 64)
	//*   6   12:aload_0         
	//*   7   13:getfield        #103 <Field int bitField0_>
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
			oneofDeclBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   31:aload_0         
	//   18   32:new             #129 <Class RepeatedFieldBuilderV3>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #133 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   42:aload_0         
	//   25   43:invokevirtual   #137 <Method boolean isClean()>
	//   26   46:invokespecial   #140 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   49:putfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
			oneofDecl_ = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #78  <Field List oneofDecl_>
		}
		return oneofDeclBuilder_;
	//   31   57:aload_0         
	//   32   58:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   33   61:areturn         
	}

	private SingleFieldBuilderV3 getOptionsFieldBuilder()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       35
		{
			optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//    3    7:aload_0         
	//    4    8:new             #167 <Class SingleFieldBuilderV3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #171 <Method DescriptorProtos$MessageOptions getOptions()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #133 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #137 <Method boolean isClean()>
	//   12   24:invokespecial   #174 <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
	//   13   27:putfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
			options_ = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #80  <Field DescriptorProtos$MessageOptions options_>
		}
		return optionsBuilder_;
	//   17   35:aload_0         
	//   18   36:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//   19   39:areturn         
	}

	private RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       59
		{
			List list = reservedRange_;
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field List reservedRange_>
	//    5   11:astore_2        
			boolean flag;
			if((bitField0_ & 0x100) == 256)
	//*   6   12:aload_0         
	//*   7   13:getfield        #103 <Field int bitField0_>
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
			reservedRangeBuilder_ = new RepeatedFieldBuilderV3(list, flag, ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
	//   17   33:aload_0         
	//   18   34:new             #129 <Class RepeatedFieldBuilderV3>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:iload_1         
	//   22   40:aload_0         
	//   23   41:invokevirtual   #133 <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
	//   24   44:aload_0         
	//   25   45:invokevirtual   #137 <Method boolean isClean()>
	//   26   48:invokespecial   #140 <Method void RepeatedFieldBuilderV3(List, boolean, AbstractMessage$BuilderParent, boolean)>
	//   27   51:putfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
			reservedRange_ = null;
	//   28   54:aload_0         
	//   29   55:aconst_null     
	//   30   56:putfield        #82  <Field List reservedRange_>
		}
		return reservedRangeBuilder_;
	//   31   59:aload_0         
	//   32   60:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   33   63:areturn         
	}

	private void maybeForceBuilderInitialization()
	{
		if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*   0    0:getstatic       #185 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*   1    3:ifeq            46
		{
			getFieldFieldBuilder();
	//    2    6:aload_0         
	//    3    7:invokespecial   #187 <Method RepeatedFieldBuilderV3 getFieldFieldBuilder()>
	//    4   10:pop             
			getExtensionFieldBuilder();
	//    5   11:aload_0         
	//    6   12:invokespecial   #189 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
	//    7   15:pop             
			getNestedTypeFieldBuilder();
	//    8   16:aload_0         
	//    9   17:invokespecial   #191 <Method RepeatedFieldBuilderV3 getNestedTypeFieldBuilder()>
	//   10   20:pop             
			getEnumTypeFieldBuilder();
	//   11   21:aload_0         
	//   12   22:invokespecial   #193 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
	//   13   25:pop             
			getExtensionRangeFieldBuilder();
	//   14   26:aload_0         
	//   15   27:invokespecial   #195 <Method RepeatedFieldBuilderV3 getExtensionRangeFieldBuilder()>
	//   16   30:pop             
			getOneofDeclFieldBuilder();
	//   17   31:aload_0         
	//   18   32:invokespecial   #197 <Method RepeatedFieldBuilderV3 getOneofDeclFieldBuilder()>
	//   19   35:pop             
			getOptionsFieldBuilder();
	//   20   36:aload_0         
	//   21   37:invokespecial   #199 <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//   22   40:pop             
			getReservedRangeFieldBuilder();
	//   23   41:aload_0         
	//   24   42:invokespecial   #201 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//   25   45:pop             
		}
	//   26   46:return          
	}

	public DescriptorProtos$DescriptorProto$Builder addAllEnumType(Iterable iterable)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureEnumTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, enumType_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #74  <Field List enumType_>
	//    8   16:invokestatic    #211 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			enumTypeBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addAllExtension(Iterable iterable)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureExtensionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #222 <Method void ensureExtensionIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, extension_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #70  <Field List extension_>
	//    8   16:invokestatic    #211 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			extensionBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addAllExtensionRange(Iterable iterable)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureExtensionRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #226 <Method void ensureExtensionRangeIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, extensionRange_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field List extensionRange_>
	//    8   16:invokestatic    #211 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			extensionRangeBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addAllField(Iterable iterable)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureFieldIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method void ensureFieldIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, field_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field List field_>
	//    8   16:invokestatic    #211 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			fieldBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addAllNestedType(Iterable iterable)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureNestedTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, nestedType_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #72  <Field List nestedType_>
	//    8   16:invokestatic    #211 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			nestedTypeBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addAllOneofDecl(Iterable iterable)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureOneofDeclIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, oneofDecl_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #78  <Field List oneofDecl_>
	//    8   16:invokestatic    #211 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			oneofDeclBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addAllReservedName(Iterable iterable)
	{
		ensureReservedNameIsMutable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #241 <Method void ensureReservedNameIsMutable()>
		AbstractMessageLite.Builder.addAll(iterable, ((List) (reservedName_)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field LazyStringList reservedName_>
	//    5    9:invokestatic    #211 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
		onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #214 <Method void onChanged()>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder addAllReservedRange(Iterable iterable)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       25
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #245 <Method void ensureReservedRangeIsMutable()>
			AbstractMessageLite.Builder.addAll(iterable, reservedRange_);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #82  <Field List reservedRange_>
	//    8   16:invokestatic    #211 <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
			onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		} else
		{
			reservedRangeBuilder_.addAllMessages(iterable);
	//   13   25:aload_0         
	//   14   26:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   17   33:pop             
			return this;
	//   18   34:aload_0         
	//   19   35:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addEnumType(int i, der der)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureEnumTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
			enumType_.add(i, ((Object) (der.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #74  <Field List enumType_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #254 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #260 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			enumTypeBuilder_.addMessage(i, ((AbstractMessage) (der.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #254 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
	//   20   40:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addEnumType(int i, DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(enumdescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureEnumTypeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
				enumType_.add(i, ((Object) (enumdescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #74  <Field List enumType_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #260 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			enumTypeBuilder_.addMessage(i, ((AbstractMessage) (enumdescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addEnumType(der der)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureEnumTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
			enumType_.add(((Object) (der.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #74  <Field List enumType_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #254 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
	//    9   19:invokeinterface #272 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			enumTypeBuilder_.addMessage(((AbstractMessage) (der.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #254 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
	//   19   39:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addEnumType(DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(enumdescriptorproto == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureEnumTypeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
				enumType_.add(((Object) (enumdescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #74  <Field List enumType_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #272 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			enumTypeBuilder_.addMessage(((AbstractMessage) (enumdescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public der addEnumTypeBuilder()
	{
		return (der)getEnumTypeFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.EnumDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #193 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
	//    2    4:invokestatic    #283 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #250 <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    5   13:areturn         
	}

	public der addEnumTypeBuilder(int i)
	{
		return (der)getEnumTypeFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.EnumDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #193 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #283 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #250 <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder addExtension(int i, lder lder)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureExtensionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #222 <Method void ensureExtensionIsMutable()>
			extension_.add(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #70  <Field List extension_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #260 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			extensionBuilder_.addMessage(i, ((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   20   40:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addExtension(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(fielddescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureExtensionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #222 <Method void ensureExtensionIsMutable()>
				extension_.add(i, ((Object) (fielddescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #70  <Field List extension_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #260 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			extensionBuilder_.addMessage(i, ((AbstractMessage) (fielddescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addExtension(lder lder)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureExtensionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #222 <Method void ensureExtensionIsMutable()>
			extension_.add(((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #70  <Field List extension_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//    9   19:invokeinterface #272 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			extensionBuilder_.addMessage(((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   19   39:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addExtension(DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(fielddescriptorproto == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureExtensionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #222 <Method void ensureExtensionIsMutable()>
				extension_.add(((Object) (fielddescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #70  <Field List extension_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #272 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			extensionBuilder_.addMessage(((AbstractMessage) (fielddescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public lder addExtensionBuilder()
	{
		return (lder)getExtensionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #189 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
	//    2    4:invokestatic    #307 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    5   13:areturn         
	}

	public lder addExtensionBuilder(int i)
	{
		return (lder)getExtensionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #189 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #307 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder addExtensionRange(int i, nRange.Builder builder)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureExtensionRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #226 <Method void ensureExtensionRangeIsMutable()>
			extensionRange_.add(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #76  <Field List extensionRange_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #315 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange$Builder.build()>
	//   10   20:invokeinterface #260 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			extensionRangeBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #315 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange$Builder.build()>
	//   20   40:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addExtensionRange(int i, nRange nrange)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(nrange == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureExtensionRangeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #226 <Method void ensureExtensionRangeIsMutable()>
				extensionRange_.add(i, ((Object) (nrange)));
	//   11   23:aload_0         
	//   12   24:getfield        #76  <Field List extensionRange_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #260 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			extensionRangeBuilder_.addMessage(i, ((AbstractMessage) (nrange)));
	//   20   40:aload_0         
	//   21   41:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addExtensionRange(nRange.Builder builder)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureExtensionRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #226 <Method void ensureExtensionRangeIsMutable()>
			extensionRange_.add(((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #76  <Field List extensionRange_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #315 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange$Builder.build()>
	//    9   19:invokeinterface #272 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			extensionRangeBuilder_.addMessage(((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #315 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange$Builder.build()>
	//   19   39:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addExtensionRange(nRange nrange)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(nrange == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureExtensionRangeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #226 <Method void ensureExtensionRangeIsMutable()>
				extensionRange_.add(((Object) (nrange)));
	//   11   23:aload_0         
	//   12   24:getfield        #76  <Field List extensionRange_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #272 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			extensionRangeBuilder_.addMessage(((AbstractMessage) (nrange)));
	//   20   40:aload_0         
	//   21   41:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public nRange.Builder addExtensionRangeBuilder()
	{
		return (nRange.Builder)getExtensionRangeFieldBuilder().addBuilder(((AbstractMessage) (nRange.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #195 <Method RepeatedFieldBuilderV3 getExtensionRangeFieldBuilder()>
	//    2    4:invokestatic    #324 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange.getDefaultInstance()>
	//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #312 <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
	//    5   13:areturn         
	}

	public nRange.Builder addExtensionRangeBuilder(int i)
	{
		return (nRange.Builder)getExtensionRangeFieldBuilder().addBuilder(i, ((AbstractMessage) (nRange.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #195 <Method RepeatedFieldBuilderV3 getExtensionRangeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #324 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange.getDefaultInstance()>
	//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #312 <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder addField(int i, lder lder)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureFieldIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method void ensureFieldIsMutable()>
			field_.add(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field List field_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #260 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			fieldBuilder_.addMessage(i, ((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   20   40:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addField(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(fielddescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureFieldIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #230 <Method void ensureFieldIsMutable()>
				field_.add(i, ((Object) (fielddescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #68  <Field List field_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #260 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			fieldBuilder_.addMessage(i, ((AbstractMessage) (fielddescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addField(lder lder)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureFieldIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method void ensureFieldIsMutable()>
			field_.add(((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field List field_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//    9   19:invokeinterface #272 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			fieldBuilder_.addMessage(((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   19   39:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addField(DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(fielddescriptorproto == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureFieldIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #230 <Method void ensureFieldIsMutable()>
				field_.add(((Object) (fielddescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #68  <Field List field_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #272 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			fieldBuilder_.addMessage(((AbstractMessage) (fielddescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public lder addFieldBuilder()
	{
		return (lder)getFieldFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method RepeatedFieldBuilderV3 getFieldFieldBuilder()>
	//    2    4:invokestatic    #307 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    5   13:areturn         
	}

	public lder addFieldBuilder(int i)
	{
		return (lder)getFieldFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method RepeatedFieldBuilderV3 getFieldFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #307 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder addNestedType(int i, DescriptorProtos$DescriptorProto$Builder descriptorprotos$descriptorproto$builder)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureNestedTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
			nestedType_.add(i, ((Object) (descriptorprotos$descriptorproto$builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field List nestedType_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #332 <Method DescriptorProtos$DescriptorProto build()>
	//   10   20:invokeinterface #260 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			nestedTypeBuilder_.addMessage(i, ((AbstractMessage) (descriptorprotos$descriptorproto$builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #332 <Method DescriptorProtos$DescriptorProto build()>
	//   20   40:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addNestedType(int i, DescriptorProtos.DescriptorProto descriptorproto)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(descriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureNestedTypeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
				nestedType_.add(i, ((Object) (descriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #72  <Field List nestedType_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #260 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			nestedTypeBuilder_.addMessage(i, ((AbstractMessage) (descriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addNestedType(DescriptorProtos$DescriptorProto$Builder descriptorprotos$descriptorproto$builder)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureNestedTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
			nestedType_.add(((Object) (descriptorprotos$descriptorproto$builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field List nestedType_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #332 <Method DescriptorProtos$DescriptorProto build()>
	//    9   19:invokeinterface #272 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			nestedTypeBuilder_.addMessage(((AbstractMessage) (descriptorprotos$descriptorproto$builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #332 <Method DescriptorProtos$DescriptorProto build()>
	//   19   39:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addNestedType(DescriptorProtos.DescriptorProto descriptorproto)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(descriptorproto == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureNestedTypeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
				nestedType_.add(((Object) (descriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #72  <Field List nestedType_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #272 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			nestedTypeBuilder_.addMessage(((AbstractMessage) (descriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addNestedTypeBuilder()
	{
		return (DescriptorProtos$DescriptorProto$Builder)getNestedTypeFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.DescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #191 <Method RepeatedFieldBuilderV3 getNestedTypeFieldBuilder()>
	//    2    4:invokestatic    #339 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    5   13:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder addNestedTypeBuilder(int i)
	{
		return (DescriptorProtos$DescriptorProto$Builder)getNestedTypeFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.DescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #191 <Method RepeatedFieldBuilderV3 getNestedTypeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #339 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder addOneofDecl(int i, lder lder)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureOneofDeclIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
			oneofDecl_.add(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #78  <Field List oneofDecl_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #347 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #260 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			oneofDeclBuilder_.addMessage(i, ((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #347 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto$Builder.build()>
	//   20   40:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addOneofDecl(int i, DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(oneofdescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureOneofDeclIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
				oneofDecl_.add(i, ((Object) (oneofdescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #78  <Field List oneofDecl_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #260 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			oneofDeclBuilder_.addMessage(i, ((AbstractMessage) (oneofdescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addOneofDecl(lder lder)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureOneofDeclIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
			oneofDecl_.add(((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #78  <Field List oneofDecl_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #347 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto$Builder.build()>
	//    9   19:invokeinterface #272 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			oneofDeclBuilder_.addMessage(((AbstractMessage) (lder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #347 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto$Builder.build()>
	//   19   39:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addOneofDecl(DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(oneofdescriptorproto == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureOneofDeclIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
				oneofDecl_.add(((Object) (oneofdescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #78  <Field List oneofDecl_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #272 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			oneofDeclBuilder_.addMessage(((AbstractMessage) (oneofdescriptorproto)));
	//   20   40:aload_0         
	//   21   41:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public lder addOneofDeclBuilder()
	{
		return (lder)getOneofDeclFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.OneofDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #197 <Method RepeatedFieldBuilderV3 getOneofDeclFieldBuilder()>
	//    2    4:invokestatic    #356 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
	//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #344 <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    5   13:areturn         
	}

	public lder addOneofDeclBuilder(int i)
	{
		return (lder)getOneofDeclFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.OneofDescriptorProto.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #197 <Method RepeatedFieldBuilderV3 getOneofDeclFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #356 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
	//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #344 <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$DescriptorProto$Builder)super.addRepeatedField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #362 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #364 <Method DescriptorProtos$DescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #364 <Method DescriptorProtos$DescriptorProto$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder addReservedName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #267 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #268 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			ensureReservedNameIsMutable();
	//    6   12:aload_0         
	//    7   13:invokespecial   #241 <Method void ensureReservedNameIsMutable()>
			reservedName_.add(((Object) (s)));
	//    8   16:aload_0         
	//    9   17:getfield        #89  <Field LazyStringList reservedName_>
	//   10   20:aload_1         
	//   11   21:invokeinterface #370 <Method boolean LazyStringList.add(Object)>
	//   12   26:pop             
			onChanged();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   15   31:aload_0         
	//   16   32:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addReservedNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #267 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #268 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			ensureReservedNameIsMutable();
	//    6   12:aload_0         
	//    7   13:invokespecial   #241 <Method void ensureReservedNameIsMutable()>
			reservedName_.add(bytestring);
	//    8   16:aload_0         
	//    9   17:getfield        #89  <Field LazyStringList reservedName_>
	//   10   20:aload_1         
	//   11   21:invokeinterface #375 <Method void LazyStringList.add(ByteString)>
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addReservedRange(int i, Range.Builder builder)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #245 <Method void ensureReservedRangeIsMutable()>
			reservedRange_.add(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #82  <Field List reservedRange_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #382 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange$Builder.build()>
	//   10   20:invokeinterface #260 <Method void List.add(int, Object)>
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			reservedRangeBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   17   35:iload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #382 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange$Builder.build()>
	//   20   40:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   21   43:pop             
			return this;
	//   22   44:aload_0         
	//   23   45:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addReservedRange(int i, Range range)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(range == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureReservedRangeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #245 <Method void ensureReservedRangeIsMutable()>
				reservedRange_.add(i, ((Object) (range)));
	//   11   23:aload_0         
	//   12   24:getfield        #82  <Field List reservedRange_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #260 <Method void List.add(int, Object)>
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			reservedRangeBuilder_.addMessage(i, ((AbstractMessage) (range)));
	//   20   40:aload_0         
	//   21   41:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #264 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(int, AbstractMessage)>
	//   25   49:pop             
			return this;
	//   26   50:aload_0         
	//   27   51:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addReservedRange(Range.Builder builder)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       31
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #245 <Method void ensureReservedRangeIsMutable()>
			reservedRange_.add(((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #82  <Field List reservedRange_>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #382 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange$Builder.build()>
	//    9   19:invokeinterface #272 <Method boolean List.add(Object)>
	//   10   24:pop             
			onChanged();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		} else
		{
			reservedRangeBuilder_.addMessage(((AbstractMessage) (builder.build())));
	//   15   31:aload_0         
	//   16   32:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #382 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange$Builder.build()>
	//   19   39:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   20   42:pop             
			return this;
	//   21   43:aload_0         
	//   22   44:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder addReservedRange(Range range)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       40
		{
			if(range == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureReservedRangeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #245 <Method void ensureReservedRangeIsMutable()>
				reservedRange_.add(((Object) (range)));
	//   11   23:aload_0         
	//   12   24:getfield        #82  <Field List reservedRange_>
	//   13   27:aload_1         
	//   14   28:invokeinterface #272 <Method boolean List.add(Object)>
	//   15   33:pop             
				onChanged();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   18   38:aload_0         
	//   19   39:areturn         
			}
		} else
		{
			reservedRangeBuilder_.addMessage(((AbstractMessage) (range)));
	//   20   40:aload_0         
	//   21   41:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #275 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addMessage(AbstractMessage)>
	//   24   48:pop             
			return this;
	//   25   49:aload_0         
	//   26   50:areturn         
		}
	}

	public Range.Builder addReservedRangeBuilder()
	{
		return (Range.Builder)getReservedRangeFieldBuilder().addBuilder(((AbstractMessage) (Range.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #201 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//    2    4:invokestatic    #391 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange.getDefaultInstance()>
	//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
	//    4   10:checkcast       #379 <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    5   13:areturn         
	}

	public Range.Builder addReservedRangeBuilder(int i)
	{
		return (Range.Builder)getReservedRangeFieldBuilder().addBuilder(i, ((AbstractMessage) (Range.getDefaultInstance())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #201 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #391 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange.getDefaultInstance()>
	//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
	//    5   11:checkcast       #379 <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    6   14:areturn         
	}

	public DescriptorProtos.DescriptorProto build()
	{
		DescriptorProtos.DescriptorProto descriptorproto = buildPartial();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #395 <Method DescriptorProtos$DescriptorProto buildPartial()>
	//    2    4:astore_1        
		if(!descriptorproto.isInitialized())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #398 <Method boolean DescriptorProtos$DescriptorProto.isInitialized()>
	//*   5    9:ifne            17
			throw newUninitializedMessageException(((Message) (descriptorproto)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #402 <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//    8   16:athrow          
		else
			return descriptorproto;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method DescriptorProtos$DescriptorProto build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method DescriptorProtos$DescriptorProto build()>
	//    2    4:areturn         
	}

	public DescriptorProtos.DescriptorProto buildPartial()
	{
		DescriptorProtos.DescriptorProto descriptorproto = new DescriptorProtos.DescriptorProto(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #9   <Class DescriptorProtos$DescriptorProto>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #407 <Method void DescriptorProtos$DescriptorProto(GeneratedMessageV3$Builder, DescriptorProtos$1)>
	//    5    9:astore          4
		int k = bitField0_;
	//    6   11:aload_0         
	//    7   12:getfield        #103 <Field int bitField0_>
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
		DescriptorProtos.DescriptorProto.access$5002(descriptorproto, name_);
	//   18   27:aload           4
	//   19   29:aload_0         
	//   20   30:getfield        #60  <Field Object name_>
	//   21   33:invokestatic    #411 <Method Object DescriptorProtos$DescriptorProto.access$5002(DescriptorProtos$DescriptorProto, Object)>
	//   22   36:pop             
		if(fieldBuilder_ == null)
	//*  23   37:aload_0         
	//*  24   38:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*  25   41:ifnonnull       89
		{
			if((bitField0_ & 2) == 2)
	//*  26   44:aload_0         
	//*  27   45:getfield        #103 <Field int bitField0_>
	//*  28   48:iconst_2        
	//*  29   49:iand            
	//*  30   50:iconst_2        
	//*  31   51:icmpne          76
			{
				field_ = Collections.unmodifiableList(field_);
	//   32   54:aload_0         
	//   33   55:aload_0         
	//   34   56:getfield        #68  <Field List field_>
	//   35   59:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//   36   62:putfield        #68  <Field List field_>
				bitField0_ = bitField0_ & -3;
	//   37   65:aload_0         
	//   38   66:aload_0         
	//   39   67:getfield        #103 <Field int bitField0_>
	//   40   70:bipush          -3
	//   41   72:iand            
	//   42   73:putfield        #103 <Field int bitField0_>
			}
			DescriptorProtos.DescriptorProto.access$5102(descriptorproto, field_);
	//   43   76:aload           4
	//   44   78:aload_0         
	//   45   79:getfield        #68  <Field List field_>
	//   46   82:invokestatic    #419 <Method List DescriptorProtos$DescriptorProto.access$5102(DescriptorProtos$DescriptorProto, List)>
	//   47   85:pop             
		} else
	//*  48   86:goto            102
		{
			DescriptorProtos.DescriptorProto.access$5102(descriptorproto, fieldBuilder_.build());
	//   49   89:aload           4
	//   50   91:aload_0         
	//   51   92:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   52   95:invokevirtual   #421 <Method List RepeatedFieldBuilderV3.build()>
	//   53   98:invokestatic    #419 <Method List DescriptorProtos$DescriptorProto.access$5102(DescriptorProtos$DescriptorProto, List)>
	//   54  101:pop             
		}
		if(extensionBuilder_ == null)
	//*  55  102:aload_0         
	//*  56  103:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*  57  106:ifnonnull       154
		{
			if((bitField0_ & 4) == 4)
	//*  58  109:aload_0         
	//*  59  110:getfield        #103 <Field int bitField0_>
	//*  60  113:iconst_4        
	//*  61  114:iand            
	//*  62  115:iconst_4        
	//*  63  116:icmpne          141
			{
				extension_ = Collections.unmodifiableList(extension_);
	//   64  119:aload_0         
	//   65  120:aload_0         
	//   66  121:getfield        #70  <Field List extension_>
	//   67  124:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//   68  127:putfield        #70  <Field List extension_>
				bitField0_ = bitField0_ & -5;
	//   69  130:aload_0         
	//   70  131:aload_0         
	//   71  132:getfield        #103 <Field int bitField0_>
	//   72  135:bipush          -5
	//   73  137:iand            
	//   74  138:putfield        #103 <Field int bitField0_>
			}
			DescriptorProtos.DescriptorProto.access$5202(descriptorproto, extension_);
	//   75  141:aload           4
	//   76  143:aload_0         
	//   77  144:getfield        #70  <Field List extension_>
	//   78  147:invokestatic    #424 <Method List DescriptorProtos$DescriptorProto.access$5202(DescriptorProtos$DescriptorProto, List)>
	//   79  150:pop             
		} else
	//*  80  151:goto            167
		{
			DescriptorProtos.DescriptorProto.access$5202(descriptorproto, extensionBuilder_.build());
	//   81  154:aload           4
	//   82  156:aload_0         
	//   83  157:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   84  160:invokevirtual   #421 <Method List RepeatedFieldBuilderV3.build()>
	//   85  163:invokestatic    #424 <Method List DescriptorProtos$DescriptorProto.access$5202(DescriptorProtos$DescriptorProto, List)>
	//   86  166:pop             
		}
		if(nestedTypeBuilder_ == null)
	//*  87  167:aload_0         
	//*  88  168:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*  89  171:ifnonnull       221
		{
			if((bitField0_ & 8) == 8)
	//*  90  174:aload_0         
	//*  91  175:getfield        #103 <Field int bitField0_>
	//*  92  178:bipush          8
	//*  93  180:iand            
	//*  94  181:bipush          8
	//*  95  183:icmpne          208
			{
				nestedType_ = Collections.unmodifiableList(nestedType_);
	//   96  186:aload_0         
	//   97  187:aload_0         
	//   98  188:getfield        #72  <Field List nestedType_>
	//   99  191:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//  100  194:putfield        #72  <Field List nestedType_>
				bitField0_ = bitField0_ & -9;
	//  101  197:aload_0         
	//  102  198:aload_0         
	//  103  199:getfield        #103 <Field int bitField0_>
	//  104  202:bipush          -9
	//  105  204:iand            
	//  106  205:putfield        #103 <Field int bitField0_>
			}
			DescriptorProtos.DescriptorProto.access$5302(descriptorproto, nestedType_);
	//  107  208:aload           4
	//  108  210:aload_0         
	//  109  211:getfield        #72  <Field List nestedType_>
	//  110  214:invokestatic    #427 <Method List DescriptorProtos$DescriptorProto.access$5302(DescriptorProtos$DescriptorProto, List)>
	//  111  217:pop             
		} else
	//* 112  218:goto            234
		{
			DescriptorProtos.DescriptorProto.access$5302(descriptorproto, nestedTypeBuilder_.build());
	//  113  221:aload           4
	//  114  223:aload_0         
	//  115  224:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//  116  227:invokevirtual   #421 <Method List RepeatedFieldBuilderV3.build()>
	//  117  230:invokestatic    #427 <Method List DescriptorProtos$DescriptorProto.access$5302(DescriptorProtos$DescriptorProto, List)>
	//  118  233:pop             
		}
		if(enumTypeBuilder_ == null)
	//* 119  234:aload_0         
	//* 120  235:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//* 121  238:ifnonnull       288
		{
			if((bitField0_ & 0x10) == 16)
	//* 122  241:aload_0         
	//* 123  242:getfield        #103 <Field int bitField0_>
	//* 124  245:bipush          16
	//* 125  247:iand            
	//* 126  248:bipush          16
	//* 127  250:icmpne          275
			{
				enumType_ = Collections.unmodifiableList(enumType_);
	//  128  253:aload_0         
	//  129  254:aload_0         
	//  130  255:getfield        #74  <Field List enumType_>
	//  131  258:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//  132  261:putfield        #74  <Field List enumType_>
				bitField0_ = bitField0_ & 0xffffffef;
	//  133  264:aload_0         
	//  134  265:aload_0         
	//  135  266:getfield        #103 <Field int bitField0_>
	//  136  269:bipush          -17
	//  137  271:iand            
	//  138  272:putfield        #103 <Field int bitField0_>
			}
			DescriptorProtos.DescriptorProto.access$5402(descriptorproto, enumType_);
	//  139  275:aload           4
	//  140  277:aload_0         
	//  141  278:getfield        #74  <Field List enumType_>
	//  142  281:invokestatic    #430 <Method List DescriptorProtos$DescriptorProto.access$5402(DescriptorProtos$DescriptorProto, List)>
	//  143  284:pop             
		} else
	//* 144  285:goto            301
		{
			DescriptorProtos.DescriptorProto.access$5402(descriptorproto, enumTypeBuilder_.build());
	//  145  288:aload           4
	//  146  290:aload_0         
	//  147  291:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//  148  294:invokevirtual   #421 <Method List RepeatedFieldBuilderV3.build()>
	//  149  297:invokestatic    #430 <Method List DescriptorProtos$DescriptorProto.access$5402(DescriptorProtos$DescriptorProto, List)>
	//  150  300:pop             
		}
		if(extensionRangeBuilder_ == null)
	//* 151  301:aload_0         
	//* 152  302:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//* 153  305:ifnonnull       355
		{
			if((bitField0_ & 0x20) == 32)
	//* 154  308:aload_0         
	//* 155  309:getfield        #103 <Field int bitField0_>
	//* 156  312:bipush          32
	//* 157  314:iand            
	//* 158  315:bipush          32
	//* 159  317:icmpne          342
			{
				extensionRange_ = Collections.unmodifiableList(extensionRange_);
	//  160  320:aload_0         
	//  161  321:aload_0         
	//  162  322:getfield        #76  <Field List extensionRange_>
	//  163  325:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//  164  328:putfield        #76  <Field List extensionRange_>
				bitField0_ = bitField0_ & 0xffffffdf;
	//  165  331:aload_0         
	//  166  332:aload_0         
	//  167  333:getfield        #103 <Field int bitField0_>
	//  168  336:bipush          -33
	//  169  338:iand            
	//  170  339:putfield        #103 <Field int bitField0_>
			}
			DescriptorProtos.DescriptorProto.access$5502(descriptorproto, extensionRange_);
	//  171  342:aload           4
	//  172  344:aload_0         
	//  173  345:getfield        #76  <Field List extensionRange_>
	//  174  348:invokestatic    #433 <Method List DescriptorProtos$DescriptorProto.access$5502(DescriptorProtos$DescriptorProto, List)>
	//  175  351:pop             
		} else
	//* 176  352:goto            368
		{
			DescriptorProtos.DescriptorProto.access$5502(descriptorproto, extensionRangeBuilder_.build());
	//  177  355:aload           4
	//  178  357:aload_0         
	//  179  358:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//  180  361:invokevirtual   #421 <Method List RepeatedFieldBuilderV3.build()>
	//  181  364:invokestatic    #433 <Method List DescriptorProtos$DescriptorProto.access$5502(DescriptorProtos$DescriptorProto, List)>
	//  182  367:pop             
		}
		if(oneofDeclBuilder_ == null)
	//* 183  368:aload_0         
	//* 184  369:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//* 185  372:ifnonnull       422
		{
			if((bitField0_ & 0x40) == 64)
	//* 186  375:aload_0         
	//* 187  376:getfield        #103 <Field int bitField0_>
	//* 188  379:bipush          64
	//* 189  381:iand            
	//* 190  382:bipush          64
	//* 191  384:icmpne          409
			{
				oneofDecl_ = Collections.unmodifiableList(oneofDecl_);
	//  192  387:aload_0         
	//  193  388:aload_0         
	//  194  389:getfield        #78  <Field List oneofDecl_>
	//  195  392:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//  196  395:putfield        #78  <Field List oneofDecl_>
				bitField0_ = bitField0_ & 0xffffffbf;
	//  197  398:aload_0         
	//  198  399:aload_0         
	//  199  400:getfield        #103 <Field int bitField0_>
	//  200  403:bipush          -65
	//  201  405:iand            
	//  202  406:putfield        #103 <Field int bitField0_>
			}
			DescriptorProtos.DescriptorProto.access$5602(descriptorproto, oneofDecl_);
	//  203  409:aload           4
	//  204  411:aload_0         
	//  205  412:getfield        #78  <Field List oneofDecl_>
	//  206  415:invokestatic    #436 <Method List DescriptorProtos$DescriptorProto.access$5602(DescriptorProtos$DescriptorProto, List)>
	//  207  418:pop             
		} else
	//* 208  419:goto            435
		{
			DescriptorProtos.DescriptorProto.access$5602(descriptorproto, oneofDeclBuilder_.build());
	//  209  422:aload           4
	//  210  424:aload_0         
	//  211  425:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//  212  428:invokevirtual   #421 <Method List RepeatedFieldBuilderV3.build()>
	//  213  431:invokestatic    #436 <Method List DescriptorProtos$DescriptorProto.access$5602(DescriptorProtos$DescriptorProto, List)>
	//  214  434:pop             
		}
		int j = i;
	//  215  435:iload_1         
	//  216  436:istore_2        
		if((k & 0x80) == 128)
	//* 217  437:iload_3         
	//* 218  438:sipush          128
	//* 219  441:iand            
	//* 220  442:sipush          128
	//* 221  445:icmpne          452
			j = i | 2;
	//  222  448:iload_1         
	//  223  449:iconst_2        
	//  224  450:ior             
	//  225  451:istore_2        
		if(optionsBuilder_ == null)
	//* 226  452:aload_0         
	//* 227  453:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//* 228  456:ifnonnull       472
			DescriptorProtos.DescriptorProto.access$5702(descriptorproto, options_);
	//  229  459:aload           4
	//  230  461:aload_0         
	//  231  462:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
	//  232  465:invokestatic    #440 <Method DescriptorProtos$MessageOptions DescriptorProtos$DescriptorProto.access$5702(DescriptorProtos$DescriptorProto, DescriptorProtos$MessageOptions)>
	//  233  468:pop             
		else
	//* 234  469:goto            488
			DescriptorProtos.DescriptorProto.access$5702(descriptorproto, (DescriptorProtos.MessageOptions)optionsBuilder_.build());
	//  235  472:aload           4
	//  236  474:aload_0         
	//  237  475:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//  238  478:invokevirtual   #443 <Method AbstractMessage SingleFieldBuilderV3.build()>
	//  239  481:checkcast       #445 <Class DescriptorProtos$MessageOptions>
	//  240  484:invokestatic    #440 <Method DescriptorProtos$MessageOptions DescriptorProtos$DescriptorProto.access$5702(DescriptorProtos$DescriptorProto, DescriptorProtos$MessageOptions)>
	//  241  487:pop             
		if(reservedRangeBuilder_ == null)
	//* 242  488:aload_0         
	//* 243  489:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//* 244  492:ifnonnull       545
		{
			if((bitField0_ & 0x100) == 256)
	//* 245  495:aload_0         
	//* 246  496:getfield        #103 <Field int bitField0_>
	//* 247  499:sipush          256
	//* 248  502:iand            
	//* 249  503:sipush          256
	//* 250  506:icmpne          532
			{
				reservedRange_ = Collections.unmodifiableList(reservedRange_);
	//  251  509:aload_0         
	//  252  510:aload_0         
	//  253  511:getfield        #82  <Field List reservedRange_>
	//  254  514:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//  255  517:putfield        #82  <Field List reservedRange_>
				bitField0_ = bitField0_ & 0xfffffeff;
	//  256  520:aload_0         
	//  257  521:aload_0         
	//  258  522:getfield        #103 <Field int bitField0_>
	//  259  525:sipush          -257
	//  260  528:iand            
	//  261  529:putfield        #103 <Field int bitField0_>
			}
			DescriptorProtos.DescriptorProto.access$5802(descriptorproto, reservedRange_);
	//  262  532:aload           4
	//  263  534:aload_0         
	//  264  535:getfield        #82  <Field List reservedRange_>
	//  265  538:invokestatic    #448 <Method List DescriptorProtos$DescriptorProto.access$5802(DescriptorProtos$DescriptorProto, List)>
	//  266  541:pop             
		} else
	//* 267  542:goto            558
		{
			DescriptorProtos.DescriptorProto.access$5802(descriptorproto, reservedRangeBuilder_.build());
	//  268  545:aload           4
	//  269  547:aload_0         
	//  270  548:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//  271  551:invokevirtual   #421 <Method List RepeatedFieldBuilderV3.build()>
	//  272  554:invokestatic    #448 <Method List DescriptorProtos$DescriptorProto.access$5802(DescriptorProtos$DescriptorProto, List)>
	//  273  557:pop             
		}
		if((bitField0_ & 0x200) == 512)
	//* 274  558:aload_0         
	//* 275  559:getfield        #103 <Field int bitField0_>
	//* 276  562:sipush          512
	//* 277  565:iand            
	//* 278  566:sipush          512
	//* 279  569:icmpne          597
		{
			reservedName_ = reservedName_.getUnmodifiableView();
	//  280  572:aload_0         
	//  281  573:aload_0         
	//  282  574:getfield        #89  <Field LazyStringList reservedName_>
	//  283  577:invokeinterface #452 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//  284  582:putfield        #89  <Field LazyStringList reservedName_>
			bitField0_ = bitField0_ & 0xfffffdff;
	//  285  585:aload_0         
	//  286  586:aload_0         
	//  287  587:getfield        #103 <Field int bitField0_>
	//  288  590:sipush          -513
	//  289  593:iand            
	//  290  594:putfield        #103 <Field int bitField0_>
		}
		DescriptorProtos.DescriptorProto.access$5902(descriptorproto, reservedName_);
	//  291  597:aload           4
	//  292  599:aload_0         
	//  293  600:getfield        #89  <Field LazyStringList reservedName_>
	//  294  603:invokestatic    #456 <Method LazyStringList DescriptorProtos$DescriptorProto.access$5902(DescriptorProtos$DescriptorProto, LazyStringList)>
	//  295  606:pop             
		DescriptorProtos.DescriptorProto.access$6002(descriptorproto, j);
	//  296  607:aload           4
	//  297  609:iload_2         
	//  298  610:invokestatic    #460 <Method int DescriptorProtos$DescriptorProto.access$6002(DescriptorProtos$DescriptorProto, int)>
	//  299  613:pop             
		onBuilt();
	//  300  614:aload_0         
	//  301  615:invokevirtual   #463 <Method void onBuilt()>
		return descriptorproto;
	//  302  618:aload           4
	//  303  620:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #395 <Method DescriptorProtos$DescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #395 <Method DescriptorProtos$DescriptorProto buildPartial()>
	//    2    4:areturn         
	}

	public volatile AbstractMessage.Builder clear()
	{
		return ((AbstractMessage.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method DescriptorProtos$DescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #470 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
	//    2    4:pop             
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #58  <String "">
	//    5    8:putfield        #60  <Field Object name_>
		bitField0_ = bitField0_ & -2;
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #103 <Field int bitField0_>
	//    9   16:bipush          -2
	//   10   18:iand            
	//   11   19:putfield        #103 <Field int bitField0_>
		if(fieldBuilder_ == null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*  14   26:ifnonnull       50
		{
			field_ = Collections.emptyList();
	//   15   29:aload_0         
	//   16   30:invokestatic    #66  <Method List Collections.emptyList()>
	//   17   33:putfield        #68  <Field List field_>
			bitField0_ = bitField0_ & -3;
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #103 <Field int bitField0_>
	//   21   41:bipush          -3
	//   22   43:iand            
	//   23   44:putfield        #103 <Field int bitField0_>
		} else
	//*  24   47:goto            57
		{
			fieldBuilder_.clear();
	//   25   50:aload_0         
	//   26   51:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   27   54:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
		}
		if(extensionBuilder_ == null)
	//*  28   57:aload_0         
	//*  29   58:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*  30   61:ifnonnull       85
		{
			extension_ = Collections.emptyList();
	//   31   64:aload_0         
	//   32   65:invokestatic    #66  <Method List Collections.emptyList()>
	//   33   68:putfield        #70  <Field List extension_>
			bitField0_ = bitField0_ & -5;
	//   34   71:aload_0         
	//   35   72:aload_0         
	//   36   73:getfield        #103 <Field int bitField0_>
	//   37   76:bipush          -5
	//   38   78:iand            
	//   39   79:putfield        #103 <Field int bitField0_>
		} else
	//*  40   82:goto            92
		{
			extensionBuilder_.clear();
	//   41   85:aload_0         
	//   42   86:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   43   89:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
		}
		if(nestedTypeBuilder_ == null)
	//*  44   92:aload_0         
	//*  45   93:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*  46   96:ifnonnull       120
		{
			nestedType_ = Collections.emptyList();
	//   47   99:aload_0         
	//   48  100:invokestatic    #66  <Method List Collections.emptyList()>
	//   49  103:putfield        #72  <Field List nestedType_>
			bitField0_ = bitField0_ & -9;
	//   50  106:aload_0         
	//   51  107:aload_0         
	//   52  108:getfield        #103 <Field int bitField0_>
	//   53  111:bipush          -9
	//   54  113:iand            
	//   55  114:putfield        #103 <Field int bitField0_>
		} else
	//*  56  117:goto            127
		{
			nestedTypeBuilder_.clear();
	//   57  120:aload_0         
	//   58  121:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   59  124:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
		}
		if(enumTypeBuilder_ == null)
	//*  60  127:aload_0         
	//*  61  128:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*  62  131:ifnonnull       155
		{
			enumType_ = Collections.emptyList();
	//   63  134:aload_0         
	//   64  135:invokestatic    #66  <Method List Collections.emptyList()>
	//   65  138:putfield        #74  <Field List enumType_>
			bitField0_ = bitField0_ & 0xffffffef;
	//   66  141:aload_0         
	//   67  142:aload_0         
	//   68  143:getfield        #103 <Field int bitField0_>
	//   69  146:bipush          -17
	//   70  148:iand            
	//   71  149:putfield        #103 <Field int bitField0_>
		} else
	//*  72  152:goto            162
		{
			enumTypeBuilder_.clear();
	//   73  155:aload_0         
	//   74  156:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   75  159:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
		}
		if(extensionRangeBuilder_ == null)
	//*  76  162:aload_0         
	//*  77  163:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*  78  166:ifnonnull       190
		{
			extensionRange_ = Collections.emptyList();
	//   79  169:aload_0         
	//   80  170:invokestatic    #66  <Method List Collections.emptyList()>
	//   81  173:putfield        #76  <Field List extensionRange_>
			bitField0_ = bitField0_ & 0xffffffdf;
	//   82  176:aload_0         
	//   83  177:aload_0         
	//   84  178:getfield        #103 <Field int bitField0_>
	//   85  181:bipush          -33
	//   86  183:iand            
	//   87  184:putfield        #103 <Field int bitField0_>
		} else
	//*  88  187:goto            197
		{
			extensionRangeBuilder_.clear();
	//   89  190:aload_0         
	//   90  191:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   91  194:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
		}
		if(oneofDeclBuilder_ == null)
	//*  92  197:aload_0         
	//*  93  198:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*  94  201:ifnonnull       225
		{
			oneofDecl_ = Collections.emptyList();
	//   95  204:aload_0         
	//   96  205:invokestatic    #66  <Method List Collections.emptyList()>
	//   97  208:putfield        #78  <Field List oneofDecl_>
			bitField0_ = bitField0_ & 0xffffffbf;
	//   98  211:aload_0         
	//   99  212:aload_0         
	//  100  213:getfield        #103 <Field int bitField0_>
	//  101  216:bipush          -65
	//  102  218:iand            
	//  103  219:putfield        #103 <Field int bitField0_>
		} else
	//* 104  222:goto            232
		{
			oneofDeclBuilder_.clear();
	//  105  225:aload_0         
	//  106  226:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//  107  229:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
		}
		if(optionsBuilder_ == null)
	//* 108  232:aload_0         
	//* 109  233:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//* 110  236:ifnonnull       247
			options_ = null;
	//  111  239:aload_0         
	//  112  240:aconst_null     
	//  113  241:putfield        #80  <Field DescriptorProtos$MessageOptions options_>
		else
	//* 114  244:goto            255
			optionsBuilder_.clear();
	//  115  247:aload_0         
	//  116  248:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//  117  251:invokevirtual   #474 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//  118  254:pop             
		bitField0_ = bitField0_ & 0xffffff7f;
	//  119  255:aload_0         
	//  120  256:aload_0         
	//  121  257:getfield        #103 <Field int bitField0_>
	//  122  260:sipush          -129
	//  123  263:iand            
	//  124  264:putfield        #103 <Field int bitField0_>
		if(reservedRangeBuilder_ == null)
	//* 125  267:aload_0         
	//* 126  268:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//* 127  271:ifnonnull       296
		{
			reservedRange_ = Collections.emptyList();
	//  128  274:aload_0         
	//  129  275:invokestatic    #66  <Method List Collections.emptyList()>
	//  130  278:putfield        #82  <Field List reservedRange_>
			bitField0_ = bitField0_ & 0xfffffeff;
	//  131  281:aload_0         
	//  132  282:aload_0         
	//  133  283:getfield        #103 <Field int bitField0_>
	//  134  286:sipush          -257
	//  135  289:iand            
	//  136  290:putfield        #103 <Field int bitField0_>
		} else
	//* 137  293:goto            303
		{
			reservedRangeBuilder_.clear();
	//  138  296:aload_0         
	//  139  297:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//  140  300:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
		}
		reservedName_ = LazyStringArrayList.EMPTY;
	//  141  303:aload_0         
	//  142  304:getstatic       #87  <Field LazyStringList LazyStringArrayList.EMPTY>
	//  143  307:putfield        #89  <Field LazyStringList reservedName_>
		bitField0_ = bitField0_ & 0xfffffdff;
	//  144  310:aload_0         
	//  145  311:aload_0         
	//  146  312:getfield        #103 <Field int bitField0_>
	//  147  315:sipush          -513
	//  148  318:iand            
	//  149  319:putfield        #103 <Field int bitField0_>
		return this;
	//  150  322:aload_0         
	//  151  323:areturn         
	}

	public volatile GeneratedMessageV3.Builder clear()
	{
		return ((GeneratedMessageV3.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method DescriptorProtos$DescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method DescriptorProtos$DescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method DescriptorProtos$DescriptorProto$Builder clear()>
	//    2    4:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder clearEnumType()
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       31
		{
			enumType_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #66  <Method List Collections.emptyList()>
	//    5   11:putfield        #74  <Field List enumType_>
			bitField0_ = bitField0_ & 0xffffffef;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field int bitField0_>
	//    9   19:bipush          -17
	//   10   21:iand            
	//   11   22:putfield        #103 <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			enumTypeBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   18   35:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder clearExtension()
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       31
		{
			extension_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #66  <Method List Collections.emptyList()>
	//    5   11:putfield        #70  <Field List extension_>
			bitField0_ = bitField0_ & -5;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field int bitField0_>
	//    9   19:bipush          -5
	//   10   21:iand            
	//   11   22:putfield        #103 <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			extensionBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   18   35:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder clearExtensionRange()
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       31
		{
			extensionRange_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #66  <Method List Collections.emptyList()>
	//    5   11:putfield        #76  <Field List extensionRange_>
			bitField0_ = bitField0_ & 0xffffffdf;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field int bitField0_>
	//    9   19:bipush          -33
	//   10   21:iand            
	//   11   22:putfield        #103 <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			extensionRangeBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   18   35:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder clearField()
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       31
		{
			field_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #66  <Method List Collections.emptyList()>
	//    5   11:putfield        #68  <Field List field_>
			bitField0_ = bitField0_ & -3;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field int bitField0_>
	//    9   19:bipush          -3
	//   10   21:iand            
	//   11   22:putfield        #103 <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			fieldBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   18   35:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$DescriptorProto$Builder)super.clearField(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #484 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #486 <Method DescriptorProtos$DescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return ((Message.Builder) (clearField(fielddescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #486 <Method DescriptorProtos$DescriptorProto$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder clearName()
	{
		bitField0_ = bitField0_ & -2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #103 <Field int bitField0_>
	//    3    5:bipush          -2
	//    4    7:iand            
	//    5    8:putfield        #103 <Field int bitField0_>
		name_ = ((Object) (DescriptorProtos.DescriptorProto.getDefaultInstance().getName()));
	//    6   11:aload_0         
	//    7   12:invokestatic    #339 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getDefaultInstance()>
	//    8   15:invokevirtual   #492 <Method String DescriptorProtos$DescriptorProto.getName()>
	//    9   18:putfield        #60  <Field Object name_>
		onChanged();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #214 <Method void onChanged()>
		return this;
	//   12   25:aload_0         
	//   13   26:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder clearNestedType()
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       31
		{
			nestedType_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #66  <Method List Collections.emptyList()>
	//    5   11:putfield        #72  <Field List nestedType_>
			bitField0_ = bitField0_ & -9;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field int bitField0_>
	//    9   19:bipush          -9
	//   10   21:iand            
	//   11   22:putfield        #103 <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			nestedTypeBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   18   35:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #498 <Method DescriptorProtos$DescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$DescriptorProto$Builder)super.clearOneof(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #501 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #498 <Method DescriptorProtos$DescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return ((Message.Builder) (clearOneof(oneofdescriptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #498 <Method DescriptorProtos$DescriptorProto$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder clearOneofDecl()
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       31
		{
			oneofDecl_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #66  <Method List Collections.emptyList()>
	//    5   11:putfield        #78  <Field List oneofDecl_>
			bitField0_ = bitField0_ & 0xffffffbf;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field int bitField0_>
	//    9   19:bipush          -65
	//   10   21:iand            
	//   11   22:putfield        #103 <Field int bitField0_>
			onChanged();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		} else
		{
			oneofDeclBuilder_.clear();
	//   16   31:aload_0         
	//   17   32:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   18   35:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   38:aload_0         
	//   20   39:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder clearOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       19
		{
			options_ = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #80  <Field DescriptorProtos$MessageOptions options_>
			onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #214 <Method void onChanged()>
		} else
	//*   8   16:goto            27
		{
			optionsBuilder_.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//   11   23:invokevirtual   #474 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
	//   12   26:pop             
		}
		bitField0_ = bitField0_ & 0xffffff7f;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field int bitField0_>
	//   16   32:sipush          -129
	//   17   35:iand            
	//   18   36:putfield        #103 <Field int bitField0_>
		return this;
	//   19   39:aload_0         
	//   20   40:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder clearReservedName()
	{
		reservedName_ = LazyStringArrayList.EMPTY;
	//    0    0:aload_0         
	//    1    1:getstatic       #87  <Field LazyStringList LazyStringArrayList.EMPTY>
	//    2    4:putfield        #89  <Field LazyStringList reservedName_>
		bitField0_ = bitField0_ & 0xfffffdff;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #103 <Field int bitField0_>
	//    6   12:sipush          -513
	//    7   15:iand            
	//    8   16:putfield        #103 <Field int bitField0_>
		onChanged();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #214 <Method void onChanged()>
		return this;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder clearReservedRange()
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       32
		{
			reservedRange_ = Collections.emptyList();
	//    3    7:aload_0         
	//    4    8:invokestatic    #66  <Method List Collections.emptyList()>
	//    5   11:putfield        #82  <Field List reservedRange_>
			bitField0_ = bitField0_ & 0xfffffeff;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field int bitField0_>
	//    9   19:sipush          -257
	//   10   22:iand            
	//   11   23:putfield        #103 <Field int bitField0_>
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			reservedRangeBuilder_.clear();
	//   16   32:aload_0         
	//   17   33:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   18   36:invokevirtual   #472 <Method void RepeatedFieldBuilderV3.clear()>
			return this;
	//   19   39:aload_0         
	//   20   40:areturn         
		}
	}

	public volatile AbstractMessage.Builder clone()
	{
		return ((AbstractMessage.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #509 <Method DescriptorProtos$DescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile AbstractMessageLite.Builder clone()
	{
		return ((AbstractMessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #509 <Method DescriptorProtos$DescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder clone()
	{
		return (DescriptorProtos$DescriptorProto$Builder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #512 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
	//    2    4:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    3    7:areturn         
	}

	public volatile GeneratedMessageV3.Builder clone()
	{
		return ((GeneratedMessageV3.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #509 <Method DescriptorProtos$DescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #509 <Method DescriptorProtos$DescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #509 <Method DescriptorProtos$DescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #509 <Method DescriptorProtos$DescriptorProto$Builder clone()>
	//    2    4:areturn         
	}

	public DescriptorProtos.DescriptorProto getDefaultInstanceForType()
	{
		return DescriptorProtos.DescriptorProto.getDefaultInstance();
	//    0    0:invokestatic    #339 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getDefaultInstance()>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #519 <Method DescriptorProtos$DescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #519 <Method DescriptorProtos$DescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return DescriptorProtos.access$2600();
	//    0    0:invokestatic    #123 <Method Descriptors$Descriptor DescriptorProtos.access$2600()>
	//    1    3:areturn         
	}

	public DescriptorProtos.EnumDescriptorProto getEnumType(int i)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.EnumDescriptorProto)enumType_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field List enumType_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #280 <Class DescriptorProtos$EnumDescriptorProto>
	//    8   20:areturn         
		else
			return (DescriptorProtos.EnumDescriptorProto)enumTypeBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #530 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #280 <Class DescriptorProtos$EnumDescriptorProto>
	//   14   32:areturn         
	}

	public der getEnumTypeBuilder(int i)
	{
		return (der)getEnumTypeFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #193 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #535 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #250 <Class DescriptorProtos$EnumDescriptorProto$Builder>
	//    5   11:areturn         
	}

	public List getEnumTypeBuilderList()
	{
		return getEnumTypeFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #193 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
	//    2    4:invokevirtual   #539 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getEnumTypeCount()
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       17
			return enumType_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field List enumType_>
	//    5   11:invokeinterface #545 <Method int List.size()>
	//    6   16:ireturn         
		else
			return enumTypeBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//    9   21:invokevirtual   #548 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getEnumTypeList()
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(enumType_);
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field List enumType_>
	//    5   11:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return enumTypeBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//    9   19:invokevirtual   #552 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public lder getEnumTypeOrBuilder(int i)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       21
			return (lder)enumType_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field List enumType_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #557 <Class DescriptorProtos$EnumDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return (lder)enumTypeBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #561 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #557 <Class DescriptorProtos$EnumDescriptorProtoOrBuilder>
	//   14   32:areturn         
	}

	public List getEnumTypeOrBuilderList()
	{
		if(enumTypeBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnull          15
			return enumTypeBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//    5   11:invokevirtual   #565 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(enumType_);
	//    7   15:aload_0         
	//    8   16:getfield        #74  <Field List enumType_>
	//    9   19:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public DescriptorProtos.FieldDescriptorProto getExtension(int i)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.FieldDescriptorProto)extension_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field List extension_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #305 <Class DescriptorProtos$FieldDescriptorProto>
	//    8   20:areturn         
		else
			return (DescriptorProtos.FieldDescriptorProto)extensionBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #530 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #305 <Class DescriptorProtos$FieldDescriptorProto>
	//   14   32:areturn         
	}

	public lder getExtensionBuilder(int i)
	{
		return (lder)getExtensionFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #189 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #535 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    5   11:areturn         
	}

	public List getExtensionBuilderList()
	{
		return getExtensionFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #189 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
	//    2    4:invokevirtual   #539 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getExtensionCount()
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       17
			return extension_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field List extension_>
	//    5   11:invokeinterface #545 <Method int List.size()>
	//    6   16:ireturn         
		else
			return extensionBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//    9   21:invokevirtual   #548 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getExtensionList()
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(extension_);
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field List extension_>
	//    5   11:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return extensionBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//    9   19:invokevirtual   #552 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public ilder getExtensionOrBuilder(int i)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       21
			return (ilder)extension_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field List extension_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #578 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return (ilder)extensionBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #561 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #578 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
	//   14   32:areturn         
	}

	public List getExtensionOrBuilderList()
	{
		if(extensionBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnull          15
			return extensionBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//    5   11:invokevirtual   #565 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(extension_);
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field List extension_>
	//    9   19:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public nRange getExtensionRange(int i)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       21
			return (nRange)extensionRange_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field List extensionRange_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #322 <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    8   20:areturn         
		else
			return (nRange)extensionRangeBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #530 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #322 <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//   14   32:areturn         
	}

	public nRange.Builder getExtensionRangeBuilder(int i)
	{
		return (nRange.Builder)getExtensionRangeFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #195 <Method RepeatedFieldBuilderV3 getExtensionRangeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #535 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #312 <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
	//    5   11:areturn         
	}

	public List getExtensionRangeBuilderList()
	{
		return getExtensionRangeFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #195 <Method RepeatedFieldBuilderV3 getExtensionRangeFieldBuilder()>
	//    2    4:invokevirtual   #539 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getExtensionRangeCount()
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       17
			return extensionRange_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field List extensionRange_>
	//    5   11:invokeinterface #545 <Method int List.size()>
	//    6   16:ireturn         
		else
			return extensionRangeBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//    9   21:invokevirtual   #548 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getExtensionRangeList()
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(extensionRange_);
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field List extensionRange_>
	//    5   11:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return extensionRangeBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//    9   19:invokevirtual   #552 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public nRangeOrBuilder getExtensionRangeOrBuilder(int i)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       21
			return (nRangeOrBuilder)extensionRange_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field List extensionRange_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #592 <Class DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder>
	//    8   20:areturn         
		else
			return (nRangeOrBuilder)extensionRangeBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #561 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #592 <Class DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder>
	//   14   32:areturn         
	}

	public List getExtensionRangeOrBuilderList()
	{
		if(extensionRangeBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnull          15
			return extensionRangeBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//    5   11:invokevirtual   #565 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(extensionRange_);
	//    7   15:aload_0         
	//    8   16:getfield        #76  <Field List extensionRange_>
	//    9   19:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public DescriptorProtos.FieldDescriptorProto getField(int i)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.FieldDescriptorProto)field_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field List field_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #305 <Class DescriptorProtos$FieldDescriptorProto>
	//    8   20:areturn         
		else
			return (DescriptorProtos.FieldDescriptorProto)fieldBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #530 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #305 <Class DescriptorProtos$FieldDescriptorProto>
	//   14   32:areturn         
	}

	public lder getFieldBuilder(int i)
	{
		return (lder)getFieldFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method RepeatedFieldBuilderV3 getFieldFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #535 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
	//    5   11:areturn         
	}

	public List getFieldBuilderList()
	{
		return getFieldFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method RepeatedFieldBuilderV3 getFieldFieldBuilder()>
	//    2    4:invokevirtual   #539 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getFieldCount()
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       17
			return field_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field List field_>
	//    5   11:invokeinterface #545 <Method int List.size()>
	//    6   16:ireturn         
		else
			return fieldBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//    9   21:invokevirtual   #548 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getFieldList()
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(field_);
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field List field_>
	//    5   11:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return fieldBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//    9   19:invokevirtual   #552 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public ilder getFieldOrBuilder(int i)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       21
			return (ilder)field_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field List field_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #578 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return (ilder)fieldBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #561 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #578 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
	//   14   32:areturn         
	}

	public List getFieldOrBuilderList()
	{
		if(fieldBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnull          15
			return fieldBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//    5   11:invokevirtual   #565 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(field_);
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field List field_>
	//    9   19:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Object name_>
	//    2    4:astore_1        
		if(!(obj instanceof String))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #603 <Class String>
	//*   5    9:ifne            36
		{
			obj = ((Object) ((ByteString)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #605 <Class ByteString>
	//    8   16:astore_1        
			String s = ((ByteString) (obj)).toStringUtf8();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #608 <Method String ByteString.toStringUtf8()>
	//   11   21:astore_2        
			if(((ByteString) (obj)).isValidUtf8())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #611 <Method boolean ByteString.isValidUtf8()>
	//*  14   26:ifeq            34
				name_ = ((Object) (s));
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #60  <Field Object name_>
			return s;
	//   18   34:aload_2         
	//   19   35:areturn         
		} else
		{
			return (String)obj;
	//   20   36:aload_1         
	//   21   37:checkcast       #603 <Class String>
	//   22   40:areturn         
		}
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #603 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #603 <Class String>
	//    8   16:invokestatic    #617 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #60  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #605 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos.DescriptorProto getNestedType(int i)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.DescriptorProto)nestedType_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field List nestedType_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #9   <Class DescriptorProtos$DescriptorProto>
	//    8   20:areturn         
		else
			return (DescriptorProtos.DescriptorProto)nestedTypeBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #530 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #9   <Class DescriptorProtos$DescriptorProto>
	//   14   32:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder getNestedTypeBuilder(int i)
	{
		return (DescriptorProtos$DescriptorProto$Builder)getNestedTypeFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #191 <Method RepeatedFieldBuilderV3 getNestedTypeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #535 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    5   11:areturn         
	}

	public List getNestedTypeBuilderList()
	{
		return getNestedTypeFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #191 <Method RepeatedFieldBuilderV3 getNestedTypeFieldBuilder()>
	//    2    4:invokevirtual   #539 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getNestedTypeCount()
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       17
			return nestedType_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field List nestedType_>
	//    5   11:invokeinterface #545 <Method int List.size()>
	//    6   16:ireturn         
		else
			return nestedTypeBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//    9   21:invokevirtual   #548 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getNestedTypeList()
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(nestedType_);
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field List nestedType_>
	//    5   11:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return nestedTypeBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//    9   19:invokevirtual   #552 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public  getNestedTypeOrBuilder(int i)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       21
			return ()nestedType_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field List nestedType_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #7   <Class DescriptorProtos$DescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return ()nestedTypeBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #561 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #7   <Class DescriptorProtos$DescriptorProtoOrBuilder>
	//   14   32:areturn         
	}

	public List getNestedTypeOrBuilderList()
	{
		if(nestedTypeBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnull          15
			return nestedTypeBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//    5   11:invokevirtual   #565 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(nestedType_);
	//    7   15:aload_0         
	//    8   16:getfield        #72  <Field List nestedType_>
	//    9   19:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public DescriptorProtos.OneofDescriptorProto getOneofDecl(int i)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       21
			return (DescriptorProtos.OneofDescriptorProto)oneofDecl_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field List oneofDecl_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #354 <Class DescriptorProtos$OneofDescriptorProto>
	//    8   20:areturn         
		else
			return (DescriptorProtos.OneofDescriptorProto)oneofDeclBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #530 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #354 <Class DescriptorProtos$OneofDescriptorProto>
	//   14   32:areturn         
	}

	public lder getOneofDeclBuilder(int i)
	{
		return (lder)getOneofDeclFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #197 <Method RepeatedFieldBuilderV3 getOneofDeclFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #535 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #344 <Class DescriptorProtos$OneofDescriptorProto$Builder>
	//    5   11:areturn         
	}

	public List getOneofDeclBuilderList()
	{
		return getOneofDeclFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #197 <Method RepeatedFieldBuilderV3 getOneofDeclFieldBuilder()>
	//    2    4:invokevirtual   #539 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getOneofDeclCount()
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       17
			return oneofDecl_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field List oneofDecl_>
	//    5   11:invokeinterface #545 <Method int List.size()>
	//    6   16:ireturn         
		else
			return oneofDeclBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//    9   21:invokevirtual   #548 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getOneofDeclList()
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(oneofDecl_);
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field List oneofDecl_>
	//    5   11:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return oneofDeclBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//    9   19:invokevirtual   #552 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public ilder getOneofDeclOrBuilder(int i)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       21
			return (ilder)oneofDecl_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field List oneofDecl_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #641 <Class DescriptorProtos$OneofDescriptorProtoOrBuilder>
	//    8   20:areturn         
		else
			return (ilder)oneofDeclBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #561 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #641 <Class DescriptorProtos$OneofDescriptorProtoOrBuilder>
	//   14   32:areturn         
	}

	public List getOneofDeclOrBuilderList()
	{
		if(oneofDeclBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnull          15
			return oneofDeclBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//    5   11:invokevirtual   #565 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(oneofDecl_);
	//    7   15:aload_0         
	//    8   16:getfield        #78  <Field List oneofDecl_>
	//    9   19:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public DescriptorProtos.MessageOptions getOptions()
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       23
		{
			if(options_ == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
	//*   5   11:ifnonnull       18
				return DescriptorProtos.MessageOptions.getDefaultInstance();
	//    6   14:invokestatic    #645 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions.getDefaultInstance()>
	//    7   17:areturn         
			else
				return options_;
	//    8   18:aload_0         
	//    9   19:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
	//   10   22:areturn         
		} else
		{
			return (DescriptorProtos.MessageOptions)optionsBuilder_.getMessage();
	//   11   23:aload_0         
	//   12   24:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//   13   27:invokevirtual   #647 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
	//   14   30:checkcast       #445 <Class DescriptorProtos$MessageOptions>
	//   15   33:areturn         
		}
	}

	public DescriptorProtos.MessageOptions.Builder getOptionsBuilder()
	{
		bitField0_ = bitField0_ | 0x80;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #103 <Field int bitField0_>
	//    3    5:sipush          128
	//    4    8:ior             
	//    5    9:putfield        #103 <Field int bitField0_>
		onChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #214 <Method void onChanged()>
		return (DescriptorProtos.MessageOptions.Builder)getOptionsFieldBuilder().getBuilder();
	//    8   16:aload_0         
	//    9   17:invokespecial   #199 <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
	//   10   20:invokevirtual   #651 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
	//   11   23:checkcast       #653 <Class DescriptorProtos$MessageOptions$Builder>
	//   12   26:areturn         
	}

	public DescriptorProtos$MessageOptionsOrBuilder getOptionsOrBuilder()
	{
		if(optionsBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnull          18
			return (DescriptorProtos$MessageOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
	//    3    7:aload_0         
	//    4    8:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//    5   11:invokevirtual   #658 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
	//    6   14:checkcast       #660 <Class DescriptorProtos$MessageOptionsOrBuilder>
	//    7   17:areturn         
		if(options_ == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
	//*  10   22:ifnonnull       29
			return ((DescriptorProtos$MessageOptionsOrBuilder) (DescriptorProtos.MessageOptions.getDefaultInstance()));
	//   11   25:invokestatic    #645 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions.getDefaultInstance()>
	//   12   28:areturn         
		else
			return ((DescriptorProtos$MessageOptionsOrBuilder) (options_));
	//   13   29:aload_0         
	//   14   30:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
	//   15   33:areturn         
	}

	public String getReservedName(int i)
	{
		return (String)reservedName_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field LazyStringList reservedName_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #663 <Method Object LazyStringList.get(int)>
	//    4   10:checkcast       #603 <Class String>
	//    5   13:areturn         
	}

	public ByteString getReservedNameBytes(int i)
	{
		return reservedName_.getByteString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field LazyStringList reservedName_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #668 <Method ByteString LazyStringList.getByteString(int)>
	//    4   10:areturn         
	}

	public int getReservedNameCount()
	{
		return reservedName_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field LazyStringList reservedName_>
	//    2    4:invokeinterface #670 <Method int LazyStringList.size()>
	//    3    9:ireturn         
	}

	public ProtocolStringList getReservedNameList()
	{
		return ((ProtocolStringList) (reservedName_.getUnmodifiableView()));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field LazyStringList reservedName_>
	//    2    4:invokeinterface #452 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//    3    9:areturn         
	}

	public volatile List getReservedNameList()
	{
		return ((List) (getReservedNameList()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #674 <Method ProtocolStringList getReservedNameList()>
	//    2    4:areturn         
	}

	public Range getReservedRange(int i)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       21
			return (Range)reservedRange_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field List reservedRange_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #389 <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//    8   20:areturn         
		else
			return (Range)reservedRangeBuilder_.getMessage(i);
	//    9   21:aload_0         
	//   10   22:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #530 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
	//   13   29:checkcast       #389 <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//   14   32:areturn         
	}

	public Range.Builder getReservedRangeBuilder(int i)
	{
		return (Range.Builder)getReservedRangeFieldBuilder().getBuilder(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #201 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #535 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.getBuilder(int)>
	//    4    8:checkcast       #379 <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
	//    5   11:areturn         
	}

	public List getReservedRangeBuilderList()
	{
		return getReservedRangeFieldBuilder().getBuilderList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #201 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//    2    4:invokevirtual   #539 <Method List RepeatedFieldBuilderV3.getBuilderList()>
	//    3    7:areturn         
	}

	public int getReservedRangeCount()
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       17
			return reservedRange_.size();
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field List reservedRange_>
	//    5   11:invokeinterface #545 <Method int List.size()>
	//    6   16:ireturn         
		else
			return reservedRangeBuilder_.getCount();
	//    7   17:aload_0         
	//    8   18:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//    9   21:invokevirtual   #548 <Method int RepeatedFieldBuilderV3.getCount()>
	//   10   24:ireturn         
	}

	public List getReservedRangeList()
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       15
			return Collections.unmodifiableList(reservedRange_);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field List reservedRange_>
	//    5   11:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
		else
			return reservedRangeBuilder_.getMessageList();
	//    7   15:aload_0         
	//    8   16:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//    9   19:invokevirtual   #552 <Method List RepeatedFieldBuilderV3.getMessageList()>
	//   10   22:areturn         
	}

	public RangeOrBuilder getReservedRangeOrBuilder(int i)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       21
			return (RangeOrBuilder)reservedRange_.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field List reservedRange_>
	//    5   11:iload_1         
	//    6   12:invokeinterface #526 <Method Object List.get(int)>
	//    7   17:checkcast       #686 <Class DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder>
	//    8   20:areturn         
		else
			return (RangeOrBuilder)reservedRangeBuilder_.getMessageOrBuilder(i);
	//    9   21:aload_0         
	//   10   22:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #561 <Method MessageOrBuilder RepeatedFieldBuilderV3.getMessageOrBuilder(int)>
	//   13   29:checkcast       #686 <Class DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder>
	//   14   32:areturn         
	}

	public List getReservedRangeOrBuilderList()
	{
		if(reservedRangeBuilder_ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnull          15
			return reservedRangeBuilder_.getMessageOrBuilderList();
	//    3    7:aload_0         
	//    4    8:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//    5   11:invokevirtual   #565 <Method List RepeatedFieldBuilderV3.getMessageOrBuilderList()>
	//    6   14:areturn         
		else
			return Collections.unmodifiableList(reservedRange_);
	//    7   15:aload_0         
	//    8   16:getfield        #82  <Field List reservedRange_>
	//    9   19:invokestatic    #415 <Method List Collections.unmodifiableList(List)>
	//   10   22:areturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int bitField0_>
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
		return (bitField0_ & 0x80) == 128;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int bitField0_>
	//    2    4:sipush          128
	//    3    7:iand            
	//    4    8:sipush          128
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$2700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$DescriptorProto, com/google/protobuf/DescriptorProtos$DescriptorProto$Builder);
	//    0    0:invokestatic    #695 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$2700()>
	//    1    3:ldc1            #9   <Class DescriptorProtos$DescriptorProto>
	//    2    5:ldc1            #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    3    7:invokevirtual   #701 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < getFieldCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #703 <Method int getFieldCount()>
	//*   5    7:icmpge          30
			if(!getField(i).isInitialized())
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #705 <Method DescriptorProtos$FieldDescriptorProto getField(int)>
	//*   9   15:invokevirtual   #706 <Method boolean DescriptorProtos$FieldDescriptorProto.isInitialized()>
	//*  10   18:ifne            23
				return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         

	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore_1        
	//*  17   27:goto            2
		for(int j = 0; j < getExtensionCount(); j++)
	//*  18   30:iconst_0        
	//*  19   31:istore_1        
	//*  20   32:iload_1         
	//*  21   33:aload_0         
	//*  22   34:invokevirtual   #708 <Method int getExtensionCount()>
	//*  23   37:icmpge          60
			if(!getExtension(j).isInitialized())
	//*  24   40:aload_0         
	//*  25   41:iload_1         
	//*  26   42:invokevirtual   #710 <Method DescriptorProtos$FieldDescriptorProto getExtension(int)>
	//*  27   45:invokevirtual   #706 <Method boolean DescriptorProtos$FieldDescriptorProto.isInitialized()>
	//*  28   48:ifne            53
				return false;
	//   29   51:iconst_0        
	//   30   52:ireturn         

	//   31   53:iload_1         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore_1        
	//*  35   57:goto            32
		for(int k = 0; k < getNestedTypeCount(); k++)
	//*  36   60:iconst_0        
	//*  37   61:istore_1        
	//*  38   62:iload_1         
	//*  39   63:aload_0         
	//*  40   64:invokevirtual   #712 <Method int getNestedTypeCount()>
	//*  41   67:icmpge          90
			if(!getNestedType(k).isInitialized())
	//*  42   70:aload_0         
	//*  43   71:iload_1         
	//*  44   72:invokevirtual   #714 <Method DescriptorProtos$DescriptorProto getNestedType(int)>
	//*  45   75:invokevirtual   #398 <Method boolean DescriptorProtos$DescriptorProto.isInitialized()>
	//*  46   78:ifne            83
				return false;
	//   47   81:iconst_0        
	//   48   82:ireturn         

	//   49   83:iload_1         
	//   50   84:iconst_1        
	//   51   85:iadd            
	//   52   86:istore_1        
	//*  53   87:goto            62
		for(int l = 0; l < getEnumTypeCount(); l++)
	//*  54   90:iconst_0        
	//*  55   91:istore_1        
	//*  56   92:iload_1         
	//*  57   93:aload_0         
	//*  58   94:invokevirtual   #716 <Method int getEnumTypeCount()>
	//*  59   97:icmpge          120
			if(!getEnumType(l).isInitialized())
	//*  60  100:aload_0         
	//*  61  101:iload_1         
	//*  62  102:invokevirtual   #718 <Method DescriptorProtos$EnumDescriptorProto getEnumType(int)>
	//*  63  105:invokevirtual   #719 <Method boolean DescriptorProtos$EnumDescriptorProto.isInitialized()>
	//*  64  108:ifne            113
				return false;
	//   65  111:iconst_0        
	//   66  112:ireturn         

	//   67  113:iload_1         
	//   68  114:iconst_1        
	//   69  115:iadd            
	//   70  116:istore_1        
	//*  71  117:goto            92
		for(int i1 = 0; i1 < getExtensionRangeCount(); i1++)
	//*  72  120:iconst_0        
	//*  73  121:istore_1        
	//*  74  122:iload_1         
	//*  75  123:aload_0         
	//*  76  124:invokevirtual   #721 <Method int getExtensionRangeCount()>
	//*  77  127:icmpge          150
			if(!getExtensionRange(i1).isInitialized())
	//*  78  130:aload_0         
	//*  79  131:iload_1         
	//*  80  132:invokevirtual   #723 <Method DescriptorProtos$DescriptorProto$ExtensionRange getExtensionRange(int)>
	//*  81  135:invokevirtual   #724 <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.isInitialized()>
	//*  82  138:ifne            143
				return false;
	//   83  141:iconst_0        
	//   84  142:ireturn         

	//   85  143:iload_1         
	//   86  144:iconst_1        
	//   87  145:iadd            
	//   88  146:istore_1        
	//*  89  147:goto            122
		for(int j1 = 0; j1 < getOneofDeclCount(); j1++)
	//*  90  150:iconst_0        
	//*  91  151:istore_1        
	//*  92  152:iload_1         
	//*  93  153:aload_0         
	//*  94  154:invokevirtual   #726 <Method int getOneofDeclCount()>
	//*  95  157:icmpge          180
			if(!getOneofDecl(j1).isInitialized())
	//*  96  160:aload_0         
	//*  97  161:iload_1         
	//*  98  162:invokevirtual   #728 <Method DescriptorProtos$OneofDescriptorProto getOneofDecl(int)>
	//*  99  165:invokevirtual   #729 <Method boolean DescriptorProtos$OneofDescriptorProto.isInitialized()>
	//* 100  168:ifne            173
				return false;
	//  101  171:iconst_0        
	//  102  172:ireturn         

	//  103  173:iload_1         
	//  104  174:iconst_1        
	//  105  175:iadd            
	//  106  176:istore_1        
	//* 107  177:goto            152
		return !hasOptions() || getOptions().isInitialized();
	//  108  180:aload_0         
	//  109  181:invokevirtual   #731 <Method boolean hasOptions()>
	//  110  184:ifeq            199
	//  111  187:aload_0         
	//  112  188:invokevirtual   #171 <Method DescriptorProtos$MessageOptions getOptions()>
	//  113  191:invokevirtual   #732 <Method boolean DescriptorProtos$MessageOptions.isInitialized()>
	//  114  194:ifne            199
	//  115  197:iconst_0        
	//  116  198:ireturn         
	//  117  199:iconst_1        
	//  118  200:ireturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #739 <Method DescriptorProtos$DescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile AbstractMessage.Builder mergeFrom(Message message)
	{
		return ((AbstractMessage.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #743 <Method DescriptorProtos$DescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #739 <Method DescriptorProtos$DescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.DescriptorProto)DescriptorProtos.DescriptorProto.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    4    6:getstatic       #750 <Field Parser DescriptorProtos$DescriptorProto.PARSER>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #756 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    8   16:checkcast       #9   <Class DescriptorProtos$DescriptorProto>
	//    9   19:astore_1        
		if(codedinputstream != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          64
		{
			mergeFrom(((DescriptorProtos.DescriptorProto) (codedinputstream)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #758 <Method DescriptorProtos$DescriptorProto$Builder mergeFrom(DescriptorProtos$DescriptorProto)>
	//   15   29:pop             
			return this;
	//   16   30:aload_0         
	//   17   31:areturn         
		} else
	//*  18   32:astore_2        
	//*  19   33:aload           4
	//*  20   35:astore_3        
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #761 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
	//*  23   40:checkcast       #9   <Class DescriptorProtos$DescriptorProto>
	//*  24   43:astore_1        
	//*  25   44:aload_1         
	//*  26   45:astore_3        
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #765 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
	//*  29   50:athrow          
	//*  30   51:astore_1        
	//*  31   52:aload_3         
	//*  32   53:ifnull          62
	//*  33   56:aload_0         
	//*  34   57:aload_3         
	//*  35   58:invokevirtual   #758 <Method DescriptorProtos$DescriptorProto$Builder mergeFrom(DescriptorProtos$DescriptorProto)>
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
		codedinputstream = ((CodedInputStream) ((DescriptorProtos.DescriptorProto)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
		codedinputstream1 = codedinputstream;
		throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
		codedinputstream;
		if(codedinputstream1 != null)
			mergeFrom(((DescriptorProtos.DescriptorProto) (codedinputstream1)));
		throw codedinputstream;
	}

	public DescriptorProtos$DescriptorProto$Builder mergeFrom(DescriptorProtos.DescriptorProto descriptorproto)
	{
		if(descriptorproto == DescriptorProtos.DescriptorProto.getDefaultInstance())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #339 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getDefaultInstance()>
	//*   2    4:if_acmpne       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(descriptorproto.hasName())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #767 <Method boolean DescriptorProtos$DescriptorProto.hasName()>
	//*   7   13:ifeq            38
		{
			bitField0_ = bitField0_ | 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #103 <Field int bitField0_>
	//   11   21:iconst_1        
	//   12   22:ior             
	//   13   23:putfield        #103 <Field int bitField0_>
			name_ = DescriptorProtos.DescriptorProto.access$5000(descriptorproto);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokestatic    #771 <Method Object DescriptorProtos$DescriptorProto.access$5000(DescriptorProtos$DescriptorProto)>
	//   17   31:putfield        #60  <Field Object name_>
			onChanged();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #214 <Method void onChanged()>
		}
		if(fieldBuilder_ == null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*  22   42:ifnonnull       116
		{
			if(!DescriptorProtos.DescriptorProto.access$5100(descriptorproto).isEmpty())
	//*  23   45:aload_1         
	//*  24   46:invokestatic    #775 <Method List DescriptorProtos$DescriptorProto.access$5100(DescriptorProtos$DescriptorProto)>
	//*  25   49:invokeinterface #778 <Method boolean List.isEmpty()>
	//*  26   54:ifne            205
			{
				if(field_.isEmpty())
	//*  27   57:aload_0         
	//*  28   58:getfield        #68  <Field List field_>
	//*  29   61:invokeinterface #778 <Method boolean List.isEmpty()>
	//*  30   66:ifeq            91
				{
					field_ = DescriptorProtos.DescriptorProto.access$5100(descriptorproto);
	//   31   69:aload_0         
	//   32   70:aload_1         
	//   33   71:invokestatic    #775 <Method List DescriptorProtos$DescriptorProto.access$5100(DescriptorProtos$DescriptorProto)>
	//   34   74:putfield        #68  <Field List field_>
					bitField0_ = bitField0_ & -3;
	//   35   77:aload_0         
	//   36   78:aload_0         
	//   37   79:getfield        #103 <Field int bitField0_>
	//   38   82:bipush          -3
	//   39   84:iand            
	//   40   85:putfield        #103 <Field int bitField0_>
				} else
	//*  41   88:goto            109
				{
					ensureFieldIsMutable();
	//   42   91:aload_0         
	//   43   92:invokespecial   #230 <Method void ensureFieldIsMutable()>
					field_.addAll(((java.util.Collection) (DescriptorProtos.DescriptorProto.access$5100(descriptorproto))));
	//   44   95:aload_0         
	//   45   96:getfield        #68  <Field List field_>
	//   46   99:aload_1         
	//   47  100:invokestatic    #775 <Method List DescriptorProtos$DescriptorProto.access$5100(DescriptorProtos$DescriptorProto)>
	//   48  103:invokeinterface #781 <Method boolean List.addAll(java.util.Collection)>
	//   49  108:pop             
				}
				onChanged();
	//   50  109:aload_0         
	//   51  110:invokevirtual   #214 <Method void onChanged()>
			}
		} else
	//*  52  113:goto            205
		if(!DescriptorProtos.DescriptorProto.access$5100(descriptorproto).isEmpty())
	//*  53  116:aload_1         
	//*  54  117:invokestatic    #775 <Method List DescriptorProtos$DescriptorProto.access$5100(DescriptorProtos$DescriptorProto)>
	//*  55  120:invokeinterface #778 <Method boolean List.isEmpty()>
	//*  56  125:ifne            205
			if(fieldBuilder_.isEmpty())
	//*  57  128:aload_0         
	//*  58  129:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*  59  132:invokevirtual   #782 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//*  60  135:ifeq            193
			{
				fieldBuilder_.dispose();
	//   61  138:aload_0         
	//   62  139:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   63  142:invokevirtual   #785 <Method void RepeatedFieldBuilderV3.dispose()>
				fieldBuilder_ = null;
	//   64  145:aload_0         
	//   65  146:aconst_null     
	//   66  147:putfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
				field_ = DescriptorProtos.DescriptorProto.access$5100(descriptorproto);
	//   67  150:aload_0         
	//   68  151:aload_1         
	//   69  152:invokestatic    #775 <Method List DescriptorProtos$DescriptorProto.access$5100(DescriptorProtos$DescriptorProto)>
	//   70  155:putfield        #68  <Field List field_>
				bitField0_ = bitField0_ & -3;
	//   71  158:aload_0         
	//   72  159:aload_0         
	//   73  160:getfield        #103 <Field int bitField0_>
	//   74  163:bipush          -3
	//   75  165:iand            
	//   76  166:putfield        #103 <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//*  77  169:getstatic       #185 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//*  78  172:ifeq            183
					repeatedfieldbuilderv3 = getFieldFieldBuilder();
	//   79  175:aload_0         
	//   80  176:invokespecial   #187 <Method RepeatedFieldBuilderV3 getFieldFieldBuilder()>
	//   81  179:astore_2        
				else
	//*  82  180:goto            185
					repeatedfieldbuilderv3 = null;
	//   83  183:aconst_null     
	//   84  184:astore_2        
				fieldBuilder_ = repeatedfieldbuilderv3;
	//   85  185:aload_0         
	//   86  186:aload_2         
	//   87  187:putfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
			} else
	//*  88  190:goto            205
			{
				fieldBuilder_.addAllMessages(((Iterable) (DescriptorProtos.DescriptorProto.access$5100(descriptorproto))));
	//   89  193:aload_0         
	//   90  194:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   91  197:aload_1         
	//   92  198:invokestatic    #775 <Method List DescriptorProtos$DescriptorProto.access$5100(DescriptorProtos$DescriptorProto)>
	//   93  201:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//   94  204:pop             
			}
		if(extensionBuilder_ == null)
	//*  95  205:aload_0         
	//*  96  206:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*  97  209:ifnonnull       283
		{
			if(!DescriptorProtos.DescriptorProto.access$5200(descriptorproto).isEmpty())
	//*  98  212:aload_1         
	//*  99  213:invokestatic    #788 <Method List DescriptorProtos$DescriptorProto.access$5200(DescriptorProtos$DescriptorProto)>
	//* 100  216:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 101  221:ifne            372
			{
				if(extension_.isEmpty())
	//* 102  224:aload_0         
	//* 103  225:getfield        #70  <Field List extension_>
	//* 104  228:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 105  233:ifeq            258
				{
					extension_ = DescriptorProtos.DescriptorProto.access$5200(descriptorproto);
	//  106  236:aload_0         
	//  107  237:aload_1         
	//  108  238:invokestatic    #788 <Method List DescriptorProtos$DescriptorProto.access$5200(DescriptorProtos$DescriptorProto)>
	//  109  241:putfield        #70  <Field List extension_>
					bitField0_ = bitField0_ & -5;
	//  110  244:aload_0         
	//  111  245:aload_0         
	//  112  246:getfield        #103 <Field int bitField0_>
	//  113  249:bipush          -5
	//  114  251:iand            
	//  115  252:putfield        #103 <Field int bitField0_>
				} else
	//* 116  255:goto            276
				{
					ensureExtensionIsMutable();
	//  117  258:aload_0         
	//  118  259:invokespecial   #222 <Method void ensureExtensionIsMutable()>
					extension_.addAll(((java.util.Collection) (DescriptorProtos.DescriptorProto.access$5200(descriptorproto))));
	//  119  262:aload_0         
	//  120  263:getfield        #70  <Field List extension_>
	//  121  266:aload_1         
	//  122  267:invokestatic    #788 <Method List DescriptorProtos$DescriptorProto.access$5200(DescriptorProtos$DescriptorProto)>
	//  123  270:invokeinterface #781 <Method boolean List.addAll(java.util.Collection)>
	//  124  275:pop             
				}
				onChanged();
	//  125  276:aload_0         
	//  126  277:invokevirtual   #214 <Method void onChanged()>
			}
		} else
	//* 127  280:goto            372
		if(!DescriptorProtos.DescriptorProto.access$5200(descriptorproto).isEmpty())
	//* 128  283:aload_1         
	//* 129  284:invokestatic    #788 <Method List DescriptorProtos$DescriptorProto.access$5200(DescriptorProtos$DescriptorProto)>
	//* 130  287:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 131  292:ifne            372
			if(extensionBuilder_.isEmpty())
	//* 132  295:aload_0         
	//* 133  296:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//* 134  299:invokevirtual   #782 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 135  302:ifeq            360
			{
				extensionBuilder_.dispose();
	//  136  305:aload_0         
	//  137  306:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//  138  309:invokevirtual   #785 <Method void RepeatedFieldBuilderV3.dispose()>
				extensionBuilder_ = null;
	//  139  312:aload_0         
	//  140  313:aconst_null     
	//  141  314:putfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
				extension_ = DescriptorProtos.DescriptorProto.access$5200(descriptorproto);
	//  142  317:aload_0         
	//  143  318:aload_1         
	//  144  319:invokestatic    #788 <Method List DescriptorProtos$DescriptorProto.access$5200(DescriptorProtos$DescriptorProto)>
	//  145  322:putfield        #70  <Field List extension_>
				bitField0_ = bitField0_ & -5;
	//  146  325:aload_0         
	//  147  326:aload_0         
	//  148  327:getfield        #103 <Field int bitField0_>
	//  149  330:bipush          -5
	//  150  332:iand            
	//  151  333:putfield        #103 <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3_1;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 152  336:getstatic       #185 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 153  339:ifeq            350
					repeatedfieldbuilderv3_1 = getExtensionFieldBuilder();
	//  154  342:aload_0         
	//  155  343:invokespecial   #189 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
	//  156  346:astore_2        
				else
	//* 157  347:goto            352
					repeatedfieldbuilderv3_1 = null;
	//  158  350:aconst_null     
	//  159  351:astore_2        
				extensionBuilder_ = repeatedfieldbuilderv3_1;
	//  160  352:aload_0         
	//  161  353:aload_2         
	//  162  354:putfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
			} else
	//* 163  357:goto            372
			{
				extensionBuilder_.addAllMessages(((Iterable) (DescriptorProtos.DescriptorProto.access$5200(descriptorproto))));
	//  164  360:aload_0         
	//  165  361:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//  166  364:aload_1         
	//  167  365:invokestatic    #788 <Method List DescriptorProtos$DescriptorProto.access$5200(DescriptorProtos$DescriptorProto)>
	//  168  368:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  169  371:pop             
			}
		if(nestedTypeBuilder_ == null)
	//* 170  372:aload_0         
	//* 171  373:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//* 172  376:ifnonnull       450
		{
			if(!DescriptorProtos.DescriptorProto.access$5300(descriptorproto).isEmpty())
	//* 173  379:aload_1         
	//* 174  380:invokestatic    #791 <Method List DescriptorProtos$DescriptorProto.access$5300(DescriptorProtos$DescriptorProto)>
	//* 175  383:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 176  388:ifne            539
			{
				if(nestedType_.isEmpty())
	//* 177  391:aload_0         
	//* 178  392:getfield        #72  <Field List nestedType_>
	//* 179  395:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 180  400:ifeq            425
				{
					nestedType_ = DescriptorProtos.DescriptorProto.access$5300(descriptorproto);
	//  181  403:aload_0         
	//  182  404:aload_1         
	//  183  405:invokestatic    #791 <Method List DescriptorProtos$DescriptorProto.access$5300(DescriptorProtos$DescriptorProto)>
	//  184  408:putfield        #72  <Field List nestedType_>
					bitField0_ = bitField0_ & -9;
	//  185  411:aload_0         
	//  186  412:aload_0         
	//  187  413:getfield        #103 <Field int bitField0_>
	//  188  416:bipush          -9
	//  189  418:iand            
	//  190  419:putfield        #103 <Field int bitField0_>
				} else
	//* 191  422:goto            443
				{
					ensureNestedTypeIsMutable();
	//  192  425:aload_0         
	//  193  426:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
					nestedType_.addAll(((java.util.Collection) (DescriptorProtos.DescriptorProto.access$5300(descriptorproto))));
	//  194  429:aload_0         
	//  195  430:getfield        #72  <Field List nestedType_>
	//  196  433:aload_1         
	//  197  434:invokestatic    #791 <Method List DescriptorProtos$DescriptorProto.access$5300(DescriptorProtos$DescriptorProto)>
	//  198  437:invokeinterface #781 <Method boolean List.addAll(java.util.Collection)>
	//  199  442:pop             
				}
				onChanged();
	//  200  443:aload_0         
	//  201  444:invokevirtual   #214 <Method void onChanged()>
			}
		} else
	//* 202  447:goto            539
		if(!DescriptorProtos.DescriptorProto.access$5300(descriptorproto).isEmpty())
	//* 203  450:aload_1         
	//* 204  451:invokestatic    #791 <Method List DescriptorProtos$DescriptorProto.access$5300(DescriptorProtos$DescriptorProto)>
	//* 205  454:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 206  459:ifne            539
			if(nestedTypeBuilder_.isEmpty())
	//* 207  462:aload_0         
	//* 208  463:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//* 209  466:invokevirtual   #782 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 210  469:ifeq            527
			{
				nestedTypeBuilder_.dispose();
	//  211  472:aload_0         
	//  212  473:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//  213  476:invokevirtual   #785 <Method void RepeatedFieldBuilderV3.dispose()>
				nestedTypeBuilder_ = null;
	//  214  479:aload_0         
	//  215  480:aconst_null     
	//  216  481:putfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
				nestedType_ = DescriptorProtos.DescriptorProto.access$5300(descriptorproto);
	//  217  484:aload_0         
	//  218  485:aload_1         
	//  219  486:invokestatic    #791 <Method List DescriptorProtos$DescriptorProto.access$5300(DescriptorProtos$DescriptorProto)>
	//  220  489:putfield        #72  <Field List nestedType_>
				bitField0_ = bitField0_ & -9;
	//  221  492:aload_0         
	//  222  493:aload_0         
	//  223  494:getfield        #103 <Field int bitField0_>
	//  224  497:bipush          -9
	//  225  499:iand            
	//  226  500:putfield        #103 <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3_2;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 227  503:getstatic       #185 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 228  506:ifeq            517
					repeatedfieldbuilderv3_2 = getNestedTypeFieldBuilder();
	//  229  509:aload_0         
	//  230  510:invokespecial   #191 <Method RepeatedFieldBuilderV3 getNestedTypeFieldBuilder()>
	//  231  513:astore_2        
				else
	//* 232  514:goto            519
					repeatedfieldbuilderv3_2 = null;
	//  233  517:aconst_null     
	//  234  518:astore_2        
				nestedTypeBuilder_ = repeatedfieldbuilderv3_2;
	//  235  519:aload_0         
	//  236  520:aload_2         
	//  237  521:putfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
			} else
	//* 238  524:goto            539
			{
				nestedTypeBuilder_.addAllMessages(((Iterable) (DescriptorProtos.DescriptorProto.access$5300(descriptorproto))));
	//  239  527:aload_0         
	//  240  528:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//  241  531:aload_1         
	//  242  532:invokestatic    #791 <Method List DescriptorProtos$DescriptorProto.access$5300(DescriptorProtos$DescriptorProto)>
	//  243  535:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  244  538:pop             
			}
		if(enumTypeBuilder_ == null)
	//* 245  539:aload_0         
	//* 246  540:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//* 247  543:ifnonnull       617
		{
			if(!DescriptorProtos.DescriptorProto.access$5400(descriptorproto).isEmpty())
	//* 248  546:aload_1         
	//* 249  547:invokestatic    #794 <Method List DescriptorProtos$DescriptorProto.access$5400(DescriptorProtos$DescriptorProto)>
	//* 250  550:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 251  555:ifne            706
			{
				if(enumType_.isEmpty())
	//* 252  558:aload_0         
	//* 253  559:getfield        #74  <Field List enumType_>
	//* 254  562:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 255  567:ifeq            592
				{
					enumType_ = DescriptorProtos.DescriptorProto.access$5400(descriptorproto);
	//  256  570:aload_0         
	//  257  571:aload_1         
	//  258  572:invokestatic    #794 <Method List DescriptorProtos$DescriptorProto.access$5400(DescriptorProtos$DescriptorProto)>
	//  259  575:putfield        #74  <Field List enumType_>
					bitField0_ = bitField0_ & 0xffffffef;
	//  260  578:aload_0         
	//  261  579:aload_0         
	//  262  580:getfield        #103 <Field int bitField0_>
	//  263  583:bipush          -17
	//  264  585:iand            
	//  265  586:putfield        #103 <Field int bitField0_>
				} else
	//* 266  589:goto            610
				{
					ensureEnumTypeIsMutable();
	//  267  592:aload_0         
	//  268  593:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
					enumType_.addAll(((java.util.Collection) (DescriptorProtos.DescriptorProto.access$5400(descriptorproto))));
	//  269  596:aload_0         
	//  270  597:getfield        #74  <Field List enumType_>
	//  271  600:aload_1         
	//  272  601:invokestatic    #794 <Method List DescriptorProtos$DescriptorProto.access$5400(DescriptorProtos$DescriptorProto)>
	//  273  604:invokeinterface #781 <Method boolean List.addAll(java.util.Collection)>
	//  274  609:pop             
				}
				onChanged();
	//  275  610:aload_0         
	//  276  611:invokevirtual   #214 <Method void onChanged()>
			}
		} else
	//* 277  614:goto            706
		if(!DescriptorProtos.DescriptorProto.access$5400(descriptorproto).isEmpty())
	//* 278  617:aload_1         
	//* 279  618:invokestatic    #794 <Method List DescriptorProtos$DescriptorProto.access$5400(DescriptorProtos$DescriptorProto)>
	//* 280  621:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 281  626:ifne            706
			if(enumTypeBuilder_.isEmpty())
	//* 282  629:aload_0         
	//* 283  630:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//* 284  633:invokevirtual   #782 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 285  636:ifeq            694
			{
				enumTypeBuilder_.dispose();
	//  286  639:aload_0         
	//  287  640:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//  288  643:invokevirtual   #785 <Method void RepeatedFieldBuilderV3.dispose()>
				enumTypeBuilder_ = null;
	//  289  646:aload_0         
	//  290  647:aconst_null     
	//  291  648:putfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
				enumType_ = DescriptorProtos.DescriptorProto.access$5400(descriptorproto);
	//  292  651:aload_0         
	//  293  652:aload_1         
	//  294  653:invokestatic    #794 <Method List DescriptorProtos$DescriptorProto.access$5400(DescriptorProtos$DescriptorProto)>
	//  295  656:putfield        #74  <Field List enumType_>
				bitField0_ = bitField0_ & 0xffffffef;
	//  296  659:aload_0         
	//  297  660:aload_0         
	//  298  661:getfield        #103 <Field int bitField0_>
	//  299  664:bipush          -17
	//  300  666:iand            
	//  301  667:putfield        #103 <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3_3;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 302  670:getstatic       #185 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 303  673:ifeq            684
					repeatedfieldbuilderv3_3 = getEnumTypeFieldBuilder();
	//  304  676:aload_0         
	//  305  677:invokespecial   #193 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
	//  306  680:astore_2        
				else
	//* 307  681:goto            686
					repeatedfieldbuilderv3_3 = null;
	//  308  684:aconst_null     
	//  309  685:astore_2        
				enumTypeBuilder_ = repeatedfieldbuilderv3_3;
	//  310  686:aload_0         
	//  311  687:aload_2         
	//  312  688:putfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
			} else
	//* 313  691:goto            706
			{
				enumTypeBuilder_.addAllMessages(((Iterable) (DescriptorProtos.DescriptorProto.access$5400(descriptorproto))));
	//  314  694:aload_0         
	//  315  695:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//  316  698:aload_1         
	//  317  699:invokestatic    #794 <Method List DescriptorProtos$DescriptorProto.access$5400(DescriptorProtos$DescriptorProto)>
	//  318  702:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  319  705:pop             
			}
		if(extensionRangeBuilder_ == null)
	//* 320  706:aload_0         
	//* 321  707:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//* 322  710:ifnonnull       784
		{
			if(!DescriptorProtos.DescriptorProto.access$5500(descriptorproto).isEmpty())
	//* 323  713:aload_1         
	//* 324  714:invokestatic    #797 <Method List DescriptorProtos$DescriptorProto.access$5500(DescriptorProtos$DescriptorProto)>
	//* 325  717:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 326  722:ifne            873
			{
				if(extensionRange_.isEmpty())
	//* 327  725:aload_0         
	//* 328  726:getfield        #76  <Field List extensionRange_>
	//* 329  729:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 330  734:ifeq            759
				{
					extensionRange_ = DescriptorProtos.DescriptorProto.access$5500(descriptorproto);
	//  331  737:aload_0         
	//  332  738:aload_1         
	//  333  739:invokestatic    #797 <Method List DescriptorProtos$DescriptorProto.access$5500(DescriptorProtos$DescriptorProto)>
	//  334  742:putfield        #76  <Field List extensionRange_>
					bitField0_ = bitField0_ & 0xffffffdf;
	//  335  745:aload_0         
	//  336  746:aload_0         
	//  337  747:getfield        #103 <Field int bitField0_>
	//  338  750:bipush          -33
	//  339  752:iand            
	//  340  753:putfield        #103 <Field int bitField0_>
				} else
	//* 341  756:goto            777
				{
					ensureExtensionRangeIsMutable();
	//  342  759:aload_0         
	//  343  760:invokespecial   #226 <Method void ensureExtensionRangeIsMutable()>
					extensionRange_.addAll(((java.util.Collection) (DescriptorProtos.DescriptorProto.access$5500(descriptorproto))));
	//  344  763:aload_0         
	//  345  764:getfield        #76  <Field List extensionRange_>
	//  346  767:aload_1         
	//  347  768:invokestatic    #797 <Method List DescriptorProtos$DescriptorProto.access$5500(DescriptorProtos$DescriptorProto)>
	//  348  771:invokeinterface #781 <Method boolean List.addAll(java.util.Collection)>
	//  349  776:pop             
				}
				onChanged();
	//  350  777:aload_0         
	//  351  778:invokevirtual   #214 <Method void onChanged()>
			}
		} else
	//* 352  781:goto            873
		if(!DescriptorProtos.DescriptorProto.access$5500(descriptorproto).isEmpty())
	//* 353  784:aload_1         
	//* 354  785:invokestatic    #797 <Method List DescriptorProtos$DescriptorProto.access$5500(DescriptorProtos$DescriptorProto)>
	//* 355  788:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 356  793:ifne            873
			if(extensionRangeBuilder_.isEmpty())
	//* 357  796:aload_0         
	//* 358  797:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//* 359  800:invokevirtual   #782 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 360  803:ifeq            861
			{
				extensionRangeBuilder_.dispose();
	//  361  806:aload_0         
	//  362  807:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//  363  810:invokevirtual   #785 <Method void RepeatedFieldBuilderV3.dispose()>
				extensionRangeBuilder_ = null;
	//  364  813:aload_0         
	//  365  814:aconst_null     
	//  366  815:putfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
				extensionRange_ = DescriptorProtos.DescriptorProto.access$5500(descriptorproto);
	//  367  818:aload_0         
	//  368  819:aload_1         
	//  369  820:invokestatic    #797 <Method List DescriptorProtos$DescriptorProto.access$5500(DescriptorProtos$DescriptorProto)>
	//  370  823:putfield        #76  <Field List extensionRange_>
				bitField0_ = bitField0_ & 0xffffffdf;
	//  371  826:aload_0         
	//  372  827:aload_0         
	//  373  828:getfield        #103 <Field int bitField0_>
	//  374  831:bipush          -33
	//  375  833:iand            
	//  376  834:putfield        #103 <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3_4;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 377  837:getstatic       #185 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 378  840:ifeq            851
					repeatedfieldbuilderv3_4 = getExtensionRangeFieldBuilder();
	//  379  843:aload_0         
	//  380  844:invokespecial   #195 <Method RepeatedFieldBuilderV3 getExtensionRangeFieldBuilder()>
	//  381  847:astore_2        
				else
	//* 382  848:goto            853
					repeatedfieldbuilderv3_4 = null;
	//  383  851:aconst_null     
	//  384  852:astore_2        
				extensionRangeBuilder_ = repeatedfieldbuilderv3_4;
	//  385  853:aload_0         
	//  386  854:aload_2         
	//  387  855:putfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
			} else
	//* 388  858:goto            873
			{
				extensionRangeBuilder_.addAllMessages(((Iterable) (DescriptorProtos.DescriptorProto.access$5500(descriptorproto))));
	//  389  861:aload_0         
	//  390  862:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//  391  865:aload_1         
	//  392  866:invokestatic    #797 <Method List DescriptorProtos$DescriptorProto.access$5500(DescriptorProtos$DescriptorProto)>
	//  393  869:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  394  872:pop             
			}
		if(oneofDeclBuilder_ == null)
	//* 395  873:aload_0         
	//* 396  874:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//* 397  877:ifnonnull       951
		{
			if(!DescriptorProtos.DescriptorProto.access$5600(descriptorproto).isEmpty())
	//* 398  880:aload_1         
	//* 399  881:invokestatic    #800 <Method List DescriptorProtos$DescriptorProto.access$5600(DescriptorProtos$DescriptorProto)>
	//* 400  884:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 401  889:ifne            1040
			{
				if(oneofDecl_.isEmpty())
	//* 402  892:aload_0         
	//* 403  893:getfield        #78  <Field List oneofDecl_>
	//* 404  896:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 405  901:ifeq            926
				{
					oneofDecl_ = DescriptorProtos.DescriptorProto.access$5600(descriptorproto);
	//  406  904:aload_0         
	//  407  905:aload_1         
	//  408  906:invokestatic    #800 <Method List DescriptorProtos$DescriptorProto.access$5600(DescriptorProtos$DescriptorProto)>
	//  409  909:putfield        #78  <Field List oneofDecl_>
					bitField0_ = bitField0_ & 0xffffffbf;
	//  410  912:aload_0         
	//  411  913:aload_0         
	//  412  914:getfield        #103 <Field int bitField0_>
	//  413  917:bipush          -65
	//  414  919:iand            
	//  415  920:putfield        #103 <Field int bitField0_>
				} else
	//* 416  923:goto            944
				{
					ensureOneofDeclIsMutable();
	//  417  926:aload_0         
	//  418  927:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
					oneofDecl_.addAll(((java.util.Collection) (DescriptorProtos.DescriptorProto.access$5600(descriptorproto))));
	//  419  930:aload_0         
	//  420  931:getfield        #78  <Field List oneofDecl_>
	//  421  934:aload_1         
	//  422  935:invokestatic    #800 <Method List DescriptorProtos$DescriptorProto.access$5600(DescriptorProtos$DescriptorProto)>
	//  423  938:invokeinterface #781 <Method boolean List.addAll(java.util.Collection)>
	//  424  943:pop             
				}
				onChanged();
	//  425  944:aload_0         
	//  426  945:invokevirtual   #214 <Method void onChanged()>
			}
		} else
	//* 427  948:goto            1040
		if(!DescriptorProtos.DescriptorProto.access$5600(descriptorproto).isEmpty())
	//* 428  951:aload_1         
	//* 429  952:invokestatic    #800 <Method List DescriptorProtos$DescriptorProto.access$5600(DescriptorProtos$DescriptorProto)>
	//* 430  955:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 431  960:ifne            1040
			if(oneofDeclBuilder_.isEmpty())
	//* 432  963:aload_0         
	//* 433  964:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//* 434  967:invokevirtual   #782 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 435  970:ifeq            1028
			{
				oneofDeclBuilder_.dispose();
	//  436  973:aload_0         
	//  437  974:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//  438  977:invokevirtual   #785 <Method void RepeatedFieldBuilderV3.dispose()>
				oneofDeclBuilder_ = null;
	//  439  980:aload_0         
	//  440  981:aconst_null     
	//  441  982:putfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
				oneofDecl_ = DescriptorProtos.DescriptorProto.access$5600(descriptorproto);
	//  442  985:aload_0         
	//  443  986:aload_1         
	//  444  987:invokestatic    #800 <Method List DescriptorProtos$DescriptorProto.access$5600(DescriptorProtos$DescriptorProto)>
	//  445  990:putfield        #78  <Field List oneofDecl_>
				bitField0_ = bitField0_ & 0xffffffbf;
	//  446  993:aload_0         
	//  447  994:aload_0         
	//  448  995:getfield        #103 <Field int bitField0_>
	//  449  998:bipush          -65
	//  450 1000:iand            
	//  451 1001:putfield        #103 <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3_5;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 452 1004:getstatic       #185 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 453 1007:ifeq            1018
					repeatedfieldbuilderv3_5 = getOneofDeclFieldBuilder();
	//  454 1010:aload_0         
	//  455 1011:invokespecial   #197 <Method RepeatedFieldBuilderV3 getOneofDeclFieldBuilder()>
	//  456 1014:astore_2        
				else
	//* 457 1015:goto            1020
					repeatedfieldbuilderv3_5 = null;
	//  458 1018:aconst_null     
	//  459 1019:astore_2        
				oneofDeclBuilder_ = repeatedfieldbuilderv3_5;
	//  460 1020:aload_0         
	//  461 1021:aload_2         
	//  462 1022:putfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
			} else
	//* 463 1025:goto            1040
			{
				oneofDeclBuilder_.addAllMessages(((Iterable) (DescriptorProtos.DescriptorProto.access$5600(descriptorproto))));
	//  464 1028:aload_0         
	//  465 1029:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//  466 1032:aload_1         
	//  467 1033:invokestatic    #800 <Method List DescriptorProtos$DescriptorProto.access$5600(DescriptorProtos$DescriptorProto)>
	//  468 1036:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  469 1039:pop             
			}
		if(descriptorproto.hasOptions())
	//* 470 1040:aload_1         
	//* 471 1041:invokevirtual   #801 <Method boolean DescriptorProtos$DescriptorProto.hasOptions()>
	//* 472 1044:ifeq            1056
			mergeOptions(descriptorproto.getOptions());
	//  473 1047:aload_0         
	//  474 1048:aload_1         
	//  475 1049:invokevirtual   #802 <Method DescriptorProtos$MessageOptions DescriptorProtos$DescriptorProto.getOptions()>
	//  476 1052:invokevirtual   #806 <Method DescriptorProtos$DescriptorProto$Builder mergeOptions(DescriptorProtos$MessageOptions)>
	//  477 1055:pop             
		if(reservedRangeBuilder_ == null)
	//* 478 1056:aload_0         
	//* 479 1057:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//* 480 1060:ifnonnull       1135
		{
			if(!DescriptorProtos.DescriptorProto.access$5800(descriptorproto).isEmpty())
	//* 481 1063:aload_1         
	//* 482 1064:invokestatic    #809 <Method List DescriptorProtos$DescriptorProto.access$5800(DescriptorProtos$DescriptorProto)>
	//* 483 1067:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 484 1072:ifne            1225
			{
				if(reservedRange_.isEmpty())
	//* 485 1075:aload_0         
	//* 486 1076:getfield        #82  <Field List reservedRange_>
	//* 487 1079:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 488 1084:ifeq            1110
				{
					reservedRange_ = DescriptorProtos.DescriptorProto.access$5800(descriptorproto);
	//  489 1087:aload_0         
	//  490 1088:aload_1         
	//  491 1089:invokestatic    #809 <Method List DescriptorProtos$DescriptorProto.access$5800(DescriptorProtos$DescriptorProto)>
	//  492 1092:putfield        #82  <Field List reservedRange_>
					bitField0_ = bitField0_ & 0xfffffeff;
	//  493 1095:aload_0         
	//  494 1096:aload_0         
	//  495 1097:getfield        #103 <Field int bitField0_>
	//  496 1100:sipush          -257
	//  497 1103:iand            
	//  498 1104:putfield        #103 <Field int bitField0_>
				} else
	//* 499 1107:goto            1128
				{
					ensureReservedRangeIsMutable();
	//  500 1110:aload_0         
	//  501 1111:invokespecial   #245 <Method void ensureReservedRangeIsMutable()>
					reservedRange_.addAll(((java.util.Collection) (DescriptorProtos.DescriptorProto.access$5800(descriptorproto))));
	//  502 1114:aload_0         
	//  503 1115:getfield        #82  <Field List reservedRange_>
	//  504 1118:aload_1         
	//  505 1119:invokestatic    #809 <Method List DescriptorProtos$DescriptorProto.access$5800(DescriptorProtos$DescriptorProto)>
	//  506 1122:invokeinterface #781 <Method boolean List.addAll(java.util.Collection)>
	//  507 1127:pop             
				}
				onChanged();
	//  508 1128:aload_0         
	//  509 1129:invokevirtual   #214 <Method void onChanged()>
			}
		} else
	//* 510 1132:goto            1225
		if(!DescriptorProtos.DescriptorProto.access$5800(descriptorproto).isEmpty())
	//* 511 1135:aload_1         
	//* 512 1136:invokestatic    #809 <Method List DescriptorProtos$DescriptorProto.access$5800(DescriptorProtos$DescriptorProto)>
	//* 513 1139:invokeinterface #778 <Method boolean List.isEmpty()>
	//* 514 1144:ifne            1225
			if(reservedRangeBuilder_.isEmpty())
	//* 515 1147:aload_0         
	//* 516 1148:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//* 517 1151:invokevirtual   #782 <Method boolean RepeatedFieldBuilderV3.isEmpty()>
	//* 518 1154:ifeq            1213
			{
				reservedRangeBuilder_.dispose();
	//  519 1157:aload_0         
	//  520 1158:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//  521 1161:invokevirtual   #785 <Method void RepeatedFieldBuilderV3.dispose()>
				reservedRangeBuilder_ = null;
	//  522 1164:aload_0         
	//  523 1165:aconst_null     
	//  524 1166:putfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
				reservedRange_ = DescriptorProtos.DescriptorProto.access$5800(descriptorproto);
	//  525 1169:aload_0         
	//  526 1170:aload_1         
	//  527 1171:invokestatic    #809 <Method List DescriptorProtos$DescriptorProto.access$5800(DescriptorProtos$DescriptorProto)>
	//  528 1174:putfield        #82  <Field List reservedRange_>
				bitField0_ = bitField0_ & 0xfffffeff;
	//  529 1177:aload_0         
	//  530 1178:aload_0         
	//  531 1179:getfield        #103 <Field int bitField0_>
	//  532 1182:sipush          -257
	//  533 1185:iand            
	//  534 1186:putfield        #103 <Field int bitField0_>
				RepeatedFieldBuilderV3 repeatedfieldbuilderv3_6;
				if(GeneratedMessageV3.alwaysUseFieldBuilders)
	//* 535 1189:getstatic       #185 <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
	//* 536 1192:ifeq            1203
					repeatedfieldbuilderv3_6 = getReservedRangeFieldBuilder();
	//  537 1195:aload_0         
	//  538 1196:invokespecial   #201 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
	//  539 1199:astore_2        
				else
	//* 540 1200:goto            1205
					repeatedfieldbuilderv3_6 = null;
	//  541 1203:aconst_null     
	//  542 1204:astore_2        
				reservedRangeBuilder_ = repeatedfieldbuilderv3_6;
	//  543 1205:aload_0         
	//  544 1206:aload_2         
	//  545 1207:putfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
			} else
	//* 546 1210:goto            1225
			{
				reservedRangeBuilder_.addAllMessages(((Iterable) (DescriptorProtos.DescriptorProto.access$5800(descriptorproto))));
	//  547 1213:aload_0         
	//  548 1214:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//  549 1217:aload_1         
	//  550 1218:invokestatic    #809 <Method List DescriptorProtos$DescriptorProto.access$5800(DescriptorProtos$DescriptorProto)>
	//  551 1221:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
	//  552 1224:pop             
			}
		if(!DescriptorProtos.DescriptorProto.access$5900(descriptorproto).isEmpty())
	//* 553 1225:aload_1         
	//* 554 1226:invokestatic    #813 <Method LazyStringList DescriptorProtos$DescriptorProto.access$5900(DescriptorProtos$DescriptorProto)>
	//* 555 1229:invokeinterface #814 <Method boolean LazyStringList.isEmpty()>
	//* 556 1234:ifne            1294
		{
			if(reservedName_.isEmpty())
	//* 557 1237:aload_0         
	//* 558 1238:getfield        #89  <Field LazyStringList reservedName_>
	//* 559 1241:invokeinterface #814 <Method boolean LazyStringList.isEmpty()>
	//* 560 1246:ifeq            1272
			{
				reservedName_ = DescriptorProtos.DescriptorProto.access$5900(descriptorproto);
	//  561 1249:aload_0         
	//  562 1250:aload_1         
	//  563 1251:invokestatic    #813 <Method LazyStringList DescriptorProtos$DescriptorProto.access$5900(DescriptorProtos$DescriptorProto)>
	//  564 1254:putfield        #89  <Field LazyStringList reservedName_>
				bitField0_ = bitField0_ & 0xfffffdff;
	//  565 1257:aload_0         
	//  566 1258:aload_0         
	//  567 1259:getfield        #103 <Field int bitField0_>
	//  568 1262:sipush          -513
	//  569 1265:iand            
	//  570 1266:putfield        #103 <Field int bitField0_>
			} else
	//* 571 1269:goto            1290
			{
				ensureReservedNameIsMutable();
	//  572 1272:aload_0         
	//  573 1273:invokespecial   #241 <Method void ensureReservedNameIsMutable()>
				reservedName_.addAll(((java.util.Collection) (DescriptorProtos.DescriptorProto.access$5900(descriptorproto))));
	//  574 1276:aload_0         
	//  575 1277:getfield        #89  <Field LazyStringList reservedName_>
	//  576 1280:aload_1         
	//  577 1281:invokestatic    #813 <Method LazyStringList DescriptorProtos$DescriptorProto.access$5900(DescriptorProtos$DescriptorProto)>
	//  578 1284:invokeinterface #815 <Method boolean LazyStringList.addAll(java.util.Collection)>
	//  579 1289:pop             
			}
			onChanged();
	//  580 1290:aload_0         
	//  581 1291:invokevirtual   #214 <Method void onChanged()>
		}
		mergeUnknownFields(descriptorproto.unknownFields);
	//  582 1294:aload_0         
	//  583 1295:aload_1         
	//  584 1296:getfield        #819 <Field UnknownFieldSet DescriptorProtos$DescriptorProto.unknownFields>
	//  585 1299:invokevirtual   #823 <Method DescriptorProtos$DescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//  586 1302:pop             
		onChanged();
	//  587 1303:aload_0         
	//  588 1304:invokevirtual   #214 <Method void onChanged()>
		return this;
	//  589 1307:aload_0         
	//  590 1308:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder mergeFrom(Message message)
	{
		if(message instanceof DescriptorProtos.DescriptorProto)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class DescriptorProtos$DescriptorProto>
	//*   2    4:ifeq            16
		{
			return mergeFrom((DescriptorProtos.DescriptorProto)message);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #9   <Class DescriptorProtos$DescriptorProto>
	//    6   12:invokevirtual   #758 <Method DescriptorProtos$DescriptorProto$Builder mergeFrom(DescriptorProtos$DescriptorProto)>
	//    7   15:areturn         
		} else
		{
			super.mergeFrom(message);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #825 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
	//    3    3:invokevirtual   #739 <Method DescriptorProtos$DescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #743 <Method DescriptorProtos$DescriptorProto$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #739 <Method DescriptorProtos$DescriptorProto$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder mergeOptions(DescriptorProtos.MessageOptions messageoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       71
		{
			if((bitField0_ & 0x80) == 128 && options_ != null && options_ != DescriptorProtos.MessageOptions.getDefaultInstance())
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field int bitField0_>
	//*   5   11:sipush          128
	//*   6   14:iand            
	//*   7   15:sipush          128
	//*   8   18:icmpne          59
	//*   9   21:aload_0         
	//*  10   22:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
	//*  11   25:ifnull          59
	//*  12   28:aload_0         
	//*  13   29:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
	//*  14   32:invokestatic    #645 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions.getDefaultInstance()>
	//*  15   35:if_acmpeq       59
				options_ = DescriptorProtos.MessageOptions.newBuilder(options_).mergeFrom(messageoptions).buildPartial();
	//   16   38:aload_0         
	//   17   39:aload_0         
	//   18   40:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
	//   19   43:invokestatic    #832 <Method DescriptorProtos$MessageOptions$Builder DescriptorProtos$MessageOptions.newBuilder(DescriptorProtos$MessageOptions)>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #834 <Method DescriptorProtos$MessageOptions$Builder DescriptorProtos$MessageOptions$Builder.mergeFrom(DescriptorProtos$MessageOptions)>
	//   22   50:invokevirtual   #836 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions$Builder.buildPartial()>
	//   23   53:putfield        #80  <Field DescriptorProtos$MessageOptions options_>
			else
	//*  24   56:goto            64
				options_ = messageoptions;
	//   25   59:aload_0         
	//   26   60:aload_1         
	//   27   61:putfield        #80  <Field DescriptorProtos$MessageOptions options_>
			onChanged();
	//   28   64:aload_0         
	//   29   65:invokevirtual   #214 <Method void onChanged()>
		} else
	//*  30   68:goto            80
		{
			optionsBuilder_.mergeFrom(((AbstractMessage) (messageoptions)));
	//   31   71:aload_0         
	//   32   72:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//   33   75:aload_1         
	//   34   76:invokevirtual   #839 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
	//   35   79:pop             
		}
		bitField0_ = bitField0_ | 0x80;
	//   36   80:aload_0         
	//   37   81:aload_0         
	//   38   82:getfield        #103 <Field int bitField0_>
	//   39   85:sipush          128
	//   40   88:ior             
	//   41   89:putfield        #103 <Field int bitField0_>
		return this;
	//   42   92:aload_0         
	//   43   93:areturn         
	}

	public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #823 <Method DescriptorProtos$DescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public final DescriptorProtos$DescriptorProto$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$DescriptorProto$Builder)super.mergeUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #843 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #823 <Method DescriptorProtos$DescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #823 <Method DescriptorProtos$DescriptorProto$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder removeEnumType(int i)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureEnumTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
			enumType_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #74  <Field List enumType_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #848 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			enumTypeBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #851 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder removeExtension(int i)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureExtensionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #222 <Method void ensureExtensionIsMutable()>
			extension_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #70  <Field List extension_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #848 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			extensionBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #851 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder removeExtensionRange(int i)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureExtensionRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #226 <Method void ensureExtensionRangeIsMutable()>
			extensionRange_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #76  <Field List extensionRange_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #848 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			extensionRangeBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #851 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder removeField(int i)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureFieldIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method void ensureFieldIsMutable()>
			field_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field List field_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #848 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			fieldBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #851 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder removeNestedType(int i)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureNestedTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
			nestedType_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field List nestedType_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #848 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			nestedTypeBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #851 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder removeOneofDecl(int i)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureOneofDeclIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
			oneofDecl_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #78  <Field List oneofDecl_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #848 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			oneofDeclBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #851 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder removeReservedRange(int i)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       28
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #245 <Method void ensureReservedRangeIsMutable()>
			reservedRange_.remove(i);
	//    5   11:aload_0         
	//    6   12:getfield        #82  <Field List reservedRange_>
	//    7   15:iload_1         
	//    8   16:invokeinterface #848 <Method Object List.remove(int)>
	//    9   21:pop             
			onChanged();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		} else
		{
			reservedRangeBuilder_.remove(i);
	//   14   28:aload_0         
	//   15   29:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #851 <Method void RepeatedFieldBuilderV3.remove(int)>
			return this;
	//   18   36:aload_0         
	//   19   37:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setEnumType(int i, der der)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureEnumTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
			enumType_.set(i, ((Object) (der.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #74  <Field List enumType_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #254 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #862 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			enumTypeBuilder_.setMessage(i, ((AbstractMessage) (der.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #254 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto$Builder.build()>
	//   21   41:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setEnumType(int i, DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
	{
		if(enumTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(enumdescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureEnumTypeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
				enumType_.set(i, ((Object) (enumdescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #74  <Field List enumType_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #862 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			enumTypeBuilder_.setMessage(i, ((AbstractMessage) (enumdescriptorproto)));
	//   21   41:aload_0         
	//   22   42:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setExtension(int i, lder lder)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureExtensionIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #222 <Method void ensureExtensionIsMutable()>
			extension_.set(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #70  <Field List extension_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #862 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			extensionBuilder_.setMessage(i, ((AbstractMessage) (lder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   21   41:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setExtension(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
	{
		if(extensionBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(fielddescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureExtensionIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #222 <Method void ensureExtensionIsMutable()>
				extension_.set(i, ((Object) (fielddescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #70  <Field List extension_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #862 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			extensionBuilder_.setMessage(i, ((AbstractMessage) (fielddescriptorproto)));
	//   21   41:aload_0         
	//   22   42:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setExtensionRange(int i, nRange.Builder builder)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureExtensionRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #226 <Method void ensureExtensionRangeIsMutable()>
			extensionRange_.set(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #76  <Field List extensionRange_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #315 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange$Builder.build()>
	//   10   20:invokeinterface #862 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			extensionRangeBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #315 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange$Builder.build()>
	//   21   41:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setExtensionRange(int i, nRange nrange)
	{
		if(extensionRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(nrange == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureExtensionRangeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #226 <Method void ensureExtensionRangeIsMutable()>
				extensionRange_.set(i, ((Object) (nrange)));
	//   11   23:aload_0         
	//   12   24:getfield        #76  <Field List extensionRange_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #862 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			extensionRangeBuilder_.setMessage(i, ((AbstractMessage) (nrange)));
	//   21   41:aload_0         
	//   22   42:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setField(int i, lder lder)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureFieldIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method void ensureFieldIsMutable()>
			field_.set(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field List field_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #862 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			fieldBuilder_.setMessage(i, ((AbstractMessage) (lder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #298 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto$Builder.build()>
	//   21   41:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setField(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
	{
		if(fieldBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(fielddescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureFieldIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #230 <Method void ensureFieldIsMutable()>
				field_.set(i, ((Object) (fielddescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #68  <Field List field_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #862 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			fieldBuilder_.setMessage(i, ((AbstractMessage) (fielddescriptorproto)));
	//   21   41:aload_0         
	//   22   42:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$DescriptorProto$Builder)super.setField(fielddescriptor, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #870 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    5    9:areturn         
	}

	public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #872 <Method DescriptorProtos$DescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return ((Message.Builder) (setField(fielddescriptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #872 <Method DescriptorProtos$DescriptorProto$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder setName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #267 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #268 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #103 <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #103 <Field int bitField0_>
			name_ = ((Object) (s));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #60  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setNameBytes(ByteString bytestring)
	{
		if(bytestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #267 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #268 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			bitField0_ = bitField0_ | 1;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #103 <Field int bitField0_>
	//    9   17:iconst_1        
	//   10   18:ior             
	//   11   19:putfield        #103 <Field int bitField0_>
			name_ = ((Object) (bytestring));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #60  <Field Object name_>
			onChanged();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setNestedType(int i, DescriptorProtos$DescriptorProto$Builder descriptorprotos$descriptorproto$builder)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureNestedTypeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
			nestedType_.set(i, ((Object) (descriptorprotos$descriptorproto$builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field List nestedType_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #332 <Method DescriptorProtos$DescriptorProto build()>
	//   10   20:invokeinterface #862 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			nestedTypeBuilder_.setMessage(i, ((AbstractMessage) (descriptorprotos$descriptorproto$builder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #332 <Method DescriptorProtos$DescriptorProto build()>
	//   21   41:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setNestedType(int i, DescriptorProtos.DescriptorProto descriptorproto)
	{
		if(nestedTypeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(descriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureNestedTypeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
				nestedType_.set(i, ((Object) (descriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #72  <Field List nestedType_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #862 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			nestedTypeBuilder_.setMessage(i, ((AbstractMessage) (descriptorproto)));
	//   21   41:aload_0         
	//   22   42:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setOneofDecl(int i, lder lder)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureOneofDeclIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
			oneofDecl_.set(i, ((Object) (lder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #78  <Field List oneofDecl_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #347 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto$Builder.build()>
	//   10   20:invokeinterface #862 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			oneofDeclBuilder_.setMessage(i, ((AbstractMessage) (lder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #347 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto$Builder.build()>
	//   21   41:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setOneofDecl(int i, DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
	{
		if(oneofDeclBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(oneofdescriptorproto == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureOneofDeclIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
				oneofDecl_.set(i, ((Object) (oneofdescriptorproto)));
	//   11   23:aload_0         
	//   12   24:getfield        #78  <Field List oneofDecl_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #862 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			oneofDeclBuilder_.setMessage(i, ((AbstractMessage) (oneofdescriptorproto)));
	//   21   41:aload_0         
	//   22   42:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setOptions(DescriptorProtos.MessageOptions.Builder builder)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       22
		{
			options_ = builder.build();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #880 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions$Builder.build()>
	//    6   12:putfield        #80  <Field DescriptorProtos$MessageOptions options_>
			onChanged();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #214 <Method void onChanged()>
		} else
	//*   9   19:goto            34
		{
			optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
	//   10   22:aload_0         
	//   11   23:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #880 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions$Builder.build()>
	//   14   30:invokevirtual   #882 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   15   33:pop             
		}
		bitField0_ = bitField0_ | 0x80;
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #103 <Field int bitField0_>
	//   19   39:sipush          128
	//   20   42:ior             
	//   21   43:putfield        #103 <Field int bitField0_>
		return this;
	//   22   46:aload_0         
	//   23   47:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder setOptions(DescriptorProtos.MessageOptions messageoptions)
	{
		if(optionsBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//*   2    4:ifnonnull       31
		{
			if(messageoptions == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       19
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			options_ = messageoptions;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #80  <Field DescriptorProtos$MessageOptions options_>
			onChanged();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #214 <Method void onChanged()>
		} else
	//*  14   28:goto            40
		{
			optionsBuilder_.setMessage(((AbstractMessage) (messageoptions)));
	//   15   31:aload_0         
	//   16   32:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #882 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
	//   19   39:pop             
		}
		bitField0_ = bitField0_ | 0x80;
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #103 <Field int bitField0_>
	//   23   45:sipush          128
	//   24   48:ior             
	//   25   49:putfield        #103 <Field int bitField0_>
		return this;
	//   26   52:aload_0         
	//   27   53:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$DescriptorProto$Builder)super.setRepeatedField(fielddescriptor, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #887 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    6   10:areturn         
	}

	public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #889 <Method DescriptorProtos$DescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #889 <Method DescriptorProtos$DescriptorProto$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DescriptorProtos$DescriptorProto$Builder setReservedName(int i, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #267 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #268 <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			ensureReservedNameIsMutable();
	//    6   12:aload_0         
	//    7   13:invokespecial   #241 <Method void ensureReservedNameIsMutable()>
			reservedName_.set(i, ((Object) (s)));
	//    8   16:aload_0         
	//    9   17:getfield        #89  <Field LazyStringList reservedName_>
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:invokeinterface #893 <Method Object LazyStringList.set(int, Object)>
	//   13   27:pop             
			onChanged();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   16   32:aload_0         
	//   17   33:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setReservedRange(int i, Range.Builder builder)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       32
		{
			ensureReservedRangeIsMutable();
	//    3    7:aload_0         
	//    4    8:invokespecial   #245 <Method void ensureReservedRangeIsMutable()>
			reservedRange_.set(i, ((Object) (builder.build())));
	//    5   11:aload_0         
	//    6   12:getfield        #82  <Field List reservedRange_>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #382 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange$Builder.build()>
	//   10   20:invokeinterface #862 <Method Object List.set(int, Object)>
	//   11   25:pop             
			onChanged();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #214 <Method void onChanged()>
			return this;
	//   14   30:aload_0         
	//   15   31:areturn         
		} else
		{
			reservedRangeBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
	//   16   32:aload_0         
	//   17   33:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #382 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange$Builder.build()>
	//   21   41:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   22   44:pop             
			return this;
	//   23   45:aload_0         
	//   24   46:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto$Builder setReservedRange(int i, Range range)
	{
		if(reservedRangeBuilder_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//*   2    4:ifnonnull       41
		{
			if(range == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       19
			{
				throw new NullPointerException();
	//    5   11:new             #267 <Class NullPointerException>
	//    6   14:dup             
	//    7   15:invokespecial   #268 <Method void NullPointerException()>
	//    8   18:athrow          
			} else
			{
				ensureReservedRangeIsMutable();
	//    9   19:aload_0         
	//   10   20:invokespecial   #245 <Method void ensureReservedRangeIsMutable()>
				reservedRange_.set(i, ((Object) (range)));
	//   11   23:aload_0         
	//   12   24:getfield        #82  <Field List reservedRange_>
	//   13   27:iload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #862 <Method Object List.set(int, Object)>
	//   16   34:pop             
				onChanged();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #214 <Method void onChanged()>
				return this;
	//   19   39:aload_0         
	//   20   40:areturn         
			}
		} else
		{
			reservedRangeBuilder_.setMessage(i, ((AbstractMessage) (range)));
	//   21   41:aload_0         
	//   22   42:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
	//   23   45:iload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #865 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.setMessage(int, AbstractMessage)>
	//   26   50:pop             
			return this;
	//   27   51:aload_0         
	//   28   52:areturn         
		}
	}

	public final DescriptorProtos$DescriptorProto$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$DescriptorProto$Builder)super.setUnknownFields(unknownfieldset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #897 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
	//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
	//    4    8:areturn         
	}

	public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #899 <Method DescriptorProtos$DescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #899 <Method DescriptorProtos$DescriptorProto$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private int bitField0_;
	private RepeatedFieldBuilderV3 enumTypeBuilder_;
	private List enumType_;
	private RepeatedFieldBuilderV3 extensionBuilder_;
	private RepeatedFieldBuilderV3 extensionRangeBuilder_;
	private List extensionRange_;
	private List extension_;
	private RepeatedFieldBuilderV3 fieldBuilder_;
	private List field_;
	private Object name_;
	private RepeatedFieldBuilderV3 nestedTypeBuilder_;
	private List nestedType_;
	private RepeatedFieldBuilderV3 oneofDeclBuilder_;
	private List oneofDecl_;
	private SingleFieldBuilderV3 optionsBuilder_;
	private DescriptorProtos.MessageOptions options_;
	private LazyStringList reservedName_;
	private RepeatedFieldBuilderV3 reservedRangeBuilder_;
	private List reservedRange_;

	private DescriptorProtos$DescriptorProto$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void GeneratedMessageV3$Builder()>
		name_ = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #58  <String "">
	//    4    7:putfield        #60  <Field Object name_>
		field_ = Collections.emptyList();
	//    5   10:aload_0         
	//    6   11:invokestatic    #66  <Method List Collections.emptyList()>
	//    7   14:putfield        #68  <Field List field_>
		extension_ = Collections.emptyList();
	//    8   17:aload_0         
	//    9   18:invokestatic    #66  <Method List Collections.emptyList()>
	//   10   21:putfield        #70  <Field List extension_>
		nestedType_ = Collections.emptyList();
	//   11   24:aload_0         
	//   12   25:invokestatic    #66  <Method List Collections.emptyList()>
	//   13   28:putfield        #72  <Field List nestedType_>
		enumType_ = Collections.emptyList();
	//   14   31:aload_0         
	//   15   32:invokestatic    #66  <Method List Collections.emptyList()>
	//   16   35:putfield        #74  <Field List enumType_>
		extensionRange_ = Collections.emptyList();
	//   17   38:aload_0         
	//   18   39:invokestatic    #66  <Method List Collections.emptyList()>
	//   19   42:putfield        #76  <Field List extensionRange_>
		oneofDecl_ = Collections.emptyList();
	//   20   45:aload_0         
	//   21   46:invokestatic    #66  <Method List Collections.emptyList()>
	//   22   49:putfield        #78  <Field List oneofDecl_>
		options_ = null;
	//   23   52:aload_0         
	//   24   53:aconst_null     
	//   25   54:putfield        #80  <Field DescriptorProtos$MessageOptions options_>
		reservedRange_ = Collections.emptyList();
	//   26   57:aload_0         
	//   27   58:invokestatic    #66  <Method List Collections.emptyList()>
	//   28   61:putfield        #82  <Field List reservedRange_>
		reservedName_ = LazyStringArrayList.EMPTY;
	//   29   64:aload_0         
	//   30   65:getstatic       #87  <Field LazyStringList LazyStringArrayList.EMPTY>
	//   31   68:putfield        #89  <Field LazyStringList reservedName_>
		maybeForceBuilderInitialization();
	//   32   71:aload_0         
	//   33   72:invokespecial   #92  <Method void maybeForceBuilderInitialization()>
	//   34   75:return          
	}

	DescriptorProtos$DescriptorProto$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void DescriptorProtos$DescriptorProto$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$DescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent)
	{
		super(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
		name_ = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #58  <String "">
	//    5    8:putfield        #60  <Field Object name_>
		field_ = Collections.emptyList();
	//    6   11:aload_0         
	//    7   12:invokestatic    #66  <Method List Collections.emptyList()>
	//    8   15:putfield        #68  <Field List field_>
		extension_ = Collections.emptyList();
	//    9   18:aload_0         
	//   10   19:invokestatic    #66  <Method List Collections.emptyList()>
	//   11   22:putfield        #70  <Field List extension_>
		nestedType_ = Collections.emptyList();
	//   12   25:aload_0         
	//   13   26:invokestatic    #66  <Method List Collections.emptyList()>
	//   14   29:putfield        #72  <Field List nestedType_>
		enumType_ = Collections.emptyList();
	//   15   32:aload_0         
	//   16   33:invokestatic    #66  <Method List Collections.emptyList()>
	//   17   36:putfield        #74  <Field List enumType_>
		extensionRange_ = Collections.emptyList();
	//   18   39:aload_0         
	//   19   40:invokestatic    #66  <Method List Collections.emptyList()>
	//   20   43:putfield        #76  <Field List extensionRange_>
		oneofDecl_ = Collections.emptyList();
	//   21   46:aload_0         
	//   22   47:invokestatic    #66  <Method List Collections.emptyList()>
	//   23   50:putfield        #78  <Field List oneofDecl_>
		options_ = null;
	//   24   53:aload_0         
	//   25   54:aconst_null     
	//   26   55:putfield        #80  <Field DescriptorProtos$MessageOptions options_>
		reservedRange_ = Collections.emptyList();
	//   27   58:aload_0         
	//   28   59:invokestatic    #66  <Method List Collections.emptyList()>
	//   29   62:putfield        #82  <Field List reservedRange_>
		reservedName_ = LazyStringArrayList.EMPTY;
	//   30   65:aload_0         
	//   31   66:getstatic       #87  <Field LazyStringList LazyStringArrayList.EMPTY>
	//   32   69:putfield        #89  <Field LazyStringList reservedName_>
		maybeForceBuilderInitialization();
	//   33   72:aload_0         
	//   34   73:invokespecial   #92  <Method void maybeForceBuilderInitialization()>
	//   35   76:return          
	}

	DescriptorProtos$DescriptorProto$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void DescriptorProtos$DescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
