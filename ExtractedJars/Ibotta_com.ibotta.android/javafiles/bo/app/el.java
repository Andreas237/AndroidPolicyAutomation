// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


public final class el
{

	public static double a(double d, double d1, double d2, double d3)
	{
		double d4 = Math.toRadians(d2 - d);
	//    0    0:dload           4
	//    1    2:dload_0         
	//    2    3:dsub            
	//    3    4:invokestatic    #12  <Method double Math.toRadians(double)>
	//    4    7:dstore          8
		d1 = Math.toRadians(d3 - d1);
	//    5    9:dload           6
	//    6   11:dload_2         
	//    7   12:dsub            
	//    8   13:invokestatic    #12  <Method double Math.toRadians(double)>
	//    9   16:dstore_2        
		d = Math.toRadians(d);
	//   10   17:dload_0         
	//   11   18:invokestatic    #12  <Method double Math.toRadians(double)>
	//   12   21:dstore_0        
		d2 = Math.toRadians(d2);
	//   13   22:dload           4
	//   14   24:invokestatic    #12  <Method double Math.toRadians(double)>
	//   15   27:dstore          4
		return Math.asin(Math.sqrt(Math.pow(Math.sin(d4 / 2D), 2D) + Math.pow(Math.sin(d1 / 2D), 2D) * Math.cos(d) * Math.cos(d2))) * 2D * 6371000D;
	//   16   29:dload           8
	//   17   31:ldc2w           #13  <Double 2D>
	//   18   34:ddiv            
	//   19   35:invokestatic    #17  <Method double Math.sin(double)>
	//   20   38:ldc2w           #13  <Double 2D>
	//   21   41:invokestatic    #21  <Method double Math.pow(double, double)>
	//   22   44:dload_2         
	//   23   45:ldc2w           #13  <Double 2D>
	//   24   48:ddiv            
	//   25   49:invokestatic    #17  <Method double Math.sin(double)>
	//   26   52:ldc2w           #13  <Double 2D>
	//   27   55:invokestatic    #21  <Method double Math.pow(double, double)>
	//   28   58:dload_0         
	//   29   59:invokestatic    #24  <Method double Math.cos(double)>
	//   30   62:dmul            
	//   31   63:dload           4
	//   32   65:invokestatic    #24  <Method double Math.cos(double)>
	//   33   68:dmul            
	//   34   69:dadd            
	//   35   70:invokestatic    #27  <Method double Math.sqrt(double)>
	//   36   73:invokestatic    #30  <Method double Math.asin(double)>
	//   37   76:ldc2w           #13  <Double 2D>
	//   38   79:dmul            
	//   39   80:ldc2w           #31  <Double 6371000D>
	//   40   83:dmul            
	//   41   84:dreturn         
	}
}
