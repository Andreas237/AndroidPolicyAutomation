// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.core;

import cn.com.fmsh.communication.message.*;
import cn.com.fmsh.communication.message.enumerate.ETagType;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

// Referenced classes of package cn.com.fmsh.communication.message.core:
//			Message, Tag, MessageDefine, TagDefine, 
//			TagItemDefine, MessageTagDefine

public class MessageHandler
	implements IMessageHandler
{

	public MessageHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		log = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #28  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #32  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #34  <Field FMLog log>
		logTag = ((Class) (cn/com/fmsh/communication/message/core/MessageHandler)).getName();
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class MessageHandler>
	//    8   17:invokevirtual   #40  <Method String Class.getName()>
	//    9   20:putfield        #42  <Field String logTag>
		loadFlag = false;
	//   10   23:aload_0         
	//   11   24:iconst_0        
	//   12   25:putfield        #44  <Field boolean loadFlag>
		tagDefines = ((Map) (new HashMap()));
	//   13   28:aload_0         
	//   14   29:new             #46  <Class HashMap>
	//   15   32:dup             
	//   16   33:invokespecial   #47  <Method void HashMap()>
	//   17   36:putfield        #49  <Field Map tagDefines>
		messageDefines = ((Map) (new HashMap()));
	//   18   39:aload_0         
	//   19   40:new             #46  <Class HashMap>
	//   20   43:dup             
	//   21   44:invokespecial   #47  <Method void HashMap()>
	//   22   47:putfield        #51  <Field Map messageDefines>
		messageRetDefines = ((Map) (new HashMap()));
	//   23   50:aload_0         
	//   24   51:new             #46  <Class HashMap>
	//   25   54:dup             
	//   26   55:invokespecial   #47  <Method void HashMap()>
	//   27   58:putfield        #53  <Field Map messageRetDefines>
	//   28   61:return          
	}

	public volatile IMessage createMessage(int i)
	{
		return ((IMessage) (createMessage(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #59  <Method Message createMessage(int)>
	//    3    5:areturn         
	}

	public volatile IMessage createMessage(int i, byte abyte0[])
		throws FMCommunicationMessageException
	{
		return ((IMessage) (createMessage(i, abyte0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #65  <Method Message createMessage(int, byte[])>
	//    4    6:areturn         
	}

	public volatile IMessage createMessage(byte abyte0[])
		throws FMCommunicationMessageException
	{
		return ((IMessage) (createMessage(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #70  <Method Message createMessage(byte[])>
	//    3    5:areturn         
	}

	public Message createMessage(int i)
	{
		return new Message(this, i);
	//    0    0:new             #72  <Class Message>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #75  <Method void Message(MessageHandler, int)>
	//    5    9:areturn         
	}

	public Message createMessage(int i, byte abyte0[])
		throws FMCommunicationMessageException
	{
		Message message = new Message(this);
	//    0    0:new             #72  <Class Message>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void Message(MessageHandler)>
	//    4    8:astore_3        
		if(message.fromPackageBody(i, abyte0) == 0)
	//*   5    9:aload_3         
	//*   6   10:iload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #82  <Method int Message.fromPackageBody(int, byte[])>
	//*   9   15:ifne            20
			return message;
	//   10   18:aload_3         
	//   11   19:areturn         
		else
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
	}

	public Message createMessage(byte abyte0[])
		throws FMCommunicationMessageException
	{
		Message message = new Message(this);
	//    0    0:new             #72  <Class Message>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void Message(MessageHandler)>
	//    4    8:astore_2        
		if(message.fromPackageBody(abyte0) == 0)
	//*   5    9:aload_2         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #85  <Method int Message.fromPackageBody(byte[])>
	//*   8   14:ifne            19
			return message;
	//    9   17:aload_2         
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	public IMessage createMessageAndRetCode(int i, byte abyte0[])
		throws FMCommunicationMessageException
	{
		Message message = new Message(this);
	//    0    0:new             #72  <Class Message>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void Message(MessageHandler)>
	//    4    8:astore_3        
		if(message.fromPackageBodyAndRetCode(i, abyte0) == 0)
	//*   5    9:aload_3         
	//*   6   10:iload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #89  <Method int Message.fromPackageBodyAndRetCode(int, byte[])>
	//*   9   15:ifne            20
			return ((IMessage) (message));
	//   10   18:aload_3         
	//   11   19:areturn         
		else
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
	}

	public IMessage createMessageAndRetCode(byte abyte0[])
		throws FMCommunicationMessageException
	{
		Message message = new Message(this);
	//    0    0:new             #72  <Class Message>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void Message(MessageHandler)>
	//    4    8:astore_2        
		if(message.fromPackageBodyAndRetCode(abyte0) == 0)
	//*   5    9:aload_2         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #91  <Method int Message.fromPackageBodyAndRetCode(byte[])>
	//*   8   14:ifne            19
			return ((IMessage) (message));
	//    9   17:aload_2         
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	public volatile ITag createTag(byte byte0)
	{
		return ((ITag) (createTag(byte0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #96  <Method Tag createTag(byte)>
	//    3    5:areturn         
	}

	public volatile ITag createTag(byte byte0, byte abyte0[])
		throws FMCommunicationMessageException
	{
		return ((ITag) (createTag(byte0, abyte0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #100 <Method Tag createTag(byte, byte[])>
	//    4    6:areturn         
	}

	public Tag createTag(byte byte0)
	{
		return new Tag(this, byte0);
	//    0    0:new             #102 <Class Tag>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #105 <Method void Tag(MessageHandler, byte)>
	//    5    9:areturn         
	}

	public Tag createTag(byte byte0, byte abyte0[])
		throws FMCommunicationMessageException
	{
		Tag tag = new Tag(this);
	//    0    0:new             #102 <Class Tag>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #106 <Method void Tag(MessageHandler)>
	//    4    8:astore_3        
		tag.fromPackageBody(byte0, abyte0);
	//    5    9:aload_3         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #109 <Method int Tag.fromPackageBody(byte, byte[])>
	//    9   15:pop             
		return tag;
	//   10   16:aload_3         
	//   11   17:areturn         
	}

	public Tag createTag(byte abyte0[])
		throws FMCommunicationMessageException
	{
		Tag tag = new Tag(this);
	//    0    0:new             #102 <Class Tag>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #106 <Method void Tag(MessageHandler)>
	//    4    8:astore_2        
		tag.fromPackageBody(abyte0);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #111 <Method int Tag.fromPackageBody(byte[])>
	//    8   14:pop             
		return tag;
	//    9   15:aload_2         
	//   10   16:areturn         
	}

	public MessageDefine getMessageDefine(int i)
	{
		return (MessageDefine)messageDefines.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Map messageDefines>
	//    2    4:iload_1         
	//    3    5:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #125 <Method Object Map.get(Object)>
	//    5   13:checkcast       #127 <Class MessageDefine>
	//    6   16:areturn         
	}

	public MessageDefine getMessageRetDefine(int i)
	{
		return (MessageDefine)messageRetDefines.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Map messageRetDefines>
	//    2    4:iload_1         
	//    3    5:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #125 <Method Object Map.get(Object)>
	//    5   13:checkcast       #127 <Class MessageDefine>
	//    6   16:areturn         
	}

	public TagDefine getTagDefine(byte byte0)
	{
		return (TagDefine)tagDefines.get(((Object) (Byte.valueOf(byte0))));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Map tagDefines>
	//    2    4:iload_1         
	//    3    5:invokestatic    #135 <Method Byte Byte.valueOf(byte)>
	//    4    8:invokeinterface #125 <Method Object Map.get(Object)>
	//    5   13:checkcast       #137 <Class TagDefine>
	//    6   16:areturn         
	}

	public boolean isLoad()
	{
		return loadFlag;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean loadFlag>
	//    2    4:ireturn         
	}

	public int loadDefine(InputStream inputstream)
		throws FMCommunicationMessageException
	{
		int i;
		int j;
		if(inputstream == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new FMCommunicationMessageException("\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5931\u8D25");
	//    2    4:new             #62  <Class FMCommunicationMessageException>
	//    3    7:dup             
	//    4    8:ldc1            #149 <String "\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5931\u8D25">
	//    5   10:invokespecial   #152 <Method void FMCommunicationMessageException(String)>
	//    6   13:athrow          
		Object obj = ((Object) (DocumentBuilderFactory.newInstance()));
	//    7   14:invokestatic    #158 <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    8   17:astore          4
		Object obj1;
		Object obj2;
		Object obj3;
		Object obj4;
		Node node;
		try
		{
			inputstream = ((InputStream) (((DocumentBuilderFactory) (obj)).newDocumentBuilder().parse(inputstream).getDocumentElement()));
	//    9   19:aload           4
	//   10   21:invokevirtual   #162 <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #168 <Method Document DocumentBuilder.parse(InputStream)>
	//   13   28:invokeinterface #174 <Method Element Document.getDocumentElement()>
	//   14   33:astore_1        
			obj = ((Object) (((Element) (inputstream)).getElementsByTagName("Tag")));
	//   15   34:aload_1         
	//   16   35:ldc1            #176 <String "Tag">
	//   17   37:invokeinterface #182 <Method NodeList Element.getElementsByTagName(String)>
	//   18   42:astore          4
		}
	//*  19   44:iconst_0        
	//*  20   45:istore_2        
	//*  21   46:goto            493
	//*  22   49:new             #137 <Class TagDefine>
	//*  23   52:dup             
	//*  24   53:invokespecial   #183 <Method void TagDefine()>
	//*  25   56:astore          5
	//*  26   58:aload           4
	//*  27   60:iload_2         
	//*  28   61:invokeinterface #189 <Method Node NodeList.item(int)>
	//*  29   66:astore          6
	//*  30   68:aload           6
	//*  31   70:invokeinterface #195 <Method NamedNodeMap Node.getAttributes()>
	//*  32   75:astore          7
	//*  33   77:aload           7
	//*  34   79:ldc1            #197 <String "id">
	//*  35   81:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//*  36   86:astore          8
	//*  37   88:aload           8
	//*  38   90:ifnull          111
	//*  39   93:aload           5
	//*  40   95:aload           8
	//*  41   97:invokeinterface #206 <Method String Node.getNodeValue()>
	//*  42  102:bipush          16
	//*  43  104:invokestatic    #210 <Method int Integer.parseInt(String, int)>
	//*  44  107:int2byte        
	//*  45  108:invokevirtual   #214 <Method void TagDefine.setId(byte)>
	//*  46  111:aload           7
	//*  47  113:ldc1            #216 <String "length">
	//*  48  115:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//*  49  120:astore          8
	//*  50  122:aload           8
	//*  51  124:ifnull          142
	//*  52  127:aload           5
	//*  53  129:aload           8
	//*  54  131:invokeinterface #206 <Method String Node.getNodeValue()>
	//*  55  136:invokestatic    #219 <Method int Integer.parseInt(String)>
	//*  56  139:invokevirtual   #223 <Method void TagDefine.setLength(int)>
	//*  57  142:aload           7
	//*  58  144:ldc1            #225 <String "type">
	//*  59  146:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//*  60  151:astore          8
	//*  61  153:aload           8
	//*  62  155:ifnull          173
	//*  63  158:aload           5
	//*  64  160:aload           8
	//*  65  162:invokeinterface #206 <Method String Node.getNodeValue()>
	//*  66  167:invokestatic    #230 <Method ETagType ETagType.valueOf(String)>
	//*  67  170:invokevirtual   #234 <Method void TagDefine.setType(ETagType)>
	//*  68  173:aload           7
	//*  69  175:ldc1            #236 <String "desc">
	//*  70  177:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//*  71  182:astore          7
	//*  72  184:aload           7
	//*  73  186:ifnull          201
	//*  74  189:aload           5
	//*  75  191:aload           7
	//*  76  193:invokeinterface #206 <Method String Node.getNodeValue()>
	//*  77  198:invokevirtual   #239 <Method void TagDefine.setDesc(String)>
	//*  78  201:aload           6
	//*  79  203:invokeinterface #243 <Method NodeList Node.getChildNodes()>
	//*  80  208:astore          6
	//*  81  210:iconst_0        
	//*  82  211:istore_3        
	//*  83  212:goto            458
	//*  84  215:aload           6
	//*  85  217:iload_3         
	//*  86  218:invokeinterface #189 <Method Node NodeList.item(int)>
	//*  87  223:astore          7
	//*  88  225:aload           7
	//*  89  227:ifnull          432
	//*  90  230:ldc1            #245 <String "Item">
	//*  91  232:aload           7
	//*  92  234:invokeinterface #248 <Method String Node.getNodeName()>
	//*  93  239:invokevirtual   #254 <Method boolean String.equals(Object)>
	//*  94  242:ifeq            1109
	//*  95  245:aload           7
	//*  96  247:invokeinterface #195 <Method NamedNodeMap Node.getAttributes()>
	//*  97  252:astore          8
	//*  98  254:new             #256 <Class TagItemDefine>
	//*  99  257:dup             
	//* 100  258:invokespecial   #257 <Method void TagItemDefine()>
	//* 101  261:astore          7
	//* 102  263:aload           8
	//* 103  265:ldc2            #259 <String "tag">
	//* 104  268:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 105  273:astore          9
	//* 106  275:aload           9
	//* 107  277:ifnull          298
	//* 108  280:aload           7
	//* 109  282:aload           9
	//* 110  284:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 111  289:bipush          16
	//* 112  291:invokestatic    #210 <Method int Integer.parseInt(String, int)>
	//* 113  294:int2byte        
	//* 114  295:invokevirtual   #262 <Method void TagItemDefine.setTag(byte)>
	//* 115  298:aload           8
	//* 116  300:ldc1            #236 <String "desc">
	//* 117  302:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 118  307:astore          9
	//* 119  309:aload           9
	//* 120  311:ifnull          326
	//* 121  314:aload           7
	//* 122  316:aload           9
	//* 123  318:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 124  323:invokevirtual   #263 <Method void TagItemDefine.setDesc(String)>
	//* 125  326:aload           8
	//* 126  328:ldc2            #265 <String "multiple">
	//* 127  331:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 128  336:astore          9
	//* 129  338:aload           9
	//* 130  340:ifnull          358
	//* 131  343:aload           7
	//* 132  345:aload           9
	//* 133  347:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 134  352:invokestatic    #219 <Method int Integer.parseInt(String)>
	//* 135  355:invokevirtual   #268 <Method void TagItemDefine.setMultiple(int)>
	//* 136  358:aload           8
	//* 137  360:ldc2            #270 <String "exist">
	//* 138  363:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 139  368:astore          9
	//* 140  370:aload           9
	//* 141  372:ifnull          390
	//* 142  375:aload           7
	//* 143  377:aload           9
	//* 144  379:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 145  384:invokestatic    #219 <Method int Integer.parseInt(String)>
	//* 146  387:invokevirtual   #273 <Method void TagItemDefine.setExist(int)>
	//* 147  390:aload           8
	//* 148  392:ldc2            #275 <String "order">
	//* 149  395:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 150  400:astore          8
	//* 151  402:aload           8
	//* 152  404:ifnull          422
	//* 153  407:aload           7
	//* 154  409:aload           8
	//* 155  411:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 156  416:invokestatic    #219 <Method int Integer.parseInt(String)>
	//* 157  419:invokevirtual   #278 <Method void TagItemDefine.setOrder(int)>
	//* 158  422:aload           5
	//* 159  424:aload           7
	//* 160  426:invokevirtual   #282 <Method void TagDefine.addTagItem(TagItemDefine)>
	//* 161  429:goto            1109
	//* 162  432:aload_0         
	//* 163  433:getfield        #34  <Field FMLog log>
	//* 164  436:ifnull          1109
	//* 165  439:aload_0         
	//* 166  440:getfield        #34  <Field FMLog log>
	//* 167  443:aload_0         
	//* 168  444:getfield        #42  <Field String logTag>
	//* 169  447:ldc2            #284 <String "\u52A0\u8F7DTAG\u5B9A\u4E49\u6587\u4EF6\u65F6\uFF0CTAG\u8282\u70B9\u4E3A\u7A7A">
	//* 170  450:invokeinterface #290 <Method void FMLog.warn(String, String)>
	//* 171  455:goto            1109
	//* 172  458:iload_3         
	//* 173  459:aload           6
	//* 174  461:invokeinterface #294 <Method int NodeList.getLength()>
	//* 175  466:icmplt          215
	//* 176  469:aload_0         
	//* 177  470:getfield        #49  <Field Map tagDefines>
	//* 178  473:aload           5
	//* 179  475:invokevirtual   #298 <Method byte TagDefine.getId()>
	//* 180  478:invokestatic    #135 <Method Byte Byte.valueOf(byte)>
	//* 181  481:aload           5
	//* 182  483:invokeinterface #302 <Method Object Map.put(Object, Object)>
	//* 183  488:pop             
	//* 184  489:iload_2         
	//* 185  490:iconst_1        
	//* 186  491:iadd            
	//* 187  492:istore_2        
	//* 188  493:iload_2         
	//* 189  494:aload           4
	//* 190  496:invokeinterface #294 <Method int NodeList.getLength()>
	//* 191  501:icmplt          49
	//* 192  504:aload_1         
	//* 193  505:ldc2            #304 <String "Message">
	//* 194  508:invokeinterface #182 <Method NodeList Element.getElementsByTagName(String)>
	//* 195  513:astore_1        
	//* 196  514:iconst_0        
	//* 197  515:istore_2        
	//* 198  516:goto            905
	//* 199  519:aload_1         
	//* 200  520:iload_2         
	//* 201  521:invokeinterface #189 <Method Node NodeList.item(int)>
	//* 202  526:astore          5
	//* 203  528:aload           5
	//* 204  530:invokeinterface #195 <Method NamedNodeMap Node.getAttributes()>
	//* 205  535:astore          4
	//* 206  537:aload           4
	//* 207  539:ldc2            #306 <String "code">
	//* 208  542:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 209  547:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 210  552:astore          6
	//* 211  554:aload           4
	//* 212  556:ldc2            #308 <String "retCode">
	//* 213  559:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 214  564:astore          7
	//* 215  566:new             #127 <Class MessageDefine>
	//* 216  569:dup             
	//* 217  570:invokespecial   #309 <Method void MessageDefine()>
	//* 218  573:astore          4
	//* 219  575:aload           4
	//* 220  577:aload           6
	//* 221  579:invokestatic    #219 <Method int Integer.parseInt(String)>
	//* 222  582:invokevirtual   #312 <Method void MessageDefine.setMessageCode(int)>
	//* 223  585:aload           7
	//* 224  587:ifnull          602
	//* 225  590:aload           4
	//* 226  592:aload           7
	//* 227  594:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 228  599:invokevirtual   #315 <Method void MessageDefine.setRetCode(String)>
	//* 229  602:aload           5
	//* 230  604:invokeinterface #243 <Method NodeList Node.getChildNodes()>
	//* 231  609:astore          5
	//* 232  611:iconst_0        
	//* 233  612:istore_3        
	//* 234  613:goto            840
	//* 235  616:aload           5
	//* 236  618:iload_3         
	//* 237  619:invokeinterface #189 <Method Node NodeList.item(int)>
	//* 238  624:astore          6
	//* 239  626:aload           6
	//* 240  628:ifnull          814
	//* 241  631:ldc2            #317 <String "Data">
	//* 242  634:aload           6
	//* 243  636:invokeinterface #248 <Method String Node.getNodeName()>
	//* 244  641:invokevirtual   #254 <Method boolean String.equals(Object)>
	//* 245  644:ifeq            1116
	//* 246  647:aload           6
	//* 247  649:invokeinterface #195 <Method NamedNodeMap Node.getAttributes()>
	//* 248  654:astore          7
	//* 249  656:new             #319 <Class MessageTagDefine>
	//* 250  659:dup             
	//* 251  660:invokespecial   #320 <Method void MessageTagDefine()>
	//* 252  663:astore          6
	//* 253  665:aload           7
	//* 254  667:ldc1            #176 <String "Tag">
	//* 255  669:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 256  674:astore          8
	//* 257  676:aload           8
	//* 258  678:ifnull          699
	//* 259  681:aload           6
	//* 260  683:aload           8
	//* 261  685:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 262  690:bipush          16
	//* 263  692:invokestatic    #210 <Method int Integer.parseInt(String, int)>
	//* 264  695:int2byte        
	//* 265  696:invokevirtual   #321 <Method void MessageTagDefine.setTag(byte)>
	//* 266  699:aload           7
	//* 267  701:ldc2            #265 <String "multiple">
	//* 268  704:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 269  709:astore          8
	//* 270  711:aload           8
	//* 271  713:ifnull          731
	//* 272  716:aload           6
	//* 273  718:aload           8
	//* 274  720:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 275  725:invokestatic    #219 <Method int Integer.parseInt(String)>
	//* 276  728:invokevirtual   #322 <Method void MessageTagDefine.setMultiple(int)>
	//* 277  731:aload           7
	//* 278  733:ldc2            #270 <String "exist">
	//* 279  736:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 280  741:astore          8
	//* 281  743:aload           8
	//* 282  745:ifnull          766
	//* 283  748:aload           6
	//* 284  750:aload           8
	//* 285  752:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 286  757:invokestatic    #219 <Method int Integer.parseInt(String)>
	//* 287  760:invokevirtual   #323 <Method void MessageTagDefine.setExist(int)>
	//* 288  763:goto            772
	//* 289  766:aload           6
	//* 290  768:iconst_1        
	//* 291  769:invokevirtual   #323 <Method void MessageTagDefine.setExist(int)>
	//* 292  772:aload           7
	//* 293  774:ldc2            #275 <String "order">
	//* 294  777:invokeinterface #203 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 295  782:astore          7
	//* 296  784:aload           7
	//* 297  786:ifnull          804
	//* 298  789:aload           6
	//* 299  791:aload           7
	//* 300  793:invokeinterface #206 <Method String Node.getNodeValue()>
	//* 301  798:invokestatic    #219 <Method int Integer.parseInt(String)>
	//* 302  801:invokevirtual   #324 <Method void MessageTagDefine.setOrder(int)>
	//* 303  804:aload           4
	//* 304  806:aload           6
	//* 305  808:invokevirtual   #328 <Method void MessageDefine.addMessageData(MessageTagDefine)>
	//* 306  811:goto            1116
	//* 307  814:aload_0         
	//* 308  815:getfield        #34  <Field FMLog log>
	//* 309  818:ifnull          1116
	//* 310  821:aload_0         
	//* 311  822:getfield        #34  <Field FMLog log>
	//* 312  825:aload_0         
	//* 313  826:getfield        #42  <Field String logTag>
	//* 314  829:ldc2            #330 <String "\u52A0\u8F7DTAG\u5B9A\u4E49\u6587\u4EF6\u65F6\uFF0C\u6D88\u606F\u8282\u70B9\u4E3A\u7A7A">
	//* 315  832:invokeinterface #290 <Method void FMLog.warn(String, String)>
	//* 316  837:goto            1116
	//* 317  840:iload_3         
	//* 318  841:aload           5
	//* 319  843:invokeinterface #294 <Method int NodeList.getLength()>
	//* 320  848:icmplt          616
	//* 321  851:aload           4
	//* 322  853:invokevirtual   #333 <Method String MessageDefine.getRetCode()>
	//* 323  856:ifnonnull       882
	//* 324  859:aload_0         
	//* 325  860:getfield        #51  <Field Map messageDefines>
	//* 326  863:aload           4
	//* 327  865:invokevirtual   #336 <Method int MessageDefine.getMessageCode()>
	//* 328  868:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//* 329  871:aload           4
	//* 330  873:invokeinterface #302 <Method Object Map.put(Object, Object)>
	//* 331  878:pop             
	//* 332  879:goto            1123
	//* 333  882:aload_0         
	//* 334  883:getfield        #53  <Field Map messageRetDefines>
	//* 335  886:aload           4
	//* 336  888:invokevirtual   #336 <Method int MessageDefine.getMessageCode()>
	//* 337  891:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//* 338  894:aload           4
	//* 339  896:invokeinterface #302 <Method Object Map.put(Object, Object)>
	//* 340  901:pop             
	//* 341  902:goto            1123
	//* 342  905:aload_1         
	//* 343  906:invokeinterface #294 <Method int NodeList.getLength()>
	//* 344  911:istore_3        
	//* 345  912:iload_2         
	//* 346  913:iload_3         
	//* 347  914:icmplt          519
	//* 348  917:goto            1079
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//* 349  920:astore_1        
		{
			if(log != null)
	//* 350  921:aload_0         
	//* 351  922:getfield        #34  <Field FMLog log>
	//* 352  925:ifnull          945
				log.error(logTag, Util4Java.getExceptionInfo(((Exception) (inputstream))));
	//  353  928:aload_0         
	//  354  929:getfield        #34  <Field FMLog log>
	//  355  932:aload_0         
	//  356  933:getfield        #42  <Field String logTag>
	//  357  936:aload_1         
	//  358  937:invokestatic    #342 <Method String Util4Java.getExceptionInfo(Exception)>
	//  359  940:invokeinterface #345 <Method void FMLog.error(String, String)>
			throw new FMCommunicationMessageException((new StringBuilder("\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5F02\u5E38")).append(Util4Java.getExceptionInfo(((Exception) (inputstream)))).toString());
	//  360  945:new             #62  <Class FMCommunicationMessageException>
	//  361  948:dup             
	//  362  949:new             #347 <Class StringBuilder>
	//  363  952:dup             
	//  364  953:ldc2            #349 <String "\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5F02\u5E38">
	//  365  956:invokespecial   #350 <Method void StringBuilder(String)>
	//  366  959:aload_1         
	//  367  960:invokestatic    #342 <Method String Util4Java.getExceptionInfo(Exception)>
	//  368  963:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  369  966:invokevirtual   #357 <Method String StringBuilder.toString()>
	//  370  969:invokespecial   #152 <Method void FMCommunicationMessageException(String)>
	//  371  972:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//* 372  973:astore_1        
		{
			if(log != null)
	//* 373  974:aload_0         
	//* 374  975:getfield        #34  <Field FMLog log>
	//* 375  978:ifnull          998
				log.error(logTag, Util4Java.getExceptionInfo(((Exception) (inputstream))));
	//  376  981:aload_0         
	//  377  982:getfield        #34  <Field FMLog log>
	//  378  985:aload_0         
	//  379  986:getfield        #42  <Field String logTag>
	//  380  989:aload_1         
	//  381  990:invokestatic    #342 <Method String Util4Java.getExceptionInfo(Exception)>
	//  382  993:invokeinterface #345 <Method void FMLog.error(String, String)>
			throw new FMCommunicationMessageException((new StringBuilder("\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5F02\u5E38")).append(Util4Java.getExceptionInfo(((Exception) (inputstream)))).toString());
	//  383  998:new             #62  <Class FMCommunicationMessageException>
	//  384 1001:dup             
	//  385 1002:new             #347 <Class StringBuilder>
	//  386 1005:dup             
	//  387 1006:ldc2            #349 <String "\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5F02\u5E38">
	//  388 1009:invokespecial   #350 <Method void StringBuilder(String)>
	//  389 1012:aload_1         
	//  390 1013:invokestatic    #342 <Method String Util4Java.getExceptionInfo(Exception)>
	//  391 1016:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  392 1019:invokevirtual   #357 <Method String StringBuilder.toString()>
	//  393 1022:invokespecial   #152 <Method void FMCommunicationMessageException(String)>
	//  394 1025:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//* 395 1026:astore_1        
		{
			if(log != null)
	//* 396 1027:aload_0         
	//* 397 1028:getfield        #34  <Field FMLog log>
	//* 398 1031:ifnull          1051
				log.error(logTag, Util4Java.getExceptionInfo(((Exception) (inputstream))));
	//  399 1034:aload_0         
	//  400 1035:getfield        #34  <Field FMLog log>
	//  401 1038:aload_0         
	//  402 1039:getfield        #42  <Field String logTag>
	//  403 1042:aload_1         
	//  404 1043:invokestatic    #342 <Method String Util4Java.getExceptionInfo(Exception)>
	//  405 1046:invokeinterface #345 <Method void FMLog.error(String, String)>
			throw new FMCommunicationMessageException((new StringBuilder("\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5F02\u5E38")).append(Util4Java.getExceptionInfo(((Exception) (inputstream)))).toString());
	//  406 1051:new             #62  <Class FMCommunicationMessageException>
	//  407 1054:dup             
	//  408 1055:new             #347 <Class StringBuilder>
	//  409 1058:dup             
	//  410 1059:ldc2            #349 <String "\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5F02\u5E38">
	//  411 1062:invokespecial   #350 <Method void StringBuilder(String)>
	//  412 1065:aload_1         
	//  413 1066:invokestatic    #342 <Method String Util4Java.getExceptionInfo(Exception)>
	//  414 1069:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//  415 1072:invokevirtual   #357 <Method String StringBuilder.toString()>
	//  416 1075:invokespecial   #152 <Method void FMCommunicationMessageException(String)>
	//  417 1078:athrow          
		}
		i = 0;
		  goto _L1
_L10:
		obj1 = ((Object) (new TagDefine()));
		obj2 = ((Object) (((NodeList) (obj)).item(i)));
		obj3 = ((Object) (((Node) (obj2)).getAttributes()));
		obj4 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("id")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_111;
		((TagDefine) (obj1)).setId((byte)Integer.parseInt(((Node) (obj4)).getNodeValue(), 16));
		obj4 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("length")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_142;
		((TagDefine) (obj1)).setLength(Integer.parseInt(((Node) (obj4)).getNodeValue()));
		obj4 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("type")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_173;
		((TagDefine) (obj1)).setType(ETagType.valueOf(((Node) (obj4)).getNodeValue()));
		obj3 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("desc")));
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_201;
		((TagDefine) (obj1)).setDesc(((Node) (obj3)).getNodeValue());
		obj2 = ((Object) (((Node) (obj2)).getChildNodes()));
		j = 0;
		  goto _L2
_L8:
		obj3 = ((Object) (((NodeList) (obj2)).item(j)));
		if(obj3 == null) goto _L4; else goto _L3
_L3:
		if(!"Item".equals(((Object) (((Node) (obj3)).getNodeName())))) goto _L6; else goto _L5
_L5:
		obj4 = ((Object) (((Node) (obj3)).getAttributes()));
		obj3 = ((Object) (new TagItemDefine()));
		node = ((NamedNodeMap) (obj4)).getNamedItem("tag");
		if(node == null)
			break MISSING_BLOCK_LABEL_298;
		((TagItemDefine) (obj3)).setTag((byte)Integer.parseInt(node.getNodeValue(), 16));
		node = ((NamedNodeMap) (obj4)).getNamedItem("desc");
		if(node == null)
			break MISSING_BLOCK_LABEL_326;
		((TagItemDefine) (obj3)).setDesc(node.getNodeValue());
		node = ((NamedNodeMap) (obj4)).getNamedItem("multiple");
		if(node == null)
			break MISSING_BLOCK_LABEL_358;
		((TagItemDefine) (obj3)).setMultiple(Integer.parseInt(node.getNodeValue()));
		node = ((NamedNodeMap) (obj4)).getNamedItem("exist");
		if(node == null)
			break MISSING_BLOCK_LABEL_390;
		((TagItemDefine) (obj3)).setExist(Integer.parseInt(node.getNodeValue()));
		obj4 = ((Object) (((NamedNodeMap) (obj4)).getNamedItem("order")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_422;
		((TagItemDefine) (obj3)).setOrder(Integer.parseInt(((Node) (obj4)).getNodeValue()));
		((TagDefine) (obj1)).addTagItem(((TagItemDefine) (obj3)));
		  goto _L6
_L4:
		if(log != null)
			log.warn(logTag, "\u52A0\u8F7DTAG\u5B9A\u4E49\u6587\u4EF6\u65F6\uFF0CTAG\u8282\u70B9\u4E3A\u7A7A");
		  goto _L6
_L2:
		if(j < ((NodeList) (obj2)).getLength()) goto _L8; else goto _L7
_L7:
		tagDefines.put(((Object) (Byte.valueOf(((TagDefine) (obj1)).getId()))), obj1);
		i++;
_L1:
		if(i < ((NodeList) (obj)).getLength()) goto _L10; else goto _L9
_L9:
		inputstream = ((InputStream) (((Element) (inputstream)).getElementsByTagName("Message")));
		i = 0;
		  goto _L11
_L20:
		obj1 = ((Object) (((NodeList) (inputstream)).item(i)));
		obj = ((Object) (((Node) (obj1)).getAttributes()));
		obj2 = ((Object) (((NamedNodeMap) (obj)).getNamedItem("code").getNodeValue()));
		obj3 = ((Object) (((NamedNodeMap) (obj)).getNamedItem("retCode")));
		obj = ((Object) (new MessageDefine()));
		((MessageDefine) (obj)).setMessageCode(Integer.parseInt(((String) (obj2))));
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_602;
		((MessageDefine) (obj)).setRetCode(((Node) (obj3)).getNodeValue());
		obj1 = ((Object) (((Node) (obj1)).getChildNodes()));
		j = 0;
		  goto _L12
_L18:
		obj2 = ((Object) (((NodeList) (obj1)).item(j)));
		if(obj2 == null) goto _L14; else goto _L13
_L13:
		if(!"Data".equals(((Object) (((Node) (obj2)).getNodeName())))) goto _L16; else goto _L15
_L15:
		obj3 = ((Object) (((Node) (obj2)).getAttributes()));
		obj2 = ((Object) (new MessageTagDefine()));
		obj4 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("Tag")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_699;
		((MessageTagDefine) (obj2)).setTag((byte)Integer.parseInt(((Node) (obj4)).getNodeValue(), 16));
		obj4 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("multiple")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_731;
		((MessageTagDefine) (obj2)).setMultiple(Integer.parseInt(((Node) (obj4)).getNodeValue()));
		obj4 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("exist")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_766;
		((MessageTagDefine) (obj2)).setExist(Integer.parseInt(((Node) (obj4)).getNodeValue()));
		break MISSING_BLOCK_LABEL_772;
		((MessageTagDefine) (obj2)).setExist(1);
		obj3 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("order")));
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_804;
		((MessageTagDefine) (obj2)).setOrder(Integer.parseInt(((Node) (obj3)).getNodeValue()));
		((MessageDefine) (obj)).addMessageData(((MessageTagDefine) (obj2)));
		  goto _L16
_L14:
		if(log != null)
			log.warn(logTag, "\u52A0\u8F7DTAG\u5B9A\u4E49\u6587\u4EF6\u65F6\uFF0C\u6D88\u606F\u8282\u70B9\u4E3A\u7A7A");
		  goto _L16
_L12:
		if(j < ((NodeList) (obj1)).getLength()) goto _L18; else goto _L17
_L17:
		if(((MessageDefine) (obj)).getRetCode() == null)
		{
			messageDefines.put(((Object) (Integer.valueOf(((MessageDefine) (obj)).getMessageCode()))), obj);
			break MISSING_BLOCK_LABEL_1123;
		}
		messageRetDefines.put(((Object) (Integer.valueOf(((MessageDefine) (obj)).getMessageCode()))), obj);
		break MISSING_BLOCK_LABEL_1123;
_L11:
		if(i < (j = ((NodeList) (inputstream)).getLength())) goto _L20; else goto _L19
_L19:
		loadFlag = true;
	//  418 1079:aload_0         
	//  419 1080:iconst_1        
	//  420 1081:putfield        #44  <Field boolean loadFlag>
		if(log != null)
	//* 421 1084:aload_0         
	//* 422 1085:getfield        #34  <Field FMLog log>
	//* 423 1088:ifnull          1107
			log.info(logTag, "load message config sucess");
	//  424 1091:aload_0         
	//  425 1092:getfield        #34  <Field FMLog log>
	//  426 1095:aload_0         
	//  427 1096:getfield        #42  <Field String logTag>
	//  428 1099:ldc2            #359 <String "load message config sucess">
	//  429 1102:invokeinterface #362 <Method void FMLog.info(String, String)>
		return 0;
	//  430 1107:iconst_0        
	//  431 1108:ireturn         
_L6:
		j++;
	//  432 1109:iload_3         
	//  433 1110:iconst_1        
	//  434 1111:iadd            
	//  435 1112:istore_3        
		  goto _L2
	//* 436 1113:goto            458
_L16:
		j++;
	//  437 1116:iload_3         
	//  438 1117:iconst_1        
	//  439 1118:iadd            
	//  440 1119:istore_3        
		  goto _L12
	//* 441 1120:goto            840
		i++;
	//  442 1123:iload_2         
	//  443 1124:iconst_1        
	//  444 1125:iadd            
	//  445 1126:istore_2        
		  goto _L11
	//* 446 1127:goto            905
	}

	private boolean loadFlag;
	private FMLog log;
	private String logTag;
	private Map messageDefines;
	private Map messageRetDefines;
	private Map tagDefines;
}
