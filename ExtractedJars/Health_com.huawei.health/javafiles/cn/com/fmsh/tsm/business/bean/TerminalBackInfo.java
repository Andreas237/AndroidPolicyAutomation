// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.tsm.business.enums.EnumBackInfoType;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;

// Referenced classes of package cn.com.fmsh.tsm.business.bean:
//			BusinessOrder

public class TerminalBackInfo
{

	public TerminalBackInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		title = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field String title>
		infoType = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #27  <Field EnumBackInfoType infoType>
		appVersion = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #29  <Field String appVersion>
	//   11   19:return          
	}

	public static TerminalBackInfo fromTag(ITag itag)
		throws FMCommunicationMessageException
	{
		Object obj = ((Object) (LogFactory.getInstance().getLog()));
	//    0    0:invokestatic    #40  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #44  <Method FMLog LogFactory.getLog()>
	//    2    6:astore_3        
		if(itag == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       30
		{
			if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          28
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u53CD\u9988\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//    7   15:aload_3         
	//    8   16:ldc1            #46  <Class BusinessOrder>
	//    9   18:invokevirtual   #52  <Method String Class.getName()>
	//   10   21:ldc1            #54  <String " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u53CD\u9988\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   11   23:invokeinterface #60  <Method void FMLog.warn(String, String)>
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		}
		itag = ((ITag) (itag.getItemTags()));
	//   14   30:aload_0         
	//   15   31:invokeinterface #66  <Method ITag[] ITag.getItemTags()>
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
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u53CD\u9988\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//   25   51:aload_3         
	//   26   52:ldc1            #46  <Class BusinessOrder>
	//   27   54:invokevirtual   #52  <Method String Class.getName()>
	//   28   57:ldc1            #54  <String " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u53CD\u9988\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   29   59:invokeinterface #60  <Method void FMLog.warn(String, String)>
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
		obj = ((Object) (new TerminalBackInfo()));
	//   32   66:new             #2   <Class TerminalBackInfo>
	//   33   69:dup             
	//   34   70:invokespecial   #67  <Method void TerminalBackInfo()>
	//   35   73:astore_3        
		int j = itag.length;
	//   36   74:aload_0         
	//   37   75:arraylength     
	//   38   76:istore_2        
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            265
		{
			ITag itag1 = ((ITag) (itag[i]));
	//   42   82:aload_0         
	//   43   83:iload_1         
	//   44   84:aaload          
	//   45   85:astore          4
			switch(itag1.getId())
	//*  46   87:aload           4
	//*  47   89:invokeinterface #71  <Method byte ITag.getId()>
			{
	//*  48   94:lookupswitch    7: default 160
	//	               19: 163
	//	               20: 177
	//	               65: 191
	//	               67: 205
	//	               81: 222
	//	               82: 236
	//	               85: 250
	//*  49  160:goto            261
			case 19: // '\023'
				((TerminalBackInfo) (obj)).setDate(itag1.getStringVal());
	//   50  163:aload_3         
	//   51  164:aload           4
	//   52  166:invokeinterface #74  <Method String ITag.getStringVal()>
	//   53  171:invokevirtual   #78  <Method void setDate(String)>
				break;

	//*  54  174:goto            261
			case 20: // '\024'
				((TerminalBackInfo) (obj)).setTime(itag1.getStringVal());
	//   55  177:aload_3         
	//   56  178:aload           4
	//   57  180:invokeinterface #74  <Method String ITag.getStringVal()>
	//   58  185:invokevirtual   #81  <Method void setTime(String)>
				break;

	//*  59  188:goto            261
			case 65: // 'A'
				((TerminalBackInfo) (obj)).setTitle(itag1.getStringVal());
	//   60  191:aload_3         
	//   61  192:aload           4
	//   62  194:invokeinterface #74  <Method String ITag.getStringVal()>
	//   63  199:invokevirtual   #84  <Method void setTitle(String)>
				break;

	//*  64  202:goto            261
			case 67: // 'C'
				((TerminalBackInfo) (obj)).setInfoType(EnumBackInfoType.instance(itag1.getIntVal()));
	//   65  205:aload_3         
	//   66  206:aload           4
	//   67  208:invokeinterface #88  <Method int ITag.getIntVal()>
	//   68  213:invokestatic    #94  <Method EnumBackInfoType EnumBackInfoType.instance(int)>
	//   69  216:invokevirtual   #98  <Method void setInfoType(EnumBackInfoType)>
				break;

	//*  70  219:goto            261
			case 81: // 'Q'
				((TerminalBackInfo) (obj)).setId(itag1.getBytesVal());
	//   71  222:aload_3         
	//   72  223:aload           4
	//   73  225:invokeinterface #102 <Method byte[] ITag.getBytesVal()>
	//   74  230:invokevirtual   #106 <Method void setId(byte[])>
				break;

	//*  75  233:goto            261
			case 82: // 'R'
				((TerminalBackInfo) (obj)).setQuestionFlag(itag1.getIntVal());
	//   76  236:aload_3         
	//   77  237:aload           4
	//   78  239:invokeinterface #88  <Method int ITag.getIntVal()>
	//   79  244:invokevirtual   #110 <Method void setQuestionFlag(int)>
				break;

	//*  80  247:goto            261
			case 85: // 'U'
				((TerminalBackInfo) (obj)).setChildren(itag1.getBytesVal());
	//   81  250:aload_3         
	//   82  251:aload           4
	//   83  253:invokeinterface #102 <Method byte[] ITag.getBytesVal()>
	//   84  258:invokevirtual   #113 <Method void setChildren(byte[])>
				break;
			}
		}

	//   85  261:iload_1         
	//   86  262:iconst_1        
	//   87  263:iadd            
	//   88  264:istore_1        
	//   89  265:iload_1         
	//   90  266:iload_2         
	//   91  267:icmplt          82
		return ((TerminalBackInfo) (obj));
	//   92  270:aload_3         
	//   93  271:areturn         
	}

	public String getAppVersion()
	{
		return appVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String appVersion>
	//    2    4:areturn         
	}

	public String getBasebandVersion()
	{
		return basebandVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field String basebandVersion>
	//    2    4:areturn         
	}

	public byte[] getChildren()
	{
		return children;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field byte[] children>
	//    2    4:areturn         
	}

	public String getDate()
	{
		return date;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field String date>
	//    2    4:areturn         
	}

	public byte[] getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field byte[] id>
	//    2    4:areturn         
	}

	public EnumBackInfoType getInfoType()
	{
		return infoType;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field EnumBackInfoType infoType>
	//    2    4:areturn         
	}

	public String getModelNumber()
	{
		return modelNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field String modelNumber>
	//    2    4:areturn         
	}

	public String getOsVersion()
	{
		return osVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field String osVersion>
	//    2    4:areturn         
	}

	public int getQuestionFlag()
	{
		return questionFlag;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field int questionFlag>
	//    2    4:ireturn         
	}

	public String getTime()
	{
		return time;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field String time>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String title>
	//    2    4:areturn         
	}

	public void setAppVersion(String s)
	{
		appVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String appVersion>
	//    3    5:return          
	}

	public void setBasebandVersion(String s)
	{
		basebandVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field String basebandVersion>
	//    3    5:return          
	}

	public void setChildren(byte abyte0[])
	{
		children = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field byte[] children>
	//    3    5:return          
	}

	public void setDate(String s)
	{
		date = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field String date>
	//    3    5:return          
	}

	public void setId(byte abyte0[])
	{
		id = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #126 <Field byte[] id>
	//    3    5:return          
	}

	public void setInfoType(EnumBackInfoType enumbackinfotype)
	{
		infoType = enumbackinfotype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field EnumBackInfoType infoType>
	//    3    5:return          
	}

	public void setModelNumber(String s)
	{
		modelNumber = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field String modelNumber>
	//    3    5:return          
	}

	public void setOsVersion(String s)
	{
		osVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field String osVersion>
	//    3    5:return          
	}

	public void setQuestionFlag(int i)
	{
		questionFlag = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #137 <Field int questionFlag>
	//    3    5:return          
	}

	public void setTime(String s)
	{
		time = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #140 <Field String time>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String title>
	//    3    5:return          
	}

	private String appVersion;
	private String basebandVersion;
	private byte children[];
	private String date;
	private byte id[];
	private EnumBackInfoType infoType;
	private String modelNumber;
	private String osVersion;
	private int questionFlag;
	private String time;
	private String title;
}
