// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;


public class VideoInfo
{

	public VideoInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		videoAutoPlayOnWifi = "y";
	//    2    4:aload_0         
	//    3    5:ldc1            #44  <String "y">
	//    4    7:putfield        #46  <Field String videoAutoPlayOnWifi>
		videoAutoPlayWithSound__ = "n";
	//    5   10:aload_0         
	//    6   11:ldc1            #47  <String "n">
	//    7   13:putfield        #49  <Field String videoAutoPlayWithSound__>
		timeBeforeVideoAutoPlay__ = 200;
	//    8   16:aload_0         
	//    9   17:sipush          200
	//   10   20:putfield        #51  <Field int timeBeforeVideoAutoPlay__>
		videoPlayMode__ = 1;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #53  <Field int videoPlayMode__>
		downloadNetwork = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #55  <Field int downloadNetwork>
	//   17   33:return          
	}

	public Integer getAutoPlayAreaRatio()
	{
		return autoPlayAreaRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Integer autoPlayAreaRatio>
	//    2    4:areturn         
	}

	public Integer getAutoStopPlayAreaRatio()
	{
		return autoStopPlayAreaRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Integer autoStopPlayAreaRatio>
	//    2    4:areturn         
	}

	public int getCheckSha256Flag()
	{
		return checkSha256Flag;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int checkSha256Flag>
	//    2    4:ireturn         
	}

	public int getDownloadNetwork()
	{
		return downloadNetwork;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int downloadNetwork>
	//    2    4:ireturn         
	}

	public String getSha256__()
	{
		return sha256__;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String sha256__>
	//    2    4:areturn         
	}

	public int getTimeBeforeVideoAutoPlay__()
	{
		return timeBeforeVideoAutoPlay__;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int timeBeforeVideoAutoPlay__>
	//    2    4:ireturn         
	}

	public String getVideoAutoPlayOnWifi()
	{
		return videoAutoPlayOnWifi;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String videoAutoPlayOnWifi>
	//    2    4:areturn         
	}

	public String getVideoAutoPlayWithSound__()
	{
		return videoAutoPlayWithSound__;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String videoAutoPlayWithSound__>
	//    2    4:areturn         
	}

	public String getVideoDownloadUrl__()
	{
		return videoDownloadUrl__;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String videoDownloadUrl__>
	//    2    4:areturn         
	}

	public int getVideoDuration__()
	{
		return videoDuration__;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int videoDuration__>
	//    2    4:ireturn         
	}

	public int getVideoFileSize__()
	{
		return videoFileSize__;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int videoFileSize__>
	//    2    4:ireturn         
	}

	public int getVideoPlayMode__()
	{
		return videoPlayMode__;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int videoPlayMode__>
	//    2    4:ireturn         
	}

	public Float getVideoRatio()
	{
		return videoRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Float videoRatio>
	//    2    4:areturn         
	}

	public void setAutoPlayAreaRatio(Integer integer)
	{
		autoPlayAreaRatio = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field Integer autoPlayAreaRatio>
	//    3    5:return          
	}

	public void setAutoStopPlayAreaRatio(Integer integer)
	{
		autoStopPlayAreaRatio = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field Integer autoStopPlayAreaRatio>
	//    3    5:return          
	}

	public void setCheckSha256Flag(int i)
	{
		checkSha256Flag = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field int checkSha256Flag>
	//    3    5:return          
	}

	public void setDownloadNetwork(int i)
	{
		downloadNetwork = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int downloadNetwork>
	//    3    5:return          
	}

	public void setSha256__(String s)
	{
		sha256__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field String sha256__>
	//    3    5:return          
	}

	public void setTimeBeforeVideoAutoPlay__(int i)
	{
		timeBeforeVideoAutoPlay__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field int timeBeforeVideoAutoPlay__>
	//    3    5:return          
	}

	public void setVideoAutoPlayOnWifi(String s)
	{
		videoAutoPlayOnWifi = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field String videoAutoPlayOnWifi>
	//    3    5:return          
	}

	public void setVideoAutoPlayWithSound__(String s)
	{
		videoAutoPlayWithSound__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field String videoAutoPlayWithSound__>
	//    3    5:return          
	}

	public void setVideoDownloadUrl__(String s)
	{
		videoDownloadUrl__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field String videoDownloadUrl__>
	//    3    5:return          
	}

	public void setVideoDuration__(int i)
	{
		videoDuration__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field int videoDuration__>
	//    3    5:return          
	}

	public void setVideoFileSize__(int i)
	{
		videoFileSize__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field int videoFileSize__>
	//    3    5:return          
	}

	public void setVideoPlayMode__(int i)
	{
		videoPlayMode__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int videoPlayMode__>
	//    3    5:return          
	}

	public void setVideoRatio(Float float1)
	{
		videoRatio = float1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field Float videoRatio>
	//    3    5:return          
	}

	private Integer autoPlayAreaRatio;
	private Integer autoStopPlayAreaRatio;
	private int checkSha256Flag;
	private int downloadNetwork;
	private String sha256__;
	private int timeBeforeVideoAutoPlay__;
	private String videoAutoPlayOnWifi;
	private String videoAutoPlayWithSound__;
	private String videoDownloadUrl__;
	private int videoDuration__;
	private int videoFileSize__;
	private int videoPlayMode__;
	private Float videoRatio;
}
