// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkp, bia, bnw

public final class zzkk extends zzkp
{

	zzkk(Parcel parcel)
	{
		super("APIC");
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <String "APIC">
	//    2    3:invokespecial   #29  <Method void zzkp(String)>
		a = parcel.readString();
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #35  <Method String Parcel.readString()>
	//    6   11:putfield        #37  <Field String a>
		b = parcel.readString();
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #35  <Method String Parcel.readString()>
	//   10   19:putfield        #39  <Field String b>
		d = parcel.readInt();
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #43  <Method int Parcel.readInt()>
	//   14   27:putfield        #45  <Field int d>
		e = parcel.createByteArray();
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #49  <Method byte[] Parcel.createByteArray()>
	//   18   35:putfield        #51  <Field byte[] e>
	//   19   38:return          
	}

	public zzkk(String s, String s1, int i, byte abyte0[])
	{
		super("APIC");
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <String "APIC">
	//    2    3:invokespecial   #29  <Method void zzkp(String)>
		a = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #37  <Field String a>
		b = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #39  <Field String b>
		d = 3;
	//    9   16:aload_0         
	//   10   17:iconst_3        
	//   11   18:putfield        #45  <Field int d>
		e = abyte0;
	//   12   21:aload_0         
	//   13   22:aload           4
	//   14   24:putfield        #51  <Field byte[] e>
	//   15   27:return          
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          86
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #60  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #60  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((zzkk)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzkk>
	//   16   28:astore_1        
			return d == ((zzkk) (obj)).d && bnw.a(((Object) (a)), ((Object) (((zzkk) (obj)).a))) && bnw.a(((Object) (b)), ((Object) (((zzkk) (obj)).b))) && Arrays.equals(e, ((zzkk) (obj)).e);
	//   17   29:aload_0         
	//   18   30:getfield        #45  <Field int d>
	//   19   33:aload_1         
	//   20   34:getfield        #45  <Field int d>
	//   21   37:icmpne          84
	//   22   40:aload_0         
	//   23   41:getfield        #37  <Field String a>
	//   24   44:aload_1         
	//   25   45:getfield        #37  <Field String a>
	//   26   48:invokestatic    #65  <Method boolean bnw.a(Object, Object)>
	//   27   51:ifeq            84
	//   28   54:aload_0         
	//   29   55:getfield        #39  <Field String b>
	//   30   58:aload_1         
	//   31   59:getfield        #39  <Field String b>
	//   32   62:invokestatic    #65  <Method boolean bnw.a(Object, Object)>
	//   33   65:ifeq            84
	//   34   68:aload_0         
	//   35   69:getfield        #51  <Field byte[] e>
	//   36   72:aload_1         
	//   37   73:getfield        #51  <Field byte[] e>
	//   38   76:invokestatic    #70  <Method boolean Arrays.equals(byte[], byte[])>
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

	public final int hashCode()
	{
		int k = d;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int d>
	//    2    4:istore_3        
		String s = a;
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field String a>
	//    5    9:astore          4
		int j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		int i;
		if(s != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          27
			i = s.hashCode();
	//   10   18:aload           4
	//   11   20:invokevirtual   #75  <Method int String.hashCode()>
	//   12   23:istore_1        
		else
	//*  13   24:goto            29
			i = 0;
	//   14   27:iconst_0        
	//   15   28:istore_1        
		s = b;
	//   16   29:aload_0         
	//   17   30:getfield        #39  <Field String b>
	//   18   33:astore          4
		if(s != null)
	//*  19   35:aload           4
	//*  20   37:ifnull          46
			j = s.hashCode();
	//   21   40:aload           4
	//   22   42:invokevirtual   #75  <Method int String.hashCode()>
	//   23   45:istore_2        
		return (((k + 527) * 31 + i) * 31 + j) * 31 + Arrays.hashCode(e);
	//   24   46:iload_3         
	//   25   47:sipush          527
	//   26   50:iadd            
	//   27   51:bipush          31
	//   28   53:imul            
	//   29   54:iload_1         
	//   30   55:iadd            
	//   31   56:bipush          31
	//   32   58:imul            
	//   33   59:iload_2         
	//   34   60:iadd            
	//   35   61:bipush          31
	//   36   63:imul            
	//   37   64:aload_0         
	//   38   65:getfield        #51  <Field byte[] e>
	//   39   68:invokestatic    #78  <Method int Arrays.hashCode(byte[])>
	//   40   71:iadd            
	//   41   72:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field String a>
	//    3    5:invokevirtual   #83  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field String b>
	//    7   13:invokevirtual   #83  <Method void Parcel.writeString(String)>
		parcel.writeInt(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field int d>
	//   11   21:invokevirtual   #87  <Method void Parcel.writeInt(int)>
		parcel.writeByteArray(e);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #51  <Field byte[] e>
	//   15   29:invokevirtual   #91  <Method void Parcel.writeByteArray(byte[])>
	//   16   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bia();
	private final String a;
	private final String b;
	private final int d;
	private final byte e[];

	static 
	{
	//    0    0:new             #17  <Class bia>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void bia()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
