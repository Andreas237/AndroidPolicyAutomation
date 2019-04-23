// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			yr, yq, yp

public final class yo
{

	private yo(yr yr1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		int i = yr.a(yr1).size();
	//    2    4:aload_1         
	//    3    5:invokestatic    #24  <Method List yr.a(yr)>
	//    4    8:invokeinterface #30  <Method int List.size()>
	//    5   13:istore_2        
		a = (String[])yr.b(yr1).toArray(((Object []) (new String[i])));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokestatic    #32  <Method List yr.b(yr)>
	//    9   19:iload_2         
	//   10   20:anewarray       String[]
	//   11   23:invokeinterface #38  <Method Object[] List.toArray(Object[])>
	//   12   28:checkcast       #39  <Class String[]>
	//   13   31:putfield        #41  <Field String[] a>
		b = a(yr.a(yr1));
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokestatic    #24  <Method List yr.a(yr)>
	//   17   39:invokestatic    #44  <Method double[] a(List)>
	//   18   42:putfield        #46  <Field double[] b>
		c = a(yr.c(yr1));
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:invokestatic    #48  <Method List yr.c(yr)>
	//   22   50:invokestatic    #44  <Method double[] a(List)>
	//   23   53:putfield        #50  <Field double[] c>
		d = new int[i];
	//   24   56:aload_0         
	//   25   57:iload_2         
	//   26   58:newarray        int[]
	//   27   60:putfield        #52  <Field int[] d>
		e = 0;
	//   28   63:aload_0         
	//   29   64:iconst_0        
	//   30   65:putfield        #54  <Field int e>
	//   31   68:return          
	}

	yo(yr yr1, yp yp)
	{
		this(yr1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void yo(yr)>
	//    3    5:return          
	}

	private static double[] a(List list)
	{
		double ad[] = new double[list.size()];
	//    0    0:aload_0         
	//    1    1:invokeinterface #30  <Method int List.size()>
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
	//   14   21:invokeinterface #62  <Method Object List.get(int)>
	//   15   26:checkcast       #64  <Class Double>
	//   16   29:invokevirtual   #68  <Method double Double.doubleValue()>
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

	public final List a()
	{
		ArrayList arraylist = new ArrayList(a.length);
	//    0    0:new             #71  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field String[] a>
	//    4    8:arraylength     
	//    5    9:invokespecial   #74  <Method void ArrayList(int)>
	//    6   12:astore          10
		int i = 0;
	//    7   14:iconst_0        
	//    8   15:istore          9
		do
		{
			String as[] = a;
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field String[] a>
	//   11   21:astore          11
			if(i < as.length)
	//*  12   23:iload           9
	//*  13   25:aload           11
	//*  14   27:arraylength     
	//*  15   28:icmpge          125
			{
				String s = as[i];
	//   16   31:aload           11
	//   17   33:iload           9
	//   18   35:aaload          
	//   19   36:astore          11
				double d1 = c[i];
	//   20   38:aload_0         
	//   21   39:getfield        #50  <Field double[] c>
	//   22   42:iload           9
	//   23   44:daload          
	//   24   45:dstore_1        
				double d2 = b[i];
	//   25   46:aload_0         
	//   26   47:getfield        #46  <Field double[] b>
	//   27   50:iload           9
	//   28   52:daload          
	//   29   53:dstore_3        
				int ai[] = d;
	//   30   54:aload_0         
	//   31   55:getfield        #52  <Field int[] d>
	//   32   58:astore          12
				double d3 = ai[i];
	//   33   60:aload           12
	//   34   62:iload           9
	//   35   64:iaload          
	//   36   65:i2d             
	//   37   66:dstore          5
				double d4 = e;
	//   38   68:aload_0         
	//   39   69:getfield        #54  <Field int e>
	//   40   72:i2d             
	//   41   73:dstore          7
				Double.isNaN(d3);
	//   42   75:dload           5
	//   43   77:invokestatic    #78  <Method boolean Double.isNaN(double)>
	//   44   80:pop             
				Double.isNaN(d4);
	//   45   81:dload           7
	//   46   83:invokestatic    #78  <Method boolean Double.isNaN(double)>
	//   47   86:pop             
				((List) (arraylist)).add(((Object) (new yq(s, d1, d2, d3 / d4, ai[i]))));
	//   48   87:aload           10
	//   49   89:new             #80  <Class yq>
	//   50   92:dup             
	//   51   93:aload           11
	//   52   95:dload_1         
	//   53   96:dload_3         
	//   54   97:dload           5
	//   55   99:dload           7
	//   56  101:ddiv            
	//   57  102:aload           12
	//   58  104:iload           9
	//   59  106:iaload          
	//   60  107:invokespecial   #83  <Method void yq(String, double, double, double, int)>
	//   61  110:invokeinterface #87  <Method boolean List.add(Object)>
	//   62  115:pop             
				i++;
	//   63  116:iload           9
	//   64  118:iconst_1        
	//   65  119:iadd            
	//   66  120:istore          9
			} else
	//*  67  122:goto            17
			{
				return ((List) (arraylist));
	//   68  125:aload           10
	//   69  127:areturn         
			}
		} while(true);
	}

	public final void a(double d1)
	{
		e = e + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field int e>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #54  <Field int e>
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		do
		{
			double ad[] = c;
	//    8   12:aload_0         
	//    9   13:getfield        #50  <Field double[] c>
	//   10   16:astore          4
			if(i >= ad.length)
				break;
	//   11   18:iload_3         
	//   12   19:aload           4
	//   13   21:arraylength     
	//   14   22:icmpge          79
			if(ad[i] <= d1 && d1 < b[i])
	//*  15   25:aload           4
	//*  16   27:iload_3         
	//*  17   28:daload          
	//*  18   29:dload_1         
	//*  19   30:dcmpg           
	//*  20   31:ifgt            61
	//*  21   34:dload_1         
	//*  22   35:aload_0         
	//*  23   36:getfield        #46  <Field double[] b>
	//*  24   39:iload_3         
	//*  25   40:daload          
	//*  26   41:dcmpg           
	//*  27   42:ifge            61
			{
				int ai[] = d;
	//   28   45:aload_0         
	//   29   46:getfield        #52  <Field int[] d>
	//   30   49:astore          4
				ai[i] = ai[i] + 1;
	//   31   51:aload           4
	//   32   53:iload_3         
	//   33   54:aload           4
	//   34   56:iload_3         
	//   35   57:iaload          
	//   36   58:iconst_1        
	//   37   59:iadd            
	//   38   60:iastore         
			}
			if(d1 < c[i])
				break;
	//   39   61:dload_1         
	//   40   62:aload_0         
	//   41   63:getfield        #50  <Field double[] c>
	//   42   66:iload_3         
	//   43   67:daload          
	//   44   68:dcmpg           
	//   45   69:iflt            79
			i++;
	//   46   72:iload_3         
	//   47   73:iconst_1        
	//   48   74:iadd            
	//   49   75:istore_3        
		} while(true);
	//   50   76:goto            12
	//   51   79:return          
	}

	private final String a[];
	private final double b[];
	private final double c[];
	private final int d[];
	private int e;
}
