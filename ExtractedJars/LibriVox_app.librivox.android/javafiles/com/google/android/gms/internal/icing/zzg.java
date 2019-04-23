// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Arrays;
import java.util.BitSet;

// Referenced classes of package com.google.android.gms.internal.icing:
//			fg, fl, zzl

public final class zzg extends AbstractSafeParcelable
{

	transient zzg(String s, boolean flag, Account account, zzl azzl[])
	{
		this(azzl, s, flag, account);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:aload_3         
	//    5    6:invokespecial   #28  <Method void zzg(zzl[], String, boolean, Account)>
		if(azzl != null)
	//*   6    9:aload           4
	//*   7   11:ifnull          122
		{
			s = ((String) (new BitSet(fl.a.length)));
	//    8   14:new             #30  <Class BitSet>
	//    9   17:dup             
	//   10   18:getstatic       #35  <Field String[] fl.a>
	//   11   21:arraylength     
	//   12   22:invokespecial   #38  <Method void BitSet(int)>
	//   13   25:astore_1        
			for(int i = 0; i < azzl.length; i++)
	//*  14   26:iconst_0        
	//*  15   27:istore          5
	//*  16   29:iload           5
	//*  17   31:aload           4
	//*  18   33:arraylength     
	//*  19   34:icmpge          122
			{
				int j = azzl[i].a;
	//   20   37:aload           4
	//   21   39:iload           5
	//   22   41:aaload          
	//   23   42:getfield        #43  <Field int zzl.a>
	//   24   45:istore          6
				if(j == -1)
					continue;
	//   25   47:iload           6
	//   26   49:iconst_m1       
	//   27   50:icmpeq          113
				if(((BitSet) (s)).get(j))
	//*  28   53:aload_1         
	//*  29   54:iload           6
	//*  30   56:invokevirtual   #47  <Method boolean BitSet.get(int)>
	//*  31   59:ifeq            107
				{
					s = String.valueOf(((Object) (fl.a(j))));
	//   32   62:iload           6
	//   33   64:invokestatic    #50  <Method String fl.a(int)>
	//   34   67:invokestatic    #56  <Method String String.valueOf(Object)>
	//   35   70:astore_1        
					if(s.length() != 0)
	//*  36   71:aload_1         
	//*  37   72:invokevirtual   #60  <Method int String.length()>
	//*  38   75:ifeq            88
						s = "Duplicate global search section type ".concat(s);
	//   39   78:ldc1            #62  <String "Duplicate global search section type ">
	//   40   80:aload_1         
	//   41   81:invokevirtual   #66  <Method String String.concat(String)>
	//   42   84:astore_1        
					else
	//*  43   85:goto            98
						s = new String("Duplicate global search section type ");
	//   44   88:new             #52  <Class String>
	//   45   91:dup             
	//   46   92:ldc1            #62  <String "Duplicate global search section type ">
	//   47   94:invokespecial   #69  <Method void String(String)>
	//   48   97:astore_1        
					throw new IllegalArgumentException(s);
	//   49   98:new             #71  <Class IllegalArgumentException>
	//   50  101:dup             
	//   51  102:aload_1         
	//   52  103:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//   53  106:athrow          
				}
				((BitSet) (s)).set(j);
	//   54  107:aload_1         
	//   55  108:iload           6
	//   56  110:invokevirtual   #75  <Method void BitSet.set(int)>
			}

	//   57  113:iload           5
	//   58  115:iconst_1        
	//   59  116:iadd            
	//   60  117:istore          5
		}
	//*  61  119:goto            29
	//   62  122:return          
	}

	zzg(zzl azzl[], String s, boolean flag, Account account)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void AbstractSafeParcelable()>
		a = azzl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #78  <Field zzl[] a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #80  <Field String b>
		c = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #82  <Field boolean c>
		d = account;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #84  <Field Account d>
	//   14   25:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj instanceof zzg)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zzg>
	//*   2    4:ifeq            78
		{
			obj = ((Object) ((zzg)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class zzg>
	//    5   11:astore_1        
			return ak.a(((Object) (b)), ((Object) (((zzg) (obj)).b))) && ak.a(((Object) (Boolean.valueOf(c))), ((Object) (Boolean.valueOf(((zzg) (obj)).c)))) && ak.a(((Object) (d)), ((Object) (((zzg) (obj)).d))) && Arrays.equals(((Object []) (a)), ((Object []) (((zzg) (obj)).a)));
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field String b>
	//    8   16:aload_1         
	//    9   17:getfield        #80  <Field String b>
	//   10   20:invokestatic    #91  <Method boolean ak.a(Object, Object)>
	//   11   23:ifeq            76
	//   12   26:aload_0         
	//   13   27:getfield        #82  <Field boolean c>
	//   14   30:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//   15   33:aload_1         
	//   16   34:getfield        #82  <Field boolean c>
	//   17   37:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//   18   40:invokestatic    #91  <Method boolean ak.a(Object, Object)>
	//   19   43:ifeq            76
	//   20   46:aload_0         
	//   21   47:getfield        #84  <Field Account d>
	//   22   50:aload_1         
	//   23   51:getfield        #84  <Field Account d>
	//   24   54:invokestatic    #91  <Method boolean ak.a(Object, Object)>
	//   25   57:ifeq            76
	//   26   60:aload_0         
	//   27   61:getfield        #78  <Field zzl[] a>
	//   28   64:aload_1         
	//   29   65:getfield        #78  <Field zzl[] a>
	//   30   68:invokestatic    #101 <Method boolean Arrays.equals(Object[], Object[])>
	//   31   71:ifeq            76
	//   32   74:iconst_1        
	//   33   75:ireturn         
	//   34   76:iconst_0        
	//   35   77:ireturn         
		} else
		{
			return false;
	//   36   78:iconst_0        
	//   37   79:ireturn         
		}
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			b, Boolean.valueOf(c), d, Integer.valueOf(Arrays.hashCode(((Object []) (a))))
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #80  <Field String b>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #82  <Field boolean c>
	//   11   17:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #84  <Field Account d>
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_3        
	//   20   30:aload_0         
	//   21   31:getfield        #78  <Field zzl[] a>
	//   22   34:invokestatic    #107 <Method int Arrays.hashCode(Object[])>
	//   23   37:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   24   40:aastore         
	//   25   41:invokestatic    #114 <Method int ak.a(Object[])>
	//   26   44:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #121 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, ((android.os.Parcelable []) (a)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #78  <Field zzl[] a>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #124 <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//   10   16:aload_1         
	//   11   17:iconst_2        
	//   12   18:aload_0         
	//   13   19:getfield        #80  <Field String b>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #127 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
	//   16   26:aload_1         
	//   17   27:iconst_3        
	//   18   28:aload_0         
	//   19   29:getfield        #82  <Field boolean c>
	//   20   32:invokestatic    #130 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ((android.os.Parcelable) (d)), i, false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:getfield        #84  <Field Account d>
	//   25   41:iload_2         
	//   26   42:iconst_0        
	//   27   43:invokestatic    #133 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   28   46:aload_1         
	//   29   47:iload_3         
	//   30   48:invokestatic    #135 <Method void c.a(Parcel, int)>
	//   31   51:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new fg();
	private final zzl a[];
	private final String b;
	private final boolean c;
	private final Account d;

	static 
	{
	//    0    0:new             #18  <Class fg>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void fg()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
