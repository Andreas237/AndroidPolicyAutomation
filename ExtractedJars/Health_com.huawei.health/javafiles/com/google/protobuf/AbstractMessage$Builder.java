// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			AbstractMessage, UninitializedMessageException, MessageReflection, Message, 
//			InvalidProtocolBufferException, ExtensionRegistry, CodedInputStream, UnknownFieldSet, 
//			TextFormat, AbstractMessageLite, ExtensionRegistryLite, ByteString

public static abstract class AbstractMessage$Builder extends der
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

	public AbstractMessage$Builder clear()
	{
		for(Iterator iterator = getAllFields().entrySet().iterator(); iterator.hasNext(); clearField((tor)((java.util.Map.Entry)iterator.next()).getKey()));
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

	public AbstractMessage$Builder clearOneof(tor tor)
	{
		throw new UnsupportedOperationException("clearOneof() is not implemented.");
	//    0    0:new             #77  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #79  <String "clearOneof() is not implemented.">
	//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public volatile Message.Builder clearOneof(tor tor)
	{
		return ((Message.Builder) (clearOneof(tor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method AbstractMessage$Builder clearOneof(Descriptors$OneofDescriptor)>
	//    3    5:areturn         
	}

	public AbstractMessage$Builder clone()
	{
		throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
	//    0    0:new             #77  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #89  <String "clone() should be implemented in subclasses.">
	//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public volatile der clone()
	{
		return ((der) (clone()));
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

	public Message.Builder getFieldBuilder(tor tor)
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

	public tor getOneofFieldDescriptor(tor tor)
	{
		throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
	//    0    0:new             #77  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #119 <String "getOneofFieldDescriptor() is not implemented.">
	//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Message.Builder getRepeatedFieldBuilder(tor tor, int i)
	{
		throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
	//    0    0:new             #77  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #123 <String "getRepeatedFieldBuilder() called on an unsupported message type.">
	//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean hasOneof(tor tor)
	{
		throw new UnsupportedOperationException("hasOneof() is not implemented.");
	//    0    0:new             #77  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #127 <String "hasOneof() is not implemented.">
	//    3    6:invokespecial   #82  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	protected AbstractMessage$Builder internalMergeFrom(AbstractMessageLite abstractmessagelite)
	{
		return mergeFrom((Message)abstractmessagelite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #131 <Class Message>
	//    3    5:invokevirtual   #135 <Method AbstractMessage$Builder mergeFrom(Message)>
	//    4    8:areturn         
	}

	protected volatile der internalMergeFrom(AbstractMessageLite abstractmessagelite)
	{
		return ((der) (internalMergeFrom(abstractmessagelite)));
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

	public AbstractMessage$Builder mergeFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (AbstractMessage$Builder)super.mergeFrom(bytestring);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #155 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(ByteString)>
	//    3    5:checkcast       #2   <Class AbstractMessage$Builder>
	//    4    8:areturn         
	}

	public AbstractMessage$Builder mergeFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (AbstractMessage$Builder)super.mergeFrom(bytestring, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #160 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(ByteString, ExtensionRegistryLite)>
	//    4    6:checkcast       #2   <Class AbstractMessage$Builder>
	//    5    9:areturn         
	}

	public AbstractMessage$Builder mergeFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return mergeFrom(codedinputstream, ((ExtensionRegistryLite) (ExtensionRegistry.getEmptyRegistry())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #168 <Method ExtensionRegistry ExtensionRegistry.getEmptyRegistry()>
	//    3    5:invokevirtual   #171 <Method AbstractMessage$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public AbstractMessage$Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		boolean flag;
		if(getDescriptorForType().getFile().getSyntax() == or.Syntax.PROTO3)
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
		UnknownFieldSet$Builder unknownfieldset$builder;
		if(flag)
	//*  13   31:iload           4
	//*  14   33:ifeq            42
			unknownfieldset$builder = null;
	//   15   36:aconst_null     
	//   16   37:astore          5
		else
	//*  17   39:goto            51
			unknownfieldset$builder = UnknownFieldSet.newBuilder(getUnknownFields());
	//   18   42:aload_0         
	//   19   43:invokevirtual   #206 <Method UnknownFieldSet getUnknownFields()>
	//   20   46:invokestatic    #212 <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder(UnknownFieldSet)>
	//   21   49:astore          5
		int i;
		rAdapter radapter;
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
			radapter = new rAdapter(((Message.Builder) (this)));
	//   28   63:new             #218 <Class MessageReflection$BuilderAdapter>
	//   29   66:dup             
	//   30   67:aload_0         
	//   31   68:invokespecial   #221 <Method void MessageReflection$BuilderAdapter(Message$Builder)>
	//   32   71:astore          6
		} while(MessageReflection.mergeFieldFrom(codedinputstream, unknownfieldset$builder, extensionregistrylite, getDescriptorForType(), ((arget) (radapter)), i));
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
		if(unknownfieldset$builder != null)
	//*  44   96:aload           5
	//*  45   98:ifnull          111
			setUnknownFields(unknownfieldset$builder.build());
	//   46  101:aload_0         
	//   47  102:aload           5
	//   48  104:invokevirtual   #230 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   49  107:invokevirtual   #234 <Method Message$Builder setUnknownFields(UnknownFieldSet)>
	//   50  110:pop             
		return this;
	//   51  111:aload_0         
	//   52  112:areturn         
	}

	public AbstractMessage$Builder mergeFrom(Message message)
	{
		return mergeFrom(message, message.getAllFields());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokeinterface #236 <Method Map Message.getAllFields()>
	//    4    8:invokevirtual   #239 <Method AbstractMessage$Builder mergeFrom(Message, Map)>
	//    5   11:areturn         
	}

	AbstractMessage$Builder mergeFrom(Message message, Map map)
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
			tor tor = (tor)((java.util.Map.Entry) (obj)).getKey();
	//   21   55:aload           4
	//   22   57:invokeinterface #61  <Method Object java.util.Map$Entry.getKey()>
	//   23   62:checkcast       #63  <Class Descriptors$FieldDescriptor>
	//   24   65:astore_3        
			if(tor.isRepeated())
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
					addRepeatedField(tor, ((Iterator) (obj)).next());
	//   36  100:aload_0         
	//   37  101:aload_3         
	//   38  102:aload           4
	//   39  104:invokeinterface #56  <Method Object Iterator.next()>
	//   40  109:invokevirtual   #259 <Method Message$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
	//   41  112:pop             
			} else
	//*  42  113:goto            90
	//*  43  116:goto            223
			if(tor.getJavaType() == tor.JavaType.MESSAGE)
	//*  44  119:aload_3         
	//*  45  120:invokevirtual   #263 <Method Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor.getJavaType()>
	//*  46  123:getstatic       #269 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//*  47  126:if_acmpne       210
			{
				Message message1 = (Message)getField(tor);
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
					setField(tor, ((java.util.Map.Entry) (obj)).getValue());
	//   57  151:aload_0         
	//   58  152:aload_3         
	//   59  153:aload           4
	//   60  155:invokeinterface #252 <Method Object java.util.Map$Entry.getValue()>
	//   61  160:invokevirtual   #280 <Method Message$Builder setField(Descriptors$FieldDescriptor, Object)>
	//   62  163:pop             
				else
	//*  63  164:goto            207
					setField(tor, ((Object) (message1.newBuilderForType().mergeFrom(message1).mergeFrom((Message)((java.util.Map.Entry) (obj)).getValue()).build())));
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
				setField(tor, ((java.util.Map.Entry) (obj)).getValue());
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

	public AbstractMessage$Builder mergeFrom(InputStream inputstream)
		throws IOException
	{
		return (AbstractMessage$Builder)super.mergeFrom(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #298 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(InputStream)>
	//    3    5:checkcast       #2   <Class AbstractMessage$Builder>
	//    4    8:areturn         
	}

	public AbstractMessage$Builder mergeFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (AbstractMessage$Builder)super.mergeFrom(inputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #303 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(InputStream, ExtensionRegistryLite)>
	//    4    6:checkcast       #2   <Class AbstractMessage$Builder>
	//    5    9:areturn         
	}

	public AbstractMessage$Builder mergeFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (AbstractMessage$Builder)super.mergeFrom(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #308 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(byte[])>
	//    3    5:checkcast       #2   <Class AbstractMessage$Builder>
	//    4    8:areturn         
	}

	public AbstractMessage$Builder mergeFrom(byte abyte0[], int i, int j)
		throws InvalidProtocolBufferException
	{
		return (AbstractMessage$Builder)super.mergeFrom(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #313 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(byte[], int, int)>
	//    5    7:checkcast       #2   <Class AbstractMessage$Builder>
	//    6   10:areturn         
	}

	public AbstractMessage$Builder mergeFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (AbstractMessage$Builder)super.mergeFrom(abyte0, i, j, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #318 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(byte[], int, int, ExtensionRegistryLite)>
	//    6    9:checkcast       #2   <Class AbstractMessage$Builder>
	//    7   12:areturn         
	}

	public AbstractMessage$Builder mergeFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (AbstractMessage$Builder)super.mergeFrom(abyte0, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #323 <Method AbstractMessageLite$Builder AbstractMessageLite$Builder.mergeFrom(byte[], ExtensionRegistryLite)>
	//    4    6:checkcast       #2   <Class AbstractMessage$Builder>
	//    5    9:areturn         
	}

	public volatile der mergeFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return ((der) (mergeFrom(bytestring)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #326 <Method AbstractMessage$Builder mergeFrom(ByteString)>
	//    3    5:areturn         
	}

	public volatile der mergeFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((der) (mergeFrom(bytestring, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #328 <Method AbstractMessage$Builder mergeFrom(ByteString, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile der mergeFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return ((der) (mergeFrom(codedinputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #331 <Method AbstractMessage$Builder mergeFrom(CodedInputStream)>
	//    3    5:areturn         
	}

	public volatile der mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((der) (mergeFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #171 <Method AbstractMessage$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile der mergeFrom(InputStream inputstream)
		throws IOException
	{
		return ((der) (mergeFrom(inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #334 <Method AbstractMessage$Builder mergeFrom(InputStream)>
	//    3    5:areturn         
	}

	public volatile der mergeFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return ((der) (mergeFrom(inputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #336 <Method AbstractMessage$Builder mergeFrom(InputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile der mergeFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return ((der) (mergeFrom(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #338 <Method AbstractMessage$Builder mergeFrom(byte[])>
	//    3    5:areturn         
	}

	public volatile der mergeFrom(byte abyte0[], int i, int j)
		throws InvalidProtocolBufferException
	{
		return ((der) (mergeFrom(abyte0, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #340 <Method AbstractMessage$Builder mergeFrom(byte[], int, int)>
	//    5    7:areturn         
	}

	public volatile der mergeFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((der) (mergeFrom(abyte0, i, j, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #342 <Method AbstractMessage$Builder mergeFrom(byte[], int, int, ExtensionRegistryLite)>
	//    6    9:areturn         
	}

	public volatile der mergeFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((der) (mergeFrom(abyte0, extensionregistrylite)));
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

	public AbstractMessage$Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
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

	public AbstractMessage$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AbstractMessageLite$Builder()>
	//    2    4:return          
	}
}
