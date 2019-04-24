// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos, GeneratedMessageV3, ByteString, InvalidProtocolBufferException, 
//			Parser, Message, MessageLite, CodedInputStream, 
//			ExtensionRegistryLite, UnknownFieldSet

public static final class DescriptorProtos$UninterpretedOption$NamePart$Builder extends GeneratedMessageV3.Builder
	implements 
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$UninterpretedOption$NamePart$Builder)super.addRepeatedField(fielddescriptor, obj);
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
		DescriptorProtos.UninterpretedOption.NamePart.access$25302(namepart, namePart_);
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
		DescriptorProtos.UninterpretedOption.NamePart.access$25402(namepart, isExtension_);
	//   34   50:aload           4
	//   35   52:aload_0         
	//   36   53:getfield        #87  <Field boolean isExtension_>
	//   37   56:invokestatic    #91  <Method boolean DescriptorProtos$UninterpretedOption$NamePart.access$25402(DescriptorProtos$UninterpretedOption$NamePart, boolean)>
	//   38   59:pop             
		DescriptorProtos.UninterpretedOption.NamePart.access$25502(namepart, j);
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder clear()
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
	{
		return (DescriptorProtos$UninterpretedOption$NamePart$Builder)super.clearField(fielddescriptor);
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder clearIsExtension()
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder clearNamePart()
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		return (DescriptorProtos$UninterpretedOption$NamePart$Builder)super.clearOneof(oneofdescriptor);
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder clone()
	{
		return (DescriptorProtos$UninterpretedOption$NamePart$Builder)super.clone();
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(DescriptorProtos.UninterpretedOption.NamePart namepart)
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
			namePart_ = DescriptorProtos.UninterpretedOption.NamePart.access$25300(namepart);
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder mergeFrom(Message message)
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

	public final DescriptorProtos$UninterpretedOption$NamePart$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$UninterpretedOption$NamePart$Builder)super.mergeUnknownFields(unknownfieldset);
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
	{
		return (DescriptorProtos$UninterpretedOption$NamePart$Builder)super.setField(fielddescriptor, obj);
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder setIsExtension(boolean flag)
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder setNamePart(String s)
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder setNamePartBytes(ByteString bytestring)
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

	public DescriptorProtos$UninterpretedOption$NamePart$Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
	{
		return (DescriptorProtos$UninterpretedOption$NamePart$Builder)super.setRepeatedField(fielddescriptor, i, obj);
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

	public final DescriptorProtos$UninterpretedOption$NamePart$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (DescriptorProtos$UninterpretedOption$NamePart$Builder)super.setUnknownFields(unknownfieldset);
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

	private DescriptorProtos$UninterpretedOption$NamePart$Builder()
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

	DescriptorProtos$UninterpretedOption$NamePart$Builder(DescriptorProtos._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder()>
	//    2    4:return          
	}

	private DescriptorProtos$UninterpretedOption$NamePart$Builder(GeneratedMessageV3.BuilderParent builderparent)
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

	DescriptorProtos$UninterpretedOption$NamePart$Builder(GeneratedMessageV3.BuilderParent builderparent, DescriptorProtos._cls1 _pcls1)
	{
		this(builderparent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void DescriptorProtos$UninterpretedOption$NamePart$Builder(GeneratedMessageV3$BuilderParent)>
	//    3    5:return          
	}
}
