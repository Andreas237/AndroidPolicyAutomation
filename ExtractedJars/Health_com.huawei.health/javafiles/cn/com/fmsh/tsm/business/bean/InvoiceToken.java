// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;

// Referenced classes of package cn.com.fmsh.tsm.business.bean:
//			BusinessOrder

public class InvoiceToken
{

	public InvoiceToken()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static InvoiceToken fromTag(ITag itag)
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
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), "Tag\u751F\u6210\u53D1\u7968\u9886\u53D6\u51ED\u8BC1\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//    7   15:aload_3         
	//    8   16:ldc1            #29  <Class BusinessOrder>
	//    9   18:invokevirtual   #35  <Method String Class.getName()>
	//   10   21:ldc1            #37  <String "Tag\u751F\u6210\u53D1\u7968\u9886\u53D6\u51ED\u8BC1\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
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
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), "Tag\u751F\u6210\u53D1\u7968\u9886\u53D6\u51ED\u8BC1\u4FE1\u606F\u65F6\uFF0CTag\u5B50\u9879\u4E3A\u7A7A");
	//   25   51:aload_3         
	//   26   52:ldc1            #29  <Class BusinessOrder>
	//   27   54:invokevirtual   #35  <Method String Class.getName()>
	//   28   57:ldc1            #51  <String "Tag\u751F\u6210\u53D1\u7968\u9886\u53D6\u51ED\u8BC1\u4FE1\u606F\u65F6\uFF0CTag\u5B50\u9879\u4E3A\u7A7A">
	//   29   59:invokeinterface #43  <Method void FMLog.warn(String, String)>
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
		obj = ((Object) (new InvoiceToken()));
	//   32   66:new             #2   <Class InvoiceToken>
	//   33   69:dup             
	//   34   70:invokespecial   #52  <Method void InvoiceToken()>
	//   35   73:astore_3        
		int j = itag.length;
	//   36   74:aload_0         
	//   37   75:arraylength     
	//   38   76:istore_2        
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            155
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
	//*  48   94:lookupswitch    2: default 120
	//	               17: 123
	//	               66: 137
	//*  49  120:goto            151
			case 17: // '\021'
				((InvoiceToken) (obj)).setOrderId(itag1.getBytesVal());
	//   50  123:aload_3         
	//   51  124:aload           4
	//   52  126:invokeinterface #60  <Method byte[] ITag.getBytesVal()>
	//   53  131:invokevirtual   #64  <Method void setOrderId(byte[])>
				break;

	//*  54  134:goto            151
			case 66: // 'B'
				((InvoiceToken) (obj)).setToken(FM_Bytes.bytesToHexString(itag1.getBytesVal()));
	//   55  137:aload_3         
	//   56  138:aload           4
	//   57  140:invokeinterface #60  <Method byte[] ITag.getBytesVal()>
	//   58  145:invokestatic    #70  <Method String FM_Bytes.bytesToHexString(byte[])>
	//   59  148:invokevirtual   #74  <Method void setToken(String)>
				break;
			}
		}

	//   60  151:iload_1         
	//   61  152:iconst_1        
	//   62  153:iadd            
	//   63  154:istore_1        
	//   64  155:iload_1         
	//   65  156:iload_2         
	//   66  157:icmplt          82
		return ((InvoiceToken) (obj));
	//   67  160:aload_3         
	//   68  161:areturn         
	}

	public byte[] getOrderId()
	{
		return orderId;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field byte[] orderId>
	//    2    4:areturn         
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String token>
	//    2    4:areturn         
	}

	public void setOrderId(byte abyte0[])
	{
		orderId = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field byte[] orderId>
	//    3    5:return          
	}

	public void setToken(String s)
	{
		token = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field String token>
	//    3    5:return          
	}

	private byte orderId[];
	private String token;
}
