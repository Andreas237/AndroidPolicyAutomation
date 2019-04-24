// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.core;

import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ErrorCodeHandler
{

	public ErrorCodeHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		fmLog = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #20  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #24  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #26  <Field FMLog fmLog>
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class ErrorCodeHandler>
	//    8   17:invokevirtual   #32  <Method String Class.getName()>
	//    9   20:putfield        #34  <Field String logTag>
		errorCode = new Properties();
	//   10   23:aload_0         
	//   11   24:new             #36  <Class Properties>
	//   12   27:dup             
	//   13   28:invokespecial   #37  <Method void Properties()>
	//   14   31:putfield        #39  <Field Properties errorCode>
	//   15   34:return          
	}

	public int getCode(String s)
	{
		String s1 = errorCode.getProperty(s);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Properties errorCode>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method String Properties.getProperty(String)>
	//    4    8:astore_2        
		if(s1 == null || s1.length() < 1)
	//*   5    9:aload_2         
	//*   6   10:ifnull          21
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #52  <Method int String.length()>
	//*   9   17:iconst_1        
	//*  10   18:icmpge          65
		{
			if(fmLog != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #26  <Field FMLog fmLog>
	//*  13   25:ifnull          62
				fmLog.debug(logTag, (new StringBuilder("\u83B7\u53D6[")).append(s).append("]\u7684\u54CD\u5E94\u7801\u5931\u8D25").toString());
	//   14   28:aload_0         
	//   15   29:getfield        #26  <Field FMLog fmLog>
	//   16   32:aload_0         
	//   17   33:getfield        #34  <Field String logTag>
	//   18   36:new             #54  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:ldc1            #56  <String "\u83B7\u53D6[">
	//   21   42:invokespecial   #59  <Method void StringBuilder(String)>
	//   22   45:aload_1         
	//   23   46:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:ldc1            #65  <String "]\u7684\u54CD\u5E94\u7801\u5931\u8D25">
	//   25   51:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   27   57:invokeinterface #74  <Method void FMLog.debug(String, String)>
			return 99;
	//   28   62:bipush          99
	//   29   64:ireturn         
		} else
		{
			return Integer.parseInt(s1.trim());
	//   30   65:aload_2         
	//   31   66:invokevirtual   #77  <Method String String.trim()>
	//   32   69:invokestatic    #82  <Method int Integer.parseInt(String)>
	//   33   72:ireturn         
		}
	}

	public boolean init(InputStream inputstream)
	{
		if(inputstream == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       28
		{
			if(fmLog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field FMLog fmLog>
	//*   4    8:ifnull          26
				fmLog.warn(logTag, "\u54CD\u5E94\u7801\u521D\u59CB\u5316\u5931\u8D25\u65F6\uFF0C\u4F20\u5165\u7684\u914D\u7F6E\u6587\u4EF6\u4E3A\u7A7A");
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field FMLog fmLog>
	//    7   15:aload_0         
	//    8   16:getfield        #34  <Field String logTag>
	//    9   19:ldc1            #88  <String "\u54CD\u5E94\u7801\u521D\u59CB\u5316\u5931\u8D25\u65F6\uFF0C\u4F20\u5165\u7684\u914D\u7F6E\u6587\u4EF6\u4E3A\u7A7A">
	//   10   21:invokeinterface #91  <Method void FMLog.warn(String, String)>
			return false;
	//   11   26:iconst_0        
	//   12   27:ireturn         
		}
		try
		{
			errorCode.load(inputstream);
	//   13   28:aload_0         
	//   14   29:getfield        #39  <Field Properties errorCode>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #95  <Method void Properties.load(InputStream)>
		}
	//*  17   36:goto            81
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  18   39:astore_1        
		{
			if(fmLog != null)
	//*  19   40:aload_0         
	//*  20   41:getfield        #26  <Field FMLog fmLog>
	//*  21   44:ifnull          79
				fmLog.warn(logTag, (new StringBuilder("\u54CD\u5E94\u7801\u521D\u59CB\u5316\u5931\u8D25:")).append(Util4Java.getExceptionInfo(((Exception) (inputstream)))).toString());
	//   22   47:aload_0         
	//   23   48:getfield        #26  <Field FMLog fmLog>
	//   24   51:aload_0         
	//   25   52:getfield        #34  <Field String logTag>
	//   26   55:new             #54  <Class StringBuilder>
	//   27   58:dup             
	//   28   59:ldc1            #97  <String "\u54CD\u5E94\u7801\u521D\u59CB\u5316\u5931\u8D25:">
	//   29   61:invokespecial   #59  <Method void StringBuilder(String)>
	//   30   64:aload_1         
	//   31   65:invokestatic    #103 <Method String Util4Java.getExceptionInfo(Exception)>
	//   32   68:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   33   71:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   34   74:invokeinterface #91  <Method void FMLog.warn(String, String)>
			return false;
	//   35   79:iconst_0        
	//   36   80:ireturn         
		}
		return true;
	//   37   81:iconst_1        
	//   38   82:ireturn         
	}

	private Properties errorCode;
	private FMLog fmLog;
	private final String logTag = ((Class) (cn/com/fmsh/tsm/business/core/ErrorCodeHandler)).getName();
}
