// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			AbstractParser, DiscardUnknownFieldsParser, InvalidProtocolBufferException, CodedInputStream, 
//			Parser, Message, ExtensionRegistryLite

static final class DiscardUnknownFieldsParser$1 extends AbstractParser
{

	public Message parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		codedinputstream.discardUnknownFields();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method void CodedInputStream.discardUnknownFields()>
		extensionregistrylite = ((ExtensionRegistryLite) ((Message)val$parser.parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field Parser val$parser>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #34  <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    7   15:checkcast       #36  <Class Message>
	//    8   18:astore_2        
		codedinputstream.unsetDiscardUnknownFields();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #39  <Method void CodedInputStream.unsetDiscardUnknownFields()>
		return ((Message) (extensionregistrylite));
	//   11   23:aload_2         
	//   12   24:areturn         
		extensionregistrylite;
	//   13   25:astore_2        
		codedinputstream.unsetDiscardUnknownFields();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #39  <Method void CodedInputStream.unsetDiscardUnknownFields()>
		throw extensionregistrylite;
	//   16   30:aload_2         
	//   17   31:athrow          
	}

	public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #44  <Method Message parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	final Parser val$parser;

	DiscardUnknownFieldsParser$1(Parser parser1)
	{
		val$parser = parser1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Parser val$parser>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void AbstractParser()>
	//    5    9:return          
	}
}
