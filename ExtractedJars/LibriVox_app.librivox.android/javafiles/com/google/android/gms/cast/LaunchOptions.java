// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.aj;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//			u

public class LaunchOptions extends AbstractSafeParcelable
{

	public LaunchOptions()
	{
		this(false, aj.a(Locale.getDefault()));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #26  <Method Locale Locale.getDefault()>
	//    3    5:invokestatic    #31  <Method String aj.a(Locale)>
	//    4    8:invokespecial   #34  <Method void LaunchOptions(boolean, String)>
	//    5   11:return          
	}

	LaunchOptions(boolean flag, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field boolean a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field String b>
	//    8   14:return          
	}

	public boolean a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean a>
	//    2    4:ireturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String b>
	//    2    4:areturn         
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
		if(!(obj instanceof LaunchOptions))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LaunchOptions>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((LaunchOptions)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class LaunchOptions>
	//   12   20:astore_1        
		return a == ((LaunchOptions) (obj)).a && aj.a(((Object) (b)), ((Object) (((LaunchOptions) (obj)).b)));
	//   13   21:aload_0         
	//   14   22:getfield        #37  <Field boolean a>
	//   15   25:aload_1         
	//   16   26:getfield        #37  <Field boolean a>
	//   17   29:icmpne          48
	//   18   32:aload_0         
	//   19   33:getfield        #39  <Field String b>
	//   20   36:aload_1         
	//   21   37:getfield        #39  <Field String b>
	//   22   40:invokestatic    #46  <Method boolean aj.a(Object, Object)>
	//   23   43:ifeq            48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			Boolean.valueOf(a), b
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field boolean a>
	//    6   10:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #39  <Field String b>
	//   12   20:aastore         
	//   13   21:invokestatic    #61  <Method int ak.a(Object[])>
	//   14   24:ireturn         
	}

	public String toString()
	{
		return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] {
			Boolean.valueOf(a), b
		});
	//    0    0:ldc1            #64  <String "LaunchOptions(relaunchIfRunning=%b, language=%s)">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #37  <Field boolean a>
	//    7   12:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #39  <Field String b>
	//   13   22:aastore         
	//   14   23:invokestatic    #70  <Method String String.format(String, Object[])>
	//   15   26:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #77  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 2, a());
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #79  <Method boolean a()>
	//    7   11:invokestatic    #82  <Method void c.a(Parcel, int, boolean)>
		c.a(parcel, 3, b(), false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #84  <Method String b()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #87  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #89  <Method void c.a(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new u();
	private boolean a;
	private String b;

	static 
	{
	//    0    0:new             #14  <Class u>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void u()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
