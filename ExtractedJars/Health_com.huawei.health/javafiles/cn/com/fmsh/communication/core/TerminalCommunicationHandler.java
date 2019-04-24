// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;

import cn.com.fmsh.communication.CommunicationNotify;
import cn.com.fmsh.communication.TerminalCommunication;
import cn.com.fmsh.communication.exception.CommunicationException;
import cn.com.fmsh.communication.exception.SocketException;
import cn.com.fmsh.communication.exception.session.CloseSessionException;
import cn.com.fmsh.communication.exception.session.OpenSessionException;
import cn.com.fmsh.exception.InvalidParameterException;
import cn.com.fmsh.util.*;
import cn.com.fmsh.util.algorithm.DES;
import cn.com.fmsh.util.algorithm.MAC;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import cn.com.fmsh.util.socket.DataLengthHandle;
import cn.com.fmsh.util.socket.ReceiveHandler;
import java.io.*;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package cn.com.fmsh.communication.core:
//			NFCosDataLengthHandler, MessageHead, ControlWord, CloseSessionRequest, 
//			LinkInfo, OpenSessionRequest, TerminalInfo, OpenSessionResponse

public class TerminalCommunicationHandler
	implements TerminalCommunication
{

	public TerminalCommunicationHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		exceptionTryCount = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #58  <Field int exceptionTryCount>
		interval4Heartbeat = 1000;
	//    5    9:aload_0         
	//    6   10:sipush          1000
	//    7   13:putfield        #60  <Field int interval4Heartbeat>
	//    8   16:aload_0         
	//    9   17:sipush          5000
	//   10   20:putfield        #62  <Field int socketTimeoutDefault>
		socket = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #64  <Field Socket socket>
		checkKeyStart = 4;
	//   14   28:aload_0         
	//   15   29:iconst_4        
	//   16   30:putfield        #66  <Field int checkKeyStart>
		checkKeyEnd = 12;
	//   17   33:aload_0         
	//   18   34:bipush          12
	//   19   36:putfield        #68  <Field int checkKeyEnd>
		isSendBusinessData = false;
	//   20   39:aload_0         
	//   21   40:iconst_0        
	//   22   41:putfield        #70  <Field boolean isSendBusinessData>
		isConnect = false;
	//   23   44:aload_0         
	//   24   45:iconst_0        
	//   25   46:putfield        #72  <Field boolean isConnect>
		openSessionFlag = false;
	//   26   49:aload_0         
	//   27   50:iconst_0        
	//   28   51:putfield        #74  <Field boolean openSessionFlag>
		timeout = 5000;
	//   29   54:aload_0         
	//   30   55:sipush          5000
	//   31   58:putfield        #76  <Field int timeout>
		fmLog = null;
	//   32   61:aload_0         
	//   33   62:aconst_null     
	//   34   63:putfield        #78  <Field FMLog fmLog>
		logTag = ((Class) (cn/com/fmsh/communication/core/TerminalCommunicationHandler)).getName();
	//   35   66:aload_0         
	//   36   67:ldc1            #2   <Class TerminalCommunicationHandler>
	//   37   69:invokevirtual   #84  <Method String Class.getName()>
	//   38   72:putfield        #86  <Field String logTag>
		lastCalledTime4Connect = 0L;
	//   39   75:aload_0         
	//   40   76:lconst_0        
	//   41   77:putfield        #88  <Field long lastCalledTime4Connect>
		lastCalledTime4Session = 0L;
	//   42   80:aload_0         
	//   43   81:lconst_0        
	//   44   82:putfield        #90  <Field long lastCalledTime4Session>
		dataLengthHandle = ((DataLengthHandle) (new NFCosDataLengthHandler()));
	//   45   85:aload_0         
	//   46   86:new             #92  <Class NFCosDataLengthHandler>
	//   47   89:dup             
	//   48   90:invokespecial   #93  <Method void NFCosDataLengthHandler()>
	//   49   93:putfield        #95  <Field DataLengthHandle dataLengthHandle>
		fmLog = LogFactory.getInstance().getLog();
	//   50   96:aload_0         
	//   51   97:invokestatic    #101 <Method LogFactory LogFactory.getInstance()>
	//   52  100:invokevirtual   #105 <Method FMLog LogFactory.getLog()>
	//   53  103:putfield        #78  <Field FMLog fmLog>
		sessionKey = new byte[16];
	//   54  106:aload_0         
	//   55  107:bipush          16
	//   56  109:newarray        byte[]
	//   57  111:putfield        #107 <Field byte[] sessionKey>
		sessionNumber = new byte[4];
	//   58  114:aload_0         
	//   59  115:iconst_4        
	//   60  116:newarray        byte[]
	//   61  118:putfield        #109 <Field byte[] sessionNumber>
		asynchronousMessages = new LinkedList();
	//   62  121:aload_0         
	//   63  122:new             #111 <Class LinkedList>
	//   64  125:dup             
	//   65  126:invokespecial   #112 <Method void LinkedList()>
	//   66  129:putfield        #114 <Field LinkedList asynchronousMessages>
		lock = ((Lock) (new ReentrantLock()));
	//   67  132:aload_0         
	//   68  133:new             #116 <Class ReentrantLock>
	//   69  136:dup             
	//   70  137:invokespecial   #117 <Method void ReentrantLock()>
	//   71  140:putfield        #119 <Field Lock lock>
	//   72  143:return          
	}

	private void generateNextSerialNumber()
	{
		if(serialNumber >= 0xffffffffL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field long serialNumber>
	//*   2    4:ldc2w           #124 <Long 0xffffffffL>
	//*   3    7:lcmp            
	//*   4    8:iflt            17
		{
			nextSendSerialNumber = 0L;
	//    5   11:aload_0         
	//    6   12:lconst_0        
	//    7   13:putfield        #127 <Field long nextSendSerialNumber>
			return;
	//    8   16:return          
		} else
		{
			nextSendSerialNumber = serialNumber + 1L;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #123 <Field long serialNumber>
	//   12   22:lconst_1        
	//   13   23:ladd            
	//   14   24:putfield        #127 <Field long nextSendSerialNumber>
			return;
	//   15   27:return          
		}
	}

	private byte[] responseHandle(byte abyte0[], boolean flag)
		throws CommunicationException, SocketException
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          71
		{
			if(fmLog != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #78  <Field FMLog fmLog>
	//*   8   14:ifnull          32
				fmLog.warn(logTag, "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//    9   17:aload_0         
	//   10   18:getfield        #78  <Field FMLog fmLog>
	//   11   21:aload_0         
	//   12   22:getfield        #86  <Field String logTag>
	//   13   25:ldc1            #135 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//   14   27:invokeinterface #141 <Method void FMLog.warn(String, String)>
			abyte0 = ((byte []) (new CommunicationException("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25")));
	//   15   32:new             #131 <Class CommunicationException>
	//   16   35:dup             
	//   17   36:ldc1            #135 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//   18   38:invokespecial   #144 <Method void CommunicationException(String)>
	//   19   41:astore_1        
			((CommunicationException) (abyte0)).setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.NO_REPONSE);
	//   20   42:aload_1         
	//   21   43:getstatic       #150 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.NO_REPONSE>
	//   22   46:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			if(flag)
	//*  23   49:iload_2         
	//*  24   50:ifeq            69
			{
				communicationNotify.exceptionNotify(((cn.com.fmsh.FM_Exception) (abyte0)), ((Object) (abyte0)).getClass());
	//   25   53:aload_0         
	//   26   54:getfield        #156 <Field CommunicationNotify communicationNotify>
	//   27   57:aload_1         
	//   28   58:aload_1         
	//   29   59:invokevirtual   #160 <Method Class Object.getClass()>
	//   30   62:invokeinterface #166 <Method void CommunicationNotify.exceptionNotify(cn.com.fmsh.FM_Exception, Class)>
				return null;
	//   31   67:aconst_null     
	//   32   68:areturn         
			} else
			{
				throw abyte0;
	//   33   69:aload_1         
	//   34   70:athrow          
			}
		}
		if(abyte0.length < 12)
	//*  35   71:aload_1         
	//*  36   72:arraylength     
	//*  37   73:bipush          12
	//*  38   75:icmpge          146
		{
			if(fmLog != null)
	//*  39   78:aload_0         
	//*  40   79:getfield        #78  <Field FMLog fmLog>
	//*  41   82:ifnull          100
				fmLog.error(logTag, "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u6570\u636E\u683C\u5F0F\u9519\u8BEF\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//   42   85:aload_0         
	//   43   86:getfield        #78  <Field FMLog fmLog>
	//   44   89:aload_0         
	//   45   90:getfield        #86  <Field String logTag>
	//   46   93:ldc1            #168 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u6570\u636E\u683C\u5F0F\u9519\u8BEF\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//   47   95:invokeinterface #171 <Method void FMLog.error(String, String)>
			abyte0 = ((byte []) (new CommunicationException("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u6570\u636E\u683C\u5F0F\u9519\u8BEF\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25")));
	//   48  100:new             #131 <Class CommunicationException>
	//   49  103:dup             
	//   50  104:ldc1            #168 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u6570\u636E\u683C\u5F0F\u9519\u8BEF\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//   51  106:invokespecial   #144 <Method void CommunicationException(String)>
	//   52  109:astore_1        
			((CommunicationException) (abyte0)).setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_REPONSE);
	//   53  110:aload_1         
	//   54  111:getstatic       #174 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_REPONSE>
	//   55  114:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			((CommunicationException) (abyte0)).setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//   56  117:aload_1         
	//   57  118:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//   58  121:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			if(flag)
	//*  59  124:iload_2         
	//*  60  125:ifeq            144
			{
				communicationNotify.exceptionNotify(((cn.com.fmsh.FM_Exception) (abyte0)), ((Object) (abyte0)).getClass());
	//   61  128:aload_0         
	//   62  129:getfield        #156 <Field CommunicationNotify communicationNotify>
	//   63  132:aload_1         
	//   64  133:aload_1         
	//   65  134:invokevirtual   #160 <Method Class Object.getClass()>
	//   66  137:invokeinterface #166 <Method void CommunicationNotify.exceptionNotify(cn.com.fmsh.FM_Exception, Class)>
				return null;
	//   67  142:aconst_null     
	//   68  143:areturn         
			} else
			{
				throw abyte0;
	//   69  144:aload_1         
	//   70  145:athrow          
			}
		}
		MessageHead messagehead = new MessageHead();
	//   71  146:new             #186 <Class MessageHead>
	//   72  149:dup             
	//   73  150:invokespecial   #187 <Method void MessageHead()>
	//   74  153:astore          4
		messagehead.fromBytes(Arrays.copyOf(abyte0, 12));
	//   75  155:aload           4
	//   76  157:aload_1         
	//   77  158:bipush          12
	//   78  160:invokestatic    #193 <Method byte[] Arrays.copyOf(byte[], int)>
	//   79  163:invokevirtual   #197 <Method void MessageHead.fromBytes(byte[])>
		Object obj = ((Object) (messagehead.getControlWord()));
	//   80  166:aload           4
	//   81  168:invokevirtual   #201 <Method ControlWord MessageHead.getControlWord()>
	//   82  171:astore_3        
		if(((ControlWord) (obj)).getDirection() != ControlWord.Direction.RESPONSE)
	//*  83  172:aload_3         
	//*  84  173:invokevirtual   #207 <Method ControlWord$Direction ControlWord.getDirection()>
	//*  85  176:getstatic       #212 <Field ControlWord$Direction ControlWord$Direction.RESPONSE>
	//*  86  179:if_acmpeq       250
		{
			if(fmLog != null)
	//*  87  182:aload_0         
	//*  88  183:getfield        #78  <Field FMLog fmLog>
	//*  89  186:ifnull          204
				fmLog.warn(logTag, "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u4E0D\u662F\u54CD\u5E94\u6570\u636E\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//   90  189:aload_0         
	//   91  190:getfield        #78  <Field FMLog fmLog>
	//   92  193:aload_0         
	//   93  194:getfield        #86  <Field String logTag>
	//   94  197:ldc1            #214 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u4E0D\u662F\u54CD\u5E94\u6570\u636E\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//   95  199:invokeinterface #141 <Method void FMLog.warn(String, String)>
			abyte0 = ((byte []) (new CommunicationException("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u4E0D\u662F\u54CD\u5E94\u6570\u636E\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25")));
	//   96  204:new             #131 <Class CommunicationException>
	//   97  207:dup             
	//   98  208:ldc1            #214 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u4E0D\u662F\u54CD\u5E94\u6570\u636E\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//   99  210:invokespecial   #144 <Method void CommunicationException(String)>
	//  100  213:astore_1        
			((CommunicationException) (abyte0)).setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_DIRECTION);
	//  101  214:aload_1         
	//  102  215:getstatic       #217 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_DIRECTION>
	//  103  218:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			((CommunicationException) (abyte0)).setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  104  221:aload_1         
	//  105  222:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  106  225:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			if(flag)
	//* 107  228:iload_2         
	//* 108  229:ifeq            248
			{
				communicationNotify.exceptionNotify(((cn.com.fmsh.FM_Exception) (abyte0)), ((Object) (abyte0)).getClass());
	//  109  232:aload_0         
	//  110  233:getfield        #156 <Field CommunicationNotify communicationNotify>
	//  111  236:aload_1         
	//  112  237:aload_1         
	//  113  238:invokevirtual   #160 <Method Class Object.getClass()>
	//  114  241:invokeinterface #166 <Method void CommunicationNotify.exceptionNotify(cn.com.fmsh.FM_Exception, Class)>
				return null;
	//  115  246:aconst_null     
	//  116  247:areturn         
			} else
			{
				throw abyte0;
	//  117  248:aload_1         
	//  118  249:athrow          
			}
		}
		if(!Arrays.equals(sessionNumber, messagehead.getSessionNumber()))
	//* 119  250:aload_0         
	//* 120  251:getfield        #109 <Field byte[] sessionNumber>
	//* 121  254:aload           4
	//* 122  256:invokevirtual   #221 <Method byte[] MessageHead.getSessionNumber()>
	//* 123  259:invokestatic    #225 <Method boolean Arrays.equals(byte[], byte[])>
	//* 124  262:ifne            345
		{
			if(fmLog != null)
	//* 125  265:aload_0         
	//* 126  266:getfield        #78  <Field FMLog fmLog>
	//* 127  269:ifnull          287
				fmLog.warn(logTag, "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u4F1A\u8BDD\u7F16\u53F7\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//  128  272:aload_0         
	//  129  273:getfield        #78  <Field FMLog fmLog>
	//  130  276:aload_0         
	//  131  277:getfield        #86  <Field String logTag>
	//  132  280:ldc1            #227 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u4F1A\u8BDD\u7F16\u53F7\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//  133  282:invokeinterface #141 <Method void FMLog.warn(String, String)>
			openSessionFlag = false;
	//  134  287:aload_0         
	//  135  288:iconst_0        
	//  136  289:putfield        #74  <Field boolean openSessionFlag>
			CommunicationException communicationexception3 = new CommunicationException("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u4F1A\u8BDD\u7F16\u53F7\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//  137  292:new             #131 <Class CommunicationException>
	//  138  295:dup             
	//  139  296:ldc1            #227 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u4F1A\u8BDD\u7F16\u53F7\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//  140  298:invokespecial   #144 <Method void CommunicationException(String)>
	//  141  301:astore          5
			communicationexception3.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_SESSION);
	//  142  303:aload           5
	//  143  305:getstatic       #230 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_SESSION>
	//  144  308:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			communicationexception3.setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  145  311:aload           5
	//  146  313:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  147  316:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			if(flag)
	//* 148  319:iload_2         
	//* 149  320:ifeq            342
				communicationNotify.exceptionNotify(((cn.com.fmsh.FM_Exception) (communicationexception3)), ((Object) (communicationexception3)).getClass());
	//  150  323:aload_0         
	//  151  324:getfield        #156 <Field CommunicationNotify communicationNotify>
	//  152  327:aload           5
	//  153  329:aload           5
	//  154  331:invokevirtual   #160 <Method Class Object.getClass()>
	//  155  334:invokeinterface #166 <Method void CommunicationNotify.exceptionNotify(cn.com.fmsh.FM_Exception, Class)>
			else
	//* 156  339:goto            345
				throw communicationexception3;
	//  157  342:aload           5
	//  158  344:athrow          
		}
		if(nextSendSerialNumber != messagehead.getSerialNumber())
	//* 159  345:aload_0         
	//* 160  346:getfield        #127 <Field long nextSendSerialNumber>
	//* 161  349:aload           4
	//* 162  351:invokevirtual   #234 <Method long MessageHead.getSerialNumber()>
	//* 163  354:lcmp            
	//* 164  355:ifeq            438
		{
			if(fmLog != null)
	//* 165  358:aload_0         
	//* 166  359:getfield        #78  <Field FMLog fmLog>
	//* 167  362:ifnull          380
				fmLog.warn(logTag, "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u4F1A\u8BDD\u6D41\u6C34\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//  168  365:aload_0         
	//  169  366:getfield        #78  <Field FMLog fmLog>
	//  170  369:aload_0         
	//  171  370:getfield        #86  <Field String logTag>
	//  172  373:ldc1            #236 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u4F1A\u8BDD\u6D41\u6C34\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//  173  375:invokeinterface #141 <Method void FMLog.warn(String, String)>
			openSessionFlag = false;
	//  174  380:aload_0         
	//  175  381:iconst_0        
	//  176  382:putfield        #74  <Field boolean openSessionFlag>
			CommunicationException communicationexception4 = new CommunicationException("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u4F1A\u8BDD\u6D41\u6C34\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//  177  385:new             #131 <Class CommunicationException>
	//  178  388:dup             
	//  179  389:ldc1            #236 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u4F1A\u8BDD\u6D41\u6C34\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//  180  391:invokespecial   #144 <Method void CommunicationException(String)>
	//  181  394:astore          5
			communicationexception4.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_SESSION_NUMBER);
	//  182  396:aload           5
	//  183  398:getstatic       #239 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_SESSION_NUMBER>
	//  184  401:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			communicationexception4.setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  185  404:aload           5
	//  186  406:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  187  409:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			if(flag)
	//* 188  412:iload_2         
	//* 189  413:ifeq            435
				communicationNotify.exceptionNotify(((cn.com.fmsh.FM_Exception) (communicationexception4)), ((Object) (communicationexception4)).getClass());
	//  190  416:aload_0         
	//  191  417:getfield        #156 <Field CommunicationNotify communicationNotify>
	//  192  420:aload           5
	//  193  422:aload           5
	//  194  424:invokevirtual   #160 <Method Class Object.getClass()>
	//  195  427:invokeinterface #166 <Method void CommunicationNotify.exceptionNotify(cn.com.fmsh.FM_Exception, Class)>
			else
	//* 196  432:goto            446
				throw communicationexception4;
	//  197  435:aload           5
	//  198  437:athrow          
		} else
		{
			serialNumber = nextSendSerialNumber;
	//  199  438:aload_0         
	//  200  439:aload_0         
	//  201  440:getfield        #127 <Field long nextSendSerialNumber>
	//  202  443:putfield        #123 <Field long serialNumber>
		}
		if(((ControlWord) (obj)).getReponseCode() != 0 && ((ControlWord) (obj)).getReponseCode() != 14)
	//* 203  446:aload_3         
	//* 204  447:invokevirtual   #243 <Method byte ControlWord.getReponseCode()>
	//* 205  450:ifeq            530
	//* 206  453:aload_3         
	//* 207  454:invokevirtual   #243 <Method byte ControlWord.getReponseCode()>
	//* 208  457:bipush          14
	//* 209  459:icmpeq          530
		{
			abyte0 = ((byte []) (cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.instance(((int) (((ControlWord) (obj)).getReponseCode())))));
	//  210  462:aload_3         
	//  211  463:invokevirtual   #243 <Method byte ControlWord.getReponseCode()>
	//  212  466:invokestatic    #247 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.instance(int)>
	//  213  469:astore_1        
			if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_SESSION == abyte0 || cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_SESSION_NUMBER == abyte0)
	//* 214  470:getstatic       #230 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_SESSION>
	//* 215  473:aload_1         
	//* 216  474:if_acmpeq       484
	//* 217  477:getstatic       #239 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_SESSION_NUMBER>
	//* 218  480:aload_1         
	//* 219  481:if_acmpne       489
				openSessionFlag = false;
	//  220  484:aload_0         
	//  221  485:iconst_0        
	//  222  486:putfield        #74  <Field boolean openSessionFlag>
			obj = ((Object) (new CommunicationException((new StringBuilder("\u4E1A\u52A1\u5904\u7406\u5931\u8D25:")).append(((cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType) (abyte0)).getDescription()).toString())));
	//  223  489:new             #131 <Class CommunicationException>
	//  224  492:dup             
	//  225  493:new             #249 <Class StringBuilder>
	//  226  496:dup             
	//  227  497:ldc1            #251 <String "\u4E1A\u52A1\u5904\u7406\u5931\u8D25:">
	//  228  499:invokespecial   #252 <Method void StringBuilder(String)>
	//  229  502:aload_1         
	//  230  503:invokevirtual   #255 <Method String cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.getDescription()>
	//  231  506:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  232  509:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  233  512:invokespecial   #144 <Method void CommunicationException(String)>
	//  234  515:astore_3        
			((CommunicationException) (obj)).setExceptionType(((cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType) (abyte0)));
	//  235  516:aload_3         
	//  236  517:aload_1         
	//  237  518:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			((CommunicationException) (obj)).setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  238  521:aload_3         
	//  239  522:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  240  525:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			throw obj;
	//  241  528:aload_3         
	//  242  529:athrow          
		}
		byte abyte1[] = messagehead.getSecurityLevel();
	//  243  530:aload           4
	//  244  532:invokevirtual   #265 <Method byte[] MessageHead.getSecurityLevel()>
	//  245  535:astore          4
		if(abyte1[0] != MessageHead.SecurityLevel.CIPHER.getValue() && abyte1[1] != cn.com.fmsh.communication.core.MessageHead.CheckType.MAC.getValue())
	//* 246  537:aload           4
	//* 247  539:iconst_0        
	//* 248  540:baload          
	//* 249  541:getstatic       #271 <Field MessageHead$SecurityLevel MessageHead$SecurityLevel.CIPHER>
	//* 250  544:invokevirtual   #275 <Method int MessageHead$SecurityLevel.getValue()>
	//* 251  547:icmpeq          640
	//* 252  550:aload           4
	//* 253  552:iconst_1        
	//* 254  553:baload          
	//* 255  554:getstatic       #281 <Field MessageHead$CheckType cn.com.fmsh.communication.core.MessageHead$CheckType.MAC>
	//* 256  557:invokevirtual   #282 <Method int MessageHead$CheckType.getValue()>
	//* 257  560:icmpeq          640
		{
			if(fmLog != null)
	//* 258  563:aload_0         
	//* 259  564:getfield        #78  <Field FMLog fmLog>
	//* 260  567:ifnull          586
				fmLog.warn(logTag, "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u62A5\u6587\u5B89\u5168\u7EA7\u522B\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//  261  570:aload_0         
	//  262  571:getfield        #78  <Field FMLog fmLog>
	//  263  574:aload_0         
	//  264  575:getfield        #86  <Field String logTag>
	//  265  578:ldc2            #284 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u62A5\u6587\u5B89\u5168\u7EA7\u522B\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//  266  581:invokeinterface #141 <Method void FMLog.warn(String, String)>
			CommunicationException communicationexception = new CommunicationException("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u62A5\u6587\u5B89\u5168\u7EA7\u522B\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//  267  586:new             #131 <Class CommunicationException>
	//  268  589:dup             
	//  269  590:ldc2            #284 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6536\u5230\u65E0\u6548\u62A5\u6587\u5B89\u5168\u7EA7\u522B\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//  270  593:invokespecial   #144 <Method void CommunicationException(String)>
	//  271  596:astore          4
			communicationexception.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.CHECK_FAILED);
	//  272  598:aload           4
	//  273  600:getstatic       #287 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.CHECK_FAILED>
	//  274  603:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			communicationexception.setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  275  606:aload           4
	//  276  608:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  277  611:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			if(flag)
	//* 278  614:iload_2         
	//* 279  615:ifeq            637
				communicationNotify.exceptionNotify(((cn.com.fmsh.FM_Exception) (communicationexception)), ((Object) (communicationexception)).getClass());
	//  280  618:aload_0         
	//  281  619:getfield        #156 <Field CommunicationNotify communicationNotify>
	//  282  622:aload           4
	//  283  624:aload           4
	//  284  626:invokevirtual   #160 <Method Class Object.getClass()>
	//  285  629:invokeinterface #166 <Method void CommunicationNotify.exceptionNotify(cn.com.fmsh.FM_Exception, Class)>
			else
	//* 286  634:goto            640
				throw communicationexception;
	//  287  637:aload           4
	//  288  639:athrow          
		}
		communicationexception = ((CommunicationException) (Arrays.copyOfRange(abyte0, abyte0.length - 4, abyte0.length)));
	//  289  640:aload_1         
	//  290  641:aload_1         
	//  291  642:arraylength     
	//  292  643:iconst_4        
	//  293  644:isub            
	//  294  645:aload_1         
	//  295  646:arraylength     
	//  296  647:invokestatic    #291 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  297  650:astore          4
		byte abyte2[] = Arrays.copyOf(abyte0, abyte0.length - 4);
	//  298  652:aload_1         
	//  299  653:aload_1         
	//  300  654:arraylength     
	//  301  655:iconst_4        
	//  302  656:isub            
	//  303  657:invokestatic    #193 <Method byte[] Arrays.copyOf(byte[], int)>
	//  304  660:astore          5
		abyte2 = MAC.calculateMAC4DES(Arrays.copyOfRange(sessionKey, checkKeyStart, checkKeyEnd), new byte[8], abyte2);
	//  305  662:aload_0         
	//  306  663:getfield        #107 <Field byte[] sessionKey>
	//  307  666:aload_0         
	//  308  667:getfield        #66  <Field int checkKeyStart>
	//  309  670:aload_0         
	//  310  671:getfield        #68  <Field int checkKeyEnd>
	//  311  674:invokestatic    #291 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  312  677:bipush          8
	//  313  679:newarray        byte[]
	//  314  681:aload           5
	//  315  683:invokestatic    #297 <Method byte[] MAC.calculateMAC4DES(byte[], byte[], byte[])>
	//  316  686:astore          5
		if(!Arrays.equals(((byte []) (communicationexception)), Arrays.copyOf(abyte2, 4)))
	//* 317  688:aload           4
	//* 318  690:aload           5
	//* 319  692:iconst_4        
	//* 320  693:invokestatic    #193 <Method byte[] Arrays.copyOf(byte[], int)>
	//* 321  696:invokestatic    #225 <Method boolean Arrays.equals(byte[], byte[])>
	//* 322  699:ifne            817
		{
			if(fmLog != null)
	//* 323  702:aload_0         
	//* 324  703:getfield        #78  <Field FMLog fmLog>
	//* 325  706:ifnull          763
				fmLog.warn(logTag, (new StringBuilder("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0CMAC\u9A8C\u8BC1\u5931\u8D25\uFF0C\u5E73\u53F0MAC[")).append(FM_Bytes.bytesToHexString(((byte []) (communicationexception)))).append("],\u7EC8\u7AEF\u8BA1\u7B97MAC[").append(FM_Bytes.bytesToHexString(abyte2)).append("]").toString());
	//  326  709:aload_0         
	//  327  710:getfield        #78  <Field FMLog fmLog>
	//  328  713:aload_0         
	//  329  714:getfield        #86  <Field String logTag>
	//  330  717:new             #249 <Class StringBuilder>
	//  331  720:dup             
	//  332  721:ldc2            #299 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0CMAC\u9A8C\u8BC1\u5931\u8D25\uFF0C\u5E73\u53F0MAC[">
	//  333  724:invokespecial   #252 <Method void StringBuilder(String)>
	//  334  727:aload           4
	//  335  729:invokestatic    #305 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  336  732:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  337  735:ldc2            #307 <String "],\u7EC8\u7AEF\u8BA1\u7B97MAC[">
	//  338  738:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  339  741:aload           5
	//  340  743:invokestatic    #305 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  341  746:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  342  749:ldc2            #309 <String "]">
	//  343  752:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  344  755:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  345  758:invokeinterface #141 <Method void FMLog.warn(String, String)>
			CommunicationException communicationexception1 = new CommunicationException("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0CMAC\u9A8C\u8BC1\u5931\u8D25\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//  346  763:new             #131 <Class CommunicationException>
	//  347  766:dup             
	//  348  767:ldc2            #311 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0CMAC\u9A8C\u8BC1\u5931\u8D25\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//  349  770:invokespecial   #144 <Method void CommunicationException(String)>
	//  350  773:astore          4
			communicationexception1.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.CHECK_FAILED);
	//  351  775:aload           4
	//  352  777:getstatic       #287 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.CHECK_FAILED>
	//  353  780:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			communicationexception1.setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  354  783:aload           4
	//  355  785:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  356  788:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			if(flag)
	//* 357  791:iload_2         
	//* 358  792:ifeq            814
				communicationNotify.exceptionNotify(((cn.com.fmsh.FM_Exception) (communicationexception1)), ((Object) (communicationexception1)).getClass());
	//  359  795:aload_0         
	//  360  796:getfield        #156 <Field CommunicationNotify communicationNotify>
	//  361  799:aload           4
	//  362  801:aload           4
	//  363  803:invokevirtual   #160 <Method Class Object.getClass()>
	//  364  806:invokeinterface #166 <Method void CommunicationNotify.exceptionNotify(cn.com.fmsh.FM_Exception, Class)>
			else
	//* 365  811:goto            817
				throw communicationexception1;
	//  366  814:aload           4
	//  367  816:athrow          
		}
		communicationexception1 = ((CommunicationException) (Arrays.copyOfRange(abyte0, 12, abyte0.length - 4)));
	//  368  817:aload_1         
	//  369  818:bipush          12
	//  370  820:aload_1         
	//  371  821:arraylength     
	//  372  822:iconst_4        
	//  373  823:isub            
	//  374  824:invokestatic    #291 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  375  827:astore          4
		if(communicationexception1.length < 1 || abyte0.length % 8 != 0)
	//* 376  829:aload           4
	//* 377  831:arraylength     
	//* 378  832:iconst_1        
	//* 379  833:icmplt          844
	//* 380  836:aload_1         
	//* 381  837:arraylength     
	//* 382  838:bipush          8
	//* 383  840:irem            
	//* 384  841:ifeq            892
		{
			abyte0 = ((byte []) (new CommunicationException("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u62A5\u6587\u6570\u636E\u4E0D\u662FDES\u52A0\u5BC6\u540E\u7684\u6570\u636E\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25")));
	//  385  844:new             #131 <Class CommunicationException>
	//  386  847:dup             
	//  387  848:ldc2            #313 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u62A5\u6587\u6570\u636E\u4E0D\u662FDES\u52A0\u5BC6\u540E\u7684\u6570\u636E\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//  388  851:invokespecial   #144 <Method void CommunicationException(String)>
	//  389  854:astore_1        
			((CommunicationException) (abyte0)).setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.UNKNOW);
	//  390  855:aload_1         
	//  391  856:getstatic       #316 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.UNKNOW>
	//  392  859:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			((CommunicationException) (abyte0)).setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  393  862:aload_1         
	//  394  863:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  395  866:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			if(flag)
	//* 396  869:iload_2         
	//* 397  870:ifeq            890
				communicationNotify.exceptionNotify(((cn.com.fmsh.FM_Exception) (abyte0)), ((Object) (abyte0)).getClass());
	//  398  873:aload_0         
	//  399  874:getfield        #156 <Field CommunicationNotify communicationNotify>
	//  400  877:aload_1         
	//  401  878:aload_1         
	//  402  879:invokevirtual   #160 <Method Class Object.getClass()>
	//  403  882:invokeinterface #166 <Method void CommunicationNotify.exceptionNotify(cn.com.fmsh.FM_Exception, Class)>
			else
	//* 404  887:goto            892
				throw abyte0;
	//  405  890:aload_1         
	//  406  891:athrow          
		}
		abyte0 = DES.decrypt4des3(sessionKey, ((byte []) (communicationexception1)));
	//  407  892:aload_0         
	//  408  893:getfield        #107 <Field byte[] sessionKey>
	//  409  896:aload           4
	//  410  898:invokestatic    #322 <Method byte[] DES.decrypt4des3(byte[], byte[])>
	//  411  901:astore_1        
		if(!FM_Bytes.isPatch4Des(abyte0))
	//* 412  902:aload_1         
	//* 413  903:invokestatic    #326 <Method boolean FM_Bytes.isPatch4Des(byte[])>
	//* 414  906:ifne            986
		{
			if(fmLog != null)
	//* 415  909:aload_0         
	//* 416  910:getfield        #78  <Field FMLog fmLog>
	//* 417  913:ifnull          932
				fmLog.warn(logTag, "\u5E73\u53F0\u54CD\u5E94\u7684\u4E1A\u52A1\u6570\u636E\u672A\u8865\u4F4D");
	//  418  916:aload_0         
	//  419  917:getfield        #78  <Field FMLog fmLog>
	//  420  920:aload_0         
	//  421  921:getfield        #86  <Field String logTag>
	//  422  924:ldc2            #328 <String "\u5E73\u53F0\u54CD\u5E94\u7684\u4E1A\u52A1\u6570\u636E\u672A\u8865\u4F4D">
	//  423  927:invokeinterface #141 <Method void FMLog.warn(String, String)>
			CommunicationException communicationexception2 = new CommunicationException("\u5E73\u53F0\u54CD\u5E94\u7684\u4E1A\u52A1\u6570\u636E\u672A\u8865\u4F4D");
	//  424  932:new             #131 <Class CommunicationException>
	//  425  935:dup             
	//  426  936:ldc2            #328 <String "\u5E73\u53F0\u54CD\u5E94\u7684\u4E1A\u52A1\u6570\u636E\u672A\u8865\u4F4D">
	//  427  939:invokespecial   #144 <Method void CommunicationException(String)>
	//  428  942:astore          4
			communicationexception2.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.UNKNOW);
	//  429  944:aload           4
	//  430  946:getstatic       #316 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.UNKNOW>
	//  431  949:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			communicationexception2.setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  432  952:aload           4
	//  433  954:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  434  957:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			if(flag)
	//* 435  960:iload_2         
	//* 436  961:ifeq            983
				communicationNotify.exceptionNotify(((cn.com.fmsh.FM_Exception) (communicationexception2)), ((Object) (communicationexception2)).getClass());
	//  437  964:aload_0         
	//  438  965:getfield        #156 <Field CommunicationNotify communicationNotify>
	//  439  968:aload           4
	//  440  970:aload           4
	//  441  972:invokevirtual   #160 <Method Class Object.getClass()>
	//  442  975:invokeinterface #166 <Method void CommunicationNotify.exceptionNotify(cn.com.fmsh.FM_Exception, Class)>
			else
	//* 443  980:goto            986
				throw communicationexception2;
	//  444  983:aload           4
	//  445  985:athrow          
		}
		abyte0 = FM_Bytes.byteRemovePatch4Des(abyte0);
	//  446  986:aload_1         
	//  447  987:invokestatic    #332 <Method byte[] FM_Bytes.byteRemovePatch4Des(byte[])>
	//  448  990:astore_1        
		if(flag)
	//* 449  991:iload_2         
	//* 450  992:ifeq            1005
			communicationNotify.reponseMessageNotify(abyte0);
	//  451  995:aload_0         
	//  452  996:getfield        #156 <Field CommunicationNotify communicationNotify>
	//  453  999:aload_1         
	//  454 1000:invokeinterface #335 <Method void CommunicationNotify.reponseMessageNotify(byte[])>
		if(fmLog != null)
	//* 455 1005:aload_0         
	//* 456 1006:getfield        #78  <Field FMLog fmLog>
	//* 457 1009:ifnull          1045
			fmLog.debug(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u5B8C\u6210,message:")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  458 1012:aload_0         
	//  459 1013:getfield        #78  <Field FMLog fmLog>
	//  460 1016:aload_0         
	//  461 1017:getfield        #86  <Field String logTag>
	//  462 1020:new             #249 <Class StringBuilder>
	//  463 1023:dup             
	//  464 1024:ldc2            #337 <String "\u4E1A\u52A1\u5904\u7406\u5B8C\u6210,message:">
	//  465 1027:invokespecial   #252 <Method void StringBuilder(String)>
	//  466 1030:aload_1         
	//  467 1031:invokestatic    #305 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  468 1034:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  469 1037:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  470 1040:invokeinterface #340 <Method void FMLog.debug(String, String)>
		if(((ControlWord) (obj)).isHaveNews())
	//* 471 1045:aload_3         
	//* 472 1046:invokevirtual   #344 <Method boolean ControlWord.isHaveNews()>
	//* 473 1049:ifeq            1061
			communicationNotify.newsNotify();
	//  474 1052:aload_0         
	//  475 1053:getfield        #156 <Field CommunicationNotify communicationNotify>
	//  476 1056:invokeinterface #347 <Method void CommunicationNotify.newsNotify()>
		return abyte0;
	//  477 1061:aload_1         
	//  478 1062:areturn         
	}

	private byte[] send(byte abyte0[], byte abyte1[])
		throws IOException
	{
		if(in == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #353 <Field DataInputStream in>
	//*   2    4:ifnonnull       44
		{
			if(fmLog != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #78  <Field FMLog fmLog>
	//*   5   11:ifnull          33
				fmLog.warn(((Object)this).getClass().getName(), "Link is not established");
	//    6   14:aload_0         
	//    7   15:getfield        #78  <Field FMLog fmLog>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #160 <Method Class Object.getClass()>
	//   10   22:invokevirtual   #84  <Method String Class.getName()>
	//   11   25:ldc2            #355 <String "Link is not established">
	//   12   28:invokeinterface #141 <Method void FMLog.warn(String, String)>
			throw new IOException("Socket\u6570\u636E\u53D1\u9001\u65F6,\u94FE\u63A5\u672A\u5EFA\u7ACB");
	//   13   33:new             #351 <Class IOException>
	//   14   36:dup             
	//   15   37:ldc2            #357 <String "Socket\u6570\u636E\u53D1\u9001\u65F6,\u94FE\u63A5\u672A\u5EFA\u7ACB">
	//   16   40:invokespecial   #358 <Method void IOException(String)>
	//   17   43:athrow          
		}
		if(out == null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #360 <Field DataOutputStream out>
	//*  20   48:ifnonnull       88
		{
			if(fmLog != null)
	//*  21   51:aload_0         
	//*  22   52:getfield        #78  <Field FMLog fmLog>
	//*  23   55:ifnull          77
				fmLog.warn(((Object)this).getClass().getName(), "Link is not established");
	//   24   58:aload_0         
	//   25   59:getfield        #78  <Field FMLog fmLog>
	//   26   62:aload_0         
	//   27   63:invokevirtual   #160 <Method Class Object.getClass()>
	//   28   66:invokevirtual   #84  <Method String Class.getName()>
	//   29   69:ldc2            #355 <String "Link is not established">
	//   30   72:invokeinterface #141 <Method void FMLog.warn(String, String)>
			throw new IOException("Socket\u6570\u636E\u53D1\u9001\u65F6,\u94FE\u63A5\u672A\u5EFA\u7ACB");
	//   31   77:new             #351 <Class IOException>
	//   32   80:dup             
	//   33   81:ldc2            #357 <String "Socket\u6570\u636E\u53D1\u9001\u65F6,\u94FE\u63A5\u672A\u5EFA\u7ACB">
	//   34   84:invokespecial   #358 <Method void IOException(String)>
	//   35   87:athrow          
		}
		lock.lock();
	//   36   88:aload_0         
	//   37   89:getfield        #119 <Field Lock lock>
	//   38   92:invokeinterface #364 <Method void Lock.lock()>
		try
		{
			abyte0 = FM_Bytes.join(abyte0, abyte1);
	//   39   97:aload_1         
	//   40   98:aload_2         
	//   41   99:invokestatic    #367 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   42  102:astore_1        
			out.write(abyte0);
	//   43  103:aload_0         
	//   44  104:getfield        #360 <Field DataOutputStream out>
	//   45  107:aload_1         
	//   46  108:invokevirtual   #372 <Method void DataOutputStream.write(byte[])>
			if(fmLog != null)
	//*  47  111:aload_0         
	//*  48  112:getfield        #78  <Field FMLog fmLog>
	//*  49  115:ifnull          154
				fmLog.debug(((Object)this).getClass().getName(), (new StringBuilder("send data:")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   50  118:aload_0         
	//   51  119:getfield        #78  <Field FMLog fmLog>
	//   52  122:aload_0         
	//   53  123:invokevirtual   #160 <Method Class Object.getClass()>
	//   54  126:invokevirtual   #84  <Method String Class.getName()>
	//   55  129:new             #249 <Class StringBuilder>
	//   56  132:dup             
	//   57  133:ldc2            #374 <String "send data:">
	//   58  136:invokespecial   #252 <Method void StringBuilder(String)>
	//   59  139:aload_1         
	//   60  140:invokestatic    #305 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   61  143:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   62  146:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   63  149:invokeinterface #340 <Method void FMLog.debug(String, String)>
			out.flush();
	//   64  154:aload_0         
	//   65  155:getfield        #360 <Field DataOutputStream out>
	//   66  158:invokevirtual   #377 <Method void DataOutputStream.flush()>
			handler = ReceiveHandler.instance();
	//   67  161:aload_0         
	//   68  162:invokestatic    #382 <Method ReceiveHandler ReceiveHandler.instance()>
	//   69  165:putfield        #384 <Field ReceiveHandler handler>
			abyte0 = handler.receive(dataLengthHandle, timeout, in);
	//   70  168:aload_0         
	//   71  169:getfield        #384 <Field ReceiveHandler handler>
	//   72  172:aload_0         
	//   73  173:getfield        #95  <Field DataLengthHandle dataLengthHandle>
	//   74  176:aload_0         
	//   75  177:getfield        #76  <Field int timeout>
	//   76  180:aload_0         
	//   77  181:getfield        #353 <Field DataInputStream in>
	//   78  184:invokevirtual   #388 <Method byte[] ReceiveHandler.receive(DataLengthHandle, int, DataInputStream)>
	//   79  187:astore_1        
			break MISSING_BLOCK_LABEL_304;
	//   80  188:goto            304
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//   81  191:astore_1        
		if(fmLog != null)
	//*  82  192:aload_0         
	//*  83  193:getfield        #78  <Field FMLog fmLog>
	//*  84  196:ifnull          218
			fmLog.warn(((Object)this).getClass().getName(), "socket send data exception");
	//   85  199:aload_0         
	//   86  200:getfield        #78  <Field FMLog fmLog>
	//   87  203:aload_0         
	//   88  204:invokevirtual   #160 <Method Class Object.getClass()>
	//   89  207:invokevirtual   #84  <Method String Class.getName()>
	//   90  210:ldc2            #390 <String "socket send data exception">
	//   91  213:invokeinterface #141 <Method void FMLog.warn(String, String)>
		if(fmLog != null)
	//*  92  218:aload_0         
	//*  93  219:getfield        #78  <Field FMLog fmLog>
	//*  94  222:ifnull          264
		{
			fmLog.error(((Object)this).getClass().getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   95  225:aload_0         
	//   96  226:getfield        #78  <Field FMLog fmLog>
	//   97  229:aload_0         
	//   98  230:invokevirtual   #160 <Method Class Object.getClass()>
	//   99  233:invokevirtual   #84  <Method String Class.getName()>
	//  100  236:aload_1         
	//  101  237:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  102  240:invokeinterface #171 <Method void FMLog.error(String, String)>
			fmLog.debug(((Object)this).getClass().getName(), "\u5F02\u5E38\u629B\u51FA.....");
	//  103  245:aload_0         
	//  104  246:getfield        #78  <Field FMLog fmLog>
	//  105  249:aload_0         
	//  106  250:invokevirtual   #160 <Method Class Object.getClass()>
	//  107  253:invokevirtual   #84  <Method String Class.getName()>
	//  108  256:ldc2            #398 <String "\u5F02\u5E38\u629B\u51FA.....">
	//  109  259:invokeinterface #340 <Method void FMLog.debug(String, String)>
		}
		throw new IOException((new StringBuilder("Socket\u6570\u636E\u53D1\u9001\u65F6,\u51FA\u73B0\u5F02\u5E38")).append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  110  264:new             #351 <Class IOException>
	//  111  267:dup             
	//  112  268:new             #249 <Class StringBuilder>
	//  113  271:dup             
	//  114  272:ldc2            #400 <String "Socket\u6570\u636E\u53D1\u9001\u65F6,\u51FA\u73B0\u5F02\u5E38">
	//  115  275:invokespecial   #252 <Method void StringBuilder(String)>
	//  116  278:aload_1         
	//  117  279:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  118  282:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  119  285:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  120  288:invokespecial   #358 <Method void IOException(String)>
	//  121  291:athrow          
		abyte0;
	//  122  292:astore_1        
		lock.unlock();
	//  123  293:aload_0         
	//  124  294:getfield        #119 <Field Lock lock>
	//  125  297:invokeinterface #403 <Method void Lock.unlock()>
		throw abyte0;
	//  126  302:aload_1         
	//  127  303:athrow          
		lock.unlock();
	//  128  304:aload_0         
	//  129  305:getfield        #119 <Field Lock lock>
	//  130  308:invokeinterface #403 <Method void Lock.unlock()>
		if(fmLog != null)
	//* 131  313:aload_0         
	//* 132  314:getfield        #78  <Field FMLog fmLog>
	//* 133  317:ifnull          356
			fmLog.debug(((Object)this).getClass().getName(), (new StringBuilder("recieve data:")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//  134  320:aload_0         
	//  135  321:getfield        #78  <Field FMLog fmLog>
	//  136  324:aload_0         
	//  137  325:invokevirtual   #160 <Method Class Object.getClass()>
	//  138  328:invokevirtual   #84  <Method String Class.getName()>
	//  139  331:new             #249 <Class StringBuilder>
	//  140  334:dup             
	//  141  335:ldc2            #405 <String "recieve data:">
	//  142  338:invokespecial   #252 <Method void StringBuilder(String)>
	//  143  341:aload_1         
	//  144  342:invokestatic    #305 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  145  345:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  146  348:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  147  351:invokeinterface #340 <Method void FMLog.debug(String, String)>
		return abyte0;
	//  148  356:aload_1         
	//  149  357:areturn         
	}

	public void cancel()
	{
		lastRequestData = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #408 <Field byte[] lastRequestData>
		if(handler != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #384 <Field ReceiveHandler handler>
	//*   5    9:ifnull          19
			handler.cancel();
	//    6   12:aload_0         
	//    7   13:getfield        #384 <Field ReceiveHandler handler>
	//    8   16:invokevirtual   #410 <Method void ReceiveHandler.cancel()>
		isStop = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #412 <Field boolean isStop>
	//   12   24:return          
	}

	public boolean closeSession(CloseSessionRequest closesessionrequest)
		throws InvalidParameterException, SocketException, CommunicationException, CloseSessionException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #101 <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #105 <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #78  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #78  <Field FMLog fmLog>
	//*   9   21:ifnull          40
			fmLog.debug(logTag, "=======closeSession....");
	//   10   24:aload_0         
	//   11   25:getfield        #78  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #86  <Field String logTag>
	//   14   32:ldc2            #422 <String "=======closeSession....">
	//   15   35:invokeinterface #340 <Method void FMLog.debug(String, String)>
		lastRequestData = null;
	//   16   40:aload_0         
	//   17   41:aconst_null     
	//   18   42:putfield        #408 <Field byte[] lastRequestData>
		openSessionFlag = false;
	//   19   45:aload_0         
	//   20   46:iconst_0        
	//   21   47:putfield        #74  <Field boolean openSessionFlag>
		Object obj = ((Object) (new ControlWord()));
	//   22   50:new             #203 <Class ControlWord>
	//   23   53:dup             
	//   24   54:invokespecial   #423 <Method void ControlWord()>
	//   25   57:astore_2        
		((ControlWord) (obj)).setDirection(ControlWord.Direction.REQUEST);
	//   26   58:aload_2         
	//   27   59:getstatic       #426 <Field ControlWord$Direction ControlWord$Direction.REQUEST>
	//   28   62:invokevirtual   #429 <Method void ControlWord.setDirection(ControlWord$Direction)>
		((ControlWord) (obj)).setType(ControlWord.MessageType.CONTROL);
	//   29   65:aload_2         
	//   30   66:getstatic       #435 <Field ControlWord$MessageType ControlWord$MessageType.CONTROL>
	//   31   69:invokevirtual   #439 <Method void ControlWord.setType(ControlWord$MessageType)>
		((ControlWord) (obj)).setCommandType(ControlWord.CommandType.CLOSESESSION);
	//   32   72:aload_2         
	//   33   73:getstatic       #445 <Field ControlWord$CommandType ControlWord$CommandType.CLOSESESSION>
	//   34   76:invokevirtual   #449 <Method void ControlWord.setCommandType(ControlWord$CommandType)>
		generateNextSerialNumber();
	//   35   79:aload_0         
	//   36   80:invokespecial   #451 <Method void generateNextSerialNumber()>
		MessageHead messagehead = new MessageHead();
	//   37   83:new             #186 <Class MessageHead>
	//   38   86:dup             
	//   39   87:invokespecial   #187 <Method void MessageHead()>
	//   40   90:astore_3        
		messagehead.setProtocolVersion((byte)17);
	//   41   91:aload_3         
	//   42   92:bipush          17
	//   43   94:invokevirtual   #455 <Method void MessageHead.setProtocolVersion(byte)>
		messagehead.setSessionNumber(sessionNumber);
	//   44   97:aload_3         
	//   45   98:aload_0         
	//   46   99:getfield        #109 <Field byte[] sessionNumber>
	//   47  102:invokevirtual   #458 <Method void MessageHead.setSessionNumber(byte[])>
		messagehead.setSerialNumber(nextSendSerialNumber);
	//   48  105:aload_3         
	//   49  106:aload_0         
	//   50  107:getfield        #127 <Field long nextSendSerialNumber>
	//   51  110:invokevirtual   #462 <Method void MessageHead.setSerialNumber(long)>
		messagehead.setSecurityLevel(new byte[] {
			(byte)MessageHead.SecurityLevel.PLAIN.getValue(), (byte)cn.com.fmsh.communication.core.MessageHead.CheckType.MAC.getValue()
		});
	//   52  113:aload_3         
	//   53  114:iconst_2        
	//   54  115:newarray        byte[]
	//   55  117:dup             
	//   56  118:iconst_0        
	//   57  119:getstatic       #465 <Field MessageHead$SecurityLevel MessageHead$SecurityLevel.PLAIN>
	//   58  122:invokevirtual   #275 <Method int MessageHead$SecurityLevel.getValue()>
	//   59  125:int2byte        
	//   60  126:bastore         
	//   61  127:dup             
	//   62  128:iconst_1        
	//   63  129:getstatic       #281 <Field MessageHead$CheckType cn.com.fmsh.communication.core.MessageHead$CheckType.MAC>
	//   64  132:invokevirtual   #282 <Method int MessageHead$CheckType.getValue()>
	//   65  135:int2byte        
	//   66  136:bastore         
	//   67  137:invokevirtual   #468 <Method void MessageHead.setSecurityLevel(byte[])>
		messagehead.setControlWord(((ControlWord) (obj)));
	//   68  140:aload_3         
	//   69  141:aload_2         
	//   70  142:invokevirtual   #472 <Method void MessageHead.setControlWord(ControlWord)>
		obj = ((Object) (closesessionrequest));
	//   71  145:aload_1         
	//   72  146:astore_2        
		if(closesessionrequest == null)
	//*  73  147:aload_1         
	//*  74  148:ifnonnull       159
			obj = ((Object) (new CloseSessionRequest()));
	//   75  151:new             #474 <Class CloseSessionRequest>
	//   76  154:dup             
	//   77  155:invokespecial   #475 <Method void CloseSessionRequest()>
	//   78  158:astore_2        
		closesessionrequest = ((CloseSessionRequest) (FM_Bytes.join(messagehead.toBytes(), ((CloseSessionRequest) (obj)).toBytes())));
	//   79  159:aload_3         
	//   80  160:invokevirtual   #478 <Method byte[] MessageHead.toBytes()>
	//   81  163:aload_2         
	//   82  164:invokevirtual   #479 <Method byte[] CloseSessionRequest.toBytes()>
	//   83  167:invokestatic    #367 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   84  170:astore_1        
		closesessionrequest = ((CloseSessionRequest) (FM_Bytes.join(((byte []) (closesessionrequest)), Arrays.copyOf(MAC.calculateMAC4DES(Arrays.copyOfRange(sessionKey, checkKeyStart, checkKeyEnd), new byte[8], ((byte []) (closesessionrequest))), 4))));
	//   85  171:aload_1         
	//   86  172:aload_0         
	//   87  173:getfield        #107 <Field byte[] sessionKey>
	//   88  176:aload_0         
	//   89  177:getfield        #66  <Field int checkKeyStart>
	//   90  180:aload_0         
	//   91  181:getfield        #68  <Field int checkKeyEnd>
	//   92  184:invokestatic    #291 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   93  187:bipush          8
	//   94  189:newarray        byte[]
	//   95  191:aload_1         
	//   96  192:invokestatic    #297 <Method byte[] MAC.calculateMAC4DES(byte[], byte[], byte[])>
	//   97  195:iconst_4        
	//   98  196:invokestatic    #193 <Method byte[] Arrays.copyOf(byte[], int)>
	//   99  199:invokestatic    #367 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  100  202:astore_1        
		if(fmLog != null)
	//* 101  203:aload_0         
	//* 102  204:getfield        #78  <Field FMLog fmLog>
	//* 103  207:ifnull          243
			fmLog.debug(logTag, (new StringBuilder("close session resuest:")).append(FM_Bytes.bytesToHexString(((byte []) (closesessionrequest)))).toString());
	//  104  210:aload_0         
	//  105  211:getfield        #78  <Field FMLog fmLog>
	//  106  214:aload_0         
	//  107  215:getfield        #86  <Field String logTag>
	//  108  218:new             #249 <Class StringBuilder>
	//  109  221:dup             
	//  110  222:ldc2            #481 <String "close session resuest:">
	//  111  225:invokespecial   #252 <Method void StringBuilder(String)>
	//  112  228:aload_1         
	//  113  229:invokestatic    #305 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  114  232:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  115  235:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  116  238:invokeinterface #340 <Method void FMLog.debug(String, String)>
		try
		{
			closesessionrequest = ((CloseSessionRequest) (send(dataLengthHandle.initDataSize(closesessionrequest.length), ((byte []) (closesessionrequest)))));
	//  117  243:aload_0         
	//  118  244:aload_0         
	//  119  245:getfield        #95  <Field DataLengthHandle dataLengthHandle>
	//  120  248:aload_1         
	//  121  249:arraylength     
	//  122  250:invokeinterface #487 <Method byte[] DataLengthHandle.initDataSize(int)>
	//  123  255:aload_1         
	//  124  256:invokespecial   #489 <Method byte[] send(byte[], byte[])>
	//  125  259:astore_1        
		}
	//* 126  260:goto            299
		// Misplaced declaration of an exception variable
		catch(CloseSessionRequest closesessionrequest)
	//* 127  263:astore_1        
		{
			isConnect = false;
	//  128  264:aload_0         
	//  129  265:iconst_0        
	//  130  266:putfield        #72  <Field boolean isConnect>
			throw new SocketException(Util4Java.getExceptionInfo(((Exception) (closesessionrequest))));
	//  131  269:new             #133 <Class SocketException>
	//  132  272:dup             
	//  133  273:aload_1         
	//  134  274:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  135  277:invokespecial   #490 <Method void SocketException(String)>
	//  136  280:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(CloseSessionRequest closesessionrequest)
	//* 137  281:astore_1        
		{
			isConnect = false;
	//  138  282:aload_0         
	//  139  283:iconst_0        
	//  140  284:putfield        #72  <Field boolean isConnect>
			throw new SocketException(Util4Java.getExceptionInfo(((Exception) (closesessionrequest))));
	//  141  287:new             #133 <Class SocketException>
	//  142  290:dup             
	//  143  291:aload_1         
	//  144  292:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  145  295:invokespecial   #490 <Method void SocketException(String)>
	//  146  298:athrow          
		}
		if(closesessionrequest == null)
	//* 147  299:aload_1         
	//* 148  300:ifnonnull       337
		{
			if(fmLog != null)
	//* 149  303:aload_0         
	//* 150  304:getfield        #78  <Field FMLog fmLog>
	//* 151  307:ifnull          326
				fmLog.error(logTag, "\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u7B7E\u9000\u5931\u8D25");
	//  152  310:aload_0         
	//  153  311:getfield        #78  <Field FMLog fmLog>
	//  154  314:aload_0         
	//  155  315:getfield        #86  <Field String logTag>
	//  156  318:ldc2            #492 <String "\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u7B7E\u9000\u5931\u8D25">
	//  157  321:invokeinterface #171 <Method void FMLog.error(String, String)>
			throw new CommunicationException("\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u7B7E\u9000\u5931\u8D25");
	//  158  326:new             #131 <Class CommunicationException>
	//  159  329:dup             
	//  160  330:ldc2            #492 <String "\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u7B7E\u9000\u5931\u8D25">
	//  161  333:invokespecial   #144 <Method void CommunicationException(String)>
	//  162  336:athrow          
		}
		if(fmLog != null)
	//* 163  337:aload_0         
	//* 164  338:getfield        #78  <Field FMLog fmLog>
	//* 165  341:ifnull          377
			fmLog.debug(logTag, (new StringBuilder("\u7B7E\u9000\u54CD\u5E94\uFF1A")).append(FM_Bytes.bytesToHexString(((byte []) (closesessionrequest)))).toString());
	//  166  344:aload_0         
	//  167  345:getfield        #78  <Field FMLog fmLog>
	//  168  348:aload_0         
	//  169  349:getfield        #86  <Field String logTag>
	//  170  352:new             #249 <Class StringBuilder>
	//  171  355:dup             
	//  172  356:ldc2            #494 <String "\u7B7E\u9000\u54CD\u5E94\uFF1A">
	//  173  359:invokespecial   #252 <Method void StringBuilder(String)>
	//  174  362:aload_1         
	//  175  363:invokestatic    #305 <Method String FM_Bytes.bytesToHexString(byte[])>
	//  176  366:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  177  369:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  178  372:invokeinterface #340 <Method void FMLog.debug(String, String)>
		if(closesessionrequest.length < 12)
	//* 179  377:aload_1         
	//* 180  378:arraylength     
	//* 181  379:bipush          12
	//* 182  381:icmpge          434
		{
			if(fmLog != null)
	//* 183  384:aload_0         
	//* 184  385:getfield        #78  <Field FMLog fmLog>
	//* 185  388:ifnull          407
				fmLog.error(logTag, "\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u6570\u636E\u683C\u5F0F\u9519\u8BEF\uFF0C\u7B7E\u9000\u5931\u8D25");
	//  186  391:aload_0         
	//  187  392:getfield        #78  <Field FMLog fmLog>
	//  188  395:aload_0         
	//  189  396:getfield        #86  <Field String logTag>
	//  190  399:ldc2            #496 <String "\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u6570\u636E\u683C\u5F0F\u9519\u8BEF\uFF0C\u7B7E\u9000\u5931\u8D25">
	//  191  402:invokeinterface #171 <Method void FMLog.error(String, String)>
			closesessionrequest = ((CloseSessionRequest) (new CommunicationException("\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u6570\u636E\u683C\u5F0F\u9519\u8BEF\uFF0C\u7B7E\u9000\u5931\u8D25")));
	//  192  407:new             #131 <Class CommunicationException>
	//  193  410:dup             
	//  194  411:ldc2            #496 <String "\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u6570\u636E\u683C\u5F0F\u9519\u8BEF\uFF0C\u7B7E\u9000\u5931\u8D25">
	//  195  414:invokespecial   #144 <Method void CommunicationException(String)>
	//  196  417:astore_1        
			((CommunicationException) (closesessionrequest)).setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_FORMAT);
	//  197  418:aload_1         
	//  198  419:getstatic       #499 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_FORMAT>
	//  199  422:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			((CommunicationException) (closesessionrequest)).setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  200  425:aload_1         
	//  201  426:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  202  429:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			throw closesessionrequest;
	//  203  432:aload_1         
	//  204  433:athrow          
		}
		messagehead.fromBytes(Arrays.copyOf(((byte []) (closesessionrequest)), 12));
	//  205  434:aload_3         
	//  206  435:aload_1         
	//  207  436:bipush          12
	//  208  438:invokestatic    #193 <Method byte[] Arrays.copyOf(byte[], int)>
	//  209  441:invokevirtual   #197 <Method void MessageHead.fromBytes(byte[])>
		closesessionrequest = ((CloseSessionRequest) (messagehead.getControlWord()));
	//  210  444:aload_3         
	//  211  445:invokevirtual   #201 <Method ControlWord MessageHead.getControlWord()>
	//  212  448:astore_1        
		if(((ControlWord) (closesessionrequest)).getDirection() != ControlWord.Direction.RESPONSE)
	//* 213  449:aload_1         
	//* 214  450:invokevirtual   #207 <Method ControlWord$Direction ControlWord.getDirection()>
	//* 215  453:getstatic       #212 <Field ControlWord$Direction ControlWord$Direction.RESPONSE>
	//* 216  456:if_acmpeq       486
		{
			closesessionrequest = ((CloseSessionRequest) (new CommunicationException("\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u6536\u5230\u7684\u5E73\u53F0\u6570\u636E\u4E0D\u662F\u54CD\u5E94\u6570\u636E\uFF0C\u7B7E\u9000\u5931\u8D25")));
	//  217  459:new             #131 <Class CommunicationException>
	//  218  462:dup             
	//  219  463:ldc2            #501 <String "\u7EC8\u7AEF\u7B7E\u9000\u65F6\uFF0C\u6536\u5230\u7684\u5E73\u53F0\u6570\u636E\u4E0D\u662F\u54CD\u5E94\u6570\u636E\uFF0C\u7B7E\u9000\u5931\u8D25">
	//  220  466:invokespecial   #144 <Method void CommunicationException(String)>
	//  221  469:astore_1        
			((CommunicationException) (closesessionrequest)).setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_DIRECTION);
	//  222  470:aload_1         
	//  223  471:getstatic       #217 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_DIRECTION>
	//  224  474:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			((CommunicationException) (closesessionrequest)).setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  225  477:aload_1         
	//  226  478:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  227  481:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			throw closesessionrequest;
	//  228  484:aload_1         
	//  229  485:athrow          
		}
		if(((ControlWord) (closesessionrequest)).getReponseCode() != 0)
	//* 230  486:aload_1         
	//* 231  487:invokevirtual   #243 <Method byte ControlWord.getReponseCode()>
	//* 232  490:ifeq            543
		{
			closesessionrequest = ((CloseSessionRequest) (cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.instance(((int) (((ControlWord) (closesessionrequest)).getReponseCode())))));
	//  233  493:aload_1         
	//  234  494:invokevirtual   #243 <Method byte ControlWord.getReponseCode()>
	//  235  497:invokestatic    #247 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.instance(int)>
	//  236  500:astore_1        
			CommunicationException communicationexception = new CommunicationException((new StringBuilder("\u7B7E\u9000\u5931\u8D25:")).append(((cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType) (closesessionrequest)).getDescription()).toString());
	//  237  501:new             #131 <Class CommunicationException>
	//  238  504:dup             
	//  239  505:new             #249 <Class StringBuilder>
	//  240  508:dup             
	//  241  509:ldc2            #503 <String "\u7B7E\u9000\u5931\u8D25:">
	//  242  512:invokespecial   #252 <Method void StringBuilder(String)>
	//  243  515:aload_1         
	//  244  516:invokevirtual   #255 <Method String cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.getDescription()>
	//  245  519:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  246  522:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  247  525:invokespecial   #144 <Method void CommunicationException(String)>
	//  248  528:astore_2        
			communicationexception.setExceptionType(((cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType) (closesessionrequest)));
	//  249  529:aload_2         
	//  250  530:aload_1         
	//  251  531:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
			communicationexception.setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  252  534:aload_2         
	//  253  535:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  254  538:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
			throw communicationexception;
	//  255  541:aload_2         
	//  256  542:athrow          
		}
		if(((ControlWord) (closesessionrequest)).getCommandType() != ControlWord.CommandType.CLOSESESSION)
	//* 257  543:aload_1         
	//* 258  544:invokevirtual   #507 <Method ControlWord$CommandType ControlWord.getCommandType()>
	//* 259  547:getstatic       #445 <Field ControlWord$CommandType ControlWord$CommandType.CLOSESESSION>
	//* 260  550:if_acmpeq       564
			throw new CommunicationException("\u7EC8\u7AEF\u7B7E\u9000\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u7684\u5E73\u53F0\u6570\u636E\u4E0D\u662F\u7B7E\u9000\u5E94\u7B54");
	//  261  553:new             #131 <Class CommunicationException>
	//  262  556:dup             
	//  263  557:ldc2            #509 <String "\u7EC8\u7AEF\u7B7E\u9000\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u7684\u5E73\u53F0\u6570\u636E\u4E0D\u662F\u7B7E\u9000\u5E94\u7B54">
	//  264  560:invokespecial   #144 <Method void CommunicationException(String)>
	//  265  563:athrow          
		else
			return true;
	//  266  564:iconst_1        
	//  267  565:ireturn         
	}

	public boolean connect(LinkInfo linkinfo)
		throws InvalidParameterException, SocketException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #101 <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #105 <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #78  <Field FMLog fmLog>
		if(isConnect())
	//*   7   17:aload_0         
	//*   8   18:invokevirtual   #513 <Method boolean isConnect()>
	//*   9   21:ifeq            26
			return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
		if(linkinfo == null)
	//*  12   26:aload_1         
	//*  13   27:ifnonnull       64
		{
			if(fmLog != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #78  <Field FMLog fmLog>
	//*  16   34:ifnull          53
				fmLog.warn(logTag, "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u94FE\u63A5\u6570\u636E\u4E3A\u7A7A");
	//   17   37:aload_0         
	//   18   38:getfield        #78  <Field FMLog fmLog>
	//   19   41:aload_0         
	//   20   42:getfield        #86  <Field String logTag>
	//   21   45:ldc2            #515 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u94FE\u63A5\u6570\u636E\u4E3A\u7A7A">
	//   22   48:invokeinterface #141 <Method void FMLog.warn(String, String)>
			throw new InvalidParameterException("\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u94FE\u63A5\u6570\u636E\u4E3A\u7A7A");
	//   23   53:new             #416 <Class InvalidParameterException>
	//   24   56:dup             
	//   25   57:ldc2            #515 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u94FE\u63A5\u6570\u636E\u4E3A\u7A7A">
	//   26   60:invokespecial   #516 <Method void InvalidParameterException(String)>
	//   27   63:athrow          
		}
		if(linkinfo.getPort() < 1 || linkinfo.getPort() >= 65535)
	//*  28   64:aload_1         
	//*  29   65:invokevirtual   #521 <Method int LinkInfo.getPort()>
	//*  30   68:iconst_1        
	//*  31   69:icmplt          82
	//*  32   72:aload_1         
	//*  33   73:invokevirtual   #521 <Method int LinkInfo.getPort()>
	//*  34   76:ldc2            #522 <Int 65535>
	//*  35   79:icmplt          116
		{
			if(fmLog != null)
	//*  36   82:aload_0         
	//*  37   83:getfield        #78  <Field FMLog fmLog>
	//*  38   86:ifnull          105
				fmLog.error(logTag, "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u7AEF\u53E3\u53F7\u4E0D\u5408\u6CD5");
	//   39   89:aload_0         
	//   40   90:getfield        #78  <Field FMLog fmLog>
	//   41   93:aload_0         
	//   42   94:getfield        #86  <Field String logTag>
	//   43   97:ldc2            #524 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u7AEF\u53E3\u53F7\u4E0D\u5408\u6CD5">
	//   44  100:invokeinterface #171 <Method void FMLog.error(String, String)>
			throw new InvalidParameterException("\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u7AEF\u53E3\u53F7\u4E0D\u5408\u6CD5");
	//   45  105:new             #416 <Class InvalidParameterException>
	//   46  108:dup             
	//   47  109:ldc2            #524 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u7AEF\u53E3\u53F7\u4E0D\u5408\u6CD5">
	//   48  112:invokespecial   #516 <Method void InvalidParameterException(String)>
	//   49  115:athrow          
		}
		if(linkinfo.getAddress() == null || linkinfo.getAddress().length() < 1)
	//*  50  116:aload_1         
	//*  51  117:invokevirtual   #527 <Method String LinkInfo.getAddress()>
	//*  52  120:ifnull          134
	//*  53  123:aload_1         
	//*  54  124:invokevirtual   #527 <Method String LinkInfo.getAddress()>
	//*  55  127:invokevirtual   #532 <Method int String.length()>
	//*  56  130:iconst_1        
	//*  57  131:icmpge          168
		{
			if(fmLog != null)
	//*  58  134:aload_0         
	//*  59  135:getfield        #78  <Field FMLog fmLog>
	//*  60  138:ifnull          157
				fmLog.error(logTag, "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u5E73\u53F0\u5730\u5740\u4E3A\u7A7A");
	//   61  141:aload_0         
	//   62  142:getfield        #78  <Field FMLog fmLog>
	//   63  145:aload_0         
	//   64  146:getfield        #86  <Field String logTag>
	//   65  149:ldc2            #534 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u5E73\u53F0\u5730\u5740\u4E3A\u7A7A">
	//   66  152:invokeinterface #171 <Method void FMLog.error(String, String)>
			throw new InvalidParameterException("\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u5E73\u53F0\u5730\u5740\u4E3A\u7A7A");
	//   67  157:new             #416 <Class InvalidParameterException>
	//   68  160:dup             
	//   69  161:ldc2            #534 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u5E73\u53F0\u5730\u5740\u4E3A\u7A7A">
	//   70  164:invokespecial   #516 <Method void InvalidParameterException(String)>
	//   71  167:athrow          
		}
		if(linkinfo.getTimeout() != -1)
	//*  72  168:aload_1         
	//*  73  169:invokevirtual   #537 <Method int LinkInfo.getTimeout()>
	//*  74  172:iconst_m1       
	//*  75  173:icmpeq          184
			timeout = linkinfo.getTimeout();
	//   76  176:aload_0         
	//   77  177:aload_1         
	//   78  178:invokevirtual   #537 <Method int LinkInfo.getTimeout()>
	//   79  181:putfield        #76  <Field int timeout>
		lock.lock();
	//   80  184:aload_0         
	//   81  185:getfield        #119 <Field Lock lock>
	//   82  188:invokeinterface #364 <Method void Lock.lock()>
		socket = new Socket(linkinfo.getAddress(), linkinfo.getPort());
	//   83  193:aload_0         
	//   84  194:new             #539 <Class Socket>
	//   85  197:dup             
	//   86  198:aload_1         
	//   87  199:invokevirtual   #527 <Method String LinkInfo.getAddress()>
	//   88  202:aload_1         
	//   89  203:invokevirtual   #521 <Method int LinkInfo.getPort()>
	//   90  206:invokespecial   #542 <Method void Socket(String, int)>
	//   91  209:putfield        #64  <Field Socket socket>
		if(socket.getSoTimeout() == 0)
	//*  92  212:aload_0         
	//*  93  213:getfield        #64  <Field Socket socket>
	//*  94  216:invokevirtual   #545 <Method int Socket.getSoTimeout()>
	//*  95  219:ifne            233
			socket.setSoTimeout(timeout);
	//   96  222:aload_0         
	//   97  223:getfield        #64  <Field Socket socket>
	//   98  226:aload_0         
	//   99  227:getfield        #76  <Field int timeout>
	//  100  230:invokevirtual   #549 <Method void Socket.setSoTimeout(int)>
		in = new DataInputStream(socket.getInputStream());
	//  101  233:aload_0         
	//  102  234:new             #551 <Class DataInputStream>
	//  103  237:dup             
	//  104  238:aload_0         
	//  105  239:getfield        #64  <Field Socket socket>
	//  106  242:invokevirtual   #555 <Method java.io.InputStream Socket.getInputStream()>
	//  107  245:invokespecial   #558 <Method void DataInputStream(java.io.InputStream)>
	//  108  248:putfield        #353 <Field DataInputStream in>
		out = new DataOutputStream(socket.getOutputStream());
	//  109  251:aload_0         
	//  110  252:new             #369 <Class DataOutputStream>
	//  111  255:dup             
	//  112  256:aload_0         
	//  113  257:getfield        #64  <Field Socket socket>
	//  114  260:invokevirtual   #562 <Method java.io.OutputStream Socket.getOutputStream()>
	//  115  263:invokespecial   #565 <Method void DataOutputStream(java.io.OutputStream)>
	//  116  266:putfield        #360 <Field DataOutputStream out>
		break MISSING_BLOCK_LABEL_450;
	//  117  269:goto            450
		Object obj;
		obj;
	//  118  272:astore_2        
		if(fmLog != null)
	//* 119  273:aload_0         
	//* 120  274:getfield        #78  <Field FMLog fmLog>
	//* 121  277:ifnull          343
		{
			fmLog.debug(logTag, (new StringBuilder("Platform ")).append(linkinfo.getAddress()).append(":").append(linkinfo.getPort()).toString());
	//  122  280:aload_0         
	//  123  281:getfield        #78  <Field FMLog fmLog>
	//  124  284:aload_0         
	//  125  285:getfield        #86  <Field String logTag>
	//  126  288:new             #249 <Class StringBuilder>
	//  127  291:dup             
	//  128  292:ldc2            #567 <String "Platform ">
	//  129  295:invokespecial   #252 <Method void StringBuilder(String)>
	//  130  298:aload_1         
	//  131  299:invokevirtual   #527 <Method String LinkInfo.getAddress()>
	//  132  302:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  133  305:ldc2            #569 <String ":">
	//  134  308:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  135  311:aload_1         
	//  136  312:invokevirtual   #521 <Method int LinkInfo.getPort()>
	//  137  315:invokevirtual   #572 <Method StringBuilder StringBuilder.append(int)>
	//  138  318:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  139  321:invokeinterface #340 <Method void FMLog.debug(String, String)>
			fmLog.error(logTag, Util4Java.getExceptionInfo(((Exception) (obj))));
	//  140  326:aload_0         
	//  141  327:getfield        #78  <Field FMLog fmLog>
	//  142  330:aload_0         
	//  143  331:getfield        #86  <Field String logTag>
	//  144  334:aload_2         
	//  145  335:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  146  338:invokeinterface #171 <Method void FMLog.error(String, String)>
		}
		throw new SocketException(Util4Java.getExceptionInfo(((Exception) (obj))));
	//  147  343:new             #133 <Class SocketException>
	//  148  346:dup             
	//  149  347:aload_2         
	//  150  348:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  151  351:invokespecial   #490 <Method void SocketException(String)>
	//  152  354:athrow          
		obj;
	//  153  355:astore_2        
		if(fmLog != null)
	//* 154  356:aload_0         
	//* 155  357:getfield        #78  <Field FMLog fmLog>
	//* 156  360:ifnull          426
		{
			fmLog.debug(logTag, (new StringBuilder("Platform ")).append(linkinfo.getAddress()).append(":").append(linkinfo.getPort()).toString());
	//  157  363:aload_0         
	//  158  364:getfield        #78  <Field FMLog fmLog>
	//  159  367:aload_0         
	//  160  368:getfield        #86  <Field String logTag>
	//  161  371:new             #249 <Class StringBuilder>
	//  162  374:dup             
	//  163  375:ldc2            #567 <String "Platform ">
	//  164  378:invokespecial   #252 <Method void StringBuilder(String)>
	//  165  381:aload_1         
	//  166  382:invokevirtual   #527 <Method String LinkInfo.getAddress()>
	//  167  385:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  168  388:ldc2            #569 <String ":">
	//  169  391:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  170  394:aload_1         
	//  171  395:invokevirtual   #521 <Method int LinkInfo.getPort()>
	//  172  398:invokevirtual   #572 <Method StringBuilder StringBuilder.append(int)>
	//  173  401:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  174  404:invokeinterface #340 <Method void FMLog.debug(String, String)>
			fmLog.error(logTag, Util4Java.getExceptionInfo(((Exception) (obj))));
	//  175  409:aload_0         
	//  176  410:getfield        #78  <Field FMLog fmLog>
	//  177  413:aload_0         
	//  178  414:getfield        #86  <Field String logTag>
	//  179  417:aload_2         
	//  180  418:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  181  421:invokeinterface #171 <Method void FMLog.error(String, String)>
		}
		throw new SocketException(Util4Java.getExceptionInfo(((Exception) (obj))));
	//  182  426:new             #133 <Class SocketException>
	//  183  429:dup             
	//  184  430:aload_2         
	//  185  431:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  186  434:invokespecial   #490 <Method void SocketException(String)>
	//  187  437:athrow          
		linkinfo;
	//  188  438:astore_1        
		lock.unlock();
	//  189  439:aload_0         
	//  190  440:getfield        #119 <Field Lock lock>
	//  191  443:invokeinterface #403 <Method void Lock.unlock()>
		throw linkinfo;
	//  192  448:aload_1         
	//  193  449:athrow          
		lock.unlock();
	//  194  450:aload_0         
	//  195  451:getfield        #119 <Field Lock lock>
	//  196  454:invokeinterface #403 <Method void Lock.unlock()>
		isConnect = true;
	//  197  459:aload_0         
	//  198  460:iconst_1        
	//  199  461:putfield        #72  <Field boolean isConnect>
		lastCalledTime4Connect = System.currentTimeMillis();
	//  200  464:aload_0         
	//  201  465:invokestatic    #577 <Method long System.currentTimeMillis()>
	//  202  468:putfield        #88  <Field long lastCalledTime4Connect>
		return true;
	//  203  471:iconst_1        
	//  204  472:ireturn         
	}

	public boolean disconnect()
		throws SocketException
	{
		if(fmLog != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field FMLog fmLog>
	//*   2    4:ifnull          23
			fmLog.debug(logTag, "disconnect....");
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field FMLog fmLog>
	//    5   11:aload_0         
	//    6   12:getfield        #86  <Field String logTag>
	//    7   15:ldc2            #580 <String "disconnect....">
	//    8   18:invokeinterface #340 <Method void FMLog.debug(String, String)>
		isConnect = false;
	//    9   23:aload_0         
	//   10   24:iconst_0        
	//   11   25:putfield        #72  <Field boolean isConnect>
		try
		{
			if(out != null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #360 <Field DataOutputStream out>
	//*  14   32:ifnull          70
				out.close();
	//   15   35:aload_0         
	//   16   36:getfield        #360 <Field DataOutputStream out>
	//   17   39:invokevirtual   #583 <Method void DataOutputStream.close()>
		}
	//*  18   42:goto            70
		catch(IOException ioexception)
	//*  19   45:astore_1        
		{
			if(fmLog != null)
	//*  20   46:aload_0         
	//*  21   47:getfield        #78  <Field FMLog fmLog>
	//*  22   50:ifnull          70
				fmLog.error(logTag, Util4Java.getExceptionInfo(((Exception) (ioexception))));
	//   23   53:aload_0         
	//   24   54:getfield        #78  <Field FMLog fmLog>
	//   25   57:aload_0         
	//   26   58:getfield        #86  <Field String logTag>
	//   27   61:aload_1         
	//   28   62:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//   29   65:invokeinterface #171 <Method void FMLog.error(String, String)>
		}
		out = null;
	//   30   70:aload_0         
	//   31   71:aconst_null     
	//   32   72:putfield        #360 <Field DataOutputStream out>
		try
		{
			if(in != null)
	//*  33   75:aload_0         
	//*  34   76:getfield        #353 <Field DataInputStream in>
	//*  35   79:ifnull          117
				in.close();
	//   36   82:aload_0         
	//   37   83:getfield        #353 <Field DataInputStream in>
	//   38   86:invokevirtual   #584 <Method void DataInputStream.close()>
		}
	//*  39   89:goto            117
		catch(IOException ioexception1)
	//*  40   92:astore_1        
		{
			if(fmLog != null)
	//*  41   93:aload_0         
	//*  42   94:getfield        #78  <Field FMLog fmLog>
	//*  43   97:ifnull          117
				fmLog.error(logTag, Util4Java.getExceptionInfo(((Exception) (ioexception1))));
	//   44  100:aload_0         
	//   45  101:getfield        #78  <Field FMLog fmLog>
	//   46  104:aload_0         
	//   47  105:getfield        #86  <Field String logTag>
	//   48  108:aload_1         
	//   49  109:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//   50  112:invokeinterface #171 <Method void FMLog.error(String, String)>
		}
		in = null;
	//   51  117:aload_0         
	//   52  118:aconst_null     
	//   53  119:putfield        #353 <Field DataInputStream in>
		try
		{
			if(socket != null)
	//*  54  122:aload_0         
	//*  55  123:getfield        #64  <Field Socket socket>
	//*  56  126:ifnull          164
				socket.close();
	//   57  129:aload_0         
	//   58  130:getfield        #64  <Field Socket socket>
	//   59  133:invokevirtual   #585 <Method void Socket.close()>
		}
	//*  60  136:goto            164
		catch(IOException ioexception2)
	//*  61  139:astore_1        
		{
			if(fmLog != null)
	//*  62  140:aload_0         
	//*  63  141:getfield        #78  <Field FMLog fmLog>
	//*  64  144:ifnull          164
				fmLog.error(logTag, Util4Java.getExceptionInfo(((Exception) (ioexception2))));
	//   65  147:aload_0         
	//   66  148:getfield        #78  <Field FMLog fmLog>
	//   67  151:aload_0         
	//   68  152:getfield        #86  <Field String logTag>
	//   69  155:aload_1         
	//   70  156:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//   71  159:invokeinterface #171 <Method void FMLog.error(String, String)>
		}
		socket = null;
	//   72  164:aload_0         
	//   73  165:aconst_null     
	//   74  166:putfield        #64  <Field Socket socket>
		return true;
	//   75  169:iconst_1        
	//   76  170:ireturn         
	}

	public long getLastCalledTime()
	{
		return lastCalledTime4Session;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field long lastCalledTime4Session>
	//    2    4:lreturn         
	}

	public Date getLastHeartBeat()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public byte[] getSessionNumber()
	{
		return sessionNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field byte[] sessionNumber>
	//    2    4:areturn         
	}

	public long getSessionSerialNumber()
	{
		return serialNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field long serialNumber>
	//    2    4:lreturn         
	}

	public boolean isConnect()
	{
		if(isConnect && System.currentTimeMillis() - lastCalledTime4Connect >= 0x83d60L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean isConnect>
	//*   2    4:ifeq            53
	//*   3    7:invokestatic    #577 <Method long System.currentTimeMillis()>
	//*   4   10:aload_0         
	//*   5   11:getfield        #88  <Field long lastCalledTime4Connect>
	//*   6   14:lsub            
	//*   7   15:ldc2w           #590 <Long 0x83d60L>
	//*   8   18:lcmp            
	//*   9   19:iflt            53
		{
			if(fmLog != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #78  <Field FMLog fmLog>
	//*  12   26:ifnull          48
				fmLog.debug(((Object)this).getClass().getName(), "server link timeout!");
	//   13   29:aload_0         
	//   14   30:getfield        #78  <Field FMLog fmLog>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #160 <Method Class Object.getClass()>
	//   17   37:invokevirtual   #84  <Method String Class.getName()>
	//   18   40:ldc2            #593 <String "server link timeout!">
	//   19   43:invokeinterface #340 <Method void FMLog.debug(String, String)>
			isConnect = false;
	//   20   48:aload_0         
	//   21   49:iconst_0        
	//   22   50:putfield        #72  <Field boolean isConnect>
		}
		return isConnect;
	//   23   53:aload_0         
	//   24   54:getfield        #72  <Field boolean isConnect>
	//   25   57:ireturn         
	}

	boolean isHandle()
	{
		return isHandle;
	//    0    0:aload_0         
	//    1    1:getfield        #595 <Field boolean isHandle>
	//    2    4:ireturn         
	}

	public boolean isOpenSession()
	{
		if(openSessionFlag && System.currentTimeMillis() - lastCalledTime4Session >= 0x83d60L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field boolean openSessionFlag>
	//*   2    4:ifeq            53
	//*   3    7:invokestatic    #577 <Method long System.currentTimeMillis()>
	//*   4   10:aload_0         
	//*   5   11:getfield        #90  <Field long lastCalledTime4Session>
	//*   6   14:lsub            
	//*   7   15:ldc2w           #590 <Long 0x83d60L>
	//*   8   18:lcmp            
	//*   9   19:iflt            53
		{
			if(fmLog != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #78  <Field FMLog fmLog>
	//*  12   26:ifnull          48
				fmLog.debug(((Object)this).getClass().getName(), "server link timeout!");
	//   13   29:aload_0         
	//   14   30:getfield        #78  <Field FMLog fmLog>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #160 <Method Class Object.getClass()>
	//   17   37:invokevirtual   #84  <Method String Class.getName()>
	//   18   40:ldc2            #593 <String "server link timeout!">
	//   19   43:invokeinterface #340 <Method void FMLog.debug(String, String)>
			openSessionFlag = false;
	//   20   48:aload_0         
	//   21   49:iconst_0        
	//   22   50:putfield        #74  <Field boolean openSessionFlag>
		}
		return openSessionFlag;
	//   23   53:aload_0         
	//   24   54:getfield        #74  <Field boolean openSessionFlag>
	//   25   57:ireturn         
	}

	public boolean lastRequestDataIsNull()
	{
		return lastRequestData == null;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field byte[] lastRequestData>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean openSession(TerminalInfo terminalinfo, boolean flag)
		throws InvalidParameterException, SocketException, CommunicationException, OpenSessionException
	{
label0:
		{
			if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
				fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #101 <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #105 <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #78  <Field FMLog fmLog>
			if(openSessionFlag)
	//*   7   17:aload_0         
	//*   8   18:getfield        #74  <Field boolean openSessionFlag>
	//*   9   21:ifeq            26
				return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
			if(terminalinfo == null)
	//*  12   26:aload_1         
	//*  13   27:ifnonnull       41
				throw new InvalidParameterException("\u7EC8\u7AEF\u7B7E\u5230\u65F6\uFF0C\u8BF7\u6C42\u6570\u636E\u5BF9\u8C61\u4E3A\u7A7A\uFF0C\u7B7E\u5230\u5931\u8D25");
	//   14   30:new             #416 <Class InvalidParameterException>
	//   15   33:dup             
	//   16   34:ldc2            #603 <String "\u7EC8\u7AEF\u7B7E\u5230\u65F6\uFF0C\u8BF7\u6C42\u6570\u636E\u5BF9\u8C61\u4E3A\u7A7A\uFF0C\u7B7E\u5230\u5931\u8D25">
	//   17   37:invokespecial   #516 <Method void InvalidParameterException(String)>
	//   18   40:athrow          
			isHeartbeat = flag;
	//   19   41:aload_0         
	//   20   42:iload_2         
	//   21   43:putfield        #605 <Field boolean isHeartbeat>
			ControlWord controlword = new ControlWord();
	//   22   46:new             #203 <Class ControlWord>
	//   23   49:dup             
	//   24   50:invokespecial   #423 <Method void ControlWord()>
	//   25   53:astore          5
			controlword.setDirection(ControlWord.Direction.REQUEST);
	//   26   55:aload           5
	//   27   57:getstatic       #426 <Field ControlWord$Direction ControlWord$Direction.REQUEST>
	//   28   60:invokevirtual   #429 <Method void ControlWord.setDirection(ControlWord$Direction)>
			controlword.setType(ControlWord.MessageType.CONTROL);
	//   29   63:aload           5
	//   30   65:getstatic       #435 <Field ControlWord$MessageType ControlWord$MessageType.CONTROL>
	//   31   68:invokevirtual   #439 <Method void ControlWord.setType(ControlWord$MessageType)>
			controlword.setCommandType(ControlWord.CommandType.OPENSESSION);
	//   32   71:aload           5
	//   33   73:getstatic       #608 <Field ControlWord$CommandType ControlWord$CommandType.OPENSESSION>
	//   34   76:invokevirtual   #449 <Method void ControlWord.setCommandType(ControlWord$CommandType)>
			MessageHead messagehead = new MessageHead();
	//   35   79:new             #186 <Class MessageHead>
	//   36   82:dup             
	//   37   83:invokespecial   #187 <Method void MessageHead()>
	//   38   86:astore          4
			messagehead.setProtocolVersion((byte)17);
	//   39   88:aload           4
	//   40   90:bipush          17
	//   41   92:invokevirtual   #455 <Method void MessageHead.setProtocolVersion(byte)>
			messagehead.setSecurityLevel(new byte[] {
				(byte)MessageHead.SecurityLevel.PLAIN.getValue(), (byte)MessageHead.CheckType.CRC16.getValue()
			});
	//   42   95:aload           4
	//   43   97:iconst_2        
	//   44   98:newarray        byte[]
	//   45  100:dup             
	//   46  101:iconst_0        
	//   47  102:getstatic       #465 <Field MessageHead$SecurityLevel MessageHead$SecurityLevel.PLAIN>
	//   48  105:invokevirtual   #275 <Method int MessageHead$SecurityLevel.getValue()>
	//   49  108:int2byte        
	//   50  109:bastore         
	//   51  110:dup             
	//   52  111:iconst_1        
	//   53  112:getstatic       #611 <Field MessageHead$CheckType MessageHead$CheckType.CRC16>
	//   54  115:invokevirtual   #282 <Method int MessageHead$CheckType.getValue()>
	//   55  118:int2byte        
	//   56  119:bastore         
	//   57  120:invokevirtual   #468 <Method void MessageHead.setSecurityLevel(byte[])>
			messagehead.setControlWord(controlword);
	//   58  123:aload           4
	//   59  125:aload           5
	//   60  127:invokevirtual   #472 <Method void MessageHead.setControlWord(ControlWord)>
			byte abyte2[] = messagehead.toBytes();
	//   61  130:aload           4
	//   62  132:invokevirtual   #478 <Method byte[] MessageHead.toBytes()>
	//   63  135:astore          5
			OpenSessionRequest opensessionrequest = new OpenSessionRequest();
	//   64  137:new             #613 <Class OpenSessionRequest>
	//   65  140:dup             
	//   66  141:invokespecial   #614 <Method void OpenSessionRequest()>
	//   67  144:astore          6
			opensessionrequest.setTerminalType(terminalinfo.getTerminalType());
	//   68  146:aload           6
	//   69  148:aload_1         
	//   70  149:invokevirtual   #619 <Method byte[] TerminalInfo.getTerminalType()>
	//   71  152:invokevirtual   #622 <Method void OpenSessionRequest.setTerminalType(byte[])>
			opensessionrequest.setAppend(terminalinfo.getAppend());
	//   72  155:aload           6
	//   73  157:aload_1         
	//   74  158:invokevirtual   #625 <Method byte[] TerminalInfo.getAppend()>
	//   75  161:invokevirtual   #628 <Method void OpenSessionRequest.setAppend(byte[])>
			opensessionrequest.setKeyIndex(terminalinfo.getKeyIndex());
	//   76  164:aload           6
	//   77  166:aload_1         
	//   78  167:invokevirtual   #631 <Method byte TerminalInfo.getKeyIndex()>
	//   79  170:invokevirtual   #634 <Method void OpenSessionRequest.setKeyIndex(byte)>
			opensessionrequest.setExponent(terminalinfo.getExponent());
	//   80  173:aload           6
	//   81  175:aload_1         
	//   82  176:invokevirtual   #637 <Method byte[] TerminalInfo.getExponent()>
	//   83  179:invokevirtual   #640 <Method void OpenSessionRequest.setExponent(byte[])>
			opensessionrequest.setModulus(terminalinfo.getModulus());
	//   84  182:aload           6
	//   85  184:aload_1         
	//   86  185:invokevirtual   #643 <Method byte[] TerminalInfo.getModulus()>
	//   87  188:invokevirtual   #646 <Method void OpenSessionRequest.setModulus(byte[])>
			opensessionrequest.setSecurityCode(terminalinfo.getSecurityCode());
	//   88  191:aload           6
	//   89  193:aload_1         
	//   90  194:invokevirtual   #649 <Method byte[] TerminalInfo.getSecurityCode()>
	//   91  197:invokevirtual   #652 <Method void OpenSessionRequest.setSecurityCode(byte[])>
			opensessionrequest.setTerminalNumber(terminalinfo.getTerminalNumber());
	//   92  200:aload           6
	//   93  202:aload_1         
	//   94  203:invokevirtual   #655 <Method byte[] TerminalInfo.getTerminalNumber()>
	//   95  206:invokevirtual   #658 <Method void OpenSessionRequest.setTerminalNumber(byte[])>
			terminalinfo = ((TerminalInfo) (new Random()));
	//   96  209:new             #660 <Class Random>
	//   97  212:dup             
	//   98  213:invokespecial   #661 <Method void Random()>
	//   99  216:astore_1        
			terminalRamdom = new byte[8];
	//  100  217:aload_0         
	//  101  218:bipush          8
	//  102  220:newarray        byte[]
	//  103  222:putfield        #663 <Field byte[] terminalRamdom>
			((Random) (terminalinfo)).nextBytes(terminalRamdom);
	//  104  225:aload_1         
	//  105  226:aload_0         
	//  106  227:getfield        #663 <Field byte[] terminalRamdom>
	//  107  230:invokevirtual   #666 <Method void Random.nextBytes(byte[])>
			opensessionrequest.setTerminalRandom(terminalRamdom);
	//  108  233:aload           6
	//  109  235:aload_0         
	//  110  236:getfield        #663 <Field byte[] terminalRamdom>
	//  111  239:invokevirtual   #669 <Method void OpenSessionRequest.setTerminalRandom(byte[])>
			tempKey = new byte[16];
	//  112  242:aload_0         
	//  113  243:bipush          16
	//  114  245:newarray        byte[]
	//  115  247:putfield        #671 <Field byte[] tempKey>
			((Random) (terminalinfo)).nextBytes(tempKey);
	//  116  250:aload_1         
	//  117  251:aload_0         
	//  118  252:getfield        #671 <Field byte[] tempKey>
	//  119  255:invokevirtual   #666 <Method void Random.nextBytes(byte[])>
			opensessionrequest.setTempKey(tempKey);
	//  120  258:aload           6
	//  121  260:aload_0         
	//  122  261:getfield        #671 <Field byte[] tempKey>
	//  123  264:invokevirtual   #674 <Method void OpenSessionRequest.setTempKey(byte[])>
			terminalinfo = ((TerminalInfo) (opensessionrequest.toBytes()));
	//  124  267:aload           6
	//  125  269:invokevirtual   #675 <Method byte[] OpenSessionRequest.toBytes()>
	//  126  272:astore_1        
			if(terminalinfo == null)
	//* 127  273:aload_1         
	//* 128  274:ifnonnull       288
				throw new OpenSessionException("\u7EC8\u7AEF\u7B7E\u5230\u65F6\uFF0C\u8BF7\u6C42\u6570\u636Ebody\u4E3A\u7A7A\uFF0C\u7B7E\u5230\u5931\u8D25");
	//  129  277:new             #601 <Class OpenSessionException>
	//  130  280:dup             
	//  131  281:ldc2            #677 <String "\u7EC8\u7AEF\u7B7E\u5230\u65F6\uFF0C\u8BF7\u6C42\u6570\u636Ebody\u4E3A\u7A7A\uFF0C\u7B7E\u5230\u5931\u8D25">
	//  132  284:invokespecial   #678 <Method void OpenSessionException(String)>
	//  133  287:athrow          
			terminalinfo = ((TerminalInfo) (FM_Bytes.join(abyte2, ((byte []) (terminalinfo)))));
	//  134  288:aload           5
	//  135  290:aload_1         
	//  136  291:invokestatic    #367 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  137  294:astore_1        
			terminalinfo = ((TerminalInfo) (FM_Bytes.join(((byte []) (terminalinfo)), CRCUtil.calculateCRC16(((byte []) (terminalinfo))))));
	//  138  295:aload_1         
	//  139  296:aload_1         
	//  140  297:invokestatic    #683 <Method byte[] CRCUtil.calculateCRC16(byte[])>
	//  141  300:invokestatic    #367 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  142  303:astore_1        
			try
			{
				abyte2 = send(dataLengthHandle.initDataSize(terminalinfo.length), ((byte []) (terminalinfo)));
	//  143  304:aload_0         
	//  144  305:aload_0         
	//  145  306:getfield        #95  <Field DataLengthHandle dataLengthHandle>
	//  146  309:aload_1         
	//  147  310:arraylength     
	//  148  311:invokeinterface #487 <Method byte[] DataLengthHandle.initDataSize(int)>
	//  149  316:aload_1         
	//  150  317:invokespecial   #489 <Method byte[] send(byte[], byte[])>
	//  151  320:astore          5
			}
	//* 152  322:goto            401
			// Misplaced declaration of an exception variable
			catch(TerminalInfo terminalinfo)
	//* 153  325:astore_1        
			{
				isConnect = false;
	//  154  326:aload_0         
	//  155  327:iconst_0        
	//  156  328:putfield        #72  <Field boolean isConnect>
				if(fmLog != null)
	//* 157  331:aload_0         
	//* 158  332:getfield        #78  <Field FMLog fmLog>
	//* 159  335:ifnull          371
					fmLog.error(logTag, (new StringBuilder("\u7B7E\u5230\u662F\uFF0C\u7F51\u7EDC\u51FA\u73B0\u5F02\u5E38\uFF1A")).append(Util4Java.getExceptionInfo(((Exception) (terminalinfo)))).toString());
	//  160  338:aload_0         
	//  161  339:getfield        #78  <Field FMLog fmLog>
	//  162  342:aload_0         
	//  163  343:getfield        #86  <Field String logTag>
	//  164  346:new             #249 <Class StringBuilder>
	//  165  349:dup             
	//  166  350:ldc2            #685 <String "\u7B7E\u5230\u662F\uFF0C\u7F51\u7EDC\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  167  353:invokespecial   #252 <Method void StringBuilder(String)>
	//  168  356:aload_1         
	//  169  357:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  170  360:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  171  363:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  172  366:invokeinterface #171 <Method void FMLog.error(String, String)>
				throw new SocketException(Util4Java.getExceptionInfo(((Exception) (terminalinfo))));
	//  173  371:new             #133 <Class SocketException>
	//  174  374:dup             
	//  175  375:aload_1         
	//  176  376:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  177  379:invokespecial   #490 <Method void SocketException(String)>
	//  178  382:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(TerminalInfo terminalinfo)
	//* 179  383:astore_1        
			{
				isConnect = false;
	//  180  384:aload_0         
	//  181  385:iconst_0        
	//  182  386:putfield        #72  <Field boolean isConnect>
				throw new SocketException(Util4Java.getExceptionInfo(((Exception) (terminalinfo))));
	//  183  389:new             #133 <Class SocketException>
	//  184  392:dup             
	//  185  393:aload_1         
	//  186  394:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  187  397:invokespecial   #490 <Method void SocketException(String)>
	//  188  400:athrow          
			}
			if(abyte2 == null)
	//* 189  401:aload           5
	//* 190  403:ifnonnull       440
			{
				if(fmLog != null)
	//* 191  406:aload_0         
	//* 192  407:getfield        #78  <Field FMLog fmLog>
	//* 193  410:ifnull          429
					fmLog.error(logTag, "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u7B7E\u5230\u5931\u8D25");
	//  194  413:aload_0         
	//  195  414:getfield        #78  <Field FMLog fmLog>
	//  196  417:aload_0         
	//  197  418:getfield        #86  <Field String logTag>
	//  198  421:ldc2            #687 <String "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u7B7E\u5230\u5931\u8D25">
	//  199  424:invokeinterface #171 <Method void FMLog.error(String, String)>
				throw new CommunicationException("\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u7B7E\u5230\u5931\u8D25");
	//  200  429:new             #131 <Class CommunicationException>
	//  201  432:dup             
	//  202  433:ldc2            #687 <String "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u4E3A\u7A7A\uFF0C\u7B7E\u5230\u5931\u8D25">
	//  203  436:invokespecial   #144 <Method void CommunicationException(String)>
	//  204  439:athrow          
			}
			if(abyte2.length < 12)
	//* 205  440:aload           5
	//* 206  442:arraylength     
	//* 207  443:bipush          12
	//* 208  445:icmpge          475
			{
				terminalinfo = ((TerminalInfo) (new CommunicationException("\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5\uFF0C\u7B7E\u5230\u5931\u8D25")));
	//  209  448:new             #131 <Class CommunicationException>
	//  210  451:dup             
	//  211  452:ldc2            #689 <String "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u5E73\u53F0\u54CD\u5E94\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5\uFF0C\u7B7E\u5230\u5931\u8D25">
	//  212  455:invokespecial   #144 <Method void CommunicationException(String)>
	//  213  458:astore_1        
				((CommunicationException) (terminalinfo)).setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_FORMAT);
	//  214  459:aload_1         
	//  215  460:getstatic       #499 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_FORMAT>
	//  216  463:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
				((CommunicationException) (terminalinfo)).setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  217  466:aload_1         
	//  218  467:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  219  470:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
				throw terminalinfo;
	//  220  473:aload_1         
	//  221  474:athrow          
			}
			messagehead.fromBytes(Arrays.copyOf(abyte2, 12));
	//  222  475:aload           4
	//  223  477:aload           5
	//  224  479:bipush          12
	//  225  481:invokestatic    #193 <Method byte[] Arrays.copyOf(byte[], int)>
	//  226  484:invokevirtual   #197 <Method void MessageHead.fromBytes(byte[])>
			terminalinfo = ((TerminalInfo) (messagehead.getControlWord()));
	//  227  487:aload           4
	//  228  489:invokevirtual   #201 <Method ControlWord MessageHead.getControlWord()>
	//  229  492:astore_1        
			if(((ControlWord) (terminalinfo)).getDirection() != ControlWord.Direction.RESPONSE)
	//* 230  493:aload_1         
	//* 231  494:invokevirtual   #207 <Method ControlWord$Direction ControlWord.getDirection()>
	//* 232  497:getstatic       #212 <Field ControlWord$Direction ControlWord$Direction.RESPONSE>
	//* 233  500:if_acmpeq       530
			{
				terminalinfo = ((TerminalInfo) (new CommunicationException("\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u7684\u5E73\u53F0\u6570\u636E\u4E0D\u662F\u54CD\u5E94\u6570\u636E\uFF0C\u7B7E\u5230\u5931\u8D25")));
	//  234  503:new             #131 <Class CommunicationException>
	//  235  506:dup             
	//  236  507:ldc2            #691 <String "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u7684\u5E73\u53F0\u6570\u636E\u4E0D\u662F\u54CD\u5E94\u6570\u636E\uFF0C\u7B7E\u5230\u5931\u8D25">
	//  237  510:invokespecial   #144 <Method void CommunicationException(String)>
	//  238  513:astore_1        
				((CommunicationException) (terminalinfo)).setExceptionType(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_DIRECTION);
	//  239  514:aload_1         
	//  240  515:getstatic       #217 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_DIRECTION>
	//  241  518:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
				((CommunicationException) (terminalinfo)).setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  242  521:aload_1         
	//  243  522:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  244  525:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
				throw terminalinfo;
	//  245  528:aload_1         
	//  246  529:athrow          
			}
			byte abyte0[] = messagehead.getSecurityLevel();
	//  247  530:aload           4
	//  248  532:invokevirtual   #265 <Method byte[] MessageHead.getSecurityLevel()>
	//  249  535:astore          4
			if(abyte0[0] != MessageHead.SecurityLevel.PLAIN.getValue() || abyte0[1] != MessageHead.CheckType.CRC16.getValue())
	//* 250  537:aload           4
	//* 251  539:iconst_0        
	//* 252  540:baload          
	//* 253  541:getstatic       #465 <Field MessageHead$SecurityLevel MessageHead$SecurityLevel.PLAIN>
	//* 254  544:invokevirtual   #275 <Method int MessageHead$SecurityLevel.getValue()>
	//* 255  547:icmpne          563
	//* 256  550:aload           4
	//* 257  552:iconst_1        
	//* 258  553:baload          
	//* 259  554:getstatic       #611 <Field MessageHead$CheckType MessageHead$CheckType.CRC16>
	//* 260  557:invokevirtual   #282 <Method int MessageHead$CheckType.getValue()>
	//* 261  560:icmpeq          597
			{
				if(fmLog != null)
	//* 262  563:aload_0         
	//* 263  564:getfield        #78  <Field FMLog fmLog>
	//* 264  567:ifnull          586
					fmLog.warn(logTag, "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u62A5\u6587\u7684\u5B89\u5168\u7EA7\u522B\u65E0\u6548");
	//  265  570:aload_0         
	//  266  571:getfield        #78  <Field FMLog fmLog>
	//  267  574:aload_0         
	//  268  575:getfield        #86  <Field String logTag>
	//  269  578:ldc2            #693 <String "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u62A5\u6587\u7684\u5B89\u5168\u7EA7\u522B\u65E0\u6548">
	//  270  581:invokeinterface #141 <Method void FMLog.warn(String, String)>
				throw new OpenSessionException("\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u62A5\u6587\u7684\u5B89\u5168\u7EA7\u522B\u65E0\u6548");
	//  271  586:new             #601 <Class OpenSessionException>
	//  272  589:dup             
	//  273  590:ldc2            #693 <String "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u6536\u5230\u54CD\u5E94\u62A5\u6587\u7684\u5B89\u5168\u7EA7\u522B\u65E0\u6548">
	//  274  593:invokespecial   #678 <Method void OpenSessionException(String)>
	//  275  596:athrow          
			}
			if(!Arrays.equals(CRCUtil.calculateCRC16(Arrays.copyOf(abyte2, abyte2.length - 2)), Arrays.copyOfRange(abyte2, abyte2.length - 2, abyte2.length)))
	//* 276  597:aload           5
	//* 277  599:aload           5
	//* 278  601:arraylength     
	//* 279  602:iconst_2        
	//* 280  603:isub            
	//* 281  604:invokestatic    #193 <Method byte[] Arrays.copyOf(byte[], int)>
	//* 282  607:invokestatic    #683 <Method byte[] CRCUtil.calculateCRC16(byte[])>
	//* 283  610:aload           5
	//* 284  612:aload           5
	//* 285  614:arraylength     
	//* 286  615:iconst_2        
	//* 287  616:isub            
	//* 288  617:aload           5
	//* 289  619:arraylength     
	//* 290  620:invokestatic    #291 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//* 291  623:invokestatic    #225 <Method boolean Arrays.equals(byte[], byte[])>
	//* 292  626:ifne            663
			{
				if(fmLog != null)
	//* 293  629:aload_0         
	//* 294  630:getfield        #78  <Field FMLog fmLog>
	//* 295  633:ifnull          652
					fmLog.warn(logTag, "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u7B7E\u5230\u54CD\u5E94\u6570\u636ECRC\u9A8C\u8BC1\u5931\u8D25");
	//  296  636:aload_0         
	//  297  637:getfield        #78  <Field FMLog fmLog>
	//  298  640:aload_0         
	//  299  641:getfield        #86  <Field String logTag>
	//  300  644:ldc2            #695 <String "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u7B7E\u5230\u54CD\u5E94\u6570\u636ECRC\u9A8C\u8BC1\u5931\u8D25">
	//  301  647:invokeinterface #141 <Method void FMLog.warn(String, String)>
				throw new OpenSessionException("\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u7B7E\u5230\u54CD\u5E94\u6570\u636ECRC\u9A8C\u8BC1\u5931\u8D25");
	//  302  652:new             #601 <Class OpenSessionException>
	//  303  655:dup             
	//  304  656:ldc2            #695 <String "\u7EC8\u7AEF\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u7B7E\u5230\u54CD\u5E94\u6570\u636ECRC\u9A8C\u8BC1\u5931\u8D25">
	//  305  659:invokespecial   #678 <Method void OpenSessionException(String)>
	//  306  662:athrow          
			}
			abyte0 = Arrays.copyOfRange(abyte2, 12, abyte2.length - 2);
	//  307  663:aload           5
	//  308  665:bipush          12
	//  309  667:aload           5
	//  310  669:arraylength     
	//  311  670:iconst_2        
	//  312  671:isub            
	//  313  672:invokestatic    #291 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  314  675:astore          4
			if(((ControlWord) (terminalinfo)).getReponseCode() != 0 && ((ControlWord) (terminalinfo)).getReponseCode() != 14)
	//* 315  677:aload_1         
	//* 316  678:invokevirtual   #243 <Method byte ControlWord.getReponseCode()>
	//* 317  681:ifeq            747
	//* 318  684:aload_1         
	//* 319  685:invokevirtual   #243 <Method byte ControlWord.getReponseCode()>
	//* 320  688:bipush          14
	//* 321  690:icmpeq          747
			{
				terminalinfo = ((TerminalInfo) (cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.instance(((int) (((ControlWord) (terminalinfo)).getReponseCode())))));
	//  322  693:aload_1         
	//  323  694:invokevirtual   #243 <Method byte ControlWord.getReponseCode()>
	//  324  697:invokestatic    #247 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.instance(int)>
	//  325  700:astore_1        
				abyte0 = ((byte []) (new CommunicationException((new StringBuilder("\u7B7E\u5230\u5931\u8D25:")).append(((cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType) (terminalinfo)).getDescription()).toString())));
	//  326  701:new             #131 <Class CommunicationException>
	//  327  704:dup             
	//  328  705:new             #249 <Class StringBuilder>
	//  329  708:dup             
	//  330  709:ldc2            #697 <String "\u7B7E\u5230\u5931\u8D25:">
	//  331  712:invokespecial   #252 <Method void StringBuilder(String)>
	//  332  715:aload_1         
	//  333  716:invokevirtual   #255 <Method String cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.getDescription()>
	//  334  719:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//  335  722:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  336  725:invokespecial   #144 <Method void CommunicationException(String)>
	//  337  728:astore          4
				((CommunicationException) (abyte0)).setExceptionType(((cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType) (terminalinfo)));
	//  338  730:aload           4
	//  339  732:aload_1         
	//  340  733:invokevirtual   #154 <Method void CommunicationException.setExceptionType(cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType)>
				((CommunicationException) (abyte0)).setDirection(cn.com.fmsh.communication.exception.CommunicationException.CommandDirection.RESPONSE);
	//  341  736:aload           4
	//  342  738:getstatic       #180 <Field cn.com.fmsh.communication.exception.CommunicationException$CommandDirection cn.com.fmsh.communication.exception.CommunicationException$CommandDirection.RESPONSE>
	//  343  741:invokevirtual   #184 <Method void CommunicationException.setDirection(cn.com.fmsh.communication.exception.CommunicationException$CommandDirection)>
				throw abyte0;
	//  344  744:aload           4
	//  345  746:athrow          
			}
			if(abyte0.length < 1)
	//* 346  747:aload           4
	//* 347  749:arraylength     
	//* 348  750:iconst_1        
	//* 349  751:icmpge          765
				throw new CommunicationException("\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\uFF0C\u54CD\u5E94\u6570\u636E\u5305\u4F53\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//  350  754:new             #131 <Class CommunicationException>
	//  351  757:dup             
	//  352  758:ldc2            #699 <String "\u5E73\u53F0\u4E1A\u52A1\u5904\u7406\uFF0C\u54CD\u5E94\u6570\u636E\u5305\u4F53\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//  353  761:invokespecial   #144 <Method void CommunicationException(String)>
	//  354  764:athrow          
			if(((ControlWord) (terminalinfo)).getReponseCode() == 14)
	//* 355  765:aload_1         
	//* 356  766:invokevirtual   #243 <Method byte ControlWord.getReponseCode()>
	//* 357  769:bipush          14
	//* 358  771:icmpne          804
			{
				terminalinfo = ((TerminalInfo) (cn.com.fmsh.communication.exception.session.OpenSessionException.OpenSessionExceptionType.instance(((int) (abyte0[0])))));
	//  359  774:aload           4
	//  360  776:iconst_0        
	//  361  777:baload          
	//  362  778:invokestatic    #704 <Method cn.com.fmsh.communication.exception.session.OpenSessionException$OpenSessionExceptionType cn.com.fmsh.communication.exception.session.OpenSessionException$OpenSessionExceptionType.instance(int)>
	//  363  781:astore_1        
				abyte0 = ((byte []) (new OpenSessionException(((cn.com.fmsh.communication.exception.session.OpenSessionException.OpenSessionExceptionType) (terminalinfo)).getDescription())));
	//  364  782:new             #601 <Class OpenSessionException>
	//  365  785:dup             
	//  366  786:aload_1         
	//  367  787:invokevirtual   #705 <Method String cn.com.fmsh.communication.exception.session.OpenSessionException$OpenSessionExceptionType.getDescription()>
	//  368  790:invokespecial   #678 <Method void OpenSessionException(String)>
	//  369  793:astore          4
				((OpenSessionException) (abyte0)).setExceptionType(((cn.com.fmsh.communication.exception.session.OpenSessionException.OpenSessionExceptionType) (terminalinfo)));
	//  370  795:aload           4
	//  371  797:aload_1         
	//  372  798:invokevirtual   #708 <Method void OpenSessionException.setExceptionType(cn.com.fmsh.communication.exception.session.OpenSessionException$OpenSessionExceptionType)>
				throw abyte0;
	//  373  801:aload           4
	//  374  803:athrow          
			}
			terminalinfo = ((TerminalInfo) (DES.decrypt4des3(tempKey, abyte0)));
	//  375  804:aload_0         
	//  376  805:getfield        #671 <Field byte[] tempKey>
	//  377  808:aload           4
	//  378  810:invokestatic    #322 <Method byte[] DES.decrypt4des3(byte[], byte[])>
	//  379  813:astore_1        
			if(!FM_Bytes.isPatch4Des(((byte []) (terminalinfo))))
	//* 380  814:aload_1         
	//* 381  815:invokestatic    #326 <Method boolean FM_Bytes.isPatch4Des(byte[])>
	//* 382  818:ifne            855
			{
				if(fmLog != null)
	//* 383  821:aload_0         
	//* 384  822:getfield        #78  <Field FMLog fmLog>
	//* 385  825:ifnull          844
					fmLog.warn(logTag, "\u5E73\u53F0\u54CD\u5E94\u6570\u636E3Des\u89E3\u5BC6\u540E\uFF0C\u672A\u8865\u4F4D");
	//  386  828:aload_0         
	//  387  829:getfield        #78  <Field FMLog fmLog>
	//  388  832:aload_0         
	//  389  833:getfield        #86  <Field String logTag>
	//  390  836:ldc2            #710 <String "\u5E73\u53F0\u54CD\u5E94\u6570\u636E3Des\u89E3\u5BC6\u540E\uFF0C\u672A\u8865\u4F4D">
	//  391  839:invokeinterface #141 <Method void FMLog.warn(String, String)>
				throw new OpenSessionException("\u5E73\u53F0\u54CD\u5E94\u6570\u636E3Des\u89E3\u5BC6\u540E\uFF0C\u672A\u8865\u4F4D");
	//  392  844:new             #601 <Class OpenSessionException>
	//  393  847:dup             
	//  394  848:ldc2            #710 <String "\u5E73\u53F0\u54CD\u5E94\u6570\u636E3Des\u89E3\u5BC6\u540E\uFF0C\u672A\u8865\u4F4D">
	//  395  851:invokespecial   #678 <Method void OpenSessionException(String)>
	//  396  854:athrow          
			}
			abyte0 = FM_Bytes.byteRemovePatch4Des(((byte []) (terminalinfo)));
	//  397  855:aload_1         
	//  398  856:invokestatic    #332 <Method byte[] FM_Bytes.byteRemovePatch4Des(byte[])>
	//  399  859:astore          4
			terminalinfo = ((TerminalInfo) (new OpenSessionResponse()));
	//  400  861:new             #712 <Class OpenSessionResponse>
	//  401  864:dup             
	//  402  865:invokespecial   #713 <Method void OpenSessionResponse()>
	//  403  868:astore_1        
			((OpenSessionResponse) (terminalinfo)).fromBytes(abyte0);
	//  404  869:aload_1         
	//  405  870:aload           4
	//  406  872:invokevirtual   #714 <Method void OpenSessionResponse.fromBytes(byte[])>
			if(!Arrays.equals(((OpenSessionResponse) (terminalinfo)).getTerminalRandom(), terminalRamdom))
	//* 407  875:aload_1         
	//* 408  876:invokevirtual   #717 <Method byte[] OpenSessionResponse.getTerminalRandom()>
	//* 409  879:aload_0         
	//* 410  880:getfield        #663 <Field byte[] terminalRamdom>
	//* 411  883:invokestatic    #225 <Method boolean Arrays.equals(byte[], byte[])>
	//* 412  886:ifne            900
				throw new OpenSessionException("\u7B7E\u5230\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u7684\u968F\u673A\u6570\u4E0D\u662F\u7EC8\u7AEF\u53D1\u51FA\u7684\u968F\u673A\u6570");
	//  413  889:new             #601 <Class OpenSessionException>
	//  414  892:dup             
	//  415  893:ldc2            #719 <String "\u7B7E\u5230\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u7684\u968F\u673A\u6570\u4E0D\u662F\u7EC8\u7AEF\u53D1\u51FA\u7684\u968F\u673A\u6570">
	//  416  896:invokespecial   #678 <Method void OpenSessionException(String)>
	//  417  899:athrow          
			sessionKey = ((OpenSessionResponse) (terminalinfo)).getSessionKey();
	//  418  900:aload_0         
	//  419  901:aload_1         
	//  420  902:invokevirtual   #722 <Method byte[] OpenSessionResponse.getSessionKey()>
	//  421  905:putfield        #107 <Field byte[] sessionKey>
			if(sessionKey != null)
	//* 422  908:aload_0         
	//* 423  909:getfield        #107 <Field byte[] sessionKey>
	//* 424  912:ifnull          932
			{
				int i = sessionKey.length;
	//  425  915:aload_0         
	//  426  916:getfield        #107 <Field byte[] sessionKey>
	//  427  919:arraylength     
	//  428  920:istore_3        
				((Object) (terminalinfo)).getClass();
	//  429  921:aload_1         
	//  430  922:invokevirtual   #160 <Method Class Object.getClass()>
	//  431  925:pop             
				if(i == 16)
					break label0;
	//  432  926:iload_3         
	//  433  927:bipush          16
	//  434  929:icmpeq          943
			}
			throw new OpenSessionException("\u7B7E\u5230\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u7684\u4F1A\u8BDD\u5BC6\u94A5\u65E0\u6548");
	//  435  932:new             #601 <Class OpenSessionException>
	//  436  935:dup             
	//  437  936:ldc2            #724 <String "\u7B7E\u5230\u65F6\uFF0C\u5E73\u53F0\u54CD\u5E94\u7684\u4F1A\u8BDD\u5BC6\u94A5\u65E0\u6548">
	//  438  939:invokespecial   #678 <Method void OpenSessionException(String)>
	//  439  942:athrow          
		}
		byte abyte1[] = ((OpenSessionResponse) (terminalinfo)).getSerialNumber();
	//  440  943:aload_1         
	//  441  944:invokevirtual   #726 <Method byte[] OpenSessionResponse.getSerialNumber()>
	//  442  947:astore          4
		serialNumber = FM_Bytes.bytesToLong(FM_Bytes.join(new byte[1], abyte1)) - 1L;
	//  443  949:aload_0         
	//  444  950:iconst_1        
	//  445  951:newarray        byte[]
	//  446  953:aload           4
	//  447  955:invokestatic    #367 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  448  958:invokestatic    #730 <Method long FM_Bytes.bytesToLong(byte[])>
	//  449  961:lconst_1        
	//  450  962:lsub            
	//  451  963:putfield        #123 <Field long serialNumber>
		sessionNumber = ((OpenSessionResponse) (terminalinfo)).getSessionNumber();
	//  452  966:aload_0         
	//  453  967:aload_1         
	//  454  968:invokevirtual   #731 <Method byte[] OpenSessionResponse.getSessionNumber()>
	//  455  971:putfield        #109 <Field byte[] sessionNumber>
		openSessionFlag = true;
	//  456  974:aload_0         
	//  457  975:iconst_1        
	//  458  976:putfield        #74  <Field boolean openSessionFlag>
		lastCalledTime4Session = System.currentTimeMillis();
	//  459  979:aload_0         
	//  460  980:invokestatic    #577 <Method long System.currentTimeMillis()>
	//  461  983:putfield        #90  <Field long lastCalledTime4Session>
		lastCalledTime4Connect = System.currentTimeMillis();
	//  462  986:aload_0         
	//  463  987:invokestatic    #577 <Method long System.currentTimeMillis()>
	//  464  990:putfield        #88  <Field long lastCalledTime4Connect>
		lastRequestData = null;
	//  465  993:aload_0         
	//  466  994:aconst_null     
	//  467  995:putfield        #408 <Field byte[] lastRequestData>
		return true;
	//  468  998:iconst_1        
	//  469  999:ireturn         
	}

	public void registerCommunicationNotify(CommunicationNotify communicationnotify)
	{
		communicationNotify = communicationnotify;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field CommunicationNotify communicationNotify>
	//    3    5:return          
	}

	public byte[] repeat()
		throws SocketException, CommunicationException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #101 <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #105 <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #78  <Field FMLog fmLog>
		setHandle(true);
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #738 <Method void setHandle(boolean)>
		Object obj;
		if(lastRequestData != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #408 <Field byte[] lastRequestData>
	//*  12   26:ifnull          171
			try
			{
				obj = ((Object) (send(dataLengthHandle.initDataSize(lastRequestData.length), lastRequestData)));
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #95  <Field DataLengthHandle dataLengthHandle>
	//   16   34:aload_0         
	//   17   35:getfield        #408 <Field byte[] lastRequestData>
	//   18   38:arraylength     
	//   19   39:invokeinterface #487 <Method byte[] DataLengthHandle.initDataSize(int)>
	//   20   44:aload_0         
	//   21   45:getfield        #408 <Field byte[] lastRequestData>
	//   22   48:invokespecial   #489 <Method byte[] send(byte[], byte[])>
	//   23   51:astore_1        
			}
	//*  24   52:goto            182
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  25   55:astore_1        
			{
				if(fmLog != null)
	//*  26   56:aload_0         
	//*  27   57:getfield        #78  <Field FMLog fmLog>
	//*  28   60:ifnull          96
					fmLog.error(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u53D1\u9001\u51FA\u73B0\u5F02\u5E38")).append(Util4Java.getExceptionInfo(((Exception) (obj)))).toString());
	//   29   63:aload_0         
	//   30   64:getfield        #78  <Field FMLog fmLog>
	//   31   67:aload_0         
	//   32   68:getfield        #86  <Field String logTag>
	//   33   71:new             #249 <Class StringBuilder>
	//   34   74:dup             
	//   35   75:ldc2            #740 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u53D1\u9001\u51FA\u73B0\u5F02\u5E38">
	//   36   78:invokespecial   #252 <Method void StringBuilder(String)>
	//   37   81:aload_1         
	//   38   82:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//   39   85:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   40   88:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   41   91:invokeinterface #171 <Method void FMLog.error(String, String)>
				isConnect = false;
	//   42   96:aload_0         
	//   43   97:iconst_0        
	//   44   98:putfield        #72  <Field boolean isConnect>
				throw new SocketException(Util4Java.getExceptionInfo(((Exception) (obj))));
	//   45  101:new             #133 <Class SocketException>
	//   46  104:dup             
	//   47  105:aload_1         
	//   48  106:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//   49  109:invokespecial   #490 <Method void SocketException(String)>
	//   50  112:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  51  113:astore_1        
			{
				isConnect = false;
	//   52  114:aload_0         
	//   53  115:iconst_0        
	//   54  116:putfield        #72  <Field boolean isConnect>
				if(fmLog != null)
	//*  55  119:aload_0         
	//*  56  120:getfield        #78  <Field FMLog fmLog>
	//*  57  123:ifnull          159
					fmLog.warn(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u5F02\u6B65\u53D1\u9001\u51FA\u73B0\u5F02\u5E38")).append(Util4Java.getExceptionInfo(((Exception) (obj)))).toString());
	//   58  126:aload_0         
	//   59  127:getfield        #78  <Field FMLog fmLog>
	//   60  130:aload_0         
	//   61  131:getfield        #86  <Field String logTag>
	//   62  134:new             #249 <Class StringBuilder>
	//   63  137:dup             
	//   64  138:ldc2            #742 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u5F02\u6B65\u53D1\u9001\u51FA\u73B0\u5F02\u5E38">
	//   65  141:invokespecial   #252 <Method void StringBuilder(String)>
	//   66  144:aload_1         
	//   67  145:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//   68  148:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   69  151:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   70  154:invokeinterface #141 <Method void FMLog.warn(String, String)>
				throw new SocketException(Util4Java.getExceptionInfo(((Exception) (obj))));
	//   71  159:new             #133 <Class SocketException>
	//   72  162:dup             
	//   73  163:aload_1         
	//   74  164:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//   75  167:invokespecial   #490 <Method void SocketException(String)>
	//   76  170:athrow          
			}
		else
			throw new CommunicationException("\u6CA1\u6709\u9700\u8981\u91CD\u53D1\u7684\u6570\u636E");
	//   77  171:new             #131 <Class CommunicationException>
	//   78  174:dup             
	//   79  175:ldc2            #744 <String "\u6CA1\u6709\u9700\u8981\u91CD\u53D1\u7684\u6570\u636E">
	//   80  178:invokespecial   #144 <Method void CommunicationException(String)>
	//   81  181:athrow          
		lastRequestData = null;
	//   82  182:aload_0         
	//   83  183:aconst_null     
	//   84  184:putfield        #408 <Field byte[] lastRequestData>
		lastCalledTime4Session = System.currentTimeMillis();
	//   85  187:aload_0         
	//   86  188:invokestatic    #577 <Method long System.currentTimeMillis()>
	//   87  191:putfield        #90  <Field long lastCalledTime4Session>
		lastCalledTime4Connect = System.currentTimeMillis();
	//   88  194:aload_0         
	//   89  195:invokestatic    #577 <Method long System.currentTimeMillis()>
	//   90  198:putfield        #88  <Field long lastCalledTime4Connect>
		setHandle(false);
	//   91  201:aload_0         
	//   92  202:iconst_0        
	//   93  203:invokevirtual   #738 <Method void setHandle(boolean)>
		return responseHandle(((byte []) (obj)), false);
	//   94  206:aload_0         
	//   95  207:aload_1         
	//   96  208:iconst_0        
	//   97  209:invokespecial   #746 <Method byte[] responseHandle(byte[], boolean)>
	//   98  212:areturn         
	}

	public int repeatAsynchronous()
		throws InvalidParameterException
	{
		isSendBusinessData = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #70  <Field boolean isSendBusinessData>
		return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
	}

	public byte[] sendMessage(byte abyte0[])
		throws InvalidParameterException, SocketException, CommunicationException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #101 <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #105 <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #78  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #78  <Field FMLog fmLog>
	//*   9   21:ifnull          57
			fmLog.debug(logTag, (new StringBuilder("\u5F00\u59CB\u4E1A\u52A1\u8BF7\u6C42\u5904\u7406,message:")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//   10   24:aload_0         
	//   11   25:getfield        #78  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #86  <Field String logTag>
	//   14   32:new             #249 <Class StringBuilder>
	//   15   35:dup             
	//   16   36:ldc2            #750 <String "\u5F00\u59CB\u4E1A\u52A1\u8BF7\u6C42\u5904\u7406,message:">
	//   17   39:invokespecial   #252 <Method void StringBuilder(String)>
	//   18   42:aload_1         
	//   19   43:invokestatic    #305 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   20   46:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   22   52:invokeinterface #340 <Method void FMLog.debug(String, String)>
		if(abyte0 == null || abyte0.length < 1)
	//*  23   57:aload_1         
	//*  24   58:ifnull          67
	//*  25   61:aload_1         
	//*  26   62:arraylength     
	//*  27   63:iconst_1        
	//*  28   64:icmpge          101
		{
			if(fmLog != null)
	//*  29   67:aload_0         
	//*  30   68:getfield        #78  <Field FMLog fmLog>
	//*  31   71:ifnull          90
				fmLog.warn(logTag, "\u4E1A\u52A1\u8BF7\u6C42\u65F6\uFF0C\u4E1A\u52A1\u8BF7\u6C42\u6570\u636E\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//   32   74:aload_0         
	//   33   75:getfield        #78  <Field FMLog fmLog>
	//   34   78:aload_0         
	//   35   79:getfield        #86  <Field String logTag>
	//   36   82:ldc2            #752 <String "\u4E1A\u52A1\u8BF7\u6C42\u65F6\uFF0C\u4E1A\u52A1\u8BF7\u6C42\u6570\u636E\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//   37   85:invokeinterface #141 <Method void FMLog.warn(String, String)>
			throw new InvalidParameterException("\u4E1A\u52A1\u8BF7\u6C42\u65F6\uFF0C\u4E1A\u52A1\u8BF7\u6C42\u6570\u636E\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25");
	//   38   90:new             #416 <Class InvalidParameterException>
	//   39   93:dup             
	//   40   94:ldc2            #752 <String "\u4E1A\u52A1\u8BF7\u6C42\u65F6\uFF0C\u4E1A\u52A1\u8BF7\u6C42\u6570\u636E\u4E3A\u7A7A\uFF0C\u4E1A\u52A1\u5904\u7406\u5931\u8D25">
	//   41   97:invokespecial   #516 <Method void InvalidParameterException(String)>
	//   42  100:athrow          
		}
		ControlWord controlword = new ControlWord();
	//   43  101:new             #203 <Class ControlWord>
	//   44  104:dup             
	//   45  105:invokespecial   #423 <Method void ControlWord()>
	//   46  108:astore_2        
		controlword.setDirection(ControlWord.Direction.REQUEST);
	//   47  109:aload_2         
	//   48  110:getstatic       #426 <Field ControlWord$Direction ControlWord$Direction.REQUEST>
	//   49  113:invokevirtual   #429 <Method void ControlWord.setDirection(ControlWord$Direction)>
		controlword.setType(ControlWord.MessageType.BUSINESS);
	//   50  116:aload_2         
	//   51  117:getstatic       #755 <Field ControlWord$MessageType ControlWord$MessageType.BUSINESS>
	//   52  120:invokevirtual   #439 <Method void ControlWord.setType(ControlWord$MessageType)>
		MessageHead messagehead = new MessageHead();
	//   53  123:new             #186 <Class MessageHead>
	//   54  126:dup             
	//   55  127:invokespecial   #187 <Method void MessageHead()>
	//   56  130:astore_3        
		messagehead.setProtocolVersion((byte)17);
	//   57  131:aload_3         
	//   58  132:bipush          17
	//   59  134:invokevirtual   #455 <Method void MessageHead.setProtocolVersion(byte)>
		messagehead.setSecurityLevel(new byte[] {
			(byte)MessageHead.SecurityLevel.CIPHER.getValue(), (byte)cn.com.fmsh.communication.core.MessageHead.CheckType.MAC.getValue()
		});
	//   60  137:aload_3         
	//   61  138:iconst_2        
	//   62  139:newarray        byte[]
	//   63  141:dup             
	//   64  142:iconst_0        
	//   65  143:getstatic       #271 <Field MessageHead$SecurityLevel MessageHead$SecurityLevel.CIPHER>
	//   66  146:invokevirtual   #275 <Method int MessageHead$SecurityLevel.getValue()>
	//   67  149:int2byte        
	//   68  150:bastore         
	//   69  151:dup             
	//   70  152:iconst_1        
	//   71  153:getstatic       #281 <Field MessageHead$CheckType cn.com.fmsh.communication.core.MessageHead$CheckType.MAC>
	//   72  156:invokevirtual   #282 <Method int MessageHead$CheckType.getValue()>
	//   73  159:int2byte        
	//   74  160:bastore         
	//   75  161:invokevirtual   #468 <Method void MessageHead.setSecurityLevel(byte[])>
		messagehead.setControlWord(controlword);
	//   76  164:aload_3         
	//   77  165:aload_2         
	//   78  166:invokevirtual   #472 <Method void MessageHead.setControlWord(ControlWord)>
		generateNextSerialNumber();
	//   79  169:aload_0         
	//   80  170:invokespecial   #451 <Method void generateNextSerialNumber()>
		messagehead.setSerialNumber(nextSendSerialNumber);
	//   81  173:aload_3         
	//   82  174:aload_0         
	//   83  175:getfield        #127 <Field long nextSendSerialNumber>
	//   84  178:invokevirtual   #462 <Method void MessageHead.setSerialNumber(long)>
		messagehead.setSessionNumber(sessionNumber);
	//   85  181:aload_3         
	//   86  182:aload_0         
	//   87  183:getfield        #109 <Field byte[] sessionNumber>
	//   88  186:invokevirtual   #458 <Method void MessageHead.setSessionNumber(byte[])>
		byte abyte1[] = messagehead.toBytes();
	//   89  189:aload_3         
	//   90  190:invokevirtual   #478 <Method byte[] MessageHead.toBytes()>
	//   91  193:astore_2        
		abyte0 = FM_Bytes.bytePatch4Des(abyte0);
	//   92  194:aload_1         
	//   93  195:invokestatic    #758 <Method byte[] FM_Bytes.bytePatch4Des(byte[])>
	//   94  198:astore_1        
		abyte0 = FM_Bytes.join(abyte1, DES.encrypt4des3(sessionKey, abyte0));
	//   95  199:aload_2         
	//   96  200:aload_0         
	//   97  201:getfield        #107 <Field byte[] sessionKey>
	//   98  204:aload_1         
	//   99  205:invokestatic    #761 <Method byte[] DES.encrypt4des3(byte[], byte[])>
	//  100  208:invokestatic    #367 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  101  211:astore_1        
		abyte0 = FM_Bytes.join(abyte0, Arrays.copyOf(MAC.calculateMAC4DES(Arrays.copyOfRange(sessionKey, checkKeyStart, checkKeyEnd), new byte[8], abyte0), 4));
	//  102  212:aload_1         
	//  103  213:aload_0         
	//  104  214:getfield        #107 <Field byte[] sessionKey>
	//  105  217:aload_0         
	//  106  218:getfield        #66  <Field int checkKeyStart>
	//  107  221:aload_0         
	//  108  222:getfield        #68  <Field int checkKeyEnd>
	//  109  225:invokestatic    #291 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  110  228:bipush          8
	//  111  230:newarray        byte[]
	//  112  232:aload_1         
	//  113  233:invokestatic    #297 <Method byte[] MAC.calculateMAC4DES(byte[], byte[], byte[])>
	//  114  236:iconst_4        
	//  115  237:invokestatic    #193 <Method byte[] Arrays.copyOf(byte[], int)>
	//  116  240:invokestatic    #367 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  117  243:astore_1        
		lastRequestData = abyte0;
	//  118  244:aload_0         
	//  119  245:aload_1         
	//  120  246:putfield        #408 <Field byte[] lastRequestData>
		setHandle(true);
	//  121  249:aload_0         
	//  122  250:iconst_1        
	//  123  251:invokevirtual   #738 <Method void setHandle(boolean)>
		try
		{
			abyte0 = send(dataLengthHandle.initDataSize(abyte0.length), abyte0);
	//  124  254:aload_0         
	//  125  255:aload_0         
	//  126  256:getfield        #95  <Field DataLengthHandle dataLengthHandle>
	//  127  259:aload_1         
	//  128  260:arraylength     
	//  129  261:invokeinterface #487 <Method byte[] DataLengthHandle.initDataSize(int)>
	//  130  266:aload_1         
	//  131  267:invokespecial   #489 <Method byte[] send(byte[], byte[])>
	//  132  270:astore_1        
			break MISSING_BLOCK_LABEL_337;
	//  133  271:goto            337
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//  134  274:astore_1        
		if(fmLog != null)
	//* 135  275:aload_0         
	//* 136  276:getfield        #78  <Field FMLog fmLog>
	//* 137  279:ifnull          298
			fmLog.warn(logTag, "\u548C\u5E73\u53F0\u6570\u636E\u4EA4\u6362\u5F02\u5E38\uFF0C\u91CD\u65B0\u4EA4\u6362\u6570\u636E....");
	//  138  282:aload_0         
	//  139  283:getfield        #78  <Field FMLog fmLog>
	//  140  286:aload_0         
	//  141  287:getfield        #86  <Field String logTag>
	//  142  290:ldc2            #763 <String "\u548C\u5E73\u53F0\u6570\u636E\u4EA4\u6362\u5F02\u5E38\uFF0C\u91CD\u65B0\u4EA4\u6362\u6570\u636E....">
	//  143  293:invokeinterface #141 <Method void FMLog.warn(String, String)>
		isConnect = false;
	//  144  298:aload_0         
	//  145  299:iconst_0        
	//  146  300:putfield        #72  <Field boolean isConnect>
		throw new SocketException(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  147  303:new             #133 <Class SocketException>
	//  148  306:dup             
	//  149  307:aload_1         
	//  150  308:invokestatic    #396 <Method String Util4Java.getExceptionInfo(Exception)>
	//  151  311:invokespecial   #490 <Method void SocketException(String)>
	//  152  314:athrow          
		abyte0;
	//  153  315:astore_1        
		lastCalledTime4Session = System.currentTimeMillis();
	//  154  316:aload_0         
	//  155  317:invokestatic    #577 <Method long System.currentTimeMillis()>
	//  156  320:putfield        #90  <Field long lastCalledTime4Session>
		lastCalledTime4Connect = System.currentTimeMillis();
	//  157  323:aload_0         
	//  158  324:invokestatic    #577 <Method long System.currentTimeMillis()>
	//  159  327:putfield        #88  <Field long lastCalledTime4Connect>
		setHandle(false);
	//  160  330:aload_0         
	//  161  331:iconst_0        
	//  162  332:invokevirtual   #738 <Method void setHandle(boolean)>
		throw abyte0;
	//  163  335:aload_1         
	//  164  336:athrow          
		lastCalledTime4Session = System.currentTimeMillis();
	//  165  337:aload_0         
	//  166  338:invokestatic    #577 <Method long System.currentTimeMillis()>
	//  167  341:putfield        #90  <Field long lastCalledTime4Session>
		lastCalledTime4Connect = System.currentTimeMillis();
	//  168  344:aload_0         
	//  169  345:invokestatic    #577 <Method long System.currentTimeMillis()>
	//  170  348:putfield        #88  <Field long lastCalledTime4Connect>
		setHandle(false);
	//  171  351:aload_0         
	//  172  352:iconst_0        
	//  173  353:invokevirtual   #738 <Method void setHandle(boolean)>
		return responseHandle(abyte0, false);
	//  174  356:aload_0         
	//  175  357:aload_1         
	//  176  358:iconst_0        
	//  177  359:invokespecial   #746 <Method byte[] responseHandle(byte[], boolean)>
	//  178  362:areturn         
	}

	public int sendMessageAsynchronous(byte abyte0[])
		throws InvalidParameterException
	{
		asynchronousMessages.addFirst(((Object) (abyte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field LinkedList asynchronousMessages>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #769 <Method void LinkedList.addFirst(Object)>
		isSendBusinessData = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #70  <Field boolean isSendBusinessData>
		return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void setExceptionTryCount(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            5
		{
			return;
	//    2    4:return          
		} else
		{
			exceptionTryCount = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #58  <Field int exceptionTryCount>
			return;
	//    6   10:return          
		}
	}

	void setHandle(boolean flag)
	{
		isHandle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #595 <Field boolean isHandle>
	//    3    5:return          
	}

	public void setInterval4Heartbeat(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            5
		{
			return;
	//    2    4:return          
		} else
		{
			interval4Heartbeat = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #60  <Field int interval4Heartbeat>
			return;
	//    6   10:return          
		}
	}

	public void setTimeout(int i)
	{
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            9
			timeout = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #76  <Field int timeout>
	//    5    9:return          
	}

	private volatile LinkedList asynchronousMessages;
	private int checkKeyEnd;
	private int checkKeyStart;
	private CommunicationNotify communicationNotify;
	private DataLengthHandle dataLengthHandle;
	private int exceptionTryCount;
	private FMLog fmLog;
	private ReceiveHandler handler;
	private DataInputStream in;
	private int interval4Heartbeat;
	private volatile boolean isConnect;
	private volatile boolean isHandle;
	private boolean isHeartbeat;
	private volatile boolean isSendBusinessData;
	private volatile boolean isStop;
	private volatile long lastCalledTime4Connect;
	private volatile long lastCalledTime4Session;
	byte lastRequestData[];
	private Lock lock;
	private String logTag;
	private volatile long nextSendSerialNumber;
	private volatile boolean openSessionFlag;
	private DataOutputStream out;
	private volatile long serialNumber;
	private byte sessionKey[];
	private byte sessionNumber[];
	private Socket socket;
	private final int socketTimeoutDefault = 5000;
	private byte tempKey[];
	private byte terminalRamdom[];
	private int timeout;
}
