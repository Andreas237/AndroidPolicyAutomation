// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareMessengerActionButton

public final class ShareMessengerMediaTemplateContent extends ShareContent
{
	public static final class MediaType extends Enum
	{

		public static MediaType valueOf(String s)
		{
			return (MediaType)Enum.valueOf(com/facebook/share/model/ShareMessengerMediaTemplateContent$MediaType, s);
		//    0    0:ldc1            #2   <Class ShareMessengerMediaTemplateContent$MediaType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShareMessengerMediaTemplateContent$MediaType>
		//    4    9:areturn         
		}

		public static MediaType[] values()
		{
			return (MediaType[])((MediaType []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field ShareMessengerMediaTemplateContent$MediaType[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType_3B_.clone()>
		//    2    6:checkcast       #38  <Class ShareMessengerMediaTemplateContent$MediaType[]>
		//    3    9:areturn         
		}

		private static final MediaType $VALUES[];
		public static final MediaType IMAGE;
		public static final MediaType VIDEO;

		static 
		{
			IMAGE = new MediaType("IMAGE", 0);
		//    0    0:new             #2   <Class ShareMessengerMediaTemplateContent$MediaType>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "IMAGE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void ShareMessengerMediaTemplateContent$MediaType(String, int)>
		//    5   10:putstatic       #22  <Field ShareMessengerMediaTemplateContent$MediaType IMAGE>
			VIDEO = new MediaType("VIDEO", 1);
		//    6   13:new             #2   <Class ShareMessengerMediaTemplateContent$MediaType>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "VIDEO">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void ShareMessengerMediaTemplateContent$MediaType(String, int)>
		//   11   23:putstatic       #25  <Field ShareMessengerMediaTemplateContent$MediaType VIDEO>
			$VALUES = (new MediaType[] {
				IMAGE, VIDEO
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       MediaType[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field ShareMessengerMediaTemplateContent$MediaType IMAGE>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field ShareMessengerMediaTemplateContent$MediaType VIDEO>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field ShareMessengerMediaTemplateContent$MediaType[] $VALUES>
		//*  23   45:return          
		}

		private MediaType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	ShareMessengerMediaTemplateContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void ShareContent(Parcel)>
		mediaType = (MediaType)parcel.readSerializable();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #38  <Method java.io.Serializable Parcel.readSerializable()>
	//    6   10:checkcast       #9   <Class ShareMessengerMediaTemplateContent$MediaType>
	//    7   13:putfield        #40  <Field ShareMessengerMediaTemplateContent$MediaType mediaType>
		attachmentId = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #44  <Method String Parcel.readString()>
	//   11   21:putfield        #46  <Field String attachmentId>
		mediaUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc1            #48  <Class Uri>
	//   15   28:invokevirtual   #54  <Method ClassLoader Class.getClassLoader()>
	//   16   31:invokevirtual   #58  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   17   34:checkcast       #48  <Class Uri>
	//   18   37:putfield        #60  <Field Uri mediaUrl>
		button = (ShareMessengerActionButton)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerActionButton)).getClassLoader());
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #62  <Class ShareMessengerActionButton>
	//   22   44:invokevirtual   #54  <Method ClassLoader Class.getClassLoader()>
	//   23   47:invokevirtual   #58  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   24   50:checkcast       #62  <Class ShareMessengerActionButton>
	//   25   53:putfield        #64  <Field ShareMessengerActionButton button>
	//   26   56:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getAttachmentId()
	{
		return attachmentId;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String attachmentId>
	//    2    4:areturn         
	}

	public ShareMessengerActionButton getButton()
	{
		return button;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ShareMessengerActionButton button>
	//    2    4:areturn         
	}

	public MediaType getMediaType()
	{
		return mediaType;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ShareMessengerMediaTemplateContent$MediaType mediaType>
	//    2    4:areturn         
	}

	public Uri getMediaUrl()
	{
		return mediaUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Uri mediaUrl>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeSerializable(((java.io.Serializable) (mediaType)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field ShareMessengerMediaTemplateContent$MediaType mediaType>
	//    3    5:invokevirtual   #79  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeString(attachmentId);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field String attachmentId>
	//    7   13:invokevirtual   #83  <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (mediaUrl)), i);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #60  <Field Uri mediaUrl>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #87  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (button)), i);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #64  <Field ShareMessengerActionButton button>
	//   16   30:iload_2         
	//   17   31:invokevirtual   #87  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   18   34:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel)
		{
			return new ShareMessengerMediaTemplateContent(parcel);
		//    0    0:new             #9   <Class ShareMessengerMediaTemplateContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareMessengerMediaTemplateContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareMessengerMediaTemplateContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareMessengerMediaTemplateContent[] newArray(int i)
		{
			return new ShareMessengerMediaTemplateContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareMessengerMediaTemplateContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareMessengerMediaTemplateContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String attachmentId;
	private final ShareMessengerActionButton button;
	private final MediaType mediaType;
	private final Uri mediaUrl;

	static 
	{
	//    0    0:new             #7   <Class ShareMessengerMediaTemplateContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ShareMessengerMediaTemplateContent$1()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
