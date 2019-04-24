// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.core;

import cn.com.fmsh.communication.*;
import cn.com.fmsh.communication.core.LinkInfo;
import cn.com.fmsh.communication.core.TerminalInfo;
import cn.com.fmsh.communication.exception.CommunicationException;
import cn.com.fmsh.communication.exception.SocketException;
import cn.com.fmsh.communication.exception.session.CloseSessionException;
import cn.com.fmsh.communication.exception.session.OpenSessionException;
import cn.com.fmsh.communication.message.IMessageHandler;
import cn.com.fmsh.communication.message.MessageHandleFactory;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.exception.InvalidParameterException;
import cn.com.fmsh.script.*;
import cn.com.fmsh.tsm.business.LocalDataHandler;
import cn.com.fmsh.tsm.business.SocketExceptionHandler;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.algorithm.DES;
import cn.com.fmsh.util.algorithm.RSA;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

// Referenced classes of package cn.com.fmsh.tsm.business.core:
//			ConfigKeyManager, Configration, ConfigKey, ErrorCodeHandler, 
//			ApduFilterDataInitImpl

public class CardBusinessBasic
{

	public CardBusinessBasic()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		fmLog = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #52  <Field FMLog fmLog>
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class CardBusinessBasic>
	//    8   17:invokevirtual   #58  <Method String Class.getName()>
	//    9   20:putfield        #60  <Field String logTag>
	//   10   23:aload_0         
	//   11   24:sipush          1000
	//   12   27:putfield        #62  <Field int exceptionTimeout>
		config = null;
	//   13   30:aload_0         
	//   14   31:aconst_null     
	//   15   32:putfield        #64  <Field Configration config>
		scriptHandler = null;
	//   16   35:aload_0         
	//   17   36:aconst_null     
	//   18   37:putfield        #66  <Field ScriptHandler scriptHandler>
		configKeyManager = new ConfigKeyManager();
	//   19   40:aload_0         
	//   20   41:new             #68  <Class ConfigKeyManager>
	//   21   44:dup             
	//   22   45:invokespecial   #69  <Method void ConfigKeyManager()>
	//   23   48:putfield        #71  <Field ConfigKeyManager configKeyManager>
		terminalCommunicationList = CommunicationFactory.getTerminalCommunicationList();
	//   24   51:aload_0         
	//   25   52:invokestatic    #77  <Method TerminalCommunicationList CommunicationFactory.getTerminalCommunicationList()>
	//   26   55:putfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//   27   58:return          
	}

	private boolean connectHandle(String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		try
		{
			s = ((String) (connect(s)));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #88  <Method TerminalCommunication connect(String)>
	//    5    7:astore_1        
		}
	//*   6    8:goto            55
		catch(BusinessException businessexception)
	//*   7   11:astore_3        
		{
			s = ((String) (obj));
	//    8   12:aload_2         
	//    9   13:astore_1        
			if(fmLog != null)
	//*  10   14:aload_0         
	//*  11   15:getfield        #52  <Field FMLog fmLog>
	//*  12   18:ifnull          55
			{
				fmLog.warn(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u94FE\u63A5\u5931\u8D25:")).append(Util4Java.getExceptionInfo(((Exception) (businessexception)))).toString());
	//   13   21:aload_0         
	//   14   22:getfield        #52  <Field FMLog fmLog>
	//   15   25:aload_0         
	//   16   26:getfield        #60  <Field String logTag>
	//   17   29:new             #90  <Class StringBuilder>
	//   18   32:dup             
	//   19   33:ldc1            #92  <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u94FE\u63A5\u5931\u8D25:">
	//   20   35:invokespecial   #95  <Method void StringBuilder(String)>
	//   21   38:aload_3         
	//   22   39:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   23   42:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   25   48:invokeinterface #114 <Method void FMLog.warn(String, String)>
				s = ((String) (obj));
	//   26   53:aload_2         
	//   27   54:astore_1        
			}
		}
		return s != null;
	//   28   55:aload_1         
	//   29   56:ifnull          61
	//   30   59:iconst_1        
	//   31   60:ireturn         
	//   32   61:iconst_0        
	//   33   62:ireturn         
	}

	private BusinessException handleCommunicationException(CommunicationException communicationexception)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType communicationexceptiontype = communicationexception.getExceptionType();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//    4    6:astore_3        
		if(communicationexceptiontype != null);
	//    5    7:aload_3         
	//    6    8:ifnonnull       11
		if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_VERSION == communicationexceptiontype)
	//*   7   11:getstatic       #128 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_VERSION>
	//*   8   14:aload_3         
	//*   9   15:if_acmpne       25
			communicationexception = ((CommunicationException) (cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_version));
	//   10   18:getstatic       #134 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_version>
	//   11   21:astore_1        
		else
	//*  12   22:goto            136
		if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_FORMAT == communicationexceptiontype)
	//*  13   25:getstatic       #137 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_FORMAT>
	//*  14   28:aload_3         
	//*  15   29:if_acmpne       39
			communicationexception = ((CommunicationException) (cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_format));
	//   16   32:getstatic       #140 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_format>
	//   17   35:astore_1        
		else
	//*  18   36:goto            136
		if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.CHECK_FAILED == communicationexceptiontype)
	//*  19   39:getstatic       #143 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.CHECK_FAILED>
	//*  20   42:aload_3         
	//*  21   43:if_acmpne       53
			communicationexception = ((CommunicationException) (cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_verify));
	//   22   46:getstatic       #146 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_verify>
	//   23   49:astore_1        
		else
	//*  24   50:goto            136
		if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_CONTROL == communicationexceptiontype)
	//*  25   53:getstatic       #149 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_CONTROL>
	//*  26   56:aload_3         
	//*  27   57:if_acmpne       67
			communicationexception = ((CommunicationException) (cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_control));
	//   28   60:getstatic       #152 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_control>
	//   29   63:astore_1        
		else
	//*  30   64:goto            136
		if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_SESSION == communicationexceptiontype)
	//*  31   67:getstatic       #155 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_SESSION>
	//*  32   70:aload_3         
	//*  33   71:if_acmpne       81
			communicationexception = ((CommunicationException) (cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_session));
	//   34   74:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_session>
	//   35   77:astore_1        
		else
	//*  36   78:goto            136
		if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_SESSION_NUMBER == communicationexceptiontype)
	//*  37   81:getstatic       #161 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_SESSION_NUMBER>
	//*  38   84:aload_3         
	//*  39   85:if_acmpne       95
			communicationexception = ((CommunicationException) (cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_session_serial));
	//   40   88:getstatic       #164 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_session_serial>
	//   41   91:astore_1        
		else
	//*  42   92:goto            136
		if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_DIRECTION == communicationexceptiontype)
	//*  43   95:getstatic       #167 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_DIRECTION>
	//*  44   98:aload_3         
	//*  45   99:if_acmpne       109
			communicationexception = ((CommunicationException) (cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_direction));
	//   46  102:getstatic       #170 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_direction>
	//   47  105:astore_1        
		else
	//*  48  106:goto            136
		if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.NO_REPONSE == communicationexceptiontype)
	//*  49  109:getstatic       #173 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.NO_REPONSE>
	//*  50  112:aload_3         
	//*  51  113:if_acmpne       123
		{
			communicationexception = ((CommunicationException) (cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_response));
	//   52  116:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_response>
	//   53  119:astore_1        
		} else
	//*  54  120:goto            136
		{
			communicationexception = ((CommunicationException) (obj));
	//   55  123:aload_2         
	//   56  124:astore_1        
			if(cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_REPONSE == communicationexceptiontype)
	//*  57  125:getstatic       #179 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_REPONSE>
	//*  58  128:aload_3         
	//*  59  129:if_acmpne       136
				communicationexception = ((CommunicationException) (cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_response));
	//   60  132:getstatic       #176 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_response>
	//   61  135:astore_1        
		}
		return new BusinessException(communicationexceptiontype.getDescription(), ((cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage) (communicationexception)));
	//   62  136:new             #84  <Class BusinessException>
	//   63  139:dup             
	//   64  140:aload_3         
	//   65  141:invokevirtual   #182 <Method String cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.getDescription()>
	//   66  144:aload_1         
	//   67  145:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   68  148:areturn         
	}

	private byte[] repeat(boolean flag, String s)
		throws BusinessException
	{
		TerminalCommunication terminalcommunication;
		terminalcommunication = terminalCommunicationList.getTerminalCommunication(s);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//    2    4:aload_2         
	//    3    5:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//    4   10:astore_3        
		if(terminalcommunication == null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       58
		{
			if(fmLog != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #52  <Field FMLog fmLog>
	//*   9   19:ifnull          56
				fmLog.warn(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6\uFF0C\u83B7\u53D6\u5E73\u53F0\u901A\u4FE1\u5BF9\u8C61[")).append(s).append("]\u5931\u8D25").toString());
	//   10   22:aload_0         
	//   11   23:getfield        #52  <Field FMLog fmLog>
	//   12   26:aload_0         
	//   13   27:getfield        #60  <Field String logTag>
	//   14   30:new             #90  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:ldc1            #196 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6\uFF0C\u83B7\u53D6\u5E73\u53F0\u901A\u4FE1\u5BF9\u8C61[">
	//   17   36:invokespecial   #95  <Method void StringBuilder(String)>
	//   18   39:aload_2         
	//   19   40:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:ldc1            #198 <String "]\u5931\u8D25">
	//   21   45:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   23   51:invokeinterface #114 <Method void FMLog.warn(String, String)>
			return null;
	//   24   56:aconst_null     
	//   25   57:areturn         
		}
		byte abyte0[] = terminalcommunication.repeat();
	//   26   58:aload_3         
	//   27   59:invokeinterface #203 <Method byte[] TerminalCommunication.repeat()>
	//   28   64:astore_3        
		try
		{
			closeSessionHandle(s);
	//   29   65:aload_0         
	//   30   66:aload_2         
	//   31   67:invokevirtual   #206 <Method boolean closeSessionHandle(String)>
	//   32   70:pop             
			disconnect(s);
	//   33   71:aload_0         
	//   34   72:aload_2         
	//   35   73:invokevirtual   #209 <Method void disconnect(String)>
		}
	//*  36   76:aload_3         
	//*  37   77:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  38   78:astore_2        
		{
			throw new BusinessException("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_disconnect_fail);
	//   39   79:new             #84  <Class BusinessException>
	//   40   82:dup             
	//   41   83:ldc1            #211 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25">
	//   42   85:getstatic       #214 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_disconnect_fail>
	//   43   88:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   44   91:athrow          
		}
		return abyte0;
		Object obj;
		obj;
	//   45   92:astore_3        
		if(fmLog != null)
	//*  46   93:aload_0         
	//*  47   94:getfield        #52  <Field FMLog fmLog>
	//*  48   97:ifnull          115
			fmLog.warn(logTag, "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38");
	//   49  100:aload_0         
	//   50  101:getfield        #52  <Field FMLog fmLog>
	//   51  104:aload_0         
	//   52  105:getfield        #60  <Field String logTag>
	//   53  108:ldc1            #216 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38">
	//   54  110:invokeinterface #114 <Method void FMLog.warn(String, String)>
		obj = ((Object) (socketExceptionHandle(flag, s)));
	//   55  115:aload_0         
	//   56  116:iload_1         
	//   57  117:aload_2         
	//   58  118:invokevirtual   #218 <Method byte[] socketExceptionHandle(boolean, String)>
	//   59  121:astore_3        
		try
		{
			closeSessionHandle(s);
	//   60  122:aload_0         
	//   61  123:aload_2         
	//   62  124:invokevirtual   #206 <Method boolean closeSessionHandle(String)>
	//   63  127:pop             
			disconnect(s);
	//   64  128:aload_0         
	//   65  129:aload_2         
	//   66  130:invokevirtual   #209 <Method void disconnect(String)>
		}
	//*  67  133:aload_3         
	//*  68  134:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  69  135:astore_2        
		{
			throw new BusinessException("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_disconnect_fail);
	//   70  136:new             #84  <Class BusinessException>
	//   71  139:dup             
	//   72  140:ldc1            #211 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25">
	//   73  142:getstatic       #214 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_disconnect_fail>
	//   74  145:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   75  148:athrow          
		}
		return ((byte []) (obj));
		obj;
	//   76  149:astore_3        
		if(fmLog == null)
	//*  77  150:aload_0         
	//*  78  151:getfield        #52  <Field FMLog fmLog>
	//*  79  154:ifnonnull       167
			fmLog = LogFactory.getInstance().getLog();
	//   80  157:aload_0         
	//   81  158:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//   82  161:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//   83  164:putfield        #52  <Field FMLog fmLog>
		if(fmLog != null)
	//*  84  167:aload_0         
	//*  85  168:getfield        #52  <Field FMLog fmLog>
	//*  86  171:ifnull          209
			fmLog.warn(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6,\u5F02\u5E38\u4FE1\u606F\uFF1A")).append(((CommunicationException) (obj)).getExceptionType().getDescription()).toString());
	//   87  174:aload_0         
	//   88  175:getfield        #52  <Field FMLog fmLog>
	//   89  178:aload_0         
	//   90  179:getfield        #60  <Field String logTag>
	//   91  182:new             #90  <Class StringBuilder>
	//   92  185:dup             
	//   93  186:ldc1            #220 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6,\u5F02\u5E38\u4FE1\u606F\uFF1A">
	//   94  188:invokespecial   #95  <Method void StringBuilder(String)>
	//   95  191:aload_3         
	//   96  192:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//   97  195:invokevirtual   #182 <Method String cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.getDescription()>
	//   98  198:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   99  201:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  100  204:invokeinterface #114 <Method void FMLog.warn(String, String)>
		throw handleCommunicationException(((CommunicationException) (obj)));
	//  101  209:aload_0         
	//  102  210:aload_3         
	//  103  211:invokespecial   #222 <Method BusinessException handleCommunicationException(CommunicationException)>
	//  104  214:athrow          
		obj;
	//  105  215:astore_3        
		try
		{
			closeSessionHandle(s);
	//  106  216:aload_0         
	//  107  217:aload_2         
	//  108  218:invokevirtual   #206 <Method boolean closeSessionHandle(String)>
	//  109  221:pop             
			disconnect(s);
	//  110  222:aload_0         
	//  111  223:aload_2         
	//  112  224:invokevirtual   #209 <Method void disconnect(String)>
		}
	//* 113  227:goto            244
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 114  230:astore_2        
		{
			throw new BusinessException("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_disconnect_fail);
	//  115  231:new             #84  <Class BusinessException>
	//  116  234:dup             
	//  117  235:ldc1            #211 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25">
	//  118  237:getstatic       #214 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_disconnect_fail>
	//  119  240:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  120  243:athrow          
		}
		throw obj;
	//  121  244:aload_3         
	//  122  245:athrow          
	}

	public void businessFinish(boolean flag)
		throws BusinessException
	{
		if(flag && apduHandler != null)
	//*   0    0:iload_1         
	//*   1    1:ifeq            20
	//*   2    4:aload_0         
	//*   3    5:getfield        #227 <Field ApduHandler apduHandler>
	//*   4    8:ifnull          20
			apduHandler.close();
	//    5   11:aload_0         
	//    6   12:getfield        #227 <Field ApduHandler apduHandler>
	//    7   15:invokeinterface #232 <Method void ApduHandler.close()>
	//    8   20:return          
	}

	public void businessReady(String s, String s1)
		throws BusinessException
	{
		TerminalCommunication terminalcommunication1 = terminalCommunicationList.getTerminalCommunication(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//    2    4:aload_2         
	//    3    5:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//    4   10:astore          4
		if(terminalcommunication1 == null)
	//*   5   12:aload           4
	//*   6   14:ifnonnull       86
		{
			if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #52  <Field FMLog fmLog>
	//*   9   21:ifnull          56
				fmLog.warn(logTag, (new StringBuilder(String.valueOf(((Object) (s))))).append(" \u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25").toString());
	//   10   24:aload_0         
	//   11   25:getfield        #52  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #60  <Field String logTag>
	//   14   32:new             #90  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:aload_1         
	//   17   37:invokestatic    #239 <Method String String.valueOf(Object)>
	//   18   40:invokespecial   #95  <Method void StringBuilder(String)>
	//   19   43:ldc1            #241 <String " \u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25">
	//   20   45:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   21   48:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   22   51:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf(((Object) (s))))).append(" \u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail);
	//   23   56:new             #84  <Class BusinessException>
	//   24   59:dup             
	//   25   60:new             #90  <Class StringBuilder>
	//   26   63:dup             
	//   27   64:aload_1         
	//   28   65:invokestatic    #239 <Method String String.valueOf(Object)>
	//   29   68:invokespecial   #95  <Method void StringBuilder(String)>
	//   30   71:ldc1            #241 <String " \u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25">
	//   31   73:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   32   76:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   33   79:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//   34   82:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   85:athrow          
		}
		TerminalCommunication terminalcommunication = terminalcommunication1;
	//   36   86:aload           4
	//   37   88:astore_3        
		if(!terminalcommunication1.isConnect())
	//*  38   89:aload           4
	//*  39   91:invokeinterface #248 <Method boolean TerminalCommunication.isConnect()>
	//*  40   96:ifne            105
			terminalcommunication = connect(s1);
	//   41   99:aload_0         
	//   42  100:aload_2         
	//   43  101:invokevirtual   #88  <Method TerminalCommunication connect(String)>
	//   44  104:astore_3        
		if(!terminalcommunication.isConnect())
	//*  45  105:aload_3         
	//*  46  106:invokeinterface #248 <Method boolean TerminalCommunication.isConnect()>
	//*  47  111:ifne            183
		{
			if(fmLog != null)
	//*  48  114:aload_0         
	//*  49  115:getfield        #52  <Field FMLog fmLog>
	//*  50  118:ifnull          153
				fmLog.warn(logTag, (new StringBuilder(String.valueOf(((Object) (s))))).append(" \u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25").toString());
	//   51  121:aload_0         
	//   52  122:getfield        #52  <Field FMLog fmLog>
	//   53  125:aload_0         
	//   54  126:getfield        #60  <Field String logTag>
	//   55  129:new             #90  <Class StringBuilder>
	//   56  132:dup             
	//   57  133:aload_1         
	//   58  134:invokestatic    #239 <Method String String.valueOf(Object)>
	//   59  137:invokespecial   #95  <Method void StringBuilder(String)>
	//   60  140:ldc1            #241 <String " \u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25">
	//   61  142:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   62  145:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   63  148:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf(((Object) (s))))).append(" \u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail);
	//   64  153:new             #84  <Class BusinessException>
	//   65  156:dup             
	//   66  157:new             #90  <Class StringBuilder>
	//   67  160:dup             
	//   68  161:aload_1         
	//   69  162:invokestatic    #239 <Method String String.valueOf(Object)>
	//   70  165:invokespecial   #95  <Method void StringBuilder(String)>
	//   71  168:ldc1            #241 <String " \u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25">
	//   72  170:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   73  173:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   74  176:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//   75  179:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   76  182:athrow          
		}
		if(!isOpenSession(terminalcommunication) && !openSession(s1))
	//*  77  183:aload_0         
	//*  78  184:aload_3         
	//*  79  185:invokevirtual   #252 <Method boolean isOpenSession(TerminalCommunication)>
	//*  80  188:ifne            270
	//*  81  191:aload_0         
	//*  82  192:aload_2         
	//*  83  193:invokevirtual   #255 <Method boolean openSession(String)>
	//*  84  196:ifne            270
		{
			if(fmLog != null)
	//*  85  199:aload_0         
	//*  86  200:getfield        #52  <Field FMLog fmLog>
	//*  87  203:ifnull          239
				fmLog.warn(logTag, (new StringBuilder(String.valueOf(((Object) (s))))).append(" \u7EC8\u7AEF\u672A\u7B7E\u5230").toString());
	//   88  206:aload_0         
	//   89  207:getfield        #52  <Field FMLog fmLog>
	//   90  210:aload_0         
	//   91  211:getfield        #60  <Field String logTag>
	//   92  214:new             #90  <Class StringBuilder>
	//   93  217:dup             
	//   94  218:aload_1         
	//   95  219:invokestatic    #239 <Method String String.valueOf(Object)>
	//   96  222:invokespecial   #95  <Method void StringBuilder(String)>
	//   97  225:ldc2            #257 <String " \u7EC8\u7AEF\u672A\u7B7E\u5230">
	//   98  228:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   99  231:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  100  234:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException((new StringBuilder(String.valueOf(((Object) (s))))).append(" \u7EC8\u7AEF\u7B7E\u5230\u5931\u8D25").toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_sign_in_fail);
	//  101  239:new             #84  <Class BusinessException>
	//  102  242:dup             
	//  103  243:new             #90  <Class StringBuilder>
	//  104  246:dup             
	//  105  247:aload_1         
	//  106  248:invokestatic    #239 <Method String String.valueOf(Object)>
	//  107  251:invokespecial   #95  <Method void StringBuilder(String)>
	//  108  254:ldc2            #259 <String " \u7EC8\u7AEF\u7B7E\u5230\u5931\u8D25">
	//  109  257:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  110  260:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  111  263:getstatic       #262 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_sign_in_fail>
	//  112  266:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  113  269:athrow          
		} else
		{
			return;
	//  114  270:return          
		}
	}

	boolean closeSessionHandle(String s)
		throws BusinessException
	{
		s = ((String) (terminalCommunicationList.getTerminalCommunication(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//    4   10:astore_1        
		if(s != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          245
		{
			boolean flag;
			try
			{
				flag = ((TerminalCommunication) (s)).closeSession(((cn.com.fmsh.communication.core.CloseSessionRequest) (null)));
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokeinterface #270 <Method boolean TerminalCommunication.closeSession(cn.com.fmsh.communication.core.CloseSessionRequest)>
	//   10   22:istore_2        
			}
	//*  11   23:iload_2         
	//*  12   24:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  13   25:astore_1        
			{
				if(fmLog != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #52  <Field FMLog fmLog>
	//*  16   30:ifnull          66
					fmLog.error(logTag, (new StringBuilder("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u5931\u8D25 ")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//   17   33:aload_0         
	//   18   34:getfield        #52  <Field FMLog fmLog>
	//   19   37:aload_0         
	//   20   38:getfield        #60  <Field String logTag>
	//   21   41:new             #90  <Class StringBuilder>
	//   22   44:dup             
	//   23   45:ldc2            #272 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u5931\u8D25 ">
	//   24   48:invokespecial   #95  <Method void StringBuilder(String)>
	//   25   51:aload_1         
	//   26   52:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   27   55:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   29   61:invokeinterface #275 <Method void FMLog.error(String, String)>
				throw new BusinessException("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_sign_out_fail);
	//   30   66:new             #84  <Class BusinessException>
	//   31   69:dup             
	//   32   70:ldc2            #277 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u5931\u8D25">
	//   33   73:getstatic       #280 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_sign_out_fail>
	//   34   76:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   35   79:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  36   80:astore_1        
			{
				if(fmLog != null)
	//*  37   81:aload_0         
	//*  38   82:getfield        #52  <Field FMLog fmLog>
	//*  39   85:ifnull          121
					fmLog.error(logTag, (new StringBuilder("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u65F6\uFF0C\u4F20\u5165\u7684\u53C2\u6570\u65E0\u6548 ")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//   40   88:aload_0         
	//   41   89:getfield        #52  <Field FMLog fmLog>
	//   42   92:aload_0         
	//   43   93:getfield        #60  <Field String logTag>
	//   44   96:new             #90  <Class StringBuilder>
	//   45   99:dup             
	//   46  100:ldc2            #282 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u65F6\uFF0C\u4F20\u5165\u7684\u53C2\u6570\u65E0\u6548 ">
	//   47  103:invokespecial   #95  <Method void StringBuilder(String)>
	//   48  106:aload_1         
	//   49  107:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   50  110:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   51  113:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   52  116:invokeinterface #275 <Method void FMLog.error(String, String)>
				throw new BusinessException("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u65F6\uFF0C\u4F20\u5165\u7684\u53C2\u6570\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_sign_out_fail);
	//   53  121:new             #84  <Class BusinessException>
	//   54  124:dup             
	//   55  125:ldc2            #284 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u65F6\uFF0C\u4F20\u5165\u7684\u53C2\u6570\u65E0\u6548">
	//   56  128:getstatic       #280 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_sign_out_fail>
	//   57  131:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   58  134:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  59  135:astore_1        
			{
				if(fmLog != null)
	//*  60  136:aload_0         
	//*  61  137:getfield        #52  <Field FMLog fmLog>
	//*  62  140:ifnull          176
					fmLog.error(logTag, (new StringBuilder("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u65F6\uFF0C\u7F51\u7EDC\u51FA\u73B0\u5F02\u5E38 ")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//   63  143:aload_0         
	//   64  144:getfield        #52  <Field FMLog fmLog>
	//   65  147:aload_0         
	//   66  148:getfield        #60  <Field String logTag>
	//   67  151:new             #90  <Class StringBuilder>
	//   68  154:dup             
	//   69  155:ldc2            #286 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u65F6\uFF0C\u7F51\u7EDC\u51FA\u73B0\u5F02\u5E38 ">
	//   70  158:invokespecial   #95  <Method void StringBuilder(String)>
	//   71  161:aload_1         
	//   72  162:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   73  165:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   74  168:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   75  171:invokeinterface #275 <Method void FMLog.error(String, String)>
				throw new BusinessException("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u65F6\uFF0C\u7F51\u7EDC\u51FA\u73B0\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_sign_out_fail);
	//   76  176:new             #84  <Class BusinessException>
	//   77  179:dup             
	//   78  180:ldc2            #288 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u65F6\uFF0C\u7F51\u7EDC\u51FA\u73B0\u5F02\u5E38">
	//   79  183:getstatic       #280 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_sign_out_fail>
	//   80  186:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   81  189:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  82  190:astore_1        
			{
				if(fmLog != null)
	//*  83  191:aload_0         
	//*  84  192:getfield        #52  <Field FMLog fmLog>
	//*  85  195:ifnull          231
					fmLog.error(logTag, (new StringBuilder("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5904\u7406\u5F02\u5E38 ")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//   86  198:aload_0         
	//   87  199:getfield        #52  <Field FMLog fmLog>
	//   88  202:aload_0         
	//   89  203:getfield        #60  <Field String logTag>
	//   90  206:new             #90  <Class StringBuilder>
	//   91  209:dup             
	//   92  210:ldc2            #290 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5904\u7406\u5F02\u5E38 ">
	//   93  213:invokespecial   #95  <Method void StringBuilder(String)>
	//   94  216:aload_1         
	//   95  217:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   96  220:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   97  223:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   98  226:invokeinterface #275 <Method void FMLog.error(String, String)>
				throw new BusinessException("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5904\u7406\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_sign_out_fail);
	//   99  231:new             #84  <Class BusinessException>
	//  100  234:dup             
	//  101  235:ldc2            #292 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u9000\u8BF7\u6C42\u5904\u7406\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5904\u7406\u5F02\u5E38">
	//  102  238:getstatic       #280 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_sign_out_fail>
	//  103  241:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  104  244:athrow          
			}
			return flag;
		} else
		{
			return false;
	//  105  245:iconst_0        
	//  106  246:ireturn         
		}
	}

	byte[] communicationExceptionHandle(CommunicationException communicationexception, boolean flag, String s)
		throws BusinessException
	{
		if(communicationexception.getExceptionType() == cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.NO_REPONSE)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//*   2    4:getstatic       #173 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.NO_REPONSE>
	//*   3    7:if_acmpne       24
			throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_no_response, flag);
	//    4   10:aload_0         
	//    5   11:ldc2            #296 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD">
	//    6   14:getstatic       #299 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_no_response>
	//    7   17:iload_2         
	//    8   18:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		else
	//*   9   21:goto            222
		if(communicationexception.getExceptionType() == cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_REPONSE)
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//*  12   28:getstatic       #179 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_REPONSE>
	//*  13   31:if_acmpne       48
			throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_no_response, flag);
	//   14   34:aload_0         
	//   15   35:ldc2            #296 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD">
	//   16   38:getstatic       #299 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_no_response>
	//   17   41:iload_2         
	//   18   42:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		else
	//*  19   45:goto            222
		if(communicationexception.getExceptionType() == cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_SESSION)
	//*  20   48:aload_1         
	//*  21   49:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//*  22   52:getstatic       #155 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_SESSION>
	//*  23   55:if_acmpne       72
			throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_session, flag);
	//   24   58:aload_0         
	//   25   59:ldc2            #296 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD">
	//   26   62:getstatic       #158 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_session>
	//   27   65:iload_2         
	//   28   66:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		else
	//*  29   69:goto            222
		if(communicationexception.getExceptionType() == cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_SESSION_NUMBER)
	//*  30   72:aload_1         
	//*  31   73:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//*  32   76:getstatic       #161 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_SESSION_NUMBER>
	//*  33   79:if_acmpne       96
			throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD\u6D41\u6C34", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_session_serial, flag);
	//   34   82:aload_0         
	//   35   83:ldc2            #305 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD\u6D41\u6C34">
	//   36   86:getstatic       #164 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_session_serial>
	//   37   89:iload_2         
	//   38   90:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		else
	//*  39   93:goto            222
		if(communicationexception.getExceptionType() == cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.CHECK_FAILED)
	//*  40   96:aload_1         
	//*  41   97:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//*  42  100:getstatic       #143 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.CHECK_FAILED>
	//*  43  103:if_acmpne       120
			throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u62A5\u6587\u683C\u5F0F", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_format, flag);
	//   44  106:aload_0         
	//   45  107:ldc2            #307 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u62A5\u6587\u683C\u5F0F">
	//   46  110:getstatic       #140 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_format>
	//   47  113:iload_2         
	//   48  114:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		else
	//*  49  117:goto            222
		if(communicationexception.getExceptionType() == cn.com.fmsh.communication.exception.CommunicationException.CommunicationExceptionType.INVALID_FORMAT)
	//*  50  120:aload_1         
	//*  51  121:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//*  52  124:getstatic       #137 <Field cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.INVALID_FORMAT>
	//*  53  127:if_acmpne       144
		{
			throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_invalid_verify, flag);
	//   54  130:aload_0         
	//   55  131:ldc2            #296 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u65E0\u6548\u4F1A\u8BDD">
	//   56  134:getstatic       #146 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_invalid_verify>
	//   57  137:iload_2         
	//   58  138:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		} else
	//*  59  141:goto            222
		{
			if(fmLog != null)
	//*  60  144:aload_0         
	//*  61  145:getfield        #52  <Field FMLog fmLog>
	//*  62  148:ifnull          186
				fmLog.warn(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6,\u5F02\u5E38\u4FE1\u606F\uFF1A")).append(communicationexception.getExceptionType().getDescription()).toString());
	//   63  151:aload_0         
	//   64  152:getfield        #52  <Field FMLog fmLog>
	//   65  155:aload_0         
	//   66  156:getfield        #60  <Field String logTag>
	//   67  159:new             #90  <Class StringBuilder>
	//   68  162:dup             
	//   69  163:ldc1            #220 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6,\u5F02\u5E38\u4FE1\u606F\uFF1A">
	//   70  165:invokespecial   #95  <Method void StringBuilder(String)>
	//   71  168:aload_1         
	//   72  169:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//   73  172:invokevirtual   #182 <Method String cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.getDescription()>
	//   74  175:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   75  178:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   76  181:invokeinterface #114 <Method void FMLog.warn(String, String)>
			try
			{
				closeSessionHandle(s);
	//   77  186:aload_0         
	//   78  187:aload_3         
	//   79  188:invokevirtual   #206 <Method boolean closeSessionHandle(String)>
	//   80  191:pop             
				disconnect(s);
	//   81  192:aload_0         
	//   82  193:aload_3         
	//   83  194:invokevirtual   #209 <Method void disconnect(String)>
			}
	//*  84  197:goto            211
			// Misplaced declaration of an exception variable
			catch(CommunicationException communicationexception)
	//*  85  200:astore_1        
			{
				throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_disconnect_fail, flag);
	//   86  201:aload_0         
	//   87  202:ldc1            #211 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25">
	//   88  204:getstatic       #214 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_disconnect_fail>
	//   89  207:iload_2         
	//   90  208:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			}
			throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6,\u5F02\u5E38\u4FE1\u606F", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail, flag);
	//   91  211:aload_0         
	//   92  212:ldc2            #309 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u5904\u7406\u65F6,\u5F02\u5E38\u4FE1\u606F">
	//   93  215:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//   94  218:iload_2         
	//   95  219:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		return null;
	//   96  222:aconst_null     
	//   97  223:areturn         
	}

	public TerminalCommunication connect(String s)
		throws BusinessException
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #52  <Field FMLog fmLog>
		if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #52  <Field FMLog fmLog>
	//*   9   21:ifnull          60
			fmLog.info(logTag, (new StringBuilder("connect to ")).append(s).append("...").toString());
	//   10   24:aload_0         
	//   11   25:getfield        #52  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #60  <Field String logTag>
	//   14   32:new             #90  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:ldc2            #311 <String "connect to ">
	//   17   39:invokespecial   #95  <Method void StringBuilder(String)>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:ldc2            #313 <String "...">
	//   21   49:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   23   55:invokeinterface #316 <Method void FMLog.info(String, String)>
		if(config == null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #64  <Field Configration config>
	//*  26   64:ifnonnull       107
		{
			config = getConfigration();
	//   27   67:aload_0         
	//   28   68:aload_0         
	//   29   69:invokevirtual   #320 <Method Configration getConfigration()>
	//   30   72:putfield        #64  <Field Configration config>
			if(config == null)
	//*  31   75:aload_0         
	//*  32   76:getfield        #64  <Field Configration config>
	//*  33   79:ifnonnull       107
			{
				if(fmLog != null)
	//*  34   82:aload_0         
	//*  35   83:getfield        #52  <Field FMLog fmLog>
	//*  36   86:ifnull          105
					fmLog.warn(logTag, "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u52A0\u8F7D\u5E94\u7528\u914D\u7F6E\u6587\u4EF6\u5931\u8D25");
	//   37   89:aload_0         
	//   38   90:getfield        #52  <Field FMLog fmLog>
	//   39   93:aload_0         
	//   40   94:getfield        #60  <Field String logTag>
	//   41   97:ldc2            #322 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u52A0\u8F7D\u5E94\u7528\u914D\u7F6E\u6587\u4EF6\u5931\u8D25">
	//   42  100:invokeinterface #114 <Method void FMLog.warn(String, String)>
				return null;
	//   43  105:aconst_null     
	//   44  106:areturn         
			}
		}
		LinkInfo linkinfo = config.getLinkInfo(s);
	//   45  107:aload_0         
	//   46  108:getfield        #64  <Field Configration config>
	//   47  111:aload_1         
	//   48  112:invokevirtual   #328 <Method LinkInfo Configration.getLinkInfo(String)>
	//   49  115:astore_3        
		if(linkinfo == null)
	//*  50  116:aload_3         
	//*  51  117:ifnonnull       145
		{
			if(fmLog != null)
	//*  52  120:aload_0         
	//*  53  121:getfield        #52  <Field FMLog fmLog>
	//*  54  124:ifnull          143
				fmLog.warn(logTag, "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49\u8BE5\u5E73\u53F0\u4FE1\u606F");
	//   55  127:aload_0         
	//   56  128:getfield        #52  <Field FMLog fmLog>
	//   57  131:aload_0         
	//   58  132:getfield        #60  <Field String logTag>
	//   59  135:ldc2            #330 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49\u8BE5\u5E73\u53F0\u4FE1\u606F">
	//   60  138:invokeinterface #114 <Method void FMLog.warn(String, String)>
			return null;
	//   61  143:aconst_null     
	//   62  144:areturn         
		}
		s = ((String) (terminalCommunicationList.getTerminalCommunication(s)));
	//   63  145:aload_0         
	//   64  146:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//   65  149:aload_1         
	//   66  150:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//   67  155:astore_1        
		if(s == null)
	//*  68  156:aload_1         
	//*  69  157:ifnonnull       185
		{
			if(fmLog != null)
	//*  70  160:aload_0         
	//*  71  161:getfield        #52  <Field FMLog fmLog>
	//*  72  164:ifnull          183
				fmLog.warn(logTag, "\u83B7\u53D6\u901A\u4FE1\u5B9E\u4F8B\u5931\u8D25");
	//   73  167:aload_0         
	//   74  168:getfield        #52  <Field FMLog fmLog>
	//   75  171:aload_0         
	//   76  172:getfield        #60  <Field String logTag>
	//   77  175:ldc2            #332 <String "\u83B7\u53D6\u901A\u4FE1\u5B9E\u4F8B\u5931\u8D25">
	//   78  178:invokeinterface #114 <Method void FMLog.warn(String, String)>
			return null;
	//   79  183:aconst_null     
	//   80  184:areturn         
		}
		((TerminalCommunication) (s)).registerCommunicationNotify(communicationNotify);
	//   81  185:aload_1         
	//   82  186:aload_0         
	//   83  187:getfield        #334 <Field CommunicationNotify communicationNotify>
	//   84  190:invokeinterface #338 <Method void TerminalCommunication.registerCommunicationNotify(CommunicationNotify)>
		if(((TerminalCommunication) (s)).isConnect())
	//*  85  195:aload_1         
	//*  86  196:invokeinterface #248 <Method boolean TerminalCommunication.isConnect()>
	//*  87  201:ifeq            206
			return ((TerminalCommunication) (s));
	//   88  204:aload_1         
	//   89  205:areturn         
		boolean flag;
		try
		{
			flag = ((TerminalCommunication) (s)).connect(linkinfo);
	//   90  206:aload_1         
	//   91  207:aload_3         
	//   92  208:invokeinterface #341 <Method boolean TerminalCommunication.connect(LinkInfo)>
	//   93  213:istore_2        
		}
	//*  94  214:goto            329
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  95  217:astore_1        
		{
			if(fmLog != null)
	//*  96  218:aload_0         
	//*  97  219:getfield        #52  <Field FMLog fmLog>
	//*  98  222:ifnull          241
				fmLog.warn(logTag, "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u53C2\u6570\u65E0\u6548");
	//   99  225:aload_0         
	//  100  226:getfield        #52  <Field FMLog fmLog>
	//  101  229:aload_0         
	//  102  230:getfield        #60  <Field String logTag>
	//  103  233:ldc2            #343 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u4F20\u5165\u7684\u53C2\u6570\u65E0\u6548">
	//  104  236:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u94FE\u63A5\u5230\u5E73\u53F0\u65F6,\u4F20\u5165\u53C2\u6570\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_param_error);
	//  105  241:new             #84  <Class BusinessException>
	//  106  244:dup             
	//  107  245:ldc2            #345 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6,\u4F20\u5165\u53C2\u6570\u5F02\u5E38">
	//  108  248:getstatic       #348 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_param_error>
	//  109  251:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  110  254:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 111  255:astore_1        
		{
			if(fmLog != null)
	//* 112  256:aload_0         
	//* 113  257:getfield        #52  <Field FMLog fmLog>
	//* 114  260:ifnull          315
				fmLog.warn(logTag, (new StringBuilder("\u94FE\u63A5\u5230\u5E73\u53F0[")).append(linkinfo.getAddress()).append(":").append(linkinfo.getPort()).append("]\u65F6\uFF0C\u94FE\u63A5\u5931\u8D25").toString());
	//  115  263:aload_0         
	//  116  264:getfield        #52  <Field FMLog fmLog>
	//  117  267:aload_0         
	//  118  268:getfield        #60  <Field String logTag>
	//  119  271:new             #90  <Class StringBuilder>
	//  120  274:dup             
	//  121  275:ldc2            #350 <String "\u94FE\u63A5\u5230\u5E73\u53F0[">
	//  122  278:invokespecial   #95  <Method void StringBuilder(String)>
	//  123  281:aload_3         
	//  124  282:invokevirtual   #355 <Method String LinkInfo.getAddress()>
	//  125  285:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  126  288:ldc2            #357 <String ":">
	//  127  291:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  128  294:aload_3         
	//  129  295:invokevirtual   #361 <Method int LinkInfo.getPort()>
	//  130  298:invokevirtual   #364 <Method StringBuilder StringBuilder.append(int)>
	//  131  301:ldc2            #366 <String "]\u65F6\uFF0C\u94FE\u63A5\u5931\u8D25">
	//  132  304:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  133  307:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  134  310:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u94FE\u63A5\u5230\u5E73\u53F0\u51FA\u73B0\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail);
	//  135  315:new             #84  <Class BusinessException>
	//  136  318:dup             
	//  137  319:ldc2            #368 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u51FA\u73B0\u5F02\u5E38">
	//  138  322:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//  139  325:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  140  328:athrow          
		}
		if(!flag)
	//* 141  329:iload_2         
	//* 142  330:ifne            406
		{
			if(fmLog != null)
	//* 143  333:aload_0         
	//* 144  334:getfield        #52  <Field FMLog fmLog>
	//* 145  337:ifnull          392
				fmLog.warn(logTag, (new StringBuilder("\u94FE\u63A5\u5230\u5E73\u53F0[")).append(linkinfo.getAddress()).append(":").append(linkinfo.getPort()).append("]\u65F6\uFF0C\u94FE\u63A5\u5931\u8D25").toString());
	//  146  340:aload_0         
	//  147  341:getfield        #52  <Field FMLog fmLog>
	//  148  344:aload_0         
	//  149  345:getfield        #60  <Field String logTag>
	//  150  348:new             #90  <Class StringBuilder>
	//  151  351:dup             
	//  152  352:ldc2            #350 <String "\u94FE\u63A5\u5230\u5E73\u53F0[">
	//  153  355:invokespecial   #95  <Method void StringBuilder(String)>
	//  154  358:aload_3         
	//  155  359:invokevirtual   #355 <Method String LinkInfo.getAddress()>
	//  156  362:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  157  365:ldc2            #357 <String ":">
	//  158  368:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  159  371:aload_3         
	//  160  372:invokevirtual   #361 <Method int LinkInfo.getPort()>
	//  161  375:invokevirtual   #364 <Method StringBuilder StringBuilder.append(int)>
	//  162  378:ldc2            #366 <String "]\u65F6\uFF0C\u94FE\u63A5\u5931\u8D25">
	//  163  381:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  164  384:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  165  387:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u94FE\u63A5\u5230\u5E73\u53F0\u51FA\u73B0\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail);
	//  166  392:new             #84  <Class BusinessException>
	//  167  395:dup             
	//  168  396:ldc2            #368 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u51FA\u73B0\u5F02\u5E38">
	//  169  399:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//  170  402:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  171  405:athrow          
		} else
		{
			return ((TerminalCommunication) (s));
	//  172  406:aload_1         
	//  173  407:areturn         
		}
	}

	public InputStream decryptFile(String s)
		throws BusinessException
	{
		Object obj;
		byte abyte1[];
		byte abyte2[];
		byte abyte3[];
		obj = ((Object) (((Object)this).getClass().getResourceAsStream(s)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #378 <Method Class Object.getClass()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #381 <Method InputStream Class.getResourceAsStream(String)>
	//    4    8:astore_3        
		if(obj == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       69
		{
			if(fmLog != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #52  <Field FMLog fmLog>
	//*   9   17:ifnull          55
				fmLog.warn(logTag, (new StringBuilder("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u8BFB\u53D6[")).append(s).append("]\u5931\u8D25").toString());
	//   10   20:aload_0         
	//   11   21:getfield        #52  <Field FMLog fmLog>
	//   12   24:aload_0         
	//   13   25:getfield        #60  <Field String logTag>
	//   14   28:new             #90  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:ldc2            #383 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u8BFB\u53D6[">
	//   17   35:invokespecial   #95  <Method void StringBuilder(String)>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:ldc1            #198 <String "]\u5931\u8D25">
	//   21   44:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   23   50:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u5185\u5BB9\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_config_invaild_content);
	//   24   55:new             #84  <Class BusinessException>
	//   25   58:dup             
	//   26   59:ldc2            #385 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u5185\u5BB9\u65E0\u6548">
	//   27   62:getstatic       #388 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_config_invaild_content>
	//   28   65:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   29   68:athrow          
		}
		abyte1 = new byte[128];
	//   30   69:sipush          128
	//   31   72:newarray        byte[]
	//   32   74:astore          4
		abyte3 = new byte[512];
	//   33   76:sipush          512
	//   34   79:newarray        byte[]
	//   35   81:astore          6
		s = ((String) (new ByteArrayOutputStream()));
	//   36   83:new             #390 <Class ByteArrayOutputStream>
	//   37   86:dup             
	//   38   87:invokespecial   #391 <Method void ByteArrayOutputStream()>
	//   39   90:astore_1        
		abyte2 = new byte[1];
	//   40   91:iconst_1        
	//   41   92:newarray        byte[]
	//   42   94:astore          5
		((InputStream) (obj)).read(abyte2);
	//   43   96:aload_3         
	//   44   97:aload           5
	//   45   99:invokevirtual   #397 <Method int InputStream.read(byte[])>
	//   46  102:pop             
		if(((InputStream) (obj)).read(abyte1) < 128)
	//*  47  103:aload_3         
	//*  48  104:aload           4
	//*  49  106:invokevirtual   #397 <Method int InputStream.read(byte[])>
	//*  50  109:sipush          128
	//*  51  112:icmpge          169
		{
			if(fmLog == null)
	//*  52  115:aload_0         
	//*  53  116:getfield        #52  <Field FMLog fmLog>
	//*  54  119:ifnonnull       132
				fmLog = LogFactory.getInstance().getLog();
	//   55  122:aload_0         
	//   56  123:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//   57  126:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//   58  129:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//*  59  132:aload_0         
	//*  60  133:getfield        #52  <Field FMLog fmLog>
	//*  61  136:ifnull          155
				fmLog.warn(logTag, "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u5185\u5BB9\u65E0\u6548\uFF0C\u672A\u8BFB\u5230RAS\u52A0\u5BC6\u7684\u5BC6\u6587");
	//   62  139:aload_0         
	//   63  140:getfield        #52  <Field FMLog fmLog>
	//   64  143:aload_0         
	//   65  144:getfield        #60  <Field String logTag>
	//   66  147:ldc2            #399 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u5185\u5BB9\u65E0\u6548\uFF0C\u672A\u8BFB\u5230RAS\u52A0\u5BC6\u7684\u5BC6\u6587">
	//   67  150:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u5185\u5BB9\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_config_invaild_content);
	//   68  155:new             #84  <Class BusinessException>
	//   69  158:dup             
	//   70  159:ldc2            #385 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u5185\u5BB9\u65E0\u6548">
	//   71  162:getstatic       #388 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_config_invaild_content>
	//   72  165:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   73  168:athrow          
		}
_L1:
		int i = ((InputStream) (obj)).read(abyte3);
	//   74  169:aload_3         
	//   75  170:aload           6
	//   76  172:invokevirtual   #397 <Method int InputStream.read(byte[])>
	//   77  175:istore_2        
		if(i < 0)
	//*  78  176:iload_2         
	//*  79  177:ifge            183
			break MISSING_BLOCK_LABEL_342;
	//   80  180:goto            342
		((ByteArrayOutputStream) (s)).write(Arrays.copyOf(abyte3, i));
	//   81  183:aload_1         
	//   82  184:aload           6
	//   83  186:iload_2         
	//   84  187:invokestatic    #405 <Method byte[] Arrays.copyOf(byte[], int)>
	//   85  190:invokevirtual   #409 <Method void ByteArrayOutputStream.write(byte[])>
		  goto _L1
	//*  86  193:goto            169
		s;
	//   87  196:astore_1        
		if(fmLog == null)
	//*  88  197:aload_0         
	//*  89  198:getfield        #52  <Field FMLog fmLog>
	//*  90  201:ifnonnull       214
			fmLog = LogFactory.getInstance().getLog();
	//   91  204:aload_0         
	//   92  205:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//   93  208:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//   94  211:putfield        #52  <Field FMLog fmLog>
		if(fmLog != null)
	//*  95  214:aload_0         
	//*  96  215:getfield        #52  <Field FMLog fmLog>
	//*  97  218:ifnull          237
			fmLog.warn(logTag, "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6");
	//   98  221:aload_0         
	//   99  222:getfield        #52  <Field FMLog fmLog>
	//  100  225:aload_0         
	//  101  226:getfield        #60  <Field String logTag>
	//  102  229:ldc2            #411 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6">
	//  103  232:invokeinterface #114 <Method void FMLog.warn(String, String)>
		throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_load_config_fail);
	//  104  237:new             #84  <Class BusinessException>
	//  105  240:dup             
	//  106  241:ldc2            #411 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6">
	//  107  244:getstatic       #414 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_load_config_fail>
	//  108  247:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  109  250:athrow          
		s;
	//  110  251:astore_1        
		if(fmLog == null)
	//* 111  252:aload_0         
	//* 112  253:getfield        #52  <Field FMLog fmLog>
	//* 113  256:ifnonnull       269
			fmLog = LogFactory.getInstance().getLog();
	//  114  259:aload_0         
	//  115  260:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  116  263:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  117  266:putfield        #52  <Field FMLog fmLog>
		if(fmLog != null)
	//* 118  269:aload_0         
	//* 119  270:getfield        #52  <Field FMLog fmLog>
	//* 120  273:ifnull          309
			fmLog.warn(logTag, (new StringBuilder("\u8BFB\u53D6\u914D\u7F6E\u6587\u4EF6\u51FA\u73B0\u5F02\u5E38\uFF1A")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//  121  276:aload_0         
	//  122  277:getfield        #52  <Field FMLog fmLog>
	//  123  280:aload_0         
	//  124  281:getfield        #60  <Field String logTag>
	//  125  284:new             #90  <Class StringBuilder>
	//  126  287:dup             
	//  127  288:ldc2            #416 <String "\u8BFB\u53D6\u914D\u7F6E\u6587\u4EF6\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//  128  291:invokespecial   #95  <Method void StringBuilder(String)>
	//  129  294:aload_1         
	//  130  295:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//  131  298:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  132  301:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  133  304:invokeinterface #114 <Method void FMLog.warn(String, String)>
		throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_load_config_fail);
	//  134  309:new             #84  <Class BusinessException>
	//  135  312:dup             
	//  136  313:ldc2            #411 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6">
	//  137  316:getstatic       #414 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_load_config_fail>
	//  138  319:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  139  322:athrow          
		s;
	//  140  323:astore_1        
		if(obj != null)
	//* 141  324:aload_3         
	//* 142  325:ifnull          340
			try
			{
				((InputStream) (obj)).close();
	//  143  328:aload_3         
	//  144  329:invokevirtual   #417 <Method void InputStream.close()>
			}
	//* 145  332:goto            340
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 146  335:astore_3        
			{
				((IOException) (obj)).printStackTrace();
	//  147  336:aload_3         
	//  148  337:invokevirtual   #420 <Method void IOException.printStackTrace()>
			}
		throw s;
	//  149  340:aload_1         
	//  150  341:athrow          
		if(obj != null)
	//* 151  342:aload_3         
	//* 152  343:ifnull          358
			try
			{
				((InputStream) (obj)).close();
	//  153  346:aload_3         
	//  154  347:invokevirtual   #417 <Method void InputStream.close()>
			}
	//* 155  350:goto            358
			catch(IOException ioexception)
	//* 156  353:astore_3        
			{
				ioexception.printStackTrace();
	//  157  354:aload_3         
	//  158  355:invokevirtual   #420 <Method void IOException.printStackTrace()>
			}
		byte byte0 = abyte2[0];
	//  159  358:aload           5
	//  160  360:iconst_0        
	//  161  361:baload          
	//  162  362:istore_2        
		ioexception = ((IOException) (configKeyManager.getConfigKey(((int) (byte0)))));
	//  163  363:aload_0         
	//  164  364:getfield        #71  <Field ConfigKeyManager configKeyManager>
	//  165  367:iload_2         
	//  166  368:invokevirtual   #424 <Method ConfigKey ConfigKeyManager.getConfigKey(int)>
	//  167  371:astore_3        
		if(ioexception == null)
	//* 168  372:aload_3         
	//* 169  373:ifnonnull       430
		{
			if(fmLog == null)
	//* 170  376:aload_0         
	//* 171  377:getfield        #52  <Field FMLog fmLog>
	//* 172  380:ifnonnull       393
				fmLog = LogFactory.getInstance().getLog();
	//  173  383:aload_0         
	//  174  384:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  175  387:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  176  390:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 177  393:aload_0         
	//* 178  394:getfield        #52  <Field FMLog fmLog>
	//* 179  397:ifnull          416
				fmLog.warn(logTag, "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u5728\u914D\u7F6E\u6587\u4EF6\u5BC6\u94A5\u96C6\u5408\u4E2D\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6\u4F7F\u7528\u7684\u5BC6\u94A5");
	//  180  400:aload_0         
	//  181  401:getfield        #52  <Field FMLog fmLog>
	//  182  404:aload_0         
	//  183  405:getfield        #60  <Field String logTag>
	//  184  408:ldc2            #426 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u5728\u914D\u7F6E\u6587\u4EF6\u5BC6\u94A5\u96C6\u5408\u4E2D\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6\u4F7F\u7528\u7684\u5BC6\u94A5">
	//  185  411:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_config_invaild_content);
	//  186  416:new             #84  <Class BusinessException>
	//  187  419:dup             
	//  188  420:ldc2            #411 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6">
	//  189  423:getstatic       #388 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_config_invaild_content>
	//  190  426:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  191  429:athrow          
		}
		byte abyte0[] = RSA.decrtyByPrivate(((ConfigKey) (ioexception)).getPublicKey(), ((ConfigKey) (ioexception)).getPrivateKey(), abyte1, false);
	//  192  430:aload_3         
	//  193  431:invokevirtual   #431 <Method byte[] ConfigKey.getPublicKey()>
	//  194  434:aload_3         
	//  195  435:invokevirtual   #434 <Method byte[] ConfigKey.getPrivateKey()>
	//  196  438:aload           4
	//  197  440:iconst_0        
	//  198  441:invokestatic    #440 <Method byte[] RSA.decrtyByPrivate(byte[], byte[], byte[], boolean)>
	//  199  444:astore_3        
		if(abyte0 == null)
	//* 200  445:aload_3         
	//* 201  446:ifnonnull       503
		{
			if(fmLog == null)
	//* 202  449:aload_0         
	//* 203  450:getfield        #52  <Field FMLog fmLog>
	//* 204  453:ifnonnull       466
				fmLog = LogFactory.getInstance().getLog();
	//  205  456:aload_0         
	//  206  457:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  207  460:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  208  463:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 209  466:aload_0         
	//* 210  467:getfield        #52  <Field FMLog fmLog>
	//* 211  470:ifnull          489
				fmLog.warn(logTag, "\u914D\u7F6E\u6587\u4EF6\u6570\u636E\u65E0\u6548,RSA\u89E3\u5BC6\u5931\u8D25");
	//  212  473:aload_0         
	//  213  474:getfield        #52  <Field FMLog fmLog>
	//  214  477:aload_0         
	//  215  478:getfield        #60  <Field String logTag>
	//  216  481:ldc2            #442 <String "\u914D\u7F6E\u6587\u4EF6\u6570\u636E\u65E0\u6548,RSA\u89E3\u5BC6\u5931\u8D25">
	//  217  484:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_config_invaild_content);
	//  218  489:new             #84  <Class BusinessException>
	//  219  492:dup             
	//  220  493:ldc2            #411 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6">
	//  221  496:getstatic       #388 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_config_invaild_content>
	//  222  499:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  223  502:athrow          
		}
		if(abyte0.length < 36)
	//* 224  503:aload_3         
	//* 225  504:arraylength     
	//* 226  505:bipush          36
	//* 227  507:icmpge          564
		{
			if(fmLog == null)
	//* 228  510:aload_0         
	//* 229  511:getfield        #52  <Field FMLog fmLog>
	//* 230  514:ifnonnull       527
				fmLog = LogFactory.getInstance().getLog();
	//  231  517:aload_0         
	//  232  518:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  233  521:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  234  524:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 235  527:aload_0         
	//* 236  528:getfield        #52  <Field FMLog fmLog>
	//* 237  531:ifnull          550
				fmLog.warn(logTag, "\u914D\u7F6E\u6587\u4EF6\u6570\u636E\u65E0\u6548,RSA\u89E3\u5BC6\u540E\u7684\u6570\u636E\u957F\u5EA6\u65E0\u6548");
	//  238  534:aload_0         
	//  239  535:getfield        #52  <Field FMLog fmLog>
	//  240  538:aload_0         
	//  241  539:getfield        #60  <Field String logTag>
	//  242  542:ldc2            #444 <String "\u914D\u7F6E\u6587\u4EF6\u6570\u636E\u65E0\u6548,RSA\u89E3\u5BC6\u540E\u7684\u6570\u636E\u957F\u5EA6\u65E0\u6548">
	//  243  545:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_config_invaild_content);
	//  244  550:new             #84  <Class BusinessException>
	//  245  553:dup             
	//  246  554:ldc2            #411 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6">
	//  247  557:getstatic       #388 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_config_invaild_content>
	//  248  560:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  249  563:athrow          
		} else
		{
			Arrays.copyOf(abyte0, 20);
	//  250  564:aload_3         
	//  251  565:bipush          20
	//  252  567:invokestatic    #405 <Method byte[] Arrays.copyOf(byte[], int)>
	//  253  570:pop             
			return ((InputStream) (new ByteArrayInputStream(FM_Bytes.byteRemovePatch4Des(DES.decrypt4des3(Arrays.copyOfRange(abyte0, 20, 36), ((ByteArrayOutputStream) (s)).toByteArray())))));
	//  254  571:new             #446 <Class ByteArrayInputStream>
	//  255  574:dup             
	//  256  575:aload_3         
	//  257  576:bipush          20
	//  258  578:bipush          36
	//  259  580:invokestatic    #450 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  260  583:aload_1         
	//  261  584:invokevirtual   #453 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  262  587:invokestatic    #459 <Method byte[] DES.decrypt4des3(byte[], byte[])>
	//  263  590:invokestatic    #465 <Method byte[] FM_Bytes.byteRemovePatch4Des(byte[])>
	//  264  593:invokespecial   #467 <Method void ByteArrayInputStream(byte[])>
	//  265  596:areturn         
		}
	}

	public void disconnect(String s)
		throws BusinessException
	{
		s = ((String) (terminalCommunicationList.getTerminalCommunication(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//    4   10:astore_1        
		if(s != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          92
		{
			try
			{
				((TerminalCommunication) (s)).disconnect();
	//    7   15:aload_1         
	//    8   16:invokeinterface #469 <Method boolean TerminalCommunication.disconnect()>
	//    9   21:pop             
				return;
	//   10   22:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//   11   23:astore_1        
			if(fmLog == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #52  <Field FMLog fmLog>
	//*  14   28:ifnonnull       41
				fmLog = LogFactory.getInstance().getLog();
	//   15   31:aload_0         
	//   16   32:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//   17   35:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//   18   38:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #52  <Field FMLog fmLog>
	//*  21   45:ifnull          81
				fmLog.warn(logTag, (new StringBuilder("\u5173\u95ED\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38\uFF1A")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//   22   48:aload_0         
	//   23   49:getfield        #52  <Field FMLog fmLog>
	//   24   52:aload_0         
	//   25   53:getfield        #60  <Field String logTag>
	//   26   56:new             #90  <Class StringBuilder>
	//   27   59:dup             
	//   28   60:ldc2            #471 <String "\u5173\u95ED\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//   29   63:invokespecial   #95  <Method void StringBuilder(String)>
	//   30   66:aload_1         
	//   31   67:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   32   70:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   34   76:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5173\u95ED\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38");
	//   35   81:new             #84  <Class BusinessException>
	//   36   84:dup             
	//   37   85:ldc2            #473 <String "\u5173\u95ED\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38">
	//   38   88:invokespecial   #474 <Method void BusinessException(String)>
	//   39   91:athrow          
		} else
		{
			return;
	//   40   92:return          
		}
	}

	public void disconnectAll()
		throws BusinessException
	{
		try
		{
			terminalCommunicationList.disConnect();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//    2    4:invokeinterface #478 <Method void TerminalCommunicationList.disConnect()>
			return;
	//    3    9:return          
		}
		catch(SocketException socketexception)
	//*   4   10:astore_1        
		{
			if(fmLog == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #52  <Field FMLog fmLog>
	//*   7   15:ifnonnull       28
				fmLog = LogFactory.getInstance().getLog();
	//    8   18:aload_0         
	//    9   19:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//   10   22:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//   11   25:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #52  <Field FMLog fmLog>
	//*  14   32:ifnull          68
				fmLog.warn(logTag, (new StringBuilder("\u5173\u95ED\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38\uFF1A")).append(Util4Java.getExceptionInfo(((Exception) (socketexception)))).toString());
	//   15   35:aload_0         
	//   16   36:getfield        #52  <Field FMLog fmLog>
	//   17   39:aload_0         
	//   18   40:getfield        #60  <Field String logTag>
	//   19   43:new             #90  <Class StringBuilder>
	//   20   46:dup             
	//   21   47:ldc2            #471 <String "\u5173\u95ED\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//   22   50:invokespecial   #95  <Method void StringBuilder(String)>
	//   23   53:aload_1         
	//   24   54:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   25   57:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   27   63:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u5173\u95ED\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38");
	//   28   68:new             #84  <Class BusinessException>
	//   29   71:dup             
	//   30   72:ldc2            #473 <String "\u5173\u95ED\u7EC8\u7AEF\u548C\u5E73\u53F0\u7684\u94FE\u63A5\u51FA\u73B0\u5F02\u5E38">
	//   31   75:invokespecial   #474 <Method void BusinessException(String)>
	//   32   78:athrow          
		}
	}

	public ApduHandler getApduHandler()
	{
		return apduHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field ApduHandler apduHandler>
	//    2    4:areturn         
	}

	public Configration getConfigration()
	{
		boolean flag;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(config != null)
			break MISSING_BLOCK_LABEL_85;
	//    2    2:aload_0         
	//    3    3:getfield        #64  <Field Configration config>
	//    4    6:ifnonnull       85
		InputStream inputstream;
		try
		{
			inputstream = decryptFile("/business.xml");
	//    5    9:aload_0         
	//    6   10:ldc2            #482 <String "/business.xml">
	//    7   13:invokevirtual   #484 <Method InputStream decryptFile(String)>
	//    8   16:astore_2        
		}
	//*   9   17:aload_2         
	//*  10   18:ifnull          56
	//*  11   21:aload_0         
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #488 <Method boolean loadDefine(InputStream)>
	//*  14   26:istore_1        
	//*  15   27:goto            56
		catch(BusinessException businessexception)
	//*  16   30:astore_2        
		{
			if(fmLog != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #52  <Field FMLog fmLog>
	//*  19   35:ifnull          54
				fmLog.warn(logTag, "\u811A\u672C\u89E3\u6790\u5668\u521D\u59CB\u5316\u65F6\uFF0C\u52A0\u8F7D\u5E94\u7528\u914D\u7F6E\u6587\u4EF6\u5931\u8D25");
	//   20   38:aload_0         
	//   21   39:getfield        #52  <Field FMLog fmLog>
	//   22   42:aload_0         
	//   23   43:getfield        #60  <Field String logTag>
	//   24   46:ldc2            #490 <String "\u811A\u672C\u89E3\u6790\u5668\u521D\u59CB\u5316\u65F6\uFF0C\u52A0\u8F7D\u5E94\u7528\u914D\u7F6E\u6587\u4EF6\u5931\u8D25">
	//   25   49:invokeinterface #114 <Method void FMLog.warn(String, String)>
			return null;
	//   26   54:aconst_null     
	//   27   55:areturn         
		}
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_56;
		flag = loadDefine(inputstream);
		if(!flag)
	//*  28   56:iload_1         
	//*  29   57:ifne            85
		{
			if(fmLog != null)
	//*  30   60:aload_0         
	//*  31   61:getfield        #52  <Field FMLog fmLog>
	//*  32   64:ifnull          83
				fmLog.warn(logTag, "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u52A0\u8F7D\u5E94\u7528\u914D\u7F6E\u6587\u4EF6\u5931\u8D25");
	//   33   67:aload_0         
	//   34   68:getfield        #52  <Field FMLog fmLog>
	//   35   71:aload_0         
	//   36   72:getfield        #60  <Field String logTag>
	//   37   75:ldc2            #322 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u52A0\u8F7D\u5E94\u7528\u914D\u7F6E\u6587\u4EF6\u5931\u8D25">
	//   38   78:invokeinterface #114 <Method void FMLog.warn(String, String)>
			return null;
	//   39   83:aconst_null     
	//   40   84:areturn         
		}
		return config;
	//   41   85:aload_0         
	//   42   86:getfield        #64  <Field Configration config>
	//   43   89:areturn         
	}

	public ErrorCodeHandler getErrorCodeHandler()
	{
		if(errorCodeHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #494 <Field ErrorCodeHandler errorCodeHandler>
	//*   2    4:ifnonnull       92
		{
			errorCodeHandler = new ErrorCodeHandler();
	//    3    7:aload_0         
	//    4    8:new             #496 <Class ErrorCodeHandler>
	//    5   11:dup             
	//    6   12:invokespecial   #497 <Method void ErrorCodeHandler()>
	//    7   15:putfield        #494 <Field ErrorCodeHandler errorCodeHandler>
			Object obj = null;
	//    8   18:aconst_null     
	//    9   19:astore_2        
			InputStream inputstream;
			try
			{
				inputstream = decryptFile("/code.properties");
	//   10   20:aload_0         
	//   11   21:ldc2            #499 <String "/code.properties">
	//   12   24:invokevirtual   #484 <Method InputStream decryptFile(String)>
	//   13   27:astore_1        
			}
	//*  14   28:goto            76
			catch(BusinessException businessexception)
	//*  15   31:astore_3        
			{
				inputstream = ((InputStream) (obj));
	//   16   32:aload_2         
	//   17   33:astore_1        
				if(fmLog != null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #52  <Field FMLog fmLog>
	//*  20   38:ifnull          76
				{
					fmLog.warn(logTag, (new StringBuilder("\u52A0\u8F7D\u5E73\u53F0\u54CD\u5E94\u8FC7\u6EE4\u5668\u51FA\u73B0\u5F02\u5E38:")).append(Util4Java.getExceptionInfo(((Exception) (businessexception)))).toString());
	//   21   41:aload_0         
	//   22   42:getfield        #52  <Field FMLog fmLog>
	//   23   45:aload_0         
	//   24   46:getfield        #60  <Field String logTag>
	//   25   49:new             #90  <Class StringBuilder>
	//   26   52:dup             
	//   27   53:ldc2            #501 <String "\u52A0\u8F7D\u5E73\u53F0\u54CD\u5E94\u8FC7\u6EE4\u5668\u51FA\u73B0\u5F02\u5E38:">
	//   28   56:invokespecial   #95  <Method void StringBuilder(String)>
	//   29   59:aload_3         
	//   30   60:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   31   63:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   33   69:invokeinterface #114 <Method void FMLog.warn(String, String)>
					inputstream = ((InputStream) (obj));
	//   34   74:aload_2         
	//   35   75:astore_1        
				}
			}
			if(!errorCodeHandler.init(inputstream))
	//*  36   76:aload_0         
	//*  37   77:getfield        #494 <Field ErrorCodeHandler errorCodeHandler>
	//*  38   80:aload_1         
	//*  39   81:invokevirtual   #504 <Method boolean ErrorCodeHandler.init(InputStream)>
	//*  40   84:ifne            92
				errorCodeHandler = null;
	//   41   87:aload_0         
	//   42   88:aconst_null     
	//   43   89:putfield        #494 <Field ErrorCodeHandler errorCodeHandler>
		}
		return errorCodeHandler;
	//   44   92:aload_0         
	//   45   93:getfield        #494 <Field ErrorCodeHandler errorCodeHandler>
	//   46   96:areturn         
	}

	public LocalDataHandler getLocalDataHandler()
	{
		return localDataHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #508 <Field LocalDataHandler localDataHandler>
	//    2    4:areturn         
	}

	public IMessageHandler getMessageHandler()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(messageHandler == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #512 <Field IMessageHandler messageHandler>
	//*   4    6:ifnonnull       123
		{
			Object obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_3        
			Object obj;
			try
			{
				obj = ((Object) (decryptFile("/message.xml")));
	//    7   11:aload_0         
	//    8   12:ldc2            #514 <String "/message.xml">
	//    9   15:invokevirtual   #484 <Method InputStream decryptFile(String)>
	//   10   18:astore_2        
			}
	//*  11   19:goto            67
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  12   22:astore_2        
			{
				if(fmLog == null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #52  <Field FMLog fmLog>
	//*  15   27:ifnonnull       40
					fmLog = LogFactory.getInstance().getLog();
	//   16   30:aload_0         
	//   17   31:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//   18   34:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//   19   37:putfield        #52  <Field FMLog fmLog>
				obj = ((Object) (obj1));
	//   20   40:aload_3         
	//   21   41:astore_2        
				if(fmLog != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #52  <Field FMLog fmLog>
	//*  24   46:ifnull          67
				{
					fmLog.warn(logTag, "\u83B7\u53D6\u6D88\u606F\u5904\u7406\u65F6\uFF0C\u52A0\u8F7D\u6D88\u606F\u914D\u7F6E\u6587\u4EF6\u5931\u8D25");
	//   25   49:aload_0         
	//   26   50:getfield        #52  <Field FMLog fmLog>
	//   27   53:aload_0         
	//   28   54:getfield        #60  <Field String logTag>
	//   29   57:ldc2            #516 <String "\u83B7\u53D6\u6D88\u606F\u5904\u7406\u65F6\uFF0C\u52A0\u8F7D\u6D88\u606F\u914D\u7F6E\u6587\u4EF6\u5931\u8D25">
	//   30   60:invokeinterface #114 <Method void FMLog.warn(String, String)>
					obj = ((Object) (obj1));
	//   31   65:aload_3         
	//   32   66:astore_2        
				}
			}
			if(obj != null)
	//*  33   67:aload_2         
	//*  34   68:ifnull          77
				flag = messageConfigLoad(((InputStream) (obj)));
	//   35   71:aload_0         
	//   36   72:aload_2         
	//   37   73:invokevirtual   #519 <Method boolean messageConfigLoad(InputStream)>
	//   38   76:istore_1        
			if(!flag)
	//*  39   77:iload_1         
	//*  40   78:ifne            123
			{
				if(fmLog == null)
	//*  41   81:aload_0         
	//*  42   82:getfield        #52  <Field FMLog fmLog>
	//*  43   85:ifnonnull       98
					fmLog = LogFactory.getInstance().getLog();
	//   44   88:aload_0         
	//   45   89:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//   46   92:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//   47   95:putfield        #52  <Field FMLog fmLog>
				if(fmLog != null)
	//*  48   98:aload_0         
	//*  49   99:getfield        #52  <Field FMLog fmLog>
	//*  50  102:ifnull          121
					fmLog.warn(logTag, "\u83B7\u53D6\u6D88\u606F\u5904\u7406\u65F6\uFF0C\u52A0\u8F7D\u6D88\u606F\u914D\u7F6E\u6587\u4EF6\u5931\u8D25");
	//   51  105:aload_0         
	//   52  106:getfield        #52  <Field FMLog fmLog>
	//   53  109:aload_0         
	//   54  110:getfield        #60  <Field String logTag>
	//   55  113:ldc2            #516 <String "\u83B7\u53D6\u6D88\u606F\u5904\u7406\u65F6\uFF0C\u52A0\u8F7D\u6D88\u606F\u914D\u7F6E\u6587\u4EF6\u5931\u8D25">
	//   56  116:invokeinterface #114 <Method void FMLog.warn(String, String)>
				return null;
	//   57  121:aconst_null     
	//   58  122:areturn         
			}
		}
		return messageHandler;
	//   59  123:aload_0         
	//   60  124:getfield        #512 <Field IMessageHandler messageHandler>
	//   61  127:areturn         
	}

	public ScriptHandler getScriptHandler()
	{
		if(config == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Configration config>
	//*   2    4:ifnonnull       47
		{
			config = getConfigration();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #320 <Method Configration getConfigration()>
	//    6   12:putfield        #64  <Field Configration config>
			if(config == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #64  <Field Configration config>
	//*   9   19:ifnonnull       47
			{
				if(fmLog != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #52  <Field FMLog fmLog>
	//*  12   26:ifnull          45
					fmLog.warn(logTag, "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u52A0\u8F7D\u5E94\u7528\u914D\u7F6E\u6587\u4EF6\u5931\u8D25");
	//   13   29:aload_0         
	//   14   30:getfield        #52  <Field FMLog fmLog>
	//   15   33:aload_0         
	//   16   34:getfield        #60  <Field String logTag>
	//   17   37:ldc2            #322 <String "\u94FE\u63A5\u5230\u5E73\u53F0\u65F6\uFF0C\u52A0\u8F7D\u5E94\u7528\u914D\u7F6E\u6587\u4EF6\u5931\u8D25">
	//   18   40:invokeinterface #114 <Method void FMLog.warn(String, String)>
				return null;
	//   19   45:aconst_null     
	//   20   46:areturn         
			}
		}
		if(scriptHandler == null)
	//*  21   47:aload_0         
	//*  22   48:getfield        #66  <Field ScriptHandler scriptHandler>
	//*  23   51:ifnonnull       96
		{
			scriptHandler = ScriptHandlerFactory.getInstance().getScriptHandler(getApduHandler());
	//   24   54:aload_0         
	//   25   55:invokestatic    #526 <Method ScriptHandlerFactory ScriptHandlerFactory.getInstance()>
	//   26   58:aload_0         
	//   27   59:invokevirtual   #528 <Method ApduHandler getApduHandler()>
	//   28   62:invokevirtual   #531 <Method ScriptHandler ScriptHandlerFactory.getScriptHandler(ApduHandler)>
	//   29   65:putfield        #66  <Field ScriptHandler scriptHandler>
			ApduFilterDataInitImpl apdufilterdatainitimpl = new ApduFilterDataInitImpl(config.getAids());
	//   30   68:new             #533 <Class ApduFilterDataInitImpl>
	//   31   71:dup             
	//   32   72:aload_0         
	//   33   73:getfield        #64  <Field Configration config>
	//   34   76:invokevirtual   #537 <Method byte[][] Configration.getAids()>
	//   35   79:invokespecial   #540 <Method void ApduFilterDataInitImpl(byte[][])>
	//   36   82:astore_1        
			scriptHandler.setApduFilterDataInit(((cn.com.fmsh.script.ApduFilterDataInit) (apdufilterdatainitimpl)));
	//   37   83:aload_0         
	//   38   84:getfield        #66  <Field ScriptHandler scriptHandler>
	//   39   87:aload_1         
	//   40   88:invokeinterface #546 <Method void ScriptHandler.setApduFilterDataInit(cn.com.fmsh.script.ApduFilterDataInit)>
		} else
	//*  41   93:goto            109
		{
			scriptHandler.setApduHandler(getApduHandler());
	//   42   96:aload_0         
	//   43   97:getfield        #66  <Field ScriptHandler scriptHandler>
	//   44  100:aload_0         
	//   45  101:invokevirtual   #528 <Method ApduHandler getApduHandler()>
	//   46  104:invokeinterface #550 <Method void ScriptHandler.setApduHandler(ApduHandler)>
		}
		return scriptHandler;
	//   47  109:aload_0         
	//   48  110:getfield        #66  <Field ScriptHandler scriptHandler>
	//   49  113:areturn         
	}

	public byte[] getSecurityCode()
	{
		return securityCode;
	//    0    0:aload_0         
	//    1    1:getfield        #553 <Field byte[] securityCode>
	//    2    4:areturn         
	}

	public String getServer4Business(int i)
	{
		return getConfigration().getServer4Business(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #320 <Method Configration getConfigration()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #557 <Method String Configration.getServer4Business(int)>
	//    4    8:areturn         
	}

	public SocketExceptionHandler getSocketExceptionHandler()
	{
		return socketExceptionHandle;
	//    0    0:aload_0         
	//    1    1:getfield        #561 <Field SocketExceptionHandler socketExceptionHandle>
	//    2    4:areturn         
	}

	public TerminalCommunication getTerminalCommunication(String s)
	{
		return terminalCommunicationList.getTerminalCommunication(s);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//    4   10:areturn         
	}

	public byte[] getTerminalNumber()
	{
		return terminalNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #564 <Field byte[] terminalNumber>
	//    2    4:areturn         
	}

	public byte[] interaction(byte abyte0[], String s, boolean flag, String s1)
		throws BusinessException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		TerminalCommunication terminalcommunication = terminalCommunicationList.getTerminalCommunication(s1);
	//    2    3:aload_0         
	//    3    4:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//    4    7:aload           4
	//    5    9:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//    6   14:astore          6
		if(terminalcommunication == null)
	//*   7   16:aload           6
	//*   8   18:ifnonnull       66
		{
			if(fmLog != null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #52  <Field FMLog fmLog>
	//*  11   25:ifnull          64
				fmLog.warn(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6,\u83B7\u53D6\u5E73\u53F0\u901A\u4FE1\u5BF9\u8C61[")).append(s1).append("]\u5931\u8D25").toString());
	//   12   28:aload_0         
	//   13   29:getfield        #52  <Field FMLog fmLog>
	//   14   32:aload_0         
	//   15   33:getfield        #60  <Field String logTag>
	//   16   36:new             #90  <Class StringBuilder>
	//   17   39:dup             
	//   18   40:ldc2            #568 <String "\u4E1A\u52A1\u5904\u7406\u65F6,\u83B7\u53D6\u5E73\u53F0\u901A\u4FE1\u5BF9\u8C61[">
	//   19   43:invokespecial   #95  <Method void StringBuilder(String)>
	//   20   46:aload           4
	//   21   48:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   22   51:ldc1            #198 <String "]\u5931\u8D25">
	//   23   53:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   25   59:invokeinterface #114 <Method void FMLog.warn(String, String)>
			return null;
	//   26   64:aconst_null     
	//   27   65:areturn         
		}
		try
		{
			abyte0 = terminalcommunication.sendMessage(abyte0);
	//   28   66:aload           6
	//   29   68:aload_1         
	//   30   69:invokeinterface #571 <Method byte[] TerminalCommunication.sendMessage(byte[])>
	//   31   74:astore_1        
		}
	//*  32   75:goto            304
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  33   78:astore_1        
		{
			if(fmLog == null)
	//*  34   79:aload_0         
	//*  35   80:getfield        #52  <Field FMLog fmLog>
	//*  36   83:ifnonnull       96
				fmLog = LogFactory.getInstance().getLog();
	//   37   86:aload_0         
	//   38   87:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//   39   90:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//   40   93:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//*  41   96:aload_0         
	//*  42   97:getfield        #52  <Field FMLog fmLog>
	//*  43  100:ifnull          143
				fmLog.error(logTag, (new StringBuilder(String.valueOf(((Object) (s))))).append(",\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0C\u53C2\u6570\u5F02\u5E38: ").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//   44  103:aload_0         
	//   45  104:getfield        #52  <Field FMLog fmLog>
	//   46  107:aload_0         
	//   47  108:getfield        #60  <Field String logTag>
	//   48  111:new             #90  <Class StringBuilder>
	//   49  114:dup             
	//   50  115:aload_2         
	//   51  116:invokestatic    #239 <Method String String.valueOf(Object)>
	//   52  119:invokespecial   #95  <Method void StringBuilder(String)>
	//   53  122:ldc2            #573 <String ",\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0C\u53C2\u6570\u5F02\u5E38: ">
	//   54  125:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   55  128:aload_1         
	//   56  129:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   57  132:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   58  135:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   59  138:invokeinterface #275 <Method void FMLog.error(String, String)>
			throwExceptionAndClose("\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0C\u53C2\u6570\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_request_param_error, flag);
	//   60  143:aload_0         
	//   61  144:ldc2            #575 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0C\u53C2\u6570\u5F02\u5E38">
	//   62  147:getstatic       #578 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_request_param_error>
	//   63  150:iload_3         
	//   64  151:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			abyte0 = ((byte []) (obj));
	//   65  154:aload           5
	//   66  156:astore_1        
		}
	//*  67  157:goto            304
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  68  160:astore_1        
		{
			if(fmLog == null)
	//*  69  161:aload_0         
	//*  70  162:getfield        #52  <Field FMLog fmLog>
	//*  71  165:ifnonnull       178
				fmLog = LogFactory.getInstance().getLog();
	//   72  168:aload_0         
	//   73  169:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//   74  172:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//   75  175:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//*  76  178:aload_0         
	//*  77  179:getfield        #52  <Field FMLog fmLog>
	//*  78  182:ifnull          225
				fmLog.error(logTag, (new StringBuilder(String.valueOf(((Object) (s))))).append(" \u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0CSocket\u901A\u4FE1\u5F02\u5E38: ").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//   79  185:aload_0         
	//   80  186:getfield        #52  <Field FMLog fmLog>
	//   81  189:aload_0         
	//   82  190:getfield        #60  <Field String logTag>
	//   83  193:new             #90  <Class StringBuilder>
	//   84  196:dup             
	//   85  197:aload_2         
	//   86  198:invokestatic    #239 <Method String String.valueOf(Object)>
	//   87  201:invokespecial   #95  <Method void StringBuilder(String)>
	//   88  204:ldc2            #580 <String " \u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0CSocket\u901A\u4FE1\u5F02\u5E38: ">
	//   89  207:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   90  210:aload_1         
	//   91  211:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   92  214:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   93  217:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   94  220:invokeinterface #275 <Method void FMLog.error(String, String)>
			throwExceptionAndClose("\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0CSocket\u901A\u4FE1\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail, flag);
	//   95  225:aload_0         
	//   96  226:ldc2            #582 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0CSocket\u901A\u4FE1\u5F02\u5E38">
	//   97  229:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//   98  232:iload_3         
	//   99  233:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			abyte0 = ((byte []) (obj));
	//  100  236:aload           5
	//  101  238:astore_1        
		}
	//* 102  239:goto            304
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 103  242:astore_1        
		{
			if(fmLog != null)
	//* 104  243:aload_0         
	//* 105  244:getfield        #52  <Field FMLog fmLog>
	//* 106  247:ifnull          290
				fmLog.error(logTag, (new StringBuilder(String.valueOf(((Object) (s))))).append(" \u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5F02\u5E38: ").append(Util4Java.getExceptionInfo(((Exception) (abyte0)))).toString());
	//  107  250:aload_0         
	//  108  251:getfield        #52  <Field FMLog fmLog>
	//  109  254:aload_0         
	//  110  255:getfield        #60  <Field String logTag>
	//  111  258:new             #90  <Class StringBuilder>
	//  112  261:dup             
	//  113  262:aload_2         
	//  114  263:invokestatic    #239 <Method String String.valueOf(Object)>
	//  115  266:invokespecial   #95  <Method void StringBuilder(String)>
	//  116  269:ldc2            #584 <String " \u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5F02\u5E38: ">
	//  117  272:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  118  275:aload_1         
	//  119  276:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//  120  279:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  121  282:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  122  285:invokeinterface #275 <Method void FMLog.error(String, String)>
			throwExceptionAndClose("\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0CSocket\u901A\u4FE1\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail, flag);
	//  123  290:aload_0         
	//  124  291:ldc2            #582 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0CSocket\u901A\u4FE1\u5F02\u5E38">
	//  125  294:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//  126  297:iload_3         
	//  127  298:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			abyte0 = ((byte []) (obj));
	//  128  301:aload           5
	//  129  303:astore_1        
		}
		if(abyte0 == null || abyte0.length < 2)
	//* 130  304:aload_1         
	//* 131  305:ifnull          314
	//* 132  308:aload_1         
	//* 133  309:arraylength     
	//* 134  310:iconst_2        
	//* 135  311:icmpge          365
		{
			if(fmLog == null)
	//* 136  314:aload_0         
	//* 137  315:getfield        #52  <Field FMLog fmLog>
	//* 138  318:ifnonnull       331
				fmLog = LogFactory.getInstance().getLog();
	//  139  321:aload_0         
	//  140  322:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  141  325:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  142  328:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 143  331:aload_0         
	//* 144  332:getfield        #52  <Field FMLog fmLog>
	//* 145  335:ifnull          354
				fmLog.warn(logTag, "\u5E73\u53F0\u5904\u7406\u4E1A\u52A1\u8BF7\u6C42\u5931\u8D25,\u672A\u6536\u5230\u5E73\u53F0\u54CD\u5E94\u6570\u636E");
	//  146  338:aload_0         
	//  147  339:getfield        #52  <Field FMLog fmLog>
	//  148  342:aload_0         
	//  149  343:getfield        #60  <Field String logTag>
	//  150  346:ldc2            #586 <String "\u5E73\u53F0\u5904\u7406\u4E1A\u52A1\u8BF7\u6C42\u5931\u8D25,\u672A\u6536\u5230\u5E73\u53F0\u54CD\u5E94\u6570\u636E">
	//  151  349:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throwExceptionAndClose("\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0C\u672A\u6536\u5230\u5E73\u53F0\u54CD\u5E94\u6570\u636E", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_no_response, flag);
	//  152  354:aload_0         
	//  153  355:ldc2            #588 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u8BF7\u6C42\u65F6\uFF0C\u672A\u6536\u5230\u5E73\u53F0\u54CD\u5E94\u6570\u636E">
	//  154  358:getstatic       #299 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_no_response>
	//  155  361:iload_3         
	//  156  362:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
		}
		return abyte0;
	//  157  365:aload_1         
	//  158  366:areturn         
	}

	boolean isConnect(String s)
	{
		s = ((String) (terminalCommunicationList.getTerminalCommunication(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//    4   10:astore_1        
		if(s == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		else
			return ((TerminalCommunication) (s)).isConnect();
	//    9   17:aload_1         
	//   10   18:invokeinterface #248 <Method boolean TerminalCommunication.isConnect()>
	//   11   23:ireturn         
	}

	boolean isOpenSession(TerminalCommunication terminalcommunication)
	{
		return terminalcommunication.isOpenSession();
	//    0    0:aload_1         
	//    1    1:invokeinterface #590 <Method boolean TerminalCommunication.isOpenSession()>
	//    2    6:ireturn         
	}

	public boolean loadDefine(InputStream inputstream)
		throws BusinessException
	{
		int i;
		int j;
		byte abyte0[];
		Object obj1;
		config = new Configration();
	//    0    0:aload_0         
	//    1    1:new             #324 <Class Configration>
	//    2    4:dup             
	//    3    5:invokespecial   #595 <Method void Configration()>
	//    4    8:putfield        #64  <Field Configration config>
		if(inputstream == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       26
			throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5931\u8D25");
	//    7   15:new             #84  <Class BusinessException>
	//    8   18:dup             
	//    9   19:ldc2            #597 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u5931\u8D25">
	//   10   22:invokespecial   #474 <Method void BusinessException(String)>
	//   11   25:athrow          
		Object obj = ((Object) (DocumentBuilderFactory.newInstance()));
	//   12   26:invokestatic    #603 <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//   13   29:astore          5
		int k;
		Object obj2;
		Object obj3;
		Object obj4;
		Node node;
		try
		{
			obj2 = ((Object) (((DocumentBuilderFactory) (obj)).newDocumentBuilder().parse(inputstream).getDocumentElement()));
	//   14   31:aload           5
	//   15   33:invokevirtual   #607 <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//   16   36:aload_1         
	//   17   37:invokevirtual   #613 <Method Document DocumentBuilder.parse(InputStream)>
	//   18   40:invokeinterface #619 <Method Element Document.getDocumentElement()>
	//   19   45:astore          7
			obj1 = ((Object) (((Element) (obj2)).getElementsByTagName("Server")));
	//   20   47:aload           7
	//   21   49:ldc2            #621 <String "Server">
	//   22   52:invokeinterface #627 <Method NodeList Element.getElementsByTagName(String)>
	//   23   57:astore          6
		}
	//*  24   59:iconst_0        
	//*  25   60:istore_2        
	//*  26   61:goto            216
	//*  27   64:aconst_null     
	//*  28   65:astore_1        
	//*  29   66:iconst_m1       
	//*  30   67:istore_3        
	//*  31   68:iconst_0        
	//*  32   69:istore          4
	//*  33   71:aconst_null     
	//*  34   72:astore          5
	//*  35   74:aload           6
	//*  36   76:iload_2         
	//*  37   77:invokeinterface #633 <Method Node NodeList.item(int)>
	//*  38   82:invokeinterface #639 <Method NamedNodeMap Node.getAttributes()>
	//*  39   87:astore          8
	//*  40   89:aload           8
	//*  41   91:ldc2            #641 <String "domain">
	//*  42   94:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//*  43   99:astore          9
	//*  44  101:aload           9
	//*  45  103:ifnull          114
	//*  46  106:aload           9
	//*  47  108:invokeinterface #650 <Method String Node.getNodeValue()>
	//*  48  113:astore_1        
	//*  49  114:aload           8
	//*  50  116:ldc2            #652 <String "serverName">
	//*  51  119:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//*  52  124:astore          9
	//*  53  126:aload           9
	//*  54  128:ifnull          140
	//*  55  131:aload           9
	//*  56  133:invokeinterface #650 <Method String Node.getNodeValue()>
	//*  57  138:astore          5
	//*  58  140:aload           8
	//*  59  142:ldc2            #654 <String "port">
	//*  60  145:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//*  61  150:astore          9
	//*  62  152:aload           9
	//*  63  154:ifnull          169
	//*  64  157:aload           9
	//*  65  159:invokeinterface #650 <Method String Node.getNodeValue()>
	//*  66  164:iconst_m1       
	//*  67  165:invokestatic    #658 <Method int Util4Java.String2Int(String, int)>
	//*  68  168:istore_3        
	//*  69  169:aload           8
	//*  70  171:ldc2            #660 <String "socketTimeout">
	//*  71  174:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//*  72  179:astore          8
	//*  73  181:aload           8
	//*  74  183:ifnull          199
	//*  75  186:aload           8
	//*  76  188:invokeinterface #650 <Method String Node.getNodeValue()>
	//*  77  193:iconst_0        
	//*  78  194:invokestatic    #658 <Method int Util4Java.String2Int(String, int)>
	//*  79  197:istore          4
	//*  80  199:aload_0         
	//*  81  200:getfield        #64  <Field Configration config>
	//*  82  203:aload_1         
	//*  83  204:iload_3         
	//*  84  205:iload           4
	//*  85  207:aload           5
	//*  86  209:invokevirtual   #664 <Method void Configration.addServers(String, int, int, String)>
	//*  87  212:iload_2         
	//*  88  213:iconst_1        
	//*  89  214:iadd            
	//*  90  215:istore_2        
	//*  91  216:iload_2         
	//*  92  217:aload           6
	//*  93  219:invokeinterface #667 <Method int NodeList.getLength()>
	//*  94  224:icmplt          64
	//*  95  227:aload           7
	//*  96  229:ldc2            #669 <String "Termianl">
	//*  97  232:invokeinterface #627 <Method NodeList Element.getElementsByTagName(String)>
	//*  98  237:iconst_0        
	//*  99  238:invokeinterface #633 <Method Node NodeList.item(int)>
	//* 100  243:invokeinterface #639 <Method NamedNodeMap Node.getAttributes()>
	//* 101  248:astore_1        
	//* 102  249:aload_1         
	//* 103  250:ldc2            #671 <String "type">
	//* 104  253:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 105  258:astore          5
	//* 106  260:aload           5
	//* 107  262:ifnull          282
	//* 108  265:aload_0         
	//* 109  266:getfield        #64  <Field Configration config>
	//* 110  269:aload           5
	//* 111  271:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 112  276:invokestatic    #675 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//* 113  279:invokevirtual   #678 <Method void Configration.setTerminalType(byte[])>
	//* 114  282:aload_1         
	//* 115  283:ldc2            #680 <String "businessVersion">
	//* 116  286:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 117  291:astore          5
	//* 118  293:aload           5
	//* 119  295:ifnull          312
	//* 120  298:aload_0         
	//* 121  299:getfield        #64  <Field Configration config>
	//* 122  302:aload           5
	//* 123  304:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 124  309:invokevirtual   #683 <Method void Configration.setBusinessVersion(String)>
	//* 125  312:aload_1         
	//* 126  313:ldc2            #685 <String "sdkVersion">
	//* 127  316:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 128  321:astore_1        
	//* 129  322:aload_1         
	//* 130  323:ifnull          339
	//* 131  326:aload_0         
	//* 132  327:getfield        #64  <Field Configration config>
	//* 133  330:aload_1         
	//* 134  331:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 135  336:invokevirtual   #688 <Method void Configration.setSdkVersion(String)>
	//* 136  339:aload           7
	//* 137  341:ldc2            #690 <String "OrderSource">
	//* 138  344:invokeinterface #627 <Method NodeList Element.getElementsByTagName(String)>
	//* 139  349:astore_1        
	//* 140  350:aload_1         
	//* 141  351:ifnull          457
	//* 142  354:aload_1         
	//* 143  355:iconst_0        
	//* 144  356:invokeinterface #633 <Method Node NodeList.item(int)>
	//* 145  361:astore_1        
	//* 146  362:aload_1         
	//* 147  363:ifnull          431
	//* 148  366:aload_1         
	//* 149  367:invokeinterface #639 <Method NamedNodeMap Node.getAttributes()>
	//* 150  372:ldc2            #692 <String "value">
	//* 151  375:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 152  380:astore_1        
	//* 153  381:aload_1         
	//* 154  382:ifnull          405
	//* 155  385:aload_0         
	//* 156  386:getfield        #64  <Field Configration config>
	//* 157  389:aload_1         
	//* 158  390:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 159  395:iconst_0        
	//* 160  396:invokestatic    #696 <Method byte Util4Java.String2Byte(String, byte)>
	//* 161  399:invokevirtual   #700 <Method void Configration.setOrderSource(byte)>
	//* 162  402:goto            480
	//* 163  405:aload_0         
	//* 164  406:getfield        #52  <Field FMLog fmLog>
	//* 165  409:ifnull          480
	//* 166  412:aload_0         
	//* 167  413:getfield        #52  <Field FMLog fmLog>
	//* 168  416:aload_0         
	//* 169  417:getfield        #60  <Field String logTag>
	//* 170  420:ldc2            #702 <String "\u914D\u7F6E\u6587\u4EF6\u4E2D\u8BA2\u5355\u6765\u6E90\u4E0D\u5305\u542B\u8BA2\u5355\u6765\u6E90\u503C\u7684\u6570\u636E\u9879">
	//* 171  423:invokeinterface #114 <Method void FMLog.warn(String, String)>
	//* 172  428:goto            480
	//* 173  431:aload_0         
	//* 174  432:getfield        #52  <Field FMLog fmLog>
	//* 175  435:ifnull          480
	//* 176  438:aload_0         
	//* 177  439:getfield        #52  <Field FMLog fmLog>
	//* 178  442:aload_0         
	//* 179  443:getfield        #60  <Field String logTag>
	//* 180  446:ldc2            #704 <String "\u914D\u7F6E\u6587\u4EF6\u4E2D\u8BA2\u5355\u6765\u6E90\u4E0D\u5305\u542B\u6570\u636E\u9879">
	//* 181  449:invokeinterface #114 <Method void FMLog.warn(String, String)>
	//* 182  454:goto            480
	//* 183  457:aload_0         
	//* 184  458:getfield        #52  <Field FMLog fmLog>
	//* 185  461:ifnull          480
	//* 186  464:aload_0         
	//* 187  465:getfield        #52  <Field FMLog fmLog>
	//* 188  468:aload_0         
	//* 189  469:getfield        #60  <Field String logTag>
	//* 190  472:ldc2            #706 <String "\u914D\u7F6E\u6587\u4EF6\u672A\u5B9A\u4E49\u8BA2\u5355\u6765\u6E90">
	//* 191  475:invokeinterface #114 <Method void FMLog.warn(String, String)>
	//* 192  480:aload           7
	//* 193  482:ldc2            #708 <String "CompanyCode">
	//* 194  485:invokeinterface #627 <Method NodeList Element.getElementsByTagName(String)>
	//* 195  490:astore_1        
	//* 196  491:aload_1         
	//* 197  492:ifnull          594
	//* 198  495:aload_1         
	//* 199  496:iconst_0        
	//* 200  497:invokeinterface #633 <Method Node NodeList.item(int)>
	//* 201  502:astore_1        
	//* 202  503:aload_1         
	//* 203  504:ifnull          568
	//* 204  507:aload_1         
	//* 205  508:invokeinterface #639 <Method NamedNodeMap Node.getAttributes()>
	//* 206  513:ldc2            #692 <String "value">
	//* 207  516:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 208  521:astore_1        
	//* 209  522:aload_1         
	//* 210  523:ifnull          542
	//* 211  526:aload_0         
	//* 212  527:getfield        #64  <Field Configration config>
	//* 213  530:aload_1         
	//* 214  531:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 215  536:invokevirtual   #711 <Method void Configration.setCompanyCode(String)>
	//* 216  539:goto            617
	//* 217  542:aload_0         
	//* 218  543:getfield        #52  <Field FMLog fmLog>
	//* 219  546:ifnull          617
	//* 220  549:aload_0         
	//* 221  550:getfield        #52  <Field FMLog fmLog>
	//* 222  553:aload_0         
	//* 223  554:getfield        #60  <Field String logTag>
	//* 224  557:ldc2            #713 <String "\u914D\u7F6E\u6587\u4EF6\u4E0D\u5305\u542B\u5382\u5546\u7F16\u7801\u4FE1\u606F">
	//* 225  560:invokeinterface #114 <Method void FMLog.warn(String, String)>
	//* 226  565:goto            617
	//* 227  568:aload_0         
	//* 228  569:getfield        #52  <Field FMLog fmLog>
	//* 229  572:ifnull          617
	//* 230  575:aload_0         
	//* 231  576:getfield        #52  <Field FMLog fmLog>
	//* 232  579:aload_0         
	//* 233  580:getfield        #60  <Field String logTag>
	//* 234  583:ldc2            #715 <String "\u914D\u7F6E\u6587\u4EF6\u5382\u5546\u7F16\u7801\u4FE1\u606F\u4E0D\u5305\u542B\u6570\u636E\u9879">
	//* 235  586:invokeinterface #114 <Method void FMLog.warn(String, String)>
	//* 236  591:goto            617
	//* 237  594:aload_0         
	//* 238  595:getfield        #52  <Field FMLog fmLog>
	//* 239  598:ifnull          617
	//* 240  601:aload_0         
	//* 241  602:getfield        #52  <Field FMLog fmLog>
	//* 242  605:aload_0         
	//* 243  606:getfield        #60  <Field String logTag>
	//* 244  609:ldc2            #717 <String "\u914D\u7F6E\u6587\u4EF6\u672A\u5B9A\u4E49\u5382\u5546\u7F16\u7801">
	//* 245  612:invokeinterface #114 <Method void FMLog.warn(String, String)>
	//* 246  617:aload           7
	//* 247  619:ldc2            #719 <String "Key">
	//* 248  622:invokeinterface #627 <Method NodeList Element.getElementsByTagName(String)>
	//* 249  627:astore          8
	//* 250  629:iconst_0        
	//* 251  630:istore_2        
	//* 252  631:goto            791
	//* 253  634:aload           8
	//* 254  636:iload_2         
	//* 255  637:invokeinterface #633 <Method Node NodeList.item(int)>
	//* 256  642:invokeinterface #639 <Method NamedNodeMap Node.getAttributes()>
	//* 257  647:astore          9
	//* 258  649:iconst_m1       
	//* 259  650:istore_3        
	//* 260  651:aconst_null     
	//* 261  652:astore_1        
	//* 262  653:aconst_null     
	//* 263  654:astore          5
	//* 264  656:ldc2            #721 <String "">
	//* 265  659:astore          6
	//* 266  661:aload           9
	//* 267  663:ldc2            #723 <String "index">
	//* 268  666:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 269  671:astore          10
	//* 270  673:aload           10
	//* 271  675:ifnull          689
	//* 272  678:aload           10
	//* 273  680:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 274  685:invokestatic    #729 <Method int Integer.parseInt(String)>
	//* 275  688:istore_3        
	//* 276  689:aload           9
	//* 277  691:ldc2            #731 <String "exponent">
	//* 278  694:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 279  699:astore          10
	//* 280  701:aload           10
	//* 281  703:ifnull          717
	//* 282  706:aload           10
	//* 283  708:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 284  713:invokestatic    #675 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//* 285  716:astore_1        
	//* 286  717:aload           9
	//* 287  719:ldc2            #733 <String "modulus">
	//* 288  722:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 289  727:astore          10
	//* 290  729:aload           10
	//* 291  731:ifnull          746
	//* 292  734:aload           10
	//* 293  736:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 294  741:invokestatic    #675 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//* 295  744:astore          5
	//* 296  746:aload           9
	//* 297  748:ldc2            #652 <String "serverName">
	//* 298  751:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 299  756:astore          9
	//* 300  758:aload           9
	//* 301  760:ifnull          1191
	//* 302  763:aload           9
	//* 303  765:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 304  770:astore          6
	//* 305  772:goto            1191
	//* 306  775:aload_0         
	//* 307  776:getfield        #64  <Field Configration config>
	//* 308  779:aload           6
	//* 309  781:iload_3         
	//* 310  782:aload_1         
	//* 311  783:aload           5
	//* 312  785:invokevirtual   #737 <Method void Configration.addKey(String, int, byte[], byte[])>
	//* 313  788:goto            1213
	//* 314  791:iload_2         
	//* 315  792:aload           8
	//* 316  794:invokeinterface #667 <Method int NodeList.getLength()>
	//* 317  799:icmplt          634
	//* 318  802:aload           7
	//* 319  804:ldc2            #739 <String "Aid">
	//* 320  807:invokeinterface #627 <Method NodeList Element.getElementsByTagName(String)>
	//* 321  812:astore_1        
	//* 322  813:iconst_0        
	//* 323  814:istore_2        
	//* 324  815:goto            865
	//* 325  818:aload_1         
	//* 326  819:iload_2         
	//* 327  820:invokeinterface #633 <Method Node NodeList.item(int)>
	//* 328  825:invokeinterface #639 <Method NamedNodeMap Node.getAttributes()>
	//* 329  830:ldc2            #692 <String "value">
	//* 330  833:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 331  838:astore          5
	//* 332  840:aload           5
	//* 333  842:ifnull          1220
	//* 334  845:aload_0         
	//* 335  846:getfield        #64  <Field Configration config>
	//* 336  849:aload           5
	//* 337  851:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 338  856:invokestatic    #675 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//* 339  859:invokevirtual   #742 <Method void Configration.addAid(byte[])>
	//* 340  862:goto            1220
	//* 341  865:iload_2         
	//* 342  866:aload_1         
	//* 343  867:invokeinterface #667 <Method int NodeList.getLength()>
	//* 344  872:icmplt          818
	//* 345  875:aload           7
	//* 346  877:ldc2            #744 <String "BusinessAndServer">
	//* 347  880:invokeinterface #627 <Method NodeList Element.getElementsByTagName(String)>
	//* 348  885:astore          5
	//* 349  887:aconst_null     
	//* 350  888:astore_1        
	//* 351  889:iconst_m1       
	//* 352  890:istore_2        
	//* 353  891:iconst_0        
	//* 354  892:istore_3        
	//* 355  893:goto            980
	//* 356  896:aload           5
	//* 357  898:iload_3         
	//* 358  899:invokeinterface #633 <Method Node NodeList.item(int)>
	//* 359  904:invokeinterface #639 <Method NamedNodeMap Node.getAttributes()>
	//* 360  909:astore          6
	//* 361  911:aload           6
	//* 362  913:ldc2            #652 <String "serverName">
	//* 363  916:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 364  921:astore          7
	//* 365  923:aload           7
	//* 366  925:ifnull          936
	//* 367  928:aload           7
	//* 368  930:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 369  935:astore_1        
	//* 370  936:aload           6
	//* 371  938:ldc2            #746 <String "businessName">
	//* 372  941:invokeinterface #647 <Method Node NamedNodeMap.getNamedItem(String)>
	//* 373  946:astore          6
	//* 374  948:aload           6
	//* 375  950:ifnull          1227
	//* 376  953:aload           6
	//* 377  955:invokeinterface #650 <Method String Node.getNodeValue()>
	//* 378  960:iconst_m1       
	//* 379  961:invokestatic    #658 <Method int Util4Java.String2Int(String, int)>
	//* 380  964:istore_2        
	//* 381  965:goto            1227
	//* 382  968:aload_0         
	//* 383  969:getfield        #64  <Field Configration config>
	//* 384  972:iload_2         
	//* 385  973:aload_1         
	//* 386  974:invokevirtual   #750 <Method void Configration.addBusinessAndServer(int, String)>
	//* 387  977:goto            1239
	//* 388  980:aload           5
	//* 389  982:invokeinterface #667 <Method int NodeList.getLength()>
	//* 390  987:istore          4
	//* 391  989:iload_3         
	//* 392  990:iload           4
	//* 393  992:icmplt          896
	//* 394  995:goto            1166
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//* 395  998:astore_1        
		{
			if(fmLog == null)
	//* 396  999:aload_0         
	//* 397 1000:getfield        #52  <Field FMLog fmLog>
	//* 398 1003:ifnonnull       1016
				fmLog = LogFactory.getInstance().getLog();
	//  399 1006:aload_0         
	//  400 1007:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  401 1010:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  402 1013:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 403 1016:aload_0         
	//* 404 1017:getfield        #52  <Field FMLog fmLog>
	//* 405 1020:ifnull          1040
				fmLog.error(logTag, Util4Java.getExceptionInfo(((Exception) (inputstream))));
	//  406 1023:aload_0         
	//  407 1024:getfield        #52  <Field FMLog fmLog>
	//  408 1027:aload_0         
	//  409 1028:getfield        #60  <Field String logTag>
	//  410 1031:aload_1         
	//  411 1032:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//  412 1035:invokeinterface #275 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_config_invaild_content);
	//  413 1040:new             #84  <Class BusinessException>
	//  414 1043:dup             
	//  415 1044:ldc2            #411 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6">
	//  416 1047:getstatic       #388 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_config_invaild_content>
	//  417 1050:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  418 1053:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//* 419 1054:astore_1        
		{
			if(fmLog == null)
	//* 420 1055:aload_0         
	//* 421 1056:getfield        #52  <Field FMLog fmLog>
	//* 422 1059:ifnonnull       1072
				fmLog = LogFactory.getInstance().getLog();
	//  423 1062:aload_0         
	//  424 1063:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  425 1066:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  426 1069:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 427 1072:aload_0         
	//* 428 1073:getfield        #52  <Field FMLog fmLog>
	//* 429 1076:ifnull          1096
				fmLog.error(logTag, Util4Java.getExceptionInfo(((Exception) (inputstream))));
	//  430 1079:aload_0         
	//  431 1080:getfield        #52  <Field FMLog fmLog>
	//  432 1083:aload_0         
	//  433 1084:getfield        #60  <Field String logTag>
	//  434 1087:aload_1         
	//  435 1088:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//  436 1091:invokeinterface #275 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_config_invaild_content);
	//  437 1096:new             #84  <Class BusinessException>
	//  438 1099:dup             
	//  439 1100:ldc2            #411 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6">
	//  440 1103:getstatic       #388 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_config_invaild_content>
	//  441 1106:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  442 1109:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//* 443 1110:astore_1        
		{
			if(fmLog == null)
	//* 444 1111:aload_0         
	//* 445 1112:getfield        #52  <Field FMLog fmLog>
	//* 446 1115:ifnonnull       1128
				fmLog = LogFactory.getInstance().getLog();
	//  447 1118:aload_0         
	//  448 1119:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  449 1122:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  450 1125:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 451 1128:aload_0         
	//* 452 1129:getfield        #52  <Field FMLog fmLog>
	//* 453 1132:ifnull          1152
				fmLog.error(logTag, Util4Java.getExceptionInfo(((Exception) (inputstream))));
	//  454 1135:aload_0         
	//  455 1136:getfield        #52  <Field FMLog fmLog>
	//  456 1139:aload_0         
	//  457 1140:getfield        #60  <Field String logTag>
	//  458 1143:aload_1         
	//  459 1144:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//  460 1147:invokeinterface #275 <Method void FMLog.error(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_app_config_invaild_content);
	//  461 1152:new             #84  <Class BusinessException>
	//  462 1155:dup             
	//  463 1156:ldc2            #411 <String "\u7EC8\u7AEF\u914D\u7F6E\u6587\u4EF6\u52A0\u8F7D\u65F6\uFF0C\u672A\u627E\u5230\u914D\u7F6E\u6587\u4EF6">
	//  464 1159:getstatic       #388 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_app_config_invaild_content>
	//  465 1162:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  466 1165:athrow          
		}
		i = 0;
		  goto _L1
_L3:
		inputstream = null;
		j = -1;
		k = 0;
		obj = null;
		obj3 = ((Object) (((NodeList) (obj1)).item(i).getAttributes()));
		obj4 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("domain")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_114;
		inputstream = ((InputStream) (((Node) (obj4)).getNodeValue()));
		obj4 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("serverName")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_140;
		obj = ((Object) (((Node) (obj4)).getNodeValue()));
		obj4 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("port")));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_169;
		j = Util4Java.String2Int(((Node) (obj4)).getNodeValue(), -1);
		obj3 = ((Object) (((NamedNodeMap) (obj3)).getNamedItem("socketTimeout")));
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_199;
		k = Util4Java.String2Int(((Node) (obj3)).getNodeValue(), 0);
		config.addServers(((String) (inputstream)), j, k, ((String) (obj)));
		i++;
_L1:
		if(i < ((NodeList) (obj1)).getLength()) goto _L3; else goto _L2
_L2:
		inputstream = ((InputStream) (((Element) (obj2)).getElementsByTagName("Termianl").item(0).getAttributes()));
		obj = ((Object) (((NamedNodeMap) (inputstream)).getNamedItem("type")));
		if(obj == null)
			break MISSING_BLOCK_LABEL_282;
		config.setTerminalType(FM_Bytes.hexStringToBytes(((Node) (obj)).getNodeValue()));
		obj = ((Object) (((NamedNodeMap) (inputstream)).getNamedItem("businessVersion")));
		if(obj == null)
			break MISSING_BLOCK_LABEL_312;
		config.setBusinessVersion(((Node) (obj)).getNodeValue());
		inputstream = ((InputStream) (((NamedNodeMap) (inputstream)).getNamedItem("sdkVersion")));
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_339;
		config.setSdkVersion(((Node) (inputstream)).getNodeValue());
		inputstream = ((InputStream) (((Element) (obj2)).getElementsByTagName("OrderSource")));
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_457;
		inputstream = ((InputStream) (((NodeList) (inputstream)).item(0)));
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_431;
		inputstream = ((InputStream) (((Node) (inputstream)).getAttributes().getNamedItem("value")));
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_405;
		config.setOrderSource(Util4Java.String2Byte(((Node) (inputstream)).getNodeValue(), (byte)0));
		break MISSING_BLOCK_LABEL_480;
		if(fmLog != null)
			fmLog.warn(logTag, "\u914D\u7F6E\u6587\u4EF6\u4E2D\u8BA2\u5355\u6765\u6E90\u4E0D\u5305\u542B\u8BA2\u5355\u6765\u6E90\u503C\u7684\u6570\u636E\u9879");
		break MISSING_BLOCK_LABEL_480;
		if(fmLog != null)
			fmLog.warn(logTag, "\u914D\u7F6E\u6587\u4EF6\u4E2D\u8BA2\u5355\u6765\u6E90\u4E0D\u5305\u542B\u6570\u636E\u9879");
		break MISSING_BLOCK_LABEL_480;
		if(fmLog != null)
			fmLog.warn(logTag, "\u914D\u7F6E\u6587\u4EF6\u672A\u5B9A\u4E49\u8BA2\u5355\u6765\u6E90");
		inputstream = ((InputStream) (((Element) (obj2)).getElementsByTagName("CompanyCode")));
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_594;
		inputstream = ((InputStream) (((NodeList) (inputstream)).item(0)));
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_568;
		inputstream = ((InputStream) (((Node) (inputstream)).getAttributes().getNamedItem("value")));
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_542;
		config.setCompanyCode(((Node) (inputstream)).getNodeValue());
		break MISSING_BLOCK_LABEL_617;
		if(fmLog != null)
			fmLog.warn(logTag, "\u914D\u7F6E\u6587\u4EF6\u4E0D\u5305\u542B\u5382\u5546\u7F16\u7801\u4FE1\u606F");
		break MISSING_BLOCK_LABEL_617;
		if(fmLog != null)
			fmLog.warn(logTag, "\u914D\u7F6E\u6587\u4EF6\u5382\u5546\u7F16\u7801\u4FE1\u606F\u4E0D\u5305\u542B\u6570\u636E\u9879");
		break MISSING_BLOCK_LABEL_617;
		if(fmLog != null)
			fmLog.warn(logTag, "\u914D\u7F6E\u6587\u4EF6\u672A\u5B9A\u4E49\u5382\u5546\u7F16\u7801");
		obj3 = ((Object) (((Element) (obj2)).getElementsByTagName("Key")));
		i = 0;
		  goto _L4
_L8:
		obj4 = ((Object) (((NodeList) (obj3)).item(i).getAttributes()));
		j = -1;
		inputstream = null;
		abyte0 = null;
		obj1 = "";
		node = ((NamedNodeMap) (obj4)).getNamedItem("index");
		if(node == null)
			break MISSING_BLOCK_LABEL_689;
		j = Integer.parseInt(node.getNodeValue());
		node = ((NamedNodeMap) (obj4)).getNamedItem("exponent");
		if(node == null)
			break MISSING_BLOCK_LABEL_717;
		inputstream = ((InputStream) (FM_Bytes.hexStringToBytes(node.getNodeValue())));
		node = ((NamedNodeMap) (obj4)).getNamedItem("modulus");
		if(node == null)
			break MISSING_BLOCK_LABEL_746;
		abyte0 = FM_Bytes.hexStringToBytes(node.getNodeValue());
		obj4 = ((Object) (((NamedNodeMap) (obj4)).getNamedItem("serverName")));
		if(obj4 == null) goto _L6; else goto _L5
_L5:
		obj1 = ((Object) (((Node) (obj4)).getNodeValue()));
		  goto _L6
_L19:
		config.addKey(((String) (obj1)), j, ((byte []) (inputstream)), abyte0);
		break; /* Loop/switch isn't completed */
_L4:
		if(i < ((NodeList) (obj3)).getLength()) goto _L8; else goto _L7
_L7:
		inputstream = ((InputStream) (((Element) (obj2)).getElementsByTagName("Aid")));
		i = 0;
		  goto _L9
_L13:
		abyte0 = ((byte []) (((NodeList) (inputstream)).item(i).getAttributes().getNamedItem("value")));
		if(abyte0 == null) goto _L11; else goto _L10
_L10:
		config.addAid(FM_Bytes.hexStringToBytes(((Node) (abyte0)).getNodeValue()));
		  goto _L11
_L9:
		if(i < ((NodeList) (inputstream)).getLength()) goto _L13; else goto _L12
_L12:
		abyte0 = ((byte []) (((Element) (obj2)).getElementsByTagName("BusinessAndServer")));
		inputstream = null;
		i = -1;
		j = 0;
		  goto _L14
_L18:
		obj1 = ((Object) (((NodeList) (abyte0)).item(j).getAttributes()));
		obj2 = ((Object) (((NamedNodeMap) (obj1)).getNamedItem("serverName")));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_936;
		inputstream = ((InputStream) (((Node) (obj2)).getNodeValue()));
		obj1 = ((Object) (((NamedNodeMap) (obj1)).getNamedItem("businessName")));
		if(obj1 == null) goto _L16; else goto _L15
_L15:
		i = Util4Java.String2Int(((Node) (obj1)).getNodeValue(), -1);
		  goto _L16
_L21:
		config.addBusinessAndServer(i, ((String) (inputstream)));
		break; /* Loop/switch isn't completed */
_L14:
		if(j < (k = ((NodeList) (abyte0)).getLength())) goto _L18; else goto _L17
_L17:
		if(fmLog != null)
	//* 467 1166:aload_0         
	//* 468 1167:getfield        #52  <Field FMLog fmLog>
	//* 469 1170:ifnull          1189
			fmLog.info(logTag, "load config sucess");
	//  470 1173:aload_0         
	//  471 1174:getfield        #52  <Field FMLog fmLog>
	//  472 1177:aload_0         
	//  473 1178:getfield        #60  <Field String logTag>
	//  474 1181:ldc2            #752 <String "load config sucess">
	//  475 1184:invokeinterface #316 <Method void FMLog.info(String, String)>
		return true;
	//  476 1189:iconst_1        
	//  477 1190:ireturn         
_L6:
		if(obj1 == null && (inputstream == null || abyte0 == null || j == -1)) goto _L20; else goto _L19
	//  478 1191:aload           6
	//  479 1193:ifnonnull       775
	//  480 1196:aload_1         
	//  481 1197:ifnull          1213
	//  482 1200:aload           5
	//  483 1202:ifnull          1213
	//  484 1205:iload_3         
	//  485 1206:iconst_m1       
	//  486 1207:icmpeq          1213
	//* 487 1210:goto            775
_L20:
		i++;
	//  488 1213:iload_2         
	//  489 1214:iconst_1        
	//  490 1215:iadd            
	//  491 1216:istore_2        
		  goto _L4
	//* 492 1217:goto            791
_L11:
		i++;
	//  493 1220:iload_2         
	//  494 1221:iconst_1        
	//  495 1222:iadd            
	//  496 1223:istore_2        
		  goto _L9
	//* 497 1224:goto            865
_L16:
		if(i == -1 && inputstream == null) goto _L22; else goto _L21
	//  498 1227:iload_2         
	//  499 1228:iconst_m1       
	//  500 1229:icmpne          968
	//  501 1232:aload_1         
	//  502 1233:ifnull          1239
	//* 503 1236:goto            968
_L22:
		j++;
	//  504 1239:iload_3         
	//  505 1240:iconst_1        
	//  506 1241:iadd            
	//  507 1242:istore_3        
		  goto _L14
	//* 508 1243:goto            980
	}

	public boolean messageConfigLoad(InputStream inputstream)
	{
		if(fmLog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field FMLog fmLog>
	//*   2    4:ifnonnull       17
			fmLog = LogFactory.getInstance().getLog();
	//    3    7:aload_0         
	//    4    8:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//    5   11:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//    6   14:putfield        #52  <Field FMLog fmLog>
		messageHandler = ((IMessageHandler) (MessageHandleFactory.getMessageHandler()));
	//    7   17:aload_0         
	//    8   18:invokestatic    #759 <Method cn.com.fmsh.communication.message.core.MessageHandler MessageHandleFactory.getMessageHandler()>
	//    9   21:putfield        #512 <Field IMessageHandler messageHandler>
		int i;
		try
		{
			i = messageHandler.loadDefine(inputstream);
	//   10   24:aload_0         
	//   11   25:getfield        #512 <Field IMessageHandler messageHandler>
	//   12   28:aload_1         
	//   13   29:invokeinterface #764 <Method int IMessageHandler.loadDefine(InputStream)>
	//   14   34:istore_2        
		}
	//*  15   35:goto            81
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  16   38:astore_1        
		{
			if(fmLog != null)
	//*  17   39:aload_0         
	//*  18   40:getfield        #52  <Field FMLog fmLog>
	//*  19   43:ifnull          79
				fmLog.error(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6D88\u606F\u89E3\u6790\u5668\u672A\u52A0\u8F7D\u914D\u7F6E\u51FA\u73B0\u5F02\u5E38\uFF1A")).append(Util4Java.getExceptionInfo(((Exception) (inputstream)))).toString());
	//   20   46:aload_0         
	//   21   47:getfield        #52  <Field FMLog fmLog>
	//   22   50:aload_0         
	//   23   51:getfield        #60  <Field String logTag>
	//   24   54:new             #90  <Class StringBuilder>
	//   25   57:dup             
	//   26   58:ldc2            #766 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6D88\u606F\u89E3\u6790\u5668\u672A\u52A0\u8F7D\u914D\u7F6E\u51FA\u73B0\u5F02\u5E38\uFF1A">
	//   27   61:invokespecial   #95  <Method void StringBuilder(String)>
	//   28   64:aload_1         
	//   29   65:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   30   68:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   31   71:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   32   74:invokeinterface #275 <Method void FMLog.error(String, String)>
			return false;
	//   33   79:iconst_0        
	//   34   80:ireturn         
		}
		if(i != 0)
	//*  35   81:iload_2         
	//*  36   82:ifeq            115
		{
			if(fmLog != null)
	//*  37   85:aload_0         
	//*  38   86:getfield        #52  <Field FMLog fmLog>
	//*  39   89:ifnull          108
				fmLog.warn(logTag, "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6D88\u606F\u89E3\u6790\u5668\u672A\u52A0\u8F7D\u914D\u7F6E\u6587\u4EF6\u5931\u8D25");
	//   40   92:aload_0         
	//   41   93:getfield        #52  <Field FMLog fmLog>
	//   42   96:aload_0         
	//   43   97:getfield        #60  <Field String logTag>
	//   44  100:ldc2            #768 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u6D88\u606F\u89E3\u6790\u5668\u672A\u52A0\u8F7D\u914D\u7F6E\u6587\u4EF6\u5931\u8D25">
	//   45  103:invokeinterface #114 <Method void FMLog.warn(String, String)>
			messageHandler = null;
	//   46  108:aload_0         
	//   47  109:aconst_null     
	//   48  110:putfield        #512 <Field IMessageHandler messageHandler>
			return false;
	//   49  113:iconst_0        
	//   50  114:ireturn         
		} else
		{
			return true;
	//   51  115:iconst_1        
	//   52  116:ireturn         
		}
	}

	boolean openSession(String s)
		throws BusinessException
	{
		TerminalCommunication terminalcommunication = terminalCommunicationList.getTerminalCommunication(s);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//    4   10:astore          4
		if(terminalcommunication == null)
	//*   5   12:aload           4
	//*   6   14:ifnonnull       54
		{
			if(fmLog != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #52  <Field FMLog fmLog>
	//*   9   21:ifnull          40
				fmLog.warn(logTag, "\u7B7E\u5230\u65F6\uFF0C\u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25");
	//   10   24:aload_0         
	//   11   25:getfield        #52  <Field FMLog fmLog>
	//   12   28:aload_0         
	//   13   29:getfield        #60  <Field String logTag>
	//   14   32:ldc2            #772 <String "\u7B7E\u5230\u65F6\uFF0C\u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25">
	//   15   35:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7B7E\u5230\u65F6\uFF0C\u94FE\u63A5\u5230\u5E73\u53F0\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail);
	//   16   40:new             #84  <Class BusinessException>
	//   17   43:dup             
	//   18   44:ldc2            #774 <String "\u7B7E\u5230\u65F6\uFF0C\u94FE\u63A5\u5230\u5E73\u53F0\u5931\u8D25">
	//   19   47:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//   20   50:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   21   53:athrow          
		}
		TerminalCommunication terminalcommunication1 = terminalcommunication;
	//   22   54:aload           4
	//   23   56:astore          5
		if(!terminalcommunication.isConnect())
	//*  24   58:aload           4
	//*  25   60:invokeinterface #248 <Method boolean TerminalCommunication.isConnect()>
	//*  26   65:ifne            75
			terminalcommunication1 = connect(s);
	//   27   68:aload_0         
	//   28   69:aload_1         
	//   29   70:invokevirtual   #88  <Method TerminalCommunication connect(String)>
	//   30   73:astore          5
		if(!terminalcommunication1.isConnect())
	//*  31   75:aload           5
	//*  32   77:invokeinterface #248 <Method boolean TerminalCommunication.isConnect()>
	//*  33   82:ifne            122
		{
			if(fmLog != null)
	//*  34   85:aload_0         
	//*  35   86:getfield        #52  <Field FMLog fmLog>
	//*  36   89:ifnull          108
				fmLog.warn(logTag, "\u7B7E\u5230\u65F6\uFF0C\u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25");
	//   37   92:aload_0         
	//   38   93:getfield        #52  <Field FMLog fmLog>
	//   39   96:aload_0         
	//   40   97:getfield        #60  <Field String logTag>
	//   41  100:ldc2            #772 <String "\u7B7E\u5230\u65F6\uFF0C\u7EC8\u7AEF\u8FDE\u63A5\u5230\u5E73\u53F0\u5931\u8D25">
	//   42  103:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7B7E\u5230\u65F6\uFF0C\u94FE\u63A5\u5230\u5E73\u53F0\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail);
	//   43  108:new             #84  <Class BusinessException>
	//   44  111:dup             
	//   45  112:ldc2            #774 <String "\u7B7E\u5230\u65F6\uFF0C\u94FE\u63A5\u5230\u5E73\u53F0\u5931\u8D25">
	//   46  115:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//   47  118:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   48  121:athrow          
		}
		TerminalInfo terminalinfo = new TerminalInfo();
	//   49  122:new             #776 <Class TerminalInfo>
	//   50  125:dup             
	//   51  126:invokespecial   #777 <Method void TerminalInfo()>
	//   52  129:astore          6
		s = ((String) (config.getKeys(s)));
	//   53  131:aload_0         
	//   54  132:getfield        #64  <Field Configration config>
	//   55  135:aload_1         
	//   56  136:invokevirtual   #781 <Method Configration$Key[] Configration.getKeys(String)>
	//   57  139:astore_1        
		if(s == null || s.length < 1)
	//*  58  140:aload_1         
	//*  59  141:ifnull          150
	//*  60  144:aload_1         
	//*  61  145:arraylength     
	//*  62  146:iconst_1        
	//*  63  147:icmpge          187
		{
			if(fmLog != null)
	//*  64  150:aload_0         
	//*  65  151:getfield        #52  <Field FMLog fmLog>
	//*  66  154:ifnull          173
				fmLog.warn(logTag, "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49\u5BC6\u94A5\u4FE1\u606F\uFF0C\u7B7E\u5230\u5931\u8D25");
	//   67  157:aload_0         
	//   68  158:getfield        #52  <Field FMLog fmLog>
	//   69  161:aload_0         
	//   70  162:getfield        #60  <Field String logTag>
	//   71  165:ldc2            #783 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49\u5BC6\u94A5\u4FE1\u606F\uFF0C\u7B7E\u5230\u5931\u8D25">
	//   72  168:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49\u5BC6\u94A5\u4FE1\u606F\uFF0C\u7B7E\u5230\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_no_key);
	//   73  173:new             #84  <Class BusinessException>
	//   74  176:dup             
	//   75  177:ldc2            #783 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u65F6\uFF0C\u914D\u7F6E\u6587\u4EF6\u4E2D\u672A\u5B9A\u4E49\u5BC6\u94A5\u4FE1\u606F\uFF0C\u7B7E\u5230\u5931\u8D25">
	//   76  180:getstatic       #786 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_no_key>
	//   77  183:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   78  186:athrow          
		}
		int i = 0;
	//   79  187:iconst_0        
	//   80  188:istore_2        
		if(s.length > 1)
	//*  81  189:aload_1         
	//*  82  190:arraylength     
	//*  83  191:iconst_1        
	//*  84  192:icmple          208
			i = (new Random()).nextInt(s.length);
	//   85  195:new             #788 <Class Random>
	//   86  198:dup             
	//   87  199:invokespecial   #789 <Method void Random()>
	//   88  202:aload_1         
	//   89  203:arraylength     
	//   90  204:invokevirtual   #793 <Method int Random.nextInt(int)>
	//   91  207:istore_2        
		terminalinfo.setKeyIndex((byte)((Configration.Key) (s[i])).index);
	//   92  208:aload           6
	//   93  210:aload_1         
	//   94  211:iload_2         
	//   95  212:aaload          
	//   96  213:getfield        #797 <Field int Configration$Key.index>
	//   97  216:int2byte        
	//   98  217:invokevirtual   #800 <Method void TerminalInfo.setKeyIndex(byte)>
		terminalinfo.setExponent(((Configration.Key) (s[i])).exponent);
	//   99  220:aload           6
	//  100  222:aload_1         
	//  101  223:iload_2         
	//  102  224:aaload          
	//  103  225:getfield        #802 <Field byte[] Configration$Key.exponent>
	//  104  228:invokevirtual   #805 <Method void TerminalInfo.setExponent(byte[])>
		terminalinfo.setModulus(((Configration.Key) (s[i])).modulus);
	//  105  231:aload           6
	//  106  233:aload_1         
	//  107  234:iload_2         
	//  108  235:aaload          
	//  109  236:getfield        #807 <Field byte[] Configration$Key.modulus>
	//  110  239:invokevirtual   #810 <Method void TerminalInfo.setModulus(byte[])>
		terminalinfo.setTerminalType(config.getTerminalType());
	//  111  242:aload           6
	//  112  244:aload_0         
	//  113  245:getfield        #64  <Field Configration config>
	//  114  248:invokevirtual   #813 <Method byte[] Configration.getTerminalType()>
	//  115  251:invokevirtual   #814 <Method void TerminalInfo.setTerminalType(byte[])>
		terminalinfo.setSecurityCode(securityCode);
	//  116  254:aload           6
	//  117  256:aload_0         
	//  118  257:getfield        #553 <Field byte[] securityCode>
	//  119  260:invokevirtual   #817 <Method void TerminalInfo.setSecurityCode(byte[])>
		if(config.getTerminalNumber() != null)
	//* 120  263:aload_0         
	//* 121  264:getfield        #64  <Field Configration config>
	//* 122  267:invokevirtual   #819 <Method byte[] Configration.getTerminalNumber()>
	//* 123  270:ifnull          282
			i = config.getTerminalNumber().length;
	//  124  273:aload_0         
	//  125  274:getfield        #64  <Field Configration config>
	//  126  277:invokevirtual   #819 <Method byte[] Configration.getTerminalNumber()>
	//  127  280:arraylength     
	//  128  281:istore_2        
		s = ((String) (mobileInfo));
	//  129  282:aload_0         
	//  130  283:getfield        #821 <Field byte[] mobileInfo>
	//  131  286:astore_1        
		if(s != null)
	//* 132  287:aload_1         
	//* 133  288:ifnull          423
		{
			byte abyte0[] = ((byte []) (s));
	//  134  291:aload_1         
	//  135  292:astore          4
			if(config.getSdkVersion() != null)
	//* 136  294:aload_0         
	//* 137  295:getfield        #64  <Field Configration config>
	//* 138  298:invokevirtual   #824 <Method String Configration.getSdkVersion()>
	//* 139  301:ifnull          357
			{
				abyte0 = ((byte []) (s));
	//  140  304:aload_1         
	//  141  305:astore          4
				if(config.getSdkVersion().length() > 0)
	//* 142  307:aload_0         
	//* 143  308:getfield        #64  <Field Configration config>
	//* 144  311:invokevirtual   #824 <Method String Configration.getSdkVersion()>
	//* 145  314:invokevirtual   #827 <Method int String.length()>
	//* 146  317:ifle            357
				{
					abyte0 = FM_Bytes.hexStringToBytes(config.getSdkVersion());
	//  147  320:aload_0         
	//  148  321:getfield        #64  <Field Configration config>
	//  149  324:invokevirtual   #824 <Method String Configration.getSdkVersion()>
	//  150  327:invokestatic    #675 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//  151  330:astore          4
					abyte0 = FM_Bytes.join(FM_Bytes.join(((byte []) (s)), new byte[] {
						4, (byte)abyte0.length
					}), abyte0);
	//  152  332:aload_1         
	//  153  333:iconst_2        
	//  154  334:newarray        byte[]
	//  155  336:dup             
	//  156  337:iconst_0        
	//  157  338:iconst_4        
	//  158  339:bastore         
	//  159  340:dup             
	//  160  341:iconst_1        
	//  161  342:aload           4
	//  162  344:arraylength     
	//  163  345:int2byte        
	//  164  346:bastore         
	//  165  347:invokestatic    #830 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  166  350:aload           4
	//  167  352:invokestatic    #830 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  168  355:astore          4
				}
			}
			s = ((String) (abyte0));
	//  169  357:aload           4
	//  170  359:astore_1        
			if(config.getBusinessVersion() != null)
	//* 171  360:aload_0         
	//* 172  361:getfield        #64  <Field Configration config>
	//* 173  364:invokevirtual   #833 <Method String Configration.getBusinessVersion()>
	//* 174  367:ifnull          545
			{
				s = ((String) (abyte0));
	//  175  370:aload           4
	//  176  372:astore_1        
				if(config.getBusinessVersion().length() > 0)
	//* 177  373:aload_0         
	//* 178  374:getfield        #64  <Field Configration config>
	//* 179  377:invokevirtual   #833 <Method String Configration.getBusinessVersion()>
	//* 180  380:invokevirtual   #827 <Method int String.length()>
	//* 181  383:ifle            545
				{
					s = ((String) (FM_Bytes.hexStringToBytes(config.getBusinessVersion())));
	//  182  386:aload_0         
	//  183  387:getfield        #64  <Field Configration config>
	//  184  390:invokevirtual   #833 <Method String Configration.getBusinessVersion()>
	//  185  393:invokestatic    #675 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//  186  396:astore_1        
					s = ((String) (FM_Bytes.join(FM_Bytes.join(abyte0, new byte[] {
						5, (byte)s.length
					}), ((byte []) (s)))));
	//  187  397:aload           4
	//  188  399:iconst_2        
	//  189  400:newarray        byte[]
	//  190  402:dup             
	//  191  403:iconst_0        
	//  192  404:iconst_5        
	//  193  405:bastore         
	//  194  406:dup             
	//  195  407:iconst_1        
	//  196  408:aload_1         
	//  197  409:arraylength     
	//  198  410:int2byte        
	//  199  411:bastore         
	//  200  412:invokestatic    #830 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  201  415:aload_1         
	//  202  416:invokestatic    #830 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  203  419:astore_1        
				}
			}
		} else
	//* 204  420:goto            545
		{
			byte abyte1[] = ((byte []) (s));
	//  205  423:aload_1         
	//  206  424:astore          4
			if(config.getSdkVersion() != null)
	//* 207  426:aload_0         
	//* 208  427:getfield        #64  <Field Configration config>
	//* 209  430:invokevirtual   #824 <Method String Configration.getSdkVersion()>
	//* 210  433:ifnull          482
			{
				abyte1 = ((byte []) (s));
	//  211  436:aload_1         
	//  212  437:astore          4
				if(config.getSdkVersion().length() > 0)
	//* 213  439:aload_0         
	//* 214  440:getfield        #64  <Field Configration config>
	//* 215  443:invokevirtual   #824 <Method String Configration.getSdkVersion()>
	//* 216  446:invokevirtual   #827 <Method int String.length()>
	//* 217  449:ifle            482
				{
					s = ((String) (config.getSdkVersion().getBytes()));
	//  218  452:aload_0         
	//  219  453:getfield        #64  <Field Configration config>
	//  220  456:invokevirtual   #824 <Method String Configration.getSdkVersion()>
	//  221  459:invokevirtual   #836 <Method byte[] String.getBytes()>
	//  222  462:astore_1        
					abyte1 = FM_Bytes.join(new byte[] {
						4, (byte)s.length
					}, ((byte []) (s)));
	//  223  463:iconst_2        
	//  224  464:newarray        byte[]
	//  225  466:dup             
	//  226  467:iconst_0        
	//  227  468:iconst_4        
	//  228  469:bastore         
	//  229  470:dup             
	//  230  471:iconst_1        
	//  231  472:aload_1         
	//  232  473:arraylength     
	//  233  474:int2byte        
	//  234  475:bastore         
	//  235  476:aload_1         
	//  236  477:invokestatic    #830 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  237  480:astore          4
				}
			}
			s = ((String) (abyte1));
	//  238  482:aload           4
	//  239  484:astore_1        
			if(config.getBusinessVersion() != null)
	//* 240  485:aload_0         
	//* 241  486:getfield        #64  <Field Configration config>
	//* 242  489:invokevirtual   #833 <Method String Configration.getBusinessVersion()>
	//* 243  492:ifnull          545
			{
				s = ((String) (abyte1));
	//  244  495:aload           4
	//  245  497:astore_1        
				if(config.getBusinessVersion().length() > 0)
	//* 246  498:aload_0         
	//* 247  499:getfield        #64  <Field Configration config>
	//* 248  502:invokevirtual   #833 <Method String Configration.getBusinessVersion()>
	//* 249  505:invokevirtual   #827 <Method int String.length()>
	//* 250  508:ifle            545
				{
					s = ((String) (FM_Bytes.hexStringToBytes(config.getBusinessVersion())));
	//  251  511:aload_0         
	//  252  512:getfield        #64  <Field Configration config>
	//  253  515:invokevirtual   #833 <Method String Configration.getBusinessVersion()>
	//  254  518:invokestatic    #675 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//  255  521:astore_1        
					s = ((String) (FM_Bytes.join(FM_Bytes.join(abyte1, new byte[] {
						5, (byte)s.length
					}), ((byte []) (s)))));
	//  256  522:aload           4
	//  257  524:iconst_2        
	//  258  525:newarray        byte[]
	//  259  527:dup             
	//  260  528:iconst_0        
	//  261  529:iconst_5        
	//  262  530:bastore         
	//  263  531:dup             
	//  264  532:iconst_1        
	//  265  533:aload_1         
	//  266  534:arraylength     
	//  267  535:int2byte        
	//  268  536:bastore         
	//  269  537:invokestatic    #830 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  270  540:aload_1         
	//  271  541:invokestatic    #830 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//  272  544:astore_1        
				}
			}
		}
		terminalinfo.setAppend(((byte []) (s)));
	//  273  545:aload           6
	//  274  547:aload_1         
	//  275  548:invokevirtual   #839 <Method void TerminalInfo.setAppend(byte[])>
		if(terminalNumber != null)
	//* 276  551:aload_0         
	//* 277  552:getfield        #564 <Field byte[] terminalNumber>
	//* 278  555:ifnull          570
			terminalinfo.setTerminalNumber(terminalNumber);
	//  279  558:aload           6
	//  280  560:aload_0         
	//  281  561:getfield        #564 <Field byte[] terminalNumber>
	//  282  564:invokevirtual   #842 <Method void TerminalInfo.setTerminalNumber(byte[])>
		else
	//* 283  567:goto            579
			terminalinfo.setTerminalNumber(new byte[32]);
	//  284  570:aload           6
	//  285  572:bipush          32
	//  286  574:newarray        byte[]
	//  287  576:invokevirtual   #842 <Method void TerminalInfo.setTerminalNumber(byte[])>
		boolean flag;
		try
		{
			flag = terminalcommunication1.openSession(terminalinfo, false);
	//  288  579:aload           5
	//  289  581:aload           6
	//  290  583:iconst_0        
	//  291  584:invokeinterface #845 <Method boolean TerminalCommunication.openSession(TerminalInfo, boolean)>
	//  292  589:istore_3        
		}
	//* 293  590:iload_3         
	//* 294  591:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 295  592:astore_1        
		{
			if(fmLog == null)
	//* 296  593:aload_0         
	//* 297  594:getfield        #52  <Field FMLog fmLog>
	//* 298  597:ifnonnull       610
				fmLog = LogFactory.getInstance().getLog();
	//  299  600:aload_0         
	//  300  601:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  301  604:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  302  607:putfield        #52  <Field FMLog fmLog>
			if(((OpenSessionException) (s)).getExceptionType() != null)
	//* 303  610:aload_1         
	//* 304  611:invokevirtual   #848 <Method cn.com.fmsh.communication.exception.session.OpenSessionException$OpenSessionExceptionType OpenSessionException.getExceptionType()>
	//* 305  614:ifnull          663
			{
				if(fmLog != null)
	//* 306  617:aload_0         
	//* 307  618:getfield        #52  <Field FMLog fmLog>
	//* 308  621:ifnull          703
					fmLog.warn(logTag, (new StringBuilder("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u5904\u7406\u5931\u8D25\uFF0C ")).append(((OpenSessionException) (s)).getExceptionType().getDescription()).toString());
	//  309  624:aload_0         
	//  310  625:getfield        #52  <Field FMLog fmLog>
	//  311  628:aload_0         
	//  312  629:getfield        #60  <Field String logTag>
	//  313  632:new             #90  <Class StringBuilder>
	//  314  635:dup             
	//  315  636:ldc2            #850 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u5904\u7406\u5931\u8D25\uFF0C ">
	//  316  639:invokespecial   #95  <Method void StringBuilder(String)>
	//  317  642:aload_1         
	//  318  643:invokevirtual   #848 <Method cn.com.fmsh.communication.exception.session.OpenSessionException$OpenSessionExceptionType OpenSessionException.getExceptionType()>
	//  319  646:invokevirtual   #853 <Method String cn.com.fmsh.communication.exception.session.OpenSessionException$OpenSessionExceptionType.getDescription()>
	//  320  649:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  321  652:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  322  655:invokeinterface #114 <Method void FMLog.warn(String, String)>
			} else
	//* 323  660:goto            703
			if(fmLog != null)
	//* 324  663:aload_0         
	//* 325  664:getfield        #52  <Field FMLog fmLog>
	//* 326  667:ifnull          703
				fmLog.warn(logTag, (new StringBuilder("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u5904\u7406\u5931\u8D25\uFF0C ")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//  327  670:aload_0         
	//  328  671:getfield        #52  <Field FMLog fmLog>
	//  329  674:aload_0         
	//  330  675:getfield        #60  <Field String logTag>
	//  331  678:new             #90  <Class StringBuilder>
	//  332  681:dup             
	//  333  682:ldc2            #850 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u5904\u7406\u5931\u8D25\uFF0C ">
	//  334  685:invokespecial   #95  <Method void StringBuilder(String)>
	//  335  688:aload_1         
	//  336  689:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//  337  692:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  338  695:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  339  698:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u5904\u7406\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_sign_in_fail);
	//  340  703:new             #84  <Class BusinessException>
	//  341  706:dup             
	//  342  707:ldc2            #855 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u8BF7\u6C42\u5904\u7406\u5931\u8D25">
	//  343  710:getstatic       #262 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_sign_in_fail>
	//  344  713:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  345  716:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 346  717:astore_1        
		{
			if(fmLog == null)
	//* 347  718:aload_0         
	//* 348  719:getfield        #52  <Field FMLog fmLog>
	//* 349  722:ifnonnull       735
				fmLog = LogFactory.getInstance().getLog();
	//  350  725:aload_0         
	//  351  726:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  352  729:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  353  732:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 354  735:aload_0         
	//* 355  736:getfield        #52  <Field FMLog fmLog>
	//* 356  739:ifnull          775
				fmLog.warn(logTag, (new StringBuilder("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u53C2\u6570\u65E0\u6548\uFF1A ")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//  357  742:aload_0         
	//  358  743:getfield        #52  <Field FMLog fmLog>
	//  359  746:aload_0         
	//  360  747:getfield        #60  <Field String logTag>
	//  361  750:new             #90  <Class StringBuilder>
	//  362  753:dup             
	//  363  754:ldc2            #857 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u53C2\u6570\u65E0\u6548\uFF1A ">
	//  364  757:invokespecial   #95  <Method void StringBuilder(String)>
	//  365  760:aload_1         
	//  366  761:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//  367  764:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  368  767:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  369  770:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u53C2\u6570\u65E0\u6548", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_sign_in_fail);
	//  370  775:new             #84  <Class BusinessException>
	//  371  778:dup             
	//  372  779:ldc2            #859 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u53C2\u6570\u65E0\u6548">
	//  373  782:getstatic       #262 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_sign_in_fail>
	//  374  785:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  375  788:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 376  789:astore_1        
		{
			if(fmLog == null)
	//* 377  790:aload_0         
	//* 378  791:getfield        #52  <Field FMLog fmLog>
	//* 379  794:ifnonnull       807
				fmLog = LogFactory.getInstance().getLog();
	//  380  797:aload_0         
	//  381  798:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  382  801:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  383  804:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 384  807:aload_0         
	//* 385  808:getfield        #52  <Field FMLog fmLog>
	//* 386  811:ifnull          847
				fmLog.warn(logTag, (new StringBuilder("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u65F6\uFF0C\u7F51\u7EDC\u5F02\u5E38: ")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//  387  814:aload_0         
	//  388  815:getfield        #52  <Field FMLog fmLog>
	//  389  818:aload_0         
	//  390  819:getfield        #60  <Field String logTag>
	//  391  822:new             #90  <Class StringBuilder>
	//  392  825:dup             
	//  393  826:ldc2            #861 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u65F6\uFF0C\u7F51\u7EDC\u5F02\u5E38: ">
	//  394  829:invokespecial   #95  <Method void StringBuilder(String)>
	//  395  832:aload_1         
	//  396  833:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//  397  836:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  398  839:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  399  842:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u65F6\uFF0C\u7F51\u7EDC\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail);
	//  400  847:new             #84  <Class BusinessException>
	//  401  850:dup             
	//  402  851:ldc2            #863 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u65F6\uFF0C\u7F51\u7EDC\u5F02\u5E38">
	//  403  854:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//  404  857:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  405  860:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 406  861:astore_1        
		{
			if(fmLog == null)
	//* 407  862:aload_0         
	//* 408  863:getfield        #52  <Field FMLog fmLog>
	//* 409  866:ifnonnull       879
				fmLog = LogFactory.getInstance().getLog();
	//  410  869:aload_0         
	//  411  870:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//  412  873:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//  413  876:putfield        #52  <Field FMLog fmLog>
			if(fmLog != null)
	//* 414  879:aload_0         
	//* 415  880:getfield        #52  <Field FMLog fmLog>
	//* 416  883:ifnull          919
				fmLog.warn(logTag, (new StringBuilder("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5F02\u5E38\uFF1A ")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//  417  886:aload_0         
	//  418  887:getfield        #52  <Field FMLog fmLog>
	//  419  890:aload_0         
	//  420  891:getfield        #60  <Field String logTag>
	//  421  894:new             #90  <Class StringBuilder>
	//  422  897:dup             
	//  423  898:ldc2            #865 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5F02\u5E38\uFF1A ">
	//  424  901:invokespecial   #95  <Method void StringBuilder(String)>
	//  425  904:aload_1         
	//  426  905:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//  427  908:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  428  911:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  429  914:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throw new BusinessException("\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5F02\u5E38", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_sign_in_fail);
	//  430  919:new             #84  <Class BusinessException>
	//  431  922:dup             
	//  432  923:ldc2            #867 <String "\u7EC8\u7AEF\u5411\u5E73\u53F0\u7B7E\u5230\u65F6\uFF0C\u901A\u4FE1\u6570\u636E\u5F02\u5E38">
	//  433  926:getstatic       #262 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_sign_in_fail>
	//  434  929:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//  435  932:athrow          
		}
		return flag;
	}

	public void registerCommunicationNotify(CommunicationNotify communicationnotify)
	{
		communicationNotify = communicationnotify;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #334 <Field CommunicationNotify communicationNotify>
	//    3    5:return          
	}

	public void registerLocalDataHandler(LocalDataHandler localdatahandler)
	{
		localDataHandler = localdatahandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #508 <Field LocalDataHandler localDataHandler>
	//    3    5:return          
	}

	public void setApduHandler(ApduHandler apduhandler)
	{
		apduHandler = apduhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #227 <Field ApduHandler apduHandler>
	//    3    5:return          
	}

	public void setLinkInfo(LinkInfo linkinfo)
	{
		userLinkInfo = linkinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #873 <Field LinkInfo userLinkInfo>
	//    3    5:return          
	}

	public void setMobileInfo(byte abyte0[])
	{
		mobileInfo = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #821 <Field byte[] mobileInfo>
	//    3    5:return          
	}

	public void setSecurityCode(byte abyte0[])
	{
		securityCode = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #553 <Field byte[] securityCode>
	//    3    5:return          
	}

	public void setSocketExceptionHandle(SocketExceptionHandler socketexceptionhandler)
	{
		socketExceptionHandle = socketexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #561 <Field SocketExceptionHandler socketExceptionHandle>
	//    3    5:return          
	}

	public void setTerminalNumber(byte abyte0[])
	{
		terminalNumber = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #564 <Field byte[] terminalNumber>
	//    3    5:return          
	}

	byte[] socketExceptionHandle(boolean flag, String s)
		throws BusinessException
	{
		boolean flag2 = connectHandle(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #878 <Method boolean connectHandle(String)>
	//    3    5:istore          4
		if(!flag2)
	//*   4    7:iload           4
	//*   5    9:ifne            122
		{
			if(fmLog != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #52  <Field FMLog fmLog>
	//*   8   16:ifnull          35
				fmLog.warn(logTag, "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u94FE\u63A5\u5931\u8D25");
	//    9   19:aload_0         
	//   10   20:getfield        #52  <Field FMLog fmLog>
	//   11   23:aload_0         
	//   12   24:getfield        #60  <Field String logTag>
	//   13   27:ldc2            #880 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u94FE\u63A5\u5931\u8D25">
	//   14   30:invokeinterface #114 <Method void FMLog.warn(String, String)>
			boolean flag1 = flag2;
	//   15   35:iload           4
	//   16   37:istore_3        
			if(socketExceptionHandle != null)
	//*  17   38:aload_0         
	//*  18   39:getfield        #561 <Field SocketExceptionHandler socketExceptionHandle>
	//*  19   42:ifnull          84
			{
				flag1 = flag2;
	//   20   45:iload           4
	//   21   47:istore_3        
	//*  22   48:goto            72
				while(socketExceptionHandle.isReconnect4tException()) 
				{
					boolean flag3 = connectHandle(s);
	//   23   51:aload_0         
	//   24   52:aload_2         
	//   25   53:invokespecial   #878 <Method boolean connectHandle(String)>
	//   26   56:istore          4
					flag1 = flag3;
	//   27   58:iload           4
	//   28   60:istore_3        
					if(flag3)
	//*  29   61:iload           4
	//*  30   63:ifeq            72
					{
						flag1 = flag3;
	//   31   66:iload           4
	//   32   68:istore_3        
						break;
	//   33   69:goto            84
					}
				}
	//   34   72:aload_0         
	//   35   73:getfield        #561 <Field SocketExceptionHandler socketExceptionHandle>
	//   36   76:invokeinterface #885 <Method boolean SocketExceptionHandler.isReconnect4tException()>
	//   37   81:ifne            51
			}
			if(!flag1)
	//*  38   84:iload_3         
	//*  39   85:ifne            122
			{
				if(fmLog != null)
	//*  40   88:aload_0         
	//*  41   89:getfield        #52  <Field FMLog fmLog>
	//*  42   92:ifnull          111
					fmLog.debug(logTag, "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u94FE\u63A5\u5931\u8D25");
	//   43   95:aload_0         
	//   44   96:getfield        #52  <Field FMLog fmLog>
	//   45   99:aload_0         
	//   46  100:getfield        #60  <Field String logTag>
	//   47  103:ldc2            #880 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u94FE\u63A5\u5931\u8D25">
	//   48  106:invokeinterface #888 <Method void FMLog.debug(String, String)>
				throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u94FE\u63A5\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail, flag);
	//   49  111:aload_0         
	//   50  112:ldc2            #880 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u91CD\u65B0\u94FE\u63A5\u5931\u8D25">
	//   51  115:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//   52  118:iload_1         
	//   53  119:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			}
		}
		try
		{
			s = ((String) (terminalCommunicationList.getTerminalCommunication(s).repeat()));
	//   54  122:aload_0         
	//   55  123:getfield        #79  <Field TerminalCommunicationList terminalCommunicationList>
	//   56  126:aload_2         
	//   57  127:invokeinterface #194 <Method TerminalCommunication TerminalCommunicationList.getTerminalCommunication(String)>
	//   58  132:invokeinterface #203 <Method byte[] TerminalCommunication.repeat()>
	//   59  137:astore_2        
		}
	//*  60  138:aload_2         
	//*  61  139:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  62  140:astore_2        
		{
			if(fmLog != null)
	//*  63  141:aload_0         
	//*  64  142:getfield        #52  <Field FMLog fmLog>
	//*  65  145:ifnull          181
				fmLog.warn(logTag, (new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25\uFF1A")).append(Util4Java.getExceptionInfo(((Exception) (s)))).toString());
	//   66  148:aload_0         
	//   67  149:getfield        #52  <Field FMLog fmLog>
	//   68  152:aload_0         
	//   69  153:getfield        #60  <Field String logTag>
	//   70  156:new             #90  <Class StringBuilder>
	//   71  159:dup             
	//   72  160:ldc2            #890 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25\uFF1A">
	//   73  163:invokespecial   #95  <Method void StringBuilder(String)>
	//   74  166:aload_2         
	//   75  167:invokestatic    #101 <Method String Util4Java.getExceptionInfo(Exception)>
	//   76  170:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   77  173:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   78  176:invokeinterface #114 <Method void FMLog.warn(String, String)>
			throwExceptionAndClose("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25", cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail, flag);
	//   79  181:aload_0         
	//   80  182:ldc1            #211 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25">
	//   81  184:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//   82  187:iload_1         
	//   83  188:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			return null;
	//   84  191:aconst_null     
	//   85  192:areturn         
		}
		catch(CommunicationException communicationexception)
	//*  86  193:astore          5
		{
			if(fmLog != null)
	//*  87  195:aload_0         
	//*  88  196:getfield        #52  <Field FMLog fmLog>
	//*  89  199:ifnull          268
			{
				FMLog fmlog = fmLog;
	//   90  202:aload_0         
	//   91  203:getfield        #52  <Field FMLog fmLog>
	//   92  206:astore          6
				String s1 = logTag;
	//   93  208:aload_0         
	//   94  209:getfield        #60  <Field String logTag>
	//   95  212:astore          7
				StringBuilder stringbuilder1 = new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25\uFF1A");
	//   96  214:new             #90  <Class StringBuilder>
	//   97  217:dup             
	//   98  218:ldc2            #890 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25\uFF1A">
	//   99  221:invokespecial   #95  <Method void StringBuilder(String)>
	//  100  224:astore          8
				if(communicationexception.getExceptionType() == null)
	//* 101  226:aload           5
	//* 102  228:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//* 103  231:ifnonnull       241
					s = "";
	//  104  234:ldc2            #721 <String "">
	//  105  237:astore_2        
				else
	//* 106  238:goto            250
					s = communicationexception.getExceptionType().getDescription();
	//  107  241:aload           5
	//  108  243:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//  109  246:invokevirtual   #182 <Method String cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.getDescription()>
	//  110  249:astore_2        
				fmlog.warn(s1, stringbuilder1.append(s).toString());
	//  111  250:aload           6
	//  112  252:aload           7
	//  113  254:aload           8
	//  114  256:aload_2         
	//  115  257:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  116  260:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  117  263:invokeinterface #114 <Method void FMLog.warn(String, String)>
			}
			StringBuilder stringbuilder = new StringBuilder("\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25\uFF1A");
	//  118  268:new             #90  <Class StringBuilder>
	//  119  271:dup             
	//  120  272:ldc2            #890 <String "\u4E1A\u52A1\u5904\u7406\u65F6\uFF0C\u94FE\u63A5\u5F02\u5E38\uFF0C\u4E1A\u52A1\u5904\u7406\u518D\u6B21\u5931\u8D25\uFF1A">
	//  121  275:invokespecial   #95  <Method void StringBuilder(String)>
	//  122  278:astore          6
			if(communicationexception.getExceptionType() == null)
	//* 123  280:aload           5
	//* 124  282:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//* 125  285:ifnonnull       295
				s = "";
	//  126  288:ldc2            #721 <String "">
	//  127  291:astore_2        
			else
	//* 128  292:goto            304
				s = communicationexception.getExceptionType().getDescription();
	//  129  295:aload           5
	//  130  297:invokevirtual   #122 <Method cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType CommunicationException.getExceptionType()>
	//  131  300:invokevirtual   #182 <Method String cn.com.fmsh.communication.exception.CommunicationException$CommunicationExceptionType.getDescription()>
	//  132  303:astore_2        
			throwExceptionAndClose(stringbuilder.append(s).toString(), cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage.local_communication_connect_fail, flag);
	//  133  304:aload_0         
	//  134  305:aload           6
	//  135  307:aload_2         
	//  136  308:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  137  311:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  138  314:getstatic       #244 <Field cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage.local_communication_connect_fail>
	//  139  317:iload_1         
	//  140  318:invokevirtual   #303 <Method void throwExceptionAndClose(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage, boolean)>
			return null;
	//  141  321:aconst_null     
	//  142  322:areturn         
		}
		return ((byte []) (s));
	}

	public void throwExceptionAndClose(BusinessException businessexception, boolean flag, String s)
		throws BusinessException
	{
		if(flag && apduHandler != null)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
	//*   2    4:aload_0         
	//*   3    5:getfield        #227 <Field ApduHandler apduHandler>
	//*   4    8:ifnull          20
			apduHandler.close();
	//    5   11:aload_0         
	//    6   12:getfield        #227 <Field ApduHandler apduHandler>
	//    7   15:invokeinterface #232 <Method void ApduHandler.close()>
		disconnect(s);
	//    8   20:aload_0         
	//    9   21:aload_3         
	//   10   22:invokevirtual   #209 <Method void disconnect(String)>
	//   11   25:return          
	}

	public void throwExceptionAndClose(String s, cn.com.fmsh.tsm.business.exception.BusinessException.ErrorMessage errormessage, boolean flag)
		throws BusinessException
	{
		if(flag && apduHandler != null)
	//*   0    0:iload_3         
	//*   1    1:ifeq            20
	//*   2    4:aload_0         
	//*   3    5:getfield        #227 <Field ApduHandler apduHandler>
	//*   4    8:ifnull          20
			apduHandler.close();
	//    5   11:aload_0         
	//    6   12:getfield        #227 <Field ApduHandler apduHandler>
	//    7   15:invokeinterface #232 <Method void ApduHandler.close()>
		throw new BusinessException(s, errormessage);
	//    8   20:new             #84  <Class BusinessException>
	//    9   23:dup             
	//   10   24:aload_1         
	//   11   25:aload_2         
	//   12   26:invokespecial   #185 <Method void BusinessException(String, cn.com.fmsh.tsm.business.exception.BusinessException$ErrorMessage)>
	//   13   29:athrow          
	}

	private ApduHandler apduHandler;
	private CommunicationNotify communicationNotify;
	private Configration config;
	private ConfigKeyManager configKeyManager;
	private ErrorCodeHandler errorCodeHandler;
	private final int exceptionTimeout = 1000;
	FMLog fmLog;
	private LocalDataHandler localDataHandler;
	private final String logTag = ((Class) (cn/com/fmsh/tsm/business/core/CardBusinessBasic)).getName();
	private IMessageHandler messageHandler;
	private byte mobileInfo[];
	private ScriptHandler scriptHandler;
	private byte securityCode[];
	private SocketExceptionHandler socketExceptionHandle;
	private TerminalCommunicationList terminalCommunicationList;
	private byte terminalNumber[];
	private LinkInfo userLinkInfo;
}
