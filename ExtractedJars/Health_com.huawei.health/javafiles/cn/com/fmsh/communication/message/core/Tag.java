// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.core;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.TLVParse;
import cn.com.fmsh.communication.message.enumerate.ETagType;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.communication.message.tagvalue.HandlerFactory;
import cn.com.fmsh.communication.message.tagvalue.StringValueHandler;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.util.*;

// Referenced classes of package cn.com.fmsh.communication.message.core:
//			Message, MessageHandler, TagDefine, TagItemDefine

public class Tag
	implements ITag
{

	Tag(MessageHandler messagehandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		log = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #40  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #42  <Field FMLog log>
		logTag = ((Class) (cn/com/fmsh/communication/message/core/Message)).getName();
	//    6   14:aload_0         
	//    7   15:ldc1            #44  <Class Message>
	//    8   17:invokevirtual   #50  <Method String Class.getName()>
	//    9   20:putfield        #52  <Field String logTag>
		children = ((List) (new ArrayList()));
	//   10   23:aload_0         
	//   11   24:new             #54  <Class ArrayList>
	//   12   27:dup             
	//   13   28:invokespecial   #55  <Method void ArrayList()>
	//   14   31:putfield        #57  <Field List children>
		isReadonly = false;
	//   15   34:aload_0         
	//   16   35:iconst_0        
	//   17   36:putfield        #59  <Field boolean isReadonly>
		mMessageHandler = messagehandler;
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:putfield        #61  <Field MessageHandler mMessageHandler>
	//   21   44:return          
	}

	Tag(MessageHandler messagehandler, byte byte0)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		log = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #40  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #42  <Field FMLog log>
		logTag = ((Class) (cn/com/fmsh/communication/message/core/Message)).getName();
	//    6   14:aload_0         
	//    7   15:ldc1            #44  <Class Message>
	//    8   17:invokevirtual   #50  <Method String Class.getName()>
	//    9   20:putfield        #52  <Field String logTag>
		children = ((List) (new ArrayList()));
	//   10   23:aload_0         
	//   11   24:new             #54  <Class ArrayList>
	//   12   27:dup             
	//   13   28:invokespecial   #55  <Method void ArrayList()>
	//   14   31:putfield        #57  <Field List children>
		isReadonly = false;
	//   15   34:aload_0         
	//   16   35:iconst_0        
	//   17   36:putfield        #59  <Field boolean isReadonly>
		mMessageHandler = messagehandler;
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:putfield        #61  <Field MessageHandler mMessageHandler>
		id = byte0;
	//   21   44:aload_0         
	//   22   45:iload_2         
	//   23   46:putfield        #65  <Field byte id>
		tagDefine = mMessageHandler.getTagDefine(byte0);
	//   24   49:aload_0         
	//   25   50:aload_0         
	//   26   51:getfield        #61  <Field MessageHandler mMessageHandler>
	//   27   54:iload_2         
	//   28   55:invokevirtual   #71  <Method TagDefine MessageHandler.getTagDefine(byte)>
	//   29   58:putfield        #73  <Field TagDefine tagDefine>
	//   30   61:return          
	}

	public int addValue(int i)
		throws FMCommunicationMessageException
	{
		if(isReadonly)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean isReadonly>
	//*   2    4:ifeq            34
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u8BE5Tag\u53EA\u8BFB", new Object[] {
				Byte.valueOf(id)
			}));
	//    3    7:new             #77  <Class FMCommunicationMessageException>
	//    4   10:dup             
	//    5   11:ldc1            #79  <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u8BE5Tag\u53EA\u8BFB">
	//    6   13:iconst_1        
	//    7   14:anewarray       Object[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:getfield        #65  <Field byte id>
	//   12   23:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   13   26:aastore         
	//   14   27:invokestatic    #91  <Method String String.format(String, Object[])>
	//   15   30:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   16   33:athrow          
		if(tagDefine == null)
	//*  17   34:aload_0         
	//*  18   35:getfield        #73  <Field TagDefine tagDefine>
	//*  19   38:ifnonnull       68
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u5931\u8D25", new Object[] {
				Byte.valueOf(id)
			}));
	//   20   41:new             #77  <Class FMCommunicationMessageException>
	//   21   44:dup             
	//   22   45:ldc1            #96  <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u5931\u8D25">
	//   23   47:iconst_1        
	//   24   48:anewarray       Object[]
	//   25   51:dup             
	//   26   52:iconst_0        
	//   27   53:aload_0         
	//   28   54:getfield        #65  <Field byte id>
	//   29   57:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   30   60:aastore         
	//   31   61:invokestatic    #91  <Method String String.format(String, Object[])>
	//   32   64:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   33   67:athrow          
		tagType = tagDefine.getType();
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:getfield        #73  <Field TagDefine tagDefine>
	//   37   73:invokevirtual   #102 <Method ETagType TagDefine.getType()>
	//   38   76:putfield        #104 <Field ETagType tagType>
		if(tagType != ETagType.I)
	//*  39   79:aload_0         
	//*  40   80:getfield        #104 <Field ETagType tagType>
	//*  41   83:getstatic       #109 <Field ETagType ETagType.I>
	//*  42   86:if_acmpeq       116
		{
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG\u503C\u7684\u7C7B\u578B\u51FA\u9519", new Object[] {
				Byte.valueOf(id)
			}));
	//   43   89:new             #77  <Class FMCommunicationMessageException>
	//   44   92:dup             
	//   45   93:ldc1            #111 <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG\u503C\u7684\u7C7B\u578B\u51FA\u9519">
	//   46   95:iconst_1        
	//   47   96:anewarray       Object[]
	//   48   99:dup             
	//   49  100:iconst_0        
	//   50  101:aload_0         
	//   51  102:getfield        #65  <Field byte id>
	//   52  105:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   53  108:aastore         
	//   54  109:invokestatic    #91  <Method String String.format(String, Object[])>
	//   55  112:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   56  115:athrow          
		} else
		{
			tagValue = FM_Bytes.intToBytes(i, tagDefine.getLength());
	//   57  116:aload_0         
	//   58  117:iload_1         
	//   59  118:aload_0         
	//   60  119:getfield        #73  <Field TagDefine tagDefine>
	//   61  122:invokevirtual   #115 <Method int TagDefine.getLength()>
	//   62  125:invokestatic    #121 <Method byte[] FM_Bytes.intToBytes(int, int)>
	//   63  128:putfield        #123 <Field byte[] tagValue>
			return 0;
	//   64  131:iconst_0        
	//   65  132:ireturn         
		}
	}

	public int addValue(ITag itag)
		throws FMCommunicationMessageException
	{
		int i;
label0:
		{
			if(itag == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       31
				throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165\u7684TAG\u4E3A\u7A7A", new Object[] {
					Byte.valueOf(id)
				}));
	//    2    4:new             #77  <Class FMCommunicationMessageException>
	//    3    7:dup             
	//    4    8:ldc1            #127 <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165\u7684TAG\u4E3A\u7A7A">
	//    5   10:iconst_1        
	//    6   11:anewarray       Object[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:aload_0         
	//   10   17:getfield        #65  <Field byte id>
	//   11   20:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   12   23:aastore         
	//   13   24:invokestatic    #91  <Method String String.format(String, Object[])>
	//   14   27:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   15   30:athrow          
			if(isReadonly)
	//*  16   31:aload_0         
	//*  17   32:getfield        #59  <Field boolean isReadonly>
	//*  18   35:ifeq            65
				throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u8BE5Tag\u53EA\u8BFB", new Object[] {
					Byte.valueOf(id)
				}));
	//   19   38:new             #77  <Class FMCommunicationMessageException>
	//   20   41:dup             
	//   21   42:ldc1            #79  <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u8BE5Tag\u53EA\u8BFB">
	//   22   44:iconst_1        
	//   23   45:anewarray       Object[]
	//   24   48:dup             
	//   25   49:iconst_0        
	//   26   50:aload_0         
	//   27   51:getfield        #65  <Field byte id>
	//   28   54:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   29   57:aastore         
	//   30   58:invokestatic    #91  <Method String String.format(String, Object[])>
	//   31   61:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   32   64:athrow          
			if(tagDefine == null)
	//*  33   65:aload_0         
	//*  34   66:getfield        #73  <Field TagDefine tagDefine>
	//*  35   69:ifnonnull       99
				throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u5931\u8D25", new Object[] {
					Byte.valueOf(id)
				}));
	//   36   72:new             #77  <Class FMCommunicationMessageException>
	//   37   75:dup             
	//   38   76:ldc1            #96  <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u5931\u8D25">
	//   39   78:iconst_1        
	//   40   79:anewarray       Object[]
	//   41   82:dup             
	//   42   83:iconst_0        
	//   43   84:aload_0         
	//   44   85:getfield        #65  <Field byte id>
	//   45   88:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   46   91:aastore         
	//   47   92:invokestatic    #91  <Method String String.format(String, Object[])>
	//   48   95:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   49   98:athrow          
			tagType = tagDefine.getType();
	//   50   99:aload_0         
	//   51  100:aload_0         
	//   52  101:getfield        #73  <Field TagDefine tagDefine>
	//   53  104:invokevirtual   #102 <Method ETagType TagDefine.getType()>
	//   54  107:putfield        #104 <Field ETagType tagType>
			if(tagType != ETagType.C)
	//*  55  110:aload_0         
	//*  56  111:getfield        #104 <Field ETagType tagType>
	//*  57  114:getstatic       #130 <Field ETagType ETagType.C>
	//*  58  117:if_acmpeq       147
				throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG\u503C\u7684\u7C7B\u578B\u51FA\u9519", new Object[] {
					Byte.valueOf(id)
				}));
	//   59  120:new             #77  <Class FMCommunicationMessageException>
	//   60  123:dup             
	//   61  124:ldc1            #111 <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG\u503C\u7684\u7C7B\u578B\u51FA\u9519">
	//   62  126:iconst_1        
	//   63  127:anewarray       Object[]
	//   64  130:dup             
	//   65  131:iconst_0        
	//   66  132:aload_0         
	//   67  133:getfield        #65  <Field byte id>
	//   68  136:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   69  139:aastore         
	//   70  140:invokestatic    #91  <Method String String.format(String, Object[])>
	//   71  143:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   72  146:athrow          
			TagItemDefine atagitemdefine[] = tagDefine.getTagItemDefines();
	//   73  147:aload_0         
	//   74  148:getfield        #73  <Field TagDefine tagDefine>
	//   75  151:invokevirtual   #134 <Method TagItemDefine[] TagDefine.getTagItemDefines()>
	//   76  154:astore          5
			boolean flag = false;
	//   77  156:iconst_0        
	//   78  157:istore_3        
			int j = atagitemdefine.length;
	//   79  158:aload           5
	//   80  160:arraylength     
	//   81  161:istore          4
			for(i = 0; i < j; i++)
	//*  82  163:iconst_0        
	//*  83  164:istore_2        
	//*  84  165:goto            193
			{
				if(atagitemdefine[i].getTag() != itag.getId())
					continue;
	//   85  168:aload           5
	//   86  170:iload_2         
	//   87  171:aaload          
	//   88  172:invokevirtual   #140 <Method byte TagItemDefine.getTag()>
	//   89  175:aload_1         
	//   90  176:invokeinterface #143 <Method byte ITag.getId()>
	//   91  181:icmpne          189
				i = 1;
	//   92  184:iconst_1        
	//   93  185:istore_2        
				break label0;
	//   94  186:goto            201
			}

	//   95  189:iload_2         
	//   96  190:iconst_1        
	//   97  191:iadd            
	//   98  192:istore_2        
	//   99  193:iload_2         
	//  100  194:iload           4
	//  101  196:icmplt          168
			i = ((int) (flag));
	//  102  199:iload_3         
	//  103  200:istore_2        
		}
		if(i != 0)
	//* 104  201:iload_2         
	//* 105  202:ifeq            219
			children.add(((Object) (itag)));
	//  106  205:aload_0         
	//  107  206:getfield        #57  <Field List children>
	//  108  209:aload_1         
	//  109  210:invokeinterface #149 <Method boolean List.add(Object)>
	//  110  215:pop             
		else
	//* 111  216:goto            248
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG \u6807\u8BC6\u4E0D\u5408\u6CD5", new Object[] {
				Byte.valueOf(itag.getId())
			}));
	//  112  219:new             #77  <Class FMCommunicationMessageException>
	//  113  222:dup             
	//  114  223:ldc1            #151 <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG \u6807\u8BC6\u4E0D\u5408\u6CD5">
	//  115  225:iconst_1        
	//  116  226:anewarray       Object[]
	//  117  229:dup             
	//  118  230:iconst_0        
	//  119  231:aload_1         
	//  120  232:invokeinterface #143 <Method byte ITag.getId()>
	//  121  237:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//  122  240:aastore         
	//  123  241:invokestatic    #91  <Method String String.format(String, Object[])>
	//  124  244:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//  125  247:athrow          
		return 0;
	//  126  248:iconst_0        
	//  127  249:ireturn         
	}

	public int addValue(String s)
		throws FMCommunicationMessageException
	{
		if(isReadonly)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean isReadonly>
	//*   2    4:ifeq            34
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u8BE5Tag\u53EA\u8BFB", new Object[] {
				Byte.valueOf(id)
			}));
	//    3    7:new             #77  <Class FMCommunicationMessageException>
	//    4   10:dup             
	//    5   11:ldc1            #79  <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u8BE5Tag\u53EA\u8BFB">
	//    6   13:iconst_1        
	//    7   14:anewarray       Object[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:getfield        #65  <Field byte id>
	//   12   23:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   13   26:aastore         
	//   14   27:invokestatic    #91  <Method String String.format(String, Object[])>
	//   15   30:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   16   33:athrow          
		if(tagDefine == null)
	//*  17   34:aload_0         
	//*  18   35:getfield        #73  <Field TagDefine tagDefine>
	//*  19   38:ifnonnull       68
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u5931\u8D25", new Object[] {
				Byte.valueOf(id)
			}));
	//   20   41:new             #77  <Class FMCommunicationMessageException>
	//   21   44:dup             
	//   22   45:ldc1            #96  <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u5931\u8D25">
	//   23   47:iconst_1        
	//   24   48:anewarray       Object[]
	//   25   51:dup             
	//   26   52:iconst_0        
	//   27   53:aload_0         
	//   28   54:getfield        #65  <Field byte id>
	//   29   57:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   30   60:aastore         
	//   31   61:invokestatic    #91  <Method String String.format(String, Object[])>
	//   32   64:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   33   67:athrow          
		tagType = tagDefine.getType();
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:getfield        #73  <Field TagDefine tagDefine>
	//   37   73:invokevirtual   #102 <Method ETagType TagDefine.getType()>
	//   38   76:putfield        #104 <Field ETagType tagType>
		StringValueHandler stringvaluehandler = HandlerFactory.instance().getStringValueHandle(tagType);
	//   39   79:invokestatic    #158 <Method HandlerFactory HandlerFactory.instance()>
	//   40   82:aload_0         
	//   41   83:getfield        #104 <Field ETagType tagType>
	//   42   86:invokevirtual   #162 <Method StringValueHandler HandlerFactory.getStringValueHandle(ETagType)>
	//   43   89:astore_2        
		if(stringvaluehandler != null)
	//*  44   90:aload_2         
	//*  45   91:ifnull          108
			tagValue = stringvaluehandler.setTagValue(s);
	//   46   94:aload_0         
	//   47   95:aload_2         
	//   48   96:aload_1         
	//   49   97:invokeinterface #168 <Method byte[] StringValueHandler.setTagValue(String)>
	//   50  102:putfield        #123 <Field byte[] tagValue>
		else
	//*  51  105:goto            135
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u4E0D\u5408\u6CD5", new Object[] {
				Byte.valueOf(id)
			}));
	//   52  108:new             #77  <Class FMCommunicationMessageException>
	//   53  111:dup             
	//   54  112:ldc1            #170 <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u4E0D\u5408\u6CD5">
	//   55  114:iconst_1        
	//   56  115:anewarray       Object[]
	//   57  118:dup             
	//   58  119:iconst_0        
	//   59  120:aload_0         
	//   60  121:getfield        #65  <Field byte id>
	//   61  124:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   62  127:aastore         
	//   63  128:invokestatic    #91  <Method String String.format(String, Object[])>
	//   64  131:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   65  134:athrow          
		return 0;
	//   66  135:iconst_0        
	//   67  136:ireturn         
	}

	public int addValue(byte abyte0[])
		throws FMCommunicationMessageException
	{
		if(isReadonly)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean isReadonly>
	//*   2    4:ifeq            34
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u8BE5Tag\u53EA\u8BFB", new Object[] {
				Byte.valueOf(id)
			}));
	//    3    7:new             #77  <Class FMCommunicationMessageException>
	//    4   10:dup             
	//    5   11:ldc1            #79  <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u8BE5Tag\u53EA\u8BFB">
	//    6   13:iconst_1        
	//    7   14:anewarray       Object[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:getfield        #65  <Field byte id>
	//   12   23:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   13   26:aastore         
	//   14   27:invokestatic    #91  <Method String String.format(String, Object[])>
	//   15   30:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   16   33:athrow          
		if(tagDefine == null)
	//*  17   34:aload_0         
	//*  18   35:getfield        #73  <Field TagDefine tagDefine>
	//*  19   38:ifnonnull       68
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u5931\u8D25", new Object[] {
				Byte.valueOf(id)
			}));
	//   20   41:new             #77  <Class FMCommunicationMessageException>
	//   21   44:dup             
	//   22   45:ldc1            #96  <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u83B7\u53D6TAG\u7C7B\u578B\u5931\u8D25">
	//   23   47:iconst_1        
	//   24   48:anewarray       Object[]
	//   25   51:dup             
	//   26   52:iconst_0        
	//   27   53:aload_0         
	//   28   54:getfield        #65  <Field byte id>
	//   29   57:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   30   60:aastore         
	//   31   61:invokestatic    #91  <Method String String.format(String, Object[])>
	//   32   64:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   33   67:athrow          
		tagType = tagDefine.getType();
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:getfield        #73  <Field TagDefine tagDefine>
	//   37   73:invokevirtual   #102 <Method ETagType TagDefine.getType()>
	//   38   76:putfield        #104 <Field ETagType tagType>
		if(tagType != ETagType.B)
	//*  39   79:aload_0         
	//*  40   80:getfield        #104 <Field ETagType tagType>
	//*  41   83:getstatic       #173 <Field ETagType ETagType.B>
	//*  42   86:if_acmpeq       116
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG\u503C\u7684\u7C7B\u578B\u51FA\u9519", new Object[] {
				Byte.valueOf(id)
			}));
	//   43   89:new             #77  <Class FMCommunicationMessageException>
	//   44   92:dup             
	//   45   93:ldc1            #111 <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG\u503C\u7684\u7C7B\u578B\u51FA\u9519">
	//   46   95:iconst_1        
	//   47   96:anewarray       Object[]
	//   48   99:dup             
	//   49  100:iconst_0        
	//   50  101:aload_0         
	//   51  102:getfield        #65  <Field byte id>
	//   52  105:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   53  108:aastore         
	//   54  109:invokestatic    #91  <Method String String.format(String, Object[])>
	//   55  112:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   56  115:athrow          
		if(tagDefine.getLength() != 0 && abyte0.length > tagDefine.getLength())
	//*  57  116:aload_0         
	//*  58  117:getfield        #73  <Field TagDefine tagDefine>
	//*  59  120:invokevirtual   #115 <Method int TagDefine.getLength()>
	//*  60  123:ifeq            165
	//*  61  126:aload_1         
	//*  62  127:arraylength     
	//*  63  128:aload_0         
	//*  64  129:getfield        #73  <Field TagDefine tagDefine>
	//*  65  132:invokevirtual   #115 <Method int TagDefine.getLength()>
	//*  66  135:icmple          165
		{
			throw new FMCommunicationMessageException(String.format("\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG\u503C\u7684\u957F\u5EA6\u4E0D\u5408\u6CD5", new Object[] {
				Byte.valueOf(id)
			}));
	//   67  138:new             #77  <Class FMCommunicationMessageException>
	//   68  141:dup             
	//   69  142:ldc1            #175 <String "\u7ED9TAG[%X]\u8D4B\u503C\u65F6\uFF0C\u4F20\u5165TAG\u503C\u7684\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   70  144:iconst_1        
	//   71  145:anewarray       Object[]
	//   72  148:dup             
	//   73  149:iconst_0        
	//   74  150:aload_0         
	//   75  151:getfield        #65  <Field byte id>
	//   76  154:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   77  157:aastore         
	//   78  158:invokestatic    #91  <Method String String.format(String, Object[])>
	//   79  161:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   80  164:athrow          
		} else
		{
			tagValue = abyte0;
	//   81  165:aload_0         
	//   82  166:aload_1         
	//   83  167:putfield        #123 <Field byte[] tagValue>
			return 0;
	//   84  170:iconst_0        
	//   85  171:ireturn         
		}
	}

	public int clear()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(obj instanceof Tag)
	//*   4    6:aload_1         
	//*   5    7:instanceof      #2   <Class Tag>
	//*   6   10:ifeq            33
		{
			obj = ((Object) ((Tag)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Tag>
	//    9   17:astore_1        
			return id == ((Tag) (obj)).id;
	//   10   18:aload_0         
	//   11   19:getfield        #65  <Field byte id>
	//   12   22:aload_1         
	//   13   23:getfield        #65  <Field byte id>
	//   14   26:icmpne          31
	//   15   29:iconst_1        
	//   16   30:ireturn         
	//   17   31:iconst_0        
	//   18   32:ireturn         
		} else
		{
			return false;
	//   19   33:iconst_0        
	//   20   34:ireturn         
		}
	}

	public int fromPackageBody(byte byte0, byte abyte0[])
		throws FMCommunicationMessageException
	{
		id = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field byte id>
		isReadonly = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #59  <Field boolean isReadonly>
		tagDefine = mMessageHandler.getTagDefine(byte0);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #61  <Field MessageHandler mMessageHandler>
	//    9   15:iload_1         
	//   10   16:invokevirtual   #71  <Method TagDefine MessageHandler.getTagDefine(byte)>
	//   11   19:putfield        #73  <Field TagDefine tagDefine>
		if(tagDefine == null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #73  <Field TagDefine tagDefine>
	//*  14   26:ifnonnull       68
		{
			if(log != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #42  <Field FMLog log>
	//*  17   33:ifnull          65
				log.warn(logTag, String.format("\u5728\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49TAG[%X]", new Object[] {
					Byte.valueOf(byte0)
				}));
	//   18   36:aload_0         
	//   19   37:getfield        #42  <Field FMLog log>
	//   20   40:aload_0         
	//   21   41:getfield        #52  <Field String logTag>
	//   22   44:ldc1            #181 <String "\u5728\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49TAG[%X]">
	//   23   46:iconst_1        
	//   24   47:anewarray       Object[]
	//   25   50:dup             
	//   26   51:iconst_0        
	//   27   52:iload_1         
	//   28   53:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   29   56:aastore         
	//   30   57:invokestatic    #91  <Method String String.format(String, Object[])>
	//   31   60:invokeinterface #187 <Method void FMLog.warn(String, String)>
			return -2;
	//   32   65:bipush          -2
	//   33   67:ireturn         
		}
		tagType = tagDefine.getType();
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:getfield        #73  <Field TagDefine tagDefine>
	//   37   73:invokevirtual   #102 <Method ETagType TagDefine.getType()>
	//   38   76:putfield        #104 <Field ETagType tagType>
		int i = abyte0.length;
	//   39   79:aload_2         
	//   40   80:arraylength     
	//   41   81:istore_3        
		if(tagDefine.getLength() != 0 && i > tagDefine.getLength())
	//*  42   82:aload_0         
	//*  43   83:getfield        #73  <Field TagDefine tagDefine>
	//*  44   86:invokevirtual   #115 <Method int TagDefine.getLength()>
	//*  45   89:ifeq            142
	//*  46   92:iload_3         
	//*  47   93:aload_0         
	//*  48   94:getfield        #73  <Field TagDefine tagDefine>
	//*  49   97:invokevirtual   #115 <Method int TagDefine.getLength()>
	//*  50  100:icmple          142
		{
			if(log != null)
	//*  51  103:aload_0         
	//*  52  104:getfield        #42  <Field FMLog log>
	//*  53  107:ifnull          139
				log.warn(logTag, String.format("TAG[%X]\u5B9A\u4E49\u7684\u957F\u5EA6\u548C\u6570\u636E\u7ED9\u7684\u957F\u5EA6\u4E0D\u4E00\u81F4", new Object[] {
					Byte.valueOf(byte0)
				}));
	//   54  110:aload_0         
	//   55  111:getfield        #42  <Field FMLog log>
	//   56  114:aload_0         
	//   57  115:getfield        #52  <Field String logTag>
	//   58  118:ldc1            #189 <String "TAG[%X]\u5B9A\u4E49\u7684\u957F\u5EA6\u548C\u6570\u636E\u7ED9\u7684\u957F\u5EA6\u4E0D\u4E00\u81F4">
	//   59  120:iconst_1        
	//   60  121:anewarray       Object[]
	//   61  124:dup             
	//   62  125:iconst_0        
	//   63  126:iload_1         
	//   64  127:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   65  130:aastore         
	//   66  131:invokestatic    #91  <Method String String.format(String, Object[])>
	//   67  134:invokeinterface #187 <Method void FMLog.warn(String, String)>
			return -2;
	//   68  139:bipush          -2
	//   69  141:ireturn         
		}
		tagValue = abyte0;
	//   70  142:aload_0         
	//   71  143:aload_2         
	//   72  144:putfield        #123 <Field byte[] tagValue>
		if(ETagType.C == tagType)
	//*  73  147:getstatic       #130 <Field ETagType ETagType.C>
	//*  74  150:aload_0         
	//*  75  151:getfield        #104 <Field ETagType tagType>
	//*  76  154:if_acmpne       248
			for(abyte0 = ((byte []) (TLVParse.intance().parse(tagValue, 1).iterator())); ((Iterator) (abyte0)).hasNext();)
	//*  77  157:invokestatic    #195 <Method TLVParse TLVParse.intance()>
	//*  78  160:aload_0         
	//*  79  161:getfield        #123 <Field byte[] tagValue>
	//*  80  164:iconst_1        
	//*  81  165:invokevirtual   #199 <Method List TLVParse.parse(byte[], int)>
	//*  82  168:invokeinterface #203 <Method Iterator List.iterator()>
	//*  83  173:astore_2        
	//*  84  174:goto            239
			{
				cn.com.fmsh.communication.message.TLVParse.TagEntry tagentry = (cn.com.fmsh.communication.message.TLVParse.TagEntry)((Iterator) (abyte0)).next();
	//   85  177:aload_2         
	//   86  178:invokeinterface #209 <Method Object Iterator.next()>
	//   87  183:checkcast       #211 <Class cn.com.fmsh.communication.message.TLVParse$TagEntry>
	//   88  186:astore          4
				Tag tag = new Tag(mMessageHandler);
	//   89  188:new             #2   <Class Tag>
	//   90  191:dup             
	//   91  192:aload_0         
	//   92  193:getfield        #61  <Field MessageHandler mMessageHandler>
	//   93  196:invokespecial   #213 <Method void Tag(MessageHandler)>
	//   94  199:astore          5
				tag.fromPackageBody(tagentry.getTag()[0], tagentry.getData());
	//   95  201:aload           5
	//   96  203:aload           4
	//   97  205:invokevirtual   #216 <Method byte[] cn.com.fmsh.communication.message.TLVParse$TagEntry.getTag()>
	//   98  208:iconst_0        
	//   99  209:baload          
	//  100  210:aload           4
	//  101  212:invokevirtual   #219 <Method byte[] cn.com.fmsh.communication.message.TLVParse$TagEntry.getData()>
	//  102  215:invokevirtual   #221 <Method int fromPackageBody(byte, byte[])>
	//  103  218:pop             
				if(tag.isValid())
	//* 104  219:aload           5
	//* 105  221:invokevirtual   #225 <Method boolean isValid()>
	//* 106  224:ifeq            239
					children.add(((Object) (tag)));
	//  107  227:aload_0         
	//  108  228:getfield        #57  <Field List children>
	//  109  231:aload           5
	//  110  233:invokeinterface #149 <Method boolean List.add(Object)>
	//  111  238:pop             
			}

	//  112  239:aload_2         
	//  113  240:invokeinterface #228 <Method boolean Iterator.hasNext()>
	//  114  245:ifne            177
		return 0;
	//  115  248:iconst_0        
	//  116  249:ireturn         
	}

	public int fromPackageBody(byte abyte0[])
	{
		isReadonly = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #59  <Field boolean isReadonly>
		if(abyte0 == null || abyte0.length < 2)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:iconst_2        
	//*   8   12:icmpge          17
			return -1;
	//    9   15:iconst_m1       
	//   10   16:ireturn         
		id = abyte0[0];
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:iconst_0        
	//   14   20:baload          
	//   15   21:putfield        #65  <Field byte id>
		tagDefine = mMessageHandler.getTagDefine(id);
	//   16   24:aload_0         
	//   17   25:aload_0         
	//   18   26:getfield        #61  <Field MessageHandler mMessageHandler>
	//   19   29:aload_0         
	//   20   30:getfield        #65  <Field byte id>
	//   21   33:invokevirtual   #71  <Method TagDefine MessageHandler.getTagDefine(byte)>
	//   22   36:putfield        #73  <Field TagDefine tagDefine>
		if(tagDefine == null)
	//*  23   39:aload_0         
	//*  24   40:getfield        #73  <Field TagDefine tagDefine>
	//*  25   43:ifnonnull       49
			return -2;
	//   26   46:bipush          -2
	//   27   48:ireturn         
		tagType = tagDefine.getType();
	//   28   49:aload_0         
	//   29   50:aload_0         
	//   30   51:getfield        #73  <Field TagDefine tagDefine>
	//   31   54:invokevirtual   #102 <Method ETagType TagDefine.getType()>
	//   32   57:putfield        #104 <Field ETagType tagType>
		int j = abyte0[1] & 0xff;
	//   33   60:aload_1         
	//   34   61:iconst_1        
	//   35   62:baload          
	//   36   63:sipush          255
	//   37   66:iand            
	//   38   67:istore_3        
		int i;
		if(j == 255)
	//*  39   68:iload_3         
	//*  40   69:sipush          255
	//*  41   72:icmpne          101
		{
			i = 1 + 3;
	//   42   75:iconst_1        
	//   43   76:iconst_3        
	//   44   77:iadd            
	//   45   78:istore_2        
			j = FM_Bytes.bytesToInt(new byte[] {
				abyte0[2], abyte0[3]
			});
	//   46   79:iconst_2        
	//   47   80:newarray        byte[]
	//   48   82:dup             
	//   49   83:iconst_0        
	//   50   84:aload_1         
	//   51   85:iconst_2        
	//   52   86:baload          
	//   53   87:bastore         
	//   54   88:dup             
	//   55   89:iconst_1        
	//   56   90:aload_1         
	//   57   91:iconst_3        
	//   58   92:baload          
	//   59   93:bastore         
	//   60   94:invokestatic    #231 <Method int FM_Bytes.bytesToInt(byte[])>
	//   61   97:istore_3        
		} else
	//*  62   98:goto            105
		{
			i = 1 + 1;
	//   63  101:iconst_1        
	//   64  102:iconst_1        
	//   65  103:iadd            
	//   66  104:istore_2        
		}
		if(abyte0.length < i + j)
	//*  67  105:aload_1         
	//*  68  106:arraylength     
	//*  69  107:iload_2         
	//*  70  108:iload_3         
	//*  71  109:iadd            
	//*  72  110:icmpge          115
			return -1;
	//   73  113:iconst_m1       
	//   74  114:ireturn         
		if(tagDefine.getLength() != 0 && j > tagDefine.getLength())
	//*  75  115:aload_0         
	//*  76  116:getfield        #73  <Field TagDefine tagDefine>
	//*  77  119:invokevirtual   #115 <Method int TagDefine.getLength()>
	//*  78  122:ifeq            139
	//*  79  125:iload_3         
	//*  80  126:aload_0         
	//*  81  127:getfield        #73  <Field TagDefine tagDefine>
	//*  82  130:invokevirtual   #115 <Method int TagDefine.getLength()>
	//*  83  133:icmple          139
			return -2;
	//   84  136:bipush          -2
	//   85  138:ireturn         
		if(i + j > abyte0.length)
	//*  86  139:iload_2         
	//*  87  140:iload_3         
	//*  88  141:iadd            
	//*  89  142:aload_1         
	//*  90  143:arraylength     
	//*  91  144:icmple          227
		{
			if(log != null)
	//*  92  147:aload_0         
	//*  93  148:getfield        #42  <Field FMLog log>
	//*  94  151:ifnull          224
				log.warn(logTag, (new StringBuilder("\u6570\u636E\u957F\u5EA6[")).append(abyte0.length).append("]\u6307\u5B9A\u5C0F\u4E8E\u6570\u636E\u6307\u5B9A\u957F\u5EA6[").append(String.format("%X", new Object[] {
					Integer.valueOf(j)
				})).append("] \u548C\u6570\u636E\u957F\u5EA6\u5B57\u8282\u5E8F\u5217\u7684\u957F\u5EA6[").append(abyte0.length).append("]\u548C").toString());
	//   95  154:aload_0         
	//   96  155:getfield        #42  <Field FMLog log>
	//   97  158:aload_0         
	//   98  159:getfield        #52  <Field String logTag>
	//   99  162:new             #233 <Class StringBuilder>
	//  100  165:dup             
	//  101  166:ldc1            #235 <String "\u6570\u636E\u957F\u5EA6[">
	//  102  168:invokespecial   #236 <Method void StringBuilder(String)>
	//  103  171:aload_1         
	//  104  172:arraylength     
	//  105  173:invokevirtual   #240 <Method StringBuilder StringBuilder.append(int)>
	//  106  176:ldc1            #242 <String "]\u6307\u5B9A\u5C0F\u4E8E\u6570\u636E\u6307\u5B9A\u957F\u5EA6[">
	//  107  178:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//  108  181:ldc1            #247 <String "%X">
	//  109  183:iconst_1        
	//  110  184:anewarray       Object[]
	//  111  187:dup             
	//  112  188:iconst_0        
	//  113  189:iload_3         
	//  114  190:invokestatic    #252 <Method Integer Integer.valueOf(int)>
	//  115  193:aastore         
	//  116  194:invokestatic    #91  <Method String String.format(String, Object[])>
	//  117  197:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//  118  200:ldc1            #254 <String "] \u548C\u6570\u636E\u957F\u5EA6\u5B57\u8282\u5E8F\u5217\u7684\u957F\u5EA6[">
	//  119  202:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//  120  205:aload_1         
	//  121  206:arraylength     
	//  122  207:invokevirtual   #240 <Method StringBuilder StringBuilder.append(int)>
	//  123  210:ldc2            #256 <String "]\u548C">
	//  124  213:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//  125  216:invokevirtual   #259 <Method String StringBuilder.toString()>
	//  126  219:invokeinterface #187 <Method void FMLog.warn(String, String)>
			return -3;
	//  127  224:bipush          -3
	//  128  226:ireturn         
		} else
		{
			tagValue = Arrays.copyOfRange(abyte0, i, i + j);
	//  129  227:aload_0         
	//  130  228:aload_1         
	//  131  229:iload_2         
	//  132  230:iload_2         
	//  133  231:iload_3         
	//  134  232:iadd            
	//  135  233:invokestatic    #265 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  136  236:putfield        #123 <Field byte[] tagValue>
			return -1;
	//  137  239:iconst_m1       
	//  138  240:ireturn         
		}
	}

	public byte[] getBytesVal()
		throws FMCommunicationMessageException
	{
		if(ETagType.B == tagType)
	//*   0    0:getstatic       #173 <Field ETagType ETagType.B>
	//*   1    3:aload_0         
	//*   2    4:getfield        #104 <Field ETagType tagType>
	//*   3    7:if_acmpne       15
			return tagValue;
	//    4   10:aload_0         
	//    5   11:getfield        #123 <Field byte[] tagValue>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public byte getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field byte id>
	//    2    4:ireturn         
	}

	public int getIntVal()
		throws FMCommunicationMessageException
	{
		if(ETagType.I == tagType)
	//*   0    0:getstatic       #109 <Field ETagType ETagType.I>
	//*   1    3:aload_0         
	//*   2    4:getfield        #104 <Field ETagType tagType>
	//*   3    7:if_acmpne       18
			return FM_Bytes.bytesToInt(tagValue);
	//    4   10:aload_0         
	//    5   11:getfield        #123 <Field byte[] tagValue>
	//    6   14:invokestatic    #231 <Method int FM_Bytes.bytesToInt(byte[])>
	//    7   17:ireturn         
		else
			return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
	}

	public byte[] getItemBytesVal(int i)
		throws FMCommunicationMessageException
	{
		if(i < 0 || i > children.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #57  <Field List children>
	//*   5    9:invokeinterface #272 <Method int List.size()>
	//*   6   14:icmple          45
			throw new FMCommunicationMessageException(String.format("\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u503C\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C", new Object[] {
				Byte.valueOf(id)
			}));
	//    7   17:new             #77  <Class FMCommunicationMessageException>
	//    8   20:dup             
	//    9   21:ldc2            #274 <String "\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u503C\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C">
	//   10   24:iconst_1        
	//   11   25:anewarray       Object[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:aload_0         
	//   15   31:getfield        #65  <Field byte id>
	//   16   34:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   17   37:aastore         
	//   18   38:invokestatic    #91  <Method String String.format(String, Object[])>
	//   19   41:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   20   44:athrow          
		else
			return ((ITag)children.get(i)).getBytesVal();
	//   21   45:aload_0         
	//   22   46:getfield        #57  <Field List children>
	//   23   49:iload_1         
	//   24   50:invokeinterface #278 <Method Object List.get(int)>
	//   25   55:checkcast       #6   <Class ITag>
	//   26   58:invokeinterface #280 <Method byte[] ITag.getBytesVal()>
	//   27   63:areturn         
	}

	public int getItemCount()
		throws FMCommunicationMessageException
	{
		return children.size();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List children>
	//    2    4:invokeinterface #272 <Method int List.size()>
	//    3    9:ireturn         
	}

	public int getItemIntVal(int i)
		throws FMCommunicationMessageException
	{
		if(i < 0 || i > children.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #57  <Field List children>
	//*   5    9:invokeinterface #272 <Method int List.size()>
	//*   6   14:icmple          45
			throw new FMCommunicationMessageException(String.format("\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u503C\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C", new Object[] {
				Byte.valueOf(id)
			}));
	//    7   17:new             #77  <Class FMCommunicationMessageException>
	//    8   20:dup             
	//    9   21:ldc2            #274 <String "\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u503C\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C">
	//   10   24:iconst_1        
	//   11   25:anewarray       Object[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:aload_0         
	//   15   31:getfield        #65  <Field byte id>
	//   16   34:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   17   37:aastore         
	//   18   38:invokestatic    #91  <Method String String.format(String, Object[])>
	//   19   41:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   20   44:athrow          
		else
			return ((ITag)children.get(i)).getIntVal();
	//   21   45:aload_0         
	//   22   46:getfield        #57  <Field List children>
	//   23   49:iload_1         
	//   24   50:invokeinterface #278 <Method Object List.get(int)>
	//   25   55:checkcast       #6   <Class ITag>
	//   26   58:invokeinterface #284 <Method int ITag.getIntVal()>
	//   27   63:ireturn         
	}

	public String getItemStringVal(int i)
		throws FMCommunicationMessageException
	{
		if(i < 0 || i > children.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #57  <Field List children>
	//*   5    9:invokeinterface #272 <Method int List.size()>
	//*   6   14:icmple          45
			throw new FMCommunicationMessageException(String.format("\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u503C\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C", new Object[] {
				Byte.valueOf(id)
			}));
	//    7   17:new             #77  <Class FMCommunicationMessageException>
	//    8   20:dup             
	//    9   21:ldc2            #274 <String "\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u503C\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C">
	//   10   24:iconst_1        
	//   11   25:anewarray       Object[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:aload_0         
	//   15   31:getfield        #65  <Field byte id>
	//   16   34:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   17   37:aastore         
	//   18   38:invokestatic    #91  <Method String String.format(String, Object[])>
	//   19   41:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   20   44:athrow          
		else
			return ((ITag)children.get(i)).getStringVal();
	//   21   45:aload_0         
	//   22   46:getfield        #57  <Field List children>
	//   23   49:iload_1         
	//   24   50:invokeinterface #278 <Method Object List.get(int)>
	//   25   55:checkcast       #6   <Class ITag>
	//   26   58:invokeinterface #289 <Method String ITag.getStringVal()>
	//   27   63:areturn         
	}

	public int getItemTagID(int i)
		throws FMCommunicationMessageException
	{
		if(i < 0 || i > children.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #57  <Field List children>
	//*   5    9:invokeinterface #272 <Method int List.size()>
	//*   6   14:icmple          45
			throw new FMCommunicationMessageException(String.format("\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u6807\u8BC6\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C", new Object[] {
				Byte.valueOf(id)
			}));
	//    7   17:new             #77  <Class FMCommunicationMessageException>
	//    8   20:dup             
	//    9   21:ldc2            #292 <String "\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u6807\u8BC6\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C">
	//   10   24:iconst_1        
	//   11   25:anewarray       Object[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:aload_0         
	//   15   31:getfield        #65  <Field byte id>
	//   16   34:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   17   37:aastore         
	//   18   38:invokestatic    #91  <Method String String.format(String, Object[])>
	//   19   41:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   20   44:athrow          
		else
			return ((int) (((ITag)children.get(i)).getId()));
	//   21   45:aload_0         
	//   22   46:getfield        #57  <Field List children>
	//   23   49:iload_1         
	//   24   50:invokeinterface #278 <Method Object List.get(int)>
	//   25   55:checkcast       #6   <Class ITag>
	//   26   58:invokeinterface #143 <Method byte ITag.getId()>
	//   27   63:ireturn         
	}

	public ITag getItemTagVal(int i)
		throws FMCommunicationMessageException
	{
		if(i < 0 || i > children.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #57  <Field List children>
	//*   5    9:invokeinterface #272 <Method int List.size()>
	//*   6   14:icmple          45
			throw new FMCommunicationMessageException(String.format("\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u503C\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C", new Object[] {
				Byte.valueOf(id)
			}));
	//    7   17:new             #77  <Class FMCommunicationMessageException>
	//    8   20:dup             
	//    9   21:ldc2            #274 <String "\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u503C\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C">
	//   10   24:iconst_1        
	//   11   25:anewarray       Object[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:aload_0         
	//   15   31:getfield        #65  <Field byte id>
	//   16   34:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   17   37:aastore         
	//   18   38:invokestatic    #91  <Method String String.format(String, Object[])>
	//   19   41:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   20   44:athrow          
		else
			return (ITag)children.get(i);
	//   21   45:aload_0         
	//   22   46:getfield        #57  <Field List children>
	//   23   49:iload_1         
	//   24   50:invokeinterface #278 <Method Object List.get(int)>
	//   25   55:checkcast       #6   <Class ITag>
	//   26   58:areturn         
	}

	public ITag[] getItemTags()
		throws FMCommunicationMessageException
	{
		return (ITag[])children.toArray(((Object []) (new ITag[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List children>
	//    2    4:iconst_0        
	//    3    5:anewarray       ITag[]
	//    4    8:invokeinterface #300 <Method Object[] List.toArray(Object[])>
	//    5   13:checkcast       #302 <Class ITag[]>
	//    6   16:areturn         
	}

	public ETagType getItemType(int i)
		throws FMCommunicationMessageException
	{
		if(i < 0 || i > children.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #57  <Field List children>
	//*   5    9:invokeinterface #272 <Method int List.size()>
	//*   6   14:icmple          45
			throw new FMCommunicationMessageException(String.format("\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u7C7B\u578B\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C", new Object[] {
				Byte.valueOf(id)
			}));
	//    7   17:new             #77  <Class FMCommunicationMessageException>
	//    8   20:dup             
	//    9   21:ldc2            #306 <String "\u83B7\u53D6\u590D\u6742Tag[%X]\u7684\u5305\u542BTag\u7684\u7C7B\u578B\u65F6\uFF0C\u4F20\u5165\u7684\u4E0B\u6807\u8D8A\u754C">
	//   10   24:iconst_1        
	//   11   25:anewarray       Object[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:aload_0         
	//   15   31:getfield        #65  <Field byte id>
	//   16   34:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   17   37:aastore         
	//   18   38:invokestatic    #91  <Method String String.format(String, Object[])>
	//   19   41:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   20   44:athrow          
		else
			return ((ITag)children.get(i)).getType();
	//   21   45:aload_0         
	//   22   46:getfield        #57  <Field List children>
	//   23   49:iload_1         
	//   24   50:invokeinterface #278 <Method Object List.get(int)>
	//   25   55:checkcast       #6   <Class ITag>
	//   26   58:invokeinterface #307 <Method ETagType ITag.getType()>
	//   27   63:areturn         
	}

	public String getStringVal()
		throws FMCommunicationMessageException
	{
		StringValueHandler stringvaluehandler = HandlerFactory.instance().getStringValueHandle(tagType);
	//    0    0:invokestatic    #158 <Method HandlerFactory HandlerFactory.instance()>
	//    1    3:aload_0         
	//    2    4:getfield        #104 <Field ETagType tagType>
	//    3    7:invokevirtual   #162 <Method StringValueHandler HandlerFactory.getStringValueHandle(ETagType)>
	//    4   10:astore_1        
		if(stringvaluehandler != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
			return stringvaluehandler.getTagvalue(tagValue);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #123 <Field byte[] tagValue>
	//   10   20:invokeinterface #311 <Method String StringValueHandler.getTagvalue(byte[])>
	//   11   25:areturn         
		else
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
	}

	public byte[] getTagValue()
	{
		return tagValue;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field byte[] tagValue>
	//    2    4:areturn         
	}

	public ETagType getType()
	{
		return tagType;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ETagType tagType>
	//    2    4:areturn         
	}

	public boolean isValid()
	{
		if(tagDefine == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field TagDefine tagDefine>
	//*   2    4:ifnonnull       49
		{
			if(log != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #42  <Field FMLog log>
	//*   5   11:ifnull          47
				log.warn(logTag, String.format("TAG[%X]\u9A8C\u8BC1\u65F6\uFF0C\u83B7\u53D6\u914D\u7F6E\u6587\u4EF6\u5B9A\u4E49\u5931\u8D25", new Object[] {
					Byte.valueOf(id)
				}));
	//    6   14:aload_0         
	//    7   15:getfield        #42  <Field FMLog log>
	//    8   18:aload_0         
	//    9   19:getfield        #52  <Field String logTag>
	//   10   22:ldc2            #314 <String "TAG[%X]\u9A8C\u8BC1\u65F6\uFF0C\u83B7\u53D6\u914D\u7F6E\u6587\u4EF6\u5B9A\u4E49\u5931\u8D25">
	//   11   25:iconst_1        
	//   12   26:anewarray       Object[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:aload_0         
	//   16   32:getfield        #65  <Field byte id>
	//   17   35:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   18   38:aastore         
	//   19   39:invokestatic    #91  <Method String String.format(String, Object[])>
	//   20   42:invokeinterface #187 <Method void FMLog.warn(String, String)>
			return false;
	//   21   47:iconst_0        
	//   22   48:ireturn         
		}
		if(tagDefine.getLength() != 0)
	//*  23   49:aload_0         
	//*  24   50:getfield        #73  <Field TagDefine tagDefine>
	//*  25   53:invokevirtual   #115 <Method int TagDefine.getLength()>
	//*  26   56:ifeq            174
		{
			if(tagValue == null || tagValue.length < 1)
	//*  27   59:aload_0         
	//*  28   60:getfield        #123 <Field byte[] tagValue>
	//*  29   63:ifnull          75
	//*  30   66:aload_0         
	//*  31   67:getfield        #123 <Field byte[] tagValue>
	//*  32   70:arraylength     
	//*  33   71:iconst_1        
	//*  34   72:icmpge          117
			{
				if(log != null)
	//*  35   75:aload_0         
	//*  36   76:getfield        #42  <Field FMLog log>
	//*  37   79:ifnull          115
					log.warn(logTag, String.format("TAG[%X]\u9A8C\u8BC1\u65F6\uFF0CTAG\u7684\u503C\u4E3A\u7A7A", new Object[] {
						Byte.valueOf(id)
					}));
	//   38   82:aload_0         
	//   39   83:getfield        #42  <Field FMLog log>
	//   40   86:aload_0         
	//   41   87:getfield        #52  <Field String logTag>
	//   42   90:ldc2            #316 <String "TAG[%X]\u9A8C\u8BC1\u65F6\uFF0CTAG\u7684\u503C\u4E3A\u7A7A">
	//   43   93:iconst_1        
	//   44   94:anewarray       Object[]
	//   45   97:dup             
	//   46   98:iconst_0        
	//   47   99:aload_0         
	//   48  100:getfield        #65  <Field byte id>
	//   49  103:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   50  106:aastore         
	//   51  107:invokestatic    #91  <Method String String.format(String, Object[])>
	//   52  110:invokeinterface #187 <Method void FMLog.warn(String, String)>
				return false;
	//   53  115:iconst_0        
	//   54  116:ireturn         
			}
			if(tagValue.length > tagDefine.getLength())
	//*  55  117:aload_0         
	//*  56  118:getfield        #123 <Field byte[] tagValue>
	//*  57  121:arraylength     
	//*  58  122:aload_0         
	//*  59  123:getfield        #73  <Field TagDefine tagDefine>
	//*  60  126:invokevirtual   #115 <Method int TagDefine.getLength()>
	//*  61  129:icmple          174
			{
				if(log != null)
	//*  62  132:aload_0         
	//*  63  133:getfield        #42  <Field FMLog log>
	//*  64  136:ifnull          172
					log.warn(logTag, String.format("TAG[%X]\u6570\u636E\u957F\u5EA6\u548C\u914D\u7F6E\u6587\u4EF6\u5B9A\u4E49\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u7B26", new Object[] {
						Byte.valueOf(id)
					}));
	//   65  139:aload_0         
	//   66  140:getfield        #42  <Field FMLog log>
	//   67  143:aload_0         
	//   68  144:getfield        #52  <Field String logTag>
	//   69  147:ldc2            #318 <String "TAG[%X]\u6570\u636E\u957F\u5EA6\u548C\u914D\u7F6E\u6587\u4EF6\u5B9A\u4E49\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u7B26">
	//   70  150:iconst_1        
	//   71  151:anewarray       Object[]
	//   72  154:dup             
	//   73  155:iconst_0        
	//   74  156:aload_0         
	//   75  157:getfield        #65  <Field byte id>
	//   76  160:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   77  163:aastore         
	//   78  164:invokestatic    #91  <Method String String.format(String, Object[])>
	//   79  167:invokeinterface #187 <Method void FMLog.warn(String, String)>
				return false;
	//   80  172:iconst_0        
	//   81  173:ireturn         
			}
		}
		return true;
	//   82  174:iconst_1        
	//   83  175:ireturn         
	}

	public int setValue(Tag tag, int i)
		throws FMCommunicationMessageException
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public byte[] toBytes()
		throws FMCommunicationMessageException
	{
		if(!isValid())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #225 <Method boolean isValid()>
	//*   2    4:ifne            75
		{
			if(log != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #42  <Field FMLog log>
	//*   5   11:ifnull          47
				log.warn(logTag, String.format("TAG[%X]\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\u65F6\uFF0C\u6709\u6548\u6027\u68C0\u67E5\u4E0D\u8FC7", new Object[] {
					Byte.valueOf(id)
				}));
	//    6   14:aload_0         
	//    7   15:getfield        #42  <Field FMLog log>
	//    8   18:aload_0         
	//    9   19:getfield        #52  <Field String logTag>
	//   10   22:ldc2            #323 <String "TAG[%X]\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\u65F6\uFF0C\u6709\u6548\u6027\u68C0\u67E5\u4E0D\u8FC7">
	//   11   25:iconst_1        
	//   12   26:anewarray       Object[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:aload_0         
	//   16   32:getfield        #65  <Field byte id>
	//   17   35:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   18   38:aastore         
	//   19   39:invokestatic    #91  <Method String String.format(String, Object[])>
	//   20   42:invokeinterface #187 <Method void FMLog.warn(String, String)>
			throw new FMCommunicationMessageException(String.format("TAG[%X]\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\u65F6\uFF0CTAG\u6570\u636E\u65E0\u6548", new Object[] {
				Byte.valueOf(id)
			}));
	//   21   47:new             #77  <Class FMCommunicationMessageException>
	//   22   50:dup             
	//   23   51:ldc2            #325 <String "TAG[%X]\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\u65F6\uFF0CTAG\u6570\u636E\u65E0\u6548">
	//   24   54:iconst_1        
	//   25   55:anewarray       Object[]
	//   26   58:dup             
	//   27   59:iconst_0        
	//   28   60:aload_0         
	//   29   61:getfield        #65  <Field byte id>
	//   30   64:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   31   67:aastore         
	//   32   68:invokestatic    #91  <Method String String.format(String, Object[])>
	//   33   71:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   34   74:athrow          
		}
		if(ETagType.C == tagType)
	//*  35   75:getstatic       #130 <Field ETagType ETagType.C>
	//*  36   78:aload_0         
	//*  37   79:getfield        #104 <Field ETagType tagType>
	//*  38   82:if_acmpne       146
		{
			tagValue = new byte[0];
	//   39   85:aload_0         
	//   40   86:iconst_0        
	//   41   87:newarray        byte[]
	//   42   89:putfield        #123 <Field byte[] tagValue>
			for(Iterator iterator = children.iterator(); iterator.hasNext();)
	//*  43   92:aload_0         
	//*  44   93:getfield        #57  <Field List children>
	//*  45   96:invokeinterface #203 <Method Iterator List.iterator()>
	//*  46  101:astore          4
	//*  47  103:goto            136
			{
				ITag itag = (ITag)iterator.next();
	//   48  106:aload           4
	//   49  108:invokeinterface #209 <Method Object Iterator.next()>
	//   50  113:checkcast       #6   <Class ITag>
	//   51  116:astore          5
				tagValue = FM_Bytes.join(tagValue, itag.toBytes());
	//   52  118:aload_0         
	//   53  119:aload_0         
	//   54  120:getfield        #123 <Field byte[] tagValue>
	//   55  123:aload           5
	//   56  125:invokeinterface #327 <Method byte[] ITag.toBytes()>
	//   57  130:invokestatic    #331 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   58  133:putfield        #123 <Field byte[] tagValue>
			}

	//   59  136:aload           4
	//   60  138:invokeinterface #228 <Method boolean Iterator.hasNext()>
	//   61  143:ifne            106
		}
		if(tagValue == null)
	//*  62  146:aload_0         
	//*  63  147:getfield        #123 <Field byte[] tagValue>
	//*  64  150:ifnonnull       221
		{
			if(log != null)
	//*  65  153:aload_0         
	//*  66  154:getfield        #42  <Field FMLog log>
	//*  67  157:ifnull          193
				log.warn(logTag, String.format("TAG[%X]\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\u65F6,TAG\u6570\u636E\u4E3A\u7A7A", new Object[] {
					Byte.valueOf(id)
				}));
	//   68  160:aload_0         
	//   69  161:getfield        #42  <Field FMLog log>
	//   70  164:aload_0         
	//   71  165:getfield        #52  <Field String logTag>
	//   72  168:ldc2            #333 <String "TAG[%X]\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\u65F6,TAG\u6570\u636E\u4E3A\u7A7A">
	//   73  171:iconst_1        
	//   74  172:anewarray       Object[]
	//   75  175:dup             
	//   76  176:iconst_0        
	//   77  177:aload_0         
	//   78  178:getfield        #65  <Field byte id>
	//   79  181:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   80  184:aastore         
	//   81  185:invokestatic    #91  <Method String String.format(String, Object[])>
	//   82  188:invokeinterface #187 <Method void FMLog.warn(String, String)>
			throw new FMCommunicationMessageException(String.format("TAG[%X]\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\u65F6,TAG\u6570\u636E\u4E3A\u7A7A", new Object[] {
				Byte.valueOf(id)
			}));
	//   83  193:new             #77  <Class FMCommunicationMessageException>
	//   84  196:dup             
	//   85  197:ldc2            #333 <String "TAG[%X]\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\u65F6,TAG\u6570\u636E\u4E3A\u7A7A">
	//   86  200:iconst_1        
	//   87  201:anewarray       Object[]
	//   88  204:dup             
	//   89  205:iconst_0        
	//   90  206:aload_0         
	//   91  207:getfield        #65  <Field byte id>
	//   92  210:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   93  213:aastore         
	//   94  214:invokestatic    #91  <Method String String.format(String, Object[])>
	//   95  217:invokespecial   #94  <Method void FMCommunicationMessageException(String)>
	//   96  220:athrow          
		}
		int l = tagValue.length;
	//   97  221:aload_0         
	//   98  222:getfield        #123 <Field byte[] tagValue>
	//   99  225:arraylength     
	//  100  226:istore_3        
		byte abyte0[] = new byte[4];
	//  101  227:iconst_4        
	//  102  228:newarray        byte[]
	//  103  230:astore          4
		abyte0[0] = id;
	//  104  232:aload           4
	//  105  234:iconst_0        
	//  106  235:aload_0         
	//  107  236:getfield        #65  <Field byte id>
	//  108  239:bastore         
		int i;
		if(l >= 255)
	//* 109  240:iload_3         
	//* 110  241:sipush          255
	//* 111  244:icmplt          282
		{
			i = 1 + 3;
	//  112  247:iconst_1        
	//  113  248:iconst_3        
	//  114  249:iadd            
	//  115  250:istore_1        
			abyte0[1] = -1;
	//  116  251:aload           4
	//  117  253:iconst_1        
	//  118  254:iconst_m1       
	//  119  255:bastore         
			byte abyte1[] = FM_Bytes.intToBytes(l, 2);
	//  120  256:iload_3         
	//  121  257:iconst_2        
	//  122  258:invokestatic    #121 <Method byte[] FM_Bytes.intToBytes(int, int)>
	//  123  261:astore          5
			abyte0[2] = abyte1[0];
	//  124  263:aload           4
	//  125  265:iconst_2        
	//  126  266:aload           5
	//  127  268:iconst_0        
	//  128  269:baload          
	//  129  270:bastore         
			abyte0[3] = abyte1[1];
	//  130  271:aload           4
	//  131  273:iconst_3        
	//  132  274:aload           5
	//  133  276:iconst_1        
	//  134  277:baload          
	//  135  278:bastore         
		} else
	//* 136  279:goto            292
		{
			i = 1 + 1;
	//  137  282:iconst_1        
	//  138  283:iconst_1        
	//  139  284:iadd            
	//  140  285:istore_1        
			abyte0[1] = (byte)l;
	//  141  286:aload           4
	//  142  288:iconst_1        
	//  143  289:iload_3         
	//  144  290:int2byte        
	//  145  291:bastore         
		}
		byte abyte2[] = new byte[i + l];
	//  146  292:iload_1         
	//  147  293:iload_3         
	//  148  294:iadd            
	//  149  295:newarray        byte[]
	//  150  297:astore          5
		for(int j = 0; j < i; j++)
	//* 151  299:iconst_0        
	//* 152  300:istore_2        
	//* 153  301:goto            316
			abyte2[j] = abyte0[j];
	//  154  304:aload           5
	//  155  306:iload_2         
	//  156  307:aload           4
	//  157  309:iload_2         
	//  158  310:baload          
	//  159  311:bastore         

	//  160  312:iload_2         
	//  161  313:iconst_1        
	//  162  314:iadd            
	//  163  315:istore_2        
	//  164  316:iload_2         
	//  165  317:iload_1         
	//  166  318:icmplt          304
		for(int k = 0; k < l; k++)
	//* 167  321:iconst_0        
	//* 168  322:istore_2        
	//* 169  323:goto            342
			abyte2[i + k] = tagValue[k];
	//  170  326:aload           5
	//  171  328:iload_1         
	//  172  329:iload_2         
	//  173  330:iadd            
	//  174  331:aload_0         
	//  175  332:getfield        #123 <Field byte[] tagValue>
	//  176  335:iload_2         
	//  177  336:baload          
	//  178  337:bastore         

	//  179  338:iload_2         
	//  180  339:iconst_1        
	//  181  340:iadd            
	//  182  341:istore_2        
	//  183  342:iload_2         
	//  184  343:iload_3         
	//  185  344:icmplt          326
		return abyte2;
	//  186  347:aload           5
	//  187  349:areturn         
	}

	private List children;
	private byte id;
	private boolean isReadonly;
	private FMLog log;
	private final String logTag;
	private MessageHandler mMessageHandler;
	private TagDefine tagDefine;
	private ETagType tagType;
	private byte tagValue[];
}
