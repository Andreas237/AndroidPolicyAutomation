// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareMessengerActionButton

public final class ShareMessengerGenericTemplateElement
	implements ShareModel
{

	ShareMessengerGenericTemplateElement(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		title = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #35  <Method String Parcel.readString()>
	//    5    9:putfield        #37  <Field String title>
		subtitle = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #35  <Method String Parcel.readString()>
	//    9   17:putfield        #39  <Field String subtitle>
		imageUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:ldc1            #41  <Class Uri>
	//   13   24:invokevirtual   #47  <Method ClassLoader Class.getClassLoader()>
	//   14   27:invokevirtual   #51  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   15   30:checkcast       #41  <Class Uri>
	//   16   33:putfield        #53  <Field Uri imageUrl>
		defaultAction = (ShareMessengerActionButton)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerActionButton)).getClassLoader());
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:ldc1            #55  <Class ShareMessengerActionButton>
	//   20   40:invokevirtual   #47  <Method ClassLoader Class.getClassLoader()>
	//   21   43:invokevirtual   #51  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   22   46:checkcast       #55  <Class ShareMessengerActionButton>
	//   23   49:putfield        #57  <Field ShareMessengerActionButton defaultAction>
		button = (ShareMessengerActionButton)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerActionButton)).getClassLoader());
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:ldc1            #55  <Class ShareMessengerActionButton>
	//   27   56:invokevirtual   #47  <Method ClassLoader Class.getClassLoader()>
	//   28   59:invokevirtual   #51  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   29   62:checkcast       #55  <Class ShareMessengerActionButton>
	//   30   65:putfield        #59  <Field ShareMessengerActionButton button>
	//   31   68:return          
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
	//    1    1:getfield        #59  <Field ShareMessengerActionButton button>
	//    2    4:areturn         
	}

	public ShareMessengerActionButton getDefaultAction()
	{
		return defaultAction;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ShareMessengerActionButton defaultAction>
	//    2    4:areturn         
	}

	public Uri getImageUrl()
	{
		return imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Uri imageUrl>
	//    2    4:areturn         
	}

	public String getSubtitle()
	{
		return subtitle;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String subtitle>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String title>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(title);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field String title>
	//    3    5:invokevirtual   #74  <Method void Parcel.writeString(String)>
		parcel.writeString(subtitle);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field String subtitle>
	//    7   13:invokevirtual   #74  <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (imageUrl)), i);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #53  <Field Uri imageUrl>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #78  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (defaultAction)), i);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #57  <Field ShareMessengerActionButton defaultAction>
	//   16   30:iload_2         
	//   17   31:invokevirtual   #78  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (button)), i);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #59  <Field ShareMessengerActionButton button>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #78  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   23   43:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel)
		{
			return new ShareMessengerGenericTemplateElement(parcel);
		//    0    0:new             #9   <Class ShareMessengerGenericTemplateElement>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareMessengerGenericTemplateElement(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareMessengerGenericTemplateElement createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareMessengerGenericTemplateElement[] newArray(int i)
		{
			return new ShareMessengerGenericTemplateElement[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareMessengerGenericTemplateElement[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareMessengerGenericTemplateElement[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final ShareMessengerActionButton button;
	private final ShareMessengerActionButton defaultAction;
	private final Uri imageUrl;
	private final String subtitle;
	private final String title;

	static 
	{
	//    0    0:new             #8   <Class ShareMessengerGenericTemplateElement$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ShareMessengerGenericTemplateElement$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
