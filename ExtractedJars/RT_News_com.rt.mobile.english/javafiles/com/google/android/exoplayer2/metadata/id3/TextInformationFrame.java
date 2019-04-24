// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			Id3Frame

public final class TextInformationFrame extends Id3Frame
{

	TextInformationFrame(Parcel parcel)
	{
		super(parcel.readString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method String Parcel.readString()>
	//    3    5:invokespecial   #30  <Method void Id3Frame(String)>
		description = parcel.readString();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #27  <Method String Parcel.readString()>
	//    7   13:putfield        #32  <Field String description>
		value = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #27  <Method String Parcel.readString()>
	//   11   21:putfield        #34  <Field String value>
	//   12   24:return          
	}

	public TextInformationFrame(String s, String s1, String s2)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void Id3Frame(String)>
		description = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field String description>
		value = s2;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #34  <Field String value>
	//    9   15:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          75
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #44  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #44  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((TextInformationFrame)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TextInformationFrame>
	//   16   28:astore_1        
			return id.equals(((Object) (((TextInformationFrame) (obj)).id))) && Util.areEqual(((Object) (description)), ((Object) (((TextInformationFrame) (obj)).description))) && Util.areEqual(((Object) (value)), ((Object) (((TextInformationFrame) (obj)).value)));
	//   17   29:aload_0         
	//   18   30:getfield        #47  <Field String id>
	//   19   33:aload_1         
	//   20   34:getfield        #47  <Field String id>
	//   21   37:invokevirtual   #51  <Method boolean String.equals(Object)>
	//   22   40:ifeq            73
	//   23   43:aload_0         
	//   24   44:getfield        #32  <Field String description>
	//   25   47:aload_1         
	//   26   48:getfield        #32  <Field String description>
	//   27   51:invokestatic    #57  <Method boolean Util.areEqual(Object, Object)>
	//   28   54:ifeq            73
	//   29   57:aload_0         
	//   30   58:getfield        #34  <Field String value>
	//   31   61:aload_1         
	//   32   62:getfield        #34  <Field String value>
	//   33   65:invokestatic    #57  <Method boolean Util.areEqual(Object, Object)>
	//   34   68:ifeq            73
	//   35   71:iconst_1        
	//   36   72:ireturn         
	//   37   73:iconst_0        
	//   38   74:ireturn         
		} else
		{
			return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
		}
	}

	public int hashCode()
	{
		int k = id.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String id>
	//    2    4:invokevirtual   #62  <Method int String.hashCode()>
	//    3    7:istore_3        
		String s = description;
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field String description>
	//    6   12:astore          4
		int j = 0;
	//    7   14:iconst_0        
	//    8   15:istore_2        
		int i;
		if(s != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          32
			i = description.hashCode();
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field String description>
	//   13   25:invokevirtual   #62  <Method int String.hashCode()>
	//   14   28:istore_1        
		else
	//*  15   29:goto            34
			i = 0;
	//   16   32:iconst_0        
	//   17   33:istore_1        
		if(value != null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #34  <Field String value>
	//*  20   38:ifnull          49
			j = value.hashCode();
	//   21   41:aload_0         
	//   22   42:getfield        #34  <Field String value>
	//   23   45:invokevirtual   #62  <Method int String.hashCode()>
	//   24   48:istore_2        
		return 31 * ((527 + k) * 31 + i) + j;
	//   25   49:bipush          31
	//   26   51:sipush          527
	//   27   54:iload_3         
	//   28   55:iadd            
	//   29   56:bipush          31
	//   30   58:imul            
	//   31   59:iload_1         
	//   32   60:iadd            
	//   33   61:imul            
	//   34   62:iload_2         
	//   35   63:iadd            
	//   36   64:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #65  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(id);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #47  <Field String id>
	//    7   13:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(": value=");
	//    9   17:aload_1         
	//   10   18:ldc1            #72  <String ": value=">
	//   11   20:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(value);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #34  <Field String value>
	//   16   29:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(id);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #47  <Field String id>
	//    3    5:invokevirtual   #79  <Method void Parcel.writeString(String)>
		parcel.writeString(description);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field String description>
	//    7   13:invokevirtual   #79  <Method void Parcel.writeString(String)>
		parcel.writeString(value);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field String value>
	//   11   21:invokevirtual   #79  <Method void Parcel.writeString(String)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public TextInformationFrame createFromParcel(Parcel parcel)
		{
			return new TextInformationFrame(parcel);
		//    0    0:new             #9   <Class TextInformationFrame>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void TextInformationFrame(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method TextInformationFrame createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public TextInformationFrame[] newArray(int i)
		{
			return new TextInformationFrame[i];
		//    0    0:iload_1         
		//    1    1:anewarray       TextInformationFrame[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method TextInformationFrame[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final String description;
	public final String value;

	static 
	{
	//    0    0:new             #6   <Class TextInformationFrame$1>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void TextInformationFrame$1()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
