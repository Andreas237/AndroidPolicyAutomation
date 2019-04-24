// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.internal.config;

import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws.internal.config:
//			HttpClientConfig, SignerConfig, HostRegexToRegionMapping

public class InternalConfig
{
	public static class Factory
	{

		public static InternalConfig a()
		{
			return a;
		//    0    0:getstatic       #20  <Field InternalConfig a>
		//    1    3:areturn         
		}

		private static final InternalConfig a;

		static 
		{
			InternalConfig internalconfig;
			try
			{
				internalconfig = new InternalConfig();
		//    0    0:new             #6   <Class InternalConfig>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void InternalConfig()>
		//    3    7:astore_0        
			}
		//*   4    8:aload_0         
		//*   5    9:putstatic       #20  <Field InternalConfig a>
		//*   6   12:return          
		//*   7   13:astore_0        
		//*   8   14:new             #22  <Class IllegalStateException>
		//*   9   17:dup             
		//*  10   18:ldc1            #24  <String "Fatal: Failed to load the internal config for AWS Android SDK">
		//*  11   20:aload_0         
		//*  12   21:invokespecial   #27  <Method void IllegalStateException(String, Throwable)>
		//*  13   24:athrow          
			catch(RuntimeException runtimeexception)
		//*  14   25:astore_0        
			{
				throw runtimeexception;
		//   15   26:aload_0         
		//   16   27:athrow          
			}
			catch(Exception exception)
			{
				throw new IllegalStateException("Fatal: Failed to load the internal config for AWS Android SDK", ((Throwable) (exception)));
			}
			a = internalconfig;
		}
	}


	InternalConfig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #38  <Method SignerConfig f()>
	//    4    8:putfield        #40  <Field SignerConfig b>
	//    5   11:aload_0         
	//    6   12:invokestatic    #43  <Method Map c()>
	//    7   15:putfield        #45  <Field Map d>
	//    8   18:aload_0         
	//    9   19:invokestatic    #47  <Method Map e()>
	//   10   22:putfield        #49  <Field Map e>
	//   11   25:aload_0         
	//   12   26:invokestatic    #51  <Method Map d()>
	//   13   29:putfield        #53  <Field Map c>
	//   14   32:aload_0         
	//   15   33:invokestatic    #55  <Method Map b()>
	//   16   36:putfield        #57  <Field Map f>
	//   17   39:aload_0         
	//   18   40:invokestatic    #60  <Method List g()>
	//   19   43:putfield        #62  <Field List g>
	//   20   46:return          
	}

	private static Map b()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #64  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void HashMap()>
	//    3    7:astore_0        
		((Map) (hashmap)).put("AmazonCloudWatchClient", ((Object) (new HttpClientConfig("monitoring"))));
	//    4    8:aload_0         
	//    5    9:ldc1            #67  <String "AmazonCloudWatchClient">
	//    6   11:new             #69  <Class HttpClientConfig>
	//    7   14:dup             
	//    8   15:ldc1            #71  <String "monitoring">
	//    9   17:invokespecial   #74  <Method void HttpClientConfig(String)>
	//   10   20:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   11   25:pop             
		((Map) (hashmap)).put("AmazonSimpleDBClient", ((Object) (new HttpClientConfig("sdb"))));
	//   12   26:aload_0         
	//   13   27:ldc1            #82  <String "AmazonSimpleDBClient">
	//   14   29:new             #69  <Class HttpClientConfig>
	//   15   32:dup             
	//   16   33:ldc1            #84  <String "sdb">
	//   17   35:invokespecial   #74  <Method void HttpClientConfig(String)>
	//   18   38:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   19   43:pop             
		((Map) (hashmap)).put("AmazonSimpleEmailServiceClient", ((Object) (new HttpClientConfig("email"))));
	//   20   44:aload_0         
	//   21   45:ldc1            #86  <String "AmazonSimpleEmailServiceClient">
	//   22   47:new             #69  <Class HttpClientConfig>
	//   23   50:dup             
	//   24   51:ldc1            #88  <String "email">
	//   25   53:invokespecial   #74  <Method void HttpClientConfig(String)>
	//   26   56:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   27   61:pop             
		((Map) (hashmap)).put("AWSSecurityTokenServiceClient", ((Object) (new HttpClientConfig("sts"))));
	//   28   62:aload_0         
	//   29   63:ldc1            #90  <String "AWSSecurityTokenServiceClient">
	//   30   65:new             #69  <Class HttpClientConfig>
	//   31   68:dup             
	//   32   69:ldc1            #92  <String "sts">
	//   33   71:invokespecial   #74  <Method void HttpClientConfig(String)>
	//   34   74:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   35   79:pop             
		((Map) (hashmap)).put("AmazonCognitoIdentityClient", ((Object) (new HttpClientConfig("cognito-identity"))));
	//   36   80:aload_0         
	//   37   81:ldc1            #94  <String "AmazonCognitoIdentityClient">
	//   38   83:new             #69  <Class HttpClientConfig>
	//   39   86:dup             
	//   40   87:ldc1            #96  <String "cognito-identity">
	//   41   89:invokespecial   #74  <Method void HttpClientConfig(String)>
	//   42   92:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   43   97:pop             
		((Map) (hashmap)).put("AmazonCognitoIdentityProviderClient", ((Object) (new HttpClientConfig("cognito-idp"))));
	//   44   98:aload_0         
	//   45   99:ldc1            #98  <String "AmazonCognitoIdentityProviderClient">
	//   46  101:new             #69  <Class HttpClientConfig>
	//   47  104:dup             
	//   48  105:ldc1            #100 <String "cognito-idp">
	//   49  107:invokespecial   #74  <Method void HttpClientConfig(String)>
	//   50  110:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   51  115:pop             
		((Map) (hashmap)).put("AmazonCognitoSyncClient", ((Object) (new HttpClientConfig("cognito-sync"))));
	//   52  116:aload_0         
	//   53  117:ldc1            #102 <String "AmazonCognitoSyncClient">
	//   54  119:new             #69  <Class HttpClientConfig>
	//   55  122:dup             
	//   56  123:ldc1            #104 <String "cognito-sync">
	//   57  125:invokespecial   #74  <Method void HttpClientConfig(String)>
	//   58  128:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   59  133:pop             
		((Map) (hashmap)).put("AmazonKinesisFirehoseClient", ((Object) (new HttpClientConfig("firehose"))));
	//   60  134:aload_0         
	//   61  135:ldc1            #106 <String "AmazonKinesisFirehoseClient">
	//   62  137:new             #69  <Class HttpClientConfig>
	//   63  140:dup             
	//   64  141:ldc1            #108 <String "firehose">
	//   65  143:invokespecial   #74  <Method void HttpClientConfig(String)>
	//   66  146:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   67  151:pop             
		((Map) (hashmap)).put("AWSIotClient", ((Object) (new HttpClientConfig("execute-api"))));
	//   68  152:aload_0         
	//   69  153:ldc1            #110 <String "AWSIotClient">
	//   70  155:new             #69  <Class HttpClientConfig>
	//   71  158:dup             
	//   72  159:ldc1            #112 <String "execute-api">
	//   73  161:invokespecial   #74  <Method void HttpClientConfig(String)>
	//   74  164:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   75  169:pop             
		return ((Map) (hashmap));
	//   76  170:aload_0         
	//   77  171:areturn         
	}

	private static Map c()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #64  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void HashMap()>
	//    3    7:astore_0        
		((Map) (hashmap)).put("eu-central-1", ((Object) (new SignerConfig("AWS4SignerType"))));
	//    4    8:aload_0         
	//    5    9:ldc1            #116 <String "eu-central-1">
	//    6   11:new             #118 <Class SignerConfig>
	//    7   14:dup             
	//    8   15:ldc1            #120 <String "AWS4SignerType">
	//    9   17:invokespecial   #121 <Method void SignerConfig(String)>
	//   10   20:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   11   25:pop             
		((Map) (hashmap)).put("cn-north-1", ((Object) (new SignerConfig("AWS4SignerType"))));
	//   12   26:aload_0         
	//   13   27:ldc1            #123 <String "cn-north-1">
	//   14   29:new             #118 <Class SignerConfig>
	//   15   32:dup             
	//   16   33:ldc1            #120 <String "AWS4SignerType">
	//   17   35:invokespecial   #121 <Method void SignerConfig(String)>
	//   18   38:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   19   43:pop             
		return ((Map) (hashmap));
	//   20   44:aload_0         
	//   21   45:areturn         
	}

	private static Map d()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #64  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void HashMap()>
	//    3    7:astore_0        
		((Map) (hashmap)).put("s3/eu-central-1", ((Object) (new SignerConfig("AWSS3V4SignerType"))));
	//    4    8:aload_0         
	//    5    9:ldc1            #126 <String "s3/eu-central-1">
	//    6   11:new             #118 <Class SignerConfig>
	//    7   14:dup             
	//    8   15:ldc1            #128 <String "AWSS3V4SignerType">
	//    9   17:invokespecial   #121 <Method void SignerConfig(String)>
	//   10   20:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   11   25:pop             
		((Map) (hashmap)).put("s3/cn-north-1", ((Object) (new SignerConfig("AWSS3V4SignerType"))));
	//   12   26:aload_0         
	//   13   27:ldc1            #130 <String "s3/cn-north-1">
	//   14   29:new             #118 <Class SignerConfig>
	//   15   32:dup             
	//   16   33:ldc1            #128 <String "AWSS3V4SignerType">
	//   17   35:invokespecial   #121 <Method void SignerConfig(String)>
	//   18   38:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   19   43:pop             
		return ((Map) (hashmap));
	//   20   44:aload_0         
	//   21   45:areturn         
	}

	private static Map e()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #64  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void HashMap()>
	//    3    7:astore_0        
		((Map) (hashmap)).put("ec2", ((Object) (new SignerConfig("QueryStringSignerType"))));
	//    4    8:aload_0         
	//    5    9:ldc1            #132 <String "ec2">
	//    6   11:new             #118 <Class SignerConfig>
	//    7   14:dup             
	//    8   15:ldc1            #134 <String "QueryStringSignerType">
	//    9   17:invokespecial   #121 <Method void SignerConfig(String)>
	//   10   20:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   11   25:pop             
		((Map) (hashmap)).put("email", ((Object) (new SignerConfig("AWS3SignerType"))));
	//   12   26:aload_0         
	//   13   27:ldc1            #88  <String "email">
	//   14   29:new             #118 <Class SignerConfig>
	//   15   32:dup             
	//   16   33:ldc1            #136 <String "AWS3SignerType">
	//   17   35:invokespecial   #121 <Method void SignerConfig(String)>
	//   18   38:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   19   43:pop             
		((Map) (hashmap)).put("s3", ((Object) (new SignerConfig("S3SignerType"))));
	//   20   44:aload_0         
	//   21   45:ldc1            #138 <String "s3">
	//   22   47:new             #118 <Class SignerConfig>
	//   23   50:dup             
	//   24   51:ldc1            #140 <String "S3SignerType">
	//   25   53:invokespecial   #121 <Method void SignerConfig(String)>
	//   26   56:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   27   61:pop             
		((Map) (hashmap)).put("sdb", ((Object) (new SignerConfig("QueryStringSignerType"))));
	//   28   62:aload_0         
	//   29   63:ldc1            #84  <String "sdb">
	//   30   65:new             #118 <Class SignerConfig>
	//   31   68:dup             
	//   32   69:ldc1            #134 <String "QueryStringSignerType">
	//   33   71:invokespecial   #121 <Method void SignerConfig(String)>
	//   34   74:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//   35   79:pop             
		return ((Map) (hashmap));
	//   36   80:aload_0         
	//   37   81:areturn         
	}

	private static SignerConfig f()
	{
		return new SignerConfig("AWS4SignerType");
	//    0    0:new             #118 <Class SignerConfig>
	//    1    3:dup             
	//    2    4:ldc1            #120 <String "AWS4SignerType">
	//    3    6:invokespecial   #121 <Method void SignerConfig(String)>
	//    4    9:areturn         
	}

	private static List g()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #142 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #143 <Method void ArrayList()>
	//    3    7:astore_0        
		((List) (arraylist)).add(((Object) (new HostRegexToRegionMapping("(.+\\.)?s3\\.amazonaws\\.com", "us-east-1"))));
	//    4    8:aload_0         
	//    5    9:new             #145 <Class HostRegexToRegionMapping>
	//    6   12:dup             
	//    7   13:ldc1            #147 <String "(.+\\.)?s3\\.amazonaws\\.com">
	//    8   15:ldc1            #149 <String "us-east-1">
	//    9   17:invokespecial   #152 <Method void HostRegexToRegionMapping(String, String)>
	//   10   20:invokeinterface #158 <Method boolean List.add(Object)>
	//   11   25:pop             
		((List) (arraylist)).add(((Object) (new HostRegexToRegionMapping("(.+\\.)?s3-external-1\\.amazonaws\\.com", "us-east-1"))));
	//   12   26:aload_0         
	//   13   27:new             #145 <Class HostRegexToRegionMapping>
	//   14   30:dup             
	//   15   31:ldc1            #160 <String "(.+\\.)?s3-external-1\\.amazonaws\\.com">
	//   16   33:ldc1            #149 <String "us-east-1">
	//   17   35:invokespecial   #152 <Method void HostRegexToRegionMapping(String, String)>
	//   18   38:invokeinterface #158 <Method boolean List.add(Object)>
	//   19   43:pop             
		((List) (arraylist)).add(((Object) (new HostRegexToRegionMapping("(.+\\.)?s3-fips-us-gov-west-1\\.amazonaws\\.com", "us-gov-west-1"))));
	//   20   44:aload_0         
	//   21   45:new             #145 <Class HostRegexToRegionMapping>
	//   22   48:dup             
	//   23   49:ldc1            #162 <String "(.+\\.)?s3-fips-us-gov-west-1\\.amazonaws\\.com">
	//   24   51:ldc1            #164 <String "us-gov-west-1">
	//   25   53:invokespecial   #152 <Method void HostRegexToRegionMapping(String, String)>
	//   26   56:invokeinterface #158 <Method boolean List.add(Object)>
	//   27   61:pop             
		return ((List) (arraylist));
	//   28   62:aload_0         
	//   29   63:areturn         
	}

	public List a()
	{
		return Collections.unmodifiableList(g);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List g>
	//    2    4:invokestatic    #171 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	private static final Log a = LogFactory.getLog(com/amazonaws/internal/config/InternalConfig);
	private final SignerConfig b = f();
	private final Map c = d();
	private final Map d = c();
	private final Map e = e();
	private final Map f = b();
	private final List g = g();

	static 
	{
	//    0    0:ldc1            #2   <Class InternalConfig>
	//    1    2:invokestatic    #29  <Method Log LogFactory.getLog(Class)>
	//    2    5:putstatic       #31  <Field Log a>
	//*   3    8:return          
	}
}
