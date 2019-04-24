// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			AbstractMessage, FieldSet, UnknownFieldSet, Message, 
//			InvalidProtocolBufferException, ByteString, ExtensionRegistry, CodedInputStream, 
//			MessageLite, Parser, CodedOutputStream, UninitializedMessageException, 
//			Internal, AbstractParser, ExtensionRegistryLite

public final class DynamicMessage extends AbstractMessage
{
	public static final class Builder extends AbstractMessage.Builder
	{

		private DynamicMessage buildParsed()
			throws InvalidProtocolBufferException
		{
			if(!isInitialized())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #73  <Method boolean isInitialized()>
		//*   2    4:ifne            48
				throw newUninitializedMessageException(((Message) (new DynamicMessage(type, fields, (Descriptors.FieldDescriptor[])Arrays.copyOf(((Object []) (oneofCases)), oneofCases.length), unknownFields)))).asInvalidProtocolBufferException();
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

		private void ensureEnumValueDescriptor(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			if(fielddescriptor.isRepeated())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #101 <Method boolean Descriptors$FieldDescriptor.isRepeated()>
		//*   2    4:ifeq            41
			{
				for(obj = ((Object) (((List)obj).iterator())); ((Iterator) (obj)).hasNext(); ensureSingularEnumValueDescriptor(fielddescriptor, ((Iterator) (obj)).next()));
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
				ensureSingularEnumValueDescriptor(fielddescriptor, obj);
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

		private void ensureSingularEnumValueDescriptor(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			Internal.checkNotNull(obj);
		//    0    0:aload_2         
		//    1    1:invokestatic    #132 <Method Object Internal.checkNotNull(Object)>
		//    2    4:pop             
			if(!(obj instanceof Descriptors.EnumValueDescriptor))
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

		private void verifyContainingType(Descriptors.FieldDescriptor fielddescriptor)
		{
			if(fielddescriptor.getContainingType() != type)
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

		private void verifyOneofContainingType(Descriptors.OneofDescriptor oneofdescriptor)
		{
			if(oneofdescriptor.getContainingType() != type)
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

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			verifyContainingType(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
			ensureIsMutable();
		//    3    5:aload_0         
		//    4    6:invokespecial   #162 <Method void ensureIsMutable()>
			fields.addRepeatedField(((FieldSet.FieldDescriptorLite) (fielddescriptor)), obj);
		//    5    9:aload_0         
		//    6   10:getfield        #32  <Field FieldSet fields>
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:invokevirtual   #165 <Method void FieldSet.addRepeatedField(FieldSet$FieldDescriptorLite, Object)>
			return this;
		//   10   18:aload_0         
		//   11   19:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
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
				throw newUninitializedMessageException(((Message) (new DynamicMessage(type, fields, (Descriptors.FieldDescriptor[])Arrays.copyOf(((Object []) (oneofCases)), oneofCases.length), unknownFields))));
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
			return new DynamicMessage(type, fields, (Descriptors.FieldDescriptor[])Arrays.copyOf(((Object []) (oneofCases)), oneofCases.length), unknownFields);
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

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #181 <Method DynamicMessage$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
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

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			verifyContainingType(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
			ensureIsMutable();
		//    3    5:aload_0         
		//    4    6:invokespecial   #162 <Method void ensureIsMutable()>
			Descriptors.OneofDescriptor oneofdescriptor = fielddescriptor.getContainingOneof();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #191 <Method Descriptors$OneofDescriptor Descriptors$FieldDescriptor.getContainingOneof()>
		//    7   13:astore_3        
			if(oneofdescriptor != null)
		//*   8   14:aload_3         
		//*   9   15:ifnull          40
			{
				int i = oneofdescriptor.getIndex();
		//   10   18:aload_3         
		//   11   19:invokevirtual   #194 <Method int Descriptors$OneofDescriptor.getIndex()>
		//   12   22:istore_2        
				if(oneofCases[i] == fielddescriptor)
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
			fields.clearField(((FieldSet.FieldDescriptorLite) (fielddescriptor)));
		//   24   40:aload_0         
		//   25   41:getfield        #32  <Field FieldSet fields>
		//   26   44:aload_1         
		//   27   45:invokevirtual   #197 <Method void FieldSet.clearField(FieldSet$FieldDescriptorLite)>
			return this;
		//   28   48:aload_0         
		//   29   49:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #200 <Method DynamicMessage$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #205 <Method DynamicMessage$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			verifyOneofContainingType(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #207 <Method void verifyOneofContainingType(Descriptors$OneofDescriptor)>
			oneofdescriptor = ((Descriptors.OneofDescriptor) (oneofCases[oneofdescriptor.getIndex()]));
		//    3    5:aload_0         
		//    4    6:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #194 <Method int Descriptors$OneofDescriptor.getIndex()>
		//    7   13:aaload          
		//    8   14:astore_1        
			if(oneofdescriptor != null)
		//*   9   15:aload_1         
		//*  10   16:ifnull          25
				clearField(((Descriptors.FieldDescriptor) (oneofdescriptor)));
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #200 <Method DynamicMessage$Builder clearField(Descriptors$FieldDescriptor)>
		//   14   24:pop             
			return this;
		//   15   25:aload_0         
		//   16   26:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #205 <Method DynamicMessage$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #210 <Method DynamicMessage$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #210 <Method DynamicMessage$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			Builder builder = new Builder(type);
		//    0    0:new             #2   <Class DynamicMessage$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field Descriptors$Descriptor type>
		//    4    8:invokespecial   #60  <Method void DynamicMessage$Builder(Descriptors$Descriptor)>
		//    5   11:astore_1        
			builder.fields.mergeFrom(fields);
		//    6   12:aload_1         
		//    7   13:getfield        #32  <Field FieldSet fields>
		//    8   16:aload_0         
		//    9   17:getfield        #32  <Field FieldSet fields>
		//   10   20:invokevirtual   #215 <Method void FieldSet.mergeFrom(FieldSet)>
			builder.mergeUnknownFields(unknownFields);
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #40  <Field UnknownFieldSet unknownFields>
		//   14   28:invokevirtual   #219 <Method DynamicMessage$Builder mergeUnknownFields(UnknownFieldSet)>
		//   15   31:pop             
			System.arraycopy(((Object) (oneofCases)), 0, ((Object) (builder.oneofCases)), 0, oneofCases.length);
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
			return builder;
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

		public Descriptors.Descriptor getDescriptorForType()
		{
			return type;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Descriptors$Descriptor type>
		//    2    4:areturn         
		}

		public Object getField(Descriptors.FieldDescriptor fielddescriptor)
		{
			verifyContainingType(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
			Object obj1 = fields.getField(((FieldSet.FieldDescriptorLite) (fielddescriptor)));
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
				if(fielddescriptor.isRepeated())
		//*  12   20:aload_1         
		//*  13   21:invokevirtual   #101 <Method boolean Descriptors$FieldDescriptor.isRepeated()>
		//*  14   24:ifeq            31
					return ((Object) (Collections.emptyList()));
		//   15   27:invokestatic    #251 <Method List Collections.emptyList()>
		//   16   30:areturn         
				if(fielddescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE)
		//*  17   31:aload_1         
		//*  18   32:invokevirtual   #255 <Method Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor.getJavaType()>
		//*  19   35:getstatic       #261 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//*  20   38:if_acmpne       49
					return ((Object) (DynamicMessage.getDefaultInstance(fielddescriptor.getMessageType())));
		//   21   41:aload_1         
		//   22   42:invokevirtual   #264 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getMessageType()>
		//   23   45:invokestatic    #237 <Method DynamicMessage DynamicMessage.getDefaultInstance(Descriptors$Descriptor)>
		//   24   48:areturn         
				obj = fielddescriptor.getDefaultValue();
		//   25   49:aload_1         
		//   26   50:invokevirtual   #267 <Method Object Descriptors$FieldDescriptor.getDefaultValue()>
		//   27   53:astore_2        
			}
			return obj;
		//   28   54:aload_2         
		//   29   55:areturn         
		}

		public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fielddescriptor)
		{
			throw new UnsupportedOperationException("getFieldBuilder() called on a dynamic message type.");
		//    0    0:new             #270 <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc2            #272 <String "getFieldBuilder() called on a dynamic message type.">
		//    3    7:invokespecial   #273 <Method void UnsupportedOperationException(String)>
		//    4   10:athrow          
		}

		public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofdescriptor)
		{
			verifyOneofContainingType(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #207 <Method void verifyOneofContainingType(Descriptors$OneofDescriptor)>
			return oneofCases[oneofdescriptor.getIndex()];
		//    3    5:aload_0         
		//    4    6:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #194 <Method int Descriptors$OneofDescriptor.getIndex()>
		//    7   13:aaload          
		//    8   14:areturn         
		}

		public Object getRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i)
		{
			verifyContainingType(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
			return fields.getRepeatedField(((FieldSet.FieldDescriptorLite) (fielddescriptor)), i);
		//    3    5:aload_0         
		//    4    6:getfield        #32  <Field FieldSet fields>
		//    5    9:aload_1         
		//    6   10:iload_2         
		//    7   11:invokevirtual   #280 <Method Object FieldSet.getRepeatedField(FieldSet$FieldDescriptorLite, int)>
		//    8   14:areturn         
		}

		public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fielddescriptor, int i)
		{
			throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a dynamic message type.");
		//    0    0:new             #270 <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc2            #284 <String "getRepeatedFieldBuilder() called on a dynamic message type.">
		//    3    7:invokespecial   #273 <Method void UnsupportedOperationException(String)>
		//    4   10:athrow          
		}

		public int getRepeatedFieldCount(Descriptors.FieldDescriptor fielddescriptor)
		{
			verifyContainingType(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
			return fields.getRepeatedFieldCount(((FieldSet.FieldDescriptorLite) (fielddescriptor)));
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

		public boolean hasField(Descriptors.FieldDescriptor fielddescriptor)
		{
			verifyContainingType(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
			return fields.hasField(((FieldSet.FieldDescriptorLite) (fielddescriptor)));
		//    3    5:aload_0         
		//    4    6:getfield        #32  <Field FieldSet fields>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #295 <Method boolean FieldSet.hasField(FieldSet$FieldDescriptorLite)>
		//    7   13:ireturn         
		}

		public boolean hasOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			verifyOneofContainingType(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #207 <Method void verifyOneofContainingType(Descriptors$OneofDescriptor)>
			return oneofCases[oneofdescriptor.getIndex()] != null;
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

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #304 <Method DynamicMessage$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public Builder mergeFrom(Message message)
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
				if(((DynamicMessage) (message)).type != type)
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
				fields.mergeFrom(((DynamicMessage) (message)).fields);
		//   18   38:aload_0         
		//   19   39:getfield        #32  <Field FieldSet fields>
		//   20   42:aload_1         
		//   21   43:invokestatic    #314 <Method FieldSet DynamicMessage.access$300(DynamicMessage)>
		//   22   46:invokevirtual   #215 <Method void FieldSet.mergeFrom(FieldSet)>
				mergeUnknownFields(((DynamicMessage) (message)).unknownFields);
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
						oneofCases[i] = ((DynamicMessage) (message)).oneofCases[i];
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
					if(((DynamicMessage) (message)).oneofCases[i] != null && oneofCases[i] != ((DynamicMessage) (message)).oneofCases[i])
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
						fields.clearField(((FieldSet.FieldDescriptorLite) (oneofCases[i])));
		//   63  117:aload_0         
		//   64  118:getfield        #32  <Field FieldSet fields>
		//   65  121:aload_0         
		//   66  122:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
		//   67  125:iload_2         
		//   68  126:aaload          
		//   69  127:invokevirtual   #197 <Method void FieldSet.clearField(FieldSet$FieldDescriptorLite)>
						oneofCases[i] = ((DynamicMessage) (message)).oneofCases[i];
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
				return (Builder)super.mergeFrom(message);
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

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #219 <Method DynamicMessage$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			if(getDescriptorForType().getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3 && CodedInputStream.getProto3DiscardUnknownFieldsDefault())
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

		public Builder newBuilderForField(Descriptors.FieldDescriptor fielddescriptor)
		{
			verifyContainingType(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
			if(fielddescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE)
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
				return new Builder(fielddescriptor.getMessageType());
		//   12   26:new             #2   <Class DynamicMessage$Builder>
		//   13   29:dup             
		//   14   30:aload_1         
		//   15   31:invokevirtual   #264 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getMessageType()>
		//   16   34:invokespecial   #60  <Method void DynamicMessage$Builder(Descriptors$Descriptor)>
		//   17   37:areturn         
		}

		public volatile Message.Builder newBuilderForField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (newBuilderForField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #365 <Method DynamicMessage$Builder newBuilderForField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			verifyContainingType(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
			ensureIsMutable();
		//    3    5:aload_0         
		//    4    6:invokespecial   #162 <Method void ensureIsMutable()>
			if(fielddescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM)
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #370 <Method Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor.getType()>
		//*   7   13:getstatic       #376 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.ENUM>
		//*   8   16:if_acmpne       25
				ensureEnumValueDescriptor(fielddescriptor, obj);
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:invokespecial   #378 <Method void ensureEnumValueDescriptor(Descriptors$FieldDescriptor, Object)>
			Object obj1 = ((Object) (fielddescriptor.getContainingOneof()));
		//   13   25:aload_1         
		//   14   26:invokevirtual   #191 <Method Descriptors$OneofDescriptor Descriptors$FieldDescriptor.getContainingOneof()>
		//   15   29:astore          4
			if(obj1 != null)
		//*  16   31:aload           4
		//*  17   33:ifnull          80
			{
				int i = ((Descriptors.OneofDescriptor) (obj1)).getIndex();
		//   18   36:aload           4
		//   19   38:invokevirtual   #194 <Method int Descriptors$OneofDescriptor.getIndex()>
		//   20   41:istore_3        
				obj1 = ((Object) (oneofCases[i]));
		//   21   42:aload_0         
		//   22   43:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
		//   23   46:iload_3         
		//   24   47:aaload          
		//   25   48:astore          4
				if(obj1 != null && obj1 != fielddescriptor)
		//*  26   50:aload           4
		//*  27   52:ifnull          70
		//*  28   55:aload           4
		//*  29   57:aload_1         
		//*  30   58:if_acmpeq       70
					fields.clearField(((FieldSet.FieldDescriptorLite) (obj1)));
		//   31   61:aload_0         
		//   32   62:getfield        #32  <Field FieldSet fields>
		//   33   65:aload           4
		//   34   67:invokevirtual   #197 <Method void FieldSet.clearField(FieldSet$FieldDescriptorLite)>
				oneofCases[i] = fielddescriptor;
		//   35   70:aload_0         
		//   36   71:getfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
		//   37   74:iload_3         
		//   38   75:aload_1         
		//   39   76:aastore         
			} else
		//*  40   77:goto            131
			if(fielddescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3 && !fielddescriptor.isRepeated() && fielddescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE && obj.equals(fielddescriptor.getDefaultValue()))
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
				fields.clearField(((FieldSet.FieldDescriptorLite) (fielddescriptor)));
		//   58  121:aload_0         
		//   59  122:getfield        #32  <Field FieldSet fields>
		//   60  125:aload_1         
		//   61  126:invokevirtual   #197 <Method void FieldSet.clearField(FieldSet$FieldDescriptorLite)>
				return this;
		//   62  129:aload_0         
		//   63  130:areturn         
			}
			fields.setField(((FieldSet.FieldDescriptorLite) (fielddescriptor)), obj);
		//   64  131:aload_0         
		//   65  132:getfield        #32  <Field FieldSet fields>
		//   66  135:aload_1         
		//   67  136:aload_2         
		//   68  137:invokevirtual   #387 <Method void FieldSet.setField(FieldSet$FieldDescriptorLite, Object)>
			return this;
		//   69  140:aload_0         
		//   70  141:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #389 <Method DynamicMessage$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			verifyContainingType(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #160 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
			ensureIsMutable();
		//    3    5:aload_0         
		//    4    6:invokespecial   #162 <Method void ensureIsMutable()>
			fields.setRepeatedField(((FieldSet.FieldDescriptorLite) (fielddescriptor)), i, obj);
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

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #397 <Method DynamicMessage$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			if(getDescriptorForType().getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3 && CodedInputStream.getProto3DiscardUnknownFieldsDefault())
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
		private final Descriptors.FieldDescriptor oneofCases[];
		private final Descriptors.Descriptor type;
		private UnknownFieldSet unknownFields;


/*
		static DynamicMessage access$000(Builder builder)
			throws InvalidProtocolBufferException
		{
			return builder.buildParsed();
		//    0    0:aload_0         
		//    1    1:invokespecial   #68  <Method DynamicMessage buildParsed()>
		//    2    4:areturn         
		}

*/

		private Builder(Descriptors.Descriptor descriptor)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void AbstractMessage$Builder()>
			type = descriptor;
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
			oneofCases = new Descriptors.FieldDescriptor[descriptor.toProto().getOneofDeclCount()];
		//   11   23:aload_0         
		//   12   24:aload_1         
		//   13   25:invokevirtual   #46  <Method DescriptorProtos$DescriptorProto Descriptors$Descriptor.toProto()>
		//   14   28:invokevirtual   #52  <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
		//   15   31:anewarray       Descriptors.FieldDescriptor[]
		//   16   34:putfield        #56  <Field Descriptors$FieldDescriptor[] oneofCases>
		//   17   37:return          
		}

	}


	DynamicMessage(Descriptors.Descriptor descriptor, FieldSet fieldset, Descriptors.FieldDescriptor afielddescriptor[], UnknownFieldSet unknownfieldset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractMessage()>
		memoizedSize = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #27  <Field int memoizedSize>
		type = descriptor;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field Descriptors$Descriptor type>
		fields = fieldset;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #31  <Field FieldSet fields>
		oneofCases = afielddescriptor;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #33  <Field Descriptors$FieldDescriptor[] oneofCases>
		unknownFields = unknownfieldset;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #35  <Field UnknownFieldSet unknownFields>
	//   17   30:return          
	}

	public static DynamicMessage getDefaultInstance(Descriptors.Descriptor descriptor)
	{
		Descriptors.FieldDescriptor afielddescriptor[] = new Descriptors.FieldDescriptor[descriptor.toProto().getOneofDeclCount()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method DescriptorProtos$DescriptorProto Descriptors$Descriptor.toProto()>
	//    2    4:invokevirtual   #60  <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
	//    3    7:anewarray       Descriptors.FieldDescriptor[]
	//    4   10:astore_1        
		return new DynamicMessage(descriptor, FieldSet.emptySet(), afielddescriptor, UnknownFieldSet.getDefaultInstance());
	//    5   11:new             #2   <Class DynamicMessage>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokestatic    #68  <Method FieldSet FieldSet.emptySet()>
	//    9   19:aload_1         
	//   10   20:invokestatic    #73  <Method UnknownFieldSet UnknownFieldSet.getDefaultInstance()>
	//   11   23:invokespecial   #75  <Method void DynamicMessage(Descriptors$Descriptor, FieldSet, Descriptors$FieldDescriptor[], UnknownFieldSet)>
	//   12   26:areturn         
	}

	static boolean isInitialized(Descriptors.Descriptor descriptor, FieldSet fieldset)
	{
		for(descriptor = ((Descriptors.Descriptor) (descriptor.getFields().iterator())); ((Iterator) (descriptor)).hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #81  <Method List Descriptors$Descriptor.getFields()>
	//*   2    4:invokeinterface #87  <Method Iterator List.iterator()>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            49
		{
			Descriptors.FieldDescriptor fielddescriptor = (Descriptors.FieldDescriptor)((Iterator) (descriptor)).next();
	//    7   19:aload_0         
	//    8   20:invokeinterface #97  <Method Object Iterator.next()>
	//    9   25:checkcast       #62  <Class Descriptors$FieldDescriptor>
	//   10   28:astore_2        
			if(fielddescriptor.isRequired() && !fieldset.hasField(((FieldSet.FieldDescriptorLite) (fielddescriptor))))
	//*  11   29:aload_2         
	//*  12   30:invokevirtual   #100 <Method boolean Descriptors$FieldDescriptor.isRequired()>
	//*  13   33:ifeq            46
	//*  14   36:aload_1         
	//*  15   37:aload_2         
	//*  16   38:invokevirtual   #104 <Method boolean FieldSet.hasField(FieldSet$FieldDescriptorLite)>
	//*  17   41:ifne            46
				return false;
	//   18   44:iconst_0        
	//   19   45:ireturn         
		}

	//*  20   46:goto            10
		return fieldset.isInitialized();
	//   21   49:aload_1         
	//   22   50:invokevirtual   #106 <Method boolean FieldSet.isInitialized()>
	//   23   53:ireturn         
	}

	public static Builder newBuilder(Descriptors.Descriptor descriptor)
	{
		return new Builder(descriptor);
	//    0    0:new             #8   <Class DynamicMessage$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #112 <Method void DynamicMessage$Builder(Descriptors$Descriptor, DynamicMessage$1)>
	//    5    9:areturn         
	}

	public static Builder newBuilder(Message message)
	{
		return (new Builder(message.getDescriptorForType())).mergeFrom(message);
	//    0    0:new             #8   <Class DynamicMessage$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #119 <Method Descriptors$Descriptor Message.getDescriptorForType()>
	//    4   10:aconst_null     
	//    5   11:invokespecial   #112 <Method void DynamicMessage$Builder(Descriptors$Descriptor, DynamicMessage$1)>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #122 <Method DynamicMessage$Builder DynamicMessage$Builder.mergeFrom(Message)>
	//    8   18:areturn         
	}

	public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return ((Builder)newBuilder(descriptor).mergeFrom(bytestring)).buildParsed();
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method DynamicMessage$Builder newBuilder(Descriptors$Descriptor)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #131 <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(ByteString)>
	//    4    8:checkcast       #8   <Class DynamicMessage$Builder>
	//    5   11:invokestatic    #135 <Method DynamicMessage DynamicMessage$Builder.access$000(DynamicMessage$Builder)>
	//    6   14:areturn         
	}

	public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, ByteString bytestring, ExtensionRegistry extensionregistry)
		throws InvalidProtocolBufferException
	{
		return ((Builder)newBuilder(descriptor).mergeFrom(bytestring, ((ExtensionRegistryLite) (extensionregistry)))).buildParsed();
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method DynamicMessage$Builder newBuilder(Descriptors$Descriptor)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #140 <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(ByteString, ExtensionRegistryLite)>
	//    5    9:checkcast       #8   <Class DynamicMessage$Builder>
	//    6   12:invokestatic    #135 <Method DynamicMessage DynamicMessage$Builder.access$000(DynamicMessage$Builder)>
	//    7   15:areturn         
	}

	public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, CodedInputStream codedinputstream)
		throws IOException
	{
		return ((Builder)newBuilder(descriptor).mergeFrom(codedinputstream)).buildParsed();
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method DynamicMessage$Builder newBuilder(Descriptors$Descriptor)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #146 <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(CodedInputStream)>
	//    4    8:checkcast       #8   <Class DynamicMessage$Builder>
	//    5   11:invokestatic    #135 <Method DynamicMessage DynamicMessage$Builder.access$000(DynamicMessage$Builder)>
	//    6   14:areturn         
	}

	public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, CodedInputStream codedinputstream, ExtensionRegistry extensionregistry)
		throws IOException
	{
		return ((Builder)newBuilder(descriptor).mergeFrom(codedinputstream, ((ExtensionRegistryLite) (extensionregistry)))).buildParsed();
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method DynamicMessage$Builder newBuilder(Descriptors$Descriptor)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #150 <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    5    9:checkcast       #8   <Class DynamicMessage$Builder>
	//    6   12:invokestatic    #135 <Method DynamicMessage DynamicMessage$Builder.access$000(DynamicMessage$Builder)>
	//    7   15:areturn         
	}

	public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, InputStream inputstream)
		throws IOException
	{
		return ((Builder)newBuilder(descriptor).mergeFrom(inputstream)).buildParsed();
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method DynamicMessage$Builder newBuilder(Descriptors$Descriptor)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #154 <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(InputStream)>
	//    4    8:checkcast       #8   <Class DynamicMessage$Builder>
	//    5   11:invokestatic    #135 <Method DynamicMessage DynamicMessage$Builder.access$000(DynamicMessage$Builder)>
	//    6   14:areturn         
	}

	public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, InputStream inputstream, ExtensionRegistry extensionregistry)
		throws IOException
	{
		return ((Builder)newBuilder(descriptor).mergeFrom(inputstream, ((ExtensionRegistryLite) (extensionregistry)))).buildParsed();
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method DynamicMessage$Builder newBuilder(Descriptors$Descriptor)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #158 <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(InputStream, ExtensionRegistryLite)>
	//    5    9:checkcast       #8   <Class DynamicMessage$Builder>
	//    6   12:invokestatic    #135 <Method DynamicMessage DynamicMessage$Builder.access$000(DynamicMessage$Builder)>
	//    7   15:areturn         
	}

	public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return ((Builder)newBuilder(descriptor).mergeFrom(abyte0)).buildParsed();
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method DynamicMessage$Builder newBuilder(Descriptors$Descriptor)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #162 <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(byte[])>
	//    4    8:checkcast       #8   <Class DynamicMessage$Builder>
	//    5   11:invokestatic    #135 <Method DynamicMessage DynamicMessage$Builder.access$000(DynamicMessage$Builder)>
	//    6   14:areturn         
	}

	public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, byte abyte0[], ExtensionRegistry extensionregistry)
		throws InvalidProtocolBufferException
	{
		return ((Builder)newBuilder(descriptor).mergeFrom(abyte0, ((ExtensionRegistryLite) (extensionregistry)))).buildParsed();
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method DynamicMessage$Builder newBuilder(Descriptors$Descriptor)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #166 <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(byte[], ExtensionRegistryLite)>
	//    5    9:checkcast       #8   <Class DynamicMessage$Builder>
	//    6   12:invokestatic    #135 <Method DynamicMessage DynamicMessage$Builder.access$000(DynamicMessage$Builder)>
	//    7   15:areturn         
	}

	private void verifyContainingType(Descriptors.FieldDescriptor fielddescriptor)
	{
		if(fielddescriptor.getContainingType() != type)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #171 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getContainingType()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field Descriptors$Descriptor type>
	//*   4    8:if_acmpeq       21
			throw new IllegalArgumentException("FieldDescriptor does not match message type.");
	//    5   11:new             #173 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #175 <String "FieldDescriptor does not match message type.">
	//    8   17:invokespecial   #178 <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		else
			return;
	//   10   21:return          
	}

	private void verifyOneofContainingType(Descriptors.OneofDescriptor oneofdescriptor)
	{
		if(oneofdescriptor.getContainingType() != type)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #183 <Method Descriptors$Descriptor Descriptors$OneofDescriptor.getContainingType()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field Descriptors$Descriptor type>
	//*   4    8:if_acmpeq       21
			throw new IllegalArgumentException("OneofDescriptor does not match message type.");
	//    5   11:new             #173 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #185 <String "OneofDescriptor does not match message type.">
	//    8   17:invokespecial   #178 <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		else
			return;
	//   10   21:return          
	}

	public Map getAllFields()
	{
		return fields.getAllFields();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field FieldSet fields>
	//    2    4:invokevirtual   #189 <Method Map FieldSet.getAllFields()>
	//    3    7:areturn         
	}

	public DynamicMessage getDefaultInstanceForType()
	{
		return getDefaultInstance(type);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Descriptors$Descriptor type>
	//    2    4:invokestatic    #194 <Method DynamicMessage getDefaultInstance(Descriptors$Descriptor)>
	//    3    7:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method DynamicMessage getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method DynamicMessage getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getDescriptorForType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Descriptors$Descriptor type>
	//    2    4:areturn         
	}

	public Object getField(Descriptors.FieldDescriptor fielddescriptor)
	{
		verifyContainingType(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #202 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		Object obj1 = fields.getField(((FieldSet.FieldDescriptorLite) (fielddescriptor)));
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field FieldSet fields>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #205 <Method Object FieldSet.getField(FieldSet$FieldDescriptorLite)>
	//    7   13:astore_3        
		Object obj = obj1;
	//    8   14:aload_3         
	//    9   15:astore_2        
		if(obj1 == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       54
		{
			if(fielddescriptor.isRepeated())
	//*  12   20:aload_1         
	//*  13   21:invokevirtual   #208 <Method boolean Descriptors$FieldDescriptor.isRepeated()>
	//*  14   24:ifeq            31
				return ((Object) (Collections.emptyList()));
	//   15   27:invokestatic    #213 <Method List Collections.emptyList()>
	//   16   30:areturn         
			if(fielddescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE)
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #217 <Method Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor.getJavaType()>
	//*  19   35:getstatic       #223 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//*  20   38:if_acmpne       49
				return ((Object) (getDefaultInstance(fielddescriptor.getMessageType())));
	//   21   41:aload_1         
	//   22   42:invokevirtual   #226 <Method Descriptors$Descriptor Descriptors$FieldDescriptor.getMessageType()>
	//   23   45:invokestatic    #194 <Method DynamicMessage getDefaultInstance(Descriptors$Descriptor)>
	//   24   48:areturn         
			obj = fielddescriptor.getDefaultValue();
	//   25   49:aload_1         
	//   26   50:invokevirtual   #229 <Method Object Descriptors$FieldDescriptor.getDefaultValue()>
	//   27   53:astore_2        
		}
		return obj;
	//   28   54:aload_2         
	//   29   55:areturn         
	}

	public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofdescriptor)
	{
		verifyOneofContainingType(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #233 <Method void verifyOneofContainingType(Descriptors$OneofDescriptor)>
		return oneofCases[oneofdescriptor.getIndex()];
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field Descriptors$FieldDescriptor[] oneofCases>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #236 <Method int Descriptors$OneofDescriptor.getIndex()>
	//    7   13:aaload          
	//    8   14:areturn         
	}

	public Parser getParserForType()
	{
		return ((Parser) (new AbstractParser() {

			public DynamicMessage parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				Builder builder = DynamicMessage.newBuilder(type);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field DynamicMessage this$0>
			//    2    4:invokestatic    #30  <Method Descriptors$Descriptor DynamicMessage.access$200(DynamicMessage)>
			//    3    7:invokestatic    #34  <Method DynamicMessage$Builder DynamicMessage.newBuilder(Descriptors$Descriptor)>
			//    4   10:astore_3        
				try
				{
					builder.mergeFrom(codedinputstream, extensionregistrylite);
			//    5   11:aload_3         
			//    6   12:aload_1         
			//    7   13:aload_2         
			//    8   14:invokevirtual   #40  <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
			//    9   17:pop             
				}
			//*  10   18:goto            48
				// Misplaced declaration of an exception variable
				catch(CodedInputStream codedinputstream)
			//*  11   21:astore_1        
				{
					throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (builder.buildPartial())));
			//   12   22:aload_1         
			//   13   23:aload_3         
			//   14   24:invokevirtual   #44  <Method DynamicMessage DynamicMessage$Builder.buildPartial()>
			//   15   27:invokevirtual   #48  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
			//   16   30:athrow          
				}
				// Misplaced declaration of an exception variable
				catch(CodedInputStream codedinputstream)
			//*  17   31:astore_1        
				{
					throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (builder.buildPartial())));
			//   18   32:new             #24  <Class InvalidProtocolBufferException>
			//   19   35:dup             
			//   20   36:aload_1         
			//   21   37:invokespecial   #51  <Method void InvalidProtocolBufferException(IOException)>
			//   22   40:aload_3         
			//   23   41:invokevirtual   #44  <Method DynamicMessage DynamicMessage$Builder.buildPartial()>
			//   24   44:invokevirtual   #48  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
			//   25   47:athrow          
				}
				return builder.buildPartial();
			//   26   48:aload_3         
			//   27   49:invokevirtual   #44  <Method DynamicMessage DynamicMessage$Builder.buildPartial()>
			//   28   52:areturn         
			}

			public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
				throws InvalidProtocolBufferException
			{
				return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #55  <Method DynamicMessage parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
			//    4    6:areturn         
			}

			final DynamicMessage this$0;

			
			{
				this$0 = DynamicMessage.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DynamicMessage this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void AbstractParser()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #6   <Class DynamicMessage$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #241 <Method void DynamicMessage$1(DynamicMessage)>
	//    4    8:areturn         
	}

	public Object getRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i)
	{
		verifyContainingType(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #202 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		return fields.getRepeatedField(((FieldSet.FieldDescriptorLite) (fielddescriptor)), i);
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field FieldSet fields>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #247 <Method Object FieldSet.getRepeatedField(FieldSet$FieldDescriptorLite, int)>
	//    8   14:areturn         
	}

	public int getRepeatedFieldCount(Descriptors.FieldDescriptor fielddescriptor)
	{
		verifyContainingType(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #202 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		return fields.getRepeatedFieldCount(((FieldSet.FieldDescriptorLite) (fielddescriptor)));
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field FieldSet fields>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #252 <Method int FieldSet.getRepeatedFieldCount(FieldSet$FieldDescriptorLite)>
	//    7   13:ireturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int memoizedSize>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		if(type.getOptions().getMessageSetWireFormat())
	//*   8   12:aload_0         
	//*   9   13:getfield        #29  <Field Descriptors$Descriptor type>
	//*  10   16:invokevirtual   #257 <Method DescriptorProtos$MessageOptions Descriptors$Descriptor.getOptions()>
	//*  11   19:invokevirtual   #262 <Method boolean DescriptorProtos$MessageOptions.getMessageSetWireFormat()>
	//*  12   22:ifeq            44
			i = fields.getMessageSetSerializedSize() + unknownFields.getSerializedSizeAsMessageSet();
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field FieldSet fields>
	//   15   29:invokevirtual   #265 <Method int FieldSet.getMessageSetSerializedSize()>
	//   16   32:aload_0         
	//   17   33:getfield        #35  <Field UnknownFieldSet unknownFields>
	//   18   36:invokevirtual   #268 <Method int UnknownFieldSet.getSerializedSizeAsMessageSet()>
	//   19   39:iadd            
	//   20   40:istore_1        
		else
	//*  21   41:goto            60
			i = fields.getSerializedSize() + unknownFields.getSerializedSize();
	//   22   44:aload_0         
	//   23   45:getfield        #31  <Field FieldSet fields>
	//   24   48:invokevirtual   #270 <Method int FieldSet.getSerializedSize()>
	//   25   51:aload_0         
	//   26   52:getfield        #35  <Field UnknownFieldSet unknownFields>
	//   27   55:invokevirtual   #271 <Method int UnknownFieldSet.getSerializedSize()>
	//   28   58:iadd            
	//   29   59:istore_1        
		memoizedSize = i;
	//   30   60:aload_0         
	//   31   61:iload_1         
	//   32   62:putfield        #27  <Field int memoizedSize>
		return i;
	//   33   65:iload_1         
	//   34   66:ireturn         
	}

	public UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasField(Descriptors.FieldDescriptor fielddescriptor)
	{
		verifyContainingType(fielddescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #202 <Method void verifyContainingType(Descriptors$FieldDescriptor)>
		return fields.hasField(((FieldSet.FieldDescriptorLite) (fielddescriptor)));
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field FieldSet fields>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #104 <Method boolean FieldSet.hasField(FieldSet$FieldDescriptorLite)>
	//    7   13:ireturn         
	}

	public boolean hasOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		verifyOneofContainingType(oneofdescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #233 <Method void verifyOneofContainingType(Descriptors$OneofDescriptor)>
		return oneofCases[oneofdescriptor.getIndex()] != null;
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field Descriptors$FieldDescriptor[] oneofCases>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #236 <Method int Descriptors$OneofDescriptor.getIndex()>
	//    7   13:aaload          
	//    8   14:ifnonnull       19
	//    9   17:iconst_0        
	//   10   18:ireturn         
	//   11   19:iconst_1        
	//   12   20:ireturn         
	}

	public boolean isInitialized()
	{
		return isInitialized(type, fields);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Descriptors$Descriptor type>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field FieldSet fields>
	//    4    8:invokestatic    #277 <Method boolean isInitialized(Descriptors$Descriptor, FieldSet)>
	//    5   11:ireturn         
	}

	public Builder newBuilderForType()
	{
		return new Builder(type);
	//    0    0:new             #8   <Class DynamicMessage$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Descriptors$Descriptor type>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #112 <Method void DynamicMessage$Builder(Descriptors$Descriptor, DynamicMessage$1)>
	//    6   12:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method DynamicMessage$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method DynamicMessage$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		return newBuilderForType().mergeFrom(((Message) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method DynamicMessage$Builder newBuilderForType()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #122 <Method DynamicMessage$Builder DynamicMessage$Builder.mergeFrom(Message)>
	//    4    8:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #286 <Method DynamicMessage$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #286 <Method DynamicMessage$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(type.getOptions().getMessageSetWireFormat())
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Descriptors$Descriptor type>
	//*   2    4:invokevirtual   #257 <Method DescriptorProtos$MessageOptions Descriptors$Descriptor.getOptions()>
	//*   3    7:invokevirtual   #262 <Method boolean DescriptorProtos$MessageOptions.getMessageSetWireFormat()>
	//*   4   10:ifeq            30
		{
			fields.writeMessageSetTo(codedoutputstream);
	//    5   13:aload_0         
	//    6   14:getfield        #31  <Field FieldSet fields>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #291 <Method void FieldSet.writeMessageSetTo(CodedOutputStream)>
			unknownFields.writeAsMessageSetTo(codedoutputstream);
	//    9   21:aload_0         
	//   10   22:getfield        #35  <Field UnknownFieldSet unknownFields>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #294 <Method void UnknownFieldSet.writeAsMessageSetTo(CodedOutputStream)>
			return;
	//   13   29:return          
		} else
		{
			fields.writeTo(codedoutputstream);
	//   14   30:aload_0         
	//   15   31:getfield        #31  <Field FieldSet fields>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #296 <Method void FieldSet.writeTo(CodedOutputStream)>
			unknownFields.writeTo(codedoutputstream);
	//   18   38:aload_0         
	//   19   39:getfield        #35  <Field UnknownFieldSet unknownFields>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #297 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
			return;
	//   22   46:return          
		}
	}

	private final FieldSet fields;
	private int memoizedSize;
	private final Descriptors.FieldDescriptor oneofCases[];
	private final Descriptors.Descriptor type;
	private final UnknownFieldSet unknownFields;


/*
	static Descriptors.Descriptor access$200(DynamicMessage dynamicmessage)
	{
		return dynamicmessage.type;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Descriptors$Descriptor type>
	//    2    4:areturn         
	}

*/


/*
	static FieldSet access$300(DynamicMessage dynamicmessage)
	{
		return dynamicmessage.fields;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field FieldSet fields>
	//    2    4:areturn         
	}

*/


/*
	static UnknownFieldSet access$400(DynamicMessage dynamicmessage)
	{
		return dynamicmessage.unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

*/


/*
	static Descriptors.FieldDescriptor[] access$500(DynamicMessage dynamicmessage)
	{
		return dynamicmessage.oneofCases;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Descriptors$FieldDescriptor[] oneofCases>
	//    2    4:areturn         
	}

*/
}
