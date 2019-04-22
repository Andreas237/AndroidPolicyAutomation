// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import org.json.*;

// Referenced classes of package com.facebook.internal:
//			BundleJSONConverter

static final class BundleJSONConverter$7
	implements tter
{

	public void setOnBundle(Bundle bundle, String s, Object obj)
		throws JSONException
	{
		JSONArray jsonarray = (JSONArray)obj;
	//    0    0:aload_3         
	//    1    1:checkcast       #19  <Class JSONArray>
	//    2    4:astore          5
		ArrayList arraylist = new ArrayList();
	//    3    6:new             #21  <Class ArrayList>
	//    4    9:dup             
	//    5   10:invokespecial   #22  <Method void ArrayList()>
	//    6   13:astore          6
		if(jsonarray.length() == 0)
	//*   7   15:aload           5
	//*   8   17:invokevirtual   #26  <Method int JSONArray.length()>
	//*   9   20:ifne            31
		{
			bundle.putStringArrayList(s, arraylist);
	//   10   23:aload_1         
	//   11   24:aload_2         
	//   12   25:aload           6
	//   13   27:invokevirtual   #32  <Method void Bundle.putStringArrayList(String, ArrayList)>
			return;
	//   14   30:return          
		}
		for(int i = 0; i < jsonarray.length();)
	//*  15   31:iconst_0        
	//*  16   32:istore          4
	//*  17   34:iload           4
	//*  18   36:aload           5
	//*  19   38:invokevirtual   #26  <Method int JSONArray.length()>
	//*  20   41:icmpge          114
		{
			obj = jsonarray.get(i);
	//   21   44:aload           5
	//   22   46:iload           4
	//   23   48:invokevirtual   #36  <Method Object JSONArray.get(int)>
	//   24   51:astore_3        
			if(obj instanceof String)
	//*  25   52:aload_3         
	//*  26   53:instanceof      #38  <Class String>
	//*  27   56:ifeq            78
			{
				arraylist.add(((Object) ((String)obj)));
	//   28   59:aload           6
	//   29   61:aload_3         
	//   30   62:checkcast       #38  <Class String>
	//   31   65:invokevirtual   #42  <Method boolean ArrayList.add(Object)>
	//   32   68:pop             
				i++;
	//   33   69:iload           4
	//   34   71:iconst_1        
	//   35   72:iadd            
	//   36   73:istore          4
			} else
	//*  37   75:goto            34
			{
				bundle = ((Bundle) (new StringBuilder()));
	//   38   78:new             #44  <Class StringBuilder>
	//   39   81:dup             
	//   40   82:invokespecial   #45  <Method void StringBuilder()>
	//   41   85:astore_1        
				((StringBuilder) (bundle)).append("Unexpected type in an array: ");
	//   42   86:aload_1         
	//   43   87:ldc1            #47  <String "Unexpected type in an array: ">
	//   44   89:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
				((StringBuilder) (bundle)).append(((Object) (obj.getClass())));
	//   46   93:aload_1         
	//   47   94:aload_3         
	//   48   95:invokevirtual   #55  <Method Class Object.getClass()>
	//   49   98:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   50  101:pop             
				throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
	//   51  102:new             #60  <Class IllegalArgumentException>
	//   52  105:dup             
	//   53  106:aload_1         
	//   54  107:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   55  110:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//   56  113:athrow          
			}
		}

		bundle.putStringArrayList(s, arraylist);
	//   57  114:aload_1         
	//   58  115:aload_2         
	//   59  116:aload           6
	//   60  118:invokevirtual   #32  <Method void Bundle.putStringArrayList(String, ArrayList)>
	//   61  121:return          
	}

	public void setOnJSON(JSONObject jsonobject, String s, Object obj)
		throws JSONException
	{
		throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
	//    0    0:new             #60  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #72  <String "JSONArray's are not supported in bundles.">
	//    3    6:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	BundleJSONConverter$7()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
