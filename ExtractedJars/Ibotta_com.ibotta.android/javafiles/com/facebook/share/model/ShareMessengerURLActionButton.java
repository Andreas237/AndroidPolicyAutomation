// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareMessengerActionButton

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton
{
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
	//    2    2:invokespecial   #31  <Method void ShareMessengerActionButton(Parcel)>
		url = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #33  <Class Uri>
	//    6    9:invokevirtual   #39  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #45  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    8   15:checkcast       #33  <Class Uri>
	//    9   18:putfield        #47  <Field Uri url>
		byte byte0 = parcel.readByte();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #51  <Method byte Parcel.readByte()>
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
	//   24   42:putfield        #53  <Field boolean isMessengerExtensionURL>
		fallbackUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:ldc1            #33  <Class Uri>
	//   28   49:invokevirtual   #39  <Method ClassLoader Class.getClassLoader()>
	//   29   52:invokevirtual   #45  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   30   55:checkcast       #33  <Class Uri>
	//   31   58:putfield        #55  <Field Uri fallbackUrl>
		webviewHeightRatio = (WebviewHeightRatio)parcel.readSerializable();
	//   32   61:aload_0         
	//   33   62:aload_1         
	//   34   63:invokevirtual   #59  <Method java.io.Serializable Parcel.readSerializable()>
	//   35   66:checkcast       #8   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
	//   36   69:putfield        #61  <Field ShareMessengerURLActionButton$WebviewHeightRatio webviewHeightRatio>
		if(parcel.readByte() != 0)
	//*  37   72:aload_1         
	//*  38   73:invokevirtual   #51  <Method byte Parcel.readByte()>
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
	//   47   89:putfield        #63  <Field boolean shouldHideWebviewShareButton>
	//   48   92:return          
	}

	public Uri getFallbackUrl()
	{
		return fallbackUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Uri fallbackUrl>
	//    2    4:areturn         
	}

	public boolean getIsMessengerExtensionURL()
	{
		return isMessengerExtensionURL;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean isMessengerExtensionURL>
	//    2    4:ireturn         
	}

	public boolean getShouldHideWebviewShareButton()
	{
		return shouldHideWebviewShareButton;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean shouldHideWebviewShareButton>
	//    2    4:ireturn         
	}

	public Uri getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Uri url>
	//    2    4:areturn         
	}

	public WebviewHeightRatio getWebviewHeightRatio()
	{
		return webviewHeightRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ShareMessengerURLActionButton$WebviewHeightRatio webviewHeightRatio>
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
	//    2    4:invokespecial   #25  <Method void ShareMessengerURLActionButton$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
