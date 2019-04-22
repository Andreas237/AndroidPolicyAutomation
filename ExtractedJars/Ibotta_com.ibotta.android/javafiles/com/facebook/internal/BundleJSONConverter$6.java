// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.Bundle;
import org.json.*;

// Referenced classes of package com.facebook.internal:
//			BundleJSONConverter

static final class BundleJSONConverter$6
	implements tter
{

	public void setOnBundle(Bundle bundle, String s, Object obj)
		throws JSONException
	{
		throw new IllegalArgumentException("Unexpected type from JSON");
	//    0    0:new             #19  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "Unexpected type from JSON">
	//    3    6:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	public void setOnJSON(JSONObject jsonobject, String s, Object obj)
		throws JSONException
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #29  <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void JSONArray()>
	//    3    7:astore          6
		obj = ((Object) ((String[])obj));
	//    4    9:aload_3         
	//    5   10:checkcast       #32  <Class String[]>
	//    6   13:astore_3        
		int j = obj.length;
	//    7   14:aload_3         
	//    8   15:arraylength     
	//    9   16:istore          5
		for(int i = 0; i < j; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore          4
	//*  12   21:iload           4
	//*  13   23:iload           5
	//*  14   25:icmpge          47
			jsonarray.put(((Object) (obj[i])));
	//   15   28:aload           6
	//   16   30:aload_3         
	//   17   31:iload           4
	//   18   33:aaload          
	//   19   34:invokevirtual   #36  <Method JSONArray JSONArray.put(Object)>
	//   20   37:pop             

	//   21   38:iload           4
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:istore          4
	//*  25   44:goto            21
		jsonobject.put(s, ((Object) (jsonarray)));
	//   26   47:aload_1         
	//   27   48:aload_2         
	//   28   49:aload           6
	//   29   51:invokevirtual   #41  <Method JSONObject JSONObject.put(String, Object)>
	//   30   54:pop             
	//   31   55:return          
	}

	BundleJSONConverter$6()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
