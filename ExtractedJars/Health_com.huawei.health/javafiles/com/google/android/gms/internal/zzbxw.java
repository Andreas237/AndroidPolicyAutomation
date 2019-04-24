// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxl

public final class zzbxw
{

	public static int zzO(int i, int j)
	{
		return i << 3 | j;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:iload_1         
	//    4    4:ior             
	//    5    5:ireturn         
	}

	public static final int zzb(zzbxl zzbxl1, int i)
		throws IOException
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		int k = zzbxl1.getPosition();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #69  <Method int zzbxl.getPosition()>
	//    4    6:istore_3        
		zzbxl1.zzqY(i);
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:invokevirtual   #73  <Method boolean zzbxl.zzqY(int)>
	//    8   12:pop             
		while(zzbxl1.zzaeo() == i) 
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #76  <Method int zzbxl.zzaeo()>
	//*  11   17:iload_1         
	//*  12   18:icmpne          34
		{
			zzbxl1.zzqY(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #73  <Method boolean zzbxl.zzqY(int)>
	//   16   26:pop             
			j++;
	//   17   27:iload_2         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_2        
		}
	//*  21   31:goto            13
		zzbxl1.zzrc(k);
	//   22   34:aload_0         
	//   23   35:iload_3         
	//   24   36:invokevirtual   #80  <Method void zzbxl.zzrc(int)>
		return j;
	//   25   39:iload_2         
	//   26   40:ireturn         
	}

	static int zzrr(int i)
	{
		return i & 7;
	//    0    0:iload_0         
	//    1    1:bipush          7
	//    2    3:iand            
	//    3    4:ireturn         
	}

	public static int zzrs(int i)
	{
		return i >>> 3;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iushr           
	//    3    3:ireturn         
	}

	static final int zzcuS = zzO(1, 3);
	static final int zzcuT = zzO(1, 4);
	static final int zzcuU = zzO(2, 0);
	static final int zzcuV = zzO(3, 2);
	public static final int zzcuW[] = new int[0];
	public static final long zzcuX[] = new long[0];
	public static final float zzcuY[] = new float[0];
	public static final double zzcuZ[] = new double[0];
	public static final boolean zzcva[] = new boolean[0];
	public static final String zzcvb[] = new String[0];
	public static final byte zzcvc[][] = new byte[0][];
	public static final byte zzcvd[] = new byte[0];

	static 
	{
	//    0    0:iconst_1        
	//    1    1:iconst_3        
	//    2    2:invokestatic    #31  <Method int zzO(int, int)>
	//    3    5:putstatic       #33  <Field int zzcuS>
	//    4    8:iconst_1        
	//    5    9:iconst_4        
	//    6   10:invokestatic    #31  <Method int zzO(int, int)>
	//    7   13:putstatic       #35  <Field int zzcuT>
	//    8   16:iconst_2        
	//    9   17:iconst_0        
	//   10   18:invokestatic    #31  <Method int zzO(int, int)>
	//   11   21:putstatic       #37  <Field int zzcuU>
	//   12   24:iconst_3        
	//   13   25:iconst_2        
	//   14   26:invokestatic    #31  <Method int zzO(int, int)>
	//   15   29:putstatic       #39  <Field int zzcuV>
	//   16   32:iconst_0        
	//   17   33:newarray        int[]
	//   18   35:putstatic       #41  <Field int[] zzcuW>
	//   19   38:iconst_0        
	//   20   39:newarray        long[]
	//   21   41:putstatic       #43  <Field long[] zzcuX>
	//   22   44:iconst_0        
	//   23   45:newarray        float[]
	//   24   47:putstatic       #45  <Field float[] zzcuY>
	//   25   50:iconst_0        
	//   26   51:newarray        double[]
	//   27   53:putstatic       #47  <Field double[] zzcuZ>
	//   28   56:iconst_0        
	//   29   57:newarray        boolean[]
	//   30   59:putstatic       #49  <Field boolean[] zzcva>
	//   31   62:iconst_0        
	//   32   63:anewarray       String[]
	//   33   66:putstatic       #53  <Field String[] zzcvb>
	//   34   69:iconst_0        
	//   35   70:anewarray       byte[][]
	//   36   73:putstatic       #56  <Field byte[][] zzcvc>
	//   37   76:iconst_0        
	//   38   77:newarray        byte[]
	//   39   79:putstatic       #58  <Field byte[] zzcvd>
	//*  40   82:return          
	}
}
