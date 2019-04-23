// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareMessengerActionButton, ShareModel, ShareModelBuilder

public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent
{
	public static class Builder extends ShareContent.Builder
	{

		public ShareMessengerOpenGraphMusicTemplateContent build()
		{
			return new ShareMessengerOpenGraphMusicTemplateContent(this);
		//    0    0:new             #7   <Class ShareMessengerOpenGraphMusicTemplateContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #30  <Method void ShareMessengerOpenGraphMusicTemplateContent(ShareMessengerOpenGraphMusicTemplateContent$Builder, ShareMessengerOpenGraphMusicTemplateContent$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method ShareMessengerOpenGraphMusicTemplateContent build()>
		//    2    4:areturn         
		}

		public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
		{
			return ((ShareContent.Builder) (readFrom((ShareMessengerOpenGraphMusicTemplateContent)sharecontent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareMessengerOpenGraphMusicTemplateContent>
		//    3    5:invokevirtual   #38  <Method ShareMessengerOpenGraphMusicTemplateContent$Builder readFrom(ShareMessengerOpenGraphMusicTemplateContent)>
		//    4    8:areturn         
		}

		public Builder readFrom(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		{
			if(sharemessengeropengraphmusictemplatecontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareContent) (sharemessengeropengraphmusictemplatecontent)))).setUrl(sharemessengeropengraphmusictemplatecontent.getUrl()).setButton(sharemessengeropengraphmusictemplatecontent.getButton());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #40  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
		//    7   11:checkcast       #2   <Class ShareMessengerOpenGraphMusicTemplateContent$Builder>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #44  <Method Uri ShareMessengerOpenGraphMusicTemplateContent.getUrl()>
		//   10   18:invokevirtual   #48  <Method ShareMessengerOpenGraphMusicTemplateContent$Builder setUrl(Uri)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #52  <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent.getButton()>
		//   13   25:invokevirtual   #56  <Method ShareMessengerOpenGraphMusicTemplateContent$Builder setButton(ShareMessengerActionButton)>
		//   14   28:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareMessengerOpenGraphMusicTemplateContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareMessengerOpenGraphMusicTemplateContent>
		//    3    5:invokevirtual   #38  <Method ShareMessengerOpenGraphMusicTemplateContent$Builder readFrom(ShareMessengerOpenGraphMusicTemplateContent)>
		//    4    8:areturn         
		}

		public Builder setButton(ShareMessengerActionButton sharemessengeractionbutton)
		{
			button = sharemessengeractionbutton;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field ShareMessengerActionButton button>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setUrl(Uri uri)
		{
			url = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field Uri url>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private ShareMessengerActionButton button;
		private Uri url;


/*
		static Uri access$000(Builder builder)
		{
			return builder.url;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Uri url>
		//    2    4:areturn         
		}

*/


/*
		static ShareMessengerActionButton access$100(Builder builder)
		{
			return builder.button;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ShareMessengerActionButton button>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void ShareContent$Builder()>
		//    2    4:return          
		}
	}


	ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void ShareContent(Parcel)>
		url = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #30  <Class Uri>
	//    6    9:invokevirtual   #36  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #42  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    8   15:checkcast       #30  <Class Uri>
	//    9   18:putfield        #44  <Field Uri url>
		button = (ShareMessengerActionButton)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerActionButton)).getClassLoader());
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #46  <Class ShareMessengerActionButton>
	//   13   25:invokevirtual   #36  <Method ClassLoader Class.getClassLoader()>
	//   14   28:invokevirtual   #42  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   15   31:checkcast       #46  <Class ShareMessengerActionButton>
	//   16   34:putfield        #48  <Field ShareMessengerActionButton button>
	//   17   37:return          
	}

	private ShareMessengerOpenGraphMusicTemplateContent(Builder builder)
	{
		super(((ShareContent.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void ShareContent(ShareContent$Builder)>
		url = builder.url;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #56  <Method Uri ShareMessengerOpenGraphMusicTemplateContent$Builder.access$000(ShareMessengerOpenGraphMusicTemplateContent$Builder)>
	//    6   10:putfield        #44  <Field Uri url>
		button = builder.button;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #60  <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent$Builder.access$100(ShareMessengerOpenGraphMusicTemplateContent$Builder)>
	//   10   18:putfield        #48  <Field ShareMessengerActionButton button>
	//   11   21:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ShareMessengerActionButton getButton()
	{
		return button;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ShareMessengerActionButton button>
	//    2    4:areturn         
	}

	public Uri getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Uri url>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable(((android.os.Parcelable) (url)), i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field Uri url>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #75  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (button)), i);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #48  <Field ShareMessengerActionButton button>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #75  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   10   18:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareMessengerOpenGraphMusicTemplateContent createFromParcel(Parcel parcel)
		{
			return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
		//    0    0:new             #9   <Class ShareMessengerOpenGraphMusicTemplateContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareMessengerOpenGraphMusicTemplateContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareMessengerOpenGraphMusicTemplateContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareMessengerOpenGraphMusicTemplateContent[] newArray(int i)
		{
			return new ShareMessengerOpenGraphMusicTemplateContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareMessengerOpenGraphMusicTemplateContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareMessengerOpenGraphMusicTemplateContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final ShareMessengerActionButton button;
	private final Uri url;

	static 
	{
	//    0    0:new             #7   <Class ShareMessengerOpenGraphMusicTemplateContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ShareMessengerOpenGraphMusicTemplateContent$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
