// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awg

public final class awt
{

	public static final int a(awg awg1, int i1)
	{
		int k1 = awg1.j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method int awg.j()>
	//    2    4:istore_3        
		awg1.b(i1);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #60  <Method boolean awg.b(int)>
	//    6   10:pop             
		int j1;
		for(j1 = 1; awg1.a() == i1; j1++)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #62  <Method int awg.a()>
	//*  11   17:iload_1         
	//*  12   18:icmpne          34
			awg1.b(i1);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #60  <Method boolean awg.b(int)>
	//   16   26:pop             

	//   17   27:iload_2         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_2        
	//*  21   31:goto            13
		awg1.b(k1, i1);
	//   22   34:aload_0         
	//   23   35:iload_3         
	//   24   36:iload_1         
	//   25   37:invokevirtual   #65  <Method void awg.b(int, int)>
		return j1;
	//   26   40:iload_2         
	//   27   41:ireturn         
	}

	public static final int a[] = new int[0];
	public static final long b[] = new long[0];
	public static final String c[] = new String[0];
	public static final byte d[][] = new byte[0][];
	public static final byte e[] = new byte[0];
	private static final int f = 11;
	private static final int g = 12;
	private static final int h = 16;
	private static final int i = 26;
	private static final float j[] = new float[0];
	private static final double k[] = new double[0];
	private static final boolean l[] = new boolean[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #33  <Field int[] a>
	//    3    6:iconst_0        
	//    4    7:newarray        long[]
	//    5    9:putstatic       #35  <Field long[] b>
	//    6   12:iconst_0        
	//    7   13:newarray        float[]
	//    8   15:putstatic       #37  <Field float[] j>
	//    9   18:iconst_0        
	//   10   19:newarray        double[]
	//   11   21:putstatic       #39  <Field double[] k>
	//   12   24:iconst_0        
	//   13   25:newarray        boolean[]
	//   14   27:putstatic       #41  <Field boolean[] l>
	//   15   30:iconst_0        
	//   16   31:anewarray       String[]
	//   17   34:putstatic       #45  <Field String[] c>
	//   18   37:iconst_0        
	//   19   38:anewarray       byte[][]
	//   20   41:putstatic       #48  <Field byte[][] d>
	//   21   44:iconst_0        
	//   22   45:newarray        byte[]
	//   23   47:putstatic       #50  <Field byte[] e>
	//*  24   50:return          
	}
}
