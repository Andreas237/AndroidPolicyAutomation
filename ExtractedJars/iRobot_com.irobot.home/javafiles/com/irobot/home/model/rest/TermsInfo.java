// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import android.os.Parcel;
import android.os.Parcelable;

public class TermsInfo
	implements Parcelable
{

	public TermsInfo(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		termsUrl = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <String "">
	//    4    7:putfield        #31  <Field String termsUrl>
		privacyUrl = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #29  <String "">
	//    7   13:putfield        #33  <Field String privacyUrl>
		tosUrl = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #29  <String "">
	//   10   19:putfield        #35  <Field String tosUrl>
		eulaUrl = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #29  <String "">
	//   13   25:putfield        #37  <Field String eulaUrl>
		version = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #29  <String "">
	//   16   31:putfield        #39  <Field String version>
		termsUrl = parcel.readString();
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #45  <Method String Parcel.readString()>
	//   20   39:putfield        #31  <Field String termsUrl>
		privacyUrl = parcel.readString();
	//   21   42:aload_0         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #45  <Method String Parcel.readString()>
	//   24   47:putfield        #33  <Field String privacyUrl>
		tosUrl = parcel.readString();
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:invokevirtual   #45  <Method String Parcel.readString()>
	//   28   55:putfield        #35  <Field String tosUrl>
		eulaUrl = parcel.readString();
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:invokevirtual   #45  <Method String Parcel.readString()>
	//   32   63:putfield        #37  <Field String eulaUrl>
		version = parcel.readString();
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:invokevirtual   #45  <Method String Parcel.readString()>
	//   36   71:putfield        #39  <Field String version>
	//   37   74:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getTermsUrl()
	{
		return termsUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String termsUrl>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(termsUrl);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field String termsUrl>
	//    3    5:invokevirtual   #54  <Method void Parcel.writeString(String)>
		parcel.writeString(privacyUrl);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field String privacyUrl>
	//    7   13:invokevirtual   #54  <Method void Parcel.writeString(String)>
		parcel.writeString(tosUrl);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #35  <Field String tosUrl>
	//   11   21:invokevirtual   #54  <Method void Parcel.writeString(String)>
		parcel.writeString(eulaUrl);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #37  <Field String eulaUrl>
	//   15   29:invokevirtual   #54  <Method void Parcel.writeString(String)>
		parcel.writeString(version);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #39  <Field String version>
	//   19   37:invokevirtual   #54  <Method void Parcel.writeString(String)>
	//   20   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public TermsInfo createFromParcel(Parcel parcel)
		{
			return new TermsInfo(parcel);
		//    0    0:new             #9   <Class TermsInfo>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void TermsInfo(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method TermsInfo createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public TermsInfo[] newArray(int i)
		{
			return new TermsInfo[i];
		//    0    0:iload_1         
		//    1    1:anewarray       TermsInfo[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method TermsInfo[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public String eulaUrl;
	public String privacyUrl;
	public String termsUrl;
	public String tosUrl;
	public String version;

	static 
	{
	//    0    0:new             #8   <Class TermsInfo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void TermsInfo$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
