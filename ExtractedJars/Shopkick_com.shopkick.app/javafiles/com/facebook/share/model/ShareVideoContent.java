// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareModel, SharePhoto, ShareVideo, 
//			ShareModelBuilder

public final class ShareVideoContent extends ShareContent
	implements ShareModel
{
	public static final class Builder extends ShareContent.Builder
	{

		public ShareVideoContent build()
		{
			return new ShareVideoContent(this);
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

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareVideoContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareVideoContent>
		//    3    5:invokevirtual   #48  <Method ShareVideoContent$Builder readFrom(ShareVideoContent)>
		//    4    8:areturn         
		}

		public Builder readFrom(ShareVideoContent sharevideocontent)
		{
			if(sharevideocontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareContent) (sharevideocontent)))).setContentDescription(sharevideocontent.getContentDescription()).setContentTitle(sharevideocontent.getContentTitle()).setPreviewPhoto(sharevideocontent.getPreviewPhoto()).setVideo(sharevideocontent.getVideo());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #51  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
		//    7   11:checkcast       #2   <Class ShareVideoContent$Builder>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #55  <Method String ShareVideoContent.getContentDescription()>
		//   10   18:invokevirtual   #59  <Method ShareVideoContent$Builder setContentDescription(String)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #62  <Method String ShareVideoContent.getContentTitle()>
		//   13   25:invokevirtual   #65  <Method ShareVideoContent$Builder setContentTitle(String)>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #69  <Method SharePhoto ShareVideoContent.getPreviewPhoto()>
		//   16   32:invokevirtual   #73  <Method ShareVideoContent$Builder setPreviewPhoto(SharePhoto)>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #77  <Method ShareVideo ShareVideoContent.getVideo()>
		//   19   39:invokevirtual   #81  <Method ShareVideoContent$Builder setVideo(ShareVideo)>
		//   20   42:areturn         
		}

		public Builder setContentDescription(String s)
		{
			contentDescription = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field String contentDescription>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setContentTitle(String s)
		{
			contentTitle = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field String contentTitle>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPreviewPhoto(SharePhoto sharephoto)
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
		//    5    9:new             #85  <Class SharePhoto$Builder>
		//    6   12:dup             
		//    7   13:invokespecial   #86  <Method void SharePhoto$Builder()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #89  <Method SharePhoto$Builder SharePhoto$Builder.readFrom(SharePhoto)>
		//   10   20:invokevirtual   #91  <Method SharePhoto SharePhoto$Builder.build()>
		//   11   23:astore_1        
			previewPhoto = sharephoto;
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #31  <Field SharePhoto previewPhoto>
			return this;
		//   15   29:aload_0         
		//   16   30:areturn         
		}

		public Builder setVideo(ShareVideo sharevideo)
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
		//    5    7:new             #93  <Class ShareVideo$Builder>
		//    6   10:dup             
		//    7   11:invokespecial   #94  <Method void ShareVideo$Builder()>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #97  <Method ShareVideo$Builder ShareVideo$Builder.readFrom(ShareVideo)>
		//   10   18:invokevirtual   #99  <Method ShareVideo ShareVideo$Builder.build()>
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
		static String access$000(Builder builder)
		{
			return builder.contentDescription;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field String contentDescription>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.contentTitle;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field String contentTitle>
		//    2    4:areturn         
		}

*/


/*
		static SharePhoto access$200(Builder builder)
		{
			return builder.previewPhoto;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field SharePhoto previewPhoto>
		//    2    4:areturn         
		}

*/


/*
		static ShareVideo access$300(Builder builder)
		{
			return builder.video;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ShareVideo video>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void ShareContent$Builder()>
		//    2    4:return          
		}
	}


	ShareVideoContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void ShareContent(Parcel)>
		contentDescription = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #39  <Method String Parcel.readString()>
	//    6   10:putfield        #41  <Field String contentDescription>
		contentTitle = parcel.readString();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #39  <Method String Parcel.readString()>
	//   10   18:putfield        #43  <Field String contentTitle>
		SharePhoto.Builder builder = (new SharePhoto.Builder()).readFrom(parcel);
	//   11   21:new             #45  <Class SharePhoto$Builder>
	//   12   24:dup             
	//   13   25:invokespecial   #46  <Method void SharePhoto$Builder()>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #50  <Method SharePhoto$Builder SharePhoto$Builder.readFrom(Parcel)>
	//   16   32:astore_2        
		if(builder.getImageUrl() == null && builder.getBitmap() == null)
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #54  <Method android.net.Uri SharePhoto$Builder.getImageUrl()>
	//*  19   37:ifnonnull       58
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #58  <Method android.graphics.Bitmap SharePhoto$Builder.getBitmap()>
	//*  22   44:ifnull          50
	//*  23   47:goto            58
			previewPhoto = null;
	//   24   50:aload_0         
	//   25   51:aconst_null     
	//   26   52:putfield        #60  <Field SharePhoto previewPhoto>
		else
	//*  27   55:goto            66
			previewPhoto = builder.build();
	//   28   58:aload_0         
	//   29   59:aload_2         
	//   30   60:invokevirtual   #64  <Method SharePhoto SharePhoto$Builder.build()>
	//   31   63:putfield        #60  <Field SharePhoto previewPhoto>
		video = (new ShareVideo.Builder()).readFrom(parcel).build();
	//   32   66:aload_0         
	//   33   67:new             #66  <Class ShareVideo$Builder>
	//   34   70:dup             
	//   35   71:invokespecial   #67  <Method void ShareVideo$Builder()>
	//   36   74:aload_1         
	//   37   75:invokevirtual   #70  <Method ShareVideo$Builder ShareVideo$Builder.readFrom(Parcel)>
	//   38   78:invokevirtual   #73  <Method ShareVideo ShareVideo$Builder.build()>
	//   39   81:putfield        #75  <Field ShareVideo video>
	//   40   84:return          
	}

	private ShareVideoContent(Builder builder)
	{
		super(((ShareContent.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void ShareContent(ShareContent$Builder)>
		contentDescription = builder.contentDescription;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #83  <Method String ShareVideoContent$Builder.access$000(ShareVideoContent$Builder)>
	//    6   10:putfield        #41  <Field String contentDescription>
		contentTitle = builder.contentTitle;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #86  <Method String ShareVideoContent$Builder.access$100(ShareVideoContent$Builder)>
	//   10   18:putfield        #43  <Field String contentTitle>
		previewPhoto = builder.previewPhoto;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #90  <Method SharePhoto ShareVideoContent$Builder.access$200(ShareVideoContent$Builder)>
	//   14   26:putfield        #60  <Field SharePhoto previewPhoto>
		video = builder.video;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokestatic    #94  <Method ShareVideo ShareVideoContent$Builder.access$300(ShareVideoContent$Builder)>
	//   18   34:putfield        #75  <Field ShareVideo video>
	//   19   37:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getContentDescription()
	{
		return contentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String contentDescription>
	//    2    4:areturn         
	}

	public String getContentTitle()
	{
		return contentTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String contentTitle>
	//    2    4:areturn         
	}

	public SharePhoto getPreviewPhoto()
	{
		return previewPhoto;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field SharePhoto previewPhoto>
	//    2    4:areturn         
	}

	public ShareVideo getVideo()
	{
		return video;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field ShareVideo video>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #109 <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeString(contentDescription);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field String contentDescription>
	//    7   11:invokevirtual   #113 <Method void Parcel.writeString(String)>
		parcel.writeString(contentTitle);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #43  <Field String contentTitle>
	//   11   19:invokevirtual   #113 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (previewPhoto)), 0);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #60  <Field SharePhoto previewPhoto>
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #117 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (video)), 0);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #75  <Field ShareVideo video>
	//   20   36:iconst_0        
	//   21   37:invokevirtual   #117 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   22   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareVideoContent createFromParcel(Parcel parcel)
		{
			return new ShareVideoContent(parcel);
		//    0    0:new             #9   <Class ShareVideoContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareVideoContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareVideoContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareVideoContent[] newArray(int i)
		{
			return new ShareVideoContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareVideoContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareVideoContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String contentDescription;
	private final String contentTitle;
	private final SharePhoto previewPhoto;
	private final ShareVideo video;

	static 
	{
	//    0    0:new             #9   <Class ShareVideoContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void ShareVideoContent$1()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
