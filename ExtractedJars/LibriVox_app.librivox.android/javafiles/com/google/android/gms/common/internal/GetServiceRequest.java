// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.*;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.internal:
//			bb, ac, a

public class GetServiceRequest extends AbstractSafeParcelable
{

	public GetServiceRequest(int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		h = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #39  <Field int h>
		j = e.b;
	//    5    9:aload_0         
	//    6   10:getstatic       #43  <Field int e.b>
	//    7   13:putfield        #45  <Field int j>
		i = l;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #47  <Field int i>
		k = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #49  <Field boolean k>
	//   14   26:return          
	}

	GetServiceRequest(int l, int i1, int j1, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
			Account account, Feature afeature[], Feature afeature1[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		h = l;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #39  <Field int h>
		i = i1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #47  <Field int i>
		j = j1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #45  <Field int j>
		if("com.google.android.gms".equals(((Object) (s))))
	//*  11   19:ldc1            #52  <String "com.google.android.gms">
	//*  12   21:aload           4
	//*  13   23:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  14   26:ifeq            38
			a = "com.google.android.gms";
	//   15   29:aload_0         
	//   16   30:ldc1            #52  <String "com.google.android.gms">
	//   17   32:putfield        #60  <Field String a>
		else
	//*  18   35:goto            44
			a = s;
	//   19   38:aload_0         
	//   20   39:aload           4
	//   21   41:putfield        #60  <Field String a>
		if(l < 2)
	//*  22   44:iload_1         
	//*  23   45:iconst_2        
	//*  24   46:icmpge          76
		{
			s = null;
	//   25   49:aconst_null     
	//   26   50:astore          4
			if(ibinder != null)
	//*  27   52:aload           5
	//*  28   54:ifnull          67
				s = ((String) (com.google.android.gms.common.internal.a.a(ac.a(ibinder))));
	//   29   57:aload           5
	//   30   59:invokestatic    #65  <Method ab ac.a(IBinder)>
	//   31   62:invokestatic    #70  <Method Account a.a(ab)>
	//   32   65:astore          4
			e = ((Account) (s));
	//   33   67:aload_0         
	//   34   68:aload           4
	//   35   70:putfield        #72  <Field Account e>
		} else
	//*  36   73:goto            88
		{
			b = ibinder;
	//   37   76:aload_0         
	//   38   77:aload           5
	//   39   79:putfield        #74  <Field IBinder b>
			e = account;
	//   40   82:aload_0         
	//   41   83:aload           8
	//   42   85:putfield        #72  <Field Account e>
		}
		c = ascope;
	//   43   88:aload_0         
	//   44   89:aload           6
	//   45   91:putfield        #76  <Field Scope[] c>
		d = bundle;
	//   46   94:aload_0         
	//   47   95:aload           7
	//   48   97:putfield        #78  <Field Bundle d>
		f = afeature;
	//   49  100:aload_0         
	//   50  101:aload           9
	//   51  103:putfield        #80  <Field Feature[] f>
		g = afeature1;
	//   52  106:aload_0         
	//   53  107:aload           10
	//   54  109:putfield        #82  <Field Feature[] g>
		k = flag;
	//   55  112:aload_0         
	//   56  113:iload           11
	//   57  115:putfield        #49  <Field boolean k>
	//   58  118:return          
	}

	public void writeToParcel(Parcel parcel, int l)
	{
		int i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #89  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, h);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field int h>
	//    7   11:invokestatic    #92  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, i);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #47  <Field int i>
	//   12   20:invokestatic    #92  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, j);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #45  <Field int j>
	//   17   29:invokestatic    #92  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, a, false);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #60  <Field String a>
	//   22   38:iconst_0        
	//   23   39:invokestatic    #95  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, b, false);
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:getfield        #74  <Field IBinder b>
	//   28   48:iconst_0        
	//   29   49:invokestatic    #98  <Method void c.a(Parcel, int, IBinder, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, ((android.os.Parcelable []) (c)), l, false);
	//   30   52:aload_1         
	//   31   53:bipush          6
	//   32   55:aload_0         
	//   33   56:getfield        #76  <Field Scope[] c>
	//   34   59:iload_2         
	//   35   60:iconst_0        
	//   36   61:invokestatic    #101 <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, d, false);
	//   37   64:aload_1         
	//   38   65:bipush          7
	//   39   67:aload_0         
	//   40   68:getfield        #78  <Field Bundle d>
	//   41   71:iconst_0        
	//   42   72:invokestatic    #104 <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, ((android.os.Parcelable) (e)), l, false);
	//   43   75:aload_1         
	//   44   76:bipush          8
	//   45   78:aload_0         
	//   46   79:getfield        #72  <Field Account e>
	//   47   82:iload_2         
	//   48   83:iconst_0        
	//   49   84:invokestatic    #107 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, ((android.os.Parcelable []) (f)), l, false);
	//   50   87:aload_1         
	//   51   88:bipush          10
	//   52   90:aload_0         
	//   53   91:getfield        #80  <Field Feature[] f>
	//   54   94:iload_2         
	//   55   95:iconst_0        
	//   56   96:invokestatic    #101 <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, ((android.os.Parcelable []) (g)), l, false);
	//   57   99:aload_1         
	//   58  100:bipush          11
	//   59  102:aload_0         
	//   60  103:getfield        #82  <Field Feature[] g>
	//   61  106:iload_2         
	//   62  107:iconst_0        
	//   63  108:invokestatic    #101 <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, k);
	//   64  111:aload_1         
	//   65  112:bipush          12
	//   66  114:aload_0         
	//   67  115:getfield        #49  <Field boolean k>
	//   68  118:invokestatic    #110 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   69  121:aload_1         
	//   70  122:iload_3         
	//   71  123:invokestatic    #112 <Method void c.a(Parcel, int)>
	//   72  126:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bb();
	String a;
	IBinder b;
	Scope c[];
	Bundle d;
	Account e;
	Feature f[];
	Feature g[];
	private final int h;
	private final int i;
	private int j;
	private boolean k;

	static 
	{
	//    0    0:new             #29  <Class bb>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void bb()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
