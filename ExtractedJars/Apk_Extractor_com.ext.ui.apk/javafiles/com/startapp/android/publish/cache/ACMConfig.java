// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.startapp.android.publish.cache:
//			FailuresHandler

public class ACMConfig
	implements Serializable
{

	public ACMConfig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		adCacheTTL = 3600L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #36  <Long 3600L>
	//    4    8:putfield        #39  <Field long adCacheTTL>
		returnAdCacheTTL = 3600L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #36  <Long 3600L>
	//    7   15:putfield        #41  <Field long returnAdCacheTTL>
		autoLoad = ((Set) (EnumSet.of(((Enum) (com.startapp.android.publish.adsCommon.StartAppAd.AdMode.FULLPAGE)))));
	//    8   18:aload_0         
	//    9   19:getstatic       #46  <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.FULLPAGE>
	//   10   22:invokestatic    #52  <Method EnumSet EnumSet.of(Enum)>
	//   11   25:putfield        #54  <Field Set autoLoad>
		localCache = true;
	//   12   28:aload_0         
	//   13   29:iconst_1        
	//   14   30:putfield        #56  <Field boolean localCache>
		returnAdShouldLoadInBg = true;
	//   15   33:aload_0         
	//   16   34:iconst_1        
	//   17   35:putfield        #58  <Field boolean returnAdShouldLoadInBg>
		failuresHandler = new FailuresHandler();
	//   18   38:aload_0         
	//   19   39:new             #60  <Class FailuresHandler>
	//   20   42:dup             
	//   21   43:invokespecial   #61  <Method void FailuresHandler()>
	//   22   46:putfield        #63  <Field FailuresHandler failuresHandler>
		maxCacheSize = 7;
	//   23   49:aload_0         
	//   24   50:bipush          7
	//   25   52:putfield        #65  <Field int maxCacheSize>
	//   26   55:return          
	}

	public long getAdCacheTtl()
	{
		return TimeUnit.SECONDS.toMillis(adCacheTTL);
	//    0    0:getstatic       #74  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:aload_0         
	//    2    4:getfield        #39  <Field long adCacheTTL>
	//    3    7:invokevirtual   #78  <Method long TimeUnit.toMillis(long)>
	//    4   10:lreturn         
	}

	public Set getAutoLoad()
	{
		return autoLoad;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Set autoLoad>
	//    2    4:areturn         
	}

	public FailuresHandler getFailuresHandler()
	{
		return failuresHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field FailuresHandler failuresHandler>
	//    2    4:areturn         
	}

	public int getMaxCacheSize()
	{
		return maxCacheSize;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int maxCacheSize>
	//    2    4:ireturn         
	}

	public long getReturnAdCacheTTL()
	{
		return TimeUnit.SECONDS.toMillis(returnAdCacheTTL);
	//    0    0:getstatic       #74  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:aload_0         
	//    2    4:getfield        #41  <Field long returnAdCacheTTL>
	//    3    7:invokevirtual   #78  <Method long TimeUnit.toMillis(long)>
	//    4   10:lreturn         
	}

	public boolean isLocalCache()
	{
		return localCache;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean localCache>
	//    2    4:ireturn         
	}

	public void setMaxCacheSize(int i)
	{
		maxCacheSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field int maxCacheSize>
	//    3    5:return          
	}

	public boolean shouldReturnAdLoadInBg()
	{
		return returnAdShouldLoadInBg;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean returnAdShouldLoadInBg>
	//    2    4:ireturn         
	}

	public static final int DEFAULT_CACHE_SIZE = 7;
	private static final long serialVersionUID = 1L;
	private long adCacheTTL;
	private Set autoLoad;
	private FailuresHandler failuresHandler;
	private boolean localCache;
	private int maxCacheSize;
	private long returnAdCacheTTL;
	private boolean returnAdShouldLoadInBg;
}
