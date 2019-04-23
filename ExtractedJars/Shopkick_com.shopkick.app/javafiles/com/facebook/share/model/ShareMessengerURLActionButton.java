// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareMessengerActionButton, ShareModel, ShareModelBuilder

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton
{
	public static final class Builder extends ShareMessengerActionButton.Builder
	{

		public ShareMessengerURLActionButton build()
		{
			return new ShareMessengerURLActionButton(this);
		//    0    0:new             #7   <Class ShareMessengerURLActionButton>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #44  <Method void ShareMessengerURLActionButton(ShareMessengerURLActionButton$Builder, ShareMessengerURLActionButton$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #47  <Method ShareMessengerURLActionButton build()>
		//    2    4:areturn         
		}

		public volatile ShareMessengerActionButton.Builder readFrom(ShareMessengerActionButton sharemessengeractionbutton)
		{
			return ((ShareMessengerActionButton.Builder) (readFrom((ShareMessengerURLActionButton)sharemessengeractionbutton)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareMessengerURLActionButton>
		//    3    5:invokevirtual   #52  <Method ShareMessengerURLActionButton$Builder readFrom(ShareMessengerURLActionButton)>
		//    4    8:areturn         
		}

		public Builder readFrom(ShareMessengerURLActionButton sharemessengerurlactionbutton)
		{
			if(sharemessengerurlactionbutton == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setUrl(sharemessengerurlactionbutton.getUrl()).setIsMessengerExtensionURL(sharemessengerurlactionbutton.getIsMessengerExtensionURL()).setFallbackUrl(sharemessengerurlactionbutton.getFallbackUrl()).setWebviewHeightRatio(sharemessengerurlactionbutton.getWebviewHeightRatio()).setShouldHideWebviewShareButton(sharemessengerurlactionbutton.getShouldHideWebviewShareButton());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #56  <Method Uri ShareMessengerURLActionButton.getUrl()>
		//    7   11:invokevirtual   #60  <Method ShareMessengerURLActionButton$Builder setUrl(Uri)>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #64  <Method boolean ShareMessengerURLActionButton.getIsMessengerExtensionURL()>
		//   10   18:invokevirtual   #68  <Method ShareMessengerURLActionButton$Builder setIsMessengerExtensionURL(boolean)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #71  <Method Uri ShareMessengerURLActionButton.getFallbackUrl()>
		//   13   25:invokevirtual   #74  <Method ShareMessengerURLActionButton$Builder setFallbackUrl(Uri)>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #78  <Method ShareMessengerURLActionButton$WebviewHeightRatio ShareMessengerURLActionButton.getWebviewHeightRatio()>
		//   16   32:invokevirtual   #82  <Method ShareMessengerURLActionButton$Builder setWebviewHeightRatio(ShareMessengerURLActionButton$WebviewHeightRatio)>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #85  <Method boolean ShareMessengerURLActionButton.getShouldHideWebviewShareButton()>
		//   19   39:invokevirtual   #88  <Method ShareMessengerURLActionButton$Builder setShouldHideWebviewShareButton(boolean)>
		//   20   42:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareMessengerURLActionButton)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareMessengerURLActionButton>
		//    3    5:invokevirtual   #52  <Method ShareMessengerURLActionButton$Builder readFrom(ShareMessengerURLActionButton)>
		//    4    8:areturn         
		}

		public Builder setFallbackUrl(Uri uri)
		{
			fallbackUrl = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #32  <Field Uri fallbackUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setIsMessengerExtensionURL(boolean flag)
		{
			isMessengerExtensionURL = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #29  <Field boolean isMessengerExtensionURL>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setShouldHideWebviewShareButton(boolean flag)
		{
			shouldHideWebviewShareButton = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #39  <Field boolean shouldHideWebviewShareButton>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setUrl(Uri uri)
		{
			url = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field Uri url>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWebviewHeightRatio(WebviewHeightRatio webviewheightratio)
		{
			webviewHeightRatio = webviewheightratio;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field ShareMessengerURLActionButton$WebviewHeightRatio webviewHeightRatio>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Uri fallbackUrl;
		private boolean isMessengerExtensionURL;
		private boolean shouldHideWebviewShareButton;
		private Uri url;
		private WebviewHeightRatio webviewHeightRatio;


/*
		static Uri access$000(Builder builder)
		{
			return builder.url;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Uri url>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$100(Builder builder)
		{
			return builder.isMessengerExtensionURL;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field boolean isMessengerExtensionURL>
		//    2    4:ireturn         
		}

*/


/*
		static Uri access$200(Builder builder)
		{
			return builder.fallbackUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field Uri fallbackUrl>
		//    2    4:areturn         
		}

*/


/*
		static WebviewHeightRatio access$300(Builder builder)
		{
			return builder.webviewHeightRatio;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ShareMessengerURLActionButton$WebviewHeightRatio webviewHeightRatio>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$400(Builder builder)
		{
			return builder.shouldHideWebviewShareButton;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field boolean shouldHideWebviewShareButton>
		//    2    4:ireturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void ShareMessengerActionButton$Builder()>
		//    2    4:return          
		}
	}

	public static final class WebviewHeightRatio extends Enum
	{

		public static WebviewHeightRatio valueOf(String s)
		{
			return (WebviewHeightRatio)Enum.valueOf(com/facebook/share/model/ShareMessengerURLActionButton$WebviewHeightRatio, s);
		//    0    0:ldc1            #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
		//    4    9:areturn         
		}

		public static WebviewHeightRatio[] values()
		{
			return (WebviewHeightRatio[])((WebviewHeightRatio []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field ShareMessengerURLActionButton$WebviewHeightRatio[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio_3B_.clone()>
		//    2    6:checkcast       #42  <Class ShareMessengerURLActionButton$WebviewHeightRatio[]>
		//    3    9:areturn         
		}

		private static final WebviewHeightRatio $VALUES[];
		public static final WebviewHeightRatio WebviewHeightRatioCompact;
		public static final WebviewHeightRatio WebviewHeightRatioFull;
		public static final WebviewHeightRatio WebviewHeightRatioTall;

		static 
		{
			WebviewHeightRatioFull = new WebviewHeightRatio("WebviewHeightRatioFull", 0);
		//    0    0:new             #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "WebviewHeightRatioFull">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void ShareMessengerURLActionButton$WebviewHeightRatio(String, int)>
		//    5   10:putstatic       #23  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioFull>
			WebviewHeightRatioTall = new WebviewHeightRatio("WebviewHeightRatioTall", 1);
		//    6   13:new             #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "WebviewHeightRatioTall">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void ShareMessengerURLActionButton$WebviewHeightRatio(String, int)>
		//   11   23:putstatic       #26  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioTall>
			WebviewHeightRatioCompact = new WebviewHeightRatio("WebviewHeightRatioCompact", 2);
		//   12   26:new             #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "WebviewHeightRatioCompact">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void ShareMessengerURLActionButton$WebviewHeightRatio(String, int)>
		//   17   36:putstatic       #29  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioCompact>
			$VALUES = (new WebviewHeightRatio[] {
				WebviewHeightRatioFull, WebviewHeightRatioTall, WebviewHeightRatioCompact
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       WebviewHeightRatio[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioFull>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioTall>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioCompact>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field ShareMessengerURLActionButton$WebviewHeightRatio[] $VALUES>
		//*  33   64:return          
		}

		private WebviewHeightRatio(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	ShareMessengerURLActionButton(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void ShareMessengerActionButton(Parcel)>
		url = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #36  <Class Uri>
	//    6    9:invokevirtual   #42  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #48  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    8   15:checkcast       #36  <Class Uri>
	//    9   18:putfield        #50  <Field Uri url>
		byte byte0 = parcel.readByte();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #54  <Method byte Parcel.readByte()>
	//   12   25:istore_2        
		boolean flag1 = true;
	//   13   26:iconst_1        
	//   14   27:istore          4
		boolean flag;
		if(byte0 != 0)
	//*  15   29:iload_2         
	//*  16   30:ifeq            38
			flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_3        
		else
	//*  19   35:goto            40
			flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_3        
		isMessengerExtensionURL = flag;
	//   22   40:aload_0         
	//   23   41:iload_3         
	//   24   42:putfield        #56  <Field boolean isMessengerExtensionURL>
		fallbackUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:ldc1            #36  <Class Uri>
	//   28   49:invokevirtual   #42  <Method ClassLoader Class.getClassLoader()>
	//   29   52:invokevirtual   #48  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   30   55:checkcast       #36  <Class Uri>
	//   31   58:putfield        #58  <Field Uri fallbackUrl>
		webviewHeightRatio = (WebviewHeightRatio)parcel.readSerializable();
	//   32   61:aload_0         
	//   33   62:aload_1         
	//   34   63:invokevirtual   #62  <Method java.io.Serializable Parcel.readSerializable()>
	//   35   66:checkcast       #11  <Class ShareMessengerURLActionButton$WebviewHeightRatio>
	//   36   69:putfield        #64  <Field ShareMessengerURLActionButton$WebviewHeightRatio webviewHeightRatio>
		if(parcel.readByte() != 0)
	//*  37   72:aload_1         
	//*  38   73:invokevirtual   #54  <Method byte Parcel.readByte()>
	//*  39   76:ifeq            85
			flag = flag1;
	//   40   79:iload           4
	//   41   81:istore_3        
		else
	//*  42   82:goto            87
			flag = false;
	//   43   85:iconst_0        
	//   44   86:istore_3        
		shouldHideWebviewShareButton = flag;
	//   45   87:aload_0         
	//   46   88:iload_3         
	//   47   89:putfield        #66  <Field boolean shouldHideWebviewShareButton>
	//   48   92:return          
	}

	private ShareMessengerURLActionButton(Builder builder)
	{
		super(((ShareMessengerActionButton.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void ShareMessengerActionButton(ShareMessengerActionButton$Builder)>
		url = builder.url;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #74  <Method Uri ShareMessengerURLActionButton$Builder.access$000(ShareMessengerURLActionButton$Builder)>
	//    6   10:putfield        #50  <Field Uri url>
		isMessengerExtensionURL = builder.isMessengerExtensionURL;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #78  <Method boolean ShareMessengerURLActionButton$Builder.access$100(ShareMessengerURLActionButton$Builder)>
	//   10   18:putfield        #56  <Field boolean isMessengerExtensionURL>
		fallbackUrl = builder.fallbackUrl;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #81  <Method Uri ShareMessengerURLActionButton$Builder.access$200(ShareMessengerURLActionButton$Builder)>
	//   14   26:putfield        #58  <Field Uri fallbackUrl>
		webviewHeightRatio = builder.webviewHeightRatio;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokestatic    #85  <Method ShareMessengerURLActionButton$WebviewHeightRatio ShareMessengerURLActionButton$Builder.access$300(ShareMessengerURLActionButton$Builder)>
	//   18   34:putfield        #64  <Field ShareMessengerURLActionButton$WebviewHeightRatio webviewHeightRatio>
		shouldHideWebviewShareButton = builder.shouldHideWebviewShareButton;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokestatic    #88  <Method boolean ShareMessengerURLActionButton$Builder.access$400(ShareMessengerURLActionButton$Builder)>
	//   22   42:putfield        #66  <Field boolean shouldHideWebviewShareButton>
	//   23   45:return          
	}


	public Uri getFallbackUrl()
	{
		return fallbackUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Uri fallbackUrl>
	//    2    4:areturn         
	}

	public boolean getIsMessengerExtensionURL()
	{
		return isMessengerExtensionURL;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean isMessengerExtensionURL>
	//    2    4:ireturn         
	}

	public boolean getShouldHideWebviewShareButton()
	{
		return shouldHideWebviewShareButton;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean shouldHideWebviewShareButton>
	//    2    4:ireturn         
	}

	public Uri getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Uri url>
	//    2    4:areturn         
	}

	public WebviewHeightRatio getWebviewHeightRatio()
	{
		return webviewHeightRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ShareMessengerURLActionButton$WebviewHeightRatio webviewHeightRatio>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareMessengerURLActionButton createFromParcel(Parcel parcel)
		{
			return new ShareMessengerURLActionButton(parcel);
		//    0    0:new             #9   <Class ShareMessengerURLActionButton>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareMessengerURLActionButton(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareMessengerURLActionButton createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareMessengerURLActionButton[] newArray(int i)
		{
			return new ShareMessengerURLActionButton[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareMessengerURLActionButton[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareMessengerURLActionButton[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final Uri fallbackUrl;
	private final boolean isMessengerExtensionURL;
	private final boolean shouldHideWebviewShareButton;
	private final Uri url;
	private final WebviewHeightRatio webviewHeightRatio;

	static 
	{
	//    0    0:new             #6   <Class ShareMessengerURLActionButton$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void ShareMessengerURLActionButton$1()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
