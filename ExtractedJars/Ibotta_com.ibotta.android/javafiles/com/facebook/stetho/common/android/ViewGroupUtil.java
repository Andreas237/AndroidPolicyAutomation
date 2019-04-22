// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.view.View;
import android.view.ViewGroup;

public final class ViewGroupUtil
{

	private ViewGroupUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int findChildIndex(ViewGroup viewgroup, View view)
	{
		int j = viewgroup.getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method int ViewGroup.getChildCount()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          30
			if(viewgroup.getChildAt(i) == view)
	//*   8   12:aload_0         
	//*   9   13:iload_2         
	//*  10   14:invokevirtual   #21  <Method View ViewGroup.getChildAt(int)>
	//*  11   17:aload_1         
	//*  12   18:if_acmpne       23
				return i;
	//   13   21:iload_2         
	//   14   22:ireturn         

	//   15   23:iload_2         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore_2        
	//*  19   27:goto            7
		return -1;
	//   20   30:iconst_m1       
	//   21   31:ireturn         
	}
}
