// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ProvisioningConfig
{

	public ProvisioningConfig(String s, String s1, String s2, boolean flag, String s3, String s4, String s5, 
			String s6, String s7, String s8, String s9, String s10, String s11, byte byte0, 
			String s12, String s13, int i, int j, String s14, String s15)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mSsid = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field String mSsid>
		mBssid = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String mBssid>
		mPassphrase = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field String mPassphrase>
		mDhcp = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #41  <Field boolean mDhcp>
		mAddress = s3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #43  <Field String mAddress>
		mMask = s4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #45  <Field String mMask>
		mGateway = s5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #47  <Field String mGateway>
		mDns1 = s6;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #49  <Field String mDns1>
		mDns2 = s7;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #51  <Field String mDns2>
		mCountryCode = s8;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #53  <Field String mCountryCode>
		mCloudEnv = s9;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #55  <Field String mCloudEnv>
		mHomeWifiSsid = s10;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #57  <Field String mHomeWifiSsid>
		mCurrentSsid = s11;
	//   38   73:aload_0         
	//   39   74:aload           13
	//   40   76:putfield        #59  <Field String mCurrentSsid>
		mChannel = byte0;
	//   41   79:aload_0         
	//   42   80:iload           14
	//   43   82:putfield        #61  <Field byte mChannel>
		mName = s12;
	//   44   85:aload_0         
	//   45   86:aload           15
	//   46   88:putfield        #63  <Field String mName>
		mTimezone = s13;
	//   47   91:aload_0         
	//   48   92:aload           16
	//   49   94:putfield        #65  <Field String mTimezone>
		mUtcTime = i;
	//   50   97:aload_0         
	//   51   98:iload           17
	//   52  100:putfield        #67  <Field int mUtcTime>
		mTimeOffset = j;
	//   53  103:aload_0         
	//   54  104:iload           18
	//   55  106:putfield        #69  <Field int mTimeOffset>
		mServiceDiscoveryUrl = s14;
	//   56  109:aload_0         
	//   57  110:aload           19
	//   58  112:putfield        #71  <Field String mServiceDiscoveryUrl>
		mNtpHostnames = s15;
	//   59  115:aload_0         
	//   60  116:aload           20
	//   61  118:putfield        #73  <Field String mNtpHostnames>
	//   62  121:return          
	}

	public String getAddress()
	{
		return mAddress;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String mAddress>
	//    2    4:areturn         
	}

	public String getBssid()
	{
		return mBssid;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String mBssid>
	//    2    4:areturn         
	}

	public byte getChannel()
	{
		return mChannel;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field byte mChannel>
	//    2    4:ireturn         
	}

	public String getCloudEnv()
	{
		return mCloudEnv;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String mCloudEnv>
	//    2    4:areturn         
	}

	public String getCountryCode()
	{
		return mCountryCode;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String mCountryCode>
	//    2    4:areturn         
	}

	public String getCurrentSsid()
	{
		return mCurrentSsid;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String mCurrentSsid>
	//    2    4:areturn         
	}

	public boolean getDhcp()
	{
		return mDhcp;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean mDhcp>
	//    2    4:ireturn         
	}

	public String getDns1()
	{
		return mDns1;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String mDns1>
	//    2    4:areturn         
	}

	public String getDns2()
	{
		return mDns2;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String mDns2>
	//    2    4:areturn         
	}

	public String getGateway()
	{
		return mGateway;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String mGateway>
	//    2    4:areturn         
	}

	public String getHomeWifiSsid()
	{
		return mHomeWifiSsid;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String mHomeWifiSsid>
	//    2    4:areturn         
	}

	public String getMask()
	{
		return mMask;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String mMask>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String mName>
	//    2    4:areturn         
	}

	public String getNtpHostnames()
	{
		return mNtpHostnames;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String mNtpHostnames>
	//    2    4:areturn         
	}

	public String getPassphrase()
	{
		return mPassphrase;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String mPassphrase>
	//    2    4:areturn         
	}

	public String getServiceDiscoveryUrl()
	{
		return mServiceDiscoveryUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field String mServiceDiscoveryUrl>
	//    2    4:areturn         
	}

	public String getSsid()
	{
		return mSsid;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String mSsid>
	//    2    4:areturn         
	}

	public int getTimeOffset()
	{
		return mTimeOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int mTimeOffset>
	//    2    4:ireturn         
	}

	public String getTimezone()
	{
		return mTimezone;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String mTimezone>
	//    2    4:areturn         
	}

	public int getUtcTime()
	{
		return mUtcTime;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int mUtcTime>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #101 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #102 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ProvisioningConfig{mSsid=");
	//    4    8:aload_1         
	//    5    9:ldc1            #104 <String "ProvisioningConfig{mSsid=">
	//    6   11:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mSsid);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #35  <Field String mSsid>
	//   11   20:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mBssid=");
	//   13   24:aload_1         
	//   14   25:ldc1            #110 <String ",mBssid=">
	//   15   27:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mBssid);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #37  <Field String mBssid>
	//   20   36:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mPassphrase=");
	//   22   40:aload_1         
	//   23   41:ldc1            #112 <String ",mPassphrase=">
	//   24   43:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mPassphrase);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #39  <Field String mPassphrase>
	//   29   52:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(",mDhcp=");
	//   31   56:aload_1         
	//   32   57:ldc1            #114 <String ",mDhcp=">
	//   33   59:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mDhcp);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #41  <Field boolean mDhcp>
	//   38   68:invokevirtual   #117 <Method StringBuilder StringBuilder.append(boolean)>
	//   39   71:pop             
		stringbuilder.append(",mAddress=");
	//   40   72:aload_1         
	//   41   73:ldc1            #119 <String ",mAddress=">
	//   42   75:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mAddress);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #43  <Field String mAddress>
	//   47   84:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   48   87:pop             
		stringbuilder.append(",mMask=");
	//   49   88:aload_1         
	//   50   89:ldc1            #121 <String ",mMask=">
	//   51   91:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(mMask);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #45  <Field String mMask>
	//   56  100:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   57  103:pop             
		stringbuilder.append(",mGateway=");
	//   58  104:aload_1         
	//   59  105:ldc1            #123 <String ",mGateway=">
	//   60  107:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(mGateway);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #47  <Field String mGateway>
	//   65  116:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   66  119:pop             
		stringbuilder.append(",mDns1=");
	//   67  120:aload_1         
	//   68  121:ldc1            #125 <String ",mDns1=">
	//   69  123:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(mDns1);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #49  <Field String mDns1>
	//   74  132:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   75  135:pop             
		stringbuilder.append(",mDns2=");
	//   76  136:aload_1         
	//   77  137:ldc1            #127 <String ",mDns2=">
	//   78  139:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(mDns2);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #51  <Field String mDns2>
	//   83  148:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   84  151:pop             
		stringbuilder.append(",mCountryCode=");
	//   85  152:aload_1         
	//   86  153:ldc1            #129 <String ",mCountryCode=">
	//   87  155:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   88  158:pop             
		stringbuilder.append(mCountryCode);
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #53  <Field String mCountryCode>
	//   92  164:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   93  167:pop             
		stringbuilder.append(",mCloudEnv=");
	//   94  168:aload_1         
	//   95  169:ldc1            #131 <String ",mCloudEnv=">
	//   96  171:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   97  174:pop             
		stringbuilder.append(mCloudEnv);
	//   98  175:aload_1         
	//   99  176:aload_0         
	//  100  177:getfield        #55  <Field String mCloudEnv>
	//  101  180:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  102  183:pop             
		stringbuilder.append(",mHomeWifiSsid=");
	//  103  184:aload_1         
	//  104  185:ldc1            #133 <String ",mHomeWifiSsid=">
	//  105  187:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  106  190:pop             
		stringbuilder.append(mHomeWifiSsid);
	//  107  191:aload_1         
	//  108  192:aload_0         
	//  109  193:getfield        #57  <Field String mHomeWifiSsid>
	//  110  196:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  111  199:pop             
		stringbuilder.append(",mCurrentSsid=");
	//  112  200:aload_1         
	//  113  201:ldc1            #135 <String ",mCurrentSsid=">
	//  114  203:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  115  206:pop             
		stringbuilder.append(mCurrentSsid);
	//  116  207:aload_1         
	//  117  208:aload_0         
	//  118  209:getfield        #59  <Field String mCurrentSsid>
	//  119  212:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  120  215:pop             
		stringbuilder.append(",mChannel=");
	//  121  216:aload_1         
	//  122  217:ldc1            #137 <String ",mChannel=">
	//  123  219:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  124  222:pop             
		stringbuilder.append(((int) (mChannel)));
	//  125  223:aload_1         
	//  126  224:aload_0         
	//  127  225:getfield        #61  <Field byte mChannel>
	//  128  228:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//  129  231:pop             
		stringbuilder.append(",mName=");
	//  130  232:aload_1         
	//  131  233:ldc1            #142 <String ",mName=">
	//  132  235:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  133  238:pop             
		stringbuilder.append(mName);
	//  134  239:aload_1         
	//  135  240:aload_0         
	//  136  241:getfield        #63  <Field String mName>
	//  137  244:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  138  247:pop             
		stringbuilder.append(",mTimezone=");
	//  139  248:aload_1         
	//  140  249:ldc1            #144 <String ",mTimezone=">
	//  141  251:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  142  254:pop             
		stringbuilder.append(mTimezone);
	//  143  255:aload_1         
	//  144  256:aload_0         
	//  145  257:getfield        #65  <Field String mTimezone>
	//  146  260:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  147  263:pop             
		stringbuilder.append(",mUtcTime=");
	//  148  264:aload_1         
	//  149  265:ldc1            #146 <String ",mUtcTime=">
	//  150  267:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  151  270:pop             
		stringbuilder.append(mUtcTime);
	//  152  271:aload_1         
	//  153  272:aload_0         
	//  154  273:getfield        #67  <Field int mUtcTime>
	//  155  276:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//  156  279:pop             
		stringbuilder.append(",mTimeOffset=");
	//  157  280:aload_1         
	//  158  281:ldc1            #148 <String ",mTimeOffset=">
	//  159  283:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  160  286:pop             
		stringbuilder.append(mTimeOffset);
	//  161  287:aload_1         
	//  162  288:aload_0         
	//  163  289:getfield        #69  <Field int mTimeOffset>
	//  164  292:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//  165  295:pop             
		stringbuilder.append(",mServiceDiscoveryUrl=");
	//  166  296:aload_1         
	//  167  297:ldc1            #150 <String ",mServiceDiscoveryUrl=">
	//  168  299:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  169  302:pop             
		stringbuilder.append(mServiceDiscoveryUrl);
	//  170  303:aload_1         
	//  171  304:aload_0         
	//  172  305:getfield        #71  <Field String mServiceDiscoveryUrl>
	//  173  308:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  174  311:pop             
		stringbuilder.append(",mNtpHostnames=");
	//  175  312:aload_1         
	//  176  313:ldc1            #152 <String ",mNtpHostnames=">
	//  177  315:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  178  318:pop             
		stringbuilder.append(mNtpHostnames);
	//  179  319:aload_1         
	//  180  320:aload_0         
	//  181  321:getfield        #73  <Field String mNtpHostnames>
	//  182  324:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  183  327:pop             
		stringbuilder.append("}");
	//  184  328:aload_1         
	//  185  329:ldc1            #154 <String "}">
	//  186  331:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  187  334:pop             
		return stringbuilder.toString();
	//  188  335:aload_1         
	//  189  336:invokevirtual   #156 <Method String StringBuilder.toString()>
	//  190  339:areturn         
	}

	final String mAddress;
	final String mBssid;
	final byte mChannel;
	final String mCloudEnv;
	final String mCountryCode;
	final String mCurrentSsid;
	final boolean mDhcp;
	final String mDns1;
	final String mDns2;
	final String mGateway;
	final String mHomeWifiSsid;
	final String mMask;
	final String mName;
	final String mNtpHostnames;
	final String mPassphrase;
	final String mServiceDiscoveryUrl;
	final String mSsid;
	final int mTimeOffset;
	final String mTimezone;
	final int mUtcTime;
}
