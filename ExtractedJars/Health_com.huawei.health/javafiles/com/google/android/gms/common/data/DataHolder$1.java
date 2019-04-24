// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//			DataHolder

final class DataHolder$1 extends a
{

	public a zza(ContentValues contentvalues)
	{
		throw new UnsupportedOperationException("Cannot add data to empty builder");
	//    0    0:new             #16  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "Cannot add data to empty builder">
	//    3    6:invokespecial   #21  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public a zza(HashMap hashmap)
	{
		throw new UnsupportedOperationException("Cannot add data to empty builder");
	//    0    0:new             #16  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "Cannot add data to empty builder">
	//    3    6:invokespecial   #21  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	DataHolder$1(String as[], String s)
	{
		super(as, s, ((DataHolder$1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #11  <Method void DataHolder$zza(String[], String, DataHolder$1)>
	//    5    7:return          
	}
}
