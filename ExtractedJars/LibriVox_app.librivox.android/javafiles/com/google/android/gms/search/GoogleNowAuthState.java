// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.search;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.search:
//			a

public class GoogleNowAuthState extends AbstractSafeParcelable
{

	GoogleNowAuthState(String s, String s1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String b>
		c = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #29  <Field long c>
	//   11   19:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String b>
	//    2    4:areturn         
	}

	public long c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long c>
	//    2    4:lreturn         
	}

	public String toString()
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String a>
	//    2    4:astore_3        
		String s1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field String b>
	//    5    9:astore          4
		long l = c;
	//    6   11:aload_0         
	//    7   12:getfield        #29  <Field long c>
	//    8   15:lstore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 74 + String.valueOf(((Object) (s1))).length());
	//    9   16:new             #36  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:aload_3         
	//   12   21:invokestatic    #42  <Method String String.valueOf(Object)>
	//   13   24:invokevirtual   #46  <Method int String.length()>
	//   14   27:bipush          74
	//   15   29:iadd            
	//   16   30:aload           4
	//   17   32:invokestatic    #42  <Method String String.valueOf(Object)>
	//   18   35:invokevirtual   #46  <Method int String.length()>
	//   19   38:iadd            
	//   20   39:invokespecial   #49  <Method void StringBuilder(int)>
	//   21   42:astore          5
		stringbuilder.append("mAuthCode = ");
	//   22   44:aload           5
	//   23   46:ldc1            #51  <String "mAuthCode = ">
	//   24   48:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(s);
	//   26   52:aload           5
	//   27   54:aload_3         
	//   28   55:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		stringbuilder.append("\nmAccessToken = ");
	//   30   59:aload           5
	//   31   61:ldc1            #57  <String "\nmAccessToken = ">
	//   32   63:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
		stringbuilder.append(s1);
	//   34   67:aload           5
	//   35   69:aload           4
	//   36   71:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
		stringbuilder.append("\nmNextAllowedTimeMillis = ");
	//   38   75:aload           5
	//   39   77:ldc1            #59  <String "\nmNextAllowedTimeMillis = ">
	//   40   79:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
		stringbuilder.append(l);
	//   42   83:aload           5
	//   43   85:lload_1         
	//   44   86:invokevirtual   #62  <Method StringBuilder StringBuilder.append(long)>
	//   45   89:pop             
		return stringbuilder.toString();
	//   46   90:aload           5
	//   47   92:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   48   95:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #71  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #73  <Method String a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #76  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b(), false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #78  <Method String b()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #76  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c());
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #80  <Method long c()>
	//   19   31:invokestatic    #83  <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #85  <Method void c.a(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new a();
	private String a;
	private String b;
	private long c;

	static 
	{
	//    0    0:new             #15  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void a()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
