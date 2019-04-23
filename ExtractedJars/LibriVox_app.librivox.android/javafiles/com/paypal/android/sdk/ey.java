// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Random;

// Referenced classes of package com.paypal.android.sdk:
//			db, dx

public final class ey extends db
	implements Parcelable
{

	public ey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void db()>
		long l = System.currentTimeMillis();
	//    2    4:invokestatic    #25  <Method long System.currentTimeMillis()>
	//    3    7:lstore_2        
		if(a == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #29  <Field String a>
	//*   6   12:ifnonnull       20
			b = l;
	//    7   15:aload_0         
	//    8   16:lload_2         
	//    9   17:putfield        #33  <Field long b>
		if(b + 0x1b7740L > l)
	//*  10   20:aload_0         
	//*  11   21:getfield        #33  <Field long b>
	//*  12   24:ldc2w           #34  <Long 0x1b7740L>
	//*  13   27:ladd            
	//*  14   28:lload_2         
	//*  15   29:lcmp            
	//*  16   30:ifle            109
		{
			b = l + 0x1b7740L;
	//   17   33:aload_0         
	//   18   34:lload_2         
	//   19   35:ldc2w           #34  <Long 0x1b7740L>
	//   20   38:ladd            
	//   21   39:putfield        #33  <Field long b>
			Random random = new Random(b);
	//   22   42:new             #37  <Class Random>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:getfield        #33  <Field long b>
	//   26   50:invokespecial   #40  <Method void Random(long)>
	//   27   53:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   28   55:new             #42  <Class StringBuilder>
	//   29   58:dup             
	//   30   59:invokespecial   #43  <Method void StringBuilder()>
	//   31   62:astore          5
			for(int i = 0; i < 8; i++)
	//*  32   64:iconst_0        
	//*  33   65:istore_1        
	//*  34   66:iload_1         
	//*  35   67:bipush          8
	//*  36   69:icmpge          100
				stringbuilder.append((char)(Math.abs(random.nextInt()) % 10 + 48));
	//   37   72:aload           5
	//   38   74:aload           4
	//   39   76:invokevirtual   #47  <Method int Random.nextInt()>
	//   40   79:invokestatic    #53  <Method int Math.abs(int)>
	//   41   82:bipush          10
	//   42   84:irem            
	//   43   85:bipush          48
	//   44   87:iadd            
	//   45   88:int2char        
	//   46   89:invokevirtual   #57  <Method StringBuilder StringBuilder.append(char)>
	//   47   92:pop             

	//   48   93:iload_1         
	//   49   94:iconst_1        
	//   50   95:iadd            
	//   51   96:istore_1        
	//*  52   97:goto            66
			a = stringbuilder.toString();
	//   53  100:aload_0         
	//   54  101:aload           5
	//   55  103:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   56  106:putfield        #29  <Field String a>
		}
	//   57  109:return          
	}

	public ey(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void db(Parcel)>
	//    3    5:return          
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field String a>
	//    3    5:invokevirtual   #73  <Method void Parcel.writeString(String)>
		parcel.writeLong(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field long b>
	//    7   13:invokevirtual   #76  <Method void Parcel.writeLong(long)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new dx();

	static 
	{
	//    0    0:new             #12  <Class dx>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void dx()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
