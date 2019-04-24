// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ce

public static final class ce$a extends Enum
{

	public static ce$a valueOf(String s)
	{
		return (ce$a)Enum.valueOf(com/amap/api/mapcore/util/ce$a, s);
	//    0    0:ldc1            #2   <Class ce$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #58  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ce$a>
	//    4    9:areturn         
	}

	public static ce$a[] values()
	{
		return (ce$a[])((ce$a []) (g)).clone();
	//    0    0:getstatic       #45  <Field ce$a[] g>
	//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.amap.api.mapcore.util.ce$a_3B_.clone()>
	//    2    6:checkcast       #61  <Class ce$a[]>
	//    3    9:areturn         
	}

	public static final ce$a a;
	public static final ce$a b;
	public static final ce$a c;
	public static final ce$a d;
	public static final ce$a e;
	private static final ce$a g[];
	private int f;

	static 
	{
		a = new ce$a("amap_exception", 0, -1);
	//    0    0:new             #2   <Class ce$a>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "amap_exception">
	//    3    6:iconst_0        
	//    4    7:iconst_m1       
	//    5    8:invokespecial   #25  <Method void ce$a(String, int, int)>
	//    6   11:putstatic       #27  <Field ce$a a>
		b = new ce$a("network_exception", 1, -1);
	//    7   14:new             #2   <Class ce$a>
	//    8   17:dup             
	//    9   18:ldc1            #29  <String "network_exception">
	//   10   20:iconst_1        
	//   11   21:iconst_m1       
	//   12   22:invokespecial   #25  <Method void ce$a(String, int, int)>
	//   13   25:putstatic       #31  <Field ce$a b>
		c = new ce$a("file_io_exception", 2, 0);
	//   14   28:new             #2   <Class ce$a>
	//   15   31:dup             
	//   16   32:ldc1            #33  <String "file_io_exception">
	//   17   34:iconst_2        
	//   18   35:iconst_0        
	//   19   36:invokespecial   #25  <Method void ce$a(String, int, int)>
	//   20   39:putstatic       #35  <Field ce$a c>
		d = new ce$a("success_no_exception", 3, 1);
	//   21   42:new             #2   <Class ce$a>
	//   22   45:dup             
	//   23   46:ldc1            #37  <String "success_no_exception">
	//   24   48:iconst_3        
	//   25   49:iconst_1        
	//   26   50:invokespecial   #25  <Method void ce$a(String, int, int)>
	//   27   53:putstatic       #39  <Field ce$a d>
		e = new ce$a("cancel_no_exception", 4, 2);
	//   28   56:new             #2   <Class ce$a>
	//   29   59:dup             
	//   30   60:ldc1            #41  <String "cancel_no_exception">
	//   31   62:iconst_4        
	//   32   63:iconst_2        
	//   33   64:invokespecial   #25  <Method void ce$a(String, int, int)>
	//   34   67:putstatic       #43  <Field ce$a e>
		g = (new ce$a[] {
			a, b, c, d, e
		});
	//   35   70:iconst_5        
	//   36   71:anewarray       ce$a[]
	//   37   74:dup             
	//   38   75:iconst_0        
	//   39   76:getstatic       #27  <Field ce$a a>
	//   40   79:aastore         
	//   41   80:dup             
	//   42   81:iconst_1        
	//   43   82:getstatic       #31  <Field ce$a b>
	//   44   85:aastore         
	//   45   86:dup             
	//   46   87:iconst_2        
	//   47   88:getstatic       #35  <Field ce$a c>
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_3        
	//   51   94:getstatic       #39  <Field ce$a d>
	//   52   97:aastore         
	//   53   98:dup             
	//   54   99:iconst_4        
	//   55  100:getstatic       #43  <Field ce$a e>
	//   56  103:aastore         
	//   57  104:putstatic       #45  <Field ce$a[] g>
	//*  58  107:return          
	}

	private ce$a(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		f = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #51  <Field int f>
	//    7   11:return          
	}
}
