// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.beans.base.RspBean;

// Referenced classes of package com.huawei.openalliance.ad.beans.metadata:
//			ParamFromServer

public class Slogan extends RspBean
{

	public Slogan()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void RspBean()>
		creativetype__ = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #24  <Field int creativetype__>
	//    5    9:return          
	}

	public String getContentid__()
	{
		return contentid__;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String contentid__>
	//    2    4:areturn         
	}

	public int getCreativetype__()
	{
		return creativetype__;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int creativetype__>
	//    2    4:ireturn         
	}

	public long getEndtime__()
	{
		return endtime__;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long endtime__>
	//    2    4:lreturn         
	}

	public int getHeight__()
	{
		return height__;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int height__>
	//    2    4:ireturn         
	}

	public ParamFromServer getParamfromserver__()
	{
		return paramfromserver__;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ParamFromServer paramfromserver__>
	//    2    4:areturn         
	}

	public String getSha256__()
	{
		return sha256__;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String sha256__>
	//    2    4:areturn         
	}

	public long getStarttime__()
	{
		return starttime__;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long starttime__>
	//    2    4:lreturn         
	}

	public String getUrl__()
	{
		return url__;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String url__>
	//    2    4:areturn         
	}

	public int getWidth__()
	{
		return width__;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int width__>
	//    2    4:ireturn         
	}

	public void setContentid__(String s)
	{
		contentid__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String contentid__>
	//    3    5:return          
	}

	public void setCreativetype__(int i)
	{
		creativetype__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int creativetype__>
	//    3    5:return          
	}

	public void setEndtime__(long l)
	{
		endtime__ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #35  <Field long endtime__>
	//    3    5:return          
	}

	public void setHeight__(int i)
	{
		height__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int height__>
	//    3    5:return          
	}

	public void setParamfromserver__(ParamFromServer paramfromserver)
	{
		paramfromserver__ = paramfromserver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field ParamFromServer paramfromserver__>
	//    3    5:return          
	}

	public void setSha256__(String s)
	{
		sha256__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String sha256__>
	//    3    5:return          
	}

	public void setStarttime__(long l)
	{
		starttime__ = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #48  <Field long starttime__>
	//    3    5:return          
	}

	public void setUrl__(String s)
	{
		url__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field String url__>
	//    3    5:return          
	}

	public void setWidth__(int i)
	{
		width__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field int width__>
	//    3    5:return          
	}

	private String contentid__;
	private int creativetype__;
	private long endtime__;
	private int height__;
	private ParamFromServer paramfromserver__;
	private String sha256__;
	private long starttime__;
	private String url__;
	private int width__;
}
