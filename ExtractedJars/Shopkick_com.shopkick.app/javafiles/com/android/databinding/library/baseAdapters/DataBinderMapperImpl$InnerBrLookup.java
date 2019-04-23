// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.databinding.library.baseAdapters;

import android.util.SparseArray;

// Referenced classes of package com.android.databinding.library.baseAdapters:
//			DataBinderMapperImpl

private static class DataBinderMapperImpl$InnerBrLookup
{

	static final SparseArray sKeys;

	static 
	{
		sKeys = new SparseArray(2);
	//    0    0:new             #14  <Class SparseArray>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:invokespecial   #18  <Method void SparseArray(int)>
	//    4    8:putstatic       #20  <Field SparseArray sKeys>
		sKeys.put(0, "_all");
	//    5   11:getstatic       #20  <Field SparseArray sKeys>
	//    6   14:iconst_0        
	//    7   15:ldc1            #22  <String "_all">
	//    8   17:invokevirtual   #26  <Method void SparseArray.put(int, Object)>
	//*   9   20:return          
	}

	private DataBinderMapperImpl$InnerBrLookup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}
}
