// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.core;

import cn.com.fmsh.communication.message.*;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.util.*;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.security.InvalidParameterException;
import java.util.*;

// Referenced classes of package cn.com.fmsh.communication.message.core:
//			MessageHandler, MessageDefine, MessageTagDefine

public class Message
	implements IMessage
{

	Message(MessageHandler messagehandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		log = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #34  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #38  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #40  <Field FMLog log>
		logTag = ((Class) (cn/com/fmsh/communication/message/core/Message)).getName();
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class Message>
	//    8   17:invokevirtual   #46  <Method String Class.getName()>
	//    9   20:putfield        #48  <Field String logTag>
		isReadOnly = false;
	//   10   23:aload_0         
	//   11   24:iconst_0        
	//   12   25:putfield        #50  <Field boolean isReadOnly>
		tags = ((List) (new ArrayList()));
	//   13   28:aload_0         
	//   14   29:new             #52  <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #53  <Method void ArrayList()>
	//   17   36:putfield        #55  <Field List tags>
		messageHandler = messagehandler;
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:putfield        #57  <Field MessageHandler messageHandler>
	//   21   44:return          
	}

	Message(MessageHandler messagehandler, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		log = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #34  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #38  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #40  <Field FMLog log>
		logTag = ((Class) (cn/com/fmsh/communication/message/core/Message)).getName();
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class Message>
	//    8   17:invokevirtual   #46  <Method String Class.getName()>
	//    9   20:putfield        #48  <Field String logTag>
		isReadOnly = false;
	//   10   23:aload_0         
	//   11   24:iconst_0        
	//   12   25:putfield        #50  <Field boolean isReadOnly>
		tags = ((List) (new ArrayList()));
	//   13   28:aload_0         
	//   14   29:new             #52  <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #53  <Method void ArrayList()>
	//   17   36:putfield        #55  <Field List tags>
		messageHandler = messagehandler;
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:putfield        #57  <Field MessageHandler messageHandler>
		code = i;
	//   21   44:aload_0         
	//   22   45:iload_2         
	//   23   46:putfield        #61  <Field int code>
	//   24   49:return          
	}

	private void messageTagsHandle(byte abyte0[])
		throws FMCommunicationMessageException
	{
		Object obj;
		for(abyte0 = ((byte []) (TLVParse.intance().parse(abyte0, 1).iterator())); ((Iterator) (abyte0)).hasNext(); tags.add(obj))
	//*   0    0:invokestatic    #71  <Method TLVParse TLVParse.intance()>
	//*   1    3:aload_1         
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #75  <Method List TLVParse.parse(byte[], int)>
	//*   4    8:invokeinterface #81  <Method Iterator List.iterator()>
	//*   5   13:astore_1        
	//*   6   14:goto            107
		{
			obj = ((Object) ((cn.com.fmsh.communication.message.TLVParse.TagEntry)((Iterator) (abyte0)).next()));
	//    7   17:aload_1         
	//    8   18:invokeinterface #87  <Method Object Iterator.next()>
	//    9   23:checkcast       #89  <Class cn.com.fmsh.communication.message.TLVParse$TagEntry>
	//   10   26:astore_2        
			obj = ((Object) (messageHandler.createTag(((cn.com.fmsh.communication.message.TLVParse.TagEntry) (obj)).getTag()[0], ((cn.com.fmsh.communication.message.TLVParse.TagEntry) (obj)).getData())));
	//   11   27:aload_0         
	//   12   28:getfield        #57  <Field MessageHandler messageHandler>
	//   13   31:aload_2         
	//   14   32:invokevirtual   #93  <Method byte[] cn.com.fmsh.communication.message.TLVParse$TagEntry.getTag()>
	//   15   35:iconst_0        
	//   16   36:baload          
	//   17   37:aload_2         
	//   18   38:invokevirtual   #96  <Method byte[] cn.com.fmsh.communication.message.TLVParse$TagEntry.getData()>
	//   19   41:invokevirtual   #102 <Method Tag MessageHandler.createTag(byte, byte[])>
	//   20   44:astore_2        
			if(!((ITag) (obj)).isValid())
	//*  21   45:aload_2         
	//*  22   46:invokeinterface #108 <Method boolean ITag.isValid()>
	//*  23   51:ifne            96
			{
				tags.clear();
	//   24   54:aload_0         
	//   25   55:getfield        #55  <Field List tags>
	//   26   58:invokeinterface #111 <Method void List.clear()>
				if(log != null)
	//*  27   63:aload_0         
	//*  28   64:getfield        #40  <Field FMLog log>
	//*  29   67:ifnull          86
					log.warn(((Class) (cn/com/fmsh/communication/message/core/Message)).getName(), "\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0CTag\u6807\u8BC6\u4E0D\u5408\u6CD5");
	//   30   70:aload_0         
	//   31   71:getfield        #40  <Field FMLog log>
	//   32   74:ldc1            #2   <Class Message>
	//   33   76:invokevirtual   #46  <Method String Class.getName()>
	//   34   79:ldc1            #113 <String "\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0CTag\u6807\u8BC6\u4E0D\u5408\u6CD5">
	//   35   81:invokeinterface #119 <Method void FMLog.warn(String, String)>
				throw new FMCommunicationMessageException("\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684TAG\u9A8C\u8BC1\u5931\u8D25");
	//   36   86:new             #65  <Class FMCommunicationMessageException>
	//   37   89:dup             
	//   38   90:ldc1            #121 <String "\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684TAG\u9A8C\u8BC1\u5931\u8D25">
	//   39   92:invokespecial   #124 <Method void FMCommunicationMessageException(String)>
	//   40   95:athrow          
			}
		}

	//   41   96:aload_0         
	//   42   97:getfield        #55  <Field List tags>
	//   43  100:aload_2         
	//   44  101:invokeinterface #128 <Method boolean List.add(Object)>
	//   45  106:pop             
	//   46  107:aload_1         
	//   47  108:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   48  113:ifne            17
	//   49  116:return          
	}

	public int addTag(ITag itag)
		throws FMCommunicationMessageException
	{
		if(isReadOnly)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean isReadOnly>
	//*   2    4:ifeq            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		if(itag == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       16
		{
			return -2;
	//    7   13:bipush          -2
	//    8   15:ireturn         
		} else
		{
			tags.add(((Object) (itag)));
	//    9   16:aload_0         
	//   10   17:getfield        #55  <Field List tags>
	//   11   20:aload_1         
	//   12   21:invokeinterface #128 <Method boolean List.add(Object)>
	//   13   26:pop             
			return 0;
	//   14   27:iconst_0        
	//   15   28:ireturn         
		}
	}

	public int clear()
	{
		tags.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List tags>
	//    2    4:invokeinterface #111 <Method void List.clear()>
		return 0;
	//    3    9:iconst_0        
	//    4   10:ireturn         
	}

	public int fromPackageBody(int i, byte abyte0[])
		throws FMCommunicationMessageException
	{
		isReadOnly = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #50  <Field boolean isReadOnly>
		code = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #61  <Field int code>
		messageDefine = messageHandler.getMessageDefine(code);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #57  <Field MessageHandler messageHandler>
	//    9   15:aload_0         
	//   10   16:getfield        #61  <Field int code>
	//   11   19:invokevirtual   #141 <Method MessageDefine MessageHandler.getMessageDefine(int)>
	//   12   22:putfield        #143 <Field MessageDefine messageDefine>
		if(messageDefine == null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #143 <Field MessageDefine messageDefine>
	//*  15   29:ifnonnull       42
		{
			throw new FMCommunicationMessageException("\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u6D88\u606F\u7F16\u7801\u4E0D\u5408\u6CD5");
	//   16   32:new             #65  <Class FMCommunicationMessageException>
	//   17   35:dup             
	//   18   36:ldc1            #145 <String "\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u6D88\u606F\u7F16\u7801\u4E0D\u5408\u6CD5">
	//   19   38:invokespecial   #124 <Method void FMCommunicationMessageException(String)>
	//   20   41:athrow          
		} else
		{
			messageTagsHandle(abyte0);
	//   21   42:aload_0         
	//   22   43:aload_2         
	//   23   44:invokespecial   #147 <Method void messageTagsHandle(byte[])>
			return 0;
	//   24   47:iconst_0        
	//   25   48:ireturn         
		}
	}

	public int fromPackageBody(byte abyte0[])
		throws FMCommunicationMessageException
	{
		isReadOnly = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #50  <Field boolean isReadOnly>
		if(abyte0 == null || abyte0.length < 2)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:iconst_2        
	//*   8   12:icmpge          25
			throw new InvalidParameterException("\u6839\u636E\u5B57\u8282\u5E8F\u5217\u6784\u9020\u6D88\u606F\u65F6\uFF0C\u4F20\u5165\u7684\u5B57\u8282\u5E8F\u5217\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//    9   15:new             #150 <Class InvalidParameterException>
	//   10   18:dup             
	//   11   19:ldc1            #152 <String "\u6839\u636E\u5B57\u8282\u5E8F\u5217\u6784\u9020\u6D88\u606F\u65F6\uFF0C\u4F20\u5165\u7684\u5B57\u8282\u5E8F\u5217\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   12   21:invokespecial   #153 <Method void InvalidParameterException(String)>
	//   13   24:athrow          
		code = Util4Java.String2Int(FM_CN.bcdBytesToString(Arrays.copyOf(abyte0, 2)), -1);
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:iconst_2        
	//   17   28:invokestatic    #159 <Method byte[] Arrays.copyOf(byte[], int)>
	//   18   31:invokestatic    #165 <Method String FM_CN.bcdBytesToString(byte[])>
	//   19   34:iconst_m1       
	//   20   35:invokestatic    #171 <Method int Util4Java.String2Int(String, int)>
	//   21   38:putfield        #61  <Field int code>
		if(code == -1)
	//*  22   41:aload_0         
	//*  23   42:getfield        #61  <Field int code>
	//*  24   45:iconst_m1       
	//*  25   46:icmpne          68
		{
			tags.clear();
	//   26   49:aload_0         
	//   27   50:getfield        #55  <Field List tags>
	//   28   53:invokeinterface #111 <Method void List.clear()>
			throw new InvalidParameterException("\u6839\u636E\u5B57\u8282\u5E8F\u5217\u6784\u9020\u6D88\u606F\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u7F16\u7801\u4E0D\u5408\u6CD5");
	//   29   58:new             #150 <Class InvalidParameterException>
	//   30   61:dup             
	//   31   62:ldc1            #173 <String "\u6839\u636E\u5B57\u8282\u5E8F\u5217\u6784\u9020\u6D88\u606F\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u7F16\u7801\u4E0D\u5408\u6CD5">
	//   32   64:invokespecial   #153 <Method void InvalidParameterException(String)>
	//   33   67:athrow          
		}
		messageDefine = messageHandler.getMessageDefine(code);
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:getfield        #57  <Field MessageHandler messageHandler>
	//   37   73:aload_0         
	//   38   74:getfield        #61  <Field int code>
	//   39   77:invokevirtual   #141 <Method MessageDefine MessageHandler.getMessageDefine(int)>
	//   40   80:putfield        #143 <Field MessageDefine messageDefine>
		if(messageDefine == null)
	//*  41   83:aload_0         
	//*  42   84:getfield        #143 <Field MessageDefine messageDefine>
	//*  43   87:ifnonnull       100
		{
			throw new FMCommunicationMessageException("\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u6D88\u606F\u7F16\u7801\u4E0D\u5408\u6CD5");
	//   44   90:new             #65  <Class FMCommunicationMessageException>
	//   45   93:dup             
	//   46   94:ldc1            #145 <String "\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u6D88\u606F\u7F16\u7801\u4E0D\u5408\u6CD5">
	//   47   96:invokespecial   #124 <Method void FMCommunicationMessageException(String)>
	//   48   99:athrow          
		} else
		{
			messageTagsHandle(Arrays.copyOfRange(abyte0, 2, abyte0.length));
	//   49  100:aload_0         
	//   50  101:aload_1         
	//   51  102:iconst_2        
	//   52  103:aload_1         
	//   53  104:arraylength     
	//   54  105:invokestatic    #177 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   55  108:invokespecial   #147 <Method void messageTagsHandle(byte[])>
			return 0;
	//   56  111:iconst_0        
	//   57  112:ireturn         
		}
	}

	public int fromPackageBodyAndRetCode(int i, byte abyte0[])
		throws FMCommunicationMessageException
	{
		isReadOnly = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #50  <Field boolean isReadOnly>
		code = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #61  <Field int code>
		if(abyte0 == null || abyte0.length < 2)
	//*   6   10:aload_2         
	//*   7   11:ifnull          20
	//*   8   14:aload_2         
	//*   9   15:arraylength     
	//*  10   16:iconst_2        
	//*  11   17:icmpge          30
			throw new InvalidParameterException("\u6839\u636E\u5B57\u8282\u5E8F\u5217\u6784\u9020\u6D88\u606F\u65F6\uFF0C\u4F20\u5165\u7684\u5B57\u8282\u5E8F\u5217\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   12   20:new             #150 <Class InvalidParameterException>
	//   13   23:dup             
	//   14   24:ldc1            #152 <String "\u6839\u636E\u5B57\u8282\u5E8F\u5217\u6784\u9020\u6D88\u606F\u65F6\uFF0C\u4F20\u5165\u7684\u5B57\u8282\u5E8F\u5217\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   15   26:invokespecial   #153 <Method void InvalidParameterException(String)>
	//   16   29:athrow          
		retCode = Arrays.copyOfRange(abyte0, 2, 2);
	//   17   30:aload_0         
	//   18   31:aload_2         
	//   19   32:iconst_2        
	//   20   33:iconst_2        
	//   21   34:invokestatic    #177 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   22   37:putfield        #180 <Field byte[] retCode>
		messageDefine = messageHandler.getMessageRetDefine(code);
	//   23   40:aload_0         
	//   24   41:aload_0         
	//   25   42:getfield        #57  <Field MessageHandler messageHandler>
	//   26   45:aload_0         
	//   27   46:getfield        #61  <Field int code>
	//   28   49:invokevirtual   #183 <Method MessageDefine MessageHandler.getMessageRetDefine(int)>
	//   29   52:putfield        #143 <Field MessageDefine messageDefine>
		if(messageDefine == null)
	//*  30   55:aload_0         
	//*  31   56:getfield        #143 <Field MessageDefine messageDefine>
	//*  32   59:ifnonnull       72
		{
			throw new FMCommunicationMessageException("\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u6D88\u606F\u7F16\u7801\u4E0D\u5408\u6CD5");
	//   33   62:new             #65  <Class FMCommunicationMessageException>
	//   34   65:dup             
	//   35   66:ldc1            #145 <String "\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u6D88\u606F\u7F16\u7801\u4E0D\u5408\u6CD5">
	//   36   68:invokespecial   #124 <Method void FMCommunicationMessageException(String)>
	//   37   71:athrow          
		} else
		{
			messageTagsHandle(Arrays.copyOfRange(abyte0, 2, abyte0.length));
	//   38   72:aload_0         
	//   39   73:aload_2         
	//   40   74:iconst_2        
	//   41   75:aload_2         
	//   42   76:arraylength     
	//   43   77:invokestatic    #177 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   44   80:invokespecial   #147 <Method void messageTagsHandle(byte[])>
			return 0;
	//   45   83:iconst_0        
	//   46   84:ireturn         
		}
	}

	public int fromPackageBodyAndRetCode(byte abyte0[])
		throws FMCommunicationMessageException
	{
		isReadOnly = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #50  <Field boolean isReadOnly>
		if(abyte0 == null || abyte0.length < 4)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:iconst_4        
	//*   8   12:icmpge          25
			throw new InvalidParameterException("\u6839\u636E\u5B57\u8282\u5E8F\u5217\u6784\u9020\u6D88\u606F\u65F6\uFF0C\u4F20\u5165\u7684\u5B57\u8282\u5E8F\u5217\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//    9   15:new             #150 <Class InvalidParameterException>
	//   10   18:dup             
	//   11   19:ldc1            #152 <String "\u6839\u636E\u5B57\u8282\u5E8F\u5217\u6784\u9020\u6D88\u606F\u65F6\uFF0C\u4F20\u5165\u7684\u5B57\u8282\u5E8F\u5217\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   12   21:invokespecial   #153 <Method void InvalidParameterException(String)>
	//   13   24:athrow          
		code = Util4Java.String2Int(FM_CN.bcdBytesToString(Arrays.copyOf(abyte0, 2)), -1);
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:iconst_2        
	//   17   28:invokestatic    #159 <Method byte[] Arrays.copyOf(byte[], int)>
	//   18   31:invokestatic    #165 <Method String FM_CN.bcdBytesToString(byte[])>
	//   19   34:iconst_m1       
	//   20   35:invokestatic    #171 <Method int Util4Java.String2Int(String, int)>
	//   21   38:putfield        #61  <Field int code>
		retCode = Arrays.copyOfRange(abyte0, 2, 4);
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:iconst_2        
	//   25   44:iconst_4        
	//   26   45:invokestatic    #177 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   27   48:putfield        #180 <Field byte[] retCode>
		messageDefine = messageHandler.getMessageRetDefine(code);
	//   28   51:aload_0         
	//   29   52:aload_0         
	//   30   53:getfield        #57  <Field MessageHandler messageHandler>
	//   31   56:aload_0         
	//   32   57:getfield        #61  <Field int code>
	//   33   60:invokevirtual   #183 <Method MessageDefine MessageHandler.getMessageRetDefine(int)>
	//   34   63:putfield        #143 <Field MessageDefine messageDefine>
		if(messageDefine == null)
	//*  35   66:aload_0         
	//*  36   67:getfield        #143 <Field MessageDefine messageDefine>
	//*  37   70:ifnonnull       83
		{
			throw new FMCommunicationMessageException("\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u6D88\u606F\u7F16\u7801\u4E0D\u5408\u6CD5");
	//   38   73:new             #65  <Class FMCommunicationMessageException>
	//   39   76:dup             
	//   40   77:ldc1            #145 <String "\u6839\u636E\u4E8C\u8FDB\u5236\u5E8F\u5217\u6784\u9020Message\u65F6\uFF0C\u89E3\u6790\u83B7\u53D6\u5230\u7684\u6D88\u606F\u7F16\u7801\u4E0D\u5408\u6CD5">
	//   41   79:invokespecial   #124 <Method void FMCommunicationMessageException(String)>
	//   42   82:athrow          
		} else
		{
			messageTagsHandle(Arrays.copyOfRange(abyte0, 4, abyte0.length));
	//   43   83:aload_0         
	//   44   84:aload_1         
	//   45   85:iconst_4        
	//   46   86:aload_1         
	//   47   87:arraylength     
	//   48   88:invokestatic    #177 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   49   91:invokespecial   #147 <Method void messageTagsHandle(byte[])>
			return 0;
	//   50   94:iconst_0        
	//   51   95:ireturn         
		}
	}

	public int getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int code>
	//    2    4:ireturn         
	}

	public byte[] getRetCode()
	{
		return retCode;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field byte[] retCode>
	//    2    4:areturn         
	}

	public ITag getTag4Id(int i)
		throws FMCommunicationMessageException
	{
		for(Iterator iterator = tags.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field List tags>
	//*   2    4:invokeinterface #81  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:goto            39
		{
			ITag itag = (ITag)iterator.next();
	//    5   13:aload_2         
	//    6   14:invokeinterface #87  <Method Object Iterator.next()>
	//    7   19:checkcast       #104 <Class ITag>
	//    8   22:astore_3        
			if(itag != null && i == itag.getId())
	//*   9   23:aload_3         
	//*  10   24:ifnull          39
	//*  11   27:iload_1         
	//*  12   28:aload_3         
	//*  13   29:invokeinterface #191 <Method byte ITag.getId()>
	//*  14   34:icmpne          39
				return itag;
	//   15   37:aload_3         
	//   16   38:areturn         
		}

	//   17   39:aload_2         
	//   18   40:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   19   45:ifne            13
		return null;
	//   20   48:aconst_null     
	//   21   49:areturn         
	}

	public ITag getTag4Id(int i, int j)
		throws FMCommunicationMessageException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #52  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void ArrayList()>
	//    3    7:astore_3        
		for(Iterator iterator = tags.iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #55  <Field List tags>
	//*   6   12:invokeinterface #81  <Method Iterator List.iterator()>
	//*   7   17:astore          4
	//*   8   19:goto            59
		{
			ITag itag = (ITag)iterator.next();
	//    9   22:aload           4
	//   10   24:invokeinterface #87  <Method Object Iterator.next()>
	//   11   29:checkcast       #104 <Class ITag>
	//   12   32:astore          5
			if(itag != null && i == itag.getId())
	//*  13   34:aload           5
	//*  14   36:ifnull          59
	//*  15   39:iload_1         
	//*  16   40:aload           5
	//*  17   42:invokeinterface #191 <Method byte ITag.getId()>
	//*  18   47:icmpne          59
				((List) (arraylist)).add(((Object) (itag)));
	//   19   50:aload_3         
	//   20   51:aload           5
	//   21   53:invokeinterface #128 <Method boolean List.add(Object)>
	//   22   58:pop             
		}

	//   23   59:aload           4
	//   24   61:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   25   66:ifne            22
		if(j < 0 || j > ((List) (arraylist)).size())
	//*  26   69:iload_2         
	//*  27   70:iflt            83
	//*  28   73:iload_2         
	//*  29   74:aload_3         
	//*  30   75:invokeinterface #195 <Method int List.size()>
	//*  31   80:icmple          93
			throw new FMCommunicationMessageException("\u6839\u636ETag\u6807\u8BC6\u548C\u5E8F\u5217\u53F7\u83B7\u53D6tag\u65F6\uFF0C\u5E8F\u5217\u53F7\u8D8A\u754C");
	//   32   83:new             #65  <Class FMCommunicationMessageException>
	//   33   86:dup             
	//   34   87:ldc1            #197 <String "\u6839\u636ETag\u6807\u8BC6\u548C\u5E8F\u5217\u53F7\u83B7\u53D6tag\u65F6\uFF0C\u5E8F\u5217\u53F7\u8D8A\u754C">
	//   35   89:invokespecial   #124 <Method void FMCommunicationMessageException(String)>
	//   36   92:athrow          
		else
			return (ITag)((List) (arraylist)).get(j);
	//   37   93:aload_3         
	//   38   94:iload_2         
	//   39   95:invokeinterface #201 <Method Object List.get(int)>
	//   40  100:checkcast       #104 <Class ITag>
	//   41  103:areturn         
	}

	public ITag getTag4Index(int i)
		throws FMCommunicationMessageException
	{
		if(i < 0 || i > tags.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #55  <Field List tags>
	//*   5    9:invokeinterface #195 <Method int List.size()>
	//*   6   14:icmple          27
			throw new FMCommunicationMessageException("\u6839\u636E\u5E8F\u5217\u53F7\u83B7\u53D6tag\u65F6\uFF0C\u5E8F\u5217\u53F7\u8D8A\u754C");
	//    7   17:new             #65  <Class FMCommunicationMessageException>
	//    8   20:dup             
	//    9   21:ldc1            #204 <String "\u6839\u636E\u5E8F\u5217\u53F7\u83B7\u53D6tag\u65F6\uFF0C\u5E8F\u5217\u53F7\u8D8A\u754C">
	//   10   23:invokespecial   #124 <Method void FMCommunicationMessageException(String)>
	//   11   26:athrow          
		ITag itag = (ITag)tags.get(i);
	//   12   27:aload_0         
	//   13   28:getfield        #55  <Field List tags>
	//   14   31:iload_1         
	//   15   32:invokeinterface #201 <Method Object List.get(int)>
	//   16   37:checkcast       #104 <Class ITag>
	//   17   40:astore_2        
		if(itag != null)
	//*  18   41:aload_2         
	//*  19   42:ifnull          47
			return itag;
	//   20   45:aload_2         
	//   21   46:areturn         
		else
			return null;
	//   22   47:aconst_null     
	//   23   48:areturn         
	}

	public int getTagCount()
	{
		return tags.size();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List tags>
	//    2    4:invokeinterface #195 <Method int List.size()>
	//    3    9:ireturn         
	}

	public int getTagCount4Id(int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isValid()
	{
		if(messageDefine == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field MessageDefine messageDefine>
	//*   2    4:ifnonnull       47
			if(retCode == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #180 <Field byte[] retCode>
	//*   5   11:ifnonnull       32
				messageDefine = messageHandler.getMessageDefine(code);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #57  <Field MessageHandler messageHandler>
	//    9   19:aload_0         
	//   10   20:getfield        #61  <Field int code>
	//   11   23:invokevirtual   #141 <Method MessageDefine MessageHandler.getMessageDefine(int)>
	//   12   26:putfield        #143 <Field MessageDefine messageDefine>
			else
	//*  13   29:goto            47
				messageDefine = messageHandler.getMessageRetDefine(code);
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #57  <Field MessageHandler messageHandler>
	//   17   37:aload_0         
	//   18   38:getfield        #61  <Field int code>
	//   19   41:invokevirtual   #183 <Method MessageDefine MessageHandler.getMessageRetDefine(int)>
	//   20   44:putfield        #143 <Field MessageDefine messageDefine>
		if(messageDefine == null)
	//*  21   47:aload_0         
	//*  22   48:getfield        #143 <Field MessageDefine messageDefine>
	//*  23   51:ifnonnull       78
		{
			if(log != null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #40  <Field FMLog log>
	//*  26   58:ifnull          76
				log.warn(logTag, "\u6D88\u606F\u5408\u6CD5\u6027\u68C0\u67E5\u65F6\uFF0C\u83B7\u53D6\u6D88\u606F\u5B9A\u4E49\u4FE1\u606F\u5931\u8D25");
	//   27   61:aload_0         
	//   28   62:getfield        #40  <Field FMLog log>
	//   29   65:aload_0         
	//   30   66:getfield        #48  <Field String logTag>
	//   31   69:ldc1            #209 <String "\u6D88\u606F\u5408\u6CD5\u6027\u68C0\u67E5\u65F6\uFF0C\u83B7\u53D6\u6D88\u606F\u5B9A\u4E49\u4FE1\u606F\u5931\u8D25">
	//   32   71:invokeinterface #119 <Method void FMLog.warn(String, String)>
			return false;
	//   33   76:iconst_0        
	//   34   77:ireturn         
		}
		MessageTagDefine amessagetagdefine[] = messageDefine.getMessageTagDefines();
	//   35   78:aload_0         
	//   36   79:getfield        #143 <Field MessageDefine messageDefine>
	//   37   82:invokevirtual   #215 <Method MessageTagDefine[] MessageDefine.getMessageTagDefines()>
	//   38   85:astore          4
		int k = amessagetagdefine.length;
	//   39   87:aload           4
	//   40   89:arraylength     
	//   41   90:istore_3        
		for(int i = 0; i < k; i++)
	//*  42   91:iconst_0        
	//*  43   92:istore_1        
	//*  44   93:goto            234
		{
			MessageTagDefine messagetagdefine = amessagetagdefine[i];
	//   45   96:aload           4
	//   46   98:iload_1         
	//   47   99:aaload          
	//   48  100:astore          5
			if(messagetagdefine.getExist() == 1)
	//*  49  102:aload           5
	//*  50  104:invokevirtual   #220 <Method int MessageTagDefine.getExist()>
	//*  51  107:iconst_1        
	//*  52  108:icmpne          230
			{
				boolean flag = false;
	//   53  111:iconst_0        
	//   54  112:istore_2        
				for(Iterator iterator1 = tags.iterator(); iterator1.hasNext();)
	//*  55  113:aload_0         
	//*  56  114:getfield        #55  <Field List tags>
	//*  57  117:invokeinterface #81  <Method Iterator List.iterator()>
	//*  58  122:astore          6
	//*  59  124:goto            152
					if(((ITag)iterator1.next()).getId() == messagetagdefine.getTag())
	//*  60  127:aload           6
	//*  61  129:invokeinterface #87  <Method Object Iterator.next()>
	//*  62  134:checkcast       #104 <Class ITag>
	//*  63  137:invokeinterface #191 <Method byte ITag.getId()>
	//*  64  142:aload           5
	//*  65  144:invokevirtual   #222 <Method byte MessageTagDefine.getTag()>
	//*  66  147:icmpne          152
						flag = true;
	//   67  150:iconst_1        
	//   68  151:istore_2        

	//   69  152:aload           6
	//   70  154:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   71  159:ifne            127
				if(!flag)
	//*  72  162:iload_2         
	//*  73  163:ifne            230
				{
					if(log != null)
	//*  74  166:aload_0         
	//*  75  167:getfield        #40  <Field FMLog log>
	//*  76  170:ifnull          228
						log.warn(logTag, String.format((new StringBuilder("\u914D\u7F6E\u6587\u4EF6\u5B9A\u4E49Message[")).append(code).append("]\u5FC5\u987B\u5B58\u5728\u7684Tag[%X]\uFF0C\u4E0D\u5B58\u5728\uFF0C\u8BE5\u6D88\u606F\u4E0D\u5408\u6CD5").toString(), new Object[] {
							Byte.valueOf(messagetagdefine.getTag())
						}));
	//   77  173:aload_0         
	//   78  174:getfield        #40  <Field FMLog log>
	//   79  177:aload_0         
	//   80  178:getfield        #48  <Field String logTag>
	//   81  181:new             #224 <Class StringBuilder>
	//   82  184:dup             
	//   83  185:ldc1            #226 <String "\u914D\u7F6E\u6587\u4EF6\u5B9A\u4E49Message[">
	//   84  187:invokespecial   #227 <Method void StringBuilder(String)>
	//   85  190:aload_0         
	//   86  191:getfield        #61  <Field int code>
	//   87  194:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
	//   88  197:ldc1            #233 <String "]\u5FC5\u987B\u5B58\u5728\u7684Tag[%X]\uFF0C\u4E0D\u5B58\u5728\uFF0C\u8BE5\u6D88\u606F\u4E0D\u5408\u6CD5">
	//   89  199:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   90  202:invokevirtual   #239 <Method String StringBuilder.toString()>
	//   91  205:iconst_1        
	//   92  206:anewarray       Object[]
	//   93  209:dup             
	//   94  210:iconst_0        
	//   95  211:aload           5
	//   96  213:invokevirtual   #222 <Method byte MessageTagDefine.getTag()>
	//   97  216:invokestatic    #245 <Method Byte Byte.valueOf(byte)>
	//   98  219:aastore         
	//   99  220:invokestatic    #251 <Method String String.format(String, Object[])>
	//  100  223:invokeinterface #119 <Method void FMLog.warn(String, String)>
					return false;
	//  101  228:iconst_0        
	//  102  229:ireturn         
				}
			}
		}

	//  103  230:iload_1         
	//  104  231:iconst_1        
	//  105  232:iadd            
	//  106  233:istore_1        
	//  107  234:iload_1         
	//  108  235:iload_3         
	//  109  236:icmplt          96
		for(Iterator iterator = tags.iterator(); iterator.hasNext();)
	//* 110  239:aload_0         
	//* 111  240:getfield        #55  <Field List tags>
	//* 112  243:invokeinterface #81  <Method Iterator List.iterator()>
	//* 113  248:astore          5
	//* 114  250:goto            356
		{
			ITag itag = (ITag)iterator.next();
	//  115  253:aload           5
	//  116  255:invokeinterface #87  <Method Object Iterator.next()>
	//  117  260:checkcast       #104 <Class ITag>
	//  118  263:astore          6
			boolean flag1 = false;
	//  119  265:iconst_0        
	//  120  266:istore_2        
			int l = amessagetagdefine.length;
	//  121  267:aload           4
	//  122  269:arraylength     
	//  123  270:istore_3        
			for(int j = 0; j < l; j++)
	//* 124  271:iconst_0        
	//* 125  272:istore_1        
	//* 126  273:goto            303
			{
				MessageTagDefine messagetagdefine1 = amessagetagdefine[j];
	//  127  276:aload           4
	//  128  278:iload_1         
	//  129  279:aaload          
	//  130  280:astore          7
				if(itag.getId() == messagetagdefine1.getTag())
	//* 131  282:aload           6
	//* 132  284:invokeinterface #191 <Method byte ITag.getId()>
	//* 133  289:aload           7
	//* 134  291:invokevirtual   #222 <Method byte MessageTagDefine.getTag()>
	//* 135  294:icmpne          299
					flag1 = true;
	//  136  297:iconst_1        
	//  137  298:istore_2        
			}

	//  138  299:iload_1         
	//  139  300:iconst_1        
	//  140  301:iadd            
	//  141  302:istore_1        
	//  142  303:iload_1         
	//  143  304:iload_3         
	//  144  305:icmplt          276
			if(!flag1)
	//* 145  308:iload_2         
	//* 146  309:ifne            356
			{
				if(log != null)
	//* 147  312:aload_0         
	//* 148  313:getfield        #40  <Field FMLog log>
	//* 149  316:ifnull          354
					log.warn(logTag, String.format("\u6D88\u606F\u4E2D\u5DF2\u7ECF\u6709\u7684TAG[%X],\u5728\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49", new Object[] {
						Byte.valueOf(itag.getId())
					}));
	//  150  319:aload_0         
	//  151  320:getfield        #40  <Field FMLog log>
	//  152  323:aload_0         
	//  153  324:getfield        #48  <Field String logTag>
	//  154  327:ldc1            #253 <String "\u6D88\u606F\u4E2D\u5DF2\u7ECF\u6709\u7684TAG[%X],\u5728\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49">
	//  155  329:iconst_1        
	//  156  330:anewarray       Object[]
	//  157  333:dup             
	//  158  334:iconst_0        
	//  159  335:aload           6
	//  160  337:invokeinterface #191 <Method byte ITag.getId()>
	//  161  342:invokestatic    #245 <Method Byte Byte.valueOf(byte)>
	//  162  345:aastore         
	//  163  346:invokestatic    #251 <Method String String.format(String, Object[])>
	//  164  349:invokeinterface #119 <Method void FMLog.warn(String, String)>
				return false;
	//  165  354:iconst_0        
	//  166  355:ireturn         
			}
		}

	//  167  356:aload           5
	//  168  358:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//  169  363:ifne            253
		return true;
	//  170  366:iconst_1        
	//  171  367:ireturn         
	}

	public void setRetCode(byte abyte0[])
	{
		retCode = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #180 <Field byte[] retCode>
	//    3    5:return          
	}

	public int setVal(ITag itag, int i)
		throws FMCommunicationMessageException
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public byte[] toBytes()
		throws FMCommunicationMessageException
	{
		if(!isValid())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #258 <Method boolean isValid()>
	//*   2    4:ifne            18
			throw new FMCommunicationMessageException("\u6D88\u606F\u5BF9\u8C61\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\uFF0C\u6D88\u606F\u5BF9\u8C61\u65E0\u6548");
	//    3    7:new             #65  <Class FMCommunicationMessageException>
	//    4   10:dup             
	//    5   11:ldc2            #260 <String "\u6D88\u606F\u5BF9\u8C61\u8F6C\u6362\u6210\u5B57\u8282\u5E8F\u5217\uFF0C\u6D88\u606F\u5BF9\u8C61\u65E0\u6548">
	//    6   14:invokespecial   #124 <Method void FMCommunicationMessageException(String)>
	//    7   17:athrow          
		byte abyte0[] = FM_CN.intToBcdBytes(code, 2);
	//    8   18:aload_0         
	//    9   19:getfield        #61  <Field int code>
	//   10   22:iconst_2        
	//   11   23:invokestatic    #264 <Method byte[] FM_CN.intToBcdBytes(int, int)>
	//   12   26:astore_1        
		for(Iterator iterator = tags.iterator(); iterator.hasNext();)
	//*  13   27:aload_0         
	//*  14   28:getfield        #55  <Field List tags>
	//*  15   31:invokeinterface #81  <Method Iterator List.iterator()>
	//*  16   36:astore_2        
	//*  17   37:goto            65
		{
			byte abyte1[] = ((ITag)iterator.next()).toBytes();
	//   18   40:aload_2         
	//   19   41:invokeinterface #87  <Method Object Iterator.next()>
	//   20   46:checkcast       #104 <Class ITag>
	//   21   49:invokeinterface #266 <Method byte[] ITag.toBytes()>
	//   22   54:astore_3        
			if(abyte1 != null)
	//*  23   55:aload_3         
	//*  24   56:ifnull          65
				abyte0 = FM_Bytes.join(abyte0, abyte1);
	//   25   59:aload_1         
	//   26   60:aload_3         
	//   27   61:invokestatic    #272 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   28   64:astore_1        
		}

	//   29   65:aload_2         
	//   30   66:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   31   71:ifne            40
		return abyte0;
	//   32   74:aload_1         
	//   33   75:areturn         
	}

	private int code;
	private boolean isReadOnly;
	FMLog log;
	String logTag;
	private MessageDefine messageDefine;
	private MessageHandler messageHandler;
	private byte retCode[];
	private List tags;
}
