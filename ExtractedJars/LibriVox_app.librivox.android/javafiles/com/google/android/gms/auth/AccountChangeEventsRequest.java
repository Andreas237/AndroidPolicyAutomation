// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth:
//			b

public class AccountChangeEventsRequest extends AbstractSafeParcelable
{

	public AccountChangeEventsRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #27  <Field int a>
	//    5    9:return          
	}

	AccountChangeEventsRequest(int i, int j, String s, Account account)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field int b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field String c>
		if(account == null && !TextUtils.isEmpty(((CharSequence) (s))))
	//*  11   19:aload           4
	//*  12   21:ifnonnull       46
	//*  13   24:aload_3         
	//*  14   25:invokestatic    #38  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   28:ifne            46
		{
			d = new Account(s, "com.google");
	//   16   31:aload_0         
	//   17   32:new             #40  <Class Account>
	//   18   35:dup             
	//   19   36:aload_3         
	//   20   37:ldc1            #42  <String "com.google">
	//   21   39:invokespecial   #45  <Method void Account(String, String)>
	//   22   42:putfield        #47  <Field Account d>
			return;
	//   23   45:return          
		} else
		{
			d = account;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #47  <Field Account d>
			return;
	//   27   52:return          
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #54  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field int a>
	//    7   11:invokestatic    #57  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #30  <Field int b>
	//   12   20:invokestatic    #57  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #32  <Field String c>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #60  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ((android.os.Parcelable) (d)), i, false);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #47  <Field Account d>
	//   23   39:iload_2         
	//   24   40:iconst_0        
	//   25   41:invokestatic    #63  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   26   44:aload_1         
	//   27   45:iload_3         
	//   28   46:invokestatic    #65  <Method void c.a(Parcel, int)>
	//   29   49:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new b();
	private final int a;
	private int b;
	private String c;
	private Account d;

	static 
	{
	//    0    0:new             #18  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void b()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
