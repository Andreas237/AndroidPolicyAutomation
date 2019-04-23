// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfe, bnf, bnw

public final class zzhp$zza
	implements Parcelable
{

	static UUID a(zzhp$zza zzhp$zza1)
	{
		return zzhp$zza1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field UUID c>
	//    2    4:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof zzhp$zza))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zzhp$zza>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(obj == this)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) ((zzhp$zza)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzhp$zza>
	//   12   20:astore_1        
		return d.equals(((Object) (((zzhp$zza) (obj)).d))) && bnw.a(((Object) (c)), ((Object) (((zzhp$zza) (obj)).c))) && Arrays.equals(e, ((zzhp$zza) (obj)).e);
	//   13   21:aload_0         
	//   14   22:getfield        #49  <Field String d>
	//   15   25:aload_1         
	//   16   26:getfield        #49  <Field String d>
	//   17   29:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   18   32:ifeq            65
	//   19   35:aload_0         
	//   20   36:getfield        #43  <Field UUID c>
	//   21   39:aload_1         
	//   22   40:getfield        #43  <Field UUID c>
	//   23   43:invokestatic    #85  <Method boolean bnw.a(Object, Object)>
	//   24   46:ifeq            65
	//   25   49:aload_0         
	//   26   50:getfield        #55  <Field byte[] e>
	//   27   53:aload_1         
	//   28   54:getfield        #55  <Field byte[] e>
	//   29   57:invokestatic    #90  <Method boolean Arrays.equals(byte[], byte[])>
	//   30   60:ifeq            65
	//   31   63:iconst_1        
	//   32   64:ireturn         
	//   33   65:iconst_0        
	//   34   66:ireturn         
	}

	public final int hashCode()
	{
		if(b == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field int b>
	//*   2    4:ifne            40
			b = (c.hashCode() * 31 + d.hashCode()) * 31 + Arrays.hashCode(e);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field UUID c>
	//    6   12:invokevirtual   #95  <Method int UUID.hashCode()>
	//    7   15:bipush          31
	//    8   17:imul            
	//    9   18:aload_0         
	//   10   19:getfield        #49  <Field String d>
	//   11   22:invokevirtual   #96  <Method int String.hashCode()>
	//   12   25:iadd            
	//   13   26:bipush          31
	//   14   28:imul            
	//   15   29:aload_0         
	//   16   30:getfield        #55  <Field byte[] e>
	//   17   33:invokestatic    #99  <Method int Arrays.hashCode(byte[])>
	//   18   36:iadd            
	//   19   37:putfield        #93  <Field int b>
		return b;
	//   20   40:aload_0         
	//   21   41:getfield        #93  <Field int b>
	//   22   44:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(c.getMostSignificantBits());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field UUID c>
	//    3    5:invokevirtual   #104 <Method long UUID.getMostSignificantBits()>
	//    4    8:invokevirtual   #108 <Method void Parcel.writeLong(long)>
		parcel.writeLong(c.getLeastSignificantBits());
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field UUID c>
	//    8   16:invokevirtual   #111 <Method long UUID.getLeastSignificantBits()>
	//    9   19:invokevirtual   #108 <Method void Parcel.writeLong(long)>
		parcel.writeString(d);
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #49  <Field String d>
	//   13   27:invokevirtual   #115 <Method void Parcel.writeString(String)>
		parcel.writeByteArray(e);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #55  <Field byte[] e>
	//   17   35:invokevirtual   #119 <Method void Parcel.writeByteArray(byte[])>
		parcel.writeByte((byte)a);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #61  <Field boolean a>
	//   21   43:int2byte        
	//   22   44:invokevirtual   #123 <Method void Parcel.writeByte(byte)>
	//   23   47:return          
	}

	public static final android.os.e.Creator CREATOR = new bfe();
	public final boolean a;
	private int b;
	private final UUID c;
	private final String d;
	private final byte e[];

	static 
	{
	//    0    0:new             #22  <Class bfe>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void bfe()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	zzhp$zza(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		c = new UUID(parcel.readLong(), parcel.readLong());
	//    2    4:aload_0         
	//    3    5:new             #32  <Class UUID>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #38  <Method long Parcel.readLong()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method long Parcel.readLong()>
	//    9   17:invokespecial   #41  <Method void UUID(long, long)>
	//   10   20:putfield        #43  <Field UUID c>
		d = parcel.readString();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #47  <Method String Parcel.readString()>
	//   14   28:putfield        #49  <Field String d>
		e = parcel.createByteArray();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #53  <Method byte[] Parcel.createByteArray()>
	//   18   36:putfield        #55  <Field byte[] e>
		boolean flag;
		if(parcel.readByte() != 0)
	//*  19   39:aload_1         
	//*  20   40:invokevirtual   #59  <Method byte Parcel.readByte()>
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		a = flag;
	//   27   53:aload_0         
	//   28   54:iload_2         
	//   29   55:putfield        #61  <Field boolean a>
	//   30   58:return          
	}

	public zzhp$zza(UUID uuid, String s, byte abyte0[])
	{
		this(uuid, s, abyte0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #65  <Method void zzhp$zza(UUID, String, byte[], boolean)>
	//    6    8:return          
	}

	public zzhp$zza(UUID uuid, String s, byte abyte0[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		c = (UUID)bnf.a(((Object) (uuid)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #70  <Method Object bnf.a(Object)>
	//    5    9:checkcast       #32  <Class UUID>
	//    6   12:putfield        #43  <Field UUID c>
		d = (String)bnf.a(((Object) (s)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #70  <Method Object bnf.a(Object)>
	//   10   20:checkcast       #72  <Class String>
	//   11   23:putfield        #49  <Field String d>
		e = (byte[])bnf.a(((Object) (abyte0)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #70  <Method Object bnf.a(Object)>
	//   15   31:checkcast       #73  <Class byte[]>
	//   16   34:putfield        #55  <Field byte[] e>
		a = flag;
	//   17   37:aload_0         
	//   18   38:iload           4
	//   19   40:putfield        #61  <Field boolean a>
	//   20   43:return          
	}
}
