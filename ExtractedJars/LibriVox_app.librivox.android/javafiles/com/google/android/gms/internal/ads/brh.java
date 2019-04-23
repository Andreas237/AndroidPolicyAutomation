// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqv, brg

public final class brh
	implements Comparator
{

	public brh(brg brg)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((bqv)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #16  <Class bqv>
	//    2    4:astore_1        
		obj1 = ((Object) ((bqv)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #16  <Class bqv>
	//    5    9:astore_2        
		if(((bqv) (obj)).b() < ((bqv) (obj1)).b())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #20  <Method float bqv.b()>
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #20  <Method float bqv.b()>
	//*  10   18:fcmpg           
	//*  11   19:ifge            24
			return -1;
	//   12   22:iconst_m1       
	//   13   23:ireturn         
		if(((bqv) (obj)).b() > ((bqv) (obj1)).b())
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #20  <Method float bqv.b()>
	//*  16   28:aload_2         
	//*  17   29:invokevirtual   #20  <Method float bqv.b()>
	//*  18   32:fcmpl           
	//*  19   33:ifle            38
			return 1;
	//   20   36:iconst_1        
	//   21   37:ireturn         
		if(((bqv) (obj)).a() < ((bqv) (obj1)).a())
	//*  22   38:aload_1         
	//*  23   39:invokevirtual   #23  <Method float bqv.a()>
	//*  24   42:aload_2         
	//*  25   43:invokevirtual   #23  <Method float bqv.a()>
	//*  26   46:fcmpg           
	//*  27   47:ifge            52
			return -1;
	//   28   50:iconst_m1       
	//   29   51:ireturn         
		if(((bqv) (obj)).a() > ((bqv) (obj1)).a())
	//*  30   52:aload_1         
	//*  31   53:invokevirtual   #23  <Method float bqv.a()>
	//*  32   56:aload_2         
	//*  33   57:invokevirtual   #23  <Method float bqv.a()>
	//*  34   60:fcmpl           
	//*  35   61:ifle            66
			return 1;
	//   36   64:iconst_1        
	//   37   65:ireturn         
		float f = (((bqv) (obj)).d() - ((bqv) (obj)).b()) * (((bqv) (obj)).c() - ((bqv) (obj)).a());
	//   38   66:aload_1         
	//   39   67:invokevirtual   #26  <Method float bqv.d()>
	//   40   70:aload_1         
	//   41   71:invokevirtual   #20  <Method float bqv.b()>
	//   42   74:fsub            
	//   43   75:aload_1         
	//   44   76:invokevirtual   #29  <Method float bqv.c()>
	//   45   79:aload_1         
	//   46   80:invokevirtual   #23  <Method float bqv.a()>
	//   47   83:fsub            
	//   48   84:fmul            
	//   49   85:fstore_3        
		float f1 = (((bqv) (obj1)).d() - ((bqv) (obj1)).b()) * (((bqv) (obj1)).c() - ((bqv) (obj1)).a());
	//   50   86:aload_2         
	//   51   87:invokevirtual   #26  <Method float bqv.d()>
	//   52   90:aload_2         
	//   53   91:invokevirtual   #20  <Method float bqv.b()>
	//   54   94:fsub            
	//   55   95:aload_2         
	//   56   96:invokevirtual   #29  <Method float bqv.c()>
	//   57   99:aload_2         
	//   58  100:invokevirtual   #23  <Method float bqv.a()>
	//   59  103:fsub            
	//   60  104:fmul            
	//   61  105:fstore          4
		if(f > f1)
	//*  62  107:fload_3         
	//*  63  108:fload           4
	//*  64  110:fcmpl           
	//*  65  111:ifle            116
			return -1;
	//   66  114:iconst_m1       
	//   67  115:ireturn         
		return f >= f1 ? 0 : 1;
	//   68  116:fload_3         
	//   69  117:fload           4
	//   70  119:fcmpg           
	//   71  120:ifge            125
	//   72  123:iconst_1        
	//   73  124:ireturn         
	//   74  125:iconst_0        
	//   75  126:ireturn         
	}
}
