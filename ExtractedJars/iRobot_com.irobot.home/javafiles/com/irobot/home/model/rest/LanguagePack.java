// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.home.util.j;

public class LanguagePack
	implements Parcelable
{

	public LanguagePack(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		lang = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #27  <String "">
	//    4    7:putfield        #29  <Field String lang>
		downloadUrl = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #27  <String "">
	//    7   13:putfield        #31  <Field String downloadUrl>
		version = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #27  <String "">
	//   10   19:putfield        #33  <Field String version>
		lang = parcel.readString();
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #39  <Method String Parcel.readString()>
	//   14   27:putfield        #29  <Field String lang>
		downloadUrl = parcel.readString();
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #39  <Method String Parcel.readString()>
	//   18   35:putfield        #31  <Field String downloadUrl>
		version = parcel.readString();
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #39  <Method String Parcel.readString()>
	//   22   43:putfield        #33  <Field String version>
	//   23   46:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getDisplayName()
	{
		return j.c(lang, true);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String lang>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #48  <Method String j.c(String, boolean)>
	//    4    8:areturn         
	}

	public String getLanguage()
	{
		return j.b(lang, true);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String lang>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #52  <Method String j.b(String, boolean)>
	//    4    8:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(lang);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field String lang>
	//    3    5:invokevirtual   #58  <Method void Parcel.writeString(String)>
		parcel.writeString(downloadUrl);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field String downloadUrl>
	//    7   13:invokevirtual   #58  <Method void Parcel.writeString(String)>
		parcel.writeString(version);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field String version>
	//   11   21:invokevirtual   #58  <Method void Parcel.writeString(String)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public LanguagePack createFromParcel(Parcel parcel)
		{
			return new LanguagePack(parcel);
		//    0    0:new             #9   <Class LanguagePack>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void LanguagePack(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method LanguagePack createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public LanguagePack[] newArray(int i)
		{
			return new LanguagePack[i];
		//    0    0:iload_1         
		//    1    1:anewarray       LanguagePack[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method LanguagePack[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public String downloadUrl;
	public String lang;
	public String version;

	static 
	{
	//    0    0:new             #8   <Class LanguagePack$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void LanguagePack$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
