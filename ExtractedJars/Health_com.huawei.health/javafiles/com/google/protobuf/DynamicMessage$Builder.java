// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.*;

// Referenced classes of package com.google.protobuf:
//			DynamicMessage, FieldSet, UnknownFieldSet, InvalidProtocolBufferException, 
//			UninitializedMessageException, Internal, CodedInputStream, Message, 
//			MessageLite

public static final class DynamicMessage$Builder extends 
{

	private DynamicMessage buildParsed()
		throws InvalidProtocolBufferException
	{
		if(!isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #73  <Method boolean isInitialized()>
	//*   2    4:ifne            48
			throw newUninitializedMessageException(((Message) (new DynamicMessage(type, fields, (ptor[])Arrays.copyOf(((Object []) (oneofCases)), oneofCases.length), unknownFields)))).asInvalidProtocolBufferException();
	//    3    7:new             #7   <Class DynamicMessage>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field Descriptors$Descriptor type>
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field FieldSet fields>
	//    9   19:aload_0         
	//   10   20:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   11   23:aload_0         
	//   12   24:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   13   27:arraylength     
	//   14   28:invokestatic    #79  <Method Object[] Arrays.copyOf(Object[], int)>
	//   15   31:checkcast       #80  <Class Descriptors$FieldDescriptor[]>
	//   16   34:aload_0         
	//   17   35:getfield        #40  <Field UnknownFieldSet unknownFields>
	//   18   38:invokespecial   #83  <Method void DynamicMessage(Descriptors$Descriptor, FieldSet, Descriptors$FieldDescriptor[], UnknownFieldSet)>
	//   19   41:invokestatic    #87  <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//   20   44:invokevirtual   #93  <Method InvalidProtocolBufferException UninitializedMessageException.asInvalidProtocolBufferException()>
	//   21   47:athrow          
		else
			return buildPartial();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #96  <Method DynamicMessage buildPartial()>
	//   24   52:areturn         
	}

	private void ensureEnumValueDescriptor(ptor ptor, Object obj)
	{
		if(ptor.isRepeated())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #101 <Method boolean Descriptors$FieldDescriptor.isRepeated()>
	//*   2    4:ifeq            41
		{
			for(obj = ((Object) (((List)obj).iterator())); ((Iterator) (obj)).hasNext(); ensureSingularEnumValueDescriptor(ptor, ((Iterator) (obj)).next()));
	//    3    7:aload_2         
	//    4    8:checkcast       #103 <Class List>
	//    5   11:invokeinterface #107 <Method Iterator List.iterator()>
	//    6   16:astore_2        
	//    7   17:aload_2         
	//    8   18:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            40
	//   10   26:aload_0         
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:invokeinterface #116 <Method Object Iterator.next()>
	//   14   34:invokespecial   #119 <Method void ensureSingularEnumValueDescriptor(Descriptors$FieldDescriptor, Object)>
	//*  15   37:goto            17
			return;
	//   16   40:return          
		} else
		{
			ensureSingularEnumValueDescriptor(ptor, obj);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:invokespecial   #119 <Method void ensureSingularEnumValueDescriptor(Descriptors$FieldDescriptor, Object)>
			return;
	//   21   47:return          
		}
	}

	private void ensureIsMutable()
	{
		if(fields.isImmutable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field FieldSet fields>
	//*   2    4:invokevirtual   #123 <Method boolean FieldSet.isImmutable()>
	//*   3    7:ifeq            21
			fields = fields.clone();
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field FieldSet fields>
	//    7   15:invokevirtual   #126 <Method FieldSet FieldSet.clone()>
	//    8   18:putfield        #32  <Field FieldSet fields>
	//    9   21:return          
	}

	private void ensureSingularEnumValueDescriptor(ptor ptor, Object obj)
	{
		Internal.checkNotNull(obj);
	//    0    0:aload_2         
	//    1    1:invokestatic    #132 <Method Object Internal.checkNotNull(Object)>
	//    2    4:pop             
		if(!(obj instanceof scriptor))
	//*   3    5:aload_2         
	//*   4    6:instanceof      #134 <Class Descriptors$EnumValueDescriptor>
	//*   5    9:ifne            22
			throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
	//    6   12:new             #136 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc1            #138 <String "DynamicMessage should use EnumValueDescriptor to set Enum Value.">
	//    9   18:invokespecial   #141 <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
		else
			return;
	//   11   22:return          
	}

	private void verifyContainingType(ptor ptor)
	{
		if(ptor.getContainingType() != type)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #147 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getContainingType()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field Descriptors$Descriptor type>
	//*   4    8:if_acmpeq       21
			throw new IllegalArgumentException("FieldDescriptor does not match message type.");
	//    5   11:new             #136 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #149 <String "FieldDescriptor does not match message type.">
	//    8   17:invokespecial   #141 <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		else
			return;
	//   10   21:return          
	}

	private void verifyOneofContainingType(ptor ptor)
	{
		if(ptor.getContainingType() != type)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #154 <Method Descriptors$Descriptor Descriptors$OneofDescriptor.getContainingType()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field Descriptors$Descriptor type>
	//*   4    8:if_acmpeq       21
			throw new IllegalArgumentException("OneofDescriptor does not match message type.");
	//    5   11:new             #136 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #156 <String "OneofDescriptor does not match message type.">
	//    8   17:invokespecial   #141 <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		else
			return;
	//   10   21:return          
	}

	public DynamicMessage$Builder addRepeatedField(ptor ptor, Object obj)
	{
		verifyContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		ensureIsMutable();
	//    3    5:aload_0         
	//    4    6:invokespecial   #162 <Method void ensureIsMutable()>
		fields.addRepeatedField(((rLite) (ptor)), obj);
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field FieldSet fields>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #165 <Method void FieldSet.addRepeatedField(FieldSet$FieldDescriptorLite, Object)>
		return this;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public volatile Message.Builder addRepeatedField(ptor ptor, Object obj)
	{
		return ((Message.Builder) (addRepeatedField(ptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #168 <Method DynamicMessage$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DynamicMessage build()
	{
		if(!isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #73  <Method boolean isInitialized()>
	//*   2    4:ifne            45
			throw newUninitializedMessageException(((Message) (new DynamicMessage(type, fields, (ptor[])Arrays.copyOf(((Object []) (oneofCases)), oneofCases.length), unknownFields))));
	//    3    7:new             #7   <Class DynamicMessage>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field Descriptors$Descriptor type>
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field FieldSet fields>
	//    9   19:aload_0         
	//   10   20:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   11   23:aload_0         
	//   12   24:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   13   27:arraylength     
	//   14   28:invokestatic    #79  <Method Object[] Arrays.copyOf(Object[], int)>
	//   15   31:checkcast       #80  <Class Descriptors$FieldDescriptor[]>
	//   16   34:aload_0         
	//   17   35:getfield        #40  <Field UnknownFieldSet unknownFields>
	//   18   38:invokespecial   #83  <Method void DynamicMessage(Descriptors$Descriptor, FieldSet, Descriptors$FieldDescriptor[], UnknownFieldSet)>
	//   19   41:invokestatic    #87  <Method UninitializedMessageException newUninitializedMessageException(Message)>
	//   20   44:athrow          
		else
			return buildPartial();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #96  <Method DynamicMessage buildPartial()>
	//   23   49:areturn         
	}

	public volatile Message build()
	{
		return ((Message) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DynamicMessage build()>
	//    2    4:areturn         
	}

	public volatile MessageLite build()
	{
		return ((MessageLite) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method DynamicMessage build()>
	//    2    4:areturn         
	}

	public DynamicMessage buildPartial()
	{
		fields.makeImmutable();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field FieldSet fields>
	//    2    4:invokevirtual   #176 <Method void FieldSet.makeImmutable()>
		return new DynamicMessage(type, fields, (ptor[])Arrays.copyOf(((Object []) (oneofCases)), oneofCases.length), unknownFields);
	//    3    7:new             #7   <Class DynamicMessage>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field Descriptors$Descriptor type>
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field FieldSet fields>
	//    9   19:aload_0         
	//   10   20:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   11   23:aload_0         
	//   12   24:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   13   27:arraylength     
	//   14   28:invokestatic    #79  <Method Object[] Arrays.copyOf(Object[], int)>
	//   15   31:checkcast       #80  <Class Descriptors$FieldDescriptor[]>
	//   16   34:aload_0         
	//   17   35:getfield        #40  <Field UnknownFieldSet unknownFields>
	//   18   38:invokespecial   #83  <Method void DynamicMessage(Descriptors$Descriptor, FieldSet, Descriptors$FieldDescriptor[], UnknownFieldSet)>
	//   19   41:areturn         
	}

	public volatile Message buildPartial()
	{
		return ((Message) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method DynamicMessage buildPartial()>
	//    2    4:areturn         
	}

	public volatile MessageLite buildPartial()
	{
		return ((MessageLite) (buildPartial()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method DynamicMessage buildPartial()>
	//    2    4:areturn         
	}

	public volatile  clear()
	{
		return (() (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #181 <Method DynamicMessage$Builder clear()>
	//    2    4:areturn         
	}

	public DynamicMessage$Builder clear()
	{
		if(fields.isImmutable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field FieldSet fields>
	//*   2    4:invokevirtual   #123 <Method boolean FieldSet.isImmutable()>
	//*   3    7:ifeq            20
			fields = FieldSet.newFieldSet();
	//    4   10:aload_0         
	//    5   11:invokestatic    #30  <Method FieldSet FieldSet.newFieldSet()>
	//    6   14:putfield        #32  <Field FieldSet fields>
		else
	//*   7   17:goto            27
			fields.clear();
	//    8   20:aload_0         
	//    9   21:getfield        #32  <Field FieldSet fields>
	//   10   24:invokevirtual   #183 <Method void FieldSet.clear()>
		unknownFields = UnknownFieldSet.getDefaultInstance();
	//   11   27:aload_0         
	//   12   28:invokestatic    #38  <Method UnknownFieldSet UnknownFieldSet.getDefaultInstance()>
	//   13   31:putfield        #40  <Field UnknownFieldSet unknownFields>
		return this;
	//   14   34:aload_0         
	//   15   35:areturn         
	}

	public volatile Message.Builder clear()
	{
		return ((Message.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #181 <Method DynamicMessage$Builder clear()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clear()
	{
		return ((MessageLite.Builder) (clear()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #181 <Method DynamicMessage$Builder clear()>
	//    2    4:areturn         
	}

	public DynamicMessage$Builder clearField(ptor ptor)
	{
		verifyContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		ensureIsMutable();
	//    3    5:aload_0         
	//    4    6:invokespecial   #162 <Method void ensureIsMutable()>
		ptor ptor1 = ptor.getContainingOneof();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #191 <Method Descriptors$OneofDescriptor Descriptors$FieldDescriptor.getContainingOneof()>
	//    7   13:astore_3        
		if(ptor1 != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          40
		{
			int i = ptor1.getIndex();
	//   10   18:aload_3         
	//   11   19:invokevirtual   #194 <Method int Descriptors$OneofDescriptor.getIndex()>
	//   12   22:istore_2        
			if(oneofCases[i] == ptor)
	//*  13   23:aload_0         
	//*  14   24:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//*  15   27:iload_2         
	//*  16   28:aaload          
	//*  17   29:aload_1         
	//*  18   30:if_acmpne       40
				oneofCases[i] = null;
	//   19   33:aload_0         
	//   20   34:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   21   37:iload_2         
	//   22   38:aconst_null     
	//   23   39:aastore         
		}
		fields.clearField(((rLite) (ptor)));
	//   24   40:aload_0         
	//   25   41:getfield        #32  <Field FieldSet fields>
	//   26   44:aload_1         
	//   27   45:invokevirtual   #197 <Method void FieldSet.clearField(FieldSet$FieldDescriptorLite)>
		return this;
	//   28   48:aload_0         
	//   29   49:areturn         
	}

	public volatile Message.Builder clearField(ptor ptor)
	{
		return ((Message.Builder) (clearField(ptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #200 <Method DynamicMessage$Builder clearField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public volatile  clearOneof(ptor ptor)
	{
		return (() (clearOneof(ptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #205 <Method DynamicMessage$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public DynamicMessage$Builder clearOneof(ptor ptor)
	{
		verifyOneofContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method void verifyOneofContainingType(Descriptors$OneofDescriptor)>
		ptor = ((ptor) (oneofCases[ptor.getIndex()]));
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #194 <Method int Descriptors$OneofDescriptor.getIndex()>
	//    7   13:aaload          
	//    8   14:astore_1        
		if(ptor != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          25
			clearField(((ptor) (ptor)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #200 <Method DynamicMessage$Builder clearField(Descriptors$FieldDescriptor)>
	//   14   24:pop             
		return this;
	//   15   25:aload_0         
	//   16   26:areturn         
	}

	public volatile Message.Builder clearOneof(ptor ptor)
	{
		return ((Message.Builder) (clearOneof(ptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #205 <Method DynamicMessage$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public volatile  clone()
	{
		return (() (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method DynamicMessage$Builder clone()>
	//    2    4:areturn         
	}

	public volatile lder clone()
	{
		return ((lder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method DynamicMessage$Builder clone()>
	//    2    4:areturn         
	}

	public DynamicMessage$Builder clone()
	{
		DynamicMessage$Builder dynamicmessage$builder = new DynamicMessage$Builder(type);
	//    0    0:new             #2   <Class DynamicMessage$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Descriptors$Descriptor type>
	//    4    8:invokespecial   #60  <Method void DynamicMessage$Builder(Descriptors$Descriptor)>
	//    5   11:astore_1        
		dynamicmessage$builder.fields.mergeFrom(fields);
	//    6   12:aload_1         
	//    7   13:getfield        #32  <Field FieldSet fields>
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field FieldSet fields>
	//   10   20:invokevirtual   #215 <Method void FieldSet.mergeFrom(FieldSet)>
		dynamicmessage$builder.mergeUnknownFields(unknownFields);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field UnknownFieldSet unknownFields>
	//   14   28:invokevirtual   #219 <Method DynamicMessage$Builder mergeUnknownFields(UnknownFieldSet)>
	//   15   31:pop             
		System.arraycopy(((Object) (oneofCases)), 0, ((Object) (dynamicmessage$builder.oneofCases)), 0, oneofCases.length);
	//   16   32:aload_0         
	//   17   33:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   18   36:iconst_0        
	//   19   37:aload_1         
	//   20   38:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   21   41:iconst_0        
	//   22   42:aload_0         
	//   23   43:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   24   46:arraylength     
	//   25   47:invokestatic    #225 <Method void System.arraycopy(Object, int, Object, int, int)>
		return dynamicmessage$builder;
	//   26   50:aload_1         
	//   27   51:areturn         
	}

	public volatile Message.Builder clone()
	{
		return ((Message.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method DynamicMessage$Builder clone()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder clone()
	{
		return ((MessageLite.Builder) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method DynamicMessage$Builder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method DynamicMessage$Builder clone()>
	//    2    4:areturn         
	}

	public Map getAllFields()
	{
		return fields.getAllFields();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field FieldSet fields>
	//    2    4:invokevirtual   #231 <Method Map FieldSet.getAllFields()>
	//    3    7:areturn         
	}

	public DynamicMessage getDefaultInstanceForType()
	{
		return DynamicMessage.getDefaultInstance(type);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Descriptors$Descriptor type>
	//    2    4:invokestatic    #237 <Method DynamicMessage DynamicMessage.getDefaultInstance(Descriptors$Descriptor)>
	//    3    7:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method DynamicMessage getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method DynamicMessage getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors$Descriptor getDescriptorForType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Descriptors$Descriptor type>
	//    2    4:areturn         
	}

	public Object getField(ptor ptor)
	{
		verifyContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		Object obj1 = fields.getField(((rLite) (ptor)));
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field FieldSet fields>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #245 <Method Object FieldSet.getField(FieldSet$FieldDescriptorLite)>
	//    7   13:astore_3        
		Object obj = obj1;
	//    8   14:aload_3         
	//    9   15:astore_2        
		if(obj1 == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       54
		{
			if(ptor.isRepeated())
	//*  12   20:aload_1         
	//*  13   21:invokevirtual   #101 <Method boolean Descriptors$FieldDescriptor.isRepeated()>
	//*  14   24:ifeq            31
				return ((Object) (Collections.emptyList()));
	//   15   27:invokestatic    #251 <Method List Collections.emptyList()>
	//   16   30:areturn         
			if(ptor.getJavaType() == ptor.JavaType.MESSAGE)
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #255 <Method Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor.getJavaType()>
	//*  19   35:getstatic       #261 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//*  20   38:if_acmpne       49
				return ((Object) (DynamicMessage.getDefaultInstance(ptor.getMessageType())));
	//   21   41:aload_1         
	//   22   42:invokevirtual   #264 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getMessageType()>
	//   23   45:invokestatic    #237 <Method DynamicMessage DynamicMessage.getDefaultInstance(Descriptors$Descriptor)>
	//   24   48:areturn         
			obj = ptor.getDefaultValue();
	//   25   49:aload_1         
	//   26   50:invokevirtual   #267 <Method Object Descriptors$FieldDescriptor.getDefaultValue()>
	//   27   53:astore_2        
		}
		return obj;
	//   28   54:aload_2         
	//   29   55:areturn         
	}

	public Message.Builder getFieldBuilder(ptor ptor)
	{
		throw new UnsupportedOperationException("getFieldBuilder() called on a dynamic message type.");
	//    0    0:new             #270 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #272 <String "getFieldBuilder() called on a dynamic message type.">
	//    3    7:invokespecial   #273 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public ptor getOneofFieldDescriptor(ptor ptor)
	{
		verifyOneofContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method void verifyOneofContainingType(Descriptors$OneofDescriptor)>
		return oneofCases[ptor.getIndex()];
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #194 <Method int Descriptors$OneofDescriptor.getIndex()>
	//    7   13:aaload          
	//    8   14:areturn         
	}

	public Object getRepeatedField(ptor ptor, int i)
	{
		verifyContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		return fields.getRepeatedField(((rLite) (ptor)), i);
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field FieldSet fields>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #280 <Method Object FieldSet.getRepeatedField(FieldSet$FieldDescriptorLite, int)>
	//    8   14:areturn         
	}

	public Message.Builder getRepeatedFieldBuilder(ptor ptor, int i)
	{
		throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a dynamic message type.");
	//    0    0:new             #270 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #284 <String "getRepeatedFieldBuilder() called on a dynamic message type.">
	//    3    7:invokespecial   #273 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public int getRepeatedFieldCount(ptor ptor)
	{
		verifyContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		return fields.getRepeatedFieldCount(((rLite) (ptor)));
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field FieldSet fields>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #289 <Method int FieldSet.getRepeatedFieldCount(FieldSet$FieldDescriptorLite)>
	//    7   13:ireturn         
	}

	public UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasField(ptor ptor)
	{
		verifyContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		return fields.hasField(((rLite) (ptor)));
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field FieldSet fields>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #295 <Method boolean FieldSet.hasField(FieldSet$FieldDescriptorLite)>
	//    7   13:ireturn         
	}

	public boolean hasOneof(ptor ptor)
	{
		verifyOneofContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method void verifyOneofContainingType(Descriptors$OneofDescriptor)>
		return oneofCases[ptor.getIndex()] != null;
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #194 <Method int Descriptors$OneofDescriptor.getIndex()>
	//    7   13:aaload          
	//    8   14:ifnonnull       19
	//    9   17:iconst_0        
	//   10   18:ireturn         
	//   11   19:iconst_1        
	//   12   20:ireturn         
	}

	public boolean isInitialized()
	{
		return DynamicMessage.isInitialized(type, fields);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Descriptors$Descriptor type>
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field FieldSet fields>
	//    4    8:invokestatic    #300 <Method boolean DynamicMessage.isInitialized(Descriptors$Descriptor, FieldSet)>
	//    5   11:ireturn         
	}

	public volatile  mergeFrom(Message message)
	{
		return (() (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #304 <Method DynamicMessage$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public DynamicMessage$Builder mergeFrom(Message message)
	{
		if(message instanceof DynamicMessage)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #7   <Class DynamicMessage>
	//*   2    4:ifeq            151
		{
			message = ((Message) ((DynamicMessage)message));
	//    3    7:aload_1         
	//    4    8:checkcast       #7   <Class DynamicMessage>
	//    5   11:astore_1        
			if(DynamicMessage.access$200(((DynamicMessage) (message))) != type)
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #308 <Method Descriptors$Descriptor DynamicMessage.access$200(DynamicMessage)>
	//*   8   16:aload_0         
	//*   9   17:getfield        #24  <Field Descriptors$Descriptor type>
	//*  10   20:if_acmpeq       34
				throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
	//   11   23:new             #136 <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:ldc2            #310 <String "mergeFrom(Message) can only merge messages of the same type.">
	//   14   30:invokespecial   #141 <Method void IllegalArgumentException(String)>
	//   15   33:athrow          
			ensureIsMutable();
	//   16   34:aload_0         
	//   17   35:invokespecial   #162 <Method void ensureIsMutable()>
			fields.mergeFrom(DynamicMessage.access$300(((DynamicMessage) (message))));
	//   18   38:aload_0         
	//   19   39:getfield        #32  <Field FieldSet fields>
	//   20   42:aload_1         
	//   21   43:invokestatic    #314 <Method FieldSet DynamicMessage.access$300(DynamicMessage)>
	//   22   46:invokevirtual   #215 <Method void FieldSet.mergeFrom(FieldSet)>
			mergeUnknownFields(DynamicMessage.access$400(((DynamicMessage) (message))));
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokestatic    #318 <Method UnknownFieldSet DynamicMessage.access$400(DynamicMessage)>
	//   26   54:invokevirtual   #219 <Method DynamicMessage$Builder mergeUnknownFields(UnknownFieldSet)>
	//   27   57:pop             
			for(int i = 0; i < oneofCases.length; i++)
	//*  28   58:iconst_0        
	//*  29   59:istore_2        
	//*  30   60:iload_2         
	//*  31   61:aload_0         
	//*  32   62:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//*  33   65:arraylength     
	//*  34   66:icmpge          149
			{
				if(oneofCases[i] == null)
	//*  35   69:aload_0         
	//*  36   70:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//*  37   73:iload_2         
	//*  38   74:aaload          
	//*  39   75:ifnonnull       93
				{
					oneofCases[i] = DynamicMessage.access$500(((DynamicMessage) (message)))[i];
	//   40   78:aload_0         
	//   41   79:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   42   82:iload_2         
	//   43   83:aload_1         
	//   44   84:invokestatic    #322 <Method Descriptors$FieldDescriptor[] DynamicMessage.access$500(DynamicMessage)>
	//   45   87:iload_2         
	//   46   88:aaload          
	//   47   89:aastore         
					continue;
	//   48   90:goto            142
				}
				if(DynamicMessage.access$500(((DynamicMessage) (message)))[i] != null && oneofCases[i] != DynamicMessage.access$500(((DynamicMessage) (message)))[i])
	//*  49   93:aload_1         
	//*  50   94:invokestatic    #322 <Method Descriptors$FieldDescriptor[] DynamicMessage.access$500(DynamicMessage)>
	//*  51   97:iload_2         
	//*  52   98:aaload          
	//*  53   99:ifnull          142
	//*  54  102:aload_0         
	//*  55  103:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//*  56  106:iload_2         
	//*  57  107:aaload          
	//*  58  108:aload_1         
	//*  59  109:invokestatic    #322 <Method Descriptors$FieldDescriptor[] DynamicMessage.access$500(DynamicMessage)>
	//*  60  112:iload_2         
	//*  61  113:aaload          
	//*  62  114:if_acmpeq       142
				{
					fields.clearField(((rLite) (oneofCases[i])));
	//   63  117:aload_0         
	//   64  118:getfield        #32  <Field FieldSet fields>
	//   65  121:aload_0         
	//   66  122:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   67  125:iload_2         
	//   68  126:aaload          
	//   69  127:invokevirtual   #197 <Method void FieldSet.clearField(FieldSet$FieldDescriptorLite)>
					oneofCases[i] = DynamicMessage.access$500(((DynamicMessage) (message)))[i];
	//   70  130:aload_0         
	//   71  131:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   72  134:iload_2         
	//   73  135:aload_1         
	//   74  136:invokestatic    #322 <Method Descriptors$FieldDescriptor[] DynamicMessage.access$500(DynamicMessage)>
	//   75  139:iload_2         
	//   76  140:aaload          
	//   77  141:aastore         
				}
			}

	//   78  142:iload_2         
	//   79  143:iconst_1        
	//   80  144:iadd            
	//   81  145:istore_2        
	//*  82  146:goto            60
			return this;
	//   83  149:aload_0         
	//   84  150:areturn         
		} else
		{
			return (DynamicMessage$Builder)super.mergeFrom(message);
	//   85  151:aload_0         
	//   86  152:aload_1         
	//   87  153:invokespecial   #324 <Method AbstractMessage$Builder AbstractMessage$Builder.mergeFrom(Message)>
	//   88  156:checkcast       #2   <Class DynamicMessage$Builder>
	//   89  159:areturn         
		}
	}

	public volatile Message.Builder mergeFrom(Message message)
	{
		return ((Message.Builder) (mergeFrom(message)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #304 <Method DynamicMessage$Builder mergeFrom(Message)>
	//    3    5:areturn         
	}

	public volatile  mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return (() (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #219 <Method DynamicMessage$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DynamicMessage$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		if(getDescriptorForType().getFile().getSyntax() == tor.Syntax.PROTO3 && CodedInputStream.getProto3DiscardUnknownFieldsDefault())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #328 <Method Descriptors$Descriptor getDescriptorForType()>
	//*   2    4:invokevirtual   #332 <Method Descriptors$FileDescriptor Descriptors$Descriptor.getFile()>
	//*   3    7:invokevirtual   #338 <Method Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor.getSyntax()>
	//*   4   10:getstatic       #344 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO3>
	//*   5   13:if_acmpne       24
	//*   6   16:invokestatic    #349 <Method boolean CodedInputStream.getProto3DiscardUnknownFieldsDefault()>
	//*   7   19:ifeq            24
		{
			return this;
	//    8   22:aload_0         
	//    9   23:areturn         
		} else
		{
			unknownFields = UnknownFieldSet.newBuilder(unknownFields).mergeFrom(unknownfieldset).build();
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #40  <Field UnknownFieldSet unknownFields>
	//   13   29:invokestatic    #353 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder(UnknownFieldSet)>
	//   14   32:aload_1         
	//   15   33:invokevirtual   #357 <Method UnknownFieldSet$Builder UnknownFieldSet$Builder.mergeFrom(UnknownFieldSet)>
	//   16   36:invokevirtual   #359 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   17   39:putfield        #40  <Field UnknownFieldSet unknownFields>
			return this;
	//   18   42:aload_0         
	//   19   43:areturn         
		}
	}

	public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #219 <Method DynamicMessage$Builder mergeUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	public DynamicMessage$Builder newBuilderForField(ptor ptor)
	{
		verifyContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		if(ptor.getJavaType() != ptor.JavaType.MESSAGE)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #255 <Method Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor.getJavaType()>
	//*   5    9:getstatic       #261 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//*   6   12:if_acmpeq       26
			throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
	//    7   15:new             #136 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc2            #363 <String "newBuilderForField is only valid for fields with message type.">
	//   10   22:invokespecial   #141 <Method void IllegalArgumentException(String)>
	//   11   25:athrow          
		else
			return new DynamicMessage$Builder(ptor.getMessageType());
	//   12   26:new             #2   <Class DynamicMessage$Builder>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:invokevirtual   #264 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getMessageType()>
	//   16   34:invokespecial   #60  <Method void DynamicMessage$Builder(Descriptors$Descriptor)>
	//   17   37:areturn         
	}

	public volatile Message.Builder newBuilderForField(ptor ptor)
	{
		return ((Message.Builder) (newBuilderForField(ptor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #365 <Method DynamicMessage$Builder newBuilderForField(Descriptors$FieldDescriptor)>
	//    3    5:areturn         
	}

	public DynamicMessage$Builder setField(ptor ptor, Object obj)
	{
		verifyContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		ensureIsMutable();
	//    3    5:aload_0         
	//    4    6:invokespecial   #162 <Method void ensureIsMutable()>
		if(ptor.getType() == ptor.Type.ENUM)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #370 <Method Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor.getType()>
	//*   7   13:getstatic       #376 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.ENUM>
	//*   8   16:if_acmpne       25
			ensureEnumValueDescriptor(ptor, obj);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokespecial   #378 <Method void ensureEnumValueDescriptor(Descriptors$FieldDescriptor, Object)>
		Object obj1 = ((Object) (ptor.getContainingOneof()));
	//   13   25:aload_1         
	//   14   26:invokevirtual   #191 <Method Descriptors$OneofDescriptor Descriptors$FieldDescriptor.getContainingOneof()>
	//   15   29:astore          4
		if(obj1 != null)
	//*  16   31:aload           4
	//*  17   33:ifnull          80
		{
			int i = ((ptor) (obj1)).getIndex();
	//   18   36:aload           4
	//   19   38:invokevirtual   #194 <Method int Descriptors$OneofDescriptor.getIndex()>
	//   20   41:istore_3        
			obj1 = ((Object) (oneofCases[i]));
	//   21   42:aload_0         
	//   22   43:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   23   46:iload_3         
	//   24   47:aaload          
	//   25   48:astore          4
			if(obj1 != null && obj1 != ptor)
	//*  26   50:aload           4
	//*  27   52:ifnull          70
	//*  28   55:aload           4
	//*  29   57:aload_1         
	//*  30   58:if_acmpeq       70
				fields.clearField(((rLite) (obj1)));
	//   31   61:aload_0         
	//   32   62:getfield        #32  <Field FieldSet fields>
	//   33   65:aload           4
	//   34   67:invokevirtual   #197 <Method void FieldSet.clearField(FieldSet$FieldDescriptorLite)>
			oneofCases[i] = ptor;
	//   35   70:aload_0         
	//   36   71:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   37   74:iload_3         
	//   38   75:aload_1         
	//   39   76:aastore         
		} else
	//*  40   77:goto            131
		if(ptor.getFile().getSyntax() == tor.Syntax.PROTO3 && !ptor.isRepeated() && ptor.getJavaType() != ptor.JavaType.MESSAGE && obj.equals(ptor.getDefaultValue()))
	//*  41   80:aload_1         
	//*  42   81:invokevirtual   #379 <Method Descriptors$FileDescriptor Descriptors$FieldDescriptor.getFile()>
	//*  43   84:invokevirtual   #338 <Method Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor.getSyntax()>
	//*  44   87:getstatic       #344 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO3>
	//*  45   90:if_acmpne       131
	//*  46   93:aload_1         
	//*  47   94:invokevirtual   #101 <Method boolean Descriptors$FieldDescriptor.isRepeated()>
	//*  48   97:ifne            131
	//*  49  100:aload_1         
	//*  50  101:invokevirtual   #255 <Method Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor.getJavaType()>
	//*  51  104:getstatic       #261 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//*  52  107:if_acmpeq       131
	//*  53  110:aload_2         
	//*  54  111:aload_1         
	//*  55  112:invokevirtual   #267 <Method Object Descriptors$FieldDescriptor.getDefaultValue()>
	//*  56  115:invokevirtual   #385 <Method boolean Object.equals(Object)>
	//*  57  118:ifeq            131
		{
			fields.clearField(((rLite) (ptor)));
	//   58  121:aload_0         
	//   59  122:getfield        #32  <Field FieldSet fields>
	//   60  125:aload_1         
	//   61  126:invokevirtual   #197 <Method void FieldSet.clearField(FieldSet$FieldDescriptorLite)>
			return this;
	//   62  129:aload_0         
	//   63  130:areturn         
		}
		fields.setField(((rLite) (ptor)), obj);
	//   64  131:aload_0         
	//   65  132:getfield        #32  <Field FieldSet fields>
	//   66  135:aload_1         
	//   67  136:aload_2         
	//   68  137:invokevirtual   #387 <Method void FieldSet.setField(FieldSet$FieldDescriptorLite, Object)>
		return this;
	//   69  140:aload_0         
	//   70  141:areturn         
	}

	public volatile Message.Builder setField(ptor ptor, Object obj)
	{
		return ((Message.Builder) (setField(ptor, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #389 <Method DynamicMessage$Builder setField(Descriptors$FieldDescriptor, Object)>
	//    4    6:areturn         
	}

	public DynamicMessage$Builder setRepeatedField(ptor ptor, int i, Object obj)
	{
		verifyContainingType(ptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		ensureIsMutable();
	//    3    5:aload_0         
	//    4    6:invokespecial   #162 <Method void ensureIsMutable()>
		fields.setRepeatedField(((rLite) (ptor)), i, obj);
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field FieldSet fields>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #394 <Method void FieldSet.setRepeatedField(FieldSet$FieldDescriptorLite, int, Object)>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public volatile Message.Builder setRepeatedField(ptor ptor, int i, Object obj)
	{
		return ((Message.Builder) (setRepeatedField(ptor, i, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #397 <Method DynamicMessage$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
	//    5    7:areturn         
	}

	public DynamicMessage$Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		if(getDescriptorForType().getFile().getSyntax() == tor.Syntax.PROTO3 && CodedInputStream.getProto3DiscardUnknownFieldsDefault())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #328 <Method Descriptors$Descriptor getDescriptorForType()>
	//*   2    4:invokevirtual   #332 <Method Descriptors$FileDescriptor Descriptors$Descriptor.getFile()>
	//*   3    7:invokevirtual   #338 <Method Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor.getSyntax()>
	//*   4   10:getstatic       #344 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO3>
	//*   5   13:if_acmpne       24
	//*   6   16:invokestatic    #349 <Method boolean CodedInputStream.getProto3DiscardUnknownFieldsDefault()>
	//*   7   19:ifeq            24
		{
			return this;
	//    8   22:aload_0         
	//    9   23:areturn         
		} else
		{
			unknownFields = unknownfieldset;
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:putfield        #40  <Field UnknownFieldSet unknownFields>
			return this;
	//   13   29:aload_0         
	//   14   30:areturn         
		}
	}

	public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
	{
		return ((Message.Builder) (setUnknownFields(unknownfieldset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #400 <Method DynamicMessage$Builder setUnknownFields(UnknownFieldSet)>
	//    3    5:areturn         
	}

	private FieldSet fields;
	private final ptor oneofCases[];
	private final Descriptors$Descriptor type;
	private UnknownFieldSet unknownFields;


/*
	static DynamicMessage access$000(DynamicMessage$Builder dynamicmessage$builder)
		throws InvalidProtocolBufferException
	{
		return dynamicmessage$builder.buildParsed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method DynamicMessage buildParsed()>
	//    2    4:areturn         
	}

*/

	private DynamicMessage$Builder(Descriptors$Descriptor descriptors$descriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractMessage$Builder()>
		type = descriptors$descriptor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Descriptors$Descriptor type>
		fields = FieldSet.newFieldSet();
	//    5    9:aload_0         
	//    6   10:invokestatic    #30  <Method FieldSet FieldSet.newFieldSet()>
	//    7   13:putfield        #32  <Field FieldSet fields>
		unknownFields = UnknownFieldSet.getDefaultInstance();
	//    8   16:aload_0         
	//    9   17:invokestatic    #38  <Method UnknownFieldSet UnknownFieldSet.getDefaultInstance()>
	//   10   20:putfield        #40  <Field UnknownFieldSet unknownFields>
		oneofCases = new ptor[descriptors$descriptor.toProto().getOneofDeclCount()];
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #46  <Method DescriptorProtos$DescriptorProto Descriptors$Descriptor.toProto()>
	//   14   28:invokevirtual   #52  <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
	//   15   31:anewarray       ptor[]
	//   16   34:putfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
	//   17   37:return          
	}

	DynamicMessage$Builder(Descriptors$Descriptor descriptors$descriptor, DynamicMessage._cls1 _pcls1)
	{
		this(descriptors$descriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void DynamicMessage$Builder(Descriptors$Descriptor)>
	//    3    5:return          
	}
}
