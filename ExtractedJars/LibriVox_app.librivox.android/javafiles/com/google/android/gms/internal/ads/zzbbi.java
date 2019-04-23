// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aal

public final class zzbbi extends AbstractSafeParcelable
{

	public zzbbi(int i, int j, boolean flag)
	{
		this(i, j, flag, false, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:invokespecial   #29  <Method void zzbbi(int, int, boolean, boolean, boolean)>
	//    7    9:return          
	}

	public zzbbi(int i, int j, boolean flag, boolean flag1)
	{
		this(0xda3360, j, true, false, flag1);
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <Int 0xda3360>
	//    2    3:iload_2         
	//    3    4:iconst_1        
	//    4    5:iconst_0        
	//    5    6:iload           4
	//    6    8:invokespecial   #29  <Method void zzbbi(int, int, boolean, boolean, boolean)>
	//    7   11:return          
	}

	private zzbbi(int i, int j, boolean flag, boolean flag1, boolean flag2)
	{
		String s;
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            11
			s = "0";
	//    2    4:ldc1            #33  <String "0">
	//    3    6:astore          6
		else
	//*   4    8:goto            15
			s = "1";
	//    5   11:ldc1            #35  <String "1">
	//    6   13:astore          6
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 36);
	//    7   15:new             #37  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:aload           6
	//   10   21:invokestatic    #43  <Method String String.valueOf(Object)>
	//   11   24:invokevirtual   #47  <Method int String.length()>
	//   12   27:bipush          36
	//   13   29:iadd            
	//   14   30:invokespecial   #50  <Method void StringBuilder(int)>
	//   15   33:astore          7
		stringbuilder.append("afma-sdk-a-v");
	//   16   35:aload           7
	//   17   37:ldc1            #52  <String "afma-sdk-a-v">
	//   18   39:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:pop             
		stringbuilder.append(i);
	//   20   43:aload           7
	//   21   45:iload_1         
	//   22   46:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   23   49:pop             
		stringbuilder.append(".");
	//   24   50:aload           7
	//   25   52:ldc1            #61  <String ".">
	//   26   54:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
		stringbuilder.append(j);
	//   28   58:aload           7
	//   29   60:iload_2         
	//   30   61:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   31   64:pop             
		stringbuilder.append(".");
	//   32   65:aload           7
	//   33   67:ldc1            #61  <String ".">
	//   34   69:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
		stringbuilder.append(s);
	//   36   73:aload           7
	//   37   75:aload           6
	//   38   77:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
		this(stringbuilder.toString(), i, j, flag, flag2);
	//   40   81:aload_0         
	//   41   82:aload           7
	//   42   84:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   43   87:iload_1         
	//   44   88:iload_2         
	//   45   89:iload_3         
	//   46   90:iload           5
	//   47   92:invokespecial   #68  <Method void zzbbi(String, int, int, boolean, boolean)>
	//   48   95:return          
	}

	zzbbi(String s, int i, int j, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #71  <Field String a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #73  <Field int b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #75  <Field int c>
		d = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #77  <Field boolean d>
		e = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #79  <Field boolean e>
	//   17   31:return          
	}

	public static zzbbi a()
	{
		return new zzbbi(0xbdfcc1, 0xbdfcc1, true);
	//    0    0:new             #2   <Class zzbbi>
	//    1    3:dup             
	//    2    4:ldc1            #81  <Int 0xbdfcc1>
	//    3    6:ldc1            #81  <Int 0xbdfcc1>
	//    4    8:iconst_1        
	//    5    9:invokespecial   #83  <Method void zzbbi(int, int, boolean)>
	//    6   12:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #90  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #71  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #93  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #73  <Field int b>
	//   13   21:invokestatic    #96  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:getfield        #75  <Field int c>
	//   18   30:invokestatic    #96  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #77  <Field boolean d>
	//   23   39:invokestatic    #99  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:getfield        #79  <Field boolean e>
	//   28   49:invokestatic    #99  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   29   52:aload_1         
	//   30   53:iload_2         
	//   31   54:invokestatic    #101 <Method void c.a(Parcel, int)>
	//   32   57:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new aal();
	public String a;
	public int b;
	public int c;
	public boolean d;
	public boolean e;

	static 
	{
	//    0    0:new             #19  <Class aal>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void aal()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
