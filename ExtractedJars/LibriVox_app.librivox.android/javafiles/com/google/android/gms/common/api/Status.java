// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.api:
//			ah, aq, s

public final class Status extends AbstractSafeParcelable
	implements ah, ReflectedParcelable
{

	public Status(int l)
	{
		this(l, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #55  <Method void Status(int, String)>
	//    4    6:return          
	}

	Status(int l, int i1, String s1, PendingIntent pendingintent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void AbstractSafeParcelable()>
		h = l;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #59  <Field int h>
		i = i1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #61  <Field int i>
		j = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #63  <Field String j>
		k = pendingintent;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #65  <Field PendingIntent k>
	//   14   25:return          
	}

	public Status(int l, String s1)
	{
		this(1, l, s1, ((PendingIntent) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #67  <Method void Status(int, int, String, PendingIntent)>
	//    6    8:return          
	}

	public Status(int l, String s1, PendingIntent pendingintent)
	{
		this(1, l, s1, pendingintent);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #67  <Method void Status(int, int, String, PendingIntent)>
	//    6    8:return          
	}

	public final String a()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String j>
	//    2    4:areturn         
	}

	public final Status b()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final boolean c()
	{
		return i <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int i>
	//    2    4:ifgt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final int d()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int i>
	//    2    4:ireturn         
	}

	public final String e()
	{
		String s1 = j;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String j>
	//    2    4:astore_1        
		if(s1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return s1;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return s.a(i);
	//    7   11:aload_0         
	//    8   12:getfield        #61  <Field int i>
	//    9   15:invokestatic    #77  <Method String s.a(int)>
	//   10   18:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof Status))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Status>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((Status)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class Status>
	//    7   13:astore_1        
		return h == ((Status) (obj)).h && i == ((Status) (obj)).i && ak.a(((Object) (j)), ((Object) (((Status) (obj)).j))) && ak.a(((Object) (k)), ((Object) (((Status) (obj)).k)));
	//    8   14:aload_0         
	//    9   15:getfield        #59  <Field int h>
	//   10   18:aload_1         
	//   11   19:getfield        #59  <Field int h>
	//   12   22:icmpne          66
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field int i>
	//   15   29:aload_1         
	//   16   30:getfield        #61  <Field int i>
	//   17   33:icmpne          66
	//   18   36:aload_0         
	//   19   37:getfield        #63  <Field String j>
	//   20   40:aload_1         
	//   21   41:getfield        #63  <Field String j>
	//   22   44:invokestatic    #84  <Method boolean ak.a(Object, Object)>
	//   23   47:ifeq            66
	//   24   50:aload_0         
	//   25   51:getfield        #65  <Field PendingIntent k>
	//   26   54:aload_1         
	//   27   55:getfield        #65  <Field PendingIntent k>
	//   28   58:invokestatic    #84  <Method boolean ak.a(Object, Object)>
	//   29   61:ifeq            66
	//   30   64:iconst_1        
	//   31   65:ireturn         
	//   32   66:iconst_0        
	//   33   67:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			Integer.valueOf(h), Integer.valueOf(i), j, k
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #59  <Field int h>
	//    6   10:invokestatic    #93  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #61  <Field int i>
	//   12   20:invokestatic    #93  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #63  <Field String j>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #65  <Field PendingIntent k>
	//   23   37:aastore         
	//   24   38:invokestatic    #96  <Method int ak.a(Object[])>
	//   25   41:ireturn         
	}

	public final String toString()
	{
		return ak.a(((Object) (this))).a("statusCode", ((Object) (e()))).a("resolution", ((Object) (k))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #100 <Method al ak.a(Object)>
	//    2    4:ldc1            #102 <String "statusCode">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #104 <Method String e()>
	//    5   10:invokevirtual   #109 <Method al al.a(String, Object)>
	//    6   13:ldc1            #111 <String "resolution">
	//    7   15:aload_0         
	//    8   16:getfield        #65  <Field PendingIntent k>
	//    9   19:invokevirtual   #109 <Method al al.a(String, Object)>
	//   10   22:invokevirtual   #113 <Method String al.toString()>
	//   11   25:areturn         
	}

	public final void writeToParcel(Parcel parcel, int l)
	{
		int i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #120 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, d());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #122 <Method int d()>
	//    7   11:invokestatic    #125 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #127 <Method String a()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #130 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (k)), l, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #65  <Field PendingIntent k>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #133 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, h);
	//   21   35:aload_1         
	//   22   36:sipush          1000
	//   23   39:aload_0         
	//   24   40:getfield        #59  <Field int h>
	//   25   43:invokestatic    #125 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   26   46:aload_1         
	//   27   47:iload_3         
	//   28   48:invokestatic    #135 <Method void c.a(Parcel, int)>
	//   29   51:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new aq();
	public static final Status a = new Status(0);
	public static final Status b = new Status(14);
	public static final Status c = new Status(8);
	public static final Status d = new Status(15);
	public static final Status e = new Status(16);
	public static final Status f = new Status(18);
	private static final Status g = new Status(17);
	private final int h;
	private final int i;
	private final String j;
	private final PendingIntent k;

	static 
	{
	//    0    0:new             #2   <Class Status>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #31  <Method void Status(int)>
	//    4    8:putstatic       #33  <Field Status a>
	//    5   11:new             #2   <Class Status>
	//    6   14:dup             
	//    7   15:bipush          14
	//    8   17:invokespecial   #31  <Method void Status(int)>
	//    9   20:putstatic       #35  <Field Status b>
	//   10   23:new             #2   <Class Status>
	//   11   26:dup             
	//   12   27:bipush          8
	//   13   29:invokespecial   #31  <Method void Status(int)>
	//   14   32:putstatic       #37  <Field Status c>
	//   15   35:new             #2   <Class Status>
	//   16   38:dup             
	//   17   39:bipush          15
	//   18   41:invokespecial   #31  <Method void Status(int)>
	//   19   44:putstatic       #39  <Field Status d>
	//   20   47:new             #2   <Class Status>
	//   21   50:dup             
	//   22   51:bipush          16
	//   23   53:invokespecial   #31  <Method void Status(int)>
	//   24   56:putstatic       #41  <Field Status e>
	//   25   59:new             #2   <Class Status>
	//   26   62:dup             
	//   27   63:bipush          17
	//   28   65:invokespecial   #31  <Method void Status(int)>
	//   29   68:putstatic       #43  <Field Status g>
	//   30   71:new             #2   <Class Status>
	//   31   74:dup             
	//   32   75:bipush          18
	//   33   77:invokespecial   #31  <Method void Status(int)>
	//   34   80:putstatic       #45  <Field Status f>
	//   35   83:new             #47  <Class aq>
	//   36   86:dup             
	//   37   87:invokespecial   #49  <Method void aq()>
	//   38   90:putstatic       #51  <Field android.os.Parcelable$Creator CREATOR>
	//*  39   93:return          
	}
}
