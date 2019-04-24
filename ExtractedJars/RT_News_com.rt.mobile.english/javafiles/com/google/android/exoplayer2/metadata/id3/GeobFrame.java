// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			Id3Frame

public final class GeobFrame extends Id3Frame
{

	GeobFrame(Parcel parcel)
	{
		super("GEOB");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "GEOB">
	//    2    3:invokespecial   #30  <Method void Id3Frame(String)>
		mimeType = parcel.readString();
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #36  <Method String Parcel.readString()>
	//    6   11:putfield        #38  <Field String mimeType>
		filename = parcel.readString();
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #36  <Method String Parcel.readString()>
	//   10   19:putfield        #40  <Field String filename>
		description = parcel.readString();
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #36  <Method String Parcel.readString()>
	//   14   27:putfield        #42  <Field String description>
		data = parcel.createByteArray();
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #46  <Method byte[] Parcel.createByteArray()>
	//   18   35:putfield        #48  <Field byte[] data>
	//   19   38:return          
	}

	public GeobFrame(String s, String s1, String s2, byte abyte0[])
	{
		super("GEOB");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "GEOB">
	//    2    3:invokespecial   #30  <Method void Id3Frame(String)>
		mimeType = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #38  <Field String mimeType>
		filename = s1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #40  <Field String filename>
		description = s2;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #42  <Field String description>
		data = abyte0;
	//   12   21:aload_0         
	//   13   22:aload           4
	//   14   24:putfield        #48  <Field byte[] data>
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
	//*   6    8:ifnull          89
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #58  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #58  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((GeobFrame)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class GeobFrame>
	//   16   28:astore_1        
			return Util.areEqual(((Object) (mimeType)), ((Object) (((GeobFrame) (obj)).mimeType))) && Util.areEqual(((Object) (filename)), ((Object) (((GeobFrame) (obj)).filename))) && Util.areEqual(((Object) (description)), ((Object) (((GeobFrame) (obj)).description))) && Arrays.equals(data, ((GeobFrame) (obj)).data);
	//   17   29:aload_0         
	//   18   30:getfield        #38  <Field String mimeType>
	//   19   33:aload_1         
	//   20   34:getfield        #38  <Field String mimeType>
	//   21   37:invokestatic    #64  <Method boolean Util.areEqual(Object, Object)>
	//   22   40:ifeq            87
	//   23   43:aload_0         
	//   24   44:getfield        #40  <Field String filename>
	//   25   47:aload_1         
	//   26   48:getfield        #40  <Field String filename>
	//   27   51:invokestatic    #64  <Method boolean Util.areEqual(Object, Object)>
	//   28   54:ifeq            87
	//   29   57:aload_0         
	//   30   58:getfield        #42  <Field String description>
	//   31   61:aload_1         
	//   32   62:getfield        #42  <Field String description>
	//   33   65:invokestatic    #64  <Method boolean Util.areEqual(Object, Object)>
	//   34   68:ifeq            87
	//   35   71:aload_0         
	//   36   72:getfield        #48  <Field byte[] data>
	//   37   75:aload_1         
	//   38   76:getfield        #48  <Field byte[] data>
	//   39   79:invokestatic    #69  <Method boolean Arrays.equals(byte[], byte[])>
	//   40   82:ifeq            87
	//   41   85:iconst_1        
	//   42   86:ireturn         
	//   43   87:iconst_0        
	//   44   88:ireturn         
		} else
		{
			return false;
	//   45   89:iconst_0        
	//   46   90:ireturn         
		}
	}

	public int hashCode()
	{
		String s = mimeType;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String mimeType>
	//    2    4:astore          4
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		if(s != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          24
			i = mimeType.hashCode();
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field String mimeType>
	//    9   17:invokevirtual   #76  <Method int String.hashCode()>
	//   10   20:istore_1        
		else
	//*  11   21:goto            26
			i = 0;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		int j;
		if(filename != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #40  <Field String filename>
	//*  16   30:ifnull          44
			j = filename.hashCode();
	//   17   33:aload_0         
	//   18   34:getfield        #40  <Field String filename>
	//   19   37:invokevirtual   #76  <Method int String.hashCode()>
	//   20   40:istore_2        
		else
	//*  21   41:goto            46
			j = 0;
	//   22   44:iconst_0        
	//   23   45:istore_2        
		if(description != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #42  <Field String description>
	//*  26   50:ifnull          61
			k = description.hashCode();
	//   27   53:aload_0         
	//   28   54:getfield        #42  <Field String description>
	//   29   57:invokevirtual   #76  <Method int String.hashCode()>
	//   30   60:istore_3        
		return 31 * (((527 + i) * 31 + j) * 31 + k) + Arrays.hashCode(data);
	//   31   61:bipush          31
	//   32   63:sipush          527
	//   33   66:iload_1         
	//   34   67:iadd            
	//   35   68:bipush          31
	//   36   70:imul            
	//   37   71:iload_2         
	//   38   72:iadd            
	//   39   73:bipush          31
	//   40   75:imul            
	//   41   76:iload_3         
	//   42   77:iadd            
	//   43   78:imul            
	//   44   79:aload_0         
	//   45   80:getfield        #48  <Field byte[] data>
	//   46   83:invokestatic    #79  <Method int Arrays.hashCode(byte[])>
	//   47   86:iadd            
	//   48   87:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(id);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #86  <Field String id>
	//    7   13:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(": mimeType=");
	//    9   17:aload_1         
	//   10   18:ldc1            #92  <String ": mimeType=">
	//   11   20:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(mimeType);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #38  <Field String mimeType>
	//   16   29:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(", filename=");
	//   18   33:aload_1         
	//   19   34:ldc1            #94  <String ", filename=">
	//   20   36:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(filename);
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #40  <Field String filename>
	//   25   45:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append(", description=");
	//   27   49:aload_1         
	//   28   50:ldc1            #96  <String ", description=">
	//   29   52:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(description);
	//   31   56:aload_1         
	//   32   57:aload_0         
	//   33   58:getfield        #42  <Field String description>
	//   34   61:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		return stringbuilder.toString();
	//   36   65:aload_1         
	//   37   66:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   38   69:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mimeType);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field String mimeType>
	//    3    5:invokevirtual   #103 <Method void Parcel.writeString(String)>
		parcel.writeString(filename);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field String filename>
	//    7   13:invokevirtual   #103 <Method void Parcel.writeString(String)>
		parcel.writeString(description);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field String description>
	//   11   21:invokevirtual   #103 <Method void Parcel.writeString(String)>
		parcel.writeByteArray(data);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #48  <Field byte[] data>
	//   15   29:invokevirtual   #107 <Method void Parcel.writeByteArray(byte[])>
	//   16   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public GeobFrame createFromParcel(Parcel parcel)
		{
			return new GeobFrame(parcel);
		//    0    0:new             #9   <Class GeobFrame>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void GeobFrame(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method GeobFrame createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public GeobFrame[] newArray(int i)
		{
			return new GeobFrame[i];
		//    0    0:iload_1         
		//    1    1:anewarray       GeobFrame[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method GeobFrame[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final String ID = "GEOB";
	public final byte data[];
	public final String description;
	public final String filename;
	public final String mimeType;

	static 
	{
	//    0    0:new             #6   <Class GeobFrame$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void GeobFrame$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
