// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbul

public final class zzbuw
{

	public static int zzK(int i, int j)
	{
		return i << 3 | j;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:iload_1         
	//    4    4:ior             
	//    5    5:ireturn         
	}

	public static boolean zzb(zzbul zzbul1, int i)
		throws IOException
	{
		return zzbul1.zzqh(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #54  <Method boolean zzbul.zzqh(int)>
	//    3    5:ireturn         
	}

	public static final int zzc(zzbul zzbul1, int i)
		throws IOException
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		int k = zzbul1.getPosition();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #61  <Method int zzbul.getPosition()>
	//    4    6:istore_3        
		zzbul1.zzqh(i);
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:invokevirtual   #54  <Method boolean zzbul.zzqh(int)>
	//    8   12:pop             
		while(zzbul1.zzacu() == i) 
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #64  <Method int zzbul.zzacu()>
	//*  11   17:iload_1         
	//*  12   18:icmpne          34
		{
			zzbul1.zzqh(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #54  <Method boolean zzbul.zzqh(int)>
	//   16   26:pop             
			j++;
	//   17   27:iload_2         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_2        
		}
	//*  21   31:goto            13
		zzbul1.zzql(k);
	//   22   34:aload_0         
	//   23   35:iload_3         
	//   24   36:invokevirtual   #68  <Method void zzbul.zzql(int)>
		return j;
	//   25   39:iload_2         
	//   26   40:ireturn         
	}

	static int zzqA(int i)
	{
		return i & 7;
	//    0    0:iload_0         
	//    1    1:bipush          7
	//    2    3:iand            
	//    3    4:ireturn         
	}

	public static int zzqB(int i)
	{
		return i >>> 3;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iushr           
	//    3    3:ireturn         
	}

	public static final int zzcsi[] = new int[0];
	public static final long zzcsj[] = new long[0];
	public static final float zzcsk[] = new float[0];
	public static final double zzcsl[] = new double[0];
	public static final boolean zzcsm[] = new boolean[0];
	public static final String zzcsn[] = new String[0];
	public static final byte zzcso[][] = new byte[0][];
	public static final byte zzcsp[] = new byte[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #24  <Field int[] zzcsi>
	//    3    6:iconst_0        
	//    4    7:newarray        long[]
	//    5    9:putstatic       #26  <Field long[] zzcsj>
	//    6   12:iconst_0        
	//    7   13:newarray        float[]
	//    8   15:putstatic       #28  <Field float[] zzcsk>
	//    9   18:iconst_0        
	//   10   19:newarray        double[]
	//   11   21:putstatic       #30  <Field double[] zzcsl>
	//   12   24:iconst_0        
	//   13   25:newarray        boolean[]
	//   14   27:putstatic       #32  <Field boolean[] zzcsm>
	//   15   30:iconst_0        
	//   16   31:anewarray       String[]
	//   17   34:putstatic       #36  <Field String[] zzcsn>
	//   18   37:iconst_0        
	//   19   38:anewarray       byte[][]
	//   20   41:putstatic       #39  <Field byte[][] zzcso>
	//   21   44:iconst_0        
	//   22   45:newarray        byte[]
	//   23   47:putstatic       #41  <Field byte[] zzcsp>
	//*  24   50:return          
	}
}
