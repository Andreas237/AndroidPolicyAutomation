// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			Id3Frame

public final class BinaryFrame extends Id3Frame
{

	BinaryFrame(Parcel parcel)
	{
		super(parcel.readString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #26  <Method String Parcel.readString()>
	//    3    5:invokespecial   #29  <Method void Id3Frame(String)>
		data = parcel.createByteArray();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #33  <Method byte[] Parcel.createByteArray()>
	//    7   13:putfield        #35  <Field byte[] data>
	//    8   16:return          
	}

	public BinaryFrame(String s, byte abyte0[])
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void Id3Frame(String)>
		data = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #35  <Field byte[] data>
	//    6   10:return          
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
	//*   8   12:invokevirtual   #45  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #45  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((BinaryFrame)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class BinaryFrame>
	//   16   28:astore_1        
			return id.equals(((Object) (((BinaryFrame) (obj)).id))) && Arrays.equals(data, ((BinaryFrame) (obj)).data);
	//   17   29:aload_0         
	//   18   30:getfield        #49  <Field String id>
	//   19   33:aload_1         
	//   20   34:getfield        #49  <Field String id>
	//   21   37:invokevirtual   #53  <Method boolean String.equals(Object)>
	//   22   40:ifeq            59
	//   23   43:aload_0         
	//   24   44:getfield        #35  <Field byte[] data>
	//   25   47:aload_1         
	//   26   48:getfield        #35  <Field byte[] data>
	//   27   51:invokestatic    #58  <Method boolean Arrays.equals(byte[], byte[])>
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
		return 31 * (527 + id.hashCode()) + Arrays.hashCode(data);
	//    0    0:bipush          31
	//    1    2:sipush          527
	//    2    5:aload_0         
	//    3    6:getfield        #49  <Field String id>
	//    4    9:invokevirtual   #63  <Method int String.hashCode()>
	//    5   12:iadd            
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #35  <Field byte[] data>
	//    9   18:invokestatic    #66  <Method int Arrays.hashCode(byte[])>
	//   10   21:iadd            
	//   11   22:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(id);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field String id>
	//    3    5:invokevirtual   #71  <Method void Parcel.writeString(String)>
		parcel.writeByteArray(data);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field byte[] data>
	//    7   13:invokevirtual   #75  <Method void Parcel.writeByteArray(byte[])>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public BinaryFrame createFromParcel(Parcel parcel)
		{
			return new BinaryFrame(parcel);
		//    0    0:new             #9   <Class BinaryFrame>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void BinaryFrame(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method BinaryFrame createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public BinaryFrame[] newArray(int i)
		{
			return new BinaryFrame[i];
		//    0    0:iload_1         
		//    1    1:anewarray       BinaryFrame[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method BinaryFrame[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final byte data[];

	static 
	{
	//    0    0:new             #6   <Class BinaryFrame$1>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void BinaryFrame$1()>
	//    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
