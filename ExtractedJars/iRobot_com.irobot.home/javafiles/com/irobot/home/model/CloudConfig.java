// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.AssetCloudConfigEvent;
import com.irobot.home.util.j;
import org.apache.commons.a.d;
import org.json.JSONObject;

public class CloudConfig
	implements Parcelable
{

	public CloudConfig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #24  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #25  <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append("https://");
	//    6   12:aload_1         
	//    7   13:ldc1            #27  <String "https://">
	//    8   15:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(j.p());
	//   10   19:aload_1         
	//   11   20:invokestatic    #37  <Method String j.p()>
	//   12   23:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		a = stringbuilder.toString();
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   17   32:putfield        #42  <Field String a>
	//   18   35:return          
	}

	public CloudConfig(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #24  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #25  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("https://");
	//    6   12:aload_2         
	//    7   13:ldc1            #27  <String "https://">
	//    8   15:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(j.p());
	//   10   19:aload_2         
	//   11   20:invokestatic    #37  <Method String j.p()>
	//   12   23:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		a = stringbuilder.toString();
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   17   32:putfield        #42  <Field String a>
		a = parcel.readString();
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:invokevirtual   #48  <Method String Parcel.readString()>
	//   21   40:putfield        #42  <Field String a>
	//   22   43:return          
	}

	public CloudConfig(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #24  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #25  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("https://");
	//    6   12:aload_2         
	//    7   13:ldc1            #27  <String "https://">
	//    8   15:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(j.p());
	//   10   19:aload_2         
	//   11   20:invokestatic    #37  <Method String j.p()>
	//   12   23:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		a = stringbuilder.toString();
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   17   32:putfield        #42  <Field String a>
		a = b(jsonobject.getString("cloudconfig"));
	//   18   35:aload_0         
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:ldc1            #51  <String "cloudconfig">
	//   22   40:invokevirtual   #57  <Method String JSONObject.getString(String)>
	//   23   43:invokespecial   #60  <Method String b(String)>
	//   24   46:putfield        #42  <Field String a>
	//   25   49:return          
	}

	private String b(String s)
	{
		String s2;
		if(s.contains("axeda.com") && s.contains("-connect"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #62  <String "axeda.com">
	//*   2    3:invokevirtual   #68  <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            31
	//*   4    9:aload_1         
	//*   5   10:ldc1            #70  <String "-connect">
	//*   6   12:invokevirtual   #68  <Method boolean String.contains(CharSequence)>
	//*   7   15:ifeq            31
			s2 = d.a(a, "-connect");
	//    8   18:aload_0         
	//    9   19:getfield        #42  <Field String a>
	//   10   22:ldc1            #70  <String "-connect">
	//   11   24:invokestatic    #75  <Method String d.a(String, String)>
	//   12   27:astore_3        
		else
	//*  13   28:goto            33
			s2 = s;
	//   14   31:aload_1         
	//   15   32:astore_3        
		String s1 = s2;
	//   16   33:aload_3         
	//   17   34:astore_2        
		if(s2.contains("/ammp/"))
	//*  18   35:aload_3         
	//*  19   36:ldc1            #77  <String "/ammp/">
	//*  20   38:invokevirtual   #68  <Method boolean String.contains(CharSequence)>
	//*  21   41:ifeq            54
			s1 = d.a(a, "/ammp/");
	//   22   44:aload_0         
	//   23   45:getfield        #42  <Field String a>
	//   24   48:ldc1            #77  <String "/ammp/">
	//   25   50:invokestatic    #75  <Method String d.a(String, String)>
	//   26   53:astore_2        
		s2 = s1;
	//   27   54:aload_2         
	//   28   55:astore_3        
		if(!s1.contains("https://"))
	//*  29   56:aload_2         
	//*  30   57:ldc1            #27  <String "https://">
	//*  31   59:invokevirtual   #68  <Method boolean String.contains(CharSequence)>
	//*  32   62:ifne            72
			s2 = j.a(s, "https://");
	//   33   65:aload_1         
	//   34   66:ldc1            #27  <String "https://">
	//   35   68:invokestatic    #78  <Method String j.a(String, String)>
	//   36   71:astore_3        
		return s2;
	//   37   72:aload_3         
	//   38   73:areturn         
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String a>
	//    2    4:areturn         
	}

	public void a(AssetCloudConfigEvent assetcloudconfigevent)
	{
		a = b(assetcloudconfigevent.cloudConfigHost());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #84  <Method String AssetCloudConfigEvent.cloudConfigHost()>
	//    4    6:invokespecial   #60  <Method String b(String)>
	//    5    9:putfield        #42  <Field String a>
	//    6   12:return          
	}

	public void a(CloudConfig cloudconfig)
	{
		a = cloudconfig.a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #42  <Field String a>
	//    3    5:putfield        #42  <Field String a>
	//    4    8:return          
	}

	public void a(String s)
	{
		a = b(s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #60  <Method String b(String)>
	//    4    6:putfield        #42  <Field String a>
	//    5    9:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field String a>
	//    3    5:invokevirtual   #93  <Method void Parcel.writeString(String)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public CloudConfig a(Parcel parcel)
		{
			return new CloudConfig(parcel);
		//    0    0:new             #9   <Class CloudConfig>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void CloudConfig(Parcel)>
		//    4    8:areturn         
		}

		public CloudConfig[] a(int i)
		{
			return new CloudConfig[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CloudConfig[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method CloudConfig a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method CloudConfig[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;

	static 
	{
	//    0    0:new             #8   <Class CloudConfig$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void CloudConfig$1()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
