// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.JSONObject;

// Referenced classes of package bo.app:
//			gn, gp, go

public class gm
{

	public static void a(JSONObject jsonobject, JSONObject jsonobject1, go go)
	{
		jsonobject = ((JSONObject) (gn.a(jsonobject, jsonobject1, go)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #11  <Method gp gn.a(JSONObject, JSONObject, go)>
	//    4    6:astore_0        
		if(!((gp) (jsonobject)).b())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #17  <Method boolean gp.b()>
	//*   7   11:ifne            15
			return;
	//    8   14:return          
		else
			throw new AssertionError(((Object) (((gp) (jsonobject)).c())));
	//    9   15:new             #19  <Class AssertionError>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokevirtual   #23  <Method String gp.c()>
	//   13   23:invokespecial   #27  <Method void AssertionError(Object)>
	//   14   26:athrow          
	}
}
