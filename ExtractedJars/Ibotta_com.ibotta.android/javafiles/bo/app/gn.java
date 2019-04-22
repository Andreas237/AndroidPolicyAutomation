// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			gp, gk, gq, gt, 
//			gs, go

public final class gn
{

	public static gp a(gk gk1, gk gk2)
	{
		gp gp1 = new gp();
	//    0    0:new             #8   <Class gp>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void gp()>
	//    3    7:astore_2        
		if(!gk1.a().equals(((Object) (gk2.a()))))
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #17  <Method String gk.a()>
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #17  <Method String gk.a()>
	//*   8   20:invokevirtual   #23  <Method boolean String.equals(Object)>
	//*   9   23:ifne            32
			gp1.a("");
	//   10   26:aload_2         
	//   11   27:ldc1            #25  <String "">
	//   12   29:invokevirtual   #28  <Method void gp.a(String)>
		return gp1;
	//   13   32:aload_2         
	//   14   33:areturn         
	}

	public static gp a(String s, String s1, go go)
	{
		return a(s, s1, a(go));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #33  <Method gt a(go)>
	//    4    6:invokestatic    #36  <Method gp a(String, String, gt)>
	//    5    9:areturn         
	}

	public static gp a(String s, String s1, gt gt1)
	{
		s = ((String) (gq.a(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method Object gq.a(String)>
	//    2    4:astore_0        
		s1 = ((String) (gq.a(s1)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #41  <Method Object gq.a(String)>
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
			return a((JSONObject)s, (JSONObject)s1, gt1);
	//   14   26:aload_0         
	//   15   27:checkcast       #43  <Class JSONObject>
	//   16   30:aload_1         
	//   17   31:checkcast       #43  <Class JSONObject>
	//   18   34:aload_2         
	//   19   35:invokestatic    #46  <Method gp a(JSONObject, JSONObject, gt)>
	//   20   38:areturn         
		if((s instanceof JSONArray) && (s1 instanceof JSONArray))
	//*  21   39:aload_0         
	//*  22   40:instanceof      #48  <Class JSONArray>
	//*  23   43:ifeq            66
	//*  24   46:aload_1         
	//*  25   47:instanceof      #48  <Class JSONArray>
	//*  26   50:ifeq            66
			return a((JSONArray)s, (JSONArray)s1, gt1);
	//   27   53:aload_0         
	//   28   54:checkcast       #48  <Class JSONArray>
	//   29   57:aload_1         
	//   30   58:checkcast       #48  <Class JSONArray>
	//   31   61:aload_2         
	//   32   62:invokestatic    #51  <Method gp a(JSONArray, JSONArray, gt)>
	//   33   65:areturn         
		if((s instanceof gk) && (s1 instanceof gk))
	//*  34   66:aload_0         
	//*  35   67:instanceof      #14  <Class gk>
	//*  36   70:ifeq            92
	//*  37   73:aload_1         
	//*  38   74:instanceof      #14  <Class gk>
	//*  39   77:ifeq            92
			return a((gk)s, (gk)s1);
	//   40   80:aload_0         
	//   41   81:checkcast       #14  <Class gk>
	//   42   84:aload_1         
	//   43   85:checkcast       #14  <Class gk>
	//   44   88:invokestatic    #53  <Method gp a(gk, gk)>
	//   45   91:areturn         
		if(flag)
	//*  46   92:iload_3         
	//*  47   93:ifeq            111
			return (new gp()).a("", ((Object) (s)), ((Object) (s1)));
	//   48   96:new             #8   <Class gp>
	//   49   99:dup             
	//   50  100:invokespecial   #12  <Method void gp()>
	//   51  103:ldc1            #25  <String "">
	//   52  105:aload_0         
	//   53  106:aload_1         
	//   54  107:invokevirtual   #56  <Method gp gp.a(String, Object, Object)>
	//   55  110:areturn         
		else
			return (new gp()).a("", ((Object) (s)), ((Object) (s1)));
	//   56  111:new             #8   <Class gp>
	//   57  114:dup             
	//   58  115:invokespecial   #12  <Method void gp()>
	//   59  118:ldc1            #25  <String "">
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:invokevirtual   #56  <Method gp gp.a(String, Object, Object)>
	//   63  125:areturn         
	}

	public static gp a(JSONArray jsonarray, JSONArray jsonarray1, gt gt1)
	{
		return gt1.a(jsonarray, jsonarray1);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokeinterface #61  <Method gp gt.a(JSONArray, JSONArray)>
	//    4    8:areturn         
	}

	public static gp a(JSONObject jsonobject, JSONObject jsonobject1, go go)
	{
		return a(jsonobject, jsonobject1, a(go));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #33  <Method gt a(go)>
	//    4    6:invokestatic    #46  <Method gp a(JSONObject, JSONObject, gt)>
	//    5    9:areturn         
	}

	public static gp a(JSONObject jsonobject, JSONObject jsonobject1, gt gt1)
	{
		return gt1.a(jsonobject, jsonobject1);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokeinterface #65  <Method gp gt.a(JSONObject, JSONObject)>
	//    4    8:areturn         
	}

	private static gt a(go go)
	{
		return ((gt) (new gs(go)));
	//    0    0:new             #67  <Class gs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #70  <Method void gs(go)>
	//    4    8:areturn         
	}
}
