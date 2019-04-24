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
//			Internal, ExtensionRegistryLite, Message, MessageLite, 
//			AbstractParser

public static final class DescriptorProtos$UninterpretedOption$NamePart extends GeneratedMessageV3
	implements rBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements DescriptorProtos.UninterpretedOption.NamePartOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return DescriptorProtos.access$24800();
		//    0    0:invokestatic    #46  <Method Descriptors$Descriptor DescriptorProtos.access$24800()>
		//    1    3:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
		//    0    0:getstatic       #51  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//    1    3:istore_1        
		//    2    4:return          
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #56  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #58  <Method DescriptorProtos$UninterpretedOption$NamePart$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #58  <Method DescriptorProtos$UninterpretedOption$NamePart$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public DescriptorProtos.UninterpretedOption.NamePart build()
		{
			DescriptorProtos.UninterpretedOption.NamePart namepart = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #64  <Method DescriptorProtos$UninterpretedOption$NamePart buildPartial()>
		//    2    4:astore_1        
			if(!namepart.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #68  <Method boolean DescriptorProtos$UninterpretedOption$NamePart.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (namepart)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #72  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return namepart;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method DescriptorProtos$UninterpretedOption$NamePart build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method DescriptorProtos$UninterpretedOption$NamePart build()>
		//    2    4:areturn         
		}

		public DescriptorProtos.UninterpretedOption.NamePart buildPartial()
		{
			DescriptorProtos.UninterpretedOption.NamePart namepart = new DescriptorProtos.UninterpretedOption.NamePart(((GeneratedMessageV3.Builder) (this)), ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #79  <Method void DescriptorProtos$UninterpretedOption$NamePart(GeneratedMessageV3$Builder, DescriptorProtos$1)>
		//    5    9:astore          4
			int k = bitField0_;
		//    6   11:aload_0         
		//    7   12:getfield        #81  <Field int bitField0_>
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
			namepart.namePart_ = namePart_;
		//   18   27:aload           4
		//   19   29:aload_0         
		//   20   30:getfield        #30  <Field Object namePart_>
		//   21   33:invokestatic    #85  <Method Object DescriptorProtos$UninterpretedOption$NamePart.access$25302(DescriptorProtos$UninterpretedOption$NamePart, Object)>
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
			namepart.isExtension_ = isExtension_;
		//   34   50:aload           4
		//   35   52:aload_0         
		//   36   53:getfield        #87  <Field boolean isExtension_>
		//   37   56:invokestatic    #91  <Method boolean DescriptorProtos$UninterpretedOption$NamePart.access$25402(DescriptorProtos$UninterpretedOption$NamePart, boolean)>
		//   38   59:pop             
			namepart.bitField0_ = j;
		//   39   60:aload           4
		//   40   62:iload_2         
		//   41   63:invokestatic    #95  <Method int DescriptorProtos$UninterpretedOption$NamePart.access$25502(DescriptorProtos$UninterpretedOption$NamePart, int)>
		//   42   66:pop             
			onBuilt();
		//   43   67:aload_0         
		//   44   68:invokevirtual   #98  <Method void onBuilt()>
			return namepart;
		//   45   71:aload           4
		//   46   73:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #64  <Method DescriptorProtos$UninterpretedOption$NamePart buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #64  <Method DescriptorProtos$UninterpretedOption$NamePart buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #106 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			namePart_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #28  <String "">
		//    5    8:putfield        #30  <Field Object namePart_>
			bitField0_ = bitField0_ & -2;
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:getfield        #81  <Field int bitField0_>
		//    9   16:bipush          -2
		//   10   18:iand            
		//   11   19:putfield        #81  <Field int bitField0_>
			isExtension_ = false;
		//   12   22:aload_0         
		//   13   23:iconst_0        
		//   14   24:putfield        #87  <Field boolean isExtension_>
			bitField0_ = bitField0_ & -3;
		//   15   27:aload_0         
		//   16   28:aload_0         
		//   17   29:getfield        #81  <Field int bitField0_>
		//   18   32:bipush          -3
		//   19   34:iand            
		//   20   35:putfield        #81  <Field int bitField0_>
			return this;
		//   21   38:aload_0         
		//   22   39:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #103 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #113 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #115 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #115 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearIsExtension()
		{
			bitField0_ = bitField0_ & -3;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #81  <Field int bitField0_>
		//    3    5:bipush          -3
		//    4    7:iand            
		//    5    8:putfield        #81  <Field int bitField0_>
			isExtension_ = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #87  <Field boolean isExtension_>
			onChanged();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   11   20:aload_0         
		//   12   21:areturn         
		}

		public Builder clearNamePart()
		{
			bitField0_ = bitField0_ & -2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #81  <Field int bitField0_>
		//    3    5:bipush          -2
		//    4    7:iand            
		//    5    8:putfield        #81  <Field int bitField0_>
			namePart_ = ((Object) (DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance().getNamePart()));
		//    6   11:aload_0         
		//    7   12:invokestatic    #124 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
		//    8   15:invokevirtual   #128 <Method String DescriptorProtos$UninterpretedOption$NamePart.getNamePart()>
		//    9   18:putfield        #30  <Field Object namePart_>
			onChanged();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   12   25:aload_0         
		//   13   26:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #136 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #133 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #143 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder clone()>
		//    2    4:areturn         
		}

		public DescriptorProtos.UninterpretedOption.NamePart getDefaultInstanceForType()
		{
			return DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance();
		//    0    0:invokestatic    #124 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #150 <Method DescriptorProtos$UninterpretedOption$NamePart getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #150 <Method DescriptorProtos$UninterpretedOption$NamePart getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return DescriptorProtos.access$24800();
		//    0    0:invokestatic    #46  <Method Descriptors$Descriptor DescriptorProtos.access$24800()>
		//    1    3:areturn         
		}

		public boolean getIsExtension()
		{
			return isExtension_;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field boolean isExtension_>
		//    2    4:ireturn         
		}

		public String getNamePart()
		{
			Object obj = namePart_;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Object namePart_>
		//    2    4:astore_1        
			if(!(obj instanceof String))
		//*   3    5:aload_1         
		//*   4    6:instanceof      #154 <Class String>
		//*   5    9:ifne            36
			{
				obj = ((Object) ((ByteString)obj));
		//    6   12:aload_1         
		//    7   13:checkcast       #156 <Class ByteString>
		//    8   16:astore_1        
				String s = ((ByteString) (obj)).toStringUtf8();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #159 <Method String ByteString.toStringUtf8()>
		//   11   21:astore_2        
				if(((ByteString) (obj)).isValidUtf8())
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #162 <Method boolean ByteString.isValidUtf8()>
		//*  14   26:ifeq            34
					namePart_ = ((Object) (s));
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #30  <Field Object namePart_>
				return s;
		//   18   34:aload_2         
		//   19   35:areturn         
			} else
			{
				return (String)obj;
		//   20   36:aload_1         
		//   21   37:checkcast       #154 <Class String>
		//   22   40:areturn         
			}
		}

		public ByteString getNamePartBytes()
		{
			Object obj = namePart_;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Object namePart_>
		//    2    4:astore_1        
			if(obj instanceof String)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #154 <Class String>
		//*   5    9:ifeq            27
			{
				obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
		//    6   12:aload_1         
		//    7   13:checkcast       #154 <Class String>
		//    8   16:invokestatic    #168 <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:astore_1        
				namePart_ = obj;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #30  <Field Object namePart_>
				return ((ByteString) (obj));
		//   13   25:aload_1         
		//   14   26:areturn         
			} else
			{
				return (ByteString)obj;
		//   15   27:aload_1         
		//   16   28:checkcast       #156 <Class ByteString>
		//   17   31:areturn         
			}
		}

		public boolean hasIsExtension()
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

		public boolean hasNamePart()
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

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return DescriptorProtos.access$24900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart, com/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart$Builder);
		//    0    0:invokestatic    #175 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$24900()>
		//    1    3:ldc1            #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    2    5:ldc1            #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    3    7:invokevirtual   #181 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			if(!hasNamePart())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #183 <Method boolean hasNamePart()>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			return hasIsExtension();
		//    5    9:aload_0         
		//    6   10:invokevirtual   #185 <Method boolean hasIsExtension()>
		//    7   13:ifne            18
		//    8   16:iconst_0        
		//    9   17:ireturn         
		//   10   18:iconst_1        
		//   11   19:ireturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #196 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.UninterpretedOption.NamePart)DescriptorProtos.UninterpretedOption.NamePart.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:getstatic       #203 <Field Parser DescriptorProtos$UninterpretedOption$NamePart.PARSER>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #209 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((DescriptorProtos.UninterpretedOption.NamePart) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #212 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #215 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #219 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #212 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
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
			codedinputstream = ((CodedInputStream) ((DescriptorProtos.UninterpretedOption.NamePart)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((DescriptorProtos.UninterpretedOption.NamePart) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(DescriptorProtos.UninterpretedOption.NamePart namepart)
		{
			if(namepart == DescriptorProtos.UninterpretedOption.NamePart.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #124 <Method DescriptorProtos$UninterpretedOption$NamePart DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance()>
		//*   2    4:if_acmpne       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(namepart.hasNamePart())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #220 <Method boolean DescriptorProtos$UninterpretedOption$NamePart.hasNamePart()>
		//*   7   13:ifeq            38
			{
				bitField0_ = bitField0_ | 1;
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #81  <Field int bitField0_>
		//   11   21:iconst_1        
		//   12   22:ior             
		//   13   23:putfield        #81  <Field int bitField0_>
				namePart_ = namepart.namePart_;
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokestatic    #224 <Method Object DescriptorProtos$UninterpretedOption$NamePart.access$25300(DescriptorProtos$UninterpretedOption$NamePart)>
		//   17   31:putfield        #30  <Field Object namePart_>
				onChanged();
		//   18   34:aload_0         
		//   19   35:invokevirtual   #120 <Method void onChanged()>
			}
			if(namepart.hasIsExtension())
		//*  20   38:aload_1         
		//*  21   39:invokevirtual   #225 <Method boolean DescriptorProtos$UninterpretedOption$NamePart.hasIsExtension()>
		//*  22   42:ifeq            54
				setIsExtension(namepart.getIsExtension());
		//   23   45:aload_0         
		//   24   46:aload_1         
		//   25   47:invokevirtual   #227 <Method boolean DescriptorProtos$UninterpretedOption$NamePart.getIsExtension()>
		//   26   50:invokevirtual   #231 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setIsExtension(boolean)>
		//   27   53:pop             
			mergeUnknownFields(namepart.unknownFields);
		//   28   54:aload_0         
		//   29   55:aload_1         
		//   30   56:getfield        #235 <Field UnknownFieldSet DescriptorProtos$UninterpretedOption$NamePart.unknownFields>
		//   31   59:invokevirtual   #239 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeUnknownFields(UnknownFieldSet)>
		//   32   62:pop             
			onChanged();
		//   33   63:aload_0         
		//   34   64:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   35   67:aload_0         
		//   36   68:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof DescriptorProtos.UninterpretedOption.NamePart)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//*   2    4:ifeq            16
			{
				return mergeFrom((DescriptorProtos.UninterpretedOption.NamePart)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #14  <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    6   12:invokevirtual   #212 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #241 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
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
		//    3    3:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #196 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #192 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #239 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #248 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #239 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #239 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #252 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #254 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #254 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setIsExtension(boolean flag)
		{
			bitField0_ = bitField0_ | 2;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #81  <Field int bitField0_>
		//    3    5:iconst_2        
		//    4    6:ior             
		//    5    7:putfield        #81  <Field int bitField0_>
			isExtension_ = flag;
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:putfield        #87  <Field boolean isExtension_>
			onChanged();
		//    9   15:aload_0         
		//   10   16:invokevirtual   #120 <Method void onChanged()>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public Builder setNamePart(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #258 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #259 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #81  <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #81  <Field int bitField0_>
				namePart_ = ((Object) (s));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #30  <Field Object namePart_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setNamePartBytes(ByteString bytestring)
		{
			if(bytestring == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				throw new NullPointerException();
		//    2    4:new             #258 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:invokespecial   #259 <Method void NullPointerException()>
		//    5   11:athrow          
			} else
			{
				bitField0_ = bitField0_ | 1;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #81  <Field int bitField0_>
		//    9   17:iconst_1        
		//   10   18:ior             
		//   11   19:putfield        #81  <Field int bitField0_>
				namePart_ = ((Object) (bytestring));
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:putfield        #30  <Field Object namePart_>
				onChanged();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #120 <Method void onChanged()>
				return this;
		//   17   31:aload_0         
		//   18   32:areturn         
			}
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #266 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #268 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #268 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #272 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #274 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #274 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private int bitField0_;
		private boolean isExtension_;
		private Object namePart_;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void GeneratedMessageV3$Builder()>
			namePart_ = "";
		//    2    4:aload_0         
		//    3    5:ldc1            #28  <String "">
		//    4    7:putfield        #30  <Field Object namePart_>
			maybeForceBuilderInitialization();
		//    5   10:aload_0         
		//    6   11:invokespecial   #33  <Method void maybeForceBuilderInitialization()>
		//    7   14:return          
		}

		Builder(DescriptorProtos._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder()>
		//    2    4:return          
		}

		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			namePart_ = "";
		//    3    5:aload_0         
		//    4    6:ldc1            #28  <String "">
		//    5    8:putfield        #30  <Field Object namePart_>
			maybeForceBuilderInitialization();
		//    6   11:aload_0         
		//    7   12:invokespecial   #33  <Method void maybeForceBuilderInitialization()>
		//    8   15:return          
		}

		Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
		{
			this(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder(GeneratedMessageV3$BuilderParent)>
		//    3    5:return          
		}
	}


	public static DescriptorProtos$UninterpretedOption$NamePart getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return DescriptorProtos.access$24800();
	//    0    0:invokestatic    #139 <Method Descriptors$Descriptor DescriptorProtos.access$24800()>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #143 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(DescriptorProtos$UninterpretedOption$NamePart descriptorprotos$uninterpretedoption$namepart)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorprotos$uninterpretedoption$namepart);
	//    0    0:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #143 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #147 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder DescriptorProtos$UninterpretedOption$NamePart$Builder.mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
	//    4   10:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #153 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    4   10:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #157 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    5   11:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #164 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    4   12:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #168 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    5   13:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #173 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    4   10:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #177 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    5   11:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(InputStream inputstream)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #179 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    4   10:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #181 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    5   11:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #185 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    4   12:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #189 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    5   13:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #193 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    4   12:areturn         
	}

	public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (DescriptorProtos$UninterpretedOption$NamePart)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #197 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #49  <Field Parser PARSER>
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
		if(!(obj instanceof DescriptorProtos$UninterpretedOption$NamePart))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #204 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DescriptorProtos$UninterpretedOption$NamePart)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//   14   24:astore_1        
		boolean flag;
		if(true && hasNamePart() == ((DescriptorProtos$UninterpretedOption$NamePart) (obj)).hasNamePart())
	//*  15   25:iconst_1        
	//*  16   26:ifeq            45
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #207 <Method boolean hasNamePart()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #207 <Method boolean hasNamePart()>
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
		if(hasNamePart())
	//*  29   49:aload_0         
	//*  30   50:invokevirtual   #207 <Method boolean hasNamePart()>
	//*  31   53:ifeq            81
			if(flag && getNamePart().equals(((Object) (((DescriptorProtos$UninterpretedOption$NamePart) (obj)).getNamePart()))))
	//*  32   56:iload_2         
	//*  33   57:ifeq            79
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #211 <Method String getNamePart()>
	//*  36   64:aload_1         
	//*  37   65:invokevirtual   #211 <Method String getNamePart()>
	//*  38   68:invokevirtual   #214 <Method boolean String.equals(Object)>
	//*  39   71:ifeq            79
				flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore_3        
			else
	//*  42   76:goto            81
				flag1 = false;
	//   43   79:iconst_0        
	//   44   80:istore_3        
		if(flag1 && hasIsExtension() == ((DescriptorProtos$UninterpretedOption$NamePart) (obj)).hasIsExtension())
	//*  45   81:iload_3         
	//*  46   82:ifeq            101
	//*  47   85:aload_0         
	//*  48   86:invokevirtual   #217 <Method boolean hasIsExtension()>
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #217 <Method boolean hasIsExtension()>
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
		if(hasIsExtension())
	//*  59  105:aload_0         
	//*  60  106:invokevirtual   #217 <Method boolean hasIsExtension()>
	//*  61  109:ifeq            134
			if(flag && getIsExtension() == ((DescriptorProtos$UninterpretedOption$NamePart) (obj)).getIsExtension())
	//*  62  112:iload_2         
	//*  63  113:ifeq            132
	//*  64  116:aload_0         
	//*  65  117:invokevirtual   #220 <Method boolean getIsExtension()>
	//*  66  120:aload_1         
	//*  67  121:invokevirtual   #220 <Method boolean getIsExtension()>
	//*  68  124:icmpne          132
				flag1 = true;
	//   69  127:iconst_1        
	//   70  128:istore_3        
			else
	//*  71  129:goto            134
				flag1 = false;
	//   72  132:iconst_0        
	//   73  133:istore_3        
		return flag1 && unknownFields.equals(((Object) (((DescriptorProtos$UninterpretedOption$NamePart) (obj)).unknownFields)));
	//   74  134:iload_3         
	//   75  135:ifeq            154
	//   76  138:aload_0         
	//   77  139:getfield        #103 <Field UnknownFieldSet unknownFields>
	//   78  142:aload_1         
	//   79  143:getfield        #103 <Field UnknownFieldSet unknownFields>
	//   80  146:invokevirtual   #221 <Method boolean UnknownFieldSet.equals(Object)>
	//   81  149:ifeq            154
	//   82  152:iconst_1        
	//   83  153:ireturn         
	//   84  154:iconst_0        
	//   85  155:ireturn         
	}

	public DescriptorProtos$UninterpretedOption$NamePart getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method DescriptorProtos$UninterpretedOption$NamePart getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method DescriptorProtos$UninterpretedOption$NamePart getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public boolean getIsExtension()
	{
		return isExtension_;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean isExtension_>
	//    2    4:ireturn         
	}

	public String getNamePart()
	{
		Object obj = namePart_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object namePart_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #213 <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #213 <Class String>
	//    8   16:areturn         
		obj = ((Object) ((ByteString)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #228 <Class ByteString>
	//   11   21:astore_1        
		String s = ((ByteString) (obj)).toStringUtf8();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #231 <Method String ByteString.toStringUtf8()>
	//   14   26:astore_2        
		if(((ByteString) (obj)).isValidUtf8())
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #234 <Method boolean ByteString.isValidUtf8()>
	//*  17   31:ifeq            39
			namePart_ = ((Object) (s));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #57  <Field Object namePart_>
		return s;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	public ByteString getNamePartBytes()
	{
		Object obj = namePart_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object namePart_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #213 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #213 <Class String>
	//    8   16:invokestatic    #239 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			namePart_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #57  <Field Object namePart_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #228 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #49  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field int memoizedSize>
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
	//*  11   15:getfield        #89  <Field int bitField0_>
	//*  12   18:iconst_1        
	//*  13   19:iand            
	//*  14   20:iconst_1        
	//*  15   21:icmpne          35
			i = GeneratedMessageV3.computeStringSize(1, namePart_) + 0;
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:getfield        #57  <Field Object namePart_>
	//   19   29:invokestatic    #248 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   20   32:iconst_0        
	//   21   33:iadd            
	//   22   34:istore_1        
		int j = i;
	//   23   35:iload_1         
	//   24   36:istore_2        
		if((bitField0_ & 2) == 2)
	//*  25   37:aload_0         
	//*  26   38:getfield        #89  <Field int bitField0_>
	//*  27   41:iconst_2        
	//*  28   42:iand            
	//*  29   43:iconst_2        
	//*  30   44:icmpne          58
			j = i + CodedOutputStream.computeBoolSize(2, isExtension_);
	//   31   47:iload_1         
	//   32   48:iconst_2        
	//   33   49:aload_0         
	//   34   50:getfield        #59  <Field boolean isExtension_>
	//   35   53:invokestatic    #254 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   36   56:iadd            
	//   37   57:istore_2        
		i = j + unknownFields.getSerializedSize();
	//   38   58:iload_2         
	//   39   59:aload_0         
	//   40   60:getfield        #103 <Field UnknownFieldSet unknownFields>
	//   41   63:invokevirtual   #256 <Method int UnknownFieldSet.getSerializedSize()>
	//   42   66:iadd            
	//   43   67:istore_1        
		memoizedSize = i;
	//   44   68:aload_0         
	//   45   69:iload_1         
	//   46   70:putfield        #244 <Field int memoizedSize>
		return i;
	//   47   73:iload_1         
	//   48   74:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasIsExtension()
	{
		return (bitField0_ & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int bitField0_>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasNamePart()
	{
		return (bitField0_ & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int bitField0_>
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
	//*   1    1:getfield        #261 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #261 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((Object) (getDescriptor())).hashCode() + 779;
	//    6   12:invokestatic    #263 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #267 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:istore_2        
		int i = j;
	//   11   23:iload_2         
	//   12   24:istore_1        
		if(hasNamePart())
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #207 <Method boolean hasNamePart()>
	//*  15   29:ifeq            50
			i = (j * 37 + 1) * 53 + getNamePart().hashCode();
	//   16   32:iload_2         
	//   17   33:bipush          37
	//   18   35:imul            
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:bipush          53
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:invokevirtual   #211 <Method String getNamePart()>
	//   25   45:invokevirtual   #268 <Method int String.hashCode()>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(hasIsExtension())
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #217 <Method boolean hasIsExtension()>
	//*  32   56:ifeq            77
			j = (i * 37 + 2) * 53 + Internal.hashBoolean(getIsExtension());
	//   33   59:iload_1         
	//   34   60:bipush          37
	//   35   62:imul            
	//   36   63:iconst_2        
	//   37   64:iadd            
	//   38   65:bipush          53
	//   39   67:imul            
	//   40   68:aload_0         
	//   41   69:invokevirtual   #220 <Method boolean getIsExtension()>
	//   42   72:invokestatic    #274 <Method int Internal.hashBoolean(boolean)>
	//   43   75:iadd            
	//   44   76:istore_2        
		i = j * 29 + unknownFields.hashCode();
	//   45   77:iload_2         
	//   46   78:bipush          29
	//   47   80:imul            
	//   48   81:aload_0         
	//   49   82:getfield        #103 <Field UnknownFieldSet unknownFields>
	//   50   85:invokevirtual   #275 <Method int UnknownFieldSet.hashCode()>
	//   51   88:iadd            
	//   52   89:istore_1        
		memoizedHashCode = i;
	//   53   90:aload_0         
	//   54   91:iload_1         
	//   55   92:putfield        #261 <Field int memoizedHashCode>
		return i;
	//   56   95:iload_1         
	//   57   96:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return DescriptorProtos.access$24900().ensureFieldAccessorsInitialized(com/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart, com/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart$Builder);
	//    0    0:invokestatic    #280 <Method GeneratedMessageV3$FieldAccessorTable DescriptorProtos.access$24900()>
	//    1    3:ldc1            #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    2    5:ldc1            #16  <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
	//    3    7:invokevirtual   #286 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field byte memoizedIsInitialized>
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
		if(!hasNamePart())
	//*  12   18:aload_0         
	//*  13   19:invokevirtual   #207 <Method boolean hasNamePart()>
	//*  14   22:ifne            32
		{
			memoizedIsInitialized = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #53  <Field byte memoizedIsInitialized>
			return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         
		}
		if(!hasIsExtension())
	//*  20   32:aload_0         
	//*  21   33:invokevirtual   #217 <Method boolean hasIsExtension()>
	//*  22   36:ifne            46
		{
			memoizedIsInitialized = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #53  <Field byte memoizedIsInitialized>
			return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   28   46:aload_0         
	//   29   47:iconst_1        
	//   30   48:putfield        #53  <Field byte memoizedIsInitialized>
			return true;
	//   31   51:iconst_1        
	//   32   52:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #290 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((DescriptorProtos._cls1) (null)));
	//    0    0:new             #16  <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #294 <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder(GeneratedMessageV3$BuilderParent, DescriptorProtos$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #297 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #300 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #297 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((DescriptorProtos._cls1) (null)));
	//    3    7:new             #16  <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #304 <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder(DescriptorProtos$1)>
	//    7   15:areturn         
		else
			return (new Builder(((DescriptorProtos._cls1) (null)))).mergeFrom(this);
	//    8   16:new             #16  <Class DescriptorProtos$UninterpretedOption$NamePart$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #304 <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder(DescriptorProtos$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #147 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder DescriptorProtos$UninterpretedOption$NamePart$Builder.mergeFrom(DescriptorProtos$UninterpretedOption$NamePart)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method DescriptorProtos$UninterpretedOption$NamePart$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if((bitField0_ & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field int bitField0_>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
			GeneratedMessageV3.writeString(codedoutputstream, 1, namePart_);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:getfield        #57  <Field Object namePart_>
	//   10   16:invokestatic    #310 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		if((bitField0_ & 2) == 2)
	//*  11   19:aload_0         
	//*  12   20:getfield        #89  <Field int bitField0_>
	//*  13   23:iconst_2        
	//*  14   24:iand            
	//*  15   25:iconst_2        
	//*  16   26:icmpne          38
			codedoutputstream.writeBool(2, isExtension_);
	//   17   29:aload_1         
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:getfield        #59  <Field boolean isExtension_>
	//   21   35:invokevirtual   #314 <Method void CodedOutputStream.writeBool(int, boolean)>
		unknownFields.writeTo(codedoutputstream);
	//   22   38:aload_0         
	//   23   39:getfield        #103 <Field UnknownFieldSet unknownFields>
	//   24   42:aload_1         
	//   25   43:invokevirtual   #316 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   26   46:return          
	}

	private static final DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE = new DescriptorProtos$UninterpretedOption$NamePart();
	public static final int IS_EXTENSION_FIELD_NUMBER = 2;
	public static final int NAME_PART_FIELD_NUMBER = 1;
	public static final Parser PARSER = new AbstractParser() {

		public DescriptorProtos.UninterpretedOption.NamePart parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new DescriptorProtos.UninterpretedOption.NamePart(codedinputstream, extensionregistrylite, ((DescriptorProtos._cls1) (null)));
		//    0    0:new             #7   <Class DescriptorProtos$UninterpretedOption$NamePart>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #25  <Method void DescriptorProtos$UninterpretedOption$NamePart(CodedInputStream, ExtensionRegistryLite, DescriptorProtos$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method DescriptorProtos$UninterpretedOption$NamePart parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private boolean isExtension_;
	private byte memoizedIsInitialized;
	private volatile Object namePart_;

	static 
	{
	//    0    0:new             #2   <Class DescriptorProtos$UninterpretedOption$NamePart>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void DescriptorProtos$UninterpretedOption$NamePart()>
	//    3    7:putstatic       #46  <Field DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE>
	//    4   10:new             #14  <Class DescriptorProtos$UninterpretedOption$NamePart$1>
	//    5   13:dup             
	//    6   14:invokespecial   #47  <Method void DescriptorProtos$UninterpretedOption$NamePart$1()>
	//    7   17:putstatic       #49  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$25300(DescriptorProtos$UninterpretedOption$NamePart descriptorprotos$uninterpretedoption$namepart)
	{
		return descriptorprotos$uninterpretedoption$namepart.namePart_;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object namePart_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$25302(DescriptorProtos$UninterpretedOption$NamePart descriptorprotos$uninterpretedoption$namepart, Object obj)
	{
		descriptorprotos$uninterpretedoption$namepart.namePart_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field Object namePart_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$25402(DescriptorProtos$UninterpretedOption$NamePart descriptorprotos$uninterpretedoption$namepart, boolean flag)
	{
		descriptorprotos$uninterpretedoption$namepart.isExtension_ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean isExtension_>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$25502(DescriptorProtos$UninterpretedOption$NamePart descriptorprotos$uninterpretedoption$namepart, int i)
	{
		descriptorprotos$uninterpretedoption$namepart.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	private DescriptorProtos$UninterpretedOption$NamePart()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #53  <Field byte memoizedIsInitialized>
		namePart_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #55  <String "">
	//    7   12:putfield        #57  <Field Object namePart_>
		isExtension_ = false;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #59  <Field boolean isExtension_>
	//   11   20:return          
	}

	private DescriptorProtos$UninterpretedOption$NamePart(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void DescriptorProtos$UninterpretedOption$NamePart()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #66  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #67  <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #73  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//    9   19:astore          5
		flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L8:
		if(flag) goto _L2; else goto _L1
	//   12   23:iload_3         
	//   13   24:ifne            132
_L1:
		int i = codedinputstream.readTag();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #79  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 3: default 183
	//	               0: 186
	//	               10: 86
	//	               16: 111;
	//   18   35:lookupswitch    3: default 183
	//	               0: 186
	//	               10: 86
	//	               16: 111
		   goto _L3 _L4 _L5 _L6
_L3:
		if(!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
	//*  19   68:aload_0         
	//*  20   69:aload_1         
	//*  21   70:aload           5
	//*  22   72:aload_2         
	//*  23   73:iload           4
	//*  24   75:invokevirtual   #83  <Method boolean parseUnknownField(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  25   78:ifne            129
			flag = true;
	//   26   81:iconst_1        
	//   27   82:istore_3        
		continue; /* Loop/switch isn't completed */
	//   28   83:goto            129
_L5:
		ByteString bytestring = codedinputstream.readBytes();
	//   29   86:aload_1         
	//   30   87:invokevirtual   #87  <Method ByteString CodedInputStream.readBytes()>
	//   31   90:astore          6
		bitField0_ = bitField0_ | 1;
	//   32   92:aload_0         
	//   33   93:aload_0         
	//   34   94:getfield        #89  <Field int bitField0_>
	//   35   97:iconst_1        
	//   36   98:ior             
	//   37   99:putfield        #89  <Field int bitField0_>
		namePart_ = ((Object) (bytestring));
	//   38  102:aload_0         
	//   39  103:aload           6
	//   40  105:putfield        #57  <Field Object namePart_>
		continue; /* Loop/switch isn't completed */
	//   41  108:goto            129
_L6:
		bitField0_ = bitField0_ | 2;
	//   42  111:aload_0         
	//   43  112:aload_0         
	//   44  113:getfield        #89  <Field int bitField0_>
	//   45  116:iconst_2        
	//   46  117:ior             
	//   47  118:putfield        #89  <Field int bitField0_>
		isExtension_ = codedinputstream.readBool();
	//   48  121:aload_0         
	//   49  122:aload_1         
	//   50  123:invokevirtual   #93  <Method boolean CodedInputStream.readBool()>
	//   51  126:putfield        #59  <Field boolean isExtension_>
		continue; /* Loop/switch isn't completed */
	//   52  129:goto            23
_L2:
		unknownFields = builder.build();
	//   53  132:aload_0         
	//   54  133:aload           5
	//   55  135:invokevirtual   #99  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   56  138:putfield        #103 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   57  141:aload_0         
	//   58  142:invokevirtual   #106 <Method void makeExtensionsImmutable()>
		return;
	//   59  145:return          
		codedinputstream;
	//   60  146:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   61  147:aload_1         
	//   62  148:aload_0         
	//   63  149:invokevirtual   #110 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   64  152:athrow          
		codedinputstream;
	//   65  153:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//   66  154:new             #62  <Class InvalidProtocolBufferException>
	//   67  157:dup             
	//   68  158:aload_1         
	//   69  159:invokespecial   #113 <Method void InvalidProtocolBufferException(IOException)>
	//   70  162:aload_0         
	//   71  163:invokevirtual   #110 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   72  166:athrow          
		codedinputstream;
	//   73  167:astore_1        
		unknownFields = builder.build();
	//   74  168:aload_0         
	//   75  169:aload           5
	//   76  171:invokevirtual   #99  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   77  174:putfield        #103 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   78  177:aload_0         
	//   79  178:invokevirtual   #106 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//   80  181:aload_1         
	//   81  182:athrow          
	//*  82  183:goto            68
_L4:
		flag = true;
	//   83  186:iconst_1        
	//   84  187:istore_3        
		if(true) goto _L8; else goto _L7
	//   85  188:goto            129
_L7:
	}

	DescriptorProtos$UninterpretedOption$NamePart(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, DescriptorProtos._cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #117 <Method void DescriptorProtos$UninterpretedOption$NamePart(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private DescriptorProtos$UninterpretedOption$NamePart(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #120 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #53  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	DescriptorProtos$UninterpretedOption$NamePart(GeneratedMessageV3.Builder builder, DescriptorProtos._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #124 <Method void DescriptorProtos$UninterpretedOption$NamePart(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}
}
