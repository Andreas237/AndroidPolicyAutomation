// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			Id3Frame

public final class PrivFrame extends Id3Frame
{

	PrivFrame(Parcel parcel)
	{
		super("PRIV");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "PRIV">
	//    2    3:invokespecial   #28  <Method void Id3Frame(String)>
		owner = parcel.readString();
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #34  <Method String Parcel.readString()>
	//    6   11:putfield        #36  <Field String owner>
		privateData = parcel.createByteArray();
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #40  <Method byte[] Parcel.createByteArray()>
	//   10   19:putfield        #42  <Field byte[] privateData>
	//   11   22:return          
	}

	public PrivFrame(String s, byte abyte0[])
	{
		super("PRIV");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "PRIV">
	//    2    3:invokespecial   #28  <Method void Id3Frame(String)>
		owner = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #36  <Field String owner>
		privateData = abyte0;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #42  <Field byte[] privateData>
	//    9   16:return          
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
	//*   6    8:ifnull          61
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #52  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #52  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((PrivFrame)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class PrivFrame>
	//   16   28:astore_1        
			return Util.areEqual(((Object) (owner)), ((Object) (((PrivFrame) (obj)).owner))) && Arrays.equals(privateData, ((PrivFrame) (obj)).privateData);
	//   17   29:aload_0         
	//   18   30:getfield        #36  <Field String owner>
	//   19   33:aload_1         
	//   20   34:getfield        #36  <Field String owner>
	//   21   37:invokestatic    #58  <Method boolean Util.areEqual(Object, Object)>
	//   22   40:ifeq            59
	//   23   43:aload_0         
	//   24   44:getfield        #42  <Field byte[] privateData>
	//   25   47:aload_1         
	//   26   48:getfield        #42  <Field byte[] privateData>
	//   27   51:invokestatic    #63  <Method boolean Arrays.equals(byte[], byte[])>
	//   28   54:ifeq            59
	//   29   57:iconst_1        
	//   30   58:ireturn         
	//   31   59:iconst_0        
	//   32   60:ireturn         
		} else
		{
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		}
	}

	public int hashCode()
	{
		int i;
		if(owner != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field String owner>
	//*   2    4:ifnull          18
			i = owner.hashCode();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field String owner>
	//    5   11:invokevirtual   #70  <Method int String.hashCode()>
	//    6   14:istore_1        
		else
	//*   7   15:goto            20
			i = 0;
	//    8   18:iconst_0        
	//    9   19:istore_1        
		return 31 * (527 + i) + Arrays.hashCode(privateData);
	//   10   20:bipush          31
	//   11   22:sipush          527
	//   12   25:iload_1         
	//   13   26:iadd            
	//   14   27:imul            
	//   15   28:aload_0         
	//   16   29:getfield        #42  <Field byte[] privateData>
	//   17   32:invokestatic    #73  <Method int Arrays.hashCode(byte[])>
	//   18   35:iadd            
	//   19   36:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(id);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #80  <Field String id>
	//    7   13:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(": owner=");
	//    9   17:aload_1         
	//   10   18:ldc1            #86  <String ": owner=">
	//   11   20:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(owner);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #36  <Field String owner>
	//   16   29:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(owner);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field String owner>
	//    3    5:invokevirtual   #93  <Method void Parcel.writeString(String)>
		parcel.writeByteArray(privateData);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field byte[] privateData>
	//    7   13:invokevirtual   #97  <Method void Parcel.writeByteArray(byte[])>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public PrivFrame createFromParcel(Parcel parcel)
		{
			return new PrivFrame(parcel);
		//    0    0:new             #9   <Class PrivFrame>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void PrivFrame(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method PrivFrame createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public PrivFrame[] newArray(int i)
		{
			return new PrivFrame[i];
		//    0    0:iload_1         
		//    1    1:anewarray       PrivFrame[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method PrivFrame[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final String ID = "PRIV";
	public final String owner;
	public final byte privateData[];

	static 
	{
	//    0    0:new             #6   <Class PrivFrame$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void PrivFrame$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
