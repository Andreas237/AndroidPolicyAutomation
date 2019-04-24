// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class hp
{

	public hp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static JSONObject d(JSONObject jsonobject, JSONObject jsonobject1)
	{
		int i;
		JSONObject jsonobject2;
		jsonobject2 = new JSONObject();
	//    0    0:new             #15  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void JSONObject()>
	//    3    7:astore_3        
		i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
_L3:
		if(i >= 2) goto _L2; else goto _L1
	//    6   10:iload_2         
	//    7   11:iconst_2        
	//    8   12:icmpge          89
_L1:
		JSONObject jsonobject3;
		Iterator iterator;
		String s;
		try
		{
			jsonobject3 = (new JSONObject[] {
				jsonobject, jsonobject1
			})[i];
	//    9   15:iconst_2        
	//   10   16:anewarray       JSONObject[]
	//   11   19:dup             
	//   12   20:iconst_0        
	//   13   21:aload_0         
	//   14   22:aastore         
	//   15   23:dup             
	//   16   24:iconst_1        
	//   17   25:aload_1         
	//   18   26:aastore         
	//   19   27:iload_2         
	//   20   28:aaload          
	//   21   29:astore          4
		}
	//*  22   31:aload           4
	//*  23   33:ifnull          82
	//*  24   36:aload           4
	//*  25   38:invokevirtual   #20  <Method Iterator JSONObject.keys()>
	//*  26   41:astore          5
	//*  27   43:aload           5
	//*  28   45:invokeinterface #26  <Method boolean Iterator.hasNext()>
	//*  29   50:ifeq            82
	//*  30   53:aload           5
	//*  31   55:invokeinterface #30  <Method Object Iterator.next()>
	//*  32   60:checkcast       #32  <Class String>
	//*  33   63:astore          6
	//*  34   65:aload_3         
	//*  35   66:aload           6
	//*  36   68:aload           4
	//*  37   70:aload           6
	//*  38   72:invokevirtual   #36  <Method Object JSONObject.get(String)>
	//*  39   75:invokevirtual   #40  <Method JSONObject JSONObject.put(String, Object)>
	//*  40   78:pop             
	//*  41   79:goto            43
	//*  42   82:iload_2         
	//*  43   83:iconst_1        
	//*  44   84:iadd            
	//*  45   85:istore_2        
	//*  46   86:goto            10
	//*  47   89:aload_3         
	//*  48   90:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  49   91:astore_0        
		{
			return jsonobject2;
	//   50   92:aload_3         
	//   51   93:areturn         
		}
		if(jsonobject3 == null)
			continue; /* Loop/switch isn't completed */
		for(iterator = jsonobject3.keys(); iterator.hasNext(); jsonobject2.put(s, jsonobject3.get(s)))
			s = (String)iterator.next();

		i++;
		  goto _L3
_L2:
		return jsonobject2;
	}
}
