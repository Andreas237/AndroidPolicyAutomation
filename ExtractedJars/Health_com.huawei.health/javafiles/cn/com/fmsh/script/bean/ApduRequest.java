// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.bean;

import cn.com.fmsh.script.exception.FMScriptHandleException;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.IOException;
import java.util.*;

public class ApduRequest
{

	public ApduRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		log = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #29  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #33  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #35  <Field FMLog log>
	//    6   14:aload_0         
	//    7   15:ldc1            #37  <String "ApduRequest">
	//    8   17:putfield        #39  <Field String logTag>
	//    9   20:aload_0         
	//   10   21:iconst_2        
	//   11   22:putfield        #41  <Field int expectationLength>
	//   12   25:aload_0         
	//   13   26:iconst_1        
	//   14   27:putfield        #43  <Field int idLength>
		expectationAndNextList = ((Map) (new HashMap()));
	//   15   30:aload_0         
	//   16   31:new             #45  <Class HashMap>
	//   17   34:dup             
	//   18   35:invokespecial   #46  <Method void HashMap()>
	//   19   38:putfield        #48  <Field Map expectationAndNextList>
	//   20   41:return          
	}

	public boolean addExpectationAndNext(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
		{
			log.warn("ApduRequest", "APDU\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C \u4E0E\u4E0B\u4E00\u6761\u6307\u4EE4\u6807\u8BC6\u589E\u52A0\u65F6\uFF0C\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C\u4E3A\u7A7A\uFF0C\u83B7\u53D6\u5931\u8D25");
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field FMLog log>
	//    4    8:ldc1            #37  <String "ApduRequest">
	//    5   10:ldc1            #53  <String "APDU\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C \u4E0E\u4E0B\u4E00\u6761\u6307\u4EE4\u6807\u8BC6\u589E\u52A0\u65F6\uFF0C\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C\u4E3A\u7A7A\uFF0C\u83B7\u53D6\u5931\u8D25">
	//    6   12:invokeinterface #59  <Method void FMLog.warn(String, String)>
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		}
		if(abyte0.length != 3)
	//*   9   19:aload_1         
	//*  10   20:arraylength     
	//*  11   21:iconst_3        
	//*  12   22:icmpeq          40
		{
			log.warn("ApduRequest", "APDU\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C \u4E0E\u4E0B\u4E00\u6761\u6307\u4EE4\u6807\u8BC6\u589E\u52A0\u65F6\uFF0C\u4E0B\u4E00\u6761\u6307\u4EE4\u4E0D\u5408\u6CD5");
	//   13   25:aload_0         
	//   14   26:getfield        #35  <Field FMLog log>
	//   15   29:ldc1            #37  <String "ApduRequest">
	//   16   31:ldc1            #61  <String "APDU\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C \u4E0E\u4E0B\u4E00\u6761\u6307\u4EE4\u6807\u8BC6\u589E\u52A0\u65F6\uFF0C\u4E0B\u4E00\u6761\u6307\u4EE4\u4E0D\u5408\u6CD5">
	//   17   33:invokeinterface #59  <Method void FMLog.warn(String, String)>
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
		} else
		{
			byte abyte1[] = Arrays.copyOf(abyte0, 2);
	//   20   40:aload_1         
	//   21   41:iconst_2        
	//   22   42:invokestatic    #67  <Method byte[] Arrays.copyOf(byte[], int)>
	//   23   45:astore_2        
			abyte0 = Arrays.copyOfRange(abyte0, 2, 3);
	//   24   46:aload_1         
	//   25   47:iconst_2        
	//   26   48:iconst_3        
	//   27   49:invokestatic    #71  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   28   52:astore_1        
			expectationAndNextList.put(((Object) (Integer.valueOf(FM_Bytes.bytesToInt(abyte1)))), ((Object) (Integer.valueOf(FM_Bytes.bytesToInt(abyte0)))));
	//   29   53:aload_0         
	//   30   54:getfield        #48  <Field Map expectationAndNextList>
	//   31   57:aload_2         
	//   32   58:invokestatic    #77  <Method int FM_Bytes.bytesToInt(byte[])>
	//   33   61:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   34   64:aload_1         
	//   35   65:invokestatic    #77  <Method int FM_Bytes.bytesToInt(byte[])>
	//   36   68:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   37   71:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   38   76:pop             
			return true;
	//   39   77:iconst_1        
	//   40   78:ireturn         
		}
	}

	public int compareTo(Object obj)
	{
		obj = ((Object) ((ApduRequest)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class ApduRequest>
	//    2    4:astore_1        
		if(id > ((ApduRequest) (obj)).getId())
	//*   3    5:aload_0         
	//*   4    6:getfield        #93  <Field int id>
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #97  <Method int getId()>
	//*   7   13:icmple          18
			return 1;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		return id >= ((ApduRequest) (obj)).getId() ? 0 : -1;
	//   10   18:aload_0         
	//   11   19:getfield        #93  <Field int id>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #97  <Method int getId()>
	//   14   26:icmpge          31
	//   15   29:iconst_m1       
	//   16   30:ireturn         
	//   17   31:iconst_0        
	//   18   32:ireturn         
	}

	public void fromBytes(byte abyte0[])
		throws FMScriptHandleException, IOException
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		else
			return;
	//    3    5:return          
	}

	public byte[] getApdu()
	{
		return apdu;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field byte[] apdu>
	//    2    4:areturn         
	}

	public int getExpectationCount()
	{
		return expectationAndNextList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Map expectationAndNextList>
	//    2    4:invokeinterface #112 <Method int Map.size()>
	//    3    9:ireturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int id>
	//    2    4:ireturn         
	}

	public int getNext4Expectation(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
		{
			log.warn("ApduRequest", "\u6839\u636EAPDU\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C\u83B7\u53D6\u4E0B\u4E00\u6307\u4EE4\u7684\u6807\u8BC6\u65F6\uFF0C\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C\u4E3A\u7A7A\uFF0C\u83B7\u53D6\u5931\u8D25");
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field FMLog log>
	//    4    8:ldc1            #37  <String "ApduRequest">
	//    5   10:ldc1            #115 <String "\u6839\u636EAPDU\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C\u83B7\u53D6\u4E0B\u4E00\u6307\u4EE4\u7684\u6807\u8BC6\u65F6\uFF0C\u8BF7\u6C42\u671F\u671B\u8FD4\u56DE\u7ED3\u679C\u4E3A\u7A7A\uFF0C\u83B7\u53D6\u5931\u8D25">
	//    6   12:invokeinterface #59  <Method void FMLog.warn(String, String)>
			return -1;
	//    7   17:iconst_m1       
	//    8   18:ireturn         
		}
		abyte0 = ((byte []) ((Integer)expectationAndNextList.get(((Object) (Integer.valueOf(FM_Bytes.bytesToInt(abyte0)))))));
	//    9   19:aload_0         
	//   10   20:getfield        #48  <Field Map expectationAndNextList>
	//   11   23:aload_1         
	//   12   24:invokestatic    #77  <Method int FM_Bytes.bytesToInt(byte[])>
	//   13   27:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   14   30:invokeinterface #119 <Method Object Map.get(Object)>
	//   15   35:checkcast       #79  <Class Integer>
	//   16   38:astore_1        
		if(abyte0 == null)
	//*  17   39:aload_1         
	//*  18   40:ifnonnull       45
			return -1;
	//   19   43:iconst_m1       
	//   20   44:ireturn         
		else
			return ((Integer) (abyte0)).intValue();
	//   21   45:aload_1         
	//   22   46:invokevirtual   #122 <Method int Integer.intValue()>
	//   23   49:ireturn         
	}

	public byte getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field byte tag>
	//    2    4:ireturn         
	}

	public boolean isHaveExpectation()
	{
		return !expectationAndNextList.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Map expectationAndNextList>
	//    2    4:invokeinterface #131 <Method boolean Map.isEmpty()>
	//    3    9:ifeq            14
	//    4   12:iconst_0        
	//    5   13:ireturn         
	//    6   14:iconst_1        
	//    7   15:ireturn         
	}

	public void setApdu(byte abyte0[])
	{
		apdu = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field byte[] apdu>
	//    3    5:return          
	}

	public void setId(int i)
	{
		id = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #93  <Field int id>
	//    3    5:return          
	}

	public void setTag(byte byte0)
	{
		tag = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #126 <Field byte tag>
	//    3    5:return          
	}

	public byte[] toBytes()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private byte apdu[];
	private Map expectationAndNextList;
	private final int expectationLength = 2;
	private int id;
	private final int idLength = 1;
	private FMLog log;
	private final String logTag = "ApduRequest";
	private byte tag;
}
