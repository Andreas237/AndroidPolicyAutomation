// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.core;

import cn.com.fmsh.communication.core.LinkInfo;
import cn.com.fmsh.util.log.*;
import java.lang.reflect.Array;
import java.util.*;

public class Configration
{
	public class Key
	{

		public byte exponent[];
		public int index;
		public byte modulus[];
		final Configration this$0;

		public Key()
		{
			this$0 = Configration.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field Configration this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			index = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #23  <Field int index>
		//    8   14:return          
		}
	}


	public Configration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		fmLog = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #46  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #50  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #52  <Field FMLog fmLog>
	//    6   14:aload_0         
	//    7   15:ldc1            #2   <Class Configration>
	//    8   17:invokevirtual   #58  <Method String Class.getName()>
	//    9   20:putfield        #60  <Field String logTag>
		orderSource = 0;
	//   10   23:aload_0         
	//   11   24:iconst_0        
	//   12   25:putfield        #62  <Field byte orderSource>
		companyCode = "";
	//   13   28:aload_0         
	//   14   29:ldc1            #64  <String "">
	//   15   31:putfield        #66  <Field String companyCode>
		sdkVersion = "";
	//   16   34:aload_0         
	//   17   35:ldc1            #64  <String "">
	//   18   37:putfield        #68  <Field String sdkVersion>
		logLevel = Level.ERROR;
	//   19   40:aload_0         
	//   20   41:getstatic       #73  <Field Level Level.ERROR>
	//   21   44:putfield        #75  <Field Level logLevel>
		aids = ((List) (new ArrayList()));
	//   22   47:aload_0         
	//   23   48:new             #77  <Class ArrayList>
	//   24   51:dup             
	//   25   52:invokespecial   #78  <Method void ArrayList()>
	//   26   55:putfield        #80  <Field List aids>
		serveres = ((Map) (new HashMap()));
	//   27   58:aload_0         
	//   28   59:new             #82  <Class HashMap>
	//   29   62:dup             
	//   30   63:invokespecial   #83  <Method void HashMap()>
	//   31   66:putfield        #85  <Field Map serveres>
		keyList = ((Map) (new HashMap()));
	//   32   69:aload_0         
	//   33   70:new             #82  <Class HashMap>
	//   34   73:dup             
	//   35   74:invokespecial   #83  <Method void HashMap()>
	//   36   77:putfield        #87  <Field Map keyList>
		businessAndServer = ((Map) (new HashMap()));
	//   37   80:aload_0         
	//   38   81:new             #82  <Class HashMap>
	//   39   84:dup             
	//   40   85:invokespecial   #83  <Method void HashMap()>
	//   41   88:putfield        #89  <Field Map businessAndServer>
	//   42   91:return          
	}

	public void addAid(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          11
		{
			return;
	//    6   10:return          
		} else
		{
			aids.add(((Object) (abyte0)));
	//    7   11:aload_0         
	//    8   12:getfield        #80  <Field List aids>
	//    9   15:aload_1         
	//   10   16:invokeinterface #98  <Method boolean List.add(Object)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	public void addBusinessAndServer(int i, String s)
	{
		if(s != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          19
			businessAndServer.put(((Object) (Integer.valueOf(i))), ((Object) (s)));
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field Map businessAndServer>
	//    4    8:iload_1         
	//    5    9:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//    6   12:aload_2         
	//    7   13:invokeinterface #112 <Method Object Map.put(Object, Object)>
	//    8   18:pop             
	//    9   19:return          
	}

	public void addKey(String s, int i, byte abyte0[], byte abyte1[])
	{
		if(s == null || abyte0 == null || abyte1 == null || i == -1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_3         
	//*   3    5:ifnull          18
	//*   4    8:aload           4
	//*   5   10:ifnull          18
	//*   6   13:iload_2         
	//*   7   14:iconst_m1       
	//*   8   15:icmpne          41
		{
			if(fmLog != null)
	//*   9   18:aload_0         
	//*  10   19:getfield        #52  <Field FMLog fmLog>
	//*  11   22:ifnull          40
				fmLog.warn(logTag, "\u52A0\u8F7D\u914D\u7F6E\u6587\u4EF6\u4E2D\u5BC6\u94A5\u4FE1\u606F\u65F6\uFF0C\u5F85\u52A0\u8F7D\u7684\u5BC6\u94A5\u4FE1\u606F\u65E0\u6548");
	//   12   25:aload_0         
	//   13   26:getfield        #52  <Field FMLog fmLog>
	//   14   29:aload_0         
	//   15   30:getfield        #60  <Field String logTag>
	//   16   33:ldc1            #116 <String "\u52A0\u8F7D\u914D\u7F6E\u6587\u4EF6\u4E2D\u5BC6\u94A5\u4FE1\u606F\u65F6\uFF0C\u5F85\u52A0\u8F7D\u7684\u5BC6\u94A5\u4FE1\u606F\u65E0\u6548">
	//   17   35:invokeinterface #122 <Method void FMLog.warn(String, String)>
			return;
	//   18   40:return          
		}
		Key key = new Key();
	//   19   41:new             #6   <Class Configration$Key>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:invokespecial   #125 <Method void Configration$Key(Configration)>
	//   23   49:astore          5
		key.index = i;
	//   24   51:aload           5
	//   25   53:iload_2         
	//   26   54:putfield        #128 <Field int Configration$Key.index>
		key.exponent = abyte0;
	//   27   57:aload           5
	//   28   59:aload_3         
	//   29   60:putfield        #131 <Field byte[] Configration$Key.exponent>
		key.modulus = abyte1;
	//   30   63:aload           5
	//   31   65:aload           4
	//   32   67:putfield        #134 <Field byte[] Configration$Key.modulus>
		abyte1 = ((byte []) ((List)keyList.get(((Object) (s)))));
	//   33   70:aload_0         
	//   34   71:getfield        #87  <Field Map keyList>
	//   35   74:aload_1         
	//   36   75:invokeinterface #138 <Method Object Map.get(Object)>
	//   37   80:checkcast       #94  <Class List>
	//   38   83:astore          4
		abyte0 = abyte1;
	//   39   85:aload           4
	//   40   87:astore_3        
		if(abyte1 == null)
	//*  41   88:aload           4
	//*  42   90:ifnonnull       113
		{
			abyte0 = ((byte []) (new ArrayList()));
	//   43   93:new             #77  <Class ArrayList>
	//   44   96:dup             
	//   45   97:invokespecial   #78  <Method void ArrayList()>
	//   46  100:astore_3        
			keyList.put(((Object) (s)), ((Object) (abyte0)));
	//   47  101:aload_0         
	//   48  102:getfield        #87  <Field Map keyList>
	//   49  105:aload_1         
	//   50  106:aload_3         
	//   51  107:invokeinterface #112 <Method Object Map.put(Object, Object)>
	//   52  112:pop             
		}
		((List) (abyte0)).add(((Object) (key)));
	//   53  113:aload_3         
	//   54  114:aload           5
	//   55  116:invokeinterface #98  <Method boolean List.add(Object)>
	//   56  121:pop             
	//   57  122:return          
	}

	public void addServers(String s, int i, int j, String s1)
	{
		if(s != null && s.length() > 0 && i > 0 && s1 != null && s1.length() > 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          69
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #146 <Method int String.length()>
	//*   4    8:ifle            69
	//*   5   11:iload_2         
	//*   6   12:ifle            69
	//*   7   15:aload           4
	//*   8   17:ifnull          69
	//*   9   20:aload           4
	//*  10   22:invokevirtual   #146 <Method int String.length()>
	//*  11   25:ifle            69
		{
			LinkInfo linkinfo = new LinkInfo();
	//   12   28:new             #148 <Class LinkInfo>
	//   13   31:dup             
	//   14   32:invokespecial   #149 <Method void LinkInfo()>
	//   15   35:astore          5
			linkinfo.setAddress(s);
	//   16   37:aload           5
	//   17   39:aload_1         
	//   18   40:invokevirtual   #153 <Method void LinkInfo.setAddress(String)>
			linkinfo.setPort(i);
	//   19   43:aload           5
	//   20   45:iload_2         
	//   21   46:invokevirtual   #157 <Method void LinkInfo.setPort(int)>
			linkinfo.setTimeout(j);
	//   22   49:aload           5
	//   23   51:iload_3         
	//   24   52:invokevirtual   #160 <Method void LinkInfo.setTimeout(int)>
			serveres.put(((Object) (s1)), ((Object) (linkinfo)));
	//   25   55:aload_0         
	//   26   56:getfield        #85  <Field Map serveres>
	//   27   59:aload           4
	//   28   61:aload           5
	//   29   63:invokeinterface #112 <Method Object Map.put(Object, Object)>
	//   30   68:pop             
		}
	//   31   69:return          
	}

	public byte[][] getAids()
	{
		return (byte[][])aids.toArray(((Object []) ((byte[][])Array.newInstance(Byte.TYPE, new int[] {
			1, 1
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field List aids>
	//    2    4:getstatic       #168 <Field Class Byte.TYPE>
	//    3    7:iconst_2        
	//    4    8:newarray        int[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:iconst_1        
	//    8   13:iastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:iconst_1        
	//   12   17:iastore         
	//   13   18:invokestatic    #174 <Method Object Array.newInstance(Class, int[])>
	//   14   21:checkcast       #176 <Class byte[][]>
	//   15   24:invokeinterface #180 <Method Object[] List.toArray(Object[])>
	//   16   29:checkcast       #176 <Class byte[][]>
	//   17   32:areturn         
	}

	public String getBusinessVersion()
	{
		return businessVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field String businessVersion>
	//    2    4:areturn         
	}

	public String getCompanyCode()
	{
		return companyCode;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String companyCode>
	//    2    4:areturn         
	}

	public String[] getKeies4Server()
	{
		return (String[])serveres.keySet().toArray(((Object []) (new String[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Map serveres>
	//    2    4:invokeinterface #190 <Method Set Map.keySet()>
	//    3    9:iconst_0        
	//    4   10:anewarray       String[]
	//    5   13:invokeinterface #193 <Method Object[] Set.toArray(Object[])>
	//    6   18:checkcast       #195 <Class String[]>
	//    7   21:areturn         
	}

	public Key[] getKeys(String s)
	{
		List list = (List)keyList.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Map keyList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #138 <Method Object Map.get(Object)>
	//    4   10:checkcast       #94  <Class List>
	//    5   13:astore_2        
		if(list != null)
	//*   6   14:aload_2         
	//*   7   15:ifnull          32
			return (Key[])list.toArray(((Object []) (new Key[0])));
	//    8   18:aload_2         
	//    9   19:iconst_0        
	//   10   20:anewarray       Key[]
	//   11   23:invokeinterface #180 <Method Object[] List.toArray(Object[])>
	//   12   28:checkcast       #199 <Class Configration$Key[]>
	//   13   31:areturn         
		if(fmLog != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #52  <Field FMLog fmLog>
	//*  16   36:ifnull          73
			fmLog.warn(logTag, (new StringBuilder("\u914D\u7F6E\u6587\u4EF6\u6CA1\u6709[")).append(s).append("]\u5BF9\u5E94\u7684key").toString());
	//   17   39:aload_0         
	//   18   40:getfield        #52  <Field FMLog fmLog>
	//   19   43:aload_0         
	//   20   44:getfield        #60  <Field String logTag>
	//   21   47:new             #201 <Class StringBuilder>
	//   22   50:dup             
	//   23   51:ldc1            #203 <String "\u914D\u7F6E\u6587\u4EF6\u6CA1\u6709[">
	//   24   53:invokespecial   #205 <Method void StringBuilder(String)>
	//   25   56:aload_1         
	//   26   57:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   27   60:ldc1            #211 <String "]\u5BF9\u5E94\u7684key">
	//   28   62:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   29   65:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   30   68:invokeinterface #122 <Method void FMLog.warn(String, String)>
		return null;
	//   31   73:aconst_null     
	//   32   74:areturn         
	}

	public LinkInfo getLinkInfo(String s)
	{
		return (LinkInfo)serveres.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Map serveres>
	//    2    4:aload_1         
	//    3    5:invokeinterface #138 <Method Object Map.get(Object)>
	//    4   10:checkcast       #148 <Class LinkInfo>
	//    5   13:areturn         
	}

	public Level getLogLevel()
	{
		return logLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Level logLevel>
	//    2    4:areturn         
	}

	public byte getOrderSource()
	{
		return orderSource;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field byte orderSource>
	//    2    4:ireturn         
	}

	public String getSdkVersion()
	{
		return sdkVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String sdkVersion>
	//    2    4:areturn         
	}

	public String getServer4Business(int i)
	{
		return (String)businessAndServer.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Map businessAndServer>
	//    2    4:iload_1         
	//    3    5:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #138 <Method Object Map.get(Object)>
	//    5   13:checkcast       #142 <Class String>
	//    6   16:areturn         
	}

	public String getServerDomain()
	{
		return serverDomain;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field String serverDomain>
	//    2    4:areturn         
	}

	public int getServerPort()
	{
		return serverPort;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field int serverPort>
	//    2    4:ireturn         
	}

	public int getSocketTimeout()
	{
		return socketTimeout;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field int socketTimeout>
	//    2    4:ireturn         
	}

	public byte[] getTerminalNumber()
	{
		return terminalNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field byte[] terminalNumber>
	//    2    4:areturn         
	}

	public byte[] getTerminalType()
	{
		return terminalType;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field byte[] terminalType>
	//    2    4:areturn         
	}

	public String getUserCode()
	{
		return userCode;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field String userCode>
	//    2    4:areturn         
	}

	public void setBusinessVersion(String s)
	{
		businessVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #183 <Field String businessVersion>
	//    3    5:return          
	}

	public void setCompanyCode(String s)
	{
		companyCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field String companyCode>
	//    3    5:return          
	}

	public void setLogLevel(Level level)
	{
		logLevel = level;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field Level logLevel>
	//    3    5:return          
	}

	public void setOrderSource(byte byte0)
	{
		orderSource = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field byte orderSource>
	//    3    5:return          
	}

	public void setSdkVersion(String s)
	{
		sdkVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field String sdkVersion>
	//    3    5:return          
	}

	public void setServerDomain(String s)
	{
		serverDomain = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #226 <Field String serverDomain>
	//    3    5:return          
	}

	public void setServerPort(int i)
	{
		serverPort = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #229 <Field int serverPort>
	//    3    5:return          
	}

	public void setSocketTimeout(int i)
	{
		socketTimeout = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #232 <Field int socketTimeout>
	//    3    5:return          
	}

	public void setTerminalNumber(byte abyte0[])
	{
		terminalNumber = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #236 <Field byte[] terminalNumber>
	//    3    5:return          
	}

	public void setTerminalType(byte abyte0[])
	{
		terminalType = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #239 <Field byte[] terminalType>
	//    3    5:return          
	}

	public void setUserCode(String s)
	{
		userCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #242 <Field String userCode>
	//    3    5:return          
	}

	private List aids;
	private Map businessAndServer;
	private String businessVersion;
	private String companyCode;
	private FMLog fmLog;
	private Map keyList;
	private Level logLevel;
	private final String logTag = ((Class) (cn/com/fmsh/tsm/business/core/Configration)).getName();
	private byte orderSource;
	private String sdkVersion;
	private String serverDomain;
	private int serverPort;
	private Map serveres;
	private int socketTimeout;
	private byte terminalNumber[];
	private byte terminalType[];
	private String userCode;
}
