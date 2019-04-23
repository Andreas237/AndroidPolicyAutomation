// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			fy, ft, fz, gc, 
//			gb, fx

public final class fw
{

	public static fy a(ft ft1, ft ft2)
	{
		fy fy1 = new fy();
	//    0    0:new             #8   <Class fy>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void fy()>
	//    3    7:astore_2        
		if(!ft1.a().equals(((Object) (ft2.a()))))
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #17  <Method String ft.a()>
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #17  <Method String ft.a()>
	//*   8   20:invokevirtual   #23  <Method boolean String.equals(Object)>
	//*   9   23:ifne            32
			fy1.a("");
	//   10   26:aload_2         
	//   11   27:ldc1            #25  <String "">
	//   12   29:invokevirtual   #28  <Method void fy.a(String)>
		return fy1;
	//   13   32:aload_2         
	//   14   33:areturn         
	}

	public static fy a(String s, String s1, fx fx)
	{
		return a(s, s1, a(fx));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #33  <Method gc a(fx)>
	//    4    6:invokestatic    #36  <Method fy a(String, String, gc)>
	//    5    9:areturn         
	}

	public static fy a(String s, String s1, gc gc1)
	{
		s = ((String) (fz.a(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method Object fz.a(String)>
	//    2    4:astore_0        
		s1 = ((String) (fz.a(s1)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #41  <Method Object fz.a(String)>
	//    5    9:astore_1        
		boolean flag = s instanceof JSONObject;
	//    6   10:aload_0         
	//    7   11:instanceof      #43  <Class JSONObject>
	//    8   14:istore_3        
		if(flag && (s1 instanceof JSONObject))
	//*   9   15:iload_3         
	//*  10   16:ifeq            39
	//*  11   19:aload_1         
	//*  12   20:instanceof      #43  <Class JSONObject>
	//*  13   23:ifeq            39
			return a((JSONObject)s, (JSONObject)s1, gc1);
	//   14   26:aload_0         
	//   15   27:checkcast       #43  <Class JSONObject>
	//   16   30:aload_1         
	//   17   31:checkcast       #43  <Class JSONObject>
	//   18   34:aload_2         
	//   19   35:invokestatic    #46  <Method fy a(JSONObject, JSONObject, gc)>
	//   20   38:areturn         
		if((s instanceof JSONArray) && (s1 instanceof JSONArray))
	//*  21   39:aload_0         
	//*  22   40:instanceof      #48  <Class JSONArray>
	//*  23   43:ifeq            66
	//*  24   46:aload_1         
	//*  25   47:instanceof      #48  <Class JSONArray>
	//*  26   50:ifeq            66
			return a((JSONArray)s, (JSONArray)s1, gc1);
	//   27   53:aload_0         
	//   28   54:checkcast       #48  <Class JSONArray>
	//   29   57:aload_1         
	//   30   58:checkcast       #48  <Class JSONArray>
	//   31   61:aload_2         
	//   32   62:invokestatic    #51  <Method fy a(JSONArray, JSONArray, gc)>
	//   33   65:areturn         
		if((s instanceof ft) && (s1 instanceof ft))
	//*  34   66:aload_0         
	//*  35   67:instanceof      #14  <Class ft>
	//*  36   70:ifeq            92
	//*  37   73:aload_1         
	//*  38   74:instanceof      #14  <Class ft>
	//*  39   77:ifeq            92
			return a((ft)s, (ft)s1);
	//   40   80:aload_0         
	//   41   81:checkcast       #14  <Class ft>
	//   42   84:aload_1         
	//   43   85:checkcast       #14  <Class ft>
	//   44   88:invokestatic    #53  <Method fy a(ft, ft)>
	//   45   91:areturn         
		if(flag)
	//*  46   92:iload_3         
	//*  47   93:ifeq            111
			return (new fy()).a("", ((Object) (s)), ((Object) (s1)));
	//   48   96:new             #8   <Class fy>
	//   49   99:dup             
	//   50  100:invokespecial   #12  <Method void fy()>
	//   51  103:ldc1            #25  <String "">
	//   52  105:aload_0         
	//   53  106:aload_1         
	//   54  107:invokevirtual   #56  <Method fy fy.a(String, Object, Object)>
	//   55  110:areturn         
		else
			return (new fy()).a("", ((Object) (s)), ((Object) (s1)));
	//   56  111:new             #8   <Class fy>
	//   57  114:dup             
	//   58  115:invokespecial   #12  <Method void fy()>
	//   59  118:ldc1            #25  <String "">
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:invokevirtual   #56  <Method fy fy.a(String, Object, Object)>
	//   63  125:areturn         
	}

	public static fy a(JSONArray jsonarray, JSONArray jsonarray1, gc gc1)
	{
		return gc1.a(jsonarray, jsonarray1);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokeinterface #61  <Method fy gc.a(JSONArray, JSONArray)>
	//    4    8:areturn         
	}

	public static fy a(JSONObject jsonobject, JSONObject jsonobject1, fx fx)
	{
		return a(jsonobject, jsonobject1, a(fx));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #33  <Method gc a(fx)>
	//    4    6:invokestatic    #46  <Method fy a(JSONObject, JSONObject, gc)>
	//    5    9:areturn         
	}

	public static fy a(JSONObject jsonobject, JSONObject jsonobject1, gc gc1)
	{
		return gc1.a(jsonobject, jsonobject1);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokeinterface #65  <Method fy gc.a(JSONObject, JSONObject)>
	//    4    8:areturn         
	}

	private static gc a(fx fx)
	{
		return ((gc) (new gb(fx)));
	//    0    0:new             #67  <Class gb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #70  <Method void gb(fx)>
	//    4    8:areturn         
	}
}
