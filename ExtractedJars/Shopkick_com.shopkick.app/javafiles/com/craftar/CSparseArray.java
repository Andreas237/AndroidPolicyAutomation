// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.util.SparseArray;

class CSparseArray extends SparseArray
{

	CSparseArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void SparseArray()>
	//    2    4:return          
	}

	public CSparseArray cloneArray()
	{
		if(android.os.Build.VERSION.SDK_INT < 14)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmpge          51
		{
			CSparseArray csparsearray = new CSparseArray();
	//    3    8:new             #2   <Class CSparseArray>
	//    4   11:dup             
	//    5   12:invokespecial   #19  <Method void CSparseArray()>
	//    6   15:astore_3        
			for(int i = 0; i < size(); i++)
	//*   7   16:iconst_0        
	//*   8   17:istore_1        
	//*   9   18:iload_1         
	//*  10   19:aload_0         
	//*  11   20:invokevirtual   #23  <Method int size()>
	//*  12   23:icmpge          49
			{
				int j = keyAt(i);
	//   13   26:aload_0         
	//   14   27:iload_1         
	//   15   28:invokevirtual   #27  <Method int keyAt(int)>
	//   16   31:istore_2        
				csparsearray.append(j, get(j));
	//   17   32:aload_3         
	//   18   33:iload_2         
	//   19   34:aload_0         
	//   20   35:iload_2         
	//   21   36:invokevirtual   #31  <Method Object get(int)>
	//   22   39:invokevirtual   #35  <Method void append(int, Object)>
			}

	//   23   42:iload_1         
	//   24   43:iconst_1        
	//   25   44:iadd            
	//   26   45:istore_1        
	//*  27   46:goto            18
			return csparsearray;
	//   28   49:aload_3         
	//   29   50:areturn         
		} else
		{
			return (CSparseArray)clone();
	//   30   51:aload_0         
	//   31   52:invokevirtual   #39  <Method SparseArray clone()>
	//   32   55:checkcast       #2   <Class CSparseArray>
	//   33   58:areturn         
		}
	}
}
