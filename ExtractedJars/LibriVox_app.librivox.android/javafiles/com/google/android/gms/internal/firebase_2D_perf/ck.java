// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ew, cl, cm, ex, 
//			ey

public final class ck extends Enum
	implements ew
{

	private ck(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #51  <Method void Enum(String, int)>
		f = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #53  <Field int f>
	//    7   11:return          
	}

	public static ey b()
	{
		return cm.a;
	//    0    0:getstatic       #59  <Field ey cm.a>
	//    1    3:areturn         
	}

	public static ck[] values()
	{
		return (ck[])((ck []) (g)).clone();
	//    0    0:getstatic       #41  <Field ck[] g>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.google.android.gms.internal.firebase_2D_perf.ck_3B_.clone()>
	//    2    6:checkcast       #62  <Class ck[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int f>
	//    2    4:ireturn         
	}

	private static final ck a;
	private static final ck b;
	private static final ck c;
	private static final ck d;
	private static final ex e = new cl();
	private static final ck g[];
	private final int f;

	static 
	{
		a = new ck("SERVICE_WORKER_STATUS_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class ck>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "SERVICE_WORKER_STATUS_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #25  <Method void ck(String, int, int)>
	//    6   11:putstatic       #27  <Field ck a>
		b = new ck("UNSUPPORTED", 1, 1);
	//    7   14:new             #2   <Class ck>
	//    8   17:dup             
	//    9   18:ldc1            #29  <String "UNSUPPORTED">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #25  <Method void ck(String, int, int)>
	//   13   25:putstatic       #31  <Field ck b>
		c = new ck("CONTROLLED", 2, 2);
	//   14   28:new             #2   <Class ck>
	//   15   31:dup             
	//   16   32:ldc1            #33  <String "CONTROLLED">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #25  <Method void ck(String, int, int)>
	//   20   39:putstatic       #35  <Field ck c>
		d = new ck("UNCONTROLLED", 3, 3);
	//   21   42:new             #2   <Class ck>
	//   22   45:dup             
	//   23   46:ldc1            #37  <String "UNCONTROLLED">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #25  <Method void ck(String, int, int)>
	//   27   53:putstatic       #39  <Field ck d>
		g = (new ck[] {
			a, b, c, d
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       ck[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #27  <Field ck a>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #31  <Field ck b>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #35  <Field ck c>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #39  <Field ck d>
	//   45   83:aastore         
	//   46   84:putstatic       #41  <Field ck[] g>
	//   47   87:new             #43  <Class cl>
	//   48   90:dup             
	//   49   91:invokespecial   #45  <Method void cl()>
	//   50   94:putstatic       #47  <Field ex e>
	//*  51   97:return          
	}
}
