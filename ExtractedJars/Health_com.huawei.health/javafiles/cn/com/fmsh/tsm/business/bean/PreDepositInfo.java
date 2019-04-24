// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;

// Referenced classes of package cn.com.fmsh.tsm.business.bean:
//			BusinessOrder

public class PreDepositInfo
{

	public PreDepositInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static PreDepositInfo fromTag(ITag itag)
		throws FMCommunicationMessageException
	{
		Object obj = ((Object) (LogFactory.getInstance().getLog()));
	//    0    0:invokestatic    #24  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #28  <Method FMLog LogFactory.getLog()>
	//    2    6:astore_3        
		if(itag == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       30
		{
			if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          28
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/PreDepositInfo)).getName(), "Tag\u751F\u6210\u989D\u5EA6\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//    7   15:aload_3         
	//    8   16:ldc1            #2   <Class PreDepositInfo>
	//    9   18:invokevirtual   #34  <Method String Class.getName()>
	//   10   21:ldc1            #36  <String "Tag\u751F\u6210\u989D\u5EA6\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   11   23:invokeinterface #42  <Method void FMLog.warn(String, String)>
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		}
		itag = ((ITag) (itag.getItemTags()));
	//   14   30:aload_0         
	//   15   31:invokeinterface #48  <Method ITag[] ITag.getItemTags()>
	//   16   36:astore_0        
		if(itag == null || itag.length < 1)
	//*  17   37:aload_0         
	//*  18   38:ifnull          47
	//*  19   41:aload_0         
	//*  20   42:arraylength     
	//*  21   43:iconst_1        
	//*  22   44:icmpge          66
		{
			if(obj != null)
	//*  23   47:aload_3         
	//*  24   48:ifnull          64
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), "Tag\u751F\u6210\u989D\u5EA6\u4FE1\u606F\u65F6\uFF0CTag\u5B50\u9879\u4E3A\u7A7A");
	//   25   51:aload_3         
	//   26   52:ldc1            #50  <Class BusinessOrder>
	//   27   54:invokevirtual   #34  <Method String Class.getName()>
	//   28   57:ldc1            #52  <String "Tag\u751F\u6210\u989D\u5EA6\u4FE1\u606F\u65F6\uFF0CTag\u5B50\u9879\u4E3A\u7A7A">
	//   29   59:invokeinterface #42  <Method void FMLog.warn(String, String)>
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
		obj = ((Object) (new PreDepositInfo()));
	//   32   66:new             #2   <Class PreDepositInfo>
	//   33   69:dup             
	//   34   70:invokespecial   #53  <Method void PreDepositInfo()>
	//   35   73:astore_3        
		int j = itag.length;
	//   36   74:aload_0         
	//   37   75:arraylength     
	//   38   76:istore_2        
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            196
		{
			ITag itag1 = ((ITag) (itag[i]));
	//   42   82:aload_0         
	//   43   83:iload_1         
	//   44   84:aaload          
	//   45   85:astore          4
			switch(itag1.getId())
	//*  46   87:aload           4
	//*  47   89:invokeinterface #57  <Method byte ITag.getId()>
			{
	//*  48   94:lookupswitch    4: default 136
	//	               -116: 167
	//	               -107: 181
	//	               90: 139
	//	               91: 153
	//*  49  136:goto            192
			case 90: // 'Z'
				((PreDepositInfo) (obj)).setTotal(itag1.getIntVal());
	//   50  139:aload_3         
	//   51  140:aload           4
	//   52  142:invokeinterface #61  <Method int ITag.getIntVal()>
	//   53  147:invokevirtual   #65  <Method void setTotal(int)>
				break;

	//*  54  150:goto            192
			case 91: // '['
				((PreDepositInfo) (obj)).setBlance(itag1.getIntVal());
	//   55  153:aload_3         
	//   56  154:aload           4
	//   57  156:invokeinterface #61  <Method int ITag.getIntVal()>
	//   58  161:invokevirtual   #68  <Method void setBlance(int)>
				break;

	//*  59  164:goto            192
			case -116: 
				((PreDepositInfo) (obj)).setStatus(itag1.getIntVal());
	//   60  167:aload_3         
	//   61  168:aload           4
	//   62  170:invokeinterface #61  <Method int ITag.getIntVal()>
	//   63  175:invokevirtual   #71  <Method void setStatus(int)>
				break;

	//*  64  178:goto            192
			case -107: 
				((PreDepositInfo) (obj)).setType(itag1.getIntVal());
	//   65  181:aload_3         
	//   66  182:aload           4
	//   67  184:invokeinterface #61  <Method int ITag.getIntVal()>
	//   68  189:invokevirtual   #74  <Method void setType(int)>
				break;
			}
		}

	//   69  192:iload_1         
	//   70  193:iconst_1        
	//   71  194:iadd            
	//   72  195:istore_1        
	//   73  196:iload_1         
	//   74  197:iload_2         
	//   75  198:icmplt          82
		return ((PreDepositInfo) (obj));
	//   76  201:aload_3         
	//   77  202:areturn         
	}

	public int getBlance()
	{
		return blance;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int blance>
	//    2    4:ireturn         
	}

	public int getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int status>
	//    2    4:ireturn         
	}

	public int getTotal()
	{
		return total;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int total>
	//    2    4:ireturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int type>
	//    2    4:ireturn         
	}

	public void setBlance(int i)
	{
		blance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field int blance>
	//    3    5:return          
	}

	public void setStatus(int i)
	{
		status = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field int status>
	//    3    5:return          
	}

	public void setTotal(int i)
	{
		total = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field int total>
	//    3    5:return          
	}

	public void setType(int i)
	{
		type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field int type>
	//    3    5:return          
	}

	private int blance;
	private int status;
	private int total;
	private int type;
}
