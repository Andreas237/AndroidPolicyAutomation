// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjk

public final class zzjw
{

	public static final int zzb(zzjk zzjk1, int i)
		throws IOException
	{
		int k = zzjk1.getPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method int zzjk.getPosition()>
	//    2    4:istore_3        
		zzjk1.zzal(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #65  <Method boolean zzjk.zzal(int)>
	//    6   10:pop             
		int j;
		for(j = 1; zzjk1.zzdq() == i; j++)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #68  <Method int zzjk.zzdq()>
	//*  11   17:iload_1         
	//*  12   18:icmpne          34
			zzjk1.zzal(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #65  <Method boolean zzjk.zzal(int)>
	//   16   26:pop             

	//   17   27:iload_2         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_2        
	//*  21   31:goto            13
		zzjk1.zzw(k, i);
	//   22   34:aload_0         
	//   23   35:iload_3         
	//   24   36:iload_1         
	//   25   37:invokevirtual   #72  <Method void zzjk.zzw(int, int)>
		return j;
	//   26   40:iload_2         
	//   27   41:ireturn         
	}

	private static final int zzadq = 11;
	private static final int zzadr = 12;
	private static final int zzads = 16;
	private static final int zzadt = 26;
	private static final long zzadu[] = new long[0];
	private static final float zzadv[] = new float[0];
	private static final double zzadw[] = new double[0];
	private static final boolean zzadx[] = new boolean[0];
	public static final String zzady[] = new String[0];
	private static final byte zzadz[][] = new byte[0][];
	public static final byte zzaea[] = new byte[0];
	public static final int zzzb[] = new int[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #33  <Field int[] zzzb>
	//    3    6:iconst_0        
	//    4    7:newarray        long[]
	//    5    9:putstatic       #35  <Field long[] zzadu>
	//    6   12:iconst_0        
	//    7   13:newarray        float[]
	//    8   15:putstatic       #37  <Field float[] zzadv>
	//    9   18:iconst_0        
	//   10   19:newarray        double[]
	//   11   21:putstatic       #39  <Field double[] zzadw>
	//   12   24:iconst_0        
	//   13   25:newarray        boolean[]
	//   14   27:putstatic       #41  <Field boolean[] zzadx>
	//   15   30:iconst_0        
	//   16   31:anewarray       String[]
	//   17   34:putstatic       #45  <Field String[] zzady>
	//   18   37:iconst_0        
	//   19   38:anewarray       byte[][]
	//   20   41:putstatic       #48  <Field byte[][] zzadz>
	//   21   44:iconst_0        
	//   22   45:newarray        byte[]
	//   23   47:putstatic       #50  <Field byte[] zzaea>
	//*  24   50:return          
	}
}
