// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzals, zzalr, zzalq

public final class zzalp
{

	private zzalp(zzals zzals1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		int i = zzals.zza(zzals1).size();
	//    2    4:aload_1         
	//    3    5:invokestatic    #25  <Method List zzals.zza(zzals)>
	//    4    8:invokeinterface #31  <Method int List.size()>
	//    5   13:istore_2        
		zzcsu = (String[])zzals.zzb(zzals1).toArray(((Object []) (new String[i])));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method List zzals.zzb(zzals)>
	//    9   19:iload_2         
	//   10   20:anewarray       String[]
	//   11   23:invokeinterface #40  <Method Object[] List.toArray(Object[])>
	//   12   28:checkcast       #41  <Class String[]>
	//   13   31:putfield        #43  <Field String[] zzcsu>
		zzcsv = zzo(zzals.zza(zzals1));
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokestatic    #25  <Method List zzals.zza(zzals)>
	//   17   39:invokestatic    #47  <Method double[] zzo(List)>
	//   18   42:putfield        #49  <Field double[] zzcsv>
		zzcsw = zzo(zzals.zzc(zzals1));
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:invokestatic    #52  <Method List zzals.zzc(zzals)>
	//   22   50:invokestatic    #47  <Method double[] zzo(List)>
	//   23   53:putfield        #54  <Field double[] zzcsw>
		zzcsx = new int[i];
	//   24   56:aload_0         
	//   25   57:iload_2         
	//   26   58:newarray        int[]
	//   27   60:putfield        #56  <Field int[] zzcsx>
		zzcsy = 0;
	//   28   63:aload_0         
	//   29   64:iconst_0        
	//   30   65:putfield        #58  <Field int zzcsy>
	//   31   68:return          
	}

	zzalp(zzals zzals1, zzalq zzalq)
	{
		this(zzals1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method void zzalp(zzals)>
	//    3    5:return          
	}

	private static double[] zzo(List list)
	{
		double ad[] = new double[list.size()];
	//    0    0:aload_0         
	//    1    1:invokeinterface #31  <Method int List.size()>
	//    2    6:newarray        double[]
	//    3    8:astore_2        
		for(int i = 0; i < ad.length; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_1        
	//*   6   11:iload_1         
	//*   7   12:aload_2         
	//*   8   13:arraylength     
	//*   9   14:icmpge          40
			ad[i] = ((Double)list.get(i)).doubleValue();
	//   10   17:aload_2         
	//   11   18:iload_1         
	//   12   19:aload_0         
	//   13   20:iload_1         
	//   14   21:invokeinterface #66  <Method Object List.get(int)>
	//   15   26:checkcast       #68  <Class Double>
	//   16   29:invokevirtual   #72  <Method double Double.doubleValue()>
	//   17   32:dastore         

	//   18   33:iload_1         
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:istore_1        
	//*  22   37:goto            11
		return ad;
	//   23   40:aload_2         
	//   24   41:areturn         
	}

	public final void zza(double d)
	{
		zzcsy = zzcsy + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field int zzcsy>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #58  <Field int zzcsy>
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		do
		{
			if(i >= zzcsw.length)
				break;
	//    8   12:iload_3         
	//    9   13:aload_0         
	//   10   14:getfield        #54  <Field double[] zzcsw>
	//   11   17:arraylength     
	//   12   18:icmpge          77
			if(zzcsw[i] <= d && d < zzcsv[i])
	//*  13   21:aload_0         
	//*  14   22:getfield        #54  <Field double[] zzcsw>
	//*  15   25:iload_3         
	//*  16   26:daload          
	//*  17   27:dload_1         
	//*  18   28:dcmpg           
	//*  19   29:ifgt            59
	//*  20   32:dload_1         
	//*  21   33:aload_0         
	//*  22   34:getfield        #49  <Field double[] zzcsv>
	//*  23   37:iload_3         
	//*  24   38:daload          
	//*  25   39:dcmpg           
	//*  26   40:ifge            59
			{
				int ai[] = zzcsx;
	//   27   43:aload_0         
	//   28   44:getfield        #56  <Field int[] zzcsx>
	//   29   47:astore          4
				ai[i] = ai[i] + 1;
	//   30   49:aload           4
	//   31   51:iload_3         
	//   32   52:aload           4
	//   33   54:iload_3         
	//   34   55:iaload          
	//   35   56:iconst_1        
	//   36   57:iadd            
	//   37   58:iastore         
			}
			if(d < zzcsw[i])
				break;
	//   38   59:dload_1         
	//   39   60:aload_0         
	//   40   61:getfield        #54  <Field double[] zzcsw>
	//   41   64:iload_3         
	//   42   65:daload          
	//   43   66:dcmpg           
	//   44   67:iflt            77
			i++;
	//   45   70:iload_3         
	//   46   71:iconst_1        
	//   47   72:iadd            
	//   48   73:istore_3        
		} while(true);
	//   49   74:goto            12
	//   50   77:return          
	}

	public final List zzry()
	{
		String as[] = zzcsu;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String[] zzcsu>
	//    2    4:astore_2        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		ArrayList arraylist = new ArrayList(as.length);
	//    5    7:new             #79  <Class ArrayList>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:arraylength     
	//    9   13:invokespecial   #82  <Method void ArrayList(int)>
	//   10   16:astore_2        
		for(; i < zzcsu.length; i++)
	//*  11   17:iload_1         
	//*  12   18:aload_0         
	//*  13   19:getfield        #43  <Field String[] zzcsu>
	//*  14   22:arraylength     
	//*  15   23:icmpge          84
			((List) (arraylist)).add(((Object) (new zzalr(zzcsu[i], zzcsw[i], zzcsv[i], (double)zzcsx[i] / (double)zzcsy, zzcsx[i]))));
	//   16   26:aload_2         
	//   17   27:new             #84  <Class zzalr>
	//   18   30:dup             
	//   19   31:aload_0         
	//   20   32:getfield        #43  <Field String[] zzcsu>
	//   21   35:iload_1         
	//   22   36:aaload          
	//   23   37:aload_0         
	//   24   38:getfield        #54  <Field double[] zzcsw>
	//   25   41:iload_1         
	//   26   42:daload          
	//   27   43:aload_0         
	//   28   44:getfield        #49  <Field double[] zzcsv>
	//   29   47:iload_1         
	//   30   48:daload          
	//   31   49:aload_0         
	//   32   50:getfield        #56  <Field int[] zzcsx>
	//   33   53:iload_1         
	//   34   54:iaload          
	//   35   55:i2d             
	//   36   56:aload_0         
	//   37   57:getfield        #58  <Field int zzcsy>
	//   38   60:i2d             
	//   39   61:ddiv            
	//   40   62:aload_0         
	//   41   63:getfield        #56  <Field int[] zzcsx>
	//   42   66:iload_1         
	//   43   67:iaload          
	//   44   68:invokespecial   #87  <Method void zzalr(String, double, double, double, int)>
	//   45   71:invokeinterface #91  <Method boolean List.add(Object)>
	//   46   76:pop             

	//   47   77:iload_1         
	//   48   78:iconst_1        
	//   49   79:iadd            
	//   50   80:istore_1        
	//*  51   81:goto            17
		return ((List) (arraylist));
	//   52   84:aload_2         
	//   53   85:areturn         
	}

	private final String zzcsu[];
	private final double zzcsv[];
	private final double zzcsw[];
	private final int zzcsx[];
	private int zzcsy;
}
