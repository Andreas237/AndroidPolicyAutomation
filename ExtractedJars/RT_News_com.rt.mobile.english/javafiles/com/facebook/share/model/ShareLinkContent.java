// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareModelBuilder, ShareModel

public final class ShareLinkContent extends ShareContent
{
	public static final class Builder extends ShareContent.Builder
	{

		public ShareLinkContent build()
		{
			return new ShareLinkContent(this);
		//    0    0:new             #7   <Class ShareLinkContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #34  <Method void ShareLinkContent(ShareLinkContent$Builder, ShareLinkContent$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #37  <Method ShareLinkContent build()>
		//    2    4:areturn         
		}

		public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
		{
			return ((ShareContent.Builder) (readFrom((ShareLinkContent)sharecontent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareLinkContent>
		//    3    5:invokevirtual   #42  <Method ShareLinkContent$Builder readFrom(ShareLinkContent)>
		//    4    8:areturn         
		}

		public Builder readFrom(Parcel parcel)
		{
			return readFrom((ShareLinkContent)parcel.readParcelable(((Class) (com/facebook/share/model/ShareLinkContent)).getClassLoader()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class ShareLinkContent>
		//    3    4:invokevirtual   #49  <Method ClassLoader Class.getClassLoader()>
		//    4    7:invokevirtual   #55  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
		//    5   10:checkcast       #7   <Class ShareLinkContent>
		//    6   13:invokevirtual   #42  <Method ShareLinkContent$Builder readFrom(ShareLinkContent)>
		//    7   16:areturn         
		}

		public Builder readFrom(ShareLinkContent sharelinkcontent)
		{
			if(sharelinkcontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareContent) (sharelinkcontent)))).setContentDescription(sharelinkcontent.getContentDescription()).setImageUrl(sharelinkcontent.getImageUrl()).setContentTitle(sharelinkcontent.getContentTitle());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #57  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
		//    7   11:checkcast       #2   <Class ShareLinkContent$Builder>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #61  <Method String ShareLinkContent.getContentDescription()>
		//   10   18:invokevirtual   #65  <Method ShareLinkContent$Builder setContentDescription(String)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #69  <Method Uri ShareLinkContent.getImageUrl()>
		//   13   25:invokevirtual   #73  <Method ShareLinkContent$Builder setImageUrl(Uri)>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #76  <Method String ShareLinkContent.getContentTitle()>
		//   16   32:invokevirtual   #79  <Method ShareLinkContent$Builder setContentTitle(String)>
		//   17   35:areturn         
		}

		public volatile ShareModelBuilder readFrom(Parcel parcel)
		{
			return ((ShareModelBuilder) (readFrom(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #82  <Method ShareLinkContent$Builder readFrom(Parcel)>
		//    3    5:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareLinkContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareLinkContent>
		//    3    5:invokevirtual   #42  <Method ShareLinkContent$Builder readFrom(ShareLinkContent)>
		//    4    8:areturn         
		}

		public Builder setContentDescription(String s)
		{
			contentDescription = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field String contentDescription>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setContentTitle(String s)
		{
			contentTitle = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field String contentTitle>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setImageUrl(Uri uri)
		{
			imageUrl = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field Uri imageUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String contentDescription;
		private String contentTitle;
		private Uri imageUrl;


/*
		static String access$000(Builder builder)
		{
			return builder.contentDescription;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String contentDescription>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.contentTitle;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field String contentTitle>
		//    2    4:areturn         
		}

*/


/*
		static Uri access$200(Builder builder)
		{
			return builder.imageUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Uri imageUrl>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void ShareContent$Builder()>
		//    2    4:return          
		}
	}


	ShareLinkContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void ShareContent(Parcel)>
		contentDescription = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #35  <Method String Parcel.readString()>
	//    6   10:putfield        #37  <Field String contentDescription>
		contentTitle = parcel.readString();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #35  <Method String Parcel.readString()>
	//   10   18:putfield        #39  <Field String contentTitle>
		imageUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:ldc1            #41  <Class Uri>
	//   14   25:invokevirtual   #47  <Method ClassLoader Class.getClassLoader()>
	//   15   28:invokevirtual   #51  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   16   31:checkcast       #41  <Class Uri>
	//   17   34:putfield        #53  <Field Uri imageUrl>
	//   18   37:return          
	}

	private ShareLinkContent(Builder builder)
	{
		super(((ShareContent.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void ShareContent(ShareContent$Builder)>
		contentDescription = builder.contentDescription;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #61  <Method String ShareLinkContent$Builder.access$000(ShareLinkContent$Builder)>
	//    6   10:putfield        #37  <Field String contentDescription>
		contentTitle = builder.contentTitle;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #64  <Method String ShareLinkContent$Builder.access$100(ShareLinkContent$Builder)>
	//   10   18:putfield        #39  <Field String contentTitle>
		imageUrl = builder.imageUrl;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #68  <Method Uri ShareLinkContent$Builder.access$200(ShareLinkContent$Builder)>
	//   14   26:putfield        #53  <Field Uri imageUrl>
	//   15   29:return          
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
	//    1    1:getfield        #37  <Field String contentDescription>
	//    2    4:areturn         
	}

	public String getContentTitle()
	{
		return contentTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String contentTitle>
	//    2    4:areturn         
	}

	public Uri getImageUrl()
	{
		return imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Uri imageUrl>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #83  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeString(contentDescription);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field String contentDescription>
	//    7   11:invokevirtual   #87  <Method void Parcel.writeString(String)>
		parcel.writeString(contentTitle);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field String contentTitle>
	//   11   19:invokevirtual   #87  <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (imageUrl)), 0);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #53  <Field Uri imageUrl>
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #91  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   17   31:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareLinkContent createFromParcel(Parcel parcel)
		{
			return new ShareLinkContent(parcel);
		//    0    0:new             #9   <Class ShareLinkContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareLinkContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareLinkContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareLinkContent[] newArray(int i)
		{
			return new ShareLinkContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareLinkContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareLinkContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String contentDescription;
	private final String contentTitle;
	private final Uri imageUrl;

	static 
	{
	//    0    0:new             #7   <Class ShareLinkContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ShareLinkContent$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
