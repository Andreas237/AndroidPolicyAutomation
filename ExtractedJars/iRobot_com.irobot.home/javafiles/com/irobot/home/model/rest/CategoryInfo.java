// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home.model.rest:
//			Part

public class CategoryInfo
	implements Parcelable
{

	public CategoryInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		parts = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #40  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void ArrayList()>
	//    6   12:putfield        #43  <Field ArrayList parts>
	//    7   15:return          
	}

	private CategoryInfo(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		parts = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #40  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void ArrayList()>
	//    6   12:putfield        #43  <Field ArrayList parts>
		categoryId = parcel.readString();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #50  <Method String Parcel.readString()>
	//   10   20:putfield        #52  <Field String categoryId>
		guideUrl = parcel.readString();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #50  <Method String Parcel.readString()>
	//   14   28:putfield        #54  <Field String guideUrl>
		threshold = parcel.readString();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #50  <Method String Parcel.readString()>
	//   18   36:putfield        #56  <Field String threshold>
		thresholdUnit = parcel.readString();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #50  <Method String Parcel.readString()>
	//   22   44:putfield        #58  <Field String thresholdUnit>
		parcel.readTypedList(((java.util.List) (parts)), Part.CREATOR);
	//   23   47:aload_1         
	//   24   48:aload_0         
	//   25   49:getfield        #43  <Field ArrayList parts>
	//   26   52:getstatic       #61  <Field android.os.Parcelable$Creator Part.CREATOR>
	//   27   55:invokevirtual   #65  <Method void Parcel.readTypedList(java.util.List, android.os.Parcelable$Creator)>
		lastResetDate = parcel.readString();
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:invokevirtual   #50  <Method String Parcel.readString()>
	//   31   63:putfield        #67  <Field String lastResetDate>
		currentUsage = parcel.readFloat();
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:invokevirtual   #71  <Method float Parcel.readFloat()>
	//   35   71:putfield        #73  <Field float currentUsage>
	//   36   74:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public float getCurrentUsagePercent()
	{
		int i = Integer.parseInt(threshold);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String threshold>
	//    2    4:invokestatic    #85  <Method int Integer.parseInt(String)>
	//    3    7:istore_1        
		if(i > 0)
	//*   4    8:iload_1         
	//*   5    9:ifle            23
			return (currentUsage * 100F) / (float)i;
	//    6   12:aload_0         
	//    7   13:getfield        #73  <Field float currentUsage>
	//    8   16:ldc1            #86  <Float 100F>
	//    9   18:fmul            
	//   10   19:iload_1         
	//   11   20:i2f             
	//   12   21:fdiv            
	//   13   22:freturn         
		else
			return 0.0F;
	//   14   23:fconst_0        
	//   15   24:freturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #89  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("CategoryInfo{categoryId='");
	//    4    8:aload_1         
	//    5    9:ldc1            #92  <String "CategoryInfo{categoryId='">
	//    6   11:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(categoryId);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #52  <Field String categoryId>
	//   11   20:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #99  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", guideUrl='");
	//   17   31:aload_1         
	//   18   32:ldc1            #101 <String ", guideUrl='">
	//   19   34:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(guideUrl);
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #54  <Field String guideUrl>
	//   24   43:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append('\'');
	//   26   47:aload_1         
	//   27   48:bipush          39
	//   28   50:invokevirtual   #99  <Method StringBuilder StringBuilder.append(char)>
	//   29   53:pop             
		stringbuilder.append(", threshold='");
	//   30   54:aload_1         
	//   31   55:ldc1            #103 <String ", threshold='">
	//   32   57:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
		stringbuilder.append(threshold);
	//   34   61:aload_1         
	//   35   62:aload_0         
	//   36   63:getfield        #56  <Field String threshold>
	//   37   66:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
		stringbuilder.append('\'');
	//   39   70:aload_1         
	//   40   71:bipush          39
	//   41   73:invokevirtual   #99  <Method StringBuilder StringBuilder.append(char)>
	//   42   76:pop             
		stringbuilder.append(", thresholdUnit='");
	//   43   77:aload_1         
	//   44   78:ldc1            #105 <String ", thresholdUnit='">
	//   45   80:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   46   83:pop             
		stringbuilder.append(thresholdUnit);
	//   47   84:aload_1         
	//   48   85:aload_0         
	//   49   86:getfield        #58  <Field String thresholdUnit>
	//   50   89:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   51   92:pop             
		stringbuilder.append('\'');
	//   52   93:aload_1         
	//   53   94:bipush          39
	//   54   96:invokevirtual   #99  <Method StringBuilder StringBuilder.append(char)>
	//   55   99:pop             
		stringbuilder.append(", parts=");
	//   56  100:aload_1         
	//   57  101:ldc1            #107 <String ", parts=">
	//   58  103:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   59  106:pop             
		stringbuilder.append(((Object) (parts)));
	//   60  107:aload_1         
	//   61  108:aload_0         
	//   62  109:getfield        #43  <Field ArrayList parts>
	//   63  112:invokevirtual   #110 <Method StringBuilder StringBuilder.append(Object)>
	//   64  115:pop             
		stringbuilder.append('}');
	//   65  116:aload_1         
	//   66  117:bipush          125
	//   67  119:invokevirtual   #99  <Method StringBuilder StringBuilder.append(char)>
	//   68  122:pop             
		return stringbuilder.toString();
	//   69  123:aload_1         
	//   70  124:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   71  127:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(categoryId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field String categoryId>
	//    3    5:invokevirtual   #118 <Method void Parcel.writeString(String)>
		parcel.writeString(guideUrl);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #54  <Field String guideUrl>
	//    7   13:invokevirtual   #118 <Method void Parcel.writeString(String)>
		parcel.writeString(threshold);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #56  <Field String threshold>
	//   11   21:invokevirtual   #118 <Method void Parcel.writeString(String)>
		parcel.writeString(thresholdUnit);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #58  <Field String thresholdUnit>
	//   15   29:invokevirtual   #118 <Method void Parcel.writeString(String)>
		parcel.writeTypedList(((java.util.List) (parts)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #43  <Field ArrayList parts>
	//   19   37:invokevirtual   #122 <Method void Parcel.writeTypedList(java.util.List)>
		parcel.writeString(lastResetDate);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #67  <Field String lastResetDate>
	//   23   45:invokevirtual   #118 <Method void Parcel.writeString(String)>
		parcel.writeFloat(currentUsage);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #73  <Field float currentUsage>
	//   27   53:invokevirtual   #126 <Method void Parcel.writeFloat(float)>
	//   28   56:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public CategoryInfo createFromParcel(Parcel parcel)
		{
			return new CategoryInfo(parcel);
		//    0    0:new             #9   <Class CategoryInfo>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #19  <Method void CategoryInfo(Parcel, CategoryInfo$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method CategoryInfo createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public CategoryInfo[] newArray(int i)
		{
			return new CategoryInfo[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CategoryInfo[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method CategoryInfo[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final String DISTANCE_THRESHOLD_UNIT = "Distance";
	public static final String RUNTIME_THRESHOLD_UNIT = "Runtime";
	public String categoryId;
	public float currentUsage;
	public String guideUrl;
	public String lastResetDate;
	public ArrayList parts;
	public String threshold;
	public String thresholdUnit;

	static 
	{
	//    0    0:new             #8   <Class CategoryInfo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void CategoryInfo$1()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
