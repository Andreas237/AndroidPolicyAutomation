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
//			ByteString, MessageLite, CodedOutputStream, ProtocolStringList, 
//			ExtensionRegistryLite, Message, RepeatedFieldBuilderV3, SingleFieldBuilderV3, 
//			AbstractParser, MessageOrBuilder

public static final class DescriptorProtos$DescriptorProto extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.DescriptorProtoOrBuilder
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

		public Builder addAllEnumType(Iterable iterable)
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

		public Builder addAllExtension(Iterable iterable)
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

		public Builder addAllExtensionRange(Iterable iterable)
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

		public Builder addAllField(Iterable iterable)
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

		public Builder addAllNestedType(Iterable iterable)
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

		public Builder addAllOneofDecl(Iterable iterable)
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

		public Builder addAllReservedName(Iterable iterable)
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

		public Builder addAllReservedRange(Iterable iterable)
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

		public Builder addEnumType(int i, DescriptorProtos.EnumDescriptorProto.Builder builder)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureEnumTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
				enumType_.add(i, ((Object) (builder.build())));
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
				enumTypeBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addEnumType(int i, DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
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

		public Builder addEnumType(DescriptorProtos.EnumDescriptorProto.Builder builder)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureEnumTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
				enumType_.add(((Object) (builder.build())));
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
				enumTypeBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addEnumType(DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
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

		public DescriptorProtos.EnumDescriptorProto.Builder addEnumTypeBuilder()
		{
			return (DescriptorProtos.EnumDescriptorProto.Builder)getEnumTypeFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.EnumDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #193 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
		//    2    4:invokestatic    #283 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #250 <Class DescriptorProtos$EnumDescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.EnumDescriptorProto.Builder addEnumTypeBuilder(int i)
		{
			return (DescriptorProtos.EnumDescriptorProto.Builder)getEnumTypeFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.EnumDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #193 <Method RepeatedFieldBuilderV3 getEnumTypeFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #283 <Method DescriptorProtos$EnumDescriptorProto DescriptorProtos$EnumDescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #250 <Class DescriptorProtos$EnumDescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addExtension(int i, DescriptorProtos.FieldDescriptorProto.Builder builder)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureExtensionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #222 <Method void ensureExtensionIsMutable()>
				extension_.add(i, ((Object) (builder.build())));
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
				extensionBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addExtension(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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

		public Builder addExtension(DescriptorProtos.FieldDescriptorProto.Builder builder)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureExtensionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #222 <Method void ensureExtensionIsMutable()>
				extension_.add(((Object) (builder.build())));
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
				extensionBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addExtension(DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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

		public DescriptorProtos.FieldDescriptorProto.Builder addExtensionBuilder()
		{
			return (DescriptorProtos.FieldDescriptorProto.Builder)getExtensionFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #189 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
		//    2    4:invokestatic    #307 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.FieldDescriptorProto.Builder addExtensionBuilder(int i)
		{
			return (DescriptorProtos.FieldDescriptorProto.Builder)getExtensionFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #189 <Method RepeatedFieldBuilderV3 getExtensionFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #307 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addExtensionRange(int i, ExtensionRange.Builder builder)
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

		public Builder addExtensionRange(int i, ExtensionRange extensionrange)
		{
			if(extensionRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(extensionrange == null)
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
					extensionRange_.add(i, ((Object) (extensionrange)));
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
				extensionRangeBuilder_.addMessage(i, ((AbstractMessage) (extensionrange)));
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

		public Builder addExtensionRange(ExtensionRange.Builder builder)
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

		public Builder addExtensionRange(ExtensionRange extensionrange)
		{
			if(extensionRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(extensionrange == null)
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
					extensionRange_.add(((Object) (extensionrange)));
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
				extensionRangeBuilder_.addMessage(((AbstractMessage) (extensionrange)));
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

		public ExtensionRange.Builder addExtensionRangeBuilder()
		{
			return (ExtensionRange.Builder)getExtensionRangeFieldBuilder().addBuilder(((AbstractMessage) (ExtensionRange.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #195 <Method RepeatedFieldBuilderV3 getExtensionRangeFieldBuilder()>
		//    2    4:invokestatic    #324 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange.getDefaultInstance()>
		//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #312 <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    5   13:areturn         
		}

		public ExtensionRange.Builder addExtensionRangeBuilder(int i)
		{
			return (ExtensionRange.Builder)getExtensionRangeFieldBuilder().addBuilder(i, ((AbstractMessage) (ExtensionRange.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #195 <Method RepeatedFieldBuilderV3 getExtensionRangeFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #324 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange.getDefaultInstance()>
		//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #312 <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    6   14:areturn         
		}

		public Builder addField(int i, DescriptorProtos.FieldDescriptorProto.Builder builder)
		{
			if(fieldBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureFieldIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #230 <Method void ensureFieldIsMutable()>
				field_.add(i, ((Object) (builder.build())));
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
				fieldBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addField(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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

		public Builder addField(DescriptorProtos.FieldDescriptorProto.Builder builder)
		{
			if(fieldBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureFieldIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #230 <Method void ensureFieldIsMutable()>
				field_.add(((Object) (builder.build())));
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
				fieldBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addField(DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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

		public DescriptorProtos.FieldDescriptorProto.Builder addFieldBuilder()
		{
			return (DescriptorProtos.FieldDescriptorProto.Builder)getFieldFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #187 <Method RepeatedFieldBuilderV3 getFieldFieldBuilder()>
		//    2    4:invokestatic    #307 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.FieldDescriptorProto.Builder addFieldBuilder(int i)
		{
			return (DescriptorProtos.FieldDescriptorProto.Builder)getFieldFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.FieldDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #187 <Method RepeatedFieldBuilderV3 getFieldFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #307 <Method DescriptorProtos$FieldDescriptorProto DescriptorProtos$FieldDescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #295 <Class DescriptorProtos$FieldDescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addNestedType(int i, Builder builder)
		{
			if(nestedTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureNestedTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
				nestedType_.add(i, ((Object) (builder.build())));
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
				nestedTypeBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addNestedType(int i, DescriptorProtos.DescriptorProto descriptorproto)
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

		public Builder addNestedType(Builder builder)
		{
			if(nestedTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureNestedTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
				nestedType_.add(((Object) (builder.build())));
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
				nestedTypeBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addNestedType(DescriptorProtos.DescriptorProto descriptorproto)
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

		public Builder addNestedTypeBuilder()
		{
			return (Builder)getNestedTypeFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.DescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #191 <Method RepeatedFieldBuilderV3 getNestedTypeFieldBuilder()>
		//    2    4:invokestatic    #339 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
		//    5   13:areturn         
		}

		public Builder addNestedTypeBuilder(int i)
		{
			return (Builder)getNestedTypeFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.DescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #191 <Method RepeatedFieldBuilderV3 getNestedTypeFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #339 <Method DescriptorProtos$DescriptorProto DescriptorProtos$DescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #2   <Class DescriptorProtos$DescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addOneofDecl(int i, DescriptorProtos.OneofDescriptorProto.Builder builder)
		{
			if(oneofDeclBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureOneofDeclIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
				oneofDecl_.add(i, ((Object) (builder.build())));
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
				oneofDeclBuilder_.addMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder addOneofDecl(int i, DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
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

		public Builder addOneofDecl(DescriptorProtos.OneofDescriptorProto.Builder builder)
		{
			if(oneofDeclBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
		//*   2    4:ifnonnull       31
			{
				ensureOneofDeclIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
				oneofDecl_.add(((Object) (builder.build())));
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
				oneofDeclBuilder_.addMessage(((AbstractMessage) (builder.build())));
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

		public Builder addOneofDecl(DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
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

		public DescriptorProtos.OneofDescriptorProto.Builder addOneofDeclBuilder()
		{
			return (DescriptorProtos.OneofDescriptorProto.Builder)getOneofDeclFieldBuilder().addBuilder(((AbstractMessage) (DescriptorProtos.OneofDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #197 <Method RepeatedFieldBuilderV3 getOneofDeclFieldBuilder()>
		//    2    4:invokestatic    #356 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
		//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #344 <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    5   13:areturn         
		}

		public DescriptorProtos.OneofDescriptorProto.Builder addOneofDeclBuilder(int i)
		{
			return (DescriptorProtos.OneofDescriptorProto.Builder)getOneofDeclFieldBuilder().addBuilder(i, ((AbstractMessage) (DescriptorProtos.OneofDescriptorProto.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #197 <Method RepeatedFieldBuilderV3 getOneofDeclFieldBuilder()>
		//    2    4:iload_1         
		//    3    5:invokestatic    #356 <Method DescriptorProtos$OneofDescriptorProto DescriptorProtos$OneofDescriptorProto.getDefaultInstance()>
		//    4    8:invokevirtual   #291 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(int, AbstractMessage)>
		//    5   11:checkcast       #344 <Class DescriptorProtos$OneofDescriptorProto$Builder>
		//    6   14:areturn         
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
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

		public Builder addReservedName(String s)
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

		public Builder addReservedNameBytes(ByteString bytestring)
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

		public Builder addReservedRange(int i, ReservedRange.Builder builder)
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

		public Builder addReservedRange(int i, ReservedRange reservedrange)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(reservedrange == null)
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
					reservedRange_.add(i, ((Object) (reservedrange)));
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
				reservedRangeBuilder_.addMessage(i, ((AbstractMessage) (reservedrange)));
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

		public Builder addReservedRange(ReservedRange.Builder builder)
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

		public Builder addReservedRange(ReservedRange reservedrange)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       40
			{
				if(reservedrange == null)
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
					reservedRange_.add(((Object) (reservedrange)));
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
				reservedRangeBuilder_.addMessage(((AbstractMessage) (reservedrange)));
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

		public ReservedRange.Builder addReservedRangeBuilder()
		{
			return (ReservedRange.Builder)getReservedRangeFieldBuilder().addBuilder(((AbstractMessage) (ReservedRange.getDefaultInstance())));
		//    0    0:aload_0         
		//    1    1:invokespecial   #201 <Method RepeatedFieldBuilderV3 getReservedRangeFieldBuilder()>
		//    2    4:invokestatic    #391 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange.getDefaultInstance()>
		//    3    7:invokevirtual   #287 <Method AbstractMessage$Builder RepeatedFieldBuilderV3.addBuilder(AbstractMessage)>
		//    4   10:checkcast       #379 <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    5   13:areturn         
		}

		public ReservedRange.Builder addReservedRangeBuilder(int i)
		{
			return (ReservedRange.Builder)getReservedRangeFieldBuilder().addBuilder(i, ((AbstractMessage) (ReservedRange.getDefaultInstance())));
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
			descriptorproto.name_ = name_;
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
				descriptorproto.field_ = field_;
		//   43   76:aload           4
		//   44   78:aload_0         
		//   45   79:getfield        #68  <Field List field_>
		//   46   82:invokestatic    #419 <Method List DescriptorProtos$DescriptorProto.access$5102(DescriptorProtos$DescriptorProto, List)>
		//   47   85:pop             
			} else
		//*  48   86:goto            102
			{
				descriptorproto.field_ = fieldBuilder_.build();
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
				descriptorproto.extension_ = extension_;
		//   75  141:aload           4
		//   76  143:aload_0         
		//   77  144:getfield        #70  <Field List extension_>
		//   78  147:invokestatic    #424 <Method List DescriptorProtos$DescriptorProto.access$5202(DescriptorProtos$DescriptorProto, List)>
		//   79  150:pop             
			} else
		//*  80  151:goto            167
			{
				descriptorproto.extension_ = extensionBuilder_.build();
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
				descriptorproto.nestedType_ = nestedType_;
		//  107  208:aload           4
		//  108  210:aload_0         
		//  109  211:getfield        #72  <Field List nestedType_>
		//  110  214:invokestatic    #427 <Method List DescriptorProtos$DescriptorProto.access$5302(DescriptorProtos$DescriptorProto, List)>
		//  111  217:pop             
			} else
		//* 112  218:goto            234
			{
				descriptorproto.nestedType_ = nestedTypeBuilder_.build();
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
				descriptorproto.enumType_ = enumType_;
		//  139  275:aload           4
		//  140  277:aload_0         
		//  141  278:getfield        #74  <Field List enumType_>
		//  142  281:invokestatic    #430 <Method List DescriptorProtos$DescriptorProto.access$5402(DescriptorProtos$DescriptorProto, List)>
		//  143  284:pop             
			} else
		//* 144  285:goto            301
			{
				descriptorproto.enumType_ = enumTypeBuilder_.build();
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
				descriptorproto.extensionRange_ = extensionRange_;
		//  171  342:aload           4
		//  172  344:aload_0         
		//  173  345:getfield        #76  <Field List extensionRange_>
		//  174  348:invokestatic    #433 <Method List DescriptorProtos$DescriptorProto.access$5502(DescriptorProtos$DescriptorProto, List)>
		//  175  351:pop             
			} else
		//* 176  352:goto            368
			{
				descriptorproto.extensionRange_ = extensionRangeBuilder_.build();
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
				descriptorproto.oneofDecl_ = oneofDecl_;
		//  203  409:aload           4
		//  204  411:aload_0         
		//  205  412:getfield        #78  <Field List oneofDecl_>
		//  206  415:invokestatic    #436 <Method List DescriptorProtos$DescriptorProto.access$5602(DescriptorProtos$DescriptorProto, List)>
		//  207  418:pop             
			} else
		//* 208  419:goto            435
			{
				descriptorproto.oneofDecl_ = oneofDeclBuilder_.build();
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
				descriptorproto.options_ = options_;
		//  229  459:aload           4
		//  230  461:aload_0         
		//  231  462:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
		//  232  465:invokestatic    #440 <Method DescriptorProtos$MessageOptions DescriptorProtos$DescriptorProto.access$5702(DescriptorProtos$DescriptorProto, DescriptorProtos$MessageOptions)>
		//  233  468:pop             
			else
		//* 234  469:goto            488
				descriptorproto.options_ = (DescriptorProtos.MessageOptions)optionsBuilder_.build();
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
				descriptorproto.reservedRange_ = reservedRange_;
		//  262  532:aload           4
		//  263  534:aload_0         
		//  264  535:getfield        #82  <Field List reservedRange_>
		//  265  538:invokestatic    #448 <Method List DescriptorProtos$DescriptorProto.access$5802(DescriptorProtos$DescriptorProto, List)>
		//  266  541:pop             
			} else
		//* 267  542:goto            558
			{
				descriptorproto.reservedRange_ = reservedRangeBuilder_.build();
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
			descriptorproto.reservedName_ = reservedName_;
		//  291  597:aload           4
		//  292  599:aload_0         
		//  293  600:getfield        #89  <Field LazyStringList reservedName_>
		//  294  603:invokestatic    #456 <Method LazyStringList DescriptorProtos$DescriptorProto.access$5902(DescriptorProtos$DescriptorProto, LazyStringList)>
		//  295  606:pop             
			descriptorproto.bitField0_ = j;
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

		public Builder clear()
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

		public Builder clearEnumType()
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

		public Builder clearExtension()
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

		public Builder clearExtensionRange()
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

		public Builder clearField()
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

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
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

		public Builder clearName()
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

		public Builder clearNestedType()
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

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
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

		public Builder clearOneofDecl()
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

		public Builder clearOptions()
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

		public Builder clearReservedName()
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

		public Builder clearReservedRange()
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

		public Builder clone()
		{
			return (Builder)super.clone();
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

		public DescriptorProtos.EnumDescriptorProto.Builder getEnumTypeBuilder(int i)
		{
			return (DescriptorProtos.EnumDescriptorProto.Builder)getEnumTypeFieldBuilder().getBuilder(i);
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

		public DescriptorProtos.EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.EnumDescriptorProtoOrBuilder)enumType_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #74  <Field List enumType_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #526 <Method Object List.get(int)>
		//    7   17:checkcast       #557 <Class DescriptorProtos$EnumDescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.EnumDescriptorProtoOrBuilder)enumTypeBuilder_.getMessageOrBuilder(i);
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

		public DescriptorProtos.FieldDescriptorProto.Builder getExtensionBuilder(int i)
		{
			return (DescriptorProtos.FieldDescriptorProto.Builder)getExtensionFieldBuilder().getBuilder(i);
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

		public DescriptorProtos.FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.FieldDescriptorProtoOrBuilder)extension_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #70  <Field List extension_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #526 <Method Object List.get(int)>
		//    7   17:checkcast       #578 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.FieldDescriptorProtoOrBuilder)extensionBuilder_.getMessageOrBuilder(i);
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

		public ExtensionRange getExtensionRange(int i)
		{
			if(extensionRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
		//*   2    4:ifnonnull       21
				return (ExtensionRange)extensionRange_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #76  <Field List extensionRange_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #526 <Method Object List.get(int)>
		//    7   17:checkcast       #322 <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    8   20:areturn         
			else
				return (ExtensionRange)extensionRangeBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #530 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #322 <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//   14   32:areturn         
		}

		public ExtensionRange.Builder getExtensionRangeBuilder(int i)
		{
			return (ExtensionRange.Builder)getExtensionRangeFieldBuilder().getBuilder(i);
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

		public ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i)
		{
			if(extensionRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
		//*   2    4:ifnonnull       21
				return (ExtensionRangeOrBuilder)extensionRange_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #76  <Field List extensionRange_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #526 <Method Object List.get(int)>
		//    7   17:checkcast       #592 <Class DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder>
		//    8   20:areturn         
			else
				return (ExtensionRangeOrBuilder)extensionRangeBuilder_.getMessageOrBuilder(i);
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

		public DescriptorProtos.FieldDescriptorProto.Builder getFieldBuilder(int i)
		{
			return (DescriptorProtos.FieldDescriptorProto.Builder)getFieldFieldBuilder().getBuilder(i);
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

		public DescriptorProtos.FieldDescriptorProtoOrBuilder getFieldOrBuilder(int i)
		{
			if(fieldBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.FieldDescriptorProtoOrBuilder)field_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #68  <Field List field_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #526 <Method Object List.get(int)>
		//    7   17:checkcast       #578 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.FieldDescriptorProtoOrBuilder)fieldBuilder_.getMessageOrBuilder(i);
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

		public Builder getNestedTypeBuilder(int i)
		{
			return (Builder)getNestedTypeFieldBuilder().getBuilder(i);
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

		public DescriptorProtos.DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i)
		{
			if(nestedTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.DescriptorProtoOrBuilder)nestedType_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #72  <Field List nestedType_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #526 <Method Object List.get(int)>
		//    7   17:checkcast       #7   <Class DescriptorProtos$DescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.DescriptorProtoOrBuilder)nestedTypeBuilder_.getMessageOrBuilder(i);
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

		public DescriptorProtos.OneofDescriptorProto.Builder getOneofDeclBuilder(int i)
		{
			return (DescriptorProtos.OneofDescriptorProto.Builder)getOneofDeclFieldBuilder().getBuilder(i);
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

		public DescriptorProtos.OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int i)
		{
			if(oneofDeclBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
		//*   2    4:ifnonnull       21
				return (DescriptorProtos.OneofDescriptorProtoOrBuilder)oneofDecl_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #78  <Field List oneofDecl_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #526 <Method Object List.get(int)>
		//    7   17:checkcast       #641 <Class DescriptorProtos$OneofDescriptorProtoOrBuilder>
		//    8   20:areturn         
			else
				return (DescriptorProtos.OneofDescriptorProtoOrBuilder)oneofDeclBuilder_.getMessageOrBuilder(i);
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

		public DescriptorProtos.MessageOptionsOrBuilder getOptionsOrBuilder()
		{
			if(optionsBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnull          18
				return (DescriptorProtos.MessageOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
		//    3    7:aload_0         
		//    4    8:getfield        #165 <Field SingleFieldBuilderV3 optionsBuilder_>
		//    5   11:invokevirtual   #658 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
		//    6   14:checkcast       #660 <Class DescriptorProtos$MessageOptionsOrBuilder>
		//    7   17:areturn         
			if(options_ == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #80  <Field DescriptorProtos$MessageOptions options_>
		//*  10   22:ifnonnull       29
				return ((DescriptorProtos.MessageOptionsOrBuilder) (DescriptorProtos.MessageOptions.getDefaultInstance()));
		//   11   25:invokestatic    #645 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions.getDefaultInstance()>
		//   12   28:areturn         
			else
				return ((DescriptorProtos.MessageOptionsOrBuilder) (options_));
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

		public ReservedRange getReservedRange(int i)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       21
				return (ReservedRange)reservedRange_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #82  <Field List reservedRange_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #526 <Method Object List.get(int)>
		//    7   17:checkcast       #389 <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    8   20:areturn         
			else
				return (ReservedRange)reservedRangeBuilder_.getMessage(i);
		//    9   21:aload_0         
		//   10   22:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//   11   25:iload_1         
		//   12   26:invokevirtual   #530 <Method AbstractMessage RepeatedFieldBuilderV3.getMessage(int)>
		//   13   29:checkcast       #389 <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//   14   32:areturn         
		}

		public ReservedRange.Builder getReservedRangeBuilder(int i)
		{
			return (ReservedRange.Builder)getReservedRangeFieldBuilder().getBuilder(i);
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

		public ReservedRangeOrBuilder getReservedRangeOrBuilder(int i)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       21
				return (ReservedRangeOrBuilder)reservedRange_.get(i);
		//    3    7:aload_0         
		//    4    8:getfield        #82  <Field List reservedRange_>
		//    5   11:iload_1         
		//    6   12:invokeinterface #526 <Method Object List.get(int)>
		//    7   17:checkcast       #686 <Class DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder>
		//    8   20:areturn         
			else
				return (ReservedRangeOrBuilder)reservedRangeBuilder_.getMessageOrBuilder(i);
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

		public Builder mergeFrom(DescriptorProtos.DescriptorProto descriptorproto)
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
				name_ = descriptorproto.name_;
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
				if(!descriptorproto.field_.isEmpty())
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
						field_ = descriptorproto.field_;
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
						field_.addAll(((java.util.Collection) (descriptorproto.field_)));
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
			if(!descriptorproto.field_.isEmpty())
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
					field_ = descriptorproto.field_;
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
					fieldBuilder_.addAllMessages(((Iterable) (descriptorproto.field_)));
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
				if(!descriptorproto.extension_.isEmpty())
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
						extension_ = descriptorproto.extension_;
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
						extension_.addAll(((java.util.Collection) (descriptorproto.extension_)));
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
			if(!descriptorproto.extension_.isEmpty())
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
					extension_ = descriptorproto.extension_;
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
					extensionBuilder_.addAllMessages(((Iterable) (descriptorproto.extension_)));
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
				if(!descriptorproto.nestedType_.isEmpty())
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
						nestedType_ = descriptorproto.nestedType_;
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
						nestedType_.addAll(((java.util.Collection) (descriptorproto.nestedType_)));
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
			if(!descriptorproto.nestedType_.isEmpty())
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
					nestedType_ = descriptorproto.nestedType_;
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
					nestedTypeBuilder_.addAllMessages(((Iterable) (descriptorproto.nestedType_)));
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
				if(!descriptorproto.enumType_.isEmpty())
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
						enumType_ = descriptorproto.enumType_;
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
						enumType_.addAll(((java.util.Collection) (descriptorproto.enumType_)));
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
			if(!descriptorproto.enumType_.isEmpty())
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
					enumType_ = descriptorproto.enumType_;
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
					enumTypeBuilder_.addAllMessages(((Iterable) (descriptorproto.enumType_)));
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
				if(!descriptorproto.extensionRange_.isEmpty())
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
						extensionRange_ = descriptorproto.extensionRange_;
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
						extensionRange_.addAll(((java.util.Collection) (descriptorproto.extensionRange_)));
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
			if(!descriptorproto.extensionRange_.isEmpty())
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
					extensionRange_ = descriptorproto.extensionRange_;
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
					extensionRangeBuilder_.addAllMessages(((Iterable) (descriptorproto.extensionRange_)));
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
				if(!descriptorproto.oneofDecl_.isEmpty())
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
						oneofDecl_ = descriptorproto.oneofDecl_;
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
						oneofDecl_.addAll(((java.util.Collection) (descriptorproto.oneofDecl_)));
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
			if(!descriptorproto.oneofDecl_.isEmpty())
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
					oneofDecl_ = descriptorproto.oneofDecl_;
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
					oneofDeclBuilder_.addAllMessages(((Iterable) (descriptorproto.oneofDecl_)));
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
				if(!descriptorproto.reservedRange_.isEmpty())
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
						reservedRange_ = descriptorproto.reservedRange_;
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
						reservedRange_.addAll(((java.util.Collection) (descriptorproto.reservedRange_)));
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
			if(!descriptorproto.reservedRange_.isEmpty())
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
					reservedRange_ = descriptorproto.reservedRange_;
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
					reservedRangeBuilder_.addAllMessages(((Iterable) (descriptorproto.reservedRange_)));
		//  547 1213:aload_0         
		//  548 1214:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//  549 1217:aload_1         
		//  550 1218:invokestatic    #809 <Method List DescriptorProtos$DescriptorProto.access$5800(DescriptorProtos$DescriptorProto)>
		//  551 1221:invokevirtual   #218 <Method RepeatedFieldBuilderV3 RepeatedFieldBuilderV3.addAllMessages(Iterable)>
		//  552 1224:pop             
				}
			if(!descriptorproto.reservedName_.isEmpty())
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
					reservedName_ = descriptorproto.reservedName_;
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
					reservedName_.addAll(((java.util.Collection) (descriptorproto.reservedName_)));
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

		public Builder mergeFrom(Message message)
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

		public Builder mergeOptions(DescriptorProtos.MessageOptions messageoptions)
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

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
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

		public Builder removeEnumType(int i)
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

		public Builder removeExtension(int i)
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

		public Builder removeExtensionRange(int i)
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

		public Builder removeField(int i)
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

		public Builder removeNestedType(int i)
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

		public Builder removeOneofDecl(int i)
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

		public Builder removeReservedRange(int i)
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

		public Builder setEnumType(int i, DescriptorProtos.EnumDescriptorProto.Builder builder)
		{
			if(enumTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #127 <Field RepeatedFieldBuilderV3 enumTypeBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureEnumTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #205 <Method void ensureEnumTypeIsMutable()>
				enumType_.set(i, ((Object) (builder.build())));
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
				enumTypeBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setEnumType(int i, DescriptorProtos.EnumDescriptorProto enumdescriptorproto)
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

		public Builder setExtension(int i, DescriptorProtos.FieldDescriptorProto.Builder builder)
		{
			if(extensionBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #145 <Field RepeatedFieldBuilderV3 extensionBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureExtensionIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #222 <Method void ensureExtensionIsMutable()>
				extension_.set(i, ((Object) (builder.build())));
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
				extensionBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setExtension(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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

		public Builder setExtensionRange(int i, ExtensionRange.Builder builder)
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

		public Builder setExtensionRange(int i, ExtensionRange extensionrange)
		{
			if(extensionRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #149 <Field RepeatedFieldBuilderV3 extensionRangeBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(extensionrange == null)
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
					extensionRange_.set(i, ((Object) (extensionrange)));
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
				extensionRangeBuilder_.setMessage(i, ((AbstractMessage) (extensionrange)));
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

		public Builder setField(int i, DescriptorProtos.FieldDescriptorProto.Builder builder)
		{
			if(fieldBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #153 <Field RepeatedFieldBuilderV3 fieldBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureFieldIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #230 <Method void ensureFieldIsMutable()>
				field_.set(i, ((Object) (builder.build())));
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
				fieldBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setField(int i, DescriptorProtos.FieldDescriptorProto fielddescriptorproto)
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

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
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

		public Builder setName(String s)
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

		public Builder setNameBytes(ByteString bytestring)
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

		public Builder setNestedType(int i, Builder builder)
		{
			if(nestedTypeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field RepeatedFieldBuilderV3 nestedTypeBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureNestedTypeIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #233 <Method void ensureNestedTypeIsMutable()>
				nestedType_.set(i, ((Object) (builder.build())));
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
				nestedTypeBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setNestedType(int i, DescriptorProtos.DescriptorProto descriptorproto)
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

		public Builder setOneofDecl(int i, DescriptorProtos.OneofDescriptorProto.Builder builder)
		{
			if(oneofDeclBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #160 <Field RepeatedFieldBuilderV3 oneofDeclBuilder_>
		//*   2    4:ifnonnull       32
			{
				ensureOneofDeclIsMutable();
		//    3    7:aload_0         
		//    4    8:invokespecial   #237 <Method void ensureOneofDeclIsMutable()>
				oneofDecl_.set(i, ((Object) (builder.build())));
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
				oneofDeclBuilder_.setMessage(i, ((AbstractMessage) (builder.build())));
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

		public Builder setOneofDecl(int i, DescriptorProtos.OneofDescriptorProto oneofdescriptorproto)
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

		public Builder setOptions(DescriptorProtos.MessageOptions.Builder builder)
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

		public Builder setOptions(DescriptorProtos.MessageOptions messageoptions)
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

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

		public Builder setReservedName(int i, String s)
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

		public Builder setReservedRange(int i, ReservedRange.Builder builder)
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

		public Builder setReservedRange(int i, ReservedRange reservedrange)
		{
			if(reservedRangeBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #178 <Field RepeatedFieldBuilderV3 reservedRangeBuilder_>
		//*   2    4:ifnonnull       41
			{
				if(reservedrange == null)
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
					reservedRange_.set(i, ((Object) (reservedrange)));
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
				reservedRangeBuilder_.setMessage(i, ((AbstractMessage) (reservedrange)));
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

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
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

		private Builder()
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

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #95  <Method void DescriptorProtos$DescriptorProto$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
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

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #100 <Method void DescriptorProtos$DescriptorProto$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static final class ExtensionRange extends GeneratedMessageV3
		implements ExtensionRangeOrBuilder
	{

		public static ExtensionRange getDefaultInstance()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$2800();
		//    0    0:invokestatic    #155 <Method Descriptors$Descriptor DescriptorProtos.access$2800()>
		//    1    3:areturn         
		}

		public static Builder newBuilder()
		{
			return DEFAULT_INSTANCE.toBuilder();
		//    0    0:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #158 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder toBuilder()>
		//    2    6:areturn         
		}

		public static Builder newBuilder(ExtensionRange extensionrange)
		{
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(extensionrange);
		//    0    0:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #158 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder toBuilder()>
		//    2    6:aload_0         
		//    3    7:invokevirtual   #161 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder DescriptorProtos$DescriptorProto$ExtensionRange$Builder.mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
		//    4   10:areturn         
		}

		public static ExtensionRange parseDelimitedFrom(InputStream inputstream)
			throws IOException
		{
			return (ExtensionRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #167 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    4   10:areturn         
		}

		public static ExtensionRange parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (ExtensionRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #171 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    5   11:areturn         
		}

		public static ExtensionRange parseFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return (ExtensionRange)PARSER.parseFrom(bytestring);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #178 <Method Object Parser.parseFrom(ByteString)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    4   12:areturn         
		}

		public static ExtensionRange parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (ExtensionRange)PARSER.parseFrom(bytestring, extensionregistrylite);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #182 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    5   13:areturn         
		}

		public static ExtensionRange parseFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return (ExtensionRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #187 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    4   10:areturn         
		}

		public static ExtensionRange parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (ExtensionRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #191 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    5   11:areturn         
		}

		public static ExtensionRange parseFrom(InputStream inputstream)
			throws IOException
		{
			return (ExtensionRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #193 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    4   10:areturn         
		}

		public static ExtensionRange parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (ExtensionRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #195 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    5   11:areturn         
		}

		public static ExtensionRange parseFrom(ByteBuffer bytebuffer)
			throws InvalidProtocolBufferException
		{
			return (ExtensionRange)PARSER.parseFrom(bytebuffer);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #199 <Method Object Parser.parseFrom(ByteBuffer)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    4   12:areturn         
		}

		public static ExtensionRange parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (ExtensionRange)PARSER.parseFrom(bytebuffer, extensionregistrylite);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #203 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    5   13:areturn         
		}

		public static ExtensionRange parseFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return (ExtensionRange)PARSER.parseFrom(abyte0);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #207 <Method Object Parser.parseFrom(byte[])>
		//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    4   12:areturn         
		}

		public static ExtensionRange parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (ExtensionRange)PARSER.parseFrom(abyte0, extensionregistrylite);
		//    0    0:getstatic       #51  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #211 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
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
			if(!(obj instanceof ExtensionRange))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//*   7   11:ifne            20
				return super.equals(obj);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokespecial   #218 <Method boolean GeneratedMessageV3.equals(Object)>
		//   11   19:ireturn         
			obj = ((Object) ((ExtensionRange)obj));
		//   12   20:aload_1         
		//   13   21:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//   14   24:astore_1        
			boolean flag;
			if(true && hasStart() == ((ExtensionRange) (obj)).hasStart())
		//*  15   25:iconst_1        
		//*  16   26:ifeq            45
		//*  17   29:aload_0         
		//*  18   30:invokevirtual   #222 <Method boolean hasStart()>
		//*  19   33:aload_1         
		//*  20   34:invokevirtual   #222 <Method boolean hasStart()>
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
			if(hasStart())
		//*  29   49:aload_0         
		//*  30   50:invokevirtual   #222 <Method boolean hasStart()>
		//*  31   53:ifeq            78
				if(flag && getStart() == ((ExtensionRange) (obj)).getStart())
		//*  32   56:iload_2         
		//*  33   57:ifeq            76
		//*  34   60:aload_0         
		//*  35   61:invokevirtual   #225 <Method int getStart()>
		//*  36   64:aload_1         
		//*  37   65:invokevirtual   #225 <Method int getStart()>
		//*  38   68:icmpne          76
					flag1 = true;
		//   39   71:iconst_1        
		//   40   72:istore_3        
				else
		//*  41   73:goto            78
					flag1 = false;
		//   42   76:iconst_0        
		//   43   77:istore_3        
			if(flag1 && hasEnd() == ((ExtensionRange) (obj)).hasEnd())
		//*  44   78:iload_3         
		//*  45   79:ifeq            98
		//*  46   82:aload_0         
		//*  47   83:invokevirtual   #228 <Method boolean hasEnd()>
		//*  48   86:aload_1         
		//*  49   87:invokevirtual   #228 <Method boolean hasEnd()>
		//*  50   90:icmpne          98
				flag = true;
		//   51   93:iconst_1        
		//   52   94:istore_2        
			else
		//*  53   95:goto            100
				flag = false;
		//   54   98:iconst_0        
		//   55   99:istore_2        
			flag1 = flag;
		//   56  100:iload_2         
		//   57  101:istore_3        
			if(hasEnd())
		//*  58  102:aload_0         
		//*  59  103:invokevirtual   #228 <Method boolean hasEnd()>
		//*  60  106:ifeq            131
				if(flag && getEnd() == ((ExtensionRange) (obj)).getEnd())
		//*  61  109:iload_2         
		//*  62  110:ifeq            129
		//*  63  113:aload_0         
		//*  64  114:invokevirtual   #231 <Method int getEnd()>
		//*  65  117:aload_1         
		//*  66  118:invokevirtual   #231 <Method int getEnd()>
		//*  67  121:icmpne          129
					flag1 = true;
		//   68  124:iconst_1        
		//   69  125:istore_3        
				else
		//*  70  126:goto            131
					flag1 = false;
		//   71  129:iconst_0        
		//   72  130:istore_3        
			if(flag1 && hasOptions() == ((ExtensionRange) (obj)).hasOptions())
		//*  73  131:iload_3         
		//*  74  132:ifeq            151
		//*  75  135:aload_0         
		//*  76  136:invokevirtual   #234 <Method boolean hasOptions()>
		//*  77  139:aload_1         
		//*  78  140:invokevirtual   #234 <Method boolean hasOptions()>
		//*  79  143:icmpne          151
				flag = true;
		//   80  146:iconst_1        
		//   81  147:istore_2        
			else
		//*  82  148:goto            153
				flag = false;
		//   83  151:iconst_0        
		//   84  152:istore_2        
			flag1 = flag;
		//   85  153:iload_2         
		//   86  154:istore_3        
			if(hasOptions())
		//*  87  155:aload_0         
		//*  88  156:invokevirtual   #234 <Method boolean hasOptions()>
		//*  89  159:ifeq            187
				if(flag && getOptions().equals(((Object) (((ExtensionRange) (obj)).getOptions()))))
		//*  90  162:iload_2         
		//*  91  163:ifeq            185
		//*  92  166:aload_0         
		//*  93  167:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//*  94  170:aload_1         
		//*  95  171:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//*  96  174:invokevirtual   #238 <Method boolean DescriptorProtos$ExtensionRangeOptions.equals(Object)>
		//*  97  177:ifeq            185
					flag1 = true;
		//   98  180:iconst_1        
		//   99  181:istore_3        
				else
		//* 100  182:goto            187
					flag1 = false;
		//  101  185:iconst_0        
		//  102  186:istore_3        
			return flag1 && unknownFields.equals(((Object) (((ExtensionRange) (obj)).unknownFields)));
		//  103  187:iload_3         
		//  104  188:ifeq            207
		//  105  191:aload_0         
		//  106  192:getfield        #121 <Field UnknownFieldSet unknownFields>
		//  107  195:aload_1         
		//  108  196:getfield        #121 <Field UnknownFieldSet unknownFields>
		//  109  199:invokevirtual   #239 <Method boolean UnknownFieldSet.equals(Object)>
		//  110  202:ifeq            207
		//  111  205:iconst_1        
		//  112  206:ireturn         
		//  113  207:iconst_0        
		//  114  208:ireturn         
		}

		public ExtensionRange getDefaultInstanceForType()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #243 <Method DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #243 <Method DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public int getEnd()
		{
			return end_;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field int end_>
		//    2    4:ireturn         
		}

		public DescriptorProtos.ExtensionRangeOptions getOptions()
		{
			if(options_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*   2    4:ifnonnull       11
				return DescriptorProtos.ExtensionRangeOptions.getDefaultInstance();
		//    3    7:invokestatic    #246 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
		//    4   10:areturn         
			else
				return options_;
		//    5   11:aload_0         
		//    6   12:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//    7   15:areturn         
		}

		public DescriptorProtos.ExtensionRangeOptionsOrBuilder getOptionsOrBuilder()
		{
			if(options_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*   2    4:ifnonnull       11
				return ((DescriptorProtos.ExtensionRangeOptionsOrBuilder) (DescriptorProtos.ExtensionRangeOptions.getDefaultInstance()));
		//    3    7:invokestatic    #246 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
		//    4   10:areturn         
			else
				return ((DescriptorProtos.ExtensionRangeOptionsOrBuilder) (options_));
		//    5   11:aload_0         
		//    6   12:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
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
		//    1    1:getfield        #253 <Field int memoizedSize>
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
		//*  11   15:getfield        #85  <Field int bitField0_>
		//*  12   18:iconst_1        
		//*  13   19:iand            
		//*  14   20:iconst_1        
		//*  15   21:icmpne          35
				j = CodedOutputStream.computeInt32Size(1, start_) + 0;
		//   16   24:iconst_1        
		//   17   25:aload_0         
		//   18   26:getfield        #57  <Field int start_>
		//   19   29:invokestatic    #259 <Method int CodedOutputStream.computeInt32Size(int, int)>
		//   20   32:iconst_0        
		//   21   33:iadd            
		//   22   34:istore_2        
			i = j;
		//   23   35:iload_2         
		//   24   36:istore_1        
			if((bitField0_ & 2) == 2)
		//*  25   37:aload_0         
		//*  26   38:getfield        #85  <Field int bitField0_>
		//*  27   41:iconst_2        
		//*  28   42:iand            
		//*  29   43:iconst_2        
		//*  30   44:icmpne          58
				i = j + CodedOutputStream.computeInt32Size(2, end_);
		//   31   47:iload_2         
		//   32   48:iconst_2        
		//   33   49:aload_0         
		//   34   50:getfield        #59  <Field int end_>
		//   35   53:invokestatic    #259 <Method int CodedOutputStream.computeInt32Size(int, int)>
		//   36   56:iadd            
		//   37   57:istore_1        
			j = i;
		//   38   58:iload_1         
		//   39   59:istore_2        
			if((bitField0_ & 4) == 4)
		//*  40   60:aload_0         
		//*  41   61:getfield        #85  <Field int bitField0_>
		//*  42   64:iconst_4        
		//*  43   65:iand            
		//*  44   66:iconst_4        
		//*  45   67:icmpne          81
				j = i + CodedOutputStream.computeMessageSize(3, ((MessageLite) (getOptions())));
		//   46   70:iload_1         
		//   47   71:iconst_3        
		//   48   72:aload_0         
		//   49   73:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//   50   76:invokestatic    #263 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
		//   51   79:iadd            
		//   52   80:istore_2        
			i = j + unknownFields.getSerializedSize();
		//   53   81:iload_2         
		//   54   82:aload_0         
		//   55   83:getfield        #121 <Field UnknownFieldSet unknownFields>
		//   56   86:invokevirtual   #265 <Method int UnknownFieldSet.getSerializedSize()>
		//   57   89:iadd            
		//   58   90:istore_1        
			memoizedSize = i;
		//   59   91:aload_0         
		//   60   92:iload_1         
		//   61   93:putfield        #253 <Field int memoizedSize>
			return i;
		//   62   96:iload_1         
		//   63   97:ireturn         
		}

		public int getStart()
		{
			return start_;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field int start_>
		//    2    4:ireturn         
		}

		public final UnknownFieldSet getUnknownFields()
		{
			return unknownFields;
		//    0    0:aload_0         
		//    1    1:getfield        #121 <Field UnknownFieldSet unknownFields>
		//    2    4:areturn         
		}

		public boolean hasEnd()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #85  <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
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
		//    1    1:getfield        #85  <Field int bitField0_>
		//    2    4:iconst_4        
		//    3    5:iand            
		//    4    6:iconst_4        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasStart()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #85  <Field int bitField0_>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
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
		//*   1    1:getfield        #270 <Field int memoizedHashCode>
		//*   2    4:ifeq            12
				return memoizedHashCode;
		//    3    7:aload_0         
		//    4    8:getfield        #270 <Field int memoizedHashCode>
		//    5   11:ireturn         
			int j = ((Object) (getDescriptor())).hashCode() + 779;
		//    6   12:invokestatic    #272 <Method Descriptors$Descriptor getDescriptor()>
		//    7   15:invokevirtual   #276 <Method int Object.hashCode()>
		//    8   18:sipush          779
		//    9   21:iadd            
		//   10   22:istore_2        
			int i = j;
		//   11   23:iload_2         
		//   12   24:istore_1        
			if(hasStart())
		//*  13   25:aload_0         
		//*  14   26:invokevirtual   #222 <Method boolean hasStart()>
		//*  15   29:ifeq            47
				i = (j * 37 + 1) * 53 + getStart();
		//   16   32:iload_2         
		//   17   33:bipush          37
		//   18   35:imul            
		//   19   36:iconst_1        
		//   20   37:iadd            
		//   21   38:bipush          53
		//   22   40:imul            
		//   23   41:aload_0         
		//   24   42:invokevirtual   #225 <Method int getStart()>
		//   25   45:iadd            
		//   26   46:istore_1        
			j = i;
		//   27   47:iload_1         
		//   28   48:istore_2        
			if(hasEnd())
		//*  29   49:aload_0         
		//*  30   50:invokevirtual   #228 <Method boolean hasEnd()>
		//*  31   53:ifeq            71
				j = (i * 37 + 2) * 53 + getEnd();
		//   32   56:iload_1         
		//   33   57:bipush          37
		//   34   59:imul            
		//   35   60:iconst_2        
		//   36   61:iadd            
		//   37   62:bipush          53
		//   38   64:imul            
		//   39   65:aload_0         
		//   40   66:invokevirtual   #231 <Method int getEnd()>
		//   41   69:iadd            
		//   42   70:istore_2        
			i = j;
		//   43   71:iload_2         
		//   44   72:istore_1        
			if(hasOptions())
		//*  45   73:aload_0         
		//*  46   74:invokevirtual   #234 <Method boolean hasOptions()>
		//*  47   77:ifeq            98
				i = (j * 37 + 3) * 53 + getOptions().hashCode();
		//   48   80:iload_2         
		//   49   81:bipush          37
		//   50   83:imul            
		//   51   84:iconst_3        
		//   52   85:iadd            
		//   53   86:bipush          53
		//   54   88:imul            
		//   55   89:aload_0         
		//   56   90:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//   57   93:invokevirtual   #277 <Method int DescriptorProtos$ExtensionRangeOptions.hashCode()>
		//   58   96:iadd            
		//   59   97:istore_1        
			i = i * 29 + unknownFields.hashCode();
		//   60   98:iload_1         
		//   61   99:bipush          29
		//   62  101:imul            
		//   63  102:aload_0         
		//   64  103:getfield        #121 <Field UnknownFieldSet unknownFields>
		//   65  106:invokevirtual   #278 <Method int UnknownFieldSet.hashCode()>
		//   66  109:iadd            
		//   67  110:istore_1        
			memoizedHashCode = i;
		//   68  111:aload_0         
		//   69  112:iload_1         
		//   70  113:putfield        #270 <Field int memoizedHashCode>
			return i;
		//   71  116:iload_1         
		//   72  117:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$2900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange, com/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$Builder);
		//    0    0:invokestatic    #283 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$2900()>
		//    1    3:ldc1            #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    2    5:ldc1            #16  <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    3    7:invokevirtual   #289 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
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
			if(hasOptions() && !getOptions().isInitialized())
		//*  12   18:aload_0         
		//*  13   19:invokevirtual   #234 <Method boolean hasOptions()>
		//*  14   22:ifeq            42
		//*  15   25:aload_0         
		//*  16   26:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//*  17   29:invokevirtual   #292 <Method boolean DescriptorProtos$ExtensionRangeOptions.isInitialized()>
		//*  18   32:ifne            42
			{
				memoizedIsInitialized = 0;
		//   19   35:aload_0         
		//   20   36:iconst_0        
		//   21   37:putfield        #55  <Field byte memoizedIsInitialized>
				return false;
		//   22   40:iconst_0        
		//   23   41:ireturn         
			} else
			{
				memoizedIsInitialized = 1;
		//   24   42:aload_0         
		//   25   43:iconst_1        
		//   26   44:putfield        #55  <Field byte memoizedIsInitialized>
				return true;
		//   27   47:iconst_1        
		//   28   48:ireturn         
			}
		}

		public Builder newBuilderForType()
		{
			return newBuilder();
		//    0    0:invokestatic    #295 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilder()>
		//    1    3:areturn         
		}

		protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #16  <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #299 <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
		//    5    9:areturn         
		}

		public volatile Message.Builder newBuilderForType()
		{
			return ((Message.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #302 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return ((Message.Builder) (newBuilderForType(builderparent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #305 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder newBuilderForType()
		{
			return ((MessageLite.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #302 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		public Builder toBuilder()
		{
			if(this == DEFAULT_INSTANCE)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
		//*   2    4:if_acmpne       16
				return new Builder(((DescriptorProtos._cls1) (null)));
		//    3    7:new             #16  <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    4   10:dup             
		//    5   11:aconst_null     
		//    6   12:invokespecial   #309 <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder(DescriptorProtos$1)>
		//    7   15:areturn         
			else
				return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
		//    8   16:new             #16  <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    9   19:dup             
		//   10   20:aconst_null     
		//   11   21:invokespecial   #309 <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder(DescriptorProtos$1)>
		//   12   24:aload_0         
		//   13   25:invokevirtual   #161 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder DescriptorProtos$DescriptorProto$ExtensionRange$Builder.mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
		//   14   28:areturn         
		}

		public volatile Message.Builder toBuilder()
		{
			return ((Message.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #158 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder toBuilder()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder toBuilder()
		{
			return ((MessageLite.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #158 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder toBuilder()>
		//    2    4:areturn         
		}

		public void writeTo(CodedOutputStream codedoutputstream)
			throws IOException
		{
			if((bitField0_ & 1) == 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #85  <Field int bitField0_>
		//*   2    4:iconst_1        
		//*   3    5:iand            
		//*   4    6:iconst_1        
		//*   5    7:icmpne          19
				codedoutputstream.writeInt32(1, start_);
		//    6   10:aload_1         
		//    7   11:iconst_1        
		//    8   12:aload_0         
		//    9   13:getfield        #57  <Field int start_>
		//   10   16:invokevirtual   #315 <Method void CodedOutputStream.writeInt32(int, int)>
			if((bitField0_ & 2) == 2)
		//*  11   19:aload_0         
		//*  12   20:getfield        #85  <Field int bitField0_>
		//*  13   23:iconst_2        
		//*  14   24:iand            
		//*  15   25:iconst_2        
		//*  16   26:icmpne          38
				codedoutputstream.writeInt32(2, end_);
		//   17   29:aload_1         
		//   18   30:iconst_2        
		//   19   31:aload_0         
		//   20   32:getfield        #59  <Field int end_>
		//   21   35:invokevirtual   #315 <Method void CodedOutputStream.writeInt32(int, int)>
			if((bitField0_ & 4) == 4)
		//*  22   38:aload_0         
		//*  23   39:getfield        #85  <Field int bitField0_>
		//*  24   42:iconst_4        
		//*  25   43:iand            
		//*  26   44:iconst_4        
		//*  27   45:icmpne          57
				codedoutputstream.writeMessage(3, ((MessageLite) (getOptions())));
		//   28   48:aload_1         
		//   29   49:iconst_3        
		//   30   50:aload_0         
		//   31   51:invokevirtual   #237 <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//   32   54:invokevirtual   #319 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
			unknownFields.writeTo(codedoutputstream);
		//   33   57:aload_0         
		//   34   58:getfield        #121 <Field UnknownFieldSet unknownFields>
		//   35   61:aload_1         
		//   36   62:invokevirtual   #321 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
		//   37   65:return          
		}

		private static final ExtensionRange DEFAULT_INSTANCE = new ExtensionRange();
		public static final int END_FIELD_NUMBER = 2;
		public static final int OPTIONS_FIELD_NUMBER = 3;
		public static final Parser PARSER = new AbstractParser() {

			public ExtensionRange parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return new ExtensionRange(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
			//    0    0:new             #7   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #25  <Method void DescriptorProtos$DescriptorProto$ExtensionRange(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
			//    6   10:areturn         
			}

			public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method DescriptorProtos$DescriptorProto$ExtensionRange parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
			//    4    6:areturn         
			}

		}
;
		public static final int START_FIELD_NUMBER = 1;
		private static final long serialVersionUID = 0L;
		private int bitField0_;
		private int end_;
		private byte memoizedIsInitialized;
		private DescriptorProtos.ExtensionRangeOptions options_;
		private int start_;

		static 
		{
		//    0    0:new             #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    1    3:dup             
		//    2    4:invokespecial   #46  <Method void DescriptorProtos$DescriptorProto$ExtensionRange()>
		//    3    7:putstatic       #48  <Field DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE>
		//    4   10:new             #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange$1>
		//    5   13:dup             
		//    6   14:invokespecial   #49  <Method void DescriptorProtos$DescriptorProto$ExtensionRange$1()>
		//    7   17:putstatic       #51  <Field Parser PARSER>
		//*   8   20:return          
		}


/*
		static int access$3302(ExtensionRange extensionrange, int i)
		{
			extensionrange.start_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #57  <Field int start_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static int access$3402(ExtensionRange extensionrange, int i)
		{
			extensionrange.end_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #59  <Field int end_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static DescriptorProtos.ExtensionRangeOptions access$3502(ExtensionRange extensionrange, DescriptorProtos.ExtensionRangeOptions extensionrangeoptions)
		{
			extensionrange.options_ = extensionrangeoptions;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
			return extensionrangeoptions;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static int access$3602(ExtensionRange extensionrange, int i)
		{
			extensionrange.bitField0_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #85  <Field int bitField0_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/

		private ExtensionRange()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #53  <Method void GeneratedMessageV3()>
			memoizedIsInitialized = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #55  <Field byte memoizedIsInitialized>
			start_ = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #57  <Field int start_>
			end_ = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #59  <Field int end_>
		//   11   19:return          
		}

		private ExtensionRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			boolean flag;
			UnknownFieldSet.Builder builder1;
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #46  <Method void DescriptorProtos$DescriptorProto$ExtensionRange()>
			if(extensionregistrylite == null)
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       16
				throw new NullPointerException();
		//    4    8:new             #66  <Class NullPointerException>
		//    5   11:dup             
		//    6   12:invokespecial   #67  <Method void NullPointerException()>
		//    7   15:athrow          
			builder1 = UnknownFieldSet.newBuilder();
		//    8   16:invokestatic    #73  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
		//    9   19:astore          6
			flag = false;
		//   10   21:iconst_0        
		//   11   22:istore_3        
_L11:
			if(flag) goto _L2; else goto _L1
		//   12   23:iload_3         
		//   13   24:ifne            210
_L1:
			int i = codedinputstream.readTag();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #79  <Method int CodedInputStream.readTag()>
		//   16   31:istore          4
			i;
		//   17   33:iload           4
			JVM INSTR lookupswitch 4: default 261
		//		               0: 264
		//		               8: 94
		//		               16: 115
		//		               26: 136;
		//   18   35:lookupswitch    4: default 261
		//		               0: 264
		//		               8: 94
		//		               16: 115
		//		               26: 136
			   goto _L3 _L4 _L5 _L6 _L7
_L3:
			if(!parseUnknownField(codedinputstream, builder1, extensionregistrylite, i))
		//*  19   76:aload_0         
		//*  20   77:aload_1         
		//*  21   78:aload           6
		//*  22   80:aload_2         
		//*  23   81:iload           4
		//*  24   83:invokevirtual   #83  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
		//*  25   86:ifne            207
				flag = true;
		//   26   89:iconst_1        
		//   27   90:istore_3        
			continue; /* Loop/switch isn't completed */
		//   28   91:goto            207
_L5:
			bitField0_ = bitField0_ | 1;
		//   29   94:aload_0         
		//   30   95:aload_0         
		//   31   96:getfield        #85  <Field int bitField0_>
		//   32   99:iconst_1        
		//   33  100:ior             
		//   34  101:putfield        #85  <Field int bitField0_>
			start_ = codedinputstream.readInt32();
		//   35  104:aload_0         
		//   36  105:aload_1         
		//   37  106:invokevirtual   #88  <Method int CodedInputStream.readInt32()>
		//   38  109:putfield        #57  <Field int start_>
			continue; /* Loop/switch isn't completed */
		//   39  112:goto            207
_L6:
			bitField0_ = bitField0_ | 2;
		//   40  115:aload_0         
		//   41  116:aload_0         
		//   42  117:getfield        #85  <Field int bitField0_>
		//   43  120:iconst_2        
		//   44  121:ior             
		//   45  122:putfield        #85  <Field int bitField0_>
			end_ = codedinputstream.readInt32();
		//   46  125:aload_0         
		//   47  126:aload_1         
		//   48  127:invokevirtual   #88  <Method int CodedInputStream.readInt32()>
		//   49  130:putfield        #59  <Field int end_>
			continue; /* Loop/switch isn't completed */
		//   50  133:goto            207
_L7:
			DescriptorProtos.ExtensionRangeOptions.Builder builder = null;
		//   51  136:aconst_null     
		//   52  137:astore          5
			if((bitField0_ & 4) == 4)
		//*  53  139:aload_0         
		//*  54  140:getfield        #85  <Field int bitField0_>
		//*  55  143:iconst_4        
		//*  56  144:iand            
		//*  57  145:iconst_4        
		//*  58  146:icmpne          158
				builder = options_.toBuilder();
		//   59  149:aload_0         
		//   60  150:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   61  153:invokevirtual   #96  <Method DescriptorProtos$ExtensionRangeOptions$Builder DescriptorProtos$ExtensionRangeOptions.toBuilder()>
		//   62  156:astore          5
			options_ = (DescriptorProtos.ExtensionRangeOptions)codedinputstream.readMessage(DescriptorProtos.ExtensionRangeOptions.PARSER, extensionregistrylite);
		//   63  158:aload_0         
		//   64  159:aload_1         
		//   65  160:getstatic       #97  <Field Parser DescriptorProtos$ExtensionRangeOptions.PARSER>
		//   66  163:aload_2         
		//   67  164:invokevirtual   #101 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
		//   68  167:checkcast       #92  <Class DescriptorProtos$ExtensionRangeOptions>
		//   69  170:putfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
			if(builder == null) goto _L9; else goto _L8
		//   70  173:aload           5
		//   71  175:ifnull          197
_L8:
			builder.mergeFrom(options_);
		//   72  178:aload           5
		//   73  180:aload_0         
		//   74  181:getfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   75  184:invokevirtual   #107 <Method DescriptorProtos$ExtensionRangeOptions$Builder DescriptorProtos$ExtensionRangeOptions$Builder.mergeFrom(DescriptorProtos$ExtensionRangeOptions)>
		//   76  187:pop             
			options_ = builder.buildPartial();
		//   77  188:aload_0         
		//   78  189:aload           5
		//   79  191:invokevirtual   #111 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions$Builder.buildPartial()>
		//   80  194:putfield        #90  <Field DescriptorProtos$ExtensionRangeOptions options_>
_L9:
			bitField0_ = bitField0_ | 4;
		//   81  197:aload_0         
		//   82  198:aload_0         
		//   83  199:getfield        #85  <Field int bitField0_>
		//   84  202:iconst_4        
		//   85  203:ior             
		//   86  204:putfield        #85  <Field int bitField0_>
			continue; /* Loop/switch isn't completed */
		//   87  207:goto            23
_L2:
			unknownFields = builder1.build();
		//   88  210:aload_0         
		//   89  211:aload           6
		//   90  213:invokevirtual   #117 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//   91  216:putfield        #121 <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//   92  219:aload_0         
		//   93  220:invokevirtual   #124 <Method void makeExtensionsImmutable()>
			return;
		//   94  223:return          
			codedinputstream;
		//   95  224:astore_1        
			throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
		//   96  225:aload_1         
		//   97  226:aload_0         
		//   98  227:invokevirtual   #128 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//   99  230:athrow          
			codedinputstream;
		//  100  231:astore_1        
			throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
		//  101  232:new             #62  <Class InvalidProtocolBufferException>
		//  102  235:dup             
		//  103  236:aload_1         
		//  104  237:invokespecial   #131 <Method void InvalidProtocolBufferException(IOException)>
		//  105  240:aload_0         
		//  106  241:invokevirtual   #128 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//  107  244:athrow          
			codedinputstream;
		//  108  245:astore_1        
			unknownFields = builder1.build();
		//  109  246:aload_0         
		//  110  247:aload           6
		//  111  249:invokevirtual   #117 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//  112  252:putfield        #121 <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//  113  255:aload_0         
		//  114  256:invokevirtual   #124 <Method void makeExtensionsImmutable()>
			throw codedinputstream;
		//  115  259:aload_1         
		//  116  260:athrow          
		//* 117  261:goto            76
_L4:
			flag = true;
		//  118  264:iconst_1        
		//  119  265:istore_3        
			if(true) goto _L11; else goto _L10
		//  120  266:goto            207
_L10:
		}

		ExtensionRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
			throws InvalidProtocolBufferException
		{
			this(codedinputstream, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #135 <Method void DescriptorProtos$DescriptorProto$ExtensionRange(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:return          
		}

		private ExtensionRange(GeneratedMessageV3.Builder builder)
		{
			super(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #138 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
			memoizedIsInitialized = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #55  <Field byte memoizedIsInitialized>
		//    6   10:return          
		}

		ExtensionRange(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
		{
			this(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #142 <Method void DescriptorProtos$DescriptorProto$ExtensionRange(GeneratedMessageV3$Builder)>
		//    3    5:return          
		}
	}

	public static final class ExtensionRange.Builder extends GeneratedMessageV3.Builder
		implements ExtensionRangeOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$2800();
		//    0    0:invokestatic    #47  <Method Descriptors$Descriptor DescriptorProtos.access$2800()>
		//    1    3:areturn         
		}

		private SingleFieldBuilderV3 getOptionsFieldBuilder()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       35
			{
				optionsBuilder_ = new SingleFieldBuilderV3(((AbstractMessage) (getOptions())), ((AbstractMessage.BuilderParent) (getParentForChildren())), isClean());
		//    3    7:aload_0         
		//    4    8:new             #53  <Class SingleFieldBuilderV3>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokevirtual   #57  <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//    8   16:aload_0         
		//    9   17:invokevirtual   #61  <Method GeneratedMessageV3$BuilderParent getParentForChildren()>
		//   10   20:aload_0         
		//   11   21:invokevirtual   #65  <Method boolean isClean()>
		//   12   24:invokespecial   #68  <Method void SingleFieldBuilderV3(AbstractMessage, AbstractMessage$BuilderParent, boolean)>
		//   13   27:putfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
				options_ = null;
		//   14   30:aload_0         
		//   15   31:aconst_null     
		//   16   32:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
			}
			return optionsBuilder_;
		//   17   35:aload_0         
		//   18   36:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   19   39:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			if(GeneratedMessageV3.alwaysUseFieldBuilders)
		//*   0    0:getstatic       #76  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//*   1    3:ifeq            11
				getOptionsFieldBuilder();
		//    2    6:aload_0         
		//    3    7:invokespecial   #78  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//    4   10:pop             
		//    5   11:return          
		}

		public ExtensionRange.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (ExtensionRange.Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #83  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #85  <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #85  <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public ExtensionRange build()
		{
			ExtensionRange extensionrange = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method DescriptorProtos$DescriptorProto$ExtensionRange buildPartial()>
		//    2    4:astore_1        
			if(!extensionrange.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #94  <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (extensionrange)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #98  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return extensionrange;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #101 <Method DescriptorProtos$DescriptorProto$ExtensionRange build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #101 <Method DescriptorProtos$DescriptorProto$ExtensionRange build()>
		//    2    4:areturn         
		}

		public ExtensionRange buildPartial()
		{
			ExtensionRange extensionrange = new ExtensionRange(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #105 <Method void DescriptorProtos$DescriptorProto$ExtensionRange(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #107 <Field int bitField0_>
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
			extensionrange.start_ = start_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #109 <Field int start_>
		//   21   33:invokestatic    #113 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.access$3302(DescriptorProtos$DescriptorProto$ExtensionRange, int)>
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
			extensionrange.end_ = end_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #115 <Field int end_>
		//   37   56:invokestatic    #118 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.access$3402(DescriptorProtos$DescriptorProto$ExtensionRange, int)>
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
			if(optionsBuilder_ == null)
		//*  50   73:aload_0         
		//*  51   74:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  52   77:ifnonnull       93
				extensionrange.options_ = options_;
		//   53   80:aload           4
		//   54   82:aload_0         
		//   55   83:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   56   86:invokestatic    #122 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$DescriptorProto$ExtensionRange.access$3502(DescriptorProtos$DescriptorProto$ExtensionRange, DescriptorProtos$ExtensionRangeOptions)>
		//   57   89:pop             
			else
		//*  58   90:goto            109
				extensionrange.options_ = (DescriptorProtos.ExtensionRangeOptions)optionsBuilder_.build();
		//   59   93:aload           4
		//   60   95:aload_0         
		//   61   96:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   62   99:invokevirtual   #125 <Method AbstractMessage SingleFieldBuilderV3.build()>
		//   63  102:checkcast       #127 <Class DescriptorProtos$ExtensionRangeOptions>
		//   64  105:invokestatic    #122 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$DescriptorProto$ExtensionRange.access$3502(DescriptorProtos$DescriptorProto$ExtensionRange, DescriptorProtos$ExtensionRangeOptions)>
		//   65  108:pop             
			extensionrange.bitField0_ = j;
		//   66  109:aload           4
		//   67  111:iload_2         
		//   68  112:invokestatic    #130 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.access$3602(DescriptorProtos$DescriptorProto$ExtensionRange, int)>
		//   69  115:pop             
			onBuilt();
		//   70  116:aload_0         
		//   71  117:invokevirtual   #133 <Method void onBuilt()>
			return extensionrange;
		//   72  120:aload           4
		//   73  122:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method DescriptorProtos$DescriptorProto$ExtensionRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #91  <Method DescriptorProtos$DescriptorProto$ExtensionRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #138 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clear()>
		//    2    4:areturn         
		}

		public ExtensionRange.Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #141 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			start_ = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #109 <Field int start_>
			bitField0_ = bitField0_ & -2;
		//    6   10:aload_0         
		//    7   11:aload_0         
		//    8   12:getfield        #107 <Field int bitField0_>
		//    9   15:bipush          -2
		//   10   17:iand            
		//   11   18:putfield        #107 <Field int bitField0_>
			end_ = 0;
		//   12   21:aload_0         
		//   13   22:iconst_0        
		//   14   23:putfield        #115 <Field int end_>
			bitField0_ = bitField0_ & -3;
		//   15   26:aload_0         
		//   16   27:aload_0         
		//   17   28:getfield        #107 <Field int bitField0_>
		//   18   31:bipush          -3
		//   19   33:iand            
		//   20   34:putfield        #107 <Field int bitField0_>
			if(optionsBuilder_ == null)
		//*  21   37:aload_0         
		//*  22   38:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*  23   41:ifnonnull       52
				options_ = null;
		//   24   44:aload_0         
		//   25   45:aconst_null     
		//   26   46:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
			else
		//*  27   49:goto            60
				optionsBuilder_.clear();
		//   28   52:aload_0         
		//   29   53:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   30   56:invokevirtual   #143 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   31   59:pop             
			bitField0_ = bitField0_ & -5;
		//   32   60:aload_0         
		//   33   61:aload_0         
		//   34   62:getfield        #107 <Field int bitField0_>
		//   35   65:bipush          -5
		//   36   67:iand            
		//   37   68:putfield        #107 <Field int bitField0_>
			return this;
		//   38   71:aload_0         
		//   39   72:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #138 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #138 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #138 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clear()>
		//    2    4:areturn         
		}

		public ExtensionRange.Builder clearEnd()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #107 <Field int bitField0_>
			end_ = 0;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #115 <Field int end_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #149 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public ExtensionRange.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (ExtensionRange.Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #154 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #156 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #156 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #162 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public ExtensionRange.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (ExtensionRange.Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #165 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #162 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #162 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public ExtensionRange.Builder clearOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       19
			{
				options_ = null;
		//    3    7:aload_0         
		//    4    8:aconst_null     
		//    5    9:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				onChanged();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #149 <Method void onChanged()>
			} else
		//*   8   16:goto            27
			{
				optionsBuilder_.clear();
		//    9   19:aload_0         
		//   10   20:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   11   23:invokevirtual   #143 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.clear()>
		//   12   26:pop             
			}
			bitField0_ = bitField0_ & -5;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #107 <Field int bitField0_>
		//   16   32:bipush          -5
		//   17   34:iand            
		//   18   35:putfield        #107 <Field int bitField0_>
			return this;
		//   19   38:aload_0         
		//   20   39:areturn         
		}

		public ExtensionRange.Builder clearStart()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #107 <Field int bitField0_>
			start_ = 0;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #109 <Field int start_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #149 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public ExtensionRange.Builder clone()
		{
			return (ExtensionRange.Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #174 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #171 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder clone()>
		//    2    4:areturn         
		}

		public ExtensionRange getDefaultInstanceForType()
		{
			return ExtensionRange.getDefaultInstance();
		//    0    0:invokestatic    #182 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #184 <Method DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #184 <Method DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$2800();
		//    0    0:invokestatic    #47  <Method Descriptors$Descriptor DescriptorProtos.access$2800()>
		//    1    3:areturn         
		}

		public int getEnd()
		{
			return end_;
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field int end_>
		//    2    4:ireturn         
		}

		public DescriptorProtos.ExtensionRangeOptions getOptions()
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       23
			{
				if(options_ == null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*   5   11:ifnonnull       18
					return DescriptorProtos.ExtensionRangeOptions.getDefaultInstance();
		//    6   14:invokestatic    #189 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
		//    7   17:areturn         
				else
					return options_;
		//    8   18:aload_0         
		//    9   19:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   10   22:areturn         
			} else
			{
				return (DescriptorProtos.ExtensionRangeOptions)optionsBuilder_.getMessage();
		//   11   23:aload_0         
		//   12   24:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   13   27:invokevirtual   #192 <Method AbstractMessage SingleFieldBuilderV3.getMessage()>
		//   14   30:checkcast       #127 <Class DescriptorProtos$ExtensionRangeOptions>
		//   15   33:areturn         
			}
		}

		public DescriptorProtos.ExtensionRangeOptions.Builder getOptionsBuilder()
		{
			bitField0_ = bitField0_ | 4;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:iconst_4        
		//    4    6:ior             
		//    5    7:putfield        #107 <Field int bitField0_>
			onChanged();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #149 <Method void onChanged()>
			return (DescriptorProtos.ExtensionRangeOptions.Builder)getOptionsFieldBuilder().getBuilder();
		//    8   14:aload_0         
		//    9   15:invokespecial   #78  <Method SingleFieldBuilderV3 getOptionsFieldBuilder()>
		//   10   18:invokevirtual   #197 <Method AbstractMessage$Builder SingleFieldBuilderV3.getBuilder()>
		//   11   21:checkcast       #199 <Class DescriptorProtos$ExtensionRangeOptions$Builder>
		//   12   24:areturn         
		}

		public DescriptorProtos.ExtensionRangeOptionsOrBuilder getOptionsOrBuilder()
		{
			if(optionsBuilder_ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnull          18
				return (DescriptorProtos.ExtensionRangeOptionsOrBuilder)optionsBuilder_.getMessageOrBuilder();
		//    3    7:aload_0         
		//    4    8:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//    5   11:invokevirtual   #205 <Method MessageOrBuilder SingleFieldBuilderV3.getMessageOrBuilder()>
		//    6   14:checkcast       #207 <Class DescriptorProtos$ExtensionRangeOptionsOrBuilder>
		//    7   17:areturn         
			if(options_ == null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*  10   22:ifnonnull       29
				return ((DescriptorProtos.ExtensionRangeOptionsOrBuilder) (DescriptorProtos.ExtensionRangeOptions.getDefaultInstance()));
		//   11   25:invokestatic    #189 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
		//   12   28:areturn         
			else
				return ((DescriptorProtos.ExtensionRangeOptionsOrBuilder) (options_));
		//   13   29:aload_0         
		//   14   30:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   15   33:areturn         
		}

		public int getStart()
		{
			return start_;
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field int start_>
		//    2    4:ireturn         
		}

		public boolean hasEnd()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #107 <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
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
		//    1    1:getfield        #107 <Field int bitField0_>
		//    2    4:iconst_4        
		//    3    5:iand            
		//    4    6:iconst_4        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasStart()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #107 <Field int bitField0_>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$2900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange, com/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$Builder);
		//    0    0:invokestatic    #216 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$2900()>
		//    1    3:ldc1            #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    2    5:ldc1            #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    3    7:invokevirtual   #222 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			return !hasOptions() || getOptions().isInitialized();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #224 <Method boolean hasOptions()>
		//    2    4:ifeq            19
		//    3    7:aload_0         
		//    4    8:invokevirtual   #57  <Method DescriptorProtos$ExtensionRangeOptions getOptions()>
		//    5   11:invokevirtual   #225 <Method boolean DescriptorProtos$ExtensionRangeOptions.isInitialized()>
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
		//    3    3:invokevirtual   #232 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #236 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #232 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public ExtensionRange.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
			codedinputstream = ((CodedInputStream) ((ExtensionRange)ExtensionRange.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #243 <Field Parser DescriptorProtos$DescriptorProto$ExtensionRange.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #249 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((ExtensionRange) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #252 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #255 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #259 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #252 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
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
			codedinputstream = ((CodedInputStream) ((ExtensionRange)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((ExtensionRange) (codedinputstream1)));
			throw codedinputstream;
		}

		public ExtensionRange.Builder mergeFrom(ExtensionRange extensionrange)
		{
			if(extensionrange == ExtensionRange.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #182 <Method DescriptorProtos$DescriptorProto$ExtensionRange DescriptorProtos$DescriptorProto$ExtensionRange.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(extensionrange.hasStart())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #261 <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.hasStart()>
		//*   7   13:ifeq            25
				setStart(extensionrange.getStart());
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #263 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.getStart()>
		//   11   21:invokevirtual   #267 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setStart(int)>
		//   12   24:pop             
			if(extensionrange.hasEnd())
		//*  13   25:aload_1         
		//*  14   26:invokevirtual   #269 <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.hasEnd()>
		//*  15   29:ifeq            41
				setEnd(extensionrange.getEnd());
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:invokevirtual   #271 <Method int DescriptorProtos$DescriptorProto$ExtensionRange.getEnd()>
		//   19   37:invokevirtual   #274 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setEnd(int)>
		//   20   40:pop             
			if(extensionrange.hasOptions())
		//*  21   41:aload_1         
		//*  22   42:invokevirtual   #275 <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.hasOptions()>
		//*  23   45:ifeq            57
				mergeOptions(extensionrange.getOptions());
		//   24   48:aload_0         
		//   25   49:aload_1         
		//   26   50:invokevirtual   #276 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$DescriptorProto$ExtensionRange.getOptions()>
		//   27   53:invokevirtual   #280 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeOptions(DescriptorProtos$ExtensionRangeOptions)>
		//   28   56:pop             
			mergeUnknownFields(extensionrange.unknownFields);
		//   29   57:aload_0         
		//   30   58:aload_1         
		//   31   59:getfield        #284 <Field UnknownFieldSet DescriptorProtos$DescriptorProto$ExtensionRange.unknownFields>
		//   32   62:invokevirtual   #288 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//   33   65:pop             
			onChanged();
		//   34   66:aload_0         
		//   35   67:invokevirtual   #149 <Method void onChanged()>
			return this;
		//   36   70:aload_0         
		//   37   71:areturn         
		}

		public ExtensionRange.Builder mergeFrom(Message message)
		{
			if(message instanceof ExtensionRange)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//*   2    4:ifeq            16
			{
				return mergeFrom((ExtensionRange)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
		//    6   12:invokevirtual   #252 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ExtensionRange)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #290 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #232 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #236 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #232 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public ExtensionRange.Builder mergeOptions(DescriptorProtos.ExtensionRangeOptions extensionrangeoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       67
			{
				if((bitField0_ & 4) == 4 && options_ != null && options_ != DescriptorProtos.ExtensionRangeOptions.getDefaultInstance())
		//*   3    7:aload_0         
		//*   4    8:getfield        #107 <Field int bitField0_>
		//*   5   11:iconst_4        
		//*   6   12:iand            
		//*   7   13:iconst_4        
		//*   8   14:icmpne          55
		//*   9   17:aload_0         
		//*  10   18:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*  11   21:ifnull          55
		//*  12   24:aload_0         
		//*  13   25:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//*  14   28:invokestatic    #189 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()>
		//*  15   31:if_acmpeq       55
					options_ = DescriptorProtos.ExtensionRangeOptions.newBuilder(options_).mergeFrom(extensionrangeoptions).buildPartial();
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
		//   19   39:invokestatic    #297 <Method DescriptorProtos$ExtensionRangeOptions$Builder DescriptorProtos$ExtensionRangeOptions.newBuilder(DescriptorProtos$ExtensionRangeOptions)>
		//   20   42:aload_1         
		//   21   43:invokevirtual   #299 <Method DescriptorProtos$ExtensionRangeOptions$Builder DescriptorProtos$ExtensionRangeOptions$Builder.mergeFrom(DescriptorProtos$ExtensionRangeOptions)>
		//   22   46:invokevirtual   #301 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions$Builder.buildPartial()>
		//   23   49:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				else
		//*  24   52:goto            60
					options_ = extensionrangeoptions;
		//   25   55:aload_0         
		//   26   56:aload_1         
		//   27   57:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				onChanged();
		//   28   60:aload_0         
		//   29   61:invokevirtual   #149 <Method void onChanged()>
			} else
		//*  30   64:goto            76
			{
				optionsBuilder_.mergeFrom(((AbstractMessage) (extensionrangeoptions)));
		//   31   67:aload_0         
		//   32   68:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   33   71:aload_1         
		//   34   72:invokevirtual   #304 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.mergeFrom(AbstractMessage)>
		//   35   75:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   36   76:aload_0         
		//   37   77:aload_0         
		//   38   78:getfield        #107 <Field int bitField0_>
		//   39   81:iconst_4        
		//   40   82:ior             
		//   41   83:putfield        #107 <Field int bitField0_>
			return this;
		//   42   86:aload_0         
		//   43   87:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #288 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final ExtensionRange.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (ExtensionRange.Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #308 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #288 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #288 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public ExtensionRange.Builder setEnd(int i)
		{
			bitField0_ = bitField0_ | 2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:iconst_2        
		//    4    6:ior             
		//    5    7:putfield        #107 <Field int bitField0_>
			end_ = i;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #115 <Field int end_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #149 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public ExtensionRange.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (ExtensionRange.Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #312 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #314 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #314 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public ExtensionRange.Builder setOptions(DescriptorProtos.ExtensionRangeOptions.Builder builder)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       22
			{
				options_ = builder.build();
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #318 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions$Builder.build()>
		//    6   12:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				onChanged();
		//    7   15:aload_0         
		//    8   16:invokevirtual   #149 <Method void onChanged()>
			} else
		//*   9   19:goto            34
			{
				optionsBuilder_.setMessage(((AbstractMessage) (builder.build())));
		//   10   22:aload_0         
		//   11   23:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #318 <Method DescriptorProtos$ExtensionRangeOptions DescriptorProtos$ExtensionRangeOptions$Builder.build()>
		//   14   30:invokevirtual   #321 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   15   33:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   16   34:aload_0         
		//   17   35:aload_0         
		//   18   36:getfield        #107 <Field int bitField0_>
		//   19   39:iconst_4        
		//   20   40:ior             
		//   21   41:putfield        #107 <Field int bitField0_>
			return this;
		//   22   44:aload_0         
		//   23   45:areturn         
		}

		public ExtensionRange.Builder setOptions(DescriptorProtos.ExtensionRangeOptions extensionrangeoptions)
		{
			if(optionsBuilder_ == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//*   2    4:ifnonnull       31
			{
				if(extensionrangeoptions == null)
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       19
					throw new NullPointerException();
		//    5   11:new             #323 <Class NullPointerException>
		//    6   14:dup             
		//    7   15:invokespecial   #324 <Method void NullPointerException()>
		//    8   18:athrow          
				options_ = extensionrangeoptions;
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
				onChanged();
		//   12   24:aload_0         
		//   13   25:invokevirtual   #149 <Method void onChanged()>
			} else
		//*  14   28:goto            40
			{
				optionsBuilder_.setMessage(((AbstractMessage) (extensionrangeoptions)));
		//   15   31:aload_0         
		//   16   32:getfield        #51  <Field SingleFieldBuilderV3 optionsBuilder_>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #321 <Method SingleFieldBuilderV3 SingleFieldBuilderV3.setMessage(AbstractMessage)>
		//   19   39:pop             
			}
			bitField0_ = bitField0_ | 4;
		//   20   40:aload_0         
		//   21   41:aload_0         
		//   22   42:getfield        #107 <Field int bitField0_>
		//   23   45:iconst_4        
		//   24   46:ior             
		//   25   47:putfield        #107 <Field int bitField0_>
			return this;
		//   26   50:aload_0         
		//   27   51:areturn         
		}

		public ExtensionRange.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (ExtensionRange.Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #329 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #331 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #331 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public ExtensionRange.Builder setStart(int i)
		{
			bitField0_ = bitField0_ | 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #107 <Field int bitField0_>
		//    3    5:iconst_1        
		//    4    6:ior             
		//    5    7:putfield        #107 <Field int bitField0_>
			start_ = i;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #109 <Field int start_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #149 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public final ExtensionRange.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (ExtensionRange.Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #335 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ExtensionRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #337 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #337 <Method DescriptorProtos$DescriptorProto$ExtensionRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private int end_;
		private SingleFieldBuilderV3 optionsBuilder_;
		private DescriptorProtos.ExtensionRangeOptions options_;
		private int start_;

		private ExtensionRange.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void GeneratedMessageV3$Builder()>
			options_ = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
			maybeForceBuilderInitialization();
		//    5    9:aload_0         
		//    6   10:invokespecial   #34  <Method void maybeForceBuilderInitialization()>
		//    7   13:return          
		}

		ExtensionRange.Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder()>
		//    2    4:return          
		}

		private ExtensionRange.Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #40  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			options_ = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #31  <Field DescriptorProtos$ExtensionRangeOptions options_>
			maybeForceBuilderInitialization();
		//    6   10:aload_0         
		//    7   11:invokespecial   #34  <Method void maybeForceBuilderInitialization()>
		//    8   14:return          
		}

		ExtensionRange.Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void DescriptorProtos$DescriptorProto$ExtensionRange$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static interface ExtensionRangeOrBuilder
		extends MessageOrBuilder
	{

		public abstract int getEnd();

		public abstract DescriptorProtos.ExtensionRangeOptions getOptions();

		public abstract DescriptorProtos.ExtensionRangeOptionsOrBuilder getOptionsOrBuilder();

		public abstract int getStart();

		public abstract boolean hasEnd();

		public abstract boolean hasOptions();

		public abstract boolean hasStart();
	}

	public static final class ReservedRange extends GeneratedMessageV3
		implements ReservedRangeOrBuilder
	{

		public static ReservedRange getDefaultInstance()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #44  <Field DescriptorProtos$DescriptorProto$ReservedRange DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$3800();
		//    0    0:invokestatic    #126 <Method Descriptors$Descriptor DescriptorProtos.access$3800()>
		//    1    3:areturn         
		}

		public static Builder newBuilder()
		{
			return DEFAULT_INSTANCE.toBuilder();
		//    0    0:getstatic       #44  <Field DescriptorProtos$DescriptorProto$ReservedRange DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #130 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder toBuilder()>
		//    2    6:areturn         
		}

		public static Builder newBuilder(ReservedRange reservedrange)
		{
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(reservedrange);
		//    0    0:getstatic       #44  <Field DescriptorProtos$DescriptorProto$ReservedRange DEFAULT_INSTANCE>
		//    1    3:invokevirtual   #130 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder toBuilder()>
		//    2    6:aload_0         
		//    3    7:invokevirtual   #134 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder DescriptorProtos$DescriptorProto$ReservedRange$Builder.mergeFrom(DescriptorProtos$DescriptorProto$ReservedRange)>
		//    4   10:areturn         
		}

		public static ReservedRange parseDelimitedFrom(InputStream inputstream)
			throws IOException
		{
			return (ReservedRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #140 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    4   10:areturn         
		}

		public static ReservedRange parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (ReservedRange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #144 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    5   11:areturn         
		}

		public static ReservedRange parseFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return (ReservedRange)PARSER.parseFrom(bytestring);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #151 <Method Object Parser.parseFrom(ByteString)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    4   12:areturn         
		}

		public static ReservedRange parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (ReservedRange)PARSER.parseFrom(bytestring, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #155 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    5   13:areturn         
		}

		public static ReservedRange parseFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return (ReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #160 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    4   10:areturn         
		}

		public static ReservedRange parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (ReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #164 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    5   11:areturn         
		}

		public static ReservedRange parseFrom(InputStream inputstream)
			throws IOException
		{
			return (ReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokestatic    #166 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
		//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    4   10:areturn         
		}

		public static ReservedRange parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (ReservedRange)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokestatic    #168 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
		//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    5   11:areturn         
		}

		public static ReservedRange parseFrom(ByteBuffer bytebuffer)
			throws InvalidProtocolBufferException
		{
			return (ReservedRange)PARSER.parseFrom(bytebuffer);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #172 <Method Object Parser.parseFrom(ByteBuffer)>
		//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    4   12:areturn         
		}

		public static ReservedRange parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (ReservedRange)PARSER.parseFrom(bytebuffer, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #176 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    5   13:areturn         
		}

		public static ReservedRange parseFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return (ReservedRange)PARSER.parseFrom(abyte0);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:invokeinterface #180 <Method Object Parser.parseFrom(byte[])>
		//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    4   12:areturn         
		}

		public static ReservedRange parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (ReservedRange)PARSER.parseFrom(abyte0, extensionregistrylite);
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:aload_0         
		//    2    4:aload_1         
		//    3    5:invokeinterface #184 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
		//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    5   13:areturn         
		}

		public static Parser parser()
		{
			return PARSER;
		//    0    0:getstatic       #47  <Field Parser PARSER>
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
			if(!(obj instanceof ReservedRange))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//*   7   11:ifne            20
				return super.equals(obj);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokespecial   #191 <Method boolean GeneratedMessageV3.equals(Object)>
		//   11   19:ireturn         
			obj = ((Object) ((ReservedRange)obj));
		//   12   20:aload_1         
		//   13   21:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//   14   24:astore_1        
			boolean flag;
			if(true && hasStart() == ((ReservedRange) (obj)).hasStart())
		//*  15   25:iconst_1        
		//*  16   26:ifeq            45
		//*  17   29:aload_0         
		//*  18   30:invokevirtual   #195 <Method boolean hasStart()>
		//*  19   33:aload_1         
		//*  20   34:invokevirtual   #195 <Method boolean hasStart()>
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
			if(hasStart())
		//*  29   49:aload_0         
		//*  30   50:invokevirtual   #195 <Method boolean hasStart()>
		//*  31   53:ifeq            78
				if(flag && getStart() == ((ReservedRange) (obj)).getStart())
		//*  32   56:iload_2         
		//*  33   57:ifeq            76
		//*  34   60:aload_0         
		//*  35   61:invokevirtual   #198 <Method int getStart()>
		//*  36   64:aload_1         
		//*  37   65:invokevirtual   #198 <Method int getStart()>
		//*  38   68:icmpne          76
					flag1 = true;
		//   39   71:iconst_1        
		//   40   72:istore_3        
				else
		//*  41   73:goto            78
					flag1 = false;
		//   42   76:iconst_0        
		//   43   77:istore_3        
			if(flag1 && hasEnd() == ((ReservedRange) (obj)).hasEnd())
		//*  44   78:iload_3         
		//*  45   79:ifeq            98
		//*  46   82:aload_0         
		//*  47   83:invokevirtual   #201 <Method boolean hasEnd()>
		//*  48   86:aload_1         
		//*  49   87:invokevirtual   #201 <Method boolean hasEnd()>
		//*  50   90:icmpne          98
				flag = true;
		//   51   93:iconst_1        
		//   52   94:istore_2        
			else
		//*  53   95:goto            100
				flag = false;
		//   54   98:iconst_0        
		//   55   99:istore_2        
			flag1 = flag;
		//   56  100:iload_2         
		//   57  101:istore_3        
			if(hasEnd())
		//*  58  102:aload_0         
		//*  59  103:invokevirtual   #201 <Method boolean hasEnd()>
		//*  60  106:ifeq            131
				if(flag && getEnd() == ((ReservedRange) (obj)).getEnd())
		//*  61  109:iload_2         
		//*  62  110:ifeq            129
		//*  63  113:aload_0         
		//*  64  114:invokevirtual   #204 <Method int getEnd()>
		//*  65  117:aload_1         
		//*  66  118:invokevirtual   #204 <Method int getEnd()>
		//*  67  121:icmpne          129
					flag1 = true;
		//   68  124:iconst_1        
		//   69  125:istore_3        
				else
		//*  70  126:goto            131
					flag1 = false;
		//   71  129:iconst_0        
		//   72  130:istore_3        
			return flag1 && unknownFields.equals(((Object) (((ReservedRange) (obj)).unknownFields)));
		//   73  131:iload_3         
		//   74  132:ifeq            151
		//   75  135:aload_0         
		//   76  136:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   77  139:aload_1         
		//   78  140:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   79  143:invokevirtual   #205 <Method boolean UnknownFieldSet.equals(Object)>
		//   80  146:ifeq            151
		//   81  149:iconst_1        
		//   82  150:ireturn         
		//   83  151:iconst_0        
		//   84  152:ireturn         
		}

		public ReservedRange getDefaultInstanceForType()
		{
			return DEFAULT_INSTANCE;
		//    0    0:getstatic       #44  <Field DescriptorProtos$DescriptorProto$ReservedRange DEFAULT_INSTANCE>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #209 <Method DescriptorProtos$DescriptorProto$ReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #209 <Method DescriptorProtos$DescriptorProto$ReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public int getEnd()
		{
			return end_;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field int end_>
		//    2    4:ireturn         
		}

		public Parser getParserForType()
		{
			return PARSER;
		//    0    0:getstatic       #47  <Field Parser PARSER>
		//    1    3:areturn         
		}

		public int getSerializedSize()
		{
			int i = memoizedSize;
		//    0    0:aload_0         
		//    1    1:getfield        #215 <Field int memoizedSize>
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
		//*  11   15:getfield        #81  <Field int bitField0_>
		//*  12   18:iconst_1        
		//*  13   19:iand            
		//*  14   20:iconst_1        
		//*  15   21:icmpne          35
				i = CodedOutputStream.computeInt32Size(1, start_) + 0;
		//   16   24:iconst_1        
		//   17   25:aload_0         
		//   18   26:getfield        #53  <Field int start_>
		//   19   29:invokestatic    #221 <Method int CodedOutputStream.computeInt32Size(int, int)>
		//   20   32:iconst_0        
		//   21   33:iadd            
		//   22   34:istore_1        
			int j = i;
		//   23   35:iload_1         
		//   24   36:istore_2        
			if((bitField0_ & 2) == 2)
		//*  25   37:aload_0         
		//*  26   38:getfield        #81  <Field int bitField0_>
		//*  27   41:iconst_2        
		//*  28   42:iand            
		//*  29   43:iconst_2        
		//*  30   44:icmpne          58
				j = i + CodedOutputStream.computeInt32Size(2, end_);
		//   31   47:iload_1         
		//   32   48:iconst_2        
		//   33   49:aload_0         
		//   34   50:getfield        #55  <Field int end_>
		//   35   53:invokestatic    #221 <Method int CodedOutputStream.computeInt32Size(int, int)>
		//   36   56:iadd            
		//   37   57:istore_2        
			i = j + unknownFields.getSerializedSize();
		//   38   58:iload_2         
		//   39   59:aload_0         
		//   40   60:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   41   63:invokevirtual   #223 <Method int UnknownFieldSet.getSerializedSize()>
		//   42   66:iadd            
		//   43   67:istore_1        
			memoizedSize = i;
		//   44   68:aload_0         
		//   45   69:iload_1         
		//   46   70:putfield        #215 <Field int memoizedSize>
			return i;
		//   47   73:iload_1         
		//   48   74:ireturn         
		}

		public int getStart()
		{
			return start_;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field int start_>
		//    2    4:ireturn         
		}

		public final UnknownFieldSet getUnknownFields()
		{
			return unknownFields;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field UnknownFieldSet unknownFields>
		//    2    4:areturn         
		}

		public boolean hasEnd()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasStart()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field int bitField0_>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
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
		//*   1    1:getfield        #228 <Field int memoizedHashCode>
		//*   2    4:ifeq            12
				return memoizedHashCode;
		//    3    7:aload_0         
		//    4    8:getfield        #228 <Field int memoizedHashCode>
		//    5   11:ireturn         
			int j = ((Object) (getDescriptor())).hashCode() + 779;
		//    6   12:invokestatic    #230 <Method Descriptors$Descriptor getDescriptor()>
		//    7   15:invokevirtual   #234 <Method int Object.hashCode()>
		//    8   18:sipush          779
		//    9   21:iadd            
		//   10   22:istore_2        
			int i = j;
		//   11   23:iload_2         
		//   12   24:istore_1        
			if(hasStart())
		//*  13   25:aload_0         
		//*  14   26:invokevirtual   #195 <Method boolean hasStart()>
		//*  15   29:ifeq            47
				i = (j * 37 + 1) * 53 + getStart();
		//   16   32:iload_2         
		//   17   33:bipush          37
		//   18   35:imul            
		//   19   36:iconst_1        
		//   20   37:iadd            
		//   21   38:bipush          53
		//   22   40:imul            
		//   23   41:aload_0         
		//   24   42:invokevirtual   #198 <Method int getStart()>
		//   25   45:iadd            
		//   26   46:istore_1        
			j = i;
		//   27   47:iload_1         
		//   28   48:istore_2        
			if(hasEnd())
		//*  29   49:aload_0         
		//*  30   50:invokevirtual   #201 <Method boolean hasEnd()>
		//*  31   53:ifeq            71
				j = (i * 37 + 2) * 53 + getEnd();
		//   32   56:iload_1         
		//   33   57:bipush          37
		//   34   59:imul            
		//   35   60:iconst_2        
		//   36   61:iadd            
		//   37   62:bipush          53
		//   38   64:imul            
		//   39   65:aload_0         
		//   40   66:invokevirtual   #204 <Method int getEnd()>
		//   41   69:iadd            
		//   42   70:istore_2        
			i = j * 29 + unknownFields.hashCode();
		//   43   71:iload_2         
		//   44   72:bipush          29
		//   45   74:imul            
		//   46   75:aload_0         
		//   47   76:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   48   79:invokevirtual   #235 <Method int UnknownFieldSet.hashCode()>
		//   49   82:iadd            
		//   50   83:istore_1        
			memoizedHashCode = i;
		//   51   84:aload_0         
		//   52   85:iload_1         
		//   53   86:putfield        #228 <Field int memoizedHashCode>
			return i;
		//   54   89:iload_1         
		//   55   90:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$3900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange, com/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange$Builder);
		//    0    0:invokestatic    #240 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$3900()>
		//    1    3:ldc1            #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    2    5:ldc1            #16  <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    3    7:invokevirtual   #246 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			byte byte0 = memoizedIsInitialized;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field byte memoizedIsInitialized>
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
		//   14   20:putfield        #51  <Field byte memoizedIsInitialized>
				return true;
		//   15   23:iconst_1        
		//   16   24:ireturn         
			}
		}

		public Builder newBuilderForType()
		{
			return newBuilder();
		//    0    0:invokestatic    #250 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder newBuilder()>
		//    1    3:areturn         
		}

		protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #16  <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #254 <Method void DescriptorProtos$DescriptorProto$ReservedRange$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
		//    5    9:areturn         
		}

		public volatile Message.Builder newBuilderForType()
		{
			return ((Message.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #257 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
		{
			return ((Message.Builder) (newBuilderForType(builderparent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #260 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder newBuilderForType()
		{
			return ((MessageLite.Builder) (newBuilderForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #257 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder newBuilderForType()>
		//    2    4:areturn         
		}

		public Builder toBuilder()
		{
			if(this == DEFAULT_INSTANCE)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #44  <Field DescriptorProtos$DescriptorProto$ReservedRange DEFAULT_INSTANCE>
		//*   2    4:if_acmpne       16
				return new Builder(((DescriptorProtos._cls1) (null)));
		//    3    7:new             #16  <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    4   10:dup             
		//    5   11:aconst_null     
		//    6   12:invokespecial   #264 <Method void DescriptorProtos$DescriptorProto$ReservedRange$Builder(DescriptorProtos$1)>
		//    7   15:areturn         
			else
				return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
		//    8   16:new             #16  <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    9   19:dup             
		//   10   20:aconst_null     
		//   11   21:invokespecial   #264 <Method void DescriptorProtos$DescriptorProto$ReservedRange$Builder(DescriptorProtos$1)>
		//   12   24:aload_0         
		//   13   25:invokevirtual   #134 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder DescriptorProtos$DescriptorProto$ReservedRange$Builder.mergeFrom(DescriptorProtos$DescriptorProto$ReservedRange)>
		//   14   28:areturn         
		}

		public volatile Message.Builder toBuilder()
		{
			return ((Message.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #130 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder toBuilder()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder toBuilder()
		{
			return ((MessageLite.Builder) (toBuilder()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #130 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder toBuilder()>
		//    2    4:areturn         
		}

		public void writeTo(CodedOutputStream codedoutputstream)
			throws IOException
		{
			if((bitField0_ & 1) == 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #81  <Field int bitField0_>
		//*   2    4:iconst_1        
		//*   3    5:iand            
		//*   4    6:iconst_1        
		//*   5    7:icmpne          19
				codedoutputstream.writeInt32(1, start_);
		//    6   10:aload_1         
		//    7   11:iconst_1        
		//    8   12:aload_0         
		//    9   13:getfield        #53  <Field int start_>
		//   10   16:invokevirtual   #270 <Method void CodedOutputStream.writeInt32(int, int)>
			if((bitField0_ & 2) == 2)
		//*  11   19:aload_0         
		//*  12   20:getfield        #81  <Field int bitField0_>
		//*  13   23:iconst_2        
		//*  14   24:iand            
		//*  15   25:iconst_2        
		//*  16   26:icmpne          38
				codedoutputstream.writeInt32(2, end_);
		//   17   29:aload_1         
		//   18   30:iconst_2        
		//   19   31:aload_0         
		//   20   32:getfield        #55  <Field int end_>
		//   21   35:invokevirtual   #270 <Method void CodedOutputStream.writeInt32(int, int)>
			unknownFields.writeTo(codedoutputstream);
		//   22   38:aload_0         
		//   23   39:getfield        #94  <Field UnknownFieldSet unknownFields>
		//   24   42:aload_1         
		//   25   43:invokevirtual   #272 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
		//   26   46:return          
		}

		private static final ReservedRange DEFAULT_INSTANCE = new ReservedRange();
		public static final int END_FIELD_NUMBER = 2;
		public static final Parser PARSER = new AbstractParser() {

			public ReservedRange parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return new ReservedRange(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
			//    0    0:new             #7   <Class DescriptorProtos$DescriptorProto$ReservedRange>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #25  <Method void DescriptorProtos$DescriptorProto$ReservedRange(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
			//    6   10:areturn         
			}

			public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method DescriptorProtos$DescriptorProto$ReservedRange parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
			//    4    6:areturn         
			}

		}
;
		public static final int START_FIELD_NUMBER = 1;
		private static final long serialVersionUID = 0L;
		private int bitField0_;
		private int end_;
		private byte memoizedIsInitialized;
		private int start_;

		static 
		{
		//    0    0:new             #2   <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    1    3:dup             
		//    2    4:invokespecial   #42  <Method void DescriptorProtos$DescriptorProto$ReservedRange()>
		//    3    7:putstatic       #44  <Field DescriptorProtos$DescriptorProto$ReservedRange DEFAULT_INSTANCE>
		//    4   10:new             #14  <Class DescriptorProtos$DescriptorProto$ReservedRange$1>
		//    5   13:dup             
		//    6   14:invokespecial   #45  <Method void DescriptorProtos$DescriptorProto$ReservedRange$1()>
		//    7   17:putstatic       #47  <Field Parser PARSER>
		//*   8   20:return          
		}


/*
		static int access$4302(ReservedRange reservedrange, int i)
		{
			reservedrange.start_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #53  <Field int start_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static int access$4402(ReservedRange reservedrange, int i)
		{
			reservedrange.end_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #55  <Field int end_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static int access$4502(ReservedRange reservedrange, int i)
		{
			reservedrange.bitField0_ = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #81  <Field int bitField0_>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/

		private ReservedRange()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #49  <Method void GeneratedMessageV3()>
			memoizedIsInitialized = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #51  <Field byte memoizedIsInitialized>
			start_ = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #53  <Field int start_>
			end_ = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #55  <Field int end_>
		//   11   19:return          
		}

		private ReservedRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			boolean flag;
			UnknownFieldSet.Builder builder;
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void DescriptorProtos$DescriptorProto$ReservedRange()>
			if(extensionregistrylite == null)
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       16
				throw new NullPointerException();
		//    4    8:new             #62  <Class NullPointerException>
		//    5   11:dup             
		//    6   12:invokespecial   #63  <Method void NullPointerException()>
		//    7   15:athrow          
			builder = UnknownFieldSet.newBuilder();
		//    8   16:invokestatic    #69  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
		//    9   19:astore          5
			flag = false;
		//   10   21:iconst_0        
		//   11   22:istore_3        
_L8:
			if(flag) goto _L2; else goto _L1
		//   12   23:iload_3         
		//   13   24:ifne            128
_L1:
			int i = codedinputstream.readTag();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #75  <Method int CodedInputStream.readTag()>
		//   16   31:istore          4
			i;
		//   17   33:iload           4
			JVM INSTR lookupswitch 3: default 179
		//		               0: 182
		//		               8: 86
		//		               16: 107;
		//   18   35:lookupswitch    3: default 179
		//		               0: 182
		//		               8: 86
		//		               16: 107
			   goto _L3 _L4 _L5 _L6
_L3:
			if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
		//*  19   68:aload_0         
		//*  20   69:aload_1         
		//*  21   70:aload           5
		//*  22   72:aload_2         
		//*  23   73:iload           4
		//*  24   75:invokevirtual   #79  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
		//*  25   78:ifne            125
				flag = true;
		//   26   81:iconst_1        
		//   27   82:istore_3        
			continue; /* Loop/switch isn't completed */
		//   28   83:goto            125
_L5:
			bitField0_ = bitField0_ | 1;
		//   29   86:aload_0         
		//   30   87:aload_0         
		//   31   88:getfield        #81  <Field int bitField0_>
		//   32   91:iconst_1        
		//   33   92:ior             
		//   34   93:putfield        #81  <Field int bitField0_>
			start_ = codedinputstream.readInt32();
		//   35   96:aload_0         
		//   36   97:aload_1         
		//   37   98:invokevirtual   #84  <Method int CodedInputStream.readInt32()>
		//   38  101:putfield        #53  <Field int start_>
			continue; /* Loop/switch isn't completed */
		//   39  104:goto            125
_L6:
			bitField0_ = bitField0_ | 2;
		//   40  107:aload_0         
		//   41  108:aload_0         
		//   42  109:getfield        #81  <Field int bitField0_>
		//   43  112:iconst_2        
		//   44  113:ior             
		//   45  114:putfield        #81  <Field int bitField0_>
			end_ = codedinputstream.readInt32();
		//   46  117:aload_0         
		//   47  118:aload_1         
		//   48  119:invokevirtual   #84  <Method int CodedInputStream.readInt32()>
		//   49  122:putfield        #55  <Field int end_>
			continue; /* Loop/switch isn't completed */
		//   50  125:goto            23
_L2:
			unknownFields = builder.build();
		//   51  128:aload_0         
		//   52  129:aload           5
		//   53  131:invokevirtual   #90  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//   54  134:putfield        #94  <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//   55  137:aload_0         
		//   56  138:invokevirtual   #97  <Method void makeExtensionsImmutable()>
			return;
		//   57  141:return          
			codedinputstream;
		//   58  142:astore_1        
			throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
		//   59  143:aload_1         
		//   60  144:aload_0         
		//   61  145:invokevirtual   #101 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//   62  148:athrow          
			codedinputstream;
		//   63  149:astore_1        
			throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
		//   64  150:new             #58  <Class InvalidProtocolBufferException>
		//   65  153:dup             
		//   66  154:aload_1         
		//   67  155:invokespecial   #104 <Method void InvalidProtocolBufferException(IOException)>
		//   68  158:aload_0         
		//   69  159:invokevirtual   #101 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
		//   70  162:athrow          
			codedinputstream;
		//   71  163:astore_1        
			unknownFields = builder.build();
		//   72  164:aload_0         
		//   73  165:aload           5
		//   74  167:invokevirtual   #90  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//   75  170:putfield        #94  <Field UnknownFieldSet unknownFields>
			makeExtensionsImmutable();
		//   76  173:aload_0         
		//   77  174:invokevirtual   #97  <Method void makeExtensionsImmutable()>
			throw codedinputstream;
		//   78  177:aload_1         
		//   79  178:athrow          
		//*  80  179:goto            68
_L4:
			flag = true;
		//   81  182:iconst_1        
		//   82  183:istore_3        
			if(true) goto _L8; else goto _L7
		//   83  184:goto            125
_L7:
		}

		ReservedRange(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
			throws InvalidProtocolBufferException
		{
			this(codedinputstream, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #108 <Method void DescriptorProtos$DescriptorProto$ReservedRange(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:return          
		}

		private ReservedRange(GeneratedMessageV3.Builder builder)
		{
			super(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #111 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
			memoizedIsInitialized = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #51  <Field byte memoizedIsInitialized>
		//    6   10:return          
		}

		ReservedRange(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
		{
			this(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #115 <Method void DescriptorProtos$DescriptorProto$ReservedRange(GeneratedMessageV3$Builder)>
		//    3    5:return          
		}
	}

	public static final class ReservedRange.Builder extends GeneratedMessageV3.Builder
		implements ReservedRangeOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$3800();
		//    0    0:invokestatic    #40  <Method Descriptors$Descriptor DescriptorProtos.access$3800()>
		//    1    3:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
		//    0    0:getstatic       #46  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//    1    3:istore_1        
		//    2    4:return          
		}

		public ReservedRange.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (ReservedRange.Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #51  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #53  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #53  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public ReservedRange build()
		{
			ReservedRange reservedrange = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method DescriptorProtos$DescriptorProto$ReservedRange buildPartial()>
		//    2    4:astore_1        
			if(!reservedrange.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #63  <Method boolean DescriptorProtos$DescriptorProto$ReservedRange.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (reservedrange)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #67  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return reservedrange;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #70  <Method DescriptorProtos$DescriptorProto$ReservedRange build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #70  <Method DescriptorProtos$DescriptorProto$ReservedRange build()>
		//    2    4:areturn         
		}

		public ReservedRange buildPartial()
		{
			ReservedRange reservedrange = new ReservedRange(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #74  <Method void DescriptorProtos$DescriptorProto$ReservedRange(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #76  <Field int bitField0_>
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
			reservedrange.start_ = start_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #78  <Field int start_>
		//   21   33:invokestatic    #82  <Method int DescriptorProtos$DescriptorProto$ReservedRange.access$4302(DescriptorProtos$DescriptorProto$ReservedRange, int)>
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
			reservedrange.end_ = end_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #84  <Field int end_>
		//   37   56:invokestatic    #87  <Method int DescriptorProtos$DescriptorProto$ReservedRange.access$4402(DescriptorProtos$DescriptorProto$ReservedRange, int)>
		//   38   59:pop             
			reservedrange.bitField0_ = j;
		//   39   60:aload           4
		//   40   62:iload_2         
		//   41   63:invokestatic    #90  <Method int DescriptorProtos$DescriptorProto$ReservedRange.access$4502(DescriptorProtos$DescriptorProto$ReservedRange, int)>
		//   42   66:pop             
			onBuilt();
		//   43   67:aload_0         
		//   44   68:invokevirtual   #93  <Method void onBuilt()>
			return reservedrange;
		//   45   71:aload           4
		//   46   73:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method DescriptorProtos$DescriptorProto$ReservedRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method DescriptorProtos$DescriptorProto$ReservedRange buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public ReservedRange.Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #101 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			start_ = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #78  <Field int start_>
			bitField0_ = bitField0_ & -2;
		//    6   10:aload_0         
		//    7   11:aload_0         
		//    8   12:getfield        #76  <Field int bitField0_>
		//    9   15:bipush          -2
		//   10   17:iand            
		//   11   18:putfield        #76  <Field int bitField0_>
			end_ = 0;
		//   12   21:aload_0         
		//   13   22:iconst_0        
		//   14   23:putfield        #84  <Field int end_>
			bitField0_ = bitField0_ & -3;
		//   15   26:aload_0         
		//   16   27:aload_0         
		//   17   28:getfield        #76  <Field int bitField0_>
		//   18   31:bipush          -3
		//   19   33:iand            
		//   20   34:putfield        #76  <Field int bitField0_>
			return this;
		//   21   37:aload_0         
		//   22   38:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clear()>
		//    2    4:areturn         
		}

		public ReservedRange.Builder clearEnd()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #76  <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #76  <Field int bitField0_>
			end_ = 0;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #84  <Field int end_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public ReservedRange.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (ReservedRange.Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #112 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #114 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #114 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public ReservedRange.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (ReservedRange.Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #123 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public ReservedRange.Builder clearStart()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #76  <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #76  <Field int bitField0_>
			start_ = 0;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #78  <Field int start_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public ReservedRange.Builder clone()
		{
			return (ReservedRange.Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #131 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #128 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder clone()>
		//    2    4:areturn         
		}

		public ReservedRange getDefaultInstanceForType()
		{
			return ReservedRange.getDefaultInstance();
		//    0    0:invokestatic    #139 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #141 <Method DescriptorProtos$DescriptorProto$ReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #141 <Method DescriptorProtos$DescriptorProto$ReservedRange getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$3800();
		//    0    0:invokestatic    #40  <Method Descriptors$Descriptor DescriptorProtos.access$3800()>
		//    1    3:areturn         
		}

		public int getEnd()
		{
			return end_;
		//    0    0:aload_0         
		//    1    1:getfield        #84  <Field int end_>
		//    2    4:ireturn         
		}

		public int getStart()
		{
			return start_;
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field int start_>
		//    2    4:ireturn         
		}

		public boolean hasEnd()
		{
			return (bitField0_ & 2) == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field int bitField0_>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:iconst_2        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public boolean hasStart()
		{
			return (bitField0_ & 1) == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field int bitField0_>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
		//    5    7:icmpne          12
		//    6   10:iconst_1        
		//    7   11:ireturn         
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$3900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange, com/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange$Builder);
		//    0    0:invokestatic    #152 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$3900()>
		//    1    3:ldc1            #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    2    5:ldc1            #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    3    7:invokevirtual   #158 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
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
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #169 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public ReservedRange.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
			codedinputstream = ((CodedInputStream) ((ReservedRange)ReservedRange.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #176 <Field Parser DescriptorProtos$DescriptorProto$ReservedRange.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #182 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((ReservedRange) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #185 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ReservedRange)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #188 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #192 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #185 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ReservedRange)>
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
			codedinputstream = ((CodedInputStream) ((ReservedRange)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((ReservedRange) (codedinputstream1)));
			throw codedinputstream;
		}

		public ReservedRange.Builder mergeFrom(ReservedRange reservedrange)
		{
			if(reservedrange == ReservedRange.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #139 <Method DescriptorProtos$DescriptorProto$ReservedRange DescriptorProtos$DescriptorProto$ReservedRange.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(reservedrange.hasStart())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #194 <Method boolean DescriptorProtos$DescriptorProto$ReservedRange.hasStart()>
		//*   7   13:ifeq            25
				setStart(reservedrange.getStart());
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #196 <Method int DescriptorProtos$DescriptorProto$ReservedRange.getStart()>
		//   11   21:invokevirtual   #200 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setStart(int)>
		//   12   24:pop             
			if(reservedrange.hasEnd())
		//*  13   25:aload_1         
		//*  14   26:invokevirtual   #202 <Method boolean DescriptorProtos$DescriptorProto$ReservedRange.hasEnd()>
		//*  15   29:ifeq            41
				setEnd(reservedrange.getEnd());
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:invokevirtual   #204 <Method int DescriptorProtos$DescriptorProto$ReservedRange.getEnd()>
		//   19   37:invokevirtual   #207 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setEnd(int)>
		//   20   40:pop             
			mergeUnknownFields(reservedrange.unknownFields);
		//   21   41:aload_0         
		//   22   42:aload_1         
		//   23   43:getfield        #211 <Field UnknownFieldSet DescriptorProtos$DescriptorProto$ReservedRange.unknownFields>
		//   24   46:invokevirtual   #215 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//   25   49:pop             
			onChanged();
		//   26   50:aload_0         
		//   27   51:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   28   54:aload_0         
		//   29   55:areturn         
		}

		public ReservedRange.Builder mergeFrom(Message message)
		{
			if(message instanceof ReservedRange)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//*   2    4:ifeq            16
			{
				return mergeFrom((ReservedRange)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #14  <Class DescriptorProtos$DescriptorProto$ReservedRange>
		//    6   12:invokevirtual   #185 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(DescriptorProtos$DescriptorProto$ReservedRange)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #217 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #169 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #165 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #215 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final ReservedRange.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (ReservedRange.Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #224 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #215 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #215 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public ReservedRange.Builder setEnd(int i)
		{
			bitField0_ = bitField0_ | 2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #76  <Field int bitField0_>
		//    3    5:iconst_2        
		//    4    6:ior             
		//    5    7:putfield        #76  <Field int bitField0_>
			end_ = i;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #84  <Field int end_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public ReservedRange.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (ReservedRange.Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #228 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #230 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #230 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public ReservedRange.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (ReservedRange.Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #235 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #237 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #237 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public ReservedRange.Builder setStart(int i)
		{
			bitField0_ = bitField0_ | 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #76  <Field int bitField0_>
		//    3    5:iconst_1        
		//    4    6:ior             
		//    5    7:putfield        #76  <Field int bitField0_>
			start_ = i;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #78  <Field int start_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #107 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public final ReservedRange.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (ReservedRange.Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #241 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$DescriptorProto$ReservedRange$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #243 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #243 <Method DescriptorProtos$DescriptorProto$ReservedRange$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private int end_;
		private int start_;

		private ReservedRange.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void GeneratedMessageV3$Builder()>
			maybeForceBuilderInitialization();
		//    2    4:aload_0         
		//    3    5:invokespecial   #27  <Method void maybeForceBuilderInitialization()>
		//    4    8:return          
		}

		ReservedRange.Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void DescriptorProtos$DescriptorProto$ReservedRange$Builder()>
		//    2    4:return          
		}

		private ReservedRange.Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #33  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			maybeForceBuilderInitialization();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void maybeForceBuilderInitialization()>
		//    5    9:return          
		}

		ReservedRange.Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #35  <Method void DescriptorProtos$DescriptorProto$ReservedRange$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}

	public static interface ReservedRangeOrBuilder
		extends MessageOrBuilder
	{

		public abstract int getEnd();

		public abstract int getStart();

		public abstract boolean hasEnd();

		public abstract boolean hasStart();
	}


	public static DescriptorProtos$DescriptorProto getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #95  <Field DescriptorProtos$DescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$2600();
	//    0    0:invokestatic    #286 <Method Descriptors$Descriptor DescriptorProtos.access$2600()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #95  <Field DescriptorProtos$DescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #289 <Method DescriptorProtos$DescriptorProto$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$descriptorproto);
	//    0    0:getstatic       #95  <Field DescriptorProtos$DescriptorProto DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #289 <Method DescriptorProtos$DescriptorProto$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #292 <Method DescriptorProtos$DescriptorProto$Builder DescriptorProtos$DescriptorProto$Builder.mergeFrom(DescriptorProtos$DescriptorProto)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #298 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #302 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #309 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #313 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #318 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #322 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #324 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    4   10:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$DescriptorProto)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #326 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    5   11:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #330 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #334 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    5   13:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #338 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    4   12:areturn         
	}

	public static DescriptorProtos$DescriptorProto parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$DescriptorProto)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #342 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #98  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$DescriptorProto))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$DescriptorProto>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #348 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$DescriptorProto)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasName() == ((DescriptorProtos$DescriptorProto) (obj)).hasName())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #352 <Method boolean hasName()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #352 <Method boolean hasName()>
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
	//*  30   50:invokevirtual   #352 <Method boolean hasName()>
	//*  31   53:ifeq            81
			if(flag && getName().equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getName()))))
	//*  32   56:iload_2         
	//*  33   57:ifeq            79
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #356 <Method String getName()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #356 <Method String getName()>
	//*  38   68:invokevirtual   #359 <Method boolean String.equals(Object)>
	//*  39   71:ifeq            79
				flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
			else
	//*  42   76:goto            81
				flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if(flag1 && getFieldList().equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getFieldList()))))
	//*  45   81:iload_3         
	//*  46   82:ifeq            106
	//*  47   85:aload_0         
	//*  48   86:invokevirtual   #362 <Method List getFieldList()>
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #362 <Method List getFieldList()>
	//*  51   93:invokeinterface #363 <Method boolean List.equals(Object)>
	//*  52   98:ifeq            106
			flag = true;
	//   53  101:iconst_1        
	//   54  102:istore_2        
		else
	//*  55  103:goto            108
			flag = false;
	//   56  106:iconst_0        
	//   57  107:istore_2        
		if(flag && getExtensionList().equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getExtensionList()))))
	//*  58  108:iload_2         
	//*  59  109:ifeq            133
	//*  60  112:aload_0         
	//*  61  113:invokevirtual   #366 <Method List getExtensionList()>
	//*  62  116:aload_1         
	//*  63  117:invokevirtual   #366 <Method List getExtensionList()>
	//*  64  120:invokeinterface #363 <Method boolean List.equals(Object)>
	//*  65  125:ifeq            133
			flag = true;
	//   66  128:iconst_1        
	//   67  129:istore_2        
		else
	//*  68  130:goto            135
			flag = false;
	//   69  133:iconst_0        
	//   70  134:istore_2        
		if(flag && getNestedTypeList().equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getNestedTypeList()))))
	//*  71  135:iload_2         
	//*  72  136:ifeq            160
	//*  73  139:aload_0         
	//*  74  140:invokevirtual   #369 <Method List getNestedTypeList()>
	//*  75  143:aload_1         
	//*  76  144:invokevirtual   #369 <Method List getNestedTypeList()>
	//*  77  147:invokeinterface #363 <Method boolean List.equals(Object)>
	//*  78  152:ifeq            160
			flag = true;
	//   79  155:iconst_1        
	//   80  156:istore_2        
		else
	//*  81  157:goto            162
			flag = false;
	//   82  160:iconst_0        
	//   83  161:istore_2        
		if(flag && getEnumTypeList().equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getEnumTypeList()))))
	//*  84  162:iload_2         
	//*  85  163:ifeq            187
	//*  86  166:aload_0         
	//*  87  167:invokevirtual   #372 <Method List getEnumTypeList()>
	//*  88  170:aload_1         
	//*  89  171:invokevirtual   #372 <Method List getEnumTypeList()>
	//*  90  174:invokeinterface #363 <Method boolean List.equals(Object)>
	//*  91  179:ifeq            187
			flag = true;
	//   92  182:iconst_1        
	//   93  183:istore_2        
		else
	//*  94  184:goto            189
			flag = false;
	//   95  187:iconst_0        
	//   96  188:istore_2        
		if(flag && getExtensionRangeList().equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getExtensionRangeList()))))
	//*  97  189:iload_2         
	//*  98  190:ifeq            214
	//*  99  193:aload_0         
	//* 100  194:invokevirtual   #375 <Method List getExtensionRangeList()>
	//* 101  197:aload_1         
	//* 102  198:invokevirtual   #375 <Method List getExtensionRangeList()>
	//* 103  201:invokeinterface #363 <Method boolean List.equals(Object)>
	//* 104  206:ifeq            214
			flag = true;
	//  105  209:iconst_1        
	//  106  210:istore_2        
		else
	//* 107  211:goto            216
			flag = false;
	//  108  214:iconst_0        
	//  109  215:istore_2        
		if(flag && getOneofDeclList().equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getOneofDeclList()))))
	//* 110  216:iload_2         
	//* 111  217:ifeq            241
	//* 112  220:aload_0         
	//* 113  221:invokevirtual   #378 <Method List getOneofDeclList()>
	//* 114  224:aload_1         
	//* 115  225:invokevirtual   #378 <Method List getOneofDeclList()>
	//* 116  228:invokeinterface #363 <Method boolean List.equals(Object)>
	//* 117  233:ifeq            241
			flag = true;
	//  118  236:iconst_1        
	//  119  237:istore_2        
		else
	//* 120  238:goto            243
			flag = false;
	//  121  241:iconst_0        
	//  122  242:istore_2        
		if(flag && hasOptions() == ((DescriptorProtos$DescriptorProto) (obj)).hasOptions())
	//* 123  243:iload_2         
	//* 124  244:ifeq            263
	//* 125  247:aload_0         
	//* 126  248:invokevirtual   #381 <Method boolean hasOptions()>
	//* 127  251:aload_1         
	//* 128  252:invokevirtual   #381 <Method boolean hasOptions()>
	//* 129  255:icmpne          263
			flag = true;
	//  130  258:iconst_1        
	//  131  259:istore_2        
		else
	//* 132  260:goto            265
			flag = false;
	//  133  263:iconst_0        
	//  134  264:istore_2        
		flag1 = flag;
	//  135  265:iload_2         
	//  136  266:istore_3        
		if(hasOptions())
	//* 137  267:aload_0         
	//* 138  268:invokevirtual   #381 <Method boolean hasOptions()>
	//* 139  271:ifeq            299
			if(flag && getOptions().equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getOptions()))))
	//* 140  274:iload_2         
	//* 141  275:ifeq            297
	//* 142  278:aload_0         
	//* 143  279:invokevirtual   #384 <Method DescriptorProtos$MessageOptions getOptions()>
	//* 144  282:aload_1         
	//* 145  283:invokevirtual   #384 <Method DescriptorProtos$MessageOptions getOptions()>
	//* 146  286:invokevirtual   #385 <Method boolean DescriptorProtos$MessageOptions.equals(Object)>
	//* 147  289:ifeq            297
				flag1 = true;
	//  148  292:iconst_1        
	//  149  293:istore_3        
			else
	//* 150  294:goto            299
				flag1 = false;
	//  151  297:iconst_0        
	//  152  298:istore_3        
		if(flag1 && getReservedRangeList().equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getReservedRangeList()))))
	//* 153  299:iload_3         
	//* 154  300:ifeq            324
	//* 155  303:aload_0         
	//* 156  304:invokevirtual   #388 <Method List getReservedRangeList()>
	//* 157  307:aload_1         
	//* 158  308:invokevirtual   #388 <Method List getReservedRangeList()>
	//* 159  311:invokeinterface #363 <Method boolean List.equals(Object)>
	//* 160  316:ifeq            324
			flag = true;
	//  161  319:iconst_1        
	//  162  320:istore_2        
		else
	//* 163  321:goto            326
			flag = false;
	//  164  324:iconst_0        
	//  165  325:istore_2        
		if(flag && ((Object) (getReservedNameList())).equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).getReservedNameList()))))
	//* 166  326:iload_2         
	//* 167  327:ifeq            349
	//* 168  330:aload_0         
	//* 169  331:invokevirtual   #392 <Method ProtocolStringList getReservedNameList()>
	//* 170  334:aload_1         
	//* 171  335:invokevirtual   #392 <Method ProtocolStringList getReservedNameList()>
	//* 172  338:invokevirtual   #395 <Method boolean Object.equals(Object)>
	//* 173  341:ifeq            349
			flag = true;
	//  174  344:iconst_1        
	//  175  345:istore_2        
		else
	//* 176  346:goto            351
			flag = false;
	//  177  349:iconst_0        
	//  178  350:istore_2        
		return flag && unknownFields.equals(((Object) (((DescriptorProtos$DescriptorProto) (obj)).unknownFields)));
	//  179  351:iload_2         
	//  180  352:ifeq            371
	//  181  355:aload_0         
	//  182  356:getfield        #230 <Field UnknownFieldSet unknownFields>
	//  183  359:aload_1         
	//  184  360:getfield        #230 <Field UnknownFieldSet unknownFields>
	//  185  363:invokevirtual   #396 <Method boolean UnknownFieldSet.equals(Object)>
	//  186  366:ifeq            371
	//  187  369:iconst_1        
	//  188  370:ireturn         
	//  189  371:iconst_0        
	//  190  372:ireturn         
	}

	public DescriptorProtos$DescriptorProto getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #95  <Field DescriptorProtos$DescriptorProto DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #400 <Method DescriptorProtos$DescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #400 <Method DescriptorProtos$DescriptorProto getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public oto getEnumType(int i)
	{
		return (oto)enumType_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List enumType_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #181 <Class DescriptorProtos$EnumDescriptorProto>
	//    5   13:areturn         
	}

	public int getEnumTypeCount()
	{
		return enumType_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List enumType_>
	//    2    4:invokeinterface #411 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getEnumTypeList()
	{
		return enumType_;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List enumType_>
	//    2    4:areturn         
	}

	public otoOrBuilder getEnumTypeOrBuilder(int i)
	{
		return (otoOrBuilder)enumType_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List enumType_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #416 <Class DescriptorProtos$EnumDescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getEnumTypeOrBuilderList()
	{
		return enumType_;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List enumType_>
	//    2    4:areturn         
	}

	public roto getExtension(int i)
	{
		return (roto)extension_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field List extension_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #168 <Class DescriptorProtos$FieldDescriptorProto>
	//    5   13:areturn         
	}

	public int getExtensionCount()
	{
		return extension_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field List extension_>
	//    2    4:invokeinterface #411 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getExtensionList()
	{
		return extension_;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field List extension_>
	//    2    4:areturn         
	}

	public rotoOrBuilder getExtensionOrBuilder(int i)
	{
		return (rotoOrBuilder)extension_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field List extension_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #426 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getExtensionOrBuilderList()
	{
		return extension_;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field List extension_>
	//    2    4:areturn         
	}

	public ExtensionRange getExtensionRange(int i)
	{
		return (ExtensionRange)extensionRange_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field List extensionRange_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #16  <Class DescriptorProtos$DescriptorProto$ExtensionRange>
	//    5   13:areturn         
	}

	public int getExtensionRangeCount()
	{
		return extensionRange_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field List extensionRange_>
	//    2    4:invokeinterface #411 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getExtensionRangeList()
	{
		return extensionRange_;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field List extensionRange_>
	//    2    4:areturn         
	}

	public ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i)
	{
		return (ExtensionRangeOrBuilder)extensionRange_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field List extensionRange_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #23  <Class DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder>
	//    5   13:areturn         
	}

	public List getExtensionRangeOrBuilderList()
	{
		return extensionRange_;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field List extensionRange_>
	//    2    4:areturn         
	}

	public roto getField(int i)
	{
		return (roto)field_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field List field_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #168 <Class DescriptorProtos$FieldDescriptorProto>
	//    5   13:areturn         
	}

	public int getFieldCount()
	{
		return field_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field List field_>
	//    2    4:invokeinterface #411 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getFieldList()
	{
		return field_;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field List field_>
	//    2    4:areturn         
	}

	public rotoOrBuilder getFieldOrBuilder(int i)
	{
		return (rotoOrBuilder)field_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field List field_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #426 <Class DescriptorProtos$FieldDescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getFieldOrBuilderList()
	{
		return field_;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field List field_>
	//    2    4:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #358 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #358 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #442 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #445 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #448 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			name_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #106 <Field Object name_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #358 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #358 <Class String>
	//    8   16:invokestatic    #453 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #106 <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #442 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public DescriptorProtos$DescriptorProto getNestedType(int i)
	{
		return (DescriptorProtos$DescriptorProto)nestedType_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field List nestedType_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$DescriptorProto>
	//    5   13:areturn         
	}

	public int getNestedTypeCount()
	{
		return nestedType_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field List nestedType_>
	//    2    4:invokeinterface #411 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getNestedTypeList()
	{
		return nestedType_;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field List nestedType_>
	//    2    4:areturn         
	}

	public rBuilder getNestedTypeOrBuilder(int i)
	{
		return (rBuilder)nestedType_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field List nestedType_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #6   <Class DescriptorProtos$DescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getNestedTypeOrBuilderList()
	{
		return nestedType_;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field List nestedType_>
	//    2    4:areturn         
	}

	public roto getOneofDecl(int i)
	{
		return (roto)oneofDecl_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field List oneofDecl_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #204 <Class DescriptorProtos$OneofDescriptorProto>
	//    5   13:areturn         
	}

	public int getOneofDeclCount()
	{
		return oneofDecl_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field List oneofDecl_>
	//    2    4:invokeinterface #411 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getOneofDeclList()
	{
		return oneofDecl_;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field List oneofDecl_>
	//    2    4:areturn         
	}

	public rotoOrBuilder getOneofDeclOrBuilder(int i)
	{
		return (rotoOrBuilder)oneofDecl_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field List oneofDecl_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #469 <Class DescriptorProtos$OneofDescriptorProtoOrBuilder>
	//    5   13:areturn         
	}

	public List getOneofDeclOrBuilderList()
	{
		return oneofDecl_;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field List oneofDecl_>
	//    2    4:areturn         
	}

	public DescriptorProtos.MessageOptions getOptions()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field DescriptorProtos$MessageOptions options_>
	//*   2    4:ifnonnull       11
			return DescriptorProtos.MessageOptions.getDefaultInstance();
	//    3    7:invokestatic    #473 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return options_;
	//    5   11:aload_0         
	//    6   12:getfield        #185 <Field DescriptorProtos$MessageOptions options_>
	//    7   15:areturn         
	}

	public Builder getOptionsOrBuilder()
	{
		if(options_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field DescriptorProtos$MessageOptions options_>
	//*   2    4:ifnonnull       11
			return ((Builder) (DescriptorProtos.MessageOptions.getDefaultInstance()));
	//    3    7:invokestatic    #473 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions.getDefaultInstance()>
	//    4   10:areturn         
		else
			return ((Builder) (options_));
	//    5   11:aload_0         
	//    6   12:getfield        #185 <Field DescriptorProtos$MessageOptions options_>
	//    7   15:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #98  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public String getReservedName(int i)
	{
		return (String)reservedName_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field LazyStringList reservedName_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #479 <Method Object LazyStringList.get(int)>
	//    4   10:checkcast       #358 <Class String>
	//    5   13:areturn         
	}

	public ByteString getReservedNameBytes(int i)
	{
		return reservedName_.getByteString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field LazyStringList reservedName_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #484 <Method ByteString LazyStringList.getByteString(int)>
	//    4   10:areturn         
	}

	public int getReservedNameCount()
	{
		return reservedName_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field LazyStringList reservedName_>
	//    2    4:invokeinterface #486 <Method int LazyStringList.size()>
	//    3    9:ireturn         
	}

	public ProtocolStringList getReservedNameList()
	{
		return ((ProtocolStringList) (reservedName_));
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field LazyStringList reservedName_>
	//    2    4:areturn         
	}

	public volatile List getReservedNameList()
	{
		return ((List) (getReservedNameList()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #392 <Method ProtocolStringList getReservedNameList()>
	//    2    4:areturn         
	}

	public ReservedRange getReservedRange(int i)
	{
		return (ReservedRange)reservedRange_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field List reservedRange_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #26  <Class DescriptorProtos$DescriptorProto$ReservedRange>
	//    5   13:areturn         
	}

	public int getReservedRangeCount()
	{
		return reservedRange_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field List reservedRange_>
	//    2    4:invokeinterface #411 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getReservedRangeList()
	{
		return reservedRange_;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field List reservedRange_>
	//    2    4:areturn         
	}

	public ReservedRangeOrBuilder getReservedRangeOrBuilder(int i)
	{
		return (ReservedRangeOrBuilder)reservedRange_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field List reservedRange_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #407 <Method Object List.get(int)>
	//    4   10:checkcast       #33  <Class DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder>
	//    5   13:areturn         
	}

	public List getReservedRangeOrBuilderList()
	{
		return reservedRange_;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field List reservedRange_>
	//    2    4:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #498 <Field int memoizedSize>
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
	//*  11   15:getfield        #163 <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			i = GeneratedMessageV3.computeStringSize(1, name_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #106 <Field Object name_>
	//   19   29:invokestatic    #502 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_1        
		for(int j = 0; j < field_.size(); j++)
	//*  23   35:iconst_0        
	//*  24   36:istore_2        
	//*  25   37:iload_2         
	//*  26   38:aload_0         
	//*  27   39:getfield        #114 <Field List field_>
	//*  28   42:invokeinterface #411 <Method int List.size()>
	//*  29   47:icmpge          77
			i += CodedOutputStream.computeMessageSize(2, (MessageLite)field_.get(j));
	//   30   50:iload_1         
	//   31   51:iconst_2        
	//   32   52:aload_0         
	//   33   53:getfield        #114 <Field List field_>
	//   34   56:iload_2         
	//   35   57:invokeinterface #407 <Method Object List.get(int)>
	//   36   62:checkcast       #504 <Class MessageLite>
	//   37   65:invokestatic    #510 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   38   68:iadd            
	//   39   69:istore_1        

	//   40   70:iload_2         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:istore_2        
	//*  44   74:goto            37
		for(int k = 0; k < nestedType_.size(); k++)
	//*  45   77:iconst_0        
	//*  46   78:istore_2        
	//*  47   79:iload_2         
	//*  48   80:aload_0         
	//*  49   81:getfield        #118 <Field List nestedType_>
	//*  50   84:invokeinterface #411 <Method int List.size()>
	//*  51   89:icmpge          119
			i += CodedOutputStream.computeMessageSize(3, (MessageLite)nestedType_.get(k));
	//   52   92:iload_1         
	//   53   93:iconst_3        
	//   54   94:aload_0         
	//   55   95:getfield        #118 <Field List nestedType_>
	//   56   98:iload_2         
	//   57   99:invokeinterface #407 <Method Object List.get(int)>
	//   58  104:checkcast       #504 <Class MessageLite>
	//   59  107:invokestatic    #510 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   60  110:iadd            
	//   61  111:istore_1        

	//   62  112:iload_2         
	//   63  113:iconst_1        
	//   64  114:iadd            
	//   65  115:istore_2        
	//*  66  116:goto            79
		for(int l = 0; l < enumType_.size(); l++)
	//*  67  119:iconst_0        
	//*  68  120:istore_2        
	//*  69  121:iload_2         
	//*  70  122:aload_0         
	//*  71  123:getfield        #120 <Field List enumType_>
	//*  72  126:invokeinterface #411 <Method int List.size()>
	//*  73  131:icmpge          161
			i += CodedOutputStream.computeMessageSize(4, (MessageLite)enumType_.get(l));
	//   74  134:iload_1         
	//   75  135:iconst_4        
	//   76  136:aload_0         
	//   77  137:getfield        #120 <Field List enumType_>
	//   78  140:iload_2         
	//   79  141:invokeinterface #407 <Method Object List.get(int)>
	//   80  146:checkcast       #504 <Class MessageLite>
	//   81  149:invokestatic    #510 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   82  152:iadd            
	//   83  153:istore_1        

	//   84  154:iload_2         
	//   85  155:iconst_1        
	//   86  156:iadd            
	//   87  157:istore_2        
	//*  88  158:goto            121
		for(int i1 = 0; i1 < extensionRange_.size(); i1++)
	//*  89  161:iconst_0        
	//*  90  162:istore_2        
	//*  91  163:iload_2         
	//*  92  164:aload_0         
	//*  93  165:getfield        #122 <Field List extensionRange_>
	//*  94  168:invokeinterface #411 <Method int List.size()>
	//*  95  173:icmpge          203
			i += CodedOutputStream.computeMessageSize(5, (MessageLite)extensionRange_.get(i1));
	//   96  176:iload_1         
	//   97  177:iconst_5        
	//   98  178:aload_0         
	//   99  179:getfield        #122 <Field List extensionRange_>
	//  100  182:iload_2         
	//  101  183:invokeinterface #407 <Method Object List.get(int)>
	//  102  188:checkcast       #504 <Class MessageLite>
	//  103  191:invokestatic    #510 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  104  194:iadd            
	//  105  195:istore_1        

	//  106  196:iload_2         
	//  107  197:iconst_1        
	//  108  198:iadd            
	//  109  199:istore_2        
	//* 110  200:goto            163
		for(int j1 = 0; j1 < extension_.size(); j1++)
	//* 111  203:iconst_0        
	//* 112  204:istore_2        
	//* 113  205:iload_2         
	//* 114  206:aload_0         
	//* 115  207:getfield        #116 <Field List extension_>
	//* 116  210:invokeinterface #411 <Method int List.size()>
	//* 117  215:icmpge          246
			i += CodedOutputStream.computeMessageSize(6, (MessageLite)extension_.get(j1));
	//  118  218:iload_1         
	//  119  219:bipush          6
	//  120  221:aload_0         
	//  121  222:getfield        #116 <Field List extension_>
	//  122  225:iload_2         
	//  123  226:invokeinterface #407 <Method Object List.get(int)>
	//  124  231:checkcast       #504 <Class MessageLite>
	//  125  234:invokestatic    #510 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  126  237:iadd            
	//  127  238:istore_1        

	//  128  239:iload_2         
	//  129  240:iconst_1        
	//  130  241:iadd            
	//  131  242:istore_2        
	//* 132  243:goto            205
		int k1 = i;
	//  133  246:iload_1         
	//  134  247:istore_2        
		if((bitField0_ & 2) == 2)
	//* 135  248:aload_0         
	//* 136  249:getfield        #163 <Field int bitField0_>
	//* 137  252:iconst_2        
	//* 138  253:iand            
	//* 139  254:iconst_2        
	//* 140  255:icmpne          270
			k1 = i + CodedOutputStream.computeMessageSize(7, ((MessageLite) (getOptions())));
	//  141  258:iload_1         
	//  142  259:bipush          7
	//  143  261:aload_0         
	//  144  262:invokevirtual   #384 <Method DescriptorProtos$MessageOptions getOptions()>
	//  145  265:invokestatic    #510 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  146  268:iadd            
	//  147  269:istore_2        
		int j2 = 0;
	//  148  270:iconst_0        
	//  149  271:istore_3        
		i = k1;
	//  150  272:iload_2         
	//  151  273:istore_1        
		for(; j2 < oneofDecl_.size(); j2++)
	//* 152  274:iload_3         
	//* 153  275:aload_0         
	//* 154  276:getfield        #124 <Field List oneofDecl_>
	//* 155  279:invokeinterface #411 <Method int List.size()>
	//* 156  284:icmpge          315
			i += CodedOutputStream.computeMessageSize(8, (MessageLite)oneofDecl_.get(j2));
	//  157  287:iload_1         
	//  158  288:bipush          8
	//  159  290:aload_0         
	//  160  291:getfield        #124 <Field List oneofDecl_>
	//  161  294:iload_3         
	//  162  295:invokeinterface #407 <Method Object List.get(int)>
	//  163  300:checkcast       #504 <Class MessageLite>
	//  164  303:invokestatic    #510 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  165  306:iadd            
	//  166  307:istore_1        

	//  167  308:iload_3         
	//  168  309:iconst_1        
	//  169  310:iadd            
	//  170  311:istore_3        
	//* 171  312:goto            274
		for(int l1 = 0; l1 < reservedRange_.size(); l1++)
	//* 172  315:iconst_0        
	//* 173  316:istore_2        
	//* 174  317:iload_2         
	//* 175  318:aload_0         
	//* 176  319:getfield        #126 <Field List reservedRange_>
	//* 177  322:invokeinterface #411 <Method int List.size()>
	//* 178  327:icmpge          358
			i += CodedOutputStream.computeMessageSize(9, (MessageLite)reservedRange_.get(l1));
	//  179  330:iload_1         
	//  180  331:bipush          9
	//  181  333:aload_0         
	//  182  334:getfield        #126 <Field List reservedRange_>
	//  183  337:iload_2         
	//  184  338:invokeinterface #407 <Method Object List.get(int)>
	//  185  343:checkcast       #504 <Class MessageLite>
	//  186  346:invokestatic    #510 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//  187  349:iadd            
	//  188  350:istore_1        

	//  189  351:iload_2         
	//  190  352:iconst_1        
	//  191  353:iadd            
	//  192  354:istore_2        
	//* 193  355:goto            317
		j2 = 0;
	//  194  358:iconst_0        
	//  195  359:istore_3        
		for(int i2 = 0; i2 < reservedName_.size(); i2++)
	//* 196  360:iconst_0        
	//* 197  361:istore_2        
	//* 198  362:iload_2         
	//* 199  363:aload_0         
	//* 200  364:getfield        #133 <Field LazyStringList reservedName_>
	//* 201  367:invokeinterface #486 <Method int LazyStringList.size()>
	//* 202  372:icmpge          398
			j2 += computeStringSizeNoTag(reservedName_.getRaw(i2));
	//  203  375:iload_3         
	//  204  376:aload_0         
	//  205  377:getfield        #133 <Field LazyStringList reservedName_>
	//  206  380:iload_2         
	//  207  381:invokeinterface #513 <Method Object LazyStringList.getRaw(int)>
	//  208  386:invokestatic    #517 <Method int computeStringSizeNoTag(Object)>
	//  209  389:iadd            
	//  210  390:istore_3        

	//  211  391:iload_2         
	//  212  392:iconst_1        
	//  213  393:iadd            
	//  214  394:istore_2        
	//* 215  395:goto            362
		i = i + j2 + getReservedNameList().size() * 1 + unknownFields.getSerializedSize();
	//  216  398:iload_1         
	//  217  399:iload_3         
	//  218  400:iadd            
	//  219  401:aload_0         
	//  220  402:invokevirtual   #392 <Method ProtocolStringList getReservedNameList()>
	//  221  405:invokeinterface #520 <Method int ProtocolStringList.size()>
	//  222  410:iconst_1        
	//  223  411:imul            
	//  224  412:iadd            
	//  225  413:aload_0         
	//  226  414:getfield        #230 <Field UnknownFieldSet unknownFields>
	//  227  417:invokevirtual   #522 <Method int UnknownFieldSet.getSerializedSize()>
	//  228  420:iadd            
	//  229  421:istore_1        
		memoizedSize = i;
	//  230  422:aload_0         
	//  231  423:iload_1         
	//  232  424:putfield        #498 <Field int memoizedSize>
		return i;
	//  233  427:iload_1         
	//  234  428:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasName()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field int bitField0_>
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
	//    1    1:getfield        #163 <Field int bitField0_>
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
	//*   1    1:getfield        #527 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #527 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #529 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #531 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasName())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #352 <Method boolean hasName()>
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
	//   24   42:invokevirtual   #356 <Method String getName()>
	//   25   45:invokevirtual   #532 <Method int String.hashCode()>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(getFieldCount() > 0)
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #534 <Method int getFieldCount()>
	//*  32   56:ifle            79
			j = (i * 37 + 2) * 53 + getFieldList().hashCode();
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_2        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #362 <Method List getFieldList()>
	//   42   72:invokeinterface #535 <Method int List.hashCode()>
	//   43   77:iadd            
	//   44   78:istore_2        
		i = j;
	//   45   79:iload_2         
	//   46   80:istore_1        
		if(getExtensionCount() > 0)
	//*  47   81:aload_0         
	//*  48   82:invokevirtual   #537 <Method int getExtensionCount()>
	//*  49   85:ifle            109
			i = (j * 37 + 6) * 53 + getExtensionList().hashCode();
	//   50   88:iload_2         
	//   51   89:bipush          37
	//   52   91:imul            
	//   53   92:bipush          6
	//   54   94:iadd            
	//   55   95:bipush          53
	//   56   97:imul            
	//   57   98:aload_0         
	//   58   99:invokevirtual   #366 <Method List getExtensionList()>
	//   59  102:invokeinterface #535 <Method int List.hashCode()>
	//   60  107:iadd            
	//   61  108:istore_1        
		j = i;
	//   62  109:iload_1         
	//   63  110:istore_2        
		if(getNestedTypeCount() > 0)
	//*  64  111:aload_0         
	//*  65  112:invokevirtual   #539 <Method int getNestedTypeCount()>
	//*  66  115:ifle            138
			j = (i * 37 + 3) * 53 + getNestedTypeList().hashCode();
	//   67  118:iload_1         
	//   68  119:bipush          37
	//   69  121:imul            
	//   70  122:iconst_3        
	//   71  123:iadd            
	//   72  124:bipush          53
	//   73  126:imul            
	//   74  127:aload_0         
	//   75  128:invokevirtual   #369 <Method List getNestedTypeList()>
	//   76  131:invokeinterface #535 <Method int List.hashCode()>
	//   77  136:iadd            
	//   78  137:istore_2        
		i = j;
	//   79  138:iload_2         
	//   80  139:istore_1        
		if(getEnumTypeCount() > 0)
	//*  81  140:aload_0         
	//*  82  141:invokevirtual   #541 <Method int getEnumTypeCount()>
	//*  83  144:ifle            167
			i = (j * 37 + 4) * 53 + getEnumTypeList().hashCode();
	//   84  147:iload_2         
	//   85  148:bipush          37
	//   86  150:imul            
	//   87  151:iconst_4        
	//   88  152:iadd            
	//   89  153:bipush          53
	//   90  155:imul            
	//   91  156:aload_0         
	//   92  157:invokevirtual   #372 <Method List getEnumTypeList()>
	//   93  160:invokeinterface #535 <Method int List.hashCode()>
	//   94  165:iadd            
	//   95  166:istore_1        
		j = i;
	//   96  167:iload_1         
	//   97  168:istore_2        
		if(getExtensionRangeCount() > 0)
	//*  98  169:aload_0         
	//*  99  170:invokevirtual   #543 <Method int getExtensionRangeCount()>
	//* 100  173:ifle            196
			j = (i * 37 + 5) * 53 + getExtensionRangeList().hashCode();
	//  101  176:iload_1         
	//  102  177:bipush          37
	//  103  179:imul            
	//  104  180:iconst_5        
	//  105  181:iadd            
	//  106  182:bipush          53
	//  107  184:imul            
	//  108  185:aload_0         
	//  109  186:invokevirtual   #375 <Method List getExtensionRangeList()>
	//  110  189:invokeinterface #535 <Method int List.hashCode()>
	//  111  194:iadd            
	//  112  195:istore_2        
		i = j;
	//  113  196:iload_2         
	//  114  197:istore_1        
		if(getOneofDeclCount() > 0)
	//* 115  198:aload_0         
	//* 116  199:invokevirtual   #545 <Method int getOneofDeclCount()>
	//* 117  202:ifle            226
			i = (j * 37 + 8) * 53 + getOneofDeclList().hashCode();
	//  118  205:iload_2         
	//  119  206:bipush          37
	//  120  208:imul            
	//  121  209:bipush          8
	//  122  211:iadd            
	//  123  212:bipush          53
	//  124  214:imul            
	//  125  215:aload_0         
	//  126  216:invokevirtual   #378 <Method List getOneofDeclList()>
	//  127  219:invokeinterface #535 <Method int List.hashCode()>
	//  128  224:iadd            
	//  129  225:istore_1        
		j = i;
	//  130  226:iload_1         
	//  131  227:istore_2        
		if(hasOptions())
	//* 132  228:aload_0         
	//* 133  229:invokevirtual   #381 <Method boolean hasOptions()>
	//* 134  232:ifeq            254
			j = (i * 37 + 7) * 53 + getOptions().hashCode();
	//  135  235:iload_1         
	//  136  236:bipush          37
	//  137  238:imul            
	//  138  239:bipush          7
	//  139  241:iadd            
	//  140  242:bipush          53
	//  141  244:imul            
	//  142  245:aload_0         
	//  143  246:invokevirtual   #384 <Method DescriptorProtos$MessageOptions getOptions()>
	//  144  249:invokevirtual   #546 <Method int DescriptorProtos$MessageOptions.hashCode()>
	//  145  252:iadd            
	//  146  253:istore_2        
		i = j;
	//  147  254:iload_2         
	//  148  255:istore_1        
		if(getReservedRangeCount() > 0)
	//* 149  256:aload_0         
	//* 150  257:invokevirtual   #548 <Method int getReservedRangeCount()>
	//* 151  260:ifle            284
			i = (j * 37 + 9) * 53 + getReservedRangeList().hashCode();
	//  152  263:iload_2         
	//  153  264:bipush          37
	//  154  266:imul            
	//  155  267:bipush          9
	//  156  269:iadd            
	//  157  270:bipush          53
	//  158  272:imul            
	//  159  273:aload_0         
	//  160  274:invokevirtual   #388 <Method List getReservedRangeList()>
	//  161  277:invokeinterface #535 <Method int List.hashCode()>
	//  162  282:iadd            
	//  163  283:istore_1        
		j = i;
	//  164  284:iload_1         
	//  165  285:istore_2        
		if(getReservedNameCount() > 0)
	//* 166  286:aload_0         
	//* 167  287:invokevirtual   #550 <Method int getReservedNameCount()>
	//* 168  290:ifle            312
			j = (i * 37 + 10) * 53 + ((Object) (getReservedNameList())).hashCode();
	//  169  293:iload_1         
	//  170  294:bipush          37
	//  171  296:imul            
	//  172  297:bipush          10
	//  173  299:iadd            
	//  174  300:bipush          53
	//  175  302:imul            
	//  176  303:aload_0         
	//  177  304:invokevirtual   #392 <Method ProtocolStringList getReservedNameList()>
	//  178  307:invokevirtual   #531 <Method int Object.hashCode()>
	//  179  310:iadd            
	//  180  311:istore_2        
		i = j * 29 + unknownFields.hashCode();
	//  181  312:iload_2         
	//  182  313:bipush          29
	//  183  315:imul            
	//  184  316:aload_0         
	//  185  317:getfield        #230 <Field UnknownFieldSet unknownFields>
	//  186  320:invokevirtual   #551 <Method int UnknownFieldSet.hashCode()>
	//  187  323:iadd            
	//  188  324:istore_1        
		memoizedHashCode = i;
	//  189  325:aload_0         
	//  190  326:iload_1         
	//  191  327:putfield        #527 <Field int memoizedHashCode>
		return i;
	//  192  330:iload_1         
	//  193  331:ireturn         
	}

	protected able internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$2700().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$DescriptorProto, com/google/protobuf/DescriptorProtos$DescriptorProto$Builder);
	//    0    0:invokestatic    #556 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$2700()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$DescriptorProto>
	//    2    5:ldc1            #13  <Class DescriptorProtos$DescriptorProto$Builder>
	//    3    7:invokevirtual   #562 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field byte memoizedIsInitialized>
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
		for(int i = 0; i < getFieldCount(); i++)
	//*  12   18:iconst_0        
	//*  13   19:istore_1        
	//*  14   20:iload_1         
	//*  15   21:aload_0         
	//*  16   22:invokevirtual   #534 <Method int getFieldCount()>
	//*  17   25:icmpge          53
			if(!getField(i).isInitialized())
	//*  18   28:aload_0         
	//*  19   29:iload_1         
	//*  20   30:invokevirtual   #565 <Method DescriptorProtos$FieldDescriptorProto getField(int)>
	//*  21   33:invokevirtual   #567 <Method boolean DescriptorProtos$FieldDescriptorProto.isInitialized()>
	//*  22   36:ifne            46
			{
				memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #102 <Field byte memoizedIsInitialized>
				return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
			}

	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_1        
	//*  32   50:goto            20
		for(int j = 0; j < getExtensionCount(); j++)
	//*  33   53:iconst_0        
	//*  34   54:istore_1        
	//*  35   55:iload_1         
	//*  36   56:aload_0         
	//*  37   57:invokevirtual   #537 <Method int getExtensionCount()>
	//*  38   60:icmpge          88
			if(!getExtension(j).isInitialized())
	//*  39   63:aload_0         
	//*  40   64:iload_1         
	//*  41   65:invokevirtual   #569 <Method DescriptorProtos$FieldDescriptorProto getExtension(int)>
	//*  42   68:invokevirtual   #567 <Method boolean DescriptorProtos$FieldDescriptorProto.isInitialized()>
	//*  43   71:ifne            81
			{
				memoizedIsInitialized = 0;
	//   44   74:aload_0         
	//   45   75:iconst_0        
	//   46   76:putfield        #102 <Field byte memoizedIsInitialized>
				return false;
	//   47   79:iconst_0        
	//   48   80:ireturn         
			}

	//   49   81:iload_1         
	//   50   82:iconst_1        
	//   51   83:iadd            
	//   52   84:istore_1        
	//*  53   85:goto            55
		for(int k = 0; k < getNestedTypeCount(); k++)
	//*  54   88:iconst_0        
	//*  55   89:istore_1        
	//*  56   90:iload_1         
	//*  57   91:aload_0         
	//*  58   92:invokevirtual   #539 <Method int getNestedTypeCount()>
	//*  59   95:icmpge          123
			if(!getNestedType(k).isInitialized())
	//*  60   98:aload_0         
	//*  61   99:iload_1         
	//*  62  100:invokevirtual   #571 <Method DescriptorProtos$DescriptorProto getNestedType(int)>
	//*  63  103:invokevirtual   #572 <Method boolean isInitialized()>
	//*  64  106:ifne            116
			{
				memoizedIsInitialized = 0;
	//   65  109:aload_0         
	//   66  110:iconst_0        
	//   67  111:putfield        #102 <Field byte memoizedIsInitialized>
				return false;
	//   68  114:iconst_0        
	//   69  115:ireturn         
			}

	//   70  116:iload_1         
	//   71  117:iconst_1        
	//   72  118:iadd            
	//   73  119:istore_1        
	//*  74  120:goto            90
		for(int l = 0; l < getEnumTypeCount(); l++)
	//*  75  123:iconst_0        
	//*  76  124:istore_1        
	//*  77  125:iload_1         
	//*  78  126:aload_0         
	//*  79  127:invokevirtual   #541 <Method int getEnumTypeCount()>
	//*  80  130:icmpge          158
			if(!getEnumType(l).isInitialized())
	//*  81  133:aload_0         
	//*  82  134:iload_1         
	//*  83  135:invokevirtual   #574 <Method DescriptorProtos$EnumDescriptorProto getEnumType(int)>
	//*  84  138:invokevirtual   #575 <Method boolean DescriptorProtos$EnumDescriptorProto.isInitialized()>
	//*  85  141:ifne            151
			{
				memoizedIsInitialized = 0;
	//   86  144:aload_0         
	//   87  145:iconst_0        
	//   88  146:putfield        #102 <Field byte memoizedIsInitialized>
				return false;
	//   89  149:iconst_0        
	//   90  150:ireturn         
			}

	//   91  151:iload_1         
	//   92  152:iconst_1        
	//   93  153:iadd            
	//   94  154:istore_1        
	//*  95  155:goto            125
		for(int i1 = 0; i1 < getExtensionRangeCount(); i1++)
	//*  96  158:iconst_0        
	//*  97  159:istore_1        
	//*  98  160:iload_1         
	//*  99  161:aload_0         
	//* 100  162:invokevirtual   #543 <Method int getExtensionRangeCount()>
	//* 101  165:icmpge          193
			if(!getExtensionRange(i1).isInitialized())
	//* 102  168:aload_0         
	//* 103  169:iload_1         
	//* 104  170:invokevirtual   #577 <Method DescriptorProtos$DescriptorProto$ExtensionRange getExtensionRange(int)>
	//* 105  173:invokevirtual   #578 <Method boolean DescriptorProtos$DescriptorProto$ExtensionRange.isInitialized()>
	//* 106  176:ifne            186
			{
				memoizedIsInitialized = 0;
	//  107  179:aload_0         
	//  108  180:iconst_0        
	//  109  181:putfield        #102 <Field byte memoizedIsInitialized>
				return false;
	//  110  184:iconst_0        
	//  111  185:ireturn         
			}

	//  112  186:iload_1         
	//  113  187:iconst_1        
	//  114  188:iadd            
	//  115  189:istore_1        
	//* 116  190:goto            160
		for(int j1 = 0; j1 < getOneofDeclCount(); j1++)
	//* 117  193:iconst_0        
	//* 118  194:istore_1        
	//* 119  195:iload_1         
	//* 120  196:aload_0         
	//* 121  197:invokevirtual   #545 <Method int getOneofDeclCount()>
	//* 122  200:icmpge          228
			if(!getOneofDecl(j1).isInitialized())
	//* 123  203:aload_0         
	//* 124  204:iload_1         
	//* 125  205:invokevirtual   #580 <Method DescriptorProtos$OneofDescriptorProto getOneofDecl(int)>
	//* 126  208:invokevirtual   #581 <Method boolean DescriptorProtos$OneofDescriptorProto.isInitialized()>
	//* 127  211:ifne            221
			{
				memoizedIsInitialized = 0;
	//  128  214:aload_0         
	//  129  215:iconst_0        
	//  130  216:putfield        #102 <Field byte memoizedIsInitialized>
				return false;
	//  131  219:iconst_0        
	//  132  220:ireturn         
			}

	//  133  221:iload_1         
	//  134  222:iconst_1        
	//  135  223:iadd            
	//  136  224:istore_1        
	//* 137  225:goto            195
		if(hasOptions() && !getOptions().isInitialized())
	//* 138  228:aload_0         
	//* 139  229:invokevirtual   #381 <Method boolean hasOptions()>
	//* 140  232:ifeq            252
	//* 141  235:aload_0         
	//* 142  236:invokevirtual   #384 <Method DescriptorProtos$MessageOptions getOptions()>
	//* 143  239:invokevirtual   #582 <Method boolean DescriptorProtos$MessageOptions.isInitialized()>
	//* 144  242:ifne            252
		{
			memoizedIsInitialized = 0;
	//  145  245:aload_0         
	//  146  246:iconst_0        
	//  147  247:putfield        #102 <Field byte memoizedIsInitialized>
			return false;
	//  148  250:iconst_0        
	//  149  251:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//  150  252:aload_0         
	//  151  253:iconst_1        
	//  152  254:putfield        #102 <Field byte memoizedIsInitialized>
			return true;
	//  153  257:iconst_1        
	//  154  258:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #585 <Method DescriptorProtos$DescriptorProto$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3$BuilderParent generatedmessagev3$builderparent)
	{
		return new Builder(generatedmessagev3$builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #13  <Class DescriptorProtos$DescriptorProto$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #589 <Method void DescriptorProtos$DescriptorProto$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #592 <Method DescriptorProtos$DescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3$BuilderParent generatedmessagev3$builderparent)
	{
		return ((Message.Builder) (newBuilderForType(generatedmessagev3$builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #595 <Method DescriptorProtos$DescriptorProto$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #592 <Method DescriptorProtos$DescriptorProto$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #95  <Field DescriptorProtos$DescriptorProto DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #13  <Class DescriptorProtos$DescriptorProto$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #599 <Method void DescriptorProtos$DescriptorProto$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #13  <Class DescriptorProtos$DescriptorProto$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #599 <Method void DescriptorProtos$DescriptorProto$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #292 <Method DescriptorProtos$DescriptorProto$Builder DescriptorProtos$DescriptorProto$Builder.mergeFrom(DescriptorProtos$DescriptorProto)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #289 <Method DescriptorProtos$DescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #289 <Method DescriptorProtos$DescriptorProto$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			GeneratedMessageV3.writeString(codedoutputstream, 1, name_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #106 <Field Object name_>
	//   10   16:invokestatic    #605 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		for(int i = 0; i < field_.size(); i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:aload_0         
	//*  15   23:getfield        #114 <Field List field_>
	//*  16   26:invokeinterface #411 <Method int List.size()>
	//*  17   31:icmpge          59
			codedoutputstream.writeMessage(2, (MessageLite)field_.get(i));
	//   18   34:aload_1         
	//   19   35:iconst_2        
	//   20   36:aload_0         
	//   21   37:getfield        #114 <Field List field_>
	//   22   40:iload_2         
	//   23   41:invokeinterface #407 <Method Object List.get(int)>
	//   24   46:checkcast       #504 <Class MessageLite>
	//   25   49:invokevirtual   #609 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   26   52:iload_2         
	//   27   53:iconst_1        
	//   28   54:iadd            
	//   29   55:istore_2        
	//*  30   56:goto            21
		for(int j = 0; j < nestedType_.size(); j++)
	//*  31   59:iconst_0        
	//*  32   60:istore_2        
	//*  33   61:iload_2         
	//*  34   62:aload_0         
	//*  35   63:getfield        #118 <Field List nestedType_>
	//*  36   66:invokeinterface #411 <Method int List.size()>
	//*  37   71:icmpge          99
			codedoutputstream.writeMessage(3, (MessageLite)nestedType_.get(j));
	//   38   74:aload_1         
	//   39   75:iconst_3        
	//   40   76:aload_0         
	//   41   77:getfield        #118 <Field List nestedType_>
	//   42   80:iload_2         
	//   43   81:invokeinterface #407 <Method Object List.get(int)>
	//   44   86:checkcast       #504 <Class MessageLite>
	//   45   89:invokevirtual   #609 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   46   92:iload_2         
	//   47   93:iconst_1        
	//   48   94:iadd            
	//   49   95:istore_2        
	//*  50   96:goto            61
		for(int k = 0; k < enumType_.size(); k++)
	//*  51   99:iconst_0        
	//*  52  100:istore_2        
	//*  53  101:iload_2         
	//*  54  102:aload_0         
	//*  55  103:getfield        #120 <Field List enumType_>
	//*  56  106:invokeinterface #411 <Method int List.size()>
	//*  57  111:icmpge          139
			codedoutputstream.writeMessage(4, (MessageLite)enumType_.get(k));
	//   58  114:aload_1         
	//   59  115:iconst_4        
	//   60  116:aload_0         
	//   61  117:getfield        #120 <Field List enumType_>
	//   62  120:iload_2         
	//   63  121:invokeinterface #407 <Method Object List.get(int)>
	//   64  126:checkcast       #504 <Class MessageLite>
	//   65  129:invokevirtual   #609 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   66  132:iload_2         
	//   67  133:iconst_1        
	//   68  134:iadd            
	//   69  135:istore_2        
	//*  70  136:goto            101
		for(int l = 0; l < extensionRange_.size(); l++)
	//*  71  139:iconst_0        
	//*  72  140:istore_2        
	//*  73  141:iload_2         
	//*  74  142:aload_0         
	//*  75  143:getfield        #122 <Field List extensionRange_>
	//*  76  146:invokeinterface #411 <Method int List.size()>
	//*  77  151:icmpge          179
			codedoutputstream.writeMessage(5, (MessageLite)extensionRange_.get(l));
	//   78  154:aload_1         
	//   79  155:iconst_5        
	//   80  156:aload_0         
	//   81  157:getfield        #122 <Field List extensionRange_>
	//   82  160:iload_2         
	//   83  161:invokeinterface #407 <Method Object List.get(int)>
	//   84  166:checkcast       #504 <Class MessageLite>
	//   85  169:invokevirtual   #609 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   86  172:iload_2         
	//   87  173:iconst_1        
	//   88  174:iadd            
	//   89  175:istore_2        
	//*  90  176:goto            141
		for(int i1 = 0; i1 < extension_.size(); i1++)
	//*  91  179:iconst_0        
	//*  92  180:istore_2        
	//*  93  181:iload_2         
	//*  94  182:aload_0         
	//*  95  183:getfield        #116 <Field List extension_>
	//*  96  186:invokeinterface #411 <Method int List.size()>
	//*  97  191:icmpge          220
			codedoutputstream.writeMessage(6, (MessageLite)extension_.get(i1));
	//   98  194:aload_1         
	//   99  195:bipush          6
	//  100  197:aload_0         
	//  101  198:getfield        #116 <Field List extension_>
	//  102  201:iload_2         
	//  103  202:invokeinterface #407 <Method Object List.get(int)>
	//  104  207:checkcast       #504 <Class MessageLite>
	//  105  210:invokevirtual   #609 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//  106  213:iload_2         
	//  107  214:iconst_1        
	//  108  215:iadd            
	//  109  216:istore_2        
	//* 110  217:goto            181
		if((bitField0_ & 2) == 2)
	//* 111  220:aload_0         
	//* 112  221:getfield        #163 <Field int bitField0_>
	//* 113  224:iconst_2        
	//* 114  225:iand            
	//* 115  226:iconst_2        
	//* 116  227:icmpne          240
			codedoutputstream.writeMessage(7, ((MessageLite) (getOptions())));
	//  117  230:aload_1         
	//  118  231:bipush          7
	//  119  233:aload_0         
	//  120  234:invokevirtual   #384 <Method DescriptorProtos$MessageOptions getOptions()>
	//  121  237:invokevirtual   #609 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		for(int j1 = 0; j1 < oneofDecl_.size(); j1++)
	//* 122  240:iconst_0        
	//* 123  241:istore_2        
	//* 124  242:iload_2         
	//* 125  243:aload_0         
	//* 126  244:getfield        #124 <Field List oneofDecl_>
	//* 127  247:invokeinterface #411 <Method int List.size()>
	//* 128  252:icmpge          281
			codedoutputstream.writeMessage(8, (MessageLite)oneofDecl_.get(j1));
	//  129  255:aload_1         
	//  130  256:bipush          8
	//  131  258:aload_0         
	//  132  259:getfield        #124 <Field List oneofDecl_>
	//  133  262:iload_2         
	//  134  263:invokeinterface #407 <Method Object List.get(int)>
	//  135  268:checkcast       #504 <Class MessageLite>
	//  136  271:invokevirtual   #609 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//  137  274:iload_2         
	//  138  275:iconst_1        
	//  139  276:iadd            
	//  140  277:istore_2        
	//* 141  278:goto            242
		for(int k1 = 0; k1 < reservedRange_.size(); k1++)
	//* 142  281:iconst_0        
	//* 143  282:istore_2        
	//* 144  283:iload_2         
	//* 145  284:aload_0         
	//* 146  285:getfield        #126 <Field List reservedRange_>
	//* 147  288:invokeinterface #411 <Method int List.size()>
	//* 148  293:icmpge          322
			codedoutputstream.writeMessage(9, (MessageLite)reservedRange_.get(k1));
	//  149  296:aload_1         
	//  150  297:bipush          9
	//  151  299:aload_0         
	//  152  300:getfield        #126 <Field List reservedRange_>
	//  153  303:iload_2         
	//  154  304:invokeinterface #407 <Method Object List.get(int)>
	//  155  309:checkcast       #504 <Class MessageLite>
	//  156  312:invokevirtual   #609 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//  157  315:iload_2         
	//  158  316:iconst_1        
	//  159  317:iadd            
	//  160  318:istore_2        
	//* 161  319:goto            283
		for(int l1 = 0; l1 < reservedName_.size(); l1++)
	//* 162  322:iconst_0        
	//* 163  323:istore_2        
	//* 164  324:iload_2         
	//* 165  325:aload_0         
	//* 166  326:getfield        #133 <Field LazyStringList reservedName_>
	//* 167  329:invokeinterface #486 <Method int LazyStringList.size()>
	//* 168  334:icmpge          360
			GeneratedMessageV3.writeString(codedoutputstream, 10, reservedName_.getRaw(l1));
	//  169  337:aload_1         
	//  170  338:bipush          10
	//  171  340:aload_0         
	//  172  341:getfield        #133 <Field LazyStringList reservedName_>
	//  173  344:iload_2         
	//  174  345:invokeinterface #513 <Method Object LazyStringList.getRaw(int)>
	//  175  350:invokestatic    #605 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>

	//  176  353:iload_2         
	//  177  354:iconst_1        
	//  178  355:iadd            
	//  179  356:istore_2        
	//* 180  357:goto            324
		unknownFields.writeTo(codedoutputstream);
	//  181  360:aload_0         
	//  182  361:getfield        #230 <Field UnknownFieldSet unknownFields>
	//  183  364:aload_1         
	//  184  365:invokevirtual   #611 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//  185  368:return          
	}

	private static final DescriptorProtos$DescriptorProto DEFAULT_INSTANCE = new DescriptorProtos$DescriptorProto();
	public static final int ENUM_TYPE_FIELD_NUMBER = 4;
	public static final int EXTENSION_FIELD_NUMBER = 6;
	public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
	public static final int FIELD_FIELD_NUMBER = 2;
	public static final int NAME_FIELD_NUMBER = 1;
	public static final int NESTED_TYPE_FIELD_NUMBER = 3;
	public static final int ONEOF_DECL_FIELD_NUMBER = 8;
	public static final int OPTIONS_FIELD_NUMBER = 7;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.DescriptorProto parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.DescriptorProto(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$DescriptorProto>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #22  <Method void DescriptorProtos$DescriptorProto(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method DescriptorProtos$DescriptorProto parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	public static final int RESERVED_NAME_FIELD_NUMBER = 10;
	public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private List enumType_;
	private List extensionRange_;
	private List extension_;
	private List field_;
	private byte memoizedIsInitialized;
	private volatile Object name_;
	private List nestedType_;
	private List oneofDecl_;
	private DescriptorProtos.MessageOptions options_;
	private LazyStringList reservedName_;
	private List reservedRange_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$DescriptorProto>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void DescriptorProtos$DescriptorProto()>
	//    3    7:putstatic       #95  <Field DescriptorProtos$DescriptorProto DEFAULT_INSTANCE>
	//    4   10:new             #11  <Class DescriptorProtos$DescriptorProto$1>
	//    5   13:dup             
	//    6   14:invokespecial   #96  <Method void DescriptorProtos$DescriptorProto$1()>
	//    7   17:putstatic       #98  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$5000(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return descriptorprotos$descriptorproto.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Object name_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$5002(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, Object obj)
	{
		descriptorprotos$descriptorproto.name_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field Object name_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$5100(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return descriptorprotos$descriptorproto.field_;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field List field_>
	//    2    4:areturn         
	}

*/


/*
	static List access$5102(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, List list)
	{
		descriptorprotos$descriptorproto.field_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #114 <Field List field_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$5200(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return descriptorprotos$descriptorproto.extension_;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field List extension_>
	//    2    4:areturn         
	}

*/


/*
	static List access$5202(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, List list)
	{
		descriptorprotos$descriptorproto.extension_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field List extension_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$5300(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return descriptorprotos$descriptorproto.nestedType_;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field List nestedType_>
	//    2    4:areturn         
	}

*/


/*
	static List access$5302(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, List list)
	{
		descriptorprotos$descriptorproto.nestedType_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field List nestedType_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$5400(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return descriptorprotos$descriptorproto.enumType_;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List enumType_>
	//    2    4:areturn         
	}

*/


/*
	static List access$5402(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, List list)
	{
		descriptorprotos$descriptorproto.enumType_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field List enumType_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$5500(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return descriptorprotos$descriptorproto.extensionRange_;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field List extensionRange_>
	//    2    4:areturn         
	}

*/


/*
	static List access$5502(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, List list)
	{
		descriptorprotos$descriptorproto.extensionRange_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field List extensionRange_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$5600(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return descriptorprotos$descriptorproto.oneofDecl_;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field List oneofDecl_>
	//    2    4:areturn         
	}

*/


/*
	static List access$5602(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, List list)
	{
		descriptorprotos$descriptorproto.oneofDecl_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field List oneofDecl_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static DescriptorProtos.MessageOptions access$5702(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, DescriptorProtos.MessageOptions messageoptions)
	{
		descriptorprotos$descriptorproto.options_ = messageoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #185 <Field DescriptorProtos$MessageOptions options_>
		return messageoptions;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$5800(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return descriptorprotos$descriptorproto.reservedRange_;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field List reservedRange_>
	//    2    4:areturn         
	}

*/


/*
	static List access$5802(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, List list)
	{
		descriptorprotos$descriptorproto.reservedRange_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #126 <Field List reservedRange_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static LazyStringList access$5900(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto)
	{
		return descriptorprotos$descriptorproto.reservedName_;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field LazyStringList reservedName_>
	//    2    4:areturn         
	}

*/


/*
	static LazyStringList access$5902(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, LazyStringList lazystringlist)
	{
		descriptorprotos$descriptorproto.reservedName_ = lazystringlist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #133 <Field LazyStringList reservedName_>
		return lazystringlist;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$6002(DescriptorProtos$DescriptorProto descriptorprotos$descriptorproto, int i)
	{
		descriptorprotos$descriptorproto.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #163 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$DescriptorProto()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #102 <Field byte memoizedIsInitialized>
		name_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #104 <String "">
	//    7   12:putfield        #106 <Field Object name_>
		field_ = Collections.emptyList();
	//    8   15:aload_0         
	//    9   16:invokestatic    #112 <Method List Collections.emptyList()>
	//   10   19:putfield        #114 <Field List field_>
		extension_ = Collections.emptyList();
	//   11   22:aload_0         
	//   12   23:invokestatic    #112 <Method List Collections.emptyList()>
	//   13   26:putfield        #116 <Field List extension_>
		nestedType_ = Collections.emptyList();
	//   14   29:aload_0         
	//   15   30:invokestatic    #112 <Method List Collections.emptyList()>
	//   16   33:putfield        #118 <Field List nestedType_>
		enumType_ = Collections.emptyList();
	//   17   36:aload_0         
	//   18   37:invokestatic    #112 <Method List Collections.emptyList()>
	//   19   40:putfield        #120 <Field List enumType_>
		extensionRange_ = Collections.emptyList();
	//   20   43:aload_0         
	//   21   44:invokestatic    #112 <Method List Collections.emptyList()>
	//   22   47:putfield        #122 <Field List extensionRange_>
		oneofDecl_ = Collections.emptyList();
	//   23   50:aload_0         
	//   24   51:invokestatic    #112 <Method List Collections.emptyList()>
	//   25   54:putfield        #124 <Field List oneofDecl_>
		reservedRange_ = Collections.emptyList();
	//   26   57:aload_0         
	//   27   58:invokestatic    #112 <Method List Collections.emptyList()>
	//   28   61:putfield        #126 <Field List reservedRange_>
		reservedName_ = LazyStringArrayList.EMPTY;
	//   29   64:aload_0         
	//   30   65:getstatic       #131 <Field LazyStringList LazyStringArrayList.EMPTY>
	//   31   68:putfield        #133 <Field LazyStringList reservedName_>
	//   32   71:return          
	}

	private DescriptorProtos$DescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void DescriptorProtos$DescriptorProto()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #140 <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #141 <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #147 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          11
		flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          8
_L35:
		int j;
		int k;
		int l;
		if(flag)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           8
	//   15   28:ifne            947
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
	//   23   41:invokevirtual   #153 <Method int CodedInputStream.readTag()>
	//   24   44:istore          9
		j1;
	//   25   46:iload           9
		JVM INSTR lookupswitch 11: default 1338
	//	               0: 1341
	//	               10: 182
	//	               18: 237
	//	               26: 305
	//	               34: 376
	//	               42: 447
	//	               50: 518
	//	               58: 586
	//	               66: 717
	//	               74: 788
	//	               82: 862;
	//   26   48:lookupswitch    11: default 1338
	//	               0: 1341
	//	               10: 182
	//	               18: 237
	//	               26: 305
	//	               34: 376
	//	               42: 447
	//	               50: 518
	//	               58: 586
	//	               66: 717
	//	               74: 788
	//	               82: 862
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
		int i1;
		i1 = i;
	//   27  148:iload_3         
	//   28  149:istore          7
		k = i;
	//   29  151:iload_3         
	//   30  152:istore          5
		l = i;
	//   31  154:iload_3         
	//   32  155:istore          6
		j = i;
	//   33  157:iload_3         
	//   34  158:istore          4
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, j1))
	//*  35  160:aload_0         
	//*  36  161:aload_1         
	//*  37  162:aload           11
	//*  38  164:aload_2         
	//*  39  165:iload           9
	//*  40  167:invokevirtual   #157 <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  41  170:ifne            941
		{
			flag = true;
	//   42  173:iconst_1        
	//   43  174:istore          8
			i1 = i;
	//   44  176:iload_3         
	//   45  177:istore          7
		}
		  goto _L13
	//*  46  179:goto            941
_L3:
		k = i;
	//   47  182:iload_3         
	//   48  183:istore          5
		l = i;
	//   49  185:iload_3         
	//   50  186:istore          6
		j = i;
	//   51  188:iload_3         
	//   52  189:istore          4
		Object obj = ((Object) (codedinputstream.readBytes()));
	//   53  191:aload_1         
	//   54  192:invokevirtual   #161 <Method ByteString CodedInputStream.readBytes()>
	//   55  195:astore          10
		k = i;
	//   56  197:iload_3         
	//   57  198:istore          5
		l = i;
	//   58  200:iload_3         
	//   59  201:istore          6
		j = i;
	//   60  203:iload_3         
	//   61  204:istore          4
		bitField0_ = bitField0_ | 1;
	//   62  206:aload_0         
	//   63  207:aload_0         
	//   64  208:getfield        #163 <Field int bitField0_>
	//   65  211:iconst_1        
	//   66  212:ior             
	//   67  213:putfield        #163 <Field int bitField0_>
		k = i;
	//   68  216:iload_3         
	//   69  217:istore          5
		l = i;
	//   70  219:iload_3         
	//   71  220:istore          6
		j = i;
	//   72  222:iload_3         
	//   73  223:istore          4
		name_ = obj;
	//   74  225:aload_0         
	//   75  226:aload           10
	//   76  228:putfield        #106 <Field Object name_>
		i1 = i;
	//   77  231:iload_3         
	//   78  232:istore          7
		  goto _L13
	//*  79  234:goto            941
_L4:
		i1 = i;
	//   80  237:iload_3         
	//   81  238:istore          7
		if((i & 2) == 2) goto _L15; else goto _L14
	//   82  240:iload_3         
	//   83  241:iconst_2        
	//   84  242:iand            
	//   85  243:iconst_2        
	//   86  244:icmpeq          272
_L14:
		k = i;
	//   87  247:iload_3         
	//   88  248:istore          5
		l = i;
	//   89  250:iload_3         
	//   90  251:istore          6
		j = i;
	//   91  253:iload_3         
	//   92  254:istore          4
		field_ = ((List) (new ArrayList()));
	//   93  256:aload_0         
	//   94  257:new             #165 <Class ArrayList>
	//   95  260:dup             
	//   96  261:invokespecial   #166 <Method void ArrayList()>
	//   97  264:putfield        #114 <Field List field_>
		i1 = i | 2;
	//   98  267:iload_3         
	//   99  268:iconst_2        
	//  100  269:ior             
	//  101  270:istore          7
_L15:
		k = i1;
	//  102  272:iload           7
	//  103  274:istore          5
		l = i1;
	//  104  276:iload           7
	//  105  278:istore          6
		j = i1;
	//  106  280:iload           7
	//  107  282:istore          4
		field_.add(((Object) (codedinputstream.readMessage(roto.PARSER, extensionregistrylite))));
	//  108  284:aload_0         
	//  109  285:getfield        #114 <Field List field_>
	//  110  288:aload_1         
	//  111  289:getstatic       #169 <Field Parser DescriptorProtos$FieldDescriptorProto.PARSER>
	//  112  292:aload_2         
	//  113  293:invokevirtual   #173 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  114  296:invokeinterface #179 <Method boolean List.add(Object)>
	//  115  301:pop             
		  goto _L13
	//* 116  302:goto            941
_L5:
		i1 = i;
	//  117  305:iload_3         
	//  118  306:istore          7
		if((i & 8) == 8) goto _L17; else goto _L16
	//  119  308:iload_3         
	//  120  309:bipush          8
	//  121  311:iand            
	//  122  312:bipush          8
	//  123  314:icmpeq          343
_L16:
		k = i;
	//  124  317:iload_3         
	//  125  318:istore          5
		l = i;
	//  126  320:iload_3         
	//  127  321:istore          6
		j = i;
	//  128  323:iload_3         
	//  129  324:istore          4
		nestedType_ = ((List) (new ArrayList()));
	//  130  326:aload_0         
	//  131  327:new             #165 <Class ArrayList>
	//  132  330:dup             
	//  133  331:invokespecial   #166 <Method void ArrayList()>
	//  134  334:putfield        #118 <Field List nestedType_>
		i1 = i | 8;
	//  135  337:iload_3         
	//  136  338:bipush          8
	//  137  340:ior             
	//  138  341:istore          7
_L17:
		k = i1;
	//  139  343:iload           7
	//  140  345:istore          5
		l = i1;
	//  141  347:iload           7
	//  142  349:istore          6
		j = i1;
	//  143  351:iload           7
	//  144  353:istore          4
		nestedType_.add(((Object) (codedinputstream.readMessage(PARSER, extensionregistrylite))));
	//  145  355:aload_0         
	//  146  356:getfield        #118 <Field List nestedType_>
	//  147  359:aload_1         
	//  148  360:getstatic       #98  <Field Parser PARSER>
	//  149  363:aload_2         
	//  150  364:invokevirtual   #173 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  151  367:invokeinterface #179 <Method boolean List.add(Object)>
	//  152  372:pop             
		  goto _L13
	//* 153  373:goto            941
_L6:
		i1 = i;
	//  154  376:iload_3         
	//  155  377:istore          7
		if((i & 0x10) == 16) goto _L19; else goto _L18
	//  156  379:iload_3         
	//  157  380:bipush          16
	//  158  382:iand            
	//  159  383:bipush          16
	//  160  385:icmpeq          414
_L18:
		k = i;
	//  161  388:iload_3         
	//  162  389:istore          5
		l = i;
	//  163  391:iload_3         
	//  164  392:istore          6
		j = i;
	//  165  394:iload_3         
	//  166  395:istore          4
		enumType_ = ((List) (new ArrayList()));
	//  167  397:aload_0         
	//  168  398:new             #165 <Class ArrayList>
	//  169  401:dup             
	//  170  402:invokespecial   #166 <Method void ArrayList()>
	//  171  405:putfield        #120 <Field List enumType_>
		i1 = i | 0x10;
	//  172  408:iload_3         
	//  173  409:bipush          16
	//  174  411:ior             
	//  175  412:istore          7
_L19:
		k = i1;
	//  176  414:iload           7
	//  177  416:istore          5
		l = i1;
	//  178  418:iload           7
	//  179  420:istore          6
		j = i1;
	//  180  422:iload           7
	//  181  424:istore          4
		enumType_.add(((Object) (codedinputstream.readMessage(oto.PARSER, extensionregistrylite))));
	//  182  426:aload_0         
	//  183  427:getfield        #120 <Field List enumType_>
	//  184  430:aload_1         
	//  185  431:getstatic       #182 <Field Parser DescriptorProtos$EnumDescriptorProto.PARSER>
	//  186  434:aload_2         
	//  187  435:invokevirtual   #173 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  188  438:invokeinterface #179 <Method boolean List.add(Object)>
	//  189  443:pop             
		  goto _L13
	//* 190  444:goto            941
_L7:
		i1 = i;
	//  191  447:iload_3         
	//  192  448:istore          7
		if((i & 0x20) == 32) goto _L21; else goto _L20
	//  193  450:iload_3         
	//  194  451:bipush          32
	//  195  453:iand            
	//  196  454:bipush          32
	//  197  456:icmpeq          485
_L20:
		k = i;
	//  198  459:iload_3         
	//  199  460:istore          5
		l = i;
	//  200  462:iload_3         
	//  201  463:istore          6
		j = i;
	//  202  465:iload_3         
	//  203  466:istore          4
		extensionRange_ = ((List) (new ArrayList()));
	//  204  468:aload_0         
	//  205  469:new             #165 <Class ArrayList>
	//  206  472:dup             
	//  207  473:invokespecial   #166 <Method void ArrayList()>
	//  208  476:putfield        #122 <Field List extensionRange_>
		i1 = i | 0x20;
	//  209  479:iload_3         
	//  210  480:bipush          32
	//  211  482:ior             
	//  212  483:istore          7
_L21:
		k = i1;
	//  213  485:iload           7
	//  214  487:istore          5
		l = i1;
	//  215  489:iload           7
	//  216  491:istore          6
		j = i1;
	//  217  493:iload           7
	//  218  495:istore          4
		extensionRange_.add(((Object) (codedinputstream.readMessage(ExtensionRange.PARSER, extensionregistrylite))));
	//  219  497:aload_0         
	//  220  498:getfield        #122 <Field List extensionRange_>
	//  221  501:aload_1         
	//  222  502:getstatic       #183 <Field Parser DescriptorProtos$DescriptorProto$ExtensionRange.PARSER>
	//  223  505:aload_2         
	//  224  506:invokevirtual   #173 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  225  509:invokeinterface #179 <Method boolean List.add(Object)>
	//  226  514:pop             
		  goto _L13
	//* 227  515:goto            941
_L8:
		i1 = i;
	//  228  518:iload_3         
	//  229  519:istore          7
		if((i & 4) == 4) goto _L23; else goto _L22
	//  230  521:iload_3         
	//  231  522:iconst_4        
	//  232  523:iand            
	//  233  524:iconst_4        
	//  234  525:icmpeq          553
_L22:
		k = i;
	//  235  528:iload_3         
	//  236  529:istore          5
		l = i;
	//  237  531:iload_3         
	//  238  532:istore          6
		j = i;
	//  239  534:iload_3         
	//  240  535:istore          4
		extension_ = ((List) (new ArrayList()));
	//  241  537:aload_0         
	//  242  538:new             #165 <Class ArrayList>
	//  243  541:dup             
	//  244  542:invokespecial   #166 <Method void ArrayList()>
	//  245  545:putfield        #116 <Field List extension_>
		i1 = i | 4;
	//  246  548:iload_3         
	//  247  549:iconst_4        
	//  248  550:ior             
	//  249  551:istore          7
_L23:
		k = i1;
	//  250  553:iload           7
	//  251  555:istore          5
		l = i1;
	//  252  557:iload           7
	//  253  559:istore          6
		j = i1;
	//  254  561:iload           7
	//  255  563:istore          4
		extension_.add(((Object) (codedinputstream.readMessage(roto.PARSER, extensionregistrylite))));
	//  256  565:aload_0         
	//  257  566:getfield        #116 <Field List extension_>
	//  258  569:aload_1         
	//  259  570:getstatic       #169 <Field Parser DescriptorProtos$FieldDescriptorProto.PARSER>
	//  260  573:aload_2         
	//  261  574:invokevirtual   #173 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  262  577:invokeinterface #179 <Method boolean List.add(Object)>
	//  263  582:pop             
		  goto _L13
	//* 264  583:goto            941
_L9:
		obj = null;
	//  265  586:aconst_null     
	//  266  587:astore          10
		k = i;
	//  267  589:iload_3         
	//  268  590:istore          5
		l = i;
	//  269  592:iload_3         
	//  270  593:istore          6
		j = i;
	//  271  595:iload_3         
	//  272  596:istore          4
		if((bitField0_ & 2) != 2) goto _L25; else goto _L24
	//  273  598:aload_0         
	//  274  599:getfield        #163 <Field int bitField0_>
	//  275  602:iconst_2        
	//  276  603:iand            
	//  277  604:iconst_2        
	//  278  605:icmpne          626
_L24:
		k = i;
	//  279  608:iload_3         
	//  280  609:istore          5
		l = i;
	//  281  611:iload_3         
	//  282  612:istore          6
		j = i;
	//  283  614:iload_3         
	//  284  615:istore          4
		obj = ((Object) (options_.toBuilder()));
	//  285  617:aload_0         
	//  286  618:getfield        #185 <Field DescriptorProtos$MessageOptions options_>
	//  287  621:invokevirtual   #191 <Method DescriptorProtos$MessageOptions$Builder DescriptorProtos$MessageOptions.toBuilder()>
	//  288  624:astore          10
_L25:
		k = i;
	//  289  626:iload_3         
	//  290  627:istore          5
		l = i;
	//  291  629:iload_3         
	//  292  630:istore          6
		j = i;
	//  293  632:iload_3         
	//  294  633:istore          4
		options_ = (DescriptorProtos.MessageOptions)codedinputstream.readMessage(DescriptorProtos.MessageOptions.PARSER, extensionregistrylite);
	//  295  635:aload_0         
	//  296  636:aload_1         
	//  297  637:getstatic       #192 <Field Parser DescriptorProtos$MessageOptions.PARSER>
	//  298  640:aload_2         
	//  299  641:invokevirtual   #173 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  300  644:checkcast       #187 <Class DescriptorProtos$MessageOptions>
	//  301  647:putfield        #185 <Field DescriptorProtos$MessageOptions options_>
		if(obj == null) goto _L27; else goto _L26
	//  302  650:aload           10
	//  303  652:ifnull          692
_L26:
		k = i;
	//  304  655:iload_3         
	//  305  656:istore          5
		l = i;
	//  306  658:iload_3         
	//  307  659:istore          6
		j = i;
	//  308  661:iload_3         
	//  309  662:istore          4
		((uilder) (obj)).mergeFrom(options_);
	//  310  664:aload           10
	//  311  666:aload_0         
	//  312  667:getfield        #185 <Field DescriptorProtos$MessageOptions options_>
	//  313  670:invokevirtual   #198 <Method DescriptorProtos$MessageOptions$Builder DescriptorProtos$MessageOptions$Builder.mergeFrom(DescriptorProtos$MessageOptions)>
	//  314  673:pop             
		k = i;
	//  315  674:iload_3         
	//  316  675:istore          5
		l = i;
	//  317  677:iload_3         
	//  318  678:istore          6
		j = i;
	//  319  680:iload_3         
	//  320  681:istore          4
		options_ = ((uilder) (obj)).buildPartial();
	//  321  683:aload_0         
	//  322  684:aload           10
	//  323  686:invokevirtual   #202 <Method DescriptorProtos$MessageOptions DescriptorProtos$MessageOptions$Builder.buildPartial()>
	//  324  689:putfield        #185 <Field DescriptorProtos$MessageOptions options_>
_L27:
		k = i;
	//  325  692:iload_3         
	//  326  693:istore          5
		l = i;
	//  327  695:iload_3         
	//  328  696:istore          6
		j = i;
	//  329  698:iload_3         
	//  330  699:istore          4
		bitField0_ = bitField0_ | 2;
	//  331  701:aload_0         
	//  332  702:aload_0         
	//  333  703:getfield        #163 <Field int bitField0_>
	//  334  706:iconst_2        
	//  335  707:ior             
	//  336  708:putfield        #163 <Field int bitField0_>
		i1 = i;
	//  337  711:iload_3         
	//  338  712:istore          7
		  goto _L13
	//* 339  714:goto            941
_L10:
		i1 = i;
	//  340  717:iload_3         
	//  341  718:istore          7
		if((i & 0x40) == 64) goto _L29; else goto _L28
	//  342  720:iload_3         
	//  343  721:bipush          64
	//  344  723:iand            
	//  345  724:bipush          64
	//  346  726:icmpeq          755
_L28:
		k = i;
	//  347  729:iload_3         
	//  348  730:istore          5
		l = i;
	//  349  732:iload_3         
	//  350  733:istore          6
		j = i;
	//  351  735:iload_3         
	//  352  736:istore          4
		oneofDecl_ = ((List) (new ArrayList()));
	//  353  738:aload_0         
	//  354  739:new             #165 <Class ArrayList>
	//  355  742:dup             
	//  356  743:invokespecial   #166 <Method void ArrayList()>
	//  357  746:putfield        #124 <Field List oneofDecl_>
		i1 = i | 0x40;
	//  358  749:iload_3         
	//  359  750:bipush          64
	//  360  752:ior             
	//  361  753:istore          7
_L29:
		k = i1;
	//  362  755:iload           7
	//  363  757:istore          5
		l = i1;
	//  364  759:iload           7
	//  365  761:istore          6
		j = i1;
	//  366  763:iload           7
	//  367  765:istore          4
		oneofDecl_.add(((Object) (codedinputstream.readMessage(roto.PARSER, extensionregistrylite))));
	//  368  767:aload_0         
	//  369  768:getfield        #124 <Field List oneofDecl_>
	//  370  771:aload_1         
	//  371  772:getstatic       #205 <Field Parser DescriptorProtos$OneofDescriptorProto.PARSER>
	//  372  775:aload_2         
	//  373  776:invokevirtual   #173 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  374  779:invokeinterface #179 <Method boolean List.add(Object)>
	//  375  784:pop             
		  goto _L13
	//* 376  785:goto            941
_L11:
		i1 = i;
	//  377  788:iload_3         
	//  378  789:istore          7
		if((i & 0x100) == 256) goto _L31; else goto _L30
	//  379  791:iload_3         
	//  380  792:sipush          256
	//  381  795:iand            
	//  382  796:sipush          256
	//  383  799:icmpeq          829
_L30:
		k = i;
	//  384  802:iload_3         
	//  385  803:istore          5
		l = i;
	//  386  805:iload_3         
	//  387  806:istore          6
		j = i;
	//  388  808:iload_3         
	//  389  809:istore          4
		reservedRange_ = ((List) (new ArrayList()));
	//  390  811:aload_0         
	//  391  812:new             #165 <Class ArrayList>
	//  392  815:dup             
	//  393  816:invokespecial   #166 <Method void ArrayList()>
	//  394  819:putfield        #126 <Field List reservedRange_>
		i1 = i | 0x100;
	//  395  822:iload_3         
	//  396  823:sipush          256
	//  397  826:ior             
	//  398  827:istore          7
_L31:
		k = i1;
	//  399  829:iload           7
	//  400  831:istore          5
		l = i1;
	//  401  833:iload           7
	//  402  835:istore          6
		j = i1;
	//  403  837:iload           7
	//  404  839:istore          4
		reservedRange_.add(((Object) (codedinputstream.readMessage(ReservedRange.PARSER, extensionregistrylite))));
	//  405  841:aload_0         
	//  406  842:getfield        #126 <Field List reservedRange_>
	//  407  845:aload_1         
	//  408  846:getstatic       #206 <Field Parser DescriptorProtos$DescriptorProto$ReservedRange.PARSER>
	//  409  849:aload_2         
	//  410  850:invokevirtual   #173 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  411  853:invokeinterface #179 <Method boolean List.add(Object)>
	//  412  858:pop             
		  goto _L13
	//* 413  859:goto            941
_L12:
		k = i;
	//  414  862:iload_3         
	//  415  863:istore          5
		l = i;
	//  416  865:iload_3         
	//  417  866:istore          6
		j = i;
	//  418  868:iload_3         
	//  419  869:istore          4
		obj = ((Object) (codedinputstream.readBytes()));
	//  420  871:aload_1         
	//  421  872:invokevirtual   #161 <Method ByteString CodedInputStream.readBytes()>
	//  422  875:astore          10
		i1 = i;
	//  423  877:iload_3         
	//  424  878:istore          7
		if((i & 0x200) == 512) goto _L33; else goto _L32
	//  425  880:iload_3         
	//  426  881:sipush          512
	//  427  884:iand            
	//  428  885:sipush          512
	//  429  888:icmpeq          918
_L32:
		k = i;
	//  430  891:iload_3         
	//  431  892:istore          5
		l = i;
	//  432  894:iload_3         
	//  433  895:istore          6
		j = i;
	//  434  897:iload_3         
	//  435  898:istore          4
		reservedName_ = ((LazyStringList) (new LazyStringArrayList()));
	//  436  900:aload_0         
	//  437  901:new             #128 <Class LazyStringArrayList>
	//  438  904:dup             
	//  439  905:invokespecial   #207 <Method void LazyStringArrayList()>
	//  440  908:putfield        #133 <Field LazyStringList reservedName_>
		i1 = i | 0x200;
	//  441  911:iload_3         
	//  442  912:sipush          512
	//  443  915:ior             
	//  444  916:istore          7
_L33:
		k = i1;
	//  445  918:iload           7
	//  446  920:istore          5
		l = i1;
	//  447  922:iload           7
	//  448  924:istore          6
		j = i1;
	//  449  926:iload           7
	//  450  928:istore          4
		reservedName_.add(((ByteString) (obj)));
	//  451  930:aload_0         
	//  452  931:getfield        #133 <Field LazyStringList reservedName_>
	//  453  934:aload           10
	//  454  936:invokeinterface #212 <Method void LazyStringList.add(ByteString)>
_L13:
		i = i1;
	//  455  941:iload           7
	//  456  943:istore_3        
		if(true) goto _L35; else goto _L34
	//  457  944:goto            26
_L34:
		if((i & 2) == 2)
	//* 458  947:iload_3         
	//* 459  948:iconst_2        
	//* 460  949:iand            
	//* 461  950:iconst_2        
	//* 462  951:icmpne          965
			field_ = Collections.unmodifiableList(field_);
	//  463  954:aload_0         
	//  464  955:aload_0         
	//  465  956:getfield        #114 <Field List field_>
	//  466  959:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  467  962:putfield        #114 <Field List field_>
		if((i & 8) == 8)
	//* 468  965:iload_3         
	//* 469  966:bipush          8
	//* 470  968:iand            
	//* 471  969:bipush          8
	//* 472  971:icmpne          985
			nestedType_ = Collections.unmodifiableList(nestedType_);
	//  473  974:aload_0         
	//  474  975:aload_0         
	//  475  976:getfield        #118 <Field List nestedType_>
	//  476  979:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  477  982:putfield        #118 <Field List nestedType_>
		if((i & 0x10) == 16)
	//* 478  985:iload_3         
	//* 479  986:bipush          16
	//* 480  988:iand            
	//* 481  989:bipush          16
	//* 482  991:icmpne          1005
			enumType_ = Collections.unmodifiableList(enumType_);
	//  483  994:aload_0         
	//  484  995:aload_0         
	//  485  996:getfield        #120 <Field List enumType_>
	//  486  999:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  487 1002:putfield        #120 <Field List enumType_>
		if((i & 0x20) == 32)
	//* 488 1005:iload_3         
	//* 489 1006:bipush          32
	//* 490 1008:iand            
	//* 491 1009:bipush          32
	//* 492 1011:icmpne          1025
			extensionRange_ = Collections.unmodifiableList(extensionRange_);
	//  493 1014:aload_0         
	//  494 1015:aload_0         
	//  495 1016:getfield        #122 <Field List extensionRange_>
	//  496 1019:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  497 1022:putfield        #122 <Field List extensionRange_>
		if((i & 4) == 4)
	//* 498 1025:iload_3         
	//* 499 1026:iconst_4        
	//* 500 1027:iand            
	//* 501 1028:iconst_4        
	//* 502 1029:icmpne          1043
			extension_ = Collections.unmodifiableList(extension_);
	//  503 1032:aload_0         
	//  504 1033:aload_0         
	//  505 1034:getfield        #116 <Field List extension_>
	//  506 1037:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  507 1040:putfield        #116 <Field List extension_>
		if((i & 0x40) == 64)
	//* 508 1043:iload_3         
	//* 509 1044:bipush          64
	//* 510 1046:iand            
	//* 511 1047:bipush          64
	//* 512 1049:icmpne          1063
			oneofDecl_ = Collections.unmodifiableList(oneofDecl_);
	//  513 1052:aload_0         
	//  514 1053:aload_0         
	//  515 1054:getfield        #124 <Field List oneofDecl_>
	//  516 1057:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  517 1060:putfield        #124 <Field List oneofDecl_>
		if((i & 0x100) == 256)
	//* 518 1063:iload_3         
	//* 519 1064:sipush          256
	//* 520 1067:iand            
	//* 521 1068:sipush          256
	//* 522 1071:icmpne          1085
			reservedRange_ = Collections.unmodifiableList(reservedRange_);
	//  523 1074:aload_0         
	//  524 1075:aload_0         
	//  525 1076:getfield        #126 <Field List reservedRange_>
	//  526 1079:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  527 1082:putfield        #126 <Field List reservedRange_>
		if((i & 0x200) == 512)
	//* 528 1085:iload_3         
	//* 529 1086:sipush          512
	//* 530 1089:iand            
	//* 531 1090:sipush          512
	//* 532 1093:icmpne          1109
			reservedName_ = reservedName_.getUnmodifiableView();
	//  533 1096:aload_0         
	//  534 1097:aload_0         
	//  535 1098:getfield        #133 <Field LazyStringList reservedName_>
	//  536 1101:invokeinterface #220 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//  537 1106:putfield        #133 <Field LazyStringList reservedName_>
		unknownFields = builder.build();
	//  538 1109:aload_0         
	//  539 1110:aload           11
	//  540 1112:invokevirtual   #226 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  541 1115:putfield        #230 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  542 1118:aload_0         
	//  543 1119:invokevirtual   #233 <Method void makeExtensionsImmutable()>
		return;
	//  544 1122:return          
		codedinputstream;
	//  545 1123:astore_1        
		j = k;
	//  546 1124:iload           5
	//  547 1126:istore          4
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  548 1128:aload_1         
	//  549 1129:aload_0         
	//  550 1130:invokevirtual   #237 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  551 1133:athrow          
		codedinputstream;
	//  552 1134:astore_1        
		j = l;
	//  553 1135:iload           6
	//  554 1137:istore          4
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  555 1139:new             #136 <Class InvalidProtocolBufferException>
	//  556 1142:dup             
	//  557 1143:aload_1         
	//  558 1144:invokespecial   #240 <Method void InvalidProtocolBufferException(IOException)>
	//  559 1147:aload_0         
	//  560 1148:invokevirtual   #237 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  561 1151:athrow          
		codedinputstream;
	//  562 1152:astore_1        
		if((j & 2) == 2)
	//* 563 1153:iload           4
	//* 564 1155:iconst_2        
	//* 565 1156:iand            
	//* 566 1157:iconst_2        
	//* 567 1158:icmpne          1172
			field_ = Collections.unmodifiableList(field_);
	//  568 1161:aload_0         
	//  569 1162:aload_0         
	//  570 1163:getfield        #114 <Field List field_>
	//  571 1166:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  572 1169:putfield        #114 <Field List field_>
		if((j & 8) == 8)
	//* 573 1172:iload           4
	//* 574 1174:bipush          8
	//* 575 1176:iand            
	//* 576 1177:bipush          8
	//* 577 1179:icmpne          1193
			nestedType_ = Collections.unmodifiableList(nestedType_);
	//  578 1182:aload_0         
	//  579 1183:aload_0         
	//  580 1184:getfield        #118 <Field List nestedType_>
	//  581 1187:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  582 1190:putfield        #118 <Field List nestedType_>
		if((j & 0x10) == 16)
	//* 583 1193:iload           4
	//* 584 1195:bipush          16
	//* 585 1197:iand            
	//* 586 1198:bipush          16
	//* 587 1200:icmpne          1214
			enumType_ = Collections.unmodifiableList(enumType_);
	//  588 1203:aload_0         
	//  589 1204:aload_0         
	//  590 1205:getfield        #120 <Field List enumType_>
	//  591 1208:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  592 1211:putfield        #120 <Field List enumType_>
		if((j & 0x20) == 32)
	//* 593 1214:iload           4
	//* 594 1216:bipush          32
	//* 595 1218:iand            
	//* 596 1219:bipush          32
	//* 597 1221:icmpne          1235
			extensionRange_ = Collections.unmodifiableList(extensionRange_);
	//  598 1224:aload_0         
	//  599 1225:aload_0         
	//  600 1226:getfield        #122 <Field List extensionRange_>
	//  601 1229:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  602 1232:putfield        #122 <Field List extensionRange_>
		if((j & 4) == 4)
	//* 603 1235:iload           4
	//* 604 1237:iconst_4        
	//* 605 1238:iand            
	//* 606 1239:iconst_4        
	//* 607 1240:icmpne          1254
			extension_ = Collections.unmodifiableList(extension_);
	//  608 1243:aload_0         
	//  609 1244:aload_0         
	//  610 1245:getfield        #116 <Field List extension_>
	//  611 1248:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  612 1251:putfield        #116 <Field List extension_>
		if((j & 0x40) == 64)
	//* 613 1254:iload           4
	//* 614 1256:bipush          64
	//* 615 1258:iand            
	//* 616 1259:bipush          64
	//* 617 1261:icmpne          1275
			oneofDecl_ = Collections.unmodifiableList(oneofDecl_);
	//  618 1264:aload_0         
	//  619 1265:aload_0         
	//  620 1266:getfield        #124 <Field List oneofDecl_>
	//  621 1269:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  622 1272:putfield        #124 <Field List oneofDecl_>
		if((j & 0x100) == 256)
	//* 623 1275:iload           4
	//* 624 1277:sipush          256
	//* 625 1280:iand            
	//* 626 1281:sipush          256
	//* 627 1284:icmpne          1298
			reservedRange_ = Collections.unmodifiableList(reservedRange_);
	//  628 1287:aload_0         
	//  629 1288:aload_0         
	//  630 1289:getfield        #126 <Field List reservedRange_>
	//  631 1292:invokestatic    #216 <Method List Collections.unmodifiableList(List)>
	//  632 1295:putfield        #126 <Field List reservedRange_>
		if((j & 0x200) == 512)
	//* 633 1298:iload           4
	//* 634 1300:sipush          512
	//* 635 1303:iand            
	//* 636 1304:sipush          512
	//* 637 1307:icmpne          1323
			reservedName_ = reservedName_.getUnmodifiableView();
	//  638 1310:aload_0         
	//  639 1311:aload_0         
	//  640 1312:getfield        #133 <Field LazyStringList reservedName_>
	//  641 1315:invokeinterface #220 <Method LazyStringList LazyStringList.getUnmodifiableView()>
	//  642 1320:putfield        #133 <Field LazyStringList reservedName_>
		unknownFields = builder.build();
	//  643 1323:aload_0         
	//  644 1324:aload           11
	//  645 1326:invokevirtual   #226 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  646 1329:putfield        #230 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  647 1332:aload_0         
	//  648 1333:invokevirtual   #233 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  649 1336:aload_1         
	//  650 1337:athrow          
	//* 651 1338:goto            148
_L2:
		flag = true;
	//  652 1341:iconst_1        
	//  653 1342:istore          8
		i1 = i;
	//  654 1344:iload_3         
	//  655 1345:istore          7
		  goto _L13
	//* 656 1347:goto            941
	}

	DescriptorProtos$DescriptorProto(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #244 <Method void DescriptorProtos$DescriptorProto(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$DescriptorProto(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #247 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #102 <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$DescriptorProto(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #251 <Method void DescriptorProtos$DescriptorProto(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
