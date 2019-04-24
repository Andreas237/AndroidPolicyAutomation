// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			Id3Frame

public final class ApicFrame extends Id3Frame
{

	ApicFrame(Parcel parcel)
	{
		super("APIC");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "APIC">
	//    2    3:invokespecial   #31  <Method void Id3Frame(String)>
		mimeType = parcel.readString();
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #37  <Method String Parcel.readString()>
	//    6   11:putfield        #39  <Field String mimeType>
		description = parcel.readString();
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #37  <Method String Parcel.readString()>
	//   10   19:putfield        #41  <Field String description>
		pictureType = parcel.readInt();
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #45  <Method int Parcel.readInt()>
	//   14   27:putfield        #47  <Field int pictureType>
		pictureData = parcel.createByteArray();
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #51  <Method byte[] Parcel.createByteArray()>
	//   18   35:putfield        #53  <Field byte[] pictureData>
	//   19   38:return          
	}

	public ApicFrame(String s, String s1, int i, byte abyte0[])
	{
		super("APIC");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "APIC">
	//    2    3:invokespecial   #31  <Method void Id3Frame(String)>
		mimeType = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #39  <Field String mimeType>
		description = s1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #41  <Field String description>
		pictureType = i;
	//    9   16:aload_0         
	//   10   17:iload_3         
	//   11   18:putfield        #47  <Field int pictureType>
		pictureData = abyte0;
	//   12   21:aload_0         
	//   13   22:aload           4
	//   14   24:putfield        #53  <Field byte[] pictureData>
	//   15   27:return          
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
	//*   6    8:ifnull          86
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #63  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #63  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((ApicFrame)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ApicFrame>
	//   16   28:astore_1        
			return pictureType == ((ApicFrame) (obj)).pictureType && Util.areEqual(((Object) (mimeType)), ((Object) (((ApicFrame) (obj)).mimeType))) && Util.areEqual(((Object) (description)), ((Object) (((ApicFrame) (obj)).description))) && Arrays.equals(pictureData, ((ApicFrame) (obj)).pictureData);
	//   17   29:aload_0         
	//   18   30:getfield        #47  <Field int pictureType>
	//   19   33:aload_1         
	//   20   34:getfield        #47  <Field int pictureType>
	//   21   37:icmpne          84
	//   22   40:aload_0         
	//   23   41:getfield        #39  <Field String mimeType>
	//   24   44:aload_1         
	//   25   45:getfield        #39  <Field String mimeType>
	//   26   48:invokestatic    #69  <Method boolean Util.areEqual(Object, Object)>
	//   27   51:ifeq            84
	//   28   54:aload_0         
	//   29   55:getfield        #41  <Field String description>
	//   30   58:aload_1         
	//   31   59:getfield        #41  <Field String description>
	//   32   62:invokestatic    #69  <Method boolean Util.areEqual(Object, Object)>
	//   33   65:ifeq            84
	//   34   68:aload_0         
	//   35   69:getfield        #53  <Field byte[] pictureData>
	//   36   72:aload_1         
	//   37   73:getfield        #53  <Field byte[] pictureData>
	//   38   76:invokestatic    #74  <Method boolean Arrays.equals(byte[], byte[])>
	//   39   79:ifeq            84
	//   40   82:iconst_1        
	//   41   83:ireturn         
	//   42   84:iconst_0        
	//   43   85:ireturn         
		} else
		{
			return false;
	//   44   86:iconst_0        
	//   45   87:ireturn         
		}
	}

	public int hashCode()
	{
		int k = pictureType;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int pictureType>
	//    2    4:istore_3        
		String s = mimeType;
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field String mimeType>
	//    5    9:astore          4
		int j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		int i;
		if(s != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          29
			i = mimeType.hashCode();
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field String mimeType>
	//   12   22:invokevirtual   #80  <Method int String.hashCode()>
	//   13   25:istore_1        
		else
	//*  14   26:goto            31
			i = 0;
	//   15   29:iconst_0        
	//   16   30:istore_1        
		if(description != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #41  <Field String description>
	//*  19   35:ifnull          46
			j = description.hashCode();
	//   20   38:aload_0         
	//   21   39:getfield        #41  <Field String description>
	//   22   42:invokevirtual   #80  <Method int String.hashCode()>
	//   23   45:istore_2        
		return 31 * (((527 + k) * 31 + i) * 31 + j) + Arrays.hashCode(pictureData);
	//   24   46:bipush          31
	//   25   48:sipush          527
	//   26   51:iload_3         
	//   27   52:iadd            
	//   28   53:bipush          31
	//   29   55:imul            
	//   30   56:iload_1         
	//   31   57:iadd            
	//   32   58:bipush          31
	//   33   60:imul            
	//   34   61:iload_2         
	//   35   62:iadd            
	//   36   63:imul            
	//   37   64:aload_0         
	//   38   65:getfield        #53  <Field byte[] pictureData>
	//   39   68:invokestatic    #83  <Method int Arrays.hashCode(byte[])>
	//   40   71:iadd            
	//   41   72:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(id);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #90  <Field String id>
	//    7   13:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(": mimeType=");
	//    9   17:aload_1         
	//   10   18:ldc1            #96  <String ": mimeType=">
	//   11   20:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(mimeType);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #39  <Field String mimeType>
	//   16   29:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(", description=");
	//   18   33:aload_1         
	//   19   34:ldc1            #98  <String ", description=">
	//   20   36:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(description);
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #41  <Field String description>
	//   25   45:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mimeType);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field String mimeType>
	//    3    5:invokevirtual   #105 <Method void Parcel.writeString(String)>
		parcel.writeString(description);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field String description>
	//    7   13:invokevirtual   #105 <Method void Parcel.writeString(String)>
		parcel.writeInt(pictureType);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field int pictureType>
	//   11   21:invokevirtual   #109 <Method void Parcel.writeInt(int)>
		parcel.writeByteArray(pictureData);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #53  <Field byte[] pictureData>
	//   15   29:invokevirtual   #113 <Method void Parcel.writeByteArray(byte[])>
	//   16   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ApicFrame createFromParcel(Parcel parcel)
		{
			return new ApicFrame(parcel);
		//    0    0:new             #9   <Class ApicFrame>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ApicFrame(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ApicFrame createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ApicFrame[] newArray(int i)
		{
			return new ApicFrame[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ApicFrame[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ApicFrame[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final String ID = "APIC";
	public final String description;
	public final String mimeType;
	public final byte pictureData[];
	public final int pictureType;

	static 
	{
	//    0    0:new             #6   <Class ApicFrame$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ApicFrame$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
