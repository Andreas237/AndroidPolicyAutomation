// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			Parser, ExtensionRegistryLite, InvalidProtocolBufferException, MessageLite, 
//			UninitializedMessageException, AbstractMessageLite, CodedInputStream, ByteString

public abstract class AbstractParser
	implements Parser
{

	public AbstractParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	private MessageLite checkMessageInitialized(MessageLite messagelite)
		throws InvalidProtocolBufferException
	{
		if(messagelite != null && !messagelite.isInitialized())
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #33  <Method boolean MessageLite.isInitialized()>
	//*   4   10:ifne            26
			throw newUninitializedMessageException(messagelite).asInvalidProtocolBufferException().setUnfinishedMessage(messagelite);
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokespecial   #37  <Method UninitializedMessageException newUninitializedMessageException(MessageLite)>
	//    8   18:invokevirtual   #43  <Method InvalidProtocolBufferException UninitializedMessageException.asInvalidProtocolBufferException()>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #47  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   11   25:athrow          
		else
			return messagelite;
	//   12   26:aload_1         
	//   13   27:areturn         
	}

	private UninitializedMessageException newUninitializedMessageException(MessageLite messagelite)
	{
		if(messagelite instanceof AbstractMessageLite)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #52  <Class AbstractMessageLite>
	//*   2    4:ifeq            15
			return ((AbstractMessageLite)messagelite).newUninitializedMessageException();
	//    3    7:aload_1         
	//    4    8:checkcast       #52  <Class AbstractMessageLite>
	//    5   11:invokevirtual   #55  <Method UninitializedMessageException AbstractMessageLite.newUninitializedMessageException()>
	//    6   14:areturn         
		else
			return new UninitializedMessageException(messagelite);
	//    7   15:new             #39  <Class UninitializedMessageException>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #58  <Method void UninitializedMessageException(MessageLite)>
	//   11   23:areturn         
	}

	public MessageLite parseDelimitedFrom(InputStream inputstream)
		throws InvalidProtocolBufferException
	{
		return parseDelimitedFrom(inputstream, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #64  <Method MessageLite parseDelimitedFrom(InputStream, ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public MessageLite parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return checkMessageInitialized(parsePartialDelimitedFrom(inputstream, extensionregistrylite));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #68  <Method MessageLite parsePartialDelimitedFrom(InputStream, ExtensionRegistryLite)>
	//    5    7:invokespecial   #70  <Method MessageLite checkMessageInitialized(MessageLite)>
	//    6   10:areturn         
	}

	public volatile Object parseDelimitedFrom(InputStream inputstream)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseDelimitedFrom(inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #74  <Method MessageLite parseDelimitedFrom(InputStream)>
	//    3    5:areturn         
	}

	public volatile Object parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseDelimitedFrom(inputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #64  <Method MessageLite parseDelimitedFrom(InputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public MessageLite parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return parseFrom(bytestring, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #80  <Method MessageLite parseFrom(ByteString, ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public MessageLite parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return checkMessageInitialized(parsePartialFrom(bytestring, extensionregistrylite));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #84  <Method MessageLite parsePartialFrom(ByteString, ExtensionRegistryLite)>
	//    5    7:invokespecial   #70  <Method MessageLite checkMessageInitialized(MessageLite)>
	//    6   10:areturn         
	}

	public MessageLite parseFrom(CodedInputStream codedinputstream)
		throws InvalidProtocolBufferException
	{
		return parseFrom(codedinputstream, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #89  <Method MessageLite parseFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public MessageLite parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return checkMessageInitialized((MessageLite)parsePartialFrom(codedinputstream, extensionregistrylite));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #93  <Method Object parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    5    7:checkcast       #29  <Class MessageLite>
	//    6   10:invokespecial   #70  <Method MessageLite checkMessageInitialized(MessageLite)>
	//    7   13:areturn         
	}

	public MessageLite parseFrom(InputStream inputstream)
		throws InvalidProtocolBufferException
	{
		return parseFrom(inputstream, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #96  <Method MessageLite parseFrom(InputStream, ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public MessageLite parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return checkMessageInitialized(parsePartialFrom(inputstream, extensionregistrylite));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #98  <Method MessageLite parsePartialFrom(InputStream, ExtensionRegistryLite)>
	//    5    7:invokespecial   #70  <Method MessageLite checkMessageInitialized(MessageLite)>
	//    6   10:areturn         
	}

	public MessageLite parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return parseFrom(bytebuffer, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #102 <Method MessageLite parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public MessageLite parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		try
		{
			bytebuffer = ((ByteBuffer) (CodedInputStream.newInstance(bytebuffer)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #109 <Method CodedInputStream CodedInputStream.newInstance(ByteBuffer)>
	//    2    4:astore_1        
			extensionregistrylite = ((ExtensionRegistryLite) ((MessageLite)parsePartialFrom(((CodedInputStream) (bytebuffer)), extensionregistrylite)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #93  <Method Object parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    7   11:checkcast       #29  <Class MessageLite>
	//    8   14:astore_2        
		}
	//*   9   15:aload_1         
	//*  10   16:iconst_0        
	//*  11   17:invokevirtual   #113 <Method void CodedInputStream.checkLastTagWas(int)>
	//*  12   20:goto            30
	//*  13   23:astore_1        
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #47  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//*  17   29:athrow          
	//*  18   30:goto            36
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer)
	//*  19   33:astore_1        
		{
			throw bytebuffer;
	//   20   34:aload_1         
	//   21   35:athrow          
		}
		try
		{
			((CodedInputStream) (bytebuffer)).checkLastTagWas(0);
			break MISSING_BLOCK_LABEL_36;
		}
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer) { }
		throw ((InvalidProtocolBufferException) (bytebuffer)).setUnfinishedMessage(((MessageLite) (extensionregistrylite)));
		return checkMessageInitialized(((MessageLite) (extensionregistrylite)));
	//   22   36:aload_0         
	//   23   37:aload_2         
	//   24   38:invokespecial   #70  <Method MessageLite checkMessageInitialized(MessageLite)>
	//   25   41:areturn         
	}

	public MessageLite parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return parseFrom(abyte0, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #118 <Method MessageLite parseFrom(byte[], ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public MessageLite parseFrom(byte abyte0[], int i, int j)
		throws InvalidProtocolBufferException
	{
		return parseFrom(abyte0, i, j, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    5    7:invokevirtual   #123 <Method MessageLite parseFrom(byte[], int, int, ExtensionRegistryLite)>
	//    6   10:areturn         
	}

	public MessageLite parseFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return checkMessageInitialized(parsePartialFrom(abyte0, i, j, extensionregistrylite));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:aload           4
	//    6    7:invokevirtual   #126 <Method MessageLite parsePartialFrom(byte[], int, int, ExtensionRegistryLite)>
	//    7   10:invokespecial   #70  <Method MessageLite checkMessageInitialized(MessageLite)>
	//    8   13:areturn         
	}

	public MessageLite parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return parseFrom(abyte0, 0, abyte0.length, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:aload_2         
	//    6    6:invokevirtual   #123 <Method MessageLite parseFrom(byte[], int, int, ExtensionRegistryLite)>
	//    7    9:areturn         
	}

	public volatile Object parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(bytestring)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #131 <Method MessageLite parseFrom(ByteString)>
	//    3    5:areturn         
	}

	public volatile Object parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(bytestring, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #80  <Method MessageLite parseFrom(ByteString, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Object parseFrom(CodedInputStream codedinputstream)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(codedinputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #135 <Method MessageLite parseFrom(CodedInputStream)>
	//    3    5:areturn         
	}

	public volatile Object parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #89  <Method MessageLite parseFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Object parseFrom(InputStream inputstream)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #137 <Method MessageLite parseFrom(InputStream)>
	//    3    5:areturn         
	}

	public volatile Object parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(inputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #96  <Method MessageLite parseFrom(InputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Object parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(bytebuffer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #140 <Method MessageLite parseFrom(ByteBuffer)>
	//    3    5:areturn         
	}

	public volatile Object parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(bytebuffer, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #102 <Method MessageLite parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Object parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #144 <Method MessageLite parseFrom(byte[])>
	//    3    5:areturn         
	}

	public volatile Object parseFrom(byte abyte0[], int i, int j)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(abyte0, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #147 <Method MessageLite parseFrom(byte[], int, int)>
	//    5    7:areturn         
	}

	public volatile Object parseFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(abyte0, i, j, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #123 <Method MessageLite parseFrom(byte[], int, int, ExtensionRegistryLite)>
	//    6    9:areturn         
	}

	public volatile Object parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parseFrom(abyte0, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #118 <Method MessageLite parseFrom(byte[], ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public MessageLite parsePartialDelimitedFrom(InputStream inputstream)
		throws InvalidProtocolBufferException
	{
		return parsePartialDelimitedFrom(inputstream, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #68  <Method MessageLite parsePartialDelimitedFrom(InputStream, ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public MessageLite parsePartialDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		try
		{
			i = inputstream.read();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #157 <Method int InputStream.read()>
	//    2    4:istore_3        
		}
	//*   3    5:iload_3         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          12
	//*   6   10:aconst_null     
	//*   7   11:areturn         
	//*   8   12:iload_3         
	//*   9   13:aload_1         
	//*  10   14:invokestatic    #161 <Method int CodedInputStream.readRawVarint32(int, InputStream)>
	//*  11   17:istore_3        
	//*  12   18:goto            31
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  13   21:astore_1        
		{
			throw new InvalidProtocolBufferException(((IOException) (inputstream)));
	//   14   22:new             #27  <Class InvalidProtocolBufferException>
	//   15   25:dup             
	//   16   26:aload_1         
	//   17   27:invokespecial   #164 <Method void InvalidProtocolBufferException(IOException)>
	//   18   30:athrow          
		}
		if(i == -1)
			return null;
		i = CodedInputStream.readRawVarint32(i, inputstream);
		return parsePartialFrom(((InputStream) (new AbstractMessageLite.Builder.LimitedInputStream(inputstream, i))), extensionregistrylite);
	//   19   31:aload_0         
	//   20   32:new             #166 <Class AbstractMessageLite$Builder$LimitedInputStream>
	//   21   35:dup             
	//   22   36:aload_1         
	//   23   37:iload_3         
	//   24   38:invokespecial   #169 <Method void AbstractMessageLite$Builder$LimitedInputStream(InputStream, int)>
	//   25   41:aload_2         
	//   26   42:invokevirtual   #98  <Method MessageLite parsePartialFrom(InputStream, ExtensionRegistryLite)>
	//   27   45:areturn         
	}

	public volatile Object parsePartialDelimitedFrom(InputStream inputstream)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialDelimitedFrom(inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #171 <Method MessageLite parsePartialDelimitedFrom(InputStream)>
	//    3    5:areturn         
	}

	public volatile Object parsePartialDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialDelimitedFrom(inputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #68  <Method MessageLite parsePartialDelimitedFrom(InputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public MessageLite parsePartialFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return parsePartialFrom(bytestring, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #84  <Method MessageLite parsePartialFrom(ByteString, ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public MessageLite parsePartialFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		try
		{
			bytestring = ((ByteString) (bytestring.newCodedInput()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #177 <Method CodedInputStream ByteString.newCodedInput()>
	//    2    4:astore_1        
			extensionregistrylite = ((ExtensionRegistryLite) ((MessageLite)parsePartialFrom(((CodedInputStream) (bytestring)), extensionregistrylite)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #93  <Method Object parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    7   11:checkcast       #29  <Class MessageLite>
	//    8   14:astore_2        
		}
	//*   9   15:aload_1         
	//*  10   16:iconst_0        
	//*  11   17:invokevirtual   #113 <Method void CodedInputStream.checkLastTagWas(int)>
	//*  12   20:aload_2         
	//*  13   21:areturn         
	//*  14   22:astore_1        
	//*  15   23:aload_1         
	//*  16   24:aload_2         
	//*  17   25:invokevirtual   #47  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//*  18   28:athrow          
		// Misplaced declaration of an exception variable
		catch(ByteString bytestring)
	//*  19   29:astore_1        
		{
			throw bytestring;
	//   20   30:aload_1         
	//   21   31:athrow          
		}
		((CodedInputStream) (bytestring)).checkLastTagWas(0);
		return ((MessageLite) (extensionregistrylite));
		bytestring;
		throw ((InvalidProtocolBufferException) (bytestring)).setUnfinishedMessage(((MessageLite) (extensionregistrylite)));
	}

	public MessageLite parsePartialFrom(CodedInputStream codedinputstream)
		throws InvalidProtocolBufferException
	{
		return (MessageLite)parsePartialFrom(codedinputstream, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #93  <Method Object parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #29  <Class MessageLite>
	//    5   11:areturn         
	}

	public MessageLite parsePartialFrom(InputStream inputstream)
		throws InvalidProtocolBufferException
	{
		return parsePartialFrom(inputstream, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    3    5:invokevirtual   #98  <Method MessageLite parsePartialFrom(InputStream, ExtensionRegistryLite)>
	//    4    8:areturn         
	}

	public MessageLite parsePartialFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		inputstream = ((InputStream) (CodedInputStream.newInstance(inputstream)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #180 <Method CodedInputStream CodedInputStream.newInstance(InputStream)>
	//    2    4:astore_1        
		extensionregistrylite = ((ExtensionRegistryLite) ((MessageLite)parsePartialFrom(((CodedInputStream) (inputstream)), extensionregistrylite)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #93  <Method Object parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    7   11:checkcast       #29  <Class MessageLite>
	//    8   14:astore_2        
		try
		{
			((CodedInputStream) (inputstream)).checkLastTagWas(0);
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #113 <Method void CodedInputStream.checkLastTagWas(int)>
		}
	//*  12   20:aload_2         
	//*  13   21:areturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  14   22:astore_1        
		{
			throw ((InvalidProtocolBufferException) (inputstream)).setUnfinishedMessage(((MessageLite) (extensionregistrylite)));
	//   15   23:aload_1         
	//   16   24:aload_2         
	//   17   25:invokevirtual   #47  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   18   28:athrow          
		}
		return ((MessageLite) (extensionregistrylite));
	}

	public MessageLite parsePartialFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return parsePartialFrom(abyte0, 0, abyte0.length, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    6    8:invokevirtual   #126 <Method MessageLite parsePartialFrom(byte[], int, int, ExtensionRegistryLite)>
	//    7   11:areturn         
	}

	public MessageLite parsePartialFrom(byte abyte0[], int i, int j)
		throws InvalidProtocolBufferException
	{
		return parsePartialFrom(abyte0, i, j, EMPTY_REGISTRY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//    5    7:invokevirtual   #126 <Method MessageLite parsePartialFrom(byte[], int, int, ExtensionRegistryLite)>
	//    6   10:areturn         
	}

	public MessageLite parsePartialFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		try
		{
			abyte0 = ((byte []) (CodedInputStream.newInstance(abyte0, i, j)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #183 <Method CodedInputStream CodedInputStream.newInstance(byte[], int, int)>
	//    4    6:astore_1        
			extensionregistrylite = ((ExtensionRegistryLite) ((MessageLite)parsePartialFrom(((CodedInputStream) (abyte0)), extensionregistrylite)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload           4
	//    8   11:invokevirtual   #93  <Method Object parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    9   14:checkcast       #29  <Class MessageLite>
	//   10   17:astore          4
		}
	//*  11   19:aload_1         
	//*  12   20:iconst_0        
	//*  13   21:invokevirtual   #113 <Method void CodedInputStream.checkLastTagWas(int)>
	//*  14   24:aload           4
	//*  15   26:areturn         
	//*  16   27:astore_1        
	//*  17   28:aload_1         
	//*  18   29:aload           4
	//*  19   31:invokevirtual   #47  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//*  20   34:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  21   35:astore_1        
		{
			throw abyte0;
	//   22   36:aload_1         
	//   23   37:athrow          
		}
		((CodedInputStream) (abyte0)).checkLastTagWas(0);
		return ((MessageLite) (extensionregistrylite));
		abyte0;
		throw ((InvalidProtocolBufferException) (abyte0)).setUnfinishedMessage(((MessageLite) (extensionregistrylite)));
	}

	public MessageLite parsePartialFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return parsePartialFrom(abyte0, 0, abyte0.length, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:aload_2         
	//    6    6:invokevirtual   #126 <Method MessageLite parsePartialFrom(byte[], int, int, ExtensionRegistryLite)>
	//    7    9:areturn         
	}

	public volatile Object parsePartialFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(bytestring)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #185 <Method MessageLite parsePartialFrom(ByteString)>
	//    3    5:areturn         
	}

	public volatile Object parsePartialFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(bytestring, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #84  <Method MessageLite parsePartialFrom(ByteString, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Object parsePartialFrom(CodedInputStream codedinputstream)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(codedinputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #187 <Method MessageLite parsePartialFrom(CodedInputStream)>
	//    3    5:areturn         
	}

	public volatile Object parsePartialFrom(InputStream inputstream)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #189 <Method MessageLite parsePartialFrom(InputStream)>
	//    3    5:areturn         
	}

	public volatile Object parsePartialFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(inputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #98  <Method MessageLite parsePartialFrom(InputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	public volatile Object parsePartialFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #191 <Method MessageLite parsePartialFrom(byte[])>
	//    3    5:areturn         
	}

	public volatile Object parsePartialFrom(byte abyte0[], int i, int j)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(abyte0, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #193 <Method MessageLite parsePartialFrom(byte[], int, int)>
	//    5    7:areturn         
	}

	public volatile Object parsePartialFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(abyte0, i, j, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #126 <Method MessageLite parsePartialFrom(byte[], int, int, ExtensionRegistryLite)>
	//    6    9:areturn         
	}

	public volatile Object parsePartialFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(abyte0, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #195 <Method MessageLite parsePartialFrom(byte[], ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	private static final ExtensionRegistryLite EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();

	static 
	{
	//    0    0:invokestatic    #17  <Method ExtensionRegistryLite ExtensionRegistryLite.getEmptyRegistry()>
	//    1    3:putstatic       #19  <Field ExtensionRegistryLite EMPTY_REGISTRY>
	//*   2    6:return          
	}
}
