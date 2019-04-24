// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxz

public final class zzyl
{

	public static final int zzb(zzxz zzxz1, int i)
	{
		int k = zzxz1.getPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method int zzxz.getPosition()>
	//    2    4:istore_3        
		zzxz1.zzaq(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #63  <Method boolean zzxz.zzaq(int)>
	//    6   10:pop             
		int j;
		for(j = 1; zzxz1.zzuj() == i; j++)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #66  <Method int zzxz.zzuj()>
	//*  11   17:iload_1         
	//*  12   18:icmpne          34
			zzxz1.zzaq(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #63  <Method boolean zzxz.zzaq(int)>
	//   16   26:pop             

	//   17   27:iload_2         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_2        
	//*  21   31:goto            13
		zzxz1.zzt(k, i);
	//   22   34:aload_0         
	//   23   35:iload_3         
	//   24   36:iload_1         
	//   25   37:invokevirtual   #70  <Method void zzxz.zzt(int, int)>
		return j;
	//   26   40:iload_2         
	//   27   41:ireturn         
	}

	public static final int zzcaq[] = new int[0];
	private static final int zzcfg = 11;
	private static final int zzcfh = 12;
	private static final int zzcfi = 16;
	private static final int zzcfj = 26;
	public static final long zzcfk[] = new long[0];
	private static final float zzcfl[] = new float[0];
	private static final double zzcfm[] = new double[0];
	private static final boolean zzcfn[] = new boolean[0];
	public static final String zzcfo[] = new String[0];
	private static final byte zzcfp[][] = new byte[0][];
	public static final byte zzcfq[] = new byte[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #33  <Field int[] zzcaq>
	//    3    6:iconst_0        
	//    4    7:newarray        long[]
	//    5    9:putstatic       #35  <Field long[] zzcfk>
	//    6   12:iconst_0        
	//    7   13:newarray        float[]
	//    8   15:putstatic       #37  <Field float[] zzcfl>
	//    9   18:iconst_0        
	//   10   19:newarray        double[]
	//   11   21:putstatic       #39  <Field double[] zzcfm>
	//   12   24:iconst_0        
	//   13   25:newarray        boolean[]
	//   14   27:putstatic       #41  <Field boolean[] zzcfn>
	//   15   30:iconst_0        
	//   16   31:anewarray       String[]
	//   17   34:putstatic       #45  <Field String[] zzcfo>
	//   18   37:iconst_0        
	//   19   38:anewarray       byte[][]
	//   20   41:putstatic       #48  <Field byte[][] zzcfp>
	//   21   44:iconst_0        
	//   22   45:newarray        byte[]
	//   23   47:putstatic       #50  <Field byte[] zzcfq>
	//*  24   50:return          
	}
}
