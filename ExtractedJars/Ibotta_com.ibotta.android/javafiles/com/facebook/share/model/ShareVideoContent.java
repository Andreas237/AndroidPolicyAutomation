// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareModel, SharePhoto, ShareVideo

public final class ShareVideoContent extends ShareContent
	implements ShareModel
{

	ShareVideoContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void ShareContent(Parcel)>
		contentDescription = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #36  <Method String Parcel.readString()>
	//    6   10:putfield        #38  <Field String contentDescription>
		contentTitle = parcel.readString();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #36  <Method String Parcel.readString()>
	//   10   18:putfield        #40  <Field String contentTitle>
		SharePhoto.Builder builder = (new SharePhoto.Builder()).readFrom(parcel);
	//   11   21:new             #42  <Class SharePhoto$Builder>
	//   12   24:dup             
	//   13   25:invokespecial   #43  <Method void SharePhoto$Builder()>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #47  <Method SharePhoto$Builder SharePhoto$Builder.readFrom(Parcel)>
	//   16   32:astore_2        
		if(builder.getImageUrl() == null && builder.getBitmap() == null)
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #51  <Method android.net.Uri SharePhoto$Builder.getImageUrl()>
	//*  19   37:ifnonnull       58
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #55  <Method android.graphics.Bitmap SharePhoto$Builder.getBitmap()>
	//*  22   44:ifnull          50
	//*  23   47:goto            58
			previewPhoto = null;
	//   24   50:aload_0         
	//   25   51:aconst_null     
	//   26   52:putfield        #57  <Field SharePhoto previewPhoto>
		else
	//*  27   55:goto            66
			previewPhoto = builder.build();
	//   28   58:aload_0         
	//   29   59:aload_2         
	//   30   60:invokevirtual   #61  <Method SharePhoto SharePhoto$Builder.build()>
	//   31   63:putfield        #57  <Field SharePhoto previewPhoto>
		video = (new ShareVideo.Builder()).readFrom(parcel).build();
	//   32   66:aload_0         
	//   33   67:new             #63  <Class ShareVideo$Builder>
	//   34   70:dup             
	//   35   71:invokespecial   #64  <Method void ShareVideo$Builder()>
	//   36   74:aload_1         
	//   37   75:invokevirtual   #67  <Method ShareVideo$Builder ShareVideo$Builder.readFrom(Parcel)>
	//   38   78:invokevirtual   #70  <Method ShareVideo ShareVideo$Builder.build()>
	//   39   81:putfield        #72  <Field ShareVideo video>
	//   40   84:return          
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
	//    1    1:getfield        #38  <Field String contentDescription>
	//    2    4:areturn         
	}

	public String getContentTitle()
	{
		return contentTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String contentTitle>
	//    2    4:areturn         
	}

	public SharePhoto getPreviewPhoto()
	{
		return previewPhoto;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field SharePhoto previewPhoto>
	//    2    4:areturn         
	}

	public ShareVideo getVideo()
	{
		return video;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ShareVideo video>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #84  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeString(contentDescription);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field String contentDescription>
	//    7   11:invokevirtual   #88  <Method void Parcel.writeString(String)>
		parcel.writeString(contentTitle);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #40  <Field String contentTitle>
	//   11   19:invokevirtual   #88  <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (previewPhoto)), 0);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #57  <Field SharePhoto previewPhoto>
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #92  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (video)), 0);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #72  <Field ShareVideo video>
	//   20   36:iconst_0        
	//   21   37:invokevirtual   #92  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
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
	//    2    4:invokespecial   #24  <Method void ShareVideoContent$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
