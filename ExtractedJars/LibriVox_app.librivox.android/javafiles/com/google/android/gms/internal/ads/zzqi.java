// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			boa

public final class zzqi
	implements Parcelable
{

	public zzqi(int i, int j, int k, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #31  <Field int b>
		c = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #33  <Field int c>
		d = abyte0;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field byte[] d>
	//   14   25:return          
	}

	zzqi(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #42  <Method int Parcel.readInt()>
	//    5    9:putfield        #29  <Field int a>
		b = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #42  <Method int Parcel.readInt()>
	//    9   17:putfield        #31  <Field int b>
		c = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #42  <Method int Parcel.readInt()>
	//   13   25:putfield        #33  <Field int c>
		boolean flag;
		if(parcel.readInt() != 0)
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #42  <Method int Parcel.readInt()>
	//*  16   32:ifeq            40
			flag = true;
	//   17   35:iconst_1        
	//   18   36:istore_2        
		else
	//*  19   37:goto            42
			flag = false;
	//   20   40:iconst_0        
	//   21   41:istore_2        
		if(flag)
	//*  22   42:iload_2         
	//*  23   43:ifeq            54
			parcel = ((Parcel) (parcel.createByteArray()));
	//   24   46:aload_1         
	//   25   47:invokevirtual   #46  <Method byte[] Parcel.createByteArray()>
	//   26   50:astore_1        
		else
	//*  27   51:goto            56
			parcel = null;
	//   28   54:aconst_null     
	//   29   55:astore_1        
		d = ((byte []) (parcel));
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:putfield        #35  <Field byte[] d>
	//   33   61:return          
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          82
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #53  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #53  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((zzqi)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzqi>
	//   16   28:astore_1        
			if(a == ((zzqi) (obj)).a && b == ((zzqi) (obj)).b && c == ((zzqi) (obj)).c)
	//*  17   29:aload_0         
	//*  18   30:getfield        #29  <Field int a>
	//*  19   33:aload_1         
	//*  20   34:getfield        #29  <Field int a>
	//*  21   37:icmpne          80
	//*  22   40:aload_0         
	//*  23   41:getfield        #31  <Field int b>
	//*  24   44:aload_1         
	//*  25   45:getfield        #31  <Field int b>
	//*  26   48:icmpne          80
	//*  27   51:aload_0         
	//*  28   52:getfield        #33  <Field int c>
	//*  29   55:aload_1         
	//*  30   56:getfield        #33  <Field int c>
	//*  31   59:icmpne          80
				return Arrays.equals(d, ((zzqi) (obj)).d);
	//   32   62:aload_0         
	//   33   63:getfield        #35  <Field byte[] d>
	//   34   66:aload_1         
	//   35   67:getfield        #35  <Field byte[] d>
	//   36   70:invokestatic    #58  <Method boolean Arrays.equals(byte[], byte[])>
	//   37   73:ifne            78
	//   38   76:iconst_0        
	//   39   77:ireturn         
	//   40   78:iconst_1        
	//   41   79:ireturn         
			else
				return false;
	//   42   80:iconst_0        
	//   43   81:ireturn         
		} else
		{
			return false;
	//   44   82:iconst_0        
	//   45   83:ireturn         
		}
	}

	public final int hashCode()
	{
		if(e == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int e>
	//*   2    4:ifne            46
			e = (((a + 527) * 31 + b) * 31 + c) * 31 + Arrays.hashCode(d);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field int a>
	//    6   12:sipush          527
	//    7   15:iadd            
	//    8   16:bipush          31
	//    9   18:imul            
	//   10   19:aload_0         
	//   11   20:getfield        #31  <Field int b>
	//   12   23:iadd            
	//   13   24:bipush          31
	//   14   26:imul            
	//   15   27:aload_0         
	//   16   28:getfield        #33  <Field int c>
	//   17   31:iadd            
	//   18   32:bipush          31
	//   19   34:imul            
	//   20   35:aload_0         
	//   21   36:getfield        #35  <Field byte[] d>
	//   22   39:invokestatic    #64  <Method int Arrays.hashCode(byte[])>
	//   23   42:iadd            
	//   24   43:putfield        #61  <Field int e>
		return e;
	//   25   46:aload_0         
	//   26   47:getfield        #61  <Field int e>
	//   27   50:ireturn         
	}

	public final String toString()
	{
		int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int a>
	//    2    4:istore_1        
		int j = b;
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field int b>
	//    5    9:istore_2        
		int k = c;
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field int c>
	//    8   14:istore_3        
		boolean flag;
		if(d != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #35  <Field byte[] d>
	//*  11   19:ifnull          28
			flag = true;
	//   12   22:iconst_1        
	//   13   23:istore          4
		else
	//*  14   25:goto            31
			flag = false;
	//   15   28:iconst_0        
	//   16   29:istore          4
		StringBuilder stringbuilder = new StringBuilder(55);
	//   17   31:new             #68  <Class StringBuilder>
	//   18   34:dup             
	//   19   35:bipush          55
	//   20   37:invokespecial   #71  <Method void StringBuilder(int)>
	//   21   40:astore          5
		stringbuilder.append("ColorInfo(");
	//   22   42:aload           5
	//   23   44:ldc1            #73  <String "ColorInfo(">
	//   24   46:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(i);
	//   26   50:aload           5
	//   27   52:iload_1         
	//   28   53:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   29   56:pop             
		stringbuilder.append(", ");
	//   30   57:aload           5
	//   31   59:ldc1            #82  <String ", ">
	//   32   61:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		stringbuilder.append(j);
	//   34   65:aload           5
	//   35   67:iload_2         
	//   36   68:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   37   71:pop             
		stringbuilder.append(", ");
	//   38   72:aload           5
	//   39   74:ldc1            #82  <String ", ">
	//   40   76:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
		stringbuilder.append(k);
	//   42   80:aload           5
	//   43   82:iload_3         
	//   44   83:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   45   86:pop             
		stringbuilder.append(", ");
	//   46   87:aload           5
	//   47   89:ldc1            #82  <String ", ">
	//   48   91:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   49   94:pop             
		stringbuilder.append(flag);
	//   50   95:aload           5
	//   51   97:iload           4
	//   52   99:invokevirtual   #85  <Method StringBuilder StringBuilder.append(boolean)>
	//   53  102:pop             
		stringbuilder.append(")");
	//   54  103:aload           5
	//   55  105:ldc1            #87  <String ")">
	//   56  107:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   57  110:pop             
		return stringbuilder.toString();
	//   58  111:aload           5
	//   59  113:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   60  116:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field int a>
	//    3    5:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field int b>
	//    7   13:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		parcel.writeInt(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field int c>
	//   11   21:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		if(d != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #35  <Field byte[] d>
	//*  14   28:ifnull          36
			i = 1;
	//   15   31:iconst_1        
	//   16   32:istore_2        
		else
	//*  17   33:goto            38
			i = 0;
	//   18   36:iconst_0        
	//   19   37:istore_2        
		parcel.writeInt(i);
	//   20   38:aload_1         
	//   21   39:iload_2         
	//   22   40:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		byte abyte0[] = d;
	//   23   43:aload_0         
	//   24   44:getfield        #35  <Field byte[] d>
	//   25   47:astore_3        
		if(abyte0 != null)
	//*  26   48:aload_3         
	//*  27   49:ifnull          57
			parcel.writeByteArray(abyte0);
	//   28   52:aload_1         
	//   29   53:aload_3         
	//   30   54:invokevirtual   #98  <Method void Parcel.writeByteArray(byte[])>
	//   31   57:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new boa();
	public final int a;
	public final int b;
	public final int c;
	public final byte d[];
	private int e;

	static 
	{
	//    0    0:new             #19  <Class boa>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void boa()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
