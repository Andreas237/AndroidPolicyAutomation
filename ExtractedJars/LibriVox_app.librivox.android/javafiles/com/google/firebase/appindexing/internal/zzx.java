// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.firebase.appindexing.internal:
//			g, Thing

public final class zzx extends AbstractSafeParcelable
{

	zzx(int i, Thing athing[], String as[], String as1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		int j = i;
	//    2    4:iload_1         
	//    3    5:istore          5
		if(i != 6)
	//*   4    7:iload_1         
	//*   5    8:bipush          6
	//*   6   10:icmpeq          55
		{
			j = i;
	//    7   13:iload_1         
	//    8   14:istore          5
			switch(i)
	//*   9   16:iload_1         
			{
	//*  10   17:tableswitch     0 4: default 52
	//	               0 55
	//	               1 55
	//	               2 55
	//	               3 55
	//	               4 55
			default:
				j = 0;
	//   11   52:iconst_0        
	//   12   53:istore          5
				break;

			case 0: // '\0'
			case 1: // '\001'
			case 2: // '\002'
			case 3: // '\003'
			case 4: // '\004'
				break;
			}
		}
		a = j;
	//   13   55:aload_0         
	//   14   56:iload           5
	//   15   58:putfield        #27  <Field int a>
		b = athing;
	//   16   61:aload_0         
	//   17   62:aload_2         
	//   18   63:putfield        #29  <Field Thing[] b>
		c = as;
	//   19   66:aload_0         
	//   20   67:aload_3         
	//   21   68:putfield        #31  <Field String[] c>
		d = as1;
	//   22   71:aload_0         
	//   23   72:aload           4
	//   24   74:putfield        #33  <Field String[] d>
	//   25   77:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field int a>
	//    7   11:invokestatic    #43  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable []) (b)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #29  <Field Thing[] b>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #46  <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #31  <Field String[] c>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #49  <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d, false);
	//   21   35:aload_1         
	//   22   36:iconst_5        
	//   23   37:aload_0         
	//   24   38:getfield        #33  <Field String[] d>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #49  <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   27   45:aload_1         
	//   28   46:iload_3         
	//   29   47:invokestatic    #51  <Method void c.a(Parcel, int)>
	//   30   50:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new g();
	private final int a;
	private final Thing b[];
	private final String c[];
	private final String d[];

	static 
	{
	//    0    0:new             #17  <Class g>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void g()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
