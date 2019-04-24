// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package o:
//			ge, gk, gf

final class gi extends TimerTask
{

	gi(gk gk1, ge ge1)
	{
		a = gk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field gk a>
		e = ge1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field ge e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #17  <Method void TimerTask()>
	//    8   14:return          
	}

	public final void run()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #23  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void JSONObject()>
	//    3    7:astore_1        
		ge ge1;
		try
		{
			jsonobject.put("toastCallBack", "true");
	//    4    8:aload_1         
	//    5    9:ldc1            #26  <String "toastCallBack">
	//    6   11:ldc1            #28  <String "true">
	//    7   13:invokevirtual   #32  <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
		}
	//*   9   17:new             #34  <Class ge>
	//*  10   20:dup             
	//*  11   21:ldc1            #36  <String "callback">
	//*  12   23:invokespecial   #39  <Method void ge(String)>
	//*  13   26:astore_2        
	//*  14   27:aload_2         
	//*  15   28:aload_0         
	//*  16   29:getfield        #14  <Field ge e>
	//*  17   32:getfield        #42  <Field String ge.a>
	//*  18   35:putfield        #42  <Field String ge.a>
	//*  19   38:aload_2         
	//*  20   39:aload_1         
	//*  21   40:putfield        #45  <Field JSONObject ge.e>
	//*  22   43:aload_0         
	//*  23   44:getfield        #12  <Field gk a>
	//*  24   47:getfield        #50  <Field gf gk.a>
	//*  25   50:aload_2         
	//*  26   51:invokeinterface #56  <Method void gf.b(ge)>
	//*  27   56:return          
		catch(JSONException jsonexception) { }
	//   28   57:astore_2        
		ge1 = new ge("callback");
		ge1.a = e.a;
		ge1.e = jsonobject;
		a.a.b(ge1);
	//*  29   58:goto            17
	}

	final gk a;
	final ge e;
}
