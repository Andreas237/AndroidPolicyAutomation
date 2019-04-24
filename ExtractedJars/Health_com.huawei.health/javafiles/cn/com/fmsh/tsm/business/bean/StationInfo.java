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

public class StationInfo
{

	public StationInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static StationInfo fromTag(ITag itag)
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
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u5730\u94C1\u7AD9\u4FE1\u606F\u5BF9\u8C61\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//    7   15:aload_3         
	//    8   16:ldc1            #29  <Class BusinessOrder>
	//    9   18:invokevirtual   #35  <Method String Class.getName()>
	//   10   21:ldc1            #37  <String " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u5730\u94C1\u7AD9\u4FE1\u606F\u5BF9\u8C61\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
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
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u53CD\u9988\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//   25   51:aload_3         
	//   26   52:ldc1            #29  <Class BusinessOrder>
	//   27   54:invokevirtual   #35  <Method String Class.getName()>
	//   28   57:ldc1            #51  <String " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u53CD\u9988\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   29   59:invokeinterface #43  <Method void FMLog.warn(String, String)>
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
		obj = ((Object) (new StationInfo()));
	//   32   66:new             #2   <Class StationInfo>
	//   33   69:dup             
	//   34   70:invokespecial   #52  <Method void StationInfo()>
	//   35   73:astore_3        
		int j = itag.length;
	//   36   74:aload_0         
	//   37   75:arraylength     
	//   38   76:istore_2        
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            166
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
	//*  48   94:tableswitch     -65 -63: default 120
	//	               -65 123
	//	               -64 137
	//	               -63 151
	//*  49  120:goto            162
			case -65: 
				((StationInfo) (obj)).setId(itag1.getStringVal());
	//   50  123:aload_3         
	//   51  124:aload           4
	//   52  126:invokeinterface #59  <Method String ITag.getStringVal()>
	//   53  131:invokevirtual   #63  <Method void setId(String)>
				break;

	//*  54  134:goto            162
			case -64: 
				((StationInfo) (obj)).setEname(itag1.getStringVal());
	//   55  137:aload_3         
	//   56  138:aload           4
	//   57  140:invokeinterface #59  <Method String ITag.getStringVal()>
	//   58  145:invokevirtual   #66  <Method void setEname(String)>
				break;

	//*  59  148:goto            162
			case -63: 
				((StationInfo) (obj)).setName(itag1.getStringVal());
	//   60  151:aload_3         
	//   61  152:aload           4
	//   62  154:invokeinterface #59  <Method String ITag.getStringVal()>
	//   63  159:invokevirtual   #69  <Method void setName(String)>
				break;
			}
		}

	//   64  162:iload_1         
	//   65  163:iconst_1        
	//   66  164:iadd            
	//   67  165:istore_1        
	//   68  166:iload_1         
	//   69  167:iload_2         
	//   70  168:icmplt          82
		return ((StationInfo) (obj));
	//   71  171:aload_3         
	//   72  172:areturn         
	}

	public String getEname()
	{
		return ename;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String ename>
	//    2    4:areturn         
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String id>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String name>
	//    2    4:areturn         
	}

	public void setEname(String s)
	{
		ename = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field String ename>
	//    3    5:return          
	}

	public void setId(String s)
	{
		id = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field String id>
	//    3    5:return          
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field String name>
	//    3    5:return          
	}

	private String ename;
	private String id;
	private String name;
}
