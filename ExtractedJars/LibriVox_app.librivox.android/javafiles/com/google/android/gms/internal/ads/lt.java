// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.ads.b;
import com.google.ads.c;
import com.google.ads.mediation.g;
import java.util.Date;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal.ads:
//			lu, zzwb

public final class lt
{

	public static int a(b b1)
	{
		switch(lu.a[b1.ordinal()])
	//*   0    0:getstatic       #12  <Field int[] lu.a>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #18  <Method int b.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     2 4: default 36
	//	               2 42
	//	               3 40
	//	               4 38
		default:
			return 0;
	//    5   36:iconst_0        
	//    6   37:ireturn         

		case 4: // '\004'
			return 3;
	//    7   38:iconst_3        
	//    8   39:ireturn         

		case 3: // '\003'
			return 2;
	//    9   40:iconst_2        
	//   10   41:ireturn         

		case 2: // '\002'
			return 1;
	//   11   42:iconst_1        
	//   12   43:ireturn         
		}
	}

	public static g a(zzwb zzwb1, boolean flag)
	{
		HashSet hashset;
		if(zzwb1.e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field java.util.List zzwb.e>
	//*   2    4:ifnull          22
			hashset = new HashSet(((java.util.Collection) (zzwb1.e)));
	//    3    7:new             #28  <Class HashSet>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field java.util.List zzwb.e>
	//    7   15:invokespecial   #32  <Method void HashSet(java.util.Collection)>
	//    8   18:astore_3        
		else
	//*   9   19:goto            24
			hashset = null;
	//   10   22:aconst_null     
	//   11   23:astore_3        
		Date date = new Date(zzwb1.b);
	//   12   24:new             #34  <Class Date>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #38  <Field long com.google.android.gms.internal.ads.zzwb.b>
	//   16   32:invokespecial   #41  <Method void Date(long)>
	//   17   35:astore          4
		c c1;
		switch(zzwb1.d)
	//*  18   37:aload_0         
	//*  19   38:getfield        #45  <Field int zzwb.d>
		{
	//*  20   41:tableswitch     1 2: default 64
	//	               1 78
	//	               2 71
		default:
			c1 = c.a;
	//   21   64:getstatic       #50  <Field c c.a>
	//   22   67:astore_2        
			break;

	//*  23   68:goto            82
		case 2: // '\002'
			c1 = c.c;
	//   24   71:getstatic       #53  <Field c c.c>
	//   25   74:astore_2        
			break;

	//*  26   75:goto            82
		case 1: // '\001'
			c1 = c.b;
	//   27   78:getstatic       #55  <Field c c.b>
	//   28   81:astore_2        
			break;
		}
		return new g(date, c1, ((java.util.Set) (hashset)), flag, zzwb1.k);
	//   29   82:new             #57  <Class g>
	//   30   85:dup             
	//   31   86:aload           4
	//   32   88:aload_2         
	//   33   89:aload_3         
	//   34   90:iload_1         
	//   35   91:aload_0         
	//   36   92:getfield        #61  <Field android.location.Location zzwb.k>
	//   37   95:invokespecial   #64  <Method void g(Date, c, java.util.Set, boolean, android.location.Location)>
	//   38   98:areturn         
	}
}
