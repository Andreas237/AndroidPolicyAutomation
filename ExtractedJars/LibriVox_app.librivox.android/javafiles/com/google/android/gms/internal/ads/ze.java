// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zf, zg

public final class ze
{

	public static List a(JSONArray jsonarray, List list)
	{
		list = ((List) (new ArrayList()));
	//    0    0:new             #20  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ArrayList()>
	//    3    7:astore_1        
		if(jsonarray == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return list;
	//    6   12:aload_1         
	//    7   13:areturn         
		for(int i = 0; i < jsonarray.length(); i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #27  <Method int JSONArray.length()>
	//*  13   21:icmpge          43
			list.add(((Object) (jsonarray.getString(i))));
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokevirtual   #31  <Method String JSONArray.getString(int)>
	//   18   30:invokeinterface #37  <Method boolean List.add(Object)>
	//   19   35:pop             

	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_2        
	//*  24   40:goto            16
		return list;
	//   25   43:aload_1         
	//   26   44:areturn         
	}

	public static transient JSONObject a(JSONObject jsonobject, String as[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		JSONObject jsonobject1;
		do
		{
			jsonobject1 = jsonobject;
	//    2    2:aload_0         
	//    3    3:astore_3        
			if(i >= as.length - 1)
				break;
	//    4    4:iload_2         
	//    5    5:aload_1         
	//    6    6:arraylength     
	//    7    7:iconst_1        
	//    8    8:isub            
	//    9    9:icmpge          36
			if(jsonobject == null)
	//*  10   12:aload_0         
	//*  11   13:ifnonnull       21
			{
				jsonobject1 = null;
	//   12   16:aconst_null     
	//   13   17:astore_3        
				break;
	//   14   18:goto            36
			}
			jsonobject = jsonobject.optJSONObject(as[i]);
	//   15   21:aload_0         
	//   16   22:aload_1         
	//   17   23:iload_2         
	//   18   24:aaload          
	//   19   25:invokevirtual   #44  <Method JSONObject JSONObject.optJSONObject(String)>
	//   20   28:astore_0        
			i++;
	//   21   29:iload_2         
	//   22   30:iconst_1        
	//   23   31:iadd            
	//   24   32:istore_2        
		} while(true);
	//   25   33:goto            2
		if(jsonobject1 == null)
	//*  26   36:aload_3         
	//*  27   37:ifnonnull       42
			return null;
	//   28   40:aconst_null     
	//   29   41:areturn         
		else
			return jsonobject1.optJSONObject(as[as.length - 1]);
	//   30   42:aload_3         
	//   31   43:aload_1         
	//   32   44:aload_1         
	//   33   45:arraylength     
	//   34   46:iconst_1        
	//   35   47:isub            
	//   36   48:aaload          
	//   37   49:invokevirtual   #44  <Method JSONObject JSONObject.optJSONObject(String)>
	//   38   52:areturn         
	}

	private static final zg a = new zf();

	static 
	{
	//    0    0:new             #11  <Class zf>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void zf()>
	//    3    7:putstatic       #16  <Field zg a>
	//*   4   10:return          
	}
}
