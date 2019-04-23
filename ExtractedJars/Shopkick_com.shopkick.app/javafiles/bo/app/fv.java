// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.JSONObject;

// Referenced classes of package bo.app:
//			fw, fy, fx

public class fv
{

	public static void a(JSONObject jsonobject, JSONObject jsonobject1, fx fx)
	{
		jsonobject = ((JSONObject) (fw.a(jsonobject, jsonobject1, fx)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #11  <Method fy fw.a(JSONObject, JSONObject, fx)>
	//    4    6:astore_0        
		if(!((fy) (jsonobject)).b())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #17  <Method boolean fy.b()>
	//*   7   11:ifne            15
			return;
	//    8   14:return          
		else
			throw new AssertionError(((Object) (((fy) (jsonobject)).c())));
	//    9   15:new             #19  <Class AssertionError>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokevirtual   #23  <Method String fy.c()>
	//   13   23:invokespecial   #27  <Method void AssertionError(Object)>
	//   14   26:athrow          
	}
}
