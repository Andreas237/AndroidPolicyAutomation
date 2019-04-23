// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareMessengerActionButton, ShareModelBuilder

public final class ShareMessengerGenericTemplateElement
	implements ShareModel
{
	public static class Builder
		implements ShareModelBuilder
	{

		public ShareMessengerGenericTemplateElement build()
		{
			return new ShareMessengerGenericTemplateElement(this);
		//    0    0:new             #9   <Class ShareMessengerGenericTemplateElement>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #46  <Method void ShareMessengerGenericTemplateElement(ShareMessengerGenericTemplateElement$Builder, ShareMessengerGenericTemplateElement$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #49  <Method ShareMessengerGenericTemplateElement build()>
		//    2    4:areturn         
		}

		Builder readFrom(Parcel parcel)
		{
			return readFrom((ShareMessengerGenericTemplateElement)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerGenericTemplateElement)).getClassLoader()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #9   <Class ShareMessengerGenericTemplateElement>
		//    3    4:invokevirtual   #57  <Method ClassLoader Class.getClassLoader()>
		//    4    7:invokevirtual   #63  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
		//    5   10:checkcast       #9   <Class ShareMessengerGenericTemplateElement>
		//    6   13:invokevirtual   #66  <Method ShareMessengerGenericTemplateElement$Builder readFrom(ShareMessengerGenericTemplateElement)>
		//    7   16:areturn         
		}

		public Builder readFrom(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
		{
			if(sharemessengergenerictemplateelement == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setTitle(sharemessengergenerictemplateelement.title).setSubtitle(sharemessengergenerictemplateelement.subtitle).setImageUrl(sharemessengergenerictemplateelement.imageUrl).setDefaultAction(sharemessengergenerictemplateelement.defaultAction).setButton(sharemessengergenerictemplateelement.button);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokestatic    #70  <Method String ShareMessengerGenericTemplateElement.access$1000(ShareMessengerGenericTemplateElement)>
		//    7   11:invokevirtual   #74  <Method ShareMessengerGenericTemplateElement$Builder setTitle(String)>
		//    8   14:aload_1         
		//    9   15:invokestatic    #77  <Method String ShareMessengerGenericTemplateElement.access$900(ShareMessengerGenericTemplateElement)>
		//   10   18:invokevirtual   #80  <Method ShareMessengerGenericTemplateElement$Builder setSubtitle(String)>
		//   11   21:aload_1         
		//   12   22:invokestatic    #84  <Method Uri ShareMessengerGenericTemplateElement.access$800(ShareMessengerGenericTemplateElement)>
		//   13   25:invokevirtual   #88  <Method ShareMessengerGenericTemplateElement$Builder setImageUrl(Uri)>
		//   14   28:aload_1         
		//   15   29:invokestatic    #92  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.access$700(ShareMessengerGenericTemplateElement)>
		//   16   32:invokevirtual   #96  <Method ShareMessengerGenericTemplateElement$Builder setDefaultAction(ShareMessengerActionButton)>
		//   17   35:aload_1         
		//   18   36:invokestatic    #99  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.access$600(ShareMessengerGenericTemplateElement)>
		//   19   39:invokevirtual   #102 <Method ShareMessengerGenericTemplateElement$Builder setButton(ShareMessengerActionButton)>
		//   20   42:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareMessengerGenericTemplateElement)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class ShareMessengerGenericTemplateElement>
		//    3    5:invokevirtual   #66  <Method ShareMessengerGenericTemplateElement$Builder readFrom(ShareMessengerGenericTemplateElement)>
		//    4    8:areturn         
		}

		public Builder setButton(ShareMessengerActionButton sharemessengeractionbutton)
		{
			button = sharemessengeractionbutton;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field ShareMessengerActionButton button>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDefaultAction(ShareMessengerActionButton sharemessengeractionbutton)
		{
			defaultAction = sharemessengeractionbutton;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field ShareMessengerActionButton defaultAction>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setImageUrl(Uri uri)
		{
			imageUrl = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field Uri imageUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSubtitle(String s)
		{
			subtitle = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field String subtitle>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTitle(String s)
		{
			title = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field String title>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private ShareMessengerActionButton button;
		private ShareMessengerActionButton defaultAction;
		private Uri imageUrl;
		private String subtitle;
		private String title;


/*
		static String access$000(Builder builder)
		{
			return builder.title;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field String title>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.subtitle;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field String subtitle>
		//    2    4:areturn         
		}

*/


/*
		static Uri access$200(Builder builder)
		{
			return builder.imageUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Uri imageUrl>
		//    2    4:areturn         
		}

*/


/*
		static ShareMessengerActionButton access$300(Builder builder)
		{
			return builder.defaultAction;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field ShareMessengerActionButton defaultAction>
		//    2    4:areturn         
		}

*/


/*
		static ShareMessengerActionButton access$400(Builder builder)
		{
			return builder.button;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field ShareMessengerActionButton button>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:return          
		}
	}


	ShareMessengerGenericTemplateElement(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		title = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #38  <Method String Parcel.readString()>
	//    5    9:putfield        #40  <Field String title>
		subtitle = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method String Parcel.readString()>
	//    9   17:putfield        #42  <Field String subtitle>
		imageUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:ldc1            #44  <Class Uri>
	//   13   24:invokevirtual   #50  <Method ClassLoader Class.getClassLoader()>
	//   14   27:invokevirtual   #54  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   15   30:checkcast       #44  <Class Uri>
	//   16   33:putfield        #56  <Field Uri imageUrl>
		defaultAction = (ShareMessengerActionButton)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerActionButton)).getClassLoader());
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:ldc1            #58  <Class ShareMessengerActionButton>
	//   20   40:invokevirtual   #50  <Method ClassLoader Class.getClassLoader()>
	//   21   43:invokevirtual   #54  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   22   46:checkcast       #58  <Class ShareMessengerActionButton>
	//   23   49:putfield        #60  <Field ShareMessengerActionButton defaultAction>
		button = (ShareMessengerActionButton)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerActionButton)).getClassLoader());
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:ldc1            #58  <Class ShareMessengerActionButton>
	//   27   56:invokevirtual   #50  <Method ClassLoader Class.getClassLoader()>
	//   28   59:invokevirtual   #54  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   29   62:checkcast       #58  <Class ShareMessengerActionButton>
	//   30   65:putfield        #62  <Field ShareMessengerActionButton button>
	//   31   68:return          
	}

	private ShareMessengerGenericTemplateElement(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		title = builder.title;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #67  <Method String ShareMessengerGenericTemplateElement$Builder.access$000(ShareMessengerGenericTemplateElement$Builder)>
	//    5    9:putfield        #40  <Field String title>
		subtitle = builder.subtitle;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #70  <Method String ShareMessengerGenericTemplateElement$Builder.access$100(ShareMessengerGenericTemplateElement$Builder)>
	//    9   17:putfield        #42  <Field String subtitle>
		imageUrl = builder.imageUrl;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #74  <Method Uri ShareMessengerGenericTemplateElement$Builder.access$200(ShareMessengerGenericTemplateElement$Builder)>
	//   13   25:putfield        #56  <Field Uri imageUrl>
		defaultAction = builder.defaultAction;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #78  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement$Builder.access$300(ShareMessengerGenericTemplateElement$Builder)>
	//   17   33:putfield        #60  <Field ShareMessengerActionButton defaultAction>
		button = builder.button;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #81  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement$Builder.access$400(ShareMessengerGenericTemplateElement$Builder)>
	//   21   41:putfield        #62  <Field ShareMessengerActionButton button>
	//   22   44:return          
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
	//    1    1:getfield        #62  <Field ShareMessengerActionButton button>
	//    2    4:areturn         
	}

	public ShareMessengerActionButton getDefaultAction()
	{
		return defaultAction;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ShareMessengerActionButton defaultAction>
	//    2    4:areturn         
	}

	public Uri getImageUrl()
	{
		return imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Uri imageUrl>
	//    2    4:areturn         
	}

	public String getSubtitle()
	{
		return subtitle;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String subtitle>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String title>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(title);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field String title>
	//    3    5:invokevirtual   #107 <Method void Parcel.writeString(String)>
		parcel.writeString(subtitle);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field String subtitle>
	//    7   13:invokevirtual   #107 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (imageUrl)), i);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #56  <Field Uri imageUrl>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #111 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (defaultAction)), i);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field ShareMessengerActionButton defaultAction>
	//   16   30:iload_2         
	//   17   31:invokevirtual   #111 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (button)), i);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #62  <Field ShareMessengerActionButton button>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #111 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
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
	//    2    4:invokespecial   #27  <Method void ShareMessengerGenericTemplateElement$1()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}


/*
	static String access$1000(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
	{
		return sharemessengergenerictemplateelement.title;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String title>
	//    2    4:areturn         
	}

*/


/*
	static ShareMessengerActionButton access$600(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
	{
		return sharemessengergenerictemplateelement.button;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ShareMessengerActionButton button>
	//    2    4:areturn         
	}

*/


/*
	static ShareMessengerActionButton access$700(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
	{
		return sharemessengergenerictemplateelement.defaultAction;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ShareMessengerActionButton defaultAction>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$800(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
	{
		return sharemessengergenerictemplateelement.imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Uri imageUrl>
	//    2    4:areturn         
	}

*/


/*
	static String access$900(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
	{
		return sharemessengergenerictemplateelement.subtitle;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String subtitle>
	//    2    4:areturn         
	}

*/
}
