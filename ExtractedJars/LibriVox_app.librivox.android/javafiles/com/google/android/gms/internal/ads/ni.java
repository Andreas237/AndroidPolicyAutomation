// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			afn, wx

public class ni
{

	public ni(afn afn1)
	{
		this(afn1, "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #13  <String "">
	//    3    4:invokespecial   #16  <Method void ni(afn, String)>
	//    4    7:return          
	}

	public ni(afn afn1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = afn1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field afn a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field String b>
	//    8   14:return          
	}

	public final void a(int i, int j, int k, int l)
	{
		try
		{
			JSONObject jsonobject = (new JSONObject()).put("x", i).put("y", j).put("width", k).put("height", l);
	//    0    0:new             #29  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void JSONObject()>
	//    3    7:ldc1            #32  <String "x">
	//    4    9:iload_1         
	//    5   10:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//    6   13:ldc1            #38  <String "y">
	//    7   15:iload_2         
	//    8   16:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//    9   19:ldc1            #40  <String "width">
	//   10   21:iload_3         
	//   11   22:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//   12   25:ldc1            #42  <String "height">
	//   13   27:iload           4
	//   14   29:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//   15   32:astore          5
			a.a("onSizeChanged", jsonobject);
	//   16   34:aload_0         
	//   17   35:getfield        #22  <Field afn a>
	//   18   38:ldc1            #44  <String "onSizeChanged">
	//   19   40:aload           5
	//   20   42:invokeinterface #49  <Method void afn.a(String, JSONObject)>
			return;
	//   21   47:return          
		}
		catch(JSONException jsonexception)
	//*  22   48:astore          5
		{
			wx.b("Error occured while dispatching size change.", ((Throwable) (jsonexception)));
	//   23   50:ldc1            #51  <String "Error occured while dispatching size change.">
	//   24   52:aload           5
	//   25   54:invokestatic    #56  <Method void wx.b(String, Throwable)>
		}
	//   26   57:return          
	}

	public final void a(int i, int j, int k, int l, float f, int i1)
	{
		try
		{
			JSONObject jsonobject = (new JSONObject()).put("width", i).put("height", j).put("maxSizeWidth", k).put("maxSizeHeight", l).put("density", f).put("rotation", i1);
	//    0    0:new             #29  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void JSONObject()>
	//    3    7:ldc1            #40  <String "width">
	//    4    9:iload_1         
	//    5   10:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//    6   13:ldc1            #42  <String "height">
	//    7   15:iload_2         
	//    8   16:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//    9   19:ldc1            #59  <String "maxSizeWidth">
	//   10   21:iload_3         
	//   11   22:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//   12   25:ldc1            #61  <String "maxSizeHeight">
	//   13   27:iload           4
	//   14   29:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//   15   32:ldc1            #63  <String "density">
	//   16   34:fload           5
	//   17   36:f2d             
	//   18   37:invokevirtual   #66  <Method JSONObject JSONObject.put(String, double)>
	//   19   40:ldc1            #68  <String "rotation">
	//   20   42:iload           6
	//   21   44:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//   22   47:astore          7
			a.a("onScreenInfoChanged", jsonobject);
	//   23   49:aload_0         
	//   24   50:getfield        #22  <Field afn a>
	//   25   53:ldc1            #70  <String "onScreenInfoChanged">
	//   26   55:aload           7
	//   27   57:invokeinterface #49  <Method void afn.a(String, JSONObject)>
			return;
	//   28   62:return          
		}
		catch(JSONException jsonexception)
	//*  29   63:astore          7
		{
			wx.b("Error occured while obtaining screen information.", ((Throwable) (jsonexception)));
	//   30   65:ldc1            #72  <String "Error occured while obtaining screen information.">
	//   31   67:aload           7
	//   32   69:invokestatic    #56  <Method void wx.b(String, Throwable)>
		}
	//   33   72:return          
	}

	public final void a(String s)
	{
		try
		{
			s = ((String) ((new JSONObject()).put("message", ((Object) (s))).put("action", ((Object) (b)))));
	//    0    0:new             #29  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void JSONObject()>
	//    3    7:ldc1            #75  <String "message">
	//    4    9:aload_1         
	//    5   10:invokevirtual   #78  <Method JSONObject JSONObject.put(String, Object)>
	//    6   13:ldc1            #80  <String "action">
	//    7   15:aload_0         
	//    8   16:getfield        #24  <Field String b>
	//    9   19:invokevirtual   #78  <Method JSONObject JSONObject.put(String, Object)>
	//   10   22:astore_1        
			a.a("onError", ((JSONObject) (s)));
	//   11   23:aload_0         
	//   12   24:getfield        #22  <Field afn a>
	//   13   27:ldc1            #82  <String "onError">
	//   14   29:aload_1         
	//   15   30:invokeinterface #49  <Method void afn.a(String, JSONObject)>
			return;
	//   16   35:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   36:astore_1        
		{
			wx.b("Error occurred while dispatching error event.", ((Throwable) (s)));
	//   18   37:ldc1            #84  <String "Error occurred while dispatching error event.">
	//   19   39:aload_1         
	//   20   40:invokestatic    #56  <Method void wx.b(String, Throwable)>
		}
	//   21   43:return          
	}

	public final void b(int i, int j, int k, int l)
	{
		try
		{
			JSONObject jsonobject = (new JSONObject()).put("x", i).put("y", j).put("width", k).put("height", l);
	//    0    0:new             #29  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void JSONObject()>
	//    3    7:ldc1            #32  <String "x">
	//    4    9:iload_1         
	//    5   10:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//    6   13:ldc1            #38  <String "y">
	//    7   15:iload_2         
	//    8   16:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//    9   19:ldc1            #40  <String "width">
	//   10   21:iload_3         
	//   11   22:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//   12   25:ldc1            #42  <String "height">
	//   13   27:iload           4
	//   14   29:invokevirtual   #36  <Method JSONObject JSONObject.put(String, int)>
	//   15   32:astore          5
			a.a("onDefaultPositionReceived", jsonobject);
	//   16   34:aload_0         
	//   17   35:getfield        #22  <Field afn a>
	//   18   38:ldc1            #86  <String "onDefaultPositionReceived">
	//   19   40:aload           5
	//   20   42:invokeinterface #49  <Method void afn.a(String, JSONObject)>
			return;
	//   21   47:return          
		}
		catch(JSONException jsonexception)
	//*  22   48:astore          5
		{
			wx.b("Error occured while dispatching default position.", ((Throwable) (jsonexception)));
	//   23   50:ldc1            #88  <String "Error occured while dispatching default position.">
	//   24   52:aload           5
	//   25   54:invokestatic    #56  <Method void wx.b(String, Throwable)>
		}
	//   26   57:return          
	}

	public final void b(String s)
	{
		try
		{
			s = ((String) ((new JSONObject()).put("js", ((Object) (s)))));
	//    0    0:new             #29  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void JSONObject()>
	//    3    7:ldc1            #90  <String "js">
	//    4    9:aload_1         
	//    5   10:invokevirtual   #78  <Method JSONObject JSONObject.put(String, Object)>
	//    6   13:astore_1        
			a.a("onReadyEventReceived", ((JSONObject) (s)));
	//    7   14:aload_0         
	//    8   15:getfield        #22  <Field afn a>
	//    9   18:ldc1            #92  <String "onReadyEventReceived">
	//   10   20:aload_1         
	//   11   21:invokeinterface #49  <Method void afn.a(String, JSONObject)>
			return;
	//   12   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   27:astore_1        
		{
			wx.b("Error occured while dispatching ready Event.", ((Throwable) (s)));
	//   14   28:ldc1            #94  <String "Error occured while dispatching ready Event.">
	//   15   30:aload_1         
	//   16   31:invokestatic    #56  <Method void wx.b(String, Throwable)>
		}
	//   17   34:return          
	}

	public final void c(String s)
	{
		try
		{
			s = ((String) ((new JSONObject()).put("state", ((Object) (s)))));
	//    0    0:new             #29  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void JSONObject()>
	//    3    7:ldc1            #97  <String "state">
	//    4    9:aload_1         
	//    5   10:invokevirtual   #78  <Method JSONObject JSONObject.put(String, Object)>
	//    6   13:astore_1        
			a.a("onStateChanged", ((JSONObject) (s)));
	//    7   14:aload_0         
	//    8   15:getfield        #22  <Field afn a>
	//    9   18:ldc1            #99  <String "onStateChanged">
	//   10   20:aload_1         
	//   11   21:invokeinterface #49  <Method void afn.a(String, JSONObject)>
			return;
	//   12   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   27:astore_1        
		{
			wx.b("Error occured while dispatching state change.", ((Throwable) (s)));
	//   14   28:ldc1            #101 <String "Error occured while dispatching state change.">
	//   15   30:aload_1         
	//   16   31:invokestatic    #56  <Method void wx.b(String, Throwable)>
		}
	//   17   34:return          
	}

	private final afn a;
	private final String b;
}
