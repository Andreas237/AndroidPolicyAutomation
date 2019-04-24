// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public class n
	implements Serializable
{
	public static final class a extends Enum
	{

		public static a valueOf(String s1)
		{
			return (a)Enum.valueOf(com/startapp/android/publish/adsCommon/n$a, s1);
		//    0    0:ldc1            #2   <Class n$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class n$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) (e)).clone();
		//    0    0:getstatic       #38  <Field n$a[] e>
		//    1    3:invokevirtual   #53  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.n$a_3B_.clone()>
		//    2    6:checkcast       #49  <Class n$a[]>
		//    3    9:areturn         
		}

		public static final a a;
		public static final a b;
		public static final a c;
		public static final a d;
		private static final a e[];

		static 
		{
			a = new a("DISABLED", 0);
		//    0    0:new             #2   <Class n$a>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "DISABLED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void n$a(String, int)>
		//    5   10:putstatic       #24  <Field n$a a>
			b = new a("SKIP", 1);
		//    6   13:new             #2   <Class n$a>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "SKIP">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void n$a(String, int)>
		//   11   23:putstatic       #28  <Field n$a b>
			c = new a("CLOSE", 2);
		//   12   26:new             #2   <Class n$a>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "CLOSE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void n$a(String, int)>
		//   17   36:putstatic       #32  <Field n$a c>
			d = new a("BOTH", 3);
		//   18   39:new             #2   <Class n$a>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "BOTH">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void n$a(String, int)>
		//   23   49:putstatic       #36  <Field n$a d>
			e = (new a[] {
				a, b, c, d
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       a[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field n$a a>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #28  <Field n$a b>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #32  <Field n$a c>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #36  <Field n$a d>
		//   41   79:aastore         
		//   42   80:putstatic       #38  <Field n$a[] e>
		//*  43   83:return          
		}

		private a(String s1, int i1)
		{
			super(s1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #40  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public n()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		maxCachedVideos = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #45  <Field int maxCachedVideos>
		minAvailableStorageRequired = 20L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #46  <Long 20L>
	//    7   13:putfield        #49  <Field long minAvailableStorageRequired>
		rewardGrantPercentage = 100;
	//    8   16:aload_0         
	//    9   17:bipush          100
	//   10   19:putfield        #51  <Field int rewardGrantPercentage>
		videoErrorsThreshold = 2;
	//   11   22:aload_0         
	//   12   23:iconst_2        
	//   13   24:putfield        #53  <Field int videoErrorsThreshold>
		backMode = a.a;
	//   14   27:aload_0         
	//   15   28:getstatic       #55  <Field n$a n$a.a>
	//   16   31:putfield        #57  <Field n$a backMode>
		nativePlayerProbability = 100;
	//   17   34:aload_0         
	//   18   35:bipush          100
	//   19   37:putfield        #59  <Field int nativePlayerProbability>
		minTimeForCachingIndicator = 1;
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:putfield        #61  <Field int minTimeForCachingIndicator>
		maxTimeForCachingIndicator = 10;
	//   23   45:aload_0         
	//   24   46:bipush          10
	//   25   48:putfield        #63  <Field int maxTimeForCachingIndicator>
		videoFallback = false;
	//   26   51:aload_0         
	//   27   52:iconst_0        
	//   28   53:putfield        #65  <Field boolean videoFallback>
		progressive = false;
	//   29   56:aload_0         
	//   30   57:iconst_0        
	//   31   58:putfield        #67  <Field boolean progressive>
		progressiveBufferInPercentage = 20;
	//   32   61:aload_0         
	//   33   62:bipush          20
	//   34   64:putfield        #69  <Field int progressiveBufferInPercentage>
		progressiveInitialBufferInPercentage = 5;
	//   35   67:aload_0         
	//   36   68:iconst_5        
	//   37   69:putfield        #71  <Field int progressiveInitialBufferInPercentage>
		progressiveMinBufferToPlayFromCache = 30;
	//   38   72:aload_0         
	//   39   73:bipush          30
	//   40   75:putfield        #73  <Field int progressiveMinBufferToPlayFromCache>
		soundMode = "default";
	//   41   78:aload_0         
	//   42   79:ldc1            #75  <String "default">
	//   43   81:putfield        #77  <Field String soundMode>
		maxVastLevels = 7;
	//   44   84:aload_0         
	//   45   85:bipush          7
	//   46   87:putfield        #79  <Field int maxVastLevels>
		vastTimeout = 30000;
	//   47   90:aload_0         
	//   48   91:sipush          30000
	//   49   94:putfield        #81  <Field int vastTimeout>
		vastRetryTimeout = 60000;
	//   50   97:aload_0         
	//   51   98:ldc1            #82  <Int 60000>
	//   52  100:putfield        #84  <Field int vastRetryTimeout>
		maxVastCampaignExclude = 10;
	//   53  103:aload_0         
	//   54  104:bipush          10
	//   55  106:putfield        #86  <Field int maxVastCampaignExclude>
		vastMediaPicker = 0;
	//   56  109:aload_0         
	//   57  110:iconst_0        
	//   58  111:putfield        #88  <Field int vastMediaPicker>
		vastPreferredBitrate = 0;
	//   59  114:aload_0         
	//   60  115:iconst_0        
	//   61  116:putfield        #90  <Field int vastPreferredBitrate>
	//   62  119:return          
	}

	public a a()
	{
		return backMode;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field n$a backMode>
	//    2    4:areturn         
	}

	public int b()
	{
		return maxCachedVideos;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int maxCachedVideos>
	//    2    4:ireturn         
	}

	public long c()
	{
		return minAvailableStorageRequired;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long minAvailableStorageRequired>
	//    2    4:lreturn         
	}

	public int d()
	{
		return rewardGrantPercentage;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int rewardGrantPercentage>
	//    2    4:ireturn         
	}

	public int e()
	{
		return videoErrorsThreshold;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int videoErrorsThreshold>
	//    2    4:ireturn         
	}

	public long f()
	{
		return TimeUnit.SECONDS.toMillis(minTimeForCachingIndicator);
	//    0    0:getstatic       #104 <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:aload_0         
	//    2    4:getfield        #61  <Field int minTimeForCachingIndicator>
	//    3    7:i2l             
	//    4    8:invokevirtual   #108 <Method long TimeUnit.toMillis(long)>
	//    5   11:lreturn         
	}

	public long g()
	{
		return TimeUnit.SECONDS.toMillis(maxTimeForCachingIndicator);
	//    0    0:getstatic       #104 <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:aload_0         
	//    2    4:getfield        #63  <Field int maxTimeForCachingIndicator>
	//    3    7:i2l             
	//    4    8:invokevirtual   #108 <Method long TimeUnit.toMillis(long)>
	//    5   11:lreturn         
	}

	public boolean h()
	{
		return videoFallback;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean videoFallback>
	//    2    4:ireturn         
	}

	public boolean i()
	{
		return progressive;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean progressive>
	//    2    4:ireturn         
	}

	public int j()
	{
		return progressiveBufferInPercentage;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int progressiveBufferInPercentage>
	//    2    4:ireturn         
	}

	public int k()
	{
		return progressiveInitialBufferInPercentage;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int progressiveInitialBufferInPercentage>
	//    2    4:ireturn         
	}

	public int l()
	{
		return progressiveMinBufferToPlayFromCache;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int progressiveMinBufferToPlayFromCache>
	//    2    4:ireturn         
	}

	public String m()
	{
		return soundMode;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String soundMode>
	//    2    4:areturn         
	}

	public int n()
	{
		return maxVastLevels;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int maxVastLevels>
	//    2    4:ireturn         
	}

	public int o()
	{
		return vastTimeout;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int vastTimeout>
	//    2    4:ireturn         
	}

	public int p()
	{
		return vastRetryTimeout;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int vastRetryTimeout>
	//    2    4:ireturn         
	}

	public int q()
	{
		return maxVastCampaignExclude;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int maxVastCampaignExclude>
	//    2    4:ireturn         
	}

	public int r()
	{
		return vastMediaPicker;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int vastMediaPicker>
	//    2    4:ireturn         
	}

	public int s()
	{
		return vastPreferredBitrate;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int vastPreferredBitrate>
	//    2    4:ireturn         
	}

	private static final long serialVersionUID = 1L;
	private a backMode;
	private int maxCachedVideos;
	private int maxTimeForCachingIndicator;
	private int maxVastCampaignExclude;
	private int maxVastLevels;
	private long minAvailableStorageRequired;
	private int minTimeForCachingIndicator;
	private int nativePlayerProbability;
	private boolean progressive;
	private int progressiveBufferInPercentage;
	private int progressiveInitialBufferInPercentage;
	private int progressiveMinBufferToPlayFromCache;
	private int rewardGrantPercentage;
	private String soundMode;
	private int vastMediaPicker;
	private int vastPreferredBitrate;
	private int vastRetryTimeout;
	private int vastTimeout;
	private int videoErrorsThreshold;
	private boolean videoFallback;
}
