// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.server;

import com.huawei.openalliance.ad.beans.base.RspBean;
import com.huawei.openalliance.ad.beans.metadata.MagazinelockBoxPara;
import com.huawei.openalliance.ad.beans.metadata.ReduceDisturbRule;
import com.huawei.openalliance.ad.utils.p;
import java.util.List;

public class AppConfigRsp extends RspBean
{

	public AppConfigRsp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void RspBean()>
		retcode = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #50  <Field int retcode>
		splashCacheNum = 10;
	//    5    9:aload_0         
	//    6   10:bipush          10
	//    7   12:putfield        #52  <Field int splashCacheNum>
		splashshow = 3000;
	//    8   15:aload_0         
	//    9   16:sipush          3000
	//   10   19:putfield        #54  <Field int splashshow>
		splashmode = 1;
	//   11   22:aload_0         
	//   12   23:iconst_1        
	//   13   24:putfield        #56  <Field int splashmode>
		splashSkipArea = 0;
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:putfield        #58  <Field int splashSkipArea>
		gifShowTimeUpperLimit = 8000;
	//   17   32:aload_0         
	//   18   33:sipush          8000
	//   19   36:putfield        #60  <Field int gifShowTimeUpperLimit>
		gifShowTimeLowerLimitEachFrame = 100;
	//   20   39:aload_0         
	//   21   40:bipush          100
	//   22   42:putfield        #62  <Field int gifShowTimeLowerLimitEachFrame>
		gifSizeUpperLimit = 0x6400000;
	//   23   45:aload_0         
	//   24   46:ldc1            #63  <Int 0x6400000>
	//   25   48:putfield        #65  <Field int gifSizeUpperLimit>
		imgSizeUpperLimit = 0x3200000;
	//   26   51:aload_0         
	//   27   52:ldc1            #66  <Int 0x3200000>
	//   28   54:putfield        #68  <Field int imgSizeUpperLimit>
		sloganShowTime = 2000;
	//   29   57:aload_0         
	//   30   58:sipush          2000
	//   31   61:putfield        #70  <Field int sloganShowTime>
		splashShowTimeInterval = 0L;
	//   32   64:aload_0         
	//   33   65:lconst_0        
	//   34   66:putfield        #72  <Field long splashShowTimeInterval>
		sloganShowMinTimeRealMode = 300L;
	//   35   69:aload_0         
	//   36   70:ldc2w           #73  <Long 300L>
	//   37   73:putfield        #76  <Field long sloganShowMinTimeRealMode>
		splashUserAppDayImpFc = 0;
	//   38   76:aload_0         
	//   39   77:iconst_0        
	//   40   78:putfield        #78  <Field int splashUserAppDayImpFc>
	//   41   81:return          
	}

	private int getCacheModeSloganShowTime()
	{
		if(sloganShowTime >= 0 && sloganShowTime <= 5000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field int sloganShowTime>
	//*   2    4:iflt            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #70  <Field int sloganShowTime>
	//*   5   11:sipush          5000
	//*   6   14:icmpgt          22
			return sloganShowTime;
	//    7   17:aload_0         
	//    8   18:getfield        #70  <Field int sloganShowTime>
	//    9   21:ireturn         
		else
			return 0;
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private int getRealtimeModeSloganShowTime()
	{
		if(sloganShowTime >= 500 && sloganShowTime <= 5000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field int sloganShowTime>
	//*   2    4:sipush          500
	//*   3    7:icmplt          25
	//*   4   10:aload_0         
	//*   5   11:getfield        #70  <Field int sloganShowTime>
	//*   6   14:sipush          5000
	//*   7   17:icmpgt          25
			return sloganShowTime;
	//    8   20:aload_0         
	//    9   21:getfield        #70  <Field int sloganShowTime>
	//   10   24:ireturn         
		else
			return 2000;
	//   11   25:sipush          2000
	//   12   28:ireturn         
	}

	private String getRulesString(List list, String s)
	{
		if(list != null && list.size() <= 30)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #89  <Method int List.size()>
	//*   4   10:bipush          30
	//*   5   12:icmpgt          23
			return p.b(((Object) (reduceDisturbRule)));
	//    6   15:aload_0         
	//    7   16:getfield        #91  <Field ReduceDisturbRule reduceDisturbRule>
	//    8   19:invokestatic    #97  <Method String p.b(Object)>
	//    9   22:areturn         
		else
			return s;
	//   10   23:aload_2         
	//   11   24:areturn         
	}

	public Integer getConfigRefreshInterval()
	{
		return configRefreshInterval;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Integer configRefreshInterval>
	//    2    4:areturn         
	}

	public int getGifSizeUpperLimit(int i)
	{
		if(gifSizeUpperLimit > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int gifSizeUpperLimit>
	//*   2    4:ifle            12
			return gifSizeUpperLimit;
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field int gifSizeUpperLimit>
	//    5   11:ireturn         
		else
			return i;
	//    6   12:iload_1         
	//    7   13:ireturn         
	}

	public int getGifTimeLowerLimitFrame(int i)
	{
		if(gifShowTimeLowerLimitEachFrame > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field int gifShowTimeLowerLimitEachFrame>
	//*   2    4:ifle            12
			return gifShowTimeLowerLimitEachFrame;
	//    3    7:aload_0         
	//    4    8:getfield        #62  <Field int gifShowTimeLowerLimitEachFrame>
	//    5   11:ireturn         
		else
			return i;
	//    6   12:iload_1         
	//    7   13:ireturn         
	}

	public int getGifTimeUpperLimit(int i)
	{
		if(gifShowTimeUpperLimit >= 2000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int gifShowTimeUpperLimit>
	//*   2    4:sipush          2000
	//*   3    7:icmplt          15
			return gifShowTimeUpperLimit;
	//    4   10:aload_0         
	//    5   11:getfield        #60  <Field int gifShowTimeUpperLimit>
	//    6   14:ireturn         
		else
			return i;
	//    7   15:iload_1         
	//    8   16:ireturn         
	}

	public String getGlobalSwitch()
	{
		return globalSwitch;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field String globalSwitch>
	//    2    4:areturn         
	}

	public int getImgSizeUpperLimit(int i)
	{
		if(imgSizeUpperLimit > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field int imgSizeUpperLimit>
	//*   2    4:ifle            12
			return imgSizeUpperLimit;
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field int imgSizeUpperLimit>
	//    5   11:ireturn         
		else
			return i;
	//    6   12:iload_1         
	//    7   13:ireturn         
	}

	public Integer getLandingMenu()
	{
		return landingMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Integer landingMenu>
	//    2    4:areturn         
	}

	public Integer getLandpageAppPrompt()
	{
		return landpageAppPrompt;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Integer landpageAppPrompt>
	//    2    4:areturn         
	}

	public String getLandpageAppWhiteList()
	{
		return landpageAppWhiteList;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field String landpageAppWhiteList>
	//    2    4:areturn         
	}

	public MagazinelockBoxPara getMagazinelockBoxPara()
	{
		return magazinelockBoxPara;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field MagazinelockBoxPara magazinelockBoxPara>
	//    2    4:areturn         
	}

	public String getReason()
	{
		return reason;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field String reason>
	//    2    4:areturn         
	}

	public String getReduceDisturbRule(String s)
	{
		if(reduceDisturbRule != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field ReduceDisturbRule reduceDisturbRule>
	//*   2    4:ifnull          20
			return getRulesString(reduceDisturbRule.getRuleList__(), s);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #91  <Field ReduceDisturbRule reduceDisturbRule>
	//    6   12:invokevirtual   #136 <Method List ReduceDisturbRule.getRuleList__()>
	//    7   15:aload_1         
	//    8   16:invokespecial   #138 <Method String getRulesString(List, String)>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public int getRetcode()
	{
		return retcode;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int retcode>
	//    2    4:ireturn         
	}

	public String getServerStore()
	{
		return serverStore;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String serverStore>
	//    2    4:areturn         
	}

	public long getSloganShowMinTimeRealMode()
	{
		if(sloganShowMinTimeRealMode >= 0L && sloganShowMinTimeRealMode <= 5000L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field long sloganShowMinTimeRealMode>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:iflt            25
	//*   5    9:aload_0         
	//*   6   10:getfield        #76  <Field long sloganShowMinTimeRealMode>
	//*   7   13:ldc2w           #145 <Long 5000L>
	//*   8   16:lcmp            
	//*   9   17:ifgt            25
			return sloganShowMinTimeRealMode;
	//   10   20:aload_0         
	//   11   21:getfield        #76  <Field long sloganShowMinTimeRealMode>
	//   12   24:lreturn         
		else
			return 300L;
	//   13   25:ldc2w           #73  <Long 300L>
	//   14   28:lreturn         
	}

	public int getSloganShowTime()
	{
		if(1 == splashmode)
	//*   0    0:iconst_1        
	//*   1    1:aload_0         
	//*   2    2:getfield        #56  <Field int splashmode>
	//*   3    5:icmpne          13
			return getCacheModeSloganShowTime();
	//    4    8:aload_0         
	//    5    9:invokespecial   #149 <Method int getCacheModeSloganShowTime()>
	//    6   12:ireturn         
		if(2 == splashmode)
	//*   7   13:iconst_2        
	//*   8   14:aload_0         
	//*   9   15:getfield        #56  <Field int splashmode>
	//*  10   18:icmpne          26
			return getRealtimeModeSloganShowTime();
	//   11   21:aload_0         
	//   12   22:invokespecial   #151 <Method int getRealtimeModeSloganShowTime()>
	//   13   25:ireturn         
		else
			return 0;
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public int getSplashCacheNum()
	{
		if(splashCacheNum > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int splashCacheNum>
	//*   2    4:ifle            12
			return splashCacheNum;
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field int splashCacheNum>
	//    5   11:ireturn         
		else
			return 10;
	//    6   12:bipush          10
	//    7   14:ireturn         
	}

	public long getSplashShowTimeInterval()
	{
		if(splashShowTimeInterval > 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long splashShowTimeInterval>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            14
			return splashShowTimeInterval;
	//    5    9:aload_0         
	//    6   10:getfield        #72  <Field long splashShowTimeInterval>
	//    7   13:lreturn         
		else
			return 0L;
	//    8   14:lconst_0        
	//    9   15:lreturn         
	}

	public int getSplashSkipArea()
	{
		if(splashSkipArea >= 0 && splashSkipArea <= 200)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field int splashSkipArea>
	//*   2    4:iflt            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #58  <Field int splashSkipArea>
	//*   5   11:sipush          200
	//*   6   14:icmpgt          22
			return splashSkipArea;
	//    7   17:aload_0         
	//    8   18:getfield        #58  <Field int splashSkipArea>
	//    9   21:ireturn         
		else
			return 0;
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public int getSplashUserAppDayImpFc()
	{
		if(splashUserAppDayImpFc > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field int splashUserAppDayImpFc>
	//*   2    4:ifle            12
			return splashUserAppDayImpFc;
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field int splashUserAppDayImpFc>
	//    5   11:ireturn         
		else
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public int getSplashmode()
	{
		if(1 == splashmode || 2 == splashmode)
	//*   0    0:iconst_1        
	//*   1    1:aload_0         
	//*   2    2:getfield        #56  <Field int splashmode>
	//*   3    5:icmpeq          16
	//*   4    8:iconst_2        
	//*   5    9:aload_0         
	//*   6   10:getfield        #56  <Field int splashmode>
	//*   7   13:icmpne          21
			return splashmode;
	//    8   16:aload_0         
	//    9   17:getfield        #56  <Field int splashmode>
	//   10   20:ireturn         
		else
			return 1;
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public int getSplashshow()
	{
		if(splashshow >= 2000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field int splashshow>
	//*   2    4:sipush          2000
	//*   3    7:icmplt          15
			return splashshow;
	//    4   10:aload_0         
	//    5   11:getfield        #54  <Field int splashshow>
	//    6   14:ireturn         
		else
			return 3000;
	//    7   15:sipush          3000
	//    8   18:ireturn         
	}

	public Integer getValidityOfClickSkip()
	{
		return validityOfClickSkip;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field Integer validityOfClickSkip>
	//    2    4:areturn         
	}

	public Integer getValidityOfLockEvent()
	{
		return validityOfLockEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field Integer validityOfLockEvent>
	//    2    4:areturn         
	}

	public Integer getValidityOfNativeEvent()
	{
		return validityOfNativeEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field Integer validityOfNativeEvent>
	//    2    4:areturn         
	}

	public Integer getValidityOfSplashEvent()
	{
		return validityOfSplashEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field Integer validityOfSplashEvent>
	//    2    4:areturn         
	}

	public void setConfigRefreshInterval(Integer integer)
	{
		configRefreshInterval = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field Integer configRefreshInterval>
	//    3    5:return          
	}

	public void setGlobalSwitch(String s)
	{
		globalSwitch = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field String globalSwitch>
	//    3    5:return          
	}

	public void setLandingMenu(Integer integer)
	{
		landingMenu = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field Integer landingMenu>
	//    3    5:return          
	}

	public void setLandpageAppPrompt(Integer integer)
	{
		landpageAppPrompt = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field Integer landpageAppPrompt>
	//    3    5:return          
	}

	public void setLandpageAppWhiteList(String s)
	{
		landpageAppWhiteList = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field String landpageAppWhiteList>
	//    3    5:return          
	}

	public void setMagazinelockBoxPara(MagazinelockBoxPara magazinelockboxpara)
	{
		magazinelockBoxPara = magazinelockboxpara;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field MagazinelockBoxPara magazinelockBoxPara>
	//    3    5:return          
	}

	public void setReason(String s)
	{
		reason = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field String reason>
	//    3    5:return          
	}

	public void setReduceDisturbRule(ReduceDisturbRule reducedisturbrule)
	{
		reduceDisturbRule = reducedisturbrule;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field ReduceDisturbRule reduceDisturbRule>
	//    3    5:return          
	}

	public void setServerStore(String s)
	{
		serverStore = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field String serverStore>
	//    3    5:return          
	}

	public void setSplashSkipArea(int i)
	{
		splashSkipArea = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int splashSkipArea>
	//    3    5:return          
	}

	public void setValidityOfClickSkip(Integer integer)
	{
		validityOfClickSkip = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #160 <Field Integer validityOfClickSkip>
	//    3    5:return          
	}

	public void setValidityOfLockEvent(Integer integer)
	{
		validityOfLockEvent = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field Integer validityOfLockEvent>
	//    3    5:return          
	}

	public void setValidityOfNativeEvent(Integer integer)
	{
		validityOfNativeEvent = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #166 <Field Integer validityOfNativeEvent>
	//    3    5:return          
	}

	public void setValidityOfSplashEvent(Integer integer)
	{
		validityOfSplashEvent = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field Integer validityOfSplashEvent>
	//    3    5:return          
	}

	private Integer configRefreshInterval;
	private int gifShowTimeLowerLimitEachFrame;
	private int gifShowTimeUpperLimit;
	private int gifSizeUpperLimit;
	private String globalSwitch;
	private int imgSizeUpperLimit;
	private Integer landingMenu;
	private Integer landpageAppPrompt;
	private String landpageAppWhiteList;
	private MagazinelockBoxPara magazinelockBoxPara;
	private String reason;
	private ReduceDisturbRule reduceDisturbRule;
	private int retcode;
	private String serverStore;
	private long sloganShowMinTimeRealMode;
	private int sloganShowTime;
	private int splashCacheNum;
	private long splashShowTimeInterval;
	private int splashSkipArea;
	private int splashUserAppDayImpFc;
	private int splashmode;
	private int splashshow;
	private Integer validityOfClickSkip;
	private Integer validityOfLockEvent;
	private Integer validityOfNativeEvent;
	private Integer validityOfSplashEvent;
}
