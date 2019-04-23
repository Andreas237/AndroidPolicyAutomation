// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfd, bcr

public final class zzhp
	implements Parcelable, Comparator
{

	zzhp(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		b = (zza[])parcel.createTypedArray(zza.CREATOR);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getstatic       #30  <Field android.os.Parcelable$Creator zzhp$zza.CREATOR>
	//    5    9:invokevirtual   #36  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//    6   12:checkcast       #37  <Class zzhp$zza[]>
	//    7   15:putfield        #39  <Field zzhp$zza[] b>
		a = b.length;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #39  <Field zzhp$zza[] b>
	//   11   23:arraylength     
	//   12   24:putfield        #41  <Field int a>
	//   13   27:return          
	}

	public zzhp(List list)
	{
		this(false, (zza[])list.toArray(((Object []) (new zza[list.size()]))));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:invokeinterface #48  <Method int List.size()>
	//    5    9:anewarray       zza[]
	//    6   12:invokeinterface #52  <Method Object[] List.toArray(Object[])>
	//    7   17:checkcast       #37  <Class zzhp$zza[]>
	//    8   20:invokespecial   #55  <Method void zzhp(boolean, zzhp$zza[])>
	//    9   23:return          
	}

	private transient zzhp(boolean flag, zza azza[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		zza azza1[] = azza;
	//    2    4:aload_2         
	//    3    5:astore          4
		if(flag)
	//*   4    7:iload_1         
	//*   5    8:ifeq            20
			azza1 = (zza[])((zza []) (azza)).clone();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #59  <Method Object _5B_Lcom.google.android.gms.internal.ads.zzhp$zza_3B_.clone()>
	//    8   15:checkcast       #37  <Class zzhp$zza[]>
	//    9   18:astore          4
		Arrays.sort(((Object []) (azza1)), ((Comparator) (this)));
	//   10   20:aload           4
	//   11   22:aload_0         
	//   12   23:invokestatic    #65  <Method void Arrays.sort(Object[], Comparator)>
		for(int i = 1; i < azza1.length;)
	//*  13   26:iconst_1        
	//*  14   27:istore_3        
	//*  15   28:iload_3         
	//*  16   29:aload           4
	//*  17   31:arraylength     
	//*  18   32:icmpge          122
			if(!zza.a(azza1[i - 1]).equals(((Object) (zza.a(azza1[i])))))
	//*  19   35:aload           4
	//*  20   37:iload_3         
	//*  21   38:iconst_1        
	//*  22   39:isub            
	//*  23   40:aaload          
	//*  24   41:invokestatic    #68  <Method UUID zzhp$zza.a(zzhp$zza)>
	//*  25   44:aload           4
	//*  26   46:iload_3         
	//*  27   47:aaload          
	//*  28   48:invokestatic    #68  <Method UUID zzhp$zza.a(zzhp$zza)>
	//*  29   51:invokevirtual   #74  <Method boolean UUID.equals(Object)>
	//*  30   54:ifne            64
			{
				i++;
	//   31   57:iload_3         
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore_3        
			} else
	//*  35   61:goto            28
			{
				azza = ((zza []) (String.valueOf(((Object) (zza.a(azza1[i]))))));
	//   36   64:aload           4
	//   37   66:iload_3         
	//   38   67:aaload          
	//   39   68:invokestatic    #68  <Method UUID zzhp$zza.a(zzhp$zza)>
	//   40   71:invokestatic    #80  <Method String String.valueOf(Object)>
	//   41   74:astore_2        
				azza1 = ((zza []) (new StringBuilder(String.valueOf(((Object) (azza))).length() + 25)));
	//   42   75:new             #82  <Class StringBuilder>
	//   43   78:dup             
	//   44   79:aload_2         
	//   45   80:invokestatic    #80  <Method String String.valueOf(Object)>
	//   46   83:invokevirtual   #85  <Method int String.length()>
	//   47   86:bipush          25
	//   48   88:iadd            
	//   49   89:invokespecial   #88  <Method void StringBuilder(int)>
	//   50   92:astore          4
				((StringBuilder) (azza1)).append("Duplicate data for uuid: ");
	//   51   94:aload           4
	//   52   96:ldc1            #90  <String "Duplicate data for uuid: ">
	//   53   98:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   54  101:pop             
				((StringBuilder) (azza1)).append(((String) (azza)));
	//   55  102:aload           4
	//   56  104:aload_2         
	//   57  105:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   58  108:pop             
				throw new IllegalArgumentException(((StringBuilder) (azza1)).toString());
	//   59  109:new             #96  <Class IllegalArgumentException>
	//   60  112:dup             
	//   61  113:aload           4
	//   62  115:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   63  118:invokespecial   #103 <Method void IllegalArgumentException(String)>
	//   64  121:athrow          
			}

		b = azza1;
	//   65  122:aload_0         
	//   66  123:aload           4
	//   67  125:putfield        #39  <Field zzhp$zza[] b>
		a = azza1.length;
	//   68  128:aload_0         
	//   69  129:aload           4
	//   70  131:arraylength     
	//   71  132:putfield        #41  <Field int a>
	//   72  135:return          
	}

	public transient zzhp(zza azza[])
	{
		this(true, azza);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #55  <Method void zzhp(boolean, zzhp$zza[])>
	//    4    6:return          
	}

	public final zza a(int i)
	{
		return b[i];
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzhp$zza[] b>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public final int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((zza)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #29  <Class zzhp$zza>
	//    2    4:astore_1        
		obj1 = ((Object) ((zza)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #29  <Class zzhp$zza>
	//    5    9:astore_2        
		if(bcr.b.equals(((Object) (zza.a(((zza) (obj)))))))
	//*   6   10:getstatic       #112 <Field UUID bcr.b>
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #68  <Method UUID zzhp$zza.a(zzhp$zza)>
	//*   9   17:invokevirtual   #74  <Method boolean UUID.equals(Object)>
	//*  10   20:ifeq            40
			return !bcr.b.equals(((Object) (zza.a(((zza) (obj1)))))) ? 1 : 0;
	//   11   23:getstatic       #112 <Field UUID bcr.b>
	//   12   26:aload_2         
	//   13   27:invokestatic    #68  <Method UUID zzhp$zza.a(zzhp$zza)>
	//   14   30:invokevirtual   #74  <Method boolean UUID.equals(Object)>
	//   15   33:ifeq            38
	//   16   36:iconst_0        
	//   17   37:ireturn         
	//   18   38:iconst_1        
	//   19   39:ireturn         
		else
			return zza.a(((zza) (obj))).compareTo(zza.a(((zza) (obj1))));
	//   20   40:aload_1         
	//   21   41:invokestatic    #68  <Method UUID zzhp$zza.a(zzhp$zza)>
	//   22   44:aload_2         
	//   23   45:invokestatic    #68  <Method UUID zzhp$zza.a(zzhp$zza)>
	//   24   48:invokevirtual   #116 <Method int UUID.compareTo(UUID)>
	//   25   51:ireturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          40
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #121 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #121 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            40
			return Arrays.equals(((Object []) (b)), ((Object []) (((zzhp)obj).b)));
	//   13   25:aload_0         
	//   14   26:getfield        #39  <Field zzhp$zza[] b>
	//   15   29:aload_1         
	//   16   30:checkcast       #2   <Class zzhp>
	//   17   33:getfield        #39  <Field zzhp$zza[] b>
	//   18   36:invokestatic    #124 <Method boolean Arrays.equals(Object[], Object[])>
	//   19   39:ireturn         
		else
			return false;
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	public final int hashCode()
	{
		if(c == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field int c>
	//*   2    4:ifne            18
			c = Arrays.hashCode(((Object []) (b)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field zzhp$zza[] b>
	//    6   12:invokestatic    #130 <Method int Arrays.hashCode(Object[])>
	//    7   15:putfield        #127 <Field int c>
		return c;
	//    8   18:aload_0         
	//    9   19:getfield        #127 <Field int c>
	//   10   22:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeTypedArray(((Parcelable []) (b)), 0);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field zzhp$zza[] b>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #136 <Method void Parcel.writeTypedArray(Parcelable[], int)>
	//    5    9:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bfd();
	public final int a;
	private final zza b[];
	private int c;

	static 
	{
	//    0    0:new             #19  <Class bfd>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void bfd()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private class zza
		implements Parcelable
	{

		static UUID a(zza zza1)
		{
			return zza1.c;
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
			if(!(obj instanceof zza))
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
			obj = ((Object) ((zza)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class zzhp$zza>
		//   12   20:astore_1        
			return d.equals(((Object) (((zza) (obj)).d))) && bnw.a(((Object) (c)), ((Object) (((zza) (obj)).c))) && Arrays.equals(e, ((zza) (obj)).e);
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

		public static final android.os.Parcelable.Creator CREATOR = new bfe();
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

		zza(Parcel parcel)
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

		public zza(UUID uuid, String s, byte abyte0[])
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

		public zza(UUID uuid, String s, byte abyte0[], boolean flag)
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

}
