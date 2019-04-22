// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Color;

public final class ColorUtils
{

	private static int compositeAlpha(int i, int j)
	{
		return 255 - ((255 - j) * (255 - i)) / 255;
	//    0    0:sipush          255
	//    1    3:sipush          255
	//    2    6:iload_1         
	//    3    7:isub            
	//    4    8:sipush          255
	//    5   11:iload_0         
	//    6   12:isub            
	//    7   13:imul            
	//    8   14:sipush          255
	//    9   17:idiv            
	//   10   18:isub            
	//   11   19:ireturn         
	}

	public static int compositeColors(int i, int j)
	{
		int k = Color.alpha(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #27  <Method int Color.alpha(int)>
	//    2    4:istore_2        
		int l = Color.alpha(i);
	//    3    5:iload_0         
	//    4    6:invokestatic    #27  <Method int Color.alpha(int)>
	//    5    9:istore_3        
		int i1 = compositeAlpha(l, k);
	//    6   10:iload_3         
	//    7   11:iload_2         
	//    8   12:invokestatic    #29  <Method int compositeAlpha(int, int)>
	//    9   15:istore          4
		return Color.argb(i1, compositeComponent(Color.red(i), l, Color.red(j), k, i1), compositeComponent(Color.green(i), l, Color.green(j), k, i1), compositeComponent(Color.blue(i), l, Color.blue(j), k, i1));
	//   10   17:iload           4
	//   11   19:iload_0         
	//   12   20:invokestatic    #32  <Method int Color.red(int)>
	//   13   23:iload_3         
	//   14   24:iload_1         
	//   15   25:invokestatic    #32  <Method int Color.red(int)>
	//   16   28:iload_2         
	//   17   29:iload           4
	//   18   31:invokestatic    #36  <Method int compositeComponent(int, int, int, int, int)>
	//   19   34:iload_0         
	//   20   35:invokestatic    #39  <Method int Color.green(int)>
	//   21   38:iload_3         
	//   22   39:iload_1         
	//   23   40:invokestatic    #39  <Method int Color.green(int)>
	//   24   43:iload_2         
	//   25   44:iload           4
	//   26   46:invokestatic    #36  <Method int compositeComponent(int, int, int, int, int)>
	//   27   49:iload_0         
	//   28   50:invokestatic    #42  <Method int Color.blue(int)>
	//   29   53:iload_3         
	//   30   54:iload_1         
	//   31   55:invokestatic    #42  <Method int Color.blue(int)>
	//   32   58:iload_2         
	//   33   59:iload           4
	//   34   61:invokestatic    #36  <Method int compositeComponent(int, int, int, int, int)>
	//   35   64:invokestatic    #46  <Method int Color.argb(int, int, int, int)>
	//   36   67:ireturn         
	}

	private static int compositeComponent(int i, int j, int k, int l, int i1)
	{
		if(i1 == 0)
	//*   0    0:iload           4
	//*   1    2:ifne            7
			return 0;
	//    2    5:iconst_0        
	//    3    6:ireturn         
		else
			return (i * 255 * j + k * l * (255 - j)) / (i1 * 255);
	//    4    7:iload_0         
	//    5    8:sipush          255
	//    6   11:imul            
	//    7   12:iload_1         
	//    8   13:imul            
	//    9   14:iload_2         
	//   10   15:iload_3         
	//   11   16:imul            
	//   12   17:sipush          255
	//   13   20:iload_1         
	//   14   21:isub            
	//   15   22:imul            
	//   16   23:iadd            
	//   17   24:iload           4
	//   18   26:sipush          255
	//   19   29:imul            
	//   20   30:idiv            
	//   21   31:ireturn         
	}

	public static int setAlphaComponent(int i, int j)
	{
		if(j >= 0 && j <= 255)
	//*   0    0:iload_1         
	//*   1    1:iflt            21
	//*   2    4:iload_1         
	//*   3    5:sipush          255
	//*   4    8:icmpgt          21
			return i & 0xffffff | j << 24;
	//    5   11:iload_0         
	//    6   12:ldc1            #56  <Int 0xffffff>
	//    7   14:iand            
	//    8   15:iload_1         
	//    9   16:bipush          24
	//   10   18:ishl            
	//   11   19:ior             
	//   12   20:ireturn         
		else
			throw new IllegalArgumentException("alpha must be between 0 and 255.");
	//   13   21:new             #58  <Class IllegalArgumentException>
	//   14   24:dup             
	//   15   25:ldc1            #60  <String "alpha must be between 0 and 255.">
	//   16   27:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//   17   30:athrow          
	}

	private static final ThreadLocal TEMP_ARRAY = new ThreadLocal();

	static 
	{
	//    0    0:new             #11  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ThreadLocal()>
	//    3    7:putstatic       #16  <Field ThreadLocal TEMP_ARRAY>
	//*   4   10:return          
	}
}
