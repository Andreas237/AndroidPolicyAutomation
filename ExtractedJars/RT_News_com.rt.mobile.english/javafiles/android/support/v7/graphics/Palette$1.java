// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;


// Referenced classes of package android.support.v7.graphics:
//			Palette

static final class Palette$1
	implements lter
{

	private boolean isBlack(float af[])
	{
		return af[2] <= 0.05F;
	//    0    0:aload_1         
	//    1    1:iconst_2        
	//    2    2:faload          
	//    3    3:ldc1            #11  <Float 0.05F>
	//    4    5:fcmpg           
	//    5    6:ifgt            11
	//    6    9:iconst_1        
	//    7   10:ireturn         
	//    8   11:iconst_0        
	//    9   12:ireturn         
	}

	private boolean isNearRedILine(float af[])
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(af[0] >= 10F)
	//*   4    4:aload_1         
	//*   5    5:iconst_0        
	//*   6    6:faload          
	//*   7    7:ldc1            #22  <Float 10F>
	//*   8    9:fcmpl           
	//*   9   10:iflt            37
		{
			flag = flag1;
	//   10   13:iload_3         
	//   11   14:istore_2        
			if(af[0] <= 37F)
	//*  12   15:aload_1         
	//*  13   16:iconst_0        
	//*  14   17:faload          
	//*  15   18:ldc1            #23  <Float 37F>
	//*  16   20:fcmpg           
	//*  17   21:ifgt            37
			{
				flag = flag1;
	//   18   24:iload_3         
	//   19   25:istore_2        
				if(af[1] <= 0.82F)
	//*  20   26:aload_1         
	//*  21   27:iconst_1        
	//*  22   28:faload          
	//*  23   29:ldc1            #24  <Float 0.82F>
	//*  24   31:fcmpg           
	//*  25   32:ifgt            37
					flag = true;
	//   26   35:iconst_1        
	//   27   36:istore_2        
			}
		}
		return flag;
	//   28   37:iload_2         
	//   29   38:ireturn         
	}

	private boolean isWhite(float af[])
	{
		return af[2] >= 0.95F;
	//    0    0:aload_1         
	//    1    1:iconst_2        
	//    2    2:faload          
	//    3    3:ldc1            #13  <Float 0.95F>
	//    4    5:fcmpl           
	//    5    6:iflt            11
	//    6    9:iconst_1        
	//    7   10:ireturn         
	//    8   11:iconst_0        
	//    9   12:ireturn         
	}

	public boolean isAllowed(int i, float af[])
	{
		return !isWhite(af) && !isBlack(af) && !isNearRedILine(af);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #29  <Method boolean isWhite(float[])>
	//    3    5:ifne            26
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokespecial   #31  <Method boolean isBlack(float[])>
	//    7   13:ifne            26
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:invokespecial   #33  <Method boolean isNearRedILine(float[])>
	//   11   21:ifne            26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	private static final float BLACK_MAX_LIGHTNESS = 0.05F;
	private static final float WHITE_MIN_LIGHTNESS = 0.95F;

	Palette$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
