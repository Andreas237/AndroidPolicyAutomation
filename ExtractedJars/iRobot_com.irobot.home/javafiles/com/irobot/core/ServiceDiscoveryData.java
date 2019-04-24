// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ServiceDiscoveryData
{

	public ServiceDiscoveryData(String s, String s1, String s2, String s3, String s4, String s5, int i, 
			String s6, String s7, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mAwsRegion = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String mAwsRegion>
		mApiGatewayAuthenticatedUrl = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String mApiGatewayAuthenticatedUrl>
		mApiGatewayUnauthenticatedUrl = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String mApiGatewayUnauthenticatedUrl>
		mIotServiceUrl = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field String mIotServiceUrl>
		mIotTopicPrefix = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #33  <Field String mIotTopicPrefix>
		mIrbtTopicPrefix = s5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #35  <Field String mIrbtTopicPrefix>
		mDiscoveryTTL = i;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #37  <Field int mDiscoveryTTL>
		mSrvcDeployId = s6;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #39  <Field String mSrvcDeployId>
		mAccountApiKey = s7;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #41  <Field String mAccountApiKey>
		mIsDuplicatedAsset = flag;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #43  <Field boolean mIsDuplicatedAsset>
		mHasDuplicatedAssetMigrated = flag1;
	//   32   61:aload_0         
	//   33   62:iload           11
	//   34   64:putfield        #45  <Field boolean mHasDuplicatedAssetMigrated>
	//   35   67:return          
	}

	public String getAccountApiKey()
	{
		return mAccountApiKey;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String mAccountApiKey>
	//    2    4:areturn         
	}

	public String getApiGatewayAuthenticatedUrl()
	{
		return mApiGatewayAuthenticatedUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String mApiGatewayAuthenticatedUrl>
	//    2    4:areturn         
	}

	public String getApiGatewayUnauthenticatedUrl()
	{
		return mApiGatewayUnauthenticatedUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String mApiGatewayUnauthenticatedUrl>
	//    2    4:areturn         
	}

	public String getAwsRegion()
	{
		return mAwsRegion;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String mAwsRegion>
	//    2    4:areturn         
	}

	public int getDiscoveryTTL()
	{
		return mDiscoveryTTL;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mDiscoveryTTL>
	//    2    4:ireturn         
	}

	public boolean getHasDuplicatedAssetMigrated()
	{
		return mHasDuplicatedAssetMigrated;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean mHasDuplicatedAssetMigrated>
	//    2    4:ireturn         
	}

	public String getIotServiceUrl()
	{
		return mIotServiceUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String mIotServiceUrl>
	//    2    4:areturn         
	}

	public String getIotTopicPrefix()
	{
		return mIotTopicPrefix;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mIotTopicPrefix>
	//    2    4:areturn         
	}

	public String getIrbtTopicPrefix()
	{
		return mIrbtTopicPrefix;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String mIrbtTopicPrefix>
	//    2    4:areturn         
	}

	public boolean getIsDuplicatedAsset()
	{
		return mIsDuplicatedAsset;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean mIsDuplicatedAsset>
	//    2    4:ireturn         
	}

	public String getSrvcDeployId()
	{
		return mSrvcDeployId;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String mSrvcDeployId>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ServiceDiscoveryData{mAwsRegion=");
	//    4    8:aload_1         
	//    5    9:ldc1            #66  <String "ServiceDiscoveryData{mAwsRegion=">
	//    6   11:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mAwsRegion);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #25  <Field String mAwsRegion>
	//   11   20:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mApiGatewayAuthenticatedUrl=");
	//   13   24:aload_1         
	//   14   25:ldc1            #72  <String ",mApiGatewayAuthenticatedUrl=">
	//   15   27:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mApiGatewayAuthenticatedUrl);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #27  <Field String mApiGatewayAuthenticatedUrl>
	//   20   36:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mApiGatewayUnauthenticatedUrl=");
	//   22   40:aload_1         
	//   23   41:ldc1            #74  <String ",mApiGatewayUnauthenticatedUrl=">
	//   24   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mApiGatewayUnauthenticatedUrl);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #29  <Field String mApiGatewayUnauthenticatedUrl>
	//   29   52:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(",mIotServiceUrl=");
	//   31   56:aload_1         
	//   32   57:ldc1            #76  <String ",mIotServiceUrl=">
	//   33   59:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mIotServiceUrl);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #31  <Field String mIotServiceUrl>
	//   38   68:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		stringbuilder.append(",mIotTopicPrefix=");
	//   40   72:aload_1         
	//   41   73:ldc1            #78  <String ",mIotTopicPrefix=">
	//   42   75:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mIotTopicPrefix);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #33  <Field String mIotTopicPrefix>
	//   47   84:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   48   87:pop             
		stringbuilder.append(",mIrbtTopicPrefix=");
	//   49   88:aload_1         
	//   50   89:ldc1            #80  <String ",mIrbtTopicPrefix=">
	//   51   91:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(mIrbtTopicPrefix);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #35  <Field String mIrbtTopicPrefix>
	//   56  100:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   57  103:pop             
		stringbuilder.append(",mDiscoveryTTL=");
	//   58  104:aload_1         
	//   59  105:ldc1            #82  <String ",mDiscoveryTTL=">
	//   60  107:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(mDiscoveryTTL);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #37  <Field int mDiscoveryTTL>
	//   65  116:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   66  119:pop             
		stringbuilder.append(",mSrvcDeployId=");
	//   67  120:aload_1         
	//   68  121:ldc1            #87  <String ",mSrvcDeployId=">
	//   69  123:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(mSrvcDeployId);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #39  <Field String mSrvcDeployId>
	//   74  132:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   75  135:pop             
		stringbuilder.append(",mAccountApiKey=");
	//   76  136:aload_1         
	//   77  137:ldc1            #89  <String ",mAccountApiKey=">
	//   78  139:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(mAccountApiKey);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #41  <Field String mAccountApiKey>
	//   83  148:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   84  151:pop             
		stringbuilder.append(",mIsDuplicatedAsset=");
	//   85  152:aload_1         
	//   86  153:ldc1            #91  <String ",mIsDuplicatedAsset=">
	//   87  155:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   88  158:pop             
		stringbuilder.append(mIsDuplicatedAsset);
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #43  <Field boolean mIsDuplicatedAsset>
	//   92  164:invokevirtual   #94  <Method StringBuilder StringBuilder.append(boolean)>
	//   93  167:pop             
		stringbuilder.append(",mHasDuplicatedAssetMigrated=");
	//   94  168:aload_1         
	//   95  169:ldc1            #96  <String ",mHasDuplicatedAssetMigrated=">
	//   96  171:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   97  174:pop             
		stringbuilder.append(mHasDuplicatedAssetMigrated);
	//   98  175:aload_1         
	//   99  176:aload_0         
	//  100  177:getfield        #45  <Field boolean mHasDuplicatedAssetMigrated>
	//  101  180:invokevirtual   #94  <Method StringBuilder StringBuilder.append(boolean)>
	//  102  183:pop             
		stringbuilder.append("}");
	//  103  184:aload_1         
	//  104  185:ldc1            #98  <String "}">
	//  105  187:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//  106  190:pop             
		return stringbuilder.toString();
	//  107  191:aload_1         
	//  108  192:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  109  195:areturn         
	}

	final String mAccountApiKey;
	final String mApiGatewayAuthenticatedUrl;
	final String mApiGatewayUnauthenticatedUrl;
	final String mAwsRegion;
	final int mDiscoveryTTL;
	final boolean mHasDuplicatedAssetMigrated;
	final String mIotServiceUrl;
	final String mIotTopicPrefix;
	final String mIrbtTopicPrefix;
	final boolean mIsDuplicatedAsset;
	final String mSrvcDeployId;
}
