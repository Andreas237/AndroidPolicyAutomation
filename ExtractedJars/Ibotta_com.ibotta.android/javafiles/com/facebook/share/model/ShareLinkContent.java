// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent

public final class ShareLinkContent extends ShareContent
{

	ShareLinkContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void ShareContent(Parcel)>
		contentDescription = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #34  <Method String Parcel.readString()>
	//    6   10:putfield        #36  <Field String contentDescription>
		contentTitle = parcel.readString();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #34  <Method String Parcel.readString()>
	//   10   18:putfield        #38  <Field String contentTitle>
		imageUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:ldc1            #40  <Class Uri>
	//   14   25:invokevirtual   #46  <Method ClassLoader Class.getClassLoader()>
	//   15   28:invokevirtual   #50  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   16   31:checkcast       #40  <Class Uri>
	//   17   34:putfield        #52  <Field Uri imageUrl>
		quote = parcel.readString();
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:invokevirtual   #34  <Method String Parcel.readString()>
	//   21   42:putfield        #54  <Field String quote>
	//   22   45:return          
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
	//    1    1:getfield        #36  <Field String contentDescription>
	//    2    4:areturn         
	}

	public String getContentTitle()
	{
		return contentTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String contentTitle>
	//    2    4:areturn         
	}

	public Uri getImageUrl()
	{
		return imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Uri imageUrl>
	//    2    4:areturn         
	}

	public String getQuote()
	{
		return quote;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String quote>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #68  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeString(contentDescription);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #36  <Field String contentDescription>
	//    7   11:invokevirtual   #72  <Method void Parcel.writeString(String)>
		parcel.writeString(contentTitle);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #38  <Field String contentTitle>
	//   11   19:invokevirtual   #72  <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (imageUrl)), 0);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #52  <Field Uri imageUrl>
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #76  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeString(quote);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #54  <Field String quote>
	//   20   36:invokevirtual   #72  <Method void Parcel.writeString(String)>
	//   21   39:return          
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
	private final String quote;

	static 
	{
	//    0    0:new             #7   <Class ShareLinkContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ShareLinkContent$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
