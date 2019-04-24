// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import java.lang.annotation.Annotation;

public final class RepeatModeUtil
{
	public static interface RepeatToggleModes
		extends Annotation
	{
	}


	private RepeatModeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static int getNextRepeatMode(int i, int j)
	{
		for(int k = 1; k <= 2; k++)
	//*   0    0:iconst_1        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:iconst_2        
	//*   4    4:icmpgt          30
		{
			int l = (i + k) % 3;
	//    5    7:iload_0         
	//    6    8:iload_2         
	//    7    9:iadd            
	//    8   10:iconst_3        
	//    9   11:irem            
	//   10   12:istore_3        
			if(isRepeatModeEnabled(l, j))
	//*  11   13:iload_3         
	//*  12   14:iload_1         
	//*  13   15:invokestatic    #25  <Method boolean isRepeatModeEnabled(int, int)>
	//*  14   18:ifeq            23
				return l;
	//   15   21:iload_3         
	//   16   22:ireturn         
		}

	//   17   23:iload_2         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_2        
	//*  21   27:goto            2
		return i;
	//   22   30:iload_0         
	//   23   31:ireturn         
	}

	public static boolean isRepeatModeEnabled(int i, int j)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		switch(i)
	//*   4    4:iload_0         
		{
	//*   5    5:tableswitch     0 2: default 32
	//	               0 56
	//	               1 44
	//	               2 34
		default:
			return false;
	//    6   32:iconst_0        
	//    7   33:ireturn         

		case 2: // '\002'
			if((j & 2) != 0)
	//*   8   34:iload_1         
	//*   9   35:iconst_2        
	//*  10   36:iand            
	//*  11   37:ifeq            42
				flag = true;
	//   12   40:iconst_1        
	//   13   41:istore_2        
			return flag;
	//   14   42:iload_2         
	//   15   43:ireturn         

		case 1: // '\001'
			boolean flag1 = flag2;
	//   16   44:iload_3         
	//   17   45:istore_2        
			if((j & 1) != 0)
	//*  18   46:iload_1         
	//*  19   47:iconst_1        
	//*  20   48:iand            
	//*  21   49:ifeq            54
				flag1 = true;
	//   22   52:iconst_1        
	//   23   53:istore_2        
			return flag1;
	//   24   54:iload_2         
	//   25   55:ireturn         

		case 0: // '\0'
			return true;
	//   26   56:iconst_1        
	//   27   57:ireturn         
		}
	}

	public static final int REPEAT_TOGGLE_MODE_ALL = 2;
	public static final int REPEAT_TOGGLE_MODE_NONE = 0;
	public static final int REPEAT_TOGGLE_MODE_ONE = 1;
}
