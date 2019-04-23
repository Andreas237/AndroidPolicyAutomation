// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.internal:
//			aq, ak

public class ClientIdentity extends AbstractSafeParcelable
{

	public ClientIdentity(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String b>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          54
		{
			if(!(obj instanceof ClientIdentity))
	//*   7   11:aload_1         
	//*   8   12:instanceof      #2   <Class ClientIdentity>
	//*   9   15:ifne            20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			obj = ((Object) ((ClientIdentity)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class ClientIdentity>
	//   14   24:astore_1        
			return ((ClientIdentity) (obj)).a == a && ak.a(((Object) (((ClientIdentity) (obj)).b)), ((Object) (b)));
	//   15   25:aload_1         
	//   16   26:getfield        #24  <Field int a>
	//   17   29:aload_0         
	//   18   30:getfield        #24  <Field int a>
	//   19   33:icmpne          52
	//   20   36:aload_1         
	//   21   37:getfield        #26  <Field String b>
	//   22   40:aload_0         
	//   23   41:getfield        #26  <Field String b>
	//   24   44:invokestatic    #33  <Method boolean ak.a(Object, Object)>
	//   25   47:ifeq            52
	//   26   50:iconst_1        
	//   27   51:ireturn         
	//   28   52:iconst_0        
	//   29   53:ireturn         
		} else
		{
			return false;
	//   30   54:iconst_0        
	//   31   55:ireturn         
		}
	}

	public int hashCode()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int a>
	//    2    4:ireturn         
	}

	public String toString()
	{
		int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int a>
	//    2    4:istore_1        
		String s = b;
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field String b>
	//    5    9:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 12);
	//    6   10:new             #39  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokestatic    #45  <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #48  <Method int String.length()>
	//   11   21:bipush          12
	//   12   23:iadd            
	//   13   24:invokespecial   #51  <Method void StringBuilder(int)>
	//   14   27:astore_3        
		stringbuilder.append(i);
	//   15   28:aload_3         
	//   16   29:iload_1         
	//   17   30:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
		stringbuilder.append(":");
	//   19   34:aload_3         
	//   20   35:ldc1            #57  <String ":">
	//   21   37:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		stringbuilder.append(s);
	//   23   41:aload_3         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
		return stringbuilder.toString();
	//   27   47:aload_3         
	//   28   48:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   29   51:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #69  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field int a>
	//    7   11:invokestatic    #72  <Method void c.a(Parcel, int, int)>
		c.a(parcel, 2, b, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #26  <Field String b>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #75  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #77  <Method void c.a(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new aq();
	private final int a;
	private final String b;

	static 
	{
	//    0    0:new             #14  <Class aq>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void aq()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
