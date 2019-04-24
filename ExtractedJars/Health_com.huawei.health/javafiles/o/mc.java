// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			mj, mu, na, lx

public class mc
	implements mj
{

	public mc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public float e(na na1, mu mu1)
	{
		float f = mu1.getYChartMax();
	//    0    0:aload_2         
	//    1    1:invokeinterface #19  <Method float mu.getYChartMax()>
	//    2    6:fstore_3        
		float f1 = mu1.getYChartMin();
	//    3    7:aload_2         
	//    4    8:invokeinterface #22  <Method float mu.getYChartMin()>
	//    5   13:fstore          4
		mu1 = ((mu) (mu1.getLineData()));
	//    6   15:aload_2         
	//    7   16:invokeinterface #26  <Method lx mu.getLineData()>
	//    8   21:astore_2        
		if(na1.E() > 0.0F && na1.F() < 0.0F)
	//*   9   22:aload_1         
	//*  10   23:invokeinterface #31  <Method float na.E()>
	//*  11   28:fconst_0        
	//*  12   29:fcmpl           
	//*  13   30:ifle            46
	//*  14   33:aload_1         
	//*  15   34:invokeinterface #34  <Method float na.F()>
	//*  16   39:fconst_0        
	//*  17   40:fcmpg           
	//*  18   41:ifge            46
			return 0.0F;
	//   19   44:fconst_0        
	//   20   45:freturn         
		if(((lx) (mu1)).g() > 0.0F)
	//*  21   46:aload_2         
	//*  22   47:invokevirtual   #39  <Method float lx.g()>
	//*  23   50:fconst_0        
	//*  24   51:fcmpl           
	//*  25   52:ifle            60
			f = 0.0F;
	//   26   55:fconst_0        
	//   27   56:fstore_3        
	//*  28   57:goto            60
		if(((lx) (mu1)).c() < 0.0F)
	//*  29   60:aload_2         
	//*  30   61:invokevirtual   #42  <Method float lx.c()>
	//*  31   64:fconst_0        
	//*  32   65:fcmpg           
	//*  33   66:ifge            75
			f1 = 0.0F;
	//   34   69:fconst_0        
	//   35   70:fstore          4
	//*  36   72:goto            75
		if(na1.F() >= 0.0F)
	//*  37   75:aload_1         
	//*  38   76:invokeinterface #34  <Method float na.F()>
	//*  39   81:fconst_0        
	//*  40   82:fcmpl           
	//*  41   83:iflt            89
			return f1;
	//   42   86:fload           4
	//   43   88:freturn         
		else
			return f;
	//   44   89:fload_3         
	//   45   90:freturn         
	}
}
