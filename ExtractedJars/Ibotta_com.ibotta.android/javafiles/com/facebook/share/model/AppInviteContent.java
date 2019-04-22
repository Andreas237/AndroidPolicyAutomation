// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;
import android.text.TextUtils;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

public final class AppInviteContent
	implements ShareModel
{
	public static class Builder
		implements ShareModelBuilder
	{

		private boolean isAlphanumericWithSpaces(String s)
		{
			for(int i = 0; i < s.length(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_3        
		//*   2    2:iload_3         
		//*   3    3:aload_1         
		//*   4    4:invokevirtual   #47  <Method int String.length()>
		//*   5    7:icmpge          46
			{
				char c = s.charAt(i);
		//    6   10:aload_1         
		//    7   11:iload_3         
		//    8   12:invokevirtual   #51  <Method char String.charAt(int)>
		//    9   15:istore_2        
				if(!Character.isDigit(c) && !Character.isLetter(c) && !Character.isSpaceChar(c))
		//*  10   16:iload_2         
		//*  11   17:invokestatic    #57  <Method boolean Character.isDigit(char)>
		//*  12   20:ifne            39
		//*  13   23:iload_2         
		//*  14   24:invokestatic    #60  <Method boolean Character.isLetter(char)>
		//*  15   27:ifne            39
		//*  16   30:iload_2         
		//*  17   31:invokestatic    #63  <Method boolean Character.isSpaceChar(char)>
		//*  18   34:ifne            39
					return false;
		//   19   37:iconst_0        
		//   20   38:ireturn         
			}

		//   21   39:iload_3         
		//   22   40:iconst_1        
		//   23   41:iadd            
		//   24   42:istore_3        
		//*  25   43:goto            2
			return true;
		//   26   46:iconst_1        
		//   27   47:ireturn         
		}

		public AppInviteContent build()
		{
			return new AppInviteContent(this);
		//    0    0:new             #9   <Class AppInviteContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #69  <Method void AppInviteContent(AppInviteContent$Builder, AppInviteContent$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #73  <Method AppInviteContent build()>
		//    2    4:areturn         
		}

		public Builder readFrom(AppInviteContent appinvitecontent)
		{
			if(appinvitecontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setApplinkUrl(appinvitecontent.getApplinkUrl()).setPreviewImageUrl(appinvitecontent.getPreviewImageUrl()).setPromotionDetails(appinvitecontent.getPromotionText(), appinvitecontent.getPromotionCode()).setDestination(appinvitecontent.getDestination());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #79  <Method String AppInviteContent.getApplinkUrl()>
		//    7   11:invokevirtual   #83  <Method AppInviteContent$Builder setApplinkUrl(String)>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #86  <Method String AppInviteContent.getPreviewImageUrl()>
		//   10   18:invokevirtual   #89  <Method AppInviteContent$Builder setPreviewImageUrl(String)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #92  <Method String AppInviteContent.getPromotionText()>
		//   13   25:aload_1         
		//   14   26:invokevirtual   #95  <Method String AppInviteContent.getPromotionCode()>
		//   15   29:invokevirtual   #99  <Method AppInviteContent$Builder setPromotionDetails(String, String)>
		//   16   32:aload_1         
		//   17   33:invokevirtual   #103 <Method AppInviteContent$Builder$Destination AppInviteContent.getDestination()>
		//   18   36:invokevirtual   #107 <Method AppInviteContent$Builder setDestination(AppInviteContent$Builder$Destination)>
		//   19   39:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((AppInviteContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class AppInviteContent>
		//    3    5:invokevirtual   #110 <Method AppInviteContent$Builder readFrom(AppInviteContent)>
		//    4    8:areturn         
		}

		public Builder setApplinkUrl(String s)
		{
			applinkUrl = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field String applinkUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDestination(Destination destination1)
		{
			destination = destination1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field AppInviteContent$Builder$Destination destination>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPreviewImageUrl(String s)
		{
			previewImageUrl = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field String previewImageUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPromotionDetails(String s, String s1)
		{
label0:
			{
				if(!TextUtils.isEmpty(((CharSequence) (s))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #116 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifne            91
				{
					if(s.length() <= 80)
		//*   3    7:aload_1         
		//*   4    8:invokevirtual   #47  <Method int String.length()>
		//*   5   11:bipush          80
		//*   6   13:icmpgt          81
					{
						if(isAlphanumericWithSpaces(s))
		//*   7   16:aload_0         
		//*   8   17:aload_1         
		//*   9   18:invokespecial   #118 <Method boolean isAlphanumericWithSpaces(String)>
		//*  10   21:ifeq            71
						{
							if(!TextUtils.isEmpty(((CharSequence) (s1))))
		//*  11   24:aload_2         
		//*  12   25:invokestatic    #116 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  13   28:ifne            98
								if(s1.length() <= 10)
		//*  14   31:aload_2         
		//*  15   32:invokevirtual   #47  <Method int String.length()>
		//*  16   35:bipush          10
		//*  17   37:icmpgt          61
								{
									if(!isAlphanumericWithSpaces(s1))
		//*  18   40:aload_0         
		//*  19   41:aload_2         
		//*  20   42:invokespecial   #118 <Method boolean isAlphanumericWithSpaces(String)>
		//*  21   45:ifeq            51
		//*  22   48:goto            98
										throw new IllegalArgumentException("Invalid promotion code, promotionCode can only contain alphanumeric characters and spaces.");
		//   23   51:new             #120 <Class IllegalArgumentException>
		//   24   54:dup             
		//   25   55:ldc1            #122 <String "Invalid promotion code, promotionCode can only contain alphanumeric characters and spaces.">
		//   26   57:invokespecial   #125 <Method void IllegalArgumentException(String)>
		//   27   60:athrow          
								} else
								{
									throw new IllegalArgumentException("Invalid promotion code, promotionCode can be between1 and 10 characters long");
		//   28   61:new             #120 <Class IllegalArgumentException>
		//   29   64:dup             
		//   30   65:ldc1            #127 <String "Invalid promotion code, promotionCode can be between1 and 10 characters long">
		//   31   67:invokespecial   #125 <Method void IllegalArgumentException(String)>
		//   32   70:athrow          
								}
						} else
						{
							throw new IllegalArgumentException("Invalid promotion text, promotionText can only contain alphanumericcharacters and spaces.");
		//   33   71:new             #120 <Class IllegalArgumentException>
		//   34   74:dup             
		//   35   75:ldc1            #129 <String "Invalid promotion text, promotionText can only contain alphanumericcharacters and spaces.">
		//   36   77:invokespecial   #125 <Method void IllegalArgumentException(String)>
		//   37   80:athrow          
						}
					} else
					{
						throw new IllegalArgumentException("Invalid promotion text, promotionText needs to be between1 and 80 characters long");
		//   38   81:new             #120 <Class IllegalArgumentException>
		//   39   84:dup             
		//   40   85:ldc1            #131 <String "Invalid promotion text, promotionText needs to be between1 and 80 characters long">
		//   41   87:invokespecial   #125 <Method void IllegalArgumentException(String)>
		//   42   90:athrow          
					}
				} else
				if(!TextUtils.isEmpty(((CharSequence) (s1))))
					break label0;
		//   43   91:aload_2         
		//   44   92:invokestatic    #116 <Method boolean TextUtils.isEmpty(CharSequence)>
		//   45   95:ifeq            110
				promoCode = s1;
		//   46   98:aload_0         
		//   47   99:aload_2         
		//   48  100:putfield        #32  <Field String promoCode>
				promoText = s;
		//   49  103:aload_0         
		//   50  104:aload_1         
		//   51  105:putfield        #35  <Field String promoText>
				return this;
		//   52  108:aload_0         
		//   53  109:areturn         
			}
			throw new IllegalArgumentException("promotionCode cannot be specified without a valid promotionText");
		//   54  110:new             #120 <Class IllegalArgumentException>
		//   55  113:dup             
		//   56  114:ldc1            #133 <String "promotionCode cannot be specified without a valid promotionText">
		//   57  116:invokespecial   #125 <Method void IllegalArgumentException(String)>
		//   58  119:athrow          
		}

		private String applinkUrl;
		private Destination destination;
		private String previewImageUrl;
		private String promoCode;
		private String promoText;


/*
		static String access$000(Builder builder)
		{
			return builder.applinkUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field String applinkUrl>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.previewImageUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field String previewImageUrl>
		//    2    4:areturn         
		}

*/


/*
		static String access$200(Builder builder)
		{
			return builder.promoCode;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field String promoCode>
		//    2    4:areturn         
		}

*/


/*
		static String access$300(Builder builder)
		{
			return builder.promoText;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field String promoText>
		//    2    4:areturn         
		}

*/


/*
		static Destination access$400(Builder builder)
		{
			return builder.destination;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field AppInviteContent$Builder$Destination destination>
		//    2    4:areturn         
		}

*/
	}

	public static final class Builder.Destination extends Enum
	{

		public static Builder.Destination valueOf(String s)
		{
			return (Builder.Destination)Enum.valueOf(com/facebook/share/model/AppInviteContent$Builder$Destination, s);
		//    0    0:ldc1            #2   <Class AppInviteContent$Builder$Destination>
		//    1    2:aload_0         
		//    2    3:invokestatic    #50  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppInviteContent$Builder$Destination>
		//    4    9:areturn         
		}

		public static Builder.Destination[] values()
		{
			return (Builder.Destination[])((Builder.Destination []) ($VALUES)).clone();
		//    0    0:getstatic       #37  <Field AppInviteContent$Builder$Destination[] $VALUES>
		//    1    3:invokevirtual   #57  <Method Object _5B_Lcom.facebook.share.model.AppInviteContent$Builder$Destination_3B_.clone()>
		//    2    6:checkcast       #53  <Class AppInviteContent$Builder$Destination[]>
		//    3    9:areturn         
		}

		public String toString()
		{
			return name;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field String name>
		//    2    4:areturn         
		}

		private static final Builder.Destination $VALUES[];
		public static final Builder.Destination FACEBOOK;
		public static final Builder.Destination MESSENGER;
		private final String name;

		static 
		{
			FACEBOOK = new Builder.Destination("FACEBOOK", 0, "facebook");
		//    0    0:new             #2   <Class AppInviteContent$Builder$Destination>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "FACEBOOK">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "facebook">
		//    5    9:invokespecial   #28  <Method void AppInviteContent$Builder$Destination(String, int, String)>
		//    6   12:putstatic       #30  <Field AppInviteContent$Builder$Destination FACEBOOK>
			MESSENGER = new Builder.Destination("MESSENGER", 1, "messenger");
		//    7   15:new             #2   <Class AppInviteContent$Builder$Destination>
		//    8   18:dup             
		//    9   19:ldc1            #31  <String "MESSENGER">
		//   10   21:iconst_1        
		//   11   22:ldc1            #33  <String "messenger">
		//   12   24:invokespecial   #28  <Method void AppInviteContent$Builder$Destination(String, int, String)>
		//   13   27:putstatic       #35  <Field AppInviteContent$Builder$Destination MESSENGER>
			$VALUES = (new Builder.Destination[] {
				FACEBOOK, MESSENGER
			});
		//   14   30:iconst_2        
		//   15   31:anewarray       Builder.Destination[]
		//   16   34:dup             
		//   17   35:iconst_0        
		//   18   36:getstatic       #30  <Field AppInviteContent$Builder$Destination FACEBOOK>
		//   19   39:aastore         
		//   20   40:dup             
		//   21   41:iconst_1        
		//   22   42:getstatic       #35  <Field AppInviteContent$Builder$Destination MESSENGER>
		//   23   45:aastore         
		//   24   46:putstatic       #37  <Field AppInviteContent$Builder$Destination[] $VALUES>
		//*  25   49:return          
		}

		private Builder.Destination(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
			name = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #43  <Field String name>
		//    7   11:return          
		}
	}


	AppInviteContent(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		applinkUrl = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #41  <Method String Parcel.readString()>
	//    5    9:putfield        #43  <Field String applinkUrl>
		previewImageUrl = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #41  <Method String Parcel.readString()>
	//    9   17:putfield        #45  <Field String previewImageUrl>
		promoText = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #41  <Method String Parcel.readString()>
	//   13   25:putfield        #47  <Field String promoText>
		promoCode = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #41  <Method String Parcel.readString()>
	//   17   33:putfield        #49  <Field String promoCode>
		parcel = ((Parcel) (parcel.readString()));
	//   18   36:aload_1         
	//   19   37:invokevirtual   #41  <Method String Parcel.readString()>
	//   20   40:astore_1        
		if(((String) (parcel)).length() > 0)
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #55  <Method int String.length()>
	//*  23   45:ifle            57
		{
			destination = Builder.Destination.valueOf(((String) (parcel)));
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokestatic    #59  <Method AppInviteContent$Builder$Destination AppInviteContent$Builder$Destination.valueOf(String)>
	//   27   53:putfield        #61  <Field AppInviteContent$Builder$Destination destination>
			return;
	//   28   56:return          
		} else
		{
			destination = Builder.Destination.FACEBOOK;
	//   29   57:aload_0         
	//   30   58:getstatic       #64  <Field AppInviteContent$Builder$Destination AppInviteContent$Builder$Destination.FACEBOOK>
	//   31   61:putfield        #61  <Field AppInviteContent$Builder$Destination destination>
			return;
	//   32   64:return          
		}
	}

	private AppInviteContent(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		applinkUrl = builder.applinkUrl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #70  <Method String AppInviteContent$Builder.access$000(AppInviteContent$Builder)>
	//    5    9:putfield        #43  <Field String applinkUrl>
		previewImageUrl = builder.previewImageUrl;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #73  <Method String AppInviteContent$Builder.access$100(AppInviteContent$Builder)>
	//    9   17:putfield        #45  <Field String previewImageUrl>
		promoCode = builder.promoCode;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #76  <Method String AppInviteContent$Builder.access$200(AppInviteContent$Builder)>
	//   13   25:putfield        #49  <Field String promoCode>
		promoText = builder.promoText;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #79  <Method String AppInviteContent$Builder.access$300(AppInviteContent$Builder)>
	//   17   33:putfield        #47  <Field String promoText>
		destination = builder.destination;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #83  <Method AppInviteContent$Builder$Destination AppInviteContent$Builder.access$400(AppInviteContent$Builder)>
	//   21   41:putfield        #61  <Field AppInviteContent$Builder$Destination destination>
	//   22   44:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getApplinkUrl()
	{
		return applinkUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String applinkUrl>
	//    2    4:areturn         
	}

	public Builder.Destination getDestination()
	{
		Builder.Destination destination1 = destination;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field AppInviteContent$Builder$Destination destination>
	//    2    4:astore_1        
		if(destination1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return destination1;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return Builder.Destination.FACEBOOK;
	//    7   11:getstatic       #64  <Field AppInviteContent$Builder$Destination AppInviteContent$Builder$Destination.FACEBOOK>
	//    8   14:areturn         
	}

	public String getPreviewImageUrl()
	{
		return previewImageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String previewImageUrl>
	//    2    4:areturn         
	}

	public String getPromotionCode()
	{
		return promoCode;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String promoCode>
	//    2    4:areturn         
	}

	public String getPromotionText()
	{
		return promoText;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String promoText>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(applinkUrl);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field String applinkUrl>
	//    3    5:invokevirtual   #99  <Method void Parcel.writeString(String)>
		parcel.writeString(previewImageUrl);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field String previewImageUrl>
	//    7   13:invokevirtual   #99  <Method void Parcel.writeString(String)>
		parcel.writeString(promoText);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field String promoText>
	//   11   21:invokevirtual   #99  <Method void Parcel.writeString(String)>
		parcel.writeString(promoCode);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field String promoCode>
	//   15   29:invokevirtual   #99  <Method void Parcel.writeString(String)>
		parcel.writeString(destination.toString());
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #61  <Field AppInviteContent$Builder$Destination destination>
	//   19   37:invokevirtual   #102 <Method String AppInviteContent$Builder$Destination.toString()>
	//   20   40:invokevirtual   #99  <Method void Parcel.writeString(String)>
	//   21   43:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public AppInviteContent createFromParcel(Parcel parcel)
		{
			return new AppInviteContent(parcel);
		//    0    0:new             #9   <Class AppInviteContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void AppInviteContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method AppInviteContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public AppInviteContent[] newArray(int i)
		{
			return new AppInviteContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AppInviteContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method AppInviteContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String applinkUrl;
	private final Builder.Destination destination;
	private final String previewImageUrl;
	private final String promoCode;
	private final String promoText;

	static 
	{
	//    0    0:new             #8   <Class AppInviteContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void AppInviteContent$1()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
