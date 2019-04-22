// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import org.json.*;

// Referenced classes of package com.facebook.share.internal:
//			CameraEffectJSONUtility

static final class CameraEffectJSONUtility$3
	implements tter
{

	public void setOnArgumentsBuilder(com.facebook.share.model.der der, String s, Object obj)
		throws JSONException
	{
		JSONArray jsonarray = (JSONArray)obj;
	//    0    0:aload_3         
	//    1    1:checkcast       #19  <Class JSONArray>
	//    2    4:astore          5
		String as[] = new String[jsonarray.length()];
	//    3    6:aload           5
	//    4    8:invokevirtual   #23  <Method int JSONArray.length()>
	//    5   11:anewarray       String[]
	//    6   14:astore          6
		for(int i = 0; i < jsonarray.length();)
	//*   7   16:iconst_0        
	//*   8   17:istore          4
	//*   9   19:iload           4
	//*  10   21:aload           5
	//*  11   23:invokevirtual   #23  <Method int JSONArray.length()>
	//*  12   26:icmpge          98
		{
			obj = jsonarray.get(i);
	//   13   29:aload           5
	//   14   31:iload           4
	//   15   33:invokevirtual   #29  <Method Object JSONArray.get(int)>
	//   16   36:astore_3        
			if(obj instanceof String)
	//*  17   37:aload_3         
	//*  18   38:instanceof      #25  <Class String>
	//*  19   41:ifeq            62
			{
				as[i] = (String)obj;
	//   20   44:aload           6
	//   21   46:iload           4
	//   22   48:aload_3         
	//   23   49:checkcast       #25  <Class String>
	//   24   52:aastore         
				i++;
	//   25   53:iload           4
	//   26   55:iconst_1        
	//   27   56:iadd            
	//   28   57:istore          4
			} else
	//*  29   59:goto            19
			{
				der = ((com.facebook.share.model.der) (new StringBuilder()));
	//   30   62:new             #31  <Class StringBuilder>
	//   31   65:dup             
	//   32   66:invokespecial   #32  <Method void StringBuilder()>
	//   33   69:astore_1        
				((StringBuilder) (der)).append("Unexpected type in an array: ");
	//   34   70:aload_1         
	//   35   71:ldc1            #34  <String "Unexpected type in an array: ">
	//   36   73:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
				((StringBuilder) (der)).append(((Object) (obj.getClass())));
	//   38   77:aload_1         
	//   39   78:aload_3         
	//   40   79:invokevirtual   #42  <Method Class Object.getClass()>
	//   41   82:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   42   85:pop             
				throw new IllegalArgumentException(((StringBuilder) (der)).toString());
	//   43   86:new             #47  <Class IllegalArgumentException>
	//   44   89:dup             
	//   45   90:aload_1         
	//   46   91:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   47   94:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   48   97:athrow          
			}
		}

		der.putArgument(s, as);
	//   49   98:aload_1         
	//   50   99:aload_2         
	//   51  100:aload           6
	//   52  102:invokevirtual   #60  <Method com.facebook.share.model.CameraEffectArguments$Builder com.facebook.share.model.CameraEffectArguments$Builder.putArgument(String, String[])>
	//   53  105:pop             
	//   54  106:return          
	}

	public void setOnJSON(JSONObject jsonobject, String s, Object obj)
		throws JSONException
	{
		throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
	//    0    0:new             #47  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #65  <String "JSONArray's are not supported in bundles.">
	//    3    6:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	CameraEffectJSONUtility$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
