// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;


public class ImageInfo
{

	public ImageInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		width = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int width>
		height = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field int height>
		imageType = "img";
	//    8   14:aload_0         
	//    9   15:ldc1            #24  <String "img">
	//   10   17:putfield        #26  <Field String imageType>
		fileSize = 0;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #28  <Field int fileSize>
	//   14   25:return          
	}

	public int getCheckSha256Flag()
	{
		return checkSha256Flag;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int checkSha256Flag>
	//    2    4:ireturn         
	}

	public int getFileSize()
	{
		return fileSize;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int fileSize>
	//    2    4:ireturn         
	}

	public int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int height>
	//    2    4:ireturn         
	}

	public String getImageType()
	{
		return imageType;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String imageType>
	//    2    4:areturn         
	}

	public String getSha256()
	{
		return sha256;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String sha256>
	//    2    4:areturn         
	}

	public String getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String url>
	//    2    4:areturn         
	}

	public int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int width>
	//    2    4:ireturn         
	}

	public void setCheckSha256Flag(int i)
	{
		checkSha256Flag = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int checkSha256Flag>
	//    3    5:return          
	}

	public void setFileSize(int i)
	{
		fileSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int fileSize>
	//    3    5:return          
	}

	public void setHeight(int i)
	{
		height = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int height>
	//    3    5:return          
	}

	public void setImageType(String s)
	{
		imageType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String imageType>
	//    3    5:return          
	}

	public void setSha256(String s)
	{
		sha256 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String sha256>
	//    3    5:return          
	}

	public void setUrl(String s)
	{
		url = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String url>
	//    3    5:return          
	}

	public void setWidth(int i)
	{
		width = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field int width>
	//    3    5:return          
	}

	private int checkSha256Flag;
	private int fileSize;
	private int height;
	private String imageType;
	private String sha256;
	private String url;
	private int width;
}
