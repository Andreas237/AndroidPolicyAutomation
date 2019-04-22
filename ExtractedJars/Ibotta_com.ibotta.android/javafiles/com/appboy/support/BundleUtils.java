// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.os.Bundle;
import java.util.*;

public class BundleUtils
{

	public BundleUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Bundle mapToBundle(Map map)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #13  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Bundle()>
	//    3    7:astore_1        
		if(map != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          68
		{
			java.util.Map.Entry entry;
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); bundle.putString((String)entry.getKey(), (String)entry.getValue()))
	//*   6   12:aload_0         
	//*   7   13:invokeinterface #20  <Method Set Map.entrySet()>
	//*   8   18:invokeinterface #26  <Method Iterator Set.iterator()>
	//*   9   23:astore_0        
	//*  10   24:aload_0         
	//*  11   25:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//*  12   30:ifeq            68
				entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   13   33:aload_0         
	//   14   34:invokeinterface #36  <Method Object Iterator.next()>
	//   15   39:checkcast       #38  <Class java.util.Map$Entry>
	//   16   42:astore_2        

	//   17   43:aload_1         
	//   18   44:aload_2         
	//   19   45:invokeinterface #41  <Method Object java.util.Map$Entry.getKey()>
	//   20   50:checkcast       #43  <Class String>
	//   21   53:aload_2         
	//   22   54:invokeinterface #46  <Method Object java.util.Map$Entry.getValue()>
	//   23   59:checkcast       #43  <Class String>
	//   24   62:invokevirtual   #50  <Method void Bundle.putString(String, String)>
		}
	//*  25   65:goto            24
		return bundle;
	//   26   68:aload_1         
	//   27   69:areturn         
	}
}
