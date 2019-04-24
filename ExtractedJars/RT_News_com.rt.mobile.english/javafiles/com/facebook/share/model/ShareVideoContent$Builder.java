// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareVideoContent, SharePhoto, ShareVideo, ShareContent, 
//			ShareModelBuilder, ShareModel

public static final class ShareVideoContent$Builder extends ShareContent.Builder
{

	public ShareVideoContent build()
	{
		return new ShareVideoContent(this, ((ShareVideoContent._cls1) (null)));
	//    0    0:new             #7   <Class ShareVideoContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #40  <Method void ShareVideoContent(ShareVideoContent$Builder, ShareVideoContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method ShareVideoContent build()>
	//    2    4:areturn         
	}

	public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((ShareContent.Builder) (readFrom((ShareVideoContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareVideoContent>
	//    3    5:invokevirtual   #48  <Method ShareVideoContent$Builder readFrom(ShareVideoContent)>
	//    4    8:areturn         
	}

	public volatile ShareModelBuilder readFrom(Parcel parcel)
	{
		return ((ShareModelBuilder) (readFrom(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method ShareVideoContent$Builder readFrom(Parcel)>
	//    3    5:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareVideoContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareVideoContent>
	//    3    5:invokevirtual   #48  <Method ShareVideoContent$Builder readFrom(ShareVideoContent)>
	//    4    8:areturn         
	}

	public ShareVideoContent$Builder readFrom(Parcel parcel)
	{
		return readFrom((ShareVideoContent)parcel.readParcelable(((Class) (com/facebook/share/model/ShareVideoContent)).getClassLoader()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Class ShareVideoContent>
	//    3    4:invokevirtual   #59  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #65  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #7   <Class ShareVideoContent>
	//    6   13:invokevirtual   #48  <Method ShareVideoContent$Builder readFrom(ShareVideoContent)>
	//    7   16:areturn         
	}

	public ShareVideoContent$Builder readFrom(ShareVideoContent sharevideocontent)
	{
		if(sharevideocontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareVideoContent$Builder)super.readFrom(((ShareContent) (sharevideocontent)))).setContentDescription(sharevideocontent.getContentDescription()).setContentTitle(sharevideocontent.getContentTitle()).setPreviewPhoto(sharevideocontent.getPreviewPhoto()).setVideo(sharevideocontent.getVideo());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #67  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class ShareVideoContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #71  <Method String ShareVideoContent.getContentDescription()>
	//   10   18:invokevirtual   #75  <Method ShareVideoContent$Builder setContentDescription(String)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #78  <Method String ShareVideoContent.getContentTitle()>
	//   13   25:invokevirtual   #81  <Method ShareVideoContent$Builder setContentTitle(String)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #85  <Method SharePhoto ShareVideoContent.getPreviewPhoto()>
	//   16   32:invokevirtual   #89  <Method ShareVideoContent$Builder setPreviewPhoto(SharePhoto)>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #93  <Method ShareVideo ShareVideoContent.getVideo()>
	//   19   39:invokevirtual   #97  <Method ShareVideoContent$Builder setVideo(ShareVideo)>
	//   20   42:areturn         
	}

	public ShareVideoContent$Builder setContentDescription(String s)
	{
		contentDescription = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String contentDescription>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareVideoContent$Builder setContentTitle(String s)
	{
		contentTitle = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String contentTitle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareVideoContent$Builder setPreviewPhoto(SharePhoto sharephoto)
	{
		if(sharephoto == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			sharephoto = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            24
			sharephoto = (new SharePhoto.Builder()).readFrom(sharephoto).build();
	//    5    9:new             #101 <Class SharePhoto$Builder>
	//    6   12:dup             
	//    7   13:invokespecial   #102 <Method void SharePhoto$Builder()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #105 <Method SharePhoto$Builder SharePhoto$Builder.readFrom(SharePhoto)>
	//   10   20:invokevirtual   #107 <Method SharePhoto SharePhoto$Builder.build()>
	//   11   23:astore_1        
		previewPhoto = sharephoto;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #31  <Field SharePhoto previewPhoto>
		return this;
	//   15   29:aload_0         
	//   16   30:areturn         
	}

	public ShareVideoContent$Builder setVideo(ShareVideo sharevideo)
	{
		if(sharevideo == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			video = (new ShareVideo.Builder()).readFrom(sharevideo).build();
	//    4    6:aload_0         
	//    5    7:new             #109 <Class ShareVideo$Builder>
	//    6   10:dup             
	//    7   11:invokespecial   #110 <Method void ShareVideo$Builder()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #113 <Method ShareVideo$Builder ShareVideo$Builder.readFrom(ShareVideo)>
	//   10   18:invokevirtual   #115 <Method ShareVideo ShareVideo$Builder.build()>
	//   11   21:putfield        #35  <Field ShareVideo video>
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		}
	}

	private String contentDescription;
	private String contentTitle;
	private SharePhoto previewPhoto;
	private ShareVideo video;


/*
	static String access$000(ShareVideoContent$Builder sharevideocontent$builder)
	{
		return sharevideocontent$builder.contentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String contentDescription>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(ShareVideoContent$Builder sharevideocontent$builder)
	{
		return sharevideocontent$builder.contentTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String contentTitle>
	//    2    4:areturn         
	}

*/


/*
	static SharePhoto access$200(ShareVideoContent$Builder sharevideocontent$builder)
	{
		return sharevideocontent$builder.previewPhoto;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field SharePhoto previewPhoto>
	//    2    4:areturn         
	}

*/


/*
	static ShareVideo access$300(ShareVideoContent$Builder sharevideocontent$builder)
	{
		return sharevideocontent$builder.video;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ShareVideo video>
	//    2    4:areturn         
	}

*/

	public ShareVideoContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ShareContent$Builder()>
	//    2    4:return          
	}
}
