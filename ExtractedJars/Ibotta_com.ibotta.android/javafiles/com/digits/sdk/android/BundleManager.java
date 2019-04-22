// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.os.Bundle;

class BundleManager
{

	static transient boolean assertContains(Bundle bundle, String as[])
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          41
		{
			if(as == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
				return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
			int j = as.length;
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:istore_3        
			for(int i = 0; i < j; i++)
	//*   9   13:iconst_0        
	//*  10   14:istore_2        
	//*  11   15:iload_2         
	//*  12   16:iload_3         
	//*  13   17:icmpge          39
				if(!bundle.containsKey(as[i]))
	//*  14   20:aload_0         
	//*  15   21:aload_1         
	//*  16   22:iload_2         
	//*  17   23:aaload          
	//*  18   24:invokevirtual   #12  <Method boolean Bundle.containsKey(String)>
	//*  19   27:ifne            32
					return false;
	//   20   30:iconst_0        
	//   21   31:ireturn         

	//   22   32:iload_2         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:istore_2        
	//*  26   36:goto            15
			return true;
	//   27   39:iconst_1        
	//   28   40:ireturn         
		} else
		{
			return false;
	//   29   41:iconst_0        
	//   30   42:ireturn         
		}
	}
}
