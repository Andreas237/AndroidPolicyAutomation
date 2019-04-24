// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.beans.base.RspBean;
import java.util.List;

// Referenced classes of package com.huawei.openalliance.ad.beans.metadata:
//			ApkInfo, ShareInfo, ImageInfo, VideoInfo

public class MetaData extends RspBean
{

	public MetaData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void RspBean()>
		minEffectiveShowTime__ = 500L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #38  <Long 500L>
	//    4    8:putfield        #41  <Field long minEffectiveShowTime__>
		minEffectiveShowRatio__ = 50;
	//    5   11:aload_0         
	//    6   12:bipush          50
	//    7   14:putfield        #43  <Field int minEffectiveShowRatio__>
	//    8   17:return          
	}

	public String getAdSign()
	{
		return adSign;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String adSign>
	//    2    4:areturn         
	}

	public ApkInfo getApkInfo()
	{
		return apkInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ApkInfo apkInfo>
	//    2    4:areturn         
	}

	public String getAppPromotionChannel__()
	{
		return appPromotionChannel__;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String appPromotionChannel__>
	//    2    4:areturn         
	}

	public String getClickUrl__()
	{
		return clickUrl__;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String clickUrl__>
	//    2    4:areturn         
	}

	public String getCta__()
	{
		return cta__;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String cta__>
	//    2    4:areturn         
	}

	public String getDescription__()
	{
		return description__;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String description__>
	//    2    4:areturn         
	}

	public List getIcon__()
	{
		return icon__;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field List icon__>
	//    2    4:areturn         
	}

	public List getImageInfo__()
	{
		return imageInfo__;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field List imageInfo__>
	//    2    4:areturn         
	}

	public String getIntent__()
	{
		return intent__;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String intent__>
	//    2    4:areturn         
	}

	public String getLabel__()
	{
		return label__;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String label__>
	//    2    4:areturn         
	}

	public String getMarketAppId__()
	{
		return marketAppId__;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String marketAppId__>
	//    2    4:areturn         
	}

	public int getMinEffectiveShowRatio__()
	{
		return minEffectiveShowRatio__;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int minEffectiveShowRatio__>
	//    2    4:ireturn         
	}

	public long getMinEffectiveShowTime__()
	{
		return minEffectiveShowTime__;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long minEffectiveShowTime__>
	//    2    4:lreturn         
	}

	public ShareInfo getShareInfo()
	{
		return shareInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field ShareInfo shareInfo>
	//    2    4:areturn         
	}

	public List getTextStateList()
	{
		return textStateList;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field List textStateList>
	//    2    4:areturn         
	}

	public ImageInfo getThumbNail__()
	{
		return thumbNail__;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field ImageInfo thumbNail__>
	//    2    4:areturn         
	}

	public String getTitle__()
	{
		return title__;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String title__>
	//    2    4:areturn         
	}

	public VideoInfo getVideoInfo__()
	{
		return videoInfo__;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field VideoInfo videoInfo__>
	//    2    4:areturn         
	}

	public void setAdSign(String s)
	{
		adSign = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String adSign>
	//    3    5:return          
	}

	public void setApkInfo(ApkInfo apkinfo)
	{
		apkInfo = apkinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field ApkInfo apkInfo>
	//    3    5:return          
	}

	public void setAppPromotionChannel__(String s)
	{
		appPromotionChannel__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field String appPromotionChannel__>
	//    3    5:return          
	}

	public void setClickUrl__(String s)
	{
		clickUrl__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String clickUrl__>
	//    3    5:return          
	}

	public void setCta__(String s)
	{
		cta__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field String cta__>
	//    3    5:return          
	}

	public void setDescription__(String s)
	{
		description__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field String description__>
	//    3    5:return          
	}

	public void setIcon__(List list)
	{
		icon__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field List icon__>
	//    3    5:return          
	}

	public void setImageInfo__(List list)
	{
		imageInfo__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field List imageInfo__>
	//    3    5:return          
	}

	public void setIntent__(String s)
	{
		intent__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field String intent__>
	//    3    5:return          
	}

	public void setLabel__(String s)
	{
		label__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field String label__>
	//    3    5:return          
	}

	public void setMarketAppId__(String s)
	{
		marketAppId__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field String marketAppId__>
	//    3    5:return          
	}

	public void setMinEffectiveShowRatio__(int i)
	{
		minEffectiveShowRatio__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int minEffectiveShowRatio__>
	//    3    5:return          
	}

	public void setMinEffectiveShowTime__(long l)
	{
		minEffectiveShowTime__ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #41  <Field long minEffectiveShowTime__>
	//    3    5:return          
	}

	public void setShareInfo(ShareInfo shareinfo)
	{
		shareInfo = shareinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field ShareInfo shareInfo>
	//    3    5:return          
	}

	public void setTextStateList(List list)
	{
		textStateList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field List textStateList>
	//    3    5:return          
	}

	public void setThumbNail__(ImageInfo imageinfo)
	{
		thumbNail__ = imageinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field ImageInfo thumbNail__>
	//    3    5:return          
	}

	public void setTitle__(String s)
	{
		title__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field String title__>
	//    3    5:return          
	}

	public void setVideoInfo__(VideoInfo videoinfo)
	{
		videoInfo__ = videoinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field VideoInfo videoInfo__>
	//    3    5:return          
	}

	private String adSign;
	private ApkInfo apkInfo;
	private String appPromotionChannel__;
	private String clickUrl__;
	private String cta__;
	private String description__;
	private List icon__;
	private List imageInfo__;
	private String intent__;
	private String label__;
	private String marketAppId__;
	private int minEffectiveShowRatio__;
	private long minEffectiveShowTime__;
	private ShareInfo shareInfo;
	private List textStateList;
	private ImageInfo thumbNail__;
	private String title__;
	private VideoInfo videoInfo__;
}
