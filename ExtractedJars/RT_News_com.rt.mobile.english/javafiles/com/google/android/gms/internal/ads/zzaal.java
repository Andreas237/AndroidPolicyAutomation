// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqw, zzakb

public class zzaal
{

	public zzaal(zzaqw zzaqw1)
	{
		this(zzaqw1, "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #13  <String "">
	//    3    4:invokespecial   #16  <Method void zzaal(zzaqw, String)>
	//    4    7:return          
	}

	public zzaal(zzaqw zzaqw1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzbnd = zzaqw1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field zzaqw zzbnd>
		zzbxf = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field String zzbxf>
	//    8   14:return          
	}

	public final void zza(int i, int j, int k, int l, float f, int i1)
	{
		try
		{
			JSONObject jsonobject = (new JSONObject()).put("width", i).put("height", j).put("maxSizeWidth", k).put("maxSizeHeight", l).put("density", f).put("rotation", i1);
	//    0    0:new             #30  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void JSONObject()>
	//    3    7:ldc1            #33  <String "width">
	//    4    9:iload_1         
	//    5   10:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//    6   13:ldc1            #39  <String "height">
	//    7   15:iload_2         
	//    8   16:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//    9   19:ldc1            #41  <String "maxSizeWidth">
	//   10   21:iload_3         
	//   11   22:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//   12   25:ldc1            #43  <String "maxSizeHeight">
	//   13   27:iload           4
	//   14   29:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//   15   32:ldc1            #45  <String "density">
	//   16   34:fload           5
	//   17   36:f2d             
	//   18   37:invokevirtual   #48  <Method JSONObject JSONObject.put(String, double)>
	//   19   40:ldc1            #50  <String "rotation">
	//   20   42:iload           6
	//   21   44:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//   22   47:astore          7
			zzbnd.zza("onScreenInfoChanged", jsonobject);
	//   23   49:aload_0         
	//   24   50:getfield        #22  <Field zzaqw zzbnd>
	//   25   53:ldc1            #52  <String "onScreenInfoChanged">
	//   26   55:aload           7
	//   27   57:invokeinterface #57  <Method void zzaqw.zza(String, JSONObject)>
			return;
	//   28   62:return          
		}
		catch(JSONException jsonexception)
	//*  29   63:astore          7
		{
			zzakb.zzb("Error occured while obtaining screen information.", ((Throwable) (jsonexception)));
	//   30   65:ldc1            #59  <String "Error occured while obtaining screen information.">
	//   31   67:aload           7
	//   32   69:invokestatic    #65  <Method void zzakb.zzb(String, Throwable)>
		}
	//   33   72:return          
	}

	public final void zzb(int i, int j, int k, int l)
	{
		try
		{
			JSONObject jsonobject = (new JSONObject()).put("x", i).put("y", j).put("width", k).put("height", l);
	//    0    0:new             #30  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void JSONObject()>
	//    3    7:ldc1            #68  <String "x">
	//    4    9:iload_1         
	//    5   10:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//    6   13:ldc1            #70  <String "y">
	//    7   15:iload_2         
	//    8   16:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//    9   19:ldc1            #33  <String "width">
	//   10   21:iload_3         
	//   11   22:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//   12   25:ldc1            #39  <String "height">
	//   13   27:iload           4
	//   14   29:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//   15   32:astore          5
			zzbnd.zza("onSizeChanged", jsonobject);
	//   16   34:aload_0         
	//   17   35:getfield        #22  <Field zzaqw zzbnd>
	//   18   38:ldc1            #72  <String "onSizeChanged">
	//   19   40:aload           5
	//   20   42:invokeinterface #57  <Method void zzaqw.zza(String, JSONObject)>
			return;
	//   21   47:return          
		}
		catch(JSONException jsonexception)
	//*  22   48:astore          5
		{
			zzakb.zzb("Error occured while dispatching size change.", ((Throwable) (jsonexception)));
	//   23   50:ldc1            #74  <String "Error occured while dispatching size change.">
	//   24   52:aload           5
	//   25   54:invokestatic    #65  <Method void zzakb.zzb(String, Throwable)>
		}
	//   26   57:return          
	}

	public final void zzbw(String s)
	{
		try
		{
			s = ((String) ((new JSONObject()).put("message", ((Object) (s))).put("action", ((Object) (zzbxf)))));
	//    0    0:new             #30  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void JSONObject()>
	//    3    7:ldc1            #78  <String "message">
	//    4    9:aload_1         
	//    5   10:invokevirtual   #81  <Method JSONObject JSONObject.put(String, Object)>
	//    6   13:ldc1            #83  <String "action">
	//    7   15:aload_0         
	//    8   16:getfield        #24  <Field String zzbxf>
	//    9   19:invokevirtual   #81  <Method JSONObject JSONObject.put(String, Object)>
	//   10   22:astore_1        
			zzbnd.zza("onError", ((JSONObject) (s)));
	//   11   23:aload_0         
	//   12   24:getfield        #22  <Field zzaqw zzbnd>
	//   13   27:ldc1            #85  <String "onError">
	//   14   29:aload_1         
	//   15   30:invokeinterface #57  <Method void zzaqw.zza(String, JSONObject)>
			return;
	//   16   35:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   36:astore_1        
		{
			zzakb.zzb("Error occurred while dispatching error event.", ((Throwable) (s)));
	//   18   37:ldc1            #87  <String "Error occurred while dispatching error event.">
	//   19   39:aload_1         
	//   20   40:invokestatic    #65  <Method void zzakb.zzb(String, Throwable)>
		}
	//   21   43:return          
	}

	public final void zzbx(String s)
	{
		try
		{
			s = ((String) ((new JSONObject()).put("js", ((Object) (s)))));
	//    0    0:new             #30  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void JSONObject()>
	//    3    7:ldc1            #90  <String "js">
	//    4    9:aload_1         
	//    5   10:invokevirtual   #81  <Method JSONObject JSONObject.put(String, Object)>
	//    6   13:astore_1        
			zzbnd.zza("onReadyEventReceived", ((JSONObject) (s)));
	//    7   14:aload_0         
	//    8   15:getfield        #22  <Field zzaqw zzbnd>
	//    9   18:ldc1            #92  <String "onReadyEventReceived">
	//   10   20:aload_1         
	//   11   21:invokeinterface #57  <Method void zzaqw.zza(String, JSONObject)>
			return;
	//   12   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   27:astore_1        
		{
			zzakb.zzb("Error occured while dispatching ready Event.", ((Throwable) (s)));
	//   14   28:ldc1            #94  <String "Error occured while dispatching ready Event.">
	//   15   30:aload_1         
	//   16   31:invokestatic    #65  <Method void zzakb.zzb(String, Throwable)>
		}
	//   17   34:return          
	}

	public final void zzby(String s)
	{
		try
		{
			s = ((String) ((new JSONObject()).put("state", ((Object) (s)))));
	//    0    0:new             #30  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void JSONObject()>
	//    3    7:ldc1            #97  <String "state">
	//    4    9:aload_1         
	//    5   10:invokevirtual   #81  <Method JSONObject JSONObject.put(String, Object)>
	//    6   13:astore_1        
			zzbnd.zza("onStateChanged", ((JSONObject) (s)));
	//    7   14:aload_0         
	//    8   15:getfield        #22  <Field zzaqw zzbnd>
	//    9   18:ldc1            #99  <String "onStateChanged">
	//   10   20:aload_1         
	//   11   21:invokeinterface #57  <Method void zzaqw.zza(String, JSONObject)>
			return;
	//   12   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   27:astore_1        
		{
			zzakb.zzb("Error occured while dispatching state change.", ((Throwable) (s)));
	//   14   28:ldc1            #101 <String "Error occured while dispatching state change.">
	//   15   30:aload_1         
	//   16   31:invokestatic    #65  <Method void zzakb.zzb(String, Throwable)>
		}
	//   17   34:return          
	}

	public final void zzc(int i, int j, int k, int l)
	{
		try
		{
			JSONObject jsonobject = (new JSONObject()).put("x", i).put("y", j).put("width", k).put("height", l);
	//    0    0:new             #30  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void JSONObject()>
	//    3    7:ldc1            #68  <String "x">
	//    4    9:iload_1         
	//    5   10:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//    6   13:ldc1            #70  <String "y">
	//    7   15:iload_2         
	//    8   16:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//    9   19:ldc1            #33  <String "width">
	//   10   21:iload_3         
	//   11   22:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//   12   25:ldc1            #39  <String "height">
	//   13   27:iload           4
	//   14   29:invokevirtual   #37  <Method JSONObject JSONObject.put(String, int)>
	//   15   32:astore          5
			zzbnd.zza("onDefaultPositionReceived", jsonobject);
	//   16   34:aload_0         
	//   17   35:getfield        #22  <Field zzaqw zzbnd>
	//   18   38:ldc1            #104 <String "onDefaultPositionReceived">
	//   19   40:aload           5
	//   20   42:invokeinterface #57  <Method void zzaqw.zza(String, JSONObject)>
			return;
	//   21   47:return          
		}
		catch(JSONException jsonexception)
	//*  22   48:astore          5
		{
			zzakb.zzb("Error occured while dispatching default position.", ((Throwable) (jsonexception)));
	//   23   50:ldc1            #106 <String "Error occured while dispatching default position.">
	//   24   52:aload           5
	//   25   54:invokestatic    #65  <Method void zzakb.zzb(String, Throwable)>
		}
	//   26   57:return          
	}

	private final zzaqw zzbnd;
	private final String zzbxf;
}
