// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import android.os.Parcel;
import android.os.Parcelable;

public class Part
	implements Parcelable
{

	public Part()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public Part(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		id = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method String Parcel.readString()>
	//    5    9:putfield        #34  <Field String id>
		name = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #32  <Method String Parcel.readString()>
	//    9   17:putfield        #36  <Field String name>
		buyLink = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #32  <Method String Parcel.readString()>
	//   13   25:putfield        #38  <Field String buyLink>
	//   14   28:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #43  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Part{id='");
	//    4    8:aload_1         
	//    5    9:ldc1            #46  <String "Part{id='">
	//    6   11:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(id);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #34  <Field String id>
	//   11   20:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #53  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", name='");
	//   17   31:aload_1         
	//   18   32:ldc1            #55  <String ", name='">
	//   19   34:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(name);
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #36  <Field String name>
	//   24   43:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append('\'');
	//   26   47:aload_1         
	//   27   48:bipush          39
	//   28   50:invokevirtual   #53  <Method StringBuilder StringBuilder.append(char)>
	//   29   53:pop             
		stringbuilder.append(", buyLink='");
	//   30   54:aload_1         
	//   31   55:ldc1            #57  <String ", buyLink='">
	//   32   57:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
		stringbuilder.append(buyLink);
	//   34   61:aload_1         
	//   35   62:aload_0         
	//   36   63:getfield        #38  <Field String buyLink>
	//   37   66:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
		stringbuilder.append('\'');
	//   39   70:aload_1         
	//   40   71:bipush          39
	//   41   73:invokevirtual   #53  <Method StringBuilder StringBuilder.append(char)>
	//   42   76:pop             
		stringbuilder.append('}');
	//   43   77:aload_1         
	//   44   78:bipush          125
	//   45   80:invokevirtual   #53  <Method StringBuilder StringBuilder.append(char)>
	//   46   83:pop             
		return stringbuilder.toString();
	//   47   84:aload_1         
	//   48   85:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   49   88:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(id);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field String id>
	//    3    5:invokevirtual   #65  <Method void Parcel.writeString(String)>
		parcel.writeString(name);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field String name>
	//    7   13:invokevirtual   #65  <Method void Parcel.writeString(String)>
		parcel.writeString(buyLink);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field String buyLink>
	//   11   21:invokevirtual   #65  <Method void Parcel.writeString(String)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Part createFromParcel(Parcel parcel)
		{
			return new Part(parcel);
		//    0    0:new             #9   <Class Part>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void Part(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method Part createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public Part[] newArray(int i)
		{
			return new Part[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Part[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method Part[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public String buyLink;
	public String id;
	public String name;

	static 
	{
	//    0    0:new             #8   <Class Part$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Part$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
