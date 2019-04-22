// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareMessengerActionButton

public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent
{

	ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void ShareContent(Parcel)>
		url = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #27  <Class Uri>
	//    6    9:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #39  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    8   15:checkcast       #27  <Class Uri>
	//    9   18:putfield        #41  <Field Uri url>
		button = (ShareMessengerActionButton)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerActionButton)).getClassLoader());
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #43  <Class ShareMessengerActionButton>
	//   13   25:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
	//   14   28:invokevirtual   #39  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   15   31:checkcast       #43  <Class ShareMessengerActionButton>
	//   16   34:putfield        #45  <Field ShareMessengerActionButton button>
	//   17   37:return          
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
	//    1    1:getfield        #45  <Field ShareMessengerActionButton button>
	//    2    4:areturn         
	}

	public Uri getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Uri url>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable(((android.os.Parcelable) (url)), i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Uri url>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #57  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (button)), i);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #45  <Field ShareMessengerActionButton button>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #57  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
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
	//    2    4:invokespecial   #19  <Method void ShareMessengerOpenGraphMusicTemplateContent$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
