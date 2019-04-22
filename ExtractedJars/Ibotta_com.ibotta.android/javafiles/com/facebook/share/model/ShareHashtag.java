// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

public class ShareHashtag
	implements ShareModel
{
	public static class Builder
		implements ShareModelBuilder
	{

		public ShareHashtag build()
		{
			return new ShareHashtag(this);
		//    0    0:new             #9   <Class ShareHashtag>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #26  <Method void ShareHashtag(ShareHashtag$Builder, ShareHashtag$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #29  <Method ShareHashtag build()>
		//    2    4:areturn         
		}

		Builder readFrom(Parcel parcel)
		{
			return readFrom((ShareHashtag)parcel.readParcelable(((Class) (com/facebook/share/model/ShareHashtag)).getClassLoader()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #9   <Class ShareHashtag>
		//    3    4:invokevirtual   #37  <Method ClassLoader Class.getClassLoader()>
		//    4    7:invokevirtual   #43  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
		//    5   10:checkcast       #9   <Class ShareHashtag>
		//    6   13:invokevirtual   #46  <Method ShareHashtag$Builder readFrom(ShareHashtag)>
		//    7   16:areturn         
		}

		public Builder readFrom(ShareHashtag sharehashtag)
		{
			if(sharehashtag == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setHashtag(sharehashtag.getHashtag());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #50  <Method String ShareHashtag.getHashtag()>
		//    7   11:invokevirtual   #54  <Method ShareHashtag$Builder setHashtag(String)>
		//    8   14:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareHashtag)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class ShareHashtag>
		//    3    5:invokevirtual   #46  <Method ShareHashtag$Builder readFrom(ShareHashtag)>
		//    4    8:areturn         
		}

		public Builder setHashtag(String s)
		{
			hashtag = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field String hashtag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String hashtag;


/*
		static String access$000(Builder builder)
		{
			return builder.hashtag;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String hashtag>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	ShareHashtag(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		hashtag = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method String Parcel.readString()>
	//    5    9:putfield        #34  <Field String hashtag>
	//    6   12:return          
	}

	private ShareHashtag(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		hashtag = builder.hashtag;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #39  <Method String ShareHashtag$Builder.access$000(ShareHashtag$Builder)>
	//    5    9:putfield        #34  <Field String hashtag>
	//    6   12:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getHashtag()
	{
		return hashtag;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String hashtag>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(hashtag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field String hashtag>
	//    3    5:invokevirtual   #51  <Method void Parcel.writeString(String)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareHashtag createFromParcel(Parcel parcel)
		{
			return new ShareHashtag(parcel);
		//    0    0:new             #9   <Class ShareHashtag>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareHashtag(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareHashtag createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareHashtag[] newArray(int i)
		{
			return new ShareHashtag[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareHashtag[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareHashtag[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String hashtag;

	static 
	{
	//    0    0:new             #8   <Class ShareHashtag$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ShareHashtag$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
