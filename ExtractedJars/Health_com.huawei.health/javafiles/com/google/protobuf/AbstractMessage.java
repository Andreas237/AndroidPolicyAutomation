// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			AbstractMessageLite, Message, ByteString, MapFieldLite, 
//			Internal, UnknownFieldSet, MessageReflection, TextFormat, 
//			UninitializedMessageException, CodedOutputStream, InvalidProtocolBufferException, ExtensionRegistry, 
//			CodedInputStream, ExtensionRegistryLite

public abstract class AbstractMessage extends AbstractMessageLite
	implements Message
{
	public static abstract class Builder extends AbstractMessageLite.Builder
		implements Message.Builder
	{

		protected static UninitializedMessageException newUninitializedMessageException(Message message)
		{
			return new UninitializedMessageException(MessageReflection.findMissingFields(((MessageOrBuilder) (message))));
		//    0    0:new             #19  <Class UninitializedMessageException>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokestatic    #25  <Method List MessageReflection.findMissingFields(MessageOrBuilder)>
		//    4    8:invokespecial   #28  <Method void UninitializedMessageException(List)>
		//    5   11:areturn         
		}

		public Builder clear()
		{
			for(Iterator iterator = getAllFields().entrySet().iterator(); iterator.hasNext(); clearField((Descriptors.FieldDescriptor)((java.util.Map.Entry)iterator.next()).getKey()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #34  <Method Map getAllFields()>
		//    2    4:invokeinterface #40  <Method Set Map.entrySet()>
		//    3    9:invokeinterface #46  <Method Iterator Set.iterator()>
		//    4   14:astore_1        
		//    5   15:aload_1         
		//    6   16:invokeinterface #52  <Method boolean Iterator.hasNext()>
		//    7   21:ifeq            49
		//    8   24:aload_0         
		//    9   25:aload_1         
		//   10   26:invokeinterface #56  <Method Object Iterator.next()>
		//   11   31:checkcast       #58  <Class java.util.Map$Entry>
		//   12   34:invokeinterface #61  <Method Object java.util.Map$Entry.getKey()>
		//   13   39:checkcast       #63  <Class Descriptors$FieldDescriptor>
		//   14   42:invokevirtual   #67  <Method Message$Builder clearField(Descriptors$FieldDescriptor)>
		//   15   45:pop             
		//*  16   46:goto            15
			return this;
		//   17   49:aload_0         
		//   18   50:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #72  <Method AbstractMessage$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #72  <Method AbstractMessage$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			throw new UnsupportedOperationException("clearOneof() is not implemented.");
		//    0    0:new             #77  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #79  <String "clearOneof() is not implemented.">
		//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #86  <Method AbstractMessage$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clone()
		{
			throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
		//    0    0:new             #77  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #89  <String "clone() should be implemented in subclasses.">
		//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #92  <Method AbstractMessage$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #92  <Method AbstractMessage$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #92  <Method AbstractMessage$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #92  <Method AbstractMessage$Builder clone()>
		//    2    4:areturn         
		}

		void dispose()
		{
			throw new IllegalStateException("Should be overridden by subclasses.");
		//    0    0:new             #98  <Class IllegalStateException>
		//    1    3:dup             
		//    2    4:ldc1            #100 <String "Should be overridden by subclasses.">
		//    3    6:invokespecial   #101 <Method void IllegalStateException(String)>
		//    4    9:athrow          
		}

		public List findInitializationErrors()
		{
			return MessageReflection.findMissingFields(((MessageOrBuilder) (this)));
		//    0    0:aload_0         
		//    1    1:invokestatic    #25  <Method List MessageReflection.findMissingFields(MessageOrBuilder)>
		//    2    4:areturn         
		}

		public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fielddescriptor)
		{
			throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
		//    0    0:new             #77  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #107 <String "getFieldBuilder() called on an unsupported message type.">
		//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public String getInitializationErrorString()
		{
			return MessageReflection.delimitWithCommas(findInitializationErrors());
		//    0    0:aload_0         
		//    1    1:invokevirtual   #111 <Method List findInitializationErrors()>
		//    2    4:invokestatic    #115 <Method String MessageReflection.delimitWithCommas(List)>
		//    3    7:areturn         
		}

		public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofdescriptor)
		{
			throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
		//    0    0:new             #77  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #119 <String "getOneofFieldDescriptor() is not implemented.">
		//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fielddescriptor, int i)
		{
			throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
		//    0    0:new             #77  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #123 <String "getRepeatedFieldBuilder() called on an unsupported message type.">
		//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public boolean hasOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			throw new UnsupportedOperationException("hasOneof() is not implemented.");
		//    0    0:new             #77  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #127 <String "hasOneof() is not implemented.">
		//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		protected Builder internalMergeFrom(AbstractMessageLite abstractmessagelite)
		{
			return mergeFrom((Message)abstractmessagelite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #131 <Class Message>
		//    3    5:invokevirtual   #135 <Method AbstractMessage$Builder mergeFrom(Message)>
		//    4    8:areturn         
		}

		protected volatile AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractmessagelite)
		{
			return ((AbstractMessageLite.Builder) (internalMergeFrom(abstractmessagelite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #139 <Method AbstractMessage$Builder internalMergeFrom(AbstractMessageLite)>
		//    3    5:areturn         
		}

		void markClean()
		{
			throw new IllegalStateException("Should be overridden by subclasses.");
		//    0    0:new             #98  <Class IllegalStateException>
		//    1    3:dup             
		//    2    4:ldc1            #100 <String "Should be overridden by subclasses.">
		//    3    6:invokespecial   #101 <Method void IllegalStateException(String)>
		//    4    9:athrow          
		}

		public boolean mergeDelimitedFrom(InputStream inputstream)
			throws IOException
		{
			return super.mergeDelimitedFrom(inputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #146 <Method boolean AbstractMessageLite$Builder.mergeDelimitedFrom(InputStream)>
		//    3    5:ireturn         
		}

		public boolean mergeDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return super.mergeDelimitedFrom(inputstream, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #149 <Method boolean AbstractMessageLite$Builder.mergeDelimitedFrom(InputStream, ExtensionRegistryLite)>
		//    4    6:ireturn         
		}

		public Builder mergeFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return (Builder)super.mergeFrom(bytestring);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #155 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(ByteString)>
		//    3    5:checkcast       #2   <Class AbstractMessage$Builder>
		//    4    8:areturn         
		}

		public Builder mergeFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (Builder)super.mergeFrom(bytestring, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #160 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(ByteString, ExtensionRegistryLite)>
		//    4    6:checkcast       #2   <Class AbstractMessage$Builder>
		//    5    9:areturn         
		}

		public Builder mergeFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return mergeFrom(codedinputstream, ((ExtensionRegistryLite) (ExtensionRegistry.getEmptyRegistry())));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #168 <Method ExtensionRegistry ExtensionRegistry.getEmptyRegistry()>
		//    3    5:invokevirtual   #171 <Method AbstractMessage$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    8:areturn         
		}

		public Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			boolean flag;
			if(getDescriptorForType().getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #176 <Method Descriptors$Descriptor getDescriptorForType()>
		//*   2    4:invokevirtual   #182 <Method Descriptors$FileDescriptor Descriptors$Descriptor.getFile()>
		//*   3    7:invokevirtual   #188 <Method Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor.getSyntax()>
		//*   4   10:getstatic       #194 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO3>
		//*   5   13:if_acmpne       25
				flag = codedinputstream.shouldDiscardUnknownFieldsProto3();
		//    6   16:aload_1         
		//    7   17:invokevirtual   #199 <Method boolean CodedInputStream.shouldDiscardUnknownFieldsProto3()>
		//    8   20:istore          4
			else
		//*   9   22:goto            31
				flag = codedinputstream.shouldDiscardUnknownFields();
		//   10   25:aload_1         
		//   11   26:invokevirtual   #202 <Method boolean CodedInputStream.shouldDiscardUnknownFields()>
		//   12   29:istore          4
			UnknownFieldSet.Builder builder;
			if(flag)
		//*  13   31:iload           4
		//*  14   33:ifeq            42
				builder = null;
		//   15   36:aconst_null     
		//   16   37:astore          5
			else
		//*  17   39:goto            51
				builder = UnknownFieldSet.newBuilder(getUnknownFields());
		//   18   42:aload_0         
		//   19   43:invokevirtual   #206 <Method UnknownFieldSet getUnknownFields()>
		//   20   46:invokestatic    #212 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder(UnknownFieldSet)>
		//   21   49:astore          5
			int i;
			MessageReflection.BuilderAdapter builderadapter;
			do
			{
				i = codedinputstream.readTag();
		//   22   51:aload_1         
		//   23   52:invokevirtual   #216 <Method int CodedInputStream.readTag()>
		//   24   55:istore_3        
				if(i == 0)
		//*  25   56:iload_3         
		//*  26   57:ifne            63
					break;
		//   27   60:goto            96
				builderadapter = new MessageReflection.BuilderAdapter(((Message.Builder) (this)));
		//   28   63:new             #218 <Class MessageReflection$BuilderAdapter>
		//   29   66:dup             
		//   30   67:aload_0         
		//   31   68:invokespecial   #221 <Method void MessageReflection$BuilderAdapter(Message$Builder)>
		//   32   71:astore          6
			} while(MessageReflection.mergeFieldFrom(codedinputstream, builder, extensionregistrylite, getDescriptorForType(), ((MessageReflection.MergeTarget) (builderadapter)), i));
		//   33   73:aload_1         
		//   34   74:aload           5
		//   35   76:aload_2         
		//   36   77:aload_0         
		//   37   78:invokevirtual   #176 <Method Descriptors$Descriptor getDescriptorForType()>
		//   38   81:aload           6
		//   39   83:iload_3         
		//   40   84:invokestatic    #225 <Method boolean MessageReflection.mergeFieldFrom(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, Descriptors$Descriptor, MessageReflection$MergeTarget, int)>
		//   41   87:ifne            93
		//*  42   90:goto            96
		//*  43   93:goto            51
			if(builder != null)
		//*  44   96:aload           5
		//*  45   98:ifnull          111
				setUnknownFields(builder.build());
		//   46  101:aload_0         
		//   47  102:aload           5
		//   48  104:invokevirtual   #230 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//   49  107:invokevirtual   #234 <Method Message$Builder setUnknownFields(UnknownFieldSet)>
		//   50  110:pop             
			return this;
		//   51  111:aload_0         
		//   52  112:areturn         
		}

		public Builder mergeFrom(Message message)
		{
			return mergeFrom(message, message.getAllFields());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_1         
		//    3    3:invokeinterface #236 <Method Map Message.getAllFields()>
		//    4    8:invokevirtual   #239 <Method AbstractMessage$Builder mergeFrom(Message, Map)>
		//    5   11:areturn         
		}

		Builder mergeFrom(Message message, Map map)
		{
			if(message.getDescriptorForType() != getDescriptorForType())
		//*   0    0:aload_1         
		//*   1    1:invokeinterface #241 <Method Descriptors$Descriptor Message.getDescriptorForType()>
		//*   2    6:aload_0         
		//*   3    7:invokevirtual   #176 <Method Descriptors$Descriptor getDescriptorForType()>
		//*   4   10:if_acmpeq       23
				throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
		//    5   13:new             #243 <Class IllegalArgumentException>
		//    6   16:dup             
		//    7   17:ldc1            #245 <String "mergeFrom(Message) can only merge messages of the same type.">
		//    8   19:invokespecial   #246 <Method void IllegalArgumentException(String)>
		//    9   22:athrow          
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
		//*  10   23:aload_2         
		//*  11   24:invokeinterface #40  <Method Set Map.entrySet()>
		//*  12   29:invokeinterface #46  <Method Iterator Set.iterator()>
		//*  13   34:astore_2        
		//*  14   35:aload_2         
		//*  15   36:invokeinterface #52  <Method boolean Iterator.hasNext()>
		//*  16   41:ifeq            226
			{
				Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (map)).next()));
		//   17   44:aload_2         
		//   18   45:invokeinterface #56  <Method Object Iterator.next()>
		//   19   50:checkcast       #58  <Class java.util.Map$Entry>
		//   20   53:astore          4
				Descriptors.FieldDescriptor fielddescriptor = (Descriptors.FieldDescriptor)((java.util.Map.Entry) (obj)).getKey();
		//   21   55:aload           4
		//   22   57:invokeinterface #61  <Method Object java.util.Map$Entry.getKey()>
		//   23   62:checkcast       #63  <Class Descriptors$FieldDescriptor>
		//   24   65:astore_3        
				if(fielddescriptor.isRepeated())
		//*  25   66:aload_3         
		//*  26   67:invokevirtual   #249 <Method boolean Descriptors$FieldDescriptor.isRepeated()>
		//*  27   70:ifeq            119
				{
					obj = ((Object) (((List)((java.util.Map.Entry) (obj)).getValue()).iterator()));
		//   28   73:aload           4
		//   29   75:invokeinterface #252 <Method Object java.util.Map$Entry.getValue()>
		//   30   80:checkcast       #254 <Class List>
		//   31   83:invokeinterface #255 <Method Iterator List.iterator()>
		//   32   88:astore          4
					while(((Iterator) (obj)).hasNext()) 
		//*  33   90:aload           4
		//*  34   92:invokeinterface #52  <Method boolean Iterator.hasNext()>
		//*  35   97:ifeq            116
						addRepeatedField(fielddescriptor, ((Iterator) (obj)).next());
		//   36  100:aload_0         
		//   37  101:aload_3         
		//   38  102:aload           4
		//   39  104:invokeinterface #56  <Method Object Iterator.next()>
		//   40  109:invokevirtual   #259 <Method Message$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//   41  112:pop             
				} else
		//*  42  113:goto            90
		//*  43  116:goto            223
				if(fielddescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE)
		//*  44  119:aload_3         
		//*  45  120:invokevirtual   #263 <Method Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor.getJavaType()>
		//*  46  123:getstatic       #269 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//*  47  126:if_acmpne       210
				{
					Message message1 = (Message)getField(fielddescriptor);
		//   48  129:aload_0         
		//   49  130:aload_3         
		//   50  131:invokevirtual   #273 <Method Object getField(Descriptors$FieldDescriptor)>
		//   51  134:checkcast       #131 <Class Message>
		//   52  137:astore          5
					if(message1 == message1.getDefaultInstanceForType())
		//*  53  139:aload           5
		//*  54  141:aload           5
		//*  55  143:invokeinterface #277 <Method Message Message.getDefaultInstanceForType()>
		//*  56  148:if_acmpne       167
						setField(fielddescriptor, ((java.util.Map.Entry) (obj)).getValue());
		//   57  151:aload_0         
		//   58  152:aload_3         
		//   59  153:aload           4
		//   60  155:invokeinterface #252 <Method Object java.util.Map$Entry.getValue()>
		//   61  160:invokevirtual   #280 <Method Message$Builder setField(Descriptors$FieldDescriptor, Object)>
		//   62  163:pop             
					else
		//*  63  164:goto            207
						setField(fielddescriptor, ((Object) (message1.newBuilderForType().mergeFrom(message1).mergeFrom((Message)((java.util.Map.Entry) (obj)).getValue()).build())));
		//   64  167:aload_0         
		//   65  168:aload_3         
		//   66  169:aload           5
		//   67  171:invokeinterface #283 <Method Message$Builder Message.newBuilderForType()>
		//   68  176:aload           5
		//   69  178:invokeinterface #286 <Method Message$Builder Message$Builder.mergeFrom(Message)>
		//   70  183:aload           4
		//   71  185:invokeinterface #252 <Method Object java.util.Map$Entry.getValue()>
		//   72  190:checkcast       #131 <Class Message>
		//   73  193:invokeinterface #286 <Method Message$Builder Message$Builder.mergeFrom(Message)>
		//   74  198:invokeinterface #288 <Method Message Message$Builder.build()>
		//   75  203:invokevirtual   #280 <Method Message$Builder setField(Descriptors$FieldDescriptor, Object)>
		//   76  206:pop             
				} else
		//*  77  207:goto            223
				{
					setField(fielddescriptor, ((java.util.Map.Entry) (obj)).getValue());
		//   78  210:aload_0         
		//   79  211:aload_3         
		//   80  212:aload           4
		//   81  214:invokeinterface #252 <Method Object java.util.Map$Entry.getValue()>
		//   82  219:invokevirtual   #280 <Method Message$Builder setField(Descriptors$FieldDescriptor, Object)>
		//   83  222:pop             
				}
			}

		//*  84  223:goto            35
			mergeUnknownFields(message.getUnknownFields());
		//   85  226:aload_0         
		//   86  227:aload_1         
		//   87  228:invokeinterface #289 <Method UnknownFieldSet Message.getUnknownFields()>
		//   88  233:invokevirtual   #293 <Method AbstractMessage$Builder mergeUnknownFields(UnknownFieldSet)>
		//   89  236:pop             
			return this;
		//   90  237:aload_0         
		//   91  238:areturn         
		}

		public Builder mergeFrom(InputStream inputstream)
			throws IOException
		{
			return (Builder)super.mergeFrom(inputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #298 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(InputStream)>
		//    3    5:checkcast       #2   <Class AbstractMessage$Builder>
		//    4    8:areturn         
		}

		public Builder mergeFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return (Builder)super.mergeFrom(inputstream, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #303 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(InputStream, ExtensionRegistryLite)>
		//    4    6:checkcast       #2   <Class AbstractMessage$Builder>
		//    5    9:areturn         
		}

		public Builder mergeFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return (Builder)super.mergeFrom(abyte0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #308 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(byte[])>
		//    3    5:checkcast       #2   <Class AbstractMessage$Builder>
		//    4    8:areturn         
		}

		public Builder mergeFrom(byte abyte0[], int i, int j)
			throws InvalidProtocolBufferException
		{
			return (Builder)super.mergeFrom(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #313 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(byte[], int, int)>
		//    5    7:checkcast       #2   <Class AbstractMessage$Builder>
		//    6   10:areturn         
		}

		public Builder mergeFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (Builder)super.mergeFrom(abyte0, i, j, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #318 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(byte[], int, int, ExtensionRegistryLite)>
		//    6    9:checkcast       #2   <Class AbstractMessage$Builder>
		//    7   12:areturn         
		}

		public Builder mergeFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return (Builder)super.mergeFrom(abyte0, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #323 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(byte[], ExtensionRegistryLite)>
		//    4    6:checkcast       #2   <Class AbstractMessage$Builder>
		//    5    9:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(bytestring)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #326 <Method AbstractMessage$Builder mergeFrom(ByteString)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(bytestring, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #328 <Method AbstractMessage$Builder mergeFrom(ByteString, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #331 <Method AbstractMessage$Builder mergeFrom(CodedInputStream)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #171 <Method AbstractMessage$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(InputStream inputstream)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(inputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #334 <Method AbstractMessage$Builder mergeFrom(InputStream)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(inputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #336 <Method AbstractMessage$Builder mergeFrom(InputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(abyte0)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #338 <Method AbstractMessage$Builder mergeFrom(byte[])>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(byte abyte0[], int i, int j)
			throws InvalidProtocolBufferException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(abyte0, i, j)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #340 <Method AbstractMessage$Builder mergeFrom(byte[], int, int)>
		//    5    7:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(abyte0, i, j, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:invokevirtual   #342 <Method AbstractMessage$Builder mergeFrom(byte[], int, int, ExtensionRegistryLite)>
		//    6    9:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(abyte0, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #344 <Method AbstractMessage$Builder mergeFrom(byte[], ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return ((Message.Builder) (mergeFrom(bytestring)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #326 <Method AbstractMessage$Builder mergeFrom(ByteString)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Message.Builder) (mergeFrom(bytestring, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #328 <Method AbstractMessage$Builder mergeFrom(ByteString, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return ((Message.Builder) (mergeFrom(codedinputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #331 <Method AbstractMessage$Builder mergeFrom(CodedInputStream)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((Message.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #171 <Method AbstractMessage$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #135 <Method AbstractMessage$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeFrom(InputStream inputstream)
			throws IOException
		{
			return ((Message.Builder) (mergeFrom(inputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #334 <Method AbstractMessage$Builder mergeFrom(InputStream)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((Message.Builder) (mergeFrom(inputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #336 <Method AbstractMessage$Builder mergeFrom(InputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return ((Message.Builder) (mergeFrom(abyte0)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #338 <Method AbstractMessage$Builder mergeFrom(byte[])>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeFrom(byte abyte0[], int i, int j)
			throws InvalidProtocolBufferException
		{
			return ((Message.Builder) (mergeFrom(abyte0, i, j)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #340 <Method AbstractMessage$Builder mergeFrom(byte[], int, int)>
		//    5    7:areturn         
		}

		public volatile Message.Builder mergeFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Message.Builder) (mergeFrom(abyte0, i, j, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:invokevirtual   #342 <Method AbstractMessage$Builder mergeFrom(byte[], int, int, ExtensionRegistryLite)>
		//    6    9:areturn         
		}

		public volatile Message.Builder mergeFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Message.Builder) (mergeFrom(abyte0, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #344 <Method AbstractMessage$Builder mergeFrom(byte[], ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(bytestring)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #326 <Method AbstractMessage$Builder mergeFrom(ByteString)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(bytestring, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #328 <Method AbstractMessage$Builder mergeFrom(ByteString, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #331 <Method AbstractMessage$Builder mergeFrom(CodedInputStream)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #171 <Method AbstractMessage$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(InputStream inputstream)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(inputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #334 <Method AbstractMessage$Builder mergeFrom(InputStream)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(inputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #336 <Method AbstractMessage$Builder mergeFrom(InputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(abyte0)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #338 <Method AbstractMessage$Builder mergeFrom(byte[])>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(byte abyte0[], int i, int j)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(abyte0, i, j)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #340 <Method AbstractMessage$Builder mergeFrom(byte[], int, int)>
		//    5    7:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(abyte0, i, j, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:invokevirtual   #342 <Method AbstractMessage$Builder mergeFrom(byte[], int, int, ExtensionRegistryLite)>
		//    6    9:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(abyte0, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #344 <Method AbstractMessage$Builder mergeFrom(byte[], ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			setUnknownFields(UnknownFieldSet.newBuilder(getUnknownFields()).mergeFrom(unknownfieldset).build());
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #206 <Method UnknownFieldSet getUnknownFields()>
		//    3    5:invokestatic    #212 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder(UnknownFieldSet)>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #366 <Method UnknownFieldSet$Builder UnknownFieldSet$Builder.mergeFrom(UnknownFieldSet)>
		//    6   12:invokevirtual   #230 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
		//    7   15:invokevirtual   #234 <Method Message$Builder setUnknownFields(UnknownFieldSet)>
		//    8   18:pop             
			return this;
		//    9   19:aload_0         
		//   10   20:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #293 <Method AbstractMessage$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public String toString()
		{
			return TextFormat.printToString(((MessageOrBuilder) (this)));
		//    0    0:aload_0         
		//    1    1:invokestatic    #374 <Method String TextFormat.printToString(MessageOrBuilder)>
		//    2    4:areturn         
		}

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AbstractMessageLite$Builder()>
		//    2    4:return          
		}
	}

	public static interface BuilderParent
	{

		public abstract void markDirty();
	}


	public AbstractMessage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AbstractMessageLite()>
		memoizedSize = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #20  <Field int memoizedSize>
	//    5    9:return          
	}

	private static boolean compareBytes(Object obj, Object obj1)
	{
		if((obj instanceof byte[]) && (obj1 instanceof byte[]))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #25  <Class byte[]>
	//*   2    4:ifeq            32
	//*   3    7:aload_1         
	//*   4    8:instanceof      #25  <Class byte[]>
	//*   5   11:ifeq            32
			return Arrays.equals((byte[])(byte[])obj, (byte[])(byte[])obj1);
	//    6   14:aload_0         
	//    7   15:checkcast       #25  <Class byte[]>
	//    8   18:checkcast       #25  <Class byte[]>
	//    9   21:aload_1         
	//   10   22:checkcast       #25  <Class byte[]>
	//   11   25:checkcast       #25  <Class byte[]>
	//   12   28:invokestatic    #31  <Method boolean Arrays.equals(byte[], byte[])>
	//   13   31:ireturn         
		else
			return toByteString(obj).equals(((Object) (toByteString(obj1))));
	//   14   32:aload_0         
	//   15   33:invokestatic    #35  <Method ByteString toByteString(Object)>
	//   16   36:aload_1         
	//   17   37:invokestatic    #35  <Method ByteString toByteString(Object)>
	//   18   40:invokevirtual   #40  <Method boolean ByteString.equals(Object)>
	//   19   43:ireturn         
	}

	static boolean compareFields(Map map, Map map1)
	{
label0:
		{
			if(map.size() != map1.size())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #48  <Method int Map.size()>
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #48  <Method int Map.size()>
	//*   4   12:icmpeq          17
				return false;
	//    5   15:iconst_0        
	//    6   16:ireturn         
			Iterator iterator = map.keySet().iterator();
	//    7   17:aload_0         
	//    8   18:invokeinterface #52  <Method Set Map.keySet()>
	//    9   23:invokeinterface #58  <Method Iterator Set.iterator()>
	//   10   28:astore_3        
			Object obj;
			Object obj2;
label1:
			do
			{
				do
				{
					Object obj1;
label2:
					{
label3:
						do
							do
							{
								if(!iterator.hasNext())
									break label0;
	//   11   29:aload_3         
	//   12   30:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   13   35:ifeq            228
								obj1 = ((Object) ((Descriptors.FieldDescriptor)iterator.next()));
	//   14   38:aload_3         
	//   15   39:invokeinterface #68  <Method Object Iterator.next()>
	//   16   44:checkcast       #70  <Class Descriptors$FieldDescriptor>
	//   17   47:astore          5
								if(!map1.containsKey(obj1))
	//*  18   49:aload_1         
	//*  19   50:aload           5
	//*  20   52:invokeinterface #73  <Method boolean Map.containsKey(Object)>
	//*  21   57:ifne            62
									return false;
	//   22   60:iconst_0        
	//   23   61:ireturn         
								obj2 = map.get(obj1);
	//   24   62:aload_0         
	//   25   63:aload           5
	//   26   65:invokeinterface #77  <Method Object Map.get(Object)>
	//   27   70:astore          6
								obj = map1.get(obj1);
	//   28   72:aload_1         
	//   29   73:aload           5
	//   30   75:invokeinterface #77  <Method Object Map.get(Object)>
	//   31   80:astore          4
								if(((Descriptors.FieldDescriptor) (obj1)).getType() != Descriptors.FieldDescriptor.Type.BYTES)
									break label2;
	//   32   82:aload           5
	//   33   84:invokevirtual   #81  <Method Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor.getType()>
	//   34   87:getstatic       #87  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.BYTES>
	//   35   90:if_acmpne       193
								if(!((Descriptors.FieldDescriptor) (obj1)).isRepeated())
									continue label3;
	//   36   93:aload           5
	//   37   95:invokevirtual   #90  <Method boolean Descriptors$FieldDescriptor.isRepeated()>
	//   38   98:ifeq            181
								obj1 = ((Object) ((List)obj2));
	//   39  101:aload           6
	//   40  103:checkcast       #92  <Class List>
	//   41  106:astore          5
								obj = ((Object) ((List)obj));
	//   42  108:aload           4
	//   43  110:checkcast       #92  <Class List>
	//   44  113:astore          4
								if(((List) (obj1)).size() != ((List) (obj)).size())
	//*  45  115:aload           5
	//*  46  117:invokeinterface #93  <Method int List.size()>
	//*  47  122:aload           4
	//*  48  124:invokeinterface #93  <Method int List.size()>
	//*  49  129:icmpeq          134
									return false;
	//   50  132:iconst_0        
	//   51  133:ireturn         
								int i = 0;
	//   52  134:iconst_0        
	//   53  135:istore_2        
								while(i < ((List) (obj1)).size()) 
	//*  54  136:iload_2         
	//*  55  137:aload           5
	//*  56  139:invokeinterface #93  <Method int List.size()>
	//*  57  144:icmpge          178
								{
									if(!compareBytes(((List) (obj1)).get(i), ((List) (obj)).get(i)))
	//*  58  147:aload           5
	//*  59  149:iload_2         
	//*  60  150:invokeinterface #96  <Method Object List.get(int)>
	//*  61  155:aload           4
	//*  62  157:iload_2         
	//*  63  158:invokeinterface #96  <Method Object List.get(int)>
	//*  64  163:invokestatic    #98  <Method boolean compareBytes(Object, Object)>
	//*  65  166:ifne            171
										return false;
	//   66  169:iconst_0        
	//   67  170:ireturn         
									i++;
	//   68  171:iload_2         
	//   69  172:iconst_1        
	//   70  173:iadd            
	//   71  174:istore_2        
								}
							} while(true);
	//   72  175:goto            136
						while(compareBytes(obj2, obj));
	//   73  178:goto            225
	//   74  181:aload           6
	//   75  183:aload           4
	//   76  185:invokestatic    #98  <Method boolean compareBytes(Object, Object)>
	//   77  188:ifne            225
						return false;
	//   78  191:iconst_0        
	//   79  192:ireturn         
					}
					if(!((Descriptors.FieldDescriptor) (obj1)).isMapField())
						continue label1;
	//   80  193:aload           5
	//   81  195:invokevirtual   #101 <Method boolean Descriptors$FieldDescriptor.isMapField()>
	//   82  198:ifeq            213
				} while(compareMapField(obj2, obj));
	//   83  201:aload           6
	//   84  203:aload           4
	//   85  205:invokestatic    #104 <Method boolean compareMapField(Object, Object)>
	//   86  208:ifne            225
				return false;
	//   87  211:iconst_0        
	//   88  212:ireturn         
			} while(obj2.equals(obj));
	//   89  213:aload           6
	//   90  215:aload           4
	//   91  217:invokevirtual   #107 <Method boolean Object.equals(Object)>
	//   92  220:ifne            225
			return false;
	//   93  223:iconst_0        
	//   94  224:ireturn         
		}
	//*  95  225:goto            29
		return true;
	//   96  228:iconst_1        
	//   97  229:ireturn         
	}

	private static boolean compareMapField(Object obj, Object obj1)
	{
		return MapFieldLite.equals(convertMapEntryListToMap((List)obj), convertMapEntryListToMap((List)obj1));
	//    0    0:aload_0         
	//    1    1:checkcast       #92  <Class List>
	//    2    4:invokestatic    #113 <Method Map convertMapEntryListToMap(List)>
	//    3    7:aload_1         
	//    4    8:checkcast       #92  <Class List>
	//    5   11:invokestatic    #113 <Method Map convertMapEntryListToMap(List)>
	//    6   14:invokestatic    #117 <Method boolean MapFieldLite.equals(Map, Map)>
	//    7   17:ireturn         
	}

	private static Map convertMapEntryListToMap(List list)
	{
		if(list.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #120 <Method boolean List.isEmpty()>
	//*   2    6:ifeq            13
			return Collections.emptyMap();
	//    3    9:invokestatic    #126 <Method Map Collections.emptyMap()>
	//    4   12:areturn         
		HashMap hashmap = new HashMap();
	//    5   13:new             #128 <Class HashMap>
	//    6   16:dup             
	//    7   17:invokespecial   #129 <Method void HashMap()>
	//    8   20:astore_2        
		Iterator iterator = list.iterator();
	//    9   21:aload_0         
	//   10   22:invokeinterface #130 <Method Iterator List.iterator()>
	//   11   27:astore_3        
		Message message = (Message)iterator.next();
	//   12   28:aload_3         
	//   13   29:invokeinterface #68  <Method Object Iterator.next()>
	//   14   34:checkcast       #6   <Class Message>
	//   15   37:astore          6
		list = ((List) (message.getDescriptorForType()));
	//   16   39:aload           6
	//   17   41:invokeinterface #134 <Method Descriptors$Descriptor Message.getDescriptorForType()>
	//   18   46:astore_0        
		Descriptors.FieldDescriptor fielddescriptor = ((Descriptors.Descriptor) (list)).findFieldByName("key");
	//   19   47:aload_0         
	//   20   48:ldc1            #136 <String "key">
	//   21   50:invokevirtual   #142 <Method Descriptors$FieldDescriptor Descriptors$Descriptor.findFieldByName(String)>
	//   22   53:astore          4
		Descriptors.FieldDescriptor fielddescriptor1 = ((Descriptors.Descriptor) (list)).findFieldByName("value");
	//   23   55:aload_0         
	//   24   56:ldc1            #144 <String "value">
	//   25   58:invokevirtual   #142 <Method Descriptors$FieldDescriptor Descriptors$Descriptor.findFieldByName(String)>
	//   26   61:astore          5
		Object obj = message.getField(fielddescriptor1);
	//   27   63:aload           6
	//   28   65:aload           5
	//   29   67:invokeinterface #148 <Method Object Message.getField(Descriptors$FieldDescriptor)>
	//   30   72:astore_1        
		list = ((List) (obj));
	//   31   73:aload_1         
	//   32   74:astore_0        
		if(obj instanceof Descriptors.EnumValueDescriptor)
	//*  33   75:aload_1         
	//*  34   76:instanceof      #150 <Class Descriptors$EnumValueDescriptor>
	//*  35   79:ifeq            93
			list = ((List) (Integer.valueOf(((Descriptors.EnumValueDescriptor)obj).getNumber())));
	//   36   82:aload_1         
	//   37   83:checkcast       #150 <Class Descriptors$EnumValueDescriptor>
	//   38   86:invokevirtual   #153 <Method int Descriptors$EnumValueDescriptor.getNumber()>
	//   39   89:invokestatic    #159 <Method Integer Integer.valueOf(int)>
	//   40   92:astore_0        
		((Map) (hashmap)).put(message.getField(fielddescriptor), ((Object) (list)));
	//   41   93:aload_2         
	//   42   94:aload           6
	//   43   96:aload           4
	//   44   98:invokeinterface #148 <Method Object Message.getField(Descriptors$FieldDescriptor)>
	//   45  103:aload_0         
	//   46  104:invokeinterface #163 <Method Object Map.put(Object, Object)>
	//   47  109:pop             
		Message message1;
		for(; iterator.hasNext(); ((Map) (hashmap)).put(message1.getField(fielddescriptor), ((Object) (list))))
	//*  48  110:aload_3         
	//*  49  111:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*  50  116:ifeq            180
		{
			message1 = (Message)iterator.next();
	//   51  119:aload_3         
	//   52  120:invokeinterface #68  <Method Object Iterator.next()>
	//   53  125:checkcast       #6   <Class Message>
	//   54  128:astore          6
			Object obj1 = message1.getField(fielddescriptor1);
	//   55  130:aload           6
	//   56  132:aload           5
	//   57  134:invokeinterface #148 <Method Object Message.getField(Descriptors$FieldDescriptor)>
	//   58  139:astore_1        
			list = ((List) (obj1));
	//   59  140:aload_1         
	//   60  141:astore_0        
			if(obj1 instanceof Descriptors.EnumValueDescriptor)
	//*  61  142:aload_1         
	//*  62  143:instanceof      #150 <Class Descriptors$EnumValueDescriptor>
	//*  63  146:ifeq            160
				list = ((List) (Integer.valueOf(((Descriptors.EnumValueDescriptor)obj1).getNumber())));
	//   64  149:aload_1         
	//   65  150:checkcast       #150 <Class Descriptors$EnumValueDescriptor>
	//   66  153:invokevirtual   #153 <Method int Descriptors$EnumValueDescriptor.getNumber()>
	//   67  156:invokestatic    #159 <Method Integer Integer.valueOf(int)>
	//   68  159:astore_0        
		}

	//   69  160:aload_2         
	//   70  161:aload           6
	//   71  163:aload           4
	//   72  165:invokeinterface #148 <Method Object Message.getField(Descriptors$FieldDescriptor)>
	//   73  170:aload_0         
	//   74  171:invokeinterface #163 <Method Object Map.put(Object, Object)>
	//   75  176:pop             
	//*  76  177:goto            110
		return ((Map) (hashmap));
	//   77  180:aload_2         
	//   78  181:areturn         
	}

	protected static int hashBoolean(boolean flag)
	{
		return !flag ? 1237 : 1231;
	//    0    0:iload_0         
	//    1    1:ifeq            8
	//    2    4:sipush          1231
	//    3    7:ireturn         
	//    4    8:sipush          1237
	//    5   11:ireturn         
	}

	protected static int hashEnum(Internal.EnumLite enumlite)
	{
		return enumlite.getNumber();
	//    0    0:aload_0         
	//    1    1:invokeinterface #172 <Method int Internal$EnumLite.getNumber()>
	//    2    6:ireturn         
	}

	protected static int hashEnumList(List list)
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   2    2:aload_0         
	//*   3    3:invokeinterface #130 <Method Iterator List.iterator()>
	//*   4    8:astore_0        
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*   7   15:ifeq            39
			i = i * 31 + hashEnum((Internal.EnumLite)((Iterator) (list)).next());
	//    8   18:iload_1         
	//    9   19:bipush          31
	//   10   21:imul            
	//   11   22:aload_0         
	//   12   23:invokeinterface #68  <Method Object Iterator.next()>
	//   13   28:checkcast       #171 <Class Internal$EnumLite>
	//   14   31:invokestatic    #176 <Method int hashEnum(Internal$EnumLite)>
	//   15   34:iadd            
	//   16   35:istore_1        

	//*  17   36:goto            9
		return i;
	//   18   39:iload_1         
	//   19   40:ireturn         
	}

	protected static int hashFields(int i, Map map)
	{
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #182 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #58  <Method Iterator Set.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            140
		{
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//    7   21:aload_1         
	//    8   22:invokeinterface #68  <Method Object Iterator.next()>
	//    9   27:checkcast       #184 <Class java.util.Map$Entry>
	//   10   30:astore_3        
			Descriptors.FieldDescriptor fielddescriptor = (Descriptors.FieldDescriptor)((java.util.Map.Entry) (obj)).getKey();
	//   11   31:aload_3         
	//   12   32:invokeinterface #187 <Method Object java.util.Map$Entry.getKey()>
	//   13   37:checkcast       #70  <Class Descriptors$FieldDescriptor>
	//   14   40:astore_2        
			obj = ((java.util.Map.Entry) (obj)).getValue();
	//   15   41:aload_3         
	//   16   42:invokeinterface #190 <Method Object java.util.Map$Entry.getValue()>
	//   17   47:astore_3        
			i = i * 37 + fielddescriptor.getNumber();
	//   18   48:iload_0         
	//   19   49:bipush          37
	//   20   51:imul            
	//   21   52:aload_2         
	//   22   53:invokevirtual   #191 <Method int Descriptors$FieldDescriptor.getNumber()>
	//   23   56:iadd            
	//   24   57:istore_0        
			if(fielddescriptor.isMapField())
	//*  25   58:aload_2         
	//*  26   59:invokevirtual   #101 <Method boolean Descriptors$FieldDescriptor.isMapField()>
	//*  27   62:ifeq            78
				i = i * 53 + hashMapField(obj);
	//   28   65:iload_0         
	//   29   66:bipush          53
	//   30   68:imul            
	//   31   69:aload_3         
	//   32   70:invokestatic    #195 <Method int hashMapField(Object)>
	//   33   73:iadd            
	//   34   74:istore_0        
			else
	//*  35   75:goto            137
			if(fielddescriptor.getType() != Descriptors.FieldDescriptor.Type.ENUM)
	//*  36   78:aload_2         
	//*  37   79:invokevirtual   #81  <Method Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor.getType()>
	//*  38   82:getstatic       #198 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.ENUM>
	//*  39   85:if_acmpeq       101
				i = i * 53 + obj.hashCode();
	//   40   88:iload_0         
	//   41   89:bipush          53
	//   42   91:imul            
	//   43   92:aload_3         
	//   44   93:invokevirtual   #201 <Method int Object.hashCode()>
	//   45   96:iadd            
	//   46   97:istore_0        
			else
	//*  47   98:goto            137
			if(fielddescriptor.isRepeated())
	//*  48  101:aload_2         
	//*  49  102:invokevirtual   #90  <Method boolean Descriptors$FieldDescriptor.isRepeated()>
	//*  50  105:ifeq            124
				i = i * 53 + Internal.hashEnumList((List)obj);
	//   51  108:iload_0         
	//   52  109:bipush          53
	//   53  111:imul            
	//   54  112:aload_3         
	//   55  113:checkcast       #92  <Class List>
	//   56  116:invokestatic    #205 <Method int Internal.hashEnumList(List)>
	//   57  119:iadd            
	//   58  120:istore_0        
			else
	//*  59  121:goto            137
				i = i * 53 + Internal.hashEnum((Internal.EnumLite)obj);
	//   60  124:iload_0         
	//   61  125:bipush          53
	//   62  127:imul            
	//   63  128:aload_3         
	//   64  129:checkcast       #171 <Class Internal$EnumLite>
	//   65  132:invokestatic    #206 <Method int Internal.hashEnum(Internal$EnumLite)>
	//   66  135:iadd            
	//   67  136:istore_0        
		}

	//*  68  137:goto            12
		return i;
	//   69  140:iload_0         
	//   70  141:ireturn         
	}

	protected static int hashLong(long l)
	{
		return (int)(l >>> 32 ^ l);
	//    0    0:lload_0         
	//    1    1:bipush          32
	//    2    3:lushr           
	//    3    4:lload_0         
	//    4    5:lxor            
	//    5    6:l2i             
	//    6    7:ireturn         
	}

	private static int hashMapField(Object obj)
	{
		return MapFieldLite.calculateHashCodeForMap(convertMapEntryListToMap((List)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #92  <Class List>
	//    2    4:invokestatic    #113 <Method Map convertMapEntryListToMap(List)>
	//    3    7:invokestatic    #213 <Method int MapFieldLite.calculateHashCodeForMap(Map)>
	//    4   10:ireturn         
	}

	private static ByteString toByteString(Object obj)
	{
		if(obj instanceof byte[])
	//*   0    0:aload_0         
	//*   1    1:instanceof      #25  <Class byte[]>
	//*   2    4:ifeq            18
			return ByteString.copyFrom((byte[])(byte[])obj);
	//    3    7:aload_0         
	//    4    8:checkcast       #25  <Class byte[]>
	//    5   11:checkcast       #25  <Class byte[]>
	//    6   14:invokestatic    #217 <Method ByteString ByteString.copyFrom(byte[])>
	//    7   17:areturn         
		else
			return (ByteString)obj;
	//    8   18:aload_0         
	//    9   19:checkcast       #37  <Class ByteString>
	//   10   22:areturn         
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
		if(!(obj instanceof Message))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #6   <Class Message>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((Message)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #6   <Class Message>
	//   12   20:astore_1        
		if(getDescriptorForType() != ((Message) (obj)).getDescriptorForType())
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #218 <Method Descriptors$Descriptor getDescriptorForType()>
	//*  15   25:aload_1         
	//*  16   26:invokeinterface #134 <Method Descriptors$Descriptor Message.getDescriptorForType()>
	//*  17   31:if_acmpeq       36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		return compareFields(getAllFields(), ((Message) (obj)).getAllFields()) && getUnknownFields().equals(((Object) (((Message) (obj)).getUnknownFields())));
	//   20   36:aload_0         
	//   21   37:invokevirtual   #221 <Method Map getAllFields()>
	//   22   40:aload_1         
	//   23   41:invokeinterface #222 <Method Map Message.getAllFields()>
	//   24   46:invokestatic    #224 <Method boolean compareFields(Map, Map)>
	//   25   49:ifeq            70
	//   26   52:aload_0         
	//   27   53:invokevirtual   #228 <Method UnknownFieldSet getUnknownFields()>
	//   28   56:aload_1         
	//   29   57:invokeinterface #229 <Method UnknownFieldSet Message.getUnknownFields()>
	//   30   62:invokevirtual   #232 <Method boolean UnknownFieldSet.equals(Object)>
	//   31   65:ifeq            70
	//   32   68:iconst_1        
	//   33   69:ireturn         
	//   34   70:iconst_0        
	//   35   71:ireturn         
	}

	public List findInitializationErrors()
	{
		return MessageReflection.findMissingFields(((MessageOrBuilder) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #240 <Method List MessageReflection.findMissingFields(MessageOrBuilder)>
	//    2    4:areturn         
	}

	public String getInitializationErrorString()
	{
		return MessageReflection.delimitWithCommas(findInitializationErrors());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #245 <Method List findInitializationErrors()>
	//    2    4:invokestatic    #249 <Method String MessageReflection.delimitWithCommas(List)>
	//    3    7:areturn         
	}

	public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofdescriptor)
	{
		throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
	//    0    0:new             #253 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #255 <String "getOneofFieldDescriptor() is not implemented.">
	//    3    6:invokespecial   #258 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int memoizedSize>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
		{
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		} else
		{
			memoizedSize = MessageReflection.getSerializedSize(((Message) (this)), getAllFields());
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:aload_0         
	//   11   15:invokevirtual   #221 <Method Map getAllFields()>
	//   12   18:invokestatic    #262 <Method int MessageReflection.getSerializedSize(Message, Map)>
	//   13   21:putfield        #20  <Field int memoizedSize>
			return memoizedSize;
	//   14   24:aload_0         
	//   15   25:getfield        #20  <Field int memoizedSize>
	//   16   28:ireturn         
		}
	}

	public boolean hasOneof(Descriptors.OneofDescriptor oneofdescriptor)
	{
		throw new UnsupportedOperationException("hasOneof() is not implemented.");
	//    0    0:new             #253 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #266 <String "hasOneof() is not implemented.">
	//    3    7:invokespecial   #258 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public int hashCode()
	{
		int j = memoizedHashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field int memoizedHashCode>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            46
		{
			i = hashFields(((Object) (getDescriptorForType())).hashCode() + 779, getAllFields()) * 29 + getUnknownFields().hashCode();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #218 <Method Descriptors$Descriptor getDescriptorForType()>
	//    9   15:invokevirtual   #201 <Method int Object.hashCode()>
	//   10   18:sipush          779
	//   11   21:iadd            
	//   12   22:aload_0         
	//   13   23:invokevirtual   #221 <Method Map getAllFields()>
	//   14   26:invokestatic    #271 <Method int hashFields(int, Map)>
	//   15   29:bipush          29
	//   16   31:imul            
	//   17   32:aload_0         
	//   18   33:invokevirtual   #228 <Method UnknownFieldSet getUnknownFields()>
	//   19   36:invokevirtual   #272 <Method int UnknownFieldSet.hashCode()>
	//   20   39:iadd            
	//   21   40:istore_1        
			memoizedHashCode = i;
	//   22   41:aload_0         
	//   23   42:iload_1         
	//   24   43:putfield        #269 <Field int memoizedHashCode>
		}
		return i;
	//   25   46:iload_1         
	//   26   47:ireturn         
	}

	public boolean isInitialized()
	{
		return MessageReflection.isInitialized(((MessageOrBuilder) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #276 <Method boolean MessageReflection.isInitialized(MessageOrBuilder)>
	//    2    4:ireturn         
	}

	protected Message.Builder newBuilderForType(BuilderParent builderparent)
	{
		throw new UnsupportedOperationException("Nested builder is not supported for this type.");
	//    0    0:new             #253 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #280 <String "Nested builder is not supported for this type.">
	//    3    7:invokespecial   #258 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	UninitializedMessageException newUninitializedMessageException()
	{
		return Builder.newUninitializedMessageException(((Message) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #285 <Method UninitializedMessageException AbstractMessage$Builder.newUninitializedMessageException(Message)>
	//    2    4:areturn         
	}

	public final String toString()
	{
		return TextFormat.printToString(((MessageOrBuilder) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #292 <Method String TextFormat.printToString(MessageOrBuilder)>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		MessageReflection.writeMessageTo(((Message) (this)), getAllFields(), codedoutputstream, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #221 <Method Map getAllFields()>
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokestatic    #300 <Method void MessageReflection.writeMessageTo(Message, Map, CodedOutputStream, boolean)>
	//    6   10:return          
	}

	protected int memoizedSize;
}
