// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location.core;

import o.kh;

// Referenced classes of package com.amap.api.location.core:
//			GeoPoint

public class CoordinateConvert
{

	public CoordinateConvert()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static GeoPoint fromGpsToAMap(double d, double d1)
	{
		GeoPoint geopoint;
		try
		{
			double ad[] = kh.d(d1, d);
	//    0    0:dload_2         
	//    1    1:dload_0         
	//    2    2:invokestatic    #19  <Method double[] kh.d(double, double)>
	//    3    5:astore          4
			geopoint = new GeoPoint((int)(ad[1] * 1000000D), (int)(ad[0] * 1000000D));
	//    4    7:new             #21  <Class GeoPoint>
	//    5   10:dup             
	//    6   11:aload           4
	//    7   13:iconst_1        
	//    8   14:daload          
	//    9   15:ldc2w           #22  <Double 1000000D>
	//   10   18:dmul            
	//   11   19:d2i             
	//   12   20:aload           4
	//   13   22:iconst_0        
	//   14   23:daload          
	//   15   24:ldc2w           #22  <Double 1000000D>
	//   16   27:dmul            
	//   17   28:d2i             
	//   18   29:invokespecial   #26  <Method void GeoPoint(int, int)>
	//   19   32:astore          4
		}
	//*  20   34:aload           4
	//*  21   36:areturn         
		catch(Throwable throwable)
	//*  22   37:astore          4
		{
			throwable.printStackTrace();
	//   23   39:aload           4
	//   24   41:invokevirtual   #29  <Method void Throwable.printStackTrace()>
			return null;
	//   25   44:aconst_null     
	//   26   45:areturn         
		}
		return geopoint;
	}

	public static double[] fromSeveralGpsToAMap(String s)
	{
		int i;
		int j;
		double ad[];
		double ad1[];
		try
		{
			s = ((String) (s.split(",")));
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String ",">
	//    2    3:invokevirtual   #39  <Method String[] String.split(String)>
	//    3    6:astore_0        
			j = s.length;
	//    4    7:aload_0         
	//    5    8:arraylength     
	//    6    9:istore_2        
			ad = new double[j];
	//    7   10:iload_2         
	//    8   11:newarray        double[]
	//    9   13:astore_3        
		}
	//*  10   14:iconst_0        
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iload_2         
	//*  14   18:iconst_2        
	//*  15   19:idiv            
	//*  16   20:icmpge          73
	//*  17   23:aload_0         
	//*  18   24:iload_1         
	//*  19   25:iconst_2        
	//*  20   26:imul            
	//*  21   27:aaload          
	//*  22   28:invokestatic    #45  <Method double Double.parseDouble(String)>
	//*  23   31:aload_0         
	//*  24   32:iload_1         
	//*  25   33:iconst_2        
	//*  26   34:imul            
	//*  27   35:iconst_1        
	//*  28   36:iadd            
	//*  29   37:aaload          
	//*  30   38:invokestatic    #45  <Method double Double.parseDouble(String)>
	//*  31   41:invokestatic    #19  <Method double[] kh.d(double, double)>
	//*  32   44:astore          4
	//*  33   46:aload_3         
	//*  34   47:iload_1         
	//*  35   48:iconst_2        
	//*  36   49:imul            
	//*  37   50:aload           4
	//*  38   52:iconst_0        
	//*  39   53:daload          
	//*  40   54:dastore         
	//*  41   55:aload_3         
	//*  42   56:iload_1         
	//*  43   57:iconst_2        
	//*  44   58:imul            
	//*  45   59:iconst_1        
	//*  46   60:iadd            
	//*  47   61:aload           4
	//*  48   63:iconst_1        
	//*  49   64:daload          
	//*  50   65:dastore         
	//*  51   66:iload_1         
	//*  52   67:iconst_1        
	//*  53   68:iadd            
	//*  54   69:istore_1        
	//*  55   70:goto            16
	//*  56   73:aload_3         
	//*  57   74:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  58   75:astore_0        
		{
			((Throwable) (s)).printStackTrace();
	//   59   76:aload_0         
	//   60   77:invokevirtual   #29  <Method void Throwable.printStackTrace()>
			return null;
	//   61   80:aconst_null     
	//   62   81:areturn         
		}
		i = 0;
		if(i >= j / 2)
			break; /* Loop/switch isn't completed */
		ad1 = kh.d(Double.parseDouble(((String) (s[i * 2]))), Double.parseDouble(((String) (s[i * 2 + 1]))));
		ad[i * 2] = ad1[0];
		ad[i * 2 + 1] = ad1[1];
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_16;
_L1:
		return ad;
	}

	public static double[] fromSeveralGpsToAMap(double ad[])
	{
		int i;
		int j;
		double ad1[];
		double ad2[];
		try
		{
			j = ad.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
			ad1 = new double[j];
	//    3    3:iload_2         
	//    4    4:newarray        double[]
	//    5    6:astore_3        
		}
	//*   6    7:iconst_0        
	//*   7    8:istore_1        
	//*   8    9:iload_1         
	//*   9   10:iload_2         
	//*  10   11:iconst_2        
	//*  11   12:idiv            
	//*  12   13:icmpge          60
	//*  13   16:aload_0         
	//*  14   17:iload_1         
	//*  15   18:iconst_2        
	//*  16   19:imul            
	//*  17   20:daload          
	//*  18   21:aload_0         
	//*  19   22:iload_1         
	//*  20   23:iconst_2        
	//*  21   24:imul            
	//*  22   25:iconst_1        
	//*  23   26:iadd            
	//*  24   27:daload          
	//*  25   28:invokestatic    #19  <Method double[] kh.d(double, double)>
	//*  26   31:astore          4
	//*  27   33:aload_3         
	//*  28   34:iload_1         
	//*  29   35:iconst_2        
	//*  30   36:imul            
	//*  31   37:aload           4
	//*  32   39:iconst_0        
	//*  33   40:daload          
	//*  34   41:dastore         
	//*  35   42:aload_3         
	//*  36   43:iload_1         
	//*  37   44:iconst_2        
	//*  38   45:imul            
	//*  39   46:iconst_1        
	//*  40   47:iadd            
	//*  41   48:aload           4
	//*  42   50:iconst_1        
	//*  43   51:daload          
	//*  44   52:dastore         
	//*  45   53:iload_1         
	//*  46   54:iconst_1        
	//*  47   55:iadd            
	//*  48   56:istore_1        
	//*  49   57:goto            9
	//*  50   60:aload_3         
	//*  51   61:areturn         
		// Misplaced declaration of an exception variable
		catch(double ad[])
	//*  52   62:astore_0        
		{
			((Throwable) (ad)).printStackTrace();
	//   53   63:aload_0         
	//   54   64:invokevirtual   #29  <Method void Throwable.printStackTrace()>
			return null;
	//   55   67:aconst_null     
	//   56   68:areturn         
		}
		i = 0;
		if(i >= j / 2)
			break; /* Loop/switch isn't completed */
		ad2 = kh.d(ad[i * 2], ad[i * 2 + 1]);
		ad1[i * 2] = ad2[0];
		ad1[i * 2 + 1] = ad2[1];
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_9;
_L1:
		return ad1;
	}
}
