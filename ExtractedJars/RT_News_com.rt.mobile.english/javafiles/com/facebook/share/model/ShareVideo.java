// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareMedia, ShareModelBuilder, ShareModel

public final class ShareVideo extends ShareMedia
{
	public static final class Builder extends ShareMedia.Builder
	{

		public ShareVideo build()
		{
			return new ShareVideo(this);
		//    0    0:new             #7   <Class ShareVideo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #24  <Method void ShareVideo(ShareVideo$Builder, ShareVideo$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #27  <Method ShareVideo build()>
		//    2    4:areturn         
		}

		public volatile ShareMedia.Builder readFrom(ShareMedia sharemedia)
		{
			return ((ShareMedia.Builder) (readFrom((ShareVideo)sharemedia)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareVideo>
		//    3    5:invokevirtual   #32  <Method ShareVideo$Builder readFrom(ShareVideo)>
		//    4    8:areturn         
		}

		public volatile ShareModelBuilder readFrom(Parcel parcel)
		{
			return ((ShareModelBuilder) (readFrom(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #36  <Method ShareVideo$Builder readFrom(Parcel)>
		//    3    5:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareVideo)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareVideo>
		//    3    5:invokevirtual   #32  <Method ShareVideo$Builder readFrom(ShareVideo)>
		//    4    8:areturn         
		}

		public Builder readFrom(Parcel parcel)
		{
			return readFrom((ShareVideo)parcel.readParcelable(((Class) (com/facebook/share/model/ShareVideo)).getClassLoader()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class ShareVideo>
		//    3    4:invokevirtual   #43  <Method ClassLoader Class.getClassLoader()>
		//    4    7:invokevirtual   #49  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
		//    5   10:checkcast       #7   <Class ShareVideo>
		//    6   13:invokevirtual   #32  <Method ShareVideo$Builder readFrom(ShareVideo)>
		//    7   16:areturn         
		}

		public Builder readFrom(ShareVideo sharevideo)
		{
			if(sharevideo == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareMedia) (sharevideo)))).setLocalUrl(sharevideo.getLocalUrl());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #51  <Method ShareMedia$Builder ShareMedia$Builder.readFrom(ShareMedia)>
		//    7   11:checkcast       #2   <Class ShareVideo$Builder>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #55  <Method Uri ShareVideo.getLocalUrl()>
		//   10   18:invokevirtual   #59  <Method ShareVideo$Builder setLocalUrl(Uri)>
		//   11   21:areturn         
		}

		public Builder setLocalUrl(Uri uri)
		{
			localUrl = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field Uri localUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Uri localUrl;


/*
		static Uri access$000(Builder builder)
		{
			return builder.localUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Uri localUrl>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ShareMedia$Builder()>
		//    2    4:return          
		}
	}


	ShareVideo(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void ShareMedia(Parcel)>
		localUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #27  <Class Uri>
	//    6    9:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #39  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    8   15:checkcast       #27  <Class Uri>
	//    9   18:putfield        #41  <Field Uri localUrl>
	//   10   21:return          
	}

	private ShareVideo(Builder builder)
	{
		super(((ShareMedia.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void ShareMedia(ShareMedia$Builder)>
		localUrl = builder.localUrl;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #49  <Method Uri ShareVideo$Builder.access$000(ShareVideo$Builder)>
	//    6   10:putfield        #41  <Field Uri localUrl>
	//    7   13:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Uri getLocalUrl()
	{
		return localUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Uri localUrl>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #62  <Method void ShareMedia.writeToParcel(Parcel, int)>
		parcel.writeParcelable(((android.os.Parcelable) (localUrl)), 0);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field Uri localUrl>
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #66  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//    9   15:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareVideo createFromParcel(Parcel parcel)
		{
			return new ShareVideo(parcel);
		//    0    0:new             #9   <Class ShareVideo>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareVideo(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareVideo createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareVideo[] newArray(int i)
		{
			return new ShareVideo[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareVideo[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareVideo[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final Uri localUrl;

	static 
	{
	//    0    0:new             #6   <Class ShareVideo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ShareVideo$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
