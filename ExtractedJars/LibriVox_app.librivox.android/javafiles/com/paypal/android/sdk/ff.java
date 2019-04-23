// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import java.util.ArrayList;
import org.json.*;

// Referenced classes of package com.paypal.android.sdk:
//			fv, fc, fa, fj

public final class ff
	implements fv
{

	private ff(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = fa.a(fc.aC);
	//    2    4:aload_0         
	//    3    5:getstatic       #21  <Field fc fc.aC>
	//    4    8:invokestatic    #26  <Method String fa.a(fc)>
	//    5   11:putfield        #28  <Field String a>
		b = new fj(jsonobject.optJSONArray("funding_sources"), jsonobject.optJSONObject("backup_funding_instrument"));
	//    6   14:aload_0         
	//    7   15:new             #30  <Class fj>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:ldc1            #32  <String "funding_sources">
	//   11   22:invokevirtual   #38  <Method JSONArray JSONObject.optJSONArray(String)>
	//   12   25:aload_1         
	//   13   26:ldc1            #40  <String "backup_funding_instrument">
	//   14   28:invokevirtual   #44  <Method JSONObject JSONObject.optJSONObject(String)>
	//   15   31:invokespecial   #47  <Method void fj(JSONArray, JSONObject)>
	//   16   34:putfield        #49  <Field fj b>
	//   17   37:return          
	}

	public static ArrayList a(JSONObject jsonobject, JSONArray jsonarray)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #55  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void ArrayList()>
	//    3    7:astore_3        
		if(jsonobject != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          34
		{
			jsonobject = ((JSONObject) (new ff(jsonobject)));
	//    6   12:new             #2   <Class ff>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #58  <Method void ff(JSONObject)>
	//   10   20:astore_0        
			if(((ff) (jsonobject)).h())
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #62  <Method boolean h()>
	//*  13   25:ifeq            34
				arraylist.add(((Object) (jsonobject)));
	//   14   28:aload_3         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #66  <Method boolean ArrayList.add(Object)>
	//   17   33:pop             
		}
		if(jsonarray != null)
	//*  18   34:aload_1         
	//*  19   35:ifnull          81
		{
			int i = 0;
	//   20   38:iconst_0        
	//   21   39:istore_2        
			while(i < jsonarray.length()) 
	//*  22   40:iload_2         
	//*  23   41:aload_1         
	//*  24   42:invokevirtual   #72  <Method int JSONArray.length()>
	//*  25   45:icmpge          81
			{
				try
				{
					jsonobject = ((JSONObject) (new ff(jsonarray.getJSONObject(i))));
	//   26   48:new             #2   <Class ff>
	//   27   51:dup             
	//   28   52:aload_1         
	//   29   53:iload_2         
	//   30   54:invokevirtual   #76  <Method JSONObject JSONArray.getJSONObject(int)>
	//   31   57:invokespecial   #58  <Method void ff(JSONObject)>
	//   32   60:astore_0        
					if(((ff) (jsonobject)).h())
	//*  33   61:aload_0         
	//*  34   62:invokespecial   #62  <Method boolean h()>
	//*  35   65:ifeq            74
						arraylist.add(((Object) (jsonobject)));
	//   36   68:aload_3         
	//   37   69:aload_0         
	//   38   70:invokevirtual   #66  <Method boolean ArrayList.add(Object)>
	//   39   73:pop             
				}
	//*  40   74:iload_2         
	//*  41   75:iconst_1        
	//*  42   76:iadd            
	//*  43   77:istore_2        
	//*  44   78:goto            40
	//*  45   81:aload_3         
	//*  46   82:areturn         
				// Misplaced declaration of an exception variable
				catch(JSONObject jsonobject) { }
	//   47   83:astore_0        
				i++;
			}
		}
		return arraylist;
	//*  48   84:goto            74
	}

	private boolean h()
	{
		return b.e() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field fj b>
	//    2    4:invokevirtual   #79  <Method int fj.e()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final String a()
	{
		return b.d();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field fj b>
	//    2    4:invokevirtual   #83  <Method String fj.d()>
	//    3    7:areturn         
	}

	public final String b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String a>
	//    2    4:areturn         
	}

	public final String c()
	{
		return b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field fj b>
	//    2    4:invokevirtual   #86  <Method String fj.a()>
	//    3    7:areturn         
	}

	public final String d()
	{
		return b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field fj b>
	//    2    4:invokevirtual   #88  <Method String fj.c()>
	//    3    7:areturn         
	}

	public final boolean e()
	{
		return b.b();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field fj b>
	//    2    4:invokevirtual   #90  <Method boolean fj.b()>
	//    3    7:ireturn         
	}

	public final fj f()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field fj b>
	//    2    4:areturn         
	}

	public final boolean g()
	{
		return b.e() == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field fj b>
	//    2    4:invokevirtual   #79  <Method int fj.e()>
	//    3    7:iconst_1        
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private String a;
	private fj b;
}
