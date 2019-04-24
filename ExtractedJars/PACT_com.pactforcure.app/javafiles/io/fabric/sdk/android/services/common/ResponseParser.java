// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;


public class ResponseParser
{

	public ResponseParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static int parse(int i)
	{
		if(i < 200 || i > 299)
	//*   0    0:iload_0         
	//*   1    1:sipush          200
	//*   2    4:icmplt          16
	//*   3    7:iload_0         
	//*   4    8:sipush          299
	//*   5   11:icmpgt          16
	//*   6   14:iconst_0        
	//*   7   15:ireturn         
		{
			if(i >= 300 && i <= 399)
	//*   8   16:iload_0         
	//*   9   17:sipush          300
	//*  10   20:icmplt          32
	//*  11   23:iload_0         
	//*  12   24:sipush          399
	//*  13   27:icmpgt          32
				return 1;
	//   14   30:iconst_1        
	//   15   31:ireturn         
			if(i < 400 || i > 499)
	//*  16   32:iload_0         
	//*  17   33:sipush          400
	//*  18   36:icmplt          46
	//*  19   39:iload_0         
	//*  20   40:sipush          499
	//*  21   43:icmple          14
				return i < 500 ? 1 : 1;
	//   22   46:iload_0         
	//   23   47:sipush          500
	//   24   50:icmplt          55
	//   25   53:iconst_1        
	//   26   54:ireturn         
	//   27   55:iconst_1        
	//   28   56:ireturn         
		}
		return 0;
	}

	public static final int ResponseActionDiscard = 0;
	public static final int ResponseActionRetry = 1;
}
