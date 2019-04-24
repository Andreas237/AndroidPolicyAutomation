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

public class Activity
{

	public Activity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static Activity fromTag(ITag itag)
		throws FMCommunicationMessageException
	{
		Object obj = ((Object) (LogFactory.getInstance().getLog()));
	//    0    0:invokestatic    #31  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #35  <Method FMLog LogFactory.getLog()>
	//    2    6:astore_3        
		if(itag == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       30
		{
			if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          28
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u6D3B\u52A8\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//    7   15:aload_3         
	//    8   16:ldc1            #37  <Class BusinessOrder>
	//    9   18:invokevirtual   #43  <Method String Class.getName()>
	//   10   21:ldc1            #45  <String " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u6D3B\u52A8\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   11   23:invokeinterface #51  <Method void FMLog.warn(String, String)>
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		}
		itag = ((ITag) (itag.getItemTags()));
	//   14   30:aload_0         
	//   15   31:invokeinterface #57  <Method ITag[] ITag.getItemTags()>
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
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u6D3B\u52A8\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//   25   51:aload_3         
	//   26   52:ldc1            #37  <Class BusinessOrder>
	//   27   54:invokevirtual   #43  <Method String Class.getName()>
	//   28   57:ldc1            #45  <String " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u6D3B\u52A8\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   29   59:invokeinterface #51  <Method void FMLog.warn(String, String)>
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
		obj = ((Object) (new Activity()));
	//   32   66:new             #2   <Class Activity>
	//   33   69:dup             
	//   34   70:invokespecial   #58  <Method void Activity()>
	//   35   73:astore_3        
		int j = itag.length;
	//   36   74:aload_0         
	//   37   75:arraylength     
	//   38   76:istore_2        
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            302
		{
			ITag itag1 = ((ITag) (itag[i]));
	//   42   82:aload_0         
	//   43   83:iload_1         
	//   44   84:aaload          
	//   45   85:astore          4
			switch(itag1.getId())
	//*  46   87:aload           4
	//*  47   89:invokeinterface #62  <Method byte ITag.getId()>
			{
	//*  48   94:tableswitch     -126 -115: default 156
	//	               -126 159
	//	               -125 173
	//	               -124 187
	//	               -123 201
	//	               -122 215
	//	               -121 229
	//	               -120 243
	//	               -119 298
	//	               -118 257
	//	               -117 271
	//	               -116 298
	//	               -115 285
	//*  49  156:goto            298
			case -126: 
				((Activity) (obj)).setName(itag1.getStringVal());
	//   50  159:aload_3         
	//   51  160:aload           4
	//   52  162:invokeinterface #65  <Method String ITag.getStringVal()>
	//   53  167:invokevirtual   #69  <Method void setName(String)>
				break;

	//*  54  170:goto            298
			case -125: 
				((Activity) (obj)).setCode(itag1.getStringVal());
	//   55  173:aload_3         
	//   56  174:aload           4
	//   57  176:invokeinterface #65  <Method String ITag.getStringVal()>
	//   58  181:invokevirtual   #72  <Method void setCode(String)>
				break;

	//*  59  184:goto            298
			case -124: 
				((Activity) (obj)).setStart(itag1.getStringVal());
	//   60  187:aload_3         
	//   61  188:aload           4
	//   62  190:invokeinterface #65  <Method String ITag.getStringVal()>
	//   63  195:invokevirtual   #75  <Method void setStart(String)>
				break;

	//*  64  198:goto            298
			case -123: 
				((Activity) (obj)).setEnd(itag1.getStringVal());
	//   65  201:aload_3         
	//   66  202:aload           4
	//   67  204:invokeinterface #65  <Method String ITag.getStringVal()>
	//   68  209:invokevirtual   #78  <Method void setEnd(String)>
				break;

	//*  69  212:goto            298
			case -122: 
				((Activity) (obj)).setTotal(itag1.getIntVal());
	//   70  215:aload_3         
	//   71  216:aload           4
	//   72  218:invokeinterface #82  <Method int ITag.getIntVal()>
	//   73  223:invokevirtual   #86  <Method void setTotal(int)>
				break;

	//*  74  226:goto            298
			case -121: 
				((Activity) (obj)).setRemainder(itag1.getIntVal());
	//   75  229:aload_3         
	//   76  230:aload           4
	//   77  232:invokeinterface #82  <Method int ITag.getIntVal()>
	//   78  237:invokevirtual   #89  <Method void setRemainder(int)>
				break;

	//*  79  240:goto            298
			case -120: 
				((Activity) (obj)).setDefinition(itag1.getStringVal());
	//   80  243:aload_3         
	//   81  244:aload           4
	//   82  246:invokeinterface #65  <Method String ITag.getStringVal()>
	//   83  251:invokevirtual   #92  <Method void setDefinition(String)>
				break;

	//*  84  254:goto            298
			case -118: 
				((Activity) (obj)).setPayChannel(itag1.getStringVal());
	//   85  257:aload_3         
	//   86  258:aload           4
	//   87  260:invokeinterface #65  <Method String ITag.getStringVal()>
	//   88  265:invokevirtual   #95  <Method void setPayChannel(String)>
				break;

	//*  89  268:goto            298
			case -117: 
				((Activity) (obj)).setPayMin(itag1.getIntVal());
	//   90  271:aload_3         
	//   91  272:aload           4
	//   92  274:invokeinterface #82  <Method int ITag.getIntVal()>
	//   93  279:invokevirtual   #98  <Method void setPayMin(int)>
				break;

	//*  94  282:goto            298
			case -115: 
				((Activity) (obj)).setStatus(((int) (itag1.getBytesVal()[0])));
	//   95  285:aload_3         
	//   96  286:aload           4
	//   97  288:invokeinterface #102 <Method byte[] ITag.getBytesVal()>
	//   98  293:iconst_0        
	//   99  294:baload          
	//  100  295:invokevirtual   #105 <Method void setStatus(int)>
				break;
			}
		}

	//  101  298:iload_1         
	//  102  299:iconst_1        
	//  103  300:iadd            
	//  104  301:istore_1        
	//  105  302:iload_1         
	//  106  303:iload_2         
	//  107  304:icmplt          82
		return ((Activity) (obj));
	//  108  307:aload_3         
	//  109  308:areturn         
	}

	public String getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field String code>
	//    2    4:areturn         
	}

	public String getDefinition()
	{
		return definition;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field String definition>
	//    2    4:areturn         
	}

	public String getEnd()
	{
		return end;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String end>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field String name>
	//    2    4:areturn         
	}

	public String getPayChannel()
	{
		return payChannel;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field String payChannel>
	//    2    4:areturn         
	}

	public int getPayMin()
	{
		return payMin;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int payMin>
	//    2    4:ireturn         
	}

	public int getRemainder()
	{
		return remainder;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field int remainder>
	//    2    4:ireturn         
	}

	public String getStart()
	{
		return start;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field String start>
	//    2    4:areturn         
	}

	public int getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int status>
	//    2    4:ireturn         
	}

	public int getTotal()
	{
		return total;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field int total>
	//    2    4:ireturn         
	}

	public void setCode(String s)
	{
		code = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field String code>
	//    3    5:return          
	}

	public void setDefinition(String s)
	{
		definition = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field String definition>
	//    3    5:return          
	}

	public void setEnd(String s)
	{
		end = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field String end>
	//    3    5:return          
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field String name>
	//    3    5:return          
	}

	public void setPayChannel(String s)
	{
		payChannel = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field String payChannel>
	//    3    5:return          
	}

	public void setPayMin(int i)
	{
		payMin = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field int payMin>
	//    3    5:return          
	}

	public void setRemainder(int i)
	{
		remainder = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #126 <Field int remainder>
	//    3    5:return          
	}

	public void setStart(String s)
	{
		start = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field String start>
	//    3    5:return          
	}

	public void setStatus(int i)
	{
		status = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #132 <Field int status>
	//    3    5:return          
	}

	public void setTotal(int i)
	{
		total = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #135 <Field int total>
	//    3    5:return          
	}

	private String code;
	private String definition;
	private String end;
	private String name;
	private String payChannel;
	private int payMin;
	private int remainder;
	private String start;
	private int status;
	private int total;
}
