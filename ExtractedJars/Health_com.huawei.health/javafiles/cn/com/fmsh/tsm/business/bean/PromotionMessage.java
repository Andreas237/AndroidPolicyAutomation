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

public class PromotionMessage
{

	public PromotionMessage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static PromotionMessage fromTag(ITag itag)
		throws FMCommunicationMessageException
	{
		Object obj = ((Object) (LogFactory.getInstance().getLog()));
	//    0    0:invokestatic    #23  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #27  <Method FMLog LogFactory.getLog()>
	//    2    6:astore_3        
		if(itag == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       30
		{
			if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          28
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), "\u8F6C\u6362Tag\u5BF9\u8C61\u7528\u6237\u4FC3\u9500\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//    7   15:aload_3         
	//    8   16:ldc1            #29  <Class BusinessOrder>
	//    9   18:invokevirtual   #35  <Method String Class.getName()>
	//   10   21:ldc1            #37  <String "\u8F6C\u6362Tag\u5BF9\u8C61\u7528\u6237\u4FC3\u9500\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   11   23:invokeinterface #43  <Method void FMLog.warn(String, String)>
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		}
		itag = ((ITag) (itag.getItemTags()));
	//   14   30:aload_0         
	//   15   31:invokeinterface #49  <Method ITag[] ITag.getItemTags()>
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
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u7528\u6237\u4FC3\u9500\u4FE1\u606F\u65F6\uFF0CTag\u5B50\u5BF9\u8C61\u4E3A\u7A7A");
	//   25   51:aload_3         
	//   26   52:ldc1            #29  <Class BusinessOrder>
	//   27   54:invokevirtual   #35  <Method String Class.getName()>
	//   28   57:ldc1            #51  <String " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u7528\u6237\u4FC3\u9500\u4FE1\u606F\u65F6\uFF0CTag\u5B50\u5BF9\u8C61\u4E3A\u7A7A">
	//   29   59:invokeinterface #43  <Method void FMLog.warn(String, String)>
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
		obj = ((Object) (new PromotionMessage()));
	//   32   66:new             #2   <Class PromotionMessage>
	//   33   69:dup             
	//   34   70:invokespecial   #52  <Method void PromotionMessage()>
	//   35   73:astore_3        
		int j = itag.length;
	//   36   74:aload_0         
	//   37   75:arraylength     
	//   38   76:istore_2        
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            174
		{
			ITag itag1 = ((ITag) (itag[i]));
	//   42   82:aload_0         
	//   43   83:iload_1         
	//   44   84:aaload          
	//   45   85:astore          4
			switch(itag1.getId())
	//*  46   87:aload           4
	//*  47   89:invokeinterface #56  <Method byte ITag.getId()>
			{
	//*  48   94:lookupswitch    3: default 128
	//	               -56: 159
	//	               50: 131
	//	               52: 145
	//*  49  128:goto            170
			case 50: // '2'
				((PromotionMessage) (obj)).setTitle(itag1.getStringVal());
	//   50  131:aload_3         
	//   51  132:aload           4
	//   52  134:invokeinterface #59  <Method String ITag.getStringVal()>
	//   53  139:invokevirtual   #63  <Method void setTitle(String)>
				break;

	//*  54  142:goto            170
			case 52: // '4'
				((PromotionMessage) (obj)).setDescription(itag1.getStringVal());
	//   55  145:aload_3         
	//   56  146:aload           4
	//   57  148:invokeinterface #59  <Method String ITag.getStringVal()>
	//   58  153:invokevirtual   #66  <Method void setDescription(String)>
				break;

	//*  59  156:goto            170
			case -56: 
				((PromotionMessage) (obj)).setCode(itag1.getStringVal());
	//   60  159:aload_3         
	//   61  160:aload           4
	//   62  162:invokeinterface #59  <Method String ITag.getStringVal()>
	//   63  167:invokevirtual   #69  <Method void setCode(String)>
				break;
			}
		}

	//   64  170:iload_1         
	//   65  171:iconst_1        
	//   66  172:iadd            
	//   67  173:istore_1        
	//   68  174:iload_1         
	//   69  175:iload_2         
	//   70  176:icmplt          82
		return ((PromotionMessage) (obj));
	//   71  179:aload_3         
	//   72  180:areturn         
	}

	public String getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String code>
	//    2    4:areturn         
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String description>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String title>
	//    2    4:areturn         
	}

	public void setCode(String s)
	{
		code = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field String code>
	//    3    5:return          
	}

	public void setDescription(String s)
	{
		description = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field String description>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field String title>
	//    3    5:return          
	}

	private String code;
	private String description;
	private String title;
}
